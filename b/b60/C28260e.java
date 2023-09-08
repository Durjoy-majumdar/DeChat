package b60;

import android.database.Cursor;
import android.util.Pair;
import b60.C54427b;
import com.tencent.p014mm.p136ui.C57833e1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import f40.C86709a0;
import java.util.LinkedList;
import zh3.C91753f;

/* renamed from: b60.e */
public class C28260e extends MAutoStorage<C28259d> implements C54427b {

    /* renamed from: f */
    public static final String[] f77817f = {MAutoStorage.getCreateSQLs(C28259d.f77816z, "LiveTipsBar")};

    /* renamed from: g */
    public static Pair<String, Long> f77818g;

    /* renamed from: h */
    public static C28260e f77819h;

    /* renamed from: d */
    public ISQLiteDatabase f77820d;

    /* renamed from: e */
    public C54427b.C28258a f77821e;

    public C28260e(C91753f fVar) {
        super(fVar, C28259d.f77816z, "LiveTipsBar", (String[]) null);
        this.f77820d = fVar;
        long currentTimeMillis = System.currentTimeMillis();
        long beginTransaction = fVar.beginTransaction(Thread.currentThread().getId());
        long currentTimeMillis2 = System.currentTimeMillis();
        Log.m105919d("MicroMsg.LiveTipsBarStorage", "executeInitSQL:%s", "CREATE INDEX IF NOT EXISTS HostRoom ON LiveTipsBar ( hostRoomId )");
        fVar.execSQL("LiveTipsBar", "CREATE INDEX IF NOT EXISTS HostRoom ON LiveTipsBar ( hostRoomId )");
        Log.m105919d("MicroMsg.LiveTipsBarStorage", "build new index last time[%d]", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
        fVar.endTransaction(beginTransaction);
        Log.m105925i("MicroMsg.LiveTipsBarStorage", "executeInitSQL last time[%d]", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: jo */
    public static C28260e m38144jo() {
        C86709a0.m107528h();
        C86709a0.m107523b().mo121108c();
        if (f77819h == null) {
            f77819h = new C28260e(C86709a0.m107535s().f251811i);
        }
        return f77819h;
    }

    /* renamed from: Lo */
    public void mo55885Lo(String str) {
        Log.m105924i("MicroMsg.LiveTipsBarStorage", "resetVisitingLive");
        Pair<String, Long> pair = f77818g;
        if (pair != null && ((String) pair.first).equals(str)) {
            f77818g = null;
        }
        C54427b.C28258a aVar = this.f77821e;
        if (aVar != null) {
            ((C57833e1.C57834a) aVar).mo82259a(str);
        }
    }

    /* renamed from: O4 */
    public void mo55886O4(C54427b.C28258a aVar) {
        this.f77821e = aVar;
    }

    /* renamed from: Q */
    public LinkedList<C54426a> mo55887Q(String str) {
        String str2;
        LinkedList<C54426a> linkedList = new LinkedList<>();
        Pair<String, Long> pair = f77818g;
        if (pair == null || !((String) pair.first).equals(str)) {
            str2 = "SELECT * FROM LiveTipsBar WHERE hostRoomId = '" + str + "' ORDER BY " + "timeStamp";
        } else {
            str2 = "SELECT * FROM LiveTipsBar WHERE hostRoomId = '" + str + "' AND " + "liveId" + " != '" + f77818g.second + "' ORDER BY " + "timeStamp";
        }
        Log.m105919d("MicroMsg.LiveTipsBarStorage", "getTipsBarDataByHostRoomId:%s", str2);
        Cursor rawQuery = this.f77820d.rawQuery(str2, (String[]) null);
        if (rawQuery == null) {
            Log.m105921e("MicroMsg.LiveTipsBarStorage", "getTipsBarDataByHostRoomId failed, hostRoomId:%s", str);
            return linkedList;
        }
        while (rawQuery.moveToNext()) {
            C28259d dVar = new C28259d();
            dVar.convertFrom(rawQuery);
            linkedList.add(dVar);
        }
        rawQuery.close();
        return linkedList;
    }

    /* renamed from: R5 */
    public void mo55888R5(String str, long j, String str2, String str3, String str4, Boolean bool, long j2) {
        Log.m105925i("MicroMsg.LiveTipsBarStorage", "addLiveToTipsBar, hostRoomId:%s, liveId:%d", str, Long.valueOf(j));
        C28259d dVar = new C28259d();
        dVar.field_hostRoomId = str;
        dVar.field_liveId = j;
        dVar.field_liveName = str2;
        dVar.field_thumbUrl = str3;
        dVar.field_anchorUsername = str4;
        dVar.field_isSender = bool.booleanValue();
        dVar.field_timeStamp = j2;
        insert(dVar);
        C54427b.C28258a aVar = this.f77821e;
        if (aVar != null) {
            ((C57833e1.C57834a) aVar).mo82259a(dVar.field_hostRoomId);
        }
    }

    /* renamed from: d */
    public void mo55889d(long j) {
        String str;
        C54427b.C28258a aVar;
        String str2 = "SELECT * FROM LiveTipsBar WHERE liveId = '" + j + "'";
        boolean z = false;
        Log.m105919d("MicroMsg.LiveTipsBarStorage", "deleteByLiveId, liveId:%d, sql:%s", Long.valueOf(j), str2);
        Cursor rawQuery = this.f77820d.rawQuery(str2, (String[]) null);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                C28259d dVar = new C28259d();
                dVar.convertFrom(rawQuery);
                str = dVar.field_hostRoomId;
            } else {
                str = null;
            }
            rawQuery.close();
        } else {
            str = null;
        }
        ISQLiteDatabase iSQLiteDatabase = this.f77820d;
        StringBuilder sb = new StringBuilder();
        String str3 = "";
        sb.append(str3);
        sb.append(j);
        int delete = ((C91753f) iSQLiteDatabase).delete("LiveTipsBar", "liveId= ? ", new String[]{sb.toString()});
        Pair<String, Long> pair = f77818g;
        if (pair != null && ((Long) pair.second).longValue() == j) {
            f77818g = null;
        }
        if (delete < 0) {
            Log.m105921e("MicroMsg.LiveTipsBarStorage", "deleteByLiveId failed, result:%d", Integer.valueOf(delete));
        } else {
            Object[] objArr = new Object[3];
            objArr[0] = Long.valueOf(j);
            if (str != null) {
                str3 = str;
            }
            objArr[1] = str3;
            if (this.f77821e == null) {
                z = true;
            }
            objArr[2] = Boolean.valueOf(z);
            Log.m105925i("MicroMsg.LiveTipsBarStorage", "deleteByLiveId success, liveId:%d, hostRoomId:%s, liveTipsBarNotify null:%b", objArr);
        }
        if (str != null && (aVar = this.f77821e) != null) {
            ((C57833e1.C57834a) aVar).mo82259a(str);
        }
    }

    public boolean deleteAllData() {
        boolean execSQL = this.f77820d.execSQL("LiveTipsBar", "delete from LiveTipsBar");
        Log.m105925i("MicroMsg.LiveTipsBarStorage", "deleteAllData, result:%b", Boolean.valueOf(execSQL));
        return execSQL;
    }

    /* renamed from: v5 */
    public void mo55891v5(String str) {
        Pair<String, Long> pair = f77818g;
        if (pair != null && ((String) pair.first).equals(str)) {
            f77818g = null;
        }
        String[] strArr = {str};
        int delete = ((C91753f) this.f77820d).delete("LiveTipsBar", "hostRoomId= ? ", strArr);
        if (delete < 0) {
            Log.m105921e("MicroMsg.LiveTipsBarStorage", "deleteByHostRoomId failed, hostRoomId:%s, result%d", str, Integer.valueOf(delete));
            return;
        }
        Log.m105925i("MicroMsg.LiveTipsBarStorage", "deleteByHostRoomId, hostRoomId:%s, result%d", str, Integer.valueOf(delete));
    }
}
