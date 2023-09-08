package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x83 */
public class C78010x83 extends C49335eu3 {

    /* renamed from: d */
    public int f228378d;

    /* renamed from: e */
    public String f228379e;

    /* renamed from: f */
    public int f228380f;

    /* renamed from: g */
    public int f228381g;

    /* renamed from: h */
    public String f228382h;

    /* renamed from: i */
    public String f228383i;

    /* renamed from: j */
    public String f228384j;

    /* renamed from: n */
    public String f228385n;

    /* renamed from: o */
    public int f228386o;

    /* renamed from: p */
    public int f228387p;

    /* renamed from: q */
    public C77933g43 f228388q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78010x83)) {
            return false;
        }
        C78010x83 x832 = (C78010x83) aVar;
        return C46238a.m51546a(this.BaseResponse, x832.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f228378d), Integer.valueOf(x832.f228378d)) && C46238a.m51546a(this.f228379e, x832.f228379e) && C46238a.m51546a(Integer.valueOf(this.f228380f), Integer.valueOf(x832.f228380f)) && C46238a.m51546a(Integer.valueOf(this.f228381g), Integer.valueOf(x832.f228381g)) && C46238a.m51546a(this.f228382h, x832.f228382h) && C46238a.m51546a(this.f228383i, x832.f228383i) && C46238a.m51546a(this.f228384j, x832.f228384j) && C46238a.m51546a(this.f228385n, x832.f228385n) && C46238a.m51546a(Integer.valueOf(this.f228386o), Integer.valueOf(x832.f228386o)) && C46238a.m51546a(Integer.valueOf(this.f228387p), Integer.valueOf(x832.f228387p)) && C46238a.m51546a(this.f228388q, x832.f228388q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f228378d);
                String str = this.f228379e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f228380f);
                aVar.mo74318e(5, this.f228381g);
                String str2 = this.f228382h;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                String str3 = this.f228383i;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                String str4 = this.f228384j;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                String str5 = this.f228385n;
                if (str5 != null) {
                    aVar.mo74323j(9, str5);
                }
                aVar.mo74318e(10, this.f228386o);
                aVar.mo74318e(11, this.f228387p);
                C77933g43 g432 = this.f228388q;
                if (g432 == null) {
                    return 0;
                }
                aVar.mo74322i(12, g432.computeSize());
                this.f228388q.writeFields(aVar);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            int i3 = (jaVar2 != null ? 0 + C52418a.m58682i(1, jaVar2.computeSize()) : 0) + C52418a.m58678e(2, this.f228378d);
            String str6 = this.f228379e;
            if (str6 != null) {
                i3 += C52418a.m58683j(3, str6);
            }
            int e = i3 + C52418a.m58678e(4, this.f228380f) + C52418a.m58678e(5, this.f228381g);
            String str7 = this.f228382h;
            if (str7 != null) {
                e += C52418a.m58683j(6, str7);
            }
            String str8 = this.f228383i;
            if (str8 != null) {
                e += C52418a.m58683j(7, str8);
            }
            String str9 = this.f228384j;
            if (str9 != null) {
                e += C52418a.m58683j(8, str9);
            }
            String str10 = this.f228385n;
            if (str10 != null) {
                e += C52418a.m58683j(9, str10);
            }
            int e2 = e + C52418a.m58678e(10, this.f228386o) + C52418a.m58678e(11, this.f228387p);
            C77933g43 g433 = this.f228388q;
            return g433 != null ? e2 + C52418a.m58682i(12, g433.computeSize()) : e2;
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
            C78010x83 x832 = objArr[1];
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
                        x832.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    x832.f228378d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    x832.f228379e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    x832.f228380f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    x832.f228381g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    x832.f228382h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    x832.f228383i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    x832.f228384j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    x832.f228385n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    x832.f228386o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    x832.f228387p = aVar3.mo141629g(intValue);
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
                        x832.f228388q = g434;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
