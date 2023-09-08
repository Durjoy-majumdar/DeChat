package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yr2 */
public class C52159yr2 extends C47465a {

    /* renamed from: d */
    public String f145478d;

    /* renamed from: e */
    public int f145479e;

    /* renamed from: f */
    public C52299zr2 f145480f;

    /* renamed from: g */
    public C52299zr2 f145481g;

    /* renamed from: h */
    public C52299zr2 f145482h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52159yr2)) {
            return false;
        }
        C52159yr2 yr22 = (C52159yr2) aVar;
        return C46238a.m51546a(this.f145478d, yr22.f145478d) && C46238a.m51546a(Integer.valueOf(this.f145479e), Integer.valueOf(yr22.f145479e)) && C46238a.m51546a(this.f145480f, yr22.f145480f) && C46238a.m51546a(this.f145481g, yr22.f145481g) && C46238a.m51546a(this.f145482h, yr22.f145482h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f145478d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f145479e);
            C52299zr2 zr22 = this.f145480f;
            if (zr22 != null) {
                aVar.mo74322i(3, zr22.computeSize());
                this.f145480f.writeFields(aVar);
            }
            C52299zr2 zr23 = this.f145481g;
            if (zr23 != null) {
                aVar.mo74322i(4, zr23.computeSize());
                this.f145481g.writeFields(aVar);
            }
            C52299zr2 zr24 = this.f145482h;
            if (zr24 != null) {
                aVar.mo74322i(5, zr24.computeSize());
                this.f145482h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f145478d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int e = i2 + C52418a.m58678e(2, this.f145479e);
            C52299zr2 zr25 = this.f145480f;
            if (zr25 != null) {
                e += C52418a.m58682i(3, zr25.computeSize());
            }
            C52299zr2 zr26 = this.f145481g;
            if (zr26 != null) {
                e += C52418a.m58682i(4, zr26.computeSize());
            }
            C52299zr2 zr27 = this.f145482h;
            return zr27 != null ? e + C52418a.m58682i(5, zr27.computeSize()) : e;
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
            C52159yr2 yr22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                yr22.f145478d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                yr22.f145479e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52299zr2 zr28 = new C52299zr2();
                    if (bArr != null && bArr.length > 0) {
                        zr28.parseFrom(bArr);
                    }
                    yr22.f145480f = zr28;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52299zr2 zr29 = new C52299zr2();
                    if (bArr2 != null && bArr2.length > 0) {
                        zr29.parseFrom(bArr2);
                    }
                    yr22.f145481g = zr29;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C52299zr2 zr210 = new C52299zr2();
                    if (bArr3 != null && bArr3.length > 0) {
                        zr210.parseFrom(bArr3);
                    }
                    yr22.f145482h = zr210;
                }
                return 0;
            }
        }
    }
}
