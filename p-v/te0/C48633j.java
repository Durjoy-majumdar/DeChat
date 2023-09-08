package te0;

import a14.C53934p0;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ie0.C46220j;
import j20.C117292a;
import java.util.ArrayList;
import je0.C46483k0;
import je0.C46488m0;
import qo3.C12925w;
import qo3.C89779i0;
import rx3.C13598b0;
import wb2.C65946a;
import wx3.C15601d;

/* renamed from: te0.j */
public final class C48633j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f130163d;

    /* renamed from: e */
    public final /* synthetic */ C46220j f130164e;

    /* renamed from: f */
    public final /* synthetic */ C12925w f130165f;

    /* renamed from: te0.j$a */
    public static final class C48634a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C89779i0 f130166d;

        /* renamed from: e */
        public final /* synthetic */ C12925w f130167e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48634a(C89779i0 i0Var, C12925w wVar) {
            super(1);
            this.f130166d = i0Var;
            this.f130167e = wVar;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.f130166d.hide();
            C48639m.m54059a(C48639m.f130178a, booleanValue, this.f130167e);
            return C13598b0.f38549a;
        }
    }

    public C48633j(ViewGroup viewGroup, C46220j jVar, C12925w wVar) {
        this.f130163d = viewGroup;
        this.f130164e = jVar;
        this.f130165f = wVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/openim/ui/dialog/OpenIMKefuLocReqDialog$initDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C89779i0 e = C89779i0.m112248e(this.f130163d.getContext(), this.f130163d.getContext().getString(C0966R.string.a4d), false, 3, (DialogInterface.OnCancelListener) null);
        Context context = this.f130163d.getContext();
        C87412m.m108593f(context, "root.context");
        C46220j jVar = this.f130164e;
        C48634a aVar = new C48634a(e, this.f130165f);
        C87412m.m108594g(jVar, "contact");
        String str = jVar.field_username;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        C46483k0 k0Var = new C46483k0(aVar, jVar, context);
        C39622i0 a = C39818r.f106831a.mo62443b(context).mo75002a(C65946a.class);
        C87412m.m108593f(a, "UICProvider.of(context).…ycleScopeUIC::class.java)");
        C65946a aVar2 = (C65946a) a;
        LifecycleScope.launchDefault$default(aVar2.mo89983c3(), (C53934p0) null, new C46488m0(aVar2, str2, false, k0Var, (C15601d<? super C46488m0>) null), 1, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/openim/ui/dialog/OpenIMKefuLocReqDialog$initDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
