package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.j11 */
public class C49929j11 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f135810d;

    /* renamed from: e */
    public long f135811e;

    /* renamed from: f */
    public long f135812f;

    /* renamed from: g */
    public C89349b f135813g;

    /* renamed from: h */
    public String f135814h;

    /* renamed from: i */
    public String f135815i;

    /* renamed from: j */
    public int f135816j;

    /* renamed from: n */
    public String f135817n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49929j11)) {
            return false;
        }
        C49929j11 j112 = (C49929j11) aVar;
        return C46238a.m51546a(this.BaseRequest, j112.BaseRequest) && C46238a.m51546a(this.f135810d, j112.f135810d) && C46238a.m51546a(Long.valueOf(this.f135811e), Long.valueOf(j112.f135811e)) && C46238a.m51546a(Long.valueOf(this.f135812f), Long.valueOf(j112.f135812f)) && C46238a.m51546a(this.f135813g, j112.f135813g) && C46238a.m51546a(this.f135814h, j112.f135814h) && C46238a.m51546a(this.f135815i, j112.f135815i) && C46238a.m51546a(Integer.valueOf(this.f135816j), Integer.valueOf(j112.f135816j)) && C46238a.m51546a(this.f135817n, j112.f135817n);
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
            C49842ig0 ig02 = this.f135810d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f135810d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f135811e);
            aVar.mo74321h(4, this.f135812f);
            C89349b bVar = this.f135813g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            String str = this.f135814h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            String str2 = this.f135815i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74318e(8, this.f135816j);
            String str3 = this.f135817n;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f135810d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f135811e) + C52418a.m58681h(4, this.f135812f);
            C89349b bVar2 = this.f135813g;
            if (bVar2 != null) {
                h += C52418a.m58675b(5, bVar2);
            }
            String str4 = this.f135814h;
            if (str4 != null) {
                h += C52418a.m58683j(6, str4);
            }
            String str5 = this.f135815i;
            if (str5 != null) {
                h += C52418a.m58683j(7, str5);
            }
            int e = h + C52418a.m58678e(8, this.f135816j);
            String str6 = this.f135817n;
            return str6 != null ? e + C52418a.m58683j(9, str6) : e;
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
            C49929j11 j112 = objArr[1];
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
                        j112.BaseRequest = iaVar3;
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
                        j112.f135810d = ig04;
                    }
                    return 0;
                case 3:
                    j112.f135811e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    j112.f135812f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    j112.f135813g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    j112.f135814h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    j112.f135815i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    j112.f135816j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    j112.f135817n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
