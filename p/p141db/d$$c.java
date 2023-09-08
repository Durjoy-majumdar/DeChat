package p141db;

import android.view.View;
import android.view.ViewTreeObserver;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;

/* renamed from: db.d$$c */
public final /* synthetic */ class d$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C86219d f250802d;

    /* renamed from: e */
    public final /* synthetic */ boolean[] f250803e;

    /* renamed from: f */
    public final /* synthetic */ C81925i2 f250804f;

    /* renamed from: g */
    public final /* synthetic */ int f250805g;

    /* renamed from: h */
    public final /* synthetic */ View f250806h;

    /* renamed from: i */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f250807i;

    public /* synthetic */ d$$c(C86219d dVar, boolean[] zArr, C81925i2 i2Var, int i, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f250802d = dVar;
        this.f250803e = zArr;
        this.f250804f = i2Var;
        this.f250805g = i;
        this.f250806h = view;
        this.f250807i = onGlobalLayoutListener;
    }

    public final void run() {
        C86219d dVar = this.f250802d;
        boolean[] zArr = this.f250803e;
        C81925i2 i2Var = this.f250804f;
        int i = this.f250805g;
        View view = this.f250806h;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f250807i;
        dVar.getClass();
        if (!zArr[0]) {
            Log.m105924i("MicroMsg.JsApiSetDeviceOrientation", "setDeviceOrientation layout timeout");
            i2Var.mo109647a(i, dVar.mo115109j("ok"));
            view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            ((IMagicBrushMonitor) C86312j.m106911c(IMagicBrushMonitor.class)).Ov0(IMagicBrushMonitor.Key.SetDeviceOrientationTimeout.name(), 1, (String) null);
        }
    }
}
