package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.ClassifyHeader */
public class ClassifyHeader extends LinearLayout {

    /* renamed from: d */
    public Context f21166d;

    /* renamed from: e */
    public TextView f21167e;

    public ClassifyHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo6434a(context);
    }

    /* renamed from: a */
    public final void mo6434a(Context context) {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.ClassifyHeader");
        this.f21166d = context;
        View inflate = View.inflate(context, C0966R.C0971layout.f7001ul, this);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.fmt);
        this.f21167e = (TextView) inflate.findViewById(C0966R.C0970id.eun);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.ClassifyHeader");
    }

    public void setDesc(String str) {
        SnsMethodCalculate.markStartTimeMs("setDesc", "com.tencent.mm.plugin.sns.ui.ClassifyHeader");
        TextView textView = this.f21167e;
        textView.setText(str + "");
        SnsMethodCalculate.markEndTimeMs("setDesc", "com.tencent.mm.plugin.sns.ui.ClassifyHeader");
    }

    public ClassifyHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo6434a(context);
    }
}
