package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o10 */
public class C50620o10 extends C47465a {

    /* renamed from: d */
    public C52206z23 f138896d;

    /* renamed from: e */
    public LinkedList<C51492u40> f138897e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<vr4> f138898f = new LinkedList<>();

    /* renamed from: g */
    public String f138899g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50620o10)) {
            return false;
        }
        C50620o10 o102 = (C50620o10) aVar;
        return C46238a.m51546a(this.f138896d, o102.f138896d) && C46238a.m51546a(this.f138897e, o102.f138897e) && C46238a.m51546a(this.f138898f, o102.f138898f) && C46238a.m51546a(this.f138899g, o102.f138899g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C52206z23 z232 = this.f138896d;
            if (z232 != null) {
                aVar.mo74322i(1, z232.computeSize());
                this.f138896d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f138897e);
            aVar.mo74320g(3, 8, this.f138898f);
            String str = this.f138899g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            return 0;
        } else if (i == 1) {
            C52206z23 z233 = this.f138896d;
            if (z233 != null) {
                i2 = 0 + C52418a.m58682i(1, z233.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f138897e) + C52418a.m58680g(3, 8, this.f138898f);
            String str2 = this.f138899g;
            return str2 != null ? g + C52418a.m58683j(4, str2) : g;
        } else if (i == 2) {
            this.f138897e.clear();
            this.f138898f.clear();
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
            C50620o10 o102 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52206z23 z234 = new C52206z23();
                    if (bArr != null && bArr.length > 0) {
                        z234.parseFrom(bArr);
                    }
                    o102.f138896d = z234;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51492u40 u402 = new C51492u40();
                    if (bArr2 != null && bArr2.length > 0) {
                        u402.parseFrom(bArr2);
                    }
                    o102.f138897e.add(u402);
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    vr4 vr4 = new vr4();
                    if (bArr3 != null && bArr3.length > 0) {
                        vr4.parseFrom(bArr3);
                    }
                    o102.f138898f.add(vr4);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                o102.f138899g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
