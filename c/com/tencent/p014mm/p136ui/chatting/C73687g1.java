package com.tencent.p014mm.p136ui.chatting;

import android.graphics.Bitmap;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import gw0.C76073b;
import java.io.ByteArrayOutputStream;
import java.util.LinkedList;
import java.util.List;
import kb0.C9576e;
import lb0.C88394b;
import p196ln.C76706g;
import p823sg.C101611g;
import s90.C77629i;
import s90.C77630j;

/* renamed from: com.tencent.mm.ui.chatting.g1 */
public class C73687g1 {
    /* renamed from: a */
    public static C68070l.C68072b m87263a(String str, C77630j jVar) {
        C68097n Lo;
        C68070l.C68072b bVar = new C68070l.C68072b();
        bVar.f195570f = jVar.f226325d;
        bVar.f195574g = jVar.f226332n;
        bVar.f195582i = 33;
        bVar.f195573f2 = jVar.f226336r;
        bVar.f195569e2 = jVar.f226337s;
        bVar.f195577g2 = jVar.f226340v;
        bVar.f195653z2 = jVar.f226339u;
        bVar.f195467A2 = jVar.f226338t;
        bVar.f195585i2 = "";
        bVar.f195581h2 = 2;
        bVar.f195586j = jVar.f226326e;
        bVar.f195471B2 = jVar.f226342x;
        bVar.f195494H1 = "wxapp_" + jVar.f226340v + jVar.f226337s;
        bVar.f195634v = jVar.f226336r;
        bVar.f195638w = jVar.f226343y;
        C80995a aVar = new C80995a();
        aVar.f237893b = false;
        aVar.f237894c = "";
        bVar.mo93545f(aVar);
        if (Util.isNullOrNil(bVar.f195646y) && (Lo = ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93607Lo(str)) != null) {
            bVar.f195646y = Lo.mo93594c();
        }
        return bVar;
    }

    /* renamed from: b */
    public static boolean m87264b(C72963f4 f4Var, int i) {
        if (f4Var == null || !f4Var.mo100967F3()) {
            return false;
        }
        LinkedList<C77630j> linkedList = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(f4Var.getMsgId(), f4Var.getContent()).f226295i;
        if (!Util.isNullOrNil((List) linkedList)) {
            if (i < 0 || i >= linkedList.size()) {
                i = 0;
            }
            String str = linkedList.get(i).f226336r;
            C101611g<Long, C77629i> gVar = C92721n.f266840a;
            if (C9576e.m9260a(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m87265c(String str, boolean z, C68070l.C68072b bVar, String str2) {
        try {
            byte[] bArr = new byte[0];
            Bitmap bitmap = null;
            if (!Util.isNullOrNil(str2) && (str2.startsWith(HttpWrapperBase.PROTOCAL_HTTP) || str2.startsWith(HttpWrapperBase.PROTOCAL_HTTPS))) {
                String str3 = C88394b.f255384g;
                bitmap = C88394b.C88418q.f255427a.mo122791g(str2, (C88394b.C88405h) null);
            }
            if (bitmap == null || bitmap.isRecycled()) {
                Log.m105920e("MicroMsg.ChattingEditModeSendToAppBrand", "thumb image is null");
            } else {
                Log.m105924i("MicroMsg.ChattingEditModeSendToAppBrand", "thumb image is not null ");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
            }
            byte[] bArr2 = bArr;
            int i = C72996z1.m85820U5(str) ? 1 : 0;
            C72695v.m85052E(bVar, bVar.f195577g2, bVar.f195570f, str, (String) null, bArr2);
            C115669n.INSTANCE.mo160131h(14127, bVar.f195577g2, bVar.f195573f2, bVar.f195569e2, bVar.f195570f, bVar.f195574g, "", bVar.f195586j, 0, 1, 2, Integer.valueOf(i), str, 1, bVar.f195589j2, "");
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ChattingEditModeSendToAppBrand", e, "", new Object[0]);
            Log.m105921e("MicroMsg.ChattingEditModeSendToAppBrand", "retransmit sigle app msg error : %s", e.getLocalizedMessage());
        }
    }
}
