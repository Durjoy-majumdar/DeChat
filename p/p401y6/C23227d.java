package p401y6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: y6.d */
public interface C23227d {

    /* renamed from: a */
    public static final ByteBuffer f66676a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: y6.d$a */
    public static final class C23228a extends Exception {
        public C23228a(int i, int i2, int i3) {
            super("Unhandled format: " + i + " Hz, " + i2 + " channels in encoding " + i3);
        }
    }

    /* renamed from: a */
    boolean mo36678a();

    /* renamed from: b */
    boolean mo36679b();

    /* renamed from: c */
    int mo36680c();

    /* renamed from: d */
    ByteBuffer mo36681d();

    /* renamed from: e */
    boolean mo36682e(int i, int i2, int i3);

    /* renamed from: f */
    void mo36683f(ByteBuffer byteBuffer);

    void flush();

    /* renamed from: g */
    int mo36685g();

    /* renamed from: h */
    void mo36686h();

    void reset();
}
