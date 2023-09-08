package r50;

import android.graphics.Point;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: r50.d */
public final class C63365d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f179736d;

    /* renamed from: e */
    public final /* synthetic */ View f179737e;

    /* renamed from: f */
    public final /* synthetic */ C63363c f179738f;

    /* renamed from: g */
    public final /* synthetic */ boolean f179739g;

    /* renamed from: h */
    public final /* synthetic */ C63374m f179740h;

    /* renamed from: i */
    public final /* synthetic */ Point f179741i;

    public C63365d(int i, View view, C63363c cVar, boolean z, C63374m mVar, Point point) {
        this.f179736d = i;
        this.f179737e = view;
        this.f179738f = cVar;
        this.f179739g = z;
        this.f179740h = mVar;
        this.f179741i = point;
    }

    public final void run() {
        Log.m105925i("MicroMsg.LiveFloatBallHelper", "addVoipView, no ball, state:%s, view:%s", Integer.valueOf(this.f179736d), this.f179737e);
        this.f179738f.f179732a.mo90534J().f311680E = true;
        this.f179738f.f179732a.mo90534J().f311681F = false;
        this.f179738f.f179732a.mo90534J().f311679D = this.f179736d;
        this.f179738f.f179732a.mo90534J().f311689g = this.f179737e;
        this.f179738f.f179732a.mo90534J().f311677B = true;
        this.f179738f.f179732a.mo90534J().f311682G = this.f179739g;
        this.f179738f.mo88270d(this.f179740h);
        this.f179738f.mo88269c(this.f179741i);
        this.f179738f.f179732a.mo68419u();
    }
}
