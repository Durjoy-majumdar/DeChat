package com.tencent.p014mm.plugin.record.p094ui.viewWrappers;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.plugin.record.p094ui.viewWrappers.ImageViewWrapper;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96874n1;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.record.ui.viewWrappers.a */
public class C94380a implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ ImageViewWrapper.C94375c f272805d;

    public C94380a(ImageViewWrapper.C94375c cVar) {
        this.f272805d = cVar;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent;
        e0Var.clear();
        ImageViewWrapper.this.f272761d.mo107567l((View) null);
        ImageViewWrapper.C94375c cVar = this.f272805d;
        if (cVar.f272776g.f299322q1 == 0) {
            if (cVar.f272775f.mo140184m2()) {
                e0Var.mo107142f(2, this.f272805d.f272773d.getString(C0966R.string.crb));
            }
            if (this.f272805d.f272775f.mo140185n2()) {
                e0Var.mo107142f(1, this.f272805d.f272773d.getString(C0966R.string.cpw));
            }
            e0Var.mo107142f(3, this.f272805d.f272773d.getString(C0966R.string.cr5));
            ImageViewWrapper.C94375c cVar2 = this.f272805d;
            ImageViewWrapper.C94378e eVar = (ImageViewWrapper.C94378e) ((HashMap) ImageViewWrapper.this.f272763f).get(cVar2.f272777h);
            if (eVar == null || (recogQBarOfImageFileResultEvent = eVar.f272786a) == null) {
                RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new RecogQBarOfImageFileEvent();
                recogQBarOfImageFileEvent.f107731d.f107732a = System.currentTimeMillis();
                recogQBarOfImageFileEvent.f107731d.f107733b = this.f272805d.f272777h;
                recogQBarOfImageFileEvent.publish();
                return;
            }
            C96874n1 n1Var = C96874n1.f283849a;
            if (!Util.isNullOrNil(n1Var.mo135195d(recogQBarOfImageFileResultEvent))) {
                ImageViewWrapper.C94375c cVar3 = this.f272805d;
                ImageViewWrapper imageViewWrapper = ImageViewWrapper.this;
                C77407n nVar = imageViewWrapper.f272761d;
                Context context = cVar3.f272773d;
                imageViewWrapper.getClass();
                RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent2 = eVar.f272786a;
                String d = n1Var.mo135195d(recogQBarOfImageFileResultEvent2);
                int b = n1Var.mo135193b(recogQBarOfImageFileResultEvent2);
                C94385d dVar = new C94385d(imageViewWrapper, recogQBarOfImageFileResultEvent2, context, d, b, n1Var.mo135194c(recogQBarOfImageFileResultEvent2));
                if (!eVar.f272787b) {
                    eVar.f272787b = true;
                    ((ScanCodeSheetItemLogic) imageViewWrapper.f272764g).mo67077h(b, d);
                }
                nVar.mo107567l(((ScanCodeSheetItemLogic) imageViewWrapper.f272764g).mo67071b(dVar, b, d, 5));
            }
        }
    }
}
