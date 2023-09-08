package dn3;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import f14.C58901s;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C36570n;
import tm3.C78056e;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.mvvm.uic.conversation.selectchatroom.SelectChatroomConversationDataSourceUIC$onCreate$1$1$1", mo125469f = "SelectChatroomConversationDataSourceUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: dn3.d */
public final class C7406d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C7396c f25553d;

    /* renamed from: e */
    public final /* synthetic */ C78056e f25554e;

    @C91590f(mo125468c = "com.tencent.mm.ui.mvvm.uic.conversation.selectchatroom.SelectChatroomConversationDataSourceUIC$onCreate$1$1$1$1", mo125469f = "SelectChatroomConversationDataSourceUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: dn3.d$a */
    public static final class C7407a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C7396c f25555d;

        /* renamed from: e */
        public final /* synthetic */ C78056e f25556e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7407a(C7396c cVar, C78056e eVar, C15601d<? super C7407a> dVar) {
            super(2, dVar);
            this.f25555d = cVar;
            this.f25556e = eVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C7407a(this.f25555d, this.f25556e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C7407a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            View inflate = C85868k2.m106137b(this.f25555d.getActivity()).inflate(C0966R.C0971layout.cz8, this.f25556e.f228799c, false);
            C32226l<View, C13598b0> lVar = this.f25556e.f228797a;
            C87412m.m108593f(inflate, "headerView");
            lVar.invoke(inflate);
            String str = (String) ((C36570n) this.f25555d.f25541j).getValue();
            if (str != null) {
                if (!(str.length() > 0)) {
                    str = null;
                }
                if (str != null) {
                    TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.ncz);
                    textView.setVisibility(0);
                    textView.setText(str);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7406d(C7396c cVar, C78056e eVar, C15601d<? super C7406d> dVar) {
        super(2, dVar);
        this.f25553d = cVar;
        this.f25554e = eVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C7406d(this.f25553d, this.f25554e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C7406d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        LifecycleScope c3 = this.f25553d.mo14597c3();
        if (c3 != null) {
            C53896h0 h0Var = C53872d1.f151117a;
            C53895h.m60466d(c3, C58901s.f168555a, (C53934p0) null, new C7407a(this.f25553d, this.f25554e, (C15601d<? super C7407a>) null), 2, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
