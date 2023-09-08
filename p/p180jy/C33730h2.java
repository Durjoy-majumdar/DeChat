package p180jy;

import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.SnsPermissionNotifyEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import xr2.C38817a;

/* renamed from: jy.h2 */
public class C33730h2 extends IStaticListener<SnsPermissionNotifyEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListener");
        SnsPermissionNotifyEvent snsPermissionNotifyEvent = (SnsPermissionNotifyEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListener");
        SnsPermissionNotifyEvent.C40168a aVar = snsPermissionNotifyEvent.f107766d;
        if (aVar == null || !aVar.f107767a || TextUtils.isEmpty(aVar.f107769c)) {
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListener");
        } else {
            SnsPermissionNotifyEvent.C40168a aVar2 = snsPermissionNotifyEvent.f107766d;
            if (!aVar2.f107770d) {
                C38817a.f104665a.remove(aVar2.f107769c);
            } else {
                C38817a.f104665a.add(aVar2.f107769c);
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListener");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListener");
        return false;
    }
}
