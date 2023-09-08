package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ge1 */
public class C49548ge1 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C48682a91> f133994d = new LinkedList<>();

    /* renamed from: e */
    public C50497n51 f133995e;

    /* renamed from: f */
    public int f133996f;

    /* renamed from: g */
    public C89349b f133997g;

    /* renamed from: h */
    public int f133998h;

    /* renamed from: i */
    public C89349b f133999i;

    /* renamed from: j */
    public boolean f134000j;

    /* renamed from: n */
    public boolean f134001n;

    /* renamed from: o */
    public int f134002o;

    /* renamed from: p */
    public boolean f134003p;

    /* renamed from: q */
    public int f134004q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49548ge1)) {
            return false;
        }
        C49548ge1 ge12 = (C49548ge1) aVar;
        return C46238a.m51546a(this.BaseResponse, ge12.BaseResponse) && C46238a.m51546a(this.f133994d, ge12.f133994d) && C46238a.m51546a(this.f133995e, ge12.f133995e) && C46238a.m51546a(Integer.valueOf(this.f133996f), Integer.valueOf(ge12.f133996f)) && C46238a.m51546a(this.f133997g, ge12.f133997g) && C46238a.m51546a(Integer.valueOf(this.f133998h), Integer.valueOf(ge12.f133998h)) && C46238a.m51546a(this.f133999i, ge12.f133999i) && C46238a.m51546a(Boolean.valueOf(this.f134000j), Boolean.valueOf(ge12.f134000j)) && C46238a.m51546a(Boolean.valueOf(this.f134001n), Boolean.valueOf(ge12.f134001n)) && C46238a.m51546a(Integer.valueOf(this.f134002o), Integer.valueOf(ge12.f134002o)) && C46238a.m51546a(Boolean.valueOf(this.f134003p), Boolean.valueOf(ge12.f134003p)) && C46238a.m51546a(Integer.valueOf(this.f134004q), Integer.valueOf(ge12.f134004q));
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
            aVar.mo74320g(2, 8, this.f133994d);
            C50497n51 n512 = this.f133995e;
            if (n512 != null) {
                aVar.mo74322i(3, n512.computeSize());
                this.f133995e.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f133996f);
            C89349b bVar = this.f133997g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            aVar.mo74318e(6, this.f133998h);
            C89349b bVar2 = this.f133999i;
            if (bVar2 != null) {
                aVar.mo74315b(7, bVar2);
            }
            aVar.mo74314a(8, this.f134000j);
            aVar.mo74314a(9, this.f134001n);
            aVar.mo74318e(11, this.f134002o);
            aVar.mo74314a(12, this.f134003p);
            aVar.mo74318e(13, this.f134004q);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f133994d);
            C50497n51 n513 = this.f133995e;
            if (n513 != null) {
                g += C52418a.m58682i(3, n513.computeSize());
            }
            int e = g + C52418a.m58678e(4, this.f133996f);
            C89349b bVar3 = this.f133997g;
            if (bVar3 != null) {
                e += C52418a.m58675b(5, bVar3);
            }
            int e2 = e + C52418a.m58678e(6, this.f133998h);
            C89349b bVar4 = this.f133999i;
            if (bVar4 != null) {
                e2 += C52418a.m58675b(7, bVar4);
            }
            return e2 + C52418a.m58674a(8, this.f134000j) + C52418a.m58674a(9, this.f134001n) + C52418a.m58678e(11, this.f134002o) + C52418a.m58674a(12, this.f134003p) + C52418a.m58678e(13, this.f134004q);
        } else if (i == 2) {
            this.f133994d.clear();
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
            C49548ge1 ge12 = objArr[1];
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
                        ge12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C48682a91 a912 = new C48682a91();
                        if (bArr2 != null && bArr2.length > 0) {
                            a912.parseFrom(bArr2);
                        }
                        ge12.f133994d.add(a912);
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50497n51 n514 = new C50497n51();
                        if (bArr3 != null && bArr3.length > 0) {
                            n514.parseFrom(bArr3);
                        }
                        ge12.f133995e = n514;
                    }
                    return 0;
                case 4:
                    ge12.f133996f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ge12.f133997g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    ge12.f133998h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ge12.f133999i = aVar3.mo141626d(intValue);
                    return 0;
                case 8:
                    ge12.f134000j = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    ge12.f134001n = aVar3.mo141625c(intValue);
                    return 0;
                case 11:
                    ge12.f134002o = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    ge12.f134003p = aVar3.mo141625c(intValue);
                    return 0;
                case 13:
                    ge12.f134004q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
