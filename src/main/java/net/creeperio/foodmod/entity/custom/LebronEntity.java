package net.creeperio.foodmod.entity.custom;

import net.creeperio.foodmod.entity.animations.ModAnimationsDefinition;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.animal.Turtle;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class LebronEntity extends Monster {
    public LebronEntity(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public final AnimationState idleAnimationState = new AnimationState();
    //public final AnimationState walkAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    @Override
    public void tick() {
        super.tick();

        if(this.level().isClientSide()) {
            setupAnimationStates();
        }
    }

    private void setupAnimationStates() {
        if (idleAnimationTimeout <= 0) {
                //this.idleAnimationTimeout = this.random.nextInt(40) + 80;
                this.idleAnimationTimeout = 40; //40 makes for the 2 seconds the animation lasts
            //the random int would just make the pause between
            this.idleAnimationState.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout;
    }

        /*if (!walkAnimation.isMoving()) {
            if (idleAnimationTimeout <= 0) {
                //this.idleAnimationTimeout = this.random.nextInt(40) + 80;
                this.idleAnimationTimeout = 40; //40 makes for the 2 seconds the animation lasts
                //the random int would just make the pause between
                this.idleAnimationState.start(this.tickCount);
            } else {
                --this.idleAnimationTimeout;
            }
        }

        if (walkAnimation.isMoving()) {
            idleAnimationState.stop();
            idleAnimationTimeout = 1;
        }*/
    }

    @Override
    protected void updateWalkAnimation(float pPartialTick) {
        float f;
        if (this.getPose() == Pose.STANDING) {
            f = Math.min(pPartialTick * 6F, 1F);
        } else {
            f = 0F;
        }
        this.walkAnimation.update(f, 0.2F);
    }

    @Override
    protected void registerGoals() {
        //Float in water
        this.goalSelector.addGoal(0,
                new FloatGoal(this));

        //Look at player or around randomly
        this.goalSelector.addGoal(3,
                new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(3,
                new RandomLookAroundGoal(this));
        this.addBehaviourGoals();
    }

    protected void addBehaviourGoals() {
        //Attack player
        this.targetSelector.addGoal(1,
                new NearestAttackableTargetGoal<>(this, Player.class, true));
        //Water avoiding random stroll (IDK what it is, but it probably makes it walk around water)
        this.goalSelector.addGoal(2,
                new WaterAvoidingRandomStrollGoal(this, 1.0));
    }

    public static AttributeSupplier.Builder createAttributes()
    {
        return Monster.createMonsterAttributes()
                //.add(Attributes.MAX_HEALTH, 20D)
                .add(Attributes.FOLLOW_RANGE, 35.0)
                .add(Attributes.MOVEMENT_SPEED, 0.23F)
                .add(Attributes.ATTACK_DAMAGE, 3.0)
                .add(Attributes.ATTACK_KNOCKBACK, 0.5F)
                .add(Attributes.ARMOR, 2.0)
                //IDK what this does it was just in the zombie class
                .add(Attributes.SPAWN_REINFORCEMENTS_CHANCE)
    ;}
}
