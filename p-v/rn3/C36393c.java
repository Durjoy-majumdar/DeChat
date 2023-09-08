package rn3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import jv1.C76450b;
import oa1.C117731d;
import p240sx.C13796o;
import sn3.C77741d;
import sn3.C77745g;
import tf3.C37070l;
import tf3.C37071m;
import yb2.C79062b;

@C86522b
/* renamed from: rn3.c */
public final class C36393c extends C86301e implements C76450b {
    /* renamed from: HY */
    public Intent mo60659HY(AppCompatActivity appCompatActivity, String str) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105924i("MicroMsg.ForwardFeatureService", "createForwardTextIntent() called with: activity = " + appCompatActivity + ", msgContent = " + str);
        Intent nz = ((C13796o) C86312j.m106911c(C13796o.class)).mo13159nz(appCompatActivity);
        C79062b.m95631b(nz, C77741d.class);
        nz.putExtra("KEY_MSG_CONTENT", str);
        return nz;
    }

    /* renamed from: Wo */
    public boolean mo60660Wo() {
        return C117731d.m166007c().mo182440a(new C37071m()) == 1;
    }

    /* renamed from: h */
    public Intent mo60661h(AppCompatActivity appCompatActivity, String str, String str2, int i, String str3) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str3, "forwardSourceId");
        Log.m105924i("MicroMsg.ForwardFeatureService", "createForwardVideoIntent() called with: activity = " + appCompatActivity + ", videoPath = " + str + ", thumbPath = " + str2 + ", duration = " + i);
        Intent nz = ((C13796o) C86312j.m106911c(C13796o.class)).mo13159nz(appCompatActivity);
        C79062b.m95631b(nz, C77745g.class);
        nz.putExtra("KEY_VIDEO_PATH", str);
        nz.putExtra("KEY_THUMB_PATH", str2);
        nz.putExtra("KEY_DURATION", i);
        nz.putExtra("KEY_FORWARD_SOURCE_ID", str3);
        return nz;
    }

    /* renamed from: mb */
    public boolean mo60662mb() {
        return C117731d.m166007c().mo182440a(new C37070l()) == 1;
    }
}
