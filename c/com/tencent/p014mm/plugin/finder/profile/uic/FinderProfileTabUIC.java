package com.tencent.p014mm.plugin.finder.profile.uic;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39622i0;
import androidx.viewpager.widget.ViewPager;
import bl3.C39818r;
import cm1.C0728e2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.profile.FinderProfileFeedFragment;
import com.tencent.p014mm.plugin.finder.profile.FinderProfileShopFragment;
import com.tencent.p014mm.plugin.finder.view.FinderViewPager;
import com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabProvider;
import com.tencent.p014mm.plugin.finder.view.tabcomp.IFinderTabProvider;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58739j4;
import f40.C86709a0;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8808v4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import je1.C46519f3;
import je1.C46539u3;
import je1.C46543v3;
import je1.C46549x3;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import l31.C61212e;
import ls1.C10647i;
import ls1.C10648k;
import ls1.C61391g;
import ls1.C61393j;
import mo1.C10995e2;
import mo1.C10999f2;
import mo1.C11016l2;
import mo1.C11025q;
import mo1.C47083b2;
import mo1.C47084c2;
import mo1.C47085d2;
import mo1.C47088i2;
import mo1.C47090k2;
import mo1.C61509a2;
import nr3.C89059e;
import o31.C11345b;
import o31.C76986a;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89132b;
import p008bq.C54530k0;
import pe3.C47465a;
import pe3.C89349b;
import q31.C118148a;
import qg1.C12222g0;
import qo3.C101218e0;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import sx3.C64197v;
import te3.C49103d62;
import te3.C50700ol1;
import te3.C50955qg0;
import te3.C51103rg0;
import te3.C51707vl0;
import te3.C64370fp1;
import up1.C37521f;
import vp1.C14937o;
import zc1.C66785b;
import zh0.C16196b;
import zp3.C79406f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0005\n\u000b\f\r\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/profile/uic/FinderProfileTabUIC;", "Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderTabUIC;", "Lob0/n;", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;)V", "a", "b", "c", "d", "e", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC */
public final class FinderProfileTabUIC extends FinderTabUIC implements C11385n {

    /* renamed from: K */
    public static int f160643K;

    /* renamed from: A */
    public final C13601g f160644A = C36568h.m40985a(new C56228i(this));

    /* renamed from: B */
    public final C13601g f160645B = C36568h.m40985a(new C56230k(this));

    /* renamed from: C */
    public final C13601g f160646C = C36568h.m40985a(new C56231l(this));

    /* renamed from: D */
    public boolean f160647D;

    /* renamed from: E */
    public boolean f160648E;

    /* renamed from: F */
    public int f160649F;

    /* renamed from: G */
    public final String f160650G;

    /* renamed from: H */
    public final String f160651H;

    /* renamed from: I */
    public final String f160652I;

    /* renamed from: J */
    public final String f160653J;

    /* renamed from: t */
    public final C13601g f160654t = C36568h.m40985a(new C56227h(this));

    /* renamed from: u */
    public final C13601g f160655u = C36568h.m40985a(new C56226g(this));

    /* renamed from: v */
    public boolean f160656v;

    /* renamed from: w */
    public boolean f160657w;

    /* renamed from: x */
    public boolean f160658x;

    /* renamed from: y */
    public final C13601g f160659y = C36568h.m40985a(new C56232m(this));

    /* renamed from: z */
    public final C13601g f160660z = C36568h.m40985a(new C56229j(this));

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC$c */
    public final class C3524c extends C10647i {

        /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC$c$a */
        public static final class C3525a implements C118148a {

            /* renamed from: a */
            public final /* synthetic */ ViewGroup f16360a;

            public C3525a(ViewGroup viewGroup) {
                this.f16360a = viewGroup;
            }

            /* renamed from: a */
            public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
                return false;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0075  */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x008c  */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x00a3  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x00b8  */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x00bb  */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x00be  */
            /* JADX WARNING: Removed duplicated region for block: B:25:0x00c3  */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x00ec  */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.util.Map<java.lang.String, java.lang.Object> mo37b(java.lang.String r11) {
                /*
                    r10 = this;
                    java.lang.Class<kq.h> r11 = p185kq.C10383h.class
                    java.lang.String r0 = ""
                    android.view.ViewGroup r1 = r10.f16360a
                    android.content.Context r1 = r1.getContext()
                    java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
                    gy3.C87412m.m108592e(r1, r2)
                    com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1
                    android.content.Intent r1 = r1.getIntent()
                    java.lang.String r2 = "finder_username"
                    java.lang.String r1 = r1.getStringExtra(r2)
                    bl3.r r3 = bl3.C39818r.f106831a
                    android.view.ViewGroup r4 = r10.f16360a
                    android.content.Context r4 = r4.getContext()
                    java.lang.String r5 = "tabView.context"
                    gy3.C87412m.m108593f(r4, r5)
                    bl3.r$a r3 = r3.mo62443b(r4)
                    java.lang.Class<rs1.s8> r4 = rs1.C13442s8.class
                    androidx.lifecycle.i0 r3 = r3.mo75002a(r4)
                    rs1.s8 r3 = (rs1.C13442s8) r3
                    java.lang.String r3 = r3.f38111y
                    r4 = 0
                    org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0058 }
                    r5.<init>(r3)     // Catch:{ JSONException -> 0x0058 }
                    java.lang.String r3 = "sourceid"
                    java.lang.String r3 = r5.optString(r3)     // Catch:{ JSONException -> 0x0058 }
                    java.lang.String r6 = "optString(\"sourceid\")"
                    gy3.C87412m.m108593f(r3, r6)     // Catch:{ JSONException -> 0x0058 }
                    java.lang.String r6 = "traceid"
                    java.lang.String r5 = r5.optString(r6)     // Catch:{ JSONException -> 0x0056 }
                    java.lang.String r6 = "optString(\"traceid\")"
                    gy3.C87412m.m108593f(r5, r6)     // Catch:{ JSONException -> 0x0056 }
                    goto L_0x0064
                L_0x0056:
                    r5 = move-exception
                    goto L_0x005a
                L_0x0058:
                    r5 = move-exception
                    r3 = r0
                L_0x005a:
                    java.lang.Object[] r6 = new java.lang.Object[r4]
                    java.lang.String r7 = "Finder.FinderTab"
                    java.lang.String r8 = "opt jumpId failed"
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r5, r8, r6)
                    r5 = r0
                L_0x0064:
                    r6 = 7
                    rx3.l[] r6 = new rx3.C13604l[r6]
                    java.lang.Class<h81.i> r7 = h81.C59774i.class
                    di3.d r7 = di3.C86312j.m106911c(r7)
                    h81.i r7 = (h81.C59774i) r7
                    java.lang.String r7 = r7.mo84751Wb()
                    if (r7 != 0) goto L_0x0076
                    r7 = r0
                L_0x0076:
                    rx3.l r8 = new rx3.l
                    java.lang.String r9 = "behaviour_session_id"
                    r8.<init>(r9, r7)
                    r6[r4] = r8
                    r4 = 1
                    di3.d r7 = di3.C86312j.m106911c(r11)
                    kq.h r7 = (p185kq.C10383h) r7
                    java.lang.String r7 = r7.mo10696E()
                    if (r7 != 0) goto L_0x008d
                    r7 = r0
                L_0x008d:
                    rx3.l r8 = new rx3.l
                    java.lang.String r9 = "finder_context_id"
                    r8.<init>(r9, r7)
                    r6[r4] = r8
                    r4 = 2
                    di3.d r11 = di3.C86312j.m106911c(r11)
                    kq.h r11 = (p185kq.C10383h) r11
                    java.lang.String r11 = r11.mo10698S0()
                    if (r11 != 0) goto L_0x00a4
                    r11 = r0
                L_0x00a4:
                    rx3.l r7 = new rx3.l
                    java.lang.String r8 = "finder_tab_context_id"
                    r7.<init>(r8, r11)
                    r6[r4] = r7
                    r11 = 3
                    android.view.ViewGroup r4 = r10.f16360a
                    android.content.Context r4 = r4.getContext()
                    boolean r7 = r4 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderProfileUI
                    if (r7 == 0) goto L_0x00bb
                    com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI r4 = (com.tencent.p014mm.plugin.finder.feed.p052ui.FinderProfileUI) r4
                    goto L_0x00bc
                L_0x00bb:
                    r4 = 0
                L_0x00bc:
                    if (r4 == 0) goto L_0x00c3
                    int r4 = r4.mo2194I7()
                    goto L_0x00c5
                L_0x00c3:
                    r4 = 121(0x79, float:1.7E-43)
                L_0x00c5:
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    rx3.l r7 = new rx3.l
                    java.lang.String r8 = "comment_scene"
                    r7.<init>(r8, r4)
                    r6[r11] = r7
                    r11 = 4
                    rx3.l r4 = new rx3.l
                    java.lang.String r7 = "source_id"
                    r4.<init>(r7, r3)
                    r6[r11] = r4
                    r11 = 5
                    rx3.l r3 = new rx3.l
                    java.lang.String r4 = "trace_id"
                    r3.<init>(r4, r5)
                    r6[r11] = r3
                    r11 = 6
                    if (r1 != 0) goto L_0x00ec
                    goto L_0x00ed
                L_0x00ec:
                    r0 = r1
                L_0x00ed:
                    rx3.l r1 = new rx3.l
                    r1.<init>(r2, r0)
                    r6[r11] = r1
                    java.util.Map r11 = sx3.C90364q0.m113147f(r6)
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC.C3524c.C3525a.mo37b(java.lang.String):java.util.Map");
            }
        }

        public C3524c(int i) {
            super(i);
        }

        /* renamed from: a */
        public int mo3852a() {
            return C0966R.C0971layout.ao5;
        }

        /* renamed from: b */
        public int[] mo3853b() {
            return new int[]{0, 0};
        }

        /* renamed from: c */
        public void mo3854c(ViewGroup viewGroup) {
            Class cls = C61212e.class;
            super.mo3854c(viewGroup);
            if (this.f32063h == C0966R.string.eky && viewGroup != null) {
                ((C61212e) C86312j.m106911c(cls)).o30(this.f32064i, "finder_profile_music_tab");
                ((C61212e) C86312j.m106911c(cls)).E60(this.f32064i, new C3525a(viewGroup));
                ((C61212e) C86312j.m106911c(cls)).mo86175pO(this.f32064i, 40, 25496);
            }
        }

        /* renamed from: d */
        public void mo3855d(boolean z, ViewGroup viewGroup) {
            C87412m.m108594g(viewGroup, "tabView");
            super.mo3855d(z, viewGroup);
            if (this.f32063h == C0966R.string.eky && z) {
                ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("view_clk", this.f32064i, (Map<String, Object>) null, 25496);
            }
        }

        /* renamed from: f */
        public void mo3856f(ViewGroup viewGroup) {
            Class cls = C11025q.class;
            C87412m.m108594g(viewGroup, "tabView");
            super.mo3856f(viewGroup);
            int i = this.f32063h;
            if (i == C0966R.string.czr) {
                Context context = viewGroup.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                String stringExtra = ((MMActivity) context).getIntent().getStringExtra("finder_username");
                C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
                long j = C87412m.m108589b(stringExtra, C66785b.f191882e.mo90662O5()) ? 1 : 0;
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                Context context2 = viewGroup.getContext();
                C87412m.m108593f(context2, "tabView.context");
                C13442s8 f = aVar.mo12873f(context2);
                y0Var.yy0(j, "2", 3, "", f != null ? f.mo12861q3() : null);
            } else if (i == C0966R.string.ekn) {
                C39818r rVar = C39818r.f106831a;
                Context context3 = viewGroup.getContext();
                C87412m.m108593f(context3, "tabView.context");
                C39622i0 a = rVar.mo62443b(context3).mo75002a(cls);
                C87412m.m108593f(a, "UICProvider.of(tabView.c…rofileEduUIC::class.java)");
                C11025q.m10965k3((C11025q) a, "mvtab", 1, (String) null, 0, (String) null, 28, (Object) null);
            } else if (i == C0966R.string.f360762ek1) {
                C39818r rVar2 = C39818r.f106831a;
                Context context4 = viewGroup.getContext();
                C87412m.m108593f(context4, "tabView.context");
                C39622i0 a2 = rVar2.mo62443b(context4).mo75002a(cls);
                C87412m.m108593f(a2, "UICProvider.of(tabView.c…rofileEduUIC::class.java)");
                C11025q.m10965k3((C11025q) a2, "drafttab", 1, (String) null, 0, (String) null, 28, (Object) null);
            } else if (i == C0966R.string.ek5) {
                C39818r rVar3 = C39818r.f106831a;
                Context context5 = viewGroup.getContext();
                C87412m.m108593f(context5, "tabView.context");
                C39622i0 a3 = rVar3.mo62443b(context5).mo75002a(cls);
                C87412m.m108593f(a3, "UICProvider.of(tabView.c…rofileEduUIC::class.java)");
                C11025q.m10965k3((C11025q) a3, "tab_profile_emoji", 1, (String) null, 0, (String) null, 28, (Object) null);
            }
        }

        /* renamed from: k */
        public void mo3857k(boolean z) {
            TextView textView = this.f32064i;
            if (textView != null) {
                FinderProfileTabUIC finderProfileTabUIC = FinderProfileTabUIC.this;
                int color = finderProfileTabUIC.f160656v ? textView.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_9_Night_Mode) : textView.getContext().getResources().getColor(C0966R.color.a7f);
                int color2 = finderProfileTabUIC.f160656v ? textView.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_5_Night_Mode) : textView.getContext().getResources().getColor(C0966R.color.f3288ma);
                if (z) {
                    textView.setTextColor(color);
                } else {
                    textView.setTextColor(color2);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC$e */
    public static final class C3526e extends C10648k {
        /* renamed from: a */
        public void mo3858a(Context context, C61391g gVar) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(gVar, "tab");
            super.mo3858a(context, gVar);
            boolean z = true;
            gVar.mo9047e(true);
            C3524c cVar = (C3524c) gVar;
            if (cVar.f32063h == C0966R.string.f360775eo2) {
                C7335d c = C86312j.m106911c(C58417y0.class);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                C58417y0 y0Var = (C58417y0) c;
                y0Var.Ly0(context, false, y0Var.f167359p);
            }
            C11025q qVar = (C11025q) C39818r.f106831a.mo62443b(context).mo75002a(C11025q.class);
            if (cVar.f32063h != C0966R.string.f360774eo1) {
                z = false;
            }
            qVar.f32751B = z;
            if (z) {
                qVar.mo11177e3();
            } else if (qVar.mo11180i3().getVisibility() == 0) {
                View i3 = qVar.mo11180i3();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view = i3;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC", "checkCurrentTabIsVideo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC", "checkCurrentTabIsVideo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        /* renamed from: b */
        public void mo3859b(Context context, C61391g gVar) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(gVar, "tab");
            super.mo3859b(context, gVar);
            gVar.mo9047e(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC$f */
    public static final class C41481f implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileTabUIC f111702d;

        /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC$f$a */
        public static final class C41482a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderProfileTabUIC f111703d;

            /* renamed from: e */
            public final /* synthetic */ List<C0728e2> f111704e;

            /* renamed from: f */
            public final /* synthetic */ C117747y f111705f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C41482a(FinderProfileTabUIC finderProfileTabUIC, List<C0728e2> list, C117747y yVar) {
                super(0);
                this.f111703d = finderProfileTabUIC;
                this.f111704e = list;
                this.f111705f = yVar;
            }

            public Object invoke() {
                int i;
                if (this.f111703d.mo80041M3().size() <= 2) {
                    if (!this.f111703d.isSelf()) {
                        i = 1;
                        FinderProfileTabUIC finderProfileTabUIC = this.f111703d;
                        C3524c cVar = new C3524c(C0966R.string.el6);
                        cVar.f174601b = 50;
                        C13598b0 b0Var = C13598b0.f38549a;
                        FinderProfileShopFragment finderProfileShopFragment = new FinderProfileShopFragment();
                        List<C0728e2> list = this.f111704e;
                        C117747y yVar = this.f111705f;
                        finderProfileShopFragment.f160600q = list;
                        C47465a aVar = ((C46539u3) yVar).f125398i.f127056b.f127083a;
                        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetAllWindowProductsResponse");
                        finderProfileShopFragment.f160601r = ((C51707vl0) aVar).f143545e;
                        FinderTabUIC.m65394e3(finderProfileTabUIC, i, cVar, finderProfileShopFragment, false, 8, (Object) null);
                        return C13598b0.f38549a;
                    }
                } else if (this.f111703d.isSelf()) {
                    i = 3;
                    FinderProfileTabUIC finderProfileTabUIC2 = this.f111703d;
                    C3524c cVar2 = new C3524c(C0966R.string.el6);
                    cVar2.f174601b = 50;
                    C13598b0 b0Var2 = C13598b0.f38549a;
                    FinderProfileShopFragment finderProfileShopFragment2 = new FinderProfileShopFragment();
                    List<C0728e2> list2 = this.f111704e;
                    C117747y yVar2 = this.f111705f;
                    finderProfileShopFragment2.f160600q = list2;
                    C47465a aVar2 = ((C46539u3) yVar2).f125398i.f127056b.f127083a;
                    C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetAllWindowProductsResponse");
                    finderProfileShopFragment2.f160601r = ((C51707vl0) aVar2).f143545e;
                    FinderTabUIC.m65394e3(finderProfileTabUIC2, i, cVar2, finderProfileShopFragment2, false, 8, (Object) null);
                    return C13598b0.f38549a;
                }
                i = 2;
                FinderProfileTabUIC finderProfileTabUIC22 = this.f111703d;
                C3524c cVar22 = new C3524c(C0966R.string.el6);
                cVar22.f174601b = 50;
                C13598b0 b0Var22 = C13598b0.f38549a;
                FinderProfileShopFragment finderProfileShopFragment22 = new FinderProfileShopFragment();
                List<C0728e2> list22 = this.f111704e;
                C117747y yVar22 = this.f111705f;
                finderProfileShopFragment22.f160600q = list22;
                C47465a aVar22 = ((C46539u3) yVar22).f125398i.f127056b.f127083a;
                C87412m.m108592e(aVar22, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetAllWindowProductsResponse");
                finderProfileShopFragment22.f160601r = ((C51707vl0) aVar22).f143545e;
                FinderTabUIC.m65394e3(finderProfileTabUIC22, i, cVar22, finderProfileShopFragment22, false, 8, (Object) null);
                return C13598b0.f38549a;
            }
        }

        public C41481f(FinderProfileTabUIC finderProfileTabUIC) {
            this.f111702d = finderProfileTabUIC;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C86709a0.m107524d().mo123470p(5244, this);
            if (yVar instanceof C46539u3) {
                C46539u3 u3Var = (C46539u3) yVar;
                if (!C87412m.m108589b(u3Var.f125396g, this.f111702d.f160650G)) {
                    Log.m105924i("Finder.FinderProfileTabUIC", "checkShopTab targetUsername:" + this.f111702d.f160650G + " but cgi's:" + u3Var.f125396g + '!');
                } else if (i == 0 && i2 == 0) {
                    FinderProfileTabUIC finderProfileTabUIC = this.f111702d;
                    if (((Boolean) ((C36570n) finderProfileTabUIC.f160645B).getValue()).booleanValue()) {
                        C47465a aVar = u3Var.f125398i.f127056b.f127083a;
                        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetAllWindowProductsResponse");
                        int i3 = ((C51707vl0) aVar).f143547g;
                        if (i3 != 1) {
                            Log.m105924i("Finder.FinderProfileTabUIC", "checkShopOpGuide shopOpGuideFlag:" + i3 + '!');
                        } else {
                            C85801v1 i4 = C86709a0.m107535s().mo121142i();
                            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_FINDER_LIVE_PROFILE_SHOP_GUIDE_BOOLEAN_SYNC;
                            Object f = i4.mo119685f(aVar2, Boolean.FALSE);
                            C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
                            if (((Boolean) f).booleanValue()) {
                                Log.m105924i("Finder.FinderProfileTabUIC", "checkShopOpGuide haveShowGuide!");
                            } else {
                                C101218e0 e0Var = new C101218e0(finderProfileTabUIC.getContext(), 1, 2);
                                e0Var.mo140667n(finderProfileTabUIC.getContext().getResources().getString(C0966R.string.e4a), finderProfileTabUIC.getContext().getResources().getString(C0966R.string.e4c));
                                e0Var.mo140675u(finderProfileTabUIC.getContext().getResources().getColor(C0966R.color.f2959af));
                                e0Var.mo140668o(5);
                                C47090k2 k2Var = new C47090k2(e0Var);
                                C11016l2 l2Var = new C11016l2(finderProfileTabUIC, e0Var);
                                e0Var.f296373D = k2Var;
                                e0Var.f296374E = l2Var;
                                e0Var.mo140674t(C79406f.m96347a(finderProfileTabUIC.getContext(), 314.0f));
                                e0Var.mo140673s(C85868k2.m106137b(finderProfileTabUIC.getContext()).inflate(C0966R.C0971layout.aob, (ViewGroup) null));
                                TextView textView = new TextView(finderProfileTabUIC.getContext());
                                textView.setText(textView.getContext().getResources().getString(C0966R.string.e4b));
                                textView.setTextSize(1, 15.0f);
                                textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.f3133gi));
                                e0Var.mo140663j(textView);
                                e0Var.mo140655A();
                                C86709a0.m107535s().mo121142i().mo119677K(aVar2, Boolean.TRUE);
                                finderProfileTabUIC.f160648E = true;
                            }
                        }
                    }
                    C47465a aVar3 = u3Var.f125398i.f127056b.f127083a;
                    C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetAllWindowProductsResponse");
                    LinkedList<C64370fp1> linkedList = ((C51707vl0) aVar3).f143544d;
                    C87412m.m108593f(linkedList, "commReqResp.responseProt…roductsResponse).products");
                    ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                    for (C64370fp1 e2Var : linkedList) {
                        arrayList.add(new C0728e2(e2Var));
                    }
                    Log.m105924i("Finder.FinderProfileTabUIC", "checkShopTab feedList size :" + arrayList.size() + '!');
                    if (!arrayList.isEmpty()) {
                        C61926c.m72668M(new C41482a(this.f111702d, arrayList, yVar));
                    } else {
                        Log.m105924i("Finder.FinderProfileTabUIC", "checkShopTab cgi resp feedList is empty!");
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC$a */
    public interface C56223a {
        /* renamed from: e */
        void mo3765e(boolean z);
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC$b */
    public final class C56224b extends FinderTabProvider {
        public C56224b(FinderProfileTabUIC finderProfileTabUIC) {
            setTabContainer(new C56225d());
            setTabViewAction(new C3526e());
            LinkedList linkedList = new LinkedList();
            C3524c cVar = new C3524c(C0966R.string.f360774eo1);
            cVar.f174601b = 10;
            linkedList.add(cVar);
            if (finderProfileTabUIC.mo78517f4()) {
                C3524c cVar2 = new C3524c(C0966R.string.ekn);
                cVar2.f174601b = 40;
                linkedList.add(cVar2);
            }
            if (FinderProfileTabUIC.m64338e4(finderProfileTabUIC)) {
                C3524c cVar3 = new C3524c(C0966R.string.eky);
                cVar3.f174601b = 60;
                linkedList.add(cVar3);
            }
            setTabs(linkedList);
            LinkedList linkedList2 = new LinkedList();
            linkedList2.add(new FinderProfileFeedFragment());
            if (finderProfileTabUIC.mo78517f4()) {
                linkedList2.add(new FinderProfileMusicFragment());
                C39622i0 a = C39818r.f106831a.mo62444c(finderProfileTabUIC.getActivity()).mo75002a(C11025q.class);
                C87412m.m108593f(a, "UICProvider.of(activity)…rofileEduUIC::class.java)");
                C11025q.m10965k3((C11025q) a, "mvtab", 0, (String) null, 0, (String) null, 30, (Object) null);
            }
            if (FinderProfileTabUIC.m64338e4(finderProfileTabUIC)) {
                linkedList2.add(new FinderProfileQQMusicFragment());
            }
            setFragments(linkedList2);
        }

        public boolean isDynamic() {
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC$d */
    public static final class C56225d extends C61393j {
        /* renamed from: d */
        public View mo78527d() {
            return null;
        }

        /* renamed from: g */
        public int mo78528g() {
            return C0966R.C0970id.br_;
        }

        public int getLayoutId() {
            return C0966R.C0971layout.aog;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC$g */
    public static final class C56226g extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileTabUIC f160661d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56226g(FinderProfileTabUIC finderProfileTabUIC) {
            super(0);
            this.f160661d = finderProfileTabUIC;
        }

        public Object invoke() {
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f160661d.getActivity());
            return Integer.valueOf(f != null ? f.f38095h : 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC$h */
    public static final class C56227h extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileTabUIC f160662d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56227h(FinderProfileTabUIC finderProfileTabUIC) {
            super(0);
            this.f160662d = finderProfileTabUIC;
        }

        public Object invoke() {
            return Long.valueOf(this.f160662d.getActivity().getIntent().getLongExtra("finder_read_feed_id", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC$i */
    public static final class C56228i extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileTabUIC f160663d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56228i(FinderProfileTabUIC finderProfileTabUIC) {
            super(0);
            this.f160663d = finderProfileTabUIC;
        }

        public Object invoke() {
            return Boolean.valueOf(C87412m.m108589b(this.f160663d.getUsername(), C66785b.f191882e.mo90662O5()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC$j */
    public static final class C56229j extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileTabUIC f160664d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56229j(FinderProfileTabUIC finderProfileTabUIC) {
            super(0);
            this.f160664d = finderProfileTabUIC;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f160664d.getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC$k */
    public static final class C56230k extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileTabUIC f160665d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56230k(FinderProfileTabUIC finderProfileTabUIC) {
            super(0);
            this.f160665d = finderProfileTabUIC;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f160665d.isSelf() && this.f160665d.isSelfFlag());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC$l */
    public static final class C56231l extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileTabUIC f160666d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56231l(FinderProfileTabUIC finderProfileTabUIC) {
            super(0);
            this.f160666d = finderProfileTabUIC;
        }

        public Object invoke() {
            return this.f160666d.getActivity().findViewById(C0966R.C0970id.f359341kd2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC$m */
    public static final class C56232m extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileTabUIC f160667d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56232m(FinderProfileTabUIC finderProfileTabUIC) {
            super(0);
            this.f160667d = finderProfileTabUIC;
        }

        public Object invoke() {
            String stringExtra = this.f160667d.getIntent().getStringExtra("finder_username");
            C87412m.m108591d(stringExtra);
            return stringExtra;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileTabUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        StringBuilder sb = new StringBuilder();
        sb.append("[Provider] username=");
        sb.append(getUsername());
        sb.append(" isSelf=");
        sb.append(isSelf());
        sb.append(" isSelfFlag=");
        sb.append(isSelfFlag());
        sb.append(" isNoSeeAtTab=");
        sb.append(mo78523j4());
        sb.append(" isPrivateAccount=");
        C58739j4 j4Var = C58739j4.f168176a;
        C58961d.C58963b bVar = C58961d.f168673a;
        sb.append(j4Var.mo83688Q(bVar.mo84155b(getUsername())));
        sb.append(" profileContact=");
        sb.append(bVar.mo84155b(getUsername()) != null);
        Log.m105924i("Finder.FinderProfileTabUIC", sb.toString());
        String stringExtra = getActivity().getIntent().getStringExtra("finder_username");
        this.f160650G = stringExtra == null ? "" : stringExtra;
        this.f160651H = C66785b.f191882e.mo90662O5();
        this.f160652I = "wx2bff878c51bab23b";
        this.f160653J = "pages/index/index";
    }

    /* renamed from: d4 */
    public static final void m64337d4(FinderProfileTabUIC finderProfileTabUIC) {
        finderProfileTabUIC.getClass();
        C37521f.f99374d.getClass();
        if (C37521f.f99368c3.mo60266n().intValue() != 0) {
            C61926c.m72668M(new C61509a2(finderProfileTabUIC));
        }
    }

    /* renamed from: e4 */
    public static final boolean m64338e4(FinderProfileTabUIC finderProfileTabUIC) {
        finderProfileTabUIC.getClass();
        C37521f.f99374d.getClass();
        if (C37521f.f99368c3.mo60266n().intValue() == 0 || ((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
            return false;
        }
        if (!finderProfileTabUIC.f160658x && !(!C14937o.f40972a.mo13987h(19, finderProfileTabUIC.f160650G).isEmpty())) {
            return false;
        }
        finderProfileTabUIC.f160658x = true;
        return true;
    }

    /* renamed from: f4 */
    public final boolean mo78517f4() {
        if (((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
            return false;
        }
        if (!this.f160657w && !(!C14937o.f40972a.mo13987h(17, this.f160650G).isEmpty())) {
            return false;
        }
        this.f160657w = true;
        return true;
    }

    /* renamed from: g4 */
    public final void mo78518g4() {
        if (!C37521f.f99374d.mo61174b0()) {
            Log.m105924i("Finder.FinderProfileTabUIC", "checkShopTab unSupport shop tab!");
        } else if (((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
            Log.m105924i("Finder.FinderProfileTabUIC", "checkShopTab isTeenMode!");
        } else {
            C86709a0.m107524d().mo123455a(5244, new C41481f(this));
            long longValue = ((Number) ((C36570n) this.f160654t).getValue()).longValue();
            int intValue = ((Number) ((C36570n) this.f160655u).getValue()).intValue();
            String str = this.f160650G;
            String stringExtra = getIntent().getStringExtra("key_ec_source");
            if (stringExtra == null) {
                stringExtra = "";
            }
            C86709a0.m107524d().mo123460f(new C46539u3(longValue, intValue, str, stringExtra, (C89349b) null, ((C13442s8) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C13442s8.class)).mo12861q3()));
        }
    }

    public final String getUsername() {
        return (String) this.f160659y.getValue();
    }

    /* renamed from: h4 */
    public final <T extends FinderHomeTabFragment> FinderHomeTabFragment mo78520h4(Class<T> cls) {
        T t;
        C87412m.m108594g(cls, "clazz");
        Iterator<T> it = mo80061o3().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((FinderHomeTabFragment) t).getClass(), cls)) {
                break;
            }
        }
        C87412m.m108591d(t);
        return (FinderHomeTabFragment) t;
    }

    public final boolean isSelf() {
        return ((Boolean) this.f160644A.getValue()).booleanValue();
    }

    public final boolean isSelfFlag() {
        return ((Boolean) this.f160660z.getValue()).booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: j4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo78523j4() {
        /*
            r5 = this;
            er1.w3 r0 = er1.C58784w3.f168295a
            java.lang.String r1 = r5.getUsername()
            r0.getClass()
            zc1.b r0 = zc1.C66785b.f191882e
            java.lang.String r2 = r0.mo90662O5()
            boolean r2 = gy3.C87412m.m108589b(r1, r2)
            r3 = 0
            if (r2 == 0) goto L_0x0025
            java.lang.String r1 = r0.mo90662O5()
            r2 = 2
            r4 = 0
            bd1.b r0 = zc1.C66783a.C66784a.m78798a(r0, r1, r3, r2, r4)
            if (r0 == 0) goto L_0x0030
            int r0 = r0.field_extFlag
            goto L_0x0031
        L_0x0025:
            fe1.d$b r0 = fe1.C58961d.f168673a
            fe1.q r0 = r0.mo84155b(r1)
            if (r0 == 0) goto L_0x0030
            int r0 = r0.field_extFlag
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0036
            r3 = 1
        L_0x0036:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC.mo78523j4():boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC$c} */
    /* JADX WARNING: type inference failed for: r2v6, types: [ls1.g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: k4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78524k4(boolean r6) {
        /*
            r5 = this;
            r5.f160656v = r6
            if (r6 == 0) goto L_0x0014
            android.app.Activity r0 = r5.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131099684(0x7f060024, float:1.7811728E38)
            int r0 = r0.getColor(r1)
            goto L_0x0023
        L_0x0014:
            android.app.Activity r0 = r5.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131101252(0x7f060644, float:1.7814908E38)
            int r0 = r0.getColor(r1)
        L_0x0023:
            if (r6 == 0) goto L_0x0035
            android.app.Activity r1 = r5.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099676(0x7f06001c, float:1.7811712E38)
            int r1 = r1.getColor(r2)
            goto L_0x0044
        L_0x0035:
            android.app.Activity r1 = r5.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131100381(0x7f0602dd, float:1.7813142E38)
            int r1 = r1.getColor(r2)
        L_0x0044:
            com.google.android.material.tabs.TabLayout r2 = r5.f162508f
            if (r2 == 0) goto L_0x004b
            r2.mo146919s(r0, r1)
        L_0x004b:
            com.google.android.material.tabs.TabLayout r2 = r5.f162508f
            if (r2 == 0) goto L_0x0052
            r2.setSelectedTabIndicatorColor(r0)
        L_0x0052:
            java.util.List r2 = r5.mo80061o3()
            java.util.Iterator r2 = r2.iterator()
        L_0x005a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0070
            java.lang.Object r3 = r2.next()
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r3 = (com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment) r3
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC.C56223a
            if (r4 == 0) goto L_0x005a
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC$a r3 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC.C56223a) r3
            r3.mo3765e(r6)
            goto L_0x005a
        L_0x0070:
            java.util.List r6 = r5.mo80041M3()
            java.util.Iterator r6 = r6.iterator()
        L_0x0078:
            boolean r2 = r6.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0097
            java.lang.Object r2 = r6.next()
            ls1.g r2 = (ls1.C61391g) r2
            boolean r4 = r2 instanceof com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC.C3524c
            if (r4 == 0) goto L_0x008c
            r3 = r2
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC$c r3 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC.C3524c) r3
        L_0x008c:
            if (r3 != 0) goto L_0x008f
            goto L_0x0078
        L_0x008f:
            android.widget.TextView r2 = r3.f32064i
            if (r2 == 0) goto L_0x0078
            r2.setTextColor(r1)
            goto L_0x0078
        L_0x0097:
            com.google.android.material.tabs.TabLayout r6 = r5.f162508f
            if (r6 == 0) goto L_0x00b7
            java.util.List r1 = r5.mo80041M3()
            int r6 = r6.getSelectedTabPosition()
            java.lang.Object r6 = sx3.C110818d0.m150917O(r1, r6)
            boolean r1 = r6 instanceof com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC.C3524c
            if (r1 == 0) goto L_0x00ae
            r3 = r6
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC$c r3 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC.C3524c) r3
        L_0x00ae:
            if (r3 == 0) goto L_0x00b7
            android.widget.TextView r6 = r3.f32064i
            if (r6 == 0) goto L_0x00b7
            r6.setTextColor(r0)
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC.mo78524k4(boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo78525l3() {
        /*
            r13 = this;
            java.lang.Class<com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC> r0 = com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.class
            super.mo78525l3()
            rx3.g r1 = r13.f160646C
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            r10 = 0
            r2 = 8
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            if (r1 != 0) goto L_0x0019
            goto L_0x0056
        L_0x0019:
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r12.mo10233c(r11)
            java.lang.Object[] r3 = r12.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTabUIC"
            java.lang.String r5 = "checkTabLayoutVisibility"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r1
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r12.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTabUIC"
            java.lang.String r4 = "checkTabLayoutVisibility"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r1
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x0056:
            vp1.p r1 = vp1.C14940p.f40978a
            java.lang.String r2 = r13.getUsername()
            vp1.p$a r1 = r1.mo13992a(r2)
            r2 = 1
            if (r1 == 0) goto L_0x006f
            je1.s4 r1 = r1.f40981b
            java.util.LinkedList r1 = r1.mo10110p1()
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r2
            goto L_0x0070
        L_0x006f:
            r1 = 0
        L_0x0070:
            boolean r3 = r13.f160647D
            if (r3 != 0) goto L_0x0076
            if (r1 == 0) goto L_0x0084
        L_0x0076:
            ls1.m r1 = r13.mo80038J3()
            com.tencent.mm.view.HardTouchableLayout r1 = r1.mo86338f()
            if (r1 != 0) goto L_0x0081
            goto L_0x0084
        L_0x0081:
            r1.setVisibility(r10)
        L_0x0084:
            ls1.m r1 = r13.mo80038J3()
            com.tencent.mm.view.HardTouchableLayout r1 = r1.mo86338f()
            if (r1 == 0) goto L_0x0095
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r2 = 0
        L_0x0096:
            r1 = 0
            if (r2 == 0) goto L_0x00f7
            bl3.r r2 = bl3.C39818r.f106831a
            android.app.Activity r3 = r13.getContext()
            bl3.r$a r2 = r2.mo62443b(r3)
            bl3.t r0 = r2.mo62449e(r0)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC r0 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC) r0
            if (r0 == 0) goto L_0x00b6
            rx3.g r0 = r0.f16208Q
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            r1 = r0
            android.view.View r1 = (android.view.View) r1
        L_0x00b6:
            if (r1 != 0) goto L_0x00ba
            goto L_0x0157
        L_0x00ba:
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r0.mo10233c(r11)
            java.lang.Object[] r3 = r0.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTabUIC"
            java.lang.String r5 = "checkTabLayoutVisibility"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r1
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r0 = r0.mo10231a(r10)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.setVisibility(r0)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTabUIC"
            java.lang.String r4 = "checkTabLayoutVisibility"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0157
        L_0x00f7:
            bl3.r r2 = bl3.C39818r.f106831a
            android.app.Activity r3 = r13.getContext()
            bl3.r$a r2 = r2.mo62443b(r3)
            bl3.t r0 = r2.mo62449e(r0)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC r0 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC) r0
            if (r0 == 0) goto L_0x0114
            rx3.g r0 = r0.f16208Q
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            r1 = r0
            android.view.View r1 = (android.view.View) r1
        L_0x0114:
            if (r1 != 0) goto L_0x0117
            goto L_0x0157
        L_0x0117:
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r0.mo10233c(r2)
            java.lang.Object[] r3 = r0.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTabUIC"
            java.lang.String r5 = "checkTabLayoutVisibility"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r1
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r0 = r0.mo10231a(r10)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.setVisibility(r0)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTabUIC"
            java.lang.String r4 = "checkTabLayoutVisibility"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x0157:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC.mo78525l3():void");
    }

    /* renamed from: m3 */
    public IFinderTabProvider mo11417m3() {
        return new C56224b(this);
    }

    public void onCreate(Bundle bundle) {
        C51103rg0 rg02;
        LinkedList<C50955qg0> linkedList;
        T t;
        C50700ol1 ol12;
        boolean z;
        Class cls = C61212e.class;
        Class cls2 = C13442s8.class;
        Class cls3 = C8808v4.class;
        super.onCreate(bundle);
        ViewPager viewPager = this.f162509g;
        boolean z2 = true;
        if (viewPager instanceof FinderViewPager) {
            ((FinderViewPager) viewPager).setEnableViewPagerScroll(true);
        }
        C86709a0.m107524d().mo123455a(3736, this);
        if (((C8808v4) C86312j.m106911c(cls3)).mo9635e()) {
            Log.m105924i("Finder.FinderProfileTabUIC", "checkLiveTab return for teenMode!");
        } else {
            C86709a0.m107524d().mo123455a(5870, new C10999f2(this));
            C86709a0.m107524d().mo123460f(new C12222g0(this.f160650G, this.f160651H, (C89349b) null, ((C13442s8) C39818r.f106831a.mo62444c(getActivity()).mo75002a(cls2)).mo12861q3()));
        }
        if (((C8808v4) C86312j.m106911c(cls3)).mo9635e()) {
            z2 = false;
        } else {
            C37521f.f99374d.getClass();
            boolean z3 = C37521f.f99162E6.mo60266n().intValue() == 1;
            if (z3) {
                this.f160649F = -1272779573;
            }
            C58969q b = C58961d.f168673a.mo84155b(getUsername());
            if (!(b == null || (rg02 = b.field_bindInfoList) == null || (linkedList = rg02.f140887d) == null)) {
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((C50955qg0) t).f140290d == 5) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                C50955qg0 qg02 = (C50955qg0) t;
                if (!(qg02 == null || (ol12 = qg02.f140295i) == null)) {
                    this.f160649F = ol12.f139250d;
                }
            }
            z2 = z3;
        }
        if (z2) {
            C89059e<C89132b.C89134c<C49103d62>> i = ((C54530k0) C86312j.m106911c(C54530k0.class)).mo75393Gs(this.f160649F, (byte[]) null).mo9225i();
            Activity context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            i.mo11397F((MMFragmentActivity) context).mo123420E(new C47084c2(this));
        }
        mo78518g4();
        if (!((C8808v4) C86312j.m106911c(cls3)).mo9635e()) {
            C37521f.f99374d.getClass();
            if (C37521f.f99368c3.mo60266n().intValue() != 0) {
                C86709a0.m107524d().mo123455a(5999, new C10995e2(this));
                C86709a0.m107524d().mo123460f(new C46549x3(0, this.f160650G, this.f160651H, (C89349b) null, 0, ((C13442s8) C39818r.f106831a.mo62444c(getActivity()).mo75002a(cls2)).mo12861q3()));
            }
        }
        if (!((C8808v4) C86312j.m106911c(cls3)).mo9635e()) {
            C37521f.f99374d.getClass();
            if (C37521f.f99377d3.mo60266n().intValue() != 0) {
                C86709a0.m107524d().mo123455a(6628, new C47085d2(this));
                C86709a0.m107524d().mo123460f(new C46543v3(this.f160650G, this.f160651H, (C89349b) null, 0, ((C13442s8) C39818r.f106831a.mo62444c(getActivity()).mo75002a(cls2)).mo12861q3()));
            }
        }
        mo78525l3();
        ((C61212e) C86312j.m106911c(cls)).mo86178qr(getActivity(), C11345b.FinderProfileUI);
        ((C61212e) C86312j.m106911c(cls)).mo86179qs(getActivity(), C76986a.Finder);
        ((C61212e) C86312j.m106911c(cls)).mo86136FZ(getActivity(), "FinderProfileTabUIC");
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(3736, this);
    }

    public void onResume() {
        super.onResume();
        Iterator<FinderHomeTabFragment> it = mo80061o3().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next() instanceof FinderProfileDraftFragment) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            if (!((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e() && isSelf() && isSelfFlag()) {
                C86709a0.m107524d().mo123455a(5801, new C47083b2(this));
                C86709a0.m107524d().mo123460f(new C46519f3(this.f160650G, (C89349b) null, 1, ((C13442s8) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C13442s8.class)).mo12861q3()));
            }
        }
        if (isSelf() && this.f160648E) {
            Log.m105924i("Finder.FinderProfileTabUIC", "checkShopTab after showShopOpGuide!");
            this.f160648E = false;
            mo78518g4();
        }
        int i2 = f160643K;
        if (i2 <= 0) {
            i2 = getActivity().getIntent().getIntExtra("key_enter_profile_tab", 0);
        }
        f160643K = 0;
        if (i2 == 3) {
            int i3 = 0;
            for (T next : mo80061o3()) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    if (((FinderHomeTabFragment) next) instanceof FinderProfileMusicFragment) {
                        FinderTabUIC.m65393a4(this, i3, false, 2, (Object) null);
                    }
                    i3 = i4;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        } else if (i2 == 4) {
            int i5 = 0;
            for (T next2 : mo80061o3()) {
                int i6 = i5 + 1;
                if (i5 >= 0) {
                    if (((FinderHomeTabFragment) next2) instanceof FinderProfileDraftFragment) {
                        FinderTabUIC.m65393a4(this, i5, false, 2, (Object) null);
                    }
                    i5 = i6;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        } else if (i2 == 5) {
            int i7 = 0;
            for (T next3 : mo80061o3()) {
                int i8 = i7 + 1;
                if (i7 >= 0) {
                    if (((FinderHomeTabFragment) next3) instanceof FinderProfileQQMusicFragment) {
                        FinderTabUIC.m65393a4(this, i7, false, 2, (Object) null);
                    }
                    i7 = i8;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C16196b) {
            boolean S0 = ((C16196b) yVar).mo10102S0();
            boolean f4 = mo78517f4();
            Log.m105924i("Finder.FinderProfileTabUIC", "moveMvObject:" + S0 + ", hasMusic:" + f4);
            if (S0 && f4) {
                C61926c.m72668M(new C47088i2(this, 0, true));
                Iterator<T> it = mo80061o3().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    FinderHomeTabFragment finderHomeTabFragment = (FinderHomeTabFragment) it.next();
                    if (104 == finderHomeTabFragment.f17334o) {
                        FinderProfileFeedFragment finderProfileFeedFragment = finderHomeTabFragment instanceof FinderProfileFeedFragment ? (FinderProfileFeedFragment) finderHomeTabFragment : null;
                        if (finderProfileFeedFragment != null) {
                            C85801v1 i3 = C86709a0.m107535s().mo121142i();
                            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_PROFILE_MOVE_MV_TAB_TIPS_TIMES_INT_SYNC;
                            int j = i3.mo119689j(aVar, 0);
                            C37521f.f99374d.getClass();
                            int intValue = C37521f.f99386e3.mo60266n().intValue();
                            Log.m105924i("FinderProfileFeedFragment", "canShowMoveMvTabTips, times:" + j + " maxTime:" + intValue);
                            if (j < intValue) {
                                FinderProfileFeedUIC finderProfileFeedUIC = (FinderProfileFeedUIC) C39818r.f106831a.mo62445d(finderProfileFeedFragment).mo62449e(FinderProfileFeedUIC.class);
                                if (finderProfileFeedUIC != null) {
                                    finderProfileFeedUIC.showMoveMvTabTips();
                                }
                                C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(C86709a0.m107535s().mo121142i().mo119689j(aVar, 0) + 1));
                            }
                        }
                    }
                }
            }
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_PROFILE_MOVE_MV_TAB_FLAG_BOOLEAN_SYNC, Boolean.valueOf(S0));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileTabUIC(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        StringBuilder sb = new StringBuilder();
        sb.append("[Provider] username=");
        sb.append(getUsername());
        sb.append(" isSelf=");
        sb.append(isSelf());
        sb.append(" isSelfFlag=");
        sb.append(isSelfFlag());
        sb.append(" isNoSeeAtTab=");
        sb.append(mo78523j4());
        sb.append(" isPrivateAccount=");
        C58739j4 j4Var = C58739j4.f168176a;
        C58961d.C58963b bVar = C58961d.f168673a;
        sb.append(j4Var.mo83688Q(bVar.mo84155b(getUsername())));
        sb.append(" profileContact=");
        sb.append(bVar.mo84155b(getUsername()) != null);
        Log.m105924i("Finder.FinderProfileTabUIC", sb.toString());
        String stringExtra = getActivity().getIntent().getStringExtra("finder_username");
        this.f160650G = stringExtra == null ? "" : stringExtra;
        this.f160651H = C66785b.f191882e.mo90662O5();
        this.f160652I = "wx2bff878c51bab23b";
        this.f160653J = "pages/index/index";
    }
}
