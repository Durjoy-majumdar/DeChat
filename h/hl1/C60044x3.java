package hl1;

import ak1.C54116w;
import androidx.appcompat.app.AppCompatActivity;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import dh1.C58268d;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import qj1.C63093wh;
import rx3.C13598b0;
import te3.C49712hj1;
import vk1.C65762c;

/* renamed from: hl1.x3 */
public final class C60044x3 extends C58268d {

    /* renamed from: i */
    public final String f171363i = "FinderLiveVisitorPrepareUIC";

    /* renamed from: j */
    public C63093wh f171364j;

    /* renamed from: n */
    public boolean f171365n;

    /* renamed from: o */
    public final C32226l<FinderObject, C13598b0> f171366o = new C60045a(this);

    /* renamed from: hl1.x3$a */
    public static final class C60045a extends C87413o implements C32226l<FinderObject, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60044x3 f171367d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60045a(C60044x3 x3Var) {
            super(1);
            this.f171367d = x3Var;
        }

        public Object invoke(Object obj) {
            FinderObject finderObject = (FinderObject) obj;
            Class cls = C55001u.class;
            String str = this.f171367d.f171363i;
            Log.m105924i(str, "checkEnterTargetLiveRoom result:" + finderObject);
            if (finderObject == null) {
                ((C54116w) C86312j.m106911c(C54116w.class)).Fx0(5, String.valueOf(((C55001u) this.f171367d.mo83051g(cls)).f154416j), String.valueOf(((C55001u) this.f171367d.mo83051g(cls)).f154420q.f182392d));
            } else {
                C60044x3 x3Var = this.f171367d;
                x3Var.getClass();
                C61926c.m72668M(new C60049y3(x3Var, finderObject));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60044x3(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, "context");
    }

    /* renamed from: l */
    public void mo83049l(C65762c cVar, C49712hj1 hj12) {
        C65762c cVar2;
        C87412m.m108594g(cVar, "baseRouter");
        super.mo83049l(cVar, hj12);
        C65762c cVar3 = this.f166848f;
        boolean z = true;
        boolean z2 = false;
        if (cVar3 == null || !cVar3.isLandscape()) {
            z = false;
        }
        if (!z) {
            C65762c cVar4 = this.f166848f;
            if (cVar4 != null) {
                z2 = C56032b.fillBlurBg$default(cVar4, ((C54991o) mo83051g(C54991o.class)).f154345o, false, 2, (Object) null);
            }
            if (z2 && (cVar2 = this.f166848f) != null) {
                cVar2.hideProgress();
            }
            String str = this.f171363i;
            Log.m105924i(str, "setVisitorDefaultBg liveId:" + ((C55001u) mo83051g(C55001u.class)).f154420q.f182392d + ",haveBg:" + z2 + '!');
        }
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [androidx.appcompat.app.AppCompatActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r2 = r2.f151977d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84913n() {
        /*
            r12 = this;
            java.lang.String r0 = r12.f171363i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "prepareLive forceFetchObject:"
            r1.append(r2)
            al1.h r2 = r12.f166849g
            r3 = 0
            if (r2 == 0) goto L_0x001c
            com.tencent.mm.live.api.LiveConfig r2 = r2.f151977d
            if (r2 == 0) goto L_0x001c
            boolean r2 = r2.f157048F
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x001d
        L_0x001c:
            r2 = r3
        L_0x001d:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            al1.h r0 = r12.f166849g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0036
            com.tencent.mm.live.api.LiveConfig r0 = r0.f151977d
            if (r0 == 0) goto L_0x0036
            boolean r0 = r0.f157048F
            if (r0 != r1) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            if (r1 == 0) goto L_0x0081
            java.lang.Class<cl1.u> r0 = cl1.C55001u.class
            java.lang.String r1 = r12.f171363i
            java.lang.String r4 = "loadFeedAndPrepareLive!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            java.lang.Class<ns3.d> r1 = ns3.C11266d.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ns3.d r1 = (ns3.C11266d) r1
            ns3.e r4 = r1.mo9195hT()
            androidx.appcompat.app.AppCompatActivity r1 = r12.f166847e
            boolean r5 = r1 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r5 == 0) goto L_0x0057
            r3 = r1
            com.tencent.mm.ui.MMActivity r3 = (com.tencent.p014mm.p136ui.MMActivity) r3
        L_0x0057:
            r5 = r3
            androidx.lifecycle.i0 r1 = r12.mo83051g(r0)
            cl1.u r1 = (cl1.C55001u) r1
            long r6 = r1.f154416j
            androidx.lifecycle.i0 r0 = r12.mo83051g(r0)
            cl1.u r0 = (cl1.C55001u) r0
            java.lang.String r8 = r0.f154423t
            r9 = 0
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            al1.i r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r0 == 0) goto L_0x007a
            al1.l r0 = r0.f151988c
            if (r0 == 0) goto L_0x007a
            int r2 = r0.f152031k
            r10 = r2
            goto L_0x007b
        L_0x007a:
            r10 = 0
        L_0x007b:
            fy3.l<com.tencent.mm.protocal.protobuf.FinderObject, rx3.b0> r11 = r12.f171366o
            r4.mo11135a(r5, r6, r8, r9, r10, r11)
            goto L_0x0088
        L_0x0081:
            vk1.c r0 = r12.f166848f
            if (r0 == 0) goto L_0x0088
            r0.prepareToStart(r2)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.C60044x3.mo84913n():void");
    }
}
