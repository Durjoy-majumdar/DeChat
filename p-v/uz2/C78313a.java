package uz2;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.a */
public class C78313a extends C47465a {

    /* renamed from: A */
    public long f229396A;

    /* renamed from: B */
    public long f229397B;

    /* renamed from: C */
    public C78316t f229398C;

    /* renamed from: d */
    public C52718u f229399d;

    /* renamed from: e */
    public String f229400e;

    /* renamed from: f */
    public String f229401f;

    /* renamed from: g */
    public boolean f229402g = true;

    /* renamed from: h */
    public String f229403h;

    /* renamed from: i */
    public long f229404i;

    /* renamed from: j */
    public long f229405j;

    /* renamed from: n */
    public int f229406n;

    /* renamed from: o */
    public int f229407o;

    /* renamed from: p */
    public int f229408p;

    /* renamed from: q */
    public int f229409q;

    /* renamed from: r */
    public String f229410r;

    /* renamed from: s */
    public int f229411s;

    /* renamed from: t */
    public String f229412t;

    /* renamed from: u */
    public boolean f229413u;

    /* renamed from: v */
    public boolean f229414v;

    /* renamed from: w */
    public int f229415w;

    /* renamed from: x */
    public String f229416x;

    /* renamed from: y */
    public String f229417y;

    /* renamed from: z */
    public boolean f229418z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78313a)) {
            return false;
        }
        C78313a aVar2 = (C78313a) aVar;
        return C46238a.m51546a(this.f229399d, aVar2.f229399d) && C46238a.m51546a(this.f229400e, aVar2.f229400e) && C46238a.m51546a(this.f229401f, aVar2.f229401f) && C46238a.m51546a(Boolean.valueOf(this.f229402g), Boolean.valueOf(aVar2.f229402g)) && C46238a.m51546a(this.f229403h, aVar2.f229403h) && C46238a.m51546a(Long.valueOf(this.f229404i), Long.valueOf(aVar2.f229404i)) && C46238a.m51546a(Long.valueOf(this.f229405j), Long.valueOf(aVar2.f229405j)) && C46238a.m51546a(Integer.valueOf(this.f229406n), Integer.valueOf(aVar2.f229406n)) && C46238a.m51546a(Integer.valueOf(this.f229407o), Integer.valueOf(aVar2.f229407o)) && C46238a.m51546a(Integer.valueOf(this.f229408p), Integer.valueOf(aVar2.f229408p)) && C46238a.m51546a(Integer.valueOf(this.f229409q), Integer.valueOf(aVar2.f229409q)) && C46238a.m51546a(this.f229410r, aVar2.f229410r) && C46238a.m51546a(Integer.valueOf(this.f229411s), Integer.valueOf(aVar2.f229411s)) && C46238a.m51546a(this.f229412t, aVar2.f229412t) && C46238a.m51546a(Boolean.valueOf(this.f229413u), Boolean.valueOf(aVar2.f229413u)) && C46238a.m51546a(Boolean.valueOf(this.f229414v), Boolean.valueOf(aVar2.f229414v)) && C46238a.m51546a(Integer.valueOf(this.f229415w), Integer.valueOf(aVar2.f229415w)) && C46238a.m51546a(this.f229416x, aVar2.f229416x) && C46238a.m51546a(this.f229417y, aVar2.f229417y) && C46238a.m51546a(Boolean.valueOf(this.f229418z), Boolean.valueOf(aVar2.f229418z)) && C46238a.m51546a(Long.valueOf(this.f229396A), Long.valueOf(aVar2.f229396A)) && C46238a.m51546a(Long.valueOf(this.f229397B), Long.valueOf(aVar2.f229397B)) && C46238a.m51546a(this.f229398C, aVar2.f229398C);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C52718u uVar = this.f229399d;
            if (uVar != null) {
                aVar.mo74322i(1, uVar.computeSize());
                this.f229399d.writeFields(aVar);
            }
            String str = this.f229400e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f229401f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74314a(4, this.f229402g);
            String str3 = this.f229403h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74321h(6, this.f229404i);
            aVar.mo74321h(7, this.f229405j);
            aVar.mo74318e(8, this.f229406n);
            aVar.mo74318e(9, this.f229407o);
            aVar.mo74318e(10, this.f229408p);
            aVar.mo74318e(11, this.f229409q);
            String str4 = this.f229410r;
            if (str4 != null) {
                aVar.mo74323j(12, str4);
            }
            aVar.mo74318e(13, this.f229411s);
            String str5 = this.f229412t;
            if (str5 != null) {
                aVar.mo74323j(14, str5);
            }
            aVar.mo74314a(15, this.f229413u);
            aVar.mo74314a(16, this.f229414v);
            aVar.mo74318e(17, this.f229415w);
            String str6 = this.f229416x;
            if (str6 != null) {
                aVar.mo74323j(18, str6);
            }
            String str7 = this.f229417y;
            if (str7 != null) {
                aVar.mo74323j(19, str7);
            }
            aVar.mo74314a(20, this.f229418z);
            aVar.mo74321h(21, this.f229396A);
            aVar.mo74321h(22, this.f229397B);
            C78316t tVar = this.f229398C;
            if (tVar != null) {
                aVar.mo74322i(23, tVar.computeSize());
                this.f229398C.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            C52718u uVar2 = this.f229399d;
            if (uVar2 != null) {
                i3 = C52418a.m58682i(1, uVar2.computeSize()) + 0;
            }
            String str8 = this.f229400e;
            if (str8 != null) {
                i3 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f229401f;
            if (str9 != null) {
                i3 += C52418a.m58683j(3, str9);
            }
            int a = i3 + C52418a.m58674a(4, this.f229402g);
            String str10 = this.f229403h;
            if (str10 != null) {
                a += C52418a.m58683j(5, str10);
            }
            int h = a + C52418a.m58681h(6, this.f229404i) + C52418a.m58681h(7, this.f229405j) + C52418a.m58678e(8, this.f229406n) + C52418a.m58678e(9, this.f229407o) + C52418a.m58678e(10, this.f229408p) + C52418a.m58678e(11, this.f229409q);
            String str11 = this.f229410r;
            if (str11 != null) {
                h += C52418a.m58683j(12, str11);
            }
            int e = h + C52418a.m58678e(13, this.f229411s);
            String str12 = this.f229412t;
            if (str12 != null) {
                e += C52418a.m58683j(14, str12);
            }
            int a2 = e + C52418a.m58674a(15, this.f229413u) + C52418a.m58674a(16, this.f229414v) + C52418a.m58678e(17, this.f229415w);
            String str13 = this.f229416x;
            if (str13 != null) {
                a2 += C52418a.m58683j(18, str13);
            }
            String str14 = this.f229417y;
            if (str14 != null) {
                a2 += C52418a.m58683j(19, str14);
            }
            int a3 = a2 + C52418a.m58674a(20, this.f229418z) + C52418a.m58681h(21, this.f229396A) + C52418a.m58681h(22, this.f229397B);
            C78316t tVar2 = this.f229398C;
            return tVar2 != null ? a3 + C52418a.m58682i(23, tVar2.computeSize()) : a3;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C78313a aVar4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C52718u uVar3 = new C52718u();
                        if (bArr != null && bArr.length > 0) {
                            uVar3.parseFrom(bArr);
                        }
                        aVar4.f229399d = uVar3;
                    }
                    return 0;
                case 2:
                    aVar4.f229400e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    aVar4.f229401f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    aVar4.f229402g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    aVar4.f229403h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    aVar4.f229404i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    aVar4.f229405j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    aVar4.f229406n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    aVar4.f229407o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    aVar4.f229408p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    aVar4.f229409q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    aVar4.f229410r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    aVar4.f229411s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    aVar4.f229412t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    aVar4.f229413u = aVar3.mo141625c(intValue);
                    return 0;
                case 16:
                    aVar4.f229414v = aVar3.mo141625c(intValue);
                    return 0;
                case 17:
                    aVar4.f229415w = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    aVar4.f229416x = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    aVar4.f229417y = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    aVar4.f229418z = aVar3.mo141625c(intValue);
                    return 0;
                case 21:
                    aVar4.f229396A = aVar3.mo141631i(intValue);
                    return 0;
                case 22:
                    aVar4.f229397B = aVar3.mo141631i(intValue);
                    return 0;
                case 23:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C78316t tVar3 = new C78316t();
                        if (bArr2 != null && bArr2.length > 0) {
                            tVar3.parseFrom(bArr2);
                        }
                        aVar4.f229398C = tVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C52718u uVar = this.f229399d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "textExtInfo", uVar, false);
            aVar.mo71655d(jSONObject, "mediaPath", this.f229400e, false);
            aVar.mo71655d(jSONObject, "fileUrl", this.f229401f, false);
            aVar.mo71655d(jSONObject, "canCapture", Boolean.valueOf(this.f229402g), false);
            aVar.mo71655d(jSONObject, "sessionId", this.f229403h, false);
            aVar.mo71655d(jSONObject, "enterSource", Long.valueOf(this.f229404i), false);
            aVar.mo71655d(jSONObject, "enterTime", Long.valueOf(this.f229405j), false);
            aVar.mo71655d(jSONObject, "UserGuideShown", Integer.valueOf(this.f229406n), false);
            aVar.mo71655d(jSONObject, "UserGuideKnownClicked", Integer.valueOf(this.f229407o), false);
            aVar.mo71655d(jSONObject, "ClkCustomIconCount", Integer.valueOf(this.f229408p), false);
            aVar.mo71655d(jSONObject, "CustomTitleTooLongCount", Integer.valueOf(this.f229409q), false);
            aVar.mo71655d(jSONObject, "FinalCustomTitle", this.f229410r, false);
            aVar.mo71655d(jSONObject, "setStatusMode", Integer.valueOf(this.f229411s), false);
            aVar.mo71655d(jSONObject, "statusModeUserName", this.f229412t, false);
            aVar.mo71655d(jSONObject, "isQuickPost", Boolean.valueOf(this.f229413u), false);
            aVar.mo71655d(jSONObject, "isHideToast", Boolean.valueOf(this.f229414v), false);
            aVar.mo71655d(jSONObject, "qrCodeScene", Integer.valueOf(this.f229415w), false);
            aVar.mo71655d(jSONObject, "weRunInfo", this.f229416x, false);
            aVar.mo71655d(jSONObject, "paymentInfo", this.f229417y, false);
            aVar.mo71655d(jSONObject, "isHalfScreen", Boolean.valueOf(this.f229418z), false);
            aVar.mo71655d(jSONObject, "ClkUserDefineIconCount", Long.valueOf(this.f229396A), false);
            aVar.mo71655d(jSONObject, "ClkAddIconToCustomTitleCount", Long.valueOf(this.f229397B), false);
            aVar.mo71655d(jSONObject, "emojiInfo", this.f229398C, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
