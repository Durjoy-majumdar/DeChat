package p171il;

import android.view.View;
import com.tencent.p014mm.emoji.sync.C92668a;
import gy3.C87412m;
import p595ll.C99511t;
import p813fl.C97894c0;

/* renamed from: il.c */
public final class C98707c extends C98748z<C97894c0> {

    /* renamed from: B */
    public final C98709b f289447B;

    /* renamed from: il.c$a */
    public static final class C98708a implements View.OnAttachStateChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C98707c f289448d;

        public C98708a(C98707c cVar) {
            this.f289448d = cVar;
        }

        public void onViewAttachedToWindow(View view) {
            C98707c.m128480z(this.f289448d).mo126705f(this.f289448d.f289447B);
            if (C98707c.m128480z(this.f289448d).hasMore()) {
                C98707c.m128480z(this.f289448d).mo126699a();
            }
        }

        public void onViewDetachedFromWindow(View view) {
            C98707c.m128480z(this.f289448d).mo126704e(this.f289448d.f289447B);
        }
    }

    /* renamed from: il.c$b */
    public static final class C98709b implements C92668a.C92678k {

        /* renamed from: a */
        public final /* synthetic */ C98707c f289449a;

        /* renamed from: b */
        public final /* synthetic */ View f289450b;

        public C98709b(C98707c cVar, View view) {
            this.f289449a = cVar;
            this.f289450b = view;
        }

        /* renamed from: a */
        public void mo126716a(int i) {
            if (C98707c.m128480z(this.f289449a).hasMore() && this.f289450b.isAttachedToWindow()) {
                C98707c.m128480z(this.f289449a).mo126699a();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98707c(View view, C98744t tVar) {
        super(view, tVar);
        C87412m.m108594g(view, "itemView");
        C98708a aVar = new C98708a(this);
        this.f289447B = new C98709b(this, view);
        view.addOnAttachStateChangeListener(aVar);
    }

    /* renamed from: z */
    public static final C99511t m128480z(C98707c cVar) {
        C97894c0 c0Var = (C97894c0) cVar.f289539A;
        boolean z = true;
        if (c0Var == null || c0Var.f287184b != 1) {
            z = false;
        }
        return z ? C92668a.f266699q.mo126717a(false) : C92668a.f266699q.mo126718b(false);
    }
}
