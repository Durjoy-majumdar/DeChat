package com.tencent.p014mm.plugin.record.p094ui;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import d62.C7250m;
import d62.C97425j;
import eb0.C97625j3;
import java.util.List;
import p823sg.C90193h;
import qg2.C101147j0;
import te3.C101834rc0;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgFileUI$$n */
public class RecordMsgFileUI$$n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f272619d;

    /* renamed from: e */
    public final /* synthetic */ String f272620e;

    /* renamed from: f */
    public final /* synthetic */ Runnable f272621f;

    /* renamed from: g */
    public final /* synthetic */ RecordMsgFileUI f272622g;

    public RecordMsgFileUI$$n(RecordMsgFileUI recordMsgFileUI, List list, String str, Runnable runnable) {
        this.f272622g = recordMsgFileUI;
        this.f272619d = list;
        this.f272620e = str;
        this.f272621f = runnable;
    }

    public void run() {
        RecordMsgFileUI recordMsgFileUI = this.f272622g;
        C86009m1 m1Var = new C86009m1(C101147j0.m132636q(recordMsgFileUI.f272596u, recordMsgFileUI.f272594s, 1));
        for (String str : this.f272619d) {
            if (m1Var.mo119967g()) {
                String I7 = this.f272622g.mo129685I7();
                Log.m105919d("MicroMsg.RecordMsgFileUI", "sendVideo::data path[%s] thumb path[%s]", m1Var.mo119971i(), I7);
                if (this.f272622g.mo129684H7() == 15) {
                    C97425j a = C7250m.m7431a();
                    AppCompatActivity context = this.f272622g.getContext();
                    String i = m1Var.mo119971i();
                    C101834rc0 rc02 = this.f272622g.f272596u;
                    a.Ml0(context, str, i, I7, 62, rc02.f299338y, false, false, "", rc02.f299259I1);
                } else {
                    C97425j a2 = C7250m.m7431a();
                    AppCompatActivity context2 = this.f272622g.getContext();
                    String i2 = m1Var.mo119971i();
                    C101834rc0 rc03 = this.f272622g.f272596u;
                    a2.Ml0(context2, str, i2, I7, 1, rc03.f299338y, false, false, "", rc03.f299259I1);
                }
            } else {
                String str2 = this.f272622g.f272596u.f299242A;
                if (!Util.isNullOrNil(str2)) {
                    WXVideoObject wXVideoObject = new WXVideoObject();
                    wXVideoObject.videoUrl = str2;
                    WXMediaMessage wXMediaMessage = new WXMediaMessage(wXVideoObject);
                    RecordMsgFileUI recordMsgFileUI2 = this.f272622g;
                    String nullAs = Util.nullAs(recordMsgFileUI2.f272596u.f299297d, recordMsgFileUI2.getContext().getResources().getString(C0966R.string.cs8));
                    wXMediaMessage.mediaObject = wXVideoObject;
                    wXMediaMessage.title = nullAs;
                    RecordMsgFileUI recordMsgFileUI3 = this.f272622g;
                    C101834rc0 rc04 = recordMsgFileUI3.f272596u;
                    wXMediaMessage.description = rc04.f299301f;
                    byte[] readFromFile = Util.readFromFile(C101147j0.m132611D(rc04, recordMsgFileUI3.f272594s, 1));
                    wXMediaMessage.thumbData = readFromFile;
                    if (readFromFile == null) {
                        wXMediaMessage.thumbData = Util.readFromFile(C97625j3.m125812b().mo105892g() + "web/" + C90193h.m112878f(Util.nullAs(this.f272622g.f272596u.f299254G, "").getBytes()));
                    }
                    C72695v.m85049B(wXMediaMessage, "", "", str, 3, (String) null);
                }
            }
            C7250m.m7431a().mo136252Ar(this.f272620e, str);
        }
        this.f272622g.mo129692P7(2, 7);
        MMHandlerThread.postToMainThread(this.f272621f);
    }

    public String toString() {
        return super.toString() + "|onActivityResult1";
    }
}
