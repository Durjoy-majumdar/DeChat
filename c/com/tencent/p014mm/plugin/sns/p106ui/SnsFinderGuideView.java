package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsFinderGuideView */
public class SnsFinderGuideView extends RelativeLayout {

    /* renamed from: d */
    public static final /* synthetic */ int f116603d = 0;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsFinderGuideView$a */
    public class C43083a implements View.OnClickListener {
        public C43083a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsFinderGuideView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsFinderGuideView$1");
            SnsFinderGuideView snsFinderGuideView = SnsFinderGuideView.this;
            int i = SnsFinderGuideView.f116603d;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsFinderGuideView");
            snsFinderGuideView.getClass();
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsFinderGuideView");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsFinderGuideView$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsFinderGuideView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsFinderGuideView$b */
    public interface C43084b {
        /* renamed from: a */
        void mo67284a();
    }

    public SnsFinderGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo67281a();
    }

    /* renamed from: a */
    public final void mo67281a() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsFinderGuideView");
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.c2z, this);
        ((Button) findViewById(C0966R.C0970id.jt_)).setOnClickListener(new C43083a());
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsFinderGuideView");
    }

    public void setOnFinishDialogViewCallback(C43084b bVar) {
        SnsMethodCalculate.markStartTimeMs("setOnFinishDialogViewCallback", "com.tencent.mm.plugin.sns.ui.SnsFinderGuideView");
        SnsMethodCalculate.markEndTimeMs("setOnFinishDialogViewCallback", "com.tencent.mm.plugin.sns.ui.SnsFinderGuideView");
    }

    public SnsFinderGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo67281a();
    }
}
