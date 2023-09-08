package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import ck3.C39969i;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.SpamMediaToEmojiOPStruct;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C75569c4;
import eb0.C97625j3;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98429r0;
import hd0.C98442x0;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76874e0;
import p158gt.C98201k;
import p243tn.C14050a;
import p682rz.C101488s;
import rb0.C47984k;
import zj3.C79359g1;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.j7 */
public class C74077j7 extends C74023i {

    /* renamed from: v */
    public C67391b f217398v;

    /* renamed from: w */
    public C74100l7 f217399w;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.j7$a */
    public static class C74078a implements C72963f4.C72966d<C74078a> {

        /* renamed from: b */
        public C72963f4 f217400b;

        /* renamed from: c */
        public Bitmap f217401c;

        public C74078a(C72963f4 f4Var) {
            Class cls = C98201k.class;
            this.f217400b = f4Var;
            try {
                Context context = MMApplicationContext.getContext();
                if (this.f217400b.mo100983V3()) {
                    C68070l.C68072b u = C68070l.C68072b.m80422u(this.f217400b.getContent(), this.f217400b.mo108775z2());
                    if (u != null && !TextUtils.isEmpty(u.f195646y)) {
                        this.f217401c = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).fq0(C14050a.m13405b(u.f195646y), C76577a.m92156g(context), context, C0966R.C0969drawable.by8);
                        return;
                    }
                    return;
                }
                float f = !C75569c4.m90663I(this.f217400b) ? 1.0f : C75569c4.f222001d;
                this.f217401c = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).fq0(((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137729r(this.f217400b.mo108765s2()), C76577a.m92156g(context) * f, context, C0966R.C0969drawable.by8);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.ChattingItemVideo", th, "parse videoThumb err", new Object[0]);
            }
        }

        /* renamed from: a */
        public boolean mo82132a(Object obj) {
            return this.f217401c == ((C74078a) obj).f217401c;
        }
    }

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6915s4);
        C74123m7 m7Var = new C74123m7();
        m7Var.mo103182a(n4Var, true);
        n4Var.setTag(m7Var);
        return n4Var;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return false;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        ((C79359g1) bVar.f193278b.mo102812a(C79359g1.class)).mo102712u(menuItem, f4Var);
        return false;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        int i;
        if (!C97625j3.m125812b().mo105883I()) {
            return true;
        }
        int b = ((C74243t8) view.getTag()).mo103252b();
        C98408n0 f = ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137720f(f4Var.mo108765s2());
        e0Var.mo107136c(b, 130, 0, view.getContext().getString(C0966R.string.b_7), C0966R.raw.icons_filled_volume_off);
        if (!C75569c4.m90687t(f4Var) && !C75569c4.m90688u(f4Var) && !C75569c4.m90690w(f4Var)) {
            e0Var.mo107136c(b, 107, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
        }
        C88144b.m109788f("favorite");
        if (!C75569c4.m90690w(f4Var)) {
            e0Var.mo107136c(b, 116, 0, view.getContext().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
        }
        ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new ExDeviceHaveBindNetworkDeviceEvent();
        exDeviceHaveBindNetworkDeviceEvent.f236178d.f236180a = f4Var.getMsgId();
        exDeviceHaveBindNetworkDeviceEvent.publish();
        if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a) {
            e0Var.mo107136c(b, 129, 0, view.getContext().getString(C0966R.string.b_8), C0966R.raw.icons_filled_open);
        }
        if (f != null && (((i = f.f288562i) == 199 || i == 199) && C47984k.m53333g() && !this.f217398v.mo91584y())) {
            e0Var.add(b, 114, 0, (CharSequence) view.getContext().getString(C0966R.string.b9w));
        }
        if (C75569c4.m90690w(f4Var) || C75569c4.m90662H(f4Var)) {
            e0Var.clear();
            e0Var.mo107136c(b, 130, 0, view.getContext().getString(C0966R.string.b_7), C0966R.raw.icons_filled_volume_off);
        }
        C98442x0 x0Var = null;
        if (C98429r0.m127830u() && f != null) {
            x0Var = C98442x0.f288734i.mo137781b(f.mo137705i());
        }
        if (x0Var != null && x0Var.f288738b) {
            e0Var.clear();
        }
        if (!this.f217398v.mo91584y()) {
            e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b_2), C0966R.raw.icons_filled_delete);
        }
        if (!C75569c4.m90663I(f4Var)) {
            return true;
        }
        SpamMediaToEmojiOPStruct spamMediaToEmojiOPStruct = new SpamMediaToEmojiOPStruct();
        spamMediaToEmojiOPStruct.f194459d = f4Var.mo108774y2();
        spamMediaToEmojiOPStruct.f194460e = (long) f4Var.getType();
        spamMediaToEmojiOPStruct.f194461f = (long) C75569c4.m90678k(f4Var);
        spamMediaToEmojiOPStruct.f194462g = 3;
        spamMediaToEmojiOPStruct.mo86054n();
        return true;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        mo103153o0(f4Var).onClick(view);
        return true;
    }

    /* renamed from: d */
    public C72963f4.C72966d mo82118d(C72963f4 f4Var, Context context, C39969i iVar) {
        return new C74078a(f4Var);
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        this.f217398v = bVar;
        C74123m7 m7Var = (C74123m7) cVar;
        C74123m7.m88220b(this, m7Var, f4Var, true, m7Var, bVar, C0966R.C0969drawable.by8, mo103153o0(f4Var), mo103098p(bVar));
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        if (!z) {
            return i == 43 || i == 486539313;
        }
        return false;
    }

    /* renamed from: o0 */
    public C74100l7 mo103153o0(C72963f4 f4Var) {
        if (this.f217399w == null) {
            this.f217399w = new C74100l7(this.f217398v, true);
        }
        this.f217399w.f217491f = 0;
        if (C75569c4.m90663I(f4Var)) {
            this.f217399w.f217491f = 2;
        }
        return this.f217399w;
    }
}
