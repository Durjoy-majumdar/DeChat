package com.tencent.p014mm.plugin.finder.view.notice;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.xweb.pinus.ChildProcessServiceWrapper;
import er1.C58739j4;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C49098d51;
import te3.C50523nc3;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u00101\u001a\u000200\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tR$\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00078\u0006@BX\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010&\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001cR6\u0010/\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020(\u0018\u00010'8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00066"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/notice/NoticeStatusView;", "Landroid/widget/RelativeLayout;", "", "getLayoutId", "getBgRes", "getNormalTextColorRes", "getGreyTextColorRes", "", "getPayText", "Lkotlin/Function0;", "Lte3/d51;", "getNoticeFuncRef", "<set-?>", "f", "Ljava/lang/String;", "getUsername", "()Ljava/lang/String;", "username", "Landroid/view/View;", "h", "Landroid/view/View;", "getBgView", "()Landroid/view/View;", "bgView", "Landroid/widget/TextView;", "j", "Landroid/widget/TextView;", "getTvPrice", "()Landroid/widget/TextView;", "tvPrice", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "n", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "getIvTicket", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "ivTicket", "o", "getTvBigText", "tvBigText", "Lkotlin/Function2;", "Lrx3/b0;", "s", "Lfy3/p;", "getProgressDoneAndNextAction", "()Lfy3/p;", "setProgressDoneAndNextAction", "(Lfy3/p;)V", "progressDoneAndNextAction", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.notice.NoticeStatusView */
public class NoticeStatusView extends RelativeLayout {

    /* renamed from: t */
    public static final /* synthetic */ int f18311t = 0;

    /* renamed from: d */
    public int f18312d;

    /* renamed from: e */
    public C32224a<? extends C49098d51> f18313e;

    /* renamed from: f */
    public String f18314f = "";

    /* renamed from: g */
    public final C0000n0 f18315g = C53930o0.m60555b();

    /* renamed from: h */
    public final View f18316h;

    /* renamed from: i */
    public final WeImageView f18317i;

    /* renamed from: j */
    public final TextView f18318j;

    /* renamed from: n */
    public final WeImageView f18319n;

    /* renamed from: o */
    public final TextView f18320o;

    /* renamed from: p */
    public final TextView f18321p;

    /* renamed from: q */
    public final View f18322q;

    /* renamed from: r */
    public final View f18323r;

    /* renamed from: s */
    public C32227p<? super Integer, ? super Integer, C13598b0> f18324s;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.view.notice.NoticeStatusView", mo125469f = "NoticeStatusView.kt", mo125470l = {301}, mo125471m = "agentClick")
    /* renamed from: com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$a */
    public static final class C4127a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f18325d;

        /* renamed from: e */
        public final /* synthetic */ NoticeStatusView f18326e;

        /* renamed from: f */
        public int f18327f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4127a(NoticeStatusView noticeStatusView, C15601d<? super C4127a> dVar) {
            super(dVar);
            this.f18326e = noticeStatusView;
        }

        public final Object invokeSuspend(Object obj) {
            this.f18325d = obj;
            this.f18327f |= Integer.MIN_VALUE;
            return this.f18326e.mo5016a(0, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.view.notice.NoticeStatusView", mo125469f = "NoticeStatusView.kt", mo125470l = {322, 322}, mo125471m = "click")
    /* renamed from: com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$b */
    public static final class C4128b extends C66704d {

        /* renamed from: d */
        public Object f18328d;

        /* renamed from: e */
        public Object f18329e;

        /* renamed from: f */
        public /* synthetic */ Object f18330f;

        /* renamed from: g */
        public final /* synthetic */ NoticeStatusView f18331g;

        /* renamed from: h */
        public int f18332h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4128b(NoticeStatusView noticeStatusView, C15601d<? super C4128b> dVar) {
            super(dVar);
            this.f18331g = noticeStatusView;
        }

        public final Object invokeSuspend(Object obj) {
            this.f18330f = obj;
            this.f18332h |= Integer.MIN_VALUE;
            NoticeStatusView noticeStatusView = this.f18331g;
            int i = NoticeStatusView.f18311t;
            return noticeStatusView.mo5017b((C49098d51) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.view.notice.NoticeStatusView", mo125469f = "NoticeStatusView.kt", mo125470l = {343, 359, 370, 377}, mo125471m = "executeConcertPay")
    /* renamed from: com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$c */
    public static final class C4129c extends C66704d {

        /* renamed from: d */
        public Object f18333d;

        /* renamed from: e */
        public Object f18334e;

        /* renamed from: f */
        public /* synthetic */ Object f18335f;

        /* renamed from: g */
        public final /* synthetic */ NoticeStatusView f18336g;

        /* renamed from: h */
        public int f18337h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4129c(NoticeStatusView noticeStatusView, C15601d<? super C4129c> dVar) {
            super(dVar);
            this.f18336g = noticeStatusView;
        }

        public final Object invokeSuspend(Object obj) {
            this.f18335f = obj;
            this.f18337h |= Integer.MIN_VALUE;
            NoticeStatusView noticeStatusView = this.f18336g;
            int i = NoticeStatusView.f18311t;
            return noticeStatusView.mo5018c((C49098d51) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.view.notice.NoticeStatusView", mo125469f = "NoticeStatusView.kt", mo125470l = {391, 393, 404, 411}, mo125471m = "executeNormalPay")
    /* renamed from: com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$d */
    public static final class C4130d extends C66704d {

        /* renamed from: d */
        public Object f18338d;

        /* renamed from: e */
        public Object f18339e;

        /* renamed from: f */
        public /* synthetic */ Object f18340f;

        /* renamed from: g */
        public final /* synthetic */ NoticeStatusView f18341g;

        /* renamed from: h */
        public int f18342h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4130d(NoticeStatusView noticeStatusView, C15601d<? super C4130d> dVar) {
            super(dVar);
            this.f18341g = noticeStatusView;
        }

        public final Object invokeSuspend(Object obj) {
            this.f18340f = obj;
            this.f18342h |= Integer.MIN_VALUE;
            NoticeStatusView noticeStatusView = this.f18341g;
            int i = NoticeStatusView.f18311t;
            return noticeStatusView.mo5019d((C49098d51) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.view.notice.NoticeStatusView", mo125469f = "NoticeStatusView.kt", mo125470l = {425}, mo125471m = "getProduct")
    /* renamed from: com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$e */
    public static final class C4131e extends C66704d {

        /* renamed from: d */
        public Object f18343d;

        /* renamed from: e */
        public Object f18344e;

        /* renamed from: f */
        public /* synthetic */ Object f18345f;

        /* renamed from: g */
        public final /* synthetic */ NoticeStatusView f18346g;

        /* renamed from: h */
        public int f18347h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4131e(NoticeStatusView noticeStatusView, C15601d<? super C4131e> dVar) {
            super(dVar);
            this.f18346g = noticeStatusView;
        }

        public final Object invokeSuspend(Object obj) {
            this.f18345f = obj;
            this.f18347h |= Integer.MIN_VALUE;
            NoticeStatusView noticeStatusView = this.f18346g;
            int i = NoticeStatusView.f18311t;
            return noticeStatusView.mo5020e((C49098d51) null, this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$f */
    public static final class C4132f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ NoticeStatusView f18348d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C49098d51> f18349e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$render$1$1", mo125469f = "NoticeStatusView.kt", mo125470l = {285}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$f$a */
        public static final class C4133a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f18350d;

            /* renamed from: e */
            public final /* synthetic */ NoticeStatusView f18351e;

            /* renamed from: f */
            public final /* synthetic */ C32224a<C49098d51> f18352f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4133a(NoticeStatusView noticeStatusView, C32224a<? extends C49098d51> aVar, C15601d<? super C4133a> dVar) {
                super(2, dVar);
                this.f18351e = noticeStatusView;
                this.f18352f = aVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C4133a(this.f18351e, this.f18352f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C4133a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f18350d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f18350d = 1;
                    int i2 = NoticeStatusView.f18311t;
                    if (this.f18351e.mo5017b(this.f18352f.invoke(), this) == aVar) {
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

        public C4132f(NoticeStatusView noticeStatusView, C32224a<? extends C49098d51> aVar) {
            this.f18348d = noticeStatusView;
            this.f18349e = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/notice/NoticeStatusView$render$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            NoticeStatusView noticeStatusView = this.f18348d;
            noticeStatusView.f18312d = 0;
            C53895h.m60466d(noticeStatusView.f18315g, (C66212f) null, (C53934p0) null, new C4133a(noticeStatusView, this.f18349e, (C15601d<? super C4133a>) null), 3, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/notice/NoticeStatusView$render$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.view.notice.NoticeStatusView", mo125469f = "NoticeStatusView.kt", mo125470l = {478}, mo125471m = "showLicense")
    /* renamed from: com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$g */
    public static final class C4134g extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f18353d;

        /* renamed from: e */
        public final /* synthetic */ NoticeStatusView f18354e;

        /* renamed from: f */
        public int f18355f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4134g(NoticeStatusView noticeStatusView, C15601d<? super C4134g> dVar) {
            super(dVar);
            this.f18354e = noticeStatusView;
        }

        public final Object invokeSuspend(Object obj) {
            this.f18353d = obj;
            this.f18355f |= Integer.MIN_VALUE;
            NoticeStatusView noticeStatusView = this.f18354e;
            int i = NoticeStatusView.f18311t;
            return noticeStatusView.mo5021g(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoticeStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View inflate = View.inflate(context, getLayoutId(), this);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.nfw);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.id.ll_bg)");
        this.f18316h = findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.nfr);
        C87412m.m108593f(findViewById2, "rootView.findViewById(R.id.iv_value_icon)");
        this.f18317i = (WeImageView) findViewById2;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.ngt);
        C87412m.m108593f(findViewById3, "rootView.findViewById(R.id.tv_price)");
        TextView textView = (TextView) findViewById3;
        this.f18318j = textView;
        View findViewById4 = viewGroup.findViewById(C0966R.C0970id.nfq);
        C87412m.m108593f(findViewById4, "rootView.findViewById(R.id.iv_ticket)");
        WeImageView weImageView = (WeImageView) findViewById4;
        this.f18319n = weImageView;
        View findViewById5 = viewGroup.findViewById(C0966R.C0970id.ngs);
        C87412m.m108593f(findViewById5, "rootView.findViewById(R.id.tv_big_text)");
        TextView textView2 = (TextView) findViewById5;
        this.f18320o = textView2;
        View findViewById6 = viewGroup.findViewById(C0966R.C0970id.ngv);
        C87412m.m108593f(findViewById6, "rootView.findViewById(R.id.tv_small_text)");
        TextView textView3 = (TextView) findViewById6;
        this.f18321p = textView3;
        View findViewById7 = viewGroup.findViewById(C0966R.C0970id.f358604nx1);
        C87412m.m108593f(findViewById7, "rootView.findViewById(R.id.ll_up)");
        this.f18322q = findViewById7;
        View findViewById8 = viewGroup.findViewById(C0966R.C0970id.f358603nx0);
        C87412m.m108593f(findViewById8, "rootView.findViewById(R.id.ll_down)");
        this.f18323r = findViewById8;
        findViewById.setBackground(getResources().getDrawable(getBgRes()));
        textView.setTextColor(getResources().getColor(getNormalTextColorRes()));
        weImageView.setIconColor(getResources().getColor(getNormalTextColorRes()));
        textView2.setTextColor(getResources().getColor(getNormalTextColorRes()));
        textView3.setTextColor(getResources().getColor(getNormalTextColorRes()));
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        C85875k4.m106189j0(textView2.getPaint(), 0.8f);
        C85875k4.m106189j0(textView3.getPaint(), 0.8f);
        C58739j4.f168176a.mo83703c0(textView, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5016a(int r5, wx3.C15601d<? super rx3.C13598b0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView.C4127a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$a r0 = (com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView.C4127a) r0
            int r1 = r0.f18327f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f18327f = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$a r0 = new com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f18325d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f18327f
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0049
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r6)
            r4.f18312d = r5
            fy3.a<? extends te3.d51> r5 = r4.f18313e
            if (r5 == 0) goto L_0x0049
            java.lang.Object r5 = r5.invoke()
            te3.d51 r5 = (te3.C49098d51) r5
            if (r5 == 0) goto L_0x0049
            r0.f18327f = r3
            java.lang.Object r5 = r4.mo5017b(r5, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            rx3.b0 r5 = rx3.C13598b0.f38549a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView.mo5016a(int, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5017b(te3.C49098d51 r7, wx3.C15601d<? super rx3.C13598b0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView.C4128b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$b r0 = (com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView.C4128b) r0
            int r1 = r0.f18332h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f18332h = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$b r0 = new com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$b
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f18330f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f18332h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            goto L_0x002f
        L_0x0027:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x002f:
            java.lang.Object r7 = r0.f18329e
            te3.d51 r7 = (te3.C49098d51) r7
            java.lang.Object r0 = r0.f18328d
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView r0 = (com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x00b0
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r8)
            te3.nc3 r8 = r7.f132128q
            r2 = 0
            if (r8 == 0) goto L_0x004a
            boolean r5 = r8.f138532d
            if (r5 != r4) goto L_0x004a
            r5 = 1
            goto L_0x004b
        L_0x004a:
            r5 = 0
        L_0x004b:
            if (r5 == 0) goto L_0x00e1
            if (r8 == 0) goto L_0x0055
            int r5 = r8.f138533e
            if (r5 != 0) goto L_0x0055
            r5 = 1
            goto L_0x0056
        L_0x0055:
            r5 = 0
        L_0x0056:
            if (r5 != 0) goto L_0x00e1
            if (r8 == 0) goto L_0x0120
            boolean r8 = r8.f138534f
            if (r8 == 0) goto L_0x0095
            java.lang.String r7 = r7.f132126o
            if (r7 == 0) goto L_0x006a
            int r7 = r7.length()
            if (r7 != 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r4 = 0
        L_0x006a:
            if (r4 == 0) goto L_0x0080
            android.content.Context r7 = r6.getContext()
            android.content.res.Resources r8 = r6.getResources()
            r0 = 2131828244(0x7f111e14, float:1.9289423E38)
            java.lang.String r8 = r8.getString(r0)
            nj3.C76912y0.m92773l(r7, r8)
            goto L_0x0120
        L_0x0080:
            fy3.p<? super java.lang.Integer, ? super java.lang.Integer, rx3.b0> r7 = r6.f18324s
            if (r7 == 0) goto L_0x0120
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r2)
            int r0 = r6.f18312d
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            r7.invoke(r8, r1)
            goto L_0x0120
        L_0x0095:
            java.lang.String r8 = r7.f132126o
            if (r8 == 0) goto L_0x009f
            int r8 = r8.length()
            if (r8 != 0) goto L_0x00a0
        L_0x009f:
            r2 = 1
        L_0x00a0:
            if (r2 == 0) goto L_0x00b7
            r0.f18328d = r6
            r0.f18329e = r7
            r0.f18332h = r4
            java.lang.Object r8 = r6.mo5019d(r7, r0)
            if (r8 != r1) goto L_0x00af
            return r1
        L_0x00af:
            r0 = r6
        L_0x00b0:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            goto L_0x00c4
        L_0x00b7:
            r0.f18328d = r6
            r0.f18329e = r7
            r0.f18332h = r3
            java.lang.Object r8 = r6.mo5018c(r7, r0)
            if (r8 != r1) goto L_0x00af
            return r1
        L_0x00c4:
            if (r8 == 0) goto L_0x0120
            te3.nc3 r7 = r7.f132128q
            if (r7 != 0) goto L_0x00cb
            goto L_0x00cd
        L_0x00cb:
            r7.f138534f = r4
        L_0x00cd:
            fy3.p<? super java.lang.Integer, ? super java.lang.Integer, rx3.b0> r7 = r0.f18324s
            if (r7 == 0) goto L_0x0120
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r4)
            int r0 = r0.f18312d
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            r7.invoke(r8, r1)
            goto L_0x0120
        L_0x00e1:
            int r8 = r7.f132119e
            if (r8 != 0) goto L_0x00e7
            r8 = 1
            goto L_0x00e8
        L_0x00e7:
            r8 = 0
        L_0x00e8:
            java.lang.String r7 = r7.f132126o
            if (r7 == 0) goto L_0x00f2
            int r7 = r7.length()
            if (r7 != 0) goto L_0x00f3
        L_0x00f2:
            r2 = 1
        L_0x00f3:
            if (r2 == 0) goto L_0x010c
            fy3.p<? super java.lang.Integer, ? super java.lang.Integer, rx3.b0> r7 = r6.f18324s
            if (r7 == 0) goto L_0x0120
            if (r8 == 0) goto L_0x00fc
            r4 = -1
        L_0x00fc:
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r4)
            int r0 = r6.f18312d
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            r7.invoke(r8, r1)
            goto L_0x0120
        L_0x010c:
            fy3.p<? super java.lang.Integer, ? super java.lang.Integer, rx3.b0> r7 = r6.f18324s
            if (r7 == 0) goto L_0x0120
            r8 = r8 ^ r4
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r8)
            int r8 = r6.f18312d
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r8)
            r7.invoke(r0, r1)
        L_0x0120:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView.mo5017b(te3.d51, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0247  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5018c(te3.C49098d51 r23, wx3.C15601d<? super java.lang.Boolean> r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            boolean r2 = r1 instanceof com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView.C4129c
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$c r2 = (com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView.C4129c) r2
            int r3 = r2.f18337h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f18337h = r3
            goto L_0x001c
        L_0x0017:
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$c r2 = new com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$c
            r2.<init>(r0, r1)
        L_0x001c:
            r12 = r2
            java.lang.Object r1 = r12.f18335f
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r12.f18337h
            java.lang.String r4 = "context"
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            java.lang.String r15 = "NoticeStatusView"
            if (r3 == 0) goto L_0x0066
            if (r3 == r8) goto L_0x005e
            if (r3 == r7) goto L_0x0050
            if (r3 == r6) goto L_0x0042
            if (r3 != r5) goto L_0x003a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0293
        L_0x003a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0042:
            java.lang.Object r3 = r12.f18334e
            te3.th3 r3 = (te3.C51398th3) r3
            java.lang.Object r6 = r12.f18333d
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView r6 = (com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView) r6
            kotlin.ResultKt.throwOnFailure(r1)
        L_0x004d:
            r5 = r3
            goto L_0x0255
        L_0x0050:
            java.lang.Object r3 = r12.f18334e
            te3.th3 r3 = (te3.C51398th3) r3
            java.lang.Object r7 = r12.f18333d
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView r7 = (com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView) r7
            kotlin.ResultKt.throwOnFailure(r1)
            r6 = r7
            goto L_0x0237
        L_0x005e:
            java.lang.Object r3 = r12.f18333d
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView r3 = (com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView) r3
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x007c
        L_0x0066:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.String r1 = "#executeConcertPay"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            r12.f18333d = r0
            r12.f18337h = r8
            r1 = r23
            java.lang.Object r1 = r0.mo5020e(r1, r12)
            if (r1 != r2) goto L_0x007b
            return r2
        L_0x007b:
            r3 = r0
        L_0x007c:
            te3.th3 r1 = (te3.C51398th3) r1
            if (r1 == 0) goto L_0x02ac
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "#executeConcertPay id="
            r10.append(r11)
            int r11 = r1.f142221d
            r10.append(r11)
            java.lang.String r11 = " price="
            r10.append(r11)
            int r11 = r1.f142222e
            r10.append(r11)
            java.lang.String r11 = " ticket="
            r10.append(r11)
            te3.ez r11 = er1.C7839m5.m7985a(r1)
            if (r11 == 0) goto L_0x00a7
            java.lang.String r11 = r11.f133182d
            goto L_0x00a8
        L_0x00a7:
            r11 = 0
        L_0x00a8:
            r10.append(r11)
            java.lang.String r11 = " title="
            r10.append(r11)
            te3.ez r11 = er1.C7839m5.m7985a(r1)
            if (r11 == 0) goto L_0x00b9
            java.lang.String r11 = r11.f133183e
            goto L_0x00ba
        L_0x00b9:
            r11 = 0
        L_0x00ba:
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r10)
            te3.ez r10 = er1.C7839m5.m7985a(r1)
            if (r10 == 0) goto L_0x02ac
            long r13 = r10.f133186h
            r16 = 0
            r11 = 0
            java.lang.String r18 = ""
            int r19 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r19 <= 0) goto L_0x00f6
            android.content.res.Resources r13 = r3.getResources()
            r14 = 2131824001(0x7f110d81, float:1.9280818E38)
            java.lang.Object[] r5 = new java.lang.Object[r8]
            er1.j4 r9 = er1.C58739j4.f168176a
            long r6 = r10.f133186h
            r20 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r20
            java.lang.String r6 = r9.mo83722r(r6)
            r5[r11] = r6
            java.lang.String r5 = r13.getString(r14, r5)
            java.lang.String r6 = "resources.getString(\n   …0L)\n                    )"
            gy3.C87412m.m108593f(r5, r6)
            goto L_0x00f8
        L_0x00f6:
            r5 = r18
        L_0x00f8:
            hs1.n r6 = new hs1.n
            android.content.Context r7 = r3.getContext()
            gy3.C87412m.m108593f(r7, r4)
            r6.<init>(r7)
            java.lang.String r7 = r10.f133184f
            if (r7 != 0) goto L_0x010a
            r7 = r18
        L_0x010a:
            java.lang.String r9 = r10.f133183e
            if (r9 != 0) goto L_0x0110
            r9 = r18
        L_0x0110:
            int r10 = r10.f133196u
            r12.f18333d = r3
            r12.f18334e = r1
            r13 = 2
            r12.f18337h = r13
            wx3.h r13 = new wx3.h
            wx3.d r14 = xx3.C66447b.m78392b(r12)
            r13.<init>(r14)
            gy3.f0 r14 = new gy3.f0
            r14.<init>()
            r14.f27484d = r13
            qo3.w r8 = new qo3.w
            android.content.Context r11 = r6.getContext()
            r8.<init>(r11)
            hs1.l r11 = new hs1.l
            r11.<init>(r14)
            r8.f36937s = r11
            hs1.m r11 = new hs1.m
            r11.<init>(r14)
            android.content.Context r14 = r6.getContext()
            android.view.LayoutInflater r14 = android.view.LayoutInflater.from(r14)
            r0 = 2131496938(0x7f0c0fea, float:1.8617455E38)
            r19 = r1
            r1 = 0
            android.view.View r0 = r14.inflate(r0, r6, r1)
            r6.f28030d = r0
            if (r0 == 0) goto L_0x0165
            r1 = 2131298987(0x7f090aab, float:1.8215963E38)
            android.view.View r0 = r0.findViewById(r1)
            if (r0 == 0) goto L_0x0165
            hs1.h r1 = new hs1.h
            r1.<init>(r6)
            r0.setOnClickListener(r1)
        L_0x0165:
            android.view.View r0 = r6.f28030d
            if (r0 == 0) goto L_0x017a
            r1 = 2131307919(0x7f092d8f, float:1.8234079E38)
            android.view.View r0 = r0.findViewById(r1)
            if (r0 == 0) goto L_0x017a
            hs1.i r1 = new hs1.i
            r1.<init>(r6)
            r0.setOnClickListener(r1)
        L_0x017a:
            android.view.View r0 = r6.f28030d
            if (r0 == 0) goto L_0x018f
            r1 = 2131298988(0x7f090aac, float:1.8215965E38)
            android.view.View r0 = r0.findViewById(r1)
            if (r0 == 0) goto L_0x018f
            hs1.j r1 = new hs1.j
            r1.<init>(r6, r11)
            r0.setOnClickListener(r1)
        L_0x018f:
            android.view.View r0 = r6.f28030d
            if (r0 == 0) goto L_0x01a5
            r1 = 2131306729(0x7f0928e9, float:1.8231665E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x01a5
            gc0.a r1 = gc0.C20828a.m22825b()
            r1.mo32518g(r7, r0)
        L_0x01a5:
            android.view.View r0 = r6.f28030d
            if (r0 == 0) goto L_0x01cd
            r1 = 2131302938(0x7f091a1a, float:1.8223976E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x01cd
            android.content.Context r1 = r0.getContext()
            r7 = 2131755978(0x7f1003ca, float:1.914285E38)
            android.content.Context r11 = r0.getContext()
            r14 = 2131099865(0x7f0600d9, float:1.7812095E38)
            int r11 = kg3.C76577a.m92153d(r11, r14)
            android.graphics.drawable.Drawable r1 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r1, r7, r11)
            r0.setImageDrawable(r1)
        L_0x01cd:
            android.view.View r0 = r6.f28030d
            if (r0 == 0) goto L_0x01db
            r1 = 2131315857(0x7f094c91, float:1.825018E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x01dc
        L_0x01db:
            r0 = 0
        L_0x01dc:
            if (r0 != 0) goto L_0x01df
            goto L_0x01e2
        L_0x01df:
            r0.setText(r9)
        L_0x01e2:
            android.view.View r0 = r6.f28030d
            if (r0 == 0) goto L_0x01f0
            r1 = 2131315705(0x7f094bf9, float:1.824987E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x01f1
        L_0x01f0:
            r0 = 0
        L_0x01f1:
            if (r0 != 0) goto L_0x01f4
            goto L_0x01f7
        L_0x01f4:
            r0.setText(r5)
        L_0x01f7:
            android.view.View r0 = r6.f28030d
            if (r0 == 0) goto L_0x0213
            r1 = 2131315807(0x7f094c5f, float:1.8250078E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0213
            er1.j4 r1 = er1.C58739j4.f168176a
            r5 = 1
            r1.mo83703c0(r0, r5)
            java.lang.String r1 = java.lang.String.valueOf(r10)
            r0.setText(r1)
        L_0x0213:
            java.lang.Class<m53.c> r0 = m53.C10756c.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            m53.c r0 = (m53.C10756c) r0
            hs1.k r1 = new hs1.k
            r1.<init>(r6)
            r0.mo11000qy(r1)
            android.view.View r0 = r6.f28030d
            r8.mo12471k(r0)
            r8.mo5086o()
            r6.f28031e = r8
            java.lang.Object r1 = r13.mo90314b()
            if (r1 != r2) goto L_0x0234
            return r2
        L_0x0234:
            r6 = r3
            r3 = r19
        L_0x0237:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L_0x0247
            java.lang.String r0 = "#executeConcertPay paySecondCheckResult uncheck"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x0247:
            r12.f18333d = r6
            r12.f18334e = r3
            r0 = 3
            r12.f18337h = r0
            java.lang.Object r1 = r6.mo5021g(r12)
            if (r1 != r2) goto L_0x004d
            return r2
        L_0x0255:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L_0x0265
            java.lang.String r0 = "#executeConcertPay licenseResult uncheck"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x0265:
            java.lang.Class<ht1.t1> r0 = ht1.C60200t1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r1 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            r3 = r0
            ht1.t1 r3 = (ht1.C60200t1) r3
            android.content.Context r0 = r6.getContext()
            gy3.C87412m.m108593f(r0, r4)
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r13 = 60
            r14 = 0
            r1 = 0
            r12.f18333d = r1
            r12.f18334e = r1
            r1 = 4
            r12.f18337h = r1
            r4 = r0
            java.lang.Object r1 = ht1.C60200t1.C60201a.m70365c(r3, r4, r5, r6, r8, r10, r11, r12, r13, r14)
            if (r1 != r2) goto L_0x0293
            return r2
        L_0x0293:
            rx3.o r1 = (rx3.C13605o) r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "#executeConcertPay finally result = "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            A r0 = r1.f38557d
            return r0
        L_0x02ac:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView.mo5018c(te3.d51, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0276  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5019d(te3.C49098d51 r17, wx3.C15601d<? super java.lang.Boolean> r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r2 instanceof com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView.C4130d
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$d r3 = (com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView.C4130d) r3
            int r4 = r3.f18342h
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f18342h = r4
            goto L_0x001e
        L_0x0019:
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$d r3 = new com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$d
            r3.<init>(r0, r2)
        L_0x001e:
            r13 = r3
            java.lang.Object r2 = r13.f18340f
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r13.f18342h
            java.lang.String r5 = "context"
            r6 = 4
            r7 = 3
            r8 = 2
            java.lang.String r15 = "NoticeStatusView"
            r10 = 1
            if (r4 == 0) goto L_0x006c
            if (r4 == r10) goto L_0x0060
            if (r4 == r8) goto L_0x0053
            if (r4 == r7) goto L_0x0045
            if (r4 != r6) goto L_0x003d
            kotlin.ResultKt.throwOnFailure(r2)
            r0 = r15
            goto L_0x02a6
        L_0x003d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0045:
            java.lang.Object r1 = r13.f18339e
            te3.th3 r1 = (te3.C51398th3) r1
            java.lang.Object r4 = r13.f18338d
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView r4 = (com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView) r4
            kotlin.ResultKt.throwOnFailure(r2)
        L_0x0050:
            r6 = r1
            goto L_0x0266
        L_0x0053:
            java.lang.Object r1 = r13.f18339e
            te3.th3 r1 = (te3.C51398th3) r1
            java.lang.Object r4 = r13.f18338d
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView r4 = (com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView) r4
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0248
        L_0x0060:
            java.lang.Object r1 = r13.f18339e
            te3.d51 r1 = (te3.C49098d51) r1
            java.lang.Object r4 = r13.f18338d
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView r4 = (com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView) r4
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x007d
        L_0x006c:
            kotlin.ResultKt.throwOnFailure(r2)
            r13.f18338d = r0
            r13.f18339e = r1
            r13.f18342h = r10
            java.lang.Object r2 = r0.mo5020e(r1, r13)
            if (r2 != r3) goto L_0x007c
            return r3
        L_0x007c:
            r4 = r0
        L_0x007d:
            te3.th3 r2 = (te3.C51398th3) r2
            if (r2 == 0) goto L_0x02bf
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "#executeNormalPay id="
            r11.append(r12)
            int r12 = r2.f142221d
            r11.append(r12)
            java.lang.String r12 = " price="
            r11.append(r12)
            int r14 = r2.f142222e
            r11.append(r14)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r11)
            hs1.u r11 = new hs1.u
            android.content.Context r14 = r4.getContext()
            gy3.C87412m.m108593f(r14, r5)
            r11.<init>(r14)
            java.lang.String r1 = r1.f132121g
            java.lang.String r14 = ""
            if (r1 != 0) goto L_0x00b4
            r1 = r14
        L_0x00b4:
            int r6 = r2.f142222e
            java.util.LinkedList<java.lang.String> r9 = r2.f142224g
            java.lang.String r7 = "product.rights_wording"
            gy3.C87412m.m108593f(r9, r7)
            java.lang.Object r7 = sx3.C110818d0.m150916N(r9)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x00c6
            goto L_0x00c7
        L_0x00c6:
            r14 = r7
        L_0x00c7:
            java.lang.String r7 = r2.f142229o
            r13.f18338d = r4
            r13.f18339e = r2
            r13.f18342h = r8
            wx3.h r8 = new wx3.h
            wx3.d r9 = xx3.C66447b.m78392b(r13)
            r8.<init>(r9)
            gy3.f0 r9 = new gy3.f0
            r9.<init>()
            r9.f27484d = r8
            qo3.w r10 = new qo3.w
            android.content.Context r0 = r11.getContext()
            r10.<init>(r0)
            hs1.s r0 = new hs1.s
            r0.<init>(r9)
            r10.f36937s = r0
            hs1.t r0 = new hs1.t
            r0.<init>(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r17 = r2
            java.lang.String r2 = "#initView title="
            r9.append(r2)
            r9.append(r1)
            r9.append(r12)
            r9.append(r6)
            java.lang.String r2 = " rightsWording="
            r9.append(r2)
            r9.append(r14)
            java.lang.String r2 = " buttonWord="
            r9.append(r2)
            r9.append(r7)
            java.lang.String r2 = r9.toString()
            java.lang.String r9 = "FinderLivePayLiveSecondCheckWidget"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            android.content.Context r2 = r11.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r9 = 2131496939(0x7f0c0feb, float:1.8617457E38)
            r12 = 0
            android.view.View r2 = r2.inflate(r9, r11, r12)
            r11.f28039d = r2
            if (r2 == 0) goto L_0x0147
            r9 = 2131298987(0x7f090aab, float:1.8215963E38)
            android.view.View r2 = r2.findViewById(r9)
            if (r2 == 0) goto L_0x0147
            hs1.o r9 = new hs1.o
            r9.<init>(r11)
            r2.setOnClickListener(r9)
        L_0x0147:
            android.view.View r2 = r11.f28039d
            if (r2 == 0) goto L_0x015c
            r9 = 2131307919(0x7f092d8f, float:1.8234079E38)
            android.view.View r2 = r2.findViewById(r9)
            if (r2 == 0) goto L_0x015c
            hs1.p r9 = new hs1.p
            r9.<init>(r11)
            r2.setOnClickListener(r9)
        L_0x015c:
            android.view.View r2 = r11.f28039d
            if (r2 == 0) goto L_0x0187
            r9 = 2131298988(0x7f090aac, float:1.8215965E38)
            android.view.View r2 = r2.findViewById(r9)
            android.widget.Button r2 = (android.widget.Button) r2
            if (r2 == 0) goto L_0x0187
            if (r7 == 0) goto L_0x0176
            int r9 = r7.length()
            if (r9 != 0) goto L_0x0174
            goto L_0x0176
        L_0x0174:
            r9 = 0
            goto L_0x0177
        L_0x0176:
            r9 = 1
        L_0x0177:
            if (r9 != 0) goto L_0x017c
            r2.setText(r7)
        L_0x017c:
            hs1.q r7 = new hs1.q
            r7.<init>(r11, r0)
            r2.setOnClickListener(r7)
            er1.C7919x.m8091a(r2)
        L_0x0187:
            android.view.View r0 = r11.f28039d
            if (r0 == 0) goto L_0x0195
            r2 = 2131315857(0x7f094c91, float:1.825018E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x0196
        L_0x0195:
            r0 = 0
        L_0x0196:
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x019e
            r2 = 1
            goto L_0x019f
        L_0x019e:
            r2 = 0
        L_0x019f:
            if (r2 == 0) goto L_0x01ae
            if (r0 != 0) goto L_0x01a4
            goto L_0x01a7
        L_0x01a4:
            r0.setText(r1)
        L_0x01a7:
            if (r0 != 0) goto L_0x01aa
            goto L_0x01b6
        L_0x01aa:
            r0.setVisibility(r12)
            goto L_0x01b6
        L_0x01ae:
            if (r0 != 0) goto L_0x01b1
            goto L_0x01b6
        L_0x01b1:
            r1 = 8
            r0.setVisibility(r1)
        L_0x01b6:
            android.view.View r0 = r11.f28039d
            if (r0 == 0) goto L_0x01d2
            r1 = 2131315807(0x7f094c5f, float:1.8250078E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x01d2
            er1.j4 r1 = er1.C58739j4.f168176a
            r2 = 1
            r1.mo83703c0(r0, r2)
            java.lang.String r1 = java.lang.String.valueOf(r6)
            r0.setText(r1)
        L_0x01d2:
            android.view.View r0 = r11.f28039d
            if (r0 == 0) goto L_0x020b
            r1 = 2131315808(0x7f094c60, float:1.825008E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x020b
            android.content.Context r1 = r11.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.text.DecimalFormat r9 = new java.text.DecimalFormat
            java.lang.String r2 = "#.#"
            r9.<init>(r2)
            float r2 = (float) r6
            r6 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r6
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.String r2 = r9.format(r2)
            r7[r12] = r2
            r2 = 2131827192(0x7f1119f8, float:1.928729E38)
            java.lang.String r1 = r1.getString(r2, r7)
            r0.setText(r1)
        L_0x020b:
            android.view.View r0 = r11.f28039d
            if (r0 == 0) goto L_0x0219
            r1 = 2131315822(0x7f094c6e, float:1.8250108E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x021a
        L_0x0219:
            r0 = 0
        L_0x021a:
            if (r0 != 0) goto L_0x021d
            goto L_0x0220
        L_0x021d:
            r0.setText(r14)
        L_0x0220:
            java.lang.Class<m53.c> r0 = m53.C10756c.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            m53.c r0 = (m53.C10756c) r0
            hs1.r r1 = new hs1.r
            r1.<init>(r11)
            r0.mo11000qy(r1)
            android.view.View r0 = r11.f28039d
            r10.mo12471k(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r10.mo12472l(r0)
            r10.mo5086o()
            r11.f28040e = r10
            java.lang.Object r2 = r8.mo90314b()
            if (r2 != r3) goto L_0x0246
            return r3
        L_0x0246:
            r1 = r17
        L_0x0248:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            if (r0 != 0) goto L_0x0258
            java.lang.String r0 = "#executeNormalPay paySecondCheckResult uncheck"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x0258:
            r13.f18338d = r4
            r13.f18339e = r1
            r0 = 3
            r13.f18342h = r0
            java.lang.Object r2 = r4.mo5021g(r13)
            if (r2 != r3) goto L_0x0050
            return r3
        L_0x0266:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            if (r0 != 0) goto L_0x0276
            java.lang.String r0 = "#executeNormalPay licenseResult uncheck"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x0276:
            java.lang.Class<ht1.t1> r0 = ht1.C60200t1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r1 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            ht1.t1 r0 = (ht1.C60200t1) r0
            android.content.Context r1 = r4.getContext()
            gy3.C87412m.m108593f(r1, r5)
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 60
            r2 = 0
            r4 = 0
            r13.f18338d = r4
            r13.f18339e = r4
            r4 = 4
            r13.f18342h = r4
            r4 = r0
            r5 = r1
            r0 = r15
            r15 = r2
            java.lang.Object r2 = ht1.C60200t1.C60201a.m70365c(r4, r5, r6, r7, r9, r11, r12, r13, r14, r15)
            if (r2 != r3) goto L_0x02a6
            return r3
        L_0x02a6:
            rx3.o r2 = (rx3.C13605o) r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "#executeNormalPay finally result = "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            A r0 = r2.f38557d
            return r0
        L_0x02bf:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView.mo5019d(te3.d51, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5020e(te3.C49098d51 r6, wx3.C15601d<? super te3.C51398th3> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView.C4131e
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$e r0 = (com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView.C4131e) r0
            int r1 = r0.f18347h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f18347h = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$e r0 = new com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$e
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f18345f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f18347h
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.f18344e
            te3.d51 r6 = (te3.C49098d51) r6
            java.lang.Object r0 = r0.f18343d
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView r0 = (com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0061
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Class<ht1.t1> r7 = ht1.C60200t1.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ht1.t1 r7 = (ht1.C60200t1) r7
            android.content.Context r2 = r5.getContext()
            java.lang.String r4 = "context"
            gy3.C87412m.m108593f(r2, r4)
            te3.nc3 r4 = r6.f132128q
            if (r4 == 0) goto L_0x0052
            pe3.b r4 = r4.f138536h
            goto L_0x0053
        L_0x0052:
            r4 = 0
        L_0x0053:
            r0.f18343d = r5
            r0.f18344e = r6
            r0.f18347h = r3
            java.lang.Object r7 = r7.mo76881tZ(r2, r4, r3, r0)
            if (r7 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r0 = r5
        L_0x0061:
            te3.th3 r7 = (te3.C51398th3) r7
            if (r7 != 0) goto L_0x00a2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "#getProduct product is null noticeId="
            r1.append(r2)
            java.lang.String r2 = r6.f132122h
            r1.append(r2)
            java.lang.String r2 = " introduction="
            r1.append(r2)
            java.lang.String r6 = r6.f132121g
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.String r1 = "NoticeStatusView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
            android.content.Context r6 = r0.getContext()
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131827140(0x7f1119c4, float:1.9287184E38)
            java.lang.String r0 = r0.getString(r1)
            r1 = 0
            android.widget.Toast r6 = nj3.C76912y0.makeText((android.content.Context) r6, (java.lang.CharSequence) r0, (int) r1)
            r6.show()
        L_0x00a2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView.mo5020e(te3.d51, wx3.d):java.lang.Object");
    }

    /* renamed from: f */
    public void mo5009f(String str, C32224a<? extends C49098d51> aVar) {
        C32224a<? extends C49098d51> aVar2 = aVar;
        C87412m.m108594g(aVar2, "getNoticeInfo");
        this.f18314f = str == null ? "" : str;
        this.f18313e = aVar2;
        boolean z = true;
        boolean z2 = ((C49098d51) aVar.invoke()).f132127p == 1;
        boolean z3 = ((C49098d51) aVar.invoke()).f132119e == 0;
        C50523nc3 nc32 = ((C49098d51) aVar.invoke()).f132128q;
        if (nc32 == null || !nc32.f138532d) {
            z = false;
        }
        C50523nc3 nc33 = ((C49098d51) aVar.invoke()).f132128q;
        int i = nc33 != null ? nc33.f138533e : 0;
        C50523nc3 nc34 = ((C49098d51) aVar.invoke()).f132128q;
        boolean z4 = nc34 != null ? nc34.f138534f : false;
        this.f18316h.setBackground(getResources().getDrawable(getBgRes()));
        this.f18319n.setIconColor(getResources().getColor(getNormalTextColorRes()));
        this.f18320o.setTextColor(getResources().getColor(getNormalTextColorRes()));
        if (!z || i == 0) {
            if (z3) {
                if (z2) {
                    this.f18317i.setVisibility(8);
                    this.f18318j.setVisibility(8);
                    this.f18319n.setVisibility(8);
                    this.f18320o.setVisibility(0);
                    this.f18321p.setVisibility(8);
                    View view = this.f18322q;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/notice/NoticeStatusView", ChildProcessServiceWrapper.PROCESS_TYPE_RENDER, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/notice/NoticeStatusView", ChildProcessServiceWrapper.PROCESS_TYPE_RENDER, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f18320o.setText(getResources().getString(C0966R.string.mqk));
                } else {
                    this.f18317i.setVisibility(8);
                    this.f18318j.setVisibility(8);
                    this.f18319n.setVisibility(0);
                    this.f18320o.setVisibility(0);
                    this.f18321p.setVisibility(8);
                    View view3 = this.f18322q;
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar4.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/view/notice/NoticeStatusView", ChildProcessServiceWrapper.PROCESS_TYPE_RENDER, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/view/notice/NoticeStatusView", ChildProcessServiceWrapper.PROCESS_TYPE_RENDER, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f18320o.setText(getResources().getString(C0966R.string.d5t));
                }
            } else if (z2) {
                this.f18317i.setVisibility(8);
                this.f18318j.setVisibility(8);
                this.f18319n.setVisibility(8);
                this.f18320o.setVisibility(0);
                this.f18321p.setVisibility(8);
                View view5 = this.f18322q;
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar5.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/view/notice/NoticeStatusView", ChildProcessServiceWrapper.PROCESS_TYPE_RENDER, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/view/notice/NoticeStatusView", ChildProcessServiceWrapper.PROCESS_TYPE_RENDER, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f18320o.setText(getResources().getString(C0966R.string.f360581fp2));
            } else {
                this.f18317i.setVisibility(8);
                this.f18318j.setVisibility(8);
                this.f18319n.setVisibility(8);
                this.f18320o.setVisibility(0);
                this.f18321p.setVisibility(8);
                View view7 = this.f18322q;
                C9556a aVar6 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar6.mo10233c(8);
                View view8 = view7;
                C117292a.m165358d(view8, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/view/notice/NoticeStatusView", ChildProcessServiceWrapper.PROCESS_TYPE_RENDER, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/view/notice/NoticeStatusView", ChildProcessServiceWrapper.PROCESS_TYPE_RENDER, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f18320o.setText(getResources().getString(C0966R.string.luf));
            }
        } else if (z4) {
            if (z2) {
                this.f18317i.setVisibility(8);
                this.f18318j.setVisibility(8);
                this.f18319n.setVisibility(8);
                this.f18320o.setVisibility(0);
                this.f18321p.setVisibility(8);
                View view9 = this.f18322q;
                C9556a aVar7 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar7.mo10233c(8);
                View view10 = view9;
                C117292a.m165358d(view10, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/view/notice/NoticeStatusView", ChildProcessServiceWrapper.PROCESS_TYPE_RENDER, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/view/notice/NoticeStatusView", ChildProcessServiceWrapper.PROCESS_TYPE_RENDER, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f18320o.setText(getResources().getString(C0966R.string.mqk));
            } else {
                this.f18317i.setVisibility(8);
                this.f18318j.setVisibility(8);
                this.f18319n.setVisibility(0);
                this.f18320o.setVisibility(0);
                this.f18321p.setVisibility(8);
                View view11 = this.f18322q;
                C9556a aVar8 = new C9556a();
                ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                aVar8.mo10233c(8);
                View view12 = view11;
                C117292a.m165358d(view12, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/view/notice/NoticeStatusView", ChildProcessServiceWrapper.PROCESS_TYPE_RENDER, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/view/notice/NoticeStatusView", ChildProcessServiceWrapper.PROCESS_TYPE_RENDER, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f18320o.setText(getResources().getString(C0966R.string.mqj));
                this.f18316h.setBackground(getResources().getDrawable(C0966R.C0969drawable.f357174ck0));
                this.f18319n.setIconColor(getResources().getColor(getGreyTextColorRes()));
                this.f18320o.setTextColor(getResources().getColor(getGreyTextColorRes()));
            }
        } else if (z2) {
            this.f18317i.setVisibility(0);
            this.f18318j.setVisibility(0);
            this.f18319n.setVisibility(8);
            this.f18320o.setVisibility(8);
            this.f18321p.setVisibility(0);
            View view13 = this.f18322q;
            C9556a aVar9 = new C9556a();
            ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
            aVar9.mo10233c(0);
            View view14 = view13;
            C117292a.m165358d(view14, aVar9.mo10232b(), "com/tencent/mm/plugin/finder/view/notice/NoticeStatusView", ChildProcessServiceWrapper.PROCESS_TYPE_RENDER, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
            C117292a.m165359e(view14, "com/tencent/mm/plugin/finder/view/notice/NoticeStatusView", ChildProcessServiceWrapper.PROCESS_TYPE_RENDER, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f18318j.setText(String.valueOf(i));
            this.f18321p.setText(getResources().getString(C0966R.string.f360760mt2));
        } else {
            this.f18317i.setVisibility(0);
            this.f18318j.setVisibility(0);
            this.f18319n.setVisibility(8);
            this.f18320o.setVisibility(8);
            this.f18321p.setVisibility(0);
            View view15 = this.f18322q;
            C9556a aVar10 = new C9556a();
            ThreadLocal<C9556a> threadLocal8 = C60958c.f173611a;
            aVar10.mo10233c(0);
            View view16 = view15;
            C117292a.m165358d(view16, aVar10.mo10232b(), "com/tencent/mm/plugin/finder/view/notice/NoticeStatusView", ChildProcessServiceWrapper.PROCESS_TYPE_RENDER, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view15.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
            C117292a.m165359e(view16, "com/tencent/mm/plugin/finder/view/notice/NoticeStatusView", ChildProcessServiceWrapper.PROCESS_TYPE_RENDER, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f18318j.setText(String.valueOf(i));
            this.f18321p.setText(getPayText());
        }
        setOnClickListener(new C4132f(this, aVar2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5021g(wx3.C15601d<? super java.lang.Boolean> r25) {
        /*
            r24 = this;
            r0 = r25
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_PRE_SALE_VISITOR_LICENSE_BOOLEAN_SYNC
            boolean r2 = r0 instanceof com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView.C4134g
            if (r2 == 0) goto L_0x0019
            r2 = r0
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$g r2 = (com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView.C4134g) r2
            int r3 = r2.f18355f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0019
            int r3 = r3 - r4
            r2.f18355f = r3
            r3 = r24
            goto L_0x0020
        L_0x0019:
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$g r2 = new com.tencent.mm.plugin.finder.view.notice.NoticeStatusView$g
            r3 = r24
            r2.<init>(r3, r0)
        L_0x0020:
            java.lang.Object r0 = r2.f18353d
            xx3.a r4 = xx3.C15911a.COROUTINE_SUSPENDED
            int r5 = r2.f18355f
            r6 = 1
            if (r5 == 0) goto L_0x0038
            if (r5 != r6) goto L_0x0030
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x0112
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r0)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.mo119685f(r1, r5)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Boolean"
            gy3.C87412m.m108592e(r0, r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0059
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x0059:
            fs1.a r0 = new fs1.a
            android.content.Context r5 = r24.getContext()
            java.lang.String r7 = "context"
            gy3.C87412m.m108593f(r5, r7)
            r0.<init>(r5)
            fs1.a$a r5 = new fs1.a$a
            android.content.Context r7 = r24.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131828979(0x7f1120f3, float:1.9290914E38)
            java.lang.String r7 = r7.getString(r8)
            java.lang.String r8 = "context.resources.getStr…re_sale_license_content1)"
            gy3.C87412m.m108593f(r7, r8)
            android.content.Context r8 = r24.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131828980(0x7f1120f4, float:1.9290916E38)
            java.lang.String r8 = r8.getString(r9)
            java.lang.String r9 = "context.resources.getStr…_sale_license_content1_1)"
            gy3.C87412m.m108593f(r8, r9)
            java.lang.String r9 = "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/JsWXJcUX5dlJhfUW"
            r5.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            fs1.a$a r14 = new fs1.a$a
            android.content.Context r8 = r24.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131828981(0x7f1120f5, float:1.9290918E38)
            java.lang.String r9 = r8.getString(r9)
            java.lang.String r8 = "context.resources.getStr…sale_license_desc1_tips1)"
            gy3.C87412m.m108593f(r9, r8)
            r10 = 0
            r17 = 0
            r12 = 6
            r13 = 0
            r11 = 0
            r8 = r14
            r8.<init>(r9, r10, r11, r12, r13)
            r7.add(r14)
            fs1.a$a r8 = new fs1.a$a
            android.content.Context r9 = r24.getContext()
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131828982(0x7f1120f6, float:1.929092E38)
            java.lang.String r9 = r9.getString(r10)
            java.lang.String r10 = "context.resources.getStr…sale_license_desc1_tips2)"
            gy3.C87412m.m108593f(r9, r10)
            r20 = 0
            r21 = 0
            r22 = 6
            r23 = 0
            r18 = r8
            r19 = r9
            r18.<init>(r19, r20, r21, r22, r23)
            r7.add(r8)
            fs1.a$a r8 = new fs1.a$a
            android.content.Context r9 = r24.getContext()
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131828983(0x7f1120f7, float:1.9290922E38)
            java.lang.String r9 = r9.getString(r10)
            java.lang.String r10 = "context.resources.getStr…sale_license_desc1_tips3)"
            gy3.C87412m.m108593f(r9, r10)
            r18 = 0
            r19 = 6
            r15 = r8
            r16 = r9
            r15.<init>(r16, r17, r18, r19, r20)
            r7.add(r8)
            r2.f18355f = r6
            java.lang.Object r0 = r0.mo9241b(r5, r7, r2)
            if (r0 != r4) goto L_0x0112
            return r4
        L_0x0112:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            r2.mo119677K(r1, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView.mo5021g(wx3.d):java.lang.Object");
    }

    public int getBgRes() {
        return C0966R.C0969drawable.cjx;
    }

    public final View getBgView() {
        return this.f18316h;
    }

    public int getGreyTextColorRes() {
        return C0966R.color.FG_2;
    }

    public final WeImageView getIvTicket() {
        return this.f18319n;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.czt;
    }

    public int getNormalTextColorRes() {
        return C0966R.color.ani;
    }

    public final C32224a<C49098d51> getNoticeFuncRef() {
        return this.f18313e;
    }

    public String getPayText() {
        String string = getResources().getString(C0966R.string.f360761mt3);
        C87412m.m108593f(string, "resources.getString(R.st…ialog_subscribe_to_watch)");
        return string;
    }

    public final C32227p<Integer, Integer, C13598b0> getProgressDoneAndNextAction() {
        return this.f18324s;
    }

    public final TextView getTvBigText() {
        return this.f18320o;
    }

    public final TextView getTvPrice() {
        return this.f18318j;
    }

    public final String getUsername() {
        return this.f18314f;
    }

    public final void setProgressDoneAndNextAction(C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
        this.f18324s = pVar;
    }
}
