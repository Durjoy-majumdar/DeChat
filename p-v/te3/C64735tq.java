package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tq */
public class C64735tq extends C101820nt3 {

    /* renamed from: d */
    public String f185635d;

    /* renamed from: e */
    public String f185636e;

    /* renamed from: f */
    public String f185637f;

    /* renamed from: g */
    public String f185638g;

    /* renamed from: h */
    public String f185639h;

    /* renamed from: i */
    public String f185640i;

    /* renamed from: j */
    public C89349b f185641j;

    /* renamed from: n */
    public String f185642n;

    /* renamed from: o */
    public boolean f185643o;

    /* renamed from: p */
    public String f185644p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64735tq)) {
            return false;
        }
        C64735tq tqVar = (C64735tq) aVar;
        return C46238a.m51546a(this.BaseRequest, tqVar.BaseRequest) && C46238a.m51546a(this.f185635d, tqVar.f185635d) && C46238a.m51546a(this.f185636e, tqVar.f185636e) && C46238a.m51546a(this.f185637f, tqVar.f185637f) && C46238a.m51546a(this.f185638g, tqVar.f185638g) && C46238a.m51546a(this.f185639h, tqVar.f185639h) && C46238a.m51546a(this.f185640i, tqVar.f185640i) && C46238a.m51546a(this.f185641j, tqVar.f185641j) && C46238a.m51546a(this.f185642n, tqVar.f185642n) && C46238a.m51546a(Boolean.valueOf(this.f185643o), Boolean.valueOf(tqVar.f185643o)) && C46238a.m51546a(this.f185644p, tqVar.f185644p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f185635d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f185636e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f185637f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f185638g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f185639h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f185640i;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            C89349b bVar = this.f185641j;
            if (bVar != null) {
                aVar.mo74315b(8, bVar);
            }
            String str7 = this.f185642n;
            if (str7 != null) {
                aVar.mo74323j(9, str7);
            }
            aVar.mo74314a(10, this.f185643o);
            String str8 = this.f185644p;
            if (str8 != null) {
                aVar.mo74323j(11, str8);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str9 = this.f185635d;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f185636e;
            if (str10 != null) {
                i2 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f185637f;
            if (str11 != null) {
                i2 += C52418a.m58683j(4, str11);
            }
            String str12 = this.f185638g;
            if (str12 != null) {
                i2 += C52418a.m58683j(5, str12);
            }
            String str13 = this.f185639h;
            if (str13 != null) {
                i2 += C52418a.m58683j(6, str13);
            }
            String str14 = this.f185640i;
            if (str14 != null) {
                i2 += C52418a.m58683j(7, str14);
            }
            C89349b bVar2 = this.f185641j;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(8, bVar2);
            }
            String str15 = this.f185642n;
            if (str15 != null) {
                i2 += C52418a.m58683j(9, str15);
            }
            int a = i2 + C52418a.m58674a(10, this.f185643o);
            String str16 = this.f185644p;
            return str16 != null ? a + C52418a.m58683j(11, str16) : a;
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
            C64735tq tqVar = objArr[1];
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
                        tqVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    tqVar.f185635d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    tqVar.f185636e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    tqVar.f185637f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    tqVar.f185638g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    tqVar.f185639h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    tqVar.f185640i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    tqVar.f185641j = aVar3.mo141626d(intValue);
                    return 0;
                case 9:
                    tqVar.f185642n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    tqVar.f185643o = aVar3.mo141625c(intValue);
                    return 0;
                case 11:
                    tqVar.f185644p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
