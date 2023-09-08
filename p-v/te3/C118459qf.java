package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qf */
public class C118459qf extends C47465a {

    /* renamed from: d */
    public String f354270d;

    /* renamed from: e */
    public String f354271e;

    /* renamed from: f */
    public int f354272f;

    /* renamed from: g */
    public String f354273g;

    /* renamed from: h */
    public int f354274h;

    /* renamed from: i */
    public String f354275i;

    /* renamed from: j */
    public boolean f354276j;

    /* renamed from: n */
    public fz4 f354277n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118459qf)) {
            return false;
        }
        C118459qf qfVar = (C118459qf) aVar;
        return C46238a.m51546a(this.f354270d, qfVar.f354270d) && C46238a.m51546a(this.f354271e, qfVar.f354271e) && C46238a.m51546a(Integer.valueOf(this.f354272f), Integer.valueOf(qfVar.f354272f)) && C46238a.m51546a(this.f354273g, qfVar.f354273g) && C46238a.m51546a(Integer.valueOf(this.f354274h), Integer.valueOf(qfVar.f354274h)) && C46238a.m51546a(this.f354275i, qfVar.f354275i) && C46238a.m51546a(Boolean.valueOf(this.f354276j), Boolean.valueOf(qfVar.f354276j)) && C46238a.m51546a(this.f354277n, qfVar.f354277n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f354270d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f354271e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f354272f);
            String str3 = this.f354273g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f354274h);
            String str4 = this.f354275i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74314a(7, this.f354276j);
            fz4 fz4 = this.f354277n;
            if (fz4 != null) {
                aVar.mo74322i(8, fz4.computeSize());
                this.f354277n.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f354270d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f354271e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int e = i2 + C52418a.m58678e(3, this.f354272f);
            String str7 = this.f354273g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            int e2 = e + C52418a.m58678e(5, this.f354274h);
            String str8 = this.f354275i;
            if (str8 != null) {
                e2 += C52418a.m58683j(6, str8);
            }
            int a = e2 + C52418a.m58674a(7, this.f354276j);
            fz4 fz42 = this.f354277n;
            return fz42 != null ? a + C52418a.m58682i(8, fz42.computeSize()) : a;
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
            C118459qf qfVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    qfVar.f354270d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    qfVar.f354271e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    qfVar.f354272f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    qfVar.f354273g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    qfVar.f354274h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    qfVar.f354275i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    qfVar.f354276j = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        fz4 fz43 = new fz4();
                        if (bArr != null && bArr.length > 0) {
                            fz43.parseFrom(bArr);
                        }
                        qfVar.f354277n = fz43;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
