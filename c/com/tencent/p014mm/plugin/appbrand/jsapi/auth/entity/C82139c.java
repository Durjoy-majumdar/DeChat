package com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32227p;
import gt0.C87330d0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import ke3.C88144b;
import kotlin.Metadata;
import ob0.C117747y;
import ob0.C89137b0;
import p154fy.C45843c;
import p154fy.C87121j;
import p170ic.C87687a;
import p225rc.C89916g;
import rx3.C13598b0;
import uo3.C78253a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.c */
public final class C82139c {

    /* renamed from: a */
    public final Context f240934a;

    /* renamed from: b */
    public final MMUserAvatarInfo f240935b;

    /* renamed from: c */
    public final String f240936c;

    /* renamed from: d */
    public final C82141b f240937d;

    /* renamed from: e */
    public final ArrayList<C87330d0.C87331a> f240938e;

    /* renamed from: f */
    public final AtomicInteger f240939f;

    /* renamed from: g */
    public final int f240940g = C87687a.m109085a(this);

    /* renamed from: h */
    public C82136a f240941h;

    /* renamed from: i */
    public C78253a f240942i;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/auth/entity/c$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.c$a */
    public static final class C82140a implements C80883e<IPCInteger, IPCBoolean> {
        public void invoke(Object obj, C1256g gVar) {
            IPCInteger iPCInteger = (IPCInteger) obj;
            Log.m105924i("WxaUserInfoListOperationController", "[DeleteUserTask#invoke]");
            if (iPCInteger != null) {
                C45843c ch02 = ((C87121j) C86312j.m106911c(C87121j.class)).ch0(iPCInteger.f10313d);
                C89137b0 d = C86709a0.m107524d();
                ch02.getClass();
                d.mo123455a(2700, new C82137b(ch02, gVar));
                C86709a0.m107524d().mo123460f((C117747y) ch02);
            } else if (gVar != null) {
                gVar.mo894a(new IPCBoolean(false));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.c$b */
    public interface C82141b {

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.c$b$a */
        public enum C40453a {
            NO_ACTION(1),
            CREATE_FAIL(2),
            CREATE_SUCCESS(3);
            

            /* renamed from: d */
            public final int f108728d;

            /* access modifiers changed from: public */
            C40453a(int i) {
                this.f108728d = i;
            }
        }

        /* renamed from: a */
        void mo63390a(boolean z, boolean z2, String str, String str2, C32227p<? super Activity, ? super String, C13598b0> pVar);

        /* renamed from: b */
        void mo63391b(List<C87330d0.C87331a> list);

        /* renamed from: c */
        void mo63392c(C40453a aVar);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.c$c */
    public static final class C82142c extends C87413o implements C32227p<Activity, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C82139c f240943d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82142c(C82139c cVar) {
            super(2);
            this.f240943d = cVar;
        }

        public Object invoke(Object obj, Object obj2) {
            Activity activity = (Activity) obj;
            String str = (String) obj2;
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(str, "appId");
            C82139c cVar = this.f240943d;
            cVar.getClass();
            C82141b.C40453a aVar = C82141b.C40453a.CREATE_FAIL;
            Intent intent = new Intent();
            intent.putExtra("0", str);
            intent.putExtra("extra_call_by_appbrand", true);
            if (activity instanceof MMActivity) {
                cVar.f240937d.mo63392c(aVar);
                C88144b.m109803u((MMActivity) activity, ".plugin.webview.ui.tools.CreateAvatarUI", intent, cVar.f240940g, new C82146g(cVar));
            } else if (activity instanceof AppBrandUI) {
                cVar.f240937d.mo63392c(aVar);
                C89916g.m112446a(activity).mo124232f(new C82147h(cVar));
                C88144b.m109802t(activity, ".plugin.webview.ui.tools.CreateAvatarUI", intent, cVar.f240940g);
            }
            return C13598b0.f38549a;
        }
    }

    public C82139c(Context context, MMUserAvatarInfo mMUserAvatarInfo, String str, C82141b bVar) {
        Context context2 = context;
        MMUserAvatarInfo mMUserAvatarInfo2 = mMUserAvatarInfo;
        String str2 = str;
        C82141b bVar2 = bVar;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(mMUserAvatarInfo2, "mUserAvatarInfo");
        C87412m.m108594g(str2, "scope");
        C87412m.m108594g(bVar2, "mListener");
        this.f240934a = context2;
        this.f240935b = mMUserAvatarInfo2;
        this.f240936c = str2;
        this.f240937d = bVar2;
        ArrayList<C87330d0.C87331a> arrayList = new ArrayList<>();
        this.f240938e = arrayList;
        this.f240939f = new AtomicInteger(mMUserAvatarInfo2.f240914g);
        ArrayList arrayList2 = new ArrayList();
        ArrayList<MMUserAvatarInfo.MMUserAvatarItem> arrayList3 = mMUserAvatarInfo2.f240911d;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            MMUserAvatarInfo.MMUserAvatarItem mMUserAvatarItem = arrayList3.get(i);
            C87412m.m108593f(mMUserAvatarItem, "avatar_list[i]");
            MMUserAvatarInfo.MMUserAvatarItem mMUserAvatarItem2 = mMUserAvatarItem;
            String str3 = mMUserAvatarItem2.f240923e;
            String str4 = mMUserAvatarItem2.f240925g;
            int i2 = mMUserAvatarInfo2.f240914g;
            int i3 = mMUserAvatarItem2.f240922d;
            C87330d0.C87331a aVar = r3;
            C87330d0.C87331a aVar2 = new C87330d0.C87331a(0, str3, str4, str, i2 == i3, mMUserAvatarItem2.f240924f, i3);
            arrayList2.add(aVar);
        }
        arrayList.addAll(arrayList2);
        mo114582b(this.f240938e);
        this.f240937d.mo63392c(C82141b.C40453a.NO_ACTION);
    }

    /* renamed from: a */
    public static final void m100864a(C82139c cVar, Intent intent) {
        cVar.getClass();
        if (intent != null) {
            int intExtra = intent.getIntExtra("id", -1);
            String stringExtra = intent.getStringExtra("nickname");
            String stringExtra2 = intent.getStringExtra("avatarurl");
            Iterator<C87330d0.C87331a> it = cVar.f240938e.iterator();
            while (it.hasNext()) {
                it.next().f253107f = false;
            }
            ArrayList<C87330d0.C87331a> arrayList = cVar.f240938e;
            String str = cVar.f240936c;
            C87412m.m108591d(stringExtra2);
            arrayList.add(new C87330d0.C87331a(0, stringExtra, "", str, (Bitmap) null, true, stringExtra2, intExtra));
            cVar.f240937d.mo63392c(C82141b.C40453a.CREATE_SUCCESS);
            cVar.mo114582b(cVar.f240938e);
            Log.m105924i("WxaUserInfoListOperationController", "mmOnActivityResult nickname=" + stringExtra + " avatarurl=" + stringExtra2);
        }
    }

    /* renamed from: b */
    public final void mo114582b(ArrayList<C87330d0.C87331a> arrayList) {
        this.f240937d.mo63391b(arrayList);
        C82141b bVar = this.f240937d;
        MMUserAvatarInfo mMUserAvatarInfo = this.f240935b;
        boolean z = mMUserAvatarInfo.f240912e;
        boolean z2 = mMUserAvatarInfo.f240913f <= arrayList.size();
        MMUserAvatarInfo mMUserAvatarInfo2 = this.f240935b;
        String str = mMUserAvatarInfo2.f240918n;
        if (str == null) {
            str = "";
        }
        String str2 = mMUserAvatarInfo2.f240917j;
        bVar.mo63390a(z, z2, str, str2 == null ? "" : str2, new C82142c(this));
    }

    /* renamed from: c */
    public void mo114583c(View view, int i, int i2, int i3) {
        C87412m.m108594g(view, "view");
        C78253a aVar = new C78253a(view.getContext());
        this.f240942i = aVar;
        if (i != 0) {
            aVar.mo108272g(view, i, 0, new C1617i(view), new C82148j(this, i), i2, i3);
        }
    }
}
