package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ut4 extends C49335eu3 {

    /* renamed from: d */
    public int f332279d;

    /* renamed from: e */
    public long f332280e;

    /* renamed from: f */
    public int f332281f;

    /* renamed from: g */
    public jv4 f332282g;

    /* renamed from: h */
    public int f332283h;

    /* renamed from: i */
    public int f332284i;

    /* renamed from: j */
    public int f332285j;

    /* renamed from: n */
    public int f332286n;

    /* renamed from: o */
    public int f332287o;

    /* renamed from: p */
    public C51018qv3 f332288p;

    /* renamed from: q */
    public long f332289q;

    /* renamed from: r */
    public C51018qv3 f332290r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ut4)) {
            return false;
        }
        ut4 ut4 = (ut4) aVar;
        return C46238a.m51546a(this.BaseResponse, ut4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f332279d), Integer.valueOf(ut4.f332279d)) && C46238a.m51546a(Long.valueOf(this.f332280e), Long.valueOf(ut4.f332280e)) && C46238a.m51546a(Integer.valueOf(this.f332281f), Integer.valueOf(ut4.f332281f)) && C46238a.m51546a(this.f332282g, ut4.f332282g) && C46238a.m51546a(Integer.valueOf(this.f332283h), Integer.valueOf(ut4.f332283h)) && C46238a.m51546a(Integer.valueOf(this.f332284i), Integer.valueOf(ut4.f332284i)) && C46238a.m51546a(Integer.valueOf(this.f332285j), Integer.valueOf(ut4.f332285j)) && C46238a.m51546a(Integer.valueOf(this.f332286n), Integer.valueOf(ut4.f332286n)) && C46238a.m51546a(Integer.valueOf(this.f332287o), Integer.valueOf(ut4.f332287o)) && C46238a.m51546a(this.f332288p, ut4.f332288p) && C46238a.m51546a(Long.valueOf(this.f332289q), Long.valueOf(ut4.f332289q)) && C46238a.m51546a(this.f332290r, ut4.f332290r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f332279d);
                aVar.mo74321h(3, this.f332280e);
                aVar.mo74318e(4, this.f332281f);
                jv4 jv4 = this.f332282g;
                if (jv4 != null) {
                    aVar.mo74322i(5, jv4.computeSize());
                    this.f332282g.writeFields(aVar);
                }
                aVar.mo74318e(6, this.f332283h);
                aVar.mo74318e(7, this.f332284i);
                aVar.mo74318e(8, this.f332285j);
                aVar.mo74318e(9, this.f332286n);
                aVar.mo74318e(10, this.f332287o);
                C51018qv3 qv32 = this.f332288p;
                if (qv32 != null) {
                    aVar.mo74322i(11, qv32.computeSize());
                    this.f332288p.writeFields(aVar);
                }
                aVar.mo74321h(12, this.f332289q);
                C51018qv3 qv33 = this.f332290r;
                if (qv33 != null) {
                    aVar.mo74322i(13, qv33.computeSize());
                    this.f332290r.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f332279d) + C52418a.m58681h(3, this.f332280e) + C52418a.m58678e(4, this.f332281f);
            jv4 jv42 = this.f332282g;
            if (jv42 != null) {
                e += C52418a.m58682i(5, jv42.computeSize());
            }
            int e2 = e + C52418a.m58678e(6, this.f332283h) + C52418a.m58678e(7, this.f332284i) + C52418a.m58678e(8, this.f332285j) + C52418a.m58678e(9, this.f332286n) + C52418a.m58678e(10, this.f332287o);
            C51018qv3 qv34 = this.f332288p;
            if (qv34 != null) {
                e2 += C52418a.m58682i(11, qv34.computeSize());
            }
            int h = e2 + C52418a.m58681h(12, this.f332289q);
            C51018qv3 qv35 = this.f332290r;
            return qv35 != null ? h + C52418a.m58682i(13, qv35.computeSize()) : h;
        } else if (i2 == 2) {
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
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ut4 ut4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        ut4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ut4.f332279d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ut4.f332280e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    ut4.f332281f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        jv4 jv43 = new jv4();
                        if (bArr2 != null && bArr2.length > 0) {
                            jv43.parseFrom(bArr2);
                        }
                        ut4.f332282g = jv43;
                    }
                    return 0;
                case 6:
                    ut4.f332283h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ut4.f332284i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ut4.f332285j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    ut4.f332286n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    ut4.f332287o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv36.mo73348f(bArr3);
                        }
                        ut4.f332288p = qv36;
                    }
                    return 0;
                case 12:
                    ut4.f332289q = aVar3.mo141631i(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            qv37.mo73348f(bArr4);
                        }
                        ut4.f332290r = qv37;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
