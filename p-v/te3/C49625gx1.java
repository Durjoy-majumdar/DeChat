package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gx1 */
public class C49625gx1 extends C101820nt3 {

    /* renamed from: d */
    public double f134341d;

    /* renamed from: e */
    public double f134342e;

    /* renamed from: f */
    public String f134343f;

    /* renamed from: g */
    public String f134344g;

    /* renamed from: h */
    public String f134345h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49625gx1)) {
            return false;
        }
        C49625gx1 gx12 = (C49625gx1) aVar;
        return C46238a.m51546a(this.BaseRequest, gx12.BaseRequest) && C46238a.m51546a(Double.valueOf(this.f134341d), Double.valueOf(gx12.f134341d)) && C46238a.m51546a(Double.valueOf(this.f134342e), Double.valueOf(gx12.f134342e)) && C46238a.m51546a(this.f134343f, gx12.f134343f) && C46238a.m51546a(this.f134344g, gx12.f134344g) && C46238a.m51546a(this.f134345h, gx12.f134345h);
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
            aVar.mo74316c(2, this.f134341d);
            aVar.mo74316c(3, this.f134342e);
            String str = this.f134343f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f134344g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f134345h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int c = i2 + C52418a.m58676c(2, this.f134341d) + C52418a.m58676c(3, this.f134342e);
            String str4 = this.f134343f;
            if (str4 != null) {
                c += C52418a.m58683j(4, str4);
            }
            String str5 = this.f134344g;
            if (str5 != null) {
                c += C52418a.m58683j(5, str5);
            }
            String str6 = this.f134345h;
            return str6 != null ? c + C52418a.m58683j(6, str6) : c;
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
            C49625gx1 gx12 = objArr[1];
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
                        gx12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    gx12.f134341d = aVar3.mo141627e(intValue);
                    return 0;
                case 3:
                    gx12.f134342e = aVar3.mo141627e(intValue);
                    return 0;
                case 4:
                    gx12.f134343f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    gx12.f134344g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    gx12.f134345h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
