package com.tencent.p014mm.plugin.scanner.history.p1075ui;

import com.tencent.p014mm.plugin.scanner.C71030z;
import fl2.C32073a;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.scanner.history.ui.a */
public class C94464a implements C76879j.C11180n {

    /* renamed from: a */
    public final /* synthetic */ int f273138a;

    /* renamed from: b */
    public final /* synthetic */ ScannerHistoryUI f273139b;

    public C94464a(ScannerHistoryUI scannerHistoryUI, int i) {
        this.f273139b = scannerHistoryUI;
        this.f273138a = i;
    }

    /* renamed from: j */
    public void mo782j(int i) {
        C32073a aVar;
        if (i == 0 && (aVar = (C32073a) this.f273139b.f273126f.getItem(this.f273138a)) != null) {
            C71030z.vx0().wx0().delete(aVar, new String[0]);
            this.f273139b.mo129941H7();
            this.f273139b.f273126f.mo7991f();
        }
    }
}
