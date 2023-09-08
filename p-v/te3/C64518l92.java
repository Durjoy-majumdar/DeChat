package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l92 */
public class C64518l92 extends C101820nt3 {

    /* renamed from: d */
    public C51018qv3 f184059d;

    /* renamed from: e */
    public String f184060e;

    /* renamed from: f */
    public String f184061f;

    /* renamed from: g */
    public String f184062g;

    /* renamed from: h */
    public String f184063h;

    /* renamed from: i */
    public String f184064i;

    /* renamed from: j */
    public String f184065j;

    /* renamed from: n */
    public int f184066n;

    /* renamed from: o */
    public String f184067o;

    /* renamed from: p */
    public String f184068p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64518l92)) {
            return false;
        }
        C64518l92 l922 = (C64518l92) aVar;
        return C46238a.m51546a(this.BaseRequest, l922.BaseRequest) && C46238a.m51546a(this.f184059d, l922.f184059d) && C46238a.m51546a(this.f184060e, l922.f184060e) && C46238a.m51546a(this.f184061f, l922.f184061f) && C46238a.m51546a(this.f184062g, l922.f184062g) && C46238a.m51546a(this.f184063h, l922.f184063h) && C46238a.m51546a(this.f184064i, l922.f184064i) && C46238a.m51546a(this.f184065j, l922.f184065j) && C46238a.m51546a(Integer.valueOf(this.f184066n), Integer.valueOf(l922.f184066n)) && C46238a.m51546a(this.f184067o, l922.f184067o) && C46238a.m51546a(this.f184068p, l922.f184068p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f184059d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f184059d;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f184059d.writeFields(aVar);
                }
                String str = this.f184060e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f184061f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f184062g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f184063h;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                String str5 = this.f184064i;
                if (str5 != null) {
                    aVar.mo74323j(7, str5);
                }
                String str6 = this.f184065j;
                if (str6 != null) {
                    aVar.mo74323j(8, str6);
                }
                aVar.mo74318e(9, this.f184066n);
                String str7 = this.f184067o;
                if (str7 != null) {
                    aVar.mo74323j(10, str7);
                }
                String str8 = this.f184068p;
                if (str8 != null) {
                    aVar.mo74323j(11, str8);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: RandomEncryKey");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C51018qv3 qv33 = this.f184059d;
            if (qv33 != null) {
                i2 += C52418a.m58682i(2, qv33.computeSize());
            }
            String str9 = this.f184060e;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f184061f;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f184062g;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            String str12 = this.f184063h;
            if (str12 != null) {
                i2 += C52418a.m58683j(6, str12);
            }
            String str13 = this.f184064i;
            if (str13 != null) {
                i2 += C52418a.m58683j(7, str13);
            }
            String str14 = this.f184065j;
            if (str14 != null) {
                i2 += C52418a.m58683j(8, str14);
            }
            int e = i2 + C52418a.m58678e(9, this.f184066n);
            String str15 = this.f184067o;
            if (str15 != null) {
                e += C52418a.m58683j(10, str15);
            }
            String str16 = this.f184068p;
            return str16 != null ? e + C52418a.m58683j(11, str16) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f184059d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: RandomEncryKey");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64518l92 l922 = objArr[1];
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
                        l922.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        l922.f184059d = qv34;
                    }
                    return 0;
                case 3:
                    l922.f184060e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    l922.f184061f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    l922.f184062g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    l922.f184063h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    l922.f184064i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    l922.f184065j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    l922.f184066n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    l922.f184067o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    l922.f184068p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
