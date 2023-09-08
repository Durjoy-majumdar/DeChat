package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fv0 */
public class C49476fv0 extends C47465a {

    /* renamed from: d */
    public String f133702d;

    /* renamed from: e */
    public C51424to2 f133703e;

    /* renamed from: f */
    public String f133704f;

    /* renamed from: g */
    public LinkedList<C48654a21> f133705g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49476fv0)) {
            return false;
        }
        C49476fv0 fv02 = (C49476fv0) aVar;
        return C46238a.m51546a(this.f133702d, fv02.f133702d) && C46238a.m51546a(this.f133703e, fv02.f133703e) && C46238a.m51546a(this.f133704f, fv02.f133704f) && C46238a.m51546a(this.f133705g, fv02.f133705g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f133702d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C51424to2 to22 = this.f133703e;
            if (to22 != null) {
                aVar.mo74322i(2, to22.computeSize());
                this.f133703e.writeFields(aVar);
            }
            String str2 = this.f133704f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74320g(4, 8, this.f133705g);
            return 0;
        } else if (i == 1) {
            String str3 = this.f133702d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            C51424to2 to23 = this.f133703e;
            if (to23 != null) {
                i2 += C52418a.m58682i(2, to23.computeSize());
            }
            String str4 = this.f133704f;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            return i2 + C52418a.m58680g(4, 8, this.f133705g);
        } else if (i == 2) {
            this.f133705g.clear();
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
            C49476fv0 fv02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                fv02.f133702d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51424to2 to24 = new C51424to2();
                    if (bArr != null && bArr.length > 0) {
                        to24.parseFrom(bArr);
                    }
                    fv02.f133703e = to24;
                }
                return 0;
            } else if (intValue == 3) {
                fv02.f133704f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48654a21 a212 = new C48654a21();
                    if (bArr2 != null && bArr2.length > 0) {
                        a212.parseFrom(bArr2);
                    }
                    fv02.f133705g.add(a212);
                }
                return 0;
            }
        }
    }
}
