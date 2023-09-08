package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import bb3.C92226g;
import java.util.LinkedList;
import xa3.C102587c;
import xa3.C102595k;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.f */
public class C96729f implements C92226g.C54444b {

    /* renamed from: a */
    public final /* synthetic */ NoteEditorUI f283372a;

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.f$a */
    public class C96730a extends LinkedList<C102587c> {
        public C96730a(C96729f fVar, C102595k kVar) {
            add(kVar);
        }
    }

    public C96729f(NoteEditorUI noteEditorUI) {
        this.f283372a = noteEditorUI;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0072, code lost:
        r2 = r2.f348991a.mo119945q(r2.f348992b);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo134990a(java.lang.String r13, xa3.C102595k r14) {
        /*
            r12 = this;
            java.lang.Class<pb1.j1> r0 = pb1.C100718j1.class
            java.lang.String r2 = "MicroMsg.Note.NoteEditorUI"
            java.lang.String r3 = "compressNoteVideo onExportFinish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r3 = r12.f283372a
            android.app.ProgressDialog r3 = r3.f283215H
            r4 = 0
            if (r3 == 0) goto L_0x0017
            r3.dismiss()
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r3 = r12.f283372a
            r3.f283215H = r4
        L_0x0017:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            r8 = 0
            r10 = 1
            if (r3 != 0) goto L_0x00e5
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
            if (r3 == 0) goto L_0x00e5
            if (r14 == 0) goto L_0x00e5
            boolean r3 = r14.f302087v
            if (r3 != 0) goto L_0x00e5
            android.net.Uri r2 = com.tencent.p014mm.vfs.C116299g2.m163858n(r13)
            java.lang.String r3 = r2.getPath()
            r5 = 0
            if (r3 == 0) goto L_0x0051
            java.lang.String r3 = com.tencent.p014mm.vfs.C116299g2.m163855k(r3, r5, r5)
            java.lang.String r6 = r2.getPath()
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x0051
            android.net.Uri$Builder r2 = r2.buildUpon()
            android.net.Uri$Builder r2 = r2.path(r3)
            android.net.Uri r2 = r2.build()
        L_0x0051:
            di3.d r3 = di3.C86312j.m106911c(r0)
            pb1.j1 r3 = (pb1.C100718j1) r3
            long r6 = r3.mo128210aN(r5)
            di3.d r0 = di3.C86312j.m106911c(r0)
            pb1.j1 r0 = (pb1.C100718j1) r0
            int r0 = r0.mo128211cX(r5)
            com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r2 = r3.mo177799l(r2, r4)
            boolean r3 = r2.mo177810a()
            if (r3 != 0) goto L_0x0072
            goto L_0x007c
        L_0x0072:
            com.tencent.mm.vfs.FileSystem$c r3 = r2.f348991a
            java.lang.String r2 = r2.f348992b
            com.tencent.mm.vfs.b0 r2 = r3.mo119945q(r2)
            if (r2 != 0) goto L_0x007e
        L_0x007c:
            r2 = r8
            goto L_0x0080
        L_0x007e:
            long r2 = r2.f250473c
        L_0x0080:
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x00c6
            r14.f302101r = r13
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = r12.f283372a
            bb3.d r0 = r0.f283238X0
            com.tencent.mm.plugin.wenote.ui.nativenote.f$a r2 = new com.tencent.mm.plugin.wenote.ui.nativenote.f$a
            r2.<init>(r12, r14)
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r3 = r12.f283372a
            com.tencent.mm.plugin.wenote.model.nativenote.manager.b r3 = r3.f283252j
            r0.getClass()
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r3 = r3.mo134905c()
            if (r3 == 0) goto L_0x00a3
            int r5 = r3.getPosInDataList()
            int r4 = r3.f283163R0
            goto L_0x00a4
        L_0x00a3:
            r4 = -1
        L_0x00a4:
            boolean r0 = r0.mo126208r(r2, r5, r4, r3)
            if (r0 == 0) goto L_0x00ab
            goto L_0x00ea
        L_0x00ab:
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = r12.f283372a
            bb3.d r2 = r0.f283238X0
            com.tencent.mm.plugin.wenote.model.nativenote.manager.b r0 = r0.f283252j
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r3 = r0.mo134905c()
            r4 = 1
            r5 = 1
            r6 = 0
            r7 = 1
            r11 = 0
            r0 = r2
            r1 = r14
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r11
            r0.mo126209s(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00ea
        L_0x00c6:
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = r12.f283372a
            androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r2 = r12.f283372a
            r3 = 2131825811(0x7f111493, float:1.9284489E38)
            java.lang.Object[] r4 = new java.lang.Object[r10]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r5] = r0
            java.lang.String r0 = r2.getString(r3, r4)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r1, (java.lang.CharSequence) r0, (int) r10)
            r0.show()
            goto L_0x00ea
        L_0x00e5:
            java.lang.String r0 = "file not exist or user canceled"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x00ea:
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = r12.f283372a
            r1 = 100
            r0.mo134937e8(r10, r1)
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = r12.f283372a
            r0.mo134936d8(r10, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96729f.mo134990a(java.lang.String, xa3.k):void");
    }
}
