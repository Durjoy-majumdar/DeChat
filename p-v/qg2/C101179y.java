package qg2;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.Iterator;
import java.util.LinkedList;
import ng2.C100113c;
import og2.C100336e;
import og2.C100340i;
import og2.C100341k;
import og2.C100343m;
import og2.C100344n;
import og2.C100346q;
import p749xh.C66261f3;
import te3.C101834rc0;

/* renamed from: qg2.y */
public class C101179y implements C100343m {
    /* renamed from: i1 */
    public void mo139619i1(int i, C100344n nVar) {
        boolean z;
        C100346q qVar;
        C100344n nVar2;
        C101153n0 Bx0 = ((C100113c) C86312j.m106911c(C100113c.class)).mo139409NS();
        Bx0.getClass();
        Class cls = C100336e.class;
        if (1 != i) {
            Log.m105929w("MicroMsg.RecordMsgSendService", "on cdn storage changed, but not care type %d", Integer.valueOf(i));
        } else if (nVar == null) {
            Log.m105928w("MicroMsg.RecordMsgSendService", "on cdn storage changed, but cdninfo is null");
        } else if (2 != nVar.field_type) {
            Log.m105929w("MicroMsg.RecordMsgSendService", "on cdn storage changed, but cdninfo type is not upload , mediaid:%s, recordLocalId:%d, status:%d", nVar.field_mediaId, Integer.valueOf(nVar.field_recordLocalId), Integer.valueOf(nVar.field_status));
        } else {
            int i2 = nVar.field_status;
            if (i2 == 0 || 1 == i2 || -1 == i2) {
                Log.m105928w("MicroMsg.RecordMsgSendService", "on cdn storage changed, but not care status");
                return;
            }
            C100340i hi = ((C100336e) C86312j.m106911c(cls)).mo139410hi();
            int i3 = nVar.field_recordLocalId;
            C101136b0 b0Var = (C101136b0) hi;
            b0Var.getClass();
            LinkedList<C100344n> linkedList = new LinkedList<>();
            Cursor rawQuery = b0Var.f296032d.rawQuery("SELECT * FROM RecordCDNInfo WHERE recordLocalId = " + i3, (String[]) null, 2);
            if (rawQuery != null) {
                while (rawQuery.moveToNext()) {
                    C100344n nVar3 = new C100344n();
                    nVar3.convertFrom(rawQuery);
                    linkedList.add(nVar3);
                }
                rawQuery.close();
            }
            Log.m105919d("MicroMsg.RecordMsgCDNStorage", "get all finish, result count %d", Integer.valueOf(linkedList.size()));
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                nVar2 = (C100344n) it.next();
                int i4 = nVar2.field_status;
                if (i4 != 0 && 1 != i4) {
                    if (-1 == i4) {
                        break;
                    }
                } else {
                    Log.m105929w("MicroMsg.RecordMsgSendService", "on cdn storage changed, but %s not finish", nVar2.field_mediaId);
                    z = false;
                }
            }
            Log.m105929w("MicroMsg.RecordMsgSendService", "on cdn storage changed, but %s not finish", nVar2.field_mediaId);
            z = false;
            Log.m105925i("MicroMsg.RecordMsgSendService", "on cdn storage changed cdnInfoList.size:%d,", Integer.valueOf(linkedList.size()));
            if (z) {
                C100341k k102 = ((C100336e) C86312j.m106911c(cls)).k10();
                int i5 = nVar.field_recordLocalId;
                C101143h0 h0Var = (C101143h0) k102;
                h0Var.getClass();
                String str = "SELECT * FROM RecordMessageInfo WHERE localId=" + i5 + "";
                Log.m105919d("MicroMsg.RecordMsgStorage", "get by local id, sql[%s], local[%d]", str, Integer.valueOf(i5));
                Cursor rawQuery2 = h0Var.f296046d.rawQuery(str, (String[]) null, 2);
                if (rawQuery2 == null || !rawQuery2.moveToFirst()) {
                    qVar = null;
                } else {
                    qVar = new C100346q();
                    qVar.convertFrom(rawQuery2);
                }
                if (rawQuery2 != null) {
                    rawQuery2.close();
                }
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(nVar.field_recordLocalId);
                objArr[1] = Boolean.valueOf(qVar != null);
                Log.m105925i("MicroMsg.RecordMsgSendService", "finish get record info, id %d result %B", objArr);
                if (qVar != null) {
                    LinkedList<C101834rc0> linkedList2 = qVar.field_dataProto.f298618f;
                    for (C100344n nVar4 : linkedList) {
                        Log.m105927v("MicroMsg.RecordMsgSendService", "check dataid[%s] isThumb[%B]", nVar4.field_dataId, Boolean.valueOf(nVar4.field_isThumb));
                        if (nVar4.field_isThumb) {
                            Bx0.mo140598e(nVar4, linkedList2, 1);
                        } else {
                            Bx0.mo140597d(nVar4, linkedList2, 1);
                        }
                    }
                    Bx0.mo140595b(qVar, true);
                }
                for (C100344n Lo : linkedList) {
                    ((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).delete(Lo, C66261f3.COL_LOCALID);
                }
                Bx0.f296071d = false;
                Bx0.mo140599f((C100346q) null, false);
            }
        }
    }
}
