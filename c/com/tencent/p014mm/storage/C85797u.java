package com.tencent.p014mm.storage;

import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import di3.C86312j;
import java.util.LinkedList;
import rb0.C48009v0;

/* renamed from: com.tencent.mm.storage.u */
public final class C85797u implements Runnable {

    /* renamed from: d */
    public static final C85797u f249879d = new C85797u();

    public final void run() {
        Class cls = IMagicBrushMonitor.class;
        ((IMagicBrushMonitor) C86312j.m106911c(cls)).Ov0(IMagicBrushMonitor.Key.AdCanvasEnterByClick.name(), 1, (String) null);
        ((IMagicBrushMonitor) C86312j.m106911c(cls)).Ov0(IMagicBrushMonitor.Key.AdCanvasCardNum.name(), ((LinkedList) C48009v0.Jx0().mo25799bO(637534257, 100)).size(), (String) null);
    }
}
