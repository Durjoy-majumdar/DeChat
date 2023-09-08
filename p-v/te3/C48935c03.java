package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c03 */
public class C48935c03 extends C101820nt3 {

    /* renamed from: d */
    public int f131425d;

    /* renamed from: e */
    public String f131426e;

    /* renamed from: f */
    public String f131427f;

    /* renamed from: g */
    public String f131428g;

    /* renamed from: h */
    public long f131429h;

    /* renamed from: i */
    public int f131430i;

    /* renamed from: j */
    public String f131431j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48935c03)) {
            return false;
        }
        C48935c03 c032 = (C48935c03) aVar;
        return C46238a.m51546a(this.BaseRequest, c032.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f131425d), Integer.valueOf(c032.f131425d)) && C46238a.m51546a(this.f131426e, c032.f131426e) && C46238a.m51546a(this.f131427f, c032.f131427f) && C46238a.m51546a(this.f131428g, c032.f131428g) && C46238a.m51546a(Long.valueOf(this.f131429h), Long.valueOf(c032.f131429h)) && C46238a.m51546a(Integer.valueOf(this.f131430i), Integer.valueOf(c032.f131430i)) && C46238a.m51546a(this.f131431j, c032.f131431j);
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
            aVar.mo74318e(2, this.f131425d);
            String str = this.f131426e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f131427f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f131428g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74321h(6, this.f131429h);
            aVar.mo74318e(7, this.f131430i);
            String str4 = this.f131431j;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f131425d);
            String str5 = this.f131426e;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f131427f;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f131428g;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            int h = e + C52418a.m58681h(6, this.f131429h) + C52418a.m58678e(7, this.f131430i);
            String str8 = this.f131431j;
            return str8 != null ? h + C52418a.m58683j(8, str8) : h;
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
            C48935c03 c032 = objArr[1];
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
                        c032.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    c032.f131425d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    c032.f131426e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    c032.f131427f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    c032.f131428g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    c032.f131429h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    c032.f131430i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    c032.f131431j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
