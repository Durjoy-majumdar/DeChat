package f50;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.TextureView;
import b50.C54407c;
import b50.C54425k;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.live2.impl.V2TXLiveDefInner;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct;
import com.tencent.p014mm.live.core.core.player.FinderPageExitPlayerDetector;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLivePlayConfig;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import d50.C58108b;
import fs3.C59314b;
import fs3.C59316c;
import fy3.C32224a;
import fy3.C32227p;
import gs3.C59698c;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import o40.C61926c;
import org.json.JSONObject;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C64890zp2;
import w50.C65928b;
import w50.C65940n;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;
import z40.C66733d;

/* renamed from: f50.b */
public abstract class C58916b<Player extends TXLivePlayer> implements C58924d {

    /* renamed from: d */
    public final Context f168599d;

    /* renamed from: e */
    public final C59316c<C58924d> f168600e;

    /* renamed from: f */
    public final C59314b f168601f;

    /* renamed from: g */
    public final ArrayList<C58925e> f168602g = new ArrayList<>();

    /* renamed from: h */
    public WeakReference<TXCloudVideoView> f168603h;

    /* renamed from: i */
    public boolean f168604i;

    /* renamed from: j */
    public String f168605j = "";

    /* renamed from: n */
    public int f168606n;

    /* renamed from: o */
    public C64890zp2 f168607o;

    /* renamed from: p */
    public final C13601g f168608p = C36568h.m40985a(new C58922f(this));

    @C91590f(mo125468c = "com.tencent.mm.live.core.core.player.BaseLiveTXPlayer$finalize$1", mo125469f = "BaseLiveTXPlayer.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: f50.b$a */
    public static final class C58917a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {
        public C58917a(C15601d<? super C58917a> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C58917a(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C0000n0 n0Var = (C0000n0) obj;
            return new C58917a((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            FinderLiveErrorReportStruct finderLiveErrorReportStruct = new FinderLiveErrorReportStruct();
            finderLiveErrorReportStruct.f155539e = 3;
            Log.m105924i("BaseLiveTXPlayer", "ilog report gc");
            finderLiveErrorReportStruct.mo86054n();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f50.b$b */
    public static final class C58918b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58916b<Player> f168609d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58918b(C58916b<Player> bVar) {
            super(0);
            this.f168609d = bVar;
        }

        public Object invoke() {
            Iterator<C58925e> it = this.f168609d.f168602g.iterator();
            while (it.hasNext()) {
                it.next().mo75898X2();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f50.b$c */
    public static final class C58919c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58916b<Player> f168610d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58919c(C58916b<Player> bVar) {
            super(0);
            this.f168610d = bVar;
        }

        public Object invoke() {
            Iterator<C58925e> it = this.f168610d.f168602g.iterator();
            while (it.hasNext()) {
                it.next().mo75899s();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f50.b$d */
    public static final class C58920d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58916b<Player> f168611d;

        /* renamed from: e */
        public final /* synthetic */ C64890zp2 f168612e;

        /* renamed from: f */
        public final /* synthetic */ String f168613f;

        /* renamed from: g */
        public final /* synthetic */ int f168614g;

        /* renamed from: h */
        public final /* synthetic */ String f168615h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58920d(C58916b<Player> bVar, C64890zp2 zp22, String str, int i, String str2) {
            super(0);
            this.f168611d = bVar;
            this.f168612e = zp22;
            this.f168613f = str;
            this.f168614g = i;
            this.f168615h = str2;
        }

        public Object invoke() {
            this.f168611d.mo84124m(C65928b.m77657c(this.f168612e, this.f168613f));
            this.f168611d.mo84112c().startPlay(this.f168613f, this.f168614g);
            this.f168611d.f168600e.f169615c.putString("key_play_url", this.f168615h);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f50.b$e */
    public static final class C58921e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58916b<Player> f168616d;

        /* renamed from: e */
        public final /* synthetic */ boolean f168617e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58921e(C58916b<Player> bVar, boolean z) {
            super(0);
            this.f168616d = bVar;
            this.f168617e = z;
        }

        public Object invoke() {
            this.f168616d.mo84112c().stopPlay(this.f168617e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f50.b$f */
    public static final class C58922f extends C87413o implements C32224a<Player> {

        /* renamed from: d */
        public final /* synthetic */ C58916b<Player> f168618d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58922f(C58916b<Player> bVar) {
            super(0);
            this.f168618d = bVar;
        }

        public Object invoke() {
            C58916b<Player> bVar = this.f168618d;
            Player a = bVar.mo84110a(bVar.f168599d);
            a.enableHardwareDecode(true);
            C54425k.f152655a.mo75239a("BaseLiveTXPlayer");
            C65928b bVar2 = C65928b.f189533a;
            C13601g gVar = C65928b.f189534b;
            if (((Boolean) ((C36570n) gVar).getValue()).booleanValue()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ProviderConstants.API_PATH, V2TXLiveDefInner.TXLivePropertyKey.kV2SetAudioCodecType);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", 1);
                C13598b0 b0Var = C13598b0.f38549a;
                jSONObject.put("params", jSONObject2);
                String jSONObject3 = jSONObject.toString();
                C87412m.m108593f(jSONObject3, "JSONObject().apply{\n    …             }.toString()");
                a.callExperimentalAPI(jSONObject3);
            }
            Log.m105924i("BaseLiveTXPlayer", "create txLivePlayer enableAudioCodec:" + ((Boolean) ((C36570n) gVar).getValue()).booleanValue());
            return a;
        }
    }

    public C58916b(Context context) {
        C87412m.m108594g(context, "context");
        this.f168599d = context;
        C59316c<C58924d> cVar = new C59316c<>(this);
        this.f168600e = cVar;
        this.f168601f = new C59314b(cVar.mo84417a());
    }

    /* renamed from: a */
    public abstract Player mo84110a(Context context);

    /* renamed from: b */
    public boolean mo84111b() {
        return this.f168604i;
    }

    /* renamed from: c */
    public final Player mo84112c() {
        return (TXLivePlayer) this.f168608p.getValue();
    }

    public void callExperimentalAPI(String str) {
        C87412m.m108594g(str, "jsonStr");
        Log.m105924i("BaseLiveTXPlayer", "callExperimentalAPI jsonStr:" + str);
        if (!(str.length() == 0)) {
            mo84112c().callExperimentalAPI(str);
        }
    }

    public boolean enableHardwareDecode(boolean z) {
        return mo84112c().enableHardwareDecode(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x02e6  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo84115f(java.lang.String r24, int r25, te3.C64890zp2 r26) {
        /*
            r23 = this;
            r6 = r23
            r5 = r24
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            java.lang.String r1 = "url"
            gy3.C87412m.m108594g(r5, r1)
            r6.f168605j = r5
            r4 = r25
            r6.f168606n = r4
            r2 = r26
            r6.f168607o = r2
            e50.a r1 = e50.C116693a.f349962W
            if (r1 != 0) goto L_0x0021
            e50.a r1 = new e50.a
            r1.<init>()
            e50.C116693a.f349962W = r1
        L_0x0021:
            e50.a r1 = e50.C116693a.f349962W
            gy3.C87412m.m108591d(r1)
            boolean r1 = e50.C116693a.f349963X
            r7 = 0
            if (r1 == 0) goto L_0x0186
            e50.a r8 = e50.C116693a.f349962W
            if (r8 != 0) goto L_0x0036
            e50.a r8 = new e50.a
            r8.<init>()
            e50.C116693a.f349962W = r8
        L_0x0036:
            e50.a r8 = e50.C116693a.f349962W
            gy3.C87412m.m108591d(r8)
            w50.b r9 = w50.C65928b.f189533a
            java.lang.String r9 = r9.mo89966e(r5)
            boolean r10 = e50.C116693a.f349963X
            java.lang.String r11 = "MicroMsg.MMXp2pWrapper"
            if (r10 == 0) goto L_0x0165
            int r10 = r8.f349986a
            if (r10 != 0) goto L_0x004d
            goto L_0x0165
        L_0x004d:
            java.lang.String r10 = "https://"
            boolean r12 = z04.C112551y.m153819s(r5, r10, r7)
            if (r12 != 0) goto L_0x0074
            java.lang.String r12 = "http://"
            boolean r12 = z04.C112551y.m153819s(r5, r12, r7)
            if (r12 != 0) goto L_0x0074
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "xp2p Wrapper replacePlaybackUrl, unsupported url "
            r8.append(r9)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r8)
            goto L_0x0186
        L_0x0074:
            java.lang.String r12 = "live.p2p.com"
            java.lang.String r13 = com.qcloud.qvb.XNet.proxyOf(r12)
            java.lang.String r14 = "proxyOf(p2pDomain)"
            gy3.C87412m.m108593f(r13, r14)
            boolean r12 = gy3.C87412m.m108589b(r13, r12)
            if (r12 != 0) goto L_0x014f
            java.lang.String r12 = ""
            boolean r12 = gy3.C87412m.m108589b(r13, r12)
            if (r12 == 0) goto L_0x008f
            goto L_0x014f
        L_0x008f:
            boolean r10 = z04.C112551y.m153819s(r5, r10, r7)
            java.lang.String r12 = "voipfinderp2pliveplay.wxqcloud.qq.com"
            java.lang.String r14 = "&xhost="
            java.lang.String r15 = "nativePattern.matcher(in…).replaceAll(replacement)"
            java.lang.String r7 = "compile(pattern)"
            if (r10 == 0) goto L_0x00cc
            java.lang.String r16 = "^https?://"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r16)
            gy3.C87412m.m108593f(r3, r7)
            java.util.regex.Matcher r3 = r3.matcher(r5)
            java.lang.String r3 = r3.replaceAll(r13)
            gy3.C87412m.m108593f(r3, r15)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            r7.append(r14)
            r7.append(r12)
            java.lang.String r3 = "&xscheme=https"
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            r8.f350002q = r3
            goto L_0x00f4
        L_0x00cc:
            java.lang.String r3 = "^http?://"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            gy3.C87412m.m108593f(r3, r7)
            java.util.regex.Matcher r3 = r3.matcher(r5)
            java.lang.String r3 = r3.replaceAll(r13)
            gy3.C87412m.m108593f(r3, r15)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            r7.append(r14)
            r7.append(r12)
            java.lang.String r3 = r7.toString()
            r8.f350002q = r3
        L_0x00f4:
            r8.f350001p = r9
            zt3.t r3 = zt3.C119157j.f356862d
            e50.e r7 = new e50.e
            r7.<init>(r8)
            zt3.j r3 = (zt3.C119157j) r3
            java.lang.String r9 = "MMXp2pWrapper-THREAD-POOL-TAG"
            r3.mo183876g(r7, r9)
            r3 = 1
            r8.f350005t = r3
            zt3.t r3 = zt3.C119157j.f356862d
            e50.f r7 = new e50.f
            r7.<init>(r8)
            zt3.j r3 = (zt3.C119157j) r3
            r3.mo183876g(r7, r9)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "xp2p Wrapper start to p2p play, proxy:"
            r3.append(r7)
            r3.append(r13)
            java.lang.String r7 = " url:"
            r3.append(r7)
            java.lang.String r7 = r8.f350002q
            r3.append(r7)
            java.lang.String r7 = " , oldUrl: "
            r3.append(r7)
            r3.append(r5)
            java.lang.String r7 = " streamId:"
            r3.append(r7)
            java.lang.String r7 = r8.f350001p
            r3.append(r7)
            java.lang.String r7 = " bHttps:"
            r3.append(r7)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r3)
            java.lang.String r3 = r8.f350002q
            goto L_0x0187
        L_0x014f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "xp2p Wrapper start to p2p play, use old url proxy "
            r3.append(r7)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r3)
            goto L_0x0186
        L_0x0165:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "xp2p Wrapper replacePlaybackUrl: "
            r3.append(r7)
            boolean r7 = e50.C116693a.f349963X
            r3.append(r7)
            r7 = 32
            r3.append(r7)
            int r7 = r8.f349986a
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r3)
        L_0x0186:
            r3 = r5
        L_0x0187:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "startPlay "
            r7.append(r8)
            com.tencent.rtmp.TXLivePlayer r8 = r23.mo84112c()
            int r8 = r8.hashCode()
            r7.append(r8)
            java.lang.String r8 = " enableP2P:"
            r7.append(r8)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            java.lang.String r7 = "BaseLiveTXPlayer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            di3.d r1 = di3.C86312j.m106911c(r0)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_live_audio_jbm_param_part1_android
            r9 = -1
            int r1 = r1.mo58779Qe(r8, r9)
            di3.d r8 = di3.C86312j.m106911c(r0)
            h81.h r8 = (h81.C32735h) r8
            h81.h$c r10 = h81.C32735h.C32737c.clicfg_live_audio_jbm_param_part2_android
            int r8 = r8.mo58779Qe(r10, r9)
            if (r1 <= r9) goto L_0x01d3
            if (r8 <= r9) goto L_0x01d3
            r9 = 10000000(0x989680, float:1.4012985E-38)
            int r9 = r1 / r9
            int r9 = r9 % 10
            goto L_0x01d4
        L_0x01d3:
            r9 = 0
        L_0x01d4:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "txLivePlayer get WaveJBM params from Xsystem:["
            r10.append(r11)
            r10.append(r1)
            r11 = 44
            r10.append(r11)
            r10.append(r8)
            java.lang.String r11 = "],useWaveJbm["
            r10.append(r11)
            r10.append(r9)
            r11 = 93
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r12 = "WaveJBM"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r10)
            java.lang.String r10 = "params"
            java.lang.String r13 = "api"
            if (r9 <= 0) goto L_0x025d
            com.tencent.mm.live.core.core.trtc.sdkadapter.feature.WeixinAudioJitterBufferControllerFactory r9 = com.tencent.p014mm.live.core.core.trtc.sdkadapter.feature.WeixinAudioJitterBufferControllerFactory.f157119b
            if (r9 != 0) goto L_0x0211
            com.tencent.mm.live.core.core.trtc.sdkadapter.feature.WeixinAudioJitterBufferControllerFactory r9 = new com.tencent.mm.live.core.core.trtc.sdkadapter.feature.WeixinAudioJitterBufferControllerFactory
            r9.<init>()
            com.tencent.p014mm.live.core.core.trtc.sdkadapter.feature.WeixinAudioJitterBufferControllerFactory.f157119b = r9
        L_0x0211:
            com.tencent.mm.live.core.core.trtc.sdkadapter.feature.WeixinAudioJitterBufferControllerFactory r9 = com.tencent.p014mm.live.core.core.trtc.sdkadapter.feature.WeixinAudioJitterBufferControllerFactory.f157119b
            long r14 = r9.mo76386a()
            r9.mo76388c(r1, r8)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r8 = "setAudioJitterBufferFactory"
            r1.put(r13, r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r9 = "controllerFactory"
            r8.put(r9, r14)
            rx3.b0 r9 = rx3.C13598b0.f38549a
            r1.put(r10, r8)
            java.lang.String r1 = r1.toString()
            java.lang.String r8 = "JSONObject().apply{\n    …\n            }.toString()"
            gy3.C87412m.m108593f(r1, r8)
            com.tencent.rtmp.TXLivePlayer r8 = r23.mo84112c()
            r8.callExperimentalAPI(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r8 = "txLivePlayer use WaveJBM as live audio jitter buffer manager, factory["
            r1.append(r8)
            r1.append(r14)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            goto L_0x0263
        L_0x025d:
            java.lang.String r1 = "txLivePlayer use TrtcJBM as live audio jitter buffer manager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
        L_0x0263:
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_finder_live_http_header_content_params_android
            java.lang.String r8 = "X-Tlive-Hot-Stream"
            java.lang.String r0 = r0.Y60(r1, r8)
            if (r0 == 0) goto L_0x027c
            int r1 = r0.length()
            if (r1 != 0) goto L_0x027a
            goto L_0x027c
        L_0x027a:
            r1 = 0
            goto L_0x027d
        L_0x027c:
            r1 = 1
        L_0x027d:
            if (r1 != 0) goto L_0x02e6
            java.lang.String r1 = "reportStreamRspInfo"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r1 = ","
            java.lang.String[] r18 = new java.lang.String[]{r1}
            r19 = 0
            r20 = 0
            r21 = 6
            r22 = 0
            r17 = r0
            java.util.List r0 = z04.C112550d0.m153785U(r17, r18, r19, r20, r21, r22)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x02a1:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x02b1
            java.lang.Object r8 = r0.next()
            java.lang.String r8 = (java.lang.String) r8
            r1.put(r8)
            goto L_0x02a1
        L_0x02b1:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r8 = "enableReportStreamRspInfo"
            r0.put(r13, r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r9 = "ids"
            r8.put(r9, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r0.put(r10, r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JSONObject().apply {\n   …\n            }.toString()"
            gy3.C87412m.m108593f(r0, r1)
            com.tencent.rtmp.TXLivePlayer r1 = r23.mo84112c()
            r1.callExperimentalAPI(r0)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r8 = 0
            r1[r8] = r0
            java.lang.String r0 = "http header set:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r1)
            goto L_0x02eb
        L_0x02e6:
            java.lang.String r0 = "no http header set!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
        L_0x02eb:
            f50.b$d r7 = new f50.b$d
            r0 = r7
            r1 = r23
            r2 = r26
            r4 = r25
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            o40.C61926c.m72668M(r7)
            gs3.c r0 = gs3.C59698c.f170541a
            java.lang.Class<com.tencent.mm.live.core.core.player.FinderPageExitPlayerDetector> r1 = com.tencent.p014mm.live.core.core.player.FinderPageExitPlayerDetector.class
            java.lang.Object r0 = r0.mo84678b(r1)
            com.tencent.mm.live.core.core.player.FinderPageExitPlayerDetector r0 = (com.tencent.p014mm.live.core.core.player.FinderPageExitPlayerDetector) r0
            fs3.c<f50.d> r1 = r6.f168600e
            r0.mo82660d(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f50.C58916b.mo84115f(java.lang.String, int, te3.zp2):void");
    }

    public final void finalize() {
        String a = this.f168600e.mo84417a();
        Log.m105924i(a, "finalize invoke isPlaying: " + isPlaying());
        if (isPlaying()) {
            stopPlay(true);
            C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C58917a((C15601d<? super C58917a>) null), 2, (Object) null);
        }
    }

    public Bitmap getBitmap() {
        TXCloudVideoView tXCloudVideoView;
        TextureView videoView;
        WeakReference<TXCloudVideoView> weakReference = this.f168603h;
        if (weakReference == null || (tXCloudVideoView = weakReference.get()) == null || (videoView = tXCloudVideoView.getVideoView()) == null) {
            return null;
        }
        return videoView.getBitmap();
    }

    public C59314b getEventDetectorAdapter() {
        return this.f168601f;
    }

    public TXLivePlayer getPlayer() {
        return mo84112c();
    }

    public TXCloudVideoView getPlayerView() {
        WeakReference<TXCloudVideoView> weakReference = this.f168603h;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: h */
    public void mo84120h(C58925e eVar) {
        C87412m.m108594g(eVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f168602g.remove(eVar);
        this.f168602g.add(eVar);
        String a = this.f168600e.mo84417a();
        Log.m105924i(a, "addStateChangeListener listener: " + eVar);
    }

    public boolean isPlaying() {
        return mo84112c().isPlaying();
    }

    /* renamed from: k */
    public void mo84122k(C58925e eVar) {
        C87412m.m108594g(eVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f168602g.remove(eVar);
        String a = this.f168600e.mo84417a();
        Log.m105924i(a, "removeStateChangeListener listener: " + eVar);
    }

    /* renamed from: l */
    public boolean mo84123l(C58925e eVar) {
        C87412m.m108594g(eVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        return this.f168602g.contains(eVar);
    }

    /* renamed from: m */
    public void mo84124m(String str) {
        C87412m.m108594g(str, "jsonStr");
        Log.m105924i("BaseLiveTXPlayer", "callDecryExperimentalAPI jsonStr:" + C112550d0.m153795e0(str, "encKey", str));
        if (!(str.length() == 0)) {
            mo84112c().callExperimentalAPI(str);
            int hashCode = mo84112c().hashCode();
            LruCache<Integer, C58108b.C58109a> lruCache = C58108b.f166185a;
            if (hashCode != 0) {
                if (!(str.length() == 0)) {
                    LruCache<Integer, C58108b.C58109a> lruCache2 = C58108b.f166185a;
                    C58108b.C58109a aVar = lruCache2.get(Integer.valueOf(hashCode));
                    if (aVar != null) {
                        aVar.f166186a = hashCode;
                        aVar.f166187b = true;
                        aVar.f166188c = str;
                        aVar.f166189d = false;
                        Log.m105924i("LiveCacheInfo", "setDecryptParams reuse, " + aVar);
                        return;
                    }
                    Integer valueOf = Integer.valueOf(hashCode);
                    C58108b.C58109a aVar2 = new C58108b.C58109a(hashCode, true, str, false);
                    Log.m105924i("LiveCacheInfo", "setDecryptParams new, " + aVar2);
                    C13598b0 b0Var = C13598b0.f38549a;
                    C58108b.C58109a put = lruCache2.put(valueOf, aVar2);
                    return;
                }
            }
            Log.m105920e("LiveCacheInfo", "setDecryptParams error,key:" + hashCode + ",decrypString:" + str);
        }
    }

    public void pause() {
        stopPlay(false);
        C61926c.m72668M(new C58918b(this));
        String a = this.f168600e.mo84417a();
        Log.m105924i(a, "BaseLiveTXPlayer pause curPlayerUrl: " + this.f168605j + " curStreamType: " + this.f168606n + '\"');
        C66733d dVar = C66733d.f191763a;
        C54407c cVar = C66733d.f191764b;
        if (cVar != null) {
            cVar.mo75195L();
        }
    }

    public void resume() {
        String str = this.f168605j;
        if (!(str == null || str.length() == 0)) {
            mo84115f(this.f168605j, this.f168606n, this.f168607o);
        }
        String a = this.f168600e.mo84417a();
        Log.m105924i(a, "BaseLiveTXPlayer resume curPlayerUrl: " + this.f168605j + " curStreamType: " + this.f168606n);
        C61926c.m72668M(new C58919c(this));
        C66733d dVar = C66733d.f191763a;
        C54407c cVar = C66733d.f191764b;
        if (cVar != null) {
            cVar.mo75203d2();
        }
    }

    public void setConfig(TXLivePlayConfig tXLivePlayConfig) {
        mo84112c().setConfig(tXLivePlayConfig);
    }

    public void setMute(boolean z) {
        String a = this.f168600e.mo84417a();
        Log.m105924i(a, "BaseLiveTXPlayer setMute: " + z);
        mo84112c().setMute(z);
        this.f168604i = z;
    }

    public void setPlayListener(ITXLivePlayListener iTXLivePlayListener) {
        mo84112c().setPlayListener(iTXLivePlayListener);
    }

    public void setPlayerView(TXCloudVideoView tXCloudVideoView) {
        SurfaceView surfaceView;
        TextureView videoView;
        String a = this.f168600e.mo84417a();
        StringBuilder sb = new StringBuilder();
        sb.append("BaseLiveTXPlayer setPlayerView ");
        Boolean bool = null;
        sb.append(tXCloudVideoView != null ? Integer.valueOf(tXCloudVideoView.hashCode()) : null);
        sb.append(", text:");
        sb.append((tXCloudVideoView == null || (videoView = tXCloudVideoView.getVideoView()) == null) ? null : Integer.valueOf(videoView.hashCode()));
        sb.append(",surface:");
        if (!(tXCloudVideoView == null || (surfaceView = tXCloudVideoView.getSurfaceView()) == null)) {
            bool = Boolean.valueOf(surfaceView.hasFocus());
        }
        sb.append(bool);
        Log.m105924i(a, sb.toString());
        mo84112c().setPlayerView(tXCloudVideoView);
        this.f168603h = new WeakReference<>(tXCloudVideoView);
    }

    public void setRenderMode(int i) {
        String a = this.f168600e.mo84417a();
        Log.m105924i(a, "BaseLiveTXPlayer setRenderMode " + i);
        mo84112c().setRenderMode(i);
    }

    public void setVolume(int i) {
        mo84112c().setVolume(i);
    }

    public void stopPlay(boolean z) {
        C61926c.m72668M(new C58921e(this, z));
        ((FinderPageExitPlayerDetector) C59698c.f170541a.mo84678b(FinderPageExitPlayerDetector.class)).mo82659c(this.f168600e);
        this.f168601f.mo84416b(6);
    }

    public int switchStream(String str) {
        C87412m.m108594g(str, V2TXJSAdapterConstants.PLAYER_KEY_PLAY_URL);
        String a = this.f168600e.mo84417a();
        Log.m105924i(a, "BaseLiveTXPlayer switchStream: " + str);
        if (C65940n.f189587a != hashCode() || !C87412m.m108589b(C65940n.f189588b, str)) {
            C65940n.f189589c = System.currentTimeMillis();
        }
        C65940n.f189587a = hashCode();
        C65940n.f189588b = str;
        Log.printInfoStack("LivePlayerEventUtil", "saveSwitchStreamInfo time:" + C65940n.f189589c + ",player:" + hashCode() + ",url:" + str, new Object[0]);
        return mo84112c().switchStream(str);
    }
}
