package com.tencent.p014mm.plugin.sns.p104ad.widget.stackup;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout */
public class StackUpLayout extends FrameLayout {

    /* renamed from: d */
    public int f274523d = 0;

    /* renamed from: e */
    public int f274524e = 0;

    /* renamed from: f */
    public int f274525f = 0;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout$a */
    public interface C94784a {
    }

    public StackUpLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f1 A[Catch:{ all -> 0x0130 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0107 A[Catch:{ all -> 0x0130 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0108 A[ADDED_TO_REGION, Catch:{ all -> 0x0130 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setAdapterInternal(com.tencent.p014mm.plugin.sns.p104ad.widget.stackup.StackUpLayout.C94784a r14) {
        /*
            r13 = this;
            java.lang.String r0 = "setAdapterInternal"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = 8
            if (r14 == 0) goto L_0x0141
            oq2.c r14 = (oq2.C100376c) r14
            int r3 = r14.mo139653b()
            if (r3 != 0) goto L_0x0016
            goto L_0x0141
        L_0x0016:
            int r3 = r13.getChildCount()
            int r4 = r14.mo139653b()
            int r5 = r13.f274524e
            int r6 = r4 * r5
            int r7 = r4 + -1
            int r8 = r13.f274523d
            int r7 = r7 * r8
            int r6 = r6 - r7
            if (r6 >= r5) goto L_0x0032
            r13.setVisibility(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x0032:
            android.view.ViewGroup$LayoutParams r2 = r13.getLayoutParams()
            if (r2 == 0) goto L_0x003f
            int r5 = r2.width
            if (r5 == r6) goto L_0x0048
            r2.width = r6
            goto L_0x0048
        L_0x003f:
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r5 = -2
            r2.<init>(r6, r5)
            r13.setLayoutParams(r2)
        L_0x0048:
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper"
            r5 = 1
            if (r3 >= r4) goto L_0x00b9
            int r4 = r4 - r3
        L_0x004e:
            if (r4 <= 0) goto L_0x00c3
            android.content.Context r3 = r13.getContext()
            int r6 = r13.f274524e
            int r7 = r13.f274525f
            java.lang.String r8 = "newView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r2)
            com.tencent.mm.ui.widget.RoundCornerImageView r9 = new com.tencent.mm.ui.widget.RoundCornerImageView
            r9.<init>(r3)
            android.view.ViewGroup$LayoutParams r10 = new android.view.ViewGroup$LayoutParams
            r10.<init>(r6, r7)
            r9.setLayoutParams(r10)
            android.widget.ImageView$ScaleType r10 = android.widget.ImageView.ScaleType.FIT_XY
            r9.setScaleType(r10)
            int r10 = kg3.C76577a.m92151b(r3, r5)
            android.content.res.Resources r3 = r3.getResources()
            r11 = 2131099650(0x7f060002, float:1.781166E38)
            int r3 = r3.getColor(r11)
            r9.mo104340q(r10, r3)
            r9.f220448f = r6
            r9.f220449g = r7
            r3 = 2131234927(0x7f08106f, float:1.8086034E38)
            r9.setBackgroundResource(r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r2)
            int r3 = r13.getChildCount()
            java.lang.String r6 = "onNewView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r1)
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            int r8 = r13.f274524e
            int r10 = r13.f274525f
            r7.<init>(r8, r10)
            int r8 = r13.f274524e
            int r8 = r8 * r3
            int r10 = r13.f274523d
            int r3 = r3 * r10
            int r8 = r8 - r3
            r7.leftMargin = r8
            r9.setLayoutParams(r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r1)
            r13.addView(r9)
            int r4 = r4 + -1
            goto L_0x004e
        L_0x00b9:
            if (r3 <= r4) goto L_0x00c3
        L_0x00bb:
            if (r3 <= r4) goto L_0x00c3
            int r3 = r3 + -1
            r13.removeViewAt(r3)
            goto L_0x00bb
        L_0x00c3:
            r3 = 0
            r4 = 0
        L_0x00c5:
            int r6 = r13.getChildCount()
            if (r4 >= r6) goto L_0x013d
            android.view.View r6 = r13.getChildAt(r4)
            java.lang.String r7 = "fillChildView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r2)
            co2.k r8 = r14.f293993b     // Catch:{ all -> 0x0130 }
            if (r8 != 0) goto L_0x00dc
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r2)
            goto L_0x013a
        L_0x00dc:
            java.util.List<java.lang.String> r8 = r8.f264543e     // Catch:{ all -> 0x0130 }
            int[] r9 = r14.f293994c     // Catch:{ all -> 0x0130 }
            if (r8 == 0) goto L_0x00ee
            r10 = r8
            java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch:{ all -> 0x0130 }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x0130 }
            if (r10 == 0) goto L_0x00ec
            goto L_0x00ee
        L_0x00ec:
            r10 = 0
            goto L_0x00ef
        L_0x00ee:
            r10 = 1
        L_0x00ef:
            if (r10 != 0) goto L_0x012c
            java.lang.String r10 = "isEmpty"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)     // Catch:{ all -> 0x0130 }
            if (r9 == 0) goto L_0x0101
            int r12 = r9.length     // Catch:{ all -> 0x0130 }
            if (r12 != 0) goto L_0x00ff
            goto L_0x0101
        L_0x00ff:
            r12 = 0
            goto L_0x0102
        L_0x0101:
            r12 = 1
        L_0x0102:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)     // Catch:{ all -> 0x0130 }
            if (r12 == 0) goto L_0x0108
            goto L_0x012c
        L_0x0108:
            if (r4 < 0) goto L_0x0137
            int r10 = r9.length     // Catch:{ all -> 0x0130 }
            if (r4 >= r10) goto L_0x0137
            r10 = r9[r4]     // Catch:{ all -> 0x0130 }
            if (r10 < 0) goto L_0x0137
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x0130 }
            int r11 = r8.size()     // Catch:{ all -> 0x0130 }
            if (r10 >= r11) goto L_0x0137
            boolean r10 = r6 instanceof android.widget.ImageView     // Catch:{ all -> 0x0130 }
            if (r10 == 0) goto L_0x0137
            r9 = r9[r4]     // Catch:{ all -> 0x0130 }
            java.lang.Object r8 = r8.get(r9)     // Catch:{ all -> 0x0130 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0130 }
            android.widget.ImageView r6 = (android.widget.ImageView) r6     // Catch:{ all -> 0x0130 }
            r9 = 2
            rq2.C101419f.m133081d(r8, r6, r9)     // Catch:{ all -> 0x0130 }
            goto L_0x0137
        L_0x012c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r2)
            goto L_0x013a
        L_0x0130:
            java.lang.String r6 = "SnsAd.Participants"
            java.lang.String r8 = "fillChildView error "
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r8)
        L_0x0137:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r2)
        L_0x013a:
            int r4 = r4 + 1
            goto L_0x00c5
        L_0x013d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x0141:
            r13.setVisibility(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.widget.stackup.StackUpLayout.setAdapterInternal(com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout$a):void");
    }

    public void setAdapter(C94784a aVar) {
        SnsMethodCalculate.markStartTimeMs("setAdapter", "com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout");
        try {
            setAdapterInternal(aVar);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("setAdapter", "com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout");
    }

    public void setStackUpWidthSize(int i) {
        SnsMethodCalculate.markStartTimeMs("setStackUpWidthSize", "com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout");
        this.f274523d = i;
        SnsMethodCalculate.markEndTimeMs("setStackUpWidthSize", "com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout");
    }

    public StackUpLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
