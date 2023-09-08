package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;

/* renamed from: com.tencent.mm.plugin.sns.ui.AtContactWidget$$c */
public class AtContactWidget$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AtContactWidget f276687d;

    public AtContactWidget$$c(AtContactWidget atContactWidget) {
        this.f276687d = atContactWidget;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.AtContactWidget$2");
        int i = (int) (BitmapUtil.getDefaultDisplayMetrics().density * 36.0f);
        if (i != 0) {
            AtContactWidget atContactWidget = this.f276687d;
            int i2 = AtContactWidget.f276675p;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            View view = atContactWidget.f276677e;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            int width = view.getWidth();
            AtContactWidget atContactWidget2 = this.f276687d;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            WeImageView weImageView = atContactWidget2.f276678f;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            int width2 = width - weImageView.getWidth();
            AtContactWidget atContactWidget3 = this.f276687d;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            TextView textView = atContactWidget3.f276680h;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            int width3 = ((width2 - textView.getWidth()) - ((int) (BitmapUtil.getDefaultDisplayMetrics().density * 32.0f))) / i;
            if (width3 > 0 && width3 < 5) {
                AtContactWidget atContactWidget4 = this.f276687d;
                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
                PreviewContactView previewContactView = atContactWidget4.f276681i;
                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
                previewContactView.setLineNum(width3);
                AtContactWidget atContactWidget5 = this.f276687d;
                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
                PreviewContactView previewContactView2 = atContactWidget5.f276681i;
                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
                AtContactWidget atContactWidget6 = this.f276687d;
                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
                PreviewContactView previewContactView3 = atContactWidget6.f276681i;
                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
                previewContactView3.setLayoutParams((LinearLayout.LayoutParams) previewContactView2.getLayoutParams());
            }
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.AtContactWidget$2");
    }
}
