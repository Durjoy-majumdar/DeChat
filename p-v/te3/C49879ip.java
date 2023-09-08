package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ip */
public class C49879ip extends C49335eu3 {

    /* renamed from: d */
    public int f135558d;

    /* renamed from: e */
    public String f135559e;

    /* renamed from: f */
    public String f135560f;

    /* renamed from: g */
    public String f135561g;

    /* renamed from: h */
    public String f135562h;

    /* renamed from: i */
    public String f135563i;

    /* renamed from: j */
    public String f135564j;

    /* renamed from: n */
    public String f135565n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49879ip)) {
            return false;
        }
        C49879ip ipVar = (C49879ip) aVar;
        return C46238a.m51546a(this.BaseResponse, ipVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f135558d), Integer.valueOf(ipVar.f135558d)) && C46238a.m51546a(this.f135559e, ipVar.f135559e) && C46238a.m51546a(this.f135560f, ipVar.f135560f) && C46238a.m51546a(this.f135561g, ipVar.f135561g) && C46238a.m51546a(this.f135562h, ipVar.f135562h) && C46238a.m51546a(this.f135563i, ipVar.f135563i) && C46238a.m51546a(this.f135564j, ipVar.f135564j) && C46238a.m51546a(this.f135565n, ipVar.f135565n);
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
                aVar.mo74318e(2, this.f135558d);
                String str = this.f135559e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f135560f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f135561g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f135562h;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                String str5 = this.f135563i;
                if (str5 != null) {
                    aVar.mo74323j(7, str5);
                }
                String str6 = this.f135564j;
                if (str6 != null) {
                    aVar.mo74323j(8, str6);
                }
                String str7 = this.f135565n;
                if (str7 != null) {
                    aVar.mo74323j(9, str7);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f135558d);
            String str8 = this.f135559e;
            if (str8 != null) {
                e += C52418a.m58683j(3, str8);
            }
            String str9 = this.f135560f;
            if (str9 != null) {
                e += C52418a.m58683j(4, str9);
            }
            String str10 = this.f135561g;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            String str11 = this.f135562h;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            String str12 = this.f135563i;
            if (str12 != null) {
                e += C52418a.m58683j(7, str12);
            }
            String str13 = this.f135564j;
            if (str13 != null) {
                e += C52418a.m58683j(8, str13);
            }
            String str14 = this.f135565n;
            return str14 != null ? e + C52418a.m58683j(9, str14) : e;
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
            C49879ip ipVar = objArr[1];
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
                        ipVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ipVar.f135558d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ipVar.f135559e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ipVar.f135560f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ipVar.f135561g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ipVar.f135562h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ipVar.f135563i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ipVar.f135564j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    ipVar.f135565n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
