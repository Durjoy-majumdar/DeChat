package zo1;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import d60.C58124b;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62660c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;

/* renamed from: zo1.n */
public final class C66933n extends C62660c {

    /* renamed from: p */
    public final C58124b f192312p;

    /* renamed from: q */
    public final C13601g f192313q;

    /* renamed from: r */
    public final C13601g f192314r;

    /* renamed from: s */
    public final C13601g f192315s = C36568h.m40985a(new C66936c(this));

    /* renamed from: zo1.n$a */
    public static final class C66934a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f192316d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66934a(ViewGroup viewGroup) {
            super(0);
            this.f192316d = viewGroup;
        }

        public Object invoke() {
            return this.f192316d.findViewById(C0966R.C0970id.f357484a32);
        }
    }

    /* renamed from: zo1.n$b */
    public static final class C66935b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f192317d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66935b(ViewGroup viewGroup) {
            super(0);
            this.f192317d = viewGroup;
        }

        public Object invoke() {
            return (TextView) this.f192317d.findViewById(C0966R.C0970id.nwy);
        }
    }

    /* renamed from: zo1.n$c */
    public static final class C66936c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C66933n f192318d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66936c(C66933n nVar) {
            super(0);
            this.f192318d = nVar;
        }

        public Object invoke() {
            return this.f192318d.mo14484z0().findViewById(C0966R.C0970id.e1t);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66933n(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f192312p = bVar;
        this.f192313q = C36568h.m40985a(new C66935b(viewGroup));
        this.f192314r = C36568h.m40985a(new C66934a(viewGroup));
    }

    /* renamed from: Z0 */
    public final void mo90922Z0(String str) {
        C87412m.m108594g(str, "anchorUsername");
        C58969q b = C58961d.f168673a.mo84155b(str);
        TextView textView = (TextView) ((C36570n) this.f192313q).getValue();
        Resources resources = this.f166287d.getContext().getResources();
        Object[] objArr = new Object[1];
        objArr[0] = b != null ? b.mo84196w1() : "";
        textView.setText(resources.getString(C0966R.string.n2s, objArr));
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }
}
