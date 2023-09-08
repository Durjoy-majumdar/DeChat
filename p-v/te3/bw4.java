package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class bw4 extends C101820nt3 {

    /* renamed from: d */
    public String f131355d;

    /* renamed from: e */
    public int f131356e;

    /* renamed from: f */
    public C51018qv3 f131357f;

    /* renamed from: g */
    public su4 f131358g;

    /* renamed from: h */
    public long f131359h;

    /* renamed from: i */
    public int f131360i;

    /* renamed from: j */
    public long f131361j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof bw4)) {
            return false;
        }
        bw4 bw4 = (bw4) aVar;
        return C46238a.m51546a(this.BaseRequest, bw4.BaseRequest) && C46238a.m51546a(this.f131355d, bw4.f131355d) && C46238a.m51546a(Integer.valueOf(this.f131356e), Integer.valueOf(bw4.f131356e)) && C46238a.m51546a(this.f131357f, bw4.f131357f) && C46238a.m51546a(this.f131358g, bw4.f131358g) && C46238a.m51546a(Long.valueOf(this.f131359h), Long.valueOf(bw4.f131359h)) && C46238a.m51546a(Integer.valueOf(this.f131360i), Integer.valueOf(bw4.f131360i)) && C46238a.m51546a(Long.valueOf(this.f131361j), Long.valueOf(bw4.f131361j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f131357f == null) {
                throw new C52419b("Not all required fields were included: KeyBuf");
            } else if (this.f131358g != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f131355d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f131356e);
                C51018qv3 qv32 = this.f131357f;
                if (qv32 != null) {
                    aVar.mo74322i(4, qv32.computeSize());
                    this.f131357f.writeFields(aVar);
                }
                su4 su4 = this.f131358g;
                if (su4 != null) {
                    aVar.mo74322i(5, su4.computeSize());
                    this.f131358g.writeFields(aVar);
                }
                aVar.mo74321h(6, this.f131359h);
                aVar.mo74318e(7, this.f131360i);
                aVar.mo74321h(8, this.f131361j);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: OpLog");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f131355d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            int e = i2 + C52418a.m58678e(3, this.f131356e);
            C51018qv3 qv33 = this.f131357f;
            if (qv33 != null) {
                e += C52418a.m58682i(4, qv33.computeSize());
            }
            su4 su42 = this.f131358g;
            if (su42 != null) {
                e += C52418a.m58682i(5, su42.computeSize());
            }
            return e + C52418a.m58681h(6, this.f131359h) + C52418a.m58678e(7, this.f131360i) + C52418a.m58681h(8, this.f131361j);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f131357f == null) {
                throw new C52419b("Not all required fields were included: KeyBuf");
            } else if (this.f131358g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: OpLog");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            bw4 bw4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        bw4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    bw4.f131355d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    bw4.f131356e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        bw4.f131357f = qv34;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        su4 su43 = new su4();
                        if (bArr3 != null && bArr3.length > 0) {
                            su43.parseFrom(bArr3);
                        }
                        bw4.f131358g = su43;
                    }
                    return 0;
                case 6:
                    bw4.f131359h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    bw4.f131360i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    bw4.f131361j = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
