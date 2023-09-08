package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.si */
public class C51247si extends C47465a {

    /* renamed from: d */
    public long f141526d;

    /* renamed from: e */
    public long f141527e;

    /* renamed from: f */
    public long f141528f;

    /* renamed from: g */
    public long f141529g;

    /* renamed from: h */
    public String f141530h;

    /* renamed from: i */
    public long f141531i;

    /* renamed from: j */
    public long f141532j;

    /* renamed from: n */
    public long f141533n;

    /* renamed from: o */
    public long f141534o;

    /* renamed from: p */
    public long f141535p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51247si)) {
            return false;
        }
        C51247si siVar = (C51247si) aVar;
        return C46238a.m51546a(Long.valueOf(this.f141526d), Long.valueOf(siVar.f141526d)) && C46238a.m51546a(Long.valueOf(this.f141527e), Long.valueOf(siVar.f141527e)) && C46238a.m51546a(Long.valueOf(this.f141528f), Long.valueOf(siVar.f141528f)) && C46238a.m51546a(Long.valueOf(this.f141529g), Long.valueOf(siVar.f141529g)) && C46238a.m51546a(this.f141530h, siVar.f141530h) && C46238a.m51546a(Long.valueOf(this.f141531i), Long.valueOf(siVar.f141531i)) && C46238a.m51546a(Long.valueOf(this.f141532j), Long.valueOf(siVar.f141532j)) && C46238a.m51546a(Long.valueOf(this.f141533n), Long.valueOf(siVar.f141533n)) && C46238a.m51546a(Long.valueOf(this.f141534o), Long.valueOf(siVar.f141534o)) && C46238a.m51546a(Long.valueOf(this.f141535p), Long.valueOf(siVar.f141535p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f141526d);
            aVar.mo74321h(2, this.f141527e);
            aVar.mo74321h(3, this.f141528f);
            aVar.mo74321h(4, this.f141529g);
            String str = this.f141530h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74321h(6, this.f141531i);
            aVar.mo74321h(7, this.f141532j);
            aVar.mo74321h(8, this.f141533n);
            aVar.mo74321h(9, this.f141534o);
            aVar.mo74321h(10, this.f141535p);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f141526d) + 0 + C52418a.m58681h(2, this.f141527e) + C52418a.m58681h(3, this.f141528f) + C52418a.m58681h(4, this.f141529g);
            String str2 = this.f141530h;
            if (str2 != null) {
                h += C52418a.m58683j(5, str2);
            }
            return h + C52418a.m58681h(6, this.f141531i) + C52418a.m58681h(7, this.f141532j) + C52418a.m58681h(8, this.f141533n) + C52418a.m58681h(9, this.f141534o) + C52418a.m58681h(10, this.f141535p);
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
            C51247si siVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    siVar.f141526d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    siVar.f141527e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    siVar.f141528f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    siVar.f141529g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    siVar.f141530h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    siVar.f141531i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    siVar.f141532j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    siVar.f141533n = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    siVar.f141534o = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    siVar.f141535p = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long valueOf = Long.valueOf(this.f141526d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "downloadCount", valueOf, false);
            aVar.mo71655d(jSONObject, "noticeCount", Long.valueOf(this.f141527e), false);
            aVar.mo71655d(jSONObject, "patchMergeCount", Long.valueOf(this.f141528f), false);
            aVar.mo71655d(jSONObject, "installCount", Long.valueOf(this.f141529g), false);
            aVar.mo71655d(jSONObject, "updateType", this.f141530h, false);
            aVar.mo71655d(jSONObject, "downloadTime", Long.valueOf(this.f141531i), false);
            aVar.mo71655d(jSONObject, "patchloadTime", Long.valueOf(this.f141532j), false);
            aVar.mo71655d(jSONObject, "startTime", Long.valueOf(this.f141533n), false);
            aVar.mo71655d(jSONObject, "startDownloadTime", Long.valueOf(this.f141534o), false);
            aVar.mo71655d(jSONObject, "startPatchTime", Long.valueOf(this.f141535p), false);
        } catch (Exception unused) {
        }
        return jSONObject;
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
                        case -2129294769:
                            if (next.equals("startTime")) {
                                c = 7;
                                break;
                            }
                            break;
                        case -1556159969:
                            if (next.equals("patchMergeCount")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -867717901:
                            if (next.equals("startPatchTime")) {
                                c = 9;
                                break;
                            }
                            break;
                        case -708751081:
                            if (next.equals("noticeCount")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -579272421:
                            if (next.equals("patchloadTime")) {
                                c = 6;
                                break;
                            }
                            break;
                        case -295915613:
                            if (next.equals("updateType")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 5877095:
                            if (next.equals("downloadCount")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1109068661:
                            if (next.equals("downloadTime")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 1922277623:
                            if (next.equals("startDownloadTime")) {
                                c = 8;
                                break;
                            }
                            break;
                        case 2009367604:
                            if (next.equals("installCount")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.f141526d = jSONObject.optLong(next);
                            break;
                        case 1:
                            this.f141527e = jSONObject.optLong(next);
                            break;
                        case 2:
                            this.f141528f = jSONObject.optLong(next);
                            break;
                        case 3:
                            this.f141529g = jSONObject.optLong(next);
                            break;
                        case 4:
                            this.f141530h = (String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f141531i = jSONObject.optLong(next);
                            break;
                        case 6:
                            this.f141532j = jSONObject.optLong(next);
                            break;
                        case 7:
                            this.f141533n = jSONObject.optLong(next);
                            break;
                        case 8:
                            this.f141534o = jSONObject.optLong(next);
                            break;
                        case 9:
                            this.f141535p = jSONObject.optLong(next);
                            break;
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("BootInstallKV", e, "", new Object[0]);
            }
        }
        return this;
    }
}
