package wh2;

import android.content.Context;
import android.content.DialogInterface;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: wh2.b */
public final class C102446b {

    /* renamed from: a */
    public C89779i0 f301696a;

    /* renamed from: b */
    public C32224a<C13598b0> f301697b = C102447a.f301698d;

    /* renamed from: wh2.b$a */
    public static final class C102447a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C102447a f301698d = new C102447a();

        public C102447a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wh2.b$b */
    public static final class C102448b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C102446b f301699d;

        public C102448b(C102446b bVar) {
            this.f301699d = bVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f301699d.f301697b.invoke();
        }
    }

    /* renamed from: a */
    public final void mo142014a() {
        C89779i0 i0Var = this.f301696a;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        this.f301696a = null;
    }

    /* renamed from: b */
    public final void mo142015b(Context context, boolean z, int i, C32224a<C13598b0> aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "cancel");
        this.f301697b = aVar;
        if (this.f301696a == null) {
            this.f301696a = C89779i0.m112248e(context, context.getString(i), z, 0, new C102448b(this));
        }
    }
}
