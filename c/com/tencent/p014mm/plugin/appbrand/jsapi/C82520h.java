package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.view.View;
import eb0.C86493v0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.h */
public interface C82520h extends C82381f, C82531i {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.h$a */
    public interface C82521a {
        /* renamed from: a */
        C86493v0.C86495c mo86860a(int i, boolean z);

        /* renamed from: b */
        C86493v0.C86495c mo86861b(int i);

        /* renamed from: c */
        boolean mo114857c(View view, int i, int i2, float[] fArr, int i3, boolean z, boolean z2, boolean z3);
    }

    /* renamed from: c */
    C82521a mo109649c(boolean z);

    View getContentView();

    C82521a getCustomViewContainer();

    /* renamed from: x */
    boolean mo109677x();
}
