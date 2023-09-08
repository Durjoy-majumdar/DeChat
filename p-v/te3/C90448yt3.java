package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yt3 */
public class C90448yt3 extends C47465a {

    /* renamed from: d */
    public String f259943d;

    /* renamed from: e */
    public int f259944e;

    /* renamed from: f */
    public String f259945f;

    /* renamed from: g */
    public int f259946g;

    /* renamed from: h */
    public LinkedList<f54> f259947h = new LinkedList<>();

    /* renamed from: i */
    public C89349b f259948i;

    /* renamed from: j */
    public String f259949j;

    /* renamed from: n */
    public int f259950n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90448yt3)) {
            return false;
        }
        C90448yt3 yt32 = (C90448yt3) aVar;
        return C46238a.m51546a(this.f259943d, yt32.f259943d) && C46238a.m51546a(Integer.valueOf(this.f259944e), Integer.valueOf(yt32.f259944e)) && C46238a.m51546a(this.f259945f, yt32.f259945f) && C46238a.m51546a(Integer.valueOf(this.f259946g), Integer.valueOf(yt32.f259946g)) && C46238a.m51546a(this.f259947h, yt32.f259947h) && C46238a.m51546a(this.f259948i, yt32.f259948i) && C46238a.m51546a(this.f259949j, yt32.f259949j) && C46238a.m51546a(Integer.valueOf(this.f259950n), Integer.valueOf(yt32.f259950n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f259943d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: MD5");
            } else if (this.f259945f == null) {
                throw new C52419b("Not all required fields were included: Url");
            } else if (this.f259949j != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f259944e);
                String str2 = this.f259945f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f259946g);
                aVar.mo74320g(5, 8, this.f259947h);
                C89349b bVar = this.f259948i;
                if (bVar != null) {
                    aVar.mo74315b(6, bVar);
                }
                String str3 = this.f259949j;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                aVar.mo74318e(8, this.f259950n);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: OriginalMD5");
            }
        } else if (i == 1) {
            String str4 = this.f259943d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int e = i2 + C52418a.m58678e(2, this.f259944e);
            String str5 = this.f259945f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            int e2 = e + C52418a.m58678e(4, this.f259946g) + C52418a.m58680g(5, 8, this.f259947h);
            C89349b bVar2 = this.f259948i;
            if (bVar2 != null) {
                e2 += C52418a.m58675b(6, bVar2);
            }
            String str6 = this.f259949j;
            if (str6 != null) {
                e2 += C52418a.m58683j(7, str6);
            }
            return e2 + C52418a.m58678e(8, this.f259950n);
        } else if (i == 2) {
            this.f259947h.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f259943d == null) {
                throw new C52419b("Not all required fields were included: MD5");
            } else if (this.f259945f == null) {
                throw new C52419b("Not all required fields were included: Url");
            } else if (this.f259949j != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: OriginalMD5");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C90448yt3 yt32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    yt32.f259943d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    yt32.f259944e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    yt32.f259945f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    yt32.f259946g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        f54 f54 = new f54();
                        if (bArr != null && bArr.length > 0) {
                            f54.parseFrom(bArr);
                        }
                        yt32.f259947h.add(f54);
                    }
                    return 0;
                case 6:
                    yt32.f259948i = aVar3.mo141626d(intValue);
                    return 0;
                case 7:
                    yt32.f259949j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    yt32.f259950n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
