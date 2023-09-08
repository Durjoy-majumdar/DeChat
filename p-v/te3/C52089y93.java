package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.y93 */
public class C52089y93 extends C47465a {

    /* renamed from: d */
    public int f145192d;

    /* renamed from: e */
    public int f145193e;

    /* renamed from: f */
    public String f145194f;

    /* renamed from: g */
    public int f145195g;

    /* renamed from: h */
    public C51018qv3 f145196h;

    /* renamed from: i */
    public String f145197i;

    /* renamed from: j */
    public C51018qv3 f145198j;

    /* renamed from: n */
    public String f145199n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52089y93)) {
            return false;
        }
        C52089y93 y932 = (C52089y93) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f145192d), Integer.valueOf(y932.f145192d)) && C46238a.m51546a(Integer.valueOf(this.f145193e), Integer.valueOf(y932.f145193e)) && C46238a.m51546a(this.f145194f, y932.f145194f) && C46238a.m51546a(Integer.valueOf(this.f145195g), Integer.valueOf(y932.f145195g)) && C46238a.m51546a(this.f145196h, y932.f145196h) && C46238a.m51546a(this.f145197i, y932.f145197i) && C46238a.m51546a(this.f145198j, y932.f145198j) && C46238a.m51546a(this.f145199n, y932.f145199n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f145192d);
            aVar.mo74318e(2, this.f145193e);
            String str = this.f145194f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f145195g);
            C51018qv3 qv32 = this.f145196h;
            if (qv32 != null) {
                aVar.mo74322i(5, qv32.computeSize());
                this.f145196h.writeFields(aVar);
            }
            String str2 = this.f145197i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            C51018qv3 qv33 = this.f145198j;
            if (qv33 != null) {
                aVar.mo74322i(7, qv33.computeSize());
                this.f145198j.writeFields(aVar);
            }
            String str3 = this.f145199n;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f145192d) + 0 + C52418a.m58678e(2, this.f145193e);
            String str4 = this.f145194f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            int e2 = e + C52418a.m58678e(4, this.f145195g);
            C51018qv3 qv34 = this.f145196h;
            if (qv34 != null) {
                e2 += C52418a.m58682i(5, qv34.computeSize());
            }
            String str5 = this.f145197i;
            if (str5 != null) {
                e2 += C52418a.m58683j(6, str5);
            }
            C51018qv3 qv35 = this.f145198j;
            if (qv35 != null) {
                e2 += C52418a.m58682i(7, qv35.computeSize());
            }
            String str6 = this.f145199n;
            return str6 != null ? e2 + C52418a.m58683j(8, str6) : e2;
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
            C52089y93 y932 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    y932.f145192d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    y932.f145193e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    y932.f145194f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    y932.f145195g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr != null && bArr.length > 0) {
                            qv36.mo73348f(bArr);
                        }
                        y932.f145196h = qv36;
                    }
                    return 0;
                case 6:
                    y932.f145197i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv37.mo73348f(bArr2);
                        }
                        y932.f145198j = qv37;
                    }
                    return 0;
                case 8:
                    y932.f145199n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
