package xx1;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.p014mm.plugin.downloader.model.C40954w;
import com.tencent.p014mm.plugin.game.model.C42089r;
import com.tencent.p014mm.plugin.game.model.C42091s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import p237sp.C36768q;
import p237sp.C48456t;
import p237sp.C48457w;
import p749xh.C53352w2;
import u10.C52415a;
import zt3.C119157j;

/* renamed from: xx1.g */
public class C53466g implements C36768q.C36771c, C40954w {
    /* renamed from: B */
    public void mo1796B(long j, String str, long j2, long j3) {
        C42091s.m45784c().mo66047b(j, 6);
    }

    /* renamed from: D */
    public void mo1797D(long j) {
        C42091s c = C42091s.m45784c();
        c.mo66047b(j, 4);
        C53352w2 nh = ((C48456t) C86312j.m106911c(C48456t.class)).mo72824nh(j);
        if (nh != null) {
            Context context = MMApplicationContext.getContext();
            String str = nh.field_appId;
            SharedPreferences sharedPreferences = context.getSharedPreferences("game_center_pref", 0);
            String string = sharedPreferences.getString("download_app_id_time_map", "");
            if (!Util.isNullOrNil(string) && string.contains(str)) {
                String str2 = new String();
                String[] split = string.split(",");
                for (int i = 0; i < split.length; i++) {
                    String str3 = split[i];
                    if (!str3.contains(str)) {
                        if (i == split.length - 1) {
                            str2 = str2 + str3;
                        } else {
                            str2 = str2 + str3 + ",";
                        }
                    }
                }
                sharedPreferences.edit().putString("download_app_id_time_map", str2).apply();
            }
        }
        c.mo66051h(j);
    }

    /* renamed from: O */
    public void mo1798O(long j) {
        C42091s.m45784c().getClass();
    }

    /* renamed from: Q */
    public void mo1799Q(long j, String str) {
        C42091s.m45784c().mo66047b(j, 7);
    }

    /* renamed from: S */
    public void mo1800S(long j) {
        C42091s.m45784c().mo66047b(j, 2);
    }

    /* renamed from: d */
    public void mo1801d(long j, int i, boolean z) {
        C42091s.m45784c().mo66048d(j, i, z);
    }

    /* renamed from: f */
    public void mo5418f(int i, long j) {
        if (i == 9) {
            C42091s sVar = C42091s.f113396a;
            ((C119157j) C119157j.f356862d).mo183879j(new C42089r(j), 500, "onInstallFinish");
        }
    }

    /* renamed from: f0 */
    public void mo1802f0(long j, String str) {
        C42091s c = C42091s.m45784c();
        c.mo66047b(j, 1);
        c.mo66051h(j);
    }

    /* renamed from: q */
    public void mo1803q(long j, String str, boolean z) {
        C53352w2 nh;
        C42091s c = C42091s.m45784c();
        c.getClass();
        Class cls = C48456t.class;
        Log.m105925i("MicroMsg.GameDownloadEventBus", "onTaskFinished, path = %s, fileExists = %b", str, Boolean.valueOf(C86013q1.m106450k(str)));
        if (Util.isNullOrNil(str) || !C86013q1.m106450k(str)) {
            C53352w2 nh4 = ((C48456t) C86312j.m106911c(cls)).mo72824nh(j);
            if (nh4 != null) {
                nh4.field_status = 4;
                nh4.field_errCode = 805;
                ((C48456t) C86312j.m106911c(cls)).mo72823NW(nh4);
            }
            c.mo66048d(j, 805, z);
            if (nh4 != null) {
                ((C48457w) C86312j.m106911c(C48457w.class)).mo72827VV(nh4.field_appId, 9, 1);
                return;
            }
            return;
        }
        c.mo66047b(j, 3);
        if (z && (nh = ((C48456t) C86312j.m106911c(cls)).mo72824nh(j)) != null) {
            C52415a.m58668a().mo62981c(nh.field_appId, 5, 0, (String) null, (String) null);
        }
        c.mo66049f(j);
        c.mo66051h(j);
    }
}
