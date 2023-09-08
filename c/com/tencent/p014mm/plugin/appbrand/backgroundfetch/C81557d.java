package com.tencent.p014mm.plugin.appbrand.backgroundfetch;

import android.text.TextUtils;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.ipc.C81964j;
import com.tencent.p014mm.plugin.appbrand.launching.AppLaunchPrepareProcess;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C31543z5;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ob0.C47350c;
import pe3.C47465a;
import te3.C51798w8;
import te3.C64524lg3;
import te3.C64767v8;
import te3.r55;
import te3.s55;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.d */
public class C81557d {

    /* renamed from: a */
    public static long f239184a;

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.d$a */
    public class C81558a implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C81563y f239185a;

        /* renamed from: b */
        public final /* synthetic */ r55 f239186b;

        /* renamed from: c */
        public final /* synthetic */ int f239187c;

        public C81558a(C81563y yVar, r55 r55, int i) {
            this.f239185a = yVar;
            this.f239186b = r55;
            this.f239187c = i;
        }

        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            C47465a aVar;
            C64767v8 v8Var;
            String str2;
            AppLaunchPrepareProcess j;
            C47350c cVar2 = cVar;
            if (i != 0 || i2 != 0 || cVar2 == null || (aVar = cVar2.f127056b.f127083a) == null || !(aVar instanceof s55)) {
                Log.m105920e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "batchFetchDataInternal, batch fetch data fail:request fail");
                C81563y yVar = this.f239185a;
                int i3 = this.f239187c;
                ((C81562p) yVar).getClass();
                Log.m105921e("MicroMsg.AppBrand.DefaultBackgroundFetchDataCallback", "cgi fail, type(%d)", Integer.valueOf(i3));
                return;
            }
            s55 s55 = (s55) aVar;
            LinkedList<C51798w8> linkedList = s55.f141339d;
            if (linkedList == null || linkedList.isEmpty()) {
                Log.m105920e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "batchFetchDataInternal, batch fetch data fail:data is null");
                C81563y yVar2 = this.f239185a;
                int i4 = this.f239187c;
                ((C81562p) yVar2).getClass();
                Log.m105921e("MicroMsg.AppBrand.DefaultBackgroundFetchDataCallback", "cgi fail, type(%d)", Integer.valueOf(i4));
                return;
            }
            Log.m105924i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "batchFetchDataInternal, batch fetch data success");
            C81563y yVar3 = this.f239185a;
            LinkedList<C51798w8> linkedList2 = s55.f141339d;
            LinkedList<C64767v8> linkedList3 = this.f239186b.f140716d;
            C81562p pVar = (C81562p) yVar3;
            pVar.getClass();
            if (linkedList2 != null && !linkedList2.isEmpty()) {
                for (C51798w8 next : linkedList2) {
                    String str3 = null;
                    if (next != null && !Util.isNullOrNil(next.f143919d) && linkedList3 != null && !linkedList3.isEmpty()) {
                        Iterator<C64767v8> it = linkedList3.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            v8Var = it.next();
                            if (next.f143919d.equalsIgnoreCase(v8Var.f185847d)) {
                                break;
                            }
                        }
                    }
                    v8Var = null;
                    if (next.f143921f != 0 || v8Var == null) {
                        Log.m105929w("MicroMsg.AppBrand.DefaultBackgroundFetchDataCallback", "cgi success, but app(%s) failed to fetch data", next.f143919d);
                    } else if (Util.isNullOrNil(next.f143919d) || Util.isNullOrNil(next.f143920e)) {
                        Log.m105928w("MicroMsg.AppBrand.DefaultBackgroundFetchDataCallback", "handleBackgroundFetchData fail, no username or data in response");
                    } else {
                        long c = C31543z5.m39453c();
                        String str4 = next.f143919d;
                        String str5 = next.f143920e;
                        int i5 = v8Var.f185848e;
                        C64524lg3 lg32 = v8Var.f185849f;
                        String str6 = lg32 != null ? lg32.f184103d : null;
                        if (lg32 != null) {
                            str3 = lg32.f184104e;
                        }
                        int i6 = lg32 != null ? lg32.f184105f : 1000;
                        String str7 = str6;
                        int i7 = i5;
                        long j2 = c;
                        if (!((C29444w) C86312j.m106911c(C29444w.class)).mo56668OF(str4, i5, str5, str7, str3, i6, j2)) {
                            Log.m105920e("MicroMsg.AppBrand.DefaultBackgroundFetchDataCallback", "handleBackgroundFetchData fail, save data fail");
                        } else if (!Util.isNullOrNil(v8Var.f185851h)) {
                            AppBrandBackgroundFetchDataParcel appBrandBackgroundFetchDataParcel = new AppBrandBackgroundFetchDataParcel();
                            appBrandBackgroundFetchDataParcel.f80216d = str4;
                            appBrandBackgroundFetchDataParcel.f80217e = i7;
                            appBrandBackgroundFetchDataParcel.f80220h = str5;
                            appBrandBackgroundFetchDataParcel.f80218f = str7;
                            appBrandBackgroundFetchDataParcel.f80219g = str3;
                            appBrandBackgroundFetchDataParcel.f80221i = i6;
                            appBrandBackgroundFetchDataParcel.f80222j = j2;
                            Log.m105925i("MicroMsg.AppBrand.DefaultBackgroundFetchDataCallback", "handleBackgroundFetchData success, send data event to app(%s), appId:%s", v8Var.f185847d, v8Var.f185851h);
                            if (!TextUtils.isEmpty(pVar.f239190a) && (j = AppLaunchPrepareProcess.m102198j(str2)) != null) {
                                j.f243243Q0 = appBrandBackgroundFetchDataParcel;
                                Log.m105925i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "stashBackFetchDataResponseForInstanceId, instanceId:%s, appId:%s, updateTime:%d", (str2 = pVar.f239190a), j.f243263p, Long.valueOf(appBrandBackgroundFetchDataParcel.f80222j));
                            }
                            C81964j.m100679b(v8Var.f185851h, appBrandBackgroundFetchDataParcel);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m100043a(Map map, C81563y yVar) {
        Class cls = C29445x.class;
        if (map == null || map.isEmpty() || yVar == null) {
            Log.m105924i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "periodFetchDataInternal, no starAppMap or no callback");
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (Map.Entry entry : map.entrySet()) {
            C64767v8 v8Var = new C64767v8();
            v8Var.f185847d = (String) entry.getKey();
            v8Var.f185851h = (String) entry.getValue();
            v8Var.f185848e = 1;
            if (C86312j.m106911c(cls) != null) {
                AppBrandBackgroundFetchDataTokenParcel appBrandBackgroundFetchDataTokenParcel = ((C29445x) C86312j.m106911c(cls)).get(v8Var.f185847d);
                if (appBrandBackgroundFetchDataTokenParcel == null || Util.isNullOrNil(appBrandBackgroundFetchDataTokenParcel.f80235e)) {
                    Log.m105929w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "periodFetchDataInternal, app(%s) token is empty", v8Var.f185847d);
                } else {
                    Log.m105919d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "periodFetchDataInternal, app(%s) token:%s", v8Var.f185847d, appBrandBackgroundFetchDataTokenParcel.f80235e);
                    v8Var.f185850g = appBrandBackgroundFetchDataTokenParcel.f80235e;
                }
            }
            linkedList.add(v8Var);
        }
        m100044b(1, linkedList, yVar);
    }

    /* renamed from: b */
    public static void m100044b(int i, List<C64767v8> list, C81563y yVar) {
        if (list == null || list.isEmpty() || yVar == null) {
            Log.m105924i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "batchFetchDataInternal, requestList or callback is null");
            return;
        }
        Log.m105925i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "batchFetchDataInternal, size:%d", Integer.valueOf(list.size()));
        r55 r55 = new r55();
        r55.f140716d.addAll(list);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 1733;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/fetchdata";
        bVar.f127066a = r55;
        bVar.f127067b = new s55();
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C81558a(yVar, r55, i));
    }
}
