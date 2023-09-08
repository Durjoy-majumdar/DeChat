package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uf3 */
public class C51539uf3 extends C47465a {

    /* renamed from: d */
    public int f142832d;

    /* renamed from: e */
    public int f142833e;

    /* renamed from: f */
    public int f142834f;

    /* renamed from: g */
    public int f142835g;

    /* renamed from: h */
    public C50473n00 f142836h;

    /* renamed from: i */
    public C50473n00 f142837i;

    /* renamed from: j */
    public C50473n00 f142838j;

    /* renamed from: n */
    public C50473n00 f142839n;

    /* renamed from: o */
    public int f142840o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51539uf3)) {
            return false;
        }
        C51539uf3 uf32 = (C51539uf3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142832d), Integer.valueOf(uf32.f142832d)) && C46238a.m51546a(Integer.valueOf(this.f142833e), Integer.valueOf(uf32.f142833e)) && C46238a.m51546a(Integer.valueOf(this.f142834f), Integer.valueOf(uf32.f142834f)) && C46238a.m51546a(Integer.valueOf(this.f142835g), Integer.valueOf(uf32.f142835g)) && C46238a.m51546a(this.f142836h, uf32.f142836h) && C46238a.m51546a(this.f142837i, uf32.f142837i) && C46238a.m51546a(this.f142838j, uf32.f142838j) && C46238a.m51546a(this.f142839n, uf32.f142839n) && C46238a.m51546a(Integer.valueOf(this.f142840o), Integer.valueOf(uf32.f142840o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f142832d);
            aVar.mo74318e(2, this.f142833e);
            aVar.mo74318e(3, this.f142834f);
            aVar.mo74318e(4, this.f142835g);
            C50473n00 n002 = this.f142836h;
            if (n002 != null) {
                aVar.mo74322i(5, n002.computeSize());
                this.f142836h.writeFields(aVar);
            }
            C50473n00 n003 = this.f142837i;
            if (n003 != null) {
                aVar.mo74322i(6, n003.computeSize());
                this.f142837i.writeFields(aVar);
            }
            C50473n00 n004 = this.f142838j;
            if (n004 != null) {
                aVar.mo74322i(7, n004.computeSize());
                this.f142838j.writeFields(aVar);
            }
            C50473n00 n005 = this.f142839n;
            if (n005 != null) {
                aVar.mo74322i(8, n005.computeSize());
                this.f142839n.writeFields(aVar);
            }
            aVar.mo74318e(100, this.f142840o);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f142832d) + 0 + C52418a.m58678e(2, this.f142833e) + C52418a.m58678e(3, this.f142834f) + C52418a.m58678e(4, this.f142835g);
            C50473n00 n006 = this.f142836h;
            if (n006 != null) {
                e += C52418a.m58682i(5, n006.computeSize());
            }
            C50473n00 n007 = this.f142837i;
            if (n007 != null) {
                e += C52418a.m58682i(6, n007.computeSize());
            }
            C50473n00 n008 = this.f142838j;
            if (n008 != null) {
                e += C52418a.m58682i(7, n008.computeSize());
            }
            C50473n00 n009 = this.f142839n;
            if (n009 != null) {
                e += C52418a.m58682i(8, n009.computeSize());
            }
            return e + C52418a.m58678e(100, this.f142840o);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51539uf3 uf32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 100) {
                switch (intValue) {
                    case 1:
                        uf32.f142832d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        uf32.f142833e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        uf32.f142834f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        uf32.f142835g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            byte[] bArr = j.get(i2);
                            C50473n00 n0010 = new C50473n00();
                            if (bArr != null && bArr.length > 0) {
                                n0010.parseFrom(bArr);
                            }
                            uf32.f142836h = n0010;
                        }
                        return 0;
                    case 6:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            byte[] bArr2 = j2.get(i3);
                            C50473n00 n0011 = new C50473n00();
                            if (bArr2 != null && bArr2.length > 0) {
                                n0011.parseFrom(bArr2);
                            }
                            uf32.f142837i = n0011;
                        }
                        return 0;
                    case 7:
                        LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                        int size3 = j3.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            byte[] bArr3 = j3.get(i4);
                            C50473n00 n0012 = new C50473n00();
                            if (bArr3 != null && bArr3.length > 0) {
                                n0012.parseFrom(bArr3);
                            }
                            uf32.f142838j = n0012;
                        }
                        return 0;
                    case 8:
                        LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                        int size4 = j4.size();
                        for (int i5 = 0; i5 < size4; i5++) {
                            byte[] bArr4 = j4.get(i5);
                            C50473n00 n0013 = new C50473n00();
                            if (bArr4 != null && bArr4.length > 0) {
                                n0013.parseFrom(bArr4);
                            }
                            uf32.f142839n = n0013;
                        }
                        return 0;
                    default:
                        return -1;
                }
            } else {
                uf32.f142840o = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
