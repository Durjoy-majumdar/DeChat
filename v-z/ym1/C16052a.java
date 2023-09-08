package ym1;

import an1.C0094g;
import an1.C0095h;
import an1.C0102o;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import bn1.C0331b;
import c30.C104289g;
import cj1.C0576n4;
import cm1.C0740i2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C58708d1;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8809w2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import ls3.C10649f;
import ph1.C11940k;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C36907w;
import te3.C48817b71;
import te3.C49461fr0;
import te3.C49712hj1;
import te3.C50217l51;
import te3.C50355m51;
import te3.C51938x81;
import te3.C52294zq0;
import te3.C64279c90;
import te3.C64347eq2;
import te3.C64686ro2;
import te3.C64809wp2;
import xm1.C15828e;

/* renamed from: ym1.a */
public final class C16052a {

    /* renamed from: g */
    public static boolean f43158g;

    /* renamed from: a */
    public final C49712hj1 f43159a;

    /* renamed from: b */
    public final MMActivity f43160b;

    /* renamed from: c */
    public final Fragment f43161c;

    /* renamed from: d */
    public final int f43162d;

    /* renamed from: e */
    public final C15828e f43163e;

    /* renamed from: f */
    public int f43164f;

    /* renamed from: ym1.a$a */
    public static final class C16053a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C16052a f43165d;

        /* renamed from: e */
        public final /* synthetic */ int f43166e;

        /* renamed from: f */
        public final /* synthetic */ C0740i2 f43167f;

        /* renamed from: g */
        public final /* synthetic */ ArrayList<C0740i2> f43168g;

        /* renamed from: h */
        public final /* synthetic */ View f43169h;

        /* renamed from: i */
        public final /* synthetic */ String f43170i;

        /* renamed from: j */
        public final /* synthetic */ String f43171j;

        /* renamed from: n */
        public final /* synthetic */ int f43172n;

        /* renamed from: o */
        public final /* synthetic */ Bundle f43173o;

        /* renamed from: p */
        public final /* synthetic */ C0740i2 f43174p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16053a(C16052a aVar, int i, C0740i2 i2Var, ArrayList<C0740i2> arrayList, View view, String str, String str2, int i2, Bundle bundle, C0740i2 i2Var2) {
            super(0);
            this.f43165d = aVar;
            this.f43166e = i;
            this.f43167f = i2Var;
            this.f43168g = arrayList;
            this.f43169h = view;
            this.f43170i = str;
            this.f43171j = str2;
            this.f43172n = i2;
            this.f43173o = bundle;
            this.f43174p = i2Var2;
        }

        public Object invoke() {
            this.f43165d.mo14667b(this.f43166e, this.f43167f, this.f43168g, this.f43169h, this.f43170i, this.f43171j, true, this.f43172n, this.f43173o, this.f43174p);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ym1.a$b */
    public static final class C16054b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C16052a f43175d;

        /* renamed from: e */
        public final /* synthetic */ int f43176e;

        /* renamed from: f */
        public final /* synthetic */ C0740i2 f43177f;

        /* renamed from: g */
        public final /* synthetic */ ArrayList<C0740i2> f43178g;

        /* renamed from: h */
        public final /* synthetic */ View f43179h;

        /* renamed from: i */
        public final /* synthetic */ String f43180i;

        /* renamed from: j */
        public final /* synthetic */ String f43181j;

        /* renamed from: n */
        public final /* synthetic */ int f43182n;

        /* renamed from: o */
        public final /* synthetic */ Bundle f43183o;

        /* renamed from: p */
        public final /* synthetic */ C0740i2 f43184p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16054b(C16052a aVar, int i, C0740i2 i2Var, ArrayList<C0740i2> arrayList, View view, String str, String str2, int i2, Bundle bundle, C0740i2 i2Var2) {
            super(0);
            this.f43175d = aVar;
            this.f43176e = i;
            this.f43177f = i2Var;
            this.f43178g = arrayList;
            this.f43179h = view;
            this.f43180i = str;
            this.f43181j = str2;
            this.f43182n = i2;
            this.f43183o = bundle;
            this.f43184p = i2Var2;
        }

        public Object invoke() {
            this.f43175d.mo14667b(this.f43176e, this.f43177f, this.f43178g, this.f43179h, this.f43180i, this.f43181j, true, this.f43182n, this.f43183o, this.f43184p);
            return C13598b0.f38549a;
        }
    }

    public C16052a(C49712hj1 hj12, MMActivity mMActivity, Fragment fragment, int i, C15828e eVar) {
        C87412m.m108594g(hj12, "contextObj");
        C87412m.m108594g(mMActivity, "baseContext");
        this.f43159a = hj12;
        this.f43160b = mMActivity;
        this.f43161c = fragment;
        this.f43162d = i;
        this.f43163e = eVar;
        this.f43164f = -1;
    }

    /* renamed from: c */
    public static /* synthetic */ void m14951c(C16052a aVar, int i, C0740i2 i2Var, ArrayList arrayList, View view, String str, String str2, boolean z, int i2, Bundle bundle, C0740i2 i2Var2, int i3, Object obj) {
        int i4 = i3;
        aVar.mo14667b(i, i2Var, arrayList, view, str, str2, (i4 & 64) != 0 ? false : z, i2, (i4 & 256) != 0 ? null : bundle, (i4 & 512) != 0 ? null : i2Var2);
    }

    /* renamed from: f */
    public static /* synthetic */ void m14952f(C16052a aVar, C0740i2 i2Var, int i, int i2, View view, ArrayList arrayList, String str, RecyclerView recyclerView, int i3, Bundle bundle, C0740i2 i2Var2, int i4, Object obj) {
        int i5 = i4;
        aVar.mo14669e(i2Var, i, i2, view, arrayList, str, recyclerView, i3, (i5 & 256) != 0 ? null : bundle, (i5 & 512) != 0 ? null : i2Var2);
    }

    /* renamed from: a */
    public final String mo14666a(Bundle bundle) {
        C104289g gVar = new C104289g();
        try {
            Set<String> keySet = bundle.keySet();
            Iterator<String> it = keySet != null ? keySet.iterator() : null;
            if (it != null) {
                while (it.hasNext()) {
                    String next = it.next();
                    gVar.mo145967r(next, bundle.get(next));
                }
            }
        } catch (Exception e) {
            Log.m105928w("NewEntranceViewItemClick", "bundleToString err:" + e.getMessage());
        }
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "json.toString()");
        return gVar2;
    }

    /* renamed from: b */
    public final void mo14667b(int i, C0740i2 i2Var, ArrayList<C0740i2> arrayList, View view, String str, String str2, boolean z, int i2, Bundle bundle, C0740i2 i2Var2) {
        FinderItem o;
        String nickName;
        FinderItem o2;
        FinderItem o3;
        FinderItem o4;
        FinderItem o5;
        ArrayList arrayList2;
        long j;
        FinderItem o6;
        FinderItem o7;
        String nickName2;
        FinderItem o8;
        FinderItem o9;
        FinderItem o15;
        FinderItem o16;
        int i3 = i;
        C0740i2 i2Var3 = i2Var;
        View view2 = view;
        String str3 = str;
        String str4 = str2;
        boolean z2 = z;
        Bundle bundle2 = bundle;
        C0740i2 i2Var4 = i2Var2;
        Class<C10649f> cls = C10649f.class;
        Class cls2 = C8809w2.class;
        Intent intent = new Intent();
        if (i2Var3 instanceof C0102o) {
            C49461fr0 fr02 = new C49461fr0();
            C0102o oVar = (C0102o) i2Var3;
            fr02.f133643d = new LinkedList<>(oVar.f543h);
            C48817b71 b712 = oVar.f544i;
            fr02.f133644e = b712 != null ? b712.f130990d : null;
            intent.putExtra("FINDER_JUMP_INFO_WITH_OUTSIDE", fr02.toByteArray());
            C13598b0 b0Var = C13598b0.f38549a;
        }
        boolean z3 = i2Var3 instanceof C0331b;
        C0331b bVar = z3 ? (C0331b) i2Var3 : null;
        String str5 = "";
        boolean z4 = z3;
        Class<C10649f> cls3 = cls;
        boolean z5 = bVar != null && bVar.f903d.f130378e == 4;
        long j2 = 0;
        String str6 = "KEY_PARAMS_ENTRANCE_REPORT_INFO";
        if (i2 == 3) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(i2Var3);
            intent.putExtra("key_chnl_extra", mo14668d(i3, view2, "onItemClick"));
            boolean z6 = i2Var3 instanceof BaseFinderFeed;
            BaseFinderFeed baseFinderFeed = z6 ? (BaseFinderFeed) i2Var3 : null;
            if (baseFinderFeed == null || (o16 = baseFinderFeed.mo3513o()) == null) {
                arrayList2 = arrayList3;
                j = 0;
            } else {
                arrayList2 = arrayList3;
                j = o16.getId();
            }
            intent.putExtra("CURRENT_FEED_ID", j);
            intent.putExtra("LAUNCH_WITH_ANIM", z2);
            C50355m51 m512 = new C50355m51();
            C50217l51 l512 = new C50217l51();
            C52294zq0 zq02 = new C52294zq0();
            C8809w2 w2Var = (C8809w2) C39818r.f106831a.mo62444c(this.f43160b).mo62447c(cls2);
            BaseFinderFeed baseFinderFeed2 = z6 ? (BaseFinderFeed) i2Var3 : null;
            if (!(baseFinderFeed2 == null || (o15 = baseFinderFeed2.mo3513o()) == null)) {
                j2 = o15.getId();
            }
            C52294zq0 z0 = w2Var.mo9638z0(j2);
            zq02.f146179d = z0 != null ? z0.f146179d : null;
            C13598b0 b0Var2 = C13598b0.f38549a;
            l512.f137181d = zq02;
            m512.f137842d = l512;
            BaseFinderFeed baseFinderFeed3 = z6 ? (BaseFinderFeed) i2Var3 : null;
            m512.f137843e = (baseFinderFeed3 == null || (o9 = baseFinderFeed3.mo3513o()) == null) ? null : o9.getDescription();
            BaseFinderFeed baseFinderFeed4 = z6 ? (BaseFinderFeed) i2Var3 : null;
            m512.f137844f = (baseFinderFeed4 == null || (o8 = baseFinderFeed4.mo3513o()) == null) ? null : o8.getLocation();
            intent.putExtra("PRE_JOIN_LIVE_INFO", m512.toByteArray());
            if (z6) {
                intent.putExtra("CURRENT_FEED_ID", ((BaseFinderFeed) i2Var3).mo3513o().getId());
            }
            intent.putExtra("KEY_PARAMS_NOT_KEEP_CUR_LIVE", true);
            if (bundle2 != null) {
                intent.putExtra(str6, bundle2);
                intent.putExtra("key_chnl_extra", mo14666a(bundle2));
            }
            C13604l<List<FinderObject>, Integer> c = C58708d1.f168058a.mo83619c(arrayList2, i2Var3);
            List list = (List) c.f38555d;
            int intValue = ((Number) c.f38556e).intValue();
            C64279c90 c902 = new C64279c90();
            c902.f182444d = str;
            c902.f182445e = str2;
            c902.f182446f = false;
            c902.f182447g = -1;
            c902.f182448h = -1;
            c902.f182449i = 1;
            C64347eq2 eq22 = new C64347eq2();
            eq22.f183024o = z5;
            c902.f182451n = eq22;
            C64686ro2 ro22 = new C64686ro2();
            ro22.f185214e = this.f43159a.f134675i;
            boolean z7 = i2Var3 instanceof BaseFinderFeed;
            BaseFinderFeed baseFinderFeed5 = z7 ? (BaseFinderFeed) i2Var3 : null;
            ro22.f185215f = (baseFinderFeed5 == null || (o7 = baseFinderFeed5.mo3513o()) == null || (nickName2 = o7.getNickName()) == null) ? str5 : nickName2;
            BaseFinderFeed baseFinderFeed6 = z7 ? (BaseFinderFeed) i2Var3 : null;
            ro22.f185218i = (baseFinderFeed6 == null || (o6 = baseFinderFeed6.mo3513o()) == null) ? null : o6.getFeedObject();
            c902.f182450j = ro22;
            mo14670g(view, intent);
            ((C10649f) C86312j.m106911c(cls3)).mo10913cP(this.f43160b, intent, list, intValue, c902, (C10649f.C10650a) null);
        } else {
            View view3 = view2;
            String str7 = "key_chnl_extra";
            boolean z8 = z5;
            String str8 = str6;
            String str9 = str;
            intent.putExtra(str7, mo14668d(i3, view3, "onItemClick"));
            intent.putExtra("LAUNCH_WITH_ANIM", z2);
            boolean z9 = i2Var3 instanceof BaseFinderFeed;
            if (z9) {
                intent.putExtra("CURRENT_FEED_ID", ((BaseFinderFeed) i2Var3).mo3513o().getId());
            }
            if (bundle2 != null) {
                intent.putExtra(str8, bundle2);
                intent.putExtra(str7, mo14666a(bundle2));
            }
            C50355m51 m513 = new C50355m51();
            C50217l51 l513 = new C50217l51();
            C52294zq0 zq03 = new C52294zq0();
            C8809w2 w2Var2 = (C8809w2) C39818r.f106831a.mo62444c(this.f43160b).mo62447c(cls2);
            BaseFinderFeed baseFinderFeed7 = z9 ? (BaseFinderFeed) i2Var3 : null;
            C52294zq0 z05 = w2Var2.mo9638z0((baseFinderFeed7 == null || (o5 = baseFinderFeed7.mo3513o()) == null) ? 0 : o5.getId());
            zq03.f146179d = z05 != null ? z05.f146179d : null;
            C13598b0 b0Var3 = C13598b0.f38549a;
            l513.f137181d = zq03;
            m513.f137842d = l513;
            BaseFinderFeed baseFinderFeed8 = z9 ? (BaseFinderFeed) i2Var3 : null;
            m513.f137843e = (baseFinderFeed8 == null || (o4 = baseFinderFeed8.mo3513o()) == null) ? null : o4.getDescription();
            BaseFinderFeed baseFinderFeed9 = z9 ? (BaseFinderFeed) i2Var3 : null;
            m513.f137844f = (baseFinderFeed9 == null || (o3 = baseFinderFeed9.mo3513o()) == null) ? null : o3.getLocation();
            intent.putExtra("PRE_JOIN_LIVE_INFO", m513.toByteArray());
            intent.putExtra("KEY_PARAMS_NOT_KEEP_CUR_LIVE", true);
            C51938x81 x812 = new C51938x81();
            for (C0740i2 i2Var5 : arrayList) {
                if (i2Var5 instanceof C0331b) {
                    C0331b bVar2 = (C0331b) i2Var5;
                    if (bVar2.mo3513o().field_id != 0) {
                        x812.f144517d.add(Long.valueOf(bVar2.mo3513o().field_id));
                    }
                }
            }
            C0740i2 i2Var6 = i2Var2;
            boolean z15 = i2Var6 instanceof C0095h;
            if (z15) {
                LinkedList<Long> linkedList = x812.f144517d;
                ArrayList<C0740i2> arrayList4 = ((C0095h) i2Var6).f533e;
                ArrayList arrayList5 = new ArrayList(C36907w.m41090l(arrayList4, 10));
                Iterator<C0740i2> it = arrayList4.iterator();
                while (it.hasNext()) {
                    C0740i2 next = it.next();
                    C0094g gVar = next instanceof C0094g ? (C0094g) next : null;
                    arrayList5.add((gVar == null || (o2 = gVar.mo3513o()) == null) ? null : Long.valueOf(o2.field_id));
                }
                linkedList.addAll(arrayList5);
            }
            x812.f144519f = z4 ? ((C0331b) i2Var3).f903d.f130384n : z15 ? ((C0095h) i2Var6).f532d.f130384n : null;
            C15828e eVar = this.f43163e;
            x812.f144518e = eVar != null ? eVar.mo3566b() : null;
            if (!x812.f144517d.isEmpty()) {
                intent.putExtra("KEY_ENTER_LIVE_PARAM_SQUARE_EXTRA_INFO", x812.toByteArray());
            }
            C13604l<List<FinderObject>, Integer> c2 = C58708d1.f168058a.mo83619c(arrayList, i2Var3);
            List list2 = (List) c2.f38555d;
            int intValue2 = ((Number) c2.f38556e).intValue();
            Context context = view.getContext();
            C87412m.m108593f(context, "view.context");
            if (((C13442s8) C39818r.f106831a.mo62443b(context).mo75002a(C13442s8.class)).f38096i == 182) {
                for (int i4 = 0; i4 < intValue2; i4++) {
                    ArrayList arrayList6 = list2 instanceof ArrayList ? (ArrayList) list2 : null;
                    if (arrayList6 != null) {
                        FinderObject finderObject = (FinderObject) arrayList6.remove(0);
                    }
                }
                intValue2 = 0;
            }
            C64279c90 c903 = new C64279c90();
            c903.f182444d = str9;
            c903.f182445e = str2;
            c903.f182446f = false;
            c903.f182447g = 1001;
            c903.f182448h = -1;
            c903.f182449i = 1;
            C64347eq2 eq23 = new C64347eq2();
            eq23.f183024o = z8;
            C13598b0 b0Var4 = C13598b0.f38549a;
            c903.f182451n = eq23;
            C64686ro2 ro23 = new C64686ro2();
            ro23.f185214e = this.f43159a.f134675i;
            BaseFinderFeed baseFinderFeed10 = i2Var3 instanceof BaseFinderFeed ? (BaseFinderFeed) i2Var3 : null;
            ro23.f185215f = (baseFinderFeed10 == null || (o = baseFinderFeed10.mo3513o()) == null || (nickName = o.getNickName()) == null) ? str5 : nickName;
            c903.f182450j = ro23;
            mo14670g(view3, intent);
            ((C10649f) C86312j.m106911c(cls3)).mo10913cP(this.f43160b, intent, list2, intValue2, c903, (C10649f.C10650a) null);
        }
        C11940k.f34875a.mo12481a("startActivity");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009a, code lost:
        if ((r11 <= r10 && r10 < -1) != false) goto L_0x0091;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f7  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo14668d(int r10, android.view.View r11, java.lang.String r12) {
        /*
            r9 = this;
            java.lang.Class<fm1.e> r0 = fm1.C8138e.class
            java.lang.String r1 = "invokeSource"
            gy3.C87412m.m108594g(r12, r1)
            c30.g r1 = new c30.g
            r1.<init>()
            te3.hj1 r2 = r9.f43159a
            int r2 = r2.f134675i
            r3 = 9500001(0x90f561, float:1.3312337E-38)
            r4 = 1
            r5 = 0
            if (r2 == r3) goto L_0x0029
            r3 = 9500002(0x90f562, float:1.3312338E-38)
            if (r2 == r3) goto L_0x0029
            r3 = 9500004(0x90f564, float:1.3312341E-38)
            if (r2 == r3) goto L_0x0029
            r3 = 9500003(0x90f563, float:1.331234E-38)
            if (r2 != r3) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r2 = 0
            goto L_0x002a
        L_0x0029:
            r2 = 1
        L_0x002a:
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x0113
            java.lang.String r2 = "onExpose"
            boolean r2 = gy3.C87412m.m108589b(r12, r2)
            java.lang.String r6 = "{if_enhanced:1}"
            java.lang.String r7 = "card_style"
            if (r2 == 0) goto L_0x0057
            if (r11 == 0) goto L_0x0085
            r12 = 2131310054(0x7f0935e6, float:1.823841E38)
            java.lang.Object r2 = r11.getTag(r12)
            if (r2 == 0) goto L_0x0085
            boolean r8 = r2 instanceof java.lang.String
            if (r8 == 0) goto L_0x0085
            boolean r2 = gy3.C87412m.m108589b(r2, r3)
            if (r2 != 0) goto L_0x0085
            r1.put(r7, r6)
            r11.setTag(r12, r3)
            goto L_0x0085
        L_0x0057:
            java.lang.String r2 = "onItemClick"
            boolean r12 = gy3.C87412m.m108589b(r12, r2)
            if (r12 == 0) goto L_0x0085
            if (r11 == 0) goto L_0x0085
            r12 = 2131310052(0x7f0935e4, float:1.8238405E38)
            java.lang.Object r2 = r11.getTag(r12)
            if (r2 == 0) goto L_0x0085
            boolean r8 = r2 instanceof java.lang.String
            if (r8 == 0) goto L_0x0085
            boolean r8 = gy3.C87412m.m108589b(r2, r3)
            if (r8 != 0) goto L_0x0085
            r1.put(r7, r6)
            java.lang.String r6 = "click_timing"
            r1.put(r6, r2)
            r11.setTag(r12, r3)
            r12 = 2131310053(0x7f0935e5, float:1.8238407E38)
            r11.setTag(r12, r3)
        L_0x0085:
            int r11 = r9.f43164f
            if (r11 > 0) goto L_0x008b
        L_0x0089:
            r11 = 0
            goto L_0x009d
        L_0x008b:
            if (r10 >= r11) goto L_0x008e
            goto L_0x0089
        L_0x008e:
            r12 = -1
            if (r10 < r11) goto L_0x0093
        L_0x0091:
            r11 = 1
            goto L_0x009d
        L_0x0093:
            if (r11 > r10) goto L_0x0099
            if (r10 >= r12) goto L_0x0099
            r11 = 1
            goto L_0x009a
        L_0x0099:
            r11 = 0
        L_0x009a:
            if (r11 == 0) goto L_0x0089
            goto L_0x0091
        L_0x009d:
            java.lang.String r12 = "my_follow_fold"
            if (r11 == 0) goto L_0x00a5
            r1.mo145953n(r12, r4)
            goto L_0x00a8
        L_0x00a5:
            r1.mo145953n(r12, r5)
        L_0x00a8:
            bl3.r r11 = bl3.C39818r.f106831a
            com.tencent.mm.ui.MMActivity r12 = r9.f43160b
            bl3.r$a r12 = r11.mo62444c(r12)
            androidx.lifecycle.i0 r12 = r12.mo75002a(r0)
            fm1.e r12 = (fm1.C8138e) r12
            te3.nn1 r12 = r12.f27000g
            com.tencent.mm.ui.MMActivity r2 = r9.f43160b
            bl3.r$a r11 = r11.mo62444c(r2)
            androidx.lifecycle.i0 r11 = r11.mo75002a(r0)
            fm1.e r11 = (fm1.C8138e) r11
            com.tencent.mm.plugin.finder.extension.reddot.s0 r11 = r11.f27001h
            if (r11 == 0) goto L_0x011e
            if (r12 == 0) goto L_0x011e
            com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo r0 = r11.mo77309p2()
            org.json.JSONObject r2 = o40.C61937h.m72709h(r0)
            te3.xi1 r4 = r11.field_ctrInfo
            int r4 = r4.f144670e
            long r6 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            java.lang.String r6 = "reddotctrltype"
            r1.mo145967r(r6, r4)
            java.lang.String r4 = r11.field_tipsId
            java.lang.String r6 = "reddottipsid"
            r1.mo145967r(r6, r4)
            java.lang.String r12 = r12.f184507i
            java.lang.String r4 = "reddotshowinfopath"
            r1.mo145967r(r4, r12)
            java.lang.String r12 = "report_ext_info"
            java.lang.Object r12 = r2.opt(r12)
            if (r12 != 0) goto L_0x00f7
            goto L_0x00f8
        L_0x00f7:
            r3 = r12
        L_0x00f8:
            java.lang.String r12 = "reddotshowinfoext"
            r1.mo145967r(r12, r3)
            long r2 = r0.object_id
            java.lang.String r12 = o40.C61926c.m72691p(r2)
            java.lang.String r0 = "feedid"
            r1.mo145967r(r0, r12)
            te3.yi1 r11 = r11.f158585F
            java.lang.String r11 = r11.f186560u
            java.lang.String r12 = "username"
            r1.mo145967r(r12, r11)
            goto L_0x011e
        L_0x0113:
            java.lang.String r11 = "tag"
            r1.put(r11, r3)
            rm1.a r11 = rm1.C13087a.f37254a
            r11.mo12583d(r1)
        L_0x011e:
            int r11 = r9.f43162d
            r12 = 15
            if (r11 != r12) goto L_0x0128
            java.lang.String r11 = "temp_32"
            goto L_0x0130
        L_0x0128:
            te3.hj1 r11 = r9.f43159a
            int r11 = r11.f134675i
            java.lang.String r11 = java.lang.String.valueOf(r11)
        L_0x0130:
            java.lang.String r12 = "enter_immerse_type"
            r1.put(r12, r11)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r11 = "square_index"
            r1.put(r11, r10)
            java.lang.String r10 = r1.toString()
            java.lang.String r11 = "chnlExtra.toString()"
            gy3.C87412m.m108593f(r10, r11)
            java.lang.String r11 = ","
            java.lang.String r12 = ";"
            java.lang.String r10 = z04.C112551y.m153814n(r10, r11, r12, r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ym1.C16052a.mo14668d(int, android.view.View, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0048, code lost:
        r3 = r3.f38098n;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14669e(cm1.C0740i2 r33, int r34, int r35, android.view.View r36, java.util.ArrayList<cm1.C0740i2> r37, java.lang.String r38, androidx.recyclerview.widget.RecyclerView r39, int r40, android.os.Bundle r41, cm1.C0740i2 r42) {
        /*
            r32 = this;
            r13 = r32
            r14 = r33
            r0 = r34
            r15 = r36
            r12 = r38
            lt1.a r1 = lt1.C61401a.LIVE_SQUARE
            java.lang.Class<ir.n> r2 = p565ir.C60606n.class
            java.lang.String r3 = "feed"
            gy3.C87412m.m108594g(r14, r3)
            java.lang.String r3 = "view"
            gy3.C87412m.m108594g(r15, r3)
            java.lang.String r3 = "data"
            r11 = r37
            gy3.C87412m.m108594g(r11, r3)
            java.lang.String r3 = "clickTabContextId"
            gy3.C87412m.m108594g(r12, r3)
            java.lang.String r3 = "recyclerView"
            r4 = r39
            gy3.C87412m.m108594g(r4, r3)
            bl3.r r3 = bl3.C39818r.f106831a
            android.content.Context r4 = r36.getContext()
            java.lang.String r5 = "view.context"
            gy3.C87412m.m108593f(r4, r5)
            bl3.r$a r3 = r3.mo62443b(r4)
            java.lang.Class<rs1.s8> r4 = rs1.C13442s8.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r4)
            rs1.s8 r3 = (rs1.C13442s8) r3
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0050
            java.lang.String r3 = r3.f38098n
            if (r3 != 0) goto L_0x004d
            goto L_0x0050
        L_0x004d:
            r16 = r3
            goto L_0x0052
        L_0x0050:
            r16 = r4
        L_0x0052:
            er1.j4 r3 = er1.C58739j4.f168176a
            boolean r5 = r3.mo83683L()
            java.lang.String r6 = " feed:"
            java.lang.String r7 = "onItemClick pos:"
            java.lang.String r9 = "NewEntranceViewItemClick"
            if (r5 != 0) goto L_0x0489
            com.tencent.mm.ui.MMActivity r5 = r13.f43160b
            boolean r5 = r5.isPaused()
            if (r5 == 0) goto L_0x006a
            goto L_0x0489
        L_0x006a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r0)
            r5.append(r6)
            r5.append(r14)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            boolean r0 = r14 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r0 == 0) goto L_0x0410
            r5 = r14
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
            boolean r3 = r3.mo83686O(r5)
            if (r3 == 0) goto L_0x0410
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r5.mo3513o()
            hm1.a r6 = hm1.C32946a.f89535a
            ym1.c r7 = new ym1.c
            r7.<init>(r3)
            r6.mo58884a(r7)
            r10 = 0
            if (r0 == 0) goto L_0x00a2
            r0 = r5
            goto L_0x00a3
        L_0x00a2:
            r0 = r10
        L_0x00a3:
            if (r0 == 0) goto L_0x00b0
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
            if (r0 == 0) goto L_0x00b0
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            goto L_0x00b1
        L_0x00b0:
            r0 = r10
        L_0x00b1:
            if (r0 == 0) goto L_0x00e6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "handleClick rewrite commentScene:"
            r3.append(r6)
            te3.hj1 r6 = r13.f43159a
            int r6 = r6.f134675i
            r3.append(r6)
            java.lang.String r6 = ", sessionBuffer:"
            r3.append(r6)
            java.lang.String r6 = r0.sessionBuffer
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.String r6 = "Finder.FeedFullLiveConvert"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            java.lang.Class<dp1.y0> r3 = dp1.C58417y0.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            dp1.y0 r3 = (dp1.C58417y0) r3
            te3.hj1 r6 = r13.f43159a
            int r6 = r6.f134675i
            r3.j80(r0, r6)
        L_0x00e6:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r5.mo3513o()
            java.lang.String r0 = r0.getUserName()
            zc1.b r3 = zc1.C66785b.f191882e
            java.lang.String r3 = r3.mo90662O5()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r3)
            if (r0 == 0) goto L_0x014a
            java.lang.Class<er1.b> r0 = er1.C58684b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r1 = "getService(ActivityRouter::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            r15 = r0
            tf0.o1 r15 = (tf0.C13883o1) r15
            com.tencent.mm.ui.MMActivity r0 = r13.f43160b
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r5.mo3513o()
            long r17 = r1.getId()
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r5.mo3513o()
            java.lang.String r19 = r1.getObjectNonceId()
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r5.mo3513o()
            te3.c21 r1 = r1.getLiveInfo()
            if (r1 != 0) goto L_0x0129
            te3.c21 r1 = new te3.c21
            r1.<init>()
        L_0x0129:
            r20 = r1
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            java.lang.String r27 = r5.mo3526z()
            r28 = 0
            r29 = 0
            r30 = 7152(0x1bf0, float:1.0022E-41)
            r31 = 0
            r16 = r0
            tf0.C13883o1.C13884a.m13249a(r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x03f4
        L_0x014a:
            ph1.b r0 = ph1.C11937b.f34871a
            boolean r0 = r0.mo11812b(r14)
            if (r0 == 0) goto L_0x03d9
            com.tencent.mm.ui.MMActivity r0 = r13.f43160b
            r3 = 0
            boolean r0 = p182kk.C61104a.m71657m(r0, r3, r10)
            if (r0 != 0) goto L_0x03d9
            cj1.k2 r0 = cj1.C54781k2.f153552a
            boolean r0 = r0.mo75682c()
            if (r0 == 0) goto L_0x03d9
            java.lang.String r0 = "nearby-live-preview-view-tag"
            android.view.View r0 = r15.findViewWithTag(r0)
            r8 = r0
            com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r8 = (com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView) r8
            r0 = 2131315201(0x7f094a01, float:1.8248849E38)
            android.view.View r6 = r15.findViewById(r0)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r5.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            te3.c21 r0 = r0.liveInfo
            if (r0 == 0) goto L_0x0183
            long r10 = r0.f182367M
            int r0 = (int) r10
            goto L_0x0184
        L_0x0183:
            r0 = 0
        L_0x0184:
            r7 = 256(0x100, float:3.59E-43)
            boolean r0 = o40.C61926c.m72696u(r0, r7)
            r7 = 1
            if (r8 == 0) goto L_0x0195
            boolean r10 = r8.isPlaying()
            if (r10 == 0) goto L_0x0195
            r10 = 1
            goto L_0x0196
        L_0x0195:
            r10 = 0
        L_0x0196:
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r5.mo3513o()
            te3.c21 r11 = r11.getLiveInfo()
            if (r11 == 0) goto L_0x01a6
            int r11 = r11.f182394f
            if (r11 != r7) goto L_0x01a6
            r11 = 1
            goto L_0x01a7
        L_0x01a6:
            r11 = 0
        L_0x01a7:
            if (r8 == 0) goto L_0x01af
            boolean r3 = r8.f160237u
            if (r3 == 0) goto L_0x01af
            r3 = 1
            goto L_0x01b0
        L_0x01af:
            r3 = 0
        L_0x01b0:
            if (r8 == 0) goto L_0x01c3
            gr1.o0 r17 = r8.getRenderView()
            if (r17 == 0) goto L_0x01c3
            android.view.TextureView r17 = r17.getVideoView()
            if (r17 == 0) goto L_0x01c3
            android.graphics.SurfaceTexture r17 = r17.getSurfaceTexture()
            goto L_0x01c5
        L_0x01c3:
            r17 = 0
        L_0x01c5:
            if (r17 == 0) goto L_0x01c8
            goto L_0x01c9
        L_0x01c8:
            r7 = 0
        L_0x01c9:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r18 = r4
            java.lang.String r4 = "startSwitchOutFromSquare animation for feed:"
            r12.append(r4)
            long r19 = r33.getItemId()
            java.lang.String r4 = o40.C61926c.m72691p(r19)
            r12.append(r4)
            java.lang.String r4 = " liveStatusOpen:"
            r12.append(r4)
            r12.append(r11)
            java.lang.String r4 = " isPlaying:"
            r12.append(r4)
            r12.append(r10)
            java.lang.String r4 = " isAudioMode"
            r12.append(r4)
            r12.append(r0)
            java.lang.String r4 = " isFirstFrameRendered:"
            r12.append(r4)
            r12.append(r3)
            r19 = r4
            java.lang.String r4 = " isSurfaceTextureAvailable:"
            r12.append(r4)
            r12.append(r7)
            java.lang.String r4 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r4)
            java.lang.String r12 = " liveView:"
            if (r10 == 0) goto L_0x02ab
            if (r3 == 0) goto L_0x02ab
            if (r0 != 0) goto L_0x02ab
            if (r11 == 0) goto L_0x02ab
            if (r7 == 0) goto L_0x02ab
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "startSwitchOutFromSquare video animation for feed:"
            r0.append(r2)
            long r2 = r33.getItemId()
            java.lang.String r2 = o40.C61926c.m72691p(r2)
            r0.append(r2)
            r0.append(r12)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r5.mo3513o()
            long r2 = r0.getId()
            ph1.g r12 = new ph1.g
            int r5 = r8.getVideoWidth()
            int r6 = r8.getVideoHeight()
            float r7 = r8.getVideoRatioWH()
            f50.d r9 = r8.mo11322a()
            r10 = 0
            gr1.o0 r0 = r8.getRenderView()
            android.view.TextureView r11 = r0.getVideoView()
            java.lang.String r0 = "liveView.renderView.videoView"
            gy3.C87412m.m108593f(r11, r0)
            r17 = 0
            r18 = 0
            r0 = r12
            r4 = r36
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r17
            r14 = r12
            r12 = r18
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = 2131307699(0x7f092cb3, float:1.8233633E38)
            android.view.View r0 = r15.findViewById(r0)
            r14.f177080m = r0
            ph1.i r0 = ph1.C62293i.f177081a
            com.tencent.mm.ui.MMActivity r1 = r13.f43160b
            ph1.m r11 = r0.mo87363h(r1, r14)
            ym1.a$a r12 = new ym1.a$a
            r0 = r12
            r1 = r32
            r2 = r35
            r3 = r33
            r4 = r37
            r5 = r36
            r6 = r16
            r7 = r38
            r8 = r40
            r9 = r41
            r10 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.mo84323h(r12)
            goto L_0x03f4
        L_0x02ab:
            if (r11 == 0) goto L_0x0399
            if (r6 == 0) goto L_0x0399
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r5.mo3513o()
            long r3 = r0.getId()
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r5.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            te3.c21 r0 = r0.liveInfo
            if (r0 == 0) goto L_0x02ca
            int r0 = r0.f182384X
            r7 = 1
            if (r0 != r7) goto L_0x02ca
            r0 = 1
            goto L_0x02cb
        L_0x02ca:
            r0 = 0
        L_0x02cb:
            if (r0 == 0) goto L_0x02d0
            r0 = r18
            goto L_0x02e0
        L_0x02d0:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r5.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            te3.c21 r0 = r0.liveInfo
            if (r0 == 0) goto L_0x02df
            java.lang.String r0 = r0.f182395g
            goto L_0x02e0
        L_0x02df:
            r0 = 0
        L_0x02e0:
            ph1.d r10 = new ph1.d
            android.view.ViewParent r7 = r6.getParent()
            java.lang.String r11 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r7, r11)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            if (r0 != 0) goto L_0x02f0
            goto L_0x02f2
        L_0x02f0:
            r18 = r0
        L_0x02f2:
            di3.d r0 = di3.C86312j.m106911c(r2)
            ir.n r0 = (p565ir.C60606n) r0
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r5.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            te3.c21 r2 = r2.liveInfo
            boolean r0 = r0.mo85008I1(r2)
            r2 = 1
            r11 = r0 ^ 1
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r5.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            te3.c21 r0 = r0.liveInfo
            if (r0 == 0) goto L_0x032f
            te3.bq2 r0 = r0.f182358D
            if (r0 == 0) goto L_0x032c
            pe3.b r0 = r0.f182318j
            if (r0 == 0) goto L_0x032c
            te3.cq2 r2 = new te3.cq2
            r2.<init>()
            byte[] r0 = r0.mo123703f()
            r2.parseFrom(r0)
            te3.zp2 r0 = r2.f182556f
            goto L_0x032d
        L_0x032c:
            r0 = 0
        L_0x032d:
            r14 = r0
            goto L_0x0330
        L_0x032f:
            r14 = 0
        L_0x0330:
            r0 = r10
            r2 = r3
            r5 = r19
            r4 = r7
            r7 = r5
            r5 = r6
            r6 = r18
            r15 = r7
            r7 = r11
            r11 = r8
            r8 = r14
            r0.<init>(r1, r2, r4, r5, r6, r7, r8)
            ph1.i r0 = ph1.C62293i.f177081a
            com.tencent.mm.ui.MMActivity r1 = r13.f43160b
            ph1.m r14 = r0.mo87363h(r1, r10)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "startSwitchOutFromSquare image animation for feed:"
            r0.append(r1)
            long r1 = r33.getItemId()
            java.lang.String r1 = o40.C61926c.m72691p(r1)
            r0.append(r1)
            r0.append(r12)
            r0.append(r11)
            r0.append(r15)
            if (r11 == 0) goto L_0x0370
            boolean r1 = r11.f160237u
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            goto L_0x0371
        L_0x0370:
            r10 = 0
        L_0x0371:
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)
            ym1.a$b r11 = new ym1.a$b
            r0 = r11
            r1 = r32
            r2 = r35
            r3 = r33
            r4 = r37
            r5 = r36
            r6 = r16
            r7 = r38
            r8 = r40
            r9 = r41
            r10 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.mo84323h(r11)
            goto L_0x03f4
        L_0x0399:
            r11 = r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "startSwitchOutFromSquare no animation for feed:"
            r0.append(r1)
            long r1 = r33.getItemId()
            java.lang.String r1 = o40.C61926c.m72691p(r1)
            r0.append(r1)
            r0.append(r12)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)
            r7 = 0
            r11 = 64
            r12 = 0
            r0 = r32
            r1 = r35
            r2 = r33
            r3 = r37
            r4 = r36
            r5 = r16
            r6 = r38
            r8 = r40
            r9 = r41
            r10 = r42
            m14951c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x03f4
        L_0x03d9:
            r7 = 0
            r11 = 64
            r12 = 0
            r0 = r32
            r1 = r35
            r2 = r33
            r3 = r37
            r4 = r36
            r5 = r16
            r6 = r38
            r8 = r40
            r9 = r41
            r10 = r42
            m14951c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x03f4:
            java.lang.String r0 = "FinderLiveSquareTabLifeCycleReport"
            java.lang.String r1 = "enterLiveRoom"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.lang.String r0 = "page_live_flow"
            rm1.C13087a.f37257d = r0
            boolean r0 = f43158g
            if (r0 != 0) goto L_0x0488
            dp1.q r0 = dp1.C7450q.f25643a
            te3.hj1 r1 = r13.f43159a
            r2 = 18
            r3 = r33
            r0.mo8594b(r1, r3, r2)
            goto L_0x0488
        L_0x0410:
            r18 = r4
            r3 = r14
            boolean r0 = r3 instanceof kf1.C9833k9
            if (r0 == 0) goto L_0x0488
            r0 = r3
            kf1.k9 r0 = (kf1.C9833k9) r0
            int r0 = r0.f30391h
            r13.f43164f = r0
            com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct
            r0.<init>()
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.f9725d = r3
            r1 = r18
            r0.mo1017x(r1)
            java.lang.String r3 = "onItemClick"
            r4 = r35
            r5 = r36
            java.lang.String r3 = r13.mo14668d(r4, r5, r3)
            r0.mo1012s(r3)
            r0.mo1011E(r1)
            r0.mo1008B(r1)
            java.lang.Class<h81.i> r3 = h81.C59774i.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            h81.i r3 = (h81.C59774i) r3
            java.lang.String r3 = r3.mo84751Wb()
            if (r3 != 0) goto L_0x0450
            r3 = r1
        L_0x0450:
            r0.mo1019z(r3)
            te3.hj1 r3 = r13.f43159a
            java.lang.String r3 = r3.f134671e
            r0.mo1014u(r3)
            te3.hj1 r3 = r13.f43159a
            int r3 = r3.f134675i
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.mo1013t(r3)
            r3 = r38
            r0.mo1010D(r3)
            r0.mo1007A(r1)
            r0.mo1018y(r1)
            java.lang.String r3 = "all_my_follow"
            r0.mo1015v(r3)
            r0.mo1016w(r1)
            di3.d r1 = di3.C86312j.m106911c(r2)
            ir.n r1 = (p565ir.C60606n) r1
            java.lang.String r1 = r1.tx0()
            r0.mo1009C(r1)
            r0.mo86054n()
        L_0x0488:
            return
        L_0x0489:
            r3 = r14
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r0)
            r1.append(r6)
            r1.append(r3)
            java.lang.String r0 = " return for fastClick isPause: "
            r1.append(r0)
            com.tencent.mm.ui.MMActivity r0 = r13.f43160b
            boolean r0 = r0.isPaused()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ym1.C16052a.mo14669e(cm1.i2, int, int, android.view.View, java.util.ArrayList, java.lang.String, androidx.recyclerview.widget.RecyclerView, int, android.os.Bundle, cm1.i2):void");
    }

    /* renamed from: g */
    public final void mo14670g(View view, Intent intent) {
        C0576n4 n4Var = new C0576n4();
        C64809wp2 wp22 = new C64809wp2();
        Context context = view.getContext();
        C87412m.m108593f(context, "view.context");
        boolean z = !(((C13442s8) C39818r.f106831a.mo62443b(context).mo75002a(C13442s8.class)).f38096i == 182);
        wp22.f186152d = z;
        wp22.f186153e = true;
        wp22.f186154f = !z;
        n4Var.f1381a = wp22;
        C0576n4.f1379b.mo599b(intent, n4Var);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16052a(C49712hj1 hj12, MMActivity mMActivity, Fragment fragment, int i, C15828e eVar, int i2, C8480h hVar) {
        this(hj12, mMActivity, fragment, i, (i2 & 16) != 0 ? null : eVar);
    }
}
