package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p214om.C11502f;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.m0 */
public class C96044m0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280455d;

    public C96044m0(TimelineClickListener timelineClickListener) {
        this.f280455d = timelineClickListener;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$7");
        if (!(view.getTag() instanceof String)) {
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$7");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        SnsInfo DN = C94866e1.Yx0().mo139798DN((String) view.getTag());
        if (DN == null) {
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$7");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else if (DN.isAd()) {
            Log.m105924i("MicroMsg.TimelineClickListener", "click the ad tailLink button");
            ADInfo l = TimelineClickListener.m122990l(this.f280455d, DN);
            if (l == null) {
                Log.m105920e("MicroMsg.TimelineClickListener", "the adInfo is null");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$7");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (Util.isNullOrNil(l.adActionExtTailLink)) {
                Log.m105920e("MicroMsg.TimelineClickListener", "the adActionExtTailLink is null");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$7");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                Log.m105924i("MicroMsg.TimelineClickListener", "open webview url : " + l.adActionExtTailLink);
                Intent intent = new Intent();
                intent.putExtra("jsapiargs", new Bundle());
                intent.putExtra("useJs", true);
                String b = C102236a0.m134734b(l.adActionExtTailLink, l.uxInfo);
                C102236a0.m134736c(intent, l.uxInfo);
                intent.putExtra("rawUrl", b);
                this.f280455d.mo133544m(intent);
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93190w(intent, TimelineClickListener.m122988j(this.f280455d));
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$7");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        } else {
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$7");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
