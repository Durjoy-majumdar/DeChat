package com.tencent.p014mm.wallet_core.model;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import nj3.C76879j;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C48754ar3;
import te3.C77935gl2;

/* renamed from: com.tencent.mm.wallet_core.model.p */
public class C75129p {

    /* renamed from: com.tencent.mm.wallet_core.model.p$a */
    public class C75130a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f221060d;

        /* renamed from: e */
        public final /* synthetic */ C48754ar3 f221061e;

        /* renamed from: f */
        public final /* synthetic */ Object f221062f;

        /* renamed from: g */
        public final /* synthetic */ C75132c f221063g;

        public C75130a(Context context, C48754ar3 ar32, Object obj, C75132c cVar) {
            this.f221060d = context;
            this.f221061e = ar32;
            this.f221062f = obj;
            this.f221063g = cVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.JumpItemUtil", "showRemindWin() ok click!");
            C75129p.m90108c(this.f221060d, this.f221061e.f130744e, this.f221062f, this.f221063g);
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.model.p$b */
    public class C75131b implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.JumpItemUtil", "showRemindWin() cancel click!");
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.model.p$c */
    public interface C75132c<InputType> {
        /* renamed from: a */
        void mo97225a(InputType inputtype);

        /* renamed from: c */
        void mo6028c(InputType inputtype);

        /* renamed from: d */
        void mo6029d(InputType inputtype);

        /* renamed from: e */
        int mo6030e();

        /* renamed from: f */
        void mo97200f(InputType inputtype);

        /* renamed from: g */
        void mo6031g(InputType inputtype);
    }

    /* renamed from: a */
    public static C77935gl2 m90106a(JSONObject jSONObject) {
        if (jSONObject == null) {
            Log.m105928w("MicroMsg.JumpItemUtil", "createFromJSONObject() jsonObject == null");
            return null;
        }
        C77935gl2 gl22 = new C77935gl2();
        gl22.f227478d = jSONObject.optString("wording");
        gl22.f227479e = jSONObject.optInt("action");
        gl22.f227480f = jSONObject.optString("url");
        gl22.f227481g = jSONObject.optString("username");
        gl22.f227482h = jSONObject.optString("pagepath");
        return gl22;
    }

    /* renamed from: b */
    public static JSONObject m90107b(C77935gl2 gl22) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("wording", gl22.f227478d);
            jSONObject.put("action", gl22.f227479e);
            jSONObject.put("url", gl22.f227480f);
            jSONObject.put("username", gl22.f227481g);
            jSONObject.put("pagepath", gl22.f227482h);
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.JumpItemUtil", "getJSONObject() Exception: %s", e.getMessage());
        }
        return jSONObject;
    }

    /* renamed from: c */
    public static <InputType> void m90108c(Context context, C77935gl2 gl22, InputType inputtype, C75132c<InputType> cVar) {
        Object[] objArr = new Object[2];
        String str = "null";
        objArr[0] = gl22 == null ? m90110e(gl22) : str;
        if (cVar != null) {
            str = "no null";
        }
        objArr[1] = str;
        Log.m105925i("MicroMsg.JumpItemUtil", "handleAction() jumpItem:%s iJumpItemCallback:%s", objArr);
        if (gl22 != null) {
            int i = gl22.f227479e;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            Intent intent = new Intent();
                            intent.putExtra("rawUrl", gl22.f227480f);
                            C75228t.m90217J(context, intent);
                        } else if (i == 4) {
                            try {
                                StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                                StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
                                aVar.f9526a = gl22.f227481g;
                                aVar.f9527b = gl22.f227482h;
                                if (cVar != null) {
                                    aVar.f9529d = cVar.mo6030e();
                                } else {
                                    aVar.f9529d = 1000;
                                }
                                StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
                                aVar2.f9528c = 0;
                                aVar2.f9531f = context;
                                startAppBrandUIFromOuterEvent.publish();
                            } catch (Exception e) {
                                Log.m105921e("MicroMsg.JumpItemUtil", "handleAction() Exception: %s", e.getMessage());
                            }
                        } else if (i == 5 && cVar != null) {
                            cVar.mo6029d(inputtype);
                        }
                    } else if (cVar != null) {
                        cVar.mo97200f(inputtype);
                    }
                } else if (cVar != null) {
                    cVar.mo6028c(inputtype);
                }
            } else if (cVar != null) {
                cVar.mo6031g(inputtype);
            }
            if (cVar != null) {
                cVar.mo97225a(inputtype);
            }
        }
    }

    /* renamed from: d */
    public static <InputType> void m90109d(Context context, C48754ar3 ar32, InputType inputtype, C75132c<InputType> cVar) {
        if (ar32 == null) {
            Log.m105924i("MicroMsg.JumpItemUtil", "showRemindWin() remindWin == null");
            return;
        }
        C76879j.m92709C(context, ar32.f130743d, "", ar32.f130744e.f227478d, context.getString(C0966R.string.f7926wf), false, new C75130a(context, ar32, inputtype, cVar), new C75131b()).show();
    }

    /* renamed from: e */
    public static String m90110e(C77935gl2 gl22) {
        if (gl22 == null) {
            return "JumpItem{null}";
        }
        return "JumpItem{wording='" + gl22.f227478d + '\'' + ", action=" + gl22.f227479e + ", url='" + gl22.f227480f + '\'' + ", username='" + gl22.f227481g + '\'' + ", pagepath='" + gl22.f227482h + '\'' + '}';
    }
}
