package p180jy;

import android.database.Cursor;
import com.tencent.p014mm.autogen.events.DumpSnsTableInfoEvent;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import os2.C100399d0;
import os2.C100408j0;

/* renamed from: jy.k */
public class C33738k extends IStaticListener<DumpSnsTableInfoEvent> {
    public boolean callback(IEvent iEvent) {
        int i;
        char c;
        int i2;
        char c2;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.DumpSnsTableInfoListener");
        DumpSnsTableInfoEvent dumpSnsTableInfoEvent = (DumpSnsTableInfoEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.DumpSnsTableInfoListener");
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.DumpSnsTableInfoListener", "DumpSnsTableInfoEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.DumpSnsTableInfoListener");
        } else {
            int i3 = C94866e1.f274866V;
            SnsMethodCalculate.markStartTimeMs("dumpTable", "com.tencent.mm.plugin.sns.model.SnsCore");
            Log.m105924i("MicroMsg.SnsCore", "dumptable");
            StringBuffer stringBuffer = new StringBuffer();
            long h302 = C94866e1.Yx0().h30();
            C100408j0 ay02 = C94866e1.ay0();
            ay02.getClass();
            SnsMethodCalculate.markStartTimeMs("getTableCount", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            long currentTimeMillis = System.currentTimeMillis();
            Cursor rawQuery = ay02.f294140d.rawQuery("select count(*) from SnsMedia", (String[]) null, 2);
            if (rawQuery.moveToFirst()) {
                c = 0;
                i = rawQuery.getInt(0);
            } else {
                c = 0;
                i = 0;
            }
            rawQuery.close();
            Object[] objArr = new Object[2];
            objArr[c] = Integer.valueOf(i);
            objArr[1] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
            Log.m105925i("MicroMsg.snsMediaStorage", "media table count %d passed %d", objArr);
            SnsMethodCalculate.markEndTimeMs("getTableCount", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            C100399d0 Xx0 = C94866e1.Xx0();
            Xx0.getClass();
            SnsMethodCalculate.markStartTimeMs("getTableCount", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            long currentTimeMillis2 = System.currentTimeMillis();
            Cursor rawQuery2 = Xx0.f294085e.rawQuery("select count(*) from snsExtInfo3", (String[]) null, 2);
            if (rawQuery2.moveToFirst()) {
                c2 = 0;
                i2 = rawQuery2.getInt(0);
            } else {
                c2 = 0;
                i2 = 0;
            }
            rawQuery2.close();
            Object[] objArr2 = new Object[2];
            objArr2[c2] = Integer.valueOf(i2);
            objArr2[1] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis2);
            Log.m105925i("MicroMsg.SnsExtStorage", "ext table count %d passed %d", objArr2);
            SnsMethodCalculate.markEndTimeMs("getTableCount", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            stringBuffer.append(" snscount " + h302);
            stringBuffer.append(" mediacount " + i);
            stringBuffer.append(" extcount " + i2);
            Log.m105924i("MicroMsg.SnsCore", "dump table " + stringBuffer.toString());
            SnsMethodCalculate.markEndTimeMs("dumpTable", "com.tencent.mm.plugin.sns.model.SnsCore");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.DumpSnsTableInfoListener");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.DumpSnsTableInfoListener");
        return false;
    }
}
