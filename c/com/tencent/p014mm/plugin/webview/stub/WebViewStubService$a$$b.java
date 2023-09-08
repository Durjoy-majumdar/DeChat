package com.tencent.p014mm.plugin.webview.stub;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import bd2.C79690d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.NotifyStartWebViewParamsEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewLongClickHelper;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C44040v3;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.MsgHandler;
import com.tencent.p014mm.plugin.webview.stub.WebViewStubService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import j83.C9286a;
import java.util.HashSet;
import ke3.C88144b;
import kv1.C99252h;
import nj3.C76912y0;
import p248ug.C52558c;
import p255vr.C65873e;
import qe3.C12212g;
import rb0.C47984k;
import rb0.C47997p;
import rb0.C48001q;
import rb0.C48003r;
import rb0.C48009v0;
import sj0.C90210f;
import te3.C52054y14;
import u73.C101980n;
import u73.C101983r;
import u73.C22613h1;
import wc3.C15141z;
import wc3.C90945m;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubService$a$$b */
public class WebViewStubService$a$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f211204d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f211205e;

    /* renamed from: f */
    public final /* synthetic */ int f211206f;

    /* renamed from: g */
    public final /* synthetic */ WebViewStubService.C43781a f211207g;

    public WebViewStubService$a$$b(WebViewStubService.C43781a aVar, int i, Bundle bundle, int i2) {
        this.f211207g = aVar;
        this.f211204d = i;
        this.f211205e = bundle;
        this.f211206f = i2;
    }

    public void run() {
        C72976h2 M;
        Class cls = C79690d.class;
        int i = this.f211204d;
        if (i == 20) {
            this.f211205e.setClassLoader(WebViewStubService$a$$b.class.getClassLoader());
            C44040v3.m48330a(this.f211206f).f22704n = this.f211205e.getBundle("jsapiargs");
            String str = (String) this.f211205e.getCharSequence("bizofstartfrom");
            Bundle bundle = this.f211205e.getBundle("startwebviewparams");
            if (!(str == null || bundle == null)) {
                NotifyStartWebViewParamsEvent notifyStartWebViewParamsEvent = new NotifyStartWebViewParamsEvent();
                NotifyStartWebViewParamsEvent.C67743a aVar = notifyStartWebViewParamsEvent.f193770d;
                aVar.f193771a = str;
                aVar.f193772b = bundle;
                notifyStartWebViewParamsEvent.publish();
            }
            WebViewStubService.this.f118282w = this.f211205e.getInt("screen_orientation", -1);
        } else if (i == 21) {
            C44040v3.m48330a(this.f211206f).mo7224r6().putAll(this.f211205e);
        } else if (i == 29) {
            String string = this.f211205e.getString("srcUsername");
            C48009v0.Fx0().getClass();
            Class cls2 = C75700k0.class;
            if (!Util.isNullOrNil(string) && C47984k.m53339m(string)) {
                C52558c b = C47984k.m53328b(string);
                if (b.mo73500r2(false) != null && b.mo73500r2(false).mo73511d() != null && !Util.isNullOrNil(b.mo73498p2()) && (M = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls2)).mo96094Ku()).mo69742M(b.mo73498p2())) != null && M.getUsername().equals(string) && M.mo108786G2() > 0) {
                    ((C44660i2) ((C75700k0) C86709a0.m107533q(cls2)).mo96094Ku()).mo69778p0(b.mo73498p2());
                }
                Cursor zs02 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).zs0(string);
                zs02.moveToFirst();
                boolean z = false;
                while (!zs02.isAfterLast()) {
                    C72963f4 f4Var = new C72963f4();
                    f4Var.convertFrom(zs02);
                    f4Var.mo100991d(4);
                    Log.m105918d("MicroMsg.BizInfoStorage", "writeOpLog: msgSvrId = " + f4Var.mo108774y2() + " status = " + f4Var.getStatus());
                    zs02.moveToNext();
                    z = true;
                }
                zs02.close();
                if (z) {
                    ((C44660i2) ((C75700k0) C86709a0.m107533q(cls2)).mo96094Ku()).mo69778p0(string);
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).By0(string);
                }
            }
            C48009v0.Fx0().getClass();
            if (!Util.isNullOrNil(string) && C47984k.m53339m(string)) {
                ((MMNotification) ((C79690d) C86312j.m106911c(cls)).mo109806kA()).f194715b = string;
                MMNotification mMNotification = (MMNotification) ((C79690d) C86312j.m106911c(cls)).mo109806kA();
                mMNotification.getClass();
                Log.m105918d("MicroMsg.MMNotification", "force cancelNotification");
                mMNotification.f194719f = false;
                mMNotification.f194722i.f194756a.mo93232b();
            }
            C48009v0.Cx0().getClass();
            if (!Util.isNullOrNil(string) && C47984k.m53339m(string)) {
                C47997p Cx0 = C48009v0.Cx0();
                Cx0.getClass();
                ((C119157j) C119157j.f356862d).mo183875f(new C48001q(Cx0, (C52054y14) null, string, (C72963f4) null, 0));
            }
        } else if (i == 30) {
            String string2 = this.f211205e.getString("srcUsername");
            C48009v0.Fx0().getClass();
            if (!Util.isNullOrNil(string2) && C47984k.m53339m(string2)) {
                ((MMNotification) ((C79690d) C86312j.m106911c(cls)).mo109806kA()).f194715b = "";
            }
            C48009v0.Cx0().getClass();
            if (!Util.isNullOrNil(string2) && C47984k.m53339m(string2)) {
                C47997p Cx02 = C48009v0.Cx0();
                Cx02.getClass();
                ((C119157j) C119157j.f356862d).mo183875f(new C48003r(Cx02, (C52054y14) null, string2));
            }
        } else if (i == 53) {
            C101983r rVar = new C101983r();
            rVar.f300283b = WebViewStubService.this;
            rVar.f300288g = this.f211205e.getString("web_search_data_ui_image_path");
            rVar.f300285d = this.f211205e.getInt("KWebSearchSendDataImagePath_from_source");
            rVar.f300290i = 83;
            rVar.f300282a = WebViewLongClickHelper.f118389s;
            WebViewLongClickHelper.f118389s = 0;
            ((C101980n) C86312j.m106911c(C101980n.class)).mo134683D6(rVar);
        } else if (i != 54) {
            switch (i) {
                case 1:
                    WebViewStubService.m47617a(WebViewStubService.this, 2, this.f211205e, this.f211206f);
                    return;
                case 2:
                    C76912y0.m92771j(WebViewStubService.this, (View) null);
                    return;
                case 3:
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("stat_scene", 4);
                    MsgHandler a = C44040v3.m48330a(this.f211206f);
                    if (a != null) {
                        bundle2.putString("stat_url", a.mo7216n6());
                    }
                    WebViewStubService.C43781a aVar2 = this.f211207g;
                    WebViewStubService.this.f118273n.post(new C6101e(aVar2, this.f211205e, bundle2));
                    return;
                case 4:
                    WebViewStubService.m47617a(WebViewStubService.this, 3, this.f211205e, this.f211206f);
                    return;
                case 5:
                    int i2 = this.f211205e.getInt("scene_end_type", 0);
                    int i3 = this.f211205e.getInt("scene_end_listener_hash_code", -1);
                    if (i3 != -1) {
                        ((HashSet) WebViewStubService.this.f118281v).add(Integer.valueOf(i3));
                    }
                    Log.m105925i("MicroMsg.WebViewStubService", "add Scene end, type:[%d] hashCode:[%d], set_size:[%d], before_inc_count[%d]", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(((HashSet) WebViewStubService.this.f118281v).size()), Integer.valueOf(WebViewStubService.this.f118272j));
                    if (i2 > 0) {
                        WebViewStubService.this.f118272j++;
                        Log.m105925i("MicroMsg.WebViewStubService", "real add Scene end, hashCode:[%d]", Integer.valueOf(i3));
                        C86709a0.m107524d().mo123455a(233, WebViewStubService.this);
                        C86709a0.m107524d().mo123455a(673, WebViewStubService.this);
                        C86709a0.m107524d().mo123455a(C90210f.CTRL_INDEX, WebViewStubService.this);
                        return;
                    }
                    return;
                case 6:
                    int i4 = this.f211205e.getInt("scene_end_type", 0);
                    int i5 = this.f211205e.getInt("scene_end_listener_hash_code", -1);
                    if (i5 != -1) {
                        ((HashSet) WebViewStubService.this.f118281v).remove(Integer.valueOf(i5));
                    }
                    Log.m105925i("MicroMsg.WebViewStubService", "remove Scene end, type:[%d] hashCode:[%d], set_size:[%d], before_dec_count:[%d]", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(((HashSet) WebViewStubService.this.f118281v).size()), Integer.valueOf(WebViewStubService.this.f118272j));
                    if (i4 > 0) {
                        WebViewStubService webViewStubService = WebViewStubService.this;
                        int i6 = webViewStubService.f118272j - 1;
                        webViewStubService.f118272j = i6;
                        if (i6 < 0) {
                            Log.m105921e("MicroMsg.WebViewStubService", "remove Scene end, type:[%d] hashCode:[%d], set size:[%d], unexpected_count[%d]", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(((HashSet) WebViewStubService.this.f118281v).size()), Integer.valueOf(WebViewStubService.this.f118272j));
                            WebViewStubService.this.f118272j = 0;
                        }
                        WebViewStubService webViewStubService2 = WebViewStubService.this;
                        if (webViewStubService2.f118272j <= 0 && ((HashSet) webViewStubService2.f118281v).size() <= 0) {
                            Log.m105925i("MicroMsg.WebViewStubService", "real remove Scene end, hashCode:[%d]", Integer.valueOf(i5));
                            if (C86709a0.m107522a()) {
                                C86709a0.m107524d().mo123470p(233, WebViewStubService.this);
                                C86709a0.m107524d().mo123470p(673, WebViewStubService.this);
                                C86709a0.m107524d().mo123470p(C90210f.CTRL_INDEX, WebViewStubService.this);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 7:
                    Intent intent = new Intent();
                    intent.putExtra("MMActivity.OverrideEnterAnimation", 0);
                    intent.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2469dt);
                    intent.addFlags(268435456);
                    C15141z zVar = C9286a.f29044a;
                    WebViewStubService webViewStubService3 = WebViewStubService.this;
                    ((C67654r1) zVar).getClass();
                    Intent intent2 = new Intent();
                    intent2.putExtras(intent.getExtras());
                    if (intent.getFlags() != 0) {
                        intent2.addFlags(intent.getFlags());
                    }
                    String str2 = C90945m.f260967a;
                    if (!C45628s0.m50756U()) {
                        C90945m.m114059i(webViewStubService3, C12212g.m11775a());
                        return;
                    } else {
                        C90945m.m114060j(MMApplicationContext.getContext(), C12212g.m11775a());
                        return;
                    }
                case 8:
                    Intent intent3 = new Intent();
                    intent3.putExtras(this.f211205e);
                    intent3.addFlags(268435456);
                    C15141z zVar2 = C9286a.f29044a;
                    WebViewStubService webViewStubService4 = WebViewStubService.this;
                    ((C67654r1) zVar2).getClass();
                    if (webViewStubService4 != null) {
                        Intent intent4 = new Intent();
                        intent4.putExtras(intent3.getExtras());
                        if (intent3.getFlags() != 0) {
                            intent4.addFlags(intent3.getFlags());
                        }
                        C88144b.m109791i(webViewStubService4, "subapp", ".ui.pluginapp.ContactSearchUI", intent4, (Bundle) null);
                        return;
                    }
                    return;
                default:
                    Log.m105921e("MicroMsg.WebViewStubService", "not support action code:[%d]", Integer.valueOf(i));
                    return;
            }
        } else {
            String string3 = this.f211205e.getString("web_search_data_ui_image_path_origin_url");
            String string4 = this.f211205e.getString("web_search_data_ui_image_path");
            long vk02 = ((C65873e) C86312j.m106911c(C65873e.class)).vk0(67);
            WebViewLongClickHelper.f118389s = vk02;
            String c = C99252h.m129298c(vk02);
            int i7 = (Util.isNullOrNil(string3) || (!string3.startsWith("http://mp.weixin.qq.com/s?") && !string3.startsWith("https://mp.weixin.qq.com/s?") && !string3.startsWith("http://mp.weixin.qq.com/s/") && !string3.startsWith("https://mp.weixin.qq.com/s/"))) ? 14 : 11;
            ChatImageWebSearchActionStruct chatImageWebSearchActionStruct = new ChatImageWebSearchActionStruct();
            chatImageWebSearchActionStruct.mo126611w(c);
            chatImageWebSearchActionStruct.mo126609u("");
            chatImageWebSearchActionStruct.f265370f = i7;
            chatImageWebSearchActionStruct.f265369e = 1;
            chatImageWebSearchActionStruct.f265371g = 83;
            chatImageWebSearchActionStruct.mo126608t("");
            chatImageWebSearchActionStruct.mo126607s("");
            chatImageWebSearchActionStruct.f265374j = 0;
            chatImageWebSearchActionStruct.mo126610v(MD5Util.getMD5String(string4));
            chatImageWebSearchActionStruct.f265377m = System.currentTimeMillis();
            chatImageWebSearchActionStruct.mo86054n();
            C22613h1.m26490p(chatImageWebSearchActionStruct);
        }
    }
}
