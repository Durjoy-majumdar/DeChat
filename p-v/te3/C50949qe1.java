package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qe1 */
public class C50949qe1 extends C47465a {

    /* renamed from: d */
    public long f140257d;

    /* renamed from: e */
    public String f140258e;

    /* renamed from: f */
    public LinkedList<C50668oe1> f140259f = new LinkedList<>();

    /* renamed from: g */
    public int f140260g;

    /* renamed from: h */
    public int f140261h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50949qe1)) {
            return false;
        }
        C50949qe1 qe12 = (C50949qe1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f140257d), Long.valueOf(qe12.f140257d)) && C46238a.m51546a(this.f140258e, qe12.f140258e) && C46238a.m51546a(this.f140259f, qe12.f140259f) && C46238a.m51546a(Integer.valueOf(this.f140260g), Integer.valueOf(qe12.f140260g)) && C46238a.m51546a(Integer.valueOf(this.f140261h), Integer.valueOf(qe12.f140261h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f140257d);
            String str = this.f140258e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 8, this.f140259f);
            aVar.mo74318e(4, this.f140260g);
            aVar.mo74318e(5, this.f140261h);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f140257d) + 0;
            String str2 = this.f140258e;
            if (str2 != null) {
                h += C52418a.m58683j(2, str2);
            }
            return h + C52418a.m58680g(3, 8, this.f140259f) + C52418a.m58678e(4, this.f140260g) + C52418a.m58678e(5, this.f140261h);
        } else if (i == 2) {
            this.f140259f.clear();
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
            C50949qe1 qe12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                qe12.f140257d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                qe12.f140258e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50668oe1 oe12 = new C50668oe1();
                    if (bArr != null && bArr.length > 0) {
                        oe12.parseFrom(bArr);
                    }
                    qe12.f140259f.add(oe12);
                }
                return 0;
            } else if (intValue == 4) {
                qe12.f140260g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                qe12.f140261h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
