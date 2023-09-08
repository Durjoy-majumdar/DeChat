package com.tencent.p014mm.pluginsdk.model.app;

import android.content.Context;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import md2.C47000b;
import te3.C49748hs2;

/* renamed from: com.tencent.mm.pluginsdk.model.app.a2 */
public class C44547a2 {

    /* renamed from: i */
    public static C44547a2 f120800i;

    /* renamed from: a */
    public boolean f120801a = false;

    /* renamed from: b */
    public boolean f120802b = false;

    /* renamed from: c */
    public String f120803c;

    /* renamed from: d */
    public List<String> f120804d = new LinkedList();

    /* renamed from: e */
    public long f120805e;

    /* renamed from: f */
    public int f120806f = 0;

    /* renamed from: g */
    public boolean f120807g = false;

    /* renamed from: h */
    public long f120808h;

    /* renamed from: c */
    public static C44547a2 m48943c() {
        if (f120800i == null) {
            f120800i = new C44547a2();
        }
        return f120800i;
    }

    /* renamed from: a */
    public final void mo69332a(C44561j jVar, C49748hs2 hs22) {
        jVar.field_appName = hs22.f134850i;
        jVar.field_appName_en = hs22.f134846e;
        jVar.field_appName_tw = hs22.f134847f;
        jVar.field_appName_hk = hs22.f134859u;
        jVar.f149279x0 = hs22.f134848g;
        jVar.f149281y0 = hs22.f134849h;
        jVar.f149249Q0 = hs22.f134853o;
        jVar.field_serviceAppInfoFlag = hs22.f134852n;
        jVar.field_serviceAppType = hs22.f134851j;
        jVar.f149251R0 = hs22.f134854p;
        jVar.f149233A = true;
        jVar.field_serviceShowFlag = hs22.f134855q;
    }

    /* renamed from: b */
    public final void mo69333b(String str, int i) {
        Log.m105925i("MicroMsg.SuggestionAppListLogic", "get service app, offset = %d, lang = %s", Integer.valueOf(i), str);
        C30661h1 h1Var = new C30661h1(i, 20, str);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(h1Var);
    }

    /* renamed from: d */
    public void mo69334d(Context context) {
        if (!C86709a0.m107522a() || context == null) {
            return;
        }
        if (this.f120802b) {
            Log.m105918d("MicroMsg.SuggestionAppListLogic", "ServiceAppInfo is loading, return");
            return;
        }
        this.f120802b = true;
        if (System.currentTimeMillis() - this.f120808h < 43200000) {
            Log.m105918d("MicroMsg.SuggestionAppListLogic", "getServiceAppInfo not now");
            this.f120802b = false;
            return;
        }
        C86709a0.m107528h();
        this.f120808h = C86709a0.m107535s().mo121142i().mo119672F(352276, 0);
        if (System.currentTimeMillis() - this.f120808h < 43200000) {
            Log.m105918d("MicroMsg.SuggestionAppListLogic", "getServiceAppInfo not now pp");
            this.f120802b = false;
            return;
        }
        if (this.f120803c == null) {
            this.f120803c = LocaleUtil.loadApplicationLanguage(context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), context);
        }
        mo69333b(this.f120803c, this.f120806f);
    }

    /* renamed from: e */
    public void mo69335e(Context context) {
        if (!C86709a0.m107522a() || context == null) {
            return;
        }
        if (this.f120802b) {
            Log.m105918d("MicroMsg.SuggestionAppListLogic", "ServiceAppInfo is loading, return");
            return;
        }
        this.f120802b = true;
        if (this.f120803c == null) {
            this.f120803c = LocaleUtil.loadApplicationLanguage(context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), context);
        }
        Log.m105924i("MicroMsg.SuggestionAppListLogic", "getServiceAppListImmediately");
        mo69333b(this.f120803c, this.f120806f);
    }

    /* renamed from: f */
    public final void mo69336f(C44579p pVar, List<String> list) {
        boolean z;
        if (pVar != null && list != null && list.size() > 0) {
            Log.m105918d("MicroMsg.SuggestionAppListLogic", "removeExpiredServiceApp");
            ArrayList arrayList = new ArrayList();
            if (C47000b.C34548a.m40384a() == null) {
                Log.m105920e("MicroMsg.AppInfoLogic", "getAllServices, getISubCorePluginBase() == null");
            } else {
                Cursor zl = C47000b.C34548a.m40384a().mo72207zl();
                if (zl != null) {
                    while (zl.moveToNext()) {
                        C44561j jVar = new C44561j();
                        jVar.convertFrom(zl);
                        if (!Util.isNullOrNil(jVar.field_openId)) {
                            arrayList.add(jVar);
                        }
                    }
                    zl.close();
                }
            }
            Log.m105925i("MicroMsg.SuggestionAppListLogic", "oldList %d", Integer.valueOf(arrayList.size()));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C44561j jVar2 = (C44561j) it.next();
                    if (jVar2.field_appId != null) {
                        Iterator<String> it4 = list.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                z = false;
                                break;
                            }
                            if (jVar2.field_appId.equals(it4.next())) {
                                z = true;
                                break;
                            }
                        }
                        if (!z) {
                            Log.m105925i("MicroMsg.SuggestionAppListLogic", "delete old service : %s, %s", jVar2.field_appId, Boolean.valueOf(pVar.delete(jVar2, new String[0])));
                        }
                    }
                }
            }
        }
    }
}
