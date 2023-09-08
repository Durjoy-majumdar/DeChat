package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ky0 */
public class C50192ky0 extends C49335eu3 {

    /* renamed from: d */
    public int f137088d;

    /* renamed from: e */
    public LinkedList<C48770aw0> f137089e = new LinkedList<>();

    /* renamed from: f */
    public int f137090f;

    /* renamed from: g */
    public C48667a51 f137091g;

    /* renamed from: h */
    public kf4 f137092h;

    /* renamed from: i */
    public String f137093i;

    /* renamed from: j */
    public boolean f137094j;

    /* renamed from: n */
    public boolean f137095n;

    /* renamed from: o */
    public C49746hs0 f137096o;

    /* renamed from: p */
    public C49626gy0 f137097p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50192ky0)) {
            return false;
        }
        C50192ky0 ky02 = (C50192ky0) aVar;
        return C46238a.m51546a(this.BaseResponse, ky02.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f137088d), Integer.valueOf(ky02.f137088d)) && C46238a.m51546a(this.f137089e, ky02.f137089e) && C46238a.m51546a(Integer.valueOf(this.f137090f), Integer.valueOf(ky02.f137090f)) && C46238a.m51546a(this.f137091g, ky02.f137091g) && C46238a.m51546a(this.f137092h, ky02.f137092h) && C46238a.m51546a(this.f137093i, ky02.f137093i) && C46238a.m51546a(Boolean.valueOf(this.f137094j), Boolean.valueOf(ky02.f137094j)) && C46238a.m51546a(Boolean.valueOf(this.f137095n), Boolean.valueOf(ky02.f137095n)) && C46238a.m51546a(this.f137096o, ky02.f137096o) && C46238a.m51546a(this.f137097p, ky02.f137097p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f137088d);
            aVar.mo74320g(3, 8, this.f137089e);
            aVar.mo74318e(4, this.f137090f);
            C48667a51 a512 = this.f137091g;
            if (a512 != null) {
                aVar.mo74322i(5, a512.computeSize());
                this.f137091g.writeFields(aVar);
            }
            kf4 kf4 = this.f137092h;
            if (kf4 != null) {
                aVar.mo74322i(6, kf4.computeSize());
                this.f137092h.writeFields(aVar);
            }
            String str = this.f137093i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            aVar.mo74314a(8, this.f137094j);
            aVar.mo74314a(9, this.f137095n);
            C49746hs0 hs02 = this.f137096o;
            if (hs02 != null) {
                aVar.mo74322i(10, hs02.computeSize());
                this.f137096o.writeFields(aVar);
            }
            C49626gy0 gy02 = this.f137097p;
            if (gy02 != null) {
                aVar.mo74322i(11, gy02.computeSize());
                this.f137097p.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f137088d) + C52418a.m58680g(3, 8, this.f137089e) + C52418a.m58678e(4, this.f137090f);
            C48667a51 a513 = this.f137091g;
            if (a513 != null) {
                e += C52418a.m58682i(5, a513.computeSize());
            }
            kf4 kf42 = this.f137092h;
            if (kf42 != null) {
                e += C52418a.m58682i(6, kf42.computeSize());
            }
            String str2 = this.f137093i;
            if (str2 != null) {
                e += C52418a.m58683j(7, str2);
            }
            int a = e + C52418a.m58674a(8, this.f137094j) + C52418a.m58674a(9, this.f137095n);
            C49746hs0 hs03 = this.f137096o;
            if (hs03 != null) {
                a += C52418a.m58682i(10, hs03.computeSize());
            }
            C49626gy0 gy03 = this.f137097p;
            return gy03 != null ? a + C52418a.m58682i(11, gy03.computeSize()) : a;
        } else if (i == 2) {
            this.f137089e.clear();
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
            C50192ky0 ky02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        ky02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ky02.f137088d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C48770aw0 aw02 = new C48770aw0();
                        if (bArr2 != null && bArr2.length > 0) {
                            aw02.parseFrom(bArr2);
                        }
                        ky02.f137089e.add(aw02);
                    }
                    return 0;
                case 4:
                    ky02.f137090f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C48667a51 a514 = new C48667a51();
                        if (bArr3 != null && bArr3.length > 0) {
                            a514.parseFrom(bArr3);
                        }
                        ky02.f137091g = a514;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        kf4 kf43 = new kf4();
                        if (bArr4 != null && bArr4.length > 0) {
                            kf43.parseFrom(bArr4);
                        }
                        ky02.f137092h = kf43;
                    }
                    return 0;
                case 7:
                    ky02.f137093i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ky02.f137094j = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    ky02.f137095n = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C49746hs0 hs04 = new C49746hs0();
                        if (bArr5 != null && bArr5.length > 0) {
                            hs04.parseFrom(bArr5);
                        }
                        ky02.f137096o = hs04;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C49626gy0 gy04 = new C49626gy0();
                        if (bArr6 != null && bArr6.length > 0) {
                            gy04.parseFrom(bArr6);
                        }
                        ky02.f137097p = gy04;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
