package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z61 */
public class C64872z61 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f186630d;

    /* renamed from: e */
    public C89349b f186631e;

    /* renamed from: f */
    public long f186632f;

    /* renamed from: g */
    public long f186633g;

    /* renamed from: h */
    public String f186634h;

    /* renamed from: i */
    public int f186635i;

    /* renamed from: j */
    public String f186636j;

    /* renamed from: n */
    public String f186637n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64872z61)) {
            return false;
        }
        C64872z61 z612 = (C64872z61) aVar;
        return C46238a.m51546a(this.BaseRequest, z612.BaseRequest) && C46238a.m51546a(this.f186630d, z612.f186630d) && C46238a.m51546a(this.f186631e, z612.f186631e) && C46238a.m51546a(Long.valueOf(this.f186632f), Long.valueOf(z612.f186632f)) && C46238a.m51546a(Long.valueOf(this.f186633g), Long.valueOf(z612.f186633g)) && C46238a.m51546a(this.f186634h, z612.f186634h) && C46238a.m51546a(Integer.valueOf(this.f186635i), Integer.valueOf(z612.f186635i)) && C46238a.m51546a(this.f186636j, z612.f186636j) && C46238a.m51546a(this.f186637n, z612.f186637n);
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
            C49842ig0 ig02 = this.f186630d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f186630d.writeFields(aVar);
            }
            C89349b bVar = this.f186631e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74321h(5, this.f186632f);
            aVar.mo74321h(6, this.f186633g);
            String str = this.f186634h;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            aVar.mo74318e(8, this.f186635i);
            String str2 = this.f186636j;
            if (str2 != null) {
                aVar.mo74323j(9, str2);
            }
            String str3 = this.f186637n;
            if (str3 != null) {
                aVar.mo74323j(10, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f186630d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar2 = this.f186631e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            int h = i2 + C52418a.m58681h(5, this.f186632f) + C52418a.m58681h(6, this.f186633g);
            String str4 = this.f186634h;
            if (str4 != null) {
                h += C52418a.m58683j(7, str4);
            }
            int e = h + C52418a.m58678e(8, this.f186635i);
            String str5 = this.f186636j;
            if (str5 != null) {
                e += C52418a.m58683j(9, str5);
            }
            String str6 = this.f186637n;
            return str6 != null ? e + C52418a.m58683j(10, str6) : e;
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
            C64872z61 z612 = objArr[1];
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
                        z612.BaseRequest = iaVar3;
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
                        z612.f186630d = ig04;
                    }
                    return 0;
                case 3:
                    z612.f186631e = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    z612.f186632f = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    z612.f186633g = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    z612.f186634h = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    z612.f186635i = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    z612.f186636j = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    z612.f186637n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
