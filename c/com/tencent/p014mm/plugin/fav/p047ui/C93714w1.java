package com.tencent.p014mm.plugin.fav.p047ui;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.ArrayList;
import pb1.C100718j1;
import pb1.C100755z;
import qb1.C101089b;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.fav.ui.w1 */
public class C93714w1 implements Runnable {
    public C93714w1(FavoriteIndexUI favoriteIndexUI) {
    }

    public void run() {
        Class cls = C100718j1.class;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = null;
        Cursor rawQuery = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).f302175d.rawQuery("select xml,edittime,ext,favProto,flag,fromUser,id,itemStatus,localId,localSeq,realChatName,sourceCreateTime,sourceId,sourceType,toUser,type,updateSeq,updateTime,tagProto,sessionId,datatotalsize,rowid from FavItemInfo where flag =  -1 and itemStatus = 0 ", (String[]) null, 2);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                ArrayList arrayList2 = new ArrayList();
                do {
                    C100755z zVar = new C100755z();
                    zVar.convertFrom(rawQuery);
                    arrayList2.add(zVar);
                } while (rawQuery.moveToNext());
                arrayList = arrayList2;
            }
            rawQuery.close();
        }
        if (arrayList != null) {
            Log.m105925i("MicroMsg.FavoriteIndexUI", "initInvalidFavItem getInvalid favitems , size = %d,start time = %s", Integer.valueOf(arrayList.size()), Long.valueOf(currentTimeMillis));
            if (arrayList.size() != 0) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C100755z zVar2 = (C100755z) arrayList.get(i);
                    ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142269jo(zVar2);
                    ((C101089b) ((C100718j1) C86312j.m106911c(cls)).mo128206Ve()).mo140541a(zVar2, "", 31, 2);
                }
                Log.m105925i("MicroMsg.FavoriteIndexUI", "initInvalidFavItem  cost time = %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
        }
    }
}
