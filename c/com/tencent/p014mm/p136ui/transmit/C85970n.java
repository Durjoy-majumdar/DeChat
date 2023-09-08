package com.tencent.p014mm.p136ui.transmit;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.RecordOperationEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.modelimage.C80999a;
import com.tencent.p014mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.p014mm.opensdk.modelmsg.WXDynamicVideoMiniProgramObject;
import com.tencent.p014mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.p014mm.opensdk.modelmsg.WXEnterpriseCardObject;
import com.tencent.p014mm.opensdk.modelmsg.WXFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXGameVideoFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXImageObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicVideoObject;
import com.tencent.p014mm.opensdk.modelmsg.WXVideoFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXWeWorkObject;
import com.tencent.p014mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.gamesharecard.LiteAppBizDataInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C96790t0;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72681a;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C86493v0;
import f40.C86709a0;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import i61.C98602h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import kr0.C76629w0;
import lc3.C10485b;
import ld2.C46848g;
import ob0.C47350c;
import ob0.C89144l0;
import org.json.JSONObject;
import p1081gi.C98121d;
import p763ym.C79138l;
import pc0.C100760a0;
import qg2.C101147j0;
import rn3.C48057a1;
import rn3.C48058u0;
import rn3.C48059v0;
import rn3.C48060w0;
import rn3.C48061x0;
import rn3.C48062y0;
import rn3.C48063z0;
import rn3.C90051c1;
import rn3.C90052d1;
import rn3.C90053e1;
import rn3.C90054f1;
import rn3.C90066z;
import rx3.C13598b0;
import t90.C77877a;
import te3.C77915dp3;
import te3.h44;
import te3.j25;
import te3.k55;
import te3.v45;
import te3.w45;
import z04.C112551y;
import z51.C39315g;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.transmit.n */
public final class C85970n {

    /* renamed from: a */
    public static final C85970n f250401a = new C85970n();

    /* renamed from: com.tencent.mm.ui.transmit.n$c */
    public static final class C45091c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f122304d;

        /* renamed from: e */
        public final /* synthetic */ C32227p<Integer, String, C13598b0> f122305e;

        public C45091c(String str, C32227p<? super Integer, ? super String, C13598b0> pVar) {
            this.f122304d = str;
            this.f122305e = pVar;
        }

        public final void run() {
            C46848g.vx0();
            String str = C46848g.xx0() + "content_" + Util.nowMilliSecond();
            Log.m105924i("MicroMsg.SendWXMediaMessageHelper", "doCheckAndCopyFile filename: " + str + ", ret: " + C86013q1.m106443d(this.f122304d, str, false));
            this.f122305e.invoke(2, str);
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.n$a */
    public interface C85971a {

        /* renamed from: com.tencent.mm.ui.transmit.n$a$a */
        public static final class C85972a {
            /* renamed from: a */
            public static /* synthetic */ void m106303a(C85971a aVar, int i, Object obj, int i2, Object obj2) {
                if (obj2 == null) {
                    if ((i2 & 2) != 0) {
                        obj = null;
                    }
                    ((SendAppMessageWrapperUI.C85960a) aVar).mo119878a(i, obj);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCall");
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.n$b */
    public static final class C85973b {

        /* renamed from: a */
        public boolean f250402a = true;

        /* renamed from: b */
        public String f250403b = null;

        /* renamed from: c */
        public String f250404c = null;

        /* renamed from: d */
        public LiteAppBizDataInfo f250405d = null;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C85973b)) {
                return false;
            }
            C85973b bVar = (C85973b) obj;
            return this.f250402a == bVar.f250402a && C87412m.m108589b(this.f250403b, bVar.f250403b) && C87412m.m108589b(this.f250404c, bVar.f250404c) && C87412m.m108589b(this.f250405d, bVar.f250405d);
        }

        public int hashCode() {
            boolean z = this.f250402a;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            String str = this.f250403b;
            int i2 = 0;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f250404c;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            LiteAppBizDataInfo liteAppBizDataInfo = this.f250405d;
            if (liteAppBizDataInfo != null) {
                i2 = liteAppBizDataInfo.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            return "SendWXMediaMessageExtInfo(ifSetTodo=" + this.f250402a + ", platformSignature=" + this.f250403b + ", gameShareMsgId=" + this.f250404c + ", liteAppBizDataInfo=" + this.f250405d + ')';
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.n$d */
    public static final class C85974d extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Context f250406d;

        /* renamed from: e */
        public final /* synthetic */ Intent f250407e;

        /* renamed from: f */
        public final /* synthetic */ C44561j f250408f;

        /* renamed from: g */
        public final /* synthetic */ WXMediaMessage f250409g;

        /* renamed from: h */
        public final /* synthetic */ LinkedList<String> f250410h;

        /* renamed from: i */
        public final /* synthetic */ int f250411i;

        /* renamed from: j */
        public final /* synthetic */ boolean f250412j;

        /* renamed from: n */
        public final /* synthetic */ boolean f250413n;

        /* renamed from: o */
        public final /* synthetic */ String f250414o;

        /* renamed from: p */
        public final /* synthetic */ int f250415p;

        /* renamed from: q */
        public final /* synthetic */ String f250416q;

        /* renamed from: r */
        public final /* synthetic */ int f250417r;

        /* renamed from: s */
        public final /* synthetic */ C85971a f250418s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85974d(Context context, Intent intent, C44561j jVar, WXMediaMessage wXMediaMessage, LinkedList<String> linkedList, int i, boolean z, boolean z2, String str, int i2, String str2, int i3, C85971a aVar) {
            super(1);
            this.f250406d = context;
            this.f250407e = intent;
            this.f250408f = jVar;
            this.f250409g = wXMediaMessage;
            this.f250410h = linkedList;
            this.f250411i = i;
            this.f250412j = z;
            this.f250413n = z2;
            this.f250414o = str;
            this.f250415p = i2;
            this.f250416q = str2;
            this.f250417r = i3;
            this.f250418s = aVar;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            Log.m105924i("MicroMsg.SendWXMediaMessageHelper", "checkAndCopyFileIfNeed  callBack:" + intValue);
            if (intValue == 0) {
                C85970n.m106293e(C85970n.f250401a, this.f250406d, this.f250407e, this.f250408f, this.f250409g, this.f250410h, this.f250411i, this.f250412j, this.f250413n, this.f250414o, this.f250415p, this.f250416q, this.f250417r, this.f250418s, (C85973b) null, 8192, (Object) null);
            } else if (intValue == 2) {
                C85970n.m106293e(C85970n.f250401a, this.f250406d, this.f250407e, this.f250408f, this.f250409g, this.f250410h, this.f250411i, this.f250412j, this.f250413n, this.f250414o, this.f250415p, this.f250416q, this.f250417r, this.f250418s, (C85973b) null, 8192, (Object) null);
            } else if (intValue == 3) {
                Log.m105920e("MicroMsg.SendWXMediaMessageHelper", "sendWXMediaMessage fail, WXMediaMessage file check fail");
                C85971a aVar = this.f250418s;
                if (aVar != null) {
                    ((SendAppMessageWrapperUI.C85960a) aVar).mo119878a(3, "cb_key_file_check_invalid");
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m106292a(C85970n nVar, C68070l.C68072b bVar, k55 k55) {
        nVar.getClass();
        C77877a aVar = new C77877a();
        if (k55 != null) {
            aVar.f226900b = k55.f136575j;
            bVar.f195483E2 = k55.f136576n;
            Log.m105924i("MicroMsg.SendWXMediaMessageHelper", "sendSecretAppMsg isSecretMsg: " + aVar.f226900b + ", forwardFlag: " + bVar.f195483E2);
        }
        bVar.mo93545f(aVar);
    }

    /* renamed from: e */
    public static /* synthetic */ void m106293e(C85970n nVar, Context context, Intent intent, C44561j jVar, WXMediaMessage wXMediaMessage, LinkedList linkedList, int i, boolean z, boolean z2, String str, int i2, String str2, int i3, C85971a aVar, C85973b bVar, int i4, Object obj) {
        nVar.mo119884d(context, intent, jVar, wXMediaMessage, linkedList, i, z, z2, str, i2, str2, i3, aVar, (i4 & 8192) != 0 ? null : bVar);
    }

    /* renamed from: i */
    public static /* synthetic */ C72681a m106294i(C85970n nVar, boolean z, String str, String str2, C85973b bVar, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            bVar = null;
        }
        return nVar.mo119887h(z, str, str2, bVar);
    }

    /* renamed from: k */
    public static final void m106295k(Context context, Intent intent, C44561j jVar, WXMediaMessage wXMediaMessage, LinkedList<String> linkedList, int i, boolean z, boolean z2, String str, int i2, String str2, int i3, C85971a aVar, C85973b bVar) {
        WXMediaMessage wXMediaMessage2 = wXMediaMessage;
        int i4 = i3;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(jVar, "app");
        C87412m.m108594g(str, "pkgName");
        if (wXMediaMessage2 == null) {
            Log.m105920e("MicroMsg.SendWXMediaMessageHelper", "sendWXMediaMessage fail, WXMediaMessage = null");
            if (aVar != null) {
                ((SendAppMessageWrapperUI.C85960a) aVar).mo119878a(3, "cb_msg_is_null");
                return;
            }
            return;
        }
        if (linkedList == null || linkedList.isEmpty()) {
            Log.m105920e("MicroMsg.SendWXMediaMessageHelper", "sendWXMediaMessage fail, toUserList is Empty");
            if (aVar != null) {
                ((SendAppMessageWrapperUI.C85960a) aVar).mo119878a(3, "cb_key_user_list_is_empty");
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.SendWXMediaMessageHelper", "sendWXMediaMessage  type:" + wXMediaMessage.getType() + "  scene:" + i4);
        if (i4 == 2) {
            C85974d dVar = r0;
            C85970n nVar = f250401a;
            C85974d dVar2 = new C85974d(context, intent, jVar, wXMediaMessage, linkedList, i, z, z2, str, i2, str2, i3, aVar);
            WXMediaMessage.IMediaObject iMediaObject = wXMediaMessage2.mediaObject;
            if (iMediaObject instanceof WXImageObject) {
                C87412m.m108592e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXImageObject");
                WXImageObject wXImageObject = (WXImageObject) iMediaObject;
                String str3 = wXImageObject.imagePath;
                C87412m.m108593f(str3, "o.imagePath");
                nVar.mo119883c(str3, new C48058u0(wXImageObject, dVar));
                return;
            }
            C85970n nVar2 = nVar;
            if (iMediaObject instanceof WXFileObject) {
                C87412m.m108592e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXFileObject");
                WXFileObject wXFileObject = (WXFileObject) iMediaObject;
                String str4 = wXFileObject.filePath;
                C87412m.m108593f(str4, "o.filePath");
                nVar2.mo119883c(str4, new C48059v0(wXFileObject, dVar));
            } else if (iMediaObject instanceof WXEmojiObject) {
                C87412m.m108592e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXEmojiObject");
                WXEmojiObject wXEmojiObject = (WXEmojiObject) iMediaObject;
                String str5 = wXEmojiObject.emojiPath;
                C87412m.m108593f(str5, "o.emojiPath");
                nVar2.mo119883c(str5, new C48060w0(wXEmojiObject, dVar));
            } else if (iMediaObject instanceof WXVideoFileObject) {
                C87412m.m108592e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXVideoFileObject");
                WXVideoFileObject wXVideoFileObject = (WXVideoFileObject) iMediaObject;
                String str6 = wXVideoFileObject.filePath;
                C87412m.m108593f(str6, "o.filePath");
                nVar2.mo119883c(str6, new C48061x0(wXVideoFileObject, dVar));
            } else if (iMediaObject instanceof WXGameVideoFileObject) {
                C87412m.m108592e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXGameVideoFileObject");
                WXGameVideoFileObject wXGameVideoFileObject = (WXGameVideoFileObject) iMediaObject;
                String str7 = wXGameVideoFileObject.filePath;
                C87412m.m108593f(str7, "o.filePath");
                nVar2.mo119883c(str7, new C48062y0(wXGameVideoFileObject, dVar));
            } else if (iMediaObject instanceof WXAppExtendObject) {
                C87412m.m108592e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXAppExtendObject");
                WXAppExtendObject wXAppExtendObject = (WXAppExtendObject) iMediaObject;
                String str8 = wXAppExtendObject.filePath;
                C87412m.m108593f(str8, "o.filePath");
                nVar2.mo119883c(str8, new C48063z0(wXAppExtendObject, dVar));
            } else if (iMediaObject instanceof WXMusicVideoObject) {
                C87412m.m108592e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject");
                WXMusicVideoObject wXMusicVideoObject = (WXMusicVideoObject) iMediaObject;
                String str9 = wXMusicVideoObject.hdAlbumThumbFilePath;
                C87412m.m108593f(str9, "o.hdAlbumThumbFilePath");
                nVar2.mo119883c(str9, new C48057a1(wXMusicVideoObject, dVar));
            } else {
                dVar.invoke(0);
            }
        } else {
            f250401a.mo119884d(context, intent, jVar, wXMediaMessage, linkedList, i, z, z2, str, i2, str2, i3, aVar, bVar);
        }
    }

    /* renamed from: b */
    public final void mo119882b(WxaAttributes wxaAttributes, C68070l.C68072b bVar, k55 k55, C85973b bVar2) {
        h44 h44;
        C80995a aVar = new C80995a();
        boolean z = false;
        aVar.f237906o = wxaAttributes.mo113940m2() != null ? wxaAttributes.mo113940m2().f239500p : 0;
        aVar.f237908q = wxaAttributes.mo113940m2() != null ? wxaAttributes.mo113940m2().f239501q : 0;
        if (k55 != null) {
            boolean z2 = k55.f136572g;
            aVar.f237896e = z2;
            if (z2 && (h44 = k55.f136571f) != null) {
                aVar.f237897f = h44.f259542d;
                aVar.f237898g = h44.f259543e;
                aVar.f237899h = h44.f259544f;
                aVar.f237900i = h44.f259545g;
                aVar.f237901j = h44.f259546h;
                aVar.f237902k = h44.f259549n;
                aVar.f237904m = h44.f259548j;
                aVar.f237903l = h44.f259547i;
            }
            boolean z3 = k55.f136575j;
            aVar.f237912u = z3;
            if (z3) {
                bVar.f195605n2 = 1;
            }
        }
        if (bVar2 != null) {
            z = bVar2.f250402a;
        }
        aVar.f237892I = z;
        bVar.mo93545f(aVar);
    }

    /* renamed from: c */
    public final void mo119883c(String str, C32227p<? super Integer, ? super String, C13598b0> pVar) {
        if (!((C79138l) C86312j.m106911c(C79138l.class)).mo73985Ae(str)) {
            pVar.invoke(3, null);
        } else if (C112551y.m153819s(str, "content", false)) {
            pVar.invoke(1, null);
            ((C119157j) C119157j.f356862d).mo183876g(new C45091c(str, pVar), "SendWXMediaMessageCopyFile");
        }
    }

    /* renamed from: d */
    public final void mo119884d(Context context, Intent intent, C44561j jVar, WXMediaMessage wXMediaMessage, LinkedList<String> linkedList, int i, boolean z, boolean z2, String str, int i2, String str2, int i3, C85971a aVar, C85973b bVar) {
        String str3;
        String str4;
        char c;
        String str5;
        C85971a aVar2;
        Object obj;
        int i4;
        String str6;
        Context context2 = context;
        Intent intent2 = intent;
        C44561j jVar2 = jVar;
        WXMediaMessage wXMediaMessage2 = wXMediaMessage;
        String str7 = str2;
        int i5 = i3;
        C85971a aVar3 = aVar;
        C85973b bVar2 = bVar;
        String str8 = "MicroMsg.SendWXMediaMessageHelper";
        Log.m105924i(str8, "doSendWXMediaMessage  type:" + wXMediaMessage.getType() + "  scene:" + i5);
        int type = wXMediaMessage.getType();
        String str9 = "";
        if (type == 2) {
            LinkedList<String> linkedList2 = linkedList;
            String str10 = str8;
            C85971a aVar4 = aVar3;
            WXMediaMessage.IMediaObject iMediaObject = wXMediaMessage2.mediaObject;
            if (!(iMediaObject instanceof WXImageObject)) {
                Log.m105928w(str10, "sendImgMsg msg not img");
                str3 = null;
            } else {
                C87412m.m108592e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXImageObject");
                WXImageObject wXImageObject = (WXImageObject) iMediaObject;
                if (!Util.isNullOrNil(wXImageObject.imageData)) {
                    Log.m105918d(str10, "getImagePath fileData:" + wXImageObject.imageData.length);
                    str3 = C72695v.m85083y(wXImageObject.imageData);
                } else {
                    str3 = wXImageObject.imagePath;
                }
            }
            if (!(str3 == null || C112551y.m153811k(str3))) {
                C85971a aVar5 = aVar4;
                mo119886g(jVar2);
                if (aVar5 != null) {
                    C85971a.C85972a.m106303a(aVar5, 1, (Object) null, 2, (Object) null);
                }
                int i6 = 100;
                int i7 = Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("PicCompressAvoidanceActiveSizeNormal"), 100);
                if (i7 > 0) {
                    i6 = i7;
                }
                int i8 = i6 * 1024;
                long l = C86013q1.m106451l(str3);
                int i9 = (l > 26214400 || l <= ((long) i8)) ? 0 : 1;
                if (z || !z2) {
                    C80999a aVar6 = new C80999a(jVar2.field_appId, wXMediaMessage2.mediaTagName, wXMediaMessage2.messageExt, wXMediaMessage2.messageAction);
                    C85973b bVar3 = bVar;
                    aVar6.f237932f = bVar3 != null ? bVar3.f250403b : null;
                    WXMediaMessage.IMediaObject iMediaObject2 = wXMediaMessage2.mediaObject;
                    if (iMediaObject2 instanceof WXImageObject) {
                        C87412m.m108592e(iMediaObject2, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXImageObject");
                        aVar6.f237931e = ((WXImageObject) iMediaObject2).imgDataHash;
                    }
                    str4 = C80999a.m98902b(C80999a.m98901a(aVar6));
                } else {
                    str4 = null;
                }
                Iterator<String> it = linkedList.iterator();
                while (it.hasNext()) {
                    C100760a0.C100764f b = C100760a0.m131932b(C100760a0.C100763e.IMAGE);
                    b.f295195i = 6;
                    b.f295188b = C75592q0.m90789s();
                    b.f295187a = it.next();
                    b.f295196j = str3;
                    b.f295197k = i9;
                    b.f295198l = null;
                    b.f295200n = 0;
                    b.f295204r = str4;
                    b.f295205s = str9;
                    b.f295202p = true;
                    b.f295201o = C0966R.C0969drawable.bec;
                    b.f295194h = 11;
                    b.mo140195a().mo123694a();
                }
                if (aVar5 != null) {
                    C85971a.C85972a.m106303a(aVar5, 2, (Object) null, 2, (Object) null);
                }
            } else if (aVar4 != null) {
                C85971a.C85972a.m106303a(aVar4, 3, (Object) null, 2, (Object) null);
            }
        } else if (type == 5) {
            String str11 = str8;
            WXMediaMessage.IMediaObject iMediaObject3 = wXMediaMessage2.mediaObject;
            C87412m.m108592e(iMediaObject3, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXWebpageObject");
            WXWebpageObject wXWebpageObject = (WXWebpageObject) iMediaObject3;
            if (wXWebpageObject.isSecretMessage) {
                if (aVar3 != null) {
                    C85971a.C85972a.m106303a(aVar3, 1, (Object) null, 2, (Object) null);
                }
                String str12 = wXWebpageObject.webpageUrl;
                C87412m.m108593f(str12, "webObject.webpageUrl");
                Iterator<String> it4 = linkedList.iterator();
                while (it4.hasNext()) {
                    String next = it4.next();
                    j25 j25 = new j25();
                    j25.f135834g = C72996z1.m85820U5(next) ? 2 : 1;
                    j25.f135835h = next;
                    j25.f135832e = str12;
                    j25.f135833f = jVar2.field_appId;
                    j25.f135836i = 1;
                    C115669n.INSTANCE.mo160131h(23341, Integer.valueOf(j25.f135831d), j25.f135832e, Integer.valueOf(j25.f135836i), j25.f135833f, Integer.valueOf(j25.f135834g), j25.f135835h, Integer.valueOf(j25.f135837j));
                }
                C47350c.C47352b bVar4 = new C47350c.C47352b();
                bVar4.f127069d = 1118;
                bVar4.f127068c = "/cgi-bin/mmbiz-bin/wxaapp/getshareinfo";
                v45 v45 = new v45();
                v45.f259867d = jVar2.field_appId;
                v45.f259868e = linkedList;
                WXMediaMessage.IMediaObject iMediaObject4 = wXMediaMessage2.mediaObject;
                C87412m.m108592e(iMediaObject4, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXWebpageObject");
                WXWebpageObject wXWebpageObject2 = (WXWebpageObject) iMediaObject4;
                try {
                    JSONObject jSONObject = new JSONObject();
                    HashMap<String, String> hashMap = wXWebpageObject2.extraInfoMap;
                    if (hashMap != null) {
                        Set<String> keySet = hashMap.keySet();
                        C87412m.m108593f(keySet, "extraInfo.keys");
                        for (String next2 : keySet) {
                            String str13 = hashMap.get(next2);
                            if (!Util.isNullOrNil(str13)) {
                                jSONObject.put(next2, str13);
                            }
                        }
                    }
                    Log.m105924i(str11, "getSecretMsgActivityInfo data: " + jSONObject);
                    str5 = jSONObject.toString();
                    c = 0;
                } catch (Exception e) {
                    c = 0;
                    Log.printErrStackTrace(str11, e, "getSecretMsgActivityInfo exception", new Object[0]);
                    str5 = null;
                }
                v45.f259870g = str5;
                v45.f259873j = true;
                v45.f259874n = 6;
                Object[] objArr = new Object[4];
                objArr[c] = v45.f259867d;
                objArr[1] = str5;
                objArr[2] = Boolean.TRUE;
                objArr[3] = 6;
                Log.m105919d(str11, "sendSecretAppMsg appId: %s, activityInfo: %s, isSecretMsg: %s, sourceType: %d", objArr);
                bVar4.f127066a = v45;
                bVar4.f127067b = new w45();
                C89144l0.m111429e(bVar4.mo72403a(), new C90053e1(linkedList, jVar, z, z2, wXMediaMessage, i, str, bVar), false);
                if (aVar3 != null) {
                    C85971a.C85972a.m106303a(aVar3, 2, (Object) null, 2, (Object) null);
                    return;
                }
                return;
            }
            LinkedList<String> linkedList3 = linkedList;
            if (aVar3 != null) {
                C85971a.C85972a.m106303a(aVar3, 1, (Object) null, 2, (Object) null);
            }
            C85971a aVar7 = aVar3;
            mo119888j(jVar, wXMediaMessage, linkedList, (String) null, mo119886g(jVar2), i, z, z2, str, "", (Object) null, aVar, bVar);
            if (aVar7 != null) {
                C85971a.C85972a.m106303a(aVar7, 2, (Object) null, 2, (Object) null);
            }
        } else if (type != 8) {
            if (type == 36) {
                obj = null;
                i4 = 2;
                C85971a aVar8 = aVar3;
                C85973b bVar5 = bVar2;
                aVar2 = aVar8;
            } else if (type == 38) {
                C85971a aVar9 = aVar3;
                ArrayList arrayList = new ArrayList();
                WXMediaMessage.IMediaObject iMediaObject5 = wXMediaMessage2.mediaObject;
                C87412m.m108592e(iMediaObject5, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXVideoFileObject");
                arrayList.add(((WXVideoFileObject) iMediaObject5).filePath);
                if (aVar9 != null) {
                    C85971a.C85972a.m106303a(aVar9, 1, (Object) null, 2, (Object) null);
                }
                if (arrayList.size() > 0) {
                    Iterator<String> it5 = linkedList.iterator();
                    while (it5.hasNext()) {
                        C96790t0 t0Var = r1;
                        ArrayList arrayList2 = arrayList;
                        String str14 = str8;
                        C96790t0 t0Var2 = new C96790t0(context, arrayList, intent, it5.next(), 1, new C90054f1(aVar9), false);
                        if (z || !z2) {
                            t0Var.f283542j = new C80999a(jVar2.field_appId, wXMediaMessage2.mediaTagName, wXMediaMessage2.messageExt, wXMediaMessage2.messageAction);
                        } else {
                            t0Var.f283542j = null;
                        }
                        if (!Util.isNullOrNil(str2)) {
                            str6 = str2;
                            t0Var.f283543n = str6;
                        } else {
                            str6 = str2;
                        }
                        String str15 = str14;
                        Log.m105924i(str15, "sendMultiVideo videoTransPara: " + str6);
                        ThreadPool.post(t0Var, "ChattingUI_importMultiVideo");
                        if (aVar9 != null) {
                            ((SendAppMessageWrapperUI.C85960a) aVar9).mo119878a(2, t0Var);
                        }
                        str8 = str15;
                        arrayList = arrayList2;
                    }
                    return;
                } else if (aVar9 != null) {
                    C85971a.C85972a.m106303a(aVar9, 2, (Object) null, 2, (Object) null);
                    return;
                } else {
                    return;
                }
            } else if (type == 76) {
                C85971a aVar10 = aVar3;
                C85973b bVar6 = bVar2;
                C85971a aVar11 = aVar10;
                String g = mo119886g(jVar2);
                WXMediaMessage.IMediaObject iMediaObject6 = wXMediaMessage2.mediaObject;
                C87412m.m108592e(iMediaObject6, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject");
                WXMusicVideoObject wXMusicVideoObject = (WXMusicVideoObject) iMediaObject6;
                if (aVar11 != null) {
                    C85971a.C85972a.m106303a(aVar11, 1, (Object) null, 2, (Object) null);
                }
                String str16 = wXMusicVideoObject.hdAlbumThumbFilePath;
                if (!Util.isNullOrNil(str16)) {
                    ((C119157j) C119157j.f356862d).mo183876g(new C90066z(str16, new C90052d1(aVar, jVar, wXMediaMessage, linkedList, (String) null, g, i, z, z2, str, bVar)), "MusicVideoShareUploadImage");
                    return;
                }
                C85971a aVar12 = aVar11;
                C85971a aVar13 = aVar;
                mo119888j(jVar, wXMediaMessage, linkedList, (String) null, g, i, z, z2, str, "", (Object) null, aVar13, bVar);
                if (aVar13 != null) {
                    C85971a.C85972a.m106303a(aVar13, 2, (Object) null, 2, (Object) null);
                    return;
                }
                return;
            } else if (type == 101) {
                C85973b bVar7 = bVar2;
                C85971a aVar14 = aVar3;
                if (bVar7 != null) {
                    bVar7.f250404c = intent2.getStringExtra("kWXEntryActivity_bundle_game_share_card_msgid");
                }
                if (bVar7 != null) {
                    bVar7.f250405d = (LiteAppBizDataInfo) intent2.getParcelableExtra("kWXEntryActivity_bundle_game_share_card_liteapp");
                }
                if (aVar14 != null) {
                    C85971a.C85972a.m106303a(aVar14, 1, (Object) null, 2, (Object) null);
                }
                C85973b bVar8 = bVar7;
                mo119888j(jVar, wXMediaMessage, linkedList, (String) null, (String) null, i, z, z2, str, "", (Object) null, aVar, bVar);
                if (aVar14 != null) {
                    C85971a.C85972a.m106303a(aVar14, 2, (Object) null, 2, (Object) null);
                    return;
                }
                return;
            } else if (type == 45) {
                C85971a aVar15 = aVar3;
                WXMediaMessage.IMediaObject iMediaObject7 = wXMediaMessage2.mediaObject;
                C87412m.m108592e(iMediaObject7, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXEnterpriseCardObject");
                WXEnterpriseCardObject wXEnterpriseCardObject = (WXEnterpriseCardObject) iMediaObject7;
                int i15 = wXEnterpriseCardObject.msgType;
                if (i15 == 66 || i15 == 42) {
                    if (aVar15 != null) {
                        C85971a.C85972a.m106303a(aVar15, 1, (Object) null, 2, (Object) null);
                    }
                    Iterator<String> it6 = linkedList.iterator();
                    while (it6.hasNext()) {
                        String next3 = it6.next();
                        C100760a0.C100764f a = C100760a0.m131931a(next3);
                        a.f295187a = next3;
                        a.f295189c = wXEnterpriseCardObject.cardInfo;
                        a.f295190d = wXEnterpriseCardObject.msgType;
                        a.f295191e = 0;
                        a.f295194h = 4;
                        a.mo140195a().mo123694a();
                    }
                    if (aVar15 != null) {
                        C85971a.C85972a.m106303a(aVar15, 2, (Object) null, 2, (Object) null);
                        return;
                    }
                    return;
                }
                Log.m105920e(str8, "sendCardMsg msgType invalid");
                if (aVar15 != null) {
                    C85971a.C85972a.m106303a(aVar15, 3, (Object) null, 2, (Object) null);
                    return;
                }
                return;
            } else if (type == 46 || type == 48) {
                obj = null;
                aVar2 = aVar3;
                i4 = 2;
                C85973b bVar9 = bVar;
            } else if (type != 49) {
                if (aVar3 != null) {
                    C85971a.C85972a.m106303a(aVar3, 1, (Object) null, 2, (Object) null);
                }
                C85971a aVar16 = aVar3;
                mo119888j(jVar, wXMediaMessage, linkedList, (String) null, (String) null, i, z, z2, str, "", (Object) null, aVar, bVar);
                if (aVar16 != null) {
                    C85971a.C85972a.m106303a(aVar16, 2, (Object) null, 2, (Object) null);
                    return;
                }
                return;
            } else {
                C85971a aVar17 = aVar3;
                C86493v0.C86495c c2 = C86493v0.m107224d().mo120947c("kWXEntryActivity_data_center_session_id", true);
                if (c2 == null) {
                    Log.m105920e(str8, "sendWXWeworkObject fail values is null");
                    if (aVar17 != null) {
                        C85971a.C85972a.m106303a(aVar17, 3, (Object) null, 2, (Object) null);
                        return;
                    }
                    return;
                }
                WXMediaMessage.IMediaObject iMediaObject8 = wXMediaMessage2.mediaObject;
                C87412m.m108592e(iMediaObject8, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXWeWorkObject");
                if (((C79138l) C86312j.m106911c(C79138l.class)).ta0(((WXWeWorkObject) iMediaObject8).subType) < 0) {
                    Log.m105920e(str8, "sendWXWeworkObject fail innerType < 0");
                    if (aVar17 != null) {
                        C85971a.C85972a.m106303a(aVar17, 3, (Object) null, 2, (Object) null);
                        return;
                    }
                    return;
                }
                C68070l.C68072b u = C68070l.C68072b.m80422u((String) c2.mo120956c("kWXEntryActivity_data_center_wework_msgcontent", str9), (String) null);
                if (u != null) {
                    C77915dp3 x = C101147j0.m132643x(u.f195571f0);
                    String str17 = (x == null || Util.isNullOrNil(x.f227153d)) ? u.f195570f : x.f227153d;
                    if (aVar17 != null) {
                        C85971a.C85972a.m106303a(aVar17, 1, (Object) null, 2, (Object) null);
                    }
                    String str18 = jVar2.field_appId;
                    C87412m.m108593f(str18, "app.field_appId");
                    if (z || !z2) {
                        str9 = str18;
                    }
                    u.f195562d = str9;
                    u.f195570f = context2.getString(C0966R.string.f361119hg0, new Object[]{str17});
                    Iterator<String> it7 = linkedList.iterator();
                    while (it7.hasNext()) {
                        RecordOperationEvent recordOperationEvent = new RecordOperationEvent();
                        recordOperationEvent.f265027d.f265029a = 4;
                        C72963f4 f4Var = new C72963f4();
                        f4Var.mo108732L2(C68070l.C68072b.m80420s(u, (String) null, (C98121d) null));
                        RecordOperationEvent.C92551a aVar18 = recordOperationEvent.f265027d;
                        aVar18.f265039k = f4Var;
                        aVar18.f265033e = it7.next();
                        aVar18.f265046r = true;
                        recordOperationEvent.publish();
                    }
                    if (aVar17 != null) {
                        C85971a.C85972a.m106303a(aVar17, 2, (Object) null, 2, (Object) null);
                        return;
                    }
                    return;
                }
                Log.m105920e(str8, "dealWXWeWorkObject fail msg content is null");
                if (aVar17 != null) {
                    C85971a.C85972a.m106303a(aVar17, 3, (Object) null, 2, (Object) null);
                    return;
                }
                return;
            }
            WXMediaMessage.IMediaObject iMediaObject9 = wXMediaMessage2.mediaObject;
            C87412m.m108592e(iMediaObject9, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject");
            WXMiniProgramObject wXMiniProgramObject = (WXMiniProgramObject) iMediaObject9;
            if (aVar2 != null) {
                C85971a.C85972a.m106303a(aVar2, 1, obj, i4, obj);
            }
            C90051c1 c1Var = r0;
            C90051c1 c1Var2 = new C90051c1(aVar, jVar, wXMediaMessage, wXMiniProgramObject, linkedList, i, z, z2, str, i2, bVar);
            ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106882cH(wXMiniProgramObject.userName).mo123062e(c1Var);
            if (aVar2 != null) {
                C85971a.C85972a.m106303a(aVar2, 2, (Object) null, 2, (Object) null);
            }
        } else {
            String str19 = str8;
            C85971a aVar19 = aVar3;
            Class cls = C39315g.class;
            if (wXMediaMessage2.thumbData != null || i5 == 2) {
                String D = ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo137996D(context2, wXMediaMessage2, jVar2.field_appId);
                if (D == null) {
                    Log.m105926v(str19, "summerbig sendEmoji Fail cause emojiconmd5 is null");
                    if (aVar19 != null) {
                        C85971a.C85972a.m106303a(aVar19, 3, (Object) null, 2, (Object) null);
                        return;
                    }
                    return;
                }
                EmojiInfo G = ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo137999G(D);
                if (G == null) {
                    Log.m105924i(str19, "emoji is null.");
                    if (aVar19 != null) {
                        C85971a.C85972a.m106303a(aVar19, 3, (Object) null, 2, (Object) null);
                        return;
                    }
                    return;
                }
                if (aVar19 != null) {
                    C85971a.C85972a.m106303a(aVar19, 1, (Object) null, 2, (Object) null);
                }
                mo119888j(jVar, wXMediaMessage, linkedList, D, (String) null, i, z, z2, str, "", Integer.valueOf(G.field_size), aVar, (C85973b) null);
                C85971a aVar20 = aVar;
                if (aVar20 != null) {
                    C85971a.C85972a.m106303a(aVar20, 2, (Object) null, 2, (Object) null);
                    return;
                }
                return;
            }
            Log.m105920e(str19, "summerbig code should not reach here due to WXMediaMessage::checkArgs, sendEmoji Fail cause thumbData is null");
            if (aVar19 != null) {
                C85971a.C85972a.m106303a(aVar19, 3, (Object) null, 2, (Object) null);
            }
        }
    }

    /* renamed from: f */
    public final void mo119885f(C68070l.C68072b bVar, WXMediaMessage wXMediaMessage) {
        WXMediaMessage.IMediaObject iMediaObject;
        if (bVar != null && wXMediaMessage != null && (iMediaObject = wXMediaMessage.mediaObject) != null) {
            if (iMediaObject instanceof WXDynamicVideoMiniProgramObject) {
                C87412m.m108592e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXDynamicVideoMiniProgramObject");
                WXDynamicVideoMiniProgramObject wXDynamicVideoMiniProgramObject = (WXDynamicVideoMiniProgramObject) iMediaObject;
                C80995a aVar = new C80995a();
                byte[] bArr = wXMediaMessage.thumbData;
                if (bArr != null) {
                    C87412m.m108593f(bArr, "appmsg.thumbData");
                    if (!(bArr.length == 0)) {
                        byte[] bArr2 = wXMediaMessage.thumbData;
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length);
                        if (decodeByteArray != null) {
                            aVar.f237915x = decodeByteArray.getWidth();
                            aVar.f237916y = decodeByteArray.getHeight();
                        }
                    }
                }
                aVar.f237917z = wXDynamicVideoMiniProgramObject.videoSource;
                aVar.f237884A = wXDynamicVideoMiniProgramObject.appThumbUrl;
                aVar.f237885B = 1;
                bVar.mo93545f(aVar);
                bVar.f195605n2 = wXDynamicVideoMiniProgramObject.disableforward;
                bVar.f195638w = null;
            } else if (iMediaObject instanceof WXMiniProgramObject) {
                C87412m.m108592e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject");
                bVar.f195605n2 = ((WXMiniProgramObject) iMediaObject).disableforward;
            }
        }
    }

    /* renamed from: g */
    public final String mo119886g(C44561j jVar) {
        Log.m105919d("MicroMsg.SendWXMediaMessageHelper", "report(11954), appId : %s", jVar.field_appId);
        String a = C86493v0.m107223a("app_" + jVar.field_appId);
        C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a, true);
        c.mo120962i("prePublishId", "app_" + jVar.field_appId);
        C87412m.m108593f(a, "sessionId");
        return a;
    }

    /* renamed from: h */
    public final C72681a mo119887h(boolean z, String str, String str2, C85973b bVar) {
        C72681a aVar = new C72681a();
        aVar.f211479a = z ? 1 : 0;
        aVar.f211480b = str;
        aVar.f211481c = str2;
        LiteAppBizDataInfo liteAppBizDataInfo = null;
        aVar.f211482d = bVar != null ? bVar.f250403b : null;
        aVar.f211483e = bVar != null ? bVar.f250404c : null;
        if (bVar != null) {
            liteAppBizDataInfo = bVar.f250405d;
        }
        aVar.f211484f = liteAppBizDataInfo;
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        if ((r0.length() == 0) != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if ((r0.length == 0) != false) goto L_0x0025;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo119888j(com.tencent.p014mm.pluginsdk.model.app.C44561j r18, com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage r19, java.util.LinkedList<java.lang.String> r20, java.lang.String r21, java.lang.String r22, int r23, boolean r24, boolean r25, java.lang.String r26, java.lang.String r27, java.lang.Object r28, com.tencent.p014mm.p136ui.transmit.C85970n.C85971a r29, com.tencent.p014mm.p136ui.transmit.C85970n.C85973b r30) {
        /*
            r17 = this;
            r1 = r18
            r2 = r24
            int r0 = r19.getType()
            r3 = 6
            if (r0 != r3) goto L_0x00fc
            r3 = r19
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r0 = r3.mediaObject
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXFileObject"
            gy3.C87412m.m108592e(r0, r4)
            r4 = r0
            com.tencent.mm.opensdk.modelmsg.WXFileObject r4 = (com.tencent.p014mm.opensdk.modelmsg.WXFileObject) r4
            byte[] r0 = r4.fileData
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0025
            int r0 = r0.length
            if (r0 != 0) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            if (r0 == 0) goto L_0x0035
        L_0x0025:
            java.lang.String r0 = r4.filePath
            if (r0 == 0) goto L_0x0037
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0031
            r0 = 1
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = 1
            goto L_0x003f
        L_0x0037:
            java.lang.String r0 = "MicroMsg.SDK.WXFileObject"
            java.lang.String r7 = "checkArgs fail, both arguments is null"
            com.tencent.p014mm.opensdk.utils.Log.m99044e(r0, r7)
            r0 = 0
        L_0x003f:
            java.lang.String r7 = "MicroMsg.SendWXMediaMessageHelper"
            if (r0 != 0) goto L_0x005b
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r1 = r4.filePath
            r0[r6] = r1
            java.lang.String r1 = "check security problem %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r1, r0)
            if (r29 == 0) goto L_0x005a
            r0 = 3
            r1 = r29
            com.tencent.mm.ui.transmit.SendAppMessageWrapperUI$a r1 = (com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI.C85960a) r1
            r2 = r28
            r1.mo119878a(r0, r2)
        L_0x005a:
            return
        L_0x005b:
            java.lang.String r0 = r4.filePath
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x00fe
            java.lang.String r0 = r4.filePath
            java.lang.String r8 = "fo.filePath"
            gy3.C87412m.m108593f(r0, r8)
            eb0.c r9 = eb0.C97625j3.m125812b()
            java.lang.String r9 = r9.mo105889d()
            java.lang.String r10 = "getAccStg().accAttachMentPath"
            gy3.C87412m.m108593f(r9, r10)
            boolean r0 = z04.C112551y.m153819s(r0, r9, r6)
            if (r0 != 0) goto L_0x00fe
            java.lang.String r0 = r4.filePath
            gy3.C87412m.m108593f(r0, r8)
            java.lang.String r9 = a70.C112760b.m154247s()
            java.lang.String r10 = "DATAROOT_SDCARD_DOWNLOAD_PATH()"
            gy3.C87412m.m108593f(r9, r10)
            boolean r0 = z04.C112551y.m153819s(r0, r9, r6)
            if (r0 != 0) goto L_0x00fe
            java.lang.String r0 = r4.filePath
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r9 != 0) goto L_0x00e6
            java.lang.String r10 = r4.filePath     // Catch:{ Exception -> 0x00cb }
            gy3.C87412m.m108593f(r10, r8)     // Catch:{ Exception -> 0x00cb }
            r11 = 47
            r12 = 0
            r13 = 0
            r14 = 6
            r15 = 0
            int r0 = z04.C112550d0.m153771G(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x00cb }
            int r0 = r0 + r5
            if (r0 < 0) goto L_0x00b5
            java.lang.String r5 = r4.filePath     // Catch:{ Exception -> 0x00cb }
            int r5 = r5.length()     // Catch:{ Exception -> 0x00cb }
            if (r0 != r5) goto L_0x00b4
            goto L_0x00b5
        L_0x00b4:
            r6 = r0
        L_0x00b5:
            java.lang.String r0 = r4.filePath     // Catch:{ Exception -> 0x00cb }
            gy3.C87412m.m108593f(r0, r8)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r5 = r4.filePath     // Catch:{ Exception -> 0x00cb }
            int r5 = r5.length()     // Catch:{ Exception -> 0x00cb }
            java.lang.String r0 = r0.substring(r6, r5)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r0, r5)     // Catch:{ Exception -> 0x00cb }
            goto L_0x00e6
        L_0x00cb:
            r0 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "get file name error "
            r5.append(r6)
            java.lang.String r0 = r0.getMessage()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            java.lang.String r0 = " "
        L_0x00e6:
            java.lang.String r5 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85067i()
            java.lang.String r6 = r4.filePath
            java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106454o(r6)
            java.lang.String r0 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85063e(r5, r0, r6)
            java.lang.String r5 = r4.filePath
            com.tencent.p014mm.vfs.C86013q1.m106442c(r5, r0)
            r4.filePath = r0
            goto L_0x00fe
        L_0x00fc:
            r3 = r19
        L_0x00fe:
            java.util.Iterator r0 = r20.iterator()
        L_0x0102:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x013a
            java.lang.Object r4 = r0.next()
            r7 = r4
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r4 = r1.field_appId
            java.lang.String r5 = "app.field_appId"
            gy3.C87412m.m108593f(r4, r5)
            if (r2 != 0) goto L_0x011c
            if (r25 == 0) goto L_0x011c
            java.lang.String r4 = ""
        L_0x011c:
            r5 = r4
            java.lang.String r6 = r1.field_appName
            r8 = 2
            r13 = r17
            r14 = r26
            r15 = r27
            r12 = r30
            com.tencent.mm.pluginsdk.model.app.a r16 = r13.mo119887h(r2, r14, r15, r12)
            r4 = r19
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r16
            com.tencent.p014mm.pluginsdk.model.app.C72695v.m85050C(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0102
        L_0x013a:
            r13 = r17
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.transmit.C85970n.mo119888j(com.tencent.mm.pluginsdk.model.app.j, com.tencent.mm.opensdk.modelmsg.WXMediaMessage, java.util.LinkedList, java.lang.String, java.lang.String, int, boolean, boolean, java.lang.String, java.lang.String, java.lang.Object, com.tencent.mm.ui.transmit.n$a, com.tencent.mm.ui.transmit.n$b):void");
    }
}
