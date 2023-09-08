package com.tencent.p014mm.plugin.sns.p104ad.timeline.feedback.p1078ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup */
public class FeedbackContentViewGroup extends ViewGroup {

    /* renamed from: d */
    public List<C94726a> f274153d;

    /* renamed from: e */
    public int f274154e;

    /* renamed from: com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup$a */
    public static class C94726a {

        /* renamed from: a */
        public int f274155a;

        /* renamed from: b */
        public int f274156b;

        /* renamed from: c */
        public boolean f274157c;
    }

    public FeedbackContentViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo130391a(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayoutInner", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        List<C94726a> list = this.f274153d;
        int childCount = getChildCount();
        int i5 = this.f274154e;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (C94726a aVar : list) {
            int i9 = aVar.f274155a;
            int i15 = 0;
            int i16 = 0;
            while (i15 < i9 && i6 < childCount) {
                View childAt = getChildAt(i6);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                childAt.layout(i16, i7, measuredWidth + i16, measuredHeight + i7);
                i6++;
                i16 += measuredWidth + i5;
                i15++;
                i8 = measuredHeight;
            }
            i7 += i8 + i5;
        }
        SnsMethodCalculate.markEndTimeMs("onLayoutInner", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
    }

    /* renamed from: b */
    public final void mo130392b(int i, int i2) {
        C94726a aVar;
        SnsMethodCalculate.markStartTimeMs("onMeasureInner", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        measureChildren(i, i2);
        int i3 = this.f274154e;
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        SnsMethodCalculate.markStartTimeMs("initRows", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        ((LinkedList) this.f274153d).clear();
        for (int i4 = 0; i4 < childCount; i4++) {
            List<C94726a> list = this.f274153d;
            SnsMethodCalculate.markStartTimeMs("newRow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup$Row");
            C94726a aVar2 = new C94726a();
            aVar2.f274155a = 0;
            aVar2.f274156b = measuredWidth;
            aVar2.f274157c = false;
            SnsMethodCalculate.markEndTimeMs("newRow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup$Row");
            ((LinkedList) list).add(aVar2);
        }
        SnsMethodCalculate.markEndTimeMs("initRows", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int min = Math.min(childAt.getMeasuredWidth(), measuredWidth);
            SnsMethodCalculate.markStartTimeMs("findRowWithSufficientWidth", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
            Iterator<C94726a> it = this.f274153d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    SnsMethodCalculate.markEndTimeMs("findRowWithSufficientWidth", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
                    break;
                }
                aVar = it.next();
                if (aVar != null && !aVar.f274157c) {
                    if (aVar.f274156b >= min) {
                        SnsMethodCalculate.markEndTimeMs("findRowWithSufficientWidth", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
                        break;
                    }
                    aVar.f274157c = true;
                }
            }
            if (aVar != null) {
                aVar.f274155a++;
                aVar.f274156b -= min + i3;
            }
            if (i5 == 0) {
                i5 = childAt.getMeasuredHeight();
            }
        }
        SnsMethodCalculate.markStartTimeMs("removeInvalidRow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        Iterator<C94726a> it4 = this.f274153d.iterator();
        while (it4.hasNext()) {
            C94726a next = it4.next();
            if (next == null || next.f274155a == 0) {
                it4.remove();
            }
        }
        SnsMethodCalculate.markEndTimeMs("removeInvalidRow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        int size = ((LinkedList) this.f274153d).size();
        int i7 = i5 * size;
        if (size > 1) {
            i7 += (size - 1) * i3;
        }
        setMeasuredDimension(measuredWidth, i7);
        SnsMethodCalculate.markEndTimeMs("onMeasureInner", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        try {
            mo130391a(z, i, i2, i3, i4);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
    }

    public void onMeasure(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        super.onMeasure(i, i2);
        try {
            mo130392b(i, i2);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
    }

    public FeedbackContentViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f274153d = new LinkedList();
        try {
            SnsMethodCalculate.markStartTimeMs("initialize", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
            this.f274154e = C76577a.m92151b(getContext(), 12);
            SnsMethodCalculate.markEndTimeMs("initialize", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackContentViewGroup");
        } catch (Throwable unused) {
        }
    }
}
