package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t53 */
public class C51347t53 extends C101820nt3 {

    /* renamed from: d */
    public int f141968d;

    /* renamed from: e */
    public int f141969e;

    /* renamed from: f */
    public String f141970f;

    /* renamed from: g */
    public String f141971g;

    /* renamed from: h */
    public long f141972h;

    /* renamed from: i */
    public String f141973i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51347t53)) {
            return false;
        }
        C51347t53 t532 = (C51347t53) aVar;
        return C46238a.m51546a(this.BaseRequest, t532.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f141968d), Integer.valueOf(t532.f141968d)) && C46238a.m51546a(Integer.valueOf(this.f141969e), Integer.valueOf(t532.f141969e)) && C46238a.m51546a(this.f141970f, t532.f141970f) && C46238a.m51546a(this.f141971g, t532.f141971g) && C46238a.m51546a(Long.valueOf(this.f141972h), Long.valueOf(t532.f141972h)) && C46238a.m51546a(this.f141973i, t532.f141973i);
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
            aVar.mo74318e(2, this.f141968d);
            aVar.mo74318e(3, this.f141969e);
            String str = this.f141970f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f141971g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74321h(6, this.f141972h);
            String str3 = this.f141973i;
            if (str3 != null) {
                aVar.mo74323j(100, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f141968d) + C52418a.m58678e(3, this.f141969e);
            String str4 = this.f141970f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            String str5 = this.f141971g;
            if (str5 != null) {
                e += C52418a.m58683j(5, str5);
            }
            int h = e + C52418a.m58681h(6, this.f141972h);
            String str6 = this.f141973i;
            return str6 != null ? h + C52418a.m58683j(100, str6) : h;
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
            C51347t53 t532 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 100) {
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
                            t532.BaseRequest = iaVar3;
                        }
                        return 0;
                    case 2:
                        t532.f141968d = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        t532.f141969e = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        t532.f141970f = aVar3.mo141633k(intValue);
                        return 0;
                    case 5:
                        t532.f141971g = aVar3.mo141633k(intValue);
                        return 0;
                    case 6:
                        t532.f141972h = aVar3.mo141631i(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                t532.f141973i = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
