package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.g91 */
public class C49533g91 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f133934d;

    /* renamed from: e */
    public String f133935e;

    /* renamed from: f */
    public long f133936f;

    /* renamed from: g */
    public long f133937g;

    /* renamed from: h */
    public int f133938h;

    /* renamed from: i */
    public String f133939i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49533g91)) {
            return false;
        }
        C49533g91 g912 = (C49533g91) aVar;
        return C46238a.m51546a(this.BaseRequest, g912.BaseRequest) && C46238a.m51546a(this.f133934d, g912.f133934d) && C46238a.m51546a(this.f133935e, g912.f133935e) && C46238a.m51546a(Long.valueOf(this.f133936f), Long.valueOf(g912.f133936f)) && C46238a.m51546a(Long.valueOf(this.f133937g), Long.valueOf(g912.f133937g)) && C46238a.m51546a(Integer.valueOf(this.f133938h), Integer.valueOf(g912.f133938h)) && C46238a.m51546a(this.f133939i, g912.f133939i);
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
            C49842ig0 ig02 = this.f133934d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f133934d.writeFields(aVar);
            }
            String str = this.f133935e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f133936f);
            aVar.mo74321h(5, this.f133937g);
            aVar.mo74318e(6, this.f133938h);
            String str2 = this.f133939i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f133934d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str3 = this.f133935e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            int h = i2 + C52418a.m58681h(4, this.f133936f) + C52418a.m58681h(5, this.f133937g) + C52418a.m58678e(6, this.f133938h);
            String str4 = this.f133939i;
            return str4 != null ? h + C52418a.m58683j(7, str4) : h;
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
            C49533g91 g912 = objArr[1];
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
                        g912.BaseRequest = iaVar3;
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
                        g912.f133934d = ig04;
                    }
                    return 0;
                case 3:
                    g912.f133935e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    g912.f133936f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    g912.f133937g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    g912.f133938h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    g912.f133939i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
