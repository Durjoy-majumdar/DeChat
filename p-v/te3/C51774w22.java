package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.w22 */
public class C51774w22 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C50020jp2> f143831d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f143832e;

    /* renamed from: f */
    public int f143833f;

    /* renamed from: g */
    public LinkedList<String> f143834g = new LinkedList<>();

    /* renamed from: h */
    public int f143835h;

    /* renamed from: i */
    public boolean f143836i;

    /* renamed from: j */
    public C52146yo2 f143837j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51774w22)) {
            return false;
        }
        C51774w22 w222 = (C51774w22) aVar;
        return C46238a.m51546a(this.BaseResponse, w222.BaseResponse) && C46238a.m51546a(this.f143831d, w222.f143831d) && C46238a.m51546a(this.f143832e, w222.f143832e) && C46238a.m51546a(Integer.valueOf(this.f143833f), Integer.valueOf(w222.f143833f)) && C46238a.m51546a(this.f143834g, w222.f143834g) && C46238a.m51546a(Integer.valueOf(this.f143835h), Integer.valueOf(w222.f143835h)) && C46238a.m51546a(Boolean.valueOf(this.f143836i), Boolean.valueOf(w222.f143836i)) && C46238a.m51546a(this.f143837j, w222.f143837j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74320g(2, 8, this.f143831d);
                C89349b bVar = this.f143832e;
                if (bVar != null) {
                    aVar.mo74315b(3, bVar);
                }
                aVar.mo74318e(4, this.f143833f);
                aVar.mo74320g(5, 1, this.f143834g);
                aVar.mo74318e(6, this.f143835h);
                aVar.mo74314a(7, this.f143836i);
                C52146yo2 yo22 = this.f143837j;
                if (yo22 != null) {
                    aVar.mo74322i(8, yo22.computeSize());
                    this.f143837j.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f143831d);
            C89349b bVar2 = this.f143832e;
            if (bVar2 != null) {
                g += C52418a.m58675b(3, bVar2);
            }
            int e = g + C52418a.m58678e(4, this.f143833f) + C52418a.m58680g(5, 1, this.f143834g) + C52418a.m58678e(6, this.f143835h) + C52418a.m58674a(7, this.f143836i);
            C52146yo2 yo23 = this.f143837j;
            return yo23 != null ? e + C52418a.m58682i(8, yo23.computeSize()) : e;
        } else if (i == 2) {
            this.f143831d.clear();
            this.f143834g.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51774w22 w222 = objArr[1];
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
                        w222.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50020jp2 jp22 = new C50020jp2();
                        if (bArr2 != null && bArr2.length > 0) {
                            jp22.parseFrom(bArr2);
                        }
                        w222.f143831d.add(jp22);
                    }
                    return 0;
                case 3:
                    w222.f143832e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    w222.f143833f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    w222.f143834g.add(aVar3.mo141633k(intValue));
                    return 0;
                case 6:
                    w222.f143835h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    w222.f143836i = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C52146yo2 yo24 = new C52146yo2();
                        if (bArr3 != null && bArr3.length > 0) {
                            yo24.parseFrom(bArr3);
                        }
                        w222.f143837j = yo24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
