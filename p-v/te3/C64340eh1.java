package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.eh1 */
public class C64340eh1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f182953d;

    /* renamed from: e */
    public long f182954e;

    /* renamed from: f */
    public long f182955f;

    /* renamed from: g */
    public long f182956g;

    /* renamed from: h */
    public String f182957h;

    /* renamed from: i */
    public long f182958i;

    /* renamed from: j */
    public int f182959j;

    /* renamed from: n */
    public String f182960n;

    /* renamed from: o */
    public String f182961o;

    /* renamed from: p */
    public long f182962p;

    /* renamed from: q */
    public int f182963q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64340eh1)) {
            return false;
        }
        C64340eh1 eh12 = (C64340eh1) aVar;
        return C46238a.m51546a(this.BaseRequest, eh12.BaseRequest) && C46238a.m51546a(this.f182953d, eh12.f182953d) && C46238a.m51546a(Long.valueOf(this.f182954e), Long.valueOf(eh12.f182954e)) && C46238a.m51546a(Long.valueOf(this.f182955f), Long.valueOf(eh12.f182955f)) && C46238a.m51546a(Long.valueOf(this.f182956g), Long.valueOf(eh12.f182956g)) && C46238a.m51546a(this.f182957h, eh12.f182957h) && C46238a.m51546a(Long.valueOf(this.f182958i), Long.valueOf(eh12.f182958i)) && C46238a.m51546a(Integer.valueOf(this.f182959j), Integer.valueOf(eh12.f182959j)) && C46238a.m51546a(this.f182960n, eh12.f182960n) && C46238a.m51546a(this.f182961o, eh12.f182961o) && C46238a.m51546a(Long.valueOf(this.f182962p), Long.valueOf(eh12.f182962p)) && C46238a.m51546a(Integer.valueOf(this.f182963q), Integer.valueOf(eh12.f182963q));
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
            C49842ig0 ig02 = this.f182953d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f182953d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f182954e);
            aVar.mo74321h(4, this.f182955f);
            aVar.mo74321h(5, this.f182956g);
            String str = this.f182957h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            aVar.mo74321h(7, this.f182958i);
            aVar.mo74318e(8, this.f182959j);
            String str2 = this.f182960n;
            if (str2 != null) {
                aVar.mo74323j(9, str2);
            }
            String str3 = this.f182961o;
            if (str3 != null) {
                aVar.mo74323j(10, str3);
            }
            aVar.mo74321h(11, this.f182962p);
            aVar.mo74318e(12, this.f182963q);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f182953d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f182954e) + C52418a.m58681h(4, this.f182955f) + C52418a.m58681h(5, this.f182956g);
            String str4 = this.f182957h;
            if (str4 != null) {
                h += C52418a.m58683j(6, str4);
            }
            int h2 = h + C52418a.m58681h(7, this.f182958i) + C52418a.m58678e(8, this.f182959j);
            String str5 = this.f182960n;
            if (str5 != null) {
                h2 += C52418a.m58683j(9, str5);
            }
            String str6 = this.f182961o;
            if (str6 != null) {
                h2 += C52418a.m58683j(10, str6);
            }
            return h2 + C52418a.m58681h(11, this.f182962p) + C52418a.m58678e(12, this.f182963q);
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
            C64340eh1 eh12 = objArr[1];
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
                        eh12.BaseRequest = iaVar3;
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
                        eh12.f182953d = ig04;
                    }
                    return 0;
                case 3:
                    eh12.f182954e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    eh12.f182955f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    eh12.f182956g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    eh12.f182957h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    eh12.f182958i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    eh12.f182959j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    eh12.f182960n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    eh12.f182961o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    eh12.f182962p = aVar3.mo141631i(intValue);
                    return 0;
                case 12:
                    eh12.f182963q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
