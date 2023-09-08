package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rk0 */
public class C64681rk0 extends C101820nt3 {

    /* renamed from: d */
    public long f185171d;

    /* renamed from: e */
    public int f185172e;

    /* renamed from: f */
    public int f185173f;

    /* renamed from: g */
    public String f185174g;

    /* renamed from: h */
    public C49842ig0 f185175h;

    /* renamed from: i */
    public String f185176i;

    /* renamed from: j */
    public int f185177j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64681rk0)) {
            return false;
        }
        C64681rk0 rk02 = (C64681rk0) aVar;
        return C46238a.m51546a(this.BaseRequest, rk02.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f185171d), Long.valueOf(rk02.f185171d)) && C46238a.m51546a(Integer.valueOf(this.f185172e), Integer.valueOf(rk02.f185172e)) && C46238a.m51546a(Integer.valueOf(this.f185173f), Integer.valueOf(rk02.f185173f)) && C46238a.m51546a(this.f185174g, rk02.f185174g) && C46238a.m51546a(this.f185175h, rk02.f185175h) && C46238a.m51546a(this.f185176i, rk02.f185176i) && C46238a.m51546a(Integer.valueOf(this.f185177j), Integer.valueOf(rk02.f185177j));
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
            aVar.mo74321h(2, this.f185171d);
            aVar.mo74318e(3, this.f185172e);
            aVar.mo74318e(4, this.f185173f);
            String str = this.f185174g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            C49842ig0 ig02 = this.f185175h;
            if (ig02 != null) {
                aVar.mo74322i(6, ig02.computeSize());
                this.f185175h.writeFields(aVar);
            }
            String str2 = this.f185176i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74318e(8, this.f185177j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f185171d) + C52418a.m58678e(3, this.f185172e) + C52418a.m58678e(4, this.f185173f);
            String str3 = this.f185174g;
            if (str3 != null) {
                h += C52418a.m58683j(5, str3);
            }
            C49842ig0 ig03 = this.f185175h;
            if (ig03 != null) {
                h += C52418a.m58682i(6, ig03.computeSize());
            }
            String str4 = this.f185176i;
            if (str4 != null) {
                h += C52418a.m58683j(7, str4);
            }
            return h + C52418a.m58678e(8, this.f185177j);
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
            C64681rk0 rk02 = objArr[1];
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
                        rk02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    rk02.f185171d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    rk02.f185172e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    rk02.f185173f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    rk02.f185174g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        rk02.f185175h = ig04;
                    }
                    return 0;
                case 7:
                    rk02.f185176i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    rk02.f185177j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
