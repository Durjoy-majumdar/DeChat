package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C97625j3;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p158gt.C98201k;
import p663qo.C101213l;
import p911ml.C99914f;

/* renamed from: com.tencent.mm.pluginsdk.model.app.n1 */
public class C96770n1 extends C99914f.C99916b {

    /* renamed from: a */
    public final /* synthetic */ NetSceneUploadAppAttach f283502a;

    public C96770n1(NetSceneUploadAppAttach netSceneUploadAppAttach) {
        this.f283502a = netSceneUploadAppAttach;
    }

    /* renamed from: b */
    public void mo135034b(int i, String str, C98121d dVar) {
        Log.m105925i("MicroMsg.NetSceneUploadAppAttach", "EmojiUploadByCdn Success:%d", Integer.valueOf(i));
        String str2 = "";
        if (i == 0) {
            NetSceneUploadAppAttach netSceneUploadAppAttach = this.f283502a;
            netSceneUploadAppAttach.getClass();
            C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(netSceneUploadAppAttach.f283441f.field_msgInfoId);
            if (!Util.isNullOrNil(b002.mo108765s2())) {
                str2 = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).mo127161CZ(b002.mo108765s2());
            }
            C98124g gVar = new C98124g();
            gVar.f287660d = "task_EmojiUploadCDN";
            gVar.field_mediaId = "emoji_upload_" + netSceneUploadAppAttach.f283445j + System.currentTimeMillis();
            gVar.field_appType = 1;
            gVar.field_fileType = 3;
            gVar.field_thumbpath = str2;
            gVar.field_bzScene = 0;
            gVar.field_force_aeskeycdn = true;
            gVar.field_talker = b002.mo108768t();
            gVar.f287662f = new C96768m1(netSceneUploadAppAttach, dVar);
            ((C101213l) C86312j.m106911c(C101213l.class)).if0(gVar);
            return;
        }
        C72695v.m85055H(this.f283502a.f283441f.systemRowid);
        NetSceneUploadAppAttach netSceneUploadAppAttach2 = this.f283502a;
        netSceneUploadAppAttach2.f283440e.onSceneEnd(3, i, str2, netSceneUploadAppAttach2);
    }
}
