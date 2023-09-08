package fw0;

import android.database.Cursor;
import com.tencent.p014mm.autogen.events.ExDeviceGetBoundDevicesEvent;
import com.tencent.p014mm.autogen.events.ExDeviceGetBoundIotDevicesEvent;
import com.tencent.p014mm.autogen.events.GetCardCountEvent;
import com.tencent.p014mm.autogen.events.OnAuthSyncEvent;
import com.tencent.p014mm.modelsimple.C81013m;
import com.tencent.p014mm.pluginsdk.model.app.C44550e0;
import com.tencent.p014mm.pluginsdk.model.app.C44579p;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.event.EventCenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75569c4;
import java.util.ArrayList;
import ld2.C46848g;
import pc0.C77064b0;
import qe3.C89625d;

/* renamed from: fw0.a */
public class C75799a implements Runnable {
    public C75799a(C75801b bVar) {
    }

    public void run() {
        C75569c4.m90660F("ver" + C89625d.f257841g);
        C44550e0 Bx0 = C72709y1.Bx0();
        Bx0.getClass();
        C44579p Bx02 = C46848g.Bx0();
        Bx02.getClass();
        Log.m105918d("MicroMsg.AppInfoStorage", "getNullOpenIdList, maxCount = -1");
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = Bx02.rawQuery("select appId from AppInfo where openId is NULL ", new String[0]);
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.AppInfoStorage", "get null cursor");
        } else {
            int count = rawQuery.getCount();
            if (count <= 0) {
                Log.m105928w("MicroMsg.AppInfoStorage", "getNullOpenIdList fail, cursor count = " + count);
                rawQuery.close();
            } else {
                if (rawQuery.moveToFirst()) {
                    while (!rawQuery.isAfterLast()) {
                        int columnIndex = rawQuery.getColumnIndex("appId");
                        if (columnIndex >= 0) {
                            String string = rawQuery.getString(columnIndex);
                            if (!Util.isNullOrNil(string)) {
                                arrayList.add(string);
                            }
                        }
                        rawQuery.moveToNext();
                    }
                }
                rawQuery.close();
            }
        }
        Bx0.mo69341b(arrayList);
        if (EventCenter.instance == null) {
            Log.m105920e("MicroMsg.BigBallAuthHandle", "EventPool is null.");
            return;
        }
        GetCardCountEvent getCardCountEvent = new GetCardCountEvent();
        getCardCountEvent.f78812d.f78813a = true;
        getCardCountEvent.publish();
        new ExDeviceGetBoundDevicesEvent().publish();
        ExDeviceGetBoundIotDevicesEvent exDeviceGetBoundIotDevicesEvent = new ExDeviceGetBoundIotDevicesEvent();
        exDeviceGetBoundIotDevicesEvent.f107447d.f107448a = true;
        exDeviceGetBoundIotDevicesEvent.publish();
        new OnAuthSyncEvent().publish();
        C81013m.m98919j1(true);
        C77064b0.yn0().mo182766j(3);
        Log.m105924i("MicroMsg.BigBallAuthHandle", "summerbadcr triggerSync bgfg after manual auth");
    }

    public String toString() {
        return super.toString() + "|onGYNetEnd2";
    }
}
