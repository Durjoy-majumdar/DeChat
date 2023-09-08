package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gs3 */
public class C49605gs3 extends C101820nt3 {

    /* renamed from: d */
    public double f134246d;

    /* renamed from: e */
    public double f134247e;

    /* renamed from: f */
    public int f134248f;

    /* renamed from: g */
    public String f134249g;

    /* renamed from: h */
    public String f134250h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49605gs3)) {
            return false;
        }
        C49605gs3 gs32 = (C49605gs3) aVar;
        return C46238a.m51546a(this.BaseRequest, gs32.BaseRequest) && C46238a.m51546a(Double.valueOf(this.f134246d), Double.valueOf(gs32.f134246d)) && C46238a.m51546a(Double.valueOf(this.f134247e), Double.valueOf(gs32.f134247e)) && C46238a.m51546a(Integer.valueOf(this.f134248f), Integer.valueOf(gs32.f134248f)) && C46238a.m51546a(this.f134249g, gs32.f134249g) && C46238a.m51546a(this.f134250h, gs32.f134250h);
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
            aVar.mo74316c(2, this.f134246d);
            aVar.mo74316c(3, this.f134247e);
            aVar.mo74318e(4, this.f134248f);
            String str = this.f134249g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f134250h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int c = i2 + C52418a.m58676c(2, this.f134246d) + C52418a.m58676c(3, this.f134247e) + C52418a.m58678e(4, this.f134248f);
            String str3 = this.f134249g;
            if (str3 != null) {
                c += C52418a.m58683j(5, str3);
            }
            String str4 = this.f134250h;
            return str4 != null ? c + C52418a.m58683j(6, str4) : c;
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
            C49605gs3 gs32 = objArr[1];
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
                        gs32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    gs32.f134246d = aVar3.mo141627e(intValue);
                    return 0;
                case 3:
                    gs32.f134247e = aVar3.mo141627e(intValue);
                    return 0;
                case 4:
                    gs32.f134248f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    gs32.f134249g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    gs32.f134250h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
