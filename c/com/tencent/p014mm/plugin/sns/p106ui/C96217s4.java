package com.tencent.p014mm.plugin.sns.p106ui;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53930o0;
import a14.C53934p0;
import android.content.Context;
import android.text.SpannableString;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.cover.preview.SnsCoverContainerLayout;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f14.C58901s;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import os2.C100398c0;
import p629ny.C76979h;
import p773yy.C79168k;
import qe0.C47806g;
import qy2.C63347a;
import rx3.C13598b0;
import vr2.C102236a0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.sns.ui.s4 */
public final class C96217s4 extends SnsHeader {

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1", mo125469f = "SnsHeaderImprove.kt", mo125470l = {39, 65}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.ui.s4$a */
    public static final class C96218a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f281166d;

        /* renamed from: e */
        public final /* synthetic */ C96217s4 f281167e;

        /* renamed from: f */
        public final /* synthetic */ String f281168f;

        /* renamed from: g */
        public final /* synthetic */ String f281169g;

        /* renamed from: h */
        public final /* synthetic */ String f281170h;

        /* renamed from: i */
        public final /* synthetic */ String f281171i;

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$1", mo125469f = "SnsHeaderImprove.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.sns.ui.s4$a$a */
        public static final class C96219a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C96217s4 f281172d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C96219a(C96217s4 s4Var, C15601d<? super C96219a> dVar) {
                super(2, dVar);
                this.f281172d = s4Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$1");
                C96219a aVar = new C96219a(this.f281172d, dVar);
                SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$1");
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$1");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$1");
                Object invokeSuspend = ((C96219a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$1");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$1");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$1");
                ResultKt.throwOnFailure(obj);
                this.f281172d.mo132747k();
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$1");
                return b0Var;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$2", mo125469f = "SnsHeaderImprove.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.sns.ui.s4$a$b */
        public static final class C96220b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C96217s4 f281173d;

            /* renamed from: e */
            public final /* synthetic */ CharSequence f281174e;

            /* renamed from: f */
            public final /* synthetic */ SpannableString f281175f;

            /* renamed from: g */
            public final /* synthetic */ String f281176g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C96220b(C96217s4 s4Var, CharSequence charSequence, SpannableString spannableString, String str, C15601d<? super C96220b> dVar) {
                super(2, dVar);
                this.f281173d = s4Var;
                this.f281174e = charSequence;
                this.f281175f = spannableString;
                this.f281176g = str;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$2");
                C96220b bVar = new C96220b(this.f281173d, this.f281174e, this.f281175f, this.f281176g, dVar);
                SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$2");
                return bVar;
            }

            public Object invoke(Object obj, Object obj2) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$2");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$2");
                Object invokeSuspend = ((C96220b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$2");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$2");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$2");
                ResultKt.throwOnFailure(obj);
                C96217s4 s4Var = this.f281173d;
                s4Var.f278099d.f278126a.setContentDescription(s4Var.getContext().getString(C0966R.string.f361369jb2, new Object[]{this.f281174e}));
                this.f281173d.f278099d.f278127b.setText(this.f281175f);
                this.f281173d.f278099d.f278128c.setText(this.f281174e);
                C96217s4 s4Var2 = this.f281173d;
                if (s4Var2.f278108p) {
                    s4Var2.f278099d.f278129d.setVisibility(0);
                    this.f281173d.f278099d.f278129d.setText(this.f281176g);
                } else {
                    s4Var2.f278099d.f278129d.setVisibility(8);
                }
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$2");
                return b0Var;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96218a(C96217s4 s4Var, String str, String str2, String str3, String str4, C15601d<? super C96218a> dVar) {
            super(2, dVar);
            this.f281167e = s4Var;
            this.f281168f = str;
            this.f281169g = str2;
            this.f281170h = str3;
            this.f281171i = str4;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1");
            C96218a aVar = new C96218a(this.f281167e, this.f281168f, this.f281169g, this.f281170h, this.f281171i, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1");
            Object invokeSuspend = ((C96218a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            Class cls = C76979h.class;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f281166d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f281167e.f278101f = C112550d0.m153799i0(this.f281168f).toString();
                C96217s4 s4Var = this.f281167e;
                C112550d0.m153799i0(this.f281169g).toString();
                s4Var.getClass();
                this.f281167e.f278106n = C87412m.m108589b(this.f281169g, this.f281168f);
                C96217s4 s4Var2 = this.f281167e;
                SnsCoverContainerLayout snsCoverContainerLayout = s4Var2.f278099d.f278137l;
                Boolean bool = s4Var2.f278097A;
                C87412m.m108593f(bool, "isCoverPreview");
                snsCoverContainerLayout.setPreview(bool.booleanValue());
                C96217s4 s4Var3 = this.f281167e;
                s4Var3.f278099d.f278137l.mo130665c(s4Var3.f278106n, this.f281168f);
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C96219a aVar2 = new C96219a(this.f281167e, (C15601d<? super C96219a>) null);
                this.f281166d = 1;
                if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                this.f281167e.f278107o = false;
                C100398c0 Yt = C94866e1.Xx0().mo139782Yt(this.f281168f);
                if (this.f281167e.f278108p && (Util.isNullOrNil(Yt.field_bgUrl) || Util.isNullOrNil(Yt.field_imBGmd5sum) || Util.isNullOrNil(Yt.field_imBGfileid))) {
                    Log.m105920e("MicroMsg.SnsHeader", "openim bg error, do not show like btn");
                    this.f281167e.f278107o = true;
                }
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1");
                return b0Var;
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1");
                throw illegalStateException;
            }
            Log.m105918d("MicroMsg.SnsHeader", "usrNamelen " + this.f281168f.length() + "  " + this.f281168f);
            if (this.f281168f.length() > 0) {
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f281168f);
                SpannableString T1 = ((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f281167e.getContext(), (z1Var == null || Util.isNullOrNil(z1Var.mo62898f())) ? C102236a0.m134771t0(this.f281170h) : z1Var.mo62898f());
                TextView textView = this.f281167e.f278099d.f278128c;
                CharSequence Fe = ((C79168k) C86312j.m106911c(C79168k.class)).mo74108Fe(textView, this.f281168f, T1, C63347a.C47892c.SNS_TIMELINE_NICK, (float) ((int) (((double) textView.getTextSize()) * 1.15d)));
                this.f281167e.f278108p = C72996z1.m85843n5(this.f281168f);
                SpannableString yp02 = ((C76979h) C86312j.m106911c(cls)).yp0(this.f281167e.getContext(), this.f281171i, this.f281167e.f278099d.f278127b.getTextSize());
                String a = C47806g.m53116a(z1Var);
                C53896h0 h0Var2 = C53872d1.f151117a;
                C53915k2 k2Var2 = C58901s.f168555a;
                C96220b bVar = new C96220b(this.f281167e, Fe, yp02, a, (C15601d<? super C96220b>) null);
                this.f281166d = 2;
                if (C53895h.m60469g(k2Var2, bVar, this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1");
                    return aVar;
                }
                this.f281167e.f278107o = false;
                C100398c0 Yt2 = C94866e1.Xx0().mo139782Yt(this.f281168f);
                Log.m105920e("MicroMsg.SnsHeader", "openim bg error, do not show like btn");
                this.f281167e.f278107o = true;
            }
            C13598b0 b0Var2 = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1");
            return b0Var2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96217s4(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: m */
    public void mo132749m(String str, String str2, String str3, String str4) {
        SnsMethodCalculate.markStartTimeMs("setUserName", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove");
        if (str == null || str2 == null) {
            Log.m105920e("MicroMsg.SnsHeader", "userName or selfName is null ");
            SnsMethodCalculate.markEndTimeMs("setUserName", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove");
            return;
        }
        C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151117a, (C53934p0) null, new C96218a(this, str, str2, str3, str4, (C15601d<? super C96218a>) null), 2, (Object) null);
        SnsMethodCalculate.markEndTimeMs("setUserName", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove");
    }
}
