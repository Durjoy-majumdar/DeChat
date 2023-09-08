package bk3;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import f14.C58901s;
import fy3.C32227p;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import kotlin.ResultKt;
import rx3.C13598b0;
import tm3.C78056e;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.component.uic.SelectSendCardUIC$onCreate$1$2$1", mo125469f = "SelectSendCardUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: bk3.a */
public final class C0307a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C0313c f881d;

    /* renamed from: e */
    public final /* synthetic */ C78056e f882e;

    @C91590f(mo125468c = "com.tencent.mm.ui.chatting.component.uic.SelectSendCardUIC$onCreate$1$2$1$1", mo125469f = "SelectSendCardUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: bk3.a$a */
    public static final class C0308a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0313c f883d;

        /* renamed from: e */
        public final /* synthetic */ C78056e f884e;

        /* renamed from: bk3.a$a$a */
        public static final class C0309a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C0313c f885d;

            public C0309a(C0313c cVar) {
                this.f885d = cVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/chatting/component/uic/SelectSendCardUIC$onCreate$1$2$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C0313c cVar = this.f885d;
                cVar.getClass();
                if (WeChatBrands.Business.Entries.ContactOa.checkAvailable(cVar.getActivity())) {
                    Intent intent = new Intent();
                    intent.putExtra("list_attr", 16384);
                    C88144b.m109795m(cVar.getActivity(), "brandservice", ".ui.BrandServiceIndexUI", intent, 2);
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/uic/SelectSendCardUIC$onCreate$1$2$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0308a(C0313c cVar, C78056e eVar, C15601d<? super C0308a> dVar) {
            super(2, dVar);
            this.f883d = cVar;
            this.f884e = eVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C0308a(this.f883d, this.f884e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C0308a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            View inflate = C85868k2.m106137b(this.f883d.getActivity()).inflate(C0966R.C0971layout.ayl, this.f884e.f228799c, false);
            ((TextView) inflate.findViewById(C0966R.C0970id.bsk)).setText(this.f883d.getString(C0966R.string.f7482hf));
            inflate.setOnClickListener(new C0309a(this.f883d));
            this.f884e.f228797a.invoke(inflate);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0307a(C0313c cVar, C78056e eVar, C15601d<? super C0307a> dVar) {
        super(2, dVar);
        this.f881d = cVar;
        this.f882e = eVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C0307a(this.f881d, this.f882e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C0307a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        LifecycleScope c3 = this.f881d.mo14597c3();
        if (c3 != null) {
            C53896h0 h0Var = C53872d1.f151117a;
            C53895h.m60466d(c3, C58901s.f168555a, (C53934p0) null, new C0308a(this.f881d, this.f882e, (C15601d<? super C0308a>) null), 2, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
