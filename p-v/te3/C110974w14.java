package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.w14 */
public class C110974w14 extends C47465a {

    /* renamed from: d */
    public String f332314d;

    /* renamed from: e */
    public long f332315e;

    /* renamed from: f */
    public LinkedList<C118464s14> f332316f = new LinkedList<>();

    /* renamed from: g */
    public String f332317g;

    /* renamed from: h */
    public boolean f332318h = false;

    /* renamed from: i */
    public int f332319i = 0;

    /* renamed from: j */
    public int f332320j = -1;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C110974w14)) {
            return false;
        }
        C110974w14 w142 = (C110974w14) aVar;
        return C46238a.m51546a(this.f332314d, w142.f332314d) && C46238a.m51546a(Long.valueOf(this.f332315e), Long.valueOf(w142.f332315e)) && C46238a.m51546a(this.f332316f, w142.f332316f) && C46238a.m51546a(this.f332317g, w142.f332317g) && C46238a.m51546a(Boolean.valueOf(this.f332318h), Boolean.valueOf(w142.f332318h)) && C46238a.m51546a(Integer.valueOf(this.f332319i), Integer.valueOf(w142.f332319i)) && C46238a.m51546a(Integer.valueOf(this.f332320j), Integer.valueOf(w142.f332320j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f332314d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f332315e);
            aVar.mo74320g(3, 8, this.f332316f);
            String str2 = this.f332317g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74314a(5, this.f332318h);
            aVar.mo74318e(6, this.f332319i);
            aVar.mo74318e(7, this.f332320j);
            return 0;
        } else if (i == 1) {
            String str3 = this.f332314d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int h = i2 + C52418a.m58681h(2, this.f332315e) + C52418a.m58680g(3, 8, this.f332316f);
            String str4 = this.f332317g;
            if (str4 != null) {
                h += C52418a.m58683j(4, str4);
            }
            return h + C52418a.m58674a(5, this.f332318h) + C52418a.m58678e(6, this.f332319i) + C52418a.m58678e(7, this.f332320j);
        } else if (i == 2) {
            this.f332316f.clear();
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
            C110974w14 w142 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    w142.f332314d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    w142.f332315e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C118464s14 s142 = new C118464s14();
                        if (bArr != null && bArr.length > 0) {
                            s142.parseFrom(bArr);
                        }
                        w142.f332316f.add(s142);
                    }
                    return 0;
                case 4:
                    w142.f332317g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    w142.f332318h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    w142.f332319i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    w142.f332320j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
