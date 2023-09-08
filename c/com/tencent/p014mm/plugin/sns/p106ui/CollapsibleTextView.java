package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsPostDescPreloadTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.view.x2c.X2CLinearLayout;
import de3.C75354a;
import de3.C75355a0;
import java.util.HashMap;
import kg3.C76577a;
import su2.C101702a;

/* renamed from: com.tencent.mm.plugin.sns.ui.CollapsibleTextView */
public class CollapsibleTextView extends X2CLinearLayout {

    /* renamed from: x */
    public static final /* synthetic */ int f276737x = 0;

    /* renamed from: d */
    public boolean f276738d = false;

    /* renamed from: e */
    public Context f276739e;

    /* renamed from: f */
    public SnsPostDescPreloadTextView f276740f;

    /* renamed from: g */
    public SnsTextView f276741g;

    /* renamed from: h */
    public TextView f276742h;

    /* renamed from: i */
    public boolean f276743i = true;

    /* renamed from: j */
    public String f276744j;

    /* renamed from: n */
    public String f276745n;

    /* renamed from: o */
    public MMHandler f276746o = new MMHandler(Looper.getMainLooper());

    /* renamed from: p */
    public HashMap<String, Integer> f276747p;

    /* renamed from: q */
    public String f276748q;

    /* renamed from: r */
    public String f276749r;

    /* renamed from: s */
    public int f276750s = 0;

    /* renamed from: t */
    public C96275w6 f276751t;

    /* renamed from: u */
    public C75354a f276752u;

    /* renamed from: v */
    public int f276753v;

    /* renamed from: w */
    public Runnable f276754w = new CollapsibleTextView$$b(this);

    public CollapsibleTextView(Context context) {
        super(context);
        this.f276739e = context;
        mo132114a();
    }

    /* renamed from: a */
    public final void mo132114a() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        this.f276744j = this.f276739e.getString(C0966R.string.jbo);
        this.f276745n = this.f276739e.getString(C0966R.string.jbn);
        if (C101702a.f297759b.mo141157a()) {
            SnsMethodCalculate.markStartTimeMs("inflateXml", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
            setPadding(0, -3, 0, 0);
            setOrientation(1);
            SnsTextView snsTextView = new SnsTextView(this.f276739e);
            this.f276741g = snsTextView;
            snsTextView.setId(C0966R.C0970id.c2i);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int b = C76577a.m92151b(this.f276739e, 1);
            layoutParams.topMargin = b;
            layoutParams.gravity = 16;
            int i = b * 2;
            int i2 = b * 3;
            this.f276741g.setPadding(i, i2, i, i2);
            this.f276741g.setMaxLines(1);
            this.f276741g.setTextColor(C76577a.m92153d(this.f276739e, C0966R.color.a7f));
            this.f276741g.setTextSize(0, (float) C76577a.m92164o(this.f276739e, C0966R.dimen.f3927j7));
            this.f276741g.setBackground(C76577a.m92158i(this.f276739e, C0966R.C0969drawable.atk));
            addView(this.f276741g, layoutParams);
            SnsPostDescPreloadTextView snsPostDescPreloadTextView = new SnsPostDescPreloadTextView(this.f276739e);
            this.f276740f = snsPostDescPreloadTextView;
            snsPostDescPreloadTextView.setId(C0966R.C0970id.c2h);
            this.f276740f.setBackground(C76577a.m92158i(this.f276739e, C0966R.C0969drawable.atx));
            this.f276740f.setTextColor(C76577a.m92153d(this.f276739e, C0966R.color.a7f));
            this.f276740f.f266765d.mo138747k(0, (float) C76577a.m92164o(this.f276739e, C0966R.dimen.f3927j7));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.topMargin = b;
            layoutParams2.gravity = 16;
            addView(this.f276740f, layoutParams2);
            TextView textView = new TextView(this.f276739e);
            this.f276742h = textView;
            textView.setId(C0966R.C0970id.c2e);
            this.f276742h.setBackground(C76577a.m92158i(this.f276739e, C0966R.C0969drawable.f357356at2));
            this.f276742h.setGravity(17);
            this.f276742h.setMaxLines(1);
            this.f276742h.setTextColor(C76577a.m92153d(this.f276739e, C0966R.color.a1d));
            this.f276742h.setTextSize(0, (float) C76577a.m92164o(this.f276739e, C0966R.dimen.f3927j7));
            this.f276741g.setTextSize(0, (float) C76577a.m92164o(this.f276739e, C0966R.dimen.f3927j7));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.topMargin = b * 4;
            addView(this.f276742h, layoutParams3);
            this.f276742h.setVisibility(8);
            SnsMethodCalculate.markEndTimeMs("inflateXml", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        } else {
            View inflate = C85868k2.m106137b(this.f276739e).inflate(C0966R.C0971layout.f7009ut, this);
            inflate.setPadding(0, -3, 0, 0);
            this.f276740f = (SnsPostDescPreloadTextView) inflate.findViewById(C0966R.C0970id.c2h);
            this.f276742h = (TextView) inflate.findViewById(C0966R.C0970id.c2e);
            this.f276741g = (SnsTextView) inflate.findViewById(C0966R.C0970id.c2i);
        }
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }

    /* renamed from: b */
    public void mo132115b(int i, CharSequence charSequence, TextView.BufferType bufferType, HashMap<String, Integer> hashMap, String str, String str2, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter, String str3, boolean z) {
        int i2 = i;
        CharSequence charSequence2 = charSequence;
        HashMap<String, Integer> hashMap2 = hashMap;
        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter2 = snsTimeLineBaseAdapter;
        boolean z2 = z;
        SnsMethodCalculate.markStartTimeMs("setText", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        this.f276739e = snsTimeLineBaseAdapter2.f278575i;
        this.f276747p = hashMap2;
        this.f276738d = z2;
        this.f276748q = str;
        this.f276749r = str2;
        this.f276750s = i2;
        this.f276740f.setCollapseibleMap(hashMap2);
        this.f276740f.setIsAd(z2);
        this.f276744j = this.f276739e.getString(C0966R.string.jbo);
        this.f276745n = this.f276739e.getString(C0966R.string.jbn);
        this.f276741g.setOriginText(str3);
        C96113p5 p5Var = new C96113p5(this.f276749r, this.f276748q, false, false, 1);
        p5Var.f280724f = this.f276751t.f281398y;
        if (i2 == 0) {
            this.f276740f.setText(charSequence2);
            this.f276741g.setVisibility(8);
            this.f276742h.setVisibility(0);
            this.f276740f.setVisibility(0);
            C75355a0 a0Var = new C75355a0(this.f276739e);
            a0Var.f221530q = new CollapsibleTextView$$a(this);
            C75354a aVar = this.f276752u;
            int i3 = this.f276753v;
            a0Var.f221527n = aVar;
            a0Var.f221528o = i3;
            a0Var.f221529p = 30;
            this.f276740f.setOnTouchListener(a0Var);
            this.f276740f.setTag(p5Var);
            if (hashMap.get(str) == null) {
                this.f276743i = false;
                this.f276742h.setVisibility(8);
                this.f276740f.setMaxLines(8);
                SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
                return;
            }
            this.f276743i = true;
            int intValue = hashMap.get(str).intValue();
            if (intValue == 0) {
                this.f276742h.setVisibility(8);
                SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
                return;
            } else if (intValue == 1) {
                this.f276740f.setMaxLines(6);
                this.f276742h.setVisibility(0);
                this.f276742h.setText(this.f276744j);
                SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
                return;
            } else if (intValue == 2) {
                this.f276740f.setMaxLines(Integer.MAX_VALUE);
                this.f276742h.setVisibility(0);
                this.f276742h.setText(this.f276745n);
            }
        } else {
            this.f276741g.setText(charSequence2, bufferType);
            this.f276741g.setTag(p5Var);
            this.f276741g.setVisibility(0);
            this.f276742h.setVisibility(8);
            this.f276740f.setVisibility(8);
            this.f276741g.setOnClickListener(snsTimeLineBaseAdapter2.f278572f.f280351G);
        }
        SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }

    public int getSpreadHeight() {
        SnsMethodCalculate.markStartTimeMs("getSpreadHeight", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        Log.m105924i("MicroMsg.CollapsibleTextView", "count:" + this.f276740f.getLineCount() + "  height:" + this.f276740f.getLineHeight());
        int lineCount = (this.f276740f.getLineCount() + -7) * this.f276740f.getLineHeight();
        SnsMethodCalculate.markEndTimeMs("getSpreadHeight", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        return lineCount;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        super.onLayout(z, i, i2, i3, i4);
        if (this.f276750s == 0 && !this.f276738d) {
            if (this.f276743i) {
                SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
                return;
            }
            this.f276743i = true;
            if (this.f276740f.getLineCount() <= 7) {
                this.f276747p.put(this.f276748q, 0);
            } else {
                this.f276747p.put(this.f276748q, 1);
                this.f276746o.post(this.f276754w);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }

    public void setClickable(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setClickable", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        this.f276742h.setClickable(z);
        this.f276741g.setClickable(z);
        this.f276740f.setClickable(z);
        super.setClickable(z);
        SnsMethodCalculate.markEndTimeMs("setClickable", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }

    public void setContentTextColor(int i) {
        SnsMethodCalculate.markStartTimeMs("setContentTextColor", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        this.f276740f.setTextColor(i);
        SnsMethodCalculate.markEndTimeMs("setContentTextColor", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }

    public void setLongClickable(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setLongClickable", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        this.f276742h.setLongClickable(z);
        this.f276741g.setLongClickable(z);
        this.f276740f.setLongClickable(z);
        super.setLongClickable(z);
        SnsMethodCalculate.markEndTimeMs("setLongClickable", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }

    public void setOpClickListener(View.OnClickListener onClickListener) {
        SnsMethodCalculate.markStartTimeMs("setOpClickListener", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        TextView textView = this.f276742h;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
        setOnClickListener(onClickListener);
        SnsMethodCalculate.markEndTimeMs("setOpClickListener", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }

    public void setShrinkOrSpreadListener(SnsPostDescPreloadTextView.C96303b bVar) {
        SnsMethodCalculate.markStartTimeMs("setShrinkOrSpreadListener", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        SnsPostDescPreloadTextView snsPostDescPreloadTextView = this.f276740f;
        if (snsPostDescPreloadTextView != null) {
            snsPostDescPreloadTextView.setShrinkOrSpreadListener(bVar);
        }
        SnsMethodCalculate.markEndTimeMs("setShrinkOrSpreadListener", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }

    public CollapsibleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f276739e = context;
        mo132114a();
    }
}
