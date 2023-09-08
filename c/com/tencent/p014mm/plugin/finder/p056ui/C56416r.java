package com.tencent.p014mm.plugin.finder.p056ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.ui.r */
public final class C56416r extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderAlbumUI f161279d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56416r(FinderAlbumUI finderAlbumUI) {
        super(1);
        this.f161279d = finderAlbumUI;
    }

    public Object invoke(Object obj) {
        ((Boolean) obj).booleanValue();
        Log.m105924i("Finder.AlbumUI", "do not get maas permission");
        FinderAlbumUI finderAlbumUI = this.f161279d;
        int i = FinderAlbumUI.f161014F1;
        finderAlbumUI.mo79072n8(true);
        return C13598b0.f38549a;
    }
}
