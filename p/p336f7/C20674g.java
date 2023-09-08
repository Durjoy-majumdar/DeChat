package p336f7;

import p294b7.C16738b;
import p294b7.C16742f;
import p333e8.C20541m;
import p333e8.C20551y;

/* renamed from: f7.g */
public final class C20674g {

    /* renamed from: a */
    public static final int[] f58387a = {C20551y.m22316f("isom"), C20551y.m22316f("iso2"), C20551y.m22316f("iso3"), C20551y.m22316f("iso4"), C20551y.m22316f("iso5"), C20551y.m22316f("iso6"), C20551y.m22316f("avc1"), C20551y.m22316f("hvc1"), C20551y.m22316f("hev1"), C20551y.m22316f("mp41"), C20551y.m22316f("mp42"), C20551y.m22316f("3g2a"), C20551y.m22316f("3g2b"), C20551y.m22316f("3gr6"), C20551y.m22316f("3gs6"), C20551y.m22316f("3ge6"), C20551y.m22316f("3gg6"), C20551y.m22316f("M4V "), C20551y.m22316f("M4A "), C20551y.m22316f("f4v "), C20551y.m22316f("kddi"), C20551y.m22316f("M4VP"), C20551y.m22316f("qt  "), C20551y.m22316f("MSNV")};

    /* renamed from: a */
    public static boolean m22612a(C16742f fVar, boolean z) {
        boolean z2;
        boolean z3;
        long j = ((C16738b) fVar).f45241b;
        long j2 = -1;
        if (j == -1 || j > 4096) {
            j = 4096;
        }
        int i = (int) j;
        C20541m mVar = new C20541m(64);
        int i2 = 0;
        boolean z4 = false;
        while (true) {
            if (i2 >= i) {
                break;
            }
            mVar.mo32110u(8);
            C16738b bVar = (C16738b) fVar;
            bVar.mo17734b(mVar.f57809a, 0, 8, false);
            long o = mVar.mo32104o();
            int c = mVar.mo32092c();
            int i3 = 16;
            if (o == 1) {
                bVar.mo17734b(mVar.f57809a, 8, 8, false);
                mVar.mo32112w(16);
                o = mVar.mo32107r();
            } else {
                if (o == 0) {
                    long j3 = bVar.f45241b;
                    if (j3 != j2) {
                        o = ((long) 8) + (j3 - bVar.f45242c);
                    }
                }
                i3 = 8;
            }
            long j4 = (long) i3;
            if (o < j4) {
                return false;
            }
            i2 += i3;
            if (c != C20659a.f58175C) {
                if (c == C20659a.f58193L || c == C20659a.f58197N) {
                    z2 = true;
                } else if ((((long) i2) + o) - j4 >= ((long) i)) {
                    break;
                } else {
                    int i4 = (int) (o - j4);
                    i2 += i4;
                    if (c == C20659a.f58213b) {
                        if (i4 < 8) {
                            return false;
                        }
                        mVar.mo32110u(i4);
                        bVar.mo17734b(mVar.f57809a, 0, i4, false);
                        int i5 = i4 / 4;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i5) {
                                break;
                            }
                            if (i6 == 1) {
                                mVar.mo32114y(4);
                            } else {
                                int c2 = mVar.mo32092c();
                                if ((c2 >>> 8) != C20551y.m22316f("3gp")) {
                                    int[] iArr = f58387a;
                                    int length = iArr.length;
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= length) {
                                            z3 = false;
                                            break;
                                        } else if (iArr[i7] == c2) {
                                            break;
                                        } else {
                                            i7++;
                                        }
                                    }
                                }
                                z3 = true;
                                if (z3) {
                                    z4 = true;
                                    break;
                                }
                            }
                            i6++;
                        }
                        if (!z4) {
                            return false;
                        }
                    } else if (i4 != 0) {
                        bVar.mo17733a(i4, false);
                    }
                    j2 = -1;
                }
            }
        }
        z2 = false;
        return z4 && z == z2;
    }
}
