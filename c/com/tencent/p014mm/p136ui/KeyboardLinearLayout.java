package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.p136ui.base.OnLayoutChangedLinearLayout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.KeyboardLinearLayout */
public class KeyboardLinearLayout extends OnLayoutChangedLinearLayout {

    /* renamed from: e */
    public String f121149e;

    /* renamed from: f */
    public boolean f121150f;

    /* renamed from: g */
    public boolean f121151g;

    /* renamed from: h */
    public int f121152h;

    /* renamed from: i */
    public C44683b f121153i;

    /* renamed from: com.tencent.mm.ui.KeyboardLinearLayout$a */
    public interface C44682a {
        /* renamed from: a */
        void mo69851a(int i);
    }

    /* renamed from: com.tencent.mm.ui.KeyboardLinearLayout$b */
    public interface C44683b {
        /* renamed from: a */
        void mo67991a(int i);
    }

    public KeyboardLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f121149e = "MicroMsg.KeyboardLinearLayout";
        this.f121150f = false;
        this.f121152h = 0;
        this.f121151g = false;
        this.f121149e += getId();
    }

    /* renamed from: a */
    public void mo68188a(int i) {
        if (!this.f121150f) {
            this.f121150f = true;
            this.f121152h = i;
            Log.m105925i(this.f121149e, "init height:%d", Integer.valueOf(i));
            C44683b bVar = this.f121153i;
            if (bVar != null) {
                bVar.mo67991a(-1);
            }
        } else {
            int i2 = this.f121152h;
            if (i2 < i) {
                i2 = i;
            }
            this.f121152h = i2;
        }
        if (this.f121150f && !this.f121151g && this.f121152h - i > 100) {
            this.f121151g = true;
            mo68189b(-3);
            String str = this.f121149e;
            Log.m105928w(str, "show keyboard!! mHeight: " + this.f121152h + " b: " + i);
        }
        if (this.f121150f && this.f121151g && this.f121152h - i <= 100) {
            this.f121151g = false;
            mo68189b(-2);
            String str2 = this.f121149e;
            Log.m105928w(str2, "hide keyboard!! mHeight: " + this.f121152h + " b: " + i);
        }
    }

    /* renamed from: b */
    public void mo68189b(int i) {
        C44683b bVar = this.f121153i;
        if (bVar != null) {
            bVar.mo67991a(i);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo68188a(i4);
    }

    public void setOnkbdStateCopyListener(C44682a aVar) {
    }

    public void setOnkbdStateListener(C44683b bVar) {
        this.f121153i = bVar;
    }

    public KeyboardLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121149e = "MicroMsg.KeyboardLinearLayout";
        this.f121150f = false;
    }
}
