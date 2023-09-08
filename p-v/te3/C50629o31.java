package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o31 */
public class C50629o31 extends C47465a {

    /* renamed from: d */
    public String f138922d;

    /* renamed from: e */
    public long f138923e;

    /* renamed from: f */
    public String f138924f;

    /* renamed from: g */
    public C49765hx0 f138925g;

    /* renamed from: h */
    public int f138926h;

    /* renamed from: i */
    public LinkedList<C50209l31> f138927i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50629o31)) {
            return false;
        }
        C50629o31 o312 = (C50629o31) aVar;
        return C46238a.m51546a(this.f138922d, o312.f138922d) && C46238a.m51546a(Long.valueOf(this.f138923e), Long.valueOf(o312.f138923e)) && C46238a.m51546a(this.f138924f, o312.f138924f) && C46238a.m51546a(this.f138925g, o312.f138925g) && C46238a.m51546a(Integer.valueOf(this.f138926h), Integer.valueOf(o312.f138926h)) && C46238a.m51546a(this.f138927i, o312.f138927i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138922d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f138923e);
            String str2 = this.f138924f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            C49765hx0 hx02 = this.f138925g;
            if (hx02 != null) {
                aVar.mo74322i(4, hx02.computeSize());
                this.f138925g.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f138926h);
            aVar.mo74320g(6, 8, this.f138927i);
            return 0;
        } else if (i == 1) {
            String str3 = this.f138922d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int h = i2 + C52418a.m58681h(2, this.f138923e);
            String str4 = this.f138924f;
            if (str4 != null) {
                h += C52418a.m58683j(3, str4);
            }
            C49765hx0 hx03 = this.f138925g;
            if (hx03 != null) {
                h += C52418a.m58682i(4, hx03.computeSize());
            }
            return h + C52418a.m58678e(5, this.f138926h) + C52418a.m58680g(6, 8, this.f138927i);
        } else if (i == 2) {
            this.f138927i.clear();
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
            C50629o31 o312 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    o312.f138922d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    o312.f138923e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    o312.f138924f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49765hx0 hx04 = new C49765hx0();
                        if (bArr != null && bArr.length > 0) {
                            hx04.parseFrom(bArr);
                        }
                        o312.f138925g = hx04;
                    }
                    return 0;
                case 5:
                    o312.f138926h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50209l31 l312 = new C50209l31();
                        if (bArr2 != null && bArr2.length > 0) {
                            l312.parseFrom(bArr2);
                        }
                        o312.f138927i.add(l312);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
