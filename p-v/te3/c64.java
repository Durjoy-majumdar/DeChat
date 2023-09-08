package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class c64 extends C47465a {

    /* renamed from: d */
    public int f131550d;

    /* renamed from: e */
    public LinkedList<C77908bi3> f131551e = new LinkedList<>();

    /* renamed from: f */
    public C49254ea0 f131552f;

    /* renamed from: g */
    public C77905b4 f131553g;

    /* renamed from: h */
    public LinkedList<C51858wn3> f131554h = new LinkedList<>();

    /* renamed from: i */
    public int f131555i;

    /* renamed from: j */
    public String f131556j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof c64)) {
            return false;
        }
        c64 c64 = (c64) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f131550d), Integer.valueOf(c64.f131550d)) && C46238a.m51546a(this.f131551e, c64.f131551e) && C46238a.m51546a(this.f131552f, c64.f131552f) && C46238a.m51546a(this.f131553g, c64.f131553g) && C46238a.m51546a(this.f131554h, c64.f131554h) && C46238a.m51546a(Integer.valueOf(this.f131555i), Integer.valueOf(c64.f131555i)) && C46238a.m51546a(this.f131556j, c64.f131556j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f131550d);
            aVar.mo74320g(2, 8, this.f131551e);
            C49254ea0 ea02 = this.f131552f;
            if (ea02 != null) {
                aVar.mo74322i(3, ea02.computeSize());
                this.f131552f.writeFields(aVar);
            }
            C77905b4 b4Var = this.f131553g;
            if (b4Var != null) {
                aVar.mo74322i(4, b4Var.computeSize());
                this.f131553g.writeFields(aVar);
            }
            aVar.mo74320g(5, 8, this.f131554h);
            aVar.mo74318e(6, this.f131555i);
            String str = this.f131556j;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f131550d) + 0 + C52418a.m58680g(2, 8, this.f131551e);
            C49254ea0 ea03 = this.f131552f;
            if (ea03 != null) {
                e += C52418a.m58682i(3, ea03.computeSize());
            }
            C77905b4 b4Var2 = this.f131553g;
            if (b4Var2 != null) {
                e += C52418a.m58682i(4, b4Var2.computeSize());
            }
            int g = e + C52418a.m58680g(5, 8, this.f131554h) + C52418a.m58678e(6, this.f131555i);
            String str2 = this.f131556j;
            return str2 != null ? g + C52418a.m58683j(7, str2) : g;
        } else if (i == 2) {
            this.f131551e.clear();
            this.f131554h.clear();
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
            c64 c64 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    c64.f131550d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C77908bi3 bi32 = new C77908bi3();
                        if (bArr != null && bArr.length > 0) {
                            bi32.parseFrom(bArr);
                        }
                        c64.f131551e.add(bi32);
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C49254ea0 ea04 = new C49254ea0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ea04.parseFrom(bArr2);
                        }
                        c64.f131552f = ea04;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C77905b4 b4Var3 = new C77905b4();
                        if (bArr3 != null && bArr3.length > 0) {
                            b4Var3.parseFrom(bArr3);
                        }
                        c64.f131553g = b4Var3;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        C51858wn3 wn32 = new C51858wn3();
                        if (bArr4 != null && bArr4.length > 0) {
                            wn32.parseFrom(bArr4);
                        }
                        c64.f131554h.add(wn32);
                    }
                    return 0;
                case 6:
                    c64.f131555i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    c64.f131556j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
