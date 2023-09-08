package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dh0 */
public class C49144dh0 extends C101820nt3 {

    /* renamed from: d */
    public C89349b f132316d;

    /* renamed from: e */
    public LinkedList<Long> f132317e = new LinkedList<>();

    /* renamed from: f */
    public C49842ig0 f132318f;

    /* renamed from: g */
    public LinkedList<Long> f132319g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<Long> f132320h = new LinkedList<>();

    /* renamed from: i */
    public C89349b f132321i;

    /* renamed from: j */
    public C64414h71 f132322j;

    /* renamed from: n */
    public int f132323n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49144dh0)) {
            return false;
        }
        C49144dh0 dh02 = (C49144dh0) aVar;
        return C46238a.m51546a(this.BaseRequest, dh02.BaseRequest) && C46238a.m51546a(this.f132316d, dh02.f132316d) && C46238a.m51546a(this.f132317e, dh02.f132317e) && C46238a.m51546a(this.f132318f, dh02.f132318f) && C46238a.m51546a(this.f132319g, dh02.f132319g) && C46238a.m51546a(this.f132320h, dh02.f132320h) && C46238a.m51546a(this.f132321i, dh02.f132321i) && C46238a.m51546a(this.f132322j, dh02.f132322j) && C46238a.m51546a(Integer.valueOf(this.f132323n), Integer.valueOf(dh02.f132323n));
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
            C89349b bVar = this.f132316d;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74320g(3, 3, this.f132317e);
            C49842ig0 ig02 = this.f132318f;
            if (ig02 != null) {
                aVar.mo74322i(4, ig02.computeSize());
                this.f132318f.writeFields(aVar);
            }
            aVar.mo74320g(5, 3, this.f132319g);
            aVar.mo74320g(6, 3, this.f132320h);
            C89349b bVar2 = this.f132321i;
            if (bVar2 != null) {
                aVar.mo74315b(7, bVar2);
            }
            C64414h71 h712 = this.f132322j;
            if (h712 != null) {
                aVar.mo74322i(8, h712.computeSize());
                this.f132322j.writeFields(aVar);
            }
            aVar.mo74318e(9, this.f132323n);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C89349b bVar3 = this.f132316d;
            if (bVar3 != null) {
                i2 += C52418a.m58675b(2, bVar3);
            }
            int g = i2 + C52418a.m58680g(3, 3, this.f132317e);
            C49842ig0 ig03 = this.f132318f;
            if (ig03 != null) {
                g += C52418a.m58682i(4, ig03.computeSize());
            }
            int g2 = g + C52418a.m58680g(5, 3, this.f132319g) + C52418a.m58680g(6, 3, this.f132320h);
            C89349b bVar4 = this.f132321i;
            if (bVar4 != null) {
                g2 += C52418a.m58675b(7, bVar4);
            }
            C64414h71 h713 = this.f132322j;
            if (h713 != null) {
                g2 += C52418a.m58682i(8, h713.computeSize());
            }
            return g2 + C52418a.m58678e(9, this.f132323n);
        } else if (i == 2) {
            this.f132317e.clear();
            this.f132319g.clear();
            this.f132320h.clear();
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
            C49144dh0 dh02 = objArr[1];
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
                        dh02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    dh02.f132316d = aVar3.mo141626d(intValue);
                    return 0;
                case 3:
                    dh02.f132317e.add(Long.valueOf(aVar3.mo141631i(intValue)));
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        dh02.f132318f = ig04;
                    }
                    return 0;
                case 5:
                    dh02.f132319g.add(Long.valueOf(aVar3.mo141631i(intValue)));
                    return 0;
                case 6:
                    dh02.f132320h.add(Long.valueOf(aVar3.mo141631i(intValue)));
                    return 0;
                case 7:
                    dh02.f132321i = aVar3.mo141626d(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64414h71 h714 = new C64414h71();
                        if (bArr3 != null && bArr3.length > 0) {
                            h714.parseFrom(bArr3);
                        }
                        dh02.f132322j = h714;
                    }
                    return 0;
                case 9:
                    dh02.f132323n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
