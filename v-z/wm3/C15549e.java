package wm3;

import a14.C0000n0;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import fy3.C32227p;
import gy3.C8479f0;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.ResultKt;
import rx3.C13598b0;
import tm3.C78056e;
import tm3.C78069w;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.mvvm.uic.atsomeone.AtSomeOneTopMenuUIC$onCreate$1$9$1$1", mo125469f = "AtSomeOneTopMenuUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: wm3.e */
public final class C15549e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C78069w f42140d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<View> f42141e;

    /* renamed from: f */
    public final /* synthetic */ C78631f f42142f;

    /* renamed from: g */
    public final /* synthetic */ C78056e f42143g;

    /* renamed from: wm3.e$a */
    public static final class C15550a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C78631f f42144d;

        public C15550a(C78631f fVar, C78069w wVar) {
            this.f42144d = fVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/mvvm/uic/atsomeone/AtSomeOneTopMenuUIC$onCreate$1$9$1$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C78631f fVar = this.f42144d;
            fVar.getClass();
            Intent intent = new Intent();
            intent.putExtra("KSelectUserList", "notify@all");
            fVar.mo108608g3(1);
            fVar.getActivity().setResult(-1, intent);
            fVar.getActivity().finish();
            C117292a.m165361g(this, "com/tencent/mm/ui/mvvm/uic/atsomeone/AtSomeOneTopMenuUIC$onCreate$1$9$1$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15549e(C78069w wVar, C8479f0<View> f0Var, C78631f fVar, C78056e eVar, C15601d<? super C15549e> dVar) {
        super(2, dVar);
        this.f42140d = wVar;
        this.f42141e = f0Var;
        this.f42142f = fVar;
        this.f42143g = eVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15549e(this.f42140d, this.f42141e, this.f42142f, this.f42143g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15549e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        if (this.f42140d.mo108033b()) {
            View view = (View) this.f42141e.f27484d;
            if (view != null) {
                this.f42143g.f228797a.invoke(view);
            }
            this.f42141e.f27484d = null;
        } else {
            C8479f0<View> f0Var = this.f42141e;
            T inflate = C85868k2.m106137b(this.f42142f.getActivity()).inflate(C0966R.C0971layout.d0x, this.f42143g.f228799c, false);
            C78056e eVar = this.f42143g;
            inflate.setOnClickListener(new C15550a(this.f42142f, this.f42140d));
            eVar.f228797a.invoke(inflate);
            f0Var.f27484d = inflate;
        }
        return C13598b0.f38549a;
    }
}
