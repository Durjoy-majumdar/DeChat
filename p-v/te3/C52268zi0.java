package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zi0 */
public class C52268zi0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f145970d;

    /* renamed from: e */
    public String f145971e;

    /* renamed from: f */
    public C49098d51 f145972f;

    /* renamed from: g */
    public int f145973g;

    /* renamed from: h */
    public int f145974h;

    /* renamed from: i */
    public LinkedList<C51066r7> f145975i = new LinkedList<>();

    /* renamed from: j */
    public C49801i51 f145976j;

    /* renamed from: n */
    public String f145977n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52268zi0)) {
            return false;
        }
        C52268zi0 zi02 = (C52268zi0) aVar;
        return C46238a.m51546a(this.BaseRequest, zi02.BaseRequest) && C46238a.m51546a(this.f145970d, zi02.f145970d) && C46238a.m51546a(this.f145971e, zi02.f145971e) && C46238a.m51546a(this.f145972f, zi02.f145972f) && C46238a.m51546a(Integer.valueOf(this.f145973g), Integer.valueOf(zi02.f145973g)) && C46238a.m51546a(Integer.valueOf(this.f145974h), Integer.valueOf(zi02.f145974h)) && C46238a.m51546a(this.f145975i, zi02.f145975i) && C46238a.m51546a(this.f145976j, zi02.f145976j) && C46238a.m51546a(this.f145977n, zi02.f145977n);
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
            C49842ig0 ig02 = this.f145970d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f145970d.writeFields(aVar);
            }
            String str = this.f145971e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C49098d51 d512 = this.f145972f;
            if (d512 != null) {
                aVar.mo74322i(4, d512.computeSize());
                this.f145972f.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f145973g);
            aVar.mo74318e(6, this.f145974h);
            aVar.mo74320g(7, 8, this.f145975i);
            C49801i51 i512 = this.f145976j;
            if (i512 != null) {
                aVar.mo74322i(8, i512.computeSize());
                this.f145976j.writeFields(aVar);
            }
            String str2 = this.f145977n;
            if (str2 != null) {
                aVar.mo74323j(9, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f145970d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str3 = this.f145971e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            C49098d51 d513 = this.f145972f;
            if (d513 != null) {
                i2 += C52418a.m58682i(4, d513.computeSize());
            }
            int e = i2 + C52418a.m58678e(5, this.f145973g) + C52418a.m58678e(6, this.f145974h) + C52418a.m58680g(7, 8, this.f145975i);
            C49801i51 i513 = this.f145976j;
            if (i513 != null) {
                e += C52418a.m58682i(8, i513.computeSize());
            }
            String str4 = this.f145977n;
            return str4 != null ? e + C52418a.m58683j(9, str4) : e;
        } else if (i == 2) {
            this.f145975i.clear();
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
            C52268zi0 zi02 = objArr[1];
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
                        zi02.BaseRequest = iaVar3;
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
                        zi02.f145970d = ig04;
                    }
                    return 0;
                case 3:
                    zi02.f145971e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C49098d51 d514 = new C49098d51();
                        if (bArr3 != null && bArr3.length > 0) {
                            d514.parseFrom(bArr3);
                        }
                        zi02.f145972f = d514;
                    }
                    return 0;
                case 5:
                    zi02.f145973g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    zi02.f145974h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51066r7 r7Var = new C51066r7();
                        if (bArr4 != null && bArr4.length > 0) {
                            r7Var.parseFrom(bArr4);
                        }
                        zi02.f145975i.add(r7Var);
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C49801i51 i514 = new C49801i51();
                        if (bArr5 != null && bArr5.length > 0) {
                            i514.parseFrom(bArr5);
                        }
                        zi02.f145976j = i514;
                    }
                    return 0;
                case 9:
                    zi02.f145977n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
