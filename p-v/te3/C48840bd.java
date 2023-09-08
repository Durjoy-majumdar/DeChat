package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bd */
public class C48840bd extends C101820nt3 {

    /* renamed from: d */
    public int f131047d;

    /* renamed from: e */
    public int f131048e;

    /* renamed from: f */
    public String f131049f;

    /* renamed from: g */
    public String f131050g;

    /* renamed from: h */
    public String f131051h;

    /* renamed from: i */
    public String f131052i;

    /* renamed from: j */
    public String f131053j;

    /* renamed from: n */
    public String f131054n;

    /* renamed from: o */
    public String f131055o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48840bd)) {
            return false;
        }
        C48840bd bdVar = (C48840bd) aVar;
        return C46238a.m51546a(this.BaseRequest, bdVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f131047d), Integer.valueOf(bdVar.f131047d)) && C46238a.m51546a(Integer.valueOf(this.f131048e), Integer.valueOf(bdVar.f131048e)) && C46238a.m51546a(this.f131049f, bdVar.f131049f) && C46238a.m51546a(this.f131050g, bdVar.f131050g) && C46238a.m51546a(this.f131051h, bdVar.f131051h) && C46238a.m51546a(this.f131052i, bdVar.f131052i) && C46238a.m51546a(this.f131053j, bdVar.f131053j) && C46238a.m51546a(this.f131054n, bdVar.f131054n) && C46238a.m51546a(this.f131055o, bdVar.f131055o);
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
            aVar.mo74318e(2, this.f131047d);
            aVar.mo74318e(3, this.f131048e);
            String str = this.f131049f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f131050g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f131051h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f131052i;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f131053j;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f131054n;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            String str7 = this.f131055o;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f131047d) + C52418a.m58678e(3, this.f131048e);
            String str8 = this.f131049f;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f131050g;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            String str10 = this.f131051h;
            if (str10 != null) {
                e += C52418a.m58683j(6, str10);
            }
            String str11 = this.f131052i;
            if (str11 != null) {
                e += C52418a.m58683j(7, str11);
            }
            String str12 = this.f131053j;
            if (str12 != null) {
                e += C52418a.m58683j(8, str12);
            }
            String str13 = this.f131054n;
            if (str13 != null) {
                e += C52418a.m58683j(9, str13);
            }
            String str14 = this.f131055o;
            return str14 != null ? e + C52418a.m58683j(10, str14) : e;
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
            C48840bd bdVar = objArr[1];
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
                        bdVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    bdVar.f131047d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    bdVar.f131048e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    bdVar.f131049f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    bdVar.f131050g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    bdVar.f131051h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    bdVar.f131052i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    bdVar.f131053j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    bdVar.f131054n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    bdVar.f131055o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
