package com.tencent.p014mm.plugin.sns.p106ui.item;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.TagImageView;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.item.l */
public class C95928l extends BaseTimeLineItem {
    /* renamed from: h */
    public void mo81014h(ViewStub viewStub, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.OtherTimeLineItem");
        if (BaseTimeLineItem.m122773q(baseViewHolder) == null || BaseTimeLineItem.m122773q(baseViewHolder).getParent() == null) {
            baseViewHolder.f279949c0 = baseViewHolder.f279960i.findViewById(C0966R.C0970id.f358729gq2);
            baseViewHolder.f279947b0 = true;
        } else {
            BaseTimeLineItem.m122773q(baseViewHolder).setLayoutResource(C0966R.C0971layout.c3m);
            if (!baseViewHolder.f279947b0) {
                baseViewHolder.f279949c0 = BaseTimeLineItem.m122773q(baseViewHolder).inflate();
                baseViewHolder.f279947b0 = true;
            }
        }
        View view = baseViewHolder.f279949c0;
        baseViewHolder.f279980s = view;
        baseViewHolder.f279982t = (TagImageView) view.findViewById(C0966R.C0970id.f4p);
        baseViewHolder.f279984u = (ImageView) baseViewHolder.f279980s.findViewById(C0966R.C0970id.k0s);
        baseViewHolder.f279986v = (TextView) baseViewHolder.f279980s.findViewById(C0966R.C0970id.iub);
        TextView textView = (TextView) baseViewHolder.f279980s.findViewById(C0966R.C0970id.kpq);
        baseViewHolder.f279988w = textView;
        textView.setTextColor(this.f279904e.getResources().getColor(C0966R.color.a7f));
        C102236a0.m134779x0(baseViewHolder.f279982t, this.f279904e);
        SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.OtherTimeLineItem");
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x045f  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0547  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x065a  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0a74  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0b64  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0b72  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0b7f  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0bf2  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02c9  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo81015o(com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder r26, int r27, com.tencent.p014mm.plugin.sns.p106ui.C96275w6 r28, com.tencent.p014mm.protocal.protobuf.TimeLineObject r29, int r30, com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter r31) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r28
            r3 = r29
            r4 = r31
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_finder_no_support_share_switch
            java.lang.Class<h81.h> r6 = h81.C32735h.class
            java.lang.Class<ht1.t1> r7 = ht1.C60200t1.class
            java.lang.String r8 = "fillItem"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ui.item.OtherTimeLineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            com.tencent.mm.plugin.sns.ui.TagImageView r10 = r1.f279982t
            r11 = r27
            r10.setPosition(r11)
            java.lang.String r10 = r2.f281381h
            com.tencent.mm.plugin.sns.storage.SnsInfo r11 = r2.f281367a
            int r12 = r11.getTypeFlag()
            boolean r13 = r2.f281391r
            r15 = 2
            java.lang.String r14 = ","
            if (r13 == 0) goto L_0x004c
            com.tencent.mm.plugin.sns.storage.ADXml r10 = r11.getAdXml()
            int r10 = r10.adContentStyle
            if (r10 != r15) goto L_0x0045
            android.view.View r10 = r1.f279980s
            r10.setTag(r1)
            android.view.View r10 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r12 = r4.f278572f
            android.view.View$OnClickListener r12 = r12.f280370Z
            r10.setOnClickListener(r12)
            r10 = 1
            goto L_0x0046
        L_0x0045:
            r10 = 0
        L_0x0046:
            r23 = r8
            r24 = r9
            goto L_0x02b6
        L_0x004c:
            te3.j00 r13 = r3.ContentObj
            int r15 = r13.f298424e
            r23 = r8
            r8 = 9
            if (r15 != r8) goto L_0x0073
            java.util.LinkedList<te3.kv2> r8 = r13.f298427h
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x0233
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.g0 r13 = new com.tencent.mm.plugin.sns.ui.g0
            r13.<init>((com.tencent.p014mm.protocal.protobuf.TimeLineObject) r3, (java.lang.String) r10, (int) r12)
            r8.setTag(r13)
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.n8 r10 = r4.f278576j
            android.view.View$OnClickListener r10 = r10.f280593k
            r8.setOnClickListener(r10)
            goto L_0x0233
        L_0x0073:
            r8 = 10
            if (r15 != r8) goto L_0x0094
            java.util.LinkedList<te3.kv2> r8 = r13.f298427h
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x0233
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.g0 r13 = new com.tencent.mm.plugin.sns.ui.g0
            r13.<init>((com.tencent.p014mm.protocal.protobuf.TimeLineObject) r3, (java.lang.String) r10, (int) r12)
            r8.setTag(r13)
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.n8 r10 = r4.f278576j
            android.view.View$OnClickListener r10 = r10.f280595m
            r8.setOnClickListener(r10)
            goto L_0x0233
        L_0x0094:
            r8 = 17
            if (r15 != r8) goto L_0x00b5
            java.util.LinkedList<te3.kv2> r8 = r13.f298427h
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x0233
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.g0 r13 = new com.tencent.mm.plugin.sns.ui.g0
            r13.<init>((com.tencent.p014mm.protocal.protobuf.TimeLineObject) r3, (java.lang.String) r10, (int) r12)
            r8.setTag(r13)
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.n8 r10 = r4.f278576j
            android.view.View$OnClickListener r10 = r10.f280596n
            r8.setOnClickListener(r10)
            goto L_0x0233
        L_0x00b5:
            r8 = 22
            if (r15 == r8) goto L_0x0298
            r8 = 49
            if (r15 != r8) goto L_0x00bf
            goto L_0x0298
        L_0x00bf:
            r8 = 23
            if (r15 != r8) goto L_0x00e0
            java.util.LinkedList<te3.kv2> r8 = r13.f298427h
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x0233
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.g0 r13 = new com.tencent.mm.plugin.sns.ui.g0
            r13.<init>((com.tencent.p014mm.protocal.protobuf.TimeLineObject) r3, (java.lang.String) r10, (int) r12)
            r8.setTag(r13)
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.n8 r10 = r4.f278576j
            android.view.View$OnClickListener r10 = r10.f280598p
            r8.setOnClickListener(r10)
            goto L_0x0233
        L_0x00e0:
            r8 = 14
            if (r15 != r8) goto L_0x0101
            java.util.LinkedList<te3.kv2> r8 = r13.f298427h
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x0233
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.g0 r13 = new com.tencent.mm.plugin.sns.ui.g0
            r13.<init>((com.tencent.p014mm.protocal.protobuf.TimeLineObject) r3, (java.lang.String) r10, (int) r12)
            r8.setTag(r13)
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.n8 r10 = r4.f278576j
            android.view.View$OnClickListener r10 = r10.f280594l
            r8.setOnClickListener(r10)
            goto L_0x0233
        L_0x0101:
            r8 = 12
            if (r15 != r8) goto L_0x0122
            java.util.LinkedList<te3.kv2> r8 = r13.f298427h
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x0233
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.g0 r13 = new com.tencent.mm.plugin.sns.ui.g0
            r13.<init>((com.tencent.p014mm.protocal.protobuf.TimeLineObject) r3, (java.lang.String) r10, (int) r12)
            r8.setTag(r13)
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.n8 r10 = r4.f278576j
            android.view.View$OnClickListener r10 = r10.f280602t
            r8.setOnClickListener(r10)
            goto L_0x0233
        L_0x0122:
            r8 = 13
            if (r15 != r8) goto L_0x014b
            java.util.LinkedList<te3.kv2> r8 = r13.f298427h
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x0143
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.g0 r13 = new com.tencent.mm.plugin.sns.ui.g0
            r13.<init>((com.tencent.p014mm.protocal.protobuf.TimeLineObject) r3, (java.lang.String) r10, (int) r12)
            r8.setTag(r13)
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.n8 r10 = r4.f278576j
            android.view.View$OnClickListener r10 = r10.f280603u
            r8.setOnClickListener(r10)
            goto L_0x0233
        L_0x0143:
            android.view.View r8 = r1.f279980s
            r10 = 0
            r8.setOnClickListener(r10)
            goto L_0x0233
        L_0x014b:
            r8 = 30
            if (r15 != r8) goto L_0x0164
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.g0 r13 = new com.tencent.mm.plugin.sns.ui.g0
            r13.<init>((com.tencent.p014mm.protocal.protobuf.TimeLineObject) r3, (java.lang.String) r10, (int) r12)
            r8.setTag(r13)
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.n8 r10 = r4.f278576j
            android.view.View$OnClickListener r10 = r10.f280601s
            r8.setOnClickListener(r10)
            goto L_0x0233
        L_0x0164:
            r8 = 26
            if (r15 != r8) goto L_0x017d
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.g0 r13 = new com.tencent.mm.plugin.sns.ui.g0
            r13.<init>((com.tencent.p014mm.protocal.protobuf.TimeLineObject) r3, (java.lang.String) r10, (int) r12)
            r8.setTag(r13)
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.n8 r10 = r4.f278576j
            android.view.View$OnClickListener r10 = r10.f280604v
            r8.setOnClickListener(r10)
            goto L_0x0233
        L_0x017d:
            r8 = 28
            if (r15 == r8) goto L_0x0282
            r8 = 29
            if (r15 == r8) goto L_0x0282
            r8 = 38
            if (r15 == r8) goto L_0x0282
            r8 = 34
            if (r15 == r8) goto L_0x0282
            r8 = 45
            if (r15 == r8) goto L_0x0282
            r8 = 37
            if (r15 == r8) goto L_0x0282
            r8 = 36
            if (r15 == r8) goto L_0x0282
            r8 = 44
            if (r15 == r8) goto L_0x0282
            r8 = 46
            if (r15 != r8) goto L_0x01a3
            goto L_0x0282
        L_0x01a3:
            r8 = 41
            if (r15 != r8) goto L_0x01bc
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.g0 r13 = new com.tencent.mm.plugin.sns.ui.g0
            r13.<init>((com.tencent.p014mm.protocal.protobuf.TimeLineObject) r3, (java.lang.String) r10, (int) r12)
            r8.setTag(r13)
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.n8 r10 = r4.f278576j
            android.view.View$OnClickListener r10 = r10.f280605w
            r8.setOnClickListener(r10)
            goto L_0x0233
        L_0x01bc:
            r8 = 39
            if (r15 != r8) goto L_0x01d4
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.g0 r13 = new com.tencent.mm.plugin.sns.ui.g0
            r13.<init>((com.tencent.p014mm.protocal.protobuf.TimeLineObject) r3, (java.lang.String) r10, (int) r12)
            r8.setTag(r13)
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.n8 r10 = r4.f278576j
            android.view.View$OnClickListener r10 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.f280580B
            r8.setOnClickListener(r10)
            goto L_0x0233
        L_0x01d4:
            r8 = 4
            if (r15 != r8) goto L_0x021c
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.g0 r13 = new com.tencent.mm.plugin.sns.ui.g0
            r13.<init>((com.tencent.p014mm.protocal.protobuf.TimeLineObject) r3, (java.lang.String) r10, (int) r12)
            r8.setTag(r13)
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.n8 r10 = r4.f278576j
            android.view.View$OnClickListener r10 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.f280580B
            r8.setOnClickListener(r10)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            android.app.Activity r10 = r0.f279904e
            r12 = 2131837016(0x7f114058, float:1.9307215E38)
            java.lang.String r10 = r10.getString(r12)
            r8.append(r10)
            te3.j00 r10 = r3.ContentObj
            java.util.LinkedList<te3.kv2> r10 = r10.f298427h
            r12 = 0
            java.lang.Object r10 = r10.get(r12)
            te3.kv2 r10 = (te3.C101804kv2) r10
            java.lang.String r10 = r10.f298697o
            r8.append(r10)
            r8.append(r14)
            te3.j00 r10 = r3.ContentObj
            java.lang.String r10 = r10.f298423d
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r1.f279944a = r8
            goto L_0x0233
        L_0x021c:
            r8 = 101(0x65, float:1.42E-43)
            if (r15 != r8) goto L_0x0237
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.g0 r13 = new com.tencent.mm.plugin.sns.ui.g0
            r13.<init>((com.tencent.p014mm.protocal.protobuf.TimeLineObject) r3, (java.lang.String) r10, (int) r12)
            r8.setTag(r13)
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.n8 r10 = r4.f278576j
            android.view.View$OnClickListener r10 = r10.f280606x
            r8.setOnClickListener(r10)
        L_0x0233:
            r24 = r9
            goto L_0x02b5
        L_0x0237:
            r8 = 3
            if (r15 != r8) goto L_0x0264
            r8 = r1
            com.tencent.mm.plugin.sns.ui.item.m$c r8 = (com.tencent.p014mm.plugin.sns.p106ui.item.C95929m.C95932c) r8
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            android.app.Activity r15 = r0.f279904e
            r24 = r9
            r9 = 2131837016(0x7f114058, float:1.9307215E38)
            java.lang.String r15 = r15.getString(r9)
            r13.append(r15)
            java.lang.String r9 = "，"
            r13.append(r9)
            te3.j00 r9 = r3.ContentObj
            java.lang.String r9 = r9.f298425f
            r13.append(r9)
            java.lang.String r9 = r13.toString()
            r8.f279944a = r9
            goto L_0x0266
        L_0x0264:
            r24 = r9
        L_0x0266:
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.g0 r9 = new com.tencent.mm.plugin.sns.ui.g0
            r9.<init>((com.tencent.p014mm.protocal.protobuf.TimeLineObject) r3, (java.lang.String) r10, (int) r12)
            r8.setTag(r9)
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.n8 r9 = r4.f278576j
            android.view.View$OnClickListener r9 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.f280580B
            r8.setOnClickListener(r9)
            int r8 = r3.contentattr
            r9 = 1
            r8 = r8 & r9
            if (r8 <= 0) goto L_0x02b5
            r8 = 1
            r10 = 0
            goto L_0x02b7
        L_0x0282:
            r24 = r9
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.g0 r9 = new com.tencent.mm.plugin.sns.ui.g0
            r9.<init>((com.tencent.p014mm.protocal.protobuf.TimeLineObject) r3, (java.lang.String) r10, (int) r12)
            r8.setTag(r9)
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.n8 r9 = r4.f278576j
            android.view.View$OnClickListener r9 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.f280580B
            r8.setOnClickListener(r9)
            goto L_0x02b5
        L_0x0298:
            r24 = r9
            java.util.LinkedList<te3.kv2> r8 = r13.f298427h
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x02b5
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.g0 r9 = new com.tencent.mm.plugin.sns.ui.g0
            r9.<init>((com.tencent.p014mm.protocal.protobuf.TimeLineObject) r3, (java.lang.String) r10, (int) r12)
            r8.setTag(r9)
            android.view.View r8 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.n8 r9 = r4.f278576j
            android.view.View$OnClickListener r9 = r9.f280597o
            r8.setOnClickListener(r9)
        L_0x02b5:
            r10 = 0
        L_0x02b6:
            r8 = 0
        L_0x02b7:
            if (r10 == 0) goto L_0x02c9
            uo3.a r9 = r31.mo132921k()
            android.view.View r12 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r4 = r4.f278572f
            com.tencent.mm.plugin.sns.ui.listener.p0 r13 = r4.f280347C
            com.tencent.mm.plugin.sns.ui.listener.c r4 = r4.f280381k
            r9.mo108275j(r12, r13, r4)
            goto L_0x02d8
        L_0x02c9:
            uo3.a r9 = r31.mo132921k()
            android.view.View r12 = r1.f279980s
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r4 = r4.f278572f
            com.tencent.mm.plugin.sns.ui.listener.p0 r13 = r4.f280396z
            com.tencent.mm.plugin.sns.ui.listener.c r4 = r4.f280381k
            r9.mo108275j(r12, r13, r4)
        L_0x02d8:
            boolean r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter.m122256r(r29)
            if (r4 == 0) goto L_0x02e7
            te3.j00 r4 = r3.ContentObj
            java.lang.String r4 = r4.f298426g
            java.lang.String r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter.m122253o(r4)
            goto L_0x02e9
        L_0x02e7:
            java.lang.String r4 = ""
        L_0x02e9:
            te3.j00 r9 = r3.ContentObj
            int r12 = r9.f298424e
            r13 = 9
            if (r12 == r13) goto L_0x02ff
            r13 = 14
            if (r12 == r13) goto L_0x02ff
            r13 = 12
            if (r12 == r13) goto L_0x02ff
            r13 = 13
            if (r12 == r13) goto L_0x02ff
            if (r10 == 0) goto L_0x0301
        L_0x02ff:
            java.lang.String r4 = r9.f298423d
        L_0x0301:
            te3.st2 r9 = r9.f298430n
            if (r9 == 0) goto L_0x0315
            int r9 = r9.f299453q
            r10 = 1
            if (r9 != r10) goto L_0x0315
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r9 = 2131833058(0x7f1130e2, float:1.9299187E38)
            java.lang.String r4 = r4.getString(r9)
        L_0x0315:
            te3.j00 r9 = r3.ContentObj
            java.lang.String r9 = r9.f298425f
            if (r9 == 0) goto L_0x0341
            int r10 = r9.length()
            r12 = 40
            if (r10 <= r12) goto L_0x0341
            boolean r10 = com.tencent.p014mm.smiley.C96965r.f284067d
            com.tencent.mm.smiley.r r10 = com.tencent.p014mm.smiley.C96965r.C44649c.f121057a
            r13 = 0
            int r10 = r10.mo135555g(r9, r13, r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r9 = r9.substring(r13, r10)
            r12.append(r9)
            java.lang.String r9 = "..."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
        L_0x0341:
            android.widget.ImageView r10 = r1.f279984u
            r12 = 8
            r10.setVisibility(r12)
            te3.j00 r10 = r3.ContentObj
            java.util.LinkedList<te3.kv2> r10 = r10.f298427h
            boolean r10 = r10.isEmpty()
            r13 = 18
            r15 = 2131756957(0x7f10079d, float:1.9144836E38)
            if (r10 != 0) goto L_0x045f
            com.tencent.mm.plugin.sns.ui.TagImageView r5 = r1.f279982t
            r6 = 0
            r5.setVisibility(r6)
            te3.j00 r5 = r3.ContentObj
            java.util.LinkedList<te3.kv2> r5 = r5.f298427h
            java.lang.Object r5 = r5.get(r6)
            te3.kv2 r5 = (te3.C101804kv2) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.app.Activity r7 = r0.f279904e
            r10 = 2131837016(0x7f114058, float:1.9307215E38)
            java.lang.String r7 = r7.getString(r10)
            r6.append(r7)
            r6.append(r14)
            r6.append(r9)
            r6.append(r14)
            java.lang.String r7 = r5.f298691f
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r1.f279944a = r6
            te3.j00 r6 = r3.ContentObj
            int r6 = r6.f298424e
            r7 = 5
            if (r6 != r7) goto L_0x03c2
            java.lang.String r9 = r5.f298697o
            android.widget.ImageView r6 = r1.f279984u
            r6.setImageResource(r15)
            android.widget.ImageView r6 = r1.f279984u
            r7 = 0
            r6.setVisibility(r7)
            com.tencent.mm.plugin.sns.model.o r16 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.ui.TagImageView r6 = r1.f279982t
            r19 = 2131755116(0x7f10006c, float:1.9141102E38)
            android.app.Activity r7 = r0.f279904e
            int r20 = r7.hashCode()
            com.tencent.mm.storage.o3 r7 = com.tencent.p014mm.storage.C96983o3.m124651c()
            int r10 = r3.CreateTime
            r7.f284145b = r10
            r17 = r5
            r18 = r6
            r21 = r7
            r16.mo131104X(r17, r18, r19, r20, r21)
            goto L_0x0b5e
        L_0x03c2:
            if (r6 != r13) goto L_0x03f6
            android.widget.ImageView r6 = r1.f279984u
            r7 = 0
            r6.setVisibility(r7)
            android.widget.ImageView r6 = r1.f279984u
            r6.setImageResource(r15)
            com.tencent.mm.plugin.sns.ui.TagImageView r6 = r1.f279982t
            r6.setVisibility(r7)
            com.tencent.mm.plugin.sns.model.o r16 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.ui.TagImageView r6 = r1.f279982t
            r19 = 2131755116(0x7f10006c, float:1.9141102E38)
            android.app.Activity r7 = r0.f279904e
            int r20 = r7.hashCode()
            com.tencent.mm.storage.o3 r7 = com.tencent.p014mm.storage.C96983o3.m124651c()
            int r10 = r3.CreateTime
            r7.f284145b = r10
            r17 = r5
            r18 = r6
            r21 = r7
            r16.mo131104X(r17, r18, r19, r20, r21)
            goto L_0x0b5e
        L_0x03f6:
            te3.d05 r6 = r3.weappInfo
            if (r6 == 0) goto L_0x040e
            java.lang.String r7 = r6.f298071e
            if (r7 == 0) goto L_0x040e
            int r6 = r6.f298077n
            r7 = 1
            if (r6 != r7) goto L_0x040e
            android.widget.ImageView r6 = r1.f279984u
            r6.setImageResource(r15)
            android.widget.ImageView r6 = r1.f279984u
            r7 = 0
            r6.setVisibility(r7)
        L_0x040e:
            te3.w25 r6 = r3.webSearchInfo
            if (r6 == 0) goto L_0x0425
            java.lang.String r6 = r6.f259899d
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0425
            android.widget.ImageView r6 = r1.f279984u
            r6.setImageResource(r15)
            android.widget.ImageView r6 = r1.f279984u
            r7 = 0
            r6.setVisibility(r7)
        L_0x0425:
            te3.j00 r6 = r3.ContentObj
            te3.st2 r6 = r6.f298430n
            if (r6 == 0) goto L_0x043c
            int r6 = r6.f299443d
            r7 = 16
            if (r6 != r7) goto L_0x043c
            android.widget.ImageView r6 = r1.f279984u
            r6.setImageResource(r15)
            android.widget.ImageView r6 = r1.f279984u
            r7 = 0
            r6.setVisibility(r7)
        L_0x043c:
            com.tencent.mm.plugin.sns.model.o r16 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.ui.TagImageView r6 = r1.f279982t
            android.app.Activity r7 = r0.f279904e
            int r19 = r7.hashCode()
            com.tencent.mm.storage.o3 r7 = com.tencent.p014mm.storage.C96983o3.m124651c()
            int r10 = r3.CreateTime
            r7.f284145b = r10
            java.lang.String r21 = r11.getSnsId()
            r17 = r5
            r18 = r6
            r20 = r7
            r16.mo131106Z(r17, r18, r19, r20, r21)
            goto L_0x0b5e
        L_0x045f:
            te3.j00 r10 = r3.ContentObj
            int r12 = r10.f298424e
            r15 = -1
            if (r12 != r13) goto L_0x048d
            android.widget.ImageView r5 = r1.f279984u
            r13 = 0
            r5.setVisibility(r13)
            android.widget.ImageView r5 = r1.f279984u
            r6 = 2131756957(0x7f10079d, float:1.9144836E38)
            r5.setImageResource(r6)
            com.tencent.mm.plugin.sns.ui.TagImageView r5 = r1.f279982t
            r5.setVisibility(r13)
            com.tencent.mm.plugin.sns.model.o r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.ui.TagImageView r6 = r1.f279982t
            r7 = 2131755116(0x7f10006c, float:1.9141102E38)
            android.app.Activity r10 = r0.f279904e
            int r10 = r10.hashCode()
            r5.mo131095O(r6, r15, r7, r10)
            goto L_0x0b5e
        L_0x048d:
            r13 = 0
            r15 = 26
            if (r12 != r15) goto L_0x04ac
            com.tencent.mm.plugin.sns.ui.TagImageView r5 = r1.f279982t
            r5.setVisibility(r13)
            com.tencent.mm.plugin.sns.model.o r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.ui.TagImageView r6 = r1.f279982t
            r7 = 2131756754(0x7f1006d2, float:1.9144424E38)
            android.app.Activity r10 = r0.f279904e
            int r10 = r10.hashCode()
            r11 = -1
            r5.mo131095O(r6, r11, r7, r10)
            goto L_0x0b5e
        L_0x04ac:
            java.lang.String r13 = ": "
            r15 = 28
            if (r12 != r15) goto L_0x05c7
            te3.rk1 r10 = r10.f298431o
            if (r10 == 0) goto L_0x0b5e
            di3.d r7 = di3.C86312j.m106911c(r7)
            ht1.t1 r7 = (ht1.C60200t1) r7
            boolean r7 = r7.mo76873sF()
            if (r7 != 0) goto L_0x04cf
            di3.d r6 = di3.C86312j.m106911c(r6)
            h81.h r6 = (h81.C32735h) r6
            r7 = 0
            int r5 = r6.mo58779Qe(r5, r7)
            if (r5 != 0) goto L_0x051c
        L_0x04cf:
            te3.j00 r5 = r3.ContentObj
            te3.rk1 r5 = r5.f298431o
            java.lang.String r5 = vr2.C102236a0.m134703A(r5)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x04f0
            te3.j00 r5 = r3.ContentObj
            te3.rk1 r5 = r5.f298431o
            java.lang.String r5 = r5.f185187h
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x04f0
            te3.j00 r5 = r3.ContentObj
            te3.rk1 r5 = r5.f298431o
            java.lang.String r9 = r5.f185187h
            goto L_0x051c
        L_0x04f0:
            te3.j00 r5 = r3.ContentObj
            te3.rk1 r5 = r5.f298431o
            java.lang.String r5 = r5.f185187h
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x051e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            te3.j00 r6 = r3.ContentObj
            te3.rk1 r6 = r6.f298431o
            java.lang.String r6 = vr2.C102236a0.m134703A(r6)
            r5.append(r6)
            r5.append(r13)
            te3.j00 r6 = r3.ContentObj
            te3.rk1 r6 = r6.f298431o
            java.lang.String r6 = r6.f185187h
            r5.append(r6)
            java.lang.String r9 = r5.toString()
        L_0x051c:
            r10 = 0
            goto L_0x0536
        L_0x051e:
            android.app.Activity r5 = r0.f279904e
            r6 = 2131837137(0x7f1140d1, float:1.930746E38)
            r7 = 1
            java.lang.Object[] r9 = new java.lang.Object[r7]
            te3.j00 r7 = r3.ContentObj
            te3.rk1 r7 = r7.f298431o
            java.lang.String r7 = vr2.C102236a0.m134703A(r7)
            r10 = 0
            r9[r10] = r7
            java.lang.String r5 = r5.getString(r6, r9)
            r9 = r5
        L_0x0536:
            com.tencent.mm.plugin.sns.ui.TagImageView r5 = r1.f279982t
            r5.setVisibility(r10)
            te3.j00 r5 = r3.ContentObj
            te3.rk1 r5 = r5.f298431o
            java.util.LinkedList<te3.pk1> r5 = r5.f185190n
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0b5e
            te3.kv2 r5 = new te3.kv2
            r5.<init>()
            te3.j00 r6 = r3.ContentObj
            te3.rk1 r6 = r6.f298431o
            java.util.LinkedList<te3.pk1> r6 = r6.f185190n
            java.lang.Object r6 = r6.get(r10)
            te3.pk1 r6 = (te3.C64628pk1) r6
            java.lang.String r6 = r6.f184828f
            r5.f298692g = r6
            te3.j00 r6 = r3.ContentObj
            te3.rk1 r6 = r6.f298431o
            java.util.LinkedList<te3.pk1> r6 = r6.f185190n
            java.lang.Object r6 = r6.get(r10)
            te3.pk1 r6 = (te3.C64628pk1) r6
            java.lang.String r6 = r6.f184828f
            r5.f298694i = r6
            r6 = 2
            r5.f298690e = r6
            r6 = 1
            r5.f298695j = r6
            te3.mv2 r7 = new te3.mv2
            r7.<init>()
            r5.f298698p = r7
            r5.f298693h = r6
            te3.j00 r6 = r3.ContentObj
            te3.rk1 r6 = r6.f298431o
            java.util.LinkedList<te3.pk1> r6 = r6.f185190n
            r10 = 0
            java.lang.Object r6 = r6.get(r10)
            te3.pk1 r6 = (te3.C64628pk1) r6
            float r6 = r6.f184829g
            r7.f298875d = r6
            te3.mv2 r6 = r5.f298698p
            te3.j00 r7 = r3.ContentObj
            te3.rk1 r7 = r7.f298431o
            java.util.LinkedList<te3.pk1> r7 = r7.f185190n
            java.lang.Object r7 = r7.get(r10)
            te3.pk1 r7 = (te3.C64628pk1) r7
            float r7 = r7.f184830h
            r6.f298876e = r7
            java.lang.String r6 = r11.getSnsId()
            r5.f298689d = r6
            com.tencent.mm.plugin.sns.model.o r15 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            java.lang.String r16 = r11.getSnsId()
            com.tencent.mm.plugin.sns.ui.TagImageView r6 = r1.f279982t
            android.app.Activity r7 = r0.f279904e
            int r19 = r7.hashCode()
            com.tencent.mm.storage.o3 r7 = com.tencent.p014mm.storage.C96983o3.m124651c()
            int r10 = r3.CreateTime
            r7.f284145b = r10
            r17 = r5
            r18 = r6
            r20 = r7
            r15.mo131101U(r16, r17, r18, r19, r20)
            goto L_0x0b5e
        L_0x05c7:
            r15 = 36
            if (r12 != r15) goto L_0x06ef
            te3.fw2 r10 = r10.f298436t
            if (r10 == 0) goto L_0x0b5e
            di3.d r7 = di3.C86312j.m106911c(r7)
            ht1.t1 r7 = (ht1.C60200t1) r7
            boolean r7 = r7.mo76873sF()
            if (r7 != 0) goto L_0x05e8
            di3.d r6 = di3.C86312j.m106911c(r6)
            h81.h r6 = (h81.C32735h) r6
            r7 = 0
            int r5 = r6.mo58779Qe(r5, r7)
            if (r5 != 0) goto L_0x0631
        L_0x05e8:
            te3.j00 r5 = r3.ContentObj
            te3.fw2 r5 = r5.f298436t
            java.lang.String r5 = r5.f183243f
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x0607
            te3.j00 r5 = r3.ContentObj
            te3.fw2 r5 = r5.f298436t
            java.lang.String r5 = r5.f183245h
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0607
            te3.j00 r5 = r3.ContentObj
            te3.fw2 r5 = r5.f298436t
            java.lang.String r9 = r5.f183245h
            goto L_0x0631
        L_0x0607:
            te3.j00 r5 = r3.ContentObj
            te3.fw2 r5 = r5.f298436t
            java.lang.String r5 = r5.f183245h
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0633
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            te3.j00 r6 = r3.ContentObj
            te3.fw2 r6 = r6.f298436t
            java.lang.String r6 = r6.f183243f
            r5.append(r6)
            r5.append(r13)
            te3.j00 r6 = r3.ContentObj
            te3.fw2 r6 = r6.f298436t
            java.lang.String r6 = r6.f183245h
            r5.append(r6)
            java.lang.String r9 = r5.toString()
        L_0x0631:
            r10 = 0
            goto L_0x0649
        L_0x0633:
            android.app.Activity r5 = r0.f279904e
            r6 = 2131837137(0x7f1140d1, float:1.930746E38)
            r7 = 1
            java.lang.Object[] r9 = new java.lang.Object[r7]
            te3.j00 r7 = r3.ContentObj
            te3.fw2 r7 = r7.f298436t
            java.lang.String r7 = r7.f183243f
            r10 = 0
            r9[r10] = r7
            java.lang.String r5 = r5.getString(r6, r9)
            r9 = r5
        L_0x0649:
            com.tencent.mm.plugin.sns.ui.TagImageView r5 = r1.f279982t
            r5.setVisibility(r10)
            te3.j00 r5 = r3.ContentObj
            te3.fw2 r5 = r5.f298436t
            java.util.LinkedList<te3.ew2> r5 = r5.f183247j
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0b5e
            te3.kv2 r5 = new te3.kv2
            r5.<init>()
            te3.j00 r6 = r3.ContentObj
            te3.fw2 r6 = r6.f298436t
            java.util.LinkedList<te3.ew2> r6 = r6.f183247j
            java.lang.Object r6 = r6.get(r10)
            te3.ew2 r6 = (te3.C64350ew2) r6
            java.lang.String r6 = r6.f183043h
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0682
            te3.j00 r6 = r3.ContentObj
            te3.fw2 r6 = r6.f298436t
            java.util.LinkedList<te3.ew2> r6 = r6.f183247j
            java.lang.Object r6 = r6.get(r10)
            te3.ew2 r6 = (te3.C64350ew2) r6
            java.lang.String r6 = r6.f183043h
            goto L_0x0690
        L_0x0682:
            te3.j00 r6 = r3.ContentObj
            te3.fw2 r6 = r6.f298436t
            java.util.LinkedList<te3.ew2> r6 = r6.f183247j
            java.lang.Object r6 = r6.get(r10)
            te3.ew2 r6 = (te3.C64350ew2) r6
            java.lang.String r6 = r6.f183040e
        L_0x0690:
            r5.f298692g = r6
            r5.f298694i = r6
            r6 = 2
            r5.f298690e = r6
            r6 = 1
            r5.f298695j = r6
            te3.mv2 r7 = new te3.mv2
            r7.<init>()
            r5.f298698p = r7
            r5.f298693h = r6
            te3.j00 r6 = r3.ContentObj
            te3.fw2 r6 = r6.f298436t
            java.util.LinkedList<te3.ew2> r6 = r6.f183247j
            r10 = 0
            java.lang.Object r6 = r6.get(r10)
            te3.ew2 r6 = (te3.C64350ew2) r6
            float r6 = r6.f183041f
            r7.f298875d = r6
            te3.mv2 r6 = r5.f298698p
            te3.j00 r7 = r3.ContentObj
            te3.fw2 r7 = r7.f298436t
            java.util.LinkedList<te3.ew2> r7 = r7.f183247j
            java.lang.Object r7 = r7.get(r10)
            te3.ew2 r7 = (te3.C64350ew2) r7
            float r7 = r7.f183042g
            r6.f298876e = r7
            java.lang.String r6 = r11.getSnsId()
            r5.f298689d = r6
            com.tencent.mm.plugin.sns.model.o r15 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            java.lang.String r16 = r11.getSnsId()
            com.tencent.mm.plugin.sns.ui.TagImageView r6 = r1.f279982t
            android.app.Activity r7 = r0.f279904e
            int r19 = r7.hashCode()
            com.tencent.mm.storage.o3 r7 = com.tencent.p014mm.storage.C96983o3.m124651c()
            int r10 = r3.CreateTime
            r7.f284145b = r10
            r17 = r5
            r18 = r6
            r20 = r7
            r15.mo131101U(r16, r17, r18, r19, r20)
            goto L_0x0b5e
        L_0x06ef:
            r15 = 29
            if (r12 == r15) goto L_0x0ac7
            r15 = 37
            if (r12 != r15) goto L_0x06f9
            goto L_0x0ac7
        L_0x06f9:
            r15 = 38
            if (r12 != r15) goto L_0x0782
            te3.nk1 r5 = r10.f298434r
            if (r5 == 0) goto L_0x0b5e
            java.lang.String r9 = r5.f184476e
            com.tencent.mm.plugin.sns.ui.TagImageView r5 = r1.f279982t
            r6 = 0
            r5.setVisibility(r6)
            te3.j00 r5 = r3.ContentObj
            te3.nk1 r5 = r5.f298434r
            java.util.LinkedList<java.lang.String> r5 = r5.f184478g
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x0b5e
            te3.kv2 r5 = new te3.kv2
            r5.<init>()
            te3.j00 r7 = r3.ContentObj
            te3.nk1 r7 = r7.f298434r
            java.util.LinkedList<java.lang.String> r7 = r7.f184478g
            java.lang.Object r7 = r7.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            te3.j00 r10 = r3.ContentObj
            te3.nk1 r10 = r10.f298434r
            java.util.LinkedList<java.lang.String> r10 = r10.f184479h
            java.lang.Object r10 = r10.get(r6)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            r5.f298692g = r6
            r5.f298694i = r6
            r6 = 2
            r5.f298690e = r6
            r6 = 1
            r5.f298695j = r6
            te3.mv2 r7 = new te3.mv2
            r7.<init>()
            r5.f298698p = r7
            r5.f298693h = r6
            r6 = 0
            r7.f298875d = r6
            r7.f298876e = r6
            java.lang.String r6 = r11.getSnsId()
            r5.f298689d = r6
            com.tencent.mm.plugin.sns.model.o r17 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            java.lang.String r18 = r11.getSnsId()
            com.tencent.mm.plugin.sns.ui.TagImageView r6 = r1.f279982t
            android.app.Activity r7 = r0.f279904e
            int r21 = r7.hashCode()
            com.tencent.mm.storage.o3 r7 = com.tencent.p014mm.storage.C96983o3.m124651c()
            int r10 = r3.CreateTime
            r7.f284145b = r10
            r19 = r5
            r20 = r6
            r22 = r7
            r17.mo131101U(r18, r19, r20, r21, r22)
            goto L_0x0b5e
        L_0x0782:
            r15 = 34
            if (r12 == r15) goto L_0x09e5
            r15 = 45
            if (r12 != r15) goto L_0x078c
            goto L_0x09e5
        L_0x078c:
            r5 = 39
            if (r12 != r5) goto L_0x08d1
            int r5 = r10.f298437u
            r6 = 3
            if (r5 != r6) goto L_0x0823
            te3.tk1 r5 = r10.f298438v
            if (r5 == 0) goto L_0x0b5e
            android.app.Activity r4 = r0.f279904e
            r5 = 2131821537(0x7f1103e1, float:1.927582E38)
            java.lang.String r4 = r4.getString(r5)
            te3.j00 r5 = r3.ContentObj
            te3.tk1 r5 = r5.f298438v
            int r6 = r5.f185604e
            r9 = 7
            if (r6 != r9) goto L_0x07b3
            te3.bf0 r5 = r5.f185609j
            if (r5 == 0) goto L_0x07b3
            java.lang.String r4 = com.tencent.p014mm.modelstat.C92859v.m117125c(r5)
        L_0x07b3:
            r9 = r4
            com.tencent.mm.plugin.sns.ui.TagImageView r4 = r1.f279982t
            r5 = 0
            r4.setVisibility(r5)
            te3.j00 r4 = r3.ContentObj
            te3.tk1 r4 = r4.f298438v
            java.lang.String r4 = r4.f185605f
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0808
            te3.kv2 r4 = new te3.kv2
            r4.<init>()
            te3.j00 r5 = r3.ContentObj
            te3.tk1 r5 = r5.f298438v
            java.lang.String r5 = r5.f185605f
            r4.f298692g = r5
            r4.f298694i = r5
            r5 = 2
            r4.f298690e = r5
            r5 = 1
            r4.f298695j = r5
            te3.mv2 r6 = new te3.mv2
            r6.<init>()
            r4.f298698p = r6
            r4.f298693h = r5
            r5 = 0
            r6.f298875d = r5
            r6.f298876e = r5
            java.lang.String r5 = r11.getSnsId()
            r4.f298689d = r5
            com.tencent.mm.plugin.sns.ui.TagImageView r4 = r1.f279982t
            com.tencent.mm.ui.widget.QImageView$a r5 = com.tencent.p014mm.p136ui.widget.QImageView.C97274a.CENTER_CROP
            r4.setScaleType(r5)
            di3.d r4 = di3.C86312j.m106911c(r7)
            ht1.t1 r4 = (ht1.C60200t1) r4
            te3.j00 r5 = r3.ContentObj
            te3.tk1 r5 = r5.f298438v
            java.lang.String r5 = r5.f185605f
            com.tencent.mm.plugin.sns.ui.TagImageView r6 = r1.f279982t
            r4.mo76882tg(r5, r6)
            goto L_0x081b
        L_0x0808:
            com.tencent.mm.plugin.sns.model.o r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.ui.TagImageView r5 = r1.f279982t
            r6 = 2131755877(0x7f100365, float:1.9142646E38)
            android.app.Activity r7 = r0.f279904e
            int r7 = r7.hashCode()
            r10 = -1
            r4.mo131095O(r5, r10, r6, r7)
        L_0x081b:
            te3.j00 r4 = r3.ContentObj
            te3.tk1 r4 = r4.f298438v
            java.lang.String r4 = r4.f185606g
            goto L_0x0b5e
        L_0x0823:
            r6 = 100000000(0x5f5e100, float:2.3122341E-35)
            if (r5 != r6) goto L_0x0b5e
            te3.tk1 r5 = r10.f298432p
            if (r5 == 0) goto L_0x0b5e
            android.app.Activity r4 = r0.f279904e
            r5 = 2131821537(0x7f1103e1, float:1.927582E38)
            java.lang.String r4 = r4.getString(r5)
            te3.j00 r5 = r3.ContentObj
            te3.tk1 r6 = r5.f298432p
            if (r6 == 0) goto L_0x086c
            int r4 = r6.f185604e
            r7 = 1
            if (r4 != r7) goto L_0x0857
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5 = 2131837140(0x7f1140d4, float:1.9307467E38)
            java.lang.Object[] r6 = new java.lang.Object[r7]
            te3.j00 r7 = r3.ContentObj
            te3.tk1 r7 = r7.f298432p
            java.lang.String r7 = r7.f185603d
            r9 = 0
            r6[r9] = r7
            java.lang.String r4 = r4.getString(r5, r6)
            goto L_0x086c
        L_0x0857:
            r7 = 7
            if (r4 != r7) goto L_0x086a
            te3.bf0 r4 = r6.f185609j
            if (r4 == 0) goto L_0x0867
            te3.tk1 r4 = r5.f298438v
            te3.bf0 r4 = r4.f185609j
            java.lang.String r4 = com.tencent.p014mm.modelstat.C92859v.m117125c(r4)
            goto L_0x086c
        L_0x0867:
            java.lang.String r4 = r6.f185603d
            goto L_0x086c
        L_0x086a:
            java.lang.String r4 = r6.f185603d
        L_0x086c:
            r9 = r4
            com.tencent.mm.plugin.sns.ui.TagImageView r4 = r1.f279982t
            r5 = 0
            r4.setVisibility(r5)
            te3.j00 r4 = r3.ContentObj
            te3.tk1 r4 = r4.f298432p
            java.lang.String r4 = r4.f185605f
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x08c9
            te3.kv2 r4 = new te3.kv2
            r4.<init>()
            te3.j00 r5 = r3.ContentObj
            te3.tk1 r5 = r5.f298432p
            java.lang.String r5 = r5.f185605f
            r4.f298692g = r5
            r4.f298694i = r5
            r5 = 2
            r4.f298690e = r5
            r5 = 1
            r4.f298695j = r5
            te3.mv2 r6 = new te3.mv2
            r6.<init>()
            r4.f298698p = r6
            r4.f298693h = r5
            r5 = 0
            r6.f298875d = r5
            r6.f298876e = r5
            java.lang.String r5 = r11.getSnsId()
            r4.f298689d = r5
            com.tencent.mm.plugin.sns.model.o r17 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            java.lang.String r18 = r11.getSnsId()
            com.tencent.mm.plugin.sns.ui.TagImageView r5 = r1.f279982t
            android.app.Activity r6 = r0.f279904e
            int r21 = r6.hashCode()
            com.tencent.mm.storage.o3 r6 = com.tencent.p014mm.storage.C96983o3.m124651c()
            int r7 = r3.CreateTime
            r6.f284145b = r7
            r19 = r4
            r20 = r5
            r22 = r6
            r17.mo131101U(r18, r19, r20, r21, r22)
        L_0x08c9:
            te3.j00 r4 = r3.ContentObj
            te3.tk1 r4 = r4.f298432p
            java.lang.String r4 = r4.f185606g
            goto L_0x0b5e
        L_0x08d1:
            r5 = 44
            if (r12 != r5) goto L_0x0953
            te3.sk1 r5 = r10.f298440x
            if (r5 == 0) goto L_0x0b5e
            java.lang.String r9 = r5.f185424f
            com.tencent.mm.plugin.sns.ui.TagImageView r4 = r1.f279982t
            r5 = 0
            r4.setVisibility(r5)
            te3.j00 r4 = r3.ContentObj
            te3.sk1 r4 = r4.f298440x
            java.lang.String r4 = r4.f185427i
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0938
            te3.kv2 r4 = new te3.kv2
            r4.<init>()
            te3.j00 r5 = r3.ContentObj
            te3.sk1 r5 = r5.f298440x
            java.lang.String r5 = r5.f185427i
            r4.f298692g = r5
            r4.f298694i = r5
            r5 = 2
            r4.f298690e = r5
            r5 = 1
            r4.f298695j = r5
            te3.mv2 r6 = new te3.mv2
            r6.<init>()
            r4.f298698p = r6
            r4.f298693h = r5
            r5 = 0
            r6.f298875d = r5
            r6.f298876e = r5
            java.lang.String r5 = r11.getSnsId()
            r4.f298689d = r5
            com.tencent.mm.plugin.sns.model.o r17 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            java.lang.String r18 = r11.getSnsId()
            com.tencent.mm.plugin.sns.ui.TagImageView r5 = r1.f279982t
            android.app.Activity r6 = r0.f279904e
            int r21 = r6.hashCode()
            com.tencent.mm.storage.o3 r6 = com.tencent.p014mm.storage.C96983o3.m124651c()
            int r7 = r3.CreateTime
            r6.f284145b = r7
            r19 = r4
            r20 = r5
            r22 = r6
            r17.mo131101U(r18, r19, r20, r21, r22)
            goto L_0x094b
        L_0x0938:
            com.tencent.mm.plugin.sns.model.o r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.ui.TagImageView r5 = r1.f279982t
            r6 = 2131756337(0x7f100531, float:1.9143579E38)
            android.app.Activity r7 = r0.f279904e
            int r7 = r7.hashCode()
            r10 = -1
            r4.mo131095O(r5, r10, r6, r7)
        L_0x094b:
            te3.j00 r4 = r3.ContentObj
            te3.sk1 r4 = r4.f298440x
            java.lang.String r4 = r4.f185429n
            goto L_0x0b5e
        L_0x0953:
            r5 = 46
            if (r12 != r5) goto L_0x09ca
            te3.tk1 r5 = r10.f298442z
            if (r5 == 0) goto L_0x0b5e
            java.lang.String r9 = r5.f185603d
            com.tencent.mm.plugin.sns.ui.TagImageView r4 = r1.f279982t
            r5 = 0
            r4.setVisibility(r5)
            te3.j00 r4 = r3.ContentObj
            te3.tk1 r4 = r4.f298442z
            java.lang.String r4 = r4.f185605f
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x09b1
            te3.kv2 r4 = new te3.kv2
            r4.<init>()
            te3.j00 r5 = r3.ContentObj
            te3.tk1 r5 = r5.f298442z
            java.lang.String r5 = r5.f185605f
            r4.f298692g = r5
            r4.f298694i = r5
            r5 = 2
            r4.f298690e = r5
            r5 = 1
            r4.f298695j = r5
            te3.mv2 r6 = new te3.mv2
            r6.<init>()
            r4.f298698p = r6
            r4.f298693h = r5
            r5 = 0
            r6.f298875d = r5
            r6.f298876e = r5
            java.lang.String r5 = r11.getSnsId()
            r4.f298689d = r5
            com.tencent.mm.plugin.sns.ui.TagImageView r4 = r1.f279982t
            com.tencent.mm.ui.widget.QImageView$a r5 = com.tencent.p014mm.p136ui.widget.QImageView.C97274a.CENTER_CROP
            r4.setScaleType(r5)
            di3.d r4 = di3.C86312j.m106911c(r7)
            ht1.t1 r4 = (ht1.C60200t1) r4
            te3.j00 r5 = r3.ContentObj
            te3.tk1 r5 = r5.f298442z
            java.lang.String r5 = r5.f185605f
            com.tencent.mm.plugin.sns.ui.TagImageView r6 = r1.f279982t
            r4.mo76882tg(r5, r6)
            goto L_0x09c2
        L_0x09b1:
            com.tencent.mm.plugin.sns.model.o r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.ui.TagImageView r5 = r1.f279982t
            r6 = 2131234159(0x7f080d6f, float:1.8084476E38)
            int r7 = r25.hashCode()
            r10 = -1
            r4.mo131095O(r5, r10, r6, r7)
        L_0x09c2:
            te3.j00 r4 = r3.ContentObj
            te3.tk1 r4 = r4.f298442z
            java.lang.String r4 = r4.f185606g
            goto L_0x0b5e
        L_0x09ca:
            com.tencent.mm.plugin.sns.ui.TagImageView r5 = r1.f279982t
            r6 = 0
            r5.setVisibility(r6)
            com.tencent.mm.plugin.sns.model.o r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.ui.TagImageView r6 = r1.f279982t
            r7 = 2131755119(0x7f10006f, float:1.9141108E38)
            android.app.Activity r10 = r0.f279904e
            int r10 = r10.hashCode()
            r11 = -1
            r5.mo131095O(r6, r11, r7, r10)
            goto L_0x0b5e
        L_0x09e5:
            te3.p81 r10 = r10.f298435s
            if (r10 == 0) goto L_0x0b5e
            di3.d r7 = di3.C86312j.m106911c(r7)
            ht1.t1 r7 = (ht1.C60200t1) r7
            boolean r7 = r7.mo76873sF()
            if (r7 != 0) goto L_0x0a02
            di3.d r6 = di3.C86312j.m106911c(r6)
            h81.h r6 = (h81.C32735h) r6
            r7 = 0
            int r5 = r6.mo58779Qe(r5, r7)
            if (r5 != 0) goto L_0x0a4b
        L_0x0a02:
            te3.j00 r5 = r3.ContentObj
            te3.p81 r5 = r5.f298435s
            java.lang.String r5 = r5.f184781g
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x0a21
            te3.j00 r5 = r3.ContentObj
            te3.p81 r5 = r5.f298435s
            java.lang.String r5 = r5.f184782h
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0a21
            te3.j00 r5 = r3.ContentObj
            te3.p81 r5 = r5.f298435s
            java.lang.String r9 = r5.f184782h
            goto L_0x0a4b
        L_0x0a21:
            te3.j00 r5 = r3.ContentObj
            te3.p81 r5 = r5.f298435s
            java.lang.String r5 = r5.f184782h
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0a4d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            te3.j00 r6 = r3.ContentObj
            te3.p81 r6 = r6.f298435s
            java.lang.String r6 = r6.f184781g
            r5.append(r6)
            r5.append(r13)
            te3.j00 r6 = r3.ContentObj
            te3.p81 r6 = r6.f298435s
            java.lang.String r6 = r6.f184782h
            r5.append(r6)
            java.lang.String r9 = r5.toString()
        L_0x0a4b:
            r10 = 0
            goto L_0x0a63
        L_0x0a4d:
            android.app.Activity r5 = r0.f279904e
            r6 = 2131837139(0x7f1140d3, float:1.9307465E38)
            r7 = 1
            java.lang.Object[] r9 = new java.lang.Object[r7]
            te3.j00 r7 = r3.ContentObj
            te3.p81 r7 = r7.f298435s
            java.lang.String r7 = r7.f184781g
            r10 = 0
            r9[r10] = r7
            java.lang.String r5 = r5.getString(r6, r9)
            r9 = r5
        L_0x0a63:
            com.tencent.mm.plugin.sns.ui.TagImageView r5 = r1.f279982t
            r5.setVisibility(r10)
            te3.j00 r5 = r3.ContentObj
            te3.p81 r5 = r5.f298435s
            java.lang.String r5 = r5.f184783i
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0b5e
            te3.kv2 r5 = new te3.kv2
            r5.<init>()
            te3.j00 r6 = r3.ContentObj
            te3.p81 r6 = r6.f298435s
            java.lang.String r6 = r6.f184783i
            r5.f298692g = r6
            r5.f298694i = r6
            r6 = 2
            r5.f298690e = r6
            r6 = 1
            r5.f298695j = r6
            te3.mv2 r7 = new te3.mv2
            r7.<init>()
            r5.f298698p = r7
            r5.f298693h = r6
            te3.j00 r6 = r3.ContentObj
            te3.p81 r6 = r6.f298435s
            float r10 = r6.f184784j
            r7.f298875d = r10
            float r6 = r6.f184785n
            r7.f298876e = r6
            java.lang.String r6 = r11.getSnsId()
            r5.f298689d = r6
            com.tencent.mm.plugin.sns.model.o r15 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            java.lang.String r16 = r11.getSnsId()
            com.tencent.mm.plugin.sns.ui.TagImageView r6 = r1.f279982t
            android.app.Activity r7 = r0.f279904e
            int r19 = r7.hashCode()
            com.tencent.mm.storage.o3 r7 = com.tencent.p014mm.storage.C96983o3.m124651c()
            int r10 = r3.CreateTime
            r7.f284145b = r10
            r17 = r5
            r18 = r6
            r20 = r7
            r15.mo131101U(r16, r17, r18, r19, r20)
            goto L_0x0b5e
        L_0x0ac7:
            te3.tk1 r5 = r10.f298432p
            if (r5 == 0) goto L_0x0b5e
            android.app.Activity r4 = r0.f279904e
            r5 = 2131821537(0x7f1103e1, float:1.927582E38)
            java.lang.String r4 = r4.getString(r5)
            te3.j00 r5 = r3.ContentObj
            te3.tk1 r5 = r5.f298432p
            if (r5 == 0) goto L_0x0afa
            int r4 = r5.f185604e
            r6 = 1
            if (r4 != r6) goto L_0x0af6
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5 = 2131837140(0x7f1140d4, float:1.9307467E38)
            java.lang.Object[] r7 = new java.lang.Object[r6]
            te3.j00 r6 = r3.ContentObj
            te3.tk1 r6 = r6.f298432p
            java.lang.String r6 = r6.f185603d
            r9 = 0
            r7[r9] = r6
            java.lang.String r4 = r4.getString(r5, r7)
            goto L_0x0afb
        L_0x0af6:
            r9 = 0
            java.lang.String r4 = r5.f185603d
            goto L_0x0afb
        L_0x0afa:
            r9 = 0
        L_0x0afb:
            com.tencent.mm.plugin.sns.ui.TagImageView r5 = r1.f279982t
            r5.setVisibility(r9)
            te3.j00 r5 = r3.ContentObj
            te3.tk1 r5 = r5.f298432p
            java.lang.String r5 = r5.f185605f
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0b56
            te3.kv2 r5 = new te3.kv2
            r5.<init>()
            te3.j00 r6 = r3.ContentObj
            te3.tk1 r6 = r6.f298432p
            java.lang.String r6 = r6.f185605f
            r5.f298692g = r6
            r5.f298694i = r6
            r6 = 2
            r5.f298690e = r6
            r6 = 1
            r5.f298695j = r6
            te3.mv2 r7 = new te3.mv2
            r7.<init>()
            r5.f298698p = r7
            r5.f298693h = r6
            r6 = 0
            r7.f298875d = r6
            r7.f298876e = r6
            java.lang.String r6 = r11.getSnsId()
            r5.f298689d = r6
            com.tencent.mm.plugin.sns.model.o r17 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            java.lang.String r18 = r11.getSnsId()
            com.tencent.mm.plugin.sns.ui.TagImageView r6 = r1.f279982t
            android.app.Activity r7 = r0.f279904e
            int r21 = r7.hashCode()
            com.tencent.mm.storage.o3 r7 = com.tencent.p014mm.storage.C96983o3.m124651c()
            int r9 = r3.CreateTime
            r7.f284145b = r9
            r19 = r5
            r20 = r6
            r22 = r7
            r17.mo131101U(r18, r19, r20, r21, r22)
        L_0x0b56:
            te3.j00 r5 = r3.ContentObj
            te3.tk1 r5 = r5.f298432p
            java.lang.String r5 = r5.f185606g
            r9 = r4
            r4 = r5
        L_0x0b5e:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 != 0) goto L_0x0b72
            android.widget.TextView r5 = r1.f279986v
            r6 = 0
            r5.setVisibility(r6)
            android.widget.TextView r5 = r1.f279986v
            r5.setText(r4)
            r5 = 8
            goto L_0x0b79
        L_0x0b72:
            android.widget.TextView r4 = r1.f279986v
            r5 = 8
            r4.setVisibility(r5)
        L_0x0b79:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r4 != 0) goto L_0x0bf2
            android.widget.TextView r3 = r1.f279986v
            int r3 = r3.getVisibility()
            if (r3 != r5) goto L_0x0b94
            int r3 = r1.f279990x
            r4 = 2
            if (r3 == r4) goto L_0x0b91
            android.widget.TextView r3 = r1.f279988w
            r3.setMaxLines(r4)
        L_0x0b91:
            r1.f279990x = r4
            goto L_0x0ba0
        L_0x0b94:
            int r3 = r1.f279990x
            r4 = 1
            if (r3 == r4) goto L_0x0b9e
            android.widget.TextView r3 = r1.f279988w
            r3.setMaxLines(r4)
        L_0x0b9e:
            r1.f279990x = r4
        L_0x0ba0:
            android.widget.TextView r3 = r1.f279988w
            r4 = 0
            r3.setVisibility(r4)
            if (r8 == 0) goto L_0x0bb4
            android.widget.TextView r3 = r1.f279988w
            android.app.Activity r4 = r0.f279904e
            android.text.SpannableString r4 = vr2.C102236a0.m134766r(r9, r4, r3)
            r3.setText(r4)
            goto L_0x0bc7
        L_0x0bb4:
            android.widget.TextView r3 = r1.f279988w
            java.lang.Class<ny.h> r4 = p629ny.C76979h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ny.h r4 = (p629ny.C76979h) r4
            android.app.Activity r5 = r0.f279904e
            android.text.SpannableString r4 = r4.mo107057T1(r5, r9)
            r3.setText(r4)
        L_0x0bc7:
            android.widget.TextView r3 = r1.f279988w
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.app.Activity r5 = r0.f279904e
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131837016(0x7f114058, float:1.9307215E38)
            java.lang.String r5 = r5.getString(r6)
            r4.append(r5)
            r4.append(r14)
            android.widget.TextView r1 = r1.f279988w
            java.lang.CharSequence r1 = r1.getText()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.setContentDescription(r1)
            goto L_0x0c3c
        L_0x0bf2:
            r4 = r30
            r5 = 1
            if (r4 != r5) goto L_0x0c35
            android.widget.TextView r4 = r1.f279988w
            te3.j00 r3 = r3.ContentObj
            java.lang.String r3 = r3.f298426g
            java.lang.String r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter.m122253o(r3)
            r4.setText(r3)
            android.widget.TextView r3 = r1.f279988w
            r4 = 0
            r3.setVisibility(r4)
            android.widget.TextView r3 = r1.f279988w
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.app.Activity r5 = r0.f279904e
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131837016(0x7f114058, float:1.9307215E38)
            java.lang.String r5 = r5.getString(r6)
            r4.append(r5)
            r4.append(r14)
            android.widget.TextView r1 = r1.f279988w
            java.lang.CharSequence r1 = r1.getText()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.setContentDescription(r1)
            goto L_0x0c3c
        L_0x0c35:
            android.widget.TextView r1 = r1.f279988w
            r3 = 8
            r1.setVisibility(r3)
        L_0x0c3c:
            r1 = 2
            r0.mo133391g(r2, r1)
            r1 = r23
            r2 = r24
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.item.C95928l.mo81015o(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.w6, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter):void");
    }

    /* renamed from: t */
    public String mo81016t() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.OtherTimeLineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.OtherTimeLineItem");
        return "OtherTimeLineItem";
    }
}
