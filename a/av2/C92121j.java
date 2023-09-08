package av2;

import android.view.View;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import nj3.C11182m0;
import nj3.C76874e0;
import p200lx.C46900z;

/* renamed from: av2.j */
public final class C92121j {

    /* renamed from: av2.j$a */
    public static final class C92122a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C92126r f263708d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<ImageQBarDataBean> f263709e;

        /* renamed from: f */
        public final /* synthetic */ View f263710f;

        public C92122a(C92126r rVar, ArrayList<ImageQBarDataBean> arrayList, View view) {
            this.f263708d = rVar;
            this.f263709e = arrayList;
            this.f263710f = view;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt$addImageScanQRCode$1");
            e0Var.clear();
            C46900z e = this.f263708d.mo126102e();
            ArrayList<ImageQBarDataBean> arrayList = this.f263709e;
            ((ScanCodeSheetItemLogic) e).mo67074e(arrayList, C92121j.m115793b(this.f263708d, this.f263710f, arrayList), this.f263708d.mo126101d(), e0Var, 6);
            SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt$addImageScanQRCode$1");
        }
    }

    /* renamed from: a */
    public static final void m115792a(C92126r rVar, View view, ArrayList<ImageQBarDataBean> arrayList) {
        SnsMethodCalculate.markStartTimeMs("addImageScanQRCode", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
        C87412m.m108594g(rVar, "<this>");
        C87412m.m108594g(arrayList, "imageQBarDataList");
        if (Util.isNullOrNil((List) arrayList)) {
            SnsMethodCalculate.markEndTimeMs("addImageScanQRCode", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
            return;
        }
        rVar.mo126101d().f225780o = new C92122a(rVar, arrayList, view);
        SnsMethodCalculate.markEndTimeMs("addImageScanQRCode", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.tencent.mm.plugin.scanner.ImageQBarDataBean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.tencent.p014mm.plugin.scanner.ImageQBarDataBean m115793b(av2.C92126r r4, android.view.View r5, java.util.ArrayList<com.tencent.p014mm.plugin.scanner.ImageQBarDataBean> r6) {
        /*
            java.lang.String r0 = "getQBarDataOnCurrentDisplay"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "<this>"
            gy3.C87412m.m108594g(r4, r2)
            java.lang.String r2 = "imageQBarDataList"
            gy3.C87412m.m108594g(r6, r2)
            r2 = 0
            if (r5 != 0) goto L_0x0018
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L_0x0018:
            android.app.Activity r4 = r4.mo126100c()
            r3 = 0
            rx3.l r4 = com.tencent.p014mm.plugin.scanner.C94468m.m119493a(r4, r5, r6, r3)
            A r4 = r4.f38555d
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r5 = r4.size()
            r6 = 1
            if (r5 != r6) goto L_0x0033
            java.lang.Object r4 = r4.get(r3)
            r2 = r4
            com.tencent.mm.plugin.scanner.ImageQBarDataBean r2 = (com.tencent.p014mm.plugin.scanner.ImageQBarDataBean) r2
        L_0x0033:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: av2.C92121j.m115793b(av2.r, android.view.View, java.util.ArrayList):com.tencent.mm.plugin.scanner.ImageQBarDataBean");
    }
}
