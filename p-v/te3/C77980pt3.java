package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pt3 */
public class C77980pt3 extends C49335eu3 {

    /* renamed from: d */
    public int f228038d;

    /* renamed from: e */
    public String f228039e;

    /* renamed from: f */
    public String f228040f;

    /* renamed from: g */
    public String f228041g;

    /* renamed from: h */
    public String f228042h;

    /* renamed from: i */
    public String f228043i;

    /* renamed from: j */
    public String f228044j;

    /* renamed from: n */
    public C77971o4 f228045n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77980pt3)) {
            return false;
        }
        C77980pt3 pt32 = (C77980pt3) aVar;
        return C46238a.m51546a(this.BaseResponse, pt32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f228038d), Integer.valueOf(pt32.f228038d)) && C46238a.m51546a(this.f228039e, pt32.f228039e) && C46238a.m51546a(this.f228040f, pt32.f228040f) && C46238a.m51546a(this.f228041g, pt32.f228041g) && C46238a.m51546a(this.f228042h, pt32.f228042h) && C46238a.m51546a(this.f228043i, pt32.f228043i) && C46238a.m51546a(this.f228044j, pt32.f228044j) && C46238a.m51546a(this.f228045n, pt32.f228045n);
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
                aVar.mo74318e(2, this.f228038d);
                String str = this.f228039e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f228040f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f228041g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f228042h;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                String str5 = this.f228043i;
                if (str5 != null) {
                    aVar.mo74323j(7, str5);
                }
                String str6 = this.f228044j;
                if (str6 != null) {
                    aVar.mo74323j(8, str6);
                }
                C77971o4 o4Var = this.f228045n;
                if (o4Var != null) {
                    aVar.mo74322i(9, o4Var.computeSize());
                    this.f228045n.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f228038d);
            String str7 = this.f228039e;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f228040f;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f228041g;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            String str10 = this.f228042h;
            if (str10 != null) {
                e += C52418a.m58683j(6, str10);
            }
            String str11 = this.f228043i;
            if (str11 != null) {
                e += C52418a.m58683j(7, str11);
            }
            String str12 = this.f228044j;
            if (str12 != null) {
                e += C52418a.m58683j(8, str12);
            }
            C77971o4 o4Var2 = this.f228045n;
            return o4Var2 != null ? e + C52418a.m58682i(9, o4Var2.computeSize()) : e;
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
            C77980pt3 pt32 = objArr[1];
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
                        pt32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    pt32.f228038d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    pt32.f228039e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    pt32.f228040f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    pt32.f228041g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    pt32.f228042h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    pt32.f228043i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    pt32.f228044j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C77971o4 o4Var3 = new C77971o4();
                        if (bArr2 != null && bArr2.length > 0) {
                            o4Var3.parseFrom(bArr2);
                        }
                        pt32.f228045n = o4Var3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
