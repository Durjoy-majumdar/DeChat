package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n40 */
public class C77968n40 extends C47465a {

    /* renamed from: d */
    public String f227877d;

    /* renamed from: e */
    public String f227878e;

    /* renamed from: f */
    public int f227879f;

    /* renamed from: g */
    public LinkedList<C22498fy> f227880g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77968n40)) {
            return false;
        }
        C77968n40 n402 = (C77968n40) aVar;
        return C46238a.m51546a(this.f227877d, n402.f227877d) && C46238a.m51546a(this.f227878e, n402.f227878e) && C46238a.m51546a(Integer.valueOf(this.f227879f), Integer.valueOf(n402.f227879f)) && C46238a.m51546a(this.f227880g, n402.f227880g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f227877d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f227878e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f227879f);
            aVar.mo74320g(4, 8, this.f227880g);
            return 0;
        } else if (i == 1) {
            String str3 = this.f227877d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f227878e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f227879f) + C52418a.m58680g(4, 8, this.f227880g);
        } else if (i == 2) {
            this.f227880g.clear();
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
            C77968n40 n402 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                n402.f227877d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                n402.f227878e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                n402.f227879f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C22498fy fyVar = new C22498fy();
                    if (bArr != null && bArr.length > 0) {
                        fyVar.parseFrom(bArr);
                    }
                    n402.f227880g.add(fyVar);
                }
                return 0;
            }
        }
    }
}
