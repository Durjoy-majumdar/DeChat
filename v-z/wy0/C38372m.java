package wy0;

import com.tencent.wcdb.database.SQLiteDatabase;
import java.util.concurrent.Callable;
import yy0.C102971b;

/* renamed from: wy0.m */
public final class C38372m<V> implements Callable {

    /* renamed from: d */
    public final /* synthetic */ long f101247d;

    public C38372m(long j) {
        this.f101247d = j;
    }

    public Object call() {
        C102971b bVar = C102520l.f301872b;
        long j = this.f101247d;
        SQLiteDatabase f = bVar.f303871d.mo125615f();
        try {
            f.execSQL("DELETE FROM WxFileIndexLinkify WHERE id = ?", new Object[]{Long.valueOf(j)});
            return Boolean.TRUE;
        } catch (Throwable th) {
            throw new RuntimeException("deleteLinkifyById failed : " + th.getMessage());
        }
    }
}
