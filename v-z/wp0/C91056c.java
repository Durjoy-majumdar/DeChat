package wp0;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import gy3.C87412m;
import rx3.C13604l;

/* renamed from: wp0.c */
public final class C91056c {

    /* renamed from: e */
    public static final boolean f261217e = (WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED);

    /* renamed from: a */
    public final C91053a f261218a;

    /* renamed from: b */
    public final Thread f261219b;

    /* renamed from: c */
    public int f261220c;

    /* renamed from: d */
    public int f261221d;

    public C91056c(C91053a aVar) {
        C87412m.m108594g(aVar, "data");
        this.f261218a = aVar;
        boolean z = f261217e;
        this.f261219b = z ? Thread.currentThread() : null;
        if (z) {
            Log.m105918d("MicroMsg.Der.Parser", "<init>, data: " + aVar);
        }
    }

    /* renamed from: a */
    public final void mo125116a() {
        if (f261217e) {
            Thread currentThread = Thread.currentThread();
            if (!C87412m.m108589b(currentThread, this.f261219b)) {
                throw new IllegalAccessException("Parser is not thread safe(Created in " + this.f261219b + ", but now is in " + currentThread + ").");
            }
        }
    }

    /* renamed from: b */
    public final void mo125117b(boolean z) {
        int i = this.f261221d;
        if (f261217e) {
            Log.m105918d("MicroMsg.Der.Parser", "consumePendingReadLen, skip: " + z + ", pendingReadLen: " + i);
        }
        if (!z) {
            this.f261220c += i;
        }
        this.f261221d = 0;
    }

    /* renamed from: c */
    public final C13604l<Integer, C91053a> mo125118c() {
        long j;
        byte d;
        boolean z;
        int i = this.f261220c;
        byte d2 = mo125119d();
        boolean z2 = f261217e;
        if (z2) {
            Log.m105918d("MicroMsg.Der.Parser", "readTag, tagByte: " + d2);
        }
        int i2 = (d2 & 224) << 24;
        int i3 = d2 & 31;
        if (z2) {
            Log.m105918d("MicroMsg.Der.Parser", "readTag, tag: " + i2 + ", tagNo: " + i3);
        }
        if (31 == i3) {
            long j2 = 0;
            do {
                d = mo125119d();
                z = f261217e;
                if (z) {
                    Log.m105918d("MicroMsg.Der.Parser", "readBEB128, byteVal: " + d);
                }
                if (0 != (j2 >> 57)) {
                    throw new C91055b("The value is too large.");
                } else if (0 == j2 && 128 == d) {
                    throw new C91055b("The value must be minimally encoded.");
                } else {
                    j2 = (j2 << 7) | ((long) (d & Byte.MAX_VALUE));
                    if (z) {
                        Log.m105918d("MicroMsg.Der.Parser", "readBEB128, beb128Val: " + j2);
                    }
                }
            } while ((d & 128) != 0);
            if (z) {
                Log.m105918d("MicroMsg.Der.Parser", "readBEB128, done, beb128Val: " + j2);
            }
            if (z) {
                Log.m105918d("MicroMsg.Der.Parser", "readTag, beb128Val: " + j2);
            }
            if (536870911 < j2) {
                throw new C91055b("The tag number is not within our supported bounds.");
            } else if (31 <= j2) {
                i3 = (int) j2;
                if (z) {
                    Log.m105918d("MicroMsg.Der.Parser", "readTag, tagNo: " + i3);
                }
            } else {
                throw new C91055b("Small tag numbers should have used low tag number form, even in BER.");
            }
        }
        int i4 = i3 | i2;
        boolean z3 = f261217e;
        if (z3) {
            Log.m105918d("MicroMsg.Der.Parser", "readTag, tag: " + i4);
        }
        byte d3 = mo125119d();
        if (z3) {
            Log.m105918d("MicroMsg.Der.Parser", "readLen, lenByte: " + d3);
        }
        if ((d3 & 128) == 0) {
            j = (long) d3;
        } else {
            byte b = d3 & Byte.MAX_VALUE;
            if (z3) {
                Log.m105918d("MicroMsg.Der.Parser", "readLen, num: " + b);
            }
            if (b == 0 || 4 < b) {
                throw new C91055b("The long-form encoding length is illegal.");
            }
            if (z3) {
                Log.m105918d("MicroMsg.Der.Parser", "readLong, len: " + b);
            }
            int i5 = this.f261220c;
            int i6 = i5 + b;
            if (i6 <= this.f261218a.f261216c) {
                long j3 = 0;
                while (i5 < i6) {
                    long a = (long) this.f261218a.mo125113a(i5);
                    if (f261217e) {
                        Log.m105918d("MicroMsg.Der.Parser", "readLong, i: " + i5 + ", byteVal: " + a);
                    }
                    j3 = (j3 << 8) | a;
                    i5++;
                }
                if (f261217e) {
                    Log.m105918d("MicroMsg.Der.Parser", "readLong, value: " + j3);
                }
                if (128 > j3) {
                    throw new C91055b("Length should have used short-form encoding.");
                } else if (0 != (j3 >>> ((b - 1) * 8))) {
                    j = j3;
                } else {
                    throw new C91055b("Length should have been at least one byte shorter.");
                }
            } else {
                throw new C91055b("Not enough data for read next " + b + " bytes.");
            }
        }
        boolean z4 = f261217e;
        if (z4) {
            Log.m105918d("MicroMsg.Der.Parser", "readLen, len: " + j);
        }
        int i7 = (int) j;
        int i8 = this.f261220c;
        C91053a aVar = this.f261218a;
        C91053a a2 = C91053a.f261213d.mo125115a(aVar.f261214a, aVar.f261215b + i8, i7);
        this.f261220c = i;
        this.f261221d = (i8 - i) + i7;
        if (z4) {
            Log.m105918d("MicroMsg.Der.Parser", "peekTagAndValue, tag: " + i4 + ", len: " + i7 + ", valData: " + a2 + ", pendingReadLen: " + this.f261221d);
        }
        return new C13604l<>(Integer.valueOf(i4), a2);
    }

    /* renamed from: d */
    public final byte mo125119d() {
        int i = this.f261220c;
        C91053a aVar = this.f261218a;
        if (i < aVar.f261216c) {
            this.f261220c = i + 1;
            return aVar.mo125113a(i);
        }
        throw new C91055b("Data has been exhausted.");
    }

    /* renamed from: e */
    public final C91056c mo125120e() {
        mo125116a();
        if (f261217e) {
            Log.m105918d("MicroMsg.Der.Parser", "readConstructed, tag: " + mo125122g(536870928));
        }
        return new C91056c(mo125121f(536870928));
    }

    /* renamed from: f */
    public final C91053a mo125121f(int i) {
        mo125116a();
        if (f261217e) {
            Log.m105918d("MicroMsg.Der.Parser", "readTag, tag: " + mo125122g(i));
        }
        C13604l<Integer, C91053a> c = mo125118c();
        int intValue = ((Number) c.f38555d).intValue();
        C91053a aVar = (C91053a) c.f38556e;
        if (intValue == i) {
            mo125117b(false);
            return aVar;
        }
        mo125117b(true);
        throw new C91055b("Next tag is not " + mo125122g(i));
    }

    /* renamed from: g */
    public final String mo125122g(int i) {
        if (i == 4) {
            return "OCTET_STRING";
        }
        if (i == 6) {
            return "OBJECT";
        }
        if (i == 536870928) {
            return "SEQUENCE";
        }
        return "UNKNOWN(" + i + ')';
    }
}
