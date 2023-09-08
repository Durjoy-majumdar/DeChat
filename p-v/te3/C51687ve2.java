package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ve2 */
public class C51687ve2 extends C47465a {

    /* renamed from: d */
    public String f143453d;

    /* renamed from: e */
    public String f143454e;

    /* renamed from: f */
    public String f143455f;

    /* renamed from: g */
    public boolean f143456g;

    /* renamed from: h */
    public int f143457h;

    /* renamed from: i */
    public C51534ue2 f143458i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51687ve2)) {
            return false;
        }
        C51687ve2 ve22 = (C51687ve2) aVar;
        return C46238a.m51546a(this.f143453d, ve22.f143453d) && C46238a.m51546a(this.f143454e, ve22.f143454e) && C46238a.m51546a(this.f143455f, ve22.f143455f) && C46238a.m51546a(Boolean.valueOf(this.f143456g), Boolean.valueOf(ve22.f143456g)) && C46238a.m51546a(Integer.valueOf(this.f143457h), Integer.valueOf(ve22.f143457h)) && C46238a.m51546a(this.f143458i, ve22.f143458i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143453d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f143454e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f143455f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74314a(4, this.f143456g);
            aVar.mo74318e(5, this.f143457h);
            C51534ue2 ue22 = this.f143458i;
            if (ue22 != null) {
                aVar.mo74322i(6, ue22.computeSize());
                this.f143458i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f143453d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f143454e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f143455f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            int a = i2 + C52418a.m58674a(4, this.f143456g) + C52418a.m58678e(5, this.f143457h);
            C51534ue2 ue23 = this.f143458i;
            return ue23 != null ? a + C52418a.m58682i(6, ue23.computeSize()) : a;
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
            C51687ve2 ve22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ve22.f143453d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ve22.f143454e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ve22.f143455f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ve22.f143456g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    ve22.f143457h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51534ue2 ue24 = new C51534ue2();
                        if (bArr != null && bArr.length > 0) {
                            ue24.parseFrom(bArr);
                        }
                        ve22.f143458i = ue24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
