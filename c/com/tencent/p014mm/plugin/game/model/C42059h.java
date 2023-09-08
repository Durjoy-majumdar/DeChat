package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.plugin.game.commlib.util.C41872f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gc0.C20828a;
import hc0.C20937c;
import ic0.C108455d;
import java.util.List;
import p823sg.C90193h;
import sw1.C48484q;
import te3.C50187kw2;

/* renamed from: com.tencent.mm.plugin.game.model.h */
public class C42059h {

    /* renamed from: a */
    public static final String f113319a = (C41872f.m45392b(C41872f.C41873a.PERMANENT) + "hvmenu/");

    /* renamed from: com.tencent.mm.plugin.game.model.h$a */
    public class C42060a implements C108455d {

        /* renamed from: a */
        public final /* synthetic */ C50187kw2 f113320a;

        /* renamed from: b */
        public final /* synthetic */ List f113321b;

        /* renamed from: c */
        public final /* synthetic */ C42061b f113322c;

        public C42060a(C50187kw2 kw22, List list, C42061b bVar) {
            this.f113320a = kw22;
            this.f113321b = list;
            this.f113322c = bVar;
        }

        /* renamed from: a */
        public void mo26263a(boolean z, Object... objArr) {
            if (z) {
                Log.m105925i("MicroMsg.GameCommOpertionProcessor", "menu icon download success! thumburl:%s", this.f113320a.f137071f);
                C42059h.m45763a(this.f113321b, this.f113322c);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.model.h$b */
    public interface C42061b {
    }

    /* renamed from: a */
    public static void m45763a(List<C50187kw2> list, C42061b bVar) {
        if (!Util.isNullOrNil((List) list)) {
            C50187kw2 remove = list.remove(0);
            if (remove == null || Util.isNullOrNil(remove.f137071f)) {
                Log.m105920e("MicroMsg.GameCommOpertionProcessor", "menu is null or thumburl is null");
                return;
            }
            C20937c.C20939b bVar2 = new C20937c.C20939b();
            bVar2.f59346b = true;
            bVar2.f59350f = f113319a + C90193h.m112878f(remove.f137071f.getBytes());
            C20828a.m22825b().mo32515d(remove.f137071f, bVar2.mo32666a(), new C42060a(remove, list, bVar));
        } else if (bVar != null) {
            C42057g gVar = (C42057g) bVar;
            Log.m105925i("MicroMsg.GameCommOpertionProcessor", "menu icon download complete! save menu data. appid:%s", gVar.f113313a);
            ((C48484q) C86312j.m106911c(C48484q.class)).mo66106SL().mo57119qq("pb_game_hv_menu_" + gVar.f113313a, gVar.f113314b);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m45764b(java.lang.String r5) {
        /*
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.Class<nx1.b> r0 = nx1.C47305b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            nx1.b r0 = (nx1.C47305b) r0
            byte[] r5 = r0.mo57103Rz(r5)
            if (r5 == 0) goto L_0x0063
            int r0 = r5.length
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5)
            r5 = 0
            r2 = 1
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0041 }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x0041 }
            java.lang.String r0 = "mediaType"
            int r0 = r3.optInt(r0, r1)
            if (r0 != r2) goto L_0x0036
            com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem r5 = new com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem
            r5.<init>()
            r5.mo6982d(r3)
            goto L_0x0041
        L_0x0036:
            r4 = 4
            if (r0 != r4) goto L_0x0041
            com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem r5 = new com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem
            r5.<init>()
            r5.mo6982d(r3)
        L_0x0041:
            if (r5 == 0) goto L_0x0063
            java.lang.String r0 = r5.f283024g
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r5.f283023f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x005b
            java.lang.String r0 = r5.f283023f
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 == 0) goto L_0x0063
        L_0x005b:
            com.tencent.mm.plugin.webview.model.m1 r0 = com.tencent.p014mm.plugin.webview.modeltools.C6080m.Ax0()
            r0.mo7009a(r5)
            return r2
        L_0x0063:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.model.C42059h.m45764b(java.lang.String):boolean");
    }
}
