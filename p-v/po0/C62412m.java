package po0;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: po0.m */
public final class C62412m extends ContentObserver {

    /* renamed from: a */
    public final AudioManager f177379a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62412m(Context context, Handler handler) {
        super(handler);
        C87412m.m108594g(context, "context");
        Object systemService = context.getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f177379a = (AudioManager) systemService;
    }

    public boolean deliverSelfNotifications() {
        return false;
    }

    public void onChange(boolean z) {
        int streamVolume = this.f177379a.getStreamVolume(3);
        Log.m105924i("SettingsContentObserver", "Volume now " + streamVolume);
    }
}
