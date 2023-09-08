package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e93 */
public class C49253e93 extends C47465a {

    /* renamed from: d */
    public C50403mh3 f132817d;

    /* renamed from: e */
    public LinkedList<u54> f132818e = new LinkedList<>();

    /* renamed from: f */
    public String f132819f;

    /* renamed from: g */
    public zf4 f132820g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49253e93)) {
            return false;
        }
        C49253e93 e932 = (C49253e93) aVar;
        return C46238a.m51546a(this.f132817d, e932.f132817d) && C46238a.m51546a(this.f132818e, e932.f132818e) && C46238a.m51546a(this.f132819f, e932.f132819f) && C46238a.m51546a(this.f132820g, e932.f132820g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C50403mh3 mh32 = this.f132817d;
            if (mh32 != null) {
                aVar.mo74322i(1, mh32.computeSize());
                this.f132817d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f132818e);
            String str = this.f132819f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            zf4 zf4 = this.f132820g;
            if (zf4 != null) {
                aVar.mo74322i(4, zf4.computeSize());
                this.f132820g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C50403mh3 mh33 = this.f132817d;
            if (mh33 != null) {
                i2 = 0 + C52418a.m58682i(1, mh33.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f132818e);
            String str2 = this.f132819f;
            if (str2 != null) {
                g += C52418a.m58683j(3, str2);
            }
            zf4 zf42 = this.f132820g;
            return zf42 != null ? g + C52418a.m58682i(4, zf42.computeSize()) : g;
        } else if (i == 2) {
            this.f132818e.clear();
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
            C49253e93 e932 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50403mh3 mh34 = new C50403mh3();
                    if (bArr != null && bArr.length > 0) {
                        mh34.parseFrom(bArr);
                    }
                    e932.f132817d = mh34;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    u54 u54 = new u54();
                    if (bArr2 != null && bArr2.length > 0) {
                        u54.parseFrom(bArr2);
                    }
                    e932.f132818e.add(u54);
                }
                return 0;
            } else if (intValue == 3) {
                e932.f132819f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    zf4 zf43 = new zf4();
                    if (bArr3 != null && bArr3.length > 0) {
                        zf43.parseFrom(bArr3);
                    }
                    e932.f132820g = zf43;
                }
                return 0;
            }
        }
    }
}
