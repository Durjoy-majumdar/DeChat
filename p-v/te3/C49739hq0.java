package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hq0 */
public class C49739hq0 extends C47465a {

    /* renamed from: d */
    public long f134815d;

    /* renamed from: e */
    public LinkedList<C50581nr0> f134816e = new LinkedList<>();

    /* renamed from: f */
    public String f134817f;

    /* renamed from: g */
    public int f134818g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49739hq0)) {
            return false;
        }
        C49739hq0 hq02 = (C49739hq0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f134815d), Long.valueOf(hq02.f134815d)) && C46238a.m51546a(this.f134816e, hq02.f134816e) && C46238a.m51546a(this.f134817f, hq02.f134817f) && C46238a.m51546a(Integer.valueOf(this.f134818g), Integer.valueOf(hq02.f134818g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f134815d);
            aVar.mo74320g(2, 8, this.f134816e);
            String str = this.f134817f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f134818g);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f134815d) + 0 + C52418a.m58680g(2, 8, this.f134816e);
            String str2 = this.f134817f;
            if (str2 != null) {
                h += C52418a.m58683j(3, str2);
            }
            return h + C52418a.m58678e(4, this.f134818g);
        } else if (i == 2) {
            this.f134816e.clear();
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
            C49739hq0 hq02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                hq02.f134815d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50581nr0 nr02 = new C50581nr0();
                    if (bArr != null && bArr.length > 0) {
                        nr02.parseFrom(bArr);
                    }
                    hq02.f134816e.add(nr02);
                }
                return 0;
            } else if (intValue == 3) {
                hq02.f134817f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                hq02.f134818g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
