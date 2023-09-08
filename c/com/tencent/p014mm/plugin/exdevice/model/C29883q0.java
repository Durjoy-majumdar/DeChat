package com.tencent.p014mm.plugin.exdevice.model;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import te3.C48689ab2;
import te3.C48759at2;
import z71.C39323f;
import z71.C39324g;

/* renamed from: com.tencent.mm.plugin.exdevice.model.q0 */
public class C29883q0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C48689ab2 f80967d;

    public C29883q0(C41154p0 p0Var, C48689ab2 ab22) {
        this.f80967d = ab22;
    }

    public void run() {
        Cursor query;
        boolean z;
        int i = this.f80967d.f130416d;
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EXDEVICE_BIND_IOT_DEVICE_COUNT_INT_SYNC, Integer.valueOf(i));
        LinkedList<C48759at2> linkedList = this.f80967d.f130417e;
        List<C39323f> jo = C41166r1.Ex0().mo62019jo();
        Log.m105925i("MicroMsg.exdevice.HardIotDeviceInfoStorage", "iotDevice old size = %d new size = %d", Integer.valueOf(((LinkedList) jo).size()), Integer.valueOf(linkedList.size()));
        for (C39323f next : jo) {
            Iterator<C48759at2> it = linkedList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f130758e.equals(next.field_deviceId)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                Log.m105925i("MicroMsg.exdevice.HardIotDeviceInfoStorage", "delete iot deviceId %s, deviceType %s ", next.field_deviceId, Integer.valueOf(next.field_deviceType));
                C41166r1.Ex0().delete(next, new String[0]);
            }
        }
        Iterator<C48759at2> it4 = linkedList.iterator();
        while (it4.hasNext()) {
            C48759at2 next2 = it4.next();
            C39324g Ex0 = C41166r1.Ex0();
            String str = next2.f130758e;
            Ex0.getClass();
            C39323f fVar = null;
            if (!Util.isNullOrNil(str) && (query = Ex0.f105719d.query("HardIotDeviceInfo", (String[]) null, "deviceId=?", new String[]{str}, (String) null, (String) null, (String) null, 2)) != null) {
                if (!query.moveToFirst()) {
                    Log.m105928w("MicroMsg.exdevice.HardIotDeviceInfoStorage", "get null with deviceId:" + str);
                    query.close();
                } else {
                    fVar = new C39323f();
                    fVar.convertFrom(query);
                    query.close();
                }
            }
            C39323f fVar2 = new C39323f();
            fVar2.field_deviceId = next2.f130758e;
            fVar2.field_deviceType = next2.f130757d;
            fVar2.field_iconUrl = next2.f130760g;
            fVar2.field_nickName = next2.f130759f;
            LinkedList<Integer> linkedList2 = next2.f130761h;
            StringBuffer stringBuffer = new StringBuffer();
            if (linkedList2 != null && linkedList2.size() > 0) {
                Iterator<Integer> it5 = linkedList2.iterator();
                while (it5.hasNext()) {
                    stringBuffer.append(it5.next());
                    stringBuffer.append(" ");
                }
                stringBuffer.trimToSize();
            }
            fVar2.field_supportMsgTypeList = stringBuffer.toString().replace(" ", ",");
            Log.m105925i("MicroMsg.exdevice.HardIotDeviceInfoStorage", "update deviceId %s, deviceType = %d, nickName = %s, supportMsgTypeList = %s ret = %b", fVar2.field_deviceId, Integer.valueOf(fVar2.field_deviceType), fVar2.field_nickName, fVar2.field_supportMsgTypeList, Boolean.valueOf(fVar == null ? C41166r1.Ex0().insert(fVar2) : C41166r1.Ex0().update(fVar2, new String[0])));
        }
    }
}
