package p978i9;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* renamed from: i9.e */
public abstract class C108421e {

    /* renamed from: a */
    public volatile int f324643a = -1;

    /* renamed from: c */
    public static final <T extends C108421e> T m146905c(T t, byte[] bArr) {
        try {
            C108417a aVar = new C108417a(bArr, 0, bArr.length);
            t.mo145538b(aVar);
            if (aVar.f324636f == 0) {
                return t;
            }
            throw new C108420d("Protocol message end-group tag did not match expected tag.");
        } catch (C108420d e) {
            throw e;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    /* renamed from: d */
    public static final byte[] m146906d(C108421e eVar) {
        int a = eVar.mo145537a();
        eVar.f324643a = a;
        byte[] bArr = new byte[a];
        try {
            C108418b bVar = new C108418b(bArr, 0, a);
            eVar.mo145539e(bVar);
            if (bVar.f324640b - bVar.f324641c == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: a */
    public abstract int mo145537a();

    /* renamed from: b */
    public abstract C108421e mo145538b(C108417a aVar);

    /* renamed from: e */
    public abstract void mo145539e(C108418b bVar);

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            C87681f.m109076b((String) null, this, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            return "Error printing proto: " + e.getMessage();
        } catch (InvocationTargetException e2) {
            return "Error printing proto: " + e2.getMessage();
        }
    }
}
