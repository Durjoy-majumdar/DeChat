package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i90 */
public class C64440i90 extends C47465a {

    /* renamed from: d */
    public C64227aa0 f183637d;

    /* renamed from: e */
    public C64227aa0 f183638e;

    /* renamed from: f */
    public C64227aa0 f183639f;

    /* renamed from: g */
    public int f183640g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64440i90)) {
            return false;
        }
        C64440i90 i902 = (C64440i90) aVar;
        return C46238a.m51546a(this.f183637d, i902.f183637d) && C46238a.m51546a(this.f183638e, i902.f183638e) && C46238a.m51546a(this.f183639f, i902.f183639f) && C46238a.m51546a(Integer.valueOf(this.f183640g), Integer.valueOf(i902.f183640g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64227aa0 aa02 = this.f183637d;
            if (aa02 != null) {
                aVar.mo74322i(1, aa02.computeSize());
                this.f183637d.writeFields(aVar);
            }
            C64227aa0 aa03 = this.f183638e;
            if (aa03 != null) {
                aVar.mo74322i(2, aa03.computeSize());
                this.f183638e.writeFields(aVar);
            }
            C64227aa0 aa04 = this.f183639f;
            if (aa04 != null) {
                aVar.mo74322i(3, aa04.computeSize());
                this.f183639f.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f183640g);
            return 0;
        } else if (i == 1) {
            C64227aa0 aa05 = this.f183637d;
            if (aa05 != null) {
                i2 = 0 + C52418a.m58682i(1, aa05.computeSize());
            }
            C64227aa0 aa06 = this.f183638e;
            if (aa06 != null) {
                i2 += C52418a.m58682i(2, aa06.computeSize());
            }
            C64227aa0 aa07 = this.f183639f;
            if (aa07 != null) {
                i2 += C52418a.m58682i(3, aa07.computeSize());
            }
            return i2 + C52418a.m58678e(4, this.f183640g);
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
            C64440i90 i902 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64227aa0 aa08 = new C64227aa0();
                    if (bArr != null && bArr.length > 0) {
                        aa08.parseFrom(bArr);
                    }
                    i902.f183637d = aa08;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64227aa0 aa09 = new C64227aa0();
                    if (bArr2 != null && bArr2.length > 0) {
                        aa09.parseFrom(bArr2);
                    }
                    i902.f183638e = aa09;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C64227aa0 aa010 = new C64227aa0();
                    if (bArr3 != null && bArr3.length > 0) {
                        aa010.parseFrom(bArr3);
                    }
                    i902.f183639f = aa010;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                i902.f183640g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
