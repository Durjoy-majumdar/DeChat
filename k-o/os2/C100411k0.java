package os2;

import android.database.Cursor;
import android.os.Looper;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import h81.C32735h;
import java.util.concurrent.ConcurrentHashMap;
import zh3.C91753f;

/* renamed from: os2.k0 */
public class C100411k0 extends C91753f {

    /* renamed from: i */
    public static ConcurrentHashMap<Integer, C100412a> f294165i;

    /* renamed from: os2.k0$a */
    public final class C100412a {

        /* renamed from: a */
        public String f294166a;

        /* renamed from: b */
        public boolean f294167b;

        public C100412a(String str, boolean z) {
            this.f294166a = str;
            this.f294167b = z;
        }
    }

    public C100411k0() {
        if (Util.getInt(((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_sns_sql_trace_switch, "0"), 0) > 0) {
            f294165i = new ConcurrentHashMap<>();
        }
    }

    public boolean execSQL(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("execSQL", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        ConcurrentHashMap<Integer, C100412a> concurrentHashMap = f294165i;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(Integer.valueOf(str2.hashCode()), new C100412a(Util.getStack().toString(), Looper.getMainLooper() == Looper.myLooper()));
        }
        boolean execSQL = super.execSQL(str, str2);
        SnsMethodCalculate.markEndTimeMs("execSQL", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return execSQL;
    }

    public Cursor rawQuery(String str, String[] strArr) {
        SnsMethodCalculate.markStartTimeMs("rawQuery", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        ConcurrentHashMap<Integer, C100412a> concurrentHashMap = f294165i;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(Integer.valueOf(str.hashCode()), new C100412a(Util.getStack().toString(), Looper.getMainLooper() == Looper.myLooper()));
        }
        Cursor rawQuery = rawQuery(str, strArr, 0);
        SnsMethodCalculate.markEndTimeMs("rawQuery", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return rawQuery;
    }

    public Cursor rawQuery(String str, String[] strArr, int i) {
        SnsMethodCalculate.markStartTimeMs("rawQuery", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        ConcurrentHashMap<Integer, C100412a> concurrentHashMap = f294165i;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(Integer.valueOf(str.hashCode()), new C100412a(Util.getStack().toString(), Looper.getMainLooper() == Looper.myLooper()));
        }
        Cursor rawQuery = super.rawQuery(str, strArr, i);
        SnsMethodCalculate.markEndTimeMs("rawQuery", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return rawQuery;
    }
}
