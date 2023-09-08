package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x40 */
public class C51921x40 extends C47465a {

    /* renamed from: d */
    public int f144437d;

    /* renamed from: e */
    public String f144438e;

    /* renamed from: f */
    public zf4 f144439f;

    /* renamed from: g */
    public C49587go2 f144440g;

    /* renamed from: h */
    public C49118da3 f144441h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51921x40)) {
            return false;
        }
        C51921x40 x402 = (C51921x40) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f144437d), Integer.valueOf(x402.f144437d)) && C46238a.m51546a(this.f144438e, x402.f144438e) && C46238a.m51546a(this.f144439f, x402.f144439f) && C46238a.m51546a(this.f144440g, x402.f144440g) && C46238a.m51546a(this.f144441h, x402.f144441h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f144437d);
            String str = this.f144438e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            zf4 zf4 = this.f144439f;
            if (zf4 != null) {
                aVar.mo74322i(3, zf4.computeSize());
                this.f144439f.writeFields(aVar);
            }
            C49587go2 go22 = this.f144440g;
            if (go22 != null) {
                aVar.mo74322i(4, go22.computeSize());
                this.f144440g.writeFields(aVar);
            }
            C49118da3 da32 = this.f144441h;
            if (da32 != null) {
                aVar.mo74322i(5, da32.computeSize());
                this.f144441h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f144437d) + 0;
            String str2 = this.f144438e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            zf4 zf42 = this.f144439f;
            if (zf42 != null) {
                e += C52418a.m58682i(3, zf42.computeSize());
            }
            C49587go2 go23 = this.f144440g;
            if (go23 != null) {
                e += C52418a.m58682i(4, go23.computeSize());
            }
            C49118da3 da33 = this.f144441h;
            return da33 != null ? e + C52418a.m58682i(5, da33.computeSize()) : e;
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
            C51921x40 x402 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                x402.f144437d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                x402.f144438e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    zf4 zf43 = new zf4();
                    if (bArr != null && bArr.length > 0) {
                        zf43.parseFrom(bArr);
                    }
                    x402.f144439f = zf43;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C49587go2 go24 = new C49587go2();
                    if (bArr2 != null && bArr2.length > 0) {
                        go24.parseFrom(bArr2);
                    }
                    x402.f144440g = go24;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    byte[] bArr3 = j3.get(i4);
                    C49118da3 da34 = new C49118da3();
                    if (bArr3 != null && bArr3.length > 0) {
                        da34.parseFrom(bArr3);
                    }
                    x402.f144441h = da34;
                }
                return 0;
            }
        }
    }
}
