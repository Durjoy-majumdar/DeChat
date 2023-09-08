package p570iy;

import com.tencent.p014mm.app.C114661d0;
import com.tencent.p014mm.autogen.events.RemoveSnsTaskEvent;
import com.tencent.p014mm.autogen.events.TrigerAdReportEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import f40.C86709a0;
import f40.C86718e;

/* renamed from: iy.g */
public class C33437g extends C114661d0.C28676a {
    public void onAppBackground(String str) {
        SnsMethodCalculate.markStartTimeMs("onAppBackground", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListener");
        if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
            C86709a0.m107523b();
            if (!C86718e.m107551r()) {
                RemoveSnsTaskEvent removeSnsTaskEvent = new RemoveSnsTaskEvent();
                removeSnsTaskEvent.f78916d.f78917a = 0;
                removeSnsTaskEvent.publish();
                new TrigerAdReportEvent().publish();
            }
        }
        SnsMethodCalculate.markEndTimeMs("onAppBackground", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListener");
    }

    public void onAppForeground(String str) {
        SnsMethodCalculate.markStartTimeMs("onAppForeground", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListener");
        if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
            C86709a0.m107523b();
            if (!C86718e.m107551r()) {
                RemoveSnsTaskEvent removeSnsTaskEvent = new RemoveSnsTaskEvent();
                removeSnsTaskEvent.f78916d.f78917a = 1;
                removeSnsTaskEvent.publish();
            }
        }
        SnsMethodCalculate.markEndTimeMs("onAppForeground", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListener");
    }
}
