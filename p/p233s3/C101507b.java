package p233s3;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.tencent.p014mm.C0966R;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.List;
import p233s3.C101526p;

/* renamed from: s3.b */
public class C101507b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: h */
    public static final C101508a f297218h = new C101508a((C8480h) null);

    /* renamed from: i */
    public static final Field f297219i;

    /* renamed from: d */
    public final Choreographer f297220d;

    /* renamed from: e */
    public final List<C101525o> f297221e;

    /* renamed from: f */
    public final WeakReference<View> f297222f;

    /* renamed from: g */
    public final C101526p.C101527a f297223g;

    /* renamed from: s3.b$a */
    public static final class C101508a {
        public C101508a(C8480h hVar) {
        }

        /* renamed from: a */
        public final long mo140997a(View view) {
            if (C101524n.f297253a < 0) {
                Window window = null;
                if ((view != null ? view.getContext() : null) instanceof Activity) {
                    Context context = view.getContext();
                    C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                    window = ((Activity) context).getWindow();
                }
                float f = 60.0f;
                float refreshRate = window != null ? window.getWindowManager().getDefaultDisplay().getRefreshRate() : 60.0f;
                if (refreshRate >= 30.0f && refreshRate <= 200.0f) {
                    f = refreshRate;
                }
                C101524n.f297253a = (long) ((((float) 1000) / f) * ((float) 1000000));
            }
            return C101524n.f297253a;
        }
    }

    /* renamed from: s3.b$b */
    public static final class C101509b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f297224d;

        /* renamed from: e */
        public final /* synthetic */ C101507b f297225e;

        /* renamed from: f */
        public final /* synthetic */ long f297226f;

        public C101509b(View view, C101507b bVar, long j) {
            this.f297224d = view;
            this.f297225e = bVar;
            this.f297226f = j;
        }

        public final void run() {
            long nanoTime = System.nanoTime();
            long a = C101507b.f297218h.mo140997a(this.f297224d);
            for (C101525o a2 : this.f297225e.f297221e) {
                long j = this.f297226f;
                a2.mo141005a(j, nanoTime - j, a);
            }
            C101526p pVar = this.f297225e.f297223g.f297258a;
            if (pVar != null) {
                pVar.mo141011b();
            }
        }
    }

    static {
        Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
        C87412m.m108593f(declaredField, "Choreographer::class.jav…ld(\"mLastFrameTimeNanos\")");
        f297219i = declaredField;
        declaredField.setAccessible(true);
    }

    public C101507b(View view, Choreographer choreographer, List<C101525o> list) {
        C87412m.m108594g(view, "decorView");
        C87412m.m108594g(choreographer, "choreographer");
        C87412m.m108594g(list, "delegates");
        this.f297220d = choreographer;
        this.f297221e = list;
        this.f297222f = new WeakReference<>(view);
        ViewParent viewParent = view.getParent();
        while (viewParent instanceof View) {
            view = (View) viewParent;
            viewParent = view.getParent();
        }
        Object tag = view.getTag(C0966R.C0970id.mtt);
        if (tag == null) {
            tag = new C101526p.C101527a();
            view.setTag(C0966R.C0970id.mtt, tag);
        }
        this.f297223g = (C101526p.C101527a) tag;
    }

    /* renamed from: a */
    public void mo140995a(Message message) {
        C87412m.m108594g(message, StateEvent.Name.MESSAGE);
    }

    public boolean onPreDraw() {
        View view = this.f297222f.get();
        C87412m.m108591d(view);
        Object obj = f297219i.get(this.f297220d);
        C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((Long) obj).longValue();
        Handler handler = view.getHandler();
        Message obtain = Message.obtain(view.getHandler(), new C101509b(view, this, longValue));
        C87412m.m108593f(obtain, "this");
        mo140995a(obtain);
        handler.sendMessage(obtain);
        return true;
    }
}
