package com.tencent.p014mm.p136ui.chatting.presenter;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.ui.chatting.presenter.h */
public class C97167h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MediaHistoryGalleryPresenter f285135d;

    public C97167h(MediaHistoryGalleryPresenter mediaHistoryGalleryPresenter) {
        this.f285135d = mediaHistoryGalleryPresenter;
    }

    public void run() {
        Context context = this.f285135d.f285112f;
        C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.ial), 1).show();
    }
}
