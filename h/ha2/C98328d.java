package ha2;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.BitSet;
import ua2.C101991b;

/* renamed from: ha2.d */
public class C98328d {

    /* renamed from: a */
    public BitSet f288219a = new BitSet();

    /* renamed from: b */
    public long f288220b = -1;

    /* renamed from: c */
    public int f288221c = 0;

    /* renamed from: d */
    public String f288222d = "";

    /* renamed from: e */
    public String f288223e;

    public C98328d(String str) {
        this.f288223e = str;
    }

    /* renamed from: a */
    public void mo137656a() {
        Log.m105924i("MicroMsg.Music.IndexBitMgr", "clearCache");
        this.f288219a = new BitSet(this.f288221c);
        mo137660e(0);
        if (!TextUtils.isEmpty(this.f288222d)) {
            String str = this.f288222d;
            if (C98329e.m127108d()) {
                ((C98327c) C101991b.m134284b(C98327c.class)).mo137647e(str, (byte[]) null);
            } else {
                Log.m105920e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
            }
        }
    }

    /* renamed from: b */
    public int mo137657b(int i) {
        if (((long) i) <= this.f288220b) {
            return i / 8192;
        }
        Log.m105921e("MicroMsg.Music.IndexBitMgr", "getIndex, offset is invalid, offset:%d, fileLength:%d", Integer.valueOf(i), Long.valueOf(this.f288220b));
        return 0;
    }

    /* renamed from: c */
    public int[] mo137658c(int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            long j = this.f288220b;
            if (((long) i) <= j) {
                int i3 = i + i2;
                long j2 = (long) i3;
                if (j2 <= j) {
                    int[] iArr = {-1, -1};
                    int b = mo137657b(i);
                    int b2 = mo137657b(i3);
                    int i4 = b;
                    while (i4 <= b2) {
                        int i5 = i4 + 1;
                        int i6 = i5 * 8192;
                        if (i4 * 8192 >= i && i6 <= i3) {
                            if (iArr[0] == -1) {
                                iArr[0] = i4;
                            }
                            if (iArr[0] > i4) {
                                iArr[0] = i4;
                            }
                            if (iArr[1] == -1) {
                                iArr[1] = i4;
                            }
                            if (iArr[1] < i4) {
                                iArr[1] = i4;
                            }
                        }
                        i4 = i5;
                    }
                    if (j2 == this.f288220b && ((b2 == 0 && i == 0) || (b2 > 0 && i <= b2 * 8192))) {
                        Log.m105924i("MicroMsg.Music.IndexBitMgr", "write to file end!");
                        iArr[0] = b;
                        iArr[1] = b2;
                    }
                    return iArr;
                }
            }
        }
        Log.m105925i("MicroMsg.Music.IndexBitMgr", "getWriteBuffIndexRange offset %d, size %d, fileLength %d", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(this.f288220b));
        Log.m105920e("MicroMsg.Music.IndexBitMgr", "getWriteBuffRange invalid parameter!");
        return null;
    }

    /* renamed from: d */
    public void mo137659d() {
        boolean z = false;
        if (!TextUtils.isEmpty(this.f288222d)) {
            BitSet bitSet = this.f288219a;
            byte[] bArr = new byte[(bitSet.size() / 8)];
            for (int i = 0; i < bitSet.size(); i++) {
                int i2 = i / 8;
                bArr[i2] = (byte) (((bitSet.get(i) ? 1 : 0) << (7 - (i % 8))) | bArr[i2]);
            }
            String str = this.f288222d;
            if (C98329e.m127108d()) {
                ((C98327c) C101991b.m134284b(C98327c.class)).mo137647e(str, bArr);
            } else {
                Log.m105920e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
            }
        }
        Log.m105919d("MicroMsg.Music.IndexBitMgr", "saveBitCache bitSet:%s", this.f288219a.toString());
        Log.m105924i("MicroMsg.Music.IndexBitMgr", "saveBitCache bitSet count %d, cardinality:" + this.f288221c + "," + this.f288219a.cardinality());
        Log.m105925i("MicroMsg.Music.IndexBitMgr", "isCacheComplete, count:%d, cardinality:%d", Integer.valueOf(this.f288221c), Integer.valueOf(this.f288219a.cardinality()));
        int i3 = this.f288221c;
        if (i3 > 0 && i3 == this.f288219a.cardinality()) {
            z = true;
        }
        if (z) {
            mo137660e(1);
        }
    }

    /* renamed from: e */
    public void mo137660e(int i) {
        Log.m105925i("MicroMsg.Music.IndexBitMgr", "setFileCacheComplete %d", Integer.valueOf(i));
        if (!TextUtils.isEmpty(this.f288222d)) {
            String str = this.f288222d;
            if (C98329e.m127108d()) {
                ((C98327c) C101991b.m134284b(C98327c.class)).mo137639H(str, i);
            }
        }
    }
}
