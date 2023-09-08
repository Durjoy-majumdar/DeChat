package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SendAppMsgEvent;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import eb0.C45628s0;
import ir2.C98784a;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import nj3.C76879j;
import ps2.C100880k;
import ps2.C100891r;
import wd3.C15148g1;
import wd3.C65953v0;

/* renamed from: com.tencent.mm.plugin.sns.ui.y6 */
public class C96323y6 implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ String f281713d;

    /* renamed from: e */
    public final /* synthetic */ String f281714e;

    /* renamed from: f */
    public final /* synthetic */ String f281715f;

    /* renamed from: g */
    public final /* synthetic */ String f281716g;

    /* renamed from: h */
    public final /* synthetic */ String f281717h;

    /* renamed from: i */
    public final /* synthetic */ String f281718i;

    /* renamed from: j */
    public final /* synthetic */ String f281719j;

    /* renamed from: n */
    public final /* synthetic */ String f281720n;

    /* renamed from: o */
    public final /* synthetic */ String f281721o;

    /* renamed from: p */
    public final /* synthetic */ SnsTransparentUI f281722p;

    /* renamed from: com.tencent.mm.plugin.sns.ui.y6$a */
    public class C96324a implements C65953v0 {

        /* renamed from: a */
        public final /* synthetic */ String f281723a;

        /* renamed from: b */
        public final /* synthetic */ Context f281724b;

        /* renamed from: c */
        public final /* synthetic */ String f281725c;

        /* renamed from: com.tencent.mm.plugin.sns.ui.y6$a$a */
        public class C96325a implements C100880k.C100881a {

            /* renamed from: a */
            public final /* synthetic */ WXMediaMessage f281727a;

            /* renamed from: b */
            public final /* synthetic */ String f281728b;

            public C96325a(WXMediaMessage wXMediaMessage, String str) {
                this.f281727a = wXMediaMessage;
                this.f281728b = str;
            }

            /* renamed from: a */
            public void mo76113a() {
                SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1$1");
                Context context = C96324a.this.f281724b;
                C76879j.m92726T(context, context.getString(C0966R.string.j6h));
                C96323y6.this.f281722p.finish();
                SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1$1");
            }

            /* renamed from: b */
            public void mo76114b() {
                SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1$1");
                SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1$1");
            }

            /* renamed from: c */
            public void mo76115c(String str) {
                SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1$1");
                try {
                    Bitmap decodeFile = BitmapUtil.decodeFile(str);
                    SnsTransparentUI snsTransparentUI = C96323y6.this.f281722p;
                    int i = SnsTransparentUI.f278824e;
                    SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
                    Map<String, Bitmap> map = snsTransparentUI.f278825d;
                    SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
                    ((HashMap) map).put(C96323y6.this.f281715f, decodeFile);
                    if (decodeFile != null && !decodeFile.isRecycled()) {
                        Log.m105924i("SnsTransparentUI", "thumb image is not null");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        decodeFile.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        this.f281727a.thumbData = byteArrayOutputStream.toByteArray();
                    }
                    SendAppMsgEvent sendAppMsgEvent = new SendAppMsgEvent();
                    SendAppMsgEvent.C1131a aVar = sendAppMsgEvent.f9477d;
                    aVar.f9478a = this.f281727a;
                    C96324a aVar2 = C96324a.this;
                    aVar.f9481d = aVar2.f281725c;
                    aVar.f9482e = 49;
                    aVar.f9483f = "";
                    aVar.f9484g = "";
                    aVar.f9495r = C96323y6.this.f281718i;
                    sendAppMsgEvent.publish();
                    if (!TextUtils.isEmpty(this.f281728b)) {
                        SendMsgEvent sendMsgEvent = new SendMsgEvent();
                        SendMsgEvent.C1132a aVar3 = sendMsgEvent.f9496d;
                        String str2 = C96324a.this.f281725c;
                        aVar3.f9497a = str2;
                        aVar3.f9498b = this.f281728b;
                        aVar3.f9499c = C45628s0.m50810y(str2);
                        sendMsgEvent.f9496d.f9500d = 0;
                        sendMsgEvent.publish();
                    }
                    Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI.uxInfo", "openAdCanvasPage doTransmit confirm dialog download ad img callback in SnsTransparentUI, uxInfo is " + C96323y6.this.f281719j + ", selfUserName is " + C96323y6.this.f281720n + ", sendUserName is " + C96324a.this.f281725c);
                    C96324a aVar4 = C96324a.this;
                    String str3 = aVar4.f281725c;
                    C96323y6 y6Var = C96323y6.this;
                    C98784a.m128576c(str3, y6Var.f281719j, y6Var.f281721o);
                    Context context = C96324a.this.f281724b;
                    C76879j.m92726T(context, context.getString(C0966R.string.f360099a34));
                    C96323y6.this.f281722p.finish();
                } catch (Exception e) {
                    Log.m105920e("SnsTransparentUI", "this has a error : " + e.toString());
                    C96323y6.this.f281722p.finish();
                }
                SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1$1");
            }
        }

        public C96324a(String str, Context context, String str2) {
            this.f281723a = str;
            this.f281724b = context;
            this.f281725c = str2;
        }

        /* renamed from: a */
        public void mo23a(boolean z, String str, int i) {
            SnsMethodCalculate.markStartTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1");
            if (z) {
                WXMediaMessage wXMediaMessage = new WXMediaMessage();
                C96323y6 y6Var = C96323y6.this;
                wXMediaMessage.title = y6Var.f281714e;
                wXMediaMessage.description = y6Var.f281716g;
                WXWebpageObject wXWebpageObject = new WXWebpageObject();
                wXWebpageObject.canvasPageXml = this.f281723a;
                C96323y6 y6Var2 = C96323y6.this;
                wXWebpageObject.webpageUrl = y6Var2.f281717h;
                wXMediaMessage.mediaObject = wXWebpageObject;
                SnsTransparentUI snsTransparentUI = y6Var2.f281722p;
                int i2 = SnsTransparentUI.f278824e;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
                Map<String, Bitmap> map = snsTransparentUI.f278825d;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
                if (((HashMap) map).containsKey(C96323y6.this.f281715f)) {
                    SnsTransparentUI snsTransparentUI2 = C96323y6.this.f281722p;
                    SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
                    Map<String, Bitmap> map2 = snsTransparentUI2.f278825d;
                    SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
                    Bitmap bitmap = (Bitmap) ((HashMap) map2).get(C96323y6.this.f281715f);
                    if (bitmap != null && !bitmap.isRecycled()) {
                        Log.m105924i("SnsTransparentUI", "thumb image is not null");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        wXMediaMessage.thumbData = byteArrayOutputStream.toByteArray();
                    }
                    SendAppMsgEvent sendAppMsgEvent = new SendAppMsgEvent();
                    SendAppMsgEvent.C1131a aVar = sendAppMsgEvent.f9477d;
                    aVar.f9478a = wXMediaMessage;
                    aVar.f9481d = this.f281725c;
                    aVar.f9482e = 49;
                    aVar.f9483f = "";
                    aVar.f9484g = "";
                    aVar.f9495r = C96323y6.this.f281718i;
                    sendAppMsgEvent.publish();
                    if (!TextUtils.isEmpty(str)) {
                        SendMsgEvent sendMsgEvent = new SendMsgEvent();
                        SendMsgEvent.C1132a aVar2 = sendMsgEvent.f9496d;
                        String str2 = this.f281725c;
                        aVar2.f9497a = str2;
                        aVar2.f9498b = str;
                        aVar2.f9499c = C45628s0.m50810y(str2);
                        sendMsgEvent.f9496d.f9500d = 0;
                        sendMsgEvent.publish();
                    }
                    Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI.uxInfo", "openAdCanvasPage doTransmit confirm dialog in SnsTransparentUI, uxInfo is " + C96323y6.this.f281719j + ", selfUserName is " + C96323y6.this.f281720n + ", sendUserName is " + this.f281725c);
                    String str3 = this.f281725c;
                    C96323y6 y6Var3 = C96323y6.this;
                    C98784a.m128576c(str3, y6Var3.f281719j, y6Var3.f281721o);
                    Context context = this.f281724b;
                    C76879j.m92726T(context, context.getString(C0966R.string.f360099a34));
                    C96323y6.this.f281722p.finish();
                    SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1");
                    return;
                }
                MD5Util.getMD5String(C96323y6.this.f281715f);
                C100891r.m132207b("adId", C96323y6.this.f281715f, false, 1000000001, 0, new C96325a(wXMediaMessage, str));
                SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1");
                return;
            }
            Context context2 = this.f281724b;
            C76879j.m92726T(context2, context2.getString(C0966R.string.j6h));
            C96323y6.this.f281722p.finish();
            SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1");
        }
    }

    public C96323y6(SnsTransparentUI snsTransparentUI, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f281722p = snsTransparentUI;
        this.f281713d = str;
        this.f281714e = str2;
        this.f281715f = str3;
        this.f281716g = str4;
        this.f281717h = str5;
        this.f281718i = str6;
        this.f281719j = str7;
        this.f281720n = str8;
        this.f281721o = str9;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("mmOnActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1");
        if (i2 == -1) {
            String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            if (stringExtra == null || stringExtra.length() == 0) {
                Log.m105920e("SnsTransparentUI", "mmOnActivityResult fail, toUser is null");
                this.f281722p.finish();
                SnsMethodCalculate.markEndTimeMs("mmOnActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1");
                return;
            }
            Log.m105924i("SnsTransparentUI", "doTransimt snsAdNativeLadingPagesUI is ok");
            String str = this.f281713d;
            SnsTransparentUI snsTransparentUI = this.f281722p;
            C15148g1.C15149a.f41275a.Sk0(snsTransparentUI.getController(), this.f281714e, this.f281715f, this.f281716g, (String) null, true, snsTransparentUI.getResources().getString(C0966R.string.a2s), new C96324a(str, snsTransparentUI, stringExtra));
        } else {
            this.f281722p.finish();
        }
        SnsMethodCalculate.markEndTimeMs("mmOnActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1");
    }
}
