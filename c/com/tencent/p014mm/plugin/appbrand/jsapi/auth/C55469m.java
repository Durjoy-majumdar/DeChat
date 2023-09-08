package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C8480h;
import p196ln.C10579k;
import p196ln.C61311l;
import p196ln.C76706g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.m */
public final class C55469m {

    /* renamed from: a */
    public static final C55470a f158057a = new C55470a((C8480h) null);

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.m$a */
    public static final class C55470a implements C82166i {

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.m$a$a */
        public static final class C55471a implements C61311l.C61312a {

            /* renamed from: a */
            public final /* synthetic */ C61311l f158058a;

            /* renamed from: b */
            public final /* synthetic */ C55472b f158059b;

            /* renamed from: c */
            public final /* synthetic */ String f158060c;

            public C55471a(C61311l lVar, C55472b bVar, String str) {
                this.f158058a = lVar;
                this.f158059b = bVar;
                this.f158060c = str;
            }

            /* renamed from: a */
            public final int mo1218a(int i, int i2) {
                Log.m105925i("AuthorizeHelper", "GetHDHeadImg errType=%d  errCode=%d", Integer.valueOf(i), Integer.valueOf(i2));
                this.f158058a.mo86278a();
                C55472b bVar = this.f158059b;
                if (bVar != null) {
                    String h = ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93559h(this.f158060c, false);
                    if (h == null) {
                        h = "";
                    }
                    bVar.mo76928a(h);
                }
                return 0;
            }
        }

        public C55470a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo76996a(String str, C55472b bVar) {
            Class cls = C76706g.class;
            if (!(str == null || str.length() == 0) && !((AvatarStorage) ((C76706g) C86312j.m106911c(cls)).mo106826RE()).mo93565n(str, false)) {
                C61311l hl02 = ((C76706g) C86312j.m106911c(cls)).hl0();
                hl02.mo86279b(str, new C55471a(hl02, bVar, str));
            } else if (bVar != null) {
                C10579k RE = ((C76706g) C86312j.m106911c(cls)).mo106826RE();
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                String h = ((AvatarStorage) RE).mo93559h(str, false);
                if (h != null) {
                    str2 = h;
                }
                bVar.mo76928a(str2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.m$b */
    public interface C55472b {
        /* renamed from: a */
        void mo76928a(String str);
    }
}
