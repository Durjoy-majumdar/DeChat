package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class s35 extends C47465a {

    /* renamed from: d */
    public String f141303d;

    /* renamed from: e */
    public String f141304e;

    /* renamed from: f */
    public k35 f141305f;

    /* renamed from: g */
    public r35 f141306g;

    /* renamed from: h */
    public String f141307h;

    /* renamed from: i */
    public String f141308i;

    /* renamed from: j */
    public int f141309j;

    /* renamed from: n */
    public int f141310n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof s35)) {
            return false;
        }
        s35 s35 = (s35) aVar;
        return C46238a.m51546a(this.f141303d, s35.f141303d) && C46238a.m51546a(this.f141304e, s35.f141304e) && C46238a.m51546a(this.f141305f, s35.f141305f) && C46238a.m51546a(this.f141306g, s35.f141306g) && C46238a.m51546a(this.f141307h, s35.f141307h) && C46238a.m51546a(this.f141308i, s35.f141308i) && C46238a.m51546a(Integer.valueOf(this.f141309j), Integer.valueOf(s35.f141309j)) && C46238a.m51546a(Integer.valueOf(this.f141310n), Integer.valueOf(s35.f141310n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141303d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: EntranceDomain");
            } else if (this.f141304e != null) {
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                String str2 = this.f141304e;
                if (str2 != null) {
                    aVar.mo74323j(12, str2);
                }
                k35 k35 = this.f141305f;
                if (k35 != null) {
                    aVar.mo74322i(9, k35.computeSize());
                    this.f141305f.writeFields(aVar);
                }
                r35 r35 = this.f141306g;
                if (r35 != null) {
                    aVar.mo74322i(10, r35.computeSize());
                    this.f141306g.writeFields(aVar);
                }
                String str3 = this.f141307h;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f141308i;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                aVar.mo74318e(7, this.f141309j);
                aVar.mo74318e(8, this.f141310n);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Charset");
            }
        } else if (i == 1) {
            String str5 = this.f141303d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(4, str5);
            }
            String str6 = this.f141304e;
            if (str6 != null) {
                i2 += C52418a.m58683j(12, str6);
            }
            k35 k352 = this.f141305f;
            if (k352 != null) {
                i2 += C52418a.m58682i(9, k352.computeSize());
            }
            r35 r352 = this.f141306g;
            if (r352 != null) {
                i2 += C52418a.m58682i(10, r352.computeSize());
            }
            String str7 = this.f141307h;
            if (str7 != null) {
                i2 += C52418a.m58683j(5, str7);
            }
            String str8 = this.f141308i;
            if (str8 != null) {
                i2 += C52418a.m58683j(6, str8);
            }
            return i2 + C52418a.m58678e(7, this.f141309j) + C52418a.m58678e(8, this.f141310n);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f141303d == null) {
                throw new C52419b("Not all required fields were included: EntranceDomain");
            } else if (this.f141304e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Charset");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            s35 s35 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 4:
                    s35.f141303d = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    s35.f141307h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    s35.f141308i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    s35.f141309j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    s35.f141310n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        k35 k353 = new k35();
                        if (bArr != null && bArr.length > 0) {
                            k353.parseFrom(bArr);
                        }
                        s35.f141305f = k353;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        r35 r353 = new r35();
                        if (bArr2 != null && bArr2.length > 0) {
                            r353.parseFrom(bArr2);
                        }
                        s35.f141306g = r353;
                    }
                    return 0;
                case 12:
                    s35.f141304e = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
