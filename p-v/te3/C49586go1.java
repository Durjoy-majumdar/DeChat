package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.go1 */
public class C49586go1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f134168d;

    /* renamed from: e */
    public String f134169e;

    /* renamed from: f */
    public int f134170f;

    /* renamed from: g */
    public long f134171g;

    /* renamed from: h */
    public long f134172h;

    /* renamed from: i */
    public long f134173i;

    /* renamed from: j */
    public String f134174j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49586go1)) {
            return false;
        }
        C49586go1 go12 = (C49586go1) aVar;
        return C46238a.m51546a(this.BaseRequest, go12.BaseRequest) && C46238a.m51546a(this.f134168d, go12.f134168d) && C46238a.m51546a(this.f134169e, go12.f134169e) && C46238a.m51546a(Integer.valueOf(this.f134170f), Integer.valueOf(go12.f134170f)) && C46238a.m51546a(Long.valueOf(this.f134171g), Long.valueOf(go12.f134171g)) && C46238a.m51546a(Long.valueOf(this.f134172h), Long.valueOf(go12.f134172h)) && C46238a.m51546a(Long.valueOf(this.f134173i), Long.valueOf(go12.f134173i)) && C46238a.m51546a(this.f134174j, go12.f134174j);
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
            C49842ig0 ig02 = this.f134168d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f134168d.writeFields(aVar);
            }
            String str = this.f134169e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f134170f);
            aVar.mo74321h(5, this.f134171g);
            aVar.mo74321h(6, this.f134172h);
            aVar.mo74321h(7, this.f134173i);
            String str2 = this.f134174j;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f134168d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str3 = this.f134169e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            int e = i2 + C52418a.m58678e(4, this.f134170f) + C52418a.m58681h(5, this.f134171g) + C52418a.m58681h(6, this.f134172h) + C52418a.m58681h(7, this.f134173i);
            String str4 = this.f134174j;
            return str4 != null ? e + C52418a.m58683j(8, str4) : e;
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
            C49586go1 go12 = objArr[1];
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
                        go12.BaseRequest = iaVar3;
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
                        go12.f134168d = ig04;
                    }
                    return 0;
                case 3:
                    go12.f134169e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    go12.f134170f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    go12.f134171g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    go12.f134172h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    go12.f134173i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    go12.f134174j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
