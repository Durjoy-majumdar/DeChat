package dq3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: dq3.a */
public final class C58420a implements RecyclerViewDrawerSquares.C57901b {

    /* renamed from: a */
    public final /* synthetic */ RecyclerViewDrawerSquares f167367a;

    /* renamed from: b */
    public final /* synthetic */ int f167368b;

    /* renamed from: dq3.a$a */
    public static final class C58421a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RecyclerViewDrawerSquares f167369d;

        /* renamed from: e */
        public final /* synthetic */ int f167370e;

        /* renamed from: dq3.a$a$a */
        public static final class C58422a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ RecyclerViewDrawerSquares f167371d;

            /* renamed from: e */
            public final /* synthetic */ int f167372e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58422a(RecyclerViewDrawerSquares recyclerViewDrawerSquares, int i) {
                super(0);
                this.f167371d = recyclerViewDrawerSquares;
                this.f167372e = i;
            }

            public Object invoke() {
                this.f167371d.setOpening(false);
                RecyclerViewDrawerSquares.C45117c onOpenDrawerListener = this.f167371d.getOnOpenDrawerListener();
                if (onOpenDrawerListener != null) {
                    onOpenDrawerListener.mo3766g(true, false, this.f167372e);
                }
                return C13598b0.f38549a;
            }
        }

        public C58421a(RecyclerViewDrawerSquares recyclerViewDrawerSquares, int i) {
            this.f167369d = recyclerViewDrawerSquares;
            this.f167370e = i;
        }

        public final void run() {
            RecyclerViewDrawerSquares recyclerViewDrawerSquares = this.f167369d;
            recyclerViewDrawerSquares.f165697r.invoke(new C58422a(recyclerViewDrawerSquares, this.f167370e));
        }
    }

    public C58420a(RecyclerViewDrawerSquares recyclerViewDrawerSquares, int i) {
        this.f167367a = recyclerViewDrawerSquares;
        this.f167368b = i;
    }

    /* renamed from: a */
    public void mo82577a(int i, int i2, int i3, int i4) {
        Log.m105924i("DrawerSquares", "[openDrawer] onLayoutChange height:" + this.f167367a.getHeight());
        RecyclerViewDrawerSquares recyclerViewDrawerSquares = this.f167367a;
        recyclerViewDrawerSquares.f165696q = null;
        recyclerViewDrawerSquares.setTranslationY((float) recyclerViewDrawerSquares.getHeight());
        RecyclerViewDrawerSquares recyclerViewDrawerSquares2 = this.f167367a;
        recyclerViewDrawerSquares2.post(new C58421a(recyclerViewDrawerSquares2, this.f167368b));
    }
}
