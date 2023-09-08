package com.tencent.p014mm.p136ui.widget.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import java.util.Date;
import rf0.C22230d;

/* renamed from: com.tencent.mm.ui.widget.picker.CustomDatePickerNew */
public class CustomDatePickerNew extends FrameLayout {

    /* renamed from: v */
    public static final /* synthetic */ int f56570v = 0;

    /* renamed from: d */
    public View f56571d = null;

    /* renamed from: e */
    public C22230d f56572e;

    /* renamed from: f */
    public Context f56573f;

    /* renamed from: g */
    public Date f56574g;

    /* renamed from: h */
    public Date f56575h;

    /* renamed from: i */
    public int f56576i;

    /* renamed from: j */
    public int f56577j;

    /* renamed from: n */
    public int f56578n;

    /* renamed from: o */
    public boolean f56579o = true;

    /* renamed from: p */
    public boolean f56580p = true;

    /* renamed from: q */
    public boolean f56581q = true;

    /* renamed from: r */
    public int f56582r;

    /* renamed from: s */
    public int f56583s;

    /* renamed from: t */
    public int f56584t;

    /* renamed from: u */
    public boolean f56585u = false;

    public CustomDatePickerNew(Context context) {
        super(new ContextThemeWrapper(context, C0966R.style.a4p));
        this.f56573f = context;
        this.f56572e = new C22230d(context);
    }

    public int getDayOfMonth() {
        C22230d dVar = this.f56572e;
        if (dVar != null) {
            dVar.mo35391g();
        }
        return this.f56578n;
    }

    public int getMonth() {
        C22230d dVar = this.f56572e;
        if (dVar != null) {
            dVar.mo35391g();
        }
        return this.f56577j;
    }

    public View getView() {
        if (this.f56571d == null) {
            this.f56571d = this.f56572e.mo35389e();
        }
        return this.f56571d;
    }

    public int getYear() {
        C22230d dVar = this.f56572e;
        if (dVar != null) {
            dVar.mo35391g();
        }
        return this.f56576i;
    }

    public void setLongTermYear(boolean z) {
        this.f56585u = z;
    }

    public void setMaxDate(Long l) {
        this.f56575h = new Date(l.longValue());
    }

    public void setMinDate(Long l) {
        this.f56574g = new Date(l.longValue());
    }

    public CustomDatePickerNew(Context context, AttributeSet attributeSet) {
        super(new ContextThemeWrapper(context, C0966R.style.a4p), attributeSet);
        this.f56573f = context;
        this.f56572e = new C22230d(context);
    }

    public CustomDatePickerNew(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f56573f = context;
        this.f56572e = new C22230d(context);
    }
}
