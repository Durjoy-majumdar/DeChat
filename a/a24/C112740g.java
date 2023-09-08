package a24;

import android.os.Build;
import b24.C113082a;
import b24.C113083a0;
import b24.C113087c0;
import b24.C113088d;
import b24.C113089d0;
import b24.C113093f0;
import b24.C113094g;
import b24.C113101j0;
import b24.C113103k0;
import b24.C113109o;
import b24.C113115u;
import b24.C113117w;
import c24.C16848d;
import c24.C79920c;
import com.eclipsesource.mmv8.Platform;
import com.tencent.mars.cdn.CdnLogic;
import oicq.wlogin_sdk.tools.C117790util;

/* renamed from: a24.g */
public class C112740g extends C112737d {
    public C112740g(C112739f fVar) {
        this.f337567e = 2064;
        this.f337568f = 9;
        this.f337569g = fVar;
    }

    /* renamed from: g */
    public byte[] mo164498g(long j, int i, long j2, int i2, byte[] bArr, byte[] bArr2, int i3, int i4, long[] jArr, int i5, long j3, int i6, int i7, int i8, int i9, int i15, byte[] bArr3) {
        byte[] bArr4;
        int i16;
        byte[] bArr5;
        byte[] bArr6;
        int i17;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        byte[] bArr10;
        int i18;
        byte[] bArr11;
        int i19;
        long j4 = j2;
        byte[] bArr12 = bArr2;
        byte[] bArr13 = bArr3;
        C112739f fVar = this.f337569g;
        int i25 = fVar.f337579i;
        fVar.f337576f = j4;
        if (bArr12 == null || bArr12.length < 16) {
            bArr4 = null;
        } else {
            byte[] bArr14 = (byte[]) bArr2.clone();
            int length = bArr14.length - 16;
            byte[] bArr15 = new byte[length];
            System.arraycopy(bArr14, 0, bArr15, 0, length);
            byte[] bArr16 = new byte[16];
            this.f337569g.f337572b = bArr16;
            System.arraycopy(bArr14, length, bArr16, 0, 16);
            bArr4 = bArr15;
        }
        if (bArr4 == null) {
            return null;
        }
        C112739f fVar2 = this.f337569g;
        byte[] bArr17 = fVar2.f337581k;
        byte[] d = fVar2.f337574d.mo165629d();
        byte[] bArr18 = this.f337569g.f337584n;
        C113101j0 j0Var = new C113101j0();
        C113103k0 k0Var = new C113103k0();
        C113109o oVar = new C113109o();
        C113082a aVar = new C113082a();
        C113094g gVar = new C113094g();
        byte[] bArr19 = new byte[128];
        byte[] bArr20 = new byte[128];
        C113088d dVar = new C113088d();
        C113115u uVar = new C113115u();
        C113117w wVar = new C113117w();
        C113088d dVar2 = dVar;
        C113083a0 a0Var = new C113083a0();
        C113087c0 c0Var = new C113087c0();
        C113083a0 a0Var2 = a0Var;
        C113089d0 d0Var = new C113089d0();
        C113109o oVar2 = oVar;
        C113093f0 f0Var = new C113093f0();
        C113094g gVar2 = gVar;
        byte[] bArr21 = bArr17;
        byte[] bArr22 = new byte[128];
        byte[] bArr23 = d;
        int i26 = i25;
        byte[] bArr24 = bArr18;
        byte[] i27 = j0Var.mo165624i(j, i25, j2, i2);
        byte[] i28 = k0Var.mo165625i(j4, bArr);
        this.f337569g.f337594x = mo164490a(bArr4);
        int length2 = bArr4.length;
        int i29 = length2 + 4;
        if (i29 > 128) {
            byte[] bArr25 = new byte[(i29 + 128)];
            i16 = 0;
            System.arraycopy(bArr22, 0, bArr25, 0, 4);
            bArr22 = bArr25;
        } else {
            i16 = 0;
        }
        System.arraycopy(bArr4, i16, bArr22, 4, length2);
        C117790util.m166193o(bArr22, i16, 262);
        C117790util.m166193o(bArr22, 2, length2);
        byte[] bArr26 = new byte[i29];
        System.arraycopy(bArr22, i16, bArr26, i16, i29);
        C117790util.m166180b("req2 a1:", C117790util.m166186h(bArr26));
        byte[] bArr27 = bArr21;
        byte[] bArr28 = bArr23;
        byte[] bArr29 = bArr19;
        int i35 = i26;
        byte[] i36 = aVar.mo165616i(j, j3, i35, i5);
        byte[] i37 = gVar2.mo165623i(i7, i8, i9, i15);
        byte[] i38 = oVar2.mo165633i(i3, i4, jArr);
        byte[] i39 = d0Var.mo165620i(this.f337569g.f337581k);
        byte[] bArr30 = new byte[0];
        byte[] bArr31 = new byte[0];
        byte[] bArr32 = new byte[0];
        byte[] bArr33 = bArr20;
        byte[] bArr34 = bArr3;
        byte[] bArr35 = new byte[0];
        if (bArr34.length > 0) {
            int length3 = bArr34.length;
            byte[] bArr36 = new byte[length3];
            bArr6 = bArr31;
            bArr5 = bArr32;
            System.arraycopy(bArr34, 0, bArr36, 0, bArr34.length);
            C117790util.m166193o(bArr29, 0, CdnLogic.kGroupNoticeCDNAppType);
            int i44 = 0 + 2;
            C117790util.m166193o(bArr29, i44, 0);
            int i45 = i44 + 2;
            if (length3 > 128 - 4) {
                bArr11 = new byte[(length3 + 4 + 64)];
                i19 = 0;
                System.arraycopy(bArr29, 0, bArr11, 0, i45);
            } else {
                i19 = 0;
                bArr11 = bArr29;
            }
            System.arraycopy(bArr36, i19, bArr11, i45, length3);
            int i46 = i45 + length3;
            C117790util.m166193o(bArr11, 2, i46 - 4);
            bArr30 = new byte[i46];
            System.arraycopy(bArr11, 0, bArr30, 0, i46);
            i17 = 8;
        } else {
            bArr5 = bArr32;
            bArr6 = bArr31;
            i17 = 7;
        }
        if (bArr27.length > 0) {
            int length4 = bArr27.length;
            byte[] bArr37 = new byte[length4];
            System.arraycopy(bArr27, 0, bArr37, 0, bArr27.length);
            byte[] bArr38 = bArr33;
            C117790util.m166193o(bArr38, 0, 265);
            int i47 = 0 + 2;
            C117790util.m166193o(bArr38, i47, 0);
            int i48 = i47 + 2;
            if (length4 > 128 - 4) {
                bArr10 = new byte[(length4 + 4 + 64)];
                bArr7 = bArr26;
                i18 = 0;
                System.arraycopy(bArr38, 0, bArr10, 0, i48);
            } else {
                bArr7 = bArr26;
                i18 = 0;
                bArr10 = bArr38;
            }
            System.arraycopy(bArr37, i18, bArr10, i48, length4);
            int i49 = i48 + length4;
            C117790util.m166193o(bArr10, 2, i49 - 4);
            bArr8 = new byte[i49];
            System.arraycopy(bArr10, 0, bArr8, 0, i49);
        } else {
            bArr7 = bArr26;
            bArr8 = bArr6;
        }
        byte[] bytes = new String(Platform.ANDROID).getBytes();
        byte[] bytes2 = Build.VERSION.RELEASE.getBytes();
        C112739f fVar3 = this.f337569g;
        byte[] i54 = uVar.mo165634i(bytes, bytes2, fVar3.f337583m, fVar3.f337582l, new byte[0], fVar3.f337585o);
        C112739f fVar4 = this.f337569g;
        byte[] bArr39 = i39;
        byte[] i55 = wVar.mo165635i(fVar4.f337589s, fVar4.f337590t, fVar4.f337591u, 0, fVar4.f337588r, fVar4.f337581k);
        C112739f fVar5 = this.f337569g;
        byte[] bArr40 = bArr30;
        byte[] i56 = c0Var.mo165618i(bArr8, i54, i55, f0Var.mo165622i(j, fVar5.f337586p, fVar5.f337587q), this.f337569g.f337572b);
        byte[] i57 = a0Var2.mo165617i(bArr24);
        int i58 = i17 + 1 + 1;
        byte[] bArr41 = bArr28;
        if (bArr41.length > 0) {
            bArr9 = dVar2.mo165619i(bArr41);
            i58++;
        } else {
            bArr9 = bArr35;
        }
        byte[] bArr42 = bArr40;
        byte[] bArr43 = bArr39;
        byte[] bArr44 = new byte[(i27.length + i28.length + i29 + i38.length + i36.length + i37.length + bArr42.length + i56.length + bArr9.length + i57.length + 0 + bArr43.length)];
        System.arraycopy(i27, 0, bArr44, 0, i27.length);
        int length5 = i27.length + 0;
        System.arraycopy(i28, 0, bArr44, length5, i28.length);
        int length6 = length5 + i28.length;
        System.arraycopy(bArr7, 0, bArr44, length6, i29);
        int i59 = length6 + i29;
        System.arraycopy(i38, 0, bArr44, i59, i38.length);
        int length7 = i59 + i38.length;
        System.arraycopy(i36, 0, bArr44, length7, i36.length);
        int length8 = length7 + i36.length;
        System.arraycopy(i37, 0, bArr44, length8, i37.length);
        int length9 = length8 + i37.length;
        System.arraycopy(bArr42, 0, bArr44, length9, bArr42.length);
        int length10 = length9 + bArr42.length;
        System.arraycopy(i56, 0, bArr44, length10, i56.length);
        int length11 = length10 + i56.length;
        System.arraycopy(i57, 0, bArr44, length11, i57.length);
        int length12 = length11 + i57.length;
        System.arraycopy(bArr5, 0, bArr44, length12, 0);
        int i64 = length12 + 0;
        System.arraycopy(bArr9, 0, bArr44, i64, bArr9.length);
        System.arraycopy(bArr43, 0, bArr44, i64 + bArr9.length, bArr43.length);
        mo164493d(8001, this.f337567e, C112737d.f337562h, j2, 0, 0, i35, 0, mo164491b(bArr44, this.f337568f, i58));
        int i65 = this.f337564b;
        byte[] bArr45 = new byte[i65];
        System.arraycopy(this.f337566d, 0, bArr45, 0, i65);
        return bArr45;
    }

    /* renamed from: h */
    public byte[] mo164499h(long j, int i, long j2, int i2, byte[] bArr, byte[] bArr2, int i3, byte[] bArr3, int i4, int i5, long[] jArr, int i6, long j3, int i7, int i8, int i9, int i15, int i16, byte[] bArr4) {
        byte[] bArr5;
        int i17;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        int i18;
        byte[] bArr10;
        byte[] bArr11;
        byte[] bArr12;
        byte[] bArr13;
        byte[] bArr14;
        int i19;
        int i25;
        long j4 = j;
        long j5 = j2;
        byte[] bArr15 = bArr;
        byte[] bArr16 = bArr2;
        byte[] bArr17 = bArr3;
        byte[] bArr18 = bArr4;
        C112739f fVar = this.f337569g;
        int i26 = fVar.f337579i;
        fVar.f337576f = j5;
        C117790util.m166180b("IMEI", C117790util.m166186h(fVar.f337581k));
        C112739f fVar2 = this.f337569g;
        byte[] bArr19 = fVar2.f337572b;
        byte[] bArr20 = fVar2.f337581k;
        byte[] d = fVar2.f337574d.mo165629d();
        byte[] bArr21 = this.f337569g.f337584n;
        C113101j0 j0Var = new C113101j0();
        C113103k0 k0Var = new C113103k0();
        byte[] bArr22 = bArr21;
        C113109o oVar = new C113109o();
        C113082a aVar = new C113082a();
        byte[] bArr23 = new byte[128];
        C113094g gVar = new C113094g();
        byte[] bArr24 = new byte[128];
        C113088d dVar = new C113088d();
        C113115u uVar = new C113115u();
        C113117w wVar = new C113117w();
        C113088d dVar2 = dVar;
        C113083a0 a0Var = new C113083a0();
        C113087c0 c0Var = new C113087c0();
        C113083a0 a0Var2 = a0Var;
        C113089d0 d0Var = new C113089d0();
        byte[] bArr25 = bArr22;
        C113093f0 f0Var = new C113093f0();
        C113109o oVar2 = oVar;
        byte[] bArr26 = new byte[128];
        byte[] bArr27 = d;
        byte[] bArr28 = bArr19;
        byte[] bArr29 = bArr20;
        int i27 = i26;
        byte[] i28 = j0Var.mo165624i(j, i26, j2, i2);
        byte[] i29 = k0Var.mo165625i(j5, bArr15);
        C112739f fVar3 = this.f337569g;
        int i35 = fVar3.f337590t;
        byte[] bArr30 = fVar3.f337581k;
        byte[] bArr31 = new byte[90];
        C117790util.m166193o(bArr31, 0, 2);
        C117790util.m166194p(bArr31, 2, C117790util.m166191m());
        C117790util.m166194p(bArr31, 6, 5);
        C117790util.m166194p(bArr31, 10, (int) j4);
        C117790util.m166194p(bArr31, 14, i27);
        C117790util.m166195q(bArr31, 18, j5);
        System.arraycopy(bArr16, 0, bArr31, 26, bArr16.length);
        int length = bArr16.length + 26;
        System.arraycopy(bArr15, 0, bArr31, length, bArr15.length);
        int length2 = length + bArr15.length;
        bArr31[length2 + 0] = (byte) 1;
        int i36 = length2 + 1;
        byte[] bArr32 = bArr3;
        int i37 = i27;
        System.arraycopy(bArr32, 0, bArr31, i36, bArr32.length);
        int length3 = i36 + bArr32.length;
        byte[] bArr33 = bArr28;
        System.arraycopy(bArr33, 0, bArr31, length3, bArr33.length);
        int length4 = length3 + bArr33.length;
        C117790util.m166194p(bArr31, length4, 0);
        int i38 = length4 + 4;
        bArr31[i38 + 0] = (byte) (i35 >> 0);
        int i39 = i38 + 1;
        if (bArr30 == null || bArr30.length <= 0) {
            byte[] bArr34 = new byte[16];
            C117790util.m166194p(bArr34, 0, C117790util.m166191m());
            C117790util.m166194p(bArr34, 4, C117790util.m166191m());
            C117790util.m166194p(bArr34, 8, C117790util.m166191m());
            C117790util.m166194p(bArr34, 12, C117790util.m166191m());
        } else {
            System.arraycopy(bArr30, 0, bArr31, i39, bArr30.length);
        }
        byte[] bArr35 = new byte[24];
        System.arraycopy(bArr32, 0, bArr35, 0, bArr32.length);
        C117790util.m166195q(bArr35, 16, j5);
        byte[] b = C16848d.m16501b(bArr31, 0, 90, C79920c.m97091l(bArr35));
        int length5 = b.length;
        byte[] bArr36 = bArr23;
        C117790util.m166193o(bArr36, 0, 262);
        C117790util.m166193o(bArr36, 2, 0);
        if (length5 > 124) {
            bArr5 = new byte[(length5 + 4 + 64)];
            System.arraycopy(bArr36, 0, bArr5, 0, 4);
        } else {
            bArr5 = bArr36;
        }
        System.arraycopy(b, 0, bArr5, 4, length5);
        int i44 = length5 + 4;
        C117790util.m166193o(bArr5, 2, i44 - 4);
        byte[] bArr37 = new byte[i44];
        System.arraycopy(bArr5, 0, bArr37, 0, i44);
        C112739f fVar4 = this.f337569g;
        byte[] bArr38 = new byte[length5];
        System.arraycopy(bArr5, 4, bArr38, 0, length5);
        fVar4.f337594x = mo164490a(bArr38);
        byte[] bArr39 = bArr37;
        byte[] bArr40 = i28;
        byte[] i45 = aVar.mo165616i(j, j3, i37, i6);
        byte[] i46 = gVar.mo165623i(i8, i9, i15, i16);
        byte[] i47 = oVar2.mo165633i(i4, i5, jArr);
        byte[] i48 = d0Var.mo165620i(this.f337569g.f337581k);
        byte[] bArr41 = new byte[0];
        byte[] bArr42 = new byte[0];
        byte[] bArr43 = new byte[0];
        byte[] bArr44 = bArr4;
        byte[] bArr45 = new byte[0];
        if (bArr44.length > 0) {
            int length6 = bArr44.length;
            bArr7 = bArr41;
            byte[] bArr46 = new byte[length6];
            bArr6 = bArr42;
            i17 = i37;
            System.arraycopy(bArr44, 0, bArr46, 0, bArr44.length);
            byte[] bArr47 = bArr24;
            C117790util.m166193o(bArr47, 0, CdnLogic.kGroupNoticeCDNAppType);
            int i49 = 0 + 2;
            C117790util.m166193o(bArr47, i49, 0);
            int i54 = i49 + 2;
            if (length6 > 128 - 4) {
                byte[] bArr48 = new byte[(length6 + 4 + 64)];
                bArr8 = bArr43;
                i25 = 0;
                System.arraycopy(bArr47, 0, bArr48, 0, i54);
                bArr47 = bArr48;
            } else {
                bArr8 = bArr43;
                i25 = 0;
            }
            System.arraycopy(bArr46, i25, bArr47, i54, length6);
            int i55 = i54 + length6;
            C117790util.m166193o(bArr47, 2, i55 - 4);
            bArr10 = new byte[i55];
            System.arraycopy(bArr47, 0, bArr10, 0, i55);
            bArr9 = bArr29;
            i18 = 8;
        } else {
            bArr7 = bArr41;
            bArr6 = bArr42;
            bArr8 = bArr43;
            i17 = i37;
            bArr10 = bArr45;
            bArr9 = bArr29;
            i18 = 7;
        }
        if (bArr9.length > 0) {
            int length7 = bArr9.length;
            byte[] bArr49 = new byte[length7];
            bArr12 = bArr39;
            System.arraycopy(bArr9, 0, bArr49, 0, bArr9.length);
            byte[] bArr50 = bArr26;
            C117790util.m166193o(bArr50, 0, 265);
            int i56 = 0 + 2;
            C117790util.m166193o(bArr50, i56, 0);
            int i57 = i56 + 2;
            if (length7 > 128 - 4) {
                bArr14 = new byte[(length7 + 4 + 64)];
                bArr11 = i48;
                i19 = 0;
                System.arraycopy(bArr50, 0, bArr14, 0, i57);
            } else {
                bArr11 = i48;
                i19 = 0;
                bArr14 = bArr50;
            }
            System.arraycopy(bArr49, i19, bArr14, i57, length7);
            int i58 = i57 + length7;
            C117790util.m166193o(bArr14, 2, i58 - 4);
            byte[] bArr51 = new byte[i58];
            System.arraycopy(bArr14, 0, bArr51, 0, i58);
            bArr7 = bArr51;
        } else {
            bArr11 = i48;
            bArr12 = bArr39;
        }
        byte[] bytes = new String(Platform.ANDROID).getBytes();
        byte[] bytes2 = Build.VERSION.RELEASE.getBytes();
        C112739f fVar5 = this.f337569g;
        byte[] bArr52 = bArr10;
        byte[] i59 = uVar.mo165634i(bytes, bytes2, fVar5.f337583m, fVar5.f337582l, new byte[0], fVar5.f337585o);
        C112739f fVar6 = this.f337569g;
        byte[] i64 = wVar.mo165635i(fVar6.f337589s, fVar6.f337590t, fVar6.f337591u, 0, fVar6.f337588r, fVar6.f337581k);
        C112739f fVar7 = this.f337569g;
        byte[] i65 = c0Var.mo165618i(bArr7, i59, i64, f0Var.mo165622i(j4, fVar7.f337586p, fVar7.f337587q), this.f337569g.f337572b);
        byte[] i66 = a0Var2.mo165617i(bArr25);
        int i67 = i18 + 1 + 1;
        byte[] bArr53 = bArr27;
        if (bArr53.length > 0) {
            bArr13 = dVar2.mo165619i(bArr53);
            i67++;
        } else {
            bArr13 = bArr6;
        }
        byte[] bArr54 = bArr40;
        byte[] bArr55 = bArr52;
        byte[] bArr56 = bArr11;
        byte[] bArr57 = new byte[(bArr54.length + i29.length + i44 + i47.length + i45.length + i46.length + bArr55.length + i65.length + bArr13.length + i66.length + 0 + bArr56.length)];
        System.arraycopy(bArr54, 0, bArr57, 0, bArr54.length);
        int length8 = bArr54.length + 0;
        System.arraycopy(i29, 0, bArr57, length8, i29.length);
        int length9 = length8 + i29.length;
        System.arraycopy(bArr12, 0, bArr57, length9, i44);
        int i68 = length9 + i44;
        System.arraycopy(i47, 0, bArr57, i68, i47.length);
        int length10 = i68 + i47.length;
        System.arraycopy(i45, 0, bArr57, length10, i45.length);
        int length11 = length10 + i45.length;
        System.arraycopy(i46, 0, bArr57, length11, i46.length);
        int length12 = length11 + i46.length;
        System.arraycopy(bArr55, 0, bArr57, length12, bArr55.length);
        int length13 = length12 + bArr55.length;
        System.arraycopy(i65, 0, bArr57, length13, i65.length);
        int length14 = length13 + i65.length;
        System.arraycopy(i66, 0, bArr57, length14, i66.length);
        int length15 = length14 + i66.length;
        System.arraycopy(bArr8, 0, bArr57, length15, 0);
        int i69 = length15 + 0;
        System.arraycopy(bArr13, 0, bArr57, i69, bArr13.length);
        System.arraycopy(bArr56, 0, bArr57, i69 + bArr13.length, bArr56.length);
        byte[] b2 = mo164491b(bArr57, this.f337568f, i67);
        mo164493d(8001, this.f337567e, C112737d.f337562h, j2, 0, 0, i17, 0, b2);
        int i74 = this.f337564b;
        byte[] bArr58 = new byte[i74];
        System.arraycopy(this.f337566d, 0, bArr58, 0, i74);
        return bArr58;
    }
}
