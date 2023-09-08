package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WCWebUpdater;
import java.util.Iterator;
import java.util.LinkedList;
import md2.C47000b;
import ob0.C47350c;
import sf0.C48374j0;
import te3.C50513n92;
import te3.C50565nm3;
import te3.C50651o92;
import te3.C51163rv3;
import te3.C51907x1;
import te3.k85;

/* renamed from: com.tencent.mm.pluginsdk.model.app.i1 */
public class C44560i1 extends C44549d1 {

    /* renamed from: e */
    public LinkedList<C44561j> f120840e;

    /* renamed from: f */
    public LinkedList<C44561j> f120841f;

    /* renamed from: g */
    public LinkedList<String> f120842g;

    /* renamed from: h */
    public int f120843h;

    public C44560i1(int i, int i2, int i3, String str, LinkedList<String> linkedList) {
        Log.m105924i("MicroMsg.NetSceneGetSuggestionAppList", "offset: " + i2 + ", limit = " + i3 + ", lang = " + str + "installedApp list size: " + linkedList.size());
        Iterator<String> it = linkedList.iterator();
        while (it.hasNext()) {
            Log.m105925i("MicroMsg.NetSceneGetSuggestionAppList", "install id:[%s]", it.next());
        }
        this.f120843h = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50513n92();
        bVar.f127067b = new C50651o92();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getsuggestionapplist";
        bVar.f127069d = 409;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f120809d = a;
        C50513n92 n922 = (C50513n92) a.f127055a.f127080a;
        n922.f138496d = i;
        n922.f138497e = i2;
        n922.f138498f = i3;
        n922.f138499g = str;
        LinkedList<C51163rv3> linkedList2 = new LinkedList<>();
        Iterator<String> it4 = linkedList.iterator();
        while (it4.hasNext()) {
            String next = it4.next();
            if (!Util.isNullOrNil(next)) {
                linkedList2.add(C48374j0.m53720i(next));
            }
        }
        n922.f138500h = linkedList2.size();
        n922.f138501i = linkedList2;
        this.f120840e = new LinkedList<>();
        this.f120841f = new LinkedList<>();
        LinkedList<String> linkedList3 = new LinkedList<>();
        this.f120842g = linkedList3;
        linkedList3.addAll(linkedList);
    }

    /* renamed from: a */
    public void mo69337a(byte[] bArr) {
        if (bArr == null) {
            Log.m105920e("MicroMsg.NetSceneGetSuggestionAppList", "buf is null");
            return;
        }
        try {
            this.f120809d.f127056b.fromProtoBuf(bArr);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.NetSceneGetSuggestionAppList", e.getMessage());
            Log.printErrStackTrace("MicroMsg.NetSceneGetSuggestionAppList", e, "", new Object[0]);
        }
    }

    /* renamed from: b */
    public int mo69338b() {
        return 4;
    }

    /* renamed from: c */
    public byte[] mo69339c() {
        try {
            return ((C47350c.C47353c) this.f120809d.getReqObj()).toProtoBuf();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.NetSceneGetSuggestionAppList", e.getMessage());
            Log.printErrStackTrace("MicroMsg.NetSceneGetSuggestionAppList", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: d */
    public final void mo69354d(C44561j jVar, C51907x1 x1Var) {
        jVar.mo73948q2(x1Var.f144387f);
        jVar.mo73947p2(x1Var.f144388g);
        jVar.f149244L = x1Var.f144391j;
        jVar.f149233A = true;
        jVar.field_appName = x1Var.f144389h;
        jVar.field_appIconUrl = x1Var.f144390i;
        jVar.mo73949r2(x1Var.f144393o);
        jVar.f149259Z = x1Var.f144395q;
        jVar.f149233A = true;
        mo69356f(jVar, x1Var.f144394p);
    }

    /* renamed from: e */
    public final void mo69355e(C44561j jVar, C50565nm3 nm32) {
        jVar.mo73948q2(nm32.f138671h);
        jVar.field_appIconUrl = nm32.f138669f;
        jVar.f149240H = nm32.f138673j;
        jVar.field_appName = nm32.f138668e;
        jVar.f149244L = nm32.f138676p;
        jVar.f149233A = true;
        jVar.field_appType = nm32.f138680t;
        jVar.mo73947p2(nm32.f138681u);
        jVar.field_packageName = nm32.f138682v;
        jVar.mo73949r2(nm32.f138685y);
        if (!Util.isNullOrNil(nm32.f138685y)) {
            Log.m105925i("MicroMsg.NetSceneGetSuggestionAppList", "google play download url is : %s, download flag is %d", nm32.f138685y, Integer.valueOf(nm32.f138665D));
            jVar.mo73946o2(nm32.f138665D);
        }
        jVar.f149248Q = nm32.f138686z;
        jVar.f149250R = nm32.f138662A;
        jVar.f149233A = true;
        mo69356f(jVar, nm32.f138663B);
        if (Util.isNullOrNil(jVar.field_appType)) {
            return;
        }
        if (jVar.field_appType.startsWith("1") || jVar.field_appType.startsWith(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN)) {
            if (!jVar.field_appType.endsWith(",")) {
                jVar.field_appType += ",";
            }
            jVar.field_appType = "," + jVar.field_appType;
        }
    }

    /* renamed from: f */
    public final void mo69356f(C44561j jVar, k85 k85) {
        Log.m105927v("MicroMsg.NetSceneGetSuggestionAppList", "dealYYBDownloadInfos, appId = %s", jVar.field_appId);
        if (k85 != null) {
            jVar.mo73946o2(k85.f136616d);
            jVar.f149255V = k85.f136617e;
            jVar.f149256W = k85.f136618f;
            jVar.f149253T = k85.f136619g;
            jVar.f149254U = k85.f136620h;
            jVar.f149257X = k85.f136621i;
            jVar.f149258Y = k85.f136622j;
            jVar.f149233A = true;
            Log.m105925i("MicroMsg.NetSceneGetSuggestionAppList", "get yyb download infos:[%d],[%s],[%s],[%s],[%s],[%s],[%d]", Integer.valueOf(k85.f136616d), k85.f136617e, k85.f136618f, k85.f136619g, k85.f136620h, k85.f136621i, Integer.valueOf(k85.f136622j));
        }
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Log.m105924i("MicroMsg.NetSceneGetSuggestionAppList", "errType = " + i2 + ", errCode = " + i3);
        if (i2 == 0 && i3 == 0) {
            C50651o92 o922 = (C50651o92) this.f120809d.f127056b.f127083a;
            if (o922 == null) {
                Log.m105920e("MicroMsg.NetSceneGetSuggestionAppList", "resp == null");
                return;
            }
            Log.m105927v("MicroMsg.NetSceneGetSuggestionAppList", "suggestion app count = %s, appType = %s, ", Integer.valueOf(o922.f139046d), Integer.valueOf(this.f120843h));
            C44579p pVar = (C44579p) C47000b.C34548a.m40384a().mo72195FM();
            LinkedList<C50565nm3> linkedList = o922.f139047e;
            if (linkedList != null && linkedList.size() > 0) {
                Iterator<C50565nm3> it = linkedList.iterator();
                while (it.hasNext()) {
                    C50565nm3 next = it.next();
                    if (Util.isNullOrNil(next.f138667d)) {
                        Log.m105920e("MicroMsg.NetSceneGetSuggestionAppList", "error appinfo, the appid is null");
                    } else {
                        C44561j g = C44565l.m48987g(next.f138667d);
                        if (g != null) {
                            mo69355e(g, next);
                            if (this.f120843h == 3) {
                                g.field_status = 5;
                                if (Util.isNullOrNil(g.f149250R) || Util.isNullOrNil(g.f149248Q)) {
                                    Object[] objArr = new Object[2];
                                    objArr[0] = Boolean.valueOf(g.f149250R != null);
                                    objArr[1] = Boolean.valueOf(g.f149248Q != null);
                                    Log.m105921e("MicroMsg.NetSceneGetSuggestionAppList", "wrong suggestion params1, has IntroUrl %s, has IconUrl %s", objArr);
                                    z4 = false;
                                    z = false;
                                    Log.m105925i("MicroMsg.NetSceneGetSuggestionAppList", "update appinfo: AppID = %s, ret = %s, needAddToList = %s", next.f138667d, Boolean.valueOf(z4), Boolean.valueOf(z));
                                } else {
                                    z4 = pVar.update(g, new String[0]);
                                }
                            } else {
                                z4 = pVar.update(g, new String[0]);
                            }
                            z = true;
                            Log.m105925i("MicroMsg.NetSceneGetSuggestionAppList", "update appinfo: AppID = %s, ret = %s, needAddToList = %s", next.f138667d, Boolean.valueOf(z4), Boolean.valueOf(z));
                        } else {
                            g = new C44561j();
                            g.field_appId = next.f138667d;
                            mo69355e(g, next);
                            if (this.f120843h == 3) {
                                g.field_status = 5;
                                if (Util.isNullOrNil(g.f149250R) || Util.isNullOrNil(g.f149248Q)) {
                                    Object[] objArr2 = new Object[2];
                                    objArr2[0] = Boolean.valueOf(g.f149250R != null);
                                    objArr2[1] = Boolean.valueOf(g.f149248Q != null);
                                    Log.m105921e("MicroMsg.NetSceneGetSuggestionAppList", "wrong suggestion params2, has IntroUrl %s, has IconUrl %s", objArr2);
                                    z2 = false;
                                    z3 = false;
                                    Log.m105925i("MicroMsg.NetSceneGetSuggestionAppList", "insert appinfo: AppID = %s, ret = %s, needAddToList = %s", next.f138667d, Boolean.valueOf(z2), Boolean.valueOf(z));
                                } else {
                                    z2 = pVar.insert(g);
                                }
                            } else {
                                z2 = pVar.insert(g);
                            }
                            z3 = true;
                            Log.m105925i("MicroMsg.NetSceneGetSuggestionAppList", "insert appinfo: AppID = %s, ret = %s, needAddToList = %s", next.f138667d, Boolean.valueOf(z2), Boolean.valueOf(z));
                        }
                        if (z && !this.f120842g.contains(next.f138667d) && !this.f120840e.contains(g)) {
                            this.f120840e.add(g);
                        }
                    }
                }
            }
            LinkedList<C51907x1> linkedList2 = o922.f139050h;
            if (linkedList2 != null && linkedList2.size() > 0) {
                Iterator<C51907x1> it4 = linkedList2.iterator();
                while (it4.hasNext()) {
                    C51907x1 next2 = it4.next();
                    C44561j g2 = C44565l.m48987g(next2.f144385d);
                    if (g2 != null) {
                        mo69354d(g2, next2);
                        pVar.update(g2, new String[0]);
                    } else {
                        g2 = new C44561j();
                        g2.field_appId = next2.f144385d;
                        mo69354d(g2, next2);
                        pVar.insert(g2);
                    }
                    this.f120841f.add(g2);
                }
                return;
            }
            return;
        }
        Log.m105920e("MicroMsg.NetSceneGetSuggestionAppList", "errType = " + i2 + ", errCode = " + i3);
    }
}
