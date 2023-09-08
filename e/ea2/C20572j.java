package ea2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.PhoneStatusWatcher;
import java.util.Iterator;

/* renamed from: ea2.j */
public class C20572j implements PhoneStatusWatcher.PhoneCallListener {

    /* renamed from: a */
    public final /* synthetic */ C20561h f57905a;

    public C20572j(C20561h hVar) {
        this.f57905a = hVar;
    }

    public void onPhoneCall(int i) {
        Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "onPhoneCall state:%d", Integer.valueOf(i));
        synchronized (this.f57905a.f57891x) {
            Iterator<C20574l> it = this.f57905a.f57891x.iterator();
            while (it.hasNext()) {
                it.next().onPhoneCall(i);
            }
        }
    }
}
