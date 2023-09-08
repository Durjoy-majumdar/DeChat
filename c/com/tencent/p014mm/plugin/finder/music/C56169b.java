package com.tencent.p014mm.plugin.finder.music;

import fy3.C32224a;
import gy3.C87413o;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.music.b */
public final class C56169b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderFollowTopicHeaderView f160208d;

    /* renamed from: e */
    public final /* synthetic */ String f160209e;

    /* renamed from: f */
    public final /* synthetic */ boolean f160210f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56169b(FinderFollowTopicHeaderView finderFollowTopicHeaderView, String str, boolean z) {
        super(0);
        this.f160208d = finderFollowTopicHeaderView;
        this.f160209e = str;
        this.f160210f = z;
    }

    public Object invoke() {
        FinderFollowTopicHeaderView finderFollowTopicHeaderView = this.f160208d;
        String str = this.f160209e;
        if (str == null) {
            str = "";
        }
        finderFollowTopicHeaderView.setAudioPath(str);
        if (this.f160210f) {
            FinderFollowTopicHeaderView finderFollowTopicHeaderView2 = this.f160208d;
            finderFollowTopicHeaderView2.setDownloadFinish(finderFollowTopicHeaderView2.mo78347t(finderFollowTopicHeaderView2.getFilePath()));
        }
        C89779i0 dialog = this.f160208d.getDialog();
        boolean z = true;
        if (dialog == null || !dialog.isShowing()) {
            z = false;
        }
        if (z) {
            C89779i0 dialog2 = this.f160208d.getDialog();
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            this.f160208d.mo8540c();
        }
        return C13598b0.f38549a;
    }
}
