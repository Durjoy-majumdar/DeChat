package zp3;

import android.os.Handler;
import android.os.Looper;
import android.util.Printer;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Field;
import java.util.HashMap;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import zp3.C23555k;

/* renamed from: zp3.m */
public final class C23564m {

    /* renamed from: a */
    public static final Handler f67547a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public static final HashMap<Integer, C23570r> f67548b = new HashMap<>();

    /* renamed from: c */
    public static final HashMap<Integer, C23570r> f67549c = new HashMap<>();

    /* renamed from: zp3.m$a */
    public static final class C16384a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f43784d;

        public C16384a(C32224a<C13598b0> aVar) {
            this.f43784d = aVar;
        }

        public final void run() {
            this.f43784d.invoke();
        }
    }

    /* renamed from: zp3.m$b */
    public static final class C23565b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C23555k.C23558c f67550d;

        /* renamed from: e */
        public final /* synthetic */ RecyclerView f67551e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23565b(C23555k.C23558c cVar, RecyclerView recyclerView) {
            super(0);
            this.f67550d = cVar;
            this.f67551e = recyclerView;
        }

        public Object invoke() {
            if (this.f67550d == null) {
                RecyclerView recyclerView = this.f67551e;
                C87412m.m108594g(recyclerView, "<this>");
                C23564m.m28136f(new C23568p((C23555k.C23559e) null, recyclerView));
                Object tag = this.f67551e.getTag(C0966R.C0970id.cn8);
                if (tag != null) {
                    RecyclerView recyclerView2 = this.f67551e;
                    if (tag instanceof RecyclerView.C0130p) {
                        recyclerView2.mo17098m1((RecyclerView.C0130p) tag);
                    }
                }
            } else {
                C8478d0 d0Var = new C8478d0();
                boolean d = this.f67550d.mo777d();
                Object tag2 = this.f67551e.getTag(C0966R.C0970id.cn8);
                if (tag2 != null) {
                    RecyclerView recyclerView3 = this.f67551e;
                    if (tag2 instanceof RecyclerView.C0130p) {
                        recyclerView3.mo17098m1((RecyclerView.C0130p) tag2);
                    }
                }
                C16385o oVar = new C16385o(d0Var);
                this.f67551e.mo17043c(oVar);
                this.f67551e.setTag(C0966R.C0970id.cn8, oVar);
                RecyclerView recyclerView4 = this.f67551e;
                C23567n nVar = new C23567n(this.f67550d, recyclerView4, d, d0Var);
                C87412m.m108594g(recyclerView4, "<this>");
                C23564m.m28136f(new C23568p(nVar, recyclerView4));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zp3.m$c */
    public static final class C23566c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C23555k.C23562d f67552d;

        /* renamed from: e */
        public final /* synthetic */ View f67553e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23566c(C23555k.C23562d dVar, View view) {
            super(0);
            this.f67552d = dVar;
            this.f67553e = view;
        }

        public Object invoke() {
            C13598b0 b0Var = null;
            if (this.f67552d != null) {
                C23570r b = C23564m.m28132b(this.f67553e);
                if (b != null) {
                    b.f67566e = this.f67552d;
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var == null) {
                    View view = this.f67553e;
                    C23555k.C23562d dVar = this.f67552d;
                    C23570r rVar = new C23570r(view);
                    rVar.f67566e = dVar;
                    C23564m.m28131a(view.hashCode(), rVar);
                }
            } else {
                C23570r b2 = C23564m.m28132b(this.f67553e);
                if (b2 != null) {
                    View view2 = this.f67553e;
                    b2.f67566e = null;
                    if (b2.f67567f == null) {
                        b2.f67562a.removeOnAttachStateChangeListener(b2.f67565d);
                        C23564m.m28134d(view2.hashCode());
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m28131a(int i, C23570r rVar) {
        HashMap<Integer, C23570r> hashMap = rVar.f67563b ? f67549c : f67548b;
        if (!hashMap.containsKey(Integer.valueOf(i))) {
            hashMap.put(Integer.valueOf(i), rVar);
            C23563l lVar = new C23563l(rVar);
            if (rVar.f67562a.getTag(C0966R.C0970id.cn7) != null) {
                Object tag = rVar.f67562a.getTag(C0966R.C0970id.cn7);
                C87412m.m108592e(tag, "null cannot be cast to non-null type android.view.View.OnAttachStateChangeListener");
                rVar.f67562a.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener) tag);
            }
            rVar.f67562a.setTag(C0966R.C0970id.cn7, lVar);
            rVar.f67562a.addOnAttachStateChangeListener(lVar);
            rVar.f67565d = lVar;
            C23555k kVar = C23555k.f67533a;
            C23555k.f67536d = f67548b.size();
            C23555k.f67537e = f67549c.size();
        }
    }

    /* renamed from: b */
    public static final C23570r m28132b(View view) {
        return f67548b.get(Integer.valueOf(view.hashCode()));
    }

    /* renamed from: c */
    public static final C23570r m28133c(View view) {
        return f67549c.get(Integer.valueOf(view.hashCode()));
    }

    /* renamed from: d */
    public static final C23570r m28134d(int i) {
        HashMap<Integer, C23570r> hashMap = f67548b;
        C23570r rVar = hashMap.get(Integer.valueOf(i));
        if (rVar != null) {
            rVar.f67564c = -1;
            rVar.f67565d = null;
            rVar.f67571j = true;
        }
        HashMap<Integer, C23570r> hashMap2 = f67549c;
        C23570r rVar2 = hashMap2.get(Integer.valueOf(i));
        if (rVar2 != null) {
            rVar2.f67564c = -1;
            rVar2.f67565d = null;
            rVar2.f67571j = true;
        }
        C23555k kVar = C23555k.f67533a;
        C23555k.f67536d = hashMap.size();
        C23555k.f67537e = hashMap2.size();
        return rVar;
    }

    /* renamed from: e */
    public static final Printer m28135e(Looper looper) {
        C87412m.m108594g(looper, "<this>");
        try {
            Result.Companion companion = Result.Companion;
            Field declaredField = Looper.class.getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(looper);
            if (obj instanceof Printer) {
                return (Printer) obj;
            }
            return null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m168114constructorimpl(ResultKt.createFailure(th));
            return null;
        }
    }

    /* renamed from: f */
    public static final void m28136f(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "call");
        long id = Thread.currentThread().getId();
        Handler handler = f67547a;
        if (id == handler.getLooper().getThread().getId()) {
            aVar.invoke();
        } else {
            handler.post(new C16384a(aVar));
        }
    }

    /* renamed from: g */
    public static final void m28137g(RecyclerView recyclerView, C23555k.C23558c cVar) {
        C87412m.m108594g(recyclerView, "<this>");
        m28136f(new C23565b(cVar, recyclerView));
    }

    /* renamed from: h */
    public static final void m28138h(View view, C23555k.C23562d dVar) {
        C87412m.m108594g(view, "<this>");
        m28136f(new C23566c(dVar, view));
    }
}
