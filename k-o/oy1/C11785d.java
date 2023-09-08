package oy1;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SendAppMsgEvent;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.p014mm.plugin.game.commlib.util.C41872f;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6209b4;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C45628s0;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import ke3.C88144b;
import nj3.C76879j;
import oy1.C11782b;
import p1081gi.C98124g;
import p158gt.C8451i;
import p663qo.C101213l;
import p763ym.C79138l;
import sw1.C48478n;

/* renamed from: oy1.d */
public final class C11785d {

    /* renamed from: a */
    public final C48478n.C13793h f34482a;

    /* renamed from: b */
    public final int f34483b;

    /* renamed from: c */
    public C11781a f34484c;

    /* renamed from: d */
    public String f34485d;

    /* renamed from: e */
    public boolean f34486e;

    /* renamed from: oy1.d$a */
    public static final class C11786a implements MMFragmentActivity$$f {

        /* renamed from: a */
        public final /* synthetic */ C11785d f34487a;

        /* renamed from: b */
        public final /* synthetic */ String f34488b;

        /* renamed from: c */
        public final /* synthetic */ MMFragmentActivity f34489c;

        /* renamed from: d */
        public final /* synthetic */ String f34490d;

        /* renamed from: e */
        public final /* synthetic */ HashMap<String, String> f34491e;

        /* renamed from: oy1.d$a$a */
        public static final class C11787a implements C8451i.C8452a {

            /* renamed from: a */
            public final /* synthetic */ C11785d f34492a;

            /* renamed from: b */
            public final /* synthetic */ MMFragmentActivity f34493b;

            /* renamed from: c */
            public final /* synthetic */ String f34494c;

            /* renamed from: d */
            public final /* synthetic */ String f34495d;

            /* renamed from: e */
            public final /* synthetic */ String f34496e;

            /* renamed from: f */
            public final /* synthetic */ HashMap<String, String> f34497f;

            /* renamed from: g */
            public final /* synthetic */ String f34498g;

            public C11787a(C11785d dVar, MMFragmentActivity mMFragmentActivity, String str, String str2, String str3, HashMap<String, String> hashMap, String str4) {
                this.f34492a = dVar;
                this.f34493b = mMFragmentActivity;
                this.f34494c = str;
                this.f34495d = str2;
                this.f34496e = str3;
                this.f34497f = hashMap;
                this.f34498g = str4;
            }

            /* renamed from: a */
            public final void mo24a(Bitmap bitmap, byte[] bArr) {
                if (bitmap != null) {
                    Log.m105918d("MiniGameVideoShareProcessor", "shareToFriend thumb  not null");
                }
                C11785d dVar = this.f34492a;
                MMFragmentActivity mMFragmentActivity = this.f34493b;
                String str = this.f34494c;
                String str2 = this.f34495d;
                String str3 = this.f34496e;
                C87412m.m108591d(str3);
                HashMap<String, String> hashMap = this.f34497f;
                String str4 = this.f34498g;
                dVar.getClass();
                WXMediaMessage wXMediaMessage = new WXMediaMessage();
                WXWebpageObject wXWebpageObject = new WXWebpageObject();
                wXWebpageObject.webpageUrl = str;
                wXMediaMessage.mediaObject = wXWebpageObject;
                String str5 = hashMap.get(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                String str6 = "";
                if (str5 == null) {
                    str5 = str6;
                }
                wXMediaMessage.title = str5;
                wXMediaMessage.description = hashMap.get("desc");
                Bitmap bitmap2 = ((C8451i) C86312j.m106911c(C8451i.class)).get(str2);
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    Log.m105924i("MiniGameVideoShareProcessor", "gamelog.share , share video ,thumb image is not null");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap2.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    wXMediaMessage.thumbData = byteArrayOutputStream.toByteArray();
                }
                C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(dVar.f34482a.f38917a);
                SendAppMsgEvent sendAppMsgEvent = new SendAppMsgEvent();
                SendAppMsgEvent.C1131a aVar = sendAppMsgEvent.f9477d;
                aVar.f9478a = wXMediaMessage;
                aVar.f9479b = "wx62d9035fd4fd2059";
                if (appInfo != null) {
                    str6 = appInfo.field_appName;
                }
                aVar.f9480c = str6;
                aVar.f9481d = str3;
                aVar.f9482e = 2;
                aVar.f9485h = null;
                aVar.f9486i = str;
                aVar.f9487j = str;
                sendAppMsgEvent.publish();
                if (!Util.isNullOrNil(str4)) {
                    SendMsgEvent sendMsgEvent = new SendMsgEvent();
                    SendMsgEvent.C1132a aVar2 = sendMsgEvent.f9496d;
                    aVar2.f9497a = str3;
                    aVar2.f9498b = str4;
                    aVar2.f9499c = C45628s0.m50810y(str3);
                    sendMsgEvent.f9496d.f9500d = 0;
                    sendMsgEvent.publish();
                }
                C76879j.m92726T(mMFragmentActivity, mMFragmentActivity.getResources().getString(C0966R.string.f360099a34));
                C11781a aVar3 = dVar.f34484c;
                if (aVar3 != null) {
                    aVar3.onSuccess();
                }
                Log.m105924i("MiniGameVideoShareProcessor", "gamelog.share , share video ,shareToFriend success");
            }
        }

        public C11786a(C11785d dVar, String str, MMFragmentActivity mMFragmentActivity, String str2, HashMap<String, String> hashMap) {
            this.f34487a = dVar;
            this.f34488b = str;
            this.f34489c = mMFragmentActivity;
            this.f34490d = str2;
            this.f34491e = hashMap;
        }

        public final void mmOnActivityResult(int i, int i2, Intent intent) {
            if (i != 1001) {
                return;
            }
            if (i2 == -1) {
                String str = null;
                String stringExtra = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
                if (Util.isNullOrNil(stringExtra)) {
                    C11781a aVar = this.f34487a.f34484c;
                    if (aVar != null) {
                        aVar.mo11674a("toUser is null");
                    }
                    Log.m105920e("MiniGameVideoShareProcessor", "gamelog.share , share video , toUser is null");
                }
                if (intent != null) {
                    str = intent.getStringExtra("custom_send_text");
                }
                String str2 = this.f34488b;
                ((C8451i) C86312j.m106911c(C8451i.class)).mo9375mT(str2, new C11787a(this.f34487a, this.f34489c, this.f34490d, str2, stringExtra, this.f34491e, str));
                return;
            }
            C11781a aVar2 = this.f34487a.f34484c;
            if (aVar2 != null) {
                aVar2.onCancel();
            }
            Log.m105924i("MiniGameVideoShareProcessor", "gamelog.share , share video ,shareToFriend cancel");
        }
    }

    /* renamed from: oy1.d$b */
    public static final class C11788b implements MMFragmentActivity$$f {

        /* renamed from: a */
        public final /* synthetic */ C11785d f34499a;

        /* renamed from: b */
        public final /* synthetic */ Context f34500b;

        public C11788b(C11785d dVar, Context context) {
            this.f34499a = dVar;
            this.f34500b = context;
        }

        public final void mmOnActivityResult(int i, int i2, Intent intent) {
            if (i == 1002) {
                if (i2 == -1) {
                    C11781a aVar = this.f34499a.f34484c;
                    if (aVar != null) {
                        aVar.onSuccess();
                    }
                    Log.m105924i("MiniGameVideoShareProcessor", "gamelog.share , share video ,shareToTimeline success");
                } else {
                    C11781a aVar2 = this.f34499a.f34484c;
                    if (aVar2 != null) {
                        aVar2.onCancel();
                    }
                    Log.m105924i("MiniGameVideoShareProcessor", "gamelog.share , share video , shareToTimeline cancel");
                }
                ((MMFragmentActivity) this.f34500b).setMMOnFragmentActivityResult((MMFragmentActivity$$f) null);
            }
        }
    }

    public C11785d(C48478n.C13793h hVar, int i) {
        C87412m.m108594g(hVar, "videoFile");
        this.f34482a = hVar;
        this.f34483b = i;
    }

    /* renamed from: a */
    public final void mo11682a() {
        Log.m105924i("MiniGameVideoShareProcessor", "gamelog.share , share video , user cancel");
        String str = this.f34485d;
        if (str != null) {
            ((C101213l) C86312j.m106911c(C101213l.class)).gn0(str);
        }
        this.f34486e = true;
        C11781a aVar = this.f34484c;
        if (aVar != null) {
            aVar.onCancel();
        }
        this.f34484c = null;
    }

    /* renamed from: b */
    public final void mo11683b(Context context, C11781a aVar) {
        C11781a aVar2;
        C87412m.m108594g(context, "context");
        this.f34484c = aVar;
        String str = this.f34482a.f38919c;
        C87412m.m108593f(str, "videoFile.absFilePath");
        HashMap<String, C11782b.C11783a> hashMap = C11782b.f34475a;
        C11782b.C11783a aVar3 = hashMap != null ? hashMap.get(MD5Util.getFileMD5String(new C86009m1(str))) : null;
        if (aVar3 != null) {
            String str2 = aVar3.f34477b;
            boolean z = false;
            if (!(str2 == null || str2.length() == 0)) {
                String str3 = aVar3.f34478c;
                if (str3 == null || str3.length() == 0) {
                    z = true;
                }
                if (!z) {
                    int i = this.f34483b;
                    if (i == 1) {
                        mo11684c(context, aVar3.f34477b, aVar3.f34478c);
                        return;
                    } else if (i == 2) {
                        mo11685d(context, aVar3.f34477b, aVar3.f34478c);
                        return;
                    } else if (i == 3 && (aVar2 = this.f34484c) != null) {
                        aVar2.mo11675b(aVar3.f34477b, aVar3.f34478c);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        String str4 = (C41872f.m45392b(C41872f.C41873a.ONE_MONTH) + "haowan/") + "vsg_thumb_" + System.currentTimeMillis() + ".jpg";
        if (Boolean.valueOf(BitmapUtil.saveBitmapToImage(ThumbnailUtils.createVideoThumbnail(this.f34482a.f38919c, 1), 50, Bitmap.CompressFormat.JPEG, str4, true)).booleanValue()) {
            Log.m105918d("MiniGameVideoShareProcessor", "gamelog.share , share video , upload, startUpload filepath = " + this.f34482a.f38919c);
            C11789e eVar = new C11789e(this, context);
            this.f34485d = MD5Util.getMD5String(this.f34482a.f38919c) + System.currentTimeMillis();
            C98124g gVar = new C98124g();
            gVar.field_fileType = CdnLogic.kMediaTypeAppVideo;
            String str5 = this.f34482a.f38919c;
            gVar.field_fullpath = str5;
            gVar.field_appType = JsApiCheckIsSupportFaceDetect.CTRL_INDEX;
            gVar.field_mediaId = this.f34485d;
            gVar.field_totalLen = (int) C86013q1.m106451l(str5);
            gVar.field_priority = 3;
            gVar.f287662f = eVar;
            gVar.f287661e = true;
            gVar.field_needStorage = true;
            gVar.field_bzScene = 2;
            gVar.field_thumbpath = str4;
            Log.m105918d("MiniGameVideoShareProcessor", "gamelog.share , share video ,startUpload success =" + ((C101213l) C86312j.m106911c(C101213l.class)).if0(gVar) + "  filepath = " + this.f34482a.f38919c);
            return;
        }
        C11781a aVar4 = this.f34484c;
        if (aVar4 != null) {
            aVar4.mo11674a("thumbPic create error");
        }
    }

    /* renamed from: c */
    public final void mo11684c(Context context, String str, String str2) {
        if (!(context instanceof MMFragmentActivity)) {
            C11781a aVar = this.f34484c;
            if (aVar != null) {
                aVar.mo11674a("shareToFriend context need MMFragmentActivity");
                return;
            }
            return;
        }
        MMFragmentActivity mMFragmentActivity = (MMFragmentActivity) context;
        C11781a aVar2 = this.f34484c;
        if (aVar2 != null) {
            aVar2.mo11676c();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("img_url", str2);
        String str3 = this.f34482a.f38921e;
        String str4 = "";
        if (str3 == null) {
            str3 = str4;
        }
        hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, str3);
        String str5 = this.f34482a.f38922f;
        if (str5 != null) {
            str4 = str5;
        }
        hashMap.put("desc", str4);
        Intent intent = new Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("scene_from", 2);
        intent.putExtra("mutil_select_is_ret", true);
        intent.putExtra("webview_params", hashMap);
        intent.putExtra("Retr_Msg_Type", 2);
        C6209b4.m6499a(str2);
        C88144b.m109804v(mMFragmentActivity, ".ui.transmit.SelectConversationUI", intent, 1001, new C11786a(this, str2, mMFragmentActivity, str, hashMap));
    }

    /* renamed from: d */
    public final void mo11685d(Context context, String str, String str2) {
        C11781a aVar = this.f34484c;
        if (aVar != null) {
            aVar.mo11676c();
        }
        Intent intent = new Intent();
        intent.putExtra("Ksnsupload_link", str);
        String str3 = this.f34482a.f38921e;
        if (str3 == null) {
            str3 = "";
        }
        intent.putExtra("Ksnsupload_title", str3);
        intent.putExtra("Ksnsupload_imgurl", str2);
        intent.putExtra("ShareUrlOriginal", str);
        intent.putExtra("need_result", true);
        intent.putExtra("Ksnsupload_type", 1);
        if (context instanceof MMFragmentActivity) {
            ((MMFragmentActivity) context).setMMOnFragmentActivityResult(new C11788b(this, context));
            C88144b.m109796n(context, "sns", ".ui.SnsUploadUI", intent, 1002, false);
            return;
        }
        C88144b.m109792j(context, "sns", ".ui.SnsUploadUI", intent, false);
    }
}
