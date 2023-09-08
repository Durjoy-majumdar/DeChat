package cj1;

import android.content.Context;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.trtc.TRTCCloudDef;
import d50.C58113g;
import d50.C58114h;
import fy3.C32224a;
import fy3.C32232u;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import ok1.C62042e;
import ph1.C62293i;
import rl1.C13022d0;
import rx3.C13598b0;
import te3.C52005xq0;
import te3.C64273c21;

/* renamed from: cj1.x */
public final class C0633x extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54820t f1490d;

    /* renamed from: e */
    public final /* synthetic */ long f1491e;

    /* renamed from: f */
    public final /* synthetic */ C52005xq0 f1492f;

    /* renamed from: g */
    public final /* synthetic */ C32232u<Boolean, Integer, Integer, String, C58113g, TRTCCloudDef.TRTCParams, C52005xq0, C13598b0> f1493g;

    /* renamed from: h */
    public final /* synthetic */ int f1494h;

    /* renamed from: i */
    public final /* synthetic */ int f1495i;

    /* renamed from: j */
    public final /* synthetic */ String f1496j;

    /* renamed from: n */
    public final /* synthetic */ int f1497n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0633x(C54820t tVar, long j, C52005xq0 xq02, C32232u<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super C58113g, ? super TRTCCloudDef.TRTCParams, ? super C52005xq0, C13598b0> uVar, int i, int i2, String str, int i3) {
        super(0);
        this.f1490d = tVar;
        this.f1491e = j;
        this.f1492f = xq02;
        this.f1493g = uVar;
        this.f1494h = i;
        this.f1495i = i2;
        this.f1496j = str;
        this.f1497n = i3;
    }

    public Object invoke() {
        C64273c21 c212;
        C64273c21 c213;
        Class cls = C13022d0.class;
        Class cls2 = C54991o.class;
        Class cls3 = C55001u.class;
        Context q0 = this.f1490d.mo75781q0();
        Long l = null;
        MMActivity mMActivity = q0 instanceof MMActivity ? (MMActivity) q0 : null;
        boolean z = false;
        if (mMActivity != null && mMActivity.isFinishing()) {
            Log.m105924i(this.f1490d.f153694d, "invalid live resp, activity isFinish");
        } else if (!C62293i.f177086f || C62042e.f176370a.mo87027N0()) {
            FinderLiveService.f159376d.getClass();
            if (FinderLiveService.f159358K) {
                C64273c21 c214 = ((C55001u) this.f1490d.mo75777m0(cls3)).f154420q;
                if (!(c214 != null && this.f1491e == c214.f182392d)) {
                    String str = this.f1490d.f153694d;
                    StringBuilder sb = new StringBuilder();
                    sb.append("outdated resp(no call back),service liveId:");
                    C64273c21 c215 = ((C55001u) this.f1490d.mo75777m0(cls3)).f154420q;
                    if (c215 != null) {
                        l = Long.valueOf(c215.f182392d);
                    }
                    sb.append(l);
                    sb.append(",current liveId:");
                    sb.append(this.f1491e);
                    Log.m105924i(str, sb.toString());
                }
            }
            C52005xq0 xq02 = this.f1492f;
            if (!((xq02 == null || (c213 = xq02.f144846f) == null || c213.f182392d != this.f1491e) ? false : true)) {
                String str2 = this.f1490d.f153694d;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("invalid live resp,liveId:");
                C52005xq0 xq03 = this.f1492f;
                if (!(xq03 == null || (c212 = xq03.f144846f) == null)) {
                    l = Long.valueOf(c212.f182392d);
                }
                sb4.append(l);
                sb4.append(",current liveId:");
                sb4.append(this.f1491e);
                Log.m105924i(str2, sb4.toString());
                C32232u<Boolean, Integer, Integer, String, C58113g, TRTCCloudDef.TRTCParams, C52005xq0, C13598b0> uVar = this.f1493g;
                if (uVar != null) {
                    Boolean bool = Boolean.FALSE;
                    Integer valueOf = Integer.valueOf(this.f1494h);
                    Integer valueOf2 = Integer.valueOf(this.f1495i);
                    String str3 = this.f1496j;
                    String str4 = str3 == null ? "" : str3;
                    C58113g gVar = C58114h.f166249f;
                    TRTCCloudDef.TRTCParams tRTCParams = C58114h.f166248e;
                    C52005xq0 xq04 = this.f1492f;
                    C87412m.m108593f(xq04, "resp");
                    uVar.invoke(bool, valueOf, valueOf2, str4, gVar, tRTCParams, xq04);
                }
            } else {
                if (this.f1495i == 0 && this.f1494h == 0) {
                    C52005xq0 xq05 = this.f1492f;
                    ((C54991o) this.f1490d.mo75777m0(cls2)).f154360r2 = xq05.f144865t;
                    if (xq05.f144846f != null) {
                        C54820t tVar = this.f1490d;
                        if (tVar.f153692b != null) {
                            C54820t.m61746k0(tVar, xq05, this.f1497n, this.f1493g);
                        }
                    }
                    C32232u<Boolean, Integer, Integer, String, C58113g, TRTCCloudDef.TRTCParams, C52005xq0, C13598b0> uVar2 = this.f1493g;
                    if (uVar2 != null) {
                        Boolean bool2 = Boolean.FALSE;
                        Integer valueOf3 = Integer.valueOf(this.f1494h);
                        Integer valueOf4 = Integer.valueOf(this.f1495i);
                        String str5 = this.f1496j;
                        String str6 = str5 == null ? "" : str5;
                        C58113g gVar2 = C58114h.f166249f;
                        TRTCCloudDef.TRTCParams tRTCParams2 = C58114h.f166248e;
                        C52005xq0 xq06 = this.f1492f;
                        C87412m.m108593f(xq06, "resp");
                        uVar2.invoke(bool2, valueOf3, valueOf4, str6, gVar2, tRTCParams2, xq06);
                    }
                } else {
                    Log.m105924i(this.f1490d.f153694d, "launch live room failed");
                    C32232u<Boolean, Integer, Integer, String, C58113g, TRTCCloudDef.TRTCParams, C52005xq0, C13598b0> uVar3 = this.f1493g;
                    if (uVar3 != null) {
                        Boolean bool3 = Boolean.FALSE;
                        Integer valueOf5 = Integer.valueOf(this.f1494h);
                        Integer valueOf6 = Integer.valueOf(this.f1495i);
                        String str7 = this.f1496j;
                        String str8 = str7 == null ? "" : str7;
                        C58113g gVar3 = C58114h.f166249f;
                        TRTCCloudDef.TRTCParams tRTCParams3 = C58114h.f166248e;
                        C52005xq0 xq07 = this.f1492f;
                        C87412m.m108593f(xq07, "resp");
                        uVar3.invoke(bool3, valueOf5, valueOf6, str8, gVar3, tRTCParams3, xq07);
                    }
                }
                C64273c21 c216 = this.f1492f.f144846f;
                if (c216 != null) {
                    int i = c216.f182406t;
                    C54820t tVar2 = this.f1490d;
                    if (!C87412m.m108589b(((C13022d0) tVar2.mo75777m0(cls)).f37101q.getValue(), Boolean.TRUE)) {
                        if ((i & 1) > 0 || (i & 2) > 0) {
                            z = true;
                        }
                        ((C13022d0) tVar2.mo75777m0(cls)).f37101q.postValue(Boolean.valueOf(z));
                    }
                    if ((i & 4) > 0) {
                        C61926c.m72668M(new C0629w(tVar2));
                    }
                    ((C54991o) tVar2.mo75777m0(cls2)).f154265U3 = C61926c.m72696u(i, 64);
                }
            }
        } else {
            Log.m105924i(this.f1490d.f153694d, "invalid live resp, isDirectorStartExit is true");
        }
        return C13598b0.f38549a;
    }
}
