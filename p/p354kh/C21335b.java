package p354kh;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p213oh.C11412b;
import p335eh.C107275e;
import p335eh.C20599b;
import p339fh.C20711f;

/* renamed from: kh.b */
public class C21335b implements C109008f {

    /* renamed from: a */
    public C21337e f60319a;

    /* JADX WARNING: type inference failed for: r2v5, types: [eh.b, java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* renamed from: a */
    public C20599b mo33378a(List<C107275e> list) {
        C20599b bVar;
        ? r2;
        byte[] bArr;
        byte[] bArr2;
        List<C107275e> list2 = list;
        if (this.f60319a == null) {
            int i = C11412b.f33577a;
            Log.m105921e("MicroMsg.Mix.AudioMixer", "mixAlgorithm must be init, please call init() first", (Object[]) null);
            return null;
        }
        if (C20711f.f58566b == null) {
            synchronized (C20711f.class) {
                if (C20711f.f58566b == null) {
                    C20711f.f58566b = new C20711f();
                }
            }
        }
        C20711f fVar = C20711f.f58566b;
        synchronized (fVar) {
            if (fVar.f58567a.size() > 0) {
                ArrayList<C20599b> arrayList = fVar.f58567a;
                bVar = arrayList.remove(arrayList.size() - 1);
            } else {
                bVar = new C20599b();
            }
        }
        C21336d dVar = (C21336d) this.f60319a;
        dVar.getClass();
        boolean z = false;
        if (list2 == null || list.size() == 0) {
            int i2 = C11412b.f33577a;
            r2 = 0;
            Log.m105921e("MicroMsg.Mix.BaseAudioMixAlgorithm", "process list is invalid", (Object[]) null);
        } else {
            int size = list.size();
            byte[][] bArr3 = new byte[size][];
            for (int i3 = 0; i3 < list.size(); i3++) {
                bArr3[i3] = list2.get(i3).f320943f;
            }
            dVar.f60327h = bVar;
            if (size == 0 || (bArr2 = bArr3[0]) == null || bArr2.length == 0) {
                bArr = null;
            } else if (size == 1) {
                bArr = bVar != null ? bVar.f57998c : null;
                if (bArr == null || bArr.length != bArr2.length) {
                    bArr = new byte[bArr2.length];
                }
                System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            } else {
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        int length = bArr2.length / 2;
                        if (!(size == dVar.f60321b && length == dVar.f60322c)) {
                            int[] iArr = new int[2];
                            iArr[1] = length;
                            iArr[0] = size;
                            dVar.f60320a = (short[][]) Array.newInstance(Short.TYPE, iArr);
                            dVar.f60321b = size;
                            dVar.f60322c = length;
                        }
                        for (int i5 = 0; i5 < size; i5++) {
                            Arrays.fill(dVar.f60320a[i5], 0, length - 1, 0);
                            for (int i6 = 0; i6 < length; i6++) {
                                short[] sArr = dVar.f60320a[i5];
                                byte[] bArr4 = bArr3[i5];
                                int i7 = i6 * 2;
                                sArr[i6] = (short) ((bArr4[i7] & ExifInterface.MARKER) | ((bArr4[i7 + 1] & 255) << 8));
                            }
                        }
                        if (dVar.f60324e != length) {
                            dVar.f60324e = length;
                            dVar.f60323d = new short[length];
                        }
                        Arrays.fill(dVar.f60323d, 0, length - 1, 0);
                        bArr = dVar.mo33380b(size, length, bArr2.length);
                    } else if (bArr3[i4].length != bArr2.length) {
                        int i8 = C11412b.f33577a;
                        Log.m105921e("MicroMsg.Mix.BaseAudioMixAlgorithm", "column of the road of audio + " + i4 + " is different.", (Object[]) null);
                        bArr = null;
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            if (bArr == null) {
                int i9 = C11412b.f33577a;
                r2 = 0;
                Log.m105921e("MicroMsg.Mix.BaseAudioMixAlgorithm", "mixed data is invalid", (Object[]) null);
            } else {
                bVar.f57998c = bArr;
                bVar.f57997b = list2.get(0).f320940c;
                bVar.f57996a = list2.get(0).f320939b;
                r2 = 0;
                z = true;
            }
        }
        if (z) {
            return bVar;
        }
        int i15 = C11412b.f33577a;
        Log.m105921e("MicroMsg.Mix.AudioMixer", "mix audio fail", r2);
        return r2;
    }
}
