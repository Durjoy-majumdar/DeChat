package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class u54 extends C47465a {

    /* renamed from: d */
    public zf4 f142605d;

    /* renamed from: e */
    public C52024xu3 f142606e;

    /* renamed from: f */
    public int f142607f;

    /* renamed from: g */
    public String f142608g;

    /* renamed from: h */
    public C50456mv3 f142609h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof u54)) {
            return false;
        }
        u54 u54 = (u54) aVar;
        return C46238a.m51546a(this.f142605d, u54.f142605d) && C46238a.m51546a(this.f142606e, u54.f142606e) && C46238a.m51546a(Integer.valueOf(this.f142607f), Integer.valueOf(u54.f142607f)) && C46238a.m51546a(this.f142608g, u54.f142608g) && C46238a.m51546a(this.f142609h, u54.f142609h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            zf4 zf4 = this.f142605d;
            if (zf4 != null) {
                aVar.mo74322i(1, zf4.computeSize());
                this.f142605d.writeFields(aVar);
            }
            C52024xu3 xu32 = this.f142606e;
            if (xu32 != null) {
                aVar.mo74322i(2, xu32.computeSize());
                this.f142606e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f142607f);
            String str = this.f142608g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            C50456mv3 mv32 = this.f142609h;
            if (mv32 != null) {
                aVar.mo74322i(5, mv32.computeSize());
                this.f142609h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            zf4 zf42 = this.f142605d;
            if (zf42 != null) {
                i2 = 0 + C52418a.m58682i(1, zf42.computeSize());
            }
            C52024xu3 xu33 = this.f142606e;
            if (xu33 != null) {
                i2 += C52418a.m58682i(2, xu33.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f142607f);
            String str2 = this.f142608g;
            if (str2 != null) {
                e += C52418a.m58683j(4, str2);
            }
            C50456mv3 mv33 = this.f142609h;
            return mv33 != null ? e + C52418a.m58682i(5, mv33.computeSize()) : e;
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
            u54 u54 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    zf4 zf43 = new zf4();
                    if (bArr != null && bArr.length > 0) {
                        zf43.parseFrom(bArr);
                    }
                    u54.f142605d = zf43;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52024xu3 xu34 = new C52024xu3();
                    if (bArr2 != null && bArr2.length > 0) {
                        xu34.parseFrom(bArr2);
                    }
                    u54.f142606e = xu34;
                }
                return 0;
            } else if (intValue == 3) {
                u54.f142607f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                u54.f142608g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C50456mv3 mv34 = new C50456mv3();
                    if (bArr3 != null && bArr3.length > 0) {
                        mv34.parseFrom(bArr3);
                    }
                    u54.f142609h = mv34;
                }
                return 0;
            }
        }
    }
}
