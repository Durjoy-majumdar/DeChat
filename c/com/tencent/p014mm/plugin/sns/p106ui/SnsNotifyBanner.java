package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsNotifyBanner */
public class SnsNotifyBanner extends RelativeLayout {

    /* renamed from: f */
    public static final /* synthetic */ int f116611f = 0;

    /* renamed from: d */
    public View f116612d;

    /* renamed from: e */
    public TextView f116613e;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsNotifyBanner$a */
    public class C43087a implements View.OnClickListener {
        public C43087a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsNotifyBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsNotifyBanner$1");
            SnsNotifyBanner.this.setVisibility(8);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsNotifyBanner$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsNotifyBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsNotifyBanner$b */
    public class C43088b implements View.OnClickListener {
        public C43088b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsNotifyBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsNotifyBanner$2");
            SnsNotifyBanner snsNotifyBanner = SnsNotifyBanner.this;
            int i = SnsNotifyBanner.f116611f;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsNotifyBanner");
            snsNotifyBanner.getClass();
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsNotifyBanner");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsNotifyBanner$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsNotifyBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsNotifyBanner$c */
    public interface C43089c {
        /* renamed from: a */
        void mo67290a();
    }

    public SnsNotifyBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo67286a();
    }

    /* renamed from: a */
    public final void mo67286a() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsNotifyBanner");
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0966R.C0971layout.c3s, this, true);
        this.f116612d = inflate;
        this.f116613e = (TextView) inflate.findViewById(C0966R.C0970id.jrq);
        ((ImageView) this.f116612d.findViewById(C0966R.C0970id.jrp)).setOnClickListener(new C43087a());
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsNotifyBanner");
    }

    public void setOnClickNotify(C43089c cVar) {
        SnsMethodCalculate.markStartTimeMs("setOnClickNotify", "com.tencent.mm.plugin.sns.ui.SnsNotifyBanner");
        this.f116613e.setOnClickListener(new C43088b());
        SnsMethodCalculate.markEndTimeMs("setOnClickNotify", "com.tencent.mm.plugin.sns.ui.SnsNotifyBanner");
    }

    public SnsNotifyBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo67286a();
    }
}
