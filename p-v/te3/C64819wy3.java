package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wy3 */
public class C64819wy3 extends C47465a {

    /* renamed from: d */
    public C51018qv3 f186235d;

    /* renamed from: e */
    public C64306d60 f186236e;

    /* renamed from: f */
    public C51018qv3 f186237f;

    /* renamed from: g */
    public int f186238g;

    /* renamed from: h */
    public C51018qv3 f186239h;

    /* renamed from: i */
    public C51018qv3 f186240i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64819wy3)) {
            return false;
        }
        C64819wy3 wy32 = (C64819wy3) aVar;
        return C46238a.m51546a(this.f186235d, wy32.f186235d) && C46238a.m51546a(this.f186236e, wy32.f186236e) && C46238a.m51546a(this.f186237f, wy32.f186237f) && C46238a.m51546a(Integer.valueOf(this.f186238g), Integer.valueOf(wy32.f186238g)) && C46238a.m51546a(this.f186239h, wy32.f186239h) && C46238a.m51546a(this.f186240i, wy32.f186240i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51018qv3 qv32 = this.f186235d;
            if (qv32 == null) {
                throw new C52419b("Not all required fields were included: AutoAuthKey");
            } else if (this.f186236e == null) {
                throw new C52419b("Not all required fields were included: SvrPubECDHKey");
            } else if (this.f186237f != null) {
                if (qv32 != null) {
                    aVar.mo74322i(1, qv32.computeSize());
                    this.f186235d.writeFields(aVar);
                }
                C64306d60 d602 = this.f186236e;
                if (d602 != null) {
                    aVar.mo74322i(2, d602.computeSize());
                    this.f186236e.writeFields(aVar);
                }
                C51018qv3 qv33 = this.f186237f;
                if (qv33 != null) {
                    aVar.mo74322i(3, qv33.computeSize());
                    this.f186237f.writeFields(aVar);
                }
                aVar.mo74318e(4, this.f186238g);
                C51018qv3 qv34 = this.f186239h;
                if (qv34 != null) {
                    aVar.mo74322i(5, qv34.computeSize());
                    this.f186239h.writeFields(aVar);
                }
                C51018qv3 qv35 = this.f186240i;
                if (qv35 != null) {
                    aVar.mo74322i(6, qv35.computeSize());
                    this.f186240i.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: SessionKey");
            }
        } else if (i == 1) {
            C51018qv3 qv36 = this.f186235d;
            if (qv36 != null) {
                i2 = 0 + C52418a.m58682i(1, qv36.computeSize());
            }
            C64306d60 d603 = this.f186236e;
            if (d603 != null) {
                i2 += C52418a.m58682i(2, d603.computeSize());
            }
            C51018qv3 qv37 = this.f186237f;
            if (qv37 != null) {
                i2 += C52418a.m58682i(3, qv37.computeSize());
            }
            int e = i2 + C52418a.m58678e(4, this.f186238g);
            C51018qv3 qv38 = this.f186239h;
            if (qv38 != null) {
                e += C52418a.m58682i(5, qv38.computeSize());
            }
            C51018qv3 qv39 = this.f186240i;
            return qv39 != null ? e + C52418a.m58682i(6, qv39.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f186235d == null) {
                throw new C52419b("Not all required fields were included: AutoAuthKey");
            } else if (this.f186236e == null) {
                throw new C52419b("Not all required fields were included: SvrPubECDHKey");
            } else if (this.f186237f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: SessionKey");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64819wy3 wy32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51018qv3 qv310 = new C51018qv3();
                        if (bArr != null && bArr.length > 0) {
                            qv310.mo73348f(bArr);
                        }
                        wy32.f186235d = qv310;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64306d60 d604 = new C64306d60();
                        if (bArr2 != null && bArr2.length > 0) {
                            d604.parseFrom(bArr2);
                        }
                        wy32.f186236e = d604;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51018qv3 qv311 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv311.mo73348f(bArr3);
                        }
                        wy32.f186237f = qv311;
                    }
                    return 0;
                case 4:
                    wy32.f186238g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51018qv3 qv312 = new C51018qv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            qv312.mo73348f(bArr4);
                        }
                        wy32.f186239h = qv312;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C51018qv3 qv313 = new C51018qv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            qv313.mo73348f(bArr5);
                        }
                        wy32.f186240i = qv313;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
