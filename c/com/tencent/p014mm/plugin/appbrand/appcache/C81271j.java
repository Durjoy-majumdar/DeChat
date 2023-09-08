package com.tencent.p014mm.plugin.appbrand.appcache;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import nr3.C89059e;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import p823sg.C77710q;
import te3.C49335eu3;
import te3.C64294cr2;
import te3.C64310db;
import te3.C90404cb;
import te3.C90413gz1;
import te3.C90422jy;
import wi0.C38163u;
import za0.C91626a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.j */
public class C81271j extends C89132b<C64310db> {
    public C81271j(C90404cb cbVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 1713;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaapp/batchgetwxadownloadurl";
        bVar.f127066a = cbVar;
        bVar.f127067b = new C64310db();
        C90422jy jyVar = cbVar.f259443f;
        if (jyVar == null || jyVar.f259639d == 0) {
            Iterator<C90413gz1> it = cbVar.f259441d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Integer num = C38163u.f100830d.get(it.next().f259532d.f259653d);
                if (num != null && num.intValue() > 0) {
                    if (cbVar.f259443f == null) {
                        C90422jy jyVar2 = new C90422jy();
                        cbVar.f259443f = jyVar2;
                        jyVar2.f259640e = false;
                        jyVar2.f259641f = 1;
                    }
                    cbVar.f259443f.f259639d = num.intValue();
                }
            }
        }
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C64310db dbVar;
        C64310db dbVar2 = (C64310db) eu32;
        if (dbVar2 != null) {
            dbVar = new C64310db();
            dbVar.setBaseResponse(dbVar2.getBaseResponse());
            if (dbVar2.f182660d != null) {
                dbVar.f182660d = new LinkedList<>(dbVar2.f182660d);
            }
        } else {
            dbVar = null;
        }
        ((C119157j) C119157j.f356862d).mo183884o(new j$$a(i, i2, dbVar));
    }

    /* renamed from: i */
    public final C89059e<C89132b.C89134c<C64310db>> mo9225i() {
        C89059e<C89132b.C89134c<C64310db>> i;
        C90404cb cbVar = (C90404cb) this.f256789f.f127055a.f127080a;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(cbVar.f259442e);
        C90422jy jyVar = cbVar.f259443f;
        Objects.requireNonNull(jyVar);
        objArr[1] = C91626a.m114981a(jyVar);
        LinkedList<C90413gz1> linkedList = cbVar.f259441d;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (C90413gz1 next : linkedList) {
            sb.append("{");
            if (!TextUtils.isEmpty(next.f259532d.f259653d)) {
                sb.append("appId:");
                sb.append(next.f259532d.f259653d);
            } else if (!TextUtils.isEmpty(next.f259532d.f259654e)) {
                sb.append("username:");
                sb.append(next.f259532d.f259654e);
            }
            sb.append(", module:");
            sb.append(next.f259532d.f259655f);
            sb.append(", package_type:");
            sb.append(next.f259532d.f259656g);
            sb.append(", version_type:");
            sb.append(next.f259532d.f259657h);
            if (C81289m.C81290a.m99663a(next.f259532d.f259657h) && next.f259538j != 0) {
                sb.append(", dev_uin:");
                sb.append(C77710q.m93738a(next.f259538j));
            }
            if (next.f259535g > 0) {
                sb.append(", version:");
                sb.append(next.f259535g);
            }
            C64294cr2 cr22 = next.f259533e;
            if (cr22 != null && cr22.f182558d > 0) {
                sb.append(", local_version:");
                sb.append(next.f259533e.f182558d);
            }
            if (next.f259537i) {
                sb.append(", need_zstd:true");
            }
            sb.append("},");
        }
        sb.append("]");
        objArr[2] = sb.toString();
        Log.m105925i("MicroMsg.AppBrand.CgiBatchGetPkgDownloadInfo", "run(), scene:%d, source:%s, req_list:%s", objArr);
        synchronized (this) {
            i = super.mo9225i();
        }
        return i;
    }
}
