package com.tencent.p014mm.p136ui.vas;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.C103448e;
import androidx.fragment.app.C112958r;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import bo3.C113201a;
import bo3.C113202f;
import bo3.C16816b;
import bo3.C16817c;
import bo3.C16818d;
import bo3.C16819e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import com.tencent.p014mm.p136ui.vas.fragment.VASBaseFragment;
import com.tencent.p014mm.p136ui.vas.launcher.VASLauncher;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import in3.C87763b;
import j20.C117292a;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import p206nj.C47264o;
import p849e3.C58525r;
import p990k.C108787f;
import rx3.C13598b0;
import rx3.C36570n;
import vn3.C111561d;
import vn3.C118687b;
import vn3.C118688f;
import vn3.C118689g;
import vo3.C78461f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/ui/vas/VASCommonFragment;", "Lcom/tencent/mm/ui/vas/fragment/VASBaseFragment;", "Lcom/tencent/mm/ui/widget/SwipeBackLayout$d;", "Lvn3/b;", "<init>", "()V", "a", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.vas.VASCommonFragment */
public final class VASCommonFragment extends VASBaseFragment implements SwipeBackLayout.C19854d, C118687b {

    /* renamed from: K */
    public static final C116170a f348630K = new C116170a((C8480h) null);

    /* renamed from: A */
    public C113202f f348631A = C16818d.f45435b;

    /* renamed from: B */
    public C113202f f348632B = C16817c.f45434b;

    /* renamed from: C */
    public C113202f f348633C = C16816b.f45433b;

    /* renamed from: D */
    public C113202f f348634D = C16819e.f45436b;

    /* renamed from: E */
    public boolean f348635E;

    /* renamed from: F */
    public C32226l<? super VASActivity, C13598b0> f348636F;

    /* renamed from: G */
    public float f348637G;

    /* renamed from: H */
    public final MMActivityController f348638H = new C116171b(this);

    /* renamed from: I */
    public FrameLayout f348639I;

    /* renamed from: J */
    public FrameLayout f348640J;

    /* renamed from: n */
    public final String f348641n = ("MicroMsg.VAS.VASCommonFragment@" + hashCode());

    /* renamed from: o */
    public VASActivity f348642o;

    /* renamed from: p */
    public VASCommonFragment f348643p;

    /* renamed from: q */
    public View f348644q;

    /* renamed from: r */
    public FrameLayout f348645r;

    /* renamed from: s */
    public View f348646s;

    /* renamed from: t */
    public View f348647t;

    /* renamed from: u */
    public View f348648u;

    /* renamed from: v */
    public View f348649v;

    /* renamed from: w */
    public SwipeBackLayout f348650w;

    /* renamed from: x */
    public ViewGroup f348651x;

    /* renamed from: y */
    public boolean f348652y;

    /* renamed from: z */
    public Intent f348653z = new Intent();

    /* renamed from: com.tencent.mm.ui.vas.VASCommonFragment$a */
    public static final class C116170a {
        public C116170a(C8480h hVar) {
        }

        /* renamed from: a */
        public final VASCommonFragment mo177567a(Intent intent) {
            C87412m.m108594g(intent, "inputIntent");
            VASCommonFragment vASCommonFragment = new VASCommonFragment();
            Bundle extras = intent.getExtras();
            Bundle bundle = new Bundle();
            if (extras != null) {
                bundle.putAll(extras);
            }
            vASCommonFragment.setArguments(bundle);
            vASCommonFragment.f348653z.setComponent(intent.getComponent());
            return vASCommonFragment;
        }
    }

    /* renamed from: com.tencent.mm.ui.vas.VASCommonFragment$b */
    public static final class C116171b extends MMActivityController {

        /* renamed from: s0 */
        public MenuInflater f348654s0;

        /* renamed from: t0 */
        public final /* synthetic */ VASCommonFragment f348655t0;

        public C116171b(VASCommonFragment vASCommonFragment) {
            this.f348655t0 = vASCommonFragment;
        }

        /* renamed from: G0 */
        public void mo177047G0() {
            C103448e eVar = new C103448e(this.f348655t0.f348642o);
            VASCommonFragment vASCommonFragment = this.f348655t0;
            if (this.f348654s0 == null) {
                ActionBar B = mo177037B();
                if (B != null) {
                    this.f348654s0 = new C108787f(B.mo91102m());
                } else {
                    this.f348654s0 = new C108787f(this.f348655t0.getActivity());
                }
            }
            MenuInflater menuInflater = this.f348654s0;
            C87412m.m108591d(menuInflater);
            vASCommonFragment.onCreateOptionsMenu(eVar, menuInflater);
            this.f348655t0.onPrepareOptionsMenu(eVar);
            super.mo177066a0(eVar);
        }

        /* renamed from: H0 */
        public void mo177049H0(boolean z) {
            VASActivity vASActivity = this.f348655t0.f348642o;
            boolean z2 = true;
            if (vASActivity == null || !vASActivity.getDisableCommonAreaControl()) {
                z2 = false;
            }
            if (!z2) {
                super.mo177049H0(z);
            }
        }

        /* renamed from: O */
        public boolean mo177020O() {
            return true;
        }

        /* renamed from: X */
        public boolean mo177024X() {
            this.f348655t0.getClass();
            return false;
        }

        /* renamed from: Z */
        public void mo177025Z() {
            this.f348655t0.getClass();
        }

        /* renamed from: a0 */
        public boolean mo177066a0(Menu menu) {
            return super.mo177066a0(menu);
        }

        /* renamed from: c0 */
        public void mo177026c0() {
            this.f348655t0.getClass();
        }

        /* renamed from: e */
        public void mo177071e(int i, int i2, int i3, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super.mo177071e(i, i2, i3, onMenuItemClickListener);
        }

        /* renamed from: e0 */
        public boolean mo177072e0(Menu menu) {
            super.mo177072e0(menu);
            return true;
        }

        /* renamed from: f */
        public void mo177073f(int i, String str, int i2, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super.mo177073f(i, str, i2, onMenuItemClickListener);
        }

        /* renamed from: j0 */
        public void mo177081j0(int i) {
            VASActivity vASActivity = this.f348655t0.f348642o;
            boolean z = false;
            if (vASActivity != null && vASActivity.getDisableCommonAreaControl()) {
                z = true;
            }
            if (!z) {
                super.mo177081j0(i);
            } else if (this.f348065F != null) {
                this.f348073N = i;
                this.f348074O = true;
                this.f348076Q = C74933u4.m89770g(i);
                this.f348065F.mo91112w(new ColorDrawable(this.f348073N));
                mo177051I0();
            }
            C78461f fVar = this.f348121u;
            if (fVar != null) {
                fVar.setStart2EndBgColorByActionBar(i);
            }
            View view = this.f348655t0.f348647t;
            if (view != null) {
                view.setBackgroundColor(i);
            }
            View view2 = this.f348655t0.f348648u;
            if (view2 != null) {
                view2.setBackgroundColor(i);
            }
        }

        /* renamed from: k */
        public void mo177028k(View view) {
            this.f348655t0.getClass();
        }

        /* renamed from: o */
        public boolean mo177029o() {
            return false;
        }

        /* renamed from: r */
        public String mo177030r() {
            return this.f348655t0.getClass().getName();
        }

        /* renamed from: s */
        public View mo177094s() {
            View view = this.f348092d;
            return view == null ? new View(this.f348655t0.getActivity()) : view;
        }

        /* renamed from: t */
        public AppCompatActivity mo177096t() {
            return this.f348655t0.f348642o;
        }

        /* renamed from: u */
        public int mo177031u() {
            VASActivity vASActivity = this.f348655t0.f348642o;
            int _getCustomBounceId = vASActivity != null ? vASActivity._getCustomBounceId() : -1;
            if (_getCustomBounceId != -1) {
                return _getCustomBounceId;
            }
            this.f348655t0.getClass();
            return C0966R.C0970id.fkh;
        }

        /* renamed from: x */
        public String mo177032x() {
            return "";
        }

        /* renamed from: x0 */
        public void mo177103x0(int i) {
            super.mo177103x0(i);
            C78461f fVar = this.f348121u;
            if (fVar != null) {
                fVar.setEnd2StartBgColorByNavigationBar(i);
            }
            View view = this.f348655t0.f348649v;
            if (view != null) {
                view.setBackgroundColor(i);
            }
        }

        /* renamed from: y */
        public int mo177033y() {
            return this.f348655t0.getLayoutId();
        }

        /* renamed from: z */
        public View mo177034z() {
            ViewGroup viewGroup;
            VASCommonFragment vASCommonFragment = this.f348655t0;
            View inflate = LayoutInflater.from(vASCommonFragment.f348642o).inflate(C0966R.C0971layout.asj, (ViewGroup) null);
            VASActivity vASActivity = vASCommonFragment.f348642o;
            ActionBar mActionBar = vASActivity != null ? vASActivity.getMActionBar() : null;
            C111561d dVar = mActionBar instanceof C111561d ? (C111561d) mActionBar : null;
            if (!(dVar == null || (viewGroup = dVar.f333980b) == null)) {
                FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C0966R.C0970id.fjx);
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                ViewParent parent = frameLayout.getParent();
                C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup2 = (ViewGroup) parent;
                int indexOfChild = viewGroup2.indexOfChild(frameLayout);
                viewGroup2.removeView(frameLayout);
                viewGroup2.addView(viewGroup, indexOfChild, layoutParams);
            }
            FrameLayout frameLayout2 = (FrameLayout) inflate.findViewById(C0966R.C0970id.fkh);
            FrameLayout frameLayout3 = (FrameLayout) inflate.findViewById(C0966R.C0970id.f358518mf1);
            VASActivity.C45097a aVar = VASActivity.Companion;
            VASActivity vASActivity2 = vASCommonFragment.f348642o;
            String name = vASActivity2 != null ? vASActivity2.getClass().getName() : null;
            if (name == null) {
                name = "";
            }
            aVar.getClass();
            if (VASActivity.vasController.mo162723b(name)) {
                ViewGroup.LayoutParams layoutParams2 = frameLayout3.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = 0;
                    frameLayout3.setLayoutParams(marginLayoutParams);
                }
            }
            vASCommonFragment.f348639I = frameLayout2;
            vASCommonFragment.f348640J = frameLayout3;
            frameLayout2.addView(LayoutInflater.from(vASCommonFragment.f348642o).inflate(vASCommonFragment.getLayoutId(), (ViewGroup) null));
            vASCommonFragment.postponeEnterTransition();
            C58525r.m67941a(inflate, new C118688f(vASCommonFragment));
            return inflate;
        }
    }

    /* renamed from: F */
    public boolean mo26409F() {
        return false;
    }

    /* renamed from: K */
    public <T extends C39622i0> T mo82279K(Class<T> cls) {
        C87412m.m108594g(cls, "modelClass");
        C39818r rVar = C39818r.f106831a;
        VASActivity vASActivity = this.f348642o;
        C87412m.m108591d(vASActivity);
        T a = rVar.mo62444c(vASActivity).mo75002a(cls);
        C87412m.m108593f(a, "UICProvider.of(vasActivity!!).get(modelClass)");
        return a;
    }

    /* renamed from: L */
    public String mo82280L() {
        return this.f348641n;
    }

    /* renamed from: M */
    public Set<Class<? extends UIComponent>> mo82281M() {
        return null;
    }

    /* renamed from: N */
    public void mo82282N(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.mo82282N(hashSet);
        VASActivity vASActivity = this.f348642o;
        if (vASActivity != null) {
            vASActivity.superImportUIComponents(hashSet);
        }
    }

    /* renamed from: O */
    public final View mo177562O() {
        View view = getView();
        C87412m.m108591d(view);
        return view;
    }

    /* renamed from: P */
    public final C113201a mo177563P() {
        FragmentActivity activity = getActivity();
        VASCommonActivity vASCommonActivity = activity instanceof VASCommonActivity ? (VASCommonActivity) activity : null;
        if (vASCommonActivity != null) {
            return (C113201a) ((C36570n) vASCommonActivity.f348626f).getValue();
        }
        return null;
    }

    /* renamed from: Q */
    public final void mo177564Q(Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup viewGroup;
        FragmentActivity activity = getActivity();
        boolean z = activity instanceof VASCommonActivity;
        if (!z) {
            VASActivity vASActivity = this.f348642o;
            if (!(vASActivity != null && !vASActivity.getDisableCommonAreaControl())) {
                return;
            }
        }
        if (z && (viewGroup = ((VASCommonActivity) activity).mWrappingFrame) != null && (viewGroup instanceof C87763b)) {
            ((C87763b) viewGroup).mo122166H(true);
        }
        ViewGroup viewGroup2 = this.f348651x;
        if (viewGroup2 != null && (viewGroup2 instanceof C87763b)) {
            ((C87763b) viewGroup2).mo122166H(true);
        }
        int a = C47264o.m52556a(getContext(), -1);
        View view = this.f348648u;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/vas/VASCommonFragment", "handleActionBarAndStatusBar", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/vas/VASCommonFragment", "handleActionBarAndStatusBar", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view3 = this.f348648u;
        if (!(view3 == null || (layoutParams = view3.getLayoutParams()) == null)) {
            layoutParams.height = a;
            View view4 = this.f348648u;
            if (view4 != null) {
                view4.setLayoutParams(layoutParams);
            }
        }
        C113201a P = mo177563P();
        if (P != null) {
            P.mo165736a(a);
        }
        mo177565R();
        if (bundle == null) {
            VASActivity vASActivity2 = this.f348642o;
            if (vASActivity2 != null) {
                vASActivity2.setActionbarColor(vASActivity2.getActionbarColor());
            }
        } else if (bundle.containsKey("KEY_ACTIONBAR_COLOR")) {
            int i = bundle.getInt("KEY_ACTIONBAR_COLOR");
            VASActivity vASActivity3 = this.f348642o;
            if (vASActivity3 != null) {
                vASActivity3.setActionbarColor(i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0 = (r0 = r0.getWindow()).getDecorView();
     */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo177565R() {
        /*
            r12 = this;
            androidx.fragment.app.FragmentActivity r0 = r12.getActivity()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x0018
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x0018
            int r0 = r0.getSystemUiVisibility()
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            r0 = r0 & 2
            if (r0 != 0) goto L_0x001f
            r0 = 1
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            java.lang.String r2 = r12.f348641n
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "handleNavigationBar: isSysNavigationBarShown:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r3)
            if (r0 != 0) goto L_0x0098
            android.view.View r0 = r12.f348649v
            if (r0 != 0) goto L_0x003d
            goto L_0x007b
        L_0x003d:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2.mo10233c(r3)
            java.lang.Object[] r5 = r2.mo10232b()
            java.lang.String r6 = "com/tencent/mm/ui/vas/VASCommonFragment"
            java.lang.String r7 = "handleNavigationBar"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r0
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r1 = r2.mo10231a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r5 = "com/tencent/mm/ui/vas/VASCommonFragment"
            java.lang.String r6 = "handleNavigationBar"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x007b:
            android.view.View r0 = r12.f348649v
            if (r0 == 0) goto L_0x00dd
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L_0x00dd
            android.content.Context r1 = r12.getContext()
            int r1 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r1)
            r0.height = r1
            android.view.View r1 = r12.f348649v
            if (r1 != 0) goto L_0x0094
            goto L_0x00dd
        L_0x0094:
            r1.setLayoutParams(r0)
            goto L_0x00dd
        L_0x0098:
            android.view.View r0 = r12.f348649v
            if (r0 != 0) goto L_0x009d
            goto L_0x00dd
        L_0x009d:
            r2 = 8
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10.mo10233c(r2)
            java.lang.Object[] r3 = r10.mo10232b()
            java.lang.String r4 = "com/tencent/mm/ui/vas/VASCommonFragment"
            java.lang.String r5 = "handleNavigationBar"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r0
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = r10.mo10231a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r3 = "com/tencent/mm/ui/vas/VASCommonFragment"
            java.lang.String r4 = "handleNavigationBar"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.vas.VASCommonFragment.mo177565R():void");
    }

    /* renamed from: a */
    public void mo26410a(MotionEvent motionEvent) {
        String str = this.f348641n;
        StringBuilder sb = new StringBuilder();
        sb.append("onDispatchTouchEvent() called with: ev = ");
        sb.append(MotionEvent.actionToString(motionEvent != null ? motionEvent.getAction() : -1));
        Log.m105918d(str, sb.toString());
    }

    /* renamed from: b */
    public int mo26411b(boolean z) {
        String str = this.f348641n;
        Log.m105918d(str, "onViewReleased() called with: willSwipeBack = " + z);
        return 1;
    }

    public boolean enableSwipeBack() {
        return false;
    }

    /* renamed from: f */
    public boolean mo26413f(MotionEvent motionEvent) {
        return false;
    }

    public int getLayoutId() {
        VASActivity vASActivity = this.f348642o;
        int i = -1;
        int curLayoutId = vASActivity != null ? vASActivity.getCurLayoutId() : -1;
        if (curLayoutId != 0) {
            return curLayoutId;
        }
        UIComponent uIComponent = this.f165492f;
        if (uIComponent != null) {
            i = uIComponent.getLayoutId();
        }
        return i;
    }

    /* renamed from: h */
    public void mo26414h(int i, int i2, int i3, int i4, float f) {
        View view = null;
        if (f <= 0.0f) {
            VASCommonFragment vASCommonFragment = this.f348643p;
            if (vASCommonFragment != null) {
                view = vASCommonFragment.f348644q;
            }
            if (view != null) {
                view.setTranslationX(0.0f);
                return;
            }
            return;
        }
        float f2 = this.f348637G * (1.0f - f);
        VASCommonFragment vASCommonFragment2 = this.f348643p;
        if (vASCommonFragment2 != null) {
            view = vASCommonFragment2.f348644q;
        }
        if (view != null) {
            view.setTranslationX(f2);
        }
    }

    /* renamed from: i */
    public int mo26415i() {
        return 0;
    }

    /* renamed from: j */
    public void mo26416j(int i, int i2) {
        String str = this.f348641n;
        Log.m105918d(str, "onEdgeDragStarted() called with: edgeFlags = " + i + ", pointerId = " + i2);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        VASActivity vASActivity = this.f348642o;
        if (vASActivity != null) {
            vASActivity.callOnActivityResult(i, i2, intent);
        }
        String str = this.f348641n;
        Log.m105918d(str, "onActivityResult() called with: requestCode = " + i + ", resultCode = " + i2 + ", data = " + intent);
    }

    public void onAttach(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        String str = this.f348641n;
        Log.m105918d(str, "onAttach() called with: activity = " + activity);
        super.onAttach(activity);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            co3.c r0 = com.tencent.p014mm.p136ui.MMFragmentActivity.aReporter
            com.tencent.mm.ui.vas.VASActivity r1 = r3.f348642o
            r2 = 0
            if (r1 == 0) goto L_0x000c
            android.content.Intent r1 = r1.getIntent()
            goto L_0x000d
        L_0x000c:
            r1 = r2
        L_0x000d:
            r0.mo146072d(r1)
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            if (r0 == 0) goto L_0x0020
            r1 = 2131307180(0x7f092aac, float:1.823258E38)
            android.view.View r0 = r0.findViewById(r1)
            r2 = r0
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
        L_0x0020:
            r3.f348645r = r2
            super.onCreate(r4)
            java.lang.String r4 = r3.f348641n
            java.lang.String r0 = "onCreate"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r0)
            com.tencent.mm.ui.MMActivityController r4 = r3.f348638H
            com.tencent.mm.ui.vas.VASActivity r0 = r3.f348642o
            r4.mo177065Y(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.vas.VASCommonFragment.onCreate(android.os.Bundle):void");
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        boolean z2 = false;
        if (((i2 == C0966R.C0968anim.f2535fn || i2 == C0966R.C0968anim.f2536fo) || i2 == C0966R.C0968anim.f2537fp) || i2 == C0966R.C0968anim.f2538fq) {
            z2 = true;
        }
        if (!z2) {
            return super.onCreateAnimation(i, z, i2);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator onCreateAnimator(int r11, boolean r12, int r13) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            r2 = 2130772221(0x7f0100fd, float:1.7147554E38)
            r3 = 2130772220(0x7f0100fc, float:1.7147552E38)
            if (r13 != r3) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            if (r13 != r2) goto L_0x000f
        L_0x000d:
            r4 = 1
            goto L_0x0010
        L_0x000f:
            r4 = 0
        L_0x0010:
            r5 = 2130772222(0x7f0100fe, float:1.7147556E38)
            if (r4 == 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            if (r13 != r5) goto L_0x001a
        L_0x0018:
            r4 = 1
            goto L_0x001b
        L_0x001a:
            r4 = 0
        L_0x001b:
            r6 = 2130772223(0x7f0100ff, float:1.7147558E38)
            if (r4 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            if (r13 != r6) goto L_0x0025
        L_0x0023:
            r4 = 1
            goto L_0x0026
        L_0x0025:
            r4 = 0
        L_0x0026:
            if (r4 != 0) goto L_0x002d
            android.animation.Animator r11 = super.onCreateAnimator(r11, r12, r13)
            return r11
        L_0x002d:
            android.view.View r4 = r10.mo177562O()
            android.view.ViewParent r4 = r4.getParent()
            boolean r7 = r4 instanceof android.view.View
            r8 = 0
            if (r7 == 0) goto L_0x003d
            android.view.View r4 = (android.view.View) r4
            goto L_0x003e
        L_0x003d:
            r4 = r8
        L_0x003e:
            if (r4 == 0) goto L_0x015e
            int r4 = r4.getMeasuredWidth()
            android.view.View r7 = r10.mo177562O()
            android.view.ViewParent r7 = r7.getParent()
            boolean r9 = r7 instanceof android.view.View
            if (r9 == 0) goto L_0x0053
            android.view.View r7 = (android.view.View) r7
            goto L_0x0054
        L_0x0053:
            r7 = r8
        L_0x0054:
            if (r7 == 0) goto L_0x015e
            int r7 = r7.getMeasuredHeight()
            if (r13 != r3) goto L_0x0091
            java.lang.String r1 = r10.f348641n
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "createAnimForFragment() vas_anim_enter_holder enterAnim:"
            r2.append(r3)
            bo3.f r3 = r10.f348631A
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)
            com.tencent.mm.ui.vas.VASActivity r1 = r10.f348642o
            if (r1 == 0) goto L_0x007b
            r1.getActionBarData()
        L_0x007b:
            bo3.g r1 = new bo3.g
            r1.<init>()
            bo3.a r2 = r10.mo177563P()
            r1.f338712a = r2
            bo3.f r2 = r10.f348631A
            android.view.View r3 = r10.mo177562O()
            android.animation.Animator r1 = r2.mo17861a(r3, r4, r7, r1)
            goto L_0x00be
        L_0x0091:
            if (r13 != r2) goto L_0x00c1
            java.lang.String r1 = r10.f348641n
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "createAnimForFragment() vas_anim_exit_holder exitAnim:"
            r2.append(r3)
            bo3.f r3 = r10.f348632B
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)
            com.tencent.mm.ui.vas.VASActivity r1 = r10.f348642o
            if (r1 == 0) goto L_0x00b2
            r1.getActionBarData()
        L_0x00b2:
            bo3.f r1 = r10.f348632B
            android.view.View r2 = r10.mo177562O()
            bo3.g r3 = bo3.C113203g.f338711b
            android.animation.Animator r1 = r1.mo17861a(r2, r4, r7, r3)
        L_0x00be:
            r8 = r1
            goto L_0x013e
        L_0x00c1:
            r2 = 0
            if (r13 != r5) goto L_0x0105
            java.lang.String r5 = r10.f348641n
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "createAnimForFragment() vas_anim_pop_enter_holder popEnterAnim:"
            r6.append(r9)
            bo3.f r9 = r10.f348633C
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r6)
            com.tencent.mm.ui.vas.VASActivity r5 = r10.f348642o
            if (r5 == 0) goto L_0x00e4
            r5.getActionBarData()
        L_0x00e4:
            bo3.g r5 = new bo3.g
            r5.<init>()
            bo3.a r6 = r10.mo177563P()
            r5.f338712a = r6
            bo3.f r6 = r10.f348633C
            android.view.View r9 = r10.mo177562O()
            android.animation.Animator r4 = r6.mo17861a(r9, r4, r7, r5)
            if (r4 == 0) goto L_0x013e
            boolean r5 = vn3.C118691k.f355162a
            if (r5 == 0) goto L_0x013d
            vn3.C118691k.f355162a = r1
            r4.setDuration(r2)
            goto L_0x013d
        L_0x0105:
            if (r13 != r6) goto L_0x013e
            com.tencent.mm.ui.vas.VASActivity r5 = r10.f348642o
            if (r5 == 0) goto L_0x010e
            r5.getActionBarData()
        L_0x010e:
            java.lang.String r5 = r10.f348641n
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "createAnimForFragment() vas_anim_pop_exit_holder popExitAnim:"
            r6.append(r9)
            bo3.f r9 = r10.f348634D
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r6)
            bo3.f r5 = r10.f348634D
            android.view.View r6 = r10.mo177562O()
            bo3.g r9 = bo3.C113203g.f338711b
            android.animation.Animator r4 = r5.mo17861a(r6, r4, r7, r9)
            if (r4 == 0) goto L_0x013e
            boolean r5 = vn3.C118691k.f355163b
            if (r5 == 0) goto L_0x013d
            vn3.C118691k.f355163b = r1
            r4.setDuration(r2)
        L_0x013d:
            r8 = r4
        L_0x013e:
            boolean r1 = r8 instanceof android.animation.ValueAnimator
            if (r1 == 0) goto L_0x015e
            int r1 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()
            if (r1 > r0) goto L_0x0153
            r0 = r8
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            vn3.i r1 = new vn3.i
            r1.<init>(r10)
            r0.addUpdateListener(r1)
        L_0x0153:
            r0 = r8
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            vn3.j r1 = new vn3.j
            r1.<init>(r13, r10, r8)
            r0.addListener(r1)
        L_0x015e:
            java.lang.String r0 = r10.f348641n
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onCreateAnimator() called with: animator = "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = " transit = "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = ", enter = "
            r1.append(r11)
            r1.append(r12)
            java.lang.String r11 = ", nextAnim = "
            r1.append(r11)
            r1.append(r13)
            java.lang.String r11 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r11)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.vas.VASCommonFragment.onCreateAnimator(int, boolean, int):android.animation.Animator");
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C87412m.m108594g(menu, "menu");
        C87412m.m108594g(menuInflater, "inflater");
        VASActivity vASActivity = this.f348642o;
        if (vASActivity != null) {
            vASActivity.onCreateOptionsMenu(menu);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SwipeBackLayout swipeBackLayout;
        C87412m.m108594g(layoutInflater, "inflater");
        String str = this.f348641n;
        Log.m105924i(str, "onCreateView:" + getId());
        setHasOptionsMenu(true);
        View s = this.f348638H.mo177094s();
        this.f348644q = s;
        if (!(viewGroup == null || s == null || !(s.getParent() instanceof ViewGroup))) {
            ViewParent parent = s.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup2 = (ViewGroup) parent;
            String str2 = this.f348641n;
            Log.m105918d(str2, "onCreateView removeView vg:" + viewGroup2);
            viewGroup2.removeView(s);
        }
        View view = this.f348644q;
        if (view != null) {
            Iterator<UIComponent> it = this.f165491e.iterator();
            while (it.hasNext()) {
                it.next().setRootView(view);
            }
            if (!this.f348652y) {
                this.f165494h = view;
                Iterator<UIComponent> it4 = this.f165491e.iterator();
                while (it4.hasNext()) {
                    it4.next().onCreateBefore(bundle);
                }
                this.f348652y = true;
            }
        }
        View view2 = this.f348644q;
        VASActivity vASActivity = this.f348642o;
        if (!(vASActivity != null && vASActivity.isSupportNavigationSwipeBack())) {
            return view2;
        }
        if (!this.f348653z.getBooleanExtra(VASActivity.KEY_DISABLE_ACTIVITY_SWIPE_BACK, false) && this.f348643p == null) {
            return view2;
        }
        View view3 = this.f165494h;
        C87412m.m108591d(view3);
        ViewParent parent2 = view3.getParent();
        ViewGroup viewGroup3 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup3 != null) {
            View inflate = LayoutInflater.from(getActivity()).inflate(C0966R.C0971layout.c7z, viewGroup3, false);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.SwipeBackLayout");
            viewGroup3.removeView(view3);
            viewGroup3.addView(this.f348650w);
            swipeBackLayout = (SwipeBackLayout) inflate;
        } else {
            View inflate2 = LayoutInflater.from(getActivity()).inflate(C0966R.C0971layout.c7z, (ViewGroup) null);
            C87412m.m108592e(inflate2, "null cannot be cast to non-null type com.tencent.mm.ui.widget.SwipeBackLayout");
            swipeBackLayout = (SwipeBackLayout) inflate2;
        }
        swipeBackLayout.addView(view3);
        swipeBackLayout.setContentView(view3);
        if (swipeBackLayout.getChildCount() > 0) {
            View childAt = swipeBackLayout.getChildAt(0);
            swipeBackLayout.removeView(childAt);
            C87763b bVar = new C87763b(swipeBackLayout.getContext());
            bVar.addView(childAt, new FrameLayout.LayoutParams(-1, -1));
            swipeBackLayout.addView(bVar);
            swipeBackLayout.setContentView(bVar);
            this.f348651x = bVar;
        }
        swipeBackLayout.mo26381c(true);
        swipeBackLayout.setSwipeGestureDelegate(new C118689g(this));
        swipeBackLayout.setSwipeBackListener(this);
        this.f348650w = swipeBackLayout;
        this.f348644q = swipeBackLayout;
        return swipeBackLayout;
    }

    public void onDestroy() {
        Log.m105918d(this.f348641n, "onDestroy() called");
        super.onDestroy();
        if (!this.f348635E) {
            if (this.f348653z.getBooleanExtra(VASActivity.KEY_VAS_LAUNCHER_ENTER_PAGE, false)) {
                Log.m105918d(this.f348641n, "checkFinishVASLauncherEnterPageAnimStart");
                FragmentActivity activity = getActivity();
                if (activity instanceof VASLauncher) {
                    ((VASLauncher) activity).mo101369I7();
                }
            }
            if (this.f348653z.getBooleanExtra(VASActivity.KEY_VAS_LAUNCHER_ENTER_PAGE, false)) {
                Log.m105918d(this.f348641n, "finishVASLauncherEnterPage");
                VASActivity vASActivity = this.f348642o;
                if (vASActivity != null) {
                    vASActivity.finish();
                }
            }
            this.f348635E = true;
        }
    }

    public void onDestroyView() {
        Log.m105918d(this.f348641n, "onDestroyView() called");
        super.onDestroyView();
    }

    public void onPause() {
        Log.m105918d(this.f348641n, "onPause() called");
        super.onPause();
    }

    public void onPrepareOptionsMenu(Menu menu) {
        C87412m.m108594g(menu, "menu");
        VASActivity vASActivity = this.f348642o;
        if (vASActivity != null) {
            vASActivity.onPrepareOptionsMenu(menu);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        VASActivity vASActivity = this.f348642o;
        if (vASActivity != null) {
            vASActivity.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onResume() {
        Log.m105918d(this.f348641n, "onResume() called");
        super.onResume();
        FragmentActivity activity = getActivity();
        View view = null;
        if (activity instanceof VASCommonActivity) {
            mo177564Q((Bundle) null);
            VASActivity vASActivity = this.f348642o;
            boolean z = vASActivity != null && vASActivity.isSupportNavigationSwipeBack();
            boolean z2 = !this.f348653z.getBooleanExtra(VASActivity.KEY_DISABLE_ACTIVITY_SWIPE_BACK, false) && this.f348643p == null;
            if (z) {
                SwipeBackLayout swipeBackLayout = ((VASCommonActivity) activity).getSwipeBackLayout();
                if (swipeBackLayout != null) {
                    swipeBackLayout.setEnableGesture(z2);
                }
                SwipeBackLayout swipeBackLayout2 = this.f348650w;
                if (swipeBackLayout2 != null) {
                    swipeBackLayout2.setEnableGesture(!z2);
                }
            } else {
                SwipeBackLayout swipeBackLayout3 = ((VASCommonActivity) activity).getSwipeBackLayout();
                if (swipeBackLayout3 != null) {
                    swipeBackLayout3.setEnableGesture(false);
                }
                SwipeBackLayout swipeBackLayout4 = this.f348650w;
                if (swipeBackLayout4 != null) {
                    swipeBackLayout4.setEnableGesture(false);
                }
            }
        }
        VASCommonFragment vASCommonFragment = this.f348643p;
        if (vASCommonFragment != null) {
            view = vASCommonFragment.f348644q;
        }
        FrameLayout frameLayout = this.f348645r;
        if (view != null && frameLayout != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                if (!C87412m.m108589b(parent, frameLayout)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    viewGroup.endViewTransition(view);
                    viewGroup.removeView(view);
                    frameLayout.removeAllViews();
                    frameLayout.addView(view);
                }
            } else if (parent == null) {
                frameLayout.removeAllViews();
                frameLayout.addView(view);
            }
            this.f348637G = view.getTranslationX();
            String str = this.f348641n;
            Log.m105918d(str, "setLastFragmentBack maxTransX:" + this.f348637G + " viewHash:" + view.hashCode());
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C87412m.m108594g(bundle, "outState");
        super.onSaveInstanceState(bundle);
        String str = this.f348641n;
        Log.m105918d(str, "onSaveInstanceState() called with: outState = " + bundle);
        VASActivity vASActivity = this.f348642o;
        bundle.putInt("KEY_ACTIONBAR_COLOR", vASActivity != null ? vASActivity.getActionbarColor() : 0);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        String str = this.f348641n;
        Log.m105918d(str, "onViewCreated() called with: view = " + view + ", savedInstanceState = " + bundle);
        this.f348646s = view.findViewById(C0966R.C0970id.fjx);
        this.f348647t = view.findViewById(C0966R.C0970id.f5386dr);
        this.f348648u = view.findViewById(C0966R.C0970id.l3a);
        this.f348649v = view.findViewById(C0966R.C0970id.l36);
        VASActivity vASActivity = this.f348642o;
        if (vASActivity != null) {
            getLifecycle().addObserver(vASActivity);
        }
        mo177564Q(bundle);
    }

    public void onWindowFocusChanged(boolean z) {
        if (z) {
            if (!(getActivity() instanceof VASCommonActivity)) {
                VASActivity vASActivity = this.f348642o;
                boolean z2 = false;
                if (vASActivity != null && !vASActivity.getDisableCommonAreaControl()) {
                    z2 = true;
                }
                if (!z2) {
                    return;
                }
            }
            mo177565R();
        }
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
        Intent intent = new Intent();
        this.f348653z = intent;
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
    }

    public void onAttach(Context context) {
        C112958r<FragmentActivity> rVar;
        Class<Activity> cls = Activity.class;
        C87412m.m108594g(context, "context");
        String str = this.f348641n;
        Log.m105918d(str, "onAttach() called with: context = " + context);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable(VASActivity.KEY_CLS);
            C87412m.m108592e(serializable, "null cannot be cast to non-null type java.lang.Class<com.tencent.mm.ui.vas.VASActivity>");
            FragmentActivity activity = getActivity();
            VASActivity vASActivity = (VASActivity) ((Class) serializable).getConstructor(new Class[0]).newInstance(new Object[0]);
            this.f348642o = vASActivity;
            if (!(vASActivity == null || (rVar = vASActivity.get_hostCallback()) == null)) {
                Field declaredField = FragmentManager.class.getDeclaredField("mHost");
                declaredField.setAccessible(true);
                declaredField.set(getChildFragmentManager(), rVar);
            }
            VASActivity vASActivity2 = this.f348642o;
            if (vASActivity2 != null) {
                vASActivity2.set_childFragmentManager(getChildFragmentManager());
            }
            VASActivity vASActivity3 = this.f348642o;
            if (vASActivity3 != null) {
                vASActivity3.set_parentFragmentManager(getParentFragmentManager());
            }
            VASActivity vASActivity4 = this.f348642o;
            if (vASActivity4 != null) {
                vASActivity4.set_fragment(this);
            }
            if (activity != null) {
                VASActivity vASActivity5 = this.f348642o;
                if (vASActivity5 != null) {
                    vASActivity5.set_activity(activity);
                }
                VASActivity vASActivity6 = this.f348642o;
                if (vASActivity6 != null) {
                    vASActivity6.setInnerContext(activity);
                }
                try {
                    Field declaredField2 = cls.getDeclaredField("mApplication");
                    declaredField2.setAccessible(true);
                    declaredField2.set(this.f348642o, activity.getApplication());
                } catch (Throwable th) {
                    Log.printErrStackTrace(this.f348641n, th, "onAttach application err", new Object[0]);
                }
                try {
                    Field declaredField3 = cls.getDeclaredField("mMainThread");
                    declaredField3.setAccessible(true);
                    declaredField3.set(this.f348642o, declaredField3.get(activity));
                    Field declaredField4 = cls.getDeclaredField("mInstrumentation");
                    declaredField4.setAccessible(true);
                    declaredField4.set(this.f348642o, declaredField4.get(activity));
                } catch (Throwable th4) {
                    Log.printErrStackTrace(this.f348641n, th4, "bindRealActivityData err", new Object[0]);
                }
            }
            VASActivity vASActivity7 = this.f348642o;
            if (vASActivity7 != null) {
                vASActivity7.onInited();
            }
            VASActivity vASActivity8 = this.f348642o;
            if (vASActivity8 != null) {
                vASActivity8.initVasController();
            }
            VASActivity vASActivity9 = this.f348642o;
            if (vASActivity9 != null) {
                vASActivity9.fixStatusbar(true);
            }
        }
        super.onAttach(context);
        C32226l<? super VASActivity, C13598b0> lVar = this.f348636F;
        if (lVar != null) {
            lVar.invoke(this.f348642o);
        }
    }
}
