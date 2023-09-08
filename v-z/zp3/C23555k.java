package zp3;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.FocusMeteringAction;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import rx3.C13598b0;

/* renamed from: zp3.k */
public final class C23555k {

    /* renamed from: a */
    public static final C23555k f67533a = new C23555k();

    /* renamed from: b */
    public static long f67534b;

    /* renamed from: c */
    public static long f67535c;

    /* renamed from: d */
    public static int f67536d;

    /* renamed from: e */
    public static int f67537e;

    /* renamed from: f */
    public static final Rect f67538f = new Rect();

    /* renamed from: g */
    public static boolean f67539g = true;

    /* renamed from: h */
    public static final C32224a<C13598b0> f67540h = C23561g.f67545d;

    /* renamed from: i */
    public static final C32224a<C13598b0> f67541i = C23560f.f67544d;

    /* renamed from: zp3.k$a */
    public static final class C23556a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C23556a f67542d = new C23556a();

        public C23556a() {
            super(0);
        }

        public Object invoke() {
            C23555k.m28117b(C23555k.f67533a, TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT);
            Context context = MMApplicationContext.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Application");
            ((Application) context).registerActivityLifecycleCallbacks(new C23553j());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zp3.k$b */
    public static final class C23557b implements Printer {

        /* renamed from: a */
        public final Printer f67543a;

        public C23557b(Printer printer) {
            this.f67543a = printer;
        }

        public void println(String str) {
            C87412m.m108594g(str, "x");
            C23555k.f67539g = true;
            C23555k kVar = C23555k.f67533a;
            if (C23555k.f67536d > 0 && System.nanoTime() - C23555k.f67534b >= 260000000) {
                ((C23560f) C23555k.f67541i).invoke();
            }
            if (C23555k.f67537e > 0 && System.nanoTime() - C23555k.f67535c >= 50000000) {
                ((C23561g) C23555k.f67540h).invoke();
            }
            Printer printer = this.f67543a;
            if (printer != null) {
                printer.println(str);
            }
        }
    }

    /* renamed from: zp3.k$c */
    public static abstract class C23558c {
        /* renamed from: a */
        public boolean mo10181a(RecyclerView.C16631z zVar) {
            return true;
        }

        /* renamed from: b */
        public float mo10182b(View view) {
            C87412m.m108594g(view, "view");
            return 0.0f;
        }

        /* renamed from: c */
        public long mo10183c(RecyclerView.C16631z zVar) {
            View view = zVar != null ? zVar.f44854d : null;
            return (long) (view != null ? view.hashCode() : 0);
        }

        /* renamed from: d */
        public abstract boolean mo777d();

        /* renamed from: e */
        public abstract void mo778e(View view, List<? extends RecyclerView.C16631z> list);
    }

    /* renamed from: zp3.k$e */
    public static abstract class C23559e {
        /* renamed from: a */
        public abstract boolean mo37018a(View view);

        /* renamed from: b */
        public abstract float mo37019b(View view);

        /* renamed from: c */
        public abstract long mo37020c(View view);

        /* renamed from: d */
        public abstract boolean mo37021d();

        /* renamed from: e */
        public abstract void mo37022e(View view, List<? extends View> list);
    }

    /* renamed from: zp3.k$f */
    public static final class C23560f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C23560f f67544d = new C23560f();

        public C23560f() {
            super(0);
        }

        public Object invoke() {
            Iterator<Map.Entry<Integer, C23570r>> it = C23564m.f67548b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                C23555k.m28116a(C23555k.f67533a, ((C23570r) next.getValue()).f67562a, (C23570r) next.getValue());
                if (((C23570r) next.getValue()).f67571j || ((C23570r) next.getValue()).f67570i) {
                    it.remove();
                }
            }
            C23555k kVar = C23555k.f67533a;
            C23555k.f67536d = C23564m.f67548b.size();
            C23555k.f67534b = System.nanoTime();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zp3.k$g */
    public static final class C23561g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C23561g f67545d = new C23561g();

        public C23561g() {
            super(0);
        }

        public Object invoke() {
            Iterator<Map.Entry<Integer, C23570r>> it = C23564m.f67549c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                C23555k.m28116a(C23555k.f67533a, ((C23570r) next.getValue()).f67562a, (C23570r) next.getValue());
                if (((C23570r) next.getValue()).f67571j || ((C23570r) next.getValue()).f67570i) {
                    it.remove();
                }
            }
            C23555k kVar = C23555k.f67533a;
            C23555k.f67537e = C23564m.f67549c.size();
            C23555k.f67535c = System.nanoTime();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zp3.k$d */
    public static abstract class C23562d {
        /* renamed from: a */
        public long mo52a(View view) {
            C87412m.m108594g(view, "view");
            return (long) view.hashCode();
        }

        /* renamed from: b */
        public abstract void mo53b(View view, long j, long j2, boolean z);
    }

    static {
        C23564m.m28136f(C23556a.f67542d);
    }

    /* renamed from: a */
    public static final void m28116a(C23555k kVar, View view, C23570r rVar) {
        kVar.getClass();
        if (rVar.f67566e != null) {
            C87412m.m108594g(view, "view");
        }
        Rect rect = f67538f;
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
        if (view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
            rect.width();
            rect.height();
            view.getMeasuredWidth();
            view.getMeasuredHeight();
        }
        long j = -1;
        if (!view.isShown() || view.getAlpha() <= 0.0f || view.getParent() == null || !globalVisibleRect || !view.hasWindowFocus()) {
            if (rVar.f67564c != -1) {
                f67533a.mo37016c(view, rVar);
                C23562d dVar = rVar.f67566e;
                if (dVar != null) {
                    dVar.mo53b(rVar.f67562a, rVar.f67564c, -1, false);
                }
                rVar.f67564c = -1;
            }
            if (!rVar.f67570i) {
                Context context = view.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                if (!((Activity) context).isDestroyed()) {
                    return;
                }
                if (rVar.f67569h == 0) {
                    rVar.f67569h = System.currentTimeMillis();
                } else if (System.currentTimeMillis() - rVar.f67569h > FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                    rVar.f67570i = true;
                    Log.m105928w("ExposeElves", "[checkLeak] leak view=" + view);
                }
            }
        } else {
            C23562d dVar2 = rVar.f67566e;
            if (dVar2 != null) {
                j = dVar2.mo52a(view);
            }
            f67533a.mo37016c(view, rVar);
            long j2 = rVar.f67564c;
            if (j2 != j) {
                C23562d dVar3 = rVar.f67566e;
                if (dVar3 != null) {
                    dVar3.mo53b(rVar.f67562a, j2, j, true);
                }
                rVar.f67564c = j;
            }
        }
    }

    /* renamed from: b */
    public static final void m28117b(C23555k kVar, String str) {
        kVar.getClass();
        Looper mainLooper = Looper.getMainLooper();
        C87412m.m108593f(mainLooper, "getMainLooper()");
        if (!(C23564m.m28135e(mainLooper) instanceof C23557b)) {
            Looper mainLooper2 = Looper.getMainLooper();
            C87412m.m108593f(mainLooper2, "getMainLooper()");
            Looper.getMainLooper().setMessageLogging(new C23557b(C23564m.m28135e(mainLooper2)));
        }
        Log.m105924i("ExposeElves", "[checkSetLogging] source=" + str);
    }

    /* renamed from: c */
    public final void mo37016c(View view, C23570r rVar) {
        View view2 = view;
        C23570r rVar2 = rVar;
        C23559e eVar = rVar2.f67567f;
        if (eVar != null && !eVar.mo37021d() && (view2 instanceof ViewGroup)) {
            LinkedList linkedList = new LinkedList();
            long j = 0;
            ViewGroup viewGroup = (ViewGroup) view2;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                C87412m.m108593f(childAt, "child");
                long c = eVar.mo37020c(childAt);
                float b = eVar.mo37019b(childAt);
                Rect rect = f67538f;
                boolean globalVisibleRect = childAt.getGlobalVisibleRect(rect);
                float width = (childAt.getMeasuredWidth() <= 0 || childAt.getMeasuredHeight() <= 0) ? 0.0f : (((float) rect.width()) * ((float) rect.height())) / ((float) (childAt.getMeasuredWidth() * childAt.getMeasuredHeight()));
                if (childAt.isShown() && childAt.getAlpha() > 0.0f && childAt.hasWindowFocus() && globalVisibleRect) {
                    if (((b == 0.0f) || width >= b) && eVar.mo37018a(childAt)) {
                        linkedList.add(childAt);
                        j += c;
                    }
                }
            }
            if (rVar2.f67568g != j) {
                rVar2.f67568g = j;
                C23559e eVar2 = rVar2.f67567f;
                if (eVar2 != null) {
                    eVar2.mo37022e(view2, linkedList);
                }
            }
        }
    }
}
