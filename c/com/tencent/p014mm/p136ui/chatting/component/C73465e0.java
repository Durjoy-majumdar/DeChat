package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.ChattingUIFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import java.util.LinkedList;
import java.util.Map;
import p565ir.C60606n;
import p565ir.C60613r;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.component.e0 */
public class C73465e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C73471f0 f215873d;

    public C73465e0(C73471f0 f0Var) {
        this.f215873d = f0Var;
    }

    public void run() {
        Class cls = C60606n.class;
        int i = this.f215873d.f215752d.mo91568i();
        int g = this.f215873d.f215752d.mo91566g() - i;
        int j = this.f215873d.f215752d.mo91569j() - i;
        if (g < 0 || g > j) {
            Log.m105921e(this.f215873d.f215884e, "tryRefresh error,index start:%d,end:%d", Integer.valueOf(g), Integer.valueOf(j));
            return;
        }
        BaseChattingUIFragment baseChattingUIFragment = this.f215873d.f215752d.f193286j;
        if (baseChattingUIFragment instanceof ChattingUIFragment) {
            C79368l lVar = ((ChattingUIFragment) baseChattingUIFragment).f215303u;
            LinkedList linkedList = new LinkedList();
            int count = lVar.getCount();
            while (g <= j && g < count) {
                C72963f4 item = lVar.getItem(g);
                if (item != null && item.getType() == 1075839025) {
                    Map<String, String> parseXml = XmlParser.parseXml(item.getContent(), "msg", (String) null);
                    int safeParseInt = Util.safeParseInt(parseXml.get(".msg.appmsg.extinfo.notifymsg.live_widget.status"));
                    String nullAsNil = Util.nullAsNil(parseXml.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.tips_id"));
                    boolean Bs = ((C60613r) C86312j.m106911c(C60613r.class)).mo84971Bs(item.getMsgId(), 4);
                    if (!Bs) {
                        linkedList.add(item);
                    } else {
                        String str = this.f215873d.f215884e;
                        Log.m105924i(str, "can not add to refresh, tipsId = " + nullAsNil + " ,status = " + safeParseInt + "notRefresh = " + Bs);
                        ((C60606n) C86312j.m106911c(cls)).mo85100ww().mo58258d().remove(nullAsNil);
                    }
                }
                g++;
            }
            ((C60606n) C86312j.m106911c(cls)).mo85100ww().mo58257c(linkedList);
        }
    }
}
