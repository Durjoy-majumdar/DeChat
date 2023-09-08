package androidx.compose.p002ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import p1094c4.C104290a;
import p1094c4.C104292c;
import p175j0.C108498f0;
import p175j0.C108499f1;
import p175j0.C108500f2;
import p175j0.C108502g1;
import p175j0.C108504h;
import p175j0.C108513w;
import p175j0.C108516z0;
import p175j0.C24661b2;
import p175j0.C24665d;
import p175j0.C24715p;
import p175j0.C24724t1;
import p175j0.C33487v1;
import p175j0.C60647d0;
import p175j0.C60651e0;
import p175j0.C60655g0;
import p175j0.C60690y0;
import p415q0.C110261c;
import p683s0.C110688i;
import p683s0.C110690k;
import p683s0.C36599j;
import p693t1.C36932a;
import rx3.C13598b0;
import um0.C22657f;

/* renamed from: androidx.compose.ui.platform.v */
public final class C103691v {

    /* renamed from: a */
    public static final C108499f1<Configuration> f306267a;

    /* renamed from: b */
    public static final C108499f1<Context> f306268b = C108513w.m147058c(C103693b.f306274d);

    /* renamed from: c */
    public static final C108499f1<C36932a> f306269c = C108513w.m147058c(C103694c.f306275d);

    /* renamed from: d */
    public static final C108499f1<C0125s> f306270d = C108513w.m147058c(C103695d.f306276d);

    /* renamed from: e */
    public static final C108499f1<C104292c> f306271e = C108513w.m147058c(C103696e.f306277d);

    /* renamed from: f */
    public static final C108499f1<View> f306272f = C108513w.m147058c(C103697f.f306278d);

    /* renamed from: androidx.compose.ui.platform.v$a */
    public static final class C103692a extends C87413o implements C32224a<Configuration> {

        /* renamed from: d */
        public static final C103692a f306273d = new C103692a();

        public C103692a() {
            super(0);
        }

        public Object invoke() {
            C103691v.m137994b("LocalConfiguration");
            throw null;
        }
    }

    /* renamed from: androidx.compose.ui.platform.v$b */
    public static final class C103693b extends C87413o implements C32224a<Context> {

        /* renamed from: d */
        public static final C103693b f306274d = new C103693b();

        public C103693b() {
            super(0);
        }

        public Object invoke() {
            C103691v.m137994b("LocalContext");
            throw null;
        }
    }

    /* renamed from: androidx.compose.ui.platform.v$c */
    public static final class C103694c extends C87413o implements C32224a<C36932a> {

        /* renamed from: d */
        public static final C103694c f306275d = new C103694c();

        public C103694c() {
            super(0);
        }

        public Object invoke() {
            C103691v.m137994b("LocalImageVectorCache");
            throw null;
        }
    }

    /* renamed from: androidx.compose.ui.platform.v$d */
    public static final class C103695d extends C87413o implements C32224a<C0125s> {

        /* renamed from: d */
        public static final C103695d f306276d = new C103695d();

        public C103695d() {
            super(0);
        }

        public Object invoke() {
            C103691v.m137994b("LocalLifecycleOwner");
            throw null;
        }
    }

    /* renamed from: androidx.compose.ui.platform.v$e */
    public static final class C103696e extends C87413o implements C32224a<C104292c> {

        /* renamed from: d */
        public static final C103696e f306277d = new C103696e();

        public C103696e() {
            super(0);
        }

        public Object invoke() {
            C103691v.m137994b("LocalSavedStateRegistryOwner");
            throw null;
        }
    }

    /* renamed from: androidx.compose.ui.platform.v$f */
    public static final class C103697f extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public static final C103697f f306278d = new C103697f();

        public C103697f() {
            super(0);
        }

        public Object invoke() {
            C103691v.m137994b("LocalView");
            throw null;
        }
    }

    /* renamed from: androidx.compose.ui.platform.v$g */
    public static final class C103698g extends C87413o implements C32226l<Configuration, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60690y0<Configuration> f306279d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103698g(C60690y0<Configuration> y0Var) {
            super(1);
            this.f306279d = y0Var;
        }

        public Object invoke(Object obj) {
            Configuration configuration = (Configuration) obj;
            C87412m.m108594g(configuration, LocaleUtil.ITALIAN);
            this.f306279d.setValue(configuration);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: androidx.compose.ui.platform.v$h */
    public static final class C103699h extends C87413o implements C32226l<C60651e0, C60647d0> {

        /* renamed from: d */
        public final /* synthetic */ C103675p0 f306280d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103699h(C103675p0 p0Var) {
            super(1);
            this.f306280d = p0Var;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C60651e0) obj, "$this$DisposableEffect");
            return new C103704w(this.f306280d);
        }
    }

    /* renamed from: androidx.compose.ui.platform.v$i */
    public static final class C103700i extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AndroidComposeView f306281d;

        /* renamed from: e */
        public final /* synthetic */ C103624g0 f306282e;

        /* renamed from: f */
        public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f306283f;

        /* renamed from: g */
        public final /* synthetic */ int f306284g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103700i(AndroidComposeView androidComposeView, C103624g0 g0Var, C32227p<? super C108504h, ? super Integer, C13598b0> pVar, int i) {
            super(2);
            this.f306281d = androidComposeView;
            this.f306282e = g0Var;
            this.f306283f = pVar;
            this.f306284g = i;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                C103645l0.m137838a(this.f306281d, this.f306282e, this.f306283f, hVar, ((this.f306284g << 3) & C22657f.CTRL_INDEX) | 72);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: androidx.compose.ui.platform.v$j */
    public static final class C103701j extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AndroidComposeView f306285d;

        /* renamed from: e */
        public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f306286e;

        /* renamed from: f */
        public final /* synthetic */ int f306287f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103701j(AndroidComposeView androidComposeView, C32227p<? super C108504h, ? super Integer, C13598b0> pVar, int i) {
            super(2);
            this.f306285d = androidComposeView;
            this.f306286e = pVar;
            this.f306287f = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C103691v.m137993a(this.f306285d, this.f306286e, (C108504h) obj, this.f306287f | 1);
            return C13598b0.f38549a;
        }
    }

    static {
        C108516z0 z0Var = C108516z0.f324839a;
        C103692a aVar = C103692a.f306273d;
        C87412m.m108594g(aVar, "defaultFactory");
        f306267a = new C108498f0(z0Var, aVar);
    }

    /* renamed from: a */
    public static final void m137993a(AndroidComposeView androidComposeView, C32227p<? super C108504h, ? super Integer, C13598b0> pVar, C108504h hVar, int i) {
        LinkedHashMap linkedHashMap;
        boolean z;
        AndroidComposeView androidComposeView2 = androidComposeView;
        C32227p<? super C108504h, ? super Integer, C13598b0> pVar2 = pVar;
        int i2 = i;
        C87412m.m108594g(androidComposeView2, "owner");
        C87412m.m108594g(pVar2, "content");
        C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> qVar = C24715p.f70494a;
        C108504h z2 = hVar.mo51623z(1396852028);
        Context context = androidComposeView.getContext();
        z2.mo51557H(-492369756);
        Object q = z2.mo51606q();
        Object obj = C108504h.C60656a.f172772a;
        if (q == obj) {
            q = C108500f2.m146995b(context.getResources().getConfiguration(), C108516z0.f324839a);
            z2.mo51553F(q);
        }
        z2.mo51565P();
        C60690y0 y0Var = (C60690y0) q;
        z2.mo51557H(1157296644);
        boolean x = z2.mo51619x(y0Var);
        Object q2 = z2.mo51606q();
        if (x || q2 == obj) {
            q2 = new C103698g(y0Var);
            z2.mo51553F(q2);
        }
        z2.mo51565P();
        androidComposeView2.setConfigurationChangeObserver((C32226l) q2);
        z2.mo51557H(-492369756);
        Object q3 = z2.mo51606q();
        if (q3 == obj) {
            C87412m.m108593f(context, "context");
            q3 = new C103624g0(context);
            z2.mo51553F(q3);
        }
        z2.mo51565P();
        C103624g0 g0Var = (C103624g0) q3;
        AndroidComposeView$$e viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners != null) {
            z2.mo51557H(-492369756);
            Object q4 = z2.mo51606q();
            if (q4 == obj) {
                C104292c cVar = viewTreeOwners.f306029b;
                Class<? extends Object>[] clsArr = C103687t0.f306258a;
                C87412m.m108594g(cVar, "owner");
                ViewParent parent = androidComposeView.getParent();
                if (parent != null) {
                    View view = (View) parent;
                    Object tag = view.getTag(C0966R.C0970id.bkt);
                    String str = tag instanceof String ? (String) tag : null;
                    if (str == null) {
                        str = String.valueOf(view.getId());
                    }
                    C87412m.m108594g(str, "id");
                    String str2 = C110688i.class.getSimpleName() + XVFSFile.PATH_SEPARATOR_CHAR + str;
                    C104290a savedStateRegistry = cVar.getSavedStateRegistry();
                    Bundle a = savedStateRegistry.mo145969a(str2);
                    if (a != null) {
                        linkedHashMap = new LinkedHashMap();
                        Set<String> keySet = a.keySet();
                        C87412m.m108593f(keySet, "this.keySet()");
                        Iterator<T> it = keySet.iterator();
                        while (it.hasNext()) {
                            String str3 = (String) it.next();
                            ArrayList parcelableArrayList = a.getParcelableArrayList(str3);
                            if (parcelableArrayList != null) {
                                C87412m.m108593f(str3, "key");
                                linkedHashMap.put(str3, parcelableArrayList);
                                it = it;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                            }
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    C27937s0 s0Var = C27937s0.f77157d;
                    C108499f1<C110688i> f1Var = C110690k.f331112a;
                    C87412m.m108594g(s0Var, "canBeSaved");
                    C36599j jVar = new C36599j(linkedHashMap, s0Var);
                    try {
                        savedStateRegistry.mo145970b(str2, new C103682r0(jVar));
                        z = true;
                    } catch (IllegalArgumentException unused) {
                        z = false;
                    }
                    C103675p0 p0Var = new C103675p0(jVar, new C103679q0(z, savedStateRegistry, str2));
                    z2.mo51553F(p0Var);
                    q4 = p0Var;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                }
            }
            z2.mo51565P();
            C103675p0 p0Var2 = (C103675p0) q4;
            C60655g0.m70930a(C13598b0.f38549a, new C103699h(p0Var2), z2, 0);
            C87412m.m108593f(context, "context");
            T t = (Configuration) y0Var.getValue();
            z2.mo51557H(-485908294);
            z2.mo51557H(-492369756);
            T q5 = z2.mo51606q();
            T t2 = C108504h.C60656a.f172772a;
            if (q5 == t2) {
                q5 = new C36932a();
                z2.mo51553F(q5);
            }
            z2.mo51565P();
            C36932a aVar = (C36932a) q5;
            C8479f0 f0Var = new C8479f0();
            z2.mo51557H(-492369756);
            T q6 = z2.mo51606q();
            if (q6 == t2) {
                z2.mo51553F(t);
            } else {
                t = q6;
            }
            z2.mo51565P();
            f0Var.f27484d = t;
            z2.mo51557H(-492369756);
            T q7 = z2.mo51606q();
            if (q7 == t2) {
                q7 = new C27938z(f0Var, aVar);
                z2.mo51553F(q7);
            }
            z2.mo51565P();
            C60655g0.m70930a(aVar, new C103707y(context, (C27938z) q7), z2, 8);
            z2.mo51565P();
            C108499f1<Configuration> f1Var2 = f306267a;
            Configuration configuration = (Configuration) y0Var.getValue();
            C87412m.m108593f(configuration, "configuration");
            C108513w.m147056a(new C108502g1[]{f1Var2.mo159370b(configuration), f306268b.mo159370b(context), f306270d.mo159370b(viewTreeOwners.f306028a), f306271e.mo159370b(viewTreeOwners.f306029b), C110690k.f331112a.mo159370b(p0Var2), f306272f.mo159370b(androidComposeView.getView()), f306269c.mo159370b(aVar)}, C110261c.m149878b(z2, 1471621628, true, new C103700i(androidComposeView2, g0Var, pVar2, i2)), z2, 56);
            C33487v1 l = z2.mo51596l();
            if (l != null) {
                l.mo51650a(new C103701j(androidComposeView2, pVar2, i2));
            }
            C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> qVar2 = C24715p.f70494a;
            return;
        }
        throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }

    /* renamed from: b */
    public static final Void m137994b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
