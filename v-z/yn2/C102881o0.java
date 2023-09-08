package yn2;

import android.database.Cursor;
import com.tencent.p014mm.autogen.events.RecentlySnsMediaObjEvent;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import os2.C100400e0;
import te3.C101804kv2;

/* renamed from: yn2.o0 */
public class C102881o0 extends IStaticListener<RecentlySnsMediaObjEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
        RecentlySnsMediaObjEvent recentlySnsMediaObjEvent = (RecentlySnsMediaObjEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
        boolean z = true;
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.RecentlySnsMediaObjListener", "RecentlySnsMediaObjEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
        } else if (!(recentlySnsMediaObjEvent instanceof RecentlySnsMediaObjEvent)) {
            Log.m105922f("MicroMsg.RecentlySnsMediaObjListener", "mismatched event");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
        } else {
            LinkedList linkedList = new LinkedList();
            RecentlySnsMediaObjEvent.C92549b bVar = recentlySnsMediaObjEvent.f265009e;
            bVar.f265011a = null;
            bVar.f265012b = null;
            bVar.f265013c = null;
            bVar.f265014d = null;
            Log.m105924i("MicroMsg.RecentlySnsMediaObjListener", "recently username " + recentlySnsMediaObjEvent.f265008d.f265010a);
            if (Util.isNullOrNil(recentlySnsMediaObjEvent.f265008d.f265010a)) {
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
            } else {
                C86709a0.m107528h();
                boolean equals = recentlySnsMediaObjEvent.f265008d.f265010a.equals((String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null));
                C100400e0 Yx0 = C94866e1.Yx0();
                String str = recentlySnsMediaObjEvent.f265008d.f265010a;
                Yx0.getClass();
                SnsMethodCalculate.markStartTimeMs("getUserNewerInfo", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                String str2 = ("select *,rowid from SnsInfo " + Yx0.mo139802Ow(str, equals)) + " AND type in ( 1 , 15)" + C100400e0.f294096o + " limit " + 4;
                Log.m105918d("MicroMsg.SnsInfoStorage", "getUserNewerInfo " + str2);
                Cursor rawQuery = Yx0.f294108d.rawQuery(str2, (String[]) null);
                SnsMethodCalculate.markEndTimeMs("getUserNewerInfo", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                if (rawQuery == null) {
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
                } else if (!rawQuery.moveToFirst()) {
                    rawQuery.close();
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
                } else {
                    int i = 0;
                    do {
                        SnsInfo snsInfo = new SnsInfo();
                        snsInfo.convertFrom(rawQuery);
                        if (snsInfo.getTypeFlag() != 21) {
                            Iterator<C101804kv2> it = snsInfo.getTimeLine().ContentObj.f298427h.iterator();
                            while (it.hasNext()) {
                                C101804kv2 next = it.next();
                                int i2 = next.f298690e;
                                if (i2 == 2 || i2 == 6) {
                                    i++;
                                    linkedList.add(next);
                                    if (i >= 4) {
                                        break;
                                    }
                                }
                            }
                        }
                    } while (rawQuery.moveToNext());
                    rawQuery.close();
                    if (linkedList.size() > 0) {
                        recentlySnsMediaObjEvent.f265009e.f265011a = (C101804kv2) linkedList.get(0);
                    }
                    if (linkedList.size() > 1) {
                        recentlySnsMediaObjEvent.f265009e.f265012b = (C101804kv2) linkedList.get(1);
                    }
                    if (linkedList.size() > 2) {
                        recentlySnsMediaObjEvent.f265009e.f265013c = (C101804kv2) linkedList.get(2);
                    }
                    if (linkedList.size() > 3) {
                        recentlySnsMediaObjEvent.f265009e.f265014d = (C101804kv2) linkedList.get(3);
                    }
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
                }
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
            return z;
        }
        z = false;
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListener");
        return z;
    }
}
