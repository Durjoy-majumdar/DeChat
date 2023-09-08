package p822sa;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: sa.o */
public class C48318o {

    /* renamed from: a */
    public C48319p f129375a;

    /* renamed from: b */
    public MMHandler f129376b = new MMHandler("Js2JavaAsyncHandler_" + this.f129375a.hashCode());

    public C48318o(C48319p pVar) {
        this.f129375a = pVar;
    }

    /* renamed from: a */
    public final String mo73015a(String str, boolean z) {
        C48316m mVar;
        C48306c cVar = null;
        try {
            mVar = new C48316m(new JSONObject(str));
        } catch (Exception e) {
            Log.m105921e("Js2JavaMessageQueue", "Message parse failed, ex = %s", e.getMessage());
            mVar = null;
        }
        if (mVar == null) {
            return "";
        }
        Log.m105925i("Js2JavaMessageQueue", "processImpl, jsMsg.type = %s", mVar.f129355a.name());
        int ordinal = mVar.f129355a.ordinal();
        if (ordinal == 1) {
            C48309f fVar = this.f129375a.f129379c;
            synchronized (fVar) {
                Log.m105924i("Java2JsMessageQueue", "ready");
                fVar.f129362c = true;
                Iterator<C48308e> it = fVar.f129361b.iterator();
                while (it.hasNext()) {
                    fVar.f129360a.evaluateJavascript(String.format("if(typeof luggageBridge !== 'undefined') luggageBridge._processMessageFromJava(%s);", new Object[]{it.next().toString()}), (ValueCallback<String>) null);
                }
                fVar.f129361b.clear();
            }
        } else if (ordinal == 2) {
            C48319p pVar = this.f129375a;
            pVar.getClass();
            try {
                C48314k kVar = new C48314k(pVar.f129379c, mVar, z);
                C48315l lVar = pVar.f129381e.get(kVar.f129367b);
                if (lVar != null) {
                    lVar.mo73013a(kVar);
                } else {
                    Log.m105921e("LuggageBridge", "Invoke Listener Not Found: %s", kVar.f129367b);
                    kVar.mo73012a("system:function_not_exist", (JSONObject) null);
                }
                if (kVar.f129369d) {
                    cVar = new C48306c(kVar.f129370e, kVar.f129371f, kVar.f129372g, false);
                }
            } catch (JSONException e2) {
                Log.m105921e("LuggageBridge", "inflate Js2JavaInvokeContext failed: %s", e2);
            }
        } else if (ordinal == 3) {
            C48319p pVar2 = this.f129375a;
            pVar2.getClass();
            try {
                C48310g gVar = new C48310g(mVar);
                C48311h hVar = pVar2.f129383g.get(Integer.valueOf(gVar.f129363a));
                if (hVar == null) {
                    Log.m105921e("LuggageBridge", "no listener for callback: %d", Integer.valueOf(gVar.f129363a));
                } else {
                    if (!gVar.f129364b) {
                        pVar2.f129383g.remove(Integer.valueOf(gVar.f129363a));
                    }
                    hVar.mo73010a(gVar);
                }
            } catch (JSONException e3) {
                Log.m105921e("LuggageBridge", "inflate Js2JavaEventContext failed: %s", e3);
            }
        } else if (ordinal == 4) {
            C48319p pVar3 = this.f129375a;
            pVar3.getClass();
            try {
                C48312i iVar = new C48312i(mVar);
                Log.m105925i("LuggageBridge", "processEventFromJs, EventName = %s", iVar.f129365a);
                C48313j jVar = pVar3.f129382f.get(iVar.f129365a);
                if (jVar == null) {
                    Log.m105921e("LuggageBridge", "no listener for event: %s", iVar.f129365a);
                } else {
                    jVar.mo73011a(iVar);
                }
            } catch (JSONException e4) {
                Log.m105921e("LuggageBridge", "inflate Js2JavaEventContext failed: %s", e4);
            }
        }
        Object[] objArr = new Object[1];
        objArr[0] = cVar == null ? "null" : cVar.f129355a.name();
        Log.m105927v("Js2JavaMessageQueue", "processImpl, javaMsg.type = %s", objArr);
        return cVar == null ? "" : cVar.toString();
    }
}
