package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.u */
public class C47680u extends C47465a {

    /* renamed from: d */
    public boolean f128043d;

    /* renamed from: e */
    public C47696w3 f128044e;

    /* renamed from: f */
    public C47617l f128045f;

    /* renamed from: g */
    public C47560c5 f128046g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47680u)) {
            return false;
        }
        C47680u uVar = (C47680u) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f128043d), Boolean.valueOf(uVar.f128043d)) && C46238a.m51546a(this.f128044e, uVar.f128044e) && C46238a.m51546a(this.f128045f, uVar.f128045f) && C46238a.m51546a(this.f128046g, uVar.f128046g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f128043d);
            C47696w3 w3Var = this.f128044e;
            if (w3Var != null) {
                aVar.mo74322i(2, w3Var.computeSize());
                this.f128044e.writeFields(aVar);
            }
            C47617l lVar = this.f128045f;
            if (lVar != null) {
                aVar.mo74322i(3, lVar.computeSize());
                this.f128045f.writeFields(aVar);
            }
            C47560c5 c5Var = this.f128046g;
            if (c5Var != null) {
                aVar.mo74322i(4, c5Var.computeSize());
                this.f128046g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f128043d) + 0;
            C47696w3 w3Var2 = this.f128044e;
            if (w3Var2 != null) {
                a += C52418a.m58682i(2, w3Var2.computeSize());
            }
            C47617l lVar2 = this.f128045f;
            if (lVar2 != null) {
                a += C52418a.m58682i(3, lVar2.computeSize());
            }
            C47560c5 c5Var2 = this.f128046g;
            return c5Var2 != null ? a + C52418a.m58682i(4, c5Var2.computeSize()) : a;
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
            C47680u uVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                uVar.f128043d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C47696w3 w3Var3 = new C47696w3();
                    if (bArr != null && bArr.length > 0) {
                        w3Var3.parseFrom(bArr);
                    }
                    uVar.f128044e = w3Var3;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C47617l lVar3 = new C47617l();
                    if (bArr2 != null && bArr2.length > 0) {
                        lVar3.parseFrom(bArr2);
                    }
                    uVar.f128045f = lVar3;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    byte[] bArr3 = j3.get(i4);
                    C47560c5 c5Var3 = new C47560c5();
                    if (bArr3 != null && bArr3.length > 0) {
                        c5Var3.parseFrom(bArr3);
                    }
                    uVar.f128046g = c5Var3;
                }
                return 0;
            }
        }
    }
}
