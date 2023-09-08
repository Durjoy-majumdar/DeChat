package com.tencent.p014mm.plugin.voip.widget;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import bd2.C79690d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.p475ui.C106443e;
import com.tencent.p014mm.plugin.voip.p475ui.C106447f;
import com.tencent.p014mm.plugin.voip.p475ui.C106448g;
import com.tencent.p014mm.plugin.voip.p475ui.C106453j0;
import com.tencent.p014mm.plugin.voip.p475ui.C106461k0;
import com.tencent.p014mm.plugin.voip.p475ui.C106464l0;
import com.tencent.p014mm.plugin.voip.p475ui.C106466m0;
import com.tencent.p014mm.plugin.voip.p475ui.VideoActivity;
import com.tencent.p014mm.plugin.voip.p475ui.VoipViewFragment;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.file.XVFSFile;
import d62.C75339i;
import di3.C86312j;
import eb0.C7624i3;
import f40.C86709a0;
import j20.C117292a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import l33.C109247e;
import nc0.C76850a;
import p492dn.C107054l;
import p918s2.C90116e;
import qe3.C89625d;
import uu1.C111222b;
import z33.C112594g;
import z33.C112595h;
import z33.C112604l;
import z33.C91617n;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.voip.widget.c */
public class C106510c implements C106447f, ServiceConnection {

    /* renamed from: d */
    public C106448g f318209d;

    /* renamed from: e */
    public BaseSmallView f318210e;

    /* renamed from: f */
    public MTimerHandler f318211f;

    /* renamed from: g */
    public boolean f318212g = false;

    /* renamed from: h */
    public PowerManager.WakeLock f318213h;

    /* renamed from: i */
    public int f318214i = -1;

    /* renamed from: j */
    public C72996z1 f318215j;

    /* renamed from: n */
    public boolean f318216n;

    /* renamed from: o */
    public long f318217o = -1;

    /* renamed from: p */
    public boolean f318218p;

    /* renamed from: q */
    public long f318219q = -1;

    /* renamed from: r */
    public boolean f318220r = false;

    /* renamed from: s */
    public boolean f318221s = false;

    /* renamed from: t */
    public boolean f318222t = false;

    /* renamed from: u */
    public boolean f318223u = false;

    /* renamed from: v */
    public View.OnClickListener f318224v = new C106511a();

    /* renamed from: w */
    public int f318225w = -1;

    /* renamed from: x */
    public boolean f318226x = false;

    /* renamed from: y */
    public PowerManager.WakeLock f318227y;

    /* renamed from: com.tencent.mm.plugin.voip.widget.c$a */
    public class C106511a implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.voip.widget.c$a$a */
        public class C106512a implements Runnable {
            public C106512a() {
            }

            public void run() {
                C106510c.this.mo153158b(false);
            }
        }

        public C106511a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C106510c.this.f318209d.mo152434M();
            Intent d = !C112595h.f337167b ? C106510c.this.mo153160d() : C106510c.this.mo153159c();
            if (d != null) {
                d.setFlags(268435456);
                try {
                    PendingIntent.getActivity(MMApplicationContext.getContext(), 0, d, 0).send();
                } catch (PendingIntent.CanceledException e) {
                    Log.printErrStackTrace("MicroMsg.Voip.NewVoipSmallWindow", e, "send pending intent error: %s", e.getMessage());
                }
            }
            MMHandlerThread.postToMainThreadDelayed(new C106512a(), 200);
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.widget.c$b */
    public class C106513b implements MTimerHandler.CallBack {

        /* renamed from: com.tencent.mm.plugin.voip.widget.c$b$a */
        public class C106514a implements Runnable {
            public C106514a() {
            }

            public void run() {
                C106453j0 wx02 = C109247e.wx0();
                String a = C106510c.this.mo153157a();
                VoipViewFragment voipViewFragment = wx02.f317987a;
                if (voipViewFragment != null) {
                    voipViewFragment.mo152991f(a);
                }
            }
        }

        public C106513b() {
        }

        public boolean onTimerExpired() {
            ((C119157j) C119157j.f356862d).mo183895z(new C106514a());
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.widget.c$c */
    public class C106515c implements C106443e {
        public C106515c() {
        }

        /* renamed from: a */
        public boolean mo150077a() {
            C106510c cVar = C106510c.this;
            if (!cVar.f318216n) {
                return C112604l.m153982e(cVar.f318214i) || C112604l.m153984g(C106510c.this.f318214i);
            }
            String string = MMApplicationContext.getContext().getString(C0966R.string.kj_);
            C106510c.this.mo153163g(string, ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(C106510c.this.f318215j.getUsername()), string, false);
            if (C112604l.m153982e(C106510c.this.f318214i) || C112604l.m153984g(C106510c.this.f318214i)) {
                C106510c.this.f318212g = true;
                return true;
            }
            ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(40);
            C106510c.this.mo153158b(false);
            return false;
        }

        /* renamed from: b */
        public void mo150078b() {
            C106510c cVar = C106510c.this;
            C106448g gVar = cVar.f318209d;
            if (gVar != null) {
                gVar.mo152464d(cVar);
            }
        }

        /* renamed from: c */
        public void mo150079c() {
            C106448g gVar = C106510c.this.f318209d;
            if (gVar != null) {
                gVar.mo152497y();
            }
        }

        /* renamed from: d */
        public void mo150080d(Intent intent, BaseSmallView baseSmallView) {
            if (intent.getBooleanExtra("Voip_Is_Talking", false)) {
                C106453j0 wx02 = C109247e.wx0();
                String a = C106510c.this.mo153157a();
                VoipViewFragment voipViewFragment = wx02.f317987a;
                if (voipViewFragment != null) {
                    voipViewFragment.mo152991f(a);
                }
            } else {
                C106453j0 wx03 = C109247e.wx0();
                String string = MMApplicationContext.getContext().getString(C0966R.string.khm);
                VoipViewFragment voipViewFragment2 = wx03.f317987a;
                if (voipViewFragment2 != null) {
                    voipViewFragment2.mo152990e(string);
                }
            }
            C106510c cVar = C106510c.this;
            if (cVar.f318216n && cVar.f318212g) {
                cVar.f318212g = false;
                cVar.f318210e = baseSmallView;
                cVar.mo153161e();
            }
        }
    }

    public C106510c(C106448g gVar, int i, C72996z1 z1Var, boolean z, boolean z2, boolean z3) {
        Log.m105925i("MicroMsg.Voip.NewVoipSmallWindow", "initState: %s, talker: %s, isVideoCall: %b", C112604l.m153981d(i), z1Var.getUsername(), Boolean.valueOf(z));
        this.f318215j = z1Var;
        this.f318209d = gVar;
        this.f318216n = z;
        this.f318218p = z2;
        this.f318222t = z3;
        int i2 = i;
        mo152924e5(0, i);
        PowerManager.WakeLock newWakeLock = ((PowerManager) MMApplicationContext.getContext().getSystemService("power")).newWakeLock(536870922, "MicroMsg.Voip.NewVoipSmallWindow");
        this.f318213h = newWakeLock;
        PowerManager.WakeLock wakeLock = newWakeLock;
        C117292a.m165357c(wakeLock, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "<init>", "(Lcom/tencent/mm/plugin/voip/ui/IVoipUIListener;ILcom/tencent/mm/storage/Contact;ZZZ)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        newWakeLock.acquire();
        C117292a.m165359e(wakeLock, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "<init>", "(Lcom/tencent/mm/plugin/voip/ui/IVoipUIListener;ILcom/tencent/mm/storage/Contact;ZZZ)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
    }

    /* renamed from: B */
    public void mo152906B() {
        C106453j0 wx02 = C109247e.wx0();
        if (wx02.f317987a != null && !wx02.f317990d) {
            ((C119157j) C119157j.f356862d).mo183894y("showIcon");
            ((C119157j) C119157j.f356862d).mo183876g(new C106464l0(wx02), "showIcon");
        }
    }

    /* renamed from: F3 */
    public void mo152907F3(int i, String str) {
        char c;
        if (i == 241) {
            MMApplicationContext.getContext();
        }
        Log.m105918d("MicroMsg.Voip.NewVoipSmallWindow", "getHintByErrorCode " + i);
        if (i == 235) {
            c = 18065;
        } else if (i == 233) {
            C109247e.xx0().mo152589C(1);
            c = 18064;
        } else {
            c = i == 237 ? (!C76850a.m92642n() || this.f318216n) ? (char) 18066 : 18068 : i == 236 ? 18088 : i == 211 ? (char) 18067 : 0;
        }
        if (c == 0) {
            MMApplicationContext.getContext();
        } else {
            MMApplicationContext.getContext();
        }
    }

    /* renamed from: G */
    public void mo152908G(int i) {
        BaseSmallView baseSmallView = this.f318210e;
        if (baseSmallView != null) {
            baseSmallView.mo153119e(i);
        }
    }

    /* renamed from: G0 */
    public void mo152909G0(int i) {
    }

    /* renamed from: J1 */
    public /* synthetic */ void mo152912J1(List list) {
    }

    /* renamed from: Q2 */
    public void mo152915Q2(String str) {
    }

    /* renamed from: R */
    public void mo152916R(int i) {
        int i2 = this.f318225w;
        if (!(i2 == -1 || i2 == i)) {
            C106453j0 wx02 = C109247e.wx0();
            if (wx02.f317987a != null && !wx02.f317990d) {
                ((C119157j) C119157j.f356862d).mo183894y("showIcon");
                ((C119157j) C119157j.f356862d).mo183876g(new C106466m0(wx02, i), "showIcon");
            }
        }
        C106448g gVar = this.f318209d;
        if (gVar != null) {
            gVar.mo152443R(i);
        }
        this.f318225w = i;
    }

    /* renamed from: T6 */
    public void mo152917T6(long j) {
        this.f318217o = j;
        BaseSmallView baseSmallView = this.f318210e;
        if (baseSmallView != null) {
            baseSmallView.setConnectSec(j);
            return;
        }
        int i = this.f318214i;
        if (261 == i || 7 == i) {
            String string = MMApplicationContext.getContext().getString(C0966R.string.kjj);
            mo153163g(string, ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f318215j.getUsername()), string, false);
        }
    }

    /* renamed from: V */
    public void mo152918V(int i) {
    }

    /* renamed from: V0 */
    public void mo152919V0() {
    }

    /* renamed from: Z1 */
    public void mo152920Z1(boolean z) {
        C109247e.wx0().mo153007c(true);
    }

    /* renamed from: a */
    public String mo153157a() {
        long j = this.f318217o;
        int currentTimeMillis = (int) ((System.currentTimeMillis() / 1000) - j);
        if (j == -1) {
            currentTimeMillis = 0;
        }
        String format = currentTimeMillis >= 3600 ? String.format(Locale.US, "%d:%02d:%02d", new Object[]{Integer.valueOf(currentTimeMillis / 3600), Integer.valueOf((currentTimeMillis % 3600) / 60), Integer.valueOf(currentTimeMillis % 60)}) : currentTimeMillis >= 600 ? String.format(Locale.US, "%d:%02d", new Object[]{Integer.valueOf(currentTimeMillis / 60), Integer.valueOf(currentTimeMillis % 60)}) : String.format(Locale.US, "%02d:%02d", new Object[]{Integer.valueOf(currentTimeMillis / 60), Integer.valueOf(currentTimeMillis % 60)});
        return Util.isNullOrNil(format) ? "00:00" : format;
    }

    /* renamed from: a5 */
    public void mo152921a5() {
    }

    /* renamed from: b */
    public final void mo153158b(boolean z) {
        Log.m105925i("MicroMsg.Voip.NewVoipSmallWindow", "removeSmallView isFinish: %b", Boolean.valueOf(z));
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(40);
        MTimerHandler mTimerHandler = this.f318211f;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        if (z) {
            C106453j0 wx02 = C109247e.wx0();
            if (wx02.f317987a != null) {
                wx02.f317990d = true;
                ((C119157j) C119157j.f356862d).mo183894y("showIcon");
                ((C119157j) C119157j.f356862d).mo183895z(new C106461k0(wx02));
            } else {
                wx02.mo153005a(true);
            }
        } else {
            C109247e.wx0().mo153005a(false);
        }
        BaseSmallView baseSmallView = this.f318210e;
        if (baseSmallView != null && !z) {
            baseSmallView.mo153123k();
            if (this.f318210e.getParent() != null) {
                ((ViewGroup) this.f318210e.getParent()).removeAllViews();
            }
            this.f318210e = null;
        }
    }

    /* renamed from: c */
    public Intent mo153159c() {
        String str = C109247e.xx0().f317332a.f317413r;
        boolean z = C109247e.xx0().f317332a.f317414s;
        if (!TextUtils.isEmpty(str)) {
            return ((C111222b) C86312j.m106911c(C111222b.class)).mo161937r8(MMApplicationContext.getContext(), str, z);
        }
        Log.m105928w("MicroMsg.Voip.NewVoipSmallWindow", "null talkName");
        return null;
    }

    /* renamed from: c2 */
    public void mo152922c2() {
        C109247e.wx0().mo153007c(false);
    }

    /* renamed from: d */
    public Intent mo153160d() {
        Intent intent = new Intent();
        intent.setClass(MMApplicationContext.getContext(), VideoActivity.class);
        intent.putExtra("Voip_Call_From", 3);
        C112594g.f337165d = Util.currentTicks();
        Log.m105924i("MicroMsg.VoipActivityReport", "markStartActivityMiniView");
        C115669n.INSTANCE.mo175913w(1433, 5, 1);
        return intent;
    }

    /* renamed from: e */
    public final void mo153161e() {
        Log.m105924i("MicroMsg.Voip.NewVoipSmallWindow", "setVideoTalkingView");
        BaseSmallView baseSmallView = this.f318210e;
        if (baseSmallView != null) {
            baseSmallView.setStatus(this.f318214i);
            this.f318210e.setConnectSec(this.f318217o);
            this.f318210e.setVoipUIListener(this.f318209d);
            Context context = MMApplicationContext.getContext();
            float q = C109247e.xx0().mo152618q(true);
            int height = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getHeight() / 5;
            this.f318210e.mo153121i((int) (((float) height) * q), height);
            this.f318210e.setOnClickListener(this.f318224v);
            Log.m105924i("MicroMsg.Voip.NewVoipSmallWindow", "now add to view..");
            Log.m105925i("MicroMsg.Voip.NewVoipSmallWindow", "steve: showMiniSmallView decMode:%d, beautyCmd:%d", 0, 0);
        }
    }

    /* renamed from: e3 */
    public void mo152923e3(int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r10 == 4105) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r10 == 4106) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        mo153158b(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        mo153164h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (r9.f318221s != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.Voip.NewVoipSmallWindow", "showVoiceTalking");
        r9.f318221s = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (-1 != r9.f318219q) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        r9.f318219q = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext().getString(com.tencent.p014mm.C0966R.string.kjj);
        mo153163g(r11, ((d62.C75339i) di3.C86312j.m106911c(r0)).getDisplayName(r9.f318215j.getUsername()), r11, false);
        mo153162f();
        r11 = l33.C109247e.wx0();
        r0 = r9.f318220r;
        r11 = r11.f317987a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008a, code lost:
        if (r11 == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        r11 = r11.mo152986a(false, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0091, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0092, code lost:
        r9.f318210e = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0096, code lost:
        if (r9.f318220r == false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        r11 = o33.C109935a.C109937b.f328933a;
        r11.getClass();
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.VoipFloatBallHelper", "switchVoipVoice");
        r11.f311726d.f311679D = 8;
        ((p646pn.C110234e) di3.C86312j.m106911c(p646pn.C110234e.class)).mo161399pY().mo149100S(r11.f311726d, (android.animation.AnimatorListenerAdapter) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bd, code lost:
        if (4101 != r10) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bf, code lost:
        com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c3, code lost:
        mo153164h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c8, code lost:
        if (r9.f318220r != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ca, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.Voip.NewVoipSmallWindow", "showVideoTalking");
        r9.f318220r = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d5, code lost:
        if (-1 != r9.f318219q) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d7, code lost:
        r9.f318219q = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dd, code lost:
        r10 = r9.f318209d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00df, code lost:
        if (r10 == null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e1, code lost:
        r10.mo152496x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e4, code lost:
        r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext().getString(com.tencent.p014mm.C0966R.string.kj_);
        mo153163g(r10, ((d62.C75339i) di3.C86312j.m106911c(r0)).getDisplayName(r9.f318215j.getUsername()), r10, false);
        mo153162f();
        r10 = l33.C109247e.wx0().f317987a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010b, code lost:
        if (r10 == null) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010d, code lost:
        r2 = r10.mo152986a(true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0111, code lost:
        r9.f318210e = r2;
        mo153161e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r10 == 4099) goto L_0x003f;
     */
    /* renamed from: e5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo152924e5(int r10, int r11) {
        /*
            r9 = this;
            java.lang.Class<d62.i> r0 = d62.C75339i.class
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = z33.C112604l.m153981d(r11)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "MicroMsg.Voip.NewVoipSmallWindow"
            java.lang.String r5 = "newState: %s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r2)
            int r2 = r9.f318214i
            if (r11 != r2) goto L_0x001d
            java.lang.String r10 = "state unchange"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r10)
            return
        L_0x001d:
            r9.f318214i = r11
            r5 = -1
            r2 = 0
            switch(r11) {
                case 0: goto L_0x00c3;
                case 1: goto L_0x0047;
                case 2: goto L_0x00c3;
                case 3: goto L_0x0047;
                case 4: goto L_0x00c3;
                case 5: goto L_0x0047;
                case 6: goto L_0x00c3;
                case 7: goto L_0x0047;
                case 8: goto L_0x002a;
                default: goto L_0x0025;
            }
        L_0x0025:
            switch(r11) {
                case 256: goto L_0x00c3;
                case 257: goto L_0x0047;
                case 258: goto L_0x00c3;
                case 259: goto L_0x0047;
                case 260: goto L_0x00c3;
                case 261: goto L_0x0047;
                case 262: goto L_0x002a;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x0116
        L_0x002a:
            r11 = 4099(0x1003, float:5.744E-42)
            if (r10 == r11) goto L_0x003f
            r11 = 4105(0x1009, float:5.752E-42)
            if (r10 == r11) goto L_0x003b
            r11 = 4106(0x100a, float:5.754E-42)
            if (r10 == r11) goto L_0x0037
            goto L_0x0042
        L_0x0037:
            com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            goto L_0x0042
        L_0x003b:
            com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            goto L_0x0042
        L_0x003f:
            com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
        L_0x0042:
            r9.mo153158b(r1)
            goto L_0x0116
        L_0x0047:
            r9.mo153164h()
            boolean r11 = r9.f318221s
            if (r11 != 0) goto L_0x0116
            java.lang.String r11 = "showVoiceTalking"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
            r9.f318221s = r1
            long r7 = r9.f318219q
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0061
            long r5 = java.lang.System.currentTimeMillis()
            r9.f318219q = r5
        L_0x0061:
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1 = 2131838736(0x7f114710, float:1.9310704E38)
            java.lang.String r11 = r11.getString(r1)
            di3.d r0 = di3.C86312j.m106911c(r0)
            d62.i r0 = (d62.C75339i) r0
            com.tencent.mm.storage.z1 r1 = r9.f318215j
            java.lang.String r1 = r1.getUsername()
            java.lang.String r0 = r0.getDisplayName(r1)
            r9.mo153163g(r11, r0, r11, r4)
            r9.mo153162f()
            com.tencent.mm.plugin.voip.ui.j0 r11 = l33.C109247e.wx0()
            boolean r0 = r9.f318220r
            com.tencent.mm.plugin.voip.ui.VoipViewFragment r11 = r11.f317987a
            if (r11 == 0) goto L_0x0091
            com.tencent.mm.plugin.voip.widget.BaseSmallView r11 = r11.mo152986a(r4, r0)
            goto L_0x0092
        L_0x0091:
            r11 = r2
        L_0x0092:
            r9.f318210e = r11
            boolean r11 = r9.f318220r
            if (r11 == 0) goto L_0x00bb
            o33.a r11 = o33.C109935a.C109937b.f328933a
            r11.getClass()
            java.lang.String r0 = "MicroMsg.VoipFloatBallHelper"
            java.lang.String r1 = "switchVoipVoice"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r11.f311726d
            r1 = 8
            r0.f311679D = r1
            java.lang.Class<pn.e> r0 = p646pn.C110234e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            pn.e r0 = (p646pn.C110234e) r0
            xv0.e r0 = r0.mo161399pY()
            com.tencent.mm.plugin.ball.model.BallInfo r11 = r11.f311726d
            r0.mo149100S(r11, r2)
        L_0x00bb:
            r11 = 4101(0x1005, float:5.747E-42)
            if (r11 != r10) goto L_0x0116
            com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            goto L_0x0116
        L_0x00c3:
            r9.mo153164h()
            boolean r10 = r9.f318220r
            if (r10 != 0) goto L_0x0116
            java.lang.String r10 = "showVideoTalking"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r10)
            r9.f318220r = r1
            long r10 = r9.f318219q
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x00dd
            long r10 = java.lang.System.currentTimeMillis()
            r9.f318219q = r10
        L_0x00dd:
            com.tencent.mm.plugin.voip.ui.g r10 = r9.f318209d
            if (r10 == 0) goto L_0x00e4
            r10.mo152496x()
        L_0x00e4:
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r11 = 2131838726(0x7f114706, float:1.9310683E38)
            java.lang.String r10 = r10.getString(r11)
            di3.d r11 = di3.C86312j.m106911c(r0)
            d62.i r11 = (d62.C75339i) r11
            com.tencent.mm.storage.z1 r0 = r9.f318215j
            java.lang.String r0 = r0.getUsername()
            java.lang.String r11 = r11.getDisplayName(r0)
            r9.mo153163g(r10, r11, r10, r4)
            r9.mo153162f()
            com.tencent.mm.plugin.voip.ui.j0 r10 = l33.C109247e.wx0()
            com.tencent.mm.plugin.voip.ui.VoipViewFragment r10 = r10.f317987a
            if (r10 == 0) goto L_0x0111
            com.tencent.mm.plugin.voip.widget.BaseSmallView r2 = r10.mo152986a(r1, r4)
        L_0x0111:
            r9.f318210e = r2
            r9.mo153161e()
        L_0x0116:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.widget.C106510c.mo152924e5(int, int):void");
    }

    /* renamed from: f */
    public final void mo153162f() {
        Log.m105924i("MicroMsg.Voip.NewVoipSmallWindow", "showMini");
        Intent c = C112595h.f337167b ? mo153159c() : mo153160d();
        if (c != null) {
            c.putExtra("Voip_User", this.f318215j.getUsername());
            c.putExtra("Voip_CallRoomKey", C109247e.xx0().mo152616o());
            c.putExtra("Voip_Outcall", this.f318218p);
            c.putExtra("Voip_VideoCall", this.f318216n);
            c.putExtra("Voip_Is_Talking", this.f318226x);
            C109247e.wx0().mo153008d(c, this.f318216n, false, new C106515c());
            if (!C109247e.xx0().f317345n) {
                C109247e.xx0().f317345n = true;
                if (System.currentTimeMillis() - C86709a0.m107535s().mo121142i().mo119672F(327950, 0) > 86400000) {
                    C86709a0.m107535s().mo121142i().mo119680N(327950, System.currentTimeMillis());
                    Log.m105918d("MicroMsg.Voip.NewVoipSmallWindow", "reportRawMessage, len: 47");
                    StringBuilder sb = new StringBuilder();
                    sb.append("\n#client.version=");
                    sb.append(C89625d.f257841g);
                    sb.append("\n");
                    sb.append("#accinfo.revision=");
                    sb.append(BuildInfo.REV);
                    sb.append("\n");
                    sb.append("#accinfo.build=");
                    sb.append(BuildInfo.TIME);
                    sb.append(XVFSFile.PATH_SEPARATOR);
                    sb.append(BuildInfo.HOSTNAME);
                    sb.append(XVFSFile.PATH_SEPARATOR);
                    sb.append(ChannelUtil.channelId);
                    sb.append("\n");
                    Date date = new Date();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault());
                    sb.append("#accinfo.uploadTime=" + simpleDateFormat.format(date));
                    sb.append("\n");
                    sb.append("#accinfo.content:");
                    sb.append("\n");
                    Intent intent = new Intent();
                    intent.setClassName(MMApplicationContext.getPackageName(), "com.tencent.mm.sandbox.monitor.ExceptionMonitorBroadcastReceiver");
                    intent.setAction("uncatch_exception");
                    intent.putExtra("exceptionWriteSdcard", false);
                    intent.putExtra("exceptionPid", Process.myPid());
                    String a = C7624i3.f25910c.mo19a("login_weixin_username", "");
                    if (Util.isNullOrNil(a)) {
                        a = C7624i3.f25910c.mo19a("login_user_name", "never_login_crash");
                    }
                    intent.putExtra("userName", a);
                    intent.putExtra("tag", "float_window_permission");
                    intent.putExtra("exceptionMsg", Base64.encodeToString((sb.toString() + "have not permission to showing floating window\n").getBytes(), 2));
                    MMApplicationContext.getContext().sendBroadcast(intent);
                }
            }
        }
    }

    /* renamed from: f0 */
    public void mo152925f0(boolean z, boolean z2) {
    }

    /* renamed from: g */
    public void mo153163g(String str, String str2, String str3, boolean z) {
        Log.m105924i("MicroMsg.Voip.NewVoipSmallWindow", "showNotification..show notification..tickContent:" + str + ",title:" + str2 + ",content:" + str3 + ",breathEffect:" + z);
        StringBuilder sb = new StringBuilder();
        sb.append("breathEffect ");
        sb.append(z);
        Log.printDebugStack("MicroMsg.Voip.NewVoipSmallWindow", sb.toString(), new Object[0]);
        Intent c = C112595h.f337167b ? mo153159c() : null;
        if (c == null) {
            c = new Intent();
            c.setClass(MMApplicationContext.getContext(), VideoActivity.class);
        }
        c.putExtra("Voip_CallRoomKey", C109247e.xx0().mo152616o());
        c.putExtra("Voip_Call_From", 3);
        c.putExtra("Voip_User", this.f318215j.getUsername());
        c.putExtra("Voip_Outcall", this.f318218p);
        c.putExtra("Voip_VideoCall", this.f318216n);
        PendingIntent activity = PendingIntent.getActivity(MMApplicationContext.getContext(), 40, c, 134217728);
        C90116e.C90121c cVar = new C90116e.C90121c(MMApplicationContext.getContext(), "reminder_channel_id");
        cVar.mo124390o(str);
        cVar.f258814z.when = System.currentTimeMillis();
        cVar.mo124383h(str2);
        cVar.mo124382g(str3);
        cVar.f258795g = activity;
        cVar.f258814z.icon = C0966R.C0969drawable.c9k;
        cVar.mo124384i(2, true);
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93215l(40, C91617n.m114967e(cVar), false);
    }

    /* renamed from: h */
    public final void mo153164h() {
        int i = this.f318214i;
        if (i == 261 || i == 7 || i == 260 || i == 6) {
            this.f318226x = true;
            MTimerHandler mTimerHandler = this.f318211f;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            MTimerHandler mTimerHandler2 = new MTimerHandler("timerCounter", (MTimerHandler.CallBack) new C106513b(), true);
            this.f318211f = mTimerHandler2;
            mTimerHandler2.startTimer(1000);
        }
    }

    /* renamed from: h0 */
    public void mo152926h0(boolean z) {
        C109247e.wx0().mo153009e(z);
    }

    /* renamed from: i3 */
    public Context mo152927i3() {
        return null;
    }

    /* renamed from: i5 */
    public void mo152928i5() {
        BaseSmallView baseSmallView = this.f318210e;
        if (baseSmallView != null) {
            baseSmallView.mo153120f();
        }
    }

    /* renamed from: k3 */
    public void mo152929k3(boolean z) {
        Log.m105924i("MicroMsg.Voip.NewVoipSmallWindow", "uninit");
        if (!this.f318223u) {
            int i = 1;
            this.f318223u = true;
            if (-1 != this.f318219q) {
                C115669n nVar = C115669n.INSTANCE;
                int i2 = 3;
                Object[] objArr = new Object[3];
                if (this.f318220r) {
                    i2 = 2;
                }
                objArr[0] = Integer.valueOf(i2);
                objArr[1] = Long.valueOf((System.currentTimeMillis() - this.f318219q) / 1000);
                if (!this.f318222t) {
                    i = 2;
                }
                objArr[2] = Integer.valueOf(i);
                nVar.mo160131h(11620, objArr);
            }
            PowerManager.WakeLock wakeLock = this.f318213h;
            if (wakeLock != null && wakeLock.isHeld()) {
                Log.m105924i("MicroMsg.Voip.NewVoipSmallWindow", "release waklock");
                PowerManager.WakeLock wakeLock2 = this.f318213h;
                PowerManager.WakeLock wakeLock3 = wakeLock2;
                C117292a.m165357c(wakeLock3, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "uninit", "(Z)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                wakeLock2.release();
                C117292a.m165359e(wakeLock3, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "uninit", "(Z)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            }
            mo153158b(z);
            MTimerHandler mTimerHandler = this.f318211f;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            Log.m105924i("MicroMsg.Voip.NewVoipSmallWindow", "uninit..cancel notification..");
            PowerManager.WakeLock wakeLock4 = this.f318227y;
            if (wakeLock4 != null && wakeLock4.isHeld()) {
                PowerManager.WakeLock wakeLock5 = this.f318227y;
                PowerManager.WakeLock wakeLock6 = wakeLock5;
                C117292a.m165357c(wakeLock6, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "uninit", "(Z)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                wakeLock5.release();
                C117292a.m165359e(wakeLock6, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "uninit", "(Z)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                this.f318227y = null;
            }
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }

    /* renamed from: p0 */
    public void mo152934p0(C107054l.C107055a aVar) {
        if (aVar != null) {
            mo152916R(aVar.f320468a);
        }
    }

    /* renamed from: r */
    public void mo152935r() {
    }

    public void setMute(boolean z) {
    }

    public void setScreenEnable(boolean z) {
        Log.m105928w("MicroMsg.Voip.NewVoipSmallWindow", "setScreenEnable: " + z);
        if (!z) {
            if (this.f318227y == null) {
                this.f318227y = ((PowerManager) MMApplicationContext.getContext().getSystemService("power")).newWakeLock(32, "wechat:screen small-window-lock");
            }
            if (!this.f318227y.isHeld()) {
                PowerManager.WakeLock wakeLock = this.f318227y;
                PowerManager.WakeLock wakeLock2 = wakeLock;
                C117292a.m165357c(wakeLock2, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "setScreenEnable", "(Z)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                wakeLock.acquire();
                C117292a.m165359e(wakeLock2, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "setScreenEnable", "(Z)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                return;
            }
            return;
        }
        PowerManager.WakeLock wakeLock3 = this.f318227y;
        if (wakeLock3 != null && wakeLock3.isHeld()) {
            PowerManager.WakeLock wakeLock4 = this.f318227y;
            PowerManager.WakeLock wakeLock5 = wakeLock4;
            C117292a.m165357c(wakeLock5, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "setScreenEnable", "(Z)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock4.release();
            C117292a.m165359e(wakeLock5, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "setScreenEnable", "(Z)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            this.f318227y = null;
        }
    }
}
