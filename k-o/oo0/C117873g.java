package oo0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import ol0.C117791a;
import ol0.C117844w;
import org.json.JSONException;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: oo0.g */
public class C117873g implements C118080q.C118111x {

    /* renamed from: a */
    public AtomicBoolean f352391a = new AtomicBoolean(false);

    /* renamed from: b */
    public float f352392b;

    /* renamed from: c */
    public JSONObject f352393c = new JSONObject();

    /* renamed from: d */
    public C117844w.C117863s f352394d = new C117844w.C117863s();

    /* renamed from: e */
    public final /* synthetic */ int f352395e;

    /* renamed from: f */
    public final /* synthetic */ C82381f f352396f;

    /* renamed from: g */
    public final /* synthetic */ C118080q f352397g;

    public C117873g(C89248j jVar, int i, C82381f fVar, C118080q qVar) {
        this.f352395e = i;
        this.f352396f = fVar;
        this.f352397g = qVar;
    }

    /* renamed from: a */
    public void mo182592a(C118080q.C118081a aVar, boolean z) {
        if (this.f352391a.compareAndSet(true, false)) {
            try {
                this.f352393c.remove("mapId");
                this.f352393c.put("mapId", this.f352395e);
                this.f352393c.remove("type");
                this.f352393c.put("type", "end");
                this.f352393c.remove("causedBy");
                boolean z2 = aVar.f352975a != this.f352392b;
                if (!z) {
                    this.f352393c.put("causedBy", "update");
                } else if (z2) {
                    this.f352393c.put("causedBy", "scale");
                } else {
                    this.f352393c.put("causedBy", "drag");
                }
                this.f352393c.remove(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION);
                this.f352393c.put(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, (double) aVar.f352976b);
                this.f352393c.remove("skew");
                this.f352393c.put("skew", (double) aVar.f352977c);
                this.f352393c.remove("scale");
                this.f352393c.put("scale", (double) this.f352397g.getZoom());
                C117791a.m166201b(this.f352397g, this.f352393c);
                C117791a.m166200a(this.f352397g, this.f352393c);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e);
            }
            this.f352394d.f242407f = this.f352393c.toString();
            this.f352396f.mo109669n(this.f352394d, (int[]) null);
            Log.m105927v("MicroMsg.JsApiInsertXWebMap", "onCameraChange finish, result:%s", this.f352393c.toString());
        }
    }

    /* renamed from: b */
    public void mo182593b(C118080q.C118081a aVar, boolean z) {
        if (this.f352391a.compareAndSet(false, true)) {
            try {
                this.f352393c.remove("mapId");
                this.f352393c.put("mapId", this.f352395e);
                this.f352393c.remove("type");
                this.f352393c.put("type", "begin");
                if (z) {
                    this.f352393c.put("causedBy", "gesture");
                } else {
                    this.f352393c.put("causedBy", "update");
                }
                this.f352393c.remove(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION);
                this.f352393c.remove("skew");
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e);
            }
            this.f352394d.f242407f = this.f352393c.toString();
            this.f352396f.mo109669n(this.f352394d, (int[]) null);
            this.f352392b = aVar.f352975a;
            Log.m105926v("MicroMsg.JsApiInsertXWebMap", "onCameraChange begin");
        }
    }
}
