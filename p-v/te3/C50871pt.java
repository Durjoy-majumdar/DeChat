package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pt */
public class C50871pt extends C47465a {

    /* renamed from: d */
    public int f139943d;

    /* renamed from: e */
    public int f139944e;

    /* renamed from: f */
    public String f139945f;

    /* renamed from: g */
    public String f139946g;

    /* renamed from: h */
    public LinkedList<C51009qt> f139947h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50871pt)) {
            return false;
        }
        C50871pt ptVar = (C50871pt) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139943d), Integer.valueOf(ptVar.f139943d)) && C46238a.m51546a(Integer.valueOf(this.f139944e), Integer.valueOf(ptVar.f139944e)) && C46238a.m51546a(this.f139945f, ptVar.f139945f) && C46238a.m51546a(this.f139946g, ptVar.f139946g) && C46238a.m51546a(this.f139947h, ptVar.f139947h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139943d);
            aVar.mo74318e(2, this.f139944e);
            String str = this.f139945f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f139946g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74320g(5, 8, this.f139947h);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f139943d) + 0 + C52418a.m58678e(2, this.f139944e);
            String str3 = this.f139945f;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f139946g;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            return e + C52418a.m58680g(5, 8, this.f139947h);
        } else if (i == 2) {
            this.f139947h.clear();
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
            C50871pt ptVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ptVar.f139943d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                ptVar.f139944e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                ptVar.f139945f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                ptVar.f139946g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51009qt qtVar = new C51009qt();
                    if (bArr != null && bArr.length > 0) {
                        qtVar.parseFrom(bArr);
                    }
                    ptVar.f139947h.add(qtVar);
                }
                return 0;
            }
        }
    }
}
