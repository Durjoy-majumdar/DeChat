package lg3;

import android.util.SparseIntArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: lg3.l */
public class C88505l {

    /* renamed from: a */
    public SparseIntArray f255651a;

    /* renamed from: b */
    public byte[] f255652b;

    public C88505l(SparseIntArray sparseIntArray, byte[] bArr) {
        this.f255651a = sparseIntArray;
        this.f255652b = bArr;
    }

    /* renamed from: a */
    public static C88505l m110382a(SparseIntArray sparseIntArray, InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        try {
            if (inputStream.read(bArr, 0, i) != i) {
                Log.m105920e("MicroMsg.language.StringsCollection", "[cpan] newStringsCollection failed. data length no equal.");
            }
            return new C88505l(sparseIntArray, bArr);
        } catch (IOException e) {
            Log.m105921e("MicroMsg.language.StringsCollection", "[cpan] newStringsCollection failed. %s", Util.stackTraceToString(e));
            return null;
        }
    }
}
