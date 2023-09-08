package vx2;

import android.database.Cursor;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import gy3.C87412m;
import te3.C64459j13;

/* renamed from: vx2.r */
public final class C65902r extends MAutoStorage<MultiTaskInfo> {

    /* renamed from: e */
    public static final String[] f189465e = {MAutoStorage.getCreateSQLs(MultiTaskInfo.f162955x, "TaskBarInfo")};

    /* renamed from: d */
    public final ISQLiteDatabase f189466d;

    /* renamed from: vx2.r$a */
    public static final class C65903a {

        /* renamed from: a */
        public MultiTaskInfo f189467a;

        /* renamed from: b */
        public int f189468b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65902r(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, MultiTaskInfo.f162955x, "TaskBarInfo", (String[]) null);
        C87412m.m108594g(iSQLiteDatabase, "db");
        this.f189466d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public boolean insert(MultiTaskInfo multiTaskInfo) {
        C87412m.m108594g(multiTaskInfo, "item");
        Log.m105924i("MicroMsg.TaskBarStorage", "insert:" + multiTaskInfo.field_type + ' ' + multiTaskInfo.field_id + ' ' + multiTaskInfo.mo80305m2().f183752e);
        byte[] bArr = multiTaskInfo.field_data;
        if ((bArr != null ? bArr.length : 0) <= 0) {
            Log.m105928w("MicroMsg.TaskBarStorage", "empty data!");
        }
        boolean insertNotify = insertNotify(multiTaskInfo, false);
        doNotify(MStorageEventData.EventType.SINGLE, 2, multiTaskInfo);
        return insertNotify;
    }

    /* renamed from: jo */
    public final MultiTaskInfo mo89954jo(String str) {
        MultiTaskInfo multiTaskInfo;
        C87412m.m108594g(str, "id");
        Cursor rawQuery = this.f189466d.rawQuery("SELECT * FROM TaskBarInfo WHERE id = ?;", new String[]{str});
        if (rawQuery.moveToNext()) {
            multiTaskInfo = new MultiTaskInfo();
            multiTaskInfo.convertFrom(rawQuery);
        } else {
            multiTaskInfo = null;
        }
        rawQuery.close();
        return multiTaskInfo;
    }

    /* renamed from: qq */
    public boolean update(MultiTaskInfo multiTaskInfo, String... strArr) {
        byte[] bArr;
        C64459j13 m2;
        C87412m.m108594g(strArr, "keys");
        StringBuilder sb = new StringBuilder();
        sb.append("update:");
        String str = null;
        sb.append(multiTaskInfo != null ? Integer.valueOf(multiTaskInfo.field_type) : null);
        sb.append(' ');
        sb.append(multiTaskInfo != null ? multiTaskInfo.field_id : null);
        sb.append(' ');
        if (!(multiTaskInfo == null || (m2 = multiTaskInfo.mo80305m2()) == null)) {
            str = m2.f183752e;
        }
        sb.append(str);
        Log.m105924i("MicroMsg.TaskBarStorage", sb.toString());
        if (((multiTaskInfo == null || (bArr = multiTaskInfo.field_data) == null) ? 0 : bArr.length) <= 0) {
            Log.m105928w("MicroMsg.TaskBarStorage", "empty data!");
        }
        if (multiTaskInfo == null) {
            return false;
        }
        boolean updateNotify = updateNotify(multiTaskInfo, false, new String[0]);
        doNotify(MStorageEventData.EventType.SINGLE, 3, multiTaskInfo);
        return updateNotify;
    }
}
