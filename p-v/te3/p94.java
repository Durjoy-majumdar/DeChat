package te3;

import com.tencent.p014mm.protocal.protobuf.SnsObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class p94 extends C49335eu3 {

    /* renamed from: d */
    public String f299102d;

    /* renamed from: e */
    public int f299103e;

    /* renamed from: f */
    public LinkedList<SnsObject> f299104f = new LinkedList<>();

    /* renamed from: g */
    public int f299105g;

    /* renamed from: h */
    public a94 f299106h;

    /* renamed from: i */
    public int f299107i;

    /* renamed from: j */
    public int f299108j;

    /* renamed from: n */
    public j84 f299109n;

    /* renamed from: o */
    public long f299110o;

    /* renamed from: p */
    public long f299111p;

    /* renamed from: q */
    public String f299112q;

    /* renamed from: r */
    public int f299113r;

    /* renamed from: s */
    public LinkedList<q94> f299114s = new LinkedList<>();

    /* renamed from: t */
    public boolean f299115t;

    /* renamed from: u */
    public n94 f299116u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof p94)) {
            return false;
        }
        p94 p94 = (p94) aVar;
        return C46238a.m51546a(this.BaseResponse, p94.BaseResponse) && C46238a.m51546a(this.f299102d, p94.f299102d) && C46238a.m51546a(Integer.valueOf(this.f299103e), Integer.valueOf(p94.f299103e)) && C46238a.m51546a(this.f299104f, p94.f299104f) && C46238a.m51546a(Integer.valueOf(this.f299105g), Integer.valueOf(p94.f299105g)) && C46238a.m51546a(this.f299106h, p94.f299106h) && C46238a.m51546a(Integer.valueOf(this.f299107i), Integer.valueOf(p94.f299107i)) && C46238a.m51546a(Integer.valueOf(this.f299108j), Integer.valueOf(p94.f299108j)) && C46238a.m51546a(this.f299109n, p94.f299109n) && C46238a.m51546a(Long.valueOf(this.f299110o), Long.valueOf(p94.f299110o)) && C46238a.m51546a(Long.valueOf(this.f299111p), Long.valueOf(p94.f299111p)) && C46238a.m51546a(this.f299112q, p94.f299112q) && C46238a.m51546a(Integer.valueOf(this.f299113r), Integer.valueOf(p94.f299113r)) && C46238a.m51546a(this.f299114s, p94.f299114s) && C46238a.m51546a(Boolean.valueOf(this.f299115t), Boolean.valueOf(p94.f299115t)) && C46238a.m51546a(this.f299116u, p94.f299116u);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                String str = this.f299102d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f299103e);
                aVar.mo74320g(4, 8, this.f299104f);
                aVar.mo74318e(5, this.f299105g);
                a94 a94 = this.f299106h;
                if (a94 != null) {
                    aVar.mo74322i(6, a94.computeSize());
                    this.f299106h.writeFields(aVar);
                }
                aVar.mo74318e(7, this.f299107i);
                aVar.mo74318e(8, this.f299108j);
                j84 j84 = this.f299109n;
                if (j84 != null) {
                    aVar.mo74322i(9, j84.computeSize());
                    this.f299109n.writeFields(aVar);
                }
                aVar.mo74321h(10, this.f299110o);
                aVar.mo74321h(11, this.f299111p);
                String str2 = this.f299112q;
                if (str2 != null) {
                    aVar.mo74323j(12, str2);
                }
                aVar.mo74318e(13, this.f299113r);
                aVar.mo74320g(14, 8, this.f299114s);
                aVar.mo74314a(15, this.f299115t);
                n94 n94 = this.f299116u;
                if (n94 != null) {
                    aVar.mo74322i(16, n94.computeSize());
                    this.f299116u.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            String str3 = this.f299102d;
            if (str3 != null) {
                i3 += C52418a.m58683j(2, str3);
            }
            int e = i3 + C52418a.m58678e(3, this.f299103e) + C52418a.m58680g(4, 8, this.f299104f) + C52418a.m58678e(5, this.f299105g);
            a94 a942 = this.f299106h;
            if (a942 != null) {
                e += C52418a.m58682i(6, a942.computeSize());
            }
            int e2 = e + C52418a.m58678e(7, this.f299107i) + C52418a.m58678e(8, this.f299108j);
            j84 j842 = this.f299109n;
            if (j842 != null) {
                e2 += C52418a.m58682i(9, j842.computeSize());
            }
            int h = e2 + C52418a.m58681h(10, this.f299110o) + C52418a.m58681h(11, this.f299111p);
            String str4 = this.f299112q;
            if (str4 != null) {
                h += C52418a.m58683j(12, str4);
            }
            int e3 = h + C52418a.m58678e(13, this.f299113r) + C52418a.m58680g(14, 8, this.f299114s) + C52418a.m58674a(15, this.f299115t);
            n94 n942 = this.f299116u;
            return n942 != null ? e3 + C52418a.m58682i(16, n942.computeSize()) : e3;
        } else if (i2 == 2) {
            this.f299104f.clear();
            this.f299114s.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            p94 p94 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        p94.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    p94.f299102d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    p94.f299103e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        SnsObject snsObject = new SnsObject();
                        if (bArr2 != null && bArr2.length > 0) {
                            snsObject.parseFrom(bArr2);
                        }
                        p94.f299104f.add(snsObject);
                    }
                    return 0;
                case 5:
                    p94.f299105g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        a94 a943 = new a94();
                        if (bArr3 != null && bArr3.length > 0) {
                            a943.parseFrom(bArr3);
                        }
                        p94.f299106h = a943;
                    }
                    return 0;
                case 7:
                    p94.f299107i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    p94.f299108j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        j84 j843 = new j84();
                        if (bArr4 != null && bArr4.length > 0) {
                            j843.parseFrom(bArr4);
                        }
                        p94.f299109n = j843;
                    }
                    return 0;
                case 10:
                    p94.f299110o = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    p94.f299111p = aVar3.mo141631i(intValue);
                    return 0;
                case 12:
                    p94.f299112q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    p94.f299113r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        q94 q94 = new q94();
                        if (bArr5 != null && bArr5.length > 0) {
                            q94.parseFrom(bArr5);
                        }
                        p94.f299114s.add(q94);
                    }
                    return 0;
                case 15:
                    p94.f299115t = aVar3.mo141625c(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        n94 n943 = new n94();
                        if (bArr6 != null && bArr6.length > 0) {
                            n943.parseFrom(bArr6);
                        }
                        p94.f299116u = n943;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
