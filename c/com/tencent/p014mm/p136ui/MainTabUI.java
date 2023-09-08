package com.tencent.p014mm.p136ui;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.C112911a0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ChangeTabbarToEvent;
import com.tencent.p014mm.autogen.events.EnableMainBottomTabSwitchEvent;
import com.tencent.p014mm.autogen.events.GetMainTabUnReadCountEvent;
import com.tencent.p014mm.autogen.events.HomeUITabChangeEvent;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.p136ui.AbstractTabChildActivity;
import com.tencent.p014mm.p136ui.C74809q;
import com.tencent.p014mm.p136ui.HomeUI;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.p136ui.base.CustomViewPager;
import com.tencent.p014mm.p136ui.contact.address.BaseAddressUIFragment;
import com.tencent.p014mm.p136ui.contact.address.MvvmAddressUIFragment;
import com.tencent.p014mm.p136ui.conversation.C74720p;
import com.tencent.p014mm.p136ui.conversation.ConversationListView;
import com.tencent.p014mm.p136ui.conversation.MainUI;
import com.tencent.p014mm.p136ui.mogic.WxViewPager;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.C71001c;
import com.tencent.p014mm.plugin.taskbar.p110ui.C71323d;
import com.tencent.p014mm.plugin.taskbar.p110ui.C71331l;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import fx0.C45825h;
import ht1.C60200t1;
import ht1.C60204t3;
import ht1.C76244c4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import l20.C21388a;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import p1029rf.C89940c;
import p327ct.C30914c;
import p626nv.C109759g;
import p761yd.C91440a;
import p761yd.C91441c;
import p773yy.C79168k;
import p787ai.C79547b;
import wc3.C22881c;
import wx2.C78736a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.MainTabUI */
public class MainTabUI {

    /* renamed from: p */
    public static HashMap<String, Integer> f214430p;

    /* renamed from: a */
    public MMFragmentActivity f214431a;

    /* renamed from: b */
    public MainTabUnreadMgr f214432b = new MainTabUnreadMgr();

    /* renamed from: c */
    public LauncherUI.C73066g f214433c;

    /* renamed from: d */
    public boolean f214434d;

    /* renamed from: e */
    public int f214435e;

    /* renamed from: f */
    public int f214436f;

    /* renamed from: g */
    public C73086a f214437g;

    /* renamed from: h */
    public C78736a f214438h;

    /* renamed from: i */
    public Boolean f214439i;

    /* renamed from: j */
    public IListener f214440j;

    /* renamed from: k */
    public boolean f214441k;

    /* renamed from: l */
    public IListener f214442l;

    /* renamed from: m */
    public IListener f214443m;
    private TabsAdapter mTabsAdapter;
    private CustomViewPager mViewPager;

    /* renamed from: n */
    public boolean f214444n;

    /* renamed from: o */
    public HashMap<Integer, MMFragment> f214445o;

    /* renamed from: com.tencent.mm.ui.MainTabUI$TabsAdapter */
    public class TabsAdapter extends C112911a0 implements ViewPager.OnPageChangeListener, C74809q.C45035a {
        private byte _hellAccFlag_;
        private BaseAddressUIFragment addressFragment;
        private int clickCount = 0;
        private boolean isTabClicked = false;
        public boolean[] mFragmentResumedFlags = {true, false, false, false};
        private final WxViewPager mViewPager;

        /* renamed from: com.tencent.mm.ui.MainTabUI$TabsAdapter$a */
        public class C73085a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f214448d;

            public C73085a(int i) {
                this.f214448d = i;
            }

            public void run() {
                MainTabUI mainTabUI = MainTabUI.this;
                mainTabUI.mo101418b(mainTabUI.f214436f, mainTabUI.f214435e);
                MainTabUI.this.mo101419c(this.f214448d);
            }
        }

        public TabsAdapter(FragmentActivity fragmentActivity, WxViewPager wxViewPager) {
            super(fragmentActivity.getSupportFragmentManager());
            this.mViewPager = wxViewPager;
            wxViewPager.setAdapter(this);
            wxViewPager.setOnPageChangeListener(this);
        }

        private void fixAndroidOProgressBarOutScreenFlashProblem(int i, float f, int i2) {
            if (i2 == 0) {
                for (Integer next : MainTabUI.f214430p.values()) {
                    if (next.intValue() != i) {
                        setFragmentLoadingIconVisibility(next.intValue(), 8);
                    } else if (!this.mFragmentResumedFlags[next.intValue()]) {
                        setFragmentLoadingIconVisibility(next.intValue(), 0);
                    }
                }
                return;
            }
            for (Integer next2 : MainTabUI.f214430p.values()) {
                if (next2.intValue() != i && !this.mFragmentResumedFlags[next2.intValue()]) {
                    setFragmentLoadingIconVisibility(next2.intValue(), 0);
                }
            }
        }

        private void reportSwitch(int i) {
            Log.m105927v("MicroMsg.LauncherUI.MainTabUI", "reportSwitch clickCount:%d, pos:%d", Integer.valueOf(this.clickCount), Integer.valueOf(i));
            int i2 = this.clickCount;
            if (i2 > 0) {
                this.clickCount = i2 - 1;
                if (i == 0) {
                    C115669n.INSTANCE.kvStat(10957, "1");
                } else if (i == 1) {
                    C115669n.INSTANCE.kvStat(10957, "2");
                } else if (i == 2) {
                    C115669n.INSTANCE.kvStat(10957, "3");
                } else if (i == 3) {
                    C115669n.INSTANCE.kvStat(10957, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
                }
            } else if (i == 0) {
                C115669n.INSTANCE.kvStat(10957, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY);
            } else if (i == 1) {
                C115669n.INSTANCE.kvStat(10957, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN);
            } else if (i == 2) {
                C115669n.INSTANCE.kvStat(10957, "7");
            }
            this.isTabClicked = false;
        }

        private void setFragmentLoadingIconVisibility(int i, int i2) {
            View findViewById;
            if (MainTabUI.this.mo101424h(i) != null && MainTabUI.this.mo101424h(i).getActivity() != null && (findViewById = MainTabUI.this.mo101424h(i).findViewById(C0966R.C0970id.g3k)) != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i2));
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/MainTabUI$TabsAdapter", "setFragmentLoadingIconVisibility", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/MainTabUI$TabsAdapter", "setFragmentLoadingIconVisibility", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        public int getCount() {
            return 4;
        }

        public Fragment getItem(int i) {
            return MainTabUI.this.mo101424h(i);
        }

        public void onPageScrollStateChanged(int i) {
            BaseAddressUIFragment baseAddressUIFragment;
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/MainTabUI$TabsAdapter", "com/tencent/mm/ui/MainTabUI$TabsAdapterandroidx/viewpager/widget/ViewPager$OnPageChangeListener", "onPageScrollStateChanged", "(I)V", this, array);
            Log.m105919d("MicroMsg.LauncherUI.MainTabUI", "onPageScrollStateChanged state %d", Integer.valueOf(i));
            if (i == 0 && (baseAddressUIFragment = this.addressFragment) != null) {
                baseAddressUIFragment.mo103311U(true);
                this.addressFragment = null;
            }
            C73086a aVar = MainTabUI.this.f214437g;
            if (aVar != null) {
                HomeUI.C730281 r1 = (HomeUI.C730281) aVar;
                HomeUI homeUI = HomeUI.this;
                if (homeUI.f214286o == 0 && i == 1) {
                    homeUI.f214284m = homeUI.f214291t.f214435e;
                } else if (i == 2) {
                    homeUI.f214285n = homeUI.f214291t.f214435e;
                } else if (i == 0) {
                    homeUI.f214284m = 0;
                    homeUI.f214285n = 0;
                }
                homeUI.f214286o = i;
                Log.m105919d("MicroMsg.LauncherUI.HomeUI", "tabSelectedStateChanged:%s begin:%s end:%s", Integer.valueOf(i), Integer.valueOf(HomeUI.this.f214284m), Integer.valueOf(HomeUI.this.f214285n));
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/MainTabUI$TabsAdapter", "com/tencent/mm/ui/MainTabUI$TabsAdapterandroidx/viewpager/widget/ViewPager$OnPageChangeListener", "onPageScrollStateChanged", "(I)V");
        }

        public void onPageScrolled(int i, float f, int i2) {
            int i3 = i;
            C74809q qVar = MainTabUI.this.f214432b.f214453g;
            if (qVar != null) {
                LauncherUIBottomTabView launcherUIBottomTabView = (LauncherUIBottomTabView) qVar;
                int i4 = (int) (255.0f * f);
                int i5 = 255 - i4;
                float f2 = (float) launcherUIBottomTabView.f214379u;
                float f3 = (float) launcherUIBottomTabView.f214376r;
                float f4 = (float) launcherUIBottomTabView.f214380v;
                float f5 = (float) launcherUIBottomTabView.f214377s;
                float f6 = (float) launcherUIBottomTabView.f214381w;
                float f7 = (float) launcherUIBottomTabView.f214378t;
                int i6 = launcherUIBottomTabView.f214375q & -16777216;
                int i7 = (((int) ((f2 * f) + f3)) << 16) + (((int) ((f4 * f) + f5)) << 8) + ((int) ((f6 * f) + f7)) + i6;
                float f8 = 1.0f - f;
                int i8 = (((int) ((f2 * f8) + f3)) << 16) + (((int) ((f4 * f8) + f5)) << 8) + ((int) ((f6 * f8) + f7)) + i6;
                if (i3 == 0) {
                    launcherUIBottomTabView.f214367f.f214388e.setFocusAlpha(i5);
                    launcherUIBottomTabView.f214369h.f214388e.setFocusAlpha(i4);
                    launcherUIBottomTabView.f214367f.f214389f.setTextColor(i8);
                    launcherUIBottomTabView.f214369h.f214389f.setTextColor(i7);
                } else if (i3 == 1) {
                    launcherUIBottomTabView.f214369h.f214388e.setFocusAlpha(i5);
                    launcherUIBottomTabView.f214368g.f214388e.setFocusAlpha(i4);
                    launcherUIBottomTabView.f214369h.f214389f.setTextColor(i8);
                    launcherUIBottomTabView.f214368g.f214389f.setTextColor(i7);
                } else if (i3 == 2) {
                    launcherUIBottomTabView.f214368g.f214388e.setFocusAlpha(i5);
                    launcherUIBottomTabView.f214370i.f214388e.setFocusAlpha(i4);
                    launcherUIBottomTabView.f214368g.f214389f.setTextColor(i8);
                    launcherUIBottomTabView.f214370i.f214389f.setTextColor(i7);
                }
                if (f == 0.0f) {
                    launcherUIBottomTabView.setTo(i3);
                }
            }
            C73086a aVar = MainTabUI.this.f214437g;
            if (aVar != null) {
                HomeUI homeUI = HomeUI.this;
                ActionBar actionBar = homeUI.f214274c;
                if ((!actionBar.mo91106q()) && (actionBar != null)) {
                    homeUI.f214274c.mo91094L();
                }
                homeUI.f214283l = false;
                int i9 = homeUI.f214291t.f214435e;
                Log.m105919d("MicroMsg.LauncherUI.HomeUI", "position=%s positionOffset=%s mCurIndex=%s mTabChangingState=%s", Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i9), Integer.valueOf(homeUI.f214286o));
                if (!(i9 == 3 && i3 == 2)) {
                    if (i9 == 2 && i3 == 2 && f > 0.0f) {
                        ColorDrawable colorDrawable = new ColorDrawable(homeUI.f214288q.getResources().getColor(C0966R.color.ahf));
                        ActionBar actionBar2 = homeUI.f214274c;
                        if (actionBar2 != null) {
                            actionBar2.mo91112w(colorDrawable);
                        }
                        View view = homeUI.f214275d;
                        if (view != null) {
                            view.setBackgroundColor(homeUI.f214288q.getResources().getColor(C0966R.color.ahf));
                        }
                        View j = homeUI.f214274c.mo91099j();
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view2 = j;
                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/HomeUI", "updatingTitle", "(IF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        j.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/ui/HomeUI", "updatingTitle", "(IF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        MenuItem menuItem = homeUI.f214257C;
                        if (menuItem != null) {
                            menuItem.setVisible(false);
                        }
                        MenuItem menuItem2 = homeUI.f214258D;
                        if (menuItem2 != null) {
                            menuItem2.setVisible(false);
                        }
                        TextView textView = homeUI.f214276e;
                        if (textView != null) {
                            textView.setVisibility(8);
                        }
                    } else {
                        if (i9 == 3 && i3 == 3 && f == 0.0f) {
                            homeUI.f214283l = true;
                            homeUI.mo101330u(true);
                        } else {
                            if (i9 == 2 && i3 == 2 && f == 0.0f) {
                                homeUI.f214283l = true;
                                homeUI.mo101330u(true);
                            } else {
                                homeUI.f214283l = true;
                            }
                        }
                    }
                }
            }
            if (0.0f != f) {
                if (this.addressFragment == null) {
                    this.addressFragment = (BaseAddressUIFragment) MainTabUI.this.mo101424h(1);
                }
                this.addressFragment.mo103311U(false);
            } else {
                Log.m105927v("MicroMsg.LauncherUI.MainTabUI", "onPageScrolled, position = %d, mLastIndex = %d", Integer.valueOf(i), Integer.valueOf(MainTabUI.this.f214436f));
                MainTabUI mainTabUI = MainTabUI.this;
                int i15 = mainTabUI.f214436f;
                if (-1 == i15) {
                    mainTabUI.mo101418b(i15, mainTabUI.f214435e);
                    MainTabUI.this.mo101419c(i3);
                } else {
                    MMHandlerThread.postToMainThread(new C73085a(i3));
                }
            }
            fixAndroidOProgressBarOutScreenFlashProblem(i, f, i2);
        }

        public void onPageSelected(int i) {
            boolean z;
            int i2 = i;
            Class cls = C109759g.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/MainTabUI$TabsAdapter", "com/tencent/mm/ui/MainTabUI$TabsAdapterandroidx/viewpager/widget/ViewPager$OnPageChangeListener", "onPageSelected", "(I)V", this, array);
            Log.m105919d("MicroMsg.LauncherUI.MainTabUI", "on page selected changed to %d", Integer.valueOf(i));
            if (!C86709a0.m107523b().mo121114l()) {
                Log.m105925i("MicroMsg.LauncherUI.MainTabUI", "on page position %d selected, but account not initialized.", Integer.valueOf(i));
                C117292a.m165361g(this, "com/tencent/mm/ui/MainTabUI$TabsAdapter", "com/tencent/mm/ui/MainTabUI$TabsAdapterandroidx/viewpager/widget/ViewPager$OnPageChangeListener", "onPageSelected", "(I)V");
                return;
            }
            if (i2 == 2) {
                ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175762a(2);
                ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77239M5("Discovery");
            } else if (i2 == 3) {
                ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175762a(1);
            }
            reportSwitch(i);
            MainTabUI mainTabUI = MainTabUI.this;
            mainTabUI.f214436f = mainTabUI.f214435e;
            mainTabUI.f214435e = i2;
            MainTabUnreadMgr mainTabUnreadMgr = mainTabUI.f214432b;
            C74809q qVar = mainTabUnreadMgr.f214453g;
            if (qVar != null) {
                qVar.setTo(i2);
            }
            C76244c4 c4Var = mainTabUnreadMgr.f214452f;
            if (c4Var != null) {
                c4Var.mo77212d(i2);
            }
            MainTabUI.this.f214431a.supportInvalidateOptionsMenu();
            MainTabUI mainTabUI2 = MainTabUI.this;
            MMFragment h = mainTabUI2.mo101424h(mainTabUI2.f214435e);
            MainTabUI mainTabUI3 = MainTabUI.this;
            if (mainTabUI3.f214436f == 1 && mainTabUI3.f214435e != 1) {
                C97625j3.m125812b().mo105906u().mo119676J(340226, Long.valueOf(System.currentTimeMillis()));
            }
            if (MainTabUI.this.f214435e == 1 && System.currentTimeMillis() - Util.nullAs((Long) C97625j3.m125812b().mo105906u().mo119684e(340226, (Object) null), 0) >= ApkDownloadManager.INTERVAL) {
                ((BaseAddressUIFragment) h).mo103310T();
            }
            if (MainTabUI.this.f214435e == 0) {
                ((MMNotification) C97625j3.m125816f()).mo93212i(true);
            } else {
                ((MMNotification) C97625j3.m125816f()).mo93212i(false);
            }
            if (Build.VERSION.SDK_INT < 24) {
                C71001c.C71003b bVar = C71001c.C71003b.f205479b;
            } else if (C71001c.C71003b.f205480c) {
                C89940c cVar = C71001c.f205476a;
                C71001c.C71003b bVar2 = C71001c.C71003b.f205479b;
                C89940c.C89947g gVar = cVar.f258461t;
                if (gVar != null) {
                    synchronized (gVar) {
                        bVar2.getClass();
                        C89940c.C89946f fVar = gVar.f258487c.get(bVar2);
                        if (fVar != null) {
                            fVar.mo124279b();
                        }
                    }
                }
            }
            if (!(h == null || !C91441c.m114729c() || h.getActivity() == null)) {
                String name = h.getActivity().getClass().getName();
                C91440a aVar = C91440a.INSTANCE;
                aVar.mo125376c(name + "#" + h.getClass().getSimpleName());
            }
            MainTabUI mainTabUI4 = MainTabUI.this;
            C73086a aVar2 = mainTabUI4.f214437g;
            if (aVar2 != null) {
                int i3 = mainTabUI4.f214435e;
                HomeUI.C730281 r4 = (HomeUI.C730281) aVar2;
                Log.m105925i("MicroMsg.LauncherUI.HomeUI", "tabChange %s", Integer.valueOf(i3));
                if (i3 == 3) {
                    HomeUI.this.f214283l = true;
                }
                HomeUI homeUI = HomeUI.this;
                Boolean bool = HomeUI.f214252R;
                homeUI.mo101330u(true);
                HomeUI homeUI2 = HomeUI.this;
                int color = homeUI2.f214288q.getResources().getColor(C0966R.color.a7_);
                int color2 = HomeUI.this.f214288q.getResources().getColor(C0966R.color.f3021cg);
                int color3 = HomeUI.this.f214288q.getResources().getColor(C0966R.color.FG_0);
                homeUI2.mo101311a(1.0f, color, 0);
                homeUI2.mo101313c(1.0f, color2, color3);
                MMFragment h2 = HomeUI.this.f214291t.mo101424h(0);
                if (h2 instanceof MainUI) {
                    boolean z2 = i3 == 0;
                    ConversationListView conversationListView = ((MainUI) h2).f219476o;
                    if (conversationListView != null) {
                        conversationListView.setIsCurrentMainUI(z2);
                    }
                    if (z2) {
                        C22881c cVar2 = C22881c.f65777a;
                        if (cVar2.mo36060e()) {
                            if (!cVar2.mo36061f()) {
                                z = false;
                            } else {
                                z = cVar2.mo36059d().getBoolean("biz_time_preload_at_chat_list", false);
                                Log.m105919d("MicroMsg.BizImagePreloadStrategy", "ImageStrategy chatListPreloadEnable %b", Boolean.valueOf(z));
                            }
                            if (z) {
                                cVar2.mo36064i();
                            }
                        }
                    }
                    if (z2) {
                        C45825h.f123727a.mo71296i(2, "", "");
                    }
                }
            }
            HomeUITabChangeEvent homeUITabChangeEvent = new HomeUITabChangeEvent();
            homeUITabChangeEvent.f78831d.f78832a = MainTabUI.this.f214435e;
            homeUITabChangeEvent.publish();
            if (!(!C85875k4.m106197n0() || !C85875k4.m106154K(MainTabUI.this.f214431a.getTaskId()) || C85811a5.m106024a(C85811a5.f249921a, MainTabUI.this.f214431a.getTaskId()) == 1 || C85865h1.m106131a(C85865h1.f250081a, MainTabUI.this.f214431a.getTaskId()) == 1 || C85930s4.m106241a(MainTabUI.this.f214431a.getTaskId()) == 1 || C85985z2.m106329a(MainTabUI.this.f214431a.getTaskId()) == 1)) {
                MainTabUI mainTabUI5 = MainTabUI.this;
                if (mainTabUI5.f214435e != 0 || !mainTabUI5.f214439i.booleanValue()) {
                    Intent intent = new Intent(MainTabUI.this.f214431a, EmptyActivity.class);
                    intent.addFlags(67108864);
                    MMFragmentActivity mMFragmentActivity = MainTabUI.this.f214431a;
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(intent);
                    MMFragmentActivity mMFragmentActivity2 = mMFragmentActivity;
                    C117292a.m165358d(mMFragmentActivity2, aVar3.mo10232b(), "com/tencent/mm/ui/MainTabUI$TabsAdapter", "onPageSelected", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mMFragmentActivity.startActivity((Intent) aVar3.mo10231a(0));
                    C117292a.m165359e(mMFragmentActivity2, "com/tencent/mm/ui/MainTabUI$TabsAdapter", "onPageSelected", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    Log.m105924i("MicroMsg.LauncherUI.MainTabUI", "start empty activity");
                } else {
                    C117292a.m165361g(this, "com/tencent/mm/ui/MainTabUI$TabsAdapter", "com/tencent/mm/ui/MainTabUI$TabsAdapterandroidx/viewpager/widget/ViewPager$OnPageChangeListener", "onPageSelected", "(I)V");
                    return;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/MainTabUI$TabsAdapter", "com/tencent/mm/ui/MainTabUI$TabsAdapterandroidx/viewpager/widget/ViewPager$OnPageChangeListener", "onPageSelected", "(I)V");
        }

        public void onTabClick(int i) {
            MainTabUnreadMgr mainTabUnreadMgr;
            C76244c4 c4Var;
            Class cls = C30914c.class;
            MainTabUI mainTabUI = MainTabUI.this;
            if (!mainTabUI.f214441k) {
                Log.m105924i("MicroMsg.LauncherUI.MainTabUI", "alvinluo now cannot change tab");
            } else if (i == mainTabUI.f214435e) {
                Log.m105918d("MicroMsg.LauncherUI.MainTabUI", "on click same index");
                MMFragment h = MainTabUI.this.mo101424h(i);
                if (h instanceof AbstractTabChildActivity.AbStractTabFragment) {
                    ((AbstractTabChildActivity.AbStractTabFragment) h).mo101241Q();
                }
            } else {
                this.isTabClicked = true;
                int i2 = this.clickCount + 1;
                this.clickCount = i2;
                Log.m105927v("MicroMsg.LauncherUI.MainTabUI", "onTabClick count:%d", Integer.valueOf(i2));
                this.mViewPager.setCurrentItem(i, false);
                if (i == 3) {
                    ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33499h(262145, 266241);
                    ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33499h(262156, 266241);
                    ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33499h(262147, 266241);
                    ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33499h(262149, 266241);
                    ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33499h(262152, 266241);
                    ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33500i(C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, 266241);
                    ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33501j(C72994y1.C72995a.USERINFO_WALLET_New_MY_ENTRY_TAB_REDDOT_STRING_SYNC, C72994y1.C72995a.USERINFO_NEW_BANDAGE_WATCHER_ME_TAB_STRING_SYNC);
                    boolean l = ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33503l(352280);
                    if (l) {
                        ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33507p(352280, false);
                    }
                    C115669n.INSTANCE.mo160131h(14872, 6, Integer.valueOf(((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33494b(262156, 266241) ? 1 : 0), "", "", 0);
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_MY_ENTRY_TAB_REDDOT_BOOLEAN_SYNC, Boolean.FALSE);
                    ((C79168k) C86312j.m106911c(C79168k.class)).mo74111Ij(l ? 7 : 8, "");
                } else if (i == 2 && (mainTabUnreadMgr = MainTabUI.this.f214432b) != null && (c4Var = mainTabUnreadMgr.f214452f) != null) {
                    c4Var.mo77215g();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.MainTabUI$a */
    public interface C73086a {
    }

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        f214430p = hashMap;
        hashMap.put("tab_main", 0);
        f214430p.put("tab_address", 1);
        f214430p.put("tab_find_friend", 2);
        f214430p.put("tab_settings", 3);
    }

    public MainTabUI() {
        new HashSet();
        this.f214435e = -1;
        this.f214436f = -1;
        this.f214439i = Boolean.FALSE;
        C40008f fVar = C40008f.f107254d;
        this.f214440j = new IListener<ChangeTabbarToEvent>(fVar) {
            {
                this.__eventId = 277569697;
            }

            public boolean callback(IEvent iEvent) {
                int i = ((ChangeTabbarToEvent) iEvent).f107395d.f107396a;
                if (i < 0 || i > 3) {
                    return false;
                }
                if (i == 0) {
                    MainTabUI.this.mo101428l("tab_main");
                    return false;
                } else if (i == 1) {
                    MainTabUI.this.mo101428l("tab_address");
                    return false;
                } else if (i == 2) {
                    MainTabUI.this.mo101428l("tab_find_friend");
                    return false;
                } else if (i != 3) {
                    return false;
                } else {
                    MainTabUI.this.mo101428l("tab_settings");
                    return false;
                }
            }
        };
        this.f214441k = true;
        this.f214442l = new IListener<EnableMainBottomTabSwitchEvent>(fVar) {
            {
                this.__eventId = -1510309336;
            }

            public boolean callback(IEvent iEvent) {
                EnableMainBottomTabSwitchEvent enableMainBottomTabSwitchEvent = (EnableMainBottomTabSwitchEvent) iEvent;
                Log.m105925i("MicroMsg.LauncherUI.MainTabUI", "alvinluo EnableMainBottomTabSwitchEvent enable: %b", Boolean.valueOf(enableMainBottomTabSwitchEvent.f193551d.f193552a));
                MainTabUI mainTabUI = MainTabUI.this;
                boolean z = enableMainBottomTabSwitchEvent.f193551d.f193552a;
                mainTabUI.f214441k = z;
                mainTabUI.mo101426j(z);
                return true;
            }
        };
        this.f214443m = new IListener<GetMainTabUnReadCountEvent>(fVar) {
            {
                this.__eventId = 1812910384;
            }

            public boolean callback(IEvent iEvent) {
                GetMainTabUnReadCountEvent getMainTabUnReadCountEvent = (GetMainTabUnReadCountEvent) iEvent;
                getMainTabUnReadCountEvent.f193652d.f193653a = MainTabUI.this.mo101425i();
                Log.m105919d("MicroMsg.LauncherUI.MainTabUI", "alvinluo getTitleUnReadCount: %d", Integer.valueOf(getMainTabUnReadCountEvent.f193652d.f193653a));
                return true;
            }
        };
        this.f214444n = false;
        this.f214445o = new HashMap<>();
    }

    /* renamed from: a */
    public void mo101417a(int i) {
        MainUI mainUI;
        ConversationListView conversationListView;
        C71323d dVar;
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(this.f214435e);
        objArr[2] = Boolean.valueOf(this.mViewPager != null);
        objArr[3] = Integer.valueOf(this.f214445o.size());
        Log.m105925i("MicroMsg.LauncherUI.MainTabUI", "change tab to %d, cur tab %d, has init tab %B, tab cache size %d", objArr);
        if (this.mViewPager != null && i >= 0) {
            TabsAdapter tabsAdapter = this.mTabsAdapter;
            if (tabsAdapter != null && i > tabsAdapter.getCount() - 1) {
                return;
            }
            if (this.f214435e != i || this.f214445o.size() == 0) {
                int i2 = this.f214435e;
                this.f214435e = i;
                MainTabUnreadMgr mainTabUnreadMgr = this.f214432b;
                C74809q qVar = mainTabUnreadMgr.f214453g;
                if (qVar != null) {
                    qVar.setTo(i);
                }
                C76244c4 c4Var = mainTabUnreadMgr.f214452f;
                if (c4Var != null) {
                    c4Var.mo77212d(i);
                }
                CustomViewPager customViewPager = this.mViewPager;
                if (customViewPager != null) {
                    if (i2 == -1) {
                        customViewPager.setCurrentItemNotify(this.f214435e, false);
                    } else {
                        customViewPager.setCurrentItem(this.f214435e, false);
                    }
                    mo101419c(this.f214435e);
                }
                if (this.f214435e != 0 || !C91440a.INSTANCE.mo125375b()) {
                    ((MMNotification) C97625j3.m125816f()).mo93212i(false);
                } else {
                    ((MMNotification) C97625j3.m125816f()).mo93212i(true);
                }
                if (this.f214435e != 0) {
                    MMFragment h = mo101424h(0);
                    if ((h instanceof MainUI) && (conversationListView = mainUI.f219476o) != null && conversationListView.mo103725k()) {
                        ConversationListView conversationListView2 = (mainUI = (MainUI) h).f219476o;
                        if (conversationListView2.f219349g && (dVar = conversationListView2.f219352j) != null) {
                            ((C71331l) dVar).mo98255b(0, 0, true);
                        }
                        conversationListView2.mo103728n();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo101418b(int i, int i2) {
        if (i != i2) {
            MMFragment h = mo101424h(i);
            if (h != null && (h instanceof C74940w0)) {
                ((C74940w0) h).mo25903g();
            }
            MMFragment h2 = mo101424h(i2);
            if (h2 != null && (h2 instanceof C74940w0)) {
                ((C74940w0) h2).mo25899d();
            }
            C74931u0.m89763a(this.f214431a, 4, i, "deliverOnTabChange");
            C74931u0.m89763a(this.f214431a, 3, i2, "deliverOnTabChange");
        }
    }

    /* renamed from: c */
    public void mo101419c(int i) {
        Log.m105925i("MicroMsg.LauncherUI.MainTabUI", "deliverOnTabResume %s", Integer.valueOf(i));
        MMFragment h = mo101424h(i);
        if (h != null) {
            if (h instanceof C74940w0) {
                ((C74940w0) h).mo101242l();
                this.f214433c.getClass();
            }
            this.mTabsAdapter.mFragmentResumedFlags[i] = true;
        }
    }

    /* renamed from: d */
    public void mo101420d() {
        C74809q qVar;
        Log.m105924i("MicroMsg.LauncherUI.MainTabUI", "doOnCreate");
        CustomViewPager customViewPager = (CustomViewPager) this.f214431a.findViewById(C0966R.C0970id.hqu);
        this.mViewPager = customViewPager;
        customViewPager.setOffscreenPageLimit(4);
        mo101426j(true);
        this.mViewPager.setCanSlideBySide(false);
        this.mTabsAdapter = new TabsAdapter(this.f214431a, this.mViewPager);
        if (LauncherUI.getInstance() != null) {
            mo101417a(LauncherUI.getInstance().f214350z);
        } else {
            mo101417a(0);
        }
        MainTabUnreadMgr mainTabUnreadMgr = this.f214432b;
        ViewGroup viewGroup = (ViewGroup) this.mViewPager.getParent();
        TabsAdapter tabsAdapter = this.mTabsAdapter;
        C74809q qVar2 = mainTabUnreadMgr.f214453g;
        if (qVar2 != null) {
            qVar2.setOnTabClickListener((C74809q.C45035a) null);
            View view = (View) mainTabUnreadMgr.f214453g;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/MainTabUnreadMgr", "resetNavBarPos", "(Landroid/view/ViewGroup;Lcom/tencent/mm/ui/BaseLauncherUITabView$IOnTabClick;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/MainTabUnreadMgr", "resetNavBarPos", "(Landroid/view/ViewGroup;Lcom/tencent/mm/ui/BaseLauncherUITabView$IOnTabClick;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (viewGroup != null) {
                viewGroup.removeView((View) mainTabUnreadMgr.f214453g);
            }
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        LauncherUIBottomTabView launcherUIBottomTabView = new LauncherUIBottomTabView(mainTabUnreadMgr.f214450d);
        launcherUIBottomTabView.setId(C0966R.C0970id.f358508fj3);
        if (viewGroup != null) {
            layoutParams.gravity = 80;
            viewGroup.addView(launcherUIBottomTabView, layoutParams);
        }
        mainTabUnreadMgr.f214453g = launcherUIBottomTabView;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        LauncherUIBottomTabView launcherUIBottomTabView2 = launcherUIBottomTabView;
        C117292a.m165358d(launcherUIBottomTabView2, aVar2.mo10232b(), "com/tencent/mm/ui/MainTabUnreadMgr", "resetNavBarPos", "(Landroid/view/ViewGroup;Lcom/tencent/mm/ui/BaseLauncherUITabView$IOnTabClick;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        launcherUIBottomTabView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(launcherUIBottomTabView2, "com/tencent/mm/ui/MainTabUnreadMgr", "resetNavBarPos", "(Landroid/view/ViewGroup;Lcom/tencent/mm/ui/BaseLauncherUITabView$IOnTabClick;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mainTabUnreadMgr.f214453g.setOnTabClickListener(tabsAdapter);
        if (!(qVar2 == null || qVar2 == (qVar = mainTabUnreadMgr.f214453g))) {
            ((LauncherUIBottomTabView) qVar).mo101397f(qVar2.getShowFriendPoint());
            ((LauncherUIBottomTabView) mainTabUnreadMgr.f214453g).mo69852a(qVar2.getSettingsPoint());
            ((LauncherUIBottomTabView) mainTabUnreadMgr.f214453g).mo101402j(qVar2.getMainTabUnread());
            ((LauncherUIBottomTabView) mainTabUnreadMgr.f214453g).mo101400h(qVar2.getContactTabUnread());
            ((LauncherUIBottomTabView) mainTabUnreadMgr.f214453g).mo101401i(qVar2.getFriendTabUnread());
            ((LauncherUIBottomTabView) mainTabUnreadMgr.f214453g).mo101403k(qVar2.getSettingsTabUnread());
            mainTabUnreadMgr.f214453g.setTo(qVar2.getCurIdx());
        }
        C76244c4 c4Var = mainTabUnreadMgr.f214452f;
        if (c4Var != null) {
            c4Var.mo77216h(mainTabUnreadMgr.f214450d);
            mainTabUnreadMgr.f214452f.mo77210b(mainTabUnreadMgr.f214463t);
            C74809q qVar3 = mainTabUnreadMgr.f214453g;
            if (qVar3 instanceof LauncherUIBottomTabView) {
                TextView friendUnreadCountView = ((LauncherUIBottomTabView) qVar3).getFriendUnreadCountView();
                if (friendUnreadCountView != null) {
                    mainTabUnreadMgr.f214452f.mo77211c(friendUnreadCountView);
                } else {
                    Log.m105928w("MicroMsg.LauncherUI.MainTabUnreadMgr", "registerFinderRedDotObserve unReadView is null!");
                }
                ImageView imageView = ((LauncherUIBottomTabView) mainTabUnreadMgr.f214453g).f214368g.f214391h;
                if (imageView != null) {
                    mainTabUnreadMgr.f214452f.mo77214f(imageView);
                } else {
                    Log.m105928w("MicroMsg.LauncherUI.MainTabUnreadMgr", "registerFinderRedDotObserve unReadView is null!");
                }
            }
        }
    }

    /* renamed from: e */
    public void mo101421e() {
        this.f214440j.dead();
        this.f214442l.dead();
        this.f214443m.dead();
        this.f214445o.clear();
        CustomViewPager customViewPager = this.mViewPager;
        if (customViewPager != null) {
            customViewPager.setCanSlide(false);
            this.mViewPager.setCanSlideBySide(false);
        }
    }

    /* renamed from: f */
    public void mo101422f(boolean z) {
        C60204t3 t3Var;
        MainUI mainUI;
        Log.m105925i("MicroMsg.LauncherUI.MainTabUI", "onResume start :%d, chattingShow:%s", Integer.valueOf(this.f214435e), Boolean.valueOf(z));
        if (this.f214445o.size() != 0) {
            MMFragment h = mo101424h(this.f214435e);
            Log.m105925i("MicroMsg.LauncherUI.MainTabUI", "notifyCurrentTabResumeUI, mCurIndex:%s", Integer.valueOf(this.f214435e));
            if (h != null) {
                ((C74940w0) h).mo25873D();
            }
            if (!(h == null || !C91441c.m114729c() || h.getActivity() == null)) {
                String name = h.getActivity().getClass().getName();
                C91440a aVar = C91440a.INSTANCE;
                aVar.mo125376c(name + "#" + h.getClass().getSimpleName());
            }
        }
        if (this.f214434d && this.f214431a.getIntent().hasExtra("isScrollFirst") && this.f214431a.getIntent().hasExtra("isShowHeader") && (mainUI = (MainUI) this.f214445o.get(0)) != null) {
            mainUI.mo103819U(this.f214431a.getIntent().getBooleanExtra("isShowHeader", false), this.f214431a.getIntent().getBooleanExtra("isShowHeaderWithAnim", false), this.f214431a.getIntent().getBooleanExtra("isScrollFirst", true));
        }
        if (this.f214434d) {
            this.f214434d = false;
            mo101428l("tab_main");
        }
        MainUI mainUI2 = (MainUI) this.f214445o.get(0);
        if (mainUI2 != null) {
            C74720p pVar = mainUI2.f219483v;
            if (pVar != null) {
                pVar.mo103888O();
            }
            mainUI2.mo103817S();
        }
        if (this.f214435e != 0 || z) {
            ((MMNotification) C97625j3.m125816f()).mo93212i(false);
        } else {
            ((MMNotification) C97625j3.m125816f()).mo93212i(true);
        }
        C74940w0 w0Var = (C74940w0) mo101424h(this.f214435e);
        if (w0Var != null) {
            w0Var.mo101234E();
        }
        this.f214434d = false;
        int intExtra = IntentUtil.getIntExtra(this.f214431a.getIntent(), "preferred_tab", 0);
        Log.m105919d("MicroMsg.LauncherUI.MainTabUI", "doOnResume, tabIdx = %d", Integer.valueOf(intExtra));
        if (intExtra != 0) {
            mo101417a(intExtra);
            this.f214431a.getIntent().putExtra("preferred_tab", 0);
        }
        this.f214440j.alive();
        this.f214442l.alive();
        this.f214443m.alive();
        MainTabUnreadMgr mainTabUnreadMgr = this.f214432b;
        C74809q qVar = mainTabUnreadMgr.f214453g;
        if (C97625j3.m125811a()) {
            C97625j3.m125812b().mo105906u().add(mainTabUnreadMgr.f214461r);
            ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33493a(mainTabUnreadMgr.f214460q);
            C97625j3.m125812b().mo105908w().add(mainTabUnreadMgr);
            mainTabUnreadMgr.f214457n.alive();
            mainTabUnreadMgr.f214462s.alive();
            mainTabUnreadMgr.f214458o.alive();
        }
        C76244c4 c4Var = mainTabUnreadMgr.f214452f;
        if (c4Var != null) {
            c4Var.onResume();
        }
        C79547b.f233255g.mo109607a(new C57846q2(mainTabUnreadMgr));
        if (!this.f214444n && (t3Var = (C60204t3) C86312j.m106911c(C60204t3.class)) != null) {
            t3Var.mo78754kf(this.f214431a, 1);
        }
        this.f214444n = false;
    }

    /* renamed from: g */
    public MMFragment mo101423g() {
        return this.f214445o.get(Integer.valueOf(this.f214435e));
    }

    /* renamed from: h */
    public MMFragment mo101424h(int i) {
        MMFragment mMFragment = null;
        if (i < 0) {
            return null;
        }
        if (this.f214445o.containsKey(Integer.valueOf(i))) {
            return this.f214445o.get(Integer.valueOf(i));
        }
        Log.m105925i("MicroMsg.LauncherUI.MainTabUI", "create tab %d", Integer.valueOf(i));
        Class cls = C61212e.class;
        Bundle bundle = new Bundle();
        if (i == 0) {
            bundle.putInt(MainUI.class.getName(), 0);
            mMFragment = (MMFragment) Fragment.instantiate(this.f214431a, MainUI.class.getName(), bundle);
            if (mMFragment instanceof MainUI) {
                MainUI mainUI = (MainUI) mMFragment;
                MMFragmentActivity mMFragmentActivity = this.f214431a;
                mainUI.f219475n = mMFragmentActivity;
                ConversationListView conversationListView = mainUI.f219476o;
                if (conversationListView != null) {
                    conversationListView.setActivity(mMFragmentActivity);
                }
                C78736a aVar = this.f214438h;
                mainUI.f219466C = aVar;
                ConversationListView conversationListView2 = mainUI.f219476o;
                if (conversationListView2 != null) {
                    conversationListView2.setActionBarUpdateCallback(aVar);
                }
            }
            ((MMNotification) C97625j3.m125816f()).mo93212i(true);
            ((C61212e) C86312j.m106911c(cls)).mo86178qr(mMFragment, C11345b.MainUI).mo86179qs(mMFragment, C76986a.Main);
        } else if (i == 1) {
            mMFragment = (MMFragment) Fragment.instantiate(this.f214431a, MvvmAddressUIFragment.class.getName(), bundle);
            ((C61212e) C86312j.m106911c(cls)).mo86178qr(mMFragment, C11345b.MvvmAddressUIFragment).mo86179qs(mMFragment, C76986a.Contacts);
        } else if (i == 2) {
            bundle.putInt(FindMoreFriendsUI.class.getName(), 2);
            mMFragment = (MMFragment) Fragment.instantiate(this.f214431a, FindMoreFriendsUI.class.getName(), bundle);
            ((C61212e) C86312j.m106911c(cls)).mo86178qr(mMFragment, C11345b.FindMoreFriendsUI).mo86179qs(mMFragment, C76986a.Discover);
        } else if (i == 3) {
            bundle.putInt(MoreTabUI.class.getName(), 3);
            mMFragment = (MMFragment) Fragment.instantiate(this.f214431a, MoreTabUI.class.getName(), bundle);
            ((C61212e) C86312j.m106911c(cls)).mo86178qr(mMFragment, C11345b.MoreTabUI).mo86179qs(mMFragment, C76986a.More);
        }
        Log.m105925i("MicroMsg.LauncherUI.MainTabUI", "createFragment index:%d", Integer.valueOf(i));
        if (mMFragment != null) {
            mMFragment.setParent(this.f214431a);
        }
        this.f214445o.put(Integer.valueOf(i), mMFragment);
        return mMFragment;
    }

    /* renamed from: i */
    public int mo101425i() {
        MainTabUnreadMgr mainTabUnreadMgr = this.f214432b;
        C74809q qVar = mainTabUnreadMgr.f214453g;
        if (qVar == null || qVar.getMainTabUnread() <= 0) {
            return 0;
        }
        return mainTabUnreadMgr.f214453g.getMainTabUnread();
    }

    /* renamed from: j */
    public final void mo101426j(boolean z) {
        this.mViewPager.setCanSlide(z);
    }

    /* renamed from: k */
    public void mo101427k() {
        MainTabUnreadMgr mainTabUnreadMgr = this.f214432b;
        mainTabUnreadMgr.getClass();
        ((C119157j) C119157j.f356862d).mo183885p(new C74800n2(mainTabUnreadMgr), "setConversationTagUnread");
    }

    /* renamed from: l */
    public void mo101428l(String str) {
        if (str != null && !str.equals("")) {
            mo101417a(f214430p.get(str).intValue());
        }
    }
}
