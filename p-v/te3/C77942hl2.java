package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hl2 */
public class C77942hl2 extends C47465a {

    /* renamed from: d */
    public int f227571d;

    /* renamed from: e */
    public boolean f227572e;

    /* renamed from: f */
    public String f227573f;

    /* renamed from: g */
    public String f227574g;

    /* renamed from: h */
    public String f227575h;

    /* renamed from: i */
    public C78024zp3 f227576i;

    /* renamed from: j */
    public String f227577j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77942hl2)) {
            return false;
        }
        C77942hl2 hl22 = (C77942hl2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f227571d), Integer.valueOf(hl22.f227571d)) && C46238a.m51546a(Boolean.valueOf(this.f227572e), Boolean.valueOf(hl22.f227572e)) && C46238a.m51546a(this.f227573f, hl22.f227573f) && C46238a.m51546a(this.f227574g, hl22.f227574g) && C46238a.m51546a(this.f227575h, hl22.f227575h) && C46238a.m51546a(this.f227576i, hl22.f227576i) && C46238a.m51546a(this.f227577j, hl22.f227577j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f227571d);
            aVar.mo74314a(2, this.f227572e);
            String str = this.f227573f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f227574g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f227575h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            C78024zp3 zp32 = this.f227576i;
            if (zp32 != null) {
                aVar.mo74322i(6, zp32.computeSize());
                this.f227576i.writeFields(aVar);
            }
            String str4 = this.f227577j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f227571d) + 0 + C52418a.m58674a(2, this.f227572e);
            String str5 = this.f227573f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f227574g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f227575h;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            C78024zp3 zp33 = this.f227576i;
            if (zp33 != null) {
                e += C52418a.m58682i(6, zp33.computeSize());
            }
            String str8 = this.f227577j;
            return str8 != null ? e + C52418a.m58683j(7, str8) : e;
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
            C77942hl2 hl22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    hl22.f227571d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    hl22.f227572e = aVar3.mo141625c(intValue);
                    return 0;
                case 3:
                    hl22.f227573f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    hl22.f227574g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    hl22.f227575h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C78024zp3 zp34 = new C78024zp3();
                        if (bArr != null && bArr.length > 0) {
                            zp34.parseFrom(bArr);
                        }
                        hl22.f227576i = zp34;
                    }
                    return 0;
                case 7:
                    hl22.f227577j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
