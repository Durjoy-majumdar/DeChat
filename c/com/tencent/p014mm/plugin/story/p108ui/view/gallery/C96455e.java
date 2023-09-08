package com.tencent.p014mm.plugin.story.p108ui.view.gallery;

import com.tencent.p014mm.autogen.events.OnlineVideoEvent;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import cw2.C97399u;
import fy3.C32224a;
import gw2.C98268m;
import gy3.C87412m;
import gy3.C87413o;
import kw2.C34078m;
import rx3.C13598b0;
import te3.bc4;

/* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.e */
public final class C96455e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ StoryVideoViewMgr f282202d;

    /* renamed from: e */
    public final /* synthetic */ OnlineVideoEvent f282203e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96455e(StoryVideoViewMgr storyVideoViewMgr, OnlineVideoEvent onlineVideoEvent) {
        super(0);
        this.f282202d = storyVideoViewMgr;
        this.f282203e = onlineVideoEvent;
    }

    public Object invoke() {
        C98268m mVar = this.f282202d.f282155f;
        int i = mVar != null ? mVar.f288090c : 0;
        String str = null;
        bc4 bc4 = mVar != null ? mVar.f288093f : null;
        if (i > 0 && bc4 != null) {
            String str2 = this.f282203e.f264965d.f264968c;
            C97399u uVar = C97399u.f285903a;
            if (C87412m.m108589b(str2, uVar.mo136667a(i, bc4.f297961f))) {
                String unused = this.f282202d.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(this.f282203e.f264965d.f264968c);
                sb.append(" video source changed, filePath:");
                StoryVideoView storyVideoView = this.f282202d.f282150a;
                sb.append(storyVideoView != null ? storyVideoView.getFilePath() : null);
                Log.m105924i("MicroMsg.Gallery.StoryVideoViewMgr", sb.toString());
                this.f282202d.mo134428f(false, true);
                StoryVideoView storyVideoView2 = this.f282202d.f282150a;
                if (storyVideoView2 != null) {
                    str = storyVideoView2.getFilePath();
                }
                C86013q1.m106447h(str);
                C98268m mVar2 = this.f282202d.f282155f;
                if (mVar2 != null) {
                    C34078m b = uVar.mo136668b(mVar2);
                    b.field_cacheSize = 0;
                    b.field_totalSize = 0;
                    StoryCore.f281736t.mo134193k().mo138677qq(b);
                }
                this.f282202d.mo134427e();
            }
        }
        return C13598b0.f38549a;
    }
}
