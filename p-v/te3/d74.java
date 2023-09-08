package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import x14.C102536a;
import z14.C53733a;

public class d74 extends C47465a {

    /* renamed from: d */
    public int f132165d;

    /* renamed from: e */
    public int f132166e;

    /* renamed from: f */
    public int f132167f;

    /* renamed from: g */
    public int f132168g;

    /* renamed from: h */
    public int f132169h;

    /* renamed from: i */
    public LinkedList<Integer> f132170i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof d74)) {
            return false;
        }
        d74 d74 = (d74) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f132165d), Integer.valueOf(d74.f132165d)) && C46238a.m51546a(Integer.valueOf(this.f132166e), Integer.valueOf(d74.f132166e)) && C46238a.m51546a(Integer.valueOf(this.f132167f), Integer.valueOf(d74.f132167f)) && C46238a.m51546a(Integer.valueOf(this.f132168g), Integer.valueOf(d74.f132168g)) && C46238a.m51546a(Integer.valueOf(this.f132169h), Integer.valueOf(d74.f132169h)) && C46238a.m51546a(this.f132170i, d74.f132170i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f132165d);
            aVar.mo74318e(2, this.f132166e);
            aVar.mo74318e(3, this.f132167f);
            aVar.mo74318e(4, this.f132168g);
            aVar.mo74318e(5, this.f132169h);
            aVar.mo74324k(6, 2, this.f132170i);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f132165d) + 0 + C52418a.m58678e(2, this.f132166e) + C52418a.m58678e(3, this.f132167f) + C52418a.m58678e(4, this.f132168g) + C52418a.m58678e(5, this.f132169h) + C52418a.m58684k(6, 2, this.f132170i);
        } else {
            if (i == 2) {
                this.f132170i.clear();
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
                d74 d74 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        d74.f132165d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        d74.f132166e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        d74.f132167f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        d74.f132168g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        d74.f132169h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        byte[] bArr = aVar3.mo141626d(intValue).f257327a;
                        C102536a aVar4 = new C102536a(bArr, 0, bArr.length);
                        LinkedList<Integer> linkedList = new LinkedList<>();
                        while (aVar4.f301908c < aVar4.f301907b) {
                            linkedList.add(Integer.valueOf(aVar4.mo142153f()));
                        }
                        d74.f132170i = linkedList;
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
