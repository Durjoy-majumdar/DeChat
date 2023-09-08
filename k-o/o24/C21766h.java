package o24;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.wxmm.v2encoder;
import com.tencent.xweb.util.WXWebReporter;
import gy3.C87412m;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import p24.C21916a;
import p24.C35364b;
import sx3.C110821n;

/* renamed from: o24.h */
public final class C21766h implements C21768j, C21767i, Cloneable, ByteChannel {

    /* renamed from: d */
    public C21784y f61694d;

    /* renamed from: e */
    public long f61695e;

    /* renamed from: A */
    public C21766h mo34114A(int i) {
        C21784y l = mo34143l(2);
        byte[] bArr = l.f61731a;
        int i2 = l.f61733c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        l.f61733c = i3 + 1;
        this.f61695e += 2;
        return this;
    }

    /* renamed from: B */
    public C21766h mo34116B(String str) {
        C87412m.m108594g(str, "string");
        mo34117C(str, 0, str.length());
        return this;
    }

    /* renamed from: C */
    public C21766h mo34117C(String str, int i, int i2) {
        C87412m.m108594g(str, "string");
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            C21784y l = mo34143l(1);
                            byte[] bArr = l.f61731a;
                            int i3 = l.f61733c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                            while (i4 < min) {
                                char charAt2 = str.charAt(i4);
                                if (charAt2 >= 128) {
                                    break;
                                }
                                bArr[i4 + i3] = (byte) charAt2;
                                i4++;
                            }
                            int i5 = l.f61733c;
                            int i6 = (i3 + i4) - i5;
                            l.f61733c = i5 + i6;
                            this.f61695e += (long) i6;
                            i = i4;
                        } else {
                            if (charAt < 2048) {
                                C21784y l2 = mo34143l(2);
                                byte[] bArr2 = l2.f61731a;
                                int i7 = l2.f61733c;
                                bArr2[i7] = (byte) ((charAt >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt & '?') | 128);
                                l2.f61733c = i7 + 2;
                                this.f61695e += 2;
                            } else if (charAt < 55296 || charAt > 57343) {
                                C21784y l3 = mo34143l(3);
                                byte[] bArr3 = l3.f61731a;
                                int i8 = l3.f61733c;
                                bArr3[i8] = (byte) ((charAt >> 12) | WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL);
                                bArr3[i8 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                                bArr3[i8 + 2] = (byte) ((charAt & '?') | 128);
                                l3.f61733c = i8 + 3;
                                this.f61695e += 3;
                            } else {
                                int i9 = i + 1;
                                char charAt3 = i9 < i2 ? str.charAt(i9) : 0;
                                if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                    mo34148q(63);
                                    i = i9;
                                } else {
                                    int i15 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 0;
                                    C21784y l4 = mo34143l(4);
                                    byte[] bArr4 = l4.f61731a;
                                    int i16 = l4.f61733c;
                                    bArr4[i16] = (byte) ((i15 >> 18) | 240);
                                    bArr4[i16 + 1] = (byte) (((i15 >> 12) & 63) | 128);
                                    bArr4[i16 + 2] = (byte) (((i15 >> 6) & 63) | 128);
                                    bArr4[i16 + 3] = (byte) ((i15 & 63) | 128);
                                    l4.f61733c = i16 + 4;
                                    this.f61695e += 4;
                                    i += 2;
                                }
                            }
                            i++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    /* renamed from: E */
    public C21766h mo34118E(int i) {
        String str;
        if (i < 128) {
            mo34148q(i);
        } else if (i < 2048) {
            C21784y l = mo34143l(2);
            byte[] bArr = l.f61731a;
            int i2 = l.f61733c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            l.f61733c = i2 + 2;
            this.f61695e += 2;
        } else if (55296 <= i && 57343 >= i) {
            mo34148q(63);
        } else if (i < 65536) {
            C21784y l2 = mo34143l(3);
            byte[] bArr2 = l2.f61731a;
            int i3 = l2.f61733c;
            bArr2[i3] = (byte) ((i >> 12) | WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            l2.f61733c = i3 + 3;
            this.f61695e += 3;
        } else if (i <= 1114111) {
            C21784y l3 = mo34143l(4);
            byte[] bArr3 = l3.f61731a;
            int i4 = l3.f61733c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            l3.f61733c = i4 + 4;
            this.f61695e += 4;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected code point: 0x");
            if (i != 0) {
                char[] cArr = C35364b.f94698a;
                int i5 = 0;
                char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
                while (i5 < 8 && cArr2[i5] == '0') {
                    i5++;
                }
                str = new String(cArr2, i5, 8 - i5);
            } else {
                str = "0";
            }
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        return this;
    }

    /* renamed from: G */
    public C21769k mo34120G(long j) {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (this.f61695e < j) {
            throw new EOFException();
        } else if (j < ((long) 4096)) {
            return new C21769k(mo34136g(j));
        } else {
            C21769k k = mo34142k((int) j);
            skip(j);
            return k;
        }
    }

    /* renamed from: G0 */
    public void mo34121G0(long j) {
        if (this.f61695e < j) {
            throw new EOFException();
        }
    }

    /* renamed from: J0 */
    public /* bridge */ /* synthetic */ C21767i mo34122J0(int i) {
        mo34114A(i);
        return this;
    }

    /* renamed from: L0 */
    public long mo32327L0(C21766h hVar, long j) {
        C87412m.m108594g(hVar, "sink");
        if (j >= 0) {
            long j2 = this.f61695e;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            hVar.mo32354x(this, j);
            return j;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b2, code lost:
        if (r10 != r11) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b4, code lost:
        r0.f61694d = r8.mo34186a();
        o24.C21785z.m24975a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00be, code lost:
        r8.f61732b = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c0, code lost:
        if (r5 != false) goto L_0x00c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0083 A[SYNTHETIC] */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo34123P() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f61695e
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00cd
            r1 = 0
            r6 = r3
            r2 = 0
            r5 = 0
        L_0x000e:
            o24.y r8 = r0.f61694d
            gy3.C87412m.m108591d(r8)
            byte[] r9 = r8.f61731a
            int r10 = r8.f61732b
            int r11 = r8.f61733c
        L_0x0019:
            r12 = 1
            if (r10 >= r11) goto L_0x00b2
            byte r13 = r9[r10]
            r14 = 48
            byte r14 = (byte) r14
            if (r13 < r14) goto L_0x002b
            r15 = 57
            byte r15 = (byte) r15
            if (r13 > r15) goto L_0x002b
            int r12 = r13 - r14
            goto L_0x0044
        L_0x002b:
            r14 = 97
            byte r14 = (byte) r14
            if (r13 < r14) goto L_0x0036
            r15 = 102(0x66, float:1.43E-43)
            byte r15 = (byte) r15
            if (r13 > r15) goto L_0x0036
            goto L_0x0040
        L_0x0036:
            r14 = 65
            byte r14 = (byte) r14
            if (r13 < r14) goto L_0x007f
            r15 = 70
            byte r15 = (byte) r15
            if (r13 > r15) goto L_0x007f
        L_0x0040:
            int r12 = r13 - r14
            int r12 = r12 + 10
        L_0x0044:
            r14 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r14 = r14 & r6
            int r16 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r16 != 0) goto L_0x0054
            r13 = 4
            long r6 = r6 << r13
            long r12 = (long) r12
            long r6 = r6 | r12
            int r10 = r10 + 1
            int r2 = r2 + 1
            goto L_0x0019
        L_0x0054:
            o24.h r1 = new o24.h
            r1.<init>()
            o24.h r1 = r1.mo34115A0(r6)
            r1.mo34148q(r13)
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            long r4 = r1.f61695e
            java.nio.charset.Charset r6 = z04.C119027c.f356488a
            java.lang.String r1 = r1.mo34141j(r4, r6)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x007f:
            if (r2 == 0) goto L_0x0083
            r5 = 1
            goto L_0x00b2
        L_0x0083:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Expected leading [0-9a-fA-F] character but was 0x"
            r3.append(r4)
            r4 = 2
            char[] r4 = new char[r4]
            char[] r5 = p24.C35364b.f94698a
            int r6 = r13 >> 4
            r6 = r6 & 15
            char r6 = r5[r6]
            r4[r1] = r6
            r1 = r13 & 15
            char r1 = r5[r1]
            r4[r12] = r1
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x00b2:
            if (r10 != r11) goto L_0x00be
            o24.y r9 = r8.mo34186a()
            r0.f61694d = r9
            o24.C21785z.m24975a(r8)
            goto L_0x00c0
        L_0x00be:
            r8.f61732b = r10
        L_0x00c0:
            if (r5 != 0) goto L_0x00c6
            o24.y r8 = r0.f61694d
            if (r8 != 0) goto L_0x000e
        L_0x00c6:
            long r3 = r0.f61695e
            long r1 = (long) r2
            long r3 = r3 - r1
            r0.f61695e = r3
            return r6
        L_0x00cd:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o24.C21766h.mo34123P():long");
    }

    /* renamed from: U */
    public C21767i mo34124U() {
        return this;
    }

    /* renamed from: V */
    public String mo34125V(long j) {
        if (j >= 0) {
            long j2 = MAlarmHandler.NEXT_FIRE_INTERVAL;
            if (j != MAlarmHandler.NEXT_FIRE_INTERVAL) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long d = mo34132d(b, 0, j2);
            if (d != -1) {
                return C21916a.m25178a(this, d);
            }
            if (j2 < this.f61695e && mo34130c(j2 - 1) == ((byte) 13) && mo34130c(j2) == b) {
                return C21916a.m25178a(this, j2);
            }
            C21766h hVar = new C21766h();
            mo34129b(hVar, 0, Math.min((long) 32, this.f61695e));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f61695e, j) + " content=" + hVar.mo34120G(hVar.f61695e).mo34086g() + 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    /* renamed from: W */
    public /* bridge */ /* synthetic */ C21767i mo34126W(String str) {
        mo34116B(str);
        return this;
    }

    /* renamed from: Y */
    public String mo34127Y() {
        return mo34125V(MAlarmHandler.NEXT_FIRE_INTERVAL);
    }

    /* renamed from: a */
    public final long mo34128a() {
        long j = this.f61695e;
        if (j == 0) {
            return 0;
        }
        C21784y yVar = this.f61694d;
        C87412m.m108591d(yVar);
        C21784y yVar2 = yVar.f61737g;
        C87412m.m108591d(yVar2);
        int i = yVar2.f61733c;
        if (i < 8192 && yVar2.f61735e) {
            j -= (long) (i - yVar2.f61732b);
        }
        return j;
    }

    /* renamed from: b */
    public final C21766h mo34129b(C21766h hVar, long j, long j2) {
        C87412m.m108594g(hVar, "out");
        C21753b.m24816b(this.f61695e, j, j2);
        if (j2 != 0) {
            hVar.f61695e += j2;
            C21784y yVar = this.f61694d;
            while (true) {
                C87412m.m108591d(yVar);
                int i = yVar.f61733c;
                int i2 = yVar.f61732b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                yVar = yVar.f61736f;
            }
            while (j2 > 0) {
                C87412m.m108591d(yVar);
                C21784y c = yVar.mo34188c();
                int i3 = c.f61732b + ((int) j);
                c.f61732b = i3;
                c.f61733c = Math.min(i3 + ((int) j2), c.f61733c);
                C21784y yVar2 = hVar.f61694d;
                if (yVar2 == null) {
                    c.f61737g = c;
                    c.f61736f = c;
                    hVar.f61694d = c;
                } else {
                    C87412m.m108591d(yVar2);
                    C21784y yVar3 = yVar2.f61737g;
                    C87412m.m108591d(yVar3);
                    yVar3.mo34187b(c);
                }
                j2 -= (long) (c.f61733c - c.f61732b);
                yVar = yVar.f61736f;
                j = 0;
            }
        }
        return this;
    }

    /* renamed from: c */
    public final byte mo34130c(long j) {
        C21753b.m24816b(this.f61695e, j, 1);
        C21784y yVar = this.f61694d;
        if (yVar != null) {
            long j2 = this.f61695e;
            if (j2 - j < j) {
                while (j2 > j) {
                    yVar = yVar.f61737g;
                    C87412m.m108591d(yVar);
                    j2 -= (long) (yVar.f61733c - yVar.f61732b);
                }
                return yVar.f61731a[(int) ((((long) yVar.f61732b) + j) - j2)];
            }
            long j3 = 0;
            while (true) {
                int i = yVar.f61733c;
                int i2 = yVar.f61732b;
                long j4 = ((long) (i - i2)) + j3;
                if (j4 > j) {
                    return yVar.f61731a[(int) ((((long) i2) + j) - j3)];
                }
                yVar = yVar.f61736f;
                C87412m.m108591d(yVar);
                j3 = j4;
            }
        } else {
            C87412m.m108591d((Object) null);
            throw null;
        }
    }

    public Object clone() {
        C21766h hVar = new C21766h();
        if (this.f61695e != 0) {
            C21784y yVar = this.f61694d;
            C87412m.m108591d(yVar);
            C21784y c = yVar.mo34188c();
            hVar.f61694d = c;
            c.f61737g = c;
            c.f61736f = c;
            for (C21784y yVar2 = yVar.f61736f; yVar2 != yVar; yVar2 = yVar2.f61736f) {
                C21784y yVar3 = c.f61737g;
                C87412m.m108591d(yVar3);
                C87412m.m108591d(yVar2);
                yVar3.mo34187b(yVar2.mo34188c());
            }
            hVar.f61695e = this.f61695e;
        }
        return hVar;
    }

    public void close() {
    }

    /* renamed from: d */
    public long mo34132d(byte b, long j, long j2) {
        C21784y yVar;
        byte b2 = b;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 <= j3 && j4 >= j3) {
            long j6 = this.f61695e;
            if (j4 > j6) {
                j4 = j6;
            }
            if (!(j3 == j4 || (yVar = this.f61694d) == null)) {
                if (j6 - j3 < j3) {
                    while (j6 > j3) {
                        yVar = yVar.f61737g;
                        C87412m.m108591d(yVar);
                        j6 -= (long) (yVar.f61733c - yVar.f61732b);
                    }
                    while (j6 < j4) {
                        byte[] bArr = yVar.f61731a;
                        int min = (int) Math.min((long) yVar.f61733c, (((long) yVar.f61732b) + j4) - j6);
                        for (int i = (int) ((((long) yVar.f61732b) + j3) - j6); i < min; i++) {
                            if (bArr[i] == b2) {
                                return ((long) (i - yVar.f61732b)) + j6;
                            }
                        }
                        j6 += (long) (yVar.f61733c - yVar.f61732b);
                        yVar = yVar.f61736f;
                        C87412m.m108591d(yVar);
                        j3 = j6;
                    }
                } else {
                    while (true) {
                        long j7 = ((long) (yVar.f61733c - yVar.f61732b)) + j5;
                        if (j7 > j3) {
                            break;
                        }
                        yVar = yVar.f61736f;
                        C87412m.m108591d(yVar);
                        j5 = j7;
                    }
                    while (j5 < j4) {
                        byte[] bArr2 = yVar.f61731a;
                        int min2 = (int) Math.min((long) yVar.f61733c, (((long) yVar.f61732b) + j4) - j5);
                        for (int i2 = (int) ((((long) yVar.f61732b) + j3) - j5); i2 < min2; i2++) {
                            if (bArr2[i2] == b2) {
                                return ((long) (i2 - yVar.f61732b)) + j5;
                            }
                        }
                        j5 += (long) (yVar.f61733c - yVar.f61732b);
                        yVar = yVar.f61736f;
                        C87412m.m108591d(yVar);
                        j3 = j5;
                    }
                }
            }
            return -1;
        }
        throw new IllegalArgumentException(("size=" + this.f61695e + " fromIndex=" + j3 + " toIndex=" + j4).toString());
    }

    /* renamed from: e */
    public int mo34133e(byte[] bArr, int i, int i2) {
        C87412m.m108594g(bArr, "sink");
        C21753b.m24816b((long) bArr.length, (long) i, (long) i2);
        C21784y yVar = this.f61694d;
        if (yVar == null) {
            return -1;
        }
        int min = Math.min(i2, yVar.f61733c - yVar.f61732b);
        byte[] bArr2 = yVar.f61731a;
        int i3 = yVar.f61732b;
        C110821n.m150960g(bArr2, bArr, i, i3, i3 + min);
        int i4 = yVar.f61732b + min;
        yVar.f61732b = i4;
        this.f61695e -= (long) min;
        if (i4 != yVar.f61733c) {
            return min;
        }
        this.f61694d = yVar.mo34186a();
        C21785z.m24975a(yVar);
        return min;
    }

    /* renamed from: e0 */
    public boolean mo34134e0() {
        return this.f61695e == 0;
    }

    /* JADX WARNING: type inference failed for: r21v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x000b
        L_0x0008:
            r2 = 1
            goto L_0x0078
        L_0x000b:
            boolean r4 = r1 instanceof o24.C21766h
            if (r4 != 0) goto L_0x0011
            goto L_0x0078
        L_0x0011:
            long r4 = r0.f61695e
            o24.h r1 = (o24.C21766h) r1
            long r6 = r1.f61695e
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x001c
            goto L_0x0078
        L_0x001c:
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0023
            goto L_0x0008
        L_0x0023:
            o24.y r4 = r0.f61694d
            gy3.C87412m.m108591d(r4)
            o24.y r1 = r1.f61694d
            gy3.C87412m.m108591d(r1)
            int r5 = r4.f61732b
            int r8 = r1.f61732b
            r9 = r6
        L_0x0032:
            long r11 = r0.f61695e
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0008
            int r11 = r4.f61733c
            int r11 = r11 - r5
            int r12 = r1.f61733c
            int r12 = r12 - r8
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r6
        L_0x0044:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x0060
            byte[] r15 = r4.f61731a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.f61731a
            int r17 = r8 + 1
            byte r8 = r15[r8]
            if (r5 == r8) goto L_0x0057
            goto L_0x0078
        L_0x0057:
            r18 = 1
            long r13 = r13 + r18
            r5 = r16
            r8 = r17
            goto L_0x0044
        L_0x0060:
            int r13 = r4.f61733c
            if (r5 != r13) goto L_0x006b
            o24.y r4 = r4.f61736f
            gy3.C87412m.m108591d(r4)
            int r5 = r4.f61732b
        L_0x006b:
            int r13 = r1.f61733c
            if (r8 != r13) goto L_0x0076
            o24.y r1 = r1.f61736f
            gy3.C87412m.m108591d(r1)
            int r8 = r1.f61732b
        L_0x0076:
            long r9 = r9 + r11
            goto L_0x0032
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o24.C21766h.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public C21762e0 mo32328f() {
        return C21762e0.f61689d;
    }

    public void flush() {
    }

    /* renamed from: g */
    public byte[] mo34136g(long j) {
        int i = 0;
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (this.f61695e >= j) {
            int i2 = (int) j;
            byte[] bArr = new byte[i2];
            while (i < i2) {
                int e = mo34133e(bArr, i, i2 - i);
                if (e != -1) {
                    i += e;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public C21766h getBuffer() {
        return this;
    }

    /* renamed from: h */
    public boolean mo34138h(long j) {
        return this.f61695e >= j;
    }

    public int hashCode() {
        C21784y yVar = this.f61694d;
        if (yVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = yVar.f61733c;
            for (int i3 = yVar.f61732b; i3 < i2; i3++) {
                i = (i * 31) + yVar.f61731a[i3];
            }
            yVar = yVar.f61736f;
            C87412m.m108591d(yVar);
        } while (yVar != this.f61694d);
        return i;
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public String mo34141j(long j, Charset charset) {
        C87412m.m108594g(charset, "charset");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (this.f61695e < j) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            C21784y yVar = this.f61694d;
            C87412m.m108591d(yVar);
            int i2 = yVar.f61732b;
            if (((long) i2) + j > ((long) yVar.f61733c)) {
                return new String(mo34136g(j), charset);
            }
            int i3 = (int) j;
            String str = new String(yVar.f61731a, i2, i3, charset);
            int i4 = yVar.f61732b + i3;
            yVar.f61732b = i4;
            this.f61695e -= j;
            if (i4 == yVar.f61733c) {
                this.f61694d = yVar.mo34186a();
                C21785z.m24975a(yVar);
            }
            return str;
        }
    }

    /* renamed from: k */
    public final C21769k mo34142k(int i) {
        if (i == 0) {
            return C21769k.f61696g;
        }
        C21753b.m24816b(this.f61695e, 0, (long) i);
        C21784y yVar = this.f61694d;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            C87412m.m108591d(yVar);
            int i5 = yVar.f61733c;
            int i6 = yVar.f61732b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                yVar = yVar.f61736f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[(i4 * 2)];
        C21784y yVar2 = this.f61694d;
        int i7 = 0;
        while (i2 < i) {
            C87412m.m108591d(yVar2);
            bArr[i7] = yVar2.f61731a;
            i2 += yVar2.f61733c - yVar2.f61732b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = yVar2.f61732b;
            yVar2.f61734d = true;
            i7++;
            yVar2 = yVar2.f61736f;
        }
        return new C21752a0(bArr, iArr);
    }

    /* renamed from: l */
    public final C21784y mo34143l(int i) {
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            C21784y yVar = this.f61694d;
            if (yVar == null) {
                C21784y b = C21785z.m24976b();
                this.f61694d = b;
                b.f61737g = b;
                b.f61736f = b;
                return b;
            }
            C87412m.m108591d(yVar);
            C21784y yVar2 = yVar.f61737g;
            C87412m.m108591d(yVar2);
            if (yVar2.f61733c + i <= 8192 && yVar2.f61735e) {
                return yVar2;
            }
            C21784y b2 = C21785z.m24976b();
            yVar2.mo34187b(b2);
            return b2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00be, code lost:
        if (r11 != r12) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c0, code lost:
        r0.f61694d = r9.mo34186a();
        o24.C21785z.m24975a(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ca, code lost:
        r9.f61732b = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cc, code lost:
        if (r7 != false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d0, code lost:
        if (r0.f61694d != null) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d7, code lost:
        r0.f61695e -= (long) r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00df, code lost:
        if (r8 == false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return -r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008a A[SYNTHETIC] */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo34144m0() {
        /*
            r18 = this;
            r0 = r18
            long r1 = r0.f61695e
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00e4
            r1 = -7
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x000f:
            o24.y r9 = r0.f61694d
            gy3.C87412m.m108591d(r9)
            byte[] r10 = r9.f61731a
            int r11 = r9.f61732b
            int r12 = r9.f61733c
        L_0x001a:
            if (r11 >= r12) goto L_0x00bb
            byte r14 = r10[r11]
            r15 = 48
            byte r15 = (byte) r15
            if (r14 < r15) goto L_0x0073
            r13 = 57
            byte r13 = (byte) r13
            if (r14 > r13) goto L_0x0073
            int r15 = r15 - r14
            r16 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r13 < 0) goto L_0x0043
            r17 = r6
            if (r13 != 0) goto L_0x003c
            long r5 = (long) r15
            int r16 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r16 >= 0) goto L_0x003c
            goto L_0x0043
        L_0x003c:
            r5 = 10
            long r3 = r3 * r5
            long r5 = (long) r15
            long r3 = r3 + r5
            goto L_0x0080
        L_0x0043:
            o24.h r1 = new o24.h
            r1.<init>()
            o24.h r1 = r1.mo34119F(r3)
            r1.mo34148q(r14)
            if (r8 != 0) goto L_0x0054
            r1.readByte()
        L_0x0054:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            long r4 = r1.f61695e
            java.nio.charset.Charset r6 = z04.C119027c.f356488a
            java.lang.String r1 = r1.mo34141j(r4, r6)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0073:
            r17 = r6
            r5 = 45
            byte r5 = (byte) r5
            if (r14 != r5) goto L_0x0085
            if (r17 != 0) goto L_0x0085
            r5 = 1
            long r1 = r1 - r5
            r8 = 1
        L_0x0080:
            int r11 = r11 + 1
            int r6 = r17 + 1
            goto L_0x001a
        L_0x0085:
            if (r17 == 0) goto L_0x008a
            r6 = 0
            r7 = 1
            goto L_0x00be
        L_0x008a:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.append(r3)
            r3 = 2
            char[] r3 = new char[r3]
            char[] r4 = p24.C35364b.f94698a
            int r5 = r14 >> 4
            r5 = r5 & 15
            char r5 = r4[r5]
            r6 = 0
            r3[r6] = r5
            r5 = r14 & 15
            char r4 = r4[r5]
            r5 = 1
            r3[r5] = r4
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00bb:
            r17 = r6
            r6 = 0
        L_0x00be:
            if (r11 != r12) goto L_0x00ca
            o24.y r5 = r9.mo34186a()
            r0.f61694d = r5
            o24.C21785z.m24975a(r9)
            goto L_0x00cc
        L_0x00ca:
            r9.f61732b = r11
        L_0x00cc:
            if (r7 != 0) goto L_0x00d7
            o24.y r5 = r0.f61694d
            if (r5 != 0) goto L_0x00d3
            goto L_0x00d7
        L_0x00d3:
            r6 = r17
            goto L_0x000f
        L_0x00d7:
            long r1 = r0.f61695e
            r6 = r17
            long r5 = (long) r6
            long r1 = r1 - r5
            r0.f61695e = r1
            if (r8 == 0) goto L_0x00e2
            goto L_0x00e3
        L_0x00e2:
            long r3 = -r3
        L_0x00e3:
            return r3
        L_0x00e4:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o24.C21766h.mo34144m0():long");
    }

    /* renamed from: n */
    public C21766h mo34145n(byte[] bArr, int i, int i2) {
        C87412m.m108594g(bArr, FirebaseAnalytics.C113379b.SOURCE);
        long j = (long) i2;
        C21753b.m24816b((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C21784y l = mo34143l(1);
            int min = Math.min(i3 - i, 8192 - l.f61733c);
            int i4 = i + min;
            C110821n.m150960g(bArr, l.f61731a, l.f61733c, i, i4);
            l.f61733c += min;
            i = i4;
        }
        this.f61695e += j;
        return this;
    }

    /* renamed from: o */
    public /* bridge */ /* synthetic */ C21767i mo34146o(int i) {
        mo34148q(i);
        return this;
    }

    /* renamed from: p */
    public C21766h mo34147p() {
        return this;
    }

    /* renamed from: q */
    public C21766h mo34148q(int i) {
        C21784y l = mo34143l(1);
        byte[] bArr = l.f61731a;
        int i2 = l.f61733c;
        l.f61733c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f61695e++;
        return this;
    }

    /* renamed from: r */
    public C21766h mo34119F(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            mo34148q(48);
        } else {
            boolean z = false;
            int i2 = 1;
            if (i < 0) {
                j = -j;
                if (j < 0) {
                    mo34116B("-9223372036854775808");
                } else {
                    z = true;
                }
            }
            if (j >= 100000000) {
                i2 = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
            } else if (j >= 10000) {
                i2 = j < TimeUtil.SECOND_TO_US ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
            } else if (j >= 100) {
                i2 = j < 1000 ? 3 : 4;
            } else if (j >= 10) {
                i2 = 2;
            }
            if (z) {
                i2++;
            }
            C21784y l = mo34143l(i2);
            byte[] bArr = l.f61731a;
            int i3 = l.f61733c + i2;
            while (j != 0) {
                long j2 = (long) 10;
                i3--;
                bArr[i3] = C21916a.f61968a[(int) (j % j2)];
                j /= j2;
            }
            if (z) {
                bArr[i3 - 1] = (byte) 45;
            }
            l.f61733c += i2;
            this.f61695e += (long) i2;
        }
        return this;
    }

    /* renamed from: r0 */
    public /* bridge */ /* synthetic */ C21767i mo34150r0(int i) {
        mo34161y(i);
        return this;
    }

    public int read(ByteBuffer byteBuffer) {
        C87412m.m108594g(byteBuffer, "sink");
        C21784y yVar = this.f61694d;
        if (yVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), yVar.f61733c - yVar.f61732b);
        byteBuffer.put(yVar.f61731a, yVar.f61732b, min);
        int i = yVar.f61732b + min;
        yVar.f61732b = i;
        this.f61695e -= (long) min;
        if (i == yVar.f61733c) {
            this.f61694d = yVar.mo34186a();
            C21785z.m24975a(yVar);
        }
        return min;
    }

    public byte readByte() {
        if (this.f61695e != 0) {
            C21784y yVar = this.f61694d;
            C87412m.m108591d(yVar);
            int i = yVar.f61732b;
            int i2 = yVar.f61733c;
            int i3 = i + 1;
            byte b = yVar.f61731a[i];
            this.f61695e--;
            if (i3 == i2) {
                this.f61694d = yVar.mo34186a();
                C21785z.m24975a(yVar);
            } else {
                yVar.f61732b = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    public int readInt() {
        if (this.f61695e >= 4) {
            C21784y yVar = this.f61694d;
            C87412m.m108591d(yVar);
            int i = yVar.f61732b;
            int i2 = yVar.f61733c;
            if (((long) (i2 - i)) < 4) {
                return ((readByte() & ExifInterface.MARKER) << 24) | ((readByte() & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((readByte() & ExifInterface.MARKER) << 8) | (readByte() & ExifInterface.MARKER);
            }
            byte[] bArr = yVar.f61731a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & ExifInterface.MARKER) << 24) | ((bArr[i3] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & ExifInterface.MARKER) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & ExifInterface.MARKER);
            this.f61695e -= 4;
            if (i6 == i2) {
                this.f61694d = yVar.mo34186a();
                C21785z.m24975a(yVar);
            } else {
                yVar.f61732b = i6;
            }
            return b3;
        }
        throw new EOFException();
    }

    public short readShort() {
        if (this.f61695e >= 2) {
            C21784y yVar = this.f61694d;
            C87412m.m108591d(yVar);
            int i = yVar.f61732b;
            int i2 = yVar.f61733c;
            if (i2 - i < 2) {
                return (short) (((readByte() & ExifInterface.MARKER) << 8) | (readByte() & ExifInterface.MARKER));
            }
            byte[] bArr = yVar.f61731a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & ExifInterface.MARKER) << 8) | (bArr[i3] & ExifInterface.MARKER);
            this.f61695e -= 2;
            if (i4 == i2) {
                this.f61694d = yVar.mo34186a();
                C21785z.m24975a(yVar);
            } else {
                yVar.f61732b = i4;
            }
            return (short) b;
        }
        throw new EOFException();
    }

    /* renamed from: s */
    public C21766h mo34115A0(long j) {
        if (j == 0) {
            mo34148q(48);
        } else {
            long j2 = (j >>> 1) | j;
            long j3 = j2 | (j2 >>> 2);
            long j4 = j3 | (j3 >>> 4);
            long j5 = j4 | (j4 >>> 8);
            long j6 = j5 | (j5 >>> 16);
            long j7 = j6 | (j6 >>> 32);
            long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
            long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
            long j15 = ((j9 >>> 4) + j9) & 1085102592571150095L;
            long j16 = j15 + (j15 >>> 8);
            long j17 = j16 + (j16 >>> 16);
            int i = (int) ((((j17 & 63) + ((j17 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
            C21784y l = mo34143l(i);
            byte[] bArr = l.f61731a;
            int i2 = l.f61733c;
            for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
                bArr[i3] = C21916a.f61968a[(int) (15 & j)];
                j >>>= 4;
            }
            l.f61733c += i;
            this.f61695e += (long) i;
        }
        return this;
    }

    public void skip(long j) {
        while (j > 0) {
            C21784y yVar = this.f61694d;
            if (yVar != null) {
                int min = (int) Math.min(j, (long) (yVar.f61733c - yVar.f61732b));
                long j2 = (long) min;
                this.f61695e -= j2;
                j -= j2;
                int i = yVar.f61732b + min;
                yVar.f61732b = i;
                if (i == yVar.f61733c) {
                    this.f61694d = yVar.mo34186a();
                    C21785z.m24975a(yVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public String toString() {
        long j = this.f61695e;
        if (j <= ((long) Integer.MAX_VALUE)) {
            return mo34142k((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f61695e).toString());
    }

    /* renamed from: v */
    public long mo34158v(C21754b0 b0Var) {
        C87412m.m108594g(b0Var, "sink");
        long j = this.f61695e;
        if (j > 0) {
            b0Var.mo32354x(this, j);
        }
        return j;
    }

    public C21767i write(byte[] bArr) {
        C87412m.m108594g(bArr, FirebaseAnalytics.C113379b.SOURCE);
        mo34145n(bArr, 0, bArr.length);
        return this;
    }

    /* renamed from: x */
    public void mo32354x(C21766h hVar, long j) {
        int i;
        C21784y yVar;
        C87412m.m108594g(hVar, FirebaseAnalytics.C113379b.SOURCE);
        if (hVar != this) {
            C21753b.m24816b(hVar.f61695e, 0, j);
            while (j > 0) {
                C21784y yVar2 = hVar.f61694d;
                C87412m.m108591d(yVar2);
                int i2 = yVar2.f61733c;
                C21784y yVar3 = hVar.f61694d;
                C87412m.m108591d(yVar3);
                if (j < ((long) (i2 - yVar3.f61732b))) {
                    C21784y yVar4 = this.f61694d;
                    C21784y yVar5 = yVar4 != null ? yVar4.f61737g : null;
                    if (yVar5 != null && yVar5.f61735e) {
                        if ((((long) yVar5.f61733c) + j) - ((long) (yVar5.f61734d ? 0 : yVar5.f61732b)) <= ((long) 8192)) {
                            C21784y yVar6 = hVar.f61694d;
                            C87412m.m108591d(yVar6);
                            yVar6.mo34189d(yVar5, (int) j);
                            hVar.f61695e -= j;
                            this.f61695e += j;
                            return;
                        }
                    }
                    C21784y yVar7 = hVar.f61694d;
                    C87412m.m108591d(yVar7);
                    int i3 = (int) j;
                    if (i3 > 0 && i3 <= yVar7.f61733c - yVar7.f61732b) {
                        if (i3 >= 1024) {
                            yVar = yVar7.mo34188c();
                        } else {
                            yVar = C21785z.m24976b();
                            byte[] bArr = yVar7.f61731a;
                            byte[] bArr2 = yVar.f61731a;
                            int i4 = yVar7.f61732b;
                            C110821n.m150960g(bArr, bArr2, 0, i4, i4 + i3);
                        }
                        yVar.f61733c = yVar.f61732b + i3;
                        yVar7.f61732b += i3;
                        C21784y yVar8 = yVar7.f61737g;
                        C87412m.m108591d(yVar8);
                        yVar8.mo34187b(yVar);
                        hVar.f61694d = yVar;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                C21784y yVar9 = hVar.f61694d;
                C87412m.m108591d(yVar9);
                long j2 = (long) (yVar9.f61733c - yVar9.f61732b);
                hVar.f61694d = yVar9.mo34186a();
                C21784y yVar10 = this.f61694d;
                if (yVar10 == null) {
                    this.f61694d = yVar9;
                    yVar9.f61737g = yVar9;
                    yVar9.f61736f = yVar9;
                } else {
                    C21784y yVar11 = yVar10.f61737g;
                    C87412m.m108591d(yVar11);
                    yVar11.mo34187b(yVar9);
                    C21784y yVar12 = yVar9.f61737g;
                    if (yVar12 != yVar9) {
                        C87412m.m108591d(yVar12);
                        if (yVar12.f61735e) {
                            int i5 = yVar9.f61733c - yVar9.f61732b;
                            C21784y yVar13 = yVar9.f61737g;
                            C87412m.m108591d(yVar13);
                            int i6 = 8192 - yVar13.f61733c;
                            C21784y yVar14 = yVar9.f61737g;
                            C87412m.m108591d(yVar14);
                            if (yVar14.f61734d) {
                                i = 0;
                            } else {
                                C21784y yVar15 = yVar9.f61737g;
                                C87412m.m108591d(yVar15);
                                i = yVar15.f61732b;
                            }
                            if (i5 <= i6 + i) {
                                C21784y yVar16 = yVar9.f61737g;
                                C87412m.m108591d(yVar16);
                                yVar9.mo34189d(yVar16, i5);
                                yVar9.mo34186a();
                                C21785z.m24975a(yVar9);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                hVar.f61695e -= j2;
                this.f61695e += j2;
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    /* renamed from: y */
    public C21766h mo34161y(int i) {
        C21784y l = mo34143l(4);
        byte[] bArr = l.f61731a;
        int i2 = l.f61733c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        l.f61733c = i5 + 1;
        this.f61695e += 4;
        return this;
    }

    public int write(ByteBuffer byteBuffer) {
        C87412m.m108594g(byteBuffer, FirebaseAnalytics.C113379b.SOURCE);
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C21784y l = mo34143l(1);
            int min = Math.min(i, 8192 - l.f61733c);
            byteBuffer.get(l.f61731a, l.f61733c, min);
            i -= min;
            l.f61733c += min;
        }
        this.f61695e += (long) remaining;
        return remaining;
    }
}
