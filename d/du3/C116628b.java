package du3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import du3.C116624a;
import java.util.Collection;
import zt3.C119146d;

/* renamed from: du3.b */
public class C116628b extends SQLiteOpenHelper implements C116631d {

    /* renamed from: d */
    public SQLiteDatabase f349724d;

    /* renamed from: du3.b$a */
    public class C116629a extends CursorWrapper {
        public C116629a(C116628b bVar, Cursor cursor) {
            super(cursor);
        }
    }

    public C116628b(Context context) {
        super(context, "Scheduler.db", (SQLiteDatabase.CursorFactory) null, 1);
        try {
            this.f349724d = getWritableDatabase();
        } catch (Exception e) {
            C119146d.f356851c.mo125764e("ExperienceStorage", "%s", e.toString());
        }
    }

    /* renamed from: a */
    public static ContentValues m164496a(C116624a.C116627c cVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("taskName", cVar.f349718a);
        contentValues.put("threadTime", Long.valueOf(cVar.f349719b));
        contentValues.put("time", Long.valueOf(cVar.f349720c));
        contentValues.put(AppMeasurement.Param.TIMESTAMP, Long.valueOf(cVar.f349722e));
        contentValues.put(TPReportKeys.Common.COMMON_MEDIA_RATE, Float.valueOf(cVar.f349723f));
        contentValues.put("scheduler", cVar.f349721d);
        return contentValues;
    }

    /* renamed from: b */
    public void mo180628b(Collection<C116624a.C116626b> collection) {
        if (this.f349724d != null && collection.size() > 0) {
            try {
                this.f349724d.beginTransaction();
                for (C116624a.C116626b next : collection) {
                    C116624a.C116627c cVar = new C116624a.C116627c(next.f349708a, next.f349711d, next.f349712e, "");
                    cVar.f349722e = System.currentTimeMillis();
                    this.f349724d.insert("DisposedTask", (String) null, m164496a(cVar));
                }
            } catch (Exception e) {
                C119146d.f356851c.mo125764e("ExperienceStorage", "%s", e.toString());
            } catch (Throwable th) {
                this.f349724d.setTransactionSuccessful();
                this.f349724d.endTransaction();
                throw th;
            }
            this.f349724d.setTransactionSuccessful();
            this.f349724d.endTransaction();
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS DisposedTask(_ID INTEGER PRIMARY KEY AUTOINCREMENT  NOT NULL, taskName TEXT NOT NULL, threadTime LONG NOT NULL, time LONG NOT NULL, rate REAL NOT NULL, timestamp LONG NOT NULL, scheduler TEXT NOT NULL )");
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS timestampIndex ON DisposedTask(timestamp)");
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS taskNameIndex ON DisposedTask(taskName)");
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
