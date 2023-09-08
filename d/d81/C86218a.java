package d81;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import junit.framework.Assert;

/* renamed from: d81.a */
public class C86218a {

    /* renamed from: a */
    public ByteBuffer f250787a;

    /* renamed from: b */
    public ByteBuffer f250788b;

    public C86218a(int i) {
        Log.m105918d("MicroMsg.exdevice.AutoBuffer", "******AutoBuffer****** capacity = " + i);
        boolean z = true;
        Assert.assertTrue(i >= 0);
        ByteBuffer allocate = ByteBuffer.allocate(i);
        this.f250788b = allocate;
        this.f250787a = allocate.asReadOnlyBuffer();
        Assert.assertTrue(this.f250788b != null);
        Assert.assertTrue(this.f250787a == null ? false : z);
    }

    /* renamed from: a */
    public int mo120650a() {
        Log.m105918d("MicroMsg.exdevice.AutoBuffer", "size = " + this.f250788b.position());
        return this.f250788b.position();
    }

    /* renamed from: b */
    public void mo120651b(byte[] bArr, int i, int i2) {
        boolean z = true;
        Assert.assertTrue(i >= 0);
        Assert.assertTrue(i2 >= 0);
        Assert.assertTrue(bArr.length >= i);
        Assert.assertTrue(bArr.length >= i + i2);
        if (this.f250787a.remaining() < i2) {
            z = false;
        }
        Assert.assertTrue(z);
        Log.m105918d("MicroMsg.exdevice.AutoBuffer", "readByte dstOffset = " + i + " byteCount = " + i2);
        this.f250787a.get(bArr, i, i2);
    }

    /* renamed from: c */
    public short mo120652c() {
        if (mo120650a() > 1) {
            short s = this.f250787a.getShort();
            Log.m105918d("MicroMsg.exdevice.AutoBuffer", "getShort = " + s);
            return s;
        }
        throw new IOException("There is only one byte in array");
    }

    /* renamed from: d */
    public void mo120653d(byte[] bArr, int i, int i2) {
        boolean z = true;
        Assert.assertTrue(i >= 0);
        Assert.assertTrue(i2 >= 0);
        if (bArr == null) {
            z = false;
        }
        Assert.assertTrue(z);
        Log.m105918d("MicroMsg.exdevice.AutoBuffer", "writeByte srcOffset = " + i + " byteCount = " + i2);
        if (i2 > this.f250788b.remaining()) {
            Log.m105918d("MicroMsg.exdevice.AutoBuffer", "byteCount > mWriteStream.remaining() Recalloc");
            Log.m105918d("MicroMsg.exdevice.AutoBuffer", "getCapacity = " + this.f250788b.capacity());
            ByteBuffer allocate = ByteBuffer.allocate(this.f250788b.capacity() + i2 + 1024);
            int position = this.f250787a.position();
            allocate.put(this.f250788b.array());
            allocate.put(bArr, i, i2);
            this.f250788b = allocate;
            ByteBuffer asReadOnlyBuffer = allocate.asReadOnlyBuffer();
            this.f250787a = asReadOnlyBuffer;
            asReadOnlyBuffer.position(position);
            return;
        }
        this.f250788b.put(bArr, i, i2);
    }
}
