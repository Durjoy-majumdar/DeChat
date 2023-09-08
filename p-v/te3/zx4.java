package te3;

import com.tencent.p014mm.protocal.protobuf.SnsObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class zx4 extends C47465a {

    /* renamed from: d */
    public long f146273d;

    /* renamed from: e */
    public int f146274e;

    /* renamed from: f */
    public SnsObject f146275f;

    /* renamed from: g */
    public LinkedList<Long> f146276g = new LinkedList<>();

    /* renamed from: h */
    public String f146277h;

    /* renamed from: i */
    public String f146278i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof zx4)) {
            return false;
        }
        zx4 zx4 = (zx4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f146273d), Long.valueOf(zx4.f146273d)) && C46238a.m51546a(Integer.valueOf(this.f146274e), Integer.valueOf(zx4.f146274e)) && C46238a.m51546a(this.f146275f, zx4.f146275f) && C46238a.m51546a(this.f146276g, zx4.f146276g) && C46238a.m51546a(this.f146277h, zx4.f146277h) && C46238a.m51546a(this.f146278i, zx4.f146278i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f146273d);
            aVar.mo74318e(2, this.f146274e);
            SnsObject snsObject = this.f146275f;
            if (snsObject != null) {
                aVar.mo74322i(3, snsObject.computeSize());
                this.f146275f.writeFields(aVar);
            }
            aVar.mo74320g(4, 3, this.f146276g);
            String str = this.f146277h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f146278i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f146273d) + 0 + C52418a.m58678e(2, this.f146274e);
            SnsObject snsObject2 = this.f146275f;
            if (snsObject2 != null) {
                h += C52418a.m58682i(3, snsObject2.computeSize());
            }
            int g = h + C52418a.m58680g(4, 3, this.f146276g);
            String str3 = this.f146277h;
            if (str3 != null) {
                g += C52418a.m58683j(5, str3);
            }
            String str4 = this.f146278i;
            return str4 != null ? g + C52418a.m58683j(6, str4) : g;
        } else if (i == 2) {
            this.f146276g.clear();
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
            zx4 zx4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    zx4.f146273d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    zx4.f146274e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        SnsObject snsObject3 = new SnsObject();
                        if (bArr != null && bArr.length > 0) {
                            snsObject3.parseFrom(bArr);
                        }
                        zx4.f146275f = snsObject3;
                    }
                    return 0;
                case 4:
                    zx4.f146276g.add(Long.valueOf(aVar3.mo141631i(intValue)));
                    return 0;
                case 5:
                    zx4.f146277h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    zx4.f146278i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
