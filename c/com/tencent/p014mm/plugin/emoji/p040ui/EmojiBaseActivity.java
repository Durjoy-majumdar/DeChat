package com.tencent.p014mm.plugin.emoji.p040ui;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import mu3.C109639a;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiBaseActivity */
public abstract class EmojiBaseActivity extends MMActivity {

    /* renamed from: d */
    public C93129a f268407d;

    /* renamed from: e */
    public C93130b f268408e;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiBaseActivity$a */
    public class C93129a extends MMHandler {
        public C93129a(C109639a aVar) {
            super(aVar);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            EmojiBaseActivity.this.mo127639H7(message);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiBaseActivity$b */
    public class C93130b extends MMHandler {
        public C93130b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            EmojiBaseActivity.this.mo127640I7(message);
        }
    }

    /* renamed from: H7 */
    public abstract void mo127639H7(Message message);

    /* renamed from: I7 */
    public abstract void mo127640I7(Message message);

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f268407d = new C93129a(C109639a.m148950a("EmojiBaseActivity_handlerThread"));
        this.f268408e = new C93130b(getMainLooper());
    }

    public void onDestroy() {
        super.onDestroy();
        C93129a aVar = this.f268407d;
        if (!(aVar == null || aVar.getLooper() == null)) {
            this.f268407d.getSerial().f328238b.mo182313f();
        }
        this.f268407d = null;
        this.f268408e = null;
    }
}
