package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ar */
public class C48751ar extends C49335eu3 {

    /* renamed from: d */
    public int f130731d;

    /* renamed from: e */
    public String f130732e;

    /* renamed from: f */
    public String f130733f;

    /* renamed from: g */
    public String f130734g;

    /* renamed from: h */
    public int f130735h;

    /* renamed from: i */
    public LinkedList<Integer> f130736i = new LinkedList<>();

    /* renamed from: j */
    public String f130737j;

    /* renamed from: n */
    public int f130738n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48751ar)) {
            return false;
        }
        C48751ar arVar = (C48751ar) aVar;
        return C46238a.m51546a(this.BaseResponse, arVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f130731d), Integer.valueOf(arVar.f130731d)) && C46238a.m51546a(this.f130732e, arVar.f130732e) && C46238a.m51546a(this.f130733f, arVar.f130733f) && C46238a.m51546a(this.f130734g, arVar.f130734g) && C46238a.m51546a(Integer.valueOf(this.f130735h), Integer.valueOf(arVar.f130735h)) && C46238a.m51546a(this.f130736i, arVar.f130736i) && C46238a.m51546a(this.f130737j, arVar.f130737j) && C46238a.m51546a(Integer.valueOf(this.f130738n), Integer.valueOf(arVar.f130738n));
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
                aVar.mo74318e(2, this.f130731d);
                String str = this.f130732e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f130733f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f130734g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                aVar.mo74318e(6, this.f130735h);
                aVar.mo74320g(7, 2, this.f130736i);
                String str4 = this.f130737j;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                aVar.mo74318e(9, this.f130738n);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f130731d);
            String str5 = this.f130732e;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f130733f;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f130734g;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            int e2 = e + C52418a.m58678e(6, this.f130735h) + C52418a.m58680g(7, 2, this.f130736i);
            String str8 = this.f130737j;
            if (str8 != null) {
                e2 += C52418a.m58683j(8, str8);
            }
            return e2 + C52418a.m58678e(9, this.f130738n);
        } else if (i == 2) {
            this.f130736i.clear();
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
            C48751ar arVar = objArr[1];
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
                        arVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    arVar.f130731d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    arVar.f130732e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    arVar.f130733f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    arVar.f130734g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    arVar.f130735h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    arVar.f130736i.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                case 8:
                    arVar.f130737j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    arVar.f130738n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
