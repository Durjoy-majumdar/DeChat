package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import x14.C102536a;
import z14.C53733a;

/* renamed from: te3.jy1 */
public class C50051jy1 extends C49335eu3 {

    /* renamed from: d */
    public int f136381d;

    /* renamed from: e */
    public LinkedList<C50052jy2> f136382e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<Integer> f136383f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<rq4> f136384g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<C49075d04> f136385h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50051jy1)) {
            return false;
        }
        C50051jy1 jy12 = (C50051jy1) aVar;
        return C46238a.m51546a(this.BaseResponse, jy12.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f136381d), Integer.valueOf(jy12.f136381d)) && C46238a.m51546a(this.f136382e, jy12.f136382e) && C46238a.m51546a(this.f136383f, jy12.f136383f) && C46238a.m51546a(this.f136384g, jy12.f136384g) && C46238a.m51546a(this.f136385h, jy12.f136385h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f136381d);
                aVar.mo74320g(3, 8, this.f136382e);
                aVar.mo74324k(4, 2, this.f136383f);
                aVar.mo74320g(5, 8, this.f136384g);
                aVar.mo74320g(6, 8, this.f136385h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f136381d) + C52418a.m58680g(3, 8, this.f136382e) + C52418a.m58684k(4, 2, this.f136383f) + C52418a.m58680g(5, 8, this.f136384g) + C52418a.m58680g(6, 8, this.f136385h);
        } else if (i == 2) {
            this.f136382e.clear();
            this.f136383f.clear();
            this.f136384g.clear();
            this.f136385h.clear();
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
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50051jy1 jy12 = objArr[1];
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
                        jy12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    jy12.f136381d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50052jy2 jy22 = new C50052jy2();
                        if (bArr2 != null && bArr2.length > 0) {
                            jy22.parseFrom(bArr2);
                        }
                        jy12.f136382e.add(jy22);
                    }
                    return 0;
                case 4:
                    byte[] bArr3 = aVar3.mo141626d(intValue).f257327a;
                    C102536a aVar4 = new C102536a(bArr3, 0, bArr3.length);
                    LinkedList<Integer> linkedList = new LinkedList<>();
                    while (aVar4.f301908c < aVar4.f301907b) {
                        linkedList.add(Integer.valueOf(aVar4.mo142153f()));
                    }
                    jy12.f136383f = linkedList;
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr4 = j3.get(i5);
                        rq4 rq4 = new rq4();
                        if (bArr4 != null && bArr4.length > 0) {
                            rq4.parseFrom(bArr4);
                        }
                        jy12.f136384g.add(rq4);
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr5 = j4.get(i6);
                        C49075d04 d042 = new C49075d04();
                        if (bArr5 != null && bArr5.length > 0) {
                            d042.parseFrom(bArr5);
                        }
                        jy12.f136385h.add(d042);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
