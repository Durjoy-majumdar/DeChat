package com.tencent.p014mm.plugin.finder.view;

import android.content.Intent;
import android.view.View;
import cm1.C55033u;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderCommentUI;
import com.tencent.p014mm.plugin.finder.presenter.contract.CommentDrawerContract;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.FinderCommentDrawer;
import di3.C86312j;
import er1.C58684b;
import er1.C58739j4;
import er1.C58784w3;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import rs1.C13442s8;
import rx3.C13604l;
import up1.C37521f;
import up1.C65426w0;

/* renamed from: com.tencent.mm.plugin.finder.view.e1 */
public final class C56597e1 {

    /* renamed from: i */
    public static final C56598a f162252i = new C56598a((C8480h) null);

    /* renamed from: j */
    public static final ConcurrentHashMap<Long, C13604l<C56598a.C30026a, C56598a.C56599b>> f162253j = new ConcurrentHashMap<>();

    /* renamed from: k */
    public static final ConcurrentHashMap<Long, C56598a.C30027c> f162254k = new ConcurrentHashMap<>();

    /* renamed from: a */
    public FinderCommentDrawer f162255a;

    /* renamed from: b */
    public MMFragmentActivity f162256b;

    /* renamed from: c */
    public final C56598a.C30026a f162257c;

    /* renamed from: d */
    public C56598a.C56599b f162258d;

    /* renamed from: e */
    public CommentDrawerContract.CloseDrawerCallback f162259e;

    /* renamed from: f */
    public boolean f162260f;

    /* renamed from: g */
    public long f162261g;

    /* renamed from: h */
    public int f162262h;

    /* renamed from: com.tencent.mm.plugin.finder.view.e1$a */
    public static final class C56598a {

        /* renamed from: com.tencent.mm.plugin.finder.view.e1$a$a */
        public static final class C30026a {

            /* renamed from: a */
            public final int f81264a;

            /* renamed from: b */
            public final boolean f81265b;

            public C30026a(int i, boolean z) {
                this.f81264a = i;
                this.f81265b = z;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C30026a)) {
                    return false;
                }
                C30026a aVar = (C30026a) obj;
                return this.f81264a == aVar.f81264a && this.f81265b == aVar.f81265b;
            }

            public int hashCode() {
                int i = this.f81264a * 31;
                boolean z = this.f81265b;
                if (z) {
                    z = true;
                }
                return i + (z ? 1 : 0);
            }

            public String toString() {
                return "DrawerCreateData(scene=" + this.f81264a + ", safeMode=" + this.f81265b + ')';
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.view.e1$a$c */
        public static final class C30027c {

            /* renamed from: a */
            public final int f81266a;

            /* renamed from: b */
            public final List<C55033u> f81267b;

            public C30027c(int i, List<? extends C55033u> list) {
                C87412m.m108594g(list, "data");
                this.f81266a = i;
                this.f81267b = list;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C30027c)) {
                    return false;
                }
                C30027c cVar = (C30027c) obj;
                return this.f81266a == cVar.f81266a && C87412m.m108589b(this.f81267b, cVar.f81267b);
            }

            public int hashCode() {
                return (this.f81266a * 31) + this.f81267b.hashCode();
            }

            public String toString() {
                return "DrawerResultData(commentCount=" + this.f81266a + ", data=" + this.f81267b + ')';
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.view.e1$a$b */
        public static final class C56599b {

            /* renamed from: a */
            public final FinderItem f162263a;

            /* renamed from: b */
            public final boolean f162264b;

            /* renamed from: c */
            public final long f162265c;

            /* renamed from: d */
            public final boolean f162266d;

            /* renamed from: e */
            public final boolean f162267e;

            /* renamed from: f */
            public final C65426w0 f162268f;

            public C56599b(FinderItem finderItem, boolean z, long j, boolean z2, boolean z3, C65426w0 w0Var) {
                C87412m.m108594g(finderItem, "feedObj");
                this.f162263a = finderItem;
                this.f162264b = z;
                this.f162265c = j;
                this.f162266d = z2;
                this.f162267e = z3;
                this.f162268f = w0Var;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C56599b)) {
                    return false;
                }
                C56599b bVar = (C56599b) obj;
                return C87412m.m108589b(this.f162263a, bVar.f162263a) && this.f162264b == bVar.f162264b && this.f162265c == bVar.f162265c && this.f162266d == bVar.f162266d && this.f162267e == bVar.f162267e && C87412m.m108589b(this.f162268f, bVar.f162268f);
            }

            public int hashCode() {
                int hashCode = this.f162263a.hashCode() * 31;
                boolean z = this.f162264b;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                long j = this.f162265c;
                int i = (((hashCode + (z ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
                boolean z3 = this.f162266d;
                if (z3) {
                    z3 = true;
                }
                int i2 = (i + (z3 ? 1 : 0)) * 31;
                boolean z4 = this.f162267e;
                if (!z4) {
                    z2 = z4;
                }
                int i3 = (i2 + (z2 ? 1 : 0)) * 31;
                C65426w0 w0Var = this.f162268f;
                return i3 + (w0Var == null ? 0 : w0Var.hashCode());
            }

            public String toString() {
                return "DrawerOpenData(feedObj=" + this.f162263a + ", isSingleMode=" + this.f162264b + ", refCommentId=" + this.f162265c + ", blinkRefComment=" + this.f162266d + ", showFooter=" + this.f162267e + ", replyCommentObj=" + this.f162268f + ')';
            }
        }

        public C56598a(C8480h hVar) {
        }

        /* renamed from: a */
        public static C56597e1 m65270a(C56598a aVar, long j, int i, MMFragmentActivity mMFragmentActivity, int i2, int i3, boolean z, int i4, Object obj) {
            boolean z2 = (i4 & 32) != 0 ? false : z;
            aVar.getClass();
            C87412m.m108594g(mMFragmentActivity, "context");
            C56597e1 e1Var = new C56597e1(i2, z2, (CommentDrawerContract.CloseDrawerCallback) null, 4, (C8480h) null);
            e1Var.f162261g = j;
            e1Var.f162262h = i;
            e1Var.f162256b = mMFragmentActivity;
            e1Var.f162255a = null;
            e1Var.f162260f = true;
            return e1Var;
        }

        /* renamed from: b */
        public final C56597e1 mo79927b(MMFragmentActivity mMFragmentActivity, View view, int i, boolean z, int i2) {
            C87412m.m108594g(mMFragmentActivity, "context");
            View view2 = view;
            C87412m.m108594g(view, "parent");
            mMFragmentActivity.getWindow().setSoftInputMode(50);
            C56597e1 e1Var = new C56597e1(i, z, (CommentDrawerContract.CloseDrawerCallback) null, 4, (C8480h) null);
            e1Var.f162256b = mMFragmentActivity;
            C37521f.f99374d.getClass();
            if (C37521f.f99288T0.mo60266n().intValue() == 1) {
                e1Var.f162255a = null;
            } else {
                e1Var.f162255a = FinderCommentDrawer.C56551b.m65197a(FinderCommentDrawer.f162026V, mMFragmentActivity, view, i, (FinderCommentDrawer.C56550a) null, z, false, i2, 8, (Object) null);
            }
            return e1Var;
        }
    }

    public C56597e1() {
        this.f162257c = null;
    }

    /* renamed from: e */
    public static /* synthetic */ void m65265e(C56597e1 e1Var, FinderItem finderItem, boolean z, long j, boolean z2, boolean z3, C65426w0 w0Var, boolean z4, int i, CommentDrawerContract.CloseDrawerCallback closeDrawerCallback, boolean z5, long j2, int i2, int i3, int i4, Object obj) {
        int i5 = i4;
        int i6 = 0;
        boolean z6 = (i5 & 2) != 0 ? false : z;
        long j3 = (i5 & 4) != 0 ? 0 : j;
        boolean z7 = (i5 & 8) != 0 ? false : z2;
        boolean z8 = (i5 & 16) != 0 ? true : z3;
        CommentDrawerContract.CloseDrawerCallback closeDrawerCallback2 = null;
        C65426w0 w0Var2 = (i5 & 32) != 0 ? null : w0Var;
        boolean z9 = (i5 & 64) != 0 ? false : z4;
        int i7 = (i5 & 128) != 0 ? 0 : i;
        if ((i5 & 256) == 0) {
            closeDrawerCallback2 = closeDrawerCallback;
        }
        boolean z15 = (i5 & 512) != 0 ? false : z5;
        long j4 = (i5 & 1024) != 0 ? 1000 : j2;
        int i8 = (i5 & 2048) != 0 ? 0 : i2;
        if ((i5 & 4096) == 0) {
            i6 = i3;
        }
        e1Var.mo79926d(finderItem, z6, j3, z7, z8, w0Var2, z9, i7, closeDrawerCallback2, z15, j4, i8, i6);
    }

    /* renamed from: a */
    public final void mo79923a() {
        FinderCommentDrawer finderCommentDrawer = this.f162255a;
        if (finderCommentDrawer != null) {
            finderCommentDrawer.mo79715l();
        }
    }

    /* renamed from: b */
    public final boolean mo79924b() {
        FinderCommentDrawer finderCommentDrawer = this.f162255a;
        if (finderCommentDrawer != null) {
            return finderCommentDrawer.mo82541i();
        }
        return false;
    }

    /* renamed from: c */
    public final void mo79925c(int i, int i2, Intent intent) {
        CommentDrawerContract.CloseDrawerCallback closeDrawerCallback;
        C37521f.f99374d.getClass();
        if (C37521f.f99288T0.mo60266n().intValue() == 1 && i == 500 && intent != null) {
            C56598a.C30027c remove = f162254k.remove(Long.valueOf(intent.getLongExtra("COMMENT_RESULT_KEY", 0)));
            if (remove != null && (closeDrawerCallback = this.f162259e) != null) {
                closeDrawerCallback.mo2377a(remove.f81266a, remove.f81267b, false);
            }
        }
    }

    /* renamed from: d */
    public final void mo79926d(FinderItem finderItem, boolean z, long j, boolean z2, boolean z3, C65426w0 w0Var, boolean z4, int i, CommentDrawerContract.CloseDrawerCallback closeDrawerCallback, boolean z5, long j2, int i2, int i3) {
        CommentDrawerContract.CloseDrawerCallback closeDrawerCallback2 = closeDrawerCallback;
        C87412m.m108594g(finderItem, "feedObj");
        this.f162259e = closeDrawerCallback2;
        C37521f.f99374d.getClass();
        if (C37521f.f99288T0.mo60266n().intValue() == 1) {
            C58784w3 w3Var = C58784w3.f168295a;
            C56598a.C30026a aVar = this.f162257c;
            MMFragmentActivity mMFragmentActivity = this.f162256b;
            C58739j4 j4Var = C58739j4.f168176a;
            if (aVar != null && mMFragmentActivity != null) {
                this.f162258d = new C56598a.C56599b(finderItem, z, j, z2, z3, w0Var);
                long currentTimeMillis = System.currentTimeMillis();
                ConcurrentHashMap<Long, C13604l<C56598a.C30026a, C56598a.C56599b>> concurrentHashMap = f162253j;
                Long valueOf = Long.valueOf(currentTimeMillis);
                C56598a.C56599b bVar = this.f162258d;
                if (bVar != null) {
                    concurrentHashMap.put(valueOf, new C13604l(aVar, bVar));
                    Intent intent = new Intent();
                    intent.putExtra("COMMENT_REQUEST_KEY", currentTimeMillis);
                    intent.putExtra("FROM_MSG", this.f162260f);
                    intent.putExtra("MENTION_ID", this.f162261g);
                    intent.putExtra("MENTION_CREATE_TIME", this.f162262h);
                    C13442s8.f38060Q0.mo12871c(mMFragmentActivity, intent);
                    ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
                    intent.setClass(mMFragmentActivity, FinderCommentUI.class);
                    mMFragmentActivity.startActivityForResult(intent, 500);
                    mMFragmentActivity.overridePendingTransition(0, 0);
                    return;
                }
                C87412m.m108603p("drawerOpenData");
                throw null;
            }
            return;
        }
        FinderCommentDrawer finderCommentDrawer = this.f162255a;
        if (finderCommentDrawer != null) {
            finderCommentDrawer.setOnCloseDrawerCallback(closeDrawerCallback2);
        }
        FinderCommentDrawer finderCommentDrawer2 = this.f162255a;
        if (finderCommentDrawer2 != null) {
            FinderCommentDrawer.m65189m(finderCommentDrawer2, finderItem, z, j, z2, z3, w0Var, false, z4, i, z5, j2, i2, i3, 64, (Object) null);
        }
    }

    public C56597e1(int i, boolean z, CommentDrawerContract.CloseDrawerCallback closeDrawerCallback, int i2, C8480h hVar) {
        this.f162257c = new C56598a.C30026a(i, (i2 & 2) != 0 ? false : z);
    }
}
