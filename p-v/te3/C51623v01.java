package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.v01 */
public class C51623v01 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f143214d;

    /* renamed from: e */
    public C89349b f143215e;

    /* renamed from: f */
    public LinkedList<String> f143216f = new LinkedList<>();

    /* renamed from: g */
    public long f143217g;

    /* renamed from: h */
    public long f143218h;

    /* renamed from: i */
    public String f143219i;

    /* renamed from: j */
    public String f143220j;

    /* renamed from: n */
    public int f143221n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51623v01)) {
            return false;
        }
        C51623v01 v012 = (C51623v01) aVar;
        return C46238a.m51546a(this.BaseRequest, v012.BaseRequest) && C46238a.m51546a(this.f143214d, v012.f143214d) && C46238a.m51546a(this.f143215e, v012.f143215e) && C46238a.m51546a(this.f143216f, v012.f143216f) && C46238a.m51546a(Long.valueOf(this.f143217g), Long.valueOf(v012.f143217g)) && C46238a.m51546a(Long.valueOf(this.f143218h), Long.valueOf(v012.f143218h)) && C46238a.m51546a(this.f143219i, v012.f143219i) && C46238a.m51546a(this.f143220j, v012.f143220j) && C46238a.m51546a(Integer.valueOf(this.f143221n), Integer.valueOf(v012.f143221n));
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
            C49842ig0 ig02 = this.f143214d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f143214d.writeFields(aVar);
            }
            C89349b bVar = this.f143215e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74320g(4, 1, this.f143216f);
            aVar.mo74321h(5, this.f143217g);
            aVar.mo74321h(6, this.f143218h);
            String str = this.f143219i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            String str2 = this.f143220j;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            aVar.mo74318e(9, this.f143221n);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f143214d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar2 = this.f143215e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            int g = i2 + C52418a.m58680g(4, 1, this.f143216f) + C52418a.m58681h(5, this.f143217g) + C52418a.m58681h(6, this.f143218h);
            String str3 = this.f143219i;
            if (str3 != null) {
                g += C52418a.m58683j(7, str3);
            }
            String str4 = this.f143220j;
            if (str4 != null) {
                g += C52418a.m58683j(8, str4);
            }
            return g + C52418a.m58678e(9, this.f143221n);
        } else if (i == 2) {
            this.f143216f.clear();
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
            C51623v01 v012 = objArr[1];
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
                        v012.BaseRequest = iaVar3;
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
                        v012.f143214d = ig04;
                    }
                    return 0;
                case 3:
                    v012.f143215e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    v012.f143216f.add(aVar3.mo141633k(intValue));
                    return 0;
                case 5:
                    v012.f143217g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    v012.f143218h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    v012.f143219i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    v012.f143220j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    v012.f143221n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
