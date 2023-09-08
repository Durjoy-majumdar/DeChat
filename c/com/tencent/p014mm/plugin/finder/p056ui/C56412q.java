package com.tencent.p014mm.plugin.finder.p056ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import da0.C58247e;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.ui.q */
public final class C56412q extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderAlbumUI f161265d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56412q(FinderAlbumUI finderAlbumUI) {
        super(1);
        this.f161265d = finderAlbumUI;
    }

    public Object invoke(Object obj) {
        ((Boolean) obj).booleanValue();
        Log.m105924i("Finder.AlbumUI", "get maas permission");
        FinderAlbumUI finderAlbumUI = this.f161265d;
        int i = FinderAlbumUI.f161014F1;
        finderAlbumUI.mo79072n8(false);
        ((C58247e) C86312j.m106911c(C58247e.class)).On0();
        return C13598b0.f38549a;
    }
}
