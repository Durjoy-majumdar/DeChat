package com.tencent.p014mm.p136ui;

import ae2.C39550b;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import bm3.C0329a;
import com.tencent.mars.Mars;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C80595i;
import com.tencent.p014mm.autogen.events.MultiWindowModeChangedEvent;
import com.tencent.p014mm.autogen.events.NotifyEnterChattingEvent;
import com.tencent.p014mm.autogen.events.OPPOFloatWindowModeChangedEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.WC3DTouchHomeShortCutStruct;
import com.tencent.p014mm.booter.C28862c;
import com.tencent.p014mm.booter.CoreService;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.modelstat.C81027f;
import com.tencent.p014mm.p136ui.HomeUI;
import com.tencent.p014mm.p136ui.NewChattingTabUI;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.ChattingUIFragment;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.contact.C74585x0;
import com.tencent.p014mm.p136ui.conversation.C74720p;
import com.tencent.p014mm.p136ui.conversation.ConversationListView;
import com.tencent.p014mm.p136ui.conversation.MainUI;
import com.tencent.p014mm.p136ui.tools.C74860u1;
import com.tencent.p014mm.p136ui.tools.C74863w0;
import com.tencent.p014mm.plugin.account.p024ui.WelcomeActivity;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.C85405m;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataFragmentActivity;
import com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsSwitchAccountUI;
import com.tencent.p014mm.plugin.taskbar.p110ui.C71323d;
import com.tencent.p014mm.plugin.taskbar.p110ui.C71331l;
import com.tencent.p014mm.pluginsdk.platformtools.C85623c;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WeChatPermissions;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.sdk.vendor.OnePlus;
import com.tencent.p014mm.storage.C19627t;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C7624i3;
import eb0.C97625j3;
import eg0.C45655c;
import f40.C75681p0;
import f40.C86709a0;
import f40.C86718e;
import f62.C75707s0;
import ht1.C60204t3;
import ht1.C76244c4;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import n63.C76831b;
import nc0.C76850a;
import nj3.C76879j;
import nj3.C88989a;
import nj3.C88990b;
import p206nj.C11171e;
import p206nj.C76866m;
import p287zz.C79441d;
import p447aw.C103918d;
import p498dv.C75457c;
import p626nv.C109759g;
import p763ym.C79139p;
import p773yy.C79168k;
import p787ai.C79546a;
import p787ai.C79547b;
import p873bx.C67323a;
import wc3.C78537k0;
import wc3.C78538u;
import xi3.C15699h;
import xi3.C15702i;
import xi3.C26539c;
import xi3.C78844a;

@C88989a(3)
/* renamed from: com.tencent.mm.ui.LauncherUI */
public class LauncherUI extends MMSecDataFragmentActivity {

    /* renamed from: A */
    public static ArrayList<LauncherUI> f214332A = new ArrayList<>();

    /* renamed from: B */
    public static ArrayList<WeakReference<LauncherUI>> f214333B = new ArrayList<>();

    /* renamed from: C */
    public static boolean f214334C = true;

    /* renamed from: D */
    public static boolean f214335D = false;

    /* renamed from: E */
    public static Boolean f214336E = null;
    private NewChattingTabUI chattingTabUI;

    /* renamed from: j */
    public IListener<NotifyEnterChattingEvent> f214337j = new IListener<NotifyEnterChattingEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1684644523;
        }

        public boolean callback(IEvent iEvent) {
            Log.m105924i("MicroMsg.LauncherUI", "enterChattingUIEventIListener execute");
            Intent intent = new Intent(LauncherUI.this, LauncherUI.class);
            intent.putExtra("nofification_type", "new_msg_nofification");
            intent.putExtra("Main_User", ((NotifyEnterChattingEvent) iEvent).f154847d.f154848a);
            intent.putExtra("talkerCount", 1);
            intent.addFlags(536870912);
            intent.addFlags(67108864);
            LauncherUI launcherUI = LauncherUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(launcherUI, aVar.mo10232b(), "com/tencent/mm/ui/LauncherUI$1", "callback", "(Lcom/tencent/mm/autogen/events/NotifyEnterChattingEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            launcherUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(launcherUI, "com/tencent/mm/ui/LauncherUI$1", "callback", "(Lcom/tencent/mm/autogen/events/NotifyEnterChattingEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return false;
        }
    };

    /* renamed from: n */
    public HomeUI f214338n;

    /* renamed from: o */
    public C75048z0 f214339o;

    /* renamed from: p */
    public Intent f214340p;

    /* renamed from: q */
    public boolean f214341q;

    /* renamed from: r */
    public boolean f214342r;

    /* renamed from: s */
    public boolean f214343s;

    /* renamed from: t */
    public C79441d f214344t;

    /* renamed from: u */
    public C78537k0 f214345u;

    /* renamed from: v */
    public boolean f214346v;

    /* renamed from: w */
    public MMHandler f214347w;

    /* renamed from: x */
    public Runnable f214348x;

    /* renamed from: y */
    public boolean f214349y;

    /* renamed from: z */
    public int f214350z;

    /* renamed from: com.tencent.mm.ui.LauncherUI$a */
    public class C73061a implements Runnable {
        public C73061a() {
        }

        public void run() {
            MMFragment h = LauncherUI.this.getHomeUI().f214291t.mo101424h(0);
            if (h instanceof MainUI) {
                ((MainUI) h).f219476o.mo103727m();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.LauncherUI$c */
    public interface C73062c {
    }

    /* renamed from: com.tencent.mm.ui.LauncherUI$d */
    public interface C73063d {
    }

    /* renamed from: com.tencent.mm.ui.LauncherUI$e */
    public interface C73064e {
    }

    /* renamed from: com.tencent.mm.ui.LauncherUI$f */
    public static final class C73065f implements C0329a {
        /* renamed from: j */
        public Activity mo372j() {
            return LauncherUI.getInstance();
        }
    }

    /* renamed from: com.tencent.mm.ui.LauncherUI$g */
    public interface C73066g {
    }

    /* renamed from: com.tencent.mm.ui.LauncherUI$b */
    public class C73067b implements Runnable {

        /* renamed from: d */
        public long f214352d = 2000;

        /* renamed from: com.tencent.mm.ui.LauncherUI$b$a */
        public class C73068a implements Runnable {
            public C73068a(C73067b bVar) {
            }

            public void run() {
                C40318k.m43492a().terminateApp(Process.myTid(), SystemClock.elapsedRealtimeNanos());
                Log.m105924i("MicroMsg.LauncherUI", "resumeLogoutJump terminateApp done");
            }
        }

        public C73067b(LauncherUI launcherUI) {
        }

        public void run() {
            Log.m105925i("MicroMsg.LauncherUI", "resumeLogoutJump logoutExitCheck tid[%d]", Long.valueOf(Thread.currentThread().getId()));
            MMHandlerThread.removeRunnable(this);
            if (C97625j3.m125820j()) {
                Log.m105925i("MicroMsg.LauncherUI", "resumeLogoutJump logoutExitCheck done uin[%d]", Integer.valueOf(C86709a0.m107523b().mo121110g()));
                return;
            }
            C81027f.C81029b bVar = C81027f.m98943c().f238000a;
            if ((bVar.f238007f > bVar.f238008g) || CrashReportFactory.foreground) {
                long j = this.f214352d + 2000;
                this.f214352d = j;
                if (j > 10000) {
                    this.f214352d = 2000;
                }
                Object[] objArr = new Object[3];
                C81027f.C81029b bVar2 = C81027f.m98943c().f238000a;
                objArr[0] = Boolean.valueOf(bVar2.f238007f > bVar2.f238008g);
                objArr[1] = Boolean.valueOf(CrashReportFactory.foreground);
                objArr[2] = Long.valueOf(this.f214352d);
                Log.m105925i("MicroMsg.LauncherUI", "resumeLogoutJump logoutExitCheck isAppOnForeground[%b] foreground[%b] trigger next [%d]", objArr);
                MMHandlerThread.postToMainThreadDelayed(this, this.f214352d);
                return;
            }
            Log.m105924i("MicroMsg.LauncherUI", "resumeLogoutJump terminateApp logoutExitCheck logout and background kill exit!!!");
            if (C40318k.m43492a().isCheckEnv()) {
                ThreadPool.post(new C73068a(this), "terminateApp");
            }
            Log.m105924i("MicroMsg.LauncherUI", "resumeLogoutJump terminateApp logoutExitCheck logout and background kill exit app done");
        }
    }

    public LauncherUI() {
        HomeUI homeUI = new HomeUI();
        this.f214338n = homeUI;
        this.chattingTabUI = new NewChattingTabUI(homeUI);
        this.f214339o = new C75048z0();
        this.f214340p = null;
        this.f214341q = false;
        this.f214342r = false;
        this.f214343s = false;
        this.f214345u = new C78537k0("MicroMsg.LauncherUI");
        this.f214346v = false;
        this.f214347w = new MMHandler();
        this.f214348x = new C73067b(this);
        this.f214349y = false;
        this.f214350z = 0;
    }

    /* renamed from: U7 */
    public static void m85941U7(Context context) {
        Intent intent = new Intent(context, LauncherUI.class);
        intent.addFlags(67108864);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/ui/LauncherUI", "startMainTabUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/ui/LauncherUI", "startMainTabUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static int getCurrentTabIndex() {
        if (getInstance() == null || getInstance().getHomeUI() == null || getInstance().getHomeUI().getMainTabUI() == null) {
            return -1;
        }
        return getInstance().getHomeUI().getMainTabUI().f214435e;
    }

    public static LauncherUI getInstance() {
        if (!f214332A.isEmpty()) {
            return f214332A.get(0);
        }
        Log.m105921e("MicroMsg.LauncherUI", "LauncherUI instances should not be empty. %s", Util.getStack());
        return null;
    }

    /* renamed from: H7 */
    public boolean mo101368H7() {
        if (f214336E == null) {
            f214336E = Boolean.valueOf(C85875k4.m106157N() || C85875k4.m106167X());
        }
        return !f214336E.booleanValue();
    }

    /* renamed from: I7 */
    public void mo101369I7() {
        super.mo101369I7();
        if (this.f214341q) {
            this.chattingTabUI.mo101505k(true, 0);
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(C0966R.C0970id.f358506fj1);
        if (viewGroup != null) {
            viewGroup.setImportantForAccessibility(1);
        }
    }

    /* renamed from: J7 */
    public void mo101370J7() {
        ImageView imageView;
        if (!(this.chattingTabUI.mo101503i() || (imageView = (ImageView) findViewById(C0966R.C0970id.i1m)) == null || imageView.getDrawable() == null)) {
            imageView.setImageDrawable((Drawable) null);
        }
        if (this.f214341q) {
            this.chattingTabUI.mo101505k(false, 0);
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(C0966R.C0970id.f358506fj1);
        if (viewGroup != null && !C85875k4.m106208w()) {
            viewGroup.setImportantForAccessibility(4);
        }
    }

    /* renamed from: K7 */
    public void mo101371K7() {
        super.mo101371K7();
    }

    /* renamed from: L7 */
    public void mo101372L7() {
        super.mo101372L7();
        MainTabUnreadMgr mainTabUnreadMgr = getHomeUI().f214291t.f214432b;
        mainTabUnreadMgr.getClass();
        C79547b.f233255g.mo109607a(new C57846q2(mainTabUnreadMgr));
        C76244c4 c4Var = mainTabUnreadMgr.f214452f;
        if (c4Var != null) {
            c4Var.onResume();
        }
    }

    /* renamed from: M7 */
    public final void mo101373M7() {
        Log.m105918d("MicroMsg.LauncherUI", "[whatsnew] checkIfStartWhatsNew.");
        if (C86709a0.m107523b().mo121114l()) {
            Intent intent = this.f214340p;
            boolean z = true;
            if (!(intent != null && !IntentUtil.getBooleanExtra(intent, "Intro_Switch", false) && C97625j3.m125820j() && !C86718e.m107551r())) {
                Log.m105924i("MicroMsg.LauncherUI", "[whatsnew] notSwitchOrHold is false, skip whatsnew.");
                return;
            }
            boolean booleanExtra = IntentUtil.getBooleanExtra(getIntent(), "LauncherUI.enter_from_reg", false);
            boolean h = C78844a.C15689b.f42385a.mo108842h(true);
            C85623c.C85624a aVar = C85623c.f249568a;
            Object[] objArr = new Object[5];
            objArr[0] = Boolean.valueOf(booleanExtra);
            objArr[1] = Boolean.valueOf(C97625j3.m125811a());
            if (aVar != null) {
                z = false;
            }
            objArr[2] = Boolean.valueOf(z);
            objArr[3] = Boolean.FALSE;
            objArr[4] = Boolean.valueOf(h);
            Log.m105925i("MicroMsg.LauncherUI", "[whatsnew] do not show whatsnew. enter_from_reg=%s accHasReady=%s MMAppMgr is null %s isWhatsNewAvailable=%s, isAccessibilityEnabled=%s", objArr);
        } else if (!C86709a0.m107523b().mo121115m()) {
            Log.m105924i("MicroMsg.LauncherUI", "[whatsnew] not login yet, skip.");
        } else {
            Log.m105924i("MicroMsg.LauncherUI", "[whatsnew] account not initiate, skip whatsnew.");
        }
    }

    /* renamed from: N7 */
    public final void mo101374N7() {
        int indexOf = f214332A.indexOf(this);
        if (indexOf >= 0) {
            f214332A.remove(indexOf);
        }
        Log.m105925i("MicroMsg.LauncherUI", "checktask delteInstance index %d, size:%d, hashCode: 0x%x", Integer.valueOf(indexOf), Integer.valueOf(f214332A.size()), Integer.valueOf(hashCode()));
    }

    /* renamed from: O7 */
    public MainTabUI mo101375O7() {
        return this.f214338n.getMainTabUI();
    }

    /* renamed from: P7 */
    public final boolean mo101376P7() {
        Intent intent = this.f214340p;
        if (intent != null) {
            if (IntentUtil.getBooleanExtra(intent, "absolutely_exit", false) || IntentUtil.getIntExtra(this.f214340p, "absolutely_exit_pid", 0) == Process.myPid()) {
                Log.m105929w("MicroMsg.LauncherUI", "resumeLogoutJump launcherOnResume exit absolutely!!! hashCode[%d]", Integer.valueOf(hashCode()));
                finish();
                C85405m.m105415e(8);
                MMAppMgr.m85988h(IntentUtil.getBooleanExtra(this.f214340p, "kill_service", true));
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                Object obj = new Object();
                C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/ui/LauncherUI", "handleExitIntent", "()Z", "java/lang/System_EXEC_", "exit", "(I)V");
                System.exit(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(obj, "com/tencent/mm/ui/LauncherUI", "handleExitIntent", "()Z", "java/lang/System_EXEC_", "exit", "(I)V");
                return true;
            } else if (IntentUtil.getBooleanExtra(this.f214340p, "can_finish", false)) {
                Log.m105924i("MicroMsg.LauncherUI", "resumeLogoutJump exit obviously");
                C97625j3.m125815e().mo123474t(true);
                if (C75681p0.m90936c(getApplicationContext())) {
                    Context applicationContext = getApplicationContext();
                    if (C28862c.m38402c()) {
                        C80595i.m98217f();
                    } else {
                        try {
                            applicationContext.stopService(new Intent(applicationContext, CoreService.class));
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.CoreServiceHelper", "stopServiceInstance() Exception:%s", e.getMessage());
                        }
                    }
                }
                C85405m.m105415e(8);
                sendBroadcast(new Intent("com.tencent.mm.ui.ACTION_FORCE_DEACTIVE"), WeChatPermissions.PERMISSION_MM_MESSAGE());
                finish();
                C88990b.m111200i(this);
                return true;
            } else if (IntentUtil.getBooleanExtra(this.f214340p, "exit_and_restart", false)) {
                Mars.onSingalCrash(0);
                Log.m105924i("MicroMsg.LauncherUI", "exit and restart myself.");
                Log.appenderFlush();
                finish();
                Intent intent2 = new Intent(this, LauncherUI.class);
                intent2.addFlags(67108864);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent2);
                C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/ui/LauncherUI", "handleExitIntent", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/ui/LauncherUI", "handleExitIntent", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                Log.m105925i("MicroMsg.LauncherUI", "restart, try to kill mm pid %d", Integer.valueOf(Process.myPid()));
                MMAppMgr.m85989i();
                int myPid = Process.myPid();
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(Integer.valueOf(myPid));
                Object obj2 = new Object();
                C117292a.m165358d(obj2, aVar3.mo10232b(), "com/tencent/mm/ui/LauncherUI", "handleExitIntent", "()Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                Process.killProcess(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(obj2, "com/tencent/mm/ui/LauncherUI", "handleExitIntent", "()Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x050b  */
    /* JADX WARNING: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* renamed from: Q7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101377Q7(android.content.Intent r22) {
        /*
            r21 = this;
            r8 = r21
            r0 = r22
            java.lang.Class<rn.v> r1 = p227rn.C48053v.class
            java.lang.String r2 = "MicroMsg.LauncherUI"
            java.lang.String r3 = "handleJump"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            boolean r3 = eb0.C97625j3.m125811a()
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            r5 = 1
            r9 = 0
            if (r3 != 0) goto L_0x006a
            java.lang.String r0 = "handleJump not accHhasReady"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.tencent.mm.ui.LauncherUI> r1 = com.tencent.p014mm.p136ui.LauncherUI.class
            r0.<init>(r8, r1)
            java.lang.String r1 = "Intro_Switch"
            android.content.Intent r0 = r0.putExtra(r1, r5)
            android.content.Intent r0 = r0.addFlags(r4)
            k20.a r10 = new k20.a
            r10.<init>()
            r10.mo10233c(r0)
            java.lang.Object[] r1 = r10.mo10232b()
            java.lang.String r2 = "com/tencent/mm/ui/LauncherUI"
            java.lang.String r3 = "handleJump"
            java.lang.String r4 = "(Landroid/content/Intent;)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r21
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r10.mo10231a(r9)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/ui/LauncherUI"
            java.lang.String r2 = "handleJump"
            java.lang.String r3 = "(Landroid/content/Intent;)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r21
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            r21.finish()
            return
        L_0x006a:
            com.tencent.p014mm.plugin.account.bind.p021ui.BindMobilePolicyUI.m161789S7()
            com.tencent.p014mm.qqlogin.ChangeQQLoginTypeManager.m7005a()
            java.lang.String r3 = "nofification_type"
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getStringExtra(r0, r3)
            java.lang.String r7 = "talkroom_notification"
            boolean r6 = r7.equals(r6)
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            r10 = 0
            if (r6 == 0) goto L_0x00a4
            java.lang.String r1 = "enter_chat_usrname"
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getStringExtra(r0, r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x00a3
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "enter_room_username"
            r1.putExtra(r2, r0)
            r1.setFlags(r7)
            java.lang.String r0 = "talkroom"
            java.lang.String r2 = ".ui.TalkRoomUI"
            ke3.C88144b.m109791i(r8, r0, r2, r1, r10)
        L_0x00a3:
            return
        L_0x00a4:
            java.lang.String r6 = r0.getStringExtra(r3)
            java.lang.String r11 = "back_to_pcmgr_notification"
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x00e0
            java.lang.String r1 = "newPCBackup"
            boolean r0 = r0.getBooleanExtra(r1, r5)
            if (r0 != 0) goto L_0x00c9
            java.lang.String r0 = "MicroMsg.Backup jump BakToPcUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakToPcUI"
            android.content.Intent r0 = r0.setClassName(r8, r1)
            goto L_0x00d9
        L_0x00c9:
            java.lang.String r0 = "MicroMsg.Backup jump BackupPcUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.tencent.mm.plugin.backup.backuppcui.BackupPcUI"
            android.content.Intent r0 = r0.setClassName(r8, r1)
        L_0x00d9:
            r0.setFlags(r7)
            com.tencent.p014mm.p136ui.MMWizardActivity.m7017L7(r8, r0)
            return
        L_0x00e0:
            java.lang.String r6 = r0.getStringExtra(r3)
            java.lang.String r11 = "back_to_pcmgr_error_notification"
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x00fe
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakConnErrorUI"
            android.content.Intent r0 = r0.setClassName(r8, r1)
            r0.setFlags(r7)
            com.tencent.p014mm.p136ui.MMWizardActivity.m7017L7(r8, r0)
            return
        L_0x00fe:
            java.lang.String r6 = r0.getStringExtra(r3)
            java.lang.String r11 = "back_to_pc_collapse_notification"
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x011b
            zt3.t r6 = zt3.C119157j.f356862d
            com.tencent.mm.ui.LauncherUI$a r11 = new com.tencent.mm.ui.LauncherUI$a
            r11.<init>()
            r12 = 500(0x1f4, double:2.47E-321)
            zt3.j r6 = (zt3.C119157j) r6
            r6.getClass()
            r6.mo183892w(r11, r12, r9)
        L_0x011b:
            java.lang.String r6 = r0.getStringExtra(r3)
            java.lang.String r11 = "clear_msg_not_finish_notification"
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x0131
            r0 = 2131823833(0x7f110cd9, float:1.9280477E38)
            r1 = 2131821704(0x7f110488, float:1.9276159E38)
            nj3.C76879j.m92738i(r8, r0, r1)
            return
        L_0x0131:
            java.lang.String r6 = r0.getStringExtra(r3)
            java.lang.String r11 = "backup_move_notification"
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x014f
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI"
            android.content.Intent r0 = r0.setClassName(r8, r1)
            r0.setFlags(r7)
            com.tencent.p014mm.p136ui.MMWizardActivity.m7017L7(r8, r0)
            return
        L_0x014f:
            java.lang.String r6 = "show_update_dialog"
            boolean r6 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getBooleanExtra(r0, r6, r9)
            r7 = 2
            if (r6 == 0) goto L_0x019f
            r6 = -1
            java.lang.String r11 = "update_type"
            int r11 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getIntExtra(r0, r11, r6)
            if (r11 != r6) goto L_0x0168
            java.lang.String r6 = "showUpdateDialog is true, but updateType is -1"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r6)
            goto L_0x019f
        L_0x0168:
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 405(0x195, double:2.0E-321)
            r15 = 28
            r17 = 1
            r19 = 1
            r12 = r6
            r12.idkeyStat(r13, r15, r17, r19)
            s72.b r12 = s72.C90149c.f258834a
            if (r12 == 0) goto L_0x019f
            r12 = 2131830389(0x7f112675, float:1.9293774E38)
            com.tencent.mm.sandbox.updater.Updater r15 = com.tencent.p014mm.sandbox.updater.Updater.m105888k(r8, r12, r10)
            if (r15 != 0) goto L_0x0184
            goto L_0x019f
        L_0x0184:
            r13 = 405(0x195, double:2.0E-321)
            if (r11 != r7) goto L_0x018b
            r16 = 29
            goto L_0x018d
        L_0x018b:
            r16 = 30
        L_0x018d:
            r18 = 1
            r20 = 1
            r12 = r6
            r6 = r15
            r15 = r16
            r17 = r18
            r19 = r20
            r12.idkeyStat(r13, r15, r17, r19)
            r6.mo119327l(r11, r9)
        L_0x019f:
            java.lang.String r6 = "Main_User"
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getStringExtra(r0, r6)
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getStringExtra(r0, r3)
            java.lang.Object[] r12 = new java.lang.Object[r5]
            r12[r9] = r6
            java.lang.String r13 = "[handleJump] user:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r13, r12)
            r12 = 3
            java.lang.String r13 = ""
            if (r6 == 0) goto L_0x01e5
            boolean r14 = r6.equals(r13)
            if (r14 != 0) goto L_0x01e5
            eb0.c r14 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r14 = r14.mo105908w()
            com.tencent.mm.storage.i2 r14 = (com.tencent.p014mm.storage.C44660i2) r14
            com.tencent.mm.storage.h2 r14 = r14.mo69771j(r6)
            if (r14 == 0) goto L_0x01d2
            int r15 = r14.mo108786G2()
            goto L_0x01d3
        L_0x01d2:
            r15 = 0
        L_0x01d3:
            java.lang.Object[] r10 = new java.lang.Object[r12]
            r10[r9] = r6
            r10[r5] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            r10[r7] = r14
            java.lang.String r14 = "[oneliang] user:%s, conversation :%s, unReadCount:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r14, r10)
            goto L_0x01e6
        L_0x01e5:
            r15 = 0
        L_0x01e6:
            if (r15 != 0) goto L_0x01ee
            java.lang.String r10 = "pushcontent_unread_count"
            int r15 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getIntExtra(r0, r10, r9)
        L_0x01ee:
            com.tencent.p014mm.p136ui.MMAppMgr.m85986f()
            com.tencent.mm.autogen.events.BakPcCancelAuthEvent r10 = new com.tencent.mm.autogen.events.BakPcCancelAuthEvent
            r10.<init>()
            r10.publish()
            java.lang.String r10 = "Intro_Is_Muti_Talker"
            boolean r10 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getBooleanExtra(r0, r10, r5)
            java.lang.Object[] r14 = new java.lang.Object[r7]
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r10)
            r14[r9] = r17
            java.lang.Integer r17 = java.lang.Integer.valueOf(r15)
            r14[r5] = r17
            java.lang.String r7 = "handleJump, isMutiTalker:%b, unReadCount:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r7, r14)
            if (r10 != 0) goto L_0x0232
            if (r15 <= 0) goto L_0x0232
            java.lang.String r7 = "Intro_Bottle_unread_count"
            int r7 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getIntExtra(r0, r7, r9)
            if (r7 <= 0) goto L_0x0232
            java.lang.Object[] r14 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r14[r9] = r7
            java.lang.String r7 = "handleJump, bottleReadCnt :%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r7, r14)
            java.lang.String r7 = "bottle"
            java.lang.String r14 = ".ui.BottleConversationUI"
            ke3.C88144b.m109789g(r8, r7, r14)
        L_0x0232:
            java.lang.String r7 = "Chat_Mode"
            java.lang.String r14 = "new_msg_nofification"
            java.lang.String r15 = "chat_from_scene"
            java.lang.String r12 = ".ui.bizchat.BizChatConversationUI"
            java.lang.String r9 = "Contact_User"
            if (r10 != 0) goto L_0x03fa
            boolean r10 = com.tencent.p014mm.storage.C72996z1.m85853x5(r6)
            java.lang.String r11 = ".ui.ReaderAppUI"
            java.lang.String r5 = "readerapp"
            java.lang.String r4 = "type"
            if (r10 == 0) goto L_0x0266
            java.lang.String r1 = "handleJump, isReaderAppNewsHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r1.addFlags(r2)
            r2 = 20
            r1.putExtra(r4, r2)
            r2 = 0
            ke3.C88144b.m109791i(r8, r5, r11, r1, r2)
        L_0x0263:
            r3 = 0
            goto L_0x0503
        L_0x0266:
            boolean r10 = com.tencent.p014mm.storage.C72996z1.m85854y5(r6)
            if (r10 == 0) goto L_0x0285
            java.lang.String r1 = "handleJump, isReaderAppWeiboHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r1.addFlags(r2)
            r2 = 11
            r1.putExtra(r4, r2)
            r2 = 0
            ke3.C88144b.m109791i(r8, r5, r11, r1, r2)
            goto L_0x0263
        L_0x0285:
            java.lang.String r2 = "MainUI_User_Last_Msg_Type"
            r4 = 34
            int r2 = r0.getIntExtra(r2, r4)
            java.lang.String r5 = "MainUI_User_Last_Msg_BgNotify_From"
            java.lang.String r5 = r0.getStringExtra(r5)
            boolean r10 = android.text.TextUtils.isEmpty(r5)
            if (r10 != 0) goto L_0x02cc
            boolean r10 = p285zh.C119114c.f356684a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "noteAddMsgNotify click: type="
            r10.append(r11)
            r10.append(r2)
            java.lang.String r11 = ", from="
            r10.append(r11)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            java.lang.String r10 = "MicroMsg.NotifyPowerInspector"
            p285zh.C119114c.m167920e(r10, r5)
            zh.c$$e r5 = p285zh.C119114c.f356700q
            boolean r10 = r5.mo183788b()
            if (r10 != 0) goto L_0x02c5
            boolean r10 = p285zh.C119114c.f356685b
            if (r10 != 0) goto L_0x02cc
        L_0x02c5:
            java.lang.String r10 = java.lang.String.valueOf(r2)
            r5.mo183789c(r10)
        L_0x02cc:
            if (r2 != r4) goto L_0x02d0
            r2 = 2
            goto L_0x02d1
        L_0x02d0:
            r2 = 1
        L_0x02d1:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r4.putInt(r7, r2)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getStringExtra(r0, r3)
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x02f9
            r2 = 1
            r4.putInt(r15, r2)
            java.lang.String r3 = "key_can_show_message_float_ball"
            r4.putBoolean(r3, r2)
            java.lang.String r2 = "MainUI_FromFinderNotification"
            r3 = 0
            boolean r5 = r0.getBooleanExtra(r2, r3)
            r4.putBoolean(r2, r5)
            r0.removeExtra(r2)
        L_0x02f9:
            com.tencent.mm.ui.LauncherUI r2 = getInstance()
            if (r2 == 0) goto L_0x0263
            di3.d r1 = di3.C86312j.m106911c(r1)
            rn.v r1 = (p227rn.C48053v) r1
            boolean r1 = r1.mo72614OE(r6)
            if (r1 == 0) goto L_0x031f
            r0.putExtra(r9, r6)
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)
            r1 = 4
            java.lang.String r2 = "biz_chat_from_scene"
            r0.putExtra(r2, r1)
            r1 = 0
            ke3.C88144b.m109801s(r8, r12, r0, r1)
            goto L_0x0263
        L_0x031f:
            boolean r1 = rb0.C47984k.m53339m(r6)
            if (r1 == 0) goto L_0x035e
            ug.c r1 = rb0.C47984k.m53328b(r6)
            if (r1 != 0) goto L_0x032d
            r1 = 0
            goto L_0x0331
        L_0x032d:
            java.lang.String r1 = r1.mo72807B()
        L_0x0331:
            if (r1 != 0) goto L_0x0334
            goto L_0x0335
        L_0x0334:
            r13 = r1
        L_0x0335:
            java.lang.String r1 = "rawUrl"
            r0.putExtra(r1, r13)
            java.lang.String r1 = "useJs"
            r2 = 1
            r0.putExtra(r1, r2)
            java.lang.String r1 = "srcUsername"
            r0.putExtra(r1, r6)
            java.lang.String r1 = "bizofstartfrom"
            java.lang.String r2 = "enterpriseHomeSubBrand"
            r0.putExtra(r1, r2)
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)
            java.lang.String r1 = "webview"
            java.lang.String r2 = ".ui.tools.WebViewUI"
            r3 = 0
            ke3.C88144b.m109791i(r8, r1, r2, r0, r3)
            goto L_0x0263
        L_0x035e:
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85804J4(r6)
            if (r3 == 0) goto L_0x03c4
            r0.putExtra(r9, r6)
            r0.addFlags(r1)
            java.lang.String r1 = "app_brand_conversation_from_scene"
            r2 = 3
            r0.putExtra(r1, r2)
            java.lang.String r1 = "finish_direct"
            r2 = 1
            r0.putExtra(r1, r2)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r1 != 0) goto L_0x038d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r1 != 0) goto L_0x038d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r1 != 0) goto L_0x038d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r1 == 0) goto L_0x038b
            goto L_0x038d
        L_0x038b:
            r5 = 0
            goto L_0x038e
        L_0x038d:
            r5 = 1
        L_0x038e:
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.h r1 = (h81.C32735h) r1
            if (r1 == 0) goto L_0x039e
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_android_appbrand_contact_support_send_video
            boolean r5 = r1.mo58784wf(r2, r5)
        L_0x039e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "isSupportSendVideo#get, "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.AppBrandContactABTests"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            if (r5 != 0) goto L_0x03bc
            java.lang.String r1 = "key_need_send_video"
            r2 = 0
            r4.putBoolean(r1, r2)
        L_0x03bc:
            java.lang.String r1 = ".ui.conversation.AppBrandServiceConversationUI"
            r2 = 0
            ke3.C88144b.m109801s(r8, r1, r0, r2)
            goto L_0x0263
        L_0x03c4:
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85846q5(r6)
            if (r1 == 0) goto L_0x03f4
            java.lang.String r1 = "opencustomerservicemsg"
            r0.putExtra(r9, r1)
            java.lang.String r1 = "open_im_kefu_chatting_username"
            r0.putExtra(r1, r6)
            java.lang.String r1 = "open_im_kefu_jump_chatting"
            r3 = 1
            r0.putExtra(r1, r3)
            java.lang.String r1 = "open_im_kefu_conversation_list_ui_from_scene"
            r3 = 2
            r0.putExtra(r1, r3)
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)
            java.lang.String r1 = ".ui.conversation.OpenImKefuServiceConversationUI"
            r3 = 0
            ke3.C88144b.m109801s(r8, r1, r0, r3)
            r1 = 2130772139(0x7f0100ab, float:1.7147388E38)
            r3 = 0
            r2.overridePendingTransition(r3, r1)
            goto L_0x0503
        L_0x03f4:
            r3 = 0
            r2.startChatting(r6, r4, r3)
            goto L_0x0503
        L_0x03fa:
            r3 = 0
            java.lang.String r4 = "From_fail_notify"
            boolean r4 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getBooleanExtra(r0, r4, r3)
            if (r4 == 0) goto L_0x047d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r2 != 0) goto L_0x0445
            com.tencent.mm.ui.LauncherUI r2 = getInstance()
            if (r2 == 0) goto L_0x0442
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r5 = "resend_fail_messages"
            boolean r5 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getBooleanExtra(r0, r5, r3)
            r4.putBoolean(r7, r5)
            di3.d r1 = di3.C86312j.m106911c(r1)
            rn.v r1 = (p227rn.C48053v) r1
            boolean r1 = r1.mo72614OE(r6)
            if (r1 == 0) goto L_0x043c
            r0.putExtra(r9, r6)
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)
            r1 = 4
            java.lang.String r2 = "biz_chat_from_scene"
            r0.putExtra(r2, r1)
            r1 = 0
            ke3.C88144b.m109801s(r8, r12, r0, r1)
            goto L_0x0442
        L_0x043c:
            r1 = 0
            r2.startChatting(r6, r4, r1)
            goto L_0x0263
        L_0x0442:
            r1 = 0
            goto L_0x0263
        L_0x0445:
            r1 = 0
            java.lang.String r2 = "jump_sns_from_notify"
            boolean r2 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getBooleanExtra(r0, r2, r1)
            if (r2 == 0) goto L_0x0263
            hy.o0$a r2 = new hy.o0$a
            r2.<init>()
            r3 = 1
            r2.f223345a = r3
            java.lang.String r3 = "is_need_resend_sns"
            boolean r3 = r0.getBooleanExtra(r3, r1)
            r2.f223352h = r3
            java.lang.String r3 = "sns_resume_state"
            boolean r3 = r0.getBooleanExtra(r3, r1)
            r2.f223351g = r3
            java.lang.String r3 = "sns_timeline_NeedFirstLoadint"
            boolean r3 = r0.getBooleanExtra(r3, r1)
            r2.f223346b = r3
            java.lang.Class<hy.o0> r1 = p166hy.C98567o0.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            hy.o0 r1 = (p166hy.C98567o0) r1
            r3 = 2
            r4 = 0
            r1.yb0(r8, r4, r3, r2)
            goto L_0x0263
        L_0x047d:
            java.lang.String r3 = "biz_chat_need_to_jump_to_chatting_ui"
            r4 = 0
            boolean r3 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getBooleanExtra(r0, r3, r4)
            if (r3 == 0) goto L_0x04a6
            com.tencent.mm.ui.LauncherUI r2 = getInstance()
            if (r2 == 0) goto L_0x0263
            di3.d r1 = di3.C86312j.m106911c(r1)
            rn.v r1 = (p227rn.C48053v) r1
            boolean r1 = r1.mo72614OE(r6)
            if (r1 == 0) goto L_0x0263
            r0.putExtra(r9, r6)
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)
            r1 = 0
            ke3.C88144b.m109801s(r8, r12, r0, r1)
            goto L_0x0263
        L_0x04a6:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r1 != 0) goto L_0x04dc
            boolean r1 = r14.equals(r11)
            if (r1 == 0) goto L_0x04dc
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r4 = 0
            r3[r4] = r0
            java.lang.String r5 = "[handleJump] intent:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r5, r3)
            com.tencent.mm.ui.LauncherUI r3 = getInstance()
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r5.putInt(r15, r1)
            java.lang.String r7 = "key_can_show_message_float_ball"
            r5.putBoolean(r7, r1)
            if (r3 == 0) goto L_0x04d5
            r3.startChatting(r6, r5, r4)
            goto L_0x0263
        L_0x04d5:
            java.lang.String r1 = "LauncherUI.getInstance is null! "
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r1)
            goto L_0x0263
        L_0x04dc:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r1 != 0) goto L_0x0263
            java.lang.String r1 = "force_notify_type"
            java.lang.String r1 = r0.getStringExtra(r1)
            java.lang.String r2 = "force_notify_wxa_subscribemsg"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0263
            com.tencent.mm.ui.LauncherUI r1 = getInstance()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r3 = 7
            r2.putInt(r15, r3)
            if (r1 == 0) goto L_0x0263
            r3 = 0
            r1.startChatting(r6, r2, r3)
        L_0x0503:
            java.lang.String r1 = "kstyle_show_bind_mobile_afterauth"
            int r1 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getIntExtra(r0, r1, r3)
            if (r1 <= 0) goto L_0x052c
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "com.tencent.mm.plugin.account.bind.ui.BindMobileUI"
            r1.setClassName(r8, r2)
            java.lang.String r2 = "kstyle_bind_recommend_show"
            int r3 = r0.getIntExtra(r2, r3)
            r1.putExtra(r2, r3)
            java.lang.String r2 = "kstyle_bind_wording"
            android.os.Parcelable r0 = r0.getParcelableExtra(r2)
            java.lang.String r2 = "kstyle_bind_wording"
            r1.putExtra(r2, r0)
            com.tencent.p014mm.p136ui.MMWizardActivity.m7017L7(r8, r1)
        L_0x052c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.LauncherUI.mo101377Q7(android.content.Intent):void");
    }

    /* renamed from: R7 */
    public boolean mo101378R7() {
        NewChattingTabUI newChattingTabUI = this.chattingTabUI;
        if (newChattingTabUI != null) {
            return newChattingTabUI.mo101503i();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ce, code lost:
        if (r4 == false) goto L_0x00d0;
     */
    /* renamed from: S7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101379S7(boolean r14) {
        /*
            r13 = this;
            java.lang.String r0 = "MicroMsg.LauncherUI.LauncherUICheckPermissionHelper"
            r1 = 0
            if (r14 == 0) goto L_0x0013
            com.tencent.mm.ui.z0 r14 = r13.f214339o
            r14.getClass()
            java.lang.String r14 = "ingore check permission on init"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r14)
            r13.f214346v = r1
            goto L_0x00d4
        L_0x0013:
            boolean r14 = r13.f214346v
            if (r14 != 0) goto L_0x00d4
            com.tencent.mm.ui.z0 r14 = r13.f214339o
            boolean r2 = r14.f220803a
            r3 = 1
            if (r2 != 0) goto L_0x0021
        L_0x001e:
            r1 = 1
            goto L_0x00d0
        L_0x0021:
            r14.f220803a = r1
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            android.content.SharedPreferences r14 = r13.getSharedPreferences(r14, r1)
            java.lang.String r2 = "SP_PERMISSION_HAD_REQUEST_PERMISSION_STORAGE_1"
            boolean r4 = r14.getBoolean(r2, r1)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r6 = "SP_PERMISSION_HAD_REQUEST_PERMISSION_UID"
            int r5 = r14.getInt(r6, r5)
            if (r4 == 0) goto L_0x0047
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.pm.ApplicationInfo r7 = r7.getApplicationInfo()
            int r7 = r7.uid
            if (r7 == r5) goto L_0x0076
        L_0x0047:
            f40.e r7 = f40.C86709a0.m107523b()
            boolean r7 = r7.mo121115m()
            eb0.i3 r8 = eb0.C7624i3.f25910c
            java.lang.String r9 = ""
            java.lang.String r10 = "login_user_name"
            java.lang.String r8 = r8.mo19a(r10, r9)
            if (r7 != 0) goto L_0x0063
            boolean r7 = r8.equals(r9)
            if (r7 == 0) goto L_0x0063
            r7 = 1
            goto L_0x0064
        L_0x0063:
            r7 = 0
        L_0x0064:
            if (r7 == 0) goto L_0x008b
            f40.j r7 = f40.C86709a0.m107531m()
            j40.a r7 = r7.mo58407a()
            j40.b r7 = (j40.C87829b) r7
            boolean r7 = r7.mo71804b()
            if (r7 == 0) goto L_0x008b
        L_0x0076:
            r14 = 2
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r14[r1] = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r14[r3] = r1
            java.lang.String r1 = "ingore check permission on resume, %b, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r14)
            goto L_0x001e
        L_0x008b:
            java.lang.Class<aw.d> r4 = p447aw.C103918d.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            r7 = r4
            aw.d r7 = (p447aw.C103918d) r7
            r10 = 33
            java.lang.String r9 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            r8 = r13
            boolean r4 = r7.mo125788z1(r8, r9, r10, r11, r12)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            r5[r1] = r7
            java.lang.String r7 = "check resume, summerper checkPermission checkStorage[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r7, r5)
            android.content.SharedPreferences$Editor r0 = r14.edit()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r3)
            r0.apply()
            android.content.SharedPreferences$Editor r14 = r14.edit()
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.uid
            android.content.SharedPreferences$Editor r14 = r14.putInt(r6, r0)
            r14.apply()
            if (r4 != 0) goto L_0x001e
        L_0x00d0:
            r14 = r1 ^ 1
            r13.f214346v = r14
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.LauncherUI.mo101379S7(boolean):void");
    }

    /* renamed from: T7 */
    public final void mo101380T7() {
        Class<WelcomeActivity> cls = WelcomeActivity.class;
        Log.m105924i("MicroMsg.LauncherUI", "resumeLogoutJump");
        if (this.f214340p == null || !IntentUtil.getBooleanExtra(getIntent(), "LauncherUI.jump_from_uimode_check", false)) {
            String stringExtra = IntentUtil.getStringExtra(getIntent(), "LauncherUI.Shortcut.LaunchType");
            if (stringExtra != null) {
                if (stringExtra.equals("launch_type_scan_qrcode")) {
                    WC3DTouchHomeShortCutStruct wC3DTouchHomeShortCutStruct = new WC3DTouchHomeShortCutStruct();
                    wC3DTouchHomeShortCutStruct.f10090d = 2;
                    wC3DTouchHomeShortCutStruct.f10091e = 2;
                    wC3DTouchHomeShortCutStruct.mo86054n();
                    wC3DTouchHomeShortCutStruct.mo86056r();
                } else if (stringExtra.equals("launch_type_offline_wallet")) {
                    WC3DTouchHomeShortCutStruct wC3DTouchHomeShortCutStruct2 = new WC3DTouchHomeShortCutStruct();
                    wC3DTouchHomeShortCutStruct2.f10090d = 1;
                    wC3DTouchHomeShortCutStruct2.f10091e = 2;
                    wC3DTouchHomeShortCutStruct2.mo86054n();
                    wC3DTouchHomeShortCutStruct2.mo86056r();
                } else if (stringExtra.equals("launch_type_my_qrcode")) {
                    WC3DTouchHomeShortCutStruct wC3DTouchHomeShortCutStruct3 = new WC3DTouchHomeShortCutStruct();
                    wC3DTouchHomeShortCutStruct3.f10090d = 3;
                    wC3DTouchHomeShortCutStruct3.f10091e = 2;
                    wC3DTouchHomeShortCutStruct3.mo86054n();
                    wC3DTouchHomeShortCutStruct3.mo86056r();
                }
            }
            MMFragmentActivity$$c.m143992a();
            MMFragmentActivity$$c.m143992a();
            Context context = MMApplicationContext.getContext();
            C85811a5.m106025b(context);
            C85865h1.m106132b(context);
            C85930s4.m106242b(context);
            C85985z2.m106331c(context);
            C85878m2.m106215d(2);
            String a = C7624i3.f25910c.mo19a("login_user_name", "");
            if (C97625j3.m125820j() || !a.equals("")) {
                Log.m105919d("MicroMsg.ConfigStorageLogic", "clearLastAuthDeviceFlag:%s", Util.getStack());
                MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putInt("PREF_KEY_LAST_AUTH_FLAG", -1);
                Intent intent = this.f214340p;
                Log.m105925i("MicroMsg.LauncherUI", "resumeLogoutJump hasDoInit:%b needResetLaunchUI:%b formNotification:%b, ishold:%b", Boolean.valueOf(this.f214341q), Boolean.valueOf(intent != null && (intent.getFlags() & 67108864) == 67108864), Boolean.valueOf(IntentUtil.getBooleanExtra(this.f214340p, "Intro_Notify", false)), Boolean.valueOf(C86718e.m107551r()));
                Log.m105925i("MicroMsg.LauncherUI", "doOnResumeImp resumeLogoutJump hasCfgDefaultUin[%b]", Boolean.valueOf(C97625j3.m125820j()));
                C86718e.m107550n();
                if (IntentUtil.getBooleanExtra(getIntent(), "LauncherUI.From.Scaner.Shortcut", false)) {
                    this.f214343s = true;
                }
                Class<SettingsSwitchAccountUI> cls2 = SettingsSwitchAccountUI.class;
                if (Log.getLogLevel() <= 1) {
                    Log.m105919d("MicroMsg.LauncherUI", "jumpToLogin() called with: KJumpSwitchAccount = %s", Boolean.valueOf(IntentUtil.getBooleanExtra(this.f214340p, "LauncherUI.jump_switch_account", false)));
                    Log.m105919d("MicroMsg.LauncherUI", "jumpToLogin() called with: KSwitch = %s, hasDoneCreateImp = %s, isKickOffline = %s", Boolean.valueOf(IntentUtil.getBooleanExtra(this.f214340p, "Intro_Switch", false)), Boolean.valueOf(this.f214341q), Boolean.valueOf(C86718e.f251748x));
                    Log.m105919d("MicroMsg.LauncherUI", "jumpToLogin() called with: KJumpSwitchAccount = %s", Boolean.valueOf(IntentUtil.getBooleanExtra(this.f214340p, "LauncherUI.jump_switch_account", false)));
                }
                if (IntentUtil.getBooleanExtra(this.f214340p, "LauncherUI.jump_switch_account", false)) {
                    Log.m105924i("MicroMsg.LauncherUI", "launcher to switch account");
                    Log.m105925i("MicroMsg.LauncherUI", "switch to wxid %s", MMApplicationContext.getContext().getSharedPreferences("switch_account_preferences", 0).getString("last_switch_account_to_wx_username", ""));
                    Intent intent2 = new Intent();
                    intent2.setClass(this, cls2);
                    intent2.addFlags(536870912);
                    intent2.putExtra("key_scene", 1);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent2);
                    C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/LauncherUI", "switchAccount", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/ui/LauncherUI", "switchAccount", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    C88990b.m111197f(this);
                } else if (IntentUtil.getBooleanExtra(this.f214340p, "Intro_Switch", false) || this.f214341q || C86718e.f251748x) {
                    this.f214338n.getMainTabUI().mo101421e();
                    C86709a0.m107528h().mo121099j("[normal logout]");
                    Mars.onSingalCrash(0);
                    Log.m105924i("MicroMsg.LauncherUI", "checktask ConstantsUI.Intro.KSwitch kill myself.");
                    Log.appenderFlush();
                    finish();
                    Intent intent3 = new Intent(this, LauncherUI.class);
                    intent3.putExtra("key_errType", IntentUtil.getIntExtra(this.f214340p, "key_errType", 0));
                    intent3.putExtra("key_errCode", IntentUtil.getIntExtra(this.f214340p, "key_errCode", 0));
                    intent3.putExtra("key_errMsg", IntentUtil.getStringExtra(this.f214340p, "key_errMsg"));
                    intent3.addFlags(67108864);
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent3);
                    C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    Log.m105925i("MicroMsg.LauncherUI", "try to kill mm pid %d", Integer.valueOf(Process.myPid()));
                    MMAppMgr.m85989i();
                    int myPid = Process.myPid();
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar3.mo10233c(Integer.valueOf(myPid));
                    Object obj = new Object();
                    C117292a.m165358d(obj, aVar3.mo10232b(), "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    Process.killProcess(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(obj, "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                } else if (!IntentUtil.getBooleanExtra(this.f214340p, "LauncherUI.jump_switch_account", false)) {
                    String a2 = C7624i3.f25910c.mo19a("login_user_name", "");
                    Log.m105925i("MicroMsg.LauncherUI", "%s jumpToLogin", a2);
                    if (Util.isNullOrNil(a2)) {
                        Intent intent4 = new Intent(this, cls);
                        C9556a aVar4 = new C9556a();
                        aVar4.mo10233c(intent4);
                        C117292a.m165358d(this, aVar4.mo10232b(), "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((Intent) aVar4.mo10231a(0));
                        C117292a.m165359e(this, "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        C88990b.m111197f(this);
                    } else {
                        boolean z = MMApplicationContext.getContext().getSharedPreferences("switch_account_preferences", 0).getBoolean("last_logout_switch_account", false);
                        Log.m105925i("MicroMsg.LauncherUI", "switchAccount %s", Boolean.valueOf(z));
                        if (z) {
                            Intent intent5 = new Intent(this, cls2);
                            intent5.addFlags(536870912);
                            intent5.putExtra("key_scene", 2);
                            C9556a aVar5 = new C9556a();
                            aVar5.mo10233c(intent5);
                            C117292a.m165358d(this, aVar5.mo10232b(), "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            startActivity((Intent) aVar5.mo10231a(0));
                            C117292a.m165359e(this, "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            C88990b.m111198g(this);
                        } else {
                            int safeParseInt = Util.safeParseInt(C7624i3.f25910c.mo19a("last_login_use_voice", ""));
                            Log.m105924i("MicroMsg.LauncherUI", "pluginSwitch  " + safeParseInt);
                            Intent intent6 = new Intent();
                            intent6.putExtra("key_errType", IntentUtil.getIntExtra(this.f214340p, "key_errType", 0));
                            intent6.putExtra("key_errCode", IntentUtil.getIntExtra(this.f214340p, "key_errCode", 0));
                            intent6.putExtra("key_errMsg", IntentUtil.getStringExtra(this.f214340p, "key_errMsg"));
                            if (WeChatBrands.Business.Entries.MeSetSecurityVoicePrint.banned() || (safeParseInt & 131072) == 0) {
                                intent6.setClassName(this, "com.tencent.mm.plugin.account.ui.LoginPasswordUI");
                            } else {
                                intent6.setClassName(this, "com.tencent.mm.plugin.account.ui.LoginVoiceUI");
                            }
                            intent6.addFlags(536870912);
                            C9556a aVar6 = new C9556a();
                            aVar6.mo10233c(intent6);
                            C117292a.m165358d(this, aVar6.mo10232b(), "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            startActivity((Intent) aVar6.mo10231a(0));
                            C117292a.m165359e(this, "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            C88990b.m111198g(this);
                        }
                    }
                    C85405m.m105415e(8);
                    MMHandlerThread.removeRunnable(this.f214348x);
                    MMHandlerThread.postToMainThreadDelayed(this.f214348x, 2000);
                }
                C86718e.m107546E();
                return;
            }
            Intent intent7 = new Intent(this, cls);
            intent7.addFlags(536870912);
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(intent7);
            C117292a.m165358d(this, aVar7.mo10232b(), "com/tencent/mm/ui/LauncherUI", "resumeLogoutJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar7.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/ui/LauncherUI", "resumeLogoutJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C88990b.m111197f(this);
            Log.m105924i("MicroMsg.LauncherUI", "resumeLogoutJump but has not login and ret");
            MMHandlerThread.removeRunnable(this.f214348x);
            MMHandlerThread.postToMainThreadDelayed(this.f214348x, 2000);
            return;
        }
        Log.m105924i("MicroMsg.LauncherUI", "dancy uimode check from background, not jumpToLogin or welcome!");
    }

    public void closeChatting(boolean z) {
        ConversationListView conversationListView;
        C71323d dVar;
        if (this.chattingTabUI.mo101499e(z)) {
            HomeUI homeUI = this.f214338n;
            if (!this.chattingTabUI.f214587n.isSupportCustomActionBar()) {
                homeUI.mo101319j();
            }
            homeUI.f214288q.supportInvalidateOptionsMenu();
            if (C75592q0.m90762J().booleanValue()) {
                if (!C97625j3.m125811a()) {
                    Log.m105920e("MicroMsg.LauncherUI.HomeUI", "mmcore has not ready");
                } else {
                    Boolean valueOf = Boolean.valueOf(Util.nullAsFalse((Boolean) C97625j3.m125812b().mo105906u().mo119684e(340227, (Object) null)));
                    if (!valueOf.booleanValue() && !C74585x0.f219236n.booleanValue()) {
                        HomeUI.f214252R = Boolean.TRUE;
                    }
                    long currentTimeMillis = System.currentTimeMillis() - Util.nullAs((Long) C97625j3.m125812b().mo105906u().mo119684e(340240, (Object) null), 0);
                    Boolean valueOf2 = Boolean.valueOf(Util.nullAsFalse((Boolean) C97625j3.m125812b().mo105906u().mo119684e(340230, (Object) null)));
                    Boolean valueOf3 = Boolean.valueOf(Util.nullAsFalse((Boolean) C97625j3.m125812b().mo105906u().mo119684e(340228, (Object) null)));
                    Boolean valueOf4 = Boolean.valueOf(Util.nullAsFalse((Boolean) C97625j3.m125812b().mo105906u().mo119684e(340229, (Object) null)));
                    if (valueOf.booleanValue() && valueOf3.booleanValue() && valueOf4.booleanValue() && !valueOf2.booleanValue() && currentTimeMillis >= 432000000) {
                        HomeUI.f214253S = Boolean.TRUE;
                    }
                }
            }
            MainTabUI mainTabUI = homeUI.f214291t;
            if (mainTabUI.f214435e != 0 || !C86709a0.m107529k().f251779b.f256815j) {
                ((MMNotification) C97625j3.m125816f()).mo93212i(false);
            } else {
                ((MMNotification) C97625j3.m125816f()).mo93212i(true);
            }
            ViewGroup viewGroup = (ViewGroup) mainTabUI.f214431a.findViewById(C0966R.C0970id.f358506fj1);
            if (viewGroup != null) {
                viewGroup.setImportantForAccessibility(1);
            }
            MainUI mainUI = (MainUI) mainTabUI.f214445o.get(0);
            if (mainUI != null) {
                C74720p pVar = mainUI.f219483v;
                if (pVar != null) {
                    pVar.mo103888O();
                }
                mainUI.mo103817S();
            }
            C74931u0.m89763a(mainTabUI.f214431a, 3, mainTabUI.f214435e, "prepareCloseChatting");
            MainUI mainUI2 = (MainUI) mainTabUI.f214445o.get(0);
            if (mainUI2 != null) {
                mainUI2.getContentView();
                MMActivityController mMActivityController = mainUI2.mController;
                if (mMActivityController != null) {
                    mMActivityController.mo177074f0();
                }
                mainUI2.onHiddenChanged(false);
            }
            MainTabUI O7 = mo101375O7();
            O7.f214439i = Boolean.FALSE;
            MainUI mainUI3 = (MainUI) O7.f214445o.get(0);
            if (mainUI3 != null && (conversationListView = mainUI3.f219476o) != null && (dVar = conversationListView.f219352j) != null) {
                Log.m105924i("MicroMsg.TaskBarAnimController", "onChattingClose");
                ((C71331l) dVar).f206583S0 = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0199, code lost:
        if (r3 != false) goto L_0x01de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01e6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01e7 A[SYNTHETIC, Splitter:B:81:0x01e7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r12) {
        /*
            r11 = this;
            r0 = 2131307184(0x7f092ab0, float:1.8232588E38)
            android.view.View r0 = r11.findViewById(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x001b
            boolean r12 = super.dispatchKeyEvent(r12)
            return r12
        L_0x001b:
            com.tencent.mm.ui.NewChattingTabUI r0 = r11.chattingTabUI
            boolean r0 = r0.mo101503i()
            r3 = 4
            if (r0 == 0) goto L_0x004d
            com.tencent.mm.ui.NewChattingTabUI r0 = r11.chattingTabUI
            r0.getClass()
            int r4 = r12.getKeyCode()
            if (r4 != r3) goto L_0x003a
            int r4 = r12.getAction()
            if (r4 != 0) goto L_0x003a
            java.lang.Runnable r4 = r0.mStartChattingRunnable
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r4)
        L_0x003a:
            boolean r4 = r0.f214586m
            if (r4 == 0) goto L_0x0040
            r0 = 1
            goto L_0x004a
        L_0x0040:
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r0.f214587n
            int r4 = r12.getKeyCode()
            boolean r0 = r0.onKeyDown(r4, r12)
        L_0x004a:
            if (r0 == 0) goto L_0x004d
            return r2
        L_0x004d:
            int r0 = r12.getKeyCode()
            if (r0 != r3) goto L_0x006c
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106163T()
            if (r0 == 0) goto L_0x006c
            java.lang.Class<dv.c> r0 = p498dv.C75457c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            dv.c r0 = (p498dv.C75457c) r0
            aa2.b r0 = r0.mo105801Rv(r11)
            boolean r0 = r0.dispatchKeyEvent(r12)
            if (r0 == 0) goto L_0x006c
            return r2
        L_0x006c:
            com.tencent.mm.ui.HomeUI r0 = r11.f214338n
            r0.getClass()
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r12.getKeyCode()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r1] = r5
            int r5 = r12.getAction()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r2] = r5
            java.lang.String r5 = "MicroMsg.LauncherUI.HomeUI"
            java.lang.String r6 = "ui group onKeyDown, code:%d action:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r4)
            int r4 = p331dj.C107046f.f320450a
            int r4 = r12.getKeyCode()
            if (r4 != r3) goto L_0x00af
            int r4 = r12.getAction()
            if (r4 != r2) goto L_0x00af
            com.tencent.mm.ui.f3 r4 = r0.f214282k
            if (r4 == 0) goto L_0x00af
            boolean r4 = r4.mo104069c()
            if (r4 == 0) goto L_0x00af
            com.tencent.mm.ui.f3 r0 = r0.f214282k
            r0.mo104068a()
            goto L_0x01de
        L_0x00af:
            int r4 = r12.getKeyCode()
            r5 = 82
            if (r4 != r5) goto L_0x00c2
            int r4 = r12.getAction()
            if (r4 != r2) goto L_0x00c2
            r0.mo101322m()
            goto L_0x01de
        L_0x00c2:
            com.tencent.mm.ui.MainTabUI r4 = r0.f214291t
            com.tencent.mm.ui.MMFragment r4 = r4.mo101423g()
            if (r4 == 0) goto L_0x00d6
            int r5 = r12.getKeyCode()
            boolean r4 = r4.onKeyDown(r5, r12)
            if (r4 == 0) goto L_0x00d6
            goto L_0x01de
        L_0x00d6:
            int r4 = r12.getKeyCode()
            if (r4 != r3) goto L_0x01e3
            int r3 = r12.getAction()
            if (r3 != 0) goto L_0x01e3
            boolean r3 = eb0.C97625j3.m125811a()
            r4 = 0
            if (r3 == 0) goto L_0x019c
            f40.e r3 = f40.C86709a0.m107523b()
            boolean r3 = r3.f251765p
            if (r3 == 0) goto L_0x019c
            com.tencent.mm.sdk.systemservicecache.NetworkCache r3 = com.tencent.p014mm.sdk.systemservicecache.NetworkCache.INSTANCE
            com.tencent.mm.ui.MMFragmentActivity r5 = r0.f214288q
            boolean r3 = r3.isWapFromCache(r5)
            if (r3 == 0) goto L_0x019c
            com.tencent.mm.ui.MMFragmentActivity r3 = r0.f214288q
            com.tencent.mm.ui.HomeUI$28 r5 = new com.tencent.mm.ui.HomeUI$28
            r5.<init>()
            boolean r6 = eb0.C97625j3.m125811a()
            if (r6 != 0) goto L_0x0109
            goto L_0x012d
        L_0x0109:
            eb0.c r6 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r6 = r6.mo105906u()
            r7 = 65
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            java.lang.Object r6 = r6.mo119684e(r7, r8)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r7 = 5
            if (r6 < r7) goto L_0x0125
            goto L_0x012d
        L_0x0125:
            java.lang.String r7 = "show_wap_adviser"
            boolean r7 = com.tencent.p014mm.sdk.platformtools.MMEntryLock.lock(r7)
            if (r7 != 0) goto L_0x012f
        L_0x012d:
            r3 = 0
            goto L_0x0199
        L_0x012f:
            r7 = 2131496875(0x7f0c0fab, float:1.8617327E38)
            android.view.View r7 = android.view.View.inflate(r3, r7, r4)
            r8 = 2131310076(0x7f0935fc, float:1.8238454E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 2131833510(0x7f1132a6, float:1.9300104E38)
            r8.setText(r9)
            qo3.a r8 = new qo3.a
            r8.<init>()
            r9 = 2131821704(0x7f110488, float:1.9276159E38)
            android.content.res.Resources r10 = al3.C0086a.m38a(r3)
            java.lang.String r9 = r10.getString(r9)
            r8.f225644a = r9
            r8.f225627J = r7
            r7 = 2131821617(0x7f110431, float:1.9275982E38)
            android.content.res.Resources r9 = al3.C0086a.m38a(r3)
            java.lang.String r7 = r9.getString(r7)
            r8.f225663t = r7
            com.tencent.mm.ui.q1 r7 = new com.tencent.mm.ui.q1
            r7.<init>(r6)
            r8.f225620C = r7
            r8.f225668y = r1
            r6 = 2131833504(0x7f1132a0, float:1.9300092E38)
            android.content.res.Resources r7 = al3.C0086a.m38a(r3)
            java.lang.String r6 = r7.getString(r6)
            r8.f225664u = r6
            com.tencent.mm.ui.r1 r6 = new com.tencent.mm.ui.r1
            r6.<init>()
            r8.f225621D = r6
            com.tencent.mm.ui.s1 r6 = new com.tencent.mm.ui.s1
            r6.<init>(r5)
            r8.f225623F = r6
            qo3.g r5 = new qo3.g
            r6 = 2131887328(0x7f1204e0, float:1.940926E38)
            r5.<init>(r3, r6)
            r5.mo107525e(r8)
            r5.show()
            r3 = 1
        L_0x0199:
            if (r3 == 0) goto L_0x019c
            goto L_0x01de
        L_0x019c:
            com.tencent.mm.ui.MMFragmentActivity r3 = r0.f214288q
            int r3 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getBackgroundLimitType(r3)
            boolean r5 = eb0.C97625j3.m125811a()
            if (r5 == 0) goto L_0x01e0
            f40.e r5 = f40.C86709a0.m107523b()
            boolean r5 = r5.f251765p
            if (r5 == 0) goto L_0x01e0
            boolean r5 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isLimited(r3)
            if (r5 == 0) goto L_0x01e0
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r5 = r5.mo105906u()
            r6 = 16385(0x4001, float:2.296E-41)
            java.lang.Object r4 = r5.mo119684e(r6, r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsTrue(r4)
            if (r4 == 0) goto L_0x01e0
            com.tencent.mm.ui.MMFragmentActivity r4 = r0.f214288q
            com.tencent.mm.ui.HomeUI$29 r5 = new com.tencent.mm.ui.HomeUI$29
            r5.<init>(r3)
            com.tencent.mm.ui.HomeUI$30 r6 = new com.tencent.mm.ui.HomeUI$30
            r6.<init>()
            boolean r3 = com.tencent.p014mm.p136ui.MMAppMgr.m85991k(r4, r3, r5, r6)
            if (r3 == 0) goto L_0x01e0
        L_0x01de:
            r0 = 1
            goto L_0x01e4
        L_0x01e0:
            r0.mo101325p()
        L_0x01e3:
            r0 = 0
        L_0x01e4:
            if (r0 == 0) goto L_0x01e7
            return r2
        L_0x01e7:
            boolean r12 = super.dispatchKeyEvent(r12)     // Catch:{ Exception -> 0x01ec }
            return r12
        L_0x01ec:
            r12 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = r12.getMessage()
            r0[r1] = r2
            java.lang.String r2 = "MicroMsg.LauncherUI"
            java.lang.String r3 = "dispatch key event catch exception %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r3, r0)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r12, r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.LauncherUI.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public void finish() {
        super.finish();
        mo101374N7();
        Log.m105925i("MicroMsg.LauncherUI", "checktask Launcherui onfinish 0x%x,instance size %d, stack: %s", Integer.valueOf(hashCode()), Integer.valueOf(f214332A.size()), Util.getStack());
    }

    public boolean forceRemoveNoMatchOnPath() {
        this.chattingTabUI.getClass();
        return true;
    }

    public MMFragment getCurrentFragmet() {
        NewChattingTabUI newChattingTabUI = this.chattingTabUI;
        BaseChattingUIFragment baseChattingUIFragment = !newChattingTabUI.f214585l ? newChattingTabUI.f214587n : null;
        return baseChattingUIFragment == null ? super.getCurrentFragmet() : baseChattingUIFragment;
    }

    public HomeUI getHomeUI() {
        return this.f214338n;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        Bundle bundleExtra;
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent);
        Log.m105926v("MicroMsg.LauncherUI", "edw on activity result");
        NewChattingTabUI newChattingTabUI = this.chattingTabUI;
        if (i3 == 2001 || i3 == 30763 || i3 == 226 || i3 == 3001 || i3 == 30762 || i3 == 1111 || i3 == 229) {
            BaseChattingUIFragment baseChattingUIFragment = newChattingTabUI.f214587n;
            if (baseChattingUIFragment != null) {
                baseChattingUIFragment.onActivityResult(i3, i4, intent2);
            }
        } else {
            newChattingTabUI.getClass();
        }
        int i5 = 65535 & i3;
        Log.m105929w("MicroMsg.LauncherUI.NewChattingTabUI", "check request code %d", Integer.valueOf(i5));
        if (!(i5 == 217 || i5 == 218 || i5 == 226) || newChattingTabUI.f214587n != null) {
            z = false;
        } else {
            Log.m105924i("MicroMsg.LauncherUI.NewChattingTabUI", "on select image ActivityResult. the chattingUI maybe kill in the background.");
            MMHandlerThread.removeRunnable(newChattingTabUI.f214589p);
            NewChattingTabUI.C73130g gVar = newChattingTabUI.f214589p;
            gVar.f214608d = 0;
            gVar.f214609e = i3;
            gVar.f214610f = i4;
            gVar.f214611g = intent2;
            MMHandlerThread.postToMainThread(gVar);
            z = true;
        }
        if (!z) {
            HomeUI homeUI = this.f214338n;
            if (homeUI.f214272a) {
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_NEED_BIRTHDAY_BOOLEAN_SYNC;
                if (i3 != 1) {
                    if (i3 == 22722) {
                        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null);
                        Log.m105925i("MicroMsg.LauncherUI.HomeUI", "showAgreements %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
                        Bundle bundleExtra2 = intent2 != null ? intent2.getBundleExtra("result_data") : null;
                        if (bundleExtra2 == null || !bundleExtra2.getString("go_next", "").equals("agree_privacy")) {
                            Log.m105924i("MicroMsg.LauncherUI.HomeUI", "disagree privacy policy");
                            C86709a0.m107524d().mo123460f(new C45655c(2, str, ""));
                            C115669n.INSTANCE.idkeyStat(712, 5, 1, false);
                        } else {
                            Log.m105924i("MicroMsg.LauncherUI.HomeUI", "agree privacy policy");
                            C115669n.INSTANCE.idkeyStat(712, 4, 1, false);
                            C86709a0.m107524d().mo123460f(new C45655c(1, str, ""));
                            if (C76850a.m92639k(str) && C86709a0.m107535s().mo121142i().mo119686g(aVar, false)) {
                                Log.m105924i("MicroMsg.LauncherUI.HomeUI", "needbirthday true");
                                MMHandlerThread.postToMainThreadDelayed(new Runnable() {
                                    public void run(
/*
Method generation error in method: com.tencent.mm.ui.HomeUI.32.run():void, dex: classes5.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mm.ui.HomeUI.32.run():void, class status: UNLOADED
                                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                    
*/
                                }, 100);
                            }
                        }
                    } else if (i3 == 22723) {
                        String str2 = (String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null);
                        Bundle bundleExtra3 = intent2 != null ? intent2.getBundleExtra("result_data") : null;
                        if (bundleExtra3 != null) {
                            if (bundleExtra3.getString("go_next", "").equals("birthdayComfirmOK")) {
                                Log.m105924i("MicroMsg.LauncherUI.HomeUI", "verify birthday ok");
                                C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.FALSE);
                            } else if (bundleExtra3.getString("go_next", "").equals("gdpr_confirm_logout")) {
                                Log.m105924i("MicroMsg.LauncherUI.HomeUI", "quit verify birthday after H5-warnning");
                                C86709a0.m107524d().mo123460f(new C45655c(2, str2, ""));
                                C115669n.INSTANCE.idkeyStat(712, 5, 1, false);
                            }
                        }
                    }
                    if (i3 == 65534 && i4 == -1) {
                        MMEntryLock.unlock("welcome_page_show");
                        C75681p0.m90934a(homeUI.f214288q, true);
                        MMAppMgr.m85986f();
                        MMAppMgr.m85985e(homeUI.f214288q, true);
                        homeUI.f214288q.finish();
                    } else if (i3 == 30764 && intent2 != null && (bundleExtra = intent2.getBundleExtra("result_data")) != null && bundleExtra.getString("go_next", "").equals("gdpr_auth_location")) {
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, Boolean.TRUE);
                        ((C103918d) C86312j.m106911c(C103918d.class)).mo125790zt(homeUI.f214288q, "android.permission.ACCESS_FINE_LOCATION", 66);
                    }
                }
            }
        }
    }

    public void onBackPressed() {
        View findViewById = findViewById(C0966R.C0970id.mfj);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            super.onBackPressed();
            return;
        }
        Log.m105924i("MicroMsg.LauncherUI", "onBackPressed");
        MMFragmentActivity mMFragmentActivity = this.f214338n.f214288q;
        if (mMFragmentActivity != null) {
            try {
                mMFragmentActivity.moveTaskToBack(true);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.LauncherUI.HomeUI", e, "", new Object[0]);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        HomeUI homeUI = this.f214338n;
        C78538u.m94867c(homeUI.f214288q, homeUI.f214263I, 0);
        if (C76866m.m92674c() || OnePlus.isOnePlus() || C76866m.m92675d()) {
            OPPOFloatWindowModeChangedEvent oPPOFloatWindowModeChangedEvent = new OPPOFloatWindowModeChangedEvent();
            oPPOFloatWindowModeChangedEvent.f193773d.f193774a = configuration.toString().contains("mWindowingMode=100");
            Log.m105925i("MicroMsg.LauncherUI", "onConfigurationChanged: OPPO isInMultiWindowMode:%s ", Boolean.valueOf(oPPOFloatWindowModeChangedEvent.f193773d.f193774a));
            oPPOFloatWindowModeChangedEvent.publish();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x02d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r9 = r17
            f40.g0 r0 = f40.C86732g0.m107592c()
            long r0 = r0.f251793e
            int[] r2 = p787ai.C79546a.f233229a
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            r0 = 0
            r4 = 200(0xc8, double:9.9E-322)
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x001d
            r1 = 512(0x200, float:7.175E-43)
            p787ai.C79546a.m96577a(r1)
            p787ai.C79546a.f233251w = r0
        L_0x001d:
            boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r1 == 0) goto L_0x002a
            r1 = 2131886537(0x7f1201c9, float:1.9407656E38)
            r9.setTheme(r1)
            goto L_0x0030
        L_0x002a:
            r1 = 2131886538(0x7f1201ca, float:1.9407658E38)
            r9.setTheme(r1)
        L_0x0030:
            java.lang.Class<bm3.a> r1 = bm3.C0329a.class
            com.tencent.mm.ui.LauncherUI$f r2 = new com.tencent.mm.ui.LauncherUI$f
            r2.<init>()
            f40.C86709a0.m107532n(r1, r2)
            java.lang.System.currentTimeMillis()
            java.lang.String r1 = "MicroMsg.LauncherUI"
            java.lang.String r2 = "start time check checktask onCreate 0x%x, taskid %d, task:%s"
            r10 = 3
            java.lang.Object[] r3 = new java.lang.Object[r10]
            int r4 = r17.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r0] = r4
            int r4 = r17.getTaskId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r11 = 1
            r3[r11] = r4
            com.tencent.mm.sdk.platformtools.Util$ActivityTaskInfo r4 = com.tencent.p014mm.sdk.platformtools.Util.getActivityTaskInfo(r17)
            r12 = 2
            r3[r12] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r3)
            super.onCreate(r18)
            java.lang.Class<xv.t> r1 = p757xv.C38852t.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            xv.t r1 = (p757xv.C38852t) r1
            java.lang.Class r2 = r17.getClass()
            java.lang.String r2 = r2.getName()
            r1.mo56319gG(r2)
            android.view.Window r1 = r17.getWindow()
            android.view.View r1 = r1.getDecorView()
            r2 = 1280(0x500, float:1.794E-42)
            r1.setSystemUiVisibility(r2)
            long r1 = java.lang.System.currentTimeMillis()
            int r3 = r17.getTaskId()
            java.lang.String r4 = r17.getPackageName()
            android.content.Intent r5 = r17.getIntent()
            java.lang.String r6 = "MicroMsg.LauncherUI"
            if (r5 == 0) goto L_0x00aa
            java.lang.String r7 = "absolutely_exit"
            boolean r5 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getBooleanExtra(r5, r7, r0)
            if (r5 == 0) goto L_0x00aa
            java.lang.String r5 = "checktask checkInstance isWantToRestart"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            r5 = 1
            goto L_0x00ab
        L_0x00aa:
            r5 = 0
        L_0x00ab:
            java.util.ArrayList<java.lang.ref.WeakReference<com.tencent.mm.ui.LauncherUI>> r7 = f214333B
            java.util.Iterator r7 = r7.iterator()
        L_0x00b1:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00cf
            java.lang.Object r8 = r7.next()
            java.lang.ref.WeakReference r8 = (java.lang.ref.WeakReference) r8
            java.lang.Object r8 = r8.get()
            com.tencent.mm.ui.LauncherUI r8 = (com.tencent.p014mm.p136ui.LauncherUI) r8
            if (r8 == 0) goto L_0x00b1
            java.lang.Object[] r13 = new java.lang.Object[r11]
            r13[r0] = r8
            java.lang.String r8 = "Check launcher instance found one %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r13)
            goto L_0x00b1
        L_0x00cf:
            r7 = 0
            r13 = 5
            if (r5 != 0) goto L_0x01df
            java.util.ArrayList<com.tencent.mm.ui.LauncherUI> r14 = f214332A
            java.util.Iterator r14 = r14.iterator()
        L_0x00d9:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x01df
            java.lang.Object r15 = r14.next()
            com.tencent.mm.ui.LauncherUI r15 = (com.tencent.p014mm.p136ui.LauncherUI) r15
            int r8 = r15.getTaskId()
            if (r8 == r3) goto L_0x01dc
            java.lang.Object[] r7 = new java.lang.Object[r10]
            int r8 = r15.hashCode()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r0] = r8
            int r8 = r15.getTaskId()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r11] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r7[r12] = r8
            java.lang.String r8 = "checktask checkInstance 0x%x diff taskid taskid %d, nowtaskid:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r7)
            android.app.ActivityManager$RunningTaskInfo r7 = com.tencent.p014mm.sdk.platformtools.Util.getCurrentTaskInfo(r9, r3)
            if (r7 == 0) goto L_0x01cb
            java.lang.Object[] r8 = new java.lang.Object[r13]
            int r13 = r7.id
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r8[r0] = r13
            android.content.ComponentName r13 = r7.topActivity
            java.lang.String r13 = r13.getClassName()
            r8[r11] = r13
            android.content.ComponentName r13 = r7.baseActivity
            java.lang.String r13 = r13.getClassName()
            r8[r12] = r13
            int r13 = r7.numActivities
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r8[r10] = r13
            int r13 = r7.numRunning
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r16 = 4
            r8[r16] = r13
            java.lang.String r13 = "checktask task diff id %d, topactivity %s, baseactivity %s, numtotal %d, numrunning %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r13, r8)
            android.content.ComponentName r8 = r7.baseActivity
            java.lang.String r8 = r8.getPackageName()
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x01c2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "checktask base activity is not mm, finish! info.baseActivity.getPackageName()  "
            r1.append(r2)
            android.content.ComponentName r2 = r7.baseActivity
            java.lang.String r2 = r2.getPackageName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)
            r17.finish()
            int r1 = r15.getTaskId()
            android.app.ActivityManager$RunningTaskInfo r1 = com.tencent.p014mm.sdk.platformtools.Util.getCurrentTaskInfo(r9, r1)
            if (r1 == 0) goto L_0x0250
            java.lang.String r1 = "checktask startLauncherUI with FLAG_ACTIVITY_NEW_TASK"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.tencent.mm.ui.LauncherUI> r2 = com.tencent.p014mm.p136ui.LauncherUI.class
            r1.<init>(r9, r2)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r2)
            k20.a r13 = new k20.a
            r13.<init>()
            r13.mo10233c(r1)
            java.lang.Object[] r2 = r13.mo10232b()
            java.lang.String r3 = "com/tencent/mm/ui/LauncherUI"
            java.lang.String r4 = "checkInstance"
            java.lang.String r5 = "()Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r17
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r13.mo10231a(r0)
            android.content.Intent r1 = (android.content.Intent) r1
            r9.startActivity(r1)
            java.lang.String r2 = "com/tencent/mm/ui/LauncherUI"
            java.lang.String r3 = "checkInstance"
            java.lang.String r4 = "()Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r17
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0250
        L_0x01c2:
            r15.finish()
            java.util.ArrayList<com.tencent.mm.ui.LauncherUI> r8 = f214332A
            r8.remove(r15)
            goto L_0x01dc
        L_0x01cb:
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r1[r0] = r2
            java.lang.String r2 = "checktask cannot found curren taskinfo %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r2, r1)
            r17.finish()
            goto L_0x0250
        L_0x01dc:
            r13 = 5
            goto L_0x00d9
        L_0x01df:
            java.util.ArrayList<com.tencent.mm.ui.LauncherUI> r4 = f214332A
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x028f
            if (r7 != 0) goto L_0x01ed
            android.app.ActivityManager$RunningTaskInfo r7 = com.tencent.p014mm.sdk.platformtools.Util.getCurrentTaskInfo(r9, r3)
        L_0x01ed:
            if (r7 == 0) goto L_0x0271
            android.content.ComponentName r4 = r7.baseActivity
            if (r4 == 0) goto L_0x0271
            java.lang.String r3 = r4.getClassName()
            android.content.ComponentName r4 = r7.baseActivity
            java.lang.String r4 = r4.getClassName()
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]
            int r13 = r7.id
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r8[r0] = r13
            r8[r11] = r4
            r8[r12] = r3
            int r13 = r7.numActivities
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r8[r10] = r13
            int r13 = r7.numRunning
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14 = 4
            r8[r14] = r13
            java.lang.String r13 = "checktask now info id %d, topactivity %s, baseactivity %s, numtotal %d, numrunning %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r13, r8)
            android.content.ComponentName r8 = r17.getComponentName()
            java.lang.String r8 = r8.getClassName()
            int r7 = r7.numActivities
            if (r7 <= r11) goto L_0x0252
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0252
            boolean r3 = r8.equals(r4)
            if (r3 == 0) goto L_0x0252
            r17.finish()
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.util.ArrayList<com.tencent.mm.ui.LauncherUI> r2 = f214332A
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r0] = r2
            java.lang.String r2 = "checktask finish this mainTabUI, and use the last LauncherUI instanceCount: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r2, r1)
        L_0x0250:
            r1 = 0
            goto L_0x02c9
        L_0x0252:
            java.lang.Object[] r3 = new java.lang.Object[r12]
            java.util.ArrayList<com.tencent.mm.ui.LauncherUI> r4 = f214332A
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r0] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
            r3[r11] = r4
            java.lang.String r4 = "checktask should not here without isWantToRestart is true launcherUIInstances.clear LauncherUI instanceCount: %d, isWantToRestart %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r4, r3)
            java.util.ArrayList<com.tencent.mm.ui.LauncherUI> r3 = f214332A
            r3.clear()
            goto L_0x028f
        L_0x0271:
            java.lang.Object[] r4 = new java.lang.Object[r12]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r0] = r3
            java.util.ArrayList<com.tencent.mm.ui.LauncherUI> r3 = f214332A
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r11] = r3
            java.lang.String r3 = "checktask can not found taskid %d,  LauncherUI instanceCount: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r3, r4)
            java.util.ArrayList<com.tencent.mm.ui.LauncherUI> r3 = f214332A
            r3.clear()
        L_0x028f:
            java.util.ArrayList<com.tencent.mm.ui.LauncherUI> r3 = f214332A
            r3.add(r9)
            java.util.ArrayList<java.lang.ref.WeakReference<com.tencent.mm.ui.LauncherUI>> r3 = f214333B
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r9)
            r3.add(r4)
            java.lang.Object[] r3 = new java.lang.Object[r10]
            java.util.ArrayList<com.tencent.mm.ui.LauncherUI> r4 = f214332A
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r0] = r4
            java.util.ArrayList<java.lang.ref.WeakReference<com.tencent.mm.ui.LauncherUI>> r4 = f214333B
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r11] = r4
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r1
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r3[r12] = r1
            java.lang.String r1 = "checktask Launcherui oncreate checkInstance size %d weak check %d, use time %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r3)
            r1 = 1
        L_0x02c9:
            if (r1 != 0) goto L_0x02d3
            java.lang.String r0 = "MicroMsg.LauncherUI"
            java.lang.String r1 = "onCreate checkInstance false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        L_0x02d3:
            android.content.Intent r1 = r17.getIntent()
            if (r1 == 0) goto L_0x02f0
            android.content.Intent r1 = r17.getIntent()
            java.lang.String r2 = "LauncherUI.jump_from_uimode_check"
            boolean r1 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getBooleanExtra(r1, r2, r0)
            if (r1 == 0) goto L_0x02f0
            java.lang.String r0 = "MicroMsg.LauncherUI"
            java.lang.String r1 = "dancy onCreate uimode check from background, finish LauncherUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r17.finish()
            return
        L_0x02f0:
            java.lang.String r1 = "MicroMsg.LauncherUI"
            java.lang.String r2 = "onCreate normally"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            com.tencent.mm.app.z0 r1 = com.tencent.p014mm.app.C80637z0.INSTANCE
            com.tencent.mm.app.z0$h r2 = com.tencent.p014mm.app.C80637z0.C80646h.UNTIL_LAUNCHER_UI_ON_CREATE_BEGIN
            r1.mo112374e(r2)
            com.tencent.mm.ui.NewChattingTabUI r2 = r9.chattingTabUI
            r2.f214574a = r9
            com.tencent.mm.ui.w2 r3 = new com.tencent.mm.ui.w2
            r3.<init>(r2)
            java.util.ArrayList<re.a> r2 = p1028re.C89931d.f258424a
            monitor-enter(r2)
            r2.add(r3)     // Catch:{ all -> 0x04c2 }
            monitor-exit(r2)
            androidx.lifecycle.j r2 = r17.getLifecycle()
            com.tencent.matrix.memory.canary.trim.TrimMemoryNotifier$addProcessBackgroundTrimCallback$3 r4 = new com.tencent.matrix.memory.canary.trim.TrimMemoryNotifier$addProcessBackgroundTrimCallback$3
            r4.<init>(r3)
            r2.addObserver(r4)
            com.tencent.mm.ui.HomeUI r2 = r9.f214338n
            com.tencent.mm.ui.NewChattingTabUI r3 = r9.chattingTabUI
            r2.f214288q = r9
            r2.f214289r = r3
            com.tencent.mm.ui.MainTabUI r3 = r2.f214291t
            r3.f214431a = r9
            r3.f214433c = r2
            com.tencent.mm.ui.MainTabUnreadMgr r4 = r3.f214432b
            r4.f214450d = r9
            r4.f214451e = r2
            java.lang.Class<ht1.a5> r5 = ht1.C76243a5.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ht1.a5 r5 = (ht1.C76243a5) r5
            ht1.c4 r5 = r5.mo13239iX()
            r4.f214452f = r5
            r3.f214438h = r2
            com.tencent.mm.ui.GlobalAlertMgr r3 = new com.tencent.mm.ui.GlobalAlertMgr
            r3.<init>(r9, r2)
            r2.f214290s = r3
            com.tencent.p014mm.booter.NotifyReceiver.m98644b()
            com.tencent.mm.ui.MMFragmentActivity r3 = r2.f214288q
            wc3.C78538u.m94870f(r3)
            androidx.appcompat.app.ActionBar r3 = r17.getSupportActionBar()
            r2.f214274c = r3
            r3 = 2131296436(0x7f0900b4, float:1.8210789E38)
            android.view.View r3 = r9.findViewById(r3)
            r2.f214275d = r3
            androidx.appcompat.app.ActionBar r2 = r2.f214274c
            if (r2 == 0) goto L_0x0363
            r2.mo91104o()
        L_0x0363:
            r9.setRequestedOrientation(r11)
            android.content.res.Resources r2 = r17.getResources()
            r3 = 2131101246(0x7f06063e, float:1.7814896E38)
            int r2 = r2.getColor(r3)
            android.graphics.Color.alpha(r2)
            eb0.i3 r2 = eb0.C7624i3.f25910c
            java.lang.String r3 = "login_user_name"
            java.lang.String r4 = ""
            java.lang.String r2 = r2.mo19a(r3, r4)
            android.content.Intent r3 = r17.getIntent()
            r9.f214340p = r3
            wc3.k0 r4 = r9.f214345u
            r4.getClass()
            java.lang.String r5 = "splash-hack-activity-recreate"
            boolean r3 = r3.getBooleanExtra(r5, r0)
            r4.f230023a = r3
            java.lang.Object[] r4 = new java.lang.Object[r12]
            java.lang.String r5 = "MicroMsg.LauncherUI"
            r4[r0] = r5
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4[r11] = r3
            java.lang.String r3 = "MicroMsg.SplashOptimizing"
            java.lang.String r5 = "[%s], recreating activity this time? %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r4)
            java.lang.String r3 = "MicroMsg.LauncherUI"
            java.lang.String r4 = "lastLoginName %s, hasCfgDefaultUin %s  isFirstTimeCreate %s"
            java.lang.Object[] r5 = new java.lang.Object[r10]
            r5[r0] = r2
            boolean r6 = eb0.C97625j3.m125820j()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5[r11] = r6
            boolean r6 = f214334C
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5[r12] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)
            boolean r3 = r17.mo101376P7()
            if (r3 == 0) goto L_0x03d0
            java.lang.String r0 = "MicroMsg.LauncherUI"
            java.lang.String r1 = "handleExitIntent return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        L_0x03d0:
            boolean r3 = f214334C
            if (r3 != 0) goto L_0x0402
            boolean r3 = eb0.C97625j3.m125820j()
            if (r3 != 0) goto L_0x03e2
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0402
        L_0x03e2:
            java.lang.String r2 = "MicroMsg.LauncherUI"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "start time check not isLauncherUIOnTop no welcomeearth create time from mmapplication=="
            r3.append(r4)
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = com.tencent.p014mm.app.C80589e.f235761b
            long r4 = r4 - r6
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            goto L_0x0495
        L_0x0402:
            java.lang.String r2 = "MicroMsg.LauncherUI"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "start time check not isLauncherUIOnTop create time from mmapplication=="
            r3.append(r4)
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = com.tencent.p014mm.app.C80589e.f235761b
            long r4 = r4 - r6
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r9.setRequestedOrientation(r11)
            boolean r2 = eb0.C97625j3.m125820j()
            eb0.i3 r3 = eb0.C7624i3.f25910c
            java.lang.String r4 = "login_user_name"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.mo19a(r4, r5)
            if (r2 != 0) goto L_0x043b
            boolean r2 = r3.equals(r5)
            if (r2 == 0) goto L_0x043b
            r2 = 1
            goto L_0x043c
        L_0x043b:
            r2 = 0
        L_0x043c:
            if (r2 != 0) goto L_0x0441
            com.tencent.p014mm.sdk.platformtools.ChannelUtil.isShowingGprsAlert = r0
            goto L_0x0495
        L_0x0441:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.shouldShowGprsAlert
            if (r2 == 0) goto L_0x0455
            boolean r2 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.isShowingGprsAlert
            if (r2 == 0) goto L_0x0455
            f214335D = r11
            com.tencent.mm.ui.y0 r2 = new com.tencent.mm.ui.y0
            r2.<init>(r9)
            boolean r2 = com.tencent.p014mm.p136ui.MMAppMgr.m85990j(r9, r2)
            goto L_0x0459
        L_0x0455:
            com.tencent.p014mm.p136ui.MMAppMgr.m85982b(r17)
            r2 = 0
        L_0x0459:
            if (r2 != 0) goto L_0x0495
            r9.mo101379S7(r11)
            f214335D = r0
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.q r2 = new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.q
            r2.<init>()
            f40.g r3 = f40.C86709a0.m107529k()
            ob0.b0 r3 = r3.f251779b
            r3.mo123460f(r2)
            r2 = 8
            com.tencent.p014mm.plugin.report.service.C85405m.m105415e(r2)
            r17.mo101380T7()
            java.lang.Object[] r2 = new java.lang.Object[r11]
            int r3 = r17.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r0] = r3
            java.lang.String r3 = "MicroMsg.LauncherUI"
            java.lang.String r4 = "resumeLogoutJump showLoginSelectUI hashCode[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r2)
            java.lang.Runnable r2 = r9.f214348x
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r2)
            java.lang.Runnable r2 = r9.f214348x
            r3 = 2000(0x7d0, double:9.88E-321)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r2, r3)
        L_0x0495:
            java.lang.Class<ym.p> r2 = p763ym.C79139p.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ym.p r2 = (p763ym.C79139p) r2
            java.lang.String r3 = ""
            r2.mo108866Xx(r9, r3)
            r17.mo101373M7()
            com.tencent.p014mm.p136ui.C85875k4.m106205t(r9, r0)
            ae2.a r0 = ae2.C39550b.m42181a()
            android.content.Intent r2 = r9.f214340p
            r0.mo62164Bj(r2)
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NotifyEnterChattingEvent> r0 = r9.f214337j
            r0.alive()
            com.tencent.p014mm.plugin.account.bind.p021ui.BindMobilePolicyUI.m161789S7()
            com.tencent.p014mm.qqlogin.ChangeQQLoginTypeManager.m7005a()
            com.tencent.mm.app.z0$h r0 = com.tencent.p014mm.app.C80637z0.C80646h.UNTIL_LAUNCHER_UI_ON_CREATE_END
            r1.mo112374e(r0)
            return
        L_0x04c2:
            r0 = move-exception
            r1 = r0
            monitor-exit(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.LauncherUI.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        ImageView imageView;
        if (this.chattingTabUI.mo101503i()) {
            return false;
        }
        HomeUI homeUI = this.f214338n;
        C73062c cVar = homeUI.f214289r;
        if (cVar == null || ((NewChattingTabUI) cVar).mo101503i()) {
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(homeUI.f214289r == null);
            objArr[1] = Boolean.valueOf(((NewChattingTabUI) homeUI.f214289r).mo101503i());
            Log.m105925i("MicroMsg.LauncherUI.HomeUI", "unCreateOptionsMenu, %b, %b", objArr);
            return false;
        }
        homeUI.f214259E = menu;
        int l = homeUI.f214288q.getSupportActionBar().mo91101l();
        int f = C76577a.m92155f(homeUI.f214288q, C0966R.dimen.f3755d6);
        if (l == 0) {
            DisplayMetrics displayMetrics = homeUI.f214288q.getResources().getDisplayMetrics();
            l = displayMetrics.widthPixels > displayMetrics.heightPixels ? homeUI.f214288q.getResources().getDimensionPixelSize(C0966R.dimen.f3678b8) : homeUI.f214288q.getResources().getDimensionPixelSize(C0966R.dimen.f3679b9);
        }
        MenuItem add = menu.add(0, C0966R.C0970id.gsl, 0, C0966R.string.k3j);
        homeUI.f214257C = add;
        Drawable drawable = homeUI.f214288q.getResources().getDrawable(C0966R.raw.actionbar_icon_dark_search);
        C74933u4.m89769f(drawable, homeUI.f214288q.getResources().getColor(C0966R.color.FG_0));
        add.setIcon(drawable);
        if (homeUI.f214278g) {
            homeUI.f214257C.setIcon(C0966R.raw.actionbar_icon_light_search);
        }
        if (homeUI.f214255A == null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(f, l);
            View inflate = LayoutInflater.from(homeUI.f214288q).inflate(C0966R.C0971layout.f6305b7, (ViewGroup) null);
            homeUI.f214255A = inflate;
            homeUI.f214256B = (ImageView) inflate.findViewById(C0966R.C0970id.f15);
            homeUI.f214255A.setLayoutParams(layoutParams);
            homeUI.f214255A.setMinimumHeight(l);
            homeUI.f214255A.setMinimumWidth(f);
            ImageView imageView2 = homeUI.f214256B;
            Drawable drawable2 = homeUI.f214288q.getResources().getDrawable(C0966R.raw.actionbar_icon_dark_search);
            C74933u4.m89769f(drawable2, homeUI.f214288q.getResources().getColor(C0966R.color.FG_0));
            imageView2.setImageDrawable(drawable2);
            homeUI.f214255A.setContentDescription(homeUI.mo101318i(C0966R.string.k3j));
            homeUI.f214255A.setOnLongClickListener(new View.OnLongClickListener() {
                public boolean onLongClick(
/*
Method generation error in method: com.tencent.mm.ui.HomeUI.16.onLongClick(android.view.View):boolean, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mm.ui.HomeUI.16.onLongClick(android.view.View):boolean, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
            homeUI.f214255A.setOnClickListener(new View.OnClickListener() {
                public void onClick(
/*
Method generation error in method: com.tencent.mm.ui.HomeUI.17.onClick(android.view.View):void, dex: classes5.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mm.ui.HomeUI.17.onClick(android.view.View):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
            homeUI.f214255A.post(new Runnable() {
                public void run(
/*
Method generation error in method: com.tencent.mm.ui.HomeUI.18.run():void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mm.ui.HomeUI.18.run():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/

                public java.lang.String toString(
/*
Method generation error in method: com.tencent.mm.ui.HomeUI.18.toString():java.lang.String, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mm.ui.HomeUI.18.toString():java.lang.String, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
        homeUI.f214257C.setActionView(homeUI.f214255A);
        homeUI.f214258D = menu.add(0, C0966R.C0970id.grs, 0, C0966R.string.k3h);
        if (homeUI.f214295x == null) {
            homeUI.f214294w = new HomeUI.PlusActionView(f, l);
        }
        if (C86709a0.m107523b().mo121114l()) {
            ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175770k(homeUI.f214294w);
        }
        if (homeUI.f214278g && (imageView = homeUI.f214296y) != null) {
            imageView.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        }
        C79547b.f233255g.mo109607a(new Runnable() {
            public void run(
/*
Method generation error in method: com.tencent.mm.ui.HomeUI.19.run():void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mm.ui.HomeUI.19.run():void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        });
        homeUI.f214258D.setActionView(homeUI.f214295x);
        MenuItem menuItem = homeUI.f214258D;
        if (menuItem != null) {
            if (homeUI.f214260F) {
                menuItem.setShowAsAction(2);
                homeUI.f214258D.setVisible(true);
                TextView textView = homeUI.f214276e;
                if (textView != null) {
                    textView.setVisibility(4);
                }
            } else {
                menuItem.setVisible(false);
                homeUI.f214258D.setEnabled(false);
                TextView textView2 = homeUI.f214276e;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            }
        }
        MenuItem menuItem2 = homeUI.f214257C;
        if (menuItem2 != null) {
            if (homeUI.f214260F) {
                menuItem2.setShowAsAction(2);
                homeUI.f214257C.setVisible(true);
                TextView textView3 = homeUI.f214276e;
                if (textView3 != null) {
                    textView3.setVisibility(4);
                }
            } else {
                menuItem2.setVisible(false);
                homeUI.f214257C.setEnabled(false);
                TextView textView4 = homeUI.f214276e;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
            }
        }
        homeUI.f214295x.getLayoutParams().width = f;
        homeUI.f214295x.getLayoutParams().height = l;
        Log.m105926v("MicroMsg.LauncherUI.HomeUI", "onCreateOptionsMenu");
        return true;
    }

    public void onDestroy() {
        C79546a.m96577a(512);
        C79546a.f233251w = false;
        super.onDestroy();
        HomeUI homeUI = this.f214338n;
        if (homeUI != null) {
            homeUI.f214291t.mo101421e();
            GlobalAlertMgr globalAlertMgr = homeUI.f214290s;
            if (globalAlertMgr != null) {
                globalAlertMgr.f214231k.dead();
                globalAlertMgr.f214233m.dead();
            }
            if (homeUI.f214272a) {
                Looper.myQueue().removeIdleHandler(homeUI.f214266L);
            }
            homeUI.f214265K.dead();
        }
        NewChattingTabUI newChattingTabUI = this.chattingTabUI;
        if (newChattingTabUI != null) {
            newChattingTabUI.mo101506l();
            MMHandlerThread.removeRunnable(newChattingTabUI.mStartChattingRunnable);
            Looper.myQueue().removeIdleHandler(newChattingTabUI.f214579f);
        }
        C79441d dVar = this.f214344t;
        if (dVar != null) {
            C76831b bVar = (C76831b) dVar;
            Log.m105924i("MicroMsg.HKOfflineLogic", "doOnDestroy");
            bVar.f224652d = null;
            bVar.f224654f = null;
            bVar.f224653e = false;
            bVar.f224655g = null;
            C86709a0.m107524d().mo123470p(2540, bVar);
            this.f214344t = null;
        }
        this.f214337j.dead();
        mo101374N7();
        Log.m105925i("MicroMsg.LauncherUI", "checktask onDestroy 0x%x, taskid %d, task:%s, instancesize %d", Integer.valueOf(hashCode()), Integer.valueOf(getTaskId()), Util.getActivityTaskInfo(this), Integer.valueOf(f214332A.size()));
    }

    public void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        Log.m105925i("MicroMsg.LauncherUI", "alvinluo onMultiWindowModeChanged2 isInMultiWindowMode: %b", Boolean.valueOf(z));
        MultiWindowModeChangedEvent multiWindowModeChangedEvent = new MultiWindowModeChangedEvent();
        multiWindowModeChangedEvent.f193745d.f193746a = z;
        multiWindowModeChangedEvent.publish();
    }

    public void onNewIntent(Intent intent) {
        Log.m105925i("MicroMsg.LauncherUI", "onNewIntent 0x%x task:%s", Integer.valueOf(hashCode()), Util.getActivityTaskInfo(this));
        this.f214340p = intent;
        super.onNewIntent(intent);
        setIntent(intent);
        C60204t3 t3Var = (C60204t3) C86312j.m106911c(C60204t3.class);
        if (!"android.intent.action.MAIN".equals(intent.getAction()) || t3Var == null || !t3Var.mo78749b2(this)) {
            Intent intent2 = this.f214340p;
            if (intent2 == null || !IntentUtil.getBooleanExtra(intent2, "LauncherUI.jump_from_uimode_check", false)) {
                if (t3Var != null && "new_msg_nofification".equals(intent.getStringExtra("nofification_type"))) {
                    t3Var.mo78755lM();
                }
                ((C79139p) C86312j.m106911c(C79139p.class)).mo108866Xx(this, "");
                if (mo101376P7()) {
                    Log.m105924i("MicroMsg.LauncherUI", "onNewIntent handleExitIntent");
                    return;
                }
                Intent intent3 = this.f214340p;
                if (intent3 == null || !IntentUtil.getBooleanExtra(intent3, "Intro_Need_Clear_Top ", false)) {
                    if ((intent.getFlags() & 67108864) == 67108864) {
                        closeChatting(false);
                    }
                    MainTabUI mainTabUI = this.f214338n.f214291t;
                    mainTabUI.getClass();
                    if ((intent.getFlags() & 67108864) == 67108864) {
                        mainTabUI.f214434d = true;
                    }
                    if (this.f214341q) {
                        Log.m105926v("MicroMsg.LauncherUI", "onMainTabNewIntent on new intent");
                        mo101377Q7(intent);
                    }
                    C39550b.m42181a().mo62164Bj(this.f214340p);
                    return;
                }
                Log.m105918d("MicroMsg.LauncherUI", "KEVIN KNeedClearTop");
                finish();
                m85941U7(this);
                return;
            }
            Log.m105924i("MicroMsg.LauncherUI", "dancy onNewIntent uimode check from background, finish LauncherUI");
            finish();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        HomeUI homeUI = this.f214338n;
        MMFragment currentFragmet = homeUI.f214288q.getCurrentFragmet();
        boolean z = false;
        if ((currentFragmet == null || !currentFragmet.isShowing()) && !((NewChattingTabUI) homeUI.f214289r).mo101503i()) {
            if (menuItem.getItemId() == C0966R.C0970id.grs) {
                C115669n.INSTANCE.kvStat(10919, "0");
                homeUI.mo101322m();
            } else if (menuItem.getItemId() == C0966R.C0970id.gsl) {
                homeUI.mo101321l();
            }
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        Log.m105919d("MicroMsg.LauncherUI", "onPause %s, chatting is show ", Integer.valueOf(hashCode()));
        super.onPause();
        C60204t3 t3Var = (C60204t3) C86312j.m106911c(C60204t3.class);
        if (t3Var != null) {
            t3Var.mo78744H5();
        }
        C78537k0 k0Var = this.f214345u;
        boolean a = k0Var.mo108479a("onPause");
        if (a) {
            k0Var.f230023a = false;
        }
        if (a) {
            Log.m105924i("MicroMsg.LauncherUI", "recreate activity %s, skip this onPause");
            return;
        }
        C79546a.m96577a(512);
        C79546a.f233251w = false;
        Log.m105924i("MicroMsg.LauncherUI", "not skip this onPause");
        MMFragment currentFragmet = getCurrentFragmet();
        this.f214347w.removeCallbacksAndMessages((Object) null);
        if (!C85875k4.m106208w()) {
            this.f214338n.mo101315g();
            this.chattingTabUI.mo101501g();
        }
        if (currentFragmet == null) {
            this.f214342r = false;
            C19627t tVar = C19627t.f55586a;
            C19627t.f55579G = false;
            if (C19627t.f55578F) {
                tVar.mo25821C();
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = i;
        String[] strArr2 = strArr;
        int[] iArr2 = iArr;
        this.f214346v = false;
        if (!this.f214339o.mo104635a(this, i2, strArr2, iArr2)) {
            HomeUI homeUI = this.f214338n;
            homeUI.getClass();
            if (i2 == 16 || i2 == 80) {
                int i3 = i2 == 80 ? C0966R.string.f361130hi2 : C0966R.string.hhq;
                if (iArr2[0] != 0) {
                    C76879j.m92709C(homeUI.f214288q, homeUI.mo101318i(i3), homeUI.mo101318i(C0966R.string.hif), homeUI.mo101318i(C0966R.string.fyd), homeUI.mo101318i(C0966R.string.auj), false, new DialogInterface.OnClickListener() {
                        public void onClick(
/*
Method generation error in method: com.tencent.mm.ui.HomeUI.33.onClick(android.content.DialogInterface, int):void, dex: classes.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mm.ui.HomeUI.33.onClick(android.content.DialogInterface, int):void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/
                    }, new DialogInterface.OnClickListener(homeUI) {
                        public void onClick(
/*
Method generation error in method: com.tencent.mm.ui.HomeUI.34.onClick(android.content.DialogInterface, int):void, dex: classes5.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mm.ui.HomeUI.34.onClick(android.content.DialogInterface, int):void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/
                    });
                }
            } else if (i2 != 65) {
                if (i2 == 66) {
                    if (iArr2[0] == 0) {
                        MMFragment g = homeUI.f214291t.mo101423g();
                        if (g instanceof FindMoreFriendsUI) {
                            ((FindMoreFriendsUI) g).mo25898a0();
                        }
                    } else {
                        C76879j.m92709C(homeUI.f214288q, homeUI.mo101318i(C0966R.string.f361129hi0), homeUI.mo101318i(C0966R.string.hif), homeUI.mo101318i(C0966R.string.fyd), homeUI.mo101318i(C0966R.string.auj), false, new DialogInterface.OnClickListener() {
                            public void onClick(
/*
Method generation error in method: com.tencent.mm.ui.HomeUI.36.onClick(android.content.DialogInterface, int):void, dex: classes.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mm.ui.HomeUI.36.onClick(android.content.DialogInterface, int):void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/
                        }, (DialogInterface.OnClickListener) null);
                    }
                }
            } else if (iArr2[0] == 0) {
                homeUI.mo101321l();
            } else {
                C76879j.m92709C(homeUI.f214288q, homeUI.mo101318i(C0966R.string.f361129hi0), homeUI.mo101318i(C0966R.string.hif), homeUI.mo101318i(C0966R.string.fyd), homeUI.mo101318i(C0966R.string.auj), false, new DialogInterface.OnClickListener() {
                    public void onClick(
/*
Method generation error in method: com.tencent.mm.ui.HomeUI.35.onClick(android.content.DialogInterface, int):void, dex: classes.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mm.ui.HomeUI.35.onClick(android.content.DialogInterface, int):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                }, (DialogInterface.OnClickListener) null);
            }
            BaseChattingUIFragment baseChattingUIFragment = this.chattingTabUI.f214587n;
            if (baseChattingUIFragment != null) {
                baseChattingUIFragment.onRequestPermissionsResult(i2, strArr2, iArr2);
            }
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        NewChattingTabUI newChattingTabUI = this.chattingTabUI;
        newChattingTabUI.getClass();
        String string = bundle.getString("last_restore_talker");
        newChattingTabUI.f214581h = string;
        Log.m105925i("MicroMsg.LauncherUI.NewChattingTabUI", "onRestoreInstanceState:%s", string);
        this.f214349y = bundle.getBoolean("last_stay_chatting");
        this.f214350z = bundle.getInt("last_stay_tab");
        if (this.f214349y) {
            NewChattingTabUI newChattingTabUI2 = this.chattingTabUI;
            newChattingTabUI2.mo101509o(newChattingTabUI2.f214581h, (Bundle) null, false);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0654  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x066b  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0683  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x06d1  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0712  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x071f  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0988  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0999  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x09c1  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0a02  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0a0d  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0a1f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r26 = this;
            r9 = r26
            java.lang.Class<d62.i> r10 = d62.C75339i.class
            java.lang.Class<rn.v> r11 = p227rn.C48053v.class
            java.lang.String r0 = "MicroMsg.LauncherUI"
            java.lang.String r1 = "onResume %s"
            r12 = 1
            java.lang.Object[] r2 = new java.lang.Object[r12]
            int r3 = r26.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r13 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r2[r13] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            super.onResume()
            wc3.k0 r0 = r9.f214345u
            java.lang.String r1 = "onResume"
            boolean r0 = r0.mo108479a(r1)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "MicroMsg.LauncherUI"
            java.lang.String r1 = "recreate activity %s, skip this onResume"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        L_0x0034:
            java.lang.String r0 = "MicroMsg.LauncherUI"
            java.lang.String r1 = "not skip this onResume"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            f214334C = r13
            android.content.Intent r0 = r9.f214340p
            if (r0 == 0) goto L_0x0057
            java.lang.String r1 = "Intro_Switch"
            boolean r0 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getBooleanExtra(r0, r1, r13)
            if (r0 != 0) goto L_0x0057
            boolean r0 = eb0.C97625j3.m125820j()
            if (r0 == 0) goto L_0x0057
            boolean r0 = f40.C86718e.m107551r()
            if (r0 != 0) goto L_0x0057
            r0 = 1
            goto L_0x0058
        L_0x0057:
            r0 = 0
        L_0x0058:
            if (r0 == 0) goto L_0x0b96
            java.lang.String r0 = "MicroMsg.LauncherUI"
            java.lang.String r1 = "doOnResumeImp notSwitchorHold, hasDoInit:%b"
            java.lang.Object[] r2 = new java.lang.Object[r12]
            boolean r3 = r9.f214341q
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2[r13] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            boolean r0 = eb0.C97625j3.m125811a()
            if (r0 != 0) goto L_0x00d7
            java.lang.String r0 = "MicroMsg.LauncherUI"
            java.lang.String r1 = "accHasNotReady, kill self"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            r26.finish()
            java.lang.String r0 = "MicroMsg.LauncherUI"
            java.lang.String r1 = "try to kill mm pid %d"
            java.lang.Object[] r2 = new java.lang.Object[r12]
            int r3 = android.os.Process.myPid()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r13] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            int r0 = android.os.Process.myPid()
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.mo10233c(r0)
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            java.lang.Object[] r15 = r1.mo10232b()
            java.lang.String r16 = "com/tencent/mm/ui/LauncherUI"
            java.lang.String r17 = "onResume"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/os/Process_EXEC_"
            java.lang.String r20 = "killProcess"
            java.lang.String r21 = "(I)V"
            r14 = r2
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r0 = r1.mo10231a(r13)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            android.os.Process.killProcess(r0)
            java.lang.String r3 = "com/tencent/mm/ui/LauncherUI"
            java.lang.String r4 = "onResume"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "android/os/Process_EXEC_"
            java.lang.String r7 = "killProcess"
            java.lang.String r8 = "(I)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x00d7:
            boolean r0 = r9.f214341q
            r8 = 0
            if (r0 != 0) goto L_0x0364
            r9.f214341q = r12
            com.tencent.mm.ui.HomeUI r1 = r9.f214338n
            r1.getClass()
            java.lang.String r0 = "MicroMsg.LauncherUI.HomeUI"
            java.lang.String r2 = "doOnCreate"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            java.lang.Class<xv2.d> r0 = xv2.C102775d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            xv2.d r0 = (xv2.C102775d) r0
            xv2.h r0 = r0.ik0()
            boolean r0 = r0.mo108963a()
            if (r0 == 0) goto L_0x0112
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_STORY_NEW_FEATURE_TIP_BOOLEAN_SYNC
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r0.mo119685f(r2, r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L_0x0112:
            com.tencent.mm.ui.GlobalAlertMgr r0 = r1.f214290s
            com.tencent.mm.sdk.event.IListener r2 = r0.f214231k
            r2.alive()
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CheckMobileSpaceEvent> r0 = r0.f214233m
            r0.alive()
            boolean r0 = com.tencent.p014mm.p136ui.conversation.C30847a.m39239a()
            if (r0 != 0) goto L_0x0138
            android.view.Window r0 = r26.getWindow()
            yi3.c r2 = new yi3.c
            android.view.Window r3 = r26.getWindow()
            android.view.Window$Callback r3 = r3.getCallback()
            r2.<init>(r3, r9)
            r0.setCallback(r2)
        L_0x0138:
            java.io.File r0 = new java.io.File
            com.tencent.mm.ui.MMFragmentActivity r2 = r1.f214288q
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r3 = ".launched"
            r0.<init>(r2, r3)
            boolean r2 = r0.exists()
            r2 = r2 ^ r12
            if (r2 == 0) goto L_0x0152
            r0.createNewFile()     // Catch:{ all -> 0x014f }
        L_0x014f:
            com.tencent.p014mm.xlog.app.XLogSetup.realSetupXlog()
        L_0x0152:
            com.tencent.mm.ui.f3 r0 = new com.tencent.mm.ui.f3
            r0.<init>(r9)
            r1.f214282k = r0
            r1.f214272a = r12
            com.tencent.p014mm.booter.NotifyReceiver.m98645c()
            eb0.u2 r0 = eb0.C97625j3.m125816f()
            com.tencent.mm.booter.notification.MMNotification r0 = (com.tencent.p014mm.booter.notification.MMNotification) r0
            r0.mo93208f(r12)
            boolean r0 = eb0.C97625j3.m125811a()
            if (r0 != 0) goto L_0x017b
            java.lang.String r0 = "MicroMsg.LauncherUI.HomeUI"
            java.lang.String r2 = "mmcore has not ready, finish launcherui"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            com.tencent.mm.ui.MMFragmentActivity r0 = r1.f214288q
            r0.finish()
            goto L_0x034f
        L_0x017b:
            java.lang.String r0 = "MicroMsg.LauncherUI.HomeUI"
            java.lang.String r2 = "on main tab create"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = java.lang.System.currentTimeMillis()
            com.tencent.mm.ui.MMFragmentActivity r0 = r1.f214288q
            com.tencent.p014mm.p136ui.MMActivity.initLanguage(r0)
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ Exception -> 0x01b5 }
            r0.<init>()     // Catch:{ Exception -> 0x01b5 }
            r6 = 2131824488(0x7f110f68, float:1.9281805E38)
            java.lang.String r6 = r1.mo101318i(r6)     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r7 = ";"
            java.lang.String[] r6 = r6.split(r7)     // Catch:{ Exception -> 0x01b5 }
            r7 = r6[r13]     // Catch:{ Exception -> 0x01b5 }
            r0.add(r7)     // Catch:{ Exception -> 0x01b5 }
            r6 = r6[r12]     // Catch:{ Exception -> 0x01b5 }
            r0.add(r6)     // Catch:{ Exception -> 0x01b5 }
            di3.d r6 = di3.C86312j.m106911c(r10)     // Catch:{ Exception -> 0x01b5 }
            d62.i r6 = (d62.C75339i) r6     // Catch:{ Exception -> 0x01b5 }
            r6.mo62516Sn(r0)     // Catch:{ Exception -> 0x01b5 }
            goto L_0x01bf
        L_0x01b5:
            r0 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r13]
            java.lang.String r7 = "MicroMsg.LauncherUI.HomeUI"
            java.lang.String r15 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r15, r6)
        L_0x01bf:
            f40.C86709a0.m107528h()
            com.tencent.mm.sdk.platformtools.MMHandlerThread r0 = f40.C86709a0.m107525e()
            com.tencent.mm.ui.HomeUI$22 r6 = new com.tencent.mm.ui.HomeUI$22
            r6.<init>(r1)
            r0.postToWorker(r6)
            java.lang.String r0 = "MicroMsg.LauncherUI.HomeUI"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "KEVIN MainTabUI onCreate initLanguage: "
            r6.append(r7)
            long r17 = java.lang.System.currentTimeMillis()
            long r4 = r17 - r4
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r4)
            com.tencent.mm.ui.MMFragmentActivity r0 = r1.f214288q
            java.lang.String r4 = "layout_inflater"
            java.lang.Object r0 = r0.getSystemService(r4)
            android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
            long r4 = java.lang.System.currentTimeMillis()
            com.tencent.mm.ui.MMFragmentActivity r0 = r1.f214288q
            r6 = 2131496422(0x7f0c0de6, float:1.8616408E38)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.View r0 = r0.inflate(r6, r8)
            r1.f214263I = r0
            if (r0 == 0) goto L_0x0227
            int r0 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            if (r0 < r6) goto L_0x0227
            boolean r0 = p206nj.C88956h.m111064e()
            if (r0 != 0) goto L_0x0227
            android.view.View r0 = r1.f214263I
            com.tencent.mm.ui.MMFragmentActivity r6 = r1.f214288q
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131101246(0x7f06063e, float:1.7814896E38)
            int r6 = r6.getColor(r7)
            r0.setBackgroundColor(r6)
        L_0x0227:
            ai.b r6 = p787ai.C79547b.f233255g
            monitor-enter(r6)
            r6.f233257b = r12     // Catch:{ all -> 0x0360 }
            monitor-exit(r6)
            android.view.View r0 = r1.f214263I
            r6 = 2131304925(0x7f0921dd, float:1.8228006E38)
            android.view.View r0 = r0.findViewById(r6)
            com.tencent.mm.blink.FirstScreenFrameLayout r0 = (com.tencent.p014mm.blink.FirstScreenFrameLayout) r0
            com.tencent.mm.ui.HomeUI$3 r6 = new com.tencent.mm.ui.HomeUI$3
            r6.<init>(r1)
            r0.f48701d = r6
            java.lang.String r0 = "MicroMsg.LauncherUI.HomeUI"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "KEVIN MainTabUI onCreate inflater.inflate(R.layout.main_tab, null);"
            r6.append(r7)
            long r17 = java.lang.System.currentTimeMillis()
            long r8 = r17 - r4
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r6)
            com.tencent.mm.ui.MMFragmentActivity r0 = r1.f214288q
            android.view.View r6 = r1.f214263I
            r0.setContentView((android.view.View) r6)
            android.os.MessageQueue r0 = android.os.Looper.myQueue()
            android.os.MessageQueue$IdleHandler r6 = r1.f214266L
            r0.addIdleHandler(r6)
            java.lang.String r0 = "MicroMsg.LauncherUI.HomeUI"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "KEVIN MainTabUI onCreate initView(); "
            r6.append(r7)
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r4
            r6.append(r7)
            java.lang.String r4 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r4)
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "MicroMsg.LauncherUI.HomeUI"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "KEVIN handleJump(getIntent()); "
            r6.append(r7)
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r4
            r6.append(r7)
            java.lang.String r4 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r4)
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "MicroMsg.LauncherUI.HomeUI"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "KEVIN syncAddrBookAndUpload checkLastLbsroomAndQuitIt "
            r6.append(r7)
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r4
            r6.append(r7)
            java.lang.String r4 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r4)
            r1.mo101319j()
            androidx.appcompat.app.ActionBar r0 = r1.f214274c
            r0.mo91094L()
            android.view.View r0 = r1.f214263I
            com.tencent.mm.ui.HomeUI$4 r4 = new com.tencent.mm.ui.HomeUI$4
            r4.<init>()
            r0.post(r4)
            java.lang.String r0 = "MicroMsg.LauncherUI.HomeUI"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "KEVIN MainTabUI onCreate : "
            r4.append(r5)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r2
            r4.append(r5)
            java.lang.String r2 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r0, r2)
            com.tencent.mm.ui.HomeUI$5 r0 = new com.tencent.mm.ui.HomeUI$5
            r0.<init>(r1)
            r2 = 2000(0x7d0, double:9.88E-321)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r0, r2)
            android.view.View r0 = r1.f214263I
            android.view.View$OnLayoutChangeListener r2 = r1.f214292u
            r0.addOnLayoutChangeListener(r2)
            com.tencent.mm.ui.MMFragmentActivity r0 = r1.f214288q
            android.view.View r2 = r1.f214263I
            wc3.C78538u.m94867c(r0, r2, r13)
            android.view.View r0 = r1.f214263I
            com.tencent.mm.ui.HomeUI$6 r2 = new com.tencent.mm.ui.HomeUI$6
            r2.<init>()
            r3 = 20
            r0.postDelayed(r2, r3)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.p014mm.p136ui.C85811a5.m106025b(r0)
            com.tencent.p014mm.p136ui.C85865h1.m106132b(r0)
            com.tencent.p014mm.p136ui.C85930s4.m106242b(r0)
            com.tencent.p014mm.p136ui.C85985z2.m106331c(r0)
            com.tencent.p014mm.p136ui.C85878m2.m106215d(r12)
            com.tencent.mm.sdk.event.IListener r0 = r1.f214265K
            r0.alive()
            java.lang.String r0 = "mainTabUI.doOnCreate()"
            bp3.C79760s.m96908a(r0)     // Catch:{ all -> 0x0359 }
            com.tencent.mm.ui.MainTabUI r0 = r1.f214291t     // Catch:{ all -> 0x0359 }
            r0.mo101420d()     // Catch:{ all -> 0x0359 }
            bp3.C79760s.m96909b()
            com.tencent.mm.ui.MainTabUI r0 = r1.f214291t
            com.tencent.mm.ui.HomeUI$1 r2 = new com.tencent.mm.ui.HomeUI$1
            r2.<init>()
            r0.f214437g = r2
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.ui.HomeUI$2 r2 = new com.tencent.mm.ui.HomeUI$2
            r2.<init>()
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183875f(r2)
        L_0x034f:
            android.content.Intent r0 = r26.getIntent()
            r9 = r26
            r9.mo101377Q7(r0)
            goto L_0x0364
        L_0x0359:
            r0 = move-exception
            r9 = r26
            bp3.C79760s.m96909b()
            throw r0
        L_0x0360:
            r0 = move-exception
            r1 = r0
            monitor-exit(r6)
            throw r1
        L_0x0364:
            com.tencent.mm.ui.HomeUI r0 = r9.f214338n
            r0.getClass()
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.String r3 = "mainTabUI.doOnResume()"
            bp3.C79760s.m96908a(r3)     // Catch:{ all -> 0x0b91 }
            com.tencent.mm.ui.MainTabUI r3 = r0.f214291t     // Catch:{ all -> 0x0b91 }
            com.tencent.mm.ui.LauncherUI$c r4 = r0.f214289r     // Catch:{ all -> 0x0b91 }
            com.tencent.mm.ui.NewChattingTabUI r4 = (com.tencent.p014mm.p136ui.NewChattingTabUI) r4     // Catch:{ all -> 0x0b91 }
            boolean r4 = r4.mo101503i()     // Catch:{ all -> 0x0b91 }
            r3.mo101422f(r4)     // Catch:{ all -> 0x0b91 }
            bp3.C79760s.m96909b()
            com.tencent.mm.ui.GlobalAlertMgr r3 = r0.f214290s
            r3.getClass()
            com.tencent.mm.autogen.events.CheckHotPatchAlertEvent r4 = new com.tencent.mm.autogen.events.CheckHotPatchAlertEvent
            r4.<init>()
            r4.publish()
            com.tencent.mm.autogen.events.CheckHotPatchAlertEvent$b r5 = r4.f78740e
            boolean r6 = r5.f78741a
            if (r6 == 0) goto L_0x03df
            java.lang.String r5 = r5.f78742b
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x03df
            java.lang.Object[] r5 = new java.lang.Object[r12]
            com.tencent.mm.autogen.events.CheckHotPatchAlertEvent$b r6 = r4.f78740e
            java.lang.String r6 = r6.f78742b
            r5[r13] = r6
            java.lang.String r6 = "MicroMsg.LauncherUI.GlobalAlertMgr"
            java.lang.String r7 = "  now show msg:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r5)
            qo3.q r5 = new qo3.q
            com.tencent.mm.ui.MMFragmentActivity r6 = r3.f214221a
            r5.<init>(r6)
            r6 = 2131821719(0x7f110497, float:1.927619E38)
            java.lang.String r6 = r3.mo101297a(r6)
            r5.mo107606r(r6)
            r6 = 2131821718(0x7f110496, float:1.9276187E38)
            java.lang.String r6 = r3.mo101297a(r6)
            r5.mo107596h(r6)
            com.tencent.mm.autogen.events.CheckHotPatchAlertEvent$b r4 = r4.f78740e
            java.lang.String r4 = r4.f78742b
            qo3.g$i r6 = r5.f225837a
            qo3.a r6 = r6.f225714b
            r6.f225662s = r4
            r5.mo107589a(r13)
            com.tencent.mm.ui.p0 r4 = new com.tencent.mm.ui.p0
            r4.<init>(r3)
            r5.mo107600l(r4)
            r5.mo107603o()
        L_0x03df:
            com.tencent.mm.autogen.events.GlobalAlertEvent$a r4 = r3.f214223c
            boolean r4 = r3.mo101300d(r4)
            r5 = 500(0x1f4, double:2.47E-321)
            if (r4 == 0) goto L_0x03ea
            goto L_0x03f6
        L_0x03ea:
            com.tencent.mm.sdk.platformtools.MMHandlerThread r4 = f40.C86709a0.m107525e()
            com.tencent.mm.ui.s0 r7 = new com.tencent.mm.ui.s0
            r7.<init>(r3)
            r4.postToWorkerDelayed(r7, r5)
        L_0x03f6:
            r4 = 0
            r3.f214223c = r4
            com.tencent.p014mm.sdk.crash.CrashReportFactory.setForeground(r12)
            com.tencent.mm.ui.LauncherUI$c r3 = r0.f214289r
            com.tencent.mm.ui.NewChattingTabUI r3 = (com.tencent.p014mm.p136ui.NewChattingTabUI) r3
            boolean r3 = r3.mo101503i()
            if (r3 != 0) goto L_0x0459
            boolean r4 = eb0.C97625j3.m125811a()
            if (r4 == 0) goto L_0x0459
            ai.b r4 = p787ai.C79547b.f233255g
            com.tencent.mm.ui.HomeUI$8 r7 = new com.tencent.mm.ui.HomeUI$8
            r7.<init>(r0)
            r4.mo109607a(r7)
            ed0.b r4 = ed0.C75610d.m90860b()
            if (r4 == 0) goto L_0x0459
            ed0.a r4 = ed0.C75610d.m90859a()
            if (r4 == 0) goto L_0x0459
            ed0.a r4 = ed0.C75610d.m90859a()
            t22.z r4 = (t22.C77833z) r4
            java.lang.String r4 = r4.mo107949b()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0459
            java.lang.Object[] r4 = new java.lang.Object[r12]
            ed0.b r7 = ed0.C75610d.m90860b()
            t22.y r7 = (t22.C118355y) r7
            java.lang.String r7 = r7.f353752u
            r4[r13] = r7
            java.lang.String r7 = "MicroMsg.LauncherUI.HomeUI"
            java.lang.String r8 = "launcher onResume end track %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r4)
            com.tencent.mm.autogen.events.ExitTrackRoomEvent r4 = new com.tencent.mm.autogen.events.ExitTrackRoomEvent
            r4.<init>()
            com.tencent.mm.autogen.events.ExitTrackRoomEvent$a r7 = r4.f193553d
            ed0.b r8 = ed0.C75610d.m90860b()
            t22.y r8 = (t22.C118355y) r8
            java.lang.String r8 = r8.f353752u
            r7.f193554a = r8
            r4.publish()
        L_0x0459:
            r8 = 3
            if (r3 != 0) goto L_0x047c
            com.tencent.mm.ui.MMFragmentActivity r3 = r0.f214288q
            com.tencent.mm.ui.MainTabUI r4 = r0.f214291t
            int r4 = r4.f214435e
            java.lang.String r7 = "directReport_onResume"
            com.tencent.p014mm.p136ui.C74931u0.m89763a(r3, r8, r4, r7)
            com.tencent.mm.ui.MainTabUI r3 = r0.f214291t
            r4 = 260(0x104, float:3.64E-43)
            java.util.HashMap<java.lang.Integer, com.tencent.mm.ui.MMFragment> r3 = r3.f214445o
            java.lang.Object r3 = r3.get(r14)
            com.tencent.mm.ui.conversation.MainUI r3 = (com.tencent.p014mm.p136ui.conversation.MainUI) r3
            if (r3 == 0) goto L_0x047c
            com.tencent.mm.ui.conversation.p r3 = r3.f219483v
            if (r3 == 0) goto L_0x047c
            r3.mo103887N(r4)
        L_0x047c:
            com.tencent.mm.ui.MMFragmentActivity r3 = r0.f214288q
            go3.C76019y.m91315c(r3)
            com.tencent.mm.ui.MMFragmentActivity r3 = r0.f214288q
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.onSwipe(r4)
            com.tencent.mm.ui.HomeUI$ActivityStatus r3 = com.tencent.p014mm.p136ui.HomeUI.ActivityStatus.ACTIVITY_RESUME
            r0.f214287p = r3
            boolean r3 = r0.f214273b
            if (r3 == 0) goto L_0x0492
            r0.f214273b = r13
        L_0x0492:
            com.tencent.p014mm.modelavatar.C68099t.f195741b = r13
            com.tencent.mm.modelavatar.t$a r3 = com.tencent.p014mm.modelavatar.C68099t.f195742c
            r3.stopTimer()
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r7 = "MicroMsg.LauncherUI.HomeUI"
            java.lang.String r15 = "[Launching Application]"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r15)
            com.tencent.mm.ui.MMFragmentActivity r7 = r0.f214288q
            f40.C75681p0.m90934a(r7, r13)
            com.tencent.mm.ui.MMFragmentActivity r7 = r0.f214288q
            f40.C75681p0.m90935b(r7, r13)
            long r18 = java.lang.System.currentTimeMillis()
            com.tencent.mm.ui.MMFragmentActivity r7 = r0.f214288q
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            android.content.SharedPreferences r7 = r7.getSharedPreferences(r15, r13)
            java.lang.String r15 = "settings_landscape_mode"
            boolean r7 = r7.getBoolean(r15, r13)
            java.lang.Class<dv.c> r15 = p498dv.C75457c.class
            di3.d r15 = di3.C86312j.m106911c(r15)
            dv.c r15 = (p498dv.C75457c) r15
            com.tencent.mm.ui.MMFragmentActivity r5 = r0.f214288q
            aa2.b r5 = r15.mo105801Rv(r5)
            boolean r5 = r5.mo90994b0()
            if (r7 == 0) goto L_0x04ee
            if (r5 != 0) goto L_0x04ee
            boolean r5 = com.tencent.p014mm.p136ui.C85875k4.m106160Q()
            if (r5 != 0) goto L_0x04e4
            boolean r5 = com.tencent.p014mm.p136ui.C85875k4.m106159P()
            if (r5 == 0) goto L_0x04e7
        L_0x04e4:
            com.tencent.p014mm.p136ui.C85811a5.m106028e(r12)
        L_0x04e7:
            com.tencent.mm.ui.MMFragmentActivity r5 = r0.f214288q
            r6 = -1
            r5.setRequestedOrientation(r6)
            goto L_0x0502
        L_0x04ee:
            boolean r5 = com.tencent.p014mm.p136ui.C85875k4.m106160Q()
            if (r5 != 0) goto L_0x04fa
            boolean r5 = com.tencent.p014mm.p136ui.C85875k4.m106159P()
            if (r5 == 0) goto L_0x04fd
        L_0x04fa:
            com.tencent.p014mm.p136ui.C85811a5.m106028e(r13)
        L_0x04fd:
            com.tencent.mm.ui.MMFragmentActivity r5 = r0.f214288q
            r5.setRequestedOrientation(r12)
        L_0x0502:
            long r5 = java.lang.System.currentTimeMillis()
            com.tencent.mm.ui.LauncherUI r7 = getInstance()
            if (r7 != 0) goto L_0x050d
            goto L_0x054d
        L_0x050d:
            ai.b r7 = p787ai.C79547b.f233255g
            monitor-enter(r7)
            r7.f233259d = r13     // Catch:{ all -> 0x0b8d }
            monitor-exit(r7)
            java.lang.Class<f62.s0> r7 = f62.C75707s0.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            f62.s0 r7 = (f62.C75707s0) r7
            eb0.v5 r7 = r7.H60()
            java.lang.String r15 = "showprivacypolicy"
            f62.q0 r8 = r0.f214271Q
            r7.mo120969q(r15, r8)
            r0.mo101326q(r13)
            com.tencent.mm.sdk.event.IListener r7 = r0.f214264J
            r7.alive()
            java.lang.String r7 = "MicroMsg.LauncherUI.HomeUI"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r15 = "KEVIN MainTabUI onResume:"
            r8.append(r15)
            long r23 = java.lang.System.currentTimeMillis()
            long r5 = r23 - r5
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r5)
            eb0.C97625j3.m125811a()
        L_0x054d:
            java.lang.String r5 = "MicroMsg.LauncherUI.HomeUI"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "KEVIN dispatch resume "
            r6.append(r7)
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r18
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r5, r6)
            java.lang.String r5 = "MicroMsg.LauncherUI.HomeUI"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "KEVIN LaucherUI lauch last : "
            r6.append(r7)
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r3
            r6.append(r7)
            java.lang.String r3 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r3)
            java.lang.String r3 = "MicroMsg.LauncherUI.HomeUI"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "initView "
            r4.append(r5)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r1
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            boolean r3 = r0.f214273b
            if (r3 == 0) goto L_0x05a5
            r0.f214273b = r13
        L_0x05a5:
            com.tencent.mm.app.r0 r3 = com.tencent.p014mm.app.C67652r0.f193463c
            if (r3 != 0) goto L_0x05b0
            com.tencent.mm.app.r0 r3 = new com.tencent.mm.app.r0
            r3.<init>()
            com.tencent.p014mm.app.C67652r0.f193463c = r3
        L_0x05b0:
            com.tencent.mm.app.r0 r3 = com.tencent.p014mm.app.C67652r0.f193463c
            r3.f193464a = r12
            com.tencent.mm.sdk.platformtools.MMHandler r4 = r3.f193465b
            r5 = -1999(0xfffffffffffff831, float:NaN)
            r4.removeMessages(r5)
            com.tencent.mm.sdk.platformtools.MMHandler r3 = r3.f193465b
            r4 = -2999(0xfffffffffffff449, float:NaN)
            r3.removeMessages(r4)
            java.lang.String r3 = "MicroMsg.LauncherUI.HomeUI"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "start time check LauncherUI Launcher onResume end: "
            r4.append(r5)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r1
            r4.append(r5)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LOGIN_SHOW_BIND_THIRD_ADD_TYPE_INT
            int r1 = r1.mo119689j(r2, r13)
            if (r1 == 0) goto L_0x0617
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            r3.mo119677K(r2, r14)
            boolean r2 = eb0.C75592q0.m90792v()
            if (r2 != 0) goto L_0x0617
            if (r1 == r12) goto L_0x0602
            goto L_0x0617
        L_0x0602:
            com.tencent.mm.ui.MMFragmentActivity r1 = r0.f214288q
            r2 = 2131832250(0x7f112dba, float:1.9297549E38)
            java.lang.String r2 = r0.mo101318i(r2)
            java.lang.String r3 = ""
            com.tencent.mm.ui.HomeUI$9 r4 = new com.tencent.mm.ui.HomeUI$9
            r4.<init>()
            r8 = 0
            nj3.C76879j.m92750u(r1, r2, r3, r4, r8)
            goto L_0x0618
        L_0x0617:
            r8 = 0
        L_0x0618:
            ai.b r1 = p787ai.C79547b.f233255g
            com.tencent.mm.ui.HomeUI$10 r2 = new com.tencent.mm.ui.HomeUI$10
            r2.<init>()
            r1.mo109607a(r2)
            com.tencent.mm.ui.MainTabUI r1 = r0.getMainTabUI()
            int r1 = r1.f214435e
            r2 = 3
            if (r1 == r2) goto L_0x0643
            com.tencent.mm.ui.MainTabUI r0 = r0.getMainTabUI()
            com.tencent.mm.ui.MMFragment r0 = r0.mo101424h(r2)
            com.tencent.mm.ui.MoreTabUI r0 = (com.tencent.p014mm.p136ui.MoreTabUI) r0
            com.tencent.mm.ui.widget.listview.PullDownListView r1 = r0.f214497u
            if (r1 == 0) goto L_0x0643
            boolean r2 = r1.f220631I
            if (r2 != 0) goto L_0x0643
            r1.mo104538n()
            r0.mo101443k0()
        L_0x0643:
            com.tencent.mm.ui.NewChattingTabUI r0 = r9.chattingTabUI
            r0.getClass()
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r0.f214576c = r1
            boolean r1 = r0.mo101504j()
            if (r1 == 0) goto L_0x0665
            com.tencent.mm.ui.x2 r1 = new com.tencent.mm.ui.x2
            r1.<init>(r0)
            r0.f214579f = r1
            com.tencent.mm.ui.y2 r1 = new com.tencent.mm.ui.y2
            r1.<init>(r0)
            r2 = 500(0x1f4, double:2.47E-321)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r1, r2)
        L_0x0665:
            boolean r1 = r0.mo101503i()
            if (r1 == 0) goto L_0x0683
            r1 = 3
            r0.mo101507m(r1)
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r0.f214587n
            if (r1 == 0) goto L_0x069a
            boolean r1 = r1.isSupportNavigationSwipeBack()
            if (r1 == 0) goto L_0x069a
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r0.f214587n
            com.tencent.mm.ui.widget.SwipeBackLayout r0 = r0.getSwipeBackLayout()
            r0.setEnableGesture(r12)
            goto L_0x069a
        L_0x0683:
            boolean r1 = r0.f214591r
            if (r1 == 0) goto L_0x069a
            java.lang.String r1 = "MicroMsg.LauncherUI.NewChattingTabUI"
            java.lang.String r2 = "[onResume] need exec this runnable!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)
            java.lang.Runnable r1 = r0.mStartChattingRunnable
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r1)
            java.lang.Runnable r1 = r0.mStartChattingRunnable
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
            r0.f214591r = r13
        L_0x069a:
            java.lang.Class<te3.um2> r0 = te3.C51567um2.class
            java.lang.Class<ox.b> r1 = p640ox.C77049b.class
            java.lang.String r15 = "MicroMsg.LauncherUI"
            java.lang.String r2 = "resumeNormalJump"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)
            com.tencent.p014mm.p136ui.MMFragmentActivity$$c.m143992a()
            android.content.Intent r2 = r26.getIntent()
            java.lang.String r3 = "nofification_type"
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getStringExtra(r2, r3)
            java.lang.String r3 = "pushcontent_notification"
            boolean r2 = r3.equals(r2)
            r7 = 2
            java.lang.Integer r17 = java.lang.Integer.valueOf(r7)
            java.lang.String r6 = ""
            if (r2 == 0) goto L_0x0712
            android.content.Intent r2 = r26.getIntent()
            java.lang.String r3 = "Main_FromUserName"
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getStringExtra(r2, r3)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0712
            android.content.Intent r2 = r26.getIntent()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getStringExtra(r2, r3)
            android.content.Intent r3 = r26.getIntent()
            java.lang.String r4 = "MainUI_User_Last_Msg_Type"
            int r3 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getIntExtra(r3, r4, r13)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "launch report, fromUserName = %s, msgType = %d"
            r4.append(r5)
            r4.append(r2)
            r4.append(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r4)
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 3
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8[r13] = r3
            r8[r12] = r2
            r8[r7] = r14
            r2 = 10856(0x2a68, float:1.5212E-41)
            r4.mo160131h(r2, r8)
            goto L_0x0713
        L_0x0712:
            r5 = 3
        L_0x0713:
            android.content.Intent r2 = r26.getIntent()
            java.lang.String r3 = "LauncherUI.Shortcut.LaunchType"
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getStringExtra(r2, r3)
            if (r2 == 0) goto L_0x0988
            java.lang.String r4 = "launch_type_voip"
            boolean r8 = r2.equals(r4)
            java.lang.String r5 = "com.tencent.mm.ui.contact.VoipAddressUI"
            if (r8 == 0) goto L_0x0791
            java.lang.String r0 = "launch, LaunchTypeVOIP"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.Intent r0 = r0.setClassName(r9, r5)
            android.content.Intent r0 = r0.putExtra(r3, r4)
            k20.a r8 = new k20.a
            r8.<init>()
            r8.mo10233c(r0)
            java.lang.Object[] r2 = r8.mo10232b()
            java.lang.String r3 = "com/tencent/mm/ui/LauncherUI"
            java.lang.String r4 = "resumeNormalJump"
            java.lang.String r5 = "()V"
            java.lang.String r0 = "Undefined"
            java.lang.String r20 = "startActivity"
            java.lang.String r21 = "(Landroid/content/Intent;)V"
            r1 = r26
            r22 = 3
            r25 = r6
            r6 = r0
            r0 = 2
            r7 = r20
            r12 = r8
            r8 = r21
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r12.mo10231a(r13)
            android.content.Intent r1 = (android.content.Intent) r1
            r9.startActivity(r1)
            java.lang.String r2 = "com/tencent/mm/ui/LauncherUI"
            java.lang.String r3 = "resumeNormalJump"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r26
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r13] = r17
            r2 = 1
            r0[r2] = r14
            r2 = 11034(0x2b1a, float:1.5462E-41)
            r1.mo160131h(r2, r0)
        L_0x078d:
            r12 = r25
            goto L_0x0989
        L_0x0791:
            r25 = r6
            r12 = 2
            java.lang.String r4 = "launch_type_voip_audio"
            boolean r6 = r2.equals(r4)
            if (r6 == 0) goto L_0x07f8
            java.lang.String r0 = "launch, LaunchTypeVOIPAudio"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.Intent r0 = r0.setClassName(r9, r5)
            android.content.Intent r0 = r0.putExtra(r3, r4)
            k20.a r14 = new k20.a
            r14.<init>()
            r14.mo10233c(r0)
            java.lang.Object[] r2 = r14.mo10232b()
            java.lang.String r3 = "com/tencent/mm/ui/LauncherUI"
            java.lang.String r4 = "resumeNormalJump"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r26
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r14.mo10231a(r13)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/ui/LauncherUI"
            java.lang.String r3 = "resumeNormalJump"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r13] = r17
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1[r2] = r3
            r2 = 11034(0x2b1a, float:1.5462E-41)
            r0.mo160131h(r2, r1)
            goto L_0x078d
        L_0x07f8:
            java.lang.String r4 = "launch_type_scan_qrcode"
            boolean r5 = r2.equals(r4)
            if (r5 == 0) goto L_0x0880
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.GlobalScan
            boolean r2 = r2.checkAvailable(r9)
            if (r2 == 0) goto L_0x078d
            android.content.Intent r2 = r26.getIntent()
            r12 = r25
            r2.putExtra(r3, r12)
            di3.d r1 = di3.C86312j.m106911c(r1)
            ox.b r1 = (p640ox.C77049b) r1
            java.lang.String r2 = "BaseScanUI"
            r14 = 3
            pe3.a r0 = r1.mo72357nb(r9, r2, r14, r0)
            te3.um2 r0 = (te3.C51567um2) r0
            if (r0 == 0) goto L_0x0824
            r0.f142940d = r4
        L_0x0824:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.tencent.mm.plugin.scanner.ui.BaseScanUI"
            android.content.Intent r0 = r0.setClassName(r9, r1)
            java.lang.String r1 = "key_enable_multi_code"
            r2 = 1
            r0.putExtra(r1, r2)
            java.lang.String r1 = "key_scan_goods_enable_dynamic_wording"
            r0.putExtra(r1, r2)
            java.lang.String r1 = "key_enable_scan_code_product_merge"
            r0.putExtra(r1, r2)
            java.lang.String r1 = "key_scan_entry_scene"
            r2 = 5
            r0.putExtra(r1, r2)
            k20.a r8 = new k20.a
            r8.<init>()
            r8.mo10233c(r0)
            java.lang.Object[] r2 = r8.mo10232b()
            java.lang.String r3 = "com/tencent/mm/ui/LauncherUI"
            java.lang.String r4 = "resumeNormalJump"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r0 = "(Landroid/content/Intent;)V"
            r1 = r26
            r14 = r8
            r8 = r0
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r14.mo10231a(r13)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/ui/LauncherUI"
            java.lang.String r3 = "resumeNormalJump"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0989
        L_0x0880:
            r12 = r25
            r8 = 3
            java.lang.String r4 = "launch_type_offline_wallet"
            boolean r5 = r2.equals(r4)
            if (r5 == 0) goto L_0x0921
            android.content.Intent r2 = r26.getIntent()
            r2.putExtra(r3, r12)
            di3.d r1 = di3.C86312j.m106911c(r1)
            ox.b r1 = (p640ox.C77049b) r1
            java.lang.String r2 = "WalletOfflineEntranceUI"
            pe3.a r0 = r1.mo72357nb(r9, r2, r8, r0)
            te3.um2 r0 = (te3.C51567um2) r0
            if (r0 == 0) goto L_0x08a4
            r0.f142940d = r4
        L_0x08a4:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC
            java.lang.Object r0 = r0.mo119685f(r1, r14)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x08dd
            r1 = 1
            if (r0 != r1) goto L_0x08be
            goto L_0x08dd
        L_0x08be:
            r1 = 8
            if (r0 != r1) goto L_0x0989
            zz.d r0 = r9.f214344t
            if (r0 != 0) goto L_0x08d4
            java.lang.Class<zz.f> r0 = p287zz.C79442f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            zz.f r0 = (p287zz.C79442f) r0
            zz.d r0 = r0.J70()
            r9.f214344t = r0
        L_0x08d4:
            zz.d r0 = r9.f214344t
            n63.b r0 = (n63.C76831b) r0
            r0.mo107100c(r9)
            goto L_0x0989
        L_0x08dd:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI"
            android.content.Intent r0 = r0.setClassName(r9, r1)
            k20.a r14 = new k20.a
            r14.<init>()
            r14.mo10233c(r0)
            java.lang.Object[] r2 = r14.mo10232b()
            java.lang.String r3 = "com/tencent/mm/ui/LauncherUI"
            java.lang.String r4 = "resumeNormalJump"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r0 = "(Landroid/content/Intent;)V"
            r1 = r26
            r8 = r0
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r14.mo10231a(r13)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/ui/LauncherUI"
            java.lang.String r3 = "resumeNormalJump"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0989
        L_0x0921:
            java.lang.String r4 = "launch_type_my_qrcode"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0989
            android.content.Intent r2 = r26.getIntent()
            r2.putExtra(r3, r12)
            di3.d r1 = di3.C86312j.m106911c(r1)
            ox.b r1 = (p640ox.C77049b) r1
            java.lang.String r2 = "SelfQRCodeUI"
            r14 = 3
            pe3.a r0 = r1.mo72357nb(r9, r2, r14, r0)
            te3.um2 r0 = (te3.C51567um2) r0
            if (r0 == 0) goto L_0x0943
            r0.f142940d = r4
        L_0x0943:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI"
            android.content.Intent r0 = r0.setClassName(r9, r1)
            k20.a r8 = new k20.a
            r8.<init>()
            r8.mo10233c(r0)
            java.lang.Object[] r2 = r8.mo10232b()
            java.lang.String r3 = "com/tencent/mm/ui/LauncherUI"
            java.lang.String r4 = "resumeNormalJump"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r0 = "(Landroid/content/Intent;)V"
            r1 = r26
            r14 = r8
            r8 = r0
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r14.mo10231a(r13)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/ui/LauncherUI"
            java.lang.String r3 = "resumeNormalJump"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0989
        L_0x0988:
            r12 = r6
        L_0x0989:
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r1 = "LauncherUI.switch.tab"
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getStringExtra(r0, r1)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x09a9
            com.tencent.mm.ui.HomeUI r2 = r9.f214338n
            com.tencent.mm.ui.MainTabUI r2 = r2.getMainTabUI()
            r2.mo101428l(r0)
            android.content.Intent r0 = r26.getIntent()
            r0.putExtra(r1, r12)
        L_0x09a9:
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r2 = "LauncherUI.From.Scaner.Shortcut"
            boolean r0 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getBooleanExtra(r0, r2, r13)
            if (r0 != 0) goto L_0x09b9
            boolean r0 = r9.f214343s
            if (r0 == 0) goto L_0x09f4
        L_0x09b9:
            r9.f214343s = r13
            com.tencent.mm.ui.LauncherUI r0 = getInstance()
            if (r0 == 0) goto L_0x09e3
            com.tencent.mm.ui.HomeUI r0 = r0.f214338n
            r0.getClass()
            com.tencent.mm.sdk.platformtools.MMHandlerThread r3 = f40.C86709a0.m107525e()
            r3.setLowestPriority()
            com.tencent.mm.ui.MainTabUI r3 = r0.f214291t
            com.tencent.mm.ui.MainTabUnreadMgr r3 = r3.f214432b
            r3.getClass()
            ai.b r4 = p787ai.C79547b.f233255g
            com.tencent.mm.ui.t2 r5 = new com.tencent.mm.ui.t2
            r5.<init>(r3)
            r4.mo109607a(r5)
            java.lang.Runnable r0 = r0.f214267M
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
        L_0x09e3:
            android.content.Intent r0 = r26.getIntent()
            r0.putExtra(r2, r13)
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r2 = "tab_find_friend"
            r0.putExtra(r1, r2)
        L_0x09f4:
            android.content.Intent r0 = r26.getIntent()
            java.lang.String r14 = "LauncherUI.From.Biz.Shortcut"
            boolean r0 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getBooleanExtra(r0, r14, r13)
            java.lang.String r8 = "LauncherUI_From_Biz_Shortcut"
            if (r0 == 0) goto L_0x0a0d
            android.content.Intent r1 = r26.getIntent()
            java.lang.String r2 = "LauncherUI.Shortcut.Username"
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getStringExtra(r1, r2)
            goto L_0x0a1d
        L_0x0a0d:
            android.content.Intent r0 = r26.getIntent()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getBooleanExtra(r0, r8, r13)
            android.content.Intent r1 = r26.getIntent()
            java.lang.String r1 = r1.getAction()
        L_0x0a1d:
            if (r0 == 0) goto L_0x0b89
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "launch, fromBizShortcut, bizUsername = "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r0 != 0) goto L_0x0b89
            java.lang.String r0 = cw0.C116541b.m164356f(r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x0b89
            boolean r1 = eb0.C45628s0.m50740E(r0)
            if (r1 == 0) goto L_0x0b7a
            java.lang.String r1 = "launch, username is contact, go to chattingui"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r1)
            boolean r1 = rb0.C47984k.m53338l(r0)
            if (r1 == 0) goto L_0x0b6e
            di3.d r1 = di3.C86312j.m106911c(r11)
            rn.v r1 = (p227rn.C48053v) r1
            boolean r1 = r1.mo72614OE(r0)
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            if (r1 == 0) goto L_0x0ab6
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r3 = "com.tencent.mm.ui.bizchat.BizChatConversationUI"
            r1.setClassName(r9, r3)
            java.lang.String r3 = "Contact_User"
            r1.putExtra(r3, r0)
            r0 = 9
            java.lang.String r3 = "biz_chat_from_scene"
            r1.putExtra(r3, r0)
            r1.addFlags(r2)
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r1)
            java.lang.Object[] r2 = r0.mo10232b()
            java.lang.String r3 = "com/tencent/mm/ui/LauncherUI"
            java.lang.String r4 = "resumeNormalJump"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r10 = "(Landroid/content/Intent;)V"
            r1 = r26
            r15 = r8
            r8 = r10
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.mo10231a(r13)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/ui/LauncherUI"
            java.lang.String r3 = "resumeNormalJump"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0b7b
        L_0x0ab6:
            r15 = r8
            di3.d r1 = di3.C86312j.m106911c(r11)
            rn.v r1 = (p227rn.C48053v) r1
            boolean r1 = r1.mo72617gl(r0)
            if (r1 == 0) goto L_0x0b19
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "com.tencent.mm.ui.conversation.EnterpriseConversationUI"
            r1.setClassName(r9, r2)
            java.lang.String r2 = "enterprise_biz_name"
            r1.putExtra(r2, r0)
            di3.d r2 = di3.C86312j.m106911c(r10)
            d62.i r2 = (d62.C75339i) r2
            java.lang.String r0 = r2.getDisplayName(r0)
            java.lang.String r2 = "enterprise_biz_display_name"
            r1.putExtra(r2, r0)
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r1)
            java.lang.Object[] r2 = r0.mo10232b()
            java.lang.String r3 = "com/tencent/mm/ui/LauncherUI"
            java.lang.String r4 = "resumeNormalJump"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r26
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.mo10231a(r13)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/ui/LauncherUI"
            java.lang.String r3 = "resumeNormalJump"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0b7b
        L_0x0b19:
            boolean r1 = rb0.C47984k.m53339m(r0)
            if (r1 == 0) goto L_0x0b5b
            ug.c r1 = rb0.C47984k.m53328b(r0)
            if (r1 != 0) goto L_0x0b27
            r8 = 0
            goto L_0x0b2b
        L_0x0b27:
            java.lang.String r8 = r1.mo72807B()
        L_0x0b2b:
            if (r8 != 0) goto L_0x0b2f
            r6 = r12
            goto L_0x0b30
        L_0x0b2f:
            r6 = r8
        L_0x0b30:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r3 = "rawUrl"
            r1.putExtra(r3, r6)
            java.lang.String r3 = "useJs"
            r4 = 1
            r1.putExtra(r3, r4)
            java.lang.String r3 = "srcUsername"
            r1.putExtra(r3, r0)
            java.lang.String r0 = "bizofstartfrom"
            java.lang.String r3 = "enterpriseHomeSubBrand"
            r1.putExtra(r0, r3)
            r1.addFlags(r2)
            java.lang.String r0 = "webview"
            java.lang.String r2 = ".ui.tools.WebViewUI"
            r3 = 0
            ke3.C88144b.m109791i(r9, r0, r2, r1, r3)
            goto L_0x0b7b
        L_0x0b5b:
            com.tencent.mm.ui.LauncherUI r1 = getInstance()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "chat_from_scene"
            r4 = 3
            r2.putInt(r3, r4)
            r1.startChatting(r0, r2, r13)
            goto L_0x0b7b
        L_0x0b6e:
            r15 = r8
            r3 = 0
            com.tencent.mm.ui.LauncherUI r1 = getInstance()
            if (r1 == 0) goto L_0x0b7b
            r1.startChatting(r0, r3, r13)
            goto L_0x0b7b
        L_0x0b7a:
            r15 = r8
        L_0x0b7b:
            android.content.Intent r0 = r26.getIntent()
            r0.putExtra(r15, r13)
            android.content.Intent r0 = r26.getIntent()
            r0.putExtra(r14, r13)
        L_0x0b89:
            r1 = 1
            r9.f214342r = r1
            goto L_0x0b9d
        L_0x0b8d:
            r0 = move-exception
            r1 = r0
            monitor-exit(r7)
            throw r1
        L_0x0b91:
            r0 = move-exception
            bp3.C79760s.m96909b()
            throw r0
        L_0x0b96:
            boolean r0 = f214335D
            if (r0 != 0) goto L_0x0b9d
            r26.mo101380T7()
        L_0x0b9d:
            r1 = 5
            p787ai.C79546a.m96581e(r1)
            boolean r0 = f214335D
            if (r0 != 0) goto L_0x0ba8
            r9.mo101379S7(r13)
        L_0x0ba8:
            r26.mo101373M7()
            java.lang.Class<pn.e> r0 = p646pn.C110234e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            pn.e r0 = (p646pn.C110234e) r0
            xv0.e r0 = r0.mo161399pY()
            java.lang.String r1 = "MicroMsg.FloatBallVisibilityUtil"
            if (r0 == 0) goto L_0x0bc4
            java.lang.String r2 = "fixFloatBallIfNeed, try to fix"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r0.mo149118e0()
            goto L_0x0bc9
        L_0x0bc4:
            java.lang.String r0 = "fixFloatBallIfNeed, service is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x0bc9:
            java.lang.Class<c02.c> r0 = c02.C92331c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            c02.c r0 = (c02.C92331c) r0
            r0.mo58353Fi()
            r1 = 1
            com.tencent.p014mm.plugin.base.stub.C85083h.f247926g = r1
            long r0 = android.os.SystemClock.elapsedRealtime()
            com.tencent.p014mm.plugin.base.stub.C85083h.f247927h = r0
            com.tencent.p014mm.plugin.base.stub.C85083h.m104915d()
            java.lang.String r0 = "LauncherUI"
            f40.C86739i0.m107600b(r0)
            com.tencent.mm.app.z0 r0 = com.tencent.p014mm.app.C80637z0.INSTANCE
            com.tencent.mm.app.z0$h r1 = com.tencent.p014mm.app.C80637z0.C80646h.UNTIL_LAUNCHER_UI_ON_RESUME_END
            r0.mo112374e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.LauncherUI.onResume():void");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        BaseChattingUIFragment baseChattingUIFragment = this.chattingTabUI.f214587n;
        boolean z = false;
        if (baseChattingUIFragment != null) {
            String r = baseChattingUIFragment.f215220f.mo91577r();
            if (!Util.isNullOrNil(r)) {
                Log.m105925i("MicroMsg.LauncherUI.NewChattingTabUI", "onSaveInstanceState:%s", r);
                bundle.putString("last_restore_talker", r);
            }
        }
        if (getCurrentFragmet() != null) {
            z = true;
        }
        bundle.putBoolean("last_stay_chatting", z);
        bundle.putInt("last_stay_tab", getCurrentTabIndex());
    }

    public void onSettle(boolean z, int i) {
        if (this.f214341q && !this.chattingTabUI.mo101505k(z, i)) {
            super.onSettle(z, i);
        }
    }

    public void onStart() {
        C60204t3 t3Var = (C60204t3) C86312j.m106911c(C60204t3.class);
        if (t3Var != null) {
            t3Var.mo78759w2();
        }
        super.onStart();
    }

    public void onStop() {
        Log.m105925i("MicroMsg.LauncherUI", "onStop %s", Integer.valueOf(hashCode()));
        C79546a.m96577a(512);
        C79546a.f233251w = false;
        if (C85875k4.m106208w()) {
            HomeUI homeUI = this.f214338n;
            if (homeUI != null) {
                homeUI.mo101315g();
            }
            this.chattingTabUI.mo101501g();
        }
        HomeUI homeUI2 = this.f214338n;
        homeUI2.getClass();
        ((C75707s0) C86312j.m106911c(C75707s0.class)).H60().mo120967O("showprivacypolicy", homeUI2.f214271Q);
        super.onStop();
    }

    public void onSwipe(float f) {
        float f2 = f;
        if (this.f214341q) {
            NewChattingTabUI newChattingTabUI = this.chattingTabUI;
            newChattingTabUI.getClass();
            Object[] objArr = new Object[3];
            boolean z = false;
            objArr[0] = Float.valueOf(f);
            boolean z2 = true;
            objArr[1] = 260L;
            C73063d dVar = newChattingTabUI.f214575b;
            objArr[2] = Boolean.valueOf(dVar != null && ((HomeUI) dVar).mo101320k());
            Log.m105927v("MicroMsg.LauncherUI.NewChattingTabUI", "ashutest::on swipe %f, duration %d, resumeStatus %b", objArr);
            if (!newChattingTabUI.mo101504j()) {
                z = true;
            } else {
                int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                if (i == 0 && !newChattingTabUI.f214585l) {
                    newChattingTabUI.mo101508n(0);
                    ImageView imageView = (ImageView) newChattingTabUI.f214574a.getWindow().getDecorView().findViewById(C0966R.C0970id.i1m);
                    if (imageView != null) {
                        Log.m105924i("MicroMsg.LauncherUI.NewChattingTabUI", "[onSwipe] prepareView GONE no cache!");
                        imageView.setVisibility(8);
                        imageView.setImageDrawable((Drawable) null);
                    }
                    Animation animation = newChattingTabUI.f214592s;
                    if (animation != null) {
                        animation.cancel();
                    }
                } else if (f2 == 1.0f && !newChattingTabUI.f214585l && !newChattingTabUI.f214587n.mo102032a0()) {
                    newChattingTabUI.f214574a.getWindow().setBackgroundDrawableResource(C0966R.color.a_h);
                    ImageView imageView2 = (ImageView) newChattingTabUI.f214574a.getWindow().getDecorView().findViewById(C0966R.C0970id.i1m);
                    if (!(imageView2 == null || imageView2.getVisibility() != 0 || imageView2.getTag() == null)) {
                        View view = (View) imageView2.getTag();
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/NewChattingTabUI", "onSwipe", "(F)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/ui/NewChattingTabUI", "onSwipe", "(F)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        Log.m105924i("MicroMsg.LauncherUI.NewChattingTabUI", "[onSwipe] prepareView GONE");
                        imageView2.setVisibility(8);
                        imageView2.setVisibility(8);
                    }
                    if (newChattingTabUI.f214587n.getContentView() == null || newChattingTabUI.f214587n.getContentView().getX() > 0.0f) {
                        newChattingTabUI.mo101508n(0);
                    } else {
                        newChattingTabUI.mo101508n(8);
                    }
                }
                if (!((HomeUI) newChattingTabUI.f214575b).mo101320k()) {
                    if (Float.compare(1.0f, f2) > 0) {
                        Log.m105925i("MicroMsg.LauncherUI.NewChattingTabUI", "[onSwipe] return! consumedSuperCall:%s", Boolean.FALSE);
                    } else {
                        z2 = false;
                    }
                }
                MMFragmentActivity mMFragmentActivity = newChattingTabUI.f214574a;
                if (mMFragmentActivity != null) {
                    View findViewById = mMFragmentActivity.findViewById(C0966R.C0970id.f358506fj1);
                    ImageView imageView3 = (ImageView) newChattingTabUI.f214574a.findViewById(C0966R.C0970id.i1m);
                    if (!(imageView3 == null || imageView3.getVisibility() != 8 || imageView3.getDrawable() == null || newChattingTabUI.f214585l || f2 == 1.0f || i == 0)) {
                        imageView3.setVisibility(0);
                        Log.m105924i("MicroMsg.LauncherUI.NewChattingTabUI", "[onSwipe] !1 && !0 prepareView VISIBLE");
                        newChattingTabUI.mo101508n(8);
                    }
                    if (Float.compare(1.0f, f2) <= 0) {
                        C74863w0.m89622c(findViewById, 0.0f, 0.0f);
                        C74863w0.m89622c(imageView3, 0.0f, 0.0f);
                    } else if (imageView3 != null && imageView3.getDrawable() != null) {
                        C74863w0.m89622c(imageView3, (((float) imageView3.getWidth()) / 2.5f) * (1.0f - f2) * -1.0f, 0.0f);
                    } else if (findViewById != null) {
                        C74863w0.m89622c(findViewById, (((float) findViewById.getWidth()) / 2.5f) * (1.0f - f2) * -1.0f, 0.0f);
                    }
                }
                z = z2;
            }
            if (!z) {
                super.onSwipe(f);
            }
        }
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        ActionMode actionMode;
        NewChattingTabUI newChattingTabUI = this.chattingTabUI;
        BaseChattingUIFragment baseChattingUIFragment = newChattingTabUI.f214587n;
        if (baseChattingUIFragment == null || baseChattingUIFragment.mo102029X() == null || !((ChattingUIFragment) newChattingTabUI.f214587n).isSupportNavigationSwipeBack() || C11171e.m11045b(22) || (actionMode = newChattingTabUI.f214587n.mo102029X().f348690u0.mo164184g(callback)) == null) {
            actionMode = null;
        }
        return actionMode == null ? super.onWindowStartingActionMode(callback) : actionMode;
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!(intent == null || intent.getComponent() == null)) {
            C74860u1.f220100a.mo104087a(intent.getComponent().getClassName());
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startChatting(String str, Bundle bundle, boolean z) {
        HomeUI homeUI = this.f214338n;
        homeUI.getClass();
        if (C75592q0.m90762J().booleanValue() && !HomeUI.f214252R.booleanValue()) {
            boolean booleanValue = HomeUI.f214253S.booleanValue();
        }
        if (!C85875k4.m106208w()) {
            MainTabUI mainTabUI = homeUI.f214291t;
            MainUI mainUI = (MainUI) mainTabUI.f214445o.get(0);
            ViewGroup viewGroup = (ViewGroup) mainTabUI.f214431a.findViewById(C0966R.C0970id.f358506fj1);
            boolean z2 = (C85875k4.m106197n0() && (C85875k4.m106157N() || C85875k4.m106158O() || C85875k4.m106208w() || C85875k4.m106171a0())) || C85875k4.m106165V() || C85875k4.m106199o0();
            if (viewGroup != null && !z2) {
                viewGroup.setImportantForAccessibility(4);
            }
            if (mainUI != null) {
                mainUI.onHiddenChanged(true);
            }
            C74931u0.m89763a(mainTabUI.f214431a, 4, mainTabUI.f214435e, "prepareStartChatting");
            MainUI mainUI2 = (MainUI) mainTabUI.f214445o.get(0);
            if (mainUI2 != null) {
                mainUI2.mo103816R();
            }
            MainTabUnreadMgr mainTabUnreadMgr = mainTabUI.f214432b;
            mainTabUnreadMgr.getClass();
            C79547b.f233255g.mo109607a(new C57850t2(mainTabUnreadMgr));
            mainTabUI.f214444n = true;
        } else {
            homeUI.f214291t.f214439i = Boolean.TRUE;
        }
        this.chattingTabUI.mo101509o(str, bundle, z);
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        Class cls = C75457c.class;
        super.superImportUIComponents(hashSet);
        hashSet.addAll(super.importUIComponents());
        hashSet.add(((C75457c) C86312j.m106911c(cls)).mo105805sx());
        hashSet.add(C15702i.class);
        hashSet.add(C15699h.class);
        hashSet.add(((C75457c) C86312j.m106911c(cls)).mo105800RJ());
        hashSet.add(C26539c.class);
        hashSet.add(((C79168k) C86312j.m106911c(C79168k.class)).mo74123Ye());
        hashSet.add(C67323a.class);
    }
}
