package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fy0 */
public class C49486fy0 extends C47465a {

    /* renamed from: d */
    public String f133734d;

    /* renamed from: e */
    public String f133735e;

    /* renamed from: f */
    public String f133736f;

    /* renamed from: g */
    public int f133737g;

    /* renamed from: h */
    public LinkedList<C50767p11> f133738h = new LinkedList<>();

    /* renamed from: i */
    public int f133739i;

    /* renamed from: j */
    public int f133740j;

    /* renamed from: n */
    public int f133741n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49486fy0)) {
            return false;
        }
        C49486fy0 fy02 = (C49486fy0) aVar;
        return C46238a.m51546a(this.f133734d, fy02.f133734d) && C46238a.m51546a(this.f133735e, fy02.f133735e) && C46238a.m51546a(this.f133736f, fy02.f133736f) && C46238a.m51546a(Integer.valueOf(this.f133737g), Integer.valueOf(fy02.f133737g)) && C46238a.m51546a(this.f133738h, fy02.f133738h) && C46238a.m51546a(Integer.valueOf(this.f133739i), Integer.valueOf(fy02.f133739i)) && C46238a.m51546a(Integer.valueOf(this.f133740j), Integer.valueOf(fy02.f133740j)) && C46238a.m51546a(Integer.valueOf(this.f133741n), Integer.valueOf(fy02.f133741n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f133734d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f133735e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f133736f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f133737g);
            aVar.mo74320g(5, 8, this.f133738h);
            aVar.mo74318e(6, this.f133739i);
            aVar.mo74318e(7, this.f133740j);
            aVar.mo74318e(8, this.f133741n);
            return 0;
        } else if (i == 1) {
            String str4 = this.f133734d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f133735e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f133736f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58678e(4, this.f133737g) + C52418a.m58680g(5, 8, this.f133738h) + C52418a.m58678e(6, this.f133739i) + C52418a.m58678e(7, this.f133740j) + C52418a.m58678e(8, this.f133741n);
        } else if (i == 2) {
            this.f133738h.clear();
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
            C49486fy0 fy02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    fy02.f133734d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    fy02.f133735e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    fy02.f133736f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    fy02.f133737g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C50767p11 p112 = new C50767p11();
                        if (bArr != null && bArr.length > 0) {
                            p112.parseFrom(bArr);
                        }
                        fy02.f133738h.add(p112);
                    }
                    return 0;
                case 6:
                    fy02.f133739i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    fy02.f133740j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    fy02.f133741n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
