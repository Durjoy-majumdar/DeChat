package com.tencent.p014mm.p136ui.chatting.component;

import ck3.C67391b;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C97625j3;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p680ru.C77569h;
import zj3.C79368l;
import zj3.C79387w;

/* renamed from: com.tencent.mm.ui.chatting.component.g5 */
public class C73488g5 implements QueueWorkerThread.ThreadObject {

    /* renamed from: d */
    public final /* synthetic */ long f215907d;

    /* renamed from: e */
    public final /* synthetic */ TranslateComponent f215908e;

    /* renamed from: com.tencent.mm.ui.chatting.component.g5$a */
    public class C73489a implements Runnable {
        public C73489a() {
        }

        public void run() {
            TranslateComponent translateComponent = C73488g5.this.f215908e;
            ChatFooter k1 = ((C79387w) translateComponent.f215752d.f193278b.mo102812a(C79387w.class)).mo102193k1();
            if (translateComponent.f215695i || k1.mo100437o0()) {
                translateComponent.mo102312d6(translateComponent.f215696j, 1, translateComponent.mo102310c6(translateComponent.f215693g));
            } else if (translateComponent.f215693g < 0) {
                translateComponent.mo102312d6(translateComponent.f215696j, 0, 0);
            } else {
                C72963f4 item = ((C79368l) translateComponent.f215752d.f193278b.mo102812a(C79368l.class)).getItem(translateComponent.f215693g + 1);
                if (translateComponent.mo102313e6(item)) {
                    translateComponent.mo102307Z5(item, translateComponent.f215693g + 1, false);
                    int i = translateComponent.f215693g;
                    if (translateComponent.f215694h && i != -1) {
                        C67391b bVar = translateComponent.f215752d;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Integer.valueOf(i));
                        C67391b bVar2 = bVar;
                        C117292a.m165358d(bVar2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/TranslateComponent", "scrollTo", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                        bVar.mo91544E(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(bVar2, "com/tencent/mm/ui/chatting/component/TranslateComponent", "scrollTo", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                        return;
                    }
                    return;
                }
                translateComponent.f215693g = -1;
                translateComponent.mo102312d6(translateComponent.f215696j, 0, 0);
            }
        }
    }

    public C73488g5(TranslateComponent translateComponent, long j) {
        this.f215908e = translateComponent;
        this.f215907d = j;
    }

    public boolean doInBackground() {
        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f215907d);
        if (b002.mo101015s3()) {
            b002.mo108743W2(b002.f230723F | 16);
        }
        ((C77569h) C86312j.m106911c(C77569h.class)).qx0(b002, true);
        MMHandlerThread.postToMainThread(new C73489a());
        ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(this.f215907d, b002);
        return false;
    }

    public boolean onPostExecute() {
        return false;
    }
}
