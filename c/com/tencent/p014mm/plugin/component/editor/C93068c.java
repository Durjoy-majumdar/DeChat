package com.tencent.p014mm.plugin.component.editor;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.component.editor.c */
public class C93068c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f268109d;

    /* renamed from: e */
    public final /* synthetic */ long f268110e;

    /* renamed from: f */
    public final /* synthetic */ long f268111f;

    /* renamed from: g */
    public final /* synthetic */ EditorFileUI f268112g;

    public C93068c(EditorFileUI editorFileUI, int i, long j, long j2) {
        this.f268112g = editorFileUI;
        this.f268109d = i;
        this.f268110e = j;
        this.f268111f = j2;
    }

    public void run() {
        this.f268112g.f267964j.setProgress(this.f268109d);
        EditorFileUI editorFileUI = this.f268112g;
        editorFileUI.f267965n.setText(editorFileUI.getString(C0966R.string.cno, new Object[]{Util.getLengthStr((float) this.f268110e), Util.getLengthStr((float) this.f268111f)}));
    }
}
