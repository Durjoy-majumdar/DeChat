package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class o84 extends C49335eu3 {

    /* renamed from: d */
    public int f139029d;

    /* renamed from: e */
    public String f139030e;

    /* renamed from: f */
    public int f139031f;

    /* renamed from: g */
    public LinkedList<m84> f139032g = new LinkedList<>();

    /* renamed from: h */
    public int f139033h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof o84)) {
            return false;
        }
        o84 o84 = (o84) aVar;
        return C46238a.m51546a(this.BaseResponse, o84.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f139029d), Integer.valueOf(o84.f139029d)) && C46238a.m51546a(this.f139030e, o84.f139030e) && C46238a.m51546a(Integer.valueOf(this.f139031f), Integer.valueOf(o84.f139031f)) && C46238a.m51546a(this.f139032g, o84.f139032g) && C46238a.m51546a(Integer.valueOf(this.f139033h), Integer.valueOf(o84.f139033h));
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
                aVar.mo74318e(2, this.f139029d);
                String str = this.f139030e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f139031f);
                aVar.mo74320g(5, 8, this.f139032g);
                aVar.mo74318e(6, this.f139033h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f139029d);
            String str2 = this.f139030e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            return e + C52418a.m58678e(4, this.f139031f) + C52418a.m58680g(5, 8, this.f139032g) + C52418a.m58678e(6, this.f139033h);
        } else if (i == 2) {
            this.f139032g.clear();
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
            o84 o84 = objArr[1];
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
                        o84.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    o84.f139029d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    o84.f139030e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    o84.f139031f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        m84 m84 = new m84();
                        if (bArr2 != null && bArr2.length > 0) {
                            m84.parseFrom(bArr2);
                        }
                        o84.f139032g.add(m84);
                    }
                    return 0;
                case 6:
                    o84.f139033h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
