package tf1;

import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import o40.C61926c;
import rx3.C13598b0;
import tf1.C13914m;
import zp3.C16389w;

/* renamed from: tf1.g */
public final class C13900g<R extends C13914m> {

    /* renamed from: a */
    public final LinkedList<C16389w> f39067a;

    /* renamed from: tf1.g$a */
    public static final class C13901a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13900g<R> f39068d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13901a(C13900g<R> gVar) {
            super(0);
            this.f39068d = gVar;
        }

        public Object invoke() {
            LinkedList<C16389w> linkedList = this.f39068d.f39067a;
            synchronized (linkedList) {
                for (C16389w onChanged : linkedList) {
                    onChanged.onChanged();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: tf1.g$b */
    public static final class C13902b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13900g<R> f39069d;

        /* renamed from: e */
        public final /* synthetic */ int f39070e;

        /* renamed from: f */
        public final /* synthetic */ int f39071f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13902b(C13900g<R> gVar, int i, int i2) {
            super(0);
            this.f39069d = gVar;
            this.f39070e = i;
            this.f39071f = i2;
        }

        public Object invoke() {
            LinkedList<C16389w> linkedList = this.f39069d.f39067a;
            int i = this.f39070e;
            int i2 = this.f39071f;
            synchronized (linkedList) {
                for (C16389w onItemRangeChanged : linkedList) {
                    onItemRangeChanged.onItemRangeChanged(i, i2);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: tf1.g$c */
    public static final class C13903c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13900g<R> f39072d;

        /* renamed from: e */
        public final /* synthetic */ int f39073e;

        /* renamed from: f */
        public final /* synthetic */ int f39074f;

        /* renamed from: g */
        public final /* synthetic */ Object f39075g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13903c(C13900g<R> gVar, int i, int i2, Object obj) {
            super(0);
            this.f39072d = gVar;
            this.f39073e = i;
            this.f39074f = i2;
            this.f39075g = obj;
        }

        public Object invoke() {
            LinkedList<C16389w> linkedList = this.f39072d.f39067a;
            int i = this.f39073e;
            int i2 = this.f39074f;
            Object obj = this.f39075g;
            synchronized (linkedList) {
                for (C16389w onItemRangeChanged : linkedList) {
                    onItemRangeChanged.onItemRangeChanged(i, i2, obj);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: tf1.g$d */
    public static final class C13904d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13900g<R> f39076d;

        /* renamed from: e */
        public final /* synthetic */ int f39077e;

        /* renamed from: f */
        public final /* synthetic */ int f39078f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13904d(C13900g<R> gVar, int i, int i2) {
            super(0);
            this.f39076d = gVar;
            this.f39077e = i;
            this.f39078f = i2;
        }

        public Object invoke() {
            LinkedList<C16389w> linkedList = this.f39076d.f39067a;
            int i = this.f39077e;
            int i2 = this.f39078f;
            synchronized (linkedList) {
                for (C16389w onItemRangeInserted : linkedList) {
                    onItemRangeInserted.onItemRangeInserted(i, i2);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: tf1.g$e */
    public static final class C13905e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13900g<R> f39079d;

        /* renamed from: e */
        public final /* synthetic */ int f39080e;

        /* renamed from: f */
        public final /* synthetic */ int f39081f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13905e(C13900g<R> gVar, int i, int i2) {
            super(0);
            this.f39079d = gVar;
            this.f39080e = i;
            this.f39081f = i2;
        }

        public Object invoke() {
            LinkedList<C16389w> linkedList = this.f39079d.f39067a;
            int i = this.f39080e;
            int i2 = this.f39081f;
            synchronized (linkedList) {
                for (C16389w onItemRangeRemoved : linkedList) {
                    onItemRangeRemoved.onItemRangeRemoved(i, i2);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: tf1.g$f */
    public static final class C13906f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13900g<R> f39082d;

        /* renamed from: e */
        public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f39083e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13906f(C13900g<R> gVar, RefreshLoadMoreLayout.C7080c<Object> cVar) {
            super(0);
            this.f39082d = gVar;
            this.f39083e = cVar;
        }

        public Object invoke() {
            LinkedList<C16389w> linkedList = this.f39082d.f39067a;
            RefreshLoadMoreLayout.C7080c<Object> cVar = this.f39083e;
            synchronized (linkedList) {
                for (C16389w onPreFinishRefresh : linkedList) {
                    onPreFinishRefresh.onPreFinishRefresh(cVar);
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C13900g(LinkedList<C16389w> linkedList) {
        C87412m.m108594g(linkedList, "viewCallbacks");
        this.f39067a = linkedList;
    }

    /* renamed from: f */
    public static void m13322f(C13900g gVar, RefreshLoadMoreLayout.C7080c cVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        gVar.getClass();
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        C61926c.m72668M(new C13907h(gVar, z, cVar));
    }

    /* renamed from: a */
    public final void mo13376a() {
        C61926c.m72668M(new C13901a(this));
    }

    /* renamed from: b */
    public final void mo13377b(int i, int i2) {
        C61926c.m72668M(new C13902b(this, i, i2));
    }

    /* renamed from: c */
    public final void mo13378c(int i, int i2, Object obj) {
        C61926c.m72668M(new C13903c(this, i, i2, obj));
    }

    /* renamed from: d */
    public final void mo13379d(int i, int i2) {
        C61926c.m72668M(new C13904d(this, i, i2));
    }

    /* renamed from: e */
    public final void mo13380e(int i, int i2) {
        C61926c.m72668M(new C13905e(this, i, i2));
    }

    /* renamed from: g */
    public final void mo13381g(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        C61926c.m72668M(new C13906f(this, cVar));
    }
}
