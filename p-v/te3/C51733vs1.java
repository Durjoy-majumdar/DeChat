package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vs1 */
public class C51733vs1 extends C47465a {

    /* renamed from: d */
    public C51149rs1 f143669d;

    /* renamed from: e */
    public boolean f143670e;

    /* renamed from: f */
    public int f143671f;

    /* renamed from: g */
    public String f143672g;

    /* renamed from: h */
    public String f143673h;

    /* renamed from: i */
    public int f143674i;

    /* renamed from: j */
    public C89349b f143675j;

    /* renamed from: n */
    public String f143676n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51733vs1)) {
            return false;
        }
        C51733vs1 vs12 = (C51733vs1) aVar;
        return C46238a.m51546a(this.f143669d, vs12.f143669d) && C46238a.m51546a(Boolean.valueOf(this.f143670e), Boolean.valueOf(vs12.f143670e)) && C46238a.m51546a(Integer.valueOf(this.f143671f), Integer.valueOf(vs12.f143671f)) && C46238a.m51546a(this.f143672g, vs12.f143672g) && C46238a.m51546a(this.f143673h, vs12.f143673h) && C46238a.m51546a(Integer.valueOf(this.f143674i), Integer.valueOf(vs12.f143674i)) && C46238a.m51546a(this.f143675j, vs12.f143675j) && C46238a.m51546a(this.f143676n, vs12.f143676n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51149rs1 rs12 = this.f143669d;
            if (rs12 != null) {
                aVar.mo74322i(1, rs12.computeSize());
                this.f143669d.writeFields(aVar);
            }
            aVar.mo74314a(2, this.f143670e);
            aVar.mo74318e(3, this.f143671f);
            String str = this.f143672g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f143673h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f143674i);
            C89349b bVar = this.f143675j;
            if (bVar != null) {
                aVar.mo74315b(7, bVar);
            }
            String str3 = this.f143676n;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            return 0;
        } else if (i == 1) {
            C51149rs1 rs13 = this.f143669d;
            if (rs13 != null) {
                i2 = 0 + C52418a.m58682i(1, rs13.computeSize());
            }
            int a = i2 + C52418a.m58674a(2, this.f143670e) + C52418a.m58678e(3, this.f143671f);
            String str4 = this.f143672g;
            if (str4 != null) {
                a += C52418a.m58683j(4, str4);
            }
            String str5 = this.f143673h;
            if (str5 != null) {
                a += C52418a.m58683j(5, str5);
            }
            int e = a + C52418a.m58678e(6, this.f143674i);
            C89349b bVar2 = this.f143675j;
            if (bVar2 != null) {
                e += C52418a.m58675b(7, bVar2);
            }
            String str6 = this.f143676n;
            return str6 != null ? e + C52418a.m58683j(8, str6) : e;
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
            C51733vs1 vs12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51149rs1 rs14 = new C51149rs1();
                        if (bArr != null && bArr.length > 0) {
                            rs14.parseFrom(bArr);
                        }
                        vs12.f143669d = rs14;
                    }
                    return 0;
                case 2:
                    vs12.f143670e = aVar3.mo141625c(intValue);
                    return 0;
                case 3:
                    vs12.f143671f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    vs12.f143672g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    vs12.f143673h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    vs12.f143674i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    vs12.f143675j = aVar3.mo141626d(intValue);
                    return 0;
                case 8:
                    vs12.f143676n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
