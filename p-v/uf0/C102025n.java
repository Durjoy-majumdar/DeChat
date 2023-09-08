package uf0;

import android.util.Pair;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: uf0.n */
public class C102025n extends C102014a {

    /* renamed from: A */
    public List<C102024m> f300439A = new ArrayList();

    /* renamed from: B */
    public List<Pair> f300440B = new ArrayList();

    /* renamed from: C */
    public Pair<Integer, Long>[] f300441C;

    /* renamed from: D */
    public long[] f300442D;

    /* renamed from: E */
    public int[] f300443E;

    /* renamed from: F */
    public int[] f300444F;

    /* renamed from: G */
    public int[] f300445G;

    /* renamed from: H */
    public int[] f300446H;

    /* renamed from: I */
    public int[] f300447I;

    /* renamed from: J */
    public long f300448J = 0;

    /* renamed from: K */
    public long f300449K = 0;

    /* renamed from: L */
    public long f300450L = 0;

    /* renamed from: M */
    public boolean f300451M = false;

    /* renamed from: N */
    public long[] f300452N = null;

    /* renamed from: O */
    public long[] f300453O;

    /* renamed from: P */
    public byte[] f300454P = null;

    /* renamed from: Q */
    public int f300455Q = 0;

    /* renamed from: R */
    public int[] f300456R;

    /* renamed from: w */
    public long f300457w;

    /* renamed from: x */
    public long f300458x;

    /* renamed from: y */
    public long f300459y;

    /* renamed from: z */
    public int f300460z;

    public C102025n(int i, long j, int i2, long j2) {
        super(i, j, i2, j2);
        new HashMap();
    }

    /* renamed from: b */
    public final int mo141526b(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.f300456R;
            if (i2 >= iArr.length) {
                return 0;
            }
            if (i <= iArr[i2]) {
                return i2;
            }
            i2++;
        }
    }

    /* renamed from: c */
    public final long mo141527c(int i) {
        int[] iArr = this.f300443E;
        if (iArr != null) {
            return (long) iArr[i];
        }
        long[] jArr = this.f300453O;
        if (jArr != null) {
            return jArr[i];
        }
        return 0;
    }

    /* renamed from: d */
    public final Pair<Integer, Integer> mo141528d(int i) {
        int i2 = 0;
        if (this.f300456R == null) {
            long currentTicks = Util.currentTicks();
            mo141530f();
            Log.m105925i("MicroMsg.StblAtom", "createChunkTable cost:%sms", Long.valueOf(Util.ticksToNow(currentTicks)));
        }
        long[] jArr = this.f300442D;
        if (i >= jArr.length) {
            return null;
        }
        int i3 = (int) jArr[i];
        if (i3 < 0) {
            Log.m105921e("MicroMsg.StblAtom", "calcSampleBeginEndId %s not found in timeTable", Integer.valueOf(i));
            return null;
        }
        int b = mo141526b(i3);
        if (b >= 1) {
            i2 = b - 1;
        }
        return new Pair<>(Integer.valueOf(this.f300456R[i2] + 1), Integer.valueOf(i3));
    }

    /* renamed from: e */
    public final long mo141529e(int i, int i2) {
        int[] iArr = this.f300444F;
        if (iArr.length == 1) {
            return ((long) iArr[0]) * ((long) (i2 - i));
        }
        long j = 0;
        while (i <= i2) {
            j += (long) this.f300444F[i];
            i++;
        }
        return j;
    }

    /* renamed from: f */
    public final void mo141530f() {
        int[] iArr = this.f300443E;
        int length = (iArr != null ? iArr.length : this.f300453O.length) - 1;
        int length2 = this.f300446H.length;
        for (int i = 1; i < length2; i++) {
            int[] iArr2 = this.f300446H;
            int i2 = i - 1;
            iArr2[i2] = iArr2[i] - iArr2[i2];
        }
        int[] iArr3 = this.f300446H;
        int i3 = length2 - 1;
        iArr3[i3] = (length - iArr3[i3]) + 1;
        int[] iArr4 = new int[(length + 1)];
        this.f300456R = iArr4;
        iArr4[0] = 0;
        int i4 = 1;
        for (int i5 = 0; i5 < length2; i5++) {
            int i6 = this.f300446H[i5];
            int i7 = this.f300447I[i5];
            for (int i8 = 0; i8 < i6; i8++) {
                int[] iArr5 = this.f300456R;
                iArr5[i4] = iArr5[i4 - 1] + i7;
                i4++;
            }
        }
        Log.m105925i("MicroMsg.StblAtom", "create chunkTable size:%s", Integer.valueOf(this.f300456R.length));
    }

    /* renamed from: g */
    public final long mo141531g(RandomAccessFile randomAccessFile, int i) {
        RandomAccessFile randomAccessFile2 = randomAccessFile;
        if (!C102016c.m134346h(randomAccessFile2, (long) 4)) {
            return -1;
        }
        byte[] bArr = new byte[8];
        if (randomAccessFile2.read(bArr, 0, 4) < 4) {
            Log.m105928w("MicroMsg.StblAtom", "co64 read entry count error");
            return -1;
        }
        int e = C102016c.m134343e(bArr, 0);
        long j = ((long) e) * 8;
        long j2 = 0;
        if (j <= 0 || j > ((long) (i - 16))) {
            Log.m105928w("MicroMsg.StblAtom", "stco error entryCount : " + e);
            return -1;
        }
        int i2 = 1;
        this.f300453O = new long[(e + 1)];
        int read = randomAccessFile2.read(bArr);
        while (true) {
            if (read < 8) {
                break;
            }
            j2 += (long) read;
            int i3 = i2 + 1;
            this.f300453O[i2] = C102016c.m134344f(bArr, 0);
            if (j2 >= j) {
                Log.m105918d("MicroMsg.StblAtom", "read stco atom end");
                break;
            }
            read = randomAccessFile2.read(bArr);
            i2 = i3;
        }
        return j2 + ((long) 8);
    }

    /* renamed from: h */
    public final long mo141532h(RandomAccessFile randomAccessFile, int i) {
        RandomAccessFile randomAccessFile2 = randomAccessFile;
        if (!C102016c.m134346h(randomAccessFile2, (long) 4)) {
            return -1;
        }
        byte[] bArr = new byte[4];
        if (randomAccessFile2.read(bArr, 0, 4) < 4) {
            Log.m105928w("MicroMsg.StblAtom", "stco read entry count error");
            return -1;
        }
        int e = C102016c.m134343e(bArr, 0);
        long j = ((long) e) * 4;
        long j2 = 0;
        if (j <= 0 || j > ((long) (i - 16))) {
            Log.m105928w("MicroMsg.StblAtom", "stco error entryCount : " + e);
            return -1;
        }
        int i2 = 1;
        this.f300443E = new int[(e + 1)];
        int read = randomAccessFile2.read(bArr);
        while (true) {
            if (read < 4) {
                break;
            }
            j2 += (long) read;
            int i3 = i2 + 1;
            this.f300443E[i2] = C102016c.m134343e(bArr, 0);
            if (j2 >= j) {
                Log.m105918d("MicroMsg.StblAtom", "read stco atom end");
                break;
            }
            read = randomAccessFile2.read(bArr);
            i2 = i3;
        }
        return j2 + ((long) 8);
    }

    /* renamed from: i */
    public final long mo141533i(RandomAccessFile randomAccessFile, int i) {
        RandomAccessFile randomAccessFile2 = randomAccessFile;
        if (!C102016c.m134346h(randomAccessFile2, (long) 4)) {
            return -1;
        }
        int i2 = 12;
        byte[] bArr = new byte[12];
        if (randomAccessFile2.read(bArr, 0, 4) < 4) {
            Log.m105928w("MicroMsg.StblAtom", "stsc read entry count error");
            return -1;
        }
        int e = C102016c.m134343e(bArr, 0);
        long j = ((long) e) * 12;
        if (j <= ((long) (i - 16))) {
            long j2 = 0;
            if (j > 0) {
                Log.m105918d("MicroMsg.StblAtom", "handle stsc entryCount : " + e);
                this.f300446H = new int[e];
                this.f300447I = new int[e];
                int read = randomAccessFile2.read(bArr);
                int i3 = 0;
                while (true) {
                    if (read < i2) {
                        break;
                    }
                    j2 += (long) read;
                    this.f300446H[i3] = C102016c.m134343e(bArr, 0);
                    this.f300447I[i3] = C102016c.m134343e(bArr, 4);
                    i3++;
                    if (j2 >= j) {
                        Log.m105918d("MicroMsg.StblAtom", "read stsc atom end");
                        break;
                    }
                    read = randomAccessFile2.read(bArr);
                    i2 = 12;
                }
                return j2 + ((long) 8);
            }
        }
        Log.m105928w("MicroMsg.StblAtom", "stsc error entryCount : " + e);
        return -1;
    }

    /* renamed from: j */
    public final long mo141534j(RandomAccessFile randomAccessFile, int i) {
        RandomAccessFile randomAccessFile2 = randomAccessFile;
        if (!C102016c.m134346h(randomAccessFile2, (long) 4)) {
            return -1;
        }
        byte[] bArr = new byte[4];
        if (randomAccessFile2.read(bArr, 0, 4) < 4) {
            Log.m105928w("MicroMsg.StblAtom", "stss rread entry count error");
            return -1;
        }
        int e = C102016c.m134343e(bArr, 0);
        long j = ((long) e) * 4;
        long j2 = 0;
        if (j <= 0 || j > ((long) (i - 16))) {
            Log.m105928w("MicroMsg.StblAtom", "stss error entryCount : " + e);
            return -1;
        }
        this.f300445G = new int[e];
        int read = randomAccessFile2.read(bArr);
        int i2 = 0;
        while (true) {
            if (read < 4) {
                break;
            }
            j2 += (long) read;
            int i3 = i2 + 1;
            this.f300445G[i2] = C102016c.m134343e(bArr, 0);
            if (j2 >= j) {
                Log.m105918d("MicroMsg.StblAtom", "read stss atom end");
                break;
            }
            read = randomAccessFile2.read(bArr);
            i2 = i3;
        }
        Log.m105925i("MicroMsg.StblAtom", "handleStssAtom, stssSampleId.size:%s", Integer.valueOf(this.f300445G.length));
        return j2 + ((long) 8);
    }

    /* renamed from: k */
    public final long mo141535k(RandomAccessFile randomAccessFile, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        RandomAccessFile randomAccessFile2 = randomAccessFile;
        int i6 = 4;
        if (!C102016c.m134346h(randomAccessFile2, (long) 4)) {
            return -1;
        }
        int i7 = 8;
        byte[] bArr = new byte[8];
        int i8 = 0;
        if (randomAccessFile2.read(bArr, 0, 4) < 4) {
            Log.m105928w("MicroMsg.StblAtom", "stts read entry count error");
            return -1;
        }
        int e = C102016c.m134343e(bArr, 0);
        long j = ((long) e) * 8;
        if (j > ((long) (i - 16)) || j <= 0) {
            Log.m105928w("MicroMsg.StblAtom", "stts error entryCount : " + e);
            return -1;
        }
        long[] jArr = new long[(((int) (this.f300458x / this.f300457w)) + 2)];
        this.f300442D = jArr;
        Arrays.fill(jArr, -1);
        this.f300442D[0] = 1;
        int read = randomAccessFile2.read(bArr);
        int i9 = 1;
        int i15 = 0;
        long j2 = 0;
        int i16 = 0;
        while (true) {
            if (read < i7) {
                int i17 = i15;
                break;
            }
            j2 += (long) read;
            int e2 = C102016c.m134343e(bArr, i8);
            int e3 = C102016c.m134343e(bArr, i6);
            long[] jArr2 = new long[e2];
            this.f300452N = jArr2;
            Arrays.fill(jArr2, 0);
            int i18 = i15;
            int i19 = 0;
            while (i19 < e2) {
                C102024m mVar = new C102024m();
                int i25 = i2;
                byte[] bArr2 = bArr;
                long j3 = (long) e3;
                mVar.f300437d = j3;
                int i26 = i19 == 0 ? 0 : i19 - 1;
                long[] jArr3 = this.f300452N;
                jArr3[i19] = jArr3[i26] + j3;
                ((ArrayList) this.f300439A).add(mVar);
                int i27 = i16 + e3;
                i18++;
                i2 = i25;
                int i28 = e2;
                int i29 = e3;
                while (true) {
                    long j4 = (long) i27;
                    i3 = i27;
                    long j5 = this.f300457w;
                    if (j4 < j5) {
                        i4 = i28;
                        i5 = i29;
                        break;
                    }
                    i4 = i28;
                    long[] jArr4 = this.f300442D;
                    i5 = i29;
                    if (i2 >= jArr4.length) {
                        break;
                    }
                    i27 = (int) (j4 - j5);
                    jArr4[i2] = (long) i18;
                    i2++;
                    i28 = i4;
                    i29 = i5;
                }
                i19++;
                bArr = bArr2;
                i16 = i3;
                e2 = i4;
                e3 = i5;
            }
            int i35 = i2;
            byte[] bArr3 = bArr;
            if (j2 >= j) {
                Log.m105918d("MicroMsg.StblAtom", "read stts Atom end");
                i2 = i35;
                i15 = i18;
                break;
            }
            byte[] bArr4 = bArr3;
            read = randomAccessFile2.read(bArr4);
            i9 = i35;
            i15 = i18;
            bArr = bArr4;
            i6 = 4;
            i7 = 8;
            i8 = 0;
        }
        long[] jArr5 = this.f300442D;
        if (i2 < jArr5.length) {
            jArr5[i2] = (long) i15;
        }
        return j2 + ((long) 8);
    }

    /* renamed from: l */
    public boolean mo141536l(RandomAccessFile randomAccessFile, int i, int i2) {
        int[] iArr;
        long[] jArr;
        int i3 = i;
        int i4 = i2;
        if (i4 < i3) {
            return false;
        }
        Log.m105925i("MicroMsg.StblAtom", "incrementCreateTimeTable, startSecond:%s, endSecond:%s, timeTable.length:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f300442D.length));
        long currentTicks = Util.currentTicks();
        if (this.f300456R == null) {
            mo141530f();
            Log.m105925i("MicroMsg.StblAtom", "createChunkTable cost:%sms", Long.valueOf(Util.ticksToNow(currentTicks)));
        }
        if (i3 > 0) {
            long currentTicks2 = Util.currentTicks();
            long m = mo141537m(randomAccessFile, (byte[]) null, i3, i4);
            Log.m105925i("MicroMsg.StblAtom", "incrementCreateTimeTable, incrementParseStsz ret:%s, cost:%sms", Long.valueOf(m), Long.valueOf(Util.ticksToNow(currentTicks2)));
            if (m < 0) {
                return false;
            }
        }
        long currentTicks3 = Util.currentTicks();
        int min = Math.min(i3, this.f300442D.length - 1);
        int min2 = Math.min(i4, this.f300442D.length - 1);
        Pair<Integer, Integer> d = mo141528d(i3);
        Pair<Integer, Integer> d2 = mo141528d(i4);
        Log.m105925i("MicroMsg.StblAtom", "incrementCreateTimeTable, start:%s, end:%s, startSampleIdRange:%s, endSampleIdRange:%s, calcSampleRangeCost:%sms, chunkTable.size:%s", Integer.valueOf(min), Integer.valueOf(min2), d, d2, Long.valueOf(Util.ticksToNow(currentTicks3)), Integer.valueOf(this.f300456R.length));
        long currentTicks4 = Util.currentTicks();
        while (min <= min2) {
            long j = currentTicks;
            int i5 = (int) this.f300442D[min];
            long currentTicks5 = Util.currentTicks();
            int b = mo141526b(i5);
            long ticksToNow = Util.ticksToNow(currentTicks5);
            int i6 = this.f300456R[b >= 1 ? b - 1 : 0] + 1;
            long currentTicks6 = Util.currentTicks();
            long e = mo141529e(i6, i5);
            long ticksToNow2 = Util.ticksToNow(currentTicks6);
            long c = mo141527c(b);
            this.f300442D[min] = c + e;
            Log.m105919d("MicroMsg.StblAtom", "sampleId:%s, sampleBeginId:%s, chunkId:%s, sampleSize:%s, chunkOffset:%s, calcChunkId cost:%sms, calcSampleSizeCost:%sms", Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(b), Long.valueOf(e), Long.valueOf(c), Long.valueOf(ticksToNow), Long.valueOf(ticksToNow2));
            min++;
            currentTicks = j;
        }
        long j2 = currentTicks;
        Log.m105919d("MicroMsg.StblAtom", "updateTimeTable cost:%sms", Long.valueOf(Util.ticksToNow(currentTicks4)));
        long j3 = this.f300442D[min2 - 1];
        if (!(d == null || d2 == null)) {
            int intValue = ((Integer) (this.f300448J == 0 ? d.first : d.second)).intValue();
            int intValue2 = ((Integer) d2.second).intValue();
            long currentTicks7 = Util.currentTicks();
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i15 = -1;
            int i16 = 0;
            while (true) {
                iArr = this.f300445G;
                if (i16 < iArr.length) {
                    if (i7 < 0) {
                        int i17 = iArr[i16];
                        if (i17 - 1 >= intValue - 1) {
                            i9 = i17 - 1;
                            i7 = i16;
                        }
                    }
                    if (i8 < 0) {
                        int i18 = iArr[i16];
                        if (i18 - 1 >= intValue2 - 1) {
                            i15 = i18 - 1;
                            i8 = i16;
                        }
                    }
                    if (i7 >= 0 && i8 >= 0) {
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            if (i7 < 0) {
                Log.m105925i("MicroMsg.StblAtom", "not found stssStart, set to last %s", Integer.valueOf(iArr.length - 1));
                int[] iArr2 = this.f300445G;
                i7 = iArr2.length - 1;
                i9 = iArr2[i7] - 1;
            }
            if (i8 < 0) {
                Log.m105925i("MicroMsg.StblAtom", "not found stssEnd, set to last %s", Integer.valueOf(this.f300445G.length - 1));
                int[] iArr3 = this.f300445G;
                i8 = iArr3.length - 1;
                i15 = iArr3[i8] - 1;
            }
            if (i15 > intValue2) {
                intValue2 = i15;
            }
            if (intValue2 >= ((ArrayList) this.f300439A).size()) {
                intValue2 = ((ArrayList) this.f300439A).size() - 1;
            }
            Log.m105925i("MicroMsg.StblAtom", "sample id range, start:%s, end:%s, sampleList.size:%s, stssStart:%s, stssEnd:%s, stssStartSampleId:%s, stssEndSampleId:%s, lastCalcSampleTimeOffset:%s, stssSampleId.length:%s, search cost:%sms", Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(((ArrayList) this.f300439A).size()), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i15), Integer.valueOf(this.f300455Q), Integer.valueOf(this.f300445G.length), Long.valueOf(Util.ticksToNow(currentTicks7)));
            if (intValue2 > intValue && intValue2 < ((ArrayList) this.f300439A).size() && (jArr = this.f300452N) != null && intValue2 < jArr.length) {
                long currentTicks8 = Util.currentTicks();
                int i19 = intValue;
                while (i19 <= intValue2) {
                    C102024m mVar = (C102024m) ((ArrayList) this.f300439A).get(i19);
                    int i25 = i19 + 1;
                    mVar.f300436c = this.f300444F[i25];
                    mVar.f300437d = (long) (((((float) this.f300452N[i19]) * 1.0f) / ((float) this.f300457w)) * 1000.0f * 1000.0f);
                    mVar.f300434a = i25;
                    i19 = i25;
                }
                Log.m105925i("MicroMsg.StblAtom", "increment parse sampleList cost:%sms, start:%s, lastCalcSampleTimeOffset:%s, end:%s", Long.valueOf(Util.ticksToNow(currentTicks8)), Integer.valueOf(intValue), Integer.valueOf(this.f300455Q), Integer.valueOf(intValue2));
                this.f300455Q = intValue2;
                long currentTicks9 = Util.currentTicks();
                if (this.f300445G == null) {
                    while (intValue <= intValue2) {
                        if (this.f300441C[intValue] == null) {
                            C102024m mVar2 = (C102024m) ((ArrayList) this.f300439A).get(intValue);
                            mVar2.f300438e = 1;
                            Pair<Integer, Long> pair = new Pair<>(Integer.valueOf(intValue), Long.valueOf(mVar2.f300437d));
                            Log.m105927v("MicroMsg.StblAtom", "stss key frame from sampleList [%s %s], current stssList.size:%d", pair.first, pair.second, Integer.valueOf(((ArrayList) this.f300440B).size()));
                            this.f300441C[intValue] = pair;
                        }
                        intValue++;
                    }
                } else {
                    Log.m105925i("MicroMsg.StblAtom", "increment parse stssList from sampleId, stssStart:%s, stssEnd:%s", Integer.valueOf(i7), Integer.valueOf(i8));
                    if (i8 >= i7) {
                        while (i7 <= i8) {
                            if (this.f300441C[i7] == null) {
                                C102024m mVar3 = (C102024m) ((ArrayList) this.f300439A).get(this.f300445G[i7] - 1);
                                mVar3.f300438e = 1;
                                Pair<Integer, Long> pair2 = new Pair<>(Integer.valueOf(this.f300445G[i7] - 1), Long.valueOf(mVar3.f300437d));
                                Log.m105927v("MicroMsg.StblAtom", "stss key frame from sampleId [%s %s], current stssList.size:%d", pair2.first, pair2.second, Integer.valueOf(((ArrayList) this.f300440B).size()));
                                this.f300441C[i7] = pair2;
                            }
                            i7++;
                        }
                    }
                }
                Log.m105925i("MicroMsg.StblAtom", "increment parse stssList cost:%sms, size:%s", Long.valueOf(Util.ticksToNow(currentTicks9)), Integer.valueOf(((ArrayList) this.f300440B).size()));
            }
        }
        Log.m105925i("MicroMsg.StblAtom", "incrementCreateTimeTable cost:%sms", Long.valueOf(Util.ticksToNow(j2)));
        return true;
    }

    /* renamed from: m */
    public final long mo141537m(RandomAccessFile randomAccessFile, byte[] bArr, int i, int i2) {
        Pair<Integer, Integer> d = mo141528d(i);
        Pair<Integer, Integer> d2 = mo141528d(i2);
        if (d == null || d2 == null) {
            return 0;
        }
        int intValue = ((Integer) (this.f300448J == 0 ? d.first : d.second)).intValue();
        int intValue2 = ((Integer) d2.second).intValue();
        Log.m105925i("MicroMsg.StblAtom", "incrementParseStsz, startSampleId:%s, endSampleId:%s, sampleSizeTable.size:%s, startRange:%s, endRange:%s, stszLazyStartPos:%s", Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(this.f300444F.length), d, d2, Long.valueOf(this.f300449K));
        if (intValue > intValue2) {
            return -1;
        }
        int[] iArr = this.f300444F;
        if (intValue > iArr.length || intValue2 > iArr.length || this.f300449K < 0 || this.f300454P == null) {
            return -1;
        }
        int i3 = (intValue - 1) * 4;
        while (true) {
            byte[] bArr2 = this.f300454P;
            if (i3 >= bArr2.length || intValue > intValue2) {
                break;
            }
            this.f300444F[intValue] = C102016c.m134343e(bArr2, i3);
            intValue++;
            if (0 >= this.f300450L) {
                Log.m105918d("MicroMsg.StblAtom", "read stsz atom end");
                break;
            }
            i3 += 4;
        }
        Log.m105925i("MicroMsg.StblAtom", "incrementParseStsz finish, filePos:%s, offset:%s, sampleSizeTableData.length:%s", Long.valueOf(randomAccessFile.getFilePointer()), Integer.valueOf(i3), Integer.valueOf(this.f300454P.length));
        return 0;
    }

    /* renamed from: n */
    public void mo141538n(RandomAccessFile randomAccessFile) {
        long j;
        long j2;
        long[] jArr;
        long j3;
        int i;
        int i2;
        long j4;
        long g;
        RandomAccessFile randomAccessFile2 = randomAccessFile;
        long currentTicks = Util.currentTicks();
        long a = mo141508a() - 8;
        byte[] bArr = new byte[8];
        long currentTicks2 = Util.currentTicks();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            j = 0;
            if (a <= 0) {
                j2 = currentTicks2;
                break;
            }
            int read = randomAccessFile2.read(bArr);
            boolean z6 = z;
            boolean z7 = z2;
            int e = C102016c.m134343e(bArr, 0);
            boolean z8 = z3;
            int e2 = C102016c.m134343e(bArr, 4);
            byte[] bArr2 = bArr;
            boolean z9 = z4;
            Log.m105925i("MicroMsg.StblAtom", "readAtom, type:%s, size:%s", Integer.valueOf(e2), Integer.valueOf(e));
            if (e2 == C102014a.f300386p) {
                randomAccessFile.getFilePointer();
                long k = mo141535k(randomAccessFile2, e);
                Log.m105925i("MicroMsg.StblAtom", "handleSttsAtom cost:%sms", Long.valueOf(Util.ticksToNow(currentTicks)));
                j2 = currentTicks2;
                i = e;
                z2 = z7;
                z3 = z8;
                z4 = z9;
                z = true;
                j3 = k;
            } else {
                if (e2 == C102014a.f300388r) {
                    randomAccessFile.getFilePointer();
                    g = mo141533i(randomAccessFile2, e);
                    Log.m105925i("MicroMsg.StblAtom", "handleStscAtom cost:%sms", Long.valueOf(Util.ticksToNow(currentTicks)));
                    j2 = currentTicks2;
                    i = e;
                    z = z6;
                    z2 = z7;
                    z4 = z9;
                    z3 = true;
                } else {
                    if (e2 == C102014a.f300390t) {
                        randomAccessFile.getFilePointer();
                        g = mo141532h(randomAccessFile2, e);
                        Log.m105925i("MicroMsg.StblAtom", "handleStcoAtom cost:%sms", Long.valueOf(Util.ticksToNow(currentTicks)));
                    } else if (e2 == C102014a.f300391u) {
                        randomAccessFile.getFilePointer();
                        g = mo141531g(randomAccessFile2, e);
                        Log.m105925i("MicroMsg.StblAtom", "handleCo64Atom cost:%sms", Long.valueOf(Util.ticksToNow(currentTicks)));
                    } else if (e2 == C102014a.f300389s) {
                        j2 = currentTicks2;
                        long filePointer = randomAccessFile.getFilePointer();
                        this.f300459y = filePointer;
                        Log.m105925i("MicroMsg.StblAtom", "stsz atom pos:%s", Long.valueOf(filePointer));
                        if (C102016c.m134346h(randomAccessFile2, (long) 4)) {
                            byte[] bArr3 = new byte[4];
                            if (randomAccessFile2.read(bArr3, 0, 4) < 4) {
                                Log.m105928w("MicroMsg.StblAtom", "stsz read sample size error");
                            } else {
                                int e3 = C102016c.m134343e(bArr3, 0);
                                if (e3 > 0) {
                                    int[] iArr = new int[1];
                                    this.f300444F = iArr;
                                    iArr[0] = e3;
                                    Log.m105924i("MicroMsg.StblAtom", "all sample size is the same. size : " + e3);
                                    j4 = (long) 8;
                                    i2 = e;
                                } else if (randomAccessFile2.read(bArr3, 0, 4) < 4) {
                                    Log.m105928w("MicroMsg.StblAtom", "stsz read entry count error");
                                } else {
                                    int e4 = C102016c.m134343e(bArr3, 0);
                                    long j5 = ((long) e4) * 4;
                                    if (j5 <= 0 || j5 > ((long) (e - 20))) {
                                        i2 = e;
                                        Log.m105928w("MicroMsg.StblAtom", "stco error entryCount : " + e4);
                                        j4 = -1;
                                    } else {
                                        this.f300444F = new int[(e4 + 1)];
                                        int read2 = randomAccessFile2.read(bArr3);
                                        long j6 = 0;
                                        int i3 = 1;
                                        while (true) {
                                            i2 = e;
                                            if (read2 < 4) {
                                                break;
                                            }
                                            j6 += (long) read2;
                                            int i4 = i3 + 1;
                                            this.f300444F[i3] = C102016c.m134343e(bArr3, 0);
                                            if (j6 >= j5) {
                                                Log.m105918d("MicroMsg.StblAtom", "read stsz atom end");
                                                break;
                                            }
                                            read2 = randomAccessFile2.read(bArr3);
                                            i3 = i4;
                                            e = i2;
                                        }
                                        j4 = j6 + ((long) 12);
                                    }
                                }
                                Log.m105925i("MicroMsg.StblAtom", "handleStszAtom cost:%sms", Long.valueOf(Util.ticksToNow(currentTicks)));
                                z = z6;
                                z2 = z7;
                                i = i2;
                                j3 = j4;
                                z3 = z8;
                                z4 = true;
                            }
                        }
                        i2 = e;
                        j4 = -1;
                        Log.m105925i("MicroMsg.StblAtom", "handleStszAtom cost:%sms", Long.valueOf(Util.ticksToNow(currentTicks)));
                        z = z6;
                        z2 = z7;
                        i = i2;
                        j3 = j4;
                        z3 = z8;
                        z4 = true;
                    } else {
                        j2 = currentTicks2;
                        int i5 = e;
                        if (e2 == C102014a.f300387q) {
                            randomAccessFile.getFilePointer();
                            i = i5;
                            long j7 = mo141534j(randomAccessFile2, i);
                            Log.m105925i("MicroMsg.StblAtom", "handleStssAtom cost:%sms", Long.valueOf(Util.ticksToNow(currentTicks)));
                            z = z6;
                            z4 = z9;
                            z5 = true;
                            long j8 = j7;
                            z2 = z7;
                            j3 = j8;
                            z3 = z8;
                        } else {
                            i = i5;
                            z = z6;
                            z2 = z7;
                            z3 = z8;
                            z4 = z9;
                            j3 = 0;
                        }
                    }
                    j2 = currentTicks2;
                    i = e;
                    z = z6;
                    z3 = z8;
                    z4 = z9;
                    z2 = true;
                }
                j3 = g;
            }
            long j9 = (long) i;
            if (C102016c.m134346h(randomAccessFile2, (j9 - j3) - ((long) read))) {
                if (z && z2 && z3 && z4 && z5) {
                    Log.m105924i("MicroMsg.StblAtom", "read stbl atom finish");
                    break;
                }
                a -= j9;
                bArr = bArr2;
                currentTicks2 = j2;
            } else {
                throw new IOException("skip file error.");
            }
        }
        Log.m105925i("MicroMsg.StblAtom", "parse all atoms cost %sms", Long.valueOf(Util.ticksToNow(j2)));
        long currentTicks3 = Util.currentTicks();
        long currentTicks4 = Util.currentTicks();
        mo141530f();
        Log.m105925i("MicroMsg.StblAtom", "createChunkTable cost:%sms", Long.valueOf(Util.ticksToNow(currentTicks4)));
        int i6 = 0;
        while (true) {
            jArr = this.f300442D;
            if (i6 >= jArr.length) {
                break;
            }
            int i7 = (int) jArr[i6];
            int b = mo141526b(i7);
            int i8 = this.f300456R[b - 1] + 1;
            Log.m105918d("MicroMsg.StblAtom", "sampleId : " + i7 + " chunkId : " + b + ", sampleBeginId: " + i8);
            this.f300442D[i6] = mo141527c(b) + mo141529e(i8, i7);
            i6++;
        }
        long j15 = jArr[jArr.length - 1];
        long currentTicks5 = Util.currentTicks();
        Iterator it = ((ArrayList) this.f300439A).iterator();
        long j16 = 0;
        int i9 = 0;
        int i15 = 1;
        while (it.hasNext()) {
            C102024m mVar = (C102024m) it.next();
            mVar.f300436c = this.f300444F[i15];
            int b2 = mo141526b(i15);
            if (b2 != i9) {
                mVar.f300435b = mo141527c(b2);
            } else {
                mVar.f300435b = j16;
            }
            int i16 = b2;
            long j17 = mVar.f300435b + ((long) mVar.f300436c);
            long j18 = j + mVar.f300437d;
            mVar.f300437d = (long) (((((float) j18) * 1.0f) / ((float) this.f300457w)) * 1000.0f * 1000.0f);
            mVar.f300434a = i15;
            i15++;
            i9 = i16;
            j16 = j17;
            j = j18;
        }
        Log.m105925i("MicroMsg.StblAtom", "parse sampleList cost:%sms, size:%s", Long.valueOf(Util.ticksToNow(currentTicks5)), Integer.valueOf(((ArrayList) this.f300439A).size()));
        long currentTicks6 = Util.currentTicks();
        if (this.f300445G != null) {
            int i17 = 0;
            while (true) {
                int[] iArr2 = this.f300445G;
                if (i17 >= iArr2.length) {
                    break;
                }
                C102024m mVar2 = (C102024m) ((ArrayList) this.f300439A).get(iArr2[i17] - 1);
                mVar2.f300438e = 1;
                Pair pair = new Pair(Integer.valueOf(this.f300445G[i17] - 1), Long.valueOf(mVar2.f300437d));
                Log.m105927v("MicroMsg.StblAtom", "stss key frame from sampleId [%s %s], current stssList.size:%d", pair.first, pair.second, Integer.valueOf(((ArrayList) this.f300440B).size()));
                ((ArrayList) this.f300440B).add(pair);
                i17++;
            }
        } else {
            for (int i18 = 0; i18 < ((ArrayList) this.f300439A).size(); i18++) {
                C102024m mVar3 = (C102024m) ((ArrayList) this.f300439A).get(i18);
                mVar3.f300438e = 1;
                Pair pair2 = new Pair(Integer.valueOf(i18), Long.valueOf(mVar3.f300437d));
                Log.m105927v("MicroMsg.StblAtom", "stss key frame from sampleList [%s %s], current stssList.size:%d", pair2.first, pair2.second, Integer.valueOf(((ArrayList) this.f300440B).size()));
                ((ArrayList) this.f300440B).add(pair2);
            }
        }
        Log.m105925i("MicroMsg.StblAtom", "parse stssList cost:%sms, size:%s", Long.valueOf(Util.ticksToNow(currentTicks6)), Integer.valueOf(((ArrayList) this.f300440B).size()));
        Log.m105925i("MicroMsg.StblAtom", "createTimeTable cost:%sms", Long.valueOf(Util.ticksToNow(currentTicks3)));
        Log.m105925i("MicroMsg.StblAtom", "parse stbl atom cost:%sms", Long.valueOf(Util.ticksToNow(currentTicks)));
    }
}
