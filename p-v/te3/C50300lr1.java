package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lr1 */
public class C50300lr1 extends C47465a {

    /* renamed from: d */
    public String f137611d;

    /* renamed from: e */
    public String f137612e;

    /* renamed from: f */
    public String f137613f;

    /* renamed from: g */
    public String f137614g;

    /* renamed from: h */
    public String f137615h;

    /* renamed from: i */
    public C51586ur1 f137616i;

    /* renamed from: j */
    public int f137617j;

    /* renamed from: n */
    public String f137618n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50300lr1)) {
            return false;
        }
        C50300lr1 lr12 = (C50300lr1) aVar;
        return C46238a.m51546a(this.f137611d, lr12.f137611d) && C46238a.m51546a(this.f137612e, lr12.f137612e) && C46238a.m51546a(this.f137613f, lr12.f137613f) && C46238a.m51546a(this.f137614g, lr12.f137614g) && C46238a.m51546a(this.f137615h, lr12.f137615h) && C46238a.m51546a(this.f137616i, lr12.f137616i) && C46238a.m51546a(Integer.valueOf(this.f137617j), Integer.valueOf(lr12.f137617j)) && C46238a.m51546a(this.f137618n, lr12.f137618n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137611d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: AppId");
            } else if (this.f137612e == null) {
                throw new C52419b("Not all required fields were included: Name");
            } else if (this.f137613f == null) {
                throw new C52419b("Not all required fields were included: Remark");
            } else if (this.f137614g == null) {
                throw new C52419b("Not all required fields were included: IconUrl");
            } else if (this.f137616i != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f137612e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f137613f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f137614g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                String str5 = this.f137615h;
                if (str5 != null) {
                    aVar.mo74323j(5, str5);
                }
                C51586ur1 ur12 = this.f137616i;
                if (ur12 != null) {
                    aVar.mo74322i(6, ur12.computeSize());
                    this.f137616i.writeFields(aVar);
                }
                aVar.mo74318e(7, this.f137617j);
                String str6 = this.f137618n;
                if (str6 == null) {
                    return 0;
                }
                aVar.mo74323j(8, str6);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: DownloadInfo");
            }
        } else if (i2 == 1) {
            String str7 = this.f137611d;
            int j = str7 != null ? C52418a.m58683j(1, str7) + 0 : 0;
            String str8 = this.f137612e;
            if (str8 != null) {
                j += C52418a.m58683j(2, str8);
            }
            String str9 = this.f137613f;
            if (str9 != null) {
                j += C52418a.m58683j(3, str9);
            }
            String str10 = this.f137614g;
            if (str10 != null) {
                j += C52418a.m58683j(4, str10);
            }
            String str11 = this.f137615h;
            if (str11 != null) {
                j += C52418a.m58683j(5, str11);
            }
            C51586ur1 ur13 = this.f137616i;
            if (ur13 != null) {
                j += C52418a.m58682i(6, ur13.computeSize());
            }
            int e = j + C52418a.m58678e(7, this.f137617j);
            String str12 = this.f137618n;
            return str12 != null ? e + C52418a.m58683j(8, str12) : e;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f137611d == null) {
                throw new C52419b("Not all required fields were included: AppId");
            } else if (this.f137612e == null) {
                throw new C52419b("Not all required fields were included: Name");
            } else if (this.f137613f == null) {
                throw new C52419b("Not all required fields were included: Remark");
            } else if (this.f137614g == null) {
                throw new C52419b("Not all required fields were included: IconUrl");
            } else if (this.f137616i != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: DownloadInfo");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50300lr1 lr12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    lr12.f137611d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    lr12.f137612e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    lr12.f137613f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    lr12.f137614g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    lr12.f137615h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size = j2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j2.get(i3);
                        C51586ur1 ur14 = new C51586ur1();
                        if (bArr != null && bArr.length > 0) {
                            ur14.parseFrom(bArr);
                        }
                        lr12.f137616i = ur14;
                    }
                    return 0;
                case 7:
                    lr12.f137617j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    lr12.f137618n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
