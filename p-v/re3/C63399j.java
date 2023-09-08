package re3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: re3.j */
public class C63399j extends C47465a {

    /* renamed from: d */
    public int f179864d;

    /* renamed from: e */
    public int f179865e;

    /* renamed from: f */
    public int f179866f;

    /* renamed from: g */
    public int f179867g;

    /* renamed from: h */
    public C63402o f179868h;

    /* renamed from: i */
    public C63402o f179869i;

    /* renamed from: j */
    public C63402o f179870j;

    /* renamed from: n */
    public int f179871n;

    /* renamed from: o */
    public int f179872o;

    /* renamed from: p */
    public int f179873p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C63399j)) {
            return false;
        }
        C63399j jVar = (C63399j) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f179864d), Integer.valueOf(jVar.f179864d)) && C46238a.m51546a(Integer.valueOf(this.f179865e), Integer.valueOf(jVar.f179865e)) && C46238a.m51546a(Integer.valueOf(this.f179866f), Integer.valueOf(jVar.f179866f)) && C46238a.m51546a(Integer.valueOf(this.f179867g), Integer.valueOf(jVar.f179867g)) && C46238a.m51546a(this.f179868h, jVar.f179868h) && C46238a.m51546a(this.f179869i, jVar.f179869i) && C46238a.m51546a(this.f179870j, jVar.f179870j) && C46238a.m51546a(Integer.valueOf(this.f179871n), Integer.valueOf(jVar.f179871n)) && C46238a.m51546a(Integer.valueOf(this.f179872o), Integer.valueOf(jVar.f179872o)) && C46238a.m51546a(Integer.valueOf(this.f179873p), Integer.valueOf(jVar.f179873p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f179864d);
            aVar.mo74318e(2, this.f179865e);
            aVar.mo74318e(3, this.f179866f);
            aVar.mo74318e(4, this.f179867g);
            C63402o oVar = this.f179868h;
            if (oVar != null) {
                aVar.mo74322i(5, oVar.computeSize());
                this.f179868h.writeFields(aVar);
            }
            C63402o oVar2 = this.f179869i;
            if (oVar2 != null) {
                aVar.mo74322i(6, oVar2.computeSize());
                this.f179869i.writeFields(aVar);
            }
            C63402o oVar3 = this.f179870j;
            if (oVar3 != null) {
                aVar.mo74322i(7, oVar3.computeSize());
                this.f179870j.writeFields(aVar);
            }
            aVar.mo74318e(8, this.f179871n);
            aVar.mo74318e(9, this.f179872o);
            aVar.mo74318e(10, this.f179873p);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f179864d) + 0 + C52418a.m58678e(2, this.f179865e) + C52418a.m58678e(3, this.f179866f) + C52418a.m58678e(4, this.f179867g);
            C63402o oVar4 = this.f179868h;
            if (oVar4 != null) {
                e += C52418a.m58682i(5, oVar4.computeSize());
            }
            C63402o oVar5 = this.f179869i;
            if (oVar5 != null) {
                e += C52418a.m58682i(6, oVar5.computeSize());
            }
            C63402o oVar6 = this.f179870j;
            if (oVar6 != null) {
                e += C52418a.m58682i(7, oVar6.computeSize());
            }
            return e + C52418a.m58678e(8, this.f179871n) + C52418a.m58678e(9, this.f179872o) + C52418a.m58678e(10, this.f179873p);
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
            C63399j jVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    jVar.f179864d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    jVar.f179865e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    jVar.f179866f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    jVar.f179867g = aVar3.mo141629g(intValue);
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
                        jVar.f179868h = oVar7;
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
                        jVar.f179869i = oVar8;
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
                        jVar.f179870j = oVar9;
                    }
                    return 0;
                case 8:
                    jVar.f179871n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    jVar.f179872o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    jVar.f179873p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
