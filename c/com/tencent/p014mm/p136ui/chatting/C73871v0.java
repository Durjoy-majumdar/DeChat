package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C40339m;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.component.C73655y0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C75604z3;
import eb0.C97625j3;
import java.util.LinkedList;
import java.util.Set;
import nj3.C76879j;
import p154fy.C87121j;
import p680ru.C77569h;
import qo3.C89779i0;
import s90.C77632o;
import t90.C77878b;

/* renamed from: com.tencent.mm.ui.chatting.v0 */
public class C73871v0 {

    /* renamed from: com.tencent.mm.ui.chatting.v0$a */
    public static class C73872a implements QueueWorkerThread.ThreadObject {

        /* renamed from: d */
        public Set<Long> f216786d;

        /* renamed from: e */
        public C89779i0 f216787e;

        /* renamed from: f */
        public C77632o f216788f;

        public C73872a(Set<Long> set, C89779i0 i0Var, C77632o oVar) {
            this.f216786d = set;
            this.f216787e = i0Var;
            this.f216788f = oVar;
        }

        public boolean doInBackground() {
            C77878b bVar;
            Set<Long> set = this.f216786d;
            Class cls = C77569h.class;
            LinkedList<Long> linkedList = new LinkedList<>();
            LinkedList linkedList2 = new LinkedList();
            String str = null;
            for (Long next : set) {
                C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(next.longValue());
                int i = -1;
                if (b002.getMsgId() == next.longValue()) {
                    if (b002.mo101020w3()) {
                        i = C40339m.m43520a(b002);
                        ((C77569h) C86312j.m106911c(cls)).mo35245rb(b002, i);
                    } else {
                        ((C77569h) C86312j.m106911c(cls)).Tc0(b002);
                    }
                }
                if (str == null) {
                    str = b002.mo108768t();
                }
                linkedList.add(next);
                linkedList2.add(b002.mo108774y2() + "");
                if (!(i != 6 || (bVar = (C77878b) C68070l.C68072b.m80422u(b002.getContent(), b002.mo108775z2()).mo93555w(C77878b.class)) == null || bVar.f226901b == 0)) {
                    linkedList2.add(bVar.f226901b + "");
                    Log.m105925i("MicroMsg.ChattingEditModeDelMsg", "add file overwritenewmsgid %s", Long.valueOf(bVar.f226901b));
                }
            }
            Log.m105924i("MicroMsg.ChattingEditModeDelMsg", "delSelectMsg");
            if (linkedList.size() != 0) {
                for (Long longValue : linkedList) {
                    C75604z3.m90834f(longValue.longValue());
                }
            }
            if (str == null) {
                str = "$deleteMultiMsg$";
            }
            ((C87121j) C86312j.m106911c(C87121j.class)).mo71223wE(str, 9, "deleteMessages", Util.listToString(linkedList2, ","));
            C77632o oVar = this.f216788f;
            if (oVar != null) {
                oVar.mo22504z1(C77632o.C77633a.del);
            }
            return true;
        }

        public boolean onPostExecute() {
            C89779i0 i0Var = this.f216787e;
            if (i0Var == null) {
                return true;
            }
            i0Var.dismiss();
            C77632o oVar = this.f216788f;
            if (oVar == null) {
                return true;
            }
            oVar.mo22502r7(C77632o.C77633a.del);
            return true;
        }
    }

    /* renamed from: a */
    public static void m87560a(Context context, Set<Long> set, C77632o oVar) {
        if (context == null) {
            Log.m105928w("MicroMsg.ChattingEditModeDelMsg", "do delete msg fail, context is null");
        } else if (set == null || set.isEmpty()) {
            Log.m105928w("MicroMsg.ChattingEditModeDelMsg", "do delete msg fail, select ids is empty");
        } else {
            C73655y0.f216259q.add(new C73872a(set, C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(C0966R.string.byh), true, false, (DialogInterface.OnCancelListener) null), oVar));
            C115669n.INSTANCE.mo160131h(10811, 4, Integer.valueOf(set.size()));
        }
    }
}
