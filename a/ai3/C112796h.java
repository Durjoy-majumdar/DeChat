package ai3;

import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDirectQuery;
import com.tencent.wcdb.support.CancellationSignal;

/* renamed from: ai3.h */
public final class C112796h extends SQLiteDirectQuery {
    public C112796h(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
        super(sQLiteDatabase, str, (Object[]) null, cancellationSignal);
    }

    public String toString() {
        return "SQLiteNewQuery: " + getSql();
    }
}
