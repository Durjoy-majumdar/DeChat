package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.appusage.C81506j0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81526t1;
import com.tencent.p014mm.plugin.appbrand.appusage.C81530u1;
import com.tencent.p014mm.plugin.appbrand.p026ui.recents.C84620b;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import ky2.C10432i;
import ob0.C47350c;
import ob0.C89144l0;
import te3.C49129dd2;
import te3.C49268ed2;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.y */
public class C84658y extends C84620b implements C84620b.C84621a {

    /* renamed from: e */
    public final List<C84620b> f246979e;

    /* renamed from: f */
    public final List<Class<? extends C84620b>> f246980f = new LinkedList();

    /* renamed from: g */
    public ViewGroup f246981g;

    /* renamed from: h */
    public boolean f246982h;

    /* renamed from: i */
    public int f246983i = 2;

    /* renamed from: j */
    public final C81526t1 f246984j;

    /* renamed from: n */
    public final C84661c f246985n;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.y$b */
    public static class C84660b extends View {
        public C84660b(Context context) {
            super(context);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.y$c */
    public class C84661c {

        /* renamed from: a */
        public final int f246986a;

        /* renamed from: b */
        public final int f246987b;

        /* renamed from: c */
        public final int f246988c;

        /* renamed from: d */
        public final int f246989d;

        /* renamed from: e */
        public final int f246990e = 2;

        public C84661c(C84658y yVar, Context context, C84659a aVar) {
            this.f246986a = context.getResources().getDimensionPixelSize(C0966R.dimen.f4175v5);
            this.f246987b = C76577a.m92151b(context, 56);
            this.f246988c = C76577a.m92151b(context, 8);
            this.f246989d = C76577a.m92153d(context, C0966R.color.f3074ed);
        }
    }

    public C84658y(FragmentActivity fragmentActivity, ViewGroup viewGroup, boolean z, boolean z2) {
        super(fragmentActivity, viewGroup);
        if (fragmentActivity == null || viewGroup == null) {
            throw new IllegalStateException("Unexpected parameters");
        }
        this.f246985n = new C84661c(this, fragmentActivity, (C84659a) null);
        this.f246982h = z2;
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        this.f246981g = linearLayout;
        List<C84620b> o = mo117367o(fragmentActivity, linearLayout, z);
        this.f246979e = o;
        ViewGroup viewGroup2 = this.f246981g;
        if (!(o == null || o.size() == 0 || viewGroup2 == null)) {
            for (int i = 0; i < o.size(); i++) {
                C84620b bVar = o.get(i);
                viewGroup2.addView(bVar.mo117312c());
                if (i == this.f246983i) {
                    viewGroup2.addView(new C84660b(viewGroup2.getContext()), -1, this.f246985n.f246988c);
                } else if (i != o.size() - 1) {
                    if (i != 0) {
                        C84620b bVar2 = o.get(i - 1);
                    }
                    C84620b bVar3 = o.get(i + 1);
                    if (!((LinkedList) this.f246980f).contains(bVar.getClass())) {
                        if (!((LinkedList) this.f246980f).contains(bVar3.getClass())) {
                            if (this.f246982h) {
                                int dimensionPixelOffset = viewGroup2.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f4121t0);
                                int dimensionPixelOffset2 = viewGroup2.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f4116sq);
                                LinearLayout linearLayout2 = new LinearLayout(viewGroup2.getContext());
                                linearLayout2.setOrientation(0);
                                viewGroup2.addView(linearLayout2, -1, -2);
                                Context context = viewGroup2.getContext();
                                View view = new View(context);
                                view.setBackgroundColor(context.getResources().getColor(C0966R.color.f2929c));
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelOffset2, dimensionPixelOffset);
                                layoutParams.gravity = 3;
                                linearLayout2.addView(view, layoutParams);
                                View view2 = new View(context);
                                view2.setBackgroundColor(viewGroup2.getResources().getColor(C0966R.color.f3080em));
                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, dimensionPixelOffset, 1.0f);
                                layoutParams2.gravity = 17;
                                linearLayout2.addView(view2, layoutParams2);
                                View view3 = new View(context);
                                view3.setBackgroundColor(context.getResources().getColor(C0966R.color.f2929c));
                                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(dimensionPixelOffset2, dimensionPixelOffset);
                                layoutParams3.gravity = 5;
                                linearLayout2.addView(view3, layoutParams3);
                            } else {
                                Context context2 = viewGroup2.getContext();
                                View view4 = new View(context2);
                                LinearLayout linearLayout3 = new LinearLayout(context2);
                                linearLayout3.setPadding(this.f246985n.f246987b, 0, 0, 0);
                                linearLayout3.setBackgroundResource(C0966R.color.f2929c);
                                linearLayout3.addView(view4, new LinearLayout.LayoutParams(-1, this.f246985n.f246986a));
                                view4.setBackgroundColor(context2.getResources().getColor(C0966R.color.FG_3));
                                C84661c cVar = this.f246985n;
                                new LinearLayout.LayoutParams(cVar.f246987b, cVar.f246986a).gravity = 3;
                                viewGroup2.addView(linearLayout3, new LinearLayout.LayoutParams(-1, -2));
                            }
                        }
                    }
                    LinearLayout linearLayout4 = new LinearLayout(viewGroup2.getContext());
                    linearLayout4.setOrientation(1);
                    mo117365m(linearLayout4);
                    viewGroup2.addView(linearLayout4, -1, -2);
                }
            }
            Context context3 = viewGroup2.getContext();
            new ColorDrawable(this.f246985n.f246989d);
            ImageView imageView = new ImageView(context3);
            boolean z3 = this.f246982h;
            imageView.setBackgroundColor(0);
            viewGroup2.addView(imageView, 0, new LinearLayout.LayoutParams(-1, this.f246985n.f246990e));
            mo117365m(viewGroup2);
        }
        List<C84620b> list = this.f246979e;
        if (list != null) {
            for (C84620b l : list) {
                l.mo117321l(false);
            }
        }
        mo117315i(0);
        this.f246984j = new C81526t1();
        for (C84620b next : this.f246979e) {
            if (next instanceof C81526t1.C81528b) {
                C81526t1 t1Var = this.f246984j;
                C81526t1.C81528b bVar4 = (C81526t1.C81528b) next;
                t1Var.getClass();
                C87412m.m108594g(bVar4, "receiver");
                synchronized (t1Var.f239137a) {
                    List list2 = (List) ((LinkedHashMap) t1Var.f239137a).get(bVar4.mo113806b());
                    if (list2 == null) {
                        list2 = new ArrayList();
                        t1Var.f239137a.put(bVar4.mo113806b(), list2);
                    }
                    list2.add(bVar4);
                }
            }
        }
        C81526t1 t1Var2 = this.f246984j;
        t1Var2.getClass();
        C47350c.C47352b bVar5 = new C47350c.C47352b();
        bVar5.f127069d = 3752;
        bVar5.f127068c = "/cgi-bin/mmbiz-bin/wxaapp/getwxadesktopentrance";
        C49129dd2 dd22 = new C49129dd2();
        dd22.f132253d = 0.0d;
        dd22.f132254e = 0.0d;
        bVar5.f127066a = dd22;
        bVar5.f127067b = new C49268ed2();
        C89144l0.m111429e(bVar5.mo72403a(), new C81530u1(t1Var2), true);
    }

    /* renamed from: c */
    public View mo117312c() {
        return this.f246981g;
    }

    /* renamed from: e */
    public void mo117280e() {
        for (C84620b e : this.f246979e) {
            e.mo117280e();
        }
    }

    /* renamed from: f */
    public void mo117313f() {
        for (C84620b f : this.f246979e) {
            f.mo117313f();
        }
        this.f246979e.clear();
        ((LinkedHashMap) this.f246984j.f239137a).clear();
    }

    /* renamed from: g */
    public void mo117314g() {
        for (C84620b g : this.f246979e) {
            g.mo117314g();
        }
    }

    /* renamed from: h */
    public void mo117281h() {
        for (C84620b h : this.f246979e) {
            h.mo117281h();
        }
    }

    /* renamed from: i */
    public void mo117315i(int i) {
        for (C84620b i2 : this.f246979e) {
            i2.mo117315i(i);
        }
    }

    /* renamed from: k */
    public void mo117316k(int i) {
        mo117370r();
    }

    /* renamed from: m */
    public final void mo117365m(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        Context context = frameLayout.getContext();
        new ColorDrawable(this.f246985n.f246989d);
        ImageView imageView = new ImageView(context);
        boolean z = this.f246982h;
        imageView.setBackgroundColor(0);
        frameLayout.addView(imageView, -1, this.f246985n.f246990e);
        frameLayout.addView(new View(context), -1, this.f246985n.f246988c);
        ImageView imageView2 = new ImageView(context);
        boolean z2 = this.f246982h;
        imageView2.setBackgroundColor(0);
        frameLayout.addView(imageView2, -1, this.f246985n.f246990e);
        frameLayout.setId(C0966R.C0970id.f5937ss);
        viewGroup.addView(frameLayout, -1, -2);
    }

    /* renamed from: n */
    public void mo117366n(List<C84620b> list, C84620b bVar) {
        if (bVar != null) {
            list.add(bVar);
        }
    }

    /* renamed from: o */
    public List<C84620b> mo117367o(FragmentActivity fragmentActivity, ViewGroup viewGroup, boolean z) {
        ArrayList arrayList = new ArrayList(2);
        C84626d dVar = new C84626d(fragmentActivity, viewGroup);
        dVar.f246905d = this;
        mo117366n(arrayList, dVar);
        boolean e = ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e();
        Log.m105925i("AppBrandLauncherRecentsListHeaderController", "isTeenMode: %s", Boolean.valueOf(e));
        if (!e) {
            mo117366n(arrayList, mo117369q(fragmentActivity, viewGroup));
        }
        AppBrandLauncherHeaderOrderEntrance appBrandLauncherHeaderOrderEntrance = new AppBrandLauncherHeaderOrderEntrance(fragmentActivity, viewGroup);
        appBrandLauncherHeaderOrderEntrance.f246905d = this;
        mo117366n(arrayList, appBrandLauncherHeaderOrderEntrance);
        mo117366n(arrayList, mo117368p(fragmentActivity, viewGroup));
        return arrayList;
    }

    /* renamed from: p */
    public C84620b mo117368p(FragmentActivity fragmentActivity, ViewGroup viewGroup) {
        Integer num = C81506j0.f239106d;
        C84623c cVar = new C84623c(fragmentActivity, viewGroup);
        cVar.f246905d = this;
        return cVar;
    }

    /* renamed from: q */
    public C84620b mo117369q(FragmentActivity fragmentActivity, ViewGroup viewGroup) {
        C84618a0 a0Var = new C84618a0(fragmentActivity, viewGroup);
        a0Var.f246905d = this;
        return a0Var;
    }

    /* renamed from: r */
    public void mo117370r() {
        int i = 0;
        int i2 = 0;
        for (C84620b d : this.f246979e) {
            if (d.mo117320d()) {
                i2++;
            }
        }
        for (C84620b next : this.f246979e) {
            if (next.mo117320d()) {
                if (i == 0) {
                    next.mo117316k(C0966R.C0969drawable.f4465da);
                } else if (i == this.f246979e.size() - 1 || i == i2 - 1) {
                    next.mo117316k(C0966R.C0969drawable.f4463d9);
                } else {
                    next.mo117316k(C0966R.C0969drawable.f4464d_);
                }
                i++;
            }
        }
    }
}
