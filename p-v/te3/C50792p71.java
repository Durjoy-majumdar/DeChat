package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p71 */
public class C50792p71 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f139616d;

    /* renamed from: e */
    public String f139617e;

    /* renamed from: f */
    public String f139618f;

    /* renamed from: g */
    public C89349b f139619g;

    /* renamed from: h */
    public long f139620h;

    /* renamed from: i */
    public long f139621i;

    /* renamed from: j */
    public String f139622j;

    /* renamed from: n */
    public int f139623n;

    /* renamed from: o */
    public int f139624o;

    /* renamed from: p */
    public int f139625p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50792p71)) {
            return false;
        }
        C50792p71 p712 = (C50792p71) aVar;
        return C46238a.m51546a(this.BaseRequest, p712.BaseRequest) && C46238a.m51546a(this.f139616d, p712.f139616d) && C46238a.m51546a(this.f139617e, p712.f139617e) && C46238a.m51546a(this.f139618f, p712.f139618f) && C46238a.m51546a(this.f139619g, p712.f139619g) && C46238a.m51546a(Long.valueOf(this.f139620h), Long.valueOf(p712.f139620h)) && C46238a.m51546a(Long.valueOf(this.f139621i), Long.valueOf(p712.f139621i)) && C46238a.m51546a(this.f139622j, p712.f139622j) && C46238a.m51546a(Integer.valueOf(this.f139623n), Integer.valueOf(p712.f139623n)) && C46238a.m51546a(Integer.valueOf(this.f139624o), Integer.valueOf(p712.f139624o)) && C46238a.m51546a(Integer.valueOf(this.f139625p), Integer.valueOf(p712.f139625p));
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
            C49842ig0 ig02 = this.f139616d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f139616d.writeFields(aVar);
            }
            String str = this.f139617e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f139618f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            C89349b bVar = this.f139619g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            aVar.mo74321h(6, this.f139620h);
            aVar.mo74321h(7, this.f139621i);
            String str3 = this.f139622j;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            aVar.mo74318e(9, this.f139623n);
            aVar.mo74318e(10, this.f139624o);
            aVar.mo74318e(11, this.f139625p);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f139616d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str4 = this.f139617e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            String str5 = this.f139618f;
            if (str5 != null) {
                i2 += C52418a.m58683j(4, str5);
            }
            C89349b bVar2 = this.f139619g;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(5, bVar2);
            }
            int h = i2 + C52418a.m58681h(6, this.f139620h) + C52418a.m58681h(7, this.f139621i);
            String str6 = this.f139622j;
            if (str6 != null) {
                h += C52418a.m58683j(8, str6);
            }
            return h + C52418a.m58678e(9, this.f139623n) + C52418a.m58678e(10, this.f139624o) + C52418a.m58678e(11, this.f139625p);
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
            C50792p71 p712 = objArr[1];
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
                        p712.BaseRequest = iaVar3;
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
                        p712.f139616d = ig04;
                    }
                    return 0;
                case 3:
                    p712.f139617e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    p712.f139618f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    p712.f139619g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    p712.f139620h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    p712.f139621i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    p712.f139622j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    p712.f139623n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    p712.f139624o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    p712.f139625p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
