package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jh1 */
public class C49992jh1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f136119d;

    /* renamed from: e */
    public C89349b f136120e;

    /* renamed from: f */
    public C52013xs0 f136121f;

    /* renamed from: g */
    public long f136122g;

    /* renamed from: h */
    public long f136123h;

    /* renamed from: i */
    public String f136124i;

    /* renamed from: j */
    public int f136125j;

    /* renamed from: n */
    public String f136126n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49992jh1)) {
            return false;
        }
        C49992jh1 jh12 = (C49992jh1) aVar;
        return C46238a.m51546a(this.BaseRequest, jh12.BaseRequest) && C46238a.m51546a(this.f136119d, jh12.f136119d) && C46238a.m51546a(this.f136120e, jh12.f136120e) && C46238a.m51546a(this.f136121f, jh12.f136121f) && C46238a.m51546a(Long.valueOf(this.f136122g), Long.valueOf(jh12.f136122g)) && C46238a.m51546a(Long.valueOf(this.f136123h), Long.valueOf(jh12.f136123h)) && C46238a.m51546a(this.f136124i, jh12.f136124i) && C46238a.m51546a(Integer.valueOf(this.f136125j), Integer.valueOf(jh12.f136125j)) && C46238a.m51546a(this.f136126n, jh12.f136126n);
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
            C49842ig0 ig02 = this.f136119d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f136119d.writeFields(aVar);
            }
            C89349b bVar = this.f136120e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            C52013xs0 xs02 = this.f136121f;
            if (xs02 != null) {
                aVar.mo74322i(4, xs02.computeSize());
                this.f136121f.writeFields(aVar);
            }
            aVar.mo74321h(5, this.f136122g);
            aVar.mo74321h(6, this.f136123h);
            String str = this.f136124i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            aVar.mo74318e(8, this.f136125j);
            String str2 = this.f136126n;
            if (str2 != null) {
                aVar.mo74323j(9, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f136119d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar2 = this.f136120e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            C52013xs0 xs03 = this.f136121f;
            if (xs03 != null) {
                i2 += C52418a.m58682i(4, xs03.computeSize());
            }
            int h = i2 + C52418a.m58681h(5, this.f136122g) + C52418a.m58681h(6, this.f136123h);
            String str3 = this.f136124i;
            if (str3 != null) {
                h += C52418a.m58683j(7, str3);
            }
            int e = h + C52418a.m58678e(8, this.f136125j);
            String str4 = this.f136126n;
            return str4 != null ? e + C52418a.m58683j(9, str4) : e;
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
            C49992jh1 jh12 = objArr[1];
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
                        jh12.BaseRequest = iaVar3;
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
                        jh12.f136119d = ig04;
                    }
                    return 0;
                case 3:
                    jh12.f136120e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C52013xs0 xs04 = new C52013xs0();
                        if (bArr3 != null && bArr3.length > 0) {
                            xs04.parseFrom(bArr3);
                        }
                        jh12.f136121f = xs04;
                    }
                    return 0;
                case 5:
                    jh12.f136122g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    jh12.f136123h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    jh12.f136124i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    jh12.f136125j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    jh12.f136126n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
