package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pq */
public class C77979pq extends C101820nt3 {

    /* renamed from: d */
    public String f228026d;

    /* renamed from: e */
    public int f228027e;

    /* renamed from: f */
    public String f228028f;

    /* renamed from: g */
    public String f228029g;

    /* renamed from: h */
    public int f228030h;

    /* renamed from: i */
    public int f228031i;

    /* renamed from: j */
    public String f228032j;

    /* renamed from: n */
    public String f228033n;

    /* renamed from: o */
    public String f228034o;

    /* renamed from: p */
    public String f228035p;

    /* renamed from: q */
    public String f228036q;

    /* renamed from: r */
    public int f228037r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77979pq)) {
            return false;
        }
        C77979pq pqVar = (C77979pq) aVar;
        return C46238a.m51546a(this.BaseRequest, pqVar.BaseRequest) && C46238a.m51546a(this.f228026d, pqVar.f228026d) && C46238a.m51546a(Integer.valueOf(this.f228027e), Integer.valueOf(pqVar.f228027e)) && C46238a.m51546a(this.f228028f, pqVar.f228028f) && C46238a.m51546a(this.f228029g, pqVar.f228029g) && C46238a.m51546a(Integer.valueOf(this.f228030h), Integer.valueOf(pqVar.f228030h)) && C46238a.m51546a(Integer.valueOf(this.f228031i), Integer.valueOf(pqVar.f228031i)) && C46238a.m51546a(this.f228032j, pqVar.f228032j) && C46238a.m51546a(this.f228033n, pqVar.f228033n) && C46238a.m51546a(this.f228034o, pqVar.f228034o) && C46238a.m51546a(this.f228035p, pqVar.f228035p) && C46238a.m51546a(this.f228036q, pqVar.f228036q) && C46238a.m51546a(Integer.valueOf(this.f228037r), Integer.valueOf(pqVar.f228037r));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f228026d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f228026d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f228027e);
                String str2 = this.f228028f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f228029g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                aVar.mo74318e(6, this.f228030h);
                aVar.mo74318e(7, this.f228031i);
                String str4 = this.f228032j;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                String str5 = this.f228033n;
                if (str5 != null) {
                    aVar.mo74323j(9, str5);
                }
                String str6 = this.f228034o;
                if (str6 != null) {
                    aVar.mo74323j(10, str6);
                }
                String str7 = this.f228035p;
                if (str7 != null) {
                    aVar.mo74323j(11, str7);
                }
                String str8 = this.f228036q;
                if (str8 != null) {
                    aVar.mo74323j(12, str8);
                }
                aVar.mo74318e(13, this.f228037r);
                return 0;
            }
            throw new C52419b("Not all required fields were included: receiver_name");
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            String str9 = this.f228026d;
            if (str9 != null) {
                i3 += C52418a.m58683j(2, str9);
            }
            int e = i3 + C52418a.m58678e(3, this.f228027e);
            String str10 = this.f228028f;
            if (str10 != null) {
                e += C52418a.m58683j(4, str10);
            }
            String str11 = this.f228029g;
            if (str11 != null) {
                e += C52418a.m58683j(5, str11);
            }
            int e2 = e + C52418a.m58678e(6, this.f228030h) + C52418a.m58678e(7, this.f228031i);
            String str12 = this.f228032j;
            if (str12 != null) {
                e2 += C52418a.m58683j(8, str12);
            }
            String str13 = this.f228033n;
            if (str13 != null) {
                e2 += C52418a.m58683j(9, str13);
            }
            String str14 = this.f228034o;
            if (str14 != null) {
                e2 += C52418a.m58683j(10, str14);
            }
            String str15 = this.f228035p;
            if (str15 != null) {
                e2 += C52418a.m58683j(11, str15);
            }
            String str16 = this.f228036q;
            if (str16 != null) {
                e2 += C52418a.m58683j(12, str16);
            }
            return e2 + C52418a.m58678e(13, this.f228037r);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f228026d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: receiver_name");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77979pq pqVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        pqVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    pqVar.f228026d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    pqVar.f228027e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    pqVar.f228028f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    pqVar.f228029g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    pqVar.f228030h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    pqVar.f228031i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    pqVar.f228032j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    pqVar.f228033n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    pqVar.f228034o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    pqVar.f228035p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    pqVar.f228036q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    pqVar.f228037r = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
