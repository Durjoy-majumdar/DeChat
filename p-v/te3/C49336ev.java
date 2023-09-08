package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ev */
public class C49336ev extends C47465a {

    /* renamed from: d */
    public int f133128d;

    /* renamed from: e */
    public LinkedList<String> f133129e = new LinkedList<>();

    /* renamed from: f */
    public String f133130f;

    /* renamed from: g */
    public long f133131g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49336ev)) {
            return false;
        }
        C49336ev evVar = (C49336ev) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f133128d), Integer.valueOf(evVar.f133128d)) && C46238a.m51546a(this.f133129e, evVar.f133129e) && C46238a.m51546a(this.f133130f, evVar.f133130f) && C46238a.m51546a(Long.valueOf(this.f133131g), Long.valueOf(evVar.f133131g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f133128d);
            aVar.mo74320g(2, 1, this.f133129e);
            String str = this.f133130f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f133131g);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f133128d) + 0 + C52418a.m58680g(2, 1, this.f133129e);
            String str2 = this.f133130f;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            return e + C52418a.m58681h(4, this.f133131g);
        } else if (i == 2) {
            this.f133129e.clear();
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
            C49336ev evVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                evVar.f133128d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                evVar.f133129e.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue == 3) {
                evVar.f133130f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                evVar.f133131g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
