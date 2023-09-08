package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nw */
public class C50601nw extends C47465a {

    /* renamed from: d */
    public C51696vh2 f138802d;

    /* renamed from: e */
    public or4 f138803e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50601nw)) {
            return false;
        }
        C50601nw nwVar = (C50601nw) aVar;
        return C46238a.m51546a(this.f138802d, nwVar.f138802d) && C46238a.m51546a(this.f138803e, nwVar.f138803e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51696vh2 vh22 = this.f138802d;
            if (vh22 != null) {
                aVar.mo74322i(1, vh22.computeSize());
                this.f138802d.writeFields(aVar);
            }
            or4 or4 = this.f138803e;
            if (or4 != null) {
                aVar.mo74322i(2, or4.computeSize());
                this.f138803e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C51696vh2 vh23 = this.f138802d;
            if (vh23 != null) {
                i2 = 0 + C52418a.m58682i(1, vh23.computeSize());
            }
            or4 or42 = this.f138803e;
            return or42 != null ? i2 + C52418a.m58682i(2, or42.computeSize()) : i2;
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
            C50601nw nwVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51696vh2 vh24 = new C51696vh2();
                    if (bArr != null && bArr.length > 0) {
                        vh24.parseFrom(bArr);
                    }
                    nwVar.f138802d = vh24;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    or4 or43 = new or4();
                    if (bArr2 != null && bArr2.length > 0) {
                        or43.parseFrom(bArr2);
                    }
                    nwVar.f138803e = or43;
                }
                return 0;
            }
        }
    }
}
