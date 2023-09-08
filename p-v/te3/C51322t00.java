package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t00 */
public class C51322t00 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C49581gn> f141866d = new LinkedList<>();

    /* renamed from: e */
    public int f141867e;

    /* renamed from: f */
    public int f141868f;

    /* renamed from: g */
    public int f141869g;

    /* renamed from: h */
    public String f141870h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51322t00)) {
            return false;
        }
        C51322t00 t002 = (C51322t00) aVar;
        return C46238a.m51546a(this.BaseResponse, t002.BaseResponse) && C46238a.m51546a(this.f141866d, t002.f141866d) && C46238a.m51546a(Integer.valueOf(this.f141867e), Integer.valueOf(t002.f141867e)) && C46238a.m51546a(Integer.valueOf(this.f141868f), Integer.valueOf(t002.f141868f)) && C46238a.m51546a(Integer.valueOf(this.f141869g), Integer.valueOf(t002.f141869g)) && C46238a.m51546a(this.f141870h, t002.f141870h);
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
                aVar.mo74320g(2, 8, this.f141866d);
                aVar.mo74318e(3, this.f141867e);
                aVar.mo74318e(4, this.f141868f);
                aVar.mo74318e(5, this.f141869g);
                String str = this.f141870h;
                if (str != null) {
                    aVar.mo74323j(6, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f141866d) + C52418a.m58678e(3, this.f141867e) + C52418a.m58678e(4, this.f141868f) + C52418a.m58678e(5, this.f141869g);
            String str2 = this.f141870h;
            return str2 != null ? g + C52418a.m58683j(6, str2) : g;
        } else if (i == 2) {
            this.f141866d.clear();
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
            C51322t00 t002 = objArr[1];
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
                        t002.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49581gn gnVar = new C49581gn();
                        if (bArr2 != null && bArr2.length > 0) {
                            gnVar.parseFrom(bArr2);
                        }
                        t002.f141866d.add(gnVar);
                    }
                    return 0;
                case 3:
                    t002.f141867e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    t002.f141868f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    t002.f141869g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    t002.f141870h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
