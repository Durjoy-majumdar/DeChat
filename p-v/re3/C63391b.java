package re3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: re3.b */
public class C63391b extends C47465a {

    /* renamed from: d */
    public int f179812d;

    /* renamed from: e */
    public int f179813e;

    /* renamed from: f */
    public LinkedList<C63390a> f179814f = new LinkedList<>();

    /* renamed from: g */
    public int f179815g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C63391b)) {
            return false;
        }
        C63391b bVar = (C63391b) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f179812d), Integer.valueOf(bVar.f179812d)) && C46238a.m51546a(Integer.valueOf(this.f179813e), Integer.valueOf(bVar.f179813e)) && C46238a.m51546a(this.f179814f, bVar.f179814f) && C46238a.m51546a(Integer.valueOf(this.f179815g), Integer.valueOf(bVar.f179815g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f179812d);
            aVar.mo74318e(2, this.f179813e);
            aVar.mo74320g(3, 8, this.f179814f);
            aVar.mo74318e(4, this.f179815g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f179812d) + 0 + C52418a.m58678e(2, this.f179813e) + C52418a.m58680g(3, 8, this.f179814f) + C52418a.m58678e(4, this.f179815g);
        } else {
            if (i == 2) {
                this.f179814f.clear();
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
                C63391b bVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    bVar.f179812d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    bVar.f179813e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C63390a aVar4 = new C63390a();
                        if (bArr != null && bArr.length > 0) {
                            aVar4.parseFrom(bArr);
                        }
                        bVar.f179814f.add(aVar4);
                    }
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    bVar.f179815g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
