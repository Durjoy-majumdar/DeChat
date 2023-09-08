package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class f75 extends C47465a {

    /* renamed from: d */
    public e75 f133344d;

    /* renamed from: e */
    public LinkedList<Integer> f133345e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<Integer> f133346f = new LinkedList<>();

    /* renamed from: g */
    public int f133347g;

    /* renamed from: h */
    public int f133348h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof f75)) {
            return false;
        }
        f75 f75 = (f75) aVar;
        return C46238a.m51546a(this.f133344d, f75.f133344d) && C46238a.m51546a(this.f133345e, f75.f133345e) && C46238a.m51546a(this.f133346f, f75.f133346f) && C46238a.m51546a(Integer.valueOf(this.f133347g), Integer.valueOf(f75.f133347g)) && C46238a.m51546a(Integer.valueOf(this.f133348h), Integer.valueOf(f75.f133348h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            e75 e75 = this.f133344d;
            if (e75 != null) {
                aVar.mo74322i(1, e75.computeSize());
                this.f133344d.writeFields(aVar);
            }
            aVar.mo74320g(2, 2, this.f133345e);
            aVar.mo74320g(3, 2, this.f133346f);
            aVar.mo74318e(4, this.f133347g);
            aVar.mo74318e(5, this.f133348h);
            return 0;
        } else if (i == 1) {
            e75 e752 = this.f133344d;
            if (e752 != null) {
                i2 = 0 + C52418a.m58682i(1, e752.computeSize());
            }
            return i2 + C52418a.m58680g(2, 2, this.f133345e) + C52418a.m58680g(3, 2, this.f133346f) + C52418a.m58678e(4, this.f133347g) + C52418a.m58678e(5, this.f133348h);
        } else if (i == 2) {
            this.f133345e.clear();
            this.f133346f.clear();
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
            f75 f75 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    e75 e753 = new e75();
                    if (bArr != null && bArr.length > 0) {
                        e753.parseFrom(bArr);
                    }
                    f75.f133344d = e753;
                }
                return 0;
            } else if (intValue == 2) {
                f75.f133345e.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                return 0;
            } else if (intValue == 3) {
                f75.f133346f.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                return 0;
            } else if (intValue == 4) {
                f75.f133347g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                f75.f133348h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
