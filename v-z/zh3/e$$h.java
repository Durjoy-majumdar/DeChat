package zh3;

import com.tencent.p014mm.sdk.storage.ISQLCancelable;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.support.CancellationSignal;

public class e$$h extends e$$i implements ISQLCancelable {

    /* renamed from: f */
    public CancellationSignal f356761f;

    public e$$h(Cursor cursor, String str, CancellationSignal cancellationSignal) {
        super(cursor, str);
        this.f356761f = cancellationSignal;
    }

    public void cancel() {
        this.f356761f.cancel();
    }

    public boolean isCanceled() {
        return this.f356761f.isCanceled();
    }

    public void throwIfCanceled() {
        this.f356761f.throwIfCanceled();
    }
}
