package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ap1 */
public class C64237ap1 extends C47465a {

    /* renamed from: d */
    public String f182115d;

    /* renamed from: e */
    public int f182116e;

    /* renamed from: f */
    public int f182117f;

    /* renamed from: g */
    public int f182118g;

    /* renamed from: h */
    public int f182119h;

    /* renamed from: i */
    public yq4 f182120i;

    /* renamed from: j */
    public String f182121j;

    /* renamed from: n */
    public C49631gz3 f182122n;

    /* renamed from: o */
    public int f182123o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64237ap1)) {
            return false;
        }
        C64237ap1 ap12 = (C64237ap1) aVar;
        return C46238a.m51546a(this.f182115d, ap12.f182115d) && C46238a.m51546a(Integer.valueOf(this.f182116e), Integer.valueOf(ap12.f182116e)) && C46238a.m51546a(Integer.valueOf(this.f182117f), Integer.valueOf(ap12.f182117f)) && C46238a.m51546a(Integer.valueOf(this.f182118g), Integer.valueOf(ap12.f182118g)) && C46238a.m51546a(Integer.valueOf(this.f182119h), Integer.valueOf(ap12.f182119h)) && C46238a.m51546a(this.f182120i, ap12.f182120i) && C46238a.m51546a(this.f182121j, ap12.f182121j) && C46238a.m51546a(this.f182122n, ap12.f182122n) && C46238a.m51546a(Integer.valueOf(this.f182123o), Integer.valueOf(ap12.f182123o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182115d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f182116e);
            aVar.mo74318e(3, this.f182117f);
            aVar.mo74318e(4, this.f182118g);
            aVar.mo74318e(5, this.f182119h);
            yq4 yq4 = this.f182120i;
            if (yq4 != null) {
                aVar.mo74322i(6, yq4.computeSize());
                this.f182120i.writeFields(aVar);
            }
            String str2 = this.f182121j;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            C49631gz3 gz32 = this.f182122n;
            if (gz32 != null) {
                aVar.mo74322i(8, gz32.computeSize());
                this.f182122n.writeFields(aVar);
            }
            aVar.mo74318e(10, this.f182123o);
            return 0;
        } else if (i == 1) {
            String str3 = this.f182115d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f182116e) + C52418a.m58678e(3, this.f182117f) + C52418a.m58678e(4, this.f182118g) + C52418a.m58678e(5, this.f182119h);
            yq4 yq42 = this.f182120i;
            if (yq42 != null) {
                e += C52418a.m58682i(6, yq42.computeSize());
            }
            String str4 = this.f182121j;
            if (str4 != null) {
                e += C52418a.m58683j(7, str4);
            }
            C49631gz3 gz33 = this.f182122n;
            if (gz33 != null) {
                e += C52418a.m58682i(8, gz33.computeSize());
            }
            return e + C52418a.m58678e(10, this.f182123o);
        } else if (i == 2) {
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
            C64237ap1 ap12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ap12.f182115d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ap12.f182116e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ap12.f182117f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ap12.f182118g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ap12.f182119h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        yq4 yq43 = new yq4();
                        if (bArr != null && bArr.length > 0) {
                            yq43.parseFrom(bArr);
                        }
                        ap12.f182120i = yq43;
                    }
                    return 0;
                case 7:
                    ap12.f182121j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49631gz3 gz34 = new C49631gz3();
                        if (bArr2 != null && bArr2.length > 0) {
                            gz34.parseFrom(bArr2);
                        }
                        ap12.f182122n = gz34;
                    }
                    return 0;
                case 10:
                    ap12.f182123o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
