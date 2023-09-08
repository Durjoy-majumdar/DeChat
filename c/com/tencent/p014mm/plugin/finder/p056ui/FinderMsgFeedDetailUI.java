package com.tencent.p014mm.plugin.finder.p056ui;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.feed.FinderFeedDetailUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderBaseFeedUI;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import di3.C86312j;
import er1.C58784w3;
import gy3.C87412m;
import java.util.Set;
import kf1.C9640c;
import kf1.C9707f;
import kf1.C9713f2;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import sx3.C110818d0;
import ts1.C14078c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderMsgFeedDetailUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderBaseFeedUI;", "Lkf1/f2;", "Lcom/tencent/mm/plugin/finder/feed/FinderFeedDetailUIContract$Presenter;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI */
public final class FinderMsgFeedDetailUI extends FinderBaseFeedUI<C9713f2, FinderFeedDetailUIContract$Presenter> {

    /* renamed from: A */
    public boolean f16988A;

    /* renamed from: p */
    public String f16989p = "Finder.FinderMsgFeedDetailUI";

    /* renamed from: q */
    public FinderFeedDetailUIContract$Presenter f16990q;

    /* renamed from: r */
    public C9713f2 f16991r;

    /* renamed from: s */
    public long f16992s;

    /* renamed from: t */
    public int f16993t;

    /* renamed from: u */
    public boolean f16994u;

    /* renamed from: v */
    public long f16995v = -1;

    /* renamed from: w */
    public int f16996w = -1;

    /* renamed from: x */
    public boolean f16997x;

    /* renamed from: y */
    public BaseFinderFeed f16998y;

    /* renamed from: z */
    public final FinderMsgFeedDetailUI$feedDeleteListener$1 f16999z = new FinderMsgFeedDetailUI$feedDeleteListener$1(this);

    /* renamed from: I7 */
    public int mo2194I7() {
        int intExtra = getIntent().getIntExtra("from_scene", 2);
        C58784w3.f168295a.getClass();
        boolean z = true;
        if (intExtra != 1) {
            z = false;
        }
        return z ? 7 : 5;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: N7 */
    public C9640c mo2955N7() {
        FinderFeedDetailUIContract$Presenter finderFeedDetailUIContract$Presenter = this.f16990q;
        if (finderFeedDetailUIContract$Presenter != null) {
            return finderFeedDetailUIContract$Presenter;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: O7 */
    public C9707f mo2956O7() {
        C9713f2 f2Var = this.f16991r;
        if (f2Var != null) {
            return f2Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: P7 */
    public void mo2957P7() {
        setMMTitle((int) C0966R.string.esc);
        WeImageView weImageView = (WeImageView) findViewById(C0966R.C0970id.a2z);
        if (weImageView != null) {
            weImageView.setIconColor(getResources().getColor(C0966R.color.f3583yg));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ee  */
    /* renamed from: Q7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2958Q7() {
        /*
            r14 = this;
            android.content.Intent r0 = r14.getIntent()
            java.lang.String r1 = "feed_username"
            r0.getStringExtra(r1)
            android.content.Intent r0 = r14.getIntent()
            r1 = -1
            java.lang.String r3 = "feed_object_id"
            long r3 = r0.getLongExtra(r3, r1)
            r14.f16992s = r3
            android.content.Intent r0 = r14.getIntent()
            java.lang.String r3 = "feed_object_nonceid"
            r0.getStringExtra(r3)
            android.content.Intent r0 = r14.getIntent()
            r3 = 2
            java.lang.String r4 = "from_scene"
            int r0 = r0.getIntExtra(r4, r3)
            r14.f16993t = r0
            android.content.Intent r0 = r14.getIntent()
            java.lang.String r3 = "feed_is_self"
            r4 = 0
            boolean r0 = r0.getBooleanExtra(r3, r4)
            r14.f16994u = r0
            android.content.Intent r0 = r14.getIntent()
            java.lang.String r3 = "mention_id"
            long r0 = r0.getLongExtra(r3, r1)
            r14.f16995v = r0
            android.content.Intent r0 = r14.getIntent()
            r1 = -1
            java.lang.String r2 = "mention_create_time"
            int r0 = r0.getIntExtra(r2, r1)
            r14.f16996w = r0
            long r0 = r14.f16992s
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x0065
            java.lang.String r0 = r14.f16989p
            java.lang.String r1 = "objectId 0, finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            r14.finish()
        L_0x0065:
            android.content.Intent r0 = r14.getIntent()
            java.lang.String r1 = "from_comment_ui"
            boolean r0 = r0.getBooleanExtra(r1, r4)
            r14.f16997x = r0
            long r0 = r14.f16995v
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x00a4
            wp1.h$a r2 = wp1.C66169h.f190180a
            int r3 = r14.f16996w
            int r6 = r14.f16993t
            xh.va r0 = r2.mo90244c(r0, r3, r6)
            if (r0 == 0) goto L_0x008c
            int r0 = r0.field_type
            r1 = 15
            if (r0 != r1) goto L_0x008c
            r0 = 1
            goto L_0x008d
        L_0x008c:
            r0 = 0
        L_0x008d:
            if (r0 == 0) goto L_0x00a4
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99477o7
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r5) goto L_0x00a4
            r11 = 1
            goto L_0x00a5
        L_0x00a4:
            r11 = 0
        L_0x00a5:
            com.tencent.mm.plugin.finder.feed.FinderFeedDetailUIContract$Presenter r2 = new com.tencent.mm.plugin.finder.feed.FinderFeedDetailUIContract$Presenter
            int r7 = r14.f16993t
            r9 = 0
            boolean r10 = r14.f16994u
            r12 = 4
            r13 = 0
            r6 = r2
            r8 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r14.f16990q = r2
            kf1.f2 r6 = new kf1.f2
            int r3 = r14.f16993t
            int r4 = r14.mo2194I7()
            r5 = 0
            r0 = r6
            r1 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r14.f16991r = r6
            vp1.e r0 = vp1.C65834e.f189316a
            long r1 = r14.f16992s
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo89871e(r1)
            if (r0 == 0) goto L_0x00ea
            wp1.f$a r1 = wp1.C15585f.f42211a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r1.mo14348k(r0)
            r14.f16998y = r0
            com.tencent.mm.plugin.finder.feed.FinderFeedDetailUIContract$Presenter r1 = r14.f16990q
            if (r1 == 0) goto L_0x00e3
            java.util.ArrayList<cm1.i2> r1 = r1.f13027t
            if (r1 == 0) goto L_0x00ea
            r1.add(r0)
            goto L_0x00ea
        L_0x00e3:
            java.lang.String r0 = "presenter"
            gy3.C87412m.m108603p(r0)
            r0 = 0
            throw r0
        L_0x00ea:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r14.f16998y
            if (r0 != 0) goto L_0x00f8
            java.lang.String r0 = r14.f16989p
            java.lang.String r1 = "feed null, finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            r14.finish()
        L_0x00f8:
            com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI$feedDeleteListener$1 r0 = r14.f16999z
            r0.alive()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderMsgFeedDetailUI.mo2958Q7():void");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.am4;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        Set<Class<? extends UIComponent>> C0 = C110818d0.m150902C0(super.importUIComponents());
        C0.add(C14078c.class);
        return C0;
    }

    public void onBackPressed() {
        C9713f2 f2Var = this.f16991r;
        if (f2Var == null) {
            C87412m.m108603p("viewCallback");
            throw null;
        } else if (f2Var.mo10314y().mo82541i()) {
            C9713f2 f2Var2 = this.f16991r;
            if (f2Var2 != null) {
                f2Var2.mo10314y().mo4615l();
            } else {
                C87412m.m108603p("viewCallback");
                throw null;
            }
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FinderMsgFeedDetailUI).mo86179qs(this, C76986a.Finder);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f16999z.dead();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0078, code lost:
        if (r11 != false) goto L_0x00ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r14 = this;
            super.onResume()
            boolean r0 = r14.f16988A
            if (r0 != 0) goto L_0x00e2
            boolean r0 = r14.f16997x
            if (r0 == 0) goto L_0x000d
            goto L_0x00e2
        L_0x000d:
            r0 = 1
            r14.f16988A = r0
            kf1.f2 r1 = r14.f16991r
            java.lang.String r2 = "viewCallback"
            r3 = 0
            if (r1 == 0) goto L_0x00de
            com.tencent.mm.plugin.finder.view.FinderLikeDrawer r1 = r1.mo10314y()
            ur1.f r1 = r1.getBuilder()
            if (r1 == 0) goto L_0x0025
            kf1.xb r1 = r1.f39931d
            goto L_0x0026
        L_0x0025:
            r1 = r3
        L_0x0026:
            boolean r4 = r1 instanceof com.tencent.p014mm.plugin.finder.feed.FinderLikeDrawerPresenter
            if (r4 == 0) goto L_0x002f
            r5 = r1
            com.tencent.mm.plugin.finder.feed.FinderLikeDrawerPresenter r5 = (com.tencent.p014mm.plugin.finder.feed.FinderLikeDrawerPresenter) r5
            r5.f13115v = r0
        L_0x002f:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = r14.f16998y
            if (r5 == 0) goto L_0x00dd
            long r5 = r14.f16995v
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x00d1
            wp1.h$a r9 = wp1.C66169h.f190180a
            int r10 = r14.f16996w
            int r11 = r14.f16993t
            xh.va r5 = r9.mo90244c(r5, r10, r11)
            if (r5 == 0) goto L_0x00dd
            int r6 = r5.field_type
            r9 = 4
            r10 = 3
            r11 = 0
            if (r6 != r9) goto L_0x0061
            te3.ne1 r12 = r5.field_notify
            if (r12 == 0) goto L_0x0058
            int r12 = r12.f184468f
            if (r12 != r10) goto L_0x0058
            r12 = 1
            goto L_0x0059
        L_0x0058:
            r12 = 0
        L_0x0059:
            if (r12 == 0) goto L_0x0061
            if (r4 == 0) goto L_0x0061
            com.tencent.mm.plugin.finder.feed.FinderLikeDrawerPresenter r1 = (com.tencent.p014mm.plugin.finder.feed.FinderLikeDrawerPresenter) r1
            r1.f13114u = r0
        L_0x0061:
            if (r6 == r10) goto L_0x00c2
            long r12 = r5.field_commentId
            int r1 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x006a
            goto L_0x00c2
        L_0x006a:
            r1 = 2
            if (r6 == r1) goto L_0x00ad
            if (r6 != r9) goto L_0x007b
            te3.ne1 r1 = r5.field_notify
            if (r1 == 0) goto L_0x0078
            int r1 = r1.f184468f
            if (r1 != r10) goto L_0x0078
            r11 = 1
        L_0x0078:
            if (r11 == 0) goto L_0x007b
            goto L_0x00ad
        L_0x007b:
            r1 = 15
            if (r6 != r1) goto L_0x00dd
            up1.f r1 = up1.C37521f.f99374d
            r1.getClass()
            pe1.c<java.lang.Integer> r1 = up1.C37521f.f99477o7
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != r0) goto L_0x00dd
            kf1.f2 r0 = r14.f16991r
            if (r0 == 0) goto L_0x00a9
            com.tencent.mm.plugin.finder.view.FinderFavDrawer r0 = r0.f30127i
            if (r0 == 0) goto L_0x00a3
            com.tencent.mm.plugin.finder.ui.y1 r1 = new com.tencent.mm.plugin.finder.ui.y1
            r1.<init>(r14)
            r0.post(r1)
            goto L_0x00dd
        L_0x00a3:
            java.lang.String r0 = "favDrawer"
            gy3.C87412m.m108603p(r0)
            throw r3
        L_0x00a9:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x00ad:
            kf1.f2 r0 = r14.f16991r
            if (r0 == 0) goto L_0x00be
            com.tencent.mm.plugin.finder.view.FinderLikeDrawer r0 = r0.mo10314y()
            com.tencent.mm.plugin.finder.ui.z1 r1 = new com.tencent.mm.plugin.finder.ui.z1
            r1.<init>(r14)
            r0.post(r1)
            goto L_0x00dd
        L_0x00be:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x00c2:
            long r0 = r5.field_commentId
            android.view.View r2 = r14.getContentView()
            com.tencent.mm.plugin.finder.ui.a2 r3 = new com.tencent.mm.plugin.finder.ui.a2
            r3.<init>(r14, r0)
            r2.post(r3)
            goto L_0x00dd
        L_0x00d1:
            android.view.View r0 = r14.getContentView()
            com.tencent.mm.plugin.finder.ui.a2 r1 = new com.tencent.mm.plugin.finder.ui.a2
            r1.<init>(r14, r7)
            r0.post(r1)
        L_0x00dd:
            return
        L_0x00de:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderMsgFeedDetailUI.onResume():void");
    }
}
