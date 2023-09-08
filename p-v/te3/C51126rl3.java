package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rl3 */
public class C51126rl3 extends C101820nt3 {

    /* renamed from: d */
    public C48826ba f141012d;

    /* renamed from: e */
    public int f141013e;

    /* renamed from: f */
    public C89349b f141014f;

    /* renamed from: g */
    public C89349b f141015g;

    /* renamed from: h */
    public C89349b f141016h;

    /* renamed from: i */
    public int f141017i;

    /* renamed from: j */
    public int f141018j;

    /* renamed from: n */
    public int f141019n;

    /* renamed from: o */
    public long f141020o;

    /* renamed from: p */
    public C51264sl3 f141021p;

    /* renamed from: q */
    public vy4 f141022q;

    /* renamed from: r */
    public LinkedList<Integer> f141023r = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51126rl3)) {
            return false;
        }
        C51126rl3 rl32 = (C51126rl3) aVar;
        return C46238a.m51546a(this.BaseRequest, rl32.BaseRequest) && C46238a.m51546a(this.f141012d, rl32.f141012d) && C46238a.m51546a(Integer.valueOf(this.f141013e), Integer.valueOf(rl32.f141013e)) && C46238a.m51546a(this.f141014f, rl32.f141014f) && C46238a.m51546a(this.f141015g, rl32.f141015g) && C46238a.m51546a(this.f141016h, rl32.f141016h) && C46238a.m51546a(Integer.valueOf(this.f141017i), Integer.valueOf(rl32.f141017i)) && C46238a.m51546a(Integer.valueOf(this.f141018j), Integer.valueOf(rl32.f141018j)) && C46238a.m51546a(Integer.valueOf(this.f141019n), Integer.valueOf(rl32.f141019n)) && C46238a.m51546a(Long.valueOf(this.f141020o), Long.valueOf(rl32.f141020o)) && C46238a.m51546a(this.f141021p, rl32.f141021p) && C46238a.m51546a(this.f141022q, rl32.f141022q) && C46238a.m51546a(this.f141023r, rl32.f141023r);
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
            C48826ba baVar = this.f141012d;
            if (baVar != null) {
                aVar.mo74322i(2, baVar.computeSize());
                this.f141012d.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f141013e);
            C89349b bVar = this.f141014f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            C89349b bVar2 = this.f141015g;
            if (bVar2 != null) {
                aVar.mo74315b(5, bVar2);
            }
            C89349b bVar3 = this.f141016h;
            if (bVar3 != null) {
                aVar.mo74315b(6, bVar3);
            }
            aVar.mo74318e(7, this.f141017i);
            aVar.mo74318e(8, this.f141018j);
            aVar.mo74318e(9, this.f141019n);
            aVar.mo74321h(10, this.f141020o);
            C51264sl3 sl32 = this.f141021p;
            if (sl32 != null) {
                aVar.mo74322i(11, sl32.computeSize());
                this.f141021p.writeFields(aVar);
            }
            vy4 vy4 = this.f141022q;
            if (vy4 != null) {
                aVar.mo74322i(12, vy4.computeSize());
                this.f141022q.writeFields(aVar);
            }
            aVar.mo74320g(13, 2, this.f141023r);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            int i3 = iaVar2 != null ? 0 + C52418a.m58682i(1, iaVar2.computeSize()) : 0;
            C48826ba baVar2 = this.f141012d;
            if (baVar2 != null) {
                i3 += C52418a.m58682i(2, baVar2.computeSize());
            }
            int e = i3 + C52418a.m58678e(3, this.f141013e);
            C89349b bVar4 = this.f141014f;
            if (bVar4 != null) {
                e += C52418a.m58675b(4, bVar4);
            }
            C89349b bVar5 = this.f141015g;
            if (bVar5 != null) {
                e += C52418a.m58675b(5, bVar5);
            }
            C89349b bVar6 = this.f141016h;
            if (bVar6 != null) {
                e += C52418a.m58675b(6, bVar6);
            }
            int e2 = e + C52418a.m58678e(7, this.f141017i) + C52418a.m58678e(8, this.f141018j) + C52418a.m58678e(9, this.f141019n) + C52418a.m58681h(10, this.f141020o);
            C51264sl3 sl33 = this.f141021p;
            if (sl33 != null) {
                e2 += C52418a.m58682i(11, sl33.computeSize());
            }
            vy4 vy42 = this.f141022q;
            if (vy42 != null) {
                e2 += C52418a.m58682i(12, vy42.computeSize());
            }
            return e2 + C52418a.m58680g(13, 2, this.f141023r);
        } else if (i2 == 2) {
            this.f141023r.clear();
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
            C51126rl3 rl32 = objArr[1];
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
                        rl32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C48826ba baVar3 = new C48826ba();
                        if (bArr2 != null && bArr2.length > 0) {
                            baVar3.parseFrom(bArr2);
                        }
                        rl32.f141012d = baVar3;
                    }
                    return 0;
                case 3:
                    rl32.f141013e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    rl32.f141014f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    rl32.f141015g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    rl32.f141016h = aVar3.mo141626d(intValue);
                    return 0;
                case 7:
                    rl32.f141017i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    rl32.f141018j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    rl32.f141019n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    rl32.f141020o = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51264sl3 sl34 = new C51264sl3();
                        if (bArr3 != null && bArr3.length > 0) {
                            sl34.parseFrom(bArr3);
                        }
                        rl32.f141021p = sl34;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        vy4 vy43 = new vy4();
                        if (bArr4 != null && bArr4.length > 0) {
                            vy43.parseFrom(bArr4);
                        }
                        rl32.f141022q = vy43;
                    }
                    return 0;
                case 13:
                    rl32.f141023r.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
