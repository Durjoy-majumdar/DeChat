package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.ArrayMap;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck3.C67391b;
import ck3.C67398g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ChattingUIExitBeginEvent;
import com.tencent.p014mm.autogen.events.ChattingUIExitBeginForPayEvent;
import com.tencent.p014mm.autogen.events.ExitTrackRoomEvent;
import com.tencent.p014mm.autogen.events.MusicCheckErrorEvent;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.chatting.BasePrivateMsgConvListFragment;
import com.tencent.p014mm.p136ui.C116183y1;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.p136ui.chatting.C74346y1;
import com.tencent.p014mm.p136ui.chatting.view.MMChattingListView;
import com.tencent.p014mm.p136ui.conversation.BaseConversationUI;
import com.tencent.p014mm.p136ui.conversation.OpenImKefuServiceChattingUI;
import com.tencent.p014mm.p136ui.tools.C74845h1;
import com.tencent.p014mm.p136ui.widget.pulldown.NestedBounceView;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72917n0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72924q1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.ScreenShotUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.vendor.OnePlus;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75594u0;
import eb0.C97625j3;
import ed0.C75610d;
import ex0.C45696d;
import f40.C86709a0;
import fn3.C75778d;
import gy3.C87412m;
import hk3.C76218a;
import hk3.C76221b;
import hk3.C76224c;
import hk3.C76227e;
import hk3.C76231f;
import ht1.C60200t1;
import ht1.C60204t3;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import jm2.C117361f;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import l31.C61212e;
import nj3.C76901s0;
import nj3.C76912y0;
import o31.C11345b;
import o31.C76986a;
import p172io.flutter.embedding.android.PatchedFlutterActivity;
import p185kq.C76623j;
import p185kq.C76624k;
import p206nj.C76866m;
import p447aw.C103918d;
import p565ir.C60606n;
import p739wi.C78597c;
import q31.C118148a;
import q91.C101077d;
import qo3.C89779i0;
import t22.C118355y;
import t22.C77832s;
import uj3.C78180a;
import uj3.C78190b;
import vo3.C78461f;
import wk3.C78606a;
import wk3.C78610b;
import wk3.C78611c;
import wk3.C78612d;
import wk3.C78616e;
import wk3.C78618f;
import wk3.C78619g;
import wk3.C78622h;
import zj3.C79343c0;
import zj3.C79344c1;
import zj3.C79348e;
import zj3.C79349e0;
import zj3.C79361h0;
import zj3.C79363i;
import zj3.C79365j;
import zj3.C79366k;
import zj3.C79368l;
import zj3.C79369m;
import zj3.C79375p;
import zj3.C79376p0;
import zj3.C79377q;
import zj3.C79382t;
import zj3.C79384u0;
import zj3.C79387w;
import zj3.C79389x;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.ChattingUIFragment */
public class ChattingUIFragment extends BaseChattingUIFragment {

    /* renamed from: Q */
    public static String f215287Q;

    /* renamed from: A */
    public C74845h1 f215288A;

    /* renamed from: B */
    public MMChattingListView f215289B;

    /* renamed from: C */
    public boolean f215290C = true;

    /* renamed from: D */
    public boolean f215291D = true;

    /* renamed from: E */
    public int f215292E = 0;

    /* renamed from: F */
    public boolean f215293F = false;

    /* renamed from: G */
    public boolean f215294G = false;

    /* renamed from: H */
    public int f215295H = 0;

    /* renamed from: I */
    public C78606a f215296I;

    /* renamed from: J */
    public RecyclerView.C0130p f215297J = new C73275e();

    /* renamed from: K */
    public View.OnLayoutChangeListener f215298K = new C73276f();

    /* renamed from: L */
    public C76624k f215299L;

    /* renamed from: M */
    public final C101077d f215300M = new C73278h();

    /* renamed from: N */
    public IListener f215301N;

    /* renamed from: P */
    public IListener f215302P;

    /* renamed from: u */
    public C79368l f215303u;

    /* renamed from: v */
    public C72917n0 f215304v;

    /* renamed from: w */
    public C89779i0 f215305w = null;

    /* renamed from: x */
    public View f215306x;

    /* renamed from: y */
    public ScreenShotUtil.ScreenShotCallback f215307y = null;

    /* renamed from: z */
    public Runnable f215308z;

    /* renamed from: com.tencent.mm.ui.chatting.ChattingUIFragment$a */
    public class C73271a extends C67398g {
        public C73271a() {
        }

        /* renamed from: a */
        public void mo91597a() {
            Log.m105925i("MicroMsg.ChattingUIFragment", "[finish] isCurrentActivity:%s", Boolean.valueOf(ChattingUIFragment.this.isCurrentActivity));
            ChattingUIFragment chattingUIFragment = ChattingUIFragment.this;
            if (chattingUIFragment.isCurrentActivity) {
                ChattingUIFragment.super.finish();
            } else if (chattingUIFragment.thisActivity() instanceof LauncherUI) {
                LauncherUI launcherUI = (LauncherUI) ChattingUIFragment.this.thisActivity();
                if (launcherUI != null) {
                    launcherUI.closeChatting(true ^ ChattingUIFragment.this.isSupportNavigationSwipeBack());
                } else {
                    Log.m105920e("MicroMsg.ChattingUIFragment", "LauncherUI is null!???");
                }
            } else if (ChattingUIFragment.this.thisActivity() instanceof BaseConversationUI) {
                BaseConversationUI baseConversationUI = (BaseConversationUI) ChattingUIFragment.this.thisActivity();
                if (baseConversationUI != null) {
                    baseConversationUI.closeChatting(true ^ ChattingUIFragment.this.isSupportNavigationSwipeBack());
                }
            } else if (ChattingUIFragment.this.thisActivity() instanceof C78597c.C78600d) {
                ((C78597c.C78600d) ChattingUIFragment.this.thisActivity()).mo94876l7();
            } else if (ChattingUIFragment.this.thisActivity().getSupportFragmentManager().getFragments().size() > 0) {
                List<Fragment> fragments = ChattingUIFragment.this.thisActivity().getSupportFragmentManager().getFragments();
                for (int i = 0; i < fragments.size(); i++) {
                    Fragment fragment = fragments.get(i);
                    if (fragment instanceof BasePrivateMsgConvListFragment) {
                        ((BasePrivateMsgConvListFragment) fragment).f108298t.mo94876l7();
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingUIFragment$b */
    public class C73272b implements View.OnTouchListener {

        /* renamed from: d */
        public boolean f215310d = false;

        public C73272b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ChattingUIFragment.this.f215293F = true;
            if (motionEvent.getAction() == 0) {
                Log.m105924i("MicroMsg.ChattingUIFragment", "onTouch: touch down");
                this.f215310d = true;
            } else if (motionEvent.getAction() == 1) {
                Log.m105924i("MicroMsg.ChattingUIFragment", "onTouch: touch up");
                this.f215310d = false;
            }
            if (this.f215310d) {
                ChattingUIFragment chattingUIFragment = ChattingUIFragment.this;
                if (chattingUIFragment.f215291D) {
                    C79387w wVar = (C79387w) chattingUIFragment.f215220f.f193278b.mo102812a(C79387w.class);
                    if (!(wVar == null || wVar.mo102193k1() == null)) {
                        wVar.mo102193k1().mo100339A(0, true);
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingUIFragment$c */
    public class C73273c implements AbsListView.OnScrollListener {

        /* renamed from: d */
        public boolean f215312d = false;

        public C73273c() {
        }

        /* renamed from: a */
        public void mo102100a() {
            Object tag = ChattingUIFragment.this.f215304v.mo81289D().getTag(C0966R.C0970id.mcf);
            if (tag == null ? true : ((Boolean) tag).booleanValue()) {
                View childAt = ChattingUIFragment.this.f215304v.getChildAt(0);
                if (childAt != null) {
                    int paddingTop = ChattingUIFragment.this.f215304v.getPaddingTop();
                    if (childAt.getTop() == paddingTop) {
                        Log.m105924i("MicroMsg.ChattingUIFragment", "[onScrollStateChanged] auto load top more!");
                        ChattingUIFragment.this.f215289B.mo101743e(true, ChattingUIFragment.this.getBounceView() != null && ChattingUIFragment.this.getBounceView().getOffset() != 0 ? 0 : 200);
                    } else if (childAt.getTop() < paddingTop) {
                        Log.m105928w("MicroMsg.ChattingUIFragment", "[onScrollStateChanged] exception auto load top more wit reset adapter!");
                        ChattingUIFragment chattingUIFragment = ChattingUIFragment.this;
                        chattingUIFragment.f215289B.setAdapter(chattingUIFragment.f215303u);
                    }
                }
                this.f215312d = false;
            }
        }

        public synchronized void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingUIFragment$13", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            ChattingUIFragment.this.f215220f.f193280d.mo26189W5(absListView, i, i2, i3);
            ChattingUIFragment chattingUIFragment = ChattingUIFragment.this;
            if (chattingUIFragment.f215292E == 0 && this.f215312d && chattingUIFragment.f215304v.getFirstVisiblePosition() == 0) {
                mo102100a();
            }
            ChattingUIFragment chattingUIFragment2 = ChattingUIFragment.this;
            if (chattingUIFragment2.f215294G) {
                if (chattingUIFragment2.f215304v.getLastVisiblePosition() != i3 - 1) {
                    C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingUIFragment$13", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
                    return;
                }
                ChattingUIFragment.this.f215294G = false;
            }
            C76624k kVar = ChattingUIFragment.this.f215299L;
            if (kVar != null) {
                kVar.mo106875a(absListView, i, i2);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingUIFragment$13", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingUIFragment$13", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            ChattingUIFragment.this.f215220f.f193280d.mo102328X5(absListView, i);
            ChattingUIFragment chattingUIFragment = ChattingUIFragment.this;
            chattingUIFragment.f215292E = i;
            if (i == 1) {
                chattingUIFragment.mo102096t0(true);
            }
            if (i == 0) {
                ChattingUIFragment.this.f215220f.mo91581v();
                if (ChattingUIFragment.this.f215304v.getFirstVisiblePosition() == 0) {
                    mo102100a();
                } else if (ChattingUIFragment.this.f215304v.getLastVisiblePosition() == ChattingUIFragment.this.f215304v.getCount() - 1) {
                    C72917n0 n0Var = ChattingUIFragment.this.f215304v;
                    View childAt = n0Var.getChildAt(n0Var.getChildCount() - 1);
                    if (childAt != null && ChattingUIFragment.this.f215304v.getBottom() - ChattingUIFragment.this.f215289B.getBottomHeight() >= childAt.getBottom()) {
                        Log.m105924i("MicroMsg.ChattingUIFragment", "[onScrollStateChanged] auto load bottom more!");
                        ChattingUIFragment.this.f215289B.mo101739c(true);
                    }
                } else {
                    this.f215312d = true;
                }
                ChattingUIFragment chattingUIFragment2 = ChattingUIFragment.this;
                chattingUIFragment2.f215303u.mo108170D5(chattingUIFragment2.f215304v.getFirstVisiblePosition() - ChattingUIFragment.this.f215304v.getHeaderViewsCount(), ChattingUIFragment.this.f215304v.getLastVisiblePosition());
                ChattingUIFragment chattingUIFragment3 = ChattingUIFragment.this;
                chattingUIFragment3.f215303u.mo108180M3(chattingUIFragment3.f215304v.getFirstVisiblePosition() - ChattingUIFragment.this.f215304v.getHeaderViewsCount(), ChattingUIFragment.this.f215304v.getLastVisiblePosition());
            }
            C76624k kVar = ChattingUIFragment.this.f215299L;
            if (kVar != null) {
                kVar.mo106876b(absListView, i);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingUIFragment$13", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingUIFragment$d */
    public class C73274d implements View.OnLayoutChangeListener {
        public C73274d() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            ChattingUIFragment chattingUIFragment = ChattingUIFragment.this;
            chattingUIFragment.f215303u.mo108170D5(chattingUIFragment.f215304v.getFirstVisiblePosition() - ChattingUIFragment.this.f215304v.getHeaderViewsCount(), ChattingUIFragment.this.f215304v.getLastVisiblePosition());
            ChattingUIFragment.this.f215304v.removeOnLayoutChangeListener(this);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingUIFragment$e */
    public class C73275e extends RecyclerView.C0130p {
        public C73275e() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingUIFragment$15", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            ChattingUIFragment.this.f215220f.f193280d.mo102328X5(recyclerView, i);
            ChattingUIFragment chattingUIFragment = ChattingUIFragment.this;
            chattingUIFragment.f215292E = i;
            if (i == 1) {
                chattingUIFragment.mo102096t0(true);
            }
            if (i == 0) {
                ChattingUIFragment.this.f215220f.mo91581v();
                if (ChattingUIFragment.this.f215304v.getFirstCompletelyVisiblePosition() == 0) {
                    Object tag = ChattingUIFragment.this.f215304v.mo81289D().getTag(C0966R.C0970id.mcf);
                    if (tag == null ? true : ((Boolean) tag).booleanValue()) {
                        int i2 = 0;
                        View childAt = ChattingUIFragment.this.f215304v.getChildAt(0);
                        if (childAt != null) {
                            int paddingTop = ChattingUIFragment.this.f215304v.getPaddingTop();
                            if (childAt.getTop() == paddingTop) {
                                Log.m105924i("MicroMsg.ChattingUIFragment", "[onScrollStateChanged] auto load top more!");
                                boolean z = (ChattingUIFragment.this.getBounceView() == null || ChattingUIFragment.this.getBounceView().getOffset() == 0) ? false : true;
                                MMChattingListView mMChattingListView = ChattingUIFragment.this.f215289B;
                                if (!z) {
                                    i2 = 200;
                                }
                                mMChattingListView.mo101743e(true, i2);
                            } else if (childAt.getTop() < paddingTop) {
                                Log.m105928w("MicroMsg.ChattingUIFragment", "[onScrollStateChanged] exception auto load top more wit reset adapter!");
                                ChattingUIFragment chattingUIFragment2 = ChattingUIFragment.this;
                                chattingUIFragment2.f215289B.setAdapter(chattingUIFragment2.f215303u);
                            }
                        }
                    }
                } else if (ChattingUIFragment.this.f215304v.getLastVisiblePosition() == ChattingUIFragment.this.f215304v.getCount() - 1) {
                    C72917n0 n0Var = ChattingUIFragment.this.f215304v;
                    View childAt2 = n0Var.getChildAt(n0Var.getChildCount() - 1);
                    if (childAt2 != null && ChattingUIFragment.this.f215304v.getBottom() - ChattingUIFragment.this.f215289B.getBottomHeight() >= childAt2.getBottom()) {
                        Log.m105924i("MicroMsg.ChattingUIFragment", "[onScrollStateChanged] auto load bottom more!");
                        ChattingUIFragment.this.f215289B.mo101739c(true);
                    }
                }
                ChattingUIFragment chattingUIFragment3 = ChattingUIFragment.this;
                chattingUIFragment3.f215303u.mo108170D5(chattingUIFragment3.f215304v.getFirstVisiblePosition() - ChattingUIFragment.this.f215304v.getHeaderViewsCount(), ChattingUIFragment.this.f215304v.getLastVisiblePosition());
                ChattingUIFragment chattingUIFragment4 = ChattingUIFragment.this;
                chattingUIFragment4.f215303u.mo108180M3(chattingUIFragment4.f215304v.getFirstVisiblePosition() - ChattingUIFragment.this.f215304v.getHeaderViewsCount(), ChattingUIFragment.this.f215304v.getLastVisiblePosition());
            }
            ChattingUIFragment chattingUIFragment5 = ChattingUIFragment.this;
            ViewGroup D = chattingUIFragment5.f215304v.mo81289D();
            C76624k kVar = chattingUIFragment5.f215299L;
            if (kVar != null) {
                kVar.mo106876b(D, i);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingUIFragment$15", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingUIFragment$15", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            if ((layoutManager instanceof LinearLayoutManager) && adapter != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int C = linearLayoutManager.mo16957C();
                int E = (linearLayoutManager.mo16959E() - C) + 1;
                ChattingUIFragment.this.f215220f.f193280d.mo26189W5(recyclerView, C, E, adapter.getItemCount());
                ChattingUIFragment chattingUIFragment = ChattingUIFragment.this;
                ViewGroup D = chattingUIFragment.f215304v.mo81289D();
                C76624k kVar = chattingUIFragment.f215299L;
                if (kVar != null) {
                    kVar.mo106875a(D, C, E);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingUIFragment$15", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingUIFragment$f */
    public class C73276f implements View.OnLayoutChangeListener {
        public C73276f() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i8 > 0 && i8 > i4) {
                if (((C79387w) ChattingUIFragment.this.f215220f.f193278b.mo102812a(C79387w.class)).mo102193k1().f211917p1) {
                    ChattingUIFragment.this.mo102088p0(true, false, false);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingUIFragment$g */
    public class C73277g implements Runnable {

        /* renamed from: d */
        public C79361h0 f215317d;

        /* renamed from: e */
        public final /* synthetic */ String f215318e;

        /* renamed from: f */
        public final /* synthetic */ C72996z1 f215319f;

        public C73277g(ChattingUIFragment chattingUIFragment, String str, C72996z1 z1Var) {
            this.f215318e = str;
            this.f215319f = z1Var;
            this.f215317d = (C79361h0) chattingUIFragment.f215220f.f193278b.mo102812a(C79361h0.class);
        }

        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            C79361h0 h0Var = this.f215317d;
            if (h0Var == null) {
                Log.m105920e("MicroMsg.ChattingUIFragment", "messBoxComponent == null! without writeOpLogAndMarkRead!");
                return;
            }
            h0Var.mo102466R3(this.f215318e, this.f215319f);
            Log.m105925i("MicroMsg.ChattingUIFragment", "ChattingUI writeOpLogAndMarkRead last : %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingUIFragment$h */
    public class C73278h implements C101077d {
        public C73278h() {
        }

        /* renamed from: a */
        public void mo102106a(View view, int i, int i2) {
            C79368l lVar;
            if (view != null && (lVar = ChattingUIFragment.this.f215303u) != null) {
                ((C60200t1) C86312j.m106911c(C60200t1.class)).ui0(ChattingUIFragment.this.f215304v.mo81289D(), lVar, 0, i, i2, 2, "temp_6", 1, false);
            }
        }

        /* renamed from: b */
        public void mo102107b(View view, int i, int i2, int i3) {
            C79368l lVar;
            if (view != null && i2 >= 0 && i3 > 0 && (lVar = ChattingUIFragment.this.f215303u) != null) {
                ((C60200t1) C86312j.m106911c(C60200t1.class)).ui0(ChattingUIFragment.this.f215304v.mo81289D(), lVar, 0, i2, i3, 2, "temp_6", 1, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingUIFragment$i */
    public class C73279i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f215321d;

        /* renamed from: e */
        public final /* synthetic */ boolean f215322e;

        public C73279i(boolean z, boolean z2) {
            this.f215321d = z;
            this.f215322e = z2;
        }

        public void run() {
            ChattingUIFragment chattingUIFragment = ChattingUIFragment.this;
            boolean z = this.f215321d;
            boolean z2 = this.f215322e;
            String str = ChattingUIFragment.f215287Q;
            chattingUIFragment.mo102089r0(z, z2);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingUIFragment$j */
    public class C73280j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f215324d;

        /* renamed from: e */
        public final /* synthetic */ int f215325e;

        /* renamed from: f */
        public final /* synthetic */ int f215326f;

        /* renamed from: g */
        public final /* synthetic */ boolean f215327g;

        public C73280j(boolean z, int i, int i2, boolean z2) {
            this.f215324d = z;
            this.f215325e = i;
            this.f215326f = i2;
            this.f215327g = z2;
        }

        public void run() {
            if (!this.f215324d || !ChattingUIFragment.this.f215289B.mo64384q0()) {
                C72924q1.m85521b(ChattingUIFragment.this.f215304v, this.f215325e - 1, -this.f215326f, this.f215327g, false);
            } else {
                Log.m105924i("MicroMsg.ChattingUIFragment", "scrollToLastImpl: isAtBottom in post");
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingUIFragment$k */
    public class C73281k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f215329d;

        public C73281k(boolean z) {
            this.f215329d = z;
        }

        public void run() {
            ChattingUIFragment chattingUIFragment = ChattingUIFragment.this;
            boolean z = this.f215329d;
            String str = ChattingUIFragment.f215287Q;
            chattingUIFragment.mo102098v0(z);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingUIFragment$l */
    public class C73282l implements Runnable {
        public C73282l() {
        }

        public void run() {
            Class cls = C79343c0.class;
            ((C79343c0) ChattingUIFragment.this.f215220f.f193278b.mo102812a(cls)).mo102600B1();
            ((C79343c0) ChattingUIFragment.this.f215220f.f193278b.mo102812a(cls)).mo102611a();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingUIFragment$m */
    public class C73283m implements C118148a {
        public C73283m() {
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public Map<String, Object> mo37b(String str) {
            ArrayMap arrayMap = new ArrayMap();
            C67391b bVar = ChattingUIFragment.this.f215220f;
            int N7 = ChattingUI.m86391N7(C97625j3.m125812b().mo105907v().get(ChattingUIFragment.this.getStringExtra("Chat_User")), bVar);
            arrayMap.put(PatchedFlutterActivity.EXTRA_PAGE_TYPE, Integer.valueOf(N7));
            arrayMap.put("is_mute", Integer.valueOf(ChattingUI.m86392O7(N7, bVar)));
            return arrayMap;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingUIFragment$n */
    public class C73284n implements ScreenShotUtil.ScreenShotCallback {
        public C73284n() {
        }

        public void onScreenShot(String str, long j) {
            ChattingUIFragment.this.f215220f.mo91558S();
            Log.m105925i("MicroMsg.ChattingUIFragment", "onScreenShot dateAdded = %d", Long.valueOf(j));
            C117361f.INSTANCE.Kf0(str, j, ChattingUIFragment.this.f215220f.mo91577r(), ChattingUIFragment.this.f215220f.mo91574o().mo62927s3() ? 1 : ChattingUIFragment.this.f215220f.mo91582w() ? 2 : 0);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingUIFragment$o */
    public class C73285o implements Runnable {
        public C73285o() {
        }

        public void run() {
            ChattingUIFragment chattingUIFragment = ChattingUIFragment.this;
            boolean z = chattingUIFragment.f215293F;
            if (z || chattingUIFragment.f215292E != 0) {
                chattingUIFragment.f215295H = 10;
                Log.m105925i("MicroMsg.ChattingUIFragment", "scrollToLastProtect userTouched: %s state: %s", Boolean.valueOf(z), Integer.valueOf(ChattingUIFragment.this.f215292E));
                return;
            }
            int lastVisiblePosition = chattingUIFragment.f215304v.getLastVisiblePosition();
            int count = ChattingUIFragment.this.f215304v.getCount() - 1;
            Log.m105925i("MicroMsg.ChattingUIFragment", "scrollToLastProtect tryScrollTimes : %s, lastvisible/total=%s/%s", Integer.valueOf(ChattingUIFragment.this.f215295H), Integer.valueOf(lastVisiblePosition), Integer.valueOf(count));
            if (lastVisiblePosition < count) {
                ChattingUIFragment.this.mo102089r0(true, true);
                ChattingUIFragment.this.mo102090s0();
                return;
            }
            ChattingUIFragment.this.f215295H = 10;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingUIFragment$p */
    public class C73286p implements Runnable {
        public C73286p() {
        }

        public void run() {
            ChattingUIFragment.this.mo102088p0(true, false, true);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingUIFragment$q */
    public class C73287q extends C67398g {
        public C73287q() {
        }

        /* renamed from: a */
        public void mo91597a() {
            ChattingUIFragment chattingUIFragment = ChattingUIFragment.this;
            ((C79344c1) chattingUIFragment.f215220f.f193278b.mo102812a(C79344c1.class)).mo102265O3(new C73690g3(chattingUIFragment));
        }
    }

    public ChattingUIFragment() {
        C40008f fVar = C40008f.f107254d;
        this.f215301N = new IListener<MusicPlayerEvent>(fVar) {
            {
                this.__eventId = -1155728636;
            }

            public boolean callback(IEvent iEvent) {
                if (((MusicPlayerEvent) iEvent).f9336d.f9337a != 4) {
                    return false;
                }
                Log.m105924i("MicroMsg.ChattingUIFragment", "musicPlayerListener error");
                ChattingUIFragment chattingUIFragment = ChattingUIFragment.this;
                String string = chattingUIFragment.getContext().getString(C0966R.string.f361077h32);
                String str = ChattingUIFragment.f215287Q;
                C76912y0.m92767f(chattingUIFragment.getContext(), string);
                return false;
            }
        };
        this.f215302P = new IListener<MusicCheckErrorEvent>(fVar) {
            {
                this.__eventId = -1443570203;
            }

            public boolean callback(IEvent iEvent) {
                MusicCheckErrorEvent musicCheckErrorEvent = (MusicCheckErrorEvent) iEvent;
                Log.m105924i("MicroMsg.ChattingUIFragment", "musicCheckErrorListener check error");
                MusicCheckErrorEvent.C55147a aVar = musicCheckErrorEvent.f154842d;
                if (aVar.f154843a == 0) {
                    Log.m105920e("MicroMsg.ChattingUIFragment", "musicCheckErrorListener, must has error.");
                    return false;
                }
                String string = !Util.isNullOrNil(aVar.f154844b) ? musicCheckErrorEvent.f154842d.f154844b : ChattingUIFragment.this.getContext().getString(C0966R.string.f361077h32);
                ChattingUIFragment chattingUIFragment = ChattingUIFragment.this;
                String str = ChattingUIFragment.f215287Q;
                C76912y0.m92767f(chattingUIFragment.getContext(), string);
                return false;
            }
        };
    }

    /* renamed from: O */
    public void mo102024O(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(context);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doAttach", "(Landroid/content/Context;)V", this, array);
        super.mo102024O(context);
        Log.m105925i("MicroMsg.ChattingUIFragment", "[doAttach]:%s#0x%x task:%s hc:%d", thisActivity().getClass().getSimpleName(), Integer.valueOf(thisActivity().hashCode()), Util.getActivityTaskInfo(thisActivity()), Integer.valueOf(hashCode()));
        MMActivityController mMActivityController = this.mController;
        if (mMActivityController != null) {
            mMActivityController.f348089b0 = 3;
            mMActivityController.f348091c0 = true;
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doAttach", "(Landroid/content/Context;)V");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0157  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo70223P() {
        /*
            r13 = this;
            r0 = 0
            r13.f215294G = r0
            r1 = 1
            r13.f215290C = r1
            r13.f215291D = r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "isFromSearch  "
            r2.append(r3)
            java.lang.String r3 = "finish_direct"
            java.lang.Boolean r3 = r13.getBooleanExtra(r3, r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.ChattingUIFragment"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r2)
            ck3.b r2 = r13.f215220f
            com.tencent.mm.storage.z1 r2 = r2.mo91574o()
            if (r2 != 0) goto L_0x002e
            r2 = 1
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            java.lang.String r4 = "Chat_Self"
            java.lang.String r4 = r13.getStringExtra(r4)
            ck3.b r5 = r13.f215220f
            r5.f193285i = r4
            java.lang.String r4 = "Chat_User"
            java.lang.String r5 = r13.getStringExtra(r4)
            eb0.c r6 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r6 = r6.mo105907v()
            com.tencent.mm.storage.z1 r6 = r6.get(r5)
            r7 = 3
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r0] = r5
            if (r6 != 0) goto L_0x0054
            r9 = -1
            goto L_0x0057
        L_0x0054:
            long r9 = r6.f108320R1
            int r9 = (int) r9
        L_0x0057:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r1] = r9
            if (r6 != 0) goto L_0x0062
            java.lang.String r9 = "null"
            goto L_0x0066
        L_0x0062:
            java.lang.String r9 = r6.getUsername()
        L_0x0066:
            r10 = 2
            r8[r10] = r9
            java.lang.String r9 = "protectContactNotExist raw:%s contact:%d username:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r9, r8)
            if (r6 == 0) goto L_0x007f
            long r8 = r6.f108320R1
            int r9 = (int) r8
            if (r9 == 0) goto L_0x007f
            java.lang.String r8 = r6.getUsername()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x00af
        L_0x007f:
            com.tencent.mm.storage.z1 r6 = new com.tencent.mm.storage.z1
            r6.<init>()
            r6.setUsername(r5)
            r6.f214115W1 = r5
            r6.mo62935u4()
            r6.mo62879U3(r7)
            eb0.c r8 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r8 = r8.mo105907v()
            r8.mo69668Q3(r6)
            eb0.c r8 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r8 = r8.mo105907v()
            com.tencent.mm.storage.z1 r8 = r8.get(r5)
            if (r8 != 0) goto L_0x00ae
            java.lang.String r8 = "protectContactNotExist contact get from db is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r8)
            goto L_0x00f0
        L_0x00ae:
            r6 = r8
        L_0x00af:
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85811N4(r5)
            if (r8 == 0) goto L_0x00ce
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "[protectContactNotExist] isBottleContact userName:"
            r8.append(r9)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
            r6.f214115W1 = r5
            r6.setUsername(r5)
        L_0x00ce:
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85822V5(r5)
            r11 = 1
            if (r8 == 0) goto L_0x00e0
            com.tencent.mm.autogen.mmdata.rpt.WeChatPayPluginReportStruct r8 = new com.tencent.mm.autogen.mmdata.rpt.WeChatPayPluginReportStruct
            r8.<init>()
            r8.f108024d = r11
            r8.mo86054n()
        L_0x00e0:
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85824W5(r5)
            if (r8 == 0) goto L_0x00f0
            com.tencent.mm.autogen.mmdata.rpt.WeChatPayCollectionPluginReportStruct r8 = new com.tencent.mm.autogen.mmdata.rpt.WeChatPayCollectionPluginReportStruct
            r8.<init>()
            r8.f108023d = r11
            r8.mo86054n()
        L_0x00f0:
            java.lang.String r8 = r13.f215218d
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.String r11 = r6.getUsername()
            r9[r0] = r11
            java.lang.String r8 = java.lang.String.format(r8, r9)
            r13.f215219e = r8
            ck3.b r8 = r13.f215220f
            r8.mo91548I(r6)
            java.lang.String r6 = r6.getUsername()
            f215287Q = r6
            java.lang.Class<ex0.d> r6 = ex0.C45696d.class
            k40.a r6 = f40.C86709a0.m107533q(r6)
            ex0.d r6 = (ex0.C45696d) r6
            ck3.b r8 = r13.f215220f
            java.lang.String r8 = r8.mo91577r()
            r6.Xe0(r8)
            super.mo70223P()
            boolean r6 = r13.isSupportNavigationSwipeBack()
            if (r6 == 0) goto L_0x0133
            com.tencent.mm.ui.widget.SwipeBackLayout r6 = r13.getSwipeBackLayout()
            r6.setEnableGesture(r1)
            com.tencent.mm.ui.widget.SwipeBackLayout r6 = r13.getSwipeBackLayout()
            r6.mo26380b()
        L_0x0133:
            if (r2 == 0) goto L_0x0143
            ck3.b r2 = r13.f215220f
            com.tencent.mm.sdk.platformtools.MMHandler r2 = r2.mo91571l()
            com.tencent.mm.ui.chatting.ChattingUIFragment$l r6 = new com.tencent.mm.ui.chatting.ChattingUIFragment$l
            r6.<init>()
            r2.post(r6)
        L_0x0143:
            r13.mo101995o0()
            ck3.b r2 = r13.f215220f
            java.lang.String r2 = r2.mo91577r()
            wz1.C78747b.m95103c(r2)
            uj3.b$e r2 = uj3.C78190b.f229093y0
            int r6 = uj3.C78190b.f229091Q0
            if (r6 < r1) goto L_0x0157
            r6 = 1
            goto L_0x0158
        L_0x0157:
            r6 = 0
        L_0x0158:
            boolean r2 = r2.mo108228c()
            boolean r8 = r13.isCurrentActivity
            r9 = 6
            java.lang.Object[] r9 = new java.lang.Object[r9]
            ck3.b r11 = r13.f215220f
            java.lang.String r11 = r11.mo91577r()
            r9[r0] = r11
            java.lang.String r4 = r13.getStringExtra(r4)
            r9[r1] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
            r9[r10] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            r9[r7] = r4
            r4 = 4
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r8)
            r9[r4] = r7
            r4 = 5
            ck3.b r7 = r13.f215220f
            boolean r7 = r7.f193281e
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r9[r4] = r7
            java.lang.String r4 = "[doCreate] rawUserName from :%s to :%s isRv:%s optBlock:%s newAct:%s isChe:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r9)
            ck3.b r3 = r13.f215220f
            java.lang.String r3 = r3.mo91577r()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x01e1
            ck3.b r3 = r13.f215220f
            android.app.Activity r3 = r3.mo91565f()
            if (r3 == 0) goto L_0x01e1
            bp3.p r3 = bp3.C79758p.f233760a
            tf3.n r4 = new tf3.n
            r4.<init>()
            int r3 = r3.mo109883f(r4)
            if (r3 != r1) goto L_0x01e1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "isRv:"
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = ",optBlock:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = ",newAct:"
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = r3.toString()
            ck3.b r3 = r13.f215220f
            android.app.Activity r3 = r3.mo91565f()
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r3, (java.lang.CharSequence) r2, (int) r0)
            r0.show()
        L_0x01e1:
            int r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.C72852z0.f212316u
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_chatting_full_screen_edt_and
            bp3.f r3 = bp3.C104160f.RepairerConfig_Global_FullScreenEdt_Int
            int r0 = r0.dl0(r2, r3, r1)
            com.tencent.p014mm.pluginsdk.p133ui.chat.C72852z0.f212316u = r0
            java.lang.Class<l31.e> r0 = l31.C61212e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            l31.e r0 = (l31.C61212e) r0
            java.lang.String r1 = "wx_username"
            l31.e r0 = r0.y50(r13, r1, r5)
            com.tencent.mm.ui.chatting.ChattingUIFragment$m r1 = new com.tencent.mm.ui.chatting.ChattingUIFragment$m
            r1.<init>()
            r0.E60(r13, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.ChattingUIFragment.mo70223P():void");
    }

    /* renamed from: Q */
    public void mo102025Q() {
        super.mo102025Q();
    }

    /* renamed from: R */
    public void mo102026R() {
        super.mo102026R();
        this.f215220f.mo91577r();
    }

    /* renamed from: S */
    public void mo101991S() {
        C76901s0 s0Var;
        C117292a.m165355a("com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doPause", "()V", this);
        super.mo101991S();
        if ((thisActivity() instanceof LauncherUI) || (thisActivity() instanceof ChattingUI)) {
            ScreenShotUtil.setScreenShotCallback(thisActivity(), (ScreenShotUtil.ScreenShotCallback) null);
        }
        this.f215307y = null;
        if (C74346y1.m88788b()) {
            try {
                C74346y1.C74347b bVar = C74346y1.f218382b;
                if (!(bVar == null || (s0Var = bVar.f218383d) == null)) {
                    s0Var.dismiss();
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.ChattingItemAvatarOnHoverHelper", "exception in dismiss, %s", e.getMessage());
            }
        }
        Log.m105925i("MicroMsg.ChattingUIFragment", "on chatting ui pause  rawuser:%s", this.f215220f.mo91577r());
        if (this.f215220f.mo91577r() == null) {
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doPause", "()V");
            return;
        }
        this.f215301N.dead();
        this.f215302P.dead();
        this.f215303u.pause();
        hideVKB();
        Log.m105918d("MicroMsg.ChattingUIFragment", "chattingui cancel pause auto download logic");
        C79368l lVar = this.f215303u;
        if (lVar != null) {
            ((C60200t1) C86312j.m106911c(C60200t1.class)).ui0(this.f215304v.mo81289D(), lVar, 3, -1, -1, 2, "temp_6", 3, false);
        }
        synchronized (C75594u0.f222079a) {
            try {
                C75594u0.f222080b = "";
            } catch (Throwable th) {
                throw th;
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doPause", "()V");
    }

    /* renamed from: T */
    public void mo101992T() {
        C117292a.m165355a("com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doResume", "()V", this);
        super.mo101992T();
        if (getWindow() != null) {
            getWindow().setBackgroundDrawableResource(C0966R.color.a_h);
        }
        boolean isShown = getContentView() != null ? getContentView().isShown() : false;
        boolean isShown2 = getView() != null ? getView().isShown() : false;
        boolean z = this.f215304v.getVisibility() == 0;
        if (!this.f215220f.f193283g) {
            Log.m105925i("MicroMsg.ChattingUIFragment", "onResume fragment not foreground, return,  chatting contentview is show %b, viewShow %b listviewShow:%b", Boolean.valueOf(isShown), Boolean.valueOf(isShown2), Boolean.valueOf(z));
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doResume", "()V");
        } else if (!C97625j3.m125811a()) {
            Log.m105928w("MicroMsg.ChattingUIFragment", "account not ready, mabey not call onDestroy!!!");
            finish();
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doResume", "()V");
        } else {
            this.f215301N.alive();
            this.f215302P.alive();
            this.f215303u.resume();
            C79368l lVar = this.f215303u;
            if (lVar != null) {
                ((C60200t1) C86312j.m106911c(C60200t1.class)).ui0(this.f215304v.mo81289D(), lVar, 2, -1, -1, 2, "temp_6", 2, false);
            }
            C75594u0 u0Var = C75594u0.f222079a;
            String r = this.f215220f.mo91577r();
            synchronized (u0Var) {
                C87412m.m108594g(r, "<set-?>");
                C75594u0.f222080b = r;
            }
            if (this.f215289B.getListView() instanceof RecyclerView) {
                this.f215297J.onScrolled((RecyclerView) this.f215289B.getListView(), 0, 0);
            }
            this.f215307y = new C73284n();
            if ((thisActivity() instanceof LauncherUI) || (thisActivity() instanceof ChattingUI)) {
                ScreenShotUtil.setScreenShotCallback(thisActivity(), this.f215307y);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doResume", "()V");
        }
    }

    /* renamed from: U */
    public void mo102027U(boolean z, int i) {
        this.f215289B.mo101743e(z, i);
    }

    /* renamed from: V */
    public C79368l mo102028V() {
        return this.f215303u;
    }

    /* renamed from: X */
    public C116183y1 mo102029X() {
        Class cls = C79343c0.class;
        if (this.f215220f.f193278b.mo102812a(cls) == null) {
            return null;
        }
        return ((C79343c0) this.f215220f.f193278b.mo102812a(cls)).mo102615c0();
    }

    /* renamed from: Y */
    public C78606a mo102030Y() {
        return this.f215296I;
    }

    /* renamed from: Z */
    public C72917n0 mo102031Z() {
        return this.f215304v;
    }

    public void dealContentView(View view) {
        super.dealContentView(view);
        ((C79343c0) this.f215220f.f193278b.mo102812a(C79343c0.class)).mo102606J3(view);
    }

    /* renamed from: e0 */
    public void mo101993e0() {
        Class cls = C61212e.class;
        C117292a.m165355a("com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "onEnterBegin", "()V", this);
        super.mo101993e0();
        mo101994i0();
        int N7 = ChattingUI.m86391N7(C97625j3.m125812b().mo105907v().get(getStringExtra("Chat_User")), this.f215220f);
        if (N7 == 6) {
            ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.ChattingUI_Single).mo86179qs(this, C76986a.SingleChat).mo86136FZ(this, "ChattingUI_Single");
        } else if (N7 == 7) {
            ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.ChattingUI_Group).mo86179qs(this, C76986a.GroupChat).mo86136FZ(this, "ChattingUI_Group");
        } else if (N7 == 9) {
            ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.ChattingUI_EnterpriseSingle).mo86179qs(this, C76986a.EnterpriseSingle).mo86136FZ(this, "ChattingUI_EnterpriseSingle");
        } else if (N7 == 10) {
            ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.ChattingUI_EnterpriseGroup).mo86179qs(this, C76986a.EnterpriseGroup).mo86136FZ(this, "ChattingUI_EnterpriseGroup");
        } else if (N7 == 4 || N7 == 5) {
            ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.ChattingUI_Service).mo86179qs(this, C76986a.ServiceChat).mo86136FZ(this, "ChattingUI_Service");
        } else if (N7 == 0) {
            ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.ChattingUI_NotifyMessages).mo86179qs(this, C76986a.ServiceNotification).mo86136FZ(this, "ChattingUI_NotifyMessages");
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "onEnterBegin", "()V");
    }

    /* renamed from: f0 */
    public void mo102034f0() {
        C117292a.m165355a("com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "onExitBegin", "()V", this);
        super.mo102034f0();
        this.f215303u.finish();
        C76231f fVar = (C76231f) this.f215296I.f230238a;
        synchronized (fVar) {
            Log.m105924i("MicroMsg.ChattingLoader.ListDataLoader", "[cancel]");
            fVar.f223320b.set(true);
            fVar.f223320b = new AtomicBoolean(false);
            fVar.f223319a.removeCallbacksAndMessages((Object) null);
            fVar.f223321c.removeCallbacksAndMessages((Object) null);
            fVar.f223323e.cancel();
        }
        mo101994i0();
        new ChattingUIExitBeginEvent().publish();
        new ChattingUIExitBeginForPayEvent().publish();
        C75778d dVar = C75778d.f222377a;
        C75778d.f222378b.clear();
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "onExitBegin", "()V");
    }

    public void finish() {
        this.f215220f.f193280d.mo102365T5();
        C79387w wVar = (C79387w) this.f215220f.f193278b.mo102812a(C79387w.class);
        int i = 0;
        if (!(wVar == null || wVar.mo102193k1() == null)) {
            wVar.mo102193k1().mo100341B(0, true, -1);
        }
        if (hideVKB()) {
            i = 100;
        }
        C73271a aVar = new C73271a();
        if (i == 0) {
            aVar.run();
        } else {
            MMHandlerThread.postToMainThreadDelayed(aVar, (long) i);
        }
    }

    /* renamed from: g0 */
    public void mo102035g0() {
        C117292a.m165355a("com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "onExitEnd", "()V", this);
        super.mo102035g0();
        C89779i0 i0Var = this.f215305w;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f215305w = null;
        }
        ((C60606n) C86312j.m106911c(C60606n.class)).Di0(2);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "onExitEnd", "()V");
    }

    public int getCustomBounceId() {
        return C0966R.C0970id.b5n;
    }

    public int getFirstVisiblePosition() {
        return this.f215304v.getFirstVisiblePosition();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6823pi;
    }

    public boolean getUserVisibleHint() {
        return this.f215220f.f193283g;
    }

    /* renamed from: h0 */
    public void mo102038h0() {
        C79368l lVar;
        C78606a aVar;
        if (this.f215289B != null && (lVar = this.f215303u) != null) {
            C78190b.C78193e eVar = C78190b.f229093y0;
            C76218a bVar = C78190b.f229091Q0 >= 2 ? new C76221b(this.f215220f, this.f215303u.mo108175K1()) : new C76218a(this.f215220f, lVar.mo108175K1());
            C67391b bVar2 = this.f215220f;
            C76224c cVar = new C76224c(bVar2, this.f215289B);
            Class cls = C79375p.class;
            Class cls2 = C79384u0.class;
            C76231f fVar = new C76231f(cVar, bVar, bVar2);
            if (((C79348e) bVar2.f193278b.mo102812a(C79348e.class)).mo70071q1()) {
                aVar = new C78610b(bVar2, fVar);
            } else {
                if (((C79389x) bVar2.f193278b.mo102812a(C79389x.class)).mo102443k(bVar2.mo91577r())) {
                    aVar = new C78612d(bVar2, fVar);
                } else {
                    if (!((C79384u0) bVar2.f193278b.mo102812a(cls2)).mo102510i2() && !((C79384u0) bVar2.f193278b.mo102812a(cls2)).mo102501F2() && !((C79384u0) bVar2.f193278b.mo102812a(cls2)).mo102513x2() && (!((C79384u0) bVar2.f193278b.mo102812a(cls2)).mo102504J5() || ((C79375p) bVar2.f193278b.mo102812a(cls)).mo70122s3())) {
                        if (!((C79376p0) bVar2.f193278b.mo102812a(C79376p0.class)).mo102689I2()) {
                            if (!((C79365j) bVar2.f193278b.mo102812a(C79365j.class)).mo70105e4()) {
                                if (!((C79377q) bVar2.f193278b.mo102812a(C79377q.class)).mo70131k2()) {
                                    if (!((C79366k) bVar2.f193278b.mo102812a(C79366k.class)).mo70129g1()) {
                                        aVar = ((C79375p) bVar2.f193278b.mo102812a(cls)).mo70122s3() ? new C78622h(bVar2, fVar) : ((C79375p) bVar2.f193278b.mo102812a(cls)).mo70111L3() ? new C78619g(bVar2, fVar) : new C78616e(bVar2, fVar);
                                    }
                                }
                            }
                            aVar = new C78611c(bVar2, fVar);
                        }
                    }
                    aVar = new C78618f(bVar2, fVar);
                }
            }
            cVar.f223300c = aVar;
            Log.m105925i("MicroMsg.ChattingLoader.ChattingDataPresenterFactory", "[ChattingDataPresenterFactory] executor:%s", aVar.toString());
            this.f215296I = aVar;
            this.f215303u.mo108178L5(aVar);
            this.f215289B.setLoadExecutor(this.f215296I);
        }
    }

    public boolean hideVKB() {
        ChatFooter k1 = ((C79387w) this.f215220f.f193278b.mo102812a(C79387w.class)).mo102193k1();
        return k1 != null ? k1.mo100429h0() : super.hideVKB();
    }

    /* renamed from: i0 */
    public void mo101994i0() {
        if (!((C79343c0) this.f215220f.f193278b.mo102812a(C79343c0.class)).mo102625l4()) {
            String r = this.f215220f.mo91577r();
            C72996z1 o = this.f215220f.mo91574o();
            ((C119157j) C119157j.f356862d).mo183876g(new C73277g(this, r, o), "MicroMsg.ChattingUIFragment");
        }
    }

    public boolean isSupportCustomActionBar() {
        return isSupportNavigationSwipeBack();
    }

    /* renamed from: k0 */
    public boolean mo102040k0() {
        if (!isScreenEnable()) {
            Log.m105928w("MicroMsg.ChattingUIFragment", "Actionbar customView onclick screen not enable");
            return true;
        }
        hideVKB();
        if (getActivity() != null) {
            View findViewById = getActivity().findViewById(C0966R.C0970id.f358506fj1);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/ChattingUIFragment", "triggerGoBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/chatting/ChattingUIFragment", "triggerGoBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.post(new C73287q());
            } else {
                ((C79344c1) this.f215220f.f193278b.mo102812a(C79344c1.class)).mo102265O3(new C73690g3(this));
            }
        }
        return true;
    }

    /* renamed from: m0 */
    public void mo102082m0(Bundle bundle) {
        MMChattingListView mMChattingListView = this.f215289B;
        mMChattingListView.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("[forceTopLoadData] sourceArgs:");
        sb.append(bundle == null ? "" : bundle.toString());
        Log.m105924i("MicroMsg.MMChattingListView", sb.toString());
        mMChattingListView.f216807S0 = bundle;
        mMChattingListView.mo101739c(true);
    }

    /* renamed from: n0 */
    public void mo102083n0() {
        Class cls = C60606n.class;
        if (getBooleanExtra("MainUI_FromFinderNotification", false).booleanValue()) {
            C60204t3 t3Var = (C60204t3) C86312j.m106911c(C60204t3.class);
            if (t3Var != null && (thisActivity() instanceof LauncherUI)) {
                t3Var.mo78754kf(thisActivity(), 2);
            }
            if (getArguments() != null) {
                getArguments().remove("MainUI_FromFinderNotification");
            }
        }
        C79369m mVar = (C79369m) this.f215220f.f193278b.mo102812a(C79369m.class);
        C79384u0 u0Var = (C79384u0) this.f215220f.f193278b.mo102812a(C79384u0.class);
        if (mVar.mo102685p2()) {
            if (u0Var.mo102511k0()) {
                u0Var.mo102503H2();
                mVar.mo102684o3();
            } else {
                mVar.mo102686y3();
            }
        }
        C79348e eVar = (C79348e) this.f215220f.f193278b.mo102812a(C79348e.class);
        if (C72996z1.m85798E5(this.f215220f.mo91577r())) {
            Intent intent = new Intent();
            intent.addFlags(67108864);
            C88144b.m109791i(getContext(), "tmessage", ".ui.TConversationUI", intent, (Bundle) null);
        } else if (getIntExtra("chat_from_scene", 0) == 4) {
            finish();
            return;
        } else if ((getIntExtra("chat_from_scene", 0) == 1 || getIntExtra("chat_from_scene", 0) == 3) && this.f215220f.mo91574o() != null && this.f215220f.mo91574o().mo62916m3() && eVar.getBizInfo() != null && eVar.getBizInfo().mo73502t2() && eVar.getBizInfo().mo73500r2(false) != null && eVar.getBizInfo().mo73500r2(false).mo73511d() != null && !Util.isNullOrNil(eVar.getBizInfo().mo73498p2())) {
            finish();
            return;
        } else {
            if (((C79349e0) this.f215220f.f193278b.mo102812a(C79349e0.class)).mo102241i1()) {
                finish();
            } else if (((C60606n) C86312j.m106911c(cls)).mo85002F() || ((C60606n) C86312j.m106911c(cls)).mo85017L5()) {
                finish();
            } else if (!getBooleanExtra("finish_direct", false).booleanValue()) {
                if (!this.isCurrentActivity) {
                    finish();
                    return;
                }
                Intent intent2 = new Intent(getContext(), LauncherUI.class);
                intent2.addFlags(67108864);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent2);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/chatting/ChattingUIFragment", "goBackImpl", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "goBackImpl", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                overridePendingTransition(MMFragmentActivity$$c.f318646c, MMFragmentActivity$$c.f318647d);
                finish();
                return;
            }
        }
        finish();
    }

    /* renamed from: o0 */
    public void mo101995o0() {
        C67391b bVar;
        C72996z1 o;
        C67391b bVar2;
        Class cls = C45696d.class;
        this.f215299L = ((C76623j) C86312j.m106911c(C76623j.class)).kv0(this.f215300M, "ChattingUIFragment", C76624k.C76625a.STRATEGY_SAMPLING);
        this.f215292E = 0;
        MMChattingListView mMChattingListView = (MMChattingListView) findViewById(C0966R.C0970id.b5n);
        this.f215289B = mMChattingListView;
        mMChattingListView.setIsReturnSuperDispatchWhenCancel(true);
        this.f215306x = findViewById(C0966R.C0970id.f357683cf2);
        C72917n0 listView = this.f215289B.getListView();
        this.f215304v = listView;
        listView.setVisibility(0);
        ((C79343c0) this.f215220f.f193278b.mo102812a(C79343c0.class)).mo102601E4();
        if (this.f215289B.getBaseAdapter() == null) {
            C79368l bVar3 = this.f215225n.booleanValue() ? new C78190b(this.f215220f, this.f215304v) : new C78180a(this.f215220f, (ListView) this.f215304v);
            this.f215303u = bVar3;
            this.f215289B.setAdapter(bVar3);
        }
        MMChattingListView mMChattingListView2 = this.f215289B;
        mMChattingListView2.mo101739c(false);
        mMChattingListView2.mo101739c(false);
        mo102038h0();
        Bundle bundle = null;
        if (((C79363i) this.f215220f.f193278b.mo102812a(C79363i.class)).mo102362t0()) {
            bundle = new Bundle();
            bundle.putBoolean("key_is_need_fold_msg", true);
        }
        this.f215296I.mo108594d(C76227e.C76228a.ACTION_ENTER, true, bundle);
        this.f215304v.setOverScrollMode(2);
        ((C79384u0) this.f215220f.f193278b.mo102812a(C79384u0.class)).mo102513x2();
        this.f215304v.setOnTouchListener(new C73272b());
        C78461f bounceView = getBounceView();
        if (!(bounceView == null || (bVar2 = this.f215220f) == null)) {
            ((NestedBounceView) bounceView).mo154637e((C78461f.C78462a) bVar2.f193278b.mo102812a(C79382t.class));
        }
        this.f215304v.mo17043c(this.f215297J);
        this.f215304v.setOnScrollListener(new C73273c());
        this.f215304v.addOnLayoutChangeListener(new C73274d());
        this.f215289B.addOnLayoutChangeListener(this.f215298K);
        if (this.f215224j && ((C45696d) C86709a0.m107533q(cls)).mo70957E5(2) && (bVar = this.f215220f) != null && (o = bVar.mo91574o()) != null && o.mo62916m3()) {
            ((C45696d) C86709a0.m107533q(cls)).mo70972RM(0);
        }
        registerForContextMenu(this.f215304v.mo81289D());
        this.f215289B.setIsIgnoreActionUpForceTopLoad(this.f215225n.booleanValue());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Bundle bundleExtra;
        Class cls = C103918d.class;
        super.onActivityResult(i, i2, intent);
        if (i != 30763 && i != 30762) {
            return;
        }
        if ((i == 30762 || i == 30763) && intent != null && (bundleExtra = intent.getBundleExtra("result_data")) != null && bundleExtra.getString("go_next", "").equals("gdpr_auth_location")) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, Boolean.TRUE);
            if (i == 30763) {
                ((C103918d) C86312j.m106911c(cls)).b40(getActivity(), new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 67);
            } else {
                ((C103918d) C86312j.m106911c(cls)).b40(getActivity(), new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 68);
            }
        }
    }

    public void onCancelDrag() {
        if (isSupportNavigationSwipeBack() && this.f215303u != null) {
            this.f215291D = true;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (C76866m.m92674c() || OnePlus.isOnePlus() || C76866m.m92675d()) {
            ChatFooter k1 = ((C79387w) this.f215220f.f193278b.mo102812a(C79387w.class)).mo102193k1();
            if (k1 != null) {
                boolean contains = configuration.toString().contains("mWindowingMode=100");
                Log.m105925i("MicroMsg.ChattingUIFragment", "onConfigurationChanged: OPPO isInMultiWindowMode:%s ", Boolean.valueOf(contains));
                k1.setIsMultiWindow(contains);
            }
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.f215220f.f193283g) {
            super.onCreateOptionsMenu(menu, menuInflater);
        }
    }

    public void onDragBegin() {
        super.onDragBegin();
        if (isSupportNavigationSwipeBack() && this.f215303u != null) {
            this.f215291D = false;
        }
    }

    public void onKeyboardStateChanged() {
        if (keyboardState() == 1) {
            this.f215304v.post(new C73286p());
        }
    }

    public void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        Log.m105925i("MicroMsg.ChattingUIFragment", "onMultiWindowModeChanged: %s", Boolean.valueOf(z));
        ChatFooter k1 = ((C79387w) this.f215220f.f193278b.mo102812a(C79387w.class)).mo102193k1();
        if (k1 != null) {
            k1.setIsMultiWindow(z);
        }
    }

    public void onSwipeBack() {
        Log.m105928w("MicroMsg.ChattingUIFragment", "onSwipeBack");
        mo102083n0();
        if (C77832s.Ax0().mo183159b()) {
            ExitTrackRoomEvent exitTrackRoomEvent = new ExitTrackRoomEvent();
            exitTrackRoomEvent.f193553d.f193554a = ((C118355y) C75610d.m90860b()).f353752u;
            exitTrackRoomEvent.publish();
        }
        if (isSupportNavigationSwipeBack()) {
            getSwipeBackLayout().setEnableGesture(false);
        }
    }

    /* renamed from: p0 */
    public void mo102088p0(boolean z, boolean z2, boolean z3) {
        if (Log.getLogLevel() <= 1) {
            Log.m105918d("MicroMsg.ChattingUIFragment", "scrollToLast() called with: force = [" + z + "], needRunnable = [" + z2 + "] isSmooth:" + z3 + ",stack:" + Util.getStack());
        }
        if (z2) {
            this.f215220f.mo91571l().removeCallbacks(this.f215308z);
            MMHandler l = this.f215220f.mo91571l();
            C73279i iVar = new C73279i(z, z3);
            this.f215308z = iVar;
            l.post(iVar);
            return;
        }
        mo102089r0(z, z3);
    }

    /* renamed from: r0 */
    public final void mo102089r0(boolean z, boolean z2) {
        int i;
        int lastVisiblePosition = this.f215304v.getLastVisiblePosition();
        int firstVisiblePosition = this.f215304v.getFirstVisiblePosition();
        int count = this.f215304v.getCount();
        if (Log.getLogLevel() <= 1) {
            Object[] objArr = new Object[7];
            objArr[0] = Boolean.valueOf(this.f215290C);
            objArr[1] = Integer.valueOf(lastVisiblePosition);
            objArr[2] = Integer.valueOf(firstVisiblePosition);
            objArr[3] = Integer.valueOf(count);
            objArr[4] = Boolean.valueOf(z);
            objArr[5] = Boolean.valueOf(Looper.getMainLooper() == Looper.myLooper());
            objArr[6] = Util.getStack();
            Log.m105925i("MicroMsg.ChattingUIFragment", "[scrollToLastImpl] isFirstScroll:%s [%s:%s] count:%s force:%s isMain:%s stack:%s", objArr);
        }
        this.f215290C = false;
        if (!z || lastVisiblePosition != firstVisiblePosition || lastVisiblePosition < count - 1 || this.f215304v.getChildCount() <= 0) {
            i = 0;
        } else {
            C72917n0 n0Var = this.f215304v;
            i = n0Var.getChildAt(n0Var.getChildCount() - 1).getHeight();
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            this.f215304v.post(new C73280j(z, count, i, z2));
        } else if (!z || !this.f215289B.mo64384q0()) {
            C72924q1.m85521b(this.f215304v, count - 1, -i, z2, false);
        } else {
            Log.m105924i("MicroMsg.ChattingUIFragment", "scrollToLastImpl: isAtBottom");
        }
    }

    /* renamed from: s0 */
    public void mo102090s0() {
        C79384u0 u0Var = (C79384u0) this.f215220f.f193278b.mo102812a(C79384u0.class);
        C79376p0 p0Var = (C79376p0) this.f215220f.f193278b.mo102812a(C79376p0.class);
        if (!u0Var.mo102513x2() && !u0Var.mo102510i2() && !u0Var.mo102501F2() && !p0Var.mo102698q2() && !u0Var.mo102504J5()) {
            int i = this.f215295H;
            this.f215295H = i + 1;
            int i2 = 10;
            if (i < 10 && ((thisActivity() instanceof ChattingUI) || (thisActivity() instanceof AppBrandServiceChattingUI) || (thisActivity() instanceof OpenImKefuServiceChattingUI))) {
                C72917n0 n0Var = this.f215304v;
                C73285o oVar = new C73285o();
                if (this.f215295H != 1) {
                    i2 = 100;
                }
                n0Var.postDelayed(oVar, (long) i2);
                return;
            }
        }
        Log.m105919d("MicroMsg.ChattingUIFragment", "scrollToLastProtect:%s, %s ,%s", Boolean.valueOf(u0Var.mo102513x2()), Boolean.valueOf(u0Var.mo102510i2()), Integer.valueOf(this.f215295H));
    }

    public void setBackBtn(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((C79343c0) this.f215220f.f193278b.mo102812a(C79343c0.class)).mo102610S3(onMenuItemClickListener);
    }

    public void setMMSubTitle(int i) {
        setMMSubTitle(getMMString(i));
    }

    public void setMMTitle(int i) {
        setMMTitle(getMMString(i));
    }

    /* renamed from: t0 */
    public void mo102096t0(boolean z) {
        this.f215304v.mo81289D().setTag(C0966R.C0970id.mcf, Boolean.valueOf(z));
    }

    /* renamed from: u0 */
    public void mo102097u0(boolean z) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            mo102098v0(z);
        } else {
            this.f215220f.mo91571l().post(new C73281k(z));
        }
    }

    /* renamed from: v0 */
    public final void mo102098v0(boolean z) {
        if (z) {
            View view = this.f215306x;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/ChattingUIFragment", "showChattingLoadingInner", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/ChattingUIFragment", "showChattingLoadingInner", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view3 = this.f215306x;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/ChattingUIFragment", "showChattingLoadingInner", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/ChattingUIFragment", "showChattingLoadingInner", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void setMMSubTitle(String str) {
        ((C79343c0) this.f215220f.f193278b.mo102812a(C79343c0.class)).mo102627m1(str);
    }

    public void setMMTitle(String str) {
        ((C79343c0) this.f215220f.f193278b.mo102812a(C79343c0.class)).mo102629o0(str);
    }

    public ChattingUIFragment(boolean z) {
        super(z);
        C40008f fVar = C40008f.f107254d;
        this.f215301N = new IListener<MusicPlayerEvent>(fVar) {
            {
                this.__eventId = -1155728636;
            }

            public boolean callback(IEvent iEvent) {
                if (((MusicPlayerEvent) iEvent).f9336d.f9337a != 4) {
                    return false;
                }
                Log.m105924i("MicroMsg.ChattingUIFragment", "musicPlayerListener error");
                ChattingUIFragment chattingUIFragment = ChattingUIFragment.this;
                String string = chattingUIFragment.getContext().getString(C0966R.string.f361077h32);
                String str = ChattingUIFragment.f215287Q;
                C76912y0.m92767f(chattingUIFragment.getContext(), string);
                return false;
            }
        };
        this.f215302P = new IListener<MusicCheckErrorEvent>(fVar) {
            {
                this.__eventId = -1443570203;
            }

            public boolean callback(IEvent iEvent) {
                MusicCheckErrorEvent musicCheckErrorEvent = (MusicCheckErrorEvent) iEvent;
                Log.m105924i("MicroMsg.ChattingUIFragment", "musicCheckErrorListener check error");
                MusicCheckErrorEvent.C55147a aVar = musicCheckErrorEvent.f154842d;
                if (aVar.f154843a == 0) {
                    Log.m105920e("MicroMsg.ChattingUIFragment", "musicCheckErrorListener, must has error.");
                    return false;
                }
                String string = !Util.isNullOrNil(aVar.f154844b) ? musicCheckErrorEvent.f154842d.f154844b : ChattingUIFragment.this.getContext().getString(C0966R.string.f361077h32);
                ChattingUIFragment chattingUIFragment = ChattingUIFragment.this;
                String str = ChattingUIFragment.f215287Q;
                C76912y0.m92767f(chattingUIFragment.getContext(), string);
                return false;
            }
        };
    }
}
