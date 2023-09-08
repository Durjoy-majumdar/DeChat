package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class s44 extends C47465a {

    /* renamed from: d */
    public String f141319d;

    /* renamed from: e */
    public String f141320e;

    /* renamed from: f */
    public String f141321f;

    /* renamed from: g */
    public String f141322g;

    /* renamed from: h */
    public C50077k40 f141323h;

    /* renamed from: i */
    public boolean f141324i = true;

    /* renamed from: j */
    public LinkedList<C49398f93> f141325j = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof s44)) {
            return false;
        }
        s44 s44 = (s44) aVar;
        return C46238a.m51546a(this.f141319d, s44.f141319d) && C46238a.m51546a(this.f141320e, s44.f141320e) && C46238a.m51546a(this.f141321f, s44.f141321f) && C46238a.m51546a(this.f141322g, s44.f141322g) && C46238a.m51546a(this.f141323h, s44.f141323h) && C46238a.m51546a(Boolean.valueOf(this.f141324i), Boolean.valueOf(s44.f141324i)) && C46238a.m51546a(this.f141325j, s44.f141325j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141319d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f141320e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f141321f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f141322g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            C50077k40 k402 = this.f141323h;
            if (k402 != null) {
                aVar.mo74322i(5, k402.computeSize());
                this.f141323h.writeFields(aVar);
            }
            aVar.mo74314a(6, this.f141324i);
            aVar.mo74320g(7, 8, this.f141325j);
            return 0;
        } else if (i == 1) {
            String str5 = this.f141319d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f141320e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f141321f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f141322g;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            C50077k40 k403 = this.f141323h;
            if (k403 != null) {
                i2 += C52418a.m58682i(5, k403.computeSize());
            }
            return i2 + C52418a.m58674a(6, this.f141324i) + C52418a.m58680g(7, 8, this.f141325j);
        } else if (i == 2) {
            this.f141325j.clear();
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
            s44 s44 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    s44.f141319d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    s44.f141320e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    s44.f141321f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    s44.f141322g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C50077k40 k404 = new C50077k40();
                        if (bArr != null && bArr.length > 0) {
                            k404.parseFrom(bArr);
                        }
                        s44.f141323h = k404;
                    }
                    return 0;
                case 6:
                    s44.f141324i = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49398f93 f932 = new C49398f93();
                        if (bArr2 != null && bArr2.length > 0) {
                            f932.parseFrom(bArr2);
                        }
                        s44.f141325j.add(f932);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
