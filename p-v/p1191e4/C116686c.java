package p1191e4;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.File;
import java.util.List;
import p1188d4.C116561a;
import p1188d4.C116562b;
import p1188d4.C116563c;
import p1223z3.C119033f;
import p1223z3.C119038g;
import p1223z3.C119043h;

/* renamed from: e4.c */
public class C116686c implements C116563c {

    /* renamed from: d */
    public final Context f349943d;

    /* renamed from: e */
    public final String f349944e;

    /* renamed from: f */
    public final C116563c.C116564a f349945f;

    /* renamed from: g */
    public final boolean f349946g;

    /* renamed from: h */
    public final Object f349947h = new Object();

    /* renamed from: i */
    public C116687a f349948i;

    /* renamed from: j */
    public boolean f349949j;

    /* renamed from: e4.c$a */
    public static class C116687a extends SQLiteOpenHelper {

        /* renamed from: d */
        public final C116683a[] f349950d;

        /* renamed from: e */
        public final C116563c.C116564a f349951e;

        /* renamed from: f */
        public boolean f349952f;

        /* renamed from: e4.c$a$a */
        public class C116688a implements DatabaseErrorHandler {

            /* renamed from: a */
            public final /* synthetic */ C116563c.C116564a f349953a;

            /* renamed from: b */
            public final /* synthetic */ C116683a[] f349954b;

            public C116688a(C116563c.C116564a aVar, C116683a[] aVarArr) {
                this.f349953a = aVar;
                this.f349954b = aVarArr;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
                r2 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
                if (r1 != null) goto L_0x0045;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
                r5 = r1.iterator();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
                if (r5.hasNext() != false) goto L_0x004f;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
                r0.mo180544a((java.lang.String) r5.next().second);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
                r0.mo180544a(r5.f349940d.getPath());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
                throw r2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
                if ((r3.f349940d == r5) == false) goto L_0x0012;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003f */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[ExcHandler: all (r2v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r1 
              PHI: (r1v11 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r1v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r1v5 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r1v5 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:12:0x0036, B:15:0x003f, B:16:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:12:0x0036] */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x006a  */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x0082  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onCorruption(android.database.sqlite.SQLiteDatabase r5) {
                /*
                    r4 = this;
                    d4.c$a r0 = r4.f349953a
                    e4.a[] r1 = r4.f349954b
                    r2 = 0
                    r3 = r1[r2]
                    if (r3 == 0) goto L_0x0012
                    android.database.sqlite.SQLiteDatabase r3 = r3.f349940d
                    if (r3 != r5) goto L_0x000f
                    r3 = 1
                    goto L_0x0010
                L_0x000f:
                    r3 = 0
                L_0x0010:
                    if (r3 != 0) goto L_0x0019
                L_0x0012:
                    e4.a r3 = new e4.a
                    r3.<init>(r5)
                    r1[r2] = r3
                L_0x0019:
                    r5 = r1[r2]
                    r0.getClass()
                    android.database.sqlite.SQLiteDatabase r1 = r5.f349940d
                    r1.getPath()
                    android.database.sqlite.SQLiteDatabase r1 = r5.f349940d
                    boolean r1 = r1.isOpen()
                    if (r1 != 0) goto L_0x0035
                    android.database.sqlite.SQLiteDatabase r5 = r5.f349940d
                    java.lang.String r5 = r5.getPath()
                    r0.mo180544a(r5)
                    goto L_0x008b
                L_0x0035:
                    r1 = 0
                    android.database.sqlite.SQLiteDatabase r2 = r5.f349940d     // Catch:{ SQLiteException -> 0x003f, all -> 0x003d }
                    java.util.List r1 = r2.getAttachedDbs()     // Catch:{ SQLiteException -> 0x003f, all -> 0x003d }
                    goto L_0x003f
                L_0x003d:
                    r2 = move-exception
                    goto L_0x0043
                L_0x003f:
                    r5.close()     // Catch:{ IOException -> 0x0067, all -> 0x003d }
                    goto L_0x0068
                L_0x0043:
                    if (r1 == 0) goto L_0x005d
                    java.util.Iterator r5 = r1.iterator()
                L_0x0049:
                    boolean r1 = r5.hasNext()
                    if (r1 == 0) goto L_0x0066
                    java.lang.Object r1 = r5.next()
                    android.util.Pair r1 = (android.util.Pair) r1
                    java.lang.Object r1 = r1.second
                    java.lang.String r1 = (java.lang.String) r1
                    r0.mo180544a(r1)
                    goto L_0x0049
                L_0x005d:
                    android.database.sqlite.SQLiteDatabase r5 = r5.f349940d
                    java.lang.String r5 = r5.getPath()
                    r0.mo180544a(r5)
                L_0x0066:
                    throw r2
                L_0x0067:
                L_0x0068:
                    if (r1 == 0) goto L_0x0082
                    java.util.Iterator r5 = r1.iterator()
                L_0x006e:
                    boolean r1 = r5.hasNext()
                    if (r1 == 0) goto L_0x008b
                    java.lang.Object r1 = r5.next()
                    android.util.Pair r1 = (android.util.Pair) r1
                    java.lang.Object r1 = r1.second
                    java.lang.String r1 = (java.lang.String) r1
                    r0.mo180544a(r1)
                    goto L_0x006e
                L_0x0082:
                    android.database.sqlite.SQLiteDatabase r5 = r5.f349940d
                    java.lang.String r5 = r5.getPath()
                    r0.mo180544a(r5)
                L_0x008b:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p1191e4.C116686c.C116687a.C116688a.onCorruption(android.database.sqlite.SQLiteDatabase):void");
            }
        }

        public C116687a(Context context, String str, C116683a[] aVarArr, C116563c.C116564a aVar) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f349578a, new C116688a(aVar, aVarArr));
            this.f349951e = aVar;
            this.f349950d = aVarArr;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
            if ((r2.f349940d == r4) == false) goto L_0x0010;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p1191e4.C116683a mo180692a(android.database.sqlite.SQLiteDatabase r4) {
            /*
                r3 = this;
                e4.a[] r0 = r3.f349950d
                r1 = 0
                r2 = r0[r1]
                if (r2 == 0) goto L_0x0010
                android.database.sqlite.SQLiteDatabase r2 = r2.f349940d
                if (r2 != r4) goto L_0x000d
                r2 = 1
                goto L_0x000e
            L_0x000d:
                r2 = 0
            L_0x000e:
                if (r2 != 0) goto L_0x0017
            L_0x0010:
                e4.a r2 = new e4.a
                r2.<init>(r4)
                r0[r1] = r2
            L_0x0017:
                r4 = r0[r1]
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p1191e4.C116686c.C116687a.mo180692a(android.database.sqlite.SQLiteDatabase):e4.a");
        }

        /* renamed from: b */
        public synchronized C116562b mo180693b() {
            this.f349952f = false;
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (this.f349952f) {
                close();
                return mo180693b();
            }
            return mo180692a(writableDatabase);
        }

        public synchronized void close() {
            super.close();
            this.f349950d[0] = null;
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            C116563c.C116564a aVar = this.f349951e;
            mo180692a(sQLiteDatabase);
            aVar.getClass();
        }

        /* JADX INFO: finally extract failed */
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            C116563c.C116564a aVar = this.f349951e;
            C116683a a = mo180692a(sQLiteDatabase);
            C119043h hVar = (C119043h) aVar;
            hVar.getClass();
            Cursor e = a.mo180687e("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z = e.moveToFirst() && e.getInt(0) == 0;
                e.close();
                hVar.f356543c.mo165536a(a);
                if (!z) {
                    C119043h.C119045b b = hVar.f356543c.mo165537b(a);
                    if (!b.f356545a) {
                        throw new IllegalStateException("Pre-packaged database has an invalid schema: " + b.f356546b);
                    }
                }
                hVar.mo183708c(a);
                WorkDatabase_Impl.C113043a aVar2 = (WorkDatabase_Impl.C113043a) hVar.f356543c;
                WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
                int i = WorkDatabase_Impl.f338357s;
                List<C119038g.C119040b> list = workDatabase_Impl.f356523g;
                if (list != null) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        WorkDatabase_Impl.this.f356523g.get(i2).getClass();
                    }
                }
            } catch (Throwable th) {
                e.close();
                throw th;
            }
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f349952f = true;
            ((C119043h) this.f349951e).mo180545b(mo180692a(sQLiteDatabase), i, i2);
        }

        /* JADX INFO: finally extract failed */
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f349952f) {
                C116563c.C116564a aVar = this.f349951e;
                C116683a a = mo180692a(sQLiteDatabase);
                C119043h hVar = (C119043h) aVar;
                hVar.getClass();
                Cursor e = a.mo180687e("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
                try {
                    boolean z = e.moveToFirst() && e.getInt(0) != 0;
                    e.close();
                    if (z) {
                        Cursor d = a.mo180686d(new C116561a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                        try {
                            String string = d.moveToFirst() ? d.getString(0) : null;
                            d.close();
                            if (!"c103703e120ae8cc73c9248622f3cd1e".equals(string) && !"49f946663a8deb7054212b8adda248c6".equals(string)) {
                                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                            }
                        } catch (Throwable th) {
                            d.close();
                            throw th;
                        }
                    } else {
                        C119043h.C119045b b = hVar.f356543c.mo165537b(a);
                        if (b.f356545a) {
                            hVar.f356543c.getClass();
                            hVar.mo183708c(a);
                        } else {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + b.f356546b);
                        }
                    }
                    WorkDatabase_Impl.C113043a aVar2 = (WorkDatabase_Impl.C113043a) hVar.f356543c;
                    WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
                    int i = WorkDatabase_Impl.f338357s;
                    workDatabase_Impl.f356517a = a;
                    a.mo180684c("PRAGMA foreign_keys = ON");
                    C119033f fVar = WorkDatabase_Impl.this.f356520d;
                    synchronized (fVar) {
                        if (!fVar.f356506f) {
                            a.mo180684c("PRAGMA temp_store = MEMORY;");
                            a.mo180684c("PRAGMA recursive_triggers='ON';");
                            a.mo180684c("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                            fVar.mo183696c(a);
                            fVar.f356507g = new C116691f(a.f349940d.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "));
                            fVar.f356506f = true;
                        }
                    }
                    List<C119038g.C119040b> list = WorkDatabase_Impl.this.f356523g;
                    if (list != null) {
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            WorkDatabase_Impl.this.f356523g.get(i2).mo182733a(a);
                        }
                    }
                    hVar.f356542b = null;
                } catch (Throwable th4) {
                    e.close();
                    throw th4;
                }
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f349952f = true;
            this.f349951e.mo180545b(mo180692a(sQLiteDatabase), i, i2);
        }
    }

    public C116686c(Context context, String str, C116563c.C116564a aVar, boolean z) {
        this.f349943d = context;
        this.f349944e = str;
        this.f349945f = aVar;
        this.f349946g = z;
    }

    /* renamed from: K */
    public C116562b mo180540K() {
        return mo180691a().mo180693b();
    }

    /* renamed from: a */
    public final C116687a mo180691a() {
        C116687a aVar;
        synchronized (this.f349947h) {
            if (this.f349948i == null) {
                C116683a[] aVarArr = new C116683a[1];
                if (Build.VERSION.SDK_INT < 23 || this.f349944e == null || !this.f349946g) {
                    this.f349948i = new C116687a(this.f349943d, this.f349944e, aVarArr, this.f349945f);
                } else {
                    this.f349948i = new C116687a(this.f349943d, new File(this.f349943d.getNoBackupFilesDir(), this.f349944e).getAbsolutePath(), aVarArr, this.f349945f);
                }
                this.f349948i.setWriteAheadLoggingEnabled(this.f349949j);
            }
            aVar = this.f349948i;
        }
        return aVar;
    }

    public void close() {
        mo180691a().close();
    }

    public String getDatabaseName() {
        return this.f349944e;
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f349947h) {
            C116687a aVar = this.f349948i;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z);
            }
            this.f349949j = z;
        }
    }
}
