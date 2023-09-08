package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oe0 */
public class C50667oe0 extends C47465a {

    /* renamed from: d */
    public String f139103d;

    /* renamed from: e */
    public long f139104e;

    /* renamed from: f */
    public int f139105f;

    /* renamed from: g */
    public String f139106g;

    /* renamed from: h */
    public LinkedList<C50388me0> f139107h = new LinkedList<>();

    /* renamed from: i */
    public C52010xr1 f139108i;

    /* renamed from: j */
    public int f139109j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50667oe0)) {
            return false;
        }
        C50667oe0 oe02 = (C50667oe0) aVar;
        return C46238a.m51546a(this.f139103d, oe02.f139103d) && C46238a.m51546a(Long.valueOf(this.f139104e), Long.valueOf(oe02.f139104e)) && C46238a.m51546a(Integer.valueOf(this.f139105f), Integer.valueOf(oe02.f139105f)) && C46238a.m51546a(this.f139106g, oe02.f139106g) && C46238a.m51546a(this.f139107h, oe02.f139107h) && C46238a.m51546a(this.f139108i, oe02.f139108i) && C46238a.m51546a(Integer.valueOf(this.f139109j), Integer.valueOf(oe02.f139109j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f139103d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: Rid");
            } else if (this.f139106g != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74321h(2, this.f139104e);
                aVar.mo74318e(3, this.f139105f);
                String str2 = this.f139106g;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                aVar.mo74320g(5, 8, this.f139107h);
                C52010xr1 xr12 = this.f139108i;
                if (xr12 != null) {
                    aVar.mo74322i(6, xr12.computeSize());
                    this.f139108i.writeFields(aVar);
                }
                aVar.mo74318e(7, this.f139109j);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: MimeType");
            }
        } else if (i == 1) {
            String str3 = this.f139103d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int h = i2 + C52418a.m58681h(2, this.f139104e) + C52418a.m58678e(3, this.f139105f);
            String str4 = this.f139106g;
            if (str4 != null) {
                h += C52418a.m58683j(4, str4);
            }
            int g = h + C52418a.m58680g(5, 8, this.f139107h);
            C52010xr1 xr13 = this.f139108i;
            if (xr13 != null) {
                g += C52418a.m58682i(6, xr13.computeSize());
            }
            return g + C52418a.m58678e(7, this.f139109j);
        } else if (i == 2) {
            this.f139107h.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f139103d == null) {
                throw new C52419b("Not all required fields were included: Rid");
            } else if (this.f139106g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: MimeType");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50667oe0 oe02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    oe02.f139103d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    oe02.f139104e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    oe02.f139105f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    oe02.f139106g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C50388me0 me02 = new C50388me0();
                        if (bArr != null && bArr.length > 0) {
                            me02.parseFrom(bArr);
                        }
                        oe02.f139107h.add(me02);
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C52010xr1 xr14 = new C52010xr1();
                        if (bArr2 != null && bArr2.length > 0) {
                            xr14.parseFrom(bArr2);
                        }
                        oe02.f139108i = xr14;
                    }
                    return 0;
                case 7:
                    oe02.f139109j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
