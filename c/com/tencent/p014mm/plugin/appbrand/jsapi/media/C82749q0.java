package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import a70.C112760b;
import android.content.Intent;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.GetSightParamsIPCTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseImage;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.util.HashMap;
import p140cw.C7136e;
import p232rw.C77572l;
import p232rw.C77574q;
import p232rw.C77575r;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66217g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.q0 */
public class C82749q0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JsApiChooseImage.C82653d f242075d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.q0$a */
    public class C82750a implements C15601d<C77575r> {
        public C82750a() {
        }

        public C66212f getContext() {
            return C66217g.f190253d;
        }

        public void resumeWith(Object obj) {
            if (obj instanceof C77575r) {
                C77575r rVar = (C77575r) obj;
                Intent intent = new Intent();
                intent.putExtra("key_new_sight_media_opt_code", rVar.f226148c);
                C77574q qVar = rVar.f226149d;
                intent.putExtra("key_new_sight_image_path", qVar != null ? qVar.f226143b : null);
                C82749q0.this.f242075d.mmOnActivityResult(4, rVar.f226147b, intent);
                C82749q0.this.f242075d.f241835h.add(Integer.valueOf(rVar.f226146a));
                return;
            }
            JsApiChooseImage.C82653d dVar = C82749q0.this.f242075d;
            JsApiChooseImage.ChooseResult chooseResult = dVar.f241832e;
            chooseResult.f241818d = 0;
            dVar.finishProcess(chooseResult);
        }
    }

    public C82749q0(JsApiChooseImage.C82653d dVar) {
        this.f242075d = dVar;
    }

    public void run() {
        Object b = XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new GetSightParamsIPCTask.TaskParams(2, 0, false), GetSightParamsIPCTask.class);
        C87412m.m108593f(b, "invokeSync(\n            …aramsIPCTask::class.java)");
        SightParams sightParams = (SightParams) b;
        sightParams.f248461r = false;
        sightParams.f248459p = false;
        sightParams.f248456j = C112760b.m154203K();
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_appbrand_use_mmrecordui, true);
        boolean z = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Media_AppbrandUseMMrecord_Int, 0) == 1;
        Log.m105925i("MicroMsg.JsApiChooseImage", "useMMRecordUI %b localConfigEnable:%b", Boolean.valueOf(wf), Boolean.valueOf(z));
        if (wf || z) {
            VideoTransPara videoTransPara = sightParams.f248452f;
            RecordConfigProvider e = RecordConfigProvider.m119435e(videoTransPara, videoTransPara.f267170h * 1000, 9);
            Boolean bool = Boolean.FALSE;
            e.f272932t = bool;
            e.f272934v = bool;
            e.f272937y = true;
            UICustomParam uICustomParam = new UICustomParam();
            ((HashMap) uICustomParam.f266575h).put("plugin_filter", Boolean.TRUE);
            ((HashMap) uICustomParam.f266575h).put("plugin_emoji", true);
            ((HashMap) uICustomParam.f266575h).put("plugin_text", true);
            ((HashMap) uICustomParam.f266575h).put("plugin_photo_crop", true);
            ((HashMap) uICustomParam.f266575h).put("plugin_doodle", true);
            e.f272927o = uICustomParam;
            e.f272912M.putBoolean("key_hide_operation", true);
            e.f272912M.putInt("key_camera_select", sightParams.f248451e);
            e.f272912M.putInt("key_sub_scene", 0);
            e.mo129804a(0, ((C7136e) C86312j.m106911c(C7136e.class)).nc0());
            ((C77572l) C86312j.m106911c(C77572l.class)).mo107612ZM(this.f242075d.getActivityContext(), e, new C82750a());
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(this.f242075d.getActivityContext(), "com.tencent.mm.plugin.mmsight.ui.SightCaptureUI");
        intent.putExtra("KEY_SIGHT_PARAMS", sightParams);
        this.f242075d.startActivityForResult(intent, 2);
    }
}
