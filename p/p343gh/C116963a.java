package p343gh;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import p213oh.C11412b;
import p335eh.C116768d;
import p339fh.C116869j;

/* renamed from: gh.a */
public class C116963a implements C20835e {

    /* renamed from: a */
    public String f350530a;

    /* renamed from: b */
    public String f350531b;

    public C116963a(String str, String str2) {
        this.f350530a = str;
        this.f350531b = str2;
    }

    /* renamed from: a */
    public void mo32433a() {
        ArrayList arrayList;
        int c;
        Object[] objArr = {this.f350530a};
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioPcmDataTrackCacheToFileTask", "runTask, appId:%s", objArr);
        if (TextUtils.isEmpty(this.f350531b)) {
            Log.m105925i("MicroMsg.Mix.AudioPcmDataTrackCacheToFileTask", "cache to file task", (Object[]) null);
            C116869j a = C116869j.m164845a();
            synchronized (a.f350296c) {
                arrayList = new ArrayList();
                arrayList.addAll(a.f350294a);
            }
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                String str = "";
                int i2 = 0;
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    C116768d b = C116869j.m164845a().mo180853b(str2);
                    if ((!b.f350073b || !b.f350080i) && (c = C116869j.m164845a().mo180854c(str2)) >= i2) {
                        str = str2;
                        i2 = c;
                    }
                }
                C116768d b2 = C116869j.m164845a().mo180853b(str);
                if (b2.f350073b && !b2.f350080i) {
                    b2.mo180744j(this.f350530a);
                }
                Object[] objArr2 = {str, Integer.valueOf(i2)};
                int i3 = C11412b.f33577a;
                Log.m105925i("MicroMsg.Mix.AudioPcmDataTrackCacheToFileTask", "cache to file path :%s, size:%d", objArr2);
                return;
            }
            return;
        }
        Log.m105925i("MicroMsg.Mix.AudioPcmDataTrackCacheToFileTask", "cache to file path :%s, size:%d", this.f350531b, Integer.valueOf(C116869j.m164845a().mo180854c(this.f350531b)));
        C116768d b3 = C116869j.m164845a().mo180853b(this.f350531b);
        if (b3.f350073b && !b3.f350080i) {
            b3.mo180744j(this.f350530a);
        }
    }

    /* renamed from: b */
    public void mo32434b() {
    }
}
