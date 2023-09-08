package nm3;

import a14.C0000n0;
import a14.C53934p0;
import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import androidx.appcompat.app.AppCompatActivity;
import bi3.C67247c;
import c14.C54624g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C45252f;
import d14.C58017a1;
import d14.C58085t0;
import d62.C75339i;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i40.C46166d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kg3.C76577a;
import kotlin.ResultKt;
import lv1.C99672i;
import lv1.C99681n;
import om3.C77020b;
import pm3.C77113a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import sm3.C77737d;
import sx3.C64186f0;
import tm3.C78069w;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: nm3.d */
public final class C76940d extends C53996a<C77020b> {

    /* renamed from: d */
    public final AppCompatActivity f224844d;

    /* renamed from: e */
    public final Set<String> f224845e;

    /* renamed from: f */
    public final List<String> f224846f;

    /* renamed from: g */
    public final String f224847g;

    /* renamed from: h */
    public final String f224848h;

    /* renamed from: i */
    public final C13601g f224849i = C36568h.m40985a(C61815a.f175755d);

    /* renamed from: j */
    public List<String> f224850j;

    /* renamed from: nm3.d$a */
    public static final class C61815a extends C87413o implements C32224a<C46166d> {

        /* renamed from: d */
        public static final C61815a f175755d = new C61815a();

        public C61815a() {
            super(0);
        }

        public Object invoke() {
            return new C46166d();
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.ui.mvvm.datasource.conversation.SelectChatroomConversationDataSource$getData$2", mo125469f = "SelectChatroomConversationDataSource.kt", mo125470l = {87}, mo125471m = "invokeSuspend")
    /* renamed from: nm3.d$b */
    public static final class C61816b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f175756d;

        /* renamed from: e */
        public final /* synthetic */ C58085t0<C39534d<C77020b>> f175757e;

        /* renamed from: f */
        public final /* synthetic */ C39534d<C77020b> f175758f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61816b(C58085t0<C39534d<C77020b>> t0Var, C39534d<C77020b> dVar, C15601d<? super C61816b> dVar2) {
            super(2, dVar2);
            this.f175757e = t0Var;
            this.f175758f = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61816b(this.f175757e, this.f175758f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61816b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f175756d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58085t0<C39534d<C77020b>> t0Var = this.f175757e;
                C39534d<C77020b> dVar = this.f175758f;
                this.f175756d = 1;
                if (t0Var.emit(dVar, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    public C76940d(AppCompatActivity appCompatActivity, Set<String> set, List<String> list, String str, String str2) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(set, "blockList");
        C87412m.m108594g(list, "showChatroomList");
        C87412m.m108594g(str, "selectShowHeadDisplay");
        C87412m.m108594g(str2, "unSelectShowHeadDisplay");
        this.f224844d = appCompatActivity;
        this.f224845e = set;
        this.f224846f = list;
        this.f224847g = str;
        this.f224848h = str2;
    }

    /* renamed from: b */
    public C45252f<C39534d<C77020b>> mo70650e(LifecycleScope lifecycleScope, C53998c<C77020b> cVar) {
        UIStateCenter stateCenter;
        C78069w wVar;
        LifecycleScope lifecycleScope2 = lifecycleScope;
        C53998c<C77020b> cVar2 = cVar;
        C87412m.m108594g(lifecycleScope2, "scope");
        C87412m.m108594g(cVar2, "request");
        C39534d dVar = new C39534d(cVar2);
        int i = 0;
        C58085t0 b = C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null);
        List<String> list = this.f224850j;
        if (list != null && cVar2.f151264a < list.size()) {
            int size = list.size();
            int i2 = cVar2.f151264a + cVar2.f151265b;
            if (size > i2) {
                dVar.f106150a = true;
            } else {
                i2 = list.size();
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = cVar2.f151264a; i3 < i2; i3++) {
                arrayList.add(list.get(i3));
            }
            Iterator it = ((ArrayList) C67247c.f193088a.mo91402c(C64186f0.f181907d, arrayList)).iterator();
            while (it.hasNext()) {
                C72976h2 h2Var = (C72976h2) it.next();
                C77737d dVar2 = new C77737d(h2Var.mo108821o2(), (C99681n) null, (C99672i) null, 0, 14, (C8480h) null);
                String username = h2Var.getUsername();
                C87412m.m108593f(username, "conv.username");
                String str = username + '-' + 30 + '-' + i;
                AppCompatActivity appCompatActivity = this.f224844d;
                String str2 = this.f224847g;
                String str3 = this.f224848h;
                C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                C87412m.m108594g(str, "id");
                C87412m.m108594g(str2, "selectShowHeadDisplay");
                C87412m.m108594g(str3, "unSelectShowHeadDisplay");
                C77113a.C77114a aVar = C77113a.f225222a;
                aVar.getClass();
                CharSequence d = aVar.mo107431d(appCompatActivity, ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(h2Var.getUsername()), C76577a.m92157h(appCompatActivity, C0966R.dimen.f3927j7));
                String username2 = h2Var.getUsername();
                C87412m.m108593f(username2, "conv.username");
                if (d == null) {
                    d = "";
                }
                C77020b bVar = r9;
                String str4 = username2;
                String str5 = str3;
                CharSequence charSequence = d;
                String str6 = str2;
                C77020b bVar2 = new C77020b(str, 30, str4, charSequence, dVar2);
                bVar.mo107341b((CharSequence) null);
                if (!(!(appCompatActivity instanceof BaseMvvmActivity) || (stateCenter = ((BaseMvvmActivity) appCompatActivity).getStateCenter()) == null || (wVar = (C78069w) stateCenter.getState()) == null)) {
                    bVar.f225018t = wVar.mo108033b();
                    bVar.f225017s = wVar.mo108034c(bVar.f225007f);
                    bVar.f225016r = wVar.mo108032a(bVar.f225007f);
                }
                if (bVar.f225017s) {
                    bVar.f225013o = str6;
                } else {
                    bVar.f225013o = str5;
                }
                bVar.f225014p = appCompatActivity.getResources().getColor(C0966R.color.f2929c);
                dVar.f106151b.add(bVar);
                i = 0;
            }
        }
        LifecycleScope.launchDefault$default(lifecycleScope2, (C53934p0) null, new C61816b(b, dVar, (C15601d<? super C61816b>) null), 1, (Object) null);
        return b;
    }

    /* renamed from: d */
    public int mo70649d() {
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0078, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0079, code lost:
        cy3.C58003b.m67160a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007c, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
            r4 = this;
            java.util.List<java.lang.String> r0 = r4.f224846f
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x007e
            com.tencent.mm.sdk.storage.sql.Column r0 = p749xh.C78821o1.f231208L
            java.util.Set<java.lang.String> r1 = r4.f224845e
            java.util.List r1 = sx3.C110818d0.m150953y0(r1)
            com.tencent.mm.sdk.storage.sql.SingleCondition r1 = r0.notInString(r1)
            java.lang.String r2 = "'%@chatroom'"
            com.tencent.mm.sdk.storage.sql.SingleCondition r2 = r0.like(r2)
            com.tencent.mm.sdk.storage.sql.ISqlCondition r1 = r1.and(r2)
            com.tencent.mm.sdk.storage.sql.SingleTable r2 = p749xh.C78821o1.f231207K
            java.util.List r0 = sx3.C26236u.m33719b(r0)
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r0 = r2.select((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.ISqlColumn>) r0)
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r0 = r0.where(r1)
            bi3.b r1 = new bi3.b
            r1.<init>()
            java.util.List r1 = sx3.C26236u.m33719b(r1)
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r0 = r0.orderBy((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.ISqlOrder>) r1)
            com.tencent.mm.sdk.storage.sql.SelectSql r0 = r0.build()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            rx3.g r2 = r4.f224849i
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            i40.d r2 = (i40.C46166d) r2
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r2.getDB()
            if (r2 == 0) goto L_0x007d
            java.lang.String r3 = r0.getSql()
            java.lang.String[] r0 = r0.getParams()
            android.database.Cursor r0 = r2.rawQuery(r3, r0)
            if (r0 == 0) goto L_0x007d
            r2 = 0
        L_0x0061:
            boolean r3 = r0.moveToNext()     // Catch:{ all -> 0x0076 }
            if (r3 == 0) goto L_0x0070
            r3 = 0
            java.lang.String r3 = r0.getString(r3)     // Catch:{ all -> 0x0076 }
            r1.add(r3)     // Catch:{ all -> 0x0076 }
            goto L_0x0061
        L_0x0070:
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0076 }
            cy3.C58003b.m67160a(r0, r2)
            goto L_0x007d
        L_0x0076:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r2 = move-exception
            cy3.C58003b.m67160a(r0, r1)
            throw r2
        L_0x007d:
            r0 = r1
        L_0x007e:
            r4.f224850j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nm3.C76940d.onCreate():void");
    }
}
