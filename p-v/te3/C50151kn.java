package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kn */
public class C50151kn extends C47465a {

    /* renamed from: d */
    public String f136887d;

    /* renamed from: e */
    public String f136888e;

    /* renamed from: f */
    public String f136889f;

    /* renamed from: g */
    public int f136890g;

    /* renamed from: h */
    public C51997xn f136891h;

    /* renamed from: i */
    public int f136892i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50151kn)) {
            return false;
        }
        C50151kn knVar = (C50151kn) aVar;
        return C46238a.m51546a(this.f136887d, knVar.f136887d) && C46238a.m51546a(this.f136888e, knVar.f136888e) && C46238a.m51546a(this.f136889f, knVar.f136889f) && C46238a.m51546a(Integer.valueOf(this.f136890g), Integer.valueOf(knVar.f136890g)) && C46238a.m51546a(this.f136891h, knVar.f136891h) && C46238a.m51546a(Integer.valueOf(this.f136892i), Integer.valueOf(knVar.f136892i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136887d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f136888e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f136889f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f136890g);
            C51997xn xnVar = this.f136891h;
            if (xnVar != null) {
                aVar.mo74322i(5, xnVar.computeSize());
                this.f136891h.writeFields(aVar);
            }
            aVar.mo74318e(6, this.f136892i);
            return 0;
        } else if (i == 1) {
            String str4 = this.f136887d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f136888e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f136889f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            int e = i2 + C52418a.m58678e(4, this.f136890g);
            C51997xn xnVar2 = this.f136891h;
            if (xnVar2 != null) {
                e += C52418a.m58682i(5, xnVar2.computeSize());
            }
            return e + C52418a.m58678e(6, this.f136892i);
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
            C50151kn knVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    knVar.f136887d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    knVar.f136888e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    knVar.f136889f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    knVar.f136890g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51997xn xnVar3 = new C51997xn();
                        if (bArr != null && bArr.length > 0) {
                            xnVar3.parseFrom(bArr);
                        }
                        knVar.f136891h = xnVar3;
                    }
                    return 0;
                case 6:
                    knVar.f136892i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
