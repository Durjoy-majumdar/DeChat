package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import az2.C39674e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.component.UIComponentFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32228q;
import fz2.C45870f;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import jq3.C60898l;
import jq3.C9493c;
import kotlin.Metadata;
import lz2.C46924g;
import nj3.C11184p0;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import p192l4.C10462b;
import pe3.C89349b;
import pz2.C47726a;
import pz2.C47727b;
import pz2.C47728c;
import pz2.C47729d;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rz2.C48201c;
import rz2.C48202d;
import rz2.C48203e;
import rz2.C48204f;
import rz2.C48205g;
import su0.C13781a;
import sx3.C64187h0;
import sx3.C77813z;
import uo3.C78253a;
import ux3.C65486b;
import uz2.C52710q1;
import uz2.C52730y1;
import uz2.C52732z0;
import vz2.C78501d;
import yz2.C53692k2;
import yz2.C53695l2;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0005\u0005\u0006\u0007\b\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment;", "Lcom/tencent/mm/ui/component/UIComponentFragment;", "Lcom/tencent/mm/sdk/storage/MStorage$IOnStorageChange;", "<init>", "()V", "a", "b", "c", "d", "e", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment */
public final class TextStatusLikeListFragment extends UIComponentFragment implements MStorage.IOnStorageChange {

    /* renamed from: x */
    public static final /* synthetic */ int f116937x = 0;

    /* renamed from: j */
    public RefreshLoadMoreLayout f116938j;

    /* renamed from: n */
    public WxRecyclerView f116939n;

    /* renamed from: o */
    public int f116940o;

    /* renamed from: p */
    public ArrayList<C9493c> f116941p = new ArrayList<>();

    /* renamed from: q */
    public C43215c f116942q;

    /* renamed from: r */
    public final int[] f116943r = new int[2];

    /* renamed from: s */
    public C45870f f116944s;

    /* renamed from: t */
    public final C13601g f116945t = C36568h.m40985a(new C43221f(this));

    /* renamed from: u */
    public int f116946u = -1;

    /* renamed from: v */
    public final C32228q<View, Integer, Long, Boolean> f116947v = new C43223h(this);

    /* renamed from: w */
    public final C11184p0 f116948w = new C43224i(this);

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment$a */
    public static final class C43213a extends C43215c {

        /* renamed from: b */
        public final RefreshLoadMoreLayout f116949b;

        /* renamed from: c */
        public Cursor f116950c;

        /* renamed from: d */
        public Cursor f116951d;

        /* renamed from: e */
        public C48202d f116952e;

        /* renamed from: f */
        public C48204f f116953f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43213a(WxRecyclerAdapter<C9493c> wxRecyclerAdapter, RefreshLoadMoreLayout refreshLoadMoreLayout) {
            super(wxRecyclerAdapter);
            C87412m.m108594g(wxRecyclerAdapter, "adapter");
            C87412m.m108594g(refreshLoadMoreLayout, "refreahLayout");
            this.f116949b = refreshLoadMoreLayout;
            C39674e eVar = C39674e.f106452d;
            ISQLiteDatabase iSQLiteDatabase = eVar.mo62246S().f129184d;
            String a = C13781a.m13082a();
            C87412m.m108593f(a, "username()");
            Cursor rawQuery = iSQLiteDatabase.rawQuery("select rowid, * from TextStatusLike where HashUserName != ? and DeleteInMsgList != 1 order by CreateTime DESC ", new String[]{a});
            C87412m.m108593f(rawQuery, "db.rawQuery(sql, arrayOf…ing>(Account.username()))");
            this.f116950c = rawQuery;
            ISQLiteDatabase iSQLiteDatabase2 = eVar.mo62249g0().f129187d;
            String a2 = C13781a.m13082a();
            C87412m.m108593f(a2, "username()");
            Cursor rawQuery2 = iSQLiteDatabase2.rawQuery("select rowid, * from TextStatusReference where UserName != ? and DeleteInMsgList != 1 order by CreateTime DESC ", new String[]{a2});
            C87412m.m108593f(rawQuery2, "db.rawQuery(sql, arrayOf…ing>(Account.username()))");
            this.f116951d = rawQuery2;
        }

        /* renamed from: a */
        public boolean mo67458a() {
            Cursor cursor = this.f116950c;
            if (cursor != null) {
                return (cursor.isAfterLast() ^ true) || (this.f116951d.isAfterLast() ^ true);
            }
            C87412m.m108603p("cursorLike");
            throw null;
        }

        /* JADX WARNING: type inference failed for: r5v0, types: [wz2.d, rz2.d] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00a2 A[EDGE_INSN: B:56:0x00a2->B:48:0x00a2 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo67459b() {
            /*
                r8 = this;
                android.database.Cursor r0 = r8.f116950c
                java.lang.String r1 = "cursorLike"
                r2 = 0
                if (r0 == 0) goto L_0x00ad
                android.database.Cursor r0 = r8.f116951d
                r3 = 0
                if (r0 == 0) goto L_0x00a2
                r0 = 0
            L_0x000d:
                r4 = 10
                if (r0 >= r4) goto L_0x00a2
                rz2.d r4 = r8.f116952e
                if (r4 != 0) goto L_0x0036
                android.database.Cursor r4 = r8.f116950c
                if (r4 == 0) goto L_0x0032
                boolean r4 = r4.moveToNext()
                if (r4 == 0) goto L_0x0036
                rz2.d r4 = new rz2.d
                r4.<init>()
                android.database.Cursor r5 = r8.f116950c
                if (r5 == 0) goto L_0x002e
                r4.convertFrom(r5)
                r8.f116952e = r4
                goto L_0x0036
            L_0x002e:
                gy3.C87412m.m108603p(r1)
                throw r2
            L_0x0032:
                gy3.C87412m.m108603p(r1)
                throw r2
            L_0x0036:
                rz2.f r4 = r8.f116953f
                if (r4 != 0) goto L_0x004e
                android.database.Cursor r4 = r8.f116951d
                boolean r4 = r4.moveToNext()
                if (r4 == 0) goto L_0x004e
                rz2.f r4 = new rz2.f
                r4.<init>()
                android.database.Cursor r5 = r8.f116951d
                r4.convertFrom(r5)
                r8.f116953f = r4
            L_0x004e:
                rz2.f r4 = r8.f116953f
                rz2.d r5 = r8.f116952e
                if (r5 == 0) goto L_0x0062
                if (r4 == 0) goto L_0x0062
                int r6 = r5.field_CreateTime
                int r7 = r4.field_CreateTime
                if (r6 <= r7) goto L_0x005f
                r8.f116952e = r2
                goto L_0x0068
            L_0x005f:
                r8.f116953f = r2
                goto L_0x0072
            L_0x0062:
                if (r5 == 0) goto L_0x006a
                if (r4 != 0) goto L_0x006a
                r8.f116952e = r2
            L_0x0068:
                r4 = r5
                goto L_0x0072
            L_0x006a:
                if (r5 != 0) goto L_0x0071
                if (r4 == 0) goto L_0x0071
                r8.f116953f = r2
                goto L_0x0072
            L_0x0071:
                r4 = r2
            L_0x0072:
                if (r4 != 0) goto L_0x0075
                goto L_0x00a2
            L_0x0075:
                boolean r5 = r4 instanceof rz2.C48202d
                if (r5 == 0) goto L_0x008a
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<jq3.c> r5 = r8.f116954a
                java.util.List r5 = r5.getData()
                pz2.b r6 = new pz2.b
                rz2.d r4 = (rz2.C48202d) r4
                r6.<init>(r4)
                r5.add(r6)
                goto L_0x009e
            L_0x008a:
                boolean r5 = r4 instanceof rz2.C48204f
                if (r5 == 0) goto L_0x00a2
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<jq3.c> r5 = r8.f116954a
                java.util.List r5 = r5.getData()
                pz2.d r6 = new pz2.d
                rz2.f r4 = (rz2.C48204f) r4
                r6.<init>(r4)
                r5.add(r6)
            L_0x009e:
                int r0 = r0 + 1
                goto L_0x000d
            L_0x00a2:
                com.tencent.mm.view.RefreshLoadMoreLayout r0 = r8.f116949b
                r0.mo82440F(r3)
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<jq3.c> r0 = r8.f116954a
                r0.notifyDataSetChanged()
                return
            L_0x00ad:
                gy3.C87412m.m108603p(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusLikeListFragment.C43213a.mo67459b():void");
        }

        /* renamed from: c */
        public void mo67460c() {
            Cursor cursor = this.f116950c;
            if (cursor != null) {
                cursor.close();
                Cursor cursor2 = this.f116951d;
                if (cursor2 != null) {
                    cursor2.close();
                    return;
                }
                return;
            }
            C87412m.m108603p("cursorLike");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment$b */
    public static final class C43214b {
        public C43214b(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment$c */
    public static abstract class C43215c {

        /* renamed from: a */
        public WxRecyclerAdapter<C9493c> f116954a;

        public C43215c(WxRecyclerAdapter<C9493c> wxRecyclerAdapter) {
            C87412m.m108594g(wxRecyclerAdapter, "adapter");
            this.f116954a = wxRecyclerAdapter;
        }

        /* renamed from: a */
        public abstract boolean mo67458a();

        /* renamed from: b */
        public abstract void mo67459b();

        /* renamed from: c */
        public abstract void mo67460c();
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment$d */
    public static final class C43216d extends C43215c {

        /* renamed from: b */
        public final String f116955b;

        /* renamed from: c */
        public final RefreshLoadMoreLayout f116956c;

        /* renamed from: d */
        public final C11385n f116957d;

        /* renamed from: e */
        public C89349b f116958e;

        /* renamed from: f */
        public boolean f116959f;

        /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment$d$a */
        public static final class C43217a implements C11385n {

            /* renamed from: d */
            public final /* synthetic */ C43216d f116960d;

            /* renamed from: e */
            public final /* synthetic */ WxRecyclerAdapter<C9493c> f116961e;

            /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment$d$a$a */
            public static final class C43218a<T> implements Comparator {
                public final int compare(T t, T t2) {
                    int i = 0;
                    Integer valueOf = Integer.valueOf(t2 instanceof C52710q1 ? ((C52710q1) t2).f147192h : t2 instanceof C52730y1 ? ((C52730y1) t2).f147302e : 0);
                    if (t instanceof C52710q1) {
                        i = ((C52710q1) t).f147192h;
                    } else if (t instanceof C52730y1) {
                        i = ((C52730y1) t).f147302e;
                    }
                    return C65486b.m77169a(valueOf, Integer.valueOf(i));
                }
            }

            public C43217a(C43216d dVar, WxRecyclerAdapter<C9493c> wxRecyclerAdapter) {
                this.f116960d = dVar;
                this.f116961e = wxRecyclerAdapter;
            }

            public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
                C52732z0 z0Var;
                C87412m.m108594g(yVar, "netSceneBase");
                if (i == 0 && i2 == 0 && (z0Var = ((C46924g) yVar).f126163f) != null) {
                    C43216d dVar = this.f116960d;
                    WxRecyclerAdapter<C9493c> wxRecyclerAdapter = this.f116961e;
                    dVar.f116958e = z0Var.f147308e;
                    dVar.f116959f = z0Var.f147309f;
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(z0Var.f147307d);
                    arrayList.addAll(z0Var.f147310g);
                    if (arrayList.size() > 1) {
                        C77813z.m93909o(arrayList, new C43218a());
                    }
                    for (Object next : arrayList) {
                        if (next instanceof C52710q1) {
                            wxRecyclerAdapter.getData().add(new C47726a(dVar.f116955b, (C52710q1) next));
                        } else if (next instanceof C52730y1) {
                            wxRecyclerAdapter.getData().add(new C47728c(dVar.f116955b, (C52730y1) next));
                        }
                    }
                    wxRecyclerAdapter.notifyDataSetChanged();
                }
                this.f116960d.f116956c.mo82440F(0);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43216d(String str, WxRecyclerAdapter<C9493c> wxRecyclerAdapter, RefreshLoadMoreLayout refreshLoadMoreLayout) {
            super(wxRecyclerAdapter);
            C87412m.m108594g(str, "statusID");
            C87412m.m108594g(wxRecyclerAdapter, "adapter");
            C87412m.m108594g(refreshLoadMoreLayout, "refreahLayout");
            this.f116955b = str;
            this.f116956c = refreshLoadMoreLayout;
            C43217a aVar = new C43217a(this, wxRecyclerAdapter);
            this.f116957d = aVar;
            C86709a0.m107524d().mo123455a(6621, aVar);
        }

        /* renamed from: a */
        public boolean mo67458a() {
            return this.f116959f;
        }

        /* renamed from: b */
        public void mo67459b() {
            C86709a0.m107524d().mo123460f(new C46924g(this.f116955b, this.f116958e));
        }

        /* renamed from: c */
        public void mo67460c() {
            C86709a0.m107524d().mo123470p(6621, this.f116957d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment$e */
    public static final class C43219e extends C43215c {

        /* renamed from: b */
        public final RefreshLoadMoreLayout f116962b;

        /* renamed from: c */
        public Cursor f116963c;

        /* renamed from: d */
        public Cursor f116964d;

        /* renamed from: e */
        public C48202d f116965e;

        /* renamed from: f */
        public C48204f f116966f;

        /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment$e$a */
        public static final class C43220a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C43219e f116967d;

            /* renamed from: e */
            public final /* synthetic */ WxRecyclerAdapter<C9493c> f116968e;

            /* renamed from: f */
            public final /* synthetic */ C60898l.C60899a f116969f;

            public C43220a(C43219e eVar, WxRecyclerAdapter<C9493c> wxRecyclerAdapter, C60898l.C60899a aVar) {
                this.f116967d = eVar;
                this.f116968e = wxRecyclerAdapter;
                this.f116969f = aVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment$NotificationMsgLoader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C43219e eVar = this.f116967d;
                eVar.f116963c.close();
                C39674e eVar2 = C39674e.f106452d;
                ISQLiteDatabase iSQLiteDatabase = eVar2.mo62246S().f129184d;
                String a = C13781a.m13082a();
                C87412m.m108593f(a, "username()");
                Cursor rawQuery = iSQLiteDatabase.rawQuery("select rowid, * from TextStatusLike where Read = 1 and HashUserName != ? and DeleteInMsgList != 1 order by CreateTime DESC ", new String[]{a});
                C87412m.m108593f(rawQuery, "db.rawQuery(sql, arrayOf…ing>(Account.username()))");
                eVar.f116963c = rawQuery;
                eVar.f116964d.close();
                ISQLiteDatabase iSQLiteDatabase2 = eVar2.mo62249g0().f129187d;
                String a2 = C13781a.m13082a();
                C87412m.m108593f(a2, "username()");
                Cursor rawQuery2 = iSQLiteDatabase2.rawQuery("select rowid, * from TextStatusReference where Read = 1 and UserName != ? and DeleteInMsgList != 1 order by CreateTime DESC ", new String[]{a2});
                C87412m.m108593f(rawQuery2, "db.rawQuery(sql, arrayOf…ing>(Account.username()))");
                eVar.f116964d = rawQuery2;
                String str = null;
                eVar.f116965e = null;
                eVar.f116966f = null;
                C60898l.m71331i6(this.f116968e, this.f116969f.getItemId(), false, 2, (Object) null);
                this.f116967d.mo67459b();
                C78501d dVar = C78501d.f229945a;
                int i = TextStatusLikeListFragment.f116937x;
                C48201c kD = eVar2.mo62255t0().mo72970kD(C13781a.m13082a());
                if (kD != null) {
                    str = kD.field_StatusID;
                }
                C78501d.m94805g(dVar, 11, (String) null, (String) null, 0, str == null ? "" : str, 0, 46, (Object) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment$NotificationMsgLoader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43219e(WxRecyclerAdapter<C9493c> wxRecyclerAdapter, RefreshLoadMoreLayout refreshLoadMoreLayout) {
            super(wxRecyclerAdapter);
            C87412m.m108594g(wxRecyclerAdapter, "adapter");
            C87412m.m108594g(refreshLoadMoreLayout, "refreahLayout");
            this.f116962b = refreshLoadMoreLayout;
            C39674e eVar = C39674e.f106452d;
            ISQLiteDatabase iSQLiteDatabase = eVar.mo62246S().f129184d;
            String a = C13781a.m13082a();
            C87412m.m108593f(a, "username()");
            int i = 0;
            Cursor rawQuery = iSQLiteDatabase.rawQuery("select rowid, * from TextStatusLike where Read != 1 and HashUserName != ? and DeleteInMsgList != 1 order by CreateTime DESC ", new String[]{a});
            C87412m.m108593f(rawQuery, "db.rawQuery(sql, arrayOf…ing>(Account.username()))");
            this.f116963c = rawQuery;
            ISQLiteDatabase iSQLiteDatabase2 = eVar.mo62249g0().f129187d;
            String a2 = C13781a.m13082a();
            C87412m.m108593f(a2, "username()");
            Cursor rawQuery2 = iSQLiteDatabase2.rawQuery("select rowid, * from TextStatusReference where Read != 1 and UserName != ? and DeleteInMsgList != 1 order by CreateTime DESC ", new String[]{a2});
            C87412m.m108593f(rawQuery2, "db.rawQuery(sql, arrayOf…ing>(Account.username()))");
            this.f116964d = rawQuery2;
            View inflate = C85868k2.m106137b(wxRecyclerAdapter.mo85797d6().getContext()).inflate(C0966R.C0971layout.c9e, wxRecyclerAdapter.mo85797d6(), false);
            ((TextView) inflate.findViewById(C0966R.C0970id.ed4)).setText(C0966R.string.fep);
            ISQLiteDatabase iSQLiteDatabase3 = eVar.mo62246S().f129184d;
            String a3 = C13781a.m13082a();
            C87412m.m108593f(a3, "username()");
            Cursor rawQuery3 = iSQLiteDatabase3.rawQuery("select count(rowid) from TextStatusLike where Read = 1 and HashUserName != ? ", new String[]{a3});
            C87412m.m108593f(rawQuery3, "db.rawQuery(sql, arrayOf…ing>(Account.username()))");
            int i2 = rawQuery3.moveToFirst() ? rawQuery3.getInt(0) : 0;
            rawQuery3.close();
            ISQLiteDatabase iSQLiteDatabase4 = eVar.mo62249g0().f129187d;
            String a4 = C13781a.m13082a();
            C87412m.m108593f(a4, "username()");
            Cursor rawQuery4 = iSQLiteDatabase4.rawQuery("select count(rowid) from TextStatusReference where Read = 1 and UserName != ? ", new String[]{a4});
            C87412m.m108593f(rawQuery4, "db.rawQuery(sql, arrayOf…ing>(Account.username()))");
            i = rawQuery4.moveToFirst() ? rawQuery4.getInt(0) : i;
            rawQuery4.close();
            if (i2 + i > 0) {
                inflate.setOnClickListener(new C43220a(this, wxRecyclerAdapter, C60898l.m71327S5(wxRecyclerAdapter, inflate, Integer.MAX_VALUE, false, 4, (Object) null)));
            }
        }

        /* renamed from: a */
        public boolean mo67458a() {
            return (this.f116963c.isAfterLast() ^ true) || (this.f116964d.isAfterLast() ^ true);
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [wz2.d, rz2.d] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0093 A[EDGE_INSN: B:43:0x0093->B:40:0x0093 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo67459b() {
            /*
                r7 = this;
                android.database.Cursor r0 = r7.f116963c
                r1 = 0
                if (r0 == 0) goto L_0x0093
                android.database.Cursor r0 = r7.f116964d
                if (r0 == 0) goto L_0x0093
                r0 = 0
            L_0x000a:
                r2 = 10
                if (r0 >= r2) goto L_0x0093
                rz2.d r2 = r7.f116965e
                if (r2 != 0) goto L_0x0026
                android.database.Cursor r2 = r7.f116963c
                boolean r2 = r2.moveToNext()
                if (r2 == 0) goto L_0x0026
                rz2.d r2 = new rz2.d
                r2.<init>()
                android.database.Cursor r3 = r7.f116963c
                r2.convertFrom(r3)
                r7.f116965e = r2
            L_0x0026:
                rz2.f r2 = r7.f116966f
                if (r2 != 0) goto L_0x003e
                android.database.Cursor r2 = r7.f116964d
                boolean r2 = r2.moveToNext()
                if (r2 == 0) goto L_0x003e
                rz2.f r2 = new rz2.f
                r2.<init>()
                android.database.Cursor r3 = r7.f116964d
                r2.convertFrom(r3)
                r7.f116966f = r2
            L_0x003e:
                rz2.f r2 = r7.f116966f
                rz2.d r3 = r7.f116965e
                r4 = 0
                if (r3 == 0) goto L_0x0053
                if (r2 == 0) goto L_0x0053
                int r5 = r3.field_CreateTime
                int r6 = r2.field_CreateTime
                if (r5 <= r6) goto L_0x0050
                r7.f116965e = r4
                goto L_0x0059
            L_0x0050:
                r7.f116966f = r4
                goto L_0x0063
            L_0x0053:
                if (r3 == 0) goto L_0x005b
                if (r2 != 0) goto L_0x005b
                r7.f116965e = r4
            L_0x0059:
                r2 = r3
                goto L_0x0063
            L_0x005b:
                if (r3 != 0) goto L_0x0062
                if (r2 == 0) goto L_0x0062
                r7.f116966f = r4
                goto L_0x0063
            L_0x0062:
                r2 = r4
            L_0x0063:
                if (r2 != 0) goto L_0x0066
                goto L_0x0093
            L_0x0066:
                boolean r3 = r2 instanceof rz2.C48202d
                if (r3 == 0) goto L_0x007b
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<jq3.c> r3 = r7.f116954a
                java.util.List r3 = r3.getData()
                pz2.b r4 = new pz2.b
                rz2.d r2 = (rz2.C48202d) r2
                r4.<init>(r2)
                r3.add(r4)
                goto L_0x008f
            L_0x007b:
                boolean r3 = r2 instanceof rz2.C48204f
                if (r3 == 0) goto L_0x0093
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<jq3.c> r3 = r7.f116954a
                java.util.List r3 = r3.getData()
                pz2.d r4 = new pz2.d
                rz2.f r2 = (rz2.C48204f) r2
                r4.<init>(r2)
                r3.add(r4)
            L_0x008f:
                int r0 = r0 + 1
                goto L_0x000a
            L_0x0093:
                com.tencent.mm.view.RefreshLoadMoreLayout r0 = r7.f116962b
                r0.mo82440F(r1)
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<jq3.c> r0 = r7.f116954a
                r0.notifyDataSetChanged()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusLikeListFragment.C43219e.mo67459b():void");
        }

        /* renamed from: c */
        public void mo67460c() {
            Cursor cursor = this.f116963c;
            if (cursor != null) {
                cursor.close();
            }
            Cursor cursor2 = this.f116964d;
            if (cursor2 != null) {
                cursor2.close();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment$f */
    public static final class C43221f extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusLikeListFragment f116970d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43221f(TextStatusLikeListFragment textStatusLikeListFragment) {
            super(0);
            this.f116970d = textStatusLikeListFragment;
        }

        public Object invoke() {
            C45870f fVar = this.f116970d.f116944s;
            if (fVar != null) {
                return fVar.f123826a;
            }
            C87412m.m108603p("uiBinding");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment$g */
    public static final class C43222g extends RecyclerView.C16615g {

        /* renamed from: a */
        public final /* synthetic */ TextStatusLikeListFragment f116971a;

        public C43222g(TextStatusLikeListFragment textStatusLikeListFragment) {
            this.f116971a = textStatusLikeListFragment;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [android.content.Context] */
        /* JADX WARNING: type inference failed for: r0v3, types: [android.content.Context] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2556b() {
            /*
                r14 = this;
                com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment r0 = r14.f116971a
                java.util.ArrayList<jq3.c> r1 = r0.f116941p
                boolean r1 = r1.isEmpty()
                java.lang.String r2 = "<get-emptyTip>(...)"
                r3 = 0
                r4 = 0
                if (r1 == 0) goto L_0x006a
                rx3.g r1 = r0.f116945t
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                gy3.C87412m.m108593f(r1, r2)
                android.view.View r1 = (android.view.View) r1
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                r2.mo10233c(r5)
                java.lang.Object[] r6 = r2.mo10232b()
                java.lang.String r7 = "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment"
                java.lang.String r8 = "checkEmpty"
                java.lang.String r9 = "()V"
                java.lang.String r10 = "android/view/View_EXEC_"
                java.lang.String r11 = "setVisibility"
                java.lang.String r12 = "(I)V"
                r5 = r1
                j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
                java.lang.Object r2 = r2.mo10231a(r4)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r6 = "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment"
                java.lang.String r7 = "checkEmpty"
                java.lang.String r8 = "()V"
                java.lang.String r9 = "android/view/View_EXEC_"
                java.lang.String r10 = "setVisibility"
                java.lang.String r11 = "(I)V"
                j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
                android.content.Context r0 = r0.getContext()
                boolean r1 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity
                if (r1 == 0) goto L_0x0064
                r3 = r0
                com.tencent.mm.ui.MMActivity r3 = (com.tencent.p014mm.p136ui.MMActivity) r3
            L_0x0064:
                if (r3 == 0) goto L_0x00c8
                r3.enableOptionMenu(r4)
                goto L_0x00c8
            L_0x006a:
                rx3.g r1 = r0.f116945t
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                gy3.C87412m.m108593f(r1, r2)
                android.view.View r1 = (android.view.View) r1
                r2 = 8
                k20.a r13 = new k20.a
                r13.<init>()
                java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r13.mo10233c(r2)
                java.lang.Object[] r6 = r13.mo10232b()
                java.lang.String r7 = "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment"
                java.lang.String r8 = "checkEmpty"
                java.lang.String r9 = "()V"
                java.lang.String r10 = "android/view/View_EXEC_"
                java.lang.String r11 = "setVisibility"
                java.lang.String r12 = "(I)V"
                r5 = r1
                j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
                java.lang.Object r2 = r13.mo10231a(r4)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r6 = "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment"
                java.lang.String r7 = "checkEmpty"
                java.lang.String r8 = "()V"
                java.lang.String r9 = "android/view/View_EXEC_"
                java.lang.String r10 = "setVisibility"
                java.lang.String r11 = "(I)V"
                j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
                android.content.Context r0 = r0.getContext()
                boolean r1 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity
                if (r1 == 0) goto L_0x00c2
                r3 = r0
                com.tencent.mm.ui.MMActivity r3 = (com.tencent.p014mm.p136ui.MMActivity) r3
            L_0x00c2:
                if (r3 == 0) goto L_0x00c8
                r0 = 1
                r3.enableOptionMenu(r0)
            L_0x00c8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusLikeListFragment.C43222g.mo2556b():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment$h */
    public static final class C43223h extends C87413o implements C32228q<View, Integer, Long, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusLikeListFragment f116972d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43223h(TextStatusLikeListFragment textStatusLikeListFragment) {
            super(3);
            this.f116972d = textStatusLikeListFragment;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str;
            View view = (View) obj;
            int intValue = ((Number) obj2).intValue();
            ((Number) obj3).longValue();
            C87412m.m108594g(view, "view");
            C78501d dVar = C78501d.f229945a;
            int i = TextStatusLikeListFragment.f116937x;
            C48201c kD = C39674e.f106452d.mo62255t0().mo72970kD(C13781a.m13082a());
            if (kD == null || (str = kD.field_StatusID) == null) {
                str = "";
            }
            C78501d.m94805g(dVar, 22, (String) null, (String) null, 0, str, 0, 46, (Object) null);
            TextStatusLikeListFragment textStatusLikeListFragment = this.f116972d;
            textStatusLikeListFragment.f116946u = intValue;
            C78253a aVar = new C78253a(textStatusLikeListFragment.getContext());
            TextStatusLikeListFragment textStatusLikeListFragment2 = this.f116972d;
            aVar.f229227C = new C43245g(textStatusLikeListFragment2);
            C11184p0 p0Var = textStatusLikeListFragment2.f116948w;
            int[] iArr = textStatusLikeListFragment2.f116943r;
            aVar.mo108272g(view, intValue, 0, textStatusLikeListFragment2, p0Var, iArr[0], iArr[1]);
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment$i */
    public static final class C43224i implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ TextStatusLikeListFragment f116973d;

        public C43224i(TextStatusLikeListFragment textStatusLikeListFragment) {
            this.f116973d = textStatusLikeListFragment;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            String str;
            if (menuItem.getItemId() == 0) {
                C78501d dVar = C78501d.f229945a;
                int i2 = TextStatusLikeListFragment.f116937x;
                C39674e eVar = C39674e.f106452d;
                C48201c kD = eVar.mo62255t0().mo72970kD(C13781a.m13082a());
                if (kD == null || (str = kD.field_StatusID) == null) {
                    str = "";
                }
                C78501d.m94805g(dVar, 23, (String) null, (String) null, 0, str, 0, 46, (Object) null);
                TextStatusLikeListFragment textStatusLikeListFragment = this.f116973d;
                C9493c cVar = textStatusLikeListFragment.f116941p.get(textStatusLikeListFragment.f116946u);
                C87412m.m108593f(cVar, "dataList[longClickPos]");
                C9493c cVar2 = cVar;
                TextStatusLikeListFragment textStatusLikeListFragment2 = this.f116973d;
                textStatusLikeListFragment2.f116941p.remove(textStatusLikeListFragment2.f116946u);
                WxRecyclerView wxRecyclerView = this.f116973d.f116939n;
                if (wxRecyclerView != null) {
                    RecyclerView.C16613e adapter = wxRecyclerView.getAdapter();
                    if (adapter != null) {
                        adapter.notifyItemRemoved(this.f116973d.f116946u);
                    }
                    if (cVar2 instanceof C47727b) {
                        C47727b bVar = (C47727b) cVar2;
                        bVar.f128236d.field_DeleteInMsgList = 1;
                        eVar.mo62246S().update(bVar.f128236d, new String[0]);
                    } else if (cVar2 instanceof C47729d) {
                        C47729d dVar2 = (C47729d) cVar2;
                        dVar2.f128238d.field_DeleteInMsgList = 1;
                        eVar.mo62249g0().delete(dVar2.f128238d, new String[0]);
                    }
                } else {
                    C87412m.m108603p("rvLikeList");
                    throw null;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment$j */
    public static final class C43225j extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public final /* synthetic */ TextStatusLikeListFragment f116974a;

        /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment$j$a */
        public static final class C43226a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ TextStatusLikeListFragment f116975d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43226a(TextStatusLikeListFragment textStatusLikeListFragment) {
                super(0);
                this.f116975d = textStatusLikeListFragment;
            }

            public Object invoke() {
                C43215c cVar = this.f116975d.f116942q;
                if (cVar != null) {
                    cVar.mo67459b();
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("dataLoader");
                throw null;
            }
        }

        public C43225j(TextStatusLikeListFragment textStatusLikeListFragment) {
            this.f116974a = textStatusLikeListFragment;
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            C61926c.m72668M(new C43226a(this.f116974a));
        }

        /* renamed from: c */
        public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            C43215c cVar2 = this.f116974a.f116942q;
            if (cVar2 == null) {
                C87412m.m108603p("dataLoader");
                throw null;
            } else if (!cVar2.mo67458a()) {
                RefreshLoadMoreLayout refreshLoadMoreLayout = this.f116974a.f116938j;
                if (refreshLoadMoreLayout != null) {
                    RefreshLoadMoreLayout.m66896C(refreshLoadMoreLayout, (RefreshLoadMoreLayout.C7080c) null, 1, (Object) null);
                } else {
                    C87412m.m108603p("mRefreshLayout");
                    throw null;
                }
            }
        }
    }

    static {
        new C43214b((C8480h) null);
    }

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C64187h0.f181908d;
    }

    /* renamed from: O */
    public void mo2202O() {
        C117292a.m165355a("com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V", this);
        super.mo2202O();
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V");
    }

    /* renamed from: P */
    public void mo3550P() {
        C117292a.m165355a("com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V", this);
        super.mo3550P();
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V");
    }

    /* renamed from: R */
    public final void mo67456R() {
        String str;
        this.f116941p.clear();
        WxRecyclerAdapter wxRecyclerAdapter = new WxRecyclerAdapter(new TextStatusLikeListFragment$buildItemConverts$1(this.f116940o == 0 ? 4 : 3, this), this.f116941p, false);
        WxRecyclerView wxRecyclerView = this.f116939n;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter(wxRecyclerAdapter);
            wxRecyclerAdapter.registerAdapterDataObserver(new C43222g(this));
            int i = this.f116940o;
            if (i == 0) {
                Bundle arguments = getArguments();
                if (arguments == null || (str = arguments.getString("status_id")) == null) {
                    str = "";
                }
                RefreshLoadMoreLayout refreshLoadMoreLayout = this.f116938j;
                if (refreshLoadMoreLayout != null) {
                    C43216d dVar = new C43216d(str, wxRecyclerAdapter, refreshLoadMoreLayout);
                    this.f116942q = dVar;
                    dVar.mo67459b();
                    return;
                }
                C87412m.m108603p("mRefreshLayout");
                throw null;
            } else if (i == 1) {
                RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f116938j;
                if (refreshLoadMoreLayout2 != null) {
                    C43219e eVar = new C43219e(wxRecyclerAdapter, refreshLoadMoreLayout2);
                    this.f116942q = eVar;
                    eVar.mo67459b();
                    RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f116938j;
                    if (refreshLoadMoreLayout3 != null) {
                        refreshLoadMoreLayout3.setEnableRefresh(false);
                    } else {
                        C87412m.m108603p("mRefreshLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mRefreshLayout");
                    throw null;
                }
            } else if (i == 2 || i == 3) {
                RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f116938j;
                if (refreshLoadMoreLayout4 != null) {
                    C43213a aVar = new C43213a(wxRecyclerAdapter, refreshLoadMoreLayout4);
                    this.f116942q = aVar;
                    aVar.mo67459b();
                    RefreshLoadMoreLayout refreshLoadMoreLayout5 = this.f116938j;
                    if (refreshLoadMoreLayout5 != null) {
                        refreshLoadMoreLayout5.setEnableRefresh(false);
                    } else {
                        C87412m.m108603p("mRefreshLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mRefreshLayout");
                    throw null;
                }
            }
        } else {
            C87412m.m108603p("rvLikeList");
            throw null;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c9d;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C87412m.m108594g(contextMenu, "menu");
        C87412m.m108594g(view, "v");
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 0, 0, getString(C0966R.string.f7944x1));
    }

    public void onDestroy() {
        super.onDestroy();
        C43215c cVar = this.f116942q;
        if (cVar != null) {
            cVar.mo67460c();
        } else {
            C87412m.m108603p("dataLoader");
            throw null;
        }
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        Log.m105918d("MicroMsg.TextStatus.TextStatusLikeListActivity", "onNotifyChange() called with: event = " + str + ", eventData = " + mStorageEventData);
        mo67456R();
    }

    public void onPause() {
        String str;
        super.onPause();
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("status_id")) == null) {
            str = "";
        }
        C39674e eVar = C39674e.f106452d;
        C48203e S = eVar.mo62246S();
        S.getClass();
        boolean z = false;
        if (C112551y.m153811k(str)) {
            S.f129184d.execSQL("TextStatusLike", "update TextStatusLike set Read = 1 where Read != 1 ");
        } else {
            S.f129184d.execSQL("TextStatusLike", "update " + "TextStatusLike" + " set Read = 1 where Read != 1 and TextStatusId = '" + str + '\'');
        }
        C48205g g0 = eVar.mo62249g0();
        g0.getClass();
        if (C112551y.m153811k(str)) {
            z = true;
        }
        if (z) {
            g0.f129187d.execSQL("TextStatusReference", "update TextStatusReference set Read = 1 where Read != 1 ");
        } else {
            g0.f129187d.execSQL("TextStatusReference", "update " + "TextStatusReference" + " set Read = 1 where Read != 1 and TextStatusId = '" + str + '\'');
        }
        eVar.mo62246S().remove(this);
        eVar.mo62249g0().remove(this);
    }

    public void onResume() {
        super.onResume();
        C39674e eVar = C39674e.f106452d;
        eVar.mo62246S().add(this);
        eVar.mo62249g0().add(this);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        View findViewById = view.findViewById(C0966R.C0970id.mht);
        int i = C0966R.C0970id.cj7;
        TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.cj7);
        if (textView != null) {
            WxRecyclerView wxRecyclerView = (WxRecyclerView) C10462b.m10395a(findViewById, C0966R.C0970id.iiq);
            if (wxRecyclerView != null) {
                RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) C10462b.m10395a(findViewById, C0966R.C0970id.ivb);
                if (refreshLoadMoreLayout != null) {
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById;
                    this.f116944s = new C45870f(coordinatorLayout, textView, wxRecyclerView, refreshLoadMoreLayout, coordinatorLayout);
                    super.onViewCreated(view, bundle);
                    Bundle arguments = getArguments();
                    this.f116940o = arguments != null ? arguments.getInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0) : 0;
                    View findViewById2 = view.findViewById(C0966R.C0970id.ivb);
                    C87412m.m108593f(findViewById2, "view.findViewById(R.id.rl_layout)");
                    RefreshLoadMoreLayout refreshLoadMoreLayout2 = (RefreshLoadMoreLayout) findViewById2;
                    this.f116938j = refreshLoadMoreLayout2;
                    refreshLoadMoreLayout2.setActionCallback(new C43225j(this));
                    View findViewById3 = view.findViewById(C0966R.C0970id.iiq);
                    C87412m.m108593f(findViewById3, "view.findViewById(R.id.recycler_view)");
                    WxRecyclerView wxRecyclerView2 = (WxRecyclerView) findViewById3;
                    this.f116939n = wxRecyclerView2;
                    wxRecyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                    mo67456R();
                    int i2 = this.f116940o;
                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                        if (this.f116941p.size() > 0) {
                            Context context = getContext();
                            MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
                            if (mMActivity != null) {
                                mMActivity.addTextOptionMenu(0, getString(C0966R.string.f7930wk), new C53692k2(this));
                            }
                        }
                        WxRecyclerView wxRecyclerView3 = this.f116939n;
                        if (wxRecyclerView3 != null) {
                            wxRecyclerView3.mo17092j0(new C53695l2(this));
                            return;
                        } else {
                            C87412m.m108603p("rvLikeList");
                            throw null;
                        }
                    } else {
                        return;
                    }
                } else {
                    i = C0966R.C0970id.ivb;
                }
            } else {
                i = C0966R.C0970id.iiq;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
    }
}
