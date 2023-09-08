package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tp1 */
public class C64734tp1 extends C101820nt3 {

    /* renamed from: d */
    public String f185629d;

    /* renamed from: e */
    public String f185630e;

    /* renamed from: f */
    public String f185631f;

    /* renamed from: g */
    public String f185632g;

    /* renamed from: h */
    public String f185633h;

    /* renamed from: i */
    public String f185634i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64734tp1)) {
            return false;
        }
        C64734tp1 tp12 = (C64734tp1) aVar;
        return C46238a.m51546a(this.BaseRequest, tp12.BaseRequest) && C46238a.m51546a(this.f185629d, tp12.f185629d) && C46238a.m51546a(this.f185630e, tp12.f185630e) && C46238a.m51546a(this.f185631f, tp12.f185631f) && C46238a.m51546a(this.f185632g, tp12.f185632g) && C46238a.m51546a(this.f185633h, tp12.f185633h) && C46238a.m51546a(this.f185634i, tp12.f185634i);
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
            String str = this.f185629d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f185630e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f185631f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f185632g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f185633h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f185634i;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str7 = this.f185629d;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f185630e;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f185631f;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f185632g;
            if (str10 != null) {
                i2 += C52418a.m58683j(5, str10);
            }
            String str11 = this.f185633h;
            if (str11 != null) {
                i2 += C52418a.m58683j(6, str11);
            }
            String str12 = this.f185634i;
            return str12 != null ? i2 + C52418a.m58683j(7, str12) : i2;
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
            C64734tp1 tp12 = objArr[1];
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
                        tp12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    tp12.f185629d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    tp12.f185630e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    tp12.f185631f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    tp12.f185632g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    tp12.f185633h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    tp12.f185634i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
