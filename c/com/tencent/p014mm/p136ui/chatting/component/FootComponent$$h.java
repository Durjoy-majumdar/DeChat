package com.tencent.p014mm.p136ui.chatting.component;

import android.widget.ImageButton;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75597w2;
import f40.C86709a0;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.component.FootComponent$$h */
public class FootComponent$$h implements C75597w2.C31525a {

    /* renamed from: a */
    public final /* synthetic */ String f215531a;

    /* renamed from: b */
    public final /* synthetic */ C72996z1 f215532b;

    /* renamed from: c */
    public final /* synthetic */ FootComponent f215533c;

    /* renamed from: com.tencent.mm.ui.chatting.component.FootComponent$$h$a */
    public class C73346a implements Runnable {

        /* renamed from: com.tencent.mm.ui.chatting.component.FootComponent$$h$a$a */
        public class C73347a implements Runnable {
            public C73347a() {
            }

            public void run() {
                ChatFooter chatFooter = FootComponent$$h.this.f215533c.f215510e;
                ImageButton imageButton = chatFooter.f211946v;
                if (imageButton != null && imageButton.getVisibility() == 0) {
                    chatFooter.mo100363M0(true);
                }
            }
        }

        public C73346a() {
        }

        public void run() {
            FootComponent$$h footComponent$$h = FootComponent$$h.this;
            footComponent$$h.f215533c.mo102186b6(footComponent$$h.f215531a, footComponent$$h.f215532b, new ArrayList());
            MMHandlerThread.postToMainThread(new C73347a());
        }

        public String toString() {
            return super.toString() + "|getContactCallBack";
        }
    }

    public FootComponent$$h(FootComponent footComponent, String str, C72996z1 z1Var) {
        this.f215533c = footComponent;
        this.f215531a = str;
        this.f215532b = z1Var;
    }

    /* renamed from: a */
    public void mo1109a(String str, boolean z) {
        if (z && Util.isEqual(this.f215533c.f215752d.mo91577r(), str)) {
            C86709a0.m107525e().postToWorker(new C73346a());
        }
    }
}
