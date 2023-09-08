package com.tencent.p014mm.plugin.sns.p106ui.item;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Guideline;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.view.ImageIndicatorView;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import di3.C86312j;
import ht1.C60168f2;
import ht1.C60188n4;
import java.util.HashMap;
import java.util.Map;
import o40.C61926c;
import te3.C49712hj1;
import te3.C64682rk1;
import zp3.C23555k;

/* renamed from: com.tencent.mm.plugin.sns.ui.item.d */
public class C57411d extends BaseTimeLineItem {

    /* renamed from: q */
    public Map<String, Boolean> f164443q = new HashMap();

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.d$a */
    public class C57412a extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ C64682rk1 f164444a;

        /* renamed from: b */
        public final /* synthetic */ C57413b f164445b;

        /* renamed from: c */
        public final /* synthetic */ SnsInfo f164446c;

        public C57412a(C57411d dVar, C64682rk1 rk12, C57413b bVar, SnsInfo snsInfo) {
            this.f164444a = rk12;
            this.f164445b = bVar;
            this.f164446c = snsInfo;
        }

        /* renamed from: a */
        public long mo52a(View view) {
            SnsMethodCalculate.markStartTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.item.FinderMediaTimeLineItem$1");
            long hashCode = (long) (this.f164446c.getSnsId().hashCode() + view.hashCode());
            SnsMethodCalculate.markEndTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.item.FinderMediaTimeLineItem$1");
            return hashCode;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.FinderMediaTimeLineItem$1");
            if (z) {
                ((C60188n4) C86312j.m106911c(C60188n4.class)).mo75339Ki(C61926c.m72671P(this.f164444a.f185183d), this.f164444a.f185191o, 37, (C49712hj1) null, this.f164445b.f164448G0.getContext(), false, (String) null);
                ((C60168f2) C86312j.m106911c(C60168f2.class)).mo8598I6(3, 1, this.f164446c.getUserName(), this.f164444a.f185183d);
            }
            SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.FinderMediaTimeLineItem$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.d$b */
    public static class C57413b extends BaseTimeLineItem.BaseViewHolder {

        /* renamed from: F0 */
        public boolean f164447F0 = false;

        /* renamed from: G0 */
        public View f164448G0;

        /* renamed from: H0 */
        public Guideline f164449H0;

        /* renamed from: I0 */
        public ImageView f164450I0;

        /* renamed from: J0 */
        public ImageIndicatorView f164451J0;

        /* renamed from: K0 */
        public ImageView f164452K0;
    }

    /* renamed from: h */
    public void mo81014h(ViewStub viewStub, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.FinderMediaTimeLineItem");
        C57413b bVar = (C57413b) baseViewHolder;
        if (BaseTimeLineItem.m122773q(baseViewHolder) == null || BaseTimeLineItem.m122773q(baseViewHolder).getParent() == null) {
            bVar.f164448G0 = baseViewHolder.f279960i.findViewById(C0966R.C0970id.jtc);
            bVar.f164447F0 = true;
        } else {
            BaseTimeLineItem.m122773q(baseViewHolder).setLayoutResource(C0966R.C0971layout.f360003c32);
            if (!bVar.f164447F0) {
                bVar.f164448G0 = BaseTimeLineItem.m122773q(baseViewHolder).inflate();
                bVar.f164447F0 = true;
            }
        }
        bVar.f164450I0 = (ImageView) bVar.f164448G0.findViewById(C0966R.C0970id.jtf);
        bVar.f164451J0 = (ImageIndicatorView) bVar.f164448G0.findViewById(C0966R.C0970id.jtd);
        bVar.f164452K0 = (ImageView) bVar.f164448G0.findViewById(C0966R.C0970id.jtg);
        bVar.f164449H0 = (Guideline) bVar.f164448G0.findViewById(C0966R.C0970id.jte);
        SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.FinderMediaTimeLineItem");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (((java.util.HashMap) r0.f164443q).get(r10.getSnsId()) == null) goto L_0x0035;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo81015o(com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder r20, int r21, com.tencent.p014mm.plugin.sns.p106ui.C96275w6 r22, com.tencent.p014mm.protocal.protobuf.TimeLineObject r23, int r24, com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter r25) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            r3 = r23
            r4 = r25
            java.lang.String r5 = "fillItem"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.item.FinderMediaTimeLineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            r7 = 1
            if (r3 == 0) goto L_0x0187
            te3.j00 r8 = r3.ContentObj
            if (r8 == 0) goto L_0x0187
            te3.rk1 r8 = r8.f298431o
            if (r8 == 0) goto L_0x0187
            r9 = r1
            com.tencent.mm.plugin.sns.ui.item.d$b r9 = (com.tencent.p014mm.plugin.sns.p106ui.item.C57411d.C57413b) r9
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r2.f281367a
            java.lang.String r11 = r10.getSnsId()
            if (r11 == 0) goto L_0x0035
            java.util.Map<java.lang.String, java.lang.Boolean> r11 = r0.f164443q
            java.lang.String r12 = r10.getSnsId()
            java.util.HashMap r11 = (java.util.HashMap) r11
            java.lang.Object r11 = r11.get(r12)
            if (r11 != 0) goto L_0x0052
        L_0x0035:
            android.view.View r1 = r1.f279960i
            com.tencent.mm.plugin.sns.ui.item.d$a r11 = new com.tencent.mm.plugin.sns.ui.item.d$a
            r11.<init>(r0, r8, r9, r10)
            zp3.C23564m.m28138h(r1, r11)
            java.lang.String r1 = r10.getSnsId()
            if (r1 == 0) goto L_0x0052
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = r0.f164443q
            java.lang.String r11 = r10.getSnsId()
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            java.util.HashMap r1 = (java.util.HashMap) r1
            r1.put(r11, r12)
        L_0x0052:
            java.util.LinkedList<te3.pk1> r1 = r8.f185190n
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
            if (r1 != 0) goto L_0x0187
            java.util.LinkedList<te3.pk1> r1 = r8.f185190n
            r11 = 0
            java.lang.Object r1 = r1.get(r11)
            te3.pk1 r1 = (te3.C64628pk1) r1
            if (r1 == 0) goto L_0x0187
            int r12 = r8.f185188i
            r13 = 4
            r14 = 8
            if (r12 != r13) goto L_0x00b1
            android.widget.ImageView r12 = r9.f164450I0
            r12.setVisibility(r11)
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView r12 = r9.f164451J0
            r12.setVisibility(r14)
            androidx.constraintlayout.widget.Guideline r12 = r9.f164449H0
            r12.setGuidelineEnd(r11)
            float r12 = r1.f184829g
            int r12 = (int) r12
            float r13 = r1.f184830h
            int r13 = (int) r13
            android.view.View r14 = r9.f164448G0
            android.content.Context r14 = r14.getContext()
            android.util.Pair r12 = ad0.C91999u.m115565k(r12, r13, r14, r11)
            java.lang.Object r13 = r12.first
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            java.lang.Object r12 = r12.second
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            android.view.View r14 = r9.f164448G0
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            r14.width = r13
            android.view.View r13 = r9.f164448G0
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            r13.height = r12
            android.view.View r12 = r9.f164448G0
            r12.requestLayout()
            goto L_0x0104
        L_0x00b1:
            r13 = 2
            if (r12 != r13) goto L_0x00ba
            android.widget.ImageView r12 = r9.f164450I0
            r12.setVisibility(r11)
            goto L_0x00bf
        L_0x00ba:
            android.widget.ImageView r12 = r9.f164450I0
            r12.setVisibility(r14)
        L_0x00bf:
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView r12 = r9.f164451J0
            r12.setVisibility(r14)
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView r12 = r9.f164451J0
            int r13 = r8.f185189j
            r12.f21258e = r13
            androidx.constraintlayout.widget.Guideline r12 = r9.f164449H0
            r12.setGuidelineEnd(r11)
            float r12 = r1.f184829g
            int r12 = (int) r12
            float r13 = r1.f184830h
            int r13 = (int) r13
            android.view.View r14 = r9.f164448G0
            android.content.Context r14 = r14.getContext()
            android.util.Pair r12 = ad0.C91999u.m115565k(r12, r13, r14, r11)
            java.lang.Object r13 = r12.first
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            java.lang.Object r12 = r12.second
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            android.view.View r14 = r9.f164448G0
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            r14.width = r13
            android.view.View r13 = r9.f164448G0
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            r13.height = r12
            android.view.View r12 = r9.f164448G0
            r12.requestLayout()
        L_0x0104:
            android.app.Activity r12 = r0.f279904e
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131836924(0x7f113ffc, float:1.9307029E38)
            java.lang.String r12 = r12.getString(r13)
            java.lang.Object[] r13 = new java.lang.Object[r7]
            java.lang.String r14 = vr2.C102236a0.m134703A(r8)
            r13[r11] = r14
            java.lang.String r11 = java.lang.String.format(r12, r13)
            r9.f279944a = r11
            android.widget.ImageView r12 = r9.f164452K0
            r12.setContentDescription(r11)
            java.lang.String r13 = r10.getSnsId()
            java.lang.String r11 = r8.f185183d
            java.lang.String r12 = "startLoad"
            java.lang.String r15 = "com.tencent.mm.plugin.sns.report.SnsFinderReportUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r15)
            if (r11 != 0) goto L_0x0136
            java.lang.String r11 = ""
        L_0x0136:
            r14 = r11
            r11 = -1
            r17 = 0
            r18 = 0
            java.lang.String r16 = "timeline"
            r7 = r15
            r15 = r11
            ks2.C99181f.m129210p(r13, r14, r15, r16, r17, r18)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r7)
            lu2.e$$a r7 = new lu2.e$$a
            r7.<init>(r8)
            java.lang.Class<ht1.t1> r8 = ht1.C60200t1.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            ht1.t1 r8 = (ht1.C60200t1) r8
            java.lang.String r1 = r1.f184828f
            android.widget.ImageView r11 = r9.f164452K0
            java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference
            r12.<init>(r7)
            pl1.e0$a r7 = pl1.C11978e0.C11979a.COMMON
            r8.mo76809Sd(r1, r11, r12, r7)
            android.view.View r1 = r9.f164448G0
            r1.setTag(r3)
            android.view.View r1 = r9.f164448G0
            r3 = 2131312345(0x7f093ed9, float:1.8243056E38)
            r1.setTag(r3, r10)
            android.view.View r1 = r9.f164448G0
            com.tencent.mm.plugin.sns.ui.n8 r3 = r4.f278576j
            android.view.View$OnClickListener r3 = r3.f280587e
            r1.setOnClickListener(r3)
            uo3.a r1 = r25.mo132921k()
            android.view.View r3 = r9.f164448G0
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r4 = r4.f278572f
            com.tencent.mm.plugin.sns.ui.listener.p0 r7 = r4.f280350F
            com.tencent.mm.plugin.sns.ui.listener.c r4 = r4.f280381k
            r1.mo108275j(r3, r7, r4)
        L_0x0187:
            r1 = 1
            r0.mo133391g(r2, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.item.C57411d.mo81015o(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.w6, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter):void");
    }

    /* renamed from: t */
    public String mo81016t() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.FinderMediaTimeLineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.FinderMediaTimeLineItem");
        return "FinderMediaTimeLineItem";
    }
}
