package f23;

import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import rh3.C36327a;
import rx3.C13598b0;

/* renamed from: f23.b */
public final class C97815b extends C36327a {

    /* renamed from: a */
    public ArrayList<C97820e> f286948a = new ArrayList<>();

    /* renamed from: b */
    public ArrayList<C97816a> f286949b = new ArrayList<>();

    /* renamed from: c */
    public C97818c f286950c = new C97818c();

    /* renamed from: d */
    public boolean f286951d = true;

    /* renamed from: f23.b$a */
    public static class C97816a extends C36327a {

        /* renamed from: a */
        public int f286952a;

        /* renamed from: b */
        public ArrayList<Long> f286953b = new ArrayList<>();

        /* renamed from: a */
        public JSONObject mo33258a() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", this.f286952a);
            JSONArray jSONArray = new JSONArray();
            for (Number longValue : this.f286953b) {
                jSONArray.put(longValue.longValue());
            }
            C13598b0 b0Var = C13598b0.f38549a;
            jSONObject.put("time", jSONArray);
            return jSONObject;
        }
    }

    /* renamed from: f23.b$b */
    public static final class C97817b extends C97816a {

        /* renamed from: c */
        public String f286954c = "";

        /* renamed from: a */
        public JSONObject mo33258a() {
            JSONObject a = super.mo33258a();
            if (!Util.isNullOrNil(this.f286954c)) {
                a.put("font", this.f286954c);
            }
            return a;
        }
    }

    /* renamed from: f23.b$c */
    public static final class C97818c extends C36327a {

        /* renamed from: a */
        public int f286955a;

        /* renamed from: b */
        public int f286956b;

        /* renamed from: c */
        public int f286957c;

        /* renamed from: a */
        public JSONObject mo33258a() {
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f286955a);
            sb.append('K');
            jSONObject.put("pss", sb.toString());
            jSONObject.put("thumbCount", this.f286956b);
            jSONObject.put("thumbMem", Util.getSizeMB((long) this.f286957c));
            return jSONObject;
        }
    }

    /* renamed from: f23.b$d */
    public static final class C97819d extends C97820e {
    }

    /* renamed from: f23.b$e */
    public static class C97820e extends C36327a {

        /* renamed from: a */
        public int f286958a;

        /* renamed from: b */
        public ArrayList<Integer> f286959b = new ArrayList<>();

        /* renamed from: c */
        public ArrayList<Long> f286960c = new ArrayList<>();

        /* renamed from: a */
        public JSONObject mo33258a() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", this.f286958a);
            JSONArray jSONArray = new JSONArray();
            for (Number intValue : this.f286959b) {
                jSONArray.put(intValue.intValue());
            }
            C13598b0 b0Var = C13598b0.f38549a;
            jSONObject.put("size", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (Number longValue : this.f286960c) {
                jSONArray2.put(longValue.longValue());
            }
            C13598b0 b0Var2 = C13598b0.f38549a;
            jSONObject.put("time", jSONArray2);
            return jSONObject;
        }
    }

    /* renamed from: f23.b$f */
    public static final class C97821f extends C97820e {

        /* renamed from: d */
        public float f286961d = 1.0f;

        /* renamed from: e */
        public int f286962e = 1;

        /* renamed from: f */
        public float f286963f = 1.0f;

        /* renamed from: g */
        public int f286964g;

        /* renamed from: h */
        public int f286965h;

        /* renamed from: i */
        public String f286966i = "";

        /* renamed from: j */
        public String f286967j = "";

        /* renamed from: k */
        public long f286968k;

        /* renamed from: l */
        public boolean f286969l;

        /* renamed from: a */
        public JSONObject mo33258a() {
            JSONObject a = super.mo33258a();
            float f = this.f286963f;
            if (!(f == 1.0f)) {
                a.put("playRate", Float.valueOf(f));
            }
            a.put("duration", this.f286968k);
            a.put(V2TXJSAdapterConstants.PUSHER_KEY_FPS, Float.valueOf(this.f286961d));
            a.put(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, this.f286962e);
            a.put("audioSampleRate", this.f286964g);
            a.put("audioBitrate", this.f286965h);
            a.put("videoMime", this.f286966i);
            a.put("audioMime", this.f286967j);
            a.put("useHdrTransfer", this.f286969l);
            return a;
        }
    }

    /* renamed from: a */
    public JSONObject mo33258a() {
        JSONObject jSONObject = new JSONObject();
        if (this.f286951d) {
            jSONObject.put("status", this.f286950c.mo33258a());
        }
        JSONArray jSONArray = new JSONArray();
        for (C97820e a : this.f286948a) {
            jSONArray.put(a.mo33258a());
        }
        jSONObject.put("mediaList", jSONArray);
        if (!this.f286949b.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            for (C97816a a2 : this.f286949b) {
                jSONArray2.put(a2.mo33258a());
            }
            jSONObject.put("editList", jSONArray2);
        }
        return jSONObject;
    }
}
