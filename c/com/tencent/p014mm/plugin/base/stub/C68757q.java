package com.tencent.p014mm.plugin.base.stub;

import android.os.Bundle;
import com.tencent.p014mm.modelsimple.C40360i0;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXImageObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicVideoObject;
import com.tencent.p014mm.opensdk.modelmsg.WXTextObject;
import com.tencent.p014mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.p014mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.pluginsdk.model.app.C72691t1;
import com.tencent.p014mm.pluginsdk.model.app.C72693u1;
import com.tencent.p014mm.pluginsdk.model.app.ReportUtil;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import di3.C86312j;
import eb0.C97625j3;
import gy3.C87412m;
import java.util.LinkedList;
import p763ym.C79138l;
import te3.C49388f7;
import te3.g54;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.base.stub.q */
public class C68757q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SendMessageToWX.Req f197507d;

    /* renamed from: e */
    public final /* synthetic */ String f197508e;

    /* renamed from: f */
    public final /* synthetic */ WXEntryActivity f197509f;

    public C68757q(WXEntryActivity wXEntryActivity, SendMessageToWX.Req req, String str) {
        this.f197509f = wXEntryActivity;
        this.f197507d = req;
        this.f197508e = str;
    }

    public void run() {
        C49388f7 f7Var;
        WXMediaMessage.IMediaObject iMediaObject;
        boolean z;
        boolean z2 = false;
        try {
            if (((C79138l) C86312j.m106911c(C79138l.class)).df0(this.f197507d.message)) {
                Bundle bundle = new Bundle();
                this.f197507d.toBundle(bundle);
                this.f197509f.getIntent().putExtras(bundle);
            }
            WXEntryActivity wXEntryActivity = this.f197509f;
            if (C72688j0.m85018d(wXEntryActivity, wXEntryActivity.f197448e) != null) {
                wXEntryActivity.f197453j.f211511a = C72691t1.C72692a.SUCCESS;
            } else {
                C72693u1 u1Var = wXEntryActivity.f197450g;
                if (u1Var == null || u1Var.f211522c != null) {
                    wXEntryActivity.f197453j.f211511a = C72691t1.C72692a.SUCCESS_BY_TOKEN;
                } else {
                    wXEntryActivity.f197453j.f211511a = C72691t1.C72692a.NO_TOKEN_SIGNATURE;
                }
            }
            C97625j3.m125815e().mo123455a(1200, this.f197509f);
            LinkedList linkedList = new LinkedList();
            WXEntryActivity wXEntryActivity2 = this.f197509f;
            WXMediaMessage wXMediaMessage = wXEntryActivity2.f197461u;
            int i = this.f197507d.scene;
            String str = wXEntryActivity2.f197447d;
            C87412m.m108594g(wXMediaMessage, "wxMsg");
            if (i == 0 && (((z = iMediaObject instanceof WXTextObject)) || (iMediaObject instanceof WXImageObject) || (iMediaObject instanceof WXVideoObject) || (iMediaObject instanceof WXWebpageObject) || (iMediaObject instanceof WXMiniProgramObject) || (iMediaObject instanceof WXMusicVideoObject))) {
                String str2 = wXMediaMessage.msgSignature;
                if (str2 == null || C112551y.m153811k(str2)) {
                    z2 = true;
                }
                if (!z2) {
                    Log.m105924i("MicroMsg.AppMsgSignatureHelper", "getAppMsgSignature3rd type " + wXMediaMessage.getType() + ", msgSignature = " + wXMediaMessage.msgSignature);
                    C49388f7 f7Var2 = new C49388f7();
                    f7Var2.f133324f = wXMediaMessage.msgSignature;
                    LinkedList<g54> linkedList2 = f7Var2.f133323e;
                    g54 g54 = new g54();
                    g54.f133870d = "appid";
                    g54.f133871e = str;
                    linkedList2.add(g54);
                    if (z) {
                        f7Var2.f133322d = 1;
                        LinkedList<g54> linkedList3 = f7Var2.f133323e;
                        g54 g542 = new g54();
                        g542.f133870d = MimeTypes.BASE_TYPE_TEXT;
                        g542.f133871e = ((WXTextObject) iMediaObject).text;
                        linkedList3.add(g542);
                    } else if ((iMediaObject = wXMediaMessage.mediaObject) instanceof WXImageObject) {
                        f7Var2.f133322d = 2;
                        LinkedList<g54> linkedList4 = f7Var2.f133323e;
                        g54 g543 = new g54();
                        g543.f133870d = "imgDataHash";
                        g543.f133871e = ((WXImageObject) iMediaObject).imgDataHash;
                        linkedList4.add(g543);
                    } else if (iMediaObject instanceof WXVideoObject) {
                        f7Var2.f133322d = 4;
                        LinkedList<g54> linkedList5 = f7Var2.f133323e;
                        g54 g544 = new g54();
                        g544.f133870d = FFmpegMetadataRetriever.METADATA_KEY_TITLE;
                        g544.f133871e = wXMediaMessage.title;
                        linkedList5.add(g544);
                        LinkedList<g54> linkedList6 = f7Var2.f133323e;
                        g54 g545 = new g54();
                        g545.f133870d = "description";
                        g545.f133871e = wXMediaMessage.description;
                        linkedList6.add(g545);
                        LinkedList<g54> linkedList7 = f7Var2.f133323e;
                        g54 g546 = new g54();
                        g546.f133870d = "thumbDataHash";
                        g546.f133871e = wXMediaMessage.thumbDataHash;
                        linkedList7.add(g546);
                        LinkedList<g54> linkedList8 = f7Var2.f133323e;
                        g54 g547 = new g54();
                        g547.f133870d = "videoUrl";
                        WXVideoObject wXVideoObject = (WXVideoObject) iMediaObject;
                        g547.f133871e = wXVideoObject.videoUrl;
                        linkedList8.add(g547);
                        LinkedList<g54> linkedList9 = f7Var2.f133323e;
                        g54 g548 = new g54();
                        g548.f133870d = "videoLowBandUrl";
                        g548.f133871e = wXVideoObject.videoLowBandUrl;
                        linkedList9.add(g548);
                    } else if (iMediaObject instanceof WXWebpageObject) {
                        f7Var2.f133322d = 5;
                        LinkedList<g54> linkedList10 = f7Var2.f133323e;
                        g54 g549 = new g54();
                        g549.f133870d = FFmpegMetadataRetriever.METADATA_KEY_TITLE;
                        g549.f133871e = wXMediaMessage.title;
                        linkedList10.add(g549);
                        LinkedList<g54> linkedList11 = f7Var2.f133323e;
                        g54 g5410 = new g54();
                        g5410.f133870d = "description";
                        g5410.f133871e = wXMediaMessage.description;
                        linkedList11.add(g5410);
                        LinkedList<g54> linkedList12 = f7Var2.f133323e;
                        g54 g5411 = new g54();
                        g5411.f133870d = "thumbDataHash";
                        g5411.f133871e = wXMediaMessage.thumbDataHash;
                        linkedList12.add(g5411);
                        LinkedList<g54> linkedList13 = f7Var2.f133323e;
                        g54 g5412 = new g54();
                        g5412.f133870d = "webpageUrl";
                        g5412.f133871e = ((WXWebpageObject) iMediaObject).webpageUrl;
                        linkedList13.add(g5412);
                    } else if (iMediaObject instanceof WXMiniProgramObject) {
                        f7Var2.f133322d = 6;
                        LinkedList<g54> linkedList14 = f7Var2.f133323e;
                        g54 g5413 = new g54();
                        g5413.f133870d = FFmpegMetadataRetriever.METADATA_KEY_TITLE;
                        g5413.f133871e = wXMediaMessage.title;
                        linkedList14.add(g5413);
                        LinkedList<g54> linkedList15 = f7Var2.f133323e;
                        g54 g5414 = new g54();
                        g5414.f133870d = "description";
                        g5414.f133871e = wXMediaMessage.description;
                        linkedList15.add(g5414);
                        LinkedList<g54> linkedList16 = f7Var2.f133323e;
                        g54 g5415 = new g54();
                        g5415.f133870d = "thumbDataHash";
                        g5415.f133871e = wXMediaMessage.thumbDataHash;
                        linkedList16.add(g5415);
                        LinkedList<g54> linkedList17 = f7Var2.f133323e;
                        g54 g5416 = new g54();
                        g5416.f133870d = "userName";
                        WXMiniProgramObject wXMiniProgramObject = (WXMiniProgramObject) iMediaObject;
                        g5416.f133871e = wXMiniProgramObject.userName;
                        linkedList17.add(g5416);
                        LinkedList<g54> linkedList18 = f7Var2.f133323e;
                        g54 g5417 = new g54();
                        g5417.f133870d = "path";
                        g5417.f133871e = wXMiniProgramObject.path;
                        linkedList18.add(g5417);
                    } else if (iMediaObject instanceof WXMusicVideoObject) {
                        f7Var2.f133322d = 7;
                        LinkedList<g54> linkedList19 = f7Var2.f133323e;
                        g54 g5418 = new g54();
                        g5418.f133870d = FFmpegMetadataRetriever.METADATA_KEY_TITLE;
                        g5418.f133871e = wXMediaMessage.title;
                        linkedList19.add(g5418);
                        LinkedList<g54> linkedList20 = f7Var2.f133323e;
                        g54 g5419 = new g54();
                        g5419.f133870d = "description";
                        g5419.f133871e = wXMediaMessage.description;
                        linkedList20.add(g5419);
                        LinkedList<g54> linkedList21 = f7Var2.f133323e;
                        g54 g5420 = new g54();
                        g5420.f133870d = "thumbDataHash";
                        g5420.f133871e = wXMediaMessage.thumbDataHash;
                        linkedList21.add(g5420);
                        LinkedList<g54> linkedList22 = f7Var2.f133323e;
                        g54 g5421 = new g54();
                        g5421.f133870d = "musicUrl";
                        WXMusicVideoObject wXMusicVideoObject = (WXMusicVideoObject) iMediaObject;
                        g5421.f133871e = wXMusicVideoObject.musicUrl;
                        linkedList22.add(g5421);
                        LinkedList<g54> linkedList23 = f7Var2.f133323e;
                        g54 g5422 = new g54();
                        g5422.f133870d = "musicDataUrl";
                        g5422.f133871e = wXMusicVideoObject.musicDataUrl;
                        linkedList23.add(g5422);
                        LinkedList<g54> linkedList24 = f7Var2.f133323e;
                        g54 g5423 = new g54();
                        g5423.f133870d = "singerName";
                        g5423.f133871e = wXMusicVideoObject.singerName;
                        linkedList24.add(g5423);
                        LinkedList<g54> linkedList25 = f7Var2.f133323e;
                        g54 g5424 = new g54();
                        g5424.f133870d = "duration";
                        g5424.f133871e = String.valueOf(wXMusicVideoObject.duration);
                        linkedList25.add(g5424);
                        LinkedList<g54> linkedList26 = f7Var2.f133323e;
                        g54 g5425 = new g54();
                        g5425.f133870d = "hdAlbumThumbFileHash";
                        g5425.f133871e = wXMusicVideoObject.hdAlbumThumbFileHash;
                        linkedList26.add(g5425);
                        LinkedList<g54> linkedList27 = f7Var2.f133323e;
                        g54 g5426 = new g54();
                        g5426.f133870d = "albumName";
                        g5426.f133871e = wXMusicVideoObject.albumName;
                        linkedList27.add(g5426);
                        LinkedList<g54> linkedList28 = f7Var2.f133323e;
                        g54 g5427 = new g54();
                        g5427.f133870d = "musicGenre";
                        g5427.f133871e = wXMusicVideoObject.musicGenre;
                        linkedList28.add(g5427);
                        LinkedList<g54> linkedList29 = f7Var2.f133323e;
                        g54 g5428 = new g54();
                        g5428.f133870d = "issueDate";
                        g5428.f133871e = String.valueOf(wXMusicVideoObject.issueDate);
                        linkedList29.add(g5428);
                        LinkedList<g54> linkedList30 = f7Var2.f133323e;
                        g54 g5429 = new g54();
                        g5429.f133870d = "identification";
                        g5429.f133871e = wXMusicVideoObject.identification;
                        linkedList30.add(g5429);
                    }
                    f7Var = f7Var2;
                    String str3 = this.f197508e;
                    WXEntryActivity wXEntryActivity3 = this.f197509f;
                    C97625j3.m125815e().mo123460f(new C40360i0(str3, 1, linkedList, wXEntryActivity3.f197449f, String.valueOf(wXEntryActivity3.f197455o), this.f197509f.f197453j.f211511a.f211519d, f7Var));
                }
            }
            f7Var = null;
            String str32 = this.f197508e;
            WXEntryActivity wXEntryActivity32 = this.f197509f;
            C97625j3.m125815e().mo123460f(new C40360i0(str32, 1, linkedList, wXEntryActivity32.f197449f, String.valueOf(wXEntryActivity32.f197455o), this.f197509f.f197453j.f211511a.f211519d, f7Var));
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WXEntryActivity", "copyFileIfNeed e = %s", e.getMessage());
            WXEntryActivity wXEntryActivity4 = this.f197509f;
            int i2 = WXEntryActivity.f197446w;
            ReportUtil.m84997c(wXEntryActivity4, ReportUtil.m84995a(IntentUtil.getExtras(wXEntryActivity4.getIntent()), -1), true, false);
            wXEntryActivity4.finish();
        }
    }
}
