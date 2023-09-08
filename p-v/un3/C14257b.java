package un3;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
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

@C91590f(mo125468c = "com.tencent.mm.ui.uic.PlusMenuCreateChatRoomUIC$onCreate$1$1$2", mo125469f = "PlusMenuCreateChatRoomUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: un3.b */
public final class C14257b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C14263d f39786d;

    /* renamed from: e */
    public final /* synthetic */ C78056e f39787e;

    @C91590f(mo125468c = "com.tencent.mm.ui.uic.PlusMenuCreateChatRoomUIC$onCreate$1$1$2$1", mo125469f = "PlusMenuCreateChatRoomUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: un3.b$a */
    public static final class C14258a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C14263d f39788d;

        /* renamed from: e */
        public final /* synthetic */ C78056e f39789e;

        /* renamed from: un3.b$a$a */
        public static final class C14259a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C14263d f39790d;

            public C14259a(C14263d dVar) {
                this.f39790d = dVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/uic/PlusMenuCreateChatRoomUIC$onCreate$1$1$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C14263d dVar = this.f39790d;
                dVar.getClass();
                C115669n.INSTANCE.mo160131h(11140, 0);
                C88144b.m109789g(dVar.getActivity(), "pwdgroup", ".ui.FacingCreateChatRoomAllInOneUI");
                C117292a.m165361g(this, "com/tencent/mm/ui/uic/PlusMenuCreateChatRoomUIC$onCreate$1$1$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14258a(C14263d dVar, C78056e eVar, C15601d<? super C14258a> dVar2) {
            super(2, dVar2);
            this.f39788d = dVar;
            this.f39789e = eVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C14258a(this.f39788d, this.f39789e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C14258a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            View inflate = C85868k2.m106137b(this.f39788d.getActivity()).inflate(C0966R.C0971layout.ayl, this.f39789e.f228799c, false);
            ((TextView) inflate.findViewById(C0966R.C0970id.bsk)).setText(this.f39788d.getString(C0966R.string.cw_));
            inflate.setOnClickListener(new C14259a(this.f39788d));
            this.f39789e.f228797a.invoke(inflate);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14257b(C14263d dVar, C78056e eVar, C15601d<? super C14257b> dVar2) {
        super(2, dVar2);
        this.f39786d = dVar;
        this.f39787e = eVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C14257b(this.f39786d, this.f39787e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C14257b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        LifecycleScope c3 = this.f39786d.mo14597c3();
        if (c3 != null) {
            C53896h0 h0Var = C53872d1.f151117a;
            C53895h.m60466d(c3, C58901s.f168555a, (C53934p0) null, new C14258a(this.f39786d, this.f39787e, (C15601d<? super C14258a>) null), 2, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
