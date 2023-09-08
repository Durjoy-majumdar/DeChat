package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p1 */
public class C50765p1 extends C47465a {

    /* renamed from: d */
    public LinkedList<C50619o1> f139491d = new LinkedList<>();

    /* renamed from: e */
    public zf4 f139492e;

    /* renamed from: f */
    public int f139493f;

    /* renamed from: g */
    public zf4 f139494g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50765p1)) {
            return false;
        }
        C50765p1 p1Var = (C50765p1) aVar;
        return C46238a.m51546a(this.f139491d, p1Var.f139491d) && C46238a.m51546a(this.f139492e, p1Var.f139492e) && C46238a.m51546a(Integer.valueOf(this.f139493f), Integer.valueOf(p1Var.f139493f)) && C46238a.m51546a(this.f139494g, p1Var.f139494g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f139491d);
            zf4 zf4 = this.f139492e;
            if (zf4 != null) {
                aVar.mo74322i(2, zf4.computeSize());
                this.f139492e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f139493f);
            zf4 zf42 = this.f139494g;
            if (zf42 != null) {
                aVar.mo74322i(4, zf42.computeSize());
                this.f139494g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f139491d) + 0;
            zf4 zf43 = this.f139492e;
            if (zf43 != null) {
                g += C52418a.m58682i(2, zf43.computeSize());
            }
            int e = g + C52418a.m58678e(3, this.f139493f);
            zf4 zf44 = this.f139494g;
            return zf44 != null ? e + C52418a.m58682i(4, zf44.computeSize()) : e;
        } else if (i == 2) {
            this.f139491d.clear();
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
            C50765p1 p1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50619o1 o1Var = new C50619o1();
                    if (bArr != null && bArr.length > 0) {
                        o1Var.parseFrom(bArr);
                    }
                    p1Var.f139491d.add(o1Var);
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    zf4 zf45 = new zf4();
                    if (bArr2 != null && bArr2.length > 0) {
                        zf45.parseFrom(bArr2);
                    }
                    p1Var.f139492e = zf45;
                }
                return 0;
            } else if (intValue == 3) {
                p1Var.f139493f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    byte[] bArr3 = j3.get(i4);
                    zf4 zf46 = new zf4();
                    if (bArr3 != null && bArr3.length > 0) {
                        zf46.parseFrom(bArr3);
                    }
                    p1Var.f139494g = zf46;
                }
                return 0;
            }
        }
    }
}
