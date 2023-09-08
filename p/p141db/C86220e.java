package p141db;

import android.view.View;
import android.view.ViewTreeObserver;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.utils.C84752i2;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: db.e */
public class C86220e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f250808d;

    /* renamed from: e */
    public final /* synthetic */ int[] f250809e;

    /* renamed from: f */
    public final /* synthetic */ boolean[] f250810f;

    /* renamed from: g */
    public final /* synthetic */ int f250811g;

    /* renamed from: h */
    public final /* synthetic */ View f250812h;

    /* renamed from: i */
    public final /* synthetic */ C86219d f250813i;

    public C86220e(C86219d dVar, C81925i2 i2Var, int[] iArr, boolean[] zArr, int i, View view) {
        this.f250813i = dVar;
        this.f250808d = i2Var;
        this.f250809e = iArr;
        this.f250810f = zArr;
        this.f250811g = i;
        this.f250812h = view;
    }

    public void onGlobalLayout() {
        int[] a = C84752i2.m104413a(this.f250808d);
        int i = a[0];
        int[] iArr = this.f250809e;
        if (i != iArr[0] && a[1] != iArr[1]) {
            Log.m105925i("MicroMsg.JsApiSetDeviceOrientation", "setDeviceOrientation layout done width[%d]  height[%d]", Integer.valueOf(i), Integer.valueOf(a[1]));
            this.f250810f[0] = true;
            this.f250808d.mo109647a(this.f250811g, this.f250813i.mo115109j("ok"));
            this.f250812h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
