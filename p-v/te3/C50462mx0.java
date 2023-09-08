package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mx0 */
public class C50462mx0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f138260d;

    /* renamed from: e */
    public long f138261e;

    /* renamed from: f */
    public long f138262f;

    /* renamed from: g */
    public String f138263g;

    /* renamed from: h */
    public C51079ra1 f138264h;

    /* renamed from: i */
    public int f138265i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50462mx0)) {
            return false;
        }
        C50462mx0 mx02 = (C50462mx0) aVar;
        return C46238a.m51546a(this.BaseRequest, mx02.BaseRequest) && C46238a.m51546a(this.f138260d, mx02.f138260d) && C46238a.m51546a(Long.valueOf(this.f138261e), Long.valueOf(mx02.f138261e)) && C46238a.m51546a(Long.valueOf(this.f138262f), Long.valueOf(mx02.f138262f)) && C46238a.m51546a(this.f138263g, mx02.f138263g) && C46238a.m51546a(this.f138264h, mx02.f138264h) && C46238a.m51546a(Integer.valueOf(this.f138265i), Integer.valueOf(mx02.f138265i));
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
            C49842ig0 ig02 = this.f138260d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f138260d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f138261e);
            aVar.mo74321h(4, this.f138262f);
            String str = this.f138263g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            C51079ra1 ra12 = this.f138264h;
            if (ra12 != null) {
                aVar.mo74322i(6, ra12.computeSize());
                this.f138264h.writeFields(aVar);
            }
            aVar.mo74318e(7, this.f138265i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f138260d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f138261e) + C52418a.m58681h(4, this.f138262f);
            String str2 = this.f138263g;
            if (str2 != null) {
                h += C52418a.m58683j(5, str2);
            }
            C51079ra1 ra13 = this.f138264h;
            if (ra13 != null) {
                h += C52418a.m58682i(6, ra13.computeSize());
            }
            return h + C52418a.m58678e(7, this.f138265i);
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
            C50462mx0 mx02 = objArr[1];
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
                        mx02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        mx02.f138260d = ig04;
                    }
                    return 0;
                case 3:
                    mx02.f138261e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    mx02.f138262f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    mx02.f138263g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51079ra1 ra14 = new C51079ra1();
                        if (bArr3 != null && bArr3.length > 0) {
                            ra14.parseFrom(bArr3);
                        }
                        mx02.f138264h = ra14;
                    }
                    return 0;
                case 7:
                    mx02.f138265i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
