package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C19615i1;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C30749j1;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72978k1;
import com.tencent.p014mm.storage.C72980l1;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import ke3.C88144b;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.e3 */
public class C18198e3 implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineNewMsgUI f50298d;

    public C18198e3(BizTimeLineNewMsgUI bizTimeLineNewMsgUI) {
        this.f50298d = bizTimeLineNewMsgUI;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Map<String, String> parseXml;
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineNewMsgUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        C19623o0 a = this.f50298d.f50194o.getItem(i);
        if (a == null) {
            Log.m105920e("MicroMsg.BizTimeLineNewMsgUI", "onItemClick info is null");
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineNewMsgUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        String str = a.field_talker;
        int i2 = 0;
        if (a.mo25757E2()) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", a.mo25771u2().f55496f);
            intent.putExtra("geta8key_username", a.mo25771u2().f55491a);
            intent.putExtra("geta8key_scene", 56);
            C88144b.m109791i(this.f50298d.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        } else if (C19615i1.m21054a(a)) {
            AppCompatActivity context = this.f50298d.getContext();
            C87412m.m108594g(context, "context");
            if (!Util.isNullOrNil(a.field_content) && a.mo25755C2() && (parseXml = XmlParser.parseXml(a.field_content, "msg", (String) null)) != null) {
                C30749j1 j1Var = new C30749j1(a, parseXml, context);
                C72978k1 k1Var = new C72978k1(parseXml, context, a);
                C72980l1 l1Var = new C72980l1(parseXml, a, context);
                int i3 = Util.getInt(parseXml.get(".msg.appmsg.mmreader.notify_msg.act"), 0);
                if (i3 == 1) {
                    j1Var.invoke();
                } else if (i3 == 2) {
                    k1Var.invoke();
                } else if (i3 == 3) {
                    l1Var.invoke();
                }
            }
            str = C19615i1.m21063j(a);
            i2 = C19615i1.m21062i(a);
        } else if (a.field_msgId > 0) {
            if (((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(a.field_msgId).getMsgId() == 0) {
                BizTimeLineNewMsgUI bizTimeLineNewMsgUI = this.f50298d;
                C76879j.m92726T(bizTimeLineNewMsgUI, bizTimeLineNewMsgUI.getString(C0966R.string.ape));
                C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineNewMsgUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("Chat_User", a.field_talker);
            intent2.putExtra("finish_direct", true);
            intent2.putExtra("from_global_search", true);
            intent2.putExtra("msg_local_id", a.field_msgId);
            intent2.putExtra("specific_chat_from_scene", 9);
            intent2.putExtra("preChatTYPE", 13);
            C88144b.m109801s(this.f50298d.getContext(), ".ui.chatting.ChattingUI", intent2, (Bundle) null);
        }
        long j2 = a.field_msgId;
        BizTimeLineNewMsgUI bizTimeLineNewMsgUI2 = this.f50298d;
        C19615i1.m21067n(str, 1, i2, j2, i, bizTimeLineNewMsgUI2.f50200u, bizTimeLineNewMsgUI2.f50195p - 1, (int) bizTimeLineNewMsgUI2.f50201v);
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineNewMsgUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
