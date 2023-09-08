package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oq1 */
public class C118454oq1 extends C47465a {

    /* renamed from: d */
    public fh4 f354210d;

    /* renamed from: e */
    public String f354211e = "";

    /* renamed from: f */
    public long f354212f = 0;

    /* renamed from: g */
    public int f354213g = 0;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118454oq1)) {
            return false;
        }
        C118454oq1 oq12 = (C118454oq1) aVar;
        return C46238a.m51546a(this.f354210d, oq12.f354210d) && C46238a.m51546a(this.f354211e, oq12.f354211e) && C46238a.m51546a(Long.valueOf(this.f354212f), Long.valueOf(oq12.f354212f)) && C46238a.m51546a(Integer.valueOf(this.f354213g), Integer.valueOf(oq12.f354213g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            fh4 fh4 = this.f354210d;
            if (fh4 != null) {
                aVar.mo74322i(1, fh4.computeSize());
                this.f354210d.writeFields(aVar);
            }
            String str = this.f354211e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f354212f);
            aVar.mo74318e(4, this.f354213g);
            return 0;
        } else if (i == 1) {
            fh4 fh42 = this.f354210d;
            if (fh42 != null) {
                i2 = 0 + C52418a.m58682i(1, fh42.computeSize());
            }
            String str2 = this.f354211e;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58681h(3, this.f354212f) + C52418a.m58678e(4, this.f354213g);
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
            C118454oq1 oq12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    fh4 fh43 = new fh4();
                    if (bArr != null && bArr.length > 0) {
                        fh43.parseFrom(bArr);
                    }
                    oq12.f354210d = fh43;
                }
                return 0;
            } else if (intValue == 2) {
                oq12.f354211e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                oq12.f354212f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                oq12.f354213g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
