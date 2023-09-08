package com.tencent.p014mm.plugin.appbrand.jsapi.msgsubscription;

import be0.C16783a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import lp3.C88631d;
import p224ra.C89909e;
import sd0.C22357b;
import te3.C49335eu3;
import zp0.C16377l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.a */
public final class C17912a implements C16783a.C16784a {

    /* renamed from: a */
    public static final C17912a f49411a = new C17912a();

    /* renamed from: b */
    public static final ConcurrentHashMap<String, String> f49412b = new ConcurrentHashMap<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.a$a */
    public static final class C17913a<T> implements C88631d.C88632b {

        /* renamed from: a */
        public final /* synthetic */ C16783a.C16786c f49413a;

        /* renamed from: b */
        public final /* synthetic */ C16783a.C16785b f49414b;

        /* renamed from: c */
        public final /* synthetic */ C16783a f49415c;

        public C17913a(C16783a.C16786c cVar, C16783a.C16785b bVar, C16783a aVar) {
            this.f49413a = cVar;
            this.f49414b = bVar;
            this.f49415c = aVar;
        }

        /* renamed from: a */
        public void mo1772a(Object obj) {
            C49335eu3 eu32 = (C49335eu3) obj;
            if (eu32 != null) {
                try {
                    this.f49413a.mo17814a().parseFrom(eu32.toByteArray());
                    C16783a.C16785b bVar = this.f49414b;
                    if (bVar != null) {
                        bVar.mo17813a(0, 0, (String) null, this.f49415c);
                    }
                } catch (IOException e) {
                    Log.m105920e("Luggage.WXA.FULL.CompatNetSceneDispatcherDefaultAdapter", "onTerminate uri=" + this.f49413a.getUri() + ", parse responseProtoBuf get e=" + e);
                    C16783a.C16785b bVar2 = this.f49414b;
                    if (bVar2 != null) {
                        bVar2.mo17813a(5, 0, (String) null, this.f49415c);
                    }
                }
            } else {
                Log.m105920e("Luggage.WXA.FULL.CompatNetSceneDispatcherDefaultAdapter", "onTerminate null response, uri=" + this.f49413a.getUri());
                C16783a.C16785b bVar3 = this.f49414b;
                if (bVar3 != null) {
                    bVar3.mo17813a(4, -1, (String) null, this.f49415c);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.a$b */
    public static final class C17914b<T> implements C88631d.C76721a {

        /* renamed from: a */
        public final /* synthetic */ C16783a.C16785b f49416a;

        /* renamed from: b */
        public final /* synthetic */ C16783a f49417b;

        public C17914b(C16783a.C16785b bVar, C16783a aVar) {
            this.f49416a = bVar;
            this.f49417b = aVar;
        }

        /* renamed from: a */
        public final void mo1720a(Object obj) {
            String obj2 = obj != null ? obj.toString() : null;
            C16783a.C16785b bVar = this.f49416a;
            if (bVar != null) {
                bVar.mo17813a(1, -1, obj2, this.f49417b);
            }
        }
    }

    /* renamed from: a */
    public int mo17812a(C16783a.C16786c cVar, C16783a.C16785b bVar, C16783a aVar) {
        C87412m.m108594g(cVar, "rr");
        C87412m.m108594g(aVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C16377l lVar = (C16377l) C89909e.m112436a(C16377l.class);
        if (lVar == null) {
            return -1;
        }
        lVar.mo14840YQ(cVar.getUri(), aVar instanceof C22357b ? f49412b.get(((C22357b) aVar).f63376a) : null, cVar.mo17815b(), cVar.mo17814a().getClass()).mo114038a(new C17913a(cVar, bVar, aVar)).mo123065b(new C17914b(bVar, aVar));
        return 0;
    }
}
