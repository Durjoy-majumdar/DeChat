package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bo1 */
public class C64263bo1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f182301d;

    /* renamed from: e */
    public long f182302e;

    /* renamed from: f */
    public String f182303f;

    /* renamed from: g */
    public String f182304g;

    /* renamed from: h */
    public String f182305h;

    /* renamed from: i */
    public long f182306i;

    /* renamed from: j */
    public int f182307j;

    /* renamed from: n */
    public int f182308n;

    /* renamed from: o */
    public C89349b f182309o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64263bo1)) {
            return false;
        }
        C64263bo1 bo12 = (C64263bo1) aVar;
        return C46238a.m51546a(this.BaseRequest, bo12.BaseRequest) && C46238a.m51546a(this.f182301d, bo12.f182301d) && C46238a.m51546a(Long.valueOf(this.f182302e), Long.valueOf(bo12.f182302e)) && C46238a.m51546a(this.f182303f, bo12.f182303f) && C46238a.m51546a(this.f182304g, bo12.f182304g) && C46238a.m51546a(this.f182305h, bo12.f182305h) && C46238a.m51546a(Long.valueOf(this.f182306i), Long.valueOf(bo12.f182306i)) && C46238a.m51546a(Integer.valueOf(this.f182307j), Integer.valueOf(bo12.f182307j)) && C46238a.m51546a(Integer.valueOf(this.f182308n), Integer.valueOf(bo12.f182308n)) && C46238a.m51546a(this.f182309o, bo12.f182309o);
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
            C49842ig0 ig02 = this.f182301d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f182301d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f182302e);
            String str = this.f182303f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f182304g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f182305h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74321h(7, this.f182306i);
            aVar.mo74318e(8, this.f182307j);
            aVar.mo74318e(9, this.f182308n);
            C89349b bVar = this.f182309o;
            if (bVar != null) {
                aVar.mo74315b(100, bVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f182301d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f182302e);
            String str4 = this.f182303f;
            if (str4 != null) {
                h += C52418a.m58683j(4, str4);
            }
            String str5 = this.f182304g;
            if (str5 != null) {
                h += C52418a.m58683j(5, str5);
            }
            String str6 = this.f182305h;
            if (str6 != null) {
                h += C52418a.m58683j(6, str6);
            }
            int h2 = h + C52418a.m58681h(7, this.f182306i) + C52418a.m58678e(8, this.f182307j) + C52418a.m58678e(9, this.f182308n);
            C89349b bVar2 = this.f182309o;
            return bVar2 != null ? h2 + C52418a.m58675b(100, bVar2) : h2;
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
            C64263bo1 bo12 = objArr[1];
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
                            bo12.BaseRequest = iaVar3;
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
                            bo12.f182301d = ig04;
                        }
                        return 0;
                    case 3:
                        bo12.f182302e = aVar3.mo141631i(intValue);
                        return 0;
                    case 4:
                        bo12.f182303f = aVar3.mo141633k(intValue);
                        return 0;
                    case 5:
                        bo12.f182304g = aVar3.mo141633k(intValue);
                        return 0;
                    case 6:
                        bo12.f182305h = aVar3.mo141633k(intValue);
                        return 0;
                    case 7:
                        bo12.f182306i = aVar3.mo141631i(intValue);
                        return 0;
                    case 8:
                        bo12.f182307j = aVar3.mo141629g(intValue);
                        return 0;
                    case 9:
                        bo12.f182308n = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                bo12.f182309o = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
