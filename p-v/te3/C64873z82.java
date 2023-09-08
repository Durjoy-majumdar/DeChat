package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z82 */
public class C64873z82 extends C101820nt3 {

    /* renamed from: d */
    public int f186638d;

    /* renamed from: e */
    public String f186639e;

    /* renamed from: f */
    public String f186640f;

    /* renamed from: g */
    public String f186641g;

    /* renamed from: h */
    public String f186642h;

    /* renamed from: i */
    public int f186643i;

    /* renamed from: j */
    public int f186644j;

    /* renamed from: n */
    public int f186645n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64873z82)) {
            return false;
        }
        C64873z82 z822 = (C64873z82) aVar;
        return C46238a.m51546a(this.BaseRequest, z822.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f186638d), Integer.valueOf(z822.f186638d)) && C46238a.m51546a(this.f186639e, z822.f186639e) && C46238a.m51546a(this.f186640f, z822.f186640f) && C46238a.m51546a(this.f186641g, z822.f186641g) && C46238a.m51546a(this.f186642h, z822.f186642h) && C46238a.m51546a(Integer.valueOf(this.f186643i), Integer.valueOf(z822.f186643i)) && C46238a.m51546a(Integer.valueOf(this.f186644j), Integer.valueOf(z822.f186644j)) && C46238a.m51546a(Integer.valueOf(this.f186645n), Integer.valueOf(z822.f186645n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f186638d);
            String str = this.f186639e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f186640f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f186641g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f186642h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f186643i);
            aVar.mo74318e(8, this.f186644j);
            aVar.mo74318e(9, this.f186645n);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f186638d);
            String str5 = this.f186639e;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f186640f;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f186641g;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            String str8 = this.f186642h;
            if (str8 != null) {
                e += C52418a.m58683j(6, str8);
            }
            return e + C52418a.m58678e(7, this.f186643i) + C52418a.m58678e(8, this.f186644j) + C52418a.m58678e(9, this.f186645n);
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
            C64873z82 z822 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        z822.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    z822.f186638d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    z822.f186639e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    z822.f186640f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    z822.f186641g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    z822.f186642h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    z822.f186643i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    z822.f186644j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    z822.f186645n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
