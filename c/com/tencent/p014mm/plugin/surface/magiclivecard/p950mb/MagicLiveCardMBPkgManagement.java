package com.tencent.p014mm.plugin.surface.magiclivecard.p950mb;

import com.tencent.p014mm.plugin.appbrand.appcache.C81291m0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.magicbrush.C30172a0;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e42.C86433l;
import e42.C86434m;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import k70.C88117a;
import kotlin.Metadata;
import ox2.C89299a;
import q52.C89480u;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C26236u;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/surface/magiclivecard/mb/MagicLiveCardMBPkgManagement;", "Le42/l;", "", "instanceName", "<init>", "(Ljava/lang/String;)V", "plugin-surface-app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.surface.magiclivecard.mb.MagicLiveCardMBPkgManagement */
public final class MagicLiveCardMBPkgManagement extends C86433l {

    /* renamed from: b */
    public final String f249120b = "MagicLiveCardMBPkgManagement";

    /* renamed from: c */
    public final C13601g f249121c = C36568h.m40985a(C85485b.f249125d);

    /* renamed from: d */
    public final C13601g f249122d;

    /* renamed from: com.tencent.mm.plugin.surface.magiclivecard.mb.MagicLiveCardMBPkgManagement$a */
    public static final class C85484a extends C87413o implements C32224a<C81415h0> {

        /* renamed from: d */
        public final /* synthetic */ String f249123d;

        /* renamed from: e */
        public final /* synthetic */ MagicLiveCardMBPkgManagement f249124e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85484a(String str, MagicLiveCardMBPkgManagement magicLiveCardMBPkgManagement) {
            super(0);
            this.f249123d = str;
            this.f249124e = magicLiveCardMBPkgManagement;
        }

        public Object invoke() {
            return ((C30172a0) C86312j.m106911c(C30172a0.class)).mo57189Eo(this.f249123d, (String) null, new C88117a((C89299a) ((C36570n) this.f249124e.f249121c).getValue()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.surface.magiclivecard.mb.MagicLiveCardMBPkgManagement$b */
    public static final class C85485b extends C87413o implements C32224a<C89299a> {

        /* renamed from: d */
        public static final C85485b f249125d = new C85485b();

        public C85485b() {
            super(0);
        }

        public Object invoke() {
            return new C89299a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagicLiveCardMBPkgManagement(String str) {
        super(str);
        C87412m.m108594g(str, "instanceName");
        this.f249122d = C36568h.m40985a(new C85484a(str, this));
    }

    /* renamed from: a */
    public C81415h0 mo109577a() {
        Log.m105924i(this.f249120b, "provideFileSystem");
        return (C81415h0) ((C36570n) this.f249122d).getValue();
    }

    /* renamed from: b */
    public String mo109578b() {
        return C81291m0.m99665a(((C89299a) ((C36570n) this.f249121c).getValue()).mo123643f());
    }

    /* renamed from: c */
    public String mo109579c() {
        return "wxe208ce76dfa39515";
    }

    /* renamed from: d */
    public void mo109580d(C32226l<? super List<? extends C86434m>, C13598b0> lVar) {
        C87412m.m108594g(lVar, "cb");
        Log.m105924i(this.f249120b, "provideMainScript");
        lVar.invoke(C26236u.m33719b(C89480u.m111876e(((C89299a) ((C36570n) this.f249121c).getValue()).mo123643f(), "/index.js")));
    }

    public void release() {
        ((C30172a0) C86312j.m106911c(C30172a0.class)).mo57194rr(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_LIVE_CARD);
    }
}
