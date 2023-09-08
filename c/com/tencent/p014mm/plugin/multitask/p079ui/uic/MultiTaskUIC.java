package com.tencent.p014mm.plugin.multitask.p079ui.uic;

import aa2.C103343n;
import aa2.C112765c;
import aa2.C39530r;
import aa2.C67022b;
import aa2.C91981a;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.os.Vibrator;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import androidx.recyclerview.widget.RecyclerView;
import ba2.C0261e;
import ba2.C39748b;
import bl3.C16795g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.dynamicbackground.view.GradientColorBackgroundView;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.NewChattingTabUI;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.multitask.C105923s;
import com.tencent.p014mm.plugin.multitask.C56888q;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.multitask.p079ui.MultiTaskPanelContainer;
import com.tencent.p014mm.plugin.multitask.p079ui.p888bg.DynamicBgContainer;
import com.tencent.p014mm.plugin.multitask.p079ui.panel.MinusScreenPanel;
import com.tencent.p014mm.plugin.multitask.p079ui.panel.MultiTaskContainerView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import dm2.C45416b;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import h92.C108178b;
import hn3.C108252a;
import iy3.C60641c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import ky2.C10432i;
import m92.C61444a;
import n92.C117617a;
import p640ox.C77049b;
import p92.C117997g;
import r92.C110555b;
import rx3.C13598b0;
import s92.C77636b;
import sx3.C64197v;
import te3.C110961f13;
import te3.C110964i13;
import te3.C27675g13;
import v92.C65558a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC */
public final class MultiTaskUIC extends UIComponent implements C105923s.C30306a, C110555b.C110556a, C67022b {

    /* renamed from: E */
    public static final C115597a f346667E = new C115597a((C8480h) null);

    /* renamed from: F */
    public static int f346668F = 0;

    /* renamed from: G */
    public static int f346669G = 0;

    /* renamed from: H */
    public static int f346670H = 0;

    /* renamed from: I */
    public static int f346671I = 0;

    /* renamed from: J */
    public static int f346672J = 0;

    /* renamed from: K */
    public static int f346673K = 0;

    /* renamed from: L */
    public static int f346674L = 0;

    /* renamed from: M */
    public static int f346675M = 0;

    /* renamed from: N */
    public static int f346676N = 0;

    /* renamed from: P */
    public static int f346677P = 0;

    /* renamed from: Q */
    public static int f346678Q = 0;

    /* renamed from: Q0 */
    public static float f346679Q0 = C76577a.m92165p(MMApplicationContext.getContext());

    /* renamed from: R */
    public static int f346680R = 0;

    /* renamed from: R0 */
    public static float f346681R0 = 1.6666666f;

    /* renamed from: S */
    public static int f346682S = 0;

    /* renamed from: S0 */
    public static float f346683S0 = 1.3333334f;

    /* renamed from: T */
    public static int f346684T = 0;

    /* renamed from: U */
    public static int f346685U = 0;

    /* renamed from: V */
    public static int f346686V = 0;

    /* renamed from: W */
    public static int f346687W = 0;

    /* renamed from: X */
    public static int f346688X = 0;

    /* renamed from: Y */
    public static int f346689Y = 0;

    /* renamed from: Z */
    public static int f346690Z = 0;

    /* renamed from: p0 */
    public static int f346691p0 = 0;

    /* renamed from: x0 */
    public static int f346692x0 = 0;

    /* renamed from: y0 */
    public static float f346693y0 = 0.2f;

    /* renamed from: A */
    public final MultiTaskUIC$homeTabChangedListener$1 f346694A = new MultiTaskUIC$homeTabChangedListener$1(this, C40008f.f107254d);

    /* renamed from: B */
    public Runnable f346695B;

    /* renamed from: C */
    public boolean f346696C;

    /* renamed from: D */
    public Bundle f346697D;

    /* renamed from: d */
    public C110555b f346698d;

    /* renamed from: e */
    public View f346699e;

    /* renamed from: f */
    public MinusScreenPanel f346700f;

    /* renamed from: g */
    public ImageView f346701g;

    /* renamed from: h */
    public int f346702h = 6;

    /* renamed from: i */
    public int f346703i = 6;

    /* renamed from: j */
    public int f346704j = 9;

    /* renamed from: n */
    public int f346705n = 3;

    /* renamed from: o */
    public C67022b.C67023a f346706o;

    /* renamed from: p */
    public int f346707p;

    /* renamed from: q */
    public int f346708q;

    /* renamed from: r */
    public int f346709r;

    /* renamed from: s */
    public MultiTaskContainerView f346710s;

    /* renamed from: t */
    public View f346711t;

    /* renamed from: u */
    public Runnable f346712u;

    /* renamed from: v */
    public boolean f346713v;

    /* renamed from: w */
    public boolean f346714w;

    /* renamed from: x */
    public DynamicBgContainer f346715x;

    /* renamed from: y */
    public GradientColorBackgroundView f346716y;

    /* renamed from: z */
    public final MMHandler f346717z = new MMHandler(Looper.getMainLooper());

    /* renamed from: com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC$a */
    public static final class C115597a {
        public C115597a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo175718a(int i, int i2) {
            int i3 = C110555b.f330647P;
            MultiTaskUIC.f346689Y = C110555b.f330647P;
            MultiTaskUIC.f346670H = i;
            MultiTaskUIC.f346671I = i2;
            MultiTaskUIC.f346668F = Math.min(MultiTaskUIC.f346670H, MultiTaskUIC.f346671I);
            MultiTaskUIC.f346669G = Math.max(MultiTaskUIC.f346670H, MultiTaskUIC.f346671I);
            C115597a aVar = MultiTaskUIC.f346667E;
            C115597a aVar2 = MultiTaskUIC.f346667E;
            C115597a aVar3 = MultiTaskUIC.f346667E;
            MultiTaskUIC.f346693y0 = ((float) C74942w4.m89784a(MMApplicationContext.getContext(), 59)) / ((float) MultiTaskUIC.f346668F);
            MultiTaskUIC.f346672J = C74942w4.m89784a(MMApplicationContext.getContext(), 12);
            MultiTaskUIC.f346673K = C74942w4.m89784a(MMApplicationContext.getContext(), 14);
            MultiTaskUIC.f346674L = C74942w4.m89784a(MMApplicationContext.getContext(), 20);
            MultiTaskUIC.f346691p0 = C74942w4.m89784a(MMApplicationContext.getContext(), 44);
            MultiTaskUIC.f346690Z = C74942w4.m89784a(MMApplicationContext.getContext(), 32) - MultiTaskUIC.f346672J;
            int b = C60641c.m70921b(((float) ((MultiTaskUIC.f346668F - MultiTaskUIC.f346689Y) - (MultiTaskUIC.f346673K * 2))) / 2.0f);
            MultiTaskUIC.f346675M = b;
            int i4 = b - MultiTaskUIC.f346672J;
            MultiTaskUIC.f346680R = i4;
            int b2 = C60641c.m70921b(((float) i4) * MultiTaskUIC.f346683S0);
            MultiTaskUIC.f346682S = b2;
            float a = ((float) (b2 + MultiTaskUIC.f346672J + MultiTaskUIC.f346690Z)) + (((float) MultiTaskUIC.f346691p0) * MultiTaskUIC.f346679Q0) + ((float) C74942w4.m89784a(MMApplicationContext.getContext(), 16));
            MultiTaskUIC.f346681R0 = a / ((float) MultiTaskUIC.f346675M);
            MultiTaskUIC.f346676N = C60641c.m70921b(a);
            int b3 = C60641c.m70921b(((float) MultiTaskUIC.f346675M) * 1.5f);
            MultiTaskUIC.f346677P = b3;
            MultiTaskUIC.f346678Q = C60641c.m70921b(((float) b3) * MultiTaskUIC.f346681R0);
            int i5 = MultiTaskUIC.f346677P - MultiTaskUIC.f346672J;
            MultiTaskUIC.f346684T = i5;
            MultiTaskUIC.f346685U = C60641c.m70921b(((float) i5) * MultiTaskUIC.f346683S0);
            int a2 = C60641c.m70920a(((double) ((MultiTaskUIC.f346669G - MultiTaskUIC.f346678Q) - (MultiTaskUIC.f346672J * 6))) / 2.0d);
            MultiTaskUIC.f346686V = a2;
            if (a2 < 0) {
                MultiTaskUIC.f346686V = 0;
            }
            MultiTaskUIC.f346687W = C60641c.m70920a((((double) ((MultiTaskUIC.f346668F - MultiTaskUIC.f346689Y) - MultiTaskUIC.f346677P)) / 2.0d) - ((double) MultiTaskUIC.f346673K));
            MultiTaskUIC.f346688X = C60641c.m70920a(((double) ((MultiTaskUIC.f346669G - MultiTaskUIC.f346676N) - (MultiTaskUIC.f346672J * 8))) / 2.0d);
            Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "initMultiTaskViewParams width:" + MultiTaskUIC.f346675M + " height:" + MultiTaskUIC.f346676N + " oneItemContentWidth:" + MultiTaskUIC.f346677P + " oneItemContentHeight:" + MultiTaskUIC.f346678Q);
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC$b */
    public static final class C115598b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MultiTaskUIC f346718d;

        public C115598b(MultiTaskUIC multiTaskUIC) {
            this.f346718d = multiTaskUIC;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/multitask/ui/uic/MultiTaskUIC$createMultiTaskPanelView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C110555b bVar = this.f346718d.f346698d;
            boolean z = false;
            if (bVar != null && bVar.mo162012f()) {
                z = true;
            }
            this.f346718d.mo175715l3(true, true, false, false, false, !z, false, z);
            if (z) {
                this.f346718d.mo175711g3(1);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskUIC$createMultiTaskPanelView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC$c */
    public static final class C115599c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MultiTaskUIC f346719d;

        public C115599c(MultiTaskUIC multiTaskUIC) {
            this.f346719d = multiTaskUIC;
        }

        public final void run() {
            MinusScreenPanel minusScreenPanel = this.f346719d.f346700f;
            if (minusScreenPanel != null) {
                minusScreenPanel.mo183767j("MultiTaskForSnapshotMinusScreen");
            }
            this.f346719d.mo90993a(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC$d */
    public static final class C115600d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MultiTaskUIC f346720d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C115600d(MultiTaskUIC multiTaskUIC) {
            super(0);
            this.f346720d = multiTaskUIC;
        }

        public Object invoke() {
            this.f346720d.mo175714k3();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTaskUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: m3 */
    public static /* synthetic */ void m162482m3(MultiTaskUIC multiTaskUIC, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, Object obj) {
        int i2 = i;
        boolean z9 = (i2 & 1) != 0 ? true : z;
        boolean z15 = false;
        boolean z16 = (i2 & 2) != 0 ? false : z2;
        boolean z17 = (i2 & 4) != 0 ? false : z3;
        boolean z18 = (i2 & 8) != 0 ? false : z4;
        boolean z19 = (i2 & 16) != 0 ? false : z5;
        boolean z25 = (i2 & 32) != 0 ? false : z6;
        boolean z26 = (i2 & 64) != 0 ? false : z7;
        if ((i2 & 128) == 0) {
            z15 = z8;
        }
        multiTaskUIC.mo175715l3(z9, z16, z17, z18, z19, z25, z26, z15);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.mo183761d(0, "MultiTaskForMinusScreen");
     */
    /* renamed from: B4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo57273B4() {
        /*
            r4 = this;
            com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel r0 = r4.f346700f
            r1 = 1
            if (r0 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r3 = "MultiTaskForMinusScreen"
            p92.g r0 = r0.mo183761d(r2, r3)
            if (r0 == 0) goto L_0x001a
            aa2.c r0 = (aa2.C112765c) r0
            java.util.ArrayList<v92.a> r0 = r0.f337657h
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.mo57273B4():boolean");
    }

    /* renamed from: D1 */
    public boolean mo162047D1() {
        if (!mo57273B4() || mo90994b0()) {
            return true;
        }
        Log.m105918d("MicroMsg.MultiTask.MultiTaskUIC", "needExpand, false!");
        return false;
    }

    /* renamed from: E */
    public boolean mo57274E(String str) {
        boolean z;
        C117997g d;
        C87412m.m108594g(str, "id");
        MinusScreenPanel minusScreenPanel = this.f346700f;
        if (minusScreenPanel != null && (d = minusScreenPanel.mo183761d(0, "MultiTaskForMinusScreen")) != null) {
            Iterator<C65558a> it = ((C112765c) d).f337657h.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C65558a next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    C64197v.m75542k();
                    throw null;
                } else if (next.f188631d.field_id.equals(str)) {
                    z = true;
                    break;
                } else {
                    i = i2;
                }
            }
            Log.m105925i("MicroMsg.MultiTask.MultiTaskUIC", "hasCurrentMultiInfo, id:%s, ret:%b", str, Boolean.valueOf(z));
            return z;
        }
        z = false;
        Log.m105925i("MicroMsg.MultiTask.MultiTaskUIC", "hasCurrentMultiInfo, id:%s, ret:%b", str, Boolean.valueOf(z));
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if ((android.os.Build.VERSION.SDK_INT < 23 || p206nj.C88956h.m111064e()) == false) goto L_0x0028;
     */
    /* renamed from: F3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo175705F3(boolean r5) {
        /*
            r4 = this;
            boolean r0 = r4.f346696C
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.String r0 = "MicroMsg.MultiTask.MultiTaskUIC"
            java.lang.String r1 = "virbg: switchToStaticBg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r0 = 0
            r4.f346696C = r0
            com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer r1 = r4.f346715x
            r2 = 1
            if (r1 == 0) goto L_0x0027
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r1 < r3) goto L_0x0023
            boolean r1 = p206nj.C88956h.m111064e()
            if (r1 != 0) goto L_0x0023
            r1 = 0
            goto L_0x0024
        L_0x0023:
            r1 = 1
        L_0x0024:
            if (r1 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            if (r2 == 0) goto L_0x003c
            com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView r1 = r4.f346716y
            if (r1 != 0) goto L_0x002f
            goto L_0x0032
        L_0x002f:
            r1.setVisibility(r0)
        L_0x0032:
            com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView r0 = r4.f346716y
            if (r0 != 0) goto L_0x0037
            goto L_0x003c
        L_0x0037:
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
        L_0x003c:
            if (r5 == 0) goto L_0x0059
            java.lang.Runnable r5 = r4.f346695B
            if (r5 == 0) goto L_0x004a
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r4.f346717z
            r0.removeCallbacks(r5)
            r5 = 0
            r4.f346695B = r5
        L_0x004a:
            aa2.m r5 = new aa2.m
            r5.<init>(r4)
            r4.f346695B = r5
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r4.f346717z
            r1 = 500(0x1f4, double:2.47E-321)
            r0.postDelayed(r5, r1)
            goto L_0x0060
        L_0x0059:
            com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer r5 = r4.f346715x
            if (r5 == 0) goto L_0x0060
            r5.mo96167b()
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.mo175705F3(boolean):void");
    }

    /* renamed from: G3 */
    public final void mo175706G3(int i) {
        Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "updateLoadingMode, loadingMode:" + i);
        MultiTaskContainerView multiTaskContainerView = this.f346710s;
        if (multiTaskContainerView != null) {
            MultiTaskContainerView.f162966q = i;
            multiTaskContainerView.invalidate();
        }
    }

    /* renamed from: L */
    public void mo162048L(float f) {
        MultiTaskContainerView multiTaskContainerView;
        if (!this.f346713v && (!mo90994b0()) && (multiTaskContainerView = this.f346710s) != null) {
            multiTaskContainerView.f162972h = f;
            multiTaskContainerView.invalidate();
        }
    }

    /* renamed from: P */
    public String mo57275P(String str, int i, int i2) {
        C117997g d;
        C112765c cVar;
        int G3;
        RecyclerView.C16631z I0;
        View view;
        C87412m.m108594g(str, "id");
        MinusScreenPanel minusScreenPanel = this.f346700f;
        if (minusScreenPanel == null || (d = minusScreenPanel.mo183761d(0, "MultiTaskForMinusScreen")) == null || i == (G3 = cVar.mo164517G3(str)) || G3 < 0 || G3 >= (cVar = (C112765c) d).f337657h.size()) {
            return "";
        }
        View view2 = null;
        if (i2 != 4) {
            WxRecyclerView wxRecyclerView = cVar.f337659j;
            RecyclerView.C16631z I02 = wxRecyclerView != null ? wxRecyclerView.mo17023I0(G3 + 1) : null;
            if (I02 != null) {
                view2 = I02.f44854d;
            }
        } else if (cVar.f337657h.size() <= 2) {
            WxRecyclerView wxRecyclerView2 = cVar.f337659j;
            if (!(wxRecyclerView2 == null || (I0 = wxRecyclerView2.mo17023I0(1)) == null || (view = I0.f44854d) == null)) {
                view2 = view.findViewById(C0966R.C0970id.h3h);
            }
        } else {
            view2 = cVar.getRootView().findViewById(C0966R.C0970id.h3c);
        }
        return C0261e.f806a.mo301a(view2);
    }

    /* renamed from: Y1 */
    public View mo90992Y1(View view, C77636b bVar, C67022b.C67023a aVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        View j;
        View view2 = view;
        Class cls = C105923s.class;
        C87412m.m108594g(view2, "launcherContainer");
        Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "create panel launcher");
        this.f346699e = view2;
        this.f346715x = (DynamicBgContainer) bVar;
        View view3 = null;
        this.f346716y = bVar != null ? bVar.getGradientBgView() : null;
        DynamicBgContainer dynamicBgContainer = this.f346715x;
        if (dynamicBgContainer != null) {
            dynamicBgContainer.mo96168c();
        }
        this.f346706o = aVar;
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        this.f346701g = (supportActionBar == null || (j = supportActionBar.mo91099j()) == null) ? null : (ImageView) j.findViewById(C0966R.C0970id.f5471g1);
        ((C105923s) C86312j.m106911c(cls)).xx0(2, C39530r.class);
        ((C105923s) C86312j.m106911c(cls)).xx0(0, C112765c.class);
        ((C105923s) C86312j.m106911c(cls)).xx0(1, C91981a.class);
        ((C105923s) C86312j.m106911c(cls)).xx0(1048576, C103343n.class);
        ((C77049b) C86312j.m106911c(C77049b.class)).mo72352Rp(getActivity(), new C45416b(C64197v.m75537f("WebViewUI", "FinderLongVideoTimelineUI", "NoteEditorUI", "MiniQBReaderUI", "AppAttachDownloadUI", "ChooseMsgFileShowUI", "TopStoryFSVideoUI", "TopStoryMultiTaskListVideoUI", "LuggageGameWebViewUI"), C110964i13.class, 5, true));
        ((C105923s) C86312j.m106911c(cls)).getClass();
        C105923s.f315123o = this;
        if (this.f346698d == null) {
            C110555b bVar2 = new C110555b(getActivity());
            bVar2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "create panel view");
            f346667E.mo175718a(C76577a.m92145A(MMApplicationContext.getContext()), C76577a.m92159j(MMApplicationContext.getContext()));
            if (this.f346700f == null) {
                this.f346700f = new MinusScreenPanel(getActivity(), this.f346697D);
            }
            View inflate = getActivity().getLayoutInflater().inflate(C0966R.C0971layout.bi_, (ViewGroup) null);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) inflate;
            View findViewById = frameLayout.findViewById(C0966R.C0970id.h5h);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type com.tencent.mm.plugin.multitask.ui.panel.MultiTaskContainerView");
            this.f346710s = (MultiTaskContainerView) findViewById;
            frameLayout.setDrawingCacheEnabled(false);
            MultiTaskContainerView multiTaskContainerView = this.f346710s;
            this.f346711t = multiTaskContainerView != null ? multiTaskContainerView.findViewById(C0966R.C0970id.h3d) : null;
            MinusScreenPanel minusScreenPanel = this.f346700f;
            if (minusScreenPanel != null) {
                if (minusScreenPanel.f356643h == null) {
                    View inflate2 = minusScreenPanel.f356639d.getLayoutInflater().inflate(C0966R.C0971layout.bia, (ViewGroup) null);
                    MultiTaskPanelContainer multiTaskPanelContainer = (MultiTaskPanelContainer) inflate2.findViewById(C0966R.C0970id.h3_);
                    minusScreenPanel.f356642g = multiTaskPanelContainer;
                    if (multiTaskPanelContainer != null) {
                        MultiTaskInfo multiTaskInfo = new MultiTaskInfo();
                        multiTaskInfo.field_id = "MultiTaskForMinusScreen";
                        C117997g f = minusScreenPanel.mo183763f(multiTaskInfo);
                        if (f != null) {
                            f.getRootView().setPadding(0, 0, f346689Y, 0);
                            ((C112765c) f).f337664r = minusScreenPanel;
                        }
                        Bundle bundle = minusScreenPanel.f356640e;
                        C61444a vx02 = ((C105923s) C86312j.m106911c(cls)).vx0();
                        if (vx02 != null) {
                            vx02.observe((C0125s) minusScreenPanel.f356639d, minusScreenPanel);
                        }
                        ((C10432i) C86312j.m106911c(C10432i.class)).mo10739MV(minusScreenPanel.f346650p);
                        minusScreenPanel.f346649o.alive();
                        C117997g d = minusScreenPanel.mo183761d(0, "MultiTaskForMinusScreen");
                        if (d != null) {
                            ((C112765c) d).onCreate(bundle);
                        }
                        minusScreenPanel.onStart();
                        minusScreenPanel.onResume();
                    }
                    minusScreenPanel.f356643h = inflate2;
                }
                view3 = minusScreenPanel.f356643h;
            }
            frameLayout.addView(view3, new ViewGroup.LayoutParams(-1, -1));
            float f2 = 1.0f;
            if (!BuildInfo.IS_FLAVOR_RED) {
                f2 = ((C32735h) C86312j.m106911c(C32735h.class)).mo58785xe(C32735h.C32737c.clicfg_multitask_slide_factor, 1.0f);
            }
            Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "slideFractor: " + f2);
            int i = (int) (f2 * ((float) (f346670H - f346689Y)));
            frameLayout.setPadding(0, 0, i, 0);
            bVar2.addView(view2, 0, new ViewGroup.LayoutParams(-1, -1));
            bVar2.addView(frameLayout, 1, new ViewGroup.LayoutParams(-1, -1));
            Interpolator loadInterpolator = AnimationUtils.loadInterpolator(bVar2.getContext(), C0966R.C0968anim.f2435cy);
            C110555b.C110558c cVar = new C110555b.C110558c();
            C87412m.m108593f(loadInterpolator, "interpolator");
            Context context = bVar2.getContext();
            C87412m.m108593f(context, "forParent.context");
            bVar2.f330664d = new C108178b(context, bVar2, cVar, loadInterpolator, (C8480h) null);
            Context context2 = bVar2.getContext();
            float g = (context2 == null || (resources = context2.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? C76577a.m92156g(bVar2.getContext()) : displayMetrics.density;
            float f3 = ((float) 100) * g;
            float f4 = ((float) 300) * g;
            C108178b bVar3 = bVar2.f330664d;
            if (bVar3 != null) {
                bVar3.f323920n = f3;
            }
            if (bVar3 != null) {
                bVar3.f323919m = f4;
            }
            Object systemService = bVar2.getContext().getSystemService("vibrator");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            bVar2.f330668h = (Vibrator) systemService;
            bVar2.setSlideLeft(false);
            bVar2.setPanelWidth(f346670H);
            bVar2.setPanelExpose(f346689Y);
            bVar2.setExtraSlideRange(i);
            if (C85875k4.m106211z()) {
                bVar2.setCoveredFadeColor(5066061);
            } else {
                bVar2.setCoveredFadeColor(3618127);
            }
            bVar2.setOverlayed(true);
            synchronized (bVar2.f330670j) {
                bVar2.f330670j.add(this);
            }
            bVar2.setFadeOnClickListener(new C115598b(this));
            bVar2.mo162022j(1, false);
            this.f346698d = bVar2;
        }
        return this.f346698d;
    }

    /* renamed from: Z */
    public void mo162049Z(int i, int i2) {
        C117997g d;
        f346667E.mo175718a(i, i2);
        MinusScreenPanel minusScreenPanel = this.f346700f;
        if (minusScreenPanel != null && (d = minusScreenPanel.mo183761d(0, "MultiTaskForMinusScreen")) != null) {
            ((C112765c) d).mo164519J3();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a0, code lost:
        r4 = (r4 = (com.tencent.p014mm.p136ui.conversation.MainUI) r4.mo101375O7().f214445o.get(0)).f219476o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00aa, code lost:
        if (r4 == true) goto L_0x00ae;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo90993a(boolean r9) {
        /*
            r8 = this;
            r92.b r0 = r8.f346698d
            if (r0 == 0) goto L_0x00bd
            boolean r1 = r0.getCanSlide()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "enableScroll: "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = ", canSlide:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = ", orientation:"
            r2.append(r3)
            int r3 = r8.f346707p
            r2.append(r3)
            java.lang.String r3 = ", currentTabIndex:"
            r2.append(r3)
            int r3 = r8.f346708q
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.MultiTask.MultiTaskUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            int r2 = r8.f346707p
            r4 = 2
            r5 = 0
            if (r2 == r4) goto L_0x004a
            boolean r2 = r8.mo57273B4()
            if (r2 != 0) goto L_0x004a
            int r2 = r8.f346708q
            if (r2 == 0) goto L_0x006a
        L_0x004a:
            boolean r2 = r8.mo90994b0()
            if (r2 != 0) goto L_0x006a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "enableScroll false, isDataEmpty: "
            r2.append(r4)
            boolean r4 = r8.mo57273B4()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            r2 = 0
            goto L_0x006b
        L_0x006a:
            r2 = r9
        L_0x006b:
            boolean r4 = r8.mo175712i3()
            if (r4 == 0) goto L_0x007d
            boolean r4 = r8.mo90994b0()
            if (r4 == 0) goto L_0x007d
            java.lang.String r2 = "enableScroll false, showSnapshot Already"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            r2 = 0
        L_0x007d:
            aa2.b$a r4 = r8.f346706o
            r6 = 1
            if (r4 == 0) goto L_0x00ad
            com.tencent.mm.ui.LauncherUI r4 = com.tencent.p014mm.p136ui.LauncherUI.getInstance()
            if (r4 == 0) goto L_0x00a9
            com.tencent.mm.ui.MainTabUI r7 = r4.mo101375O7()
            if (r7 == 0) goto L_0x00a9
            com.tencent.mm.ui.MainTabUI r4 = r4.mo101375O7()
            java.util.HashMap<java.lang.Integer, com.tencent.mm.ui.MMFragment> r4 = r4.f214445o
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r4 = r4.get(r7)
            com.tencent.mm.ui.conversation.MainUI r4 = (com.tencent.p014mm.p136ui.conversation.MainUI) r4
            if (r4 == 0) goto L_0x00a9
            com.tencent.mm.ui.conversation.ConversationListView r4 = r4.f219476o
            if (r4 == 0) goto L_0x00a9
            boolean r4 = r4.mo103725k()
            goto L_0x00aa
        L_0x00a9:
            r4 = 0
        L_0x00aa:
            if (r4 != r6) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r6 = 0
        L_0x00ae:
            if (r6 == 0) goto L_0x00b6
            java.lang.String r2 = "enableScroll false, isHeaderOpen"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            goto L_0x00b7
        L_0x00b6:
            r5 = r2
        L_0x00b7:
            if (r1 != r9) goto L_0x00ba
            return
        L_0x00ba:
            r0.setCanSlide(r5)
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.mo90993a(boolean):void");
    }

    /* renamed from: a3 */
    public void mo162050a3(View view, C110555b.C110557b bVar, C110555b.C110557b bVar2) {
        C110555b.C110557b bVar3 = C110555b.C110557b.COLLAPSED;
        Log.m105918d("MicroMsg.MultiTask.MultiTaskUIC", "onPanelStateChanged, previousState:" + bVar + ", newState:" + bVar2);
        if (bVar2 != bVar && bVar2 == C110555b.C110557b.DRAGGING) {
            if (!mo90994b0() && !mo175712i3() && bVar == bVar3) {
                mo175717o3();
            }
            C67022b.C67023a aVar = this.f346706o;
            if (aVar != null) {
                ((NewChattingTabUI.C73121a) aVar).mo101511a(1, mo90994b0() ^ true ? 1 : 0);
            }
        }
        if (bVar2 != bVar && bVar2 == bVar3) {
            DynamicBgContainer dynamicBgContainer = this.f346715x;
            if (dynamicBgContainer != null) {
                dynamicBgContainer.mo96168c();
            }
            mo175705F3(false);
            f346692x0 = 0;
        }
        MinusScreenPanel minusScreenPanel = this.f346700f;
        C112765c cVar = null;
        C16795g d = minusScreenPanel != null ? minusScreenPanel.mo183761d(0, "MultiTaskForMinusScreen") : null;
        if (d instanceof C112765c) {
            cVar = (C112765c) d;
        }
        if (bVar2 == bVar3 && !mo57273B4()) {
            ImageView imageView = this.f346701g;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            MultiTaskContainerView multiTaskContainerView = this.f346710s;
            if (multiTaskContainerView != null) {
                multiTaskContainerView.f162972h = 0.0f;
                multiTaskContainerView.invalidate();
            }
            f346692x0 = 0;
            if (cVar != null) {
                cVar.mo164518I3(view, 0.0f, 0.0f);
            }
            if (this.f346714w) {
                this.f346704j = 3;
                mo175711g3(1);
                this.f346714w = false;
            }
        } else if (bVar2 == C110555b.C110557b.EXPANDED) {
            ImageView imageView2 = this.f346701g;
            if (imageView2 != null) {
                imageView2.setAlpha(0.0f);
            }
            MultiTaskContainerView multiTaskContainerView2 = this.f346710s;
            if (multiTaskContainerView2 != null) {
                multiTaskContainerView2.f162972h = 1.0f;
                multiTaskContainerView2.invalidate();
            }
            f346692x0 = 0;
            if (cVar != null) {
                cVar.mo164518I3(view, 1.0f, 0.0f);
            }
            if (this.f346714w) {
                this.f346704j = 4;
                mo175711g3(1);
                this.f346714w = false;
            }
        }
    }

    /* renamed from: b0 */
    public boolean mo90994b0() {
        C110555b bVar = this.f346698d;
        return bVar != null && bVar.getCurItem() == 0;
    }

    /* renamed from: c3 */
    public boolean mo175707c3(int i) {
        Class cls = C10432i.class;
        boolean e = ((C10432i) C86312j.m106911c(cls)).mo10750e();
        int Oh0 = ((C10432i) C86312j.m106911c(cls)).Oh0();
        int fd = ((C10432i) C86312j.m106911c(cls)).mo10751fd();
        int Mn = ((C10432i) C86312j.m106911c(cls)).mo10740Mn();
        Log.m105925i("MicroMsg.MultiTask.MinusScreenPanel", "onTeenModeDataChanged isTeenMode: %b, miniProgramOption: %d, bizAcctOption: %d, finderOption: %d", Boolean.valueOf(e), Integer.valueOf(Oh0), Integer.valueOf(fd), Integer.valueOf(Mn));
        return e && ((Oh0 == 2 && i == 1) || ((fd == 2 && i == 2) || (Mn == 2 && i == 22)));
    }

    /* renamed from: d3 */
    public void mo175708d3(MultiTaskInfo multiTaskInfo) {
        Bitmap d;
        C87412m.m108594g(multiTaskInfo, "taskInfo");
        try {
            View view = this.f346699e;
            if (!(view == null || (d = C108252a.m146586d(view, view.getWidth(), view.getHeight(), true, Bitmap.Config.RGB_565)) == null)) {
                String b = C56888q.f162957a.mo80311b("Home");
                if (C86013q1.m106450k(b)) {
                    C86013q1.m106447h(b);
                }
                BitmapUtil.saveBitmapToImage(d, 100, Bitmap.CompressFormat.JPEG, b, true);
            }
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.MultiTask.MultiTaskUIC", "snapshot bitmap failed", th);
        }
        mo175705F3(false);
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MULTITASK_LAST_SHOW_ID_AND_TIME_STRING_SYNC;
        i.mo119677K(aVar, multiTaskInfo.field_id + '|' + C31543z5.m39453c());
        StringBuilder sb = new StringBuilder();
        sb.append("enterFullScreenMode, id:");
        sb.append(multiTaskInfo.field_id);
        Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", sb.toString());
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        if (keyEvent.getKeyCode() != 4) {
            return false;
        }
        MinusScreenPanel minusScreenPanel = this.f346700f;
        if (!mo90994b0()) {
            return false;
        }
        m162482m3(this, true, true, false, false, true, false, false, false, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, (Object) null);
        return true;
    }

    /* renamed from: e3 */
    public final void mo175709e3(boolean z) {
        C117997g d;
        Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "hideSnapshotUIC, remove:" + z);
        MinusScreenPanel minusScreenPanel = this.f346700f;
        if (minusScreenPanel != null && (d = minusScreenPanel.mo183761d(1048576, "MultiTaskForSnapshotMinusScreen")) != null && (d instanceof C103343n)) {
            C103343n nVar = (C103343n) d;
            nVar.mo143209m3();
            nVar.mo143210n3();
            if (z) {
                ((C119157j) C119157j.f356862d).mo183895z(new C115599c(this));
            }
        }
    }

    /* renamed from: f */
    public void mo57276f(boolean z) {
        C27675g13 g132;
        Class cls = C110964i13.class;
        Class cls2 = C77049b.class;
        if (!mo90994b0()) {
            return;
        }
        if (z) {
            C110964i13 i132 = (C110964i13) ((C77049b) C86312j.m106911c(cls2)).Wi0(getActivity(), 5, cls);
            if (i132 != null && i132.f332064n != null) {
                i132.f332058e = C31543z5.m39453c();
                return;
            }
            return;
        }
        C110964i13 i133 = (C110964i13) ((C77049b) C86312j.m106911c(cls2)).Wi0(getActivity(), 5, cls);
        if (i133 != null && (g132 = i133.f332064n) != null && C31543z5.m39453c() >= i133.f332058e && !i133.f332066p) {
            g132.f76616i += C31543z5.m39453c() - i133.f332058e;
            i133.f332058e = C31543z5.m39453c();
        }
    }

    /* renamed from: f3 */
    public void mo175710f3(int i) {
        boolean i3 = mo175712i3();
        Log.m105918d("MicroMsg.MultiTask.MultiTaskUIC", "initEnterEduReport, eduType:" + i + ", isShow:" + i3);
        C110964i13 i132 = (C110964i13) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(getActivity(), 5, C110964i13.class);
        if (i132 == null) {
            return;
        }
        if (i == 1) {
            C110961f13 f132 = new C110961f13();
            i132.f332067q = f132;
            f132.f331967e = (long) i;
            f132.f331966d = C31543z5.m39453c();
            i132.f332067q.f331971i = !i3;
        } else if (i == 2) {
            C110961f13 f133 = new C110961f13();
            i132.f332068r = f133;
            f133.f331967e = (long) i;
            f133.f331966d = C31543z5.m39453c();
            i132.f332068r.f331971i = !i3;
        } else if (i == 3) {
            C110961f13 f134 = new C110961f13();
            i132.f332069s = f134;
            f134.f331967e = (long) i;
            f134.f331966d = C31543z5.m39453c();
            i132.f332069s.f331971i = !i3;
        }
    }

    /* renamed from: g3 */
    public void mo175711g3(int i) {
        C110961f13 f132;
        if (this.f346704j == 9) {
            this.f346704j = 3;
        }
        MinusScreenPanel minusScreenPanel = this.f346700f;
        boolean z = false;
        C117997g d = minusScreenPanel != null ? minusScreenPanel.mo183761d(0, "MultiTaskForMinusScreen") : null;
        C112765c cVar = d instanceof C112765c ? (C112765c) d : null;
        if (cVar != null && ((long) cVar.f337657h.size()) == 1) {
            z = true;
        }
        this.f346705n = z ? 2 : 1;
        Log.m105918d("MicroMsg.MultiTask.MultiTaskUIC", "initExitEduReport, eduType:" + i + ", eduExitType:" + this.f346704j + ", listEduType:" + this.f346705n);
        C110964i13 i132 = (C110964i13) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(getActivity(), 5, C110964i13.class);
        if (i132 == null) {
            return;
        }
        if (i == 1) {
            C110961f13 f133 = i132.f332067q;
            if (f133 != null) {
                f133.f331967e = (long) i;
                f133.f331970h = (long) this.f346705n;
                f133.f331968f = (long) this.f346704j;
                if (C31543z5.m39453c() >= f133.f331966d) {
                    f133.f331969g += C31543z5.m39453c() - f133.f331966d;
                    f133.f331966d = C31543z5.m39453c();
                }
                C117617a.f351848a.mo182340b(f133);
                i132.f332067q = null;
                C13598b0 b0Var = C13598b0.f38549a;
            }
        } else if (i == 2) {
            C110961f13 f134 = i132.f332068r;
            if (f134 == null) {
                return;
            }
            if (!f134.f331971i) {
                Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "EduTypeEnterReport is skip");
                return;
            }
            f134.f331967e = (long) i;
            f134.f331970h = (long) this.f346705n;
            int i2 = this.f346704j;
            f134.f331968f = (long) i2;
            if (i2 != 7 && C31543z5.m39453c() >= f134.f331966d) {
                f134.f331969g += C31543z5.m39453c() - f134.f331966d;
                f134.f331966d = C31543z5.m39453c();
            }
            C117617a.f351848a.mo182340b(f134);
            i132.f332068r = null;
            C13598b0 b0Var2 = C13598b0.f38549a;
        } else if (i == 3 && (f132 = i132.f332069s) != null) {
            f132.f331967e = (long) i;
            f132.f331970h = (long) this.f346705n;
            f132.f331968f = (long) this.f346704j;
            if (C31543z5.m39453c() >= f132.f331966d) {
                f132.f331969g += C31543z5.m39453c() - f132.f331966d;
                f132.f331966d = C31543z5.m39453c();
            }
            C117617a.f351848a.mo182340b(f132);
            i132.f332069s = null;
            C13598b0 b0Var3 = C13598b0.f38549a;
        }
    }

    /* renamed from: i */
    public void mo162051i(View view, float f) {
        float f2;
        View view2;
        View view3;
        View view4;
        C117997g e;
        float f3 = f;
        MinusScreenPanel minusScreenPanel = this.f346700f;
        float f4 = 0.0f;
        if (!(minusScreenPanel == null || (e = minusScreenPanel.mo183762e(1048576, "MultiTaskForSnapshotMinusScreen")) == null || !(e instanceof C103343n))) {
            C103343n nVar = (C103343n) e;
            if (nVar.mo143211o3()) {
                float f5 = (float) 1;
                int i = f346689Y;
                int i2 = C39748b.f106643b;
                float width = f5 - (((float) ((i + i2) + f346692x0)) / ((float) nVar.getRootView().getWidth()));
                float f6 = f3 >= width ? (f3 - width) / (f5 - width) : 0.0f;
                int i3 = f346689Y;
                int i4 = f346692x0;
                nVar.getRootView().setTranslationX(((float) (-(i3 + i2 + i4))) + (((float) (i3 + i2 + i4)) * f6));
                Log.m105919d("MicroMsg.SnapShotMultiTaskUIC", "onPanelSlide, factor: %f", Float.valueOf(f6));
            }
        }
        MultiTaskContainerView multiTaskContainerView = this.f346710s;
        float width2 = ((float) (multiTaskContainerView != null ? multiTaskContainerView.getWidth() : f346670H)) * f346693y0;
        MultiTaskContainerView multiTaskContainerView2 = this.f346710s;
        float width3 = width2 / ((float) ((multiTaskContainerView2 != null ? multiTaskContainerView2.getWidth() : f346670H) - f346689Y));
        if (this.f346713v) {
            if (f3 <= width3) {
                float f7 = (float) 0;
                if (f7 <= f3) {
                    View view5 = this.f346711t;
                    if (!(view5 != null && view5.getVisibility() == 0) && (view4 = this.f346711t) != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view6 = view4;
                        C117292a.m165358d(view6, aVar.mo10232b(), "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskUIC", "onPanelSlide", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view6, "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskUIC", "onPanelSlide", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    float f8 = (f3 - f7) / (width3 - f7);
                    if (f8 < 0.0f) {
                        f8 = 0.0f;
                    } else if (f8 > 1.0f) {
                        f8 = 1.0f;
                    }
                    View view7 = this.f346711t;
                    if (view7 != null) {
                        view7.setTranslationX(-(((float) ((0 - (view7 != null ? view7.getWidth() : 0)) / 2)) + (((width2 - f7) * f8) / ((float) 2))));
                    }
                    Log.m105918d("MicroMsg.MultiTask.MultiTaskUIC", "checkShowEnterTips,show now!, transFractor:" + f8 + ", minslide:" + 0 + ", maxslide:" + width3 + ", slideOffset:" + f3);
                }
            }
            View view8 = this.f346711t;
            if ((view8 != null && view8.getVisibility() == 0) && (view3 = this.f346711t) != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(4);
                View view9 = view3;
                C117292a.m165358d(view9, aVar2.mo10232b(), "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskUIC", "onPanelSlide", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskUIC", "onPanelSlide", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View view10 = this.f346711t;
            if ((view10 != null && view10.getVisibility() == 0) && (view2 = this.f346711t) != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(4);
                View view11 = view2;
                C117292a.m165358d(view11, aVar3.mo10232b(), "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskUIC", "onPanelSlide", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view11, "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskUIC", "onPanelSlide", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        MinusScreenPanel minusScreenPanel2 = this.f346700f;
        C112765c cVar = null;
        C16795g d = minusScreenPanel2 != null ? minusScreenPanel2.mo183761d(0, "MultiTaskForMinusScreen") : null;
        if (d instanceof C112765c) {
            cVar = (C112765c) d;
        }
        float f9 = (float) 1;
        float f15 = f9 - width3;
        float f16 = f3 >= f15 ? (f3 - f15) / (f9 - f15) : 0.0f;
        if (cVar != null) {
            cVar.mo164518I3(view, f3, f16);
        }
        MultiTaskContainerView multiTaskContainerView3 = this.f346710s;
        if (multiTaskContainerView3 != null) {
            float width4 = ((float) multiTaskContainerView3.getWidth()) * 0.18f;
            float width5 = ((float) (multiTaskContainerView3.getWidth() - f346689Y)) * f3;
            if (width5 < width4) {
                float f17 = width5 / width4;
                f2 = 1.0f - ((f17 * f17) * f17);
            } else {
                f2 = 0.0f;
            }
            ImageView imageView = this.f346701g;
            if (imageView != null) {
                if (f2 >= 0.0f) {
                    f4 = f2 > 1.0f ? 1.0f : f2;
                }
                imageView.setAlpha(f4);
            }
        }
    }

    /* renamed from: i3 */
    public final boolean mo175712i3() {
        C117997g d;
        MinusScreenPanel minusScreenPanel = this.f346700f;
        if (minusScreenPanel == null || (d = minusScreenPanel.mo183761d(1048576, "MultiTaskForSnapshotMinusScreen")) == null) {
            return false;
        }
        return ((C103343n) d).mo143211o3();
    }

    /* renamed from: j3 */
    public final void mo175713j3(boolean z) {
        Class cls = C110964i13.class;
        Class cls2 = C77049b.class;
        if (!mo90994b0()) {
            return;
        }
        if (z) {
            C110964i13 i132 = (C110964i13) ((C77049b) C86312j.m106911c(cls2)).Wi0(getActivity(), 5, cls);
            if (i132 != null) {
                C110961f13 f132 = i132.f332068r;
                if (f132 != null) {
                    f132.f331966d = C31543z5.m39453c();
                    f132.f331971i = true;
                }
                C110961f13 f133 = i132.f332067q;
                if (f133 != null) {
                    f133.f331966d = C31543z5.m39453c();
                    f133.f331971i = true;
                }
                C110961f13 f134 = i132.f332069s;
                if (f134 != null) {
                    f134.f331966d = C31543z5.m39453c();
                    f134.f331971i = true;
                    return;
                }
                return;
            }
            return;
        }
        C110964i13 i133 = (C110964i13) ((C77049b) C86312j.m106911c(cls2)).Wi0(getActivity(), 5, cls);
        if (i133 != null) {
            C110961f13 f135 = i133.f332068r;
            if (f135 != null && C31543z5.m39453c() >= f135.f331966d && !i133.f332066p && f135.f331971i) {
                f135.f331969g += C31543z5.m39453c() - f135.f331966d;
                f135.f331966d = C31543z5.m39453c();
            }
            C110961f13 f136 = i133.f332067q;
            if (f136 != null && C31543z5.m39453c() >= f136.f331966d && !i133.f332066p) {
                f136.f331969g += C31543z5.m39453c() - f136.f331966d;
                f136.f331966d = C31543z5.m39453c();
            }
            C110961f13 f137 = i133.f332069s;
            if (f137 != null && C31543z5.m39453c() >= f137.f331966d && !i133.f332066p) {
                f137.f331969g += C31543z5.m39453c() - f137.f331966d;
                f137.f331966d = C31543z5.m39453c();
            }
        }
    }

    /* renamed from: k3 */
    public final void mo175714k3() {
        if (!mo90994b0()) {
            SharedPreferences sharedPreferences = getActivity().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0);
            C87412m.m108593f(sharedPreferences, "activity.getSharedPrefer…faultPreferencePath(), 0)");
            Log.m105925i("MicroMsg.MultiTask.MultiTaskUIC", "set ScreenOrientation，now is ： %s", Boolean.valueOf(sharedPreferences.getBoolean("settings_landscape_mode", false)));
            if (sharedPreferences.getBoolean("settings_landscape_mode", false)) {
                getActivity().setRequestedOrientation(-1);
            } else {
                getActivity().setRequestedOrientation(1);
            }
        } else {
            getActivity().setRequestedOrientation(1);
        }
    }

    /* renamed from: l2 */
    public void mo90996l2(boolean z) {
        Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "showPanel, smoothScrool:" + z);
        this.f346702h = 2;
        mo175717o3();
        MultiTaskContainerView multiTaskContainerView = this.f346710s;
        if (multiTaskContainerView != null) {
            MultiTaskContainerView.f162966q = 0;
            multiTaskContainerView.invalidate();
        }
        C110555b bVar = this.f346698d;
        if (bVar != null) {
            bVar.mo162022j(0, z);
        }
    }

    /* renamed from: l3 */
    public final void mo175715l3(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "showHome, smoothScrool:" + z + ", fromClick:" + z2 + ", fromSwipe:" + z2 + ", fromFullSwipe:" + z4 + ", fromSysClick:" + z5 + ", fromFadeClick:" + z6 + ", fromDeleteAll:" + z7);
        if (z2) {
            if (z5) {
                this.f346703i = 8;
            } else if (z8) {
                this.f346703i = 2;
            } else {
                this.f346703i = 4;
            }
        } else if (z3) {
            this.f346703i = 1;
        } else {
            this.f346703i = 3;
        }
        if (z5) {
            this.f346704j = 8;
        } else if (z6) {
            this.f346704j = 2;
        } else if (z8) {
            this.f346704j = 5;
        } else if (z4) {
            this.f346704j = 7;
        } else if (z7) {
            this.f346704j = 6;
        } else if (z2) {
            this.f346704j = 1;
        } else if (z3) {
            this.f346704j = 3;
        } else {
            this.f346704j = 9;
        }
        GradientColorBackgroundView gradientColorBackgroundView = this.f346716y;
        if (gradientColorBackgroundView != null) {
            gradientColorBackgroundView.setVisibility(0);
        }
        GradientColorBackgroundView gradientColorBackgroundView2 = this.f346716y;
        if (gradientColorBackgroundView2 != null) {
            gradientColorBackgroundView2.setAlpha(1.0f);
        }
        C110555b bVar = this.f346698d;
        if (bVar != null) {
            bVar.mo162022j(1, z);
        }
        if (!z) {
            mo175716n3();
        }
    }

    /* renamed from: n3 */
    public final void mo175716n3() {
        C13598b0 b0Var;
        C117997g e;
        C117997g d;
        MinusScreenPanel minusScreenPanel = this.f346700f;
        if (minusScreenPanel == null || (e = minusScreenPanel.mo183762e(1048576, "MultiTaskForSnapshotMinusScreen")) == null) {
            b0Var = null;
        } else {
            MinusScreenPanel minusScreenPanel2 = this.f346700f;
            if (!(minusScreenPanel2 == null || (d = minusScreenPanel2.mo183761d(0, "MultiTaskForMinusScreen")) == null)) {
                C103343n nVar = (C103343n) e;
                if (((C112765c) d).mo164520K3(nVar.f304739e, false, true)) {
                    nVar.mo143205F3(nVar.f304739e);
                } else {
                    mo175709e3(false);
                }
            }
            ((C103343n) e).mo143210n3();
            mo90993a(true);
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            mo175709e3(false);
        }
    }

    /* renamed from: o3 */
    public void mo175717o3() {
        if (!this.f346696C && ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_multitask_minimize_disable_dynamic_bg, 0) != 1) {
            Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "virbg: switchToDynamicBg");
            this.f346696C = true;
            Runnable runnable = this.f346695B;
            if (runnable != null) {
                this.f346717z.removeCallbacks(runnable);
                this.f346695B = null;
            }
            DynamicBgContainer dynamicBgContainer = this.f346715x;
            if (dynamicBgContainer != null) {
                dynamicBgContainer.mo96166a();
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public boolean onBackPressed() {
        return false;
    }

    public void onBeforeFinish(Intent intent) {
        Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "onBeforeFinish");
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        f346667E.mo175718a(C76577a.m92145A(MMApplicationContext.getContext()), C76577a.m92159j(MMApplicationContext.getContext()));
        int i = configuration.orientation;
        this.f346707p = i;
        boolean z = true;
        if (i != 2 || mo90994b0()) {
            mo90993a(true);
        } else {
            mo90993a(false);
            C110555b bVar = this.f346698d;
            if (bVar == null || !bVar.mo162012f()) {
                z = false;
            }
            if (z) {
                m162482m3(this, false, false, false, false, false, true, false, false, 192, (Object) null);
            }
        }
        MinusScreenPanel minusScreenPanel = this.f346700f;
        if (minusScreenPanel != null) {
            minusScreenPanel.onConfigurationChanged(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f346694A.alive();
    }

    public void onCreateBefore(Bundle bundle) {
        Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "onCreateBefore");
        this.f346697D = bundle;
    }

    public void onDestroy() {
        Log.m105925i("MicroMsg.MultiTask.MultiTaskUIC", "onDestroy, isMultiTaskPanel:%b", Boolean.valueOf(mo90994b0()));
        MinusScreenPanel minusScreenPanel = this.f346700f;
        if (minusScreenPanel != null) {
            minusScreenPanel.onDestroy();
        }
        this.f346694A.dead();
        C110555b bVar = this.f346698d;
        if (bVar != null) {
            synchronized (bVar.f330670j) {
                bVar.f330670j.remove(this);
            }
        }
        ((C105923s) C86312j.m106911c(C105923s.class)).getClass();
        C105923s.f315123o = null;
        DynamicBgContainer dynamicBgContainer = this.f346715x;
        if (dynamicBgContainer != null) {
            Log.m105924i("MicroMsg.DynamicBgContainer.", "release");
            dynamicBgContainer.f201584d = true;
            if (dynamicBgContainer.f201585e != null) {
                Log.m105924i("MicroMsg.DynamicBgContainer.", "removed");
                dynamicBgContainer.removeView(dynamicBgContainer.f201585e);
                dynamicBgContainer.f201585e = null;
            }
        }
        this.f346717z.removeCallbacksAndMessages((Object) null);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        return false;
    }

    public void onPause() {
        Log.m105925i("MicroMsg.MultiTask.MultiTaskUIC", "onPause, isMultiTaskPanel:%b", Boolean.valueOf(mo90994b0()));
        if (mo90994b0()) {
            MinusScreenPanel minusScreenPanel = this.f346700f;
            if (minusScreenPanel != null) {
                minusScreenPanel.onPause();
            }
            mo175705F3(false);
        }
        mo175713j3(false);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        MinusScreenPanel minusScreenPanel = this.f346700f;
        if (minusScreenPanel != null) {
            minusScreenPanel.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "onRestoreInstanceState");
    }

    public void onResume() {
        C117997g d;
        Log.m105925i("MicroMsg.MultiTask.MultiTaskUIC", "onResume, isMultiTaskPanel:%b", Boolean.valueOf(mo90994b0()));
        if (mo90994b0()) {
            MinusScreenPanel minusScreenPanel = this.f346700f;
            if (minusScreenPanel != null) {
                minusScreenPanel.onResume();
            }
            if ((this.f346700f != null) && !mo175712i3()) {
                mo175717o3();
            }
            MinusScreenPanel minusScreenPanel2 = this.f346700f;
            if (!(minusScreenPanel2 == null || (d = minusScreenPanel2.mo183761d(0, "MultiTaskForMinusScreen")) == null)) {
                C112765c cVar = (C112765c) d;
                WxRecyclerAdapter<C65558a> wxRecyclerAdapter = cVar.f337667u;
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.mo82614x6();
                }
                WxRecyclerAdapter<C65558a> wxRecyclerAdapter2 = cVar.f337667u;
                if (wxRecyclerAdapter2 != null) {
                    wxRecyclerAdapter2.mo82616y6();
                }
            }
            mo175714k3();
        } else {
            mo175716n3();
        }
        mo175713j3(true);
    }

    public void onSaveInstanceState(Bundle bundle) {
        Log.m105924i("MicroMsg.MultiTask.MultiTaskUIC", "onSaveInstanceState");
    }

    public void onStart() {
        MinusScreenPanel minusScreenPanel;
        Log.m105925i("MicroMsg.MultiTask.MultiTaskUIC", "onStart, isMultiTaskPanel:%b", Boolean.valueOf(mo90994b0()));
        if (mo90994b0() && (minusScreenPanel = this.f346700f) != null) {
            minusScreenPanel.onStart();
        }
    }

    public void onStartActivityForResult(Intent intent, int i, Bundle bundle) {
    }

    public void onStop() {
        Log.m105925i("MicroMsg.MultiTask.MultiTaskUIC", "onStop, isMultiTaskPanel:%b", Boolean.valueOf(mo90994b0()));
        if (mo90994b0()) {
            MinusScreenPanel minusScreenPanel = this.f346700f;
            if (minusScreenPanel != null) {
                minusScreenPanel.onStop();
            }
            mo175705F3(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02a8, code lost:
        if ((r1 != null && (r1.f356644i instanceof aa2.C112765c)) != false) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03b8, code lost:
        if ((r1 != null && (r1.f356644i instanceof aa2.C112765c)) != false) goto L_0x03ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03fd A[ADDED_TO_REGION] */
    /* renamed from: p1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo162052p1(android.view.View r24, int r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            java.lang.Class<te3.i13> r2 = te3.C110964i13.class
            java.lang.Class<ox.b> r3 = p640ox.C77049b.class
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onPanelItemSelected, position:"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.MultiTask.MultiTaskUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            r6 = 2
            r10 = 0
            r11 = 5
            r12 = 1
            r13 = 2
            r14 = 6
            r15 = 3
            java.lang.String r8 = "MultiTaskForMinusScreen"
            if (r1 == 0) goto L_0x00e0
            if (r1 == r12) goto L_0x002e
            goto L_0x01e3
        L_0x002e:
            java.lang.String r9 = "initExitReport, start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r9)
            di3.d r3 = di3.C86312j.m106911c(r3)
            ox.b r3 = (p640ox.C77049b) r3
            androidx.appcompat.app.AppCompatActivity r9 = r23.getActivity()
            pe3.a r2 = r3.Wi0(r9, r11, r2)
            te3.i13 r2 = (te3.C110964i13) r2
            if (r2 == 0) goto L_0x00d8
            te3.g13 r3 = r2.f332064n
            if (r3 == 0) goto L_0x00d8
            r3.f76611d = r6
            int r6 = r0.f346703i
            if (r6 != r14) goto L_0x0051
            r0.f346703i = r12
        L_0x0051:
            int r6 = r0.f346703i
            long r6 = (long) r6
            r3.f76613f = r6
            com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel r6 = r0.f346700f
            if (r6 == 0) goto L_0x006b
            p92.g r6 = r6.mo183761d(r10, r8)
            if (r6 == 0) goto L_0x006b
            aa2.c r6 = (aa2.C112765c) r6
            java.util.ArrayList<v92.a> r6 = r6.f337657h
            int r6 = r6.size()
            long r6 = (long) r6
            r3.f76615h = r6
        L_0x006b:
            long r6 = eb0.C31543z5.m39453c()
            r24 = r5
            long r4 = r2.f332058e
            int r16 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r16 < 0) goto L_0x00cc
            long r4 = r3.f76616i
            long r6 = eb0.C31543z5.m39453c()
            long r11 = r2.f332058e
            long r6 = r6 - r11
            long r4 = r4 + r6
            r3.f76616i = r4
            java.lang.Object[] r3 = new java.lang.Object[r14]
            java.lang.String r4 = r2.f332057d
            r3[r10] = r4
            te3.g13 r4 = r2.f332064n
            long r4 = r4.f76611d
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 1
            r3[r5] = r4
            te3.g13 r4 = r2.f332064n
            long r4 = r4.f76613f
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3[r13] = r4
            te3.g13 r4 = r2.f332064n
            long r4 = r4.f76612e
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3[r15] = r4
            te3.g13 r4 = r2.f332064n
            long r4 = r4.f76614g
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 4
            r3[r5] = r4
            te3.g13 r4 = r2.f332064n
            long r4 = r4.f76616i
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 5
            r3[r5] = r4
            java.lang.String r4 = "report pageExitAction, contextid:%s, action:%d, useraction:%d, scene:%d, fullscreen:%d, duration:%d"
            r5 = r24
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r3)
            long r3 = eb0.C31543z5.m39453c()
            r2.f332058e = r3
            goto L_0x00d3
        L_0x00cc:
            r5 = r24
            java.lang.String r3 = "report pageExitAction, error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
        L_0x00d3:
            n92.a r3 = n92.C117617a.f351848a
            r3.mo182343e(r2)
        L_0x00d8:
            r0.mo175711g3(r15)
            r0.mo175711g3(r13)
            goto L_0x01e3
        L_0x00e0:
            di3.d r3 = di3.C86312j.m106911c(r3)
            ox.b r3 = (p640ox.C77049b) r3
            androidx.appcompat.app.AppCompatActivity r4 = r23.getActivity()
            r11 = 5
            pe3.a r2 = r3.Wi0(r4, r11, r2)
            te3.i13 r2 = (te3.C110964i13) r2
            if (r2 == 0) goto L_0x01e3
            n92.a r3 = n92.C117617a.f351848a
            java.util.HashMap<java.lang.String, java.lang.Long> r4 = n92.C117617a.f351849b
            r4.clear()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            f40.e r11 = f40.C86709a0.m107523b()
            int r11 = r11.mo121110g()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
            r4.append(r11)
            long r11 = java.lang.System.currentTimeMillis()
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r4)
            java.lang.String r4 = r4.toString()
            r2.f332057d = r4
            long r11 = eb0.C31543z5.m39453c()
            r2.f332058e = r11
            te3.c13 r4 = new te3.c13
            r4.<init>()
            r2.f332063j = r4
            te3.e13 r4 = new te3.e13
            r4.<init>()
            r2.f332062i = r4
            te3.g13 r4 = new te3.g13
            r4.<init>()
            r2.f332064n = r4
            r11 = 1
            r4.f76611d = r11
            int r11 = r0.f346702h
            if (r11 != r14) goto L_0x014e
            r11 = 1
            r0.f346702h = r11
            goto L_0x014f
        L_0x014e:
            r11 = 1
        L_0x014f:
            int r12 = r0.f346702h
            long r6 = (long) r12
            r4.f76613f = r6
            aa2.b$a r6 = r0.f346706o
            if (r6 == 0) goto L_0x0174
            int r6 = com.tencent.p014mm.p136ui.LauncherUI.getCurrentTabIndex()
            if (r6 == 0) goto L_0x0170
            if (r6 == r11) goto L_0x016d
            if (r6 == r13) goto L_0x016a
            if (r6 == r15) goto L_0x0167
            r11 = -1
            goto L_0x0172
        L_0x0167:
            r11 = 4
            goto L_0x0172
        L_0x016a:
            r11 = 3
            goto L_0x0172
        L_0x016d:
            r11 = 2
            goto L_0x0172
        L_0x0170:
            r11 = 1
        L_0x0172:
            r4.f76612e = r11
        L_0x0174:
            te3.g13 r4 = r2.f332064n
            boolean r6 = r23.mo175712i3()
            if (r6 == 0) goto L_0x017f
            r6 = 1
            goto L_0x0181
        L_0x017f:
            r6 = 2
        L_0x0181:
            r4.f76614g = r6
            te3.g13 r4 = r2.f332064n
            r6 = 0
            r4.f76616i = r6
            com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel r4 = r0.f346700f
            if (r4 == 0) goto L_0x01a0
            p92.g r4 = r4.mo183761d(r10, r8)
            if (r4 == 0) goto L_0x01a0
            te3.g13 r6 = r2.f332064n
            aa2.c r4 = (aa2.C112765c) r4
            java.util.ArrayList<v92.a> r4 = r4.f337657h
            int r4 = r4.size()
            long r11 = (long) r4
            r6.f76615h = r11
        L_0x01a0:
            r3.mo182343e(r2)
            java.lang.Object[] r3 = new java.lang.Object[r14]
            java.lang.String r4 = r2.f332057d
            r3[r10] = r4
            te3.g13 r4 = r2.f332064n
            long r6 = r4.f76611d
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r6 = 1
            r3[r6] = r4
            te3.g13 r4 = r2.f332064n
            long r6 = r4.f76613f
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r3[r13] = r4
            te3.g13 r4 = r2.f332064n
            long r6 = r4.f76612e
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r3[r15] = r4
            te3.g13 r4 = r2.f332064n
            long r6 = r4.f76614g
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r6 = 4
            r3[r6] = r4
            te3.g13 r2 = r2.f332064n
            long r6 = r2.f76616i
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            r4 = 5
            r3[r4] = r2
            java.lang.String r2 = "report pageEnterAction, contextid:%s, action:%d, useraction:%d, scene:%d, fullscreen:%d, duration:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r2, r3)
        L_0x01e3:
            if (r1 != 0) goto L_0x0212
            com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel r2 = r0.f346700f
            if (r2 == 0) goto L_0x01ec
            r2.mo183766i()
        L_0x01ec:
            boolean r2 = r23.mo175712i3()
            if (r2 != 0) goto L_0x0219
            com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel r2 = r0.f346700f
            if (r2 == 0) goto L_0x0219
            p92.g r2 = r2.mo183761d(r10, r8)
            if (r2 == 0) goto L_0x0219
            aa2.c r2 = (aa2.C112765c) r2
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<v92.a> r3 = r2.f337667u
            if (r3 == 0) goto L_0x0205
            r3.mo82614x6()
        L_0x0205:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<v92.a> r2 = r2.f337667u
            if (r2 == 0) goto L_0x020c
            r2.mo82616y6()
        L_0x020c:
            java.lang.String r2 = "triggerExposed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            goto L_0x0219
        L_0x0212:
            com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel r2 = r0.f346700f
            if (r2 == 0) goto L_0x0219
            r2.mo183765h()
        L_0x0219:
            aa2.b$a r2 = r0.f346706o
            if (r2 == 0) goto L_0x0222
            com.tencent.mm.ui.NewChattingTabUI$a r2 = (com.tencent.p014mm.p136ui.NewChattingTabUI.C73121a) r2
            r2.mo101512b(r1)
        L_0x0222:
            boolean r1 = r23.mo90994b0()
            r2 = 0
            if (r1 != 0) goto L_0x025e
            com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer r1 = r0.f346715x
            if (r1 == 0) goto L_0x0230
            r1.mo96168c()
        L_0x0230:
            r0.mo175705F3(r10)
            r23.mo175716n3()
            com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel r1 = r0.f346700f
            if (r1 == 0) goto L_0x023f
            p92.g r1 = r1.mo183761d(r10, r8)
            goto L_0x0240
        L_0x023f:
            r1 = r2
        L_0x0240:
            boolean r3 = r1 instanceof aa2.C112765c
            if (r3 == 0) goto L_0x0247
            r2 = r1
            aa2.c r2 = (aa2.C112765c) r2
        L_0x0247:
            if (r2 == 0) goto L_0x024c
            r2.mo164522m3()
        L_0x024c:
            if (r2 == 0) goto L_0x041f
            int r1 = r0.f346704j
            r3 = 1
            if (r1 == r3) goto L_0x0258
            if (r1 != r15) goto L_0x0256
            goto L_0x0258
        L_0x0256:
            r12 = 0
            goto L_0x0259
        L_0x0258:
            r12 = 1
        L_0x0259:
            r2.mo164523n3(r10, r12)
            goto L_0x041f
        L_0x025e:
            boolean r1 = r23.mo90994b0()
            if (r1 == 0) goto L_0x041f
            android.widget.ImageView r1 = r0.f346701g
            if (r1 != 0) goto L_0x0269
            goto L_0x026d
        L_0x0269:
            r3 = 0
            r1.setAlpha(r3)
        L_0x026d:
            p92.a$b r1 = p92.C117994a.C117996b.MODE_SHOW_SINGLE_SCENE
            com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel r3 = r0.f346700f
            if (r3 == 0) goto L_0x0397
            r4 = 1048576(0x100000, float:1.469368E-39)
            java.lang.String r6 = "MultiTaskForSnapshotMinusScreen"
            p92.g r3 = r3.mo183761d(r4, r6)
            if (r3 == 0) goto L_0x0397
            aa2.n r3 = (aa2.C103343n) r3
            boolean r4 = r3.mo143211o3()
            if (r4 != 0) goto L_0x02af
            java.lang.String r3 = "jumpSnapshotUIC, is already hide"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel r3 = r0.f346700f
            if (r3 == 0) goto L_0x0297
            p92.g r3 = r3.f356644i
            if (r3 == 0) goto L_0x0297
            p92.a$b r3 = r3.mo36002z()
            goto L_0x0298
        L_0x0297:
            r3 = r2
        L_0x0298:
            if (r3 != r1) goto L_0x02aa
            com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel r1 = r0.f346700f
            if (r1 == 0) goto L_0x02a7
            p92.g r1 = r1.f356644i
            boolean r1 = r1 instanceof aa2.C112765c
            r3 = 1
            if (r1 != r3) goto L_0x02a7
            r1 = 1
            goto L_0x02a8
        L_0x02a7:
            r1 = 0
        L_0x02a8:
            if (r1 == 0) goto L_0x03bd
        L_0x02aa:
            r23.mo175717o3()
            goto L_0x03bd
        L_0x02af:
            com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel r4 = r0.f346700f
            if (r4 == 0) goto L_0x037f
            p92.g r4 = r4.mo183761d(r10, r8)
            if (r4 == 0) goto L_0x037f
            r3.mo143206G3()
            aa2.c r4 = (aa2.C112765c) r4
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r6 = r3.f304739e
            java.util.ArrayList<v92.a> r7 = r4.f337657h
            int r7 = r7.size()
            if (r7 != 0) goto L_0x02d1
            java.lang.String r4 = "MicroMsg.MultiTask.MultiTaskMinusScreenUIC"
            java.lang.String r6 = "jumpUICFormSnapshot, empty data"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
            goto L_0x0374
        L_0x02d1:
            java.util.ArrayList<v92.a> r7 = r4.f337657h
            int r7 = r7.size()
            r9 = 2131309660(0x7f09345c, float:1.823761E38)
            r11 = 1
            if (r7 != r11) goto L_0x031e
            java.util.ArrayList<v92.a> r6 = r4.f337657h
            java.lang.Object r6 = r6.get(r10)
            java.lang.String r7 = "multiTaskInfoList.get(0)"
            gy3.C87412m.m108593f(r6, r7)
            v92.a r6 = (v92.C65558a) r6
            com.tencent.mm.view.recyclerview.WxRecyclerView r7 = r4.f337659j
            if (r7 == 0) goto L_0x02f3
            androidx.recyclerview.widget.RecyclerView$z r7 = r7.mo17023I0(r11)
            goto L_0x02f4
        L_0x02f3:
            r7 = r2
        L_0x02f4:
            aa2.c$a r4 = r4.f337664r
            if (r4 == 0) goto L_0x0374
            if (r7 == 0) goto L_0x0305
            android.view.View r11 = r7.f44854d
            if (r11 == 0) goto L_0x0305
            android.view.View r9 = r11.findViewById(r9)
            r18 = r9
            goto L_0x0307
        L_0x0305:
            r18 = r2
        L_0x0307:
            if (r7 == 0) goto L_0x030e
            android.view.View r7 = r7.f44854d
            r19 = r7
            goto L_0x0310
        L_0x030e:
            r19 = r2
        L_0x0310:
            r20 = 0
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r6 = r6.f188631d
            r22 = 0
            r17 = r4
            r21 = r6
            r17.mo164526b(r18, r19, r20, r21, r22)
            goto L_0x0374
        L_0x031e:
            if (r6 == 0) goto L_0x0374
            java.lang.String r7 = r6.field_id
            int r20 = r4.mo164517G3(r7)
            com.tencent.mm.view.recyclerview.WxRecyclerView r7 = r4.f337659j
            if (r7 == 0) goto L_0x0331
            int r11 = r20 + 1
            androidx.recyclerview.widget.RecyclerView$z r7 = r7.mo17023I0(r11)
            goto L_0x0332
        L_0x0331:
            r7 = r2
        L_0x0332:
            java.util.ArrayList<v92.a> r11 = r4.f337657h
            int r11 = r11.size()
            if (r11 > r13) goto L_0x0351
            com.tencent.mm.view.recyclerview.WxRecyclerView r11 = r4.f337659j
            if (r11 == 0) goto L_0x034e
            r12 = 1
            androidx.recyclerview.widget.RecyclerView$z r11 = r11.mo17023I0(r12)
            if (r11 == 0) goto L_0x034e
            android.view.View r11 = r11.f44854d
            if (r11 == 0) goto L_0x034e
            android.view.View r9 = r11.findViewById(r9)
            goto L_0x035c
        L_0x034e:
            r18 = r2
            goto L_0x035e
        L_0x0351:
            android.view.View r9 = r4.getRootView()
            r11 = 2131309655(0x7f093457, float:1.82376E38)
            android.view.View r9 = r9.findViewById(r11)
        L_0x035c:
            r18 = r9
        L_0x035e:
            aa2.c$a r4 = r4.f337664r
            if (r4 == 0) goto L_0x0374
            if (r7 == 0) goto L_0x0369
            android.view.View r7 = r7.f44854d
            r19 = r7
            goto L_0x036b
        L_0x0369:
            r19 = r2
        L_0x036b:
            r22 = 0
            r17 = r4
            r21 = r6
            r17.mo164526b(r18, r19, r20, r21, r22)
        L_0x0374:
            r0.mo90993a(r10)
            java.lang.String r4 = "jumpSnapshotUIC, show now!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            goto L_0x0380
        L_0x037f:
            r4 = r2
        L_0x0380:
            if (r4 != 0) goto L_0x0394
            r3.mo143209m3()
            r3.mo143210n3()
            r3 = 1
            r0.mo90993a(r3)
            r23.mo175717o3()
            java.lang.String r3 = "jumpSnapshotUIC, hide now!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
        L_0x0394:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x0398
        L_0x0397:
            r3 = r2
        L_0x0398:
            if (r3 != 0) goto L_0x03bd
            com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel r3 = r0.f346700f
            if (r3 == 0) goto L_0x03a7
            p92.g r3 = r3.f356644i
            if (r3 == 0) goto L_0x03a7
            p92.a$b r3 = r3.mo36002z()
            goto L_0x03a8
        L_0x03a7:
            r3 = r2
        L_0x03a8:
            if (r3 != r1) goto L_0x03ba
            com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel r1 = r0.f346700f
            if (r1 == 0) goto L_0x03b7
            p92.g r1 = r1.f356644i
            boolean r1 = r1 instanceof aa2.C112765c
            r3 = 1
            if (r1 != r3) goto L_0x03b7
            r1 = 1
            goto L_0x03b8
        L_0x03b7:
            r1 = 0
        L_0x03b8:
            if (r1 == 0) goto L_0x03bd
        L_0x03ba:
            r23.mo175717o3()
        L_0x03bd:
            com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel r1 = r0.f346700f
            if (r1 == 0) goto L_0x03c6
            p92.g r1 = r1.mo183761d(r10, r8)
            goto L_0x03c7
        L_0x03c6:
            r1 = r2
        L_0x03c7:
            boolean r3 = r1 instanceof aa2.C112765c
            if (r3 == 0) goto L_0x03ce
            r2 = r1
            aa2.c r2 = (aa2.C112765c) r2
        L_0x03ce:
            if (r2 == 0) goto L_0x03d3
            r2.mo164522m3()
        L_0x03d3:
            if (r2 == 0) goto L_0x03d9
            r1 = 1
            r2.mo164523n3(r1, r10)
        L_0x03d9:
            java.lang.String r1 = "multitask_tips_config"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r1)
            java.lang.String r4 = "multitask_first_enter"
            boolean r3 = r3.getBoolean(r4, r10)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "isMultiTaskFirstEnter, flag: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.MultiTaskTipsHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            if (r3 != 0) goto L_0x041f
            if (r2 == 0) goto L_0x040d
            java.util.ArrayList<v92.a> r2 = r2.f337657h
            int r2 = r2.size()
            long r2 = (long) r2
            r7 = 1
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x040d
            r10 = 1
        L_0x040d:
            if (r10 == 0) goto L_0x041f
            r0.mo175710f3(r15)
            java.lang.String r2 = "setMultiTaskFirstEnter, time: true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r1)
            r2 = 1
            r1.putBoolean(r4, r2)
        L_0x041f:
            r1 = 250(0xfa, double:1.235E-321)
            com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC$d r3 = new com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC$d
            r3.<init>(r0)
            o40.C61926c.m72666K(r1, r3)
            r0.f346702h = r14
            r0.f346703i = r14
            r1 = 9
            r0.f346704j = r1
            r0.f346705n = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.mo162052p1(android.view.View, int):void");
    }

    /* renamed from: u1 */
    public void mo162053u1() {
        int i = this.f346709r + 1;
        this.f346709r = i;
        Log.m105919d("MicroMsg.MultiTask.MultiTaskUIC", "playsound count: %d", Integer.valueOf(i));
    }

    /* renamed from: v1 */
    public void mo162054v1() {
        C117997g d;
        MultiTaskContainerView multiTaskContainerView;
        this.f346713v = false;
        C110555b bVar = this.f346698d;
        if (bVar != null) {
            bVar.f330660K = 1.0f;
            bVar.f330667g = false;
        }
        if (!(!mo90994b0()) && (multiTaskContainerView = this.f346710s) != null) {
            MultiTaskContainerView.f162966q = 0;
            multiTaskContainerView.invalidate();
        }
        MinusScreenPanel minusScreenPanel = this.f346700f;
        if (minusScreenPanel != null && (d = minusScreenPanel.mo183761d(0, "MultiTaskForMinusScreen")) != null) {
            ((C112765c) d).mo164521l3();
        }
    }

    /* renamed from: x2 */
    public void mo162055x2() {
        MultiTaskContainerView multiTaskContainerView = this.f346710s;
        if (multiTaskContainerView != null) {
            MultiTaskContainerView.f162966q = 0;
            multiTaskContainerView.invalidate();
        }
    }
}
