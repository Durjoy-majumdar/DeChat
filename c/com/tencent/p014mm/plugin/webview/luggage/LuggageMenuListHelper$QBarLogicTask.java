package com.tencent.p014mm.plugin.webview.luggage;

import android.os.Bundle;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CancelRecogImageFileEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96874n1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.webview.luggage.LuggageMenuListHelper$QBarLogicTask */
class LuggageMenuListHelper$QBarLogicTask implements C80883e<Bundle, Bundle> {

    /* renamed from: d */
    public C1256g f117775d;

    /* renamed from: e */
    public Map<Long, String> f117776e;

    /* renamed from: f */
    public IListener f117777f = new IListener<RecogQBarOfImageFileResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = 812146647;
        }

        public boolean callback(IEvent iEvent) {
            RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = (RecogQBarOfImageFileResultEvent) iEvent;
            Log.m105918d("MicroMsg.QBarLogicTask", "mRecogResultListener");
            if (!(recogQBarOfImageFileResultEvent instanceof RecogQBarOfImageFileResultEvent)) {
                return false;
            }
            Map<Long, String> map = LuggageMenuListHelper$QBarLogicTask.this.f117776e;
            if (map != null) {
                recogQBarOfImageFileResultEvent.f265015d.getClass();
                if (!((HashMap) map).containsKey(0L)) {
                    return false;
                }
            }
            Map<Long, String> map2 = LuggageMenuListHelper$QBarLogicTask.this.f117776e;
            if (map2 != null) {
                recogQBarOfImageFileResultEvent.f265015d.getClass();
                ((HashMap) map2).remove(0L);
            }
            C96874n1 n1Var = C96874n1.f283849a;
            String d = n1Var.mo135195d(recogQBarOfImageFileResultEvent);
            int b = n1Var.mo135193b(recogQBarOfImageFileResultEvent);
            int c = n1Var.mo135194c(recogQBarOfImageFileResultEvent);
            Log.m105918d("MicroMsg.QBarLogicTask", "result: " + d);
            Bundle bundle = new Bundle();
            bundle.putString(XWalkReaderBasePlugin.PARAM_KEY_FILE_PATH, recogQBarOfImageFileResultEvent.f265015d.f265016a);
            bundle.putString("result", d);
            bundle.putInt("code_type", b);
            bundle.putInt("code_version", c);
            LuggageMenuListHelper$QBarLogicTask.this.f117775d.mo894a(bundle);
            return false;
        }
    };

    private LuggageMenuListHelper$QBarLogicTask() {
    }

    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        this.f117775d = gVar;
        int i = bundle.getInt("type");
        String string = bundle.getString("img_path");
        if (i == 1) {
            if (this.f117776e == null) {
                this.f117776e = new HashMap();
                this.f117777f.alive();
            }
            long currentTimeMillis = System.currentTimeMillis();
            RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new RecogQBarOfImageFileEvent();
            RecogQBarOfImageFileEvent.C40158a aVar = recogQBarOfImageFileEvent.f107731d;
            aVar.f107732a = currentTimeMillis;
            aVar.f107733b = string;
            recogQBarOfImageFileEvent.publish();
            ((HashMap) this.f117776e).put(Long.valueOf(currentTimeMillis), string);
        } else if (i == 2) {
            Map<Long, String> map = this.f117776e;
            if (map == null || !((HashMap) map).containsValue(string)) {
                Log.m105921e("MicroMsg.QBarLogicTask", "%s is not recognizing", string);
                return;
            }
            for (Long longValue : ((HashMap) this.f117776e).keySet()) {
                long longValue2 = longValue.longValue();
                if (((String) ((HashMap) this.f117776e).get(Long.valueOf(longValue2))).equals(string)) {
                    CancelRecogImageFileEvent cancelRecogImageFileEvent = new CancelRecogImageFileEvent();
                    CancelRecogImageFileEvent.C40046a aVar2 = cancelRecogImageFileEvent.f107390d;
                    aVar2.f107391a = longValue2;
                    aVar2.f107392b = (String) ((HashMap) this.f117776e).get(Long.valueOf(longValue2));
                    cancelRecogImageFileEvent.publish();
                    ((HashMap) this.f117776e).remove(Long.valueOf(longValue2));
                }
            }
        }
    }
}
