package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l83 */
public class C64516l83 extends C47465a {

    /* renamed from: d */
    public boolean f184048d;

    /* renamed from: e */
    public String f184049e;

    /* renamed from: f */
    public C64282cc0 f184050f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64516l83)) {
            return false;
        }
        C64516l83 l832 = (C64516l83) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f184048d), Boolean.valueOf(l832.f184048d)) && C46238a.m51546a(this.f184049e, l832.f184049e) && C46238a.m51546a(this.f184050f, l832.f184050f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f184048d);
            String str = this.f184049e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C64282cc0 cc02 = this.f184050f;
            if (cc02 != null) {
                aVar.mo74322i(3, cc02.computeSize());
                this.f184050f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f184048d) + 0;
            String str2 = this.f184049e;
            if (str2 != null) {
                a += C52418a.m58683j(2, str2);
            }
            C64282cc0 cc03 = this.f184050f;
            return cc03 != null ? a + C52418a.m58682i(3, cc03.computeSize()) : a;
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
            C64516l83 l832 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                l832.f184048d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 2) {
                l832.f184049e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64282cc0 cc04 = new C64282cc0();
                    if (bArr != null && bArr.length > 0) {
                        cc04.parseFrom(bArr);
                    }
                    l832.f184050f = cc04;
                }
                return 0;
            }
        }
    }
}
