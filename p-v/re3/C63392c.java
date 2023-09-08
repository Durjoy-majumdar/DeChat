package re3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: re3.c */
public class C63392c extends C47465a {

    /* renamed from: d */
    public int f179816d;

    /* renamed from: e */
    public int f179817e;

    /* renamed from: f */
    public int f179818f;

    /* renamed from: g */
    public C63402o f179819g;

    /* renamed from: h */
    public C63402o f179820h;

    /* renamed from: i */
    public int f179821i;

    /* renamed from: j */
    public int f179822j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C63392c)) {
            return false;
        }
        C63392c cVar = (C63392c) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f179816d), Integer.valueOf(cVar.f179816d)) && C46238a.m51546a(Integer.valueOf(this.f179817e), Integer.valueOf(cVar.f179817e)) && C46238a.m51546a(Integer.valueOf(this.f179818f), Integer.valueOf(cVar.f179818f)) && C46238a.m51546a(this.f179819g, cVar.f179819g) && C46238a.m51546a(this.f179820h, cVar.f179820h) && C46238a.m51546a(Integer.valueOf(this.f179821i), Integer.valueOf(cVar.f179821i)) && C46238a.m51546a(Integer.valueOf(this.f179822j), Integer.valueOf(cVar.f179822j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f179816d);
            aVar.mo74318e(2, this.f179817e);
            aVar.mo74318e(3, this.f179818f);
            C63402o oVar = this.f179819g;
            if (oVar != null) {
                aVar.mo74322i(4, oVar.computeSize());
                this.f179819g.writeFields(aVar);
            }
            C63402o oVar2 = this.f179820h;
            if (oVar2 != null) {
                aVar.mo74322i(5, oVar2.computeSize());
                this.f179820h.writeFields(aVar);
            }
            aVar.mo74318e(6, this.f179821i);
            aVar.mo74318e(7, this.f179822j);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f179816d) + 0 + C52418a.m58678e(2, this.f179817e) + C52418a.m58678e(3, this.f179818f);
            C63402o oVar3 = this.f179819g;
            if (oVar3 != null) {
                e += C52418a.m58682i(4, oVar3.computeSize());
            }
            C63402o oVar4 = this.f179820h;
            if (oVar4 != null) {
                e += C52418a.m58682i(5, oVar4.computeSize());
            }
            return e + C52418a.m58678e(6, this.f179821i) + C52418a.m58678e(7, this.f179822j);
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
            C63392c cVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    cVar.f179816d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    cVar.f179817e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    cVar.f179818f = aVar3.mo141629g(intValue);
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
                        cVar.f179819g = oVar5;
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
                        cVar.f179820h = oVar6;
                    }
                    return 0;
                case 6:
                    cVar.f179821i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    cVar.f179822j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
