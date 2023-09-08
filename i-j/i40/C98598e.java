package i40;

import android.content.Context;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C39630m0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;

/* renamed from: i40.e */
public abstract class C98598e extends C86301e implements C0123n0, C0125s {

    /* renamed from: d */
    public final C13601g f289093d = C36568h.m40985a(C33202b.f90098d);

    /* renamed from: e */
    public final C13601g f289094e = C36568h.m40985a(C46167a.f124454d);

    /* renamed from: f */
    public C76285g f289095f;

    /* renamed from: g */
    public final HashSet<C98597b> f289096g = new HashSet<>();

    /* renamed from: h */
    public final Boolean[] f289097h = {Boolean.FALSE};

    /* renamed from: i40.e$b */
    public static final class C33202b extends C87413o implements C32224a<C39630m0> {

        /* renamed from: d */
        public static final C33202b f90098d = new C33202b();

        public C33202b() {
            super(0);
        }

        public Object invoke() {
            return new C39630m0();
        }
    }

    /* renamed from: i40.e$a */
    public static final class C46167a extends C87413o implements C32224a<C46168h> {

        /* renamed from: d */
        public static final C46167a f124454d = new C46167a();

        public C46167a() {
            super(0);
        }

        public Object invoke() {
            return new C46168h();
        }
    }

    public final C39623j getLifecycle() {
        return (C46168h) ((C36570n) this.f289094e).getValue();
    }

    public final C39630m0 getViewModelStore() {
        return (C39630m0) ((C36570n) this.f289093d).getValue();
    }

    public final void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        Log.m105924i(vx0(), "onAccountInitialized start");
        Iterator<C98597b> it = this.f289096g.iterator();
        while (it.hasNext()) {
            it.next().mo106534e3(context);
        }
        Log.m105924i(vx0(), "onAccountInitialized before end");
        xx0(context);
        Iterator<C98597b> it4 = this.f289096g.iterator();
        while (it4.hasNext()) {
            it4.next().mo57310d3(context);
        }
        Log.m105924i(vx0(), "onAccountInitialized init end");
        ((C46168h) ((C36570n) this.f289094e).getValue()).moveToCreateState();
        yx0(context);
        Iterator<C98597b> it5 = this.f289096g.iterator();
        while (it5.hasNext()) {
            it5.next().getClass();
        }
        Log.m105924i(vx0(), "onAccountInitialized after end");
    }

    public final void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        if (this.f289097h[0].booleanValue()) {
            synchronized (this.f289097h) {
                if (this.f289097h[0].booleanValue()) {
                    Iterator<C98597b> it = this.f289096g.iterator();
                    while (it.hasNext()) {
                        it.next().mo57311f3();
                    }
                    this.f289096g.clear();
                    zx0();
                    getViewModelStore().mo62188a();
                    ((C46168h) ((C36570n) this.f289094e).getValue()).moveToDestroyState();
                    Log.m105924i(vx0(), "onAccountRelease");
                    this.f289097h[0] = Boolean.FALSE;
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
        if (!this.f289097h[0].booleanValue()) {
            synchronized (this.f289097h) {
                if (!this.f289097h[0].booleanValue()) {
                    HashSet<Class> hashSet = new HashSet<>();
                    wx0(hashSet);
                    String vx02 = vx0();
                    StringBuilder sb = new StringBuilder();
                    sb.append("create component:");
                    ArrayList arrayList = new ArrayList(C36907w.m41090l(hashSet, 10));
                    for (Class name : hashSet) {
                        arrayList.add(name.getName());
                    }
                    sb.append(arrayList);
                    Log.m105924i(vx02, sb.toString());
                    for (Class a : hashSet) {
                        C98597b a2 = C98597b.f289091e.mo85231a(this, a);
                        this.f289096g.add(a2);
                        if (a2 instanceof C98599f) {
                            C98599f fVar = (C98599f) a2;
                        }
                        if (a2 instanceof C76285g) {
                            this.f289095f = (C76285g) a2;
                        }
                    }
                    this.f289097h[0] = Boolean.TRUE;
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    public String vx0() {
        return "MicroMsg.Mvvm.MvvmPlugin";
    }

    public void wx0(HashSet<Class<? extends C98597b>> hashSet) {
        C87412m.m108594g(hashSet, "set");
    }

    public void xx0(Context context) {
        C87412m.m108594g(context, "context");
    }

    public void yx0(Context context) {
        C87412m.m108594g(context, "context");
    }

    public void zx0() {
    }
}
