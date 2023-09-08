package te0;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ie0.C46220j;
import j20.C117292a;
import java.util.ArrayList;
import je0.C46477j0;
import nd3.C88929c;
import nd3.C88930e;
import qo3.C12925w;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: te0.k */
public final class C48635k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f130168d;

    /* renamed from: e */
    public final /* synthetic */ C46220j f130169e;

    /* renamed from: f */
    public final /* synthetic */ C12925w f130170f;

    /* renamed from: te0.k$a */
    public static final class C48636a implements C88930e {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f130171a;

        /* renamed from: b */
        public final /* synthetic */ C46220j f130172b;

        /* renamed from: c */
        public final /* synthetic */ C12925w f130173c;

        /* renamed from: te0.k$a$a */
        public static final class C48637a extends C87413o implements C32226l<Boolean, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C89779i0 f130174d;

            /* renamed from: e */
            public final /* synthetic */ C12925w f130175e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C48637a(C89779i0 i0Var, C12925w wVar) {
                super(1);
                this.f130174d = i0Var;
                this.f130175e = wVar;
            }

            public Object invoke(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                this.f130174d.hide();
                C48639m.m54059a(C48639m.f130178a, booleanValue, this.f130175e);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: te0.k$a$b */
        public static final class C48638b extends C87413o implements C32226l<Boolean, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C89779i0 f130176d;

            /* renamed from: e */
            public final /* synthetic */ C12925w f130177e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C48638b(C89779i0 i0Var, C12925w wVar) {
                super(1);
                this.f130176d = i0Var;
                this.f130177e = wVar;
            }

            public Object invoke(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                this.f130176d.hide();
                C48639m.m54059a(C48639m.f130178a, booleanValue, this.f130177e);
                return C13598b0.f38549a;
            }
        }

        public C48636a(ViewGroup viewGroup, C46220j jVar, C12925w wVar) {
            this.f130171a = viewGroup;
            this.f130172b = jVar;
            this.f130173c = wVar;
        }

        public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            if (iArr != null && iArr[0] == 0) {
                C89779i0 e = C89779i0.m112248e(this.f130171a.getContext(), this.f130171a.getContext().getString(C0966R.string.a4d), false, 3, (DialogInterface.OnCancelListener) null);
                C46477j0 j0Var = C46477j0.f125215a;
                Context context = this.f130171a.getContext();
                C87412m.m108593f(context, "root.context");
                j0Var.mo71850a(context, this.f130172b, new C48637a(e, this.f130173c));
                return;
            }
            C89779i0 e2 = C89779i0.m112248e(this.f130171a.getContext(), this.f130171a.getContext().getString(C0966R.string.a4d), false, 3, (DialogInterface.OnCancelListener) null);
            C46477j0 j0Var2 = C46477j0.f125215a;
            Context context2 = this.f130171a.getContext();
            C87412m.m108593f(context2, "root.context");
            j0Var2.mo71850a(context2, this.f130172b, new C48638b(e2, this.f130173c));
        }
    }

    public C48635k(ViewGroup viewGroup, C46220j jVar, C12925w wVar) {
        this.f130168d = viewGroup;
        this.f130169e = jVar;
        this.f130170f = wVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/openim/ui/dialog/OpenIMKefuLocReqDialog$initDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Context context = this.f130168d.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            C88929c.m111022f(activity, 0, new C48636a(this.f130168d, this.f130169e, this.f130170f), new String[]{"android.permission.ACCESS_FINE_LOCATION"}, (String) null, (String) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/openim/ui/dialog/OpenIMKefuLocReqDialog$initDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
