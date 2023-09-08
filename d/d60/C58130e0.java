package d60;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import o40.C61926c;
import rx3.C13598b0;
import y50.C53496k;

/* renamed from: d60.e0 */
public final class C58130e0 extends C58121a {

    /* renamed from: f */
    public final C58124b f166523f;

    /* renamed from: g */
    public final ImageView f166524g;

    /* renamed from: h */
    public final RelativeLayout f166525h;

    /* renamed from: i */
    public final ImageView f166526i;

    /* renamed from: j */
    public final RelativeLayout f166527j;

    /* renamed from: n */
    public final TextView f166528n;

    /* renamed from: o */
    public final View f166529o;

    /* renamed from: p */
    public final View f166530p;

    /* renamed from: q */
    public final View f166531q;

    /* renamed from: r */
    public int f166532r;

    /* renamed from: s */
    public final C32224a<C13598b0> f166533s;

    /* renamed from: d60.e0$a */
    public static final class C58131a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f166534d;

        /* renamed from: e */
        public final /* synthetic */ C58130e0 f166535e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58131a(ViewGroup viewGroup, C58130e0 e0Var) {
            super(0);
            this.f166534d = viewGroup;
            this.f166535e = e0Var;
        }

        public Object invoke() {
            C61926c.m72668M(new C58129d0(this.f166534d, this.f166535e));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.e0$b */
    public static final class C58132b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C58130e0 f166536d;

        public C58132b(C58130e0 e0Var) {
            this.f166536d = e0Var;
        }

        public final void run() {
            C58130e0 e0Var = this.f166536d;
            e0Var.getClass();
            ArrayList arrayList = new ArrayList();
            arrayList.add(e0Var.f166530p);
            arrayList.add(e0Var.f166531q);
            int width = e0Var.f166530p.getWidth();
            int width2 = e0Var.f166531q.getWidth();
            if (width < width2) {
                width = width2;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight() + ((width - view.getWidth()) / 2), view.getPaddingBottom());
            }
            e0Var.f166287d.requestLayout();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58130e0(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f166523f = bVar;
        this.f166524g = (ImageView) viewGroup.findViewById(C0966R.C0970id.fxv);
        this.f166525h = (RelativeLayout) viewGroup.findViewById(C0966R.C0970id.fxw);
        this.f166526i = (ImageView) viewGroup.findViewById(C0966R.C0970id.fxz);
        this.f166527j = (RelativeLayout) viewGroup.findViewById(C0966R.C0970id.f358585fy0);
        this.f166528n = (TextView) viewGroup.findViewById(C0966R.C0970id.fxx);
        TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.f358586fy1);
        TextView textView2 = (TextView) viewGroup.findViewById(C0966R.C0970id.fy5);
        this.f166529o = viewGroup.findViewById(C0966R.C0970id.fxy);
        this.f166530p = viewGroup.findViewById(C0966R.C0970id.f358587fy2);
        this.f166531q = viewGroup.findViewById(C0966R.C0970id.fy6);
        C58131a aVar = new C58131a(viewGroup, this);
        this.f166533s = aVar;
        C53496k.f150436a.mo74171d(mo82894j0(), aVar);
        if (viewGroup.findViewById(C0966R.C0970id.bsc) != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            if (!mo82893g0()) {
                layoutParams.bottomMargin = C75044y4.m89991c(viewGroup.getContext());
            }
            ((LinearLayout) viewGroup.findViewById(C0966R.C0970id.bsc)).setLayoutParams(layoutParams);
        }
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (!(ordinal == 5 || ordinal == 6)) {
            if (ordinal == 7) {
                mo10792g(0);
                this.f166287d.post(new C58132b(this));
                return;
            } else if (ordinal != 27) {
                return;
            }
        }
        mo10792g(8);
    }
}
