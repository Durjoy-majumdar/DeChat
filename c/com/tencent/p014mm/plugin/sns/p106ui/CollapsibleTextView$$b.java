package com.tencent.p014mm.plugin.sns.p106ui;

import android.widget.TextView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsPostDescPreloadTextView;

/* renamed from: com.tencent.mm.plugin.sns.ui.CollapsibleTextView$$b */
public class CollapsibleTextView$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CollapsibleTextView f276756d;

    public CollapsibleTextView$$b(CollapsibleTextView collapsibleTextView) {
        this.f276756d = collapsibleTextView;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView$1");
        SnsPostDescPreloadTextView snsPostDescPreloadTextView = this.f276756d.f276740f;
        if (snsPostDescPreloadTextView != null && (snsPostDescPreloadTextView.getTag() instanceof C96113p5)) {
            String str = ((C96113p5) this.f276756d.f276740f.getTag()).f280719a;
            CollapsibleTextView collapsibleTextView = this.f276756d;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
            String str2 = collapsibleTextView.f276749r;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
            if (str.equals(str2)) {
                this.f276756d.f276740f.setMaxLines(6);
                this.f276756d.f276742h.setVisibility(0);
                CollapsibleTextView collapsibleTextView2 = this.f276756d;
                TextView textView = collapsibleTextView2.f276742h;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
                String str3 = collapsibleTextView2.f276744j;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
                textView.setText(str3);
            }
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView$1");
    }
}
