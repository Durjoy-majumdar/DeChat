package lg0;

import android.database.Cursor;
import com.tencent.p014mm.autogen.events.GetContactUsernameByMobileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import dg0.C75398e;
import hg0.C76168b;
import java.util.LinkedList;

/* renamed from: lg0.o */
public class C34250o extends IStaticListener<GetContactUsernameByMobileEvent> {
    public boolean callback(IEvent iEvent) {
        GetContactUsernameByMobileEvent getContactUsernameByMobileEvent = (GetContactUsernameByMobileEvent) iEvent;
        if (getContactUsernameByMobileEvent instanceof GetContactUsernameByMobileEvent) {
            String str = getContactUsernameByMobileEvent.f78816d.f78818a;
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.GetUsernameByMobileListener", "hy: mobile number is null");
            } else {
                C76168b vx02 = C75398e.vx0();
                vx02.getClass();
                Cursor rawQuery = vx02.f223157c.rawQuery("select addr_upload2.username from addr_upload2 where addr_upload2.moblie = " + str, (String[]) null, 2);
                LinkedList linkedList = new LinkedList();
                while (rawQuery.moveToNext()) {
                    linkedList.add(rawQuery.getString(0));
                }
                rawQuery.close();
                String str2 = linkedList.size() == 0 ? "" : (String) linkedList.get(0);
                Log.m105925i("MicroMsg.GetUsernameByMobileListener", "hy: username: %s", str2);
                getContactUsernameByMobileEvent.f78817e.f78819a = str2;
            }
        }
        return false;
    }
}
