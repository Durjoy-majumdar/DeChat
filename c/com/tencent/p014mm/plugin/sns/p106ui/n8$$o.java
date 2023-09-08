package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import j20.C117292a;
import java.util.ArrayList;
import te3.d05;

/* renamed from: com.tencent.mm.plugin.sns.ui.n8$$o */
public class n8$$o implements View.OnClickListener {
    public n8$$o(C96085n8 n8Var) {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$20");
        Log.m105924i("MicroMsg.TimeLineClickEvent", "appbrandHomeRedirectListener");
        if (!(view.getTag() instanceof TimeLineObject)) {
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$20");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        TimeLineObject timeLineObject = (TimeLineObject) view.getTag();
        d05 d05 = timeLineObject.weappInfo;
        if (d05 == null) {
            Log.m105920e("MicroMsg.TimeLineClickEvent", "appbrandRedirectListener username is null");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$20");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        String str = d05.f298070d;
        StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
        Log.m105924i("MicroMsg.TimeLineClickEvent", "username: " + str);
        StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
        aVar.f9526a = str;
        aVar.f9529d = 1009;
        aVar.f9530e = timeLineObject.f283893Id + XVFSFile.PATH_SEPARATOR + timeLineObject.UserName;
        startAppBrandUIFromOuterEvent.publish();
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$20");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
