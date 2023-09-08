package com.tencent.p014mm.plugin.taskbar.p110ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ay2.C67112a;
import ay2.C67113b;
import ay2.C67120e;
import ay2.C67121f;
import bl3.C39818r;
import c00.C0405n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.AppBrandTaskBar_CloseStruct;
import com.tencent.p014mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView;
import com.tencent.p014mm.dynamicbackground.view.GradientColorBackgroundView;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82260t;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.C68688d;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e;
import com.tencent.p014mm.plugin.multitask.C56887p;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.multitask.p079ui.p888bg.DynamicBgContainer;
import com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC;
import com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarViewPresenter;
import com.tencent.p014mm.plugin.taskbar.p110ui.section.weapp.TaskBarSectionMyWeAppRecyclerView;
import com.tencent.p014mm.plugin.taskbar.p110ui.section.weapp.TaskBarSectionWeAppRecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import dt0.C75443b;
import dt0.C75444c;
import dt0.C75449i;
import ey2.C75665a;
import f40.C86709a0;
import gy2.C76075a;
import gy2.C76076b;
import gy2.C76078d;
import gy2.C76090k;
import gy3.C87412m;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kg3.C76577a;
import kr0.C88273g1;
import kr0.C88274h0;
import ky2.C10432i;
import p235sm.C36685d;
import p235sm.C77729f;
import p235sm.C77731f0;
import p261wl.C38166b;
import sx3.C110818d0;
import vx2.C37867t;
import vx2.C65900i;
import vx2.C78493o;
import vx2.C78494v;
import wx2.C66204d;
import xx2.C26563a;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.TaskBarView */
public class TaskBarView extends RecyclerView implements C71321c, TaskBarViewPresenter.C30482a, C67113b.C67114a, C68691e.C68693b, C71326f {

    /* renamed from: s2 */
    public static final /* synthetic */ int f206466s2 = 0;

    /* renamed from: A1 */
    public MMHandler f206467A1 = new MMHandler(Looper.getMainLooper());

    /* renamed from: B1 */
    public final ArrayList<Integer> f206468B1 = new ArrayList<>();

    /* renamed from: C1 */
    public TaskBarContainer f206469C1;

    /* renamed from: D1 */
    public Context f206470D1;

    /* renamed from: E1 */
    public LinearLayoutManager f206471E1 = null;

    /* renamed from: F1 */
    public boolean f206472F1 = false;

    /* renamed from: G1 */
    public String f206473G1 = "";

    /* renamed from: H1 */
    public C76090k f206474H1;

    /* renamed from: I1 */
    public C76076b f206475I1;

    /* renamed from: J1 */
    public C75665a f206476J1;

    /* renamed from: K1 */
    public RecyclerView.C16613e f206477K1;

    /* renamed from: L1 */
    public int f206478L1 = 0;

    /* renamed from: M1 */
    public Runnable f206479M1 = null;

    /* renamed from: N1 */
    public boolean f206480N1 = false;

    /* renamed from: O1 */
    public int f206481O1 = 0;

    /* renamed from: P1 */
    public boolean f206482P1 = false;

    /* renamed from: Q1 */
    public boolean f206483Q1 = false;

    /* renamed from: R1 */
    public boolean f206484R1 = true;

    /* renamed from: S1 */
    public boolean f206485S1 = false;

    /* renamed from: T1 */
    public boolean f206486T1 = false;

    /* renamed from: U1 */
    public boolean f206487U1 = false;

    /* renamed from: V1 */
    public boolean f206488V1 = false;

    /* renamed from: W1 */
    public boolean f206489W1 = false;

    /* renamed from: X1 */
    public boolean f206490X1 = false;

    /* renamed from: Y1 */
    public boolean f206491Y1 = false;

    /* renamed from: Z1 */
    public boolean f206492Z1 = false;

    /* renamed from: a2 */
    public boolean f206493a2 = false;

    /* renamed from: b2 */
    public int f206494b2 = 0;

    /* renamed from: c2 */
    public boolean f206495c2 = false;

    /* renamed from: d2 */
    public boolean f206496d2 = false;

    /* renamed from: e2 */
    public int f206497e2 = ViewConfiguration.get(MMApplicationContext.getContext()).getScaledTouchSlop();

    /* renamed from: f2 */
    public float f206498f2 = 0.0f;

    /* renamed from: g2 */
    public float f206499g2 = 0.0f;

    /* renamed from: h2 */
    public float f206500h2 = 0.0f;

    /* renamed from: i2 */
    public boolean f206501i2 = false;

    /* renamed from: j2 */
    public boolean f206502j2 = false;

    /* renamed from: k2 */
    public boolean f206503k2 = false;

    /* renamed from: l2 */
    public boolean f206504l2 = false;

    /* renamed from: m2 */
    public Interpolator f206505m2 = new DecelerateInterpolator();

    /* renamed from: n2 */
    public final Runnable f206506n2 = new C71309d();

    /* renamed from: o2 */
    public final Runnable f206507o2 = new C71310e();

    /* renamed from: p2 */
    public int f206508p2 = -1;

    /* renamed from: q2 */
    public boolean f206509q2 = false;

    /* renamed from: r2 */
    public RecyclerView.C0130p f206510r2 = new C5518a();

    /* renamed from: y1 */
    public C57440s f206511y1 = new C57440s();

    /* renamed from: z1 */
    public TaskBarViewPresenter f206512z1;

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.TaskBarView$a */
    public class C5518a extends RecyclerView.C0130p {
        public C5518a() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/taskbar/ui/TaskBarView$11", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                TaskBarView taskBarView = TaskBarView.this;
                if (taskBarView.f206509q2) {
                    taskBarView.f206509q2 = false;
                } else {
                    int i2 = taskBarView.f206508p2;
                    if (i2 == 1 || i2 == 2) {
                        taskBarView.getClass();
                    }
                }
            }
            TaskBarView.this.f206508p2 = i;
            C117292a.m165361g(this, "com/tencent/mm/plugin/taskbar/ui/TaskBarView$11", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/taskbar/ui/TaskBarView$11", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            TaskBarView taskBarView = TaskBarView.this;
            if (taskBarView.f206472F1) {
                taskBarView.f206472F1 = false;
                if (taskBarView.f206471E1 != null) {
                    taskBarView.getClass();
                    int C = 0 - TaskBarView.this.f206471E1.mo16957C();
                    if (C >= 0 && C < TaskBarView.this.getChildCount()) {
                        TaskBarView.this.scrollBy(0, TaskBarView.this.getChildAt(C).getTop());
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/taskbar/ui/TaskBarView$11", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.TaskBarView$b */
    public class C71307b implements Runnable {
        public C71307b() {
        }

        public void run() {
            TaskBarView.this.setLayoutFrozen(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.TaskBarView$c */
    public class C71308c extends LinearLayoutManager {
        public C71308c(Context context) {
            super(context);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = r0.f206475I1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean canScrollVertically() {
            /*
                r3 = this;
                com.tencent.mm.plugin.taskbar.ui.TaskBarView r0 = com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarView.this
                int r1 = com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarView.f206466s2
                gy2.k r1 = r0.f206474H1
                r2 = 1
                if (r1 == 0) goto L_0x000f
                com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView r1 = r1.f222996j
                boolean r1 = r1.f197325A1
                if (r1 != 0) goto L_0x0019
            L_0x000f:
                gy2.b r0 = r0.f206475I1
                if (r0 == 0) goto L_0x001b
                com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView r0 = r0.f222996j
                boolean r0 = r0.f197325A1
                if (r0 == 0) goto L_0x001b
            L_0x0019:
                r0 = 1
                goto L_0x001c
            L_0x001b:
                r0 = 0
            L_0x001c:
                r0 = r0 ^ r2
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarView.C71308c.canScrollVertically():boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.TaskBarView$d */
    public class C71309d implements Runnable {
        public C71309d() {
        }

        public void run() {
            TaskBarView taskBarView = TaskBarView.this;
            if (taskBarView.f206474H1 != null) {
                Log.m105925i("MicroMsg.TaskBarView", "checkWeAppSectionData recent: %d", Integer.valueOf(taskBarView.f206512z1.f206527f.size()));
                TaskBarView taskBarView2 = TaskBarView.this;
                taskBarView2.f206474H1.setDataList(taskBarView2.f206512z1.f206527f);
            }
            TaskBarView taskBarView3 = TaskBarView.this;
            if (taskBarView3.f206475I1 != null) {
                Log.m105925i("MicroMsg.TaskBarView", "checkWeAppSectionData my: %d", Integer.valueOf(taskBarView3.f206512z1.f206528g.size()));
                TaskBarView taskBarView4 = TaskBarView.this;
                taskBarView4.f206475I1.setDataList(taskBarView4.f206512z1.f206528g);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.TaskBarView$e */
    public class C71310e implements Runnable {
        public C71310e() {
        }

        public void run() {
            Log.m105924i("MicroMsg.TaskBarView", "doReloadData");
            TaskBarView taskBarView = TaskBarView.this;
            int i = TaskBarView.f206466s2;
            taskBarView.mo98199H1();
            TaskBarView taskBarView2 = TaskBarView.this;
            if (taskBarView2.f44722C) {
                taskBarView2.f206480N1 = true;
            }
            if (taskBarView2.getRecyclerView().mo17036W0()) {
                Log.m105924i("MicroMsg.TaskBarView", "isComputingLayout not update");
                TaskBarView.this.f206485S1 = true;
                return;
            }
            TaskBarViewPresenter taskBarViewPresenter = TaskBarView.this.f206512z1;
            taskBarViewPresenter.f206537p.clear();
            ArrayList arrayList = new ArrayList(taskBarViewPresenter.f206527f);
            int size = arrayList.size();
            int i2 = 8;
            if (size > 8) {
                size = 8;
            }
            for (int i3 = 0; i3 < size; i3++) {
                LocalUsageInfo localUsageInfo = ((C68691e.C68692a) arrayList.get(i3)).f197340a;
                C87412m.m108593f(localUsageInfo, "dumpWeAppData[i].info");
                taskBarViewPresenter.mo98239i(localUsageInfo, false);
            }
            ArrayList arrayList2 = new ArrayList(taskBarViewPresenter.f206528g);
            int size2 = arrayList2.size();
            if (size2 <= 8) {
                i2 = size2;
            }
            for (int i4 = 0; i4 < i2; i4++) {
                LocalUsageInfo localUsageInfo2 = ((C68691e.C68692a) arrayList2.get(i4)).f197340a;
                C87412m.m108593f(localUsageInfo2, "dumpWeAppData[i].info");
                taskBarViewPresenter.mo98239i(localUsageInfo2, true);
            }
            TaskBarView.this.f206477K1.notifyDataSetChanged();
            TaskBarView.this.f206485S1 = false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.TaskBarView$f */
    public class C71311f implements Runnable {
        public C71311f() {
        }

        public void run() {
            TaskBarView.m83764x1(TaskBarView.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.TaskBarView$g */
    public class C71312g extends RecyclerView.C16613e<C67112a> {

        /* renamed from: d */
        public TaskBarSectionWeAppRecyclerView.C71348e f206518d = new C71313a();

        /* renamed from: com.tencent.mm.plugin.taskbar.ui.TaskBarView$g$a */
        public class C71313a implements TaskBarSectionWeAppRecyclerView.C71348e {
            public C71313a() {
            }

            /* renamed from: a */
            public boolean mo98218a(float f, float f2) {
                C76076b bVar = TaskBarView.this.f206475I1;
                if (bVar != null) {
                    return bVar.mo106283j(f, f2);
                }
                return false;
            }

            /* renamed from: b */
            public void mo98219b(LocalUsageInfo localUsageInfo, int i, int i2) {
                TaskBarViewPresenter taskBarViewPresenter = TaskBarView.this.f206512z1;
                if (taskBarViewPresenter != null) {
                    taskBarViewPresenter.mo98240j(localUsageInfo, i, i2, true);
                }
            }

            /* renamed from: c */
            public void mo98220c(C68691e.C68692a aVar, boolean z) {
            }

            /* renamed from: d */
            public void mo98221d(C68691e.C68692a aVar, int i) {
                TaskBarView.this.f206512z1.mo98236f(i, true);
                TaskBarView taskBarView = TaskBarView.this;
                taskBarView.f206477K1.notifyItemChanged(taskBarView.f206468B1.indexOf(2), Boolean.TRUE);
                TaskBarView.this.mo98197F1(aVar.f197340a, i, true);
            }

            /* renamed from: e */
            public void mo98222e(float f) {
            }

            /* renamed from: f */
            public void mo98223f() {
                mo98230m(false);
            }

            /* renamed from: g */
            public void mo98224g(int i, C68691e.C68692a aVar) {
                Log.m105925i("MicroMsg.TaskBarView", "notifyMyWeAppChanged %d", Integer.valueOf(i));
                int indexOf = TaskBarView.this.f206468B1.indexOf(2);
                if (indexOf != -1) {
                    C76076b bVar = TaskBarView.this.f206475I1;
                    if (bVar != null) {
                        C87412m.m108594g(aVar, "newItem");
                        TaskBarSectionWeAppRecyclerView recyclerView = bVar.getRecyclerView();
                        C87412m.m108592e(recyclerView, "null cannot be cast to non-null type com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionMyWeAppRecyclerView");
                        TaskBarSectionMyWeAppRecyclerView taskBarSectionMyWeAppRecyclerView = (TaskBarSectionMyWeAppRecyclerView) recyclerView;
                        int size = taskBarSectionMyWeAppRecyclerView.getDataList().size();
                        Log.m105925i("MicroMsg.AppBrandDesktopSectionWeAppRecyclerView", "notifyItemInserted showlist filled %s", C76090k.m91403f(taskBarSectionMyWeAppRecyclerView.getShowList()));
                        Log.m105925i("MicroMsg.AppBrandDesktopSectionWeAppRecyclerView", "notifyItemInserted %d %d %s %s", Integer.valueOf(i), Integer.valueOf(size), aVar.f197340a.f239044h, C76090k.m91403f(taskBarSectionMyWeAppRecyclerView.getDataList()));
                        int i2 = 0;
                        while (true) {
                            if (i2 >= taskBarSectionMyWeAppRecyclerView.getShowList().size()) {
                                i2 = -1;
                                break;
                            } else if (aVar.mo94483a(taskBarSectionMyWeAppRecyclerView.getShowList().get(i2))) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (i2 != -1) {
                            taskBarSectionMyWeAppRecyclerView.getShowList().remove(i2);
                            taskBarSectionMyWeAppRecyclerView.getDataList().remove(i2);
                            taskBarSectionMyWeAppRecyclerView.getDataList().add(aVar);
                            int size2 = taskBarSectionMyWeAppRecyclerView.getShowList().size();
                            taskBarSectionMyWeAppRecyclerView.getShowList().add(taskBarSectionMyWeAppRecyclerView.getDataList().get(size2));
                            taskBarSectionMyWeAppRecyclerView.f206639D1.notifyItemRemoved(i2);
                            taskBarSectionMyWeAppRecyclerView.f206639D1.notifyItemInserted(size2);
                        } else {
                            int size3 = taskBarSectionMyWeAppRecyclerView.getShowList().size();
                            if (size3 < 8) {
                                taskBarSectionMyWeAppRecyclerView.getShowList().add(size3, aVar);
                                taskBarSectionMyWeAppRecyclerView.f206639D1.notifyItemInserted(size3);
                            }
                            int i3 = 0;
                            while (true) {
                                if (i3 >= taskBarSectionMyWeAppRecyclerView.getDataList().size()) {
                                    break;
                                } else if (aVar.mo94483a(taskBarSectionMyWeAppRecyclerView.getDataList().get(i3))) {
                                    taskBarSectionMyWeAppRecyclerView.getDataList().remove(i3);
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                            taskBarSectionMyWeAppRecyclerView.getDataList().add(aVar);
                            if (taskBarSectionMyWeAppRecyclerView.getShowList().size() > 8) {
                                taskBarSectionMyWeAppRecyclerView.getShowList().remove(8);
                                taskBarSectionMyWeAppRecyclerView.f206639D1.notifyItemRemoved(7);
                            }
                        }
                        Log.m105925i("MicroMsg.AppBrandDesktopSectionWeAppRecyclerView", "notifyItemInserted showlist filled %s", C76090k.m91403f(taskBarSectionMyWeAppRecyclerView.getShowList()));
                        Log.m105925i("MicroMsg.AppBrandDesktopSectionWeAppRecyclerView", "notifyItemInserted filled %s", C76090k.m91403f(taskBarSectionMyWeAppRecyclerView.getDataList()));
                        RecyclerView.C16613e eVar = taskBarSectionMyWeAppRecyclerView.f206639D1;
                        int itemCount = eVar.getItemCount();
                        Boolean bool = Boolean.TRUE;
                        eVar.notifyItemRangeChanged(0, itemCount, bool);
                        bVar.mo106312i();
                        if (((TaskBarSectionMyWeAppRecyclerView) bVar.getRecyclerView()).getDataList().size() > 8) {
                            C67113b.C67114a callback = bVar.getCallback();
                            List<C68691e.C68692a> dataList = ((TaskBarSectionMyWeAppRecyclerView) bVar.getRecyclerView()).getDataList();
                            C87412m.m108593f(dataList, "recyclerView.dataList");
                            String str = ((C68691e.C68692a) C110818d0.m150923U(dataList)).f197340a.f239041e;
                            TaskBarViewPresenter taskBarViewPresenter = ((TaskBarView) callback).f206512z1;
                            if (taskBarViewPresenter != null) {
                                taskBarViewPresenter.f206534m.mo53506d(2, 11, (String) null, 1, str);
                            }
                        }
                        if (!TaskBarView.this.getRecyclerView().mo17036W0()) {
                            TaskBarView.this.f206477K1.notifyItemChanged(indexOf, bool);
                        }
                    }
                } else if (!TaskBarView.this.getRecyclerView().mo17036W0()) {
                    if (TaskBarView.this.f206512z1.f206528g.isEmpty()) {
                        TaskBarView.this.f206512z1.f206528g.add(aVar);
                    }
                    TaskBarView.this.mo98199H1();
                    TaskBarView taskBarView = TaskBarView.this;
                    taskBarView.f206477K1.notifyItemInserted(taskBarView.f206468B1.indexOf(2));
                }
                TaskBarView.this.mo94385k(true, aVar.f197340a, i, true, 1);
            }

            /* renamed from: h */
            public void mo98225h() {
                mo98230m(true);
            }

            /* renamed from: i */
            public View mo98226i() {
                return TaskBarView.this.f206475I1;
            }

            /* renamed from: j */
            public void mo98227j(boolean z) {
                C76076b bVar = TaskBarView.this.f206475I1;
                if (bVar == null) {
                    return;
                }
                if (bVar.f222937p.getVisibility() == 4 && z) {
                    bVar.mo106283j(-1.0f, -1.0f);
                    bVar.f222937p.setVisibility(0);
                    if (!bVar.f222942u) {
                        int f = C76577a.m92155f(bVar.getContext(), C0966R.dimen.f4074qk) + C76577a.m92155f(bVar.getContext(), C0966R.dimen.f4073qj);
                        Rect rect = new Rect();
                        bVar.f222940s.getGlobalVisibleRect(rect);
                        ViewGroup.LayoutParams layoutParams = bVar.f222940s.getLayoutParams();
                        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                        if (rect.bottom + C76577a.m92155f(bVar.getContext(), C0966R.dimen.f3766df) > C76577a.m92159j(bVar.getContext()) - f) {
                            bVar.f222942u = true;
                            Log.m105924i("MicroMsg.AppBrandDesktopSectionMyWeAppView", "need adjust mask view height");
                            layoutParams2.removeRule(13);
                            layoutParams2.addRule(14);
                            layoutParams2.topMargin = C76577a.m92155f(bVar.getContext(), C0966R.dimen.f3766df);
                        } else {
                            layoutParams2.addRule(13);
                            layoutParams2.removeRule(14);
                            layoutParams2.topMargin = 0;
                        }
                        bVar.f222940s.setLayoutParams(layoutParams2);
                    }
                    bVar.f222937p.setAlpha(0.0f);
                    bVar.f222937p.clearAnimation();
                    bVar.f222937p.animate().alpha(1.0f).setDuration(250).setListener((Animator.AnimatorListener) null).start();
                } else if (bVar.f222937p.getVisibility() == 0 && !z) {
                    bVar.f222937p.clearAnimation();
                    bVar.f222937p.animate().alpha(0.0f).setDuration(250).setListener(new C76075a(bVar)).start();
                }
            }

            /* renamed from: k */
            public void mo98228k(RecyclerView.C16631z zVar, View view, C68691e.C68692a aVar, int i, boolean z) {
                if (aVar != null) {
                    TaskBarView.this.mo94379Q(zVar.mo17363j(), aVar, z, false);
                }
            }

            /* renamed from: l */
            public void mo98229l(C68691e.C68692a aVar, int i) {
                TaskBarView.this.f206512z1.mo98236f(i, false);
                TaskBarView taskBarView = TaskBarView.this;
                taskBarView.f206477K1.notifyItemChanged(taskBarView.f206468B1.indexOf(1), Boolean.TRUE);
                TaskBarView.this.mo98197F1(aVar.f197340a, i, false);
            }

            /* renamed from: m */
            public final void mo98230m(boolean z) {
                ImageView imageView;
                C68691e.C68692a aVar;
                LocalUsageInfo localUsageInfo;
                Log.m105925i("MicroMsg.TaskBarView", "jumpToWeAppList %b", Boolean.valueOf(z));
                TaskBarView taskBarView = TaskBarView.this;
                int i = TaskBarView.f206466s2;
                taskBarView.f206489W1 = false;
                taskBarView.f206490X1 = false;
                taskBarView.f206486T1 = true;
                Boolean bool = Boolean.FALSE;
                C76076b bVar = taskBarView.f206475I1;
                String str = null;
                if (!(bVar == null || z || (imageView = (ImageView) bVar.findViewById(C0966R.C0970id.m4t)) == null || imageView.getDrawable() == null)) {
                    C76076b bVar2 = TaskBarView.this.f206475I1;
                    if (bVar2.getRecyclerView() == null || bVar2.getRecyclerView().getDataList() == null || bVar2.getRecyclerView().getDataList().size() == 0) {
                        aVar = null;
                    } else {
                        List<C68691e.C68692a> dataList = bVar2.getRecyclerView().getDataList();
                        C87412m.m108593f(dataList, "recyclerView.dataList");
                        aVar = (C68691e.C68692a) C110818d0.m150923U(dataList);
                    }
                    if (!(aVar == null || (localUsageInfo = aVar.f197340a) == null)) {
                        String str2 = localUsageInfo.f239041e;
                        Boolean bool2 = Boolean.TRUE;
                        imageView.setImageDrawable((Drawable) null);
                        str = str2;
                        bool = bool2;
                    }
                }
                TaskBarView.this.f206469C1.f206451j.setImportantForAccessibility(4);
                AppBrandDesktopContainerView y1 = TaskBarView.this.getDesktopContainer();
                boolean booleanValue = bool.booleanValue();
                y1.getClass();
                int i2 = 2;
                Log.m105925i("MicroMsg.AppBrandDesktopContainerView", "showDesktopView %b %b", Boolean.valueOf(z), Boolean.valueOf(y1.mo94374b()));
                if (!y1.mo94374b()) {
                    y1.f197226f.mo94412a(z ? y1.f197229i : y1.f197228h);
                    y1.f197227g.setText(y1.f197226f.getViewModel().mo105790d());
                    Log.m105924i("MicroMsg.AppBrandDesktopContainerView", "animateShowDesktopView");
                    y1.f197224d.setVisibility(0);
                    y1.f197224d.setTranslationX((float) y1.getWidth());
                    y1.f197224d.setAlpha(0.0f);
                    y1.f197225e.setVisibility(0);
                    y1.f197225e.setAlpha(0.0f);
                    y1.f197230j = true;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y1.f197224d, "translationX", new float[]{(float) y1.getWidth(), 0.0f});
                    ofFloat.setInterpolator(new LinearInterpolator());
                    ofFloat.setDuration(300);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(y1.f197224d, "alpha", new float[]{0.0f, 1.0f});
                    ofFloat2.setInterpolator(new LinearInterpolator());
                    ofFloat2.setDuration(300);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(y1.f197225e, "alpha", new float[]{0.0f, 1.0f});
                    ofFloat3.setInterpolator(new LinearInterpolator());
                    ofFloat3.setDuration(300);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
                    animatorSet.addListener(new C75443b(y1, booleanValue));
                    animatorSet.start();
                }
                TaskBarView taskBarView2 = TaskBarView.this;
                if (!z) {
                    i2 = 11;
                }
                taskBarView2.mo94380R(i2, false, false, str);
            }
        }

        public C71312g() {
            setHasStableIds(true);
        }

        /* renamed from: F4 */
        public final String mo98216F4(List<C68691e.C68692a> list) {
            String str = "";
            for (C68691e.C68692a next : list) {
                if (next.f197340a != null) {
                    str = str + next.f197340a.f239044h + " ";
                } else {
                    str = str + "info null ";
                }
            }
            return str;
        }

        /* renamed from: G4 */
        public void onBindViewHolder(C67112a aVar, int i) {
            boolean z = false;
            Log.m105925i("MicroMsg.TaskBarView", "onBind %d %d", Integer.valueOf(aVar.f44859i), Integer.valueOf(i));
            int i2 = aVar.f44859i;
            if (i2 == 1) {
                TaskBarView taskBarView = TaskBarView.this;
                C76090k kVar = (C76090k) aVar.f44854d;
                taskBarView.f206474H1 = kVar;
                kVar.setDataList(taskBarView.f206512z1.f206527f);
                Log.m105924i("MicroMsg.TaskBarView", "onBind setWeAppList " + mo98216F4(TaskBarView.this.f206512z1.f206527f));
            } else if (i2 == 2) {
                TaskBarView taskBarView2 = TaskBarView.this;
                C76076b bVar = (C76076b) aVar.f44854d;
                taskBarView2.f206475I1 = bVar;
                bVar.setDataList(taskBarView2.f206512z1.f206528g);
                Log.m105924i("MicroMsg.TaskBarView", "onBind setMyWeAppList " + mo98216F4(TaskBarView.this.f206512z1.f206528g));
            } else if (i2 == 3) {
                C67120e eVar = (C67120e) aVar.f44854d;
                TaskBarView taskBarView3 = TaskBarView.this;
                int i3 = TaskBarView.f206466s2;
                if (taskBarView3.f206468B1.size() - (taskBarView3.f206468B1.contains(5) ? 1 : 0) == 1) {
                    z = true;
                }
                eVar.f192723j.setText(C76577a.m92166q(eVar.getContext(), z ? C0966R.string.f7890v7 : C0966R.string.f7893v_));
            }
            View view = aVar.f44854d;
            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.taskbar.ui.section.TaskBarSectionBaseView");
            C67121f viewModel = ((C67113b) view).getViewModel();
            viewModel.getClass();
            Log.m105924i("MicroMsg.TaskBarSectionViewModel", "update show data oldCount:" + ((ArrayList) viewModel.f192729d).size() + " new:" + viewModel.f192728c.size());
            ((ArrayList) viewModel.f192729d).clear();
            ((ArrayList) viewModel.f192729d).addAll(viewModel.f192728c);
            View view2 = aVar.f44854d;
            C87412m.m108592e(view2, "null cannot be cast to non-null type com.tencent.mm.plugin.taskbar.ui.section.TaskBarSectionBaseView");
            ((C67113b) view2).mo91215b();
        }

        public int getItemCount() {
            return TaskBarView.this.f206468B1.size();
        }

        public long getItemId(int i) {
            return (long) TaskBarView.this.f206468B1.get(i).intValue();
        }

        public int getItemViewType(int i) {
            TaskBarView taskBarView = TaskBarView.this;
            if (i < 0) {
                int i2 = TaskBarView.f206466s2;
                taskBarView.getClass();
            } else if (i < taskBarView.f206468B1.size()) {
                return taskBarView.f206468B1.get(i).intValue();
            }
            return -1;
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C67112a aVar;
            C67112a aVar2;
            if (i == 1) {
                TaskBarView taskBarView = TaskBarView.this;
                Context context = TaskBarView.this.getContext();
                TaskBarView taskBarView2 = TaskBarView.this;
                C87412m.m108594g(context, "context");
                C87412m.m108594g(taskBarView2, "callback");
                taskBarView.f206474H1 = new C76090k(context, taskBarView2, i, (AttributeSet) null, 0);
                TaskBarView.this.f206474H1.setWeAppCallback(this.f206518d);
                aVar = new C67112a(TaskBarView.this.f206474H1);
            } else if (i != 2) {
                if (i == 3) {
                    aVar2 = new C67112a(new C67120e(TaskBarView.this.getContext(), TaskBarView.this, i));
                } else if (i == 4) {
                    TaskBarView.this.f206476J1 = new C75665a(TaskBarView.this.getContext(), TaskBarView.this, i);
                    aVar = new C67112a(TaskBarView.this.f206476J1);
                } else if (i != 5) {
                    return null;
                } else {
                    aVar2 = new C67112a(new C76078d(TaskBarView.this.getContext(), TaskBarView.this, i));
                }
                aVar = aVar2;
            } else {
                TaskBarView.this.f206475I1 = new C76076b(TaskBarView.this.getContext(), TaskBarView.this, i);
                TaskBarView.this.f206475I1.setWeAppCallback(this.f206518d);
                aVar = new C67112a(TaskBarView.this.f206475I1);
            }
            C67121f a = TaskBarView.this.f206512z1.mo98231a(i);
            if (a == null) {
                return aVar;
            }
            View view = aVar.f44854d;
            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.taskbar.ui.section.TaskBarSectionBaseView");
            ((C67113b) view).setViewModel(a);
            return aVar;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
            C67112a aVar = (C67112a) zVar;
            if (list.size() == 0) {
                onBindViewHolder(aVar, i);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.TaskBarView$h */
    public class C71314h extends RecyclerView.C0129l {
        public C71314h(C71307b bVar) {
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            super.mo21g(rect, view, recyclerView, wVar);
            RecyclerView.C16631z P0 = recyclerView.mo17031P0(view);
            if (P0 == null) {
                Log.m105928w("MicroMsg.TaskBarView", "null holder");
                return;
            }
            int j = P0.mo17363j();
            if (wVar.f44842k && j == -1) {
                j = P0.f44857g;
            }
            int i = P0.f44859i;
            if (j == 0) {
                rect.top = 0;
            } else if (i == 2) {
                if (TaskBarView.this.f206468B1.contains(1)) {
                    rect.top = C76577a.m92155f(view.getContext(), C0966R.dimen.f3766df);
                } else {
                    rect.top = 0;
                }
            } else if (i == 4) {
                if (TaskBarView.this.f206468B1.contains(2) || TaskBarView.this.f206468B1.contains(1)) {
                    rect.top = C76577a.m92155f(view.getContext(), C0966R.dimen.f3749d0);
                } else {
                    rect.top = 0;
                }
            }
            if (i == 3) {
                rect.top = TaskBarView.this.getEmptyViewTopMargin();
            }
            ArrayList<Integer> arrayList = TaskBarView.this.f206468B1;
            if (i == arrayList.get(arrayList.size() - 1).intValue()) {
                rect.bottom = C76577a.m92155f(view.getContext(), C0966R.dimen.f3753d4);
            }
            Log.m105925i("MicroMsg.TaskBarView", "getItemOffsets index:%d sectionType:%d rect:%s", Integer.valueOf(j), Integer.valueOf(i), rect);
        }
    }

    public TaskBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo98194C1(context);
    }

    /* access modifiers changed from: private */
    public AppBrandDesktopContainerView getDesktopContainer() {
        return this.f206469C1.getDesktopContainerView();
    }

    /* access modifiers changed from: private */
    public int getEmptyViewTopMargin() {
        C76076b bVar;
        C76090k kVar;
        int i = 0;
        boolean z = this.f206468B1.size() - (this.f206468B1.contains(5) ? 1 : 0) == 1;
        int f = C76577a.m92155f(getContext(), C0966R.dimen.f3760da);
        if (z) {
            int height = getHeight();
            if (this.f206468B1.contains(5)) {
                i = f;
            }
            return (height - i) / 3;
        }
        int height2 = getHeight();
        if (this.f206468B1.contains(5)) {
            height2 -= f;
        }
        if (this.f206468B1.contains(1) && (kVar = this.f206474H1) != null) {
            height2 -= kVar.getHeight();
        }
        if (this.f206468B1.contains(2) && (bVar = this.f206475I1) != null) {
            height2 -= bVar.getHeight();
        }
        return Math.max(height2 / 3, C76577a.m92155f(getContext(), C0966R.dimen.f3736cp));
    }

    private void setupMultiTaskScroll(boolean z) {
        Log.m105925i("MicroMsg.TaskBarView", "setupMultiTaskScroll %b", Boolean.valueOf(z));
        ((MultiTaskUIC) C39818r.f106831a.mo62443b(getContext()).mo75002a(MultiTaskUIC.class)).mo90993a(z);
    }

    /* renamed from: x1 */
    public static void m83764x1(TaskBarView taskBarView) {
        Log.m105925i("MicroMsg.TaskBarView", "onDidCloseHeader %b", Boolean.valueOf(taskBarView.f206482P1));
        if (!taskBarView.f206482P1) {
            taskBarView.setupMultiTaskScroll(true);
            taskBarView.f206484R1 = true;
            taskBarView.mo98196E1();
        }
    }

    /* renamed from: z1 */
    public static void m83766z1(TaskBarView taskBarView, int i, LocalUsageInfo localUsageInfo, int i2, boolean z) {
        taskBarView.getClass();
        Log.m105927v("MicroMsg.TaskBarView", "alvinluo launchAppBrand position: %d", Integer.valueOf(i2));
        AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
        appBrandStatObject.f245533f = i;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "2:" : "1:");
        sb.append(i2);
        appBrandStatObject.f245534g = sb.toString();
        if (localUsageInfo != null) {
            taskBarView.f206491Y1 = true;
            taskBarView.mo98198G1();
            C71320b0 b0Var = new C71320b0(taskBarView, localUsageInfo, appBrandStatObject);
            long j = 0;
            if (C78493o.m94791b()) {
                j = ((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_android_appbrand_pulldown_launch_remove_delay_millis, 0);
            }
            taskBarView.postDelayed(b0Var, j);
        }
    }

    /* renamed from: B1 */
    public final boolean mo98192B1() {
        boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_TASKBAR_SHOULD_NOT_SHOW_EMPTY_OTHER_TIPS_BOOLEAN_SYNC, false);
        Log.m105925i("MicroMsg.TaskBarView", "enableOthersWording %b", Boolean.valueOf(!g));
        return !g;
    }

    /* renamed from: C */
    public void mo98193C() {
        mo98206h();
    }

    /* renamed from: C1 */
    public final void mo98194C1(Context context) {
        this.f206470D1 = context;
        setItemAnimator(this.f206511y1);
        mo17085h0(new C71314h((C71307b) null));
        ((C77731f0) C86312j.m106911c(C77731f0.class)).io0(this.f206470D1);
        setVerticalFadingEdgeEnabled(false);
        setNestedScrollingEnabled(true);
        setBackgroundColor(getContext().getResources().getColor(C0966R.color.ahf));
        C71308c cVar = new C71308c(context);
        this.f206471E1 = cVar;
        setLayoutManager(cVar);
        setOverScrollMode(2);
        mo17043c(this.f206510r2);
        C71312g gVar = new C71312g();
        this.f206477K1 = gVar;
        setAdapter(gVar);
        Log.m105925i("MicroMsg.TaskBarView", "alvinluo TaskBarView init %d", Integer.valueOf(hashCode()));
    }

    /* renamed from: D1 */
    public void mo98195D1() {
        Log.m105924i("MicroMsg.TaskBarView", "onTeenModeStatusChanged");
        this.f206512z1.mo98233c(true);
        getDesktopContainer().f197226f.mo94420y();
    }

    /* renamed from: E1 */
    public void mo98196E1() {
        post(this.f206506n2);
        Object[] objArr = new Object[7];
        boolean z = false;
        objArr[0] = Boolean.valueOf(this.f206486T1);
        objArr[1] = Boolean.valueOf(this.f206488V1);
        objArr[2] = Boolean.valueOf(this.f206485S1);
        objArr[3] = Boolean.valueOf(this.f206484R1);
        objArr[4] = Boolean.valueOf(!this.f206487U1);
        objArr[5] = Boolean.valueOf(this.f206512z1.f206531j == 0);
        objArr[6] = Boolean.valueOf(!this.f206482P1);
        Log.m105925i("MicroMsg.TaskBarView", "reloadDataIfNeed isInSecondaryPage[%b],isStopped[%b] | shouldReloadOnAppear[%b] isHeaderDidClose[%b] !isPaused[%b] isOnMainTab[%b] !isHeaderStartOpen[%b]", objArr);
        if (!this.f206486T1 && (!this.f206488V1 || this.f206484R1)) {
            if (this.f206485S1 && this.f206484R1 && !this.f206487U1) {
                if (this.f206512z1.f206531j == 0) {
                    z = true;
                }
                if (!z || this.f206482P1) {
                    return;
                }
            } else {
                return;
            }
        }
        removeCallbacks(this.f206507o2);
        post(this.f206507o2);
    }

    /* renamed from: F1 */
    public void mo98197F1(LocalUsageInfo localUsageInfo, int i, boolean z) {
        TaskBarViewPresenter taskBarViewPresenter = this.f206512z1;
        taskBarViewPresenter.getClass();
        C87412m.m108594g(localUsageInfo, "appItem");
        Log.m105925i("MicroMsg.TaskBarViewPresenter", "reportOnItemManualDeleted appId:%s,pos:%d", localUsageInfo.f239041e, Integer.valueOf(i));
        taskBarViewPresenter.f206534m.mo53505c(2, 7, z ? 3 : 1, C56887p.m65608b(localUsageInfo.f239041e, localUsageInfo.f239042f), 0, 1, 0, 0);
    }

    /* renamed from: G1 */
    public final void mo98198G1() {
        if (this.f206469C1 != null && C78493o.m94791b()) {
            Log.m105924i("MicroMsg.TaskBarView", "alvinluo switchToGradientBackgroundView");
            ViewParent parent = this.f206469C1.getParent();
            if (parent instanceof View) {
                ((View) parent).setBackgroundColor(this.f206470D1.getResources().getColor(C0966R.color.ahf));
            }
            DynamicBgContainer backgroundGLSurfaceContainer = this.f206469C1.getBackgroundGLSurfaceContainer();
            if (backgroundGLSurfaceContainer != null) {
                synchronized (backgroundGLSurfaceContainer) {
                    Log.m105924i("MicroMsg.DynamicBgContainer.", "pause");
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
                        dynamicBackgroundGLSurfaceView.mo93446b();
                    }
                }
                this.f206495c2 = true;
            }
        }
    }

    /* renamed from: H1 */
    public final void mo98199H1() {
        int i;
        this.f206468B1.clear();
        boolean z = !((C10432i) C86312j.m106911c(C10432i.class)).mo10750e();
        if (z) {
            this.f206468B1.add(5);
        }
        if (this.f206512z1.f206527f.size() <= 0 || C67121f.f192724e.mo55825a(1)) {
            i = 0;
        } else {
            this.f206468B1.add(1);
            i = 1;
        }
        if (this.f206512z1.f206528g.size() > 0 && !C67121f.f192724e.mo55825a(1)) {
            i++;
            this.f206468B1.add(2);
        }
        if (this.f206512z1.mo98231a(4).f192728c.size() > 0) {
            this.f206468B1.add(4);
        }
        if (this.f206468B1.size() - (z ? 1 : 0) == i && (i == 0 || mo98192B1())) {
            this.f206468B1.add(3);
        }
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        Iterator<Integer> it = this.f206468B1.iterator();
        while (it.hasNext()) {
            sb.append(it.next().intValue());
            sb.append(",");
        }
        objArr[0] = sb.toString();
        Log.m105925i("MicroMsg.TaskBarView", "update section: %s", objArr);
    }

    /* renamed from: K */
    public void mo98200K(int i, int i2) {
        ImageView imageView;
        C68688d dVar;
        C68688d dVar2;
        int i3 = i;
        int i4 = i2;
        Log.m105925i("MicroMsg.TaskBarView", "[onCloseHeader] reason: %d duration:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (this.f206483Q1) {
            this.f206486T1 = false;
            this.f206483Q1 = false;
            this.f206482P1 = false;
            this.f206493a2 = false;
            TaskBarViewPresenter taskBarViewPresenter = this.f206512z1;
            boolean b = getDesktopContainer().mo94374b();
            C75449i viewModel = getDesktopContainer().f197226f.getViewModel();
            boolean z = viewModel != null && viewModel.mo105791e() == 2;
            taskBarViewPresenter.getClass();
            Log.m105925i("MicroMsg.TaskBarViewPresenter", "onDidClose reason:%d", Integer.valueOf(i));
            int i5 = (i3 == 0 || i3 == 13) ? 2 : 1;
            long currentTimeMillis = System.currentTimeMillis();
            long j = taskBarViewPresenter.f206536o + (currentTimeMillis - taskBarViewPresenter.f206535n);
            taskBarViewPresenter.f206536o = j;
            int i6 = !b ? 1 : z ? 3 : 2;
            long j2 = (long) 1000;
            Log.m105925i("MicroMsg.TaskBarViewPresenter", "reportTaskBarClose viewDuration:%d,lastStartTime:%d,currentTime:%d,closeType:%d,reportTime:%d,page:%d", Long.valueOf(j), Long.valueOf(taskBarViewPresenter.f206535n), Long.valueOf(currentTimeMillis), Integer.valueOf(taskBarViewPresenter.f206538q), Integer.valueOf((int) (taskBarViewPresenter.f206536o / j2)), Integer.valueOf(i6));
            C26563a aVar = taskBarViewPresenter.f206534m;
            int i7 = (int) (taskBarViewPresenter.f206536o / j2);
            int i8 = taskBarViewPresenter.f206538q;
            aVar.getClass();
            AppBrandTaskBar_CloseStruct appBrandTaskBar_CloseStruct = new AppBrandTaskBar_CloseStruct();
            appBrandTaskBar_CloseStruct.f194128d = appBrandTaskBar_CloseStruct.mo86045b("session_id", aVar.f73914a, true);
            appBrandTaskBar_CloseStruct.f194129e = (long) i5;
            appBrandTaskBar_CloseStruct.f194130f = (long) i7;
            appBrandTaskBar_CloseStruct.f194131g = (long) i8;
            appBrandTaskBar_CloseStruct.f194132h = (long) i6;
            appBrandTaskBar_CloseStruct.mo86054n();
            long j3 = 0;
            taskBarViewPresenter.f206536o = 0;
            taskBarViewPresenter.f206535n = 0;
            C76090k kVar = this.f206474H1;
            if (!(kVar == null || getDesktopContainer().mo94374b() || (dVar2 = kVar.f222996j.f206645J1) == null)) {
                dVar2.mo94477a();
            }
            C76076b bVar = this.f206475I1;
            if (!(bVar == null || getDesktopContainer().mo94374b() || (dVar = bVar.f222996j.f206645J1) == null)) {
                dVar.mo94477a();
            }
            this.f206489W1 = false;
            this.f206490X1 = false;
            this.f206512z1.mo98233c(true);
            postDelayed(new C5519a0(this), i3 == 15 ? (long) i4 : 0);
            AppBrandDesktopContainerView desktopContainer = getDesktopContainer();
            desktopContainer.getClass();
            C75444c cVar = new C75444c(i3, i4, desktopContainer);
            if (i3 == 15 && desktopContainer.mo94374b()) {
                j3 = (long) i4;
            }
            desktopContainer.postDelayed(cVar, j3);
            postDelayed(new C71311f(), (long) i4);
            this.f206469C1.f206451j.setImportantForAccessibility(2);
            C76076b bVar2 = this.f206475I1;
            if (bVar2 != null && bVar2.findViewById(C0966R.C0970id.m4t) != null && (imageView = (ImageView) this.f206475I1.findViewById(C0966R.C0970id.m4t)) != null) {
                imageView.setImageDrawable((Drawable) null);
            }
        }
    }

    /* renamed from: Q */
    public void mo94379Q(int i, C68691e.C68692a aVar, boolean z, boolean z2) {
        int i2 = i;
        C68691e.C68692a aVar2 = aVar;
        boolean z3 = z2;
        int i3 = 1;
        Log.m105925i("MicroMsg.TaskBarView", "launchAppBrandWithCheck, %d %s %b %b", Integer.valueOf(i), aVar2.f197340a.f239044h, Boolean.valueOf(z), Boolean.valueOf(this.f206487U1));
        if (!this.f206487U1) {
            this.f206512z1.getClass();
            Log.m105925i("MicroMsg.TaskBarView", "checkLaunchAppBrand checkOk: %b", Boolean.TRUE);
            this.f206489W1 = false;
            this.f206490X1 = false;
            if (z) {
                m83766z1(this, 1104, aVar2.f197340a, i, z3);
            } else {
                m83766z1(this, C82260t.CTRL_INDEX, aVar2.f197340a, i, z3);
            }
            LocalUsageInfo localUsageInfo = aVar2.f197340a;
            TaskBarViewPresenter taskBarViewPresenter = this.f206512z1;
            taskBarViewPresenter.getClass();
            C87412m.m108594g(localUsageInfo, "appItem");
            Log.m105925i("MicroMsg.TaskBarViewPresenter", "reportOnItemClicked appId:%s,pos:%d,isMy:%b,desktop:%b", localUsageInfo.f239041e, Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2));
            String b = C56887p.m65608b(localUsageInfo.f239041e, localUsageInfo.f239042f);
            int i4 = z ? 3 : 1;
            taskBarViewPresenter.f206538q = i4;
            if (z3) {
                i3 = z ? 3 : 2;
            }
            taskBarViewPresenter.f206534m.mo53507e(i4, i, b, i3, (String) null);
        }
    }

    /* renamed from: R */
    public void mo94380R(int i, boolean z, boolean z2, String str) {
        TaskBarViewPresenter taskBarViewPresenter = this.f206512z1;
        if (taskBarViewPresenter != null) {
            taskBarViewPresenter.f206538q = i;
            int i2 = !z ? 1 : z2 ? 3 : 2;
            Log.m105925i("MicroMsg.TaskBarViewPresenter", "reportOnItemClicked type:%d", Integer.valueOf(i));
            taskBarViewPresenter.f206534m.mo53507e(i, 0, "", i2, str);
        }
    }

    /* renamed from: S */
    public void mo98201S(int i) {
        mo98200K(i, 0);
    }

    /* renamed from: T */
    public void mo94381T(LocalUsageInfo localUsageInfo, boolean z, boolean z2, boolean z3) {
        if (!z2 && this.f206486T1) {
            return;
        }
        if (z2) {
            TaskBarViewPresenter taskBarViewPresenter = this.f206512z1;
            taskBarViewPresenter.getClass();
            C87412m.m108594g(localUsageInfo, "appItem");
            String b = C56887p.m65608b(localUsageInfo.f239041e, localUsageInfo.f239042f);
            int i = 3;
            Log.m105925i("MicroMsg.TaskBarViewPresenter", "reportOnItemAppear appId:%s,multiTaskId:%s loadMore:%b isMy:%b", localUsageInfo.f239041e, b, Boolean.valueOf(z3), Boolean.valueOf(z));
            int i2 = z ? 3 : 1;
            int i3 = z ? 3 : 2;
            if (!z3) {
                i = 2;
            }
            taskBarViewPresenter.f206534m.mo53506d(i, i2, b, i3, "");
            return;
        }
        this.f206512z1.mo98239i(localUsageInfo, z);
    }

    /* renamed from: Y */
    public void mo94382Y() {
    }

    /* renamed from: a0 */
    public void mo94383a0(int i) {
        C71331l lVar = this.f206469C1.f206445d;
        if (lVar != null) {
            lVar.mo98255b(0, i, false);
        }
    }

    /* renamed from: b */
    public void mo94384b(LocalUsageInfo localUsageInfo, int i, int i2) {
        TaskBarViewPresenter taskBarViewPresenter = this.f206512z1;
        if (taskBarViewPresenter != null) {
            taskBarViewPresenter.mo98240j(localUsageInfo, i, i2, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0034, code lost:
        if (r0 != 3) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r0 = r10.f206475I1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            boolean r0 = r10.f206493a2
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            gy2.k r0 = r10.f206474H1
            r2 = 0
            if (r0 == 0) goto L_0x0011
            com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView r0 = r0.f222996j
            boolean r0 = r0.f197325A1
            if (r0 != 0) goto L_0x001b
        L_0x0011:
            gy2.b r0 = r10.f206475I1
            if (r0 == 0) goto L_0x001d
            com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView r0 = r0.f222996j
            boolean r0 = r0.f197325A1
            if (r0 == 0) goto L_0x001d
        L_0x001b:
            r0 = 1
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 == 0) goto L_0x0025
            boolean r11 = super.dispatchTouchEvent(r11)
            return r11
        L_0x0025:
            int r0 = r11.getAction()
            r3 = 0
            if (r0 == 0) goto L_0x0168
            java.lang.String r4 = "MicroMsg.TaskBarView"
            if (r0 == r1) goto L_0x011d
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L_0x0038
            if (r0 == r5) goto L_0x011d
            goto L_0x017e
        L_0x0038:
            boolean r0 = r10.f206502j2
            if (r0 == 0) goto L_0x0041
            boolean r11 = super.dispatchTouchEvent(r11)
            return r11
        L_0x0041:
            boolean r0 = r10.f206503k2
            if (r0 != 0) goto L_0x0077
            float r0 = r11.getRawX()
            float r7 = r10.f206498f2
            float r0 = r0 - r7
            float r0 = java.lang.Math.abs(r0)
            float r7 = r11.getRawY()
            float r8 = r10.f206499g2
            float r7 = r7 - r8
            float r7 = java.lang.Math.abs(r7)
            int r8 = r10.f206497e2
            float r8 = (float) r8
            int r9 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r9 <= 0) goto L_0x0071
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x006d
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x006d
            r10.f206503k2 = r1
            goto L_0x0077
        L_0x006d:
            r10.f206502j2 = r1
            goto L_0x017e
        L_0x0071:
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0077
            r10.f206503k2 = r1
        L_0x0077:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            boolean r7 = r10.f206501i2
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r0[r2] = r7
            float r7 = r10.f206500h2
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r0[r1] = r7
            int r7 = r10.f206497e2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0[r6] = r7
            java.lang.String r7 = "alvinluo ActionMove moveUp: %b, mMoveY: %f, touchSlop: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r7, r0)
            androidx.recyclerview.widget.LinearLayoutManager r0 = r10.f206471E1
            if (r0 == 0) goto L_0x00ad
            java.util.ArrayList<java.lang.Integer> r7 = r10.f206468B1
            if (r7 == 0) goto L_0x00ad
            int r0 = r0.mo16958D()
            java.util.ArrayList<java.lang.Integer> r7 = r10.f206468B1
            int r7 = r7.size()
            int r7 = r7 - r1
            if (r0 != r7) goto L_0x00ad
            r0 = 1
            goto L_0x00ae
        L_0x00ad:
            r0 = 0
        L_0x00ae:
            r7 = 1057803469(0x3f0ccccd, float:0.55)
            if (r0 == 0) goto L_0x00da
            boolean r0 = r10.f206501i2
            if (r0 != 0) goto L_0x00da
            boolean r0 = r10.f206504l2
            if (r0 != 0) goto L_0x00c7
            float r0 = r11.getRawY()
            r10.f206499g2 = r0
            r10.f206500h2 = r3
            r10.f206504l2 = r1
            goto L_0x017e
        L_0x00c7:
            float r0 = r11.getRawY()
            float r2 = r10.f206499g2
            float r0 = r0 - r2
            float r0 = r0 * r7
            r10.f206500h2 = r0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x017e
            r10.f206501i2 = r1
            goto L_0x017e
        L_0x00da:
            boolean r0 = r10.f206501i2
            if (r0 == 0) goto L_0x017e
            float r0 = r11.getRawY()
            float r8 = r10.f206499g2
            float r0 = r0 - r8
            float r0 = r0 * r7
            r10.f206500h2 = r0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00f2
            boolean r11 = super.dispatchTouchEvent(r11)
            return r11
        L_0x00f2:
            int r3 = r10.f206497e2
            int r3 = -r3
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0103
            r11.setAction(r5)
            super.dispatchTouchEvent(r11)
            r11.setAction(r6)
        L_0x0103:
            float r11 = r10.f206500h2
            float r11 = java.lang.Math.abs(r11)
            int r11 = (int) r11
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r0[r2] = r3
            java.lang.String r2 = "alvinluo moveView: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r2, r0)
            int r11 = -r11
            float r11 = (float) r11
            r10.setTranslationY(r11)
            return r1
        L_0x011d:
            boolean r0 = r10.f206501i2
            if (r0 != 0) goto L_0x0122
            goto L_0x015d
        L_0x0122:
            float r0 = r10.f206500h2
            float r0 = java.lang.Math.abs(r0)
            int r1 = com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e.f197339o0
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0146
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r0 = r10.f206469C1
            if (r0 == 0) goto L_0x0146
            java.lang.String r0 = "alvinluo checkAndClose closeHeader because of pull up bottom"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r0 = r10.f206469C1
            r4 = 0
            r1 = 15
            com.tencent.mm.plugin.taskbar.ui.l r0 = r0.f206445d
            if (r0 == 0) goto L_0x015d
            r0.mo98255b(r4, r1, r2)
            goto L_0x015d
        L_0x0146:
            android.view.ViewPropertyAnimator r0 = r10.animate()
            android.view.ViewPropertyAnimator r0 = r0.translationY(r3)
            r4 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r4)
            android.view.animation.Interpolator r1 = r10.f206505m2
            android.view.ViewPropertyAnimator r0 = r0.setInterpolator(r1)
            r0.start()
        L_0x015d:
            r10.f206500h2 = r3
            r10.f206501i2 = r2
            r10.f206504l2 = r2
            r10.f206502j2 = r2
            r10.f206503k2 = r2
            goto L_0x017e
        L_0x0168:
            float r0 = r11.getRawX()
            r10.f206498f2 = r0
            float r0 = r11.getRawY()
            r10.f206499g2 = r0
            r10.f206500h2 = r3
            r10.f206501i2 = r2
            r10.f206504l2 = r2
            r10.f206502j2 = r2
            r10.f206503k2 = r2
        L_0x017e:
            boolean r11 = super.dispatchTouchEvent(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public RecyclerView getRecyclerView() {
        return this;
    }

    public int getTaskBarContainerBottom() {
        return getBottom();
    }

    public float getTopFadingEdgeStrength() {
        return 0.0f;
    }

    /* renamed from: h */
    public void mo98206h() {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_TASKBAR_HAS_SHOWED_EMPTY_OTHER_TIPS_BOOLEAN_SYNC;
        Log.m105924i("MicroMsg.TaskBarView", "[onOpenHeader]");
        if (!this.f206483Q1) {
            if (this.f206468B1.size() > 1 && this.f206468B1.contains(3)) {
                Log.m105924i("MicroMsg.TaskBarView", "other tips show[speard], mark");
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
            }
            if (mo98192B1() && this.f206468B1.contains(4) && C86709a0.m107535s().mo121142i().mo119686g(aVar, false)) {
                Log.m105924i("MicroMsg.TaskBarView", "other tips hide[speard], mark disabled");
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TASKBAR_SHOULD_NOT_SHOW_EMPTY_OTHER_TIPS_BOOLEAN_SYNC, Boolean.TRUE);
            }
            this.f206493a2 = false;
            setupMultiTaskScroll(false);
            String str = this.f206473G1;
            Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WXA_SEARCH_FROM_DESKTOP_INPUT_HINT_CONTENT_STRING_SYNC, (Object) null);
            if (f instanceof String) {
                this.f206473G1 = Util.nullAs((String) f, this.f206473G1);
            }
            Log.m105919d("MicroMsg.TaskBarView", "alvinluo updateSearchWording last: %s, new: %s", str, this.f206473G1);
            this.f206512z1.getClass();
            C36685d dVar = (C36685d) C86312j.m106911c(C36685d.class);
            dVar.mo60807YK(dVar.mo60808jm());
            this.f206483Q1 = true;
            this.f206484R1 = false;
            this.f206489W1 = true;
            this.f206490X1 = true;
            ((C0405n) C86312j.m106911c(C0405n.class)).mo278ce();
            TaskBarViewPresenter taskBarViewPresenter = this.f206512z1;
            C26563a aVar2 = taskBarViewPresenter.f206534m;
            aVar2.getClass();
            aVar2.f73914a = String.valueOf((int) (System.currentTimeMillis() / 1000));
            long currentTimeMillis = System.currentTimeMillis();
            taskBarViewPresenter.f206535n = currentTimeMillis;
            taskBarViewPresenter.f206538q = 0;
            Log.m105925i("MicroMsg.TaskBarViewPresenter", "onDidAppear lastStartTime:%d", Long.valueOf(currentTimeMillis));
            taskBarViewPresenter.mo98241k(false);
            Iterator<TaskBarViewPresenter.C71315b> it = taskBarViewPresenter.f206537p.iterator();
            while (it.hasNext()) {
                TaskBarViewPresenter.C71315b next = it.next();
                MultiTaskInfo multiTaskInfo = next.f206546d;
                if (multiTaskInfo != null) {
                    ((C65900i) C86312j.m106911c(C65900i.class)).getClass();
                    C78494v vVar = (C78494v) C86312j.m106911c(C78494v.class);
                    vVar.getClass();
                    HashSet<C66204d.C66205b> hashSet = vVar.f229931d.get(multiTaskInfo.field_type);
                    if (hashSet != null) {
                        for (C66204d.C66205b m1 : hashSet) {
                            m1.mo90308m1(multiTaskInfo);
                        }
                    }
                    C38166b.m41756c(C66204d.C38350a.class, Integer.valueOf(multiTaskInfo.field_type), new C37867t(multiTaskInfo));
                }
                Log.m105924i("MicroMsg.TaskBarViewPresenter", "do reportFirstFeedShow " + next.f206545c + ' ' + next.f206544b + ' ' + next.f206543a);
                taskBarViewPresenter.f206534m.mo53506d(next.f206543a, next.f206544b, next.f206545c, 1, (String) null);
            }
            taskBarViewPresenter.f206537p.clear();
            ((C77729f) C86312j.m106911c(C77729f.class)).sp0(Util.nowMilliSecond(), true, (Bundle) null, 6, 0);
            C88274h0 h0Var = (C88274h0) C86312j.m106911c(C88274h0.class);
            C88273g1 g1Var = C88273g1.MAIN_PULLDOWN;
            h0Var.mo113299AC(g1Var);
            h0Var.mo113303QK(g1Var);
            h0Var.a90();
            TaskBarViewPresenter taskBarViewPresenter2 = this.f206512z1;
            if (taskBarViewPresenter2 != null) {
                taskBarViewPresenter2.mo98238h(this.f206474H1, false);
                this.f206512z1.mo98238h(this.f206475I1, true);
            }
        }
        setLayoutFrozen(false);
    }

    /* renamed from: k */
    public void mo94385k(boolean z, LocalUsageInfo localUsageInfo, int i, boolean z2, int i2) {
        LocalUsageInfo localUsageInfo2 = localUsageInfo;
        TaskBarViewPresenter taskBarViewPresenter = this.f206512z1;
        taskBarViewPresenter.getClass();
        C87412m.m108594g(localUsageInfo2, "appItem");
        Log.m105925i("MicroMsg.TaskBarViewPresenter", "reportOnItemManualAddDeleteMyWeApp appId:%s,pos:%d", localUsageInfo2.f239041e, Integer.valueOf(i));
        String b = C56887p.m65608b(localUsageInfo2.f239041e, localUsageInfo2.f239042f);
        taskBarViewPresenter.f206534m.mo53505c(z ? 1 : 2, z ? 6 : 7, z2 ? 3 : 1, b, 0, i2, 0, 0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View rootView = getRootView();
        if (rootView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) rootView.findViewById(C0966R.C0970id.gla);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f206502j2) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        TaskBarContainer taskBarContainer = this.f206469C1;
        if (taskBarContainer != null && this.f206478L1 != taskBarContainer.getViewHeight()) {
            int viewHeight = this.f206469C1.getViewHeight();
            this.f206478L1 = viewHeight;
            Log.m105925i("MicroMsg.TaskBarView", "alvinluo onMeasure fixedViewHeight: %d, measuredHeight: %d", Integer.valueOf(viewHeight), Integer.valueOf(this.f206469C1.getMeasuredHeight()));
        }
    }

    public void onVisibilityChanged(View view, int i) {
        TaskBarContainer taskBarContainer;
        super.onVisibilityChanged(view, i);
        Log.m105918d("MicroMsg.TaskBarView", "[onVisibilityChanged] visibility:" + i);
        if (i == 8 || i == 4) {
            if (this.f206491Y1 && (taskBarContainer = this.f206469C1) != null) {
                int i2 = this.f206494b2;
                C71331l lVar = taskBarContainer.f206445d;
                if (lVar != null) {
                    lVar.mo98255b(100, i2, true);
                }
                this.f206494b2 = 0;
                this.f206491Y1 = false;
            }
            if (this.f206480N1) {
                Log.m105924i("MicroMsg.TaskBarView", "alvinluo onVisibilityChanged needRefresh");
                this.f206480N1 = false;
                Runnable runnable = this.f206479M1;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                C71307b bVar = new C71307b();
                this.f206479M1 = bVar;
                postDelayed(bVar, 1000);
            }
        }
    }

    public boolean post(Runnable runnable) {
        synchronized (this) {
            MMHandler mMHandler = this.f206467A1;
            if (mMHandler == null) {
                return false;
            }
            boolean post = mMHandler.post(runnable);
            return post;
        }
    }

    public boolean postDelayed(Runnable runnable, long j) {
        synchronized (this) {
            MMHandler mMHandler = this.f206467A1;
            if (mMHandler == null) {
                return false;
            }
            boolean postDelayed = mMHandler.postDelayed(runnable, j);
            return postDelayed;
        }
    }

    /* renamed from: q */
    public void mo94386q(boolean z) {
        this.f206486T1 = false;
        this.f206469C1.f206451j.setImportantForAccessibility(2);
        if (z) {
            this.f206512z1.mo98241k(true);
        }
    }

    public boolean removeCallbacks(Runnable runnable) {
        synchronized (this) {
            MMHandler mMHandler = this.f206467A1;
            if (mMHandler == null) {
                return false;
            }
            mMHandler.removeCallbacks(runnable);
            return true;
        }
    }

    public void setHeaderContainer(TaskBarContainer taskBarContainer) {
        this.f206469C1 = taskBarContainer;
        getDesktopContainer().setCallback(this);
    }

    /* renamed from: t */
    public void mo94387t(boolean z, int i) {
        TaskBarViewPresenter taskBarViewPresenter = this.f206512z1;
        taskBarViewPresenter.getClass();
        taskBarViewPresenter.f206534m.mo53504b(2, C78493o.m94791b() ? 1 : 0, !z ? i : 0, 0, 0, 0, 0, 0, z ? i : 0, 0, z ? 3 : 2);
    }

    public TaskBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo98194C1(context);
    }
}
