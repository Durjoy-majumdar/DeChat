package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qb1 */
public class C50939qb1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f140226d;

    /* renamed from: e */
    public int f140227e;

    /* renamed from: f */
    public LinkedList<C48769aw> f140228f = new LinkedList<>();

    /* renamed from: g */
    public long f140229g;

    /* renamed from: h */
    public String f140230h;

    /* renamed from: i */
    public C89349b f140231i;

    /* renamed from: j */
    public long f140232j;

    /* renamed from: n */
    public long f140233n;

    /* renamed from: o */
    public String f140234o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50939qb1)) {
            return false;
        }
        C50939qb1 qb12 = (C50939qb1) aVar;
        return C46238a.m51546a(this.BaseRequest, qb12.BaseRequest) && C46238a.m51546a(this.f140226d, qb12.f140226d) && C46238a.m51546a(Integer.valueOf(this.f140227e), Integer.valueOf(qb12.f140227e)) && C46238a.m51546a(this.f140228f, qb12.f140228f) && C46238a.m51546a(Long.valueOf(this.f140229g), Long.valueOf(qb12.f140229g)) && C46238a.m51546a(this.f140230h, qb12.f140230h) && C46238a.m51546a(this.f140231i, qb12.f140231i) && C46238a.m51546a(Long.valueOf(this.f140232j), Long.valueOf(qb12.f140232j)) && C46238a.m51546a(Long.valueOf(this.f140233n), Long.valueOf(qb12.f140233n)) && C46238a.m51546a(this.f140234o, qb12.f140234o);
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
            C49842ig0 ig02 = this.f140226d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f140226d.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f140227e);
            aVar.mo74320g(4, 8, this.f140228f);
            aVar.mo74321h(5, this.f140229g);
            String str = this.f140230h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            C89349b bVar = this.f140231i;
            if (bVar != null) {
                aVar.mo74315b(7, bVar);
            }
            aVar.mo74321h(8, this.f140232j);
            aVar.mo74321h(9, this.f140233n);
            String str2 = this.f140234o;
            if (str2 != null) {
                aVar.mo74323j(10, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f140226d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f140227e) + C52418a.m58680g(4, 8, this.f140228f) + C52418a.m58681h(5, this.f140229g);
            String str3 = this.f140230h;
            if (str3 != null) {
                e += C52418a.m58683j(6, str3);
            }
            C89349b bVar2 = this.f140231i;
            if (bVar2 != null) {
                e += C52418a.m58675b(7, bVar2);
            }
            int h = e + C52418a.m58681h(8, this.f140232j) + C52418a.m58681h(9, this.f140233n);
            String str4 = this.f140234o;
            return str4 != null ? h + C52418a.m58683j(10, str4) : h;
        } else if (i == 2) {
            this.f140228f.clear();
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
            C50939qb1 qb12 = objArr[1];
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
                        qb12.BaseRequest = iaVar3;
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
                        qb12.f140226d = ig04;
                    }
                    return 0;
                case 3:
                    qb12.f140227e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C48769aw awVar = new C48769aw();
                        if (bArr3 != null && bArr3.length > 0) {
                            awVar.parseFrom(bArr3);
                        }
                        qb12.f140228f.add(awVar);
                    }
                    return 0;
                case 5:
                    qb12.f140229g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    qb12.f140230h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    qb12.f140231i = aVar3.mo141626d(intValue);
                    return 0;
                case 8:
                    qb12.f140232j = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    qb12.f140233n = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    qb12.f140234o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
