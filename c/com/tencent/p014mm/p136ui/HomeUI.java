package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Process;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C67652r0;
import com.tencent.p014mm.autogen.events.DynamicConfigUpdatedEvent;
import com.tencent.p014mm.autogen.events.NotifyMulitTaskIconShowEvent;
import com.tencent.p014mm.autogen.events.UpdateMainActionBarViewEvent;
import com.tencent.p014mm.booter.C28866g0;
import com.tencent.p014mm.booter.C67835f0;
import com.tencent.p014mm.booter.C67852y;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.modelimage.C68118i0;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.p136ui.MainTabUnreadMgr;
import com.tencent.p014mm.p136ui.conversation.MainUI;
import com.tencent.p014mm.p136ui.tools.TestTimeForChatting;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.multitask.C105918j;
import com.tencent.p014mm.plugin.newtips.model.C115619a;
import com.tencent.p014mm.plugin.newtips.model.C115624i;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.C57276k;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import eb0.C75576f4;
import eb0.C7624i3;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75706q0;
import ft3.C8206g;
import go3.C76019y;
import ht1.C76244c4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import ky2.C10432i;
import l20.C21388a;
import nc0.C76850a;
import nj3.C88989a;
import nj3.C88990b;
import ob0.C35136m;
import p156gj.C87203t;
import p182kk.C61104a;
import p206nj.C11171e;
import p255vr.C65873e;
import p327ct.C30914c;
import p498dv.C75457c;
import p626nv.C109759g;
import p773yy.C79168k;
import p787ai.C79547b;
import qy2.C63347a;
import qy2.C77448f0;
import su0.C13781a;
import te3.tg4;
import uk2.C14201c;
import vo3.C111568i;
import wx2.C78736a;
import xi3.C78844a;
import zt3.C119157j;

@C88989a(3)
/* renamed from: com.tencent.mm.ui.HomeUI */
public class HomeUI implements LauncherUI.C73063d, LauncherUI.C73066g, LauncherUI.C73064e, C78736a {

    /* renamed from: R */
    public static Boolean f214252R;

    /* renamed from: S */
    public static Boolean f214253S;

    /* renamed from: T */
    public static boolean f214254T = true;

    /* renamed from: A */
    public View f214255A;

    /* renamed from: B */
    public ImageView f214256B;

    /* renamed from: C */
    public MenuItem f214257C;

    /* renamed from: D */
    public MenuItem f214258D;

    /* renamed from: E */
    public Menu f214259E;

    /* renamed from: F */
    public boolean f214260F = true;

    /* renamed from: G */
    public int f214261G = 0;

    /* renamed from: H */
    public long f214262H = 0;

    /* renamed from: I */
    public View f214263I;

    /* renamed from: J */
    public IListener f214264J;

    /* renamed from: K */
    public IListener f214265K;

    /* renamed from: L */
    public MessageQueue.IdleHandler f214266L;

    /* renamed from: M */
    public Runnable f214267M;

    /* renamed from: N */
    public int f214268N;

    /* renamed from: O */
    public long f214269O;

    /* renamed from: P */
    public LinkedList<Runnable> f214270P;

    /* renamed from: Q */
    public C75706q0 f214271Q;

    /* renamed from: a */
    public boolean f214272a = false;

    /* renamed from: b */
    public boolean f214273b = false;

    /* renamed from: c */
    public ActionBar f214274c;

    /* renamed from: d */
    public View f214275d;

    /* renamed from: e */
    public TextView f214276e;

    /* renamed from: f */
    public WeImageView f214277f;

    /* renamed from: g */
    public boolean f214278g = false;

    /* renamed from: h */
    public String f214279h;

    /* renamed from: i */
    public String f214280i;

    /* renamed from: j */
    public String f214281j;

    /* renamed from: k */
    public C74755f3 f214282k;

    /* renamed from: l */
    public boolean f214283l = true;

    /* renamed from: m */
    public int f214284m = 0;

    /* renamed from: n */
    public int f214285n = 0;

    /* renamed from: o */
    public int f214286o = 0;

    /* renamed from: p */
    public ActivityStatus f214287p = ActivityStatus.ACTIVITY_CREATE;

    /* renamed from: q */
    public MMFragmentActivity f214288q;

    /* renamed from: r */
    public LauncherUI.C73062c f214289r;

    /* renamed from: s */
    public GlobalAlertMgr f214290s;

    /* renamed from: t */
    public MainTabUI f214291t = new MainTabUI();

    /* renamed from: u */
    public View.OnLayoutChangeListener f214292u = new View.OnLayoutChangeListener(this) {
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        }
    };

    /* renamed from: v */
    public boolean f214293v = LocaleUtil.isChineseAppLang();

    /* renamed from: w */
    public PlusActionView f214294w;

    /* renamed from: x */
    public View f214295x;

    /* renamed from: y */
    public ImageView f214296y;

    /* renamed from: z */
    public View f214297z;

    /* renamed from: com.tencent.mm.ui.HomeUI$ActivityStatus */
    public enum ActivityStatus {
        ACTIVITY_CREATE,
        ACTIVITY_RESUME,
        ACTIVITY_PAUSE
    }

    /* renamed from: com.tencent.mm.ui.HomeUI$PlusActionView */
    public class PlusActionView implements C115619a {
        public PlusActionView(int i, int i2) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(i, i2);
            View inflate = LayoutInflater.from(HomeUI.this.f214288q).inflate(C0966R.C0971layout.f6306b8, (ViewGroup) null);
            HomeUI.this.f214295x = inflate;
            HomeUI.this.f214296y = (ImageView) inflate.findViewById(C0966R.C0970id.f15);
            HomeUI.this.f214297z = HomeUI.this.f214295x.findViewById(C0966R.C0970id.kmx);
            HomeUI.this.f214295x.setLayoutParams(layoutParams);
            HomeUI.this.f214295x.setMinimumHeight(i2);
            HomeUI.this.f214295x.setMinimumWidth(i);
            HomeUI.this.f214296y.setImageResource(C0966R.raw.icons_outlined_add2);
            HomeUI.this.f214295x.setContentDescription(HomeUI.this.mo101318i(C0966R.string.k3h));
            HomeUI.this.f214295x.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/mm/ui/HomeUI$PlusActionView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175762a(3);
                    C115669n.INSTANCE.kvStat(10919, "0");
                    HomeUI homeUI = HomeUI.this;
                    Boolean bool = HomeUI.f214252R;
                    homeUI.mo101322m();
                    if (HomeUI.f214252R.booleanValue()) {
                        HomeUI homeUI2 = HomeUI.this;
                        Boolean bool2 = Boolean.TRUE;
                        homeUI2.mo101323n(bool2, bool2);
                    }
                    if (HomeUI.f214253S.booleanValue()) {
                        HomeUI.this.mo101323n(Boolean.TRUE, Boolean.FALSE);
                    }
                    if (!WeChatEnvironment.isMonkeyEnv()) {
                        long nowMilliSecond = Util.nowMilliSecond();
                        HomeUI homeUI3 = HomeUI.this;
                        if (nowMilliSecond - homeUI3.f214262H > 10000) {
                            homeUI3.f214262H = nowMilliSecond;
                            homeUI3.f214261G = 1;
                        } else {
                            int i = homeUI3.f214261G + 1;
                            homeUI3.f214261G = i;
                            if (i >= 5) {
                                Log.m105928w("MicroMsg.LauncherUI.HomeUI", "Switch to MonkeyEnv now.");
                                WeChatEnvironment.setMonkeyEnv(true);
                            }
                        }
                    }
                    C117292a.m165361g(this, "com/tencent/mm/ui/HomeUI$PlusActionView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            HomeUI.this.f214295x.post(new Runnable() {
                public void run() {
                    HomeUI.this.f214288q.supportInvalidateOptionsMenu();
                }

                public String toString() {
                    return super.toString() + "|supportInvalidateOptionsMenu";
                }
            });
        }

        /* renamed from: e */
        public View mo64133e() {
            return HomeUI.this.f214295x;
        }

        /* renamed from: f */
        public boolean mo25956f(boolean z) {
            if (z) {
                View view = HomeUI.this.f214297z;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/HomeUI$PlusActionView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/HomeUI$PlusActionView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return true;
            }
            View view3 = HomeUI.this.f214297z;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/HomeUI$PlusActionView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/HomeUI$PlusActionView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }

        /* renamed from: g */
        public boolean mo25958g(boolean z, tg4 tg4) {
            return false;
        }

        public String getPath() {
            return "plus";
        }

        /* renamed from: h */
        public boolean mo25960h(boolean z) {
            return false;
        }

        /* renamed from: i */
        public boolean mo25962i(boolean z, tg4 tg4) {
            return false;
        }

        /* renamed from: j */
        public boolean mo64135j(boolean z, tg4 tg4) {
            return false;
        }

        /* renamed from: k */
        public void mo64136k(C115631n nVar, boolean z) {
            C115624i.m162566b(this, nVar, z);
        }

        /* renamed from: l */
        public boolean mo64137l() {
            return false;
        }

        /* renamed from: m */
        public boolean mo64138m(boolean z) {
            return C115624i.m162576l(z, this);
        }

        /* renamed from: n */
        public boolean mo64139n(boolean z, tg4 tg4) {
            return false;
        }

        /* renamed from: o */
        public void mo64140o(boolean z, C115631n nVar) {
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f214252R = bool;
        f214253S = bool;
    }

    public HomeUI() {
        new HashMap();
        C40008f fVar = C40008f.f107254d;
        this.f214264J = new IListener<DynamicConfigUpdatedEvent>(fVar) {
            {
                this.__eventId = -443124368;
            }

            public boolean callback(IEvent iEvent) {
                DynamicConfigUpdatedEvent dynamicConfigUpdatedEvent = (DynamicConfigUpdatedEvent) iEvent;
                View view = HomeUI.this.f214295x;
                if (view != null) {
                    view.post(new Runnable() {
                        public void run() {
                            HomeUI homeUI = HomeUI.this;
                            Boolean bool = HomeUI.f214252R;
                            homeUI.mo101326q(true);
                        }

                        public String toString() {
                            return super.toString() + "|updatePlusMenuNewTips";
                        }
                    });
                }
                MainTabUnreadMgr mainTabUnreadMgr = HomeUI.this.f214291t.f214432b;
                mainTabUnreadMgr.getClass();
                C79547b.f233255g.mo109607a(new C57849s2(mainTabUnreadMgr));
                return false;
            }
        };
        this.f214265K = new IListener<NotifyMulitTaskIconShowEvent>(fVar) {
            {
                this.__eventId = 871897161;
            }

            public boolean callback(IEvent iEvent) {
                final NotifyMulitTaskIconShowEvent notifyMulitTaskIconShowEvent = (NotifyMulitTaskIconShowEvent) iEvent;
                TextView textView = HomeUI.this.f214276e;
                if (textView == null) {
                    return false;
                }
                textView.post(new Runnable() {
                    public void run() {
                        HomeUI homeUI = HomeUI.this;
                        boolean z = notifyMulitTaskIconShowEvent.f193766d.f193767a;
                        Boolean bool = HomeUI.f214252R;
                        homeUI.mo101314f(z);
                    }

                    public String toString() {
                        return super.toString() + "|updateMultiTaskIcon";
                    }
                });
                return false;
            }
        };
        this.f214266L = new MessageQueue.IdleHandler() {
            public boolean queueIdle() {
                if (Util.nullAsNil((Integer) C97625j3.m125812b().mo105906u().mo119684e(15, (Object) null)) == 0) {
                    Log.m105920e("MicroMsg.LauncherUI.HomeUI", "not init finish , do not post sync task");
                    return false;
                }
                String a = C7624i3.f25910c.mo19a("login_user_name", "");
                if (C97625j3.m125820j() || !a.equals("")) {
                    C97625j3.m125815e().mo123460f(new C75576f4(new C75576f4.C75578b(this) {
                        /* renamed from: a */
                        public void mo57753a(C114770g gVar) {
                        }
                    }, "launch normal"));
                }
                ThreadPool.post(new C67835f0(new C28866g0(HomeUI.this.f214288q)), "StartupReport_report");
                SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("mm_proc_startup", 0);
                MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("mm_proc_startup");
                MultiProcessMMKV.transport2MMKV(sharedPreferences, singleMMKV);
                String[] split = singleMMKV.getString("startup_info", "").split("=");
                if (split != null && split.length > 0) {
                    C67852y.C67853a aVar = new C67852y.C67853a();
                    if (aVar.mo93243a(split[split.length - 1])) {
                        aVar.f194764e = Process.myPid();
                        split[split.length - 1] = aVar.toString();
                    }
                }
                int myPid = Process.myPid();
                int nowSecond = (int) Util.nowSecond();
                String b = C67852y.m80217b(split);
                String format = String.format("%d,%d,%d,%d,%d", new Object[]{2, 1, Integer.valueOf(myPid), Integer.valueOf(nowSecond), 0});
                if (b.length() > 0) {
                    format = b + "=" + format;
                }
                Log.m105919d("MicroMsg.ProcessReport", "startProc new info %s", format);
                singleMMKV.edit().putString("startup_info", format).commit();
                HomeUI.this.getClass();
                ((C119157j) C119157j.f356862d).mo183875f(new Runnable(this) {
                    public void run() {
                        try {
                            C57276k.m66021c();
                        } catch (Throwable th) {
                            Log.m105920e("MicroMsg.LauncherUI.HomeUI", "loadFilesToReport error message : " + th.getMessage());
                        }
                    }
                });
                C68118i0.C68121c cVar = C68118i0.m80524a().f195775b;
                cVar.getClass();
                Log.m105924i("MicroMsg.SendImgSpeeder", "POOL_AUTO_FILL_SIZE is 0");
                synchronized (cVar) {
                    cVar.mo93630a();
                    cVar.mo93631b();
                }
                Looper.myQueue().removeIdleHandler(HomeUI.this.f214266L);
                return false;
            }
        };
        this.f214267M = new Runnable() {
            public void run() {
                ((C14201c) C86312j.m106911c(C14201c.class)).mo12578gN().mo6118a(14, C61104a.m71654j());
                if ((!C61104a.m71651g(HomeUI.this.f214288q) || C61104a.m71665u(HomeUI.this.f214288q)) && !C61104a.m71647c(HomeUI.this.f214288q, true)) {
                    Intent intent = new Intent();
                    intent.putExtra("BaseScanUI_select_scan_mode", 1);
                    intent.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 0);
                    intent.putExtra("key_enable_multi_code", true);
                    intent.putExtra("key_scan_goods_enable_dynamic_wording", true);
                    intent.putExtra("key_enable_scan_code_product_merge", true);
                    intent.putExtra("key_scan_entry_scene", 5);
                    intent.setFlags(65536);
                    C115669n.INSTANCE.mo160131h(11409, new Object[0]);
                    C88144b.m109791i(HomeUI.this.f214288q, "scanner", ".ui.BaseScanUI", intent, (Bundle) null);
                }
            }
        };
        this.f214268N = 0;
        this.f214269O = SystemClock.elapsedRealtime();
        this.f214270P = new LinkedList<>();
        this.f214271Q = new C75706q0() {
            /* renamed from: o */
            public void mo25945o(String str, Map<String, String> map, C35136m.C35137a aVar) {
                if (Util.nullAsNil(str).equals("showprivacypolicy") && map != null) {
                    HomeUI.this.f214279h = map.get(".sysmsg.showprivacypolicy.doublecheck_content");
                    HomeUI.this.f214280i = map.get(".sysmsg.showprivacypolicy.doublecheck_ok");
                    HomeUI.this.f214281j = map.get(".sysmsg.showprivacypolicy.doublecheck_cancel");
                    boolean equals = "yes".equals(map.get(".sysmsg.showprivacypolicy.needbirthday"));
                    boolean equals2 = "yes".equals(map.get(".sysmsg.showprivacypolicy.needopenplatform"));
                    boolean equals3 = "yes".equals(map.get(".sysmsg.showprivacypolicy.needconfirm"));
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_NEED_BIRTHDAY_BOOLEAN_SYNC, Boolean.valueOf(equals));
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_NEED_OPENPLATFORM_BOOLEAN_SYNC, Boolean.valueOf(equals2));
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_NEED_CONFIRM_BOOLEAN_SYNC, Boolean.valueOf(equals3));
                    HomeUI homeUI = HomeUI.this;
                    Log.m105925i("MicroMsg.LauncherUI.HomeUI", "showprivacypolicy onNewXmlReceived, doubleCheckContent:%s, doubleCheckOk:%s, doubleCheckCancel:%s, needBirthday:%s, needOpenPlatform:%s, needConfirm:%s", homeUI.f214279h, homeUI.f214280i, homeUI.f214281j, Boolean.valueOf(equals), Boolean.valueOf(equals2), Boolean.valueOf(equals3));
                    if (C8206g.f27135a.mo9260a(map.get(".sysmsg.showprivacypolicy.device_id"), C87203t.m108273i(), "showprivacypolicy", false)) {
                        String obj = C86709a0.m107535s().mo121142i().mo119684e(274436, "").toString();
                        String string = HomeUI.this.f214288q.getString(C0966R.string.g5g, new Object[]{LocaleUtil.getApplicationLanguage(), obj, "login", 1, Integer.valueOf(equals2 ? 1 : 0)});
                        if (C76850a.m92639k(obj)) {
                            Log.m105925i("MicroMsg.LauncherUI.HomeUI", "eu true, needconfirm: %s", Boolean.valueOf(equals3));
                            if (!equals3) {
                                Bundle bundle = new Bundle();
                                bundle.putString("close_dialog_msg", HomeUI.this.f214279h);
                                bundle.putString("close_dialog_cancel", HomeUI.this.f214281j);
                                bundle.putString("close_dialog_ok", HomeUI.this.f214280i);
                                bundle.putBoolean("close_dialog_ok_close", false);
                                HomeUI.m85903d(HomeUI.this, string, 22722, bundle);
                            } else {
                                HomeUI homeUI2 = HomeUI.this;
                                HomeUI.m85904e(homeUI2, string, 22722, homeUI2.f214288q.getString(C0966R.string.fdr, new Object[]{LocaleUtil.getApplicationLanguage()}));
                            }
                        } else {
                            Log.m105924i("MicroMsg.LauncherUI.HomeUI", "eu false");
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("close_dialog_msg", HomeUI.this.f214288q.getString(C0966R.string.g5b));
                            bundle2.putString("close_dialog_cancel", HomeUI.this.f214288q.getString(C0966R.string.f360974ge0));
                            bundle2.putString("close_dialog_ok", HomeUI.this.f214288q.getString(C0966R.string.g5f));
                            bundle2.putBoolean("close_dialog_ok_close", false);
                            HomeUI.m85903d(HomeUI.this, string, 22722, bundle2);
                        }
                        C88990b.m111197f(HomeUI.this.f214288q);
                        return;
                    }
                    Log.m105924i("MicroMsg.LauncherUI.HomeUI", "device id not match");
                }
            }
        };
    }

    /* renamed from: d */
    public static void m85903d(HomeUI homeUI, String str, int i, Bundle bundle) {
        homeUI.getClass();
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        if (bundle != null) {
            intent.putExtra("key_close_action", 1);
            intent.putExtra("key_close_data", bundle);
        }
        intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
        intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
        if (i > 0) {
            C88144b.m109795m(homeUI.f214288q, "webview", ".ui.tools.WebViewUI", intent, i);
        } else {
            C88144b.m109791i(homeUI.f214288q, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: e */
    public static void m85904e(HomeUI homeUI, String str, int i, String str2) {
        homeUI.getClass();
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        if (!Util.isNullOrNil(str2)) {
            intent.putExtra("key_close_action", 2);
            Bundle bundle = new Bundle();
            bundle.putString("close_jump_url", str2);
            bundle.putInt("close_jump_url_request_code", 206);
            intent.putExtra("key_close_data", bundle);
        }
        intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
        intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
        if (i > 0) {
            C88144b.m109795m(homeUI.f214288q, "webview", ".ui.tools.WebViewUI", intent, i);
        } else {
            C88144b.m109791i(homeUI.f214288q, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: a */
    public void mo101311a(float f, int i, int i2) {
        MMFragment g = getMainTabUI().mo101423g();
        if (g == null) {
            return;
        }
        if (g instanceof MoreTabUI) {
            mo101324o(this.f214288q.getResources().getColor(C0966R.color.ahf));
            return;
        }
        if (!(g instanceof MainUI)) {
            mo101324o(this.f214288q.getResources().getColor(C0966R.color.a7_));
        } else {
            mo101324o(i);
        }
        if (i2 > 10) {
            mo101317h(this.f214255A, false);
            mo101317h(this.f214295x, false);
            return;
        }
        mo101317h(this.f214255A, true);
        mo101317h(this.f214295x, true);
    }

    /* renamed from: b */
    public void mo101312b(boolean z) {
        Log.m105925i("MicroMsg.LauncherUI.HomeUI", "alvinluo updateStatusBar show: %b", Boolean.valueOf(z));
        mo101328s(this.f214288q.getResources().getColor(z ? C0966R.color.a7_ : C0966R.color.ahf));
    }

    /* renamed from: c */
    public void mo101313c(float f, int i, int i2) {
        TextView textView;
        if (!(i == 0 || (textView = this.f214276e) == null)) {
            textView.setTextColor(i);
        }
        ImageView imageView = this.f214256B;
        if (imageView != null) {
            imageView.setImageDrawable(C74933u4.m89768e(this.f214288q, C0966R.raw.actionbar_icon_dark_search, i2));
        }
        ImageView imageView2 = this.f214296y;
        if (imageView2 != null) {
            imageView2.setImageDrawable(C74933u4.m89768e(this.f214288q, C0966R.raw.icons_outlined_add2, i2));
        }
    }

    /* renamed from: f */
    public final void mo101314f(boolean z) {
        Class cls = C75457c.class;
        Class cls2 = C105918j.class;
        if (!(((this.f214291t.mo101423g() instanceof MainUI) && ((C105918j) C86312j.m106911c(cls2)).mo151022kF()) && !((C105918j) C86312j.m106911c(cls2)).mo151015B4()) || !z) {
            LinearLayout linearLayout = (LinearLayout) this.f214274c.mo91099j().findViewById(C0966R.C0970id.f5470g0);
            if (linearLayout != null) {
                linearLayout.setFocusable(false);
                linearLayout.setClickable(false);
            }
            ((ImageView) this.f214274c.mo91099j().findViewById(C0966R.C0970id.f5471g1)).setVisibility(4);
            ((C75457c) C86312j.m106911c(cls)).mo105801Rv(this.f214288q).mo90993a(false);
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) this.f214274c.mo91099j().findViewById(C0966R.C0970id.f5470g0);
        if (linearLayout2 != null) {
            linearLayout2.setFocusable(true);
            linearLayout2.setClickable(true);
        }
        ImageView imageView = (ImageView) this.f214274c.mo91099j().findViewById(C0966R.C0970id.f5471g1);
        imageView.setVisibility(0);
        imageView.setAlpha(1.0f);
        View j = this.f214274c.mo91099j();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view = j;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/HomeUI", "checkMultiTaskIconShowIfNeed", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        j.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/HomeUI", "checkMultiTaskIconShowIfNeed", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((C75457c) C86312j.m106911c(cls)).mo105801Rv(this.f214288q).mo90993a(true);
    }

    /* renamed from: g */
    public void mo101315g() {
        MainUI mainUI;
        MainTabUI mainTabUI = this.f214291t;
        boolean z = this.f214272a;
        boolean z2 = false;
        Log.m105927v("MicroMsg.LauncherUI.MainTabUI", "doOnPause %d, mainTabHasCreate:%b", Integer.valueOf(mainTabUI.f214435e), Boolean.valueOf(z));
        if (z && (mainUI = (MainUI) mainTabUI.f214445o.get(0)) != null) {
            mainUI.mo103816R();
        }
        MainTabUnreadMgr mainTabUnreadMgr = mainTabUI.f214432b;
        mainTabUnreadMgr.getClass();
        if (C97625j3.m125811a()) {
            C97625j3.m125812b().mo105906u().remove(mainTabUnreadMgr.f214461r);
            C97625j3.m125812b().mo105908w().remove(mainTabUnreadMgr);
            ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33504m(mainTabUnreadMgr.f214460q);
            mainTabUnreadMgr.f214462s.dead();
            mainTabUnreadMgr.f214457n.dead();
            mainTabUnreadMgr.f214458o.dead();
        }
        C76244c4 c4Var = mainTabUnreadMgr.f214452f;
        if (c4Var != null) {
            c4Var.onPause();
        }
        MainTabUnreadMgr.C73091e eVar = mainTabUnreadMgr.f214459p;
        if (eVar != null) {
            eVar.f214467a = null;
            mainTabUnreadMgr.f214459p = null;
        }
        GlobalAlertMgr globalAlertMgr = this.f214290s;
        if (!(globalAlertMgr == null || globalAlertMgr.f214229i == null)) {
            C97625j3.m125815e().mo123470p(255, globalAlertMgr.f214229i);
            C97625j3.m125815e().mo123470p(384, globalAlertMgr.f214229i);
            globalAlertMgr.f214229i = null;
        }
        CrashReportFactory.setForeground(false);
        this.f214287p = ActivityStatus.ACTIVITY_PAUSE;
        if (!(C97625j3.f286396b == null)) {
            ((MMNotification) C97625j3.m125816f()).mo93212i(false);
        }
        LauncherUI.C73062c cVar = this.f214289r;
        if (cVar != null) {
            z2 = ((NewChattingTabUI) cVar).mo101503i();
        }
        Log.m105924i("MicroMsg.LauncherUI.HomeUI", "edw onPause, chatting is show " + z2);
        if (!z2) {
            C74931u0.m89763a(this.f214288q, 4, this.f214291t.f214435e, "directReport_onPause");
        }
        if (!this.f214288q.isFinishing()) {
            C76019y.m91316d(this.f214288q);
        }
        if (this.f214272a) {
            Log.m105918d("MicroMsg.LauncherUI.HomeUI", "KEVIN MainTabUI onMainTabPause");
            C79547b bVar = C79547b.f233255g;
            synchronized (bVar) {
                bVar.f233259d = true;
                if (bVar.f233257b) {
                    bVar.mo109608b();
                }
            }
            if (C97625j3.m125811a()) {
                this.f214264J.dead();
            }
        }
        C74755f3 f3Var = this.f214282k;
        if (f3Var != null && f3Var.mo104069c()) {
            this.f214282k.mo104068a();
        }
    }

    public MainTabUI getMainTabUI() {
        return this.f214291t;
    }

    /* renamed from: h */
    public final void mo101317h(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (z) {
            view.setClickable(true);
            return;
        }
        view.setClickable(false);
        view.setBackgroundResource(C0966R.color.ahf);
    }

    /* renamed from: i */
    public String mo101318i(int i) {
        return this.f214288q.getString(i);
    }

    /* renamed from: j */
    public final void mo101319j() {
        TextView textView;
        if (((NewChattingTabUI) this.f214289r).mo101503i()) {
            Log.m105928w("MicroMsg.LauncherUI.HomeUI", "[initActionBar] isChattingForeground True!");
            return;
        }
        this.f214278g = C85875k4.m106211z();
        this.f214274c.mo91091I(new ColorDrawable(this.f214288q.getResources().getColor(17170445)));
        boolean z = false;
        this.f214274c.mo91088F(false);
        this.f214274c.mo91084B(false);
        this.f214274c.mo91087E(false);
        this.f214274c.mo91086D(true);
        this.f214274c.mo91114y(C85868k2.m106137b(this.f214288q).inflate(C0966R.C0971layout.f6312bd, new LinearLayout(this.f214288q), false));
        ImageView imageView = (ImageView) this.f214274c.mo91099j().findViewById(C0966R.C0970id.f5471g1);
        if (imageView != null) {
            imageView.getDrawable().setColorFilter(this.f214288q.getResources().getColor(C0966R.color.FG_0), PorterDuff.Mode.SRC_ATOP);
        }
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/HomeUI$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                ((C75457c) C86312j.m106911c(C75457c.class)).mo105801Rv(HomeUI.this.f214288q).mo90996l2(true);
                C117292a.m165361g(this, "com/tencent/mm/ui/HomeUI$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if (((Integer) C79758p.f233760a.mo109878a(C104160f.RepairerConfig_Global_PullDownParamSetting_Int, 0)).intValue() == 1) {
            z = true;
        }
        if (z && (textView = (TextView) this.f214274c.mo91099j().findViewById(16908308)) != null) {
            textView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/mm/ui/HomeUI$26", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    new C111568i(HomeUI.this.f214288q).show();
                    C117292a.m165361g(this, "com/tencent/mm/ui/HomeUI$26", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
        ActionBar actionBar = this.f214274c;
        MMFragmentActivity mMFragmentActivity = this.f214288q;
        actionBar.mo91112w(C74933u4.m89768e(mMFragmentActivity, C0966R.color.f3275lu, mMFragmentActivity.getResources().getColor(C0966R.color.BW_0_Alpha_0_9)));
        mo101330u(true);
        this.f214274c.mo91099j().findViewById(C0966R.C0970id.f5467fx).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/HomeUI$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                HomeUI homeUI = HomeUI.this;
                if (elapsedRealtime - homeUI.f214269O < 300) {
                    Iterator<Runnable> it = homeUI.f214270P.iterator();
                    while (it.hasNext()) {
                        it.next().run();
                    }
                }
                HomeUI.this.f214269O = SystemClock.elapsedRealtime();
                C117292a.m165361g(this, "com/tencent/mm/ui/HomeUI$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
    }

    /* renamed from: k */
    public boolean mo101320k() {
        return this.f214287p == ActivityStatus.ACTIVITY_RESUME;
    }

    /* renamed from: l */
    public final void mo101321l() {
        int i = this.f214291t.f214435e;
        if (i == 0) {
            ((MainUI) getMainTabUI().mo101423g()).getClass();
        }
        ((C65873e) C86312j.m106911c(C65873e.class)).mo89915LO(this.f214288q, ".ui.FTSMainUI", new Intent().putExtra("from_tab_index", i).putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2414g3).putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2415g4));
    }

    /* renamed from: m */
    public final void mo101322m() {
        if (this.f214282k != null && C97625j3.m125811a()) {
            if (this.f214282k.mo104069c()) {
                this.f214282k.mo104068a();
            } else {
                this.f214282k.mo103923d();
            }
        }
    }

    /* renamed from: n */
    public final void mo101323n(Boolean bool, Boolean bool2) {
    }

    /* renamed from: o */
    public final void mo101324o(int i) {
        ActionBar actionBar = this.f214274c;
        if (actionBar != null) {
            actionBar.mo91112w(new ColorDrawable(i));
        }
        View view = this.f214275d;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    /* renamed from: p */
    public final void mo101325p() {
        MMFragmentActivity mMFragmentActivity = this.f214288q;
        if (mMFragmentActivity != null) {
            try {
                mMFragmentActivity.moveTaskToBack(true);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.LauncherUI.HomeUI", e, "", new Object[0]);
            }
        }
        if (C97625j3.m125811a()) {
            C86709a0.m107525e().postToWorkerDelayed(new Runnable(this) {
                public void run() {
                    C85801v1 u;
                    if (C97625j3.m125811a() && (u = C97625j3.m125812b().mo105906u()) != null) {
                        u.mo119681a(true);
                    }
                }
            }, 500);
        }
        if (C67652r0.f193463c == null) {
            C67652r0.f193463c = new C67652r0();
        }
        C67652r0 r0Var = C67652r0.f193463c;
        r0Var.f193464a = false;
        r0Var.f193465b.removeMessages(-1999);
        r0Var.f193465b.removeMessages(-2999);
        r0Var.f193465b.sendEmptyMessageDelayed(-1999, 3000);
        r0Var.f193465b.sendEmptyMessageDelayed(-2999, 30000);
    }

    /* renamed from: q */
    public final void mo101326q(boolean z) {
        if (this.f214282k != null && this.f214295x != null && this.f214294w != null) {
            if (!C97625j3.m125811a()) {
                Log.m105928w("MicroMsg.LauncherUI.HomeUI", "want update more menu new tips, but mmcore not ready");
                return;
            }
            this.f214282k.f219823u.mo101597a(z);
            PlusActionView plusActionView = this.f214294w;
            boolean z2 = true;
            if (!C115624i.m162576l(HomeUI.this.f214282k.f219823u.f214720a > 0, plusActionView)) {
                HomeUI homeUI = HomeUI.this;
                if (homeUI.f214282k.f219823u.f214720a > 0) {
                    View view = homeUI.f214297z;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/HomeUI$PlusActionView", "compatCallBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/ui/HomeUI$PlusActionView", "compatCallBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    View view3 = homeUI.f214297z;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/HomeUI$PlusActionView", "compatCallBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/ui/HomeUI$PlusActionView", "compatCallBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C115624i.m162566b(plusActionView, C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT, HomeUI.this.f214282k.f219823u.f214720a > 0);
            }
            UpdateMainActionBarViewEvent updateMainActionBarViewEvent = new UpdateMainActionBarViewEvent();
            UpdateMainActionBarViewEvent.C67809a aVar3 = updateMainActionBarViewEvent.f193990d;
            aVar3.f193991a = 2;
            if (this.f214282k.f219823u.f214720a <= 0) {
                z2 = false;
            }
            aVar3.f193993c = z2;
            aVar3.getClass();
            updateMainActionBarViewEvent.publish();
        }
    }

    /* renamed from: r */
    public void mo101327r(FitSystemWindowLayoutView fitSystemWindowLayoutView, int i, Rect rect, ViewGroup viewGroup) {
        this.f214288q.getWindow().getDecorView().getBottom();
        this.f214288q.getSupportActionBar().mo91099j().getBottom();
        fitSystemWindowLayoutView.setActionBarContainer(viewGroup);
        fitSystemWindowLayoutView.fitSystemWindows(rect);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        r0 = r0.f219476o;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101328s(int r5) {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x000d
            boolean r0 = p206nj.C88956h.m111064e()
            if (r0 != 0) goto L_0x000d
            goto L_0x001e
        L_0x000d:
            com.tencent.mm.ui.MMFragmentActivity r0 = r4.f214288q
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131101570(0x7f060782, float:1.7815553E38)
            int r0 = r0.getColor(r1)
            int r5 = com.tencent.p014mm.p136ui.C74933u4.m89765b(r0, r5)
        L_0x001e:
            com.tencent.mm.ui.LauncherUI r0 = com.tencent.p014mm.p136ui.LauncherUI.getInstance()
            r1 = 0
            if (r0 == 0) goto L_0x006a
            com.tencent.mm.ui.MainTabUI r2 = r0.mo101375O7()
            if (r2 == 0) goto L_0x006a
            com.tencent.mm.ui.MainTabUI r0 = r0.mo101375O7()
            java.util.HashMap<java.lang.Integer, com.tencent.mm.ui.MMFragment> r0 = r0.f214445o
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r2)
            com.tencent.mm.ui.conversation.MainUI r0 = (com.tencent.p014mm.p136ui.conversation.MainUI) r0
            if (r0 == 0) goto L_0x0046
            com.tencent.mm.ui.conversation.ConversationListView r0 = r0.f219476o
            if (r0 == 0) goto L_0x0046
            boolean r0 = r0.mo103725k()
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            if (r0 != 0) goto L_0x005d
            java.lang.Class<dv.c> r0 = p498dv.C75457c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            dv.c r0 = (p498dv.C75457c) r0
            com.tencent.mm.ui.MMFragmentActivity r2 = r4.f214288q
            aa2.b r0 = r0.mo105801Rv(r2)
            boolean r0 = r0.mo90994b0()
            if (r0 == 0) goto L_0x006a
        L_0x005d:
            com.tencent.mm.ui.MMFragmentActivity r5 = r4.f214288q
            android.content.res.Resources r5 = r5.getResources()
            r0 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r5 = r5.getColor(r0)
        L_0x006a:
            int r0 = r4.f214268N
            int r0 = r0 - r5
            int r0 = java.lang.Math.abs(r0)
            r2 = 50000(0xc350, float:7.0065E-41)
            if (r0 < r2) goto L_0x0092
            com.tencent.mm.ui.MMFragmentActivity r0 = r4.f214288q     // Catch:{ NullPointerException -> 0x0080 }
            android.view.Window r0 = r0.getWindow()     // Catch:{ NullPointerException -> 0x0080 }
            r0.setStatusBarColor(r5)     // Catch:{ NullPointerException -> 0x0080 }
            goto L_0x0092
        L_0x0080:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2[r1] = r3
            java.lang.String r1 = "MicroMsg.LauncherUI.HomeUI"
            java.lang.String r3 = "updateStatusBar %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r3, r2)
        L_0x0092:
            r4.f214268N = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.HomeUI.mo101328s(int):void");
    }

    /* renamed from: t */
    public final void mo101329t(boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            View decorView = this.f214288q.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            int i = z ? systemUiVisibility & -8193 : systemUiVisibility | 8192;
            if (systemUiVisibility != i) {
                decorView.setSystemUiVisibility(i);
            }
        }
    }

    /* renamed from: u */
    public final void mo101330u(boolean z) {
        MenuItem menuItem;
        MenuItem menuItem2;
        Class cls = C79168k.class;
        if (this.f214283l) {
            int i = this.f214291t.f214435e;
            String i2 = mo101318i(C0966R.string.a0u);
            if (i == 0) {
                if (this.f214291t.mo101425i() > 0) {
                    if (!this.f214293v) {
                        i2 = i2 + " ";
                    }
                    i2 = i2 + "(" + this.f214291t.mo101425i() + ")";
                }
                UpdateMainActionBarViewEvent updateMainActionBarViewEvent = new UpdateMainActionBarViewEvent();
                UpdateMainActionBarViewEvent.C67809a aVar = updateMainActionBarViewEvent.f193990d;
                aVar.f193991a = 1;
                aVar.f193992b = i2.toString();
                updateMainActionBarViewEvent.publish();
            } else if (i == 1) {
                i2 = mo101318i(C0966R.string.glk);
            } else if (i == 2) {
                i2 = mo101318i(C0966R.string.gli);
            } else if (i == 3) {
                i2 = mo101318i(C0966R.string.gmk);
            }
            if (i == 3) {
                mo101328s(this.f214288q.getResources().getColor(C0966R.color.ahf));
                mo101329t((!C77448f0.m93394f() ? false : ((C79168k) C86312j.m106911c(cls)).mo74105BS(C13781a.m13082a())) || C85875k4.m106211z());
                ActionBar actionBar = this.f214274c;
                if (actionBar != null) {
                    actionBar.mo91112w(new ColorDrawable(this.f214288q.getResources().getColor(C0966R.color.ahf)));
                    View j = this.f214274c.mo91099j();
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view = j;
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/ui/HomeUI", "updateSettingTitle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    j.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/ui/HomeUI", "updateSettingTitle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View view2 = this.f214275d;
                if (view2 != null) {
                    view2.setBackgroundColor(this.f214288q.getResources().getColor(C0966R.color.ahf));
                }
                this.f214260F = false;
                Log.m105924i("MicroMsg.LauncherUI.HomeUI", "alvinluo updateSettingTitle");
            } else {
                mo101328s(this.f214288q.getResources().getColor(C0966R.color.a7_));
                mo101329t(this.f214278g);
                Drawable background = this.f214274c.mo91099j().getBackground();
                if (!(background instanceof ColorDrawable)) {
                    this.f214274c.mo91112w(new ColorDrawable(this.f214288q.getResources().getColor(C0966R.color.a7_)));
                } else if (((ColorDrawable) background).getColor() != this.f214288q.getResources().getColor(C0966R.color.a7_)) {
                    this.f214274c.mo91112w(new ColorDrawable(this.f214288q.getResources().getColor(C0966R.color.a7_)));
                }
                if (this.f214274c.mo91099j().getVisibility() != 0) {
                    View j2 = this.f214274c.mo91099j();
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view3 = j2;
                    C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/ui/HomeUI", "updateOtherTitle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    j2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/ui/HomeUI", "updateOtherTitle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.f214260F = true;
                if ((this.f214284m == 2 && this.f214285n == 2) && (menuItem2 = this.f214257C) != null && !menuItem2.isVisible()) {
                    this.f214257C.setVisible(true);
                }
                if ((this.f214284m == 2 && this.f214285n == 2) && (menuItem = this.f214258D) != null && !menuItem.isVisible()) {
                    this.f214258D.setVisible(true);
                }
            }
            this.f214274c.mo91089G(0.0f);
            this.f214274c.mo91105p();
            this.f214276e = (TextView) this.f214274c.mo91099j().findViewById(16908308);
            WeImageView weImageView = (WeImageView) this.f214274c.mo91099j().findViewById(C0966R.C0970id.ewu);
            this.f214277f = weImageView;
            if (weImageView != null) {
                weImageView.setVisibility(8);
            }
            TextView textView = this.f214276e;
            if (textView != null) {
                textView.setText(i2);
                if (z) {
                    C78844a.C15689b.f42385a.mo108838c(this.f214288q, i2.toString());
                }
                if (i == 0) {
                    ((C79168k) C86312j.m106911c(cls)).mo74130ns(this.f214276e, C13781a.m13082a(), C63347a.C47892c.PLANET, C63347a.C47893d.OUTLINED);
                } else {
                    ((C79168k) C86312j.m106911c(cls)).Ng0(this.f214276e, C13781a.m13082a());
                }
                boolean e = ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e();
                WeImageView weImageView2 = this.f214277f;
                if (weImageView2 != null && e && i == 0) {
                    weImageView2.setVisibility(0);
                }
                if (this.f214284m == 3 && this.f214285n == 3) {
                    this.f214276e.setVisibility(8);
                } else {
                    this.f214276e.setVisibility(0);
                }
                if (!C44706b.m49450a()) {
                    float f = (float) C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3619c);
                    if (this.f214276e.getTextSize() != f) {
                        this.f214276e.setTextSize(0, f);
                    }
                } else {
                    C44706b.m49451b(this.f214276e, C0966R.dimen.f3619c);
                    View findViewById = this.f214274c.mo91099j().findViewById(C0966R.C0970id.khl);
                    if (findViewById instanceof TextView) {
                        C44706b.m49451b((TextView) findViewById, C0966R.dimen.f3619c);
                    }
                }
                int color = this.f214288q.getResources().getColor(C0966R.color.f3022ch);
                if (this.f214278g && this.f214276e.getCurrentTextColor() != color) {
                    this.f214276e.setTextColor(color);
                }
                C85875k4.m106189j0(this.f214276e.getPaint(), 0.8f);
            }
            mo101314f(true);
        }
    }

    /* renamed from: com.tencent.mm.ui.HomeUI$FitSystemWindowLayoutView */
    public static class FitSystemWindowLayoutView extends FrameLayout {

        /* renamed from: d */
        public int f214326d;

        /* renamed from: e */
        public Rect f214327e = new Rect();

        /* renamed from: f */
        public ViewGroup f214328f = null;

        public FitSystemWindowLayoutView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean fitSystemWindows(Rect rect) {
            boolean z;
            Object[] objArr = new Object[4];
            objArr[0] = rect.toString();
            objArr[1] = Integer.valueOf(this.f214326d);
            objArr[2] = Integer.valueOf(hashCode());
            objArr[3] = rect.height() == 0 ? Util.getStack() : StateEvent.ActionValue.STAGE_PASS;
            Log.m105925i("MicroMsg.LauncherUI", "fitSystemWindows beg %s, cacheInsetsTop:%d, hashCode:%d stack:%s", objArr);
            int i = rect.top;
            if (i > 0) {
                this.f214326d = i;
            }
            ViewGroup viewGroup = this.f214328f;
            if (viewGroup != null && (viewGroup.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f214328f.getLayoutParams();
                int i2 = marginLayoutParams.bottomMargin;
                int i3 = marginLayoutParams.rightMargin;
                Log.m105925i("MicroMsg.LauncherUI", "try to setFitSystemWindowsBottomRightPadding: %d %d", Integer.valueOf(i2), Integer.valueOf(i3));
                int i4 = 0;
                while (true) {
                    if (i4 >= getChildCount()) {
                        break;
                    }
                    View childAt = getChildAt(i4);
                    if (!(childAt instanceof TestTimeForChatting)) {
                        i4++;
                    } else {
                        TestTimeForChatting testTimeForChatting = (TestTimeForChatting) childAt;
                        if (Float.compare((float) i2, ((float) C76577a.m92151b(testTimeForChatting.getContext(), 48)) * 2.0f) > 0 || i2 < 0) {
                            Log.m105929w("MicroMsg.TestTimeForChatting", "ERROR bottom padding %d", Integer.valueOf(i2));
                            testTimeForChatting.f220059f = 0;
                        } else {
                            testTimeForChatting.f220059f = i2;
                        }
                        if (Float.compare((float) i3, ((float) C76577a.m92151b(testTimeForChatting.getContext(), 48)) * 2.0f) > 0 || i3 < 0) {
                            Log.m105929w("MicroMsg.TestTimeForChatting", "ERROR right padding %d", Integer.valueOf(i2));
                            testTimeForChatting.f220060g = 0;
                        } else {
                            testTimeForChatting.f220060g = i3;
                        }
                        Log.m105925i("MicroMsg.LauncherUI", "setFitSystemWindowsUseActionBarContainer: %d %d OK", Integer.valueOf(i2), Integer.valueOf(i3));
                    }
                }
                C85875k4.f250155a.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            this.f214327e.set(rect);
            if (C11171e.m11046c(14)) {
                int i5 = 0;
                while (true) {
                    if (i5 >= getChildCount()) {
                        break;
                    }
                    View childAt2 = getChildAt(i5);
                    if (childAt2 instanceof TestTimeForChatting) {
                        childAt2.setFitsSystemWindows(true);
                        z = ((TestTimeForChatting) childAt2).fitSystemWindows(rect);
                        childAt2.setFitsSystemWindows(false);
                        break;
                    }
                    i5++;
                }
                Log.m105925i("MicroMsg.LauncherUI", "ashu::fitSystemWindows child ret %B, ApiLevel %d", Boolean.valueOf(z), Integer.valueOf(Build.VERSION.SDK_INT));
                boolean fitSystemWindows = super.fitSystemWindows(this.f214327e);
                Log.m105919d("MicroMsg.LauncherUI", "ashu::fitSystemWindows super ret %B", Boolean.valueOf(fitSystemWindows));
                return fitSystemWindows;
            }
            z = false;
            Log.m105925i("MicroMsg.LauncherUI", "ashu::fitSystemWindows child ret %B, ApiLevel %d", Boolean.valueOf(z), Integer.valueOf(Build.VERSION.SDK_INT));
            boolean fitSystemWindows2 = super.fitSystemWindows(this.f214327e);
            Log.m105919d("MicroMsg.LauncherUI", "ashu::fitSystemWindows super ret %B", Boolean.valueOf(fitSystemWindows2));
            return fitSystemWindows2;
        }

        public int getCacheInsetsTop() {
            return this.f214326d;
        }

        public void onMeasure(int i, int i2) {
            try {
                super.onMeasure(i, i2);
            } catch (ClassCastException e) {
                Log.printErrStackTrace("MicroMsg.LauncherUI.HomeUI", e, "", new Object[0]);
                Log.m105921e("MicroMsg.LauncherUI.HomeUI", "my layout params %s %s", getLayoutParams(), getLayoutParams().getClass());
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    Log.m105921e("MicroMsg.LauncherUI.HomeUI", "my child %s %s layout params %s %s", Integer.valueOf(i3), childAt, childAt.getLayoutParams(), childAt.getLayoutParams().getClass());
                }
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt2 = getChildAt(i4);
                    if ((childAt2 instanceof ImageView) && childAt2.getId() == C0966R.C0970id.i1m && childAt2.getLayoutParams() != null && (childAt2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && !(childAt2.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                        childAt2.setLayoutParams(new FrameLayout.LayoutParams(childAt2.getLayoutParams()));
                    }
                    Log.m105921e("MicroMsg.LauncherUI.HomeUI", "my child %s %s layout params %s %s", Integer.valueOf(i4), childAt2, childAt2.getLayoutParams(), childAt2.getLayoutParams().getClass());
                }
                super.onMeasure(i, i2);
            }
        }

        public void setActionBarContainer(ViewGroup viewGroup) {
            this.f214328f = viewGroup;
        }

        public FitSystemWindowLayoutView(Context context) {
            super(context);
        }
    }
}
