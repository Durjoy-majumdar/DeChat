package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hw */
public class C49759hw extends C101820nt3 {

    /* renamed from: d */
    public int f134900d;

    /* renamed from: e */
    public String f134901e;

    /* renamed from: f */
    public String f134902f;

    /* renamed from: g */
    public String f134903g;

    /* renamed from: h */
    public LinkedList<C49618gw> f134904h = new LinkedList<>();

    /* renamed from: i */
    public int f134905i;

    /* renamed from: j */
    public int f134906j;

    /* renamed from: n */
    public C52054y14 f134907n;

    /* renamed from: o */
    public C49939j34 f134908o;

    /* renamed from: p */
    public String f134909p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49759hw)) {
            return false;
        }
        C49759hw hwVar = (C49759hw) aVar;
        return C46238a.m51546a(this.BaseRequest, hwVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f134900d), Integer.valueOf(hwVar.f134900d)) && C46238a.m51546a(this.f134901e, hwVar.f134901e) && C46238a.m51546a(this.f134902f, hwVar.f134902f) && C46238a.m51546a(this.f134903g, hwVar.f134903g) && C46238a.m51546a(this.f134904h, hwVar.f134904h) && C46238a.m51546a(Integer.valueOf(this.f134905i), Integer.valueOf(hwVar.f134905i)) && C46238a.m51546a(Integer.valueOf(this.f134906j), Integer.valueOf(hwVar.f134906j)) && C46238a.m51546a(this.f134907n, hwVar.f134907n) && C46238a.m51546a(this.f134908o, hwVar.f134908o) && C46238a.m51546a(this.f134909p, hwVar.f134909p);
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
            aVar.mo74318e(2, this.f134900d);
            String str = this.f134901e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f134902f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f134903g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74320g(6, 8, this.f134904h);
            aVar.mo74318e(7, this.f134905i);
            aVar.mo74318e(8, this.f134906j);
            C52054y14 y142 = this.f134907n;
            if (y142 != null) {
                aVar.mo74322i(9, y142.computeSize());
                this.f134907n.writeFields(aVar);
            }
            C49939j34 j342 = this.f134908o;
            if (j342 != null) {
                aVar.mo74322i(10, j342.computeSize());
                this.f134908o.writeFields(aVar);
            }
            String str4 = this.f134909p;
            if (str4 != null) {
                aVar.mo74323j(11, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f134900d);
            String str5 = this.f134901e;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f134902f;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f134903g;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            int g = e + C52418a.m58680g(6, 8, this.f134904h) + C52418a.m58678e(7, this.f134905i) + C52418a.m58678e(8, this.f134906j);
            C52054y14 y143 = this.f134907n;
            if (y143 != null) {
                g += C52418a.m58682i(9, y143.computeSize());
            }
            C49939j34 j343 = this.f134908o;
            if (j343 != null) {
                g += C52418a.m58682i(10, j343.computeSize());
            }
            String str8 = this.f134909p;
            return str8 != null ? g + C52418a.m58683j(11, str8) : g;
        } else if (i == 2) {
            this.f134904h.clear();
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
            C49759hw hwVar = objArr[1];
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
                        hwVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    hwVar.f134900d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    hwVar.f134901e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    hwVar.f134902f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    hwVar.f134903g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49618gw gwVar = new C49618gw();
                        if (bArr2 != null && bArr2.length > 0) {
                            gwVar.parseFrom(bArr2);
                        }
                        hwVar.f134904h.add(gwVar);
                    }
                    return 0;
                case 7:
                    hwVar.f134905i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    hwVar.f134906j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C52054y14 y144 = new C52054y14();
                        if (bArr3 != null && bArr3.length > 0) {
                            y144.parseFrom(bArr3);
                        }
                        hwVar.f134907n = y144;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C49939j34 j344 = new C49939j34();
                        if (bArr4 != null && bArr4.length > 0) {
                            j344.parseFrom(bArr4);
                        }
                        hwVar.f134908o = j344;
                    }
                    return 0;
                case 11:
                    hwVar.f134909p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
