package a24;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.exifinterface.media.ExifInterface;
import b24.C113084b;
import b24.C113085b0;
import b24.C113086c;
import b24.C113088d;
import b24.C113089d0;
import b24.C113090e;
import b24.C113091e0;
import b24.C113092f;
import b24.C113095g0;
import b24.C113096h;
import b24.C113097h0;
import b24.C113098i;
import b24.C113099i0;
import b24.C113100j;
import b24.C113102k;
import b24.C113104l;
import b24.C113105l0;
import b24.C113106m;
import b24.C113108n;
import b24.C113110p;
import b24.C113111q;
import b24.C113112r;
import b24.C113113s;
import b24.C113114t;
import b24.C113116v;
import b24.C113118x;
import b24.C113119y;
import b24.C113120z;
import c24.C16848d;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Array;
import oicq.wlogin_sdk.tools.C117790util;
import oicq.wlogin_sdk.tools.ErrMsg;

/* renamed from: a24.d */
public class C112737d {

    /* renamed from: h */
    public static int f337562h;

    /* renamed from: a */
    public int f337563a = 4096;

    /* renamed from: b */
    public int f337564b = 0;

    /* renamed from: c */
    public int f337565c = 0;

    /* renamed from: d */
    public byte[] f337566d = new byte[4096];

    /* renamed from: e */
    public int f337567e = 0;

    /* renamed from: f */
    public int f337568f = 0;

    /* renamed from: g */
    public C112739f f337569g;

    /* renamed from: a */
    public byte[] mo164490a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[(bArr.length + this.f337569g.f337572b.length)];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = this.f337569g.f337572b;
        System.arraycopy(bArr3, 0, bArr2, bArr.length, bArr3.length);
        return bArr2;
    }

    /* renamed from: b */
    public byte[] mo164491b(byte[] bArr, int i, int i2) {
        int length = bArr.length + 4;
        byte[] bArr2 = new byte[length];
        C117790util.m166193o(bArr2, 0, i);
        C117790util.m166193o(bArr2, 2, i2);
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        byte[] b = C16848d.m16501b(bArr2, 0, length, this.f337569g.f337573c);
        int length2 = b.length;
        byte[] bArr3 = this.f337569g.f337573c;
        byte[] bArr4 = new byte[(length2 + bArr3.length)];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        System.arraycopy(b, 0, bArr4, this.f337569g.f337573c.length, b.length);
        return bArr4;
    }

    /* renamed from: c */
    public void mo164492c(byte[] bArr, int i, int i2) {
        C113091e0 e0Var = new C113091e0();
        if (e0Var.mo165630e(bArr, i, i2) >= 0) {
            ErrMsg errMsg = this.f337569g.f337593w;
            int i3 = e0Var.f338491f;
            byte[] bArr2 = new byte[i3];
            System.arraycopy(e0Var.f338497d, 10, bArr2, 0, i3);
            errMsg.f352323e = new String(bArr2);
            ErrMsg errMsg2 = this.f337569g.f337593w;
            int i4 = e0Var.f338492g;
            byte[] bArr3 = new byte[i4];
            System.arraycopy(e0Var.f338497d, e0Var.f338491f + 12, bArr3, 0, i4);
            errMsg2.f352324f = new String(bArr3);
            ErrMsg errMsg3 = this.f337569g.f337593w;
            int i5 = e0Var.f338493h;
            byte[] bArr4 = new byte[i5];
            System.arraycopy(e0Var.f338497d, e0Var.f338491f + 16 + e0Var.f338492g, bArr4, 0, i5);
            errMsg3.f352325g = new String(bArr4);
            return;
        }
        ErrMsg errMsg4 = this.f337569g.f337593w;
        errMsg4.f352322d = 0;
        errMsg4.f352323e = "";
        errMsg4.f352324f = "";
        errMsg4.f352325g = "";
    }

    /* renamed from: d */
    public void mo164493d(int i, int i2, int i3, long j, int i4, int i5, int i6, int i7, byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        int i8 = f337562h + 1;
        f337562h = i8;
        byte[] bArr3 = this.f337566d;
        bArr3[0] = (byte) 2;
        int i9 = 0 + 1;
        this.f337564b = i9;
        C117790util.m166193o(bArr3, i9, length + 29);
        int i15 = this.f337564b + 2;
        this.f337564b = i15;
        int i16 = i;
        C117790util.m166193o(this.f337566d, i15, i);
        int i17 = this.f337564b + 2;
        this.f337564b = i17;
        int i18 = i2;
        C117790util.m166193o(this.f337566d, i17, i2);
        int i19 = this.f337564b + 2;
        this.f337564b = i19;
        C117790util.m166193o(this.f337566d, i19, i8);
        int i25 = this.f337564b + 2;
        this.f337564b = i25;
        C117790util.m166194p(this.f337566d, i25, (int) j);
        int i26 = this.f337564b + 4;
        byte[] bArr4 = this.f337566d;
        byte b = (byte) 3;
        bArr4[i26 + 0] = b;
        int i27 = i26 + 1;
        bArr4[i27 + 0] = (byte) 0;
        int i28 = i27 + 1;
        bArr4[i28 + 0] = (byte) (i4 >> 0);
        int i29 = i28 + 1;
        this.f337564b = i29;
        C117790util.m166194p(bArr4, i29, i5);
        int i35 = this.f337564b + 4;
        this.f337564b = i35;
        C117790util.m166194p(this.f337566d, i35, i6);
        int i36 = this.f337564b + 4;
        this.f337564b = i36;
        C117790util.m166194p(this.f337566d, i36, i7);
        int i37 = this.f337564b + 4;
        this.f337564b = i37;
        int i38 = length + i37 + 1;
        if (i38 > this.f337563a) {
            int i39 = i38 + 128;
            this.f337563a = i39;
            byte[] bArr5 = new byte[i39];
            System.arraycopy(this.f337566d, 0, bArr5, 0, i37);
            this.f337566d = bArr5;
        }
        System.arraycopy(bArr2, 0, this.f337566d, this.f337564b, length);
        int i44 = this.f337564b + length;
        this.f337566d[i44 + 0] = b;
        this.f337564b = i44 + 1;
    }

    /* renamed from: e */
    public int mo164494e(byte[] bArr, int i, int i2) {
        char c;
        int i3;
        int i4;
        int i5;
        byte[] bArr2;
        C113113s sVar;
        byte[] bArr3;
        C113114t tVar;
        byte[] bArr4;
        C113116v vVar;
        byte[] bArr5;
        byte[] bArr6;
        int i6;
        C113097h0 h0Var;
        int i7;
        long j;
        C113120z zVar;
        byte[][] bArr7;
        byte[] bArr8;
        int i8;
        C112737d dVar = this;
        byte[] bArr9 = bArr;
        C113088d dVar2 = new C113088d();
        C113090e eVar = new C113090e();
        byte[] bArr10 = new byte[128];
        int i9 = dVar.f337567e;
        int i15 = 4;
        int i16 = 0;
        int i17 = 2;
        if (i9 == 2064 && dVar.f337568f == 9) {
            c = 0;
        } else if (i9 == 2064 && dVar.f337568f == 10) {
            c = 1;
        } else if (i9 == 2064 && dVar.f337568f == 2) {
            c = 2;
        } else if (i9 != 2064 || dVar.f337568f != 13) {
            return -1012;
        } else {
            c = 4;
        }
        if (i2 < 5) {
            return -1009;
        }
        byte b = bArr9[i + 2] & ExifInterface.MARKER;
        dVar.mo164495f((ErrMsg) null);
        int i18 = i + 5;
        if (b != 0) {
            if (b == 1) {
                dVar.mo164492c(bArr9, i18, (dVar.f337564b - i18) - 1);
            } else if (b != 2) {
                dVar.mo164492c(bArr9, i18, (dVar.f337564b - i18) - 1);
            } else {
                int e = dVar2.mo165630e(bArr9, i18, (dVar.f337564b - i18) - 1);
                if (e < 0) {
                    return e;
                }
                dVar.f337569g.f337574d = dVar2;
                int e2 = eVar.mo165630e(bArr9, i18, (dVar.f337564b - i18) - 1);
                if (e2 < 0) {
                    return e2;
                }
                dVar.f337569g.f337575e = eVar;
            }
            return b;
        } else if (c == 1) {
            dVar.f337569g.getClass();
            return -1006;
        } else {
            int i19 = (dVar.f337564b - i18) - 1;
            byte[] bArr11 = dVar.f337569g.f337572b;
            int length = bArr9.length;
            int i25 = i18;
            while (true) {
                i3 = -1;
                if (i25 < length && (i8 = i25 + 2) <= length) {
                    if (C117790util.m166184f(bArr9, i25) == 281) {
                        break;
                    } else if (i8 + 2 > length) {
                        break;
                    } else {
                        i25 = C117790util.m166184f(bArr9, i8) + 2 + i8;
                        dVar = this;
                        i15 = 4;
                        i16 = 0;
                        i17 = 2;
                    }
                } else {
                    break;
                }
            }
            i25 = -1;
            if (i25 < 0) {
                i5 = 0;
                i4 = -1;
            } else {
                int i26 = i19 - (i25 - i18);
                byte[] bArr12 = new byte[i26];
                System.arraycopy(bArr9, i25, bArr12, i16, i26);
                if (i15 >= i26) {
                    i5 = 0;
                } else {
                    i5 = C117790util.m166184f(bArr12, i17);
                    if (i5 + 4 <= i26) {
                        byte[] a = C16848d.m16500a(bArr12, i15, i5, bArr11);
                        if (a == null) {
                            i3 = -1015;
                        } else {
                            if (a.length + i15 > 128) {
                                bArr10 = new byte[(a.length + i15)];
                            }
                            System.arraycopy(bArr12, i16, bArr10, i16, i15);
                            System.arraycopy(a, i16, bArr10, 0 + i15, a.length);
                            i5 = a.length;
                            i3 = !Boolean.TRUE.booleanValue() ? -1005 : 0;
                        }
                    }
                }
                i4 = i3;
            }
            if (i4 < 0) {
                C117790util.m166181c("119 can not decrypt, ret=" + i4);
                return i4;
            }
            C113104l lVar = new C113104l();
            C113106m mVar = new C113106m();
            C113098i iVar = new C113098i();
            C113108n nVar = new C113108n();
            C113086c cVar = new C113086c();
            C113110p pVar = new C113110p();
            C113084b bVar = new C113084b();
            C113100j jVar = new C113100j();
            C113111q qVar = new C113111q();
            C113113s sVar2 = new C113113s();
            C113114t tVar2 = new C113114t();
            C113096h hVar = new C113096h();
            C113092f fVar = new C113092f();
            C113102k kVar = new C113102k();
            C113116v vVar2 = new C113116v();
            C113112r rVar = new C113112r();
            C113120z zVar2 = new C113120z();
            C113118x xVar = new C113118x();
            C113085b0 b0Var = new C113085b0();
            C113105l0 l0Var = new C113105l0();
            C113095g0 g0Var = new C113095g0();
            C113097h0 h0Var2 = new C113097h0();
            C113099i0 i0Var = new C113099i0();
            C113119y yVar = new C113119y();
            byte[] bArr13 = new byte[i5];
            C113113s sVar3 = sVar2;
            C113114t tVar3 = tVar2;
            System.arraycopy(bArr10, 4, bArr13, 0, i5);
            int length2 = bArr13.length;
            lVar.mo165630e(bArr13, 2, length2);
            mVar.mo165630e(bArr13, 2, length2);
            iVar.mo165630e(bArr13, 2, length2);
            nVar.mo165630e(bArr13, 2, length2);
            int e3 = pVar.mo165630e(bArr13, 2, length2);
            if (e3 >= 0) {
                byte[] d = cVar.mo165630e(bArr13, 2, length2) >= 0 ? cVar.mo165629d() : null;
                if (hVar.mo165630e(bArr13, 2, length2) >= 0) {
                    Context context = dVar.f337569g.f337580j;
                    byte[] d2 = hVar.mo165629d();
                    byte[] k = C117790util.m166189k(context);
                    if (k == null || k.length <= 0) {
                        SharedPreferences.Editor edit = context.getSharedPreferences("WLOGIN_DEVICE_INFO", 0).edit();
                        edit.putString("ksid", C117790util.m166186h(d2));
                        edit.commit();
                    }
                }
                byte[] d3 = bVar.mo165630e(bArr13, 2, length2) >= 0 ? bVar.mo165629d() : null;
                byte[] d4 = jVar.mo165630e(bArr13, 2, length2) >= 0 ? jVar.mo165629d() : null;
                if (qVar.mo165630e(bArr13, 2, length2) >= 0) {
                    bArr2 = qVar.mo165629d();
                    sVar = sVar3;
                } else {
                    sVar = sVar3;
                    bArr2 = null;
                }
                if (sVar.mo165630e(bArr13, 2, length2) >= 0) {
                    bArr3 = sVar.mo165629d();
                    tVar = tVar3;
                } else {
                    tVar = tVar3;
                    bArr3 = null;
                }
                if (tVar.mo165630e(bArr13, 2, length2) >= 0) {
                    bArr4 = tVar.mo165629d();
                    vVar = vVar2;
                } else {
                    vVar = vVar2;
                    bArr4 = null;
                }
                if (vVar.mo165630e(bArr13, 2, length2) >= 0) {
                    int i27 = vVar.f338502f;
                    byte[] bArr14 = new byte[i27];
                    System.arraycopy(vVar.f338497d, 6, bArr14, 0, i27);
                    int i28 = vVar.f338503g;
                    byte[] bArr15 = new byte[i28];
                    i6 = 2;
                    System.arraycopy(vVar.f338497d, vVar.f338502f + 6 + 2, bArr15, 0, i28);
                    bArr6 = bArr14;
                    bArr5 = bArr15;
                    h0Var = h0Var2;
                } else {
                    i6 = 2;
                    h0Var = h0Var2;
                    bArr6 = null;
                    bArr5 = null;
                }
                if (h0Var.mo165630e(bArr13, i6, length2) >= 0) {
                    C113092f fVar2 = new C113092f();
                    C113102k kVar2 = new C113102k();
                    C113099i0 i0Var2 = new C113099i0();
                    C113089d0 d0Var = new C113089d0();
                    byte[] d5 = h0Var.mo165629d();
                    int length3 = d5.length;
                    if (fVar2.mo165630e(d5, 2, length3) >= 0 && kVar2.mo165630e(d5, 2, length3) >= 0 && i0Var2.mo165630e(d5, 2, length3) >= 0) {
                        byte[] c2 = fVar2.mo165628c();
                        byte[] c3 = kVar2.mo165628c();
                        byte[] c4 = i0Var2.mo165628c();
                        byte[] i29 = d0Var.mo165620i(dVar.f337569g.f337581k);
                        bArr8 = new byte[(c2.length + 3 + c3.length + c4.length + i29.length)];
                        bArr8[0] = 64;
                        C117790util.m166193o(bArr8, 1, 4);
                        System.arraycopy(c2, 0, bArr8, 3, c2.length);
                        int length4 = c2.length + 3;
                        System.arraycopy(c3, 0, bArr8, length4, c3.length);
                        int length5 = length4 + c3.length;
                        System.arraycopy(c4, 0, bArr8, length5, c4.length);
                        System.arraycopy(i29, 0, bArr8, length5 + c4.length, i29.length);
                    } else {
                        bArr8 = null;
                    }
                    if (bArr8 == null || bArr8.length <= 0) {
                        dVar.f337569g.getClass();
                    } else {
                        dVar.f337569g.getClass();
                        C117790util.m166180b("fast data:", C117790util.m166186h(bArr8));
                    }
                }
                byte[][] bArr16 = (byte[][]) Array.newInstance(Byte.TYPE, new int[]{7, 0});
                C113119y yVar2 = yVar;
                if (yVar2.mo165630e(bArr13, 2, length2) >= 0) {
                    bArr16[0] = yVar2.mo165629d();
                }
                C113102k kVar3 = kVar;
                int e4 = kVar3.mo165630e(bArr13, 2, length2);
                C113092f fVar3 = fVar;
                if (fVar3.mo165630e(bArr13, 2, length2) >= 0 && e4 >= 0) {
                    dVar.f337569g.f337572b = kVar3.mo165629d();
                    dVar.f337569g.f337594x = dVar.mo164490a(fVar3.mo165629d());
                    bArr16[1] = (byte[]) dVar.f337569g.f337594x.clone();
                }
                C113118x xVar2 = xVar;
                if (xVar2.mo165630e(bArr13, 2, length2) >= 0) {
                    int i35 = xVar2.f338505f;
                    byte[] bArr17 = new byte[i35];
                    System.arraycopy(xVar2.f338497d, 6, bArr17, 0, i35);
                    bArr16[2] = bArr17;
                }
                C113085b0 b0Var2 = b0Var;
                if (b0Var2.mo165630e(bArr13, 2, length2) >= 0) {
                    bArr16[3] = b0Var2.mo165629d();
                }
                C113105l0 l0Var2 = l0Var;
                if (l0Var2.mo165630e(bArr13, 2, length2) >= 0) {
                    bArr16[4] = l0Var2.mo165629d();
                }
                C113095g0 g0Var2 = g0Var;
                if (g0Var2.mo165630e(bArr13, 2, length2) >= 0) {
                    bArr16[5] = g0Var2.mo165629d();
                }
                C113099i0 i0Var3 = i0Var;
                if (i0Var3.mo165630e(bArr13, 2, length2) >= 0) {
                    bArr16[6] = i0Var3.mo165629d();
                }
                C113112r rVar2 = rVar;
                int e5 = rVar2.mo165630e(bArr13, 2, length2);
                long j2 = Util.MAX_32BIT_VALUE;
                if (e5 >= 0) {
                    long j3 = dVar.f337569g.f337578h;
                    if (j3 == -1) {
                        j3 = (long) C117790util.m166185g(rVar2.f338497d, 4);
                    }
                    j2 = ((long) C117790util.m166185g(rVar2.f338497d, 8)) & Util.MAX_32BIT_VALUE;
                    zVar = zVar2;
                    i7 = 2;
                    j = j3;
                } else {
                    j = 3600;
                    zVar = zVar2;
                    i7 = 2;
                }
                long i36 = (zVar.mo165630e(bArr13, i7, length2) < 0 || zVar.mo165636i() == 0) ? 2160000 : (long) zVar.mo165636i();
                if (i36 < j) {
                    i36 = j;
                }
                C112739f fVar4 = dVar.f337569g;
                long j4 = fVar4.f337576f;
                long j5 = j2;
                long j6 = fVar4.f337577g;
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                long currentTimeMillis2 = (System.currentTimeMillis() / 1000) + j;
                byte[][] bArr18 = bArr16;
                byte[] bArr19 = new byte[2];
                long currentTimeMillis3 = (System.currentTimeMillis() / 1000) + i36;
                long j7 = currentTimeMillis2;
                System.arraycopy(pVar.f338497d, 4, bArr19, 0, 2);
                byte[] bArr20 = new byte[1];
                System.arraycopy(pVar.f338497d, 6, bArr20, 0, 1);
                byte[] bArr21 = new byte[1];
                byte[] bArr22 = bArr20;
                System.arraycopy(pVar.f338497d, 7, bArr21, 0, 1);
                int i37 = pVar.f338500f;
                byte[] bArr23 = new byte[i37];
                System.arraycopy(pVar.f338497d, 9, bArr23, 0, i37);
                byte[] d6 = iVar.mo165629d();
                byte[] d7 = lVar.mo165629d();
                byte[] d8 = nVar.mo165629d();
                byte[] d9 = mVar.mo165629d();
                synchronized (fVar4) {
                    StringBuilder sb = new StringBuilder("put siginfo:");
                    sb.append(j4);
                    sb.append(",");
                    long j8 = j6;
                    sb.append(j8);
                    sb.append(",");
                    long j9 = j5;
                    sb.append(j9);
                    sb.append(",");
                    sb.append(currentTimeMillis);
                    sb.append(",");
                    long j15 = currentTimeMillis;
                    long j16 = j7;
                    sb.append(j16);
                    sb.append(",");
                    long j17 = j16;
                    long j18 = currentTimeMillis3;
                    sb.append(j18);
                    sb.append(",");
                    long j19 = j18;
                    sb.append(C117790util.m166183e(bArr19));
                    sb.append(",");
                    sb.append(C117790util.m166183e(bArr22));
                    sb.append(",");
                    sb.append(C117790util.m166183e(bArr21));
                    sb.append(",");
                    sb.append(C117790util.m166183e(bArr23));
                    sb.append(",");
                    sb.append(C117790util.m166183e(d6));
                    sb.append(",");
                    sb.append(C117790util.m166183e(d7));
                    sb.append(",");
                    sb.append(C117790util.m166183e(d8));
                    sb.append(",");
                    sb.append(C117790util.m166183e(d9));
                    sb.append(",");
                    sb.append(C117790util.m166183e(d));
                    sb.append(",");
                    sb.append(C117790util.m166183e(d4));
                    sb.append(",");
                    sb.append(C117790util.m166183e(d3));
                    sb.append(",");
                    sb.append(C117790util.m166183e(bArr2));
                    sb.append(",");
                    sb.append(C117790util.m166183e(bArr3));
                    sb.append(",");
                    sb.append(C117790util.m166183e(bArr4));
                    sb.append(",");
                    sb.append(C117790util.m166183e(bArr6));
                    sb.append(",");
                    sb.append(C117790util.m166183e(bArr5));
                    C117790util.m166181c(sb.toString());
                    if (bArr18 != null) {
                        String str = "";
                        bArr7 = bArr18;
                        for (int i38 = 0; i38 < bArr7.length; i38++) {
                            str = String.valueOf(str) + String.format("reserve[%d]: %d ", new Object[]{Integer.valueOf(i38), Long.valueOf(C117790util.m166183e(bArr7[i38]))});
                        }
                        C117790util.m166181c("reserve:" + str);
                    } else {
                        bArr7 = bArr18;
                    }
                    fVar4.f337596z.mo164488d(j4, j8, j9, j15, j17, j19, bArr19, bArr22, bArr21, bArr23, d6, d7, d8, d9, d, d4, d3, bArr2, bArr3, bArr4, bArr6, bArr5, bArr7);
                }
                e3 = 0;
            }
            if (e3 >= 0) {
                return 0;
            }
            C117790util.m166181c("parse 119 failed, ret=" + e3);
            return e3;
        }
    }

    /* renamed from: f */
    public void mo164495f(ErrMsg errMsg) {
        C112739f fVar = this.f337569g;
        ErrMsg errMsg2 = fVar.f337593w;
        errMsg2.f352322d = 0;
        errMsg2.f352323e = "";
        errMsg2.f352324f = "";
        errMsg2.f352325g = "";
        if (errMsg != null) {
            try {
                fVar.f337593w = (ErrMsg) errMsg.clone();
            } catch (CloneNotSupportedException e) {
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter, true);
                e.printStackTrace(printWriter);
                printWriter.flush();
                stringWriter.flush();
                C117790util.m166182d("exception", stringWriter.toString());
                ErrMsg errMsg3 = this.f337569g.f337593w;
                errMsg3.f352322d = 0;
                errMsg3.f352323e = "";
                errMsg3.f352324f = "";
                errMsg3.f352325g = "";
            }
        }
    }
}
