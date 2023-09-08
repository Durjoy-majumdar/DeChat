package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import a43.C103310i;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105169q;
import com.tencent.p014mm.plugin.voip.model.C106336d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager;
import di3.C7335d;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k20.C60958c;
import k20.C9556a;
import lu3.C34379c;
import m11.C109466a;
import mu3.C109639a;
import n11.C109669c;
import n11.C109670d;
import p182kk.C61104a;
import p576jp.C33610c;
import p576jp.C33612d;
import p80.C110194c;
import pu0.C110248b;
import r11.C110483b;
import rx3.C13604l;
import te3.C110968oz;
import z33.C91617n;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w */
public enum C105181w implements C33610c {
    INSTANCE;
    

    /* renamed from: c1 */
    public static final String f312335c1 = null;

    /* renamed from: d1 */
    public static short[] f312336d1;

    /* renamed from: A */
    public C105169q.C105170a f312338A;

    /* renamed from: B */
    public C105169q.C105170a f312339B;

    /* renamed from: C */
    public C105169q.C105170a f312340C;

    /* renamed from: D */
    public C105169q.C105170a f312341D;

    /* renamed from: E */
    public C105169q.C105170a f312342E;

    /* renamed from: F */
    public C105169q.C105170a f312343F;

    /* renamed from: G */
    public C105169q.C105170a f312344G;

    /* renamed from: H */
    public C105169q.C105170a f312345H;

    /* renamed from: I */
    public C105169q.C105170a f312346I;

    /* renamed from: J */
    public OpenVoiceVoIPInterruptListener f312347J;

    /* renamed from: K */
    public boolean f312348K;

    /* renamed from: L */
    public boolean f312349L;

    /* renamed from: M */
    public boolean f312350M;

    /* renamed from: N */
    public boolean f312351N;

    /* renamed from: P */
    public boolean f312352P;

    /* renamed from: Q */
    public C85147b<String> f312353Q;

    /* renamed from: Q0 */
    public C105152j[] f312354Q0;

    /* renamed from: R */
    public long f312355R;

    /* renamed from: R0 */
    public C105126a f312356R0;

    /* renamed from: S */
    public boolean f312357S;

    /* renamed from: S0 */
    public boolean f312358S0;

    /* renamed from: T */
    public boolean f312359T;

    /* renamed from: T0 */
    public MMHandler f312360T0;

    /* renamed from: U */
    public C109670d f312361U;

    /* renamed from: U0 */
    public boolean f312362U0;

    /* renamed from: V */
    public int f312363V;

    /* renamed from: V0 */
    public boolean f312364V0;

    /* renamed from: W */
    public int f312365W;

    /* renamed from: W0 */
    public boolean f312366W0;

    /* renamed from: X */
    public int[] f312367X;

    /* renamed from: X0 */
    public Runnable f312368X0;

    /* renamed from: Y */
    public int[] f312369Y;

    /* renamed from: Y0 */
    public boolean f312370Y0;

    /* renamed from: Z */
    public int f312371Z;

    /* renamed from: Z0 */
    public boolean f312372Z0;

    /* renamed from: a1 */
    public C33612d.C33613a f312373a1;

    /* renamed from: d */
    public final C105134d1 f312374d;

    /* renamed from: e */
    public final C105169q f312375e;

    /* renamed from: f */
    public final C105165o f312376f;

    /* renamed from: g */
    public final C105141g f312377g;

    /* renamed from: h */
    public final C105140f1 f312378h;

    /* renamed from: i */
    public C103310i f312379i;

    /* renamed from: j */
    public final MMHandler f312380j;

    /* renamed from: n */
    public C85161i f312381n;

    /* renamed from: o */
    public C33610c.C33611a f312382o;

    /* renamed from: p */
    public String f312383p;

    /* renamed from: p0 */
    public boolean f312384p0;

    /* renamed from: q */
    public String f312385q;

    /* renamed from: r */
    public String f312386r;

    /* renamed from: s */
    public int f312387s;

    /* renamed from: t */
    public int f312388t;

    /* renamed from: u */
    public int f312389u;

    /* renamed from: v */
    public int f312390v;

    /* renamed from: w */
    public C85147b<C33610c.C33611a> f312391w;

    /* renamed from: x */
    public C85147b<ArrayList<C109669c>> f312392x;

    /* renamed from: x0 */
    public boolean f312393x0;

    /* renamed from: y */
    public C85147b<ArrayList<C109669c>> f312394y;

    /* renamed from: y0 */
    public C105152j[] f312395y0;

    /* renamed from: z */
    public C85147b<Map<String, Object>> f312396z;

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w$a */
    public class C29818a extends MMHandler {

        /* renamed from: a */
        public TelephonyManager f80830a;

        /* renamed from: b */
        public PhoneStateListener f80831b;

        /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w$a$a */
        public class C29819a extends PhoneStateListener {

            /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w$a$a$a */
            public class C29820a implements Runnable {
                public C29820a() {
                }

                public void run() {
                    Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "hy: hy: phone broken. exit room if in room");
                    C105181w wVar = C105181w.this;
                    C33610c.C33611a aVar = C33610c.C33611a.ReasonInCommingCall;
                    C105181w wVar2 = C105181w.INSTANCE;
                    wVar.mo149499f(aVar);
                }
            }

            public C29819a() {
            }

            public void onCallStateChanged(int i, String str) {
                super.onCallStateChanged(i, str);
                if (i == 1) {
                    C105181w.this.mo149500g(new C29820a());
                }
            }
        }

        public C29818a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 272) {
                if (this.f80830a == null) {
                    this.f80830a = (TelephonyManager) MMApplicationContext.getContext().getSystemService("phone");
                    this.f80831b = new C29819a();
                }
                TelephonyManager telephonyManager = this.f80830a;
                PhoneStateListener phoneStateListener = this.f80831b;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(32);
                aVar.mo10233c(phoneStateListener);
                C117292a.m165358d(telephonyManager, aVar.mo10232b(), "com/tencent/mm/plugin/cloudvoip/cloudvoice/service/OpenVoiceService$1", "handleMessage", "(Landroid/os/Message;)V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
                telephonyManager.listen((PhoneStateListener) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(telephonyManager, "com/tencent/mm/plugin/cloudvoip/cloudvoice/service/OpenVoiceService$1", "handleMessage", "(Landroid/os/Message;)V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w$f */
    public class C29821f implements C33612d.C33613a {
        public C29821f() {
        }

        /* renamed from: a */
        public void mo56933a() {
            C105181w wVar = C105181w.this;
            if (!wVar.f312372Z0) {
                wVar.f312372Z0 = true;
                Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "onInterruptionBegin");
                wVar.mo149500g(new C29811p0(wVar));
                return;
            }
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "is interrupting");
        }

        /* renamed from: b */
        public void mo56934b() {
            C105181w wVar = C105181w.this;
            if (wVar.f312372Z0) {
                wVar.f312372Z0 = false;
                Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "onInterruptionEnd");
                return;
            }
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "not call onInterruptionEnd");
        }
    }

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w$c */
    public class C85157c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C85147b f248124d;

        /* renamed from: e */
        public final /* synthetic */ boolean f248125e;

        public C85157c(C85147b bVar, boolean z) {
            this.f248124d = bVar;
            this.f248125e = z;
        }

        public void run() {
            if (C105181w.this.f312381n != C85161i.InRoom) {
                Log.m105920e("MicroMsg.OpenVoice.OpenVoiceService", "hy: not in room!");
                C85147b bVar = this.f248124d;
                if (bVar != null) {
                    bVar.mo118169a(-10086, -1001, "not in room", "");
                    return;
                }
            }
            C105181w.this.f312377g.f312185l = this.f248125e;
            C85147b bVar2 = this.f248124d;
            if (bVar2 != null) {
                bVar2.mo118169a(0, 0, "ok", "");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w$d */
    public class C85158d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C85147b f248127d;

        /* renamed from: e */
        public final /* synthetic */ boolean f248128e;

        public C85158d(C85147b bVar, boolean z) {
            this.f248127d = bVar;
            this.f248128e = z;
        }

        public void run() {
            if (C105181w.this.f312381n != C85161i.InRoom) {
                Log.m105920e("MicroMsg.OpenVoice.OpenVoiceService", "hy: not in room!");
                C85147b bVar = this.f248127d;
                if (bVar != null) {
                    bVar.mo118169a(-10086, -1001, "not in room", "");
                    return;
                }
            }
            C105141g gVar = C105181w.this.f312377g;
            boolean z = this.f248128e;
            gVar.f312186m = z;
            C105181w wVar = C105181w.INSTANCE;
            wVar.getClass();
            boolean z2 = true;
            Object[] objArr = new Object[1];
            objArr[0] = z ? "mute" : "unMute";
            Log.m105925i("MicroMsg.OpenVoice.OpenVoiceService", "hy: onMicMute %s", objArr);
            wVar.mo149500g(new C105164n0(wVar, z));
            if (gVar.f312175b != null) {
                gVar.f312175b.mo161909n(z);
            } else {
                z2 = false;
            }
            C85147b bVar2 = this.f248127d;
            if (bVar2 == null) {
                return;
            }
            if (z2) {
                bVar2.mo118169a(0, 0, "ok", "");
            } else {
                bVar2.mo118169a(-10086, -15, "set mute failed", "");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w$g */
    public static class C85159g implements C80916r<Bundle, Bundle> {
        private C85159g() {
        }

        public Object invoke(Object obj) {
            Bundle bundle = (Bundle) obj;
            Bundle bundle2 = new Bundle();
            bundle2.putString("device_info", C86709a0.m107535s().mo121144k().mo119656Lo(77825));
            return bundle2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w$h */
    public static class C85160h implements C80916r<Bundle, Bundle> {
        private C85160h() {
        }

        public Object invoke(Object obj) {
            Bundle bundle = (Bundle) obj;
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("is_in_voip", C61104a.m71644D() || C91617n.m114968f() || C91617n.m114970h() || C91617n.m114969g());
            return bundle2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w$i */
    public enum C85161i {
        NotInRoom,
        SdkInRoom,
        InRoom
    }

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w$b */
    public class C105182b implements Runnable {
        public C105182b() {
        }

        public void run() {
            C105181w wVar = C105181w.this;
            if (wVar.f312381n == C85161i.NotInRoom && !wVar.f312348K) {
                Log.m105925i("MicroMsg.OpenVoice.OpenVoiceService", "hy: still not join room in %d ms. directly release", Long.valueOf(ApkDownloadManager.INTERVAL));
                C105181w.this.mo149501h(true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w$e */
    public class C105183e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C85147b f312398d;

        /* renamed from: e */
        public final /* synthetic */ boolean f312399e;

        public C105183e(C85147b bVar, boolean z) {
            this.f312398d = bVar;
            this.f312399e = z;
        }

        public void run() {
            if (C105181w.this.f312381n != C85161i.InRoom) {
                Log.m105920e("MicroMsg.OpenVoice.OpenVoiceService", "hy: not in room!");
                C85147b bVar = this.f312398d;
                if (bVar != null) {
                    bVar.mo118169a(-10086, -1001, "not in room", "");
                    return;
                }
            }
            C105141g gVar = C105181w.this.f312377g;
            boolean z = this.f312399e;
            C105149i iVar = gVar.f312174a;
            iVar.getClass();
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "MyshiftSpeaker beSpeakerphoneOn: " + z);
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "MyshiftSpeaker ignoreBluetooth: false");
            StringBuilder sb = new StringBuilder();
            sb.append("MyshiftSpeaker isAvailable: ");
            sb.append(iVar.f312216c.f327637m != null);
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", sb.toString());
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "MyshiftSpeaker isSpeakerSetFailed: " + iVar.f312216c.f327636l);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("MyshiftSpeaker isBluetoothScoAvailable: ");
            AudioManager audioManager = iVar.f312216c.f329358h;
            C87412m.m108594g(audioManager, "audioManager");
            sb4.append(audioManager.isBluetoothScoAvailableOffCall());
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", sb4.toString());
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "MyshiftSpeaker isBluetoothScoOn: " + iVar.f312216c.mo157510m());
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "MyshiftSpeaker isHeadsetPlugged: " + iVar.f312216c.mo157504C());
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "MyshiftSpeaker isSpeakerphoneOn: " + iVar.f312216c.mo161485s());
            boolean d0 = (!z || (!iVar.f312216c.mo157510m() && !iVar.f312216c.mo157504C())) ? iVar.f312216c.mo161489d0(z, false) : false;
            C85147b bVar2 = this.f312398d;
            if (bVar2 == null) {
                return;
            }
            if (d0) {
                bVar2.mo118169a(0, 0, "ok", "");
            } else {
                bVar2.mo118169a(-10086, -15, "set handsFree failed", "");
            }
        }
    }

    /* access modifiers changed from: public */
    static {
        f312335c1 = MMApplicationContext.getApplicationId();
        f312336d1 = new short[]{128, 96, 240, 160, 320, 240, 480, 360, 640, 480, 1280, 720, 1920, 1080};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b5, code lost:
        if (r3.equalsIgnoreCase(r9) == false) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0180  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m141242a(com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w r13, n11.C88873b r14, com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85147b r15, com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85147b r16, com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85147b r17, com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85147b r18, com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85147b r19, com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85147b r20) {
        /*
            r0 = r13
            r1 = r14
            r2 = r15
            com.tencent.mm.sdk.platformtools.MMHandler r3 = r0.f312380j
            java.lang.Runnable r4 = r0.f312368X0
            r3.removeCallbacks(r4)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w$i r3 = r0.f312381n
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w$i r4 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w.C85161i.InRoom
            r5 = -10086(0xffffffffffffd89a, float:NaN)
            r6 = 0
            java.lang.String r7 = "MicroMsg.OpenVoice.OpenVoiceService"
            if (r3 == r4) goto L_0x0191
            boolean r3 = r0.f312348K
            if (r3 == 0) goto L_0x001b
            goto L_0x0191
        L_0x001b:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r4 = "phone"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            java.lang.String r4 = f312335c1
            java.lang.Class<com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w$h> r8 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w.C85160h.class
            android.os.Parcelable r4 = com.tencent.p014mm.ipcinvoker.C80907o.m98783f(r4, r6, r8)
            android.os.Bundle r4 = (android.os.Bundle) r4
            r6 = 0
            if (r4 == 0) goto L_0x003c
            java.lang.String r8 = "is_in_voip"
            boolean r4 = r4.getBoolean(r8)
            goto L_0x003d
        L_0x003c:
            r4 = 0
        L_0x003d:
            r8 = 1
            if (r4 != 0) goto L_0x0050
            int r4 = r3.getCallState()
            r9 = 2
            if (r4 == r9) goto L_0x0050
            int r3 = r3.getCallState()
            if (r3 != r8) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r3 = 0
            goto L_0x0051
        L_0x0050:
            r3 = 1
        L_0x0051:
            if (r3 == 0) goto L_0x0061
            r1 = -7
            java.lang.String r3 = "start audio device failed"
            r13.mo149497c(r15, r5, r1, r3)
            jp.c$a r1 = p576jp.C33610c.C33611a.ReasonDevice
            r13.mo149499f(r1)
            goto L_0x019e
        L_0x0061:
            java.lang.String r3 = r0.f312383p
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            java.lang.String r4 = "MicroMsg.OpenVoice.OpenVoiceSessionMgr"
            if (r3 != 0) goto L_0x00b7
            java.lang.String r3 = r0.f312383p
            java.lang.String r9 = r1.f256331b
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x00b7
            java.lang.String r3 = r0.f312385q
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x00b7
            java.lang.String r3 = r0.f312385q
            java.lang.String r9 = r1.f256332c
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x00b7
            java.lang.String r3 = r1.f256342m
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00cc
            java.lang.String r3 = r1.f256342m
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d1 r9 = r0.f312374d
            java.lang.String r10 = r1.f256331b
            java.util.Map<java.lang.String, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c1> r9 = r9.f312158a
            java.util.concurrent.ConcurrentHashMap r9 = (java.util.concurrent.ConcurrentHashMap) r9
            java.lang.Object r9 = r9.get(r10)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c1 r9 = (com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105132c1) r9
            if (r9 == 0) goto L_0x00af
            boolean r10 = r9.mo149444a()
            if (r10 == 0) goto L_0x00af
            java.lang.String r10 = "hy: has valid sessionKey"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r10)
            java.lang.String r9 = r9.f312154a
            goto L_0x00b1
        L_0x00af:
            java.lang.String r9 = ""
        L_0x00b1:
            boolean r3 = r3.equalsIgnoreCase(r9)
            if (r3 != 0) goto L_0x00cc
        L_0x00b7:
            java.lang.String r3 = "hy: former appid is null, or appid changed or sessionKey change. try full reset"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            boolean r3 = r0.f312349L
            int r3 = r13.mo149501h(r3)
            if (r3 == 0) goto L_0x00cc
            r1 = -2
            java.lang.String r3 = "fatal reset failed"
            r13.mo149497c(r15, r5, r1, r3)
            goto L_0x019e
        L_0x00cc:
            java.lang.String r3 = r1.f256331b
            r0.f312383p = r3
            int r3 = r1.f256330a
            r0.f312387s = r3
            int r3 = r1.f256337h
            r0.f312388t = r3
            int r3 = r1.f256338i
            r0.f312389u = r3
            int r3 = r1.f256339j
            r0.f312390v = r3
            jp.c$a r3 = p576jp.C33610c.C33611a.ReasonUnknown
            r0.f312382o = r3
            java.lang.String r3 = r1.f256332c
            r0.f312385q = r3
            java.lang.String r3 = r1.f256341l
            r0.f312386r = r3
            r3 = r16
            r0.f312391w = r3
            r3 = r17
            r0.f312392x = r3
            r3 = r18
            r0.f312396z = r3
            r3 = r19
            r0.f312394y = r3
            r0.f312357S = r6
            r0.f312359T = r6
            r0.f312348K = r8
            r0.f312352P = r6
            java.lang.String r3 = "joinConferenceSync: release avcCodec: null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.t0 r3 = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.t0
            r3.<init>(r13, r15, r14)
            long r9 = r1.f256344o
            r11 = 0
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x0128
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            r2[r6] = r5
            java.lang.String r5 = "roomId:%d is valid"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r5, r2)
            long r9 = r1.f256344o
            r0.f312355R = r9
        L_0x0128:
            java.lang.String r2 = r1.f256342m
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0180
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r5 = r1.f256342m
            r2[r6] = r5
            java.lang.String r5 = "sessionKey:%s is valid"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r5, r2)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d1 r2 = r0.f312374d
            java.lang.String r5 = r0.f312383p
            java.lang.String r7 = r1.f256342m
            int r1 = r1.f256343n
            java.util.Map<java.lang.String, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c1> r9 = r2.f312158a
            java.util.concurrent.ConcurrentHashMap r9 = (java.util.concurrent.ConcurrentHashMap) r9
            r9.remove(r5)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c1 r9 = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c1
            r9.<init>()
            r9.f312154a = r7
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r9.f312156c = r10
            long r10 = (long) r1
            r9.f312155b = r10
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r6] = r9
            java.lang.String r6 = "hy: setSession sessionKey: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r1)
            java.util.Map<java.lang.String, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c1> r1 = r2.f312158a
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            r1.put(r5, r9)
            r1 = 0
            r4 = 0
            r5 = 0
            java.lang.String r6 = ""
            r14 = r2
            r15 = r1
            r16 = r4
            r17 = r6
            r18 = r9
            r19 = r5
            r20 = r3
            r14.mo149446a(r15, r16, r17, r18, r19, r20)
            goto L_0x0189
        L_0x0180:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d1 r2 = r0.f312374d
            java.lang.String r4 = r0.f312383p
            java.lang.String r1 = r1.f256341l
            r2.mo149447b(r4, r1, r3)
        L_0x0189:
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.f312360T0
            r1 = 272(0x110, float:3.81E-43)
            r0.sendEmptyMessage(r1)
            goto L_0x019e
        L_0x0191:
            java.lang.String r0 = "hy: already in room or joining room!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            if (r2 == 0) goto L_0x019e
            r0 = -1
            java.lang.String r1 = "Already in room or joining"
            r15.mo118169a(r5, r0, r1, r6)
        L_0x019e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w.m141242a(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w, n11.b, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b):void");
    }

    /* renamed from: b */
    public static void m141243b(C105181w wVar, long j, boolean z, C85147b bVar) {
        wVar.getClass();
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "hy: cgiJoinRoom imroomId: " + j);
        wVar.f312362U0 = false;
        wVar.f312364V0 = false;
        wVar.f312366W0 = false;
        C105189y0 y0Var = new C105189y0(wVar, bVar);
        wVar.f312343F = y0Var;
        wVar.f312375e.mo149490b(3, y0Var);
        C105128a1 a1Var = new C105128a1(wVar, bVar);
        wVar.f312344G = a1Var;
        wVar.f312375e.mo149490b(4, a1Var);
        C105188y yVar = new C105188y(wVar, bVar);
        wVar.f312345H = yVar;
        wVar.f312375e.mo149490b(22, yVar);
        C105190z zVar = new C105190z(wVar, bVar);
        wVar.f312346I = zVar;
        wVar.f312375e.mo149490b(23, zVar);
        C105165o oVar = wVar.f312376f;
        oVar.f312278a.clear();
        oVar.f312279b.clear();
        C105129b0 b0Var = new C105129b0(wVar);
        wVar.f312340C = b0Var;
        wVar.f312375e.mo149490b(20, b0Var);
        C105133d0 d0Var = new C105133d0(wVar);
        wVar.f312342E = d0Var;
        wVar.f312375e.mo149490b(21, d0Var);
        C85152f0 f0Var = new C85152f0(wVar);
        wVar.f312338A = f0Var;
        wVar.f312375e.mo149490b(24, f0Var);
        C105147h0 h0Var = new C105147h0(wVar);
        wVar.f312339B = h0Var;
        wVar.f312375e.mo149490b(26, h0Var);
        C105165o oVar2 = wVar.f312376f;
        C105150i0 i0Var = new C105150i0(wVar);
        synchronized (oVar2.f312282e) {
            oVar2.f312282e.add(i0Var);
        }
        C105165o oVar3 = wVar.f312376f;
        oVar3.getClass();
        oVar3.f312283f = ((C119157j) C119157j.f356862d).mo183872c(new C105161n(oVar3), 1000, 1000);
        int i = wVar.f312388t;
        String[] strArr = C105172s.f312295a;
        C110968oz ozVar = new C110968oz();
        ozVar.f332189d = j;
        ozVar.f332191f = i;
        ozVar.f332194i = 4;
        ozVar.f332193h = true;
        ozVar.f332192g = z;
        int i2 = -1;
        try {
            i2 = C105172s.f312297c.JoinRoom(ozVar.toByteArray(), ozVar.toByteArray().length);
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "join room ret:" + i2);
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.OpenVoice.OpenVoiceNativeEngine", e, "JoinRoom exception", new Object[0]);
        }
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "joinRoom ret:" + i2);
        if (i2 != 0) {
            wVar.f312362U0 = false;
            wVar.f312364V0 = false;
            wVar.f312366W0 = false;
            wVar.mo149497c(bVar, -10086, -4, "join room sdk failed: " + i2);
            return;
        }
        wVar.f312362U0 = true;
        wVar.mo149506m(bVar);
    }

    /* renamed from: c */
    public final void mo149497c(C85147b<ArrayList<C109669c>> bVar, int i, int i2, String str) {
        this.f312348K = false;
        if (i == 0 && i2 == 0) {
            this.f312381n = C85161i.InRoom;
        }
        synchronized (this.f312375e) {
            this.f312375e.mo149491c(3, this.f312343F);
            this.f312375e.mo149491c(4, this.f312344G);
            this.f312375e.mo149491c(22, this.f312345H);
            this.f312375e.mo149491c(23, this.f312346I);
            this.f312343F = null;
            this.f312344G = null;
            this.f312345H = null;
            this.f312346I = null;
        }
        ArrayList<C109669c> arrayList = this.f312376f.f312278a;
        if (bVar != null) {
            bVar.mo118169a(i, i2, str, arrayList);
        }
        C85147b<Map<String, Object>> bVar2 = this.f312396z;
        if (bVar2 != null) {
            bVar2.mo118169a(0, 0, "", this.f312376f.mo149484a());
        }
    }

    /* renamed from: e */
    public final void mo149498e() {
        C105165o oVar = this.f312376f;
        oVar.f312278a.clear();
        oVar.f312279b.clear();
        C105165o oVar2 = this.f312376f;
        synchronized (oVar2.f312282e) {
            oVar2.f312282e.clear();
        }
        C34379c<?> cVar = oVar2.f312283f;
        if (cVar != null) {
            cVar.cancel(false);
        }
        C105141g gVar = this.f312377g;
        C105149i iVar = gVar.f312174a;
        if (iVar != null) {
            synchronized (iVar.f312214a) {
                Log.m105925i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "stopPlay, isStart: %s %s", Boolean.valueOf(iVar.f312215b), Integer.valueOf(iVar.hashCode()));
                if (iVar.f312215b) {
                    C109466a aVar = iVar.f312216c;
                    C106336d dVar = aVar.f327637m;
                    if (dVar != null) {
                        dVar.mo152546e();
                        dVar.mo152547f();
                        aVar.f327637m = null;
                    }
                    iVar.f312217d.mo72289b();
                    Log.m105924i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "stopPlaying cost: " + iVar.f312217d.mo72288a());
                    iVar.f312215b = false;
                }
            }
        }
        gVar.f312185l = false;
        if (gVar.f312175b != null) {
            gVar.f312175b.mo161907l();
            gVar.f312175b = null;
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "finish pauseRecord");
        }
        gVar.f312177d = 3;
        C109466a aVar2 = gVar.f312174a.f312216c;
        aVar2.mo157511t();
        aVar2.mo161477T("openvoice");
        aVar2.f327638n.mo139414a();
        C7335d c = C86312j.m106911c(C110248b.class);
        C87412m.m108593f(c, "getService(SubCoreAudio::class.java)");
        ((C110248b) c).f329778d.unRegisterBroadcasts();
        gVar.f312174a.f312216c.getClass();
        C110248b.C110249a aVar3 = C110248b.f329777h;
        aVar3.mo161670o("openvoice");
        aVar3.mo161659d().f329778d.unRegisterBroadcasts();
        this.f312378h.mo149453c();
        synchronized (this.f312375e) {
            this.f312375e.mo149491c(24, this.f312338A);
            this.f312375e.mo149491c(26, this.f312339B);
            this.f312375e.mo149491c(20, this.f312340C);
            this.f312375e.mo149491c(21, this.f312342E);
            this.f312375e.mo149491c(27, this.f312341D);
            this.f312338A = null;
            this.f312339B = null;
            this.f312340C = null;
            this.f312342E = null;
            this.f312341D = null;
        }
    }

    /* renamed from: f */
    public final int mo149499f(C33610c.C33611a aVar) {
        SurfaceTexture surfaceTexture;
        int i = 0;
        this.f312350M = false;
        C29810b1 b1Var = C29810b1.INSTANCE;
        synchronized (b1Var) {
            b1Var.f80822d = false;
        }
        MultiProcessMMKV.getMMKV("" + this.f312383p + "_wxa_voip").putBoolean("isCameraStart", false);
        Log.m105925i("MicroMsg.OpenVoice.OpenVoiceService", "appId:%s, exitConferenceSync set isCameraStart false", this.f312383p);
        C103310i iVar = this.f312379i;
        if (!(iVar != null ? !iVar.f304601e : true)) {
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "exitConferenceSync, stop ring");
            C103310i iVar2 = this.f312379i;
            if (iVar2 != null) {
                iVar2.mo143090f();
            }
        }
        Log.m105925i("MicroMsg.OpenVoice.OpenVoiceService", "hy: trigger exit with reason: %s", aVar);
        if (this.f312370Y0) {
            OpenVoiceVoIPInterruptListener openVoiceVoIPInterruptListener = this.f312347J;
            if (openVoiceVoIPInterruptListener != null) {
                openVoiceVoIPInterruptListener.f248093a = null;
                openVoiceVoIPInterruptListener.mo118164b();
            }
            this.f312370Y0 = false;
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "unregisterInterruptCallback");
        }
        this.f312382o = aVar;
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "exitConferenceSync: release avcCodec: null");
        if (this.f312348K) {
            Log.m105928w("MicroMsg.OpenVoice.OpenVoiceService", "hy: current joining room. waiting for exiting after joining");
            this.f312352P = true;
            return -9999;
        } else if (this.f312381n == C85161i.NotInRoom) {
            Log.m105928w("MicroMsg.OpenVoice.OpenVoiceService", "hy: not in room! maybe is joining room");
            return 0;
        } else {
            int ordinal = aVar.ordinal();
            if (ordinal == 1) {
                i = 1;
            } else if (ordinal == 2) {
                i = 8;
            } else if (ordinal == 3) {
                i = 6;
            } else if (ordinal == 5) {
                i = 7;
            }
            int ExitRoom = C105172s.f312297c.ExitRoom(i);
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "exitRoom ret:" + ExitRoom);
            this.f312380j.postDelayed(this.f312368X0, ApkDownloadManager.INTERVAL);
            C109670d dVar = this.f312361U;
            dVar.getClass();
            Log.m105924i("MicroMsg.MTR.OpenVoiceRenderLogic", "close");
            C13604l<C110194c, ? extends SurfaceTexture> lVar = dVar.f328298c;
            if (!(lVar == null || (surfaceTexture = (SurfaceTexture) lVar.f38556e) == null)) {
                surfaceTexture.release();
            }
            dVar.f328298c = null;
            if (dVar.f328297b != null) {
                Log.m105924i("MicroMsg.MTR.OpenVoiceEngineOp", "stopDecodeVideo");
                INSTANCE.mo149505l((C105137e) null);
            }
            if (dVar.f328297b != null) {
                Log.m105924i("MicroMsg.MTR.OpenVoiceEngineOp", "stopDecodeScreen");
            }
            dVar.f328297b = null;
            C110483b bVar = dVar.f328296a;
            if (bVar != null) {
                bVar.close();
            }
            dVar.f328296a = null;
            return ExitRoom;
        }
    }

    /* renamed from: g */
    public void mo149500g(Runnable runnable) {
        if (this.f312380j.getSerialTag().equals(C109639a.m148954e())) {
            runnable.run();
        } else {
            this.f312380j.post(runnable);
        }
    }

    /* renamed from: h */
    public final int mo149501h(boolean z) {
        Log.m105925i("MicroMsg.OpenVoice.OpenVoiceService", "hy: reset sync, sdkReset %b", Boolean.valueOf(z));
        C105134d1 d1Var = this.f312374d;
        String str = this.f312383p;
        d1Var.getClass();
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceSessionMgr", "hy: on exit");
        if (!Util.isNullOrNil(str)) {
            ((ConcurrentHashMap) d1Var.f312158a).remove(str);
        }
        C105179v.f312324a = 0;
        C105179v.f312325b = 0;
        C105179v.f312326c = 0;
        C105179v.f312327d = 0;
        C105179v.f312328e = 0;
        C105179v.f312329f = 0;
        C105179v.f312330g = 0;
        C105179v.f312331h = 0;
        C105179v.f312332i = 0;
        this.f312383p = null;
        this.f312385q = null;
        mo149498e();
        this.f312349L = false;
        C29812t tVar = C29812t.INSTANCE;
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceNetworkMgr", "hy: stop listen to network change");
        tVar.mo56930a(1);
        if (z) {
            int UnInit = C105172s.f312297c.UnInit();
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "unInit ret:" + UnInit);
            return UnInit;
        }
        this.f312375e.mo149489a(false);
        this.f312360T0.sendEmptyMessage(272);
        for (int i = 0; i < 2; i++) {
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "mScreenEncStatusList[" + i + "] = " + this.f312367X[i] + ", mHWScreenEncoderList[" + i + "] = " + this.f312395y0[i]);
            this.f312367X[i] = 0;
            this.f312395y0[i] = null;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "mVideoEncStatusList[" + i2 + "] = " + this.f312369Y[i2] + ", mHWVideoEncoderList[" + i2 + "] = " + this.f312354Q0[i2]);
            this.f312369Y[i2] = 0;
            this.f312354Q0[i2] = null;
        }
        this.f312371Z = 0;
        this.f312384p0 = false;
        this.f312393x0 = true;
        return 0;
    }

    /* renamed from: i */
    public void mo149502i(boolean z, C85147b<String> bVar) {
        Log.m105925i("MicroMsg.OpenVoice.OpenVoiceService", "hy: set handsFree: %b", Boolean.valueOf(z));
        mo149500g(new C105183e(bVar, z));
    }

    /* renamed from: j */
    public void mo149503j(boolean z, C85147b<String> bVar) {
        Log.m105925i("MicroMsg.OpenVoice.OpenVoiceService", "hy: set mute play: %b", Boolean.valueOf(z));
        mo149500g(new C85157c(bVar, z));
    }

    /* renamed from: k */
    public void mo149504k(boolean z, C85147b<String> bVar) {
        Log.m105925i("MicroMsg.OpenVoice.OpenVoiceService", "hy: set mute record: %b", Boolean.valueOf(z));
        mo149500g(new C85158d(bVar, z));
    }

    /* renamed from: l */
    public void mo149505l(C105137e eVar) {
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "setVideoFrameCallback: " + eVar);
        C105169q qVar = this.f312375e;
        if (qVar != null) {
            qVar.getClass();
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceNativeCallbackMgr", "setFrameCallback: " + eVar);
            qVar.f312292c = eVar;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0183  */
    /* renamed from: m */
    public final void mo149506m(com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85147b<java.util.ArrayList<n11.C109669c>> r18) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            java.lang.String r0 = "MicroMsg.OpenVoice.OpenVoiceService"
            java.lang.String r3 = "hy: try trigger succ: %b %b %b"
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            boolean r6 = r1.f312362U0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r7 = 0
            r5[r7] = r6
            boolean r6 = r1.f312364V0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r8 = 1
            r5[r8] = r6
            boolean r6 = r1.f312366W0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r9 = 2
            r5[r9] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r5)
            boolean r0 = r1.f312362U0
            if (r0 == 0) goto L_0x0292
            boolean r0 = r1.f312366W0
            if (r0 == 0) goto L_0x0292
            boolean r0 = r1.f312364V0
            if (r0 == 0) goto L_0x0292
            boolean r0 = r1.f312352P
            r3 = -10086(0xffffffffffffd89a, float:NaN)
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = "MicroMsg.OpenVoice.OpenVoiceService"
            java.lang.String r4 = "hy: require exit. try exit exit again"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r4)
            r0 = -9
            java.lang.String r4 = "interrupted because already cancelled or entered background"
            r1.mo149497c(r2, r3, r0, r4)
            jp.c$a r0 = r1.f312382o
            int r0 = r1.mo149499f(r0)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b<java.lang.String> r2 = r1.f312353Q
            if (r2 == 0) goto L_0x0064
            java.lang.String r4 = ""
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = "ok"
            r2.mo118169a(r7, r7, r0, r4)
            goto L_0x0064
        L_0x005d:
            r0 = -17
            java.lang.String r5 = "exit failed"
            r2.mo118169a(r3, r0, r5, r4)
        L_0x0064:
            r1.f312352P = r7
            r0 = 0
            r1.f312353Q = r0
            goto L_0x0292
        L_0x006b:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.f1 r5 = r1.f312378h
            r5.getClass()
            java.lang.String r0 = "MicroMsg.OpenVoice.OpenVoiceVideoMgr"
            java.lang.String r6 = "startPlay"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r6)
            monitor-enter(r5)     // Catch:{ Exception -> 0x0086 }
            boolean r0 = r5.f312170c     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x007f
            monitor-exit(r5)     // Catch:{ all -> 0x0083 }
            goto L_0x00a2
        L_0x007f:
            r5.f312170c = r8     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)     // Catch:{ all -> 0x0083 }
            goto L_0x00a2
        L_0x0083:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0083 }
            throw r0     // Catch:{ Exception -> 0x0086 }
        L_0x0086:
            r0 = move-exception
            java.lang.String r5 = "MicroMsg.OpenVoice.OpenVoiceVideoMgr"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "startPlay error:"
            r6.append(r10)
            java.lang.String r0 = r0.toString()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x00a2:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g r0 = r1.f312377g
            int r5 = r0.f312177d
            if (r5 == r9) goto L_0x00b1
            java.lang.String r0 = "MicroMsg.OpenVoice.OpenVoiceAudioMgr"
            java.lang.String r4 = "hy: error not init when start record!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)
            goto L_0x0170
        L_0x00b1:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.i r5 = r0.f312174a
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.h r6 = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.h
            r6.<init>(r0)
            int r10 = r0.f312187n
            int r11 = r0.f312188o
            int r12 = r0.f312189p
            r5.getClass()
            java.lang.String r13 = "MicroMsg.OpenVoice.OpenVoiceAudioPlayer"
            java.lang.String r14 = "hy: start play with %d, %d, %d"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            r4[r7] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            r4[r8] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            r4[r9] = r15
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r13, r14, r4)
            java.lang.Object r4 = r5.f312214a
            monitor-enter(r4)
            boolean r13 = r5.f312215b     // Catch:{ all -> 0x028f }
            if (r13 == 0) goto L_0x00ef
            java.lang.String r5 = "MicroMsg.OpenVoice.OpenVoiceAudioPlayer"
            java.lang.String r6 = "startPlay, already start"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r6)     // Catch:{ all -> 0x028f }
            r5 = -1
            monitor-exit(r4)     // Catch:{ all -> 0x028f }
            goto L_0x016c
        L_0x00ef:
            java.lang.String r13 = "MicroMsg.OpenVoice.OpenVoiceAudioPlayer"
            java.lang.String r14 = "startPlay %s"
            java.lang.Object[] r15 = new java.lang.Object[r8]     // Catch:{ all -> 0x028f }
            int r16 = r5.hashCode()     // Catch:{ all -> 0x028f }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x028f }
            r15[r7] = r16     // Catch:{ all -> 0x028f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r14, r15)     // Catch:{ all -> 0x028f }
            m11.a r13 = r5.f312216c     // Catch:{ all -> 0x028f }
            r13.getClass()     // Catch:{ all -> 0x028f }
            com.tencent.mm.plugin.voip.model.d r14 = r13.f327637m     // Catch:{ all -> 0x028f }
            if (r14 != 0) goto L_0x0116
            com.tencent.mm.plugin.voip.model.d r14 = new com.tencent.mm.plugin.voip.model.d     // Catch:{ all -> 0x028f }
            r14.<init>()     // Catch:{ all -> 0x028f }
            r13.f327637m = r14     // Catch:{ all -> 0x028f }
            r14.mo152544c(r10, r11, r12, r7)     // Catch:{ all -> 0x028f }
        L_0x0116:
            com.tencent.mm.plugin.voip.model.d r10 = r13.f327637m     // Catch:{ all -> 0x028f }
            if (r10 == 0) goto L_0x0121
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x028f }
            r10.mo152543b(r11, r7)     // Catch:{ all -> 0x028f }
        L_0x0121:
            com.tencent.mm.plugin.voip.model.d r10 = r13.f327637m     // Catch:{ all -> 0x028f }
            if (r10 == 0) goto L_0x0127
            r10.f317212q = r6     // Catch:{ all -> 0x028f }
        L_0x0127:
            if (r10 == 0) goto L_0x012e
            int r6 = r10.mo152545d()     // Catch:{ all -> 0x028f }
            goto L_0x012f
        L_0x012e:
            r6 = 0
        L_0x012f:
            nj.g$a r10 = r5.f312217d     // Catch:{ all -> 0x028f }
            r10.mo72289b()     // Catch:{ all -> 0x028f }
            java.lang.String r10 = "MicroMsg.OpenVoice.OpenVoiceAudioPlayer"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x028f }
            r11.<init>()     // Catch:{ all -> 0x028f }
            java.lang.String r12 = "startPlaying cost: "
            r11.append(r12)     // Catch:{ all -> 0x028f }
            nj.g$a r12 = r5.f312217d     // Catch:{ all -> 0x028f }
            long r12 = r12.mo72288a()     // Catch:{ all -> 0x028f }
            r11.append(r12)     // Catch:{ all -> 0x028f }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x028f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)     // Catch:{ all -> 0x028f }
            java.lang.String r10 = "MicroMsg.OpenVoice.OpenVoiceAudioPlayer"
            java.lang.String r11 = "set start play"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)     // Catch:{ all -> 0x028f }
            r5.f312215b = r8     // Catch:{ all -> 0x028f }
            java.lang.String r5 = "MicroMsg.OpenVoice.OpenVoiceAudioPlayer"
            java.lang.String r10 = "finish start play: %s"
            java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch:{ all -> 0x028f }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x028f }
            r11[r7] = r12     // Catch:{ all -> 0x028f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r11)     // Catch:{ all -> 0x028f }
            monitor-exit(r4)     // Catch:{ all -> 0x028f }
            r5 = r6
        L_0x016c:
            if (r5 > 0) goto L_0x0172
            r0.f312181h = r8
        L_0x0170:
            r0 = 0
            goto L_0x0173
        L_0x0172:
            r0 = 1
        L_0x0173:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g r4 = r1.f312377g
            r4.getClass()
            java.lang.String r5 = "MicroMsg.OpenVoice.OpenVoiceAudioMgr"
            java.lang.String r6 = "hy: trigger start play"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            int r5 = r4.f312177d
            if (r5 == r9) goto L_0x018a
            java.lang.String r5 = "MicroMsg.OpenVoice.OpenVoiceAudioMgr"
            java.lang.String r6 = "hy: not init when start listen!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)
        L_0x018a:
            java.lang.Object r5 = r4.f312180g
            monitor-enter(r5)
            qh.f r6 = r4.f312175b     // Catch:{ all -> 0x028c }
            boolean r6 = r6.mo161906k()     // Catch:{ all -> 0x028c }
            if (r6 != 0) goto L_0x01a2
            qh.f r6 = r4.f312175b     // Catch:{ all -> 0x028c }
            int r6 = r6.f330222a     // Catch:{ all -> 0x028c }
            r9 = 13
            if (r6 == r9) goto L_0x019f
            r4.f312181h = r8     // Catch:{ all -> 0x028c }
        L_0x019f:
            monitor-exit(r5)     // Catch:{ all -> 0x028c }
            r4 = 0
            goto L_0x01bc
        L_0x01a2:
            monitor-exit(r5)     // Catch:{ all -> 0x028c }
            java.lang.String r5 = "MicroMsg.OpenVoice.OpenVoiceAudioMgr"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "VoipDeivceHandler.m_iAudioDevErr:"
            r6.append(r9)
            int r4 = r4.f312181h
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r4)
            r4 = 1
        L_0x01bc:
            n11.d r5 = r1.f312361U
            r5.getClass()
            java.lang.Object[] r6 = new java.lang.Object[r7]
            java.lang.String r9 = "MicroMsg.MTR.OpenVoiceRenderLogic"
            java.lang.String r10 = "startDecodeVideo"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r9, r10, r6)
            r11.b r6 = r5.mo160897c()
            o11.c r9 = r5.f328297b
            if (r9 != 0) goto L_0x01e1
            o11.c r9 = new o11.c
            n11.e r11 = new n11.e
            r11.<init>(r6)
            y11.a r6 = r6.f330383h
            r9.<init>(r11, r6)
            r5.f328297b = r9
        L_0x01e1:
            o11.c r5 = r5.f328297b
            if (r5 == 0) goto L_0x01f1
            java.lang.String r6 = "MicroMsg.MTR.OpenVoiceEngineOp"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r10)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r6 = INSTANCE
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e r5 = r5.f328891c
            r6.mo149505l(r5)
        L_0x01f1:
            n11.d r5 = r1.f312361U
            r5.getClass()
            java.lang.Object[] r6 = new java.lang.Object[r7]
            java.lang.String r9 = "MicroMsg.MTR.OpenVoiceRenderLogic"
            java.lang.String r10 = "startDecodeScreen"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r9, r10, r6)
            r11.b r6 = r5.mo160897c()
            o11.c r9 = r5.f328297b
            if (r9 != 0) goto L_0x0216
            o11.c r9 = new o11.c
            n11.e r11 = new n11.e
            r11.<init>(r6)
            y11.a r6 = r6.f330383h
            r9.<init>(r11, r6)
            r5.f328297b = r9
        L_0x0216:
            o11.c r5 = r5.f328297b
            if (r5 == 0) goto L_0x0226
            java.lang.String r6 = "MicroMsg.MTR.OpenVoiceEngineOp"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r10)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r6 = INSTANCE
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.e r5 = r5.f328891c
            r6.mo149505l(r5)
        L_0x0226:
            if (r0 == 0) goto L_0x022c
            if (r4 == 0) goto L_0x022c
            r5 = 0
            goto L_0x022d
        L_0x022c:
            r5 = 1
        L_0x022d:
            com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105179v.f312324a = r5
            if (r0 == 0) goto L_0x0232
            goto L_0x0241
        L_0x0232:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g r5 = r1.f312377g
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.i r5 = r5.f312174a
            m11.a r5 = r5.f312216c
            com.tencent.mm.plugin.voip.model.d r5 = r5.f327637m
            if (r5 == 0) goto L_0x0241
            int r5 = r5.mo152549h()
            goto L_0x0242
        L_0x0241:
            r5 = 0
        L_0x0242:
            com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105179v.f312326c = r5
            if (r4 == 0) goto L_0x0248
            r5 = 0
            goto L_0x024e
        L_0x0248:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g r5 = r1.f312377g
            qh.f r5 = r5.f312175b
            int r5 = r5.f330222a
        L_0x024e:
            com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105179v.f312325b = r5
            if (r0 == 0) goto L_0x027f
            if (r4 == 0) goto L_0x027f
            r1.f312350M = r8
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b1 r4 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C29810b1.INSTANCE
            monitor-enter(r4)
            r4.f80822d = r8     // Catch:{ all -> 0x027c }
            monitor-exit(r4)     // Catch:{ all -> 0x027c }
            java.lang.String r0 = "ok"
            r1.mo149497c(r2, r7, r7, r0)
            boolean r0 = r1.f312370Y0
            if (r0 == 0) goto L_0x0266
            goto L_0x0292
        L_0x0266:
            r1.f312370Y0 = r8
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.OpenVoiceVoIPInterruptListener r0 = r1.f312347J
            if (r0 == 0) goto L_0x0273
            jp.d$a r2 = r1.f312373a1
            r0.f248093a = r2
            r0.mo118163a()
        L_0x0273:
            java.lang.String r0 = "MicroMsg.OpenVoice.OpenVoiceService"
            java.lang.String r2 = "registerInterruptCallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            goto L_0x0292
        L_0x027c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x027c }
            throw r0
        L_0x027f:
            r0 = -7
            java.lang.String r4 = "start audio device failed"
            r1.mo149497c(r2, r3, r0, r4)
            jp.c$a r0 = p576jp.C33610c.C33611a.ReasonDevice
            r1.mo149499f(r0)
            goto L_0x0292
        L_0x028c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x028c }
            throw r0
        L_0x028f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x028f }
            throw r0
        L_0x0292:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w.mo149506m(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b):void");
    }
}
