package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o63 */
public class C50641o63 extends C49335eu3 {

    /* renamed from: d */
    public int f138982d;

    /* renamed from: e */
    public String f138983e;

    /* renamed from: f */
    public String f138984f;

    /* renamed from: g */
    public String f138985g;

    /* renamed from: h */
    public C50396mf3 f138986h;

    /* renamed from: i */
    public boolean f138987i;

    /* renamed from: j */
    public boolean f138988j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50641o63)) {
            return false;
        }
        C50641o63 o632 = (C50641o63) aVar;
        return C46238a.m51546a(this.BaseResponse, o632.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f138982d), Integer.valueOf(o632.f138982d)) && C46238a.m51546a(this.f138983e, o632.f138983e) && C46238a.m51546a(this.f138984f, o632.f138984f) && C46238a.m51546a(this.f138985g, o632.f138985g) && C46238a.m51546a(this.f138986h, o632.f138986h) && C46238a.m51546a(Boolean.valueOf(this.f138987i), Boolean.valueOf(o632.f138987i)) && C46238a.m51546a(Boolean.valueOf(this.f138988j), Boolean.valueOf(o632.f138988j));
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
                aVar.mo74318e(2, this.f138982d);
                String str = this.f138983e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f138984f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f138985g;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                C50396mf3 mf32 = this.f138986h;
                if (mf32 != null) {
                    aVar.mo74322i(8, mf32.computeSize());
                    this.f138986h.writeFields(aVar);
                }
                aVar.mo74314a(9, this.f138987i);
                aVar.mo74314a(10, this.f138988j);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f138982d);
            String str4 = this.f138983e;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            String str5 = this.f138984f;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f138985g;
            if (str6 != null) {
                e += C52418a.m58683j(7, str6);
            }
            C50396mf3 mf33 = this.f138986h;
            if (mf33 != null) {
                e += C52418a.m58682i(8, mf33.computeSize());
            }
            return e + C52418a.m58674a(9, this.f138987i) + C52418a.m58674a(10, this.f138988j);
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
            C50641o63 o632 = objArr[1];
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
                        o632.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    o632.f138982d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    o632.f138983e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    o632.f138984f = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    o632.f138985g = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50396mf3 mf34 = new C50396mf3();
                        if (bArr2 != null && bArr2.length > 0) {
                            mf34.parseFrom(bArr2);
                        }
                        o632.f138986h = mf34;
                    }
                    return 0;
                case 9:
                    o632.f138987i = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    o632.f138988j = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
