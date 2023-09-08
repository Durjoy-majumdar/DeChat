package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.is0 */
public class C64453is0 extends C47465a {

    /* renamed from: d */
    public int f183732d;

    /* renamed from: e */
    public String f183733e;

    /* renamed from: f */
    public C64722t51 f183734f;

    /* renamed from: g */
    public C64795w51 f183735g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64453is0)) {
            return false;
        }
        C64453is0 is02 = (C64453is0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183732d), Integer.valueOf(is02.f183732d)) && C46238a.m51546a(this.f183733e, is02.f183733e) && C46238a.m51546a(this.f183734f, is02.f183734f) && C46238a.m51546a(this.f183735g, is02.f183735g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183732d);
            String str = this.f183733e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C64722t51 t512 = this.f183734f;
            if (t512 != null) {
                aVar.mo74322i(3, t512.computeSize());
                this.f183734f.writeFields(aVar);
            }
            C64795w51 w512 = this.f183735g;
            if (w512 != null) {
                aVar.mo74322i(4, w512.computeSize());
                this.f183735g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f183732d) + 0;
            String str2 = this.f183733e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            C64722t51 t513 = this.f183734f;
            if (t513 != null) {
                e += C52418a.m58682i(3, t513.computeSize());
            }
            C64795w51 w513 = this.f183735g;
            return w513 != null ? e + C52418a.m58682i(4, w513.computeSize()) : e;
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
            C64453is0 is02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                is02.f183732d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                is02.f183733e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64722t51 t514 = new C64722t51();
                    if (bArr != null && bArr.length > 0) {
                        t514.parseFrom(bArr);
                    }
                    is02.f183734f = t514;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C64795w51 w514 = new C64795w51();
                    if (bArr2 != null && bArr2.length > 0) {
                        w514.parseFrom(bArr2);
                    }
                    is02.f183735g = w514;
                }
                return 0;
            }
        }
    }
}
