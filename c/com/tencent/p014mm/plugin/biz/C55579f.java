package com.tencent.p014mm.plugin.biz;

import android.content.Context;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.app.C80589e;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.mmdata.rpt.BizQualityReportStruct;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19625p0;
import di3.C86301e;
import di3.C86312j;
import eb0.C58537b0;
import eb0.C58540g4;
import ei3.C86522b;
import ex0.C45696d;
import f40.C86709a0;
import i40.C60247c;
import java.util.List;
import ky2.C10432i;
import p749xh.C118880v0;
import rb0.C48009v0;
import zh3.C91753f;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: com.tencent.mm.plugin.biz.f */
public class C55579f extends C86301e {

    /* renamed from: d */
    public static long f158250d = C80589e.f235761b;

    /* renamed from: com.tencent.mm.plugin.biz.f$a */
    public class C55580a implements Runnable {
        public C55580a(C55579f fVar) {
        }

        public void run() {
            C39622i0 a;
            Class cls = C58540g4.class;
            synchronized (C60247c.f171776h) {
                C86709a0.m107523b().mo121108c();
                if (C60247c.class.isAssignableFrom(cls)) {
                    a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
                } else {
                    throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
            }
            ISQLiteDatabase db = ((C58540g4) a).getDB();
            if (db == null) {
                Log.m105928w("PluginBiz", "INewBizDataDB == null");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            SingleTable singleTable = C118880v0.f356010I;
            SelectSql build = singleTable.select((Column) C118880v0.f356011J.count()).build();
            int singleInt = build.singleInt(db);
            int singleInt2 = build.singleInt(C86709a0.m107535s().f251811i);
            if (singleInt < 50 && singleInt < singleInt2) {
                Log.m105924i("PluginBiz", "start migrateOldDb");
                List<C19623o0> multiQuery = singleTable.selectAll().orderBy(C118880v0.f356012K.orderDesc()).limit(50, 0).build().multiQuery(C86709a0.m107535s().f251811i, C19623o0.class);
                BizQualityReportStruct bizQualityReportStruct = new BizQualityReportStruct();
                bizQualityReportStruct.f107858e = 1;
                bizQualityReportStruct.mo86054n();
                C115669n.INSTANCE.idkeyStat(1378, 21, 1, false);
                for (C19623o0 insertToDB : multiQuery) {
                    insertToDB.insertToDB(db, false);
                }
                Log.m105925i("PluginBiz", "sql duration statistic: loop -> %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                ((C45696d) C86709a0.m107533q(C45696d.class)).Wn0(true);
                BizQualityReportStruct bizQualityReportStruct2 = new BizQualityReportStruct();
                bizQualityReportStruct2.f107858e = 2;
                bizQualityReportStruct2.mo86054n();
                C19625p0 Jx0 = C48009v0.Jx0();
                if (Jx0 != null) {
                    Jx0.b00();
                }
            }
        }
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        C58537b0.f167574d.mo83445a();
        wx0();
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        C58537b0 b0Var = C58537b0.f167574d;
        C10432i iVar = (C10432i) C86312j.m106911c(C10432i.class);
        if (iVar != null) {
            iVar.mo10756rY(C58537b0.C58538a.f167579d);
        }
    }

    public void onCreate(Context context) {
        super.onCreate(context);
    }

    public C91753f vx0() {
        C39622i0 a;
        Class cls = C58540g4.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        ISQLiteDatabase db = ((C58540g4) a).getDB();
        if (db != null) {
            return (C91753f) db;
        }
        Log.m105924i("PluginBiz", "INewBizDataDB == null");
        return null;
    }

    public void wx0() {
        if (((C45696d) C86709a0.m107533q(C45696d.class)).Q20()) {
            Log.m105924i("PluginBiz", "user has migrated db");
            return;
        }
        ((C119157j) C119157j.f356862d).mo183876g(new C55580a(this), "BrandServiceWorkerThread");
    }
}
