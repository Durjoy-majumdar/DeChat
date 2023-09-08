package p1188d4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabaseConfiguration;
import java.io.Closeable;
import java.io.File;

/* renamed from: d4.c */
public interface C116563c extends Closeable {

    /* renamed from: d4.c$a */
    public static abstract class C116564a {

        /* renamed from: a */
        public final int f349578a;

        public C116564a(int i) {
            this.f349578a = i;
        }

        /* renamed from: a */
        public final void mo180544a(String str) {
            if (!str.equalsIgnoreCase(SQLiteDatabaseConfiguration.MEMORY_DB_PATH) && str.trim().length() != 0) {
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        public abstract void mo180545b(C116562b bVar, int i, int i2);
    }

    /* renamed from: d4.c$b */
    public static class C116565b {

        /* renamed from: a */
        public final Context f349579a;

        /* renamed from: b */
        public final String f349580b;

        /* renamed from: c */
        public final C116564a f349581c;

        /* renamed from: d */
        public final boolean f349582d;

        public C116565b(Context context, String str, C116564a aVar, boolean z) {
            this.f349579a = context;
            this.f349580b = str;
            this.f349581c = aVar;
            this.f349582d = z;
        }
    }

    /* renamed from: d4.c$c */
    public interface C116566c {
        /* renamed from: a */
        C116563c mo180546a(C116565b bVar);
    }

    /* renamed from: K */
    C116562b mo180540K();

    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}
