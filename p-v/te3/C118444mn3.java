package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mn3 */
public class C118444mn3 extends C101820nt3 {

    /* renamed from: d */
    public String f354136d;

    /* renamed from: e */
    public String f354137e;

    /* renamed from: f */
    public String f354138f;

    /* renamed from: g */
    public String f354139g;

    /* renamed from: h */
    public String f354140h;

    /* renamed from: i */
    public int f354141i;

    /* renamed from: j */
    public String f354142j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118444mn3)) {
            return false;
        }
        C118444mn3 mn32 = (C118444mn3) aVar;
        return C46238a.m51546a(this.BaseRequest, mn32.BaseRequest) && C46238a.m51546a(this.f354136d, mn32.f354136d) && C46238a.m51546a(this.f354137e, mn32.f354137e) && C46238a.m51546a(this.f354138f, mn32.f354138f) && C46238a.m51546a(this.f354139g, mn32.f354139g) && C46238a.m51546a(this.f354140h, mn32.f354140h) && C46238a.m51546a(Integer.valueOf(this.f354141i), Integer.valueOf(mn32.f354141i)) && C46238a.m51546a(this.f354142j, mn32.f354142j);
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
            String str = this.f354136d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f354137e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f354138f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f354139g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f354140h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74318e(7, this.f354141i);
            String str6 = this.f354142j;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str7 = this.f354136d;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f354137e;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f354138f;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f354139g;
            if (str10 != null) {
                i2 += C52418a.m58683j(5, str10);
            }
            String str11 = this.f354140h;
            if (str11 != null) {
                i2 += C52418a.m58683j(6, str11);
            }
            int e = i2 + C52418a.m58678e(7, this.f354141i);
            String str12 = this.f354142j;
            return str12 != null ? e + C52418a.m58683j(8, str12) : e;
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
            C118444mn3 mn32 = objArr[1];
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
                        mn32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    mn32.f354136d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    mn32.f354137e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    mn32.f354138f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    mn32.f354139g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    mn32.f354140h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    mn32.f354141i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    mn32.f354142j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
