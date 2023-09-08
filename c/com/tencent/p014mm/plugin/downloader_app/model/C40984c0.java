package com.tencent.p014mm.plugin.downloader_app.model;

import android.content.pm.PackageInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import js0.C9512b;
import u41.C52422b;
import u41.C52424d;
import u41.C52425e;
import u41.C52427g;
import v41.C52744c;
import v41.C52745d;
import v41.C52748g;
import v41.C52752k;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.c0 */
public class C40984c0 {

    /* renamed from: a */
    public C52422b f110320a;

    /* renamed from: b */
    public Map<String, C40990e0> f110321b = new HashMap();

    /* renamed from: c */
    public LinkedList<C40990e0> f110322c = new LinkedList<>();

    /* renamed from: d */
    public C52427g f110323d;

    public C40984c0(C52422b bVar) {
        if (bVar == null) {
            this.f110320a = new C52422b();
            return;
        }
        this.f110320a = bVar;
        mo64009a();
    }

    /* renamed from: a */
    public final void mo64009a() {
        C52422b bVar = this.f110320a;
        this.f110323d = bVar.f146507e;
        if (!Util.isNullOrNil((List) bVar.f146506d)) {
            Iterator<C52425e> it = this.f110320a.f146506d.iterator();
            while (it.hasNext()) {
                C52425e next = it.next();
                C52752k kVar = next.f146512d;
                C52748g gVar = kVar.f147402f;
                if (gVar == null || gVar.f147385d == null) {
                    Log.m105921e("MicroMsg.PBAppInfo", "download info is null, appid:%s", kVar.f147400d.f147368d);
                } else {
                    C40990e0 e0Var = new C40990e0();
                    C52752k kVar2 = next.f146512d;
                    C52745d dVar = kVar2.f147400d;
                    e0Var.f110335f = dVar.f147368d;
                    e0Var.f110336g = dVar.f147369e;
                    e0Var.f110337h = dVar.f147370f;
                    C52744c cVar = kVar2.f147402f.f147385d;
                    e0Var.f110338i = cVar.f147350e;
                    e0Var.f110342m = cVar;
                    e0Var.f110345p = dVar.f147372h;
                    C52424d dVar2 = next.f146514f;
                    String str = dVar2 != null ? dVar2.f146511d : "";
                    e0Var.f110339j = str;
                    Util.isNullOrNil(str);
                    C52752k kVar3 = next.f146512d;
                    e0Var.f110340k = kVar3.f147402f.f147385d.f147358p;
                    e0Var.f110344o = kVar3.f147404h;
                    String str2 = kVar3.f147400d.f147368d;
                    C29855f0.m38893d();
                    if (!C29855f0.f80901b.contains(str2)) {
                        e0Var.f110332c = 2;
                    } else {
                        PackageInfo a = C9512b.m9207a(MMApplicationContext.getContext(), next.f146512d.f147402f.f147385d.f147350e);
                        if (a == null || a.versionCode >= next.f146512d.f147402f.f147385d.f147354i) {
                            e0Var.f110332c = 6;
                        } else {
                            e0Var.f110332c = 4;
                        }
                    }
                    this.f110321b.put(e0Var.f110335f, e0Var);
                }
            }
        }
    }

    public C40984c0(byte[] bArr) {
        C52422b bVar = new C52422b();
        this.f110320a = bVar;
        if (bArr != null && bArr.length != 0) {
            try {
                bVar.parseFrom(bArr);
            } catch (IOException e) {
                Log.m105921e("MicroMsg.PBAppInfo", "Parsing Failed: %s", e.getMessage());
            }
            mo64009a();
        }
    }
}
