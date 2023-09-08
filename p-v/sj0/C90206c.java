package sj0;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import java.util.Objects;
import kr0.C88267e;
import org.json.JSONArray;
import org.json.JSONObject;
import sj0.C90203b;
import xj0.C91216b0;
import xj0.C91237o;

/* renamed from: sj0.c */
public class C90206c implements C91216b0<JSONObject> {

    /* renamed from: a */
    public final /* synthetic */ C88267e f258969a;

    /* renamed from: b */
    public final /* synthetic */ int f258970b;

    /* renamed from: c */
    public final /* synthetic */ C90203b.C90205b f258971c;

    /* renamed from: d */
    public final /* synthetic */ String f258972d;

    /* renamed from: e */
    public final /* synthetic */ JSONArray f258973e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f258974f;

    /* renamed from: g */
    public final /* synthetic */ C90207d f258975g;

    public C90206c(C90207d dVar, C88267e eVar, int i, C90203b.C90205b bVar, String str, JSONArray jSONArray, JSONObject jSONObject) {
        this.f258975g = dVar;
        this.f258969a = eVar;
        this.f258970b = i;
        this.f258971c = bVar;
        this.f258972d = str;
        this.f258973e = jSONArray;
        this.f258974f = jSONObject;
    }

    /* renamed from: a */
    public void mo123718a(int i, int i2, String str, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (i2 != 0 || jSONObject == null) {
            this.f258975g.mo124448z(this.f258969a, this.f258970b, i, i2, str);
            return;
        }
        try {
            C90207d dVar = this.f258975g;
            C88267e eVar = this.f258969a;
            dVar.getClass();
            C91237o b = C91237o.m114472b(eVar.getAppId(), eVar);
            Objects.requireNonNull(b);
            C91237o.C91242e eVar2 = new C91237o.C91242e(b);
            JSONObject optJSONObject = jSONObject.optJSONObject("audio");
            if (optJSONObject != null) {
                eVar2.f261819a = optJSONObject.optInt(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, 0);
                eVar2.f261820b = optJSONObject.optInt("samplerate", 0);
                eVar2.f261821c = optJSONObject.optInt("channel", 0);
            }
            this.f258975g.mo124447A(this.f258969a, this.f258970b, this.f258971c, this.f258972d, this.f258973e, eVar2, this.f258974f);
        } catch (Exception e) {
            this.f258975g.mo124448z(this.f258969a, this.f258970b, 1, -1, e.getMessage());
        }
    }
}
