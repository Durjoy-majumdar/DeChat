package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n22 */
public class C50484n22 extends C101820nt3 {

    /* renamed from: d */
    public int f138344d;

    /* renamed from: e */
    public int f138345e;

    /* renamed from: f */
    public C51018qv3 f138346f;

    /* renamed from: g */
    public C64234an2 f138347g;

    /* renamed from: h */
    public String f138348h;

    /* renamed from: i */
    public int f138349i;

    /* renamed from: j */
    public int f138350j;

    /* renamed from: n */
    public LinkedList<C50814pd3> f138351n = new LinkedList<>();

    /* renamed from: o */
    public int f138352o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50484n22)) {
            return false;
        }
        C50484n22 n222 = (C50484n22) aVar;
        return C46238a.m51546a(this.BaseRequest, n222.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f138344d), Integer.valueOf(n222.f138344d)) && C46238a.m51546a(Integer.valueOf(this.f138345e), Integer.valueOf(n222.f138345e)) && C46238a.m51546a(this.f138346f, n222.f138346f) && C46238a.m51546a(this.f138347g, n222.f138347g) && C46238a.m51546a(this.f138348h, n222.f138348h) && C46238a.m51546a(Integer.valueOf(this.f138349i), Integer.valueOf(n222.f138349i)) && C46238a.m51546a(Integer.valueOf(this.f138350j), Integer.valueOf(n222.f138350j)) && C46238a.m51546a(this.f138351n, n222.f138351n) && C46238a.m51546a(Integer.valueOf(this.f138352o), Integer.valueOf(n222.f138352o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f138347g != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f138344d);
                aVar.mo74318e(3, this.f138345e);
                C51018qv3 qv32 = this.f138346f;
                if (qv32 != null) {
                    aVar.mo74322i(4, qv32.computeSize());
                    this.f138346f.writeFields(aVar);
                }
                C64234an2 an22 = this.f138347g;
                if (an22 != null) {
                    aVar.mo74322i(5, an22.computeSize());
                    this.f138347g.writeFields(aVar);
                }
                String str = this.f138348h;
                if (str != null) {
                    aVar.mo74323j(6, str);
                }
                aVar.mo74318e(7, this.f138349i);
                aVar.mo74318e(8, this.f138350j);
                aVar.mo74320g(11, 8, this.f138351n);
                aVar.mo74318e(12, this.f138352o);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Loc");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f138344d) + C52418a.m58678e(3, this.f138345e);
            C51018qv3 qv33 = this.f138346f;
            if (qv33 != null) {
                e += C52418a.m58682i(4, qv33.computeSize());
            }
            C64234an2 an23 = this.f138347g;
            if (an23 != null) {
                e += C52418a.m58682i(5, an23.computeSize());
            }
            String str2 = this.f138348h;
            if (str2 != null) {
                e += C52418a.m58683j(6, str2);
            }
            return e + C52418a.m58678e(7, this.f138349i) + C52418a.m58678e(8, this.f138350j) + C52418a.m58680g(11, 8, this.f138351n) + C52418a.m58678e(12, this.f138352o);
        } else if (i == 2) {
            this.f138351n.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f138347g != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Loc");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50484n22 n222 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        n222.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    n222.f138344d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    n222.f138345e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        n222.f138346f = qv34;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64234an2 an24 = new C64234an2();
                        if (bArr3 != null && bArr3.length > 0) {
                            an24.parseFrom(bArr3);
                        }
                        n222.f138347g = an24;
                    }
                    return 0;
                case 6:
                    n222.f138348h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    n222.f138349i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    n222.f138350j = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C50814pd3 pd32 = new C50814pd3();
                        if (bArr4 != null && bArr4.length > 0) {
                            pd32.parseFrom(bArr4);
                        }
                        n222.f138351n.add(pd32);
                    }
                    return 0;
                case 12:
                    n222.f138352o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
