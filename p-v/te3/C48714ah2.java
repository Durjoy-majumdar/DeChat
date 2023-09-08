package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ah2 */
public class C48714ah2 extends C47465a {

    /* renamed from: d */
    public int f130528d;

    /* renamed from: e */
    public int f130529e;

    /* renamed from: f */
    public LinkedList<C49515g50> f130530f = new LinkedList<>();

    /* renamed from: g */
    public String f130531g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48714ah2)) {
            return false;
        }
        C48714ah2 ah22 = (C48714ah2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f130528d), Integer.valueOf(ah22.f130528d)) && C46238a.m51546a(Integer.valueOf(this.f130529e), Integer.valueOf(ah22.f130529e)) && C46238a.m51546a(this.f130530f, ah22.f130530f) && C46238a.m51546a(this.f130531g, ah22.f130531g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f130528d);
            aVar.mo74318e(2, this.f130529e);
            aVar.mo74320g(3, 8, this.f130530f);
            String str = this.f130531g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f130528d) + 0 + C52418a.m58678e(2, this.f130529e) + C52418a.m58680g(3, 8, this.f130530f);
            String str2 = this.f130531g;
            return str2 != null ? e + C52418a.m58683j(4, str2) : e;
        } else if (i == 2) {
            this.f130530f.clear();
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
            C48714ah2 ah22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ah22.f130528d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                ah22.f130529e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C49515g50 g502 = new C49515g50();
                    if (bArr != null && bArr.length > 0) {
                        g502.parseFrom(bArr);
                    }
                    ah22.f130530f.add(g502);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ah22.f130531g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
