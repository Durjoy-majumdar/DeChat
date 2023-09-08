package qe2;

import android.database.Cursor;
import android.util.Pair;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me2.C10783a;
import pe2.C100785e;
import te3.C101843st3;

/* renamed from: qe2.b */
public abstract class C101123b {

    /* renamed from: a */
    public C100785e f296007a;

    /* renamed from: b */
    public SQLiteStatement f296008b;

    /* renamed from: c */
    public SQLiteStatement f296009c;

    /* renamed from: d */
    public SQLiteStatement f296010d;

    /* renamed from: e */
    public SQLiteStatement f296011e;

    /* renamed from: qe2.b$a */
    public class C101124a implements Comparator<Map.Entry<String, Double>> {
        public C101124a(C101123b bVar) {
        }

        public int compare(Object obj, Object obj2) {
            return ((Double) ((Map.Entry) obj2).getValue()).compareTo((Double) ((Map.Entry) obj).getValue());
        }
    }

    public C101123b(C100785e eVar) {
        this.f296007a = eVar;
        if (eVar.mo140223e(mo129634g(), 0) != mo129633f()) {
            if (this.f296007a.mo140225g(mo129632e())) {
                this.f296007a.mo140220b(mo129632e());
            }
            this.f296007a.mo140221c(String.format("CREATE TABLE IF NOT EXISTS %s (chat TEXT, talker TEXT, date INTEGER, dayreceivecount INTEGER, dayclickcount INTEGER, weekreceivecount INTEGER, weekclickcount INTEGER, monthreceivecount INTEGER, monthclickcount INTEGER, dayclickrate FLOAT, weekclickrate FLOAT, monthclickrate FLOAT, PRIMARY KEY(chat, talker, date));", new Object[]{mo129632e()}));
            this.f296007a.mo140227i(mo129634g(), mo129633f());
        } else {
            Log.m105925i("MicroMsg.Priority.C2CMsgBaseUsageStorage", "Exist Table %s %d", mo129632e(), Integer.valueOf(this.f296007a.mo140224f(mo129632e())));
        }
        this.f296008b = this.f296007a.mo140219a(String.format("INSERT OR REPLACE INTO %s (chat, talker, date, dayreceivecount, dayclickcount, weekreceivecount, weekclickcount, monthreceivecount, monthclickcount, dayclickrate, weekclickrate, monthclickrate) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)", new Object[]{mo129632e()}));
        this.f296009c = this.f296007a.mo140219a(String.format("UPDATE %s SET dayreceivecount = ?, weekreceivecount = ?, monthreceivecount = ?, dayclickrate = ?, weekclickrate = ?, monthclickrate = ? WHERE chat = ? AND talker = ? AND date = ?", new Object[]{mo129632e()}));
        this.f296010d = this.f296007a.mo140219a(String.format("UPDATE %s SET dayclickcount = ?, weekclickcount = ?, monthclickcount = ?, dayclickrate = ?, weekclickrate = ?, monthclickrate = ? WHERE chat = ? AND talker = ? AND date = ?", new Object[]{mo129632e()}));
        this.f296011e = this.f296007a.mo140219a(String.format("DELETE FROM %s WHERE chat = ?;", new Object[]{mo129632e()}));
    }

    /* renamed from: a */
    public final float mo140558a(int i, int i2) {
        if (i2 == 0 && i > 0) {
            return 1.0f;
        }
        if (i2 == 0 && i == 0) {
            return 0.0f;
        }
        return Math.min(((float) i) / ((float) i2), 1.0f);
    }

    /* renamed from: b */
    public final C101843st3 mo140559b(Cursor cursor) {
        C101843st3 st32 = new C101843st3();
        st32.f299454d = cursor.getString(0);
        st32.f299455e = cursor.getString(1);
        st32.f299456f = cursor.getLong(2);
        st32.f299457g = cursor.getInt(3);
        st32.f299458h = cursor.getInt(4);
        st32.f299459i = cursor.getInt(5);
        st32.f299460j = cursor.getInt(6);
        st32.f299461n = cursor.getInt(7);
        st32.f299462o = cursor.getInt(8);
        st32.f299463p = cursor.getFloat(9);
        st32.f299464q = cursor.getFloat(10);
        st32.f299465r = cursor.getFloat(11);
        return st32;
    }

    /* renamed from: c */
    public void mo140560c(String str) {
        this.f296011e.bindString(1, str);
        Log.m105925i("MicroMsg.Priority.C2CMsgBaseUsageStorage", "delete %d img usage %s", Integer.valueOf(this.f296011e.executeUpdateDelete()), str);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public double[] mo140561d(String str, String str2) {
        float f;
        long b = C10783a.m10758b();
        String format = String.format("SELECT dayclickrate, weekclickrate, monthclickrate FROM %s WHERE chat = ? AND talker = ? AND date = ?", new Object[]{mo129632e()});
        Cursor h = this.f296007a.mo140226h(format, new String[]{str, str2, String.valueOf(b)});
        double[] dArr = new double[3];
        if (h.moveToNext()) {
            dArr[0] = h.getDouble(0);
            dArr[1] = h.getDouble(1);
            dArr[2] = h.getDouble(2);
            h.close();
        } else {
            h.close();
            dArr[0] = 0.0d;
            String format2 = String.format("SELECT sum(dayreceivecount), sum(dayclickcount) FROM %s WHERE chat = ? AND talker = ? AND date >= ?", new Object[]{mo129632e()});
            Cursor h2 = this.f296007a.mo140226h(format2, new String[]{str, str2, String.valueOf(b - 518400000)});
            try {
                float f2 = 0.0f;
                if (h2.moveToNext()) {
                    f = mo140558a(h2.getInt(1), h2.getInt(0));
                } else {
                    h2.close();
                    f = 0.0f;
                }
                dArr[1] = (double) f;
                String format3 = String.format("SELECT sum(dayreceivecount), sum(dayclickcount) FROM %s WHERE chat = ? AND talker = ? AND date >= ?", new Object[]{mo129632e()});
                Cursor h3 = this.f296007a.mo140226h(format3, new String[]{str, str2, String.valueOf(b - 2505600000L)});
                try {
                    if (h3.moveToNext()) {
                        f2 = mo140558a(h3.getInt(1), h3.getInt(0));
                    }
                    h3.close();
                    dArr[2] = (double) f2;
                } catch (Throwable th) {
                    h3.close();
                    throw th;
                }
            } finally {
                h2.close();
            }
        }
        return dArr;
    }

    /* renamed from: e */
    public abstract String mo129632e();

    /* renamed from: f */
    public abstract long mo129633f();

    /* renamed from: g */
    public abstract long mo129634g();

    /* renamed from: h */
    public int mo140562h(String str, String str2) {
        long b = C10783a.m10758b();
        int i = 0;
        String format = String.format("SELECT dayreceivecount FROM %s WHERE chat = ? AND talker = ? AND date = ?", new Object[]{mo129632e()});
        Cursor h = this.f296007a.mo140226h(format, new String[]{str, str2, String.valueOf(b)});
        if (h.moveToNext()) {
            i = h.getInt(0);
        }
        h.close();
        return i;
    }

    /* renamed from: i */
    public List<Pair<String, String>> mo140563i(long j) {
        HashMap hashMap = new HashMap();
        Cursor h = this.f296007a.mo140226h(String.format("SELECT chat, MMSumDivision(dayreceivecount, dayclickcount, 0) FROM %s WHERE date = ? AND ((chat like '%%@chatroom' AND talker = '@all') OR (chat = talker)) GROUP BY chat", new Object[]{mo129632e()}), new String[]{String.valueOf(j)});
        while (h.moveToNext()) {
            hashMap.put(h.getString(0), Double.valueOf(h.getDouble(1)));
        }
        h.close();
        HashMap hashMap2 = new HashMap();
        Cursor h2 = this.f296007a.mo140226h(String.format("SELECT chat, MMSumDivision(dayreceivecount, dayclickcount, 0) FROM %s WHERE date >= ? AND ((chat like '%%@chatroom' AND talker = '@all') OR (chat = talker)) GROUP BY chat", new Object[]{mo129632e()}), new String[]{String.valueOf(j - 518400000)});
        while (h2.moveToNext()) {
            hashMap2.put(h2.getString(0), Double.valueOf(h2.getDouble(1)));
        }
        h2.close();
        HashMap hashMap3 = new HashMap();
        Cursor h3 = this.f296007a.mo140226h(String.format("SELECT chat, MMSumDivision(dayreceivecount, dayclickcount, 0) FROM %s WHERE date >= ? AND ((chat like '%%@chatroom' AND talker = '@all') OR (chat = talker)) GROUP BY chat", new Object[]{mo129632e()}), new String[]{String.valueOf(j - 2505600000L)});
        while (h3.moveToNext()) {
            hashMap3.put(h3.getString(0), Double.valueOf(h3.getDouble(1)));
        }
        h3.close();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(hashMap3.entrySet());
        Collections.sort(arrayList, new C101124a(this));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            double d = 0.0d;
            double doubleValue = hashMap.containsKey(entry.getKey()) ? ((Double) hashMap.get(entry.getKey())).doubleValue() : 0.0d;
            if (hashMap.containsKey(entry.getKey())) {
                d = ((Double) hashMap2.get(entry.getKey())).doubleValue();
            }
            arrayList2.add(new Pair((String) entry.getKey(), String.format("%.2f,%.2f,%.2f", new Object[]{Double.valueOf(doubleValue), Double.valueOf(d), entry.getValue()})));
        }
        return arrayList2;
    }

    /* renamed from: j */
    public int mo140564j(String str, String str2) {
        int i = 0;
        String format = String.format("SELECT sum(dayreceivecount) FROM %s WHERE chat = ? AND talker = ? AND date >= ?", new Object[]{mo129632e()});
        Cursor h = this.f296007a.mo140226h(format, new String[]{str, str2, String.valueOf(C10783a.m10758b() - 518400000)});
        if (h.moveToNext()) {
            i = h.getInt(0);
        }
        h.close();
        return i;
    }

    /* renamed from: k */
    public final void mo140565k(String str, String str2, long j, boolean z) {
        String str3 = str;
        String str4 = str2;
        long j2 = j;
        C101843st3 st32 = new C101843st3();
        st32.f299454d = str3;
        st32.f299455e = str4;
        st32.f299456f = j2;
        Cursor h = this.f296007a.mo140226h(String.format("SELECT sum(dayreceivecount), sum(dayclickcount) FROM %s WHERE chat = ? AND talker = ? AND date >= ?", new Object[]{mo129632e()}), new String[]{str3, str4, String.valueOf(j2 - 2505600000L)});
        if (h.moveToNext()) {
            st32.f299461n = h.getInt(0);
            st32.f299462o = h.getInt(1);
        }
        h.close();
        Cursor h2 = this.f296007a.mo140226h(String.format("SELECT sum(dayreceivecount), sum(dayclickcount) FROM %s WHERE chat = ? AND talker = ? AND date >= ?", new Object[]{mo129632e()}), new String[]{str3, str4, String.valueOf(j2 - 518400000)});
        if (h2.moveToNext()) {
            st32.f299459i = h2.getInt(0);
            st32.f299460j = h2.getInt(1);
        }
        h2.close();
        if (z) {
            st32.f299458h++;
            st32.f299462o++;
            st32.f299460j++;
        } else {
            st32.f299457g++;
            st32.f299461n++;
            st32.f299459i++;
        }
        st32.f299463p = mo140558a(st32.f299458h, st32.f299457g);
        st32.f299464q = mo140558a(st32.f299460j, st32.f299459i);
        st32.f299465r = mo140558a(st32.f299462o, st32.f299461n);
        this.f296008b.bindString(1, st32.f299454d);
        this.f296008b.bindString(2, st32.f299455e);
        this.f296008b.bindLong(3, st32.f299456f);
        this.f296008b.bindLong(4, (long) st32.f299457g);
        this.f296008b.bindLong(5, (long) st32.f299458h);
        this.f296008b.bindLong(6, (long) st32.f299459i);
        this.f296008b.bindLong(7, (long) st32.f299460j);
        this.f296008b.bindLong(8, (long) st32.f299461n);
        this.f296008b.bindLong(9, (long) st32.f299462o);
        this.f296008b.bindDouble(10, (double) st32.f299463p);
        this.f296008b.bindDouble(11, (double) st32.f299464q);
        this.f296008b.bindDouble(12, (double) st32.f299465r);
        Log.m105925i("MicroMsg.Priority.C2CMsgBaseUsageStorage", "insert %d usage %s %s %s %d %d %d %d %.2f %.2f", Long.valueOf(this.f296008b.executeInsert()), str3, str4, C72715f.m85111d("yyyy-MM-dd", j2 / 1000), Integer.valueOf(st32.f299459i), Integer.valueOf(st32.f299460j), Integer.valueOf(st32.f299461n), Integer.valueOf(st32.f299462o), Float.valueOf(st32.f299464q), Float.valueOf(st32.f299465r));
    }

    /* renamed from: l */
    public void mo140566l(String str, String str2) {
        long b = C10783a.m10758b();
        if (!mo140568n(str, str2, b, false)) {
            mo140565k(str, str2, b, false);
        }
    }

    /* renamed from: m */
    public void mo140567m(String str, String str2) {
        long b = C10783a.m10758b();
        if (!mo140568n(str, str2, b, true)) {
            mo140565k(str, str2, b, true);
        }
    }

    /* renamed from: n */
    public final boolean mo140568n(String str, String str2, long j, boolean z) {
        SQLiteStatement sQLiteStatement;
        Cursor h = this.f296007a.mo140226h(String.format("SELECT * FROM %s WHERE chat = ? AND talker = ? AND date = ?", new Object[]{mo129632e()}), new String[]{str, str2, String.valueOf(j)});
        try {
            C101843st3 b = h.moveToNext() ? mo140559b(h) : null;
            if (b == null) {
                return false;
            }
            if (z) {
                b.f299458h++;
                b.f299460j++;
                b.f299462o++;
            } else {
                b.f299457g++;
                b.f299459i++;
                b.f299461n++;
            }
            b.f299463p = mo140558a(b.f299458h, b.f299457g);
            b.f299464q = mo140558a(b.f299460j, b.f299459i);
            b.f299465r = mo140558a(b.f299462o, b.f299461n);
            if (z) {
                sQLiteStatement = this.f296010d;
                sQLiteStatement.bindLong(1, (long) b.f299458h);
                sQLiteStatement.bindLong(2, (long) b.f299460j);
                sQLiteStatement.bindLong(3, (long) b.f299462o);
            } else {
                sQLiteStatement = this.f296009c;
                sQLiteStatement.bindLong(1, (long) b.f299457g);
                sQLiteStatement.bindLong(2, (long) b.f299459i);
                sQLiteStatement.bindLong(3, (long) b.f299461n);
            }
            sQLiteStatement.bindDouble(4, (double) b.f299463p);
            sQLiteStatement.bindDouble(5, (double) b.f299464q);
            sQLiteStatement.bindDouble(6, (double) b.f299465r);
            sQLiteStatement.bindString(7, b.f299454d);
            sQLiteStatement.bindString(8, b.f299455e);
            sQLiteStatement.bindLong(9, b.f299456f);
            int executeUpdateDelete = sQLiteStatement.executeUpdateDelete();
            Object[] objArr = new Object[14];
            objArr[0] = mo129632e();
            objArr[1] = z ? "Open" : "Receive";
            objArr[2] = str;
            objArr[3] = str2;
            objArr[4] = Integer.valueOf(executeUpdateDelete);
            objArr[5] = Integer.valueOf(b.f299458h);
            objArr[6] = Integer.valueOf(b.f299460j);
            objArr[7] = Integer.valueOf(b.f299462o);
            objArr[8] = Integer.valueOf(b.f299457g);
            objArr[9] = Integer.valueOf(b.f299459i);
            objArr[10] = Integer.valueOf(b.f299461n);
            objArr[11] = Float.valueOf(b.f299463p);
            objArr[12] = Float.valueOf(b.f299464q);
            objArr[13] = Float.valueOf(b.f299465r);
            Log.m105925i("MicroMsg.Priority.C2CMsgBaseUsageStorage", "%s Update %s Res %s %s %d %d %d %d %d %d %d DayClickRate %.2f WeekClickRate %.2f MonthClickRate %.2f", objArr);
            return executeUpdateDelete > 0;
        } finally {
            h.close();
        }
    }
}
