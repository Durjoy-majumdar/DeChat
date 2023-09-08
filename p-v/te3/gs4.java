package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class gs4 extends C47465a {

    /* renamed from: d */
    public String f331980d;

    /* renamed from: e */
    public long f331981e;

    /* renamed from: f */
    public String f331982f;

    /* renamed from: g */
    public LinkedList<ft4> f331983g = new LinkedList<>();

    /* renamed from: h */
    public long f331984h;

    /* renamed from: i */
    public int f331985i;

    /* renamed from: j */
    public String f331986j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof gs4)) {
            return false;
        }
        gs4 gs4 = (gs4) aVar;
        return C46238a.m51546a(this.f331980d, gs4.f331980d) && C46238a.m51546a(Long.valueOf(this.f331981e), Long.valueOf(gs4.f331981e)) && C46238a.m51546a(this.f331982f, gs4.f331982f) && C46238a.m51546a(this.f331983g, gs4.f331983g) && C46238a.m51546a(Long.valueOf(this.f331984h), Long.valueOf(gs4.f331984h)) && C46238a.m51546a(Integer.valueOf(this.f331985i), Integer.valueOf(gs4.f331985i)) && C46238a.m51546a(this.f331986j, gs4.f331986j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f331980d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f331981e);
            String str2 = this.f331982f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74320g(4, 8, this.f331983g);
            aVar.mo74321h(5, this.f331984h);
            aVar.mo74318e(6, this.f331985i);
            String str3 = this.f331986j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f331980d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int h = i2 + C52418a.m58681h(2, this.f331981e);
            String str5 = this.f331982f;
            if (str5 != null) {
                h += C52418a.m58683j(3, str5);
            }
            int g = h + C52418a.m58680g(4, 8, this.f331983g) + C52418a.m58681h(5, this.f331984h) + C52418a.m58678e(6, this.f331985i);
            String str6 = this.f331986j;
            return str6 != null ? g + C52418a.m58683j(7, str6) : g;
        } else if (i == 2) {
            this.f331983g.clear();
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
            gs4 gs4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    gs4.f331980d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    gs4.f331981e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    gs4.f331982f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        ft4 ft4 = new ft4();
                        if (bArr != null && bArr.length > 0) {
                            ft4.parseFrom(bArr);
                        }
                        gs4.f331983g.add(ft4);
                    }
                    return 0;
                case 5:
                    gs4.f331984h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    gs4.f331985i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    gs4.f331986j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
