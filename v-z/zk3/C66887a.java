package zk3;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C57761h6;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nr3.C89059e;
import o40.C61926c;
import ob0.C89132b;
import p565ir.C60602j;
import p749xh.C38616n3;
import qo3.C77407n;
import rx3.C13598b0;
import te3.C51778w31;
import zk3.C66894c;

/* renamed from: zk3.a */
public final class C66887a extends C66894c {

    /* renamed from: j */
    public static final /* synthetic */ int f192164j = 0;

    /* renamed from: i */
    public final String f192165i = "FinderLiveGameTeamUpNotifyTmpl";

    /* renamed from: zk3.a$a */
    public static final class C66888a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66887a f192166d;

        /* renamed from: e */
        public final /* synthetic */ C67391b f192167e;

        /* renamed from: f */
        public final /* synthetic */ String f192168f;

        /* renamed from: g */
        public final /* synthetic */ Map<String, String> f192169g;

        /* renamed from: h */
        public final /* synthetic */ String f192170h;

        /* renamed from: i */
        public final /* synthetic */ long f192171i;

        /* renamed from: j */
        public final /* synthetic */ long f192172j;

        /* renamed from: n */
        public final /* synthetic */ C66894c.C66896b f192173n;

        /* renamed from: zk3.a$a$a */
        public static final class C66889a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ boolean f192174d;

            /* renamed from: e */
            public final /* synthetic */ C66887a f192175e;

            /* renamed from: f */
            public final /* synthetic */ Map<String, String> f192176f;

            /* renamed from: g */
            public final /* synthetic */ String f192177g;

            public C66889a(boolean z, C66887a aVar, Map<String, String> map, String str) {
                this.f192174d = z;
                this.f192175e = aVar;
                this.f192176f = map;
                this.f192177g = str;
            }

            public final void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.clear();
                if (this.f192174d) {
                    int i = this.f192175e.f192197e;
                    Resources resources = MMApplicationContext.getContext().getResources();
                    Map<String, String> map = this.f192176f;
                    e0Var.add(0, i, 0, (CharSequence) resources.getString(C0966R.string.b3a, new Object[]{map.get(this.f192177g + ".title.nickname")}));
                } else {
                    int i2 = this.f192175e.f192196d;
                    int color = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f2966ao);
                    Resources resources2 = MMApplicationContext.getContext().getResources();
                    Map<String, String> map2 = this.f192176f;
                    e0Var.mo107140d(i2, color, resources2.getString(C0966R.string.b3_, new Object[]{map2.get(this.f192177g + ".title.nickname")}));
                }
                e0Var.add(0, this.f192175e.f192195c, 0, (CharSequence) MMApplicationContext.getContext().getResources().getString(C0966R.string.f361105hd0));
            }
        }

        /* renamed from: zk3.a$a$b */
        public static final class C66890b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ C66887a f192178d;

            /* renamed from: e */
            public final /* synthetic */ String f192179e;

            /* renamed from: f */
            public final /* synthetic */ long f192180f;

            /* renamed from: g */
            public final /* synthetic */ C67391b f192181g;

            /* renamed from: h */
            public final /* synthetic */ long f192182h;

            /* renamed from: i */
            public final /* synthetic */ C66894c.C66896b f192183i;

            /* renamed from: zk3.a$a$b$a */
            public static final class C66891a extends C87413o implements C32226l<C89132b.C89134c<C51778w31>, C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C66887a f192184d;

                /* renamed from: e */
                public final /* synthetic */ String f192185e;

                /* renamed from: f */
                public final /* synthetic */ C66894c.C66896b f192186f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C66891a(C66887a aVar, String str, C66894c.C66896b bVar) {
                    super(1);
                    this.f192184d = aVar;
                    this.f192185e = str;
                    this.f192186f = bVar;
                }

                public Object invoke(Object obj) {
                    int i;
                    C89132b.C89134c cVar = (C89132b.C89134c) obj;
                    if (cVar != null && (i = cVar.f256793a) == 0 && i == 0) {
                        C66887a aVar = this.f192184d;
                        String str = this.f192185e;
                        int i2 = C66887a.f192164j;
                        aVar.getClass();
                        MultiProcessMMKV multiProcessMMKV = C66894c.f192192h;
                        multiProcessMMKV.putBoolean(str + "_game_team", true);
                        View view = this.f192186f.f192215k;
                        if (view != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveGameTeamUpNotifyTmpl$filling$1$2$1$1", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveGameTeamUpNotifyTmpl$filling$1$2$1$1", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                    return C13598b0.f38549a;
                }
            }

            /* renamed from: zk3.a$a$b$b */
            public static final class C66892b extends C87413o implements C32226l<C89132b.C89134c<C51778w31>, C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C66887a f192187d;

                /* renamed from: e */
                public final /* synthetic */ String f192188e;

                /* renamed from: f */
                public final /* synthetic */ C66894c.C66896b f192189f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C66892b(C66887a aVar, String str, C66894c.C66896b bVar) {
                    super(1);
                    this.f192187d = aVar;
                    this.f192188e = str;
                    this.f192189f = bVar;
                }

                public Object invoke(Object obj) {
                    int i;
                    C89132b.C89134c cVar = (C89132b.C89134c) obj;
                    if (cVar != null && (i = cVar.f256793a) == 0 && i == 0) {
                        C66887a aVar = this.f192187d;
                        String str = this.f192188e;
                        int i2 = C66887a.f192164j;
                        aVar.getClass();
                        MultiProcessMMKV multiProcessMMKV = C66894c.f192192h;
                        multiProcessMMKV.putBoolean(str + "_game_team", false);
                        View view = this.f192189f.f192215k;
                        if (view != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar2.mo10233c(8);
                            View view2 = view;
                            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveGameTeamUpNotifyTmpl$filling$1$2$2$1", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveGameTeamUpNotifyTmpl$filling$1$2$2$1", "invoke", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                    return C13598b0.f38549a;
                }
            }

            public C66890b(C66887a aVar, String str, long j, C67391b bVar, long j2, C66894c.C66896b bVar2) {
                this.f192178d = aVar;
                this.f192179e = str;
                this.f192180f = j;
                this.f192181g = bVar;
                this.f192182h = j2;
                this.f192183i = bVar2;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                Class cls = C60602j.class;
                int itemId = menuItem.getItemId();
                C66887a aVar = this.f192178d;
                if (itemId == aVar.f192196d) {
                    String str = this.f192179e;
                    if (str != null) {
                        long j = this.f192180f;
                        long j2 = this.f192182h;
                        C66894c.C66896b bVar = this.f192183i;
                        C87412m.m108593f(str, "finderUserName");
                        C89059e<C89132b.C89134c<C51778w31>> i2 = ((C60602j) C86312j.m106911c(cls)).p80(j, j2, 3, ((C60602j) C86312j.m106911c(cls)).mo71541NM(str, false)).mo9225i();
                        C87412m.m108593f(i2, "getService(ICgiFinderLiv…                  ).run()");
                        C61926c.m72665J(i2, new C66891a(aVar, str, bVar));
                    }
                } else if (itemId == aVar.f192197e) {
                    String str2 = this.f192179e;
                    if (str2 != null) {
                        long j3 = this.f192180f;
                        long j4 = this.f192182h;
                        C66894c.C66896b bVar2 = this.f192183i;
                        C87412m.m108593f(str2, "finderUserName");
                        C89059e<C89132b.C89134c<C51778w31>> i3 = ((C60602j) C86312j.m106911c(cls)).p80(j3, j4, 3, ((C60602j) C86312j.m106911c(cls)).mo71541NM(str2, true)).mo9225i();
                        C87412m.m108593f(i3, "getService(ICgiFinderLiv…                  ).run()");
                        C61926c.m72665J(i3, new C66892b(aVar, str2, bVar2));
                    }
                } else if (itemId == aVar.f192195c) {
                    String format = String.format(aVar.f192198f, Arrays.copyOf(new Object[]{Long.valueOf(this.f192180f), this.f192179e, LocaleUtil.getApplicationLanguage()}, 3));
                    C87412m.m108593f(format, "format(format, *args)");
                    Log.m105924i(this.f192178d.f192165i, "go to complain page");
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", format);
                    C74023i.m87881c(intent, this.f192181g.mo91577r());
                    C88144b.m109791i(MMApplicationContext.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                }
            }
        }

        public C66888a(C66887a aVar, C67391b bVar, String str, Map<String, String> map, String str2, long j, long j2, C66894c.C66896b bVar2) {
            this.f192166d = aVar;
            this.f192167e = bVar;
            this.f192168f = str;
            this.f192169g = map;
            this.f192170h = str2;
            this.f192171i = j;
            this.f192172j = j2;
            this.f192173n = bVar2;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveGameTeamUpNotifyTmpl$filling$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f192166d.f192194b = new C77407n((Context) this.f192167e.mo91565f(), 1, false);
            C66887a aVar = this.f192166d;
            String str = this.f192168f;
            int i = C66887a.f192164j;
            aVar.getClass();
            MultiProcessMMKV multiProcessMMKV = C66894c.f192192h;
            boolean z = multiProcessMMKV.getBoolean(str + "_game_team", false);
            C77407n nVar = this.f192166d.f192194b;
            C87412m.m108591d(nVar);
            C66887a aVar2 = this.f192166d;
            nVar.f225771i = new C66889a(z, aVar2, this.f192169g, this.f192170h);
            C77407n nVar2 = aVar2.f192194b;
            C87412m.m108591d(nVar2);
            C66887a aVar3 = this.f192166d;
            nVar2.f225782p = new C66890b(aVar3, this.f192168f, this.f192171i, this.f192167e, this.f192172j, this.f192173n);
            C77407n nVar3 = aVar3.f192194b;
            if (nVar3 != null) {
                nVar3.mo107573q();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveGameTeamUpNotifyTmpl$filling$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: a */
    public void mo90889a(C57761h6.C57762a aVar, Map<String, String> map, C72963f4 f4Var, C67391b bVar) {
        C57761h6.C57762a aVar2 = aVar;
        Map<String, String> map2 = map;
        C87412m.m108594g(map2, "values");
        C87412m.m108594g(bVar, "ui");
        C66894c.C66896b bVar2 = aVar2 != null ? (C66894c.C66896b) aVar2.mo82215a("TipsTempl_GamePurchaseTeamUp_Live") : null;
        long P = C61926c.m72671P(Util.nullAsNil(map2.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_id")));
        long P2 = C61926c.m72671P(Util.nullAsNil(map2.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.live_id")));
        String str = map2.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_nonce_id");
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String nullAsNil = Util.nullAsNil(str);
        C87412m.m108593f(nullAsNil, "nullAsNil(values[\"$xmlPr….object_nonce_id\"] ?: \"\")");
        String str3 = map2.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.tips_id");
        if (str3 == null) {
            str3 = str2;
        }
        String nullAsNil2 = Util.nullAsNil(str3);
        C87412m.m108593f(nullAsNil2, "nullAsNil(values[\"$xmlPr…tipsinfo.tips_id\"] ?: \"\")");
        String str4 = map2.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.notice_id");
        if (str4 != null) {
            str2 = str4;
        }
        String nullAsNil3 = Util.nullAsNil(str2);
        String nullAsNil4 = Util.nullAsNil(map2.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.finder_username"));
        String nullAsNil5 = Util.nullAsNil(map2.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.msg_type"));
        MultiProcessMMKV multiProcessMMKV = C66894c.f192192h;
        boolean z = multiProcessMMKV.getBoolean(nullAsNil4 + "_game_team", false);
        String str5 = this.f192165i;
        Log.m105924i(str5, "msgType: " + nullAsNil5 + ", " + Util.safeParseInt(nullAsNil5));
        C87412m.m108593f(nullAsNil3, "noticeId");
        String str6 = nullAsNil4;
        mo90894e(map, ".msg.appmsg.extinfo.notifymsg", bVar2, z, nullAsNil3, bVar, P, P2, nullAsNil, f4Var, str6, nullAsNil2, Util.safeParseInt(nullAsNil5));
        C66894c.C66896b bVar3 = bVar2;
        View view = bVar3.f192209e;
        if (view != null) {
            view.setOnClickListener(new C66888a(this, bVar, str6, map, ".msg.appmsg.extinfo.notifymsg", P2, P, bVar3));
        }
    }

    /* renamed from: c */
    public String mo90890c() {
        return this.f192165i;
    }

    /* renamed from: d */
    public void mo90891d(String str, long j, C38616n3 n3Var, long j2, String str2, String str3) {
        C87412m.m108594g(n3Var, "info");
        C87412m.m108594g(str2, "tipsId");
        C87412m.m108594g(str3, "noticeId");
    }
}
