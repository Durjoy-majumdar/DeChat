package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import te3.C101801kd0;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.d */
public class C96725d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f283344d;

    /* renamed from: e */
    public final /* synthetic */ int f283345e;

    /* renamed from: f */
    public final /* synthetic */ String f283346f;

    /* renamed from: g */
    public final /* synthetic */ long f283347g;

    /* renamed from: h */
    public final /* synthetic */ C101801kd0 f283348h;

    /* renamed from: i */
    public final /* synthetic */ NoteEditorUI f283349i;

    public C96725d(NoteEditorUI noteEditorUI, String str, int i, String str2, long j, C101801kd0 kd02) {
        this.f283349i = noteEditorUI;
        this.f283344d = str;
        this.f283345e = i;
        this.f283346f = str2;
        this.f283347g = j;
        this.f283348h = kd02;
    }

    public void run() {
        this.f283349i.mo134938f8(this.f283344d, false, false, this.f283345e, this.f283346f, this.f283347g, this.f283348h);
    }
}
