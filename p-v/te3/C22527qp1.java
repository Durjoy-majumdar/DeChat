package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qp1 */
public class C22527qp1 extends C47465a {

    /* renamed from: d */
    public int f64509d = -1;

    /* renamed from: e */
    public C118427eg2 f64510e;

    /* renamed from: f */
    public int f64511f = -1;

    /* renamed from: g */
    public int f64512g = -1;

    /* renamed from: h */
    public boolean f64513h = false;

    /* renamed from: i */
    public int f64514i = -1;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22527qp1)) {
            return false;
        }
        C22527qp1 qp12 = (C22527qp1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f64509d), Integer.valueOf(qp12.f64509d)) && C46238a.m51546a(this.f64510e, qp12.f64510e) && C46238a.m51546a(Integer.valueOf(this.f64511f), Integer.valueOf(qp12.f64511f)) && C46238a.m51546a(Integer.valueOf(this.f64512g), Integer.valueOf(qp12.f64512g)) && C46238a.m51546a(Boolean.valueOf(this.f64513h), Boolean.valueOf(qp12.f64513h)) && C46238a.m51546a(Integer.valueOf(this.f64514i), Integer.valueOf(qp12.f64514i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f64509d);
            C118427eg2 eg22 = this.f64510e;
            if (eg22 != null) {
                aVar.mo74322i(2, eg22.computeSize());
                this.f64510e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f64511f);
            aVar.mo74318e(4, this.f64512g);
            aVar.mo74314a(5, this.f64513h);
            aVar.mo74318e(6, this.f64514i);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f64509d) + 0;
            C118427eg2 eg23 = this.f64510e;
            if (eg23 != null) {
                e += C52418a.m58682i(2, eg23.computeSize());
            }
            return e + C52418a.m58678e(3, this.f64511f) + C52418a.m58678e(4, this.f64512g) + C52418a.m58674a(5, this.f64513h) + C52418a.m58678e(6, this.f64514i);
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
            C22527qp1 qp12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    qp12.f64509d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C118427eg2 eg24 = new C118427eg2();
                        if (bArr != null && bArr.length > 0) {
                            eg24.parseFrom(bArr);
                        }
                        qp12.f64510e = eg24;
                    }
                    return 0;
                case 3:
                    qp12.f64511f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    qp12.f64512g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    qp12.f64513h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    qp12.f64514i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
