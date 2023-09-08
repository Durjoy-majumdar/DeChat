package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.en */
public class C49306en extends C47465a {

    /* renamed from: d */
    public LinkedList<C64368fm> f133016d = new LinkedList<>();

    /* renamed from: e */
    public wr4 f133017e;

    /* renamed from: f */
    public int f133018f;

    /* renamed from: g */
    public int f133019g;

    /* renamed from: h */
    public String f133020h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49306en)) {
            return false;
        }
        C49306en enVar = (C49306en) aVar;
        return C46238a.m51546a(this.f133016d, enVar.f133016d) && C46238a.m51546a(this.f133017e, enVar.f133017e) && C46238a.m51546a(Integer.valueOf(this.f133018f), Integer.valueOf(enVar.f133018f)) && C46238a.m51546a(Integer.valueOf(this.f133019g), Integer.valueOf(enVar.f133019g)) && C46238a.m51546a(this.f133020h, enVar.f133020h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f133017e != null) {
                aVar.mo74320g(1, 8, this.f133016d);
                wr4 wr4 = this.f133017e;
                if (wr4 != null) {
                    aVar.mo74322i(2, wr4.computeSize());
                    this.f133017e.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f133018f);
                aVar.mo74318e(4, this.f133019g);
                String str = this.f133020h;
                if (str != null) {
                    aVar.mo74323j(5, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: matrix");
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f133016d) + 0;
            wr4 wr42 = this.f133017e;
            if (wr42 != null) {
                g += C52418a.m58682i(2, wr42.computeSize());
            }
            int e = g + C52418a.m58678e(3, this.f133018f) + C52418a.m58678e(4, this.f133019g);
            String str2 = this.f133020h;
            return str2 != null ? e + C52418a.m58683j(5, str2) : e;
        } else if (i == 2) {
            this.f133016d.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f133017e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: matrix");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49306en enVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64368fm fmVar = new C64368fm();
                    if (bArr != null && bArr.length > 0) {
                        fmVar.parseFrom(bArr);
                    }
                    enVar.f133016d.add(fmVar);
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    wr4 wr43 = new wr4();
                    if (bArr2 != null && bArr2.length > 0) {
                        wr43.parseFrom(bArr2);
                    }
                    enVar.f133017e = wr43;
                }
                return 0;
            } else if (intValue == 3) {
                enVar.f133018f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                enVar.f133019g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                enVar.f133020h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
