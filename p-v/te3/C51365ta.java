package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ta */
public class C51365ta extends C49335eu3 {

    /* renamed from: d */
    public int f142061d;

    /* renamed from: e */
    public LinkedList<String> f142062e = new LinkedList<>();

    /* renamed from: f */
    public int f142063f;

    /* renamed from: g */
    public LinkedList<C101800k70> f142064g = new LinkedList<>();

    /* renamed from: h */
    public C89349b f142065h;

    /* renamed from: i */
    public LinkedList<Boolean> f142066i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51365ta)) {
            return false;
        }
        C51365ta taVar = (C51365ta) aVar;
        return C46238a.m51546a(this.BaseResponse, taVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f142061d), Integer.valueOf(taVar.f142061d)) && C46238a.m51546a(this.f142062e, taVar.f142062e) && C46238a.m51546a(Integer.valueOf(this.f142063f), Integer.valueOf(taVar.f142063f)) && C46238a.m51546a(this.f142064g, taVar.f142064g) && C46238a.m51546a(this.f142065h, taVar.f142065h) && C46238a.m51546a(this.f142066i, taVar.f142066i);
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
                aVar.mo74318e(2, this.f142061d);
                aVar.mo74320g(3, 1, this.f142062e);
                aVar.mo74318e(4, this.f142063f);
                aVar.mo74320g(5, 8, this.f142064g);
                C89349b bVar = this.f142065h;
                if (bVar != null) {
                    aVar.mo74315b(6, bVar);
                }
                aVar.mo74320g(7, 7, this.f142066i);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f142061d) + C52418a.m58680g(3, 1, this.f142062e) + C52418a.m58678e(4, this.f142063f) + C52418a.m58680g(5, 8, this.f142064g);
            C89349b bVar2 = this.f142065h;
            if (bVar2 != null) {
                e += C52418a.m58675b(6, bVar2);
            }
            return e + C52418a.m58680g(7, 7, this.f142066i);
        } else if (i == 2) {
            this.f142062e.clear();
            this.f142064g.clear();
            this.f142066i.clear();
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
            C51365ta taVar = objArr[1];
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
                        taVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    taVar.f142061d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    taVar.f142062e.add(aVar3.mo141633k(intValue));
                    return 0;
                case 4:
                    taVar.f142063f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C101800k70 k702 = new C101800k70();
                        if (bArr2 != null && bArr2.length > 0) {
                            k702.parseFrom(bArr2);
                        }
                        taVar.f142064g.add(k702);
                    }
                    return 0;
                case 6:
                    taVar.f142065h = aVar3.mo141626d(intValue);
                    return 0;
                case 7:
                    taVar.f142066i.add(Boolean.valueOf(aVar3.mo141625c(intValue)));
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
