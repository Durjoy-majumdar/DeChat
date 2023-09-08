package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import x14.C102536a;
import z14.C53733a;

public class g64 extends C47465a {

    /* renamed from: d */
    public C51163rv3 f133891d;

    /* renamed from: e */
    public int f133892e;

    /* renamed from: f */
    public C51163rv3 f133893f;

    /* renamed from: g */
    public int f133894g;

    /* renamed from: h */
    public int f133895h;

    /* renamed from: i */
    public LinkedList<Integer> f133896i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof g64)) {
            return false;
        }
        g64 g64 = (g64) aVar;
        return C46238a.m51546a(this.f133891d, g64.f133891d) && C46238a.m51546a(Integer.valueOf(this.f133892e), Integer.valueOf(g64.f133892e)) && C46238a.m51546a(this.f133893f, g64.f133893f) && C46238a.m51546a(Integer.valueOf(this.f133894g), Integer.valueOf(g64.f133894g)) && C46238a.m51546a(Integer.valueOf(this.f133895h), Integer.valueOf(g64.f133895h)) && C46238a.m51546a(this.f133896i, g64.f133896i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51163rv3 rv32 = this.f133891d;
            if (rv32 != null) {
                aVar.mo74322i(1, rv32.computeSize());
                this.f133891d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f133892e);
            C51163rv3 rv33 = this.f133893f;
            if (rv33 != null) {
                aVar.mo74322i(3, rv33.computeSize());
                this.f133893f.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f133894g);
            aVar.mo74318e(5, this.f133895h);
            aVar.mo74324k(6, 2, this.f133896i);
            return 0;
        } else if (i == 1) {
            C51163rv3 rv34 = this.f133891d;
            if (rv34 != null) {
                i2 = 0 + C52418a.m58682i(1, rv34.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f133892e);
            C51163rv3 rv35 = this.f133893f;
            if (rv35 != null) {
                e += C52418a.m58682i(3, rv35.computeSize());
            }
            return e + C52418a.m58678e(4, this.f133894g) + C52418a.m58678e(5, this.f133895h) + C52418a.m58684k(6, 2, this.f133896i);
        } else if (i == 2) {
            this.f133896i.clear();
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
            g64 g64 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51163rv3 rv36 = new C51163rv3();
                        if (bArr != null && bArr.length > 0) {
                            rv36.mo73356d(bArr);
                        }
                        g64.f133891d = rv36;
                    }
                    return 0;
                case 2:
                    g64.f133892e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51163rv3 rv37 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv37.mo73356d(bArr2);
                        }
                        g64.f133893f = rv37;
                    }
                    return 0;
                case 4:
                    g64.f133894g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    g64.f133895h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    byte[] bArr3 = aVar3.mo141626d(intValue).f257327a;
                    C102536a aVar4 = new C102536a(bArr3, 0, bArr3.length);
                    LinkedList<Integer> linkedList = new LinkedList<>();
                    while (aVar4.f301908c < aVar4.f301907b) {
                        linkedList.add(Integer.valueOf(aVar4.mo142153f()));
                    }
                    g64.f133896i = linkedList;
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
