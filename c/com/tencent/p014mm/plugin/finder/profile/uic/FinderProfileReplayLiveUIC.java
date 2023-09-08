package com.tencent.p014mm.plugin.finder.profile.uic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import cm1.C0782u0;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.live.loader.FinderProfileLiveUserPageLoader;
import com.tencent.p014mm.plugin.finder.profile.FinderProfileLayoutConfig;
import com.tencent.p014mm.plugin.finder.profile.FinderProfileLayoutConfig$getItemConvertFactory$1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60192p2;
import ht1.C60200t1;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import jq3.C60896i;
import jq3.C60898l;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import lt1.C10652c;
import lt1.C61401a;
import lt1.C61402b;
import mo1.C11048r1;
import mo1.C11062x;
import nj3.C76912y0;
import o40.C61926c;
import org.json.JSONObject;
import p172io.flutter.embedding.android.PatchedFlutterActivity;
import p565ir.C60606n;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sk1.C63947a;
import te3.C64273c21;
import tf0.C13887q1;
import ye1.C15984y;
import zc1.C66785b;
import zp3.C16380c;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC */
public final class FinderProfileReplayLiveUIC extends C11062x {

    /* renamed from: o */
    public final String f16339o = "FinderProfileReplayLiveUIC";

    /* renamed from: p */
    public final C13601g f16340p = C36568h.m40985a(new C3523j(this));

    /* renamed from: q */
    public final C13601g f16341q = C36568h.m40985a(new C3522i(this));

    /* renamed from: r */
    public final C13601g f16342r = C36568h.m40985a(new C3521h(this));

    /* renamed from: s */
    public final C13601g f16343s = C36568h.m40985a(new C3515b(this));

    /* renamed from: t */
    public final C13601g f16344t = C36568h.m40985a(new C3516c(this));

    /* renamed from: u */
    public final C13601g f16345u = C36568h.m40985a(new C3514a(this));

    /* renamed from: v */
    public int f16346v = 1;

    /* renamed from: w */
    public final FinderProfileReplayLiveUIC$feedChangeListener$1 f16347w = new FinderProfileReplayLiveUIC$feedChangeListener$1(this, C40008f.f107254d);

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC$a */
    public static final class C3514a extends C87413o implements C32224a<C16380c> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileReplayLiveUIC f16348d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3514a(FinderProfileReplayLiveUIC finderProfileReplayLiveUIC) {
            super(0);
            this.f16348d = finderProfileReplayLiveUIC;
        }

        public Object invoke() {
            RefreshLoadMoreLayout e3 = this.f16348d.mo3851e3();
            C87412m.m108593f(e3, "rlLayout");
            return new C16380c(e3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC$b */
    public static final class C3515b extends C87413o implements C32224a<FinderProfileLiveUserPageLoader> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileReplayLiveUIC f16349d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3515b(FinderProfileReplayLiveUIC finderProfileReplayLiveUIC) {
            super(0);
            this.f16349d = finderProfileReplayLiveUIC;
        }

        public Object invoke() {
            String username = this.f16349d.getUsername();
            C87412m.m108591d(username);
            return new FinderProfileLiveUserPageLoader(username, C66785b.f191882e.mo90662O5(), true, this.f16349d.getContextObj());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC$c */
    public static final class C3516c extends C87413o implements C32224a<FinderProfileLayoutConfig> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileReplayLiveUIC f16350d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3516c(FinderProfileReplayLiveUIC finderProfileReplayLiveUIC) {
            super(0);
            this.f16350d = finderProfileReplayLiveUIC;
        }

        public Object invoke() {
            return new FinderProfileLayoutConfig(this.f16350d.getActivity(), this.f16350d.isSelfFlag(), 2, false, 8, (C8480h) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC$d */
    public static final class C3517d extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public final /* synthetic */ FinderProfileReplayLiveUIC f16351a;

        public C3517d(FinderProfileReplayLiveUIC finderProfileReplayLiveUIC) {
            this.f16351a = finderProfileReplayLiveUIC;
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            BaseFeedLoader.requestLoadMore$default(this.f16351a.mo3849c3(), false, 1, (Object) null);
        }

        /* renamed from: d */
        public void mo3680d(int i) {
            this.f16351a.mo3849c3().requestRefresh();
        }

        /* renamed from: e */
        public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            RecyclerView recyclerView = this.f16351a.mo3851e3().getRecyclerView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileReplayLiveUIC$onCreate$1", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileReplayLiveUIC$onCreate$1", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "Undefined", "scrollToPosition", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC$e */
    public static final class C3518e implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileReplayLiveUIC f16352d;

        public C3518e(FinderProfileReplayLiveUIC finderProfileReplayLiveUIC) {
            this.f16352d = finderProfileReplayLiveUIC;
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            Integer num;
            Integer num2;
            C13598b0 b0Var;
            View view2 = view;
            int i2 = i;
            C60905o oVar = (C60905o) zVar;
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view2, "view");
            C87412m.m108594g(oVar, "holder");
            Object obj = oVar.f173503E;
            C0782u0 u0Var = obj instanceof C0782u0 ? (C0782u0) obj : null;
            int i3 = 0;
            if (u0Var == null || !u0Var.mo727d()) {
                String str = this.f16352d.f16339o;
                StringBuilder sb = new StringBuilder();
                sb.append("click pos:");
                sb.append(i2);
                sb.append(" feed is null:");
                sb.append(u0Var == null);
                sb.append(",replay status:");
                if (u0Var != null) {
                    C64273c21 c212 = u0Var.f1833d.liveInfo;
                    num = Integer.valueOf(c212 != null ? c212.f182366L : 0);
                } else {
                    num = null;
                }
                sb.append(num);
                sb.append('!');
                Log.m105920e(str, sb.toString());
                if (C58739j4.f168176a.mo83692U()) {
                    Activity context = this.f16352d.getContext();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Debug,error replay_status:");
                    if (u0Var != null) {
                        C64273c21 c213 = u0Var.f1833d.liveInfo;
                        if (c213 != null) {
                            i3 = c213.f182366L;
                        }
                        num2 = Integer.valueOf(i3);
                    } else {
                        num2 = null;
                    }
                    sb4.append(num2);
                    C76912y0.m92773l(context, sb4.toString());
                }
            } else {
                DataBuffer dataListJustForAdapter = this.f16352d.mo3849c3().getDataListJustForAdapter();
                ArrayList arrayList = new ArrayList();
                Iterator it = dataListJustForAdapter.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof C0782u0) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    if (((C0782u0) next2).mo727d()) {
                        arrayList2.add(next2);
                    }
                }
                FinderProfileReplayLiveUIC finderProfileReplayLiveUIC = this.f16352d;
                finderProfileReplayLiveUIC.getClass();
                Class cls = C13887q1.class;
                Class cls2 = C60192p2.class;
                int indexOf = arrayList2.indexOf(u0Var);
                if (indexOf != i2) {
                    String str2 = finderProfileReplayLiveUIC.f16339o;
                    Log.m105924i(str2, "replay_step1:jumpToReplayLive feed:" + C63947a.f181274a.mo88735u(u0Var.f1833d, i2) + ", pos from:" + i2 + " to " + indexOf);
                } else {
                    String str3 = finderProfileReplayLiveUIC.f16339o;
                    Log.m105924i(str3, "replay_step1:jumpToReplayLive feed:" + C63947a.f181274a.mo88735u(u0Var.f1833d, i2));
                }
                if (indexOf == -1) {
                    Log.m105920e(finderProfileReplayLiveUIC.f16339o, "replay_step1-1:change newPos to 0!");
                    indexOf = 0;
                }
                Intent intent = new Intent();
                intent.putExtra("KEY_PARAMS_KEY_VALUE", C0782u0.f1832e.mo728a(arrayList2, finderProfileReplayLiveUIC.mo3849c3().getLastBuffer(), finderProfileReplayLiveUIC.f16346v, indexOf).toByteArray());
                intent.putExtra("KEY_PARAMS_SOURCE_TYPE", 2);
                String username = finderProfileReplayLiveUIC.getUsername();
                if (username == null) {
                    username = "";
                }
                intent.putExtra("finder_username", username);
                ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83773T5(intent, Scopes.PROFILE, 0);
                long j = u0Var.f1833d.f164794id;
                ImageView imageView = (ImageView) view2.findViewById(C0966R.C0970id.ip7);
                boolean Xl0 = ((C60192p2) C86312j.m106911c(cls2)).Xl0();
                if (imageView == null || !Xl0) {
                    C7335d c = C86312j.m106911c(cls);
                    C87412m.m108593f(c, "getService(IFinderCommonLiveService::class.java)");
                    C13887q1.C13888a.m13308d((C13887q1) c, finderProfileReplayLiveUIC.getActivity(), intent, false, 4, (Object) null);
                } else {
                    C61401a aVar = C61401a.FINDER_REPLAY;
                    ViewParent parent = imageView.getParent();
                    C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    C10652c Pz = ((C60192p2) C86312j.m106911c(cls2)).mo85193Pz(aVar, j, (ViewGroup) parent, imageView, "", !((C60606n) C86312j.m106911c(C60606n.class)).mo85008I1(u0Var.f1833d.liveInfo), u0Var.f1833d.liveInfo);
                    Context context2 = view.getContext();
                    C87412m.m108593f(context2, "view.context");
                    C61402b co = ((C60192p2) C86312j.m106911c(cls2)).mo85196co(context2, Pz);
                    if (co != null) {
                        co.mo84323h(new C11048r1(intent, j, finderProfileReplayLiveUIC));
                        b0Var = C13598b0.f38549a;
                    } else {
                        b0Var = null;
                    }
                    if (b0Var == null) {
                        C7335d c2 = C86312j.m106911c(cls);
                        C87412m.m108593f(c2, "getService(IFinderCommonLiveService::class.java)");
                        C13887q1.C13888a.m13308d((C13887q1) c2, finderProfileReplayLiveUIC.getActivity(), intent, false, 4, (Object) null);
                    }
                }
            }
            if (u0Var != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("object_id", C61926c.m72691p(u0Var.f1833d.f164794id));
                jSONObject.put(PatchedFlutterActivity.EXTRA_PAGE_TYPE, Scopes.PROFILE);
                if (u0Var.mo726b()) {
                    jSONObject.put("object_type", 1);
                } else {
                    jSONObject.put("object_type", 2);
                }
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "this.toString()");
                ((C8777j5) C86312j.m106911c(C8777j5.class)).hg0("watch_live_record", jSONObject2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC$f */
    public static final class C3519f extends C23555k.C23558c {

        /* renamed from: a */
        public final HashSet<Long> f16353a = new HashSet<>();

        /* renamed from: d */
        public boolean mo777d() {
            return true;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: cm1.u0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo778e(android.view.View r5, java.util.List<? extends androidx.recyclerview.widget.RecyclerView.C16631z> r6) {
            /*
                r4 = this;
                java.lang.String r0 = "parent"
                gy3.C87412m.m108594g(r5, r0)
                java.lang.String r5 = "exposedHolders"
                gy3.C87412m.m108594g(r6, r5)
                java.util.Iterator r5 = r6.iterator()
            L_0x000e:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x0092
                java.lang.Object r6 = r5.next()
                androidx.recyclerview.widget.RecyclerView$z r6 = (androidx.recyclerview.widget.RecyclerView.C16631z) r6
                boolean r0 = r6 instanceof jq3.C60905o
                r1 = 0
                if (r0 == 0) goto L_0x0022
                jq3.o r6 = (jq3.C60905o) r6
                goto L_0x0023
            L_0x0022:
                r6 = r1
            L_0x0023:
                if (r6 == 0) goto L_0x000e
                java.lang.Object r6 = r6.f173503E
                boolean r0 = r6 instanceof cm1.C0782u0
                if (r0 == 0) goto L_0x002e
                r1 = r6
                cm1.u0 r1 = (cm1.C0782u0) r1
            L_0x002e:
                if (r1 == 0) goto L_0x000e
                java.util.HashSet<java.lang.Long> r6 = r4.f16353a
                com.tencent.mm.protocal.protobuf.FinderObject r0 = r1.f1833d
                long r2 = r0.f164794id
                java.lang.Long r0 = java.lang.Long.valueOf(r2)
                boolean r6 = r6.contains(r0)
                if (r6 == 0) goto L_0x0041
                goto L_0x000e
            L_0x0041:
                java.util.HashSet<java.lang.Long> r6 = r4.f16353a
                com.tencent.mm.protocal.protobuf.FinderObject r0 = r1.f1833d
                long r2 = r0.f164794id
                java.lang.Long r0 = java.lang.Long.valueOf(r2)
                r6.add(r0)
                org.json.JSONObject r6 = new org.json.JSONObject
                r6.<init>()
                com.tencent.mm.protocal.protobuf.FinderObject r0 = r1.f1833d
                long r2 = r0.f164794id
                java.lang.String r0 = o40.C61926c.m72691p(r2)
                java.lang.String r2 = "object_id"
                r6.put(r2, r0)
                java.lang.String r0 = "page_type"
                java.lang.String r2 = "profile"
                r6.put(r0, r2)
                boolean r0 = r1.mo726b()
                java.lang.String r1 = "object_type"
                if (r0 == 0) goto L_0x0074
                r0 = 1
                r6.put(r1, r0)
                goto L_0x0078
            L_0x0074:
                r0 = 2
                r6.put(r1, r0)
            L_0x0078:
                java.lang.Class<ht1.j5> r0 = ht1.C8777j5.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                ht1.j5 r0 = (ht1.C8777j5) r0
                java.lang.String r6 = r6.toString()
                java.lang.String r1 = "this.toString()"
                gy3.C87412m.m108593f(r6, r1)
                java.lang.String r1 = "watch_live_expose"
                r0.hg0(r1, r6)
                goto L_0x000e
            L_0x0092:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC.C3519f.mo778e(android.view.View, java.util.List):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC$g */
    public static final class C3520g extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileReplayLiveUIC f16354d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3520g(FinderProfileReplayLiveUIC finderProfileReplayLiveUIC) {
            super(1);
            this.f16354d = finderProfileReplayLiveUIC;
        }

        public Object invoke(Object obj) {
            IResponse iResponse = (IResponse) obj;
            C87412m.m108594g(iResponse, "response");
            String str = this.f16354d.f16339o;
            Log.m105924i(str, "[fetchEndCallback] totalSize=" + this.f16354d.mo3849c3().getSize() + ",hasMore:" + iResponse.getHasMore());
            if (iResponse.getHasMore()) {
                this.f16354d.f16346v = 1;
            } else {
                View loadMoreFooter = this.f16354d.mo3851e3().getLoadMoreFooter();
                if (loadMoreFooter != null) {
                    FinderProfileReplayLiveUIC finderProfileReplayLiveUIC = this.f16354d;
                    TextView textView = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t);
                    if (textView != null) {
                        textView.setText(C0966R.string.eat);
                    }
                    TextView textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t);
                    if (textView2 != null) {
                        textView2.setTextColor(finderProfileReplayLiveUIC.getActivity().getResources().getColor(C0966R.color.FG_2));
                    }
                    TextView textView3 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t);
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                    View findViewById = loadMoreFooter.findViewById(C0966R.C0970id.g2s);
                    if (findViewById != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view = findViewById;
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileReplayLiveUIC$onCreate$4", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileReplayLiveUIC$onCreate$4", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                this.f16354d.mo3851e3().setHasBottomMore(false);
                this.f16354d.f16346v = 0;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC$h */
    public static final class C3521h extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileReplayLiveUIC f16355d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3521h(FinderProfileReplayLiveUIC finderProfileReplayLiveUIC) {
            super(0);
            this.f16355d = finderProfileReplayLiveUIC;
        }

        public Object invoke() {
            return this.f16355d.mo3851e3().getRecyclerView();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC$i */
    public static final class C3522i extends C87413o implements C32224a<RefreshLoadMoreLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileReplayLiveUIC f16356d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3522i(FinderProfileReplayLiveUIC finderProfileReplayLiveUIC) {
            super(0);
            this.f16356d = finderProfileReplayLiveUIC;
        }

        public Object invoke() {
            return ((C15984y) ((C36570n) this.f16356d.f16340p).getValue()).f43022c;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC$j */
    public static final class C3523j extends C87413o implements C32224a<C15984y> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileReplayLiveUIC f16357d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3523j(FinderProfileReplayLiveUIC finderProfileReplayLiveUIC) {
            super(0);
            this.f16357d = finderProfileReplayLiveUIC;
        }

        public Object invoke() {
            return C15984y.m14892a(this.f16357d.findViewById(C0966R.C0970id.gks));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileReplayLiveUIC(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: c3 */
    public final FinderProfileLiveUserPageLoader mo3849c3() {
        return (FinderProfileLiveUserPageLoader) ((C36570n) this.f16343s).getValue();
    }

    /* renamed from: d3 */
    public final RecyclerView mo3850d3() {
        return (RecyclerView) ((C36570n) this.f16342r).getValue();
    }

    /* renamed from: e3 */
    public final RefreshLoadMoreLayout mo3851e3() {
        return (RefreshLoadMoreLayout) ((C36570n) this.f16341q).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.anw;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FrameLayout frameLayout = ((C15984y) ((C36570n) this.f16340p).getValue()).f43021b;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        mo3849c3().register((C16380c) ((C36570n) this.f16345u).getValue());
        this.f16347w.alive();
        mo3851e3().setEnableRefresh(false);
        mo3851e3().setSuperNestedScroll(true);
        mo3851e3().setActionCallback(new C3517d(this));
        RefreshLoadMoreLayout e3 = mo3851e3();
        View inflate = C85868k2.m106137b(getActivity()).inflate(C0966R.C0971layout.b7t, (ViewGroup) null);
        C87412m.m108593f(inflate, "getInflater(activity).in…t.load_more_footer, null)");
        e3.setLoadMoreFooter(inflate);
        mo3850d3().setLayoutManager(((FinderProfileLayoutConfig) ((C36570n) this.f16344t).getValue()).mo3666d(getActivity()));
        mo3850d3().mo17085h0(((FinderProfileLayoutConfig) ((C36570n) this.f16344t).getValue()).mo3665c());
        RecyclerView d3 = mo3850d3();
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        d3.setRecycledViewPool(((FinderProfileLayoutConfig) ((C36570n) this.f16344t).getValue()).mo3667e((MMActivity) activity));
        RecyclerView d35 = mo3850d3();
        FinderProfileLayoutConfig finderProfileLayoutConfig = (FinderProfileLayoutConfig) ((C36570n) this.f16344t).getValue();
        finderProfileLayoutConfig.getClass();
        WxRecyclerAdapter wxRecyclerAdapter = new WxRecyclerAdapter(new FinderProfileLayoutConfig$getItemConvertFactory$1(finderProfileLayoutConfig, (C32226l<? super Integer, ? extends C60896i<?>>) null), mo3849c3().getDataListJustForAdapter(), false);
        wxRecyclerAdapter.f173488o = new C3518e(this);
        d35.setAdapter(wxRecyclerAdapter);
        C23564m.m28137g(mo3850d3(), new C3519f());
        mo3849c3().f15083g = new C3520g(this);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f16347w.dead();
        mo3849c3().unregister((C16380c) ((C36570n) this.f16345u).getValue());
    }

    public void onResume() {
        super.onResume();
        if (isSelf() && isSelfFlag()) {
            Log.m105924i(this.f16339o, "#onResume anchor refresh");
            mo3849c3().requestRefresh();
        }
    }
}
