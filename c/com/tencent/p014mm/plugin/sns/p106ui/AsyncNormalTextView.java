package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.HashMap;
import p629ny.C76979h;
import zr2.C66976a;

/* renamed from: com.tencent.mm.plugin.sns.ui.AsyncNormalTextView */
public class AsyncNormalTextView extends CollapsibleTextView {

    /* renamed from: A */
    public SnsTimeLineBaseAdapter f276670A;

    /* renamed from: B */
    public BaseTimeLineItem.BaseViewHolder f276671B;

    /* renamed from: C */
    public int f276672C = 0;

    /* renamed from: y */
    public Context f276673y;

    /* renamed from: z */
    public String f276674z;

    public AsyncNormalTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f276673y = context;
    }

    /* renamed from: e */
    public void mo132052e() {
        CharSequence charSequence;
        String str;
        Class cls = C76979h.class;
        SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        if (!Util.isNullOrNil(this.f276674z)) {
            Log.m105925i("MicroMsg.AsyncNormalTextView", "buildContent: show , textType:%d", Integer.valueOf(this.f276672C));
            System.currentTimeMillis();
            setVisibility(0);
            if (this.f276672C == 1) {
                if (this.f276674z.length() > 100) {
                    str = this.f276674z.substring(0, 100) + "...";
                } else {
                    str = this.f276674z;
                }
                this.f276674z = str;
                CharSequence f = C66976a.m79134f(this.f276751t.f281367a.field_snsId, new SpannableStringBuilder(((C76979h) C86312j.m106911c(cls)).yp0(this.f276673y, this.f276674z, this.f276740f.getTextSize())), 0, 2);
                int i = this.f276672C;
                TextView.BufferType bufferType = TextView.BufferType.NORMAL;
                SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = this.f276670A;
                HashMap<String, Integer> hashMap = snsTimeLineBaseAdapter.f278584r;
                C96275w6 w6Var = this.f276751t;
                mo132115b(i, f, bufferType, hashMap, w6Var.f281381h, w6Var.f281382i, snsTimeLineBaseAdapter, this.f276674z, w6Var.f281391r);
            } else {
                CharSequence charSequence2 = null;
                C96275w6 w6Var2 = this.f276751t;
                if (w6Var2 != null) {
                    charSequence2 = w6Var2.f281375e;
                }
                if (charSequence2 == null) {
                    charSequence = C66976a.m79134f(this.f276751t.f281367a.field_snsId, new SpannableStringBuilder(((C76979h) C86312j.m106911c(cls)).yp0(this.f276673y, this.f276674z, this.f276740f.getTextSize())), 0, 2);
                } else {
                    charSequence = charSequence2;
                }
                C96275w6 w6Var3 = this.f276751t;
                if (w6Var3 != null) {
                    int i2 = this.f276672C;
                    TextView.BufferType bufferType2 = TextView.BufferType.SPANNABLE;
                    SnsTimeLineBaseAdapter snsTimeLineBaseAdapter2 = this.f276670A;
                    mo132115b(i2, charSequence, bufferType2, snsTimeLineBaseAdapter2.f278584r, w6Var3.f281381h, w6Var3.f281382i, snsTimeLineBaseAdapter2, this.f276674z, w6Var3.f281391r);
                }
            }
            C96275w6 w6Var4 = this.f276751t;
            C96113p5 p5Var = new C96113p5(w6Var4.f281382i, w6Var4.f281381h, false, false, 1);
            p5Var.f280724f = w6Var4.f281398y;
            this.f276740f.setTag(p5Var);
            SnsTextView snsTextView = this.f276741g;
            if (snsTextView != null) {
                snsTextView.setTag(p5Var);
            }
            BaseTimeLineItem.BaseViewHolder baseViewHolder = this.f276671B;
            SnsMethodCalculate.markStartTimeMs("bindOpTvCollapseHolder", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
            this.f276742h.setTag(baseViewHolder);
            SnsMethodCalculate.markEndTimeMs("bindOpTvCollapseHolder", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
            setTag(this.f276671B);
        }
        SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
    }

    public String getContent() {
        SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        String str = this.f276674z;
        SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        return str;
    }

    /* renamed from: i */
    public void mo132054i(String str, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter, int i, C96275w6 w6Var) {
        SnsMethodCalculate.markStartTimeMs("setContent", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        this.f276672C = i;
        this.f276674z = str;
        this.f276670A = snsTimeLineBaseAdapter;
        this.f276751t = w6Var;
        if (Util.isNullOrNil(str)) {
            setVisibility(8);
        }
        SnsMethodCalculate.markEndTimeMs("setContent", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        SnsMethodCalculate.markStartTimeMs("onInitializeAccessibilityNodeInfo", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f276674z);
        SnsMethodCalculate.markEndTimeMs("onInitializeAccessibilityNodeInfo", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        super.onLayout(z, i, i2, i3, i4);
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
    }

    public void onMeasure(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        super.onMeasure(i, i2);
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        SnsMethodCalculate.markStartTimeMs("onPopulateAccessibilityEvent", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(this.f276674z);
        SnsMethodCalculate.markEndTimeMs("onPopulateAccessibilityEvent", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
    }

    public void setContentWidth(int i) {
        SnsMethodCalculate.markStartTimeMs("setContentWidth", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        if (this.f276741g != null) {
            this.f276740f.setSpecialWidth(i);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, -2);
            this.f276741g.setLayoutParams(layoutParams);
            this.f276740f.setLayoutParams(layoutParams);
            this.f276742h.setLayoutParams(layoutParams);
        }
        SnsMethodCalculate.markEndTimeMs("setContentWidth", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
    }

    public void setShow(BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("setShow", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        this.f276671B = baseViewHolder;
        mo132052e();
        SnsMethodCalculate.markEndTimeMs("setShow", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
    }

    public AsyncNormalTextView(Context context) {
        super(context);
        this.f276673y = context;
    }
}
