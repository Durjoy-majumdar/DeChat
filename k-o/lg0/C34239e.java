package lg0;

import android.content.SharedPreferences;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: lg0.e */
public class C34239e extends IStaticListener<CheckResUpdateCacheFileEvent> {
    public boolean callback(IEvent iEvent) {
        CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 0);
        int i = sharedPreferences.getInt("new_launch_image_sub_type", 0);
        CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
        if (aVar.f78744a == 43 && i > 0 && i == aVar.f78745b) {
            String str = aVar.f78746c;
            C115669n.INSTANCE.idkeyStat(723, 6, 1, false);
            sharedPreferences.edit().putInt("new_launch_image_res_version", checkResUpdateCacheFileEvent.f78743d.f78747d).commit();
            Log.m105925i("MicroMsg.CheckResUpdateListener", "filePath: %s", str);
            C10501a.m10436d(str);
        }
        return false;
    }
}
