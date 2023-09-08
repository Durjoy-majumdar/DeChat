package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dm1 */
public class C49165dm1 extends C47465a {

    /* renamed from: d */
    public long f132415d;

    /* renamed from: e */
    public int f132416e;

    /* renamed from: f */
    public String f132417f;

    /* renamed from: g */
    public LinkedList<String> f132418g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<C50976ql1> f132419h = new LinkedList<>();

    /* renamed from: i */
    public LinkedList<String> f132420i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49165dm1)) {
            return false;
        }
        C49165dm1 dm12 = (C49165dm1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f132415d), Long.valueOf(dm12.f132415d)) && C46238a.m51546a(Integer.valueOf(this.f132416e), Integer.valueOf(dm12.f132416e)) && C46238a.m51546a(this.f132417f, dm12.f132417f) && C46238a.m51546a(this.f132418g, dm12.f132418g) && C46238a.m51546a(this.f132419h, dm12.f132419h) && C46238a.m51546a(this.f132420i, dm12.f132420i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f132415d);
            aVar.mo74318e(2, this.f132416e);
            String str = this.f132417f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74320g(4, 1, this.f132418g);
            aVar.mo74320g(5, 8, this.f132419h);
            aVar.mo74320g(6, 1, this.f132420i);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f132415d) + 0 + C52418a.m58678e(2, this.f132416e);
            String str2 = this.f132417f;
            if (str2 != null) {
                h += C52418a.m58683j(3, str2);
            }
            return h + C52418a.m58680g(4, 1, this.f132418g) + C52418a.m58680g(5, 8, this.f132419h) + C52418a.m58680g(6, 1, this.f132420i);
        } else if (i == 2) {
            this.f132418g.clear();
            this.f132419h.clear();
            this.f132420i.clear();
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
            C49165dm1 dm12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    dm12.f132415d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    dm12.f132416e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    dm12.f132417f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    dm12.f132418g.add(aVar3.mo141633k(intValue));
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C50976ql1 ql12 = new C50976ql1();
                        if (bArr != null && bArr.length > 0) {
                            ql12.parseFrom(bArr);
                        }
                        dm12.f132419h.add(ql12);
                    }
                    return 0;
                case 6:
                    dm12.f132420i.add(aVar3.mo141633k(intValue));
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
