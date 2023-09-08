package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xw */
public class C52030xw extends C49335eu3 {

    /* renamed from: d */
    public ja4 f145000d;

    /* renamed from: e */
    public ja4 f145001e;

    /* renamed from: f */
    public int f145002f;

    /* renamed from: g */
    public int f145003g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52030xw)) {
            return false;
        }
        C52030xw xwVar = (C52030xw) aVar;
        return C46238a.m51546a(this.BaseResponse, xwVar.BaseResponse) && C46238a.m51546a(this.f145000d, xwVar.f145000d) && C46238a.m51546a(this.f145001e, xwVar.f145001e) && C46238a.m51546a(Integer.valueOf(this.f145002f), Integer.valueOf(xwVar.f145002f)) && C46238a.m51546a(Integer.valueOf(this.f145003g), Integer.valueOf(xwVar.f145003g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            ja4 ja4 = this.f145000d;
            if (ja4 != null) {
                aVar.mo74322i(2, ja4.computeSize());
                this.f145000d.writeFields(aVar);
            }
            ja4 ja42 = this.f145001e;
            if (ja42 != null) {
                aVar.mo74322i(3, ja42.computeSize());
                this.f145001e.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f145002f);
            aVar.mo74318e(5, this.f145003g);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            ja4 ja43 = this.f145000d;
            if (ja43 != null) {
                i2 += C52418a.m58682i(2, ja43.computeSize());
            }
            ja4 ja44 = this.f145001e;
            if (ja44 != null) {
                i2 += C52418a.m58682i(3, ja44.computeSize());
            }
            return i2 + C52418a.m58678e(4, this.f145002f) + C52418a.m58678e(5, this.f145003g);
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
            C52030xw xwVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    xwVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    ja4 ja45 = new ja4();
                    if (bArr2 != null && bArr2.length > 0) {
                        ja45.parseFrom(bArr2);
                    }
                    xwVar.f145000d = ja45;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    ja4 ja46 = new ja4();
                    if (bArr3 != null && bArr3.length > 0) {
                        ja46.parseFrom(bArr3);
                    }
                    xwVar.f145001e = ja46;
                }
                return 0;
            } else if (intValue == 4) {
                xwVar.f145002f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                xwVar.f145003g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
