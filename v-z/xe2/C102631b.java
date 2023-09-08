package xe2;

import android.content.ContentValues;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.mvvm.IMvvmDBProvider;
import com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage;
import eb0.C31543z5;
import gy3.C24560g0;
import gy3.C87412m;
import p749xh.C102676x0;

/* renamed from: xe2.b */
public final class C102631b extends MvvmStorage<C102630a> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102631b(IMvvmDBProvider iMvvmDBProvider) {
        super(iMvvmDBProvider);
        C87412m.m108594g(iMvvmDBProvider, "dbProvider");
    }

    /* renamed from: c3 */
    public final void mo142286c3(String str) {
        C87412m.m108594g(str, "msgItemId");
        int run = C102676x0.f303129u.delete().log("MicroMsg.C2CPreDownloadStorage").where(C102676x0.f303130v.equal(str)).build().run(getDbProvider().getDB());
        Log.m105924i("MicroMsg.C2CPreDownloadStorage", "deleteByMsgId >> msgItemId:" + str + ", result:" + run);
    }

    /* renamed from: d3 */
    public final C102630a mo142287d3(String str) {
        C87412m.m108594g(str, "msgItemId");
        return (C102630a) C102676x0.f303129u.selectAll().log("MicroMsg.C2CPreDownloadStorage").where(C102676x0.f303130v.equal(str)).build().singleQuery(getDbProvider().getDB(), C102630a.class);
    }

    /* renamed from: e3 */
    public final void mo142288e3(String str) {
        C87412m.m108594g(str, "msgItemId");
        ContentValues contentValues = new ContentValues();
        contentValues.put("MsgItemId", str);
        C102630a aVar = (C102630a) get(contentValues, C24560g0.m30725a(C102630a.class));
        if (aVar != null && aVar.mo142470l2() == 0) {
            aVar.mo142482w2(C31543z5.m39453c());
            MvvmStorage.update$default(this, aVar, false, false, 6, (Object) null);
        }
    }

    /* renamed from: f3 */
    public final void mo142289f3(String str, long j) {
        C87412m.m108594g(str, "msgItemId");
        ContentValues contentValues = new ContentValues();
        contentValues.put("MsgItemId", str);
        C102630a aVar = (C102630a) get(contentValues, C24560g0.m30725a(C102630a.class));
        if (aVar != null) {
            aVar.mo142460C2(aVar.mo142481v2() - j);
            aVar.mo142466d(aVar.mo142475q2() <= 0 ? 3 : 1);
            MvvmStorage.update$default(this, aVar, false, false, 6, (Object) null);
        }
    }

    /* renamed from: g3 */
    public final void mo142290g3(String str, int i) {
        C87412m.m108594g(str, "msgItemId");
        ContentValues contentValues = new ContentValues();
        contentValues.put("MsgItemId", str);
        C102630a aVar = (C102630a) get(contentValues, C24560g0.m30725a(C102630a.class));
        if (aVar != null && aVar.getStatus() != 3) {
            aVar.mo142466d(i);
            if (i == 3 || i == 5) {
                aVar.mo142460C2(0);
            }
            MvvmStorage.update$default(this, aVar, false, false, 6, (Object) null);
        }
    }

    public String getLogTag() {
        return "MicroMsg.C2CPreDownloadStorage";
    }
}
