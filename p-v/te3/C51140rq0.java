package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rq0 */
public class C51140rq0 extends C47465a {

    /* renamed from: d */
    public int f141076d;

    /* renamed from: e */
    public int f141077e;

    /* renamed from: f */
    public String f141078f;

    /* renamed from: g */
    public C50579nq0 f141079g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51140rq0)) {
            return false;
        }
        C51140rq0 rq02 = (C51140rq0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f141076d), Integer.valueOf(rq02.f141076d)) && C46238a.m51546a(Integer.valueOf(this.f141077e), Integer.valueOf(rq02.f141077e)) && C46238a.m51546a(this.f141078f, rq02.f141078f) && C46238a.m51546a(this.f141079g, rq02.f141079g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f141076d);
            aVar.mo74318e(2, this.f141077e);
            String str = this.f141078f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C50579nq0 nq02 = this.f141079g;
            if (nq02 != null) {
                aVar.mo74322i(4, nq02.computeSize());
                this.f141079g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f141076d) + 0 + C52418a.m58678e(2, this.f141077e);
            String str2 = this.f141078f;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            C50579nq0 nq03 = this.f141079g;
            return nq03 != null ? e + C52418a.m58682i(4, nq03.computeSize()) : e;
        } else if (i == 2) {
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
            C51140rq0 rq02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                rq02.f141076d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                rq02.f141077e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                rq02.f141078f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50579nq0 nq04 = new C50579nq0();
                    if (bArr != null && bArr.length > 0) {
                        nq04.parseFrom(bArr);
                    }
                    rq02.f141079g = nq04;
                }
                return 0;
            }
        }
    }
}
