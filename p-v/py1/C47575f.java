package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.f */
public class C47575f extends C47465a {

    /* renamed from: d */
    public int f127677d;

    /* renamed from: e */
    public C47589h f127678e;

    /* renamed from: f */
    public C47561d f127679f;

    /* renamed from: g */
    public String f127680g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47575f)) {
            return false;
        }
        C47575f fVar = (C47575f) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f127677d), Integer.valueOf(fVar.f127677d)) && C46238a.m51546a(this.f127678e, fVar.f127678e) && C46238a.m51546a(this.f127679f, fVar.f127679f) && C46238a.m51546a(this.f127680g, fVar.f127680g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f127677d);
            C47589h hVar = this.f127678e;
            if (hVar != null) {
                aVar.mo74322i(2, hVar.computeSize());
                this.f127678e.writeFields(aVar);
            }
            C47561d dVar = this.f127679f;
            if (dVar != null) {
                aVar.mo74322i(3, dVar.computeSize());
                this.f127679f.writeFields(aVar);
            }
            String str = this.f127680g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f127677d) + 0;
            C47589h hVar2 = this.f127678e;
            if (hVar2 != null) {
                e += C52418a.m58682i(2, hVar2.computeSize());
            }
            C47561d dVar2 = this.f127679f;
            if (dVar2 != null) {
                e += C52418a.m58682i(3, dVar2.computeSize());
            }
            String str2 = this.f127680g;
            return str2 != null ? e + C52418a.m58683j(4, str2) : e;
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
            C47575f fVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                fVar.f127677d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C47589h hVar3 = new C47589h();
                    if (bArr != null && bArr.length > 0) {
                        hVar3.parseFrom(bArr);
                    }
                    fVar.f127678e = hVar3;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C47561d dVar3 = new C47561d();
                    if (bArr2 != null && bArr2.length > 0) {
                        dVar3.parseFrom(bArr2);
                    }
                    fVar.f127679f = dVar3;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                fVar.f127680g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
