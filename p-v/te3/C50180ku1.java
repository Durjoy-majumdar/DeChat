package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ku1 */
public class C50180ku1 extends C101820nt3 {

    /* renamed from: d */
    public double f137042d;

    /* renamed from: e */
    public double f137043e;

    /* renamed from: f */
    public int f137044f;

    /* renamed from: g */
    public String f137045g;

    /* renamed from: h */
    public int f137046h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50180ku1)) {
            return false;
        }
        C50180ku1 ku12 = (C50180ku1) aVar;
        return C46238a.m51546a(this.BaseRequest, ku12.BaseRequest) && C46238a.m51546a(Double.valueOf(this.f137042d), Double.valueOf(ku12.f137042d)) && C46238a.m51546a(Double.valueOf(this.f137043e), Double.valueOf(ku12.f137043e)) && C46238a.m51546a(Integer.valueOf(this.f137044f), Integer.valueOf(ku12.f137044f)) && C46238a.m51546a(this.f137045g, ku12.f137045g) && C46238a.m51546a(Integer.valueOf(this.f137046h), Integer.valueOf(ku12.f137046h));
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
            aVar.mo74316c(2, this.f137042d);
            aVar.mo74316c(3, this.f137043e);
            aVar.mo74318e(4, this.f137044f);
            String str = this.f137045g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74318e(6, this.f137046h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int c = i2 + C52418a.m58676c(2, this.f137042d) + C52418a.m58676c(3, this.f137043e) + C52418a.m58678e(4, this.f137044f);
            String str2 = this.f137045g;
            if (str2 != null) {
                c += C52418a.m58683j(5, str2);
            }
            return c + C52418a.m58678e(6, this.f137046h);
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
            C50180ku1 ku12 = objArr[1];
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
                        ku12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    ku12.f137042d = aVar3.mo141627e(intValue);
                    return 0;
                case 3:
                    ku12.f137043e = aVar3.mo141627e(intValue);
                    return 0;
                case 4:
                    ku12.f137044f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ku12.f137045g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ku12.f137046h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
