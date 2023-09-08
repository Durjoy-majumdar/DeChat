package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hk0 */
public class C49715hk0 extends C101820nt3 {

    /* renamed from: d */
    public String f134694d;

    /* renamed from: e */
    public int f134695e;

    /* renamed from: f */
    public LinkedList<C48978cb0> f134696f = new LinkedList<>();

    /* renamed from: g */
    public C49842ig0 f134697g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49715hk0)) {
            return false;
        }
        C49715hk0 hk02 = (C49715hk0) aVar;
        return C46238a.m51546a(this.BaseRequest, hk02.BaseRequest) && C46238a.m51546a(this.f134694d, hk02.f134694d) && C46238a.m51546a(Integer.valueOf(this.f134695e), Integer.valueOf(hk02.f134695e)) && C46238a.m51546a(this.f134696f, hk02.f134696f) && C46238a.m51546a(this.f134697g, hk02.f134697g);
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
            String str = this.f134694d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f134695e);
            aVar.mo74320g(4, 8, this.f134696f);
            C49842ig0 ig02 = this.f134697g;
            if (ig02 != null) {
                aVar.mo74322i(5, ig02.computeSize());
                this.f134697g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f134694d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            int e = i2 + C52418a.m58678e(3, this.f134695e) + C52418a.m58680g(4, 8, this.f134696f);
            C49842ig0 ig03 = this.f134697g;
            return ig03 != null ? e + C52418a.m58682i(5, ig03.computeSize()) : e;
        } else if (i == 2) {
            this.f134696f.clear();
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
            C49715hk0 hk02 = objArr[1];
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
                    hk02.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                hk02.f134694d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                hk02.f134695e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48978cb0 cb02 = new C48978cb0();
                    if (bArr2 != null && bArr2.length > 0) {
                        cb02.parseFrom(bArr2);
                    }
                    hk02.f134696f.add(cb02);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49842ig0 ig04 = new C49842ig0();
                    if (bArr3 != null && bArr3.length > 0) {
                        ig04.parseFrom(bArr3);
                    }
                    hk02.f134697g = ig04;
                }
                return 0;
            }
        }
    }
}
