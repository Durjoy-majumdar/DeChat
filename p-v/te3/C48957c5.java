package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c5 */
public class C48957c5 extends C101820nt3 {

    /* renamed from: d */
    public String f131512d;

    /* renamed from: e */
    public String f131513e;

    /* renamed from: f */
    public String f131514f;

    /* renamed from: g */
    public String f131515g;

    /* renamed from: h */
    public String f131516h;

    /* renamed from: i */
    public String f131517i;

    /* renamed from: j */
    public int f131518j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48957c5)) {
            return false;
        }
        C48957c5 c5Var = (C48957c5) aVar;
        return C46238a.m51546a(this.BaseRequest, c5Var.BaseRequest) && C46238a.m51546a(this.f131512d, c5Var.f131512d) && C46238a.m51546a(this.f131513e, c5Var.f131513e) && C46238a.m51546a(this.f131514f, c5Var.f131514f) && C46238a.m51546a(this.f131515g, c5Var.f131515g) && C46238a.m51546a(this.f131516h, c5Var.f131516h) && C46238a.m51546a(this.f131517i, c5Var.f131517i) && C46238a.m51546a(Integer.valueOf(this.f131518j), Integer.valueOf(c5Var.f131518j));
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
            String str = this.f131512d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f131513e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f131514f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f131515g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f131516h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f131517i;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            aVar.mo74318e(8, this.f131518j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str7 = this.f131512d;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f131513e;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f131514f;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f131515g;
            if (str10 != null) {
                i2 += C52418a.m58683j(5, str10);
            }
            String str11 = this.f131516h;
            if (str11 != null) {
                i2 += C52418a.m58683j(6, str11);
            }
            String str12 = this.f131517i;
            if (str12 != null) {
                i2 += C52418a.m58683j(7, str12);
            }
            return i2 + C52418a.m58678e(8, this.f131518j);
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
            C48957c5 c5Var = objArr[1];
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
                        c5Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    c5Var.f131512d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    c5Var.f131513e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    c5Var.f131514f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    c5Var.f131515g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    c5Var.f131516h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    c5Var.f131517i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    c5Var.f131518j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
