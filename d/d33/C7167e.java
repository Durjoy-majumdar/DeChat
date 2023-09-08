package d33;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.vlog.p117ui.video.VideoCompositionRemuxUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p273xw.C15905b;

@C86522b
/* renamed from: d33.e */
public final class C7167e extends C86301e implements C15905b {

    /* renamed from: d */
    public final String f25141d = "MicroMsg.VideoJumperApiImpl";

    /* renamed from: pX */
    public void mo8351pX(Activity activity, int i, RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(recordConfigProvider, "configProvider");
        Log.m105924i(this.f25141d, "jumpVideoCompositionRemuxUI");
        Intent intent = new Intent(activity, VideoCompositionRemuxUI.class);
        intent.putExtra("KEY_PARAMS_CONFIG", recordConfigProvider);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/video/remux/api_Impl/VideoJumperApiImpl", "jumpVideoCompositionRemuxUI", "(Landroid/app/Activity;ILcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
