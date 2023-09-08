package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98442x0;
import mk3.C99910f;
import p682rz.C101488s;
import p682rz.C101489t;
import p682rz.C101491u;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.gallery.b1 */
public final class C97037b1 implements C101489t.C77595a {

    /* renamed from: d */
    public final /* synthetic */ C98408n0 f284648d;

    /* renamed from: e */
    public final /* synthetic */ C97136u0 f284649e;

    /* renamed from: f */
    public final /* synthetic */ C72963f4 f284650f;

    /* renamed from: g */
    public final /* synthetic */ int f284651g;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.b1$a */
    public static final class C97038a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C97136u0 f284652d;

        /* renamed from: e */
        public final /* synthetic */ C72963f4 f284653e;

        /* renamed from: f */
        public final /* synthetic */ int f284654f;

        public C97038a(C97136u0 u0Var, C72963f4 f4Var, int i) {
            this.f284652d = u0Var;
            this.f284653e = f4Var;
            this.f284654f = i;
        }

        public final void run() {
            ImageGalleryUI imageGalleryUI;
            C99910f fVar = this.f284652d.f284697e;
            if (fVar != null) {
                fVar.mo139264a();
            }
            C97056h hVar = this.f284652d.f284638d;
            if (hVar != null && (imageGalleryUI = hVar.f284714g) != null) {
                imageGalleryUI.f284374M = false;
                imageGalleryUI.f284371L.setVisibility(8);
                this.f284652d.f284638d.f284714g.mo135753X8(false);
                this.f284652d.mo135824A(this.f284653e, this.f284654f);
            }
        }
    }

    public C97037b1(C98408n0 n0Var, C97136u0 u0Var, C72963f4 f4Var, int i) {
        this.f284648d = n0Var;
        this.f284649e = u0Var;
        this.f284650f = f4Var;
        this.f284651g = i;
    }

    /* renamed from: d5 */
    public void mo102579d5(C101489t.C77595a.C77596a aVar) {
        if (aVar != null) {
            C98408n0 n0Var = this.f284648d;
            C97136u0 u0Var = this.f284649e;
            C72963f4 f4Var = this.f284650f;
            int i = this.f284651g;
            if (n0Var.mo137700d().equals(aVar.f226215a)) {
                C98442x0.C98443a aVar2 = C98442x0.f288734i;
                C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(aVar.f226215a);
                C98442x0 b = aVar2.mo137781b(Zd != null ? Zd.mo137705i() : null);
                if (b != null && !b.f288738b) {
                    ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137731u(this);
                    ((C119157j) C119157j.f356862d).mo183895z(new C97038a(u0Var, f4Var, i));
                }
            }
        }
    }
}
