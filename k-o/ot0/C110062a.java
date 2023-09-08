package ot0;

import android.os.Looper;
import android.os.Message;
import android.text.Selection;
import com.tencent.p014mm.plugin.appbrand.utils.C84737f0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104873k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.HashMap;
import ll0.C109395k;
import ll0.C109399l;

/* renamed from: ot0.a */
public final class C110062a {

    /* renamed from: a */
    public final MMHandler f329348a = new C110063a(Looper.getMainLooper());

    /* renamed from: b */
    public volatile C110065c f329349b;

    /* renamed from: ot0.a$a */
    public class C110063a extends MMHandler {
        public C110063a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (1000 == message.what) {
                String str = (String) message.obj;
                int i = message.arg1;
                if (C110062a.this.f329349b != null) {
                    C109399l lVar = (C109399l) C110062a.this.f329349b;
                    C104873k kVar = lVar.f327486a;
                    int i2 = kVar.f311429p;
                    if (kVar.f311430q == null) {
                        Log.m105921e("MicroMsg.JsApiShowKeyboard", "dispatchKBValue(%s), but get NULL inputWidget", lVar.f327487b);
                        return;
                    }
                    C109395k.C109398d dVar = new C109395k.C109398d();
                    HashMap hashMap = new HashMap();
                    hashMap.put("value", C84737f0.m104397d(str));
                    hashMap.put("data", lVar.f327489d.mo160598z(i2));
                    hashMap.put("cursor", Integer.valueOf(i));
                    hashMap.put("inputId", Integer.valueOf(i2));
                    hashMap.put("keyCode", Integer.valueOf(lVar.f327486a.f311430q.getLastKeyPressed()));
                    dVar.mo115195q(lVar.f327488c.getRuntime().mo113047b0(), lVar.f327488c.getComponentId());
                    dVar.mo115165o(hashMap);
                    dVar.mo115158h();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo161469a(CharSequence charSequence, boolean z) {
        if (charSequence != null) {
            Message obtainMessage = this.f329348a.obtainMessage(1000, Selection.getSelectionEnd(charSequence), 0, charSequence.toString());
            this.f329348a.removeMessages(1000);
            this.f329348a.sendMessageDelayed(obtainMessage, z ? 150 : 0);
        }
    }
}
