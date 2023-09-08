package yu1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.autogen.mmdata.rpt.FlutterVoIPP2PStruct;
import com.tencent.p014mm.plugin.flutter.voip.manager.FlutterVoipMgr;
import com.tencent.p014mm.plugin.voip.floatcard.VoipFloatCardPermissionDialog;
import com.tencent.p014mm.plugin.voip.model.C106350h0;
import com.tencent.p014mm.plugin.voip.p475ui.VideoActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.pigeon.VoIPFlutterPluginApi;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.util.LinkedHashSet;
import java.util.Set;
import l33.C109247e;
import n33.C109681a;
import p220pr.C62491f;
import p447aw.C103918d;
import rx3.C13604l;
import su1.C110813a;
import uu1.C111222b;
import uu1.C111223c;
import vu1.C111618b;
import vu1.C111619c;
import vu1.C111622e;
import w33.C111730z;
import wu1.C111864b;
import xu1.C112174a;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: yu1.b */
public final class C112489b implements C111222b {

    /* renamed from: d */
    public static final C112489b f336867d = new C112489b();

    /* renamed from: e */
    public static VoIPFlutterPluginApi.VoIPFlutterApi f336868e;

    /* renamed from: f */
    public static String f336869f;

    /* renamed from: g */
    public static String f336870g;

    /* renamed from: h */
    public static final boolean f336871h = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_flutter_voip_destroy_engine_if_idle, true);

    /* renamed from: i */
    public static Set<String> f336872i = new LinkedHashSet();

    /* renamed from: j */
    public static final C39175a f336873j = new C39175a(Looper.getMainLooper());

    /* renamed from: n */
    public static final C0120a0<C13604l<Integer, Long>> f336874n = C112496j.f336909d;

    /* renamed from: o */
    public static final C0120a0<Integer> f336875o = C39179h.f105420d;

    /* renamed from: p */
    public static final C0120a0<Boolean> f336876p = C39180k.f105421d;

    /* renamed from: yu1.b$a */
    public static final class C39175a extends MMHandler {
        public C39175a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            boolean z = true;
            if (message == null || message.what != 1) {
                z = false;
            }
            if (z) {
                Object obj = message.obj;
                if (obj instanceof String) {
                    C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) obj;
                    if (C112489b.f336872i.contains(str)) {
                        Log.m105924i("MicroMsg.FlutterVoipService", "on timeout, clear engine:" + str);
                        ((C62491f) C86312j.m106911c(C62491f.class)).mo87522V3(str);
                        return;
                    }
                    Log.m105924i("MicroMsg.FlutterVoipService", "on timeout, " + str + " is already cleared");
                }
            }
        }
    }

    /* renamed from: yu1.b$b */
    public static final class C39176b<T> implements VoIPFlutterPluginApi.VoIPFlutterApi.Reply {

        /* renamed from: a */
        public final /* synthetic */ C111618b f105416a;

        public C39176b(C111618b bVar) {
            this.f105416a = bVar;
        }

        public void reply(Object obj) {
            Void voidR = (Void) obj;
            Log.m105924i("MicroMsg.FlutterVoipService", "callback onCompleted(" + this.f105416a + ')');
        }
    }

    /* renamed from: yu1.b$c */
    public static final class C39177c<T> implements VoIPFlutterPluginApi.VoIPFlutterApi.Reply {

        /* renamed from: a */
        public final /* synthetic */ C111622e f105417a;

        /* renamed from: b */
        public final /* synthetic */ String f105418b;

        public C39177c(C111622e eVar, String str) {
            this.f105417a = eVar;
            this.f105418b = str;
        }

        public void reply(Object obj) {
            Void voidR = (Void) obj;
            Log.m105924i("MicroMsg.FlutterVoipService", "callback onEvent(" + this.f105417a + ", " + this.f105418b + ')');
        }
    }

    /* renamed from: yu1.b$d */
    public static final class C39178d<T> implements VoIPFlutterPluginApi.VoIPFlutterApi.Reply {

        /* renamed from: a */
        public final /* synthetic */ boolean f105419a;

        public C39178d(boolean z) {
            this.f105419a = z;
        }

        public void reply(Object obj) {
            Void voidR = (Void) obj;
            Log.m105924i("MicroMsg.FlutterVoipService", "callback onModeChanged: " + this.f105419a);
        }
    }

    /* renamed from: yu1.b$h */
    public static final class C39179h<T> implements C0120a0 {

        /* renamed from: d */
        public static final C39179h<T> f105420d = new C39179h<>();

        public void onChanged(Object obj) {
            Integer num = (Integer) obj;
            Log.m105924i("MicroMsg.FlutterVoipService", "physicalOrientationObserver, " + num);
            C112489b bVar = C112489b.f336867d;
            C87412m.m108593f(num, "degree");
            int intValue = num.intValue();
            Log.m105924i("MicroMsg.FlutterVoipService", "onPhysicalOrientationChanged: " + intValue);
            VoIPFlutterPluginApi.VoIPFlutterApi voIPFlutterApi = C112489b.f336868e;
            if (voIPFlutterApi != null) {
                voIPFlutterApi.onDevicePhysicalOrientationChanged(Long.valueOf((long) intValue), new C39184i(intValue));
            }
        }
    }

    /* renamed from: yu1.b$k */
    public static final class C39180k<T> implements C0120a0 {

        /* renamed from: d */
        public static final C39180k<T> f105421d = new C39180k<>();

        public void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C112489b bVar = C112489b.f336867d;
            C87412m.m108593f(bool, "locked");
            boolean booleanValue = bool.booleanValue();
            Log.m105924i("MicroMsg.FlutterVoipService", "onSystemRotateLockedChanged: " + booleanValue);
            VoIPFlutterPluginApi.VoIPFlutterApi voIPFlutterApi = C112489b.f336868e;
            if (voIPFlutterApi != null) {
                voIPFlutterApi.onSystemRotateLockChanged(Boolean.valueOf(booleanValue), new C39188l(booleanValue));
            }
        }
    }

    /* renamed from: yu1.b$e */
    public static final class C112490e implements Runnable {

        /* renamed from: d */
        public static final C112490e f336877d = new C112490e();

        public final void run() {
            VoipFloatCardPermissionDialog.C30531a aVar = VoipFloatCardPermissionDialog.f117099e;
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            aVar.mo57461a(context);
        }
    }

    /* renamed from: yu1.b$f */
    public static final class C112491f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C111223c f336878d;

        /* renamed from: e */
        public final /* synthetic */ int f336879e;

        /* renamed from: f */
        public final /* synthetic */ int f336880f;

        /* renamed from: g */
        public final /* synthetic */ int f336881g;

        /* renamed from: h */
        public final /* synthetic */ int f336882h;

        /* renamed from: i */
        public final /* synthetic */ int f336883i;

        /* renamed from: j */
        public final /* synthetic */ int f336884j;

        /* renamed from: yu1.b$f$a */
        public static final class C112492a<T> implements VoIPFlutterPluginApi.VoIPFlutterApi.Reply {

            /* renamed from: a */
            public final /* synthetic */ C111223c f336885a;

            /* renamed from: b */
            public final /* synthetic */ int f336886b;

            /* renamed from: c */
            public final /* synthetic */ int f336887c;

            /* renamed from: d */
            public final /* synthetic */ int f336888d;

            /* renamed from: e */
            public final /* synthetic */ int f336889e;

            /* renamed from: f */
            public final /* synthetic */ int f336890f;

            /* renamed from: g */
            public final /* synthetic */ int f336891g;

            /* renamed from: h */
            public final /* synthetic */ VoIPFlutterPluginApi.FLTextureInfo f336892h;

            public C112492a(C111223c cVar, int i, int i2, int i3, int i4, int i5, int i6, VoIPFlutterPluginApi.FLTextureInfo fLTextureInfo) {
                this.f336885a = cVar;
                this.f336886b = i;
                this.f336887c = i2;
                this.f336888d = i3;
                this.f336889e = i4;
                this.f336890f = i5;
                this.f336891g = i6;
                this.f336892h = fLTextureInfo;
            }

            public void reply(Object obj) {
                Boolean bool = (Boolean) obj;
                C87412m.m108593f(bool, "ret");
                if (bool.booleanValue()) {
                    C111223c cVar = this.f336885a;
                    cVar.f333051d = this.f336886b;
                    cVar.f333052e = this.f336887c;
                    cVar.f333053f = this.f336888d;
                } else {
                    C111223c cVar2 = this.f336885a;
                    cVar2.f333051d = this.f336889e;
                    cVar2.f333052e = this.f336890f;
                    cVar2.f333053f = this.f336891g;
                }
                Log.m105924i("MicroMsg.FlutterVoipService", "callback onTextureInfoChanged textureId:" + this.f336892h.getTextureId().longValue() + ", width:" + this.f336892h.getWidth().longValue() + ", height:" + this.f336892h.getHeight().longValue() + ", orientation:" + this.f336888d + ", oldWidth:" + this.f336889e + ", oldHeight:" + this.f336890f + ", ret:" + bool);
            }
        }

        public C112491f(C111223c cVar, int i, int i2, int i3, int i4, int i5, int i6) {
            this.f336878d = cVar;
            this.f336879e = i;
            this.f336880f = i2;
            this.f336881g = i3;
            this.f336882h = i4;
            this.f336883i = i5;
            this.f336884j = i6;
        }

        public final void run() {
            VoIPFlutterPluginApi.FLTextureInfo build = new VoIPFlutterPluginApi.FLTextureInfo.Builder().setTextureId(Long.valueOf(this.f336878d.f333048a)).setWidth(Long.valueOf((long) this.f336879e)).setHeight(Long.valueOf((long) this.f336880f)).setMirror(Boolean.FALSE).setQuarterTurns(Long.valueOf((long) this.f336881g)).build();
            C87412m.m108593f(build, "Builder()\n              …ntation.toLong()).build()");
            VoIPFlutterPluginApi.VoIPFlutterApi voIPFlutterApi = C112489b.f336868e;
            if (voIPFlutterApi != null) {
                voIPFlutterApi.onTextureInfoChanged(build, new C112492a(this.f336878d, this.f336879e, this.f336880f, this.f336881g, this.f336882h, this.f336883i, this.f336884j, build));
            }
        }
    }

    /* renamed from: yu1.b$g */
    public static final class C112493g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C112174a.C112177c f336893d;

        /* renamed from: e */
        public final /* synthetic */ int f336894e;

        /* renamed from: f */
        public final /* synthetic */ int f336895f;

        /* renamed from: g */
        public final /* synthetic */ int f336896g;

        /* renamed from: h */
        public final /* synthetic */ int f336897h;

        /* renamed from: i */
        public final /* synthetic */ int f336898i;

        /* renamed from: j */
        public final /* synthetic */ int f336899j;

        /* renamed from: yu1.b$g$a */
        public static final class C112494a<T> implements VoIPFlutterPluginApi.VoIPFlutterApi.Reply {

            /* renamed from: a */
            public final /* synthetic */ C112174a.C112177c f336900a;

            /* renamed from: b */
            public final /* synthetic */ int f336901b;

            /* renamed from: c */
            public final /* synthetic */ int f336902c;

            /* renamed from: d */
            public final /* synthetic */ int f336903d;

            /* renamed from: e */
            public final /* synthetic */ int f336904e;

            /* renamed from: f */
            public final /* synthetic */ int f336905f;

            /* renamed from: g */
            public final /* synthetic */ int f336906g;

            /* renamed from: h */
            public final /* synthetic */ VoIPFlutterPluginApi.FLTextureInfo f336907h;

            public C112494a(C112174a.C112177c cVar, int i, int i2, int i3, int i4, int i5, int i6, VoIPFlutterPluginApi.FLTextureInfo fLTextureInfo) {
                this.f336900a = cVar;
                this.f336901b = i;
                this.f336902c = i2;
                this.f336903d = i3;
                this.f336904e = i4;
                this.f336905f = i5;
                this.f336906g = i6;
                this.f336907h = fLTextureInfo;
            }

            public void reply(Object obj) {
                Boolean bool = (Boolean) obj;
                C87412m.m108593f(bool, "ret");
                if (bool.booleanValue()) {
                    C112174a.C112177c cVar = this.f336900a;
                    cVar.f335887d = this.f336901b;
                    cVar.f335888e = this.f336902c;
                    cVar.f335889f = this.f336903d;
                } else {
                    C112174a.C112177c cVar2 = this.f336900a;
                    cVar2.f335887d = this.f336904e;
                    cVar2.f335888e = this.f336905f;
                    cVar2.f335889f = this.f336906g;
                }
                Log.m105924i("MicroMsg.FlutterVoipService", "callback onTextureInfoChanged textureId:" + this.f336907h.getTextureId().longValue() + ", width:" + this.f336907h.getWidth().longValue() + ", height:" + this.f336907h.getHeight().longValue() + ", orientation:" + this.f336903d + ", oldWidth:" + this.f336904e + ", oldHeight:" + this.f336905f + ", ret:" + bool);
            }
        }

        public C112493g(C112174a.C112177c cVar, int i, int i2, int i3, int i4, int i5, int i6) {
            this.f336893d = cVar;
            this.f336894e = i;
            this.f336895f = i2;
            this.f336896g = i3;
            this.f336897h = i4;
            this.f336898i = i5;
            this.f336899j = i6;
        }

        public final void run() {
            VoIPFlutterPluginApi.FLTextureInfo build = new VoIPFlutterPluginApi.FLTextureInfo.Builder().setTextureId(Long.valueOf(this.f336893d.f335884a)).setWidth(Long.valueOf((long) this.f336894e)).setHeight(Long.valueOf((long) this.f336895f)).setMirror(Boolean.FALSE).setQuarterTurns(Long.valueOf((long) this.f336896g)).build();
            C87412m.m108593f(build, "Builder()\n              …                 .build()");
            VoIPFlutterPluginApi.VoIPFlutterApi voIPFlutterApi = C112489b.f336868e;
            if (voIPFlutterApi != null) {
                voIPFlutterApi.onTextureInfoChanged(build, new C112494a(this.f336893d, this.f336894e, this.f336895f, this.f336896g, this.f336897h, this.f336898i, this.f336899j, build));
            }
        }
    }

    /* renamed from: yu1.b$i */
    public static final class C112495i<T> implements VoIPFlutterPluginApi.VoIPFlutterApi.Reply {

        /* renamed from: a */
        public final /* synthetic */ VoIPFlutterPluginApi.RingtoneInfo.Builder f336908a;

        public C112495i(VoIPFlutterPluginApi.RingtoneInfo.Builder builder) {
            this.f336908a = builder;
        }

        public void reply(Object obj) {
            Void voidR = (Void) obj;
            Log.m105924i("MicroMsg.FlutterVoipService", "callback responseRingtoneInfo(" + this.f336908a.build() + ')');
        }
    }

    /* renamed from: yu1.b$j */
    public static final class C112496j<T> implements C0120a0 {

        /* renamed from: d */
        public static final C112496j<T> f336909d = new C112496j<>();

        public void onChanged(Object obj) {
            C13604l lVar = (C13604l) obj;
            if (lVar != null) {
                VoIPFlutterPluginApi.FLRoomInfo build = new VoIPFlutterPluginApi.FLRoomInfo.Builder().setRoomId(Long.valueOf((long) ((Number) lVar.f38555d).intValue())).setRoomKey(Long.valueOf(((Number) lVar.f38556e).longValue())).build();
                C87412m.m108593f(build, "Builder()\n              …tRoomKey(roomKey).build()");
                VoIPFlutterPluginApi.VoIPFlutterApi voIPFlutterApi = C112489b.f336868e;
                if (voIPFlutterApi != null) {
                    voIPFlutterApi.onRoomReady(build, C39190o.f105433a);
                }
            }
        }
    }

    /* renamed from: B */
    public final void mo164232B(C111622e eVar, String str) {
        C87412m.m108594g(eVar, "type");
        VoIPFlutterPluginApi.EventParams build = new VoIPFlutterPluginApi.EventParams.Builder().setType(Long.valueOf((long) eVar.ordinal())).setMessage(str == null ? "" : str).build();
        C87412m.m108593f(build, "Builder()\n            .s…sage(message?:\"\").build()");
        VoIPFlutterPluginApi.VoIPFlutterApi voIPFlutterApi = f336868e;
        if (voIPFlutterApi != null) {
            voIPFlutterApi.onEvent(build, new C39177c(eVar, str));
        }
    }

    /* renamed from: D */
    public final void mo164233D(boolean z) {
        VoIPFlutterPluginApi.FLBoolType build = new VoIPFlutterPluginApi.FLBoolType.Builder().setValue(Boolean.valueOf(z)).build();
        C87412m.m108593f(build, "Builder()\n            .s…alue(isVideoMode).build()");
        VoIPFlutterPluginApi.VoIPFlutterApi voIPFlutterApi = f336868e;
        if (voIPFlutterApi != null) {
            voIPFlutterApi.onModeChanged(build, new C39178d(z));
        }
        if (!z) {
            C111864b bVar = C111864b.f334908a;
            Log.m105924i("MicroMsg.FlutterVoIPReportAgent", "onSwitchToVoice");
            FlutterVoIPP2PStruct flutterVoIPP2PStruct = C111864b.f334909b;
            int i = 1;
            if (!C111864b.f334912e.f334920h) {
                i = flutterVoIPP2PStruct.f310177e == 1 ? 3 : 2;
            }
            flutterVoIPP2PStruct.f310178f = i;
        }
    }

    public void E90(String str) {
        C87412m.m108594g(str, "engineId");
        C106350h0 xx02 = C109247e.xx0();
        FlutterVoipMgr flutterVoipMgr = new FlutterVoipMgr(str);
        xx02.getClass();
        Log.m105924i("MicroMsg.Voip.VoipService", "setMgr");
        xx02.f317333b = flutterVoipMgr;
        if (f336872i.remove(str)) {
            Log.m105924i("MicroMsg.FlutterVoipService", "remove timeout task for " + str);
        }
    }

    /* renamed from: O */
    public final void mo164234O(int i, int i2) {
        VoIPFlutterPluginApi.VoIPFlutterApi voIPFlutterApi;
        VoIPFlutterPluginApi.VoIPFlutterApi voIPFlutterApi2;
        VoIPFlutterPluginApi.VoIPFlutterApi voIPFlutterApi3;
        C111619c cVar = C111619c.Connecting;
        C111619c cVar2 = C111619c.Finished;
        C111619c a = C111619c.f334120d.mo163290a(i2);
        Log.m105924i("MicroMsg.FlutterVoipService", "onNewState: action=0x" + Integer.toHexString(i) + ", newState=0x" + Integer.toHexString(i2) + ", status:" + a);
        switch (i) {
            case 4097:
                if (a == C111619c.Waiting && (voIPFlutterApi = f336868e) != null) {
                    voIPFlutterApi.onRespond(C39185j.f105426a);
                    break;
                }
            case 4098:
                if (a == cVar2) {
                    mo164239q(C111618b.Canceled);
                    break;
                }
                break;
            case 4099:
                if (a == cVar2) {
                    mo164239q(C111618b.Rejected);
                    break;
                }
                break;
            case 4100:
                if (a == cVar && (voIPFlutterApi2 = f336868e) != null) {
                    voIPFlutterApi2.onAccepted(C39181c.f105422a);
                    break;
                }
            case 4101:
                mo164233D(false);
                break;
            case 4103:
                if (a == cVar2) {
                    mo164239q(C111618b.SelfHangup);
                    C111864b.f334908a.mo163610a();
                    break;
                }
                break;
            case 4104:
                if (a == cVar2) {
                    mo164239q(C111618b.AnotherHangup);
                    break;
                }
                break;
            case 4105:
                if (a == cVar2) {
                    mo164239q(C111618b.InviteTimeout);
                    break;
                }
                break;
            case 4107:
                if (a == cVar2) {
                    mo164239q(C111618b.PhoneComing);
                    break;
                }
                break;
            case 4108:
                if (a == cVar2) {
                    mo164239q(C111618b.Ignored);
                    break;
                }
                break;
            case 4111:
                mo164233D(false);
                if (a == cVar && (voIPFlutterApi3 = f336868e) != null) {
                    voIPFlutterApi3.onAccepted(C39181c.f105422a);
                    break;
                }
        }
        if (i2 == 8 && !((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(MMApplicationContext.getContext())) {
            C119179t tVar = C119157j.f356862d;
            C112490e eVar = C112490e.f336877d;
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(eVar, 2000, false);
        }
    }

    /* renamed from: Q */
    public final void mo164235Q(C111223c cVar, int i, int i2, int i3) {
        C87412m.m108594g(cVar, "surfaceHolder");
        int i4 = cVar.f333051d;
        if (i4 != i || cVar.f333052e != i2 || cVar.f333053f != i3) {
            int i5 = cVar.f333052e;
            int i6 = cVar.f333053f;
            cVar.f333051d = i;
            cVar.f333052e = i2;
            cVar.f333053f = i3;
            cVar.f333050c.f333054d.setDefaultBufferSize(i, i2);
            ((C119157j) C119157j.f356862d).mo183895z(new C112491f(cVar, i, i2, i3, i4, i5, i6));
        }
    }

    /* renamed from: S */
    public final void mo164236S(C112174a.C112177c cVar, int i, int i2, int i3) {
        C87412m.m108594g(cVar, "surfaceHolder");
        int i4 = cVar.f335887d;
        if (i4 != i || cVar.f335888e != i2 || cVar.f335889f != i3) {
            int i5 = cVar.f335888e;
            int i6 = cVar.f335889f;
            cVar.f335887d = i;
            cVar.f335888e = i2;
            cVar.f335889f = i3;
            cVar.f335886c.f337403d.setDefaultBufferSize(i, i2);
            ((C119157j) C119157j.f356862d).mo183895z(new C112493g(cVar, i, i2, i3, i4, i5, i6));
        }
    }

    /* renamed from: d */
    public final void mo164237d() {
        Log.m105924i("MicroMsg.FlutterVoipService", "dispose()");
        C111730z zVar = C111730z.f334576a;
        C111730z.f334572E.removeObserver(f336874n);
        C109247e.vx0().f333442b.removeObserver(f336875o);
        C109247e.vx0().f333447g.removeObserver(f336876p);
        f336868e = null;
        f336870g = null;
        f336869f = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r2 = (r2 = r5.f190083f).f189021e;
     */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo164238f0(wj2.C66132f r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "responseRingtoneInfo: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.FlutterVoipService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.pigeon.VoIPFlutterPluginApi$RingtoneInfo$Builder r0 = new com.tencent.pigeon.VoIPFlutterPluginApi$RingtoneInfo$Builder
            r0.<init>()
            java.lang.String r1 = ""
            if (r5 == 0) goto L_0x0023
            java.lang.String r2 = r5.f190085h
            if (r2 != 0) goto L_0x0024
        L_0x0023:
            r2 = r1
        L_0x0024:
            r0.setTitle(r2)
            if (r5 == 0) goto L_0x002d
            java.lang.String r2 = r5.f190087j
            if (r2 != 0) goto L_0x002e
        L_0x002d:
            r2 = r1
        L_0x002e:
            r0.setSingerName(r2)
            if (r5 == 0) goto L_0x0037
            java.lang.String r2 = r5.f190088k
            if (r2 != 0) goto L_0x0038
        L_0x0037:
            r2 = r1
        L_0x0038:
            r0.setCover(r2)
            if (r5 == 0) goto L_0x004c
            ve3.n0 r2 = r5.f190083f
            if (r2 == 0) goto L_0x004c
            ve3.f0 r2 = r2.f189021e
            if (r2 == 0) goto L_0x004c
            int r2 = r2.f188992n
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x004d
        L_0x004c:
            r2 = 0
        L_0x004d:
            if (r2 != 0) goto L_0x0050
            goto L_0x0059
        L_0x0050:
            int r3 = r2.intValue()
            if (r3 != 0) goto L_0x0059
            java.lang.String r2 = "qq_music"
            goto L_0x0067
        L_0x0059:
            r3 = 1
            if (r2 != 0) goto L_0x005d
            goto L_0x0066
        L_0x005d:
            int r2 = r2.intValue()
            if (r2 != r3) goto L_0x0066
            java.lang.String r2 = "qq_music_vip"
            goto L_0x0067
        L_0x0066:
            r2 = r1
        L_0x0067:
            r0.setVendor(r2)
            if (r5 == 0) goto L_0x006f
            long r2 = r5.f190092o
            goto L_0x0071
        L_0x006f:
            r2 = 0
        L_0x0071:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.setFeedId(r2)
            if (r5 == 0) goto L_0x0080
            java.lang.String r5 = r5.f190093p
            if (r5 != 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r1 = r5
        L_0x0080:
            r0.setNonceId(r1)
            com.tencent.pigeon.VoIPFlutterPluginApi$VoIPFlutterApi r5 = f336868e
            if (r5 == 0) goto L_0x0093
            com.tencent.pigeon.VoIPFlutterPluginApi$RingtoneInfo r1 = r0.build()
            yu1.b$i r2 = new yu1.b$i
            r2.<init>(r0)
            r5.responseRingtoneInfo(r1, r2)
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yu1.C112489b.mo164238f0(wj2.f):void");
    }

    /* renamed from: nW */
    public C109681a mo161936nW(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        return new C110813a((VideoActivity) activity);
    }

    /* renamed from: q */
    public final void mo164239q(C111618b bVar) {
        C87412m.m108594g(bVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        VoIPFlutterPluginApi.FLIntType build = new VoIPFlutterPluginApi.FLIntType.Builder().setValue(Long.valueOf((long) bVar.ordinal())).build();
        C87412m.m108593f(build, "Builder()\n            .s…ordinal.toLong()).build()");
        VoIPFlutterPluginApi.VoIPFlutterApi voIPFlutterApi = f336868e;
        if (voIPFlutterApi != null) {
            voIPFlutterApi.onCompleted(build, new C39176b(bVar));
        }
        C111864b.f334908a.mo163610a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x01e5  */
    /* renamed from: r8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Intent mo161937r8(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "talkerUsername"
            gy3.C87412m.m108594g(r9, r0)
            com.tencent.mm.plugin.voip.model.h0 r0 = l33.C109247e.xx0()
            l33.a r0 = r0.f317333b
            java.lang.String r1 = f336869f
            boolean r2 = r0 instanceof com.tencent.p014mm.plugin.flutter.voip.manager.FlutterVoipMgr
            r3 = 0
            java.lang.String r4 = "MicroMsg.FlutterVoipService"
            if (r2 == 0) goto L_0x0044
            java.lang.String r5 = r0.mo152445S()
            boolean r5 = gy3.C87412m.m108589b(r5, r9)
            if (r5 == 0) goto L_0x0044
            r5 = r0
            com.tencent.mm.plugin.flutter.voip.manager.FlutterVoipMgr r5 = (com.tencent.p014mm.plugin.flutter.voip.manager.FlutterVoipMgr) r5
            boolean r6 = r5.f313171p1
            if (r6 != 0) goto L_0x0044
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "getLaunchIntent(): reuse previous engine, engineId="
            r9.append(r10)
            java.lang.String r10 = r5.f313161f1
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            java.lang.String r1 = r5.f313161f1
            goto L_0x01c0
        L_0x0044:
            java.lang.String r5 = f336870g
            boolean r5 = gy3.C87412m.m108589b(r9, r5)
            if (r5 == 0) goto L_0x0061
            if (r1 == 0) goto L_0x0061
            io.flutter.embedding.engine.FlutterEngineCache r5 = p172io.flutter.embedding.engine.FlutterEngineCache.getInstance()
            boolean r5 = r5.contains(r1)
            if (r5 == 0) goto L_0x0061
            if (r0 != 0) goto L_0x0061
            java.lang.String r9 = "getLaunchIntent(): FlutterVoipMgr hasn't been attached, reuse the previous engine"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            goto L_0x01c0
        L_0x0061:
            java.lang.String r5 = f336870g
            boolean r5 = gy3.C87412m.m108589b(r9, r5)
            if (r5 == 0) goto L_0x008d
            if (r1 == 0) goto L_0x008d
            io.flutter.embedding.engine.FlutterEngineCache r5 = p172io.flutter.embedding.engine.FlutterEngineCache.getInstance()
            boolean r5 = r5.contains(r1)
            if (r5 == 0) goto L_0x008d
            if (r2 == 0) goto L_0x008d
            r2 = r0
            com.tencent.mm.plugin.flutter.voip.manager.FlutterVoipMgr r2 = (com.tencent.p014mm.plugin.flutter.voip.manager.FlutterVoipMgr) r2
            boolean r5 = r2.f313171p1
            if (r5 == 0) goto L_0x008d
            java.lang.String r2 = r2.f313161f1
            boolean r2 = gy3.C87412m.m108589b(r2, r1)
            if (r2 != 0) goto L_0x008d
            java.lang.String r9 = "getLaunchIntent(): FlutterVoipMgr is finished and new engine is available, reuse the previous engine"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            goto L_0x01c0
        L_0x008d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getLaunchIntent(): no reusable FlutterVoipMgr, manager="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = ", username="
            r1.append(r2)
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = r0.mo152445S()
            goto L_0x00a7
        L_0x00a6:
            r0 = 0
        L_0x00a7:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            f336870g = r9
            java.lang.Class<pr.f> r0 = p220pr.C62491f.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "preloadFlutterEngine("
            r1.append(r2)
            r1.append(r9)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            gy3.f0 r1 = new gy3.f0
            r1.<init>()
            boolean r2 = z33.C112595h.f337171f
            java.lang.String r5 = "getService(ICachedFlutte…ginesService::class.java)"
            java.lang.String r6 = "flutter_voip"
            if (r2 == 0) goto L_0x00f0
            if (r10 == 0) goto L_0x00f0
            di3.d r0 = di3.C86312j.m106911c(r0)
            gy3.C87412m.m108593f(r0, r5)
            pr.f r0 = (p220pr.C62491f) r0
            yu1.m r2 = new yu1.m
            r2.<init>(r9, r10, r1)
            rx3.l r9 = r0.zo0(r6, r3, r2)
            goto L_0x0102
        L_0x00f0:
            di3.d r0 = di3.C86312j.m106911c(r0)
            gy3.C87412m.m108593f(r0, r5)
            pr.f r0 = (p220pr.C62491f) r0
            yu1.n r2 = new yu1.n
            r2.<init>(r9, r10)
            rx3.l r9 = r0.zo0(r6, r3, r2)
        L_0x0102:
            A r10 = r9.f38555d
            java.lang.String r10 = (java.lang.String) r10
            B r9 = r9.f38556e
            io.flutter.embedding.engine.FlutterEngine r9 = (p172io.flutter.embedding.engine.FlutterEngine) r9
            com.tencent.mm.plugin.voip.model.h0 r0 = l33.C109247e.xx0()
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            yu1.a r5 = new yu1.a
            r5.<init>(r10)
            com.tencent.mm.plugin.voip.model.m0 r0 = r0.f317332a
            com.tencent.mm.plugin.voip.model.r r0 = r0.f317396a
            r0.f317501y = r2
            r0.f317502z = r5
            java.lang.String r0 = "MicroMsg.Voip.VoipServiceEx"
            java.lang.String r2 = "attach ui........"
            z33.C112597j.m153936a(r0, r2)
            io.flutter.embedding.engine.plugins.PluginRegistry r0 = r9.getPlugins()
            wu1.f r2 = new wu1.f
            T r1 = r1.f27484d
            xu1.a r1 = (xu1.C112174a) r1
            r2.<init>(r1)
            r0.add((p172io.flutter.embedding.engine.plugins.FlutterPlugin) r2)
            wu1.a r1 = new wu1.a
            r1.<init>()
            r0.add((p172io.flutter.embedding.engine.plugins.FlutterPlugin) r1)
            u6.c r1 = new u6.c
            r1.<init>()
            r0.add((p172io.flutter.embedding.engine.plugins.FlutterPlugin) r1)
            java.lang.Class<e10.e> r0 = e10.C97570e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            e10.e r0 = (e10.C97570e) r0
            r0.mo136835u(r9)
            java.lang.Class<ou1.b> r0 = ou1.C62182b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ou1.b r0 = (ou1.C62182b) r0
            r0.mo86832u(r9)
            java.lang.Class<pr.i> r0 = p220pr.C77288i.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            pr.i r0 = (p220pr.C77288i) r0
            r0.mo107438u(r9)
            com.tencent.pigeon.VoIPFlutterPluginApi$VoIPFlutterApi r0 = new com.tencent.pigeon.VoIPFlutterPluginApi$VoIPFlutterApi
            io.flutter.embedding.engine.dart.DartExecutor r9 = r9.getDartExecutor()
            io.flutter.plugin.common.BinaryMessenger r9 = r9.getBinaryMessenger()
            r0.<init>(r9)
            f336868e = r0
            androidx.lifecycle.z<rx3.l<java.lang.Integer, java.lang.Long>> r9 = w33.C111730z.f334572E
            androidx.lifecycle.a0<rx3.l<java.lang.Integer, java.lang.Long>> r0 = f336874n
            r9.observeForever(r0)
            v33.b r9 = l33.C109247e.vx0()
            androidx.lifecycle.z<java.lang.Integer> r9 = r9.f333442b
            androidx.lifecycle.a0<java.lang.Integer> r0 = f336875o
            r9.observeForever(r0)
            v33.b r9 = l33.C109247e.vx0()
            androidx.lifecycle.z<java.lang.Boolean> r9 = r9.f333447g
            androidx.lifecycle.a0<java.lang.Boolean> r0 = f336876p
            r9.observeForever(r0)
            boolean r9 = f336871h
            if (r9 == 0) goto L_0x01a9
            java.util.Set<java.lang.String> r9 = f336872i
            r9.add(r10)
            yu1.b$a r9 = f336873j
            r0 = 1
            android.os.Message r0 = r9.obtainMessage(r0, r10)
            r1 = 600000(0x927c0, double:2.964394E-318)
            r9.sendMessageDelayed(r0, r1)
        L_0x01a9:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "preloadFlutterEngine id:"
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            f336869f = r10
            r1 = r10
        L_0x01c0:
            int r9 = su1.C110813a.f331533f
            java.lang.String r9 = "cachedEngineId"
            gy3.C87412m.m108594g(r1, r9)
            io.flutter.embedding.android.PatchedFlutterActivityController$CachedEngineIntentBuilder r9 = new io.flutter.embedding.android.PatchedFlutterActivityController$CachedEngineIntentBuilder
            java.lang.Class<com.tencent.mm.plugin.voip.ui.VideoActivity> r10 = com.tencent.p014mm.plugin.voip.p475ui.VideoActivity.class
            r9.<init>(r10, r1)
            io.flutter.embedding.android.PatchedFlutterActivityController$CachedEngineIntentBuilder r9 = r9.destroyEngineWithActivity(r3)
            io.flutter.embedding.android.FlutterActivityLaunchConfigs$BackgroundMode r10 = p172io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque
            io.flutter.embedding.android.PatchedFlutterActivityController$CachedEngineIntentBuilder r9 = r9.backgroundMode(r10)
            android.content.Intent r8 = r9.build(r8)
            java.lang.String r9 = "CachedFlutterActivityCon…          .build(context)"
            gy3.C87412m.m108593f(r8, r9)
            boolean r9 = r8 instanceof android.app.Activity
            if (r9 != 0) goto L_0x01ea
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            r8.addFlags(r9)
        L_0x01ea:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yu1.C112489b.mo161937r8(android.content.Context, java.lang.String, boolean):android.content.Intent");
    }

    /* renamed from: rz */
    public String mo161938rz(Intent intent) {
        C87412m.m108594g(intent, "intent");
        if (!intent.hasExtra("cached_engine_id")) {
            return null;
        }
        return intent.getStringExtra("cached_engine_id");
    }
}
