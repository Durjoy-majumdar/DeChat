package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zk2 */
public class C52278zk2 extends C47465a {

    /* renamed from: d */
    public int f146051d;

    /* renamed from: e */
    public String f146052e;

    /* renamed from: f */
    public String f146053f;

    /* renamed from: g */
    public LinkedList<C52109yf2> f146054g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52278zk2)) {
            return false;
        }
        C52278zk2 zk22 = (C52278zk2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f146051d), Integer.valueOf(zk22.f146051d)) && C46238a.m51546a(this.f146052e, zk22.f146052e) && C46238a.m51546a(this.f146053f, zk22.f146053f) && C46238a.m51546a(this.f146054g, zk22.f146054g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f146051d);
            String str = this.f146052e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f146053f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74320g(4, 8, this.f146054g);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f146051d) + 0;
            String str3 = this.f146052e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f146053f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            return e + C52418a.m58680g(4, 8, this.f146054g);
        } else if (i == 2) {
            this.f146054g.clear();
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
            C52278zk2 zk22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                zk22.f146051d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                zk22.f146052e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                zk22.f146053f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C52109yf2 yf22 = new C52109yf2();
                    if (bArr != null && bArr.length > 0) {
                        yf22.parseFrom(bArr);
                    }
                    zk22.f146054g.add(yf22);
                }
                return 0;
            }
        }
    }
}
