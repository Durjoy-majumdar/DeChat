package re3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: re3.h */
public class C63397h extends C47465a {

    /* renamed from: d */
    public int f179851d;

    /* renamed from: e */
    public int f179852e;

    /* renamed from: f */
    public int f179853f;

    /* renamed from: g */
    public C63402o f179854g;

    /* renamed from: h */
    public C63402o f179855h;

    /* renamed from: i */
    public int f179856i;

    /* renamed from: j */
    public int f179857j;

    /* renamed from: n */
    public int f179858n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C63397h)) {
            return false;
        }
        C63397h hVar = (C63397h) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f179851d), Integer.valueOf(hVar.f179851d)) && C46238a.m51546a(Integer.valueOf(this.f179852e), Integer.valueOf(hVar.f179852e)) && C46238a.m51546a(Integer.valueOf(this.f179853f), Integer.valueOf(hVar.f179853f)) && C46238a.m51546a(this.f179854g, hVar.f179854g) && C46238a.m51546a(this.f179855h, hVar.f179855h) && C46238a.m51546a(Integer.valueOf(this.f179856i), Integer.valueOf(hVar.f179856i)) && C46238a.m51546a(Integer.valueOf(this.f179857j), Integer.valueOf(hVar.f179857j)) && C46238a.m51546a(Integer.valueOf(this.f179858n), Integer.valueOf(hVar.f179858n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f179851d);
            aVar.mo74318e(2, this.f179852e);
            aVar.mo74318e(3, this.f179853f);
            C63402o oVar = this.f179854g;
            if (oVar != null) {
                aVar.mo74322i(4, oVar.computeSize());
                this.f179854g.writeFields(aVar);
            }
            C63402o oVar2 = this.f179855h;
            if (oVar2 != null) {
                aVar.mo74322i(5, oVar2.computeSize());
                this.f179855h.writeFields(aVar);
            }
            aVar.mo74318e(6, this.f179856i);
            aVar.mo74318e(7, this.f179857j);
            aVar.mo74318e(8, this.f179858n);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f179851d) + 0 + C52418a.m58678e(2, this.f179852e) + C52418a.m58678e(3, this.f179853f);
            C63402o oVar3 = this.f179854g;
            if (oVar3 != null) {
                e += C52418a.m58682i(4, oVar3.computeSize());
            }
            C63402o oVar4 = this.f179855h;
            if (oVar4 != null) {
                e += C52418a.m58682i(5, oVar4.computeSize());
            }
            return e + C52418a.m58678e(6, this.f179856i) + C52418a.m58678e(7, this.f179857j) + C52418a.m58678e(8, this.f179858n);
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
            C63397h hVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    hVar.f179851d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    hVar.f179852e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    hVar.f179853f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C63402o oVar5 = new C63402o();
                        if (bArr != null && bArr.length > 0) {
                            oVar5.parseFrom(bArr);
                        }
                        hVar.f179854g = oVar5;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C63402o oVar6 = new C63402o();
                        if (bArr2 != null && bArr2.length > 0) {
                            oVar6.parseFrom(bArr2);
                        }
                        hVar.f179855h = oVar6;
                    }
                    return 0;
                case 6:
                    hVar.f179856i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    hVar.f179857j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    hVar.f179858n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
