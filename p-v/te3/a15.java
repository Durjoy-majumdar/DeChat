package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class a15 extends C47465a {

    /* renamed from: d */
    public long f130221d;

    /* renamed from: e */
    public String f130222e;

    /* renamed from: f */
    public String f130223f;

    /* renamed from: g */
    public int f130224g;

    /* renamed from: h */
    public String f130225h;

    /* renamed from: i */
    public long f130226i;

    /* renamed from: j */
    public boolean f130227j;

    /* renamed from: n */
    public C89349b f130228n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof a15)) {
            return false;
        }
        a15 a15 = (a15) aVar;
        return C46238a.m51546a(Long.valueOf(this.f130221d), Long.valueOf(a15.f130221d)) && C46238a.m51546a(this.f130222e, a15.f130222e) && C46238a.m51546a(this.f130223f, a15.f130223f) && C46238a.m51546a(Integer.valueOf(this.f130224g), Integer.valueOf(a15.f130224g)) && C46238a.m51546a(this.f130225h, a15.f130225h) && C46238a.m51546a(Long.valueOf(this.f130226i), Long.valueOf(a15.f130226i)) && C46238a.m51546a(Boolean.valueOf(this.f130227j), Boolean.valueOf(a15.f130227j)) && C46238a.m51546a(this.f130228n, a15.f130228n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f130222e == null) {
                throw new C52419b("Not all required fields were included: Nickname");
            } else if (this.f130223f == null) {
                throw new C52419b("Not all required fields were included: Content");
            } else if (this.f130225h != null) {
                aVar.mo74321h(1, this.f130221d);
                String str = this.f130222e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f130223f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f130224g);
                String str3 = this.f130225h;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                aVar.mo74321h(6, this.f130226i);
                aVar.mo74314a(7, this.f130227j);
                C89349b bVar = this.f130228n;
                if (bVar != null) {
                    aVar.mo74315b(8, bVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Talker");
            }
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f130221d) + 0;
            String str4 = this.f130222e;
            if (str4 != null) {
                h += C52418a.m58683j(2, str4);
            }
            String str5 = this.f130223f;
            if (str5 != null) {
                h += C52418a.m58683j(3, str5);
            }
            int e = h + C52418a.m58678e(4, this.f130224g);
            String str6 = this.f130225h;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            int h2 = e + C52418a.m58681h(6, this.f130226i) + C52418a.m58674a(7, this.f130227j);
            C89349b bVar2 = this.f130228n;
            return bVar2 != null ? h2 + C52418a.m58675b(8, bVar2) : h2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f130222e == null) {
                throw new C52419b("Not all required fields were included: Nickname");
            } else if (this.f130223f == null) {
                throw new C52419b("Not all required fields were included: Content");
            } else if (this.f130225h != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Talker");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            a15 a15 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    a15.f130221d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    a15.f130222e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    a15.f130223f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    a15.f130224g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    a15.f130225h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    a15.f130226i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    a15.f130227j = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    a15.f130228n = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
