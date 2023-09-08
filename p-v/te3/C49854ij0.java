package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ij0 */
public class C49854ij0 extends C101820nt3 {

    /* renamed from: d */
    public String f135372d;

    /* renamed from: e */
    public C89349b f135373e;

    /* renamed from: f */
    public String f135374f;

    /* renamed from: g */
    public C49842ig0 f135375g;

    /* renamed from: h */
    public String f135376h;

    /* renamed from: i */
    public C49849ii0 f135377i;

    /* renamed from: j */
    public int f135378j;

    /* renamed from: n */
    public int f135379n;

    /* renamed from: o */
    public C49849ii0 f135380o;

    /* renamed from: p */
    public int f135381p;

    /* renamed from: q */
    public C49783i10 f135382q;

    /* renamed from: r */
    public int f135383r;

    /* renamed from: s */
    public String f135384s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49854ij0)) {
            return false;
        }
        C49854ij0 ij02 = (C49854ij0) aVar;
        return C46238a.m51546a(this.BaseRequest, ij02.BaseRequest) && C46238a.m51546a(this.f135372d, ij02.f135372d) && C46238a.m51546a(this.f135373e, ij02.f135373e) && C46238a.m51546a(this.f135374f, ij02.f135374f) && C46238a.m51546a(this.f135375g, ij02.f135375g) && C46238a.m51546a(this.f135376h, ij02.f135376h) && C46238a.m51546a(this.f135377i, ij02.f135377i) && C46238a.m51546a(Integer.valueOf(this.f135378j), Integer.valueOf(ij02.f135378j)) && C46238a.m51546a(Integer.valueOf(this.f135379n), Integer.valueOf(ij02.f135379n)) && C46238a.m51546a(this.f135380o, ij02.f135380o) && C46238a.m51546a(Integer.valueOf(this.f135381p), Integer.valueOf(ij02.f135381p)) && C46238a.m51546a(this.f135382q, ij02.f135382q) && C46238a.m51546a(Integer.valueOf(this.f135383r), Integer.valueOf(ij02.f135383r)) && C46238a.m51546a(this.f135384s, ij02.f135384s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f135372d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C89349b bVar = this.f135373e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            String str2 = this.f135374f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            C49842ig0 ig02 = this.f135375g;
            if (ig02 != null) {
                aVar.mo74322i(5, ig02.computeSize());
                this.f135375g.writeFields(aVar);
            }
            String str3 = this.f135376h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            C49849ii0 ii02 = this.f135377i;
            if (ii02 != null) {
                aVar.mo74322i(7, ii02.computeSize());
                this.f135377i.writeFields(aVar);
            }
            aVar.mo74318e(8, this.f135378j);
            aVar.mo74318e(9, this.f135379n);
            C49849ii0 ii03 = this.f135380o;
            if (ii03 != null) {
                aVar.mo74322i(10, ii03.computeSize());
                this.f135380o.writeFields(aVar);
            }
            aVar.mo74318e(11, this.f135381p);
            C49783i10 i102 = this.f135382q;
            if (i102 != null) {
                aVar.mo74322i(12, i102.computeSize());
                this.f135382q.writeFields(aVar);
            }
            aVar.mo74318e(13, this.f135383r);
            String str4 = this.f135384s;
            if (str4 != null) {
                aVar.mo74323j(14, str4);
            }
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            String str5 = this.f135372d;
            if (str5 != null) {
                i3 += C52418a.m58683j(2, str5);
            }
            C89349b bVar2 = this.f135373e;
            if (bVar2 != null) {
                i3 += C52418a.m58675b(3, bVar2);
            }
            String str6 = this.f135374f;
            if (str6 != null) {
                i3 += C52418a.m58683j(4, str6);
            }
            C49842ig0 ig03 = this.f135375g;
            if (ig03 != null) {
                i3 += C52418a.m58682i(5, ig03.computeSize());
            }
            String str7 = this.f135376h;
            if (str7 != null) {
                i3 += C52418a.m58683j(6, str7);
            }
            C49849ii0 ii04 = this.f135377i;
            if (ii04 != null) {
                i3 += C52418a.m58682i(7, ii04.computeSize());
            }
            int e = i3 + C52418a.m58678e(8, this.f135378j) + C52418a.m58678e(9, this.f135379n);
            C49849ii0 ii05 = this.f135380o;
            if (ii05 != null) {
                e += C52418a.m58682i(10, ii05.computeSize());
            }
            int e2 = e + C52418a.m58678e(11, this.f135381p);
            C49783i10 i103 = this.f135382q;
            if (i103 != null) {
                e2 += C52418a.m58682i(12, i103.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(13, this.f135383r);
            String str8 = this.f135384s;
            return str8 != null ? e3 + C52418a.m58683j(14, str8) : e3;
        } else if (i2 == 2) {
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
            C49854ij0 ij02 = objArr[1];
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
                        ij02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    ij02.f135372d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ij02.f135373e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    ij02.f135374f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        ij02.f135375g = ig04;
                    }
                    return 0;
                case 6:
                    ij02.f135376h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C49849ii0 ii06 = new C49849ii0();
                        if (bArr3 != null && bArr3.length > 0) {
                            ii06.parseFrom(bArr3);
                        }
                        ij02.f135377i = ii06;
                    }
                    return 0;
                case 8:
                    ij02.f135378j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    ij02.f135379n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C49849ii0 ii07 = new C49849ii0();
                        if (bArr4 != null && bArr4.length > 0) {
                            ii07.parseFrom(bArr4);
                        }
                        ij02.f135380o = ii07;
                    }
                    return 0;
                case 11:
                    ij02.f135381p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C49783i10 i104 = new C49783i10();
                        if (bArr5 != null && bArr5.length > 0) {
                            i104.parseFrom(bArr5);
                        }
                        ij02.f135382q = i104;
                    }
                    return 0;
                case 13:
                    ij02.f135383r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    ij02.f135384s = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
