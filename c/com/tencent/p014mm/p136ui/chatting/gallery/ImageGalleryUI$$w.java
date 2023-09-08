package com.tencent.p014mm.p136ui.chatting.gallery;

import c00.C0405n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C75569c4;
import ke3.C88144b;
import nj3.C11182m0;
import nj3.C76874e0;
import u73.C101980n;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$w */
public class ImageGalleryUI$$w implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f284550d;

    /* renamed from: e */
    public final /* synthetic */ ImageGalleryUI f284551e;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$w$a */
    public class C97027a implements Runnable {
        public C97027a() {
        }

        public void run() {
            ImageGalleryUI$$w.this.f284551e.f284404V1.mo137417c(1, 2);
        }
    }

    public ImageGalleryUI$$w(ImageGalleryUI imageGalleryUI, C72963f4 f4Var) {
        this.f284551e = imageGalleryUI;
        this.f284550d = f4Var;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        C72963f4 f4Var;
        e0Var.clear();
        if (!C75569c4.m90671d(this.f284550d)) {
            if (!C75569c4.m90688u(this.f284550d) && !C75569c4.m90692y(this.f284550d)) {
                e0Var.mo107146h(0, this.f284551e.getString(C0966R.string.i4e), C0966R.raw.icons_filled_share, this.f284551e.getResources().getColor(C0966R.color.f2939n));
                C72963f4 f4Var2 = this.f284550d;
                if (f4Var2 != null && f4Var2.mo100983V3() && C44625c2.m49076i()) {
                    e0Var.mo107146h(10, this.f284551e.getString(C0966R.string.hrf), C0966R.raw.bottomsheet_icon_moment, 0);
                }
            }
            C88144b.m109788f("favorite");
            e0Var.mo107146h(2, this.f284551e.getString(C0966R.string.f361137hk2), C0966R.raw.bottomsheet_icon_fav, 0);
            if (((C101980n) C86312j.m106911c(C101980n.class)).mo134693tB() && C97056h.m124953H(this.f284550d) && !((C0405n) C86312j.m106911c(C0405n.class)).mo279e() && (f4Var = this.f284550d) != null && !f4Var.mo101016t3()) {
                e0Var.mo107146h(11, this.f284551e.getString(C0966R.string.b_i), C0966R.raw.icons_filled_search_logo, this.f284551e.getResources().getColor(C0966R.color.f2966ao));
                ((C119157j) C119157j.f356862d).mo183875f(new C97027a());
            }
            if (C97056h.m124953H(this.f284550d) || C97056h.m124955K(this.f284550d)) {
                ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new ExDeviceHaveBindNetworkDeviceEvent();
                exDeviceHaveBindNetworkDeviceEvent.f236178d.f236180a = this.f284550d.getMsgId();
                exDeviceHaveBindNetworkDeviceEvent.publish();
                Log.m105918d("MicroMsg.ImageGalleryUI", "result is ok: " + exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a);
                if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a) {
                    e0Var.mo107146h(4, this.f284551e.getString(C0966R.string.maz), C0966R.raw.bottomsheet_icon_other_mode, 0);
                }
            }
        }
    }
}
