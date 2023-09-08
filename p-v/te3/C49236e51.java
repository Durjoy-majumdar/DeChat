package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e51 */
public class C49236e51 extends C47465a {

    /* renamed from: d */
    public LinkedList<C49098d51> f132697d = new LinkedList<>();

    /* renamed from: e */
    public int f132698e;

    /* renamed from: f */
    public int f132699f;

    /* renamed from: g */
    public int f132700g;

    /* renamed from: h */
    public int f132701h;

    /* renamed from: i */
    public String f132702i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49236e51)) {
            return false;
        }
        C49236e51 e512 = (C49236e51) aVar;
        return C46238a.m51546a(this.f132697d, e512.f132697d) && C46238a.m51546a(Integer.valueOf(this.f132698e), Integer.valueOf(e512.f132698e)) && C46238a.m51546a(Integer.valueOf(this.f132699f), Integer.valueOf(e512.f132699f)) && C46238a.m51546a(Integer.valueOf(this.f132700g), Integer.valueOf(e512.f132700g)) && C46238a.m51546a(Integer.valueOf(this.f132701h), Integer.valueOf(e512.f132701h)) && C46238a.m51546a(this.f132702i, e512.f132702i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f132697d);
            aVar.mo74318e(2, this.f132698e);
            aVar.mo74318e(3, this.f132699f);
            aVar.mo74318e(4, this.f132700g);
            aVar.mo74318e(5, this.f132701h);
            String str = this.f132702i;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f132697d) + 0 + C52418a.m58678e(2, this.f132698e) + C52418a.m58678e(3, this.f132699f) + C52418a.m58678e(4, this.f132700g) + C52418a.m58678e(5, this.f132701h);
            String str2 = this.f132702i;
            return str2 != null ? g + C52418a.m58683j(6, str2) : g;
        } else if (i == 2) {
            this.f132697d.clear();
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
            C49236e51 e512 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C49098d51 d512 = new C49098d51();
                        if (bArr != null && bArr.length > 0) {
                            d512.parseFrom(bArr);
                        }
                        e512.f132697d.add(d512);
                    }
                    return 0;
                case 2:
                    e512.f132698e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    e512.f132699f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    e512.f132700g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    e512.f132701h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    e512.f132702i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
