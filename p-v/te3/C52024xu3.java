package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xu3 */
public class C52024xu3 extends C47465a {

    /* renamed from: d */
    public int f144978d;

    /* renamed from: e */
    public int f144979e;

    /* renamed from: f */
    public C50456mv3 f144980f;

    /* renamed from: g */
    public zf4 f144981g;

    /* renamed from: h */
    public String f144982h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52024xu3)) {
            return false;
        }
        C52024xu3 xu32 = (C52024xu3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f144978d), Integer.valueOf(xu32.f144978d)) && C46238a.m51546a(Integer.valueOf(this.f144979e), Integer.valueOf(xu32.f144979e)) && C46238a.m51546a(this.f144980f, xu32.f144980f) && C46238a.m51546a(this.f144981g, xu32.f144981g) && C46238a.m51546a(this.f144982h, xu32.f144982h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f144978d);
            aVar.mo74318e(2, this.f144979e);
            C50456mv3 mv32 = this.f144980f;
            if (mv32 != null) {
                aVar.mo74322i(3, mv32.computeSize());
                this.f144980f.writeFields(aVar);
            }
            zf4 zf4 = this.f144981g;
            if (zf4 != null) {
                aVar.mo74322i(4, zf4.computeSize());
                this.f144981g.writeFields(aVar);
            }
            String str = this.f144982h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f144978d) + 0 + C52418a.m58678e(2, this.f144979e);
            C50456mv3 mv33 = this.f144980f;
            if (mv33 != null) {
                e += C52418a.m58682i(3, mv33.computeSize());
            }
            zf4 zf42 = this.f144981g;
            if (zf42 != null) {
                e += C52418a.m58682i(4, zf42.computeSize());
            }
            String str2 = this.f144982h;
            return str2 != null ? e + C52418a.m58683j(5, str2) : e;
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
            C52024xu3 xu32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                xu32.f144978d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                xu32.f144979e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50456mv3 mv34 = new C50456mv3();
                    if (bArr != null && bArr.length > 0) {
                        mv34.parseFrom(bArr);
                    }
                    xu32.f144980f = mv34;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    zf4 zf43 = new zf4();
                    if (bArr2 != null && bArr2.length > 0) {
                        zf43.parseFrom(bArr2);
                    }
                    xu32.f144981g = zf43;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                xu32.f144982h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
