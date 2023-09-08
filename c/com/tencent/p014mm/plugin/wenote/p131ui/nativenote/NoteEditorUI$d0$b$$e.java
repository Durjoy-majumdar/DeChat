package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C97625j3;
import java.util.Iterator;
import java.util.LinkedList;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C49544gd0;
import wa3.C102368h;
import wa3.C102374m;
import wa3.C53142b;
import xa3.C102585a;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0$b$$e */
public class NoteEditorUI$d0$b$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NoteEditorUI.C96692d0.C96694b f283324d;

    public NoteEditorUI$d0$b$$e(NoteEditorUI.C96692d0.C96694b bVar) {
        this.f283324d = bVar;
    }

    public void run() {
        NoteEditorUI.this.f283252j.mo134903a();
        C102585a aVar = new C102585a();
        aVar.f302071b = false;
        aVar.f302077h = false;
        NoteEditorUI.this.f283238X0.mo126192b(aVar, false);
        NoteEditorUI noteEditorUI = NoteEditorUI.this;
        C96679b bVar = noteEditorUI.f283252j;
        int i = bVar.f283197m;
        bVar.f283197m = 3;
        String o = noteEditorUI.f283238X0.mo126205o();
        NoteEditorUI noteEditorUI2 = NoteEditorUI.this;
        C102374m mVar = noteEditorUI2.f283240Y0;
        C101801kd0 m = noteEditorUI2.f283238X0.mo126203m(o);
        mVar.f301505a = o;
        LinkedList linkedList = new LinkedList();
        if (m == null || m.f298618f.size() <= 1) {
            linkedList = null;
        } else {
            Iterator<C101834rc0> it = m.f298618f.iterator();
            while (it.hasNext()) {
                C101834rc0 next = it.next();
                String c = C102368h.m135072c(next);
                if (!Util.isNullOrNil(c) && next.f299258I == 2 && C86013q1.m106450k(c)) {
                    C49544gd0 gd02 = new C49544gd0();
                    gd02.f133970d = next.f299266M;
                    gd02.f133971e = next.f299329u;
                    gd02.f133972f = next.f299325s;
                    linkedList.add(gd02);
                }
            }
        }
        C97625j3.m125815e().mo123460f(new C53142b(i, 1, mVar.f301505a, linkedList, (C49544gd0) null));
    }
}
