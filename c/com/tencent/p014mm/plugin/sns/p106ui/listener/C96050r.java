package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.view.View;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI$$f0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import jv2.C99064d;
import os2.C100417r0;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.r */
public class C96050r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280460d;

    public C96050r(TimelineClickListener timelineClickListener) {
        this.f280460d = timelineClickListener;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$25");
        if (view.getTag() instanceof String) {
            String str = (String) view.getTag();
            Log.m105924i("MicroMsg.TimelineClickListener", "localId " + str);
            C94897n1.m120379q(C100417r0.m131424m(str));
            C94897n1.m120378p(C100417r0.m131424m(str));
            C94866e1.gy0().mo131192c();
            this.f280460d.mo132098s();
            if (TimelineClickListener.m122985g(this.f280460d) != null) {
                SnsTimeLineUI$$f0 snsTimeLineUI$$f0 = (SnsTimeLineUI$$f0) TimelineClickListener.m122985g(this.f280460d);
                snsTimeLineUI$$f0.getClass();
                SnsMethodCalculate.markStartTimeMs("onPostError", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$50");
                snsTimeLineUI$$f0.f278743a.mo93528H7().mo136934f(C99064d.class);
                SnsMethodCalculate.markEndTimeMs("onPostError", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$50");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$25");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
