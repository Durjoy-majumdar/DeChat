package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qe0 */
public class C64656qe0 extends C47465a {

    /* renamed from: d */
    public String f185000d;

    /* renamed from: e */
    public String f185001e;

    /* renamed from: f */
    public LinkedList<C64677re0> f185002f = new LinkedList<>();

    /* renamed from: g */
    public String f185003g;

    /* renamed from: h */
    public int f185004h;

    /* renamed from: i */
    public wa4 f185005i;

    /* renamed from: j */
    public kr4 f185006j;

    /* renamed from: n */
    public String f185007n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64656qe0)) {
            return false;
        }
        C64656qe0 qe02 = (C64656qe0) aVar;
        return C46238a.m51546a(this.f185000d, qe02.f185000d) && C46238a.m51546a(this.f185001e, qe02.f185001e) && C46238a.m51546a(this.f185002f, qe02.f185002f) && C46238a.m51546a(this.f185003g, qe02.f185003g) && C46238a.m51546a(Integer.valueOf(this.f185004h), Integer.valueOf(qe02.f185004h)) && C46238a.m51546a(this.f185005i, qe02.f185005i) && C46238a.m51546a(this.f185006j, qe02.f185006j) && C46238a.m51546a(this.f185007n, qe02.f185007n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185000d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f185001e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74320g(3, 8, this.f185002f);
            String str3 = this.f185003g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f185004h);
            wa4 wa4 = this.f185005i;
            if (wa4 != null) {
                aVar.mo74322i(6, wa4.computeSize());
                this.f185005i.writeFields(aVar);
            }
            kr4 kr4 = this.f185006j;
            if (kr4 != null) {
                aVar.mo74322i(7, kr4.computeSize());
                this.f185006j.writeFields(aVar);
            }
            String str4 = this.f185007n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f185000d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f185001e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int g = i2 + C52418a.m58680g(3, 8, this.f185002f);
            String str7 = this.f185003g;
            if (str7 != null) {
                g += C52418a.m58683j(4, str7);
            }
            int e = g + C52418a.m58678e(5, this.f185004h);
            wa4 wa42 = this.f185005i;
            if (wa42 != null) {
                e += C52418a.m58682i(6, wa42.computeSize());
            }
            kr4 kr42 = this.f185006j;
            if (kr42 != null) {
                e += C52418a.m58682i(7, kr42.computeSize());
            }
            String str8 = this.f185007n;
            return str8 != null ? e + C52418a.m58683j(8, str8) : e;
        } else if (i == 2) {
            this.f185002f.clear();
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
            C64656qe0 qe02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    qe02.f185000d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    qe02.f185001e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64677re0 re02 = new C64677re0();
                        if (bArr != null && bArr.length > 0) {
                            re02.parseFrom(bArr);
                        }
                        qe02.f185002f.add(re02);
                    }
                    return 0;
                case 4:
                    qe02.f185003g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    qe02.f185004h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        wa4 wa43 = new wa4();
                        if (bArr2 != null && bArr2.length > 0) {
                            wa43.parseFrom(bArr2);
                        }
                        qe02.f185005i = wa43;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        kr4 kr43 = new kr4();
                        if (bArr3 != null && bArr3.length > 0) {
                            kr43.parseFrom(bArr3);
                        }
                        qe02.f185006j = kr43;
                    }
                    return 0;
                case 8:
                    qe02.f185007n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
