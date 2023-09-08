package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rq */
public class C64687rq extends C101820nt3 {

    /* renamed from: d */
    public String f185222d;

    /* renamed from: e */
    public String f185223e;

    /* renamed from: f */
    public String f185224f;

    /* renamed from: g */
    public String f185225g;

    /* renamed from: h */
    public String f185226h;

    /* renamed from: i */
    public String f185227i;

    /* renamed from: j */
    public C89349b f185228j;

    /* renamed from: n */
    public String f185229n;

    /* renamed from: o */
    public boolean f185230o;

    /* renamed from: p */
    public String f185231p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64687rq)) {
            return false;
        }
        C64687rq rqVar = (C64687rq) aVar;
        return C46238a.m51546a(this.BaseRequest, rqVar.BaseRequest) && C46238a.m51546a(this.f185222d, rqVar.f185222d) && C46238a.m51546a(this.f185223e, rqVar.f185223e) && C46238a.m51546a(this.f185224f, rqVar.f185224f) && C46238a.m51546a(this.f185225g, rqVar.f185225g) && C46238a.m51546a(this.f185226h, rqVar.f185226h) && C46238a.m51546a(this.f185227i, rqVar.f185227i) && C46238a.m51546a(this.f185228j, rqVar.f185228j) && C46238a.m51546a(this.f185229n, rqVar.f185229n) && C46238a.m51546a(Boolean.valueOf(this.f185230o), Boolean.valueOf(rqVar.f185230o)) && C46238a.m51546a(this.f185231p, rqVar.f185231p);
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
            String str = this.f185222d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f185223e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f185224f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f185225g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f185226h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f185227i;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            C89349b bVar = this.f185228j;
            if (bVar != null) {
                aVar.mo74315b(8, bVar);
            }
            String str7 = this.f185229n;
            if (str7 != null) {
                aVar.mo74323j(9, str7);
            }
            aVar.mo74314a(10, this.f185230o);
            String str8 = this.f185231p;
            if (str8 != null) {
                aVar.mo74323j(11, str8);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str9 = this.f185222d;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f185223e;
            if (str10 != null) {
                i2 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f185224f;
            if (str11 != null) {
                i2 += C52418a.m58683j(4, str11);
            }
            String str12 = this.f185225g;
            if (str12 != null) {
                i2 += C52418a.m58683j(5, str12);
            }
            String str13 = this.f185226h;
            if (str13 != null) {
                i2 += C52418a.m58683j(6, str13);
            }
            String str14 = this.f185227i;
            if (str14 != null) {
                i2 += C52418a.m58683j(7, str14);
            }
            C89349b bVar2 = this.f185228j;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(8, bVar2);
            }
            String str15 = this.f185229n;
            if (str15 != null) {
                i2 += C52418a.m58683j(9, str15);
            }
            int a = i2 + C52418a.m58674a(10, this.f185230o);
            String str16 = this.f185231p;
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
            C64687rq rqVar = objArr[1];
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
                        rqVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    rqVar.f185222d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    rqVar.f185223e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    rqVar.f185224f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    rqVar.f185225g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    rqVar.f185226h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    rqVar.f185227i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    rqVar.f185228j = aVar3.mo141626d(intValue);
                    return 0;
                case 9:
                    rqVar.f185229n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    rqVar.f185230o = aVar3.mo141625c(intValue);
                    return 0;
                case 11:
                    rqVar.f185231p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
