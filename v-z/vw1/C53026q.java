package vw1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: vw1.q */
public class C53026q extends C49335eu3 {

    /* renamed from: d */
    public int f148012d;

    /* renamed from: e */
    public String f148013e;

    /* renamed from: f */
    public String f148014f;

    /* renamed from: g */
    public boolean f148015g;

    /* renamed from: h */
    public long f148016h;

    /* renamed from: i */
    public LinkedList<C53012e0> f148017i = new LinkedList<>();

    /* renamed from: j */
    public String f148018j;

    /* renamed from: n */
    public int f148019n;

    /* renamed from: o */
    public int f148020o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53026q)) {
            return false;
        }
        C53026q qVar = (C53026q) aVar;
        return C46238a.m51546a(this.BaseResponse, qVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f148012d), Integer.valueOf(qVar.f148012d)) && C46238a.m51546a(this.f148013e, qVar.f148013e) && C46238a.m51546a(this.f148014f, qVar.f148014f) && C46238a.m51546a(Boolean.valueOf(this.f148015g), Boolean.valueOf(qVar.f148015g)) && C46238a.m51546a(Long.valueOf(this.f148016h), Long.valueOf(qVar.f148016h)) && C46238a.m51546a(this.f148017i, qVar.f148017i) && C46238a.m51546a(this.f148018j, qVar.f148018j) && C46238a.m51546a(Integer.valueOf(this.f148019n), Integer.valueOf(qVar.f148019n)) && C46238a.m51546a(Integer.valueOf(this.f148020o), Integer.valueOf(qVar.f148020o));
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
                aVar.mo74318e(2, this.f148012d);
                String str = this.f148013e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f148014f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                aVar.mo74314a(5, this.f148015g);
                aVar.mo74321h(6, this.f148016h);
                aVar.mo74320g(7, 8, this.f148017i);
                String str3 = this.f148018j;
                if (str3 != null) {
                    aVar.mo74323j(8, str3);
                }
                aVar.mo74318e(9, this.f148019n);
                aVar.mo74318e(10, this.f148020o);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f148012d);
            String str4 = this.f148013e;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            String str5 = this.f148014f;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            int a = e + C52418a.m58674a(5, this.f148015g) + C52418a.m58681h(6, this.f148016h) + C52418a.m58680g(7, 8, this.f148017i);
            String str6 = this.f148018j;
            if (str6 != null) {
                a += C52418a.m58683j(8, str6);
            }
            return a + C52418a.m58678e(9, this.f148019n) + C52418a.m58678e(10, this.f148020o);
        } else if (i == 2) {
            this.f148017i.clear();
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
            C53026q qVar = objArr[1];
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
                        qVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    qVar.f148012d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    qVar.f148013e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    qVar.f148014f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    qVar.f148015g = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    qVar.f148016h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C53012e0 e0Var = new C53012e0();
                        if (bArr2 != null && bArr2.length > 0) {
                            e0Var.parseFrom(bArr2);
                        }
                        qVar.f148017i.add(e0Var);
                    }
                    return 0;
                case 8:
                    qVar.f148018j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    qVar.f148019n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    qVar.f148020o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
