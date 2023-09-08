package p404z6;

import java.nio.ByteBuffer;

/* renamed from: z6.e */
public class C23455e extends C23450a {

    /* renamed from: e */
    public final C23451b f67259e = new C23451b();

    /* renamed from: f */
    public ByteBuffer f67260f;

    /* renamed from: g */
    public long f67261g;

    /* renamed from: h */
    public final int f67262h;

    public C23455e(int i) {
        this.f67262h = i;
    }

    /* renamed from: f */
    public void mo35592f() {
        this.f67251d = 0;
        ByteBuffer byteBuffer = this.f67260f;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* renamed from: i */
    public final ByteBuffer mo36912i(int i) {
        int i2 = this.f67262h;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f67260f;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i + ")");
    }

    /* renamed from: j */
    public void mo36913j(int i) {
        ByteBuffer byteBuffer = this.f67260f;
        if (byteBuffer == null) {
            this.f67260f = mo36912i(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f67260f.position();
        int i2 = i + position;
        if (capacity < i2) {
            ByteBuffer i3 = mo36912i(i2);
            if (position > 0) {
                this.f67260f.position(0);
                this.f67260f.limit(position);
                i3.put(this.f67260f);
            }
            this.f67260f = i3;
        }
    }
}
