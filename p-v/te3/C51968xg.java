package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xg */
public class C51968xg extends C47465a {

    /* renamed from: d */
    public LinkedList<C51859wo> f144634d = new LinkedList<>();

    /* renamed from: e */
    public int f144635e;

    /* renamed from: f */
    public LinkedList<C51717vo> f144636f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51968xg)) {
            return false;
        }
        C51968xg xgVar = (C51968xg) aVar;
        return C46238a.m51546a(this.f144634d, xgVar.f144634d) && C46238a.m51546a(Integer.valueOf(this.f144635e), Integer.valueOf(xgVar.f144635e)) && C46238a.m51546a(this.f144636f, xgVar.f144636f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f144634d);
            aVar.mo74318e(2, this.f144635e);
            aVar.mo74320g(3, 8, this.f144636f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f144634d) + 0 + C52418a.m58678e(2, this.f144635e) + C52418a.m58680g(3, 8, this.f144636f);
        } else {
            if (i == 2) {
                this.f144634d.clear();
                this.f144636f.clear();
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
                C51968xg xgVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51859wo woVar = new C51859wo();
                        if (bArr != null && bArr.length > 0) {
                            woVar.parseFrom(bArr);
                        }
                        xgVar.f144634d.add(woVar);
                    }
                    return 0;
                } else if (intValue == 2) {
                    xgVar.f144635e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C51717vo voVar = new C51717vo();
                        if (bArr2 != null && bArr2.length > 0) {
                            voVar.parseFrom(bArr2);
                        }
                        xgVar.f144636f.add(voVar);
                    }
                    return 0;
                }
            }
        }
    }
}
