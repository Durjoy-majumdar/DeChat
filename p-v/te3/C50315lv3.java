package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lv3 */
public class C50315lv3 extends C47465a {

    /* renamed from: d */
    public String f137661d;

    /* renamed from: e */
    public zf4 f137662e;

    /* renamed from: f */
    public C49118da3 f137663f;

    /* renamed from: g */
    public float f137664g;

    /* renamed from: h */
    public long f137665h;

    /* renamed from: i */
    public C52219z50 f137666i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50315lv3)) {
            return false;
        }
        C50315lv3 lv32 = (C50315lv3) aVar;
        return C46238a.m51546a(this.f137661d, lv32.f137661d) && C46238a.m51546a(this.f137662e, lv32.f137662e) && C46238a.m51546a(this.f137663f, lv32.f137663f) && C46238a.m51546a(Float.valueOf(this.f137664g), Float.valueOf(lv32.f137664g)) && C46238a.m51546a(Long.valueOf(this.f137665h), Long.valueOf(lv32.f137665h)) && C46238a.m51546a(this.f137666i, lv32.f137666i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137661d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            zf4 zf4 = this.f137662e;
            if (zf4 != null) {
                aVar.mo74322i(2, zf4.computeSize());
                this.f137662e.writeFields(aVar);
            }
            C49118da3 da32 = this.f137663f;
            if (da32 != null) {
                aVar.mo74322i(3, da32.computeSize());
                this.f137663f.writeFields(aVar);
            }
            aVar.mo74317d(4, this.f137664g);
            aVar.mo74321h(5, this.f137665h);
            C52219z50 z502 = this.f137666i;
            if (z502 != null) {
                aVar.mo74322i(8, z502.computeSize());
                this.f137666i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f137661d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            zf4 zf42 = this.f137662e;
            if (zf42 != null) {
                i2 += C52418a.m58682i(2, zf42.computeSize());
            }
            C49118da3 da33 = this.f137663f;
            if (da33 != null) {
                i2 += C52418a.m58682i(3, da33.computeSize());
            }
            int d = i2 + C52418a.m58677d(4, this.f137664g) + C52418a.m58681h(5, this.f137665h);
            C52219z50 z503 = this.f137666i;
            return z503 != null ? d + C52418a.m58682i(8, z503.computeSize()) : d;
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
            C50315lv3 lv32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                lv32.f137661d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    zf4 zf43 = new zf4();
                    if (bArr != null && bArr.length > 0) {
                        zf43.parseFrom(bArr);
                    }
                    lv32.f137662e = zf43;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49118da3 da34 = new C49118da3();
                    if (bArr2 != null && bArr2.length > 0) {
                        da34.parseFrom(bArr2);
                    }
                    lv32.f137663f = da34;
                }
                return 0;
            } else if (intValue == 4) {
                lv32.f137664g = aVar3.mo141628f(intValue);
                return 0;
            } else if (intValue == 5) {
                lv32.f137665h = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 8) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C52219z50 z504 = new C52219z50();
                    if (bArr3 != null && bArr3.length > 0) {
                        z504.parseFrom(bArr3);
                    }
                    lv32.f137666i = z504;
                }
                return 0;
            }
        }
    }
}
