package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m10 */
public class C64543m10 extends C47465a {

    /* renamed from: d */
    public C49195dv2 f184195d;

    /* renamed from: e */
    public C64346ep3 f184196e;

    /* renamed from: f */
    public C64346ep3 f184197f;

    /* renamed from: g */
    public C64346ep3 f184198g;

    /* renamed from: h */
    public C64346ep3 f184199h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64543m10)) {
            return false;
        }
        C64543m10 m102 = (C64543m10) aVar;
        return C46238a.m51546a(this.f184195d, m102.f184195d) && C46238a.m51546a(this.f184196e, m102.f184196e) && C46238a.m51546a(this.f184197f, m102.f184197f) && C46238a.m51546a(this.f184198g, m102.f184198g) && C46238a.m51546a(this.f184199h, m102.f184199h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49195dv2 dv22 = this.f184195d;
            if (dv22 != null) {
                aVar.mo74322i(1, dv22.computeSize());
                this.f184195d.writeFields(aVar);
            }
            C64346ep3 ep32 = this.f184196e;
            if (ep32 != null) {
                aVar.mo74322i(2, ep32.computeSize());
                this.f184196e.writeFields(aVar);
            }
            C64346ep3 ep33 = this.f184197f;
            if (ep33 != null) {
                aVar.mo74322i(3, ep33.computeSize());
                this.f184197f.writeFields(aVar);
            }
            C64346ep3 ep34 = this.f184198g;
            if (ep34 != null) {
                aVar.mo74322i(4, ep34.computeSize());
                this.f184198g.writeFields(aVar);
            }
            C64346ep3 ep35 = this.f184199h;
            if (ep35 != null) {
                aVar.mo74322i(5, ep35.computeSize());
                this.f184199h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49195dv2 dv23 = this.f184195d;
            if (dv23 != null) {
                i2 = 0 + C52418a.m58682i(1, dv23.computeSize());
            }
            C64346ep3 ep36 = this.f184196e;
            if (ep36 != null) {
                i2 += C52418a.m58682i(2, ep36.computeSize());
            }
            C64346ep3 ep37 = this.f184197f;
            if (ep37 != null) {
                i2 += C52418a.m58682i(3, ep37.computeSize());
            }
            C64346ep3 ep38 = this.f184198g;
            if (ep38 != null) {
                i2 += C52418a.m58682i(4, ep38.computeSize());
            }
            C64346ep3 ep39 = this.f184199h;
            return ep39 != null ? i2 + C52418a.m58682i(5, ep39.computeSize()) : i2;
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
            C64543m10 m102 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49195dv2 dv24 = new C49195dv2();
                    if (bArr != null && bArr.length > 0) {
                        dv24.parseFrom(bArr);
                    }
                    m102.f184195d = dv24;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64346ep3 ep310 = new C64346ep3();
                    if (bArr2 != null && bArr2.length > 0) {
                        ep310.parseFrom(bArr2);
                    }
                    m102.f184196e = ep310;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C64346ep3 ep311 = new C64346ep3();
                    if (bArr3 != null && bArr3.length > 0) {
                        ep311.parseFrom(bArr3);
                    }
                    m102.f184197f = ep311;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C64346ep3 ep312 = new C64346ep3();
                    if (bArr4 != null && bArr4.length > 0) {
                        ep312.parseFrom(bArr4);
                    }
                    m102.f184198g = ep312;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                int size5 = j5.size();
                for (int i7 = 0; i7 < size5; i7++) {
                    byte[] bArr5 = j5.get(i7);
                    C64346ep3 ep313 = new C64346ep3();
                    if (bArr5 != null && bArr5.length > 0) {
                        ep313.parseFrom(bArr5);
                    }
                    m102.f184199h = ep313;
                }
                return 0;
            }
        }
    }
}
