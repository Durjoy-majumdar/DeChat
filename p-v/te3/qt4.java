package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class qt4 extends C101820nt3 {

    /* renamed from: d */
    public C51018qv3 f299220d;

    /* renamed from: e */
    public int f299221e;

    /* renamed from: f */
    public String f299222f;

    /* renamed from: g */
    public int f299223g;

    /* renamed from: h */
    public int f299224h;

    /* renamed from: i */
    public int f299225i;

    /* renamed from: j */
    public int f299226j;

    /* renamed from: n */
    public LinkedList<C51163rv3> f299227n = new LinkedList<>();

    /* renamed from: o */
    public C51163rv3 f299228o;

    /* renamed from: p */
    public int f299229p;

    /* renamed from: q */
    public int f299230q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof qt4)) {
            return false;
        }
        qt4 qt4 = (qt4) aVar;
        return C46238a.m51546a(this.BaseRequest, qt4.BaseRequest) && C46238a.m51546a(this.f299220d, qt4.f299220d) && C46238a.m51546a(Integer.valueOf(this.f299221e), Integer.valueOf(qt4.f299221e)) && C46238a.m51546a(this.f299222f, qt4.f299222f) && C46238a.m51546a(Integer.valueOf(this.f299223g), Integer.valueOf(qt4.f299223g)) && C46238a.m51546a(Integer.valueOf(this.f299224h), Integer.valueOf(qt4.f299224h)) && C46238a.m51546a(Integer.valueOf(this.f299225i), Integer.valueOf(qt4.f299225i)) && C46238a.m51546a(Integer.valueOf(this.f299226j), Integer.valueOf(qt4.f299226j)) && C46238a.m51546a(this.f299227n, qt4.f299227n) && C46238a.m51546a(this.f299228o, qt4.f299228o) && C46238a.m51546a(Integer.valueOf(this.f299229p), Integer.valueOf(qt4.f299229p)) && C46238a.m51546a(Integer.valueOf(this.f299230q), Integer.valueOf(qt4.f299230q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f299220d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f299220d;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f299220d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f299221e);
                String str = this.f299222f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                aVar.mo74318e(5, this.f299223g);
                aVar.mo74318e(6, this.f299224h);
                aVar.mo74318e(7, this.f299225i);
                aVar.mo74318e(8, this.f299226j);
                aVar.mo74320g(9, 8, this.f299227n);
                C51163rv3 rv32 = this.f299228o;
                if (rv32 != null) {
                    aVar.mo74322i(10, rv32.computeSize());
                    this.f299228o.writeFields(aVar);
                }
                aVar.mo74318e(11, this.f299229p);
                aVar.mo74318e(12, this.f299230q);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Data");
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            int i3 = iaVar2 != null ? 0 + C52418a.m58682i(1, iaVar2.computeSize()) : 0;
            C51018qv3 qv33 = this.f299220d;
            if (qv33 != null) {
                i3 += C52418a.m58682i(2, qv33.computeSize());
            }
            int e = i3 + C52418a.m58678e(3, this.f299221e);
            String str2 = this.f299222f;
            if (str2 != null) {
                e += C52418a.m58683j(4, str2);
            }
            int e2 = e + C52418a.m58678e(5, this.f299223g) + C52418a.m58678e(6, this.f299224h) + C52418a.m58678e(7, this.f299225i) + C52418a.m58678e(8, this.f299226j) + C52418a.m58680g(9, 8, this.f299227n);
            C51163rv3 rv33 = this.f299228o;
            if (rv33 != null) {
                e2 += C52418a.m58682i(10, rv33.computeSize());
            }
            return e2 + C52418a.m58678e(11, this.f299229p) + C52418a.m58678e(12, this.f299230q);
        } else if (i2 == 2) {
            this.f299227n.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f299220d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Data");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            qt4 qt4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        qt4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        qt4.f299220d = qv34;
                    }
                    return 0;
                case 3:
                    qt4.f299221e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    qt4.f299222f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    qt4.f299223g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    qt4.f299224h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    qt4.f299225i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    qt4.f299226j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51163rv3 rv34 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv34.mo73356d(bArr3);
                        }
                        qt4.f299227n.add(rv34);
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51163rv3 rv35 = new C51163rv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            rv35.mo73356d(bArr4);
                        }
                        qt4.f299228o = rv35;
                    }
                    return 0;
                case 11:
                    qt4.f299229p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    qt4.f299230q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
