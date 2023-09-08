package zm2;

import android.graphics.Bitmap;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.plugin.setting.p102ui.setting.PreviewHdHeadImg;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C7624i3;
import f40.C86709a0;
import p196ln.C10579k;
import p196ln.C76706g;
import p196ln.C76708i;
import p220pr.C77288i;

/* renamed from: zm2.c */
public class C16305c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f43606d;

    public C16305c(Bitmap bitmap) {
        this.f43606d = bitmap;
    }

    public void run() {
        Log.m105919d("MicroMsg.SettingChangeAvatarHelp", "updateHeadImg hasUin:%b user:%s", Boolean.valueOf(C86709a0.m107522a()), C75592q0.m90789s());
        if (C86709a0.m107522a()) {
            if (this.f43606d != null) {
                C10579k RE = ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE();
                PreviewHdHeadImg.m83514H7(this.f43606d, ((AvatarStorage) RE).mo93558g(C75592q0.m90789s() + ".last", true, false));
            }
            C7624i3.f25910c.mo8754b(((C76708i) C86312j.m106911c(C76708i.class)).eg0(C75592q0.m90789s(), false, true));
            ((C77288i) C86312j.m106911c(C77288i.class)).ex0();
        }
    }
}
