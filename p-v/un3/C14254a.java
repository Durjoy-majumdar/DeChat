package un3;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bi3.C0289a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import f14.C58901s;
import fy3.C32227p;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import kotlin.ResultKt;
import rx3.C13598b0;
import tm3.C78056e;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.uic.PlusMenuCreateChatRoomUIC$onCreate$1$1$1", mo125469f = "PlusMenuCreateChatRoomUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: un3.a */
public final class C14254a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C14263d f39781d;

    /* renamed from: e */
    public final /* synthetic */ C78056e f39782e;

    @C91590f(mo125468c = "com.tencent.mm.ui.uic.PlusMenuCreateChatRoomUIC$onCreate$1$1$1$1", mo125469f = "PlusMenuCreateChatRoomUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: un3.a$a */
    public static final class C14255a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C14263d f39783d;

        /* renamed from: e */
        public final /* synthetic */ C78056e f39784e;

        /* renamed from: un3.a$a$a */
        public static final class C14256a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C14263d f39785d;

            public C14256a(C14263d dVar) {
                this.f39785d = dVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/uic/PlusMenuCreateChatRoomUIC$onCreate$1$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C14263d dVar = this.f39785d;
                dVar.getClass();
                Intent intent = new Intent();
                intent.setClassName(dVar.getActivity(), "com.tencent.mm.ui.contact.GroupCardSelectUI");
                intent.putExtra("group_select_type", true);
                AppCompatActivity activity = dVar.getActivity();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                AppCompatActivity appCompatActivity = activity;
                C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/ui/uic/PlusMenuCreateChatRoomUIC", "onGroupCardClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(appCompatActivity, "com/tencent/mm/ui/uic/PlusMenuCreateChatRoomUIC", "onGroupCardClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C117292a.m165361g(this, "com/tencent/mm/ui/uic/PlusMenuCreateChatRoomUIC$onCreate$1$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14255a(C14263d dVar, C78056e eVar, C15601d<? super C14255a> dVar2) {
            super(2, dVar2);
            this.f39783d = dVar;
            this.f39784e = eVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C14255a(this.f39783d, this.f39784e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C14255a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            View inflate = C85868k2.m106137b(this.f39783d.getActivity()).inflate(C0966R.C0971layout.ayl, this.f39784e.f228799c, false);
            ((TextView) inflate.findViewById(C0966R.C0970id.bsk)).setText(this.f39783d.getString(C0966R.string.f7467h1));
            inflate.setOnClickListener(new C14256a(this.f39783d));
            this.f39784e.f228797a.invoke(inflate);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14254a(C14263d dVar, C78056e eVar, C15601d<? super C14254a> dVar2) {
        super(2, dVar2);
        this.f39781d = dVar;
        this.f39782e = eVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C14254a(this.f39781d, this.f39782e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C14254a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        LifecycleScope c3;
        ResultKt.throwOnFailure(obj);
        if (C0289a.f857a.mo336a() && (c3 = this.f39781d.mo14597c3()) != null) {
            C53896h0 h0Var = C53872d1.f151117a;
            C53895h.m60466d(c3, C58901s.f168555a, (C53934p0) null, new C14255a(this.f39781d, this.f39782e, (C15601d<? super C14255a>) null), 2, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
