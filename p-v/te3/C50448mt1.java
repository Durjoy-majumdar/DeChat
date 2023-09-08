package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mt1 */
public class C50448mt1 extends C101820nt3 {

    /* renamed from: d */
    public double f138196d;

    /* renamed from: e */
    public double f138197e;

    /* renamed from: f */
    public int f138198f;

    /* renamed from: g */
    public String f138199g;

    /* renamed from: h */
    public int f138200h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50448mt1)) {
            return false;
        }
        C50448mt1 mt12 = (C50448mt1) aVar;
        return C46238a.m51546a(this.BaseRequest, mt12.BaseRequest) && C46238a.m51546a(Double.valueOf(this.f138196d), Double.valueOf(mt12.f138196d)) && C46238a.m51546a(Double.valueOf(this.f138197e), Double.valueOf(mt12.f138197e)) && C46238a.m51546a(Integer.valueOf(this.f138198f), Integer.valueOf(mt12.f138198f)) && C46238a.m51546a(this.f138199g, mt12.f138199g) && C46238a.m51546a(Integer.valueOf(this.f138200h), Integer.valueOf(mt12.f138200h));
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
            aVar.mo74316c(2, this.f138196d);
            aVar.mo74316c(3, this.f138197e);
            aVar.mo74318e(4, this.f138198f);
            String str = this.f138199g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74318e(6, this.f138200h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int c = i2 + C52418a.m58676c(2, this.f138196d) + C52418a.m58676c(3, this.f138197e) + C52418a.m58678e(4, this.f138198f);
            String str2 = this.f138199g;
            if (str2 != null) {
                c += C52418a.m58683j(5, str2);
            }
            return c + C52418a.m58678e(6, this.f138200h);
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
            C50448mt1 mt12 = objArr[1];
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
                        mt12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    mt12.f138196d = aVar3.mo141627e(intValue);
                    return 0;
                case 3:
                    mt12.f138197e = aVar3.mo141627e(intValue);
                    return 0;
                case 4:
                    mt12.f138198f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    mt12.f138199g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    mt12.f138200h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
