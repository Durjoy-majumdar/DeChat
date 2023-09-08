package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qf2 */
public class C22526qf2 extends C47465a {

    /* renamed from: d */
    public C22492da f64492d;

    /* renamed from: e */
    public C22519om f64493e;

    /* renamed from: f */
    public C22504jw2 f64494f;

    /* renamed from: g */
    public mb4 f64495g;

    /* renamed from: h */
    public C64841xw3 f64496h;

    /* renamed from: i */
    public C51168rx f64497i;

    /* renamed from: j */
    public C22496fe0 f64498j;

    /* renamed from: n */
    public C118436gr1 f64499n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22526qf2)) {
            return false;
        }
        C22526qf2 qf22 = (C22526qf2) aVar;
        return C46238a.m51546a(this.f64492d, qf22.f64492d) && C46238a.m51546a(this.f64493e, qf22.f64493e) && C46238a.m51546a(this.f64494f, qf22.f64494f) && C46238a.m51546a(this.f64495g, qf22.f64495g) && C46238a.m51546a(this.f64496h, qf22.f64496h) && C46238a.m51546a(this.f64497i, qf22.f64497i) && C46238a.m51546a(this.f64498j, qf22.f64498j) && C46238a.m51546a(this.f64499n, qf22.f64499n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C22492da daVar = this.f64492d;
            if (daVar != null) {
                aVar.mo74322i(1, daVar.computeSize());
                this.f64492d.writeFields(aVar);
            }
            C22519om omVar = this.f64493e;
            if (omVar != null) {
                aVar.mo74322i(2, omVar.computeSize());
                this.f64493e.writeFields(aVar);
            }
            C22504jw2 jw22 = this.f64494f;
            if (jw22 != null) {
                aVar.mo74322i(3, jw22.computeSize());
                this.f64494f.writeFields(aVar);
            }
            mb4 mb4 = this.f64495g;
            if (mb4 != null) {
                aVar.mo74322i(4, mb4.computeSize());
                this.f64495g.writeFields(aVar);
            }
            C64841xw3 xw32 = this.f64496h;
            if (xw32 != null) {
                aVar.mo74322i(6, xw32.computeSize());
                this.f64496h.writeFields(aVar);
            }
            C51168rx rxVar = this.f64497i;
            if (rxVar != null) {
                aVar.mo74322i(7, rxVar.computeSize());
                this.f64497i.writeFields(aVar);
            }
            C22496fe0 fe02 = this.f64498j;
            if (fe02 != null) {
                aVar.mo74322i(8, fe02.computeSize());
                this.f64498j.writeFields(aVar);
            }
            C118436gr1 gr12 = this.f64499n;
            if (gr12 != null) {
                aVar.mo74322i(9, gr12.computeSize());
                this.f64499n.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C22492da daVar2 = this.f64492d;
            if (daVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, daVar2.computeSize());
            }
            C22519om omVar2 = this.f64493e;
            if (omVar2 != null) {
                i2 += C52418a.m58682i(2, omVar2.computeSize());
            }
            C22504jw2 jw23 = this.f64494f;
            if (jw23 != null) {
                i2 += C52418a.m58682i(3, jw23.computeSize());
            }
            mb4 mb42 = this.f64495g;
            if (mb42 != null) {
                i2 += C52418a.m58682i(4, mb42.computeSize());
            }
            C64841xw3 xw33 = this.f64496h;
            if (xw33 != null) {
                i2 += C52418a.m58682i(6, xw33.computeSize());
            }
            C51168rx rxVar2 = this.f64497i;
            if (rxVar2 != null) {
                i2 += C52418a.m58682i(7, rxVar2.computeSize());
            }
            C22496fe0 fe03 = this.f64498j;
            if (fe03 != null) {
                i2 += C52418a.m58682i(8, fe03.computeSize());
            }
            C118436gr1 gr13 = this.f64499n;
            return gr13 != null ? i2 + C52418a.m58682i(9, gr13.computeSize()) : i2;
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
            C22526qf2 qf22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C22492da daVar3 = new C22492da();
                        if (bArr != null && bArr.length > 0) {
                            daVar3.parseFrom(bArr);
                        }
                        qf22.f64492d = daVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C22519om omVar3 = new C22519om();
                        if (bArr2 != null && bArr2.length > 0) {
                            omVar3.parseFrom(bArr2);
                        }
                        qf22.f64493e = omVar3;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C22504jw2 jw24 = new C22504jw2();
                        if (bArr3 != null && bArr3.length > 0) {
                            jw24.parseFrom(bArr3);
                        }
                        qf22.f64494f = jw24;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        mb4 mb43 = new mb4();
                        if (bArr4 != null && bArr4.length > 0) {
                            mb43.parseFrom(bArr4);
                        }
                        qf22.f64495g = mb43;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C64841xw3 xw34 = new C64841xw3();
                        if (bArr5 != null && bArr5.length > 0) {
                            xw34.parseFrom(bArr5);
                        }
                        qf22.f64496h = xw34;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C51168rx rxVar3 = new C51168rx();
                        if (bArr6 != null && bArr6.length > 0) {
                            rxVar3.parseFrom(bArr6);
                        }
                        qf22.f64497i = rxVar3;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        C22496fe0 fe04 = new C22496fe0();
                        if (bArr7 != null && bArr7.length > 0) {
                            fe04.parseFrom(bArr7);
                        }
                        qf22.f64498j = fe04;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i15 = 0; i15 < size8; i15++) {
                        byte[] bArr8 = j8.get(i15);
                        C118436gr1 gr14 = new C118436gr1();
                        if (bArr8 != null && bArr8.length > 0) {
                            gr14.parseFrom(bArr8);
                        }
                        qf22.f64499n = gr14;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
