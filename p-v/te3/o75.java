package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class o75 extends C47465a {

    /* renamed from: d */
    public e75 f139012d;

    /* renamed from: e */
    public String f139013e;

    /* renamed from: f */
    public LinkedList<Integer> f139014f = new LinkedList<>();

    /* renamed from: g */
    public int f139015g;

    /* renamed from: h */
    public int f139016h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof o75)) {
            return false;
        }
        o75 o75 = (o75) aVar;
        return C46238a.m51546a(this.f139012d, o75.f139012d) && C46238a.m51546a(this.f139013e, o75.f139013e) && C46238a.m51546a(this.f139014f, o75.f139014f) && C46238a.m51546a(Integer.valueOf(this.f139015g), Integer.valueOf(o75.f139015g)) && C46238a.m51546a(Integer.valueOf(this.f139016h), Integer.valueOf(o75.f139016h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            e75 e75 = this.f139012d;
            if (e75 != null) {
                aVar.mo74322i(1, e75.computeSize());
                this.f139012d.writeFields(aVar);
            }
            String str = this.f139013e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 2, this.f139014f);
            aVar.mo74318e(4, this.f139015g);
            aVar.mo74318e(5, this.f139016h);
            return 0;
        } else if (i == 1) {
            e75 e752 = this.f139012d;
            if (e752 != null) {
                i2 = 0 + C52418a.m58682i(1, e752.computeSize());
            }
            String str2 = this.f139013e;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58680g(3, 2, this.f139014f) + C52418a.m58678e(4, this.f139015g) + C52418a.m58678e(5, this.f139016h);
        } else if (i == 2) {
            this.f139014f.clear();
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
            o75 o75 = objArr[1];
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
                    o75.f139012d = e753;
                }
                return 0;
            } else if (intValue == 2) {
                o75.f139013e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                o75.f139014f.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                return 0;
            } else if (intValue == 4) {
                o75.f139015g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                o75.f139016h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
