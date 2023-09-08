package n73;

import android.os.Looper;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.WearDownloadEmojiEvent;
import com.tencent.p014mm.autogen.events.WearHardDeviceEvent;
import com.tencent.p014mm.plugin.wear.model.C43457b;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import l73.C46836a;
import te3.t05;
import te3.u05;

/* renamed from: n73.j */
public class C47193j extends C47188b {

    /* renamed from: a */
    public t05 f126742a;

    /* renamed from: a */
    public List<Integer> mo11243a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(ErrorCode.ERROR_OUTOF_MEMORY));
        return arrayList;
    }

    /* renamed from: b */
    public byte[] mo11244b(int i, byte[] bArr) {
        if (i == 11002) {
            C46836a.m52129b(1, 0);
            C46836a.m52128a(0);
            WearDownloadEmojiEvent wearDownloadEmojiEvent = new WearDownloadEmojiEvent();
            wearDownloadEmojiEvent.f107823d.f107825b = MMApplicationContext.getContext().getResources().getStringArray(C0966R.array.f2578l);
            wearDownloadEmojiEvent.f107823d.f107824a = 1;
            wearDownloadEmojiEvent.publish();
            byte[] a = C43457b.xx0().mo176380a(bArr);
            if (a != null) {
                try {
                    t05 t05 = new t05();
                    t05.parseFrom(a);
                    u05 u05 = new u05();
                    int i2 = 20;
                    String str = null;
                    while (i2 > 0) {
                        str = C75592q0.m90789s();
                        if (Util.isNullOrNil(str)) {
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException unused) {
                            }
                            i2--;
                        }
                    }
                    if (Util.isNullOrNil(str)) {
                        return null;
                    }
                    u05.f142533d = str;
                    String loadApplicationLanguageSettings = LocaleUtil.loadApplicationLanguageSettings(MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), MMApplicationContext.getContext());
                    String applicationLanguage = LocaleUtil.getApplicationLanguage();
                    if (loadApplicationLanguageSettings.equals("language_default")) {
                        u05.f142534e = applicationLanguage;
                    } else {
                        u05.f142534e = loadApplicationLanguageSettings;
                    }
                    byte[] b = C43457b.xx0().mo176381b(u05.toByteArray());
                    if (b == null) {
                        return null;
                    }
                    this.f126742a = t05;
                    WearHardDeviceEvent wearHardDeviceEvent = new WearHardDeviceEvent();
                    wearHardDeviceEvent.f107826d.f107827a = 9;
                    wearHardDeviceEvent.asyncPublish(Looper.getMainLooper());
                    return b;
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.Wear.HttpLoginServer", e, "", new Object[0]);
                }
            }
        }
        return null;
    }
}
