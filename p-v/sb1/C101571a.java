package sb1;

import com.tencent.p014mm.plugin.appbrand.appstorage.ZipJNI;
import com.tencent.p014mm.plugin.fts.C93834f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.SQLiteStatement;
import kv1.C99247a;
import kv1.C99251g;

/* renamed from: sb1.a */
public class C101571a extends C99247a {

    /* renamed from: r */
    public SQLiteStatement f297356r;

    /* renamed from: A */
    public void mo141054A(int i, int i2, long j, String str, long j2, String str2, int i3) {
        String simpleQueryForString;
        String str3 = str;
        String a = C99251g.m129280a(str2);
        if (!Util.isNullOrNil(a)) {
            boolean m = ((C93834f) this.f290993f).mo128796m();
            if (!m) {
                ((C93834f) this.f290993f).mo128785a();
            }
            try {
                this.f290994g.bindString(1, a);
                this.f290994g.execute();
                try {
                    this.f297356r.bindLong(1, (long) i);
                } catch (SQLiteException e) {
                    e = e;
                    int i4 = i2;
                    long j3 = j;
                    long j4 = j2;
                    Log.m105920e("MicroMsg.FTS.FTS5FavoriteStorage", String.format("Failed inserting index: 0x%x, %d, %d, %s, %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), str3, Long.valueOf(j2)}));
                    simpleQueryForString = this.f291001q.simpleQueryForString();
                    Log.m105920e("MicroMsg.FTS.FTS5FavoriteStorage", ">> " + simpleQueryForString);
                    throw e;
                }
                try {
                    this.f297356r.bindLong(2, (long) i2);
                } catch (SQLiteException e2) {
                    e = e2;
                    long j35 = j;
                    long j44 = j2;
                    Log.m105920e("MicroMsg.FTS.FTS5FavoriteStorage", String.format("Failed inserting index: 0x%x, %d, %d, %s, %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), str3, Long.valueOf(j2)}));
                    simpleQueryForString = this.f291001q.simpleQueryForString();
                    if (simpleQueryForString != null && simpleQueryForString.length() > 0) {
                        Log.m105920e("MicroMsg.FTS.FTS5FavoriteStorage", ">> " + simpleQueryForString);
                    }
                    throw e;
                }
                try {
                    this.f297356r.bindLong(3, j);
                    this.f297356r.bindString(4, str3);
                    try {
                        this.f297356r.bindLong(5, j2);
                        this.f297356r.bindLong(6, (long) i3);
                        this.f297356r.execute();
                        if (!m) {
                            ((C93834f) this.f290993f).mo128788d();
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        Log.m105920e("MicroMsg.FTS.FTS5FavoriteStorage", String.format("Failed inserting index: 0x%x, %d, %d, %s, %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), str3, Long.valueOf(j2)}));
                        simpleQueryForString = this.f291001q.simpleQueryForString();
                        Log.m105920e("MicroMsg.FTS.FTS5FavoriteStorage", ">> " + simpleQueryForString);
                        throw e;
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    long j442 = j2;
                    Log.m105920e("MicroMsg.FTS.FTS5FavoriteStorage", String.format("Failed inserting index: 0x%x, %d, %d, %s, %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), str3, Long.valueOf(j2)}));
                    simpleQueryForString = this.f291001q.simpleQueryForString();
                    Log.m105920e("MicroMsg.FTS.FTS5FavoriteStorage", ">> " + simpleQueryForString);
                    throw e;
                }
            } catch (SQLiteException e5) {
                e = e5;
                int i5 = i;
                int i44 = i2;
                long j352 = j;
                long j4422 = j2;
                Log.m105920e("MicroMsg.FTS.FTS5FavoriteStorage", String.format("Failed inserting index: 0x%x, %d, %d, %s, %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), str3, Long.valueOf(j2)}));
                simpleQueryForString = this.f291001q.simpleQueryForString();
                Log.m105920e("MicroMsg.FTS.FTS5FavoriteStorage", ">> " + simpleQueryForString);
                throw e;
            }
        }
    }

    /* renamed from: d */
    public int mo138631d() {
        return 256;
    }

    public String getName() {
        return "FTS5FavoriteStorage";
    }

    public int getType() {
        return 256;
    }

    /* renamed from: i */
    public String mo138608i() {
        return String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0, fav_type INT DEFAULT 0);", new Object[]{mo138611l()});
    }

    /* renamed from: m */
    public String mo138612m() {
        return "Favorite";
    }

    /* renamed from: s */
    public boolean mo138618s() {
        return !mo138599b(ZipJNI.UNZ_ERR_OPEN_WRITE, 4);
    }

    /* renamed from: u */
    public void mo138620u() {
        if (mo138618s()) {
            ((C93834f) this.f290993f).mo128800q(-106, 4);
        }
        this.f297356r = ((C93834f) this.f290993f).mo128789e(String.format("INSERT INTO %s (docid, type, subtype, entity_id, aux_index, timestamp, fav_type) VALUES (last_insert_rowid(), ?, ?, ?, ?, ?, ?);", new Object[]{mo138611l()}));
    }
}
