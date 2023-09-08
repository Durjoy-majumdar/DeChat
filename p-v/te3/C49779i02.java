package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i02 */
public class C49779i02 extends C49335eu3 {

    /* renamed from: d */
    public int f134997d;

    /* renamed from: e */
    public String f134998e;

    /* renamed from: f */
    public String f134999f;

    /* renamed from: g */
    public String f135000g;

    /* renamed from: h */
    public float f135001h;

    /* renamed from: i */
    public String f135002i;

    /* renamed from: j */
    public String f135003j;

    /* renamed from: n */
    public String f135004n;

    /* renamed from: o */
    public C89349b f135005o;

    /* renamed from: p */
    public long f135006p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49779i02)) {
            return false;
        }
        C49779i02 i022 = (C49779i02) aVar;
        return C46238a.m51546a(this.BaseResponse, i022.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f134997d), Integer.valueOf(i022.f134997d)) && C46238a.m51546a(this.f134998e, i022.f134998e) && C46238a.m51546a(this.f134999f, i022.f134999f) && C46238a.m51546a(this.f135000g, i022.f135000g) && C46238a.m51546a(Float.valueOf(this.f135001h), Float.valueOf(i022.f135001h)) && C46238a.m51546a(this.f135002i, i022.f135002i) && C46238a.m51546a(this.f135003j, i022.f135003j) && C46238a.m51546a(this.f135004n, i022.f135004n) && C46238a.m51546a(this.f135005o, i022.f135005o) && C46238a.m51546a(Long.valueOf(this.f135006p), Long.valueOf(i022.f135006p));
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
                aVar.mo74318e(2, this.f134997d);
                String str = this.f134998e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f134999f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f135000g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                aVar.mo74317d(6, this.f135001h);
                String str4 = this.f135002i;
                if (str4 != null) {
                    aVar.mo74323j(7, str4);
                }
                String str5 = this.f135003j;
                if (str5 != null) {
                    aVar.mo74323j(8, str5);
                }
                String str6 = this.f135004n;
                if (str6 != null) {
                    aVar.mo74323j(9, str6);
                }
                C89349b bVar = this.f135005o;
                if (bVar != null) {
                    aVar.mo74315b(10, bVar);
                }
                aVar.mo74321h(11, this.f135006p);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f134997d);
            String str7 = this.f134998e;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f134999f;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f135000g;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            int d = e + C52418a.m58677d(6, this.f135001h);
            String str10 = this.f135002i;
            if (str10 != null) {
                d += C52418a.m58683j(7, str10);
            }
            String str11 = this.f135003j;
            if (str11 != null) {
                d += C52418a.m58683j(8, str11);
            }
            String str12 = this.f135004n;
            if (str12 != null) {
                d += C52418a.m58683j(9, str12);
            }
            C89349b bVar2 = this.f135005o;
            if (bVar2 != null) {
                d += C52418a.m58675b(10, bVar2);
            }
            return d + C52418a.m58681h(11, this.f135006p);
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
            C49779i02 i022 = objArr[1];
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
                        i022.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    i022.f134997d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    i022.f134998e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    i022.f134999f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    i022.f135000g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    i022.f135001h = aVar3.mo141628f(intValue);
                    return 0;
                case 7:
                    i022.f135002i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    i022.f135003j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    i022.f135004n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    i022.f135005o = aVar3.mo141626d(intValue);
                    return 0;
                case 11:
                    i022.f135006p = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
