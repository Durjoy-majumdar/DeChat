package com.tencent.p014mm.plugin.scanner;

import p200lx.C46900z;
import te3.C51216sa2;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.scanner.u */
public class C42915u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f116211d;

    /* renamed from: e */
    public final /* synthetic */ ScanCodeSheetItemLogic f116212e;

    /* renamed from: com.tencent.mm.plugin.scanner.u$a */
    public class C42916a implements Runnable {
        public C42916a() {
        }

        public void run() {
            ScanCodeSheetItemLogic scanCodeSheetItemLogic = C42915u.this.f116212e;
            C51216sa2 sa22 = scanCodeSheetItemLogic.f116147e;
            if (sa22 == null || sa22 == scanCodeSheetItemLogic.f116148f) {
                C51216sa2 sa23 = scanCodeSheetItemLogic.f116148f;
                scanCodeSheetItemLogic.f116147e = sa23;
                ScanCodeSheetItemLogic.m46549a(scanCodeSheetItemLogic, sa23);
                C46900z.C46901a aVar = C42915u.this.f116212e.f116149g;
                if (aVar != null) {
                    aVar.mo64788a();
                }
                C42915u uVar = C42915u.this;
                ScanCodeSheetItemLogic scanCodeSheetItemLogic2 = uVar.f116212e;
                C46900z.C46902b bVar = scanCodeSheetItemLogic2.f116150h;
                if (bVar != null) {
                    bVar.mo72110a(uVar.f116211d, scanCodeSheetItemLogic2.f116147e);
                }
            }
        }
    }

    public C42915u(ScanCodeSheetItemLogic scanCodeSheetItemLogic, String str) {
        this.f116212e = scanCodeSheetItemLogic;
        this.f116211d = str;
    }

    public void run() {
        ((C119157j) C119157j.f356862d).mo183895z(new C42916a());
    }
}
