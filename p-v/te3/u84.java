package te3;

import com.tencent.p014mm.protocal.protobuf.SnsObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import x14.C102536a;
import z14.C53733a;

public class u84 extends C49335eu3 {

    /* renamed from: A */
    public long f299589A;

    /* renamed from: d */
    public String f299590d;

    /* renamed from: e */
    public int f299591e;

    /* renamed from: f */
    public LinkedList<SnsObject> f299592f = new LinkedList<>();

    /* renamed from: g */
    public int f299593g;

    /* renamed from: h */
    public int f299594h;

    /* renamed from: i */
    public int f299595i;

    /* renamed from: j */
    public j84 f299596j;

    /* renamed from: n */
    public int f299597n;

    /* renamed from: o */
    public LinkedList<C48952c4> f299598o = new LinkedList<>();

    /* renamed from: p */
    public C51018qv3 f299599p;

    /* renamed from: q */
    public int f299600q;

    /* renamed from: r */
    public LinkedList<C51573un3> f299601r = new LinkedList<>();

    /* renamed from: s */
    public int f299602s;

    /* renamed from: t */
    public LinkedList<C49365f20> f299603t = new LinkedList<>();

    /* renamed from: u */
    public int f299604u;

    /* renamed from: v */
    public LinkedList<Long> f299605v = new LinkedList<>();

    /* renamed from: w */
    public LinkedList<Integer> f299606w = new LinkedList<>();

    /* renamed from: x */
    public C51018qv3 f299607x;

    /* renamed from: y */
    public int f299608y;

    /* renamed from: z */
    public LinkedList<C49091d4> f299609z = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof u84)) {
            return false;
        }
        u84 u84 = (u84) aVar;
        return C46238a.m51546a(this.BaseResponse, u84.BaseResponse) && C46238a.m51546a(this.f299590d, u84.f299590d) && C46238a.m51546a(Integer.valueOf(this.f299591e), Integer.valueOf(u84.f299591e)) && C46238a.m51546a(this.f299592f, u84.f299592f) && C46238a.m51546a(Integer.valueOf(this.f299593g), Integer.valueOf(u84.f299593g)) && C46238a.m51546a(Integer.valueOf(this.f299594h), Integer.valueOf(u84.f299594h)) && C46238a.m51546a(Integer.valueOf(this.f299595i), Integer.valueOf(u84.f299595i)) && C46238a.m51546a(this.f299596j, u84.f299596j) && C46238a.m51546a(Integer.valueOf(this.f299597n), Integer.valueOf(u84.f299597n)) && C46238a.m51546a(this.f299598o, u84.f299598o) && C46238a.m51546a(this.f299599p, u84.f299599p) && C46238a.m51546a(Integer.valueOf(this.f299600q), Integer.valueOf(u84.f299600q)) && C46238a.m51546a(this.f299601r, u84.f299601r) && C46238a.m51546a(Integer.valueOf(this.f299602s), Integer.valueOf(u84.f299602s)) && C46238a.m51546a(this.f299603t, u84.f299603t) && C46238a.m51546a(Integer.valueOf(this.f299604u), Integer.valueOf(u84.f299604u)) && C46238a.m51546a(this.f299605v, u84.f299605v) && C46238a.m51546a(this.f299606w, u84.f299606w) && C46238a.m51546a(this.f299607x, u84.f299607x) && C46238a.m51546a(Integer.valueOf(this.f299608y), Integer.valueOf(u84.f299608y)) && C46238a.m51546a(this.f299609z, u84.f299609z) && C46238a.m51546a(Long.valueOf(this.f299589A), Long.valueOf(u84.f299589A));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                String str = this.f299590d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f299591e);
                aVar.mo74320g(4, 8, this.f299592f);
                aVar.mo74318e(5, this.f299593g);
                aVar.mo74318e(6, this.f299594h);
                aVar.mo74318e(7, this.f299595i);
                j84 j84 = this.f299596j;
                if (j84 != null) {
                    aVar.mo74322i(8, j84.computeSize());
                    this.f299596j.writeFields(aVar);
                }
                aVar.mo74318e(9, this.f299597n);
                aVar.mo74320g(10, 8, this.f299598o);
                C51018qv3 qv32 = this.f299599p;
                if (qv32 != null) {
                    aVar.mo74322i(11, qv32.computeSize());
                    this.f299599p.writeFields(aVar);
                }
                aVar.mo74318e(12, this.f299600q);
                aVar.mo74320g(13, 8, this.f299601r);
                aVar.mo74318e(14, this.f299602s);
                aVar.mo74320g(15, 8, this.f299603t);
                aVar.mo74318e(16, this.f299604u);
                aVar.mo74324k(17, 3, this.f299605v);
                aVar.mo74324k(18, 2, this.f299606w);
                C51018qv3 qv33 = this.f299607x;
                if (qv33 != null) {
                    aVar.mo74322i(19, qv33.computeSize());
                    this.f299607x.writeFields(aVar);
                }
                aVar.mo74318e(20, this.f299608y);
                aVar.mo74320g(21, 8, this.f299609z);
                aVar.mo74321h(22, this.f299589A);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            int i3 = jaVar2 != null ? 0 + C52418a.m58682i(1, jaVar2.computeSize()) : 0;
            String str2 = this.f299590d;
            if (str2 != null) {
                i3 += C52418a.m58683j(2, str2);
            }
            int e = i3 + C52418a.m58678e(3, this.f299591e) + C52418a.m58680g(4, 8, this.f299592f) + C52418a.m58678e(5, this.f299593g) + C52418a.m58678e(6, this.f299594h) + C52418a.m58678e(7, this.f299595i);
            j84 j842 = this.f299596j;
            if (j842 != null) {
                e += C52418a.m58682i(8, j842.computeSize());
            }
            int e2 = e + C52418a.m58678e(9, this.f299597n) + C52418a.m58680g(10, 8, this.f299598o);
            C51018qv3 qv34 = this.f299599p;
            if (qv34 != null) {
                e2 += C52418a.m58682i(11, qv34.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(12, this.f299600q) + C52418a.m58680g(13, 8, this.f299601r) + C52418a.m58678e(14, this.f299602s) + C52418a.m58680g(15, 8, this.f299603t) + C52418a.m58678e(16, this.f299604u) + C52418a.m58684k(17, 3, this.f299605v) + C52418a.m58684k(18, 2, this.f299606w);
            C51018qv3 qv35 = this.f299607x;
            if (qv35 != null) {
                e3 += C52418a.m58682i(19, qv35.computeSize());
            }
            return e3 + C52418a.m58678e(20, this.f299608y) + C52418a.m58680g(21, 8, this.f299609z) + C52418a.m58681h(22, this.f299589A);
        } else if (i2 == 2) {
            this.f299592f.clear();
            this.f299598o.clear();
            this.f299601r.clear();
            this.f299603t.clear();
            this.f299605v.clear();
            this.f299606w.clear();
            this.f299609z.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            u84 u84 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        u84.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    u84.f299590d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    u84.f299591e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        SnsObject snsObject = new SnsObject();
                        if (bArr2 != null && bArr2.length > 0) {
                            snsObject.parseFrom(bArr2);
                        }
                        u84.f299592f.add(snsObject);
                    }
                    return 0;
                case 5:
                    u84.f299593g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    u84.f299594h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    u84.f299595i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        j84 j843 = new j84();
                        if (bArr3 != null && bArr3.length > 0) {
                            j843.parseFrom(bArr3);
                        }
                        u84.f299596j = j843;
                    }
                    return 0;
                case 9:
                    u84.f299597n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C48952c4 c4Var = new C48952c4();
                        if (bArr4 != null && bArr4.length > 0) {
                            c4Var.parseFrom(bArr4);
                        }
                        u84.f299598o.add(c4Var);
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            qv36.mo73348f(bArr5);
                        }
                        u84.f299599p = qv36;
                    }
                    return 0;
                case 12:
                    u84.f299600q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C51573un3 un32 = new C51573un3();
                        if (bArr6 != null && bArr6.length > 0) {
                            un32.parseFrom(bArr6);
                        }
                        u84.f299601r.add(un32);
                    }
                    return 0;
                case 14:
                    u84.f299602s = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C49365f20 f202 = new C49365f20();
                        if (bArr7 != null && bArr7.length > 0) {
                            f202.parseFrom(bArr7);
                        }
                        u84.f299603t.add(f202);
                    }
                    return 0;
                case 16:
                    u84.f299604u = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    byte[] bArr8 = aVar3.mo141626d(intValue).f257327a;
                    C102536a aVar4 = new C102536a(bArr8, 0, bArr8.length);
                    LinkedList<Long> linkedList = new LinkedList<>();
                    while (aVar4.f301908c < aVar4.f301907b) {
                        linkedList.add(Long.valueOf(aVar4.mo142154g()));
                    }
                    u84.f299605v = linkedList;
                    return 0;
                case 18:
                    byte[] bArr9 = aVar3.mo141626d(intValue).f257327a;
                    C102536a aVar5 = new C102536a(bArr9, 0, bArr9.length);
                    LinkedList<Integer> linkedList2 = new LinkedList<>();
                    while (aVar5.f301908c < aVar5.f301907b) {
                        linkedList2.add(Integer.valueOf(aVar5.mo142153f()));
                    }
                    u84.f299606w = linkedList2;
                    return 0;
                case 19:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr10 = j8.get(i16);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr10 != null && bArr10.length > 0) {
                            qv37.mo73348f(bArr10);
                        }
                        u84.f299607x = qv37;
                    }
                    return 0;
                case 20:
                    u84.f299608y = aVar3.mo141629g(intValue);
                    return 0;
                case 21:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr11 = j9.get(i17);
                        C49091d4 d4Var = new C49091d4();
                        if (bArr11 != null && bArr11.length > 0) {
                            d4Var.parseFrom(bArr11);
                        }
                        u84.f299609z.add(d4Var);
                    }
                    return 0;
                case 22:
                    u84.f299589A = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
