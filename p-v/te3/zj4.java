package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class zj4 extends C47465a {

    /* renamed from: d */
    public int f146040d;

    /* renamed from: e */
    public String f146041e;

    /* renamed from: f */
    public String f146042f;

    /* renamed from: g */
    public int f146043g;

    /* renamed from: h */
    public C51018qv3 f146044h;

    /* renamed from: i */
    public String f146045i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof zj4)) {
            return false;
        }
        zj4 zj4 = (zj4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f146040d), Integer.valueOf(zj4.f146040d)) && C46238a.m51546a(this.f146041e, zj4.f146041e) && C46238a.m51546a(this.f146042f, zj4.f146042f) && C46238a.m51546a(Integer.valueOf(this.f146043g), Integer.valueOf(zj4.f146043g)) && C46238a.m51546a(this.f146044h, zj4.f146044h) && C46238a.m51546a(this.f146045i, zj4.f146045i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f146040d);
            String str = this.f146041e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f146042f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f146043g);
            C51018qv3 qv32 = this.f146044h;
            if (qv32 != null) {
                aVar.mo74322i(5, qv32.computeSize());
                this.f146044h.writeFields(aVar);
            }
            String str3 = this.f146045i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f146040d) + 0;
            String str4 = this.f146041e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f146042f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            int e2 = e + C52418a.m58678e(4, this.f146043g);
            C51018qv3 qv33 = this.f146044h;
            if (qv33 != null) {
                e2 += C52418a.m58682i(5, qv33.computeSize());
            }
            String str6 = this.f146045i;
            return str6 != null ? e2 + C52418a.m58683j(6, str6) : e2;
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
            zj4 zj4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    zj4.f146040d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    zj4.f146041e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    zj4.f146042f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    zj4.f146043g = aVar3.mo141629g(intValue);
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
                        zj4.f146044h = qv34;
                    }
                    return 0;
                case 6:
                    zj4.f146045i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
