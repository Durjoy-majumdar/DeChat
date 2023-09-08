package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import dj1.C45373k0;
import dj1.C45383q0;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import in3.C87773e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import nj3.C76912y0;
import nj3.C88989a;
import nr3.C89059e;
import ob0.C89132b;
import ok1.C11471u;
import qj1.C62660c;
import qk1.C63226j0;
import rx3.C13598b0;
import te3.C48898bs0;
import te3.C49106d71;
import te3.C51934x71;
import te3.C64693s21;
import vf1.C14759f1;
import vf1.C14785k1;
import vf1.C14791l1;
import vf1.C14794m1;
import vf1.C14799n1;
import vf1.C65701g1;
import vf1.C65702h1;
import vf1.C65704i1;
import vf1.C65707j1;
import vo3.C90852c;
import z04.C66723k;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorCommentManagerUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI */
public final class FinderLiveAnchorCommentManagerUI extends MMFinderUI {

    /* renamed from: z */
    public static final /* synthetic */ int f158931z = 0;

    /* renamed from: o */
    public final String f158932o = "Finder.FinderLiveAnchorCommentManagerUI";

    /* renamed from: p */
    public int f158933p = 5;

    /* renamed from: q */
    public final LinkedList<C51934x71> f158934q = new LinkedList<>();

    /* renamed from: r */
    public WeImageView f158935r;

    /* renamed from: s */
    public RecyclerView f158936s;

    /* renamed from: t */
    public C63226j0 f158937t;

    /* renamed from: u */
    public FinderLiveMemebrProfileWidget f158938u;

    /* renamed from: v */
    public long f158939v;

    /* renamed from: w */
    public long f158940w;

    /* renamed from: x */
    public final int f158941x = 111;

    /* renamed from: y */
    public final int f158942y = 112;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI$a */
    public static final class C55815a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ FinderLiveAnchorCommentManagerUI f158943a;

        public C55815a(FinderLiveAnchorCommentManagerUI finderLiveAnchorCommentManagerUI) {
            this.f158943a = finderLiveAnchorCommentManagerUI;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C76912y0.m92768g(this.f158943a.getContext(), this.f158943a.getContext().getResources().getString(C0966R.string.mfv));
            } else {
                C76912y0.m92767f(this.f158943a.getContext(), this.f158943a.getContext().getResources().getString(C0966R.string.mfy));
            }
            FinderLiveAnchorCommentManagerUI finderLiveAnchorCommentManagerUI = this.f158943a;
            int i = FinderLiveAnchorCommentManagerUI.f158931z;
            finderLiveAnchorCommentManagerUI.mo77418P7();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI$b */
    public static final class C55816b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ FinderLiveAnchorCommentManagerUI f158944a;

        public C55816b(FinderLiveAnchorCommentManagerUI finderLiveAnchorCommentManagerUI) {
            this.f158944a = finderLiveAnchorCommentManagerUI;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C76912y0.m92768g(this.f158944a.getContext(), this.f158944a.getContext().getResources().getString(C0966R.string.mfw));
            } else {
                C76912y0.m92767f(this.f158944a.getContext(), this.f158944a.getContext().getResources().getString(C0966R.string.mfy));
            }
            FinderLiveAnchorCommentManagerUI finderLiveAnchorCommentManagerUI = this.f158944a;
            int i = FinderLiveAnchorCommentManagerUI.f158931z;
            finderLiveAnchorCommentManagerUI.mo77418P7();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI$c */
    public static final class C55817c<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ FinderLiveAnchorCommentManagerUI f158945a;

        public C55817c(FinderLiveAnchorCommentManagerUI finderLiveAnchorCommentManagerUI) {
            this.f158945a = finderLiveAnchorCommentManagerUI;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r8) {
            /*
                r7 = this;
                ob0.b$c r8 = (ob0.C89132b.C89134c) r8
                int r0 = r8.f256793a
                if (r0 != 0) goto L_0x0092
                int r0 = r8.f256794b
                if (r0 != 0) goto L_0x0092
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                T r1 = r8.f256796d
                te3.c11 r1 = (te3.C48938c11) r1
                java.util.LinkedList<te3.x71> r1 = r1.f131439d
                java.lang.String r2 = "resp.resp.room_manager_list"
                gy3.C87412m.m108593f(r1, r2)
                java.util.Iterator r1 = r1.iterator()
            L_0x001e:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x006b
                java.lang.Object r2 = r1.next()
                te3.x71 r2 = (te3.C51934x71) r2
                te3.s21 r3 = new te3.s21
                r3.<init>()
                java.lang.String r4 = r2.f144501d
                r3.f185309d = r4
                int r4 = r2.f144502e
                r3.f185311f = r4
                r5 = 2
                r6 = 0
                if (r4 != r5) goto L_0x0042
                te3.hx0 r4 = r2.f144503f
                if (r4 == 0) goto L_0x004d
                java.lang.String r4 = r4.f134925j
                goto L_0x004e
            L_0x0042:
                te3.hx0 r4 = r2.f144503f
                if (r4 == 0) goto L_0x004d
                com.tencent.mm.protocal.protobuf.FinderContact r4 = r4.f134919d
                if (r4 == 0) goto L_0x004d
                java.lang.String r4 = r4.nickname
                goto L_0x004e
            L_0x004d:
                r4 = r6
            L_0x004e:
                r3.f185310e = r4
                r4 = 0
                r3.f185312g = r4
                te3.hx0 r2 = r2.f144503f
                if (r2 == 0) goto L_0x005d
                com.tencent.mm.protocal.protobuf.FinderContact r4 = r2.f134919d
                if (r4 == 0) goto L_0x005d
                java.lang.String r6 = r4.headUrl
            L_0x005d:
                r3.f185313h = r6
                if (r2 == 0) goto L_0x0064
                int r2 = r2.f134926n
                goto L_0x0065
            L_0x0064:
                r2 = 4
            L_0x0065:
                r3.f185314i = r2
                r0.add(r3)
                goto L_0x001e
            L_0x006b:
                com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI r1 = r7.f158945a
                T r2 = r8.f256796d
                te3.c11 r2 = (te3.C48938c11) r2
                int r2 = r2.f131440e
                r1.f158933p = r2
                java.util.LinkedList<te3.x71> r1 = r1.f158934q
                r1.clear()
                com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI r1 = r7.f158945a
                java.util.LinkedList<te3.x71> r1 = r1.f158934q
                T r8 = r8.f256796d
                te3.c11 r8 = (te3.C48938c11) r8
                java.util.LinkedList<te3.x71> r8 = r8.f131439d
                r1.addAll(r8)
                com.tencent.mm.plugin.finder.feed.ui.i r8 = new com.tencent.mm.plugin.finder.feed.ui.i
                com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI r1 = r7.f158945a
                r8.<init>(r1, r0)
                o40.C61926c.m72668M(r8)
                goto L_0x00b6
            L_0x0092:
                com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI r8 = r7.f158945a
                androidx.appcompat.app.AppCompatActivity r8 = r8.getContext()
                com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI r0 = r7.f158945a
                androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
                android.content.res.Resources r0 = r0.getResources()
                r1 = 2131827957(0x7f111cf5, float:1.9288841E38)
                java.lang.String r0 = r0.getString(r1)
                nj3.C76912y0.m92767f(r8, r0)
                com.tencent.mm.plugin.finder.feed.ui.j r8 = new com.tencent.mm.plugin.finder.feed.ui.j
                com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI r0 = r7.f158945a
                r8.<init>(r0)
                o40.C61926c.m72668M(r8)
            L_0x00b6:
                rx3.b0 r8 = rx3.C13598b0.f38549a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveAnchorCommentManagerUI.C55817c.call(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: N7 */
    public static final void m63557N7(FinderLiveAnchorCommentManagerUI finderLiveAnchorCommentManagerUI, int i) {
        finderLiveAnchorCommentManagerUI.getClass();
        Intent intent = new Intent();
        if (i == finderLiveAnchorCommentManagerUI.f158941x) {
            intent.setClassName(finderLiveAnchorCommentManagerUI.getContext(), "com.tencent.mm.ui.contact.SelectContactUI");
            intent.putExtra("list_type", 1);
            intent.putExtra("titile", finderLiveAnchorCommentManagerUI.getContext().getResources().getString(C0966R.string.mgk));
            intent.putExtra("without_openim", true);
            C74560s1.m89276e();
            intent.putExtra("list_attr", C74560s1.m89278g(C74560s1.f219162c & -16777217, 131072));
            C63226j0 j0Var = finderLiveAnchorCommentManagerUI.f158937t;
            if (j0Var != null) {
                intent.putExtra("block_contact", Util.listToString(j0Var.mo88134F4(), ","));
                intent.putExtra("Forbid_SelectChatRoom", true);
                intent.putExtra("can_go_to_profile", true);
                intent.putExtra("too_many_member_tip_string", finderLiveAnchorCommentManagerUI.getContext().getResources().getString(C0966R.string.mge, new Object[]{String.valueOf(finderLiveAnchorCommentManagerUI.f158933p)}));
                int i2 = finderLiveAnchorCommentManagerUI.f158933p;
                C63226j0 j0Var2 = finderLiveAnchorCommentManagerUI.f158937t;
                if (j0Var2 != null) {
                    intent.putExtra("max_limit_num", i2 - ((ArrayList) j0Var2.mo88134F4()).size());
                } else {
                    C87412m.m108603p("adapter");
                    throw null;
                }
            } else {
                C87412m.m108603p("adapter");
                throw null;
            }
        } else {
            intent.setClass(finderLiveAnchorCommentManagerUI.getContext(), FinderLiveDelManagerUI.class);
            C49106d71 d712 = new C49106d71();
            d712.f132161d.addAll(finderLiveAnchorCommentManagerUI.f158934q);
            intent.putExtra("selectcontactitem", d712.toByteArray());
        }
        finderLiveAnchorCommentManagerUI.startActivityForResult(intent, i);
    }

    /* renamed from: O7 */
    public final LinkedList<String> mo77417O7(String str, String str2) {
        C66723k kVar = new C66723k(str2);
        Object[] array = kVar.mo90760e(str, 0).toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        LinkedList<String> linkedList = new LinkedList<>();
        for (String add : (String[]) array) {
            linkedList.add(add);
        }
        return linkedList;
    }

    /* renamed from: P7 */
    public final void mo77418P7() {
        C89059e i = new C45373k0(C66785b.f191882e.mo90662O5(), this.f158939v, this.f158940w).mo9225i();
        i.mo123420E(new C55817c(this));
        i.mo11397F(this);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359701cv0;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        String stringExtra2;
        int i3 = i;
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent);
        boolean z = false;
        String str = "";
        if (i3 == this.f158941x) {
            if (intent2 != null && (stringExtra2 = intent2.getStringExtra("Select_Contact")) != null) {
                if (stringExtra2.length() == 0) {
                    z = true;
                }
                if (!z) {
                    String stringExtra3 = intent2.getStringExtra("Select_Contact");
                    if (stringExtra3 != null) {
                        str = stringExtra3;
                    }
                    LinkedList<String> O7 = mo77417O7(str, ",");
                    String O5 = C66785b.f191882e.mo90662O5();
                    long j = this.f158939v;
                    long j2 = this.f158940w;
                    C48898bs0 bs02 = new C48898bs0();
                    for (String str2 : O7) {
                        LinkedList<C51934x71> linkedList = bs02.f131283d;
                        C51934x71 x712 = new C51934x71();
                        x712.f144501d = str2;
                        x712.f144502e = 1;
                        linkedList.add(x712);
                    }
                    C89059e i4 = new C45383q0(O5, j, j2, 1, bs02, (C49106d71) null, 32, (C8480h) null).mo9225i();
                    i4.mo123420E(new C55815a(this));
                    i4.mo11397F(this);
                }
            }
        } else if (i3 == this.f158942y && intent2 != null && (stringExtra = intent2.getStringExtra("Select_Contact")) != null) {
            if (stringExtra.length() == 0) {
                z = true;
            }
            if (!z) {
                String stringExtra4 = intent2.getStringExtra("Select_Contact");
                if (stringExtra4 == null) {
                    stringExtra4 = str;
                }
                LinkedList<String> O72 = mo77417O7(stringExtra4, ",");
                String O52 = C66785b.f191882e.mo90662O5();
                long j3 = this.f158939v;
                long j4 = this.f158940w;
                C49106d71 d712 = new C49106d71();
                for (String str3 : O72) {
                    LinkedList<C51934x71> linkedList2 = d712.f132161d;
                    C51934x71 x713 = new C51934x71();
                    x713.f144501d = str3;
                    C63226j0 j0Var = this.f158937t;
                    C64693s21 s212 = null;
                    if (j0Var != null) {
                        if (str3 == null) {
                            str3 = str;
                        }
                        Iterator<C64693s21> it = j0Var.f179425g.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C64693s21 next = it.next();
                            if (C87412m.m108589b(next.f185309d, str3)) {
                                s212 = next;
                                break;
                            }
                        }
                        C64693s21 s213 = s212;
                        x713.f144502e = s213 != null ? s213.f185311f : 1;
                        linkedList2.add(x713);
                    } else {
                        C87412m.m108603p("adapter");
                        throw null;
                    }
                }
                C89059e i5 = new C45383q0(O52, j3, j4, 2, (C48898bs0) null, d712, 16, (C8480h) null).mo9225i();
                i5.mo123420E(new C55816b(this));
                i5.mo11397F(this);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        C87773e.m109211d(getWindow());
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        this.f158939v = getIntent().getLongExtra("objectid", 0);
        this.f158940w = getIntent().getLongExtra("liveid", 0);
        View findViewById = findViewById(C0966R.C0970id.mxv);
        C87412m.m108593f(findViewById, "findViewById(R.id.comment_manager_close_btn)");
        this.f158935r = (WeImageView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.mxw);
        C87412m.m108593f(findViewById2, "findViewById(R.id.comment_manager_recycler_view)");
        this.f158936s = (RecyclerView) findViewById2;
        WeImageView weImageView = this.f158935r;
        if (weImageView != null) {
            weImageView.setOnClickListener(new C14759f1(this));
            C63226j0 j0Var = new C63226j0();
            this.f158937t = j0Var;
            RecyclerView recyclerView = this.f158936s;
            if (recyclerView != null) {
                recyclerView.setAdapter(j0Var);
                GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) getContext(), 4, 1, false);
                RecyclerView recyclerView2 = this.f158936s;
                if (recyclerView2 != null) {
                    recyclerView2.setLayoutManager(gridLayoutManager);
                    AppCompatActivity context = getContext();
                    C87412m.m108593f(context, "context");
                    this.f158938u = new FinderLiveMemebrProfileWidget(context, (C62660c) null, (C11471u.C11473b) null, 6, (C8480h) null);
                    C63226j0 j0Var2 = this.f158937t;
                    if (j0Var2 != null) {
                        j0Var2.f179422d = new C65701g1(this);
                        j0Var2.f179423e = new C65702h1(this);
                        j0Var2.f179424f = new C65704i1(this);
                        FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget = this.f158938u;
                        if (finderLiveMemebrProfileWidget != null) {
                            finderLiveMemebrProfileWidget.f15409n = new C65707j1(this);
                        }
                        FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget2 = this.f158938u;
                        if (finderLiveMemebrProfileWidget2 != null) {
                            finderLiveMemebrProfileWidget2.f15408j = C14785k1.f40768d;
                        }
                        if (finderLiveMemebrProfileWidget2 != null) {
                            finderLiveMemebrProfileWidget2.f15410o = new C14791l1(this);
                        }
                        FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget3 = this.f158938u;
                        if (finderLiveMemebrProfileWidget3 != null) {
                            finderLiveMemebrProfileWidget3.f15411p = C14794m1.f40777d;
                        }
                        if (finderLiveMemebrProfileWidget3 != null) {
                            finderLiveMemebrProfileWidget3.f15412q = new C14799n1(this);
                        }
                        FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget4 = this.f158938u;
                        if (finderLiveMemebrProfileWidget4 != null) {
                            finderLiveMemebrProfileWidget4.mo3432q();
                        }
                        mo77418P7();
                        return;
                    }
                    C87412m.m108603p("adapter");
                    throw null;
                }
                C87412m.m108603p("managerList");
                throw null;
            }
            C87412m.m108603p("managerList");
            throw null;
        }
        C87412m.m108603p("closeBtn");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget = this.f158938u;
        if (finderLiveMemebrProfileWidget != null) {
            finderLiveMemebrProfileWidget.mo3433r();
        }
    }
}
