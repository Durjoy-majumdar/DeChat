package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.FinderHotWordFeedLoader;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import h81.C59774i;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kf1.C9820k3;
import kf1.C9838l3;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import p185kq.C10383h;
import p217oq.C11716d;
import p217oq.C11717f;
import q31.C118148a;
import rs1.C13442s8;
import rx3.C13604l;
import sx3.C90364q0;
import u24.C90599h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderHotWordFeedUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderHotWordFeedUI */
public final class FinderHotWordFeedUI extends MMFinderUI {

    /* renamed from: r */
    public static final /* synthetic */ int f14431r = 0;

    /* renamed from: o */
    public C9820k3 f14432o;

    /* renamed from: p */
    public C9838l3 f14433p;

    /* renamed from: q */
    public FinderHotWordFeedLoader f14434q;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderHotWordFeedUI$a */
    public static final class C2938a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderHotWordFeedUI f14435d;

        public C2938a(FinderHotWordFeedUI finderHotWordFeedUI) {
            this.f14435d = finderHotWordFeedUI;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x005c, code lost:
            r1 = r1.f134671e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onMenuItemClick(android.view.MenuItem r23) {
            /*
                r22 = this;
                r0 = r22
                com.tencent.mm.plugin.finder.feed.ui.FinderHotWordFeedUI r1 = r0.f14435d
                int r2 = com.tencent.p014mm.plugin.finder.feed.p052ui.FinderHotWordFeedUI.f14431r
                r1.finish()
                java.lang.Class<oq.f> r2 = p217oq.C11717f.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                oq.f r2 = (p217oq.C11717f) r2
                java.lang.Class<h81.i> r3 = h81.C59774i.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                h81.i r3 = (h81.C59774i) r3
                java.lang.String r5 = r3.mo84751Wb()
                long r3 = java.lang.System.currentTimeMillis()
                int r6 = p217oq.C11717f.f34295B0
                long r9 = p217oq.C11717f.C11718a.f34298c
                long r7 = r3 - r9
                long r11 = java.lang.System.currentTimeMillis()
                com.tencent.mm.plugin.finder.feed.model.FinderHotWordFeedLoader r3 = r1.f14434q
                java.lang.String r4 = "feedLoader"
                r6 = 0
                if (r3 == 0) goto L_0x0082
                te3.hj1 r3 = r3.getContextObj()
                java.lang.String r13 = ""
                if (r3 == 0) goto L_0x003e
                java.lang.String r3 = r3.f134672f
                if (r3 != 0) goto L_0x003f
            L_0x003e:
                r3 = r13
            L_0x003f:
                java.lang.Class<kq.h> r14 = p185kq.C10383h.class
                di3.d r14 = di3.C86312j.m106911c(r14)
                kq.h r14 = (p185kq.C10383h) r14
                kq.l r14 = r14.mo10693DZ()
                z91.b r14 = (z91.C23462b) r14
                java.lang.String r14 = r14.mo36921e()
                r15 = 1
                com.tencent.mm.plugin.finder.feed.model.FinderHotWordFeedLoader r1 = r1.f14434q
                if (r1 == 0) goto L_0x007e
                te3.hj1 r1 = r1.getContextObj()
                if (r1 == 0) goto L_0x0064
                java.lang.String r1 = r1.f134671e
                if (r1 != 0) goto L_0x0061
                goto L_0x0064
            L_0x0061:
                r19 = r1
                goto L_0x0066
            L_0x0064:
                r19 = r13
            L_0x0066:
                java.lang.String r17 = p217oq.C11716d.f34294a
                u91.c r1 = new u91.c
                r4 = r1
                r16 = 0
                r18 = 0
                r20 = 1280(0x500, float:1.794E-42)
                r21 = 0
                java.lang.String r6 = "FinderHotWordFeedUI"
                r13 = r3
                r4.<init>(r5, r6, r7, r9, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                r2.f50(r1)
                r1 = 1
                return r1
            L_0x007e:
                gy3.C87412m.m108603p(r4)
                throw r6
            L_0x0082:
                gy3.C87412m.m108603p(r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderHotWordFeedUI.C2938a.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderHotWordFeedUI$b */
    public static final class C2939b implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ FinderHotWordFeedUI f14436a;

        public C2939b(FinderHotWordFeedUI finderHotWordFeedUI) {
            this.f14436a = finderHotWordFeedUI;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            Class cls = C10383h.class;
            Intent intent = this.f14436a.getIntent();
            String str2 = null;
            String valueOf = String.valueOf(intent != null ? intent.getStringExtra("key_extra_info") : null);
            if (C90599h.m113511d(valueOf)) {
                valueOf = C11716d.f34294a;
            }
            C13604l[] lVarArr = new C13604l[5];
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            String str3 = "";
            if (Wb == null) {
                Wb = str3;
            }
            lVarArr[0] = new C13604l("behaviour_session_id", Wb);
            String E = ((C10383h) C86312j.m106911c(cls)).mo10696E();
            if (E == null) {
                E = str3;
            }
            lVarArr[1] = new C13604l("finder_context_id", E);
            String S0 = ((C10383h) C86312j.m106911c(cls)).mo10698S0();
            if (S0 != null) {
                str3 = S0;
            }
            lVarArr[2] = new C13604l("finder_tab_context_id", str3);
            lVarArr[3] = new C13604l("extra_info", valueOf);
            Intent intent2 = this.f14436a.getIntent();
            if (intent2 != null) {
                str2 = intent2.getStringExtra("key_enter_source_info");
            }
            lVarArr[4] = new C13604l("enter_source_info", String.valueOf(str2));
            return C90364q0.m113147f(lVarArr);
        }
    }

    static {
        new ConcurrentHashMap();
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 115;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 3;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ad7;
    }

    public void onCreate(Bundle bundle) {
        Class cls = C61212e.class;
        super.onCreate(bundle);
        overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2333y);
        setBackBtn(new C2938a(this));
        setActionbarColor(getResources().getColor(C0966R.color.f2929c));
        ConcurrentHashMap<Long, FinderItem> concurrentHashMap = FinderTopicFeedUI.f14881D;
        FinderTopicFeedUI.f14881D.clear();
        int intExtra = getIntent().getIntExtra("key_topic_type", 10);
        int intExtra2 = getIntent().getIntExtra("key_jump_scene", -1);
        String stringExtra = getIntent().getStringExtra("key_hot_word");
        String stringExtra2 = getIntent().getStringExtra("key_pass_by_info");
        Log.m105924i("Finder.FinderHotWordFeedUI", "type:" + intExtra + ", topic:" + stringExtra + "， passByInfo:" + stringExtra2);
        setMMTitle(stringExtra);
        FinderHotWordFeedLoader finderHotWordFeedLoader = new FinderHotWordFeedLoader(intExtra, ((C13442s8) C39818r.f106831a.mo62444c(this).mo75002a(C13442s8.class)).mo12861q3());
        finderHotWordFeedLoader.initFromCache(getIntent());
        finderHotWordFeedLoader.f13628g = intExtra2;
        finderHotWordFeedLoader.f13629h = stringExtra2;
        this.f14434q = finderHotWordFeedLoader;
        this.f14432o = new C9820k3(this, 2, 115, finderHotWordFeedLoader);
        C9838l3 l3Var = new C9838l3(this, 2, 115, false, 8, (C8480h) null);
        l3Var.f30398v = intExtra;
        l3Var.f30399w = stringExtra;
        this.f14433p = l3Var;
        C9820k3 k3Var = this.f14432o;
        if (k3Var != null) {
            l3Var.mo10355Y0(k3Var);
            C9820k3 k3Var2 = this.f14432o;
            if (k3Var2 != null) {
                C9838l3 l3Var2 = this.f14433p;
                if (l3Var2 != null) {
                    k3Var2.mo2525t(l3Var2);
                    int i = C11717f.f34295B0;
                    C11717f.C11718a.f34298c = System.currentTimeMillis();
                    ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.FinderHotWordFeedUI);
                    ((C61212e) C86312j.m106911c(cls)).mo86179qs(this, C76986a.Finder);
                    ((C61212e) C86312j.m106911c(cls)).mo86136FZ(this, "FinderHotWordFeedUI");
                    ((C61212e) C86312j.m106911c(cls)).mo86148No(this, 168, 24184);
                    ((C61212e) C86312j.m106911c(cls)).E60(this, new C2939b(this));
                    return;
                }
                C87412m.m108603p("viewCallback");
                throw null;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    public void onDestroy() {
        C9820k3 k3Var = this.f14432o;
        if (k3Var != null) {
            k3Var.onDetach();
            super.onDestroy();
            return;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005d, code lost:
        r3 = r3.f134671e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPause() {
        /*
            r22 = this;
            r0 = r22
            super.onPause()
            java.lang.Class<oq.f> r1 = p217oq.C11717f.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            oq.f r1 = (p217oq.C11717f) r1
            java.lang.Class<h81.i> r2 = h81.C59774i.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            h81.i r2 = (h81.C59774i) r2
            java.lang.String r4 = r2.mo84751Wb()
            java.lang.String r5 = "FinderHotWordFeedUI"
            long r2 = java.lang.System.currentTimeMillis()
            int r6 = p217oq.C11717f.f34295B0
            long r6 = p217oq.C11717f.C11718a.f34296a
            long r6 = r2 - r6
            long r8 = p217oq.C11717f.C11718a.f34296a
            long r10 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.finder.feed.model.FinderHotWordFeedLoader r2 = r0.f14434q
            r3 = 0
            java.lang.String r12 = "feedLoader"
            if (r2 == 0) goto L_0x0085
            te3.hj1 r2 = r2.getContextObj()
            java.lang.String r13 = ""
            if (r2 == 0) goto L_0x003e
            java.lang.String r2 = r2.f134672f
            if (r2 != 0) goto L_0x003f
        L_0x003e:
            r2 = r13
        L_0x003f:
            java.lang.Class<kq.h> r14 = p185kq.C10383h.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            kq.h r14 = (p185kq.C10383h) r14
            kq.l r14 = r14.mo10693DZ()
            z91.b r14 = (z91.C23462b) r14
            java.lang.String r14 = r14.mo36921e()
            r16 = 0
            com.tencent.mm.plugin.finder.feed.model.FinderHotWordFeedLoader r15 = r0.f14434q
            if (r15 == 0) goto L_0x0081
            te3.hj1 r3 = r15.getContextObj()
            if (r3 == 0) goto L_0x0065
            java.lang.String r3 = r3.f134671e
            if (r3 != 0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            r18 = r3
            goto L_0x0067
        L_0x0065:
            r18 = r13
        L_0x0067:
            java.lang.String r21 = p217oq.C11716d.f34294a
            u91.c r13 = new u91.c
            r3 = r13
            r15 = 0
            r17 = 0
            r19 = 1280(0x500, float:1.794E-42)
            r20 = 0
            r12 = r2
            r2 = r13
            r13 = r14
            r14 = r16
            r16 = r21
            r3.<init>(r4, r5, r6, r8, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1.f50(r2)
            return
        L_0x0081:
            gy3.C87412m.m108603p(r12)
            throw r3
        L_0x0085:
            gy3.C87412m.m108603p(r12)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderHotWordFeedUI.onPause():void");
    }

    public void onResume() {
        super.onResume();
        int i = C11717f.f34295B0;
        C11717f.C11718a.f34296a = System.currentTimeMillis();
    }
}
