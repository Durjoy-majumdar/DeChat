package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import ve3.C65685n0;
import z14.C53733a;

/* renamed from: te3.d23 */
public class C49085d23 extends C49335eu3 {

    /* renamed from: d */
    public String f132076d;

    /* renamed from: e */
    public String f132077e;

    /* renamed from: f */
    public String f132078f;

    /* renamed from: g */
    public String f132079g;

    /* renamed from: h */
    public String f132080h;

    /* renamed from: i */
    public long f132081i;

    /* renamed from: j */
    public String f132082j;

    /* renamed from: n */
    public C65685n0 f132083n;

    /* renamed from: o */
    public C51635v23 f132084o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49085d23)) {
            return false;
        }
        C49085d23 d232 = (C49085d23) aVar;
        return C46238a.m51546a(this.BaseResponse, d232.BaseResponse) && C46238a.m51546a(this.f132076d, d232.f132076d) && C46238a.m51546a(this.f132077e, d232.f132077e) && C46238a.m51546a(this.f132078f, d232.f132078f) && C46238a.m51546a(this.f132079g, d232.f132079g) && C46238a.m51546a(this.f132080h, d232.f132080h) && C46238a.m51546a(Long.valueOf(this.f132081i), Long.valueOf(d232.f132081i)) && C46238a.m51546a(this.f132082j, d232.f132082j) && C46238a.m51546a(this.f132083n, d232.f132083n) && C46238a.m51546a(this.f132084o, d232.f132084o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            String str = this.f132076d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f132077e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f132078f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f132079g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f132080h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74321h(7, this.f132081i);
            String str6 = this.f132082j;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            C65685n0 n0Var = this.f132083n;
            if (n0Var != null) {
                aVar.mo74322i(9, n0Var.computeSize());
                this.f132083n.writeFields(aVar);
            }
            C51635v23 v232 = this.f132084o;
            if (v232 != null) {
                aVar.mo74322i(10, v232.computeSize());
                this.f132084o.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str7 = this.f132076d;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f132077e;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f132078f;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f132079g;
            if (str10 != null) {
                i2 += C52418a.m58683j(5, str10);
            }
            String str11 = this.f132080h;
            if (str11 != null) {
                i2 += C52418a.m58683j(6, str11);
            }
            int h = i2 + C52418a.m58681h(7, this.f132081i);
            String str12 = this.f132082j;
            if (str12 != null) {
                h += C52418a.m58683j(8, str12);
            }
            C65685n0 n0Var2 = this.f132083n;
            if (n0Var2 != null) {
                h += C52418a.m58682i(9, n0Var2.computeSize());
            }
            C51635v23 v233 = this.f132084o;
            return v233 != null ? h + C52418a.m58682i(10, v233.computeSize()) : h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49085d23 d232 = objArr[1];
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
                        d232.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    d232.f132076d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    d232.f132077e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    d232.f132078f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    d232.f132079g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    d232.f132080h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    d232.f132081i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    d232.f132082j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C65685n0 n0Var3 = new C65685n0();
                        if (bArr2 != null && bArr2.length > 0) {
                            n0Var3.parseFrom(bArr2);
                        }
                        d232.f132083n = n0Var3;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51635v23 v234 = new C51635v23();
                        if (bArr3 != null && bArr3.length > 0) {
                            v234.parseFrom(bArr3);
                        }
                        d232.f132084o = v234;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
