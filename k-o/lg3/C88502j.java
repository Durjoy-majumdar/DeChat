package lg3;

import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: lg3.j */
public class C88502j {

    /* renamed from: a */
    public SparseArray<C88503a> f255640a;

    /* renamed from: b */
    public byte[] f255641b;

    /* renamed from: lg3.j$a */
    public static class C88503a {

        /* renamed from: a */
        public final int[] f255642a;

        public C88503a(int i, int[] iArr) {
            this.f255642a = iArr;
        }
    }

    public C88502j(SparseArray<C88503a> sparseArray, byte[] bArr) {
        this.f255640a = sparseArray;
        this.f255641b = bArr;
    }

    /* renamed from: a */
    public static C88502j m110374a(SparseArray<C88503a> sparseArray, InputStream inputStream, int i) {
        try {
            byte[] bArr = new byte[i];
            if (inputStream.read(bArr, 0, i) != i) {
                Log.m105920e("MicroMsg.language.StringArraysCollection", "[cpan] newPluralsConllection failed. data length no equal.");
            }
            return new C88502j(sparseArray, bArr);
        } catch (IOException e) {
            Log.m105921e("MicroMsg.language.StringArraysCollection", "[cpan] newPluralsConllection failed:%s", Util.stackTraceToString(e));
            return null;
        }
    }
}
