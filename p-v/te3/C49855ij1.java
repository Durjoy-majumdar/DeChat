package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ij1 */
public class C49855ij1 extends C47465a {

    /* renamed from: d */
    public String f135385d;

    /* renamed from: e */
    public int f135386e;

    /* renamed from: f */
    public String f135387f;

    /* renamed from: g */
    public String f135388g;

    /* renamed from: h */
    public int f135389h;

    /* renamed from: i */
    public LinkedList<C49999jj1> f135390i = new LinkedList<>();

    /* renamed from: j */
    public int f135391j;

    /* renamed from: n */
    public String f135392n;

    /* renamed from: o */
    public String f135393o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49855ij1)) {
            return false;
        }
        C49855ij1 ij12 = (C49855ij1) aVar;
        return C46238a.m51546a(this.f135385d, ij12.f135385d) && C46238a.m51546a(Integer.valueOf(this.f135386e), Integer.valueOf(ij12.f135386e)) && C46238a.m51546a(this.f135387f, ij12.f135387f) && C46238a.m51546a(this.f135388g, ij12.f135388g) && C46238a.m51546a(Integer.valueOf(this.f135389h), Integer.valueOf(ij12.f135389h)) && C46238a.m51546a(this.f135390i, ij12.f135390i) && C46238a.m51546a(Integer.valueOf(this.f135391j), Integer.valueOf(ij12.f135391j)) && C46238a.m51546a(this.f135392n, ij12.f135392n) && C46238a.m51546a(this.f135393o, ij12.f135393o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f135385d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f135386e);
            String str2 = this.f135387f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f135388g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f135389h);
            aVar.mo74320g(6, 8, this.f135390i);
            aVar.mo74318e(7, this.f135391j);
            String str4 = this.f135392n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            String str5 = this.f135393o;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f135385d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            int e = i2 + C52418a.m58678e(2, this.f135386e);
            String str7 = this.f135387f;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f135388g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            int e2 = e + C52418a.m58678e(5, this.f135389h) + C52418a.m58680g(6, 8, this.f135390i) + C52418a.m58678e(7, this.f135391j);
            String str9 = this.f135392n;
            if (str9 != null) {
                e2 += C52418a.m58683j(8, str9);
            }
            String str10 = this.f135393o;
            return str10 != null ? e2 + C52418a.m58683j(9, str10) : e2;
        } else if (i == 2) {
            this.f135390i.clear();
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
            C49855ij1 ij12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ij12.f135385d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ij12.f135386e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ij12.f135387f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ij12.f135388g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ij12.f135389h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49999jj1 jj12 = new C49999jj1();
                        if (bArr != null && bArr.length > 0) {
                            jj12.parseFrom(bArr);
                        }
                        ij12.f135390i.add(jj12);
                    }
                    return 0;
                case 7:
                    ij12.f135391j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ij12.f135392n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    ij12.f135393o = aVar3.mo141633k(intValue);
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
                        case -1833163180:
                            if (next.equals("show_timestamp")) {
                                c = 7;
                                break;
                            }
                            break;
                        case -1537240555:
                            if (next.equals("task_id")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -976011428:
                            if (next.equals("feed_id")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -311734145:
                            if (next.equals("answer_list")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 361476226:
                            if (next.equals("trigger_source")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 379283553:
                            if (next.equals("shown_count")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 784361565:
                            if (next.equals("feed_stream_relative_index")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1194872211:
                            if (next.equals("select_timestamp")) {
                                c = 8;
                                break;
                            }
                            break;
                        case 1917932576:
                            if (next.equals("survey_id")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.f135385d = (String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f135386e = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 2:
                            this.f135387f = (String) jSONObject.opt(next);
                            break;
                        case 3:
                            this.f135388g = (String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f135389h = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 5:
                            Object opt = jSONObject.opt(next);
                            if (!(opt instanceof JSONArray)) {
                                break;
                            } else {
                                JSONArray jSONArray = (JSONArray) opt;
                                for (int i = 0; i < jSONArray.length(); i++) {
                                    Object obj = jSONArray.get(i);
                                    if (obj instanceof JSONObject) {
                                        LinkedList<C49999jj1> linkedList = this.f135390i;
                                        C49999jj1 jj12 = new C49999jj1();
                                        jj12.toPb(((JSONObject) obj).toString());
                                        linkedList.add(jj12);
                                    }
                                }
                                break;
                            }
                        case 6:
                            this.f135391j = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 7:
                            this.f135392n = (String) jSONObject.opt(next);
                            break;
                        case 8:
                            this.f135393o = (String) jSONObject.opt(next);
                            break;
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("FinderReportNpsSurveyInfo", e, "", new Object[0]);
            }
        }
        return this;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f135385d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "feed_id", str, true);
            aVar.mo71655d(jSONObject, "feed_stream_relative_index", Integer.valueOf(this.f135386e), true);
            aVar.mo71655d(jSONObject, "task_id", this.f135387f, true);
            aVar.mo71655d(jSONObject, "survey_id", this.f135388g, true);
            aVar.mo71655d(jSONObject, "shown_count", Integer.valueOf(this.f135389h), true);
            aVar.mo71655d(jSONObject, "answer_list", this.f135390i, true);
            aVar.mo71655d(jSONObject, "trigger_source", Integer.valueOf(this.f135391j), true);
            aVar.mo71655d(jSONObject, "show_timestamp", this.f135392n, true);
            aVar.mo71655d(jSONObject, "select_timestamp", this.f135393o, true);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
