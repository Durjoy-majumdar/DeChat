package p738wg;

import android.database.Cursor;
import com.tencent.p014mm.autogen.events.ExtCursorForTimeLineEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import jr2.C33651p;
import jr2.C99019x;
import os2.C100400e0;

/* renamed from: wg.a */
public class C102434a extends IStaticListener<ExtCursorForTimeLineEvent> {
    public boolean callback(IEvent iEvent) {
        ExtCursorForTimeLineEvent extCursorForTimeLineEvent = (ExtCursorForTimeLineEvent) iEvent;
        if (C99019x.m128973e() == null) {
            return true;
        }
        ExtCursorForTimeLineEvent.C92493b bVar = extCursorForTimeLineEvent.f264753e;
        C33651p e = C99019x.m128973e();
        String str = extCursorForTimeLineEvent.f264752d.f264754a;
        C100400e0 e0Var = (C100400e0) e;
        e0Var.getClass();
        SnsMethodCalculate.markStartTimeMs("getCursorForTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        e0Var.P50();
        String str2 = "select *,rowid from SnsInfo  where  (sourceType & 2 != 0 ) ";
        if (e0Var.zs0(str)) {
            str2 = str2 + " AND " + e0Var.mo139827nP(str);
        }
        String str3 = str2 + C100400e0.f294096o;
        Log.m105918d("MicroMsg.SnsInfoStorage", "getCursorForTimeLine " + str3);
        Cursor rawQuery = e0Var.f294108d.rawQuery(str3, (String[]) null);
        SnsMethodCalculate.markEndTimeMs("getCursorForTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        bVar.f264755a = rawQuery;
        return true;
    }
}
