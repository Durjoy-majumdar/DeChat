package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ov2 */
public class C50739ov2 extends C47465a {

    /* renamed from: d */
    public String f139389d;

    /* renamed from: e */
    public String f139390e;

    /* renamed from: f */
    public String f139391f;

    /* renamed from: g */
    public int f139392g;

    /* renamed from: h */
    public String f139393h;

    /* renamed from: i */
    public C51997xn f139394i;

    /* renamed from: j */
    public String f139395j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50739ov2)) {
            return false;
        }
        C50739ov2 ov22 = (C50739ov2) aVar;
        return C46238a.m51546a(this.f139389d, ov22.f139389d) && C46238a.m51546a(this.f139390e, ov22.f139390e) && C46238a.m51546a(this.f139391f, ov22.f139391f) && C46238a.m51546a(Integer.valueOf(this.f139392g), Integer.valueOf(ov22.f139392g)) && C46238a.m51546a(this.f139393h, ov22.f139393h) && C46238a.m51546a(this.f139394i, ov22.f139394i) && C46238a.m51546a(this.f139395j, ov22.f139395j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f139389d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f139390e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f139391f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f139392g);
            String str4 = this.f139393h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            C51997xn xnVar = this.f139394i;
            if (xnVar != null) {
                aVar.mo74322i(6, xnVar.computeSize());
                this.f139394i.writeFields(aVar);
            }
            String str5 = this.f139395j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f139389d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f139390e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f139391f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            int e = i2 + C52418a.m58678e(4, this.f139392g);
            String str9 = this.f139393h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            C51997xn xnVar2 = this.f139394i;
            if (xnVar2 != null) {
                e += C52418a.m58682i(6, xnVar2.computeSize());
            }
            String str10 = this.f139395j;
            return str10 != null ? e + C52418a.m58683j(7, str10) : e;
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
            C50739ov2 ov22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ov22.f139389d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ov22.f139390e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ov22.f139391f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ov22.f139392g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ov22.f139393h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51997xn xnVar3 = new C51997xn();
                        if (bArr != null && bArr.length > 0) {
                            xnVar3.parseFrom(bArr);
                        }
                        ov22.f139394i = xnVar3;
                    }
                    return 0;
                case 7:
                    ov22.f139395j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
