package com.tencent.p014mm.p136ui.conversation;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Debug;
import android.text.format.Time;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bv1.C28426b;
import cm3.C67406a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.MultiWindowModeChangedEvent;
import com.tencent.p014mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView;
import com.tencent.p014mm.dynamicbackground.view.GradientColorBackgroundView;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.p136ui.AbstractTabChildActivity;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.base.MMSlideDelView;
import com.tencent.p014mm.p136ui.conversation.C74720p;
import com.tencent.p014mm.plugin.multitask.p079ui.p888bg.DynamicBgContainer;
import com.tencent.p014mm.plugin.taskbar.p110ui.C30487f0;
import com.tencent.p014mm.plugin.taskbar.p110ui.C30491h;
import com.tencent.p014mm.plugin.taskbar.p110ui.C71323d;
import com.tencent.p014mm.plugin.taskbar.p110ui.C71325e;
import com.tencent.p014mm.plugin.taskbar.p110ui.C71327g;
import com.tencent.p014mm.plugin.taskbar.p110ui.C71331l;
import com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarContainer;
import com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarView;
import com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarViewPresenter;
import com.tencent.p014mm.pluginsdk.platformtools.C72714e;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72975h0;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import dd0.C75350g;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C97625j3;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kl3.C76598b;
import ky2.C10432i;
import ll3.C76703a;
import lu3.C34379c;
import p196ln.C76706g;
import p787ai.C79547b;
import pc0.C47457o;
import s92.C77635a;
import sf0.C77702q0;
import sx2.C48497j;
import vo3.C111563a;
import vx2.C65900i;
import vx2.C65902r;
import vx2.C78493o;
import wc3.C78538u;
import wx2.C78736a;
import xd3.C78802b;
import zt3.C119157j;
import zx2.C79436b;
import zx2.C79440e;

/* renamed from: com.tencent.mm.ui.conversation.MainUI */
public class MainUI extends AbstractTabChildActivity.AbStractTabFragment implements InitHelper$$h {

    /* renamed from: A */
    public C74685d2 f219464A = new C74685d2();

    /* renamed from: B */
    public int[] f219465B = new int[2];

    /* renamed from: C */
    public C78736a f219466C;

    /* renamed from: D */
    public C67406a f219467D;

    /* renamed from: E */
    public IMvvmObserver<Object> f219468E;

    /* renamed from: F */
    public IMvvmObserver<Integer> f219469F;

    /* renamed from: G */
    public View f219470G;

    /* renamed from: H */
    public boolean f219471H;

    /* renamed from: I */
    public Runnable f219472I;

    /* renamed from: J */
    public SharedPreferences f219473J;

    /* renamed from: K */
    public C74662k f219474K;

    /* renamed from: n */
    public MMFragmentActivity f219475n;

    /* renamed from: o */
    public ConversationListView f219476o;

    /* renamed from: p */
    public C71327g f219477p;

    /* renamed from: q */
    public View f219478q;

    /* renamed from: r */
    public View f219479r;

    /* renamed from: s */
    public View f219480s;

    /* renamed from: t */
    public TextView f219481t;

    /* renamed from: u */
    public LinearLayout f219482u;

    /* renamed from: v */
    public C74720p f219483v;

    /* renamed from: w */
    public BannerHelper f219484w = new BannerHelper();

    /* renamed from: x */
    public FolderHelper f219485x = new FolderHelper();

    /* renamed from: y */
    public InitHelper f219486y = new InitHelper();

    /* renamed from: z */
    public C74739q2 f219487z = new C74739q2();

    /* renamed from: com.tencent.mm.ui.conversation.MainUI$a */
    public class C74652a implements Runnable {

        /* renamed from: d */
        public int f219488d = 0;

        /* renamed from: e */
        public final /* synthetic */ boolean f219489e;

        public C74652a(boolean z) {
            this.f219489e = z;
        }

        public void run() {
            MainUI mainUI = MainUI.this;
            if (mainUI.f219476o != null) {
                int g = C75044y4.m89995g(mainUI.getContext(), -1);
                int a = C78538u.m94865a(MainUI.this.f219476o.getContext());
                if (g <= 0 || a <= 0) {
                    if (this.f219488d < 2) {
                        Log.m105924i("MicroMsg.MainUI", "[trySetListViewMargin] try getStatusHeight again!");
                        MainUI.this.f219476o.post(this);
                    } else {
                        Log.m105920e("MicroMsg.MainUI", "[trySetListViewMargin] try getStatusHeight finally!");
                    }
                    this.f219488d++;
                } else if (g != MainUI.this.f219476o.getPaddingTop()) {
                    Log.m105925i("MicroMsg.MainUI", "[initListViewPadding] now:%s old:%s", Integer.valueOf(g), Integer.valueOf(MainUI.this.f219476o.getPaddingTop()));
                    MainUI mainUI2 = MainUI.this;
                    if (this.f219489e) {
                        a = 0;
                    }
                    mainUI2.mo103818T(a, g);
                } else {
                    Log.m105925i("MicroMsg.MainUI", "[trySetListViewMargin] has try more once! it's right! statusHeight:%s", Integer.valueOf(g));
                }
                Log.m105925i("MicroMsg.MainUI", "[trySetListViewMargin] tryCount:%s statusHeight:%s", Integer.valueOf(this.f219488d), Integer.valueOf(g));
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.MainUI$b */
    public class C74653b implements Runnable {
        public C74653b() {
        }

        public void run() {
            if (MainUI.this.thisActivity() != null) {
                MainUI.this.thisActivity().supportInvalidateOptionsMenu();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.MainUI$c */
    public class C74654c implements Runnable {
        public C74654c() {
        }

        public void run() {
            BannerHelper bannerHelper = MainUI.this.f219484w;
            if (!bannerHelper.f219281s) {
                bannerHelper.f219281s = true;
                ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93556a(bannerHelper);
                C97625j3.m125812b().mo105906u().add(bannerHelper);
                bannerHelper.mo103670h();
            }
            FolderHelper folderHelper = MainUI.this.f219485x;
            if (!folderHelper.f219400G) {
                folderHelper.f219400G = true;
                C97625j3.m125812b().mo105906u().add(folderHelper);
                folderHelper.mo103778B(true);
                if (folderHelper.mo103797t()) {
                    Collection<C72976h2> o = folderHelper.mo103792o();
                    long j = (long) folderHelper.f219420v;
                    long j2 = ((long) 100) * ((long) 1.0f);
                    if (j > 0 && o != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getLong("top_session_info_report", 0) > 86400000) {
                            ((C119157j) C119157j.f356862d).mo183875f(new C76703a(o, j, j2, currentTimeMillis));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.MainUI$d */
    public class C74655d implements C111563a {
        public C74655d() {
        }

        /* renamed from: a */
        public boolean mo69090a() {
            ConversationListView conversationListView = MainUI.this.f219476o;
            View childAt = conversationListView.getChildAt(conversationListView.getChildCount() - 1);
            return childAt != null && childAt.getBottom() <= MainUI.this.f219476o.getHeight() && (MainUI.this.f219476o.getLastVisiblePosition() == MainUI.this.f219476o.getAdapter().getCount() - 1 || childAt.getId() == C0966R.C0970id.b7f);
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.MainUI$e */
    public class C74656e implements Runnable {
        public C74656e() {
        }

        public void run() {
            MainUI.this.f219484w.mo103666d();
            MainUI.this.f219485x.mo103798u();
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.MainUI$f */
    public class C74657f implements Runnable {
        public C74657f() {
        }

        public void run() {
            MainUI.this.f219484w.mo103666d();
            MainUI.this.f219485x.mo103798u();
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.MainUI$g */
    public class C74658g implements Runnable {
        public C74658g() {
        }

        public void run() {
            BannerHelper bannerHelper = MainUI.this.f219484w;
            bannerHelper.getClass();
            Log.m105924i("MicroMsg.BannerHelper", "destroyBanner");
            bannerHelper.mo103666d();
            bannerHelper.mo103663a(bannerHelper.f219269d);
            bannerHelper.mo103663a(bannerHelper.f219270e);
            bannerHelper.mo103663a(bannerHelper.f219271f);
            bannerHelper.mo103663a(bannerHelper.f219272g);
            for (C78802b next : bannerHelper.f219273h) {
                if (next != null) {
                    next.mo7968a();
                }
            }
            C29060q qVar = bannerHelper.f219275j;
            C86709a0.m107528h();
            C86709a0.m107529k().mo121129d(qVar);
            bannerHelper.f219276n.dead();
            bannerHelper.f219277o.dead();
            if (C97625j3.m125811a()) {
                C97625j3.m125812b().mo105885K(bannerHelper);
            }
            bannerHelper.f219278p = null;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.MainUI$h */
    public class C74659h implements C67406a {
        public C74659h() {
        }

        public void onFragmentVisibilityChanged(boolean z) {
            ConversationListView conversationListView = MainUI.this.f219476o;
            if (conversationListView != null) {
                C74693i iVar = C74693i.f219589a;
                C74693i.f219592d = z;
                if (conversationListView.f219335L) {
                    Log.m105925i("MicroMsg.ConversationListView", "alvinluo onFragmentVisibilityChanged visible: %b", Boolean.valueOf(z));
                    conversationListView.mo103741q();
                }
                MainUI mainUI = MainUI.this;
                iVar.mo103854a(mainUI.f219476o, mainUI.f219483v, z, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.MainUI$i */
    public class C74660i implements IMvvmObserver<Object> {
        public C74660i() {
        }

        public void onChanged(Object obj) {
            if (MainUI.this.f219483v != null) {
                Log.m105918d("MicroMsg.MainUI", "refresh main ui unread count.");
                MainUI.this.f219483v.notifyDataSetChanged();
                LauncherUI.getInstance().mo101375O7().mo101427k();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.MainUI$j */
    public class C74661j implements IMvvmObserver<Integer> {

        /* renamed from: d */
        public long f219499d = 0;

        /* renamed from: e */
        public int f219500e = -1;

        /* renamed from: f */
        public int f219501f = 0;

        public C74661j() {
        }

        /* renamed from: a */
        public static void m89410a(C74661j jVar, int i) {
            int firstVisiblePosition = MainUI.this.f219476o.getFirstVisiblePosition();
            ConversationListView conversationListView = MainUI.this.f219476o;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(conversationListView, aVar.mo10232b(), "com/tencent/mm/ui/conversation/MainUI$3", "scrollToFromTop", "(I)V", "Undefined", "smoothScrollToPositionFromTop", "(II)V");
            conversationListView.smoothScrollToPositionFromTop(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(conversationListView, "com/tencent/mm/ui/conversation/MainUI$3", "scrollToFromTop", "(I)V", "Undefined", "smoothScrollToPositionFromTop", "(II)V");
            jVar.f219501f = i;
            MainUI.this.f219476o.postOnAnimationDelayed(new C74744u0(jVar, firstVisiblePosition, i), 250);
        }

        public void onChanged(Object obj) {
            Log.m105918d("MicroMsg.MainUI", "trigger double tab");
            MainUI.this.f219476o.postDelayed(new C74745v0(this, (Integer) obj), 100);
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.MainUI$k */
    public class C74662k {

        /* renamed from: a */
        public boolean f219503a;

        /* renamed from: b */
        public boolean f219504b;

        /* renamed from: c */
        public boolean f219505c;

        public C74662k(MainUI mainUI, boolean z, boolean z2, boolean z3) {
            this.f219503a = z;
            this.f219504b = z2;
            this.f219505c = z3;
        }
    }

    public MainUI() {
        Log.m105924i("MicroMsg.MainUI", "create mainUI");
        this.f219467D = new C74659h();
        this.f219468E = new C74660i();
        this.f219469F = new C74661j();
        this.f219470G = null;
        this.f219471H = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0243, code lost:
        r6 = r6.getView();
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo101235K(android.os.Bundle r13) {
        /*
            r12 = this;
            r13 = 1
            java.lang.Object[] r0 = new java.lang.Object[r13]
            int r1 = r12.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "MicroMsg.MainUI"
            java.lang.String r3 = "onTabCreate, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r0)
            com.tencent.mm.ui.MMActivityController r0 = r12.mController
            if (r0 == 0) goto L_0x001e
            r3 = 4
            r0.f348089b0 = r3
            r0.f348091c0 = r2
        L_0x001e:
            java.lang.Class<sy.b> r0 = p691sy.C77814b.class
            java.lang.String r3 = "mainUIOnCreate"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            long r3 = java.lang.System.currentTimeMillis()
            r12.setMenuVisibility(r13)
            com.tencent.mm.sdk.platformtools.MMHandlerThread r5 = f40.C86709a0.m107525e()
            r5.setLowPriority()
            java.lang.String r5 = "main ui init view"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            com.tencent.mm.ui.conversation.ConversationListView r5 = r12.f219476o
            if (r5 == 0) goto L_0x0087
            com.tencent.mm.ui.conversation.BannerHelper r5 = r12.f219484w
            android.widget.ListView r6 = r5.f219279q
            if (r6 != 0) goto L_0x0043
            goto L_0x007b
        L_0x0043:
            java.util.List<xd3.b> r6 = r5.f219269d
            r5.mo103669g(r6)
            java.util.List<xd3.b> r6 = r5.f219270e
            r5.mo103669g(r6)
            java.util.List<xd3.b> r6 = r5.f219271f
            r5.mo103669g(r6)
            java.util.List<xd3.b> r6 = r5.f219272g
            r5.mo103669g(r6)
            java.util.List<xd3.b> r6 = r5.f219273h
            java.util.Iterator r6 = r6.iterator()
        L_0x005d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x007b
            java.lang.Object r7 = r6.next()
            xd3.b r7 = (xd3.C78802b) r7
            if (r7 == 0) goto L_0x005d
            android.view.View r8 = r7.getView()
            if (r8 == 0) goto L_0x005d
            android.widget.ListView r8 = r5.f219279q
            android.view.View r7 = r7.getView()
            r8.removeFooterView(r7)
            goto L_0x005d
        L_0x007b:
            com.tencent.mm.ui.conversation.FolderHelper r5 = r12.f219485x
            android.widget.LinearLayout r5 = r5.f219409h
            if (r5 != 0) goto L_0x0082
            goto L_0x0087
        L_0x0082:
            r6 = 8
            r5.setVisibility(r6)
        L_0x0087:
            r5 = 2131301612(0x7f0914ec, float:1.8221287E38)
            android.view.View r5 = r12.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r12.f219481t = r5
            r5 = 2131308839(0x7f093127, float:1.8235945E38)
            android.view.View r5 = r12.findViewById(r5)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r12.f219482u = r5
            r5 = 2131308840(0x7f093128, float:1.8235947E38)
            android.view.View r5 = r12.findViewById(r5)
            com.tencent.mm.ui.conversation.ConversationListView r5 = (com.tencent.p014mm.p136ui.conversation.ConversationListView) r5
            r12.f219476o = r5
            vo3.f r6 = r12.getBounceView()
            r5.f219329F = r6
            android.content.Context r6 = r5.getContext()
            com.tencent.mm.plugin.taskbar.ui.e r7 = r5.f219351i
            r8 = -1
            if (r7 == 0) goto L_0x00b8
            goto L_0x010b
        L_0x00b8:
            java.lang.String r7 = "MicroMsg.ConversationListView"
            java.lang.String r9 = "do initHeaderContainer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r9)
            di3.d r7 = di3.C86312j.m106911c(r0)
            sy.b r7 = (p691sy.C77814b) r7
            com.tencent.mm.plugin.taskbar.ui.e r7 = r7.mo107775ay(r6)
            r5.f219351i = r7
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            android.widget.AbsListView$LayoutParams r9 = new android.widget.AbsListView$LayoutParams
            r10 = -2
            r9.<init>(r8, r10)
            r7.setLayoutParams(r9)
            di3.d r7 = di3.C86312j.m106911c(r0)
            sy.b r7 = (p691sy.C77814b) r7
            com.tencent.mm.plugin.taskbar.ui.e r9 = r5.f219351i
            com.tencent.mm.plugin.taskbar.ui.d r6 = r7.mo107776ro(r6, r5, r9)
            r5.f219352j = r6
            com.tencent.mm.plugin.taskbar.ui.l r6 = (com.tencent.p014mm.plugin.taskbar.p110ui.C71331l) r6
            java.util.List<com.tencent.mm.plugin.taskbar.ui.c> r7 = r6.f206608n
            java.util.LinkedList r7 = (java.util.LinkedList) r7
            boolean r7 = r7.contains(r5)
            if (r7 != 0) goto L_0x00f7
            java.util.List<com.tencent.mm.plugin.taskbar.ui.c> r6 = r6.f206608n
            java.util.LinkedList r6 = (java.util.LinkedList) r6
            r6.add(r5)
        L_0x00f7:
            com.tencent.mm.plugin.taskbar.ui.e r6 = r5.f219351i
            com.tencent.mm.plugin.taskbar.ui.d r7 = r5.f219352j
            r6.setAnimController(r7)
            boolean r6 = r5.f219349g
            if (r6 == 0) goto L_0x010b
            r5.f219350h = r13
            com.tencent.mm.plugin.taskbar.ui.e r6 = r5.f219351i
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            r5.addHeaderView(r6)
        L_0x010b:
            r5 = 2131314331(0x7f09469b, float:1.8247084E38)
            android.view.View r5 = r12.findViewById(r5)
            r12.f219478q = r5
            com.tencent.mm.ui.conversation.ConversationListView r6 = r12.f219476o
            r6.setStatusBarMaskView(r5)
            r12.mo103820V()
            java.lang.Class<dv.c> r5 = p498dv.C75457c.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            dv.c r5 = (p498dv.C75457c) r5
            android.app.Activity r6 = r12.getContext()
            android.widget.FrameLayout r5 = r5.mo105803ak(r6)
            r12.f219479r = r5
            android.view.ViewGroup$LayoutParams r5 = new android.view.ViewGroup$LayoutParams
            r5.<init>(r8, r8)
            android.view.View r6 = r12.f219470G
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.view.View r7 = r12.f219479r
            r6.addView(r7, r2, r5)
            com.tencent.mm.ui.conversation.ConversationListView r5 = r12.f219476o
            r5.setDrawingCacheEnabled(r2)
            com.tencent.mm.ui.conversation.ConversationListView r5 = r12.f219476o
            r5.setScrollingCacheEnabled(r2)
            r5 = 2131297027(0x7f090303, float:1.8211987E38)
            android.view.View r5 = r12.findViewById(r5)
            r12.f219480s = r5
            com.tencent.mm.ui.conversation.ConversationListView r6 = r12.f219476o
            android.view.View r7 = r12.f219479r
            com.tencent.mm.plugin.taskbar.ui.e r6 = r6.f219351i
            if (r6 == 0) goto L_0x0173
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r6 = (com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarContainer) r6
            com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer r7 = (com.tencent.p014mm.plugin.multitask.p079ui.p888bg.DynamicBgContainer) r7
            com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView r5 = (com.tencent.p014mm.dynamicbackground.view.GradientColorBackgroundView) r5
            r6.f206447f = r7
            r6.f206448g = r5
            com.tencent.mm.plugin.taskbar.ui.l r6 = r6.f206445d
            if (r6 == 0) goto L_0x0173
            java.lang.String r9 = "MicroMsg.TaskBarAnimController"
            java.lang.String r10 = "setBackgroundView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            r6.f206610p = r7
            r6.f206615t = r5
            r7.setGradientBgView(r5)
        L_0x0173:
            com.tencent.mm.ui.conversation.p r5 = new com.tencent.mm.ui.conversation.p
            android.app.Activity r6 = r12.getContext()
            com.tencent.mm.ui.conversation.ConversationListView r7 = r12.f219476o
            com.tencent.mm.ui.conversation.FolderHelper r9 = r12.f219485x
            com.tencent.mm.ui.conversation.x0 r10 = new com.tencent.mm.ui.conversation.x0
            r10.<init>(r12)
            r5.<init>(r6, r7, r9, r10)
            r12.f219483v = r5
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r5 = r5.mo105908w()
            com.tencent.mm.ui.conversation.p r6 = r12.f219483v
            r5.add(r6)
            com.tencent.mm.ui.conversation.p r5 = r12.f219483v
            r5.getClass()
            com.tencent.mm.ui.conversation.p r5 = r12.f219483v
            r5.getClass()
            r5 = 18
            boolean r5 = p206nj.C11171e.m11045b(r5)
            if (r5 == 0) goto L_0x01b1
            ai.b r5 = p787ai.C79547b.f233255g
            com.tencent.mm.ui.conversation.y0 r6 = new com.tencent.mm.ui.conversation.y0
            r6.<init>(r12)
            r5.mo109607a(r6)
            goto L_0x01be
        L_0x01b1:
            com.tencent.mm.ui.conversation.BannerHelper r5 = r12.f219484w
            android.app.Activity r6 = r12.getContext()
            com.tencent.mm.ui.conversation.ConversationListView r7 = r12.f219476o
            android.widget.TextView r9 = r12.f219481t
            r5.mo103665c(r6, r7, r9)
        L_0x01be:
            com.tencent.mm.ui.conversation.FolderHelper r5 = r12.f219485x
            android.app.Activity r6 = r12.getContext()
            com.tencent.mm.ui.conversation.ConversationListView r7 = r12.f219476o
            com.tencent.mm.ui.conversation.p r9 = r12.f219483v
            android.widget.LinearLayout r10 = r12.f219482u
            r5.getClass()
            java.lang.String r11 = "context"
            gy3.C87412m.m108594g(r6, r11)
            r5.f219406e = r6
            r5.f219407f = r7
            r5.f219405d = r9
            r5.f219409h = r10
            android.content.res.Resources r7 = r6.getResources()
            r9 = 2131165589(0x7f070195, float:1.79454E38)
            float r7 = r7.getDimension(r9)
            r9 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r9
            int r7 = (int) r7
            r5.f219412n = r7
            android.content.res.Resources r7 = r6.getResources()
            r10 = 2131165559(0x7f070177, float:1.7945339E38)
            float r7 = r7.getDimension(r10)
            float r7 = r7 + r9
            int r7 = (int) r7
            r5.f219413o = r7
            r7 = 2131165260(0x7f07004c, float:1.7944732E38)
            int r7 = kg3.C76577a.m92155f(r6, r7)
            float r7 = (float) r7
            float r9 = kg3.C76577a.m92161l(r6)
            float r7 = r7 * r9
            int r7 = (int) r7
            r5.f219414p = r7
            r5.f219403J = r2
            android.graphics.Point r6 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r6)
            int r6 = r6.y
            r5.mo103781c(r6, r13)
            android.content.Context r6 = r5.f219406e
            com.tencent.mm.ui.conversation.banner.h$a r7 = com.tencent.p014mm.p136ui.conversation.banner.C74666h.C74667a.CHATTING_FOLD_BANNER
            r9 = 0
            xd3.a r6 = com.tencent.p014mm.p136ui.conversation.banner.C74666h.m89417a(r6, r7, r9)
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.pluginsdk.ui.banner.BaseBanner"
            gy3.C87412m.m108592e(r6, r7)
            xd3.b r6 = (xd3.C78802b) r6
            r5.f219408g = r6
            android.widget.LinearLayout r7 = r5.f219409h
            if (r7 == 0) goto L_0x0233
            android.view.View r10 = r6.getView()
            r7.addView(r10)
        L_0x0233:
            android.widget.LinearLayout r7 = r5.f219409h
            if (r7 == 0) goto L_0x023f
            com.tencent.mm.ui.conversation.h0 r10 = new com.tencent.mm.ui.conversation.h0
            r10.<init>(r5, r6)
            r7.setOnClickListener(r10)
        L_0x023f:
            xd3.b r6 = r5.f219408g
            if (r6 == 0) goto L_0x0251
            android.view.View r6 = r6.getView()
            if (r6 == 0) goto L_0x0251
            r7 = 2131313096(0x7f0941c8, float:1.824458E38)
            android.view.View r6 = r6.findViewById(r7)
            goto L_0x0252
        L_0x0251:
            r6 = r9
        L_0x0252:
            r5.f219410i = r6
            xd3.b r6 = r5.f219408g
            if (r6 == 0) goto L_0x0268
            android.view.View r6 = r6.getView()
            if (r6 == 0) goto L_0x0268
            r7 = 2131305053(0x7f09225d, float:1.8228266E38)
            android.view.View r6 = r6.findViewById(r7)
            android.widget.TextView r6 = (android.widget.TextView) r6
            goto L_0x0269
        L_0x0268:
            r6 = r9
        L_0x0269:
            r5.f219411j = r6
            com.tencent.mm.ui.conversation.ConversationListView r6 = r5.f219407f
            if (r6 == 0) goto L_0x0274
            android.widget.LinearLayout r7 = r5.f219409h
            r6.setFoldBanner(r7)
        L_0x0274:
            com.tencent.mm.ui.conversation.ConversationListView r6 = r5.f219407f
            if (r6 == 0) goto L_0x027b
            r6.setFoldHelper(r5)
        L_0x027b:
            android.widget.LinearLayout r6 = r5.f219409h
            if (r6 == 0) goto L_0x0284
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            goto L_0x0285
        L_0x0284:
            r6 = r9
        L_0x0285:
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L_0x028c
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            goto L_0x028d
        L_0x028c:
            r6 = r9
        L_0x028d:
            if (r6 != 0) goto L_0x0290
            goto L_0x0294
        L_0x0290:
            int r7 = r5.f219414p
            r6.bottomMargin = r7
        L_0x0294:
            android.widget.LinearLayout r7 = r5.f219409h
            if (r7 != 0) goto L_0x0299
            goto L_0x029c
        L_0x0299:
            r7.setLayoutParams(r6)
        L_0x029c:
            com.tencent.mm.ui.conversation.ConversationListView r6 = r5.f219407f
            if (r6 == 0) goto L_0x02a6
            kl3.a r7 = new kl3.a
            r7.<init>(r6)
            goto L_0x02a7
        L_0x02a6:
            r7 = r9
        L_0x02a7:
            if (r7 == 0) goto L_0x02af
            kl3.b r6 = new kl3.b
            r6.<init>(r7)
            goto L_0x02b0
        L_0x02af:
            r6 = r9
        L_0x02b0:
            r5.f219398E = r6
            eb0.c r6 = eb0.C97625j3.m125812b()
            r6.mo105886a(r5)
            eb0.c r6 = eb0.C97625j3.m125812b()
            g62.l r6 = r6.mo105911z()
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6
            r6.mo101137qq(r5, r9)
            eb0.c r6 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r6 = r6.mo105908w()
            r6.add(r5)
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GetConvEvent> r5 = r5.f219399F
            r5.alive()
            com.tencent.mm.ui.conversation.d2 r5 = r12.f219464A
            com.tencent.mm.ui.conversation.ConversationListView r6 = r12.f219476o
            com.tencent.mm.ui.conversation.p r7 = r12.f219483v
            com.tencent.mm.ui.conversation.FolderHelper r9 = r12.f219485x
            r5.f219569a = r6
            r5.f219570b = r7
            r5.f219571c = r9
            vd3.i r9 = r5.f219576h
            r6.setOnScrollListener(r9)
            vd3.i r6 = r5.f219576h
            r7.f219685B = r6
            com.tencent.mm.ui.conversation.e2 r6 = new com.tencent.mm.ui.conversation.e2
            r6.<init>(r5)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r6)
            com.tencent.mm.ui.LauncherUI r5 = com.tencent.p014mm.p136ui.LauncherUI.getInstance()
            com.tencent.mm.ui.MainTabUI r5 = r5.mo101375O7()
            r5.mo101427k()
            com.tencent.mm.ui.conversation.ConversationListView r5 = r12.f219476o
            com.tencent.mm.ui.conversation.p r6 = r12.f219483v
            r5.setAdapter(r6)
            com.tencent.mm.ui.conversation.ConversationListView r5 = r12.f219476o
            com.tencent.mm.ui.conversation.n r6 = new com.tencent.mm.ui.conversation.n
            com.tencent.mm.ui.conversation.p r7 = r12.f219483v
            androidx.fragment.app.FragmentActivity r9 = r12.getActivity()
            r6.<init>(r7, r5, r9)
            r5.setOnItemClickListener(r6)
            com.tencent.mm.ui.conversation.ConversationListView r5 = r12.f219476o
            com.tencent.mm.ui.conversation.o r6 = new com.tencent.mm.ui.conversation.o
            com.tencent.mm.ui.conversation.p r7 = r12.f219483v
            androidx.fragment.app.FragmentActivity r9 = r12.getActivity()
            int[] r10 = r12.f219465B
            r6.<init>(r7, r5, r9, r10)
            r5.setOnItemLongClickListener(r6)
            com.tencent.mm.ui.conversation.ConversationListView r5 = r12.f219476o
            com.tencent.mm.ui.conversation.z0 r6 = new com.tencent.mm.ui.conversation.z0
            r6.<init>(r12)
            r5.setonDispatchTouchEventListener(r6)
            wx2.a r5 = r12.f219466C
            if (r5 == 0) goto L_0x033c
            com.tencent.mm.ui.conversation.ConversationListView r6 = r12.f219476o
            r6.setActionBarUpdateCallback(r5)
        L_0x033c:
            com.tencent.mm.ui.MMFragmentActivity r5 = r12.f219475n
            if (r5 == 0) goto L_0x0345
            com.tencent.mm.ui.conversation.ConversationListView r6 = r12.f219476o
            r6.setActivity(r5)
        L_0x0345:
            com.tencent.mm.ui.conversation.MainUI$k r5 = r12.f219474K
            if (r5 == 0) goto L_0x0352
            boolean r6 = r5.f219503a
            boolean r7 = r5.f219504b
            boolean r5 = r5.f219505c
            r12.mo103819U(r6, r7, r5)
        L_0x0352:
            com.tencent.mm.ui.conversation.ConversationListView r5 = r12.f219476o
            r5.setSelection(r2)
            di3.d r0 = di3.C86312j.m106911c(r0)
            sy.b r0 = (p691sy.C77814b) r0
            com.tencent.mm.plugin.taskbar.ui.g r0 = r0.mo107777wY()
            r12.f219477p = r0
            com.tencent.mm.ui.conversation.ConversationListView r0 = r12.f219476o
            com.tencent.mm.plugin.taskbar.ui.f r0 = r0.getTaskBarView()
            if (r0 == 0) goto L_0x03d5
            com.tencent.mm.ui.conversation.ConversationListView r0 = r12.f219476o
            com.tencent.mm.plugin.taskbar.ui.f r0 = r0.getTaskBarView()
            com.tencent.mm.plugin.taskbar.ui.g r5 = r12.f219477p
            com.tencent.mm.plugin.taskbar.ui.TaskBarView r0 = (com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarView) r0
            r0.getClass()
            java.lang.String r6 = "MicroMsg.TaskBarView"
            java.lang.String r7 = "TaskBarView initPresenter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter r5 = (com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarViewPresenter) r5
            r0.f206512z1 = r5
            r5.getClass()
            r5.f206522a = r0
            com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter$homeTabChangedListener$1 r7 = r5.f206541t
            r7.alive()
            com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter$taskBarUpdateEventListener$1 r7 = r5.f206539r
            r7.alive()
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            r7.<init>(r5)
            com.tencent.p014mm.plugin.taskbar.p110ui.C30487f0.f82160d = r7
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            r7.<init>(r5)
            com.tencent.p014mm.plugin.taskbar.p110ui.C30491h.f82166d = r7
            java.lang.Class<vx2.i> r7 = vx2.C65900i.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            vx2.i r7 = (vx2.C65900i) r7
            vx2.r r7 = r7.xx0()
            if (r7 == 0) goto L_0x03b3
            com.tencent.mm.sdk.storage.MStorage$IOnStorageChange r9 = r5.f206540s
            r7.add(r9)
        L_0x03b3:
            java.lang.Class<ky2.i> r7 = ky2.C10432i.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ky2.i r7 = (ky2.C10432i) r7
            ky2.o r9 = r5.f206542u
            r7.mo10739MV(r9)
            r5.mo98242l()
            r5.mo98233c(r13)
            java.lang.String r5 = "forceReloadData"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            java.lang.Runnable r5 = r0.f206507o2
            r0.removeCallbacks(r5)
            java.lang.Runnable r5 = r0.f206507o2
            r0.post(r5)
        L_0x03d5:
            com.tencent.mm.ui.conversation.InitHelper r0 = r12.f219486y
            androidx.fragment.app.FragmentActivity r5 = r12.getActivity()
            com.tencent.mm.ui.conversation.BannerHelper r6 = r12.f219484w
            com.tencent.mm.ui.conversation.FolderHelper r7 = r12.f219485x
            r0.getClass()
            java.lang.Object[] r9 = new java.lang.Object[r13]
            int r10 = r5.hashCode()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r2] = r10
            java.lang.String r10 = "MicroMsg.InitHelper"
            java.lang.String r11 = "onCreate %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r9)
            r0.f219447o = r5
            r0.f219449q = r6
            r0.f219450r = r7
            r0.f219451s = r12
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r6.<init>(r5)
            r0.f219448p = r6
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r6 = "power"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.os.PowerManager r5 = (android.os.PowerManager) r5
            r6 = 26
            java.lang.String r7 = "NetSceneInit Lock"
            android.os.PowerManager$WakeLock r5 = r5.newWakeLock(r6, r7)
            r0.f219443h = r5
            ob0.b0 r5 = eb0.C97625j3.m125815e()
            r5.mo123455a(r8, r0)
            r0.f219444i = r2
            com.tencent.mm.sdk.event.IListener r5 = r0.f219452t
            r5.alive()
            com.tencent.mm.sdk.event.IListener r5 = r0.f219453u
            r5.alive()
            zt3.t r5 = zt3.C119157j.f356862d
            com.tencent.mm.ui.conversation.InitHelper$$a r6 = new com.tencent.mm.ui.conversation.InitHelper$$a
            r6.<init>(r0)
            zt3.j r5 = (zt3.C119157j) r5
            java.lang.String r0 = "InitHelper-Report"
            r5.mo183876g(r6, r0)
            com.tencent.mm.ui.conversation.q2 r0 = r12.f219487z
            com.tencent.mm.ui.conversation.p r5 = r12.f219483v
            com.tencent.mm.ui.conversation.ConversationListView r6 = r12.f219476o
            androidx.fragment.app.FragmentActivity r7 = r12.getActivity()
            r0.f219774e = r5
            r0.f219773d = r7
            r0.f219775f = r6
            com.tencent.mm.sdk.event.IListener r5 = r0.f219776g
            if (r5 != 0) goto L_0x045d
            com.tencent.mm.ui.conversation.k2 r5 = new com.tencent.mm.ui.conversation.k2
            r5.<init>(r0)
            com.tencent.mm.ui.conversation.RefreshHelper$2 r7 = new com.tencent.mm.ui.conversation.RefreshHelper$2
            com.tencent.mm.app.f r8 = com.tencent.p014mm.app.C40008f.f107254d
            r7.<init>(r0, r8, r5)
            r0.f219776g = r7
        L_0x045d:
            com.tencent.mm.sdk.event.IListener r5 = r0.f219777h
            if (r5 != 0) goto L_0x046a
            com.tencent.mm.ui.conversation.RefreshHelper$3 r5 = new com.tencent.mm.ui.conversation.RefreshHelper$3
            com.tencent.mm.app.f r7 = com.tencent.p014mm.app.C40008f.f107254d
            r5.<init>(r0, r7)
            r0.f219777h = r5
        L_0x046a:
            com.tencent.mm.sdk.event.IListener r5 = r0.f219778i
            if (r5 != 0) goto L_0x0477
            com.tencent.mm.ui.conversation.RefreshHelper$4 r5 = new com.tencent.mm.ui.conversation.RefreshHelper$4
            com.tencent.mm.app.f r7 = com.tencent.p014mm.app.C40008f.f107254d
            r5.<init>(r0, r7, r6)
            r0.f219778i = r5
        L_0x0477:
            com.tencent.mm.sdk.event.IListener r5 = r0.f219776g
            r5.alive()
            com.tencent.mm.sdk.event.IListener r5 = r0.f219777h
            r5.alive()
            com.tencent.mm.sdk.event.IListener r5 = r0.f219778i
            r5.alive()
            com.tencent.mm.ui.conversation.m2 r5 = new com.tencent.mm.ui.conversation.m2
            r5.<init>(r0)
            r0.f219779j = r5
            android.os.MessageQueue r5 = android.os.Looper.myQueue()
            android.os.MessageQueue$IdleHandler r7 = r0.f219779j
            r5.addIdleHandler(r7)
            com.tencent.mm.ui.conversation.n2 r5 = new com.tencent.mm.ui.conversation.n2
            r5.<init>(r0)
            r6.post(r5)
            com.tencent.mm.modelimage.AutoGetBigImgLogic r0 = com.tencent.p014mm.modelimage.C92837k0.vx0()
            r5 = 2131231570(0x7f080352, float:1.8079225E38)
            r0.getClass()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "chattingMaskResId change from "
            r6.append(r7)
            int r7 = r0.f267188f
            r6.append(r7)
            java.lang.String r7 = " to "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.AutoGetBigImgLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            r0.f267188f = r5
            java.lang.Class<sl.b> r0 = p919sl.C77725b.class
            androidx.lifecycle.i0 r0 = com.tencent.p014mm.sdk.event.MvvmEventCenter.getEvent(r0)
            sl.b r0 = (p919sl.C77725b) r0
            androidx.fragment.app.FragmentActivity r5 = r12.thisActivity()
            com.tencent.mm.sdk.observer.IMvvmObserver<java.lang.Object> r6 = r12.f219468E
            r0.observeInUIThread(r5, r6)
            java.lang.Class<sl.a> r0 = p919sl.C77724a.class
            androidx.lifecycle.i0 r0 = com.tencent.p014mm.sdk.event.MvvmEventCenter.getEvent(r0)
            sl.a r0 = (p919sl.C77724a) r0
            androidx.fragment.app.FragmentActivity r5 = r12.thisActivity()
            com.tencent.mm.sdk.observer.IMvvmObserver<java.lang.Integer> r6 = r12.f219469F
            r0.observeInUIThread(r5, r6)
            f40.C86718e.f251744t = r2
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r0 = r0.mo105908w()
            com.tencent.mm.ui.conversation.ConversationUnreadHelper r5 = com.tencent.p014mm.p136ui.conversation.ConversationUnreadHelper.f219386g
            r0.add(r5)
            com.tencent.mm.ui.conversation.ConversationUnreadHelper r0 = com.tencent.p014mm.p136ui.conversation.ConversationUnreadHelper.f219386g
            com.tencent.mm.sdk.storage.observer.StorageObserverOwner<xh.k1> r5 = p749xh.C53339k1.f149473Q1
            r5.observe(r12, r0)
            com.tencent.mm.contact.ContactUpgradeHelper r0 = com.tencent.p014mm.contact.ContactUpgradeHelper.f10280h
            r5.observe(r12, r0)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r0 = r0.mo105907v()
            com.tencent.mm.ui.conversation.p r5 = r12.f219483v
            r0.add(r5)
            com.tencent.mm.ui.conversation.p r0 = r12.f219483v
            com.tencent.mm.sdk.event.IListener r5 = r0.f219687D
            if (r5 != 0) goto L_0x0523
            com.tencent.mm.ui.conversation.ConversationWithCacheAdapter$2 r5 = new com.tencent.mm.ui.conversation.ConversationWithCacheAdapter$2
            com.tencent.mm.app.f r6 = com.tencent.p014mm.app.C40008f.f107254d
            r5.<init>(r0, r6)
            r0.f219687D = r5
        L_0x0523:
            com.tencent.mm.sdk.event.IListener r0 = r0.f219687D
            r0.alive()
            com.tencent.mm.ui.conversation.p r0 = r12.f219483v
            com.tencent.mm.ui.conversation.w0 r5 = new com.tencent.mm.ui.conversation.w0
            r5.<init>(r12)
            r0.f219688E = r5
            java.lang.Class<bv1.b> r5 = bv1.C28426b.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            bv1.b r5 = (bv1.C28426b) r5
            if (r5 == 0) goto L_0x054a
            com.tencent.mm.sdk.storage.MAutoStorage r6 = r5.mo55960Hq()
            if (r6 == 0) goto L_0x054a
            com.tencent.mm.sdk.storage.MAutoStorage r5 = r5.mo55960Hq()
            com.tencent.mm.sdk.storage.MStorage$IOnStorageChange r0 = r0.f219709W
            r5.add(r0)
        L_0x054a:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0[r2] = r3
            eb0.c r3 = eb0.C97625j3.m125812b()
            int r3 = r3.mo105881G()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r13] = r3
            r3 = 2
            int r4 = qe3.C89625d.f257841g
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r3] = r4
            java.lang.String r3 = "kevin mainUIOnCreate time:%d uin:%d ver:%x"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r0 < r3) goto L_0x0596
            com.tencent.mm.ui.LauncherUI r0 = com.tencent.p014mm.p136ui.LauncherUI.getInstance()
            if (r0 == 0) goto L_0x0596
            com.tencent.mm.ui.LauncherUI r0 = com.tencent.p014mm.p136ui.LauncherUI.getInstance()
            boolean r0 = r0.isInMultiWindowMode()
            r12.f219471H = r0
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r13[r2] = r0
            java.lang.String r0 = "initMultiWindowModeListener %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r13)
        L_0x0596:
            com.tencent.mm.ui.conversation.ConversationListView r13 = r12.f219476o
            com.tencent.mm.ui.conversation.MainUI$b r0 = new com.tencent.mm.ui.conversation.MainUI$b
            r0.<init>()
            r1 = 200(0xc8, double:9.9E-322)
            r13.postDelayed(r0, r1)
            cm3.a r13 = r12.f219467D
            r12.setOnVisibilityChangedListener(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.MainUI.mo101235K(android.os.Bundle):void");
    }

    /* renamed from: L */
    public void mo101236L() {
        Log.m105925i("MicroMsg.MainUI", "onTabDestroy  acc:%b", Boolean.valueOf(C97625j3.m125811a()));
        C79547b.f233255g.mo109607a(new C74658g());
        FolderHelper folderHelper = this.f219485x;
        folderHelper.getClass();
        Log.m105924i("MicroMsg.FolderHelper", "onTabDestroy");
        folderHelper.mo103798u();
        C78802b bVar = folderHelper.f219408g;
        if (bVar != null) {
            bVar.mo7968a();
        }
        C76598b bVar2 = folderHelper.f219398E;
        if (bVar2 != null) {
            bVar2.mo106817a();
        }
        if (C97625j3.m125811a()) {
            C97625j3.m125812b().mo105885K(folderHelper);
            ((C72972g4) C97625j3.m125812b().mo105911z()).sy0(folderHelper);
            C97625j3.m125812b().mo105908w().remove(folderHelper);
        }
        folderHelper.f219399F.dead();
        folderHelper.f219406e = null;
        InitHelper initHelper = this.f219486y;
        initHelper.getClass();
        try {
            initHelper.f219454v.unlock();
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.InitHelper", "onTabDestroy, dupDetectLock unlock failed : " + th.getMessage());
        }
        C97625j3.m125815e().mo123470p(-1, initHelper);
        ProgressDialog progressDialog = initHelper.f219446n;
        if (progressDialog != null) {
            progressDialog.dismiss();
            initHelper.f219446n = null;
        }
        initHelper.f219452t.dead();
        initHelper.f219453u.dead();
        C74739q2 q2Var = this.f219487z;
        IListener iListener = q2Var.f219776g;
        if (iListener != null) {
            iListener.dead();
            q2Var.f219776g = null;
        }
        q2Var.f219777h.dead();
        q2Var.f219778i.dead();
        if (C75350g.m90357a() != null) {
            ((C48497j) C75350g.m90357a()).mo73132f(q2Var);
        }
        if (C97625j3.m125811a()) {
            int i = C77702q0.f226484a;
            Log.m105929w("MicroMsg.Util", "memory usage: h=%s/%s, e=%s/%s, n=%s/%s", C77702q0.m93718a((long) Debug.getGlobalAllocSize()), C77702q0.m93718a((long) (Debug.getGlobalAllocSize() + Debug.getGlobalFreedSize())), C77702q0.m93718a((long) Debug.getGlobalExternalAllocSize()), C77702q0.m93718a((long) (Debug.getGlobalExternalAllocSize() + Debug.getGlobalExternalFreedSize())), C77702q0.m93718a(Debug.getNativeHeapAllocatedSize()), C77702q0.m93718a(Debug.getNativeHeapSize()));
        }
        if (C97625j3.m125811a()) {
            C97625j3.m125812b().mo105908w().add(ConversationUnreadHelper.f219386g);
            if (this.f219483v != null) {
                C97625j3.m125812b().mo105908w().remove(this.f219483v);
                C97625j3.m125812b().mo105907v().remove(this.f219483v);
            }
        }
        C74720p pVar = this.f219483v;
        if (pVar != null) {
            IListener iListener2 = pVar.f219687D;
            if (iListener2 != null) {
                iListener2.dead();
                pVar.f219687D = null;
            }
            C74720p pVar2 = this.f219483v;
            pVar2.f219688E = null;
            pVar2.f219688E = null;
            HashMap<String, C74720p.C74731k> hashMap = pVar2.f219717y;
            if (hashMap != null) {
                hashMap.clear();
                pVar2.f219717y = null;
            }
            pVar2.mo104608d(true);
            pVar2.f220761i = null;
            C74720p.f219683U0.clear();
            C28426b bVar3 = (C28426b) C86312j.m106911c(C28426b.class);
            if (!(bVar3 == null || bVar3.mo55960Hq() == null)) {
                bVar3.mo55960Hq().remove(pVar2.f219709W);
            }
            Log.m105924i("MicroMsg.ConversationWithCacheAdapter", "clear usernamePositionMap");
        }
        this.f219467D = null;
        setOnVisibilityChangedListener((C67406a) null);
    }

    /* renamed from: M */
    public void mo101237M() {
        Log.m105924i("MicroMsg.MainUI", "onTabPause");
        if (!C85875k4.m106208w()) {
            C79547b.f233255g.mo109607a(new C74656e());
            this.f219486y.mo103806c();
            hideVKB();
            this.f219487z.mo103906a();
            mo103816R();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02df  */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo101238N() {
        /*
            r21 = this;
            r0 = r21
            java.lang.String r1 = "MicroMsg.MainUI"
            java.lang.String r2 = "onTabResume"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r21.mo103817S()
            ai.b r4 = p787ai.C79547b.f233255g
            com.tencent.mm.ui.conversation.MainUI$c r5 = new com.tencent.mm.ui.conversation.MainUI$c
            r5.<init>()
            r4.mo109607a(r5)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r5[r3] = r2
            java.lang.String r2 = "start time check dkinit KEVIN mainui TestTimeLayoutTime onTabResume:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r2, r5)
            com.tencent.mm.ui.conversation.q2 r1 = r0.f219487z
            r1.getClass()
            dd0.b r2 = dd0.C75350g.m90357a()
            if (r2 == 0) goto L_0x0042
            dd0.b r2 = dd0.C75350g.m90357a()
            sx2.j r2 = (sx2.C48497j) r2
            r2.mo73127a(r1)
        L_0x0042:
            com.tencent.mm.ui.conversation.o2 r2 = new com.tencent.mm.ui.conversation.o2
            r2.<init>(r1)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            android.app.Activity r5 = r1.f219773d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.isGPVersion()
            if (r2 != 0) goto L_0x0056
        L_0x0052:
            r19 = r1
            goto L_0x022a
        L_0x0056:
            java.lang.Class<lc3.b> r2 = lc3.C10485b.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            lc3.b r2 = (lc3.C10485b) r2
            pj.f r2 = r2.vh0()
            java.lang.String r6 = "NewShowRating"
            java.lang.String r2 = r2.mo107405c(r6)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r6 == 0) goto L_0x006f
            goto L_0x0052
        L_0x006f:
            java.lang.String r6 = "ShowRatingNode"
            java.lang.String r7 = "utf-8"
            java.util.Map r2 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r2, r6, r7)
            java.lang.String r6 = "0"
            if (r2 == 0) goto L_0x008c
            java.lang.String r7 = ".ShowRatingNode.MinVer"
            java.lang.Object r8 = r2.get(r7)
            if (r8 != 0) goto L_0x0085
            goto L_0x008c
        L_0x0085:
            java.lang.Object r7 = r2.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x008d
        L_0x008c:
            r7 = r6
        L_0x008d:
            java.lang.Integer r7 = java.lang.Integer.decode(r7)
            int r7 = r7.intValue()
            if (r2 == 0) goto L_0x00a7
            java.lang.String r8 = ".ShowRatingNode.MaxVer"
            java.lang.Object r9 = r2.get(r8)
            if (r9 != 0) goto L_0x00a0
            goto L_0x00a7
        L_0x00a0:
            java.lang.Object r8 = r2.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x00a8
        L_0x00a7:
            r8 = r6
        L_0x00a8:
            java.lang.Integer r8 = java.lang.Integer.decode(r8)
            int r8 = r8.intValue()
            if (r2 == 0) goto L_0x00c2
            java.lang.String r9 = ".ShowRatingNode.WaitDays"
            java.lang.Object r10 = r2.get(r9)
            if (r10 != 0) goto L_0x00bb
            goto L_0x00c2
        L_0x00bb:
            java.lang.Object r2 = r2.get(r9)
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
        L_0x00c2:
            java.lang.Integer r2 = java.lang.Integer.decode(r6)
            int r2 = r2.intValue()
            int r6 = qe3.C89625d.f257841g
            if (r7 > r6) goto L_0x0052
            if (r6 <= r8) goto L_0x00d1
            goto L_0x0052
        L_0x00d1:
            java.lang.String r6 = "show_rating_preferences"
            android.content.SharedPreferences r6 = r5.getSharedPreferences(r6, r3)
            java.lang.String r9 = "show_rating_flag"
            int r10 = r6.getInt(r9, r3)
            java.lang.String r11 = "show_rating_version"
            int r12 = r6.getInt(r11, r3)
            java.lang.String r13 = "show_rating_timestamp"
            r14 = 0
            long r16 = r6.getLong(r13, r14)
            java.lang.String r14 = "show_rating_again"
            boolean r15 = r6.getBoolean(r14, r3)
            if (r2 != 0) goto L_0x00f7
            r18 = 7
            r4 = 7
            goto L_0x00f8
        L_0x00f7:
            r4 = r2
        L_0x00f8:
            long r3 = (long) r4
            r19 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 * r19
            if (r12 != 0) goto L_0x0101
            goto L_0x010a
        L_0x0101:
            if (r7 > r12) goto L_0x010a
            if (r12 > r8) goto L_0x010a
            r20 = r10
            r19 = 0
            goto L_0x010e
        L_0x010a:
            r20 = r10
            r19 = 1
        L_0x010e:
            java.lang.String r10 = "MicroMsg.MainUI.RatingDialogHelper"
            if (r19 == 0) goto L_0x019d
            android.content.SharedPreferences$Editor r0 = r6.edit()
            r19 = r1
            int r1 = qe3.C89625d.f257841g
            android.content.SharedPreferences$Editor r0 = r0.putInt(r11, r1)
            r0.commit()
            android.content.SharedPreferences$Editor r0 = r6.edit()
            r1 = 0
            android.content.SharedPreferences$Editor r0 = r0.putInt(r9, r1)
            r0.commit()
            r0 = r2
            long r1 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r11 = r6.edit()
            android.content.SharedPreferences$Editor r11 = r11.putLong(r13, r1)
            r11.commit()
            android.content.SharedPreferences$Editor r11 = r6.edit()
            r13 = 0
            android.content.SharedPreferences$Editor r11 = r11.putBoolean(r14, r13)
            r11.commit()
            android.content.SharedPreferences$Editor r11 = r6.edit()
            java.lang.String r13 = "show_rating_wait_days"
            android.content.SharedPreferences$Editor r0 = r11.putInt(r13, r0)
            r0.commit()
            android.content.SharedPreferences$Editor r0 = r6.edit()
            long r13 = java.lang.System.currentTimeMillis()
            r16 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 / r16
            int r11 = (int) r13
            java.lang.String r13 = "show_rating_first_second_time"
            android.content.SharedPreferences$Editor r0 = r0.putInt(r13, r11)
            r0.commit()
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r11 = qe3.C89625d.f257841g
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13 = 0
            r0[r13] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r12 = 1
            r0[r12] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r12 = 2
            r0[r12] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r12 = 3
            r0[r12] = r11
            java.lang.Long r11 = java.lang.Long.valueOf(r3)
            r12 = 4
            r0[r12] = r11
            java.lang.String r11 = "[oneliang]current clientVersion=%s,has rating clientVersion=%s,dynamic config showRatting min version=%s,max version:%s,waitDaysMillis:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r0)
            r16 = r1
            r0 = 0
            goto L_0x01a1
        L_0x019d:
            r19 = r1
            r0 = r20
        L_0x01a1:
            int r1 = qe3.C89625d.f257841g
            if (r7 > r1) goto L_0x01e8
            if (r1 > r8) goto L_0x01e8
            if (r0 != 0) goto L_0x01e8
            r1 = 0
            int r7 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r7 == 0) goto L_0x01e8
            long r1 = java.lang.System.currentTimeMillis()
            long r7 = r16 + r3
            int r11 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r11 < 0) goto L_0x01e8
            java.lang.String r0 = "[oneliang]show enjoy app dialog."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            r0 = 0
            r1 = 2131836679(0x7f113f07, float:1.9306532E38)
            java.lang.String r7 = r5.getString(r1)
            r1 = 2131836672(0x7f113f00, float:1.9306517E38)
            java.lang.String r9 = r5.getString(r1)
            r1 = 2131836671(0x7f113eff, float:1.9306515E38)
            java.lang.String r10 = r5.getString(r1)
            com.tencent.mm.ui.conversation.g2 r11 = new com.tencent.mm.ui.conversation.g2
            r11.<init>(r6, r5)
            com.tencent.mm.ui.conversation.h2 r12 = new com.tencent.mm.ui.conversation.h2
            r12.<init>(r6, r5)
            java.lang.String r8 = ""
            r6 = r0
            qo3.g r0 = nj3.C76879j.m92717K(r5, r6, r7, r8, r9, r10, r11, r12)
            com.tencent.p014mm.p136ui.conversation.C6964i2.f24671a = r0
            goto L_0x022a
        L_0x01e8:
            if (r15 == 0) goto L_0x0215
            r1 = 0
            int r7 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r7 == 0) goto L_0x0215
            long r1 = java.lang.System.currentTimeMillis()
            long r16 = r16 + r3
            r3 = 345600000(0x14997000, double:1.70749087E-315)
            long r16 = r16 + r3
            int r3 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r3 < 0) goto L_0x0215
            java.lang.String r0 = "[oneliang]show rating dialog again."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            r0 = 0
            com.tencent.p014mm.p136ui.conversation.C6964i2.m7232b(r5, r0)
            android.content.SharedPreferences$Editor r0 = r6.edit()
            r1 = 3
            android.content.SharedPreferences$Editor r0 = r0.putInt(r9, r1)
            r0.commit()
            goto L_0x022a
        L_0x0215:
            r1 = 1
            if (r0 != r1) goto L_0x021c
            com.tencent.p014mm.p136ui.conversation.C6964i2.m7232b(r5, r1)
            goto L_0x022a
        L_0x021c:
            r1 = 2
            if (r0 != r1) goto L_0x0223
            com.tencent.p014mm.p136ui.conversation.C6964i2.m7231a(r5)
            goto L_0x022a
        L_0x0223:
            r1 = 3
            if (r0 != r1) goto L_0x022a
            r0 = 0
            com.tencent.p014mm.p136ui.conversation.C6964i2.m7232b(r5, r0)
        L_0x022a:
            r0 = r19
            android.app.Activity r1 = r0.f219773d
            if (r1 == 0) goto L_0x0258
            android.content.Intent r1 = r1.getIntent()
            if (r1 == 0) goto L_0x0258
            android.app.Activity r1 = r0.f219773d
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r2 = "resend_fail_messages"
            r3 = 0
            boolean r1 = r1.getBooleanExtra(r2, r3)
            if (r1 == 0) goto L_0x0258
            com.tencent.mm.ui.conversation.p2 r1 = new com.tencent.mm.ui.conversation.p2
            r1.<init>(r0)
            r4 = 500(0x1f4, double:2.47E-321)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r1, r4)
            android.app.Activity r1 = r0.f219773d
            android.content.Intent r1 = r1.getIntent()
            r1.putExtra(r2, r3)
        L_0x0258:
            android.app.Activity r1 = r0.f219773d
            com.tencent.mm.ui.LauncherUI r1 = (com.tencent.p014mm.p136ui.LauncherUI) r1
            if (r1 == 0) goto L_0x0271
            com.tencent.mm.ui.HomeUI r1 = r1.getHomeUI()
            java.lang.Runnable r2 = r0.f219780n
            java.util.LinkedList<java.lang.Runnable> r3 = r1.f214270P
            boolean r3 = r3.contains(r2)
            if (r3 != 0) goto L_0x0271
            java.util.LinkedList<java.lang.Runnable> r1 = r1.f214270P
            r1.add(r2)
        L_0x0271:
            android.app.Activity r1 = r0.f219773d
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r2 = "Main_ListToTop"
            r3 = 0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getBooleanExtra(r1, r2, r3)
            if (r1 == 0) goto L_0x028c
            com.tencent.mm.ui.conversation.ConversationListView r1 = r0.f219775f
            if (r1 == 0) goto L_0x028c
            com.tencent.mm.ui.conversation.j2 r3 = new com.tencent.mm.ui.conversation.j2
            r3.<init>(r0)
            r1.post(r3)
        L_0x028c:
            android.app.Activity r0 = r0.f219773d
            android.content.Intent r0 = r0.getIntent()
            r1 = 0
            com.tencent.p014mm.sdk.platformtools.IntentUtil.putExtra((android.content.Intent) r0, (java.lang.String) r2, (boolean) r1)
            r0 = r21
            com.tencent.mm.ui.conversation.InitHelper r1 = r0.f219486y
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            android.app.ProgressDialog r3 = r1.f219446n
            r4 = -1
            if (r3 != 0) goto L_0x02a4
            r3 = -1
            goto L_0x02ad
        L_0x02a4:
            boolean r3 = r3.isShowing()
            if (r3 == 0) goto L_0x02ac
            r3 = 1
            goto L_0x02ad
        L_0x02ac:
            r3 = 0
        L_0x02ad:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r2[r5] = r3
            pc0.o r3 = r1.f219445j
            if (r3 != 0) goto L_0x02ba
            r3 = -2
            goto L_0x02be
        L_0x02ba:
            int r3 = r3.hashCode()
        L_0x02be:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "MicroMsg.InitHelper"
            java.lang.String r5 = "onTabResume tip:%d initscene:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r2)
            r1.mo103807d()
            com.tencent.mm.ui.conversation.r0 r2 = new com.tencent.mm.ui.conversation.r0
            r2.<init>(r1)
            r5 = 100
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r2, r5)
            boolean r1 = eb0.C97625j3.m125811a()
            if (r1 == 0) goto L_0x0337
            com.tencent.mm.ui.conversation.InitHelper r1 = r0.f219486y
            pc0.o r1 = r1.f219445j
            if (r1 == 0) goto L_0x02e7
            r1 = 1
            goto L_0x02e8
        L_0x02e7:
            r1 = 0
        L_0x02e8:
            if (r1 != 0) goto L_0x0337
            oa1.d r1 = oa1.C117731d.m166007c()
            java.lang.String r2 = "clicfg_exdevice_not_sync_data_in_mainui"
            r3 = 1
            int r1 = r1.mo182443e(r2, r3, r3, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "isExDeviceMainUISyncDataDisabled:"
            r2.append(r5)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "MicroMsg.ProcessReclaimSwitch"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r2 != 0) goto L_0x0319
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r2 != 0) goto L_0x0319
            if (r1 != 0) goto L_0x0316
            goto L_0x0317
        L_0x0316:
            r3 = 0
        L_0x0317:
            r1 = r3
            goto L_0x031a
        L_0x0319:
            r1 = 0
        L_0x031a:
            if (r1 == 0) goto L_0x0327
            java.lang.Class<sl.c> r1 = p919sl.C77726c.class
            androidx.lifecycle.i0 r1 = com.tencent.p014mm.sdk.event.MvvmEventCenter.getEvent(r1)
            sl.c r1 = (p919sl.C77726c) r1
            r1.publish()
        L_0x0327:
            java.lang.Class<tv2.d> r1 = tv2.C78112d.class
            androidx.lifecycle.i0 r1 = com.tencent.p014mm.sdk.event.MvvmEventCenter.getEvent(r1)
            tv2.d r1 = (tv2.C78112d) r1
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.publish(r2)
        L_0x0337:
            boolean r1 = eb0.C97625j3.m125811a()
            if (r1 == 0) goto L_0x034e
            com.tencent.mm.autogen.events.MulitTaskEvent r1 = new com.tencent.mm.autogen.events.MulitTaskEvent
            r1.<init>()
            com.tencent.mm.autogen.events.MulitTaskEvent$a r2 = r1.f193741d
            r3 = 3
            r2.f193744c = r3
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.asyncPublish((android.os.Looper) r2)
        L_0x034e:
            vo3.f r1 = r21.getBounceView()
            if (r1 == 0) goto L_0x037c
            r2 = r1
            com.tencent.mm.ui.widget.pulldown.NestedBounceView r2 = (com.tencent.p014mm.p136ui.widget.pulldown.NestedBounceView) r2
            r3 = 0
            r2.mo154638f(r3)
            android.app.Activity r2 = r21.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131099650(0x7f060002, float:1.781166E38)
            int r2 = r2.getColor(r3)
            r1.setEnd2StartBgColor(r2)
            com.tencent.mm.ui.conversation.MainUI$d r1 = new com.tencent.mm.ui.conversation.MainUI$d
            r1.<init>()
            com.tencent.mm.ui.conversation.ConversationListView r2 = r0.f219476o
            if (r2 == 0) goto L_0x037c
            r3 = 2131317074(0x7f095152, float:1.8252647E38)
            r2.setTag(r3, r1)
        L_0x037c:
            com.tencent.mm.ui.MMActivityController r1 = r21.getController()
            if (r1 == 0) goto L_0x03c4
            androidx.fragment.app.FragmentActivity r2 = r21.getActivity()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131101246(0x7f06063e, float:1.7814896E38)
            int r2 = r2.getColor(r3)
            android.widget.FrameLayout r3 = r1.f348098g
            if (r3 == 0) goto L_0x03c4
            r5 = 2131315523(0x7f094b43, float:1.8249502E38)
            android.view.View r3 = r3.findViewById(r5)
            if (r3 != 0) goto L_0x03c1
            android.view.View r3 = new android.view.View
            androidx.appcompat.app.AppCompatActivity r6 = r1.mo177096t()
            r3.<init>(r6)
            r3.setId(r5)
            android.widget.FrameLayout r5 = r1.f348098g
            r5.addView(r3)
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r5 = (android.widget.FrameLayout.LayoutParams) r5
            r5.width = r4
            androidx.appcompat.app.AppCompatActivity r1 = r1.mo177096t()
            int r1 = com.tencent.p014mm.p136ui.C75044y4.m89995g(r1, r4)
            r5.height = r1
        L_0x03c1:
            r3.setBackgroundColor(r2)
        L_0x03c4:
            java.lang.String r1 = com.tencent.p014mm.p136ui.mmfb.sdk.C116102h.f348429g
            java.lang.String r1 = "MicroMsg.FacebookLoginUI"
            java.lang.String r2 = "facebook resetCheck"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            java.lang.Class<mz.e> r1 = p617mz.C76813e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            mz.e r1 = (p617mz.C76813e) r1
            r1.mo10948mU()
            java.lang.Class<xx.g> r1 = p274xx.C66446g.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            xx.g r1 = (p274xx.C66446g) r1
            r1.mo61615xW()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.MainUI.mo101238N():void");
    }

    /* renamed from: O */
    public void mo101239O() {
        Log.m105924i("MicroMsg.MainUI", "onTabStart");
    }

    /* renamed from: P */
    public void mo101240P() {
        C71325e eVar;
        TaskBarView taskBarView;
        Log.m105924i("MicroMsg.MainUI", "onTabStop");
        if (C85875k4.m106208w()) {
            C79547b.f233255g.mo109607a(new C74657f());
            this.f219486y.mo103806c();
            hideVKB();
            this.f219487z.mo103906a();
            mo103816R();
        }
        ConversationListView conversationListView = this.f219476o;
        if (conversationListView != null && conversationListView.f219349g && (eVar = conversationListView.f219351i) != null && (taskBarView = ((TaskBarContainer) eVar).f206446e) != null) {
            Log.m105924i("MicroMsg.TaskBarView", "onStop");
            taskBarView.f206488V1 = true;
        }
    }

    /* renamed from: Q */
    public void mo101241Q() {
    }

    /* renamed from: R */
    public void mo103816R() {
        C74720p pVar = this.f219483v;
        if (pVar != null) {
            Log.m105918d("MicroMsg.ConversationWithCacheAdapter", "unreadcheck adpter onPause  hasResume " + pVar.f219689F);
            if (pVar.f219689F) {
                pVar.f219689F = false;
                pVar.f220757e = false;
                Log.m105924i(pVar.f220756d, "new cursor pasue");
                MMSlideDelView.C73186f fVar = pVar.f219684A;
                if (fVar != null) {
                    fVar.mo97957b();
                }
            }
        }
    }

    /* renamed from: S */
    public void mo103817S() {
        C74720p.C74730j jVar;
        HashMap<String, C74720p.C74731k> hashMap;
        HashSet<String> hashSet;
        C74720p.C74731k kVar;
        C74720p pVar = this.f219483v;
        if (pVar != null) {
            Log.m105918d("MicroMsg.ConversationWithCacheAdapter", "unreadcheck adpter onResume  hasResume " + pVar.f219689F);
            if (!pVar.f219689F) {
                pVar.f219689F = true;
                pVar.mo103888O();
                if (!(pVar.f219717y == null || (hashSet = pVar.f219690G) == null || hashSet.isEmpty())) {
                    Log.m105919d("MicroMsg.ConversationWithCacheAdapter", "dealWithContactEvents contactEvents size %d", Integer.valueOf(pVar.f219690G.size()));
                    Iterator<String> it = pVar.f219690G.iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        String next = it.next();
                        if (next != null && !next.equals("") && pVar.f219717y.containsKey(next) && (kVar = pVar.f219717y.get(next)) != null) {
                            pVar.f219710X.mo103900b(next);
                            boolean U5 = C72996z1.m85820U5(next);
                            C72996z1 a = pVar.f219710X.mo103899a();
                            if (a != null) {
                                String As0 = ((C75339i) C86312j.m106911c(C75339i.class)).As0(a, next, U5);
                                Log.m105919d("MicroMsg.ConversationWithCacheAdapter", "dealWithContactEvents newdisplayname %s old dispalyname %s", As0, kVar.f219729b);
                                if (As0 != null && !As0.equals(kVar.f219729b)) {
                                    kVar.f219729b = As0;
                                    pVar.mo103889P(kVar, a);
                                    z = true;
                                }
                                boolean K = C45628s0.m50746K(a);
                                boolean z2 = a.f149512S == 0;
                                if (kVar.f219739l != K || z2 != kVar.f219742o) {
                                    kVar.f219739l = K;
                                    kVar.f219742o = z2;
                                    Log.m105919d("MicroMsg.ConversationWithCacheAdapter", "dealWithContactEvents in cache username %s mute change", next);
                                    z = true;
                                }
                            }
                        }
                    }
                    if (z) {
                        pVar.notifyDataSetChanged();
                    }
                    pVar.f219690G.clear();
                }
                Log.m105924i(pVar.f220756d, "newcursor resume syncNow ");
                pVar.f220757e = true;
                pVar.mo104620t(true, true);
                Time time = new Time();
                time.setToNow();
                String charSequence = C72714e.m85106a("MM/dd", time).toString();
                String applicationLanguage = LocaleUtil.getApplicationLanguage();
                boolean z3 = !pVar.f219699Q.equals(charSequence) || !pVar.f219701R.equals(applicationLanguage);
                pVar.f219699Q = charSequence;
                pVar.f219701R = applicationLanguage;
                if (z3 && (hashMap = pVar.f219717y) != null) {
                    for (Map.Entry<String, C74720p.C74731k> value : hashMap.entrySet()) {
                        ((C74720p.C74731k) value.getValue()).f219730c = null;
                    }
                }
                if (pVar.f219686C && (jVar = pVar.f219688E) != null) {
                    C74746w0 w0Var = (C74746w0) jVar;
                    C74720p pVar2 = w0Var.f219793a.f219483v;
                    HashMap<String, C74720p.C74731k> hashMap2 = pVar2.f219717y;
                    if (hashMap2 != null) {
                        hashMap2.clear();
                        pVar2.f219694K = true;
                    }
                    C97625j3.m125812b().mo105908w().add(w0Var.f219793a.f219483v);
                    C97625j3.m125812b().mo105907v().add(w0Var.f219793a.f219483v);
                    pVar.f219686C = false;
                    pVar.mo104618q(null, 1);
                }
            }
        }
    }

    /* renamed from: T */
    public final void mo103818T(int i, int i2) {
        Log.m105925i("MicroMsg.MainUI", "alvinluo setListMargin isInMultiWindowMode: %b", Boolean.valueOf(this.f219471H));
        ViewGroup.LayoutParams layoutParams = this.f219476o.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            int i3 = layoutParams2.topMargin;
            Log.m105925i("MicroMsg.MainUI", "alvinluo setListMargin origin: %d, topMargin: %d", Integer.valueOf(i3), Integer.valueOf(i));
            if (i3 <= 0 || this.f219471H) {
                if (!this.f219471H) {
                    layoutParams2.topMargin = i;
                } else {
                    layoutParams2.topMargin = 0;
                }
                this.f219476o.setLayoutParams(layoutParams);
            }
        }
        View view = this.f219478q;
        if (view != null) {
            int i4 = view.getLayoutParams().height;
            Log.m105925i("MicroMsg.MainUI", "alvinluo setStatusBarMaskView height origin: %d, new: %d isInMultiWindowMode:%s", Integer.valueOf(i4), Integer.valueOf(i2), Boolean.valueOf(this.f219471H));
            if (i4 > 0 && !this.f219471H) {
                return;
            }
            if (!this.f219471H) {
                this.f219478q.getLayoutParams().height = i2;
            } else {
                this.f219478q.getLayoutParams().height = 0;
            }
        }
    }

    /* renamed from: U */
    public void mo103819U(boolean z, boolean z2, boolean z3) {
        C71323d dVar;
        C71323d dVar2;
        ConversationListView conversationListView = this.f219476o;
        if (conversationListView instanceof ConversationListView) {
            conversationListView.getClass();
            Log.m105924i("MicroMsg.ConversationListView", "[showAppBrandHeader] isShow:" + z + " isAnim:" + z2 + " isScrollFirst:" + z3);
            if (z) {
                if (conversationListView.f219349g && (dVar2 = conversationListView.f219352j) != null) {
                    ((C71331l) dVar2).mo98265l();
                }
            } else if (conversationListView.f219349g && (dVar = conversationListView.f219352j) != null) {
                ((C71331l) dVar).mo98254a(0);
            }
        } else {
            this.f219474K = new C74662k(this, z, z2, z3);
        }
    }

    /* renamed from: V */
    public final void mo103820V() {
        ConversationListView conversationListView = this.f219476o;
        if (conversationListView != null) {
            boolean showHeaderContainer = conversationListView.getShowHeaderContainer();
            int g = C75044y4.m89995g(getContext(), -1);
            int a = C78538u.m94865a(this.f219476o.getContext());
            Log.m105925i("MicroMsg.MainUI", "alvinluo initListViewPadding actionBarHeight: %d, statusBarHeight: %d, showHeadrContainer: %b", Integer.valueOf(a), Integer.valueOf(g), Boolean.valueOf(showHeaderContainer));
            C74652a aVar = new C74652a(showHeaderContainer);
            if (g <= 0) {
                this.f219476o.post(aVar);
                return;
            }
            mo103818T(showHeaderContainer ? 0 : a, g);
            Log.m105925i("MicroMsg.MainUI", "[trySetListViewMargin] statusHeight: %s, actionBarHeight: %d", Integer.valueOf(g), Integer.valueOf(a));
            this.f219476o.postDelayed(aVar, 100);
        }
    }

    /* renamed from: d */
    public void mo25899d() {
        Log.m105924i("MicroMsg.MainUI", "dkinit onTabSwitchIn");
        InitHelper initHelper = this.f219486y;
        Object[] objArr = new Object[2];
        ProgressDialog progressDialog = initHelper.f219446n;
        objArr[0] = Integer.valueOf(progressDialog == null ? -1 : progressDialog.isShowing() ? 1 : 0);
        C47457o oVar = initHelper.f219445j;
        objArr[1] = Integer.valueOf(oVar == null ? -2 : oVar.hashCode());
        Log.m105925i("MicroMsg.InitHelper", "onTabSwitchIn tip:%d initscene:%d", objArr);
        if (initHelper.f219443h != null) {
            initHelper.mo103807d();
        }
        MMActivityController mMActivityController = this.mController;
        if (mMActivityController != null) {
            mMActivityController.mo177074f0();
        }
        C74720p pVar = this.f219483v;
        if (pVar != null) {
            pVar.f219703S = true;
            C72975h0.f212785a = C31543z5.m39451a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r0 = (com.tencent.p014mm.plugin.taskbar.p110ui.C71331l) r0;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25903g() {
        /*
            r3 = this;
            java.lang.String r0 = "MicroMsg.MainUI"
            java.lang.String r1 = "onTabSwitchOut"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.ui.conversation.ConversationListView r0 = r3.f219476o
            if (r0 == 0) goto L_0x001f
            r0.mo103728n()
            com.tencent.mm.plugin.taskbar.ui.d r0 = r0.f219352j
            if (r0 == 0) goto L_0x001f
            com.tencent.mm.plugin.taskbar.ui.l r0 = (com.tencent.p014mm.plugin.taskbar.p110ui.C71331l) r0
            android.view.View r1 = r0.f206599b1
            if (r1 == 0) goto L_0x001f
            r2 = 1
            r0.f206569G = r2
            r0 = 0
            r1.setTranslationY(r0)
        L_0x001f:
            com.tencent.mm.ui.conversation.p r0 = r3.f219483v
            if (r0 == 0) goto L_0x002b
            r1 = 0
            r0.f219703S = r1
            java.util.HashSet<java.lang.Long> r0 = fn3.C75778d.f222379c
            r0.clear()
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.MainUI.mo25903g():void");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b_r;
    }

    public View getLayoutView() {
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.b_r, (ViewGroup) null);
        this.f219470G = inflate;
        return inflate;
    }

    public boolean noActionBar() {
        return true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f219484w.mo103670h();
        FolderHelper folderHelper = this.f219485x;
        folderHelper.getClass();
        C87412m.m108594g(configuration, "newConfig");
        folderHelper.mo103781c(C85875k4.m106184h(folderHelper.f219406e).y, true);
        folderHelper.mo103778B(true);
        if (Build.VERSION.SDK_INT >= 24 && LauncherUI.getInstance() != null && this.f219471H != LauncherUI.getInstance().isInMultiWindowMode()) {
            this.f219471H = LauncherUI.getInstance().isInMultiWindowMode();
            mo103820V();
        }
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.MainUI", "onDestroy");
        this.f219464A.mo103843b();
        ConversationListView conversationListView = this.f219476o;
        if (conversationListView != null) {
            Log.m105924i("MicroMsg.ConversationListView", "onDestroy");
            C71325e eVar = conversationListView.f219351i;
            if (eVar != null) {
                TaskBarContainer taskBarContainer = (TaskBarContainer) eVar;
                Log.m105924i("MicroMsg.AppBrandDesktopContainer", "onDestroy");
                TaskBarView taskBarView = taskBarContainer.f206446e;
                if (taskBarView != null) {
                    Log.m105925i("MicroMsg.TaskBarView", "alvinluo TaskBarView onDestroy %d", Integer.valueOf(taskBarView.hashCode()));
                    taskBarView.f206512z1.f206522a = null;
                    try {
                        synchronized (taskBarView) {
                            MMHandler mMHandler = taskBarView.f206467A1;
                            if (mMHandler != null) {
                                mMHandler.removeCallbacksAndMessages((Object) null);
                            }
                            taskBarView.f206467A1 = null;
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.TaskBarView", e, "alvinluo onDestroy exception", new Object[0]);
                    }
                }
                IListener iListener = taskBarContainer.f206444J;
                if (iListener != null) {
                    iListener.dead();
                }
                Runnable runnable = taskBarContainer.f206443I;
                if (runnable != null) {
                    taskBarContainer.removeCallbacks(runnable);
                    taskBarContainer.f206443I = null;
                }
                DynamicBgContainer dynamicBgContainer = taskBarContainer.f206447f;
                if (dynamicBgContainer != null) {
                    Log.m105924i("MicroMsg.DynamicBgContainer.", "release");
                    dynamicBgContainer.f201584d = true;
                    if (dynamicBgContainer.f201585e != null) {
                        Log.m105924i("MicroMsg.DynamicBgContainer.", "removed");
                        dynamicBgContainer.removeView(dynamicBgContainer.f201585e);
                        dynamicBgContainer.f201585e = null;
                    }
                }
            }
            C71323d dVar = conversationListView.f219352j;
            if (dVar != null) {
                C71331l lVar = (C71331l) dVar;
                Log.m105924i("MicroMsg.TaskBarAnimController", "alvinluo DesktopAnimController onDestroy");
                ListView listView = lVar.f206602e;
                if (listView != null) {
                    Runnable runnable2 = lVar.f206623z;
                    if (runnable2 != null) {
                        listView.removeCallbacks(runnable2);
                        lVar.f206623z = null;
                    }
                    Runnable runnable3 = lVar.f206621y;
                    if (runnable3 != null) {
                        lVar.f206602e.removeCallbacks(runnable3);
                        lVar.f206621y = null;
                    }
                    Runnable runnable4 = lVar.f206590W;
                    if (runnable4 != null) {
                        lVar.f206602e.removeCallbacks(runnable4);
                        lVar.f206590W = null;
                    }
                }
                ((C119157j) C119157j.f356862d).mo183894y("AppBrandDesktopPerformanceMonitor");
                C79440e eVar2 = C79440e.INSTANCE;
                synchronized (eVar2.f232984g) {
                    if (eVar2.f232982e) {
                        C34379c<?> cVar = eVar2.f232983f;
                        if (cVar != null) {
                            cVar.cancel(false);
                        }
                        eVar2.f232982e = false;
                    }
                }
                Log.m105924i("MicroMsg.PerformanceMonitor", "alvinluo PerformanceMonitor release");
                HashMap<Integer, C79436b> hashMap = eVar2.f232981d;
                if (hashMap != null) {
                    hashMap.clear();
                }
                lVar.f206565C = false;
            }
            Runnable runnable5 = conversationListView.f219326C;
            if (runnable5 != null) {
                conversationListView.removeCallbacks(runnable5);
            }
            Runnable runnable6 = conversationListView.f219325B;
            if (runnable6 != null) {
                conversationListView.removeCallbacks(runnable6);
            }
            IListener<MultiWindowModeChangedEvent> iListener2 = conversationListView.f219339Q;
            if (iListener2 != null) {
                iListener2.dead();
            }
        }
        C71327g gVar = this.f219477p;
        if (gVar != null) {
            TaskBarViewPresenter taskBarViewPresenter = (TaskBarViewPresenter) gVar;
            Log.m105924i("MicroMsg.TaskBarViewPresenter", "onDestroy");
            taskBarViewPresenter.f206522a = null;
            taskBarViewPresenter.f206541t.dead();
            taskBarViewPresenter.f206539r.dead();
            C30487f0.f82160d = null;
            C30491h.f82166d = null;
            ((C10432i) C86312j.m106911c(C10432i.class)).mo10756rY(taskBarViewPresenter.f206542u);
            C65902r xx02 = ((C65900i) C86312j.m106911c(C65900i.class)).xx0();
            if (xx02 != null) {
                xx02.remove(taskBarViewPresenter.f206540s);
            }
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        ConversationListView conversationListView = this.f219476o;
        if (conversationListView == null || !conversationListView.mo103725k()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f219476o.mo103723i(10, 11, false);
        return true;
    }

    public void onPause() {
        C71323d dVar;
        C71325e eVar;
        TaskBarView taskBarView;
        Log.m105924i("MicroMsg.MainUI", "onPause");
        super.onPause();
        ConversationListView conversationListView = this.f219476o;
        if (conversationListView != null) {
            if (!(!conversationListView.f219349g || (eVar = conversationListView.f219351i) == null || (taskBarView = ((TaskBarContainer) eVar).f206446e) == null)) {
                taskBarView.f206487U1 = true;
                Log.m105925i("MicroMsg.TaskBarView", "alvinluo onPause isHeaderOpen: %b, needProcess: %b", Boolean.valueOf(taskBarView.f206483Q1), Boolean.valueOf(taskBarView.f206489W1));
                if (taskBarView.f206483Q1 && taskBarView.f206489W1) {
                    taskBarView.f206490X1 = true;
                    taskBarView.mo98198G1();
                }
                if (taskBarView.f206492Z1) {
                    taskBarView.f206492Z1 = false;
                    TaskBarContainer taskBarContainer = taskBarView.f206469C1;
                    if (taskBarContainer != null) {
                        int i = taskBarView.f206494b2;
                        C71331l lVar = taskBarContainer.f206445d;
                        if (lVar != null) {
                            lVar.mo98255b(1000, i, false);
                        }
                        taskBarView.f206494b2 = 0;
                    }
                }
                TaskBarViewPresenter taskBarViewPresenter = taskBarView.f206512z1;
                TaskBarViewPresenter.C30482a aVar = taskBarViewPresenter.f206522a;
                if (aVar != null && ((TaskBarView) aVar).f206483Q1) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = taskBarViewPresenter.f206535n;
                    if (currentTimeMillis >= j) {
                        taskBarViewPresenter.f206536o += currentTimeMillis - j;
                    }
                    Log.m105925i("MicroMsg.TaskBarViewPresenter", "onPause lastStartTime:%d,duration:%d,currentTime:%d", Long.valueOf(j), Long.valueOf(taskBarViewPresenter.f206536o), Long.valueOf(currentTimeMillis));
                }
            }
            if (conversationListView.f219349g && (dVar = conversationListView.f219352j) != null) {
                C71331l lVar2 = (C71331l) dVar;
                if (!lVar2.mo98260g()) {
                    lVar2.mo98259f();
                }
            }
        }
    }

    public void onResume() {
        int count;
        C71323d dVar;
        C71323d dVar2;
        C71325e eVar;
        C71325e eVar2;
        TaskBarContainer taskBarContainer;
        TaskBarContainer taskBarContainer2;
        Log.m105924i("MicroMsg.MainUI", "onResume");
        super.onResume();
        ConversationListView conversationListView = this.f219476o;
        if (conversationListView != null) {
            if (conversationListView.f219349g && (eVar2 = conversationListView.f219351i) != null) {
                TaskBarContainer taskBarContainer3 = (TaskBarContainer) eVar2;
                taskBarContainer3.mo98169f();
                TaskBarView taskBarView = taskBarContainer3.f206446e;
                if (taskBarView != null) {
                    Log.m105924i("MicroMsg.TaskBarView", "alvinluo TaskBarView onResume");
                    taskBarView.f206487U1 = false;
                    taskBarView.f206488V1 = false;
                    taskBarView.f206486T1 = false;
                    if (taskBarView.f44722C) {
                        Log.m105926v("MicroMsg.TaskBarView", "alvinluo TaskBarView onResume setLayoutFrozen false");
                        taskBarView.setLayoutFrozen(false);
                    }
                    Log.m105925i("MicroMsg.TaskBarView", "alvinluo onResume isHeaderOpen: %b, needProcessSurfaceWhenResumed: %b, needCloseWhenPaused: %b", Boolean.valueOf(taskBarView.f206483Q1), Boolean.valueOf(taskBarView.f206490X1), Boolean.valueOf(taskBarView.f206491Y1));
                    if (taskBarView.f206483Q1 && taskBarView.f206490X1) {
                        if (C78493o.m94791b() && (taskBarContainer2 = taskBarView.f206469C1) != null) {
                            C71331l lVar = taskBarContainer2.f206445d;
                            if (lVar != null ? lVar.mo98261h() : false) {
                                Log.m105924i("MicroMsg.TaskBarView", "alvinluo switchToDynamicBackgroundView");
                                ((View) taskBarView.f206469C1.getParent()).setBackgroundColor(taskBarView.f206470D1.getResources().getColor(C0966R.color.ahf));
                                DynamicBgContainer backgroundGLSurfaceContainer = taskBarView.f206469C1.getBackgroundGLSurfaceContainer();
                                if (backgroundGLSurfaceContainer != null && taskBarView.f206495c2) {
                                    synchronized (backgroundGLSurfaceContainer) {
                                        Log.m105924i("MicroMsg.DynamicBgContainer.", "resume");
                                        GradientColorBackgroundView gradientBgView = backgroundGLSurfaceContainer.getGradientBgView();
                                        if (gradientBgView != null) {
                                            gradientBgView.setVisibility(0);
                                        }
                                        GradientColorBackgroundView gradientBgView2 = backgroundGLSurfaceContainer.getGradientBgView();
                                        if (gradientBgView2 != null) {
                                            gradientBgView2.setAlpha(1.0f);
                                        }
                                        DynamicBackgroundGLSurfaceView dynamicBackgroundGLSurfaceView = backgroundGLSurfaceContainer.f201585e;
                                        if (dynamicBackgroundGLSurfaceView != null) {
                                            dynamicBackgroundGLSurfaceView.mo93414c();
                                        }
                                        backgroundGLSurfaceContainer.postDelayed(new C77635a(backgroundGLSurfaceContainer), 100);
                                    }
                                    taskBarView.f206495c2 = false;
                                }
                            }
                        }
                        taskBarView.f206489W1 = true;
                        taskBarView.f206490X1 = true;
                    }
                    if (taskBarView.f206491Y1 && (taskBarContainer = taskBarView.f206469C1) != null) {
                        if (taskBarView.f206483Q1) {
                            int i = taskBarView.f206494b2;
                            C71331l lVar2 = taskBarContainer.f206445d;
                            if (lVar2 != null) {
                                lVar2.mo98255b(0, i, true);
                            }
                        }
                        taskBarView.f206494b2 = 0;
                        taskBarView.f206491Y1 = false;
                    }
                    TaskBarViewPresenter taskBarViewPresenter = taskBarView.f206512z1;
                    if (taskBarViewPresenter != null) {
                        taskBarViewPresenter.mo98242l();
                        TaskBarViewPresenter.C30482a aVar = taskBarViewPresenter.f206522a;
                        if (aVar != null && ((TaskBarView) aVar).f206483Q1) {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (currentTimeMillis >= taskBarViewPresenter.f206535n) {
                                taskBarViewPresenter.f206535n = currentTimeMillis;
                            }
                            Log.m105925i("MicroMsg.TaskBarViewPresenter", "onResume lastStartTime:%d,duration:%d,currentTime:%d", Long.valueOf(taskBarViewPresenter.f206535n), Long.valueOf(taskBarViewPresenter.f206536o), Long.valueOf(currentTimeMillis));
                        }
                    }
                    taskBarView.mo98196E1();
                }
            }
            if (conversationListView.f219349g && (dVar2 = conversationListView.f219352j) != null && ((C71331l) dVar2).mo98261h() && (eVar = conversationListView.f219351i) != null && ((RelativeLayout) eVar).getBottom() < C76577a.m92151b(conversationListView.getContext(), 100)) {
                if (C85875k4.m106211z()) {
                    conversationListView.mo103742r(1.0f, conversationListView.getResources().getColor(C0966R.color.f3275lu), conversationListView.getResources().getColor(C0966R.color.f3022ch));
                } else {
                    conversationListView.mo103742r(1.0f, conversationListView.getResources().getColor(C0966R.color.a7_), conversationListView.getResources().getColor(C0966R.color.f3021cg));
                }
            }
            if (conversationListView.f219349g && (dVar = conversationListView.f219352j) != null) {
                C71331l lVar3 = (C71331l) dVar;
                Log.m105925i("MicroMsg.TaskBarAnimController", "alvinluo onResume isVisibleHeader: %b, bottom: %d, height: %d, scrollOffset:%d isCurrentMainUI: %b", Boolean.valueOf(lVar3.mo98261h()), Integer.valueOf(lVar3.f206603f.getBottom()), Integer.valueOf(lVar3.f206603f.getHeight()), Integer.valueOf(lVar3.f206607j), Boolean.valueOf(lVar3.f206592X));
                lVar3.f206583S0 = false;
                if (lVar3.mo98261h() && lVar3.f206603f.getBottom() < lVar3.f206603f.getHeight()) {
                    Log.m105924i("MicroMsg.TaskBarAnimController", "alvinluo onResume fastCloseHeader");
                    lVar3.mo98255b(0, 0, true);
                }
                if (!lVar3.f206575M) {
                    Log.m105924i("MicroMsg.TaskBarAnimController", "alvinluo onResume enableBottomTabSwitch true");
                    lVar3.mo98257d(true);
                } else if (!lVar3.f206592X) {
                    Log.m105924i("MicroMsg.TaskBarAnimController", "alvinluo onResume not main ui and header open, then close header");
                    lVar3.mo98255b(0, 0, true);
                }
            }
            conversationListView.mo103763v();
            conversationListView.mo103744s(true);
        }
        SharedPreferences defaultPreference = MMApplicationContext.getDefaultPreference();
        this.f219473J = defaultPreference;
        if (defaultPreference != null) {
            if (defaultPreference.getBoolean("conversation_box_tip", false)) {
                Log.m105924i("MicroMsg.MainUI", "firstInit ConvBox navigation page");
                C74720p pVar = this.f219483v;
                if (pVar != null && (count = pVar.getCount()) > 0) {
                    int firstVisiblePosition = (this.f219476o.getFirstVisiblePosition() - this.f219476o.getHeaderViewsCount()) + 1;
                    if (firstVisiblePosition < 0) {
                        firstVisiblePosition = 0;
                    }
                    int abs = Math.abs((firstVisiblePosition + 1) % count);
                    while (true) {
                        if (abs == firstVisiblePosition) {
                            abs = 0;
                            break;
                        } else if (C72996z1.m85813P4(((C72976h2) this.f219483v.getItem(abs)).getUsername())) {
                            break;
                        } else {
                            abs = (abs + 1) % count;
                        }
                    }
                    this.f219476o.post(new C74742s0(this, this.f219476o.getHeaderViewsCount() + abs));
                    MMHandlerThread.removeRunnable(this.f219472I);
                    C74743t0 t0Var = new C74743t0(this);
                    this.f219472I = t0Var;
                    MMHandlerThread.postToMainThreadDelayed(t0Var, 1000);
                    this.f219473J.edit().putBoolean("conversation_box_tip", false).apply();
                }
            }
            if (this.f219483v != null) {
                this.f219473J.edit().putInt("heavy_user_session_cnt", this.f219483v.getCount()).commit();
            }
        }
    }

    /* renamed from: r */
    public void mo25918r() {
        Log.m105924i("MicroMsg.MainUI", "turn to fg");
    }

    /* renamed from: t */
    public void mo25922t() {
        Log.m105924i("MicroMsg.MainUI", "turn to bg");
    }
}
