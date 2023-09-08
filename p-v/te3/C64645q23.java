package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.q23 */
public class C64645q23 extends C47465a {

    /* renamed from: d */
    public long f184934d;

    /* renamed from: e */
    public long f184935e;

    /* renamed from: f */
    public String f184936f;

    /* renamed from: g */
    public long f184937g;

    /* renamed from: h */
    public String f184938h;

    /* renamed from: i */
    public LinkedList<String> f184939i = new LinkedList<>();

    /* renamed from: j */
    public LinkedList<C64866yt2> f184940j = new LinkedList<>();

    /* renamed from: n */
    public String f184941n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64645q23)) {
            return false;
        }
        C64645q23 q232 = (C64645q23) aVar;
        return C46238a.m51546a(Long.valueOf(this.f184934d), Long.valueOf(q232.f184934d)) && C46238a.m51546a(Long.valueOf(this.f184935e), Long.valueOf(q232.f184935e)) && C46238a.m51546a(this.f184936f, q232.f184936f) && C46238a.m51546a(Long.valueOf(this.f184937g), Long.valueOf(q232.f184937g)) && C46238a.m51546a(this.f184938h, q232.f184938h) && C46238a.m51546a(this.f184939i, q232.f184939i) && C46238a.m51546a(this.f184940j, q232.f184940j) && C46238a.m51546a(this.f184941n, q232.f184941n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f184934d);
            aVar.mo74321h(2, this.f184935e);
            String str = this.f184936f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f184937g);
            String str2 = this.f184938h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74320g(6, 1, this.f184939i);
            aVar.mo74320g(7, 8, this.f184940j);
            String str3 = this.f184941n;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f184934d) + 0 + C52418a.m58681h(2, this.f184935e);
            String str4 = this.f184936f;
            if (str4 != null) {
                h += C52418a.m58683j(3, str4);
            }
            int h2 = h + C52418a.m58681h(4, this.f184937g);
            String str5 = this.f184938h;
            if (str5 != null) {
                h2 += C52418a.m58683j(5, str5);
            }
            int g = h2 + C52418a.m58680g(6, 1, this.f184939i) + C52418a.m58680g(7, 8, this.f184940j);
            String str6 = this.f184941n;
            return str6 != null ? g + C52418a.m58683j(8, str6) : g;
        } else if (i == 2) {
            this.f184939i.clear();
            this.f184940j.clear();
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
            C64645q23 q232 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    q232.f184934d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    q232.f184935e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    q232.f184936f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    q232.f184937g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    q232.f184938h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    q232.f184939i.add(aVar3.mo141633k(intValue));
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64866yt2 yt22 = new C64866yt2();
                        if (bArr != null && bArr.length > 0) {
                            yt22.parseFrom(bArr);
                        }
                        q232.f184940j.add(yt22);
                    }
                    return 0;
                case 8:
                    q232.f184941n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
