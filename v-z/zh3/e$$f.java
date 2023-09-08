package zh3;

import com.tencent.p014mm.sdk.storage.ISQLCancelable;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.CursorWrapper;
import com.tencent.wcdb.support.CancellationSignal;

public class e$$f extends CursorWrapper implements ISQLCancelable {

    /* renamed from: d */
    public CancellationSignal f356760d;

    public e$$f(Cursor cursor, CancellationSignal cancellationSignal) {
        super(cursor);
        this.f356760d = cancellationSignal;
    }

    public void cancel() {
        this.f356760d.cancel();
    }

    public boolean isCanceled() {
        return this.f356760d.isCanceled();
    }

    public void throwIfCanceled() {
        this.f356760d.throwIfCanceled();
    }
}
