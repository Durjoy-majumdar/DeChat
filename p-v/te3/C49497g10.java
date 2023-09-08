package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.g10 */
public class C49497g10 extends C101820nt3 {

    /* renamed from: d */
    public String f133772d;

    /* renamed from: e */
    public String f133773e;

    /* renamed from: f */
    public String f133774f;

    /* renamed from: g */
    public C64234an2 f133775g;

    /* renamed from: h */
    public int f133776h;

    /* renamed from: i */
    public LinkedList<C51163rv3> f133777i = new LinkedList<>();

    /* renamed from: j */
    public String f133778j;

    /* renamed from: n */
    public String f133779n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49497g10)) {
            return false;
        }
        C49497g10 g102 = (C49497g10) aVar;
        return C46238a.m51546a(this.BaseRequest, g102.BaseRequest) && C46238a.m51546a(this.f133772d, g102.f133772d) && C46238a.m51546a(this.f133773e, g102.f133773e) && C46238a.m51546a(this.f133774f, g102.f133774f) && C46238a.m51546a(this.f133775g, g102.f133775g) && C46238a.m51546a(Integer.valueOf(this.f133776h), Integer.valueOf(g102.f133776h)) && C46238a.m51546a(this.f133777i, g102.f133777i) && C46238a.m51546a(this.f133778j, g102.f133778j) && C46238a.m51546a(this.f133779n, g102.f133779n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f133775g != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f133772d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f133773e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f133774f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                C64234an2 an22 = this.f133775g;
                if (an22 != null) {
                    aVar.mo74322i(5, an22.computeSize());
                    this.f133775g.writeFields(aVar);
                }
                aVar.mo74318e(6, this.f133776h);
                aVar.mo74320g(7, 8, this.f133777i);
                String str4 = this.f133778j;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                String str5 = this.f133779n;
                if (str5 != null) {
                    aVar.mo74323j(9, str5);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Loc");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str6 = this.f133772d;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f133773e;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f133774f;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            C64234an2 an23 = this.f133775g;
            if (an23 != null) {
                i2 += C52418a.m58682i(5, an23.computeSize());
            }
            int e = i2 + C52418a.m58678e(6, this.f133776h) + C52418a.m58680g(7, 8, this.f133777i);
            String str9 = this.f133778j;
            if (str9 != null) {
                e += C52418a.m58683j(8, str9);
            }
            String str10 = this.f133779n;
            return str10 != null ? e + C52418a.m58683j(9, str10) : e;
        } else if (i == 2) {
            this.f133777i.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f133775g != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Loc");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49497g10 g102 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        g102.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    g102.f133772d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    g102.f133773e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    g102.f133774f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64234an2 an24 = new C64234an2();
                        if (bArr2 != null && bArr2.length > 0) {
                            an24.parseFrom(bArr2);
                        }
                        g102.f133775g = an24;
                    }
                    return 0;
                case 6:
                    g102.f133776h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51163rv3 rv32 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv32.mo73356d(bArr3);
                        }
                        g102.f133777i.add(rv32);
                    }
                    return 0;
                case 8:
                    g102.f133778j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    g102.f133779n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
