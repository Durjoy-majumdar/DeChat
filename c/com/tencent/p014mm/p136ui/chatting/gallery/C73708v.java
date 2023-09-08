package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.mm.ui.chatting.gallery.v */
public class C73708v {

    /* renamed from: a */
    public ArrayList<C72963f4> f216434a = new ArrayList<>();

    /* renamed from: b */
    public boolean f216435b = false;

    /* renamed from: c */
    public ArrayList<C73711c> f216436c = new ArrayList<>();

    /* renamed from: com.tencent.mm.ui.chatting.gallery.v$b */
    public static final class C73710b {

        /* renamed from: a */
        public static final C73708v f216437a = new C73708v((C73709a) null);
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.v$c */
    public interface C73711c {
        /* renamed from: F0 */
        void mo102736F0(C72963f4 f4Var, boolean z);

        void clear();
    }

    public C73708v(C73709a aVar) {
    }

    /* renamed from: a */
    public void mo102777a(C72963f4 f4Var) {
        if (f4Var != null) {
            Log.m105925i("MicroMsg.ImageGallerySelectedHandle", "add : %s", Long.valueOf(f4Var.getMsgId()));
            this.f216434a.remove(f4Var);
            this.f216434a.remove(mo102779c(f4Var.getMsgId()));
            this.f216434a.add(f4Var);
            Iterator<C73711c> it = this.f216436c.iterator();
            while (it.hasNext()) {
                it.next().mo102736F0(f4Var, true);
            }
        }
    }

    /* renamed from: b */
    public void mo102778b() {
        Log.m105924i("MicroMsg.ImageGallerySelectedHandle", "clear..");
        this.f216434a.clear();
        Iterator<C73711c> it = this.f216436c.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
    }

    /* renamed from: c */
    public C72963f4 mo102779c(long j) {
        Iterator<C72963f4> it = this.f216434a.iterator();
        while (it.hasNext()) {
            C72963f4 next = it.next();
            if (next.getMsgId() == j) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo102780d(C72963f4 f4Var) {
        if (f4Var == null) {
            return false;
        }
        Iterator<C72963f4> it = this.f216434a.iterator();
        while (it.hasNext()) {
            if (it.next().getMsgId() == f4Var.getMsgId()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void mo102781e(C72963f4 f4Var) {
        if (f4Var != null) {
            Log.m105925i("MicroMsg.ImageGallerySelectedHandle", "remove : %s", Long.valueOf(f4Var.getMsgId()));
            this.f216434a.remove(f4Var);
            this.f216434a.remove(mo102779c(f4Var.getMsgId()));
            Iterator<C73711c> it = this.f216436c.iterator();
            while (it.hasNext()) {
                it.next().mo102736F0(f4Var, false);
            }
        }
    }

    /* renamed from: f */
    public int mo102782f() {
        return this.f216434a.size();
    }
}
