package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.py1 */
public class C22523py1 extends C49335eu3 {

    /* renamed from: d */
    public int f64453d;

    /* renamed from: e */
    public String f64454e;

    /* renamed from: f */
    public int f64455f;

    /* renamed from: g */
    public int f64456g;

    /* renamed from: h */
    public C50983qn f64457h;

    /* renamed from: i */
    public C51997xn f64458i;

    /* renamed from: j */
    public String f64459j;

    /* renamed from: n */
    public int f64460n;

    /* renamed from: o */
    public int f64461o;

    /* renamed from: p */
    public C118435go f64462p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22523py1)) {
            return false;
        }
        C22523py1 py12 = (C22523py1) aVar;
        return C46238a.m51546a(this.BaseResponse, py12.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f64453d), Integer.valueOf(py12.f64453d)) && C46238a.m51546a(this.f64454e, py12.f64454e) && C46238a.m51546a(Integer.valueOf(this.f64455f), Integer.valueOf(py12.f64455f)) && C46238a.m51546a(Integer.valueOf(this.f64456g), Integer.valueOf(py12.f64456g)) && C46238a.m51546a(this.f64457h, py12.f64457h) && C46238a.m51546a(this.f64458i, py12.f64458i) && C46238a.m51546a(this.f64459j, py12.f64459j) && C46238a.m51546a(Integer.valueOf(this.f64460n), Integer.valueOf(py12.f64460n)) && C46238a.m51546a(Integer.valueOf(this.f64461o), Integer.valueOf(py12.f64461o)) && C46238a.m51546a(this.f64462p, py12.f64462p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f64453d);
                String str = this.f64454e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f64455f);
                aVar.mo74318e(5, this.f64456g);
                C50983qn qnVar = this.f64457h;
                if (qnVar != null) {
                    aVar.mo74322i(6, qnVar.computeSize());
                    this.f64457h.writeFields(aVar);
                }
                C51997xn xnVar = this.f64458i;
                if (xnVar != null) {
                    aVar.mo74322i(7, xnVar.computeSize());
                    this.f64458i.writeFields(aVar);
                }
                String str2 = this.f64459j;
                if (str2 != null) {
                    aVar.mo74323j(8, str2);
                }
                aVar.mo74318e(9, this.f64460n);
                aVar.mo74318e(10, this.f64461o);
                C118435go goVar = this.f64462p;
                if (goVar != null) {
                    aVar.mo74322i(11, goVar.computeSize());
                    this.f64462p.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f64453d);
            String str3 = this.f64454e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            int e2 = e + C52418a.m58678e(4, this.f64455f) + C52418a.m58678e(5, this.f64456g);
            C50983qn qnVar2 = this.f64457h;
            if (qnVar2 != null) {
                e2 += C52418a.m58682i(6, qnVar2.computeSize());
            }
            C51997xn xnVar2 = this.f64458i;
            if (xnVar2 != null) {
                e2 += C52418a.m58682i(7, xnVar2.computeSize());
            }
            String str4 = this.f64459j;
            if (str4 != null) {
                e2 += C52418a.m58683j(8, str4);
            }
            int e3 = e2 + C52418a.m58678e(9, this.f64460n) + C52418a.m58678e(10, this.f64461o);
            C118435go goVar2 = this.f64462p;
            return goVar2 != null ? e3 + C52418a.m58682i(11, goVar2.computeSize()) : e3;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C22523py1 py12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        py12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    py12.f64453d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    py12.f64454e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    py12.f64455f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    py12.f64456g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50983qn qnVar3 = new C50983qn();
                        if (bArr2 != null && bArr2.length > 0) {
                            qnVar3.parseFrom(bArr2);
                        }
                        py12.f64457h = qnVar3;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51997xn xnVar3 = new C51997xn();
                        if (bArr3 != null && bArr3.length > 0) {
                            xnVar3.parseFrom(bArr3);
                        }
                        py12.f64458i = xnVar3;
                    }
                    return 0;
                case 8:
                    py12.f64459j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    py12.f64460n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    py12.f64461o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C118435go goVar3 = new C118435go();
                        if (bArr4 != null && bArr4.length > 0) {
                            goVar3.parseFrom(bArr4);
                        }
                        py12.f64462p = goVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
