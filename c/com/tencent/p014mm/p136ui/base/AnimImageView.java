package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import kg3.C76577a;
import ol3.C100367a;

/* renamed from: com.tencent.mm.ui.base.AnimImageView */
public class AnimImageView extends TextView {

    /* renamed from: d */
    public boolean f214727d = false;

    /* renamed from: e */
    public boolean f214728e = false;

    /* renamed from: f */
    public int f214729f = 1;

    /* renamed from: g */
    public AlphaAnimation f214730g;

    /* renamed from: h */
    public AnimationDrawable f214731h;

    /* renamed from: i */
    public AnimationDrawable f214732i;

    /* renamed from: j */
    public AnimationDrawable f214733j;

    /* renamed from: n */
    public Context f214734n;

    public AnimImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f214734n = context;
        mo101600a();
    }

    /* renamed from: a */
    public final void mo101600a() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
        this.f214730g = alphaAnimation;
        alphaAnimation.setDuration(1000);
        this.f214730g.setRepeatCount(-1);
        this.f214730g.setRepeatMode(2);
        this.f214731h = new C100367a();
        Drawable b = C74942w4.m89785b(getContext(), C0966R.attr.f2696e_);
        b.setBounds(0, 0, b.getIntrinsicWidth(), b.getIntrinsicHeight());
        this.f214731h.addFrame(b, 300);
        Drawable b2 = C74942w4.m89785b(getContext(), C0966R.attr.f2697ea);
        b2.setBounds(0, 0, b2.getIntrinsicWidth(), b2.getIntrinsicHeight());
        this.f214731h.addFrame(b2, 300);
        Drawable b3 = C74942w4.m89785b(getContext(), C0966R.attr.f2698eb);
        b3.setBounds(0, 0, b3.getIntrinsicWidth(), b3.getIntrinsicHeight());
        this.f214731h.addFrame(b3, 300);
        this.f214731h.setOneShot(false);
        this.f214731h.setVisible(true, true);
        this.f214732i = new C100367a();
        Drawable drawable = getResources().getDrawable(C0966R.raw.chatto_voice_playing_f1);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f214732i.addFrame(drawable, 300);
        Drawable drawable2 = getResources().getDrawable(C0966R.raw.chatto_voice_playing_f2);
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        this.f214732i.addFrame(drawable2, 300);
        Drawable drawable3 = getResources().getDrawable(C0966R.raw.chatto_voice_playing_f3);
        drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight());
        this.f214732i.addFrame(drawable3, 300);
        this.f214732i.setOneShot(false);
        this.f214732i.setVisible(true, true);
        this.f214733j = new C100367a();
        Drawable e = C74933u4.m89768e(getContext(), C0966R.raw.chatto_voice_playing_f1, getResources().getColor(C0966R.color.FG_0));
        e.setBounds(0, 0, e.getIntrinsicWidth(), e.getIntrinsicHeight());
        this.f214733j.addFrame(e, 300);
        Drawable e2 = C74933u4.m89768e(getContext(), C0966R.raw.chatto_voice_playing_f2, getResources().getColor(C0966R.color.FG_0));
        e2.setBounds(0, 0, e2.getIntrinsicWidth(), e2.getIntrinsicHeight());
        this.f214733j.addFrame(e2, 300);
        Drawable e3 = C74933u4.m89768e(getContext(), C0966R.raw.chatto_voice_playing_f3, getResources().getColor(C0966R.color.FG_0));
        e3.setBounds(0, 0, e3.getIntrinsicWidth(), e3.getIntrinsicHeight());
        this.f214733j.addFrame(e3, 300);
        this.f214733j.setOneShot(false);
        this.f214733j.setVisible(true, true);
    }

    /* renamed from: b */
    public void mo101601b() {
        int i = this.f214729f;
        if (i == 0) {
            if (this.f214728e) {
                setBackgroundDrawable(C76577a.m92158i(this.f214734n, C0966R.C0969drawable.f4750ls));
            } else {
                setBackgroundDrawable(C76577a.m92158i(this.f214734n, C0966R.C0969drawable.f4811nk));
            }
            setAnimation(this.f214730g);
            this.f214730g.startNow();
        } else if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
            } else if (this.f214728e) {
                setBackgroundResource(C0966R.color.f3186i_);
            } else {
                setBackgroundResource(C0966R.color.f3187ia);
            }
            if (!this.f214727d) {
                this.f214727d = true;
                if (this.f214728e) {
                    setCompoundDrawablesWithIntrinsicBounds(this.f214731h, (Drawable) null, (Drawable) null, (Drawable) null);
                    this.f214731h.stop();
                    this.f214731h.start();
                    return;
                }
                setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f214733j, (Drawable) null);
                this.f214733j.stop();
                this.f214733j.start();
            }
        } else if (!this.f214727d) {
            this.f214727d = true;
            if (this.f214728e) {
                setCompoundDrawablesWithIntrinsicBounds(this.f214731h, (Drawable) null, (Drawable) null, (Drawable) null);
                this.f214731h.stop();
                this.f214731h.start();
                return;
            }
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f214732i, (Drawable) null);
            this.f214732i.stop();
            this.f214732i.start();
        }
    }

    /* renamed from: c */
    public void mo101602c() {
        AlphaAnimation alphaAnimation = this.f214730g;
        if (alphaAnimation != null && alphaAnimation.isInitialized()) {
            setAnimation((Animation) null);
        }
        int i = this.f214729f;
        if (i == 1 || i == 2 || i == 3) {
            this.f214727d = false;
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f214731h.stop();
            this.f214732i.stop();
            this.f214733j.stop();
        }
    }

    public int getBaseline() {
        try {
            return super.getBaseline();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable unused) {
        }
    }

    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Throwable unused) {
        }
    }

    public boolean onPreDraw() {
        try {
            return super.onPreDraw();
        } catch (Throwable unused) {
            return true;
        }
    }

    public void setFromGroup(boolean z) {
    }

    public void setFromVoice(boolean z) {
        this.f214728e = z;
    }

    public void setType(int i) {
        this.f214729f = i;
        if (this.f214728e) {
            if (i == 2) {
                setBackgroundResource(C0966R.color.f3186i_);
            } else if (i == 3) {
                setBackgroundDrawable((Drawable) null);
            } else {
                setBackgroundDrawable(C76577a.m92158i(this.f214734n, C0966R.C0969drawable.f4750ls));
            }
        } else if (i == 2) {
            setBackgroundResource(C0966R.color.f3187ia);
        } else if (i == 3) {
            setBackgroundDrawable((Drawable) null);
        } else {
            setBackgroundDrawable(C76577a.m92158i(this.f214734n, C0966R.C0969drawable.f4811nk));
        }
    }

    public AnimImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f214734n = context;
        mo101600a();
    }
}
