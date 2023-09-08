package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class og4 extends C47465a {

    /* renamed from: d */
    public LinkedList<String> f139167d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C50215l43> f139168e = new LinkedList<>();

    /* renamed from: f */
    public String f139169f;

    /* renamed from: g */
    public int f139170g;

    /* renamed from: h */
    public String f139171h;

    /* renamed from: i */
    public String f139172i;

    /* renamed from: j */
    public int f139173j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof og4)) {
            return false;
        }
        og4 og4 = (og4) aVar;
        return C46238a.m51546a(this.f139167d, og4.f139167d) && C46238a.m51546a(this.f139168e, og4.f139168e) && C46238a.m51546a(this.f139169f, og4.f139169f) && C46238a.m51546a(Integer.valueOf(this.f139170g), Integer.valueOf(og4.f139170g)) && C46238a.m51546a(this.f139171h, og4.f139171h) && C46238a.m51546a(this.f139172i, og4.f139172i) && C46238a.m51546a(Integer.valueOf(this.f139173j), Integer.valueOf(og4.f139173j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 1, this.f139167d);
            aVar.mo74320g(2, 8, this.f139168e);
            String str = this.f139169f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f139170g);
            String str2 = this.f139171h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f139172i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74318e(7, this.f139173j);
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 1, this.f139167d) + 0 + C52418a.m58680g(2, 8, this.f139168e);
            String str4 = this.f139169f;
            if (str4 != null) {
                g += C52418a.m58683j(3, str4);
            }
            int e = g + C52418a.m58678e(4, this.f139170g);
            String str5 = this.f139171h;
            if (str5 != null) {
                e += C52418a.m58683j(5, str5);
            }
            String str6 = this.f139172i;
            if (str6 != null) {
                e += C52418a.m58683j(6, str6);
            }
            return e + C52418a.m58678e(7, this.f139173j);
        } else if (i == 2) {
            this.f139167d.clear();
            this.f139168e.clear();
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
            og4 og4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    og4.f139167d.add(aVar3.mo141633k(intValue));
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C50215l43 l432 = new C50215l43();
                        if (bArr != null && bArr.length > 0) {
                            l432.parseFrom(bArr);
                        }
                        og4.f139168e.add(l432);
                    }
                    return 0;
                case 3:
                    og4.f139169f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    og4.f139170g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    og4.f139171h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    og4.f139172i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    og4.f139173j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
