package ve3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.n0 */
public class C65685n0 extends C47465a {

    /* renamed from: d */
    public int f189020d;

    /* renamed from: e */
    public C65681f0 f189021e;

    /* renamed from: f */
    public C65682g f189022f;

    /* renamed from: g */
    public int f189023g;

    /* renamed from: h */
    public boolean f189024h;

    /* renamed from: i */
    public String f189025i;

    /* renamed from: j */
    public C52824a1 f189026j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C65685n0)) {
            return false;
        }
        C65685n0 n0Var = (C65685n0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f189020d), Integer.valueOf(n0Var.f189020d)) && C46238a.m51546a(this.f189021e, n0Var.f189021e) && C46238a.m51546a(this.f189022f, n0Var.f189022f) && C46238a.m51546a(Integer.valueOf(this.f189023g), Integer.valueOf(n0Var.f189023g)) && C46238a.m51546a(Boolean.valueOf(this.f189024h), Boolean.valueOf(n0Var.f189024h)) && C46238a.m51546a(this.f189025i, n0Var.f189025i) && C46238a.m51546a(this.f189026j, n0Var.f189026j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f189020d);
            C65681f0 f0Var = this.f189021e;
            if (f0Var != null) {
                aVar.mo74322i(2, f0Var.computeSize());
                this.f189021e.writeFields(aVar);
            }
            C65682g gVar = this.f189022f;
            if (gVar != null) {
                aVar.mo74322i(3, gVar.computeSize());
                this.f189022f.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f189023g);
            aVar.mo74314a(5, this.f189024h);
            String str = this.f189025i;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            C52824a1 a1Var = this.f189026j;
            if (a1Var != null) {
                aVar.mo74322i(7, a1Var.computeSize());
                this.f189026j.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f189020d) + 0;
            C65681f0 f0Var2 = this.f189021e;
            if (f0Var2 != null) {
                e += C52418a.m58682i(2, f0Var2.computeSize());
            }
            C65682g gVar2 = this.f189022f;
            if (gVar2 != null) {
                e += C52418a.m58682i(3, gVar2.computeSize());
            }
            int e2 = e + C52418a.m58678e(4, this.f189023g) + C52418a.m58674a(5, this.f189024h);
            String str2 = this.f189025i;
            if (str2 != null) {
                e2 += C52418a.m58683j(6, str2);
            }
            C52824a1 a1Var2 = this.f189026j;
            return a1Var2 != null ? e2 + C52418a.m58682i(7, a1Var2.computeSize()) : e2;
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
            C65685n0 n0Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    n0Var.f189020d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C65681f0 f0Var3 = new C65681f0();
                        if (bArr != null && bArr.length > 0) {
                            f0Var3.parseFrom(bArr);
                        }
                        n0Var.f189021e = f0Var3;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C65682g gVar3 = new C65682g();
                        if (bArr2 != null && bArr2.length > 0) {
                            gVar3.parseFrom(bArr2);
                        }
                        n0Var.f189022f = gVar3;
                    }
                    return 0;
                case 4:
                    n0Var.f189023g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    n0Var.f189024h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    n0Var.f189025i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C52824a1 a1Var3 = new C52824a1();
                        if (bArr3 != null && bArr3.length > 0) {
                            a1Var3.parseFrom(bArr3);
                        }
                        n0Var.f189026j = a1Var3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
