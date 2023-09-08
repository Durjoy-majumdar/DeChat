package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.be0 */
public class C77907be0 extends C47465a {

    /* renamed from: d */
    public String f226995d;

    /* renamed from: e */
    public LinkedList<C77912ce0> f226996e = new LinkedList<>();

    /* renamed from: f */
    public long f226997f;

    /* renamed from: g */
    public long f226998g;

    /* renamed from: h */
    public String f226999h;

    /* renamed from: i */
    public String f227000i;

    /* renamed from: j */
    public long f227001j;

    /* renamed from: n */
    public String f227002n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77907be0)) {
            return false;
        }
        C77907be0 be02 = (C77907be0) aVar;
        return C46238a.m51546a(this.f226995d, be02.f226995d) && C46238a.m51546a(this.f226996e, be02.f226996e) && C46238a.m51546a(Long.valueOf(this.f226997f), Long.valueOf(be02.f226997f)) && C46238a.m51546a(Long.valueOf(this.f226998g), Long.valueOf(be02.f226998g)) && C46238a.m51546a(this.f226999h, be02.f226999h) && C46238a.m51546a(this.f227000i, be02.f227000i) && C46238a.m51546a(Long.valueOf(this.f227001j), Long.valueOf(be02.f227001j)) && C46238a.m51546a(this.f227002n, be02.f227002n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f226995d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f226996e);
            aVar.mo74321h(3, this.f226997f);
            aVar.mo74321h(4, this.f226998g);
            String str2 = this.f226999h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f227000i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74321h(7, this.f227001j);
            String str4 = this.f227002n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f226995d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f226996e) + C52418a.m58681h(3, this.f226997f) + C52418a.m58681h(4, this.f226998g);
            String str6 = this.f226999h;
            if (str6 != null) {
                g += C52418a.m58683j(5, str6);
            }
            String str7 = this.f227000i;
            if (str7 != null) {
                g += C52418a.m58683j(6, str7);
            }
            int h = g + C52418a.m58681h(7, this.f227001j);
            String str8 = this.f227002n;
            return str8 != null ? h + C52418a.m58683j(8, str8) : h;
        } else if (i == 2) {
            this.f226996e.clear();
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
            C77907be0 be02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    be02.f226995d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C77912ce0 ce02 = new C77912ce0();
                        if (bArr != null && bArr.length > 0) {
                            ce02.parseFrom(bArr);
                        }
                        be02.f226996e.add(ce02);
                    }
                    return 0;
                case 3:
                    be02.f226997f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    be02.f226998g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    be02.f226999h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    be02.f227000i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    be02.f227001j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    be02.f227002n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
