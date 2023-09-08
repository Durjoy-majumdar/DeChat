package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nr1 */
public class C50582nr1 extends C49335eu3 {

    /* renamed from: d */
    public String f138734d;

    /* renamed from: e */
    public LinkedList<String> f138735e = new LinkedList<>();

    /* renamed from: f */
    public String f138736f;

    /* renamed from: g */
    public LinkedList<String> f138737g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<String> f138738h = new LinkedList<>();

    /* renamed from: i */
    public LinkedList<C50719or1> f138739i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50582nr1)) {
            return false;
        }
        C50582nr1 nr12 = (C50582nr1) aVar;
        return C46238a.m51546a(this.BaseResponse, nr12.BaseResponse) && C46238a.m51546a(this.f138734d, nr12.f138734d) && C46238a.m51546a(this.f138735e, nr12.f138735e) && C46238a.m51546a(this.f138736f, nr12.f138736f) && C46238a.m51546a(this.f138737g, nr12.f138737g) && C46238a.m51546a(this.f138738h, nr12.f138738h) && C46238a.m51546a(this.f138739i, nr12.f138739i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f138734d == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f138736f != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                String str = this.f138734d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74320g(3, 1, this.f138735e);
                String str2 = this.f138736f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                aVar.mo74320g(5, 1, this.f138737g);
                aVar.mo74320g(6, 1, this.f138738h);
                aVar.mo74320g(7, 8, this.f138739i);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: JsonData");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str3 = this.f138734d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int g = i2 + C52418a.m58680g(3, 1, this.f138735e);
            String str4 = this.f138736f;
            if (str4 != null) {
                g += C52418a.m58683j(4, str4);
            }
            return g + C52418a.m58680g(5, 1, this.f138737g) + C52418a.m58680g(6, 1, this.f138738h) + C52418a.m58680g(7, 8, this.f138739i);
        } else if (i == 2) {
            this.f138735e.clear();
            this.f138737g.clear();
            this.f138738h.clear();
            this.f138739i.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f138734d == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f138736f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: JsonData");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50582nr1 nr12 = objArr[1];
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
                        nr12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    nr12.f138734d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    nr12.f138735e.add(aVar3.mo141633k(intValue));
                    return 0;
                case 4:
                    nr12.f138736f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    nr12.f138737g.add(aVar3.mo141633k(intValue));
                    return 0;
                case 6:
                    nr12.f138738h.add(aVar3.mo141633k(intValue));
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50719or1 or12 = new C50719or1();
                        if (bArr2 != null && bArr2.length > 0) {
                            or12.parseFrom(bArr2);
                        }
                        nr12.f138739i.add(or12);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
