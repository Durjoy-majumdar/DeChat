package e01;

import a01.C103219b;
import a01.C27724a;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import c01.C104207a;
import c01.C104210b;
import c01.C104224p;
import com.tencent.p014mm.autogen.events.ScreenCastEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import g01.C107659c;
import gy3.C87412m;
import gy3.C87413o;
import h01.C107987b;
import h81.C32735h;
import i01.C76253c;
import kg3.C76577a;
import m01.C109453a;
import rx3.C13598b0;

/* renamed from: e01.a */
public final class C107075a {

    /* renamed from: a */
    public C103219b f320495a;

    /* renamed from: b */
    public MediaProjection f320496b;

    /* renamed from: c */
    public VirtualDisplay f320497c;

    /* renamed from: d */
    public int f320498d;

    /* renamed from: e */
    public Intent f320499e;

    /* renamed from: f */
    public C104224p f320500f;

    /* renamed from: g */
    public C104207a f320501g;

    /* renamed from: h */
    public C107659c f320502h;

    /* renamed from: i */
    public HandlerThread f320503i;

    /* renamed from: j */
    public MMHandler f320504j;

    /* renamed from: k */
    public boolean f320505k;

    /* renamed from: l */
    public long f320506l = -1;

    /* renamed from: m */
    public long f320507m = -1;

    /* renamed from: n */
    public long f320508n = -1;

    /* renamed from: o */
    public long f320509o = -1;

    /* renamed from: p */
    public C109453a f320510p;

    /* renamed from: q */
    public C107987b f320511q;

    /* renamed from: r */
    public C76253c f320512r;

    /* renamed from: s */
    public C32226l<? super C76253c, C13598b0> f320513s;

    /* renamed from: e01.a$c */
    public static final class C7581c implements Runnable {

        /* renamed from: d */
        public static final C7581c f25849d = new C7581c();

        public final void run() {
            ScreenCastEvent screenCastEvent = new ScreenCastEvent();
            screenCastEvent.f9475d.f9476a = false;
            screenCastEvent.publish();
        }
    }

    /* renamed from: e01.a$a */
    public /* synthetic */ class C75465a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f221778a;

        static {
            int[] iArr = new int[C76253c.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[3] = 4;
            iArr[4] = 5;
            f221778a = iArr;
        }
    }

    /* renamed from: e01.a$b */
    public static final class C107076b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107075a f320514d;

        /* renamed from: e */
        public final /* synthetic */ C103219b f320515e;

        /* renamed from: f */
        public final /* synthetic */ Context f320516f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107076b(C107075a aVar, C103219b bVar, Context context) {
            super(0);
            this.f320514d = aVar;
            this.f320515e = bVar;
            this.f320516f = context;
        }

        public Object invoke() {
            C107075a aVar = this.f320514d;
            C103219b bVar = this.f320515e;
            C107077b bVar2 = new C107077b(aVar, this.f320516f);
            aVar.getClass();
            bVar.f327167j = false;
            int i = bVar.f327162e;
            if (i == 0) {
                i = 30;
            }
            bVar.f327162e = i;
            C32735h.C32737c cVar = C32735h.C32737c.clicfg_finder_screec_cast_pc_video_bitrate;
            Class cls = C32735h.class;
            int i2 = bVar.f327161d;
            if (i2 == 0) {
                bVar.f327161d = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 4000) * 1000;
                i2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 4000) * 1000;
            }
            bVar.f327161d = i2;
            Log.m105924i("MicroMsg.ScreenCastManager", "config is " + bVar);
            aVar.f320500f = new C104224p(bVar, bVar2);
            C27724a aVar2 = this.f320515e.f304420q;
            if (!aVar2.f76741a) {
                aVar2 = null;
            }
            if (aVar2 != null) {
                C107075a aVar3 = this.f320514d;
                aVar3.f320501g = new C104207a(aVar2, new C107079c(this.f320516f, aVar3));
            }
            C107075a aVar4 = this.f320514d;
            C104207a aVar5 = aVar4.f320501g;
            if (aVar5 != null) {
                C104210b bVar3 = new C104210b(aVar5);
                if (aVar5.f308494d.isAlive()) {
                    aVar5.f308493c.post(new C104207a.C104209b(bVar3));
                }
            }
            aVar4.f320505k = true;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo157528a(Context context, C103219b bVar) {
        this.f320502h = new C107659c(bVar.f327159b, bVar.f327160c, bVar.f327162e);
        Intent intent = this.f320499e;
        C87412m.m108591d(intent);
        int i = this.f320498d;
        C87412m.m108594g(context, "context");
        Log.m105924i("MicroMsg.ScreenCastManager", "createMediaProjection");
        Object systemService = context.getSystemService("media_projection");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
        MediaProjection mediaProjection = ((MediaProjectionManager) systemService).getMediaProjection(i, intent);
        C87412m.m108593f(mediaProjection, "context.getSystemService…ction(resultCode, intent)");
        Log.m105924i("MicroMsg.ScreenCastManager", "createVirtualDisplay");
        MediaProjection mediaProjection2 = mediaProjection;
        VirtualDisplay createVirtualDisplay = mediaProjection2.createVirtualDisplay("MicroMsg.ScreenCastManager", bVar.f327159b, bVar.f327160c, (int) C76577a.m92156g(context), 16, (Surface) null, (VirtualDisplay.Callback) null, (Handler) null);
        C87412m.m108593f(createVirtualDisplay, "mediaProject.createVirtu…MIRROR, null, null, null)");
        this.f320497c = createVirtualDisplay;
        this.f320496b = mediaProjection;
        C107659c cVar = this.f320502h;
        if (cVar != null) {
            cVar.mo158075b(new C107076b(this, bVar, context));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01e3  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo157529b() {
        /*
            r20 = this;
            r0 = r20
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            zt3.t r2 = zt3.C119157j.f356862d
            e01.a$c r3 = e01.C107075a.C7581c.f25849d
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183895z(r3)
            long r2 = r0.f320506l
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r2.longValue()
            r5 = 1
            r6 = 0
            r7 = -1
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0021
            r3 = 1
            goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            r4 = 0
            if (r3 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r2 = r4
        L_0x0027:
            java.lang.String r3 = "MicroMsg.CastReportHelper"
            if (r2 == 0) goto L_0x0051
            long r9 = r2.longValue()
            int r15 = (int) r9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "markVideoRenderFirstFrameCost "
            r2.append(r9)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 1634(0x662, float:2.29E-42)
            r13 = 25
            r14 = 26
            r16 = 1
            r11.mo160138m(r12, r13, r14, r15, r16)
        L_0x0051:
            long r9 = r0.f320507m
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            long r9 = r2.longValue()
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0061
            r9 = 1
            goto L_0x0062
        L_0x0061:
            r9 = 0
        L_0x0062:
            if (r9 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r2 = r4
        L_0x0066:
            if (r2 == 0) goto L_0x008f
            r2.longValue()
            long r9 = r0.f320507m
            int r15 = (int) r9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "markVideoEncodeFrameCostAvg "
            r2.append(r9)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 1634(0x662, float:2.29E-42)
            r13 = 22
            r14 = 23
            r16 = 1
            r11.mo160138m(r12, r13, r14, r15, r16)
        L_0x008f:
            m01.a r2 = r0.f320510p
            r9 = 32
            if (r2 == 0) goto L_0x00f8
            r2.f327616c = r6
            long r10 = r2.f327614a
            r12 = 0
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x00e6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "sum avgBattery=￥avgAverageBattery} microAmpere and avg avgBattery= "
            r10.append(r11)
            long r11 = r2.f327614a
            r10.append(r11)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "MicroMsg.BatteryUtils"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            long r10 = r2.f327614a
            r12 = 1000(0x3e8, float:1.401E-42)
            long r12 = (long) r12
            long r12 = r10 / r12
            int r11 = (int) r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "markBatteryCost "
            r10.append(r12)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r10)
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 1634(0x662, float:2.29E-42)
            r16 = 28
            r17 = 29
            r19 = 1
            r18 = r11
            r14.mo160138m(r15, r16, r17, r18, r19)
        L_0x00e6:
            long r10 = r2.f327614a
            int r11 = (int) r10
            com.tencent.mm.sdk.platformtools.MMHandler r10 = r2.f327615b
            if (r10 == 0) goto L_0x00f0
            r10.removeCallbacksAndMessages(r4)
        L_0x00f0:
            com.tencent.mm.sdk.platformtools.MMHandler r2 = r2.f327615b
            if (r2 == 0) goto L_0x00f9
            r2.quitSafely()
            goto L_0x00f9
        L_0x00f8:
            r11 = 0
        L_0x00f9:
            long r12 = r0.f320509o
            java.lang.Long r2 = java.lang.Long.valueOf(r12)
            long r12 = r2.longValue()
            int r10 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x0109
            r7 = 1
            goto L_0x010a
        L_0x0109:
            r7 = 0
        L_0x010a:
            if (r7 == 0) goto L_0x010d
            goto L_0x010e
        L_0x010d:
            r2 = r4
        L_0x010e:
            if (r2 == 0) goto L_0x013d
            long r7 = r2.longValue()
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r7)
            int r2 = (int) r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "markRecordingCost "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 1634(0x662, float:2.29E-42)
            r14 = 31
            r15 = 32
            r17 = 1
            r16 = r2
            r12.mo160138m(r13, r14, r15, r16, r17)
            goto L_0x013e
        L_0x013d:
            r2 = 0
        L_0x013e:
            a01.b r7 = r0.f320495a
            if (r7 == 0) goto L_0x02b2
            int r8 = r7.f327161d
            int r10 = r7.f327160c
            int r12 = r7.f327159b
            int r7 = r7.f327162e
            h81.h$c r13 = h81.C32735h.C32737c.clicfg_finder_screec_cast_pc_use_opengl_render
            gj.m r14 = p156gj.C107835h0.f322856m
            int r14 = r14.f322868H
            r15 = -1
            r4 = 2
            if (r14 == r15) goto L_0x0165
            if (r14 == r5) goto L_0x0179
            if (r14 == r4) goto L_0x0163
            di3.d r14 = di3.C86312j.m106911c(r1)
            h81.h r14 = (h81.C32735h) r14
            boolean r13 = r14.mo58784wf(r13, r5)
            goto L_0x017a
        L_0x0163:
            r13 = 0
            goto L_0x017a
        L_0x0165:
            boolean r14 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r14 != 0) goto L_0x0179
            boolean r14 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r14 == 0) goto L_0x016e
            goto L_0x0179
        L_0x016e:
            di3.d r14 = di3.C86312j.m106911c(r1)
            h81.h r14 = (h81.C32735h) r14
            boolean r13 = r14.mo58784wf(r13, r5)
            goto L_0x017a
        L_0x0179:
            r13 = 1
        L_0x017a:
            if (r13 == 0) goto L_0x017e
            r13 = 1
            goto L_0x017f
        L_0x017e:
            r13 = 2
        L_0x017f:
            h81.h$c r14 = h81.C32735h.C32737c.clicfg_finder_screec_cast_pc_use_async_codec
            gj.m r6 = p156gj.C107835h0.f322856m
            int r6 = r6.f322867G
            if (r6 == r15) goto L_0x0198
            if (r6 == r5) goto L_0x01ac
            if (r6 == r4) goto L_0x0196
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.h r1 = (h81.C32735h) r1
            boolean r1 = r1.mo58784wf(r14, r5)
            goto L_0x01ad
        L_0x0196:
            r1 = 0
            goto L_0x01ad
        L_0x0198:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r6 != 0) goto L_0x01ac
            boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r6 == 0) goto L_0x01a1
            goto L_0x01ac
        L_0x01a1:
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.h r1 = (h81.C32735h) r1
            boolean r1 = r1.mo58784wf(r14, r5)
            goto L_0x01ad
        L_0x01ac:
            r1 = 1
        L_0x01ad:
            r14 = r10
            if (r1 == 0) goto L_0x01b2
            r1 = 1
            goto L_0x01b3
        L_0x01b2:
            r1 = 2
        L_0x01b3:
            long r9 = r0.f320506l
            int r10 = (int) r9
            r9 = r7
            long r6 = r0.f320507m
            int r7 = (int) r6
            long r4 = r0.f320508n
            int r5 = (int) r4
            i01.c r4 = r0.f320512r
            if (r4 != 0) goto L_0x01c2
            goto L_0x01ca
        L_0x01c2:
            int[] r15 = e01.C107075a.C75465a.f221778a
            int r4 = r4.ordinal()
            r15 = r15[r4]
        L_0x01ca:
            r6 = 3
            r4 = 1
            if (r15 == r4) goto L_0x01e3
            r4 = 2
            if (r15 == r4) goto L_0x01e1
            if (r15 == r6) goto L_0x01df
            r4 = 4
            if (r15 == r4) goto L_0x01dd
            r4 = 5
            if (r15 == r4) goto L_0x01db
            r4 = 0
            goto L_0x01e4
        L_0x01db:
            r4 = 5
            goto L_0x01e4
        L_0x01dd:
            r4 = 4
            goto L_0x01e4
        L_0x01df:
            r4 = 3
            goto L_0x01e4
        L_0x01e1:
            r4 = 2
            goto L_0x01e4
        L_0x01e3:
            r4 = 1
        L_0x01e4:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r6 = "doScreenCastPcKvReport is bitrate: "
            r15.append(r6)
            r15.append(r8)
            java.lang.String r6 = ",videoHeight : "
            r15.append(r6)
            r15.append(r14)
            java.lang.String r6 = ",videoWidth : "
            r15.append(r6)
            r15.append(r12)
            java.lang.String r6 = ",videoFrameRate: "
            r15.append(r6)
            r15.append(r9)
            java.lang.String r6 = ",times: "
            r15.append(r6)
            r15.append(r2)
            java.lang.String r6 = ",batteryCost : "
            r15.append(r6)
            r15.append(r11)
            java.lang.String r6 = ",encodeStrategy : "
            r15.append(r6)
            r15.append(r13)
            java.lang.String r6 = ",renderStrategy : "
            r15.append(r6)
            r15.append(r1)
            java.lang.String r6 = ",firstFrameRenderCost: "
            r15.append(r6)
            r15.append(r10)
            java.lang.String r6 = ",firstFrameEncodeCost: "
            r15.append(r6)
            r15.append(r7)
            java.lang.String r6 = ",avgFrameRenderCost: "
            r15.append(r6)
            r15.append(r5)
            r6 = 32
            r15.append(r6)
            java.lang.String r6 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 12
            java.lang.Object[] r15 = new java.lang.Object[r15]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r17 = 0
            r15[r17] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            r14 = 1
            r15[r14] = r8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r14 = 2
            r15[r14] = r12
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12 = 3
            r15[r12] = r9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9 = 4
            r15[r9] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r9 = 5
            r15[r9] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r9 = 6
            r15[r9] = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 7
            r15[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2 = 8
            r15[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2 = 9
            r15[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r2 = 10
            r15[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r2 = 11
            r15[r2] = r1
            r1 = 22393(0x5779, float:3.1379E-41)
            r2 = 1
            r6.mo160140o(r1, r2, r2, r15)
        L_0x02b2:
            h01.b r1 = r0.f320511q
            if (r1 == 0) goto L_0x0306
            j01.d r2 = r1.f323373b
            j01.c r2 = (j01.C108519c) r2
            r4 = 0
            r2.f324843b = r4
            java.util.List<k01.a> r4 = r2.f324842a
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r4.clear()
            java.io.BufferedReader r4 = r2.f324844c
            if (r4 == 0) goto L_0x02dc
            boolean r4 = r2.f324843b
            if (r4 == 0) goto L_0x02dc
            a14.s1 r5 = a14.C0001s1.f0d
            a14.h0 r6 = a14.C53872d1.f151119c
            r7 = 0
            j01.b r8 = new j01.b
            r4 = 0
            r8.<init>(r2, r4)
            r9 = 2
            r10 = 0
            a14.C53895h.m60466d(r5, r6, r7, r8, r9, r10)
        L_0x02dc:
            l01.b r2 = r1.f323374c
            l01.a r2 = (l01.C109076a) r2
            r2.getClass()
            r4 = 0
            r2.f326636a = r4
            r4 = 50
            java.lang.Thread.sleep(r4)
            i01.b r1 = r1.f323372a
            i01.c r2 = r1.f324333a
            i01.c r4 = i01.C76253c.CONNECTED
            if (r2 != r4) goto L_0x0306
            java.net.Socket r2 = r1.f324334b
            gy3.C87412m.m108591d(r2)
            r2.close()
            i01.c r2 = i01.C76253c.DISCONNECTED
            r1.f324333a = r2
            java.net.Socket r2 = new java.net.Socket
            r2.<init>()
            r1.f324334b = r2
        L_0x0306:
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r0.f320504j
            r2 = 0
            if (r1 == 0) goto L_0x030e
            r1.removeCallbacksAndMessages(r2)
        L_0x030e:
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r0.f320504j
            if (r1 == 0) goto L_0x0315
            r1.quitSafely()
        L_0x0315:
            r0.f320504j = r2
            android.os.HandlerThread r1 = r0.f320503i
            if (r1 == 0) goto L_0x031e
            r1.quitSafely()
        L_0x031e:
            c01.a r1 = r0.f320501g
            if (r1 == 0) goto L_0x0339
            c01.c r2 = new c01.c
            r2.<init>(r1)
            android.os.HandlerThread r4 = r1.f308494d
            boolean r4 = r4.isAlive()
            if (r4 == 0) goto L_0x0339
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r1.f308493c
            c01.a$b r4 = new c01.a$b
            r4.<init>(r2)
            r1.post(r4)
        L_0x0339:
            c01.p r1 = r0.f320500f
            if (r1 == 0) goto L_0x0340
            r1.mo145814c()
        L_0x0340:
            g01.c r1 = r0.f320502h
            if (r1 == 0) goto L_0x03cc
            long r4 = r1.f322081o
            int r10 = (int) r4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "markVideoRenderFrameCostAvg "
            r2.append(r4)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 1634(0x662, float:2.29E-42)
            r8 = 16
            r9 = 17
            r11 = 1
            r6.mo160138m(r7, r8, r9, r10, r11)
            com.tencent.mm.sdk.platformtools.MMHandler r2 = r1.f322072f
            r3 = 0
            r2.removeCallbacksAndMessages(r3)
            com.tencent.mm.sdk.platformtools.MMHandler r2 = r1.f322072f
            r2.quitSafely()
            android.os.HandlerThread r2 = r1.f322073g
            if (r2 == 0) goto L_0x0379
            r2.quitSafely()
        L_0x0379:
            u80.c r2 = r1.f322075i
            if (r2 == 0) goto L_0x0380
            r2.mo158471l()
        L_0x0380:
            g01.b r2 = r1.f322074h
            if (r2 == 0) goto L_0x039e
            android.view.Surface r3 = r2.f322063e
            if (r3 == 0) goto L_0x038b
            r3.release()
        L_0x038b:
            android.view.Surface r3 = r2.f322062d
            if (r3 == 0) goto L_0x0392
            r3.release()
        L_0x0392:
            r3 = 0
            r2.f322062d = r3
            android.media.ImageReader r4 = r2.f322061c
            if (r4 == 0) goto L_0x039c
            r4.close()
        L_0x039c:
            r2.f322061c = r3
        L_0x039e:
            w80.d$b r2 = r1.f322078l
            if (r2 == 0) goto L_0x03a7
            w80.d$a r3 = w80.C111742d.f334647a
            r3.mo163471q(r2)
        L_0x03a7:
            android.view.Surface r2 = r1.f322077k
            if (r2 == 0) goto L_0x03ae
            r2.release()
        L_0x03ae:
            android.graphics.SurfaceTexture r2 = r1.f322076j
            if (r2 == 0) goto L_0x03b5
            r2.release()
        L_0x03b5:
            com.tencent.mm.sdk.platformtools.MTimerHandler r2 = r1.f322083q
            r3 = 0
            r2.removeCallbacksAndMessages(r3)
            com.tencent.mm.sdk.platformtools.MTimerHandler r2 = r1.f322083q
            r2.stopTimer()
            com.tencent.mm.sdk.platformtools.MTimerHandler r2 = r1.f322083q
            r2.quitSafely()
            android.view.Surface r1 = r1.f322070d
            if (r1 == 0) goto L_0x03cc
            r1.release()
        L_0x03cc:
            android.media.projection.MediaProjection r1 = r0.f320496b
            if (r1 == 0) goto L_0x03d3
            r1.stop()
        L_0x03d3:
            android.hardware.display.VirtualDisplay r1 = r0.f320497c
            if (r1 == 0) goto L_0x03da
            r1.release()
        L_0x03da:
            r1 = 0
            r0.f320505k = r1
            r1 = 0
            r0.f320512r = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e01.C107075a.mo157529b():void");
    }
}
