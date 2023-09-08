package ek2;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import eb0.C75592q0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.ResultKt;
import nj2.C61759g;
import nj3.C76912y0;
import o40.C61926c;
import qo3.C101218e0;
import qo3.C89779i0;
import rx3.C13598b0;
import wj2.C66132f;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ek2.e */
public final class C7730e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f26171d;

    /* renamed from: e */
    public final /* synthetic */ C66132f f26172e;

    /* renamed from: f */
    public final /* synthetic */ C101218e0 f26173f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.widget.RingtoneHalfBottomDialog$showRingtoneSettingHalfUIWithoutPlayer$1$3$1", mo125469f = "RingtoneHalfBottomDialog.kt", mo125470l = {382}, mo125471m = "invokeSuspend")
    /* renamed from: ek2.e$a */
    public static final class C7731a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f26174d;

        /* renamed from: e */
        public int f26175e;

        /* renamed from: f */
        public final /* synthetic */ Context f26176f;

        /* renamed from: g */
        public final /* synthetic */ C66132f f26177g;

        /* renamed from: h */
        public final /* synthetic */ C101218e0 f26178h;

        /* renamed from: ek2.e$a$a */
        public static final class C7732a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ boolean f26179d;

            /* renamed from: e */
            public final /* synthetic */ C89779i0 f26180e;

            /* renamed from: f */
            public final /* synthetic */ C101218e0 f26181f;

            /* renamed from: g */
            public final /* synthetic */ Context f26182g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C7732a(boolean z, C89779i0 i0Var, C101218e0 e0Var, Context context) {
                super(0);
                this.f26179d = z;
                this.f26180e = i0Var;
                this.f26181f = e0Var;
                this.f26182g = context;
            }

            public Object invoke() {
                if (this.f26179d) {
                    this.f26180e.hide();
                    this.f26181f.mo140680z();
                    Context context = this.f26182g;
                    C76912y0.m92768g(context, context.getResources().getString(C0966R.string.i59));
                } else {
                    this.f26180e.hide();
                    Context context2 = this.f26182g;
                    C76912y0.m92767f(context2, context2.getResources().getString(C0966R.string.inu));
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7731a(Context context, C66132f fVar, C101218e0 e0Var, C15601d<? super C7731a> dVar) {
            super(2, dVar);
            this.f26176f = context;
            this.f26177g = fVar;
            this.f26178h = e0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C7731a(this.f26176f, this.f26177g, this.f26178h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C7731a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C89779i0 i0Var;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f26175e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Context context = this.f26176f;
                C89779i0 e = C89779i0.m112248e(context, context.getResources().getString(C0966R.string.in7), false, 3, (DialogInterface.OnCancelListener) null);
                e.show();
                C61759g.C61760a aVar2 = C61759g.f175551f;
                C66132f fVar = this.f26177g;
                this.f26174d = e;
                this.f26175e = 1;
                String s = C75592q0.m90789s();
                C87412m.m108593f(s, "getUsernameFromUserInfo()");
                Object f = aVar2.mo86682f(fVar, s, false, "", this);
                if (f == aVar) {
                    return aVar;
                }
                i0Var = e;
                obj = f;
            } else if (i == 1) {
                i0Var = (C89779i0) this.f26174d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C61926c.m72668M(new C7732a(((Boolean) obj).booleanValue(), i0Var, this.f26178h, this.f26176f));
            return C13598b0.f38549a;
        }
    }

    public C7730e(Context context, C66132f fVar, C101218e0 e0Var) {
        this.f26171d = context;
        this.f26172e = fVar;
        this.f26173f = e0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUIWithoutPlayer$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C7731a(this.f26171d, this.f26172e, this.f26173f, (C15601d<? super C7731a>) null), 3, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUIWithoutPlayer$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
