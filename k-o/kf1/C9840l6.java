package kf1;

import al1.C0081n;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.FinderPoiFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.storage.FinderStaggeredConfig;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import de1.C7267b;
import de1.C7287o;
import di3.C7335d;
import di3.C86312j;
import dp1.C45435i2;
import dp1.C58417y0;
import dp1.C7450q;
import er1.C58684b;
import er1.C58739j4;
import er1.C58784w3;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import je1.C46523h2;
import jq3.C60898l;
import k20.C60958c;
import k20.C9556a;
import l31.C61212e;
import ls3.C10649f;
import org.json.JSONException;
import org.json.JSONObject;
import p204mr.C11078h;
import p274xx.C15907f;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C90364q0;
import te3.C49098d51;
import te3.C49712hj1;
import te3.C49982je3;
import te3.C51822we1;
import te3.C64273c21;
import te3.C64279c90;
import te3.C64686ro2;
import te3.C64689rq2;
import te3.C64848y91;
import te3.m74;
import tf0.C13883o1;
import tf0.C64916p1;
import up1.C37521f;
import xd1.C15644c;
import yd1.C15962a;
import z04.C112550d0;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: kf1.l6 */
public final class C9840l6 extends C9753h {

    /* renamed from: A */
    public float f30402A;

    /* renamed from: B */
    public float f30403B;

    /* renamed from: C */
    public String f30404C;

    /* renamed from: D */
    public int f30405D;

    /* renamed from: E */
    public View f30406E;

    /* renamed from: F */
    public int f30407F;

    /* renamed from: G */
    public C49982je3 f30408G;

    /* renamed from: u */
    public View f30409u;

    /* renamed from: v */
    public View f30410v;

    /* renamed from: w */
    public String f30411w;

    /* renamed from: x */
    public int f30412x;

    /* renamed from: y */
    public long f30413y;

    /* renamed from: z */
    public String f30414z;

    /* renamed from: kf1.l6$a */
    public static final class C9841a implements C15907f.C15909b {

        /* renamed from: a */
        public final /* synthetic */ C9840l6 f30415a;

        /* renamed from: b */
        public final /* synthetic */ Intent f30416b;

        public C9841a(C9840l6 l6Var, Intent intent) {
            this.f30415a = l6Var;
            this.f30416b = intent;
        }

        /* renamed from: a */
        public void mo6380a() {
        }

        public void onSuccess() {
            ((C58684b) C86312j.m106911c(C58684b.class)).oy0(this.f30415a.f30214d, this.f30416b);
        }
    }

    /* renamed from: kf1.l6$b */
    public static final class C9842b extends ClickableSpan {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f30417d;

        /* renamed from: e */
        public final /* synthetic */ TextView f30418e;

        public C9842b(C32224a<C13598b0> aVar, TextView textView) {
            this.f30417d = aVar;
            this.f30418e = textView;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedViewCallback$setClickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108594g(view, "widget");
            this.f30417d.invoke();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedViewCallback$setClickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            C87412m.m108594g(textPaint, "ds");
            textPaint.setColor(this.f30418e.getContext().getResources().getColor(C0966R.color.Link_100));
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9840l6(com.tencent.p014mm.p136ui.MMActivity r9, int r10, int r11, boolean r12, int r13, gy3.C8480h r14) {
        /*
            r8 = this;
            r13 = r13 & 8
            if (r13 == 0) goto L_0x0007
            r12 = 0
            r4 = 0
            goto L_0x0008
        L_0x0007:
            r4 = r12
        L_0x0008:
            java.lang.String r12 = "context"
            gy3.C87412m.m108594g(r9, r12)
            r5 = 0
            r6 = 16
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = ""
            r8.f30411w = r9
            r8.f30414z = r9
            r8.f30404C = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9840l6.<init>(com.tencent.mm.ui.MMActivity, int, int, boolean, int, gy3.h):void");
    }

    /* renamed from: c1 */
    public static /* synthetic */ void m9580c1(C9840l6 l6Var, TextView textView, String str, Integer num, C32224a aVar, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            aVar = null;
        }
        l6Var.mo10395b1(textView, str, num, aVar);
    }

    /* renamed from: E0 */
    public View mo10347E0() {
        C9732g I0 = mo10348I0();
        View view = null;
        C9827k6 k6Var = I0 instanceof C9827k6 ? (C9827k6) I0 : null;
        boolean z = true;
        if (k6Var == null || !k6Var.f30379i) {
            z = false;
        }
        if (z) {
            View inflate = View.inflate(this.f30214d, C0966R.C0971layout.ctn, (ViewGroup) null);
            this.f30410v = inflate;
            View findViewById = inflate != null ? inflate.findViewById(C0966R.C0970id.g2s) : null;
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view2 = this.f30410v;
            if (view2 != null) {
                view = view2.findViewById(C0966R.C0970id.mtc);
            }
            if (view != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view3 = view;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f30220j.setLoadMoreFooter(new ImageView(this.f30214d));
        }
        return this.f30410v;
    }

    /* renamed from: F0 */
    public View mo9289F0() {
        C37521f.f99374d.getClass();
        if (C37521f.f99172F7.mo60266n().intValue() != 1) {
            this.f30409u = View.inflate(this.f30214d, C0966R.C0971layout.f359774an1, (ViewGroup) null);
        }
        return this.f30409u;
    }

    /* renamed from: G0 */
    public RecyclerView.C0129l mo9290G0() {
        ((FinderStaggeredConfig) this.f30224q).getClass();
        return new FinderStaggeredConfig.C3631b();
    }

    /* renamed from: H0 */
    public RecyclerView.LayoutManager mo9291H0(Context context) {
        C87412m.m108594g(context, "context");
        return this.f30224q.mo3666d(context);
    }

    /* renamed from: J0 */
    public CharSequence mo9292J0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        return null;
    }

    /* renamed from: Q0 */
    public void mo9294Q0(RecyclerView.C16613e<?> eVar, View view, int i) {
        C0740i2 i2Var;
        boolean z;
        String str;
        char c;
        String str2;
        char c2;
        FinderItem o;
        FinderItem o2;
        String nickName;
        RecyclerView.C16613e<?> eVar2 = eVar;
        View view2 = view;
        Class cls = C58417y0.class;
        Class cls2 = C10649f.class;
        Class cls3 = C58684b.class;
        C87412m.m108594g(eVar2, "adapter");
        C87412m.m108594g(view2, "view");
        int c6 = i - ((C60898l) eVar2).mo85796c6();
        if (c6 >= 0 && c6 < mo10348I0().f30175e.getSize() && ((z = i2Var instanceof BaseFinderFeed))) {
            StringBuilder sb = new StringBuilder();
            sb.append("onGridItemClick ");
            sb.append(c6);
            sb.append(" id:");
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
            sb.append(baseFinderFeed.mo3513o().getId());
            sb.append(", pos:");
            sb.append(c6);
            sb.append(", nonceId:");
            sb.append(baseFinderFeed.mo3513o().getObjectNonceId());
            Log.m105924i("Finder.FinderPoiFeedUIContract.PoiFeedViewCallback", sb.toString());
            String str3 = "";
            if (C58739j4.f168176a.mo83686O(baseFinderFeed)) {
                if (Util.isEqual(baseFinderFeed.mo3513o().getUserName(), C66785b.f191882e.mo90662O5())) {
                    C7335d c3 = C86312j.m106911c(cls3);
                    C87412m.m108593f(c3, "getService(ActivityRouter::class.java)");
                    C13883o1 o1Var = (C13883o1) c3;
                    MMActivity mMActivity = this.f30214d;
                    long id = baseFinderFeed.mo3513o().getId();
                    String objectNonceId = baseFinderFeed.mo3513o().getObjectNonceId();
                    C64273c21 liveInfo = baseFinderFeed.mo3513o().getLiveInfo();
                    if (liveInfo == null) {
                        liveInfo = new C64273c21();
                    }
                    C13883o1.C13884a.m13249a(o1Var, mMActivity, id, objectNonceId, liveInfo, (C0081n) null, (C49098d51) null, (String) null, (LinkedList) null, (C64848y91) null, (String) null, baseFinderFeed.mo3526z(), (LinkedList) null, (Intent) null, 7152, (Object) null);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(i2Var);
                    Intent intent = new Intent();
                    C13604l<List<FinderObject>, Integer> sr = ((C10649f) C86312j.m106911c(cls2)).mo10915sr(arrayList, i2Var);
                    List list = (List) sr.f38555d;
                    int intValue = ((Number) sr.f38556e).intValue();
                    C64279c90 c902 = new C64279c90();
                    c902.f182444d = str3;
                    c902.f182445e = str3;
                    c902.f182446f = false;
                    c902.f182447g = -1;
                    c902.f182448h = -1;
                    c902.f182449i = 1;
                    C64686ro2 ro22 = new C64686ro2();
                    ro22.f185214e = this.f30216f;
                    BaseFinderFeed baseFinderFeed2 = z ? baseFinderFeed : null;
                    if (!(baseFinderFeed2 == null || (o2 = baseFinderFeed2.mo3513o()) == null || (nickName = o2.getNickName()) == null)) {
                        str3 = nickName;
                    }
                    ro22.f185215f = str3;
                    if (!z) {
                        baseFinderFeed = null;
                    }
                    ro22.f185218i = (baseFinderFeed == null || (o = baseFinderFeed.mo3513o()) == null) ? null : o.getFeedObject();
                    c902.f182450j = ro22;
                    ((C10649f) C86312j.m106911c(cls2)).mo10913cP(this.f30214d, intent, list, intValue, c902, (C10649f.C10650a) null);
                }
                C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62444c(this.f30214d).mo75002a(C13442s8.class)).mo12861q3();
                C7335d c4 = C86312j.m106911c(cls);
                C87412m.m108593f(c4, "getService(FinderReportLogic::class.java)");
                C58417y0.Qx0((C58417y0) c4, q3, i2Var.getItemId(), this.f30220j.getRecyclerView(), 0, (String) null, 24, (Object) null);
                C7450q.f25643a.mo8594b(q3, i2Var, 18);
                Log.m105924i("Finder.FinderPoiFeedUIContract.PoiFeedViewCallback", "onGridItemClick return for live feed, commentScene:" + this.f30216f);
                return;
            }
            C45435i2 vP = ((C64916p1) C86312j.m106911c(C64916p1.class)).mo9101vP((i2Var = (C0740i2) mo10348I0().f30175e.getDataListJustForAdapter().get(c6)).getItemId(), 96);
            if (vP != null) {
                try {
                    JSONObject a = C15962a.f42858a.mo14614a(this.f30408G, this.f30407F, "poitab");
                    C51822we1 we12 = vP.f122975a;
                    C46523h2 h2Var = C46523h2.f125330a;
                    String str4 = we12.f143989i;
                    String str5 = str4 == null ? str3 : str4;
                    String jSONObject = a.toString();
                    C87412m.m108593f(jSONObject, "kvJson.toString()");
                    we12.f143989i = C46523h2.m51821i(h2Var, str5, jSONObject, false, 4, (Object) null);
                } catch (JSONException unused) {
                }
            }
            Intent intent2 = new Intent();
            C37521f.f99374d.getClass();
            if (C37521f.f99567y4.mo60266n().booleanValue()) {
                BaseFinderFeedLoader baseFinderFeedLoader = mo10348I0().f30175e;
                FinderPoiFeedLoader finderPoiFeedLoader = baseFinderFeedLoader instanceof FinderPoiFeedLoader ? (FinderPoiFeedLoader) baseFinderFeedLoader : null;
                if (finderPoiFeedLoader != null) {
                    m74 m74 = finderPoiFeedLoader.f13766e;
                    intent2.putExtra("key_location", m74 != null ? m74.toByteArray() : null);
                    intent2.putExtra("key_from_type", finderPoiFeedLoader.f13768g);
                    intent2.putExtra("key_from_scene", finderPoiFeedLoader.f13769h);
                    intent2.putExtra("key_tab_id", finderPoiFeedLoader.f13771j);
                }
                str2 = "poitab";
                BaseFeedLoader.saveCache$default(mo10348I0().f30175e, intent2, c6, (C2780c) null, 4, (Object) null);
                Intent intent3 = intent2;
                str = "kvJson.toString()";
                c = 1;
                C7287o.m7447c(intent2, view, 0, false, false, C7267b.Ax0(C7267b.f25328d, getRecyclerView(), ((BaseFinderFeed) i2Var).mo3513o().getId(), mo10348I0().f30175e.getDataListJustForAdapter(), (C32226l) null, 8, (Object) null), 14, (Object) null);
                if (C58784w3.f168295a.mo83915a1()) {
                    ((C15907f) C86312j.m106911c(C15907f.class)).K00(this.f30214d, 34359738368L, (CheckBoxPreference) null, new C9841a(this, intent3), 3);
                } else {
                    ((C58684b) C86312j.m106911c(cls3)).oy0(this.f30214d, intent3);
                }
            } else {
                Intent intent4 = intent2;
                str = "kvJson.toString()";
                str2 = "poitab";
                c = 1;
                BaseFinderFeed baseFinderFeed3 = (BaseFinderFeed) i2Var;
                intent4.putExtra("FEED_ID", baseFinderFeed3.mo3513o().getId());
                intent4.putExtra("FEED_NONCE_ID", baseFinderFeed3.mo3513o().getObjectNonceId());
                intent4.putExtra("TITLE_WORDING", str3);
                intent4.putExtra("GET_REL_SCENE", 17);
                intent4.putExtra("POI_LATITUDE", this.f30402A);
                intent4.putExtra("POI_LONGITUDE", this.f30403B);
                Intent intent5 = intent4;
                C7287o.m7447c(intent4, view, 0, false, false, C7267b.Ax0(C7267b.f25328d, getRecyclerView(), baseFinderFeed3.mo3513o().getId(), mo10348I0().f30175e.getDataListJustForAdapter(), (C32226l) null, 8, (Object) null), 14, (Object) null);
                BaseFeedLoader.saveCacheToIntent$default(mo10348I0().f30175e, intent5, C26236u.m33719b(i2Var), mo10348I0().f30175e.getLastBuffer(), 0, (C2780c) null, 16, (Object) null);
                ((C58684b) C86312j.m106911c(cls3)).Ax0(this.f30214d, intent5);
            }
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f30214d);
            if (f != null) {
                C49712hj1 q35 = f.mo12861q3();
                JSONObject a2 = C15962a.f42858a.mo14614a(this.f30408G, this.f30407F, str2);
                C7335d c5 = C86312j.m106911c(cls);
                C87412m.m108593f(c5, "getService(FinderReportLogic::class.java)");
                long id4 = ((BaseFinderFeed) i2Var).mo3513o().getId();
                RecyclerView recyclerView = this.f30220j.getRecyclerView();
                String jSONObject2 = a2.toString();
                C87412m.m108593f(jSONObject2, str);
                c2 = 0;
                C58417y0.Qx0((C58417y0) c5, q35, id4, recyclerView, 0, C112551y.m153814n(jSONObject2, ",", ";", false), 8, (Object) null);
                C7450q.f25643a.mo8594b(q35, i2Var, 18);
            } else {
                c2 = 0;
            }
            C9732g I0 = mo10348I0();
            if (I0 instanceof C9827k6) {
                C15644c cVar = (C15644c) C39818r.f106831a.mo62444c(this.f30214d).mo62449e(C15644c.class);
                if (((C9827k6) I0).f30379i && cVar != null) {
                    C13604l[] lVarArr = new C13604l[2];
                    lVarArr[c2] = new C13604l("is_half_page_expanded", Integer.valueOf(cVar.f42288I));
                    lVarArr[c] = new C13604l("view_id", "feed_item_in_poi_half_page");
                    ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("view_clk", view2, C90364q0.m113147f(lVarArr), 27051);
                }
            }
        }
    }

    /* renamed from: R0 */
    public void mo9295R0() {
    }

    /* renamed from: S0 */
    public void mo10351S0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        Log.m105924i("Finder.FinderPoiFeedUIContract.PoiFeedViewCallback", "onPoiOnRefreshEnd");
        C11078h hVar = ((C9827k6) mo10348I0()).f30378h;
        if (hVar != null) {
            hVar.mo11215b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r6 = r6.intValue();
     */
    /* renamed from: b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10395b1(android.widget.TextView r4, java.lang.String r5, java.lang.Integer r6, fy3.C32224a<rx3.C13598b0> r7) {
        /*
            r3 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r0 == 0) goto L_0x000f
            if (r4 != 0) goto L_0x0009
            goto L_0x000e
        L_0x0009:
            r5 = 8
            r4.setVisibility(r5)
        L_0x000e:
            return
        L_0x000f:
            r0 = 0
            if (r4 != 0) goto L_0x0013
            goto L_0x0016
        L_0x0013:
            r4.setVisibility(r0)
        L_0x0016:
            if (r4 != 0) goto L_0x0019
            goto L_0x0031
        L_0x0019:
            if (r6 == 0) goto L_0x002d
            int r6 = r6.intValue()
            com.tencent.mm.ui.MMActivity r1 = r3.f30214d
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r5
            java.lang.String r6 = r1.getString(r6, r2)
            if (r6 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r6 = r5
        L_0x002e:
            r4.setText(r6)
        L_0x0031:
            if (r7 == 0) goto L_0x0042
            if (r4 == 0) goto L_0x0042
            if (r5 == 0) goto L_0x0042
            java.lang.CharSequence r6 = r4.getText()
            java.lang.String r6 = r6.toString()
            r3.mo10398f1(r4, r6, r5, r7)
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9840l6.mo10395b1(android.widget.TextView, java.lang.String, java.lang.Integer, fy3.a):void");
    }

    /* renamed from: d1 */
    public final String mo10396d1() {
        C64689rq2 rq22;
        List<E> listOfType = mo10348I0().f30175e.getListOfType(BaseFinderFeed.class);
        if (!(!listOfType.isEmpty()) || (rq22 = (C64689rq2) C110818d0.m150917O(((BaseFinderFeed) listOfType.get(0)).mo3513o().getMediaList(), 0)) == null) {
            return "";
        }
        if (Util.isNullOrNil(rq22.f185288z)) {
            return String.valueOf(rq22.f185267e);
        }
        return rq22.f185267e + rq22.f185288z;
    }

    /* renamed from: e1 */
    public final void mo10397e1(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("poi_name", str);
        jSONObject.put("finderusername", str2);
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "kvJson.toString()");
        String n = C112551y.m153814n(jSONObject2, ",", ";", false);
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f30214d);
        y0Var.Cx0(i, "poi_channelaccount", n, f != null ? f.mo12861q3() : null);
    }

    /* renamed from: f1 */
    public final void mo10398f1(TextView textView, String str, String str2, C32224a<C13598b0> aVar) {
        int E = C112550d0.m153769E(str, str2, 0, false, 6, (Object) null);
        int length = str2.length() + E;
        if (E <= 0 || length > str.length()) {
            E = 0;
            length = str.length();
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new C9842b(aVar, textView), E, length, 33);
        textView.setHighlightColor(textView.getContext().getResources().getColor(17170445));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
    }

    public MMFragmentActivity getActivity() {
        return this.f30214d;
    }

    /* renamed from: k0 */
    public String mo9298k0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        return null;
    }

    /* renamed from: m0 */
    public View mo9299m0() {
        View view = this.f30406E;
        return view == null ? this.f30214d.findViewById(C0966R.C0970id.cjg) : view;
    }
}
