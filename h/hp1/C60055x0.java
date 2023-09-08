package hp1;

import android.animation.Animator;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import dp1.C58417y0;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import je1.C46508a5;
import ob0.C11385n;
import org.json.JSONObject;
import pe3.C89349b;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49712hj1;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: hp1.x0 */
public final class C60055x0 implements C11385n {

    /* renamed from: d */
    public final MMActivity f171388d;

    /* renamed from: e */
    public final FTSEditTextView f171389e;

    /* renamed from: f */
    public final int f171390f;

    /* renamed from: g */
    public final int f171391g;

    /* renamed from: h */
    public final boolean f171392h;

    /* renamed from: i */
    public final boolean f171393i;

    /* renamed from: j */
    public final C60054d1 f171394j;

    /* renamed from: n */
    public ListView f171395n;

    /* renamed from: o */
    public C60060e f171396o;

    /* renamed from: p */
    public C89349b f171397p;

    /* renamed from: q */
    public String f171398q = "";

    /* renamed from: r */
    public String f171399r = "";

    /* renamed from: s */
    public C46508a5 f171400s;

    /* renamed from: t */
    public C60059d f171401t;

    /* renamed from: hp1.x0$a */
    public static final class C60056a implements FTSEditTextView.C45050k {

        /* renamed from: d */
        public final /* synthetic */ C60055x0 f171402d;

        public C60056a(C60055x0 x0Var) {
            this.f171402d = x0Var;
        }

        /* renamed from: b3 */
        public final void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
            Log.m105924i("Finder.SearchSuggestion", "totalText :" + str + " inEditText:" + str2 + " tagList.size:" + list.size() + " textChangeStatus:" + mVar);
            if (Util.isNullOrNil(this.f171402d.f171399r) || !C87412m.m108589b(C112550d0.m153799i0(this.f171402d.f171399r).toString(), str2)) {
                this.f171402d.f171398q = str2;
                C49712hj1 hj12 = null;
                if (Util.isNullOrNil(str2)) {
                    C60055x0 x0Var = this.f171402d;
                    x0Var.f171397p = null;
                    C60060e eVar = x0Var.f171396o;
                    eVar.f171406d = null;
                    eVar.notifyDataSetChanged();
                    this.f171402d.mo84915a();
                    return;
                }
                C86709a0.m107524d().mo123458d(this.f171402d.f171400s);
                C60055x0 x0Var2 = this.f171402d;
                C87412m.m108593f(str2, "inEditText");
                C60055x0 x0Var3 = this.f171402d;
                C89349b bVar = x0Var3.f171397p;
                int i = x0Var3.f171390f;
                C13442s8 f = C13442s8.f38060Q0.mo12873f(x0Var3.f171388d);
                if (f != null) {
                    hj12 = f.mo12861q3();
                }
                x0Var2.f171400s = new C46508a5(str2, bVar, i, hj12);
                C86709a0.m107524d().mo123460f(this.f171402d.f171400s);
                return;
            }
            this.f171402d.mo84916b();
        }
    }

    /* renamed from: hp1.x0$b */
    public static final class C60057b implements AdapterView.OnItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60055x0 f171403d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<String, C13598b0> f171404e;

        public C60057b(C60055x0 x0Var, C32226l<? super String, C13598b0> lVar) {
            this.f171403d = x0Var;
            this.f171404e = lVar;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderSearchSuggestionManager$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C60055x0 x0Var = this.f171403d;
            x0Var.f171399r = x0Var.f171396o.getItem(i).toString();
            Log.m105924i("Finder.SearchSuggestion", "onItemClick : " + i + " query:" + this.f171403d.f171399r);
            C60055x0 x0Var2 = this.f171403d;
            x0Var2.mo84917c(x0Var2.f171391g, 2);
            this.f171404e.invoke(this.f171403d.f171399r);
            C60055x0 x0Var3 = this.f171403d;
            if (C87412m.m108589b(x0Var3.f171399r, x0Var3.f171389e.getEditText().getText().toString())) {
                this.f171403d.mo84916b();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/FinderSearchSuggestionManager$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: hp1.x0$c */
    public static final class C60058c implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C60055x0 f171405d;

        public C60058c(C60055x0 x0Var) {
            this.f171405d = x0Var;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderSearchSuggestionManager$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            this.f171405d.f171388d.hideVKB();
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/search/FinderSearchSuggestionManager$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: hp1.x0$d */
    public interface C60059d {
        /* renamed from: a */
        void mo9549a(int i);
    }

    /* renamed from: hp1.x0$e */
    public final class C60060e extends BaseAdapter {

        /* renamed from: d */
        public List<? extends SpannableString> f171406d;

        public C60060e() {
        }

        public int getCount() {
            List<? extends SpannableString> list = this.f171406d;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public Object getItem(int i) {
            List<? extends SpannableString> list = this.f171406d;
            SpannableString spannableString = list != null ? (SpannableString) list.get(i) : null;
            C87412m.m108591d(spannableString);
            return spannableString;
        }

        public long getItemId(int i) {
            return 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.text.SpannableString} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
            /*
                r4 = this;
                r0 = 0
                if (r6 != 0) goto L_0x0058
                gy3.C87412m.m108591d(r7)
                android.content.Context r6 = r7.getContext()
                android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
                hp1.x0 r1 = hp1.C60055x0.this
                boolean r2 = r1.f171392h
                if (r2 == 0) goto L_0x0020
                boolean r1 = r1.f171393i
                if (r1 == 0) goto L_0x001c
                r1 = 2131494673(0x7f0c0711, float:1.8612861E38)
                goto L_0x002b
            L_0x001c:
                r1 = 2131494672(0x7f0c0710, float:1.861286E38)
                goto L_0x002b
            L_0x0020:
                boolean r1 = r1.f171393i
                if (r1 == 0) goto L_0x0028
                r1 = 2131495510(0x7f0c0a56, float:1.8614559E38)
                goto L_0x002b
            L_0x0028:
                r1 = 2131495509(0x7f0c0a55, float:1.8614557E38)
            L_0x002b:
                android.view.View r6 = r6.inflate(r1, r7, r0)
                hp1.x0$f r7 = new hp1.x0$f
                hp1.x0 r1 = hp1.C60055x0.this
                r7.<init>(r1)
                r1 = 2131300422(0x7f091046, float:1.8218873E38)
                android.view.View r1 = r6.findViewById(r1)
                java.lang.String r2 = "contentView.findViewById(R.id.content_tv)"
                gy3.C87412m.m108593f(r1, r2)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r7.f171408a = r1
                r1 = 2131314711(0x7f094817, float:1.8247855E38)
                android.view.View r1 = r6.findViewById(r1)
                java.lang.String r2 = "contentView.findViewById(R.id.suggestion_iv)"
                gy3.C87412m.m108593f(r1, r2)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r6.setTag(r7)
                goto L_0x0063
            L_0x0058:
                java.lang.Object r7 = r6.getTag()
                java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.FinderSearchSuggestionManager.SuggestionItemHolder"
                gy3.C87412m.m108592e(r7, r1)
                hp1.x0$f r7 = (hp1.C60055x0.C60061f) r7
            L_0x0063:
                android.widget.TextView r7 = r7.f171408a
                r1 = 0
                if (r7 == 0) goto L_0x0084
                java.util.List<? extends android.text.SpannableString> r2 = r4.f171406d
                if (r2 == 0) goto L_0x0080
                int r3 = r2.size()
                if (r5 >= r3) goto L_0x0073
                r0 = 1
            L_0x0073:
                if (r0 == 0) goto L_0x0076
                goto L_0x0077
            L_0x0076:
                r2 = r1
            L_0x0077:
                if (r2 == 0) goto L_0x0080
                java.lang.Object r5 = r2.get(r5)
                r1 = r5
                android.text.SpannableString r1 = (android.text.SpannableString) r1
            L_0x0080:
                r7.setText(r1)
                return r6
            L_0x0084:
                java.lang.String r5 = "contentTV"
                gy3.C87412m.m108603p(r5)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: hp1.C60055x0.C60060e.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: hp1.x0$f */
    public final class C60061f {

        /* renamed from: a */
        public TextView f171408a;

        public C60061f(C60055x0 x0Var) {
        }
    }

    /* renamed from: hp1.x0$g */
    public static final class C60062g implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C60055x0 f171409d;

        public C60062g(C60055x0 x0Var) {
            this.f171409d = x0Var;
        }

        public void onAnimationCancel(Animator animator) {
            Log.m105924i("Finder.SearchSuggestion", "onAnimationCancel");
        }

        public void onAnimationEnd(Animator animator) {
            Log.m105924i("Finder.SearchSuggestion", "onAnimationEnd");
            this.f171409d.f171395n.setVisibility(8);
        }

        public void onAnimationRepeat(Animator animator) {
            Log.m105924i("Finder.SearchSuggestion", "onAnimationRepeat");
        }

        public void onAnimationStart(Animator animator) {
            Log.m105924i("Finder.SearchSuggestion", "onAnimationStart");
        }
    }

    public C60055x0(MMActivity mMActivity, FTSEditTextView fTSEditTextView, int i, int i2, boolean z, boolean z2, C32226l<? super String, C13598b0> lVar) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(fTSEditTextView, "editText");
        C87412m.m108594g(lVar, "onSuggestionClickListener");
        this.f171388d = mMActivity;
        this.f171389e = fTSEditTextView;
        this.f171390f = i;
        this.f171391g = i2;
        this.f171392h = z;
        this.f171393i = z2;
        this.f171394j = new C60054d1(mMActivity, z, z2);
        View findViewById = mMActivity.findViewById(C0966R.C0970id.k_t);
        C87412m.m108593f(findViewById, "activity.findViewById(R.id.suggestion_lv)");
        this.f171395n = (ListView) findViewById;
        C60056a aVar = new C60056a(this);
        if (!fTSEditTextView.f122152E.contains(aVar)) {
            fTSEditTextView.f122152E.add(aVar);
        }
        C60060e eVar = new C60060e();
        this.f171396o = eVar;
        this.f171395n.setAdapter(eVar);
        this.f171395n.setOnItemClickListener(new C60057b(this, lVar));
        this.f171395n.setOnTouchListener(new C60058c(this));
        if (z || z2) {
            this.f171395n.setBackgroundColor(mMActivity.getResources().getColor(C0966R.color.f3493v5));
        }
    }

    /* renamed from: a */
    public final void mo84915a() {
        Log.m105924i("Finder.SearchSuggestion", "dismissSuggestion");
        this.f171395n.animate().cancel();
        this.f171395n.animate().alpha(0.0f).setDuration(300).setListener(new C60062g(this)).start();
        C60059d dVar = this.f171401t;
        if (dVar != null) {
            dVar.mo9549a(8);
        }
    }

    /* renamed from: b */
    public final void mo84916b() {
        Log.m105924i("Finder.SearchSuggestion", "ignore searchSuggestionContent");
        this.f171399r = "";
        this.f171397p = null;
        C86709a0.m107524d().mo123458d(this.f171400s);
        C60060e eVar = this.f171396o;
        eVar.f171406d = null;
        eVar.notifyDataSetChanged();
        mo84915a();
    }

    /* renamed from: c */
    public final void mo84917c(int i, int i2) {
        Class cls = C58417y0.class;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("searchsessionid", ((C58417y0) C86312j.m106911c(cls)).f167351e);
        jSONObject.put("searchscene", i);
        jSONObject.put("keyword", this.f171398q);
        StringBuilder sb = new StringBuilder();
        List<? extends SpannableString> list = this.f171396o.f171406d;
        if (list != null) {
            int i3 = 0;
            for (SpannableString append : list) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(i3);
                sb4.append('#');
                sb4.append(append);
                sb4.append(XVFSFile.SEPARATOR_CHAR);
                sb.append(sb4.toString());
                i3++;
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        String sb5 = sb.toString();
        C87412m.m108593f(sb5, "words.toString()");
        jSONObject.put("expose_suggestword", sb5);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …s())\n        }.toString()");
        String n = C112551y.m153814n(jSONObject2, ",", ";", false);
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f171388d);
        y0Var.Cx0(i2, "suggestword_panel", n, f != null ? f.mo12861q3() : null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0237 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r21, int r22, java.lang.String r23, ob0.C117747y r24) {
        /*
            r20 = this;
            r1 = r20
            r0 = r24
            if (r21 != 0) goto L_0x029e
            if (r22 != 0) goto L_0x029e
            boolean r2 = r0 instanceof je1.C46508a5
            if (r2 == 0) goto L_0x000f
            je1.a5 r0 = (je1.C46508a5) r0
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            if (r0 == 0) goto L_0x0022
            ob0.c r2 = r0.f125295h
            ob0.c$c r2 = r2.f127055a
            pe3.a r2 = r2.f127080a
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchSuggestRequest"
            gy3.C87412m.m108592e(r2, r4)
            te3.ik1 r2 = (te3.C49860ik1) r2
            java.lang.String r2 = r2.f135430e
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "query: "
            r4.append(r5)
            java.lang.String r5 = r1.f171398q
            r4.append(r5)
            java.lang.String r5 = " scene query:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "Finder.SearchSuggestion"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            java.lang.String r4 = r1.f171398q
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x029e
            java.lang.String r4 = r1.f171398q
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r4, (java.lang.String) r2)
            if (r2 == 0) goto L_0x029e
            if (r0 == 0) goto L_0x006b
            ob0.c r0 = r0.f125295h
            ob0.c$d r0 = r0.f127056b
            pe3.a r0 = r0.f127083a
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchSuggestResponse"
            gy3.C87412m.m108592e(r0, r2)
            te3.jk1 r0 = (te3.C50003jk1) r0
            java.util.LinkedList<te3.sd4> r0 = r0.f136168d
            java.lang.String r2 = "this.rr.responseProtoBuf…hSuggestResponse).suggest"
            gy3.C87412m.m108593f(r0, r2)
            goto L_0x006c
        L_0x006b:
            r0 = 0
        L_0x006c:
            hp1.x0$e r2 = r1.f171396o
            if (r0 == 0) goto L_0x0241
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r0.iterator()
        L_0x0079:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x023f
            java.lang.Object r0 = r6.next()
            te3.sd4 r0 = (te3.sd4) r0
            hp1.d1 r7 = r1.f171394j
            r7.getClass()
            java.lang.String r8 = "suggestion"
            gy3.C87412m.m108594g(r0, r8)
            java.lang.String r8 = r0.f141452d
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            java.lang.String r9 = "Finder.SuggestionConverter"
            if (r8 != 0) goto L_0x0228
            java.lang.String r8 = r0.f141453e
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x00a4
            goto L_0x0228
        L_0x00a4:
            int r8 = r7.f171386e
            int r10 = r7.f171387f
            java.lang.String r11 = r0.f141452d
            java.lang.String r12 = ""
            if (r11 != 0) goto L_0x00af
            r11 = r12
        L_0x00af:
            java.lang.String r0 = r0.f141453e
            if (r0 != 0) goto L_0x00b4
            goto L_0x00b5
        L_0x00b4:
            r12 = r0
        L_0x00b5:
            java.lang.String r0 = "; curSpanIndex:"
            java.lang.String r13 = "lastEndIndex < startIndex -- "
            java.util.regex.Pattern r14 = r7.f171383b
            java.util.regex.Matcher r14 = r14.matcher(r12)
            android.text.SpannableString r15 = new android.text.SpannableString
            r15.<init>(r11)
            r23 = r6
            r4 = r7
            r6 = r12
            r3 = 0
            r11 = 0
        L_0x00ca:
            boolean r16 = r14.find()     // Catch:{ Exception -> 0x0210 }
            r24 = r7
            if (r16 == 0) goto L_0x01cb
            int r7 = r14.start()     // Catch:{ Exception -> 0x0210 }
            int r1 = r14.end()     // Catch:{ Exception -> 0x0210 }
            r17 = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0210 }
            r14.<init>()     // Catch:{ Exception -> 0x0210 }
            r14.append(r7)     // Catch:{ Exception -> 0x0210 }
            r18 = r2
            java.lang.String r2 = " - "
            r14.append(r2)     // Catch:{ Exception -> 0x020e }
            r14.append(r1)     // Catch:{ Exception -> 0x020e }
            java.lang.String r2 = r14.toString()     // Catch:{ Exception -> 0x020e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)     // Catch:{ Exception -> 0x020e }
            int r2 = r4.f171384c     // Catch:{ Exception -> 0x020e }
            int r2 = r2 + r7
            int r14 = r4.f171385d     // Catch:{ Exception -> 0x020e }
            int r14 = r1 - r14
            java.lang.String r2 = r6.substring(r2, r14)     // Catch:{ Exception -> 0x020e }
            java.lang.String r14 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r2, r14)     // Catch:{ Exception -> 0x020e }
            java.lang.String r14 = " endSpan:"
            if (r11 != r7) goto L_0x0148
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x020e }
            r7.<init>()     // Catch:{ Exception -> 0x020e }
            r19 = r1
            java.lang.String r1 = "lastEndIndex == startIndex -- "
            r7.append(r1)     // Catch:{ Exception -> 0x020e }
            r7.append(r11)     // Catch:{ Exception -> 0x020e }
            java.lang.String r1 = "; startspan:"
            r7.append(r1)     // Catch:{ Exception -> 0x020e }
            r7.append(r3)     // Catch:{ Exception -> 0x020e }
            r7.append(r14)     // Catch:{ Exception -> 0x020e }
            int r1 = r2.length()     // Catch:{ Exception -> 0x020e }
            int r1 = r1 + r3
            r7.append(r1)     // Catch:{ Exception -> 0x020e }
            java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x020e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)     // Catch:{ Exception -> 0x020e }
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan     // Catch:{ Exception -> 0x020e }
            r1.<init>(r8)     // Catch:{ Exception -> 0x020e }
            int r7 = r2.length()     // Catch:{ Exception -> 0x020e }
            int r7 = r7 + r3
            r11 = 33
            r15.setSpan(r1, r3, r7, r11)     // Catch:{ Exception -> 0x020e }
            int r1 = r2.length()     // Catch:{ Exception -> 0x020e }
            int r3 = r3 + r1
            goto L_0x01b3
        L_0x0148:
            r19 = r1
            if (r11 >= r7) goto L_0x01bf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x020e }
            r1.<init>()     // Catch:{ Exception -> 0x020e }
            r1.append(r13)     // Catch:{ Exception -> 0x020e }
            r1.append(r11)     // Catch:{ Exception -> 0x020e }
            r1.append(r0)     // Catch:{ Exception -> 0x020e }
            r1.append(r3)     // Catch:{ Exception -> 0x020e }
            r1.append(r14)     // Catch:{ Exception -> 0x020e }
            int r4 = r3 + r7
            int r4 = r4 - r11
            r1.append(r4)     // Catch:{ Exception -> 0x020e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x020e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)     // Catch:{ Exception -> 0x020e }
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan     // Catch:{ Exception -> 0x020e }
            r1.<init>(r10)     // Catch:{ Exception -> 0x020e }
            r6 = 33
            r15.setSpan(r1, r3, r4, r6)     // Catch:{ Exception -> 0x020e }
            int r7 = r7 - r11
            int r3 = r3 + r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x020e }
            r1.<init>()     // Catch:{ Exception -> 0x020e }
            r1.append(r13)     // Catch:{ Exception -> 0x020e }
            r1.append(r11)     // Catch:{ Exception -> 0x020e }
            r1.append(r0)     // Catch:{ Exception -> 0x020e }
            r1.append(r3)     // Catch:{ Exception -> 0x020e }
            r1.append(r14)     // Catch:{ Exception -> 0x020e }
            int r4 = r2.length()     // Catch:{ Exception -> 0x020e }
            int r4 = r4 + r3
            r1.append(r4)     // Catch:{ Exception -> 0x020e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x020e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)     // Catch:{ Exception -> 0x020e }
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan     // Catch:{ Exception -> 0x020e }
            r1.<init>(r8)     // Catch:{ Exception -> 0x020e }
            int r4 = r2.length()     // Catch:{ Exception -> 0x020e }
            int r4 = r4 + r3
            r6 = 33
            r15.setSpan(r1, r3, r4, r6)     // Catch:{ Exception -> 0x020e }
            int r1 = r2.length()     // Catch:{ Exception -> 0x020e }
            int r3 = r3 + r1
            r4 = r24
            r6 = r12
        L_0x01b3:
            r1 = r20
            r7 = r24
            r14 = r17
            r2 = r18
            r11 = r19
            goto L_0x00ca
        L_0x01bf:
            r1 = r20
            r4 = r24
            r7 = r4
            r6 = r12
            r14 = r17
            r2 = r18
            goto L_0x00ca
        L_0x01cb:
            r18 = r2
            int r0 = r12.length()     // Catch:{ Exception -> 0x020e }
            if (r11 >= r0) goto L_0x0232
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x020e }
            r0.<init>()     // Catch:{ Exception -> 0x020e }
            java.lang.String r1 = "lastEndIndex < highlightSuggest.length -- "
            r0.append(r1)     // Catch:{ Exception -> 0x020e }
            r0.append(r11)     // Catch:{ Exception -> 0x020e }
            java.lang.String r1 = "; curSpanIndex "
            r0.append(r1)     // Catch:{ Exception -> 0x020e }
            r0.append(r3)     // Catch:{ Exception -> 0x020e }
            java.lang.String r1 = " - endSpan:"
            r0.append(r1)     // Catch:{ Exception -> 0x020e }
            int r1 = r12.length()     // Catch:{ Exception -> 0x020e }
            int r1 = r1 - r11
            int r1 = r1 + r3
            r0.append(r1)     // Catch:{ Exception -> 0x020e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x020e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)     // Catch:{ Exception -> 0x020e }
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan     // Catch:{ Exception -> 0x020e }
            r0.<init>(r10)     // Catch:{ Exception -> 0x020e }
            int r1 = r12.length()     // Catch:{ Exception -> 0x020e }
            int r1 = r1 - r11
            int r1 = r1 + r3
            r2 = 33
            r15.setSpan(r0, r3, r1, r2)     // Catch:{ Exception -> 0x020e }
            goto L_0x0232
        L_0x020e:
            r0 = move-exception
            goto L_0x0213
        L_0x0210:
            r0 = move-exception
            r18 = r2
        L_0x0213:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "illegal analysis:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            goto L_0x0231
        L_0x0228:
            r18 = r2
            r23 = r6
            java.lang.String r0 = "convertToSpan null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
        L_0x0231:
            r15 = 0
        L_0x0232:
            if (r15 == 0) goto L_0x0237
            r5.add(r15)
        L_0x0237:
            r1 = r20
            r6 = r23
            r2 = r18
            goto L_0x0079
        L_0x023f:
            r1 = r2
            goto L_0x0243
        L_0x0241:
            r1 = r2
            r5 = 0
        L_0x0243:
            r1.f171406d = r5
            r1 = r20
            hp1.x0$e r0 = r1.f171396o
            java.util.List<? extends android.text.SpannableString> r0 = r0.f171406d
            r2 = 1
            if (r0 == 0) goto L_0x0294
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0294
            android.widget.ListView r0 = r1.f171395n
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0294
            android.widget.ListView r0 = r1.f171395n
            r3 = 0
            r0.setVisibility(r3)
            android.widget.ListView r0 = r1.f171395n
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
            android.widget.ListView r0 = r1.f171395n
            r3 = 0
            r0.setAlpha(r3)
            android.widget.ListView r0 = r1.f171395n
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r3 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r3)
            r3 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r3)
            r3 = 0
            android.view.ViewPropertyAnimator r0 = r0.setListener(r3)
            r0.start()
            hp1.x0$d r0 = r1.f171401t
            if (r0 == 0) goto L_0x0294
            r3 = 0
            r0.mo9549a(r3)
        L_0x0294:
            hp1.x0$e r0 = r1.f171396o
            r0.notifyDataSetChanged()
            int r0 = r1.f171391g
            r1.mo84917c(r0, r2)
        L_0x029e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hp1.C60055x0.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
