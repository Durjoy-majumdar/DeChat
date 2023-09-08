package xn0;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.sdk.platformtools.Log;
import ea3.C45591h;
import nj3.C11184p0;
import qo3.C77407n;

/* renamed from: xn0.c */
public class C53401c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C53391b f150254d;

    /* renamed from: xn0.c$a */
    public class C53402a implements View.OnCreateContextMenuListener {
        public C53402a() {
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            C53391b bVar = C53401c.this.f150254d;
            bVar.mo74036c(contextMenu, bVar.f150235i);
        }
    }

    /* renamed from: xn0.c$b */
    public class C53403b implements C77407n.C47880p {
        public C53403b() {
        }

        public void onDismiss() {
            C43791l lVar;
            C53391b bVar = C53401c.this.f150254d;
            bVar.f150236j = null;
            bVar.f150235i = null;
            ((ScanCodeSheetItemLogic) bVar.f150240q).mo67083n();
            C53391b bVar2 = C53401c.this.f150254d;
            C45591h hVar = bVar2.f150239p;
            if (hVar != null && (lVar = bVar2.f150230f) != null) {
                try {
                    lVar.b00(hVar.f123310c);
                    C53401c.this.f150254d.f150239p.mo71114b();
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.AppBrand.HTMLViewScanHelper", "cancel capture failed");
                }
            }
        }
    }

    public C53401c(C53391b bVar) {
        this.f150254d = bVar;
    }

    public void run() {
        C53391b bVar = this.f150254d;
        bVar.f150234h.mo70436b(bVar.f150229e, new C53402a(), (C11184p0) null, new C53403b());
    }
}
