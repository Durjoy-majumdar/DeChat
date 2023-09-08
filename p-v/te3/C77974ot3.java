package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ot3 */
public class C77974ot3 extends C101820nt3 {

    /* renamed from: d */
    public String f227968d;

    /* renamed from: e */
    public String f227969e;

    /* renamed from: f */
    public String f227970f;

    /* renamed from: g */
    public int f227971g;

    /* renamed from: h */
    public int f227972h;

    /* renamed from: i */
    public String f227973i;

    /* renamed from: j */
    public int f227974j;

    /* renamed from: n */
    public int f227975n;

    /* renamed from: o */
    public String f227976o;

    /* renamed from: p */
    public String f227977p;

    /* renamed from: q */
    public C89349b f227978q;

    /* renamed from: r */
    public int f227979r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77974ot3)) {
            return false;
        }
        C77974ot3 ot32 = (C77974ot3) aVar;
        return C46238a.m51546a(this.BaseRequest, ot32.BaseRequest) && C46238a.m51546a(this.f227968d, ot32.f227968d) && C46238a.m51546a(this.f227969e, ot32.f227969e) && C46238a.m51546a(this.f227970f, ot32.f227970f) && C46238a.m51546a(Integer.valueOf(this.f227971g), Integer.valueOf(ot32.f227971g)) && C46238a.m51546a(Integer.valueOf(this.f227972h), Integer.valueOf(ot32.f227972h)) && C46238a.m51546a(this.f227973i, ot32.f227973i) && C46238a.m51546a(Integer.valueOf(this.f227974j), Integer.valueOf(ot32.f227974j)) && C46238a.m51546a(Integer.valueOf(this.f227975n), Integer.valueOf(ot32.f227975n)) && C46238a.m51546a(this.f227976o, ot32.f227976o) && C46238a.m51546a(this.f227977p, ot32.f227977p) && C46238a.m51546a(this.f227978q, ot32.f227978q) && C46238a.m51546a(Integer.valueOf(this.f227979r), Integer.valueOf(ot32.f227979r));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f227968d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f227969e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f227970f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f227971g);
            aVar.mo74318e(6, this.f227972h);
            String str4 = this.f227973i;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            aVar.mo74318e(8, this.f227974j);
            aVar.mo74318e(9, this.f227975n);
            String str5 = this.f227976o;
            if (str5 != null) {
                aVar.mo74323j(10, str5);
            }
            String str6 = this.f227977p;
            if (str6 != null) {
                aVar.mo74323j(11, str6);
            }
            C89349b bVar = this.f227978q;
            if (bVar != null) {
                aVar.mo74315b(12, bVar);
            }
            aVar.mo74318e(13, this.f227979r);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            int i3 = iaVar2 != null ? 0 + C52418a.m58682i(1, iaVar2.computeSize()) : 0;
            String str7 = this.f227968d;
            if (str7 != null) {
                i3 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f227969e;
            if (str8 != null) {
                i3 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f227970f;
            if (str9 != null) {
                i3 += C52418a.m58683j(4, str9);
            }
            int e = i3 + C52418a.m58678e(5, this.f227971g) + C52418a.m58678e(6, this.f227972h);
            String str10 = this.f227973i;
            if (str10 != null) {
                e += C52418a.m58683j(7, str10);
            }
            int e2 = e + C52418a.m58678e(8, this.f227974j) + C52418a.m58678e(9, this.f227975n);
            String str11 = this.f227976o;
            if (str11 != null) {
                e2 += C52418a.m58683j(10, str11);
            }
            String str12 = this.f227977p;
            if (str12 != null) {
                e2 += C52418a.m58683j(11, str12);
            }
            C89349b bVar2 = this.f227978q;
            if (bVar2 != null) {
                e2 += C52418a.m58675b(12, bVar2);
            }
            return e2 + C52418a.m58678e(13, this.f227979r);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77974ot3 ot32 = objArr[1];
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
                        ot32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    ot32.f227968d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ot32.f227969e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ot32.f227970f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ot32.f227971g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ot32.f227972h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ot32.f227973i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ot32.f227974j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    ot32.f227975n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    ot32.f227976o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    ot32.f227977p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    ot32.f227978q = aVar3.mo141626d(intValue);
                    return 0;
                case 13:
                    ot32.f227979r = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
