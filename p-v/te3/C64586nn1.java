package te3;

import android.util.Base64;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nn1 */
public class C64586nn1 extends C47465a {

    /* renamed from: A */
    public int f184500A;

    /* renamed from: B */
    public C51327t10 f184501B;

    /* renamed from: d */
    public int f184502d;

    /* renamed from: e */
    public int f184503e;

    /* renamed from: f */
    public String f184504f;

    /* renamed from: g */
    public String f184505g;

    /* renamed from: h */
    public int f184506h;

    /* renamed from: i */
    public String f184507i;

    /* renamed from: j */
    public String f184508j;

    /* renamed from: n */
    public int f184509n;

    /* renamed from: o */
    public C89349b f184510o;

    /* renamed from: p */
    public LinkedList<String> f184511p = new LinkedList<>();

    /* renamed from: q */
    public C64867yw f184512q;

    /* renamed from: r */
    public int f184513r;

    /* renamed from: s */
    public int f184514s;

    /* renamed from: t */
    public int f184515t;

    /* renamed from: u */
    public int f184516u;

    /* renamed from: v */
    public int f184517v;

    /* renamed from: w */
    public C51397th2 f184518w;

    /* renamed from: x */
    public C64702s7 f184519x;

    /* renamed from: y */
    public int f184520y;

    /* renamed from: z */
    public String f184521z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64586nn1)) {
            return false;
        }
        C64586nn1 nn12 = (C64586nn1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184502d), Integer.valueOf(nn12.f184502d)) && C46238a.m51546a(Integer.valueOf(this.f184503e), Integer.valueOf(nn12.f184503e)) && C46238a.m51546a(this.f184504f, nn12.f184504f) && C46238a.m51546a(this.f184505g, nn12.f184505g) && C46238a.m51546a(Integer.valueOf(this.f184506h), Integer.valueOf(nn12.f184506h)) && C46238a.m51546a(this.f184507i, nn12.f184507i) && C46238a.m51546a(this.f184508j, nn12.f184508j) && C46238a.m51546a(Integer.valueOf(this.f184509n), Integer.valueOf(nn12.f184509n)) && C46238a.m51546a(this.f184510o, nn12.f184510o) && C46238a.m51546a(this.f184511p, nn12.f184511p) && C46238a.m51546a(this.f184512q, nn12.f184512q) && C46238a.m51546a(Integer.valueOf(this.f184513r), Integer.valueOf(nn12.f184513r)) && C46238a.m51546a(Integer.valueOf(this.f184514s), Integer.valueOf(nn12.f184514s)) && C46238a.m51546a(Integer.valueOf(this.f184515t), Integer.valueOf(nn12.f184515t)) && C46238a.m51546a(Integer.valueOf(this.f184516u), Integer.valueOf(nn12.f184516u)) && C46238a.m51546a(Integer.valueOf(this.f184517v), Integer.valueOf(nn12.f184517v)) && C46238a.m51546a(this.f184518w, nn12.f184518w) && C46238a.m51546a(this.f184519x, nn12.f184519x) && C46238a.m51546a(Integer.valueOf(this.f184520y), Integer.valueOf(nn12.f184520y)) && C46238a.m51546a(this.f184521z, nn12.f184521z) && C46238a.m51546a(Integer.valueOf(this.f184500A), Integer.valueOf(nn12.f184500A)) && C46238a.m51546a(this.f184501B, nn12.f184501B);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184502d);
            aVar.mo74318e(2, this.f184503e);
            String str = this.f184504f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f184505g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f184506h);
            String str3 = this.f184507i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f184508j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            aVar.mo74318e(8, this.f184509n);
            C89349b bVar = this.f184510o;
            if (bVar != null) {
                aVar.mo74315b(9, bVar);
            }
            aVar.mo74320g(10, 1, this.f184511p);
            C64867yw ywVar = this.f184512q;
            if (ywVar != null) {
                aVar.mo74322i(11, ywVar.computeSize());
                this.f184512q.writeFields(aVar);
            }
            aVar.mo74318e(12, this.f184513r);
            aVar.mo74318e(13, this.f184514s);
            aVar.mo74318e(14, this.f184515t);
            aVar.mo74318e(15, this.f184516u);
            aVar.mo74318e(16, this.f184517v);
            C51397th2 th22 = this.f184518w;
            if (th22 != null) {
                aVar.mo74322i(17, th22.computeSize());
                this.f184518w.writeFields(aVar);
            }
            C64702s7 s7Var = this.f184519x;
            if (s7Var != null) {
                aVar.mo74322i(18, s7Var.computeSize());
                this.f184519x.writeFields(aVar);
            }
            aVar.mo74318e(19, this.f184520y);
            String str5 = this.f184521z;
            if (str5 != null) {
                aVar.mo74323j(20, str5);
            }
            aVar.mo74318e(21, this.f184500A);
            C51327t10 t102 = this.f184501B;
            if (t102 != null) {
                aVar.mo74322i(22, t102.computeSize());
                this.f184501B.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f184502d) + 0 + C52418a.m58678e(2, this.f184503e);
            String str6 = this.f184504f;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f184505g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            int e2 = e + C52418a.m58678e(5, this.f184506h);
            String str8 = this.f184507i;
            if (str8 != null) {
                e2 += C52418a.m58683j(6, str8);
            }
            String str9 = this.f184508j;
            if (str9 != null) {
                e2 += C52418a.m58683j(7, str9);
            }
            int e3 = e2 + C52418a.m58678e(8, this.f184509n);
            C89349b bVar2 = this.f184510o;
            if (bVar2 != null) {
                e3 += C52418a.m58675b(9, bVar2);
            }
            int g = e3 + C52418a.m58680g(10, 1, this.f184511p);
            C64867yw ywVar2 = this.f184512q;
            if (ywVar2 != null) {
                g += C52418a.m58682i(11, ywVar2.computeSize());
            }
            int e4 = g + C52418a.m58678e(12, this.f184513r) + C52418a.m58678e(13, this.f184514s) + C52418a.m58678e(14, this.f184515t) + C52418a.m58678e(15, this.f184516u) + C52418a.m58678e(16, this.f184517v);
            C51397th2 th23 = this.f184518w;
            if (th23 != null) {
                e4 += C52418a.m58682i(17, th23.computeSize());
            }
            C64702s7 s7Var2 = this.f184519x;
            if (s7Var2 != null) {
                e4 += C52418a.m58682i(18, s7Var2.computeSize());
            }
            int e5 = e4 + C52418a.m58678e(19, this.f184520y);
            String str10 = this.f184521z;
            if (str10 != null) {
                e5 += C52418a.m58683j(20, str10);
            }
            int e6 = e5 + C52418a.m58678e(21, this.f184500A);
            C51327t10 t103 = this.f184501B;
            return t103 != null ? e6 + C52418a.m58682i(22, t103.computeSize()) : e6;
        } else if (i2 == 2) {
            this.f184511p.clear();
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
            C64586nn1 nn12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    nn12.f184502d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    nn12.f184503e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    nn12.f184504f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    nn12.f184505g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    nn12.f184506h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    nn12.f184507i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    nn12.f184508j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    nn12.f184509n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    nn12.f184510o = aVar3.mo141626d(intValue);
                    return 0;
                case 10:
                    nn12.f184511p.add(aVar3.mo141633k(intValue));
                    return 0;
                case 11:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64867yw ywVar3 = new C64867yw();
                        if (bArr != null && bArr.length > 0) {
                            ywVar3.parseFrom(bArr);
                        }
                        nn12.f184512q = ywVar3;
                    }
                    return 0;
                case 12:
                    nn12.f184513r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    nn12.f184514s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    nn12.f184515t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    nn12.f184516u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    nn12.f184517v = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51397th2 th24 = new C51397th2();
                        if (bArr2 != null && bArr2.length > 0) {
                            th24.parseFrom(bArr2);
                        }
                        nn12.f184518w = th24;
                    }
                    return 0;
                case 18:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64702s7 s7Var3 = new C64702s7();
                        if (bArr3 != null && bArr3.length > 0) {
                            s7Var3.parseFrom(bArr3);
                        }
                        nn12.f184519x = s7Var3;
                    }
                    return 0;
                case 19:
                    nn12.f184520y = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    nn12.f184521z = aVar3.mo141633k(intValue);
                    return 0;
                case 21:
                    nn12.f184500A = aVar3.mo141629g(intValue);
                    return 0;
                case 22:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51327t10 t104 = new C51327t10();
                        if (bArr4 != null && bArr4.length > 0) {
                            t104.parseFrom(bArr4);
                        }
                        nn12.f184501B = t104;
                    }
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
                        case -1971861220:
                            if (next.equals("attributeTitle")) {
                                c = 17;
                                break;
                            }
                            break;
                        case -1903312068:
                            if (next.equals("show_type")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1806115381:
                            if (next.equals("show_ext_info_type")) {
                                c = 7;
                                break;
                            }
                            break;
                        case -1766717118:
                            if (next.equals("client_stats_info")) {
                                c = 10;
                                break;
                            }
                            break;
                        case -995424086:
                            if (next.equals("parent")) {
                                c = 6;
                                break;
                            }
                            break;
                        case -959795941:
                            if (next.equals("iconConfig")) {
                                c = 16;
                                break;
                            }
                            break;
                        case -737588055:
                            if (next.equals("icon_url")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -732792340:
                            if (next.equals("clear_type")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -331061934:
                            if (next.equals("expose_limit_strategy")) {
                                c = 14;
                                break;
                            }
                            break;
                        case -265713450:
                            if (next.equals("username")) {
                                c = 19;
                                break;
                            }
                            break;
                        case -179985264:
                            if (next.equals("expose_count_limit")) {
                                c = 13;
                                break;
                            }
                            break;
                        case -86367474:
                            if (next.equals("show_ext_info")) {
                                c = 8;
                                break;
                            }
                            break;
                        case -21125788:
                            if (next.equals("multi_icon_urls")) {
                                c = 9;
                                break;
                            }
                            break;
                        case 3433509:
                            if (next.equals("path")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 94851343:
                            if (next.equals("count")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 110371416:
                            if (next.equals(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1015999425:
                            if (next.equals("ignore_freq_limit")) {
                                c = 12;
                                break;
                            }
                            break;
                        case 1099718262:
                            if (next.equals("show_live_tab_id")) {
                                c = 11;
                                break;
                            }
                            break;
                        case 1215103539:
                            if (next.equals("coldTimeLevel")) {
                                c = 20;
                                break;
                            }
                            break;
                        case 1454732984:
                            if (next.equals("cacheChangeTabOption")) {
                                c = 18;
                                break;
                            }
                            break;
                        case 1649412936:
                            if (next.equals("cold_time")) {
                                c = 15;
                                break;
                            }
                            break;
                        case 2008265139:
                            if (next.equals("dslRender")) {
                                c = 21;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.f184502d = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 1:
                            this.f184503e = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 2:
                            this.f184504f = (String) jSONObject.opt(next);
                            break;
                        case 3:
                            this.f184505g = (String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f184506h = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 5:
                            this.f184507i = (String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f184508j = (String) jSONObject.opt(next);
                            break;
                        case 7:
                            this.f184509n = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 8:
                            Object opt = jSONObject.opt(next);
                            if (!(opt instanceof String)) {
                                break;
                            } else {
                                this.f184510o = C89349b.m111674a(Base64.decode((String) opt, 0));
                                break;
                            }
                        case 9:
                            Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof JSONArray)) {
                                break;
                            } else {
                                JSONArray jSONArray = (JSONArray) opt2;
                                for (int i = 0; i < jSONArray.length(); i++) {
                                    this.f184511p.add((String) jSONArray.get(i));
                                }
                                break;
                            }
                        case 10:
                            Object opt3 = jSONObject.opt(next);
                            if (!(opt3 instanceof JSONObject)) {
                                break;
                            } else {
                                C64867yw ywVar = new C64867yw();
                                ywVar.toPb(((JSONObject) opt3).toString());
                                this.f184512q = ywVar;
                                break;
                            }
                        case 11:
                            this.f184513r = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 12:
                            this.f184514s = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 13:
                            this.f184515t = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 14:
                            this.f184516u = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 15:
                            this.f184517v = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 16:
                            Object opt4 = jSONObject.opt(next);
                            if (!(opt4 instanceof JSONObject)) {
                                break;
                            } else {
                                C51397th2 th22 = new C51397th2();
                                th22.toPb(((JSONObject) opt4).toString());
                                this.f184518w = th22;
                                break;
                            }
                        case 17:
                            Object opt5 = jSONObject.opt(next);
                            if (!(opt5 instanceof JSONObject)) {
                                break;
                            } else {
                                C64702s7 s7Var = new C64702s7();
                                s7Var.toPb(((JSONObject) opt5).toString());
                                this.f184519x = s7Var;
                                break;
                            }
                        case 18:
                            this.f184520y = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 19:
                            this.f184521z = (String) jSONObject.opt(next);
                            break;
                        case 20:
                            this.f184500A = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 21:
                            Object opt6 = jSONObject.opt(next);
                            if (!(opt6 instanceof JSONObject)) {
                                break;
                            } else {
                                C51327t10 t102 = new C51327t10();
                                t102.toPb(((JSONObject) opt6).toString());
                                this.f184501B = t102;
                                break;
                            }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("FinderTipsShowInfo", e, "", new Object[0]);
            }
        }
        return this;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f184502d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "show_type", valueOf, true);
            aVar.mo71655d(jSONObject, "count", Integer.valueOf(this.f184503e), true);
            aVar.mo71655d(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f184504f, true);
            aVar.mo71655d(jSONObject, "icon_url", this.f184505g, true);
            aVar.mo71655d(jSONObject, "clear_type", Integer.valueOf(this.f184506h), true);
            aVar.mo71655d(jSONObject, "path", this.f184507i, true);
            aVar.mo71655d(jSONObject, "parent", this.f184508j, true);
            aVar.mo71655d(jSONObject, "show_ext_info_type", Integer.valueOf(this.f184509n), true);
            aVar.mo71655d(jSONObject, "show_ext_info", this.f184510o, true);
            aVar.mo71655d(jSONObject, "multi_icon_urls", this.f184511p, true);
            aVar.mo71655d(jSONObject, "client_stats_info", this.f184512q, true);
            aVar.mo71655d(jSONObject, "show_live_tab_id", Integer.valueOf(this.f184513r), true);
            aVar.mo71655d(jSONObject, "ignore_freq_limit", Integer.valueOf(this.f184514s), true);
            aVar.mo71655d(jSONObject, "expose_count_limit", Integer.valueOf(this.f184515t), true);
            aVar.mo71655d(jSONObject, "expose_limit_strategy", Integer.valueOf(this.f184516u), true);
            aVar.mo71655d(jSONObject, "cold_time", Integer.valueOf(this.f184517v), true);
            aVar.mo71655d(jSONObject, "iconConfig", this.f184518w, true);
            aVar.mo71655d(jSONObject, "attributeTitle", this.f184519x, true);
            aVar.mo71655d(jSONObject, "cacheChangeTabOption", Integer.valueOf(this.f184520y), true);
            aVar.mo71655d(jSONObject, "username", this.f184521z, true);
            aVar.mo71655d(jSONObject, "coldTimeLevel", Integer.valueOf(this.f184500A), true);
            aVar.mo71655d(jSONObject, "dslRender", this.f184501B, true);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
