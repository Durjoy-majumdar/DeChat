package rv1;

import android.database.Cursor;
import com.tencent.p014mm.plugin.fts.C93834f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tav.core.ExportErrorStatus;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.SQLiteStatement;
import kv1.C99247a;
import kv1.C99257k;
import lv1.C99672i;

/* renamed from: rv1.f */
public class C101472f extends C99247a {

    /* renamed from: r */
    public SQLiteStatement f297179r;

    /* renamed from: A */
    public void mo140973A(int i, int i2, long j, String str, long j2, String str2, String str3) {
        String simpleQueryForString;
        String str4 = str;
        try {
            this.f290994g.bindString(1, str2);
            this.f290994g.execute();
            try {
                this.f297179r.bindLong(1, (long) i);
            } catch (SQLiteException e) {
                e = e;
                int i3 = i2;
                long j3 = j;
                long j4 = j2;
                Log.m105920e("MicroMsg.FTS.FTS5ServiceNotifyStorage", String.format("Failed inserting index: 0x%x, %d, %d, %s, %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), str4, Long.valueOf(j2)}));
                simpleQueryForString = this.f291001q.simpleQueryForString();
                Log.m105920e("MicroMsg.FTS.FTS5ServiceNotifyStorage", ">> " + simpleQueryForString);
                throw e;
            }
            try {
                this.f297179r.bindLong(2, (long) i2);
            } catch (SQLiteException e2) {
                e = e2;
                long j35 = j;
                long j44 = j2;
                Log.m105920e("MicroMsg.FTS.FTS5ServiceNotifyStorage", String.format("Failed inserting index: 0x%x, %d, %d, %s, %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), str4, Long.valueOf(j2)}));
                simpleQueryForString = this.f291001q.simpleQueryForString();
                Log.m105920e("MicroMsg.FTS.FTS5ServiceNotifyStorage", ">> " + simpleQueryForString);
                throw e;
            }
            try {
                this.f297179r.bindLong(3, j);
                this.f297179r.bindString(4, str4);
                try {
                    this.f297179r.bindLong(5, j2);
                    this.f297179r.bindString(6, str3);
                    this.f297179r.execute();
                } catch (SQLiteException e3) {
                    e = e3;
                    Log.m105920e("MicroMsg.FTS.FTS5ServiceNotifyStorage", String.format("Failed inserting index: 0x%x, %d, %d, %s, %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), str4, Long.valueOf(j2)}));
                    simpleQueryForString = this.f291001q.simpleQueryForString();
                    Log.m105920e("MicroMsg.FTS.FTS5ServiceNotifyStorage", ">> " + simpleQueryForString);
                    throw e;
                }
            } catch (SQLiteException e4) {
                e = e4;
                long j442 = j2;
                Log.m105920e("MicroMsg.FTS.FTS5ServiceNotifyStorage", String.format("Failed inserting index: 0x%x, %d, %d, %s, %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), str4, Long.valueOf(j2)}));
                simpleQueryForString = this.f291001q.simpleQueryForString();
                Log.m105920e("MicroMsg.FTS.FTS5ServiceNotifyStorage", ">> " + simpleQueryForString);
                throw e;
            }
        } catch (SQLiteException e5) {
            e = e5;
            int i4 = i;
            int i35 = i2;
            long j352 = j;
            long j4422 = j2;
            Log.m105920e("MicroMsg.FTS.FTS5ServiceNotifyStorage", String.format("Failed inserting index: 0x%x, %d, %d, %s, %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), str4, Long.valueOf(j2)}));
            simpleQueryForString = this.f291001q.simpleQueryForString();
            if (simpleQueryForString != null && simpleQueryForString.length() > 0) {
                Log.m105920e("MicroMsg.FTS.FTS5ServiceNotifyStorage", ">> " + simpleQueryForString);
            }
            throw e;
        }
    }

    /* renamed from: B */
    public Cursor mo140974B(C99672i iVar, String str) {
        String d = iVar.mo139044d();
        String l = mo138611l();
        String j = mo138609j();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append(l);
        sb.append(".docid, type, subtype, entity_id, aux_index, timestamp, talker FROM ");
        sb.append(l);
        sb.append(" JOIN ");
        sb.append(j);
        sb.append(" ON (");
        sb.append(l);
        sb.append(".docid = ");
        sb.append(j);
        sb.append(".rowid)");
        sb.append(" WHERE ");
        sb.append(j);
        sb.append(" MATCH '");
        sb.append(d);
        sb.append("' AND aux_index = '");
        sb.append("notifymessage");
        sb.append("' AND status >= 0 ");
        if (!Util.isNullOrNil(str)) {
            sb.append("AND talker = ? ");
        }
        sb.append("ORDER BY timestamp desc;");
        String[] strArr = null;
        if (!Util.isNullOrNil(str)) {
            strArr = new String[]{str};
        }
        return ((C93834f) this.f290993f).mo128798o(sb.toString(), strArr);
    }

    /* renamed from: d */
    public int mo138631d() {
        return 1536;
    }

    public String getName() {
        return "FTS5NotifyServiceStorage";
    }

    public int getType() {
        return 1536;
    }

    /* renamed from: i */
    public String mo138608i() {
        return String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0, talker TEXT);", new Object[]{mo138611l()});
    }

    /* renamed from: m */
    public String mo138612m() {
        return "ServiceNotify";
    }

    /* renamed from: s */
    public boolean mo138618s() {
        return !mo138599b(ExportErrorStatus.APPEND_VIDEO_SAMPLE_MAKE_CURRENT, 2);
    }

    /* renamed from: u */
    public void mo138620u() {
        if (mo138618s()) {
            ((C93834f) this.f290993f).mo128800q(-111, 2);
            ((C93834f) this.f290993f).mo128800q(-201, MAlarmHandler.NEXT_FIRE_INTERVAL);
        }
        C99257k kVar = this.f290993f;
        C93834f fVar = (C93834f) kVar;
        fVar.mo128792i(String.format("CREATE INDEX IF NOT EXISTS %s_timestamp ON %s(timestamp);", new Object[]{mo138611l(), mo138611l()}));
        C99257k kVar2 = this.f290993f;
        C93834f fVar2 = (C93834f) kVar2;
        fVar2.mo128792i(String.format("CREATE INDEX IF NOT EXISTS %s_talker ON %s(talker);", new Object[]{mo138611l(), mo138611l()}));
        this.f297179r = ((C93834f) this.f290993f).mo128789e(String.format("INSERT INTO %s (docid, type, subtype, entity_id, aux_index, timestamp, talker) VALUES (last_insert_rowid(), ?, ?, ?, ?, ?, ?);", new Object[]{mo138611l()}));
    }

    /* renamed from: v */
    public boolean mo138621v() {
        this.f297179r.close();
        super.mo138621v();
        return true;
    }
}
