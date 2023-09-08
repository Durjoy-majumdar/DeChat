package xs0;

import java.nio.ByteBuffer;
import ws0.C91102b;
import ws0.C91103c;
import xs0.C91340d;
import zs0.C91934b;

/* renamed from: xs0.b */
public class C91338b extends C91342e implements C91337a {

    /* renamed from: h */
    public static final ByteBuffer f261970h = ByteBuffer.allocate(0);

    /* renamed from: f */
    public int f261971f;

    /* renamed from: g */
    public String f261972g;

    public C91338b() {
        super(C91340d.C91341a.CLOSING);
        this.f261981a = true;
    }

    /* renamed from: b */
    public int mo125320b() {
        return this.f261971f;
    }

    /* renamed from: f */
    public ByteBuffer mo125322f() {
        return this.f261971f == 1005 ? f261970h : this.f261983c;
    }

    /* renamed from: g */
    public void mo125323g(ByteBuffer byteBuffer) {
        this.f261983c = byteBuffer;
        this.f261971f = 1005;
        byteBuffer.mark();
        if (byteBuffer.remaining() >= 2) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.position(2);
            allocate.putShort(byteBuffer.getShort());
            allocate.position(0);
            int i = allocate.getInt();
            this.f261971f = i;
            if (i == 1006 || i == 1015 || i == 1005 || i > 4999 || i < 1000 || i == 1004) {
                throw new C91103c("closecode must not be sent over the wire: " + this.f261971f);
            }
        }
        byteBuffer.reset();
        if (this.f261971f == 1005) {
            this.f261972g = C91934b.m115449a(this.f261983c);
            return;
        }
        ByteBuffer byteBuffer2 = this.f261983c;
        int position = byteBuffer2.position();
        try {
            byteBuffer2.position(byteBuffer2.position() + 2);
            this.f261972g = C91934b.m115449a(byteBuffer2);
            byteBuffer2.position(position);
        } catch (IllegalArgumentException e) {
            throw new C91103c((Throwable) e);
        } catch (Throwable th) {
            byteBuffer2.position(position);
            throw th;
        }
    }

    public String getMessage() {
        return this.f261972g;
    }

    public String toString() {
        return super.toString() + "code: " + this.f261971f;
    }

    public C91338b(int i, String str) {
        super(C91340d.C91341a.CLOSING);
        this.f261981a = true;
        String str2 = "";
        str = str == null ? str2 : str;
        if (i == 1015) {
            i = 1005;
        } else {
            str2 = str;
        }
        if (i != 1005) {
            byte[] b = C91934b.m115450b(str2);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.putInt(i);
            allocate.position(2);
            ByteBuffer allocate2 = ByteBuffer.allocate(b.length + 2);
            allocate2.put(allocate);
            allocate2.put(b);
            allocate2.rewind();
            mo125323g(allocate2);
        } else if (str2.length() > 0) {
            throw new C91102b(1002, "A close frame must have a closecode if it has a reason");
        }
    }
}
