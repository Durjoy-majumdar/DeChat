package fk3;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import fy3.C32227p;
import g62.C75875l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.ResultKt;
import p157gk.C59481e;
import p157gk.C59491j;
import p248ug.C65347o0;
import qg0.C12215a;
import qo3.C101218e0;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;
import zt3.C119157j;

/* renamed from: fk3.h */
public final class C59141h {

    /* renamed from: a */
    public Context f169146a;

    /* renamed from: b */
    public String f169147b;

    /* renamed from: c */
    public int f169148c;

    /* renamed from: d */
    public boolean f169149d;

    /* renamed from: e */
    public View f169150e;

    /* renamed from: f */
    public RecyclerView f169151f;

    /* renamed from: g */
    public C8100l f169152g;

    /* renamed from: h */
    public int f169153h;

    /* renamed from: i */
    public boolean f169154i;

    /* renamed from: j */
    public C0000n0 f169155j = C53930o0.m60555b();

    /* renamed from: k */
    public C53973z1 f169156k;

    /* renamed from: l */
    public boolean f169157l;

    /* renamed from: fk3.h$a */
    public static final class C59142a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C59141h f169158d;

        /* renamed from: e */
        public final /* synthetic */ String f169159e;

        public C59142a(C59141h hVar, String str) {
            this.f169158d = hVar;
            this.f169159e = str;
        }

        public final void run() {
            Class cls = C65347o0.class;
            C75875l z = C97625j3.m125812b().mo105911z();
            String str = this.f169158d.f169147b;
            C72972g4 g4Var = (C72972g4) z;
            g4Var.getClass();
            Cursor rawQuery = g4Var.f212775p.rawQuery("SELECT COUNT(*) FROM " + g4Var.hy0(str) + " WHERE " + "talker" + "= '" + Util.escapeSqlValue(str) + "' AND " + "type IN (3,39,13)", (String[]) null, 2);
            int i = 0;
            if (rawQuery.moveToFirst()) {
                i = rawQuery.getInt(0);
            }
            rawQuery.close();
            Log.m105924i("MicroMsg.MediaHistoryQueryHeaderUI", "reportExpose >> " + i + ", " + this.f169159e);
            C59141h hVar = this.f169158d;
            ((C65347o0) C86312j.m106911c(cls)).mo89081ps(hVar.f169147b, hVar.f169148c, this.f169159e, i);
            ((C65347o0) C86312j.m106911c(cls)).mo89074NX(1);
        }
    }

    /* renamed from: fk3.h$b */
    public static final class C59143b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C101218e0 f169160d;

        public C59143b(C101218e0 e0Var) {
            this.f169160d = e0Var;
        }

        public final void onClick(View view) {
            Class cls = C65347o0.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$showSettingPermissionDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f169160d.mo140680z();
            ((C65347o0) C86312j.m106911c(cls)).mo89083yd(2);
            ((C65347o0) C86312j.m106911c(cls)).mo89074NX(103);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$showSettingPermissionDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: fk3.h$c */
    public static final class C59144c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C59141h f169161d;

        /* renamed from: e */
        public final /* synthetic */ C101218e0 f169162e;

        @C91590f(mo125468c = "com.tencent.mm.ui.chatting.gallery.query.MediaHistoryQueryHeaderUI$showSettingPermissionDialog$2$1", mo125469f = "MediaHistoryQueryHeaderUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: fk3.h$c$a */
        public static final class C59145a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f169163d;

            /* renamed from: e */
            public final /* synthetic */ C59141h f169164e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C59145a(C59141h hVar, C15601d<? super C59145a> dVar) {
                super(2, dVar);
                this.f169164e = hVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                C59145a aVar = new C59145a(this.f169164e, dVar);
                aVar.f169163d = obj;
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C59145a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C97886b bVar = C97886b.f287172a;
                bVar.mo137235v(this.f169164e.f169147b);
                C97886b.f287174c = "";
                C97886b.f287175d = this.f169164e.f169153h;
                if (C53930o0.m60560g((C0000n0) this.f169163d)) {
                    this.f169164e.f169157l = true;
                    ((C65347o0) C86312j.m106911c(C65347o0.class)).mo89080pf(this.f169164e.f169146a, bVar);
                }
                return C13598b0.f38549a;
            }
        }

        public C59144c(C59141h hVar, C101218e0 e0Var) {
            this.f169161d = hVar;
            this.f169162e = e0Var;
        }

        public final void onClick(View view) {
            Class cls = C65347o0.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$showSettingPermissionDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C65347o0) C86312j.m106911c(cls)).mo89076QZ(true);
            C59141h hVar = this.f169161d;
            hVar.f169149d = true;
            hVar.f169154i = true;
            this.f169162e.mo140680z();
            ((C65347o0) C86312j.m106911c(cls)).mo89083yd(1);
            ((C65347o0) C86312j.m106911c(cls)).mo89074NX(102);
            this.f169161d.f169156k = C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C59145a(this.f169161d, (C15601d<? super C59145a>) null), 3, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$showSettingPermissionDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: fk3.h$d */
    public static final class C59146d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C59141h f169165d;

        public C59146d(C59141h hVar) {
            this.f169165d = hVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$showSettingPermissionDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String obj = C86709a0.m107535s().mo121142i().mo119684e(274436, "").toString();
            String string = this.f169165d.f169146a.getString(C0966R.string.g5g, new Object[]{LocaleUtil.getApplicationLanguage(), obj, "setting", 0, 0});
            C87412m.m108593f(string, "activity.getString(com.t…tryCode, \"setting\", 0, 0)");
            C12215a.m11778c(this.f169165d.f169146a, string, 0, true);
            ((C65347o0) C86312j.m106911c(C65347o0.class)).mo89074NX(104);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$showSettingPermissionDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: fk3.h$e */
    public static final class C59147e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C59141h f169166d;

        /* renamed from: e */
        public final /* synthetic */ C101218e0 f169167e;

        public C59147e(C59141h hVar, C101218e0 e0Var) {
            this.f169166d = hVar;
            this.f169167e = e0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$showSettingPermissionDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C59141h hVar = this.f169166d;
            View inflate = C85868k2.m106137b(hVar.f169146a).inflate(C0966R.C0971layout.cpf, (ViewGroup) null);
            C87412m.m108593f(inflate, "getInflater(activity).in…_custom_permission, null)");
            C101218e0 e0Var = new C101218e0(hVar.f169146a, 0, 0, false, true);
            e0Var.mo140663j(inflate);
            e0Var.mo140655A();
            ((WeImageView) inflate.findViewById(C0966R.C0970id.mbq)).setOnClickListener(new C59148i(e0Var, hVar));
            this.f169167e.mo140680z();
            ((C65347o0) C86312j.m106911c(C65347o0.class)).mo89074NX(105);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$showSettingPermissionDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C59141h(Context context, String str, int i) {
        Class cls = C65347o0.class;
        C87412m.m108594g(context, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str, "chatRoomId");
        this.f169146a = context;
        this.f169147b = str;
        this.f169148c = i;
        this.f169149d = ((C65347o0) C86312j.m106911c(cls)).Iq0();
        Log.m105924i("MicroMsg.MediaHistoryQueryHeaderUI", "initView >> " + hashCode());
        ((C65347o0) C86312j.m106911c(cls)).mo89075PH();
        ((C65347o0) C86312j.m106911c(cls)).mo89083yd(9);
        Context context2 = this.f169146a;
        C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) context2;
        View findViewById = mMActivity.findViewById(C0966R.C0970id.mhf);
        C87412m.m108593f(findViewById, "this as MMActivity).find…id.search_history_header)");
        this.f169150e = mMActivity.findViewById(C0966R.C0970id.me_);
        this.f169151f = (RecyclerView) mMActivity.findViewById(C0966R.C0970id.meb);
        boolean z = false;
        if (!((C65347o0) C86312j.m106911c(cls)).xr0()) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo84356c("");
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        RecyclerView recyclerView = this.f169151f;
        C87412m.m108591d(recyclerView);
        this.f169152g = new C8100l(recyclerView, this.f169146a);
        Context context3 = this.f169146a;
        this.f169153h = C76577a.m92152c(context3, C75044y4.m89991c(context3));
        Log.m105924i("MicroMsg.MediaHistoryQueryHeaderUI", "navigationBarHeight: " + this.f169153h);
        if (this.f169149d) {
            if (!mo84354a()) {
                ((C65347o0) C86312j.m106911c(cls)).mo89077gs(this.f169147b);
            }
            C8100l lVar = this.f169152g;
            if (lVar != null) {
                lVar.mo9175a(new C59137c(this), new C8096d(this));
            }
            if (!mo84354a()) {
                C59481e eVar = C59491j.f169998c;
                z = eVar != null ? eVar.f169965e : z;
                Log.m105924i("MicroMsg.MediaHistoryQueryHeaderUI", "getManagerIsDoingWork >> " + z);
                if (!z) {
                    this.f169157l = true;
                    this.f169156k = C53895h.m60466d(this.f169155j, C53872d1.f151119c, (C53934p0) null, new C59138e(this, (C15601d<? super C59138e>) null), 2, (Object) null);
                }
            }
        } else {
            RecyclerView recyclerView2 = this.f169151f;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(8);
            }
            mo84356c("");
        }
        View view3 = this.f169150e;
        if (view3 != null) {
            view3.setOnClickListener(new C59139f(this));
        }
    }

    /* renamed from: a */
    public final boolean mo84354a() {
        int i = this.f169148c;
        return i == 3 || i == 4;
    }

    /* renamed from: b */
    public final void mo84355b() {
        Log.m105924i("MicroMsg.MediaHistoryQueryHeaderUI", "onFinish" + hashCode());
        if (mo84354a()) {
            Intent intent = new Intent();
            intent.putExtra("RESULT_OPEN_FEATURE", this.f169154i);
            Context context = this.f169146a;
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) context).setResult(-1, intent);
        }
    }

    /* renamed from: c */
    public final void mo84356c(String str) {
        C87412m.m108594g(str, "exposeQuery");
        ((C119157j) C119157j.f356862d).mo183884o(new C59142a(this, str));
    }

    /* renamed from: d */
    public final void mo84357d() {
        View inflate = C85868k2.m106137b(this.f169146a).inflate(C0966R.C0971layout.cpg, (ViewGroup) null);
        C101218e0 e0Var = new C101218e0(this.f169146a, 0, 0, false, true);
        e0Var.mo140663j(inflate);
        e0Var.mo140655A();
        ((C65347o0) C86312j.m106911c(C65347o0.class)).mo89074NX(101);
        ((Button) inflate.findViewById(C0966R.C0970id.mbt)).setOnClickListener(new C59143b(e0Var));
        ((Button) inflate.findViewById(C0966R.C0970id.mby)).setOnClickListener(new C59144c(this, e0Var));
        ((TextView) inflate.findViewById(C0966R.C0970id.mbn)).setOnClickListener(new C59146d(this));
        ((TextView) inflate.findViewById(C0966R.C0970id.mbo)).setOnClickListener(new C59147e(this, e0Var));
    }
}
