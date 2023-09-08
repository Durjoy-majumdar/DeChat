package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qo0 */
public class C50989qo0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C51942x91> f140423d = new LinkedList<>();

    /* renamed from: e */
    public C50341m21 f140424e;

    /* renamed from: f */
    public int f140425f;

    /* renamed from: g */
    public int f140426g;

    /* renamed from: h */
    public int f140427h;

    /* renamed from: i */
    public int f140428i;

    /* renamed from: j */
    public String f140429j;

    /* renamed from: n */
    public int f140430n;

    /* renamed from: o */
    public LinkedList<C51942x91> f140431o = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50989qo0)) {
            return false;
        }
        C50989qo0 qo02 = (C50989qo0) aVar;
        return C46238a.m51546a(this.BaseResponse, qo02.BaseResponse) && C46238a.m51546a(this.f140423d, qo02.f140423d) && C46238a.m51546a(this.f140424e, qo02.f140424e) && C46238a.m51546a(Integer.valueOf(this.f140425f), Integer.valueOf(qo02.f140425f)) && C46238a.m51546a(Integer.valueOf(this.f140426g), Integer.valueOf(qo02.f140426g)) && C46238a.m51546a(Integer.valueOf(this.f140427h), Integer.valueOf(qo02.f140427h)) && C46238a.m51546a(Integer.valueOf(this.f140428i), Integer.valueOf(qo02.f140428i)) && C46238a.m51546a(this.f140429j, qo02.f140429j) && C46238a.m51546a(Integer.valueOf(this.f140430n), Integer.valueOf(qo02.f140430n)) && C46238a.m51546a(this.f140431o, qo02.f140431o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f140423d);
            C50341m21 m212 = this.f140424e;
            if (m212 != null) {
                aVar.mo74322i(3, m212.computeSize());
                this.f140424e.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f140425f);
            aVar.mo74318e(5, this.f140426g);
            aVar.mo74318e(6, this.f140427h);
            aVar.mo74318e(7, this.f140428i);
            String str = this.f140429j;
            if (str != null) {
                aVar.mo74323j(8, str);
            }
            aVar.mo74318e(9, this.f140430n);
            aVar.mo74320g(10, 8, this.f140431o);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f140423d);
            C50341m21 m213 = this.f140424e;
            if (m213 != null) {
                g += C52418a.m58682i(3, m213.computeSize());
            }
            int e = g + C52418a.m58678e(4, this.f140425f) + C52418a.m58678e(5, this.f140426g) + C52418a.m58678e(6, this.f140427h) + C52418a.m58678e(7, this.f140428i);
            String str2 = this.f140429j;
            if (str2 != null) {
                e += C52418a.m58683j(8, str2);
            }
            return e + C52418a.m58678e(9, this.f140430n) + C52418a.m58680g(10, 8, this.f140431o);
        } else if (i == 2) {
            this.f140423d.clear();
            this.f140431o.clear();
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
            C50989qo0 qo02 = objArr[1];
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
                        qo02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51942x91 x912 = new C51942x91();
                        if (bArr2 != null && bArr2.length > 0) {
                            x912.parseFrom(bArr2);
                        }
                        qo02.f140423d.add(x912);
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50341m21 m214 = new C50341m21();
                        if (bArr3 != null && bArr3.length > 0) {
                            m214.parseFrom(bArr3);
                        }
                        qo02.f140424e = m214;
                    }
                    return 0;
                case 4:
                    qo02.f140425f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    qo02.f140426g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    qo02.f140427h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    qo02.f140428i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    qo02.f140429j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    qo02.f140430n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51942x91 x913 = new C51942x91();
                        if (bArr4 != null && bArr4.length > 0) {
                            x913.parseFrom(bArr4);
                        }
                        qo02.f140431o.add(x913);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
