package com.tencent.p014mm.storage;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.Iterator;
import java.util.LinkedList;
import te3.C52229z8;
import zh3.C91753f;

/* renamed from: com.tencent.mm.storage.o */
public class C30762o extends MAutoStorage<C30760n> {

    /* renamed from: e */
    public static final String[] f82714e = {MAutoStorage.getCreateSQLs(C30760n.f82711r, "BackupTempMoveTime")};

    /* renamed from: d */
    public ISQLiteDatabase f82715d;

    public C30762o(C91753f fVar) {
        super(fVar, C30760n.f82711r, "BackupTempMoveTime", (String[]) null);
        this.f82715d = fVar;
    }

    public boolean deleteAllData() {
        boolean execSQL = this.f82715d.execSQL("BackupTempMoveTime", "delete from BackupTempMoveTime");
        Log.m105925i("MicroMsg.BackupTempMoveTimeStorage", "deleteAllData, result:%b", Boolean.valueOf(execSQL));
        return execSQL;
    }

    /* renamed from: jo */
    public void mo57673jo(LinkedList<String> linkedList, LinkedList<Long> linkedList2, LinkedList<String> linkedList3, LinkedList<Long> linkedList4) {
        Iterator<String> it;
        Iterator<Long> it4;
        long j;
        boolean z;
        LinkedList<String> linkedList5 = linkedList3;
        LinkedList<Long> linkedList6 = linkedList4;
        if (getCount() <= 0) {
            linkedList5.addAll(linkedList);
            linkedList6.addAll(linkedList2);
            return;
        }
        LinkedList<String> linkedList7 = linkedList;
        LinkedList<Long> linkedList8 = linkedList2;
        Iterator<Long> it5 = linkedList2.iterator();
        Iterator<String> it6 = linkedList.iterator();
        while (it6.hasNext()) {
            String next = it6.next();
            if (it5.hasNext()) {
                long longValue = it5.next().longValue();
                if (!it5.hasNext()) {
                    break;
                }
                long longValue2 = it5.next().longValue();
                if (longValue2 == 0) {
                    longValue2 = MAlarmHandler.NEXT_FIRE_INTERVAL;
                }
                LinkedList linkedList9 = new LinkedList();
                String str = "SELECT * FROM BackupTempMoveTime WHERE sessionName = \"" + next + "\" ";
                Log.m105918d("MicroMsg.BackupTempMoveTimeStorage", "getTempMoveTimeBySession:" + str);
                Cursor rawQuery = this.f82715d.rawQuery(str, (String[]) null);
                if (rawQuery == null) {
                    Log.m105921e("MicroMsg.BackupTempMoveTimeStorage", "getTempMoveTimeBySession failed, sessionName:%s ", next);
                    linkedList9 = null;
                    j = longValue;
                } else {
                    while (rawQuery.moveToNext()) {
                        C30760n nVar = new C30760n();
                        nVar.convertFrom(rawQuery);
                        C52229z8 z8Var = new C52229z8();
                        z8Var.f145750d = nVar.field_startTime;
                        z8Var.f145751e = nVar.field_endTime;
                        linkedList9.add(z8Var);
                        longValue = longValue;
                    }
                    j = longValue;
                    rawQuery.close();
                }
                if (linkedList9 == null || linkedList9.size() <= 0 || longValue2 < ((C52229z8) linkedList9.getFirst()).f145750d || j > ((C52229z8) linkedList9.getLast()).f145751e) {
                    it = it6;
                    it4 = it5;
                    linkedList5.add(next);
                    linkedList6.add(Long.valueOf(j));
                    linkedList6.add(Long.valueOf(longValue2));
                } else {
                    long j2 = j;
                    boolean z2 = false;
                    int i = 0;
                    while (true) {
                        if (i >= linkedList9.size() || j2 > longValue2) {
                            it = it6;
                            it4 = it5;
                        } else {
                            C52229z8 z8Var2 = (C52229z8) linkedList9.get(i);
                            it = it6;
                            it4 = it5;
                            long j3 = z8Var2.f145751e;
                            if (j2 <= j3) {
                                long j4 = j3;
                                if (j2 < z8Var2.f145750d) {
                                    linkedList5.add(next);
                                    linkedList6.add(Long.valueOf(j2));
                                    long j5 = z8Var2.f145750d;
                                    if (longValue2 < j5) {
                                        linkedList6.add(Long.valueOf(longValue2));
                                        j2 = z8Var2.f145750d;
                                        z2 = true;
                                        break;
                                    }
                                    linkedList6.add(Long.valueOf(j5));
                                    j2 = z8Var2.f145751e;
                                    z2 = true;
                                } else {
                                    j2 = j4;
                                }
                            }
                            i++;
                            it5 = it4;
                            it6 = it;
                        }
                    }
                    if (j2 <= longValue2) {
                        linkedList5.add(next);
                        linkedList6.add(Long.valueOf(j2));
                        linkedList6.add(Long.valueOf(longValue2));
                        z = true;
                    } else {
                        z = z2;
                    }
                    if (!z) {
                        linkedList5.add(next);
                        linkedList6.add(Long.valueOf(j2));
                        linkedList6.add(Long.valueOf(longValue2));
                    }
                }
            } else {
                it = it6;
                it4 = it5;
            }
            it5 = it4;
            it6 = it;
        }
        Log.m105925i("MicroMsg.BackupTempMoveTimeStorage", "getSessionRequestTimeInteval, resultSession size:%s, resultTimeInterval:%s", Integer.valueOf(linkedList3.size()), Integer.valueOf(linkedList4.size()));
    }

    public boolean update(long j, IAutoDBItem iAutoDBItem) {
        return super.update(j, (C30760n) iAutoDBItem);
    }
}
