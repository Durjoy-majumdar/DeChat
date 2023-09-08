package uy1;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.game.model.LocalTabCornerSetting;
import com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameTabData2;
import com.tencent.p014mm.pluginsdk.model.app.C44557i;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44579p;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import md2.C47000b;
import p763ym.C53543s;
import p763ym.C79138l;

/* renamed from: uy1.e */
public class C52644e {
    /* renamed from: a */
    public static boolean m59020a(GameTabData2 gameTabData2) {
        if (gameTabData2 == null || Util.isNullOrNil((List) gameTabData2.mo66309a())) {
            return false;
        }
        Iterator it = ((ArrayList) gameTabData2.mo66309a()).iterator();
        loop0:
        while (it.hasNext()) {
            GameTabData2.TabItem tabItem = (GameTabData2.TabItem) it.next();
            if (!Util.isNullOrNil((List) tabItem.f114266A)) {
                for (LocalTabCornerSetting localTabCornerSetting : tabItem.f114266A) {
                    if (TextUtils.equals(localTabCornerSetting.f113214d, "chat")) {
                        break loop0;
                    }
                }
                continue;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static void m59021b(C44561j jVar) {
        boolean z;
        boolean z2;
        Class cls = C53543s.class;
        if (jVar == null) {
            Log.m105920e("MicroMsg.GameDataUtil", "Null appInfo");
        } else if (Util.isNullOrNil(jVar.field_appId)) {
            Log.m105920e("MicroMsg.GameDataUtil", "Invalid appId");
        } else {
            String str = jVar.field_appId;
            C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(str);
            if (appInfo == null) {
                appInfo = new C44561j();
                appInfo.field_appId = str;
                z = true;
            } else {
                z = false;
            }
            String applicationLanguage = LocaleUtil.getApplicationLanguage();
            if (applicationLanguage.equals("zh_CN")) {
                appInfo.field_appName = jVar.field_appName;
            } else if (applicationLanguage.equals("zh_TW") || applicationLanguage.equals("zh_HK")) {
                appInfo.field_appName_tw = jVar.field_appName;
            } else {
                appInfo.field_appName_en = jVar.field_appName;
            }
            appInfo.field_appType = jVar.field_appType;
            appInfo.field_packageName = jVar.field_packageName;
            appInfo.mo73948q2(jVar.f149241I);
            appInfo.mo73947p2(jVar.f149246N);
            appInfo.mo73946o2(jVar.f149252S);
            appInfo.mo73949r2(jVar.f149247P);
            appInfo.f149255V = jVar.f149255V;
            appInfo.f149256W = jVar.f149256W;
            appInfo.f149253T = jVar.f149253T;
            appInfo.f149254U = jVar.f149254U;
            appInfo.f149258Y = jVar.f149258Y;
            appInfo.f149233A = true;
            if (!Util.isNullOrNil(jVar.f149244L)) {
                appInfo.f149244L = jVar.f149244L;
                appInfo.f149233A = true;
            }
            if (z) {
                z2 = ((C44579p) ((C53543s) C86312j.m106911c(cls)).Gk0()).insert(appInfo);
                C47000b.C34548a.m40384a().mo72193D9(str);
            } else {
                int i = appInfo.field_appVersion;
                if (i < jVar.field_appVersion) {
                    Log.m105925i("MicroMsg.GameDataUtil", "oldVersion = %s, newVersion = %s", Integer.valueOf(i), Integer.valueOf(jVar.field_appVersion));
                    z2 = ((C44579p) ((C53543s) C86312j.m106911c(cls)).Gk0()).update(appInfo, new String[0]);
                    C47000b.C34548a.m40384a().mo72193D9(str);
                } else {
                    if (Util.isNullOrNil(appInfo.field_appIconUrl) ? true : Util.isNullOrNil(jVar.field_appIconUrl) ? false : !appInfo.field_appIconUrl.equals(jVar.field_appIconUrl)) {
                        Log.m105925i("MicroMsg.GameDataUtil", "oldIcon = %s, newIcon = %s", appInfo.field_appIconUrl, jVar.field_appIconUrl);
                        appInfo.field_appIconUrl = jVar.field_appIconUrl;
                        z2 = ((C44579p) ((C53543s) C86312j.m106911c(cls)).Gk0()).update(appInfo, new String[0]);
                        ((C44557i) ((C53543s) C86312j.m106911c(cls)).mo74026qc()).mo69352a(str, 1);
                        ((C44557i) ((C53543s) C86312j.m106911c(cls)).mo74026qc()).mo69352a(str, 2);
                        ((C44557i) ((C53543s) C86312j.m106911c(cls)).mo74026qc()).mo69352a(str, 3);
                        ((C44557i) ((C53543s) C86312j.m106911c(cls)).mo74026qc()).mo69352a(str, 4);
                        ((C44557i) ((C53543s) C86312j.m106911c(cls)).mo74026qc()).mo69352a(str, 5);
                    } else {
                        z2 = ((C44579p) ((C53543s) C86312j.m106911c(cls)).Gk0()).update(appInfo, new String[0]);
                    }
                }
            }
            Log.m105925i("MicroMsg.GameDataUtil", "Saving AppInfo, appId: %s, insert?: %s, return: %s", str, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    /* renamed from: c */
    public static void m59022c(LinkedList<? extends C44561j> linkedList) {
        if (linkedList == null) {
            Log.m105920e("MicroMsg.GameDataUtil", "Null appInfos");
            return;
        }
        Iterator<? extends C44561j> it = linkedList.iterator();
        while (it.hasNext()) {
            m59021b((C44561j) it.next());
        }
    }
}
