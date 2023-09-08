package p583k2;

import android.content.Context;
import android.view.View;
import androidx.compose.p002ui.platform.AbstractComposeView;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C24721r;
import p582k1.C108797b;
import rx3.C13598b0;

/* renamed from: k2.f */
public final class C108858f<T extends View> extends C108830a {

    /* renamed from: A */
    public C32226l<? super Context, ? extends T> f325990A;

    /* renamed from: B */
    public C32226l<? super T, C13598b0> f325991B = C108846c.f325971a;

    /* renamed from: z */
    public T f325992z;

    /* renamed from: k2.f$a */
    public static final class C108859a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108858f<T> f325993d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108859a(C108858f<T> fVar) {
            super(0);
            this.f325993d = fVar;
        }

        public Object invoke() {
            T typedView$ui_release = this.f325993d.getTypedView$ui_release();
            if (typedView$ui_release != null) {
                this.f325993d.getUpdateBlock().invoke(typedView$ui_release);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108858f(Context context, C24721r rVar, C108797b bVar) {
        super(context, rVar, bVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "dispatcher");
    }

    public final C32226l<Context, T> getFactory() {
        return this.f325990A;
    }

    public AbstractComposeView getSubCompositionView() {
        return null;
    }

    public final T getTypedView$ui_release() {
        return this.f325992z;
    }

    public final C32226l<T, C13598b0> getUpdateBlock() {
        return this.f325991B;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setFactory(C32226l<? super Context, ? extends T> lVar) {
        this.f325990A = lVar;
        if (lVar != null) {
            Context context = getContext();
            C87412m.m108593f(context, "context");
            T t = (View) lVar.invoke(context);
            this.f325992z = t;
            setView$ui_release(t);
        }
    }

    public final void setTypedView$ui_release(T t) {
        this.f325992z = t;
    }

    public final void setUpdateBlock(C32226l<? super T, C13598b0> lVar) {
        C87412m.m108594g(lVar, "value");
        this.f325991B = lVar;
        setUpdate(new C108859a(this));
    }
}
