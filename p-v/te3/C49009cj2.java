package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cj2 */
public class C49009cj2 extends C47465a {

    /* renamed from: d */
    public zf4 f131776d;

    /* renamed from: e */
    public LinkedList<te4> f131777e = new LinkedList<>();

    /* renamed from: f */
    public zf4 f131778f;

    /* renamed from: g */
    public String f131779g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49009cj2)) {
            return false;
        }
        C49009cj2 cj22 = (C49009cj2) aVar;
        return C46238a.m51546a(this.f131776d, cj22.f131776d) && C46238a.m51546a(this.f131777e, cj22.f131777e) && C46238a.m51546a(this.f131778f, cj22.f131778f) && C46238a.m51546a(this.f131779g, cj22.f131779g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            zf4 zf4 = this.f131776d;
            if (zf4 != null) {
                aVar.mo74322i(1, zf4.computeSize());
                this.f131776d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f131777e);
            zf4 zf42 = this.f131778f;
            if (zf42 != null) {
                aVar.mo74322i(3, zf42.computeSize());
                this.f131778f.writeFields(aVar);
            }
            String str = this.f131779g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            return 0;
        } else if (i == 1) {
            zf4 zf43 = this.f131776d;
            if (zf43 != null) {
                i2 = 0 + C52418a.m58682i(1, zf43.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f131777e);
            zf4 zf44 = this.f131778f;
            if (zf44 != null) {
                g += C52418a.m58682i(3, zf44.computeSize());
            }
            String str2 = this.f131779g;
            return str2 != null ? g + C52418a.m58683j(4, str2) : g;
        } else if (i == 2) {
            this.f131777e.clear();
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
            C49009cj2 cj22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    zf4 zf45 = new zf4();
                    if (bArr != null && bArr.length > 0) {
                        zf45.parseFrom(bArr);
                    }
                    cj22.f131776d = zf45;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    te4 te4 = new te4();
                    if (bArr2 != null && bArr2.length > 0) {
                        te4.parseFrom(bArr2);
                    }
                    cj22.f131777e.add(te4);
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    zf4 zf46 = new zf4();
                    if (bArr3 != null && bArr3.length > 0) {
                        zf46.parseFrom(bArr3);
                    }
                    cj22.f131778f = zf46;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                cj22.f131779g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
