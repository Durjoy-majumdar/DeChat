package wa3;

import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import pb1.C100755z;
import te3.C101801kd0;

/* renamed from: wa3.i */
public class C102369i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C101801kd0 f301482d;

    /* renamed from: e */
    public final /* synthetic */ C102370j f301483e;

    public C102369i(C102370j jVar, C101801kd0 kd02) {
        this.f301483e = jVar;
        this.f301482d = kd02;
    }

    public void run() {
        C100755z zVar = new C100755z();
        C102370j jVar = this.f301483e;
        zVar.field_localId = jVar.f301495u;
        C101801kd0 kd02 = this.f301482d;
        zVar.field_favProto = kd02;
        jVar.f301475o = kd02;
        jVar.f301468e = zVar;
        jVar.f301498x = zVar;
        if (C102370j.f301484K.containsKey(zVar)) {
            C102370j jVar2 = this.f301483e;
            jVar2.f301467d = C102370j.f301484K.get(jVar2.f301498x);
        } else {
            C102370j.m135078p(this.f301483e);
        }
        C102370j jVar3 = this.f301483e;
        jVar3.mo141939a(jVar3.f301467d.f302090a, true, 1);
        C96679b bVar = C96679b.f283182r;
        if (bVar != null && bVar != null) {
            NoteEditorUI noteEditorUI = (NoteEditorUI) bVar.f283188d;
            noteEditorUI.getClass();
            noteEditorUI.mo134926U7(true);
        }
    }

    public String toString() {
        return super.toString() + "|dealWNoteInfo";
    }
}
