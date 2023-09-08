package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ak4 extends C47465a {

    /* renamed from: d */
    public int f130596d;

    /* renamed from: e */
    public String f130597e;

    /* renamed from: f */
    public int f130598f;

    /* renamed from: g */
    public String f130599g;

    /* renamed from: h */
    public C51018qv3 f130600h;

    /* renamed from: i */
    public int f130601i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ak4)) {
            return false;
        }
        ak4 ak4 = (ak4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f130596d), Integer.valueOf(ak4.f130596d)) && C46238a.m51546a(this.f130597e, ak4.f130597e) && C46238a.m51546a(Integer.valueOf(this.f130598f), Integer.valueOf(ak4.f130598f)) && C46238a.m51546a(this.f130599g, ak4.f130599g) && C46238a.m51546a(this.f130600h, ak4.f130600h) && C46238a.m51546a(Integer.valueOf(this.f130601i), Integer.valueOf(ak4.f130601i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f130596d);
            String str = this.f130597e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f130598f);
            String str2 = this.f130599g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            C51018qv3 qv32 = this.f130600h;
            if (qv32 != null) {
                aVar.mo74322i(5, qv32.computeSize());
                this.f130600h.writeFields(aVar);
            }
            aVar.mo74318e(6, this.f130601i);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f130596d) + 0;
            String str3 = this.f130597e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            int e2 = e + C52418a.m58678e(3, this.f130598f);
            String str4 = this.f130599g;
            if (str4 != null) {
                e2 += C52418a.m58683j(4, str4);
            }
            C51018qv3 qv33 = this.f130600h;
            if (qv33 != null) {
                e2 += C52418a.m58682i(5, qv33.computeSize());
            }
            return e2 + C52418a.m58678e(6, this.f130601i);
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
            ak4 ak4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ak4.f130596d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    ak4.f130597e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ak4.f130598f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ak4.f130599g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr != null && bArr.length > 0) {
                            qv34.mo73348f(bArr);
                        }
                        ak4.f130600h = qv34;
                    }
                    return 0;
                case 6:
                    ak4.f130601i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
