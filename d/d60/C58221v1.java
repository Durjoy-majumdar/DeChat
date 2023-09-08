package d60;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import b50.C54408d;
import b50.C54410e;
import c50.C54655b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.core.view.LivePreviewView;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import d50.C58114h;
import d60.C58124b;
import di3.C86312j;
import e60.C58532b;
import fy3.C32226l;
import gy3.C87412m;
import i72.C98607d;
import p50.C62197e;
import p625nu.C61901d;
import p625nu.C61903f;
import rx3.C13598b0;
import s50.C63703d0;

/* renamed from: d60.v1 */
public final class C58221v1 extends C58121a implements C61901d.C61902a {

    /* renamed from: f */
    public final C58124b f166728f;

    /* renamed from: g */
    public Context f166729g;

    /* renamed from: h */
    public C62197e f166730h;

    /* renamed from: i */
    public final LivePreviewView f166731i;

    /* renamed from: j */
    public C63703d0 f166732j;

    /* renamed from: n */
    public C61901d f166733n;

    /* renamed from: o */
    public int f166734o = mo82891d0();

    /* renamed from: d60.v1$a */
    public static final class C58222a implements C54410e {

        /* renamed from: d */
        public final /* synthetic */ C58221v1 f166735d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f166736e;

        public C58222a(C58221v1 v1Var, C32226l<? super Boolean, C13598b0> lVar) {
            this.f166735d = v1Var;
            this.f166736e = lVar;
        }

        public void callback(int i, Bundle bundle) {
            if (i >= 0) {
                this.f166735d.getClass();
                this.f166736e.invoke(Boolean.TRUE);
                return;
            }
            this.f166735d.getClass();
            this.f166736e.invoke(Boolean.FALSE);
        }
    }

    /* renamed from: d60.v1$b */
    public static final class C58223b implements C54410e {
        public void callback(int i, Bundle bundle) {
            Log.m105924i("MicroMsg.LiveCoreVisitor", "on exitRoom finish");
            Log.m105924i("MicroMsg.LiveCoreAnchor", "releaseInstance: onlyResetReference:" + false);
            C54655b bVar = C54655b.f153178f1;
            if (bVar != null) {
                bVar.mo75581i0();
            }
            C54655b.f153178f1 = null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58221v1(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f166728f = bVar;
        this.f166729g = viewGroup.getContext();
        View findViewById = viewGroup.findViewById(C0966R.C0970id.f358581fx0);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.live_preview_view)");
        this.f166731i = (LivePreviewView) findViewById;
        if (C62197e.f176819i1 == null) {
            C62197e.f176819i1 = new C62197e();
        }
        C62197e eVar = C62197e.f176819i1;
        C87412m.m108591d(eVar);
        this.f166730h = eVar;
        C61901d zZ = ((C61903f) C86312j.m106911c(C61903f.class)).mo86831zZ(this.f166729g, 2);
        this.f166733n = zZ;
        if (zZ != null) {
            ((C98607d) zZ).f289116g = this;
        }
        if (zZ != null) {
            ((C98607d) zZ).enable();
        }
        ImageView imageView = new ImageView(this.f166287d.getContext());
        imageView.setImageDrawable(C74933u4.m89768e(this.f166287d.getContext(), C0966R.raw.icons_filled_camera_switch, -1));
        new RelativeLayout.LayoutParams(C74942w4.m89784a(this.f166287d.getContext(), 28), C74942w4.m89784a(this.f166287d.getContext(), 28)).addRule(21);
        int a = C74942w4.m89784a(this.f166287d.getContext(), 4);
        imageView.setPadding(a, a, a, a);
        imageView.setOnClickListener(new C58228x1(this));
    }

    public void onOrientationChange(int i) {
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        if (RoomLiveService.f157181M != this.f166287d.getResources().getConfiguration().orientation && (this.f166287d.getResources().getConfiguration().orientation == 1 || this.f166287d.getResources().getConfiguration().orientation == 2)) {
            RoomLiveService.f157181M = this.f166287d.getResources().getConfiguration().orientation;
            C58532b.m67948d(RoomLiveService.f157192c, RoomLiveService.f157197h.f133050d, RoomLiveService.f157199j, 5, RoomLiveService.f157181M == 1 ? 0 : 1, (String) null, RoomLiveService.f157197h.f133055i, 32, (Object) null);
            if (RoomLiveService.f157181M == 1) {
                Log.m105924i("MicroMsg.LiveVisitorIDKeyStat", "markVisitorChangeScreenPortrait");
                C115669n.INSTANCE.mo175913w(1381, 11, 1);
                return;
            }
            Log.m105924i("MicroMsg.LiveVisitorIDKeyStat", "markVisitorChangeScreenLandscape");
            C115669n.INSTANCE.mo175913w(1381, 10, 1);
        } else if (this.f166734o != mo82891d0()) {
            this.f166734o = mo82891d0();
            C58124b.C7172a.m7372a(this.f166728f, C58124b.C58125b.LIVE_ORIENTATION_CHANGE, (Bundle) null, 2, (Object) null);
        }
    }

    /* renamed from: r0 */
    public void mo8358r0() {
    }

    /* renamed from: s0 */
    public void mo3209s0() {
        C62197e eVar;
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        if (RoomLiveService.f157205p != -1) {
            Object systemService = this.f166729g.getSystemService("window");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            if (((WindowManager) systemService).getDefaultDisplay().getRotation() != RoomLiveService.f157205p && (eVar = this.f166730h) != null) {
                eVar.f173033s = this.f166731i;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00fd, code lost:
        r4 = r2.f166253d;
     */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3210u0(d60.C58124b.C58125b r20, android.os.Bundle r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            java.lang.String r2 = "status"
            r3 = r20
            gy3.C87412m.m108594g(r3, r2)
            int r2 = r20.ordinal()
            r3 = 8
            r4 = 0
            if (r2 == r3) goto L_0x0252
            r5 = 10
            java.lang.String r6 = "MicroMsg.LiveCoreVisitor"
            r7 = 1
            r8 = 0
            if (r2 == r5) goto L_0x0220
            r5 = 16
            java.lang.String r9 = "MicroMsg.LiveLinkMicIDKeyStat"
            if (r2 == r5) goto L_0x0153
            r1 = 27
            if (r2 == r1) goto L_0x0252
            r1 = 28
            if (r2 == r1) goto L_0x0252
            java.lang.String r1 = "getUsernameFromUserInfo()"
            switch(r2) {
                case 42: goto L_0x00b5;
                case 43: goto L_0x0088;
                case 44: goto L_0x0032;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0272
        L_0x0032:
            r0.mo10792g(r8)
            r19.mo82964y0()
            k50.a r1 = k50.C60971a.C60973b.f173670a
            m50.e r1 = r1.mo85947d()
            android.content.Context r2 = r0.f166729g
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.orientation
            if (r2 != r7) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r7 = 0
        L_0x004e:
            r1.f174721q = r7
            p50.e r1 = p50.C62197e.f176819i1
            if (r1 != 0) goto L_0x005b
            p50.e r1 = new p50.e
            r1.<init>()
            p50.C62197e.f176819i1 = r1
        L_0x005b:
            p50.e r1 = p50.C62197e.f176819i1
            gy3.C87412m.m108591d(r1)
            d50.i r2 = r1.f172989A
            d50.i$a r3 = d50.C58115i.C58116a.VIDEO_LINK_MIC
            r2.f166256c = r3
            k50.c r2 = r1.f173025i
            if (r2 == 0) goto L_0x006d
            r2.mo85949b(r8)
        L_0x006d:
            r1.mo85686c0(r8)
            r1.mo85684b0(r8)
            r1.mo75212E()
            java.lang.String r1 = "markVisitorLinVideoMic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 1386(0x56a, double:6.85E-321)
            r5 = 8
            r7 = 1
            r2.mo175913w(r3, r5, r7)
            goto L_0x0272
        L_0x0088:
            p50.e r2 = p50.C62197e.f176819i1
            if (r2 != 0) goto L_0x0093
            p50.e r2 = new p50.e
            r2.<init>()
            p50.C62197e.f176819i1 = r2
        L_0x0093:
            p50.e r2 = p50.C62197e.f176819i1
            gy3.C87412m.m108591d(r2)
            r2.mo87278U0()
            java.lang.String r3 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            te3.ep2 r2 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r4 = r2.f133050d
            java.lang.String r6 = com.tencent.p014mm.live.model.RoomLiveService.f157199j
            r7 = 7
            r8 = 0
            java.lang.String r9 = eb0.C75592q0.m90789s()
            gy3.C87412m.m108593f(r9, r1)
            te3.ep2 r1 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            int r10 = r1.f133055i
            e60.C58532b.m67947c(r3, r4, r6, r7, r8, r9, r10)
            goto L_0x0272
        L_0x00b5:
            s50.d0 r2 = r0.f166732j
            if (r2 == 0) goto L_0x0139
            p50.e r3 = r0.f166730h
            if (r3 == 0) goto L_0x0139
            s50.k r4 = r3.f173031q
            r4.getClass()
            s50.i r5 = new s50.i
            r5.<init>(r4)
            r4.mo148312q(r5)
            j50.k r4 = new j50.k
            r4.<init>(r2, r3)
            r2.f180582b = r4
            j50.l r4 = new j50.l
            r4.<init>(r3)
            r2.f180583c = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "startPreview "
            r4.append(r5)
            r4.append(r2)
            r2 = 32
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r4 = "debugText"
            gy3.C87412m.m108594g(r2, r4)
            java.lang.String r4 = "MicroMsg.LiveCore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            d50.h r2 = r3.f173042z
            if (r2 == 0) goto L_0x0104
            d50.f r4 = r2.f166253d
            if (r4 == 0) goto L_0x0104
            boolean r4 = r4.f166226a
            goto L_0x0105
        L_0x0104:
            r4 = 0
        L_0x0105:
            if (r2 == 0) goto L_0x010e
            d50.f r2 = r2.f166253d
            if (r2 == 0) goto L_0x010e
            boolean r2 = r2.f166227b
            goto L_0x010f
        L_0x010e:
            r2 = 1
        L_0x010f:
            r3.mo85681Y(r4, r2)
            d50.h r2 = r3.f173042z
            if (r2 == 0) goto L_0x011f
            d50.f r2 = r2.f166253d
            if (r2 == 0) goto L_0x011f
            boolean r2 = r2.f166228c
            if (r2 != r7) goto L_0x011f
            goto L_0x0120
        L_0x011f:
            r7 = 0
        L_0x0120:
            if (r7 == 0) goto L_0x012f
            y80.g r2 = r3.f173034t
            if (r2 == 0) goto L_0x012f
            s50.k r4 = r3.f173031q
            i72.h r4 = r4.getFrameDataCallback()
            r2.mo143182t(r4)
        L_0x012f:
            s50.k r2 = r3.f173031q
            j50.n r4 = new j50.n
            r4.<init>(r3)
            r2.mo148308i(r4)
        L_0x0139:
            java.lang.String r5 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            te3.ep2 r2 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r6 = r2.f133050d
            java.lang.String r8 = com.tencent.p014mm.live.model.RoomLiveService.f157199j
            r9 = 7
            r10 = 1
            java.lang.String r11 = eb0.C75592q0.m90789s()
            gy3.C87412m.m108593f(r11, r1)
            te3.ep2 r1 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            int r12 = r1.f133055i
            e60.C58532b.m67947c(r5, r6, r8, r9, r10, r11, r12)
            goto L_0x0272
        L_0x0153:
            if (r1 == 0) goto L_0x015c
            java.lang.String r2 = "PARAM_HANGUP_SELF"
            boolean r1 = r1.getBoolean(r2, r8)
            goto L_0x015d
        L_0x015c:
            r1 = 0
        L_0x015d:
            if (r1 == 0) goto L_0x01a7
            p50.e r1 = r0.f166730h
            if (r1 == 0) goto L_0x016f
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x016f
            boolean r1 = r1.mo82882d()
            if (r1 != r7) goto L_0x016f
            r1 = 1
            goto L_0x0170
        L_0x016f:
            r1 = 0
        L_0x0170:
            if (r1 == 0) goto L_0x0184
            java.lang.String r1 = "markVisitorHangUpInAudioLink"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 1386(0x56a, double:6.85E-321)
            r13 = 11
            r15 = 1
            r10.mo175913w(r11, r13, r15)
            goto L_0x01ed
        L_0x0184:
            p50.e r1 = r0.f166730h
            if (r1 == 0) goto L_0x0193
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x0193
            boolean r1 = r1.mo82884f()
            if (r1 != r7) goto L_0x0193
            goto L_0x0194
        L_0x0193:
            r7 = 0
        L_0x0194:
            if (r7 == 0) goto L_0x01ed
            java.lang.String r1 = "markVisitorHangUpInVideoLink"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 1386(0x56a, double:6.85E-321)
            r13 = 12
            r15 = 1
            r10.mo175913w(r11, r13, r15)
            goto L_0x01ed
        L_0x01a7:
            p50.e r1 = r0.f166730h
            if (r1 == 0) goto L_0x01b7
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x01b7
            boolean r1 = r1.mo82882d()
            if (r1 != r7) goto L_0x01b7
            r1 = 1
            goto L_0x01b8
        L_0x01b7:
            r1 = 0
        L_0x01b8:
            if (r1 == 0) goto L_0x01cb
            java.lang.String r1 = "markAnchorHangUpInAudioLink"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 1386(0x56a, double:6.85E-321)
            r13 = 13
            r15 = 1
            r10.mo175913w(r11, r13, r15)
            goto L_0x01ed
        L_0x01cb:
            p50.e r1 = r0.f166730h
            if (r1 == 0) goto L_0x01da
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x01da
            boolean r1 = r1.mo82884f()
            if (r1 != r7) goto L_0x01da
            goto L_0x01db
        L_0x01da:
            r7 = 0
        L_0x01db:
            if (r7 == 0) goto L_0x01ed
            java.lang.String r1 = "markAnchorHangUpInVideoLink"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 1386(0x56a, double:6.85E-321)
            r13 = 14
            r15 = 1
            r10.mo175913w(r11, r13, r15)
        L_0x01ed:
            p50.e r1 = p50.C62197e.f176819i1
            if (r1 != 0) goto L_0x01f8
            p50.e r1 = new p50.e
            r1.<init>()
            p50.C62197e.f176819i1 = r1
        L_0x01f8:
            p50.e r1 = p50.C62197e.f176819i1
            gy3.C87412m.m108591d(r1)
            r1.mo87278U0()
            p50.e r1 = r0.f166730h
            if (r1 == 0) goto L_0x020b
            r1.mo87277T0()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
        L_0x020b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "requestLinkMic ret:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            goto L_0x0272
        L_0x0220:
            java.lang.String r1 = "switchCamera"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            p50.e r1 = r0.f166730h
            if (r1 == 0) goto L_0x022d
            r1.mo85703v0()
        L_0x022d:
            java.lang.String r9 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            te3.ep2 r1 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r10 = r1.f133050d
            java.lang.String r12 = com.tencent.p014mm.live.model.RoomLiveService.f157199j
            r13 = 1
            k50.a r1 = k50.C60971a.C60973b.f173670a
            m50.b r1 = r1.mo85945b()
            int r1 = r1.f174704a
            if (r1 != 0) goto L_0x0242
            r14 = 1
            goto L_0x0243
        L_0x0242:
            r14 = 0
        L_0x0243:
            r15 = 0
            te3.ep2 r1 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            int r1 = r1.f133055i
            r17 = 32
            r18 = 0
            r16 = r1
            e60.C58532b.m67948d(r9, r10, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0272
        L_0x0252:
            nu.d r1 = r0.f166733n
            if (r1 == 0) goto L_0x0259
            r1.disable()
        L_0x0259:
            nu.d r1 = r0.f166733n
            if (r1 == 0) goto L_0x0261
            i72.d r1 = (i72.C98607d) r1
            r1.f289116g = r4
        L_0x0261:
            r0.f166733n = r4
            p50.e r1 = r0.f166730h
            if (r1 == 0) goto L_0x026f
            d60.w1 r2 = new d60.w1
            r2.<init>()
            r1.mo85676R(r2)
        L_0x026f:
            r0.mo10792g(r3)
        L_0x0272:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d60.C58221v1.mo3210u0(d60.b$b, android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0046, code lost:
        if (r1 != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r0 = r0.f172989A;
     */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3211w0() {
        /*
            r3 = this;
            java.lang.String r0 = "MicroMsg.LiveCoreVisitor"
            java.lang.String r1 = "unMount"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            p50.e r0 = r3.f166730h
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            d50.i r0 = r0.f172989A
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.mo82881c()
            if (r0 != r1) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 != 0) goto L_0x0056
            com.tencent.mm.live.model.RoomLiveService r0 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            boolean r0 = com.tencent.p014mm.live.model.RoomLiveService.f157204o
            if (r0 != 0) goto L_0x0049
            p50.e r0 = r3.f166730h
            if (r0 == 0) goto L_0x0033
            d50.i r0 = r0.f172989A
            if (r0 == 0) goto L_0x0033
            boolean r0 = r0.mo82882d()
            if (r0 != r1) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 != 0) goto L_0x0056
            p50.e r0 = r3.f166730h
            if (r0 == 0) goto L_0x0045
            d50.i r0 = r0.f172989A
            if (r0 == 0) goto L_0x0045
            boolean r0 = r0.mo82884f()
            if (r0 != r1) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            if (r1 == 0) goto L_0x0049
            goto L_0x0056
        L_0x0049:
            p50.e r0 = r3.f166730h
            if (r0 == 0) goto L_0x0055
            d60.v1$b r1 = new d60.v1$b
            r1.<init>()
            r0.mo85676R(r1)
        L_0x0055:
            return
        L_0x0056:
            java.lang.String r0 = "activity recycler"
            java.lang.String r1 = "MicroMsg.LiveCore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d60.C58221v1.mo3211w0():void");
    }

    /* renamed from: x0 */
    public final void mo82963x0(C58114h hVar, C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(hVar, "liveRoomModel");
        C87412m.m108594g(lVar, "action");
        C62197e eVar = this.f166730h;
        if (eVar != null) {
            C54408d.C54409a.m61122b(eVar, hVar, false, false, 6, (Object) null);
        }
        C62197e eVar2 = this.f166730h;
        if (eVar2 != null) {
            LivePreviewView livePreviewView = this.f166731i;
            C58222a aVar = new C58222a(this, lVar);
            if (livePreviewView != null) {
                eVar2.f173033s = livePreviewView;
            }
            eVar2.mo75218i(aVar);
        }
    }

    /* renamed from: y0 */
    public final void mo82964y0() {
        ViewParent parent = this.f166731i.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.removeView(this.f166731i);
            viewGroup.addView(this.f166731i);
        }
    }
}
