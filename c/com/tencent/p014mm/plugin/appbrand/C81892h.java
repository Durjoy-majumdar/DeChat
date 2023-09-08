package com.tencent.p014mm.plugin.appbrand;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.ThreeDotsLoadingView;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84701w0;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.appbrand.h */
public final class C81892h implements C82531i.C82538g {

    /* renamed from: a */
    public final /* synthetic */ Boolean[] f240219a;

    /* renamed from: b */
    public final /* synthetic */ Long[] f240220b;

    /* renamed from: c */
    public final /* synthetic */ C83928t1 f240221c;

    /* renamed from: d */
    public final /* synthetic */ View[] f240222d;

    public C81892h(Boolean[] boolArr, Long[] lArr, C83928t1 t1Var, View[] viewArr) {
        this.f240219a = boolArr;
        this.f240220b = lArr;
        this.f240221c = t1Var;
        this.f240222d = viewArr;
    }

    public final void onReady() {
        this.f240219a[0] = Boolean.TRUE;
        if (this.f240220b[0].longValue() > 0) {
            long longValue = this.f240220b[0].longValue();
            Log.m105924i("MicroMsg.AppBrandEntryPageFastLoadHelper", "tryFastLoadEntryPage, onReady called with promptView shown, appId[" + this.f240221c.getRuntime().f238147j + "], time diff: " + (Util.currentTicks() - longValue));
        }
        View view = this.f240222d[0];
        if (view != null) {
            C84701w0.m104352c(view);
            ThreeDotsLoadingView threeDotsLoadingView = view instanceof ThreeDotsLoadingView ? (ThreeDotsLoadingView) view : null;
            if (threeDotsLoadingView != null) {
                threeDotsLoadingView.mo119904f();
            }
        }
    }
}
