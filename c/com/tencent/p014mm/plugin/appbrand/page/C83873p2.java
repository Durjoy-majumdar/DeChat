package com.tencent.p014mm.plugin.appbrand.page;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import br0.C39836d;
import cl0.C80071t;
import cl0.C80072u;
import com.tencent.luggage.game.page.C80211b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.container.AppBrandNativeContainerView;
import com.tencent.p014mm.plugin.appbrand.jsapi.container.WrapperNativeContainerView;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.appbrand.page.C83803f4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.SyncTask;
import eb0.C86493v0;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.appbrand.page.p2 */
public class C83873p2 implements C82520h.C82521a {

    /* renamed from: a */
    public ViewGroup f244867a;

    /* renamed from: b */
    public MMHandler f244868b;

    /* renamed from: c */
    public final Deque<C83880g> f244869c;

    /* renamed from: d */
    public int f244870d = -1;

    /* renamed from: e */
    public float[] f244871e;

    /* renamed from: f */
    public View f244872f;

    /* renamed from: g */
    public C83798e4 f244873g;

    /* renamed from: h */
    public C39836d f244874h;

    /* renamed from: i */
    public int f244875i = -1;

    /* renamed from: j */
    public C83809g3 f244876j;

    /* renamed from: k */
    public AppBrandPageFullScreenView f244877k;

    /* renamed from: l */
    public FrameLayout f244878l;

    /* renamed from: m */
    public C83833j3 f244879m;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.p2$a */
    public class C83874a extends SyncTask<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ View f244880a;

        /* renamed from: b */
        public final /* synthetic */ int f244881b;

        /* renamed from: c */
        public final /* synthetic */ int f244882c;

        /* renamed from: d */
        public final /* synthetic */ float[] f244883d;

        /* renamed from: e */
        public final /* synthetic */ int f244884e;

        /* renamed from: f */
        public final /* synthetic */ boolean f244885f;

        /* renamed from: g */
        public final /* synthetic */ boolean f244886g;

        /* renamed from: h */
        public final /* synthetic */ boolean f244887h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83874a(long j, Boolean bool, View view, int i, int i2, float[] fArr, int i3, boolean z, boolean z2, boolean z3) {
            super(j, bool);
            this.f244880a = view;
            this.f244881b = i;
            this.f244882c = i2;
            this.f244883d = fArr;
            this.f244884e = i3;
            this.f244885f = z;
            this.f244886g = z2;
            this.f244887h = z3;
        }

        public Object run() {
            return Boolean.valueOf(C83873p2.this.mo116429g(this.f244880a, this.f244881b, this.f244882c, this.f244883d, this.f244884e, this.f244885f, this.f244886g, this.f244887h));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.p2$b */
    public class C83875b extends SyncTask<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ int f244889a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83875b(long j, Boolean bool, int i) {
            super(j, bool);
            this.f244889a = i;
        }

        public Object run() {
            return Boolean.valueOf(C83873p2.this.mo116442t(this.f244889a));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.p2$c */
    public class C83876c extends SyncTask<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ int f244891a;

        /* renamed from: b */
        public final /* synthetic */ float[] f244892b;

        /* renamed from: c */
        public final /* synthetic */ int f244893c;

        /* renamed from: d */
        public final /* synthetic */ Boolean f244894d;

        /* renamed from: e */
        public final /* synthetic */ Boolean f244895e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83876c(long j, Boolean bool, int i, float[] fArr, int i2, Boolean bool2, Boolean bool3) {
            super(j, bool);
            this.f244891a = i;
            this.f244892b = fArr;
            this.f244893c = i2;
            this.f244894d = bool2;
            this.f244895e = bool3;
        }

        public Object run() {
            return Boolean.valueOf(C83873p2.this.mo116447y(this.f244891a, this.f244892b, this.f244893c, this.f244894d, this.f244895e));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.p2$d */
    public class C83877d extends SyncTask<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ int f244897a;

        /* renamed from: b */
        public final /* synthetic */ C83798e4 f244898b;

        /* renamed from: c */
        public final /* synthetic */ int f244899c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83877d(long j, Boolean bool, int i, C83798e4 e4Var, int i2) {
            super(j, bool);
            this.f244897a = i;
            this.f244898b = e4Var;
            this.f244899c = i2;
        }

        public Object run() {
            C83880g q;
            WeakReference<View> weakReference;
            View view;
            ViewGroup viewGroup;
            C83880g q2;
            ViewGroup o;
            C83873p2 p2Var = C83873p2.this;
            int i = this.f244897a;
            C83798e4 e4Var = this.f244898b;
            int i2 = this.f244899c;
            boolean z = false;
            if (!(i == p2Var.f244870d || (q = p2Var.mo116439q(i)) == null || (weakReference = q.f244907a) == null || (view = weakReference.get()) == null)) {
                p2Var.f244875i = i;
                ViewGroup o2 = p2Var.mo116437o(q.f244909c, false, false);
                if ((o2 instanceof AppBrandNativeContainerView) && ((AppBrandNativeContainerView) o2).f241362d && (q2 = p2Var.mo116439q(q.f244909c)) != null && (o = p2Var.mo116437o(q2.f244909c, false, false)) != null) {
                    View view2 = q.f244907a.get();
                    if (view2 != null) {
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                        view2.setLayoutParams(layoutParams);
                    }
                    p2Var.f244875i = q2.f244908b;
                    q = q2;
                    o2 = o;
                }
                if (o2 != null) {
                    view = q.f244907a.get();
                    int indexOfChild = o2.indexOfChild(view);
                    View view3 = p2Var.f244872f;
                    if (!(view3 == null || (viewGroup = (ViewGroup) view3.getParent()) == null)) {
                        viewGroup.removeView(p2Var.f244872f);
                    }
                    o2.addView(p2Var.f244872f, indexOfChild);
                    o2.removeView(view);
                }
                p2Var.f244871e = new float[]{view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight(), (float) q.f244910d};
                p2Var.f244874h.mo62475c(view, i2);
                p2Var.f244870d = i;
                p2Var.f244873g = e4Var;
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.p2$e */
    public class C83878e extends SyncTask<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ int f244901a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83878e(long j, Boolean bool, int i) {
            super(j, bool);
            this.f244901a = i;
        }

        public Object run() {
            C83873p2 p2Var = C83873p2.this;
            int i = this.f244901a;
            boolean z = false;
            if (i == p2Var.f244870d && p2Var.mo116439q(i) != null) {
                p2Var.f244874h.mo62476d();
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.p2$f */
    public static final class C83879f implements C83803f4.C83804a {

        /* renamed from: a */
        public View f244903a;

        /* renamed from: b */
        public float f244904b;

        /* renamed from: c */
        public float f244905c;

        /* renamed from: d */
        public float f244906d;

        public C83879f(C83863o2 o2Var) {
        }

        public void onScrollChange(View view, int i, int i2, int i3, int i4) {
            float f = (float) i;
            this.f244906d = f;
            this.f244903a.setX(this.f244904b + f);
            this.f244903a.setY(this.f244905c + ((float) i2));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.p2$g */
    public static final class C83880g {

        /* renamed from: a */
        public WeakReference<View> f244907a;

        /* renamed from: b */
        public int f244908b;

        /* renamed from: c */
        public int f244909c;

        /* renamed from: d */
        public int f244910d;

        /* renamed from: e */
        public boolean f244911e;

        /* renamed from: f */
        public boolean f244912f;

        /* renamed from: g */
        public boolean f244913g;

        /* renamed from: h */
        public C83879f f244914h;

        public C83880g(View view, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
            this.f244907a = new WeakReference<>(view);
            this.f244908b = i;
            this.f244909c = i2;
            this.f244910d = i3;
            this.f244911e = z;
            this.f244912f = z2;
            this.f244913g = z3;
        }
    }

    public C83873p2(ViewGroup viewGroup) {
        this.f244867a = viewGroup;
        this.f244868b = new MMHandler(Looper.getMainLooper());
        this.f244869c = new ConcurrentLinkedDeque();
        this.f244872f = new View(viewGroup.getContext());
    }

    /* renamed from: d */
    public static void m103216d(C83873p2 p2Var) {
        p2Var.getClass();
        LinkedList linkedList = new LinkedList();
        Iterator it = ((ConcurrentLinkedDeque) p2Var.f244869c).iterator();
        while (it.hasNext()) {
            linkedList.add((C83880g) it.next());
        }
        Iterator it4 = linkedList.iterator();
        while (it4.hasNext()) {
            p2Var.mo116442t(((C83880g) it4.next()).f244908b);
        }
        linkedList.clear();
    }

    /* renamed from: a */
    public C86493v0.C86495c mo86860a(int i, boolean z) {
        C86493v0 d = C86493v0.m107224d();
        return d.mo120947c(hashCode() + "#" + i, z);
    }

    /* renamed from: b */
    public C86493v0.C86495c mo86861b(int i) {
        C86493v0 d = C86493v0.m107224d();
        return d.mo120948e(hashCode() + "#" + i);
    }

    /* renamed from: c */
    public boolean mo114857c(View view, int i, int i2, float[] fArr, int i3, boolean z, boolean z2, boolean z3) {
        C83874a aVar = new C83874a(1000, Boolean.FALSE, view, i, i2, fArr, i3, z, z2, z3);
        return Thread.currentThread() == Looper.getMainLooper().getThread() ? ((Boolean) aVar.exec((MMHandler) null)).booleanValue() : ((Boolean) aVar.exec(this.f244868b)).booleanValue();
    }

    /* renamed from: e */
    public boolean mo116410e(View view, int i, int i2, float[] fArr, int i3, boolean z) {
        return mo116411f(view, i, i2, fArr, i3, z, false);
    }

    /* renamed from: f */
    public boolean mo116411f(View view, int i, int i2, float[] fArr, int i3, boolean z, boolean z2) {
        return mo114857c(view, i, i2, fArr, i3, z, z2, false);
    }

    /* renamed from: g */
    public final boolean mo116429g(View view, int i, int i2, float[] fArr, int i3, boolean z, boolean z2, boolean z3) {
        ViewGroup o;
        float f;
        float f2;
        int i4;
        int i5;
        ViewGroup.LayoutParams layoutParams;
        float f3;
        float f4;
        View view2 = view;
        int i6 = i2;
        float[] fArr2 = fArr;
        if (view2 == null || fArr2 == null || fArr2.length < 5 || (o = mo116437o(i6, z2, z3)) == null || mo116438p(i) != null) {
            return false;
        }
        float f5 = fArr2[0];
        float f6 = fArr2[1];
        float f7 = fArr2[2];
        float f8 = fArr2[3];
        float f9 = fArr2[4];
        int i7 = Float.isNaN(f9) ? 0 : (int) f9;
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams((int) f7, (int) f8);
        Iterator it = ((ConcurrentLinkedDeque) this.f244869c).iterator();
        int i8 = 0;
        while (it.hasNext()) {
            C83880g gVar = (C83880g) it.next();
            if (i6 == gVar.f244909c && i7 >= gVar.f244910d) {
                i8++;
            }
        }
        if (i8 < 0) {
            i8 = 0;
        }
        int targetViewChildCount = o instanceof C80071t ? ((C80071t) o).getTargetViewChildCount() : o.getChildCount();
        int i9 = i8 > targetViewChildCount ? targetViewChildCount : i8;
        if (i3 >= 0) {
            int i15 = i3 == 0 ? 0 : 4;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i15));
            i4 = i7;
            f2 = f6;
            f = f5;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/page/AppBrandWebViewCustomViewContainer", "addViewImpl", "(Landroid/view/View;II[FIZZZ)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/page/AppBrandWebViewCustomViewContainer", "addViewImpl", "(Landroid/view/View;II[FIZZZ)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i5 = i9;
            layoutParams = layoutParams2;
        } else {
            i4 = i7;
            f2 = f6;
            f = f5;
            i5 = i9;
            layoutParams = layoutParams2;
        }
        o.addView(view2, i5, layoutParams);
        C83880g gVar2 = new C83880g(view, i, i2, i4, z, z2, z3);
        mo116430h(gVar2);
        if (i6 != 0 || !(o instanceof C83803f4) || !z) {
            f3 = f;
            f4 = f2;
        } else {
            C83879f fVar = new C83879f((C83863o2) null);
            fVar.f244903a = view2;
            float f15 = f;
            fVar.f244904b = f15;
            float f16 = f2;
            fVar.f244905c = f16;
            fVar.f244906d = (float) this.f244867a.getScrollX();
            f3 = f15 + fVar.f244906d;
            f4 = f16 + ((float) this.f244867a.getScrollY());
            ((C83803f4) o).mo116267h(fVar);
            gVar2.f244914h = fVar;
        }
        view2.setX(f3);
        view2.setY(f4);
        return true;
    }

    /* renamed from: h */
    public final void mo116430h(C83880g gVar) {
        Log.m105925i("MicroMsg.AppBrandWebViewCustomViewContainer", "addViewInfo: [%d, %d]", Integer.valueOf(gVar.f244908b), Integer.valueOf(gVar.f244909c));
        ((ConcurrentLinkedDeque) this.f244869c).add(gVar);
    }

    /* renamed from: i */
    public void mo116431i() {
        Log.m105924i("MicroMsg.AppBrandWebViewCustomViewContainer", "clear: ");
        Iterator it = ((ConcurrentLinkedDeque) this.f244869c).iterator();
        while (it.hasNext()) {
            C86493v0.C86495c b = mo86861b(((C83880g) it.next()).f244908b);
            if (b != null) {
                b.mo120961h();
            }
        }
        ((ConcurrentLinkedDeque) this.f244869c).clear();
    }

    /* renamed from: j */
    public boolean mo116432j(int i, C83798e4 e4Var, int i2) {
        C83877d dVar = new C83877d(1000, Boolean.FALSE, i, e4Var, i2);
        return Thread.currentThread() == Looper.getMainLooper().getThread() ? ((Boolean) dVar.exec((MMHandler) null)).booleanValue() : ((Boolean) dVar.exec(this.f244868b)).booleanValue();
    }

    /* renamed from: k */
    public boolean mo116433k(int i) {
        C83878e eVar = new C83878e(1000, Boolean.FALSE, i);
        return Thread.currentThread() == Looper.getMainLooper().getThread() ? ((Boolean) eVar.exec((MMHandler) null)).booleanValue() : ((Boolean) eVar.exec(this.f244868b)).booleanValue();
    }

    /* renamed from: l */
    public final List<C83880g> mo116434l(C83880g gVar) {
        if (gVar.f244909c == gVar.f244908b) {
            return new LinkedList();
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = ((ConcurrentLinkedDeque) this.f244869c).iterator();
        while (it.hasNext()) {
            C83880g gVar2 = (C83880g) it.next();
            if (gVar.f244908b == gVar2.f244909c && gVar.f244909c != gVar2.f244908b) {
                linkedList.addAll(mo116434l(gVar2));
            }
        }
        linkedList.add(gVar);
        return linkedList;
    }

    /* renamed from: m */
    public int mo116435m(int i) {
        C83880g q;
        int i2;
        if (i == 0 || (q = mo116439q(i)) == null) {
            return -1;
        }
        View view = q.f244907a.get();
        if (view instanceof CoverViewContainer) {
            boolean z = ((CoverViewContainer) view).f241373o;
            if (z) {
                return q.f244908b;
            }
            if (!z && (i2 = q.f244909c) > 0) {
                return mo116435m(i2);
            }
        }
        return -1;
    }

    /* renamed from: n */
    public ViewGroup mo116436n() {
        if (this.f244877k == null) {
            AppBrandPageFullScreenView appBrandPageFullScreenView = new AppBrandPageFullScreenView(this.f244867a.getContext());
            this.f244877k = appBrandPageFullScreenView;
            C83809g3 g3Var = this.f244876j;
            if (g3Var != null) {
                g3Var.mo111277a(appBrandPageFullScreenView);
            }
        }
        return this.f244877k;
    }

    /* renamed from: o */
    public final ViewGroup mo116437o(int i, boolean z, boolean z2) {
        if (z2) {
            if (this.f244878l == null) {
                FrameLayout frameLayout = new FrameLayout(this.f244867a.getContext());
                this.f244878l = frameLayout;
                C83833j3 j3Var = this.f244879m;
                if (j3Var != null) {
                    C80211b.C80215c cVar = (C80211b.C80215c) j3Var;
                    if (frameLayout.getParent() == null) {
                        C80211b.this.f234768f.addView(frameLayout, 0, new ViewGroup.LayoutParams(-1, -1));
                    }
                }
            }
            return this.f244878l;
        } else if (z) {
            return mo116436n();
        } else {
            if (i == 0) {
                return this.f244867a;
            }
            C83880g q = mo116439q(i);
            if (q == null) {
                return null;
            }
            View view = q.f244907a.get();
            if ((view instanceof WrapperNativeContainerView) && (view instanceof C80072u) && (view instanceof ViewGroup)) {
                return (ViewGroup) ((WrapperNativeContainerView) view).mo114736d(AppBrandNativeContainerView.class);
            }
            if (!(view instanceof C80072u) || !(view instanceof ViewGroup)) {
                return null;
            }
            return (ViewGroup) view;
        }
    }

    /* renamed from: p */
    public View mo116438p(int i) {
        C83880g q = mo116439q(i);
        if (q == null) {
            return null;
        }
        return q.f244907a.get();
    }

    /* renamed from: q */
    public final C83880g mo116439q(int i) {
        Iterator it = ((ConcurrentLinkedDeque) this.f244869c).iterator();
        while (it.hasNext()) {
            C83880g gVar = (C83880g) it.next();
            if (gVar.f244908b == i) {
                return gVar;
            }
        }
        return null;
    }

    /* renamed from: r */
    public boolean mo116440r(int i) {
        C83880g q;
        int i2;
        if (i == 0 || (q = mo116439q(i)) == null) {
            return false;
        }
        View view = q.f244907a.get();
        if (view instanceof CoverViewContainer) {
            boolean z = ((CoverViewContainer) view).f241373o;
            if (z) {
                return true;
            }
            if (!z && (i2 = q.f244909c) > 0) {
                return mo116440r(i2);
            }
        }
        return false;
    }

    /* renamed from: s */
    public boolean mo116441s(int i) {
        C83875b bVar = new C83875b(1000, Boolean.FALSE, i);
        return Thread.currentThread() == Looper.getMainLooper().getThread() ? ((Boolean) bVar.exec((MMHandler) null)).booleanValue() : ((Boolean) bVar.exec(this.f244868b)).booleanValue();
    }

    /* renamed from: t */
    public final boolean mo116442t(int i) {
        C83880g q = mo116439q(i);
        if (q == null) {
            return false;
        }
        if (i == this.f244870d && mo116439q(i) != null) {
            this.f244874h.mo62476d();
        }
        mo116444v(q);
        ViewGroup o = mo116437o(q.f244909c, q.f244912f, q.f244913g);
        if (o == null) {
            return false;
        }
        mo116443u(q);
        o.removeView(q.f244907a.get());
        if (q.f244909c != 0 || !(o instanceof C83803f4) || !q.f244911e) {
            return true;
        }
        ((C83803f4) o).mo116266a(q.f244914h);
        return true;
    }

    /* renamed from: u */
    public final void mo116443u(C83880g gVar) {
        Log.m105925i("MicroMsg.AppBrandWebViewCustomViewContainer", "removeViewInfo: [%d, %d]", Integer.valueOf(gVar.f244908b), Integer.valueOf(gVar.f244909c));
        ((ConcurrentLinkedDeque) this.f244869c).remove(gVar);
    }

    /* renamed from: v */
    public final void mo116444v(C83880g gVar) {
        try {
            for (C83880g u : mo116434l(gVar)) {
                mo116443u(u);
            }
        } catch (StackOverflowError unused) {
            LinkedList linkedList = new LinkedList(this.f244869c);
            Log.m105924i("MicroMsg.AppBrandWebViewCustomViewContainer", "dumpViewInfoBeforeCrash: oops");
            Log.m105925i("MicroMsg.AppBrandWebViewCustomViewContainer", "dumpViewInfoBeforeCrash: root: [id] = %d [parent] = %d", Integer.valueOf(gVar.f244908b), Integer.valueOf(gVar.f244909c));
            Log.m105924i("MicroMsg.AppBrandWebViewCustomViewContainer", "==================ViewInfoListBegin==================");
            Iterator it = linkedList.iterator();
            int i = -1;
            while (it.hasNext()) {
                C83880g gVar2 = (C83880g) it.next();
                i++;
                Log.m105925i("MicroMsg.AppBrandWebViewCustomViewContainer", "dumpViewInfoBeforeCrash: vi#%d [id] = %d [parent] = %d", Integer.valueOf(i), Integer.valueOf(gVar2.f244908b), Integer.valueOf(gVar2.f244909c));
            }
            Log.m105924i("MicroMsg.AppBrandWebViewCustomViewContainer", "==================ViewInfoListEnd==================");
            Log.appenderFlushSync();
            throw new StackOverflowError();
        }
    }

    /* renamed from: w */
    public void mo116445w(C83809g3 g3Var) {
        boolean z = true;
        Object[] objArr = new Object[1];
        if (g3Var == null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.AppBrandWebViewCustomViewContainer", "setFullScreenViewObtainer fullScreenViewAttacher:%b", objArr);
        this.f244876j = g3Var;
        AppBrandPageFullScreenView appBrandPageFullScreenView = this.f244877k;
        if (appBrandPageFullScreenView != null) {
            g3Var.mo111277a(appBrandPageFullScreenView);
        }
    }

    /* renamed from: x */
    public boolean mo116446x(int i, float[] fArr, int i2, Boolean bool, Boolean bool2) {
        C83876c cVar = new C83876c(1000, Boolean.FALSE, i, fArr, i2, bool, bool2);
        return Thread.currentThread() == Looper.getMainLooper().getThread() ? ((Boolean) cVar.exec((MMHandler) null)).booleanValue() : ((Boolean) cVar.exec(this.f244868b)).booleanValue();
    }

    /* renamed from: y */
    public final boolean mo116447y(int i, float[] fArr, int i2, Boolean bool, Boolean bool2) {
        int i3 = i;
        float[] fArr2 = fArr;
        if (this.f244875i == i3 || this.f244870d == i3) {
            return true;
        }
        C83880g q = mo116439q(i);
        if (q == null) {
            return false;
        }
        View view = q.f244907a.get();
        boolean booleanValue = bool2 != null ? bool2.booleanValue() : q.f244912f;
        ViewGroup o = mo116437o(q.f244909c, booleanValue, q.f244913g);
        if (o == null) {
            return false;
        }
        if (i2 >= 0) {
            int i4 = i2 == 0 ? 0 : 4;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i4));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/page/AppBrandWebViewCustomViewContainer", "updateViewImpl", "(I[FILjava/lang/Boolean;Ljava/lang/Boolean;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/page/AppBrandWebViewCustomViewContainer", "updateViewImpl", "(I[FILjava/lang/Boolean;Ljava/lang/Boolean;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (fArr2 == null || fArr2.length < 5) {
            return true;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        float f4 = fArr2[3];
        float f5 = fArr2[4];
        int i5 = q.f244910d;
        if (!Float.isNaN(f5)) {
            i5 = (int) f5;
        }
        boolean booleanValue2 = bool != null ? bool.booleanValue() : q.f244911e;
        if (q.f244910d == i5 && q.f244912f == booleanValue) {
            C83879f fVar = q.f244914h;
            if (q.f244909c == 0 && (o instanceof C83803f4) && booleanValue2 != q.f244911e) {
                if (booleanValue2) {
                    if (fVar == null) {
                        fVar = new C83879f((C83863o2) null);
                        fVar.f244903a = view;
                        q.f244914h = fVar;
                    }
                    ((C83803f4) o).mo116267h(fVar);
                } else {
                    ((C83803f4) o).mo116266a(fVar);
                }
            }
            if (fVar != null) {
                fVar.f244904b = f;
                fVar.f244905c = f2;
                fVar.f244906d = (float) this.f244867a.getScrollX();
                f += fVar.f244906d;
                f2 += (float) this.f244867a.getScrollY();
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = (int) f3;
            layoutParams.height = (int) f4;
            view.setX(f);
            view.setY(f2);
            view.requestLayout();
            int indexOfChild = o.indexOfChild(this.f244872f);
            if (o.indexOfChild(view) == -1 && indexOfChild != -1) {
                o.addView(view, indexOfChild);
                o.removeView(this.f244872f);
            }
            return true;
        }
        mo116443u(q);
        o.removeView(view);
        if (view.getParent() != null) {
            if (q.f244914h != null && (view.getParent() instanceof C83803f4)) {
                ((C83803f4) view.getParent()).mo116266a(q.f244914h);
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (mo116429g(view, i, q.f244909c, fArr, i2, booleanValue2, booleanValue, false)) {
            return true;
        }
        mo116444v(q);
        return false;
    }
}
