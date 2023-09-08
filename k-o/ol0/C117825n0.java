package ol0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.n0 */
public class C117825n0 extends C117793b {
    public static final int CTRL_INDEX = 200;
    public static final String NAME = "translateMapMarker";

    /* renamed from: g */
    public List<Runnable> f352334g = new ArrayList();

    /* renamed from: h */
    public AtomicBoolean f352335h = new AtomicBoolean(false);

    /* renamed from: ol0.n0$a */
    public class C117826a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82381f f352336d;

        /* renamed from: e */
        public final /* synthetic */ JSONObject f352337e;

        /* renamed from: f */
        public final /* synthetic */ int f352338f;

        public C117826a(C82381f fVar, JSONObject jSONObject, int i) {
            this.f352336d = fVar;
            this.f352337e = jSONObject;
            this.f352338f = i;
        }

        public void run() {
            String str;
            String str2;
            C117825n0 n0Var = C117825n0.this;
            C82381f fVar = this.f352336d;
            JSONObject jSONObject = this.f352337e;
            int i = this.f352338f;
            n0Var.f352335h.set(true);
            int i2 = 0;
            if (jSONObject == null) {
                Log.m105920e("MicroMsg.JsApiTranslateMapMarker", "data is invalid, err");
                n0Var.mo182580A(fVar, i, "fail:invalid data", false);
                return;
            }
            Log.m105919d("MicroMsg.JsApiTranslateMapMarker", "data:%s", jSONObject.toString());
            C118080q y = n0Var.mo182577y(fVar, jSONObject);
            String str3 = "fail:internal error %s";
            if (y == null) {
                Log.m105920e("MicroMsg.JsApiTranslateMapMarker", "mapView is null, return");
                n0Var.mo182580A(fVar, i, String.format(str3, new Object[]{"mapview is null"}), false);
                return;
            }
            String optString = jSONObject.optString("markerId");
            try {
                JSONArray jSONArray = new JSONArray(jSONObject.optString("keyFrames"));
                LinkedList linkedList = new LinkedList();
                Log.m105919d("MicroMsg.JsApiTranslateMapMarker", "keyFramesArray size :%d", Integer.valueOf(jSONArray.length()));
                int i3 = 0;
                while (i3 < jSONArray.length()) {
                    JSONObject jSONObject2 = (JSONObject) jSONArray.get(i3);
                    C118080q.C118092i iVar = new C118080q.C118092i();
                    int optInt = jSONObject2.optInt("duration", i2);
                    iVar.f353021f = optInt;
                    if (optInt == 0) {
                        Log.m105920e("MicroMsg.JsApiTranslateMapMarker", "keyFrame.duration is zero, err continue");
                        str = str3;
                        str2 = optString;
                    } else {
                        str = str3;
                        str2 = optString;
                        try {
                            iVar.f353020e = (float) jSONObject2.optDouble(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, 0.0d);
                            String optString2 = jSONObject2.optString("latitude");
                            if (!Util.isNullOrNil(optString2)) {
                                iVar.f353019d = Util.getDouble(optString2, 0.0d);
                            }
                            String optString3 = jSONObject2.optString("longitude");
                            if (!Util.isNullOrNil(optString3)) {
                                iVar.f353018c = Util.getDouble(optString3, 0.0d);
                            }
                            linkedList.add(iVar);
                        } catch (JSONException e) {
                            e = e;
                            Log.m105921e("MicroMsg.JsApiTranslateMapMarker", "parse keyFrames error, exception : %s", e);
                            n0Var.mo182580A(fVar, i, String.format(str, new Object[]{"parse json fail"}), y.mo182849h());
                        }
                    }
                    i3++;
                    str3 = str;
                    optString = str2;
                    i2 = 0;
                }
                String str4 = str3;
                y.mo182891z(optString, linkedList, new C117828o0(n0Var, fVar, i, y));
            } catch (JSONException e2) {
                e = e2;
                str = str3;
                Log.m105921e("MicroMsg.JsApiTranslateMapMarker", "parse keyFrames error, exception : %s", e);
                n0Var.mo182580A(fVar, i, String.format(str, new Object[]{"parse json fail"}), y.mo182849h());
            }
        }
    }

    /* renamed from: A */
    public final void mo182580A(C82381f fVar, int i, String str, boolean z) {
        mo182575w(fVar, i, mo115109j(str), str.equals("ok"), z);
        this.f352335h.set(false);
        mo182581z();
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        super.mo1505u(fVar, jSONObject, i);
        ((ArrayList) this.f352334g).add(new C117826a(fVar, jSONObject, i));
        mo182581z();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        return;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo182581z() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f352335h     // Catch:{ all -> 0x002d }
            boolean r0 = r0.get()     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r2)
            return
        L_0x000b:
            java.util.List<java.lang.Runnable> r0 = r2.f352334g     // Catch:{ all -> 0x002d }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x002d }
            int r0 = r0.size()     // Catch:{ all -> 0x002d }
            if (r0 != 0) goto L_0x0017
            monitor-exit(r2)
            return
        L_0x0017:
            java.util.List<java.lang.Runnable> r0 = r2.f352334g     // Catch:{ all -> 0x002d }
            r1 = 0
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.remove(r1)     // Catch:{ all -> 0x002d }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x002b
            js0.r$a r1 = js0.C88024r.m109571a()     // Catch:{ all -> 0x002d }
            r1.postToWorker(r0)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r2)
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ol0.C117825n0.mo182581z():void");
    }
}
