package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82739n;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import di3.C86312j;
import h81.C32735h;
import hp3.C87581a;
import lp3.C46888b;
import lp3.C88643g;
import p140cw.C7136e;
import p225rc.C89916g;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.x */
public final class C82775x<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C82777y f242122a;

    public C82775x(C82777y yVar) {
        this.f242122a = yVar;
    }

    public Object call(Object obj) {
        SightParams sightParams = (SightParams) obj;
        C46888b c = C88643g.m110545c();
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_appbrand_use_mmrecordui, true);
        boolean z = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Media_AppbrandUseMMrecord_Int, 0) == 1;
        Log.m105925i("MicroMsg.AppBrand.ChooseMediaWorkFlow", "useMMRecordUI %b localConfigEnable:%b", Boolean.valueOf(wf), Boolean.valueOf(z));
        if (wf || z) {
            VideoTransPara videoTransPara = sightParams.f248452f;
            RecordConfigProvider e = RecordConfigProvider.m119435e(videoTransPara, videoTransPara.f267170h * 1000, 9);
            e.f272932t = Boolean.TRUE;
            Boolean bool = Boolean.FALSE;
            e.f272931s = bool;
            e.f272934v = bool;
            e.f272937y = true;
            Bundle bundle = e.f272912M;
            bundle.putBoolean("key_show_top_countdown_cover", sightParams.f248462s);
            bundle.putBoolean("key_hide_operation", true);
            bundle.putInt("key_sub_scene", 1);
            bundle.putInt("key_camera_select", sightParams.f248451e);
            bundle.putInt("key_record_bitrate_ratio", 1);
            UICustomParam.C92617b bVar = new UICustomParam.C92617b();
            bVar.mo126647a(true);
            bVar.mo126652f(true);
            bVar.mo126650d(true);
            bVar.mo126654h(true);
            bVar.mo126651e(true);
            bVar.mo126649c(true);
            e.f272927o = bVar.f266587a;
            e.mo129804a(2, "com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout");
            e.mo129804a(0, ((C7136e) C86312j.m106911c(C7136e.class)).nc0());
            Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(this.f242122a.f242124a.getContext());
            if (castActivityOrNull == null) {
                Log.m105920e("MicroMsg.AppBrand.ChooseMediaWorkFlow", "step:goSightCaptureUI context !is activity");
                C82739n.C82741b bVar2 = new C82739n.C82741b("fail:internal error invalid android context");
                c.mo72093c(bVar2);
                return bVar2;
            } else if (!(castActivityOrNull instanceof ComponentActivity)) {
                Log.m105920e("MicroMsg.AppBrand.ChooseMediaWorkFlow", "step:goSightCaptureUI context !is activity");
                C82739n.C82741b bVar3 = new C82739n.C82741b("fail:internal error invalid android context");
                c.mo72093c(bVar3);
                return bVar3;
            } else {
                C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C82770v(castActivityOrNull, e, c, (C15601d<? super C82770v>) null), 3, (Object) null);
                return C82739n.C82740a.f242060a;
            }
        } else {
            Intent intent = new Intent();
            intent.setClassName(this.f242122a.f242124a.getContext(), "com.tencent.mm.plugin.mmsight.ui.SightCaptureUI");
            intent.putExtra("KEY_SIGHT_PARAMS", sightParams);
            Activity castActivityOrNull2 = AndroidContextUtil.castActivityOrNull(this.f242122a.f242124a.getContext());
            if (castActivityOrNull2 == null) {
                Log.m105920e("MicroMsg.AppBrand.ChooseMediaWorkFlow", "step:goSightCaptureUI context !is activity");
                C82739n.C82741b bVar4 = new C82739n.C82741b("fail:internal error invalid android context");
                c.mo72093c(bVar4);
                return bVar4;
            }
            C89916g.m112446a(castActivityOrNull2).mo124236j(intent, new C82773w(c));
            castActivityOrNull2.overridePendingTransition(C0966R.C0968anim.f2492eg, -1);
            return C82739n.C82740a.f242060a;
        }
    }
}
