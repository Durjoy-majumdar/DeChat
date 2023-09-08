package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lk3 */
public class C50277lk3 extends C49335eu3 {

    /* renamed from: d */
    public int f137492d;

    /* renamed from: e */
    public String f137493e;

    /* renamed from: f */
    public String f137494f;

    /* renamed from: g */
    public LinkedList<C77990r9> f137495g = new LinkedList<>();

    /* renamed from: h */
    public C50396mf3 f137496h;

    /* renamed from: i */
    public String f137497i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50277lk3)) {
            return false;
        }
        C50277lk3 lk32 = (C50277lk3) aVar;
        return C46238a.m51546a(this.BaseResponse, lk32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f137492d), Integer.valueOf(lk32.f137492d)) && C46238a.m51546a(this.f137493e, lk32.f137493e) && C46238a.m51546a(this.f137494f, lk32.f137494f) && C46238a.m51546a(this.f137495g, lk32.f137495g) && C46238a.m51546a(this.f137496h, lk32.f137496h) && C46238a.m51546a(this.f137497i, lk32.f137497i);
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
                aVar.mo74318e(2, this.f137492d);
                String str = this.f137493e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f137494f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                aVar.mo74320g(5, 8, this.f137495g);
                C50396mf3 mf32 = this.f137496h;
                if (mf32 != null) {
                    aVar.mo74322i(6, mf32.computeSize());
                    this.f137496h.writeFields(aVar);
                }
                String str3 = this.f137497i;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f137492d);
            String str4 = this.f137493e;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            String str5 = this.f137494f;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            int g = e + C52418a.m58680g(5, 8, this.f137495g);
            C50396mf3 mf33 = this.f137496h;
            if (mf33 != null) {
                g += C52418a.m58682i(6, mf33.computeSize());
            }
            String str6 = this.f137497i;
            return str6 != null ? g + C52418a.m58683j(7, str6) : g;
        } else if (i == 2) {
            this.f137495g.clear();
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
            C50277lk3 lk32 = objArr[1];
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
                        lk32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    lk32.f137492d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    lk32.f137493e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    lk32.f137494f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C77990r9 r9Var = new C77990r9();
                        if (bArr2 != null && bArr2.length > 0) {
                            r9Var.parseFrom(bArr2);
                        }
                        lk32.f137495g.add(r9Var);
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50396mf3 mf34 = new C50396mf3();
                        if (bArr3 != null && bArr3.length > 0) {
                            mf34.parseFrom(bArr3);
                        }
                        lk32.f137496h = mf34;
                    }
                    return 0;
                case 7:
                    lk32.f137497i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
