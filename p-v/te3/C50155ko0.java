package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ko0 */
public class C50155ko0 extends C49335eu3 {

    /* renamed from: d */
    public int f136902d;

    /* renamed from: e */
    public float f136903e;

    /* renamed from: f */
    public C89349b f136904f;

    /* renamed from: g */
    public int f136905g;

    /* renamed from: h */
    public LinkedList<C50505n71> f136906h = new LinkedList<>();

    /* renamed from: i */
    public long f136907i;

    /* renamed from: j */
    public long f136908j;

    /* renamed from: n */
    public long f136909n;

    /* renamed from: o */
    public long f136910o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50155ko0)) {
            return false;
        }
        C50155ko0 ko02 = (C50155ko0) aVar;
        return C46238a.m51546a(this.BaseResponse, ko02.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f136902d), Integer.valueOf(ko02.f136902d)) && C46238a.m51546a(Float.valueOf(this.f136903e), Float.valueOf(ko02.f136903e)) && C46238a.m51546a(this.f136904f, ko02.f136904f) && C46238a.m51546a(Integer.valueOf(this.f136905g), Integer.valueOf(ko02.f136905g)) && C46238a.m51546a(this.f136906h, ko02.f136906h) && C46238a.m51546a(Long.valueOf(this.f136907i), Long.valueOf(ko02.f136907i)) && C46238a.m51546a(Long.valueOf(this.f136908j), Long.valueOf(ko02.f136908j)) && C46238a.m51546a(Long.valueOf(this.f136909n), Long.valueOf(ko02.f136909n)) && C46238a.m51546a(Long.valueOf(this.f136910o), Long.valueOf(ko02.f136910o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f136902d);
            aVar.mo74317d(3, this.f136903e);
            C89349b bVar = this.f136904f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74318e(5, this.f136905g);
            aVar.mo74320g(6, 8, this.f136906h);
            aVar.mo74321h(7, this.f136907i);
            aVar.mo74321h(8, this.f136908j);
            aVar.mo74321h(9, this.f136909n);
            aVar.mo74321h(10, this.f136910o);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f136902d) + C52418a.m58677d(3, this.f136903e);
            C89349b bVar2 = this.f136904f;
            if (bVar2 != null) {
                e += C52418a.m58675b(4, bVar2);
            }
            return e + C52418a.m58678e(5, this.f136905g) + C52418a.m58680g(6, 8, this.f136906h) + C52418a.m58681h(7, this.f136907i) + C52418a.m58681h(8, this.f136908j) + C52418a.m58681h(9, this.f136909n) + C52418a.m58681h(10, this.f136910o);
        } else if (i == 2) {
            this.f136906h.clear();
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
            C50155ko0 ko02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        ko02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ko02.f136902d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ko02.f136903e = aVar3.mo141628f(intValue);
                    return 0;
                case 4:
                    ko02.f136904f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    ko02.f136905g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50505n71 n712 = new C50505n71();
                        if (bArr2 != null && bArr2.length > 0) {
                            n712.parseFrom(bArr2);
                        }
                        ko02.f136906h.add(n712);
                    }
                    return 0;
                case 7:
                    ko02.f136907i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    ko02.f136908j = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    ko02.f136909n = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    ko02.f136910o = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
