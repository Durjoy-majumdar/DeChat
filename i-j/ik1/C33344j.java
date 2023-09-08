package ik1;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import eb0.C31543z5;
import gg1.C32444a;
import hg1.C32894h;
import ig1.C33320g;
import java.util.ArrayList;
import p749xh.C38616n3;

/* renamed from: ik1.j */
public class C33344j extends C32894h {

    /* renamed from: e */
    public final ISQLiteDatabase f90385e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33344j(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C33320g.f90338N, "FinderLiveNotifyExposureInfo", C38616n3.f103078v);
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C33320g.f90338N;
        this.f90385e = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public C33320g mo59079Lo(String str) {
        Cursor rawQuery = this.f90385e.rawQuery("select *, rowid from FinderLiveNotifyExposureInfo where revokeId = '" + str + "'", (String[]) null);
        C33320g gVar = new C33320g();
        gVar.field_revokeId = str;
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                gVar.convertFrom(rawQuery);
            }
            rawQuery.close();
        }
        return gVar;
    }

    /* renamed from: Yt */
    public void mo59080Yt(long j, int i) {
        C33320g jo = mo59081jo(j);
        Log.m105924i("MicroMsg.FinderLiveNotifyExposureInfoStorage", "updateLiveStatus ,msgId = " + j + ", liveStatus = " + i);
        if (jo.systemRowid != -1) {
            jo.field_liveStatus = i;
            updateNotify(jo, false, new String[0]);
        }
    }

    /* renamed from: jo */
    public C33320g mo59081jo(long j) {
        Cursor rawQuery = this.f90385e.rawQuery("select *, rowid from FinderLiveNotifyExposureInfo where msgId = " + j, (String[]) null);
        C33320g gVar = new C33320g();
        gVar.field_msgId = j;
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                gVar.convertFrom(rawQuery);
            }
            rawQuery.close();
        }
        return gVar;
    }

    public boolean od0(long j) {
        C33320g jo = mo59081jo(j);
        Log.m105924i("MicroMsg.FinderLiveNotifyExposureInfoStorage", "[delByMsgId] msgId = " + j + ",tipsId = " + jo.field_tipsId);
        long j2 = jo.systemRowid;
        if (j2 != -1) {
            return deleteNotify(j2, false);
        }
        return false;
    }

    /* renamed from: qq */
    public ArrayList<C33320g> mo59083qq() {
        ArrayList<C33320g> arrayList = new ArrayList<>();
        C32444a aVar = C32444a.f86121a;
        long intValue = (long) C32444a.f86144f2.mo60266n().intValue();
        Log.m105924i("MicroMsg.FinderLiveNotifyExposureInfoStorage", "[getLast48HourItem] duration = " + intValue);
        Cursor rawQuery = this.f90385e.rawQuery("select *, rowid from FinderLiveNotifyExposureInfo where insertTime > " + (((long) C31543z5.m39455e()) - intValue), (String[]) null);
        while (rawQuery.moveToNext()) {
            C33320g gVar = new C33320g();
            gVar.convertFrom(rawQuery);
            arrayList.add(gVar);
        }
        rawQuery.close();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(arrayList.get(i).field_tipsId);
            sb.append(",");
        }
        Log.m105924i("MicroMsg.FinderLiveNotifyExposureInfoStorage", "[getLast48HourItem] result = " + sb);
        return arrayList;
    }
}
