package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bo2 */
public class C48886bo2 extends C101820nt3 {

    /* renamed from: d */
    public int f131235d;

    /* renamed from: e */
    public LinkedList<C52249zd2> f131236e = new LinkedList<>();

    /* renamed from: f */
    public int f131237f;

    /* renamed from: g */
    public int f131238g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48886bo2)) {
            return false;
        }
        C48886bo2 bo22 = (C48886bo2) aVar;
        return C46238a.m51546a(this.BaseRequest, bo22.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f131235d), Integer.valueOf(bo22.f131235d)) && C46238a.m51546a(this.f131236e, bo22.f131236e) && C46238a.m51546a(Integer.valueOf(this.f131237f), Integer.valueOf(bo22.f131237f)) && C46238a.m51546a(Integer.valueOf(this.f131238g), Integer.valueOf(bo22.f131238g));
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
            aVar.mo74318e(2, this.f131235d);
            aVar.mo74320g(3, 8, this.f131236e);
            aVar.mo74318e(4, this.f131237f);
            aVar.mo74318e(5, this.f131238g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f131235d) + C52418a.m58680g(3, 8, this.f131236e) + C52418a.m58678e(4, this.f131237f) + C52418a.m58678e(5, this.f131238g);
        } else if (i == 2) {
            this.f131236e.clear();
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
            C48886bo2 bo22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    bo22.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                bo22.f131235d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52249zd2 zd22 = new C52249zd2();
                    if (bArr2 != null && bArr2.length > 0) {
                        zd22.parseFrom(bArr2);
                    }
                    bo22.f131236e.add(zd22);
                }
                return 0;
            } else if (intValue == 4) {
                bo22.f131237f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                bo22.f131238g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
