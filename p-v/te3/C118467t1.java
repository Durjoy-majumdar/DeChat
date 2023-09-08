package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t1 */
public class C118467t1 extends C47465a {

    /* renamed from: d */
    public fh4 f354392d;

    /* renamed from: e */
    public int f354393e = -1;

    /* renamed from: f */
    public int f354394f = -1;

    /* renamed from: g */
    public String f354395g = "";

    /* renamed from: h */
    public String f354396h = "";

    /* renamed from: i */
    public String f354397i = "";

    /* renamed from: j */
    public long f354398j = 0;

    /* renamed from: n */
    public int f354399n = 0;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118467t1)) {
            return false;
        }
        C118467t1 t1Var = (C118467t1) aVar;
        return C46238a.m51546a(this.f354392d, t1Var.f354392d) && C46238a.m51546a(Integer.valueOf(this.f354393e), Integer.valueOf(t1Var.f354393e)) && C46238a.m51546a(Integer.valueOf(this.f354394f), Integer.valueOf(t1Var.f354394f)) && C46238a.m51546a(this.f354395g, t1Var.f354395g) && C46238a.m51546a(this.f354396h, t1Var.f354396h) && C46238a.m51546a(this.f354397i, t1Var.f354397i) && C46238a.m51546a(Long.valueOf(this.f354398j), Long.valueOf(t1Var.f354398j)) && C46238a.m51546a(Integer.valueOf(this.f354399n), Integer.valueOf(t1Var.f354399n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            fh4 fh4 = this.f354392d;
            if (fh4 != null) {
                aVar.mo74322i(1, fh4.computeSize());
                this.f354392d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f354393e);
            aVar.mo74318e(3, this.f354394f);
            String str = this.f354395g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f354396h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f354397i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74321h(7, this.f354398j);
            aVar.mo74318e(8, this.f354399n);
            return 0;
        } else if (i == 1) {
            fh4 fh42 = this.f354392d;
            if (fh42 != null) {
                i2 = 0 + C52418a.m58682i(1, fh42.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f354393e) + C52418a.m58678e(3, this.f354394f);
            String str4 = this.f354395g;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            String str5 = this.f354396h;
            if (str5 != null) {
                e += C52418a.m58683j(5, str5);
            }
            String str6 = this.f354397i;
            if (str6 != null) {
                e += C52418a.m58683j(6, str6);
            }
            return e + C52418a.m58681h(7, this.f354398j) + C52418a.m58678e(8, this.f354399n);
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
            C118467t1 t1Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        fh4 fh43 = new fh4();
                        if (bArr != null && bArr.length > 0) {
                            fh43.parseFrom(bArr);
                        }
                        t1Var.f354392d = fh43;
                    }
                    return 0;
                case 2:
                    t1Var.f354393e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    t1Var.f354394f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    t1Var.f354395g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    t1Var.f354396h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    t1Var.f354397i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    t1Var.f354398j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    t1Var.f354399n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
