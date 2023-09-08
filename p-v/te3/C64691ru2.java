package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ru2 */
public class C64691ru2 extends C47465a {

    /* renamed from: d */
    public C51018qv3 f185295d;

    /* renamed from: e */
    public C64306d60 f185296e;

    /* renamed from: f */
    public String f185297f;

    /* renamed from: g */
    public String f185298g;

    /* renamed from: h */
    public String f185299h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64691ru2)) {
            return false;
        }
        C64691ru2 ru22 = (C64691ru2) aVar;
        return C46238a.m51546a(this.f185295d, ru22.f185295d) && C46238a.m51546a(this.f185296e, ru22.f185296e) && C46238a.m51546a(this.f185297f, ru22.f185297f) && C46238a.m51546a(this.f185298g, ru22.f185298g) && C46238a.m51546a(this.f185299h, ru22.f185299h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51018qv3 qv32 = this.f185295d;
            if (qv32 == null) {
                throw new C52419b("Not all required fields were included: RandomEncryKey");
            } else if (this.f185296e != null) {
                if (qv32 != null) {
                    aVar.mo74322i(1, qv32.computeSize());
                    this.f185295d.writeFields(aVar);
                }
                C64306d60 d602 = this.f185296e;
                if (d602 != null) {
                    aVar.mo74322i(2, d602.computeSize());
                    this.f185296e.writeFields(aVar);
                }
                String str = this.f185297f;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f185298g;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f185299h;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: CliPubECDHKey");
            }
        } else if (i == 1) {
            C51018qv3 qv33 = this.f185295d;
            if (qv33 != null) {
                i2 = 0 + C52418a.m58682i(1, qv33.computeSize());
            }
            C64306d60 d603 = this.f185296e;
            if (d603 != null) {
                i2 += C52418a.m58682i(2, d603.computeSize());
            }
            String str4 = this.f185297f;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            String str5 = this.f185298g;
            if (str5 != null) {
                i2 += C52418a.m58683j(4, str5);
            }
            String str6 = this.f185299h;
            return str6 != null ? i2 + C52418a.m58683j(5, str6) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f185295d == null) {
                throw new C52419b("Not all required fields were included: RandomEncryKey");
            } else if (this.f185296e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: CliPubECDHKey");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64691ru2 ru22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr != null && bArr.length > 0) {
                        qv34.mo73348f(bArr);
                    }
                    ru22.f185295d = qv34;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64306d60 d604 = new C64306d60();
                    if (bArr2 != null && bArr2.length > 0) {
                        d604.parseFrom(bArr2);
                    }
                    ru22.f185296e = d604;
                }
                return 0;
            } else if (intValue == 3) {
                ru22.f185297f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                ru22.f185298g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ru22.f185299h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
