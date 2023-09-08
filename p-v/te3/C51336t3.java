package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t3 */
public class C51336t3 extends C47465a {

    /* renamed from: d */
    public String f141912d;

    /* renamed from: e */
    public C51195s3 f141913e;

    /* renamed from: f */
    public C89349b f141914f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51336t3)) {
            return false;
        }
        C51336t3 t3Var = (C51336t3) aVar;
        return C46238a.m51546a(this.f141912d, t3Var.f141912d) && C46238a.m51546a(this.f141913e, t3Var.f141913e) && C46238a.m51546a(this.f141914f, t3Var.f141914f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141912d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C51195s3 s3Var = this.f141913e;
            if (s3Var != null) {
                aVar.mo74322i(2, s3Var.computeSize());
                this.f141913e.writeFields(aVar);
            }
            C89349b bVar = this.f141914f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f141912d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C51195s3 s3Var2 = this.f141913e;
            if (s3Var2 != null) {
                i2 += C52418a.m58682i(2, s3Var2.computeSize());
            }
            C89349b bVar2 = this.f141914f;
            return bVar2 != null ? i2 + C52418a.m58675b(3, bVar2) : i2;
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
            C51336t3 t3Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                t3Var.f141912d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51195s3 s3Var3 = new C51195s3();
                    if (bArr != null && bArr.length > 0) {
                        s3Var3.parseFrom(bArr);
                    }
                    t3Var.f141913e = s3Var3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                t3Var.f141914f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
