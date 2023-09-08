package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zz0 */
public class C52329zz0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f146285d;

    /* renamed from: e */
    public C89349b f146286e;

    /* renamed from: f */
    public long f146287f;

    /* renamed from: g */
    public long f146288g;

    /* renamed from: h */
    public String f146289h;

    /* renamed from: i */
    public String f146290i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52329zz0)) {
            return false;
        }
        C52329zz0 zz02 = (C52329zz0) aVar;
        return C46238a.m51546a(this.BaseRequest, zz02.BaseRequest) && C46238a.m51546a(this.f146285d, zz02.f146285d) && C46238a.m51546a(this.f146286e, zz02.f146286e) && C46238a.m51546a(Long.valueOf(this.f146287f), Long.valueOf(zz02.f146287f)) && C46238a.m51546a(Long.valueOf(this.f146288g), Long.valueOf(zz02.f146288g)) && C46238a.m51546a(this.f146289h, zz02.f146289h) && C46238a.m51546a(this.f146290i, zz02.f146290i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C49842ig0 ig02 = this.f146285d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f146285d.writeFields(aVar);
            }
            C89349b bVar = this.f146286e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74321h(4, this.f146287f);
            aVar.mo74321h(5, this.f146288g);
            String str = this.f146289h;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            String str2 = this.f146290i;
            if (str2 != null) {
                aVar.mo74323j(9, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f146285d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar2 = this.f146286e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            int h = i2 + C52418a.m58681h(4, this.f146287f) + C52418a.m58681h(5, this.f146288g);
            String str3 = this.f146289h;
            if (str3 != null) {
                h += C52418a.m58683j(7, str3);
            }
            String str4 = this.f146290i;
            return str4 != null ? h + C52418a.m58683j(9, str4) : h;
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
            C52329zz0 zz02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    zz02.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49842ig0 ig04 = new C49842ig0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ig04.parseFrom(bArr2);
                    }
                    zz02.f146285d = ig04;
                }
                return 0;
            } else if (intValue == 3) {
                zz02.f146286e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 4) {
                zz02.f146287f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 5) {
                zz02.f146288g = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 7) {
                zz02.f146289h = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 9) {
                return -1;
            } else {
                zz02.f146290i = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
