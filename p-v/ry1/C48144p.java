package ry1;

import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.p014mm.plugin.game.model.C42046d;
import com.tencent.p014mm.plugin.game.model.C42070k0;
import com.tencent.p014mm.plugin.game.model.C42094s0;
import com.tencent.p014mm.plugin.game.p061ui.GameCenterUI5;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import java.util.LinkedList;
import p237sp.C13754y;
import p763ym.C79138l;
import sw1.C48483p;
import sw1.C48484q;
import uy1.C52638a;
import uy1.C52642c;

/* renamed from: ry1.p */
public class C48144p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GameCenterUI5 f129069d;

    /* renamed from: ry1.p$a */
    public class C48145a implements Runnable {
        public C48145a() {
        }

        public void run() {
            if (!C48144p.this.f129069d.isFinishing()) {
                GameCenterUI5 gameCenterUI5 = C48144p.this.f129069d;
                gameCenterUI5.f113713z = C52642c.m58986d(gameCenterUI5);
                C48144p.this.f129069d.f113713z.show();
            }
        }
    }

    /* renamed from: ry1.p$b */
    public class C48146b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C42070k0 f129071d;

        public C48146b(C42070k0 k0Var) {
            this.f129071d = k0Var;
        }

        public void run() {
            GameCenterUI5.m45861N7(C48144p.this.f129069d, this.f129071d, 1);
        }
    }

    public C48144p(GameCenterUI5 gameCenterUI5) {
        this.f129069d = gameCenterUI5;
    }

    public void run() {
        AppCompatActivity appCompatActivity;
        byte[] Rz = ((C48484q) C86312j.m106911c(C48484q.class)).mo66106SL().mo57116Rz("pb_index_4");
        char c = 0;
        if (Rz == null) {
            MMHandlerThread.postToMainThread(new C48145a());
        } else {
            MMHandlerThread.postToMainThread(new C48146b(new C42070k0(Rz, false)));
        }
        ((C48483p) C86312j.m106911c(C48483p.class)).xg0().mo65971b(this.f129069d);
        C52642c.m58988f(C42046d.m45746e(this.f129069d));
        String applicationLanguage = LocaleUtil.getApplicationLanguage();
        LinkedList<String> e = C42046d.m45746e(this.f129069d);
        GameCenterUI5 gameCenterUI5 = this.f129069d;
        C86709a0.m107524d().mo123460f(new C42094s0(applicationLanguage, e, gameCenterUI5.f113686j, gameCenterUI5.f113687n, gameCenterUI5.f113688o, gameCenterUI5.f113684h));
        AppCompatActivity context = this.f129069d.getContext();
        Class cls = C13754y.class;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences sharedPreferences = context.getSharedPreferences("game_center_pref", 0);
        String string = sharedPreferences.getString("download_app_id_time_map", "");
        if (!Util.isNullOrNil(string)) {
            String[] split = string.split(",");
            String str = new String();
            int length = split.length;
            int i = 0;
            while (i < length) {
                String str2 = split[i];
                String[] split2 = str2.split("-");
                String str3 = split2[c];
                if (Util.isNullOrNil(str3) || ((C79138l) C86312j.m106911c(C79138l.class)).Tb0(context, str3)) {
                    appCompatActivity = context;
                } else {
                    appCompatActivity = context;
                    if (currentTimeMillis - Util.getLong(split2[1], 0) < 86400) {
                        str = str + str2 + ",";
                    } else {
                        FileDownloadTaskInfo o = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63967o(str3);
                        Log.m105925i("MicroMsg.GameCenterLogic", "checkGameDownloadTime, status = %d, id = %d", Integer.valueOf(o.f12196f), Long.valueOf(o.f12194d));
                        int i2 = o.f12196f;
                        if (i2 == 2) {
                            ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63970r(o.f12194d);
                        } else if ((i2 == 0 || i2 == 4) && C86013q1.m106450k(o.f12197g)) {
                            C86013q1.m106447h(o.f12197g);
                        }
                    }
                }
                i++;
                context = appCompatActivity;
                c = 0;
            }
            if (!Util.isNullOrNil(str)) {
                if (str.charAt(str.length() - 1) == ',') {
                    str = str.substring(0, str.length() - 1);
                }
                sharedPreferences.edit().putString("download_app_id_time_map", str.toString()).apply();
            }
        }
        C42046d.m45754m();
        C52638a.C52640b.f146975a.mo73590c();
    }
}
