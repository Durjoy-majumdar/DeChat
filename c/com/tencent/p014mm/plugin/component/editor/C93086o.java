package com.tencent.p014mm.plugin.component.editor;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import p21.C100625j;
import p21.C100630o;
import u21.C101953f;

/* renamed from: com.tencent.mm.plugin.component.editor.o */
public class C93086o implements C101953f.C101954a {

    /* renamed from: a */
    public final /* synthetic */ EditorUI f268176a;

    public C93086o(EditorUI editorUI) {
        this.f268176a = editorUI;
    }

    /* renamed from: a */
    public void mo127580a(String str, C100625j jVar) {
        C86001b0 q;
        C100630o oVar = (C100630o) jVar;
        Log.m105924i("MicroMsg.EditorActivityUI", "compressNoteVideo onExportFinish");
        if (Util.isNullOrNil(str) || !C86013q1.m106450k(str) || oVar == null) {
            Log.m105924i("MicroMsg.EditorActivityUI", "file not exist or user canceled");
        } else {
            Uri n = C116299g2.m163858n(str);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            oVar.f294813r = str;
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            long j = 0;
            if (l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null) {
                j = q.f250473c;
            }
            oVar.f294810o = j;
        }
        this.f268176a.f268033A.remove(oVar.f294795a);
        Runnable runnable = this.f268176a.f268037E;
        if (runnable != null) {
            runnable.run();
            this.f268176a.f268037E = null;
        }
    }
}
