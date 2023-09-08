package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b63 */
public class C64253b63 extends C47465a {

    /* renamed from: d */
    public int f182214d;

    /* renamed from: e */
    public C89349b f182215e;

    /* renamed from: f */
    public String f182216f;

    /* renamed from: g */
    public C51018qv3 f182217g;

    /* renamed from: h */
    public int f182218h;

    /* renamed from: i */
    public int f182219i;

    /* renamed from: j */
    public int f182220j;

    /* renamed from: n */
    public int f182221n;

    /* renamed from: o */
    public int f182222o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64253b63)) {
            return false;
        }
        C64253b63 b632 = (C64253b63) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182214d), Integer.valueOf(b632.f182214d)) && C46238a.m51546a(this.f182215e, b632.f182215e) && C46238a.m51546a(this.f182216f, b632.f182216f) && C46238a.m51546a(this.f182217g, b632.f182217g) && C46238a.m51546a(Integer.valueOf(this.f182218h), Integer.valueOf(b632.f182218h)) && C46238a.m51546a(Integer.valueOf(this.f182219i), Integer.valueOf(b632.f182219i)) && C46238a.m51546a(Integer.valueOf(this.f182220j), Integer.valueOf(b632.f182220j)) && C46238a.m51546a(Integer.valueOf(this.f182221n), Integer.valueOf(b632.f182221n)) && C46238a.m51546a(Integer.valueOf(this.f182222o), Integer.valueOf(b632.f182222o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f182217g != null) {
                aVar.mo74318e(1, this.f182214d);
                C89349b bVar = this.f182215e;
                if (bVar != null) {
                    aVar.mo74315b(2, bVar);
                }
                String str = this.f182216f;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C51018qv3 qv32 = this.f182217g;
                if (qv32 != null) {
                    aVar.mo74322i(4, qv32.computeSize());
                    this.f182217g.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f182218h);
                aVar.mo74318e(6, this.f182219i);
                aVar.mo74318e(7, this.f182220j);
                aVar.mo74318e(8, this.f182221n);
                aVar.mo74318e(9, this.f182222o);
                return 0;
            }
            throw new C52419b("Not all required fields were included: ClientKey");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f182214d) + 0;
            C89349b bVar2 = this.f182215e;
            if (bVar2 != null) {
                e += C52418a.m58675b(2, bVar2);
            }
            String str2 = this.f182216f;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            C51018qv3 qv33 = this.f182217g;
            if (qv33 != null) {
                e += C52418a.m58682i(4, qv33.computeSize());
            }
            return e + C52418a.m58678e(5, this.f182218h) + C52418a.m58678e(6, this.f182219i) + C52418a.m58678e(7, this.f182220j) + C52418a.m58678e(8, this.f182221n) + C52418a.m58678e(9, this.f182222o);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f182217g != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ClientKey");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64253b63 b632 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    b632.f182214d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    b632.f182215e = aVar3.mo141626d(intValue);
                    return 0;
                case 3:
                    b632.f182216f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr != null && bArr.length > 0) {
                            qv34.mo73348f(bArr);
                        }
                        b632.f182217g = qv34;
                    }
                    return 0;
                case 5:
                    b632.f182218h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    b632.f182219i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    b632.f182220j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    b632.f182221n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    b632.f182222o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
