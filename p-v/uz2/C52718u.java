package uz2;

import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.u */
public class C52718u extends C47465a {

    /* renamed from: A */
    public int f147222A;

    /* renamed from: B */
    public int f147223B;

    /* renamed from: C */
    public String f147224C;

    /* renamed from: D */
    public String f147225D;

    /* renamed from: E */
    public int f147226E;

    /* renamed from: F */
    public String f147227F;

    /* renamed from: G */
    public String f147228G;

    /* renamed from: H */
    public String f147229H;

    /* renamed from: I */
    public long f147230I;

    /* renamed from: J */
    public String f147231J;

    /* renamed from: K */
    public C52713s f147232K;

    /* renamed from: L */
    public String f147233L;

    /* renamed from: M */
    public LinkedList<Integer> f147234M = new LinkedList<>();

    /* renamed from: d */
    public double f147235d;

    /* renamed from: e */
    public double f147236e;

    /* renamed from: f */
    public int f147237f;

    /* renamed from: g */
    public C52678e0 f147238g;

    /* renamed from: h */
    public String f147239h;

    /* renamed from: i */
    public String f147240i;

    /* renamed from: j */
    public String f147241j;

    /* renamed from: n */
    public String f147242n;

    /* renamed from: o */
    public int f147243o;

    /* renamed from: p */
    public String f147244p;

    /* renamed from: q */
    public int f147245q;

    /* renamed from: r */
    public int f147246r;

    /* renamed from: s */
    public String f147247s;

    /* renamed from: t */
    public String f147248t;

    /* renamed from: u */
    public long f147249u;

    /* renamed from: v */
    public int f147250v;

    /* renamed from: w */
    public int f147251w;

    /* renamed from: x */
    public String f147252x;

    /* renamed from: y */
    public C52713s f147253y;

    /* renamed from: z */
    public int f147254z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52718u)) {
            return false;
        }
        C52718u uVar = (C52718u) aVar;
        return C46238a.m51546a(Double.valueOf(this.f147235d), Double.valueOf(uVar.f147235d)) && C46238a.m51546a(Double.valueOf(this.f147236e), Double.valueOf(uVar.f147236e)) && C46238a.m51546a(Integer.valueOf(this.f147237f), Integer.valueOf(uVar.f147237f)) && C46238a.m51546a(this.f147238g, uVar.f147238g) && C46238a.m51546a(this.f147239h, uVar.f147239h) && C46238a.m51546a(this.f147240i, uVar.f147240i) && C46238a.m51546a(this.f147241j, uVar.f147241j) && C46238a.m51546a(this.f147242n, uVar.f147242n) && C46238a.m51546a(Integer.valueOf(this.f147243o), Integer.valueOf(uVar.f147243o)) && C46238a.m51546a(this.f147244p, uVar.f147244p) && C46238a.m51546a(Integer.valueOf(this.f147245q), Integer.valueOf(uVar.f147245q)) && C46238a.m51546a(Integer.valueOf(this.f147246r), Integer.valueOf(uVar.f147246r)) && C46238a.m51546a(this.f147247s, uVar.f147247s) && C46238a.m51546a(this.f147248t, uVar.f147248t) && C46238a.m51546a(Long.valueOf(this.f147249u), Long.valueOf(uVar.f147249u)) && C46238a.m51546a(Integer.valueOf(this.f147250v), Integer.valueOf(uVar.f147250v)) && C46238a.m51546a(Integer.valueOf(this.f147251w), Integer.valueOf(uVar.f147251w)) && C46238a.m51546a(this.f147252x, uVar.f147252x) && C46238a.m51546a(this.f147253y, uVar.f147253y) && C46238a.m51546a(Integer.valueOf(this.f147254z), Integer.valueOf(uVar.f147254z)) && C46238a.m51546a(Integer.valueOf(this.f147222A), Integer.valueOf(uVar.f147222A)) && C46238a.m51546a(Integer.valueOf(this.f147223B), Integer.valueOf(uVar.f147223B)) && C46238a.m51546a(this.f147224C, uVar.f147224C) && C46238a.m51546a(this.f147225D, uVar.f147225D) && C46238a.m51546a(Integer.valueOf(this.f147226E), Integer.valueOf(uVar.f147226E)) && C46238a.m51546a(this.f147227F, uVar.f147227F) && C46238a.m51546a(this.f147228G, uVar.f147228G) && C46238a.m51546a(this.f147229H, uVar.f147229H) && C46238a.m51546a(Long.valueOf(this.f147230I), Long.valueOf(uVar.f147230I)) && C46238a.m51546a(this.f147231J, uVar.f147231J) && C46238a.m51546a(this.f147232K, uVar.f147232K) && C46238a.m51546a(this.f147233L, uVar.f147233L) && C46238a.m51546a(this.f147234M, uVar.f147234M);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74316c(1, this.f147235d);
            aVar.mo74316c(2, this.f147236e);
            aVar.mo74318e(3, this.f147237f);
            C52678e0 e0Var = this.f147238g;
            if (e0Var != null) {
                aVar.mo74322i(4, e0Var.computeSize());
                this.f147238g.writeFields(aVar);
            }
            String str = this.f147239h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f147240i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f147241j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f147242n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            aVar.mo74318e(9, this.f147243o);
            String str5 = this.f147244p;
            if (str5 != null) {
                aVar.mo74323j(10, str5);
            }
            aVar.mo74318e(11, this.f147245q);
            aVar.mo74318e(12, this.f147246r);
            String str6 = this.f147247s;
            if (str6 != null) {
                aVar.mo74323j(13, str6);
            }
            String str7 = this.f147248t;
            if (str7 != null) {
                aVar.mo74323j(14, str7);
            }
            aVar.mo74321h(15, this.f147249u);
            aVar.mo74318e(16, this.f147250v);
            aVar.mo74318e(17, this.f147251w);
            String str8 = this.f147252x;
            if (str8 != null) {
                aVar.mo74323j(18, str8);
            }
            C52713s sVar = this.f147253y;
            if (sVar != null) {
                aVar.mo74322i(20, sVar.computeSize());
                this.f147253y.writeFields(aVar);
            }
            aVar.mo74318e(21, this.f147254z);
            aVar.mo74318e(22, this.f147222A);
            aVar.mo74318e(23, this.f147223B);
            String str9 = this.f147224C;
            if (str9 != null) {
                aVar.mo74323j(24, str9);
            }
            String str10 = this.f147225D;
            if (str10 != null) {
                aVar.mo74323j(25, str10);
            }
            aVar.mo74318e(26, this.f147226E);
            String str11 = this.f147227F;
            if (str11 != null) {
                aVar.mo74323j(27, str11);
            }
            String str12 = this.f147228G;
            if (str12 != null) {
                aVar.mo74323j(28, str12);
            }
            String str13 = this.f147229H;
            if (str13 != null) {
                aVar.mo74323j(29, str13);
            }
            aVar.mo74321h(30, this.f147230I);
            String str14 = this.f147231J;
            if (str14 != null) {
                aVar.mo74323j(31, str14);
            }
            C52713s sVar2 = this.f147232K;
            if (sVar2 != null) {
                aVar.mo74322i(32, sVar2.computeSize());
                this.f147232K.writeFields(aVar);
            }
            String str15 = this.f147233L;
            if (str15 != null) {
                aVar.mo74323j(33, str15);
            }
            aVar.mo74320g(34, 2, this.f147234M);
            return 0;
        } else if (i2 == 1) {
            int c = C52418a.m58676c(1, this.f147235d) + 0 + C52418a.m58676c(2, this.f147236e) + C52418a.m58678e(3, this.f147237f);
            C52678e0 e0Var2 = this.f147238g;
            if (e0Var2 != null) {
                c += C52418a.m58682i(4, e0Var2.computeSize());
            }
            String str16 = this.f147239h;
            if (str16 != null) {
                c += C52418a.m58683j(5, str16);
            }
            String str17 = this.f147240i;
            if (str17 != null) {
                c += C52418a.m58683j(6, str17);
            }
            String str18 = this.f147241j;
            if (str18 != null) {
                c += C52418a.m58683j(7, str18);
            }
            String str19 = this.f147242n;
            if (str19 != null) {
                c += C52418a.m58683j(8, str19);
            }
            int e = c + C52418a.m58678e(9, this.f147243o);
            String str20 = this.f147244p;
            if (str20 != null) {
                e += C52418a.m58683j(10, str20);
            }
            int e2 = e + C52418a.m58678e(11, this.f147245q) + C52418a.m58678e(12, this.f147246r);
            String str21 = this.f147247s;
            if (str21 != null) {
                e2 += C52418a.m58683j(13, str21);
            }
            String str22 = this.f147248t;
            if (str22 != null) {
                e2 += C52418a.m58683j(14, str22);
            }
            int h = e2 + C52418a.m58681h(15, this.f147249u) + C52418a.m58678e(16, this.f147250v) + C52418a.m58678e(17, this.f147251w);
            String str23 = this.f147252x;
            if (str23 != null) {
                h += C52418a.m58683j(18, str23);
            }
            C52713s sVar3 = this.f147253y;
            if (sVar3 != null) {
                h += C52418a.m58682i(20, sVar3.computeSize());
            }
            int e3 = h + C52418a.m58678e(21, this.f147254z) + C52418a.m58678e(22, this.f147222A) + C52418a.m58678e(23, this.f147223B);
            String str24 = this.f147224C;
            if (str24 != null) {
                e3 += C52418a.m58683j(24, str24);
            }
            String str25 = this.f147225D;
            if (str25 != null) {
                e3 += C52418a.m58683j(25, str25);
            }
            int e4 = e3 + C52418a.m58678e(26, this.f147226E);
            String str26 = this.f147227F;
            if (str26 != null) {
                e4 += C52418a.m58683j(27, str26);
            }
            String str27 = this.f147228G;
            if (str27 != null) {
                e4 += C52418a.m58683j(28, str27);
            }
            String str28 = this.f147229H;
            if (str28 != null) {
                e4 += C52418a.m58683j(29, str28);
            }
            int h2 = e4 + C52418a.m58681h(30, this.f147230I);
            String str29 = this.f147231J;
            if (str29 != null) {
                h2 += C52418a.m58683j(31, str29);
            }
            C52713s sVar4 = this.f147232K;
            if (sVar4 != null) {
                h2 += C52418a.m58682i(32, sVar4.computeSize());
            }
            String str30 = this.f147233L;
            if (str30 != null) {
                h2 += C52418a.m58683j(33, str30);
            }
            return h2 + C52418a.m58680g(34, 2, this.f147234M);
        } else if (i2 == 2) {
            this.f147234M.clear();
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
            C52718u uVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    uVar.f147235d = aVar3.mo141627e(intValue);
                    return 0;
                case 2:
                    uVar.f147236e = aVar3.mo141627e(intValue);
                    return 0;
                case 3:
                    uVar.f147237f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C52678e0 e0Var3 = new C52678e0();
                        if (bArr != null && bArr.length > 0) {
                            e0Var3.parseFrom(bArr);
                        }
                        uVar.f147238g = e0Var3;
                    }
                    return 0;
                case 5:
                    uVar.f147239h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    uVar.f147240i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    uVar.f147241j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    uVar.f147242n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    uVar.f147243o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    uVar.f147244p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    uVar.f147245q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    uVar.f147246r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    uVar.f147247s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    uVar.f147248t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    uVar.f147249u = aVar3.mo141631i(intValue);
                    return 0;
                case 16:
                    uVar.f147250v = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    uVar.f147251w = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    uVar.f147252x = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C52713s sVar5 = new C52713s();
                        if (bArr2 != null && bArr2.length > 0) {
                            sVar5.parseFrom(bArr2);
                        }
                        uVar.f147253y = sVar5;
                    }
                    return 0;
                case 21:
                    uVar.f147254z = aVar3.mo141629g(intValue);
                    return 0;
                case 22:
                    uVar.f147222A = aVar3.mo141629g(intValue);
                    return 0;
                case 23:
                    uVar.f147223B = aVar3.mo141629g(intValue);
                    return 0;
                case 24:
                    uVar.f147224C = aVar3.mo141633k(intValue);
                    return 0;
                case 25:
                    uVar.f147225D = aVar3.mo141633k(intValue);
                    return 0;
                case 26:
                    uVar.f147226E = aVar3.mo141629g(intValue);
                    return 0;
                case 27:
                    uVar.f147227F = aVar3.mo141633k(intValue);
                    return 0;
                case 28:
                    uVar.f147228G = aVar3.mo141633k(intValue);
                    return 0;
                case 29:
                    uVar.f147229H = aVar3.mo141633k(intValue);
                    return 0;
                case 30:
                    uVar.f147230I = aVar3.mo141631i(intValue);
                    return 0;
                case 31:
                    uVar.f147231J = aVar3.mo141633k(intValue);
                    return 0;
                case 32:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C52713s sVar6 = new C52713s();
                        if (bArr3 != null && bArr3.length > 0) {
                            sVar6.parseFrom(bArr3);
                        }
                        uVar.f147232K = sVar6;
                    }
                    return 0;
                case 33:
                    uVar.f147233L = aVar3.mo141633k(intValue);
                    return 0;
                case 34:
                    uVar.f147234M.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Double valueOf = Double.valueOf(this.f147235d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "longitude", valueOf, false);
            aVar.mo71655d(jSONObject, "latitude", Double.valueOf(this.f147236e), false);
            aVar.mo71655d(jSONObject, "mediaType", Integer.valueOf(this.f147237f), false);
            aVar.mo71655d(jSONObject, "topicInfo", this.f147238g, false);
            aVar.mo71655d(jSONObject, "mediaUrl", this.f147239h, false);
            aVar.mo71655d(jSONObject, "mediaAesKey", this.f147240i, false);
            aVar.mo71655d(jSONObject, "mediaThumbUrl", this.f147241j, false);
            aVar.mo71655d(jSONObject, "mediaThumbAesKey", this.f147242n, false);
            aVar.mo71655d(jSONObject, "visibility", Integer.valueOf(this.f147243o), false);
            aVar.mo71655d(jSONObject, "description", this.f147244p, false);
            aVar.mo71655d(jSONObject, "createTime", Integer.valueOf(this.f147245q), false);
            aVar.mo71655d(jSONObject, "expireTime", Integer.valueOf(this.f147246r), false);
            aVar.mo71655d(jSONObject, "poiId", this.f147247s, false);
            aVar.mo71655d(jSONObject, "poiName", this.f147248t, false);
            aVar.mo71655d(jSONObject, "option", Long.valueOf(this.f147249u), false);
            aVar.mo71655d(jSONObject, "mediaWidth", Integer.valueOf(this.f147250v), false);
            aVar.mo71655d(jSONObject, "mediaHeight", Integer.valueOf(this.f147251w), false);
            aVar.mo71655d(jSONObject, "backgroundId", this.f147252x, false);
            aVar.mo71655d(jSONObject, "emojiInfo", this.f147253y, false);
            aVar.mo71655d(jSONObject, "modifyTime", Integer.valueOf(this.f147254z), false);
            aVar.mo71655d(jSONObject, "modifyCount", Integer.valueOf(this.f147222A), false);
            aVar.mo71655d(jSONObject, "serverCreateTime", Integer.valueOf(this.f147223B), false);
            aVar.mo71655d(jSONObject, "referenceUsername", this.f147224C, false);
            aVar.mo71655d(jSONObject, "referenceTextStatusId", this.f147225D, false);
            aVar.mo71655d(jSONObject, "sceneType", Integer.valueOf(this.f147226E), false);
            aVar.mo71655d(jSONObject, "duplicateUsername", this.f147227F, false);
            aVar.mo71655d(jSONObject, "duplicateTextStatusId", this.f147228G, false);
            aVar.mo71655d(jSONObject, "brand_key_info", this.f147229H, false);
            aVar.mo71655d(jSONObject, "profile_seq", Long.valueOf(this.f147230I), false);
            aVar.mo71655d(jSONObject, MimeTypes.BASE_TYPE_TEXT, this.f147231J, false);
            aVar.mo71655d(jSONObject, "emoji", this.f147232K, false);
            aVar.mo71655d(jSONObject, "clientMsgId", this.f147233L, false);
            aVar.mo71655d(jSONObject, "blackContactLabelIds", this.f147234M, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
