package rv1;

import com.tencent.p014mm.plugin.fts.C93834f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wcdb.database.SQLiteStatement;
import di3.C86312j;
import kv1.C99257k;
import kv1.C99258l;
import kv1.C99260q;

/* renamed from: rv1.e */
public class C101471e implements C99258l {

    /* renamed from: d */
    public boolean f297175d;

    /* renamed from: e */
    public boolean f297176e;

    /* renamed from: f */
    public SQLiteStatement f297177f;

    /* renamed from: g */
    public C99257k f297178g;

    public C101471e() {
        Log.m105925i("MicroMsg.FTS.FTS5SOSHistoryStorage", "Create %s", "FTS5SOSHistoryStorage");
    }

    /* renamed from: O4 */
    public String mo138597O4(String str, int i) {
        return null;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C99258l lVar = (C99258l) obj;
        return 0;
    }

    public void create() {
        boolean z = false;
        Log.m105925i("MicroMsg.FTS.FTS5SOSHistoryStorage", "OnCreate %s | isCreated =%b", "FTS5SOSHistoryStorage", Boolean.valueOf(this.f297175d));
        if (!this.f297175d) {
            Class cls = C99260q.class;
            if (!((C99260q) C86312j.m106911c(cls)).mo128758wd()) {
                Log.m105924i("MicroMsg.FTS.FTS5SOSHistoryStorage", "Create Fail!");
            } else {
                this.f297178g = ((C99260q) C86312j.m106911c(cls)).mo128742JS();
                Log.m105924i("MicroMsg.FTS.FTS5SOSHistoryStorage", "Create Success!");
                if (!((C93834f) this.f297178g).mo128797n("FTS5MetaSOSHistory") || !((C93834f) this.f297178g).mo128786b(-109, 2)) {
                    Log.m105924i("MicroMsg.FTS.FTS5SOSHistoryStorage", "Table Not Exist, Need To Create");
                    String format = String.format("DROP TABLE IF EXISTS %s;", new Object[]{"FTS5IndexSOSHistory"});
                    String format2 = String.format("DROP TABLE IF EXISTS %s;", new Object[]{"FTS5MetaSOSHistory"});
                    ((C93834f) this.f297178g).mo128792i(format);
                    ((C93834f) this.f297178g).mo128792i(format2);
                    ((C93834f) this.f297178g).mo128792i(String.format("CREATE TABLE IF NOT EXISTS %s (key TEXT PRIMARY KEY, timestamp INTEGER, content TEXT);", new Object[]{"FTS5MetaSOSHistory"}));
                    C93834f fVar = (C93834f) this.f297178g;
                    fVar.mo128792i(String.format("CREATE INDEX IF NOT EXISTS SOSHistory_timestamp ON %s(timestamp);", new Object[]{"FTS5MetaSOSHistory"}));
                    ((C93834f) this.f297178g).mo128800q(-109, 2);
                } else {
                    Log.m105924i("MicroMsg.FTS.FTS5SOSHistoryStorage", "Table Exist, Not Need To Create");
                }
                this.f297177f = ((C93834f) this.f297178g).mo128789e(String.format("INSERT OR REPLACE INTO %s (key, timestamp, content) VALUES (?, ?, ?);", new Object[]{"FTS5MetaSOSHistory"}));
                z = true;
            }
            if (z) {
                Log.m105924i("MicroMsg.FTS.FTS5SOSHistoryStorage", "SetCreated");
                this.f297175d = true;
            }
        }
    }

    /* renamed from: d */
    public int mo138631d() {
        return 1024;
    }

    public void destroy() {
        Log.m105925i("MicroMsg.FTS.FTS5SOSHistoryStorage", "OnDestroy %s | isDestroyed %b | isCreated %b", "FTS5SOSHistoryStorage", Boolean.valueOf(this.f297176e), Boolean.valueOf(this.f297175d));
        if (!this.f297176e && this.f297175d) {
            this.f297177f.close();
            Log.m105924i("MicroMsg.FTS.FTS5SOSHistoryStorage", "SetDestroyed");
            this.f297176e = true;
        }
    }

    public String getName() {
        return "FTS5SOSHistoryStorage";
    }

    public int getType() {
        return 1024;
    }

    /* renamed from: v5 */
    public void mo138622v5(int[] iArr, String str) {
    }
}
