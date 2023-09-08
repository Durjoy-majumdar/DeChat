package ps2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.net.URLEncoder;
import org.json.JSONArray;

/* renamed from: ps2.z */
public class C100903z {

    /* renamed from: a */
    public String f295482a;

    /* renamed from: b */
    public String f295483b;

    /* renamed from: c */
    public int f295484c;

    /* renamed from: d */
    public int f295485d;

    /* renamed from: e */
    public int f295486e;

    /* renamed from: f */
    public int f295487f;

    /* renamed from: g */
    public int f295488g;

    /* renamed from: h */
    public int f295489h;

    /* renamed from: i */
    public int f295490i;

    /* renamed from: j */
    public int f295491j;

    /* renamed from: k */
    public int f295492k;

    /* renamed from: l */
    public int f295493l;

    /* renamed from: m */
    public String f295494m;

    /* renamed from: n */
    public String f295495n;

    /* renamed from: o */
    public String f295496o;

    /* renamed from: p */
    public String f295497p = "";

    /* renamed from: q */
    public int f295498q;

    /* renamed from: r */
    public String f295499r;

    /* renamed from: s */
    public long f295500s;

    /* renamed from: t */
    public JSONArray f295501t = new JSONArray();

    /* renamed from: a */
    public void mo140368a(String str) {
        SnsMethodCalculate.markStartTimeMs("appendExtra", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesReportInfo");
        if (!TextUtils.isEmpty(str)) {
            if (this.f295497p.length() > 0) {
                this.f295497p += "&";
            }
            this.f295497p += URLEncoder.encode(str);
        }
        SnsMethodCalculate.markEndTimeMs("appendExtra", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesReportInfo");
    }
}
