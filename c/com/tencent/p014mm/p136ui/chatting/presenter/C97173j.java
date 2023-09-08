package com.tencent.p014mm.p136ui.chatting.presenter;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.gallery.C97056h;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import dk3.C97483d;
import ob0.C117747y;

/* renamed from: com.tencent.mm.ui.chatting.presenter.j */
public class C97173j implements C72695v.C72701f {

    /* renamed from: a */
    public final /* synthetic */ C72963f4 f285142a;

    /* renamed from: b */
    public final /* synthetic */ MediaHistoryGalleryPresenter f285143b;

    /* renamed from: com.tencent.mm.ui.chatting.presenter.j$a */
    public class C97174a implements Runnable {
        public C97174a() {
        }

        public void run() {
            C97483d dVar = C97173j.this.f285143b.f285110d;
            if (dVar != null) {
                dVar.mo135858B6();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.j$b */
    public class C97175b implements Runnable {
        public C97175b() {
        }

        public void run() {
            C97483d dVar = C97173j.this.f285143b.f285110d;
            if (dVar != null) {
                dVar.mo135871u3(C0966R.string.f6o);
            }
        }
    }

    public C97173j(MediaHistoryGalleryPresenter mediaHistoryGalleryPresenter, C72963f4 f4Var) {
        this.f285143b = mediaHistoryGalleryPresenter;
        this.f285142a = f4Var;
    }

    /* renamed from: m */
    public void mo100168m(int i, int i2, C117747y yVar) {
        if (i == i2) {
            boolean z = true;
            Log.m105925i("MicroMsg.MediaHistoryGalleryPresenter", "[onSceneProgressEnd] MsgId:%s", Long.valueOf(this.f285142a.getMsgId()));
            MediaHistoryGalleryPresenter mediaHistoryGalleryPresenter = this.f285143b;
            mediaHistoryGalleryPresenter.f285119p--;
            if (!C97056h.m124957k(mediaHistoryGalleryPresenter.f285112f, this.f285142a, false)) {
                this.f285143b.f285121r = true;
            }
            MediaHistoryGalleryPresenter mediaHistoryGalleryPresenter2 = this.f285143b;
            if (mediaHistoryGalleryPresenter2.f285119p != 0) {
                z = false;
            }
            if (!z) {
                return;
            }
            if (!mediaHistoryGalleryPresenter2.f285121r) {
                mediaHistoryGalleryPresenter2.f285120q.post(new C97174a());
            } else {
                mediaHistoryGalleryPresenter2.f285120q.post(new C97175b());
            }
        }
    }
}
