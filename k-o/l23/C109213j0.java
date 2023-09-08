package l23;

import android.os.Bundle;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.vlog.p117ui.widget.PagInputView;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import lh2.C99417a;
import qh2.C101198e;
import rx3.C13598b0;

/* renamed from: l23.j0 */
public final class C109213j0 extends C99417a {

    /* renamed from: f */
    public final PagInputView f327000f;

    /* renamed from: l23.j0$a */
    public static final class C109214a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109213j0 f327001d;

        /* renamed from: e */
        public final /* synthetic */ C101198e f327002e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109214a(C109213j0 j0Var, C101198e eVar) {
            super(1);
            this.f327001d = j0Var;
            this.f327002e = eVar;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.f327001d.f327000f.setShow(false);
            if (booleanValue) {
                Bundle bundle = new Bundle();
                bundle.putString("EDIT_PAG_CHANGE_TEXT", this.f327001d.f327000f.getResult());
                this.f327002e.mo14585p(C101198e.C101199b.EDIT_UPDATE_PAG_TEXT, bundle);
            }
            C101198e.C62622a.m73576a(this.f327002e, C101198e.C101199b.EDIT_IN_PREVIEW, (Bundle) null, 2, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109213j0(ViewGroup viewGroup, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(viewGroup, "layout");
        C87412m.m108594g(eVar, "status");
        PagInputView pagInputView = (PagInputView) viewGroup.findViewById(C0966R.C0970id.ccq);
        this.f327000f = pagInputView;
        pagInputView.setTextChangeCallback(new C109214a(this, eVar));
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (!(this.f327000f.getVisibility() == 0)) {
            return false;
        }
        this.f327000f.setShow(false);
        C101198e.C62622a.m73576a(this.f291492d, C101198e.C101199b.EDIT_IN_PREVIEW, (Bundle) null, 2, (Object) null);
        return true;
    }
}
