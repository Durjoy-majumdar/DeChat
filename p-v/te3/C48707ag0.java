package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ag0 */
public class C48707ag0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f130491d;

    /* renamed from: e */
    public C89349b f130492e;

    /* renamed from: f */
    public long f130493f;

    /* renamed from: g */
    public int f130494g;

    /* renamed from: h */
    public float f130495h;

    /* renamed from: i */
    public float f130496i;

    /* renamed from: j */
    public String f130497j;

    /* renamed from: n */
    public LinkedList<db4> f130498n = new LinkedList<>();

    /* renamed from: o */
    public LinkedList<C49173do1> f130499o = new LinkedList<>();

    /* renamed from: p */
    public C49704hh0 f130500p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48707ag0)) {
            return false;
        }
        C48707ag0 ag02 = (C48707ag0) aVar;
        return C46238a.m51546a(this.BaseRequest, ag02.BaseRequest) && C46238a.m51546a(this.f130491d, ag02.f130491d) && C46238a.m51546a(this.f130492e, ag02.f130492e) && C46238a.m51546a(Long.valueOf(this.f130493f), Long.valueOf(ag02.f130493f)) && C46238a.m51546a(Integer.valueOf(this.f130494g), Integer.valueOf(ag02.f130494g)) && C46238a.m51546a(Float.valueOf(this.f130495h), Float.valueOf(ag02.f130495h)) && C46238a.m51546a(Float.valueOf(this.f130496i), Float.valueOf(ag02.f130496i)) && C46238a.m51546a(this.f130497j, ag02.f130497j) && C46238a.m51546a(this.f130498n, ag02.f130498n) && C46238a.m51546a(this.f130499o, ag02.f130499o) && C46238a.m51546a(this.f130500p, ag02.f130500p);
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
            C49842ig0 ig02 = this.f130491d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f130491d.writeFields(aVar);
            }
            C89349b bVar = this.f130492e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74321h(4, this.f130493f);
            aVar.mo74318e(5, this.f130494g);
            aVar.mo74317d(6, this.f130495h);
            aVar.mo74317d(7, this.f130496i);
            String str = this.f130497j;
            if (str != null) {
                aVar.mo74323j(8, str);
            }
            aVar.mo74320g(9, 8, this.f130498n);
            aVar.mo74320g(10, 8, this.f130499o);
            C49704hh0 hh02 = this.f130500p;
            if (hh02 != null) {
                aVar.mo74322i(11, hh02.computeSize());
                this.f130500p.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f130491d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar2 = this.f130492e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            int h = i2 + C52418a.m58681h(4, this.f130493f) + C52418a.m58678e(5, this.f130494g) + C52418a.m58677d(6, this.f130495h) + C52418a.m58677d(7, this.f130496i);
            String str2 = this.f130497j;
            if (str2 != null) {
                h += C52418a.m58683j(8, str2);
            }
            int g = h + C52418a.m58680g(9, 8, this.f130498n) + C52418a.m58680g(10, 8, this.f130499o);
            C49704hh0 hh03 = this.f130500p;
            return hh03 != null ? g + C52418a.m58682i(11, hh03.computeSize()) : g;
        } else if (i == 2) {
            this.f130498n.clear();
            this.f130499o.clear();
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
            C48707ag0 ag02 = objArr[1];
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
                        ag02.BaseRequest = iaVar3;
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
                        ag02.f130491d = ig04;
                    }
                    return 0;
                case 3:
                    ag02.f130492e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    ag02.f130493f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    ag02.f130494g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ag02.f130495h = aVar3.mo141628f(intValue);
                    return 0;
                case 7:
                    ag02.f130496i = aVar3.mo141628f(intValue);
                    return 0;
                case 8:
                    ag02.f130497j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        db4 db4 = new db4();
                        if (bArr3 != null && bArr3.length > 0) {
                            db4.parseFrom(bArr3);
                        }
                        ag02.f130498n.add(db4);
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C49173do1 do12 = new C49173do1();
                        if (bArr4 != null && bArr4.length > 0) {
                            do12.parseFrom(bArr4);
                        }
                        ag02.f130499o.add(do12);
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C49704hh0 hh04 = new C49704hh0();
                        if (bArr5 != null && bArr5.length > 0) {
                            hh04.parseFrom(bArr5);
                        }
                        ag02.f130500p = hh04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
