package com.tencent.p014mm.plugin.finder.music;

import fy3.C32224a;
import gy3.C87413o;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.music.a */
public final class C56168a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderFollowTopicHeaderView f160205d;

    /* renamed from: e */
    public final /* synthetic */ String f160206e;

    /* renamed from: f */
    public final /* synthetic */ boolean f160207f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56168a(FinderFollowTopicHeaderView finderFollowTopicHeaderView, String str, boolean z) {
        super(0);
        this.f160205d = finderFollowTopicHeaderView;
        this.f160206e = str;
        this.f160207f = z;
    }

    public Object invoke() {
        FinderFollowTopicHeaderView finderFollowTopicHeaderView = this.f160205d;
        String str = this.f160206e;
        if (str == null) {
            str = "";
        }
        finderFollowTopicHeaderView.setFilePath(str);
        if (this.f160207f) {
            FinderFollowTopicHeaderView finderFollowTopicHeaderView2 = this.f160205d;
            finderFollowTopicHeaderView2.setDownloadFinish(finderFollowTopicHeaderView2.mo78347t(finderFollowTopicHeaderView2.getFilePath()));
        }
        C89779i0 dialog = this.f160205d.getDialog();
        boolean z = true;
        if (dialog == null || !dialog.isShowing()) {
            z = false;
        }
        if (z) {
            C89779i0 dialog2 = this.f160205d.getDialog();
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            this.f160205d.mo8540c();
        }
        return C13598b0.f38549a;
    }
}
