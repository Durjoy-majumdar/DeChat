package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nw3 */
public class C64593nw3 extends C101820nt3 {

    /* renamed from: d */
    public long f184566d;

    /* renamed from: e */
    public int f184567e;

    /* renamed from: f */
    public long f184568f;

    /* renamed from: g */
    public int f184569g;

    /* renamed from: h */
    public boolean f184570h;

    /* renamed from: i */
    public LinkedList<C50460mw3> f184571i = new LinkedList<>();

    /* renamed from: j */
    public C64852yd f184572j;

    /* renamed from: n */
    public C64799wd f184573n;

    /* renamed from: o */
    public C51957xd f184574o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64593nw3)) {
            return false;
        }
        C64593nw3 nw32 = (C64593nw3) aVar;
        return C46238a.m51546a(this.BaseRequest, nw32.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f184566d), Long.valueOf(nw32.f184566d)) && C46238a.m51546a(Integer.valueOf(this.f184567e), Integer.valueOf(nw32.f184567e)) && C46238a.m51546a(Long.valueOf(this.f184568f), Long.valueOf(nw32.f184568f)) && C46238a.m51546a(Integer.valueOf(this.f184569g), Integer.valueOf(nw32.f184569g)) && C46238a.m51546a(Boolean.valueOf(this.f184570h), Boolean.valueOf(nw32.f184570h)) && C46238a.m51546a(this.f184571i, nw32.f184571i) && C46238a.m51546a(this.f184572j, nw32.f184572j) && C46238a.m51546a(this.f184573n, nw32.f184573n) && C46238a.m51546a(this.f184574o, nw32.f184574o);
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
            aVar.mo74321h(2, this.f184566d);
            aVar.mo74318e(5, this.f184567e);
            aVar.mo74321h(7, this.f184568f);
            aVar.mo74318e(9, this.f184569g);
            aVar.mo74314a(10, this.f184570h);
            aVar.mo74320g(8, 8, this.f184571i);
            C64852yd ydVar = this.f184572j;
            if (ydVar != null) {
                aVar.mo74322i(101, ydVar.computeSize());
                this.f184572j.writeFields(aVar);
            }
            C64799wd wdVar = this.f184573n;
            if (wdVar != null) {
                aVar.mo74322i(102, wdVar.computeSize());
                this.f184573n.writeFields(aVar);
            }
            C51957xd xdVar = this.f184574o;
            if (xdVar != null) {
                aVar.mo74322i(103, xdVar.computeSize());
                this.f184574o.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f184566d) + C52418a.m58678e(5, this.f184567e) + C52418a.m58681h(7, this.f184568f) + C52418a.m58678e(9, this.f184569g) + C52418a.m58674a(10, this.f184570h) + C52418a.m58680g(8, 8, this.f184571i);
            C64852yd ydVar2 = this.f184572j;
            if (ydVar2 != null) {
                h += C52418a.m58682i(101, ydVar2.computeSize());
            }
            C64799wd wdVar2 = this.f184573n;
            if (wdVar2 != null) {
                h += C52418a.m58682i(102, wdVar2.computeSize());
            }
            C51957xd xdVar2 = this.f184574o;
            return xdVar2 != null ? h + C52418a.m58682i(103, xdVar2.computeSize()) : h;
        } else if (i == 2) {
            this.f184571i.clear();
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
            C64593nw3 nw32 = objArr[1];
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
                    nw32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                nw32.f184566d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 5) {
                switch (intValue) {
                    case 7:
                        nw32.f184568f = aVar3.mo141631i(intValue);
                        return 0;
                    case 8:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            byte[] bArr2 = j2.get(i4);
                            C50460mw3 mw32 = new C50460mw3();
                            if (bArr2 != null && bArr2.length > 0) {
                                mw32.parseFrom(bArr2);
                            }
                            nw32.f184571i.add(mw32);
                        }
                        return 0;
                    case 9:
                        nw32.f184569g = aVar3.mo141629g(intValue);
                        return 0;
                    case 10:
                        nw32.f184570h = aVar3.mo141625c(intValue);
                        return 0;
                    default:
                        switch (intValue) {
                            case 101:
                                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                                int size3 = j3.size();
                                for (int i5 = 0; i5 < size3; i5++) {
                                    byte[] bArr3 = j3.get(i5);
                                    C64852yd ydVar3 = new C64852yd();
                                    if (bArr3 != null && bArr3.length > 0) {
                                        ydVar3.parseFrom(bArr3);
                                    }
                                    nw32.f184572j = ydVar3;
                                }
                                return 0;
                            case 102:
                                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                                int size4 = j4.size();
                                for (int i6 = 0; i6 < size4; i6++) {
                                    byte[] bArr4 = j4.get(i6);
                                    C64799wd wdVar3 = new C64799wd();
                                    if (bArr4 != null && bArr4.length > 0) {
                                        wdVar3.parseFrom(bArr4);
                                    }
                                    nw32.f184573n = wdVar3;
                                }
                                return 0;
                            case 103:
                                LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                                int size5 = j5.size();
                                for (int i7 = 0; i7 < size5; i7++) {
                                    byte[] bArr5 = j5.get(i7);
                                    C51957xd xdVar3 = new C51957xd();
                                    if (bArr5 != null && bArr5.length > 0) {
                                        xdVar3.parseFrom(bArr5);
                                    }
                                    nw32.f184574o = xdVar3;
                                }
                                return 0;
                            default:
                                return -1;
                        }
                }
            } else {
                nw32.f184567e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
