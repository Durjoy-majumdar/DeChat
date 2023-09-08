package en3;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: en3.d */
public final class C97676d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView f286486d;

    /* renamed from: e */
    public final /* synthetic */ C8477a0 f286487e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0<Runnable> f286488f;

    /* renamed from: g */
    public final /* synthetic */ MMHandler f286489g;

    /* renamed from: en3.d$a */
    public static final class C97677a implements View.OnAttachStateChangeListener {

        /* renamed from: d */
        public final /* synthetic */ View f286490d;

        /* renamed from: e */
        public final /* synthetic */ C8477a0 f286491e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0 f286492f;

        /* renamed from: g */
        public final /* synthetic */ MMHandler f286493g;

        public C97677a(View view, C8477a0 a0Var, C8479f0 f0Var, MMHandler mMHandler) {
            this.f286490d = view;
            this.f286491e = a0Var;
            this.f286492f = f0Var;
            this.f286493g = mMHandler;
        }

        public void onViewAttachedToWindow(View view) {
            C87412m.m108594g(view, "view");
        }

        public void onViewDetachedFromWindow(View view) {
            C87412m.m108594g(view, "view");
            this.f286490d.removeOnAttachStateChangeListener(this);
            this.f286491e.f27482d = true;
            Runnable runnable = (Runnable) this.f286492f.f27484d;
            if (runnable != null) {
                this.f286493g.removeCallbacks(runnable);
            }
        }
    }

    public C97676d(RecyclerView recyclerView, C8477a0 a0Var, C8479f0<Runnable> f0Var, MMHandler mMHandler) {
        this.f286486d = recyclerView;
        this.f286487e = a0Var;
        this.f286488f = f0Var;
        this.f286489g = mMHandler;
    }

    public final void run() {
        RecyclerView recyclerView = this.f286486d;
        C8477a0 a0Var = this.f286487e;
        C8479f0<Runnable> f0Var = this.f286488f;
        MMHandler mMHandler = this.f286489g;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (!C107207u.C107211e.m145207b(recyclerView)) {
            a0Var.f27482d = true;
            Runnable runnable = (Runnable) f0Var.f27484d;
            if (runnable != null) {
                mMHandler.removeCallbacks(runnable);
                return;
            }
            return;
        }
        recyclerView.addOnAttachStateChangeListener(new C97677a(recyclerView, a0Var, f0Var, mMHandler));
    }
}
