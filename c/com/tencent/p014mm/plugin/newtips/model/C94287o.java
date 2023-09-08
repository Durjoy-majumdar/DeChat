package com.tencent.p014mm.plugin.newtips.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import eb0.C31543z5;
import gc2.C116945b;
import jc2.C117342b;

/* renamed from: com.tencent.mm.plugin.newtips.model.o */
public class C94287o implements Runnable {
    public C94287o(C57150p pVar) {
    }

    public void run() {
        Log.m105924i("MicroMsg.NewTips.NewTipsXMLConsumer", "consumeNewXml() batch delete expire data!!");
        C117342b xx02 = C116945b.xx0();
        long a = C31543z5.m39451a() / 1000;
        xx02.getClass();
        try {
            ISQLiteDatabase iSQLiteDatabase = xx02.f351291d;
            iSQLiteDatabase.delete("NewTipsInfo2", "disappearTime!=0 and disappearTime<?", new String[]{a + ""});
            ISQLiteDatabase iSQLiteDatabase2 = xx02.f351291d;
            iSQLiteDatabase2.delete("NewTipsInfo2", "disappearTime=0 and exposureTime!=0 and exposureDisappearTime<?", new String[]{a + ""});
        } catch (Exception e) {
            Log.m105921e("MicroMsg.NewTips.NewTipsInfoStorage", "deleteExpireData NewTipsInfo by dissappearTime [%s]", e.toString());
        }
    }
}
