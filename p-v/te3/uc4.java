package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class uc4 extends C47465a {

    /* renamed from: A */
    public boolean f142744A = false;

    /* renamed from: B */
    public int f142745B;

    /* renamed from: C */
    public boolean f142746C = false;

    /* renamed from: D */
    public int f142747D;

    /* renamed from: E */
    public boolean f142748E = false;

    /* renamed from: F */
    public C50023jq2 f142749F;

    /* renamed from: G */
    public C52275zk f142750G;

    /* renamed from: H */
    public C51432tq3 f142751H;

    /* renamed from: I */
    public int f142752I;

    /* renamed from: J */
    public boolean f142753J = false;

    /* renamed from: K */
    public C52233z9 f142754K;

    /* renamed from: L */
    public C51139rp2 f142755L;

    /* renamed from: M */
    public C49737hp2 f142756M;

    /* renamed from: N */
    public C49349ey f142757N;

    /* renamed from: d */
    public int f142758d;

    /* renamed from: e */
    public boolean f142759e = false;

    /* renamed from: f */
    public int f142760f;

    /* renamed from: g */
    public boolean f142761g = false;

    /* renamed from: h */
    public int f142762h;

    /* renamed from: i */
    public boolean f142763i = false;

    /* renamed from: j */
    public C52212z33 f142764j;

    /* renamed from: n */
    public C52260zg2 f142765n;

    /* renamed from: o */
    public C52286zn2 f142766o;

    /* renamed from: p */
    public C51087rc f142767p;

    /* renamed from: q */
    public C48758as2 f142768q;

    /* renamed from: r */
    public C49730ho f142769r;

    /* renamed from: s */
    public C49730ho f142770s;

    /* renamed from: t */
    public C52070y50 f142771t;

    /* renamed from: u */
    public int f142772u;

    /* renamed from: v */
    public boolean f142773v = false;

    /* renamed from: w */
    public int f142774w;

    /* renamed from: x */
    public boolean f142775x = false;

    /* renamed from: y */
    public C52192z0 f142776y;

    /* renamed from: z */
    public int f142777z;

    /* renamed from: b */
    public final int mo73360b() {
        return this.f142760f;
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof uc4)) {
            return false;
        }
        uc4 uc4 = (uc4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142758d), Integer.valueOf(uc4.f142758d)) && C46238a.m51546a(Integer.valueOf(this.f142760f), Integer.valueOf(uc4.f142760f)) && C46238a.m51546a(Integer.valueOf(this.f142762h), Integer.valueOf(uc4.f142762h)) && C46238a.m51546a(this.f142764j, uc4.f142764j) && C46238a.m51546a(this.f142765n, uc4.f142765n) && C46238a.m51546a(this.f142766o, uc4.f142766o) && C46238a.m51546a(this.f142767p, uc4.f142767p) && C46238a.m51546a(this.f142768q, uc4.f142768q) && C46238a.m51546a(this.f142769r, uc4.f142769r) && C46238a.m51546a(this.f142770s, uc4.f142770s) && C46238a.m51546a(this.f142771t, uc4.f142771t) && C46238a.m51546a(Integer.valueOf(this.f142772u), Integer.valueOf(uc4.f142772u)) && C46238a.m51546a(Integer.valueOf(this.f142774w), Integer.valueOf(uc4.f142774w)) && C46238a.m51546a(this.f142776y, uc4.f142776y) && C46238a.m51546a(Integer.valueOf(this.f142777z), Integer.valueOf(uc4.f142777z)) && C46238a.m51546a(Integer.valueOf(this.f142745B), Integer.valueOf(uc4.f142745B)) && C46238a.m51546a(Integer.valueOf(this.f142747D), Integer.valueOf(uc4.f142747D)) && C46238a.m51546a(this.f142749F, uc4.f142749F) && C46238a.m51546a(this.f142750G, uc4.f142750G) && C46238a.m51546a(this.f142751H, uc4.f142751H) && C46238a.m51546a(Integer.valueOf(this.f142752I), Integer.valueOf(uc4.f142752I)) && C46238a.m51546a(this.f142754K, uc4.f142754K) && C46238a.m51546a(this.f142755L, uc4.f142755L) && C46238a.m51546a(this.f142756M, uc4.f142756M) && C46238a.m51546a(this.f142757N, uc4.f142757N);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f142759e) {
                aVar.mo74318e(1, this.f142758d);
            }
            if (this.f142761g) {
                aVar.mo74318e(2, this.f142760f);
            }
            if (this.f142763i) {
                aVar.mo74318e(3, this.f142762h);
            }
            C52212z33 z332 = this.f142764j;
            if (z332 != null) {
                aVar.mo74322i(4, z332.computeSize());
                this.f142764j.writeFields(aVar);
            }
            C52260zg2 zg22 = this.f142765n;
            if (zg22 != null) {
                aVar.mo74322i(5, zg22.computeSize());
                this.f142765n.writeFields(aVar);
            }
            C52286zn2 zn22 = this.f142766o;
            if (zn22 != null) {
                aVar.mo74322i(6, zn22.computeSize());
                this.f142766o.writeFields(aVar);
            }
            C51087rc rcVar = this.f142767p;
            if (rcVar != null) {
                aVar.mo74322i(7, rcVar.computeSize());
                this.f142767p.writeFields(aVar);
            }
            C48758as2 as22 = this.f142768q;
            if (as22 != null) {
                aVar.mo74322i(8, as22.computeSize());
                this.f142768q.writeFields(aVar);
            }
            C49730ho hoVar = this.f142769r;
            if (hoVar != null) {
                aVar.mo74322i(9, hoVar.computeSize());
                this.f142769r.writeFields(aVar);
            }
            C49730ho hoVar2 = this.f142770s;
            if (hoVar2 != null) {
                aVar.mo74322i(10, hoVar2.computeSize());
                this.f142770s.writeFields(aVar);
            }
            C52070y50 y502 = this.f142771t;
            if (y502 != null) {
                aVar.mo74322i(11, y502.computeSize());
                this.f142771t.writeFields(aVar);
            }
            if (this.f142773v) {
                aVar.mo74318e(12, this.f142772u);
            }
            if (this.f142775x) {
                aVar.mo74318e(13, this.f142774w);
            }
            C52192z0 z0Var = this.f142776y;
            if (z0Var != null) {
                aVar.mo74322i(16, z0Var.computeSize());
                this.f142776y.writeFields(aVar);
            }
            if (this.f142744A) {
                aVar.mo74318e(17, this.f142777z);
            }
            if (this.f142746C) {
                aVar.mo74318e(18, this.f142745B);
            }
            if (this.f142748E) {
                aVar.mo74318e(19, this.f142747D);
            }
            C50023jq2 jq22 = this.f142749F;
            if (jq22 != null) {
                aVar.mo74322i(20, jq22.computeSize());
                this.f142749F.writeFields(aVar);
            }
            C52275zk zkVar = this.f142750G;
            if (zkVar != null) {
                aVar.mo74322i(21, zkVar.computeSize());
                this.f142750G.writeFields(aVar);
            }
            C51432tq3 tq32 = this.f142751H;
            if (tq32 != null) {
                aVar.mo74322i(22, tq32.computeSize());
                this.f142751H.writeFields(aVar);
            }
            if (this.f142753J) {
                aVar.mo74318e(23, this.f142752I);
            }
            C52233z9 z9Var = this.f142754K;
            if (z9Var != null) {
                aVar.mo74322i(24, z9Var.computeSize());
                this.f142754K.writeFields(aVar);
            }
            C51139rp2 rp22 = this.f142755L;
            if (rp22 != null) {
                aVar.mo74322i(25, rp22.computeSize());
                this.f142755L.writeFields(aVar);
            }
            C49737hp2 hp22 = this.f142756M;
            if (hp22 != null) {
                aVar.mo74322i(26, hp22.computeSize());
                this.f142756M.writeFields(aVar);
            }
            C49349ey eyVar = this.f142757N;
            if (eyVar != null) {
                aVar.mo74322i(27, eyVar.computeSize());
                this.f142757N.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            if (this.f142759e) {
                i3 = C52418a.m58678e(1, this.f142758d) + 0;
            }
            if (this.f142761g) {
                i3 += C52418a.m58678e(2, this.f142760f);
            }
            if (this.f142763i) {
                i3 += C52418a.m58678e(3, this.f142762h);
            }
            C52212z33 z333 = this.f142764j;
            if (z333 != null) {
                i3 += C52418a.m58682i(4, z333.computeSize());
            }
            C52260zg2 zg23 = this.f142765n;
            if (zg23 != null) {
                i3 += C52418a.m58682i(5, zg23.computeSize());
            }
            C52286zn2 zn23 = this.f142766o;
            if (zn23 != null) {
                i3 += C52418a.m58682i(6, zn23.computeSize());
            }
            C51087rc rcVar2 = this.f142767p;
            if (rcVar2 != null) {
                i3 += C52418a.m58682i(7, rcVar2.computeSize());
            }
            C48758as2 as23 = this.f142768q;
            if (as23 != null) {
                i3 += C52418a.m58682i(8, as23.computeSize());
            }
            C49730ho hoVar3 = this.f142769r;
            if (hoVar3 != null) {
                i3 += C52418a.m58682i(9, hoVar3.computeSize());
            }
            C49730ho hoVar4 = this.f142770s;
            if (hoVar4 != null) {
                i3 += C52418a.m58682i(10, hoVar4.computeSize());
            }
            C52070y50 y503 = this.f142771t;
            if (y503 != null) {
                i3 += C52418a.m58682i(11, y503.computeSize());
            }
            if (this.f142773v) {
                i3 += C52418a.m58678e(12, this.f142772u);
            }
            if (this.f142775x) {
                i3 += C52418a.m58678e(13, this.f142774w);
            }
            C52192z0 z0Var2 = this.f142776y;
            if (z0Var2 != null) {
                i3 += C52418a.m58682i(16, z0Var2.computeSize());
            }
            if (this.f142744A) {
                i3 += C52418a.m58678e(17, this.f142777z);
            }
            if (this.f142746C) {
                i3 += C52418a.m58678e(18, this.f142745B);
            }
            if (this.f142748E) {
                i3 += C52418a.m58678e(19, this.f142747D);
            }
            C50023jq2 jq23 = this.f142749F;
            if (jq23 != null) {
                i3 += C52418a.m58682i(20, jq23.computeSize());
            }
            C52275zk zkVar2 = this.f142750G;
            if (zkVar2 != null) {
                i3 += C52418a.m58682i(21, zkVar2.computeSize());
            }
            C51432tq3 tq33 = this.f142751H;
            if (tq33 != null) {
                i3 += C52418a.m58682i(22, tq33.computeSize());
            }
            if (this.f142753J) {
                i3 += C52418a.m58678e(23, this.f142752I);
            }
            C52233z9 z9Var2 = this.f142754K;
            if (z9Var2 != null) {
                i3 += C52418a.m58682i(24, z9Var2.computeSize());
            }
            C51139rp2 rp23 = this.f142755L;
            if (rp23 != null) {
                i3 += C52418a.m58682i(25, rp23.computeSize());
            }
            C49737hp2 hp23 = this.f142756M;
            if (hp23 != null) {
                i3 += C52418a.m58682i(26, hp23.computeSize());
            }
            C49349ey eyVar2 = this.f142757N;
            return eyVar2 != null ? i3 + C52418a.m58682i(27, eyVar2.computeSize()) : i3;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            uc4 uc4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    uc4.f142758d = aVar3.mo141629g(intValue);
                    uc4.f142759e = true;
                    return 0;
                case 2:
                    uc4.f142760f = aVar3.mo141629g(intValue);
                    uc4.f142761g = true;
                    return 0;
                case 3:
                    uc4.f142762h = aVar3.mo141629g(intValue);
                    uc4.f142763i = true;
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C52212z33 z334 = new C52212z33();
                        if (bArr != null && bArr.length > 0) {
                            z334.parseFrom(bArr);
                        }
                        uc4.f142764j = z334;
                    }
                    uc4.getClass();
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C52260zg2 zg24 = new C52260zg2();
                        if (bArr2 != null && bArr2.length > 0) {
                            zg24.parseFrom(bArr2);
                        }
                        uc4.f142765n = zg24;
                    }
                    uc4.getClass();
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C52286zn2 zn24 = new C52286zn2();
                        if (bArr3 != null && bArr3.length > 0) {
                            zn24.parseFrom(bArr3);
                        }
                        uc4.f142766o = zn24;
                    }
                    uc4.getClass();
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51087rc rcVar3 = new C51087rc();
                        if (bArr4 != null && bArr4.length > 0) {
                            rcVar3.parseFrom(bArr4);
                        }
                        uc4.f142767p = rcVar3;
                    }
                    uc4.getClass();
                    return 0;
                case 8:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C48758as2 as24 = new C48758as2();
                        if (bArr5 != null && bArr5.length > 0) {
                            as24.parseFrom(bArr5);
                        }
                        uc4.f142768q = as24;
                    }
                    uc4.getClass();
                    return 0;
                case 9:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C49730ho hoVar5 = new C49730ho();
                        if (bArr6 != null && bArr6.length > 0) {
                            hoVar5.parseFrom(bArr6);
                        }
                        uc4.f142769r = hoVar5;
                    }
                    uc4.getClass();
                    return 0;
                case 10:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C49730ho hoVar6 = new C49730ho();
                        if (bArr7 != null && bArr7.length > 0) {
                            hoVar6.parseFrom(bArr7);
                        }
                        uc4.f142770s = hoVar6;
                    }
                    uc4.getClass();
                    return 0;
                case 11:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C52070y50 y504 = new C52070y50();
                        if (bArr8 != null && bArr8.length > 0) {
                            y504.parseFrom(bArr8);
                        }
                        uc4.f142771t = y504;
                    }
                    uc4.getClass();
                    return 0;
                case 12:
                    uc4.f142772u = aVar3.mo141629g(intValue);
                    uc4.f142773v = true;
                    return 0;
                case 13:
                    uc4.f142774w = aVar3.mo141629g(intValue);
                    uc4.f142775x = true;
                    return 0;
                case 16:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C52192z0 z0Var3 = new C52192z0();
                        if (bArr9 != null && bArr9.length > 0) {
                            z0Var3.parseFrom(bArr9);
                        }
                        uc4.f142776y = z0Var3;
                    }
                    uc4.getClass();
                    return 0;
                case 17:
                    uc4.f142777z = aVar3.mo141629g(intValue);
                    uc4.f142744A = true;
                    return 0;
                case 18:
                    uc4.f142745B = aVar3.mo141629g(intValue);
                    uc4.f142746C = true;
                    return 0;
                case 19:
                    uc4.f142747D = aVar3.mo141629g(intValue);
                    uc4.f142748E = true;
                    return 0;
                case 20:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C50023jq2 jq24 = new C50023jq2();
                        if (bArr10 != null && bArr10.length > 0) {
                            jq24.parseFrom(bArr10);
                        }
                        uc4.f142749F = jq24;
                    }
                    uc4.getClass();
                    return 0;
                case 21:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        C52275zk zkVar3 = new C52275zk();
                        if (bArr11 != null && bArr11.length > 0) {
                            zkVar3.parseFrom(bArr11);
                        }
                        uc4.f142750G = zkVar3;
                    }
                    uc4.getClass();
                    return 0;
                case 22:
                    LinkedList<byte[]> j17 = aVar3.mo141632j(intValue);
                    int size12 = j17.size();
                    for (int i25 = 0; i25 < size12; i25++) {
                        byte[] bArr12 = j17.get(i25);
                        C51432tq3 tq34 = new C51432tq3();
                        if (bArr12 != null && bArr12.length > 0) {
                            tq34.parseFrom(bArr12);
                        }
                        uc4.f142751H = tq34;
                    }
                    uc4.getClass();
                    return 0;
                case 23:
                    uc4.f142752I = aVar3.mo141629g(intValue);
                    uc4.f142753J = true;
                    return 0;
                case 24:
                    LinkedList<byte[]> j18 = aVar3.mo141632j(intValue);
                    int size13 = j18.size();
                    for (int i26 = 0; i26 < size13; i26++) {
                        byte[] bArr13 = j18.get(i26);
                        C52233z9 z9Var3 = new C52233z9();
                        if (bArr13 != null && bArr13.length > 0) {
                            z9Var3.parseFrom(bArr13);
                        }
                        uc4.f142754K = z9Var3;
                    }
                    uc4.getClass();
                    return 0;
                case 25:
                    LinkedList<byte[]> j19 = aVar3.mo141632j(intValue);
                    int size14 = j19.size();
                    for (int i27 = 0; i27 < size14; i27++) {
                        byte[] bArr14 = j19.get(i27);
                        C51139rp2 rp24 = new C51139rp2();
                        if (bArr14 != null && bArr14.length > 0) {
                            rp24.parseFrom(bArr14);
                        }
                        uc4.f142755L = rp24;
                    }
                    uc4.getClass();
                    return 0;
                case 26:
                    LinkedList<byte[]> j25 = aVar3.mo141632j(intValue);
                    int size15 = j25.size();
                    for (int i28 = 0; i28 < size15; i28++) {
                        byte[] bArr15 = j25.get(i28);
                        C49737hp2 hp24 = new C49737hp2();
                        if (bArr15 != null && bArr15.length > 0) {
                            hp24.parseFrom(bArr15);
                        }
                        uc4.f142756M = hp24;
                    }
                    uc4.getClass();
                    return 0;
                case 27:
                    LinkedList<byte[]> j26 = aVar3.mo141632j(intValue);
                    int size16 = j26.size();
                    for (int i29 = 0; i29 < size16; i29++) {
                        byte[] bArr16 = j26.get(i29);
                        C49349ey eyVar3 = new C49349ey();
                        if (bArr16 != null && bArr16.length > 0) {
                            eyVar3.parseFrom(bArr16);
                        }
                        uc4.f142757N = eyVar3;
                    }
                    uc4.getClass();
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public C47465a toPb(String str) {
        if (!(str == null || "" == str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    char c = 65535;
                    switch (next.hashCode()) {
                        case -2123570400:
                            if (next.equals("finish_appeared")) {
                                c = 12;
                                break;
                            }
                            break;
                        case -1954394829:
                            if (next.equals("bariable_button_style")) {
                                c = 21;
                                break;
                            }
                            break;
                        case -1806959573:
                            if (next.equals("show_position")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -1177318867:
                            if (next.equals("account")) {
                                c = 13;
                                break;
                            }
                            break;
                        case -907689876:
                            if (next.equals("screen")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -681364164:
                            if (next.equals("relative_position")) {
                                c = 19;
                                break;
                            }
                            break;
                        case -445253362:
                            if (next.equals("live_living_style")) {
                                c = 23;
                                break;
                            }
                            break;
                        case -388752194:
                            if (next.equals("hot_bubble")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -380569656:
                            if (next.equals("appear_condition_type")) {
                                c = 20;
                                break;
                            }
                            break;
                        case -167840432:
                            if (next.equals("disappear_feed_bottom")) {
                                c = 16;
                                break;
                            }
                            break;
                        case -137989321:
                            if (next.equals("appear_time")) {
                                c = 11;
                                break;
                            }
                            break;
                        case 3321850:
                            if (next.equals("link")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 176893999:
                            if (next.equals("appear_at_play_time_ms")) {
                                c = 14;
                                break;
                            }
                            break;
                        case 580985616:
                            if (next.equals("dynamic_card")) {
                                c = 10;
                                break;
                            }
                            break;
                        case 734910191:
                            if (next.equals("big_card")) {
                                c = 9;
                                break;
                            }
                            break;
                        case 817988846:
                            if (next.equals("loading_style")) {
                                c = 17;
                                break;
                            }
                            break;
                        case 898507841:
                            if (next.equals("combination_style")) {
                                c = 24;
                                break;
                            }
                            break;
                        case 960336433:
                            if (next.equals("lucky_bag")) {
                                c = 7;
                                break;
                            }
                            break;
                        case 1125804527:
                            if (next.equals("show_style")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1188131563:
                            if (next.equals("live_reservation_style")) {
                                c = 22;
                                break;
                            }
                            break;
                        case 1229499208:
                            if (next.equals("small_card")) {
                                c = 8;
                                break;
                            }
                            break;
                        case 1292368484:
                            if (next.equals("button_style")) {
                                c = 18;
                                break;
                            }
                            break;
                        case 1582609981:
                            if (next.equals("disappear_at_play_time_ms")) {
                                c = 15;
                                break;
                            }
                            break;
                        case 1863976785:
                            if (next.equals("big_button")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 1940874532:
                            if (next.equals("normal_buttle")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.f142758d = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 1:
                            this.f142760f = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 2:
                            this.f142762h = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 3:
                            Object opt = jSONObject.opt(next);
                            if (!(opt instanceof JSONObject)) {
                                break;
                            } else {
                                C52212z33 z332 = new C52212z33();
                                z332.toPb(((JSONObject) opt).toString());
                                this.f142764j = z332;
                                break;
                            }
                        case 4:
                            Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof JSONObject)) {
                                break;
                            } else {
                                C52260zg2 zg22 = new C52260zg2();
                                zg22.toPb(((JSONObject) opt2).toString());
                                this.f142765n = zg22;
                                break;
                            }
                        case 5:
                            Object opt3 = jSONObject.opt(next);
                            if (!(opt3 instanceof JSONObject)) {
                                break;
                            } else {
                                C52286zn2 zn22 = new C52286zn2();
                                zn22.toPb(((JSONObject) opt3).toString());
                                this.f142766o = zn22;
                                break;
                            }
                        case 6:
                            Object opt4 = jSONObject.opt(next);
                            if (!(opt4 instanceof JSONObject)) {
                                break;
                            } else {
                                C51087rc rcVar = new C51087rc();
                                rcVar.toPb(((JSONObject) opt4).toString());
                                this.f142767p = rcVar;
                                break;
                            }
                        case 7:
                            Object opt5 = jSONObject.opt(next);
                            if (!(opt5 instanceof JSONObject)) {
                                break;
                            } else {
                                C48758as2 as22 = new C48758as2();
                                as22.toPb(((JSONObject) opt5).toString());
                                this.f142768q = as22;
                                break;
                            }
                        case 8:
                            Object opt6 = jSONObject.opt(next);
                            if (!(opt6 instanceof JSONObject)) {
                                break;
                            } else {
                                C49730ho hoVar = new C49730ho();
                                hoVar.toPb(((JSONObject) opt6).toString());
                                this.f142769r = hoVar;
                                break;
                            }
                        case 9:
                            Object opt7 = jSONObject.opt(next);
                            if (!(opt7 instanceof JSONObject)) {
                                break;
                            } else {
                                C49730ho hoVar2 = new C49730ho();
                                hoVar2.toPb(((JSONObject) opt7).toString());
                                this.f142770s = hoVar2;
                                break;
                            }
                        case 10:
                            Object opt8 = jSONObject.opt(next);
                            if (!(opt8 instanceof JSONObject)) {
                                break;
                            } else {
                                C52070y50 y502 = new C52070y50();
                                y502.toPb(((JSONObject) opt8).toString());
                                this.f142771t = y502;
                                break;
                            }
                        case 11:
                            this.f142772u = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 12:
                            this.f142774w = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 13:
                            Object opt9 = jSONObject.opt(next);
                            if (!(opt9 instanceof JSONObject)) {
                                break;
                            } else {
                                C52192z0 z0Var = new C52192z0();
                                z0Var.toPb(((JSONObject) opt9).toString());
                                this.f142776y = z0Var;
                                break;
                            }
                        case 14:
                            this.f142777z = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 15:
                            this.f142745B = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 16:
                            this.f142747D = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 17:
                            Object opt10 = jSONObject.opt(next);
                            if (!(opt10 instanceof JSONObject)) {
                                break;
                            } else {
                                C50023jq2 jq22 = new C50023jq2();
                                jq22.toPb(((JSONObject) opt10).toString());
                                this.f142749F = jq22;
                                break;
                            }
                        case 18:
                            Object opt11 = jSONObject.opt(next);
                            if (!(opt11 instanceof JSONObject)) {
                                break;
                            } else {
                                C52275zk zkVar = new C52275zk();
                                zkVar.toPb(((JSONObject) opt11).toString());
                                this.f142750G = zkVar;
                                break;
                            }
                        case 19:
                            Object opt12 = jSONObject.opt(next);
                            if (!(opt12 instanceof JSONObject)) {
                                break;
                            } else {
                                C51432tq3 tq32 = new C51432tq3();
                                tq32.toPb(((JSONObject) opt12).toString());
                                this.f142751H = tq32;
                                break;
                            }
                        case 20:
                            this.f142752I = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 21:
                            Object opt13 = jSONObject.opt(next);
                            if (!(opt13 instanceof JSONObject)) {
                                break;
                            } else {
                                C52233z9 z9Var = new C52233z9();
                                z9Var.toPb(((JSONObject) opt13).toString());
                                this.f142754K = z9Var;
                                break;
                            }
                        case 22:
                            Object opt14 = jSONObject.opt(next);
                            if (!(opt14 instanceof JSONObject)) {
                                break;
                            } else {
                                C51139rp2 rp22 = new C51139rp2();
                                rp22.toPb(((JSONObject) opt14).toString());
                                this.f142755L = rp22;
                                break;
                            }
                        case 23:
                            Object opt15 = jSONObject.opt(next);
                            if (!(opt15 instanceof JSONObject)) {
                                break;
                            } else {
                                C49737hp2 hp22 = new C49737hp2();
                                hp22.toPb(((JSONObject) opt15).toString());
                                this.f142756M = hp22;
                                break;
                            }
                        case 24:
                            Object opt16 = jSONObject.opt(next);
                            if (!(opt16 instanceof JSONObject)) {
                                break;
                            } else {
                                C49349ey eyVar = new C49349ey();
                                eyVar.toPb(((JSONObject) opt16).toString());
                                this.f142757N = eyVar;
                                break;
                            }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("Style", e, "", new Object[0]);
            }
        }
        return this;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f142758d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "screen", valueOf, true);
            aVar.mo71655d(jSONObject, "show_position", Integer.valueOf(this.f142760f), true);
            aVar.mo71655d(jSONObject, "show_style", Integer.valueOf(this.f142762h), true);
            aVar.mo71655d(jSONObject, "normal_buttle", this.f142764j, true);
            aVar.mo71655d(jSONObject, "hot_bubble", this.f142765n, true);
            aVar.mo71655d(jSONObject, "link", this.f142766o, true);
            aVar.mo71655d(jSONObject, "big_button", this.f142767p, true);
            aVar.mo71655d(jSONObject, "lucky_bag", this.f142768q, true);
            aVar.mo71655d(jSONObject, "small_card", this.f142769r, true);
            aVar.mo71655d(jSONObject, "big_card", this.f142770s, true);
            aVar.mo71655d(jSONObject, "dynamic_card", this.f142771t, true);
            aVar.mo71655d(jSONObject, "appear_time", Integer.valueOf(this.f142772u), true);
            aVar.mo71655d(jSONObject, "finish_appeared", Integer.valueOf(this.f142774w), true);
            aVar.mo71655d(jSONObject, "account", this.f142776y, true);
            aVar.mo71655d(jSONObject, "appear_at_play_time_ms", Integer.valueOf(this.f142777z), true);
            aVar.mo71655d(jSONObject, "disappear_at_play_time_ms", Integer.valueOf(this.f142745B), true);
            aVar.mo71655d(jSONObject, "disappear_feed_bottom", Integer.valueOf(this.f142747D), true);
            aVar.mo71655d(jSONObject, "loading_style", this.f142749F, true);
            aVar.mo71655d(jSONObject, "button_style", this.f142750G, true);
            aVar.mo71655d(jSONObject, "relative_position", this.f142751H, true);
            aVar.mo71655d(jSONObject, "appear_condition_type", Integer.valueOf(this.f142752I), true);
            aVar.mo71655d(jSONObject, "bariable_button_style", this.f142754K, true);
            aVar.mo71655d(jSONObject, "live_reservation_style", this.f142755L, true);
            aVar.mo71655d(jSONObject, "live_living_style", this.f142756M, true);
            aVar.mo71655d(jSONObject, "combination_style", this.f142757N, true);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
