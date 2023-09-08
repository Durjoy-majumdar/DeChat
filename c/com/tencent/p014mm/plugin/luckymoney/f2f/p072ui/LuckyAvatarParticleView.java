package com.tencent.p014mm.plugin.luckymoney.f2f.p072ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyAvatarParticleView */
public class LuckyAvatarParticleView extends View {

    /* renamed from: d */
    public List<Rect> f198871d = new ArrayList();

    /* renamed from: e */
    public List<Integer> f198872e = new ArrayList();

    /* renamed from: f */
    public List<Integer> f198873f = new ArrayList();

    /* renamed from: g */
    public long f198874g;

    /* renamed from: h */
    public Paint f198875h = new Paint();

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyAvatarParticleView$a */
    public class C69145a implements ValueAnimator.AnimatorUpdateListener {
        public C69145a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (((Float) valueAnimator.getAnimatedValue()).floatValue() == 1.0f) {
                ((ArrayList) LuckyAvatarParticleView.this.f198871d).clear();
                ((ArrayList) LuckyAvatarParticleView.this.f198872e).clear();
                ((ArrayList) LuckyAvatarParticleView.this.f198873f).clear();
            } else if (((Float) valueAnimator.getAnimatedValue()).floatValue() == 0.0f) {
                LuckyAvatarParticleView.m81485a(LuckyAvatarParticleView.this, 40);
            } else {
                for (int i = 0; i < ((ArrayList) LuckyAvatarParticleView.this.f198871d).size(); i++) {
                    LuckyAvatarParticleView luckyAvatarParticleView = LuckyAvatarParticleView.this;
                    Rect rect = (Rect) ((ArrayList) luckyAvatarParticleView.f198871d).get(i);
                    int width = rect.width();
                    if (Math.abs(0 - rect.left) > ((Integer) ((ArrayList) luckyAvatarParticleView.f198872e).get(i)).intValue()) {
                        int i2 = rect.left;
                        if (i2 < 0) {
                            rect.left = i2 + ((Integer) ((ArrayList) luckyAvatarParticleView.f198872e).get(i)).intValue();
                        } else if (i2 > 0) {
                            rect.left = i2 - ((Integer) ((ArrayList) luckyAvatarParticleView.f198872e).get(i)).intValue();
                        }
                    } else {
                        rect.left = 0;
                    }
                    rect.right = rect.left + width;
                    if (Math.abs(0 - rect.top) > ((Integer) ((ArrayList) luckyAvatarParticleView.f198873f).get(i)).intValue()) {
                        int i3 = rect.top;
                        if (i3 < 0) {
                            rect.top = i3 + ((Integer) ((ArrayList) luckyAvatarParticleView.f198873f).get(i)).intValue();
                        } else if (i3 > 0) {
                            rect.top = i3 - ((Integer) ((ArrayList) luckyAvatarParticleView.f198873f).get(i)).intValue();
                        }
                    } else {
                        rect.top = 0;
                    }
                    rect.bottom = rect.top + width;
                }
            }
            LuckyAvatarParticleView.this.invalidate();
        }
    }

    public LuckyAvatarParticleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public static void m81485a(LuckyAvatarParticleView luckyAvatarParticleView, int i) {
        luckyAvatarParticleView.getClass();
        int i2 = i / 2;
        for (int i3 = 0; i3 < i2; i3++) {
            int random = (int) (Math.random() * ((double) luckyAvatarParticleView.getHeight()));
            int randomRectWidth = luckyAvatarParticleView.getRandomRectWidth();
            ((ArrayList) luckyAvatarParticleView.f198871d).add(new Rect(0, random, randomRectWidth, random + randomRectWidth));
            int randomVelocity = luckyAvatarParticleView.getRandomVelocity();
            ((ArrayList) luckyAvatarParticleView.f198872e).add(Integer.valueOf(randomVelocity));
            int abs = (int) (((double) (((((float) randomVelocity) * 1.0f) * ((float) Math.abs(random - 0))) / ((float) Math.abs(0)))) + 0.5d);
            if (abs == 0) {
                abs = 1;
            }
            ((ArrayList) luckyAvatarParticleView.f198873f).add(Integer.valueOf(abs));
        }
        if (i2 < i) {
            Math.random();
            luckyAvatarParticleView.getHeight();
            luckyAvatarParticleView.getRandomRectWidth();
            throw null;
        }
    }

    private int getRandomRectWidth() {
        return 0 + ((int) (Math.random() * ((double) 0)));
    }

    private int getRandomVelocity() {
        return 0 + ((int) (Math.random() * ((double) 0)));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < ((ArrayList) this.f198871d).size(); i++) {
            canvas.drawRect((Rect) ((ArrayList) this.f198871d).get(i), this.f198875h);
        }
    }

    public void setColor(int i) {
        this.f198875h.setColor(i);
        this.f198875h.setStyle(Paint.Style.FILL);
    }

    public void setDuration(long j) {
        this.f198874g = j;
        ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(this.f198874g).addUpdateListener(new C69145a());
    }
}
