package com.tencent.p014mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.picker.C17925e;
import java.util.Date;
import java.util.Locale;
import rf0.C22230d;
import vt0.C22784g;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandDatePickerV2 */
public class AppBrandDatePickerV2 implements C17925e<String> {

    /* renamed from: d */
    public View f49938d = null;

    /* renamed from: e */
    public C22230d f49939e;

    /* renamed from: f */
    public Context f49940f;

    /* renamed from: g */
    public Date f49941g;

    /* renamed from: h */
    public Date f49942h;

    /* renamed from: i */
    public int f49943i;

    /* renamed from: j */
    public int f49944j;

    /* renamed from: n */
    public int f49945n;

    /* renamed from: o */
    public boolean f49946o;

    /* renamed from: p */
    public boolean f49947p;

    public AppBrandDatePickerV2(Context context) {
        this.f49940f = context;
        this.f49939e = new C22230d(context);
    }

    public Object currentValue() {
        this.f49939e.mo35391g();
        if (this.f49946o) {
            return String.format(Locale.US, "%04d-%02d-%02d", new Object[]{Integer.valueOf(this.f49943i), Integer.valueOf(this.f49944j), Integer.valueOf(this.f49945n)});
        } else if (this.f49947p) {
            return String.format(Locale.US, "%04d-%02d", new Object[]{Integer.valueOf(this.f49943i), Integer.valueOf(this.f49944j)});
        } else {
            return String.format(Locale.US, "%04d", new Object[]{Integer.valueOf(this.f49943i)});
        }
    }

    public View getView() {
        if (this.f49938d == null) {
            this.f49938d = this.f49939e.mo35389e();
        }
        return this.f49938d;
    }

    public void onAttach(C22784g gVar) {
    }

    public void onDetach(C22784g gVar) {
    }

    public void onHide(C22784g gVar) {
    }

    public void onShow(C22784g gVar) {
    }
}
