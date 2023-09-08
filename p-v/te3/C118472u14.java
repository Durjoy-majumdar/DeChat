package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u14 */
public class C118472u14 extends C47465a {

    /* renamed from: d */
    public int f354475d = -1;

    /* renamed from: e */
    public boolean f354476e = false;

    /* renamed from: f */
    public String f354477f = "";

    /* renamed from: g */
    public long f354478g = -1;

    /* renamed from: h */
    public String f354479h = "";

    /* renamed from: i */
    public LinkedList<C118427eg2> f354480i = new LinkedList<>();

    /* renamed from: j */
    public boolean f354481j = false;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118472u14)) {
            return false;
        }
        C118472u14 u142 = (C118472u14) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f354475d), Integer.valueOf(u142.f354475d)) && C46238a.m51546a(Boolean.valueOf(this.f354476e), Boolean.valueOf(u142.f354476e)) && C46238a.m51546a(this.f354477f, u142.f354477f) && C46238a.m51546a(Long.valueOf(this.f354478g), Long.valueOf(u142.f354478g)) && C46238a.m51546a(this.f354479h, u142.f354479h) && C46238a.m51546a(this.f354480i, u142.f354480i) && C46238a.m51546a(Boolean.valueOf(this.f354481j), Boolean.valueOf(u142.f354481j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f354475d);
            aVar.mo74314a(2, this.f354476e);
            String str = this.f354477f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f354478g);
            String str2 = this.f354479h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74320g(6, 8, this.f354480i);
            aVar.mo74314a(7, this.f354481j);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f354475d) + 0 + C52418a.m58674a(2, this.f354476e);
            String str3 = this.f354477f;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            int h = e + C52418a.m58681h(4, this.f354478g);
            String str4 = this.f354479h;
            if (str4 != null) {
                h += C52418a.m58683j(5, str4);
            }
            return h + C52418a.m58680g(6, 8, this.f354480i) + C52418a.m58674a(7, this.f354481j);
        } else if (i == 2) {
            this.f354480i.clear();
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
            C118472u14 u142 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    u142.f354475d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    u142.f354476e = aVar3.mo141625c(intValue);
                    return 0;
                case 3:
                    u142.f354477f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    u142.f354478g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    u142.f354479h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C118427eg2 eg22 = new C118427eg2();
                        if (bArr != null && bArr.length > 0) {
                            eg22.parseFrom(bArr);
                        }
                        u142.f354480i.add(eg22);
                    }
                    return 0;
                case 7:
                    u142.f354481j = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
