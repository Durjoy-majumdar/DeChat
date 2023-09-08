package p697tm;

import com.tencent.p014mm.autogen.events.AppBrandResetAllServiceUnreadCountEvent;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: tm.q0 */
public class C37179q0 extends IStaticListener<AppBrandResetAllServiceUnreadCountEvent> {
    public boolean callback(IEvent iEvent) {
        AppBrandResetAllServiceUnreadCountEvent appBrandResetAllServiceUnreadCountEvent = (AppBrandResetAllServiceUnreadCountEvent) iEvent;
        if (!C86709a0.m107522a()) {
            return false;
        }
        Log.m105925i("MicroMsg.AppBrandCommonKVDataStorage", "sql:%s, updateRet : %b", "update AppBrandCommonKVData set value = '0' where key like '%_unreadCount'", Boolean.valueOf(C81161g2.m99451h1().f100817d.execSQL("AppBrandCommonKVData", "update AppBrandCommonKVData set value = '0' where key like '%_unreadCount'")));
        return true;
    }
}
