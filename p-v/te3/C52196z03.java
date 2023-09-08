package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z03 */
public class C52196z03 extends C47465a {

    /* renamed from: d */
    public zf4 f145621d;

    /* renamed from: e */
    public LinkedList<C52024xu3> f145622e = new LinkedList<>();

    /* renamed from: f */
    public int f145623f;

    /* renamed from: g */
    public String f145624g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52196z03)) {
            return false;
        }
        C52196z03 z032 = (C52196z03) aVar;
        return C46238a.m51546a(this.f145621d, z032.f145621d) && C46238a.m51546a(this.f145622e, z032.f145622e) && C46238a.m51546a(Integer.valueOf(this.f145623f), Integer.valueOf(z032.f145623f)) && C46238a.m51546a(this.f145624g, z032.f145624g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            zf4 zf4 = this.f145621d;
            if (zf4 != null) {
                aVar.mo74322i(1, zf4.computeSize());
                this.f145621d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f145622e);
            aVar.mo74318e(3, this.f145623f);
            String str = this.f145624g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            return 0;
        } else if (i == 1) {
            zf4 zf42 = this.f145621d;
            if (zf42 != null) {
                i2 = 0 + C52418a.m58682i(1, zf42.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f145622e) + C52418a.m58678e(3, this.f145623f);
            String str2 = this.f145624g;
            return str2 != null ? g + C52418a.m58683j(4, str2) : g;
        } else if (i == 2) {
            this.f145622e.clear();
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
            C52196z03 z032 = objArr[1];
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
                    z032.f145621d = zf43;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52024xu3 xu32 = new C52024xu3();
                    if (bArr2 != null && bArr2.length > 0) {
                        xu32.parseFrom(bArr2);
                    }
                    z032.f145622e.add(xu32);
                }
                return 0;
            } else if (intValue == 3) {
                z032.f145623f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                z032.f145624g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
