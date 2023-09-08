package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class co4 extends C49335eu3 {

    /* renamed from: d */
    public String f131872d;

    /* renamed from: e */
    public String f131873e;

    /* renamed from: f */
    public int f131874f;

    /* renamed from: g */
    public int f131875g;

    /* renamed from: h */
    public int f131876h;

    /* renamed from: i */
    public String f131877i;

    /* renamed from: j */
    public int f131878j;

    /* renamed from: n */
    public int f131879n;

    /* renamed from: o */
    public int f131880o;

    /* renamed from: p */
    public int f131881p;

    /* renamed from: q */
    public long f131882q;

    /* renamed from: r */
    public int f131883r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof co4)) {
            return false;
        }
        co4 co4 = (co4) aVar;
        return C46238a.m51546a(this.f131872d, co4.f131872d) && C46238a.m51546a(this.f131873e, co4.f131873e) && C46238a.m51546a(Integer.valueOf(this.f131874f), Integer.valueOf(co4.f131874f)) && C46238a.m51546a(Integer.valueOf(this.f131875g), Integer.valueOf(co4.f131875g)) && C46238a.m51546a(Integer.valueOf(this.f131876h), Integer.valueOf(co4.f131876h)) && C46238a.m51546a(this.f131877i, co4.f131877i) && C46238a.m51546a(Integer.valueOf(this.f131878j), Integer.valueOf(co4.f131878j)) && C46238a.m51546a(Integer.valueOf(this.f131879n), Integer.valueOf(co4.f131879n)) && C46238a.m51546a(Integer.valueOf(this.f131880o), Integer.valueOf(co4.f131880o)) && C46238a.m51546a(this.BaseResponse, co4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f131881p), Integer.valueOf(co4.f131881p)) && C46238a.m51546a(Long.valueOf(this.f131882q), Long.valueOf(co4.f131882q)) && C46238a.m51546a(Integer.valueOf(this.f131883r), Integer.valueOf(co4.f131883r));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131872d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f131873e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f131874f);
            aVar.mo74318e(4, this.f131875g);
            aVar.mo74318e(5, this.f131876h);
            String str3 = this.f131877i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74318e(7, this.f131878j);
            aVar.mo74318e(8, this.f131879n);
            aVar.mo74318e(9, this.f131880o);
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(10, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74318e(11, this.f131881p);
            aVar.mo74321h(12, this.f131882q);
            aVar.mo74318e(13, this.f131883r);
            return 0;
        } else if (i2 == 1) {
            String str4 = this.f131872d;
            int j = str4 != null ? 0 + C52418a.m58683j(1, str4) : 0;
            String str5 = this.f131873e;
            if (str5 != null) {
                j += C52418a.m58683j(2, str5);
            }
            int e = j + C52418a.m58678e(3, this.f131874f) + C52418a.m58678e(4, this.f131875g) + C52418a.m58678e(5, this.f131876h);
            String str6 = this.f131877i;
            if (str6 != null) {
                e += C52418a.m58683j(6, str6);
            }
            int e2 = e + C52418a.m58678e(7, this.f131878j) + C52418a.m58678e(8, this.f131879n) + C52418a.m58678e(9, this.f131880o);
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                e2 += C52418a.m58682i(10, jaVar2.computeSize());
            }
            return e2 + C52418a.m58678e(11, this.f131881p) + C52418a.m58681h(12, this.f131882q) + C52418a.m58678e(13, this.f131883r);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            co4 co4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    co4.f131872d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    co4.f131873e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    co4.f131874f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    co4.f131875g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    co4.f131876h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    co4.f131877i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    co4.f131878j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    co4.f131879n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    co4.f131880o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size = j2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j2.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        co4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 11:
                    co4.f131881p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    co4.f131882q = aVar3.mo141631i(intValue);
                    return 0;
                case 13:
                    co4.f131883r = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
