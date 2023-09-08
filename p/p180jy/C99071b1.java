package p180jy;

import android.database.Cursor;
import com.tencent.p014mm.autogen.events.MusicActionEvent;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import os2.C100400e0;
import p652pu.C100910b;

/* renamed from: jy.b1 */
public class C99071b1 extends IStaticListener<MusicActionEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.MusicActionListener");
        MusicActionEvent musicActionEvent = (MusicActionEvent) iEvent;
        Class cls = C100910b.class;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.MusicActionListener");
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.MusicActionListener", "MusicActionEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.MusicActionListener");
        } else {
            if (musicActionEvent instanceof MusicActionEvent) {
                int i = musicActionEvent.f264920d.f264922a;
                if (i == -6) {
                    C100400e0 Yx0 = C94866e1.Yx0();
                    String str = musicActionEvent.f264920d.f264923b.f295977y;
                    boolean equals = C75592q0.m90789s().equals(musicActionEvent.f264920d.f264923b.f295977y);
                    Yx0.getClass();
                    SnsMethodCalculate.markStartTimeMs("getUserMusicTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                    Cursor rawQuery = Yx0.f294108d.rawQuery("select *,rowid from SnsInfo " + Yx0.mo139802Ow(str, equals) + " AND (" + "type" + " = " + 4 + " OR " + "type" + " = " + 42 + ")", (String[]) null, 2);
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        SnsInfo snsInfo = new SnsInfo();
                        snsInfo.convertFrom(rawQuery);
                        arrayList.add(snsInfo);
                    }
                    rawQuery.close();
                    SnsMethodCalculate.markEndTimeMs("getUserMusicTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                    musicActionEvent.f264921e.f264932c = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        musicActionEvent.f264921e.f264932c.add(((C100910b) C86312j.m106911c(cls)).Qn0(C94866e1.xx0(), ((SnsInfo) it.next()).getTimeLine(), 8));
                    }
                } else if (i == -5) {
                    C100400e0 Yx02 = C94866e1.Yx0();
                    Yx02.getClass();
                    SnsMethodCalculate.markStartTimeMs("getAllMusicTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                    Cursor rawQuery2 = Yx02.f294108d.rawQuery("select *,rowid from SnsInfo where (type = 4 ORtype = 42) AND  (sourceType & 2 != 0 ) " + C100400e0.f294096o, (String[]) null, 2);
                    ArrayList arrayList2 = new ArrayList();
                    while (rawQuery2.moveToNext()) {
                        SnsInfo snsInfo2 = new SnsInfo();
                        snsInfo2.convertFrom(rawQuery2);
                        arrayList2.add(snsInfo2);
                    }
                    rawQuery2.close();
                    SnsMethodCalculate.markEndTimeMs("getAllMusicTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                    musicActionEvent.f264921e.f264932c = new ArrayList();
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        musicActionEvent.f264921e.f264932c.add(((C100910b) C86312j.m106911c(cls)).Qn0(C94866e1.xx0(), ((SnsInfo) it4.next()).getTimeLine(), 1));
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.MusicActionListener");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.MusicActionListener");
        return false;
    }
}
