package qj1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import a70.C79471a;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import bd1.C54446b;
import cl1.C54963d0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderLiveViewLayoutEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderStreamTrackStruct;
import com.tencent.p014mm.live.core.view.LiveVideoView;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.TXLivePlayConfig;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import d60.C58124b;
import eb0.C31543z5;
import f50.C58924d;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import g50.C107744b;
import g50.C107747f;
import g50.C107749g;
import g50.C59364c;
import gi1.C32459e;
import gi1.C59464c;
import gy3.C87412m;
import gy3.C87413o;
import i50.C60251a;
import j50.C60735a;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kt1.C61167e;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONObject;
import p50.C62193a;
import p50.C62195b;
import p50.C62197e;
import ph1.C62288c;
import ph1.C62291f;
import ph1.C62293i;
import ph1.C62294j;
import ph1.C62297m;
import qe3.C89625d;
import rx3.C13598b0;
import te3.C49712hj1;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;
import z04.C112551y;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: qj1.ze */
public final class C63170ze extends C62660c {

    /* renamed from: p */
    public final C58124b f179242p;

    /* renamed from: q */
    public final String f179243q = ("MicroMsg.FinderLiveTXLivePlayerPlugin@" + hashCode());

    /* renamed from: r */
    public LiveVideoView f179244r;

    /* renamed from: s */
    public int f179245s;

    /* renamed from: t */
    public C53973z1 f179246t;

    /* renamed from: u */
    public boolean f179247u;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveTXLivePlayerPlugin$1", mo125469f = "FinderLiveTXLivePlayerPlugin.kt", mo125470l = {74}, mo125471m = "invokeSuspend")
    /* renamed from: qj1.ze$a */
    public static final class C63171a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f179248d;

        /* renamed from: e */
        public final /* synthetic */ C63170ze f179249e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63171a(C63170ze zeVar, C15601d<? super C63171a> dVar) {
            super(2, dVar);
            this.f179249e = zeVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63171a(this.f179249e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63171a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f179248d;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f179248d = 1;
                if (C53965x0.m60607b(3000, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Log.m105924i(this.f179249e.f179243q, "detachBlock timeout");
            long j = this.f179249e.mo87686C0().f151977d.f157075s;
            C62297m e = C62293i.f177081a.mo87360e(j);
            String str = this.f179249e.f179243q;
            StringBuilder sb = new StringBuilder();
            sb.append("detachBlock feedId: ");
            sb.append(j);
            sb.append(" director: ");
            sb.append(e);
            sb.append(" isDetach: ");
            sb.append(e != null ? Boolean.valueOf(e.mo84320e()) : null);
            Log.m105924i(str, sb.toString());
            if (e == null || e.mo84320e()) {
                z = false;
            }
            if (z) {
                if (e != null) {
                    e.mo84322g();
                }
                this.f179249e.mo88089Z0();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.ze$b */
    public static final class C63172b {

        /* renamed from: a */
        public final C58924d f179250a;

        /* renamed from: b */
        public final LiveVideoView f179251b;

        public C63172b(C58924d dVar, LiveVideoView liveVideoView) {
            this.f179250a = dVar;
            this.f179251b = liveVideoView;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C63172b)) {
                return false;
            }
            C63172b bVar = (C63172b) obj;
            return C87412m.m108589b(this.f179250a, bVar.f179250a) && C87412m.m108589b(this.f179251b, bVar.f179251b);
        }

        public int hashCode() {
            C58924d dVar = this.f179250a;
            int i = 0;
            int hashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
            LiveVideoView liveVideoView = this.f179251b;
            if (liveVideoView != null) {
                i = liveVideoView.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "LivePlayerParams(player=" + this.f179250a + ", view=" + this.f179251b + ')';
        }
    }

    /* renamed from: qj1.ze$c */
    public static final class C63173c implements C62195b {

        /* renamed from: qj1.ze$c$a */
        public static final class C63174a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ String f179252d;

            /* renamed from: e */
            public final /* synthetic */ int f179253e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63174a(String str, int i) {
                super(0);
                this.f179252d = str;
                this.f179253e = i;
            }

            public Object invoke() {
                String str;
                String e0 = C112550d0.m153795e0(this.f179252d, ".flv?", "no flv!");
                new C61167e();
                int i = this.f179253e;
                FinderStreamTrackStruct finderStreamTrackStruct = new FinderStreamTrackStruct();
                finderStreamTrackStruct.f156107d = 8;
                finderStreamTrackStruct.f156108e = 10002;
                finderStreamTrackStruct.f156109f = finderStreamTrackStruct.mo86045b("actionName", "finderlive_switchstream", true);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ver", BuildInfo.CLIENT_VERSION);
                jSONObject.put("ver_init", C79471a.f233015c);
                String format = String.format("%08x", Arrays.copyOf(new Object[]{Integer.valueOf(C89625d.f257841g)}, 1));
                C87412m.m108593f(format, "format(format, *args)");
                jSONObject.put("CLIENT_VERSION", format);
                jSONObject.put("tag", BuildInfo.BUILD_TAG);
                jSONObject.put("rev", BuildInfo.REV);
                jSONObject.put("switchUrl", e0);
                jSONObject.put("switchRet", i);
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "JSONObject().also { json…\n            }.toString()");
                finderStreamTrackStruct.f156110g = finderStreamTrackStruct.mo86045b("actionExt", C112551y.m153814n(jSONObject2, ",", ";", false), true);
                finderStreamTrackStruct.f156116m = C31543z5.m39451a();
                finderStreamTrackStruct.f156111h = 0;
                JSONObject jSONObject3 = new JSONObject();
                String info = BuildInfo.info();
                jSONObject3.put("result", info != null ? C112551y.m153814n(info, "\n", ";", false) : null);
                String jSONObject4 = jSONObject3.toString();
                C87412m.m108593f(jSONObject4, "JSONObject().also { json…\n            }.toString()");
                finderStreamTrackStruct.f156112i = finderStreamTrackStruct.mo86045b("resultExt", C112551y.m153814n(jSONObject4, ",", ";", false), true);
                finderStreamTrackStruct.f156113j = (long) 0;
                finderStreamTrackStruct.f156115l = 0;
                C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
                if (c == null || (str = c.field_nickname) == null) {
                    str = "";
                }
                finderStreamTrackStruct.f156114k = finderStreamTrackStruct.mo86045b("snn", str, true);
                String str2 = C61167e.f174139b;
                Log.m105924i(str2, "report value " + finderStreamTrackStruct.mo1006q());
                if (!BuildInfo.DEBUG) {
                    finderStreamTrackStruct.mo86054n();
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: a */
        public void mo84227a(String str, int i) {
            C87412m.m108594g(str, "url");
            C61926c.m72656A((String) null, new C63174a(str, i));
        }
    }

    /* renamed from: qj1.ze$d */
    public static final class C63175d extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public static final C63175d f179254d = new C63175d();

        public C63175d() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63170ze(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f179242p = bVar;
        this.f179244r = (LiveVideoView) viewGroup.findViewById(C0966R.C0970id.fzp);
        viewGroup.setPadding(0, 0, 0, 0);
        this.f179244r.f157168f = null;
        this.f179246t = C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C63171a(this, (C15601d<? super C63171a>) null), 3, (Object) null);
    }

    /* renamed from: b1 */
    public static final C63172b m74521b1(C63170ze zeVar, TXLivePlayConfig tXLivePlayConfig) {
        C58924d dVar;
        C62197e a1 = zeVar.mo88090a1();
        if (a1 != null) {
            Context context = zeVar.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            dVar = a1.mo87268G0(context, tXLivePlayConfig, new C63173c(), ((C54991o) zeVar.mo87696x0(C54991o.class)).mo76007j4());
        } else {
            dVar = null;
        }
        return new C63172b(dVar, zeVar.f179244r);
    }

    /* JADX WARNING: type inference failed for: r0v36, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x062c  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x062f  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0639  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x063b  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x063e  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0649  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0679  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0682  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x069f  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x06a4  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x06c9  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x06cb  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x06ce  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x06e1  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x075d  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0768  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x077c  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m74522g1(qj1.C63170ze r29, int r30, com.tencent.rtmp.TXLivePlayConfig r31, int r32, boolean r33, boolean r34, fy3.C32226l r35, int r36, java.lang.Object r37) {
        /*
            r0 = r29
            r1 = r32
            r2 = r36 & 1
            r3 = 1
            if (r2 == 0) goto L_0x000b
            r2 = 1
            goto L_0x000d
        L_0x000b:
            r2 = r30
        L_0x000d:
            r4 = r36 & 2
            if (r4 == 0) goto L_0x0018
            ok1.e r4 = ok1.C62042e.f176370a
            com.tencent.rtmp.TXLivePlayConfig r4 = r4.mo87034Q()
            goto L_0x001a
        L_0x0018:
            r4 = r31
        L_0x001a:
            r5 = r36 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r33
        L_0x0022:
            r7 = r36 & 16
            if (r7 == 0) goto L_0x0028
            r7 = 1
            goto L_0x002a
        L_0x0028:
            r7 = r34
        L_0x002a:
            cl1.d$a r8 = cl1.C54951d.C54952a.STARTUP_VIDEO_PLAYING
            java.lang.Class<qj1.o> r9 = qj1.C62898o.class
            java.lang.Class<cl1.d> r10 = cl1.C54951d.class
            java.lang.Class<cl1.u> r11 = cl1.C55001u.class
            qj1.c r12 = r0.mo87687E0(r9)
            qj1.o r12 = (qj1.C62898o) r12
            java.lang.String r13 = ""
            if (r12 == 0) goto L_0x02ff
            java.lang.Class<cl1.o> r15 = cl1.C54991o.class
            androidx.lifecycle.i0 r15 = r12.mo87696x0(r15)
            cl1.o r15 = (cl1.C54991o) r15
            com.tencent.mm.protocal.protobuf.FinderObject r15 = r15.f154341n
            if (r15 == 0) goto L_0x004f
            te3.c21 r15 = r15.liveInfo
            if (r15 == 0) goto L_0x004f
            java.util.LinkedList<te3.na1> r15 = r15.f182379U0
            goto L_0x0050
        L_0x004f:
            r15 = 0
        L_0x0050:
            if (r15 == 0) goto L_0x005c
            boolean r16 = r15.isEmpty()
            r6 = r16 ^ 1
            if (r6 != r3) goto L_0x005c
            r6 = 1
            goto L_0x005d
        L_0x005c:
            r6 = 0
        L_0x005d:
            if (r6 == 0) goto L_0x0068
            java.lang.Object r6 = r15.getFirst()
            te3.na1 r6 = (te3.C50516na1) r6
            r12.mo87845e1(r6)
        L_0x0068:
            boolean r6 = r12.mo87841Z0()
            if (r6 != 0) goto L_0x02ff
            r6 = r4
            long r3 = eb0.C31543z5.m39453c()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r34 = r13
            java.lang.String r13 = "loadStartupVideo timeStamp:"
            r14.append(r13)
            r14.append(r3)
            r13 = 32
            r14.append(r13)
            java.lang.String r13 = "adInfo.show_time_intervals"
            if (r15 == 0) goto L_0x013a
            r16 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r1 = 10
            r17 = r2
            int r2 = sx3.C36907w.m41090l(r15, r1)
            r5.<init>(r2)
            java.util.Iterator r2 = r15.iterator()
        L_0x009e:
            boolean r18 = r2.hasNext()
            if (r18 == 0) goto L_0x0133
            java.lang.Object r18 = r2.next()
            r1 = r18
            te3.na1 r1 = (te3.C50516na1) r1
            r18 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r19 = r6
            java.lang.String r6 = "adId:"
            r2.append(r6)
            java.lang.String r6 = r1.f138504d
            r2.append(r6)
            java.lang.String r6 = ":{"
            r2.append(r6)
            java.util.LinkedList<te3.ar4> r1 = r1.f138513p
            gy3.C87412m.m108593f(r1, r13)
            java.util.ArrayList r6 = new java.util.ArrayList
            r20 = r7
            r36 = r9
            r7 = 10
            int r9 = sx3.C36907w.m41090l(r1, r7)
            r6.<init>(r9)
            java.util.Iterator r1 = r1.iterator()
        L_0x00dc:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x0116
            java.lang.Object r9 = r1.next()
            te3.ar4 r9 = (te3.ar4) r9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r22 = r1
            r1 = 91
            r7.append(r1)
            long r0 = r9.f130745d
            r7.append(r0)
            java.lang.String r0 = ", "
            r7.append(r0)
            long r0 = r9.f130746e
            r7.append(r0)
            r0 = 93
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r6.add(r0)
            r7 = 10
            r0 = r29
            r1 = r22
            goto L_0x00dc
        L_0x0116:
            r2.append(r6)
            r0 = 125(0x7d, float:1.75E-43)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r5.add(r0)
            r0 = r29
            r9 = r36
            r2 = r18
            r6 = r19
            r7 = r20
            r1 = 10
            goto L_0x009e
        L_0x0133:
            r19 = r6
            r20 = r7
            r36 = r9
            goto L_0x0145
        L_0x013a:
            r17 = r2
            r16 = r5
            r19 = r6
            r20 = r7
            r36 = r9
            r5 = 0
        L_0x0145:
            r14.append(r5)
            java.lang.String r0 = r14.toString()
            java.lang.String r1 = "FinderLiveAdVideoPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            cl1.d$c r0 = r12.mo87843b1()
            if (r0 == 0) goto L_0x0164
            u62.d r0 = r0.getPlayer()
            boolean r0 = r0.isPlaying()
            r2 = 1
            if (r0 != r2) goto L_0x0164
            r0 = 1
            goto L_0x0165
        L_0x0164:
            r0 = 0
        L_0x0165:
            if (r0 == 0) goto L_0x016e
            java.lang.String r0 = "loadStartupVideo return for playing."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
            goto L_0x02ee
        L_0x016e:
            androidx.lifecycle.i0 r0 = r12.mo87696x0(r11)
            cl1.u r0 = (cl1.C55001u) r0
            te3.c21 r0 = r0.f154420q
            long r5 = r0.f182392d
            if (r15 != 0) goto L_0x018e
            java.lang.Class<ir.n> r0 = p565ir.C60606n.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ir.n r0 = (p565ir.C60606n) r0
            java.util.List r0 = r0.mo85022Oh(r5)
            if (r0 == 0) goto L_0x018e
            java.lang.String r2 = "loadStartupVideo load data from memoryCache."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)
            r15 = r0
        L_0x018e:
            gy3.f0 r0 = new gy3.f0
            r0.<init>()
            if (r15 == 0) goto L_0x01e9
            java.util.Iterator r2 = r15.iterator()
        L_0x0199:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x01e4
            java.lang.Object r7 = r2.next()
            r9 = r7
            te3.na1 r9 = (te3.C50516na1) r9
            java.util.LinkedList<te3.ar4> r9 = r9.f138513p
            gy3.C87412m.m108593f(r9, r13)
            java.util.Iterator r9 = r9.iterator()
        L_0x01af:
            boolean r14 = r9.hasNext()
            if (r14 == 0) goto L_0x01d5
            java.lang.Object r14 = r9.next()
            r15 = r14
            te3.ar4 r15 = (te3.ar4) r15
            r18 = r13
            r21 = r14
            long r13 = r15.f130745d
            int r22 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r22 > 0) goto L_0x01ce
            long r13 = r15.f130746e
            int r15 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r15 > 0) goto L_0x01ce
            r13 = 1
            goto L_0x01cf
        L_0x01ce:
            r13 = 0
        L_0x01cf:
            if (r13 == 0) goto L_0x01d2
            goto L_0x01d9
        L_0x01d2:
            r13 = r18
            goto L_0x01af
        L_0x01d5:
            r18 = r13
            r21 = 0
        L_0x01d9:
            if (r21 == 0) goto L_0x01dd
            r9 = 1
            goto L_0x01de
        L_0x01dd:
            r9 = 0
        L_0x01de:
            if (r9 == 0) goto L_0x01e1
            goto L_0x01e5
        L_0x01e1:
            r13 = r18
            goto L_0x0199
        L_0x01e4:
            r7 = 0
        L_0x01e5:
            r2 = r7
            te3.na1 r2 = (te3.C50516na1) r2
            goto L_0x01ea
        L_0x01e9:
            r2 = 0
        L_0x01ea:
            r0.f27484d = r2
            if (r2 == 0) goto L_0x01f2
            java.lang.String r3 = r2.f138504d
            if (r3 != 0) goto L_0x01f4
        L_0x01f2:
            r3 = r34
        L_0x01f4:
            if (r2 == 0) goto L_0x01fd
            boolean r2 = r2.f138510j
            r4 = 1
            if (r2 != r4) goto L_0x01fd
            r2 = 1
            goto L_0x01fe
        L_0x01fd:
            r2 = 0
        L_0x01fe:
            r4 = 95
            if (r2 == 0) goto L_0x021b
            cl1.d$b r2 = cl1.C54951d.f153999u
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r4)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            boolean r2 = r2.mo56084b(r3)
            goto L_0x0225
        L_0x021b:
            cl1.d$b r2 = cl1.C54951d.f153999u
            java.lang.String r3 = java.lang.String.valueOf(r5)
            boolean r2 = r2.mo56083a(r3)
        L_0x0225:
            if (r2 == 0) goto L_0x0270
            pe1.c<java.lang.Integer> r2 = gg1.C32444a.f86134d0
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 != 0) goto L_0x0270
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "loadStartupVideo return for had play id:"
            r2.append(r3)
            T r3 = r0.f27484d
            te3.na1 r3 = (te3.C50516na1) r3
            if (r3 == 0) goto L_0x0248
            java.lang.String r3 = r3.f138504d
            goto L_0x0249
        L_0x0248:
            r3 = 0
        L_0x0249:
            r2.append(r3)
            java.lang.String r3 = " need_watch_multi_entrance_ad:"
            r2.append(r3)
            T r0 = r0.f27484d
            te3.na1 r0 = (te3.C50516na1) r0
            if (r0 == 0) goto L_0x025e
            boolean r0 = r0.f138510j
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x025f
        L_0x025e:
            r0 = 0
        L_0x025f:
            r2.append(r0)
            r0 = 46
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
            goto L_0x02ee
        L_0x0270:
            T r1 = r0.f27484d
            te3.na1 r1 = (te3.C50516na1) r1
            qj1.n r2 = new qj1.n
            r2.<init>(r12, r0)
            r13 = 0
            boolean r1 = r12.mo87846f1(r1, r13, r2)
            if (r1 == 0) goto L_0x02ee
            java.lang.String r1 = java.lang.String.valueOf(r5)
            T r0 = r0.f27484d
            te3.na1 r0 = (te3.C50516na1) r0
            if (r0 == 0) goto L_0x028f
            java.lang.String r0 = r0.f138504d
            if (r0 != 0) goto L_0x0291
        L_0x028f:
            r0 = r34
        L_0x0291:
            java.lang.Class<qj1.ze> r2 = qj1.C63170ze.class
            qj1.c r2 = r12.mo87687E0(r2)
            qj1.ze r2 = (qj1.C63170ze) r2
            if (r2 == 0) goto L_0x029f
            r3 = 1
            r2.mo88094f1(r3)
        L_0x029f:
            r12.mo87847g1(r8)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "liveIdAdId"
            gy3.C87412m.m108594g(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "recordStartupAdVideo liveId:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = " size:"
            r1.append(r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r2 = cl1.C54951d.f154000v
            int r3 = r2.size()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "LiveAdVideoSlice"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r2.put(r0, r1)
            android.widget.FrameLayout r0 = r12.f178498s
            qj1.e r1 = new qj1.e
            r1.<init>(r12)
            r0.setOnTouchListener(r1)
            r0 = 1
            goto L_0x02ef
        L_0x02ee:
            r0 = 0
        L_0x02ef:
            if (r0 != 0) goto L_0x030b
            java.lang.Class<qj1.da> r0 = qj1.C62705da.class
            qj1.c r0 = r12.mo87687E0(r0)
            qj1.da r0 = (qj1.C62705da) r0
            if (r0 == 0) goto L_0x030b
            r0.mo87717Z0()
            goto L_0x030b
        L_0x02ff:
            r17 = r2
            r19 = r4
            r16 = r5
            r20 = r7
            r36 = r9
            r34 = r13
        L_0x030b:
            r0 = r29
            androidx.lifecycle.i0 r1 = r0.mo87696x0(r10)
            cl1.d r1 = (cl1.C54951d) r1
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<cl1.d$a> r1 = r1.f154007o
            java.lang.Object r1 = r1.getValue()
            cl1.d$a r1 = (cl1.C54951d.C54952a) r1
            if (r1 != r8) goto L_0x031f
            r1 = 1
            goto L_0x0320
        L_0x031f:
            r1 = 0
        L_0x0320:
            if (r1 == 0) goto L_0x0386
            com.tencent.mm.live.core.view.LiveVideoView r1 = r0.f179244r
            r2 = 0
            r1.setAlpha(r2)
            java.lang.Class<qj1.kb> r1 = qj1.C62843kb.class
            qj1.c r1 = r0.mo87687E0(r1)
            qj1.kb r1 = (qj1.C62843kb) r1
            if (r1 == 0) goto L_0x033e
            com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget r1 = r1.mo87804b1()
            com.tencent.mm.plugin.finder.live.multistream.MultiStreamRecyclerView r1 = r1.f159429b
            java.lang.String r3 = "multiRecyclerView"
            gy3.C87412m.m108593f(r1, r3)
            goto L_0x033f
        L_0x033e:
            r1 = 0
        L_0x033f:
            if (r1 != 0) goto L_0x0342
            goto L_0x0386
        L_0x0342:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r3.mo10233c(r2)
            java.lang.Object[] r22 = r3.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTXLivePlayerPlugin"
            java.lang.String r24 = "startPlay"
            java.lang.String r25 = "(ILcom/tencent/rtmp/TXLivePlayConfig;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setAlpha"
            java.lang.String r28 = "(F)V"
            r21 = r1
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            r2 = 0
            java.lang.Object r3 = r3.mo10231a(r2)
            java.lang.Float r3 = (java.lang.Float) r3
            float r2 = r3.floatValue()
            r1.setAlpha(r2)
            java.lang.String r22 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTXLivePlayerPlugin"
            java.lang.String r23 = "startPlay"
            java.lang.String r24 = "(ILcom/tencent/rtmp/TXLivePlayConfig;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setAlpha"
            java.lang.String r27 = "(F)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
        L_0x0386:
            r1 = r36
            qj1.c r1 = r0.mo87687E0(r1)
            qj1.o r1 = (qj1.C62898o) r1
            if (r1 == 0) goto L_0x03a3
            qj1.bf r2 = new qj1.bf
            r2.<init>(r0)
            r1.f178500u = r2
            cl1.d$a r3 = r1.mo87842a1()
            if (r3 == r8) goto L_0x03a3
            r2.invoke()
            r2 = 0
            r1.f178500u = r2
        L_0x03a3:
            java.lang.String r1 = r0.f179243q
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getOrCreateLivePlayer: checkFluentSwitch:"
            r2.append(r3)
            r3 = r20
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            if (r3 != 0) goto L_0x03c5
            r4 = r19
            qj1.ze$b r1 = m74521b1(r0, r4)
            goto L_0x05a9
        L_0x03c5:
            r4 = r19
            qt1.c r1 = ph1.C11940k.f34875a
            java.lang.String r2 = "getOrCreateLivePlayer before"
            r1.mo12482c(r2)
            al1.h r1 = r29.mo87686C0()
            com.tencent.mm.live.api.LiveConfig r1 = r1.f151977d
            long r1 = r1.f157075s
            ph1.i r5 = ph1.C62293i.f177081a
            androidx.lifecycle.i0 r6 = r0.mo87696x0(r10)
            cl1.d r6 = (cl1.C54951d) r6
            boolean r6 = r6.mo75870f3()
            r7 = 1
            r6 = r6 ^ r7
            ph1.m r5 = r5.mo87362g(r1, r6)
            java.util.HashMap<java.lang.Long, ph1.m> r6 = ph1.C62293i.f177087g
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x03f7:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0422
            java.lang.Object r8 = r6.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.Number r9 = (java.lang.Number) r9
            long r12 = r9.longValue()
            int r9 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r9 == 0) goto L_0x0413
            r9 = 1
            goto L_0x0414
        L_0x0413:
            r9 = 0
        L_0x0414:
            if (r9 == 0) goto L_0x03f7
            java.lang.Object r9 = r8.getKey()
            java.lang.Object r8 = r8.getValue()
            r7.put(r9, r8)
            goto L_0x03f7
        L_0x0422:
            java.util.Set r6 = r7.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x042a:
            boolean r7 = r6.hasNext()
            java.lang.String r8 = " director: "
            if (r7 == 0) goto L_0x049c
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r9 = r7.getValue()
            ph1.m r9 = (ph1.C62297m) r9
            if (r9 == 0) goto L_0x042a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "releaseOtherDirector feedId: "
            r12.append(r13)
            java.lang.Object r7 = r7.getKey()
            java.lang.Number r7 = (java.lang.Number) r7
            long r13 = r7.longValue()
            r12.append(r13)
            r12.append(r8)
            r12.append(r9)
            java.lang.String r7 = " isDetach: "
            r12.append(r7)
            boolean r7 = r9.mo84320e()
            r12.append(r7)
            java.lang.String r7 = r12.toString()
            java.lang.String r8 = "FinderFluentSwitchManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            boolean r7 = r9 instanceof ph1.C62288c
            if (r7 == 0) goto L_0x0484
            r7 = r9
            ph1.c r7 = (ph1.C62288c) r7
            th1.c r7 = r7.f177064e
            f50.d r7 = r7.f186980z
            if (r7 == 0) goto L_0x0492
            r8 = 1
            r7.stopPlay(r8)
            goto L_0x0492
        L_0x0484:
            r8 = 1
            ph1.j r7 = r9.mo84321f()
            if (r7 == 0) goto L_0x0492
            f50.d r7 = r7.f177095g
            if (r7 == 0) goto L_0x0492
            r7.stopPlay(r8)
        L_0x0492:
            boolean r7 = r9.mo84320e()
            if (r7 != 0) goto L_0x042a
            r9.mo84322g()
            goto L_0x042a
        L_0x049c:
            if (r5 == 0) goto L_0x04f2
            java.lang.String r6 = r0.f179243q
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "switchInLiveRoom: "
            r7.append(r9)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            qj1.ef r6 = new qj1.ef
            r6.<init>(r0)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r7.getClass()
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159349B
            if (r7 == 0) goto L_0x04cc
            java.lang.Class<fh1.p2> r9 = fh1.C59062p2.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r7 = r7.controller(r9)
            fh1.p2 r7 = (fh1.C59062p2) r7
            goto L_0x04cd
        L_0x04cc:
            r7 = 0
        L_0x04cd:
            if (r7 == 0) goto L_0x04d6
            com.tencent.mm.plugin.finder.live.scrollsquare.widget.FinderLiveRefreshLoadMoreLayout r9 = r7.f168983p
            if (r9 == 0) goto L_0x04d6
            boolean r9 = r9.f159498R0
            goto L_0x04d7
        L_0x04d6:
            r9 = 0
        L_0x04d7:
            r12 = 1
            if (r7 == 0) goto L_0x04dd
            r7.mo84273K3(r12)
        L_0x04dd:
            r0.f179247u = r12
            com.tencent.mm.live.core.view.LiveVideoView r12 = r0.f179244r
            java.lang.String r13 = "txLivePlayerPreview"
            gy3.C87412m.m108593f(r12, r13)
            qj1.df r13 = new qj1.df
            r13.<init>(r0, r9, r7, r5)
            r5.mo84318c(r12, r13, r6)
            rx3.b0 r6 = rx3.C13598b0.f38549a
            goto L_0x04f3
        L_0x04f2:
            r6 = 0
        L_0x04f3:
            if (r6 != 0) goto L_0x04f8
            r29.mo88089Z0()
        L_0x04f8:
            boolean r6 = r5 instanceof ph1.C62291f
            if (r6 != 0) goto L_0x0503
            boolean r6 = r5 instanceof fk1.C59113a
            if (r6 == 0) goto L_0x0501
            goto L_0x0503
        L_0x0501:
            r6 = 0
            goto L_0x0504
        L_0x0503:
            r6 = 1
        L_0x0504:
            java.lang.String r7 = " player:"
            java.lang.String r9 = "MicroMsg.LiveCdnPlayerManager"
            java.lang.String r12 = "setTXLivePlayer: "
            if (r6 == 0) goto L_0x05ac
            if (r5 == 0) goto L_0x0518
            ph1.j r6 = r5.mo84321f()
            if (r6 == 0) goto L_0x0518
            f50.d r6 = r6.f177095g
            goto L_0x0519
        L_0x0518:
            r6 = 0
        L_0x0519:
            if (r6 == 0) goto L_0x05ac
            p50.e r6 = r29.mo88090a1()
            if (r6 == 0) goto L_0x0526
            b50.g r6 = r6.f176822Y0
            f50.d r6 = r6.f152627a
            goto L_0x0527
        L_0x0526:
            r6 = 0
        L_0x0527:
            ph1.j r13 = r5.mo84321f()
            if (r13 == 0) goto L_0x0530
            f50.d r13 = r13.f177095g
            goto L_0x0531
        L_0x0530:
            r13 = 0
        L_0x0531:
            boolean r6 = gy3.C87412m.m108589b(r6, r13)
            if (r6 != 0) goto L_0x0541
            p50.e r6 = r29.mo88090a1()
            if (r6 == 0) goto L_0x0541
            r13 = 0
            r6.mo87256C0(r13)
        L_0x0541:
            ph1.j r6 = r5.mo84321f()
            if (r6 == 0) goto L_0x054a
            f50.d r6 = r6.f177095g
            goto L_0x054b
        L_0x054a:
            r6 = 0
        L_0x054b:
            if (r6 == 0) goto L_0x0550
            r6.setConfig(r4)
        L_0x0550:
            java.lang.String r4 = r0.f179243q
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "getLivePlayer live return for cache feedId:"
            r13.append(r14)
            r13.append(r1)
            r13.append(r7)
            r13.append(r6)
            r13.append(r8)
            r13.append(r5)
            java.lang.String r7 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
            ph1.j r4 = r5.mo84321f()
            if (r4 != 0) goto L_0x0579
            goto L_0x057c
        L_0x0579:
            r7 = 0
            r4.f177095g = r7
        L_0x057c:
            p50.e r4 = r29.mo88090a1()
            if (r4 == 0) goto L_0x059a
            b50.g r4 = r4.f176822Y0
            r4.f152627a = r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r12)
            f50.d r4 = r4.f152627a
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r4)
        L_0x059a:
            boolean r4 = r5 instanceof fk1.C59113a
            if (r4 == 0) goto L_0x05a3
            ph1.i r4 = ph1.C62293i.f177081a
            r4.mo87359d(r1)
        L_0x05a3:
            qj1.ze$b r1 = new qj1.ze$b
            r2 = 0
            r1.<init>(r6, r2)
        L_0x05a9:
            r2 = 0
            r8 = 0
            goto L_0x061e
        L_0x05ac:
            boolean r6 = r5 instanceof ph1.C62288c
            if (r6 == 0) goto L_0x0611
            ph1.c r5 = (ph1.C62288c) r5
            th1.c r6 = r5.f177064e
            f50.d r6 = r6.f186980z
            if (r6 == 0) goto L_0x0611
            p50.e r6 = r29.mo88090a1()
            r8 = 0
            if (r6 == 0) goto L_0x05c2
            r6.mo87256C0(r8)
        L_0x05c2:
            th1.c r6 = r5.f177064e
            f50.d r6 = r6.f186980z
            if (r6 == 0) goto L_0x05cb
            r6.setConfig(r4)
        L_0x05cb:
            th1.c r4 = r5.f177064e
            r5 = 0
            r4.f186980z = r5
            java.lang.String r4 = r0.f179243q
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r13 = "getLivePlayer image return for cache feedId:"
            r5.append(r13)
            r5.append(r1)
            r5.append(r7)
            r5.append(r6)
            java.lang.String r1 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            p50.e r1 = r29.mo88090a1()
            if (r1 == 0) goto L_0x060a
            b50.g r1 = r1.f176822Y0
            r1.f152627a = r6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            f50.d r1 = r1.f152627a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
        L_0x060a:
            qj1.ze$b r1 = new qj1.ze$b
            r2 = 0
            r1.<init>(r6, r2)
            goto L_0x061e
        L_0x0611:
            r2 = 0
            r8 = 0
            java.lang.String r1 = r0.f179243q
            java.lang.String r5 = "getLivePlayer return for create"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            qj1.ze$b r1 = m74521b1(r0, r4)
        L_0x061e:
            p50.e r4 = r29.mo88090a1()
            if (r4 == 0) goto L_0x062f
            d50.h r4 = r4.f173042z
            if (r4 == 0) goto L_0x062f
            d50.g r4 = r4.f166251b
            if (r4 == 0) goto L_0x062f
            java.lang.String r4 = r4.f166245o
            goto L_0x0630
        L_0x062f:
            r4 = r2
        L_0x0630:
            if (r4 == 0) goto L_0x063b
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0639
            goto L_0x063b
        L_0x0639:
            r4 = 0
            goto L_0x063c
        L_0x063b:
            r4 = 1
        L_0x063c:
            if (r4 == 0) goto L_0x0649
            androidx.lifecycle.i0 r4 = r0.mo87696x0(r11)
            cl1.u r4 = (cl1.C55001u) r4
            java.lang.String r13 = r4.f154425v
            r22 = r13
            goto L_0x0661
        L_0x0649:
            p50.e r4 = r29.mo88090a1()
            if (r4 == 0) goto L_0x065f
            d50.h r4 = r4.f173042z
            if (r4 == 0) goto L_0x065f
            d50.g r4 = r4.f166251b
            if (r4 == 0) goto L_0x065f
            java.lang.String r4 = r4.f166245o
            if (r4 != 0) goto L_0x065c
            goto L_0x065f
        L_0x065c:
            r22 = r4
            goto L_0x0661
        L_0x065f:
            r22 = r34
        L_0x0661:
            ak1.n0 r18 = ak1.C54101n0.f151856a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "checkFluentSwitch:"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = "; isPlaying:"
            r4.append(r3)
            f50.d r3 = r1.f179250a
            if (r3 == 0) goto L_0x0682
            boolean r3 = r3.isPlaying()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x0683
        L_0x0682:
            r3 = r2
        L_0x0683:
            r4.append(r3)
            java.lang.String r3 = "; streamType:"
            r4.append(r3)
            r3 = r17
            r4.append(r3)
            java.lang.String r5 = ";url:"
            r4.append(r5)
            p50.e r5 = r29.mo88090a1()
            if (r5 == 0) goto L_0x06a4
            b50.g r5 = r5.f176822Y0
            if (r5 == 0) goto L_0x06a4
            java.lang.String r15 = r5.mo75227a()
            goto L_0x06a5
        L_0x06a4:
            r15 = r2
        L_0x06a5:
            r4.append(r15)
            java.lang.String r19 = r4.toString()
            androidx.lifecycle.i0 r2 = r0.mo87696x0(r11)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.f154420q
            long r4 = r2.f182392d
            r23 = 1
            r20 = r4
            r18.mo74801h(r19, r20, r22, r23)
            f50.d r2 = r1.f179250a
            p50.e r4 = r29.mo88090a1()
            if (r4 == 0) goto L_0x06cb
            int r4 = r4.f173000L
            if (r4 != 0) goto L_0x06cb
            r4 = 1
            goto L_0x06cc
        L_0x06cb:
            r4 = 0
        L_0x06cc:
            if (r4 == 0) goto L_0x06e1
            p50.e r4 = r29.mo88090a1()
            if (r4 == 0) goto L_0x06df
            b50.g r4 = r4.f176822Y0
            f50.d r4 = r4.f152627a
            r5 = 1
            if (r4 == 0) goto L_0x06f4
            r4.setRenderMode(r5)
            goto L_0x06f4
        L_0x06df:
            r5 = 1
            goto L_0x06f4
        L_0x06e1:
            r5 = 1
            p50.e r4 = r29.mo88090a1()
            if (r4 == 0) goto L_0x06f4
            b50.g r4 = r4.f176822Y0
            f50.d r4 = r4.f152627a
            if (r4 == 0) goto L_0x06f4
            r6 = r32
            r4.setRenderMode(r6)
            goto L_0x06f6
        L_0x06f4:
            r6 = r32
        L_0x06f6:
            r29.mo88093e1()
            java.lang.String r4 = r0.f179243q
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "startPlay, type:"
            r7.append(r9)
            r7.append(r3)
            java.lang.String r9 = ", renderMode:"
            r7.append(r9)
            r7.append(r6)
            java.lang.String r6 = ", mute:"
            r7.append(r6)
            r6 = r16
            r7.append(r6)
            java.lang.String r9 = ", liveCore:"
            r7.append(r9)
            p50.e r9 = r29.mo88090a1()
            r7.append(r9)
            java.lang.String r9 = ", player:"
            r7.append(r9)
            r7.append(r2)
            r2 = 32
            r7.append(r2)
            com.tencent.mm.live.core.view.LiveVideoView r2 = r1.f179251b
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            if (r6 != 0) goto L_0x0756
            androidx.lifecycle.i0 r2 = r0.mo87696x0(r10)
            cl1.d r2 = (cl1.C54951d) r2
            boolean r2 = r2.mo75869e3()
            if (r2 != 0) goto L_0x0756
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            boolean r2 = r2.mo77644r()
            if (r2 == 0) goto L_0x0757
        L_0x0756:
            r8 = 1
        L_0x0757:
            p50.e r2 = r29.mo88090a1()
            if (r2 == 0) goto L_0x0760
            r2.mo87273O0(r8)
        L_0x0760:
            r0.f179245s = r3
            p50.e r2 = r29.mo88090a1()
            if (r2 == 0) goto L_0x0774
            com.tencent.mm.live.core.view.LiveVideoView r1 = r1.f179251b
            qj1.cf r4 = new qj1.cf
            r5 = r35
            r4.<init>(r5)
            r2.mo87255B0(r3, r1, r4)
        L_0x0774:
            p50.e r0 = r29.mo88090a1()
            boolean r1 = r0 instanceof p50.C62193a
            if (r1 == 0) goto L_0x077e
            p50.a r0 = (p50.C62193a) r0
        L_0x077e:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.mo77608K()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C63170ze.m74522g1(qj1.ze, int, com.tencent.rtmp.TXLivePlayConfig, int, boolean, boolean, fy3.l, int, java.lang.Object):void");
    }

    /* renamed from: Z0 */
    public final void mo88089Z0() {
        View decorView;
        Log.m105924i(this.f179243q, "fluentSwitchLiveRootEnd");
        C56032b F0 = mo14482F0();
        if (F0 != null) {
            F0.setAlpha(1.0f);
        }
        Context context = this.f166287d.getContext();
        MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
        if (mMActivity != null) {
            Window window = mMActivity.getWindow();
            if (!(window == null || (decorView = window.getDecorView()) == null)) {
                decorView.setBackgroundColor(-16777216);
            }
            View findViewById = this.f166287d.getRootView().findViewById(C0966R.C0970id.f358131dk3);
            if (findViewById != null) {
                findViewById.setBackgroundColor(-16777216);
            }
        }
    }

    /* renamed from: a1 */
    public final C62197e mo88090a1() {
        C62042e eVar = C62042e.f176370a;
        C58124b bVar = this.f177936g;
        C87412m.m108592e(bVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        if (!eVar.mo87073d1(((C56032b) bVar).getBuContext())) {
            return C62193a.f176816k1.mo87262c(mo87686C0().f151977d.f157064e);
        }
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        if (aVar instanceof C60251a) {
            return (C60251a) aVar;
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: c1 */
    public final C58924d mo88091c1() {
        C62197e a1 = mo88090a1();
        if (a1 != null) {
            return a1.f176822Y0.f152627a;
        }
        return null;
    }

    /* renamed from: d1 */
    public final TXCloudVideoView mo88092d1() {
        LiveVideoView liveVideoView = this.f179244r;
        C87412m.m108593f(liveVideoView, "txLivePlayerPreview");
        return liveVideoView;
    }

    /* renamed from: e1 */
    public final void mo88093e1() {
        FinderLiveViewLayoutEvent finderLiveViewLayoutEvent = new FinderLiveViewLayoutEvent();
        FinderLiveViewLayoutEvent.C55131a aVar = finderLiveViewLayoutEvent.f154794d;
        aVar.f154796b = this.f179244r;
        aVar.f154800f = mo88091c1();
        FinderLiveViewLayoutEvent.C55131a aVar2 = finderLiveViewLayoutEvent.f154794d;
        C62197e a1 = mo88090a1();
        int i = 0;
        aVar2.f154797c = a1 != null ? a1.f176825b1 : 0;
        FinderLiveViewLayoutEvent.C55131a aVar3 = finderLiveViewLayoutEvent.f154794d;
        C62197e a15 = mo88090a1();
        if (a15 != null) {
            i = a15.f176826c1;
        }
        aVar3.f154798d = i;
        FinderLiveViewLayoutEvent.C55131a aVar4 = finderLiveViewLayoutEvent.f154794d;
        C62197e a16 = mo88090a1();
        aVar4.f154799e = a16 != null ? a16.f176827d1 : 0.0f;
        finderLiveViewLayoutEvent.f154794d.f154795a = mo87686C0().f151977d.f157075s;
        String str = this.f179243q;
        Log.m105924i(str, "start send FinderLiveViewLayoutEvent videoView " + this.f179244r + " feedId: " + mo87686C0().f151977d.f157075s);
        finderLiveViewLayoutEvent.publish();
    }

    /* renamed from: f1 */
    public final void mo88094f1(boolean z) {
        C62197e a1 = mo88090a1();
        if (a1 != null) {
            a1.mo87273O0(z);
        }
        String str = this.f179243q;
        Log.m105924i(str, "txLivePlayer, mute:" + z);
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        super.mo10792g(i);
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return false;
    }

    /* renamed from: h1 */
    public final void mo88095h1(boolean z) {
        String str = this.f179243q;
        Log.m105924i(str, "stopPlay, type:" + this.f179245s);
        C62197e a1 = mo88090a1();
        if (a1 != null) {
            a1.mo87256C0(z);
        }
    }

    /* renamed from: i1 */
    public final void mo88096i1() {
        mo88095h1(true);
        C62042e eVar = C62042e.f176370a;
        TXLivePlayConfig Q = eVar.mo87034Q();
        TXLivePlayConfig tXLivePlayConfig = Q;
        m74522g1(this, 0, tXLivePlayConfig, C62042e.m72810w0(eVar, mo87684A0(), mo82893g0(), false, 4, (Object) null), false, true ^ ((C54991o) mo87696x0(C54991o.class)).mo76007j4(), C63175d.f179254d, 9, (Object) null);
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* renamed from: m0 */
    public void mo11992m0(LinkedHashMap<String, Rect> linkedHashMap) {
        RectF rectF;
        Class cls = C54963d0.class;
        C87412m.m108594g(linkedHashMap, "micUserMap");
        C59464c value = ((C54963d0) mo87696x0(cls)).f154077t.getValue();
        if (value != null) {
            C58924d c1 = mo88091c1();
            C59364c cVar = c1 instanceof C59364c ? (C59364c) c1 : null;
            if (cVar != null) {
                LinkedList<C32459e> linkedList = value.f169900e;
                String str = this.f179243q;
                Log.m105924i(str, "getBlendAlphaRect list: " + linkedList.size() + " value: " + linkedList);
                if (linkedList.size() <= 0 || !((C54963d0) mo87696x0(cls)).mo75912T3()) {
                    rectF = new RectF(-1.0f, -1.0f, -1.0f, -1.0f);
                } else {
                    C32459e eVar = linkedList.get(0);
                    C87412m.m108593f(eVar, "dataList[0]");
                    C32459e eVar2 = eVar;
                    float f = eVar2.f86246a;
                    float f2 = eVar2.f86247b;
                    rectF = new RectF(f, f2, eVar2.f86248c + f, eVar2.f86249d + f2);
                }
                String str2 = this.f179243q;
                Log.m105924i(str2, "getBlendAlphaRect rect: " + rectF);
                C107747f fVar = ((C107749g) cVar.mo84112c()).f322479b;
                if (fVar != null) {
                    fVar.f322456D = rectF;
                    C107744b bVar = fVar.f322472u;
                    if (bVar != null) {
                        float[] fArr = bVar.f322450z;
                        fArr[0] = rectF.left;
                        fArr[1] = rectF.right;
                        fArr[2] = rectF.top;
                        fArr[3] = rectF.bottom;
                    }
                }
            }
        }
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C58924d dVar;
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        int ordinal = bVar.ordinal();
        Boolean bool = null;
        int i = 0;
        boolean z = true;
        if (ordinal == 7) {
            String str = this.f179243q;
            StringBuilder sb = new StringBuilder();
            sb.append("START_LIVE isH265ReplayEnable: ");
            C62197e a1 = mo88090a1();
            if (a1 != null) {
                bool = Boolean.valueOf(a1.f176830g1);
            }
            sb.append(bool);
            Log.m105924i(str, sb.toString());
            C62197e a15 = mo88090a1();
            if (a15 == null || !a15.f176830g1) {
                z = false;
            }
            if (z) {
                C62197e a16 = mo88090a1();
                if (a16 != null) {
                    a16.mo87265D0();
                }
                C62197e a17 = mo88090a1();
                if (a17 != null) {
                    a17.f176830g1 = false;
                }
            }
        } else if (ordinal == 67) {
            C62297m e = C62293i.f177081a.mo87360e(mo87686C0().f151977d.f157075s);
            int i2 = bundle != null ? bundle.getInt("EVT_PARAM1", 0) : 0;
            if (bundle != null) {
                i = bundle.getInt("EVT_PARAM2", 0);
            }
            float f = (i2 == 0 || i == 0) ? 0.0f : (((float) i2) * 1.0f) / ((float) i);
            if (e instanceof C62291f) {
                C62291f fVar = (C62291f) e;
                fVar.mo84321f().f177092d = i2;
                fVar.mo84321f().f177093e = i;
                fVar.mo84321f().f177094f = f;
                String str2 = this.f179243q;
                Log.m105924i(str2, "change director liveParamsLength videoWidth: " + i2 + " videoHeight: " + i + " videoRatioWH: " + f + ' ');
            }
            C62197e a18 = mo88090a1();
            if (a18 != null) {
                a18.f176825b1 = i2;
            }
            C62197e a19 = mo88090a1();
            if (a19 != null) {
                a19.f176826c1 = i;
            }
            C62197e a110 = mo88090a1();
            if (a110 != null) {
                a110.f176827d1 = f;
            }
            mo88093e1();
        } else if (ordinal != 165) {
            if (ordinal == 27 || ordinal == 28) {
                mo88095h1(true);
                C62297m g = C62293i.f177081a.mo87362g(mo87686C0().f151977d.f157075s, true);
                if (g != null) {
                    g.mo84322g();
                    String str3 = this.f179243q;
                    Log.m105924i(str3, "director enter,but live finish, director: " + g);
                    if (g instanceof C62288c) {
                        C58924d dVar2 = ((C62288c) g).f177064e.f186980z;
                        if (dVar2 != null) {
                            dVar2.stopPlay(true);
                        }
                    } else {
                        C62294j f2 = g.mo84321f();
                        if (!(f2 == null || (dVar = f2.f177095g) == null)) {
                            dVar.stopPlay(true);
                        }
                    }
                }
                C53973z1 z1Var = this.f179246t;
                if (z1Var != null) {
                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                }
            }
        } else if (((C54991o) mo87696x0(C54991o.class)).f154301c3) {
            this.f179244r.setBackgroundColor(-16777216);
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        C53973z1 z1Var = this.f179246t;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        C62197e a1 = mo88090a1();
        if (a1 != null) {
            a1.f176830g1 = false;
        }
        this.f179247u = false;
    }
}
