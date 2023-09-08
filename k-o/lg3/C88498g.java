package lg3;

import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: lg3.g */
public class C88498g {

    /* renamed from: a */
    public SparseArray<C88499a> f255634a;

    /* renamed from: b */
    public byte[] f255635b;

    /* renamed from: lg3.g$a */
    public static class C88499a {

        /* renamed from: a */
        public final int[] f255636a;

        /* renamed from: b */
        public final int[] f255637b;

        public C88499a(int i, int[] iArr, int[] iArr2) {
            this.f255636a = iArr;
            this.f255637b = iArr2;
        }
    }

    public C88498g(SparseArray<C88499a> sparseArray, byte[] bArr) {
        this.f255634a = sparseArray;
        this.f255635b = bArr;
    }

    /* renamed from: b */
    public static C88498g m110371b(SparseArray<C88499a> sparseArray, InputStream inputStream, int i) {
        try {
            byte[] bArr = new byte[i];
            if (inputStream.read(bArr, 0, i) != i) {
                Log.m105920e("MicroMsg.language.PluralsCollection", "[cpan] newPluralsConllection failed. data length no equal.");
            }
            return new C88498g(sparseArray, bArr);
        } catch (IOException e) {
            Log.m105921e("MicroMsg.language.PluralsCollection", "[cpan] newPluralsConllection failed:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    /* renamed from: a */
    public String mo122969a(int i, int i2, Object... objArr) {
        String str;
        String str2;
        try {
            int indexOfKey = this.f255634a.indexOfKey(i);
            if (indexOfKey < 0) {
                return null;
            }
            C88499a valueAt = this.f255634a.valueAt(indexOfKey);
            int length = valueAt.f255636a.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (valueAt.f255636a[i4] == i2) {
                    i3 = i4;
                }
            }
            if (indexOfKey <= this.f255634a.size() - 1) {
                if (i3 >= length - 1) {
                    byte[] bArr = this.f255635b;
                    int i5 = valueAt.f255637b[i3];
                    str = new String(bArr, i5, this.f255634a.valueAt(indexOfKey + 1).f255637b[0] - i5);
                    return (!Util.isNullOrNil(str) || objArr != null) ? String.format(str, objArr) : str;
                }
                byte[] bArr2 = this.f255635b;
                int[] iArr = valueAt.f255637b;
                int i6 = iArr[i3];
                str2 = new String(bArr2, i6, iArr[i3 + 1] - i6);
            } else if (i3 >= length - 1) {
                byte[] bArr3 = this.f255635b;
                int i7 = valueAt.f255637b[i3];
                str2 = new String(bArr3, i7, bArr3.length - i7);
            } else {
                byte[] bArr4 = this.f255635b;
                int[] iArr2 = valueAt.f255637b;
                int i8 = iArr2[i3];
                str2 = new String(bArr4, i8, iArr2[i3 + 1] - i8);
            }
            str = str2;
            if (!Util.isNullOrNil(str)) {
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.language.PluralsCollection", "[cpan] getString failed. %s", Util.stackTraceToString(e));
            return null;
        }
    }
}
