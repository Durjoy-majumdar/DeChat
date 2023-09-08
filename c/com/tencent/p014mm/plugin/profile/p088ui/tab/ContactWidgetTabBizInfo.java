package com.tencent.p014mm.plugin.profile.p088ui.tab;

import ad3.C67028b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.C112968x;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C0124r;
import androidx.viewpager.widget.ViewPager;
import c00.C0405n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.profile.C42599h;
import com.tencent.p014mm.plugin.profile.p088ui.ContactInfoUI;
import com.tencent.p014mm.plugin.profile.p088ui.DialogContactInfoUI;
import com.tencent.p014mm.plugin.profile.p088ui.tab.ContactWidgetTabBizHeaderController;
import com.tencent.p014mm.plugin.profile.p088ui.tab.data.BizProfileDataFetcher;
import com.tencent.p014mm.plugin.profile.p088ui.tab.observer.BizProfileExtraOperateObserver;
import com.tencent.p014mm.plugin.profile.p088ui.tab.observer.BizProfileWidgetOperateObserver;
import com.tencent.p014mm.plugin.profile.p088ui.tab.view.BizProfileTabLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19636w0;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.wechat.aff.ting.TingClientProto;
import d62.C7250m;
import d62.C97425j;
import di3.C86312j;
import ex0.C45695b;
import ex0.C45696d;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60193p4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jf2.C33569a;
import ke3.C88144b;
import kf2.C33905e;
import kf2.C46720a;
import kf2.C46722c;
import kf2.C46723f;
import kotlin.Metadata;
import p248ug.C52558c;
import qf2.C47823a;
import qo3.C101218e0;
import qo3.C77407n;
import qo3.C77426q;
import rb0.C47984k;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C49001ch;
import te3.C51043r10;
import u73.C101987v0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\rB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizInfo;", "Lad3/b;", "Landroidx/lifecycle/r;", "Lcom/tencent/mm/plugin/profile/ui/ContactInfoUI;", "context", "", "brandIconUrl", "Lte3/r10;", "customizedInfo", "", "enterTime", "<init>", "(Lcom/tencent/mm/plugin/profile/ui/ContactInfoUI;Ljava/lang/String;Lte3/r10;J)V", "a", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo */
public final class ContactWidgetTabBizInfo implements C67028b, C0124r {

    /* renamed from: A */
    public boolean f115582A = true;

    /* renamed from: B */
    public String f115583B = "";

    /* renamed from: C */
    public final C13601g f115584C = C36568h.m40985a(new C42694h(this));

    /* renamed from: D */
    public final C13601g f115585D = C36568h.m40985a(new C42695i(this));

    /* renamed from: E */
    public final C13601g f115586E = C36568h.m40985a(new C42693g(this));

    /* renamed from: F */
    public final C13601g f115587F = C36568h.m40985a(new C42688b(this));

    /* renamed from: G */
    public final C13601g f115588G = C36568h.m40985a(new C42689c(this));

    /* renamed from: H */
    public final C42691e f115589H = new C42691e(this);

    /* renamed from: I */
    public View f115590I;

    /* renamed from: J */
    public String f115591J;

    /* renamed from: K */
    public final C13601g f115592K;

    /* renamed from: L */
    public Fragment f115593L;

    /* renamed from: M */
    public C101218e0 f115594M;

    /* renamed from: N */
    public final int f115595N;

    /* renamed from: P */
    public final int f115596P;

    /* renamed from: Q */
    public final int f115597Q;

    /* renamed from: R */
    public final int f115598R;

    /* renamed from: S */
    public final int f115599S;

    /* renamed from: T */
    public final int f115600T;

    /* renamed from: U */
    public boolean f115601U;

    /* renamed from: V */
    public ViewGroup f115602V;

    /* renamed from: W */
    public final int f115603W;

    /* renamed from: X */
    public final String f115604X;

    /* renamed from: d */
    public final ContactInfoUI f115605d;

    /* renamed from: e */
    public String f115606e;

    /* renamed from: f */
    public C51043r10 f115607f;

    /* renamed from: g */
    public long f115608g;

    /* renamed from: h */
    public List<C47823a> f115609h = new ArrayList();

    /* renamed from: i */
    public C72996z1 f115610i;

    /* renamed from: j */
    public C52558c f115611j;

    /* renamed from: n */
    public int f115612n;

    /* renamed from: o */
    public C49001ch f115613o;

    /* renamed from: p */
    public List<? extends C52558c.C52559a> f115614p;

    /* renamed from: q */
    public C52558c.C52560b f115615q;

    /* renamed from: r */
    public boolean f115616r;

    /* renamed from: s */
    public boolean f115617s = true;

    /* renamed from: t */
    public boolean f115618t;

    /* renamed from: u */
    public final String f115619u = "crashFlag";

    /* renamed from: v */
    public ContactWidgetTabBizHeaderController f115620v;

    /* renamed from: w */
    public final List<Fragment> f115621w = new ArrayList();

    /* renamed from: x */
    public ViewPager f115622x;

    /* renamed from: y */
    public C42687a f115623y;

    /* renamed from: z */
    public BizProfileTabLayout f115624z;

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo$a */
    public static final class C42687a extends C112968x {

        /* renamed from: i */
        public final List<Fragment> f115625i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42687a(List<? extends Fragment> list, FragmentManager fragmentManager) {
            super(fragmentManager, 0);
            C87412m.m108594g(list, "fragments");
            C87412m.m108594g(fragmentManager, "fm");
            this.f115625i = list;
        }

        /* renamed from: a */
        public long mo66851a(int i) {
            return (long) System.identityHashCode(this.f115625i.get(i));
        }

        public int getCount() {
            return this.f115625i.size();
        }

        public Fragment getItem(int i) {
            return this.f115625i.get(i);
        }

        public int getItemPosition(Object obj) {
            C87412m.m108594g(obj, "item");
            int P = C110818d0.m150918P(this.f115625i, obj);
            if (P == -1) {
                return -2;
            }
            return P;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo$b */
    public static final class C42688b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ ContactWidgetTabBizInfo f115626d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42688b(ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
            super(0);
            this.f115626d = contactWidgetTabBizInfo;
        }

        public Object invoke() {
            int i = 0;
            int intExtra = this.f115626d.f115605d.getIntent().getIntExtra("biz_profile_tab_type", 0);
            if (intExtra <= 1) {
                i = intExtra;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo$c */
    public static final class C42689c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ ContactWidgetTabBizInfo f115627d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42689c(ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
            super(0);
            this.f115627d = contactWidgetTabBizInfo;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f115627d.f115605d.getIntent().getBooleanExtra("biz_profile_enter_from_finder", false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo$d */
    public static final class C42690d extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ ContactWidgetTabBizInfo f115628d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42690d(ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
            super(0);
            this.f115628d = contactWidgetTabBizInfo;
        }

        public Object invoke() {
            return Long.valueOf(this.f115628d.f115605d.getIntent().getLongExtra("finder_feed_id", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo$e */
    public static final class C42691e implements C42718i0 {

        /* renamed from: a */
        public final /* synthetic */ ContactWidgetTabBizInfo f115629a;

        public C42691e(ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
            this.f115629a = contactWidgetTabBizInfo;
        }

        /* renamed from: a */
        public void mo66852a() {
            ContactWidgetTabBizInfo.m46384b(this.f115629a);
        }

        /* renamed from: b */
        public void mo66853b() {
            ContactWidgetTabBizInfo.m46383a(this.f115629a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo$f */
    public static final class C42692f<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ ContactWidgetTabBizInfo f115630d;

        public C42692f(ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
            this.f115630d = contactWidgetTabBizInfo;
        }

        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x0218  */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x0219  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x023b A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:145:0x029b A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:160:0x031b  */
        /* JADX WARNING: Removed duplicated region for block: B:178:0x0349  */
        /* JADX WARNING: Removed duplicated region for block: B:203:0x0412  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00c3  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0119  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onChanged(java.lang.Object r27) {
            /*
                r26 = this;
                r1 = r26
                r0 = r27
                te3.ch r0 = (te3.C49001ch) r0
                com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo r2 = r1.f115630d
                r2.f115613o = r0
                r2.mo66843f()
                com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController r3 = r2.f115620v
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L_0x00a5
                te3.ch r6 = r2.f115613o
                ug.c r7 = r2.f115611j
                java.lang.String r8 = r2.f115591J
                r3.f115562p = r6
                r3.f115561o = r7
                r3.f115572z = r8
                if (r6 == 0) goto L_0x009d
                int r7 = r6.f131713j
                r8 = r7 & 2
                if (r8 == 0) goto L_0x0029
                r3.f115553d = r4
            L_0x0029:
                r8 = 128(0x80, float:1.794E-43)
                r7 = r7 & r8
                if (r7 == 0) goto L_0x0049
                r3.f115554e = r4
                com.tencent.mm.ui.MMActivity r7 = r3.f115556g
                java.lang.String r7 = com.tencent.p014mm.plugin.profile.p088ui.tab.C42700a.m46397a(r7, r8, r6)
                r3.f115555f = r7
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r7 == 0) goto L_0x0049
                com.tencent.mm.ui.MMActivity r7 = r3.f115556g
                r8 = 2131822646(0x7f110836, float:1.927807E38)
                java.lang.String r7 = r7.getString(r8)
                r3.f115555f = r7
            L_0x0049:
                ug.c$b r7 = r3.f115542E     // Catch:{ Exception -> 0x0058 }
                org.json.JSONObject r8 = r7.f146795a     // Catch:{ Exception -> 0x0058 }
                if (r8 == 0) goto L_0x005a
                java.lang.String r9 = "ConferenceContactExpireTime"
                java.lang.String r8 = r8.optString(r9)     // Catch:{ Exception -> 0x0058 }
                r7.f146800f = r8     // Catch:{ Exception -> 0x0058 }
                goto L_0x005a
            L_0x0058:
                goto L_0x008c
            L_0x005a:
                java.lang.String r7 = r7.f146800f     // Catch:{ Exception -> 0x0058 }
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ Exception -> 0x0058 }
                if (r8 == 0) goto L_0x0063
                goto L_0x008c
            L_0x0063:
                r8 = 0
                long r10 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r7, r8)     // Catch:{ Exception -> 0x0058 }
                int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r7 <= 0) goto L_0x007b
                long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0058 }
                r14 = 1000(0x3e8, double:4.94E-321)
                long r12 = r12 / r14
                long r10 = r10 - r12
                int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r7 >= 0) goto L_0x007b
                r7 = 1
                goto L_0x007c
            L_0x007b:
                r7 = 0
            L_0x007c:
                java.lang.String r8 = "MicroMsg.ContactWidgetTabBizHeaderController"
                java.lang.String r9 = "isBizAccountTimeExpired:%b"
                java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0058 }
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x0058 }
                r10[r5] = r11     // Catch:{ Exception -> 0x0058 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r9, r10)     // Catch:{ Exception -> 0x0058 }
                goto L_0x008d
            L_0x008c:
                r7 = 0
            L_0x008d:
                if (r7 == 0) goto L_0x0094
                com.tencent.mm.plugin.profile.ui.tab.m r7 = r3.f115564r
                r7.f115736k = r4
                goto L_0x0098
            L_0x0094:
                com.tencent.mm.plugin.profile.ui.tab.m r7 = r3.f115564r
                r7.f115736k = r5
            L_0x0098:
                com.tencent.mm.plugin.profile.ui.tab.m r7 = r3.f115564r
                r7.mo66893j()
            L_0x009d:
                com.tencent.mm.plugin.profile.ui.tab.g r7 = r3.f115566t
                r7.mo66869e(r6)
                r3.mo66832j()
            L_0x00a5:
                r3 = 0
                if (r0 == 0) goto L_0x00b0
                com.tencent.mm.plugin.profile.ui.ContactInfoUI r6 = r2.f115605d
                r7 = 4
                java.lang.String r6 = com.tencent.p014mm.plugin.profile.p088ui.tab.C42700a.m46397a(r6, r7, r0)
                goto L_0x00b1
            L_0x00b0:
                r6 = r3
            L_0x00b1:
                if (r6 == 0) goto L_0x00c0
                int r7 = r6.length()
                if (r7 <= 0) goto L_0x00bb
                r7 = 1
                goto L_0x00bc
            L_0x00bb:
                r7 = 0
            L_0x00bc:
                if (r7 != r4) goto L_0x00c0
                r7 = 1
                goto L_0x00c1
            L_0x00c0:
                r7 = 0
            L_0x00c1:
                if (r7 == 0) goto L_0x0119
                androidx.viewpager.widget.ViewPager r0 = r2.f115622x
                if (r0 == 0) goto L_0x0112
                r0.setVisibility(r5)
                com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout r0 = r2.f115624z
                if (r0 == 0) goto L_0x010b
                r7 = 8
                r0.setVisibility(r7)
                com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout r0 = r2.f115624z
                if (r0 == 0) goto L_0x0104
                r0.mo66913r()
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileErrorFragment r0 = new com.tencent.mm.plugin.profile.ui.tab.list.BizProfileErrorFragment
                r0.<init>()
                java.lang.String r7 = "errorMsg"
                gy3.C87412m.m108594g(r6, r7)
                r0.f115699j = r6
                java.util.List<androidx.fragment.app.Fragment> r6 = r2.f115621w
                java.util.ArrayList r6 = (java.util.ArrayList) r6
                r6.clear()
                java.util.List<androidx.fragment.app.Fragment> r6 = r2.f115621w
                java.util.ArrayList r6 = (java.util.ArrayList) r6
                r6.add(r0)
                com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo$a r0 = r2.f115623y
                if (r0 == 0) goto L_0x00fd
                r0.notifyDataSetChanged()
                goto L_0x0331
            L_0x00fd:
                java.lang.String r0 = "pagerAdapter"
                gy3.C87412m.m108603p(r0)
                throw r3
            L_0x0104:
                java.lang.String r0 = "menuTabLayout"
                gy3.C87412m.m108603p(r0)
                throw r3
            L_0x010b:
                java.lang.String r0 = "menuTabLayout"
                gy3.C87412m.m108603p(r0)
                throw r3
            L_0x0112:
                java.lang.String r0 = "viewPager"
                gy3.C87412m.m108603p(r0)
                throw r3
            L_0x0119:
                monitor-enter(r2)
                java.util.List<androidx.fragment.app.Fragment> r6 = r2.f115621w     // Catch:{ all -> 0x041b }
                java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x041b }
                int r6 = r6.size()     // Catch:{ all -> 0x041b }
                gy3.f0 r7 = new gy3.f0     // Catch:{ all -> 0x041b }
                r7.<init>()     // Catch:{ all -> 0x041b }
                java.util.List<androidx.fragment.app.Fragment> r8 = r2.f115621w     // Catch:{ all -> 0x041b }
                java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x041b }
                r9.<init>()     // Catch:{ all -> 0x041b }
                java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x041b }
                java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x041b }
            L_0x0134:
                boolean r10 = r8.hasNext()     // Catch:{ all -> 0x041b }
                if (r10 == 0) goto L_0x0146
                java.lang.Object r10 = r8.next()     // Catch:{ all -> 0x041b }
                boolean r11 = r10 instanceof com.tencent.p014mm.plugin.profile.p088ui.tab.list.BizProfileTabMsgFragment     // Catch:{ all -> 0x041b }
                if (r11 == 0) goto L_0x0134
                r9.add(r10)     // Catch:{ all -> 0x041b }
                goto L_0x0134
            L_0x0146:
                java.lang.Object r8 = sx3.C110818d0.m150916N(r9)     // Catch:{ all -> 0x041b }
                r7.f27484d = r8     // Catch:{ all -> 0x041b }
                java.util.List<androidx.fragment.app.Fragment> r8 = r2.f115621w     // Catch:{ all -> 0x041b }
                java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x041b }
                java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x041b }
            L_0x0154:
                boolean r9 = r8.hasNext()     // Catch:{ all -> 0x041b }
                if (r9 == 0) goto L_0x0173
                java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x041b }
                r10 = r9
                androidx.fragment.app.Fragment r10 = (androidx.fragment.app.Fragment) r10     // Catch:{ all -> 0x041b }
                boolean r11 = r10 instanceof ht1.C46107h1     // Catch:{ all -> 0x041b }
                if (r11 == 0) goto L_0x016f
                ht1.h1 r10 = (ht1.C46107h1) r10     // Catch:{ all -> 0x041b }
                boolean r10 = r10.mo66872B()     // Catch:{ all -> 0x041b }
                if (r10 == 0) goto L_0x016f
                r10 = 1
                goto L_0x0170
            L_0x016f:
                r10 = 0
            L_0x0170:
                if (r10 == 0) goto L_0x0154
                goto L_0x0174
            L_0x0173:
                r9 = r3
            L_0x0174:
                androidx.fragment.app.Fragment r9 = (androidx.fragment.app.Fragment) r9     // Catch:{ all -> 0x041b }
                if (r0 == 0) goto L_0x01ed
                te3.ig r8 = r0.f131709f     // Catch:{ all -> 0x041b }
                if (r8 == 0) goto L_0x01ed
                T r10 = r7.f27484d     // Catch:{ all -> 0x041b }
                if (r10 != 0) goto L_0x01d3
                java.util.LinkedList<te3.hg> r10 = r8.f135306d     // Catch:{ all -> 0x041b }
                if (r10 == 0) goto L_0x018d
                boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x041b }
                r10 = r10 ^ r4
                if (r10 != r4) goto L_0x018d
                r10 = 1
                goto L_0x018e
            L_0x018d:
                r10 = 0
            L_0x018e:
                if (r10 == 0) goto L_0x01d3
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment r8 = new com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment     // Catch:{ all -> 0x041b }
                r8.<init>()     // Catch:{ all -> 0x041b }
                boolean r10 = r2.mo66842e()     // Catch:{ all -> 0x041b }
                r8.f115702o = r10     // Catch:{ all -> 0x041b }
                te3.ch r10 = r2.f115613o     // Catch:{ all -> 0x041b }
                if (r10 != 0) goto L_0x01a4
                te3.ch r10 = new te3.ch     // Catch:{ all -> 0x041b }
                r10.<init>()     // Catch:{ all -> 0x041b }
            L_0x01a4:
                r8.mo66879P(r10)     // Catch:{ all -> 0x041b }
                android.os.Bundle r10 = new android.os.Bundle     // Catch:{ all -> 0x041b }
                r10.<init>()     // Catch:{ all -> 0x041b }
                java.lang.String r11 = "contact"
                com.tencent.mm.storage.z1 r12 = r2.f115610i     // Catch:{ all -> 0x041b }
                gy3.C87412m.m108591d(r12)     // Catch:{ all -> 0x041b }
                java.lang.String r12 = r12.getUsername()     // Catch:{ all -> 0x041b }
                java.lang.String r13 = "contact!!.username"
                gy3.C87412m.m108593f(r12, r13)     // Catch:{ all -> 0x041b }
                g02.C32291d.m39671d(r10, r11, r12)     // Catch:{ all -> 0x041b }
                r8.setArguments(r10)     // Catch:{ all -> 0x041b }
                com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher r10 = r2.mo66840c()     // Catch:{ all -> 0x041b }
                r8.mo66880Q(r10)     // Catch:{ all -> 0x041b }
                r7.f27484d = r8     // Catch:{ all -> 0x041b }
                java.util.List<androidx.fragment.app.Fragment> r7 = r2.f115621w     // Catch:{ all -> 0x041b }
                java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ all -> 0x041b }
                r7.add(r5, r8)     // Catch:{ all -> 0x041b }
                goto L_0x01ed
            L_0x01d3:
                java.util.LinkedList<te3.hg> r8 = r8.f135306d     // Catch:{ all -> 0x041b }
                if (r8 == 0) goto L_0x01df
                boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x041b }
                if (r8 != r4) goto L_0x01df
                r8 = 1
                goto L_0x01e0
            L_0x01df:
                r8 = 0
            L_0x01e0:
                if (r8 == 0) goto L_0x01ed
                T r7 = r7.f27484d     // Catch:{ all -> 0x041b }
                if (r7 == 0) goto L_0x01ed
                java.util.List<androidx.fragment.app.Fragment> r8 = r2.f115621w     // Catch:{ all -> 0x041b }
                java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x041b }
                r8.remove(r7)     // Catch:{ all -> 0x041b }
            L_0x01ed:
                if (r0 == 0) goto L_0x01f6
                int r7 = r0.f131720t     // Catch:{ all -> 0x041b }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x041b }
                goto L_0x01f7
            L_0x01f6:
                r7 = r3
            L_0x01f7:
                if (r0 == 0) goto L_0x0207
                te3.ig r0 = r0.f131711h     // Catch:{ all -> 0x041b }
                if (r0 == 0) goto L_0x0207
                java.util.LinkedList<te3.hg> r0 = r0.f135306d     // Catch:{ all -> 0x041b }
                if (r0 == 0) goto L_0x0207
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x041b }
                r0 = r0 ^ r4
                goto L_0x0208
            L_0x0207:
                r0 = 0
            L_0x0208:
                if (r0 == 0) goto L_0x0215
                if (r7 != 0) goto L_0x020d
                goto L_0x0215
            L_0x020d:
                int r0 = r7.intValue()     // Catch:{ all -> 0x041b }
                if (r0 != 0) goto L_0x0215
                r0 = 1
                goto L_0x0216
            L_0x0215:
                r0 = 0
            L_0x0216:
                if (r7 != 0) goto L_0x0219
                goto L_0x0221
            L_0x0219:
                int r8 = r7.intValue()     // Catch:{ all -> 0x041b }
                if (r8 != r4) goto L_0x0221
                r8 = 1
                goto L_0x0222
            L_0x0221:
                r8 = 0
            L_0x0222:
                java.lang.String r10 = "MicroMsg.ContactWidgetTabBizInfo"
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x041b }
                r11.<init>()     // Catch:{ all -> 0x041b }
                java.lang.String r12 = "update, VideoTabType is "
                r11.append(r12)     // Catch:{ all -> 0x041b }
                r11.append(r7)     // Catch:{ all -> 0x041b }
                java.lang.String r7 = r11.toString()     // Catch:{ all -> 0x041b }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r7)     // Catch:{ all -> 0x041b }
                if (r8 == 0) goto L_0x0299
                if (r9 != 0) goto L_0x0299
                androidx.fragment.app.Fragment r0 = r2.f115593L     // Catch:{ all -> 0x041b }
                if (r0 != 0) goto L_0x0311
                com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout r0 = r2.f115624z     // Catch:{ all -> 0x041b }
                if (r0 == 0) goto L_0x0292
                com.tencent.mm.plugin.profile.ui.ContactInfoUI r7 = r2.f115605d     // Catch:{ all -> 0x041b }
                r9 = 2131830028(0x7f11250c, float:1.9293042E38)
                java.lang.String r7 = r7.getString(r9)     // Catch:{ all -> 0x041b }
                java.lang.String r9 = "context.getString(com.te…dk.R.string.finder_title)"
                gy3.C87412m.m108593f(r7, r9)     // Catch:{ all -> 0x041b }
                r0.setVideoTabText(r7)     // Catch:{ all -> 0x041b }
                java.lang.Class<ht1.p4> r0 = ht1.C60193p4.class
                di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x041b }
                ht1.p4 r0 = (ht1.C60193p4) r0     // Catch:{ all -> 0x041b }
                com.tencent.mm.storage.z1 r7 = r2.f115610i     // Catch:{ all -> 0x041b }
                gy3.C87412m.m108591d(r7)     // Catch:{ all -> 0x041b }
                java.lang.String r7 = r7.getUsername()     // Catch:{ all -> 0x041b }
                rx3.g r9 = r2.f115592K     // Catch:{ all -> 0x041b }
                rx3.n r9 = (rx3.C36570n) r9     // Catch:{ all -> 0x041b }
                java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x041b }
                java.lang.Number r9 = (java.lang.Number) r9     // Catch:{ all -> 0x041b }
                long r9 = r9.longValue()     // Catch:{ all -> 0x041b }
                ht1.p4$a r0 = r0.mw0(r7, r9)     // Catch:{ all -> 0x041b }
                androidx.fragment.app.Fragment r9 = r0.mo71558c()     // Catch:{ all -> 0x041b }
                r2.f115593L = r9     // Catch:{ all -> 0x041b }
                java.util.List<androidx.fragment.app.Fragment> r0 = r2.f115621w     // Catch:{ all -> 0x041b }
                gy3.C87412m.m108591d(r9)     // Catch:{ all -> 0x041b }
                java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x041b }
                r0.add(r9)     // Catch:{ all -> 0x041b }
                java.lang.String r0 = "MicroMsg.ContactWidgetTabBizInfo"
                java.lang.String r7 = "add finder fragment"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)     // Catch:{ all -> 0x041b }
                goto L_0x0311
            L_0x0292:
                java.lang.String r0 = "menuTabLayout"
                gy3.C87412m.m108603p(r0)     // Catch:{ all -> 0x041b }
                throw r3     // Catch:{ all -> 0x041b }
            L_0x0299:
                if (r0 == 0) goto L_0x02fc
                if (r9 != 0) goto L_0x02fc
                com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment r9 = new com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment     // Catch:{ all -> 0x041b }
                r9.<init>()     // Catch:{ all -> 0x041b }
                te3.ch r0 = r2.f115613o     // Catch:{ all -> 0x041b }
                if (r0 != 0) goto L_0x02ab
                te3.ch r0 = new te3.ch     // Catch:{ all -> 0x041b }
                r0.<init>()     // Catch:{ all -> 0x041b }
            L_0x02ab:
                r9.mo66882O(r0)     // Catch:{ all -> 0x041b }
                android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x041b }
                r0.<init>()     // Catch:{ all -> 0x041b }
                java.lang.String r7 = "contact"
                com.tencent.mm.storage.z1 r10 = r2.f115610i     // Catch:{ all -> 0x041b }
                gy3.C87412m.m108591d(r10)     // Catch:{ all -> 0x041b }
                java.lang.String r10 = r10.getUsername()     // Catch:{ all -> 0x041b }
                java.lang.String r11 = "contact!!.username"
                gy3.C87412m.m108593f(r10, r11)     // Catch:{ all -> 0x041b }
                g02.C32291d.m39671d(r0, r7, r10)     // Catch:{ all -> 0x041b }
                r9.setArguments(r0)     // Catch:{ all -> 0x041b }
                com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher r0 = r2.mo66840c()     // Catch:{ all -> 0x041b }
                r9.mo66883P(r0)     // Catch:{ all -> 0x041b }
                com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout r0 = r2.f115624z     // Catch:{ all -> 0x041b }
                if (r0 == 0) goto L_0x02f5
                com.tencent.mm.plugin.profile.ui.ContactInfoUI r7 = r2.f115605d     // Catch:{ all -> 0x041b }
                r10 = 2131822635(0x7f11082b, float:1.9278047E38)
                java.lang.String r7 = r7.getString(r10)     // Catch:{ all -> 0x041b }
                java.lang.String r10 = "context.getString(R.stri…z_profile_tab_name_video)"
                gy3.C87412m.m108593f(r7, r10)     // Catch:{ all -> 0x041b }
                r0.setVideoTabText(r7)     // Catch:{ all -> 0x041b }
                java.util.List<androidx.fragment.app.Fragment> r0 = r2.f115621w     // Catch:{ all -> 0x041b }
                java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x041b }
                r0.add(r9)     // Catch:{ all -> 0x041b }
                java.lang.String r0 = "MicroMsg.ContactWidgetTabBizInfo"
                java.lang.String r7 = "update mp fragment"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)     // Catch:{ all -> 0x041b }
                goto L_0x0311
            L_0x02f5:
                java.lang.String r0 = "menuTabLayout"
                gy3.C87412m.m108603p(r0)     // Catch:{ all -> 0x041b }
                throw r3     // Catch:{ all -> 0x041b }
            L_0x02fc:
                if (r0 != 0) goto L_0x0311
                if (r8 != 0) goto L_0x0311
                if (r9 == 0) goto L_0x0311
                java.util.List<androidx.fragment.app.Fragment> r0 = r2.f115621w     // Catch:{ all -> 0x041b }
                java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x041b }
                r0.remove(r9)     // Catch:{ all -> 0x041b }
                java.lang.String r0 = "MicroMsg.ContactWidgetTabBizInfo"
                java.lang.String r7 = "remove fragment"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)     // Catch:{ all -> 0x041b }
            L_0x0311:
                java.util.List<androidx.fragment.app.Fragment> r0 = r2.f115621w     // Catch:{ all -> 0x041b }
                java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x041b }
                int r0 = r0.size()     // Catch:{ all -> 0x041b }
                if (r6 == r0) goto L_0x032a
                com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo$a r0 = r2.f115623y     // Catch:{ all -> 0x041b }
                if (r0 == 0) goto L_0x0323
                r0.notifyDataSetChanged()     // Catch:{ all -> 0x041b }
                goto L_0x032a
            L_0x0323:
                java.lang.String r0 = "pagerAdapter"
                gy3.C87412m.m108603p(r0)     // Catch:{ all -> 0x041b }
                throw r3     // Catch:{ all -> 0x041b }
            L_0x032a:
                r2.mo66845h(r9, r8)     // Catch:{ all -> 0x041b }
                monitor-exit(r2)
                r2.mo66846i(r4)
            L_0x0331:
                com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo r0 = r1.f115630d
                com.tencent.mm.storage.z1 r2 = r0.f115610i
                if (r2 == 0) goto L_0x0412
                ug.c r2 = r0.f115611j
                if (r2 == 0) goto L_0x0412
                te3.ch r2 = r0.f115613o
                if (r2 == 0) goto L_0x0412
                te3.te r6 = r2.f131708e
                if (r6 == 0) goto L_0x0412
                te3.rd r2 = r2.f131707d
                if (r2 != 0) goto L_0x0349
                goto L_0x0412
            L_0x0349:
                boolean r25 = r0.mo66842e()
                com.tencent.mm.storage.z1 r2 = r0.f115610i
                gy3.C87412m.m108591d(r2)
                java.lang.String r6 = r2.getUsername()
                int r7 = r0.f115612n
                ug.c r2 = r0.f115611j
                gy3.C87412m.m108591d(r2)
                int r2 = r2.field_type
                long r10 = r0.f115608g
                com.tencent.mm.storage.z1 r8 = r0.f115610i
                gy3.C87412m.m108591d(r8)
                boolean r14 = r8.mo62927s3()
                te3.ch r8 = r0.f115613o
                gy3.C87412m.m108591d(r8)
                te3.te r8 = r8.f131708e
                if (r8 == 0) goto L_0x0377
                int r8 = r8.f142141d
                r15 = r8
                goto L_0x0378
            L_0x0377:
                r15 = 0
            L_0x0378:
                te3.ch r8 = r0.f115613o
                gy3.C87412m.m108591d(r8)
                te3.te r8 = r8.f131708e
                if (r8 == 0) goto L_0x0386
                int r8 = r8.f142142e
                r16 = r8
                goto L_0x0388
            L_0x0386:
                r16 = 0
            L_0x0388:
                r17 = 0
                te3.ch r8 = r0.f115613o
                gy3.C87412m.m108591d(r8)
                te3.ig r8 = r8.f131709f
                java.lang.String r18 = kf2.C46722c.m52017b(r8)
                te3.ch r8 = r0.f115613o
                gy3.C87412m.m108591d(r8)
                te3.xh r8 = r8.f131712i
                java.lang.String r19 = kf2.C46722c.m52016a(r8)
                te3.ch r8 = r0.f115613o
                gy3.C87412m.m108591d(r8)
                te3.rd r8 = r8.f131707d
                if (r8 == 0) goto L_0x03ab
                java.lang.String r3 = r8.f140834d
            L_0x03ab:
                r20 = r3
                rx3.g r3 = r0.f115585D
                rx3.n r3 = (rx3.C36570n) r3
                java.lang.Object r3 = r3.getValue()
                r22 = r3
                java.lang.String r22 = (java.lang.String) r22
                java.lang.String r23 = r0.mo66841d()
                com.tencent.mm.plugin.profile.ui.ContactInfoUI r3 = r0.f115605d
                android.content.Intent r24 = r3.getIntent()
                if (r2 != 0) goto L_0x03c7
                r8 = 1
                goto L_0x03cd
            L_0x03c7:
                if (r2 != r4) goto L_0x03cc
                r4 = 2
                r8 = 2
                goto L_0x03cd
            L_0x03cc:
                r8 = 0
            L_0x03cd:
                r9 = 3
                r12 = 0
                java.lang.String r21 = ""
                kf2.C46722c.m52018c(r6, r7, r8, r9, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                te3.ch r2 = r0.f115613o
                if (r2 == 0) goto L_0x03f5
                te3.xh r2 = r2.f131712i
                if (r2 == 0) goto L_0x03f5
                com.tencent.mm.storage.z1 r2 = r0.f115610i
                gy3.C87412m.m108591d(r2)
                java.lang.String r3 = r2.getUsername()
                r4 = 104(0x68, float:1.46E-43)
                int r5 = r0.f115612n
                long r6 = r0.f115608g
                com.tencent.mm.plugin.profile.ui.ContactInfoUI r2 = r0.f115605d
                android.content.Intent r8 = r2.getIntent()
                kf2.C46723f.m52019a(r3, r4, r5, r6, r8)
            L_0x03f5:
                te3.ch r2 = r0.f115613o
                if (r2 == 0) goto L_0x041a
                com.tencent.mm.storage.z1 r2 = r0.f115610i
                gy3.C87412m.m108591d(r2)
                java.lang.String r3 = r2.getUsername()
                r4 = 101(0x65, float:1.42E-43)
                int r5 = r0.f115612n
                long r6 = r0.f115608g
                com.tencent.mm.plugin.profile.ui.ContactInfoUI r0 = r0.f115605d
                android.content.Intent r8 = r0.getIntent()
                kf2.C46723f.m52019a(r3, r4, r5, r6, r8)
                goto L_0x041a
            L_0x0412:
                java.lang.String r0 = "MicroMsg.ContactWidgetTabBizInfo"
                java.lang.String r2 = "reportUpdate fail, err"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
            L_0x041a:
                return
            L_0x041b:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.tab.ContactWidgetTabBizInfo.C42692f.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo$g */
    public static final class C42693g extends C87413o implements C32224a<BizProfileDataFetcher> {

        /* renamed from: d */
        public final /* synthetic */ ContactWidgetTabBizInfo f115631d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42693g(ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
            super(0);
            this.f115631d = contactWidgetTabBizInfo;
        }

        public Object invoke() {
            ContactWidgetTabBizInfo contactWidgetTabBizInfo = this.f115631d;
            int i = contactWidgetTabBizInfo.f115612n;
            C72996z1 z1Var = contactWidgetTabBizInfo.f115610i;
            String username = z1Var != null ? z1Var.getUsername() : null;
            if (username == null) {
                username = "";
            }
            ContactWidgetTabBizInfo contactWidgetTabBizInfo2 = this.f115631d;
            BizProfileDataFetcher bizProfileDataFetcher = new BizProfileDataFetcher(i, username, contactWidgetTabBizInfo2.f115605d, contactWidgetTabBizInfo2.mo66841d());
            bizProfileDataFetcher.f115659q = this.f115631d.mo66842e() ? 1 : 0;
            return bizProfileDataFetcher;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo$h */
    public static final class C42694h extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ ContactWidgetTabBizInfo f115632d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42694h(ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
            super(0);
            this.f115632d = contactWidgetTabBizInfo;
        }

        public Object invoke() {
            Bundle bundleExtra = this.f115632d.f115605d.getIntent().getBundleExtra("Contact_Ext_Args");
            if (bundleExtra != null) {
                return bundleExtra.getString("Contact_Ext_Args_Search_Click_Id", "");
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo$i */
    public static final class C42695i extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ ContactWidgetTabBizInfo f115633d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42695i(ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
            super(0);
            this.f115633d = contactWidgetTabBizInfo;
        }

        public Object invoke() {
            Bundle bundleExtra = this.f115633d.f115605d.getIntent().getBundleExtra("Contact_Ext_Args");
            if (bundleExtra != null) {
                return bundleExtra.getString("Contact_Ext_Args_Search_Id", "");
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo$j */
    public static final class C42696j implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ ContactWidgetTabBizInfo f115634d;

        public C42696j(ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
            this.f115634d = contactWidgetTabBizInfo;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            ContactWidgetTabBizInfo.m46384b(this.f115634d);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo$k */
    public static final class C42697k implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ ContactWidgetTabBizInfo f115635d;

        public C42697k(ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
            this.f115635d = contactWidgetTabBizInfo;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            ContactWidgetTabBizInfo.m46383a(this.f115635d);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo$l */
    public static final class C42698l implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ ContactWidgetTabBizInfo f115636d;

        public C42698l(ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
            this.f115636d = contactWidgetTabBizInfo;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController = this.f115636d.f115620v;
            if (contactWidgetTabBizHeaderController == null) {
                return true;
            }
            contactWidgetTabBizHeaderController.mo66826d();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo$m */
    public static final class C42699m implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ContactWidgetTabBizInfo f115637d;

        public C42699m(ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
            this.f115637d = contactWidgetTabBizInfo;
        }

        public final void run() {
            ContactWidgetTabBizInfo contactWidgetTabBizInfo = this.f115637d;
            if (contactWidgetTabBizInfo.f115602V == null) {
                contactWidgetTabBizInfo.f115602V = (ViewGroup) contactWidgetTabBizInfo.f115605d.findViewById(C0966R.C0970id.f357825by3);
            }
            ViewGroup viewGroup = this.f115637d.f115602V;
            if (viewGroup != null) {
                RelativeLayout.LayoutParams layoutParams = null;
                ViewGroup.LayoutParams layoutParams2 = viewGroup != null ? viewGroup.getLayoutParams() : null;
                if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                    layoutParams = (RelativeLayout.LayoutParams) layoutParams2;
                }
                if (layoutParams != null) {
                    ContactWidgetTabBizInfo contactWidgetTabBizInfo2 = this.f115637d;
                    layoutParams.addRule(15, -1);
                    ViewGroup viewGroup2 = contactWidgetTabBizInfo2.f115602V;
                    if (viewGroup2 != null) {
                        viewGroup2.setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }

    public ContactWidgetTabBizInfo(ContactInfoUI contactInfoUI, String str, C51043r10 r102, long j) {
        C87412m.m108594g(contactInfoUI, "context");
        this.f115605d = contactInfoUI;
        this.f115606e = str;
        this.f115607f = r102;
        this.f115608g = j;
        this.f115609h.add(new BizProfileExtraOperateObserver());
        this.f115609h.add(new BizProfileWidgetOperateObserver(contactInfoUI));
        this.f115592K = C36568h.m40985a(new C42690d(this));
        this.f115595N = 2;
        this.f115596P = 3;
        this.f115597Q = 4;
        this.f115598R = 5;
        this.f115599S = 6;
        this.f115600T = 7;
        this.f115603W = 1;
        this.f115604X = "https://mp.weixin.qq.com/mp/infringement?username=%s&from=1#wechat_redirect";
    }

    /* renamed from: a */
    public static final void m46383a(ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        C77407n nVar = new C77407n((Context) contactWidgetTabBizInfo.f115605d, 1, false);
        nVar.f225771i = new C42768v(contactWidgetTabBizInfo);
        nVar.f225782p = new C42774w(contactWidgetTabBizInfo);
        nVar.mo107573q();
        C72996z1 z1Var = contactWidgetTabBizInfo.f115610i;
        C46723f.m52019a(z1Var != null ? z1Var.getUsername() : null, 600, contactWidgetTabBizInfo.f115612n, contactWidgetTabBizInfo.f115608g, contactWidgetTabBizInfo.f115605d.getIntent());
    }

    /* renamed from: b */
    public static final void m46384b(ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        Class cls = C0405n.class;
        ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController = contactWidgetTabBizInfo.f115620v;
        if (contactWidgetTabBizHeaderController != null) {
            if (!contactWidgetTabBizHeaderController.f115554e || !(!Util.isNullOrNil(contactWidgetTabBizHeaderController.f115555f))) {
                contactWidgetTabBizHeaderController = null;
            }
            if (contactWidgetTabBizHeaderController != null) {
                C77426q qVar = new C77426q(contactWidgetTabBizInfo.f115605d);
                qVar.mo107595g(contactWidgetTabBizHeaderController.f115555f);
                qVar.mo107602n(contactWidgetTabBizInfo.f115605d.getString(C0966R.string.ncg));
                qVar.mo107600l(C42775x.f115820a);
                qVar.mo107603o();
                return;
            }
        }
        C72996z1 z1Var = contactWidgetTabBizInfo.f115610i;
        String username = z1Var != null ? z1Var.getUsername() : null;
        Intent O20 = ((C0405n) C86312j.m106911c(cls)).O20();
        O20.putExtra("ftsneedkeyboard", false);
        O20.putExtra("ftsbizscene", 19);
        O20.putExtra("ftsType", 2);
        Map<String, String> hn = ((C0405n) C86312j.m106911c(cls)).mo280hn(19, false, 2);
        C87412m.m108593f(hn, "params");
        hn.put("userName", username);
        C49001ch chVar = contactWidgetTabBizInfo.f115613o;
        if (!Util.isNullOrNil(chVar != null ? chVar.f131717q : null)) {
            C49001ch chVar2 = contactWidgetTabBizInfo.f115613o;
            hn.put("thirdExtParam", chVar2 != null ? chVar2.f131717q : null);
        }
        O20.putExtra("rawUrl", C101987v0.m134270d(hn, 0));
        O20.putExtra("key_load_js_without_delay", true);
        O20.putExtra("ftsbizusername", username);
        O20.putExtra(C74928u.C45093i.f122322n, 13307);
        String str = C74928u.C45093i.f122323o;
        int i = contactWidgetTabBizInfo.f115612n;
        C33569a jo = C42599h.wx0().mo59508jo(username);
        String str2 = jo != null ? jo.field_decryptUserName : "";
        String valueOf = String.valueOf(C19636w0.f55626c);
        Log.m105919d("MicroMsg.Kv13307", "getArgs username:%s scene::%s optype:%d opscene:%d decryptUserName:%s profileScene:%d", username, 3, Integer.valueOf(TingClientProto.TingScene.TingScene_ChatMusicSearch_VALUE), 4, str2, Integer.valueOf(i));
        O20.putStringArrayListExtra(str, new C33905e(username, TingClientProto.TingScene.TingScene_ChatMusicSearch_VALUE, str2, valueOf, i));
        O20.addFlags(67108864);
        C88144b.m109806x(contactWidgetTabBizInfo.f115605d, O20, (Bundle) null);
        C46723f.m52021c(username, TingClientProto.TingScene.TingScene_ChatHistory_VALUE, contactWidgetTabBizInfo.f115608g, contactWidgetTabBizInfo.f115605d.getIntent(), contactWidgetTabBizInfo.mo66842e() ? 1 : 0);
    }

    /* renamed from: c */
    public final BizProfileDataFetcher mo66840c() {
        return (BizProfileDataFetcher) ((C36570n) this.f115586E).getValue();
    }

    /* renamed from: d */
    public final String mo66841d() {
        return (String) ((C36570n) this.f115584C).getValue();
    }

    /* renamed from: e */
    public final boolean mo66842e() {
        return this.f115605d.isFragmentMode() || (this.f115605d instanceof DialogContactInfoUI);
    }

    /* renamed from: f */
    public final void mo66843f() {
        C52558c.C52560b bVar;
        C72996z1 z1Var = this.f115610i;
        if (z1Var != null) {
            String str = null;
            C52558c b = C47984k.m53328b(z1Var != null ? z1Var.getUsername() : null);
            this.f115615q = null;
            boolean z = false;
            if ((b == null || b.mo73500r2(false) == null) && this.f115607f != null) {
                b = new C52558c();
                C72996z1 z1Var2 = this.f115610i;
                b.field_username = z1Var2 != null ? z1Var2.getUsername() : null;
                C51043r10 r102 = this.f115607f;
                b.field_brandFlag = r102 != null ? r102.f140656d : 0;
                b.field_brandIconURL = r102 != null ? r102.f140659g : null;
                b.field_brandInfo = r102 != null ? r102.f140658f : null;
                b.field_extInfo = r102 != null ? r102.f140657e : null;
                b.field_type = b.mo73500r2(false).mo73517j();
            }
            if (b != null) {
                if (b.field_brandInfo == null && b.field_extInfo == null && this.f115607f != null) {
                    C72996z1 z1Var3 = this.f115610i;
                    b.field_username = z1Var3 != null ? z1Var3.getUsername() : null;
                    C51043r10 r103 = this.f115607f;
                    b.field_brandFlag = r103 != null ? r103.f140656d : 0;
                    b.field_brandIconURL = r103 != null ? r103.f140659g : null;
                    b.field_brandInfo = r103 != null ? r103.f140658f : null;
                    b.field_extInfo = r103 != null ? r103.f140657e : null;
                    b.field_type = b.mo73500r2(false).mo73517j();
                }
                this.f115611j = b;
                this.f115614p = b.mo73496n2();
                C52558c.C52560b r2 = b.mo73500r2(false);
                this.f115615q = r2;
                if ((r2 != null ? r2.mo73522o() : null) != null) {
                    C52558c.C52560b bVar2 = this.f115615q;
                    if (bVar2 != null) {
                        str = bVar2.mo73522o();
                    }
                    if (str == null || str.length() == 0) {
                        z = true;
                    }
                    if (z && (bVar = this.f115615q) != null) {
                        bVar.mo73522o();
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo66844g(boolean z, boolean z2) {
        Log.m105918d("MicroMsg.ContactWidgetTabBizInfo", "updateActionBarMenu  expand:" + z + "  forceUpdate:" + z2 + "  followStatus:" + this.f115582A);
        if (z2 || z != this.f115601U) {
            ContactInfoUI contactInfoUI = this.f115605d;
            contactInfoUI.getClass();
            if (contactInfoUI instanceof DialogContactInfoUI) {
                Log.m105924i("MicroMsg.ContactWidgetTabBizInfo", "isDialogStyle");
                return;
            }
            Log.m105924i("MicroMsg.ContactWidgetTabBizInfo", "updateActionBarMenu  return");
            this.f115601U = z;
            this.f115605d.removeAllOptionMenu();
            if (this.f115582A || z) {
                this.f115605d.addIconOptionMenu(1, (int) C0966R.string.k3j, (int) C0966R.raw.actionbar_icon_dark_search, (MenuItem.OnMenuItemClickListener) new C42696j(this));
                this.f115605d.addIconOptionMenu(0, (int) C0966R.string.b_u, (int) C0966R.raw.actionbar_icon_dark_more, (MenuItem.OnMenuItemClickListener) new C42697k(this));
                return;
            }
            ContactInfoUI contactInfoUI2 = this.f115605d;
            contactInfoUI2.addTextOptionMenu(2, contactInfoUI2.getString(C0966R.string.bjw), new C42698l(this), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
            if (mo66842e()) {
                View view = this.f115590I;
                if (view != null) {
                    view.post(new C42699m(this));
                } else {
                    C87412m.m108603p("contentView");
                    throw null;
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo66845h(Fragment fragment, boolean z) {
        if (fragment != null && ((Number) ((C36570n) this.f115587F).getValue()).intValue() == 1) {
            int indexOf = (z || !((Boolean) ((C36570n) this.f115588G).getValue()).booleanValue()) ? ((ArrayList) this.f115621w).indexOf(fragment) : 0;
            if (indexOf >= 0) {
                ViewPager viewPager = this.f115622x;
                if (viewPager != null) {
                    viewPager.setCurrentItem(indexOf, false);
                } else {
                    C87412m.m108603p("viewPager");
                    throw null;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        r1 = (r1 = (r1 = r1.f131712i).f144646d).f145298g;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f8  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo66846i(boolean r28) {
        /*
            r27 = this;
            r0 = r27
            com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout r1 = r0.f115624z
            java.lang.String r2 = "menuTabLayout"
            r3 = 0
            if (r1 == 0) goto L_0x015f
            r1.mo66913r()
            java.util.List<androidx.fragment.app.Fragment> r1 = r0.f115621w
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0016:
            boolean r7 = r1.hasNext()
            r8 = 1
            if (r7 == 0) goto L_0x0038
            java.lang.Object r7 = r1.next()
            androidx.fragment.app.Fragment r7 = (androidx.fragment.app.Fragment) r7
            boolean r9 = r7 instanceof ht1.C46107h1
            if (r9 == 0) goto L_0x0032
            r9 = r7
            ht1.h1 r9 = (ht1.C46107h1) r9
            boolean r9 = r9.mo66872B()
            if (r9 == 0) goto L_0x0032
            r5 = 1
            goto L_0x0016
        L_0x0032:
            boolean r7 = r7 instanceof com.tencent.p014mm.plugin.profile.p088ui.tab.list.BizProfileTabMsgFragment
            if (r7 == 0) goto L_0x0016
            r6 = 1
            goto L_0x0016
        L_0x0038:
            te3.ch r1 = r0.f115613o
            if (r1 == 0) goto L_0x0051
            te3.xh r1 = r1.f131712i
            if (r1 == 0) goto L_0x0051
            te3.yh r1 = r1.f144646d
            if (r1 == 0) goto L_0x0051
            java.util.LinkedList<te3.zh> r1 = r1.f145298g
            if (r1 == 0) goto L_0x0051
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r8
            if (r1 != r8) goto L_0x0051
            r1 = 1
            goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            if (r6 == 0) goto L_0x006f
            if (r5 != 0) goto L_0x0058
            if (r1 == 0) goto L_0x006f
        L_0x0058:
            com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout r7 = r0.f115624z
            if (r7 == 0) goto L_0x006b
            android.view.ViewGroup r7 = r7.f115804x
            if (r7 == 0) goto L_0x0064
            r7.setVisibility(r4)
            goto L_0x006f
        L_0x0064:
            java.lang.String r1 = "mMsgLayout"
            gy3.C87412m.m108603p(r1)
            throw r3
        L_0x006b:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x006f:
            if (r5 == 0) goto L_0x008c
            if (r6 != 0) goto L_0x0075
            if (r1 == 0) goto L_0x008c
        L_0x0075:
            com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout r7 = r0.f115624z
            if (r7 == 0) goto L_0x0088
            android.view.ViewGroup r7 = r7.f115805y
            if (r7 == 0) goto L_0x0081
            r7.setVisibility(r4)
            goto L_0x008c
        L_0x0081:
            java.lang.String r1 = "mVideoLayout"
            gy3.C87412m.m108603p(r1)
            throw r3
        L_0x0088:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x008c:
            if (r1 == 0) goto L_0x00a5
            com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout r7 = r0.f115624z
            if (r7 == 0) goto L_0x00a1
            android.view.ViewGroup r7 = r7.f115806z
            if (r7 == 0) goto L_0x009a
            r7.setVisibility(r4)
            goto L_0x00a5
        L_0x009a:
            java.lang.String r1 = "mServiceLayout"
            gy3.C87412m.m108603p(r1)
            throw r3
        L_0x00a1:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x00a5:
            com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout r7 = r0.f115624z
            if (r7 == 0) goto L_0x015b
            androidx.viewpager.widget.ViewPager r9 = r0.f115622x
            if (r9 == 0) goto L_0x0154
            int r9 = r9.getCurrentItem()
            if (r9 < 0) goto L_0x00c6
            int r10 = r7.getTabCount()
            if (r9 < r10) goto L_0x00ba
            goto L_0x00c6
        L_0x00ba:
            if (r9 == 0) goto L_0x00c3
            if (r9 == r8) goto L_0x00bf
            goto L_0x00c6
        L_0x00bf:
            r7.mo66921w()
            goto L_0x00c6
        L_0x00c3:
            r7.mo66920t()
        L_0x00c6:
            java.util.List<androidx.fragment.app.Fragment> r7 = r0.f115621w
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            int r7 = r7.size()
            if (r7 > r8) goto L_0x00ee
            com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout r7 = r0.f115624z
            if (r7 == 0) goto L_0x00ea
            int r7 = r7.getTabCount()
            if (r7 > 0) goto L_0x00ee
            com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout r1 = r0.f115624z
            if (r1 == 0) goto L_0x00e6
            r2 = 8
            r1.setVisibility(r2)
            r1 = 0
            r5 = 0
            goto L_0x00f6
        L_0x00e6:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x00ea:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x00ee:
            com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout r7 = r0.f115624z
            if (r7 == 0) goto L_0x0150
            r7.setVisibility(r4)
            r4 = r6
        L_0x00f6:
            if (r28 == 0) goto L_0x014f
            if (r4 == 0) goto L_0x010a
            mf2.d r6 = mf2.C34555d.f92946a
            com.tencent.mm.storage.z1 r7 = r0.f115610i
            r8 = 0
            int r9 = r0.f115612n
            long r10 = r0.f115608g
            java.lang.String r12 = r27.mo66841d()
            r6.mo59637b(r7, r8, r9, r10, r12)
        L_0x010a:
            if (r5 == 0) goto L_0x0120
            mf2.d r13 = mf2.C34555d.f92946a
            com.tencent.mm.storage.z1 r14 = r0.f115610i
            r15 = 1
            int r2 = r0.f115612n
            long r6 = r0.f115608g
            java.lang.String r19 = r27.mo66841d()
            r16 = r2
            r17 = r6
            r13.mo59637b(r14, r15, r16, r17, r19)
        L_0x0120:
            if (r1 == 0) goto L_0x0139
            mf2.d r20 = mf2.C34555d.f92946a
            com.tencent.mm.storage.z1 r2 = r0.f115610i
            r22 = 2
            int r3 = r0.f115612n
            long r6 = r0.f115608g
            java.lang.String r26 = r27.mo66841d()
            r21 = r2
            r23 = r3
            r24 = r6
            r20.mo59637b(r21, r22, r23, r24, r26)
        L_0x0139:
            if (r4 != 0) goto L_0x014f
            if (r5 != 0) goto L_0x014f
            if (r1 != 0) goto L_0x014f
            mf2.d r8 = mf2.C34555d.f92946a
            com.tencent.mm.storage.z1 r9 = r0.f115610i
            r10 = 3
            int r11 = r0.f115612n
            long r12 = r0.f115608g
            java.lang.String r14 = r27.mo66841d()
            r8.mo59637b(r9, r10, r11, r12, r14)
        L_0x014f:
            return
        L_0x0150:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x0154:
            java.lang.String r1 = "viewPager"
            gy3.C87412m.m108603p(r1)
            throw r3
        L_0x015b:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x015f:
            gy3.C87412m.m108603p(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.tab.ContactWidgetTabBizInfo.mo66846i(boolean):void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Fragment fragment;
        Log.m105925i("MicroMsg.ContactWidgetTabBizInfo", "onActivityResult, requestCode = %d, resultCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == this.f115603W) {
            if (i2 == -1 && intent != null) {
                String stringExtra = intent.getStringExtra("be_send_card_name");
                String stringExtra2 = intent.getStringExtra("received_card_name");
                boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
                String stringExtra3 = intent.getStringExtra("custom_send_text");
                C97425j a = C7250m.m7431a();
                C49001ch chVar = this.f115613o;
                a.nw0(stringExtra, stringExtra2, booleanExtra, chVar != null ? chVar.f131723w : null);
                C7250m.m7431a().mo136252Ar(stringExtra3, stringExtra2);
                ContactInfoUI contactInfoUI = this.f115605d;
                C75026b.m89951a(contactInfoUI, contactInfoUI.getString(C0966R.string.euo));
            }
        } else if (i == 10010 && (fragment = this.f115593L) != null) {
            fragment.onActivityResult(i, i2, intent);
        }
    }

    public boolean onCreate() {
        C72996z1 z1Var = this.f115610i;
        if (z1Var == null || this.f115611j == null) {
            Log.m105928w("MicroMsg.ContactWidgetTabBizInfo", "reportStart fail, err");
        } else {
            String username = z1Var.getUsername();
            int i = this.f115612n;
            C52558c cVar = this.f115611j;
            C87412m.m108591d(cVar);
            int i2 = cVar.field_type;
            long j = this.f115608g;
            C72996z1 z1Var2 = this.f115610i;
            C87412m.m108591d(z1Var2);
            boolean s3 = z1Var2.mo62927s3();
            String str = this.f115583B;
            C46722c.m52018c(username, i, i2 == 0 ? 1 : i2 == 1 ? 2 : 0, 1, j, 0, s3 ? 1 : 0, 0, 0, 0, "", "", "", str != null ? str : "", (String) ((C36570n) this.f115585D).getValue(), mo66841d(), this.f115605d.getIntent(), mo66842e() ? 1 : 0);
        }
        ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController = this.f115620v;
        if (contactWidgetTabBizHeaderController != null) {
            if (contactWidgetTabBizHeaderController.f115551N == null && ((C45696d) C86709a0.m107533q(C45696d.class)).mo71014uw()) {
                ContactWidgetTabBizHeaderController.BizFinderLineStatusChangedEventListenerImpl bizFinderLineStatusChangedEventListenerImpl = new ContactWidgetTabBizHeaderController.BizFinderLineStatusChangedEventListenerImpl(contactWidgetTabBizHeaderController);
                contactWidgetTabBizHeaderController.f115551N = bizFinderLineStatusChangedEventListenerImpl;
                bizFinderLineStatusChangedEventListenerImpl.alive();
            }
            C46720a aVar = C46720a.f125771a;
            C46720a.f125772b = System.currentTimeMillis();
            ((HashMap) C46720a.f125773c).clear();
            C46720a.f125774d.clear();
            contactWidgetTabBizHeaderController.f115556g.setRequestedOrientation(1);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x016c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onDestroy() {
        /*
            r26 = this;
            r0 = r26
            java.lang.Class<ex0.d> r1 = ex0.C45696d.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            ex0.d r1 = (ex0.C45696d) r1
            long r2 = java.lang.System.currentTimeMillis()
            com.tencent.mm.storage.z1 r4 = r0.f115610i
            gy3.C87412m.m108591d(r4)
            java.lang.String r4 = r4.getUsername()
            r1.mo70961Gb(r2, r4)
            com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController r1 = r0.f115620v
            r2 = 0
            if (r1 == 0) goto L_0x0028
            com.tencent.mm.sdk.event.IListener r3 = r1.f115551N
            if (r3 == 0) goto L_0x0028
            r3.dead()
            r1.f115551N = r2
        L_0x0028:
            kf2.a r1 = kf2.C46720a.f125771a
            com.tencent.mm.storage.z1 r1 = r0.f115610i
            gy3.C87412m.m108591d(r1)
            java.lang.String r1 = r1.getUsername()
            java.lang.String r3 = "contact!!.username"
            gy3.C87412m.m108593f(r1, r3)
            int r9 = r0.f115612n
            java.util.Map<java.lang.Integer, kf2.b> r3 = kf2.C46720a.f125773c
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r10 = r3.iterator()
        L_0x0046:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x0065
            java.lang.Object r3 = r10.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getKey()
            java.lang.Number r3 = (java.lang.Number) r3
            int r4 = r3.intValue()
            long r6 = kf2.C46720a.f125772b
            r8 = 0
            r3 = r1
            r5 = r9
            kf2.C46723f.m52019a(r3, r4, r5, r6, r8)
            goto L_0x0046
        L_0x0065:
            java.util.ArrayList<kf2.b> r3 = kf2.C46720a.f125774d
            java.util.Iterator r10 = r3.iterator()
        L_0x006b:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x0082
            java.lang.Object r3 = r10.next()
            kf2.b r3 = (kf2.C46721b) r3
            int r4 = r3.f125775a
            long r6 = kf2.C46720a.f125772b
            r8 = 0
            r3 = r1
            r5 = r9
            kf2.C46723f.m52019a(r3, r4, r5, r6, r8)
            goto L_0x006b
        L_0x0082:
            java.util.Map<java.lang.Integer, kf2.b> r1 = kf2.C46720a.f125773c
            java.util.HashMap r1 = (java.util.HashMap) r1
            r1.clear()
            java.util.ArrayList<kf2.b> r1 = kf2.C46720a.f125774d
            r1.clear()
            com.tencent.mm.storage.z1 r1 = r0.f115610i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0136
            ug.c r1 = r0.f115611j
            if (r1 == 0) goto L_0x0136
            te3.ch r1 = r0.f115613o
            if (r1 == 0) goto L_0x0136
            te3.te r6 = r1.f131708e
            if (r6 == 0) goto L_0x0136
            gy3.C87412m.m108591d(r1)
            te3.rd r1 = r1.f131707d
            if (r1 != 0) goto L_0x00aa
            goto L_0x0136
        L_0x00aa:
            long r12 = java.lang.System.currentTimeMillis()
            com.tencent.mm.storage.z1 r1 = r0.f115610i
            gy3.C87412m.m108591d(r1)
            java.lang.String r6 = r1.getUsername()
            int r7 = r0.f115612n
            ug.c r1 = r0.f115611j
            gy3.C87412m.m108591d(r1)
            int r1 = r1.field_type
            long r10 = r0.f115608g
            com.tencent.mm.storage.z1 r8 = r0.f115610i
            gy3.C87412m.m108591d(r8)
            boolean r14 = r8.mo62927s3()
            te3.ch r8 = r0.f115613o
            gy3.C87412m.m108591d(r8)
            te3.te r8 = r8.f131708e
            int r15 = r8.f142141d
            te3.ch r8 = r0.f115613o
            gy3.C87412m.m108591d(r8)
            te3.te r8 = r8.f131708e
            if (r8 == 0) goto L_0x00e2
            int r8 = r8.f142142e
            r16 = r8
            goto L_0x00e4
        L_0x00e2:
            r16 = 0
        L_0x00e4:
            r17 = 0
            te3.ch r8 = r0.f115613o
            gy3.C87412m.m108591d(r8)
            te3.ig r8 = r8.f131709f
            java.lang.String r18 = kf2.C46722c.m52017b(r8)
            te3.ch r8 = r0.f115613o
            gy3.C87412m.m108591d(r8)
            te3.xh r8 = r8.f131712i
            java.lang.String r19 = kf2.C46722c.m52016a(r8)
            te3.ch r8 = r0.f115613o
            gy3.C87412m.m108591d(r8)
            te3.rd r8 = r8.f131707d
            if (r8 == 0) goto L_0x010a
            java.lang.String r8 = r8.f140834d
            r20 = r8
            goto L_0x010c
        L_0x010a:
            r20 = r2
        L_0x010c:
            rx3.g r8 = r0.f115585D
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            r22 = r8
            java.lang.String r22 = (java.lang.String) r22
            java.lang.String r23 = r26.mo66841d()
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r8 = r0.f115605d
            android.content.Intent r24 = r8.getIntent()
            boolean r25 = r26.mo66842e()
            if (r1 != 0) goto L_0x012a
            r8 = 1
            goto L_0x012f
        L_0x012a:
            if (r1 != r4) goto L_0x012e
            r8 = 2
            goto L_0x012f
        L_0x012e:
            r8 = 0
        L_0x012f:
            r9 = 2
            java.lang.String r21 = ""
            kf2.C46722c.m52018c(r6, r7, r8, r9, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x013e
        L_0x0136:
            java.lang.String r1 = "MicroMsg.ContactWidgetTabBizInfo"
            java.lang.String r6 = "reportEnd fail, err"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r6)
        L_0x013e:
            te3.ch r1 = r0.f115613o
            if (r1 == 0) goto L_0x0149
            te3.mi r1 = r1.f131719s
            if (r1 == 0) goto L_0x0149
            pe3.b r1 = r1.f138039d
            goto L_0x014a
        L_0x0149:
            r1 = r2
        L_0x014a:
            java.lang.String r1 = sf0.C48374j0.m53713b(r1)
            te3.ch r6 = r0.f115613o
            if (r6 == 0) goto L_0x0159
            te3.mi r6 = r6.f131719s
            if (r6 == 0) goto L_0x0159
            pe3.b r6 = r6.f138040e
            goto L_0x015a
        L_0x0159:
            r6 = r2
        L_0x015a:
            java.lang.String r6 = sf0.C48374j0.m53713b(r6)
            if (r1 == 0) goto L_0x0169
            int r7 = r1.length()
            if (r7 != 0) goto L_0x0167
            goto L_0x0169
        L_0x0167:
            r7 = 0
            goto L_0x016a
        L_0x0169:
            r7 = 1
        L_0x016a:
            if (r7 != 0) goto L_0x01a7
            if (r6 == 0) goto L_0x0177
            int r7 = r6.length()
            if (r7 != 0) goto L_0x0175
            goto L_0x0177
        L_0x0175:
            r7 = 0
            goto L_0x0178
        L_0x0177:
            r7 = 1
        L_0x0178:
            if (r7 == 0) goto L_0x017b
            goto L_0x01a7
        L_0x017b:
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 22118(0x5666, float:3.0994E-41)
            r9 = 5
            java.lang.Object[] r9 = new java.lang.Object[r9]
            long r10 = r0.f115608g
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r9[r5] = r10
            com.tencent.mm.storage.z1 r5 = r0.f115610i
            if (r5 == 0) goto L_0x0192
            java.lang.String r2 = r5.getUsername()
        L_0x0192:
            if (r2 != 0) goto L_0x0196
            java.lang.String r2 = ""
        L_0x0196:
            r9[r4] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r9[r3] = r2
            r2 = 3
            r9[r2] = r1
            r1 = 4
            r9[r1] = r6
            r7.mo160131h(r8, r9)
        L_0x01a7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.tab.ContactWidgetTabBizInfo.onDestroy():boolean");
    }

    public boolean onDetach() {
        return true;
    }

    public void onPause() {
        Fragment fragment;
        C45695b bVar;
        ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController = this.f115620v;
        if (!(contactWidgetTabBizHeaderController == null || (bVar = contactWidgetTabBizHeaderController.f115550M) == null)) {
            bVar.stopCheck();
        }
        if (this.f115605d.isFinishing() && (fragment = this.f115593L) != null) {
            C60193p4.C46113a aVar = fragment instanceof C60193p4.C46113a ? (C60193p4.C46113a) fragment : null;
            if (aVar != null) {
                aVar.mo71557H();
            }
        }
    }

    public void onResume() {
        Class cls = C45696d.class;
        ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController = this.f115620v;
        if (contactWidgetTabBizHeaderController != null) {
            if (((C45696d) C86709a0.m107533q(cls)).mo71014uw()) {
                if (contactWidgetTabBizHeaderController.f115550M == null) {
                    contactWidgetTabBizHeaderController.f115550M = ((C45696d) C86709a0.m107533q(cls)).F60(8);
                }
                ((C45696d) C86709a0.m107533q(cls)).mo70974T2();
                contactWidgetTabBizHeaderController.f115550M.mo69386a(contactWidgetTabBizHeaderController.f115563q);
            }
            contactWidgetTabBizHeaderController.f115566t.mo66868d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02a6, code lost:
        if (r5.f131720t != 1) goto L_0x03f9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x04f7  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5961x(pj3.C47511g r21, com.tencent.p014mm.storage.C72996z1 r22, boolean r23, int r24) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r3 = r22
            r7 = r24
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r2 = r1.f115605d
            boolean r2 = r2.isFinishing()
            r9 = 1
            if (r2 == 0) goto L_0x0012
            return r9
        L_0x0012:
            r2 = 0
            if (r3 == 0) goto L_0x0017
            r4 = 1
            goto L_0x0018
        L_0x0017:
            r4 = 0
        L_0x0018:
            junit.framework.Assert.assertTrue(r4)
            r4 = 0
            if (r3 == 0) goto L_0x0023
            java.lang.String r5 = r22.getUsername()
            goto L_0x0024
        L_0x0023:
            r5 = r4
        L_0x0024:
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            java.lang.String r6 = "nullAsNil(contact?.username)"
            gy3.C87412m.m108593f(r5, r6)
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x0036
            r5 = 1
            goto L_0x0037
        L_0x0036:
            r5 = 0
        L_0x0037:
            junit.framework.Assert.assertTrue(r5)
            if (r0 == 0) goto L_0x003e
            r5 = 1
            goto L_0x003f
        L_0x003e:
            r5 = 0
        L_0x003f:
            junit.framework.Assert.assertTrue(r5)
            monitor-enter(r20)
            if (r3 == 0) goto L_0x00b5
            boolean r5 = r1.f115618t     // Catch:{ all -> 0x00b2 }
            if (r5 == 0) goto L_0x004a
            goto L_0x00b5
        L_0x004a:
            r1.f115618t = r9     // Catch:{ all -> 0x00b2 }
            java.lang.String r5 = "ProfileCrashCheck"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r5)     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = r1.f115619u     // Catch:{ all -> 0x00b2 }
            boolean r6 = r5.decodeBool(r6, r2)     // Catch:{ all -> 0x00b2 }
            if (r6 == 0) goto L_0x007a
            java.lang.String r6 = "MicroMsg.ContactWidgetTabBizInfo"
            java.lang.String r8 = "checkCrash clear data with crash flag"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)     // Catch:{ all -> 0x00b2 }
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x00b2 }
            r11 = 1378(0x562, double:6.81E-321)
            r13 = 0
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = r22.getUsername()     // Catch:{ all -> 0x00b2 }
            java.lang.String r8 = "contact.username"
            gy3.C87412m.m108593f(r6, r8)     // Catch:{ all -> 0x00b2 }
            hf2.C46051m.m51352a(r6)     // Catch:{ all -> 0x00b2 }
        L_0x007a:
            java.lang.String r6 = r1.f115619u     // Catch:{ all -> 0x00b2 }
            r5.encode((java.lang.String) r6, (boolean) r9)     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = "MicroMsg.ContactWidgetTabBizInfo"
            java.lang.String r8 = "checkCrash add crash flag"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)     // Catch:{ all -> 0x00b2 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ all -> 0x00b2 }
            if (r6 != 0) goto L_0x0094
            boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED     // Catch:{ all -> 0x00b2 }
            if (r6 != 0) goto L_0x0094
            boolean r6 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()     // Catch:{ all -> 0x00b2 }
            if (r6 == 0) goto L_0x00a2
        L_0x0094:
            java.lang.String r6 = "testCrash"
            int r6 = r5.decodeInt(r6, r2)     // Catch:{ all -> 0x00b2 }
            if (r6 != r9) goto L_0x00a2
            java.lang.String r6 = "checkCrash testCrash"
            junit.framework.Assert.assertTrue(r6, r2)     // Catch:{ all -> 0x00b2 }
        L_0x00a2:
            zt3.t r6 = zt3.C119157j.f356862d     // Catch:{ all -> 0x00b2 }
            com.tencent.mm.plugin.profile.ui.tab.u r8 = new com.tencent.mm.plugin.profile.ui.tab.u     // Catch:{ all -> 0x00b2 }
            r8.<init>(r5, r1)     // Catch:{ all -> 0x00b2 }
            r10 = 1000(0x3e8, double:4.94E-321)
            zt3.j r6 = (zt3.C119157j) r6     // Catch:{ all -> 0x00b2 }
            r6.mo183878i(r8, r10)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r20)
            goto L_0x00b6
        L_0x00b2:
            r0 = move-exception
            monitor-exit(r20)
            throw r0
        L_0x00b5:
            monitor-exit(r20)
        L_0x00b6:
            java.util.List<qf2.a> r5 = r1.f115609h
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x00be:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00d0
            java.lang.Object r6 = r5.next()
            qf2.a r6 = (qf2.C47823a) r6
            r8 = r23
            r6.mo66899x(r0, r3, r8, r7)
            goto L_0x00be
        L_0x00d0:
            r8 = r23
            r1.f115610i = r3
            r1.f115612n = r7
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r0 = r1.f115605d
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r5 = "add_more_friend_search_scene"
            r0.getIntExtra(r5, r2)
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r0 = r1.f115605d
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r5 = "key_channel_session_id"
            java.lang.String r0 = r0.getStringExtra(r5)
            if (r0 != 0) goto L_0x00f1
            java.lang.String r0 = ""
        L_0x00f1:
            r1.f115583B = r0
            java.lang.Class<ug.c0> r0 = p248ug.C52570c0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            ug.c0 r0 = (p248ug.C52570c0) r0
            boolean r0 = r0.mo58180ND()
            r5 = r0 ^ 1
            r1.f115616r = r5
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            int r6 = r1.f115612n
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r2] = r6
            boolean r6 = r1.f115616r
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5[r9] = r6
            r6 = 2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5[r6] = r0
            java.lang.String r0 = "MicroMsg.ContactWidgetTabBizInfo"
            java.lang.String r6 = "updateBizTeenModeStatus addContactScene: %d, blockAddContact: %b, isBizTeenModeAllowAll: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r6, r5)
            com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController r0 = r1.f115620v
            if (r0 == 0) goto L_0x012d
            boolean r5 = r1.f115616r
            r0.f115570x = r5
        L_0x012d:
            boolean r0 = r1.f115617s
            if (r0 == 0) goto L_0x050b
            r1.f115617s = r2
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r0 = r1.f115605d
            r5 = 2131309317(0x7f093305, float:1.8236914E38)
            android.view.View r0 = r0.findViewById(r5)
            r5 = 8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            if (r0 == 0) goto L_0x0187
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r15.mo10233c(r6)
            java.lang.Object[] r11 = r15.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizInfo"
            java.lang.String r13 = "hideOriginContentView"
            java.lang.String r14 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r10 = r0
            r9 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r9 = r9.mo10231a(r2)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r0.setVisibility(r9)
            java.lang.String r11 = "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizInfo"
            java.lang.String r12 = "hideOriginContentView"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x0187:
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r0 = r1.f115605d
            android.widget.ListView r0 = r0.getListView()
            if (r0 == 0) goto L_0x0192
            r0.setVisibility(r5)
        L_0x0192:
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r0 = r1.f115605d
            r5 = 2131311224(0x7f093a78, float:1.8240782E38)
            android.view.View r0 = r0.findViewById(r5)
            if (r0 == 0) goto L_0x01d9
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            r5.mo10233c(r6)
            java.lang.Object[] r10 = r5.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizInfo"
            java.lang.String r12 = "hideOriginContentView"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r0
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r5 = r5.mo10231a(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r0.setVisibility(r5)
            java.lang.String r10 = "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizInfo"
            java.lang.String r11 = "hideOriginContentView"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x01d9:
            java.lang.String r0 = "test_biz_profile"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            java.lang.String r5 = "noCache"
            boolean r0 = r0.getBoolean(r5, r2)
            if (r0 == 0) goto L_0x01f1
            te3.ch r0 = new te3.ch
            r0.<init>()
            r1.f115613o = r0
            goto L_0x0201
        L_0x01f1:
            com.tencent.mm.storage.z1 r0 = r1.f115610i
            if (r0 == 0) goto L_0x0201
            java.lang.String r0 = r0.getUsername()
            if (r0 == 0) goto L_0x0201
            te3.ch r0 = hf2.C46051m.m51353b(r0)
            r1.f115613o = r0
        L_0x0201:
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r0 = r1.f115605d
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r5 = 2131493934(0x7f0c042e, float:1.8611362E38)
            android.view.View r0 = r0.inflate(r5, r4)
            java.lang.String r5 = "inflater.inflate(R.layou…ntact_info_biz_tab, null)"
            gy3.C87412m.m108593f(r0, r5)
            r1.f115590I = r0
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r5 = r1.f115605d
            r5.setContentView(r0)
            android.view.View r0 = r1.f115590I
            java.lang.String r5 = "contentView"
            if (r0 == 0) goto L_0x0507
            r6 = 2131299966(0x7f090e7e, float:1.8217948E38)
            android.view.View r0 = r0.findViewById(r6)
            java.lang.String r6 = "contentView.findViewById…(R.id.combo_content_view)"
            gy3.C87412m.m108593f(r0, r6)
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            r1.f115622x = r0
            android.view.View r0 = r1.f115590I
            if (r0 == 0) goto L_0x0503
            r6 = 2131297972(0x7f0906b4, float:1.8213904E38)
            android.view.View r0 = r0.findViewById(r6)
            java.lang.String r6 = "contentView.findViewById…_profile_menu_tab_layout)"
            gy3.C87412m.m108593f(r0, r6)
            com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout r0 = (com.tencent.p014mm.plugin.profile.p088ui.tab.view.BizProfileTabLayout) r0
            r1.f115624z = r0
            com.tencent.mm.plugin.profile.ui.tab.b0 r6 = new com.tencent.mm.plugin.profile.ui.tab.b0
            r6.<init>(r1)
            r0.setOnTabSelected(r6)
            com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout r0 = r1.f115624z
            java.lang.String r6 = "menuTabLayout"
            if (r0 == 0) goto L_0x04ff
            com.tencent.mm.plugin.profile.ui.tab.c0 r9 = new com.tencent.mm.plugin.profile.ui.tab.c0
            r9.<init>(r1)
            r0.setOnServiceTabSelected(r9)
            com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController r0 = new com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r9 = r1.f115605d
            android.view.View r10 = r1.f115590I
            if (r10 == 0) goto L_0x04fb
            com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo$e r5 = r1.f115589H
            r0.<init>(r9, r10, r5)
            com.tencent.mm.plugin.profile.ui.tab.d0 r5 = new com.tencent.mm.plugin.profile.ui.tab.d0
            r5.<init>(r1)
            r0.f115545H = r5
            r1.f115620v = r0
            boolean r5 = r1.f115616r
            r0.f115570x = r5
            gy3.f0 r0 = new gy3.f0
            r0.<init>()
            te3.ch r5 = r1.f115613o
            if (r5 == 0) goto L_0x03f9
            rx3.g r9 = r1.f115587F
            rx3.n r9 = (rx3.C36570n) r9
            java.lang.Object r9 = r9.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r10 = 1
            if (r9 != r10) goto L_0x02aa
            te3.ig r9 = r5.f131711h
            if (r9 == 0) goto L_0x02a0
            java.util.LinkedList<te3.hg> r9 = r9.f135306d
            if (r9 == 0) goto L_0x02a0
            boolean r9 = r9.isEmpty()
            if (r9 != r10) goto L_0x02a0
            r19 = 1
            goto L_0x02a2
        L_0x02a0:
            r19 = 0
        L_0x02a2:
            if (r19 == 0) goto L_0x02aa
            int r9 = r5.f131720t
            if (r9 == r10) goto L_0x02aa
            goto L_0x03f9
        L_0x02aa:
            te3.ig r9 = r5.f131709f
            if (r9 == 0) goto L_0x02bb
            java.util.LinkedList<te3.hg> r9 = r9.f135306d
            if (r9 == 0) goto L_0x02bb
            boolean r9 = r9.isEmpty()
            r9 = r9 ^ r10
            if (r9 != r10) goto L_0x02bb
            r9 = 1
            goto L_0x02bc
        L_0x02bb:
            r9 = 0
        L_0x02bc:
            java.lang.String r10 = "contact!!.username"
            java.lang.String r11 = "contact"
            if (r9 == 0) goto L_0x0306
            java.util.List<androidx.fragment.app.Fragment> r9 = r1.f115621w
            com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment r12 = new com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment
            r12.<init>()
            boolean r13 = r20.mo66842e()
            r12.f115702o = r13
            te3.ch r13 = r1.f115613o
            if (r13 != 0) goto L_0x02d8
            te3.ch r13 = new te3.ch
            r13.<init>()
        L_0x02d8:
            r12.mo66879P(r13)
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            com.tencent.mm.storage.z1 r14 = r1.f115610i
            gy3.C87412m.m108591d(r14)
            java.lang.String r14 = r14.getUsername()
            gy3.C87412m.m108593f(r14, r10)
            g02.C32291d.m39671d(r13, r11, r14)
            r12.setArguments(r13)
            com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher r13 = r20.mo66840c()
            r12.mo66880Q(r13)
            long r13 = r1.f115608g
            r12.f115701n = r13
            com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController r13 = r1.f115620v
            r12.f115693g = r13
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r9.add(r12)
        L_0x0306:
            te3.ig r9 = r5.f131711h
            if (r9 == 0) goto L_0x0315
            java.util.LinkedList<te3.hg> r9 = r9.f135306d
            if (r9 == 0) goto L_0x0315
            boolean r9 = r9.isEmpty()
            r12 = 1
            r9 = r9 ^ r12
            goto L_0x0316
        L_0x0315:
            r9 = 0
        L_0x0316:
            if (r9 == 0) goto L_0x031e
            int r9 = r5.f131720t
            if (r9 != 0) goto L_0x031e
            r9 = 1
            goto L_0x031f
        L_0x031e:
            r9 = 0
        L_0x031f:
            int r12 = r5.f131720t
            r13 = 1
            if (r12 != r13) goto L_0x0326
            r12 = 1
            goto L_0x0327
        L_0x0326:
            r12 = 0
        L_0x0327:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "init, VideoTabType is "
            r13.append(r14)
            int r5 = r5.f131720t
            r13.append(r5)
            java.lang.String r5 = r13.toString()
            java.lang.String r13 = "MicroMsg.ContactWidgetTabBizInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r5)
            if (r12 == 0) goto L_0x0398
            androidx.fragment.app.Fragment r5 = r1.f115593L
            if (r5 != 0) goto L_0x036e
            java.lang.Class<ht1.p4> r5 = ht1.C60193p4.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ht1.p4 r5 = (ht1.C60193p4) r5
            com.tencent.mm.storage.z1 r9 = r1.f115610i
            gy3.C87412m.m108591d(r9)
            java.lang.String r9 = r9.getUsername()
            rx3.g r10 = r1.f115592K
            rx3.n r10 = (rx3.C36570n) r10
            java.lang.Object r10 = r10.getValue()
            java.lang.Number r10 = (java.lang.Number) r10
            long r10 = r10.longValue()
            ht1.p4$a r5 = r5.mw0(r9, r10)
            androidx.fragment.app.Fragment r5 = r5.mo71558c()
            r1.f115593L = r5
        L_0x036e:
            androidx.fragment.app.Fragment r5 = r1.f115593L
            r0.f27484d = r5
            com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout r5 = r1.f115624z
            if (r5 == 0) goto L_0x0394
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r6 = r1.f115605d
            r9 = 2131830028(0x7f11250c, float:1.9293042E38)
            java.lang.String r6 = r6.getString(r9)
            java.lang.String r9 = "context.getString(com.te…dk.R.string.finder_title)"
            gy3.C87412m.m108593f(r6, r9)
            r5.setVideoTabText(r6)
            java.util.List<androidx.fragment.app.Fragment> r5 = r1.f115621w
            T r6 = r0.f27484d
            gy3.C87412m.m108591d(r6)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.add(r6)
            goto L_0x03fa
        L_0x0394:
            gy3.C87412m.m108603p(r6)
            throw r4
        L_0x0398:
            if (r9 == 0) goto L_0x03fa
            com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment r5 = new com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment
            r5.<init>()
            te3.ch r9 = r1.f115613o
            if (r9 != 0) goto L_0x03a8
            te3.ch r9 = new te3.ch
            r9.<init>()
        L_0x03a8:
            r5.mo66882O(r9)
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            com.tencent.mm.storage.z1 r13 = r1.f115610i
            gy3.C87412m.m108591d(r13)
            java.lang.String r13 = r13.getUsername()
            gy3.C87412m.m108593f(r13, r10)
            g02.C32291d.m39671d(r9, r11, r13)
            r5.setArguments(r9)
            com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher r9 = r20.mo66840c()
            r5.mo66883P(r9)
            long r9 = r1.f115608g
            r1.f115608g = r9
            com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController r9 = r1.f115620v
            r5.f115693g = r9
            r0.f27484d = r5
            com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout r5 = r1.f115624z
            if (r5 == 0) goto L_0x03f5
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r6 = r1.f115605d
            r9 = 2131822635(0x7f11082b, float:1.9278047E38)
            java.lang.String r6 = r6.getString(r9)
            java.lang.String r9 = "context.getString(R.stri…z_profile_tab_name_video)"
            gy3.C87412m.m108593f(r6, r9)
            r5.setVideoTabText(r6)
            java.util.List<androidx.fragment.app.Fragment> r5 = r1.f115621w
            T r6 = r0.f27484d
            gy3.C87412m.m108591d(r6)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.add(r6)
            goto L_0x03fa
        L_0x03f5:
            gy3.C87412m.m108603p(r6)
            throw r4
        L_0x03f9:
            r12 = 0
        L_0x03fa:
            com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo$a r5 = new com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo$a
            java.util.List<androidx.fragment.app.Fragment> r6 = r1.f115621w
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r9 = r1.f115605d
            androidx.fragment.app.FragmentManager r9 = r9.getSupportFragmentManager()
            r5.<init>(r6, r9)
            r1.f115623y = r5
            androidx.viewpager.widget.ViewPager r6 = r1.f115622x
            java.lang.String r9 = "viewPager"
            if (r6 == 0) goto L_0x04f7
            r6.setAdapter(r5)
            com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo$a r5 = r1.f115623y
            if (r5 == 0) goto L_0x04f0
            r5.notifyDataSetChanged()
            androidx.viewpager.widget.ViewPager r5 = r1.f115622x
            if (r5 == 0) goto L_0x04ec
            com.tencent.mm.plugin.profile.ui.tab.e0 r6 = new com.tencent.mm.plugin.profile.ui.tab.e0
            r6.<init>(r1, r0)
            r5.addOnPageChangeListener(r6)
            T r0 = r0.f27484d
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r1.mo66845h(r0, r12)
            r1.mo66846i(r2)
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r0 = r1.f115605d
            r0.getClass()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.profile.p088ui.DialogContactInfoUI
            if (r0 == 0) goto L_0x0445
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r0 = r1.f115605d
            androidx.appcompat.app.ActionBar r0 = r0.getSupportActionBar()
            if (r0 == 0) goto L_0x04b1
            r0.mo91104o()
            goto L_0x04b1
        L_0x0445:
            e3.d r0 = new e3.d
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r5 = r1.f115605d
            com.tencent.mm.plugin.profile.ui.tab.a0 r6 = new com.tencent.mm.plugin.profile.ui.tab.a0
            r6.<init>(r1)
            r0.<init>(r5, r6)
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r5 = r1.f115605d
            androidx.appcompat.app.ActionBar r5 = r5.getSupportActionBar()
            if (r5 == 0) goto L_0x0470
            android.view.View r5 = r5.mo91099j()
            if (r5 == 0) goto L_0x0470
            r6 = 2131296506(0x7f0900fa, float:1.821093E38)
            android.view.View r5 = r5.findViewById(r6)
            if (r5 == 0) goto L_0x0470
            com.tencent.mm.plugin.profile.ui.tab.y r6 = new com.tencent.mm.plugin.profile.ui.tab.y
            r6.<init>(r0)
            r5.setOnTouchListener(r6)
        L_0x0470:
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r0 = r1.f115605d
            r5 = 2131099800(0x7f060098, float:1.7811963E38)
            int r5 = p385u2.C111105a.m151500b(r0, r5)
            r0.setMMTitleColor(r5)
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r0 = r1.f115605d
            r0.setMMTitleVisibility(r2)
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r0 = r1.f115605d
            r0.setTitleDividerVis(r2)
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r0 = r1.f115605d
            r0.setIsDarkActionbarBg(r2)
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r0 = r1.f115605d
            android.content.res.Resources r5 = r0.getResources()
            r6 = 2131099650(0x7f060002, float:1.781166E38)
            int r5 = r5.getColor(r6)
            r0.setActionbarColor(r5)
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r0 = r1.f115605d
            r0.hideActionbarLine()
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r0 = r1.f115605d
            com.tencent.mm.plugin.profile.ui.tab.z r5 = new com.tencent.mm.plugin.profile.ui.tab.z
            r5.<init>(r1)
            r6 = 2131755023(0x7f10000f, float:1.9140914E38)
            r0.setBackBtn(r5, r6)
            r0 = 1
            r1.mo66844g(r0, r0)
        L_0x04b1:
            r20.mo66843f()
            if (r3 == 0) goto L_0x04c1
            rb0.a r0 = rb0.C48009v0.wx0()
            java.lang.String r5 = r22.getUsername()
            r0.mo72736c(r5, r4)
        L_0x04c1:
            com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher r0 = r20.mo66840c()
            androidx.lifecycle.z r0 = r0.mo66864c()
            com.tencent.mm.plugin.profile.ui.ContactInfoUI r4 = r1.f115605d
            com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo$f r5 = new com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo$f
            r5.<init>(r1)
            r0.observe(r4, r5)
            if (r3 == 0) goto L_0x04e4
            boolean r0 = r22.mo62927s3()
            if (r0 == 0) goto L_0x04e2
            int r0 = r22.mo62907i3()
            if (r0 <= 0) goto L_0x04e2
            r2 = 1
        L_0x04e2:
            r1.f115582A = r2
        L_0x04e4:
            com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher r0 = r20.mo66840c()
            r0.mo66863b()
            goto L_0x052b
        L_0x04ec:
            gy3.C87412m.m108603p(r9)
            throw r4
        L_0x04f0:
            java.lang.String r0 = "pagerAdapter"
            gy3.C87412m.m108603p(r0)
            throw r4
        L_0x04f7:
            gy3.C87412m.m108603p(r9)
            throw r4
        L_0x04fb:
            gy3.C87412m.m108603p(r5)
            throw r4
        L_0x04ff:
            gy3.C87412m.m108603p(r6)
            throw r4
        L_0x0503:
            gy3.C87412m.m108603p(r5)
            throw r4
        L_0x0507:
            gy3.C87412m.m108603p(r5)
            throw r4
        L_0x050b:
            if (r3 == 0) goto L_0x052b
            boolean r0 = r22.mo62927s3()
            if (r0 == 0) goto L_0x051a
            int r0 = r22.mo62907i3()
            if (r0 <= 0) goto L_0x051a
            r2 = 1
        L_0x051a:
            boolean r0 = r1.f115582A
            if (r0 == r2) goto L_0x0529
            com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher r0 = r20.mo66840c()
            r0.mo66863b()
            r0 = 1
            r1.mo66844g(r0, r0)
        L_0x0529:
            r1.f115582A = r2
        L_0x052b:
            com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController r2 = r1.f115620v
            if (r2 == 0) goto L_0x053e
            java.lang.String r4 = r1.f115606e
            ug.c r5 = r1.f115611j
            te3.ch r6 = r1.f115613o
            r3 = r22
            r7 = r24
            r8 = r23
            r2.mo66829g(r3, r4, r5, r6, r7, r8)
        L_0x053e:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.tab.ContactWidgetTabBizInfo.mo5961x(pj3.g, com.tencent.mm.storage.z1, boolean, int):boolean");
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        return true;
    }
}
