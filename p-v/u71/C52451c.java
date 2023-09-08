package u71;

import android.database.Cursor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.XWebFeature;
import f40.C86709a0;
import java.util.ArrayList;
import kj2.C117407d;
import ob0.C11385n;
import ob0.C117747y;
import t71.C48547j;
import t71.C48551m;
import t71.C48552n;
import v71.C52778d;
import w71.C53087d;

/* renamed from: u71.c */
public class C52451c implements C11385n {

    /* renamed from: d */
    public C52454f f146565d;

    public C52451c() {
        Log.m105918d("MicroMsg.ExdeviceRankInfoManager", "hy: constructing manager....");
        C86709a0.m107529k().f251779b.mo123455a(XWebFeature.INTERFACE_SET_WEB_CONTENTS_SIZE, this);
        C86709a0.m107529k().f251779b.mo123455a(1041, this);
        C86709a0.m107529k().f251779b.mo123455a(XWebFeature.INTERFACE_CONFIGURE_V8_LITE, this);
        C86709a0.m107529k().f251779b.mo123455a(XWebFeature.INTERFACE_SHOW_HIDE, this);
    }

    /* renamed from: a */
    public ArrayList<C52778d> mo73407a(String str) {
        Log.m105918d("MicroMsg.ExdeviceRankInfoManager", "hy: getting like info...");
        ArrayList<C52778d> arrayList = null;
        if (!Util.isNullOrNil(str)) {
            C53087d Hx0 = C41166r1.Hx0();
            Hx0.getClass();
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.ExdeviceRankInfoStg", "hy: param error");
            } else {
                String format = String.format("select *, rowid from %s where %s = ? order by %s desc", new Object[]{"HardDeviceRankInfo", "rankID", FirebaseAnalytics.C113379b.SCORE});
                Cursor rawQuery = Hx0.f148162d.rawQuery(format, new String[]{Util.nullAs(str, "")}, 2);
                if (rawQuery == null) {
                    Log.m105920e("MicroMsg.ExdeviceRankInfoStg", "Get no rank in DB");
                } else {
                    if (rawQuery.moveToFirst()) {
                        ArrayList<C52778d> arrayList2 = new ArrayList<>();
                        do {
                            C52778d dVar = new C52778d();
                            dVar.convertFrom(rawQuery);
                            arrayList2.add(dVar);
                        } while (rawQuery.moveToNext());
                        arrayList = arrayList2;
                    } else {
                        Log.m105918d("MicroMsg.ExdeviceRankInfoStg", "hy: no record");
                    }
                    rawQuery.close();
                }
            }
            return arrayList;
        }
        Log.m105928w("MicroMsg.ExdeviceRankInfoManager", "hy: param error");
        return null;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105919d("MicroMsg.ExdeviceRankInfoManager", "hy: netscene back.err type: %d, err code: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (yVar instanceof C48547j) {
            if (i != 0 || i2 != 0) {
                Log.m105928w("MicroMsg.ExdeviceRankInfoManager", "hy: scene error.");
            }
        } else if (yVar instanceof C48551m) {
            if (i != 0 || i2 != 0) {
                Log.m105928w("MicroMsg.ExdeviceRankInfoManager", "hy: scene error");
            }
        } else if (!(yVar instanceof C48552n)) {
        } else {
            if (i != 0 || i2 != 0) {
                C117407d.INSTANCE.idkeyStat(323, 0, 1, false);
                Log.m105928w("MicroMsg.ExdeviceRankInfoManager", "hy: scene error");
            }
        }
    }
}
