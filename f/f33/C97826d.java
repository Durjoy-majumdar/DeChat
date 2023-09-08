package f33;

import android.content.ContentValues;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.sdk.storage.sql.Sql;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import gy3.C87412m;
import i40.C60247c;
import p749xh.C102651h0;

/* renamed from: f33.d */
public final class C97826d {

    /* renamed from: a */
    public static final C97826d f286974a = new C97826d();

    /* renamed from: a */
    public final ISQLiteDatabase mo137158a() {
        Class cls = C97824b.class;
        C60247c.C60248a aVar = C60247c.f171775g;
        ISQLiteDatabase db = ((C97824b) aVar.mo85234a(cls)).getDB();
        if (db != null) {
            return db;
        }
        mo137159b();
        ISQLiteDatabase db4 = ((C97824b) aVar.mo85234a(cls)).getDB();
        C87412m.m108591d(db4);
        return db4;
    }

    /* renamed from: b */
    public final void mo137159b() {
        C39622i0 a;
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SNS_BACKGROUND_VIDEO_DATA_DB_VERSION_INT;
        Object f = i.mo119685f(aVar, 0);
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) f).intValue();
        if (intValue != 0) {
            Log.m105924i("MicroMsg，BackgroundVideoInfoStorageManager", "diff sql version， delete sql file, " + intValue + ", 0");
            StringBuilder sb = new StringBuilder();
            sb.append(C86709a0.m107535s().f251807e);
            sb.append("mediaOpt/remux/dbFolder/");
            C86013q1.m106445f(sb.toString());
        }
        Class cls = C97824b.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C86709a0.m107535s().f251807e + "mediaOpt/remux/dbFolder/");
        sb4.append("background_video_table.db");
        if (((C97824b) a).mo85232c3(sb4.toString())) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
        }
    }

    /* renamed from: c */
    public final C102651h0 mo137160c(int i, int i2) {
        C102651h0 h0Var = (C102651h0) C102651h0.f302391Q.selectAll().log("MicroMsg，BackgroundVideoInfoStorageManager").where(new Sql.Equal("sns_local_id", String.valueOf(i)).and(new Sql.Equal("sns_create_time", String.valueOf(i2)))).build().singleQuery(mo137158a(), C102651h0.class);
        StringBuilder sb = new StringBuilder();
        sb.append("selectVideoInfoBySnsLocalIdAndCreateTime >> snsLocalId: ");
        sb.append(i);
        sb.append(", snsCreateTime: ");
        sb.append(i2);
        sb.append(", result is find: ");
        sb.append(h0Var != null);
        Log.m105924i("MicroMsg，BackgroundVideoInfoStorageManager", sb.toString());
        return h0Var;
    }

    /* renamed from: d */
    public final C102651h0 mo137161d(String str) {
        C87412m.m108594g(str, "workTagId");
        C102651h0 h0Var = (C102651h0) C102651h0.f302391Q.selectAll().where(C102651h0.f302393R.equal(str)).log("MicroMsg.SDK.BaseBackgroundVideoInfo").build().singleQuery(mo137158a(), C102651h0.class);
        StringBuilder sb = new StringBuilder();
        sb.append("selectVideoInfoByWorkTagId >> workTagId: ");
        sb.append(str);
        sb.append(", result is find: ");
        sb.append(h0Var != null);
        Log.m105924i("MicroMsg，BackgroundVideoInfoStorageManager", sb.toString());
        return h0Var;
    }

    /* renamed from: e */
    public final void mo137162e(String str, boolean z) {
        C87412m.m108594g(str, "workTagId");
        ISQLiteDatabase a = mo137158a();
        SingleTable singleTable = C102651h0.f302391Q;
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_sns_double_check", Integer.valueOf(z ? 1 : 2));
        int run = C102651h0.f302391Q.update(contentValues).where(C102651h0.f302393R.equal(str)).build().run(a);
        Log.m105924i("MicroMsg，BackgroundVideoInfoStorageManager", "updateUseSnsDoubleCheckByWorkTagId >> workTagId: " + str + ", isUse: " + z + ", result: " + run);
    }

    /* renamed from: f */
    public final void mo137163f(String str, int i) {
        C87412m.m108594g(str, "workTagId");
        ISQLiteDatabase a = mo137158a();
        SingleTable singleTable = C102651h0.f302391Q;
        ContentValues contentValues = new ContentValues();
        contentValues.put("work_type", Integer.valueOf(i));
        int run = C102651h0.f302391Q.update(contentValues).where(C102651h0.f302393R.equal(str)).build().run(a);
        Log.m105924i("MicroMsg，BackgroundVideoInfoStorageManager", "updateWorkTypeByWorkTagId >> workTagId: " + str + ", workType: " + i + ", result: " + run);
    }
}
