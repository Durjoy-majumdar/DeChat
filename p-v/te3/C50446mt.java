package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mt */
public class C50446mt extends C49335eu3 {

    /* renamed from: d */
    public q45 f138186d;

    /* renamed from: e */
    public boolean f138187e;

    /* renamed from: f */
    public String f138188f;

    /* renamed from: g */
    public String f138189g;

    /* renamed from: h */
    public boolean f138190h;

    /* renamed from: i */
    public String f138191i;

    /* renamed from: j */
    public String f138192j;

    /* renamed from: n */
    public String f138193n;

    /* renamed from: o */
    public String f138194o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50446mt)) {
            return false;
        }
        C50446mt mtVar = (C50446mt) aVar;
        return C46238a.m51546a(this.BaseResponse, mtVar.BaseResponse) && C46238a.m51546a(this.f138186d, mtVar.f138186d) && C46238a.m51546a(Boolean.valueOf(this.f138187e), Boolean.valueOf(mtVar.f138187e)) && C46238a.m51546a(this.f138188f, mtVar.f138188f) && C46238a.m51546a(this.f138189g, mtVar.f138189g) && C46238a.m51546a(Boolean.valueOf(this.f138190h), Boolean.valueOf(mtVar.f138190h)) && C46238a.m51546a(this.f138191i, mtVar.f138191i) && C46238a.m51546a(this.f138192j, mtVar.f138192j) && C46238a.m51546a(this.f138193n, mtVar.f138193n) && C46238a.m51546a(this.f138194o, mtVar.f138194o);
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
                q45 q45 = this.f138186d;
                if (q45 != null) {
                    aVar.mo74322i(2, q45.computeSize());
                    this.f138186d.writeFields(aVar);
                }
                aVar.mo74314a(3, this.f138187e);
                String str = this.f138188f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                String str2 = this.f138189g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                aVar.mo74314a(6, this.f138190h);
                String str3 = this.f138191i;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                String str4 = this.f138192j;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                String str5 = this.f138193n;
                if (str5 != null) {
                    aVar.mo74323j(9, str5);
                }
                String str6 = this.f138194o;
                if (str6 != null) {
                    aVar.mo74323j(10, str6);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            q45 q452 = this.f138186d;
            if (q452 != null) {
                i2 += C52418a.m58682i(2, q452.computeSize());
            }
            int a = i2 + C52418a.m58674a(3, this.f138187e);
            String str7 = this.f138188f;
            if (str7 != null) {
                a += C52418a.m58683j(4, str7);
            }
            String str8 = this.f138189g;
            if (str8 != null) {
                a += C52418a.m58683j(5, str8);
            }
            int a2 = a + C52418a.m58674a(6, this.f138190h);
            String str9 = this.f138191i;
            if (str9 != null) {
                a2 += C52418a.m58683j(7, str9);
            }
            String str10 = this.f138192j;
            if (str10 != null) {
                a2 += C52418a.m58683j(8, str10);
            }
            String str11 = this.f138193n;
            if (str11 != null) {
                a2 += C52418a.m58683j(9, str11);
            }
            String str12 = this.f138194o;
            return str12 != null ? a2 + C52418a.m58683j(10, str12) : a2;
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
            C50446mt mtVar = objArr[1];
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
                        mtVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        q45 q453 = new q45();
                        if (bArr2 != null && bArr2.length > 0) {
                            q453.parseFrom(bArr2);
                        }
                        mtVar.f138186d = q453;
                    }
                    return 0;
                case 3:
                    mtVar.f138187e = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    mtVar.f138188f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    mtVar.f138189g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    mtVar.f138190h = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    mtVar.f138191i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    mtVar.f138192j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    mtVar.f138193n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    mtVar.f138194o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
