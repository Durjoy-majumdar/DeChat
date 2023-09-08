package p774zg;

import android.util.SparseArray;
import com.tencent.p014mm.plugin.appbrand.utils.C84782s1;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zg.j0 */
public class C91727j0 implements C91694e {

    /* renamed from: a */
    public final AtomicInteger f262745a = new AtomicInteger(0);

    /* renamed from: b */
    public final AtomicInteger f262746b = new AtomicInteger(0);

    /* renamed from: c */
    public final SparseArray<ByteBuffer> f262747c = new SparseArray<>();

    public void bufferStoreBindTo(long j, long j2) {
        Log.m105920e("V8EngineBufferStore", "no bind to here");
    }

    public int generateId() {
        int addAndGet;
        synchronized (this) {
            addAndGet = this.f262745a.addAndGet(1);
            this.f262747c.put(addAndGet, (Object) null);
        }
        Log.m105925i("V8EngineBufferStore", "generateId:%d", Integer.valueOf(addAndGet));
        return addAndGet;
    }

    public ByteBuffer getBuffer(int i, boolean z) {
        ByteBuffer byteBuffer;
        synchronized (this) {
            byteBuffer = this.f262747c.get(i);
            this.f262747c.remove(i);
        }
        if (byteBuffer == null) {
            Log.m105921e("V8EngineBufferStore", "getBuffer:%d not contains", Integer.valueOf(i));
            return null;
        }
        Log.m105925i("V8EngineBufferStore", "getBuffer:%d remains[%d]", Integer.valueOf(i), Integer.valueOf(this.f262746b.addAndGet(-byteBuffer.capacity())));
        return byteBuffer;
    }

    public void releaseDirectByteBuffer(ByteBuffer byteBuffer) {
    }

    public void setBuffer(int i, ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            ByteBuffer a = C84782s1.m104460a(byteBuffer);
            if (!a.isDirect()) {
                Log.m105925i("V8EngineBufferStore", "setBuffer:%d cannot convert to direct buffer", Integer.valueOf(i));
                return;
            }
            synchronized (this) {
                if (this.f262747c.indexOfKey(i) < 0) {
                    Log.m105925i("V8EngineBufferStore", "setBuffer:%d not contains", Integer.valueOf(i));
                    return;
                }
                this.f262747c.put(i, a);
                Log.m105925i("V8EngineBufferStore", "setBuffer %d isDirect:%b remains[%d]", Integer.valueOf(i), Boolean.valueOf(byteBuffer.isDirect()), Integer.valueOf(this.f262746b.addAndGet(byteBuffer.capacity())));
            }
        }
    }

    public boolean supportBufferStoreBindTo() {
        return false;
    }
}
