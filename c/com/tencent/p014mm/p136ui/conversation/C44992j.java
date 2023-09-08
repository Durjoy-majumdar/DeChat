package com.tencent.p014mm.p136ui.conversation;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import java.util.HashMap;
import rx3.C13598b0;
import zp3.C23555k;
import zp3.C23564m;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.conversation.j */
public final class C44992j {

    /* renamed from: a */
    public static final C44992j f122046a = new C44992j();

    /* renamed from: b */
    public static final HashMap<String, C23555k.C23562d> f122047b;

    /* renamed from: com.tencent.mm.ui.conversation.j$a */
    public static final class C44993a extends C23555k.C23562d {

        /* renamed from: com.tencent.mm.ui.conversation.j$a$a */
        public static final class C44994a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f122048d;

            public C44994a(View view) {
                this.f122048d = view;
            }

            public final void run() {
                C72963f4 Ex0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Ex0("notifymessage");
                Object tag = this.f122048d.getTag(C0966R.C0970id.bt6);
                C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.storage.Conversation");
                Object tag2 = this.f122048d.getTag(C0966R.C0970id.bt8);
                C87412m.m108592e(tag2, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) tag2).intValue();
                int createTime = (int) (Ex0.getCreateTime() / ((long) 1000));
                String p2 = ((C72976h2) tag).mo108822p2();
                C115669n.INSTANCE.mo160131h(22611, 1, Integer.valueOf(createTime), p2, Integer.valueOf(C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC, true) ^ true ? 1 : 0), Integer.valueOf(intValue));
            }
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            C87412m.m108594g(view, "view");
            Log.m105924i("MicroMsg.ConversationWithCacheAdapter", "notifymessage item explosure,isExposed = " + z);
            if (z) {
                ((C119157j) C119157j.f356862d).mo183870a(new C44994a(view));
            }
        }
    }

    static {
        HashMap<String, C23555k.C23562d> hashMap = new HashMap<>();
        f122047b = hashMap;
        hashMap.put("notifymessage", new C44993a());
    }

    /* renamed from: a */
    public final void mo70304a(String str, View view) {
        C13598b0 b0Var;
        C87412m.m108594g(str, "talker");
        C87412m.m108594g(view, "itemView");
        C23555k.C23562d dVar = f122047b.get(str);
        if (dVar != null) {
            C23564m.m28138h(view, dVar);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            C23564m.m28138h(view, (C23555k.C23562d) null);
        }
    }
}
