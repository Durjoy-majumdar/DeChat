package bj2;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.statecenter.BaseState;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import yb2.C66605h;

/* renamed from: bj2.l0 */
public final class C67278l0 extends C66605h<C67274k0> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67278l0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public BaseState mo85303g3() {
        C67274k0 k0Var = new C67274k0();
        String stringExtra = getIntent().getStringExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (stringExtra == null) {
            stringExtra = "RepairerSvgDemoUI";
        }
        k0Var.f193109d = stringExtra;
        return k0Var;
    }
}
