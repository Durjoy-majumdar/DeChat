package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s9 */
public class C64705s9 extends C47465a {

    /* renamed from: d */
    public String f185386d;

    /* renamed from: e */
    public LinkedList<C64862yp3> f185387e = new LinkedList<>();

    /* renamed from: f */
    public w54 f185388f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64705s9)) {
            return false;
        }
        C64705s9 s9Var = (C64705s9) aVar;
        return C46238a.m51546a(this.f185386d, s9Var.f185386d) && C46238a.m51546a(this.f185387e, s9Var.f185387e) && C46238a.m51546a(this.f185388f, s9Var.f185388f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185386d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f185387e);
            w54 w54 = this.f185388f;
            if (w54 != null) {
                aVar.mo74322i(3, w54.computeSize());
                this.f185388f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f185386d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f185387e);
            w54 w542 = this.f185388f;
            return w542 != null ? g + C52418a.m58682i(3, w542.computeSize()) : g;
        } else if (i == 2) {
            this.f185387e.clear();
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
            C64705s9 s9Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                s9Var.f185386d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64862yp3 yp32 = new C64862yp3();
                    if (bArr != null && bArr.length > 0) {
                        yp32.parseFrom(bArr);
                    }
                    s9Var.f185387e.add(yp32);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    w54 w543 = new w54();
                    if (bArr2 != null && bArr2.length > 0) {
                        w543.parseFrom(bArr2);
                    }
                    s9Var.f185388f = w543;
                }
                return 0;
            }
        }
    }
}
