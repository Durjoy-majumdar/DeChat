package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.autogen.events.GameCenterOperationEvent;
import com.tencent.p014mm.autogen.events.ReportMsgClickEvent;
import com.tencent.p014mm.autogen.events.StartWebViewEvent;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.modelimage.C1300x;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import mk3.C21506a;
import nc0.C76850a;
import p182kk.C61104a;
import tv2.C14096e;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.x1 */
public class C72841x1 implements View.OnClickListener {

    /* renamed from: d */
    public Context f212263d;

    public C72841x1(Context context) {
        this.f212263d = context;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/SourceClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Object tag = view.getTag();
        if (tag instanceof x1$$d) {
            x1$$d x1__d = (x1$$d) tag;
            boolean z = false;
            if (x1__d != null) {
                if ("wx7fa037cc7dfabad5".equals(x1__d.f212274a)) {
                    C14096e.m13447a(33);
                    if (C97625j3.m125812b().mo105907v().get("gh_43f2581f6fd6").mo62927s3()) {
                        Intent intent = new Intent();
                        intent.putExtra("Chat_User", "gh_43f2581f6fd6");
                        intent.putExtra("finish_direct", true);
                        C88144b.m109801s(this.f212263d, ".ui.chatting.ChattingUI", intent, (Bundle) null);
                    } else {
                        Intent intent2 = new Intent();
                        intent2.putExtra("Contact_User", "gh_43f2581f6fd6");
                        C88144b.m109791i(this.f212263d, Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
                    }
                } else if ("wx485a97c844086dc9".equals(x1__d.f212274a)) {
                    Intent intent3 = new Intent();
                    intent3.putExtra("shake_music", true);
                    intent3.putExtra("enter_from_scene", 3);
                    C88144b.m109791i(this.f212263d, "shake", ".ui.ShakeReportUI", intent3, (Bundle) null);
                } else if ("wxfbc915ff7c30e335".equals(x1__d.f212274a)) {
                    if (!C76850a.m92641m()) {
                        Intent intent4 = new Intent();
                        intent4.putExtra("BaseScanUI_select_scan_mode", 1);
                        if (!C61104a.m71651g(this.f212263d) && !C61104a.m71667w(this.f212263d) && !C61104a.m71647c(this.f212263d, true)) {
                            C88144b.m109791i(this.f212263d, "scanner", ".ui.BaseScanUI", intent4, (Bundle) null);
                        }
                    }
                } else if ("wxaf060266bfa9a35c".equals(x1__d.f212274a)) {
                    Intent intent5 = new Intent();
                    intent5.putExtra("shake_tv", true);
                    intent5.putExtra("enter_from_scene", 3);
                    C88144b.m109791i(this.f212263d, "shake", ".ui.ShakeReportUI", intent5, (Bundle) null);
                }
                z = true;
            } else {
                Log.m105928w("MicroMsg.SourceClickListener", "localAppRedirectHandle: but info or v is null");
            }
            if (!z) {
                String b = C72688j0.m85016b(this.f212263d, x1__d.f212274a, x1__d.f212275b);
                StartWebViewEvent startWebViewEvent = new StartWebViewEvent();
                StartWebViewEvent.C28835a aVar = startWebViewEvent.f79011d;
                aVar.f79012a = b;
                aVar.f79013b = this.f212263d;
                startWebViewEvent.publish();
            }
        } else if (tag instanceof x1$$c) {
            x1$$c x1__c = (x1$$c) tag;
            GameCenterOperationEvent gameCenterOperationEvent = new GameCenterOperationEvent();
            GameCenterOperationEvent.C40104a aVar2 = gameCenterOperationEvent.f107543d;
            aVar2.f107544a = 2;
            aVar2.f107549f = x1__c.f212270e;
            aVar2.f107550g = "chatting_src=" + x1__c.f212270e;
            GameCenterOperationEvent.C40104a aVar3 = gameCenterOperationEvent.f107543d;
            aVar3.f107546c = x1__c.f212266a;
            aVar3.f107545b = this.f212263d;
            gameCenterOperationEvent.publish();
            ReportMsgClickEvent reportMsgClickEvent = new ReportMsgClickEvent();
            ReportMsgClickEvent.C67778a aVar4 = reportMsgClickEvent.f193900d;
            aVar4.f193901a = this.f212263d;
            aVar4.f193907g = x1__c.f212270e;
            aVar4.f193902b = x1__c.f212266a;
            aVar4.f193903c = x1__c.f212267b;
            aVar4.f193905e = x1__c.f212269d;
            aVar4.f193904d = x1__c.f212268c;
            aVar4.f193908h = 5;
            aVar4.f193906f = x1__c.f212271f;
            aVar4.f193909i = x1__c.f212272g;
            aVar4.f193910j = "";
            aVar4.f193911k = x1__c.f212273h;
            reportMsgClickEvent.publish();
        } else if (tag instanceof x1$$b) {
            x1$$b x1__b = (x1$$b) tag;
            String str = x1__b.f212264a;
            Context context = this.f212263d;
            int i = 10000;
            if (context instanceof Activity) {
                i = ((Activity) context).getIntent().getIntExtra("KOpenArticleSceneFromScene", 10000);
            }
            C21506a.m24351Y5(3, x1__b.f212265b, str);
            C1300x.m1390a(this.f212263d, C92721n.m116873a(str, 260, i, (int) (System.currentTimeMillis() / 1000)), new x1$$a(i));
        }
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/chat/SourceClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
