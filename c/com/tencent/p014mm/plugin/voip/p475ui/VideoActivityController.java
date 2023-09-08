package com.tencent.p014mm.plugin.voip.p475ui;

import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C54219z;
import aw0.C103928o;
import bd2.C79690d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.HardCoderSystemEvent;
import com.tencent.p014mm.autogen.events.LogoutEvent;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.floatcard.VoipFloatCardPermissionDialog;
import com.tencent.p014mm.plugin.voip.model.C106377r;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C7335d;
import di3.C86312j;
import f40.C86737h0;
import gy3.C87412m;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import k20.C9556a;
import l33.C109247e;
import m33.C10751a;
import m33.C10752b;
import nc0.C76850a;
import nj2.C109749c;
import nj2.C61767o;
import nj3.C76879j;
import nj3.C88989a;
import o33.C109938b;
import ou0.C110066a;
import ou0.C110071c;
import p156gj.C107835h0;
import p206nj.C11171e;
import p214om.C11502f;
import p331dj.C107043a;
import p447aw.C103918d;
import p492dn.C107054l;
import p80.C110193b;
import p910lj.C76701a;
import pu0.C110248b;
import vo3.C90852c;
import wj2.C66132f;
import y33.C112390a;
import z33.C112597j;
import z33.C112604l;

@C86737h0
@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.voip.ui.VideoActivityController */
public class VideoActivityController implements C106449h {

    /* renamed from: A */
    public VideoActivity f317870A;

    /* renamed from: B */
    public IListener f317871B;

    /* renamed from: C */
    public Point f317872C;

    /* renamed from: D */
    public int f317873D;

    /* renamed from: E */
    public IListener f317874E;

    /* renamed from: d */
    public boolean f317875d;

    /* renamed from: e */
    public boolean f317876e;

    /* renamed from: f */
    public C72996z1 f317877f;

    /* renamed from: g */
    public VoipBaseFragment f317878g;

    /* renamed from: h */
    public WeakReference<C106448g> f317879h;

    /* renamed from: i */
    public MMHandler f317880i;

    /* renamed from: j */
    public long f317881j = -1;

    /* renamed from: n */
    public int f317882n = -1;

    /* renamed from: o */
    public boolean f317883o = false;

    /* renamed from: p */
    public String f317884p;

    /* renamed from: q */
    public boolean f317885q = false;

    /* renamed from: r */
    public C107054l.C107055a f317886r;

    /* renamed from: s */
    public boolean f317887s = false;

    /* renamed from: t */
    public int f317888t = 1;

    /* renamed from: u */
    public boolean f317889u = false;

    /* renamed from: v */
    public boolean f317890v = false;

    /* renamed from: w */
    public int f317891w = 0;

    /* renamed from: x */
    public boolean f317892x = false;

    /* renamed from: y */
    public boolean f317893y = false;

    /* renamed from: z */
    public C109938b f317894z;

    /* renamed from: com.tencent.mm.plugin.voip.ui.VideoActivityController$a */
    public class C106419a implements DialogInterface.OnClickListener {
        public C106419a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(VideoActivityController.this.f317870A);
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.VideoActivityController$b */
    public class C106420b implements DialogInterface.OnClickListener {
        public C106420b(VideoActivityController videoActivityController) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.VideoActivityController$c */
    public class C106421c implements DialogInterface.OnClickListener {
        public C106421c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(VideoActivityController.this.f317870A);
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.VideoActivityController$d */
    public class C106422d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f317899d;

        public C106422d(int i) {
            this.f317899d = i;
        }

        public void run() {
            VideoActivityController videoActivityController = VideoActivityController.this;
            int i = videoActivityController.f317873D;
            int i2 = this.f317899d;
            if (i != i2) {
                videoActivityController.f317873D = i2;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.VideoActivityController$e */
    public class C106423e implements Runnable {
        public C106423e() {
        }

        public void run() {
            VideoActivityController.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.VideoActivityController$f */
    public class C106424f implements Runnable {
        public C106424f(VideoActivityController videoActivityController) {
        }

        public void run() {
            VoipFloatCardPermissionDialog.f117099e.mo57461a(MMApplicationContext.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.VideoActivityController$g */
    public class C106425g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f317902d;

        public C106425g(int i) {
            this.f317902d = i;
        }

        public void run() {
            int i;
            VoipBaseFragment voipBaseFragment;
            VideoActivityController videoActivityController = VideoActivityController.this;
            int i2 = this.f317902d;
            videoActivityController.getClass();
            Log.m105918d("MicroMsg.Voip.VideoActivityController", "getHintByErrorCode " + i2);
            if (i2 == 235) {
                i = C0966R.string.kgh;
            } else if (i2 == 233) {
                C109247e.xx0().mo152589C(1);
                i = C0966R.string.kgg;
            } else {
                i = i2 == 237 ? (!C76850a.m92642n() || videoActivityController.f317876e) ? C0966R.string.kgi : C0966R.string.kgk : i2 == 236 ? C0966R.string.f361519kh0 : i2 == 211 ? C0966R.string.kgj : 0;
            }
            if (i != 0 || (voipBaseFragment = videoActivityController.f317878g) == null) {
                if (i == 0) {
                    i = C0966R.string.kgf;
                }
                Context context = MMApplicationContext.getContext();
                int i3 = MMSuperAlert.f317798d;
                Intent intent = new Intent(context, MMSuperAlert.class);
                intent.putExtra("MMSuperAlert_title", C0966R.string.a3h);
                intent.putExtra("MMSuperAlert_msg", i);
                intent.putExtra("MMSuperAlert_cancelable", false);
                intent.setFlags(268435456);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/voip/ui/MMSuperAlert", "show", "(Landroid/content/Context;IIZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/plugin/voip/ui/MMSuperAlert", "show", "(Landroid/content/Context;IIZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
            voipBaseFragment.mo152888Z(C0966R.string.kgf, -1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.VideoActivityController$h */
    public class C106426h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f317904d;

        public C106426h(String str) {
            this.f317904d = str;
        }

        public void run() {
            VoipBaseFragment voipBaseFragment = VideoActivityController.this.f317878g;
            if (voipBaseFragment != null) {
                voipBaseFragment.mo152889d0(this.f317904d);
            }
        }
    }

    public VideoActivityController(VideoActivity videoActivity) {
        C40008f fVar = C40008f.f107254d;
        this.f317871B = new IListener<LogoutEvent>(fVar) {
            {
                this.__eventId = 276997888;
            }

            public boolean callback(IEvent iEvent) {
                if (((LogoutEvent) iEvent) instanceof LogoutEvent) {
                    Log.m105925i("MicroMsg.Voip.VideoActivityController", "summerkick LogoutEvent thread name[%s]", Thread.currentThread().getName());
                    MMHandlerThread.postToMainThread(new C106470t(this));
                }
                return false;
            }
        };
        this.f317873D = 1;
        this.f317874E = new IListener<HardCoderSystemEvent>(fVar) {
            {
                this.__eventId = -637576831;
            }

            public boolean callback(IEvent iEvent) {
                HardCoderSystemEvent.C92528a aVar;
                HardCoderSystemEvent hardCoderSystemEvent = (HardCoderSystemEvent) iEvent;
                if (!(hardCoderSystemEvent == null || (aVar = hardCoderSystemEvent.f264901d) == null)) {
                    Log.m105925i("MicroMsg.Voip.VideoActivityController", "summerhardcoder system event [%s]", Integer.valueOf(aVar.f264902a));
                    if (hardCoderSystemEvent.f264901d.f264902a == 1) {
                        VideoActivityController.this.mo152938b();
                    }
                }
                return false;
            }
        };
        this.f317870A = videoActivity;
    }

    /* renamed from: B */
    public void mo152906B() {
    }

    /* renamed from: F3 */
    public void mo152907F3(int i, String str) {
        Log.m105925i("MicroMsg.Voip.VideoActivityController", "onError, errCode:%d, isVideoCall:%s", Integer.valueOf(i), Boolean.valueOf(this.f317876e));
        this.f317883o = true;
        if (i == 241) {
            C76879j.m92748s(this.f317870A, str, (String) null);
        } else {
            this.f317880i.post(new C106425g(i));
        }
    }

    /* renamed from: G */
    public void mo152908G(int i) {
        this.f317870A.runOnUiThread(new C106422d(i));
    }

    /* renamed from: G0 */
    public void mo152909G0(int i) {
        VoipBaseFragment voipBaseFragment = this.f317878g;
        if (voipBaseFragment != null) {
            voipBaseFragment.mo152882R(i);
        }
    }

    /* renamed from: J1 */
    public /* synthetic */ void mo152912J1(List list) {
    }

    /* renamed from: Q2 */
    public void mo152915Q2(String str) {
        if (this.f317878g != null) {
            this.f317880i.post(new C106426h(str));
        }
    }

    /* renamed from: R */
    public /* synthetic */ void mo152916R(int i) {
    }

    /* renamed from: T6 */
    public void mo152917T6(long j) {
        this.f317881j = j;
        VoipBaseFragment voipBaseFragment = this.f317878g;
        if (voipBaseFragment != null) {
            voipBaseFragment.f317922j = j;
        }
    }

    /* renamed from: V */
    public void mo152918V(int i) {
        Intent intent = new Intent();
        intent.setClassName(this.f317870A, "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutCamera");
        intent.putExtra("activity_caller_params", 1);
        this.f317870A.startActivityForResult(intent, 1);
        this.f317890v = true;
        this.f317891w = i;
    }

    /* renamed from: V0 */
    public void mo152919V0() {
        C106444e0 e0Var;
        VoipBaseFragment voipBaseFragment = this.f317878g;
        if (voipBaseFragment != null && (e0Var = voipBaseFragment.f317911B) != null) {
            C54219z<C66132f> zVar = C61767o.f175578d;
            C112390a aVar = e0Var.f317975a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
            zVar.removeObservers((Fragment) aVar);
        }
    }

    /* renamed from: Z1 */
    public void mo152920Z1(boolean z) {
        Log.m105918d("MicroMsg.Voip.VideoActivityController", "tryShowNetStatusWarning isSelfNetBad" + z);
        VoipBaseFragment voipBaseFragment = this.f317878g;
        if (voipBaseFragment != null) {
            voipBaseFragment.mo152887X(z);
        }
    }

    /* renamed from: a */
    public final void mo152937a() {
        this.f317880i.postDelayed(new C106423e(), 2000);
    }

    /* renamed from: a5 */
    public void mo152921a5() {
        VoipBaseFragment voipBaseFragment = this.f317878g;
        if (voipBaseFragment != null) {
            voipBaseFragment.mo152976a0(10);
        }
    }

    /* renamed from: b */
    public final void mo152938b() {
        WeakReference<C106448g> weakReference = this.f317879h;
        if (weakReference != null && weakReference.get() != null && !this.f317875d) {
            if (this.f317876e) {
                this.f317879h.get().mo152421C();
            } else {
                this.f317879h.get().mo152425F();
            }
            if (C109247e.xx0().f317334c && this.f317876e) {
                this.f317879h.get().mo152436N(1);
            }
        }
    }

    /* renamed from: c */
    public boolean mo152939c() {
        boolean z;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) MMApplicationContext.getContext().getSystemService("phone");
            if (telephonyManager == null) {
                return false;
            }
            int callState = telephonyManager.getCallState();
            z = callState == 2;
            try {
                Log.m105925i("MicroMsg.Voip.VideoActivityController", "TelephoneManager.callState is %d", Integer.valueOf(callState));
            } catch (Exception e) {
                e = e;
            }
            return z;
        } catch (Exception e2) {
            e = e2;
            z = false;
            Log.m105921e("MicroMsg.Voip.VideoActivityController", "get callState error , errMsg is %s", e.getLocalizedMessage());
            return z;
        }
    }

    /* renamed from: c2 */
    public void mo152922c2() {
        Log.m105918d("MicroMsg.Voip.VideoActivityController", "dismissNetStatusWarning");
        VoipBaseFragment voipBaseFragment = this.f317878g;
        if (voipBaseFragment != null) {
            voipBaseFragment.mo152879L();
        }
    }

    public void dealContentView(View view) {
        C85875k4.m106179e0(C85875k4.m106172b(this.f317870A.getWindow(), (View) null), this.f317870A.getBodyView());
        ((ViewGroup) this.f317870A.getWindow().getDecorView()).addView(view, 0);
    }

    /* renamed from: e3 */
    public void mo152923e3(int i) {
        VoipBaseFragment voipBaseFragment = this.f317878g;
        if (voipBaseFragment != null) {
            voipBaseFragment.mo152880O(i);
        }
    }

    /* renamed from: e5 */
    public void mo152924e5(int i, int i2) {
        this.f317882n = i2;
        if (1 == this.f317888t || i2 == 8 || i2 == 262) {
            VoipBaseFragment voipBaseFragment = this.f317878g;
            if (voipBaseFragment == null) {
                Log.m105924i("MicroMsg.Voip.VideoActivityController", "mBaseFragment is null ,already close,now return.");
                return;
            }
            voipBaseFragment.mo152884T(i, i2);
            if (!(i2 == 1 || i2 == 3 || i2 == 257 || i2 == 7)) {
                if (i2 != 8) {
                    if (i2 != 261) {
                        if (i2 != 262) {
                            return;
                        }
                    }
                }
                if (i == 4098) {
                    this.f317880i.postDelayed(new C106474x(this), 50);
                } else if (i == 4099) {
                    if (this.f317875d) {
                        this.f317878g.mo152888Z(this.f317876e ? C0966R.string.kj7 : C0966R.string.kel, -1);
                    }
                    mo152937a();
                } else if (i == 4103 || i == 4104) {
                    mo152937a();
                } else if (i == 4106) {
                    this.f317880i.post(new C106471u(this));
                } else if (i == 4107) {
                    finish();
                } else if (i == 4109) {
                    this.f317880i.post(new C106472v(this));
                }
                mo152937a();
                Log.m105919d("MicroMsg.Voip.VideoActivityController", "finishSmallWindow mStatus: %s", C112604l.m153981d(this.f317882n));
                int i3 = this.f317882n;
                if (i3 == 262 || i3 == 8) {
                    C109247e.wx0().mo153005a(true);
                }
                if (!((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(this.f317870A)) {
                    this.f317880i.postDelayed(new C106424f(this), 2000);
                    return;
                }
                return;
            }
            this.f317876e = false;
            VoipBaseFragment voipBaseFragment2 = this.f317878g;
            if (voipBaseFragment2 == null || !(voipBaseFragment2 instanceof VoipVoiceFragment)) {
                if (voipBaseFragment2 != null) {
                    voipBaseFragment2.mo152890e0();
                    this.f317870A.getSupportFragmentManager().beginTransaction().mo165169k(this.f317878g).mo165162d();
                    this.f317878g = null;
                }
                Log.m105924i("MicroMsg.Voip.VideoActivityController", "switch to voice fragment");
                Bundle bundle = new Bundle();
                bundle.putString("key_username", this.f317877f.getUsername());
                bundle.putBoolean("key_isoutcall", this.f317875d);
                bundle.putInt("key_status", this.f317882n);
                VoipVoiceFragment voipVoiceFragment = new VoipVoiceFragment();
                this.f317878g = voipVoiceFragment;
                voipVoiceFragment.setArguments(bundle);
                VoipBaseFragment voipBaseFragment3 = this.f317878g;
                voipBaseFragment3.getClass();
                voipBaseFragment3.f317931v = new WeakReference<>(this.f317879h.get());
                VoipBaseFragment voipBaseFragment4 = this.f317878g;
                voipBaseFragment4.f317922j = this.f317881j;
                voipBaseFragment4.f317930u = this;
                voipBaseFragment4.mo152886V(this.f317886r.f320468a);
                this.f317878g.mo152883S(this.f317887s);
                C112919c0 beginTransaction = this.f317870A.getSupportFragmentManager().beginTransaction();
                beginTransaction.mo165200l(C0966R.C0970id.lca, this.f317878g);
                beginTransaction.mo165162d();
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.Voip.VideoActivityController", "activity is not normal, can't transform");
    }

    /* renamed from: f0 */
    public void mo152925f0(boolean z, boolean z2) {
        this.f317885q = z2;
        if (z) {
            mo152937a();
        } else {
            finish();
        }
    }

    public void finish() {
        this.f317888t = 3;
        Log.m105925i("MicroMsg.Voip.VideoActivityController", "finish, finishBczMinimize: %b, status: %s", Boolean.valueOf(this.f317885q), C112604l.m153981d(this.f317882n));
        if (!this.f317885q && C112604l.m153984g(this.f317882n) && 4 != this.f317888t) {
            Log.m105924i("MicroMsg.Voip.VideoActivityController", "finish VideoActivity, start ChattingUI");
            Intent intent = new Intent();
            intent.addFlags(67108864);
            intent.putExtra("Chat_User", this.f317884p);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93173f(intent, this.f317870A);
        }
        if (this.f317893y) {
            this.f317893y = false;
            C112597j.m153945j(C109247e.xx0().mo152615n(), C109247e.xx0().mo152616o(), this.f317875d ^ true ? 1 : 0, 5);
            C112597j.m153944i(1);
        }
        VoipBaseFragment voipBaseFragment = this.f317878g;
        if (voipBaseFragment != null) {
            int i = voipBaseFragment.f317923n;
            voipBaseFragment.mo152890e0();
            this.f317878g = null;
        }
        this.f317879h = null;
        this.f317892x = true;
        this.f317870A.mo152911I7();
        VoipBaseFragment.f317907H = -1;
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f360047cd0;
    }

    /* renamed from: h0 */
    public void mo152926h0(boolean z) {
    }

    /* renamed from: i3 */
    public Context mo152927i3() {
        return this.f317870A.getContext();
    }

    /* renamed from: i5 */
    public void mo152928i5() {
        VoipBaseFragment voipBaseFragment = this.f317878g;
        if (voipBaseFragment != null) {
            voipBaseFragment.mo152881Q();
        }
    }

    public void importUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        hashSet.add(C10751a.class);
        hashSet.add(C10752b.class);
    }

    /* renamed from: k3 */
    public void mo152929k3(boolean z) {
        VoipBaseFragment voipBaseFragment = this.f317878g;
        if (voipBaseFragment != null) {
            voipBaseFragment.mo152890e0();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            this.f317890v = false;
            VoipBaseFragment voipBaseFragment = this.f317878g;
            if (voipBaseFragment != null) {
                int i3 = this.f317891w;
                if (i3 == 2) {
                    voipBaseFragment.mo152976a0(5);
                } else if (i3 == 1) {
                    voipBaseFragment.mo152974P(5);
                }
            }
        }
    }

    public boolean onBackPressed() {
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
        VoipBaseFragment voipBaseFragment;
        if (this.f317872C != null && C11171e.m11046c(17)) {
            Point point = new Point();
            this.f317870A.getWindowManager().getDefaultDisplay().getRealSize(point);
            if (!point.equals(this.f317872C) && (voipBaseFragment = this.f317878g) != null) {
                this.f317872C = point;
                voipBaseFragment.mo152885U(point);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0179 A[Catch:{ Exception -> 0x04b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01f8 A[Catch:{ Exception -> 0x04b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0245 A[Catch:{ Exception -> 0x04b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02ce A[Catch:{ Exception -> 0x04b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02e6 A[Catch:{ Exception -> 0x04b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02f8 A[Catch:{ Exception -> 0x04b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x035c A[Catch:{ Exception -> 0x04b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x036e A[Catch:{ Exception -> 0x04b3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r32) {
        /*
            r31 = this;
            r1 = r31
            h81.h$c r0 = h81.C32735h.C32737c.clicfg_voip_forbid_calling
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            java.lang.String r3 = "MicroMsg.Voip.VideoActivityController"
            com.tencent.mm.plugin.voip.ui.VideoActivity r4 = r1.f317870A
            r5 = r32
            r4.mo152913J7(r5)
            r5 = 0
            eb0.b3 r6 = zc2.C91661e.f262638a     // Catch:{ Exception -> 0x04b3 }
            r7 = 41
            com.tencent.mm.booter.notification.MMNotification r6 = (com.tencent.p014mm.booter.notification.MMNotification) r6     // Catch:{ Exception -> 0x04b3 }
            r6.mo93207e(r7)     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.model.h0 r6 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x04b3 }
            p33.e r7 = r6.f317355x     // Catch:{ Exception -> 0x04b3 }
            r7.getClass()     // Catch:{ Exception -> 0x04b3 }
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 7
            r12 = 0
            p33.C110140b.m149726c(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.VideoActivity r6 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            android.content.res.Resources r7 = r6.getResources()     // Catch:{ Exception -> 0x04b3 }
            r8 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r7 = r7.getColor(r8)     // Catch:{ Exception -> 0x04b3 }
            r6.setActionbarColor(r7)     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.VideoActivity r6 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            r7 = 7
            r6.setRequestedOrientation(r7)     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.VideoActivity r6 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            androidx.appcompat.app.AppCompatActivity r6 = r6.getContext()     // Catch:{ Exception -> 0x04b3 }
            boolean r6 = z33.C91617n.m114964b(r6)     // Catch:{ Exception -> 0x04b3 }
            if (r6 != 0) goto L_0x0055
            com.tencent.mm.plugin.voip.ui.VideoActivity r6 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            androidx.appcompat.app.AppCompatActivity r6 = r6.getContext()     // Catch:{ Exception -> 0x04b3 }
            z33.C91617n.m114965c(r6)     // Catch:{ Exception -> 0x04b3 }
        L_0x0055:
            java.lang.String r6 = "VideoActivity onCreate start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.VideoActivity r6 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            androidx.appcompat.app.ActionBar r6 = r6.getSupportActionBar()     // Catch:{ Exception -> 0x04b3 }
            r6.mo91104o()     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.VideoActivity r6 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            android.view.Window r6 = r6.getWindow()     // Catch:{ Exception -> 0x04b3 }
            r7 = 3
            r6.setSoftInputMode(r7)     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.VideoActivity r6 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            android.view.Window r6 = r6.getWindow()     // Catch:{ Exception -> 0x04b3 }
            r8 = 6815872(0x680080, float:9.551071E-39)
            r6.addFlags(r8)     // Catch:{ Exception -> 0x04b3 }
            boolean r6 = f40.C86709a0.m107522a()     // Catch:{ Exception -> 0x04b3 }
            if (r6 == 0) goto L_0x0086
            com.tencent.mm.plugin.voip.model.h0 r6 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x04b3 }
            r6.mo152593G(r5, r5)     // Catch:{ Exception -> 0x04b3 }
        L_0x0086:
            com.tencent.mm.sdk.platformtools.MMHandler r6 = new com.tencent.mm.sdk.platformtools.MMHandler     // Catch:{ Exception -> 0x04b3 }
            r6.<init>()     // Catch:{ Exception -> 0x04b3 }
            r1.f317880i = r6     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.pointers.PBool r6 = new com.tencent.mm.pointers.PBool     // Catch:{ Exception -> 0x04b3 }
            r6.<init>()     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.pointers.PBool r15 = new com.tencent.mm.pointers.PBool     // Catch:{ Exception -> 0x04b3 }
            r15.<init>()     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.pointers.PString r14 = new com.tencent.mm.pointers.PString     // Catch:{ Exception -> 0x04b3 }
            r14.<init>()     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.pointers.PInt r13 = new com.tencent.mm.pointers.PInt     // Catch:{ Exception -> 0x04b3 }
            r13.<init>()     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.pointers.PInt r8 = new com.tencent.mm.pointers.PInt     // Catch:{ Exception -> 0x04b3 }
            r8.<init>()     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.VideoActivity r9 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            android.content.Intent r9 = r9.getIntent()     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r10 = "Voip_User"
            java.lang.String r9 = r9.getStringExtra(r10)     // Catch:{ Exception -> 0x04b3 }
            r14.value = r9     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.VideoActivity r9 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            android.content.Intent r9 = r9.getIntent()     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r10 = "Voip_Outcall"
            r12 = 1
            boolean r9 = r9.getBooleanExtra(r10, r12)     // Catch:{ Exception -> 0x04b3 }
            r6.value = r9     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.VideoActivity r9 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            android.content.Intent r9 = r9.getIntent()     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r10 = "Voip_VideoCall"
            boolean r9 = r9.getBooleanExtra(r10, r12)     // Catch:{ Exception -> 0x04b3 }
            r15.value = r9     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.VideoActivity r9 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            android.content.Intent r9 = r9.getIntent()     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r10 = "Voip_LastPage_Hash"
            r4 = 0
            r9.getLongExtra(r10, r4)     // Catch:{ Exception -> 0x04b3 }
            boolean r9 = r6.value     // Catch:{ Exception -> 0x04b3 }
            boolean r10 = r15.value     // Catch:{ Exception -> 0x04b3 }
            int r9 = z33.C112604l.m153980c(r9, r10)     // Catch:{ Exception -> 0x04b3 }
            r13.value = r9     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.pointers.PLong r11 = new com.tencent.mm.pointers.PLong     // Catch:{ Exception -> 0x04b3 }
            r11.<init>()     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.VideoActivity r9 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            android.content.Intent r9 = r9.getIntent()     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r10 = "Voip_CallRoomKey"
            long r9 = r9.getLongExtra(r10, r4)     // Catch:{ Exception -> 0x04b3 }
            r11.value = r9     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.VideoActivity r9 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            android.content.Intent r9 = r9.getIntent()     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r10 = "Voip_Call_From"
            r7 = -1
            int r9 = r9.getIntExtra(r10, r7)     // Catch:{ Exception -> 0x04b3 }
            r8.value = r9     // Catch:{ Exception -> 0x04b3 }
            boolean r9 = r6.value     // Catch:{ Exception -> 0x04b3 }
            if (r9 == 0) goto L_0x0140
            boolean r9 = r31.mo152939c()     // Catch:{ Exception -> 0x013b }
            if (r9 == 0) goto L_0x0140
            com.tencent.mm.plugin.voip.ui.VideoActivity r9 = r1.f317870A     // Catch:{ Exception -> 0x013b }
            boolean r9 = r9.isFinishing()     // Catch:{ Exception -> 0x013b }
            if (r9 != 0) goto L_0x0140
            com.tencent.mm.plugin.voip.ui.VideoActivity r9 = r1.f317870A     // Catch:{ Exception -> 0x013b }
            r10 = 2131838631(0x7f1146a7, float:1.931049E38)
            r7 = 0
            android.widget.Toast r9 = p910lj.C76701a.makeText((android.content.Context) r9, (int) r10, (int) r7)     // Catch:{ Exception -> 0x013b }
            r9.show()     // Catch:{ Exception -> 0x013b }
            java.lang.String r7 = "this phone is on a call"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)     // Catch:{ Exception -> 0x013b }
            com.tencent.mm.plugin.voip.model.h0 r7 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x013b }
            r7.mo152600N()     // Catch:{ Exception -> 0x013b }
            com.tencent.mm.plugin.voip.ui.VideoActivity r7 = r1.f317870A     // Catch:{ Exception -> 0x013b }
            r7.mo152911I7()     // Catch:{ Exception -> 0x013b }
            return
        L_0x013b:
            java.lang.String r7 = "not ready now!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r7)     // Catch:{ Exception -> 0x04b3 }
        L_0x0140:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED     // Catch:{ Exception -> 0x04b3 }
            if (r7 != 0) goto L_0x0155
            boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ Exception -> 0x04b3 }
            if (r7 == 0) goto L_0x0149
            goto L_0x0155
        L_0x0149:
            di3.d r7 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x04b3 }
            h81.h r7 = (h81.C32735h) r7     // Catch:{ Exception -> 0x04b3 }
            r9 = 0
            boolean r7 = r7.mo58784wf(r0, r9)     // Catch:{ Exception -> 0x04b3 }
            goto L_0x0156
        L_0x0155:
            r7 = 1
        L_0x0156:
            java.lang.String r9 = "MicroMsg.VoipActivityReport"
            if (r7 == 0) goto L_0x016a
            java.lang.String r7 = "markResponseActivityWhileServiceZero"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.report.service.n r18 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x04b3 }
            r19 = 1433(0x599, double:7.08E-321)
            r21 = 27
            r23 = 1
            r18.mo175913w(r19, r21, r23)     // Catch:{ Exception -> 0x04b3 }
        L_0x016a:
            r7 = r13
            long r12 = r11.value     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.model.h0 r10 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x04b3 }
            long r19 = r10.mo152616o()     // Catch:{ Exception -> 0x04b3 }
            int r10 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r10 == 0) goto L_0x01f8
            com.tencent.mm.plugin.voip.model.h0 r10 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x04b3 }
            long r12 = r10.mo152616o()     // Catch:{ Exception -> 0x04b3 }
            int r10 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x01c2
            z33.g r19 = z33.C112594g.f337162a     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r10 = "markFakeCallingHappened"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.report.service.n r20 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x04b3 }
            r21 = 1433(0x599, double:7.08E-321)
            r23 = 1
            r25 = 1
            r20.mo175913w(r21, r23, r25)     // Catch:{ Exception -> 0x04b3 }
            boolean r10 = r6.value     // Catch:{ Exception -> 0x04b3 }
            if (r10 != 0) goto L_0x01ab
            com.tencent.mm.plugin.voip.model.h0 r10 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.model.m0 r10 = r10.f317332a     // Catch:{ Exception -> 0x04b3 }
            boolean r10 = r10.mo152664i()     // Catch:{ Exception -> 0x04b3 }
            if (r10 == 0) goto L_0x01a8
            goto L_0x01ab
        L_0x01a8:
            r26 = 0
            goto L_0x01ad
        L_0x01ab:
            r26 = 1
        L_0x01ad:
            int r10 = r8.value     // Catch:{ Exception -> 0x04b3 }
            r21 = 1
            long r12 = r11.value     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.model.h0 r20 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x04b3 }
            long r24 = r20.mo152616o()     // Catch:{ Exception -> 0x04b3 }
            r20 = r10
            r22 = r12
            r19.mo164367a(r20, r21, r22, r24, r26)     // Catch:{ Exception -> 0x04b3 }
        L_0x01c2:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED     // Catch:{ Exception -> 0x04b3 }
            if (r10 != 0) goto L_0x01d7
            boolean r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ Exception -> 0x04b3 }
            if (r10 == 0) goto L_0x01cb
            goto L_0x01d7
        L_0x01cb:
            di3.d r10 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x04b3 }
            h81.h r10 = (h81.C32735h) r10     // Catch:{ Exception -> 0x04b3 }
            r12 = 0
            boolean r0 = r10.mo58784wf(r0, r12)     // Catch:{ Exception -> 0x04b3 }
            goto L_0x01d8
        L_0x01d7:
            r0 = 1
        L_0x01d8:
            if (r0 == 0) goto L_0x0235
            com.tencent.mm.plugin.voip.model.h0 r0 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x04b3 }
            long r12 = r0.mo152616o()     // Catch:{ Exception -> 0x04b3 }
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0235
            java.lang.String r0 = "fake calling comming and forbid itself cause key is no similar"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.model.h0 r0 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x04b3 }
            r0.mo152600N()     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.VideoActivity r0 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            r0.mo152911I7()     // Catch:{ Exception -> 0x04b3 }
            return
        L_0x01f8:
            z33.g r19 = z33.C112594g.f337162a     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r0 = "markNormalCallingHappened"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.report.service.n r20 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x04b3 }
            r21 = 1433(0x599, double:7.08E-321)
            r23 = 2
            r25 = 1
            r20.mo175913w(r21, r23, r25)     // Catch:{ Exception -> 0x04b3 }
            boolean r0 = r6.value     // Catch:{ Exception -> 0x04b3 }
            if (r0 != 0) goto L_0x021e
            com.tencent.mm.plugin.voip.model.h0 r0 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.model.m0 r0 = r0.f317332a     // Catch:{ Exception -> 0x04b3 }
            boolean r0 = r0.mo152664i()     // Catch:{ Exception -> 0x04b3 }
            if (r0 == 0) goto L_0x021b
            goto L_0x021e
        L_0x021b:
            r26 = 0
            goto L_0x0220
        L_0x021e:
            r26 = 1
        L_0x0220:
            int r0 = r8.value     // Catch:{ Exception -> 0x04b3 }
            r21 = 0
            long r4 = r11.value     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.model.h0 r10 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x04b3 }
            long r24 = r10.mo152616o()     // Catch:{ Exception -> 0x04b3 }
            r20 = r0
            r22 = r4
            r19.mo164367a(r20, r21, r22, r24, r26)     // Catch:{ Exception -> 0x04b3 }
        L_0x0235:
            boolean r0 = r6.value     // Catch:{ Exception -> 0x04b3 }
            if (r0 != 0) goto L_0x02ce
            com.tencent.mm.plugin.voip.model.h0 r0 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.model.m0 r0 = r0.f317332a     // Catch:{ Exception -> 0x04b3 }
            boolean r0 = r0.mo152664i()     // Catch:{ Exception -> 0x04b3 }
            if (r0 != 0) goto L_0x02ce
            di3.d r0 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x04b3 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x04b3 }
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_voip_use_local_params_check_voip     // Catch:{ Exception -> 0x04b3 }
            r4 = 1
            boolean r0 = r0.mo58784wf(r2, r4)     // Catch:{ Exception -> 0x04b3 }
            if (r0 == 0) goto L_0x02cf
            java.lang.String r0 = "fake calling comming and forbid itself cause engine is close"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.model.h0 r0 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x04b3 }
            r0.mo152600N()     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r0 = "markEngineIsClose"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x04b3 }
            r17 = 1433(0x599, double:7.08E-321)
            r19 = 25
            r21 = 1
            r16 = r0
            r16.mo175913w(r17, r19, r21)     // Catch:{ Exception -> 0x04b3 }
            z33.g r23 = z33.C112594g.f337162a     // Catch:{ Exception -> 0x04b3 }
            int r2 = r8.value     // Catch:{ Exception -> 0x04b3 }
            r25 = 1
            long r4 = r11.value     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.model.h0 r6 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x04b3 }
            long r28 = r6.mo152616o()     // Catch:{ Exception -> 0x04b3 }
            r30 = 1
            r24 = r2
            r26 = r4
            r23.mo164367a(r24, r25, r26, r28, r30)     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.model.h0 r2 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x04b3 }
            long r4 = r11.value     // Catch:{ Exception -> 0x04b3 }
            java.util.HashMap<java.lang.Long, java.lang.Boolean> r2 = r2.f317329D     // Catch:{ Exception -> 0x04b3 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x04b3 }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x04b3 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x04b3 }
            if (r2 != 0) goto L_0x02a1
            r2 = 0
            goto L_0x02a5
        L_0x02a1:
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x04b3 }
        L_0x02a5:
            if (r2 == 0) goto L_0x02b8
            java.lang.String r2 = "markForbiddenCallingAfterCancel"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)     // Catch:{ Exception -> 0x04b3 }
            r17 = 1433(0x599, double:7.08E-321)
            r19 = 28
            r21 = 1
            r16 = r0
            r16.mo175913w(r17, r19, r21)     // Catch:{ Exception -> 0x04b3 }
            goto L_0x02c8
        L_0x02b8:
            java.lang.String r2 = "markForbiddenCallingNoneAfterCancel"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)     // Catch:{ Exception -> 0x04b3 }
            r17 = 1433(0x599, double:7.08E-321)
            r19 = 29
            r21 = 1
            r16 = r0
            r16.mo175913w(r17, r19, r21)     // Catch:{ Exception -> 0x04b3 }
        L_0x02c8:
            com.tencent.mm.plugin.voip.ui.VideoActivity r0 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            r0.mo152911I7()     // Catch:{ Exception -> 0x04b3 }
            return
        L_0x02ce:
            r4 = 1
        L_0x02cf:
            com.tencent.mm.plugin.voip.model.h0 r8 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.VideoActivity r9 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            r0 = 0
            r10 = r14
            r2 = r11
            r11 = r6
            r12 = r15
            r5 = r7
            r13 = r5
            r7 = r14
            r14 = r2
            r2 = r15
            r15 = r0
            l33.a r0 = r8.mo152621t(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x04b3 }
            if (r0 != 0) goto L_0x02f8
            java.lang.String r0 = "unable to init VoipMgr"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.model.h0 r0 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x04b3 }
            r0.mo152600N()     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.VideoActivity r0 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            r0.mo152911I7()     // Catch:{ Exception -> 0x04b3 }
            return
        L_0x02f8:
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x04b3 }
            r8.<init>(r0)     // Catch:{ Exception -> 0x04b3 }
            r1.f317879h = r8     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r0 = r7.value     // Catch:{ Exception -> 0x04b3 }
            r1.f317884p = r0     // Catch:{ Exception -> 0x04b3 }
            boolean r0 = r2.value     // Catch:{ Exception -> 0x04b3 }
            r1.f317876e = r0     // Catch:{ Exception -> 0x04b3 }
            boolean r0 = r6.value     // Catch:{ Exception -> 0x04b3 }
            r1.f317875d = r0     // Catch:{ Exception -> 0x04b3 }
            int r0 = r1.f317882n     // Catch:{ Exception -> 0x04b3 }
            r2 = -1
            if (r0 != r2) goto L_0x0312
            int r0 = r5.value     // Catch:{ Exception -> 0x04b3 }
        L_0x0312:
            r1.f317882n = r0     // Catch:{ Exception -> 0x04b3 }
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)     // Catch:{ Exception -> 0x04b3 }
            f62.k0 r0 = (f62.C75700k0) r0     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r2 = r1.f317884p     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.storage.z1 r0 = r0.get(r2)     // Catch:{ Exception -> 0x04b3 }
            r1.f317877f = r0     // Catch:{ Exception -> 0x04b3 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ Exception -> 0x04b3 }
            r0.<init>()     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r2 = "key_username"
            com.tencent.mm.storage.z1 r5 = r1.f317877f     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r5 = r5.getUsername()     // Catch:{ Exception -> 0x04b3 }
            r0.putString(r2, r5)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r2 = "key_isoutcall"
            boolean r5 = r1.f317875d     // Catch:{ Exception -> 0x04b3 }
            r0.putBoolean(r2, r5)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r2 = "key_status"
            boolean r5 = r1.f317875d     // Catch:{ Exception -> 0x04b3 }
            boolean r6 = r1.f317876e     // Catch:{ Exception -> 0x04b3 }
            int r5 = z33.C112604l.m153980c(r5, r6)     // Catch:{ Exception -> 0x04b3 }
            r0.putInt(r2, r5)     // Catch:{ Exception -> 0x04b3 }
            int r2 = r1.f317882n     // Catch:{ Exception -> 0x04b3 }
            r5 = 262(0x106, float:3.67E-43)
            r6 = 8
            if (r2 == r5) goto L_0x0359
            if (r2 != r6) goto L_0x0357
            goto L_0x0359
        L_0x0357:
            r12 = 0
            goto L_0x035a
        L_0x0359:
            r12 = 1
        L_0x035a:
            if (r12 == 0) goto L_0x036e
            com.tencent.mm.plugin.voip.model.h0 r0 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x04b3 }
            r0.mo152600N()     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r0 = "current is run on failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.VideoActivity r0 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            r0.mo152911I7()     // Catch:{ Exception -> 0x04b3 }
            return
        L_0x036e:
            boolean r2 = z33.C112604l.m153983f(r2)     // Catch:{ Exception -> 0x04b3 }
            if (r2 == 0) goto L_0x037c
            com.tencent.mm.plugin.voip.ui.NewVoipVideoFragment r2 = new com.tencent.mm.plugin.voip.ui.NewVoipVideoFragment     // Catch:{ Exception -> 0x04b3 }
            r2.<init>()     // Catch:{ Exception -> 0x04b3 }
            r1.f317878g = r2     // Catch:{ Exception -> 0x04b3 }
            goto L_0x0383
        L_0x037c:
            com.tencent.mm.plugin.voip.ui.VoipVoiceFragment r2 = new com.tencent.mm.plugin.voip.ui.VoipVoiceFragment     // Catch:{ Exception -> 0x04b3 }
            r2.<init>()     // Catch:{ Exception -> 0x04b3 }
            r1.f317878g = r2     // Catch:{ Exception -> 0x04b3 }
        L_0x0383:
            com.tencent.mm.plugin.voip.ui.VoipBaseFragment r2 = r1.f317878g     // Catch:{ Exception -> 0x04b3 }
            r2.setArguments(r0)     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.VideoActivity r0 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()     // Catch:{ Exception -> 0x04b3 }
            androidx.fragment.app.c0 r0 = r0.beginTransaction()     // Catch:{ Exception -> 0x04b3 }
            r2 = 2131316487(0x7f094f07, float:1.8251457E38)
            com.tencent.mm.plugin.voip.ui.VoipBaseFragment r5 = r1.f317878g     // Catch:{ Exception -> 0x04b3 }
            r0.mo165200l(r2, r5)     // Catch:{ Exception -> 0x04b3 }
            r0.mo165162d()     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.VideoActivity r0 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            r0.setTitleVisibility(r6)     // Catch:{ Exception -> 0x04b3 }
            int r0 = r1.f317882n     // Catch:{ Exception -> 0x04b3 }
            boolean r0 = z33.C112604l.m153982e(r0)     // Catch:{ Exception -> 0x04b3 }
            if (r0 == 0) goto L_0x03bb
            boolean r0 = r1.f317875d     // Catch:{ Exception -> 0x04b3 }
            if (r0 != 0) goto L_0x03af
            goto L_0x03bb
        L_0x03af:
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r1.f317880i     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.w r2 = new com.tencent.mm.plugin.voip.ui.w     // Catch:{ Exception -> 0x04b3 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x04b3 }
            r5 = 20000(0x4e20, double:9.8813E-320)
            r0.postDelayed(r2, r5)     // Catch:{ Exception -> 0x04b3 }
        L_0x03bb:
            com.tencent.mm.plugin.voip.model.h0 r0 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x04b3 }
            l33.a r0 = r0.f317333b     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r0 = r0.mo152439P()     // Catch:{ Exception -> 0x04b3 }
            if (r0 == 0) goto L_0x03d4
            com.tencent.mm.plugin.voip.model.h0 r0 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x04b3 }
            l33.a r0 = r0.f317333b     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r0 = r0.mo152439P()     // Catch:{ Exception -> 0x04b3 }
            r1.mo152915Q2(r0)     // Catch:{ Exception -> 0x04b3 }
        L_0x03d4:
            boolean r0 = r1.f317876e     // Catch:{ Exception -> 0x04b3 }
            if (r0 == 0) goto L_0x0406
            com.tencent.mm.plugin.voip.ui.VideoActivity r0 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r0)     // Catch:{ Exception -> 0x04b3 }
            if (r2 != 0) goto L_0x03ea
            com.tencent.mm.plugin.voip.model.h0 r2 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x04b3 }
            boolean r2 = r2.f317337f     // Catch:{ Exception -> 0x04b3 }
            if (r2 != 0) goto L_0x03ea
            r12 = 1
            goto L_0x03eb
        L_0x03ea:
            r12 = 0
        L_0x03eb:
            if (r12 == 0) goto L_0x0406
            com.tencent.mm.plugin.voip.model.h0 r2 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x04b3 }
            r2.getClass()     // Catch:{ Exception -> 0x04b3 }
            android.content.res.Resources r2 = r0.getResources()     // Catch:{ Exception -> 0x04b3 }
            r5 = 2131838568(0x7f114668, float:1.9310363E38)
            java.lang.CharSequence r2 = r2.getText(r5)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x04b3 }
            nj3.C76912y0.m92774m(r0, r2)     // Catch:{ Exception -> 0x04b3 }
        L_0x0406:
            o33.b r0 = new o33.b     // Catch:{ Exception -> 0x04b3 }
            uv0.i r2 = new uv0.i     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.VideoActivity r5 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x04b3 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x04b3 }
            r1.f317894z = r0     // Catch:{ Exception -> 0x04b3 }
            r2 = 9
            java.lang.String r5 = "VOIPFloatBall"
            r0.mo35648A(r2, r5)     // Catch:{ Exception -> 0x04b3 }
            java.lang.ref.WeakReference<com.tencent.mm.plugin.voip.ui.g> r0 = r1.f317879h     // Catch:{ Exception -> 0x04b3 }
            if (r0 == 0) goto L_0x0432
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x04b3 }
            if (r0 == 0) goto L_0x0432
            java.lang.ref.WeakReference<com.tencent.mm.plugin.voip.ui.g> r0 = r1.f317879h     // Catch:{ Exception -> 0x04b3 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.g r0 = (com.tencent.p014mm.plugin.voip.p475ui.C106448g) r0     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.VideoActivity r2 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            r0.mo152494v(r2, r4)     // Catch:{ Exception -> 0x04b3 }
        L_0x0432:
            com.tencent.mm.plugin.voip.ui.VoipBaseFragment r0 = r1.f317878g     // Catch:{ Exception -> 0x04b3 }
            java.lang.ref.WeakReference<com.tencent.mm.plugin.voip.ui.g> r2 = r1.f317879h     // Catch:{ Exception -> 0x04b3 }
            java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.g r2 = (com.tencent.p014mm.plugin.voip.p475ui.C106448g) r2     // Catch:{ Exception -> 0x04b3 }
            r0.getClass()     // Catch:{ Exception -> 0x04b3 }
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x04b3 }
            r5.<init>(r2)     // Catch:{ Exception -> 0x04b3 }
            r0.f317931v = r5     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.VoipBaseFragment r0 = r1.f317878g     // Catch:{ Exception -> 0x04b3 }
            r0.f317930u = r1     // Catch:{ Exception -> 0x04b3 }
            boolean r2 = r1.f317887s     // Catch:{ Exception -> 0x04b3 }
            r0.mo152883S(r2)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r0 = "VideoActivity onCreate end isOutCall:%b isVideoCall:%b username:%s state:%d"
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x04b3 }
            boolean r5 = r1.f317875d     // Catch:{ Exception -> 0x04b3 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x04b3 }
            r6 = 0
            r2[r6] = r5     // Catch:{ Exception -> 0x04b3 }
            boolean r5 = r1.f317876e     // Catch:{ Exception -> 0x04b3 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x04b3 }
            r2[r4] = r5     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r4 = r1.f317884p     // Catch:{ Exception -> 0x04b3 }
            r5 = 2
            r2[r5] = r4     // Catch:{ Exception -> 0x04b3 }
            int r4 = r1.f317882n     // Catch:{ Exception -> 0x04b3 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x04b3 }
            r5 = 3
            r2[r5] = r4     // Catch:{ Exception -> 0x04b3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r2)     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.sdk.event.IListener r0 = r1.f317871B     // Catch:{ Exception -> 0x04b3 }
            r0.alive()     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.sdk.event.IListener r0 = r1.f317874E     // Catch:{ Exception -> 0x04b3 }
            r0.alive()     // Catch:{ Exception -> 0x04b3 }
            r0 = 17
            boolean r0 = p206nj.C11171e.m11046c(r0)     // Catch:{ Exception -> 0x04b3 }
            if (r0 == 0) goto L_0x04c0
            android.graphics.Point r0 = new android.graphics.Point     // Catch:{ Exception -> 0x04b3 }
            r0.<init>()     // Catch:{ Exception -> 0x04b3 }
            r1.f317872C = r0     // Catch:{ Exception -> 0x04b3 }
            com.tencent.mm.plugin.voip.ui.VideoActivity r0 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x04b3 }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x04b3 }
            android.view.Display r0 = r0.getDisplay()     // Catch:{ Exception -> 0x04b3 }
            if (r0 == 0) goto L_0x04c0
            com.tencent.mm.plugin.voip.ui.VideoActivity r0 = r1.f317870A     // Catch:{ Exception -> 0x04b3 }
            android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x04b3 }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x04b3 }
            android.view.Display r0 = r0.getDisplay()     // Catch:{ Exception -> 0x04b3 }
            android.graphics.Point r2 = r1.f317872C     // Catch:{ Exception -> 0x04b3 }
            r0.getRealSize(r2)     // Catch:{ Exception -> 0x04b3 }
            goto L_0x04c0
        L_0x04b3:
            r0 = move-exception
            r2 = 2
            z33.C112597j.m153944i(r2)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r4, r2)
        L_0x04c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.p475ui.VideoActivityController.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        this.f317888t = 4;
        Log.m105925i("MicroMsg.Voip.VideoActivityController", "onDestroy, status: %s", C112604l.m153981d(this.f317882n));
        if (!this.f317892x) {
            finish();
        }
        WeakReference<C106448g> weakReference = this.f317879h;
        if (!(weakReference == null || weakReference.get() == null)) {
            this.f317879h.get().mo152459a(this.f317870A);
        }
        C109938b bVar = this.f317894z;
        if (bVar != null) {
            bVar.mo67996A0();
        }
        this.f317871B.dead();
        this.f317874E.dead();
        this.f317870A.mo152914K7(true);
        if (!this.f317885q) {
            C110193b.f329648a.mo161593c();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Class cls = C110248b.class;
        Class cls2 = C109749c.class;
        if (keyEvent.getKeyCode() == 4) {
            return true;
        }
        if (i == 25) {
            if (!C109247e.xx0().mo152623v() && this.f317875d) {
                int c = C110248b.vx0().mo157510m() ? C110248b.f329777h.mo161658c() : ((C109749c) C86312j.m106911c(cls2)).mo86664Px();
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(SubCoreAudio::class.java)");
                C110066a aVar = ((C110248b) c2).f329779e;
                if (aVar == null) {
                    aVar = new C110071c();
                    C7335d c3 = C86312j.m106911c(cls);
                    C87412m.m108593f(c3, "getService(SubCoreAudio::class.java)");
                    ((C110248b) c3).f329781g[0] = "music";
                }
                C107043a.m144903a(aVar.f329358h, c, -1, 5);
                return true;
            }
        } else if (i == 24 && this.f317875d && !C109247e.xx0().mo152623v()) {
            int c4 = C110248b.vx0().mo157510m() ? C110248b.f329777h.mo161658c() : ((C109749c) C86312j.m106911c(cls2)).mo86664Px();
            C7335d c5 = C86312j.m106911c(cls);
            C87412m.m108593f(c5, "getService(SubCoreAudio::class.java)");
            C110066a aVar2 = ((C110248b) c5).f329779e;
            if (aVar2 == null) {
                aVar2 = new C110071c();
                C7335d c6 = C86312j.m106911c(cls);
                C87412m.m108593f(c6, "getService(SubCoreAudio::class.java)");
                ((C110248b) c6).f329781g[0] = "music";
            }
            C107043a.m144903a(aVar2.f329358h, c4, 1, 5);
            return true;
        }
        if (C107835h0.f322845b.f322807f != 1 || i != 700) {
            return false;
        }
        mo152938b();
        return true;
    }

    public void onNewIntent(Intent intent) {
        Log.m105924i("MicroMsg.Voip.VideoActivityController", "onNewIntent");
    }

    public void onPause() {
        boolean inKeyguardRestrictedInputMode = ((KeyguardManager) MMApplicationContext.getContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        boolean hasWindowFocus = this.f317870A.hasWindowFocus();
        boolean isScreenOn = ((PowerManager) MMApplicationContext.getContext().getSystemService("power")).isScreenOn();
        this.f317889u = (hasWindowFocus || !inKeyguardRestrictedInputMode) && isScreenOn;
        Log.m105925i("MicroMsg.Voip.VideoActivityController", "onPause, status: %s, screenOn: %b, hasWindowFocus: %s, isScreenLocked: %s, isScreenOn: %s", C112604l.m153981d(this.f317882n), Boolean.valueOf(this.f317889u), Boolean.valueOf(hasWindowFocus), Boolean.valueOf(inKeyguardRestrictedInputMode), Boolean.valueOf(isScreenOn));
    }

    public void onPostResume() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = i;
        int[] iArr2 = iArr;
        if (iArr2 == null || iArr2.length <= 0) {
            Log.m105925i("MicroMsg.Voip.VideoActivityController", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.Voip.VideoActivityController", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr2[0]), Long.valueOf(Thread.currentThread().getId()));
        int i3 = C0966R.string.f361130hi2;
        if (i2 != 19) {
            if (i2 == 82 && iArr2[0] != 0) {
                VideoActivity videoActivity = this.f317870A;
                C76879j.m92709C(videoActivity, videoActivity.getString(C0966R.string.f361130hi2), this.f317870A.getString(C0966R.string.hif), this.f317870A.getString(C0966R.string.fyd), this.f317870A.getString(C0966R.string.f7926wf), false, new C106421c(), (DialogInterface.OnClickListener) null);
            }
        } else if (iArr2[0] != 0) {
            if ("android.permission.CAMERA".equals(strArr[0])) {
                i3 = C0966R.string.hhq;
            }
            VideoActivity videoActivity2 = this.f317870A;
            C76879j.m92709C(videoActivity2, videoActivity2.getString(i3), this.f317870A.getString(C0966R.string.hif), this.f317870A.getString(C0966R.string.fyd), this.f317870A.getString(C0966R.string.f7926wf), false, new C106419a(), new C106420b(this));
        }
    }

    public void onResume() {
        Log.m105925i("MicroMsg.Voip.VideoActivityController", "onResume, status: %s", C112604l.m153981d(this.f317882n));
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(40);
        C106377r rVar = C109247e.xx0().f317332a.f317396a;
        if (rVar.f317493q) {
            rVar.f317493q = false;
        }
        WeakReference<C106448g> weakReference = this.f317879h;
        if (!(weakReference == null || weakReference.get() == null)) {
            this.f317879h.get().mo152496x();
        }
        this.f317870A.mo152914K7(true);
        Util.currentTicks();
        this.f317893y = true;
        WeakReference<C106448g> weakReference2 = this.f317879h;
        if (!(weakReference2 == null || weakReference2.get() == null)) {
            this.f317879h.get().mo152471h();
        }
        C109938b bVar = this.f317894z;
        if (bVar != null && !this.f317890v) {
            bVar.mo78184B0();
            C103928o.m138641a(true, false, true);
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }

    public void onStart() {
        Class cls = C103918d.class;
        if (this.f317876e) {
            Log.m105925i("MicroMsg.Voip.VideoActivityController", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", Boolean.valueOf(((C103918d) C86312j.m106911c(cls)).mo125788z1(this.f317870A, "android.permission.CAMERA", 19, "", "")), Util.getStack(), this);
            C109247e.xx0().getClass();
            Log.m105925i("MicroMsg.Voip.VideoActivityController", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", Boolean.valueOf(((C103918d) C86312j.m106911c(cls)).mo125788z1(this.f317870A, "android.permission.RECORD_AUDIO", 19, "", "")), Util.getStack(), this);
        } else {
            Log.m105925i("MicroMsg.Voip.VideoActivityController", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", Boolean.valueOf(((C103918d) C86312j.m106911c(cls)).mo125788z1(this.f317870A, "android.permission.RECORD_AUDIO", 82, "", "")), Util.getStack(), this);
        }
        if (!this.f317892x) {
            Log.m105924i("MicroMsg.Voip.VideoActivityController", "onStart");
            this.f317888t = 1;
            mo152924e5(4096, this.f317882n);
        }
    }

    public void onStop() {
        WeakReference<C106448g> weakReference;
        this.f317888t = 2;
        Log.m105925i("MicroMsg.Voip.VideoActivityController", "onStop, status: %s", C112604l.m153981d(this.f317882n));
        int i = this.f317882n;
        if (262 != i && 8 != i && this.f317889u && !this.f317890v && !this.f317892x && (weakReference = this.f317879h) != null && weakReference.get() != null && this.f317879h.get().mo152433L(false)) {
            mo152925f0(false, true);
            if (C112604l.m153984g(this.f317882n)) {
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(C112604l.m153983f(this.f317882n) ? 2 : 3);
                objArr[1] = 2;
                nVar.mo160131h(11618, objArr);
            }
        }
        C109938b bVar = this.f317894z;
        if (bVar != null && !this.f317890v) {
            bVar.mo64001C();
            C103928o.m138642b();
        }
    }

    public /* synthetic */ void onSwipeBackFinish() {
    }

    public void onTrimMemory(int i) {
    }

    public boolean onUserLeaveHint() {
        return false;
    }

    /* renamed from: p0 */
    public void mo152934p0(C107054l.C107055a aVar) {
        if (this.f317886r != null) {
            int i = aVar.f320468a;
            if (i == 1) {
                C76701a.makeText((Context) this.f317870A.getContext(), (CharSequence) this.f317870A.getContext().getString(C0966R.string.kjf), 0).show();
                if (!this.f317876e) {
                    this.f317870A.mo152914K7(true);
                }
            } else if (i == 2) {
                C76701a.makeText((Context) this.f317870A.getContext(), (CharSequence) this.f317870A.getContext().getString(C0966R.string.kje), 0).show();
            } else if (!this.f317876e) {
                this.f317870A.mo152914K7(true);
            }
        }
        this.f317886r = aVar;
        WeakReference<C106448g> weakReference = this.f317879h;
        if (!(weakReference == null || weakReference.get() == null)) {
            this.f317879h.get().mo152485p0(aVar);
        }
        VoipBaseFragment voipBaseFragment = this.f317878g;
        if (voipBaseFragment != null) {
            voipBaseFragment.mo152886V(aVar.f320468a);
        }
    }

    /* renamed from: r */
    public void mo152935r() {
        VoipBaseFragment voipBaseFragment = this.f317878g;
        if (voipBaseFragment != null) {
            voipBaseFragment.mo152974P(10);
        }
    }

    public void setMute(boolean z) {
        this.f317887s = z;
        VoipBaseFragment voipBaseFragment = this.f317878g;
        if (voipBaseFragment != null) {
            voipBaseFragment.mo152883S(z);
        }
    }

    public void setScreenEnable(boolean z) {
        WeakReference<C106448g> weakReference = this.f317879h;
        if (weakReference != null) {
            weakReference.get();
        }
    }
}
