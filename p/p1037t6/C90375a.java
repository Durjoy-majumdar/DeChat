package p1037t6;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p673r6.C89876b;

/* renamed from: t6.a */
public class C90375a {
    /* renamed from: a */
    public static ByteBuffer m113171a(InputStream inputStream, boolean z) {
        if (!z && !inputStream.markSupported()) {
            if (!inputStream.markSupported()) {
                inputStream = inputStream instanceof FileInputStream ? new C90376b((FileInputStream) inputStream) : new BufferedInputStream(inputStream);
            }
            inputStream.mark(8388608);
        }
        if (inputStream == null) {
            return null;
        }
        byte[] bArr = new byte[10000];
        int i = 100000;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(100000);
        allocateDirect.order(ByteOrder.nativeOrder());
        int i2 = 0;
        int i3 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr);
                i2 += read;
                if (i2 > i) {
                    allocateDirect = m113172b(allocateDirect);
                    i = allocateDirect.capacity();
                }
                if (read < 0) {
                    break;
                }
                allocateDirect.position(i3);
                allocateDirect.put(bArr, 0, read);
                i3 += read;
            } catch (IOException e) {
                C89876b.m112386c("Ni.ByteBufferUtil", e, "hy: allocateByteBufferFromStream IOException", new Object[0]);
                if (z) {
                    try {
                        inputStream.close();
                    } catch (Exception e2) {
                        C89876b.m112386c("Ni.ByteBufferUtil", e2, "hy: exception in finally!", new Object[0]);
                    }
                } else {
                    inputStream.reset();
                }
                return null;
            } catch (BufferOverflowException e3) {
                C89876b.m112386c("Ni.ByteBufferUtil", e3, "hy: allocateByteBufferFromStream BufferOverflowException", new Object[0]);
                if (z) {
                    try {
                        inputStream.close();
                    } catch (Exception e4) {
                        C89876b.m112386c("Ni.ByteBufferUtil", e4, "hy: exception in finally!", new Object[0]);
                    }
                } else {
                    inputStream.reset();
                }
            } catch (Throwable th) {
                if (z) {
                    try {
                        inputStream.close();
                    } catch (Exception e5) {
                        C89876b.m112386c("Ni.ByteBufferUtil", e5, "hy: exception in finally!", new Object[0]);
                    }
                } else {
                    inputStream.reset();
                }
                throw th;
            }
        }
        allocateDirect.position(0);
        if (z) {
            try {
                inputStream.close();
            } catch (Exception e6) {
                C89876b.m112386c("Ni.ByteBufferUtil", e6, "hy: exception in finally!", new Object[0]);
            }
        } else {
            inputStream.reset();
        }
        return allocateDirect;
    }

    /* renamed from: b */
    public static ByteBuffer m113172b(ByteBuffer byteBuffer) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity() + 100000);
        allocateDirect.order(ByteOrder.nativeOrder());
        byteBuffer.position(0);
        allocateDirect.put(byteBuffer);
        return allocateDirect;
    }
}
