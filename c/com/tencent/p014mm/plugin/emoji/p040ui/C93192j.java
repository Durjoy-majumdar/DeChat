package com.tencent.p014mm.plugin.emoji.p040ui;

import p207nl.C100130h;
import qo3.C89779i0;
import v61.C37682c;

/* renamed from: com.tencent.mm.plugin.emoji.ui.j */
public class C93192j implements C100130h.C100131a {

    /* renamed from: a */
    public final /* synthetic */ C89779i0 f268747a;

    /* renamed from: b */
    public final /* synthetic */ CustomSmileyPreviewUI f268748b;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.j$a */
    public class C93193a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f268749d;

        public C93193a(boolean z) {
            this.f268749d = z;
        }

        public void run() {
            C93192j.this.f268747a.dismiss();
            if (this.f268749d) {
                C93192j.this.f268748b.setResult(-1);
                CustomSmileyPreviewUI customSmileyPreviewUI = C93192j.this.f268748b;
                C37682c.m41479b(customSmileyPreviewUI, 6, customSmileyPreviewUI.f268364z.getMd5(), C93192j.this.f268748b.f268361x0);
            }
        }
    }

    public C93192j(CustomSmileyPreviewUI customSmileyPreviewUI, C89779i0 i0Var) {
        this.f268748b = customSmileyPreviewUI;
        this.f268747a = i0Var;
    }

    /* renamed from: a */
    public void mo57745a(boolean z) {
        this.f268748b.runOnUiThread(new C93193a(z));
    }
}
