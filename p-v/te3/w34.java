package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class w34 extends C101820nt3 {

    /* renamed from: d */
    public int f64669d;

    /* renamed from: e */
    public LinkedList<y34> f64670e = new LinkedList<>();

    /* renamed from: f */
    public String f64671f;

    /* renamed from: g */
    public String f64672g;

    /* renamed from: h */
    public n44 f64673h;

    /* renamed from: i */
    public int f64674i;

    /* renamed from: j */
    public xa4 f64675j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof w34)) {
            return false;
        }
        w34 w34 = (w34) aVar;
        return C46238a.m51546a(this.BaseRequest, w34.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f64669d), Integer.valueOf(w34.f64669d)) && C46238a.m51546a(this.f64670e, w34.f64670e) && C46238a.m51546a(this.f64671f, w34.f64671f) && C46238a.m51546a(this.f64672g, w34.f64672g) && C46238a.m51546a(this.f64673h, w34.f64673h) && C46238a.m51546a(Integer.valueOf(this.f64674i), Integer.valueOf(w34.f64674i)) && C46238a.m51546a(this.f64675j, w34.f64675j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f64669d);
            aVar.mo74320g(3, 8, this.f64670e);
            String str = this.f64671f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f64672g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            n44 n44 = this.f64673h;
            if (n44 != null) {
                aVar.mo74322i(6, n44.computeSize());
                this.f64673h.writeFields(aVar);
            }
            aVar.mo74318e(7, this.f64674i);
            xa4 xa4 = this.f64675j;
            if (xa4 != null) {
                aVar.mo74322i(8, xa4.computeSize());
                this.f64675j.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f64669d) + C52418a.m58680g(3, 8, this.f64670e);
            String str3 = this.f64671f;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            String str4 = this.f64672g;
            if (str4 != null) {
                e += C52418a.m58683j(5, str4);
            }
            n44 n442 = this.f64673h;
            if (n442 != null) {
                e += C52418a.m58682i(6, n442.computeSize());
            }
            int e2 = e + C52418a.m58678e(7, this.f64674i);
            xa4 xa42 = this.f64675j;
            return xa42 != null ? e2 + C52418a.m58682i(8, xa42.computeSize()) : e2;
        } else if (i == 2) {
            this.f64670e.clear();
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
            w34 w34 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        w34.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    w34.f64669d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        y34 y34 = new y34();
                        if (bArr2 != null && bArr2.length > 0) {
                            y34.parseFrom(bArr2);
                        }
                        w34.f64670e.add(y34);
                    }
                    return 0;
                case 4:
                    w34.f64671f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    w34.f64672g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        n44 n443 = new n44();
                        if (bArr3 != null && bArr3.length > 0) {
                            n443.parseFrom(bArr3);
                        }
                        w34.f64673h = n443;
                    }
                    return 0;
                case 7:
                    w34.f64674i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        xa4 xa43 = new xa4();
                        if (bArr4 != null && bArr4.length > 0) {
                            xa43.parseFrom(bArr4);
                        }
                        w34.f64675j = xa43;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
