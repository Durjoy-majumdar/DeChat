package re3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: re3.f */
public class C63395f extends C47465a {

    /* renamed from: d */
    public int f179838d;

    /* renamed from: e */
    public int f179839e;

    /* renamed from: f */
    public int f179840f;

    /* renamed from: g */
    public int f179841g;

    /* renamed from: h */
    public C63402o f179842h;

    /* renamed from: i */
    public C63402o f179843i;

    /* renamed from: j */
    public C63402o f179844j;

    /* renamed from: n */
    public int f179845n;

    /* renamed from: o */
    public int f179846o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C63395f)) {
            return false;
        }
        C63395f fVar = (C63395f) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f179838d), Integer.valueOf(fVar.f179838d)) && C46238a.m51546a(Integer.valueOf(this.f179839e), Integer.valueOf(fVar.f179839e)) && C46238a.m51546a(Integer.valueOf(this.f179840f), Integer.valueOf(fVar.f179840f)) && C46238a.m51546a(Integer.valueOf(this.f179841g), Integer.valueOf(fVar.f179841g)) && C46238a.m51546a(this.f179842h, fVar.f179842h) && C46238a.m51546a(this.f179843i, fVar.f179843i) && C46238a.m51546a(this.f179844j, fVar.f179844j) && C46238a.m51546a(Integer.valueOf(this.f179845n), Integer.valueOf(fVar.f179845n)) && C46238a.m51546a(Integer.valueOf(this.f179846o), Integer.valueOf(fVar.f179846o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f179838d);
            aVar.mo74318e(2, this.f179839e);
            aVar.mo74318e(3, this.f179840f);
            aVar.mo74318e(4, this.f179841g);
            C63402o oVar = this.f179842h;
            if (oVar != null) {
                aVar.mo74322i(5, oVar.computeSize());
                this.f179842h.writeFields(aVar);
            }
            C63402o oVar2 = this.f179843i;
            if (oVar2 != null) {
                aVar.mo74322i(6, oVar2.computeSize());
                this.f179843i.writeFields(aVar);
            }
            C63402o oVar3 = this.f179844j;
            if (oVar3 != null) {
                aVar.mo74322i(7, oVar3.computeSize());
                this.f179844j.writeFields(aVar);
            }
            aVar.mo74318e(8, this.f179845n);
            aVar.mo74318e(9, this.f179846o);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f179838d) + 0 + C52418a.m58678e(2, this.f179839e) + C52418a.m58678e(3, this.f179840f) + C52418a.m58678e(4, this.f179841g);
            C63402o oVar4 = this.f179842h;
            if (oVar4 != null) {
                e += C52418a.m58682i(5, oVar4.computeSize());
            }
            C63402o oVar5 = this.f179843i;
            if (oVar5 != null) {
                e += C52418a.m58682i(6, oVar5.computeSize());
            }
            C63402o oVar6 = this.f179844j;
            if (oVar6 != null) {
                e += C52418a.m58682i(7, oVar6.computeSize());
            }
            return e + C52418a.m58678e(8, this.f179845n) + C52418a.m58678e(9, this.f179846o);
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
            C63395f fVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    fVar.f179838d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    fVar.f179839e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    fVar.f179840f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    fVar.f179841g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C63402o oVar7 = new C63402o();
                        if (bArr != null && bArr.length > 0) {
                            oVar7.parseFrom(bArr);
                        }
                        fVar.f179842h = oVar7;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C63402o oVar8 = new C63402o();
                        if (bArr2 != null && bArr2.length > 0) {
                            oVar8.parseFrom(bArr2);
                        }
                        fVar.f179843i = oVar8;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C63402o oVar9 = new C63402o();
                        if (bArr3 != null && bArr3.length > 0) {
                            oVar9.parseFrom(bArr3);
                        }
                        fVar.f179844j = oVar9;
                    }
                    return 0;
                case 8:
                    fVar.f179845n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    fVar.f179846o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
