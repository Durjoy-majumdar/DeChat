package h43;

import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import l33.C109247e;
import rx3.C13598b0;
import v33.C111383b;

/* renamed from: h43.a */
public final class C108059a extends ContentObserver {

    /* renamed from: a */
    public final C32226l<Boolean, C13598b0> f323581a;

    public C108059a(C32226l<? super Boolean, C13598b0> lVar) {
        super((Handler) null);
        this.f323581a = lVar;
        boolean a = mo158461a();
        C111383b vx02 = C109247e.vx0();
        vx02.f333446f = a;
        vx02.f333447g.postValue(Boolean.valueOf(a));
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(a));
        }
    }

    /* renamed from: a */
    public final boolean mo158461a() {
        try {
            int i = Settings.System.getInt(MMApplicationContext.getContext().getContentResolver(), "accelerometer_rotation", 0);
            Log.m105924i("MicroMsg.VoIPRenderMgr", "accRotation=" + i);
            return i == 0;
        } catch (Exception unused) {
            return true;
        }
    }

    public void onChange(boolean z) {
        boolean a = mo158461a();
        C111383b vx02 = C109247e.vx0();
        boolean a2 = mo158461a();
        vx02.f333446f = a2;
        vx02.f333447g.postValue(Boolean.valueOf(a2));
        C32226l<Boolean, C13598b0> lVar = this.f323581a;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(a));
        }
        Log.m105924i("MicroMsg.AccelerometerRotationObserver", "systemRotateLocked now " + a);
    }
}
