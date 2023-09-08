package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class p25 extends C47465a {

    /* renamed from: A */
    public int f64374A;

    /* renamed from: B */
    public boolean f64375B;

    /* renamed from: C */
    public int f64376C;

    /* renamed from: D */
    public int f64377D;

    /* renamed from: E */
    public String f64378E;

    /* renamed from: d */
    public int f64379d;

    /* renamed from: e */
    public int f64380e;

    /* renamed from: f */
    public int f64381f;

    /* renamed from: g */
    public String f64382g;

    /* renamed from: h */
    public C48884bn2 f64383h;

    /* renamed from: i */
    public int f64384i;

    /* renamed from: j */
    public String f64385j;

    /* renamed from: n */
    public int f64386n;

    /* renamed from: o */
    public int f64387o = 2;

    /* renamed from: p */
    public LinkedList<C49768hy> f64388p = new LinkedList<>();

    /* renamed from: q */
    public String f64389q;

    /* renamed from: r */
    public String f64390r;

    /* renamed from: s */
    public int f64391s;

    /* renamed from: t */
    public String f64392t;

    /* renamed from: u */
    public String f64393u;

    /* renamed from: v */
    public LinkedList<String> f64394v = new LinkedList<>();

    /* renamed from: w */
    public int f64395w;

    /* renamed from: x */
    public int f64396x;

    /* renamed from: y */
    public int f64397y;

    /* renamed from: z */
    public C51138rp1 f64398z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof p25)) {
            return false;
        }
        p25 p25 = (p25) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f64379d), Integer.valueOf(p25.f64379d)) && C46238a.m51546a(Integer.valueOf(this.f64380e), Integer.valueOf(p25.f64380e)) && C46238a.m51546a(Integer.valueOf(this.f64381f), Integer.valueOf(p25.f64381f)) && C46238a.m51546a(this.f64382g, p25.f64382g) && C46238a.m51546a(this.f64383h, p25.f64383h) && C46238a.m51546a(Integer.valueOf(this.f64384i), Integer.valueOf(p25.f64384i)) && C46238a.m51546a(this.f64385j, p25.f64385j) && C46238a.m51546a(Integer.valueOf(this.f64386n), Integer.valueOf(p25.f64386n)) && C46238a.m51546a(Integer.valueOf(this.f64387o), Integer.valueOf(p25.f64387o)) && C46238a.m51546a(this.f64388p, p25.f64388p) && C46238a.m51546a(this.f64389q, p25.f64389q) && C46238a.m51546a(this.f64390r, p25.f64390r) && C46238a.m51546a(Integer.valueOf(this.f64391s), Integer.valueOf(p25.f64391s)) && C46238a.m51546a(this.f64392t, p25.f64392t) && C46238a.m51546a(this.f64393u, p25.f64393u) && C46238a.m51546a(this.f64394v, p25.f64394v) && C46238a.m51546a(Integer.valueOf(this.f64395w), Integer.valueOf(p25.f64395w)) && C46238a.m51546a(Integer.valueOf(this.f64396x), Integer.valueOf(p25.f64396x)) && C46238a.m51546a(Integer.valueOf(this.f64397y), Integer.valueOf(p25.f64397y)) && C46238a.m51546a(this.f64398z, p25.f64398z) && C46238a.m51546a(Integer.valueOf(this.f64374A), Integer.valueOf(p25.f64374A)) && C46238a.m51546a(Boolean.valueOf(this.f64375B), Boolean.valueOf(p25.f64375B)) && C46238a.m51546a(Integer.valueOf(this.f64376C), Integer.valueOf(p25.f64376C)) && C46238a.m51546a(Integer.valueOf(this.f64377D), Integer.valueOf(p25.f64377D)) && C46238a.m51546a(this.f64378E, p25.f64378E);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f64379d);
            aVar.mo74318e(2, this.f64380e);
            aVar.mo74318e(3, this.f64381f);
            String str = this.f64382g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            C48884bn2 bn22 = this.f64383h;
            if (bn22 != null) {
                aVar.mo74322i(5, bn22.computeSize());
                this.f64383h.writeFields(aVar);
            }
            aVar.mo74318e(6, this.f64384i);
            String str2 = this.f64385j;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74318e(8, this.f64386n);
            aVar.mo74318e(9, this.f64387o);
            aVar.mo74320g(10, 8, this.f64388p);
            String str3 = this.f64389q;
            if (str3 != null) {
                aVar.mo74323j(11, str3);
            }
            String str4 = this.f64390r;
            if (str4 != null) {
                aVar.mo74323j(12, str4);
            }
            aVar.mo74318e(13, this.f64391s);
            String str5 = this.f64392t;
            if (str5 != null) {
                aVar.mo74323j(14, str5);
            }
            String str6 = this.f64393u;
            if (str6 != null) {
                aVar.mo74323j(15, str6);
            }
            aVar.mo74320g(16, 1, this.f64394v);
            aVar.mo74318e(17, this.f64395w);
            aVar.mo74318e(18, this.f64396x);
            aVar.mo74318e(19, this.f64397y);
            C51138rp1 rp12 = this.f64398z;
            if (rp12 != null) {
                aVar.mo74322i(20, rp12.computeSize());
                this.f64398z.writeFields(aVar);
            }
            aVar.mo74318e(21, this.f64374A);
            aVar.mo74314a(22, this.f64375B);
            aVar.mo74318e(23, this.f64376C);
            aVar.mo74318e(24, this.f64377D);
            String str7 = this.f64378E;
            if (str7 != null) {
                aVar.mo74323j(25, str7);
            }
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f64379d) + 0 + C52418a.m58678e(2, this.f64380e) + C52418a.m58678e(3, this.f64381f);
            String str8 = this.f64382g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            C48884bn2 bn23 = this.f64383h;
            if (bn23 != null) {
                e += C52418a.m58682i(5, bn23.computeSize());
            }
            int e2 = e + C52418a.m58678e(6, this.f64384i);
            String str9 = this.f64385j;
            if (str9 != null) {
                e2 += C52418a.m58683j(7, str9);
            }
            int e3 = e2 + C52418a.m58678e(8, this.f64386n) + C52418a.m58678e(9, this.f64387o) + C52418a.m58680g(10, 8, this.f64388p);
            String str10 = this.f64389q;
            if (str10 != null) {
                e3 += C52418a.m58683j(11, str10);
            }
            String str11 = this.f64390r;
            if (str11 != null) {
                e3 += C52418a.m58683j(12, str11);
            }
            int e4 = e3 + C52418a.m58678e(13, this.f64391s);
            String str12 = this.f64392t;
            if (str12 != null) {
                e4 += C52418a.m58683j(14, str12);
            }
            String str13 = this.f64393u;
            if (str13 != null) {
                e4 += C52418a.m58683j(15, str13);
            }
            int g = e4 + C52418a.m58680g(16, 1, this.f64394v) + C52418a.m58678e(17, this.f64395w) + C52418a.m58678e(18, this.f64396x) + C52418a.m58678e(19, this.f64397y);
            C51138rp1 rp13 = this.f64398z;
            if (rp13 != null) {
                g += C52418a.m58682i(20, rp13.computeSize());
            }
            int e5 = g + C52418a.m58678e(21, this.f64374A) + C52418a.m58674a(22, this.f64375B) + C52418a.m58678e(23, this.f64376C) + C52418a.m58678e(24, this.f64377D);
            String str14 = this.f64378E;
            return str14 != null ? e5 + C52418a.m58683j(25, str14) : e5;
        } else if (i2 == 2) {
            this.f64388p.clear();
            this.f64394v.clear();
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
            p25 p25 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    p25.f64379d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    p25.f64380e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    p25.f64381f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    p25.f64382g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C48884bn2 bn24 = new C48884bn2();
                        if (bArr != null && bArr.length > 0) {
                            bn24.parseFrom(bArr);
                        }
                        p25.f64383h = bn24;
                    }
                    return 0;
                case 6:
                    p25.f64384i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    p25.f64385j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    p25.f64386n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    p25.f64387o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49768hy hyVar = new C49768hy();
                        if (bArr2 != null && bArr2.length > 0) {
                            hyVar.parseFrom(bArr2);
                        }
                        p25.f64388p.add(hyVar);
                    }
                    return 0;
                case 11:
                    p25.f64389q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    p25.f64390r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    p25.f64391s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    p25.f64392t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    p25.f64393u = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    p25.f64394v.add(aVar3.mo141633k(intValue));
                    return 0;
                case 17:
                    p25.f64395w = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    p25.f64396x = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    p25.f64397y = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51138rp1 rp14 = new C51138rp1();
                        if (bArr3 != null && bArr3.length > 0) {
                            rp14.parseFrom(bArr3);
                        }
                        p25.f64398z = rp14;
                    }
                    return 0;
                case 21:
                    p25.f64374A = aVar3.mo141629g(intValue);
                    return 0;
                case 22:
                    p25.f64375B = aVar3.mo141625c(intValue);
                    return 0;
                case 23:
                    p25.f64376C = aVar3.mo141629g(intValue);
                    return 0;
                case 24:
                    p25.f64377D = aVar3.mo141629g(intValue);
                    return 0;
                case 25:
                    p25.f64378E = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f64379d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Offset", valueOf, false);
            aVar.mo71655d(jSONObject, "H5Version", Integer.valueOf(this.f64380e), false);
            aVar.mo71655d(jSONObject, "IsHomePage", Integer.valueOf(this.f64381f), false);
            aVar.mo71655d(jSONObject, "Keyword", this.f64382g, false);
            aVar.mo71655d(jSONObject, "Location", this.f64383h, false);
            aVar.mo71655d(jSONObject, "Scene", Integer.valueOf(this.f64384i), false);
            aVar.mo71655d(jSONObject, "SearchID", this.f64385j, false);
            aVar.mo71655d(jSONObject, "SceneActionType", Integer.valueOf(this.f64386n), false);
            aVar.mo71655d(jSONObject, "DisplayPattern", Integer.valueOf(this.f64387o), false);
            aVar.mo71655d(jSONObject, "ExtReqParams", this.f64388p, false);
            aVar.mo71655d(jSONObject, "SessionID", this.f64389q, false);
            aVar.mo71655d(jSONObject, "Source", this.f64390r, false);
            aVar.mo71655d(jSONObject, "ChannelId", Integer.valueOf(this.f64391s), false);
            aVar.mo71655d(jSONObject, "NavigationId", this.f64392t, false);
            aVar.mo71655d(jSONObject, "RedPointMsgId", this.f64393u, false);
            aVar.mo71655d(jSONObject, "CheckDocidList", this.f64394v, false);
            aVar.mo71655d(jSONObject, "Pos", Integer.valueOf(this.f64395w), false);
            aVar.mo71655d(jSONObject, "Type", Integer.valueOf(this.f64396x), false);
            aVar.mo71655d(jSONObject, "FromPreTabChannelId", Integer.valueOf(this.f64397y), false);
            aVar.mo71655d(jSONObject, "FloatingWindow", this.f64398z, false);
            aVar.mo71655d(jSONObject, "Count", Integer.valueOf(this.f64374A), false);
            aVar.mo71655d(jSONObject, "IsFromClient", Boolean.valueOf(this.f64375B), false);
            aVar.mo71655d(jSONObject, "CareMode", Integer.valueOf(this.f64376C), false);
            aVar.mo71655d(jSONObject, "YoungMode", Integer.valueOf(this.f64377D), false);
            aVar.mo71655d(jSONObject, "AdIdInfo", this.f64378E, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
