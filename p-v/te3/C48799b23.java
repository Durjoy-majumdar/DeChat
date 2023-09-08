package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b23 */
public class C48799b23 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<FinderObject> f130905d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f130906e;

    /* renamed from: f */
    public int f130907f;

    /* renamed from: g */
    public C89349b f130908g;

    /* renamed from: h */
    public C51974xh1 f130909h;

    /* renamed from: i */
    public String f130910i;

    /* renamed from: j */
    public LinkedList<C64629pl1> f130911j = new LinkedList<>();

    /* renamed from: n */
    public LinkedList<C49165dm1> f130912n = new LinkedList<>();

    /* renamed from: o */
    public C50497n51 f130913o;

    /* renamed from: p */
    public C51412tl1 f130914p;

    /* renamed from: q */
    public LinkedList<Boolean> f130915q = new LinkedList<>();

    /* renamed from: r */
    public String f130916r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48799b23)) {
            return false;
        }
        C48799b23 b232 = (C48799b23) aVar;
        return C46238a.m51546a(this.BaseResponse, b232.BaseResponse) && C46238a.m51546a(this.f130905d, b232.f130905d) && C46238a.m51546a(this.f130906e, b232.f130906e) && C46238a.m51546a(Integer.valueOf(this.f130907f), Integer.valueOf(b232.f130907f)) && C46238a.m51546a(this.f130908g, b232.f130908g) && C46238a.m51546a(this.f130909h, b232.f130909h) && C46238a.m51546a(this.f130910i, b232.f130910i) && C46238a.m51546a(this.f130911j, b232.f130911j) && C46238a.m51546a(this.f130912n, b232.f130912n) && C46238a.m51546a(this.f130913o, b232.f130913o) && C46238a.m51546a(this.f130914p, b232.f130914p) && C46238a.m51546a(this.f130915q, b232.f130915q) && C46238a.m51546a(this.f130916r, b232.f130916r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f130905d);
            C89349b bVar = this.f130906e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f130907f);
            C89349b bVar2 = this.f130908g;
            if (bVar2 != null) {
                aVar.mo74315b(5, bVar2);
            }
            C51974xh1 xh12 = this.f130909h;
            if (xh12 != null) {
                aVar.mo74322i(6, xh12.computeSize());
                this.f130909h.writeFields(aVar);
            }
            String str = this.f130910i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            aVar.mo74320g(8, 8, this.f130911j);
            aVar.mo74320g(9, 8, this.f130912n);
            C50497n51 n512 = this.f130913o;
            if (n512 != null) {
                aVar.mo74322i(10, n512.computeSize());
                this.f130913o.writeFields(aVar);
            }
            C51412tl1 tl12 = this.f130914p;
            if (tl12 != null) {
                aVar.mo74322i(11, tl12.computeSize());
                this.f130914p.writeFields(aVar);
            }
            aVar.mo74320g(12, 7, this.f130915q);
            String str2 = this.f130916r;
            if (str2 == null) {
                return 0;
            }
            aVar.mo74323j(100, str2);
            return 0;
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            int i3 = (jaVar2 != null ? 0 + C52418a.m58682i(1, jaVar2.computeSize()) : 0) + C52418a.m58680g(2, 8, this.f130905d);
            C89349b bVar3 = this.f130906e;
            if (bVar3 != null) {
                i3 += C52418a.m58675b(3, bVar3);
            }
            int e = i3 + C52418a.m58678e(4, this.f130907f);
            C89349b bVar4 = this.f130908g;
            if (bVar4 != null) {
                e += C52418a.m58675b(5, bVar4);
            }
            C51974xh1 xh13 = this.f130909h;
            if (xh13 != null) {
                e += C52418a.m58682i(6, xh13.computeSize());
            }
            String str3 = this.f130910i;
            if (str3 != null) {
                e += C52418a.m58683j(7, str3);
            }
            int g = e + C52418a.m58680g(8, 8, this.f130911j) + C52418a.m58680g(9, 8, this.f130912n);
            C50497n51 n513 = this.f130913o;
            if (n513 != null) {
                g += C52418a.m58682i(10, n513.computeSize());
            }
            C51412tl1 tl13 = this.f130914p;
            if (tl13 != null) {
                g += C52418a.m58682i(11, tl13.computeSize());
            }
            int g2 = g + C52418a.m58680g(12, 7, this.f130915q);
            String str4 = this.f130916r;
            return str4 != null ? g2 + C52418a.m58683j(100, str4) : g2;
        } else if (i2 == 2) {
            this.f130905d.clear();
            this.f130911j.clear();
            this.f130912n.clear();
            this.f130915q.clear();
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
            C48799b23 b232 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 100) {
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
                            b232.BaseResponse = jaVar3;
                        }
                        return 0;
                    case 2:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            byte[] bArr2 = j2.get(i5);
                            FinderObject finderObject = new FinderObject();
                            if (bArr2 != null && bArr2.length > 0) {
                                finderObject.parseFrom(bArr2);
                            }
                            b232.f130905d.add(finderObject);
                        }
                        return 0;
                    case 3:
                        b232.f130906e = aVar3.mo141626d(intValue);
                        return 0;
                    case 4:
                        b232.f130907f = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        b232.f130908g = aVar3.mo141626d(intValue);
                        return 0;
                    case 6:
                        LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                        int size3 = j3.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            byte[] bArr3 = j3.get(i6);
                            C51974xh1 xh14 = new C51974xh1();
                            if (bArr3 != null && bArr3.length > 0) {
                                xh14.parseFrom(bArr3);
                            }
                            b232.f130909h = xh14;
                        }
                        return 0;
                    case 7:
                        b232.f130910i = aVar3.mo141633k(intValue);
                        return 0;
                    case 8:
                        LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                        int size4 = j4.size();
                        for (int i7 = 0; i7 < size4; i7++) {
                            byte[] bArr4 = j4.get(i7);
                            C64629pl1 pl12 = new C64629pl1();
                            if (bArr4 != null && bArr4.length > 0) {
                                pl12.parseFrom(bArr4);
                            }
                            b232.f130911j.add(pl12);
                        }
                        return 0;
                    case 9:
                        LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                        int size5 = j5.size();
                        for (int i8 = 0; i8 < size5; i8++) {
                            byte[] bArr5 = j5.get(i8);
                            C49165dm1 dm12 = new C49165dm1();
                            if (bArr5 != null && bArr5.length > 0) {
                                dm12.parseFrom(bArr5);
                            }
                            b232.f130912n.add(dm12);
                        }
                        return 0;
                    case 10:
                        LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                        int size6 = j6.size();
                        for (int i9 = 0; i9 < size6; i9++) {
                            byte[] bArr6 = j6.get(i9);
                            C50497n51 n514 = new C50497n51();
                            if (bArr6 != null && bArr6.length > 0) {
                                n514.parseFrom(bArr6);
                            }
                            b232.f130913o = n514;
                        }
                        return 0;
                    case 11:
                        LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                        int size7 = j7.size();
                        for (int i15 = 0; i15 < size7; i15++) {
                            byte[] bArr7 = j7.get(i15);
                            C51412tl1 tl14 = new C51412tl1();
                            if (bArr7 != null && bArr7.length > 0) {
                                tl14.parseFrom(bArr7);
                            }
                            b232.f130914p = tl14;
                        }
                        return 0;
                    case 12:
                        b232.f130915q.add(Boolean.valueOf(aVar3.mo141625c(intValue)));
                        return 0;
                    default:
                        return -1;
                }
            } else {
                b232.f130916r = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
