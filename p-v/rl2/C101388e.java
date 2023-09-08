package rl2;

import android.content.Context;
import android.content.Intent;
import cl2.C28609a;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.plugin.scanner.C30391y;
import com.tencent.p014mm.plugin.scanner.api.ScanGoodsRequest;
import com.tencent.p014mm.plugin.scanner.model.C19021i0;
import com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import hl2.C98476f;
import il2.C98762f;
import j20.C117292a;
import java.util.List;
import k20.C9556a;
import ke3.C88144b;
import kl2.C21342b;
import p158gt.C98201k;
import rx3.C36570n;
import sk2.C101643c;
import sk2.C101645e;
import sk2.C101647f;
import sk2.C101648g;
import tk2.C101903a;
import vl2.C37751c0;
import z04.C112551y;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS})
/* renamed from: rl2.e */
public final class C101388e extends C86301e implements C101643c {

    /* renamed from: d */
    public C98762f f296993d;

    /* renamed from: rl2.e$a */
    public static final class C101389a implements C101648g {

        /* renamed from: a */
        public final /* synthetic */ C101648g f296994a;

        public C101389a(C101648g gVar) {
            this.f296994a = gVar;
        }

        /* renamed from: c */
        public final void mo33401c(long j, C101647f fVar) {
            C87412m.m108594g(fVar, "result");
            Log.m105925i("MicroMsg.ScanServiceImpl", "alvinluo previewImage onCallback success: %b, imagePath: %s, reqKey: %s, jumpType: %d", Boolean.valueOf(fVar.f297549c), fVar.f297553g, fVar.f297554h, Integer.valueOf(fVar.f297555i));
            C101648g gVar = this.f296994a;
            if (gVar != null) {
                gVar.mo33401c(j, fVar);
            }
        }
    }

    /* renamed from: rl2.e$b */
    public static final class C101390b implements C101648g {

        /* renamed from: a */
        public final /* synthetic */ C101648g f296995a;

        public C101390b(C101648g gVar) {
            this.f296995a = gVar;
        }

        /* renamed from: c */
        public final void mo33401c(long j, C101647f fVar) {
            C87412m.m108594g(fVar, "result");
            Log.m105925i("MicroMsg.ScanServiceImpl", "alvinluo uploadImageForOcr onCallback success: %b, imagePath: %s, reqKey: %s, jumpType: %d", Boolean.valueOf(fVar.f297549c), fVar.f297553g, fVar.f297554h, Integer.valueOf(fVar.f297555i));
            C101648g gVar = this.f296995a;
            if (gVar != null) {
                gVar.mo33401c(j, fVar);
            }
        }
    }

    /* renamed from: rl2.e$c */
    public static final class C101391c implements C101648g {

        /* renamed from: a */
        public final /* synthetic */ C101648g f296996a;

        public C101391c(C101648g gVar) {
            this.f296996a = gVar;
        }

        /* renamed from: c */
        public final void mo33401c(long j, C101647f fVar) {
            C87412m.m108594g(fVar, "result");
            Log.m105925i("MicroMsg.ScanServiceImpl", "alvinluo uploadImage onCallback success: %b, imagePath: %s, reqKey: %s, jumpType: %d", Boolean.valueOf(fVar.f297549c), fVar.f297553g, fVar.f297554h, Integer.valueOf(fVar.f297555i));
            C101648g gVar = this.f296996a;
            if (gVar != null) {
                gVar.mo33401c(j, fVar);
            }
        }
    }

    public boolean Ak0() {
        return C28609a.f78502b;
    }

    /* renamed from: Ax */
    public boolean mo140870Ax(List<Float> list) {
        return list != null && C28609a.f78502b && C30391y.m39061f(list);
    }

    public long Ns0(C101645e eVar, C101648g gVar) {
        if (eVar == null) {
            return 0;
        }
        eVar.f297533b = 2;
        if (eVar.f297532a == 0) {
            eVar.f297532a = System.currentTimeMillis();
        }
        if (this.f296993d == null) {
            this.f296993d = new C98762f();
        }
        C101389a aVar = new C101389a(gVar);
        C98762f fVar = this.f296993d;
        if (fVar != null) {
            fVar.mo138146d(eVar.f297532a, eVar, aVar);
        }
        return eVar.f297532a;
    }

    /* renamed from: P9 */
    public void mo140872P9(Context context, ScanGoodsRequest scanGoodsRequest, int i) {
        C87412m.m108594g(context, "context");
        if (scanGoodsRequest != null) {
            Log.m105925i("MicroMsg.ScanServiceImpl", "startScanGoodsForResult requestCode: %d", Integer.valueOf(i));
            Intent intent = new Intent();
            intent.putExtra("BaseScanUI_select_scan_mode", 12);
            intent.putExtra("key_scan_request", scanGoodsRequest);
            C88144b.m109796n(context, "scanner", ".ui.BaseScanUI", intent, i, false);
        }
    }

    /* renamed from: UJ */
    public int mo140873UJ() {
        return ((Number) ((C36570n) C19021i0.f53472r).getValue()).intValue();
    }

    /* renamed from: Un */
    public void mo140874Un(long j) {
        C98762f fVar = this.f296993d;
        if (fVar != null) {
            fVar.mo138143a(j);
        }
    }

    public String bh0(long j, boolean z) {
        C98476f fVar = C98476f.f288832a;
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j);
        if (!b002.mo100979R3() && !b002.mo100961A3()) {
            return null;
        }
        String b = fVar.mo137844b(b002);
        if (b == null || C112551y.m153811k(b)) {
            Class cls = C98201k.class;
            if (!b002.mo100979R3() && !b002.mo100961A3()) {
                return null;
            }
            if (b002.mo108769t2() == 1) {
                C92836k vP = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127200vP(b002.mo108768t(), b002.getMsgId());
                if (vP.f267374a == 0) {
                    long y2 = b002.mo108774y2();
                    Log.m105919d("MicroMsg.AiScanChatImageUtils", "alvinluo getImagePath img invalid and try get by msgSvrId: %s", Long.valueOf(y2));
                    vP = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(b002.mo108768t(), y2);
                }
                String str = vP.f267378e;
                String TY = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(str, "", "", true);
                Log.m105919d("MicroMsg.AiScanChatImageUtils", "alvinluo getImagePath bigImagePath %s, %s", str, TY);
                if (C86013q1.m106450k(TY)) {
                    return TY;
                }
                String r502 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).r50(b002.mo108768t(), vP);
                b = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(r502, "", "", true);
                Log.m105919d("MicroMsg.AiScanChatImageUtils", "alvinluo getImagePath hdImagePath %s, %s", r502, b);
                if (!C86013q1.m106450k(b)) {
                    return null;
                }
            } else {
                C92836k NQ = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(b002.mo108768t(), b002.mo108774y2());
                String str2 = NQ.f267378e;
                String TY2 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(str2, "", "", true);
                Log.m105919d("MicroMsg.AiScanChatImageUtils", "alvinluo getImagePath receiver bigImagePath %s, %s", str2, TY2);
                if (C86013q1.m106450k(TY2)) {
                    return TY2;
                }
                if (NQ.mo127145p()) {
                    String r503 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).r50(b002.mo108768t(), NQ);
                    String TY3 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(r503, "", "", true);
                    Log.m105919d("MicroMsg.AiScanChatImageUtils", "alvinluo getImagePath receiver hdImagePath %s, %s", r503, TY3);
                    if (C86013q1.m106450k(TY3)) {
                        return TY3;
                    }
                }
                if (!z) {
                    return null;
                }
                String str3 = NQ.f267380g;
                String v102 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).v10(str3, true);
                Log.m105919d("MicroMsg.AiScanChatImageUtils", "alvinluo getImagePath receiver thumbImagePath: %s, %s", str3, v102);
                return v102;
            }
        }
        return b;
    }

    public boolean cr0() {
        if (C37751c0.f99996b == null) {
            C37751c0.m41525e();
        }
        return C37751c0.f99996b.booleanValue();
    }

    public void f60(Context context, ScanGoodsRequest scanGoodsRequest, int i) {
        C87412m.m108594g(context, "context");
        if (scanGoodsRequest != null) {
            Log.m105924i("MicroMsg.ScanServiceImpl", "startScanGoods  enterScene:" + i);
            Intent intent = new Intent();
            intent.putExtra("BaseScanUI_select_scan_mode", 12);
            intent.putExtra("key_scan_request", scanGoodsRequest);
            intent.putExtra("key_scan_report_enter_scene", i);
            intent.setClass(context, BaseScanUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/service/ScanServiceImpl", "startScanGoods", "(Landroid/content/Context;Lcom/tencent/mm/plugin/scanner/api/ScanGoodsRequest;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/scanner/service/ScanServiceImpl", "startScanGoods", "(Landroid/content/Context;Lcom/tencent/mm/plugin/scanner/api/ScanGoodsRequest;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: qe */
    public long mo140878qe(C101645e eVar, C101648g gVar) {
        if (eVar == null) {
            return 0;
        }
        eVar.f297533b = 3;
        if (eVar.f297532a == 0) {
            eVar.f297532a = System.currentTimeMillis();
        }
        if (this.f296993d == null) {
            this.f296993d = new C98762f();
        }
        C101390b bVar = new C101390b(gVar);
        C98762f fVar = this.f296993d;
        if (fVar != null) {
            fVar.mo138146d(eVar.f297532a, eVar, bVar);
        }
        return eVar.f297532a;
    }

    /* renamed from: tf */
    public long mo140879tf(C101645e eVar, C101648g gVar) {
        if (eVar == null) {
            return 0;
        }
        eVar.f297533b = 1;
        if (eVar.f297532a == 0) {
            eVar.f297532a = System.currentTimeMillis();
        }
        if (this.f296993d == null) {
            this.f296993d = new C98762f();
        }
        C101391c cVar = new C101391c(gVar);
        C98762f fVar = this.f296993d;
        if (fVar != null) {
            fVar.mo138146d(eVar.f297532a, eVar, cVar);
        }
        return eVar.f297532a;
    }

    /* renamed from: x0 */
    public void mo140880x0(long j) {
        C98762f fVar = this.f296993d;
        if (fVar != null) {
            fVar.mo138143a(j);
        }
    }

    public C101903a z80(Context context, int i) {
        C87412m.m108594g(context, "context");
        return new C21342b(context, i);
    }
}
