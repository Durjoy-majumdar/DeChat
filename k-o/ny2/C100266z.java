package ny2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.teenmode.p111ui.TeenModePrivatePwdUI;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.storage.C72996z1;
import d14.C45252f;
import d14.C45253g;
import d14.C58042h;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import f14.C58901s;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import ky2.C10432i;
import ky2.C10437m;
import ly2.C10685q;
import my2.C11098e;
import ob0.C47350c;
import pb0.C47445a;
import pb0.C47446b;
import qb0.C47798b;
import qo3.C77426q;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C48805b34;
import te3.C64221a34;
import te3.kq4;
import wb2.C65946a;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI$doVerify$1", mo125469f = "TeenModePrivatePwdUI.kt", mo125470l = {339}, mo125471m = "invokeSuspend")
/* renamed from: ny2.z */
public final class C100266z extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f293750d;

    /* renamed from: e */
    public final /* synthetic */ C45252f<C47445a<kq4>> f293751e;

    /* renamed from: f */
    public final /* synthetic */ TeenModePrivatePwdUI f293752f;

    /* renamed from: ny2.z$a */
    public static final class C100267a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ TeenModePrivatePwdUI f293753d;

        public C100267a(TeenModePrivatePwdUI teenModePrivatePwdUI) {
            this.f293753d = teenModePrivatePwdUI;
        }

        public Object emit(Object obj, C15601d dVar) {
            String str;
            C47445a aVar = (C47445a) obj;
            Class cls = C10432i.class;
            Class cls2 = C10685q.class;
            if (aVar.f128348a == C47798b.OnEnd) {
                ((C10685q) C86312j.m106911c(cls2)).mo10757ri(20);
                String str2 = null;
                if (aVar.f128350c == 0) {
                    TeenModePrivatePwdUI teenModePrivatePwdUI = this.f293753d;
                    int i = TeenModePrivatePwdUI.f282420o;
                    if (teenModePrivatePwdUI.mo134516R7() == 5) {
                        TeenModePrivatePwdUI teenModePrivatePwdUI2 = this.f293753d;
                        teenModePrivatePwdUI2.getClass();
                        C64221a34 a342 = new C64221a34();
                        a342.f182015g = 3;
                        a342.f182016h = ((C10685q) C86312j.m106911c(cls2)).f32106f;
                        a342.f182017i = 2;
                        C47350c.C47352b bVar = new C47350c.C47352b();
                        bVar.f127069d = 4277;
                        bVar.f127068c = "/cgi-bin/micromsg-bin/setteenagermodepwd";
                        bVar.f127066a = a342;
                        bVar.f127067b = new C48805b34();
                        C45252f a = C47446b.f127269a.mo72464a(bVar.mo72403a());
                        C39622i0 a2 = C39818r.f106831a.mo62444c(teenModePrivatePwdUI2).mo75002a(C65946a.class);
                        C87412m.m108593f(a2, "UICProvider.of(this).get…ycleScopeUIC::class.java)");
                        LifecycleScope c3 = ((C65946a) a2).mo89983c3();
                        C53896h0 h0Var = C53872d1.f151117a;
                        C53895h.m60465c(c3, C58901s.f168555a, C53934p0.DEFAULT, new C100262w(a, teenModePrivatePwdUI2, (C15601d<? super C100262w>) null));
                        return C13598b0.f38549a;
                    }
                }
                C89779i0 i0Var = this.f293753d.f282425i;
                if (i0Var != null) {
                    i0Var.dismiss();
                }
                boolean z = false;
                if (aVar.f128350c == 0) {
                    C10685q qVar = (C10685q) C86312j.m106911c(cls2);
                    kq4 kq4 = (kq4) aVar.f128353f;
                    if (kq4 == null || (str = kq4.f136992d) == null) {
                        str = ((C10685q) C86312j.m106911c(cls2)).f32106f;
                    }
                    qVar.f32106f = str;
                    ((C10685q) C86312j.m106911c(cls2)).f32107g = 2;
                    this.f293753d.setResult(-1);
                    this.f293753d.mo7681K7(-1);
                    if (this.f293753d.getIntent().getIntExtra("intent_extra_biz_type", 0) != 0) {
                        C10437m mVar = new C10437m();
                        mVar.field_businessType = this.f293753d.getIntent().getIntExtra("intent_extra_biz_type", Integer.MAX_VALUE);
                        mVar.field_businessKey = this.f293753d.getIntent().getStringExtra("intent_extra_biz_key");
                        C72996z1 BD = ((C10432i) C86312j.m106911c(cls)).mo10736BD();
                        if (BD != null) {
                            str2 = BD.getUsername();
                        }
                        mVar.field_guardianUserName = str2;
                        mVar.field_wardUserName = C75592q0.m90789s();
                        mVar.field_time = C31543z5.m39453c();
                        C11098e.f32878a.mo11232a().replace(mVar);
                        ((C10432i) C86312j.m106911c(cls)).I40();
                    }
                } else {
                    kq4 kq42 = (kq4) aVar.f128353f;
                    if (kq42 != null && kq42.f136993e) {
                        z = true;
                    }
                    if (z) {
                        C77426q qVar2 = new C77426q(this.f293753d.getContext());
                        qVar2.mo107595g(aVar.f128351d);
                        qVar2.mo107598j(this.f293753d.getString(C0966R.string.f360821f20));
                        qVar2.mo107601m(C0966R.string.f8028zq);
                        qVar2.mo107590b(new C11322y(this.f293753d));
                        qVar2.mo107603o();
                        this.f293753d.mo134515Q7().setText("");
                        ((C10685q) C86312j.m106911c(cls2)).mo10757ri(21);
                    } else {
                        this.f293753d.mo134521W7(aVar.f128351d);
                        this.f293753d.mo134515Q7().setText("");
                        ((C10685q) C86312j.m106911c(cls2)).mo10757ri(21);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100266z(C45252f<C47445a<kq4>> fVar, TeenModePrivatePwdUI teenModePrivatePwdUI, C15601d<? super C100266z> dVar) {
        super(2, dVar);
        this.f293751e = fVar;
        this.f293752f = teenModePrivatePwdUI;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C100266z(this.f293751e, this.f293752f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C100266z) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f293750d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C45252f<C47445a<kq4>> fVar = this.f293751e;
            C53896h0 h0Var = C53872d1.f151117a;
            C45252f<C47445a<kq4>> j = C58042h.m67201j(fVar, C58901s.f168555a);
            C100267a aVar2 = new C100267a(this.f293752f);
            this.f293750d = 1;
            if (j.mo31880a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
