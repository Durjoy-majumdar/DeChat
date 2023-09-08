package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.or0 */
public class C64616or0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f184704d;

    /* renamed from: e */
    public long f184705e;

    /* renamed from: f */
    public long f184706f;

    /* renamed from: g */
    public C89349b f184707g;

    /* renamed from: h */
    public long f184708h;

    /* renamed from: i */
    public long f184709i;

    /* renamed from: j */
    public int f184710j;

    /* renamed from: n */
    public String f184711n;

    /* renamed from: o */
    public int f184712o;

    /* renamed from: p */
    public int f184713p;

    /* renamed from: q */
    public String f184714q;

    /* renamed from: r */
    public String f184715r;

    /* renamed from: s */
    public C64414h71 f184716s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64616or0)) {
            return false;
        }
        C64616or0 or02 = (C64616or0) aVar;
        return C46238a.m51546a(this.BaseRequest, or02.BaseRequest) && C46238a.m51546a(this.f184704d, or02.f184704d) && C46238a.m51546a(Long.valueOf(this.f184705e), Long.valueOf(or02.f184705e)) && C46238a.m51546a(Long.valueOf(this.f184706f), Long.valueOf(or02.f184706f)) && C46238a.m51546a(this.f184707g, or02.f184707g) && C46238a.m51546a(Long.valueOf(this.f184708h), Long.valueOf(or02.f184708h)) && C46238a.m51546a(Long.valueOf(this.f184709i), Long.valueOf(or02.f184709i)) && C46238a.m51546a(Integer.valueOf(this.f184710j), Integer.valueOf(or02.f184710j)) && C46238a.m51546a(this.f184711n, or02.f184711n) && C46238a.m51546a(Integer.valueOf(this.f184712o), Integer.valueOf(or02.f184712o)) && C46238a.m51546a(Integer.valueOf(this.f184713p), Integer.valueOf(or02.f184713p)) && C46238a.m51546a(this.f184714q, or02.f184714q) && C46238a.m51546a(this.f184715r, or02.f184715r) && C46238a.m51546a(this.f184716s, or02.f184716s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C49842ig0 ig02 = this.f184704d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f184704d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f184705e);
            aVar.mo74321h(4, this.f184706f);
            C89349b bVar = this.f184707g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            aVar.mo74321h(6, this.f184708h);
            aVar.mo74321h(7, this.f184709i);
            aVar.mo74318e(8, this.f184710j);
            String str = this.f184711n;
            if (str != null) {
                aVar.mo74323j(9, str);
            }
            aVar.mo74318e(10, this.f184712o);
            aVar.mo74318e(11, this.f184713p);
            String str2 = this.f184714q;
            if (str2 != null) {
                aVar.mo74323j(12, str2);
            }
            String str3 = this.f184715r;
            if (str3 != null) {
                aVar.mo74323j(13, str3);
            }
            C64414h71 h712 = this.f184716s;
            if (h712 != null) {
                aVar.mo74322i(14, h712.computeSize());
                this.f184716s.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            C49842ig0 ig03 = this.f184704d;
            if (ig03 != null) {
                i3 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i3 + C52418a.m58681h(3, this.f184705e) + C52418a.m58681h(4, this.f184706f);
            C89349b bVar2 = this.f184707g;
            if (bVar2 != null) {
                h += C52418a.m58675b(5, bVar2);
            }
            int h2 = h + C52418a.m58681h(6, this.f184708h) + C52418a.m58681h(7, this.f184709i) + C52418a.m58678e(8, this.f184710j);
            String str4 = this.f184711n;
            if (str4 != null) {
                h2 += C52418a.m58683j(9, str4);
            }
            int e = h2 + C52418a.m58678e(10, this.f184712o) + C52418a.m58678e(11, this.f184713p);
            String str5 = this.f184714q;
            if (str5 != null) {
                e += C52418a.m58683j(12, str5);
            }
            String str6 = this.f184715r;
            if (str6 != null) {
                e += C52418a.m58683j(13, str6);
            }
            C64414h71 h713 = this.f184716s;
            return h713 != null ? e + C52418a.m58682i(14, h713.computeSize()) : e;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64616or0 or02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        or02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        or02.f184704d = ig04;
                    }
                    return 0;
                case 3:
                    or02.f184705e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    or02.f184706f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    or02.f184707g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    or02.f184708h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    or02.f184709i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    or02.f184710j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    or02.f184711n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    or02.f184712o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    or02.f184713p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    or02.f184714q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    or02.f184715r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C64414h71 h714 = new C64414h71();
                        if (bArr3 != null && bArr3.length > 0) {
                            h714.parseFrom(bArr3);
                        }
                        or02.f184716s = h714;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
