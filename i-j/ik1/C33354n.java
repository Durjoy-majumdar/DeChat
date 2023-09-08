package ik1;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import er1.C58739j4;
import gy3.C87412m;
import hg1.C32895i;
import ig1.C33322i;
import java.util.Map;
import java.util.Set;
import o40.C61926c;
import ok1.C62042e;
import p749xh.C38633p3;

/* renamed from: ik1.n */
public final class C33354n extends C32895i {

    /* renamed from: e */
    public final ISQLiteDatabase f90401e;

    /* renamed from: f */
    public final LruCache<Long, Integer> f90402f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33354n(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C33322i.f90340p, "FinderLiveVideoDefinitionInfo", C38633p3.f103310g);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C33322i.f90340p;
        this.f90401e = iSQLiteDatabase;
        this.f90402f = new LruCache<>(C58739j4.f168176a.mo83692U() ? 5 : 100);
    }

    /* renamed from: Lo */
    public int mo58845Lo(long j) {
        Integer num = this.f90402f.get(Long.valueOf(j));
        int intValue = num == null ? -1 : num.intValue();
        C62042e eVar = C62042e.f176370a;
        eVar.mo86998D1("FinderLiveVideoDefinitionStorage", "selectDefinition liveId:" + j + ",level:" + intValue + ",cache size:" + this.f90402f.size());
        return intValue;
    }

    /* renamed from: jo */
    public void mo58846jo() {
        boolean z;
        C33322i iVar;
        boolean z2;
        Set<Map.Entry<Long, Integer>> entrySet = this.f90402f.entrySet();
        C87412m.m108593f(entrySet, "definitionCache.entrySet()");
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            C87412m.m108593f(key, "it.key");
            long longValue = ((Number) key).longValue();
            Object value = entry.getValue();
            C87412m.m108593f(value, "it.value");
            int intValue = ((Number) value).intValue();
            Cursor rawQuery = this.f90401e.rawQuery("SELECT * FROM FinderLiveVideoDefinitionInfo where FinderLiveVideoDefinitionInfo.liveId=" + C61926c.m72691p(longValue), (String[]) null, 2);
            boolean z3 = true;
            if (rawQuery.moveToNext()) {
                iVar = new C33322i();
                iVar.convertFrom(rawQuery);
                z = iVar.field_definition != intValue;
                iVar.field_definition = intValue;
                z2 = false;
            } else {
                C33322i iVar2 = new C33322i();
                iVar2.field_liveId = longValue;
                iVar2.field_definition = intValue;
                Log.m105924i("FinderLiveVideoDefinitionStorage", "create new video definition info:" + iVar2);
                iVar = iVar2;
                z2 = true;
                z = false;
            }
            rawQuery.close();
            if (z) {
                z3 = replace(iVar);
            } else {
                if (z2) {
                    if (this.f90401e.insert("FinderLiveVideoDefinitionInfo", "liveId", iVar.convertTo()) > 0) {
                    }
                }
                z3 = false;
            }
            Log.m105924i("FinderLiveVideoDefinitionStorage", "saveCache " + iVar.field_liveId + ',' + iVar.field_definition + ",needReplay:" + z + ", needInsert:" + z2 + ", result:" + z3);
        }
        Log.m105924i("FinderLiveVideoDefinitionStorage", "saveDefinition finish size:" + this.f90402f.size() + '!');
    }
}
