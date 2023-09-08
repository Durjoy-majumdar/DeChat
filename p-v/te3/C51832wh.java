package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wh */
public class C51832wh extends C47465a {

    /* renamed from: d */
    public String f144044d;

    /* renamed from: e */
    public int f144045e;

    /* renamed from: f */
    public String f144046f;

    /* renamed from: g */
    public int f144047g;

    /* renamed from: h */
    public LinkedList<C49833ie> f144048h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51832wh)) {
            return false;
        }
        C51832wh whVar = (C51832wh) aVar;
        return C46238a.m51546a(this.f144044d, whVar.f144044d) && C46238a.m51546a(Integer.valueOf(this.f144045e), Integer.valueOf(whVar.f144045e)) && C46238a.m51546a(this.f144046f, whVar.f144046f) && C46238a.m51546a(Integer.valueOf(this.f144047g), Integer.valueOf(whVar.f144047g)) && C46238a.m51546a(this.f144048h, whVar.f144048h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f144044d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f144045e);
            String str2 = this.f144046f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f144047g);
            aVar.mo74320g(5, 8, this.f144048h);
            return 0;
        } else if (i == 1) {
            String str3 = this.f144044d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f144045e);
            String str4 = this.f144046f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            return e + C52418a.m58678e(4, this.f144047g) + C52418a.m58680g(5, 8, this.f144048h);
        } else if (i == 2) {
            this.f144048h.clear();
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
            C51832wh whVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                whVar.f144044d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                whVar.f144045e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                whVar.f144046f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                whVar.f144047g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49833ie ieVar = new C49833ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar.parseFrom(bArr);
                    }
                    whVar.f144048h.add(ieVar);
                }
                return 0;
            }
        }
    }
}
