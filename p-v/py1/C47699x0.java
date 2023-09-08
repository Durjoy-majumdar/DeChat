package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.x0 */
public class C47699x0 extends C47465a {

    /* renamed from: d */
    public C47589h f128130d;

    /* renamed from: e */
    public C47711z0 f128131e;

    /* renamed from: f */
    public C47705y0 f128132f;

    /* renamed from: g */
    public String f128133g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47699x0)) {
            return false;
        }
        C47699x0 x0Var = (C47699x0) aVar;
        return C46238a.m51546a(this.f128130d, x0Var.f128130d) && C46238a.m51546a(this.f128131e, x0Var.f128131e) && C46238a.m51546a(this.f128132f, x0Var.f128132f) && C46238a.m51546a(this.f128133g, x0Var.f128133g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C47589h hVar = this.f128130d;
            if (hVar != null) {
                if (hVar != null) {
                    aVar.mo74322i(1, hVar.computeSize());
                    this.f128130d.writeFields(aVar);
                }
                C47711z0 z0Var = this.f128131e;
                if (z0Var != null) {
                    aVar.mo74322i(2, z0Var.computeSize());
                    this.f128131e.writeFields(aVar);
                }
                C47705y0 y0Var = this.f128132f;
                if (y0Var != null) {
                    aVar.mo74322i(3, y0Var.computeSize());
                    this.f128132f.writeFields(aVar);
                }
                String str = this.f128133g;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: AppItem");
        } else if (i == 1) {
            C47589h hVar2 = this.f128130d;
            if (hVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, hVar2.computeSize());
            }
            C47711z0 z0Var2 = this.f128131e;
            if (z0Var2 != null) {
                i2 += C52418a.m58682i(2, z0Var2.computeSize());
            }
            C47705y0 y0Var2 = this.f128132f;
            if (y0Var2 != null) {
                i2 += C52418a.m58682i(3, y0Var2.computeSize());
            }
            String str2 = this.f128133g;
            return str2 != null ? i2 + C52418a.m58683j(4, str2) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f128130d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: AppItem");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47699x0 x0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C47589h hVar3 = new C47589h();
                    if (bArr != null && bArr.length > 0) {
                        hVar3.parseFrom(bArr);
                    }
                    x0Var.f128130d = hVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C47711z0 z0Var3 = new C47711z0();
                    if (bArr2 != null && bArr2.length > 0) {
                        z0Var3.parseFrom(bArr2);
                    }
                    x0Var.f128131e = z0Var3;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C47705y0 y0Var3 = new C47705y0();
                    if (bArr3 != null && bArr3.length > 0) {
                        y0Var3.parseFrom(bArr3);
                    }
                    x0Var.f128132f = y0Var3;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                x0Var.f128133g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
