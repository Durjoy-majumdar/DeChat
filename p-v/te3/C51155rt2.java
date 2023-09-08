package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rt2 */
public class C51155rt2 extends C49335eu3 {

    /* renamed from: d */
    public String f141134d;

    /* renamed from: e */
    public int f141135e;

    /* renamed from: f */
    public int f141136f;

    /* renamed from: g */
    public int f141137g;

    /* renamed from: h */
    public String f141138h;

    /* renamed from: i */
    public LinkedList<C50874pt2> f141139i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51155rt2)) {
            return false;
        }
        C51155rt2 rt22 = (C51155rt2) aVar;
        return C46238a.m51546a(this.BaseResponse, rt22.BaseResponse) && C46238a.m51546a(this.f141134d, rt22.f141134d) && C46238a.m51546a(Integer.valueOf(this.f141135e), Integer.valueOf(rt22.f141135e)) && C46238a.m51546a(Integer.valueOf(this.f141136f), Integer.valueOf(rt22.f141136f)) && C46238a.m51546a(Integer.valueOf(this.f141137g), Integer.valueOf(rt22.f141137g)) && C46238a.m51546a(this.f141138h, rt22.f141138h) && C46238a.m51546a(this.f141139i, rt22.f141139i);
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
                String str = this.f141134d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f141135e);
                aVar.mo74318e(4, this.f141136f);
                aVar.mo74318e(5, this.f141137g);
                String str2 = this.f141138h;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                aVar.mo74320g(7, 8, this.f141139i);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str3 = this.f141134d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int e = i2 + C52418a.m58678e(3, this.f141135e) + C52418a.m58678e(4, this.f141136f) + C52418a.m58678e(5, this.f141137g);
            String str4 = this.f141138h;
            if (str4 != null) {
                e += C52418a.m58683j(6, str4);
            }
            return e + C52418a.m58680g(7, 8, this.f141139i);
        } else if (i == 2) {
            this.f141139i.clear();
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
            C51155rt2 rt22 = objArr[1];
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
                        rt22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    rt22.f141134d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    rt22.f141135e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    rt22.f141136f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    rt22.f141137g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    rt22.f141138h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50874pt2 pt22 = new C50874pt2();
                        if (bArr2 != null && bArr2.length > 0) {
                            pt22.parseFrom(bArr2);
                        }
                        rt22.f141139i.add(pt22);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
