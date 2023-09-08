package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.iw0 */
public class C49906iw0 extends C47465a {

    /* renamed from: d */
    public String f135698d;

    /* renamed from: e */
    public long f135699e;

    /* renamed from: f */
    public int f135700f;

    /* renamed from: g */
    public int f135701g;

    /* renamed from: h */
    public LinkedList<C48701ae3> f135702h = new LinkedList<>();

    /* renamed from: i */
    public int f135703i;

    /* renamed from: j */
    public long f135704j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49906iw0)) {
            return false;
        }
        C49906iw0 iw02 = (C49906iw0) aVar;
        return C46238a.m51546a(this.f135698d, iw02.f135698d) && C46238a.m51546a(Long.valueOf(this.f135699e), Long.valueOf(iw02.f135699e)) && C46238a.m51546a(Integer.valueOf(this.f135700f), Integer.valueOf(iw02.f135700f)) && C46238a.m51546a(Integer.valueOf(this.f135701g), Integer.valueOf(iw02.f135701g)) && C46238a.m51546a(this.f135702h, iw02.f135702h) && C46238a.m51546a(Integer.valueOf(this.f135703i), Integer.valueOf(iw02.f135703i)) && C46238a.m51546a(Long.valueOf(this.f135704j), Long.valueOf(iw02.f135704j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f135698d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f135699e);
            aVar.mo74318e(3, this.f135700f);
            aVar.mo74318e(4, this.f135701g);
            aVar.mo74320g(6, 8, this.f135702h);
            aVar.mo74318e(7, this.f135703i);
            aVar.mo74321h(8, this.f135704j);
            return 0;
        } else if (i == 1) {
            String str2 = this.f135698d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58681h(2, this.f135699e) + C52418a.m58678e(3, this.f135700f) + C52418a.m58678e(4, this.f135701g) + C52418a.m58680g(6, 8, this.f135702h) + C52418a.m58678e(7, this.f135703i) + C52418a.m58681h(8, this.f135704j);
        } else if (i == 2) {
            this.f135702h.clear();
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
            C49906iw0 iw02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    iw02.f135698d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    iw02.f135699e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    iw02.f135700f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    iw02.f135701g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C48701ae3 ae32 = new C48701ae3();
                        if (bArr != null && bArr.length > 0) {
                            ae32.parseFrom(bArr);
                        }
                        iw02.f135702h.add(ae32);
                    }
                    return 0;
                case 7:
                    iw02.f135703i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    iw02.f135704j = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
