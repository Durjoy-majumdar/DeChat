package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ld2.C46848g;
import ob0.C47350c;
import ob0.C89132b;
import ob0.C89147n0;
import p763ym.C53542o;
import sf0.C48374j0;
import te3.C50081k5;
import te3.C50216l5;
import te3.C51018qv3;
import zt3.C119157j;

/* renamed from: com.tencent.mm.pluginsdk.model.app.e0 */
public class C44550e0 implements C44583u0, C53542o {

    /* renamed from: d */
    public CopyOnWriteArrayList<String> f120810d = new CopyOnWriteArrayList<>();

    /* renamed from: e */
    public List<String> f120811e = new ArrayList();

    /* renamed from: f */
    public volatile boolean f120812f = false;

    public C44550e0() {
        C44552f yx02 = C46848g.yx0();
        yx02.getClass();
        MMHandlerThread.postToMainThread(new C44554g(yx02, 1, this));
    }

    /* renamed from: a */
    public void mo69340a(String str) {
        Log.m105918d("MicroMsg.AppSettingService", "appId = " + str);
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.AppSettingService", "add appId is null");
            return;
        }
        if (!this.f120810d.contains(str)) {
            this.f120810d.add(str);
        }
        ((C119157j) C119157j.f356862d).mo183895z(new e0$$b(this));
    }

    /* renamed from: b */
    public void mo69341b(List<String> list) {
        if (list == null || list.size() == 0) {
            Log.m105920e("MicroMsg.AppSettingService", "addAll list is null");
            return;
        }
        for (String next : list) {
            if (!Util.isNullOrNil(next) && !this.f120810d.contains(next)) {
                this.f120810d.add(next);
            }
        }
        ((C119157j) C119157j.f356862d).mo183895z(new e0$$a(this));
    }

    /* renamed from: c */
    public String mo69342c(String str) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.AppSettingService", "getOpenIdSync, appId is null");
            return null;
        }
        C44561j j = C44565l.m48990j(str, false);
        if (j == null) {
            return null;
        }
        String str2 = j.field_openId;
        if (str2 != null && str2.length() != 0) {
            return j.field_openId;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        C44555g1 g1Var = new C44555g1(linkedList);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50081k5();
        bVar.f127067b = new C50216l5();
        bVar.f127068c = "/cgi-bin/micromsg-bin/appcenter";
        bVar.f127069d = 452;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        C50081k5 k5Var = (C50081k5) a.f127055a.f127080a;
        byte[] c = g1Var.mo69339c();
        if (c != null) {
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(c);
            k5Var.f136558e = qv32;
        }
        k5Var.f136557d = 1;
        C89132b.C89134c b = C89147n0.m111435b(a, 20000);
        Log.m105925i("MicroMsg.AppSettingService", "call getOpenIdSync cgi result, errType = %d, errCode = %d", Integer.valueOf(b.f256793a), Integer.valueOf(b.f256794b));
        if (b.f256793a == 0 && b.f256794b == 0) {
            g1Var.mo69337a(C48374j0.m53715d(((C50216l5) b.f256796d).f137180d));
            g1Var.onGYNetEnd(0, b.f256793a, b.f256794b, b.f256795c, a, new byte[0]);
            C44561j i = C44565l.m48989i(str, false, false);
            if (i != null) {
                return i.field_openId;
            }
        }
        return null;
    }

    /* renamed from: c3 */
    public void mo69343c3(int i, int i2, String str, C44549d1 d1Var) {
        if (d1Var.mo69338b() == 1) {
            this.f120812f = false;
            List<String> list = ((C44555g1) d1Var).f120831e;
            Log.m105918d("MicroMsg.AppSettingService", "onSceneEnd, list size = " + list.size());
            this.f120810d.removeAll(this.f120811e);
            ((ArrayList) this.f120811e).clear();
            mo69344d();
        }
    }

    /* renamed from: d */
    public final void mo69344d() {
        if (this.f120812f) {
            Log.m105918d("MicroMsg.AppSettingService", "tryDoScene fail, doing Scene");
        } else if (this.f120810d.size() <= 0) {
            Log.m105918d("MicroMsg.AppSettingService", "tryDoScene fail, appIdList is empty");
        } else {
            Log.m105918d("MicroMsg.AppSettingService", "tryDoScene, appid list size = " + this.f120810d.size());
            int size = this.f120810d.size();
            if (size > 20) {
                size = 20;
            }
            this.f120812f = true;
            ((ArrayList) this.f120811e).addAll(this.f120810d.subList(0, size));
            C86709a0.m107529k().f251779b.mo123460f(new C44551e1(1, new C44555g1(this.f120811e)));
        }
    }
}
