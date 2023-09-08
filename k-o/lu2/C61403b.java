package lu2;

import a14.C0000n0;
import a14.C53930o0;
import a14.C53973z1;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import k20.C60958c;
import k20.C9556a;
import ks3.C61160f;
import l31.C61212e;
import ls3.C61397g;
import n31.C61612b;
import o40.C61926c;
import p565ir.C60606n;
import pl1.C11978e0;
import sx3.C26236u;
import t91.C64208c;
import te3.C48654a21;
import te3.C51576uo2;
import te3.C51713vn0;
import te3.C64273c21;
import te3.C64623p81;
import zp3.C23555k;

/* renamed from: lu2.b */
public class C61403b extends BaseTimeLineItem {

    /* renamed from: q */
    public final String f174623q = "FinderLiveTimeLineItem";

    /* renamed from: r */
    public C0000n0 f174624r = C53930o0.m60555b();

    /* renamed from: s */
    public C53973z1 f174625s;

    /* renamed from: lu2.b$a */
    public static final class C61404a extends BaseTimeLineItem.BaseViewHolder {

        /* renamed from: F0 */
        public boolean f174626F0;

        /* renamed from: G0 */
        public View f174627G0;

        /* renamed from: H0 */
        public String f174628H0 = "";

        /* renamed from: I0 */
        public ImageView f174629I0;

        /* renamed from: J0 */
        public View f174630J0;

        /* renamed from: K0 */
        public View f174631K0;

        /* renamed from: L0 */
        public ImageView f174632L0;

        /* renamed from: M0 */
        public TextView f174633M0;

        /* renamed from: N0 */
        public TextView f174634N0;

        /* renamed from: O0 */
        public View f174635O0;

        /* renamed from: P0 */
        public long f174636P0;

        /* renamed from: b */
        public String mo81017b() {
            SnsMethodCalculate.markStartTimeMs("getAccessibilityDesc", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            String string = this.f279960i.getContext().getString(C0966R.string.jeb);
            C87412m.m108593f(string, "convertView.context.getString(R.string.sns_live)");
            View view = this.f174631K0;
            if (view != null && view.getVisibility() == 0) {
                string = this.f279960i.getContext().getString(C0966R.string.jcg);
                C87412m.m108593f(string, "convertView.context.getS…ring.sns_finder_live_end)");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(65292);
            sb.append(string);
            sb.append(65292);
            String string2 = this.f279960i.getContext().getString(C0966R.string.jci);
            C87412m.m108593f(string2, "convertView.context.getS…(R.string.sns_finderlive)");
            String format = String.format(string2, Arrays.copyOf(new Object[]{this.f174628H0}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            sb.append(format);
            String sb4 = sb.toString();
            SnsMethodCalculate.markEndTimeMs("getAccessibilityDesc", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            return sb4;
        }

        /* renamed from: c */
        public final ImageView mo86344c() {
            SnsMethodCalculate.markStartTimeMs("getActivityInfoIcon", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            ImageView imageView = this.f174632L0;
            SnsMethodCalculate.markEndTimeMs("getActivityInfoIcon", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            return imageView;
        }

        /* renamed from: d */
        public final ImageView mo86345d() {
            SnsMethodCalculate.markStartTimeMs("getCoverIv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            ImageView imageView = this.f174629I0;
            SnsMethodCalculate.markEndTimeMs("getCoverIv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            return imageView;
        }

        /* renamed from: e */
        public final TextView mo86346e() {
            SnsMethodCalculate.markStartTimeMs("getFinderBansTv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            TextView textView = this.f174633M0;
            SnsMethodCalculate.markEndTimeMs("getFinderBansTv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            return textView;
        }

        /* renamed from: f */
        public final View mo86347f() {
            SnsMethodCalculate.markStartTimeMs("getFinderLiveEndTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            View view = this.f174631K0;
            SnsMethodCalculate.markEndTimeMs("getFinderLiveEndTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            return view;
        }

        /* renamed from: g */
        public final View mo86348g() {
            SnsMethodCalculate.markStartTimeMs("getFinderLiveTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            View view = this.f174630J0;
            SnsMethodCalculate.markEndTimeMs("getFinderLiveTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            return view;
        }

        /* renamed from: h */
        public final View mo86349h() {
            SnsMethodCalculate.markStartTimeMs("getFinderMediaRoot", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            View view = this.f174627G0;
            SnsMethodCalculate.markEndTimeMs("getFinderMediaRoot", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            return view;
        }

        /* renamed from: i */
        public final View mo86350i() {
            SnsMethodCalculate.markStartTimeMs("getFinderOlympicView", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            View view = this.f174635O0;
            SnsMethodCalculate.markEndTimeMs("getFinderOlympicView", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            return view;
        }

        /* renamed from: j */
        public final long mo86351j() {
            SnsMethodCalculate.markStartTimeMs("getLiveId", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            long j = this.f174636P0;
            SnsMethodCalculate.markEndTimeMs("getLiveId", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            return j;
        }

        /* renamed from: k */
        public final TextView mo86352k() {
            SnsMethodCalculate.markStartTimeMs("getReasonTv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            TextView textView = this.f174634N0;
            SnsMethodCalculate.markEndTimeMs("getReasonTv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            return textView;
        }
    }

    /* renamed from: lu2.b$b */
    public static final class C61405b implements C61612b {

        /* renamed from: a */
        public final /* synthetic */ C64623p81 f174637a;

        /* renamed from: b */
        public final /* synthetic */ C61403b f174638b;

        /* renamed from: c */
        public final /* synthetic */ View f174639c;

        /* renamed from: d */
        public final /* synthetic */ C61404a f174640d;

        public C61405b(C64623p81 p812, C61403b bVar, View view, C61404a aVar) {
            this.f174637a = p812;
            this.f174638b = bVar;
            this.f174639c = view;
            this.f174640d = aVar;
        }

        /* renamed from: a */
        public final void mo77120a(long j, String str, Map<String, Object> map) {
            Map<String, Object> map2 = map;
            SnsMethodCalculate.markStartTimeMs("onEventOccur", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$fillItem$4$1");
            int i = this.f174637a.f184791t == 1 ? 1 : 2;
            C64208c.C64209a aVar = C64208c.f181951a;
            C87412m.m108593f(str, "eventId");
            C87412m.m108593f(map2, "params");
            if (!aVar.mo89028c(j, str, map, i)) {
                C61403b bVar = this.f174638b;
                C64623p81 p812 = this.f174637a;
                C87412m.m108593f(p812, "finderShareObject");
                if (!bVar.mo86342E(p812, this.f174637a.f184761E) && !this.f174638b.mo86341D(this.f174637a.f184779e, this.f174639c, this.f174640d.mo86351j())) {
                    ((C61212e) C86312j.m106911c(C61212e.class)).mo86157Z5(j, str, aVar.mo89034i(map2, i), C26236u.m33719b(26236), false);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onEventOccur", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$fillItem$4$1");
        }
    }

    /* renamed from: lu2.b$c */
    public static final class C61406c extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ C64623p81 f174641a;

        /* renamed from: b */
        public final /* synthetic */ C61403b f174642b;

        /* renamed from: c */
        public final /* synthetic */ C61404a f174643c;

        public C61406c(C64623p81 p812, C61403b bVar, C61404a aVar) {
            this.f174641a = p812;
            this.f174642b = bVar;
            this.f174643c = aVar;
        }

        /* renamed from: a */
        public long mo52a(View view) {
            SnsMethodCalculate.markStartTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$fillItem$5");
            C87412m.m108594g(view, "view");
            long safeParseLong = Util.safeParseLong(this.f174641a.f184780f) + ((long) view.hashCode());
            SnsMethodCalculate.markEndTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$fillItem$5");
            return safeParseLong;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            Class cls = C61397g.class;
            SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$fillItem$5");
            C87412m.m108594g(view, "view");
            if (this.f174641a.f184791t == 1 && !z) {
                Log.m105924i(C61403b.m72079C(this.f174642b), "#bindActivityIcon onViewExposedListener false, cancel it");
                C61403b bVar = this.f174642b;
                SnsMethodCalculate.markStartTimeMs("access$getRefreshActivityIconJob$p", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
                C53973z1 z1Var = bVar.f174625s;
                SnsMethodCalculate.markEndTimeMs("access$getRefreshActivityIconJob$p", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
                if (z1Var != null) {
                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                }
            }
            if (z && ((C61397g) C86312j.m106911c(cls)).Nj0(this.f174641a.f184779e, view.findViewById(C0966R.C0970id.dnt), view.findViewById(C0966R.C0970id.dke), this.f174643c.mo86351j())) {
                long P = C61926c.m72671P(this.f174641a.f184780f);
                int i = C61160f.f174109a;
                int i2 = this.f174641a.f184759C;
                ((C61397g) C86312j.m106911c(cls)).mo83473AP(true, P, FirebaseAnalytics.C113378a.SHARE, ((i2 == 2 || i2 == 8 || i2 == 16) || this.f174641a.f184759C == 6) ? 1 : 2, 3);
            }
            SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$fillItem$5");
        }
    }

    /* renamed from: lu2.b$d */
    public static final class C61407d {

        /* renamed from: a */
        public String f174644a = "";

        /* renamed from: b */
        public String f174645b = "";

        /* renamed from: a */
        public final String mo86353a() {
            SnsMethodCalculate.markStartTimeMs("getUniqueKey", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$updateLiveTag$UrlAndToken");
            String str = this.f174645b;
            SnsMethodCalculate.markEndTimeMs("getUniqueKey", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$updateLiveTag$UrlAndToken");
            return str;
        }

        /* renamed from: b */
        public final String mo86354b() {
            SnsMethodCalculate.markStartTimeMs("getUrl", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$updateLiveTag$UrlAndToken");
            String str = this.f174644a;
            SnsMethodCalculate.markEndTimeMs("getUrl", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$updateLiveTag$UrlAndToken");
            return str;
        }

        /* renamed from: c */
        public final void mo86355c(String str) {
            SnsMethodCalculate.markStartTimeMs("setUniqueKey", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$updateLiveTag$UrlAndToken");
            C87412m.m108594g(str, "<set-?>");
            this.f174645b = str;
            SnsMethodCalculate.markEndTimeMs("setUniqueKey", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$updateLiveTag$UrlAndToken");
        }

        /* renamed from: d */
        public final void mo86356d(String str) {
            SnsMethodCalculate.markStartTimeMs("setUrl", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$updateLiveTag$UrlAndToken");
            C87412m.m108594g(str, "<set-?>");
            this.f174644a = str;
            SnsMethodCalculate.markEndTimeMs("setUrl", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$updateLiveTag$UrlAndToken");
        }
    }

    /* renamed from: C */
    public static final /* synthetic */ String m72079C(C61403b bVar) {
        SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        String str = bVar.f174623q;
        SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        return str;
    }

    /* renamed from: G */
    public static final boolean m72080G(C61404a aVar, ImageView imageView, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("updateLiveTag$checkIsImageLoaded", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        if (imageView == null) {
            SnsMethodCalculate.markEndTimeMs("updateLiveTag$checkIsImageLoaded", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
            return false;
        }
        ImageView d = aVar.mo86345d();
        Object tag = d != null ? d.getTag(C0966R.C0970id.n4_) : null;
        boolean b = C87412m.m108589b(tag, str + i);
        SnsMethodCalculate.markEndTimeMs("updateLiveTag$checkIsImageLoaded", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        return b;
    }

    /* renamed from: H */
    public static final void m72081H(ImageView imageView, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("updateLiveTag$setLoadedImageTagAndClearOther", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        if (imageView != null) {
            imageView.setTag(C0966R.C0970id.n4_, str + i);
        }
        SnsMethodCalculate.markEndTimeMs("updateLiveTag$setLoadedImageTagAndClearOther", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
    }

    /* renamed from: I */
    public static final void m72082I(C61404a aVar, C61404a aVar2, C61407d dVar, int i) {
        SnsMethodCalculate.markStartTimeMs("updateLiveTag$showEndTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        View g = aVar2.mo86348g();
        if (g != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(8);
            C117292a.m165358d(g, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            g.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(g, "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View f = aVar2.mo86347f();
        if (f != null) {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view = f;
            C117292a.m165358d(view, aVar4.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View f2 = aVar2.mo86347f();
        if (f2 != null) {
            f2.setContentDescription(aVar2.mo81017b());
        }
        if (!m72080G(aVar, aVar2.mo86345d(), dVar.mo86353a(), 3)) {
            C7335d c = C86312j.m106911c(C60200t1.class);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            C60200t1.C60201a.m70368f((C60200t1) c, dVar.mo86354b(), aVar2.mo86345d(), dVar.mo86353a(), (C11978e0.C11979a) null, 8, (Object) null);
            m72081H(aVar2.mo86345d(), dVar.mo86353a(), 3);
        }
        ImageView d = aVar2.mo86345d();
        if (d != null) {
            d.setVisibility(0);
        }
        View i2 = aVar2.mo86350i();
        if (i2 != null) {
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar5.mo10233c(8);
            C117292a.m165358d(i2, aVar5.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i2.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(i2, "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        TextView e = aVar2.mo86346e();
        if (e != null) {
            e.setVisibility(8);
        }
        ((C60606n) C86312j.m106911c(C60606n.class)).Ej0(aVar2.mo86347f(), true, i);
        SnsMethodCalculate.markEndTimeMs("updateLiveTag$showEndTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00c6, code lost:
        r7 = r0.f182386Y;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m72083J(te3.C64273c21 r23, lu2.C61403b.C61404a r24, lu2.C61403b.C61404a r25, lu2.C61403b.C61407d r26, int r27) {
        /*
            r0 = r23
            r1 = r24
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            java.lang.String r3 = "updateLiveTag$showLiveTag"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            android.view.View r13 = r25.mo86348g()
            r14 = 0
            if (r13 != 0) goto L_0x0016
            goto L_0x0059
        L_0x0016:
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            r15.mo10233c(r5)
            java.lang.Object[] r6 = r15.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem"
            java.lang.String r8 = "updateLiveTag$showLiveTag"
            java.lang.String r9 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;I)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r13
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r5 = r15.mo10231a(r14)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r13.setVisibility(r5)
            java.lang.String r6 = "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem"
            java.lang.String r7 = "updateLiveTag$showLiveTag"
            java.lang.String r8 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;I)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r5 = r13
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
        L_0x0059:
            android.view.View r5 = r25.mo86347f()
            r6 = 8
            if (r5 != 0) goto L_0x0062
            goto L_0x00a4
        L_0x0062:
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r7.mo10233c(r8)
            java.lang.Object[] r16 = r7.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem"
            java.lang.String r18 = "updateLiveTag$showLiveTag"
            java.lang.String r19 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;I)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r5
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r7 = r7.mo10231a(r14)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.setVisibility(r7)
            java.lang.String r16 = "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem"
            java.lang.String r17 = "updateLiveTag$showLiveTag"
            java.lang.String r18 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;I)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
        L_0x00a4:
            java.lang.Class<ir.n> r5 = p565ir.C60606n.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ir.n r5 = (p565ir.C60606n) r5
            android.view.View r7 = r25.mo86348g()
            r8 = r27
            r5.Ej0(r7, r14, r8)
            android.view.View r5 = r25.mo86348g()
            if (r5 != 0) goto L_0x00bc
            goto L_0x00c3
        L_0x00bc:
            java.lang.String r7 = r25.mo81017b()
            r5.setContentDescription(r7)
        L_0x00c3:
            r5 = 1
            if (r0 == 0) goto L_0x00d0
            te3.ix0 r7 = r0.f182386Y
            if (r7 == 0) goto L_0x00d0
            int r7 = r7.f183745d
            if (r7 != r5) goto L_0x00d0
            r7 = 1
            goto L_0x00d1
        L_0x00d0:
            r7 = 0
        L_0x00d1:
            java.lang.String r8 = "getService(IFinderCommon…atureService::class.java)"
            if (r7 != 0) goto L_0x0118
            android.widget.ImageView r0 = r25.mo86345d()
            java.lang.String r5 = r26.mo86353a()
            boolean r0 = m72080G(r1, r0, r5, r14)
            if (r0 != 0) goto L_0x010d
            di3.d r0 = di3.C86312j.m106911c(r2)
            gy3.C87412m.m108593f(r0, r8)
            r15 = r0
            ht1.t1 r15 = (ht1.C60200t1) r15
            java.lang.String r16 = r26.mo86354b()
            android.widget.ImageView r17 = r25.mo86345d()
            java.lang.String r18 = r26.mo86353a()
            r19 = 0
            r20 = 8
            r21 = 0
            ht1.C60200t1.C60201a.m70369g(r15, r16, r17, r18, r19, r20, r21)
            android.widget.ImageView r0 = r25.mo86345d()
            java.lang.String r1 = r26.mo86353a()
            m72081H(r0, r1, r14)
        L_0x010d:
            android.widget.TextView r0 = r25.mo86346e()
            if (r0 != 0) goto L_0x0114
            goto L_0x0171
        L_0x0114:
            r0.setVisibility(r6)
            goto L_0x0171
        L_0x0118:
            android.widget.ImageView r6 = r25.mo86345d()
            java.lang.String r7 = r26.mo86353a()
            boolean r1 = m72080G(r1, r6, r7, r5)
            if (r1 != 0) goto L_0x0150
            di3.d r1 = di3.C86312j.m106911c(r2)
            gy3.C87412m.m108593f(r1, r8)
            r15 = r1
            ht1.t1 r15 = (ht1.C60200t1) r15
            java.lang.String r16 = r26.mo86354b()
            android.widget.ImageView r17 = r25.mo86345d()
            java.lang.String r18 = r26.mo86353a()
            r19 = 0
            r20 = 8
            r21 = 0
            ht1.C60200t1.C60201a.m70366d(r15, r16, r17, r18, r19, r20, r21)
            android.widget.ImageView r1 = r25.mo86345d()
            java.lang.String r2 = r26.mo86353a()
            m72081H(r1, r2, r5)
        L_0x0150:
            android.widget.TextView r1 = r25.mo86346e()
            if (r1 != 0) goto L_0x0157
            goto L_0x0167
        L_0x0157:
            if (r0 == 0) goto L_0x0162
            te3.ix0 r0 = r0.f182386Y
            if (r0 == 0) goto L_0x0162
            java.lang.String r0 = r0.f183746e
            if (r0 == 0) goto L_0x0162
            goto L_0x0164
        L_0x0162:
            java.lang.String r0 = ""
        L_0x0164:
            r1.setText(r0)
        L_0x0167:
            android.widget.TextView r0 = r25.mo86346e()
            if (r0 != 0) goto L_0x016e
            goto L_0x0171
        L_0x016e:
            r0.setVisibility(r14)
        L_0x0171:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lu2.C61403b.m72083J(te3.c21, lu2.b$a, lu2.b$a, lu2.b$d, int):void");
    }

    /* renamed from: D */
    public final boolean mo86341D(String str, View view, long j) {
        SnsMethodCalculate.markStartTimeMs("isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        if (view == null) {
            SnsMethodCalculate.markEndTimeMs("isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
            return false;
        }
        boolean Nj0 = ((C61397g) C86312j.m106911c(C61397g.class)).Nj0(str, view.findViewById(C0966R.C0970id.dnt), view.findViewById(C0966R.C0970id.dke), j);
        SnsMethodCalculate.markEndTimeMs("isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        return Nj0;
    }

    /* renamed from: E */
    public final boolean mo86342E(C64623p81 p812, C64273c21 c212) {
        Class cls = C61397g.class;
        SnsMethodCalculate.markStartTimeMs("isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        C87412m.m108594g(p812, "shareObject");
        boolean ah02 = c212 != null ? ((C61397g) C86312j.m106911c(cls)).ah0(p812.f184779e, c212) : ((C61397g) C86312j.m106911c(cls)).mo83476G0(p812);
        SnsMethodCalculate.markEndTimeMs("isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        return ah02;
    }

    /* renamed from: F */
    public final boolean mo86343F(C61404a aVar, TimeLineObject timeLineObject, C64623p81 p812, int i, C64273c21 c212, C51713vn0 vn02) {
        C48654a21 a212;
        boolean z;
        boolean z2;
        LinkedList<C48654a21> linkedList;
        T t;
        boolean z3;
        C61404a aVar2 = aVar;
        C64623p81 p813 = p812;
        int i2 = i;
        C64273c21 c213 = c212;
        C51713vn0 vn03 = vn02;
        Class cls = C61397g.class;
        SnsMethodCalculate.markStartTimeMs("updateLiveTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        C87412m.m108594g(aVar2, "holder");
        C87412m.m108594g(timeLineObject, "tlObj");
        C87412m.m108594g(p813, "shareObject");
        SnsMethodCalculate.markStartTimeMs("updateLiveTag$getCoverUrl", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        C51576uo2 uo22 = vn03 != null ? vn03.f143580o : null;
        if (vn03 == null || (linkedList = vn03.f143586u) == null) {
            a212 = null;
        } else {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C48654a21) t).f130235i == 2) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    break;
                }
            }
            a212 = (C48654a21) t;
        }
        C61407d dVar = new C61407d();
        String str = a212 != null ? a212.f130230d : null;
        String str2 = "";
        if (!(str == null || str.length() == 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append(a212 != null ? a212.f130230d : null);
            sb.append(Util.nullAsNil(a212 != null ? a212.f130231e : null));
            dVar.mo86356d(sb.toString());
            String str3 = a212 != null ? a212.f130230d : null;
            if (str3 != null) {
                str2 = str3;
            }
            dVar.mo86355c(str2);
        } else {
            String str4 = uo22 != null ? uo22.f142984d : null;
            if (!(str4 == null || str4.length() == 0)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(uo22 != null ? uo22.f142984d : null);
                sb4.append(Util.nullAsNil(uo22 != null ? uo22.f142985e : null));
                dVar.mo86356d(sb4.toString());
                String str5 = uo22 != null ? uo22.f142984d : null;
                if (str5 != null) {
                    str2 = str5;
                }
                dVar.mo86355c(str2);
            } else {
                String str6 = p813.f184783i;
                if (!(str6 == null || str6.length() == 0)) {
                    String str7 = p813.f184783i;
                    if (str7 == null) {
                        str7 = str2;
                    }
                    dVar.mo86356d(str7);
                    String b = dVar.mo86354b();
                    SnsMethodCalculate.markStartTimeMs("updateLiveTag$getCoverUrl$removeParam", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
                    Pattern compile = Pattern.compile("&?token=[^&]*");
                    C87412m.m108593f(compile, "compile(pattern)");
                    C87412m.m108594g(b, "input");
                    String replaceAll = compile.matcher(b).replaceAll(str2);
                    C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                    SnsMethodCalculate.markEndTimeMs("updateLiveTag$getCoverUrl$removeParam", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
                    dVar.mo86355c(replaceAll);
                } else {
                    String str8 = p813.f184789r;
                    if (!(str8 == null || str8.length() == 0)) {
                        String str9 = p813.f184789r;
                        if (str9 != null) {
                            str2 = str9;
                        }
                        dVar.mo86356d(str2);
                        dVar.mo86355c(dVar.mo86354b());
                    }
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("updateLiveTag$getCoverUrl", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        SnsMethodCalculate.markStartTimeMs("updateLiveTag$isChargeLive", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        if (c213 != null) {
            z = ((C60606n) C86312j.m106911c(C60606n.class)).mo85008I1(c213);
        } else {
            int i3 = C61160f.f174109a;
            int i4 = p813.f184759C;
            z = i4 == 2 || i4 == 8 || i4 == 16;
        }
        SnsMethodCalculate.markEndTimeMs("updateLiveTag$isChargeLive", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        SnsMethodCalculate.markStartTimeMs("updateLiveTag$isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        boolean ah02 = c213 != null ? ((C61397g) C86312j.m106911c(cls)).ah0(p813.f184779e, c213) : ((C61397g) C86312j.m106911c(cls)).mo83476G0(p813);
        SnsMethodCalculate.markEndTimeMs("updateLiveTag$isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        boolean Qg = ((C61397g) C86312j.m106911c(cls)).mo83480Qg(c213);
        String str10 = this.f174623q;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("updateLiveTag live:");
        sb5.append(p813.f184778d);
        sb5.append('(');
        sb5.append(p813.f184781g);
        sb5.append("),liveStatus:");
        sb5.append(i2);
        sb5.append('(');
        sb5.append(c213 != null ? Integer.valueOf(c213.f182394f) : null);
        sb5.append("),chargFlag:");
        sb5.append(p813.f184759C);
        sb5.append(",isChargeLive:");
        sb5.append(z);
        sb5.append(",isLiveReplay:");
        sb5.append(ah02);
        sb5.append(",producingReplay:");
        sb5.append(Qg);
        sb5.append(",liveInfo null:");
        sb5.append(c213 == null);
        sb5.append(",purchaseInfo null:");
        sb5.append((c213 != null ? c213.f182363I : null) == null);
        Log.m105924i(str10, sb5.toString());
        if (z) {
            m72083J(c213, aVar2, aVar2, dVar, 2);
        } else if (ah02) {
            m72083J(c213, aVar2, aVar2, dVar, 4);
        } else if (Qg) {
            m72082I(aVar2, aVar2, dVar, 3);
        } else {
            z2 = true;
            if (i2 == 1) {
                m72083J(c213, aVar2, aVar2, dVar, 0);
            } else {
                m72082I(aVar2, aVar2, dVar, 0);
            }
            SnsMethodCalculate.markEndTimeMs("updateLiveTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
            return z2;
        }
        z2 = true;
        SnsMethodCalculate.markEndTimeMs("updateLiveTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        return z2;
    }

    /* renamed from: h */
    public void mo81014h(ViewStub viewStub, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        C87412m.m108592e(baseViewHolder, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem.FinderLiveViewHolder");
        C61404a aVar = (C61404a) baseViewHolder;
        if (BaseTimeLineItem.m122773q(baseViewHolder) == null || BaseTimeLineItem.m122773q(baseViewHolder).getParent() == null) {
            View findViewById = aVar.f279960i.findViewById(C0966R.C0970id.jtc);
            SnsMethodCalculate.markStartTimeMs("setFinderMediaRoot", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            aVar.f174627G0 = findViewById;
            SnsMethodCalculate.markEndTimeMs("setFinderMediaRoot", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            SnsMethodCalculate.markStartTimeMs("setFinderMediaStubHas", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            aVar.f174626F0 = true;
            SnsMethodCalculate.markEndTimeMs("setFinderMediaStubHas", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        } else {
            BaseTimeLineItem.m122773q(baseViewHolder).setLayoutResource(C0966R.C0971layout.f360002c31);
            SnsMethodCalculate.markStartTimeMs("getFinderMediaStubHas", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            boolean z = aVar.f174626F0;
            SnsMethodCalculate.markEndTimeMs("getFinderMediaStubHas", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            if (!z) {
                View inflate = BaseTimeLineItem.m122773q(baseViewHolder).inflate();
                SnsMethodCalculate.markStartTimeMs("setFinderMediaRoot", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
                aVar.f174627G0 = inflate;
                SnsMethodCalculate.markEndTimeMs("setFinderMediaRoot", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
                SnsMethodCalculate.markStartTimeMs("setFinderMediaStubHas", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
                aVar.f174626F0 = true;
                SnsMethodCalculate.markEndTimeMs("setFinderMediaStubHas", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            }
        }
        View h = aVar.mo86349h();
        View view = null;
        ImageView imageView = h != null ? (ImageView) h.findViewById(C0966R.C0970id.jtg) : null;
        SnsMethodCalculate.markStartTimeMs("setCoverIv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        aVar.f174629I0 = imageView;
        SnsMethodCalculate.markEndTimeMs("setCoverIv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        View h2 = aVar.mo86349h();
        View findViewById2 = h2 != null ? h2.findViewById(C0966R.C0970id.dnt) : null;
        SnsMethodCalculate.markStartTimeMs("setFinderLiveTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        aVar.f174630J0 = findViewById2;
        SnsMethodCalculate.markEndTimeMs("setFinderLiveTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        View h3 = aVar.mo86349h();
        View findViewById3 = h3 != null ? h3.findViewById(C0966R.C0970id.dke) : null;
        SnsMethodCalculate.markStartTimeMs("setFinderLiveEndTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        aVar.f174631K0 = findViewById3;
        SnsMethodCalculate.markEndTimeMs("setFinderLiveEndTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        View h4 = aVar.mo86349h();
        ImageView imageView2 = h4 != null ? (ImageView) h4.findViewById(C0966R.C0970id.f358478fd2) : null;
        SnsMethodCalculate.markStartTimeMs("setActivityInfoIcon", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        aVar.f174632L0 = imageView2;
        SnsMethodCalculate.markEndTimeMs("setActivityInfoIcon", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        View h5 = aVar.mo86349h();
        TextView textView = h5 != null ? (TextView) h5.findViewById(C0966R.C0970id.f358052mq2) : null;
        SnsMethodCalculate.markStartTimeMs("setFinderBansTv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        aVar.f174633M0 = textView;
        SnsMethodCalculate.markEndTimeMs("setFinderBansTv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        View h6 = aVar.mo86349h();
        TextView textView2 = h6 != null ? (TextView) h6.findViewById(C0966R.C0970id.kxv) : null;
        SnsMethodCalculate.markStartTimeMs("setReasonTv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        aVar.f174634N0 = textView2;
        SnsMethodCalculate.markEndTimeMs("setReasonTv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        View h7 = aVar.mo86349h();
        if (h7 != null) {
            view = h7.findViewById(C0966R.C0970id.m1c);
        }
        SnsMethodCalculate.markStartTimeMs("setFinderOlympicView", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        aVar.f174635O0 = view;
        SnsMethodCalculate.markEndTimeMs("setFinderOlympicView", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v1, resolved type: java.lang.Class<l31.e>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.util.concurrent.CancellationException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.util.concurrent.CancellationException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.util.concurrent.CancellationException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v24, types: [boolean] */
    /* JADX WARNING: type inference failed for: r4v29 */
    /* JADX WARNING: type inference failed for: r4v30 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo81015o(com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder r36, int r37, com.tencent.p014mm.plugin.sns.p106ui.C96275w6 r38, com.tencent.p014mm.protocal.protobuf.TimeLineObject r39, int r40, com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter r41) {
        /*
            r35 = this;
            r9 = r35
            r0 = r36
            r10 = r38
            r11 = r39
            java.lang.Class<l31.e> r12 = l31.C61212e.class
            java.lang.Class<ir.n> r13 = p565ir.C60606n.class
            java.lang.String r14 = "fillItem"
            java.lang.String r15 = "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r15)
            r8 = 0
            if (r11 == 0) goto L_0x0019
            te3.j00 r1 = r11.ContentObj
            goto L_0x001a
        L_0x0019:
            r1 = r8
        L_0x001a:
            r7 = 1
            if (r1 == 0) goto L_0x049c
            te3.j00 r1 = r11.ContentObj
            te3.p81 r1 = r1.f298435s
            if (r1 == 0) goto L_0x049c
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem.FinderLiveViewHolder"
            gy3.C87412m.m108592e(r0, r1)
            r6 = r0
            lu2.b$a r6 = (lu2.C61403b.C61404a) r6
            te3.j00 r0 = r11.ContentObj
            te3.p81 r5 = r0.f298435s
            java.lang.String r0 = r5.f184781g
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "setNickName"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r6.f174628H0 = r0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            te3.j00 r0 = r11.ContentObj
            if (r0 == 0) goto L_0x004f
            te3.p81 r0 = r0.f298435s
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r0.f184778d
            if (r0 != 0) goto L_0x0051
        L_0x004f:
            java.lang.String r0 = "0"
        L_0x0051:
            r3 = 0
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r0, r3)
            java.lang.String r3 = "setLiveId"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r2)
            r6.f174636P0 = r0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            java.lang.String r0 = "updateLiveStatus"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r15)
            android.view.View r0 = r6.mo86349h()
            if (r0 == 0) goto L_0x0076
            android.content.Context r0 = r0.getContext()
            goto L_0x0077
        L_0x0076:
            r0 = r8
        L_0x0077:
            android.util.Pair r4 = ad0.C91999u.m115564j(r0)
            android.view.View r0 = r6.mo86349h()
            if (r0 == 0) goto L_0x0086
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            goto L_0x0087
        L_0x0086:
            r0 = r8
        L_0x0087:
            if (r0 != 0) goto L_0x008a
            goto L_0x009a
        L_0x008a:
            java.lang.Object r1 = r4.first
            java.lang.String r2 = "pair.first"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.width = r1
        L_0x009a:
            if (r0 != 0) goto L_0x009d
            goto L_0x00ad
        L_0x009d:
            java.lang.Object r1 = r4.second
            java.lang.String r2 = "pair.second"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.height = r1
        L_0x00ad:
            android.view.View r1 = r6.mo86349h()
            if (r1 != 0) goto L_0x00b4
            goto L_0x00b7
        L_0x00b4:
            r1.setLayoutParams(r0)
        L_0x00b7:
            android.view.View r0 = r6.mo86349h()
            if (r0 == 0) goto L_0x00c0
            r0.requestLayout()
        L_0x00c0:
            android.widget.ImageView r0 = r6.mo86344c()
            r3 = 8
            if (r0 != 0) goto L_0x00c9
            goto L_0x00cc
        L_0x00c9:
            r0.setVisibility(r3)
        L_0x00cc:
            android.widget.TextView r0 = r6.mo86352k()
            if (r0 != 0) goto L_0x00d3
            goto L_0x00d6
        L_0x00d3:
            r0.setVisibility(r3)
        L_0x00d6:
            di3.d r0 = di3.C86312j.m106911c(r13)
            ir.n r0 = (p565ir.C60606n) r0
            long r1 = r6.mo86351j()
            java.lang.String r0 = r0.mo84996Dk(r1)
            int r1 = r0.length()
            r2 = 0
            if (r1 <= 0) goto L_0x00ed
            r1 = 1
            goto L_0x00ee
        L_0x00ed:
            r1 = 0
        L_0x00ee:
            if (r1 == 0) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r0 = r8
        L_0x00f2:
            if (r0 == 0) goto L_0x00f6
            r5.f184783i = r0
        L_0x00f6:
            int r1 = r5.f184791t
            te3.c21 r0 = r5.f184761E
            r16 = 0
            r17 = r0
            r0 = r35
            r18 = r1
            r1 = r6
            r2 = r39
            r20 = 0
            r3 = r5
            r23 = r4
            r4 = r18
            r37 = r14
            r14 = r5
            r5 = r17
            r36 = r6
            r6 = r16
            r0.mo86343F(r1, r2, r3, r4, r5, r6)
            if (r10 == 0) goto L_0x011f
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r10.f281367a
            r16 = r0
            goto L_0x0121
        L_0x011f:
            r16 = r8
        L_0x0121:
            java.lang.String r6 = "checkLiveStatus"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r15)
            gy3.f0 r3 = new gy3.f0
            r3.<init>()
            te3.j00 r0 = r11.ContentObj
            te3.p81 r0 = r0.f298435s
            r3.f27484d = r0
            java.lang.String r0 = r0.f184778d
            if (r0 == 0) goto L_0x0142
            java.lang.Long r0 = z04.C66731x.m78732f(r0)
            if (r0 == 0) goto L_0x0142
            long r0 = r0.longValue()
            r25 = r0
            goto L_0x0144
        L_0x0142:
            r25 = r20
        L_0x0144:
            gy3.d0 r4 = new gy3.d0
            r4.<init>()
            T r0 = r3.f27484d
            te3.p81 r0 = (te3.C64623p81) r0
            int r0 = r0.f184791t
            r4.f27483d = r0
            lu2.d r29 = new lu2.d
            r0 = r29
            r1 = r36
            r2 = r35
            r17 = r4
            r4 = r25
            r10 = r6
            r6 = r39
            r40 = r12
            r12 = 1
            r7 = r16
            r8 = r17
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            android.view.View r0 = r36.mo86349h()
            if (r0 == 0) goto L_0x0175
            android.content.Context r8 = r0.getContext()
            goto L_0x0176
        L_0x0175:
            r8 = 0
        L_0x0176:
            boolean r0 = r8 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI
            if (r0 == 0) goto L_0x0191
            android.view.View r0 = r36.mo86349h()
            if (r0 == 0) goto L_0x0185
            android.content.Context r8 = r0.getContext()
            goto L_0x0186
        L_0x0185:
            r8 = 0
        L_0x0186:
            java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.SnsTimeLineUI"
            gy3.C87412m.m108592e(r8, r0)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r8 = (com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI) r8
            r28 = r8
            goto L_0x0193
        L_0x0191:
            r28 = 0
        L_0x0193:
            di3.d r0 = di3.C86312j.m106911c(r13)
            java.lang.String r1 = "getService(IFinderLiveFeatureService::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            r24 = r0
            ir.n r24 = (p565ir.C60606n) r24
            r27 = 0
            r30 = 2
            r31 = 0
            r32 = 0
            r33 = 96
            r34 = 0
            p565ir.C60606n.C60607a.m70857a(r24, r25, r27, r28, r29, r30, r31, r32, r33, r34)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r15)
            java.lang.String r0 = r14.f184765I
            if (r0 == 0) goto L_0x01bf
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01bd
            goto L_0x01bf
        L_0x01bd:
            r7 = 0
            goto L_0x01c0
        L_0x01bf:
            r7 = 1
        L_0x01c0:
            java.lang.String r0 = ""
            if (r7 != 0) goto L_0x033c
            int r1 = r14.f184791t
            r2 = 2
            if (r1 == r2) goto L_0x033c
            android.view.View r1 = r36.mo86350i()
            if (r1 == 0) goto L_0x02e6
            r3 = 2131304546(0x7f092062, float:1.8227238E38)
            android.view.View r3 = r1.findViewById(r3)
            java.lang.String r4 = "it.findViewById(R.id.finder_olympic_invite_bg)"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r4 = 2131304547(0x7f092063, float:1.822724E38)
            android.view.View r4 = r1.findViewById(r4)
            java.lang.String r5 = "it.findViewById(R.id.finder_olympic_invite_icon)"
            gy3.C87412m.m108593f(r4, r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            di3.d r5 = di3.C86312j.m106911c(r13)
            ir.n r5 = (p565ir.C60606n) r5
            ks3.t r6 = ks3.C61165t.SHARE_BG
            r7 = 2131232945(0x7f0808b1, float:1.8082014E38)
            r5.x30(r3, r6, r7)
            di3.d r3 = di3.C86312j.m106911c(r13)
            ir.n r3 = (p565ir.C60606n) r3
            ks3.t r5 = ks3.C61165t.SHARE_ICON
            r6 = 2131232946(0x7f0808b2, float:1.8082016E38)
            r3.x30(r4, r5, r6)
            r3 = 2131304549(0x7f092065, float:1.8227244E38)
            android.view.View r3 = r1.findViewById(r3)
            java.lang.String r4 = "it.findViewById(R.id.finder_olympic_invite_text)"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 1096810496(0x41600000, float:14.0)
            r3.setTextSize(r12, r4)
            r5 = 2131304548(0x7f092064, float:1.8227242E38)
            android.view.View r5 = r1.findViewById(r5)
            java.lang.String r6 = "it.findViewById(R.id.finder_olympic_invite_name)"
            gy3.C87412m.m108593f(r5, r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r5.setTextSize(r12, r4)
            r4 = 2131304551(0x7f092067, float:1.8227248E38)
            android.view.View r1 = r1.findViewById(r4)
            java.lang.String r4 = "it.findViewById(R.id.finder_olympic_invite_you)"
            gy3.C87412m.m108593f(r1, r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r4 = 1097859072(0x41700000, float:15.0)
            r1.setTextSize(r12, r4)
            android.text.TextPaint r4 = r3.getPaint()
            r6 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r4, r6)
            android.text.TextPaint r4 = r5.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r4, r6)
            android.text.TextPaint r1 = r1.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r1, r6)
            java.lang.String r1 = r14.f184766J
            if (r1 == 0) goto L_0x0263
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0261
            goto L_0x0263
        L_0x0261:
            r7 = 0
            goto L_0x0264
        L_0x0263:
            r7 = 1
        L_0x0264:
            if (r7 == 0) goto L_0x026d
            r1 = 8
            r5.setVisibility(r1)
            r4 = 0
            goto L_0x0288
        L_0x026d:
            r1 = 8
            java.lang.Class<ny.h> r4 = p629ny.C76979h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ny.h r4 = (p629ny.C76979h) r4
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r7 = r14.f184766J
            android.text.SpannableString r4 = r4.mo107057T1(r6, r7)
            r5.setText(r4)
            r4 = 0
            r5.setVisibility(r4)
        L_0x0288:
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131829356(0x7f11226c, float:1.9291679E38)
            java.lang.Object[] r7 = new java.lang.Object[r12]
            java.lang.String r8 = r14.f184765I
            r7[r4] = r8
            java.lang.String r5 = r5.getString(r6, r7)
            java.lang.String r6 = "getContext().resources.g…erShareObject.relayIndex)"
            gy3.C87412m.m108593f(r5, r6)
            r6 = r23
            java.lang.Object r6 = r6.first
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r8 = 12
            int r7 = kg3.C76577a.m92151b(r7, r8)
            int r7 = r7 * 2
            int r21 = r6 - r7
            java.lang.String r2 = "\n"
            java.lang.String r2 = z04.C112551y.m153814n(r5, r2, r0, r4)
            android.text.StaticLayout r6 = new android.text.StaticLayout
            r18 = 0
            int r19 = r2.length()
            android.text.TextPaint r20 = r3.getPaint()
            android.text.Layout$Alignment r22 = android.text.Layout.Alignment.ALIGN_NORMAL
            r23 = 1065353216(0x3f800000, float:1.0)
            r24 = 0
            r25 = 1
            r16 = r6
            r17 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            int r6 = r6.getLineCount()
            if (r6 > r12) goto L_0x02e2
            r5 = r2
        L_0x02e2:
            r3.setText(r5)
            goto L_0x02e9
        L_0x02e6:
            r1 = 8
            r4 = 0
        L_0x02e9:
            android.view.View r2 = r36.mo86350i()
            if (r2 != 0) goto L_0x02f0
            goto L_0x0331
        L_0x02f0:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.mo10233c(r5)
            java.lang.Object[] r17 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem"
            java.lang.String r19 = "fillItem"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r2
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem"
            java.lang.String r18 = "fillItem"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x0331:
            android.widget.ImageView r2 = r36.mo86345d()
            if (r2 != 0) goto L_0x0338
            goto L_0x0391
        L_0x0338:
            r2.setVisibility(r1)
            goto L_0x0391
        L_0x033c:
            r1 = 8
            r4 = 0
            android.view.View r2 = r36.mo86350i()
            if (r2 != 0) goto L_0x0346
            goto L_0x0387
        L_0x0346:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.mo10233c(r1)
            java.lang.Object[] r17 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem"
            java.lang.String r19 = "fillItem"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r2
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r1 = r3.mo10231a(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.setVisibility(r1)
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem"
            java.lang.String r18 = "fillItem"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x0387:
            android.widget.ImageView r1 = r36.mo86345d()
            if (r1 != 0) goto L_0x038e
            goto L_0x0391
        L_0x038e:
            r1.setVisibility(r4)
        L_0x0391:
            android.view.View r1 = r36.mo86349h()
            if (r1 != 0) goto L_0x0398
            goto L_0x039b
        L_0x0398:
            r1.setTag(r11)
        L_0x039b:
            android.view.View r1 = r36.mo86349h()
            if (r1 == 0) goto L_0x03ba
            gy3.C87412m.m108591d(r41)
            java.lang.String r2 = "getOnClickListener"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r15)
            r3 = r41
            com.tencent.mm.plugin.sns.ui.n8 r3 = r3.f278576j
            android.view.View$OnClickListener r3 = r3.f280588f
            java.lang.String r4 = "adapter.timelineEvent.finderLiveListener"
            gy3.C87412m.m108593f(r3, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r15)
            r1.setOnClickListener(r3)
        L_0x03ba:
            te3.c21 r1 = r14.f184761E
            boolean r1 = r9.mo86342E(r14, r1)
            if (r1 != 0) goto L_0x040b
            android.view.View r1 = r36.mo86349h()
            if (r1 == 0) goto L_0x040b
            di3.d r2 = di3.C86312j.m106911c(r40)
            l31.e r2 = (l31.C61212e) r2
            r2.se0(r1)
            java.lang.String r2 = r14.f184779e
            long r3 = r36.mo86351j()
            boolean r2 = r9.mo86341D(r2, r1, r3)
            if (r2 == 0) goto L_0x03e3
            r2 = r37
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r15)
            return
        L_0x03e3:
            r2 = r37
            t91.c$a r3 = t91.C64208c.f181951a
            java.lang.String r4 = r14.f184778d
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r5 = 0
            r3.mo89030e(r4, r5)
            di3.d r3 = di3.C86312j.m106911c(r40)
            l31.e r3 = (l31.C61212e) r3
            java.lang.String r4 = "live_room_card"
            l31.e r3 = r3.o30(r1, r4)
            r4 = 40
            lu2.b$b r6 = new lu2.b$b
            r7 = r36
            r6.<init>(r14, r9, r1, r7)
            r3.r80(r1, r4, r6)
            goto L_0x0410
        L_0x040b:
            r7 = r36
            r2 = r37
            r5 = 0
        L_0x0410:
            int r1 = r14.f184791t
            if (r1 != r12) goto L_0x048c
            te3.j00 r1 = r11.ContentObj
            if (r1 == 0) goto L_0x041f
            te3.p81 r1 = r1.f298435s
            if (r1 == 0) goto L_0x041f
            java.lang.String r8 = r1.f184780f
            goto L_0x0420
        L_0x041f:
            r8 = r5
        L_0x0420:
            long r18 = o40.C61926c.m72671P(r8)
            te3.j00 r1 = r11.ContentObj
            if (r1 == 0) goto L_0x0434
            te3.p81 r1 = r1.f298435s
            if (r1 == 0) goto L_0x0434
            java.lang.String r1 = r1.f184790s
            if (r1 != 0) goto L_0x0431
            goto L_0x0434
        L_0x0431:
            r20 = r1
            goto L_0x0436
        L_0x0434:
            r20 = r0
        L_0x0436:
            java.lang.String r0 = "bindActivityIcon"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r15)
            java.lang.String r1 = o40.C61926c.m72691p(r18)
            java.lang.String r3 = r9.f174623q
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "#bindActivityIcon feedId="
            r4.append(r6)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            a14.z1 r1 = r9.f174625s
            if (r1 == 0) goto L_0x045c
            a14.C53973z1.C53974a.m60623a(r1, r5, r12, r5)
        L_0x045c:
            di3.d r1 = di3.C86312j.m106911c(r13)
            ir.n r1 = (p565ir.C60606n) r1
            boolean r1 = r1.J10()
            if (r1 == 0) goto L_0x0489
            android.widget.ImageView r17 = r7.mo86344c()
            if (r17 == 0) goto L_0x0489
            a14.n0 r1 = r9.f174624r
            r22 = 0
            r23 = 0
            lu2.c r24 = new lu2.c
            r21 = 0
            r16 = r24
            r16.<init>(r17, r18, r20, r21)
            r25 = 3
            r26 = 0
            r21 = r1
            a14.z1 r1 = a14.C53895h.m60466d(r21, r22, r23, r24, r25, r26)
            r9.f174625s = r1
        L_0x0489:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r15)
        L_0x048c:
            android.view.View r0 = r7.f279960i
            java.lang.String r1 = "holder.convertView"
            gy3.C87412m.m108593f(r0, r1)
            lu2.b$c r1 = new lu2.b$c
            r1.<init>(r14, r9, r7)
            zp3.C23564m.m28138h(r0, r1)
            goto L_0x049e
        L_0x049c:
            r2 = r14
            r12 = 1
        L_0x049e:
            r0 = r38
            r9.mo133391g(r0, r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lu2.C61403b.mo81015o(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.w6, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter):void");
    }

    /* renamed from: t */
    public String mo81016t() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        return "FinderLiveTimeLineItem";
    }
}
