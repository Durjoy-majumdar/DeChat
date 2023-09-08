package gv2;

import android.widget.TextView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsComment2LinePreloadTextView;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsCommentCollapseLayout;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsCommentPreloadTextView;
import m40.C99786a;

/* renamed from: gv2.n */
public class C98240n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsCommentCollapseLayout f288029d;

    public C98240n(SnsCommentCollapseLayout snsCommentCollapseLayout) {
        this.f288029d = snsCommentCollapseLayout;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout$2");
        SnsCommentCollapseLayout snsCommentCollapseLayout = this.f288029d;
        int i = SnsCommentCollapseLayout.f281539j;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        TextView textView = snsCommentCollapseLayout.f281542f;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        textView.setVisibility(0);
        SnsCommentCollapseLayout.m123492b(this.f288029d).setLines(2);
        C99786a config = SnsCommentCollapseLayout.m123492b(this.f288029d).getConfig();
        int measuredWidth = this.f288029d.getMeasuredWidth();
        SnsCommentCollapseLayout snsCommentCollapseLayout2 = this.f288029d;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        TextView textView2 = snsCommentCollapseLayout2.f281542f;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        int measuredWidth2 = measuredWidth - textView2.getMeasuredWidth();
        SnsCommentCollapseLayout snsCommentCollapseLayout3 = this.f288029d;
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        int i2 = snsCommentCollapseLayout3.f281545i;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        config.f292460h = measuredWidth2 - i2;
        SnsComment2LinePreloadTextView b = SnsCommentCollapseLayout.m123492b(this.f288029d);
        SnsCommentCollapseLayout snsCommentCollapseLayout4 = this.f288029d;
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        CharSequence charSequence = snsCommentCollapseLayout4.f281544h;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        b.setText(charSequence);
        SnsCommentCollapseLayout.m123492b(this.f288029d).setVisibility(0);
        SnsCommentCollapseLayout snsCommentCollapseLayout5 = this.f288029d;
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        SnsCommentPreloadTextView snsCommentPreloadTextView = snsCommentCollapseLayout5.f281541e;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        snsCommentPreloadTextView.setVisibility(8);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout$2");
    }
}
