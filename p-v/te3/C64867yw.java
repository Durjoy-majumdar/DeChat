package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yw */
public class C64867yw extends C47465a {

    /* renamed from: d */
    public int f186604d;

    /* renamed from: e */
    public String f186605e;

    /* renamed from: f */
    public long f186606f;

    /* renamed from: g */
    public int f186607g;

    /* renamed from: h */
    public long f186608h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64867yw)) {
            return false;
        }
        C64867yw ywVar = (C64867yw) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186604d), Integer.valueOf(ywVar.f186604d)) && C46238a.m51546a(this.f186605e, ywVar.f186605e) && C46238a.m51546a(Long.valueOf(this.f186606f), Long.valueOf(ywVar.f186606f)) && C46238a.m51546a(Integer.valueOf(this.f186607g), Integer.valueOf(ywVar.f186607g)) && C46238a.m51546a(Long.valueOf(this.f186608h), Long.valueOf(ywVar.f186608h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f186604d);
            String str = this.f186605e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f186606f);
            aVar.mo74318e(100, this.f186607g);
            aVar.mo74321h(101, this.f186608h);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f186604d) + 0;
            String str2 = this.f186605e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            return e + C52418a.m58681h(3, this.f186606f) + C52418a.m58678e(100, this.f186607g) + C52418a.m58681h(101, this.f186608h);
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
            C64867yw ywVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ywVar.f186604d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                ywVar.f186605e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ywVar.f186606f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 100) {
                ywVar.f186607g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 101) {
                return -1;
            } else {
                ywVar.f186608h = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f186604d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "expose_count", valueOf, true);
            aVar.mo71655d(jSONObject, "oob", this.f186605e, true);
            aVar.mo71655d(jSONObject, "first_expose_time", Long.valueOf(this.f186606f), true);
            aVar.mo71655d(jSONObject, "had_sync_for_cold_time", Integer.valueOf(this.f186607g), true);
            aVar.mo71655d(jSONObject, "last_expose_time", Long.valueOf(this.f186608h), true);
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
                        case -1349100711:
                            if (next.equals("first_expose_time")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -620329246:
                            if (next.equals("had_sync_for_cold_time")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 110210:
                            if (next.equals("oob")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 785900756:
                            if (next.equals("expose_count")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 957051455:
                            if (next.equals("last_expose_time")) {
                                c = 4;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        this.f186604d = ((Integer) jSONObject.opt(next)).intValue();
                    } else if (c == 1) {
                        this.f186605e = (String) jSONObject.opt(next);
                    } else if (c == 2) {
                        this.f186606f = jSONObject.optLong(next);
                    } else if (c == 3) {
                        this.f186607g = ((Integer) jSONObject.opt(next)).intValue();
                    } else if (c == 4) {
                        this.f186608h = jSONObject.optLong(next);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("ClientStatsInfo", e, "", new Object[0]);
            }
        }
        return this;
    }
}
