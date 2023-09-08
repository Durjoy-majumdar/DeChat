package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.re3 */
public class C51097re3 extends C47465a {

    /* renamed from: d */
    public String f140864d;

    /* renamed from: e */
    public String f140865e;

    /* renamed from: f */
    public LinkedList<fg4> f140866f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<Integer> f140867g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<Integer> f140868h = new LinkedList<>();

    /* renamed from: i */
    public String f140869i;

    /* renamed from: j */
    public boolean f140870j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51097re3)) {
            return false;
        }
        C51097re3 re32 = (C51097re3) aVar;
        return C46238a.m51546a(this.f140864d, re32.f140864d) && C46238a.m51546a(this.f140865e, re32.f140865e) && C46238a.m51546a(this.f140866f, re32.f140866f) && C46238a.m51546a(this.f140867g, re32.f140867g) && C46238a.m51546a(this.f140868h, re32.f140868h) && C46238a.m51546a(this.f140869i, re32.f140869i) && C46238a.m51546a(Boolean.valueOf(this.f140870j), Boolean.valueOf(re32.f140870j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140864d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f140865e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74320g(3, 8, this.f140866f);
            aVar.mo74320g(4, 2, this.f140867g);
            aVar.mo74320g(5, 2, this.f140868h);
            String str3 = this.f140869i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74314a(7, this.f140870j);
            return 0;
        } else if (i == 1) {
            String str4 = this.f140864d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f140865e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int g = i2 + C52418a.m58680g(3, 8, this.f140866f) + C52418a.m58680g(4, 2, this.f140867g) + C52418a.m58680g(5, 2, this.f140868h);
            String str6 = this.f140869i;
            if (str6 != null) {
                g += C52418a.m58683j(6, str6);
            }
            return g + C52418a.m58674a(7, this.f140870j);
        } else if (i == 2) {
            this.f140866f.clear();
            this.f140867g.clear();
            this.f140868h.clear();
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
            C51097re3 re32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    re32.f140864d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    re32.f140865e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        fg4 fg4 = new fg4();
                        if (bArr != null && bArr.length > 0) {
                            fg4.parseFrom(bArr);
                        }
                        re32.f140866f.add(fg4);
                    }
                    return 0;
                case 4:
                    re32.f140867g.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                case 5:
                    re32.f140868h.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                case 6:
                    re32.f140869i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    re32.f140870j = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
