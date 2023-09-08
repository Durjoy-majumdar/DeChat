package com.tencent.p014mm.p136ui.conversation;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72976h2;
import di3.C86312j;
import f40.C86709a0;
import f62.C27049a1;
import f62.C75700k0;
import g62.C75875l;
import kr0.C34010q0;
import p740wo.C53193b;

/* renamed from: com.tencent.mm.ui.conversation.b */
public class C30848b implements C27049a1 {
    /* renamed from: V4 */
    public void mo54537V4(C72963f4 f4Var, C75875l.C45886e eVar, boolean[] zArr) {
    }

    /* renamed from: a2 */
    public void mo54538a2(C72963f4 f4Var, C72976h2 h2Var, boolean z, C75875l.C45886e eVar) {
        boolean z2;
        if (eVar != null && h2Var != null && !Util.isNullOrNil(h2Var.getUsername())) {
            if (!"insert".equals(eVar.f123845b) && !"update".equals(eVar.f123845b)) {
                "delete".equals(eVar.f123845b);
            } else if (((C53193b) C86312j.m106911c(C53193b.class)).mo73723Hd(h2Var.getUsername())) {
                ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).getClass();
                if ("conversationboxservice".equals(h2Var.mo108782C2())) {
                    Log.m105918d("MicroMsg.ConversationStorage", "conv is in conv box");
                    z2 = true;
                } else {
                    Log.m105918d("MicroMsg.ConversationStorage", "conv is not in conv box");
                    z2 = false;
                }
                boolean z3 = !z2;
                Log.m105919d("MicroMsg.ConvBoxExtension", "this conversation is a conv box contact! %s", Boolean.valueOf(z3));
                ((C34010q0) C86312j.m106911c(C34010q0.class)).X10(h2Var, true, z3);
            }
        }
    }

    /* renamed from: k3 */
    public void mo54539k3(C72963f4 f4Var, C72976h2 h2Var, boolean z, C75875l.C45886e eVar) {
        if (z && ((C53193b) C86312j.m106911c(C53193b.class)).mo73723Hd(h2Var.getUsername())) {
            h2Var.mo108807c3("conversationboxservice");
        }
    }
}
