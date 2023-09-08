package com.tencent.p014mm.plugin.finder.viewmodel.component;

import cm1.C55015f1;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32226l;
import gr1.C59670o2;
import gr1.C59673q2;
import gy3.C87412m;
import gy3.C87413o;
import wp1.C66167g;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.r */
public final class C56745r extends C87413o implements C32226l<C59670o2, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ String f162650d;

    /* renamed from: e */
    public final /* synthetic */ FinderVideoRecycler f162651e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56745r(String str, FinderVideoRecycler finderVideoRecycler) {
        super(1);
        this.f162650d = str;
        this.f162651e = finderVideoRecycler;
    }

    public Object invoke(Object obj) {
        C59670o2 o2Var = (C59670o2) obj;
        C87412m.m108594g(o2Var, LocaleUtil.ITALIAN);
        C59673q2 videoMediaInfo = o2Var.getVideoMediaInfo();
        String str = null;
        if (C87412m.m108589b(videoMediaInfo != null ? videoMediaInfo.f170493c : null, this.f162650d) && o2Var.getVideoViewFocused() && (o2Var.getParentView() instanceof FinderVideoLayout)) {
            Log.m105928w("Finder.VideoRecycler", "[videoSourceChange] mediaId=" + this.f162650d + " isPlaying...");
            C59673q2 videoMediaInfo2 = o2Var.getVideoMediaInfo();
            if (videoMediaInfo2 != null) {
                str = videoMediaInfo2.f170492b;
            }
            C86013q1.m106447h(str);
            C66167g gVar = C66167g.f190173a;
            String str2 = this.f162650d;
            C87412m.m108593f(str2, "mediaId");
            C55015f1 c = gVar.mo90234c(str2, false);
            c.field_cacheSize = 0;
            c.field_totalSize = 0;
            c.field_hasPlayed = false;
            c.field_reqFormat = 0;
            c.field_fileFormat = "";
            c.field_state = 0;
            c.field_moovReady = false;
            c.field_audioBitrate = 0;
            c.field_videoBitrate = 0;
            c.field_frameRate = 0;
            c.field_netProfile = "";
            gVar.mo90236f(c, "onlineVideoEventListener");
            this.f162651e.f162528h.post(new C56744q(o2Var));
        }
        return Boolean.FALSE;
    }
}
