package com.tencent.p014mm.plugin.story.p108ui.view.gallery;

import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C31543z5;
import fy3.C32224a;
import gw2.C98266k;
import gw2.C98268m;
import gy3.C87412m;
import gy3.C87413o;
import kw2.C99268i;
import p823sg.C90193h;
import rx3.C13598b0;
import te3.cc4;
import z04.C119027c;

/* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.c */
public final class C96453c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ StoryGalleryView f282199d;

    /* renamed from: e */
    public final /* synthetic */ C98266k f282200e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96453c(StoryGalleryView storyGalleryView, C98266k kVar) {
        super(0);
        this.f282199d = storyGalleryView;
        this.f282200e = kVar;
    }

    public Object invoke() {
        StoryGalleryView storyGalleryView = this.f282199d;
        C98268m mVar = this.f282200e.f288082e;
        int i = StoryGalleryView.f282056Q0;
        storyGalleryView.getClass();
        if (!mVar.mo137567a()) {
            StoryCore.C96337h hVar = StoryCore.f281736t;
            C99268i Yt = hVar.mo134191i().mo138667Yt(mVar.f288088a);
            if (Yt != null) {
                Yt.field_localFlag &= -5;
                cc4 n2 = Yt.mo138655n2();
                n2.f131656e = 0;
                n2.f131657f = (long) C31543z5.m39455e();
                n2.f131659h = "";
                n2.f131660i = 3;
                byte[] bytes = (hVar.mo134187e() + "" + Util.currentTicks() + C31543z5.m39453c()).getBytes(C119027c.f356488a);
                C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                n2.f131655d = C90193h.m112878f(bytes);
                Yt.field_createTime = C31543z5.m39455e();
                byte[] byteArray = n2.toByteArray();
                C87412m.m108593f(byteArray, "postinfo.toByteArray()");
                Yt.field_postBuf = byteArray;
                hVar.mo134191i().mo138673mL((int) Yt.systemRowid, Yt);
            }
        }
        return C13598b0.f38549a;
    }
}
