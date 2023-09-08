package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fj1 */
public class C49431fj1 extends C47465a {

    /* renamed from: d */
    public String f133532d;

    /* renamed from: e */
    public LinkedList<FinderObject> f133533e = new LinkedList<>();

    /* renamed from: f */
    public C89349b f133534f;

    /* renamed from: g */
    public int f133535g;

    /* renamed from: h */
    public int f133536h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49431fj1)) {
            return false;
        }
        C49431fj1 fj12 = (C49431fj1) aVar;
        return C46238a.m51546a(this.f133532d, fj12.f133532d) && C46238a.m51546a(this.f133533e, fj12.f133533e) && C46238a.m51546a(this.f133534f, fj12.f133534f) && C46238a.m51546a(Integer.valueOf(this.f133535g), Integer.valueOf(fj12.f133535g)) && C46238a.m51546a(Integer.valueOf(this.f133536h), Integer.valueOf(fj12.f133536h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f133532d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f133533e);
            C89349b bVar = this.f133534f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f133535g);
            aVar.mo74318e(5, this.f133536h);
            return 0;
        } else if (i == 1) {
            String str2 = this.f133532d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f133533e);
            C89349b bVar2 = this.f133534f;
            if (bVar2 != null) {
                g += C52418a.m58675b(3, bVar2);
            }
            return g + C52418a.m58678e(4, this.f133535g) + C52418a.m58678e(5, this.f133536h);
        } else if (i == 2) {
            this.f133533e.clear();
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
            C49431fj1 fj12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                fj12.f133532d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    FinderObject finderObject = new FinderObject();
                    if (bArr != null && bArr.length > 0) {
                        finderObject.parseFrom(bArr);
                    }
                    fj12.f133533e.add(finderObject);
                }
                return 0;
            } else if (intValue == 3) {
                fj12.f133534f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 4) {
                fj12.f133535g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                fj12.f133536h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
