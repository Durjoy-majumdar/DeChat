package com.tencent.p014mm.plugin.sns.p106ui;

import a70.C112760b;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SendAppMsgEvent;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sight.decode.p1077ui.SnsAdNativeLandingPagesVideoPlayerLoadingBar;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoSightView;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.TinkerStatusReport;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.downloadservice.Downloads;
import eb0.C45628s0;
import j20.C117292a;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import wd3.C15148g1;
import wd3.C65953v0;
import xn2.C102693c;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI */
public class SnsAdNativeLandingTestUI extends MMActivity {

    /* renamed from: h */
    public static final /* synthetic */ int f277667h = 0;

    /* renamed from: d */
    public VideoSightView f277668d;

    /* renamed from: e */
    public SnsAdNativeLandingPagesVideoPlayerLoadingBar f277669e;

    /* renamed from: f */
    public double f277670f = 0.0d;

    /* renamed from: g */
    public MMHandler f277671g = new MMHandler();

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$a */
    public class C5444a implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$a$a */
        public class C5445a implements MMActivity.C6739d {

            /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$a$a$a */
            public class C5446a implements C65953v0 {

                /* renamed from: a */
                public final /* synthetic */ String f21182a;

                /* renamed from: b */
                public final /* synthetic */ Context f21183b;

                public C5446a(C5445a aVar, String str, Context context) {
                    this.f21182a = str;
                    this.f21183b = context;
                }

                /* renamed from: a */
                public void mo23a(boolean z, String str, int i) {
                    Bitmap bitmap;
                    SnsMethodCalculate.markStartTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$1$1$1");
                    if (z) {
                        WXMediaMessage wXMediaMessage = new WXMediaMessage();
                        wXMediaMessage.title = "test title";
                        wXMediaMessage.description = "test desc";
                        WXWebpageObject wXWebpageObject = new WXWebpageObject();
                        wXWebpageObject.canvasPageXml = "<xml></xml>";
                        wXWebpageObject.webpageUrl = "http://www.baidu.com/";
                        wXMediaMessage.mediaObject = wXWebpageObject;
                        SnsMethodCalculate.markStartTimeMs("getBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
                        String str2 = (C112760b.m154195C() + "/sns_ad_landingpages") + "/" + ("adId" + "_image_" + MD5Util.getMD5String("http://mmsns.qpic.cn/mmsns/pUBe8EmICSCsszwvTNz7XO46mx3SDurmV95hHIeQvib0AEVBGYU02Mg/150"));
                        if (C86013q1.m106450k(str2)) {
                            bitmap = BackwardSupportUtil.BitmapFactory.decodeFile(str2, 1.0f);
                            SnsMethodCalculate.markEndTimeMs("getBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
                        } else {
                            bitmap = null;
                            SnsMethodCalculate.markEndTimeMs("getBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
                        }
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Log.m105924i("MicroMsg.Sns.SnsAdNativieLandingTestUI", "thumb image is not null");
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                            wXMediaMessage.thumbData = byteArrayOutputStream.toByteArray();
                        }
                        SendAppMsgEvent sendAppMsgEvent = new SendAppMsgEvent();
                        SendAppMsgEvent.C1131a aVar = sendAppMsgEvent.f9477d;
                        aVar.f9478a = wXMediaMessage;
                        aVar.f9481d = this.f21182a;
                        aVar.f9482e = 49;
                        aVar.f9483f = "";
                        aVar.f9484g = "";
                        sendAppMsgEvent.publish();
                        if (!TextUtils.isEmpty(str)) {
                            SendMsgEvent sendMsgEvent = new SendMsgEvent();
                            SendMsgEvent.C1132a aVar2 = sendMsgEvent.f9496d;
                            String str3 = this.f21182a;
                            aVar2.f9497a = str3;
                            aVar2.f9498b = str;
                            aVar2.f9499c = C45628s0.m50810y(str3);
                            sendMsgEvent.f9496d.f9500d = 0;
                            sendMsgEvent.publish();
                        }
                        Context context = this.f21183b;
                        C76879j.m92726T(context, context.getString(C0966R.string.f360099a34));
                        SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$1$1$1");
                        return;
                    }
                    SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$1$1$1");
                }
            }

            public C5445a() {
            }

            public void mmOnActivityResult(int i, int i2, Intent intent) {
                SnsMethodCalculate.markStartTimeMs("mmOnActivityResult", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$1$1");
                if (i2 == -1) {
                    String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
                    if (stringExtra == null || stringExtra.length() == 0) {
                        Log.m105920e("MicroMsg.Sns.SnsAdNativieLandingTestUI", "mmOnActivityResult fail, toUser is null");
                        SnsMethodCalculate.markEndTimeMs("mmOnActivityResult", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$1$1");
                        return;
                    }
                    SnsAdNativeLandingTestUI snsAdNativeLandingTestUI = SnsAdNativeLandingTestUI.this;
                    C15148g1.C15149a.f41275a.Sk0(snsAdNativeLandingTestUI.getController(), "test title", "http://mmsns.qpic.cn/mmsns/pUBe8EmICSCsszwvTNz7XO46mx3SDurmV95hHIeQvib0AEVBGYU02Mg/150", "test desc", (String) null, true, snsAdNativeLandingTestUI.getResources().getString(C0966R.string.a2s), new C5446a(this, stringExtra, snsAdNativeLandingTestUI));
                }
                SnsMethodCalculate.markEndTimeMs("mmOnActivityResult", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$1$1");
            }
        }

        public C5444a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$1");
            Intent intent = new Intent();
            intent.putExtra("Select_Conv_Type", TinkerStatusReport.KVSTAT_TYPE_ID_TINKER_EXCEPTION);
            intent.putExtra("select_is_ret", true);
            C88144b.m109803u(SnsAdNativeLandingTestUI.this, ".ui.transmit.SelectConversationUI", intent, 0, new C5445a());
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$b */
    public class C95446b implements C102693c {
        public C95446b() {
        }

        /* renamed from: a */
        public void mo4335a(int i) {
            SnsMethodCalculate.markStartTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$2");
            Log.m105924i("MicroMsg.Sns.SnsAdNativieLandingTestUI", "onSeek time " + i);
            SnsAdNativeLandingTestUI snsAdNativeLandingTestUI = SnsAdNativeLandingTestUI.this;
            double d = (double) i;
            int i2 = SnsAdNativeLandingTestUI.f277667h;
            SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
            snsAdNativeLandingTestUI.f277670f = d;
            SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
            SnsAdNativeLandingTestUI.m121881H7(SnsAdNativeLandingTestUI.this).mo24788d(d);
            SnsMethodCalculate.markEndTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$2");
        }

        /* renamed from: c */
        public void mo4336c(int i) {
            SnsMethodCalculate.markStartTimeMs("onSeeking", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$2");
            SnsMethodCalculate.markEndTimeMs("onSeeking", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$2");
        }

        public void onSeekPre() {
            SnsMethodCalculate.markStartTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$2");
            SnsMethodCalculate.markEndTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$c */
    public class C95447c implements View.OnClickListener {
        public C95447c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$3");
            if (SnsAdNativeLandingTestUI.m121881H7(SnsAdNativeLandingTestUI.this).isPlaying()) {
                SnsAdNativeLandingTestUI snsAdNativeLandingTestUI = SnsAdNativeLandingTestUI.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
                snsAdNativeLandingTestUI.getClass();
                SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
                snsAdNativeLandingTestUI.f277670f = snsAdNativeLandingTestUI.f277668d.getLastProgresstime();
                snsAdNativeLandingTestUI.f277668d.pause();
                snsAdNativeLandingTestUI.f277671g.post(new C95998k3(snsAdNativeLandingTestUI));
                SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
            } else {
                SnsAdNativeLandingTestUI.m121882I7(SnsAdNativeLandingTestUI.this);
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$3");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$d */
    public class C95448d implements C96875r0.C96876a {

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$d$a */
        public class C95449a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f277675d;

            /* renamed from: e */
            public final /* synthetic */ int f277676e;

            public C95449a(int i, int i2) {
                this.f277675d = i;
                this.f277676e = i2;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$4$1");
                Log.m105924i("MicroMsg.Sns.SnsAdNativieLandingTestUI", "play time " + this.f277675d + " video time " + this.f277676e);
                if (this.f277676e > 0) {
                    SnsAdNativeLandingTestUI snsAdNativeLandingTestUI = SnsAdNativeLandingTestUI.this;
                    int i = SnsAdNativeLandingTestUI.f277667h;
                    SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
                    snsAdNativeLandingTestUI.getClass();
                    SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
                    SnsAdNativeLandingTestUI snsAdNativeLandingTestUI2 = SnsAdNativeLandingTestUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
                    snsAdNativeLandingTestUI2.getClass();
                    SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
                }
                int videoTotalTime = SnsAdNativeLandingTestUI.this.f277669e.getVideoTotalTime();
                int i2 = this.f277676e;
                if (videoTotalTime != i2) {
                    SnsAdNativeLandingTestUI.this.f277669e.setVideoTotalTime(i2);
                }
                SnsAdNativeLandingTestUI.this.f277669e.seek(this.f277675d);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$4$1");
            }
        }

        public C95448d() {
        }

        /* renamed from: M0 */
        public int mo76207M0(int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("onPlayTime", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$4");
            MMHandlerThread.postToMainThread(new C95449a(i, i2));
            SnsMethodCalculate.markEndTimeMs("onPlayTime", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$4");
            return 0;
        }

        public void onCompletion() {
            SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$4");
            SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$4");
        }

        public void onError(int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$4");
            SnsAdNativeLandingTestUI.m121881H7(SnsAdNativeLandingTestUI.this).stop();
            SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$4");
        }

        public void onPrepared() {
            SnsMethodCalculate.markStartTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$4");
            if (SnsAdNativeLandingTestUI.this.f277669e.getIsPlay()) {
                SnsAdNativeLandingTestUI.m121882I7(SnsAdNativeLandingTestUI.this);
            }
            SnsMethodCalculate.markEndTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$4");
        }

        /* renamed from: p3 */
        public void mo76226p3(int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$4");
            SnsAdNativeLandingTestUI snsAdNativeLandingTestUI = SnsAdNativeLandingTestUI.this;
            int i3 = SnsAdNativeLandingTestUI.f277667h;
            SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
            snsAdNativeLandingTestUI.getClass();
            SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
            SnsAdNativeLandingTestUI snsAdNativeLandingTestUI2 = SnsAdNativeLandingTestUI.this;
            SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
            snsAdNativeLandingTestUI2.getClass();
            SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
            SnsMethodCalculate.markEndTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$e */
    public class C95450e implements View.OnClickListener {
        public C95450e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$5");
            if (!"".equals(SnsAdNativeLandingTestUI.m121881H7(SnsAdNativeLandingTestUI.this).getVideoPath()) && SnsAdNativeLandingTestUI.m121881H7(SnsAdNativeLandingTestUI.this).getVideoPath() != null) {
                if (SnsAdNativeLandingTestUI.this.f277669e.getVisibility() == 0) {
                    SnsAdNativeLandingTestUI.this.f277669e.setVisibility(4);
                } else {
                    SnsAdNativeLandingTestUI.this.f277669e.setVisibility(0);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$5");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$f */
    public class C95451f implements Runnable {
        public C95451f() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$6");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (SnsAdNativeLandingTestUI.this.getContext() instanceof MMActivity) {
                ((MMActivity) SnsAdNativeLandingTestUI.this.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                SnsAdNativeLandingTestUI.m121881H7(SnsAdNativeLandingTestUI.this).setDrawableWidth(displayMetrics.widthPixels);
            }
            SnsAdNativeLandingTestUI.m121881H7(SnsAdNativeLandingTestUI.this).requestLayout();
            SnsAdNativeLandingTestUI.m121881H7(SnsAdNativeLandingTestUI.this).postInvalidate();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$6");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$g */
    public class C95452g implements C95454i.C95459b {
        public C95452g() {
        }

        /* renamed from: a */
        public void mo132571a(String str) {
            SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$7");
            SnsAdNativeLandingTestUI.m121881H7(SnsAdNativeLandingTestUI.this).setThumb(BitmapUtil.decodeFile(str));
            SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$7");
        }

        /* renamed from: b */
        public void mo132572b(String str) {
            SnsMethodCalculate.markStartTimeMs("onFail", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$7");
            SnsMethodCalculate.markEndTimeMs("onFail", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$7");
        }

        /* renamed from: c */
        public void mo132573c(String str, int i) {
            SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$7");
            SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$7");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$h */
    public class C95453h implements C95454i.C95459b {
        public C95453h() {
        }

        /* renamed from: a */
        public void mo132571a(String str) {
            SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$8");
            SnsAdNativeLandingTestUI.m121881H7(SnsAdNativeLandingTestUI.this).setVideoPath(str);
            SnsAdNativeLandingTestUI.m121881H7(SnsAdNativeLandingTestUI.this).setLoop(true);
            if (SnsAdNativeLandingTestUI.this.f277669e.getIsPlay()) {
                VideoSightView H7 = SnsAdNativeLandingTestUI.m121881H7(SnsAdNativeLandingTestUI.this);
                SnsAdNativeLandingTestUI snsAdNativeLandingTestUI = SnsAdNativeLandingTestUI.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
                double d = snsAdNativeLandingTestUI.f277670f;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
                H7.mo24788d(d);
                SnsAdNativeLandingTestUI.m121881H7(SnsAdNativeLandingTestUI.this).start();
            }
            SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$8");
        }

        /* renamed from: b */
        public void mo132572b(String str) {
            SnsMethodCalculate.markStartTimeMs("onFail", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$8");
            Log.m105920e("MicroMsg.Sns.SnsAdNativieLandingTestUI", str);
            SnsMethodCalculate.markEndTimeMs("onFail", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$8");
        }

        /* renamed from: c */
        public void mo132573c(String str, int i) {
            SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$8");
            if (SnsAdNativeLandingTestUI.m121881H7(SnsAdNativeLandingTestUI.this).isPlaying()) {
                SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$8");
                return;
            }
            SnsAdNativeLandingTestUI.m121881H7(SnsAdNativeLandingTestUI.this).setLoop(false);
            if (!str.equals(SnsAdNativeLandingTestUI.m121881H7(SnsAdNativeLandingTestUI.this).getVideoPath())) {
                SnsAdNativeLandingTestUI.m121881H7(SnsAdNativeLandingTestUI.this).setVideoPath(str);
            }
            if (SnsAdNativeLandingTestUI.this.f277669e.getIsPlay()) {
                VideoSightView H7 = SnsAdNativeLandingTestUI.m121881H7(SnsAdNativeLandingTestUI.this);
                SnsAdNativeLandingTestUI snsAdNativeLandingTestUI = SnsAdNativeLandingTestUI.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
                double d = snsAdNativeLandingTestUI.f277670f;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
                H7.mo24788d(d);
                SnsAdNativeLandingTestUI.m121881H7(SnsAdNativeLandingTestUI.this).start();
            }
            SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$8");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$i */
    public static class C95454i extends AsyncTask<String, Void, Void> {

        /* renamed from: f */
        public static Set<String> f277682f = new HashSet();

        /* renamed from: g */
        public static byte[] f277683g = new byte[0];

        /* renamed from: a */
        public final String f277684a;

        /* renamed from: b */
        public final String f277685b;

        /* renamed from: c */
        public final C95459b f277686c;

        /* renamed from: d */
        public final MMHandler f277687d;

        /* renamed from: e */
        public final int f277688e;

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$i$a */
        public class C95455a implements C95459b {

            /* renamed from: a */
            public final /* synthetic */ MMHandler f277689a;

            /* renamed from: b */
            public final /* synthetic */ C95459b f277690b;

            /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$i$a$a */
            public class C95456a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ String f277691d;

                /* renamed from: e */
                public final /* synthetic */ int f277692e;

                public C95456a(String str, int i) {
                    this.f277691d = str;
                    this.f277692e = i;
                }

                public void run() {
                    SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask$1$1");
                    C95455a.this.f277690b.mo132573c(this.f277691d, this.f277692e);
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask$1$1");
                }
            }

            /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$i$a$b */
            public class C95457b implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ String f277694d;

                public C95457b(String str) {
                    this.f277694d = str;
                }

                public void run() {
                    SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask$1$2");
                    C95455a.this.f277690b.mo132572b(this.f277694d);
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask$1$2");
                }
            }

            /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$i$a$c */
            public class C95458c implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ String f277696d;

                public C95458c(String str) {
                    this.f277696d = str;
                }

                public void run() {
                    SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask$1$3");
                    C95455a.this.f277690b.mo132571a(this.f277696d);
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask$1$3");
                }
            }

            public C95455a(C95454i iVar, MMHandler mMHandler, C95459b bVar) {
                this.f277689a = mMHandler;
                this.f277690b = bVar;
            }

            /* renamed from: a */
            public void mo132571a(String str) {
                SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask$1");
                this.f277689a.post(new C95458c(str));
                SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask$1");
            }

            /* renamed from: b */
            public void mo132572b(String str) {
                SnsMethodCalculate.markStartTimeMs("onFail", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask$1");
                this.f277689a.post(new C95457b(str));
                SnsMethodCalculate.markEndTimeMs("onFail", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask$1");
            }

            /* renamed from: c */
            public void mo132573c(String str, int i) {
                SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask$1");
                this.f277689a.post(new C95456a(str, i));
                SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask$1");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$i$b */
        public interface C95459b {
            /* renamed from: a */
            void mo132571a(String str);

            /* renamed from: b */
            void mo132572b(String str);

            /* renamed from: c */
            void mo132573c(String str, int i);
        }

        public C95454i(String str, String str2, MMHandler mMHandler, C95459b bVar, int i) {
            C86013q1.m106461v(str);
            this.f277684a = str + "/" + str2;
            StringBuilder sb = new StringBuilder();
            sb.append("temp_");
            sb.append(str2);
            String sb4 = sb.toString();
            this.f277685b = str + "/" + sb4;
            this.f277687d = mMHandler;
            this.f277688e = i;
            this.f277686c = new C95455a(this, mMHandler, bVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: java.io.InputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v48, resolved type: java.io.InputStream} */
        /* JADX WARNING: type inference failed for: r1v14, types: [java.io.InputStream] */
        /* JADX WARNING: type inference failed for: r1v45 */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
            */
        /* JADX WARNING: Multi-variable type inference failed */
        public java.lang.Object doInBackground(java.lang.Object[] r12) {
            /*
                r11 = this;
                java.lang.String r0 = "doInBackground"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                java.lang.String[] r12 = (java.lang.String[]) r12
                java.lang.String r0 = "doInBackground"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                byte[] r0 = f277683g
                monitor-enter(r0)
                java.util.Set<java.lang.String> r1 = f277682f     // Catch:{ all -> 0x021e }
                r2 = 0
                r3 = r12[r2]     // Catch:{ all -> 0x021e }
                java.util.HashSet r1 = (java.util.HashSet) r1     // Catch:{ all -> 0x021e }
                boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x021e }
                r3 = 0
                if (r1 == 0) goto L_0x002b
                monitor-exit(r0)     // Catch:{ all -> 0x021e }
                java.lang.String r12 = "doInBackground"
                java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r0)
                goto L_0x01c5
            L_0x002b:
                java.util.Set<java.lang.String> r1 = f277682f     // Catch:{ all -> 0x021e }
                r4 = r12[r2]     // Catch:{ all -> 0x021e }
                java.util.HashSet r1 = (java.util.HashSet) r1     // Catch:{ all -> 0x021e }
                r1.add(r4)     // Catch:{ all -> 0x021e }
                monitor-exit(r0)     // Catch:{ all -> 0x021e }
                java.lang.String r0 = r11.f277684a     // Catch:{ Exception -> 0x017d, all -> 0x0178 }
                boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)     // Catch:{ Exception -> 0x017d, all -> 0x0178 }
                if (r0 == 0) goto L_0x0066
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$i$b r0 = r11.f277686c     // Catch:{ Exception -> 0x017d, all -> 0x0178 }
                java.lang.String r1 = r11.f277684a     // Catch:{ Exception -> 0x017d, all -> 0x0178 }
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$i$a r0 = (com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingTestUI.C95454i.C95455a) r0     // Catch:{ Exception -> 0x017d, all -> 0x0178 }
                r0.mo132571a(r1)     // Catch:{ Exception -> 0x017d, all -> 0x0178 }
                byte[] r0 = f277683g
                monitor-enter(r0)
                java.util.Set<java.lang.String> r1 = f277682f     // Catch:{ all -> 0x005c }
                r12 = r12[r2]     // Catch:{ all -> 0x005c }
                java.util.HashSet r1 = (java.util.HashSet) r1     // Catch:{ all -> 0x005c }
                r1.remove(r12)     // Catch:{ all -> 0x005c }
                monitor-exit(r0)     // Catch:{ all -> 0x005c }
                java.lang.String r12 = "doInBackground"
                java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r0)
                goto L_0x01c5
            L_0x005c:
                r12 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x005c }
                java.lang.String r0 = "doInBackground"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                throw r12
            L_0x0066:
                java.lang.String r0 = r11.f277685b     // Catch:{ Exception -> 0x017d, all -> 0x0178 }
                boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)     // Catch:{ Exception -> 0x017d, all -> 0x0178 }
                if (r0 == 0) goto L_0x0073
                java.lang.String r0 = r11.f277685b     // Catch:{ Exception -> 0x017d, all -> 0x0178 }
                com.tencent.p014mm.vfs.C86013q1.m106447h(r0)     // Catch:{ Exception -> 0x017d, all -> 0x0178 }
            L_0x0073:
                java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x017d, all -> 0x0178 }
                r1 = r12[r2]     // Catch:{ Exception -> 0x017d, all -> 0x0178 }
                r0.<init>(r1)     // Catch:{ Exception -> 0x017d, all -> 0x0178 }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{ Exception -> 0x017d, all -> 0x0178 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x017d, all -> 0x0178 }
                r0.connect()     // Catch:{ Exception -> 0x0174, all -> 0x016f }
                int r1 = r0.getResponseCode()     // Catch:{ Exception -> 0x0174, all -> 0x016f }
                r4 = 200(0xc8, float:2.8E-43)
                if (r1 == r4) goto L_0x00e8
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$i$b r1 = r11.f277686c     // Catch:{ Exception -> 0x0174, all -> 0x016f }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0174, all -> 0x016f }
                r4.<init>()     // Catch:{ Exception -> 0x0174, all -> 0x016f }
                java.lang.String r5 = "Server returned HTTP "
                r4.append(r5)     // Catch:{ Exception -> 0x0174, all -> 0x016f }
                int r5 = r0.getResponseCode()     // Catch:{ Exception -> 0x0174, all -> 0x016f }
                r4.append(r5)     // Catch:{ Exception -> 0x0174, all -> 0x016f }
                java.lang.String r5 = " "
                r4.append(r5)     // Catch:{ Exception -> 0x0174, all -> 0x016f }
                java.lang.String r5 = r0.getResponseMessage()     // Catch:{ Exception -> 0x0174, all -> 0x016f }
                r4.append(r5)     // Catch:{ Exception -> 0x0174, all -> 0x016f }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0174, all -> 0x016f }
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$i$a r1 = (com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingTestUI.C95454i.C95455a) r1     // Catch:{ Exception -> 0x0174, all -> 0x016f }
                r1.mo132572b(r4)     // Catch:{ Exception -> 0x0174, all -> 0x016f }
                java.io.InputStream r1 = r0.getInputStream()     // Catch:{ Exception -> 0x00bb }
                r1.close()     // Catch:{ Exception -> 0x00bb }
                goto L_0x00c5
            L_0x00bb:
                r1 = move-exception
                java.lang.String r4 = "MicroMsg.Sns.SnsAdNativieLandingTestUI"
                java.lang.String r1 = r1.getMessage()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            L_0x00c5:
                r0.disconnect()
                byte[] r1 = f277683g
                monitor-enter(r1)
                java.util.Set<java.lang.String> r0 = f277682f     // Catch:{ all -> 0x00de }
                r12 = r12[r2]     // Catch:{ all -> 0x00de }
                java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x00de }
                r0.remove(r12)     // Catch:{ all -> 0x00de }
                monitor-exit(r1)     // Catch:{ all -> 0x00de }
                java.lang.String r12 = "doInBackground"
                java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r0)
                goto L_0x01c5
            L_0x00de:
                r12 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00de }
                java.lang.String r0 = "doInBackground"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                throw r12
            L_0x00e8:
                r0.getContentLength()     // Catch:{ Exception -> 0x0174, all -> 0x016f }
                java.io.InputStream r1 = r0.getInputStream()     // Catch:{ Exception -> 0x0174, all -> 0x016f }
                java.lang.String r4 = r11.f277685b     // Catch:{ Exception -> 0x016b, all -> 0x0168 }
                java.io.OutputStream r4 = com.tencent.p014mm.vfs.C86013q1.m106429K(r4, r2)     // Catch:{ Exception -> 0x016b, all -> 0x0168 }
                r5 = 4096(0x1000, float:5.74E-42)
                byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x0166 }
                r6 = 0
                r7 = 0
            L_0x00fb:
                int r8 = r1.read(r5)     // Catch:{ Exception -> 0x0166 }
                r9 = -1
                if (r8 == r9) goto L_0x0119
                r4.write(r5, r2, r8)     // Catch:{ Exception -> 0x0166 }
                int r6 = r6 + r8
                int r8 = r11.f277688e     // Catch:{ Exception -> 0x0166 }
                if (r8 == 0) goto L_0x00fb
                int r9 = r6 - r7
                if (r9 < r8) goto L_0x00fb
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$i$b r7 = r11.f277686c     // Catch:{ Exception -> 0x0166 }
                java.lang.String r8 = r11.f277685b     // Catch:{ Exception -> 0x0166 }
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$i$a r7 = (com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingTestUI.C95454i.C95455a) r7     // Catch:{ Exception -> 0x0166 }
                r7.mo132573c(r8, r6)     // Catch:{ Exception -> 0x0166 }
                r7 = r6
                goto L_0x00fb
            L_0x0119:
                java.lang.String r5 = r11.f277685b     // Catch:{ Exception -> 0x0166 }
                java.lang.String r6 = r11.f277684a     // Catch:{ Exception -> 0x0166 }
                com.tencent.p014mm.vfs.C86013q1.m106463x(r5, r6)     // Catch:{ Exception -> 0x0166 }
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$i$b r5 = r11.f277686c     // Catch:{ Exception -> 0x0166 }
                java.lang.String r6 = r11.f277684a     // Catch:{ Exception -> 0x0166 }
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$i$a r5 = (com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingTestUI.C95454i.C95455a) r5     // Catch:{ Exception -> 0x0166 }
                r5.mo132571a(r6)     // Catch:{ Exception -> 0x0166 }
                if (r4 == 0) goto L_0x012e
                r4.close()     // Catch:{ IOException -> 0x0131 }
            L_0x012e:
                r1.close()     // Catch:{ IOException -> 0x0131 }
            L_0x0131:
                java.io.InputStream r1 = r0.getInputStream()     // Catch:{ Exception -> 0x0139 }
                r1.close()     // Catch:{ Exception -> 0x0139 }
                goto L_0x0143
            L_0x0139:
                r1 = move-exception
                java.lang.String r4 = "MicroMsg.Sns.SnsAdNativieLandingTestUI"
                java.lang.String r1 = r1.getMessage()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            L_0x0143:
                r0.disconnect()
                byte[] r5 = f277683g
                monitor-enter(r5)
                java.util.Set<java.lang.String> r0 = f277682f     // Catch:{ all -> 0x015c }
                r12 = r12[r2]     // Catch:{ all -> 0x015c }
                java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x015c }
                r0.remove(r12)     // Catch:{ all -> 0x015c }
                monitor-exit(r5)     // Catch:{ all -> 0x015c }
                java.lang.String r12 = "doInBackground"
                java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r0)
                goto L_0x01c5
            L_0x015c:
                r12 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x015c }
                java.lang.String r0 = "doInBackground"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                throw r12
            L_0x0166:
                r5 = move-exception
                goto L_0x0182
            L_0x0168:
                r4 = move-exception
                goto L_0x01db
            L_0x016b:
                r4 = move-exception
                r5 = r4
                r4 = r3
                goto L_0x0182
            L_0x016f:
                r1 = move-exception
                r4 = r1
                r1 = r3
                goto L_0x01db
            L_0x0174:
                r1 = move-exception
                r5 = r1
                r1 = r3
                goto L_0x0181
            L_0x0178:
                r0 = move-exception
                r4 = r0
                r0 = r3
                r1 = r0
                goto L_0x01db
            L_0x017d:
                r0 = move-exception
                r5 = r0
                r0 = r3
                r1 = r0
            L_0x0181:
                r4 = r1
            L_0x0182:
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$i$b r6 = r11.f277686c     // Catch:{ all -> 0x01d7 }
                java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x01d7 }
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$i$a r6 = (com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingTestUI.C95454i.C95455a) r6     // Catch:{ all -> 0x01d7 }
                r6.mo132572b(r5)     // Catch:{ all -> 0x01d7 }
                if (r4 == 0) goto L_0x0195
                r4.close()     // Catch:{ IOException -> 0x0193 }
                goto L_0x0195
            L_0x0193:
                goto L_0x019a
            L_0x0195:
                if (r1 == 0) goto L_0x019a
                r1.close()     // Catch:{ IOException -> 0x0193 }
            L_0x019a:
                if (r0 == 0) goto L_0x01b1
                java.io.InputStream r1 = r0.getInputStream()     // Catch:{ Exception -> 0x01a4 }
                r1.close()     // Catch:{ Exception -> 0x01a4 }
                goto L_0x01ae
            L_0x01a4:
                r1 = move-exception
                java.lang.String r4 = "MicroMsg.Sns.SnsAdNativieLandingTestUI"
                java.lang.String r1 = r1.getMessage()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            L_0x01ae:
                r0.disconnect()
            L_0x01b1:
                byte[] r5 = f277683g
                monitor-enter(r5)
                java.util.Set<java.lang.String> r0 = f277682f     // Catch:{ all -> 0x01cd }
                r12 = r12[r2]     // Catch:{ all -> 0x01cd }
                java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x01cd }
                r0.remove(r12)     // Catch:{ all -> 0x01cd }
                monitor-exit(r5)     // Catch:{ all -> 0x01cd }
                java.lang.String r12 = "doInBackground"
                java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r0)
            L_0x01c5:
                java.lang.String r12 = "doInBackground"
                java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r0)
                return r3
            L_0x01cd:
                r12 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x01cd }
                java.lang.String r0 = "doInBackground"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                throw r12
            L_0x01d7:
                r3 = move-exception
                r10 = r4
                r4 = r3
                r3 = r10
            L_0x01db:
                if (r3 == 0) goto L_0x01e3
                r3.close()     // Catch:{ IOException -> 0x01e1 }
                goto L_0x01e3
            L_0x01e1:
                goto L_0x01e8
            L_0x01e3:
                if (r1 == 0) goto L_0x01e8
                r1.close()     // Catch:{ IOException -> 0x01e1 }
            L_0x01e8:
                if (r0 == 0) goto L_0x01ff
                java.io.InputStream r1 = r0.getInputStream()     // Catch:{ Exception -> 0x01f2 }
                r1.close()     // Catch:{ Exception -> 0x01f2 }
                goto L_0x01fc
            L_0x01f2:
                r1 = move-exception
                java.lang.String r3 = "MicroMsg.Sns.SnsAdNativieLandingTestUI"
                java.lang.String r1 = r1.getMessage()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
            L_0x01fc:
                r0.disconnect()
            L_0x01ff:
                byte[] r1 = f277683g
                monitor-enter(r1)
                java.util.Set<java.lang.String> r0 = f277682f     // Catch:{ all -> 0x0214 }
                r12 = r12[r2]     // Catch:{ all -> 0x0214 }
                java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x0214 }
                r0.remove(r12)     // Catch:{ all -> 0x0214 }
                monitor-exit(r1)     // Catch:{ all -> 0x0214 }
                java.lang.String r12 = "doInBackground"
                java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r0)
                throw r4
            L_0x0214:
                r12 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0214 }
                java.lang.String r0 = "doInBackground"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                throw r12
            L_0x021e:
                r12 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x021e }
                java.lang.String r0 = "doInBackground"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$DowloadTask"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingTestUI.C95454i.doInBackground(java.lang.Object[]):java.lang.Object");
        }
    }

    /* renamed from: H7 */
    public static /* synthetic */ VideoSightView m121881H7(SnsAdNativeLandingTestUI snsAdNativeLandingTestUI) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
        VideoSightView videoSightView = snsAdNativeLandingTestUI.f277668d;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
        return videoSightView;
    }

    /* renamed from: I7 */
    public static void m121882I7(SnsAdNativeLandingTestUI snsAdNativeLandingTestUI) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
        snsAdNativeLandingTestUI.getClass();
        SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
        snsAdNativeLandingTestUI.f277668d.mo24788d(snsAdNativeLandingTestUI.f277670f);
        snsAdNativeLandingTestUI.f277668d.start();
        snsAdNativeLandingTestUI.f277671g.post(new C96006l3(snsAdNativeLandingTestUI));
        SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
        return C0966R.C0971layout.c1o;
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
        super.onCreate(bundle);
        this.mController.mo177043E();
        getWindow().setFlags(1024, 1024);
        ((Button) findViewById(C0966R.C0970id.jqv)).setOnClickListener(new C5444a());
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        int width = windowManager.getDefaultDisplay().getWidth();
        int height = windowManager.getDefaultDisplay().getHeight();
        String str = C112760b.m154195C() + "/sns_ad_landingpages";
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0966R.C0971layout.c1h, (ViewGroup) null);
        inflate.setMinimumHeight(height);
        VideoSightView videoSightView = new VideoSightView(getContext());
        this.f277668d = videoSightView;
        videoSightView.setLoop(false);
        ((ViewGroup) inflate.findViewById(C0966R.C0970id.jqd)).addView(this.f277668d, 0, new LinearLayout.LayoutParams(-1, -1));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.bottomMargin = BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), getContext().getResources().getDimension(C0966R.dimen.f3917iw));
        SnsAdNativeLandingPagesVideoPlayerLoadingBar snsAdNativeLandingPagesVideoPlayerLoadingBar = new SnsAdNativeLandingPagesVideoPlayerLoadingBar(getContext());
        this.f277669e = snsAdNativeLandingPagesVideoPlayerLoadingBar;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        SnsAdNativeLandingPagesVideoPlayerLoadingBar snsAdNativeLandingPagesVideoPlayerLoadingBar2 = snsAdNativeLandingPagesVideoPlayerLoadingBar;
        C117292a.m165358d(snsAdNativeLandingPagesVideoPlayerLoadingBar2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        snsAdNativeLandingPagesVideoPlayerLoadingBar.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(snsAdNativeLandingPagesVideoPlayerLoadingBar2, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f277668d.setPlayProgressCallback(true);
        ((ViewGroup) inflate).addView(this.f277669e, layoutParams);
        this.f277669e.setIplaySeekCallback(new C95446b());
        this.f277669e.setOnPlayButtonClickListener(new C95447c());
        this.f277669e.setIsPlay(this.f277668d.isPlaying());
        SnsAdNativeLandingPagesVideoPlayerLoadingBar snsAdNativeLandingPagesVideoPlayerLoadingBar3 = this.f277669e;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        SnsAdNativeLandingPagesVideoPlayerLoadingBar snsAdNativeLandingPagesVideoPlayerLoadingBar4 = snsAdNativeLandingPagesVideoPlayerLoadingBar3;
        C117292a.m165358d(snsAdNativeLandingPagesVideoPlayerLoadingBar4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        snsAdNativeLandingPagesVideoPlayerLoadingBar3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(snsAdNativeLandingPagesVideoPlayerLoadingBar4, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f277669e.seek(0);
        this.f277668d.setVideoCallback(new C95448d());
        this.f277668d.setEnableConfigChanged(false);
        this.f277668d.setOnClickListener(new C95450e());
        ((ViewGroup) findViewById(C0966R.C0970id.jqu)).addView(inflate, new LinearLayout.LayoutParams(width, height));
        this.f277668d.post(new C95451f());
        new C95454i(str, "adId" + "_image_" + MD5Util.getMD5String("http://mmsns.qpic.cn/mmsns/pUBe8EmICSCsszwvTNz7XO46mx3SDurmV95hHIeQvib0AEVBGYU02Mg/150"), C94866e1.ly0(), new C95452g(), 0).execute(new String[]{"http://mmsns.qpic.cn/mmsns/pUBe8EmICSCsszwvTNz7XO46mx3SDurmV95hHIeQvib0AEVBGYU02Mg/150"});
        new C95454i(str, "adId" + "_stream_" + MD5Util.getMD5String("http://wxsnsdy.tc.qq.com/105/20210/snsdyvideodownload?filekey=30280201010421301f0201690402534804105d999cf2831eae6ca6e65b177800230f0204009297fd0400&amp;bizid=1023&amp;hy=SH&amp;fileparam=302c020101042530230204136ffd9302045719f85d02024ef202031e8d7f02030f42400204045a320a0201000400"), C94866e1.ly0(), new C95453h(), Downloads.SPLIT_RANGE_SIZE_WAP).execute(new String[]{"http://wxsnsdy.tc.qq.com/105/20210/snsdyvideodownload?filekey=30280201010421301f0201690402534804105d999cf2831eae6ca6e65b177800230f0204009297fd0400&amp;bizid=1023&amp;hy=SH&amp;fileparam=302c020101042530230204136ffd9302045719f85d02024ef202031e8d7f02030f42400204045a320a0201000400"});
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
    }
}
