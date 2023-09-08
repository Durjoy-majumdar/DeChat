package p73;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.tencent.p014mm.autogen.events.WearYoEvent;
import com.tencent.p014mm.plugin.wear.p809ui.WearYoLockUI;
import com.tencent.p014mm.plugin.wear.p809ui.WearYoNoLockUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import j20.C117292a;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k20.C9556a;
import te3.y15;

/* renamed from: p73.a */
public class C110188a {

    /* renamed from: a */
    public LinkedHashMap<String, C110189a> f329638a = new LinkedHashMap<>();

    /* renamed from: b */
    public KeyguardManager f329639b = ((KeyguardManager) MMApplicationContext.getContext().getSystemService("keyguard"));

    /* renamed from: c */
    public PowerManager f329640c = ((PowerManager) MMApplicationContext.getContext().getSystemService("power"));

    /* renamed from: p73.a$a */
    public class C110189a {

        /* renamed from: a */
        public String f329641a;

        /* renamed from: b */
        public String f329642b;

        public C110189a(C110188a aVar, String str, String str2) {
            this.f329641a = str;
            this.f329642b = str2;
        }
    }

    /* renamed from: a */
    public void mo161588a() {
        C110189a aVar;
        WearYoEvent wearYoEvent = new WearYoEvent();
        WearYoEvent.C104600a aVar2 = wearYoEvent.f310022d;
        boolean z = true;
        aVar2.f310024a = 1;
        aVar2.f310025b = null;
        wearYoEvent.publish();
        if (wearYoEvent.f310023e.f310026a != 0) {
            Log.m105924i("MicroMsg.wear.WearYoLogic", "current show yo");
            return;
        }
        synchronized (this.f329638a) {
            Iterator<Map.Entry<String, C110189a>> it = this.f329638a.entrySet().iterator();
            aVar = it.hasNext() ? (C110189a) it.next().getValue() : null;
            if (aVar != null) {
                this.f329638a.remove(aVar.f329641a);
            }
        }
        if (aVar != null) {
            String str = aVar.f329642b;
            y15 y15 = new y15();
            Map<String, String> parseXml = XmlParser.parseXml(str, "msg", (String) null);
            if (parseXml == null) {
                y15.f145082d = 0;
            } else {
                y15.f145082d = Util.getInt(parseXml.get(".msg.yo.$type"), 0);
                y15.f145083e = Util.getInt(parseXml.get(".msg.yo.$count"), 0);
            }
            Intent intent = new Intent();
            intent.putExtra("key_talker", aVar.f329641a);
            try {
                intent.putExtra("key_data", y15.toByteArray());
            } catch (IOException unused) {
            }
            intent.addFlags(268435456);
            if (!this.f329639b.inKeyguardRestrictedInputMode() && this.f329640c.isScreenOn()) {
                z = false;
            }
            if (z) {
                intent.setClass(MMApplicationContext.getContext(), WearYoLockUI.class);
            } else {
                intent.setClass(MMApplicationContext.getContext(), WearYoNoLockUI.class);
            }
            Context context = MMApplicationContext.getContext();
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar3.mo10232b(), "com/tencent/mm/plugin/wear/model/yo/WearYoLogic", "publishNextYoMessage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar3.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/wear/model/yo/WearYoLogic", "publishNextYoMessage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
