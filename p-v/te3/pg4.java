package te3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class pg4 extends C47465a {

    /* renamed from: d */
    public String f354229d;

    /* renamed from: e */
    public String f354230e;

    /* renamed from: f */
    public int f354231f;

    /* renamed from: g */
    public String f354232g;

    /* renamed from: h */
    public int f354233h;

    /* renamed from: i */
    public String f354234i;

    /* renamed from: j */
    public int f354235j;

    /* renamed from: n */
    public boolean f354236n;

    /* renamed from: o */
    public fz4 f354237o;

    /* renamed from: p */
    public long f354238p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof pg4)) {
            return false;
        }
        pg4 pg4 = (pg4) aVar;
        return C46238a.m51546a(this.f354229d, pg4.f354229d) && C46238a.m51546a(this.f354230e, pg4.f354230e) && C46238a.m51546a(Integer.valueOf(this.f354231f), Integer.valueOf(pg4.f354231f)) && C46238a.m51546a(this.f354232g, pg4.f354232g) && C46238a.m51546a(Integer.valueOf(this.f354233h), Integer.valueOf(pg4.f354233h)) && C46238a.m51546a(this.f354234i, pg4.f354234i) && C46238a.m51546a(Integer.valueOf(this.f354235j), Integer.valueOf(pg4.f354235j)) && C46238a.m51546a(Boolean.valueOf(this.f354236n), Boolean.valueOf(pg4.f354236n)) && C46238a.m51546a(this.f354237o, pg4.f354237o) && C46238a.m51546a(Long.valueOf(this.f354238p), Long.valueOf(pg4.f354238p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f354229d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f354230e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f354231f);
            String str3 = this.f354232g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f354233h);
            String str4 = this.f354234i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f354235j);
            aVar.mo74314a(8, this.f354236n);
            fz4 fz4 = this.f354237o;
            if (fz4 != null) {
                aVar.mo74322i(9, fz4.computeSize());
                this.f354237o.writeFields(aVar);
            }
            aVar.mo74321h(10, this.f354238p);
            return 0;
        } else if (i == 1) {
            String str5 = this.f354229d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f354230e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int e = i2 + C52418a.m58678e(3, this.f354231f);
            String str7 = this.f354232g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            int e2 = e + C52418a.m58678e(5, this.f354233h);
            String str8 = this.f354234i;
            if (str8 != null) {
                e2 += C52418a.m58683j(6, str8);
            }
            int e3 = e2 + C52418a.m58678e(7, this.f354235j) + C52418a.m58674a(8, this.f354236n);
            fz4 fz42 = this.f354237o;
            if (fz42 != null) {
                e3 += C52418a.m58682i(9, fz42.computeSize());
            }
            return e3 + C52418a.m58681h(10, this.f354238p);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            pg4 pg4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    pg4.f354229d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    pg4.f354230e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    pg4.f354231f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    pg4.f354232g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    pg4.f354233h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    pg4.f354234i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    pg4.f354235j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    pg4.f354236n = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        fz4 fz43 = new fz4();
                        if (bArr != null && bArr.length > 0) {
                            fz43.parseFrom(bArr);
                        }
                        pg4.f354237o = fz43;
                    }
                    return 0;
                case 10:
                    pg4.f354238p = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f354229d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "bizusername", str, true);
            aVar.mo71655d(jSONObject, "logo_url", this.f354230e, true);
            aVar.mo71655d(jSONObject, "weight", Integer.valueOf(this.f354231f), true);
            aVar.mo71655d(jSONObject, "finder_feed_export_id", this.f354232g, true);
            aVar.mo71655d(jSONObject, "refresh_interval", Integer.valueOf(this.f354233h), true);
            aVar.mo71655d(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f354234i, true);
            aVar.mo71655d(jSONObject, "live_scene", Integer.valueOf(this.f354235j), true);
            aVar.mo71655d(jSONObject, "use_weapp", Boolean.valueOf(this.f354236n), true);
            aVar.mo71655d(jSONObject, "weapp_data", this.f354237o, true);
            aVar.mo71655d(jSONObject, "finder_green_dot_time_stamp", Long.valueOf(this.f354238p), true);
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
                        case -1008929860:
                            if (next.equals("finder_green_dot_time_stamp")) {
                                c = 9;
                                break;
                            }
                            break;
                        case -898481431:
                            if (next.equals("bizusername")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -791592328:
                            if (next.equals("weight")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -673896098:
                            if (next.equals("finder_feed_export_id")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -182716453:
                            if (next.equals("use_weapp")) {
                                c = 7;
                                break;
                            }
                            break;
                        case 110371416:
                            if (next.equals(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
                                c = 5;
                                break;
                            }
                            break;
                        case 1212992377:
                            if (next.equals("live_scene")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 1387772886:
                            if (next.equals("weapp_data")) {
                                c = 8;
                                break;
                            }
                            break;
                        case 1816824233:
                            if (next.equals("refresh_interval")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 2027875547:
                            if (next.equals("logo_url")) {
                                c = 1;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.f354229d = (String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f354230e = (String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f354231f = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 3:
                            this.f354232g = (String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f354233h = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 5:
                            this.f354234i = (String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f354235j = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 7:
                            this.f354236n = ((Boolean) jSONObject.opt(next)).booleanValue();
                            break;
                        case 8:
                            Object opt = jSONObject.opt(next);
                            if (!(opt instanceof JSONObject)) {
                                break;
                            } else {
                                fz4 fz4 = new fz4();
                                fz4.toPb(((JSONObject) opt).toString());
                                this.f354237o = fz4;
                                break;
                            }
                        case 9:
                            this.f354238p = jSONObject.optLong(next);
                            break;
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("TimelineOftenReadBizInfo", e, "", new Object[0]);
            }
        }
        return this;
    }
}
