package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b03.C39688b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import di3.C86312j;
import dm2.C45418c;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import jq3.C9493c;
import kotlin.Metadata;
import lz2.C46919a;
import lz2.C46923f;
import mz2.C47148a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p606mm.C99933h;
import p640ox.C77049b;
import qo3.C77407n;
import qo3.C89779i0;
import qy2.C47904x;
import rz2.C48201c;
import uz2.C78315f0;
import vz2.C78501d;
import yz2.C53722u;
import yz2.C53723v;
import yz2.C53724w;
import yz2.C53725x;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/StatusAlbumUI;", "Lcom/tencent/mm/ui/MMFragment;", "Lob0/n;", "<init>", "()V", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI */
public final class StatusAlbumUI extends MMFragment implements C11385n {

    /* renamed from: d */
    public RefreshLoadMoreLayout f116883d;

    /* renamed from: e */
    public WxRecyclerView f116884e;

    /* renamed from: f */
    public ArrayList<C9493c> f116885f = new ArrayList<>();

    /* renamed from: g */
    public C39688b f116886g;

    /* renamed from: h */
    public boolean f116887h;

    /* renamed from: i */
    public boolean f116888i;

    /* renamed from: j */
    public C89779i0 f116889j;

    /* renamed from: n */
    public View.OnLongClickListener f116890n = new C43195a(this);

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI$a */
    public static final class C43195a implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ StatusAlbumUI f116891d;

        /* renamed from: com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI$a$a */
        public static final class C43196a implements C11182m0 {

            /* renamed from: d */
            public static final C43196a f116892d = new C43196a();

            public final void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.mo107142f(C0966R.C0970id.grz, "删除");
            }
        }

        /* renamed from: com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI$a$b */
        public static final class C43197b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ StatusAlbumUI f116893d;

            /* renamed from: e */
            public final /* synthetic */ Activity f116894e;

            /* renamed from: f */
            public final /* synthetic */ String f116895f;

            public C43197b(StatusAlbumUI statusAlbumUI, Activity activity, String str) {
                this.f116893d = statusAlbumUI;
                this.f116894e = activity;
                this.f116895f = str;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
                r5 = r2.getResources();
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onMMMenuItemSelected(android.view.MenuItem r21, int r22) {
                /*
                    r20 = this;
                    r0 = r20
                    int r1 = r21.getItemId()
                    r2 = 2131309130(0x7f09324a, float:1.8236535E38)
                    if (r1 != r2) goto L_0x0065
                    com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI r1 = r0.f116893d
                    android.app.Activity r2 = r0.f116894e
                    r3 = 2131837868(0x7f1143ac, float:1.9308943E38)
                    r4 = 0
                    if (r2 == 0) goto L_0x0020
                    android.content.res.Resources r5 = r2.getResources()
                    if (r5 == 0) goto L_0x0020
                    java.lang.String r5 = r5.getString(r3)
                    goto L_0x0021
                L_0x0020:
                    r5 = r4
                L_0x0021:
                    android.app.Activity r6 = r0.f116894e
                    if (r6 == 0) goto L_0x0030
                    android.content.res.Resources r6 = r6.getResources()
                    if (r6 == 0) goto L_0x0030
                    java.lang.String r3 = r6.getString(r3)
                    r4 = r3
                L_0x0030:
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r3 = r5
                    r5 = r6
                    r6 = r7
                    r7 = r8
                    qo3.i0 r2 = nj3.C76879j.m92723Q(r2, r3, r4, r5, r6, r7)
                    r1.f116889j = r2
                    lz2.a r1 = new lz2.a
                    java.lang.String r2 = r0.f116895f
                    r3 = 2
                    r1.<init>(r2, r3)
                    ob0.b0 r2 = f40.C86709a0.m107524d()
                    r2.mo123460f(r1)
                    vz2.d r3 = vz2.C78501d.f229945a
                    android.app.Activity r4 = r0.f116894e
                    r5 = 43
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r11 = 0
                    r13 = 0
                    r15 = 0
                    r17 = 0
                    r18 = 508(0x1fc, float:7.12E-43)
                    r19 = 0
                    vz2.C78501d.m94806h(r3, r4, r5, r7, r8, r9, r11, r13, r15, r17, r18, r19)
                L_0x0065:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.StatusAlbumUI.C43195a.C43197b.onMMMenuItemSelected(android.view.MenuItem, int):void");
            }
        }

        public C43195a(StatusAlbumUI statusAlbumUI) {
            this.f116891d = statusAlbumUI;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/StatusAlbumUI$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            Object tag = view.getTag(C0966R.C0970id.g6r);
            C47148a aVar = tag instanceof C47148a ? (C47148a) tag : null;
            if (aVar == null) {
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/textstatus/ui/StatusAlbumUI$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
            Activity context = this.f116891d.getContext();
            if (context == null) {
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/textstatus/ui/StatusAlbumUI$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
            LayoutInflater.from(context);
            C77407n nVar = new C77407n((Context) context, 1, false);
            C76874e0 e0Var = new C76874e0(context);
            new C76874e0(context);
            C43196a aVar2 = C43196a.f116892d;
            C48201c cVar = aVar.f126665e;
            String str = cVar != null ? cVar.field_StatusID : null;
            if (str == null) {
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/textstatus/ui/StatusAlbumUI$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
            C43197b bVar = new C43197b(this.f116891d, context, str);
            e0Var.clear();
            C76874e0 e0Var2 = new C76874e0(context);
            aVar2.onCreateMMMenu(e0Var2);
            if (e0Var2.mo107176v()) {
                Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            } else {
                nVar.f225771i = aVar2;
                nVar.f225782p = bVar;
                nVar.f225761d = null;
                nVar.f225725D = null;
                nVar.mo107573q();
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/textstatus/ui/StatusAlbumUI$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        r3 = (mz2.C47148a) r3;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo67424K() {
        /*
            r10 = this;
            java.util.ArrayList<jq3.c> r0 = r10.f116885f
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
        L_0x0008:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0084
            java.lang.Object r3 = r0.next()
            jq3.c r3 = (jq3.C9493c) r3
            boolean r4 = r3 instanceof mz2.C47148a
            if (r4 == 0) goto L_0x0008
            mz2.a r3 = (mz2.C47148a) r3
            rz2.c r4 = r3.f126665e
            if (r4 == 0) goto L_0x0008
            int r4 = r4.field_CreateTime
            long r4 = (long) r4
            r6 = 1000(0x3e8, float:1.401E-42)
            long r6 = (long) r6
            long r4 = r4 * r6
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat
            java.lang.String r7 = "yyyy-MM-dd HH:mm:ss"
            r6.<init>(r7)
            java.lang.Long r7 = java.lang.Long.valueOf(r4)
            java.lang.String r7 = r6.format(r7)
            java.util.Date r6 = r6.parse(r7)
            java.util.Calendar r7 = java.util.Calendar.getInstance()
            r7.setTime(r6)
            r6 = 1
            int r6 = r7.get(r6)
            r8 = 5
            int r7 = r7.get(r8)
            java.lang.String r8 = ""
            if (r6 == r1) goto L_0x0066
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r9 = 2131837994(0x7f11442a, float:1.9309199E38)
            java.lang.String r1 = r1.getString(r9)
            java.lang.CharSequence r1 = android.text.format.DateFormat.format(r1, r4)
            java.lang.String r1 = r1.toString()
            r3.f126666f = r1
            r1 = r6
            goto L_0x0068
        L_0x0066:
            r3.f126666f = r8
        L_0x0068:
            if (r7 == r2) goto L_0x0081
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 2131837939(0x7f1143f3, float:1.9309087E38)
            java.lang.String r2 = r2.getString(r6)
            java.lang.CharSequence r2 = android.text.format.DateFormat.format(r2, r4)
            java.lang.String r2 = r2.toString()
            r3.f126667g = r2
            r2 = r7
            goto L_0x0008
        L_0x0081:
            r3.f126667g = r8
            goto L_0x0008
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.StatusAlbumUI.mo67424K():void");
    }

    public void dealContentView(View view) {
        C78315f0 f0Var;
        Class cls = C78315f0.class;
        Class cls2 = C77049b.class;
        C87412m.m108594g(view, "v");
        super.dealContentView(view);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((C77049b) C86312j.m106911c(cls2)).mo72352Rp(activity, new C45418c(cls, 9, true));
            C78315f0 f0Var2 = (C78315f0) ((C77049b) C86312j.m106911c(cls2)).Wi0(activity, 9, cls);
            if (f0Var2 != null) {
                try {
                    f0Var = (C78315f0) ((C99933h) C86312j.m106911c(C99933h.class)).mo84402PX(9, "TextStatusCardExposed");
                } catch (Throwable unused) {
                    f0Var = null;
                }
                f0Var2.f229428d = f0Var != null ? f0Var.f229428d : null;
            }
        }
        View findViewById = view.findViewById(C0966R.C0970id.iiq);
        C87412m.m108593f(findViewById, "v.findViewById(R.id.recycler_view)");
        WxRecyclerView wxRecyclerView = (WxRecyclerView) findViewById;
        this.f116884e = wxRecyclerView;
        wxRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        WxRecyclerAdapter wxRecyclerAdapter = new WxRecyclerAdapter(new StatusAlbumUI$buildItemConverts$1(this), this.f116885f, true);
        wxRecyclerAdapter.f165737C = new C53723v(wxRecyclerAdapter, this);
        WxRecyclerView wxRecyclerView2 = this.f116884e;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setAdapter(wxRecyclerAdapter);
            WxRecyclerView wxRecyclerView3 = this.f116884e;
            if (wxRecyclerView3 != null) {
                wxRecyclerView3.mo17085h0(new C53724w(this));
                View findViewById2 = view.findViewById(C0966R.C0970id.ivb);
                C87412m.m108593f(findViewById2, "v.findViewById(R.id.rl_layout)");
                RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) findViewById2;
                this.f116883d = refreshLoadMoreLayout;
                refreshLoadMoreLayout.setActionCallback(new C53725x(this, wxRecyclerAdapter));
                RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f116883d;
                if (refreshLoadMoreLayout2 != null) {
                    this.f116886g = new C39688b(wxRecyclerAdapter, refreshLoadMoreLayout2, (Context) null);
                    Log.m105924i("MicroMsg.TextStatus.StatusAlbumUI", "init OK");
                    return;
                }
                C87412m.m108603p("mRefreshLayout");
                throw null;
            }
            C87412m.m108603p("rvSelfHistory");
            throw null;
        }
        C87412m.m108603p("rvSelfHistory");
        throw null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c9x;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.f7545j9);
        setBackBtn(new C53722u(this));
        C86709a0.m107524d().mo123455a(5967, this);
    }

    public void onDestroy() {
        super.onDestroy();
        C39688b bVar = this.f116886g;
        if (bVar != null) {
            C86709a0.m107524d().mo123470p(4245, bVar.f106484i);
            C86709a0.m107524d().mo123470p(5967, this);
            return;
        }
        C87412m.m108603p("dataLoader");
        throw null;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C46919a) {
            boolean z = false;
            if (i == 0 && i2 == 0) {
                z = true;
            } else {
                Activity context = getContext();
                if (context != null) {
                    C76879j.m92748s(context, context.getString(C0966R.string.jzj), "");
                }
            }
            if (z) {
                Iterator<C9493c> it = this.f116885f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C9493c next = it.next();
                    if (next instanceof C47148a) {
                        C48201c cVar = ((C47148a) next).f126665e;
                        if (C87412m.m108589b(cVar != null ? cVar.field_StatusID : null, ((C46919a) yVar).f126144d)) {
                            this.f116885f.remove(next);
                            break;
                        }
                    }
                }
                mo67424K();
                WxRecyclerView wxRecyclerView = this.f116884e;
                if (wxRecyclerView != null) {
                    RecyclerView.C16613e adapter = wxRecyclerView.getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                    }
                } else {
                    C87412m.m108603p("rvSelfHistory");
                    throw null;
                }
            }
        }
        C89779i0 i0Var = this.f116889j;
        if (i0Var != null) {
            i0Var.dismiss();
        }
    }

    public void onVisibilityChanged(boolean z) {
        super.onVisibilityChanged(z);
        Log.m105924i("MicroMsg.TextStatus.StatusAlbumUI", "[onVisibilityChanged]" + z + ' ' + this.f116888i);
        if (z && !this.f116888i) {
            C39688b bVar = this.f116886g;
            if (bVar != null) {
                C86709a0.m107524d().mo123460f(new C46923f(bVar.f106481f, (Long) null, (Long) null, (Long) null, (Integer) null, 30, (C8480h) null));
                this.f116888i = true;
                return;
            }
            C87412m.m108603p("dataLoader");
            throw null;
        }
    }

    public void setUserVisibleHint(boolean z) {
        Class cls = C47904x.class;
        super.setUserVisibleHint(z);
        if (z) {
            C78501d.m94809k(C78501d.f229945a, 1, 0, (String) null, 6, (Object) null);
            ((C47904x) C86312j.m106911c(cls)).mo72669hl();
            ((C47904x) C86312j.m106911c(cls)).mo72665af();
            return;
        }
        ((C47904x) C86312j.m106911c(cls)).mo72666aw();
        ((C47904x) C86312j.m106911c(cls)).mo72660Dj();
    }

    public boolean supportNavigationSwipeBack() {
        return false;
    }
}
