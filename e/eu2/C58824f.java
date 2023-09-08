package eu2;

import a14.C0000n0;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.SnsWsFoldDetailUI;
import com.tencent.p014mm.plugin.sns.p106ui.improve.item.ImproveTimelineItemNotify;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import fy3.C32227p;
import gu2.C98214b;
import gy3.C87412m;
import iu2.C98799a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.ResultKt;
import os2.C35293n0;
import rx3.C13598b0;
import rx3.C13604l;
import te3.k94;
import vr2.C102236a0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: eu2.f */
public final class C58824f extends ImproveTimelineItemNotify {

    /* renamed from: X0 */
    public static final /* synthetic */ int f168416X0 = 0;

    /* renamed from: W0 */
    public TextView f168417W0;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem", mo125469f = "FoldImproveTimelineItem.kt", mo125470l = {93}, mo125471m = "loadCustomItemInfo")
    /* renamed from: eu2.f$a */
    public static final class C58825a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f168418d;

        /* renamed from: e */
        public final /* synthetic */ C58824f f168419e;

        /* renamed from: f */
        public int f168420f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58825a(C58824f fVar, C15601d<? super C58825a> dVar) {
            super(dVar);
            this.f168419e = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$1");
            this.f168418d = obj;
            this.f168420f |= Integer.MIN_VALUE;
            Object F = this.f168419e.mo81005F(this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$1");
            return F;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2", mo125469f = "FoldImproveTimelineItem.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: eu2.f$b */
    public static final class C58826b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ TextView f168421d;

        /* renamed from: e */
        public final /* synthetic */ SpannableString f168422e;

        /* renamed from: f */
        public final /* synthetic */ String f168423f;

        /* renamed from: g */
        public final /* synthetic */ C58824f f168424g;

        /* renamed from: eu2.f$b$a */
        public static final class C58827a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C58824f f168425d;

            public C58827a(C58824f fVar) {
                this.f168425d = fVar;
            }

            public final void onClick(View view) {
                C98214b b;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/item/FoldImproveTimelineItem$loadCustomItemInfo$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2$1");
                C58824f fVar = this.f168425d;
                int i = C58824f.f168416X0;
                SnsMethodCalculate.markStartTimeMs("access$jumpToFoldPage", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
                fVar.getClass();
                SnsMethodCalculate.markStartTimeMs("jumpToFoldPage", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
                fVar.mo137055z("MicroMsg.Improve.FoldTimelineItem", "jumpToFoldPage");
                C98799a data = fVar.getData();
                if (data == null || (b = data.mo138170b()) == null) {
                    SnsMethodCalculate.markEndTimeMs("jumpToFoldPage", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
                } else {
                    k94 I2 = b.mo137511I2();
                    if (I2 == null) {
                        SnsMethodCalculate.markEndTimeMs("jumpToFoldPage", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
                    } else {
                        C35293n0 H2 = b.mo137510H2();
                        if (H2 == null) {
                            SnsMethodCalculate.markEndTimeMs("jumpToFoldPage", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
                        } else {
                            Intent intent = new Intent(fVar.getContext(), SnsWsFoldDetailUI.class);
                            intent.putExtra("key_ws_group_id", H2.field_groupId);
                            Long l = I2.f183902d.get(0);
                            C87412m.m108593f(l, "wsGroup.snsIds[0]");
                            intent.putExtra("key_ws_detail_max_id", l.longValue());
                            LinkedList<Long> linkedList = I2.f183902d;
                            Long l2 = linkedList.get(linkedList.size() - 1);
                            C87412m.m108593f(l2, "wsGroup.snsIds[wsGroup.snsIds.size - 1]");
                            intent.putExtra("key_ws_detail_min_id", l2.longValue());
                            intent.putExtra("key_ws_detail_username", b.mo137509G2().UserName);
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<Long> it = I2.f183902d.iterator();
                            while (it.hasNext()) {
                                Long next = it.next();
                                C87412m.m108593f(next, "id");
                                arrayList2.add(C102236a0.m134763p0(next.longValue()));
                            }
                            intent.putStringArrayListExtra("key_ws_str_sns_id_list", arrayList2);
                            Context context = fVar.getContext();
                            C9556a aVar = new C9556a();
                            aVar.mo10233c(intent);
                            Context context2 = context;
                            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/item/FoldImproveTimelineItem", "jumpToFoldPage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            context.startActivity((Intent) aVar.mo10231a(0));
                            C117292a.m165359e(context2, "com/tencent/mm/plugin/sns/ui/improve/item/FoldImproveTimelineItem", "jumpToFoldPage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            SnsReportHelper.f275506m0.mo131379l(I2.f183902d, H2.field_groupId, b.mo137509G2().UserName);
                            SnsReportHelper.f275506m0.mo131367a0(H2.field_groupId, true);
                            SnsMethodCalculate.markEndTimeMs("jumpToFoldPage", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
                        }
                    }
                }
                SnsMethodCalculate.markEndTimeMs("access$jumpToFoldPage", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2$1");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/item/FoldImproveTimelineItem$loadCustomItemInfo$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58826b(TextView textView, SpannableString spannableString, String str, C58824f fVar, C15601d<? super C58826b> dVar) {
            super(2, dVar);
            this.f168421d = textView;
            this.f168422e = spannableString;
            this.f168423f = str;
            this.f168424g = fVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2");
            C58826b bVar = new C58826b(this.f168421d, this.f168422e, this.f168423f, this.f168424g, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2");
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2");
            Object invokeSuspend = ((C58826b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2");
            ResultKt.throwOnFailure(obj);
            TextView textView = this.f168421d;
            textView.setText(this.f168422e + this.f168423f);
            this.f168421d.setOnClickListener(new C58827a(this.f168424g));
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2");
            return b0Var;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58824f(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo81005F(wx3.C15601d<? super java.lang.Boolean> r13) {
        /*
            r12 = this;
            java.lang.String r0 = "loadCustomItemInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r13 instanceof eu2.C58824f.C58825a
            if (r2 == 0) goto L_0x001b
            r2 = r13
            eu2.f$a r2 = (eu2.C58824f.C58825a) r2
            int r3 = r2.f168420f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001b
            int r3 = r3 - r4
            r2.f168420f = r3
            goto L_0x0020
        L_0x001b:
            eu2.f$a r2 = new eu2.f$a
            r2.<init>(r12, r13)
        L_0x0020:
            java.lang.Object r13 = r2.f168418d
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f168420f
            r5 = 1
            if (r4 == 0) goto L_0x003b
            if (r4 != r5) goto L_0x0030
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00d6
        L_0x0030:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r13
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r13)
            android.widget.TextView r7 = r12.f168417W0
            if (r7 != 0) goto L_0x0048
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r13
        L_0x0048:
            iu2.a r13 = r12.getData()
            if (r13 == 0) goto L_0x00ea
            gu2.b r13 = r13.mo138170b()
            if (r13 != 0) goto L_0x0056
            goto L_0x00ea
        L_0x0056:
            os2.n0 r4 = r13.mo137510H2()
            if (r4 == 0) goto L_0x00dc
            te3.k94 r4 = r13.mo137511I2()
            if (r4 == 0) goto L_0x00dc
            te3.k94 r4 = r13.mo137511I2()
            r6 = 0
            if (r4 == 0) goto L_0x006c
            java.util.LinkedList<java.lang.Long> r4 = r4.f183902d
            goto L_0x006d
        L_0x006c:
            r4 = r6
        L_0x006d:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r4)
            if (r4 == 0) goto L_0x0074
            goto L_0x00dc
        L_0x0074:
            java.lang.Class<ny.h> r4 = p629ny.C76979h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ny.h r4 = (p629ny.C76979h) r4
            android.content.Context r8 = r12.getContext()
            te3.k94 r9 = r13.mo137511I2()
            if (r9 == 0) goto L_0x0088
            java.lang.String r6 = r9.f183903e
        L_0x0088:
            float r9 = r7.getTextSize()
            android.text.SpannableString r8 = r4.yp0(r8, r6, r9)
            android.content.Context r4 = r12.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131836957(0x7f11401d, float:1.9307095E38)
            java.lang.Object[] r9 = new java.lang.Object[r5]
            te3.k94 r13 = r13.mo137511I2()
            r10 = 0
            if (r13 == 0) goto L_0x00ad
            java.util.LinkedList<java.lang.Long> r13 = r13.f183902d
            if (r13 == 0) goto L_0x00ad
            int r13 = r13.size()
            goto L_0x00ae
        L_0x00ad:
            r13 = 0
        L_0x00ae:
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r13)
            r9[r10] = r11
            java.lang.String r9 = r4.getString(r6, r9)
            java.lang.String r13 = "context.resources.getStr…sIds?.size ?: 0\n        )"
            gy3.C87412m.m108593f(r9, r13)
            a14.h0 r13 = a14.C53872d1.f151117a
            a14.k2 r13 = f14.C58901s.f168555a
            eu2.f$b r4 = new eu2.f$b
            r11 = 0
            r6 = r4
            r10 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r2.f168420f = r5
            java.lang.Object r13 = a14.C53895h.m60469g(r13, r4, r2)
            if (r13 != r3) goto L_0x00d6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L_0x00d6:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r13
        L_0x00dc:
            java.lang.String r13 = "MicroMsg.Improve.FoldTimelineItem"
            java.lang.String r2 = "loadCustomItemInfo error,for struct not valid"
            r12.mo137054y(r13, r2)
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r13
        L_0x00ea:
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: eu2.C58824f.mo81005F(wx3.d):java.lang.Object");
    }

    public int getViewType() {
        SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
        return 22;
    }

    /* renamed from: k */
    public C13604l<View, ConstraintLayout.LayoutParams> mo81009k() {
        SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        int h = C76577a.m92157h(getContext(), C0966R.dimen.f3736cp);
        int n = mo137011n(18);
        appCompatTextView.setPadding(h, n, h, n);
        appCompatTextView.setTextColor(C76577a.m92153d(getContext(), C0966R.color.BW_0_Alpha_0_9));
        appCompatTextView.setTextSize(0, (float) C76577a.m92164o(getContext(), C0966R.dimen.f3957lf));
        appCompatTextView.setBackground(C76577a.m92158i(getContext(), C0966R.C0969drawable.atk));
        appCompatTextView.setMaxLines(1);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -1);
        this.f168417W0 = appCompatTextView;
        C13604l<View, ConstraintLayout.LayoutParams> lVar = new C13604l<>(appCompatTextView, layoutParams);
        SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
        return lVar;
    }

    public String name() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
        return "FoldImproveTimelineItem";
    }

    /* renamed from: s */
    public void mo84001s() {
        SnsMethodCalculate.markStartTimeMs("layoutCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
        getCommentContainer().setVisibility(8);
        SnsMethodCalculate.markEndTimeMs("layoutCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
    }

    /* renamed from: v */
    public void mo84002v() {
        SnsMethodCalculate.markStartTimeMs("loadContentView", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
        getContentText().setVisibility(8);
        View addressStub = getAddressStub();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(addressStub, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/item/FoldImproveTimelineItem", "loadContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        addressStub.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(addressStub, "com/tencent/mm/plugin/sns/ui/improve/item/FoldImproveTimelineItem", "loadContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getCommentImage().setVisibility(8);
        SnsMethodCalculate.markEndTimeMs("loadContentView", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
    }
}
