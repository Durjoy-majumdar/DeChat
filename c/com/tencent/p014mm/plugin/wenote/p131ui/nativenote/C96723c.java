package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import te3.C101801kd0;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.c */
public class C96723c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f283336d;

    /* renamed from: e */
    public final /* synthetic */ int f283337e;

    /* renamed from: f */
    public final /* synthetic */ String f283338f;

    /* renamed from: g */
    public final /* synthetic */ long f283339g;

    /* renamed from: h */
    public final /* synthetic */ C101801kd0 f283340h;

    /* renamed from: i */
    public final /* synthetic */ NoteEditorUI f283341i;

    public C96723c(NoteEditorUI noteEditorUI, String str, int i, String str2, long j, C101801kd0 kd02) {
        this.f283341i = noteEditorUI;
        this.f283336d = str;
        this.f283337e = i;
        this.f283338f = str2;
        this.f283339g = j;
        this.f283340h = kd02;
    }

    public void run() {
        this.f283341i.mo134938f8(this.f283336d, true, false, this.f283337e, this.f283338f, this.f283339g, this.f283340h);
    }
}
