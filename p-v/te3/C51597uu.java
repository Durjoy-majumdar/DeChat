package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uu */
public class C51597uu extends C101820nt3 {

    /* renamed from: d */
    public int f143132d;

    /* renamed from: e */
    public String f143133e;

    /* renamed from: f */
    public LinkedList<b44> f143134f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<d44> f143135g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<a44> f143136h = new LinkedList<>();

    /* renamed from: i */
    public LinkedList<z34> f143137i = new LinkedList<>();

    /* renamed from: j */
    public LinkedList<c44> f143138j = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51597uu)) {
            return false;
        }
        C51597uu uuVar = (C51597uu) aVar;
        return C46238a.m51546a(this.BaseRequest, uuVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f143132d), Integer.valueOf(uuVar.f143132d)) && C46238a.m51546a(this.f143133e, uuVar.f143133e) && C46238a.m51546a(this.f143134f, uuVar.f143134f) && C46238a.m51546a(this.f143135g, uuVar.f143135g) && C46238a.m51546a(this.f143136h, uuVar.f143136h) && C46238a.m51546a(this.f143137i, uuVar.f143137i) && C46238a.m51546a(this.f143138j, uuVar.f143138j);
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
            aVar.mo74318e(2, this.f143132d);
            String str = this.f143133e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74320g(4, 8, this.f143134f);
            aVar.mo74320g(5, 8, this.f143135g);
            aVar.mo74320g(6, 8, this.f143136h);
            aVar.mo74320g(7, 8, this.f143137i);
            aVar.mo74320g(8, 8, this.f143138j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f143132d);
            String str2 = this.f143133e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            return e + C52418a.m58680g(4, 8, this.f143134f) + C52418a.m58680g(5, 8, this.f143135g) + C52418a.m58680g(6, 8, this.f143136h) + C52418a.m58680g(7, 8, this.f143137i) + C52418a.m58680g(8, 8, this.f143138j);
        } else if (i == 2) {
            this.f143134f.clear();
            this.f143135g.clear();
            this.f143136h.clear();
            this.f143137i.clear();
            this.f143138j.clear();
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
            C51597uu uuVar = objArr[1];
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
                        uuVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    uuVar.f143132d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    uuVar.f143133e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        b44 b44 = new b44();
                        if (bArr2 != null && bArr2.length > 0) {
                            b44.parseFrom(bArr2);
                        }
                        uuVar.f143134f.add(b44);
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        d44 d44 = new d44();
                        if (bArr3 != null && bArr3.length > 0) {
                            d44.parseFrom(bArr3);
                        }
                        uuVar.f143135g.add(d44);
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        a44 a44 = new a44();
                        if (bArr4 != null && bArr4.length > 0) {
                            a44.parseFrom(bArr4);
                        }
                        uuVar.f143136h.add(a44);
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        z34 z34 = new z34();
                        if (bArr5 != null && bArr5.length > 0) {
                            z34.parseFrom(bArr5);
                        }
                        uuVar.f143137i.add(z34);
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        c44 c44 = new c44();
                        if (bArr6 != null && bArr6.length > 0) {
                            c44.parseFrom(bArr6);
                        }
                        uuVar.f143138j.add(c44);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
