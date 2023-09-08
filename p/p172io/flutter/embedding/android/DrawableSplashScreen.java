package p172io.flutter.embedding.android;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

@Deprecated
/* renamed from: io.flutter.embedding.android.DrawableSplashScreen */
public final class DrawableSplashScreen implements SplashScreen {
    private final long crossfadeDurationInMillis;
    private final Drawable drawable;
    private final ImageView.ScaleType scaleType;
    private DrawableSplashScreenView splashView;

    /* renamed from: io.flutter.embedding.android.DrawableSplashScreen$DrawableSplashScreenView */
    public static class DrawableSplashScreenView extends ImageView {
        public DrawableSplashScreenView(Context context) {
            this(context, (AttributeSet) null, 0);
        }

        public void setSplashDrawable(Drawable drawable) {
            setSplashDrawable(drawable, ImageView.ScaleType.FIT_XY);
        }

        public DrawableSplashScreenView(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public void setSplashDrawable(Drawable drawable, ImageView.ScaleType scaleType) {
            setScaleType(scaleType);
            setImageDrawable(drawable);
        }

        public DrawableSplashScreenView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }
    }

    public DrawableSplashScreen(Drawable drawable2) {
        this(drawable2, ImageView.ScaleType.FIT_XY, 500);
    }

    public View createSplashView(Context context, Bundle bundle) {
        DrawableSplashScreenView drawableSplashScreenView = new DrawableSplashScreenView(context);
        this.splashView = drawableSplashScreenView;
        drawableSplashScreenView.setSplashDrawable(this.drawable, this.scaleType);
        return this.splashView;
    }

    public boolean doesSplashViewRememberItsTransition() {
        return false;
    }

    public Bundle saveSplashScreenState() {
        return null;
    }

    public void transitionToFlutter(final Runnable runnable) {
        DrawableSplashScreenView drawableSplashScreenView = this.splashView;
        if (drawableSplashScreenView == null) {
            runnable.run();
        } else {
            drawableSplashScreenView.animate().alpha(0.0f).setDuration(this.crossfadeDurationInMillis).setListener(new Animator.AnimatorListener() {
                public void onAnimationCancel(Animator animator) {
                    runnable.run();
                }

                public void onAnimationEnd(Animator animator) {
                    runnable.run();
                }

                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationStart(Animator animator) {
                }
            });
        }
    }

    public DrawableSplashScreen(Drawable drawable2, ImageView.ScaleType scaleType2, long j) {
        this.drawable = drawable2;
        this.scaleType = scaleType2;
        this.crossfadeDurationInMillis = j;
    }
}
