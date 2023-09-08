package os2;

import android.database.Cursor;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import te3.k94;
import zh3.C91753f;

/* renamed from: os2.o0 */
public class C35294o0 extends MAutoStorage<C35293n0> {

    /* renamed from: f */
    public static final String[] f94554f = {"CREATE INDEX IF NOT EXISTS snsWsFoldGroupIdIndex ON SnsWsFoldGroupDetail ( groupId )"};

    /* renamed from: g */
    public static final String[] f94555g = {MAutoStorage.getCreateSQLs(C35293n0.f94553r, "SnsWsFoldGroupDetail")};

    /* renamed from: d */
    public C91753f f94556d;

    /* renamed from: e */
    public Map<Long, List<Long>> f94557e = new HashMap();

    public C35294o0(C91753f fVar) {
        super(fVar, C11765l0.f34450t, "SnsWsFoldGroupDetail", f94554f);
        this.f94556d = fVar;
    }

    /* renamed from: Lo */
    public boolean mo60191Lo(C35293n0 n0Var) {
        SnsMethodCalculate.markStartTimeMs("insertWsFoldDetail", "com.tencent.mm.plugin.sns.storage.SnsWsFoldDetailStorage");
        boolean z = this.f94556d.replace("SnsWsFoldGroupDetail", "groupId", n0Var.convertTo()) > 0;
        Log.m105918d("MicroMsg.SnsWsFoldDetailStorage", "SnsWsFoldDetail replace result " + z);
        try {
            k94 k94 = new k94();
            k94.parseFrom(n0Var.field_groupStrcut);
            if (!Util.isNullOrNil((List) k94.f183902d)) {
                ((HashMap) this.f94557e).put(Long.valueOf(n0Var.field_groupId), k94.f183902d);
            }
        } catch (Exception e) {
            Log.m105929w("MicroMsg.SnsWsFoldDetailStorage", "parse SnsWsGroupStruct fail:%s", e.getMessage());
        }
        SnsMethodCalculate.markEndTimeMs("insertWsFoldDetail", "com.tencent.mm.plugin.sns.storage.SnsWsFoldDetailStorage");
        return z;
    }

    /* renamed from: jo */
    public C35293n0 mo60192jo(long j) {
        SnsMethodCalculate.markStartTimeMs("getWsFoldDetailByGroupId", "com.tencent.mm.plugin.sns.storage.SnsWsFoldDetailStorage");
        C35293n0 n0Var = null;
        Cursor rawQuery = this.f94556d.rawQuery("select *,rowid from SnsWsFoldGroupDetail  where SnsWsFoldGroupDetail.groupId=" + j, (String[]) null, 2);
        if (rawQuery != null) {
            if (rawQuery.moveToNext()) {
                C35293n0 n0Var2 = new C35293n0();
                n0Var2.convertFrom(rawQuery);
                n0Var = n0Var2;
            }
            rawQuery.close();
        }
        SnsMethodCalculate.markEndTimeMs("getWsFoldDetailByGroupId", "com.tencent.mm.plugin.sns.storage.SnsWsFoldDetailStorage");
        return n0Var;
    }

    /* renamed from: qq */
    public boolean mo60193qq(long j) {
        SnsMethodCalculate.markStartTimeMs("removeByGroupId", "com.tencent.mm.plugin.sns.storage.SnsWsFoldDetailStorage");
        C91753f fVar = this.f94556d;
        boolean z = true;
        int delete = fVar.delete("SnsWsFoldGroupDetail", "groupId=?", new String[]{"" + j});
        Log.m105918d("MicroMsg.SnsWsFoldDetailStorage", "removeByGroupId " + j + " res " + delete);
        ((HashMap) this.f94557e).remove(Long.valueOf(j));
        if (delete <= 0) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("removeByGroupId", "com.tencent.mm.plugin.sns.storage.SnsWsFoldDetailStorage");
        return z;
    }
}
