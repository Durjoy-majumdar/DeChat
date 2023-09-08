package com.tencent.p014mm.plugin.taskbar.p110ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ay2.C67121f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.GetMainTabUnReadCountEvent;
import com.tencent.p014mm.autogen.events.UpdateMainActionBarViewEvent;
import com.tencent.p014mm.dynamicbackground.view.GradientColorBackgroundView;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainerView;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.multitask.p079ui.p888bg.DynamicBgContainer;
import com.tencent.p014mm.plugin.taskbar.api.GyroView;
import com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarViewPresenter;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;
import iy2.C76378a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p565ir.C60606n;
import p629ny.C76979h;
import p773yy.C79168k;
import qy2.C63347a;
import su0.C13781a;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C64273c21;
import te3.C64766v41;
import yx2.C79166c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.TaskBarContainer */
public class TaskBarContainer extends RelativeLayout implements View.OnTouchListener, C71325e {

    /* renamed from: K */
    public static final /* synthetic */ int f206434K = 0;

    /* renamed from: A */
    public MMFragmentActivity f206435A;

    /* renamed from: B */
    public boolean f206436B = true;

    /* renamed from: C */
    public int f206437C = 0;

    /* renamed from: D */
    public int f206438D = 0;

    /* renamed from: E */
    public int f206439E = 0;

    /* renamed from: F */
    public int f206440F = 0;

    /* renamed from: G */
    public boolean f206441G = true;

    /* renamed from: H */
    public boolean f206442H = LocaleUtil.isChineseAppLang();

    /* renamed from: I */
    public Runnable f206443I = null;

    /* renamed from: J */
    public IListener f206444J = new IListener<UpdateMainActionBarViewEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1600912022;
        }

        public boolean callback(IEvent iEvent) {
            UpdateMainActionBarViewEvent updateMainActionBarViewEvent = (UpdateMainActionBarViewEvent) iEvent;
            Log.m105925i("MicroMsg.AppBrandDesktopContainer", "alvinluo updateMainActionBarView updateField: %d", Integer.valueOf(updateMainActionBarViewEvent.f193990d.f193991a));
            TaskBarContainer.m83756a(TaskBarContainer.this, updateMainActionBarViewEvent);
            return false;
        }
    };

    /* renamed from: d */
    public C71331l f206445d;

    /* renamed from: e */
    public TaskBarView f206446e;

    /* renamed from: f */
    public DynamicBgContainer f206447f;

    /* renamed from: g */
    public GradientColorBackgroundView f206448g;

    /* renamed from: h */
    public Rect f206449h = new Rect();

    /* renamed from: i */
    public LinearLayout f206450i;

    /* renamed from: j */
    public ViewGroup f206451j;

    /* renamed from: n */
    public View f206452n;

    /* renamed from: o */
    public View f206453o;

    /* renamed from: p */
    public View f206454p;

    /* renamed from: q */
    public TextView f206455q;

    /* renamed from: r */
    public WeImageView f206456r;

    /* renamed from: s */
    public WeImageView f206457s;

    /* renamed from: t */
    public WeImageView f206458t;

    /* renamed from: u */
    public WeImageView f206459u;

    /* renamed from: v */
    public View f206460v;

    /* renamed from: w */
    public View f206461w;

    /* renamed from: x */
    public int f206462x = C75044y4.m89994f(getContext());

    /* renamed from: y */
    public TaskBarBottomView f206463y;

    /* renamed from: z */
    public AppBrandDesktopContainerView f206464z;

    public TaskBarContainer(Context context) {
        super(context);
        mo98165b(context);
    }

    /* renamed from: a */
    public static void m83756a(TaskBarContainer taskBarContainer, UpdateMainActionBarViewEvent updateMainActionBarViewEvent) {
        TaskBarContainer taskBarContainer2 = taskBarContainer;
        UpdateMainActionBarViewEvent updateMainActionBarViewEvent2 = updateMainActionBarViewEvent;
        taskBarContainer.getClass();
        UpdateMainActionBarViewEvent.C67809a aVar = updateMainActionBarViewEvent2.f193990d;
        int i = aVar.f193991a;
        if (i == 1) {
            taskBarContainer2.setActionBarTitle(aVar.f193992b);
        } else if (i == 2) {
            View view = taskBarContainer2.f206460v;
            int i2 = 8;
            if (view != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "updateActionBarIconTips", "(Lcom/tencent/mm/autogen/events/UpdateMainActionBarViewEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "updateActionBarIconTips", "(Lcom/tencent/mm/autogen/events/UpdateMainActionBarViewEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view2 = taskBarContainer2.f206461w;
            if (view2 != null) {
                if (updateMainActionBarViewEvent2.f193990d.f193993c) {
                    i2 = 0;
                }
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(Integer.valueOf(i2));
                View view3 = view2;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "updateActionBarIconTips", "(Lcom/tencent/mm/autogen/events/UpdateMainActionBarViewEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "updateActionBarIconTips", "(Lcom/tencent/mm/autogen/events/UpdateMainActionBarViewEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    private void setActionBarTitle(String str) {
        if (C86709a0.m107522a() && this.f206455q != null) {
            this.f206455q.setText(((C76979h) C86312j.m106911c(C76979h.class)).op0(getContext(), str, C76577a.m92157h(getContext(), C0966R.dimen.f3628l)));
            float f = ((float) C76577a.m92155f(getContext(), C0966R.dimen.f3619c)) * C76577a.m92161l(getContext());
            if (this.f206455q.getTextSize() != f) {
                this.f206455q.setTextSize(0, f);
            }
            C85875k4.m106189j0(this.f206455q.getPaint(), 0.8f);
            ((C79168k) C86312j.m106911c(C79168k.class)).mo74130ns(this.f206455q, C13781a.m13082a(), C63347a.C47892c.PLANET, C63347a.C47893d.OUTLINED);
        }
    }

    /* renamed from: b */
    public final void mo98165b(Context context) {
        Log.m105924i("MicroMsg.AppBrandDesktopContainer", "alvinluo HeaderContainer init");
        setImportantForAccessibility(2);
        this.f206440F = C76577a.m92155f(context, C0966R.dimen.f4073qj);
        int i = getResources().getConfiguration().orientation;
        setBackgroundColor(getResources().getColor(C0966R.color.ahf));
        C79166c.f232463a.mo109147a();
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.c89, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.f5879r7);
        this.f206450i = linearLayout;
        ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = this.f206462x;
        GyroView gyroView = (GyroView) inflate.findViewById(C0966R.C0970id.f358382et0);
        this.f206451j = (ViewGroup) inflate.findViewById(C0966R.C0970id.f6019v1);
        this.f206464z = (AppBrandDesktopContainerView) inflate.findViewById(C0966R.C0970id.c39);
        View inflate2 = LayoutInflater.from(context).inflate(C0966R.C0971layout.c8_, (ViewGroup) null);
        this.f206453o = inflate2;
        this.f206454p = inflate2.findViewById(C0966R.C0970id.f357785br0);
        ((FrameLayout) inflate.findViewById(C0966R.C0970id.f5876r4)).addView(this.f206453o, -1, -1);
        this.f206455q = (TextView) this.f206453o.findViewById(16908308);
        this.f206456r = (WeImageView) this.f206453o.findViewById(C0966R.C0970id.j5t);
        this.f206457s = (WeImageView) this.f206453o.findViewById(C0966R.C0970id.hy6);
        this.f206459u = (WeImageView) this.f206453o.findViewById(C0966R.C0970id.ewu);
        this.f206460v = this.f206453o.findViewById(C0966R.C0970id.j5v);
        this.f206461w = this.f206453o.findViewById(C0966R.C0970id.hy7);
        this.f206463y = (TaskBarBottomView) this.f206453o.findViewById(C0966R.C0970id.f5874r2);
        this.f206458t = (WeImageView) this.f206453o.findViewById(C0966R.C0970id.f5471g1);
        this.f206456r.setOnClickListener(new C71339p(this));
        this.f206457s.setOnClickListener(new C71340q(this));
        mo98166c();
        TaskBarView taskBarView = (TaskBarView) inflate.findViewById(C0966R.C0970id.f5881r_);
        this.f206446e = taskBarView;
        taskBarView.setHeaderContainer(this);
        this.f206446e.setId(C0966R.C0970id.f5881r_);
        addView(inflate, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* renamed from: c */
    public final void mo98166c() {
        LinearLayout linearLayout;
        Log.m105925i("MicroMsg.AppBrandDesktopContainer", "alvinluo initViewScale measuredWidth: %d", Integer.valueOf(getMeasuredWidth()));
        if (this.f206441G && (linearLayout = this.f206450i) != null) {
            linearLayout.setScaleX(0.6f);
            this.f206450i.setScaleY(0.6f);
        }
    }

    /* renamed from: d */
    public void mo98167d(boolean z) {
        TaskBarView taskBarView = this.f206446e;
        if (taskBarView != null) {
            taskBarView.getClass();
            Log.m105925i("MicroMsg.TaskBarView", "alvinluo notifyMultiWindowModeChanged: %b, old: %b", Boolean.valueOf(z), Boolean.valueOf(taskBarView.f206496d2));
            if (taskBarView.f206496d2 != z) {
                taskBarView.f206496d2 = z;
            }
        }
        DynamicBgContainer.setIsInMultiWindowMode(z);
    }

    /* renamed from: e */
    public void mo98168e(boolean z) {
        boolean z2;
        MultiTaskInfo multiTaskInfo;
        String str;
        C64273c21 c212;
        List<MultiTaskInfo> list;
        T t;
        boolean z3;
        TaskBarViewPresenter.C30482a aVar;
        List<MultiTaskInfo> list2;
        TaskBarView taskBarView = this.f206446e;
        taskBarView.getClass();
        Log.m105925i("MicroMsg.TaskBarView", "onStartPull isStart:%b", Boolean.valueOf(z));
        if (z) {
            taskBarView.f206482P1 = true;
            TaskBarViewPresenter taskBarViewPresenter = taskBarView.f206512z1;
            taskBarViewPresenter.getClass();
            Log.m105924i("MicroMsg.TaskBarViewPresenter", "onStartToPull");
            long currentTimeMillis = System.currentTimeMillis();
            ((C119157j) C119157j.f356862d).mo183884o(new C30485d0(taskBarViewPresenter));
            synchronized (taskBarViewPresenter) {
                C67121f a = taskBarViewPresenter.mo98231a(4);
                if (a == null || (list2 = a.f192728c) == null) {
                    z2 = false;
                } else {
                    int size = list2.size();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long He = ((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_taskbar_recent_timeout, 3600) * ((long) 1000);
                    Iterator<MultiTaskInfo> it = list2.iterator();
                    LinkedList linkedList = new LinkedList();
                    while (it.hasNext()) {
                        MultiTaskInfo next = it.next();
                        Log.m105924i("MicroMsg.TaskBarViewPresenter", "item[" + next.mo80305m2().f183752e + ", " + next.field_id + "] time:" + next.field_updateTime + " now:" + currentTimeMillis2 + " limit:" + He);
                        if (currentTimeMillis2 - next.field_updateTime > He) {
                            linkedList.add(next);
                            it.remove();
                        }
                    }
                    ((C119157j) C119157j.f356862d).mo183884o(new C30486e0(linkedList, taskBarViewPresenter));
                    Log.m105924i("MicroMsg.TaskBarViewPresenter", "remove Timeout Data done " + size + ' ' + list2.size());
                    z2 = size != list2.size();
                }
            }
            if (z2 && (aVar = taskBarViewPresenter.f206522a) != null) {
                TaskBarView taskBarView2 = (TaskBarView) aVar;
                int indexOf = taskBarView2.f206468B1.indexOf(4);
                if (indexOf != -1) {
                    Log.m105924i("MicroMsg.TaskBarView", "do reloadOtherData");
                    if (taskBarView2.f206512z1.mo98231a(4).f192728c.isEmpty()) {
                        taskBarView2.mo98199H1();
                        taskBarView2.f206477K1.notifyItemRemoved(indexOf);
                    } else {
                        taskBarView2.f206477K1.notifyItemChanged(indexOf);
                    }
                }
            }
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            C67121f a2 = taskBarViewPresenter.mo98231a(4);
            if (a2 == null || (list = a2.f192728c) == null) {
                multiTaskInfo = null;
            } else {
                Iterator<T> it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it4.next();
                    if (((MultiTaskInfo) t).field_type == 21) {
                        z3 = true;
                        continue;
                    } else {
                        z3 = false;
                        continue;
                    }
                    if (z3) {
                        break;
                    }
                }
                multiTaskInfo = (MultiTaskInfo) t;
            }
            if (multiTaskInfo != null) {
                C64766v41 v412 = new C64766v41();
                try {
                    v412.parseFrom(multiTaskInfo.field_data);
                    FinderObject finderObject = v412.f185835n;
                    if (finderObject != null) {
                        hashMap.put(Long.valueOf(finderObject.f164794id), multiTaskInfo);
                        FinderObject finderObject2 = v412.f185835n;
                        if (((finderObject2 == null || (c212 = finderObject2.liveInfo) == null) ? 2 : c212.f182394f) != 2) {
                            C87412m.m108591d(finderObject2);
                            hashMap2.put(Long.valueOf(finderObject2.f164794id), v412);
                        }
                    }
                } catch (Throwable unused) {
                    Log.m105920e("MicroMsg.TaskBarViewPresenter", "FinderLiveMultiTaskData parse failed");
                }
            }
            if (!hashMap2.isEmpty()) {
                long currentTimeMillis3 = System.currentTimeMillis() / ((long) 1000);
                if (currentTimeMillis3 - taskBarViewPresenter.f206532k <= ((long) taskBarViewPresenter.f206533l)) {
                    Log.m105924i("MicroMsg.TaskBarViewPresenter", "not check because of interval: " + taskBarViewPresenter.f206533l + " last:" + taskBarViewPresenter.f206532k);
                } else {
                    taskBarViewPresenter.f206532k = currentTimeMillis3;
                    Log.m105924i("MicroMsg.TaskBarViewPresenter", "start check live status");
                    C7335d c = C86312j.m106911c(C60606n.class);
                    C87412m.m108593f(c, "getService(IFinderLiveFeatureService::class.java)");
                    C60606n nVar = (C60606n) c;
                    Collection<C64766v41> values = hashMap2.values();
                    C87412m.m108593f(values, "objId2LiveDataNotEnded.values");
                    ArrayList arrayList = new ArrayList(C36907w.m41090l(values, 10));
                    for (C64766v41 v413 : values) {
                        FinderObject finderObject3 = v413.f185835n;
                        Long valueOf = Long.valueOf(finderObject3 != null ? finderObject3.f164794id : 0);
                        FinderObject finderObject4 = v413.f185835n;
                        if (finderObject4 == null || (str = finderObject4.objectNonceId) == null) {
                            str = "";
                        }
                        arrayList.add(new Pair(valueOf, str));
                    }
                    nVar.mo85085sN(C110818d0.m150900B0(arrayList), new C71322c0(taskBarViewPresenter, hashMap2, hashMap), (Context) null);
                }
            }
            Log.m105924i("MicroMsg.TaskBarViewPresenter", "onStartToPull done " + (System.currentTimeMillis() - currentTimeMillis));
            return;
        }
        taskBarView.f206482P1 = false;
    }

    /* renamed from: f */
    public void mo98169f() {
        MMFragmentActivity mMFragmentActivity = this.f206435A;
        if (mMFragmentActivity != null) {
            Pair<Integer, Integer> a = C76378a.m91808a(mMFragmentActivity);
            ((FrameLayout.LayoutParams) this.f206454p.getLayoutParams()).setMargins(((Integer) a.first).intValue(), 0, ((Integer) a.second).intValue(), 0);
            this.f206453o.requestLayout();
            View view = this.f206453o;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "updateActionBarSafeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "updateActionBarSafeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: g */
    public final void mo98170g() {
        View view;
        if (this.f206455q != null && (view = this.f206452n) != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            Log.m105925i("MicroMsg.AppBrandDesktopContainer", "alvinluo updateFakeActionBarLeftMargin location x: %d, y: %d", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
            if (Build.VERSION.SDK_INT >= 24 ? this.f206435A.isInMultiWindowMode() : false) {
                int dimensionPixelSize = getResources().getDimensionPixelSize(C0966R.dimen.f3633r);
                ((LinearLayout.LayoutParams) this.f206455q.getLayoutParams()).leftMargin = dimensionPixelSize;
                Log.m105925i("MicroMsg.AppBrandDesktopContainer", "alvinluo updateFakeActionBarLeftMargin leftMargin: %d", Integer.valueOf(dimensionPixelSize));
                if (this.f206455q.getParent() != null) {
                    this.f206455q.getParent().requestLayout();
                }
                View view2 = this.f206453o;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "updateFakeActionBarLeftMargin", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "updateFakeActionBarLeftMargin", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public int getAnimationScrollOffset() {
        return this.f206445d.f206577P;
    }

    public Rect getBackUpFooterRect() {
        return this.f206449h;
    }

    public DynamicBgContainer getBackgroundGLSurfaceContainer() {
        return this.f206447f;
    }

    public View getBackgroundGLSurfaceView() {
        return this.f206447f.getDynamicBgSurfaceView();
    }

    public View getBackgroundGradientView() {
        return this.f206448g;
    }

    public AppBrandDesktopContainerView getDesktopContainerView() {
        return this.f206464z;
    }

    public int getExtraBottomHeight() {
        return this.f206439E;
    }

    public LinearLayout getRootLayout() {
        return this.f206450i;
    }

    public C71326f getTaskBarView() {
        return this.f206446e;
    }

    public int getViewHeight() {
        return this.f206438D;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.m105924i("MicroMsg.AppBrandDesktopContainer", "alvinluo desktopContainer onAttachedToWindow");
        IListener iListener = this.f206444J;
        if (iListener != null) {
            iListener.alive();
        }
        GetMainTabUnReadCountEvent getMainTabUnReadCountEvent = new GetMainTabUnReadCountEvent();
        getMainTabUnReadCountEvent.publish();
        Log.m105925i("MicroMsg.AppBrandDesktopContainer", "alvinluo updateUnReadCount unReadCount: %d", Integer.valueOf(getMainTabUnReadCountEvent.f193652d.f193653a));
        String string = getContext().getResources().getString(C0966R.string.a0u);
        if (getMainTabUnReadCountEvent.f193652d.f193653a > 0) {
            if (!this.f206442H) {
                string = string + " ";
            }
            string = string + "(" + getMainTabUnReadCountEvent.f193652d.f193653a + ")";
        }
        setActionBarTitle(string);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.m105924i("MicroMsg.AppBrandDesktopContainer", "alvinluo desktopContainer onDetachedFromWindow");
        IListener iListener = this.f206444J;
        if (iListener != null) {
            iListener.dead();
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = getResources().getConfiguration().orientation;
        Log.m105927v("MicroMsg.AppBrandDesktopContainer", "alvinluo onMeasure orientation: %d, closeHeight: %d, extraBottomHeight: %d", Integer.valueOf(getResources().getConfiguration().orientation), 0, Integer.valueOf(this.f206439E));
        if (this.f206436B) {
            int measuredHeight = ((((ViewGroup) getParent()).getMeasuredHeight() - 0) - this.f206439E) - this.f206440F;
            i3 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            this.f206438D = measuredHeight;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        }
        super.onMeasure(i, i3);
        if (getMeasuredWidth() != this.f206437C) {
            Log.m105925i("MicroMsg.AppBrandDesktopContainer", "alvinluo onMeasure width new: %d, old: %d", Integer.valueOf(getMeasuredWidth()), Integer.valueOf(this.f206437C));
            this.f206437C = getMeasuredWidth();
            Log.m105925i("MicroMsg.AppBrandDesktopContainer", "alvinluo initViewPivot getMeasuredWidth: %d", Integer.valueOf(getMeasuredWidth()));
            this.f206450i.setPivotX(((float) getMeasuredWidth()) / 2.0f);
            this.f206450i.setPivotY((float) C75044y4.m89989a(getContext()));
            mo98166c();
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (this.f206445d != null && (motionEvent.getAction() == 0 || motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f206445d.onTouch(view, motionEvent);
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }

    public void setActionBar(View view) {
        this.f206452n = view;
        mo98170g();
    }

    public void setActivity(MMFragmentActivity mMFragmentActivity) {
        this.f206435A = mMFragmentActivity;
    }

    public void setAnimController(C71323d dVar) {
        C71331l lVar = (C71331l) dVar;
        this.f206445d = lVar;
        TaskBarView taskBarView = this.f206446e;
        if (taskBarView != null && lVar != null && !((LinkedList) lVar.f206608n).contains(taskBarView)) {
            ((LinkedList) lVar.f206608n).add(taskBarView);
        }
    }

    public void setDynamicBackgroundView(View view) {
        DynamicBgContainer dynamicBgContainer = (DynamicBgContainer) view;
        GradientColorBackgroundView gradientColorBackgroundView = this.f206448g;
        this.f206447f = dynamicBgContainer;
        this.f206448g = gradientColorBackgroundView;
        C71331l lVar = this.f206445d;
        if (lVar != null) {
            Log.m105924i("MicroMsg.TaskBarAnimController", "setBackgroundView");
            lVar.f206610p = dynamicBgContainer;
            lVar.f206615t = gradientColorBackgroundView;
            dynamicBgContainer.setGradientBgView(gradientColorBackgroundView);
        }
    }

    public void setExtraBottomHeight(int i) {
        this.f206439E = i;
    }

    public void setFixedHeight(boolean z) {
        this.f206436B = z;
    }

    public void setFoldBanner(View view) {
        C71331l lVar = this.f206445d;
        if (lVar != null) {
            lVar.f206616u = view;
        }
    }

    public TaskBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo98165b(context);
    }

    public TaskBarContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo98165b(context);
    }
}
