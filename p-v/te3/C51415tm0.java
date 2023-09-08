package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tm0 */
public class C51415tm0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<FinderContact> f142285d = new LinkedList<>();

    /* renamed from: e */
    public int f142286e;

    /* renamed from: f */
    public long f142287f;

    /* renamed from: g */
    public C89349b f142288g;

    /* renamed from: h */
    public LinkedList<C50275lk0> f142289h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51415tm0)) {
            return false;
        }
        C51415tm0 tm02 = (C51415tm0) aVar;
        return C46238a.m51546a(this.BaseResponse, tm02.BaseResponse) && C46238a.m51546a(this.f142285d, tm02.f142285d) && C46238a.m51546a(Integer.valueOf(this.f142286e), Integer.valueOf(tm02.f142286e)) && C46238a.m51546a(Long.valueOf(this.f142287f), Long.valueOf(tm02.f142287f)) && C46238a.m51546a(this.f142288g, tm02.f142288g) && C46238a.m51546a(this.f142289h, tm02.f142289h);
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
            aVar.mo74320g(2, 8, this.f142285d);
            aVar.mo74318e(3, this.f142286e);
            aVar.mo74321h(4, this.f142287f);
            C89349b bVar = this.f142288g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            aVar.mo74320g(6, 8, this.f142289h);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f142285d) + C52418a.m58678e(3, this.f142286e) + C52418a.m58681h(4, this.f142287f);
            C89349b bVar2 = this.f142288g;
            if (bVar2 != null) {
                g += C52418a.m58675b(5, bVar2);
            }
            return g + C52418a.m58680g(6, 8, this.f142289h);
        } else if (i == 2) {
            this.f142285d.clear();
            this.f142289h.clear();
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
            C51415tm0 tm02 = objArr[1];
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
                        tm02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        FinderContact finderContact = new FinderContact();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderContact.parseFrom(bArr2);
                        }
                        tm02.f142285d.add(finderContact);
                    }
                    return 0;
                case 3:
                    tm02.f142286e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    tm02.f142287f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    tm02.f142288g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50275lk0 lk02 = new C50275lk0();
                        if (bArr3 != null && bArr3.length > 0) {
                            lk02.parseFrom(bArr3);
                        }
                        tm02.f142289h.add(lk02);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
