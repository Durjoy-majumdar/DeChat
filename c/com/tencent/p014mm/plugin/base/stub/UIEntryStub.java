package com.tencent.p014mm.plugin.base.stub;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.booter.NotifyReceiver;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXImageObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.p014mm.p136ui.chatting.C73323b5;
import com.tencent.p014mm.p136ui.chatting.C73674d5;
import com.tencent.p014mm.p136ui.transmit.SelectConversationUI;
import com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI;
import com.tencent.p014mm.pluginsdk.model.app.ReportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75576f4;
import eb0.C97625j3;
import ex0.C45696d;
import f40.C86709a0;
import f40.C86718e;
import h81.C32735h;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import nf3.C34830f;
import nj3.C88989a;
import p763ym.C79138l;
import sw1.C48477m;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.base.stub.UIEntryStub */
public class UIEntryStub extends HellActivity {

    /* renamed from: d */
    public String f197439d;

    /* renamed from: e */
    public int f197440e;

    /* renamed from: f */
    public Intent f197441f;

    /* renamed from: g */
    public boolean f197442g;

    /* renamed from: com.tencent.mm.plugin.base.stub.UIEntryStub$a */
    public class C68736a implements C75576f4.C75578b {
        public C68736a() {
        }

        /* renamed from: a */
        public void mo57753a(C114770g gVar) {
            WXImageObject wXImageObject;
            C48477m a;
            if (gVar == null) {
                UIEntryStub.this.finish();
                return;
            }
            boolean z = true;
            boolean z2 = false;
            Log.m105925i("MicroMsg.UIEntryStub", "onResume mHasHandled: %b", Boolean.valueOf(UIEntryStub.this.f197442g));
            UIEntryStub uIEntryStub = UIEntryStub.this;
            if (!uIEntryStub.f197442g) {
                uIEntryStub.f197442g = true;
                Bundle extras = uIEntryStub.f197441f.getExtras();
                if (uIEntryStub.isFinishing() || extras == null) {
                    Object[] objArr = new Object[1];
                    if (extras != null) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    Log.m105921e("MicroMsg.UIEntryStub", "handleWXAppMessage fail data null:%b", objArr);
                    uIEntryStub.finish();
                    return;
                }
                uIEntryStub.f197439d = extras.getString(ConstantsAPI.APP_PACKAGE);
                uIEntryStub.f197440e = extras.getInt(ConstantsAPI.SDK_VERSION);
                String string = extras.getString(ConstantsAPI.CONTENT);
                if (Util.isNullOrNil(string)) {
                    Log.m105920e("MicroMsg.UIEntryStub", "content is null");
                    uIEntryStub.finish();
                    return;
                }
                String queryParameter = Uri.parse(string).getQueryParameter("appid");
                Log.m105918d("MicroMsg.UIEntryStub", "handleWXAppMessage, appId = " + queryParameter);
                if (((C79138l) C86312j.m106911c(C79138l.class)).mo74006a3(queryParameter) && (a = C48477m.C13789a.m13091a()) != null) {
                    a.mo65659Ba(uIEntryStub, queryParameter, uIEntryStub.f197439d);
                }
                int i = extras.getInt("_wxapi_command_type");
                try {
                    extras.putBoolean("SendAppMessageWrapper_NoNeedStayInWeixin", false);
                } catch (Throwable unused) {
                }
                Log.m105924i("MicroMsg.UIEntryStub", "handle wxapp message: " + uIEntryStub.f197439d + ", sdkver=" + uIEntryStub.f197440e + ", cmd=" + i);
                if (i != 1) {
                    if (i == 2) {
                        SendMessageToWX.Req req = new SendMessageToWX.Req(extras);
                        WXMediaMessage wXMediaMessage = req.message;
                        if (wXMediaMessage == null || wXMediaMessage.getType() != 2 || (wXImageObject = (WXImageObject) req.message.mediaObject) == null || wXImageObject.checkArgs()) {
                            WXMediaMessage wXMediaMessage2 = req.message;
                            if (wXMediaMessage2 != null && wXMediaMessage2.getType() == 38) {
                                int i2 = req.scene;
                                if (!(i2 == 1 || i2 == 4)) {
                                    Log.m105920e("MicroMsg.UIEntryStub", "dealSendMsgToWx fail, video file object only supported share to timeline/chat");
                                    ReportUtil.m84997c(uIEntryStub, ReportUtil.m84995a(uIEntryStub.getIntent().getExtras(), -5), true, false);
                                    uIEntryStub.finish();
                                    return;
                                }
                            }
                            int i3 = req.scene;
                            if (i3 == 1 || i3 == 4) {
                                Log.m105925i("MicroMsg.UIEntryStub", "sendMessageToWx, req.scene = %s", Integer.valueOf(i3));
                                if (req.message.getType() == 8) {
                                    Log.m105920e("MicroMsg.UIEntryStub", "sendMessageToWx fail, emoji does not support WXSceneTimeline");
                                    ReportUtil.m84997c(uIEntryStub, ReportUtil.m84995a(uIEntryStub.getIntent().getExtras(), -5), true, false);
                                    uIEntryStub.finish();
                                    return;
                                }
                                new C68748c(uIEntryStub, queryParameter, req.openId, new C68751e(uIEntryStub, extras, req)).mo94584a();
                                return;
                            } else if (i3 == 3) {
                                new C68748c(uIEntryStub, queryParameter, req.openId, new C68753f(uIEntryStub, extras, req)).mo94584a();
                                return;
                            } else {
                                ReportUtil.ReportArgs a2 = ReportUtil.m84995a(extras, -2);
                                Intent intent = new Intent(uIEntryStub, SelectConversationUI.class);
                                intent.putExtra("Select_Report_Args", a2);
                                intent.putExtra("Select_Conv_NextStep", new Intent(uIEntryStub, SendAppMessageWrapperUI.class).putExtras(extras).putExtra("SendAppMessageWrapper_Scene", req.scene).putExtra("animation_pop_in", true));
                                intent.putExtra("Select_App_Id", queryParameter);
                                intent.putExtra("Select_Open_Id", req.openId);
                                intent.putExtra("Select_Conv_Type", 3);
                                if (req.message.getType() == 36 || req.message.getType() == 46) {
                                    intent.putExtra("mutil_select_is_ret", !((WXMiniProgramObject) req.message.mediaObject).withShareTicket);
                                } else {
                                    intent.putExtra("mutil_select_is_ret", true);
                                }
                                if (req.message.getType() == 45) {
                                    intent.putExtra("Select_Send_Card", true);
                                }
                                if (!C97625j3.m125811a() || C86718e.m107551r()) {
                                    Log.m105920e("MicroMsg.UIEntryStub", "not logged in, ignore");
                                } else {
                                    C9556a aVar = new C9556a();
                                    aVar.mo10233c(intent);
                                    UIEntryStub uIEntryStub2 = uIEntryStub;
                                    C117292a.m165358d(uIEntryStub2, aVar.mo10232b(), "com/tencent/mm/plugin/base/stub/UIEntryStub", "dealSendMsgToWx", "(Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;Landroid/os/Bundle;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    uIEntryStub.startActivity((Intent) aVar.mo10231a(0));
                                    C117292a.m165359e(uIEntryStub2, "com/tencent/mm/plugin/base/stub/UIEntryStub", "dealSendMsgToWx", "(Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;Landroid/os/Bundle;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                }
                                uIEntryStub.finish();
                                return;
                            }
                        } else {
                            Log.m105920e("MicroMsg.UIEntryStub", "dealSendMsgToWx fail, WXImageObject checkArgs fail, maybe use deprecated field imageUrl");
                            ReportUtil.m84997c(uIEntryStub, ReportUtil.m84995a(uIEntryStub.getIntent().getExtras(), -5), true, false);
                            uIEntryStub.finish();
                            return;
                        }
                    } else if (i != 3) {
                        if (i == 4) {
                            if (!C97625j3.m125811a() || C86718e.m107551r()) {
                                Log.m105920e("MicroMsg.UIEntryStub", "not logged in, ignore");
                            } else {
                                C73674d5.f216319c.event(extras);
                                C73674d5.f216319c.doNotify();
                            }
                        }
                    } else if (!C97625j3.m125811a() || C86718e.m107551r()) {
                        Log.m105920e("MicroMsg.UIEntryStub", "not logged in, ignore");
                    } else {
                        C73323b5.f215434d.event(extras);
                        C73323b5.f215434d.doNotify();
                    }
                } else if (!C97625j3.m125811a() || C86718e.m107551r()) {
                    Log.m105920e("MicroMsg.UIEntryStub", "not logged in, ignore");
                } else {
                    Log.m105924i("MicroMsg.UIEntryStub", "handleWXAppMessage  COMMAND_SENDAUTH start SDKOAuthUI");
                    Intent putExtras = new Intent().putExtras(extras);
                    if (((C32735h) C86312j.m106911c(C32735h.class)).mo58782dM(new C34830f()) == 1) {
                        z2 = true;
                    }
                    if (!(true ^ ((C45696d) C86709a0.m107533q(C45696d.class)).Rq0()) || z2) {
                        Log.m105924i("MicroMsg.UIEntryStub", "do auth directly!");
                        C88144b.m109791i(uIEntryStub, "webview", ".ui.tools.SDKOAuthUI", putExtras, (Bundle) null);
                    } else {
                        Log.m105924i("MicroMsg.UIEntryStub", "overseas user, need to do extra auth!");
                        C88144b.m109791i(uIEntryStub, "webview", ".ui.tools.SDKOAuthWechatUI", putExtras, (Bundle) null);
                    }
                }
                uIEntryStub.finish();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i("MicroMsg.UIEntryStub", "onCreate");
        super.onCreate(bundle);
        NotifyReceiver.m98645c();
        this.f197442g = false;
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.UIEntryStub", "onDestroy");
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f197441f = intent;
        Log.m105925i("MicroMsg.UIEntryStub", "onNewIntent mHasHandled: %b", Boolean.valueOf(this.f197442g));
        this.f197442g = false;
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.UIEntryStub", "onPause");
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.UIEntryStub", "onResume");
        if (this.f197441f == null) {
            this.f197441f = getIntent();
        }
        C97625j3.m125815e().mo123460f(new C75576f4(new C68736a(), (String) null));
    }
}
