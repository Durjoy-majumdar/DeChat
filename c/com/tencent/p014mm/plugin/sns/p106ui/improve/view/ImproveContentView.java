package com.tencent.p014mm.plugin.sns.p106ui.improve.view;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f14.C58901s;
import fy3.C32227p;
import gu2.C98214b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import kotlin.Metadata;
import kotlin.ResultKt;
import ku2.C99245d;
import p629ny.C76979h;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zr2.C66976a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001aB\u001d\b\u0016\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B%\b\u0016\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0019J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\t\u001a\u0004\u0018\u00010\bR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@BX.¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView;", "Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveTranslateLayout;", "Landroid/view/View;", "getContentView", "Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView$a;", "listener", "Lrx3/b0;", "setStateChangeListener", "", "getContent", "Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveTextView;", "<set-?>", "q", "Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveTextView;", "getContentTv", "()Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveTextView;", "contentTv", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView */
public final class ImproveContentView extends ImproveTranslateLayout {

    /* renamed from: z */
    public static final /* synthetic */ int f279844z = 0;

    /* renamed from: j */
    public final String f279845j = ("MicroMsg.Improve.ContentView[" + hashCode() + ']');

    /* renamed from: n */
    public final String f279846n;

    /* renamed from: o */
    public final String f279847o;

    /* renamed from: p */
    public ImproveTextView f279848p;

    /* renamed from: q */
    public ImproveTextView f279849q;

    /* renamed from: r */
    public ImproveTextView f279850r;

    /* renamed from: s */
    public C95882a f279851s;

    /* renamed from: t */
    public C98214b f279852t;

    /* renamed from: u */
    public CharSequence f279853u;

    /* renamed from: v */
    public int f279854v;

    /* renamed from: w */
    public int f279855w;

    /* renamed from: x */
    public int f279856x;

    /* renamed from: y */
    public final Runnable f279857y;

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$a */
    public interface C95882a {
        /* renamed from: a */
        void mo133360a(View view, int i, Runnable runnable);
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$b */
    public static final class C95883b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ImproveContentView f279858d;

        public C95883b(ImproveContentView improveContentView) {
            this.f279858d = improveContentView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView$inflateXml$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$inflateXml$1");
            ImproveContentView.m122754k(this.f279858d);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$inflateXml$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView$inflateXml$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$c */
    public static final class C95884c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ImproveContentView f279859d;

        public C95884c(ImproveContentView improveContentView) {
            this.f279859d = improveContentView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0047, code lost:
            r8 = r8.mo137509G2();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r19) {
            /*
                r18 = this;
                r6 = r18
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r19
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView$inflateXml$2"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r18
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                java.lang.String r0 = "onClick"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$inflateXml$2"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView r2 = r6.f279859d
                int r3 = com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveContentView.f279844z
                java.lang.String r3 = "access$singleContentJumpUI"
                java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                r2.getClass()
                java.lang.String r5 = "singleContentJumpUI"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r4)
                android.content.Intent r7 = new android.content.Intent
                r7.<init>()
                gu2.b r8 = r2.f279852t
                r9 = 0
                if (r8 == 0) goto L_0x0050
                com.tencent.mm.protocal.protobuf.TimeLineObject r8 = r8.mo137509G2()
                if (r8 == 0) goto L_0x0050
                java.lang.String r8 = r8.ContentDesc
                goto L_0x0051
            L_0x0050:
                r8 = r9
            L_0x0051:
                java.lang.String r10 = "sns_text_show"
                r7.putExtra(r10, r8)
                gu2.b r8 = r2.f279852t
                if (r8 == 0) goto L_0x005f
                java.lang.String r9 = r8.mo137503A2()
            L_0x005f:
                java.lang.String r8 = "sns_local_id"
                r7.putExtra(r8, r9)
                r8 = 1
                java.lang.String r9 = "sns_content_source"
                r7.putExtra(r9, r8)
                android.content.Context r8 = r2.getContext()
                java.lang.Class<com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI> r9 = com.tencent.p014mm.plugin.sns.p106ui.SnsSingleTextViewUI.class
                r7.setClass(r8, r9)
                android.content.Context r2 = r2.getContext()
                k20.a r8 = new k20.a
                r8.<init>()
                r8.mo10233c(r7)
                java.lang.Object[] r11 = r8.mo10232b()
                java.lang.String r12 = "com/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView"
                java.lang.String r13 = "singleContentJumpUI"
                java.lang.String r14 = "()V"
                java.lang.String r15 = "Undefined"
                java.lang.String r16 = "startActivity"
                java.lang.String r17 = "(Landroid/content/Intent;)V"
                r10 = r2
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                r7 = 0
                java.lang.Object r7 = r8.mo10231a(r7)
                android.content.Intent r7 = (android.content.Intent) r7
                r2.startActivity(r7)
                java.lang.String r11 = "com/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView"
                java.lang.String r12 = "singleContentJumpUI"
                java.lang.String r13 = "()V"
                java.lang.String r14 = "Undefined"
                java.lang.String r15 = "startActivity"
                java.lang.String r16 = "(Landroid/content/Intent;)V"
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                java.lang.String r1 = "com/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView$inflateXml$2"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r6, r1, r2, r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveContentView.C95884c.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$d */
    public static final class C95885d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ImproveContentView f279860d;

        public C95885d(ImproveContentView improveContentView) {
            this.f279860d = improveContentView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView$inflateXml$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$inflateXml$3");
            ImproveContentView.m122754k(this.f279860d);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$inflateXml$3");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView$inflateXml$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$loadContent$1", mo125469f = "ImproveContentView.kt", mo125470l = {222, 224}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$e */
    public static final class C95886e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f279861d;

        /* renamed from: e */
        public final /* synthetic */ ImproveContentView f279862e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95886e(ImproveContentView improveContentView, C15601d<? super C95886e> dVar) {
            super(2, dVar);
            this.f279862e = improveContentView;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$loadContent$1");
            C95886e eVar = new C95886e(this.f279862e, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$loadContent$1");
            return eVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$loadContent$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$loadContent$1");
            Object invokeSuspend = ((C95886e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$loadContent$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$loadContent$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            CharSequence charSequence;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$loadContent$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f279861d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ImproveContentView improveContentView = this.f279862e;
                int i2 = ImproveContentView.f279844z;
                SnsMethodCalculate.markStartTimeMs("access$getTextType$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
                int i3 = improveContentView.f279854v;
                SnsMethodCalculate.markEndTimeMs("access$getTextType$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
                if (i3 == 0) {
                    ImproveContentView improveContentView2 = this.f279862e;
                    SnsMethodCalculate.markStartTimeMs("access$isNowInSpreadMode", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
                    improveContentView2.getClass();
                    SnsMethodCalculate.markStartTimeMs("isNowInSpreadMode", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
                    ImproveTextView improveTextView = improveContentView2.f279850r;
                    if (improveTextView != null) {
                        boolean b = C87412m.m108589b(improveTextView.getTag(), 1);
                        SnsMethodCalculate.markEndTimeMs("isNowInSpreadMode", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
                        SnsMethodCalculate.markEndTimeMs("access$isNowInSpreadMode", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
                        this.f279861d = 1;
                        if (ImproveContentView.m122755l(improveContentView2, !b, this) == aVar) {
                            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$loadContent$1");
                            return aVar;
                        }
                    } else {
                        C87412m.m108603p("opTv");
                        throw null;
                    }
                } else {
                    ImproveContentView improveContentView3 = this.f279862e;
                    this.f279861d = 2;
                    SnsMethodCalculate.markStartTimeMs("access$showSingleLine", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
                    improveContentView3.getClass();
                    SnsMethodCalculate.markStartTimeMs("showSingleLine", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
                    CharSequence charSequence2 = improveContentView3.f279853u;
                    C87412m.m108591d(charSequence2);
                    if (charSequence2.length() > 100) {
                        StringBuilder sb = new StringBuilder();
                        CharSequence charSequence3 = improveContentView3.f279853u;
                        C87412m.m108591d(charSequence3);
                        sb.append(charSequence3.subSequence(0, 100).toString());
                        sb.append("...");
                        charSequence = sb.toString();
                    } else {
                        charSequence = improveContentView3.f279853u;
                    }
                    improveContentView3.f279853u = charSequence;
                    SpannableString op02 = ((C76979h) C86312j.m106911c(C76979h.class)).op0(improveContentView3.getContext(), improveContentView3.f279853u, (int) improveContentView3.getContentTv().getTextSize());
                    C98214b bVar = improveContentView3.f279852t;
                    long p2 = bVar != null ? bVar.mo142401p2() : 0;
                    C87412m.m108593f(op02, "spanDesc");
                    improveContentView3.f279853u = C66976a.m79134f(p2, op02, 0, 2);
                    C53896h0 h0Var = C53872d1.f151117a;
                    Object g = C53895h.m60469g(C58901s.f168555a, new C99245d(improveContentView3, (C15601d<? super C99245d>) null), this);
                    if (g == aVar) {
                        SnsMethodCalculate.markEndTimeMs("showSingleLine", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
                    } else {
                        g = C13598b0.f38549a;
                        SnsMethodCalculate.markEndTimeMs("showSingleLine", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
                    }
                    SnsMethodCalculate.markEndTimeMs("access$showSingleLine", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
                    if (g == aVar) {
                        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$loadContent$1");
                        return aVar;
                    }
                }
            } else if (i == 1 || i == 2) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$loadContent$1");
                throw illegalStateException;
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$loadContent$1");
            return b0Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$f */
    public static final class C95887f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ImproveContentView f279863d;

        public C95887f(ImproveContentView improveContentView) {
            this.f279863d = improveContentView;
        }

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$shrinkActionTask$1");
            ImproveContentView improveContentView = this.f279863d;
            int i = ImproveContentView.f279844z;
            SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
            String str = improveContentView.f279845j;
            SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
            Log.m105918d(str, "shrinkActionTask: start");
            ImproveContentView improveContentView2 = this.f279863d;
            SnsMethodCalculate.markStartTimeMs("access$shrinkContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
            improveContentView2.mo133357o();
            SnsMethodCalculate.markEndTimeMs("access$shrinkContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$shrinkActionTask$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$g */
    public static final class C95888g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ImproveContentView f279864d;

        public C95888g(ImproveContentView improveContentView) {
            this.f279864d = improveContentView;
        }

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$shrinkContent$1");
            ImproveContentView improveContentView = this.f279864d;
            int height = improveContentView.getContentTv().getHeight();
            SnsMethodCalculate.markStartTimeMs("access$setContentShrinkHeight$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
            improveContentView.f279856x = height;
            SnsMethodCalculate.markEndTimeMs("access$setContentShrinkHeight$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$shrinkContent$1");
        }
    }

    public ImproveContentView(Context context) {
        super(context);
        String string = getContext().getString(C0966R.string.jbo);
        C87412m.m108593f(string, "context.getString(R.string.sns_desc_spread)");
        this.f279846n = string;
        String string2 = getContext().getString(C0966R.string.jbn);
        C87412m.m108593f(string2, "context.getString(R.string.sns_desc_shrinkup)");
        this.f279847o = string2;
        this.f279854v = -1;
        this.f279855w = -1;
        mo133355m();
        this.f279857y = new C95887f(this);
    }

    /* renamed from: k */
    public static final void m122754k(ImproveContentView improveContentView) {
        SnsMethodCalculate.markStartTimeMs("access$changeContentState", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        improveContentView.getClass();
        SnsMethodCalculate.markStartTimeMs("changeContentState", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        ImproveTextView improveTextView = improveContentView.f279850r;
        if (improveTextView != null) {
            if (C87412m.m108589b(improveTextView.getTag(), 2)) {
                SnsMethodCalculate.markStartTimeMs("spreadContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
                Log.m105918d(improveContentView.f279845j, "spreadContent: ");
                ImproveTextView improveTextView2 = improveContentView.f279850r;
                if (improveTextView2 != null) {
                    improveTextView2.setTag(1);
                    ImproveTextView improveTextView3 = improveContentView.f279850r;
                    if (improveTextView3 != null) {
                        improveTextView3.setText(improveContentView.f279847o);
                        improveContentView.getContentTv().setMaxLines(Integer.MAX_VALUE);
                        SnsMethodCalculate.markEndTimeMs("spreadContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
                    } else {
                        C87412m.m108603p("opTv");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("opTv");
                    throw null;
                }
            } else {
                C95882a aVar = improveContentView.f279851s;
                if (aVar == null) {
                    improveContentView.mo133357o();
                } else {
                    aVar.mo133360a(improveContentView.getContentTv(), improveContentView.f279856x, improveContentView.f279857y);
                }
            }
            String str = improveContentView.f279845j;
            StringBuilder sb = new StringBuilder();
            sb.append("changeContentState to ");
            ImproveTextView improveTextView4 = improveContentView.f279850r;
            if (improveTextView4 != null) {
                sb.append(improveTextView4.getTag());
                Log.m105918d(str, sb.toString());
                SnsMethodCalculate.markEndTimeMs("changeContentState", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
                SnsMethodCalculate.markEndTimeMs("access$changeContentState", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
                return;
            }
            C87412m.m108603p("opTv");
            throw null;
        }
        C87412m.m108603p("opTv");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0035  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m122755l(com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveContentView r21, boolean r22, wx3.C15601d r23) {
        /*
            r0 = r21
            r1 = r23
            java.lang.String r2 = "access$showNormal"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r21.getClass()
            java.lang.String r4 = "showNormal"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            boolean r5 = r1 instanceof ku2.C99242a
            if (r5 == 0) goto L_0x0027
            r5 = r1
            ku2.a r5 = (ku2.C99242a) r5
            int r6 = r5.f290982g
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x0027
            int r6 = r6 - r7
            r5.f290982g = r6
            goto L_0x002c
        L_0x0027:
            ku2.a r5 = new ku2.a
            r5.<init>(r0, r1)
        L_0x002c:
            java.lang.Object r1 = r5.f290980e
            xx3.a r6 = xx3.C15911a.COROUTINE_SUSPENDED
            int r7 = r5.f290982g
            r8 = 1
            if (r7 == 0) goto L_0x004d
            if (r7 != r8) goto L_0x0042
            java.lang.Object r0 = r5.f290979d
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView r0 = (com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveContentView) r0
            kotlin.ResultKt.throwOnFailure(r1)
            r13 = r2
            r9 = r3
            goto L_0x015a
        L_0x0042:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            throw r0
        L_0x004d:
            kotlin.ResultKt.throwOnFailure(r1)
            ju2.l r1 = ju2.C99053l.f290358a
            java.lang.CharSequence r7 = r0.f279853u
            gu2.b r9 = r0.f279852t
            java.lang.String r10 = "generateMainContentSpan"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r7)
            if (r12 != 0) goto L_0x012a
            if (r9 != 0) goto L_0x0067
            goto L_0x012a
        L_0x0067:
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            java.lang.String r14 = "key_wxa_short_link_launch_scene"
            java.lang.String r15 = "TIME_LINE"
            r12.putString(r14, r15)
            r14 = 3
            java.lang.String r15 = "ShareScene"
            r12.putInt(r15, r14)
            java.lang.String r14 = r9.mo137504B2()
            java.lang.String r15 = "serverMsgID"
            r12.putString(r15, r14)
            com.tencent.mm.plugin.sns.storage.SnsInfo r14 = r9.mo137505C2()
            java.lang.String r14 = r14.getUserName()
            java.lang.String r15 = "msgUsername"
            r12.putString(r15, r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            com.tencent.mm.plugin.sns.storage.SnsInfo r15 = r9.mo137505C2()
            java.lang.String r15 = r15.getUserName()
            r14.append(r15)
            r15 = 35
            r14.append(r15)
            java.lang.String r15 = r9.mo137504B2()
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "ShareSceneId"
            r12.putString(r15, r14)
            com.tencent.mm.plugin.sns.storage.SnsInfo r14 = r9.mo137505C2()
            int r14 = r14.getCreateTime()
            long r14 = (long) r14
            java.lang.String r13 = "CreateTime"
            r12.putLong(r13, r14)
            java.lang.String r13 = "TimelineEnterSource"
            r12.putInt(r13, r8)
            com.tencent.mm.plugin.sns.storage.SnsInfo r13 = r9.mo137505C2()
            int r13 = r13.field_type
            java.lang.String r14 = "SnsContentType"
            r12.putInt(r14, r13)
            long r13 = r9.mo137526z2()
            int r14 = (int) r13
            java.lang.String r13 = "SnsLocalId"
            r12.putInt(r13, r14)
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r15 = java.lang.String.valueOf(r7)
            gv2.C98249r.m126976a()
            gv2.r r7 = gv2.C98249r.f288050e
            java.lang.String r7 = "getTextSize"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r13)
            int r8 = gv2.C98249r.f288051f
            float r8 = (float) r8
            android.content.Context r16 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            float r16 = kg3.C76577a.m92165p(r16)
            float r8 = r8 * r16
            int r8 = (int) r8
            float r8 = (float) r8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r13)
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r9.mo137505C2()
            r13 = r2
            r9 = r3
            long r2 = r7.field_snsId
            r20 = 2
            r16 = r8
            r17 = r12
            r18 = r2
            de3.u r2 = gv2.C76072s.m91373b(r14, r15, r16, r17, r18, r20)
            int r3 = com.tencent.p014mm.plugin.sns.model.C94847c1.m120218f()
            if (r3 <= 0) goto L_0x0125
            java.lang.CharSequence r2 = gv2.C76072s.m91372a(r2)
            r7 = r2
            goto L_0x0126
        L_0x0125:
            r7 = 0
        L_0x0126:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            goto L_0x012f
        L_0x012a:
            r13 = r2
            r9 = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
        L_0x012f:
            r0.f279853u = r7
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView r2 = r21.getContentTv()
            java.lang.CharSequence r3 = r0.f279853u
            int r7 = r21.getWidth()
            int r1 = r1.mo138405c(r2, r3, r7)
            a14.h0 r2 = a14.C53872d1.f151117a
            a14.k2 r2 = f14.C58901s.f168555a
            ku2.b r3 = new ku2.b
            r7 = r22
            r8 = 0
            r3.<init>(r0, r7, r1, r8)
            r5.f290979d = r0
            r1 = 1
            r5.f290982g = r1
            java.lang.Object r1 = a14.C53895h.m60469g(r2, r3, r5)
            if (r1 != r6) goto L_0x015a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)
            goto L_0x0176
        L_0x015a:
            de3.a0 r1 = new de3.a0
            android.content.Context r2 = r0.getContext()
            r1.<init>(r2)
            ku2.c r2 = new ku2.c
            r2.<init>(r0)
            r1.f221530q = r2
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView r0 = r0.getContentTv()
            r0.setOnTouchListener(r1)
            rx3.b0 r6 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)
        L_0x0176:
            r0 = r13
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveContentView.m122755l(com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView, boolean, wx3.d):java.lang.Object");
    }

    public final CharSequence getContent() {
        SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        CharSequence charSequence = this.f279853u;
        SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        return charSequence;
    }

    public final ImproveTextView getContentTv() {
        SnsMethodCalculate.markStartTimeMs("getContentTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        ImproveTextView improveTextView = this.f279849q;
        if (improveTextView != null) {
            SnsMethodCalculate.markEndTimeMs("getContentTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
            return improveTextView;
        }
        C87412m.m108603p("contentTv");
        throw null;
    }

    public View getContentView() {
        SnsMethodCalculate.markStartTimeMs("getContentView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        SnsMethodCalculate.markEndTimeMs("getContentView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        return null;
    }

    /* renamed from: m */
    public final void mo133355m() {
        SnsMethodCalculate.markStartTimeMs("inflateXml", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        setPadding(0, -3, 0, 0);
        Context context = getContext();
        C87412m.m108593f(context, "context");
        ImproveTextView improveTextView = new ImproveTextView(context);
        this.f279848p = improveTextView;
        improveTextView.setId(C0966R.C0970id.c2i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int b = C76577a.m92151b(getContext(), 1);
        layoutParams.topMargin = b;
        layoutParams.gravity = 16;
        ImproveTextView improveTextView2 = this.f279848p;
        if (improveTextView2 != null) {
            int i = b * 2;
            int i2 = b * 3;
            improveTextView2.setPadding(i, i2, i, i2);
            ImproveTextView improveTextView3 = this.f279848p;
            if (improveTextView3 != null) {
                improveTextView3.setMaxLines(1);
                ImproveTextView improveTextView4 = this.f279848p;
                if (improveTextView4 != null) {
                    improveTextView4.setTextColor(C76577a.m92153d(getContext(), C0966R.color.a7f));
                    ImproveTextView improveTextView5 = this.f279848p;
                    if (improveTextView5 != null) {
                        improveTextView5.setTextSize(0, (float) C76577a.m92164o(getContext(), C0966R.dimen.f3927j7));
                        ImproveTextView improveTextView6 = this.f279848p;
                        if (improveTextView6 != null) {
                            improveTextView6.setBackground(C76577a.m92158i(getContext(), C0966R.C0969drawable.atk));
                            ImproveTextView improveTextView7 = this.f279848p;
                            if (improveTextView7 != null) {
                                addView(improveTextView7, layoutParams);
                                Context context2 = getContext();
                                C87412m.m108593f(context2, "context");
                                this.f279849q = new ImproveTextView(context2);
                                getContentTv().setId(C0966R.C0970id.c2h);
                                getContentTv().setBackground(C76577a.m92158i(getContext(), C0966R.C0969drawable.atx));
                                getContentTv().setTextColor(C76577a.m92153d(getContext(), C0966R.color.a7f));
                                getContentTv().setTextSize(0, (float) C76577a.m92164o(getContext(), C0966R.dimen.f3927j7));
                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                                layoutParams2.topMargin = b;
                                layoutParams2.gravity = 16;
                                addView(getContentTv(), layoutParams2);
                                Context context3 = getContext();
                                C87412m.m108593f(context3, "context");
                                ImproveTextView improveTextView8 = new ImproveTextView(context3);
                                this.f279850r = improveTextView8;
                                improveTextView8.setId(C0966R.C0970id.c2e);
                                ImproveTextView improveTextView9 = this.f279850r;
                                if (improveTextView9 != null) {
                                    improveTextView9.setBackground(C76577a.m92158i(getContext(), C0966R.C0969drawable.f357356at2));
                                    ImproveTextView improveTextView10 = this.f279850r;
                                    if (improveTextView10 != null) {
                                        improveTextView10.setGravity(17);
                                        ImproveTextView improveTextView11 = this.f279850r;
                                        if (improveTextView11 != null) {
                                            improveTextView11.setMaxLines(1);
                                            ImproveTextView improveTextView12 = this.f279850r;
                                            if (improveTextView12 != null) {
                                                improveTextView12.setTextColor(C76577a.m92153d(getContext(), C0966R.color.a1d));
                                                ImproveTextView improveTextView13 = this.f279850r;
                                                if (improveTextView13 != null) {
                                                    improveTextView13.setTextSize(0, (float) C76577a.m92164o(getContext(), C0966R.dimen.f3927j7));
                                                    ImproveTextView improveTextView14 = this.f279848p;
                                                    if (improveTextView14 != null) {
                                                        improveTextView14.setTextSize(0, (float) C76577a.m92164o(getContext(), C0966R.dimen.f3927j7));
                                                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                                                        layoutParams3.topMargin = b * 4;
                                                        ImproveTextView improveTextView15 = this.f279850r;
                                                        if (improveTextView15 != null) {
                                                            addView(improveTextView15, layoutParams3);
                                                            ImproveTextView improveTextView16 = this.f279848p;
                                                            if (improveTextView16 != null) {
                                                                improveTextView16.setVisibility(8);
                                                                ImproveTextView improveTextView17 = this.f279850r;
                                                                if (improveTextView17 != null) {
                                                                    improveTextView17.setVisibility(8);
                                                                    ImproveTextView improveTextView18 = this.f279850r;
                                                                    if (improveTextView18 != null) {
                                                                        improveTextView18.setOnClickListener(new C95883b(this));
                                                                        ImproveTextView improveTextView19 = this.f279848p;
                                                                        if (improveTextView19 != null) {
                                                                            improveTextView19.setOnClickListener(new C95884c(this));
                                                                            getContentTv().setOnClickListener(new C95885d(this));
                                                                            SnsMethodCalculate.markEndTimeMs("inflateXml", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
                                                                            return;
                                                                        }
                                                                        C87412m.m108603p("singleTv");
                                                                        throw null;
                                                                    }
                                                                    C87412m.m108603p("opTv");
                                                                    throw null;
                                                                }
                                                                C87412m.m108603p("opTv");
                                                                throw null;
                                                            }
                                                            C87412m.m108603p("singleTv");
                                                            throw null;
                                                        }
                                                        C87412m.m108603p("opTv");
                                                        throw null;
                                                    }
                                                    C87412m.m108603p("singleTv");
                                                    throw null;
                                                }
                                                C87412m.m108603p("opTv");
                                                throw null;
                                            }
                                            C87412m.m108603p("opTv");
                                            throw null;
                                        }
                                        C87412m.m108603p("opTv");
                                        throw null;
                                    }
                                    C87412m.m108603p("opTv");
                                    throw null;
                                }
                                C87412m.m108603p("opTv");
                                throw null;
                            }
                            C87412m.m108603p("singleTv");
                            throw null;
                        }
                        C87412m.m108603p("singleTv");
                        throw null;
                    }
                    C87412m.m108603p("singleTv");
                    throw null;
                }
                C87412m.m108603p("singleTv");
                throw null;
            }
            C87412m.m108603p("singleTv");
            throw null;
        }
        C87412m.m108603p("singleTv");
        throw null;
    }

    /* renamed from: n */
    public final void mo133356n() {
        String obj;
        SnsMethodCalculate.markStartTimeMs("loadContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        if (this.f279854v < 0) {
            SnsMethodCalculate.markEndTimeMs("loadContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
            return;
        }
        if (TextUtils.isEmpty(this.f279853u)) {
            this.f279853u = "";
        }
        CharSequence charSequence = this.f279853u;
        boolean z = false;
        if (!(charSequence == null || (obj = charSequence.toString()) == null || obj.hashCode() != getContentTv().getText().toString().hashCode())) {
            z = true;
        }
        if (!z && this.f279854v == 0) {
            Log.m105918d(this.f279845j, "loadContent: first show shrink");
            getContentTv().setMaxLines(6);
            getContentTv().setText(this.f279853u);
            ImproveTextView improveTextView = this.f279850r;
            if (improveTextView != null) {
                improveTextView.setTag(2);
                ImproveTextView improveTextView2 = this.f279850r;
                if (improveTextView2 != null) {
                    improveTextView2.setText(this.f279846n);
                } else {
                    C87412m.m108603p("opTv");
                    throw null;
                }
            } else {
                C87412m.m108603p("opTv");
                throw null;
            }
        }
        C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151117a, (C53934p0) null, new C95886e(this, (C15601d<? super C95886e>) null), 2, (Object) null);
        SnsMethodCalculate.markEndTimeMs("loadContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
    }

    /* renamed from: o */
    public final void mo133357o() {
        SnsMethodCalculate.markStartTimeMs("shrinkContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        Log.m105918d(this.f279845j, "shrinkContent: ");
        ImproveTextView improveTextView = this.f279850r;
        if (improveTextView != null) {
            improveTextView.setTag(2);
            ImproveTextView improveTextView2 = this.f279850r;
            if (improveTextView2 != null) {
                improveTextView2.setText(this.f279846n);
                getContentTv().setMaxLines(6);
                getContentTv().post(new C95888g(this));
                SnsMethodCalculate.markEndTimeMs("shrinkContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
                return;
            }
            C87412m.m108603p("opTv");
            throw null;
        }
        C87412m.m108603p("opTv");
        throw null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        super.onLayout(z, i, i2, i3, i4);
        String str = this.f279845j;
        Log.m105918d(str, "onLayout: changed:" + z + ", height:" + getHeight() + ", width:" + getWidth() + ", loadWidth:" + this.f279855w);
        if (z && this.f279855w != getWidth()) {
            this.f279855w = getWidth();
            mo133356n();
        }
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
    }

    public final void setStateChangeListener(C95882a aVar) {
        SnsMethodCalculate.markStartTimeMs("setStateChangeListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f279851s = aVar;
        SnsMethodCalculate.markEndTimeMs("setStateChangeListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
    }

    public ImproveContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String string = getContext().getString(C0966R.string.jbo);
        C87412m.m108593f(string, "context.getString(R.string.sns_desc_spread)");
        this.f279846n = string;
        String string2 = getContext().getString(C0966R.string.jbn);
        C87412m.m108593f(string2, "context.getString(R.string.sns_desc_shrinkup)");
        this.f279847o = string2;
        this.f279854v = -1;
        this.f279855w = -1;
        mo133355m();
        this.f279857y = new C95887f(this);
    }

    public ImproveContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String string = getContext().getString(C0966R.string.jbo);
        C87412m.m108593f(string, "context.getString(R.string.sns_desc_spread)");
        this.f279846n = string;
        String string2 = getContext().getString(C0966R.string.jbn);
        C87412m.m108593f(string2, "context.getString(R.string.sns_desc_shrinkup)");
        this.f279847o = string2;
        this.f279854v = -1;
        this.f279855w = -1;
        mo133355m();
        this.f279857y = new C95887f(this);
    }
}
