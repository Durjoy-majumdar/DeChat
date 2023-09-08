package com.tencent.p014mm.plugin.finder.p056ui;

import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import di3.C86312j;
import eb0.C31543z5;
import qo1.C63291f;
import qo3.w$$d;

/* renamed from: com.tencent.mm.plugin.finder.ui.v */
public final class C56433v implements w$$d {

    /* renamed from: a */
    public final /* synthetic */ FinderAlbumUI f161298a;

    public C56433v(FinderAlbumUI finderAlbumUI) {
        this.f161298a = finderAlbumUI;
    }

    public final void onDismiss() {
        String str;
        String str2;
        Class cls = C63291f.class;
        FinderAlbumUI finderAlbumUI = this.f161298a;
        if (finderAlbumUI.f161016B1) {
            finderAlbumUI.f161016B1 = false;
            return;
        }
        FinderFeedReportObject Dc = ((C63291f) C86312j.m106911c(cls)).mo83237Dc();
        String str3 = "";
        if (Dc == null || (str = Dc.clickId) == null) {
            str = str3;
        }
        FinderFeedReportObject Dc2 = ((C63291f) C86312j.m106911c(cls)).mo83237Dc();
        if (!(Dc2 == null || (str2 = Dc2.postId) == null)) {
            str3 = str2;
        }
        finderAlbumUI.mo79073o8(str, str3, 2, C31543z5.m39453c() / 1000, 3);
    }
}
