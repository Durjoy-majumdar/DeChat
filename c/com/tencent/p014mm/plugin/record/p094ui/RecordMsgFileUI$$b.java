package com.tencent.p014mm.plugin.record.p094ui;

import com.tencent.p014mm.opensdk.modelmsg.WXFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7250m;
import java.util.List;
import qg2.C101147j0;
import te3.C101834rc0;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgFileUI$$b */
public class RecordMsgFileUI$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f272603d;

    /* renamed from: e */
    public final /* synthetic */ String f272604e;

    /* renamed from: f */
    public final /* synthetic */ Runnable f272605f;

    /* renamed from: g */
    public final /* synthetic */ RecordMsgFileUI f272606g;

    public RecordMsgFileUI$$b(RecordMsgFileUI recordMsgFileUI, List list, String str, Runnable runnable) {
        this.f272606g = recordMsgFileUI;
        this.f272603d = list;
        this.f272604e = str;
        this.f272605f = runnable;
    }

    public void run() {
        RecordMsgFileUI recordMsgFileUI = this.f272606g;
        String q = C101147j0.m132636q(recordMsgFileUI.f272596u, recordMsgFileUI.f272594s, 1);
        WXFileObject wXFileObject = new WXFileObject();
        wXFileObject.setFilePath(q);
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXFileObject;
        RecordMsgFileUI recordMsgFileUI2 = this.f272606g;
        C101834rc0 rc02 = recordMsgFileUI2.f272596u;
        wXMediaMessage.title = rc02.f299297d;
        wXMediaMessage.description = rc02.f299301f;
        wXMediaMessage.thumbData = Util.readFromFile(C101147j0.m132611D(rc02, recordMsgFileUI2.f272594s, 1));
        for (String str : this.f272603d) {
            C72695v.m85049B(wXMediaMessage, "", "", str, 3, (String) null);
            C7250m.m7431a().mo136252Ar(this.f272604e, str);
        }
        MMHandlerThread.postToMainThread(this.f272605f);
    }

    public String toString() {
        return super.toString() + "|onActivityResult2";
    }
}
