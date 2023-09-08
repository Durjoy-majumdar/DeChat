package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nn */
public class C22517nn extends C47465a {

    /* renamed from: d */
    public String f64329d;

    /* renamed from: e */
    public int f64330e;

    /* renamed from: f */
    public String f64331f;

    /* renamed from: g */
    public C51997xn f64332g;

    /* renamed from: h */
    public String f64333h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22517nn)) {
            return false;
        }
        C22517nn nnVar = (C22517nn) aVar;
        return C46238a.m51546a(this.f64329d, nnVar.f64329d) && C46238a.m51546a(Integer.valueOf(this.f64330e), Integer.valueOf(nnVar.f64330e)) && C46238a.m51546a(this.f64331f, nnVar.f64331f) && C46238a.m51546a(this.f64332g, nnVar.f64332g) && C46238a.m51546a(this.f64333h, nnVar.f64333h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f64329d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f64330e);
            String str2 = this.f64331f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            C51997xn xnVar = this.f64332g;
            if (xnVar != null) {
                aVar.mo74322i(4, xnVar.computeSize());
                this.f64332g.writeFields(aVar);
            }
            String str3 = this.f64333h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f64329d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int e = i2 + C52418a.m58678e(2, this.f64330e);
            String str5 = this.f64331f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            C51997xn xnVar2 = this.f64332g;
            if (xnVar2 != null) {
                e += C52418a.m58682i(4, xnVar2.computeSize());
            }
            String str6 = this.f64333h;
            return str6 != null ? e + C52418a.m58683j(5, str6) : e;
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
            C22517nn nnVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                nnVar.f64329d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                nnVar.f64330e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                nnVar.f64331f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51997xn xnVar3 = new C51997xn();
                    if (bArr != null && bArr.length > 0) {
                        xnVar3.parseFrom(bArr);
                    }
                    nnVar.f64332g = xnVar3;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                nnVar.f64333h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
