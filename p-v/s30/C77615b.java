package s30;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C78822p8;

/* renamed from: s30.b */
public class C77615b extends MAutoStorage<C78822p8> {

    /* renamed from: e */
    public static final String[] f226278e = {MAutoStorage.getCreateSQLs(C78822p8.f231278B, "SnsFeature")};

    /* renamed from: d */
    public final ISQLiteDatabase f226279d;

    public C77615b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C78822p8.f231278B, "SnsFeature", f226278e);
        this.f226279d = iSQLiteDatabase;
        if (MultiProcessMMKV.getDefault().getLong("SnsFeatureStorage_create_time_v1", 0) == 0) {
            MultiProcessMMKV.getDefault().putLong("SnsFeatureStorage_create_time_v1", System.currentTimeMillis()).commit();
        }
    }

    /* renamed from: Lo */
    public int mo107791Lo(String str, int i, int i2, long j, long j2, int i3, int i4) {
        return mo107794qq(str, i, i2, j, j2, i3, i4, false, "");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: Yt */
    public void mo107792Yt(C78822p8 p8Var) {
        boolean z = false;
        Cursor rawQuery = this.f226279d.rawQuery("select * from SnsFeature where owner = '" + p8Var.field_owner + "' and " + "snsid" + " = '" + p8Var.field_snsid + "' and " + "type" + " = ? and " + "action" + " = ?", new String[]{String.valueOf(p8Var.field_type), String.valueOf(p8Var.field_action)});
        try {
            if (rawQuery.moveToFirst()) {
                rawQuery.close();
                z = true;
            } else {
                rawQuery.close();
            }
            if (!z) {
                this.f226279d.insert("SnsFeature", (String) null, p8Var.convertTo());
            }
        } catch (Throwable th) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
    }

    /* renamed from: jo */
    public int mo107793jo(int i, int i2, long j, long j2, int i3, int i4) {
        return mo107794qq((String) null, i, i2, j, j2, i3, i4, false, "");
    }

    /* renamed from: qq */
    public int mo107794qq(String str, int i, int i2, long j, long j2, int i3, int i4, boolean z, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT COUNT(*) FROM (select * from ");
        sb.append("SnsFeature");
        sb.append(" where ");
        sb.append(AppMeasurement.Param.TIMESTAMP);
        sb.append(" >= ? and ");
        sb.append(AppMeasurement.Param.TIMESTAMP);
        sb.append(" <= ? and ");
        sb.append("type");
        sb.append(" = ? and ");
        sb.append("action");
        sb.append(" = ?");
        if (i3 >= 0) {
            sb.append(" and ");
            sb.append("dayOfWeek");
            sb.append(" = ");
            sb.append(i3);
        }
        if (i4 >= 0) {
            sb.append(" and ");
            sb.append("dayOfWeek");
            sb.append(" = ");
            sb.append(i4);
        }
        if (z) {
            sb.append(" and ");
            sb.append("weishang");
            sb.append(" = 1");
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" and ");
            sb.append("city");
            sb.append(" = '");
            sb.append(str2);
            sb.append("'");
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(" and ");
            sb.append("snsid");
            sb.append(" = '");
            sb.append(str);
            sb.append("'");
        }
        sb.append(")");
        int i5 = 0;
        Cursor rawQuery = this.f226279d.rawQuery(sb.toString(), new String[]{String.valueOf(j), String.valueOf(j2), String.valueOf(i2), String.valueOf(i)});
        try {
            if (rawQuery.moveToFirst()) {
                i5 = rawQuery.getInt(0);
            }
            rawQuery.close();
            return i5;
        } catch (Throwable th) {
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
    }
}
