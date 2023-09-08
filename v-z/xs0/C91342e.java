package xs0;

import java.nio.ByteBuffer;
import java.util.Arrays;
import xs0.C91340d;
import zs0.C91934b;

/* renamed from: xs0.e */
public class C91342e implements C91339c {

    /* renamed from: e */
    public static byte[] f261980e = new byte[0];

    /* renamed from: a */
    public boolean f261981a;

    /* renamed from: b */
    public C91340d.C91341a f261982b;

    /* renamed from: c */
    public ByteBuffer f261983c;

    /* renamed from: d */
    public boolean f261984d;

    public C91342e() {
    }

    /* renamed from: a */
    public boolean mo125325a() {
        return this.f261984d;
    }

    /* renamed from: c */
    public void mo125326c(C91340d dVar) {
        ByteBuffer f = dVar.mo125322f();
        if (this.f261983c == null) {
            this.f261983c = ByteBuffer.allocate(f.remaining());
            f.mark();
            this.f261983c.put(f);
            f.reset();
        } else {
            f.mark();
            ByteBuffer byteBuffer = this.f261983c;
            byteBuffer.position(byteBuffer.limit());
            ByteBuffer byteBuffer2 = this.f261983c;
            byteBuffer2.limit(byteBuffer2.capacity());
            if (f.remaining() > this.f261983c.remaining()) {
                ByteBuffer allocate = ByteBuffer.allocate(f.remaining() + this.f261983c.capacity());
                this.f261983c.flip();
                allocate.put(this.f261983c);
                allocate.put(f);
                this.f261983c = allocate;
            } else {
                this.f261983c.put(f);
            }
            this.f261983c.rewind();
            f.reset();
        }
        this.f261981a = dVar.mo125328e();
    }

    /* renamed from: d */
    public C91340d.C91341a mo125327d() {
        return this.f261982b;
    }

    /* renamed from: e */
    public boolean mo125328e() {
        return this.f261981a;
    }

    /* renamed from: f */
    public ByteBuffer mo125322f() {
        return this.f261983c;
    }

    /* renamed from: g */
    public void mo125323g(ByteBuffer byteBuffer) {
        this.f261983c = byteBuffer;
    }

    public String toString() {
        return "Framedata{ optcode:" + this.f261982b + ", fin:" + this.f261981a + ", payloadlength:[pos:" + this.f261983c.position() + ", len:" + this.f261983c.remaining() + "], payload:" + Arrays.toString(C91934b.m115450b(new String(this.f261983c.array()))) + "}";
    }

    public C91342e(C91340d.C91341a aVar) {
        this.f261982b = aVar;
        this.f261983c = ByteBuffer.wrap(f261980e);
    }

    public C91342e(C91340d dVar) {
        this.f261981a = dVar.mo125328e();
        this.f261982b = dVar.mo125327d();
        this.f261983c = dVar.mo125322f();
        this.f261984d = dVar.mo125325a();
    }
}
