package com.tencent.p014mm.p136ui.conversation;

import android.os.Message;
import com.tencent.p014mm.p136ui.conversation.C44947a1;
import com.tencent.p014mm.p136ui.conversation.EnterpriseConversationUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import java.util.LinkedList;
import ob0.C11385n;
import rb0.C47961a;
import rb0.C47969h;
import rb0.C47984k;
import rb0.C48009v0;

/* renamed from: com.tencent.mm.ui.conversation.y */
public class C45018y extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ EnterpriseConversationUI.EnterpriseConversationFmUI f122113a;

    public C45018y(EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI) {
        this.f122113a = enterpriseConversationFmUI;
    }

    public void handleMessage(Message message) {
        int i;
        long j;
        String str;
        C47961a.C12965b bVar;
        C47969h jo;
        String username;
        Message message2 = message;
        if (message2 != null && message2.what == 1 && this.f122113a.thisActivity() != null && !this.f122113a.thisActivity().isFinishing()) {
            int count = this.f122113a.f121791i.getCount();
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < count; i5++) {
                C44947a1.C44951d s = this.f122113a.f121791i.getItem(i5);
                C72976h2 h2Var = s == null ? null : s.f121942c;
                if (!(h2Var == null || (username = h2Var.getUsername()) == null)) {
                    if (!C45628s0.m50740E(username) || !C47984k.m53336j(username)) {
                        Log.m105919d("MicroMsg.EnterpriseConversationUI", "checkEnterpriseChildConv delete conv %s", username);
                        linkedList.add(username);
                    } else {
                        Class cls = C75700k0.class;
                        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(username);
                        boolean a0 = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69755a0(username);
                        boolean z = (z1Var == null || (z1Var.getType() & 2048) == 0) ? false : true;
                        if (z && !a0) {
                            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69766g0(username);
                        } else if (!z && a0) {
                            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69772j0(username);
                        }
                        if (C47984k.m53339m(username)) {
                            linkedList2.add(username);
                        }
                        if (h2Var.mo108786G2() > 0) {
                            if (C45628s0.m50747L(username)) {
                                i3++;
                            } else {
                                i4++;
                                i2 += h2Var.mo108786G2();
                            }
                        }
                    }
                }
            }
            C47969h jo4 = C48009v0.Ex0().mo72749jo(this.f122113a.f121793n);
            int i6 = jo4 != null ? jo4.field_qyUin : 0;
            long j2 = jo4 != null ? jo4.field_wwCorpId : 0;
            if (jo4 != null) {
                i = i6;
                j = jo4.field_wwUserVid;
            } else {
                i = i6;
                j = 0;
            }
            int i7 = (Util.isNullOrNil(this.f122113a.f121800u) || (jo = C48009v0.Ex0().mo72749jo(this.f122113a.f121800u)) == null) ? 0 : jo.field_qyUin;
            C115669n nVar = C115669n.INSTANCE;
            EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI = this.f122113a;
            LinkedList linkedList3 = linkedList2;
            String str2 = "";
            int i8 = i7;
            nVar.mo160131h(12892, enterpriseConversationFmUI.f121793n, Integer.valueOf(enterpriseConversationFmUI.f121801v), Integer.valueOf(count), str2, Integer.valueOf(this.f122113a.f121798s), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(this.f122113a.f121799t), Integer.valueOf(i8), Integer.valueOf(i), Long.valueOf(j2), Long.valueOf(j));
            EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI2 = this.f122113a;
            Log.m105919d("MicroMsg.EnterpriseConversationUI", "enter biz enterprise father report: %s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", enterpriseConversationFmUI2.f121793n, Integer.valueOf(enterpriseConversationFmUI2.f121801v), Integer.valueOf(count), str2, Integer.valueOf(this.f122113a.f121798s), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(this.f122113a.f121799t), Integer.valueOf(i8), Integer.valueOf(i), Long.valueOf(j2), Long.valueOf(j));
            if (linkedList.size() > 0) {
                ((C44660i2) C97625j3.m125812b().mo105908w()).mo69767h(linkedList);
                this.f122113a.f121791i.mo1333o();
            }
            if (C48009v0.wx0().mo72736c(this.f122113a.f121793n, (C47961a.C12965b) null)) {
                C48009v0.Ex0().mo72745SE(this.f122113a.f121793n, (C11385n) null);
            }
            C47961a wx02 = C48009v0.wx0();
            EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI3 = this.f122113a;
            if (enterpriseConversationFmUI3.f121792j == null) {
                String TE = C48009v0.Fx0().mo72758TE(enterpriseConversationFmUI3.f121793n);
                if (!Util.isNullOrNil(TE)) {
                    str2 = TE;
                }
                enterpriseConversationFmUI3.f121792j = str2;
            }
            if (Util.isNullOrNil(enterpriseConversationFmUI3.f121792j)) {
                bVar = null;
                str = null;
            } else {
                str = enterpriseConversationFmUI3.f121792j;
                bVar = null;
            }
            wx02.mo72736c(str, bVar);
            if (linkedList3.size() > 0) {
                for (int i9 = 0; i9 < linkedList3.size(); i9++) {
                    C48009v0.wx0().mo72736c((String) linkedList3.get(i9), bVar);
                }
            }
        }
    }
}
