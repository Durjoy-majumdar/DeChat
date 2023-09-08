package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pz0 */
public class C50891pz0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f140055d;

    /* renamed from: e */
    public long f140056e;

    /* renamed from: f */
    public long f140057f;

    /* renamed from: g */
    public String f140058g;

    /* renamed from: h */
    public int f140059h;

    /* renamed from: i */
    public String f140060i;

    /* renamed from: j */
    public C89349b f140061j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50891pz0)) {
            return false;
        }
        C50891pz0 pz02 = (C50891pz0) aVar;
        return C46238a.m51546a(this.BaseRequest, pz02.BaseRequest) && C46238a.m51546a(this.f140055d, pz02.f140055d) && C46238a.m51546a(Long.valueOf(this.f140056e), Long.valueOf(pz02.f140056e)) && C46238a.m51546a(Long.valueOf(this.f140057f), Long.valueOf(pz02.f140057f)) && C46238a.m51546a(this.f140058g, pz02.f140058g) && C46238a.m51546a(Integer.valueOf(this.f140059h), Integer.valueOf(pz02.f140059h)) && C46238a.m51546a(this.f140060i, pz02.f140060i) && C46238a.m51546a(this.f140061j, pz02.f140061j);
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
            C49842ig0 ig02 = this.f140055d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f140055d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f140056e);
            aVar.mo74321h(4, this.f140057f);
            String str = this.f140058g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74318e(6, this.f140059h);
            String str2 = this.f140060i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            C89349b bVar = this.f140061j;
            if (bVar != null) {
                aVar.mo74315b(8, bVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f140055d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f140056e) + C52418a.m58681h(4, this.f140057f);
            String str3 = this.f140058g;
            if (str3 != null) {
                h += C52418a.m58683j(5, str3);
            }
            int e = h + C52418a.m58678e(6, this.f140059h);
            String str4 = this.f140060i;
            if (str4 != null) {
                e += C52418a.m58683j(7, str4);
            }
            C89349b bVar2 = this.f140061j;
            return bVar2 != null ? e + C52418a.m58675b(8, bVar2) : e;
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
            C50891pz0 pz02 = objArr[1];
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
                        pz02.BaseRequest = iaVar3;
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
                        pz02.f140055d = ig04;
                    }
                    return 0;
                case 3:
                    pz02.f140056e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    pz02.f140057f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    pz02.f140058g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    pz02.f140059h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    pz02.f140060i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    pz02.f140061j = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
