package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tencent.p014mm.p136ui.widget.MMEditText;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsEditText */
public class SnsEditText extends MMEditText {

    /* renamed from: E */
    public Context f206136E;

    /* renamed from: F */
    public int f206137F = 0;

    /* renamed from: G */
    public boolean f206138G = false;

    /* renamed from: H */
    public int f206139H = 0;

    /* renamed from: I */
    public boolean f206140I = false;

    /* renamed from: J */
    public float f206141J;

    /* renamed from: K */
    public int f206142K = 10;

    public SnsEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f206136E = context;
        addTextChangedListener(new C71257n4(this));
    }

    public int getPasterLen() {
        return this.f206137F;
    }

    public boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            this.f206138G = true;
        }
        return super.onTextContextMenuItem(i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            if (Math.abs(this.f206141J - motionEvent.getY()) > ((float) this.f206142K)) {
                this.f206140I = true;
            }
        } else if (motionEvent.getAction() != 1) {
            this.f206140I = false;
        } else if (this.f206140I) {
            this.f206140I = false;
            return true;
        }
        this.f206141J = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    public void setPasterLen(int i) {
        this.f206137F = i;
    }
}
