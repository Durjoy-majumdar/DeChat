package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jb0 */
public class C49970jb0 extends C47465a {

    /* renamed from: d */
    public long f135976d;

    /* renamed from: e */
    public String f135977e;

    /* renamed from: f */
    public int f135978f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49970jb0)) {
            return false;
        }
        C49970jb0 jb02 = (C49970jb0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f135976d), Long.valueOf(jb02.f135976d)) && C46238a.m51546a(this.f135977e, jb02.f135977e) && C46238a.m51546a(Integer.valueOf(this.f135978f), Integer.valueOf(jb02.f135978f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f135976d);
            String str = this.f135977e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f135978f);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f135976d) + 0;
            String str2 = this.f135977e;
            if (str2 != null) {
                h += C52418a.m58683j(2, str2);
            }
            return h + C52418a.m58678e(3, this.f135978f);
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
            C49970jb0 jb02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                jb02.f135976d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                jb02.f135977e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                jb02.f135978f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
