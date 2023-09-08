package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wj0 */
public class C51840wj0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f144072d;

    /* renamed from: e */
    public C89349b f144073e;

    /* renamed from: f */
    public long f144074f;

    /* renamed from: g */
    public int f144075g;

    /* renamed from: h */
    public float f144076h;

    /* renamed from: i */
    public float f144077i;

    /* renamed from: j */
    public String f144078j;

    /* renamed from: n */
    public LinkedList<db4> f144079n = new LinkedList<>();

    /* renamed from: o */
    public LinkedList<C49173do1> f144080o = new LinkedList<>();

    /* renamed from: p */
    public C49704hh0 f144081p;

    /* renamed from: q */
    public int f144082q;

    /* renamed from: r */
    public int f144083r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51840wj0)) {
            return false;
        }
        C51840wj0 wj02 = (C51840wj0) aVar;
        return C46238a.m51546a(this.BaseRequest, wj02.BaseRequest) && C46238a.m51546a(this.f144072d, wj02.f144072d) && C46238a.m51546a(this.f144073e, wj02.f144073e) && C46238a.m51546a(Long.valueOf(this.f144074f), Long.valueOf(wj02.f144074f)) && C46238a.m51546a(Integer.valueOf(this.f144075g), Integer.valueOf(wj02.f144075g)) && C46238a.m51546a(Float.valueOf(this.f144076h), Float.valueOf(wj02.f144076h)) && C46238a.m51546a(Float.valueOf(this.f144077i), Float.valueOf(wj02.f144077i)) && C46238a.m51546a(this.f144078j, wj02.f144078j) && C46238a.m51546a(this.f144079n, wj02.f144079n) && C46238a.m51546a(this.f144080o, wj02.f144080o) && C46238a.m51546a(this.f144081p, wj02.f144081p) && C46238a.m51546a(Integer.valueOf(this.f144082q), Integer.valueOf(wj02.f144082q)) && C46238a.m51546a(Integer.valueOf(this.f144083r), Integer.valueOf(wj02.f144083r));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C49842ig0 ig02 = this.f144072d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f144072d.writeFields(aVar);
            }
            C89349b bVar = this.f144073e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74321h(4, this.f144074f);
            aVar.mo74318e(5, this.f144075g);
            aVar.mo74317d(6, this.f144076h);
            aVar.mo74317d(7, this.f144077i);
            String str = this.f144078j;
            if (str != null) {
                aVar.mo74323j(8, str);
            }
            aVar.mo74320g(9, 8, this.f144079n);
            aVar.mo74320g(10, 8, this.f144080o);
            C49704hh0 hh02 = this.f144081p;
            if (hh02 != null) {
                aVar.mo74322i(11, hh02.computeSize());
                this.f144081p.writeFields(aVar);
            }
            aVar.mo74318e(12, this.f144082q);
            aVar.mo74318e(13, this.f144083r);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            int i3 = iaVar2 != null ? 0 + C52418a.m58682i(1, iaVar2.computeSize()) : 0;
            C49842ig0 ig03 = this.f144072d;
            if (ig03 != null) {
                i3 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar2 = this.f144073e;
            if (bVar2 != null) {
                i3 += C52418a.m58675b(3, bVar2);
            }
            int h = i3 + C52418a.m58681h(4, this.f144074f) + C52418a.m58678e(5, this.f144075g) + C52418a.m58677d(6, this.f144076h) + C52418a.m58677d(7, this.f144077i);
            String str2 = this.f144078j;
            if (str2 != null) {
                h += C52418a.m58683j(8, str2);
            }
            int g = h + C52418a.m58680g(9, 8, this.f144079n) + C52418a.m58680g(10, 8, this.f144080o);
            C49704hh0 hh03 = this.f144081p;
            if (hh03 != null) {
                g += C52418a.m58682i(11, hh03.computeSize());
            }
            return g + C52418a.m58678e(12, this.f144082q) + C52418a.m58678e(13, this.f144083r);
        } else if (i2 == 2) {
            this.f144079n.clear();
            this.f144080o.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51840wj0 wj02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        wj02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        wj02.f144072d = ig04;
                    }
                    return 0;
                case 3:
                    wj02.f144073e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    wj02.f144074f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    wj02.f144075g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    wj02.f144076h = aVar3.mo141628f(intValue);
                    return 0;
                case 7:
                    wj02.f144077i = aVar3.mo141628f(intValue);
                    return 0;
                case 8:
                    wj02.f144078j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        db4 db4 = new db4();
                        if (bArr3 != null && bArr3.length > 0) {
                            db4.parseFrom(bArr3);
                        }
                        wj02.f144079n.add(db4);
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C49173do1 do12 = new C49173do1();
                        if (bArr4 != null && bArr4.length > 0) {
                            do12.parseFrom(bArr4);
                        }
                        wj02.f144080o.add(do12);
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C49704hh0 hh04 = new C49704hh0();
                        if (bArr5 != null && bArr5.length > 0) {
                            hh04.parseFrom(bArr5);
                        }
                        wj02.f144081p = hh04;
                    }
                    return 0;
                case 12:
                    wj02.f144082q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    wj02.f144083r = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
