package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.aa1 */
public class C64228aa1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f182046d;

    /* renamed from: e */
    public long f182047e;

    /* renamed from: f */
    public long f182048f;

    /* renamed from: g */
    public long f182049g;

    /* renamed from: h */
    public int f182050h;

    /* renamed from: i */
    public C89349b f182051i;

    /* renamed from: j */
    public String f182052j;

    /* renamed from: n */
    public long f182053n;

    /* renamed from: o */
    public String f182054o;

    /* renamed from: p */
    public String f182055p;

    /* renamed from: q */
    public int f182056q;

    /* renamed from: r */
    public String f182057r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64228aa1)) {
            return false;
        }
        C64228aa1 aa12 = (C64228aa1) aVar;
        return C46238a.m51546a(this.BaseRequest, aa12.BaseRequest) && C46238a.m51546a(this.f182046d, aa12.f182046d) && C46238a.m51546a(Long.valueOf(this.f182047e), Long.valueOf(aa12.f182047e)) && C46238a.m51546a(Long.valueOf(this.f182048f), Long.valueOf(aa12.f182048f)) && C46238a.m51546a(Long.valueOf(this.f182049g), Long.valueOf(aa12.f182049g)) && C46238a.m51546a(Integer.valueOf(this.f182050h), Integer.valueOf(aa12.f182050h)) && C46238a.m51546a(this.f182051i, aa12.f182051i) && C46238a.m51546a(this.f182052j, aa12.f182052j) && C46238a.m51546a(Long.valueOf(this.f182053n), Long.valueOf(aa12.f182053n)) && C46238a.m51546a(this.f182054o, aa12.f182054o) && C46238a.m51546a(this.f182055p, aa12.f182055p) && C46238a.m51546a(Integer.valueOf(this.f182056q), Integer.valueOf(aa12.f182056q)) && C46238a.m51546a(this.f182057r, aa12.f182057r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C49842ig0 ig02 = this.f182046d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f182046d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f182047e);
            aVar.mo74321h(4, this.f182048f);
            aVar.mo74321h(5, this.f182049g);
            aVar.mo74318e(6, this.f182050h);
            C89349b bVar = this.f182051i;
            if (bVar != null) {
                aVar.mo74315b(7, bVar);
            }
            String str = this.f182052j;
            if (str != null) {
                aVar.mo74323j(8, str);
            }
            aVar.mo74321h(9, this.f182053n);
            String str2 = this.f182054o;
            if (str2 != null) {
                aVar.mo74323j(10, str2);
            }
            String str3 = this.f182055p;
            if (str3 != null) {
                aVar.mo74323j(11, str3);
            }
            aVar.mo74318e(12, this.f182056q);
            String str4 = this.f182057r;
            if (str4 == null) {
                return 0;
            }
            aVar.mo74323j(13, str4);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            int i3 = iaVar2 != null ? 0 + C52418a.m58682i(1, iaVar2.computeSize()) : 0;
            C49842ig0 ig03 = this.f182046d;
            if (ig03 != null) {
                i3 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i3 + C52418a.m58681h(3, this.f182047e) + C52418a.m58681h(4, this.f182048f) + C52418a.m58681h(5, this.f182049g) + C52418a.m58678e(6, this.f182050h);
            C89349b bVar2 = this.f182051i;
            if (bVar2 != null) {
                h += C52418a.m58675b(7, bVar2);
            }
            String str5 = this.f182052j;
            if (str5 != null) {
                h += C52418a.m58683j(8, str5);
            }
            int h2 = h + C52418a.m58681h(9, this.f182053n);
            String str6 = this.f182054o;
            if (str6 != null) {
                h2 += C52418a.m58683j(10, str6);
            }
            String str7 = this.f182055p;
            if (str7 != null) {
                h2 += C52418a.m58683j(11, str7);
            }
            int e = h2 + C52418a.m58678e(12, this.f182056q);
            String str8 = this.f182057r;
            return str8 != null ? e + C52418a.m58683j(13, str8) : e;
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
            C64228aa1 aa12 = objArr[1];
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
                        aa12.BaseRequest = iaVar3;
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
                        aa12.f182046d = ig04;
                    }
                    return 0;
                case 3:
                    aa12.f182047e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    aa12.f182048f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    aa12.f182049g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    aa12.f182050h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    aa12.f182051i = aVar3.mo141626d(intValue);
                    return 0;
                case 8:
                    aa12.f182052j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    aa12.f182053n = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    aa12.f182054o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    aa12.f182055p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    aa12.f182056q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    aa12.f182057r = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
