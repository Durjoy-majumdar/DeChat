package com.tencent.p014mm.p136ui.chatting;

import android.os.Message;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.widget.MMTextView;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: com.tencent.mm.ui.chatting.g2 */
public class C73688g2 implements MMTextView.C74961b {

    /* renamed from: a */
    public C67391b f216345a = null;

    /* renamed from: b */
    public int f216346b = 0;

    /* renamed from: c */
    public MMHandler f216347c = new C73689a();

    /* renamed from: com.tencent.mm.ui.chatting.g2$a */
    public class C73689a extends MMHandler {
        public C73689a() {
        }

        public void handleMessage(Message message) {
            View view = (View) message.obj;
            if (C73688g2.this.f216346b != view.getScrollY()) {
                C73688g2.this.getClass();
                MMHandler mMHandler = C73688g2.this.f216347c;
                mMHandler.sendMessageDelayed(mMHandler.obtainMessage(0, view), 5);
                C73688g2.this.f216346b = view.getScrollY();
                return;
            }
            C73688g2.this.getClass();
        }
    }

    public C73688g2(C67391b bVar) {
        this.f216345a = bVar;
    }
}
