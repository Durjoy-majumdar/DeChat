package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jr0 */
public class C50026jr0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<FinderObject> f136265d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f136266e;

    /* renamed from: f */
    public int f136267f;

    /* renamed from: g */
    public C50497n51 f136268g;

    /* renamed from: h */
    public C51412tl1 f136269h;

    /* renamed from: i */
    public C49599gr0 f136270i;

    /* renamed from: j */
    public int f136271j;

    /* renamed from: n */
    public C89349b f136272n;

    /* renamed from: o */
    public int f136273o;

    /* renamed from: p */
    public boolean f136274p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50026jr0)) {
            return false;
        }
        C50026jr0 jr02 = (C50026jr0) aVar;
        return C46238a.m51546a(this.BaseResponse, jr02.BaseResponse) && C46238a.m51546a(this.f136265d, jr02.f136265d) && C46238a.m51546a(this.f136266e, jr02.f136266e) && C46238a.m51546a(Integer.valueOf(this.f136267f), Integer.valueOf(jr02.f136267f)) && C46238a.m51546a(this.f136268g, jr02.f136268g) && C46238a.m51546a(this.f136269h, jr02.f136269h) && C46238a.m51546a(this.f136270i, jr02.f136270i) && C46238a.m51546a(Integer.valueOf(this.f136271j), Integer.valueOf(jr02.f136271j)) && C46238a.m51546a(this.f136272n, jr02.f136272n) && C46238a.m51546a(Integer.valueOf(this.f136273o), Integer.valueOf(jr02.f136273o)) && C46238a.m51546a(Boolean.valueOf(this.f136274p), Boolean.valueOf(jr02.f136274p));
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
            aVar.mo74320g(2, 8, this.f136265d);
            C89349b bVar = this.f136266e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f136267f);
            C50497n51 n512 = this.f136268g;
            if (n512 != null) {
                aVar.mo74322i(5, n512.computeSize());
                this.f136268g.writeFields(aVar);
            }
            C51412tl1 tl12 = this.f136269h;
            if (tl12 != null) {
                aVar.mo74322i(6, tl12.computeSize());
                this.f136269h.writeFields(aVar);
            }
            C49599gr0 gr02 = this.f136270i;
            if (gr02 != null) {
                aVar.mo74322i(7, gr02.computeSize());
                this.f136270i.writeFields(aVar);
            }
            aVar.mo74318e(8, this.f136271j);
            C89349b bVar2 = this.f136272n;
            if (bVar2 != null) {
                aVar.mo74315b(9, bVar2);
            }
            aVar.mo74318e(10, this.f136273o);
            aVar.mo74314a(11, this.f136274p);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f136265d);
            C89349b bVar3 = this.f136266e;
            if (bVar3 != null) {
                g += C52418a.m58675b(3, bVar3);
            }
            int e = g + C52418a.m58678e(4, this.f136267f);
            C50497n51 n513 = this.f136268g;
            if (n513 != null) {
                e += C52418a.m58682i(5, n513.computeSize());
            }
            C51412tl1 tl13 = this.f136269h;
            if (tl13 != null) {
                e += C52418a.m58682i(6, tl13.computeSize());
            }
            C49599gr0 gr03 = this.f136270i;
            if (gr03 != null) {
                e += C52418a.m58682i(7, gr03.computeSize());
            }
            int e2 = e + C52418a.m58678e(8, this.f136271j);
            C89349b bVar4 = this.f136272n;
            if (bVar4 != null) {
                e2 += C52418a.m58675b(9, bVar4);
            }
            return e2 + C52418a.m58678e(10, this.f136273o) + C52418a.m58674a(11, this.f136274p);
        } else if (i == 2) {
            this.f136265d.clear();
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
            C50026jr0 jr02 = objArr[1];
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
                        jr02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        FinderObject finderObject = new FinderObject();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderObject.parseFrom(bArr2);
                        }
                        jr02.f136265d.add(finderObject);
                    }
                    return 0;
                case 3:
                    jr02.f136266e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    jr02.f136267f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50497n51 n514 = new C50497n51();
                        if (bArr3 != null && bArr3.length > 0) {
                            n514.parseFrom(bArr3);
                        }
                        jr02.f136268g = n514;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51412tl1 tl14 = new C51412tl1();
                        if (bArr4 != null && bArr4.length > 0) {
                            tl14.parseFrom(bArr4);
                        }
                        jr02.f136269h = tl14;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C49599gr0 gr04 = new C49599gr0();
                        if (bArr5 != null && bArr5.length > 0) {
                            gr04.parseFrom(bArr5);
                        }
                        jr02.f136270i = gr04;
                    }
                    return 0;
                case 8:
                    jr02.f136271j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    jr02.f136272n = aVar3.mo141626d(intValue);
                    return 0;
                case 10:
                    jr02.f136273o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    jr02.f136274p = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
