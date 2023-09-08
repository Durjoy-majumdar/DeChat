package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class oo4 extends C47465a {

    /* renamed from: d */
    public int f139289d;

    /* renamed from: e */
    public int f139290e;

    /* renamed from: f */
    public String f139291f;

    /* renamed from: g */
    public String f139292g;

    /* renamed from: h */
    public String f139293h;

    /* renamed from: i */
    public String f139294i;

    /* renamed from: j */
    public LinkedList<C52143yo> f139295j = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof oo4)) {
            return false;
        }
        oo4 oo4 = (oo4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139289d), Integer.valueOf(oo4.f139289d)) && C46238a.m51546a(Integer.valueOf(this.f139290e), Integer.valueOf(oo4.f139290e)) && C46238a.m51546a(this.f139291f, oo4.f139291f) && C46238a.m51546a(this.f139292g, oo4.f139292g) && C46238a.m51546a(this.f139293h, oo4.f139293h) && C46238a.m51546a(this.f139294i, oo4.f139294i) && C46238a.m51546a(this.f139295j, oo4.f139295j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139289d);
            aVar.mo74318e(2, this.f139290e);
            String str = this.f139291f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f139292g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f139293h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f139294i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74320g(7, 8, this.f139295j);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f139289d) + 0 + C52418a.m58678e(2, this.f139290e);
            String str5 = this.f139291f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f139292g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f139293h;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            String str8 = this.f139294i;
            if (str8 != null) {
                e += C52418a.m58683j(6, str8);
            }
            return e + C52418a.m58680g(7, 8, this.f139295j);
        } else if (i == 2) {
            this.f139295j.clear();
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
            oo4 oo4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    oo4.f139289d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    oo4.f139290e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    oo4.f139291f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    oo4.f139292g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    oo4.f139293h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    oo4.f139294i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C52143yo yoVar = new C52143yo();
                        if (bArr != null && bArr.length > 0) {
                            yoVar.parseFrom(bArr);
                        }
                        oo4.f139295j.add(yoVar);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
