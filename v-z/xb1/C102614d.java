package xb1;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;
import p749xh.C102666r2;
import p749xh.C66261f3;
import pb1.C100703e0;
import pb1.C100734q;
import pb1.C100751w0;
import pb1.C100755z;
import pb1.C11883v0;
import te3.C101835rd0;

/* renamed from: xb1.d */
public class C102614d extends MAutoStorage<C100755z> implements C100751w0 {

    /* renamed from: d */
    public ISQLiteDatabase f302175d;

    public C102614d(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C100755z.f295169U0, "FavItemInfo", (String[]) null);
        this.f302175d = iSQLiteDatabase;
    }

    /* renamed from: DN */
    public boolean mo142260DN(C100755z zVar, String... strArr) {
        C101835rd0 rd02 = zVar.field_favProto.f298616d;
        if (rd02 != null) {
            int i = rd02.f299346d;
            if (i <= 0) {
                Log.m105929w("MicroMsg.Fav.FavItemInfoStorage", "update::favid %d favlocalid %d type %d, sourceTypeError %d", Integer.valueOf(zVar.field_id), Long.valueOf(zVar.field_localId), Integer.valueOf(zVar.field_type), Integer.valueOf(rd02.f299346d));
                rd02.mo141277m(1);
            } else {
                rd02.mo141277m(i);
            }
        }
        return super.updateNotify(zVar, false, strArr);
    }

    /* renamed from: LL */
    public boolean update(C100755z zVar, String... strArr) {
        C101835rd0 rd02 = zVar.field_favProto.f298616d;
        if (rd02 != null) {
            int i = rd02.f299346d;
            if (i <= 0) {
                Log.m105929w("MicroMsg.Fav.FavItemInfoStorage", "update::favid %d favlocalid %d type %d, sourceTypeError %d", Integer.valueOf(zVar.field_id), Long.valueOf(zVar.field_localId), Integer.valueOf(zVar.field_type), Integer.valueOf(rd02.f299346d));
                rd02.mo141277m(1);
            } else {
                rd02.mo141277m(i);
            }
        }
        C100734q.m131840c(zVar);
        boolean updateNotify = super.updateNotify(zVar, false, strArr);
        if (updateNotify) {
            doNotify(zVar.field_localId + "", 3, Long.valueOf(zVar.field_localId));
        }
        if (Log.isDebug()) {
            Log.m105919d("MicroMsg.Fav.FavItemInfoStorage", "update result[%B]" + Util.getStack(), Boolean.valueOf(updateNotify));
            zVar.mo140187q2("MicroMsg.Fav.FavItemInfoStorage", C100755z.f295171W0);
        } else {
            Log.m105925i("MicroMsg.Fav.FavItemInfoStorage", "update favItem localId:%s favId:%s ret:%s", Long.valueOf(zVar.field_localId), Integer.valueOf(zVar.field_id), Boolean.valueOf(updateNotify));
        }
        return updateNotify;
    }

    /* renamed from: Lo */
    public LinkedList<Integer> mo142262Lo(long j, int i) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        String str = "select id from FavItemInfo where updateTime >= " + j;
        if (i != -1) {
            str = str + " and type = " + i;
        }
        Cursor rawQuery = this.f302175d.rawQuery((str + " and updateSeq > localSeq") + " order by updateTime desc", (String[]) null, 2);
        if (rawQuery == null) {
            return linkedList;
        }
        while (rawQuery.moveToNext()) {
            linkedList.add(Integer.valueOf(rawQuery.getInt(0)));
        }
        rawQuery.close();
        return linkedList;
    }

    /* renamed from: Ow */
    public C100755z mo142263Ow(String str) {
        ISQLiteDatabase iSQLiteDatabase = this.f302175d;
        Cursor query = iSQLiteDatabase.query("FavItemInfo", (String[]) null, "sourceId=?", new String[]{"" + str}, (String) null, (String) null, (String) null, 2);
        if (query.moveToFirst()) {
            C100755z zVar = new C100755z();
            zVar.convertFrom(query);
            query.close();
            return zVar;
        }
        Log.m105929w("MicroMsg.Fav.FavItemInfoStorage", "klem getBySourceId:%s, no data", str);
        query.close();
        return null;
    }

    /* renamed from: SE */
    public ArrayList<C100755z> mo142264SE(List<Long> list, List<? extends C102666r2> list2, Set<Integer> set, C11883v0 v0Var, boolean z) {
        ArrayList<C100755z> arrayList = null;
        if (!(list == null || list.size() == 0 || list.size() > 20)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("select ");
            stringBuffer.append("xml,edittime,ext,favProto,flag,fromUser,id,itemStatus,localId,localSeq,realChatName,sourceCreateTime,sourceId,sourceType,toUser,type,updateSeq,updateTime,tagProto,sessionId,datatotalsize,rowid");
            stringBuffer.append(" from ");
            stringBuffer.append("FavItemInfo");
            stringBuffer.append(" where ");
            if (set != null && set.size() > 0) {
                stringBuffer.append("( 1=1");
                for (Integer append : set) {
                    stringBuffer.append(" and ");
                    stringBuffer.append("type");
                    stringBuffer.append(" != ");
                    stringBuffer.append(append);
                }
                stringBuffer.append(") and ");
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i == 0) {
                    stringBuffer.append("( ");
                }
                if (i == size - 1) {
                    stringBuffer.append(C66261f3.COL_LOCALID);
                    stringBuffer.append(" = ");
                    stringBuffer.append(list.get(i));
                    stringBuffer.append(" )");
                } else {
                    stringBuffer.append(C66261f3.COL_LOCALID);
                    stringBuffer.append(" = ");
                    stringBuffer.append(list.get(i));
                    stringBuffer.append(" or ");
                }
            }
            if (z) {
                stringBuffer.append("order by case FavItemInfo.");
                stringBuffer.append(C66261f3.COL_LOCALID);
                stringBuffer.append(" ");
                for (int i2 = 0; i2 < list.size(); i2++) {
                    stringBuffer.append(" when '");
                    stringBuffer.append(list.get(i2));
                    stringBuffer.append("' then ");
                    stringBuffer.append(i2);
                }
                stringBuffer.append(" end");
            } else {
                stringBuffer.append(" order by ");
                stringBuffer.append(C66261f3.COL_UPDATETIME);
                stringBuffer.append(" desc");
            }
            String stringBuffer2 = stringBuffer.toString();
            Log.m105919d("MicroMsg.Fav.FavItemInfoStorage", "get list by id list sql %s", stringBuffer2);
            Cursor rawQuery = this.f302175d.rawQuery(stringBuffer2, (String[]) null, 2);
            if (rawQuery == null) {
                return null;
            }
            if (rawQuery.moveToFirst()) {
                ArrayList<C100755z> arrayList2 = new ArrayList<>();
                do {
                    C100755z zVar = (list2 == null || list2.isEmpty()) ? new C100755z() : (C100755z) list2.remove(0);
                    try {
                        zVar.convertFrom(rawQuery);
                        if (v0Var == null || !((C100703e0) v0Var).mo140134c(zVar)) {
                            arrayList2.add(zVar);
                        } else {
                            Log.m105929w("MicroMsg.Fav.FavItemInfoStorage", "id[%d] type[%d] match filter", Integer.valueOf(zVar.field_id), Integer.valueOf(zVar.field_type));
                        }
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.Fav.FavItemInfoStorage", th, "convertfrom err", new Object[0]);
                    }
                } while (rawQuery.moveToNext());
                arrayList = arrayList2;
            }
            rawQuery.close();
        }
        return arrayList;
    }

    /* renamed from: TE */
    public List<C100755z> mo142265TE() {
        ArrayList arrayList = null;
        Cursor rawQuery = this.f302175d.rawQuery("select xml,edittime,ext,favProto,flag,fromUser,id,itemStatus,localId,localSeq,realChatName,sourceCreateTime,sourceId,sourceType,toUser,type,updateSeq,updateTime,tagProto,sessionId,datatotalsize,rowid from FavItemInfo where itemStatus=3 or itemStatus=6 or itemStatus=11 or itemStatus=14 or itemStatus=16 or itemStatus=18", (String[]) null, 2);
        if (rawQuery == null) {
            return null;
        }
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
        return arrayList;
    }

    /* renamed from: Yt */
    public C100755z mo142266Yt(long j) {
        ISQLiteDatabase iSQLiteDatabase = this.f302175d;
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.Fav.FavItemInfoStorage", "getBtLocalId, but db is null, return");
            return null;
        }
        Cursor query = iSQLiteDatabase.query("FavItemInfo", (String[]) null, "localId=?", new String[]{"" + j}, (String) null, (String) null, (String) null, 2);
        if (query.moveToFirst()) {
            C100755z zVar = new C100755z();
            try {
                zVar.convertFrom(query);
                query.close();
                return zVar;
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.Fav.FavItemInfoStorage", "getByLocalId convertFrom(cu) cause IlleagalStateException, return null");
                query.close();
                return null;
            }
        } else {
            Log.m105929w("MicroMsg.Fav.FavItemInfoStorage", "klem getByLocalId:%d, no data", Long.valueOf(j));
            query.close();
            return null;
        }
    }

    /* renamed from: bD */
    public int mo142267bD(int i) {
        try {
            Cursor rawQuery = this.f302175d.rawQuery("select count(*) from FavItemInfo where id>" + i, (String[]) null, 2);
            if (rawQuery == null) {
                return -1;
            }
            if (rawQuery.getCount() == 0) {
                rawQuery.close();
                return -1;
            }
            rawQuery.moveToNext();
            int i2 = rawQuery.getInt(0);
            rawQuery.close();
            return i2;
        } catch (Throwable th) {
            Log.m105928w("MicroMsg.Fav.FavItemInfoStorage", "getFavHomePosition failed with throwable: " + th.getMessage());
            return -1;
        }
    }

    /* renamed from: bF */
    public boolean mo142268bF(long j, int i) {
        String str = "select count(updateTime) from FavItemInfo where updateTime < " + j;
        if (i != -1) {
            str = str + " and type = " + i;
        }
        Cursor rawQuery = this.f302175d.rawQuery(str, (String[]) null, 2);
        if (rawQuery == null) {
            return true;
        }
        rawQuery.moveToFirst();
        if (rawQuery.getInt(0) == 0) {
            rawQuery.close();
            return true;
        }
        rawQuery.close();
        return false;
    }

    /* renamed from: jo */
    public void mo142269jo(C102666r2 r2Var) {
        Log.m105925i("MicroMsg.Fav.FavItemInfoStorage", "deleteItem itemLocalId:%s itemFavId:%s", Long.valueOf(r2Var.field_localId), Integer.valueOf(r2Var.field_id));
        this.f302175d.execSQL("FavItemInfo", "delete from FavItemInfo where localId = " + r2Var.field_localId);
        doNotify(r2Var.field_localId + "", 5, Long.valueOf(r2Var.field_localId));
    }

    /* renamed from: kD */
    public List<Long> mo142270kD() {
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.f302175d.rawQuery("select localId from FavItemInfo order by updateTime desc", (String[]) null, 2);
        if (rawQuery == null) {
            return arrayList;
        }
        if (rawQuery.getCount() == 0) {
            rawQuery.close();
            return arrayList;
        }
        while (rawQuery.moveToNext()) {
            arrayList.add(Long.valueOf(rawQuery.getLong(0)));
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: mI */
    public boolean insert(C100755z zVar) {
        if (Log.isDebug()) {
            Log.m105919d("MicroMsg.Fav.FavItemInfoStorage", "insert() called localId:%s " + Util.getStack(), Long.valueOf(zVar.field_localId));
        }
        Assert.assertTrue(zVar.field_localId > 0);
        if (zVar.field_favProto.mo141209b() != null) {
            C101835rd0 b = zVar.field_favProto.mo141209b();
            if (b.mo141271b() <= 0) {
                Log.m105929w("MicroMsg.Fav.FavItemInfoStorage", "insert::favid %d favlocalid %d type %d, sourceTypeError %d", Integer.valueOf(zVar.field_id), Long.valueOf(zVar.field_localId), Integer.valueOf(zVar.field_type), Integer.valueOf(b.mo141271b()));
                b.mo141277m(1);
            } else {
                b.mo141277m(b.mo141271b());
            }
        }
        C100734q.m131840c(zVar);
        boolean insertNotify = insertNotify(zVar, false);
        if (insertNotify) {
            doNotify(zVar.field_localId + "", 2, Long.valueOf(zVar.field_localId));
        }
        return insertNotify;
    }

    /* renamed from: mL */
    public void mo142272mL(int i, long j) {
        Log.m105925i("MicroMsg.Fav.FavItemInfoStorage", "setStatus status:%d localId:%d", Integer.valueOf(i), Long.valueOf(j));
        this.f302175d.execSQL("FavItemInfo", "update FavItemInfo set itemStatus = " + i + " where " + C66261f3.COL_LOCALID + " = " + j);
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("");
        doNotify(sb.toString());
    }

    /* renamed from: qq */
    public C100755z mo142273qq(long j) {
        Cursor rawQuery = this.f302175d.rawQuery("Select * from FavItemInfo where id = " + j, (String[]) null);
        if (rawQuery.getCount() != 0) {
            C100755z zVar = new C100755z();
            rawQuery.moveToFirst();
            try {
                zVar.convertFrom(rawQuery);
                rawQuery.close();
                return zVar;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Fav.FavItemInfoStorage", e, "", new Object[0]);
                Log.m105921e("MicroMsg.Fav.FavItemInfoStorage", "getByFavId(%d),info.convertFrom error", Long.valueOf(j));
                rawQuery.close();
                return null;
            }
        } else {
            Log.m105929w("MicroMsg.Fav.FavItemInfoStorage", "klem getByFavId:%d, no data", Long.valueOf(j));
            rawQuery.close();
            return null;
        }
    }
}
