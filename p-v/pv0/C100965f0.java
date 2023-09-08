package pv0;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.f0 */
public class C100965f0 extends C47465a {

    /* renamed from: d */
    public int f295649d;

    /* renamed from: e */
    public int f295650e;

    /* renamed from: f */
    public C100967t f295651f;

    /* renamed from: g */
    public C47535s f295652g;

    /* renamed from: h */
    public C47536u f295653h;

    /* renamed from: i */
    public C62568v f295654i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C100965f0)) {
            return false;
        }
        C100965f0 f0Var = (C100965f0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f295649d), Integer.valueOf(f0Var.f295649d)) && C46238a.m51546a(Integer.valueOf(this.f295650e), Integer.valueOf(f0Var.f295650e)) && C46238a.m51546a(this.f295651f, f0Var.f295651f) && C46238a.m51546a(this.f295652g, f0Var.f295652g) && C46238a.m51546a(this.f295653h, f0Var.f295653h) && C46238a.m51546a(this.f295654i, f0Var.f295654i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f295649d);
            aVar.mo74318e(2, this.f295650e);
            C100967t tVar = this.f295651f;
            if (tVar != null) {
                aVar.mo74322i(3, tVar.computeSize());
                this.f295651f.writeFields(aVar);
            }
            C47535s sVar = this.f295652g;
            if (sVar != null) {
                aVar.mo74322i(4, sVar.computeSize());
                this.f295652g.writeFields(aVar);
            }
            C47536u uVar = this.f295653h;
            if (uVar != null) {
                aVar.mo74322i(5, uVar.computeSize());
                this.f295653h.writeFields(aVar);
            }
            C62568v vVar = this.f295654i;
            if (vVar != null) {
                aVar.mo74322i(6, vVar.computeSize());
                this.f295654i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f295649d) + 0 + C52418a.m58678e(2, this.f295650e);
            C100967t tVar2 = this.f295651f;
            if (tVar2 != null) {
                e += C52418a.m58682i(3, tVar2.computeSize());
            }
            C47535s sVar2 = this.f295652g;
            if (sVar2 != null) {
                e += C52418a.m58682i(4, sVar2.computeSize());
            }
            C47536u uVar2 = this.f295653h;
            if (uVar2 != null) {
                e += C52418a.m58682i(5, uVar2.computeSize());
            }
            C62568v vVar2 = this.f295654i;
            return vVar2 != null ? e + C52418a.m58682i(6, vVar2.computeSize()) : e;
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
            C100965f0 f0Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    f0Var.f295649d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    f0Var.f295650e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C100967t tVar3 = new C100967t();
                        if (bArr != null && bArr.length > 0) {
                            tVar3.parseFrom(bArr);
                        }
                        f0Var.f295651f = tVar3;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C47535s sVar3 = new C47535s();
                        if (bArr2 != null && bArr2.length > 0) {
                            sVar3.parseFrom(bArr2);
                        }
                        f0Var.f295652g = sVar3;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C47536u uVar3 = new C47536u();
                        if (bArr3 != null && bArr3.length > 0) {
                            uVar3.parseFrom(bArr3);
                        }
                        f0Var.f295653h = uVar3;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        C62568v vVar3 = new C62568v();
                        if (bArr4 != null && bArr4.length > 0) {
                            vVar3.parseFrom(bArr4);
                        }
                        f0Var.f295654i = vVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
