package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bs3 */
public class C48901bs3 extends C101820nt3 {

    /* renamed from: d */
    public String f131288d;

    /* renamed from: e */
    public String f131289e;

    /* renamed from: f */
    public int f131290f;

    /* renamed from: g */
    public String f131291g;

    /* renamed from: h */
    public String f131292h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48901bs3)) {
            return false;
        }
        C48901bs3 bs32 = (C48901bs3) aVar;
        return C46238a.m51546a(this.BaseRequest, bs32.BaseRequest) && C46238a.m51546a(this.f131288d, bs32.f131288d) && C46238a.m51546a(this.f131289e, bs32.f131289e) && C46238a.m51546a(Integer.valueOf(this.f131290f), Integer.valueOf(bs32.f131290f)) && C46238a.m51546a(this.f131291g, bs32.f131291g) && C46238a.m51546a(this.f131292h, bs32.f131292h);
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
            String str = this.f131288d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f131289e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f131290f);
            String str3 = this.f131291g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f131292h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f131288d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f131289e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            int e = i2 + C52418a.m58678e(4, this.f131290f);
            String str7 = this.f131291g;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            String str8 = this.f131292h;
            return str8 != null ? e + C52418a.m58683j(6, str8) : e;
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
            C48901bs3 bs32 = objArr[1];
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
                        bs32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    bs32.f131288d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    bs32.f131289e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    bs32.f131290f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    bs32.f131291g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    bs32.f131292h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
