package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l20 */
public class C50204l20 extends C101820nt3 {

    /* renamed from: d */
    public int f137131d;

    /* renamed from: e */
    public LinkedList<C51632v20> f137132e = new LinkedList<>();

    /* renamed from: f */
    public String f137133f;

    /* renamed from: g */
    public int f137134g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50204l20)) {
            return false;
        }
        C50204l20 l202 = (C50204l20) aVar;
        return C46238a.m51546a(this.BaseRequest, l202.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f137131d), Integer.valueOf(l202.f137131d)) && C46238a.m51546a(this.f137132e, l202.f137132e) && C46238a.m51546a(this.f137133f, l202.f137133f) && C46238a.m51546a(Integer.valueOf(this.f137134g), Integer.valueOf(l202.f137134g));
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
            aVar.mo74318e(2, this.f137131d);
            aVar.mo74320g(3, 8, this.f137132e);
            String str = this.f137133f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74318e(5, this.f137134g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f137131d) + C52418a.m58680g(3, 8, this.f137132e);
            String str2 = this.f137133f;
            if (str2 != null) {
                e += C52418a.m58683j(4, str2);
            }
            return e + C52418a.m58678e(5, this.f137134g);
        } else if (i == 2) {
            this.f137132e.clear();
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
            C50204l20 l202 = objArr[1];
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
                    l202.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                l202.f137131d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51632v20 v202 = new C51632v20();
                    if (bArr2 != null && bArr2.length > 0) {
                        v202.parseFrom(bArr2);
                    }
                    l202.f137132e.add(v202);
                }
                return 0;
            } else if (intValue == 4) {
                l202.f137133f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                l202.f137134g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
