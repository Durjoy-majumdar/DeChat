package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class lb4 extends C47465a {

    /* renamed from: d */
    public int f137284d;

    /* renamed from: e */
    public String f137285e;

    /* renamed from: f */
    public C89349b f137286f;

    /* renamed from: g */
    public int f137287g;

    /* renamed from: h */
    public int f137288h;

    /* renamed from: i */
    public C49524g70 f137289i;

    /* renamed from: j */
    public C49389f70 f137290j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof lb4)) {
            return false;
        }
        lb4 lb4 = (lb4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f137284d), Integer.valueOf(lb4.f137284d)) && C46238a.m51546a(this.f137285e, lb4.f137285e) && C46238a.m51546a(this.f137286f, lb4.f137286f) && C46238a.m51546a(Integer.valueOf(this.f137287g), Integer.valueOf(lb4.f137287g)) && C46238a.m51546a(Integer.valueOf(this.f137288h), Integer.valueOf(lb4.f137288h)) && C46238a.m51546a(this.f137289i, lb4.f137289i) && C46238a.m51546a(this.f137290j, lb4.f137290j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f137284d);
            String str = this.f137285e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C89349b bVar = this.f137286f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f137287g);
            aVar.mo74318e(5, this.f137288h);
            C49524g70 g702 = this.f137289i;
            if (g702 != null) {
                aVar.mo74322i(6, g702.computeSize());
                this.f137289i.writeFields(aVar);
            }
            C49389f70 f702 = this.f137290j;
            if (f702 != null) {
                aVar.mo74322i(7, f702.computeSize());
                this.f137290j.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f137284d) + 0;
            String str2 = this.f137285e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            C89349b bVar2 = this.f137286f;
            if (bVar2 != null) {
                e += C52418a.m58675b(3, bVar2);
            }
            int e2 = e + C52418a.m58678e(4, this.f137287g) + C52418a.m58678e(5, this.f137288h);
            C49524g70 g703 = this.f137289i;
            if (g703 != null) {
                e2 += C52418a.m58682i(6, g703.computeSize());
            }
            C49389f70 f703 = this.f137290j;
            return f703 != null ? e2 + C52418a.m58682i(7, f703.computeSize()) : e2;
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
            lb4 lb4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    lb4.f137284d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    lb4.f137285e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    lb4.f137286f = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    lb4.f137287g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    lb4.f137288h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C49524g70 g704 = new C49524g70();
                        if (bArr != null && bArr.length > 0) {
                            g704.parseFrom(bArr);
                        }
                        lb4.f137289i = g704;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C49389f70 f704 = new C49389f70();
                        if (bArr2 != null && bArr2.length > 0) {
                            f704.parseFrom(bArr2);
                        }
                        lb4.f137290j = f704;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
