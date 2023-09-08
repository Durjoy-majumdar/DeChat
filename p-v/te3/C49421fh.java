package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fh */
public class C49421fh extends C47465a {

    /* renamed from: d */
    public int f133490d;

    /* renamed from: e */
    public String f133491e;

    /* renamed from: f */
    public LinkedList<C22495eh> f133492f = new LinkedList<>();

    /* renamed from: g */
    public long f133493g;

    /* renamed from: h */
    public LinkedList<C49993ji> f133494h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49421fh)) {
            return false;
        }
        C49421fh fhVar = (C49421fh) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f133490d), Integer.valueOf(fhVar.f133490d)) && C46238a.m51546a(this.f133491e, fhVar.f133491e) && C46238a.m51546a(this.f133492f, fhVar.f133492f) && C46238a.m51546a(Long.valueOf(this.f133493g), Long.valueOf(fhVar.f133493g)) && C46238a.m51546a(this.f133494h, fhVar.f133494h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f133490d);
            String str = this.f133491e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 8, this.f133492f);
            aVar.mo74321h(4, this.f133493g);
            aVar.mo74320g(5, 8, this.f133494h);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f133490d) + 0;
            String str2 = this.f133491e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            return e + C52418a.m58680g(3, 8, this.f133492f) + C52418a.m58681h(4, this.f133493g) + C52418a.m58680g(5, 8, this.f133494h);
        } else if (i == 2) {
            this.f133492f.clear();
            this.f133494h.clear();
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
            C49421fh fhVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                fhVar.f133490d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                fhVar.f133491e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C22495eh ehVar = new C22495eh();
                    if (bArr != null && bArr.length > 0) {
                        ehVar.parseFrom(bArr);
                    }
                    fhVar.f133492f.add(ehVar);
                }
                return 0;
            } else if (intValue == 4) {
                fhVar.f133493g = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C49993ji jiVar = new C49993ji();
                    if (bArr2 != null && bArr2.length > 0) {
                        jiVar.parseFrom(bArr2);
                    }
                    fhVar.f133494h.add(jiVar);
                }
                return 0;
            }
        }
    }
}
