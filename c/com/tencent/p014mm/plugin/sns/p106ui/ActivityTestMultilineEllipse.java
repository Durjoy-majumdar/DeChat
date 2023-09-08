package com.tencent.p014mm.plugin.sns.p106ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.ActivityTestMultilineEllipse */
public class ActivityTestMultilineEllipse extends HellActivity {

    /* renamed from: com.tencent.mm.plugin.sns.ui.ActivityTestMultilineEllipse$a */
    public class C106165a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ QTextView f316294d;

        public C106165a(ActivityTestMultilineEllipse activityTestMultilineEllipse, QTextView qTextView) {
            this.f316294d = qTextView;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/ActivityTestMultilineEllipse$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ActivityTestMultilineEllipse$1");
            if (this.f316294d.getIsExpanded()) {
                QTextView qTextView = this.f316294d;
                qTextView.getClass();
                SnsMethodCalculate.markStartTimeMs("collapse", "com.tencent.mm.plugin.sns.ui.QTextView");
                qTextView.f316304p = false;
                qTextView.requestLayout();
                qTextView.invalidate();
                SnsMethodCalculate.markEndTimeMs("collapse", "com.tencent.mm.plugin.sns.ui.QTextView");
            } else {
                QTextView qTextView2 = this.f316294d;
                qTextView2.getClass();
                SnsMethodCalculate.markStartTimeMs("expand", "com.tencent.mm.plugin.sns.ui.QTextView");
                qTextView2.f316304p = true;
                qTextView2.requestLayout();
                qTextView2.invalidate();
                SnsMethodCalculate.markEndTimeMs("expand", "com.tencent.mm.plugin.sns.ui.QTextView");
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ActivityTestMultilineEllipse$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/ActivityTestMultilineEllipse$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.ActivityTestMultilineEllipse");
        super.onCreate(bundle);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(-1);
        addContentView(linearLayout, new ViewGroup.LayoutParams(-1, -1));
        ScrollView scrollView = new ScrollView(this);
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.addView(scrollView);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout2.setOrientation(1);
        linearLayout2.setBackgroundColor(-1);
        scrollView.addView(linearLayout2);
        QTextView qTextView = new QTextView(this);
        qTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        qTextView.setEllipsis("...");
        qTextView.setEllipsisMore(" Read More!");
        qTextView.setText("This is some short text. It won't need to be ellipsized.");
        qTextView.setMaxLines(3);
        qTextView.setPadding(10, 10, 10, 10);
        qTextView.setBackgroundColor(-1786127);
        linearLayout2.addView(qTextView);
        QTextView qTextView2 = new QTextView(this);
        qTextView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        qTextView2.setEllipsis("...");
        qTextView2.setEllipsisMore(" Read More!");
        qTextView2.setMaxLines(3);
        qTextView2.setText("This is some longer text. It should wrap and then eventually be ellipsized once it gets way too long for the horizontal width of the current application screen. We should be fixed to max [N] lines height.");
        qTextView2.setPadding(10, 10, 10, 10);
        qTextView2.setBackgroundColor(-204878);
        qTextView2.setOnClickListener(new C106165a(this, qTextView2));
        linearLayout2.addView(qTextView2);
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.ActivityTestMultilineEllipse");
    }
}
