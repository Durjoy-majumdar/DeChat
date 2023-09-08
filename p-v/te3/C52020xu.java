package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xu */
public class C52020xu extends C49335eu3 {

    /* renamed from: d */
    public C89349b f144963d;

    /* renamed from: e */
    public C89349b f144964e;

    /* renamed from: f */
    public C89349b f144965f;

    /* renamed from: g */
    public int f144966g;

    /* renamed from: h */
    public int f144967h;

    /* renamed from: i */
    public C89349b f144968i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52020xu)) {
            return false;
        }
        C52020xu xuVar = (C52020xu) aVar;
        return C46238a.m51546a(this.BaseResponse, xuVar.BaseResponse) && C46238a.m51546a(this.f144963d, xuVar.f144963d) && C46238a.m51546a(this.f144964e, xuVar.f144964e) && C46238a.m51546a(this.f144965f, xuVar.f144965f) && C46238a.m51546a(Integer.valueOf(this.f144966g), Integer.valueOf(xuVar.f144966g)) && C46238a.m51546a(Integer.valueOf(this.f144967h), Integer.valueOf(xuVar.f144967h)) && C46238a.m51546a(this.f144968i, xuVar.f144968i);
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
                C89349b bVar = this.f144963d;
                if (bVar != null) {
                    aVar.mo74315b(2, bVar);
                }
                C89349b bVar2 = this.f144964e;
                if (bVar2 != null) {
                    aVar.mo74315b(3, bVar2);
                }
                C89349b bVar3 = this.f144965f;
                if (bVar3 != null) {
                    aVar.mo74315b(4, bVar3);
                }
                aVar.mo74318e(5, this.f144966g);
                aVar.mo74318e(6, this.f144967h);
                C89349b bVar4 = this.f144968i;
                if (bVar4 != null) {
                    aVar.mo74315b(7, bVar4);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C89349b bVar5 = this.f144963d;
            if (bVar5 != null) {
                i2 += C52418a.m58675b(2, bVar5);
            }
            C89349b bVar6 = this.f144964e;
            if (bVar6 != null) {
                i2 += C52418a.m58675b(3, bVar6);
            }
            C89349b bVar7 = this.f144965f;
            if (bVar7 != null) {
                i2 += C52418a.m58675b(4, bVar7);
            }
            int e = i2 + C52418a.m58678e(5, this.f144966g) + C52418a.m58678e(6, this.f144967h);
            C89349b bVar8 = this.f144968i;
            return bVar8 != null ? e + C52418a.m58675b(7, bVar8) : e;
        } else if (i == 2) {
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
            C52020xu xuVar = objArr[1];
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
                        xuVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    xuVar.f144963d = aVar3.mo141626d(intValue);
                    return 0;
                case 3:
                    xuVar.f144964e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    xuVar.f144965f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    xuVar.f144966g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    xuVar.f144967h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    xuVar.f144968i = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
