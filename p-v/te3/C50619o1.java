package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o1 */
public class C50619o1 extends C47465a {

    /* renamed from: d */
    public zf4 f138892d;

    /* renamed from: e */
    public zf4 f138893e;

    /* renamed from: f */
    public C50456mv3 f138894f;

    /* renamed from: g */
    public C50059k00 f138895g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50619o1)) {
            return false;
        }
        C50619o1 o1Var = (C50619o1) aVar;
        return C46238a.m51546a(this.f138892d, o1Var.f138892d) && C46238a.m51546a(this.f138893e, o1Var.f138893e) && C46238a.m51546a(this.f138894f, o1Var.f138894f) && C46238a.m51546a(this.f138895g, o1Var.f138895g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            zf4 zf4 = this.f138892d;
            if (zf4 != null) {
                aVar.mo74322i(1, zf4.computeSize());
                this.f138892d.writeFields(aVar);
            }
            zf4 zf42 = this.f138893e;
            if (zf42 != null) {
                aVar.mo74322i(2, zf42.computeSize());
                this.f138893e.writeFields(aVar);
            }
            C50456mv3 mv32 = this.f138894f;
            if (mv32 != null) {
                aVar.mo74322i(3, mv32.computeSize());
                this.f138894f.writeFields(aVar);
            }
            C50059k00 k002 = this.f138895g;
            if (k002 != null) {
                aVar.mo74322i(4, k002.computeSize());
                this.f138895g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            zf4 zf43 = this.f138892d;
            if (zf43 != null) {
                i2 = 0 + C52418a.m58682i(1, zf43.computeSize());
            }
            zf4 zf44 = this.f138893e;
            if (zf44 != null) {
                i2 += C52418a.m58682i(2, zf44.computeSize());
            }
            C50456mv3 mv33 = this.f138894f;
            if (mv33 != null) {
                i2 += C52418a.m58682i(3, mv33.computeSize());
            }
            C50059k00 k003 = this.f138895g;
            return k003 != null ? i2 + C52418a.m58682i(4, k003.computeSize()) : i2;
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
            C50619o1 o1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    zf4 zf45 = new zf4();
                    if (bArr != null && bArr.length > 0) {
                        zf45.parseFrom(bArr);
                    }
                    o1Var.f138892d = zf45;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    zf4 zf46 = new zf4();
                    if (bArr2 != null && bArr2.length > 0) {
                        zf46.parseFrom(bArr2);
                    }
                    o1Var.f138893e = zf46;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C50456mv3 mv34 = new C50456mv3();
                    if (bArr3 != null && bArr3.length > 0) {
                        mv34.parseFrom(bArr3);
                    }
                    o1Var.f138894f = mv34;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C50059k00 k004 = new C50059k00();
                    if (bArr4 != null && bArr4.length > 0) {
                        k004.parseFrom(bArr4);
                    }
                    o1Var.f138895g = k004;
                }
                return 0;
            }
        }
    }
}
