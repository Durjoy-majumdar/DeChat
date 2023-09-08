package com.tencent.p014mm.p136ui;

import aa2.C67022b;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.MessageQueue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import ck3.C67398g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.p136ui.HomeUI;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.p136ui.MainTabUI;
import com.tencent.p014mm.p136ui.base.OnLayoutChangedLinearLayout;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.p136ui.conversation.C74720p;
import com.tencent.p014mm.p136ui.conversation.MainUI;
import com.tencent.p014mm.p136ui.tools.C74863w0;
import com.tencent.p014mm.p136ui.tools.TestTimeForChatting;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import go3.C76019y;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import nj3.C34861g1;
import nj3.C88990b;
import p206nj.C11171e;
import p605mj.C34575a;
import p680ru.C77570i;
import p903ij.C76359b;
import uj3.C78190b;

/* renamed from: com.tencent.mm.ui.NewChattingTabUI */
public class NewChattingTabUI implements LauncherUI.C73062c {

    /* renamed from: a */
    public MMFragmentActivity f214574a;

    /* renamed from: b */
    public LauncherUI.C73063d f214575b;

    /* renamed from: c */
    public long f214576c = 0;

    /* renamed from: d */
    public TestTimeForChatting f214577d;

    /* renamed from: e */
    public int f214578e;

    /* renamed from: f */
    public MessageQueue.IdleHandler f214579f;

    /* renamed from: g */
    public OnLayoutChangedLinearLayout f214580g;

    /* renamed from: h */
    public String f214581h;

    /* renamed from: i */
    public String f214582i;

    /* renamed from: j */
    public Bundle f214583j;

    /* renamed from: k */
    public boolean f214584k;

    /* renamed from: l */
    public boolean f214585l = true;

    /* renamed from: m */
    public boolean f214586m = false;
    /* access modifiers changed from: private */
    public IChattingUIProxy mChattingUIProxy;
    public Runnable mStartChattingRunnable = new C73125d();

    /* renamed from: n */
    public BaseChattingUIFragment f214587n;

    /* renamed from: o */
    public long f214588o;

    /* renamed from: p */
    public C73130g f214589p = new C73130g((C74941w2) null);

    /* renamed from: q */
    public Bitmap f214590q;

    /* renamed from: r */
    public boolean f214591r = false;

    /* renamed from: s */
    public Animation f214592s;

    /* renamed from: t */
    public OnLayoutChangedLinearLayout.C73214a f214593t = new C73126e();

    /* renamed from: u */
    public Animation f214594u;

    /* renamed from: com.tencent.mm.ui.NewChattingTabUI$a */
    public class C73121a implements C67022b.C67023a {
        public C73121a(NewChattingTabUI newChattingTabUI) {
        }

        /* renamed from: a */
        public void mo101511a(int i, int i2) {
            MainTabUI.C73086a aVar;
            LauncherUI instance = LauncherUI.getInstance();
            if (instance != null && instance.mo101375O7() != null && (aVar = instance.mo101375O7().f214437g) != null) {
                HomeUI.C730281 r0 = (HomeUI.C730281) aVar;
                if (i == 1) {
                    if (i2 == 0) {
                        HomeUI homeUI = HomeUI.this;
                        homeUI.mo101328s(homeUI.f214288q.getResources().getColor(C0966R.color.ahf));
                    } else {
                        HomeUI homeUI2 = HomeUI.this;
                        if (homeUI2.f214291t.f214435e == 0) {
                            homeUI2.mo101328s(homeUI2.f214288q.getResources().getColor(C0966R.color.ahf));
                        }
                    }
                }
                Log.m105919d("MicroMsg.LauncherUI.HomeUI", "multiTaskStateChanged, state:%s, curIndex:%s", Integer.valueOf(i), Integer.valueOf(i2));
            }
        }

        /* renamed from: b */
        public void mo101512b(int i) {
            MainTabUI.C73086a aVar;
            LauncherUI instance = LauncherUI.getInstance();
            if (instance != null && instance.mo101375O7() != null && (aVar = instance.mo101375O7().f214437g) != null) {
                HomeUI.C730281 r0 = (HomeUI.C730281) aVar;
                if (i == 0) {
                    HomeUI homeUI = HomeUI.this;
                    homeUI.mo101328s(homeUI.f214288q.getResources().getColor(C0966R.color.ahf));
                } else {
                    HomeUI homeUI2 = HomeUI.this;
                    if (homeUI2.f214291t.f214435e == 3) {
                        homeUI2.mo101328s(homeUI2.f214288q.getResources().getColor(C0966R.color.ahf));
                    } else {
                        homeUI2.mo101328s(homeUI2.f214288q.getResources().getColor(C0966R.color.a7_));
                    }
                }
                Log.m105919d("MicroMsg.LauncherUI.HomeUI", "multiTaskTabChanged, curIndex:%s", Integer.valueOf(i));
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.NewChattingTabUI$b */
    public class C73122b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int[] f214595d;

        /* renamed from: e */
        public final /* synthetic */ HomeUI.FitSystemWindowLayoutView f214596e;

        /* renamed from: f */
        public final /* synthetic */ ViewGroup f214597f;

        /* renamed from: com.tencent.mm.ui.NewChattingTabUI$b$a */
        public class C73123a implements View.OnApplyWindowInsetsListener {
            public C73123a() {
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (windowInsets == null) {
                    return windowInsets;
                }
                Log.m105925i("MicroMsg.LauncherUI.NewChattingTabUI", "OnApplyWindowInsetsListener %s", windowInsets);
                windowInsets.consumeSystemWindowInsets();
                C73122b bVar = C73122b.this;
                ((HomeUI) NewChattingTabUI.this.f214575b).mo101327r(bVar.f214596e, windowInsets.getSystemWindowInsetTop(), new Rect(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom()), C73122b.this.f214597f);
                return windowInsets;
            }
        }

        public C73122b(int[] iArr, HomeUI.FitSystemWindowLayoutView fitSystemWindowLayoutView, ViewGroup viewGroup) {
            this.f214595d = iArr;
            this.f214596e = fitSystemWindowLayoutView;
            this.f214597f = viewGroup;
        }

        public void run() {
            NewChattingTabUI.this.f214574a.getSupportActionBar().mo91099j().getLocationInWindow(this.f214595d);
            int h = NewChattingTabUI.this.mo101502h();
            if (h > 0) {
                ((HomeUI) NewChattingTabUI.this.f214575b).mo101327r(this.f214596e, h, new Rect(0, h, 0, 0), this.f214597f);
            } else if (C11171e.m11046c(20)) {
                this.f214596e.setOnApplyWindowInsetsListener(new C73123a());
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.NewChattingTabUI$c */
    public class C73124c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f214600d;

        /* renamed from: e */
        public final /* synthetic */ String f214601e;

        public C73124c(int i, String str) {
            this.f214600d = i;
            this.f214601e = str;
        }

        public void run() {
            Class cls = C77570i.class;
            int i = this.f214600d;
            ((C77570i) C86312j.m106911c(cls)).mo107725zI(i, "ChattingUI" + this.f214601e, hashCode());
            if (this.f214600d == 4) {
                ((C77570i) C86312j.m106911c(cls)).Ge0("ChattingUI" + this.f214601e, NewChattingTabUI.this.f214576c, Util.nowSecond());
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.NewChattingTabUI$d */
    public class C73125d extends C67398g {
        public C73125d() {
        }

        /* renamed from: a */
        public void mo91597a() {
            if (!NewChattingTabUI.this.f214585l) {
                Log.m105920e("MicroMsg.LauncherUI.NewChattingTabUI", "start chatting but last chatting does't be close!");
                NewChattingTabUI.this.mo101499e(false);
            }
            if (NewChattingTabUI.this.f214574a.isFinishing() || NewChattingTabUI.this.f214574a.isPaused() || !NewChattingTabUI.this.f214585l || !C86709a0.m107523b().mo121114l()) {
                Log.m105929w("MicroMsg.LauncherUI.NewChattingTabUI", "[mStartChattingRunnable] pass! isPause:%s mChattingClosed:%s, account:%s", Boolean.valueOf(NewChattingTabUI.this.f214574a.isPaused()), Boolean.valueOf(NewChattingTabUI.this.f214585l), Boolean.valueOf(C86709a0.m107523b().mo121114l()));
                NewChattingTabUI.this.f214591r = true;
                return;
            }
            NewChattingTabUI.this.f214585l = false;
            Intent putExtra = new Intent().putExtra("Chat_User", NewChattingTabUI.this.f214582i);
            Bundle bundle = NewChattingTabUI.this.f214583j;
            if (bundle != null) {
                putExtra.putExtras(bundle);
            }
            putExtra.putExtra("img_gallery_enter_from_chatting_ui", true);
            NewChattingTabUI.m86091d(NewChattingTabUI.this, putExtra, false);
            NewChattingTabUI newChattingTabUI = NewChattingTabUI.this;
            if (newChattingTabUI.f214580g == null) {
                newChattingTabUI.f214580g = (OnLayoutChangedLinearLayout) newChattingTabUI.f214587n.getView().findViewById(C0966R.C0970id.f357668b43);
            }
            NewChattingTabUI newChattingTabUI2 = NewChattingTabUI.this;
            OnLayoutChangedLinearLayout onLayoutChangedLinearLayout = newChattingTabUI2.f214580g;
            if (onLayoutChangedLinearLayout != null) {
                onLayoutChangedLinearLayout.setOnChattingLayoutChangedListener(newChattingTabUI2.f214593t);
            }
            Object[] objArr = new Object[3];
            TestTimeForChatting testTimeForChatting = NewChattingTabUI.this.f214577d;
            objArr[0] = Boolean.valueOf(testTimeForChatting == null ? false : testTimeForChatting.isShown());
            objArr[1] = Boolean.valueOf(NewChattingTabUI.this.f214580g == null);
            objArr[2] = Integer.valueOf(NewChattingTabUI.this.f214577d.getVisibility());
            Log.m105925i("MicroMsg.LauncherUI.NewChattingTabUI", "ashutest::startChatting, ishow:%b, cfv is null:%s, visibility:%s", objArr);
            NewChattingTabUI.this.f214577d.setVisibility(0);
            NewChattingTabUI.this.f214577d.setTranslationX(((float) (NewChattingTabUI.this.f214574a.getWindow().getDecorView().getWidth() == 0 ? NewChattingTabUI.this.f214574a.getResources().getDisplayMetrics().widthPixels : NewChattingTabUI.this.f214574a.getWindow().getDecorView().getWidth())) - 0.1f);
            NewChattingTabUI.this.f214576c = Util.nowSecond();
            NewChattingTabUI.this.mo101507m(3);
            if (NewChattingTabUI.this.mo101504j()) {
                C76019y.m91316d(NewChattingTabUI.this.f214574a);
            }
        }

        public String toString() {
            return super.toString() + "|startChattingRunnable";
        }
    }

    /* renamed from: com.tencent.mm.ui.NewChattingTabUI$e */
    public class C73126e implements OnLayoutChangedLinearLayout.C73214a {

        /* renamed from: com.tencent.mm.ui.NewChattingTabUI$e$a */
        public class C73127a implements Animation.AnimationListener {
            public C73127a() {
            }

            public void onAnimationEnd(Animation animation) {
                NewChattingTabUI.m86089b(NewChattingTabUI.this);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
                NewChattingTabUI.m86088a(NewChattingTabUI.this);
                NewChattingTabUI.this.mo101505k(false, 0);
            }
        }

        /* renamed from: com.tencent.mm.ui.NewChattingTabUI$e$b */
        public class C73128b implements TestTimeForChatting.C74844b {
            public C73128b() {
            }

            /* renamed from: a */
            public void mo101521a() {
                boolean z = NewChattingTabUI.this.f214587n.f215220f.f193293q;
                Log.m105925i("MicroMsg.LauncherUI.NewChattingTabUI", "[onDrawed] isReadyToShow:%s", Boolean.valueOf(z));
                if (z) {
                    C73126e eVar = C73126e.this;
                    System.currentTimeMillis();
                    eVar.getClass();
                    if (NewChattingTabUI.this.f214587n.getSwipeBackLayout() != null) {
                        NewChattingTabUI.this.f214587n.getSwipeBackLayout().setNeedChangeWindowBackground(false);
                        NewChattingTabUI.this.f214587n.getSwipeBackLayout().startAnimation(NewChattingTabUI.this.f214592s);
                    } else {
                        NewChattingTabUI.this.f214587n.getView().startAnimation(NewChattingTabUI.this.f214592s);
                    }
                    NewChattingTabUI.this.f214577d.setOndispatchDraw((TestTimeForChatting.C74844b) null);
                }
            }
        }

        public C73126e() {
        }

        /* renamed from: a */
        public void mo101517a() {
            NewChattingTabUI newChattingTabUI = NewChattingTabUI.this;
            if (newChattingTabUI.f214592s == null) {
                newChattingTabUI.f214592s = AnimationUtils.loadAnimation(newChattingTabUI.f214574a, MMFragmentActivity$$c.f318644a);
                NewChattingTabUI.this.f214592s.setAnimationListener(new C73127a());
            }
            NewChattingTabUI newChattingTabUI2 = NewChattingTabUI.this;
            if (newChattingTabUI2.f214584k) {
                newChattingTabUI2.f214577d.setOndispatchDraw(new C73128b());
                NewChattingTabUI.this.f214584k = false;
            } else {
                NewChattingTabUI.m86088a(newChattingTabUI2);
                NewChattingTabUI.m86089b(NewChattingTabUI.this);
            }
            OnLayoutChangedLinearLayout onLayoutChangedLinearLayout = NewChattingTabUI.this.f214580g;
            if (onLayoutChangedLinearLayout != null) {
                onLayoutChangedLinearLayout.f214982d = null;
            }
            Log.m105924i("MicroMsg.LauncherUI.NewChattingTabUI", "klem CHATTING ONLAYOUT ");
        }
    }

    /* renamed from: com.tencent.mm.ui.NewChattingTabUI$f */
    public class C73129f implements Animation.AnimationListener {
        public C73129f() {
        }

        public void onAnimationEnd(Animation animation) {
            NewChattingTabUI newChattingTabUI = NewChattingTabUI.this;
            newChattingTabUI.f214586m = false;
            newChattingTabUI.f214577d.setVisibility(8);
            C86709a0.m107525e().setLowPriority();
            MMHandlerThread.setCurrentPriority(0);
            NewChattingTabUI.this.mo101510p();
            Log.m105924i("MicroMsg.LauncherUI.NewChattingTabUI", "klem pop out onAnimationEnd");
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            NewChattingTabUI.this.f214586m = true;
            C86709a0.m107525e().setLowestPriority();
            MMHandlerThread.setCurrentPriority(-8);
            NewChattingTabUI.this.mo101505k(true, 0);
            Log.m105924i("MicroMsg.LauncherUI.NewChattingTabUI", "klem pop out onAnimationStart");
        }
    }

    /* renamed from: com.tencent.mm.ui.NewChattingTabUI$g */
    public class C73130g implements Runnable {

        /* renamed from: d */
        public int f214608d = 0;

        /* renamed from: e */
        public int f214609e;

        /* renamed from: f */
        public int f214610f;

        /* renamed from: g */
        public Intent f214611g;

        /* renamed from: com.tencent.mm.ui.NewChattingTabUI$g$a */
        public class C73131a implements Runnable {
            public C73131a() {
            }

            public void run() {
                boolean z = true;
                Object[] objArr = new Object[1];
                if (NewChattingTabUI.this.f214587n != null) {
                    z = false;
                }
                objArr[0] = Boolean.valueOf(z);
                Log.m105919d("MicroMsg.LauncherUI.NewChattingTabUI", "on select image ActivityResult. after creat chattingUI, chatting fragment is null? %B", objArr);
                if (NewChattingTabUI.this.f214587n != null) {
                    Log.m105918d("MicroMsg.LauncherUI.NewChattingTabUI", "on select image ActivityResult. do post activity result");
                    C73130g gVar = C73130g.this;
                    NewChattingTabUI.this.f214587n.onActivityResult(gVar.f214609e & 65535, gVar.f214610f, gVar.f214611g);
                }
            }

            public String toString() {
                return super.toString() + "|PostSelectImageJob_onActivityResult";
            }
        }

        public C73130g(C74941w2 w2Var) {
        }

        public void run() {
            if (C97625j3.m125811a() && NewChattingTabUI.this.f214574a != null) {
                Log.m105925i("MicroMsg.LauncherUI.NewChattingTabUI", "on post select image job, acc has ready, retry count %d", Integer.valueOf(this.f214608d));
                NewChattingTabUI newChattingTabUI = NewChattingTabUI.this;
                newChattingTabUI.mo101509o(newChattingTabUI.f214581h, (Bundle) null, false);
                MMHandlerThread.postToMainThread(new C73131a());
            } else if (this.f214608d >= 3) {
                Log.m105928w("MicroMsg.LauncherUI.NewChattingTabUI", "on post select image job, match max retry count");
            } else {
                Object[] objArr = new Object[2];
                objArr[0] = Boolean.valueOf(NewChattingTabUI.this.f214574a != null);
                objArr[1] = Integer.valueOf(this.f214608d);
                Log.m105929w("MicroMsg.LauncherUI.NewChattingTabUI", "on post select image job, acc not ready or view init(%B), cur retry count %d", objArr);
                this.f214608d++;
                MMHandlerThread.postToMainThreadDelayed(this, 300);
            }
        }

        public String toString() {
            return super.toString() + "|PostSelectImageJob";
        }
    }

    public NewChattingTabUI(LauncherUI.C73063d dVar) {
        this.f214575b = dVar;
    }

    /* renamed from: a */
    public static void m86088a(NewChattingTabUI newChattingTabUI) {
        newChattingTabUI.getClass();
        Log.m105925i("MicroMsg.LauncherUI.NewChattingTabUI", "[doJobOnChattingAnimStart] cost:%sms", Long.valueOf(System.currentTimeMillis() - newChattingTabUI.f214588o));
        newChattingTabUI.f214586m = true;
        TestTimeForChatting testTimeForChatting = newChattingTabUI.f214577d;
        if (testTimeForChatting != null) {
            testTimeForChatting.setTranslationX(0.0f);
            newChattingTabUI.f214577d.mo104057b();
        }
    }

    /* renamed from: b */
    public static void m86089b(NewChattingTabUI newChattingTabUI) {
        newChattingTabUI.getClass();
        Log.m105924i("MicroMsg.LauncherUI.NewChattingTabUI", "[doJobOnChattingAnimEnd]");
        ((MMNotification) C97625j3.m125816f()).mo93212i(false);
        newChattingTabUI.f214586m = false;
        TestTimeForChatting testTimeForChatting = newChattingTabUI.f214577d;
        if (testTimeForChatting != null) {
            testTimeForChatting.postDelayed(new C74934v2(newChattingTabUI), 60);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ea  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m86091d(com.tencent.p014mm.p136ui.NewChattingTabUI r10, android.content.Intent r11, boolean r12) {
        /*
            r10.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r2 = r10.f214587n
            r3 = 1
            r4 = 0
            r5 = 2
            java.lang.String r6 = "MicroMsg.LauncherUI.NewChattingTabUI"
            if (r2 != 0) goto L_0x0012
            goto L_0x008b
        L_0x0012:
            uj3.b$e r2 = uj3.C78190b.f229093y0
            bp3.p r2 = bp3.C79758p.f233760a
            bp3.f r7 = bp3.C104160f.RepairerConfig_Global_ChatListToRV_Int
            r8 = 4
            int r2 = r2.mo109882e(r7, r8)
            uj3.C78190b.f229091Q0 = r2
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r2 = r10.f214587n
            java.lang.Boolean r7 = r2.f215225n
            boolean r7 = r7.booleanValue()
            int r8 = uj3.C78190b.f229091Q0
            if (r8 < r3) goto L_0x002d
            r8 = 1
            goto L_0x002e
        L_0x002d:
            r8 = 0
        L_0x002e:
            if (r7 != r8) goto L_0x0053
            ck3.b r2 = r2.f215220f
            r2.getClass()
            oa1.d r7 = oa1.C117731d.m166007c()
            pf3.a r8 = new pf3.a
            r8.<init>()
            int r7 = r7.mo182440a(r8)
            if (r7 != r3) goto L_0x0046
            r7 = 1
            goto L_0x0047
        L_0x0046:
            r7 = 0
        L_0x0047:
            boolean r2 = r2.f193281e
            if (r7 == r2) goto L_0x004d
            r2 = 1
            goto L_0x004e
        L_0x004d:
            r2 = 0
        L_0x004e:
            if (r2 == 0) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r2 = 0
            goto L_0x0054
        L_0x0053:
            r2 = 1
        L_0x0054:
            if (r2 == 0) goto L_0x008d
            com.tencent.mm.ui.MMFragmentActivity r2 = r10.f214574a
            androidx.fragment.app.FragmentManager r2 = r2.getSupportFragmentManager()
            androidx.fragment.app.c0 r2 = r2.beginTransaction()
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r7 = r10.f214587n
            androidx.fragment.app.c0 r2 = r2.mo165169k(r7)
            r2.mo165165g()
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r7 = r10.f214587n
            java.lang.Boolean r7 = r7.f215225n
            boolean r7 = r7.booleanValue()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r2[r4] = r7
            int r7 = uj3.C78190b.f229091Q0
            if (r7 < r3) goto L_0x007f
            r7 = 1
            goto L_0x0080
        L_0x007f:
            r7 = 0
        L_0x0080:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r2[r3] = r7
            java.lang.String r7 = "isNeedReCreateFragment() called %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r2)
        L_0x008b:
            r2 = 1
            goto L_0x008e
        L_0x008d:
            r2 = 0
        L_0x008e:
            if (r2 == 0) goto L_0x00a2
            com.tencent.mm.ui.chatting.ChattingUIFragment r2 = new com.tencent.mm.ui.chatting.ChattingUIFragment
            r2.<init>()
            r10.f214587n = r2
            com.tencent.mm.ui.chatting.ChattingUIProxy r7 = new com.tencent.mm.ui.chatting.ChattingUIProxy
            com.tencent.mm.ui.MMFragmentActivity r8 = r10.f214574a
            r7.<init>(r8, r2)
            r10.mChattingUIProxy = r7
            r2 = 1
            goto L_0x00a3
        L_0x00a2:
            r2 = 0
        L_0x00a3:
            r10.mo101500f()     // Catch:{ Exception -> 0x00a7 }
            goto L_0x00af
        L_0x00a7:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r9 = "[prepareChattingFragment]"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r7, r9, r8)
        L_0x00af:
            if (r11 == 0) goto L_0x00be
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r7 = r10.f214587n
            android.os.Bundle r7 = r7.getArguments()
            android.os.Bundle r8 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getExtras(r11)
            r7.putAll(r8)
        L_0x00be:
            if (r2 == 0) goto L_0x00dd
            com.tencent.mm.ui.IChattingUIProxy r7 = r10.mChattingUIProxy
            int r8 = r10.f214578e
            r7.onInit(r8, r12)
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r12 = r10.f214587n
            android.view.View r12 = r12.getView()
            r7 = 2131299177(0x7f090b69, float:1.8216348E38)
            android.view.View r12 = r12.findViewById(r7)
            com.tencent.mm.ui.base.OnLayoutChangedLinearLayout r12 = (com.tencent.p014mm.p136ui.base.OnLayoutChangedLinearLayout) r12
            r10.f214580g = r12
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r12 = r10.f214587n
            r12.f215224j = r3
            goto L_0x00e2
        L_0x00dd:
            com.tencent.mm.ui.IChattingUIProxy r12 = r10.mChattingUIProxy
            r12.onEnterBegin()
        L_0x00e2:
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r12 = r10.f214587n
            boolean r12 = r12.isSupportNavigationSwipeBack()
            if (r12 == 0) goto L_0x00f3
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r10 = r10.f214587n
            com.tencent.mm.ui.widget.SwipeBackLayout r10 = r10.getSwipeBackLayout()
            r10.setNeedRequestActivityTranslucent(r4)
        L_0x00f3:
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r0
            java.lang.Long r12 = java.lang.Long.valueOf(r7)
            r10[r4] = r12
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            r10[r3] = r12
            r10[r5] = r11
            java.lang.String r11 = "ashu::prepareChattingFragment use %dms, needInit %B, Intent %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r11, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.NewChattingTabUI.m86091d(com.tencent.mm.ui.NewChattingTabUI, android.content.Intent, boolean):void");
    }

    /* renamed from: e */
    public boolean mo101499e(boolean z) {
        BaseChattingUIFragment baseChattingUIFragment;
        ImageView imageView;
        Object[] objArr = new Object[1];
        TestTimeForChatting testTimeForChatting = this.f214577d;
        objArr[0] = Boolean.valueOf(testTimeForChatting == null ? false : testTimeForChatting.isShown());
        Log.m105925i("MicroMsg.LauncherUI.NewChattingTabUI", "try closeChatting, ishow:%b", objArr);
        BaseChattingUIFragment baseChattingUIFragment2 = this.f214587n;
        if (!(baseChattingUIFragment2 == null || baseChattingUIFragment2.getView() == null || C85875k4.m106208w())) {
            this.f214587n.getView().setImportantForAccessibility(4);
        }
        TestTimeForChatting testTimeForChatting2 = this.f214577d;
        if (testTimeForChatting2 == null || testTimeForChatting2.getVisibility() == 8 || (baseChattingUIFragment = this.f214587n) == null || this.f214574a == null) {
            return false;
        }
        if (baseChattingUIFragment.isSupportNavigationSwipeBack()) {
            C76019y.m91315c(this.f214574a);
        }
        Log.m105925i("MicroMsg.LauncherUI.NewChattingTabUI", "[closeChatting] needAnim:%b", Boolean.valueOf(z));
        mo101507m(4);
        this.f214585l = true;
        if (z && this.f214594u == null) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f214574a, MMFragmentActivity$$c.f318647d);
            this.f214594u = loadAnimation;
            loadAnimation.setAnimationListener(new C73129f());
        }
        C34861g1.m40517a(true, new Intent().putExtra("classname", "mainui").putExtra("main_process", false));
        if (this.f214587n.isSupportCustomActionBar() && (imageView = (ImageView) this.f214574a.getWindow().getDecorView().findViewById(C0966R.C0970id.i1m)) != null && imageView.getVisibility() == 0) {
            imageView.setVisibility(8);
            Log.m105924i("MicroMsg.LauncherUI.NewChattingTabUI", "[closeChatting] prepareView GONE");
        }
        mo101508n(0);
        if (z) {
            this.mChattingUIProxy.onExitBegin();
            this.mChattingUIProxy.onExitEnd();
            this.f214577d.startAnimation(this.f214594u);
        } else {
            this.mChattingUIProxy.onExitBegin();
            this.mChattingUIProxy.onExitEnd();
            this.f214577d.setVisibility(8);
            this.f214574a.onSwipe(1.0f);
            mo101510p();
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x046f, code lost:
        if (r0 == null) goto L_0x0471;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x04bc  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0263  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101500f() {
        /*
            r28 = this;
            r1 = r28
            java.lang.Class<dv.c> r0 = p498dv.C75457c.class
            com.tencent.mm.ui.tools.TestTimeForChatting r2 = r1.f214577d
            r4 = 8
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 2131311239(0x7f093a87, float:1.8240813E38)
            java.lang.String r10 = "MicroMsg.LauncherUI.NewChattingTabUI"
            if (r2 != 0) goto L_0x0294
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r2 = r1.f214587n
            boolean r2 = r2.isSupportCustomActionBar()
            if (r2 != 0) goto L_0x0040
            java.lang.Object[] r0 = new java.lang.Object[r7]
            boolean r2 = p605mj.C34575a.m40396a()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0[r8] = r2
            java.lang.String r2 = "[createChattingView] is not SupportCustomActionBar %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r2, r0)
            com.tencent.mm.ui.MMFragmentActivity r0 = r1.f214574a
            r2 = 2131299163(0x7f090b5b, float:1.821632E38)
            android.view.View r0 = r0.findViewById(r2)
            com.tencent.mm.ui.tools.TestTimeForChatting r0 = (com.tencent.p014mm.p136ui.tools.TestTimeForChatting) r0
            r1.f214577d = r0
            int r0 = r0.getId()
            r1.f214578e = r0
            goto L_0x0520
        L_0x0040:
            int[] r2 = new int[r6]
            com.tencent.mm.ui.MMFragmentActivity r11 = r1.f214574a
            androidx.appcompat.app.ActionBar r11 = r11.getSupportActionBar()
            android.view.View r11 = r11.mo91099j()
            r11.getLocationInWindow(r2)
            com.tencent.mm.ui.tools.TestTimeForChatting r11 = new com.tencent.mm.ui.tools.TestTimeForChatting
            com.tencent.mm.ui.MMFragmentActivity r12 = r1.f214574a
            r11.<init>(r12)
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            r13 = -1
            r12.<init>(r13, r13)
            r14 = 2131299194(0x7f090b7a, float:1.8216383E38)
            r11.setId(r14)
            int r14 = r11.getId()
            r1.f214578e = r14
            r11.setOrientation(r7)
            r11.setLayoutParams(r12)
            com.tencent.mm.ui.HomeUI$FitSystemWindowLayoutView r14 = new com.tencent.mm.ui.HomeUI$FitSystemWindowLayoutView
            com.tencent.mm.ui.MMFragmentActivity r15 = r1.f214574a
            r14.<init>(r15)
            android.widget.FrameLayout$LayoutParams r15 = new android.widget.FrameLayout$LayoutParams
            r15.<init>(r13, r13)
            r14.setLayoutParams(r15)
            com.tencent.mm.ui.MMFragmentActivity r15 = r1.f214574a
            android.view.Window r15 = r15.getWindow()
            android.view.View r15 = r15.getDecorView()
            boolean r5 = r15 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x00b4
            r5 = r15
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r13 = 0
        L_0x008f:
            int r3 = r5.getChildCount()
            if (r13 >= r3) goto L_0x00b4
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.Integer r18 = java.lang.Integer.valueOf(r13)
            r3[r8] = r18
            android.view.View r18 = r5.getChildAt(r13)
            java.lang.Class r18 = r18.getClass()
            java.lang.String r18 = r18.getSimpleName()
            r3[r7] = r18
            java.lang.String r6 = "decorViewGroup child: %d %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r6, r3)
            int r13 = r13 + 1
            r6 = 2
            goto L_0x008f
        L_0x00b4:
            int r3 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r3 < r5) goto L_0x00c4
            com.tencent.mm.ui.LauncherUI r5 = com.tencent.p014mm.p136ui.LauncherUI.getInstance()
            boolean r5 = r5.isInMultiWindowMode()
            if (r5 != 0) goto L_0x00c8
        L_0x00c4:
            r5 = 29
            if (r3 <= r5) goto L_0x00da
        L_0x00c8:
            java.lang.String r3 = "decorview compat"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r3)
            r3 = r15
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r5 = r3.getChildAt(r8)
            if (r5 == 0) goto L_0x00da
            android.view.View r15 = r3.getChildAt(r8)
        L_0x00da:
            com.tencent.mm.ui.MMFragmentActivity r3 = r1.f214574a
            androidx.appcompat.app.ActionBar r3 = r3.getSupportActionBar()
            android.view.View r3 = r3.mo91099j()
            android.view.ViewParent r3 = r3.getParent()
            r5 = 0
        L_0x00e9:
            if (r3 == r15) goto L_0x00f7
            if (r3 == 0) goto L_0x00f7
            android.view.ViewParent r5 = r3.getParent()
            r27 = r5
            r5 = r3
            r3 = r27
            goto L_0x00e9
        L_0x00f7:
            boolean r3 = r5 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x00fe
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L_0x0101
        L_0x00fe:
            r5 = r15
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
        L_0x0101:
            if (r5 != 0) goto L_0x010f
            java.lang.String r3 = "abRoot == null! try get child(0)"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r3)
            r3 = r15
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r5 = r3.getChildAt(r8)
        L_0x010f:
            android.widget.ImageView r3 = new android.widget.ImageView
            com.tencent.mm.ui.MMFragmentActivity r6 = r1.f214574a
            r3.<init>(r6)
            r3.setId(r9)
            r3.setLayoutParams(r12)
            r3.setVisibility(r4)
            java.lang.String r6 = "[createChattingView] prepareView GONE"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r6)
            r6 = r5
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r9 = r15
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r9.removeView(r5)
            android.view.ViewParent r12 = r5.getParent()
            if (r12 == 0) goto L_0x0144
            android.view.ViewParent r12 = r5.getParent()
            boolean r12 = r12 instanceof android.view.ViewGroup
            if (r12 == 0) goto L_0x0144
            android.view.ViewParent r12 = r5.getParent()
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            r12.removeView(r5)
        L_0x0144:
            r12 = 2131307031(0x7f092a17, float:1.8232278E38)
            r5.setId(r12)
            boolean r12 = com.tencent.p014mm.p136ui.C85875k4.m106163T()
            if (r12 == 0) goto L_0x01b9
            r12 = 2131300732(0x7f09117c, float:1.8219502E38)
            android.view.View r12 = r5.findViewById(r12)
            android.view.ViewParent r13 = r12.getParent()
            if (r13 == 0) goto L_0x01b9
            android.view.ViewParent r13 = r12.getParent()
            boolean r13 = r13 instanceof android.view.ViewGroup
            if (r13 == 0) goto L_0x01b9
            android.view.ViewParent r13 = r12.getParent()
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            r13.removeView(r12)
            di3.d r17 = di3.C86312j.m106911c(r0)
            r7 = r17
            dv.c r7 = (p498dv.C75457c) r7
            com.tencent.mm.ui.MMFragmentActivity r4 = r1.f214574a
            android.widget.FrameLayout r4 = r7.mo105803ak(r4)
            android.view.ViewGroup$LayoutParams r7 = new android.view.ViewGroup$LayoutParams
            r8 = -1
            r7.<init>(r8, r8)
            r13.addView(r4, r7)
            com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView r7 = new com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView
            com.tencent.mm.ui.MMFragmentActivity r8 = r1.f214574a
            r7.<init>(r8)
            r8 = 0
            r7.setBackgroundColor(r8)
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams
            r17 = r2
            r2 = -1
            r8.<init>(r2, r2)
            r13.addView(r7, r8)
            s92.b r4 = (s92.C77636b) r4
            r4.setGradientBgView(r7)
            di3.d r0 = di3.C86312j.m106911c(r0)
            dv.c r0 = (p498dv.C75457c) r0
            com.tencent.mm.ui.MMFragmentActivity r2 = r1.f214574a
            aa2.b r0 = r0.mo105801Rv(r2)
            com.tencent.mm.ui.NewChattingTabUI$a r2 = new com.tencent.mm.ui.NewChattingTabUI$a
            r2.<init>(r1)
            android.view.View r0 = r0.mo90992Y1(r12, r4, r2)
            r13.addView(r0)
            goto L_0x01bb
        L_0x01b9:
            r17 = r2
        L_0x01bb:
            com.tencent.mm.ui.MMFragmentActivity r0 = r1.f214574a
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r2 = 2131492958(0x7f0c005e, float:1.8609383E38)
            r4 = 0
            android.view.View r0 = r0.inflate(r2, r4)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r4 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.mo10233c(r4)
            java.lang.Object[] r20 = r2.mo10232b()
            java.lang.String r21 = "com/tencent/mm/ui/NewChattingTabUI"
            java.lang.String r22 = "createChattingView"
            java.lang.String r23 = "()V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r0
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r4 = 0
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r20 = "com/tencent/mm/ui/NewChattingTabUI"
            java.lang.String r21 = "createChattingView"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            r14.addView(r5)
            r14.addView(r3)
            r14.addView(r11)
            r14.addView(r0)
            int r2 = com.tencent.p014mm.p136ui.vas.launcher.VASLauncher.f348660i
            r2 = 2131316088(0x7f094d78, float:1.8250648E38)
            java.lang.Object r3 = r0.getTag(r2)
            boolean r4 = r3 instanceof android.view.View.OnLayoutChangeListener
            if (r4 == 0) goto L_0x0229
            android.view.View$OnLayoutChangeListener r3 = (android.view.View.OnLayoutChangeListener) r3
            r16 = r3
            goto L_0x022b
        L_0x0229:
            r16 = 0
        L_0x022b:
            if (r16 == 0) goto L_0x0230
            r3 = r16
            goto L_0x0238
        L_0x0230:
            zn3.a r3 = new zn3.a
            r3.<init>(r5, r0)
            r0.setTag(r2, r3)
        L_0x0238:
            r5.addOnLayoutChangeListener(r3)
            r9.addView(r14)
            r15.requestFitSystemWindows()
            int r0 = r28.mo101502h()
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "ashu::fitSystemWindows. statusBarHeight:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r3)
            if (r0 <= 0) goto L_0x0263
            com.tencent.mm.ui.LauncherUI$d r2 = r1.f214575b
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r4, r0, r4, r4)
            com.tencent.mm.ui.HomeUI r2 = (com.tencent.p014mm.p136ui.HomeUI) r2
            r2.mo101327r(r14, r0, r3, r6)
            goto L_0x0277
        L_0x0263:
            com.tencent.mm.ui.MMFragmentActivity r2 = r1.f214574a
            androidx.appcompat.app.ActionBar r2 = r2.getSupportActionBar()
            android.view.View r2 = r2.mo91099j()
            com.tencent.mm.ui.NewChattingTabUI$b r3 = new com.tencent.mm.ui.NewChattingTabUI$b
            r4 = r17
            r3.<init>(r4, r14, r6)
            r2.post(r3)
        L_0x0277:
            com.tencent.mm.ui.MMFragmentActivity r2 = r1.f214574a
            int r3 = r1.f214578e
            android.view.View r2 = r2.findViewById(r3)
            com.tencent.mm.ui.tools.TestTimeForChatting r2 = (com.tencent.p014mm.p136ui.tools.TestTimeForChatting) r2
            r1.f214577d = r2
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "ashu::prepareChattingFragment init chattingView, top %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r2)
            goto L_0x0520
        L_0x0294:
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r1.f214587n
            boolean r0 = r0.isSupportCustomActionBar()
            if (r0 == 0) goto L_0x0520
            r0 = 2
            int[] r2 = new int[r0]
            com.tencent.mm.ui.tools.TestTimeForChatting r0 = r1.f214577d
            r0.getLocationInWindow(r2)
            r3 = 1
            r0 = r2[r3]
            if (r0 != 0) goto L_0x050f
            com.tencent.mm.ui.MMFragmentActivity r0 = r1.f214574a
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r8 = 0
        L_0x02b6:
            int r3 = r0.getChildCount()
            if (r8 >= r3) goto L_0x050f
            android.view.View r3 = r0.getChildAt(r8)
            boolean r4 = r3 instanceof com.tencent.p014mm.p136ui.HomeUI.FitSystemWindowLayoutView
            if (r4 == 0) goto L_0x04df
            com.tencent.mm.ui.MMFragmentActivity r4 = r1.f214574a
            androidx.appcompat.app.ActionBar r4 = r4.getSupportActionBar()
            android.view.View r4 = r4.mo91099j()
            r4.getLocationInWindow(r2)
            com.tencent.mm.ui.HomeUI$FitSystemWindowLayoutView r3 = (com.tencent.p014mm.p136ui.HomeUI.FitSystemWindowLayoutView) r3
            com.tencent.mm.ui.MMFragmentActivity r4 = r1.f214574a
            r5 = 2131307031(0x7f092a17, float:1.8232278E38)
            android.view.View r4 = r4.findViewById(r5)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r5 = r4.getPaddingTop()
            int r6 = r28.mo101502h()
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            com.tencent.mm.ui.MMFragmentActivity r8 = r1.f214574a
            r8.getWindow()
            r0.getWindowVisibleDisplayFrame(r7)
            int r0 = r0.getHeight()
            r8 = 8
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r8 = 1
            r12 = r2[r8]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13 = 0
            r11[r13] = r12
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r11[r8] = r5
            com.tencent.mm.ui.MMFragmentActivity r5 = r1.f214574a
            int r5 = com.tencent.p014mm.p136ui.C85875k4.m106200p(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8 = 2
            r11[r8] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r6 = 3
            r11[r6] = r5
            r5 = 4
            int r8 = r7.top
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11[r5] = r8
            r5 = 5
            int r7 = r7.height()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11[r5] = r7
            r5 = 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11[r5] = r0
            r0 = 7
            int r5 = r3.getCacheInsetsTop()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r11[r0] = r5
            java.lang.String r0 = "rootLayout2 fitSystemWindows detect: ActionBar's CustomView location[1]:%d, paddingTop:%d getStatusBarHeight():%d, heightFromSysR:%d, rectangle.top:%d, rectangle.height:%d, DecorHeight:%d, cacheInsetsTop:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            int r5 = r3.getCacheInsetsTop()
            r7 = 0
            r0.<init>(r7, r5, r7, r7)
            r3.fitSystemWindows(r0)
            android.view.View r0 = r3.findViewById(r9)
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r3.setTag(r4)
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            if (r0 == 0) goto L_0x0385
            boolean r5 = r0 instanceof android.widget.FrameLayout.LayoutParams
            if (r5 != 0) goto L_0x0385
            r5 = 2
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.String r5 = r0.toString()
            r8[r7] = r5
            r5 = 1
            r8[r5] = r4
            java.lang.String r5 = "FIX LayoutParams:%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r5, r8)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r0)
            r3.setLayoutParams(r5)
            goto L_0x0388
        L_0x0385:
            r3.setLayoutParams(r0)
        L_0x0388:
            long r7 = java.lang.System.currentTimeMillis()
            int r0 = r4.getWidth()
            int r5 = r4.getHeight()
            if (r0 > 0) goto L_0x039a
            int r0 = r4.getMeasuredWidth()
        L_0x039a:
            if (r5 > 0) goto L_0x03a0
            int r5 = r4.getMeasuredHeight()
        L_0x03a0:
            if (r0 <= 0) goto L_0x04a2
            if (r5 > 0) goto L_0x03a6
            goto L_0x04a2
        L_0x03a6:
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r9 = r1.f214587n
            android.view.View r9 = r9.getView()
            if (r9 != 0) goto L_0x03b0
            goto L_0x0471
        L_0x03b0:
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r9 = r1.f214587n
            if (r9 == 0) goto L_0x03d8
            r11 = 2
            java.lang.Object[] r12 = new java.lang.Object[r11]
            android.view.View r9 = r9.getView()
            int r9 = r9.getBottom()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11 = 0
            r12[r11] = r9
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r9 = r1.f214587n
            int r9 = r9.keyboardState()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11 = 1
            r12[r11] = r9
            java.lang.String r9 = "getBottom:%s keyboardState:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r9, r12)
        L_0x03d8:
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r9 = r1.f214587n
            if (r9 == 0) goto L_0x042d
            android.view.View r9 = r9.getView()
            int r9 = r9.getBottom()
            if (r9 <= 0) goto L_0x042d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r9 = r1.f214587n
            int r9 = r9.keyboardState()
            r11 = 1
            if (r9 == r11) goto L_0x040b
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r9 = r1.f214587n
            android.view.View r9 = r9.getView()
            int r9 = r9.getBottom()
            com.tencent.mm.ui.MMFragmentActivity r11 = r1.f214574a
            android.content.res.Resources r11 = r11.getResources()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            int r11 = r11.heightPixels
            r12 = 2
            int r11 = r11 * 2
            int r11 = r11 / r6
            if (r9 >= r11) goto L_0x042d
        L_0x040b:
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r5 = r1.f214587n
            int r5 = r5.keyboardState()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 0
            r0[r6] = r5
            java.lang.String r5 = "hardKeyboardHidden:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r5, r0)
            com.tencent.mm.ui.MMFragmentActivity r0 = r1.f214574a
            android.view.Window r0 = r0.getWindow()
            r5 = 2131101377(0x7f0606c1, float:1.7815162E38)
            r0.setBackgroundDrawableResource(r5)
            goto L_0x0471
        L_0x042d:
            android.graphics.Bitmap r6 = r1.f214590q
            if (r6 == 0) goto L_0x0447
            boolean r6 = r6.isRecycled()
            if (r6 != 0) goto L_0x0447
            android.graphics.Bitmap r6 = r1.f214590q
            int r6 = r6.getWidth()
            if (r6 != r0) goto L_0x0447
            android.graphics.Bitmap r6 = r1.f214590q
            int r6 = r6.getHeight()
            if (r6 == r5) goto L_0x0473
        L_0x0447:
            android.graphics.Bitmap r6 = r1.f214590q
            if (r6 == 0) goto L_0x0467
            boolean r6 = r6.isRecycled()
            if (r6 != 0) goto L_0x0467
            r6 = 1
            java.lang.Object[] r9 = new java.lang.Object[r6]
            android.graphics.Bitmap r6 = r1.f214590q
            java.lang.String r6 = r6.toString()
            r11 = 0
            r9[r11] = r6
            java.lang.String r6 = "bitmap recycle %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r6, r9)
            android.graphics.Bitmap r6 = r1.f214590q
            r6.recycle()
        L_0x0467:
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ OutOfMemoryError -> 0x0495 }
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createBitmap(r0, r5, r6)     // Catch:{ OutOfMemoryError -> 0x0495 }
            r1.f214590q = r0     // Catch:{ OutOfMemoryError -> 0x0495 }
            if (r0 != 0) goto L_0x0473
        L_0x0471:
            r0 = 0
            goto L_0x0493
        L_0x0473:
            android.graphics.Canvas r0 = new android.graphics.Canvas
            android.graphics.Bitmap r5 = r1.f214590q
            r0.<init>(r5)
            r4.draw(r0)
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r7
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 0
            r0[r6] = r5
            java.lang.String r5 = "[getMagicDrawingCache] cost%sms"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r0)
            android.graphics.Bitmap r0 = r1.f214590q
        L_0x0493:
            r7 = 0
            goto L_0x04ba
        L_0x0495:
            r0 = move-exception
            r6 = 1
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r7 = 0
            r5[r7] = r0
            java.lang.String r0 = "[getMagicDrawingCache] e:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r5)
            goto L_0x04b9
        L_0x04a2:
            r6 = 1
            r7 = 0
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8[r7] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r8[r6] = r0
            java.lang.String r0 = "viewWidth:%s viewHeight:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r8)
        L_0x04b9:
            r0 = 0
        L_0x04ba:
            if (r0 == 0) goto L_0x04cd
            r3.setImageBitmap(r0)
            r6 = 8
            r4.setVisibility(r6)
            r3.setVisibility(r7)
            java.lang.String r0 = "[prepareChattingFragment] prepareView VISIBLE"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x050f
        L_0x04cd:
            r6 = 8
            r4.setVisibility(r7)
            r3.setVisibility(r6)
            r4 = 0
            r3.setImageDrawable(r4)
            java.lang.String r0 = "[prepareChattingFragment] prepareView GONE"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x050f
        L_0x04df:
            r4 = 0
            r5 = 2131307031(0x7f092a17, float:1.8232278E38)
            r6 = 8
            android.view.View r3 = r3.findViewById(r9)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            if (r3 == 0) goto L_0x04f0
            r3.setImageDrawable(r4)
        L_0x04f0:
            r7 = 2
            java.lang.Object[] r11 = new java.lang.Object[r7]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            r13 = 0
            r11[r13] = r12
            if (r3 != 0) goto L_0x04fe
            r3 = 1
            goto L_0x04ff
        L_0x04fe:
            r3 = 0
        L_0x04ff:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r12 = 1
            r11[r12] = r3
            java.lang.String r3 = "on position %d, rootLayout not found! prepareView is null?%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r3, r11)
            int r8 = r8 + 1
            goto L_0x02b6
        L_0x050f:
            r12 = 1
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r2 = r2[r12]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = "ashu::prepareChattingFragment has chattingView, top %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r0)
        L_0x0520:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.NewChattingTabUI.mo101500f():void");
    }

    /* renamed from: g */
    public void mo101501g() {
        if (mo101503i()) {
            mo101507m(4);
            BaseChattingUIFragment baseChattingUIFragment = this.f214587n;
            if (baseChattingUIFragment != null && baseChattingUIFragment.isSupportNavigationSwipeBack()) {
                this.f214587n.getSwipeBackLayout().setEnableGesture(false);
            }
        }
    }

    /* renamed from: h */
    public final int mo101502h() {
        int i;
        int f = C75044y4.m89994f(this.f214574a);
        boolean isInMultiWindowMode = (Build.VERSION.SDK_INT < 24 || LauncherUI.getInstance() == null) ? false : LauncherUI.getInstance().isInMultiWindowMode();
        if (!isInMultiWindowMode) {
            SharedPreferences defaultPreference = MMApplicationContext.getDefaultPreference();
            if ((defaultPreference != null ? defaultPreference.getBoolean("Main_need_read_top_margin", false) : false) && (i = defaultPreference.getInt("Main_top_marign", -1)) >= 0) {
                return i;
            }
        }
        if (isInMultiWindowMode) {
            f = 0;
        }
        Log.m105925i("MicroMsg.LauncherUI.NewChattingTabUI", "getTopHeight statusHeight:%s, isInMultiWindowMode:%s", Integer.valueOf(f), Boolean.valueOf(isInMultiWindowMode));
        return f;
    }

    /* renamed from: i */
    public boolean mo101503i() {
        BaseChattingUIFragment baseChattingUIFragment = this.f214587n;
        if (baseChattingUIFragment == null) {
            return false;
        }
        return baseChattingUIFragment.f215220f.f193283g;
    }

    /* renamed from: j */
    public final boolean mo101504j() {
        return C88990b.m111196e() && C34575a.m40396a() && !C76359b.m91786c(this.f214574a);
    }

    /* renamed from: k */
    public boolean mo101505k(boolean z, int i) {
        MainUI mainUI;
        C74720p pVar;
        Log.m105927v("MicroMsg.LauncherUI.NewChattingTabUI", "ashutest: on settle %B, speed %d, resumeStatus %s", Boolean.valueOf(z), Integer.valueOf(i), Boolean.valueOf(((HomeUI) this.f214575b).mo101320k()));
        if (!mo101504j()) {
            return true;
        }
        if (!(!z || (mainUI = (MainUI) ((HomeUI) this.f214575b).f214291t.f214445o.get(0)) == null || (pVar = mainUI.f219483v) == null)) {
            pVar.mo103887N(170);
        }
        if (!((HomeUI) this.f214575b).mo101320k()) {
            return false;
        }
        View findViewById = this.f214574a.findViewById(C0966R.C0970id.f358506fj1);
        if (findViewById == null) {
            Log.m105920e("MicroMsg.LauncherUI.NewChattingTabUI", "[onSettle] null == container");
            return true;
        }
        ImageView imageView = (ImageView) this.f214574a.findViewById(C0966R.C0970id.i1m);
        if (!(imageView == null || imageView.getVisibility() != 8 || imageView.getDrawable() == null)) {
            imageView.setVisibility(0);
            Log.m105924i("MicroMsg.LauncherUI.NewChattingTabUI", "[onSettle] prepareView VISIBLE");
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/NewChattingTabUI", "onSettle", "(ZI)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/NewChattingTabUI", "onSettle", "(ZI)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (imageView == null || imageView.getVisibility() != 0) {
            int width = findViewById.getWidth() == 0 ? this.f214574a.getResources().getDisplayMetrics().widthPixels : findViewById.getWidth();
            if (z) {
                C74863w0.m89620a(findViewById, 182, 0.0f, 0.0f, (C74863w0.C74865b) null);
            } else {
                C74863w0.m89620a(findViewById, 208, ((float) (width * -1)) / 3.5f, 0.0f, (C74863w0.C74865b) null);
            }
        } else {
            int width2 = imageView.getWidth() == 0 ? this.f214574a.getResources().getDisplayMetrics().widthPixels : imageView.getWidth();
            if (z) {
                C74863w0.m89620a(imageView, 182, 0.0f, 0.0f, (C74863w0.C74865b) null);
            } else {
                C74863w0.m89620a(imageView, 208, ((float) (width2 * -1)) / 3.5f, 0.0f, (C74863w0.C74865b) null);
            }
        }
        return true;
    }

    /* renamed from: l */
    public final void mo101506l() {
        Bitmap bitmap = this.f214590q;
        if (bitmap != null && !bitmap.isRecycled()) {
            Log.m105925i("MicroMsg.LauncherUI.NewChattingTabUI", "bitmap recycle %s", this.f214590q.toString());
            this.f214590q.recycle();
        }
    }

    /* renamed from: m */
    public final void mo101507m(int i) {
        BaseChattingUIFragment baseChattingUIFragment = this.f214587n;
        if (baseChattingUIFragment != null) {
            ThreadPool.post(new C73124c(i, baseChattingUIFragment != null ? baseChattingUIFragment.getIdentityString() : ""), "MicroMsg.LauncherUI.NewChattingTabUI|report");
        }
    }

    /* renamed from: n */
    public final void mo101508n(int i) {
        Log.m105925i("MicroMsg.LauncherUI.NewChattingTabUI", "[setLauncherContainerVisible] visible:%s", Integer.valueOf(i));
        MMFragmentActivity mMFragmentActivity = this.f214574a;
        if (mMFragmentActivity == null) {
            Log.m105920e("MicroMsg.LauncherUI.NewChattingTabUI", "[setLauncherContainerVisible] getActivity is null");
            return;
        }
        View findViewById = mMFragmentActivity.findViewById(C0966R.C0970id.f358506fj1);
        if (findViewById != null && findViewById.getVisibility() != i) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/NewChattingTabUI", "setLauncherContainerVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/NewChattingTabUI", "setLauncherContainerVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: o */
    public void mo101509o(String str, Bundle bundle, boolean z) {
        BaseChattingUIFragment baseChattingUIFragment;
        this.f214588o = System.currentTimeMillis();
        Object[] objArr = new Object[3];
        TestTimeForChatting testTimeForChatting = this.f214577d;
        objArr[0] = Boolean.valueOf(testTimeForChatting == null ? false : testTimeForChatting.isShown());
        objArr[1] = str;
        objArr[2] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.LauncherUI.NewChattingTabUI", "try startChatting, ishow:%b userName:%s needAnim:%b", objArr);
        BaseChattingUIFragment baseChattingUIFragment2 = this.f214587n;
        if (!(baseChattingUIFragment2 == null || baseChattingUIFragment2.getView() == null)) {
            this.f214587n.getView().setImportantForAccessibility(1);
        }
        ((MMNotification) C97625j3.m125816f()).mo93212i(false);
        this.f214591r = false;
        this.f214583j = bundle;
        this.f214582i = str;
        this.f214584k = z;
        if (z && C78190b.f229093y0.mo108228c() && (baseChattingUIFragment = this.f214587n) != null) {
            baseChattingUIFragment.f215220f.f193293q = false;
        }
        if ((!C85875k4.m106197n0() || (!C85875k4.m106157N() && !C85875k4.m106158O() && !C85875k4.m106208w() && !C85875k4.m106171a0())) && !C85875k4.m106165V() && !C85875k4.m106199o0()) {
            C86709a0.m107525e().setLowestPriority();
            MMHandlerThread.setCurrentPriority(-8);
            MMHandlerThread.removeRunnable(this.mStartChattingRunnable);
            MMHandlerThread.postToMainThread(this.mStartChattingRunnable);
            return;
        }
        Intent intent = new Intent(this.f214574a, ChattingUI.class);
        intent.putExtra("Chat_User", this.f214582i);
        intent.addFlags(67108864);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        MMFragmentActivity mMFragmentActivity = this.f214574a;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        MMFragmentActivity mMFragmentActivity2 = mMFragmentActivity;
        C117292a.m165358d(mMFragmentActivity2, aVar.mo10232b(), "com/tencent/mm/ui/NewChattingTabUI", "startChatting", "(Ljava/lang/String;Landroid/os/Bundle;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMFragmentActivity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(mMFragmentActivity2, "com/tencent/mm/ui/NewChattingTabUI", "startChatting", "(Ljava/lang/String;Landroid/os/Bundle;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: p */
    public final void mo101510p() {
        if (mo101504j()) {
            boolean z = true;
            Object[] objArr = new Object[1];
            if (this.f214587n != null) {
                z = false;
            }
            objArr[0] = Boolean.valueOf(z);
            Log.m105925i("MicroMsg.LauncherUI.NewChattingTabUI", "ashutest: tryResetChattingSwipeStatus, chattingFragment NULL ? %B", objArr);
            BaseChattingUIFragment baseChattingUIFragment = this.f214587n;
            if (baseChattingUIFragment != null) {
                baseChattingUIFragment.getSwipeBackLayout().f56498v = false;
            }
        }
    }
}
