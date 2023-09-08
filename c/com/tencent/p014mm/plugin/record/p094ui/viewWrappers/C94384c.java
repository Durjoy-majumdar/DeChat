package com.tencent.p014mm.plugin.record.p094ui.viewWrappers;

import com.tencent.p014mm.plugin.record.p094ui.viewWrappers.ImageViewWrapper;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.record.ui.viewWrappers.c */
public class C94384c implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ ImageViewWrapper.C94375c f272810a;

    public C94384c(ImageViewWrapper.C94375c cVar) {
        this.f272810a = cVar;
    }

    public void onDismiss() {
        ((ScanCodeSheetItemLogic) ImageViewWrapper.this.f272764g).mo67083n();
    }
}
