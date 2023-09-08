package com.tencent.p014mm.plugin.finder.uniComments;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.UniCommentChangeEvent;
import com.tencent.p014mm.plugin.finder.uniComments.UniCommentFooter;
import com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView;
import com.tencent.p014mm.plugin.finder.view.FinderCommentEditText;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.TouchableLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import cy3.C58003b;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58739j4;
import er1.C58784w3;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8808v4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import je1.C46523h2;
import jp3.C9486a;
import jp3.C9487b;
import jq3.C60898l;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import lq1.C10641n;
import lq1.C10642s;
import lq1.C46889a;
import lq1.C61346b0;
import lq1.C61348c0;
import lq1.C61350d0;
import lq1.C61352e0;
import lq1.C61354f0;
import lq1.C61355g;
import lq1.C61356g0;
import lq1.C61364h;
import lq1.C61365i;
import lq1.C61372m;
import lq1.C61375q;
import lq1.C61376r;
import mq1.C61554c;
import nj3.C76879j;
import nq1.C61886a;
import nq1.C61887b;
import ob0.C47350c;
import pe3.C89349b;
import qo3.C77407n;
import qq1.C63317a;
import rx3.C13598b0;
import sq1.C64147b;
import sq1.C64149d;
import sq1.C64151e;
import sx3.C64186f0;
import sx3.C64197v;
import sx3.C77813z;
import te3.C64236ao1;
import te3.C64887zn1;
import u60.C14121l;
import u60.C65233m;
import uo3.C78253a;
import up1.C37521f;
import xr1.C66416a;
import z04.C112550d0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter */
public final class UniCommentDrawerPresenter implements C61364h, C9487b<C9486a>, UniCommentFooter.C56458a, C60898l.C9502b<C60905o>, C60898l.C9503c<C60905o> {

    /* renamed from: A */
    public boolean f161370A;

    /* renamed from: B */
    public UniCommentDrawer f161371B;

    /* renamed from: C */
    public boolean f161372C;

    /* renamed from: D */
    public final IListener<UniCommentChangeEvent> f161373D = new UniCommentDrawerPresenter$commentChangeEventListener$1(this, C40008f.f107254d);

    /* renamed from: E */
    public Dialog f161374E;

    /* renamed from: F */
    public final C56450b f161375F = new C56450b(this);

    /* renamed from: d */
    public final Context f161376d;

    /* renamed from: e */
    public int f161377e = 58;

    /* renamed from: f */
    public final C61346b0 f161378f = new C61346b0();

    /* renamed from: g */
    public final CopyOnWriteArraySet<C9486a> f161379g = new CopyOnWriteArraySet<>();

    /* renamed from: h */
    public C63317a f161380h;

    /* renamed from: i */
    public int f161381i = 2;

    /* renamed from: j */
    public C61356g0 f161382j;

    /* renamed from: n */
    public C56449a f161383n;

    /* renamed from: o */
    public C61355g f161384o;

    /* renamed from: p */
    public volatile C89349b f161385p;

    /* renamed from: q */
    public boolean f161386q;

    /* renamed from: r */
    public boolean f161387r = true;

    /* renamed from: s */
    public boolean f161388s;

    /* renamed from: t */
    public boolean f161389t = true;

    /* renamed from: u */
    public long f161390u;

    /* renamed from: v */
    public boolean f161391v;

    /* renamed from: w */
    public boolean f161392w;

    /* renamed from: x */
    public volatile boolean f161393x = true;

    /* renamed from: y */
    public C65233m f161394y;

    /* renamed from: z */
    public boolean f161395z;

    /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$a */
    public final class C56449a {

        /* renamed from: a */
        public final RecyclerView f161396a;

        /* renamed from: b */
        public final /* synthetic */ UniCommentDrawerPresenter f161397b;

        public C56449a(UniCommentDrawerPresenter uniCommentDrawerPresenter, RecyclerView recyclerView) {
            C87412m.m108594g(recyclerView, "recyclerView");
            this.f161397b = uniCommentDrawerPresenter;
            this.f161396a = recyclerView;
        }

        /* renamed from: a */
        public final void mo79249a(long j, long j2, boolean z) {
            RecyclerView.C16613e adapter;
            if (j != 0) {
                int f = this.f161397b.f161378f.mo86301f();
                C61346b0 b0Var = this.f161397b.f161378f;
                ArrayList<C64151e> arrayList = b0Var.f174500a;
                ArrayList arrayList2 = new ArrayList();
                Iterator<C64151e> it = arrayList.iterator();
                int i = -1;
                int i2 = 0;
                while (it.hasNext()) {
                    C64151e next = it.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        C64151e eVar = next;
                        if (eVar.f181868d.mo88875m2() == j) {
                            i = i2;
                        }
                        if (eVar.f181868d.mo88875m2() == j || eVar.f181868d.field_actionInfo.f186500h == j) {
                            arrayList2.add(next);
                        }
                        i2 = i3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                int size = arrayList2.size();
                b0Var.f174500a.removeAll(arrayList2);
                Integer valueOf = Integer.valueOf(i);
                Integer valueOf2 = Integer.valueOf(size);
                if (z && valueOf.intValue() >= 0 && valueOf.intValue() + valueOf2.intValue() <= f && (adapter = this.f161396a.getAdapter()) != null) {
                    adapter.notifyItemRangeRemoved(valueOf.intValue(), valueOf2.intValue());
                }
            } else {
                C61346b0 b0Var2 = this.f161397b.f161378f;
                ArrayList<C64151e> arrayList3 = b0Var2.f174500a;
                ArrayList arrayList4 = new ArrayList();
                Iterator<C64151e> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    C64151e next2 = it4.next();
                    if (next2.f181868d.field_localCommentId == j2) {
                        arrayList4.add(next2);
                    }
                }
                b0Var2.f174500a.removeAll(arrayList4);
            }
            RecyclerView.C16613e adapter2 = this.f161396a.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$b */
    public static final class C56450b extends RecyclerView.C16615g {

        /* renamed from: a */
        public final /* synthetic */ UniCommentDrawerPresenter f161398a;

        public C56450b(UniCommentDrawerPresenter uniCommentDrawerPresenter) {
            this.f161398a = uniCommentDrawerPresenter;
        }

        /* renamed from: b */
        public void mo2556b() {
            this.f161398a.mo79241n0();
        }

        /* renamed from: c */
        public void mo2557c(int i, int i2) {
            this.f161398a.mo79241n0();
        }

        /* renamed from: d */
        public void mo2558d(int i, int i2, Object obj) {
            mo2557c(i, i2);
            this.f161398a.mo79241n0();
        }

        /* renamed from: e */
        public void mo2559e(int i, int i2) {
            this.f161398a.mo79241n0();
        }

        /* renamed from: g */
        public void mo2560g(int i, int i2) {
            this.f161398a.mo79241n0();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$c */
    public static final class C56451c extends C87413o implements C32226l<C14121l, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C64151e f161399d;

        /* renamed from: e */
        public final /* synthetic */ UniCommentDrawerPresenter f161400e;

        /* renamed from: f */
        public final /* synthetic */ boolean f161401f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56451c(C64151e eVar, UniCommentDrawerPresenter uniCommentDrawerPresenter, boolean z) {
            super(1);
            this.f161399d = eVar;
            this.f161400e = uniCommentDrawerPresenter;
            this.f161401f = z;
        }

        public Object invoke(Object obj) {
            String str;
            C14121l lVar = (C14121l) obj;
            C87412m.m108594g(lVar, "task");
            StringBuilder sb = new StringBuilder();
            sb.append("loadMoreLevel2Comments before lastBuffer ");
            if (this.f161399d.f181868d.mo88876n2().lastBuffer == null) {
                str = "null";
            } else {
                C89349b bVar = this.f161399d.f181868d.mo88876n2().lastBuffer;
                str = MD5Util.getMD5String(bVar != null ? bVar.mo123703f() : null);
            }
            sb.append(str);
            Log.m105924i("MicroMsg.MusicUni.DrawerPresenter", sb.toString());
            C63317a aVar = this.f161400e.f161380h;
            if (aVar != null) {
                new C61887b(aVar.f179669a, aVar.f179670b, this.f161399d.getItemId(), this.f161399d, this.f161401f).mo9225i().mo123064p(new C56468d(this.f161399d, this.f161400e)).mo123062e(new C56469e(this.f161400e, this.f161399d, this.f161401f, lVar)).mo11397F(this.f161400e);
                return C13598b0.f38549a;
            }
            C87412m.m108603p("feedObj");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$d */
    public static final class C56452d extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public final /* synthetic */ UniCommentDrawerPresenter f161402a;

        /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$d$a */
        public static final class C56453a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ UniCommentDrawerPresenter f161403d;

            public C56453a(UniCommentDrawerPresenter uniCommentDrawerPresenter) {
                this.f161403d = uniCommentDrawerPresenter;
            }

            public final void run() {
                UniCommentDrawerPresenter uniCommentDrawerPresenter = this.f161403d;
                C65233m mVar = uniCommentDrawerPresenter.f161394y;
                if (mVar != null) {
                    mVar.mo11856a(new C14121l(new C61375q(uniCommentDrawerPresenter), (String) null, 2, (C8480h) null));
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$d$b */
        public static final class C56454b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ UniCommentDrawerPresenter f161404d;

            public C56454b(UniCommentDrawerPresenter uniCommentDrawerPresenter) {
                this.f161404d = uniCommentDrawerPresenter;
            }

            public final void run() {
                this.f161404d.mo79239j0(false);
            }
        }

        public C56452d(UniCommentDrawerPresenter uniCommentDrawerPresenter) {
            this.f161402a = uniCommentDrawerPresenter;
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            ((C119157j) C119157j.f356862d).mo183875f(new C56453a(this.f161402a));
        }

        /* renamed from: c */
        public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C61356g0 g0Var;
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            UniCommentDrawerPresenter uniCommentDrawerPresenter = this.f161402a;
            if (!uniCommentDrawerPresenter.f161387r && (g0Var = uniCommentDrawerPresenter.f161382j) != null) {
                RefreshLoadMoreLayout.m66896C(g0Var.mo86320q(), (RefreshLoadMoreLayout.C7080c) null, 1, (Object) null);
            }
        }

        /* renamed from: d */
        public void mo3680d(int i) {
            ((C119157j) C119157j.f356862d).mo183875f(new C56454b(this.f161402a));
        }

        /* renamed from: e */
        public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            UniCommentDrawerPresenter uniCommentDrawerPresenter = this.f161402a;
            if (!uniCommentDrawerPresenter.f161386q) {
                C61356g0 g0Var = uniCommentDrawerPresenter.f161382j;
                if (g0Var != null) {
                    g0Var.mo86311h(false);
                }
                C61356g0 g0Var2 = uniCommentDrawerPresenter.f161382j;
                if (g0Var2 != null) {
                    g0Var2.mo86312i().mo82529d(true);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$e */
    public static final class C56455e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ UniCommentDrawerPresenter f161405d;

        /* renamed from: e */
        public final /* synthetic */ C61356g0 f161406e;

        public C56455e(UniCommentDrawerPresenter uniCommentDrawerPresenter, C61356g0 g0Var) {
            this.f161405d = uniCommentDrawerPresenter;
            this.f161406e = g0Var;
        }

        public final void onClick(View view) {
            LinkedList<String> linkedList;
            boolean z;
            FinderCommentInfo finderCommentInfo;
            C64147b bVar;
            RecyclerView recyclerView;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter$onAttach$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            UniCommentDrawerPresenter uniCommentDrawerPresenter = this.f161405d;
            int scene = this.f161406e.mo86314k().getScene();
            List<C46889a> mentionListWhenReply = this.f161406e.mo86314k().getMentionListWhenReply();
            FinderCommentEditText N = uniCommentDrawerPresenter.mo79229N();
            Editable text = N != null ? N.getText() : null;
            if (!(text == null || text.length() == 0)) {
                if (uniCommentDrawerPresenter.f161380h != null) {
                    CharSequence i0 = C112550d0.m153799i0(text);
                    if (!(i0 == null || i0.length() == 0)) {
                        C58784w3 w3Var = C58784w3.f168295a;
                        String obj = text.toString();
                        w3Var.getClass();
                        C87412m.m108594g(obj, FirebaseAnalytics.C113379b.ORIGIN);
                        String k = C58739j4.f168176a.mo83716k(obj);
                        FinderCommentEditText N2 = uniCommentDrawerPresenter.mo79229N();
                        if (N2 != null) {
                            C63317a aVar = uniCommentDrawerPresenter.f161380h;
                            if (aVar != null) {
                                LinkedList linkedList2 = (LinkedList) ((HashMap) N2.f198148E).get(Long.valueOf((long) aVar.f179674f));
                                if (linkedList2 == null) {
                                    linkedList2 = new LinkedList();
                                }
                                linkedList = linkedList2;
                            } else {
                                C87412m.m108603p("feedObj");
                                throw null;
                            }
                        } else {
                            linkedList = null;
                        }
                        if (linkedList != null) {
                            for (String str : linkedList) {
                                C58784w3.f168295a.getClass();
                                C87412m.m108594g(str, FirebaseAnalytics.C113379b.ORIGIN);
                                C58739j4.f168176a.mo83716k(str);
                            }
                        }
                        FinderCommentEditText N3 = uniCommentDrawerPresenter.mo79229N();
                        if ((N3 != null ? N3.getTag() : null) == null) {
                            C61554c cVar = C61554c.f174955c;
                            long c = C31543z5.m39453c();
                            C63317a aVar2 = uniCommentDrawerPresenter.f161380h;
                            if (aVar2 != null) {
                                String str2 = aVar2.f179673e;
                                long j = (long) aVar2.f179674f;
                                String str3 = aVar2.f179675g;
                                C58784w3 w3Var2 = C58784w3.f168295a;
                                String q0 = w3Var2.mo83956q0(scene);
                                String p0 = w3Var2.mo83955p0(scene);
                                UniCommentDrawer uniCommentDrawer = uniCommentDrawerPresenter.f161371B;
                                int reason = uniCommentDrawer != null ? uniCommentDrawer.getReason() : 0;
                                C63317a aVar3 = uniCommentDrawerPresenter.f161380h;
                                if (aVar3 != null) {
                                    cVar.getClass();
                                    C87412m.m108594g(str2, "feedUsername");
                                    C87412m.m108594g(str3, "objectNonceId");
                                    C87412m.m108594g(q0, "username");
                                    C87412m.m108594g(mentionListWhenReply, "mentionList");
                                    cVar.mo86490a(c, str2, j, str3, k, str2, "", (Long) null, (String) null, q0, p0, scene, false, (FinderCommentInfo) null, reason, mentionListWhenReply, linkedList, aVar3);
                                    C61356g0 g0Var = uniCommentDrawerPresenter.f161382j;
                                    if (!(g0Var == null || (recyclerView = g0Var.mo86320q().getRecyclerView()) == null)) {
                                        C9556a aVar4 = new C9556a();
                                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                        aVar4.mo10233c(0);
                                        RecyclerView recyclerView2 = recyclerView;
                                        C117292a.m165358d(recyclerView2, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter", "onReply", "(ILjava/util/List;)V", "Undefined", "scrollToPosition", "(I)V");
                                        recyclerView.mo17115r1(((Integer) aVar4.mo10231a(0)).intValue());
                                        C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter", "onReply", "(ILjava/util/List;)V", "Undefined", "scrollToPosition", "(I)V");
                                    }
                                    C61356g0 g0Var2 = uniCommentDrawerPresenter.f161382j;
                                    if (g0Var2 != null) {
                                        g0Var2.mo86320q().mo55513p(C10642s.f32054d);
                                    }
                                    z = true;
                                } else {
                                    C87412m.m108603p("feedObj");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("feedObj");
                                throw null;
                            }
                        } else {
                            FinderCommentEditText N4 = uniCommentDrawerPresenter.mo79229N();
                            Object tag = N4 != null ? N4.getTag() : null;
                            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.uniComments.storge.LocalUniCommentObject");
                            C64147b bVar2 = (C64147b) tag;
                            long j2 = bVar2.field_actionInfo.f186500h;
                            if (j2 == 0) {
                                finderCommentInfo = bVar2.mo88876n2();
                            } else {
                                C64151e v = uniCommentDrawerPresenter.mo79248v(j2);
                                finderCommentInfo = (v == null || (bVar = v.f181868d) == null) ? null : bVar.mo88876n2();
                            }
                            if (finderCommentInfo != null) {
                                finderCommentInfo.expandCommentCount++;
                                C61554c cVar2 = C61554c.f174955c;
                                long c2 = C31543z5.m39453c();
                                C63317a aVar5 = uniCommentDrawerPresenter.f161380h;
                                if (aVar5 != null) {
                                    String str4 = aVar5.f179673e;
                                    long j3 = (long) aVar5.f179674f;
                                    String str5 = aVar5.f179675g;
                                    String username = bVar2.getUsername();
                                    String nickname = bVar2.getNickname();
                                    Long valueOf = Long.valueOf(bVar2.mo88875m2());
                                    String content = bVar2.getContent();
                                    C58784w3 w3Var3 = C58784w3.f168295a;
                                    String q05 = w3Var3.mo83956q0(scene);
                                    String p05 = w3Var3.mo83955p0(scene);
                                    boolean v2 = bVar2.mo88885v2();
                                    UniCommentDrawer uniCommentDrawer2 = uniCommentDrawerPresenter.f161371B;
                                    int reason2 = uniCommentDrawer2 != null ? uniCommentDrawer2.getReason() : 0;
                                    C63317a aVar6 = uniCommentDrawerPresenter.f161380h;
                                    if (aVar6 != null) {
                                        cVar2.mo86490a(c2, str4, j3, str5, k, username, nickname, valueOf, content, q05, p05, scene, v2, finderCommentInfo, reason2, mentionListWhenReply, linkedList, aVar6);
                                        z = true;
                                        uniCommentDrawerPresenter.getClass();
                                    } else {
                                        C87412m.m108603p("feedObj");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("feedObj");
                                    throw null;
                                }
                            }
                        }
                        C61356g0 g0Var3 = uniCommentDrawerPresenter.f161382j;
                        if (g0Var3 != null) {
                            UniCommentFooter k2 = g0Var3.mo86314k();
                            int i = k2.f161417F;
                            if (i == z) {
                                k2.mo79284j(z);
                            } else if (i == 2) {
                                k2.mo79287m(false);
                            }
                        }
                        FinderCommentEditText N5 = uniCommentDrawerPresenter.mo79229N();
                        if (N5 != null) {
                            N5.setText((CharSequence) null);
                        }
                    }
                    C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter$onAttach$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
                C87412m.m108603p("feedObj");
                throw null;
            }
            if (uniCommentDrawerPresenter.f161388s) {
                C61356g0 g0Var4 = uniCommentDrawerPresenter.f161382j;
                if (g0Var4 != null) {
                    g0Var4.mo86312i().mo79202l();
                }
                UniCommentDrawer uniCommentDrawer3 = uniCommentDrawerPresenter.f161371B;
                if (uniCommentDrawer3 != null) {
                    uniCommentDrawer3.getReason();
                }
            } else {
                C61356g0 g0Var5 = uniCommentDrawerPresenter.f161382j;
                if (g0Var5 != null) {
                    View o = g0Var5.mo86318o();
                    C9556a aVar7 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar7.mo10233c(8);
                    View view2 = o;
                    C117292a.m165358d(view2, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    o.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View p = g0Var5.mo86319p();
                    C9556a aVar8 = new C9556a();
                    aVar8.mo10233c(8);
                    View view3 = p;
                    C117292a.m165358d(view3, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    g0Var5.mo86317n().setVisibility(8);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter$onAttach$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$f */
    public static final class C56456f extends C87413o implements C32226l<C64151e, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ UniCommentDrawerPresenter f161407d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56456f(UniCommentDrawerPresenter uniCommentDrawerPresenter) {
            super(1);
            this.f161407d = uniCommentDrawerPresenter;
        }

        public Object invoke(Object obj) {
            C64151e eVar = (C64151e) obj;
            C87412m.m108594g(eVar, "commentItem");
            UniCommentDrawerPresenter uniCommentDrawerPresenter = this.f161407d;
            uniCommentDrawerPresenter.getClass();
            Context context = uniCommentDrawerPresenter.f161376d;
            if (context != null) {
                C76879j.m92743n(context, C0966R.string.ejt, 0, new C61365i(uniCommentDrawerPresenter, eVar, context), (DialogInterface.OnClickListener) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$g */
    public static final class C56457g extends C87413o implements C32226l<C14121l, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f161408d;

        /* renamed from: e */
        public final /* synthetic */ UniCommentDrawerPresenter f161409e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56457g(boolean z, UniCommentDrawerPresenter uniCommentDrawerPresenter) {
            super(1);
            this.f161408d = z;
            this.f161409e = uniCommentDrawerPresenter;
        }

        public Object invoke(Object obj) {
            C61886a aVar;
            Throwable th;
            C14121l lVar = (C14121l) obj;
            C87412m.m108594g(lVar, "task");
            Log.m105924i("MicroMsg.MusicUni.DrawerPresenter", "refreshData " + this.f161408d);
            long currentTimeMillis = System.currentTimeMillis();
            C8479f0 f0Var = new C8479f0();
            T t = C64186f0.f181907d;
            f0Var.f27484d = t;
            C8479f0 f0Var2 = new C8479f0();
            f0Var2.f27484d = t;
            if (this.f161409e.f161390u == 0) {
                C64149d a = C64149d.f181862f.mo88889a();
                C63317a aVar2 = this.f161409e.f161380h;
                if (aVar2 != null) {
                    long j = (long) aVar2.f179674f;
                    String str = a.f181867e + " WHERE actionType = 1 and feedId = " + j + " ORDER BY postTime DESC";
                    Cursor rawQuery = a.f181866d.rawQuery(str, (String[]) null, 2);
                    Log.m105924i("MicroMsg.MusicUni.UniActionStorage", "getAllUnsentCommentsByFeedId " + j + ' ' + str);
                    T linkedList = new LinkedList();
                    try {
                        if (rawQuery.moveToFirst()) {
                            do {
                                C64147b bVar = new C64147b();
                                bVar.convertFrom(rawQuery);
                                linkedList.add(bVar);
                            } while (rawQuery.moveToNext());
                        }
                        C13598b0 b0Var = C13598b0.f38549a;
                        C58003b.m67160a(rawQuery, (Throwable) null);
                        f0Var.f27484d = linkedList;
                        T arrayList = new ArrayList();
                        for (Object next : linkedList) {
                            if (((C64147b) next).field_actionInfo.f186500h != 0) {
                                arrayList.add(next);
                            }
                        }
                        f0Var2.f27484d = arrayList;
                        T arrayList2 = new ArrayList();
                        for (Object next2 : (Iterable) f0Var.f27484d) {
                            if (((C64147b) next2).field_actionInfo.f186500h == 0) {
                                arrayList2.add(next2);
                            }
                        }
                        f0Var.f27484d = arrayList2;
                    } catch (Throwable th4) {
                        Throwable th5 = th4;
                        C58003b.m67160a(rawQuery, th);
                        throw th5;
                    }
                } else {
                    C87412m.m108603p("feedObj");
                    throw null;
                }
            }
            if (this.f161408d) {
                aVar = new C61886a();
                UniCommentDrawerPresenter uniCommentDrawerPresenter = this.f161409e;
                C63317a aVar3 = uniCommentDrawerPresenter.f161380h;
                if (aVar3 != null) {
                    String str2 = aVar3.f179669a;
                    String str3 = aVar3.f179670b;
                    long j2 = uniCommentDrawerPresenter.f161390u;
                    C87412m.m108594g(str2, "app_name");
                    C87412m.m108594g(str3, "entity_id");
                    C47350c.C47352b bVar2 = new C47350c.C47352b();
                    C64887zn1 zn12 = new C64887zn1();
                    zn12.f186746e = str2;
                    zn12.f186747f = str3;
                    zn12.f186745d = C46523h2.f125330a.mo71859a(6953);
                    Long valueOf = Long.valueOf(j2);
                    Long l = (valueOf.longValue() > 0 ? 1 : (valueOf.longValue() == 0 ? 0 : -1)) != 0 ? valueOf : null;
                    if (l != null) {
                        l.longValue();
                        zn12.f186750i = j2;
                    }
                    bVar2.f127066a = zn12;
                    bVar2.f127067b = new C64236ao1();
                    bVar2.f127068c = "/cgi-bin/micromsg-bin/finderunigetcomment";
                    bVar2.f127069d = 6953;
                    aVar.mo123453j(bVar2.mo72403a());
                } else {
                    C87412m.m108603p("feedObj");
                    throw null;
                }
            } else {
                aVar = new C61886a();
                UniCommentDrawerPresenter uniCommentDrawerPresenter2 = this.f161409e;
                C63317a aVar4 = uniCommentDrawerPresenter2.f161380h;
                if (aVar4 != null) {
                    String str4 = aVar4.f179669a;
                    String str5 = aVar4.f179670b;
                    C89349b bVar3 = uniCommentDrawerPresenter2.f161385p;
                    C87412m.m108594g(str4, "app_name");
                    C87412m.m108594g(str5, "entity_id");
                    C47350c.C47352b bVar4 = new C47350c.C47352b();
                    C64887zn1 zn13 = new C64887zn1();
                    zn13.f186746e = str4;
                    zn13.f186747f = str5;
                    zn13.f186745d = C46523h2.f125330a.mo71859a(6953);
                    zn13.f186752n = 1;
                    zn13.f186755q = bVar3;
                    bVar4.f127066a = zn13;
                    bVar4.f127067b = new C64236ao1();
                    bVar4.f127068c = "/cgi-bin/micromsg-bin/finderunigetcomment";
                    bVar4.f127069d = 6953;
                    aVar.mo123453j(bVar4.mo72403a());
                } else {
                    C87412m.m108603p("feedObj");
                    throw null;
                }
            }
            aVar.mo9225i().mo123064p(new C56472h(this.f161409e, this.f161408d, f0Var2, f0Var)).mo123062e(new C56474j(this.f161409e, this.f161408d, currentTimeMillis, lVar)).mo11397F(this.f161409e);
            return C13598b0.f38549a;
        }
    }

    public UniCommentDrawerPresenter(Context context) {
        C87412m.m108594g(context, "context");
        this.f161376d = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        if (((sq1.C64151e) r18.get(r5)).f181868d.field_actionInfo.f186500h == 0) goto L_0x0058;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List m64755t(com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawerPresenter r17, java.util.List r18) {
        /*
            r17.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r18.iterator()
            r2 = 0
            r3 = 0
        L_0x000e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00c2
            java.lang.Object r4 = r1.next()
            int r5 = r3 + 1
            r6 = 0
            if (r3 < 0) goto L_0x00be
            sq1.e r4 = (sq1.C64151e) r4
            r0.add(r4)
            sq1.b r7 = r4.f181868d
            te3.ye0 r8 = r7.field_actionInfo
            long r8 = r8.f186500h
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x00b7
            java.util.LinkedList r7 = r7.mo88881s2()
            int r7 = r7.size()
            if (r7 <= 0) goto L_0x00b7
            int r7 = r18.size()
            r8 = 1
            int r7 = r7 - r8
            if (r3 >= r7) goto L_0x0056
            r3 = r18
            java.lang.Object r7 = r3.get(r5)
            sq1.e r7 = (sq1.C64151e) r7
            sq1.b r7 = r7.f181868d
            te3.ye0 r7 = r7.field_actionInfo
            long r12 = r7.f186500h
            int r7 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r7 != 0) goto L_0x0053
            goto L_0x0058
        L_0x0053:
            r10 = r17
            goto L_0x00bb
        L_0x0056:
            r3 = r18
        L_0x0058:
            up1.f r7 = up1.C37521f.f99374d
            r7.getClass()
            pe1.c<java.lang.Integer> r7 = up1.C37521f.f99480p0
            java.lang.Object r7 = r7.mo60266n()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 != r8) goto L_0x0053
            sq1.b r7 = r4.f181868d
            java.util.LinkedList r7 = r7.mo88881s2()
            int r7 = r7.size()
            r9 = 0
        L_0x0076:
            if (r9 >= r7) goto L_0x00ab
            sq1.b r10 = r4.f181868d
            java.util.LinkedList r10 = r10.mo88881s2()
            java.lang.Object r10 = r10.remove()
            r12 = r10
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r12 = (com.tencent.p014mm.protocal.protobuf.FinderCommentInfo) r12
            pq1.a r11 = pq1.C62490a.f177529a
            java.lang.String r10 = "level2Comment"
            gy3.C87412m.m108593f(r12, r10)
            r10 = r17
            qq1.a r13 = r10.f161380h
            if (r13 == 0) goto L_0x00a5
            int r13 = r13.f179674f
            long r13 = (long) r13
            long r15 = r4.getItemId()
            sq1.e r11 = r11.mo87520b(r12, r13, r15)
            r11.f181875n = r8
            r0.add(r11)
            int r9 = r9 + 1
            goto L_0x0076
        L_0x00a5:
            java.lang.String r0 = "feedObj"
            gy3.C87412m.m108603p(r0)
            throw r6
        L_0x00ab:
            r10 = r17
            int r6 = r4.f181874j
            int r6 = r6 - r7
            r4.f181874j = r6
            if (r6 >= 0) goto L_0x00bb
            r4.f181874j = r2
            goto L_0x00bb
        L_0x00b7:
            r10 = r17
            r3 = r18
        L_0x00bb:
            r3 = r5
            goto L_0x000e
        L_0x00be:
            sx3.C64197v.m75542k()
            throw r6
        L_0x00c2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawerPresenter.m64755t(com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter, java.util.List):java.util.List");
    }

    /* renamed from: x */
    public static final void m64756x(UniCommentDrawerPresenter uniCommentDrawerPresenter, List list, C64151e eVar, boolean z) {
        int i;
        C61356g0 g0Var;
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        int i2;
        C61346b0 b0Var = uniCommentDrawerPresenter.f161378f;
        b0Var.getClass();
        C87412m.m108594g(list, "itemList");
        C87412m.m108594g(eVar, "rootComment");
        List<C64151e> c = b0Var.mo86298c(list);
        ArrayList arrayList = (ArrayList) c;
        if (arrayList.size() > 1) {
            C77813z.m93909o(c, new C61348c0());
        }
        int e = b0Var.mo86300e(eVar.f181868d.mo88875m2(), z);
        b0Var.f174500a.addAll(e, c);
        Integer valueOf = Integer.valueOf(e);
        Integer valueOf2 = Integer.valueOf(arrayList.size());
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        Log.m105924i("MicroMsg.MusicUni.DrawerPresenter", "insertLevel2CommentsAndNotify, positionInsert:" + intValue + ", itemCount:" + intValue2 + ", level2Comments size:" + list.size() + ", down:" + z + ", rootCommentId:" + eVar.getItemId());
        if (intValue2 >= 0 && intValue >= 0 && intValue < uniCommentDrawerPresenter.f161378f.mo86301f() && (i = intValue + intValue2) <= uniCommentDrawerPresenter.f161378f.mo86301f() && (g0Var = uniCommentDrawerPresenter.f161382j) != null && (recyclerView = g0Var.mo86320q().getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
            if (intValue2 > 0) {
                adapter.notifyItemRangeInserted(intValue, intValue2);
            }
            if (z && (i2 = intValue - 1) >= 0) {
                adapter.notifyItemChanged(i2, 1);
                C61356g0 g0Var2 = uniCommentDrawerPresenter.f161382j;
                if (g0Var2 != null) {
                    g0Var2.mo86320q().mo55513p(C10641n.f32053d);
                }
            } else if (!z && i < uniCommentDrawerPresenter.f161378f.mo86301f()) {
                adapter.notifyItemChanged(i, 1);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01b6 A[Catch:{ IllegalStateException -> 0x01bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0331  */
    /* renamed from: B0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo79225B0(com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawer r18, lq1.C61356g0 r19, qq1.C63317a r20, lq1.C61355g r21, int r22, boolean r23, long r24, sq1.C64147b r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = r20
            r4 = r22
            r5 = r23
            r6 = r24
            r8 = r26
            r9 = r31
            java.lang.Class<pl1.s0> r10 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r11 = ht1.C60200t1.class
            java.lang.String r12 = ""
            java.lang.Class<ht1.v4> r13 = ht1.C8808v4.class
            java.lang.String r14 = "drawer"
            gy3.C87412m.m108594g(r0, r14)
            java.lang.String r14 = "builder"
            gy3.C87412m.m108594g(r2, r14)
            java.lang.String r14 = "feedObj"
            gy3.C87412m.m108594g(r3, r14)
            r14 = 0
            r1.f161393x = r14
            java.lang.System.currentTimeMillis()
            r1.f161382j = r2
            r1.f161371B = r0
            r1.f161380h = r3
            r1.f161388s = r5
            r1.f161381i = r4
            r0 = r21
            r1.f161384o = r0
            r1.f161390u = r6
            r0 = r27
            r1.f161389t = r0
            r0 = r28
            r1.f161391v = r0
            u60.m r0 = new u60.m
            java.lang.String r14 = "UniCommentExecutor"
            r0.<init>(r14)
            r1.f161394y = r0
            r0.mo89361d()
            lq1.b0 r0 = r1.f161378f
            android.content.Context r14 = r1.f161376d
            lq1.h r15 = r2.f174524d
            r15.getCommentScene()
            r0.getClass()
            java.lang.String r15 = "context"
            gy3.C87412m.m108594g(r14, r15)
            java.util.ArrayList<sq1.e> r14 = r0.f174500a
            int r14 = r14.size()
            if (r14 <= 0) goto L_0x0071
            java.util.ArrayList<sq1.e> r0 = r0.f174500a
            r0.clear()
        L_0x0071:
            r14 = 0
            int r0 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0079
            r14 = 0
            goto L_0x007a
        L_0x0079:
            r14 = 1
        L_0x007a:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r5 = "miss cache, upContinue:"
            r15.append(r5)
            r15.append(r14)
            java.lang.String r5 = ", downContinue:"
            r15.append(r5)
            r5 = 1
            r15.append(r5)
            java.lang.String r5 = r15.toString()
            java.lang.String r15 = "MicroMsg.MusicUni.FinderCommentLoader"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r5)
            r5 = 0
            r1.f161385p = r5
            r1.mo79228J0(r14)
            r5 = 1
            r1.mo79246u0(r5)
            r1.f161395z = r5
            r14 = r29
            r1.f161370A = r14
            r1.f161372C = r9
            boolean r14 = r1.f161386q
            if (r14 == 0) goto L_0x00bf
            di3.d r14 = di3.C86312j.m106911c(r13)
            ht1.v4 r14 = (ht1.C8808v4) r14
            boolean r14 = r14.mo9635e()
            if (r14 != 0) goto L_0x00bf
            r2.mo86311h(r5)
            goto L_0x00ce
        L_0x00bf:
            r14 = 0
            r2.mo86311h(r14)
            lq1.g0 r15 = r1.f161382j
            if (r15 == 0) goto L_0x00ce
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer r15 = r15.mo86312i()
            r15.mo82529d(r5)
        L_0x00ce:
            r5 = 0
            com.tencent.mm.plugin.finder.uniComments.UniCommentFooter r14 = r19.mo86314k()
            r14.setFooterMode(r5)
            if (r0 != 0) goto L_0x00f1
            lq1.g0 r0 = r1.f161382j
            if (r0 == 0) goto L_0x00ee
            com.tencent.mm.plugin.finder.uniComments.UniCommentFooter r0 = r0.mo86314k()
            er1.w3 r5 = er1.C58784w3.f168295a
            int r6 = r1.f161381i
            java.lang.String r5 = r5.mo83955p0(r6)
            java.lang.String r6 = r3.f179672d
            r7 = 0
            r0.mo79282h(r5, r6, r7)
        L_0x00ee:
            r30 = r10
            goto L_0x0150
        L_0x00f1:
            lq1.b0 r0 = r1.f161378f
            java.util.ArrayList<sq1.e> r0 = r0.f174500a
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
        L_0x00fa:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x0117
            java.lang.Object r14 = r0.next()
            sq1.e r14 = (sq1.C64151e) r14
            long r14 = r14.getItemId()
            int r16 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r16 != 0) goto L_0x0110
            r14 = 1
            goto L_0x0111
        L_0x0110:
            r14 = 0
        L_0x0111:
            if (r14 == 0) goto L_0x0114
            goto L_0x0118
        L_0x0114:
            int r5 = r5 + 1
            goto L_0x00fa
        L_0x0117:
            r5 = -1
        L_0x0118:
            if (r5 < 0) goto L_0x00ee
            lq1.b0 r0 = r1.f161378f
            java.util.ArrayList<sq1.e> r0 = r0.f174500a
            java.lang.Object r0 = r0.get(r5)
            sq1.e r0 = (sq1.C64151e) r0
            r5 = 1
            r0.f181872h = r5
            lq1.g0 r5 = r1.f161382j
            if (r5 == 0) goto L_0x00ee
            com.tencent.mm.plugin.finder.uniComments.UniCommentFooter r5 = r5.mo86314k()
            er1.w3 r6 = er1.C58784w3.f168295a
            int r7 = r1.f161381i
            java.lang.String r7 = r6.mo83955p0(r7)
            sq1.b r14 = r0.f181868d
            java.lang.String r14 = r14.getUsername()
            sq1.b r15 = r0.f181868d
            java.lang.String r15 = r15.getNickname()
            r30 = r10
            r10 = 0
            java.lang.String r6 = r6.mo83898R(r14, r15, r10)
            sq1.b r0 = r0.f181868d
            r5.mo79255g(r7, r6, r0)
            goto L_0x0151
        L_0x0150:
            r10 = 0
        L_0x0151:
            if (r9 == 0) goto L_0x0162
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r19.mo86320q()
            r0.setEnableLoadMore(r10)
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r19.mo86320q()
            r0.setEnableRefresh(r10)
            goto L_0x0188
        L_0x0162:
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r19.mo86320q()
            di3.d r5 = di3.C86312j.m106911c(r13)
            ht1.v4 r5 = (ht1.C8808v4) r5
            boolean r5 = r5.mo9635e()
            r5 = r5 ^ 1
            r0.setEnableLoadMore(r5)
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r19.mo86320q()
            di3.d r5 = di3.C86312j.m106911c(r13)
            ht1.v4 r5 = (ht1.C8808v4) r5
            boolean r5 = r5.mo9635e()
            r5 = r5 ^ 1
            r0.setEnableRefresh(r5)
        L_0x0188:
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r19.mo86320q()
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            r5 = 0
            r0.setLayoutFrozen(r5)
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$a r0 = new com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$a
            com.tencent.mm.view.RefreshLoadMoreLayout r5 = r19.mo86320q()
            androidx.recyclerview.widget.RecyclerView r5 = r5.getRecyclerView()
            r0.<init>(r1, r5)
            r1.f161383n = r0
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UniCommentChangeEvent> r0 = r1.f161373D
            r0.alive()
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r19.mo86320q()     // Catch:{ IllegalStateException -> 0x01bc }
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()     // Catch:{ IllegalStateException -> 0x01bc }
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()     // Catch:{ IllegalStateException -> 0x01bc }
            if (r0 == 0) goto L_0x01c5
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$b r5 = r1.f161375F     // Catch:{ IllegalStateException -> 0x01bc }
            r0.registerAdapterDataObserver(r5)     // Catch:{ IllegalStateException -> 0x01bc }
            goto L_0x01c5
        L_0x01bc:
            r0 = move-exception
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "MicroMsg.MusicUni.DrawerPresenter"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r12, r5)
        L_0x01c5:
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r19.mo86320q()
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$d r5 = new com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$d
            r5.<init>(r1)
            r0.setActionCallback(r5)
            com.tencent.mm.plugin.finder.uniComments.UniCommentFooter r0 = r19.mo86314k()
            r0.setModeChangeCallback(r1)
            com.tencent.mm.plugin.finder.uniComments.UniCommentFooter r0 = r19.mo86314k()
            int r3 = r3.f179674f
            long r5 = (long) r3
            com.tencent.mm.plugin.finder.view.FinderCommentEditText r0 = r0.getEditText()
            r0.f198149F = r5
            if (r9 == 0) goto L_0x0207
            lq1.g0 r0 = r1.f161382j
            if (r0 == 0) goto L_0x01f0
            android.widget.TextView r0 = r0.mo86316m()
            goto L_0x01f1
        L_0x01f0:
            r0 = 0
        L_0x01f1:
            if (r0 != 0) goto L_0x01f4
            goto L_0x024a
        L_0x01f4:
            android.content.res.Resources r3 = r17.mo79234f0()
            if (r3 == 0) goto L_0x0202
            r5 = 2131826707(0x7f111813, float:1.9286306E38)
            java.lang.String r3 = r3.getString(r5)
            goto L_0x0203
        L_0x0202:
            r3 = 0
        L_0x0203:
            r0.setText(r3)
            goto L_0x024a
        L_0x0207:
            int r0 = r17.mo79227G()
            if (r0 > 0) goto L_0x0224
            android.widget.TextView r0 = r19.mo86316m()
            android.content.Context r3 = r19.mo86313j()
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131826285(0x7f11166d, float:1.928545E38)
            java.lang.String r3 = r3.getString(r5)
            r0.setText(r3)
            goto L_0x024a
        L_0x0224:
            android.widget.TextView r0 = r19.mo86316m()
            android.content.Context r3 = r19.mo86313j()
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131826305(0x7f111681, float:1.928549E38)
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            int r7 = r1.f161381i
            int r10 = r17.mo79227G()
            java.lang.String r7 = er1.C7878t0.m8034c(r7, r10)
            r10 = 0
            r6[r10] = r7
            java.lang.String r3 = r3.getString(r5, r6)
            r0.setText(r3)
        L_0x024a:
            com.tencent.mm.plugin.finder.uniComments.UniCommentFooter r0 = r19.mo86314k()
            android.view.View r0 = r0.getReplyBtn()
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$e r3 = new com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$e
            r3.<init>(r1, r2)
            r0.setOnClickListener(r3)
            if (r8 == 0) goto L_0x0278
            com.tencent.mm.plugin.finder.uniComments.UniCommentFooter r0 = r19.mo86314k()
            er1.w3 r3 = er1.C58784w3.f168295a
            int r5 = r1.f161381i
            java.lang.String r5 = r3.mo83955p0(r5)
            java.lang.String r6 = r26.getUsername()
            java.lang.String r7 = r26.getNickname()
            r10 = 0
            java.lang.String r3 = r3.mo83898R(r6, r7, r10)
            r0.mo79255g(r5, r3, r8)
        L_0x0278:
            lq1.g0 r0 = r1.f161382j
            if (r0 == 0) goto L_0x0285
            com.tencent.mm.plugin.finder.uniComments.UniCommentFooter r0 = r0.mo86314k()
            android.widget.ImageView r0 = r0.getAvatarView()
            goto L_0x0286
        L_0x0285:
            r0 = 0
        L_0x0286:
            if (r0 == 0) goto L_0x02ef
            r0 = 2
            if (r4 != r0) goto L_0x02a1
            lq1.g0 r0 = r1.f161382j
            if (r0 == 0) goto L_0x0298
            com.tencent.mm.plugin.finder.uniComments.UniCommentFooter r0 = r0.mo86314k()
            android.widget.ImageView r0 = r0.getAvatarView()
            goto L_0x0299
        L_0x0298:
            r0 = 0
        L_0x0299:
            java.lang.String r3 = eb0.C75592q0.m90789s()
            tl3.C78039a.m94189a(r0, r3)
            goto L_0x02ef
        L_0x02a1:
            fe1.d$b r3 = fe1.C58961d.f168673a
            zc1.b r4 = zc1.C66785b.f191882e
            java.lang.String r4 = r4.mo90662O5()
            fe1.q r3 = r3.mo84155b(r4)
            if (r3 == 0) goto L_0x02b3
            java.lang.String r12 = r3.getAvatarUrl()
        L_0x02b3:
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r4 = r3.mo62446e(r11)
            r5 = r30
            bl3.c r4 = r4.mo62447c(r5)
            pl1.s0 r4 = (pl1.C11990s0) r4
            k60.d r4 = r4.mo11872i2()
            pl1.f r6 = new pl1.f
            r7 = 0
            r6.<init>(r12, r7, r0, r7)
            lq1.g0 r0 = r1.f161382j
            if (r0 == 0) goto L_0x02d8
            com.tencent.mm.plugin.finder.uniComments.UniCommentFooter r0 = r0.mo86314k()
            android.widget.ImageView r0 = r0.getAvatarView()
            goto L_0x02d9
        L_0x02d8:
            r0 = 0
        L_0x02d9:
            gy3.C87412m.m108591d(r0)
            pl1.e0$a r7 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r3 = r3.mo62446e(r11)
            bl3.c r3 = r3.mo62447c(r5)
            pl1.s0 r3 = (pl1.C11990s0) r3
            n60.f r3 = r3.mo11867O2(r7)
            r4.mo85957c(r6, r0, r3)
        L_0x02ef:
            lq1.g0 r0 = r1.f161382j
            r3 = 8
            if (r0 == 0) goto L_0x0304
            android.widget.FrameLayout r4 = r0.mo86317n()
            r4.setVisibility(r3)
            android.view.View r0 = r0.mo86319p()
            r4 = 0
            r0.setOnClickListener(r4)
        L_0x0304:
            r0 = 2131232331(0x7f08064b, float:1.8080768E38)
            if (r9 == 0) goto L_0x0331
            android.widget.FrameLayout r4 = r19.mo86315l()
            r5 = 0
            r4.setVisibility(r5)
            com.tencent.mm.view.RefreshLoadMoreLayout r4 = r19.mo86320q()
            r4.setVisibility(r5)
            lq1.g0 r4 = r1.f161382j
            if (r4 == 0) goto L_0x0321
            com.tencent.mm.plugin.finder.uniComments.UniCommentFooter r4 = r4.mo86314k()
            goto L_0x0322
        L_0x0321:
            r4 = 0
        L_0x0322:
            if (r4 != 0) goto L_0x0325
            goto L_0x0328
        L_0x0325:
            r4.setVisibility(r3)
        L_0x0328:
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer r2 = r19.mo86312i()
            r2.setSquaresBackgroundResource(r0)
            goto L_0x03cd
        L_0x0331:
            r4 = 2131101688(0x7f0607f8, float:1.7815793E38)
            r5 = 1
            if (r23 != 0) goto L_0x0399
            r1.mo79239j0(r5)
            lq1.g0 r6 = r1.f161382j
            if (r6 == 0) goto L_0x0341
            r6.mo86322s()
        L_0x0341:
            up1.f r6 = up1.C37521f.f99374d
            r6.getClass()
            pe1.c<java.lang.Integer> r6 = up1.C37521f.f99288T0
            java.lang.Object r6 = r6.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 != r5) goto L_0x035c
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer r6 = r19.mo86312i()
            r6.setBackgroundColorRes(r4)
            goto L_0x0366
        L_0x035c:
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer r4 = r19.mo86312i()
            r6 = 2131099922(0x7f060112, float:1.781221E38)
            r4.setBackgroundColorRes(r6)
        L_0x0366:
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer r4 = r19.mo86312i()
            r4.setSquaresBackgroundResource(r0)
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r19.mo86320q()
            r4 = 0
            r0.setVisibility(r4)
            android.widget.FrameLayout r0 = r19.mo86315l()
            r0.setVisibility(r4)
            di3.d r0 = di3.C86312j.m106911c(r13)
            ht1.v4 r0 = (ht1.C8808v4) r0
            boolean r0 = r0.mo9635e()
            if (r0 == 0) goto L_0x03cd
            lq1.g0 r0 = r1.f161382j
            if (r0 == 0) goto L_0x0391
            com.tencent.mm.plugin.finder.uniComments.UniCommentFooter r0 = r0.mo86314k()
            goto L_0x0392
        L_0x0391:
            r0 = 0
        L_0x0392:
            if (r0 != 0) goto L_0x0395
            goto L_0x03cd
        L_0x0395:
            r0.setVisibility(r3)
            goto L_0x03cd
        L_0x0399:
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer r0 = r19.mo86312i()
            r0.setSquaresBackgroundResource(r4)
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer r0 = r19.mo86312i()
            r0.setBackgroundColorRes(r4)
            android.widget.FrameLayout r0 = r19.mo86315l()
            r0.setVisibility(r3)
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r19.mo86320q()
            r0.setVisibility(r3)
            com.tencent.mm.plugin.finder.view.FinderCommentEditText r0 = r17.mo79229N()
            if (r0 == 0) goto L_0x03be
            r0.requestFocus()
        L_0x03be:
            boolean r0 = r1.f161392w
            if (r0 != 0) goto L_0x03cd
            lq1.g0 r0 = r1.f161382j
            if (r0 == 0) goto L_0x03cd
            com.tencent.mm.plugin.finder.uniComments.UniCommentFooter r0 = r0.mo86314k()
            r0.mo79287m(r5)
        L_0x03cd:
            r0 = 1
            boolean r2 = r1.f161387r
            if (r2 != 0) goto L_0x03de
            lq1.g0 r2 = r1.f161382j
            if (r2 == 0) goto L_0x03de
            com.tencent.mm.view.RefreshLoadMoreLayout r2 = r2.mo86320q()
            r3 = 0
            com.tencent.p014mm.view.RefreshLoadMoreLayout.m66896C(r2, r3, r0, r3)
        L_0x03de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawerPresenter.mo79225B0(com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer, lq1.g0, qq1.a, lq1.g, int, boolean, long, sq1.b, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: C */
    public boolean mo79226C(C64151e eVar, boolean z) {
        C64151e eVar2 = eVar;
        C87412m.m108594g(eVar2, FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
        boolean z2 = false;
        if (eVar2.f181868d.field_actionInfo.f186500h != 0) {
            int i = -1;
            if (z) {
                C61346b0 b0Var = this.f161378f;
                b0Var.getClass();
                Iterator<C64151e> it = b0Var.f174500a.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C64151e next = it.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        C64151e eVar3 = next;
                        C87412m.m108594g(eVar3, "comment1");
                        if (!(eVar3.getItemId() == eVar.getItemId())) {
                            if (i >= 0 && b0Var.mo86302g(eVar3, eVar2)) {
                                Log.m105918d("MicroMsg.MusicUni.FinderCommentLoader", "hasLevel2ItemAfter cur:" + i + ", after:" + i2);
                                z2 = true;
                                break;
                            }
                        } else {
                            i = i2;
                        }
                        i2 = i3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                return !z2;
            }
            C61346b0 b0Var2 = this.f161378f;
            b0Var2.getClass();
            Iterator<C64151e> it4 = b0Var2.f174500a.iterator();
            int i4 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                C64151e next2 = it4.next();
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    C64151e eVar4 = next2;
                    C87412m.m108594g(eVar4, "comment1");
                    if (eVar4.getItemId() == eVar.getItemId()) {
                        Log.m105918d("MicroMsg.MusicUni.FinderCommentLoader", "hasLevel2ItemAfter cur:" + i4 + ", before:" + i);
                        if (i >= 0 && i < i4) {
                            z2 = true;
                        }
                    } else {
                        if (b0Var2.mo86302g(eVar4, eVar2)) {
                            i = i4;
                        }
                        i4 = i5;
                    }
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            return !z2;
        } else if (!z) {
            return false;
        } else {
            C61346b0 b0Var3 = this.f161378f;
            b0Var3.getClass();
            if (eVar.getItemId() != 0) {
                Iterator<C64151e> it5 = b0Var3.f174500a.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        if (it5.next().f181868d.field_actionInfo.f186500h == eVar.getItemId()) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            return !z2;
        }
    }

    /* renamed from: G */
    public final int mo79227G() {
        StringBuilder sb = new StringBuilder();
        sb.append("calculateCommentCount ");
        sb.append(this.f161378f.mo86301f());
        sb.append(", ");
        C63317a aVar = this.f161380h;
        if (aVar != null) {
            sb.append(aVar.f179671c);
            Log.m105924i("MicroMsg.MusicUni.DrawerPresenter", sb.toString());
            int f = this.f161378f.mo86301f() + 0;
            C63317a aVar2 = this.f161380h;
            if (aVar2 != null) {
                return Math.max(f, aVar2.f179671c);
            }
            C87412m.m108603p("feedObj");
            throw null;
        }
        C87412m.m108603p("feedObj");
        throw null;
    }

    /* renamed from: J0 */
    public final void mo79228J0(boolean z) {
        this.f161386q = z;
        Log.m105924i("MicroMsg.MusicUni.DrawerPresenter", "set upContinue " + z);
    }

    /* renamed from: N */
    public final FinderCommentEditText mo79229N() {
        C61356g0 g0Var = this.f161382j;
        if (g0Var != null) {
            return g0Var.mo86314k().getEditText();
        }
        return null;
    }

    /* renamed from: a */
    public RecyclerView.C0129l mo79230a(Context context) {
        C87412m.m108594g(context, "context");
        int[] iArr = new int[4];
        iArr[0] = (int) context.getResources().getDimension(C0966R.dimen.f3758d_);
        return new C66416a(new ColorDrawable(context.getResources().getColor(C0966R.color.BW_90)), (int) context.getResources().getDimension(C0966R.dimen.a5u), iArr, (int) context.getResources().getDimension(C0966R.dimen.a5v));
    }

    /* renamed from: c */
    public WxRecyclerAdapter<?> mo79231c(Context context) {
        C87412m.m108594g(context, "context");
        WxRecyclerAdapter<?> wxRecyclerAdapter = new WxRecyclerAdapter<>(new UniCommentDrawerPresenter$getAdapter$adapter$1(this), this.f161378f.f174500a, false);
        wxRecyclerAdapter.setHasStableIds(false);
        wxRecyclerAdapter.f173488o = this;
        wxRecyclerAdapter.f173487n = this;
        return wxRecyclerAdapter;
    }

    /* renamed from: e */
    public void mo79232e(int i, int i2) {
        C61356g0 g0Var;
        RecyclerView recyclerView;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator duration;
        Log.m105924i("MicroMsg.MusicUni.DrawerPresenter", "[onModeChange] from=" + i + " to=" + i2);
        if (i2 == 0) {
            C61356g0 g0Var2 = this.f161382j;
            if (!(g0Var2 == null || (recyclerView = g0Var2.mo86312i().getRecyclerView()) == null || (animate = recyclerView.animate()) == null || (translationY = animate.translationY(0.0f)) == null || (duration = translationY.setDuration(180)) == null)) {
                duration.start();
            }
            if (this.f161393x && (g0Var = this.f161382j) != null) {
                UniCommentFooter k = g0Var.mo86314k();
                String p0 = C58784w3.f168295a.mo83955p0(this.f161381i);
                C63317a aVar = this.f161380h;
                if (aVar != null) {
                    k.mo79282h(p0, aVar.f179672d, (Object) null);
                } else {
                    C87412m.m108603p("feedObj");
                    throw null;
                }
            }
        }
    }

    /* renamed from: f */
    public void mo79233f(View view, int i) {
        C61356g0 g0Var;
        RecyclerView recyclerView;
        C87412m.m108594g(view, "view");
        if (i < 0) {
            Log.m105924i("MicroMsg.MusicUni.DrawerPresenter", "onClickResendComment position:" + i);
        } else if (this.f161378f.mo86299d(i).f181868d.field_state == -1 && (g0Var = this.f161382j) != null && (recyclerView = g0Var.mo86320q().getRecyclerView()) != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            RecyclerView recyclerView2 = recyclerView;
            C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter", "onClickResendComment", "(Landroid/view/View;I)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter", "onClickResendComment", "(Landroid/view/View;I)V", "Undefined", "scrollToPosition", "(I)V");
        }
    }

    /* renamed from: f0 */
    public final Resources mo79234f0() {
        C61356g0 g0Var = this.f161382j;
        if (g0Var != null) {
            return g0Var.mo86313j().getResources();
        }
        return null;
    }

    /* renamed from: g */
    public int mo79235g() {
        return this.f161381i;
    }

    public int getCommentScene() {
        return this.f161381i;
    }

    /* renamed from: h */
    public boolean mo79237h() {
        return this.f161370A;
    }

    /* renamed from: i0 */
    public void mo79238i0(C64151e eVar, boolean z) {
        C87412m.m108594g(eVar, "rootComment");
        if (z) {
            LinkedList<FinderCommentInfo> s2 = eVar.f181868d.mo88881s2();
            if (!Util.isNullOrNil((List) s2)) {
                Iterator<C64151e> it = this.f161378f.f174500a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().f181868d.mo88875m2() == s2.getFirst().commentId) {
                            break;
                        }
                    } else {
                        C65233m mVar = this.f161394y;
                        if (mVar != null) {
                            mVar.mo11856a(new C14121l(new C61372m(s2, this, eVar), (String) null, 2, (C8480h) null));
                        }
                    }
                }
            }
        }
        C65233m mVar2 = this.f161394y;
        if (mVar2 != null) {
            mVar2.mo11856a(new C14121l(new C56451c(eVar, this, z), (String) null, 2, (C8480h) null));
        }
    }

    /* renamed from: j0 */
    public final void mo79239j0(boolean z) {
        if (((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
            Log.m105924i("MicroMsg.MusicUni.DrawerPresenter", "refreshData " + z + " return for teen mode");
            return;
        }
        C65233m mVar = this.f161394y;
        if (mVar != null) {
            mVar.mo11856a(new C14121l(new C56457g(z, this), (String) null, 2, (C8480h) null));
        }
    }

    public void keep(C9486a aVar) {
        C87412m.m108594g(aVar, "p0");
        this.f161379g.add(aVar);
    }

    /* renamed from: m1 */
    public void mo79240m1(View view, C64151e eVar) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(eVar, "item");
        C77407n nVar = new C77407n(view.getContext(), 1, false);
        C63317a aVar = this.f161380h;
        if (aVar != null) {
            nVar.f225771i = new C61350d0(eVar, aVar.f179673e);
            nVar.f225782p = new C61354f0(eVar, this.f161377e, new C56456f(this));
            nVar.mo107573q();
            return;
        }
        C87412m.m108603p("feedObj");
        throw null;
    }

    /* renamed from: n */
    public boolean mo759n(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g((C60905o) zVar, "holder");
        if (!this.f161392w) {
            if (i < 0) {
                Log.m105924i("MicroMsg.MusicUni.DrawerPresenter", "onItemLongClick position:" + i);
            } else {
                C64151e d = this.f161378f.mo86299d(i);
                C78253a aVar = new C78253a(this.f161376d);
                C63317a aVar2 = this.f161380h;
                if (aVar2 != null) {
                    String str = aVar2.f179673e;
                    boolean z = true;
                    if (this.f161381i != 1) {
                        z = false;
                    }
                    aVar.mo108272g(view, 0, 0, new C61352e0(d, str, z), new C61354f0(d, this.f161377e, new C61376r(this)), TouchableLayout.f24959d, TouchableLayout.f24960e);
                } else {
                    C87412m.m108603p("feedObj");
                    throw null;
                }
            }
        }
        return false;
    }

    /* renamed from: n0 */
    public final void mo79241n0() {
        String str = null;
        if (this.f161372C) {
            C61356g0 g0Var = this.f161382j;
            TextView m = g0Var != null ? g0Var.mo86316m() : null;
            if (m != null) {
                Resources f0 = mo79234f0();
                if (f0 != null) {
                    str = f0.getString(C0966R.string.dac);
                }
                m.setText(str);
            }
        } else if (mo79227G() <= 0) {
            C61356g0 g0Var2 = this.f161382j;
            TextView m2 = g0Var2 != null ? g0Var2.mo86316m() : null;
            if (m2 != null) {
                Resources f05 = mo79234f0();
                if (f05 != null) {
                    str = f05.getString(C0966R.string.d3h);
                }
                m2.setText(str);
            }
        } else {
            C61356g0 g0Var3 = this.f161382j;
            TextView m3 = g0Var3 != null ? g0Var3.mo86316m() : null;
            if (m3 != null) {
                Resources f06 = mo79234f0();
                if (f06 != null) {
                    str = f06.getString(C0966R.string.d3o, new Object[]{String.valueOf(mo79227G())});
                }
                m3.setText(str);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r4 = r4.mo86320q().getRecyclerView();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDetach() {
        /*
            r11 = this;
            boolean r0 = r11.f161393x
            java.lang.String r1 = "MicroMsg.MusicUni.DrawerPresenter"
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "onDetach: can not detach, because it is not attached"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return
        L_0x000c:
            r0 = 1
            r11.f161393x = r0
            r2 = 0
            r11.f161395z = r2
            u60.m r3 = r11.f161394y
            if (r3 == 0) goto L_0x0019
            r3.mo89362e()
        L_0x0019:
            r3 = 0
            r11.f161394y = r3
            lq1.g0 r4 = r11.f161382j
            if (r4 == 0) goto L_0x002f
            com.tencent.mm.view.RefreshLoadMoreLayout r4 = r4.mo86320q()
            androidx.recyclerview.widget.RecyclerView r4 = r4.getRecyclerView()
            if (r4 == 0) goto L_0x002f
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r4.getLayoutManager()
            goto L_0x0030
        L_0x002f:
            r4 = r3
        L_0x0030:
            boolean r4 = r4 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L_0x0052
            lq1.g0 r4 = r11.f161382j
            if (r4 == 0) goto L_0x0047
            com.tencent.mm.view.RefreshLoadMoreLayout r4 = r4.mo86320q()
            androidx.recyclerview.widget.RecyclerView r4 = r4.getRecyclerView()
            if (r4 == 0) goto L_0x0047
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r4.getLayoutManager()
            goto L_0x0048
        L_0x0047:
            r4 = r3
        L_0x0048:
            java.lang.String r5 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            gy3.C87412m.m108592e(r4, r5)
            androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
            r4.mo16957C()
        L_0x0052:
            lq1.g0 r4 = r11.f161382j
            if (r4 == 0) goto L_0x005b
            com.tencent.mm.plugin.finder.uniComments.UniCommentFooter r4 = r4.mo86314k()
            goto L_0x005c
        L_0x005b:
            r4 = r3
        L_0x005c:
            if (r4 != 0) goto L_0x005f
            goto L_0x0062
        L_0x005f:
            r4.setFooterMode(r2)
        L_0x0062:
            lq1.g0 r4 = r11.f161382j
            if (r4 == 0) goto L_0x007b
            com.tencent.mm.view.RefreshLoadMoreLayout r4 = r4.mo86320q()
            androidx.recyclerview.widget.RecyclerView r4 = r4.getRecyclerView()
            if (r4 == 0) goto L_0x007b
            androidx.recyclerview.widget.RecyclerView$e r4 = r4.getAdapter()
            if (r4 == 0) goto L_0x007b
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$b r5 = r11.f161375F
            r4.unregisterAdapterDataObserver(r5)
        L_0x007b:
            java.util.concurrent.CopyOnWriteArraySet<jp3.a> r4 = r11.f161379g
            java.util.Iterator r4 = r4.iterator()
        L_0x0081:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0091
            java.lang.Object r5 = r4.next()
            jp3.a r5 = (jp3.C9486a) r5
            r5.dead()
            goto L_0x0081
        L_0x0091:
            java.util.concurrent.CopyOnWriteArraySet<jp3.a> r4 = r11.f161379g
            r4.clear()
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UniCommentChangeEvent> r4 = r11.f161373D
            r4.dead()
            qq1.a r4 = r11.f161380h
            java.lang.String r5 = "feedObj"
            if (r4 == 0) goto L_0x01b8
            int r6 = r11.mo79227G()
            r4.f179671c = r6
            java.util.Map<java.lang.Long, qq1.a> r4 = lq1.C34338b.f92508a
            qq1.a r4 = r11.f161380h
            if (r4 == 0) goto L_0x01b4
            java.util.Map<java.lang.Long, qq1.a> r6 = lq1.C34338b.f92508a
            java.lang.String r7 = "cacheItems"
            gy3.C87412m.m108593f(r6, r7)
            long r7 = r4.mo88217a()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r6.put(r7, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "[onDetach] updateFeedCommentCount feedId="
            r4.append(r6)
            qq1.a r6 = r11.f161380h
            if (r6 == 0) goto L_0x01b0
            int r5 = r6.f179674f
            long r5 = (long) r5
            r4.append(r5)
            java.lang.String r5 = " commentCount "
            r4.append(r5)
            int r5 = r11.mo79227G()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            lq1.g r1 = r11.f161384o
            if (r1 == 0) goto L_0x00f5
            int r4 = r11.mo79227G()
            lq1.b0 r5 = r11.f161378f
            java.util.ArrayList<sq1.e> r5 = r5.f174500a
            r1.mo86310a(r4, r5)
        L_0x00f5:
            boolean r1 = r11.f161388s
            if (r1 != 0) goto L_0x013c
            boolean r1 = r11.f161389t
            if (r1 != 0) goto L_0x00fe
            goto L_0x013c
        L_0x00fe:
            long r4 = r11.f161390u
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x0131
            lq1.b0 r1 = r11.f161378f
            java.util.ArrayList<sq1.e> r1 = r1.f174500a
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
        L_0x010f:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0131
            java.lang.Object r5 = r1.next()
            int r6 = r4 + 1
            if (r4 < 0) goto L_0x012d
            sq1.e r5 = (sq1.C64151e) r5
            long r7 = r5.getItemId()
            long r9 = r11.f161390u
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x012b
            r5.f181873i = r2
        L_0x012b:
            r4 = r6
            goto L_0x010f
        L_0x012d:
            sx3.C64197v.m75542k()
            throw r3
        L_0x0131:
            lq1.b0 r1 = r11.f161378f
            r1.getClass()
            java.util.ArrayList<sq1.e> r1 = r1.f174500a
            r1.clear()
            goto L_0x0143
        L_0x013c:
            lq1.b0 r1 = r11.f161378f
            java.util.ArrayList<sq1.e> r1 = r1.f174500a
            r1.clear()
        L_0x0143:
            r11.f161385p = r3
            r11.mo79228J0(r2)
            r11.mo79246u0(r0)
            com.tencent.mm.plugin.finder.view.FinderCommentEditText r1 = r11.mo79229N()
            if (r1 != 0) goto L_0x0152
            goto L_0x0155
        L_0x0152:
            r1.setText(r3)
        L_0x0155:
            com.tencent.mm.plugin.finder.view.FinderCommentEditText r1 = r11.mo79229N()
            if (r1 == 0) goto L_0x0162
            java.util.Map<java.lang.Long, java.util.LinkedList<java.lang.String>> r1 = r1.f198148E
            java.util.HashMap r1 = (java.util.HashMap) r1
            r1.clear()
        L_0x0162:
            lq1.g0 r1 = r11.f161382j
            if (r1 == 0) goto L_0x016b
            com.tencent.mm.view.RefreshLoadMoreLayout r1 = r1.mo86320q()
            goto L_0x016c
        L_0x016b:
            r1 = r3
        L_0x016c:
            if (r1 != 0) goto L_0x016f
            goto L_0x0172
        L_0x016f:
            r1.setHasBottomMore(r0)
        L_0x0172:
            lq1.g0 r1 = r11.f161382j
            if (r1 == 0) goto L_0x0189
            com.tencent.mm.view.RefreshLoadMoreLayout r1 = r1.mo86320q()
            androidx.recyclerview.widget.RecyclerView r1 = r1.getRecyclerView()
            if (r1 == 0) goto L_0x0189
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            if (r1 == 0) goto L_0x0189
            r1.notifyDataSetChanged()
        L_0x0189:
            lq1.g0 r1 = r11.f161382j
            if (r1 == 0) goto L_0x0196
            com.tencent.mm.view.RefreshLoadMoreLayout r1 = r1.mo86320q()
            androidx.recyclerview.widget.RecyclerView r1 = r1.getRecyclerView()
            goto L_0x0197
        L_0x0196:
            r1 = r3
        L_0x0197:
            if (r1 != 0) goto L_0x019a
            goto L_0x019d
        L_0x019a:
            r1.setLayoutFrozen(r0)
        L_0x019d:
            lq1.g0 r0 = r11.f161382j
            if (r0 == 0) goto L_0x01a6
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r0.mo86320q()
            goto L_0x01a7
        L_0x01a6:
            r0 = r3
        L_0x01a7:
            if (r0 != 0) goto L_0x01aa
            goto L_0x01ad
        L_0x01aa:
            r0.setActionCallback(r3)
        L_0x01ad:
            r11.f161382j = r3
            return
        L_0x01b0:
            gy3.C87412m.m108603p(r5)
            throw r3
        L_0x01b4:
            gy3.C87412m.m108603p(r5)
            throw r3
        L_0x01b8:
            gy3.C87412m.m108603p(r5)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawerPresenter.onDetach():void");
    }

    /* renamed from: p */
    public int mo79242p() {
        ArrayList<C64151e> arrayList = this.f161378f.f174500a;
        if (Util.isNullOrNil((List) arrayList)) {
            return -1;
        }
        Iterator<C64151e> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            C64151e next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                C64147b bVar = next.f181868d;
                if (bVar.field_actionInfo.f186500h == 0) {
                    boolean z = true;
                    if ((bVar.mo88876n2().extFlag & 1) <= 0) {
                        z = false;
                    }
                    if (!z) {
                        return i;
                    }
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        View view2 = view;
        int i2 = i;
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view2, "view");
        C87412m.m108594g(oVar, "holder");
        if (oVar.f44859i == 3 || this.f161392w) {
            return;
        }
        if (i2 < 0) {
            Log.m105924i("MicroMsg.MusicUni.DrawerPresenter", "onItemClick position:" + i2);
            return;
        }
        C64151e d = this.f161378f.mo86299d(i2);
        if (!d.f181870f || !((FinderCollapsibleTextView) oVar.mo85812D(C0966R.C0970id.bj4)).mo23659g()) {
            int i3 = d.f181868d.field_state;
            if ((i3 == 1 || i3 == -1) ? false : true) {
                C61356g0 g0Var = this.f161382j;
                if (g0Var != null) {
                    UniCommentFooter k = g0Var.mo86314k();
                    int i4 = this.f161381i;
                    C64147b bVar = d.f181868d;
                    boolean z = i4 == 2;
                    C87412m.m108594g(bVar, "commentObj");
                    if (z) {
                        String str = k.f161418G;
                        k.mo79254f(str, ' ' + k.getResources().getString(C0966R.string.bih, new Object[]{k.mo79283i(C58784w3.m68433S(C58784w3.f168295a, bVar.getUsername(), bVar.getNickname(), false, 4, (Object) null))}), bVar, true);
                    } else {
                        String str2 = k.f161418G;
                        k.mo79254f(str2, ' ' + k.getResources().getString(C0966R.string.bih, new Object[]{k.mo79283i(bVar.getNickname())}), bVar, true);
                    }
                    k.getEditText().setShowSoftInputOnFocus(true);
                    k.getEditText().requestFocus();
                    k.mo79287m(true);
                }
                Rect rect = new Rect();
                view2.getGlobalVisibleRect(rect);
                int i5 = rect.bottom;
                C61356g0 g0Var2 = this.f161382j;
                RecyclerView recyclerView = null;
                UniCommentDrawer i6 = g0Var2 != null ? g0Var2.mo86312i() : null;
                C87412m.m108591d(i6);
                i6.getGlobalVisibleRect(rect);
                int i7 = rect.bottom - i5;
                C61356g0 g0Var3 = this.f161382j;
                UniCommentFooter k2 = g0Var3 != null ? g0Var3.mo86314k() : null;
                C87412m.m108591d(k2);
                if (i7 < k2.getHeight()) {
                    int height = i7 - k2.getHeight();
                    C61356g0 g0Var4 = this.f161382j;
                    if (g0Var4 != null) {
                        recyclerView = g0Var4.mo86312i().getRecyclerView();
                    }
                    C87412m.m108591d(recyclerView);
                    recyclerView.animate().translationY((float) height).setDuration(90).start();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        r9 = new java.util.concurrent.ConcurrentHashMap();
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo79243r(android.widget.ImageView r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            java.lang.String r2 = "view"
            r3 = r19
            gy3.C87412m.m108594g(r3, r2)
            if (r1 >= 0) goto L_0x000f
            return
        L_0x000f:
            lq1.b0 r2 = r0.f161378f
            sq1.e r2 = r2.mo86299d(r1)
            mq1.e r3 = mq1.C61557e.f174962f
            qq1.a r4 = r0.f161380h
            java.lang.String r5 = "feedObj"
            r6 = 0
            if (r4 == 0) goto L_0x00c4
            int r4 = r4.f179674f
            long r7 = (long) r4
            sq1.b r4 = r2.f181868d
            int r9 = r0.f161381i
            boolean r4 = r3.mo86493b(r7, r4, r9)
            r7 = 1
            r11 = r4 ^ 1
            rq1.a r12 = rq1.C63488a.f180084a
            qq1.a r4 = r0.f161380h
            if (r4 == 0) goto L_0x00c0
            te3.kb1 r13 = r4.f179676h
            if (r11 == 0) goto L_0x0039
            r8 = 3
            goto L_0x003b
        L_0x0039:
            r8 = 4
        L_0x003b:
            r14 = r8
            r16 = 1
            r12.mo88342a(r13, r14, r16)
            android.content.Context r4 = r0.f161376d
            boolean r4 = r4 instanceof com.tencent.p014mm.p136ui.MMFragmentActivity
            if (r4 == 0) goto L_0x00a4
            int r4 = r0.f161381i
            r8 = 2
            if (r4 != r8) goto L_0x004e
            r4 = 2
            goto L_0x0050
        L_0x004e:
            r8 = 3
            r4 = 3
        L_0x0050:
            qq1.a r14 = r0.f161380h
            if (r14 == 0) goto L_0x00a0
            sq1.b r2 = r2.f181868d
            java.lang.String r5 = "comment"
            gy3.C87412m.m108594g(r2, r5)
            mq1.i r5 = new mq1.i
            r13 = 0
            r8 = r5
            r9 = r14
            r10 = r2
            r12 = r4
            r8.<init>(r9, r10, r11, r12, r13)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.concurrent.ConcurrentHashMap<mq1.e$b, mq1.i>> r6 = r3.f174965c
            long r8 = r14.mo88217a()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.Object r9 = r6.get(r8)
            if (r9 != 0) goto L_0x0082
            java.util.concurrent.ConcurrentHashMap r9 = new java.util.concurrent.ConcurrentHashMap
            r9.<init>()
            java.lang.Object r6 = r6.putIfAbsent(r8, r9)
            if (r6 != 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r9 = r6
        L_0x0082:
            java.util.concurrent.ConcurrentHashMap r9 = (java.util.concurrent.ConcurrentHashMap) r9
            mq1.e$b r6 = new mq1.e$b
            long r10 = r2.mo88875m2()
            r6.<init>(r10, r4)
            r9.put(r6, r5)
            u60.f<mq1.g> r2 = r3.f174963a
            mq1.g r4 = new mq1.g
            r4.<init>(r5)
            mq1.f r6 = new mq1.f
            r6.<init>(r3, r5)
            r2.mo89349c(r4, r6)
            goto L_0x00a4
        L_0x00a0:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x00a4:
            lq1.g0 r2 = r0.f161382j
            if (r2 == 0) goto L_0x00bf
            com.tencent.mm.view.RefreshLoadMoreLayout r2 = r2.mo86320q()
            androidx.recyclerview.widget.RecyclerView r2 = r2.getRecyclerView()
            if (r2 == 0) goto L_0x00bf
            androidx.recyclerview.widget.RecyclerView$e r2 = r2.getAdapter()
            if (r2 == 0) goto L_0x00bf
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r2.notifyItemChanged(r1, r3)
        L_0x00bf:
            return
        L_0x00c0:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x00c4:
            gy3.C87412m.m108603p(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawerPresenter.mo79243r(android.widget.ImageView, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (((r0.mo88876n2().extFlag & 1) > 0) == true) goto L_0x0028;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo79244s() {
        /*
            r3 = this;
            lq1.b0 r0 = r3.f161378f
            java.util.ArrayList<sq1.e> r0 = r0.f174500a
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            r2 = 0
            if (r1 != 0) goto L_0x002b
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            sq1.e r0 = (sq1.C64151e) r0
            r1 = 1
            if (r0 == 0) goto L_0x0027
            sq1.b r0 = r0.f181868d
            if (r0 == 0) goto L_0x0027
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r0 = r0.mo88876n2()
            int r0 = r0.extFlag
            r0 = r0 & r1
            if (r0 <= 0) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 != r1) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r2 = -1
        L_0x002c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawerPresenter.mo79244s():int");
    }

    /* renamed from: u */
    public C63317a mo79245u() {
        C63317a aVar = this.f161380h;
        if (aVar != null) {
            return aVar;
        }
        C87412m.m108603p("feedObj");
        throw null;
    }

    /* renamed from: u0 */
    public final void mo79246u0(boolean z) {
        this.f161387r = z;
        Log.m105924i("MicroMsg.MusicUni.DrawerPresenter", "set downContinue " + z);
    }

    /* renamed from: u1 */
    public void mo79247u1(int i) {
        ArrayList<C64151e> arrayList = this.f161378f.f174500a;
        Log.m105924i("MicroMsg.MusicUni.DrawerPresenter", "preloadNextPage, onScrollIdle, lastVisiblePosition:" + i + ", dataList size:" + arrayList.size() + ", canPreload:" + this.f161395z);
        if (i >= 0 && i < arrayList.size()) {
            arrayList.size();
            C37521f.f99374d.mo61183i();
        }
    }

    /* renamed from: v */
    public C64151e mo79248v(long j) {
        boolean z;
        T t = null;
        if (j == 0) {
            return null;
        }
        Iterator<T> it = this.f161378f.f174500a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((C64151e) next).f181868d.mo88875m2() == j) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                t = next;
                break;
            }
        }
        return (C64151e) t;
    }
}
