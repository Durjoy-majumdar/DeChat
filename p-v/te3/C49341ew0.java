package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ew0 */
public class C49341ew0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f133137d;

    /* renamed from: e */
    public C89349b f133138e;

    /* renamed from: f */
    public long f133139f;

    /* renamed from: g */
    public long f133140g;

    /* renamed from: h */
    public String f133141h;

    /* renamed from: i */
    public int f133142i;

    /* renamed from: j */
    public String f133143j;

    /* renamed from: n */
    public LinkedList<String> f133144n = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49341ew0)) {
            return false;
        }
        C49341ew0 ew02 = (C49341ew0) aVar;
        return C46238a.m51546a(this.BaseRequest, ew02.BaseRequest) && C46238a.m51546a(this.f133137d, ew02.f133137d) && C46238a.m51546a(this.f133138e, ew02.f133138e) && C46238a.m51546a(Long.valueOf(this.f133139f), Long.valueOf(ew02.f133139f)) && C46238a.m51546a(Long.valueOf(this.f133140g), Long.valueOf(ew02.f133140g)) && C46238a.m51546a(this.f133141h, ew02.f133141h) && C46238a.m51546a(Integer.valueOf(this.f133142i), Integer.valueOf(ew02.f133142i)) && C46238a.m51546a(this.f133143j, ew02.f133143j) && C46238a.m51546a(this.f133144n, ew02.f133144n);
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
            C49842ig0 ig02 = this.f133137d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f133137d.writeFields(aVar);
            }
            C89349b bVar = this.f133138e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74321h(4, this.f133139f);
            aVar.mo74321h(5, this.f133140g);
            String str = this.f133141h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            aVar.mo74318e(7, this.f133142i);
            String str2 = this.f133143j;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            aVar.mo74320g(9, 1, this.f133144n);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f133137d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar2 = this.f133138e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            int h = i2 + C52418a.m58681h(4, this.f133139f) + C52418a.m58681h(5, this.f133140g);
            String str3 = this.f133141h;
            if (str3 != null) {
                h += C52418a.m58683j(6, str3);
            }
            int e = h + C52418a.m58678e(7, this.f133142i);
            String str4 = this.f133143j;
            if (str4 != null) {
                e += C52418a.m58683j(8, str4);
            }
            return e + C52418a.m58680g(9, 1, this.f133144n);
        } else if (i == 2) {
            this.f133144n.clear();
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
            C49341ew0 ew02 = objArr[1];
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
                        ew02.BaseRequest = iaVar3;
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
                        ew02.f133137d = ig04;
                    }
                    return 0;
                case 3:
                    ew02.f133138e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    ew02.f133139f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    ew02.f133140g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    ew02.f133141h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ew02.f133142i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ew02.f133143j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    ew02.f133144n.add(aVar3.mo141633k(intValue));
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
