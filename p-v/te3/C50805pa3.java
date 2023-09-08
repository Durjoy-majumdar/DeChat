package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pa3 */
public class C50805pa3 extends C47465a {

    /* renamed from: d */
    public String f139671d;

    /* renamed from: e */
    public String f139672e;

    /* renamed from: f */
    public String f139673f;

    /* renamed from: g */
    public int f139674g;

    /* renamed from: h */
    public String f139675h;

    /* renamed from: i */
    public C51997xn f139676i;

    /* renamed from: j */
    public String f139677j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50805pa3)) {
            return false;
        }
        C50805pa3 pa32 = (C50805pa3) aVar;
        return C46238a.m51546a(this.f139671d, pa32.f139671d) && C46238a.m51546a(this.f139672e, pa32.f139672e) && C46238a.m51546a(this.f139673f, pa32.f139673f) && C46238a.m51546a(Integer.valueOf(this.f139674g), Integer.valueOf(pa32.f139674g)) && C46238a.m51546a(this.f139675h, pa32.f139675h) && C46238a.m51546a(this.f139676i, pa32.f139676i) && C46238a.m51546a(this.f139677j, pa32.f139677j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f139671d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f139672e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f139673f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f139674g);
            String str4 = this.f139675h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            C51997xn xnVar = this.f139676i;
            if (xnVar != null) {
                aVar.mo74322i(6, xnVar.computeSize());
                this.f139676i.writeFields(aVar);
            }
            String str5 = this.f139677j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f139671d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f139672e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f139673f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            int e = i2 + C52418a.m58678e(4, this.f139674g);
            String str9 = this.f139675h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            C51997xn xnVar2 = this.f139676i;
            if (xnVar2 != null) {
                e += C52418a.m58682i(6, xnVar2.computeSize());
            }
            String str10 = this.f139677j;
            return str10 != null ? e + C52418a.m58683j(7, str10) : e;
        } else if (i == 2) {
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
            C50805pa3 pa32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    pa32.f139671d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    pa32.f139672e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    pa32.f139673f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    pa32.f139674g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    pa32.f139675h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51997xn xnVar3 = new C51997xn();
                        if (bArr != null && bArr.length > 0) {
                            xnVar3.parseFrom(bArr);
                        }
                        pa32.f139676i = xnVar3;
                    }
                    return 0;
                case 7:
                    pa32.f139677j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
