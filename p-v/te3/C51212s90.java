package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s90 */
public class C51212s90 extends C47465a {

    /* renamed from: d */
    public boolean f141380d;

    /* renamed from: e */
    public C64513l40 f141381e;

    /* renamed from: f */
    public int f141382f;

    /* renamed from: g */
    public int f141383g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51212s90)) {
            return false;
        }
        C51212s90 s902 = (C51212s90) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f141380d), Boolean.valueOf(s902.f141380d)) && C46238a.m51546a(this.f141381e, s902.f141381e) && C46238a.m51546a(Integer.valueOf(this.f141382f), Integer.valueOf(s902.f141382f)) && C46238a.m51546a(Integer.valueOf(this.f141383g), Integer.valueOf(s902.f141383g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f141380d);
            C64513l40 l402 = this.f141381e;
            if (l402 != null) {
                aVar.mo74322i(2, l402.computeSize());
                this.f141381e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f141382f);
            aVar.mo74318e(4, this.f141383g);
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f141380d) + 0;
            C64513l40 l403 = this.f141381e;
            if (l403 != null) {
                a += C52418a.m58682i(2, l403.computeSize());
            }
            return a + C52418a.m58678e(3, this.f141382f) + C52418a.m58678e(4, this.f141383g);
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
            C51212s90 s902 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                s902.f141380d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64513l40 l404 = new C64513l40();
                    if (bArr != null && bArr.length > 0) {
                        l404.parseFrom(bArr);
                    }
                    s902.f141381e = l404;
                }
                return 0;
            } else if (intValue == 3) {
                s902.f141382f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                s902.f141383g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
