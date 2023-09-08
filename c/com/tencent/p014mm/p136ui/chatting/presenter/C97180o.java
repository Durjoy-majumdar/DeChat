package com.tencent.p014mm.p136ui.chatting.presenter;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.gallery.C97056h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72963f4;
import java.util.ArrayList;
import java.util.List;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.chatting.presenter.o */
public class C97180o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f285151d;

    /* renamed from: e */
    public final /* synthetic */ MediaHistoryGalleryPresenter f285152e;

    /* renamed from: com.tencent.mm.ui.chatting.presenter.o$a */
    public class C97181a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ List f285153d;

        public C97181a(List list) {
            this.f285153d = list;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f285153d.size() == 0) {
                Log.m105924i("MicroMsg.MediaHistoryGalleryPresenter", "handleSave size = 0");
                C97180o.this.f285152e.f285110d.mo135863O();
                return;
            }
            MediaHistoryGalleryPresenter mediaHistoryGalleryPresenter = C97180o.this.f285152e;
            List list = this.f285153d;
            mediaHistoryGalleryPresenter.f285110d.mo135867h6();
            ThreadPool.post(new C97168i(mediaHistoryGalleryPresenter, list), "handleSave");
        }
    }

    public C97180o(MediaHistoryGalleryPresenter mediaHistoryGalleryPresenter, List list) {
        this.f285152e = mediaHistoryGalleryPresenter;
        this.f285151d = list;
    }

    public void run() {
        MediaHistoryGalleryPresenter mediaHistoryGalleryPresenter = this.f285152e;
        List<C72963f4> list = this.f285151d;
        mediaHistoryGalleryPresenter.getClass();
        ArrayList arrayList = new ArrayList();
        for (C72963f4 f4Var : list) {
            if (!C97056h.m124954I(f4Var) && !C97056h.m124951E(f4Var)) {
                if (!(f4Var == null ? false : f4Var.mo100983V3())) {
                    arrayList.add(f4Var);
                }
            }
        }
        if (arrayList.size() != this.f285151d.size()) {
            C76879j.m92743n(this.f285152e.f285112f, C0966R.string.f67, C0966R.string.a3h, new C97181a(arrayList), (DialogInterface.OnClickListener) null);
            return;
        }
        MediaHistoryGalleryPresenter mediaHistoryGalleryPresenter2 = this.f285152e;
        mediaHistoryGalleryPresenter2.f285110d.mo135867h6();
        ThreadPool.post(new C97168i(mediaHistoryGalleryPresenter2, arrayList), "handleSave");
    }
}
