package px1;

import com.tencent.wcdb.database.SQLiteStatement;
import zh3.C91753f;

/* renamed from: px1.a */
public abstract class C35723a<T> extends C35726d {
    public C35723a(C91753f fVar) {
        super(fVar);
    }

    /* renamed from: b */
    public abstract void mo57906b(SQLiteStatement sQLiteStatement, T t);

    /* renamed from: c */
    public final void mo60365c(Iterable<? extends T> iterable) {
        SQLiteStatement sQLiteStatement;
        if (this.f95422a.compareAndSet(false, true)) {
            if (this.f95424c == null) {
                this.f95424c = this.f95423b.mo125615f().compileStatement(mo57905a());
            }
            sQLiteStatement = this.f95424c;
        } else {
            sQLiteStatement = this.f95423b.mo125615f().compileStatement(mo57905a());
        }
        try {
            for (Object b : iterable) {
                mo57906b(sQLiteStatement, b);
                sQLiteStatement.executeInsert();
            }
        } finally {
            if (sQLiteStatement == this.f95424c) {
                this.f95422a.set(false);
            }
        }
    }
}
