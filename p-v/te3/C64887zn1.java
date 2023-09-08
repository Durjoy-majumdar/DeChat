package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zn1 */
public class C64887zn1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f186745d;

    /* renamed from: e */
    public String f186746e;

    /* renamed from: f */
    public String f186747f;

    /* renamed from: g */
    public long f186748g;

    /* renamed from: h */
    public long f186749h;

    /* renamed from: i */
    public long f186750i;

    /* renamed from: j */
    public long f186751j;

    /* renamed from: n */
    public int f186752n;

    /* renamed from: o */
    public int f186753o;

    /* renamed from: p */
    public int f186754p;

    /* renamed from: q */
    public C89349b f186755q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64887zn1)) {
            return false;
        }
        C64887zn1 zn12 = (C64887zn1) aVar;
        return C46238a.m51546a(this.BaseRequest, zn12.BaseRequest) && C46238a.m51546a(this.f186745d, zn12.f186745d) && C46238a.m51546a(this.f186746e, zn12.f186746e) && C46238a.m51546a(this.f186747f, zn12.f186747f) && C46238a.m51546a(Long.valueOf(this.f186748g), Long.valueOf(zn12.f186748g)) && C46238a.m51546a(Long.valueOf(this.f186749h), Long.valueOf(zn12.f186749h)) && C46238a.m51546a(Long.valueOf(this.f186750i), Long.valueOf(zn12.f186750i)) && C46238a.m51546a(Long.valueOf(this.f186751j), Long.valueOf(zn12.f186751j)) && C46238a.m51546a(Integer.valueOf(this.f186752n), Integer.valueOf(zn12.f186752n)) && C46238a.m51546a(Integer.valueOf(this.f186753o), Integer.valueOf(zn12.f186753o)) && C46238a.m51546a(Integer.valueOf(this.f186754p), Integer.valueOf(zn12.f186754p)) && C46238a.m51546a(this.f186755q, zn12.f186755q);
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
            C49842ig0 ig02 = this.f186745d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f186745d.writeFields(aVar);
            }
            String str = this.f186746e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f186747f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74321h(5, this.f186748g);
            aVar.mo74321h(6, this.f186749h);
            aVar.mo74321h(7, this.f186750i);
            aVar.mo74321h(8, this.f186751j);
            aVar.mo74318e(9, this.f186752n);
            aVar.mo74318e(10, this.f186753o);
            aVar.mo74318e(11, this.f186754p);
            C89349b bVar = this.f186755q;
            if (bVar != null) {
                aVar.mo74315b(100, bVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f186745d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str3 = this.f186746e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            String str4 = this.f186747f;
            if (str4 != null) {
                i2 += C52418a.m58683j(4, str4);
            }
            int h = i2 + C52418a.m58681h(5, this.f186748g) + C52418a.m58681h(6, this.f186749h) + C52418a.m58681h(7, this.f186750i) + C52418a.m58681h(8, this.f186751j) + C52418a.m58678e(9, this.f186752n) + C52418a.m58678e(10, this.f186753o) + C52418a.m58678e(11, this.f186754p);
            C89349b bVar2 = this.f186755q;
            return bVar2 != null ? h + C52418a.m58675b(100, bVar2) : h;
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
            C64887zn1 zn12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 100) {
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
                            zn12.BaseRequest = iaVar3;
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
                            zn12.f186745d = ig04;
                        }
                        return 0;
                    case 3:
                        zn12.f186746e = aVar3.mo141633k(intValue);
                        return 0;
                    case 4:
                        zn12.f186747f = aVar3.mo141633k(intValue);
                        return 0;
                    case 5:
                        zn12.f186748g = aVar3.mo141631i(intValue);
                        return 0;
                    case 6:
                        zn12.f186749h = aVar3.mo141631i(intValue);
                        return 0;
                    case 7:
                        zn12.f186750i = aVar3.mo141631i(intValue);
                        return 0;
                    case 8:
                        zn12.f186751j = aVar3.mo141631i(intValue);
                        return 0;
                    case 9:
                        zn12.f186752n = aVar3.mo141629g(intValue);
                        return 0;
                    case 10:
                        zn12.f186753o = aVar3.mo141629g(intValue);
                        return 0;
                    case 11:
                        zn12.f186754p = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                zn12.f186755q = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
