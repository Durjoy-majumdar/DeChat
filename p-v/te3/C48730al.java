package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.al */
public class C48730al extends C47465a {

    /* renamed from: d */
    public int f130602d;

    /* renamed from: e */
    public C50456mv3 f130603e;

    /* renamed from: f */
    public int f130604f;

    /* renamed from: g */
    public C51975xh2 f130605g;

    /* renamed from: h */
    public String f130606h;

    /* renamed from: i */
    public String f130607i;

    /* renamed from: j */
    public int f130608j;

    /* renamed from: n */
    public C50746ox f130609n;

    /* renamed from: o */
    public long f130610o;

    /* renamed from: p */
    public long f130611p;

    /* renamed from: q */
    public C52219z50 f130612q;

    /* renamed from: r */
    public C52219z50 f130613r;

    /* renamed from: s */
    public long f130614s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48730al)) {
            return false;
        }
        C48730al alVar = (C48730al) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f130602d), Integer.valueOf(alVar.f130602d)) && C46238a.m51546a(this.f130603e, alVar.f130603e) && C46238a.m51546a(Integer.valueOf(this.f130604f), Integer.valueOf(alVar.f130604f)) && C46238a.m51546a(this.f130605g, alVar.f130605g) && C46238a.m51546a(this.f130606h, alVar.f130606h) && C46238a.m51546a(this.f130607i, alVar.f130607i) && C46238a.m51546a(Integer.valueOf(this.f130608j), Integer.valueOf(alVar.f130608j)) && C46238a.m51546a(this.f130609n, alVar.f130609n) && C46238a.m51546a(Long.valueOf(this.f130610o), Long.valueOf(alVar.f130610o)) && C46238a.m51546a(Long.valueOf(this.f130611p), Long.valueOf(alVar.f130611p)) && C46238a.m51546a(this.f130612q, alVar.f130612q) && C46238a.m51546a(this.f130613r, alVar.f130613r) && C46238a.m51546a(Long.valueOf(this.f130614s), Long.valueOf(alVar.f130614s));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f130602d);
            C50456mv3 mv32 = this.f130603e;
            if (mv32 != null) {
                aVar.mo74322i(2, mv32.computeSize());
                this.f130603e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f130604f);
            C51975xh2 xh22 = this.f130605g;
            if (xh22 != null) {
                aVar.mo74322i(4, xh22.computeSize());
                this.f130605g.writeFields(aVar);
            }
            String str = this.f130606h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f130607i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74318e(7, this.f130608j);
            C50746ox oxVar = this.f130609n;
            if (oxVar != null) {
                aVar.mo74322i(8, oxVar.computeSize());
                this.f130609n.writeFields(aVar);
            }
            aVar.mo74321h(9, this.f130610o);
            aVar.mo74321h(10, this.f130611p);
            C52219z50 z502 = this.f130612q;
            if (z502 != null) {
                aVar.mo74322i(11, z502.computeSize());
                this.f130612q.writeFields(aVar);
            }
            C52219z50 z503 = this.f130613r;
            if (z503 != null) {
                aVar.mo74322i(12, z503.computeSize());
                this.f130613r.writeFields(aVar);
            }
            aVar.mo74321h(13, this.f130614s);
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f130602d) + 0;
            C50456mv3 mv33 = this.f130603e;
            if (mv33 != null) {
                e += C52418a.m58682i(2, mv33.computeSize());
            }
            int e2 = e + C52418a.m58678e(3, this.f130604f);
            C51975xh2 xh23 = this.f130605g;
            if (xh23 != null) {
                e2 += C52418a.m58682i(4, xh23.computeSize());
            }
            String str3 = this.f130606h;
            if (str3 != null) {
                e2 += C52418a.m58683j(5, str3);
            }
            String str4 = this.f130607i;
            if (str4 != null) {
                e2 += C52418a.m58683j(6, str4);
            }
            int e3 = e2 + C52418a.m58678e(7, this.f130608j);
            C50746ox oxVar2 = this.f130609n;
            if (oxVar2 != null) {
                e3 += C52418a.m58682i(8, oxVar2.computeSize());
            }
            int h = e3 + C52418a.m58681h(9, this.f130610o) + C52418a.m58681h(10, this.f130611p);
            C52219z50 z504 = this.f130612q;
            if (z504 != null) {
                h += C52418a.m58682i(11, z504.computeSize());
            }
            C52219z50 z505 = this.f130613r;
            if (z505 != null) {
                h += C52418a.m58682i(12, z505.computeSize());
            }
            return h + C52418a.m58681h(13, this.f130614s);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C48730al alVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    alVar.f130602d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C50456mv3 mv34 = new C50456mv3();
                        if (bArr != null && bArr.length > 0) {
                            mv34.parseFrom(bArr);
                        }
                        alVar.f130603e = mv34;
                    }
                    return 0;
                case 3:
                    alVar.f130604f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51975xh2 xh24 = new C51975xh2();
                        if (bArr2 != null && bArr2.length > 0) {
                            xh24.parseFrom(bArr2);
                        }
                        alVar.f130605g = xh24;
                    }
                    return 0;
                case 5:
                    alVar.f130606h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    alVar.f130607i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    alVar.f130608j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50746ox oxVar3 = new C50746ox();
                        if (bArr3 != null && bArr3.length > 0) {
                            oxVar3.parseFrom(bArr3);
                        }
                        alVar.f130609n = oxVar3;
                    }
                    return 0;
                case 9:
                    alVar.f130610o = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    alVar.f130611p = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C52219z50 z506 = new C52219z50();
                        if (bArr4 != null && bArr4.length > 0) {
                            z506.parseFrom(bArr4);
                        }
                        alVar.f130612q = z506;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C52219z50 z507 = new C52219z50();
                        if (bArr5 != null && bArr5.length > 0) {
                            z507.parseFrom(bArr5);
                        }
                        alVar.f130613r = z507;
                    }
                    return 0;
                case 13:
                    alVar.f130614s = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
