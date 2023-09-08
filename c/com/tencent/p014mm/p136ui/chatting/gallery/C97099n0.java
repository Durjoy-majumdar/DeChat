package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98442x0;
import p682rz.C101488s;
import p682rz.C101489t;
import p682rz.C101491u;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.gallery.n0 */
public class C97099n0 implements C101489t.C77595a {

    /* renamed from: d */
    public final /* synthetic */ C98408n0 f284876d;

    /* renamed from: e */
    public final /* synthetic */ C72963f4 f284877e;

    /* renamed from: f */
    public final /* synthetic */ int f284878f;

    /* renamed from: g */
    public final /* synthetic */ ImageGalleryVideoHandler f284879g;

    public C97099n0(ImageGalleryVideoHandler imageGalleryVideoHandler, C98408n0 n0Var, C72963f4 f4Var, int i) {
        this.f284879g = imageGalleryVideoHandler;
        this.f284876d = n0Var;
        this.f284877e = f4Var;
        this.f284878f = i;
    }

    /* renamed from: d5 */
    public void mo102579d5(C101489t.C77595a.C77596a aVar) {
        C98408n0 Zd;
        C98442x0 b;
        if (aVar != null && this.f284876d.mo137700d().equals(aVar.f226215a) && (Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(aVar.f226215a)) != null && (b = C98442x0.f288734i.mo137781b(Zd.mo137705i())) != null && !b.f288738b) {
            ((C119157j) C119157j.f356862d).mo183895z(new n0$$a(this, this.f284877e, this.f284878f));
            ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137731u(this);
        }
    }
}
