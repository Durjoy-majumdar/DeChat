package px1;

import com.tencent.wcdb.database.SQLiteStatement;
import java.util.concurrent.atomic.AtomicBoolean;
import zh3.C91753f;

/* renamed from: px1.d */
public abstract class C35726d {

    /* renamed from: a */
    public final AtomicBoolean f95422a = new AtomicBoolean(false);

    /* renamed from: b */
    public final C91753f f95423b;

    /* renamed from: c */
    public volatile SQLiteStatement f95424c;

    public C35726d(C91753f fVar) {
        this.f95423b = fVar;
    }

    /* renamed from: a */
    public abstract String mo57905a();
}
