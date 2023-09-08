package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gp */
public class C49589gp extends C49335eu3 {

    /* renamed from: d */
    public int f134179d;

    /* renamed from: e */
    public String f134180e;

    /* renamed from: f */
    public String f134181f;

    /* renamed from: g */
    public String f134182g;

    /* renamed from: h */
    public LinkedList<C49823ib0> f134183h = new LinkedList<>();

    /* renamed from: i */
    public int f134184i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49589gp)) {
            return false;
        }
        C49589gp gpVar = (C49589gp) aVar;
        return C46238a.m51546a(this.BaseResponse, gpVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f134179d), Integer.valueOf(gpVar.f134179d)) && C46238a.m51546a(this.f134180e, gpVar.f134180e) && C46238a.m51546a(this.f134181f, gpVar.f134181f) && C46238a.m51546a(this.f134182g, gpVar.f134182g) && C46238a.m51546a(this.f134183h, gpVar.f134183h) && C46238a.m51546a(Integer.valueOf(this.f134184i), Integer.valueOf(gpVar.f134184i));
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
                aVar.mo74318e(2, this.f134179d);
                String str = this.f134180e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f134181f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f134182g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                aVar.mo74320g(6, 8, this.f134183h);
                aVar.mo74318e(7, this.f134184i);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f134179d);
            String str4 = this.f134180e;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            String str5 = this.f134181f;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f134182g;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            return e + C52418a.m58680g(6, 8, this.f134183h) + C52418a.m58678e(7, this.f134184i);
        } else if (i == 2) {
            this.f134183h.clear();
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
            C49589gp gpVar = objArr[1];
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
                        gpVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    gpVar.f134179d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    gpVar.f134180e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    gpVar.f134181f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    gpVar.f134182g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49823ib0 ib02 = new C49823ib0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ib02.parseFrom(bArr2);
                        }
                        gpVar.f134183h.add(ib02);
                    }
                    return 0;
                case 7:
                    gpVar.f134184i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
