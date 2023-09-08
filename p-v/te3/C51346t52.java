package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t52 */
public class C51346t52 extends C49335eu3 {

    /* renamed from: d */
    public int f141963d;

    /* renamed from: e */
    public LinkedList<C52089y93> f141964e = new LinkedList<>();

    /* renamed from: f */
    public int f141965f;

    /* renamed from: g */
    public int f141966g;

    /* renamed from: h */
    public int f141967h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51346t52)) {
            return false;
        }
        C51346t52 t522 = (C51346t52) aVar;
        return C46238a.m51546a(this.BaseResponse, t522.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f141963d), Integer.valueOf(t522.f141963d)) && C46238a.m51546a(this.f141964e, t522.f141964e) && C46238a.m51546a(Integer.valueOf(this.f141965f), Integer.valueOf(t522.f141965f)) && C46238a.m51546a(Integer.valueOf(this.f141966g), Integer.valueOf(t522.f141966g)) && C46238a.m51546a(Integer.valueOf(this.f141967h), Integer.valueOf(t522.f141967h));
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
                aVar.mo74318e(2, this.f141963d);
                aVar.mo74320g(3, 8, this.f141964e);
                aVar.mo74318e(4, this.f141965f);
                aVar.mo74318e(5, this.f141966g);
                aVar.mo74318e(6, this.f141967h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f141963d) + C52418a.m58680g(3, 8, this.f141964e) + C52418a.m58678e(4, this.f141965f) + C52418a.m58678e(5, this.f141966g) + C52418a.m58678e(6, this.f141967h);
        } else if (i == 2) {
            this.f141964e.clear();
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
            C51346t52 t522 = objArr[1];
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
                        t522.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    t522.f141963d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C52089y93 y932 = new C52089y93();
                        if (bArr2 != null && bArr2.length > 0) {
                            y932.parseFrom(bArr2);
                        }
                        t522.f141964e.add(y932);
                    }
                    return 0;
                case 4:
                    t522.f141965f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    t522.f141966g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    t522.f141967h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
