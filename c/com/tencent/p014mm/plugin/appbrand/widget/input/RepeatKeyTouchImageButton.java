package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104926u1;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.RepeatKeyTouchImageButton */
public class RepeatKeyTouchImageButton extends AppCompatImageButton implements C104926u1.C104928b {

    /* renamed from: f */
    public final C104926u1 f311325f = new C104926u1(this);

    /* renamed from: g */
    public C104894l1 f311326g = null;

    public RepeatKeyTouchImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo148710a() {
        C104894l1 l1Var = this.f311326g;
        if (l1Var != null) {
            l1Var.mo110045a();
        }
    }

    /* renamed from: b */
    public void mo148711b() {
        C104894l1 l1Var = this.f311326g;
        if (l1Var != null) {
            l1Var.mo110046b();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f311325f.mo148916a(this, motionEvent);
        return true;
    }

    public boolean performClick() {
        C104894l1 l1Var = this.f311326g;
        if (l1Var == null) {
            return false;
        }
        l1Var.mo110045a();
        return true;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    public void setRepeatKeyTouchListener(C104894l1 l1Var) {
        setClickable(l1Var != null);
        this.f311326g = l1Var;
    }

    public RepeatKeyTouchImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
