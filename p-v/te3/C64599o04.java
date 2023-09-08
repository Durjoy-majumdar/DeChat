package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o04 */
public class C64599o04 extends C101820nt3 {

    /* renamed from: d */
    public String f184605d;

    /* renamed from: e */
    public LinkedList<Integer> f184606e = new LinkedList<>();

    /* renamed from: f */
    public String f184607f;

    /* renamed from: g */
    public String f184608g;

    /* renamed from: h */
    public String f184609h;

    /* renamed from: i */
    public String f184610i;

    /* renamed from: j */
    public String f184611j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64599o04)) {
            return false;
        }
        C64599o04 o042 = (C64599o04) aVar;
        return C46238a.m51546a(this.BaseRequest, o042.BaseRequest) && C46238a.m51546a(this.f184605d, o042.f184605d) && C46238a.m51546a(this.f184606e, o042.f184606e) && C46238a.m51546a(this.f184607f, o042.f184607f) && C46238a.m51546a(this.f184608g, o042.f184608g) && C46238a.m51546a(this.f184609h, o042.f184609h) && C46238a.m51546a(this.f184610i, o042.f184610i) && C46238a.m51546a(this.f184611j, o042.f184611j);
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
            String str = this.f184605d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 2, this.f184606e);
            String str2 = this.f184607f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f184608g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f184609h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f184610i;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f184611j;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str7 = this.f184605d;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            int g = i2 + C52418a.m58680g(3, 2, this.f184606e);
            String str8 = this.f184607f;
            if (str8 != null) {
                g += C52418a.m58683j(4, str8);
            }
            String str9 = this.f184608g;
            if (str9 != null) {
                g += C52418a.m58683j(5, str9);
            }
            String str10 = this.f184609h;
            if (str10 != null) {
                g += C52418a.m58683j(6, str10);
            }
            String str11 = this.f184610i;
            if (str11 != null) {
                g += C52418a.m58683j(7, str11);
            }
            String str12 = this.f184611j;
            return str12 != null ? g + C52418a.m58683j(8, str12) : g;
        } else if (i == 2) {
            this.f184606e.clear();
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
            C64599o04 o042 = objArr[1];
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
                        o042.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    o042.f184605d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    o042.f184606e.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                case 4:
                    o042.f184607f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    o042.f184608g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    o042.f184609h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    o042.f184610i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    o042.f184611j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
