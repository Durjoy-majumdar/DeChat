package te3;

import android.util.Base64;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
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

/* renamed from: te3.xi1 */
public class C51978xi1 extends C47465a {

    /* renamed from: d */
    public int f144669d;

    /* renamed from: e */
    public int f144670e;

    /* renamed from: f */
    public C89349b f144671f;

    /* renamed from: g */
    public LinkedList<C64586nn1> f144672g = new LinkedList<>();

    /* renamed from: h */
    public String f144673h;

    /* renamed from: i */
    public int f144674i;

    /* renamed from: j */
    public int f144675j;

    /* renamed from: n */
    public int f144676n;

    /* renamed from: o */
    public boolean f144677o;

    /* renamed from: p */
    public String f144678p;

    /* renamed from: q */
    public String f144679q;

    /* renamed from: r */
    public int f144680r;

    /* renamed from: s */
    public int f144681s;

    /* renamed from: t */
    public String f144682t;

    /* renamed from: u */
    public String f144683u;

    /* renamed from: v */
    public C89349b f144684v;

    /* renamed from: w */
    public C89349b f144685w;

    /* renamed from: x */
    public long f144686x;

    /* renamed from: y */
    public long f144687y;

    /* renamed from: z */
    public int f144688z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51978xi1)) {
            return false;
        }
        C51978xi1 xi12 = (C51978xi1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f144669d), Integer.valueOf(xi12.f144669d)) && C46238a.m51546a(Integer.valueOf(this.f144670e), Integer.valueOf(xi12.f144670e)) && C46238a.m51546a(this.f144671f, xi12.f144671f) && C46238a.m51546a(this.f144672g, xi12.f144672g) && C46238a.m51546a(this.f144673h, xi12.f144673h) && C46238a.m51546a(Integer.valueOf(this.f144674i), Integer.valueOf(xi12.f144674i)) && C46238a.m51546a(Integer.valueOf(this.f144675j), Integer.valueOf(xi12.f144675j)) && C46238a.m51546a(Integer.valueOf(this.f144676n), Integer.valueOf(xi12.f144676n)) && C46238a.m51546a(Boolean.valueOf(this.f144677o), Boolean.valueOf(xi12.f144677o)) && C46238a.m51546a(this.f144678p, xi12.f144678p) && C46238a.m51546a(this.f144679q, xi12.f144679q) && C46238a.m51546a(Integer.valueOf(this.f144680r), Integer.valueOf(xi12.f144680r)) && C46238a.m51546a(Integer.valueOf(this.f144681s), Integer.valueOf(xi12.f144681s)) && C46238a.m51546a(this.f144682t, xi12.f144682t) && C46238a.m51546a(this.f144683u, xi12.f144683u) && C46238a.m51546a(this.f144684v, xi12.f144684v) && C46238a.m51546a(this.f144685w, xi12.f144685w) && C46238a.m51546a(Long.valueOf(this.f144686x), Long.valueOf(xi12.f144686x)) && C46238a.m51546a(Long.valueOf(this.f144687y), Long.valueOf(xi12.f144687y)) && C46238a.m51546a(Integer.valueOf(this.f144688z), Integer.valueOf(xi12.f144688z));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f144669d);
            aVar.mo74318e(2, this.f144670e);
            C89349b bVar = this.f144671f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74320g(4, 8, this.f144672g);
            String str = this.f144673h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74318e(6, this.f144674i);
            aVar.mo74318e(7, this.f144675j);
            aVar.mo74318e(8, this.f144676n);
            aVar.mo74314a(9, this.f144677o);
            String str2 = this.f144678p;
            if (str2 != null) {
                aVar.mo74323j(10, str2);
            }
            String str3 = this.f144679q;
            if (str3 != null) {
                aVar.mo74323j(11, str3);
            }
            aVar.mo74318e(12, this.f144680r);
            aVar.mo74318e(13, this.f144681s);
            String str4 = this.f144682t;
            if (str4 != null) {
                aVar.mo74323j(14, str4);
            }
            String str5 = this.f144683u;
            if (str5 != null) {
                aVar.mo74323j(15, str5);
            }
            C89349b bVar2 = this.f144684v;
            if (bVar2 != null) {
                aVar.mo74315b(16, bVar2);
            }
            C89349b bVar3 = this.f144685w;
            if (bVar3 != null) {
                aVar.mo74315b(18, bVar3);
            }
            aVar.mo74321h(100, this.f144686x);
            aVar.mo74321h(101, this.f144687y);
            aVar.mo74318e(102, this.f144688z);
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f144669d) + 0 + C52418a.m58678e(2, this.f144670e);
            C89349b bVar4 = this.f144671f;
            if (bVar4 != null) {
                e += C52418a.m58675b(3, bVar4);
            }
            int g = e + C52418a.m58680g(4, 8, this.f144672g);
            String str6 = this.f144673h;
            if (str6 != null) {
                g += C52418a.m58683j(5, str6);
            }
            int e2 = g + C52418a.m58678e(6, this.f144674i) + C52418a.m58678e(7, this.f144675j) + C52418a.m58678e(8, this.f144676n) + C52418a.m58674a(9, this.f144677o);
            String str7 = this.f144678p;
            if (str7 != null) {
                e2 += C52418a.m58683j(10, str7);
            }
            String str8 = this.f144679q;
            if (str8 != null) {
                e2 += C52418a.m58683j(11, str8);
            }
            int e3 = e2 + C52418a.m58678e(12, this.f144680r) + C52418a.m58678e(13, this.f144681s);
            String str9 = this.f144682t;
            if (str9 != null) {
                e3 += C52418a.m58683j(14, str9);
            }
            String str10 = this.f144683u;
            if (str10 != null) {
                e3 += C52418a.m58683j(15, str10);
            }
            C89349b bVar5 = this.f144684v;
            if (bVar5 != null) {
                e3 += C52418a.m58675b(16, bVar5);
            }
            C89349b bVar6 = this.f144685w;
            if (bVar6 != null) {
                e3 += C52418a.m58675b(18, bVar6);
            }
            return e3 + C52418a.m58681h(100, this.f144686x) + C52418a.m58681h(101, this.f144687y) + C52418a.m58678e(102, this.f144688z);
        } else if (i2 == 2) {
            this.f144672g.clear();
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
            C51978xi1 xi12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 18) {
                switch (intValue) {
                    case 1:
                        xi12.f144669d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        xi12.f144670e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        xi12.f144671f = aVar3.mo141626d(intValue);
                        return 0;
                    case 4:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            byte[] bArr = j.get(i3);
                            C64586nn1 nn12 = new C64586nn1();
                            if (bArr != null && bArr.length > 0) {
                                nn12.parseFrom(bArr);
                            }
                            xi12.f144672g.add(nn12);
                        }
                        return 0;
                    case 5:
                        xi12.f144673h = aVar3.mo141633k(intValue);
                        return 0;
                    case 6:
                        xi12.f144674i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        xi12.f144675j = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        xi12.f144676n = aVar3.mo141629g(intValue);
                        return 0;
                    case 9:
                        xi12.f144677o = aVar3.mo141625c(intValue);
                        return 0;
                    case 10:
                        xi12.f144678p = aVar3.mo141633k(intValue);
                        return 0;
                    case 11:
                        xi12.f144679q = aVar3.mo141633k(intValue);
                        return 0;
                    case 12:
                        xi12.f144680r = aVar3.mo141629g(intValue);
                        return 0;
                    case 13:
                        xi12.f144681s = aVar3.mo141629g(intValue);
                        return 0;
                    case 14:
                        xi12.f144682t = aVar3.mo141633k(intValue);
                        return 0;
                    case 15:
                        xi12.f144683u = aVar3.mo141633k(intValue);
                        return 0;
                    case 16:
                        xi12.f144684v = aVar3.mo141626d(intValue);
                        return 0;
                    default:
                        switch (intValue) {
                            case 100:
                                xi12.f144686x = aVar3.mo141631i(intValue);
                                return 0;
                            case 101:
                                xi12.f144687y = aVar3.mo141631i(intValue);
                                return 0;
                            case 102:
                                xi12.f144688z = aVar3.mo141629g(intValue);
                                return 0;
                            default:
                                return -1;
                        }
                }
            } else {
                xi12.f144685w = aVar3.mo141626d(intValue);
                return 0;
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
                        case -1573145462:
                            if (next.equals("start_time")) {
                                c = 6;
                                break;
                            }
                            break;
                        case -1310739582:
                            if (next.equals("tips_id")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -1306498449:
                            if (next.equals("extInfo")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1278410919:
                            if (next.equals("feedId")) {
                                c = 17;
                                break;
                            }
                            break;
                        case -1205623433:
                            if (next.equals("localFlag")) {
                                c = 18;
                                break;
                            }
                            break;
                        case -1165461084:
                            if (next.equals(DownloadInfo.PRIORITY)) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1160326153:
                            if (next.equals("internal_feedback_url")) {
                                c = 9;
                                break;
                            }
                            break;
                        case -521457284:
                            if (next.equals("session_bypass_info")) {
                                c = 16;
                                break;
                            }
                            break;
                        case -319538087:
                            if (next.equals("localIsFinderIdentity")) {
                                c = 19;
                                break;
                            }
                            break;
                        case -96179731:
                            if (next.equals("expire_time")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 3575610:
                            if (next.equals("type")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 32264720:
                            if (next.equals("finder_sub_recall_type")) {
                                c = 11;
                                break;
                            }
                            break;
                        case 452971343:
                            if (next.equals("ignore_valid")) {
                                c = 8;
                                break;
                            }
                            break;
                        case 506361563:
                            if (next.equals(FirebaseAnalytics.C113379b.GROUP_ID)) {
                                c = 14;
                                break;
                            }
                            break;
                        case 823546702:
                            if (next.equals("ignore_display_tab_type")) {
                                c = 7;
                                break;
                            }
                            break;
                        case 1116372419:
                            if (next.equals("show_infos")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1662551223:
                            if (next.equals("report_ctrl_info")) {
                                c = 15;
                                break;
                            }
                            break;
                        case 1675237852:
                            if (next.equals("self_finder_username")) {
                                c = 10;
                                break;
                            }
                            break;
                        case 1731475127:
                            if (next.equals("report_ext_info")) {
                                c = 13;
                                break;
                            }
                            break;
                        case 1745305302:
                            if (next.equals("live_sub_recall_type")) {
                                c = 12;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.f144669d = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 1:
                            this.f144670e = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 2:
                            Object opt = jSONObject.opt(next);
                            if (!(opt instanceof String)) {
                                break;
                            } else {
                                this.f144671f = C89349b.m111674a(Base64.decode((String) opt, 0));
                                break;
                            }
                        case 3:
                            Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof JSONArray)) {
                                break;
                            } else {
                                JSONArray jSONArray = (JSONArray) opt2;
                                for (int i = 0; i < jSONArray.length(); i++) {
                                    Object obj = jSONArray.get(i);
                                    if (obj instanceof JSONObject) {
                                        LinkedList<C64586nn1> linkedList = this.f144672g;
                                        C64586nn1 nn12 = new C64586nn1();
                                        nn12.toPb(((JSONObject) obj).toString());
                                        linkedList.add(nn12);
                                    }
                                }
                                break;
                            }
                        case 4:
                            this.f144673h = (String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f144674i = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 6:
                            this.f144675j = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 7:
                            this.f144676n = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 8:
                            this.f144677o = ((Boolean) jSONObject.opt(next)).booleanValue();
                            break;
                        case 9:
                            this.f144678p = (String) jSONObject.opt(next);
                            break;
                        case 10:
                            this.f144679q = (String) jSONObject.opt(next);
                            break;
                        case 11:
                            this.f144680r = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 12:
                            this.f144681s = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 13:
                            this.f144682t = (String) jSONObject.opt(next);
                            break;
                        case 14:
                            this.f144683u = (String) jSONObject.opt(next);
                            break;
                        case 15:
                            Object opt3 = jSONObject.opt(next);
                            if (!(opt3 instanceof String)) {
                                break;
                            } else {
                                this.f144684v = C89349b.m111674a(Base64.decode((String) opt3, 0));
                                break;
                            }
                        case 16:
                            Object opt4 = jSONObject.opt(next);
                            if (!(opt4 instanceof String)) {
                                break;
                            } else {
                                this.f144685w = C89349b.m111674a(Base64.decode((String) opt4, 0));
                                break;
                            }
                        case 17:
                            this.f144686x = jSONObject.optLong(next);
                            break;
                        case 18:
                            this.f144687y = jSONObject.optLong(next);
                            break;
                        case 19:
                            this.f144688z = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("FinderRedDotCtrlInfo", e, "", new Object[0]);
            }
        }
        return this;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f144669d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, DownloadInfo.PRIORITY, valueOf, true);
            aVar.mo71655d(jSONObject, "type", Integer.valueOf(this.f144670e), true);
            aVar.mo71655d(jSONObject, "extInfo", this.f144671f, true);
            aVar.mo71655d(jSONObject, "show_infos", this.f144672g, true);
            aVar.mo71655d(jSONObject, "tips_id", this.f144673h, true);
            aVar.mo71655d(jSONObject, "expire_time", Integer.valueOf(this.f144674i), true);
            aVar.mo71655d(jSONObject, "start_time", Integer.valueOf(this.f144675j), true);
            aVar.mo71655d(jSONObject, "ignore_display_tab_type", Integer.valueOf(this.f144676n), true);
            aVar.mo71655d(jSONObject, "ignore_valid", Boolean.valueOf(this.f144677o), true);
            aVar.mo71655d(jSONObject, "internal_feedback_url", this.f144678p, true);
            aVar.mo71655d(jSONObject, "self_finder_username", this.f144679q, true);
            aVar.mo71655d(jSONObject, "finder_sub_recall_type", Integer.valueOf(this.f144680r), true);
            aVar.mo71655d(jSONObject, "live_sub_recall_type", Integer.valueOf(this.f144681s), true);
            aVar.mo71655d(jSONObject, "report_ext_info", this.f144682t, true);
            aVar.mo71655d(jSONObject, FirebaseAnalytics.C113379b.GROUP_ID, this.f144683u, true);
            aVar.mo71655d(jSONObject, "report_ctrl_info", this.f144684v, true);
            aVar.mo71655d(jSONObject, "session_bypass_info", this.f144685w, true);
            aVar.mo71655d(jSONObject, "feedId", Long.valueOf(this.f144686x), true);
            aVar.mo71655d(jSONObject, "localFlag", Long.valueOf(this.f144687y), true);
            aVar.mo71655d(jSONObject, "localIsFinderIdentity", Integer.valueOf(this.f144688z), true);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
