package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n01 */
public class C50474n01 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f138304d;

    /* renamed from: e */
    public String f138305e;

    /* renamed from: f */
    public long f138306f;

    /* renamed from: g */
    public long f138307g;

    /* renamed from: h */
    public long f138308h;

    /* renamed from: i */
    public String f138309i;

    /* renamed from: j */
    public C89349b f138310j;

    /* renamed from: n */
    public String f138311n;

    /* renamed from: o */
    public C89349b f138312o;

    /* renamed from: p */
    public int f138313p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50474n01)) {
            return false;
        }
        C50474n01 n012 = (C50474n01) aVar;
        return C46238a.m51546a(this.BaseRequest, n012.BaseRequest) && C46238a.m51546a(this.f138304d, n012.f138304d) && C46238a.m51546a(this.f138305e, n012.f138305e) && C46238a.m51546a(Long.valueOf(this.f138306f), Long.valueOf(n012.f138306f)) && C46238a.m51546a(Long.valueOf(this.f138307g), Long.valueOf(n012.f138307g)) && C46238a.m51546a(Long.valueOf(this.f138308h), Long.valueOf(n012.f138308h)) && C46238a.m51546a(this.f138309i, n012.f138309i) && C46238a.m51546a(this.f138310j, n012.f138310j) && C46238a.m51546a(this.f138311n, n012.f138311n) && C46238a.m51546a(this.f138312o, n012.f138312o) && C46238a.m51546a(Integer.valueOf(this.f138313p), Integer.valueOf(n012.f138313p));
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
            C49842ig0 ig02 = this.f138304d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f138304d.writeFields(aVar);
            }
            String str = this.f138305e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f138306f);
            aVar.mo74321h(5, this.f138307g);
            aVar.mo74321h(6, this.f138308h);
            String str2 = this.f138309i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            C89349b bVar = this.f138310j;
            if (bVar != null) {
                aVar.mo74315b(8, bVar);
            }
            String str3 = this.f138311n;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            C89349b bVar2 = this.f138312o;
            if (bVar2 != null) {
                aVar.mo74315b(10, bVar2);
            }
            aVar.mo74318e(11, this.f138313p);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f138304d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str4 = this.f138305e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            int h = i2 + C52418a.m58681h(4, this.f138306f) + C52418a.m58681h(5, this.f138307g) + C52418a.m58681h(6, this.f138308h);
            String str5 = this.f138309i;
            if (str5 != null) {
                h += C52418a.m58683j(7, str5);
            }
            C89349b bVar3 = this.f138310j;
            if (bVar3 != null) {
                h += C52418a.m58675b(8, bVar3);
            }
            String str6 = this.f138311n;
            if (str6 != null) {
                h += C52418a.m58683j(9, str6);
            }
            C89349b bVar4 = this.f138312o;
            if (bVar4 != null) {
                h += C52418a.m58675b(10, bVar4);
            }
            return h + C52418a.m58678e(11, this.f138313p);
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
            C50474n01 n012 = objArr[1];
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
                        n012.BaseRequest = iaVar3;
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
                        n012.f138304d = ig04;
                    }
                    return 0;
                case 3:
                    n012.f138305e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    n012.f138306f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    n012.f138307g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    n012.f138308h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    n012.f138309i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    n012.f138310j = aVar3.mo141626d(intValue);
                    return 0;
                case 9:
                    n012.f138311n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    n012.f138312o = aVar3.mo141626d(intValue);
                    return 0;
                case 11:
                    n012.f138313p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
