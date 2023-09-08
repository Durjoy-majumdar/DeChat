package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.q */
public class C77983q extends C49335eu3 {

    /* renamed from: d */
    public int f228097d = 268513600;

    /* renamed from: e */
    public String f228098e = "请求不成功，请稍候再试";

    /* renamed from: f */
    public int f228099f;

    /* renamed from: g */
    public int f228100g;

    /* renamed from: h */
    public int f228101h;

    /* renamed from: i */
    public long f228102i;

    /* renamed from: j */
    public long f228103j;

    /* renamed from: n */
    public String f228104n;

    /* renamed from: o */
    public String f228105o;

    /* renamed from: p */
    public int f228106p;

    /* renamed from: q */
    public C77933g43 f228107q;

    /* renamed from: r */
    public boolean f228108r = false;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77983q)) {
            return false;
        }
        C77983q qVar = (C77983q) aVar;
        return C46238a.m51546a(this.BaseResponse, qVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f228097d), Integer.valueOf(qVar.f228097d)) && C46238a.m51546a(this.f228098e, qVar.f228098e) && C46238a.m51546a(Integer.valueOf(this.f228099f), Integer.valueOf(qVar.f228099f)) && C46238a.m51546a(Integer.valueOf(this.f228100g), Integer.valueOf(qVar.f228100g)) && C46238a.m51546a(Integer.valueOf(this.f228101h), Integer.valueOf(qVar.f228101h)) && C46238a.m51546a(Long.valueOf(this.f228102i), Long.valueOf(qVar.f228102i)) && C46238a.m51546a(Long.valueOf(this.f228103j), Long.valueOf(qVar.f228103j)) && C46238a.m51546a(this.f228104n, qVar.f228104n) && C46238a.m51546a(this.f228105o, qVar.f228105o) && C46238a.m51546a(Integer.valueOf(this.f228106p), Integer.valueOf(qVar.f228106p)) && C46238a.m51546a(this.f228107q, qVar.f228107q) && C46238a.m51546a(Boolean.valueOf(this.f228108r), Boolean.valueOf(qVar.f228108r));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f228097d);
                String str = this.f228098e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f228099f);
                aVar.mo74318e(5, this.f228100g);
                aVar.mo74318e(6, this.f228101h);
                aVar.mo74321h(7, this.f228102i);
                aVar.mo74321h(8, this.f228103j);
                String str2 = this.f228104n;
                if (str2 != null) {
                    aVar.mo74323j(9, str2);
                }
                String str3 = this.f228105o;
                if (str3 != null) {
                    aVar.mo74323j(10, str3);
                }
                aVar.mo74318e(11, this.f228106p);
                C77933g43 g432 = this.f228107q;
                if (g432 != null) {
                    aVar.mo74322i(12, g432.computeSize());
                    this.f228107q.writeFields(aVar);
                }
                aVar.mo74314a(13, this.f228108r);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f228097d);
            String str4 = this.f228098e;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            int e2 = e + C52418a.m58678e(4, this.f228099f) + C52418a.m58678e(5, this.f228100g) + C52418a.m58678e(6, this.f228101h) + C52418a.m58681h(7, this.f228102i) + C52418a.m58681h(8, this.f228103j);
            String str5 = this.f228104n;
            if (str5 != null) {
                e2 += C52418a.m58683j(9, str5);
            }
            String str6 = this.f228105o;
            if (str6 != null) {
                e2 += C52418a.m58683j(10, str6);
            }
            int e3 = e2 + C52418a.m58678e(11, this.f228106p);
            C77933g43 g433 = this.f228107q;
            if (g433 != null) {
                e3 += C52418a.m58682i(12, g433.computeSize());
            }
            return e3 + C52418a.m58674a(13, this.f228108r);
        } else if (i2 == 2) {
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
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77983q qVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        qVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    qVar.f228097d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    qVar.f228098e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    qVar.f228099f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    qVar.f228100g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    qVar.f228101h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    qVar.f228102i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    qVar.f228103j = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    qVar.f228104n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    qVar.f228105o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    qVar.f228106p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C77933g43 g434 = new C77933g43();
                        if (bArr2 != null && bArr2.length > 0) {
                            g434.parseFrom(bArr2);
                        }
                        qVar.f228107q = g434;
                    }
                    return 0;
                case 13:
                    qVar.f228108r = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
