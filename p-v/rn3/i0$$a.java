package rn3;

import android.widget.ImageView;
import cc3.C26835d;
import cc3.C26848g;
import cc3.C26856j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.RecordOperationEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80996q;
import com.tencent.p014mm.modelcdntran.C1297x;
import com.tencent.p014mm.modelimage.C92837k0;
import com.tencent.p014mm.opensdk.modelmsg.WXFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.p014mm.opensdk.modelmsg.WXVideoFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.p014mm.p136ui.transmit.C85967i;
import com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import d62.C7250m;
import dc3.C26975a;
import dc3.C26986d;
import dc3.C27003g;
import di3.C86312j;
import eb0.C97625j3;
import hc0.C20937c;
import java.net.URLDecoder;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p663qo.C101213l;
import pc0.C100760a0;
import pc0.C100765f;
import qg2.C101147j0;
import te3.C48942c20;
import te3.C77915dp3;

public final /* synthetic */ class i0$$a implements SendAppMessageWrapperUI.C85966h {

    /* renamed from: a */
    public final /* synthetic */ C85967i f258709a;

    /* renamed from: b */
    public final /* synthetic */ List f258710b;

    /* renamed from: c */
    public final /* synthetic */ String f258711c;

    public /* synthetic */ i0$$a(C85967i iVar, List list, String str) {
        this.f258709a = iVar;
        this.f258710b = list;
        this.f258711c = str;
    }

    /* renamed from: a */
    public final void mo124353a(Map map) {
        String str;
        String str2;
        int i;
        List list;
        C85967i iVar;
        String str3;
        int i2;
        String str4;
        LinkedList linkedList;
        List list2;
        C85967i iVar2;
        String str5;
        int i3;
        int i4;
        String str6;
        SendAppMessageWrapperUI sendAppMessageWrapperUI;
        String str7;
        String str8;
        SendAppMessageWrapperUI sendAppMessageWrapperUI2;
        int i5;
        int i6;
        String str9;
        String str10;
        SendAppMessageWrapperUI.C85965g gVar;
        Map map2 = map;
        C85967i iVar3 = this.f258709a;
        List list3 = this.f258710b;
        String str11 = this.f258711c;
        iVar3.getClass();
        char c = 0;
        int i7 = 0;
        while (i7 < list3.size()) {
            C48942c20 c202 = (C48942c20) list3.get(i7);
            if (map2 == null || (gVar = (SendAppMessageWrapperUI.C85965g) map2.get(c202.f131452d)) == null) {
                str2 = "";
                str = str2;
            } else {
                String str12 = gVar.f250392a;
                str2 = gVar.f250393b;
                str = str12;
            }
            SendAppMessageWrapperUI sendAppMessageWrapperUI3 = iVar3.f250395b;
            String str13 = "MicroMsg.SendAppMessageWrapperUI";
            if (c202 == null) {
                int i8 = SendAppMessageWrapperUI.f250361A;
                sendAppMessageWrapperUI3.getClass();
                Log.m105928w(str13, "dealOK: decryptedForwardWechatMsg is null ");
            } else {
                Object[] objArr = new Object[5];
                objArr[c] = sendAppMessageWrapperUI3.f250364f;
                objArr[1] = Integer.valueOf(c202.f131453e);
                objArr[2] = c202.f131452d;
                objArr[3] = Integer.valueOf(c202.f131455g);
                objArr[4] = c202.f131454f;
                Log.m105925i(str13, "dealOK:toUser:%s ,msg_type:%s,climsgid:%s,ret_code:%s,content:%s ", objArr);
                if (!Util.isNullOrNil(sendAppMessageWrapperUI3.f250364f)) {
                    LinkedList linkedList2 = new LinkedList(Util.stringsToList(sendAppMessageWrapperUI3.f250364f.split(",")));
                    String h = c202.f131454f.mo123705h();
                    int i9 = c202.f131453e;
                    int i15 = 0;
                    while (i15 < linkedList2.size()) {
                        String str14 = (String) linkedList2.get(i15);
                        if (i9 != 1) {
                            iVar2 = iVar3;
                            if (i9 != 3) {
                                if (i9 == 43) {
                                    list2 = list3;
                                    str4 = str11;
                                    linkedList = linkedList2;
                                    i2 = i7;
                                    i6 = i9;
                                    i5 = i15;
                                    if (Util.isNullOrNil(str) || Util.isNullOrNil(str14)) {
                                        Log.m105924i(str13, "dealVideo() called with: filePath = [" + str + "], userName = [" + str14 + "]");
                                    } else {
                                        if (!C86013q1.m106450k(str)) {
                                            Log.m105928w(str13, "dealVideo: filePath fileExists is false");
                                        }
                                        WXMediaMessage wXMediaMessage = new WXMediaMessage();
                                        WXVideoFileObject wXVideoFileObject = new WXVideoFileObject();
                                        wXVideoFileObject.filePath = str;
                                        wXMediaMessage.mediaObject = wXVideoFileObject;
                                        sendAppMessageWrapperUI3.mo119868L7(wXMediaMessage, "", 0);
                                    }
                                } else if (i9 != 48) {
                                    list2 = list3;
                                    if (i9 != 49) {
                                        sendAppMessageWrapperUI3.mo119873Q7(str14, sendAppMessageWrapperUI3.getString(C0966R.string.n4v));
                                        Log.m105921e(str13, "dealOK: error type:%s", Integer.valueOf(i9));
                                        str4 = str11;
                                        linkedList = linkedList2;
                                        i2 = i7;
                                        i6 = i9;
                                        i5 = i15;
                                    } else if (Util.isNullOrNil(h) || Util.isNullOrNil(str14)) {
                                        str4 = str11;
                                        linkedList = linkedList2;
                                        i2 = i7;
                                        i6 = i9;
                                        i5 = i15;
                                        Log.m105924i(str13, "dealAppMsg() called with: xml = [" + h + "], userName = [" + str14 + "]");
                                    } else {
                                        int H = ((C26835d) new C26835d().mo141104j(h)).mo53871H();
                                        WXMediaMessage wXMediaMessage2 = new WXMediaMessage();
                                        i6 = i9;
                                        if (H == 5) {
                                            C26856j jVar = new C26856j();
                                            jVar.mo141099d(h);
                                            C26848g gVar2 = jVar.f74684p;
                                            if (gVar2 != null) {
                                                str10 = gVar2.mo53885I();
                                            } else {
                                                Log.m105928w(str13, "dealAppMsg: getAppattach is null");
                                                str10 = "";
                                            }
                                            WXWebpageObject wXWebpageObject = new WXWebpageObject();
                                            wXWebpageObject.webpageUrl = jVar.f74644o;
                                            wXMediaMessage2.title = jVar.f74637h;
                                            wXMediaMessage2.description = jVar.f74638i;
                                            wXMediaMessage2.mediaObject = wXWebpageObject;
                                            if (!Util.isNullOrNil(str10)) {
                                                C92837k0.zx0().mo32520i(str10, (ImageView) null, (C20937c) null, new C90057j0(sendAppMessageWrapperUI3, wXMediaMessage2, str14));
                                            } else {
                                                sendAppMessageWrapperUI3.mo119874R7(str14, wXMediaMessage2);
                                            }
                                            i5 = i15;
                                        } else {
                                            i5 = i15;
                                            if (H == 33) {
                                                C26986d dVar = new C26986d();
                                                dVar.mo141099d(h);
                                                WXMiniProgramObject wXMiniProgramObject = new WXMiniProgramObject();
                                                wXMiniProgramObject.webpageUrl = dVar.f74644o;
                                                C27003g gVar3 = dVar.f75013s;
                                                if (gVar3 != null) {
                                                    wXMiniProgramObject.userName = gVar3.mo54468D();
                                                    wXMiniProgramObject.path = dVar.f75013s.mo54466B();
                                                }
                                                wXMediaMessage2.mediaObject = wXMiniProgramObject;
                                                wXMediaMessage2.description = dVar.f74637h;
                                                wXMediaMessage2.title = dVar.f75011q;
                                                C98124g gVar4 = new C98124g();
                                                gVar4.f287660d = "task_NetSceneGetMsgImg_1";
                                                C26975a aVar = dVar.f75010p;
                                                if (aVar == null) {
                                                    Log.m105920e(str13, "dealAppMsg: appBrandAppAttach ==null");
                                                    sendAppMessageWrapperUI3.mo119874R7(str14, wXMediaMessage2);
                                                } else {
                                                    String e = C72695v.m85063e(C97625j3.m125812b().mo105889d(), MD5Util.getMD5String(!Util.isNullOrNil(dVar.f75011q) ? dVar.f75011q : ""), "png");
                                                    gVar4.f287662f = new C90058k0(sendAppMessageWrapperUI3, e, wXMediaMessage2, str14);
                                                    linkedList = linkedList2;
                                                    long nowMilliSecond = Util.nowMilliSecond();
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append("");
                                                    i2 = i7;
                                                    str4 = str11;
                                                    sb.append(Util.nowMilliSecond());
                                                    gVar4.field_mediaId = C1297x.m1387b("checkExist", nowMilliSecond, str14, sb.toString());
                                                    gVar4.field_fileType = 19;
                                                    gVar4.field_aesKey = aVar.mo54449J();
                                                    gVar4.field_authKey = aVar.mo54448I();
                                                    gVar4.f287672s = aVar.mo54451L();
                                                    gVar4.field_filemd5 = aVar.mo54450K();
                                                    gVar4.field_fullpath = e;
                                                    if (!((C101213l) C86312j.m106911c(C101213l.class)).xf0(gVar4)) {
                                                        Log.m105920e(str13, "openim attach download failed before rescend");
                                                    }
                                                }
                                            } else {
                                                str4 = str11;
                                                linkedList = linkedList2;
                                                i2 = i7;
                                                if (H == 51 || H == 63) {
                                                    if (Util.isNullOrNil(h) || Util.isNullOrNil(str14)) {
                                                        Log.m105924i(str13, "sendFinderMsg() called with: xml = [" + h + "], userName = [" + str14 + "]");
                                                    } else {
                                                        C68070l.C68072b u = C68070l.C68072b.m80422u(h, (String) null);
                                                        if (u != null) {
                                                            C80996q.C1279a.m1369a().mo112828y0(u, "", "", str14, "", (byte[]) null, true);
                                                        }
                                                    }
                                                } else if (H == 6) {
                                                    if (Util.isNullOrNil(str2) || Util.isNullOrNil(str14)) {
                                                        Log.m105924i(str13, "dealFile() called with: filePath = [" + str2 + "], userName = [" + str14 + "]");
                                                    } else {
                                                        try {
                                                            int lastIndexOf = str2.lastIndexOf(47) + 1;
                                                            if (lastIndexOf < 0 || lastIndexOf == str2.length()) {
                                                                lastIndexOf = 0;
                                                            }
                                                            str9 = URLDecoder.decode(str2.substring(lastIndexOf), "UTF-8");
                                                        } catch (Exception e2) {
                                                            Log.m105920e(str13, "get file name error " + e2.getMessage());
                                                            str9 = " ";
                                                        }
                                                        WXFileObject wXFileObject = new WXFileObject();
                                                        wXFileObject.setFilePath(str2);
                                                        WXMediaMessage wXMediaMessage3 = new WXMediaMessage();
                                                        wXMediaMessage3.mediaObject = wXFileObject;
                                                        wXMediaMessage3.title = str9;
                                                        wXMediaMessage3.description = str9;
                                                        sendAppMessageWrapperUI3.mo119868L7(wXMediaMessage3, "", 0);
                                                    }
                                                } else if (H != 19) {
                                                    sendAppMessageWrapperUI3.mo119873Q7(str14, sendAppMessageWrapperUI3.getString(C0966R.string.n4v));
                                                    Log.m105929w(str13, "dealAppMsg: unsupport type:%s", Integer.valueOf(H));
                                                } else if (Util.isNullOrNil(h) || Util.isNullOrNil(str14)) {
                                                    Log.m105924i(str13, "dealRecord() called with: msgContent = [" + h + "], userName = [" + str14 + "]");
                                                } else {
                                                    C68070l.C68072b u2 = C68070l.C68072b.m80422u(h, (String) null);
                                                    if (u2 != null) {
                                                        C77915dp3 x = C101147j0.m132643x(u2.f195571f0);
                                                        String str15 = (x == null || Util.isNullOrNil(x.f227153d)) ? u2.f195570f : x.f227153d;
                                                        u2.f195562d = sendAppMessageWrapperUI3.f250363e.field_appId;
                                                        u2.f195570f = sendAppMessageWrapperUI3.getContext().getString(C0966R.string.f361119hg0, new Object[]{str15});
                                                        RecordOperationEvent recordOperationEvent = new RecordOperationEvent();
                                                        recordOperationEvent.f265027d.f265029a = 4;
                                                        C72963f4 f4Var = new C72963f4();
                                                        f4Var.mo108732L2(C68070l.C68072b.m80420s(u2, (String) null, (C98121d) null));
                                                        RecordOperationEvent.C92551a aVar2 = recordOperationEvent.f265027d;
                                                        aVar2.f265039k = f4Var;
                                                        aVar2.f265033e = str14;
                                                        aVar2.f265046r = true;
                                                        recordOperationEvent.publish();
                                                    } else {
                                                        Log.m105920e(str13, "dealRecord fail msg content is null");
                                                    }
                                                }
                                            }
                                        }
                                        str4 = str11;
                                        linkedList = linkedList2;
                                        i2 = i7;
                                    }
                                } else {
                                    list2 = list3;
                                    str4 = str11;
                                    linkedList = linkedList2;
                                    i2 = i7;
                                    i6 = i9;
                                    i5 = i15;
                                    C100760a0.C100764f a = C100760a0.m131931a(str14);
                                    a.f295187a = str14;
                                    a.f295189c = h;
                                    a.f295190d = 48;
                                    a.f295191e = 0;
                                    a.f295194h = 4;
                                    a.mo140195a().mo123694a();
                                }
                                str6 = h;
                                str7 = str13;
                                sendAppMessageWrapperUI = sendAppMessageWrapperUI3;
                                str5 = str;
                                i3 = i6;
                                i4 = i5;
                            } else {
                                list2 = list3;
                                str4 = str11;
                                linkedList = linkedList2;
                                i2 = i7;
                                int i16 = i9;
                                int i17 = i15;
                                if (Util.isNullOrNil(str) || Util.isNullOrNil(str14)) {
                                    str6 = h;
                                    sendAppMessageWrapperUI2 = sendAppMessageWrapperUI3;
                                    str5 = str;
                                    i3 = i16;
                                    i4 = i17;
                                    str7 = str13;
                                    Log.m105924i(str7, "dealImgMsg() called with: filePath = [" + str5 + "], userName = [" + str14 + "]");
                                } else {
                                    i3 = i16;
                                    str6 = h;
                                    i4 = i17;
                                    sendAppMessageWrapperUI2 = sendAppMessageWrapperUI3;
                                    C7250m.m7431a().mo136256TG(sendAppMessageWrapperUI3, str14, str, 0, "", "", (C100765f) null);
                                    str5 = str;
                                    str7 = str13;
                                }
                                sendAppMessageWrapperUI = sendAppMessageWrapperUI2;
                            }
                        } else {
                            iVar2 = iVar3;
                            list2 = list3;
                            str4 = str11;
                            linkedList = linkedList2;
                            i2 = i7;
                            i3 = i9;
                            str6 = h;
                            i4 = i15;
                            str7 = str13;
                            sendAppMessageWrapperUI = sendAppMessageWrapperUI3;
                            str5 = str;
                            sendAppMessageWrapperUI.mo119873Q7(str14, str6);
                        }
                        if (!Util.isNullOrNil(str4)) {
                            str8 = str4;
                            C7250m.m7431a().mo136252Ar(str8, sendAppMessageWrapperUI.f250364f);
                        } else {
                            str8 = str4;
                        }
                        i15 = i4 + 1;
                        str13 = str7;
                        sendAppMessageWrapperUI3 = sendAppMessageWrapperUI;
                        h = str6;
                        str11 = str8;
                        str = str5;
                        iVar3 = iVar2;
                        list3 = list2;
                        linkedList2 = linkedList;
                        Map map3 = map;
                        i9 = i3;
                        i7 = i2;
                    }
                    iVar = iVar3;
                    list = list3;
                    LinkedList linkedList3 = linkedList2;
                    i = i7;
                    str3 = str11;
                    sendAppMessageWrapperUI3.mo119870N7("", linkedList3, 0);
                    i7 = i + 1;
                    map2 = map;
                    str11 = str3;
                    iVar3 = iVar;
                    list3 = list;
                    c = 0;
                }
            }
            iVar = iVar3;
            list = list3;
            str3 = str11;
            i = i7;
            i7 = i + 1;
            map2 = map;
            str11 = str3;
            iVar3 = iVar;
            list3 = list;
            c = 0;
        }
    }
}
