package com.tencent.p014mm.plugin.voip_cs.p845ui;

import a43.C103310i;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import androidx.camera.core.FocusMeteringAction;
import bd2.C79690d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.StartVoipCSResultEvent;
import com.tencent.p014mm.booter.C92614a;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1821q0;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82956d;
import com.tencent.p014mm.plugin.voip.model.C106336d;
import com.tencent.p014mm.plugin.voip.model.C106343f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import fm0.C86956l0;
import fy3.C32224a;
import gy3.C87412m;
import i43.C108367a;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import k43.C108884a;
import k43.C108885c;
import k43.C108886d;
import k43.C108887f;
import k43.C108888g;
import l43.C109254a;
import l43.C109255b;
import m43.C109499b;
import n43.C109682e;
import n43.C47156a;
import n43.C47159d;
import nj3.C76879j;
import nj3.C88989a;
import ou0.C110066a;
import p206nj.C100115c;
import p331dj.C107043a;
import p375qh.C110390f;
import p447aw.C103918d;
import p918s2.C90116e;
import pe3.C89349b;
import pu0.C110248b;
import te3.np4;
import z33.C112597j;
import zt3.C119157j;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI */
public class VoipCSMainUI extends MMActivity implements C108885c, C109499b.C109500a {

    /* renamed from: B */
    public static final /* synthetic */ int f318238B = 0;

    /* renamed from: A */
    public C29060q f318239A = new C106527g(this);

    /* renamed from: d */
    public C109255b f318240d;

    /* renamed from: e */
    public C108367a f318241e;

    /* renamed from: f */
    public C109254a f318242f;

    /* renamed from: g */
    public C100115c f318243g;

    /* renamed from: h */
    public TelephonyManager f318244h;

    /* renamed from: i */
    public String f318245i = "";

    /* renamed from: j */
    public String f318246j = "";

    /* renamed from: n */
    public String f318247n = "";

    /* renamed from: o */
    public String f318248o = "";

    /* renamed from: p */
    public String f318249p = "";

    /* renamed from: q */
    public String f318250q = "";

    /* renamed from: r */
    public String f318251r = "";

    /* renamed from: s */
    public String f318252s = "";

    /* renamed from: t */
    public boolean f318253t = false;

    /* renamed from: u */
    public String f318254u = MMApplicationContext.getContext().getString(C0966R.string.f361517kg2);

    /* renamed from: v */
    public CharSequence f318255v = MMApplicationContext.getContext().getString(C0966R.string.f361517kg2);

    /* renamed from: w */
    public CharSequence f318256w = MMApplicationContext.getContext().getString(C0966R.string.kfw);

    /* renamed from: x */
    public MTimerHandler f318257x = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C57476h(), true);

    /* renamed from: y */
    public BroadcastReceiver f318258y = new C106521a();

    /* renamed from: z */
    public PhoneStateListener f318259z = new C106522b();

    /* renamed from: com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI$h */
    public class C57476h implements MTimerHandler.CallBack {
        public C57476h() {
        }

        public boolean onTimerExpired() {
            PendingIntent activity = PendingIntent.getActivity(MMApplicationContext.getContext(), 44, new Intent(MMApplicationContext.getContext(), VoipCSMainUI.class), 134217728);
            C90116e.C90121c cVar = new C90116e.C90121c(MMApplicationContext.getContext(), "reminder_channel_id");
            cVar.mo124390o(VoipCSMainUI.this.f318255v);
            cVar.mo124383h(VoipCSMainUI.this.f318256w);
            cVar.mo124382g(VoipCSMainUI.this.f318254u);
            cVar.f258795g = activity;
            cVar.mo124384i(2, true);
            Notification b = cVar.mo124378b();
            b.icon = C0966R.C0969drawable.c9k;
            b.flags |= 32;
            ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93215l(44, b, false);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI$a */
    public class C106521a extends BroadcastReceiver {
        public C106521a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:36:0x00e8 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0129 A[Catch:{ all -> 0x021b }] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0173 A[Catch:{ all -> 0x021b }] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x017d A[Catch:{ all -> 0x021b }] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x01ac A[Catch:{ all -> 0x021b }] */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x01ce A[Catch:{ all -> 0x021b }] */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x01d5 A[Catch:{ all -> 0x021b }] */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x01f2 A[Catch:{ all -> 0x021b }] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0217 A[Catch:{ all -> 0x021b }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceive(android.content.Context r18, android.content.Intent r19) {
            /*
                r17 = this;
                r1 = r17
                java.lang.String r0 = r19.getAction()
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r3 = "power"
                java.lang.Object r2 = r2.getSystemService(r3)
                android.os.PowerManager r2 = (android.os.PowerManager) r2
                java.lang.String r3 = "android.intent.action.USER_PRESENT"
                boolean r3 = r3.equals(r0)
                r4 = 0
                java.lang.String r5 = "MicroMsg.voipcs.VoipCSMainUI"
                if (r3 == 0) goto L_0x0030
                boolean r2 = r2.isScreenOn()
                if (r2 == 0) goto L_0x0030
                java.lang.String r0 = "on user present home"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
                com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI r0 = com.tencent.p014mm.plugin.voip_cs.p845ui.VoipCSMainUI.this
                l43.b r0 = r0.f318240d
                r0.f327089A = r4
                goto L_0x02ab
            L_0x0030:
                java.lang.String r2 = "android.intent.action.SCREEN_ON"
                boolean r2 = r2.equals(r0)
                r3 = 1
                if (r2 == 0) goto L_0x0288
                java.lang.String r0 = "screen on..."
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
                com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI r0 = com.tencent.p014mm.plugin.voip_cs.p845ui.VoipCSMainUI.this
                l43.b r2 = r0.f318240d
                r2.f327089A = r4
                l43.a r0 = r0.f318242f
                a43.i r0 = r0.f327085a
                if (r0 == 0) goto L_0x004e
                boolean r0 = r0.f304601e
                r0 = r0 ^ r3
                goto L_0x004f
            L_0x004e:
                r0 = 1
            L_0x004f:
                if (r0 != 0) goto L_0x02ab
                k43.g r0 = k43.C108886d.xx0()
                int r0 = r0.f326118n
                r2 = 2
                if (r0 != r2) goto L_0x02ab
                com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI r0 = com.tencent.p014mm.plugin.voip_cs.p845ui.VoipCSMainUI.this
                l43.a r0 = r0.f318242f
                a43.i r5 = r0.f327085a
                if (r5 == 0) goto L_0x02ab
                java.lang.String r6 = "phonering"
                r5.f304602f = r4
                java.lang.String r7 = "ex"
                java.lang.String r8 = "MicroMsg.RingPlayer"
                java.lang.String r9 = "getService(SubCoreAudio::class.java)"
                java.lang.Class<pu0.b> r10 = pu0.C110248b.class
                r11 = 4
                boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcess()     // Catch:{ Exception -> 0x00cb }
                if (r0 == 0) goto L_0x008e
                f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x00cb }
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x00cb }
                r13 = 73217(0x11e01, float:1.02599E-40)
                java.lang.Boolean r14 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x00cb }
                java.lang.Object r0 = r0.mo119684e(r13, r14)     // Catch:{ Exception -> 0x00cb }
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x00cb }
                boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x00cb }
                r13 = r0
                goto L_0x008f
            L_0x008e:
                r13 = 1
            L_0x008f:
                r0 = 26
                boolean r0 = p206nj.C11171e.m11046c(r0)     // Catch:{ Exception -> 0x00c9 }
                if (r0 == 0) goto L_0x00a0
                boolean r0 = p645pj.C77091b.m93021c()     // Catch:{ Exception -> 0x00c9 }
                boolean r14 = p645pj.C77091b.m93027i()     // Catch:{ Exception -> 0x00c9 }
                goto L_0x00a8
            L_0x00a0:
                boolean r0 = p645pj.C77091b.m93020b()     // Catch:{ Exception -> 0x00c9 }
                boolean r14 = p645pj.C77091b.m93026h()     // Catch:{ Exception -> 0x00c9 }
            L_0x00a8:
                java.lang.String r15 = "startPlayCustomRing, voipSound: %s, msgSound: %s, msgShake: %s, isCallingParty: %s"
                java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x00c9 }
                java.lang.Boolean r16 = java.lang.Boolean.valueOf(r13)     // Catch:{ Exception -> 0x00c9 }
                r12[r4] = r16     // Catch:{ Exception -> 0x00c9 }
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x00c9 }
                r12[r3] = r0     // Catch:{ Exception -> 0x00c9 }
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)     // Catch:{ Exception -> 0x00c9 }
                r12[r2] = r0     // Catch:{ Exception -> 0x00c9 }
                java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x00c9 }
                r16 = 3
                r12[r16] = r0     // Catch:{ Exception -> 0x00c9 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r15, r12)     // Catch:{ Exception -> 0x00c9 }
                r13 = 1
                goto L_0x00e6
            L_0x00c9:
                r0 = move-exception
                goto L_0x00cd
            L_0x00cb:
                r0 = move-exception
                r13 = 1
            L_0x00cd:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r14 = "get voip sound failed: "
                r12.append(r14)
                java.lang.String r0 = r0.getMessage()
                r12.append(r0)
                java.lang.String r0 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
                r14 = 1
            L_0x00e6:
                if (r13 != 0) goto L_0x00ec
                if (r14 != 0) goto L_0x00ec
                goto L_0x02ab
            L_0x00ec:
                boolean r0 = r5.f304601e
                if (r0 == 0) goto L_0x00f2
                goto L_0x02ab
            L_0x00f2:
                if (r13 == 0) goto L_0x02ab
                long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x026e }
                r5.f304603g = r12     // Catch:{ Exception -> 0x026e }
                dj.g r0 = new dj.g     // Catch:{ Exception -> 0x026e }
                r0.<init>()     // Catch:{ Exception -> 0x026e }
                r5.f304599c = r0     // Catch:{ Exception -> 0x026e }
                r12 = 1058642330(0x3f19999a, float:0.6)
                android.net.Uri r0 = r5.mo143087c(r6)     // Catch:{ all -> 0x021b }
                android.media.MediaPlayer r6 = r5.f304599c     // Catch:{ all -> 0x021b }
                android.content.Context r13 = r5.f304598b     // Catch:{ all -> 0x021b }
                r6.setDataSource(r13, r0)     // Catch:{ all -> 0x021b }
                android.media.MediaPlayer r0 = r5.f304599c     // Catch:{ all -> 0x021b }
                a43.g r6 = new a43.g     // Catch:{ all -> 0x021b }
                r6.<init>(r5)     // Catch:{ all -> 0x021b }
                r0.setOnCompletionListener(r6)     // Catch:{ all -> 0x021b }
                android.media.MediaPlayer r0 = r5.f304599c     // Catch:{ all -> 0x021b }
                a43.h r6 = new a43.h     // Catch:{ all -> 0x021b }
                r6.<init>(r5)     // Catch:{ all -> 0x021b }
                r0.setOnErrorListener(r6)     // Catch:{ all -> 0x021b }
                boolean r0 = pu0.C110248b.Jh0()     // Catch:{ all -> 0x021b }
                if (r0 == 0) goto L_0x0159
                di3.d r0 = di3.C86312j.m106911c(r10)     // Catch:{ all -> 0x021b }
                gy3.C87412m.m108593f(r0, r9)     // Catch:{ all -> 0x021b }
                pu0.b r0 = (pu0.C110248b) r0     // Catch:{ all -> 0x021b }
                ou0.a r0 = r0.f329779e     // Catch:{ all -> 0x021b }
                if (r0 != 0) goto L_0x014a
                ou0.c r0 = new ou0.c     // Catch:{ all -> 0x021b }
                r0.<init>()     // Catch:{ all -> 0x021b }
                di3.d r6 = di3.C86312j.m106911c(r10)     // Catch:{ all -> 0x021b }
                gy3.C87412m.m108593f(r6, r9)     // Catch:{ all -> 0x021b }
                pu0.b r6 = (pu0.C110248b) r6     // Catch:{ all -> 0x021b }
                java.lang.String[] r6 = r6.f329781g     // Catch:{ all -> 0x021b }
                java.lang.String r9 = "music"
                r6[r4] = r9     // Catch:{ all -> 0x021b }
            L_0x014a:
                android.media.AudioManager r0 = r0.f329358h     // Catch:{ all -> 0x021b }
                java.lang.String r6 = "audioManager"
                gy3.C87412m.m108594g(r0, r6)     // Catch:{ all -> 0x021b }
                boolean r0 = r0.isBluetoothScoAvailableOffCall()     // Catch:{ all -> 0x021b }
                if (r0 == 0) goto L_0x0159
                r0 = 1
                goto L_0x015a
            L_0x0159:
                r0 = 0
            L_0x015a:
                boolean r6 = pu0.C110248b.zx0()     // Catch:{ all -> 0x021b }
                java.lang.String r9 = "isBluetoothOn: %b, isHeadsetPlugged: %b"
                java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ all -> 0x021b }
                java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x021b }
                r10[r4] = r13     // Catch:{ all -> 0x021b }
                java.lang.Boolean r13 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x021b }
                r10[r3] = r13     // Catch:{ all -> 0x021b }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r9, r10)     // Catch:{ all -> 0x021b }
                if (r0 == 0) goto L_0x017d
                pu0.b$a r9 = pu0.C110248b.f329777h     // Catch:{ all -> 0x021b }
                int r9 = r9.mo161658c()     // Catch:{ all -> 0x021b }
                r5.mo143088d(r4)     // Catch:{ all -> 0x021b }
                goto L_0x01a4
            L_0x017d:
                r9 = -1
                gj.c r10 = p156gj.C107835h0.f322846c     // Catch:{ all -> 0x021b }
                int r13 = r10.f322698K     // Catch:{ all -> 0x021b }
                if (r13 <= r9) goto L_0x0185
                goto L_0x0186
            L_0x0185:
                r13 = 0
            L_0x0186:
                if (r6 != 0) goto L_0x01a0
                boolean r13 = r5.f304605i     // Catch:{ all -> 0x021b }
                if (r13 == 0) goto L_0x0191
                r5.mo143088d(r3)     // Catch:{ all -> 0x021b }
                r9 = 2
                goto L_0x01a4
            L_0x0191:
                int r10 = r10.f322692H     // Catch:{ all -> 0x021b }
                if (r10 <= r9) goto L_0x0198
                r16 = r10
                goto L_0x019a
            L_0x0198:
                r16 = 3
            L_0x019a:
                r5.mo143088d(r3)     // Catch:{ all -> 0x021b }
                r9 = r16
                goto L_0x01a4
            L_0x01a0:
                r5.mo143088d(r4)     // Catch:{ all -> 0x021b }
                r9 = r13
            L_0x01a4:
                r10 = 28
                boolean r10 = p206nj.C11171e.m11045b(r10)     // Catch:{ all -> 0x021b }
                if (r10 == 0) goto L_0x01ce
                android.media.MediaPlayer r10 = r5.f304599c     // Catch:{ all -> 0x021b }
                android.media.AudioAttributes$Builder r13 = new android.media.AudioAttributes$Builder     // Catch:{ all -> 0x021b }
                r13.<init>()     // Catch:{ all -> 0x021b }
                r14 = 6
                android.media.AudioAttributes$Builder r13 = r13.setUsage(r14)     // Catch:{ all -> 0x021b }
                android.media.AudioAttributes$Builder r13 = r13.setLegacyStreamType(r9)     // Catch:{ all -> 0x021b }
                android.media.AudioAttributes$Builder r11 = r13.setContentType(r11)     // Catch:{ all -> 0x021b }
                android.media.AudioAttributes r11 = r11.build()     // Catch:{ all -> 0x021b }
                r10.setAudioAttributes(r11)     // Catch:{ all -> 0x021b }
                java.lang.String r10 = "use audio attribute to play ring"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)     // Catch:{ all -> 0x021b }
                goto L_0x01d3
            L_0x01ce:
                android.media.MediaPlayer r10 = r5.f304599c     // Catch:{ all -> 0x021b }
                r10.setAudioStreamType(r9)     // Catch:{ all -> 0x021b }
            L_0x01d3:
                if (r6 != 0) goto L_0x01de
                if (r0 == 0) goto L_0x01d8
                goto L_0x01de
            L_0x01d8:
                android.media.MediaPlayer r0 = r5.f304599c     // Catch:{ all -> 0x021b }
                r0.setVolume(r12, r12)     // Catch:{ all -> 0x021b }
                goto L_0x01fb
            L_0x01de:
                ou0.a r0 = pu0.C110248b.vx0()     // Catch:{ all -> 0x021b }
                int r0 = r0.mo157507d(r9)     // Catch:{ all -> 0x021b }
                ou0.a r6 = pu0.C110248b.vx0()     // Catch:{ all -> 0x021b }
                int r6 = r6.mo157506c(r9)     // Catch:{ all -> 0x021b }
                int r10 = r0 / 2
                if (r6 <= r10) goto L_0x01f4
                int r6 = r0 / 2
            L_0x01f4:
                ou0.a r0 = pu0.C110248b.vx0()     // Catch:{ all -> 0x021b }
                r0.mo157508g(r9, r6, r4)     // Catch:{ all -> 0x021b }
            L_0x01fb:
                android.media.MediaPlayer r0 = r5.f304599c     // Catch:{ all -> 0x021b }
                r0.setLooping(r3)     // Catch:{ all -> 0x021b }
                android.media.MediaPlayer r0 = r5.f304599c     // Catch:{ all -> 0x021b }
                r0.prepare()     // Catch:{ all -> 0x021b }
                android.media.MediaPlayer r0 = r5.f304599c     // Catch:{ all -> 0x021b }
                r0.start()     // Catch:{ all -> 0x021b }
                long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x021b }
                long r13 = r5.f304603g     // Catch:{ all -> 0x021b }
                long r9 = r9 - r13
                r13 = 2000(0x7d0, double:9.88E-321)
                int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
                if (r0 <= 0) goto L_0x026b
                r6 = 3
                r5.f304602f = r6     // Catch:{ all -> 0x021b }
                goto L_0x026b
            L_0x021b:
                r0 = move-exception
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x026e }
                r6.<init>()     // Catch:{ Exception -> 0x026e }
                java.lang.String r9 = "startPlayCustomRing failed, "
                r6.append(r9)     // Catch:{ Exception -> 0x026e }
                java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x026e }
                r6.append(r0)     // Catch:{ Exception -> 0x026e }
                java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x026e }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ Exception -> 0x026e }
                r5.f304602f = r2     // Catch:{ Exception -> 0x026e }
                android.content.Context r0 = r5.f304598b     // Catch:{ Exception -> 0x0261 }
                android.net.Uri r0 = android.media.RingtoneManager.getActualDefaultRingtoneUri(r0, r3)     // Catch:{ Exception -> 0x0261 }
                android.content.Context r6 = r5.f304598b     // Catch:{ Exception -> 0x0261 }
                dj.g r0 = p331dj.C97481g.m125558a(r6, r0)     // Catch:{ Exception -> 0x0261 }
                r5.f304599c = r0     // Catch:{ Exception -> 0x0261 }
                if (r0 != 0) goto L_0x0247
                goto L_0x02ab
            L_0x0247:
                r0.stop()     // Catch:{ Exception -> 0x0261 }
                android.media.MediaPlayer r0 = r5.f304599c     // Catch:{ Exception -> 0x0261 }
                r0.prepare()     // Catch:{ Exception -> 0x0261 }
                android.media.MediaPlayer r0 = r5.f304599c     // Catch:{ Exception -> 0x0261 }
                r0.setLooping(r3)     // Catch:{ Exception -> 0x0261 }
                android.media.MediaPlayer r0 = r5.f304599c     // Catch:{ Exception -> 0x0261 }
                r0.setVolume(r12, r12)     // Catch:{ Exception -> 0x0261 }
                android.media.MediaPlayer r0 = r5.f304599c     // Catch:{ Exception -> 0x0261 }
                r0.start()     // Catch:{ Exception -> 0x0261 }
                r5.f304602f = r4     // Catch:{ Exception -> 0x0261 }
                goto L_0x026b
            L_0x0261:
                r0 = move-exception
                java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x026e }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)     // Catch:{ Exception -> 0x026e }
                r5.f304602f = r2     // Catch:{ Exception -> 0x026e }
            L_0x026b:
                r5.f304601e = r3     // Catch:{ Exception -> 0x026e }
                goto L_0x02ab
            L_0x026e:
                r0 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "new MediaPlayer failed, "
                r2.append(r3)
                java.lang.String r0 = r0.toString()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
                goto L_0x02ab
            L_0x0288:
                java.lang.String r2 = "android.intent.action.SCREEN_OFF"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x02ab
                java.lang.String r0 = "screen off..."
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
                com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI r0 = com.tencent.p014mm.plugin.voip_cs.p845ui.VoipCSMainUI.this
                l43.b r2 = r0.f318240d
                r2.f327089A = r3
                l43.a r0 = r0.f318242f
                a43.i r0 = r0.f327085a
                if (r0 == 0) goto L_0x02a4
                boolean r2 = r0.f304601e
                r3 = r3 ^ r2
            L_0x02a4:
                if (r3 != 0) goto L_0x02ab
                if (r0 == 0) goto L_0x02ab
                r0.mo143090f()
            L_0x02ab:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip_cs.p845ui.VoipCSMainUI.C106521a.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI$b */
    public class C106522b extends PhoneStateListener {
        public C106522b() {
        }

        public void onCallStateChanged(int i, String str) {
            Log.m105918d("MicroMsg.voipcs.VoipCSMainUI", "now phone state change!");
            if (i == 2) {
                Log.m105924i("MicroMsg.voipcs.VoipCSMainUI", " phone is talking ! exist voipcs !");
                C108886d.vx0().f326107w = 4;
                VoipCSMainUI.this.mo153175J7(7);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI$c */
    public class C106523c implements DialogInterface.OnClickListener {
        public C106523c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(VoipCSMainUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI$d */
    public class C106524d implements DialogInterface.OnClickListener {
        public C106524d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            VoipCSMainUI.this.mo153175J7(2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI$e */
    public class C106525e implements DialogInterface.OnClickListener {
        public C106525e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(VoipCSMainUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI$f */
    public class C106526f implements DialogInterface.OnClickListener {
        public C106526f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            VoipCSMainUI.this.mo153175J7(3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI$g */
    public class C106527g extends C29060q.C29061a {
        public C106527g(VoipCSMainUI voipCSMainUI) {
        }

        public void onNetworkChange(int i) {
            Log.m105918d("MicroMsg.voipcs.VoipCSMainUI", "network status change from " + i);
            if (C108886d.xx0().f326118n != 2) {
                return;
            }
            if (i == 4 || i == 6) {
                C108888g xx02 = C108886d.xx0();
                xx02.getClass();
                C108884a aVar = C108886d.wx0().f327737a;
                if (xx02.f326120p == 0) {
                    xx02.f326120p = aVar.f317638h;
                }
                int e = C112597j.m153940e(MMApplicationContext.getContext());
                if (e != xx02.f326120p) {
                    Log.m105924i("MicroMsg.voipcs.VoipCSService", "steve: onVoipLocalNetTypeChange: local network type change from " + xx02.f326120p + " to " + e);
                    try {
                        byte[] bArr = new byte[4];
                        bArr[0] = (byte) e;
                        int appCmd = aVar.setAppCmd(301, bArr, 4);
                        if (appCmd < 0) {
                            Log.m105924i("MicroMsg.voipcs.VoipCSService", "steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetLocalNetType] update local network type" + e + "fail:" + appCmd + ", [roomid=" + aVar.f317662p + ", roomkey=" + aVar.f317665q + "]");
                        }
                        np4 np4 = new np4();
                        np4.f332185d = 3;
                        np4.f332186e = new C89349b(bArr, 0, 1);
                        aVar.SendRUDP(np4.toByteArray(), np4.toByteArray().length);
                    } catch (Exception unused) {
                        Log.m105920e("MicroMsg.voipcs.VoipCSService", "onVoipLocalNetTypeChange Error");
                    }
                    xx02.f326120p = e;
                }
                C108888g xx03 = C108886d.xx0();
                xx03.getClass();
                Log.m105924i("MicroMsg.voipcs.VoipCSService", "now doRedirect+,csroomId:" + C108886d.wx0().f327737a.f317659o + "roomkey:" + C108886d.wx0().f327737a.f317665q);
                C86709a0.m107524d().mo123455a(C1821q0.CTRL_INDEX, xx03);
                C108884a aVar2 = C108886d.wx0().f327737a;
                C86709a0.m107524d().mo123460f(new C47159d(aVar2.f317659o, aVar2.f317665q));
            }
        }
    }

    /* renamed from: H7 */
    public final boolean mo153173H7() {
        Class cls = C103918d.class;
        if (!((C103918d) C86312j.m106911c(cls)).mo125788z1(this, "android.permission.RECORD_AUDIO", 82, "", "")) {
            Log.m105924i("MicroMsg.voipcs.VoipCSMainUI", "has not audio record premission!");
            return false;
        }
        boolean z1 = ((C103918d) C86312j.m106911c(cls)).mo125788z1(this, "android.permission.CAMERA", 19, "", "");
        Log.m105919d("MicroMsg.voipcs.VoipCSMainUI", "voipcs checkPermission checkCamera[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), this);
        if (z1) {
            return true;
        }
        Log.m105924i("MicroMsg.voipcs.VoipCSMainUI", "has not camera  premission!");
        return false;
    }

    /* renamed from: I7 */
    public void mo153174I7(String str, String str2) {
        String str3;
        C109255b bVar = this.f318240d;
        if (!bVar.f327095G.equals("") || !Util.isNullOrNil(str2)) {
            bVar.mo160489g(str2);
        } else if (bVar.f327107d.f318253t) {
            bVar.f327114n.setText(C0966R.string.kfj);
        } else {
            bVar.f327114n.setText(C0966R.string.kfi);
        }
        if (!bVar.f327094F.equals("") || !Util.isNullOrNil(str) || ((str3 = bVar.f327107d.f318247n) != null && !str3.equals(""))) {
            SharedPreferences defaultPreference = MMApplicationContext.getDefaultPreference();
            if (!Util.isNullOrNil(str) && !bVar.f327094F.equals(str)) {
                bVar.mo160488f(str);
                SharedPreferences.Editor edit = defaultPreference.edit();
                edit.putString("voip_cs_headImageUrl_" + bVar.f327107d.f318245i, str).commit();
            }
            if (!Util.isNullOrNil(str2) && !bVar.f327095G.equals(str2)) {
                bVar.mo160489g(str2);
                SharedPreferences.Editor edit2 = defaultPreference.edit();
                edit2.putString("voip_cs_nickname_" + bVar.f327107d.f318245i, str2).commit();
                return;
            }
            return;
        }
        bVar.f327116p.setImageResource(C0966R.C0969drawable.bfa);
    }

    /* renamed from: J7 */
    public void mo153175J7(int i) {
        Log.m105918d("MicroMsg.voipcs.VoipCSMainUI", "onExitVoipCS for action:" + i + ",CallingStatus:" + C108886d.xx0().f326118n);
        if (C108886d.xx0().f326118n == 0) {
            finish();
            return;
        }
        C109255b bVar = this.f318240d;
        if (bVar != null) {
            bVar.mo160487e(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x03b6 A[Catch:{ all -> 0x045c }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x03c0 A[Catch:{ all -> 0x045c }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03eb A[Catch:{ all -> 0x045c }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x040e A[Catch:{ all -> 0x045c }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0415 A[Catch:{ all -> 0x045c }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0432 A[Catch:{ all -> 0x045c }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0458 A[Catch:{ all -> 0x045c }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x04da  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0507  */
    /* JADX WARNING: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x036b A[Catch:{ all -> 0x045c }] */
    /* renamed from: K7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo153176K7() {
        /*
            r27 = this;
            r1 = r27
            k43.g r0 = k43.C108886d.xx0()
            int r0 = r0.f326118n
            r2 = 480(0x1e0, float:6.73E-43)
            r3 = 4
            r5 = 0
            r6 = 1
            java.lang.String r7 = "MicroMsg.VoipCSReportHelper"
            if (r0 >= r6) goto L_0x0295
            l43.b r0 = r1.f318240d
            com.tencent.mm.sdk.platformtools.MTimerHandler r8 = r0.f327097I
            boolean r8 = r8.stopped()
            if (r8 == 0) goto L_0x0024
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r0.f327097I
            r8 = 60000(0xea60, float:8.4078E-41)
            long r8 = (long) r8
            r0.startTimer(r8)
        L_0x0024:
            l43.b r0 = r1.f318240d
            com.tencent.mm.sdk.platformtools.MTimerHandler r8 = r0.f327098J
            boolean r8 = r8.stopped()
            if (r8 == 0) goto L_0x0036
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r0.f327098J
            r8 = 5000(0x1388, float:7.006E-42)
            long r8 = (long) r8
            r0.startTimer(r8)
        L_0x0036:
            m43.b r0 = k43.C108886d.wx0()
            r0.f327739c = r5
            k43.a r8 = r0.f327737a
            boolean r8 = r8.f317580K1
            java.lang.String r9 = "MicroMsg.VoipCSEngine"
            if (r8 == 0) goto L_0x0053
            java.lang.String r8 = "protocal has init,now uninit!"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r8)
            k43.a r8 = r0.f327737a
            r8.mo152850x(r5)
            k43.a r8 = r0.f327737a
            r8.mo152851y()
        L_0x0053:
            k43.a r8 = r0.f327737a
            r8.f317653m = r6
            long r10 = java.lang.System.currentTimeMillis()
            k43.a r0 = r0.f327737a
            r0.getClass()
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r8 = z33.C112597j.m153940e(r8)
            r0.f317629e = r8
            r0.f317638h = r8
            k43.f r8 = k43.C108886d.vx0()
            int r12 = r0.f317629e
            r8.f326104t = r12
            int r8 = r0.f317638h
            if (r8 < r3) goto L_0x0086
            int r8 = com.tencent.p014mm.plugin.voip.model.v2protocal.f317531R1
            r12 = r8 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0086
            r8 = r8 & 255(0xff, float:3.57E-43)
            r12 = 30
            if (r8 < r12) goto L_0x0086
            r8 = 1
            goto L_0x0087
        L_0x0086:
            r8 = 0
        L_0x0087:
            gj.d r12 = p156gj.C107835h0.f322845b
            int r13 = r12.f322789D
            r14 = 360(0x168, float:5.04E-43)
            if (r13 != r6) goto L_0x00a5
            gj.d$a r15 = r12.f322810i
            int r3 = r15.f322833f
            if (r3 < r2) goto L_0x00a5
            int r3 = r15.f322834g
            if (r3 < r14) goto L_0x00a5
            gj.d$a r3 = r12.f322812k
            int r12 = r3.f322833f
            if (r12 < r2) goto L_0x00a5
            int r3 = r3.f322834g
            if (r3 < r14) goto L_0x00a5
            r3 = 1
            goto L_0x00a6
        L_0x00a5:
            r3 = 0
        L_0x00a6:
            if (r13 != 0) goto L_0x00aa
            r12 = 1
            goto L_0x00ab
        L_0x00aa:
            r12 = 0
        L_0x00ab:
            java.lang.String r15 = "MicroMsg.CSV2protocal"
            if (r8 != 0) goto L_0x00b1
            if (r3 == 0) goto L_0x00d8
        L_0x00b1:
            if (r12 != 0) goto L_0x00d8
            r0.f317623c = r2
            r0.f317626d = r14
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "steve:Set Enable 480! "
            r13.append(r14)
            int r14 = r0.f317623c
            r13.append(r14)
            java.lang.String r14 = "x"
            r13.append(r14)
            int r14 = r0.f317626d
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            z33.C112597j.m153938c(r15, r13)
        L_0x00d8:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "steve: Android CPUFlag:"
            r13.append(r14)
            int r14 = com.tencent.p014mm.plugin.voip.model.v2protocal.f317531R1
            r14 = r14 & 255(0xff, float:3.57E-43)
            r13.append(r14)
            java.lang.String r14 = ", 480x360 Enc flags: bEnable480FromLocal:"
            r13.append(r14)
            r13.append(r8)
            java.lang.String r8 = ", bEnable480FromSvr:"
            r13.append(r8)
            r13.append(r3)
            java.lang.String r3 = ", bDisable480FromSvr:"
            r13.append(r3)
            r13.append(r12)
            java.lang.String r3 = r13.toString()
            z33.C112597j.m153938c(r15, r3)
            int r3 = r0.f317623c
            int r8 = r0.f317626d
            int r3 = r3 * r8
            int[] r3 = new int[r3]
            r0.f317610W0 = r3
            f40.e r3 = f40.C86709a0.m107523b()
            int r3 = r3.mo121110g()
            r0.f317632f = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            int r8 = com.tencent.p014mm.plugin.voip.video.OpenGlRender.m143736e()
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r13 = "window"
            java.lang.Object r12 = r12.getSystemService(r13)
            android.view.WindowManager r12 = (android.view.WindowManager) r12
            android.view.Display r12 = r12.getDefaultDisplay()
            int r13 = r12.getWidth()
            int r12 = r12.getHeight()
            r21 = 0
            r24 = 0
            r25 = 0
            if (r8 != r6) goto L_0x0146
            r26 = 4
            goto L_0x0148
        L_0x0146:
            r26 = 1
        L_0x0148:
            int r14 = r0.f317629e
            r16 = 2
            int r2 = r0.f317623c
            int r2 = r2 << 16
            int r4 = r0.f317626d
            r2 = r2 | r4
            int r4 = r13 << 16
            r4 = r4 | r12
            int r13 = r0.f317632f
            int r8 = r8 << 24
            int r3 = r3 << 16
            r3 = r3 | r8
            int r8 = com.tencent.p014mm.plugin.voip.model.v2protocal.f317531R1
            r18 = r3 | r8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = a70.C112760b.m154216X()
            r3.append(r8)
            java.lang.String r8 = "lib/"
            r3.append(r8)
            java.lang.String r19 = r3.toString()
            r20 = 8
            r23 = 0
            r12 = r0
            r3 = r13
            r13 = r14
            r14 = r16
            r8 = r15
            r15 = r2
            r16 = r4
            r17 = r3
            int r2 = r12.init(r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "protocalInitForCS protocal init ret :"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = ",uin= "
            r3.append(r4)
            int r4 = r0.f317632f
            r3.append(r4)
            java.lang.String r4 = ", groupRsCap = "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            z33.C112597j.m153936a(r8, r3)
            r0.f317580K1 = r6
            if (r2 >= 0) goto L_0x01b6
            r0.mo152851y()
        L_0x01b6:
            long r3 = java.lang.System.currentTimeMillis()
            r8 = 2
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r0[r5] = r8
            long r3 = r3 - r10
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0[r6] = r3
            java.lang.String r3 = "protocal init finish, ret: %d, used %dms"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r3, r0)
            if (r2 >= 0) goto L_0x01d6
            java.lang.String r0 = "engine init failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
        L_0x01d6:
            k43.g r0 = k43.C108886d.xx0()
            java.lang.String r10 = r1.f318245i
            java.lang.String r14 = r1.f318246j
            java.lang.String r2 = r1.f318250q
            r0.getClass()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "start netscene invite for username:"
            r3.append(r4)
            r3.append(r10)
            java.lang.String r4 = ",appid:"
            r3.append(r4)
            r3.append(r14)
            java.lang.String r4 = ",voipCSContext:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.voipcs.VoipCSService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            r0.f326119o = r10
            r0.f326118n = r6
            k43.f r3 = k43.C108886d.vx0()
            r3.getClass()
            java.lang.String r8 = "markSendInvite"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r8)
            int r8 = r3.f326077W
            r11 = 1000(0x3e8, double:4.94E-321)
            if (r8 != 0) goto L_0x0227
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 / r11
            int r9 = (int) r8
            r3.f326077W = r9
        L_0x0227:
            r3 = 0
            if (r2 == 0) goto L_0x0237
            java.lang.String r8 = ""
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L_0x0237
            byte[] r2 = r2.getBytes()
            goto L_0x0238
        L_0x0237:
            r2 = r3
        L_0x0238:
            ob0.b0 r3 = f40.C86709a0.m107524d()
            r8 = 823(0x337, float:1.153E-42)
            r3.mo123455a(r8, r0)
            m43.b r0 = k43.C108886d.wx0()
            k43.a r0 = r0.f327737a
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 / r11
            int r3 = (int) r8
            r0.f317668r = r3
            n43.c r0 = new n43.c
            m43.b r3 = k43.C108886d.wx0()
            k43.a r3 = r3.f327737a
            int r9 = r3.f317668r
            m43.b r3 = k43.C108886d.wx0()
            k43.a r3 = r3.f327737a
            int r11 = r3.f317629e
            m43.b r3 = k43.C108886d.wx0()
            k43.a r3 = r3.f327737a
            byte[] r13 = r3.field_capInfo
            r8 = r0
            r12 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "capDump is "
            r2.append(r3)
            m43.b r3 = k43.C108886d.wx0()
            k43.a r3 = r3.f327737a
            byte[] r3 = r3.field_capInfo
            java.lang.String r3 = java.util.Arrays.toString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            ob0.b0 r2 = f40.C86709a0.m107524d()
            r2.mo123460f(r0)
        L_0x0295:
            k43.g r0 = k43.C108886d.xx0()
            int r0 = r0.f326118n
            r2 = 2
            if (r0 >= r2) goto L_0x04ca
            l43.a r0 = r1.f318242f
            a43.i r2 = r0.f327085a
            if (r2 == 0) goto L_0x04ca
            java.lang.String r3 = "phonering"
            r2.f304602f = r5
            java.lang.String r4 = "ex"
            java.lang.String r8 = "MicroMsg.RingPlayer"
            java.lang.String r9 = "getService(SubCoreAudio::class.java)"
            java.lang.Class<pu0.b> r10 = pu0.C110248b.class
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcess()     // Catch:{ Exception -> 0x030d }
            if (r0 == 0) goto L_0x02cf
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x030d }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x030d }
            r12 = 73217(0x11e01, float:1.02599E-40)
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x030d }
            java.lang.Object r0 = r0.mo119684e(r12, r13)     // Catch:{ Exception -> 0x030d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x030d }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x030d }
            r12 = r0
            goto L_0x02d0
        L_0x02cf:
            r12 = 1
        L_0x02d0:
            r0 = 26
            boolean r0 = p206nj.C11171e.m11046c(r0)     // Catch:{ Exception -> 0x030b }
            if (r0 == 0) goto L_0x02e1
            boolean r0 = p645pj.C77091b.m93021c()     // Catch:{ Exception -> 0x030b }
            boolean r13 = p645pj.C77091b.m93027i()     // Catch:{ Exception -> 0x030b }
            goto L_0x02e9
        L_0x02e1:
            boolean r0 = p645pj.C77091b.m93020b()     // Catch:{ Exception -> 0x030b }
            boolean r13 = p645pj.C77091b.m93026h()     // Catch:{ Exception -> 0x030b }
        L_0x02e9:
            java.lang.String r14 = "startPlayCustomRing, voipSound: %s, msgSound: %s, msgShake: %s, isCallingParty: %s"
            r15 = 4
            java.lang.Object[] r11 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x030b }
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r12)     // Catch:{ Exception -> 0x030b }
            r11[r5] = r15     // Catch:{ Exception -> 0x030b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x030b }
            r11[r6] = r0     // Catch:{ Exception -> 0x030b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)     // Catch:{ Exception -> 0x030b }
            r15 = 2
            r11[r15] = r0     // Catch:{ Exception -> 0x030b }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x030b }
            r15 = 3
            r11[r15] = r0     // Catch:{ Exception -> 0x030b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r14, r11)     // Catch:{ Exception -> 0x030b }
            r12 = 1
            goto L_0x0328
        L_0x030b:
            r0 = move-exception
            goto L_0x030f
        L_0x030d:
            r0 = move-exception
            r12 = 1
        L_0x030f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "get voip sound failed: "
            r11.append(r13)
            java.lang.String r0 = r0.getMessage()
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            r13 = 1
        L_0x0328:
            if (r12 != 0) goto L_0x032e
            if (r13 != 0) goto L_0x032e
            goto L_0x04ca
        L_0x032e:
            boolean r0 = r2.f304601e
            if (r0 == 0) goto L_0x0334
            goto L_0x04ca
        L_0x0334:
            if (r12 == 0) goto L_0x04ca
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
            r2.f304603g = r11     // Catch:{ Exception -> 0x04b1 }
            dj.g r0 = new dj.g     // Catch:{ Exception -> 0x04b1 }
            r0.<init>()     // Catch:{ Exception -> 0x04b1 }
            r2.f304599c = r0     // Catch:{ Exception -> 0x04b1 }
            r11 = 1058642330(0x3f19999a, float:0.6)
            android.net.Uri r0 = r2.mo143087c(r3)     // Catch:{ all -> 0x045c }
            android.media.MediaPlayer r3 = r2.f304599c     // Catch:{ all -> 0x045c }
            android.content.Context r12 = r2.f304598b     // Catch:{ all -> 0x045c }
            r3.setDataSource(r12, r0)     // Catch:{ all -> 0x045c }
            android.media.MediaPlayer r0 = r2.f304599c     // Catch:{ all -> 0x045c }
            a43.g r3 = new a43.g     // Catch:{ all -> 0x045c }
            r3.<init>(r2)     // Catch:{ all -> 0x045c }
            r0.setOnCompletionListener(r3)     // Catch:{ all -> 0x045c }
            android.media.MediaPlayer r0 = r2.f304599c     // Catch:{ all -> 0x045c }
            a43.h r3 = new a43.h     // Catch:{ all -> 0x045c }
            r3.<init>(r2)     // Catch:{ all -> 0x045c }
            r0.setOnErrorListener(r3)     // Catch:{ all -> 0x045c }
            boolean r0 = pu0.C110248b.Jh0()     // Catch:{ all -> 0x045c }
            if (r0 == 0) goto L_0x039b
            di3.d r0 = di3.C86312j.m106911c(r10)     // Catch:{ all -> 0x045c }
            gy3.C87412m.m108593f(r0, r9)     // Catch:{ all -> 0x045c }
            pu0.b r0 = (pu0.C110248b) r0     // Catch:{ all -> 0x045c }
            ou0.a r0 = r0.f329779e     // Catch:{ all -> 0x045c }
            if (r0 != 0) goto L_0x038c
            ou0.c r0 = new ou0.c     // Catch:{ all -> 0x045c }
            r0.<init>()     // Catch:{ all -> 0x045c }
            di3.d r3 = di3.C86312j.m106911c(r10)     // Catch:{ all -> 0x045c }
            gy3.C87412m.m108593f(r3, r9)     // Catch:{ all -> 0x045c }
            pu0.b r3 = (pu0.C110248b) r3     // Catch:{ all -> 0x045c }
            java.lang.String[] r3 = r3.f329781g     // Catch:{ all -> 0x045c }
            java.lang.String r9 = "music"
            r3[r5] = r9     // Catch:{ all -> 0x045c }
        L_0x038c:
            android.media.AudioManager r0 = r0.f329358h     // Catch:{ all -> 0x045c }
            java.lang.String r3 = "audioManager"
            gy3.C87412m.m108594g(r0, r3)     // Catch:{ all -> 0x045c }
            boolean r0 = r0.isBluetoothScoAvailableOffCall()     // Catch:{ all -> 0x045c }
            if (r0 == 0) goto L_0x039b
            r0 = 1
            goto L_0x039c
        L_0x039b:
            r0 = 0
        L_0x039c:
            boolean r3 = pu0.C110248b.zx0()     // Catch:{ all -> 0x045c }
            java.lang.String r9 = "isBluetoothOn: %b, isHeadsetPlugged: %b"
            r10 = 2
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ all -> 0x045c }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x045c }
            r12[r5] = r10     // Catch:{ all -> 0x045c }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x045c }
            r12[r6] = r10     // Catch:{ all -> 0x045c }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r9, r12)     // Catch:{ all -> 0x045c }
            if (r0 == 0) goto L_0x03c0
            pu0.b$a r9 = pu0.C110248b.f329777h     // Catch:{ all -> 0x045c }
            int r9 = r9.mo161658c()     // Catch:{ all -> 0x045c }
            r2.mo143088d(r5)     // Catch:{ all -> 0x045c }
            goto L_0x03e3
        L_0x03c0:
            r9 = -1
            gj.c r10 = p156gj.C107835h0.f322846c     // Catch:{ all -> 0x045c }
            int r12 = r10.f322698K     // Catch:{ all -> 0x045c }
            if (r12 <= r9) goto L_0x03c8
            goto L_0x03c9
        L_0x03c8:
            r12 = 0
        L_0x03c9:
            if (r3 != 0) goto L_0x03df
            boolean r12 = r2.f304605i     // Catch:{ all -> 0x045c }
            if (r12 == 0) goto L_0x03d4
            r2.mo143088d(r6)     // Catch:{ all -> 0x045c }
            r9 = 2
            goto L_0x03e3
        L_0x03d4:
            int r10 = r10.f322692H     // Catch:{ all -> 0x045c }
            if (r10 <= r9) goto L_0x03d9
            goto L_0x03da
        L_0x03d9:
            r10 = 3
        L_0x03da:
            r2.mo143088d(r6)     // Catch:{ all -> 0x045c }
            r9 = r10
            goto L_0x03e3
        L_0x03df:
            r2.mo143088d(r5)     // Catch:{ all -> 0x045c }
            r9 = r12
        L_0x03e3:
            r10 = 28
            boolean r10 = p206nj.C11171e.m11045b(r10)     // Catch:{ all -> 0x045c }
            if (r10 == 0) goto L_0x040e
            android.media.MediaPlayer r10 = r2.f304599c     // Catch:{ all -> 0x045c }
            android.media.AudioAttributes$Builder r12 = new android.media.AudioAttributes$Builder     // Catch:{ all -> 0x045c }
            r12.<init>()     // Catch:{ all -> 0x045c }
            r13 = 6
            android.media.AudioAttributes$Builder r12 = r12.setUsage(r13)     // Catch:{ all -> 0x045c }
            android.media.AudioAttributes$Builder r12 = r12.setLegacyStreamType(r9)     // Catch:{ all -> 0x045c }
            r13 = 4
            android.media.AudioAttributes$Builder r12 = r12.setContentType(r13)     // Catch:{ all -> 0x045c }
            android.media.AudioAttributes r12 = r12.build()     // Catch:{ all -> 0x045c }
            r10.setAudioAttributes(r12)     // Catch:{ all -> 0x045c }
            java.lang.String r10 = "use audio attribute to play ring"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)     // Catch:{ all -> 0x045c }
            goto L_0x0413
        L_0x040e:
            android.media.MediaPlayer r10 = r2.f304599c     // Catch:{ all -> 0x045c }
            r10.setAudioStreamType(r9)     // Catch:{ all -> 0x045c }
        L_0x0413:
            if (r3 != 0) goto L_0x041e
            if (r0 == 0) goto L_0x0418
            goto L_0x041e
        L_0x0418:
            android.media.MediaPlayer r0 = r2.f304599c     // Catch:{ all -> 0x045c }
            r0.setVolume(r11, r11)     // Catch:{ all -> 0x045c }
            goto L_0x043c
        L_0x041e:
            ou0.a r0 = pu0.C110248b.vx0()     // Catch:{ all -> 0x045c }
            int r0 = r0.mo157507d(r9)     // Catch:{ all -> 0x045c }
            ou0.a r3 = pu0.C110248b.vx0()     // Catch:{ all -> 0x045c }
            int r3 = r3.mo157506c(r9)     // Catch:{ all -> 0x045c }
            int r10 = r0 / 2
            if (r3 <= r10) goto L_0x0435
            r10 = 2
            int r3 = r0 / 2
        L_0x0435:
            ou0.a r0 = pu0.C110248b.vx0()     // Catch:{ all -> 0x045c }
            r0.mo157508g(r9, r3, r5)     // Catch:{ all -> 0x045c }
        L_0x043c:
            android.media.MediaPlayer r0 = r2.f304599c     // Catch:{ all -> 0x045c }
            r0.setLooping(r6)     // Catch:{ all -> 0x045c }
            android.media.MediaPlayer r0 = r2.f304599c     // Catch:{ all -> 0x045c }
            r0.prepare()     // Catch:{ all -> 0x045c }
            android.media.MediaPlayer r0 = r2.f304599c     // Catch:{ all -> 0x045c }
            r0.start()     // Catch:{ all -> 0x045c }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x045c }
            long r12 = r2.f304603g     // Catch:{ all -> 0x045c }
            long r9 = r9 - r12
            r12 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x04ae
            r3 = 3
            r2.f304602f = r3     // Catch:{ all -> 0x045c }
            goto L_0x04ae
        L_0x045c:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04b1 }
            r3.<init>()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r9 = "startPlayCustomRing failed, "
            r3.append(r9)     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x04b1 }
            r3.append(r0)     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x04b1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ Exception -> 0x04b1 }
            r3 = 2
            r2.f304602f = r3     // Catch:{ Exception -> 0x04b1 }
            android.content.Context r0 = r2.f304598b     // Catch:{ Exception -> 0x04a3 }
            android.net.Uri r0 = android.media.RingtoneManager.getActualDefaultRingtoneUri(r0, r6)     // Catch:{ Exception -> 0x04a3 }
            android.content.Context r3 = r2.f304598b     // Catch:{ Exception -> 0x04a3 }
            dj.g r0 = p331dj.C97481g.m125558a(r3, r0)     // Catch:{ Exception -> 0x04a3 }
            r2.f304599c = r0     // Catch:{ Exception -> 0x04a3 }
            if (r0 != 0) goto L_0x0489
            goto L_0x04ca
        L_0x0489:
            r0.stop()     // Catch:{ Exception -> 0x04a3 }
            android.media.MediaPlayer r0 = r2.f304599c     // Catch:{ Exception -> 0x04a3 }
            r0.prepare()     // Catch:{ Exception -> 0x04a3 }
            android.media.MediaPlayer r0 = r2.f304599c     // Catch:{ Exception -> 0x04a3 }
            r0.setLooping(r6)     // Catch:{ Exception -> 0x04a3 }
            android.media.MediaPlayer r0 = r2.f304599c     // Catch:{ Exception -> 0x04a3 }
            r0.setVolume(r11, r11)     // Catch:{ Exception -> 0x04a3 }
            android.media.MediaPlayer r0 = r2.f304599c     // Catch:{ Exception -> 0x04a3 }
            r0.start()     // Catch:{ Exception -> 0x04a3 }
            r2.f304602f = r5     // Catch:{ Exception -> 0x04a3 }
            goto L_0x04ae
        L_0x04a3:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x04b1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)     // Catch:{ Exception -> 0x04b1 }
            r3 = 2
            r2.f304602f = r3     // Catch:{ Exception -> 0x04b1 }
        L_0x04ae:
            r2.f304601e = r6     // Catch:{ Exception -> 0x04b1 }
            goto L_0x04ca
        L_0x04b1:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "new MediaPlayer failed, "
            r2.append(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
        L_0x04ca:
            l43.b r2 = r1.f318240d
            r2.getClass()
            java.lang.String r3 = "MicroMsg.voipcs.VoipCSViewManager"
            java.lang.String r0 = "start capture render"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            com.tencent.mm.plugin.video.ObservableTextureView r0 = r2.f327126z
            if (r0 != 0) goto L_0x0503
            java.lang.String r0 = "create capture View"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            com.tencent.mm.plugin.video.ObservableTextureView r0 = new com.tencent.mm.plugin.video.ObservableTextureView
            com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI r4 = r2.f327107d
            r0.<init>(r4)
            r2.f327126z = r0
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r0.<init>(r6, r6)
            com.tencent.mm.plugin.video.ObservableTextureView r4 = r2.f327126z
            r4.setLayoutParams(r0)
            android.widget.RelativeLayout r0 = r2.f327108e
            com.tencent.mm.plugin.video.ObservableTextureView r4 = r2.f327126z
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams
            r8.<init>(r6, r6)
            r0.addView(r4, r8)
            com.tencent.mm.plugin.video.ObservableTextureView r0 = r2.f327126z
            r0.setVisibility(r5)
        L_0x0503:
            p43.a r0 = r2.f327125y
            if (r0 != 0) goto L_0x05b0
            r0 = 640(0x280, float:8.97E-43)
            java.lang.String r4 = "create capture Render"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            p43.a r4 = new p43.a
            r8 = 480(0x1e0, float:6.73E-43)
            r4.<init>(r0, r8)
            r2.f327125y = r4
            r4.mo145977e(r2, r6)
            p43.a r0 = r2.f327125y
            com.tencent.mm.plugin.video.ObservableTextureView r4 = r2.f327126z
            r0.getClass()
            java.lang.String r8 = "MicroMsg.Voip.CaptureRender"
            java.lang.String r9 = "bind ObservableTextureView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            if (r4 != 0) goto L_0x052b
            goto L_0x0532
        L_0x052b:
            r0.f308676q = r4
            r4.setTextureChangeCallback(r0)
            r0.f308674o = r5
        L_0x0532:
            m43.b r0 = k43.C108886d.wx0()
            k43.a r0 = r0.f327737a
            p43.a r4 = r2.f327125y
            int r8 = r4.f308668f
            r0.f317572I = r8
            r4.mo145980h()
            p43.a r0 = r2.f327125y
            r0.getClass()
            android.hardware.Camera$Parameters r4 = r0.f308670h     // Catch:{ Exception -> 0x0579 }
            if (r4 == 0) goto L_0x0594
            android.hardware.Camera$Size r4 = r4.getPreviewSize()     // Catch:{ Exception -> 0x0579 }
            k43.f r8 = k43.C108886d.vx0()     // Catch:{ Exception -> 0x0579 }
            boolean r9 = r0.f308673n     // Catch:{ Exception -> 0x0579 }
            if (r9 == 0) goto L_0x0558
            r9 = 1
            goto L_0x0559
        L_0x0558:
            r9 = 0
        L_0x0559:
            android.hardware.Camera$Parameters r10 = r0.f308670h     // Catch:{ Exception -> 0x0579 }
            r10.getPreviewFrameRate()     // Catch:{ Exception -> 0x0579 }
            int r10 = r0.f308659C     // Catch:{ Exception -> 0x0579 }
            int r0 = r0.f308660D     // Catch:{ Exception -> 0x0579 }
            int r11 = r4.width     // Catch:{ Exception -> 0x0579 }
            int r4 = r4.height     // Catch:{ Exception -> 0x0579 }
            r8.getClass()     // Catch:{ Exception -> 0x0579 }
            java.lang.String r12 = "setCameraInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r12)     // Catch:{ Exception -> 0x0579 }
            r8.f326095k = r9     // Catch:{ Exception -> 0x0579 }
            r8.f326091g = r10     // Catch:{ Exception -> 0x0579 }
            r8.f326092h = r0     // Catch:{ Exception -> 0x0579 }
            r8.f326093i = r11     // Catch:{ Exception -> 0x0579 }
            r8.f326094j = r4     // Catch:{ Exception -> 0x0579 }
            goto L_0x0594
        L_0x0579:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "getCameraDataForVoipCS failed"
            r4.append(r7)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r4 = "MicroMsg.CSCaptureRender"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x0594:
            r4 = 2
            java.lang.Object[] r0 = new java.lang.Object[r4]
            p43.a r4 = r2.f327125y
            boolean r4 = r4.f308666d
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0[r5] = r4
            p43.a r2 = r2.f327125y
            boolean r2 = r2.f308667e
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0[r6] = r2
            java.lang.String r2 = "captureRender.mIsCurrentFaceCamera=%b captureRender.mIsCameraRemote180=%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r0)
        L_0x05b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip_cs.p845ui.VoipCSMainUI.mo153176K7():void");
    }

    /* renamed from: d */
    public void mo153177d(int i) {
        if (this.f318240d != null) {
            Log.m105918d("MicroMsg.voipcs.VoipCSMainUI", "onError for errCode:" + i);
            this.f318240d.mo160487e(i);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ccx;
    }

    public final void init() {
        this.f318244h = (TelephonyManager) MMApplicationContext.getContext().getSystemService("phone");
        C108886d.xx0().f326119o = this.f318245i;
        this.f318240d = new C109255b(this);
        this.f318241e = new C108367a();
        this.f318243g = new C100115c(MMApplicationContext.getContext());
        if (C109254a.f327084b == null) {
            C109254a.f327084b = new C109254a();
        }
        this.f318242f = C109254a.f327084b;
        C108886d.wx0().f327740d = this;
        C108886d.xx0().f326111d = this;
        if (C108886d.xx0().f326118n == 0 || C108886d.xx0().f326118n == 3) {
            C108886d.xx0().f326118n = 0;
        }
        C92614a.m116679d().mo126634a();
        this.f318243g.mo139415b();
        this.f318241e.mo158860h0();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        MMApplicationContext.getContext().registerReceiver(this.f318258y, intentFilter);
        C86709a0.m107529k().mo121126a(this.f318239A);
        if (this.f318253t) {
            if (this.f318251r.equals("1")) {
                if (this.f318252s.equals("video")) {
                    this.f318256w = MMApplicationContext.getContext().getString(C0966R.string.kfu);
                    this.f318255v = MMApplicationContext.getContext().getString(C0966R.string.kfy);
                    this.f318254u = MMApplicationContext.getContext().getString(C0966R.string.kfy);
                    return;
                }
                this.f318256w = MMApplicationContext.getContext().getString(C0966R.string.kfv);
                this.f318255v = MMApplicationContext.getContext().getString(C0966R.string.kfz);
                this.f318254u = MMApplicationContext.getContext().getString(C0966R.string.kfz);
            } else if (this.f318252s.equals("video")) {
                this.f318256w = MMApplicationContext.getContext().getString(C0966R.string.kfw);
                this.f318255v = MMApplicationContext.getContext().getString(C0966R.string.f361515kg0);
                this.f318254u = MMApplicationContext.getContext().getString(C0966R.string.f361515kg0);
            } else {
                this.f318256w = MMApplicationContext.getContext().getString(C0966R.string.kfv);
                this.f318255v = MMApplicationContext.getContext().getString(C0966R.string.kfz);
                this.f318254u = MMApplicationContext.getContext().getString(C0966R.string.kfz);
            }
        } else if (this.f318251r.equals("1")) {
            if (this.f318252s.equals("video")) {
                this.f318256w = MMApplicationContext.getContext().getString(C0966R.string.kfu);
                this.f318255v = MMApplicationContext.getContext().getString(C0966R.string.kfy);
                this.f318254u = MMApplicationContext.getContext().getString(C0966R.string.kfy);
                return;
            }
            this.f318256w = MMApplicationContext.getContext().getString(C0966R.string.kfv);
            this.f318255v = MMApplicationContext.getContext().getString(C0966R.string.f361517kg2);
            this.f318254u = MMApplicationContext.getContext().getString(C0966R.string.f361517kg2);
        } else if (this.f318252s.equals("video")) {
            this.f318256w = MMApplicationContext.getContext().getString(C0966R.string.kfw);
            this.f318255v = MMApplicationContext.getContext().getString(C0966R.string.f361517kg2);
            this.f318254u = MMApplicationContext.getContext().getString(C0966R.string.f361517kg2);
        } else {
            this.f318256w = MMApplicationContext.getContext().getString(C0966R.string.kfv);
            this.f318255v = MMApplicationContext.getContext().getString(C0966R.string.f361516kg1);
            this.f318254u = MMApplicationContext.getContext().getString(C0966R.string.f361516kg1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0251  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            java.lang.String r0 = "MicroMsg.voipcs.VoipCSMainUI"
            java.lang.String r1 = "onCreate voipcs...."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            super.onCreate(r15)
            r14.hideTitleView()
            android.content.Intent r15 = r14.getIntent()
            java.lang.String r1 = "voipCSBizId"
            java.lang.String r15 = r15.getStringExtra(r1)
            r14.f318245i = r15
            android.content.Intent r15 = r14.getIntent()
            java.lang.String r1 = "voipCSAppId"
            java.lang.String r15 = r15.getStringExtra(r1)
            r14.f318246j = r15
            android.content.Intent r15 = r14.getIntent()
            java.lang.String r1 = "voipCSScene"
            java.lang.String r15 = r15.getStringExtra(r1)
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r15)
            r14.f318251r = r15
            android.content.Intent r15 = r14.getIntent()
            java.lang.String r1 = "voipCSType"
            java.lang.String r15 = r15.getStringExtra(r1)
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r15)
            r14.f318252s = r15
            android.content.Intent r15 = r14.getIntent()
            java.lang.String r1 = "voipCSAllowBackCamera"
            java.lang.String r15 = r15.getStringExtra(r1)
            r14.f318248o = r15
            android.content.Intent r15 = r14.getIntent()
            java.lang.String r1 = "voipCSShowOther"
            java.lang.String r15 = r15.getStringExtra(r1)
            r14.f318249p = r15
            android.content.Intent r15 = r14.getIntent()
            java.lang.String r1 = "voipCSAvatarUrl"
            java.lang.String r15 = r15.getStringExtra(r1)
            r14.f318247n = r15
            android.content.Intent r15 = r14.getIntent()
            java.lang.String r1 = "voipCSContext"
            java.lang.String r15 = r15.getStringExtra(r1)
            r14.f318250q = r15
            android.content.Intent r15 = r14.getIntent()
            java.lang.String r1 = "launch_from_appbrand"
            r2 = 0
            boolean r15 = r15.getBooleanExtra(r1, r2)
            r14.f318253t = r15
            android.view.Window r15 = r14.getWindow()
            r1 = 6946944(0x6a0080, float:9.734742E-39)
            r15.addFlags(r1)
            android.view.Window r15 = r14.getWindow()
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r15.addFlags(r1)
            com.tencent.mm.sdk.platformtools.MMHandler r15 = new com.tencent.mm.sdk.platformtools.MMHandler
            r15.<init>()
            k43.f r15 = k43.C108886d.vx0()
            r15.getClass()
            java.lang.String r1 = "MicroMsg.VoipCSReportHelper"
            java.lang.String r3 = "reset"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r3)
            r15.f326081a = r2
            r15.f326083b = r2
            r15.f326085c = r2
            r15.f326087d = r2
            r15.f326089e = r2
            r15.f326090f = r2
            r15.f326091g = r2
            r15.f326092h = r2
            r15.f326093i = r2
            r15.f326094j = r2
            r15.f326095k = r2
            r15.f326096l = r2
            r15.f326097m = r2
            r15.f326098n = r2
            r15.f326099o = r2
            r3 = 0
            r15.f326100p = r3
            r15.f326101q = r3
            java.lang.String r1 = ""
            r15.f326102r = r1
            r15.f326104t = r2
            r15.f326106v = r2
            r15.f326107w = r2
            r15.f326108x = r2
            r15.f326109y = r2
            r15.f326110z = r2
            r15.f326055A = r2
            r15.f326056B = r2
            r15.f326057C = r2
            r15.f326058D = r2
            r15.f326059E = r2
            r15.f326060F = r3
            r15.f326061G = r2
            r15.f326062H = r3
            r15.f326063I = r3
            r15.f326064J = r3
            r15.f326065K = r3
            r15.f326066L = r2
            r15.f326067M = r2
            r3 = 1
            r15.f326068N = r3
            r15.f326069O = r2
            r15.f326070P = r2
            r15.f326071Q = r2
            r15.f326072R = r2
            r15.f326086c0 = r1
            r15.f326088d0 = r1
            r15.f326077W = r2
            r15.f326078X = r2
            r15.f326079Y = r2
            r15.f326080Z = r2
            r14.init()
            android.telephony.TelephonyManager r15 = r14.f318244h
            int r15 = r15.getCallState()
            r1 = 2
            r4 = 2131821704(0x7f110488, float:1.9276159E38)
            if (r15 == r1) goto L_0x0129
            if (r15 != r3) goto L_0x0127
            goto L_0x0129
        L_0x0127:
            r15 = 0
            goto L_0x0142
        L_0x0129:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r1[r2] = r15
            java.lang.String r15 = "check is phone use now ! TelephoneManager.callState is %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r15, r1)
            r15 = 2131838599(0x7f114687, float:1.9310426E38)
            o43.a r1 = new o43.a
            r1.<init>(r14)
            nj3.C76879j.m92742m(r14, r15, r4, r1)
            r15 = 1
        L_0x0142:
            if (r15 == 0) goto L_0x014a
            java.lang.String r15 = "can not start voip cs  by in telephone talking!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r15)
            return
        L_0x014a:
            android.telephony.TelephonyManager r15 = r14.f318244h
            android.telephony.PhoneStateListener r1 = r14.f318259z
            r5 = 32
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r13.mo10233c(r5)
            r13.mo10233c(r1)
            java.lang.Object[] r6 = r13.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/voip_cs/ui/VoipCSMainUI"
            java.lang.String r8 = "onCreate"
            java.lang.String r9 = "(Landroid/os/Bundle;)V"
            java.lang.String r10 = "android/telephony/TelephonyManager_EXEC_"
            java.lang.String r11 = "listen"
            java.lang.String r12 = "(Landroid/telephony/PhoneStateListener;I)V"
            r5 = r15
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r1 = r13.mo10231a(r2)
            android.telephony.PhoneStateListener r1 = (android.telephony.PhoneStateListener) r1
            java.lang.Object r5 = r13.mo10231a(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r15.listen(r1, r5)
            java.lang.String r6 = "com/tencent/mm/plugin/voip_cs/ui/VoipCSMainUI"
            java.lang.String r7 = "onCreate"
            java.lang.String r8 = "(Landroid/os/Bundle;)V"
            java.lang.String r9 = "android/telephony/TelephonyManager_EXEC_"
            java.lang.String r10 = "listen"
            java.lang.String r11 = "(Landroid/telephony/PhoneStateListener;I)V"
            r5 = r15
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            boolean r15 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isNetworkConnected(r14)
            r1 = 2131838669(0x7f1146cd, float:1.9310568E38)
            if (r15 != 0) goto L_0x01b2
            java.lang.String r15 = "isNetworkAvailable false, not connected!cannot start voip cs!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r15)
            r15 = 2131821610(0x7f11042a, float:1.9275968E38)
            o43.f r5 = new o43.f
            r5.<init>(r14)
            nj3.C76879j.m92742m(r14, r15, r1, r5)
            goto L_0x01d4
        L_0x01b2:
            boolean r15 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r14)
            if (r15 != 0) goto L_0x01d6
            boolean r15 = com.tencent.p014mm.plugin.voip.model.C106348g0.m143242c()
            if (r15 == 0) goto L_0x01bf
            goto L_0x01d6
        L_0x01bf:
            java.lang.String r15 = "check is not wifi network!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r15)
            r15 = 2131838596(0x7f114684, float:1.931042E38)
            o43.g r5 = new o43.g
            r5.<init>(r14)
            o43.h r6 = new o43.h
            r6.<init>(r14)
            nj3.C76879j.m92743n(r14, r15, r1, r5, r6)
        L_0x01d4:
            r15 = 0
            goto L_0x01d7
        L_0x01d6:
            r15 = 1
        L_0x01d7:
            if (r15 != 0) goto L_0x01df
            java.lang.String r15 = "can not start voip cs  by in  voip talking!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r15)
            return
        L_0x01df:
            java.lang.Class<vz.f> r15 = p734vz.C90876f.class
            di3.d r1 = di3.C86312j.m106911c(r15)
            vz.f r1 = (p734vz.C90876f) r1
            boolean r1 = r1.mo124867WV()
            if (r1 == 0) goto L_0x01fe
            java.lang.String r15 = "check  is voip talking now!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r15)
            r15 = 2131831443(0x7f112a93, float:1.9295912E38)
            o43.b r1 = new o43.b
            r1.<init>(r14)
            nj3.C76879j.m92742m(r14, r15, r4, r1)
            goto L_0x0248
        L_0x01fe:
            di3.d r15 = di3.C86312j.m106911c(r15)
            vz.f r15 = (p734vz.C90876f) r15
            boolean r15 = r15.mo124868Wj()
            if (r15 == 0) goto L_0x021b
            java.lang.String r15 = "check is ipCall talking now!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r15)
            r15 = 2131831444(0x7f112a94, float:1.9295914E38)
            o43.c r1 = new o43.c
            r1.<init>(r14)
            nj3.C76879j.m92742m(r14, r15, r4, r1)
            goto L_0x0248
        L_0x021b:
            boolean r15 = p182kk.C61104a.m71644D()
            if (r15 == 0) goto L_0x0232
            java.lang.String r15 = "check is multiTalking  now!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r15)
            r15 = 2131831437(0x7f112a8d, float:1.92959E38)
            o43.d r1 = new o43.d
            r1.<init>(r14)
            nj3.C76879j.m92742m(r14, r15, r4, r1)
            goto L_0x0248
        L_0x0232:
            boolean r15 = dd0.C75346e.m90355a()
            if (r15 == 0) goto L_0x0249
            java.lang.String r15 = "check is in talktRoom  now!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r15)
            r15 = 2131831438(0x7f112a8e, float:1.9295902E38)
            o43.e r1 = new o43.e
            r1.<init>(r14)
            nj3.C76879j.m92742m(r14, r15, r4, r1)
        L_0x0248:
            r2 = 1
        L_0x0249:
            if (r2 == 0) goto L_0x0251
            java.lang.String r15 = "can not start voip cs  by in other voip talking!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r15)
            return
        L_0x0251:
            boolean r15 = r14.mo153173H7()
            if (r15 == 0) goto L_0x025a
            r14.mo153176K7()
        L_0x025a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip_cs.p845ui.VoipCSMainUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        int i;
        int i2;
        PhoneStateListener phoneStateListener;
        Log.m105924i("MicroMsg.voipcs.VoipCSMainUI", "onDestroy voipcs....");
        C100115c cVar = this.f318243g;
        if (cVar != null) {
            cVar.mo139414a();
        }
        StartVoipCSResultEvent startVoipCSResultEvent = new StartVoipCSResultEvent();
        int i3 = 4;
        if (C108886d.xx0().f326121q == -1) {
            startVoipCSResultEvent.f9556d.f9557a = 3;
        } else if (C108886d.xx0().f326121q == 823) {
            startVoipCSResultEvent.f9556d.f9557a = 4;
        } else if (C108886d.xx0().f326118n <= 1) {
            startVoipCSResultEvent.f9556d.f9557a = 1;
        } else if (C108886d.xx0().f326118n >= 2) {
            startVoipCSResultEvent.f9556d.f9557a = 2;
        }
        startVoipCSResultEvent.publish();
        C108367a aVar = this.f318241e;
        aVar.getClass();
        C108887f vx02 = C108886d.vx0();
        if (aVar.f324419m == null || C108886d.vx0().f326058D != 1) {
            i = 0;
        } else {
            C106336d dVar = aVar.f324419m;
            C87412m.m108591d(dVar);
            i = dVar.mo152548g();
        }
        vx02.f326072R = (int) ((((float) aVar.mo157506c(i)) / ((float) aVar.mo157507d(i))) * ((float) 100));
        C108887f vx03 = C108886d.vx0();
        if (aVar.f324418l == null || C108886d.vx0().f326058D != 1) {
            i2 = 0;
        } else {
            C110390f fVar = aVar.f324418l;
            C87412m.m108591d(fVar);
            i2 = fVar.mo161897b();
        }
        vx03.f326070P = i2;
        C110390f fVar2 = aVar.f324418l;
        if (fVar2 != null) {
            fVar2.mo161907l();
        }
        C106336d dVar2 = aVar.f324419m;
        if (dVar2 != null) {
            dVar2.mo152546e();
        }
        C103310i iVar = this.f318242f.f327085a;
        if (iVar != null) {
            iVar.mo143090f();
        }
        C109255b bVar = this.f318240d;
        if (bVar != null) {
            if (C108886d.vx0().f326081a == 0) {
                if (C108886d.xx0().f326118n < 2) {
                    C108886d.vx0().f326081a = 1;
                } else {
                    C108886d.vx0().f326081a = 3;
                }
            }
            bVar.f327121u.mo153106g();
            bVar.f327119s.mo153106g();
            bVar.mo160492j();
            if (bVar.f327103P != null) {
                Log.m105918d("MicroMsg.voipcs.VoipCSViewManager", "stop videodecode thread...");
                C109255b.C109266k kVar = bVar.f327103P;
                kVar.f327136e = true;
                kVar.mo97819a();
                bVar.f327103P = null;
            }
            C108888g xx02 = C108886d.xx0();
            xx02.getClass();
            Log.m105924i("MicroMsg.voipcs.VoipCSService", "now stop service");
            C86709a0.m107524d().mo123470p(823, xx02);
            C86709a0.m107524d().mo123470p(106, xx02);
            C86709a0.m107524d().mo123470p(818, xx02);
            C86709a0.m107524d().mo123470p(C82956d.CTRL_INDEX, xx02);
            C86709a0.m107524d().mo123470p(C1821q0.CTRL_INDEX, xx02);
            C86709a0.m107524d().mo123470p(312, xx02);
            xx02.f326118n = 3;
            if (xx02.f326121q != 823) {
                C86709a0.m107524d().mo123455a(C86956l0.CTRL_INDEX, xx02);
                int i4 = xx02.f326114g;
                if (i4 == 0) {
                    i3 = 1;
                } else if (i4 == 2) {
                    i3 = 2;
                } else if (i4 == 3) {
                    i3 = 3;
                }
                Log.m105924i("MicroMsg.voipcs.VoipCSService", "start netscene hangup for username:" + xx02.f326119o + ",inviteId：" + C108886d.wx0().f327737a.f317668r + ",csroomId:" + C108886d.wx0().f327737a.f317659o + ",roomkey:" + C108886d.wx0().f327737a.f317665q + ",reason:" + i3);
                C86709a0.m107524d().mo123460f(new C47156a(C108886d.wx0().f327737a.f317668r, C108886d.wx0().f327737a.f317659o, C108886d.wx0().f327737a.f317665q, xx02.f326119o, i3));
            }
            xx02.f326123s.stopTimer();
            xx02.f326124t.stopTimer();
            xx02.f326112e = 0;
            xx02.f326113f = 0;
            xx02.f326114g = 0;
            xx02.f326115h = 0;
            xx02.f326116i = null;
            xx02.f326117j = 0;
            xx02.f326118n = 0;
            xx02.f326119o = "";
            xx02.f326121q = 0;
            xx02.f326122r = 999;
            C109499b wx02 = C108886d.wx0();
            wx02.getClass();
            Log.m105924i("MicroMsg.VoipCSEngine", "now stop engine");
            wx02.f327737a.mo152850x(true);
            C108887f vx04 = C108886d.vx0();
            if (Util.isNullOrNil(vx04.f326086c0) && Util.isNullOrNil(vx04.f326088d0)) {
                C108884a aVar2 = C108886d.wx0().f327737a;
                int i5 = vx04.f326056B == 1 ? 1 : 0;
                byte[] bArr = aVar2.f326050i2;
                aVar2.getVoipcsChannelInfo(bArr, bArr.length, i5);
                Log.m105919d("MicroMsg.CSV2protocal", "field_voipcsEngineInfoLength: %d", Integer.valueOf(aVar2.field_voipcsChannelInfoLength));
                vx04.f326086c0 = new String(aVar2.f326050i2, 0, aVar2.field_voipcsChannelInfoLength);
                C108884a aVar3 = C108886d.wx0().f327737a;
                byte[] bArr2 = aVar3.f326051j2;
                aVar3.getVoipcsEngineInfo(bArr2, bArr2.length);
                Log.m105919d("MicroMsg.CSV2protocal", "field_voipcsEngineInfoLength: %d", Integer.valueOf(aVar3.field_voipcsEngineInfoLength));
                String str = "" + aVar3.f317662p + "," + aVar3.f317665q + "," + aVar3.f317659o + "," + C108886d.vx0().f326058D + "," + aVar3.f317572I + "," + aVar3.f317575J + aVar3.mo152796h() + new String(aVar3.f326051j2, 0, aVar3.field_voipcsEngineInfoLength);
                C112597j.m153938c("MicroMsg.CSV2protocal", "voipreport:NewEngineString:" + str);
                vx04.f326088d0 = str;
                Log.m105919d("MicroMsg.VoipCSReportHelper", "nativeChannelReportString: %s", vx04.f326086c0);
                Log.m105919d("MicroMsg.VoipCSReportHelper", "nativeEngineReportString: %s", vx04.f326088d0);
            }
            C108888g xx03 = C108886d.xx0();
            xx03.getClass();
            C86709a0.m107524d().mo123455a(312, xx03);
            C86709a0.m107524d().mo123460f(new C109682e(C108886d.wx0().f327737a.f317659o, C108886d.wx0().f327737a.f317665q));
            wx02.f327737a.mo152851y();
            C106343f0.m143231a().mo152578e();
            C106343f0.m143231a().mo152575b((C106343f0.C106347d) null);
        }
        this.f318240d = null;
        C108367a aVar4 = this.f318241e;
        aVar4.getClass();
        C110066a.m149592a0(aVar4, 0, (C32224a) null, 2, (Object) null);
        aVar4.mo161477T("voipcs");
        MMApplicationContext.getContext().unregisterReceiver(this.f318258y);
        C86709a0.m107529k().mo121129d(this.f318239A);
        MTimerHandler mTimerHandler = this.f318257x;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(44);
        TelephonyManager telephonyManager = this.f318244h;
        if (!(telephonyManager == null || (phoneStateListener = this.f318259z) == null)) {
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar5.mo10233c(0);
            aVar5.mo10233c(phoneStateListener);
            TelephonyManager telephonyManager2 = telephonyManager;
            C117292a.m165358d(telephonyManager2, aVar5.mo10232b(), "com/tencent/mm/plugin/voip_cs/ui/VoipCSMainUI", "onDestroy", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
            telephonyManager.listen((PhoneStateListener) aVar5.mo10231a(0), ((Integer) aVar5.mo10231a(1)).intValue());
            C117292a.m165359e(telephonyManager2, "com/tencent/mm/plugin/voip_cs/ui/VoipCSMainUI", "onDestroy", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
            this.f318259z = null;
        }
        this.f318241e.getClass();
        C110248b.f329777h.mo161670o("voipcs");
        this.f318241e = null;
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return true;
        }
        if (i == 25) {
            C108367a aVar = this.f318241e;
            C103310i iVar = this.f318242f.f327085a;
            C107043a.m144903a(this.f318241e.f329358h, aVar.mo158859g0(iVar != null ? !iVar.f304601e : true), -1, 5);
            return true;
        } else if (i != 24) {
            return super.onKeyDown(i, keyEvent);
        } else {
            C108367a aVar2 = this.f318241e;
            C103310i iVar2 = this.f318242f.f327085a;
            C107043a.m144903a(this.f318241e.f329358h, aVar2.mo158859g0(iVar2 != null ? !iVar2.f304601e : true), 1, 5);
            return true;
        }
    }

    public void onPause() {
        Class cls = C79690d.class;
        super.onPause();
        C103310i iVar = this.f318242f.f327085a;
        if (!(iVar != null ? !iVar.f304601e : true) && iVar != null) {
            iVar.mo143090f();
        }
        if (C108886d.xx0().f326118n == 1 || C108886d.xx0().f326118n == 2) {
            Intent intent = new Intent(MMApplicationContext.getContext(), VoipCSMainUI.class);
            intent.putExtra("voipCSBizId", this.f318245i);
            intent.putExtra("voipCSAppId", this.f318246j);
            intent.putExtra("voipCSScene", this.f318251r);
            intent.putExtra("voipCSType", this.f318252s);
            intent.putExtra("voipCSAllowBackCamera", this.f318248o);
            intent.putExtra("voipCSShowOther", this.f318249p);
            intent.putExtra("voipCSAvatarUrl", this.f318247n);
            intent.putExtra("voipCSContext", this.f318250q);
            intent.putExtra("launch_from_appbrand", this.f318253t);
            PendingIntent activity = PendingIntent.getActivity(MMApplicationContext.getContext(), 44, intent, 134217728);
            C90116e.C90121c cVar = new C90116e.C90121c(MMApplicationContext.getContext(), "reminder_channel_id");
            cVar.mo124390o(this.f318255v);
            cVar.f258814z.when = System.currentTimeMillis();
            cVar.mo124383h(this.f318256w);
            cVar.mo124382g(this.f318254u);
            cVar.f258795g = activity;
            cVar.mo124384i(2, true);
            Notification b = cVar.mo124378b();
            b.icon = C0966R.C0969drawable.c9k;
            b.flags |= 32;
            ((MMNotification) ((C79690d) C86312j.m106911c(cls)).mo109806kA()).mo93215l(44, b, false);
            MTimerHandler mTimerHandler = this.f318257x;
            if (mTimerHandler != null && mTimerHandler.stopped()) {
                this.f318257x.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            }
        } else {
            ((MMNotification) ((C79690d) C86312j.m106911c(cls)).mo109806kA()).mo93207e(44);
            MTimerHandler mTimerHandler2 = this.f318257x;
            if (mTimerHandler2 != null) {
                mTimerHandler2.stopTimer();
            }
        }
        this.f318240d.mo160492j();
        this.f318240d.f327089A = true;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (strArr == null || strArr.length == 0 || iArr == null || iArr.length == 0) {
            Log.m105921e("MicroMsg.voipcs.VoipCSMainUI", "[voip_cs]onRequestPermissionsResult %d data is invalid", Integer.valueOf(i));
            return;
        }
        Log.m105919d("MicroMsg.voipcs.VoipCSMainUI", "[voip_cs] onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        int i2 = C0966R.string.f361130hi2;
        if (i != 19) {
            if (i == 82) {
                if (iArr[0] == 0) {
                    Log.m105918d("MicroMsg.voipcs.VoipCSMainUI", "granted record audio!");
                    if (((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this, "android.permission.CAMERA", 19, "", "")) {
                        mo153176K7();
                        return;
                    }
                    return;
                }
                C76879j.m92709C(this, getString(C0966R.string.f361130hi2), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C106523c(), new C106524d());
            }
        } else if (iArr[0] == 0) {
            mo153176K7();
        } else {
            if ("android.permission.CAMERA".equals(strArr[0])) {
                i2 = C0966R.string.hhq;
            }
            C76879j.m92709C(this, getString(i2), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C106525e(), new C106526f());
        }
    }

    public void onRestart() {
        Log.m105924i("MicroMsg.voipcs.VoipCSMainUI", "onRestart voipcs....");
        super.onRestart();
        if (mo153173H7() && C108886d.xx0().f326118n <= 1) {
            mo153176K7();
        }
        C109255b bVar = this.f318240d;
        if (bVar != null) {
            bVar.f327089A = false;
        }
    }

    public void onResume() {
        Log.m105924i("MicroMsg.voipcs.VoipCSMainUI", "onResume voipcs....");
        super.onResume();
        C109255b bVar = this.f318240d;
        if (bVar != null) {
            bVar.f327089A = false;
            if (C108886d.xx0().f326118n > 1) {
                mo153176K7();
                String str = this.f318249p;
                if (str != null && str.equals("1")) {
                    C109255b bVar2 = this.f318240d;
                    if (bVar2.f327103P != null) {
                        Log.m105918d("MicroMsg.voipcs.VoipCSViewManager", "stop videodecode thread...");
                        C109255b.C109266k kVar = bVar2.f327103P;
                        kVar.f327136e = true;
                        kVar.mo97819a();
                        bVar2.f327103P = null;
                    }
                    C109255b.C109266k kVar2 = new C109255b.C109266k();
                    bVar2.f327103P = kVar2;
                    ((C119157j) C119157j.f356862d).mo183875f(kVar2);
                    Log.m105918d("MicroMsg.voipcs.VoipCSViewManager", "start video decode thread..");
                }
            }
        }
        MTimerHandler mTimerHandler = this.f318257x;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(44);
    }

    public void onStop() {
        super.onStop();
    }
}
