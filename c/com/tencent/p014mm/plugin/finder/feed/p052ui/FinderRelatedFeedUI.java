package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import er1.C58784w3;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kf1.C9732g;
import kf1.C9753h;
import kf1.C9939q8;
import kf1.C9956r8;
import kotlin.Metadata;
import rx3.C13598b0;
import te3.C50159kp0;
import te3.C50294lp0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderRelatedFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderBaseGridFeedUI;", "Lkf1/r8;", "Lkf1/q8;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderRelatedFeedUI */
public final class FinderRelatedFeedUI extends FinderBaseGridFeedUI<C9956r8, C9939q8> {

    /* renamed from: o */
    public C9939q8 f14748o;

    /* renamed from: p */
    public C9956r8 f14749p;

    /* renamed from: q */
    public BaseFinderFeedLoader f14750q;

    /* renamed from: r */
    public final int f14751r = 2;

    /* renamed from: s */
    public C50159kp0 f14752s;

    /* renamed from: t */
    public C50294lp0 f14753t;

    /* renamed from: u */
    public String f14754u = "";

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderRelatedFeedUI$a */
    public static final class C3038a extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderRelatedFeedUI f14755d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3038a(FinderRelatedFeedUI finderRelatedFeedUI) {
            super(1);
            this.f14755d = finderRelatedFeedUI;
        }

        public Object invoke(Object obj) {
            TextView textView;
            TextView textView2;
            C87412m.m108594g((IResponse) obj, LocaleUtil.ITALIAN);
            C9956r8 r8Var = this.f14755d.f14749p;
            View view = null;
            if (r8Var != null) {
                View loadMoreFooter = r8Var.f30220j.getLoadMoreFooter();
                if (loadMoreFooter != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(loadMoreFooter, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderRelatedFeedUI$initOnCreate$1$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    loadMoreFooter.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(loadMoreFooter, "com/tencent/mm/plugin/finder/feed/ui/FinderRelatedFeedUI$initOnCreate$1$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C9956r8 r8Var2 = this.f14755d.f14749p;
                if (r8Var2 != null) {
                    View loadMoreFooter2 = r8Var2.f30220j.getLoadMoreFooter();
                    if (!(loadMoreFooter2 == null || (textView2 = (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t)) == null)) {
                        textView2.setText(C0966R.string.eat);
                    }
                    C9956r8 r8Var3 = this.f14755d.f14749p;
                    if (r8Var3 != null) {
                        View loadMoreFooter3 = r8Var3.f30220j.getLoadMoreFooter();
                        if (!(loadMoreFooter3 == null || (textView = (TextView) loadMoreFooter3.findViewById(C0966R.C0970id.g2t)) == null)) {
                            textView.setTextColor(this.f14755d.getResources().getColor(C0966R.color.FG_2));
                        }
                        C9956r8 r8Var4 = this.f14755d.f14749p;
                        if (r8Var4 != null) {
                            View loadMoreFooter4 = r8Var4.f30220j.getLoadMoreFooter();
                            TextView textView3 = loadMoreFooter4 != null ? (TextView) loadMoreFooter4.findViewById(C0966R.C0970id.g2t) : null;
                            if (textView3 != null) {
                                textView3.setVisibility(8);
                            }
                            C9956r8 r8Var5 = this.f14755d.f14749p;
                            if (r8Var5 != null) {
                                View loadMoreFooter5 = r8Var5.f30220j.getLoadMoreFooter();
                                if (loadMoreFooter5 != null) {
                                    view = loadMoreFooter5.findViewById(C0966R.C0970id.g2s);
                                }
                                if (view != null) {
                                    C9556a aVar2 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                    aVar2.mo10233c(0);
                                    View view2 = view;
                                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderRelatedFeedUI$initOnCreate$1$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderRelatedFeedUI$initOnCreate$1$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                return C13598b0.f38549a;
                            }
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
                C87412m.m108603p("viewCallback");
                throw null;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        int intExtra = getIntent().getIntExtra("KEY_MORE_ACTION_TYPE", 0);
        if (intExtra != 1) {
            return intExtra != 2 ? 0 : 28;
        }
        return 30;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        int intExtra = getIntent().getIntExtra("KEY_MORE_ACTION_TYPE", 0);
        return (intExtra == 1 || intExtra == 2) ? 3 : 0;
    }

    /* renamed from: N7 */
    public C9732g mo2960N7() {
        C9939q8 q8Var = this.f14748o;
        if (q8Var != null) {
            return q8Var;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: O7 */
    public C9753h mo2961O7() {
        C9956r8 r8Var = this.f14749p;
        if (r8Var != null) {
            return r8Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: P7 */
    public void mo2962P7() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[SYNTHETIC, Splitter:B:10:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0123  */
    /* renamed from: Q7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2963Q7() {
        /*
            r14 = this;
            te3.kp0 r0 = new te3.kp0
            r0.<init>()
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r2 = "SECTION_REQ"
            byte[] r1 = r1.getByteArrayExtra(r2)
            java.lang.String r2 = "safeParser"
            java.lang.String r3 = ""
            r4 = 0
            r5 = 1
            r6 = 0
            if (r1 != 0) goto L_0x001b
        L_0x0019:
            r0 = r6
            goto L_0x0028
        L_0x001b:
            r0.parseFrom(r1)     // Catch:{ Exception -> 0x001f }
            goto L_0x0028
        L_0x001f:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r4] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r3, r1)
            goto L_0x0019
        L_0x0028:
            r14.f14752s = r0
            te3.lp0 r0 = new te3.lp0
            r0.<init>()
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r7 = "SECTION_FIRST_RSP"
            byte[] r1 = r1.getByteArrayExtra(r7)
            if (r1 != 0) goto L_0x003d
        L_0x003b:
            r0 = r6
            goto L_0x004a
        L_0x003d:
            r0.parseFrom(r1)     // Catch:{ Exception -> 0x0041 }
            goto L_0x004a
        L_0x0041:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r4] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r3, r1)
            goto L_0x003b
        L_0x004a:
            r14.f14753t = r0
            te3.kp0 r1 = r14.f14752s
            if (r1 == 0) goto L_0x0052
            if (r0 != 0) goto L_0x008b
        L_0x0052:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "req is null? "
            r0.append(r1)
            te3.kp0 r1 = r14.f14752s
            if (r1 != 0) goto L_0x0062
            r1 = 1
            goto L_0x0063
        L_0x0062:
            r1 = 0
        L_0x0063:
            r0.append(r1)
            java.lang.String r1 = ", rsp is null? "
            r0.append(r1)
            te3.lp0 r1 = r14.f14753t
            if (r1 != 0) goto L_0x0070
            r4 = 1
        L_0x0070:
            r0.append(r4)
            java.lang.String r1 = ", finish"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderRelatedFeedUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r14.finish()
            te3.kp0 r0 = new te3.kp0
            r0.<init>()
            r14.f14752s = r0
        L_0x008b:
            android.content.Intent r0 = r14.getIntent()
            java.lang.String r1 = "UI_TITLE"
            java.lang.String r0 = r0.getStringExtra(r1)
            if (r0 != 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r3 = r0
        L_0x0099:
            r14.f14754u = r3
            r14.setMMTitle((java.lang.String) r3)
            com.tencent.mm.plugin.finder.feed.model.FinderRelatedLoader r0 = new com.tencent.mm.plugin.finder.feed.model.FinderRelatedLoader
            te3.kp0 r1 = r14.f14752s
            gy3.C87412m.m108591d(r1)
            int r8 = r1.f136938g
            int r9 = r14.mo2194I7()
            te3.kp0 r1 = r14.f14752s
            gy3.C87412m.m108591d(r1)
            float r10 = r1.f136939h
            te3.kp0 r1 = r14.f14752s
            gy3.C87412m.m108591d(r1)
            float r11 = r1.f136940i
            te3.kp0 r1 = r14.f14752s
            gy3.C87412m.m108591d(r1)
            te3.kk1 r1 = r1.f136945q
            if (r1 != 0) goto L_0x00c7
            te3.kk1 r1 = new te3.kk1
            r1.<init>()
        L_0x00c7:
            r12 = r1
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r1 = r1.mo62444c(r14)
            java.lang.Class<rs1.s8> r2 = rs1.C13442s8.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            rs1.s8 r1 = (rs1.C13442s8) r1
            te3.hj1 r13 = r1.mo12861q3()
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            android.content.Intent r1 = r14.getIntent()
            r0.initFromCache(r1)
            com.tencent.mm.plugin.finder.feed.ui.FinderRelatedFeedUI$a r1 = new com.tencent.mm.plugin.finder.feed.ui.FinderRelatedFeedUI$a
            r1.<init>(r14)
            r0.f13816h = r1
            r14.f14750q = r0
            kf1.q8 r0 = new kf1.q8
            int r1 = r14.f14751r
            int r2 = r14.mo2194I7()
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r3 = r14.f14750q
            if (r3 == 0) goto L_0x0123
            r0.<init>(r14, r1, r2, r3)
            r14.f14748o = r0
            kf1.r8 r0 = new kf1.r8
            int r9 = r14.f14751r
            int r10 = r14.mo2194I7()
            te3.kp0 r11 = r14.f14752s
            gy3.C87412m.m108591d(r11)
            java.lang.String r12 = r14.f14754u
            r7 = r0
            r8 = r14
            r7.<init>(r8, r9, r10, r11, r12)
            r14.f14749p = r0
            kf1.q8 r1 = r14.f14748o
            if (r1 == 0) goto L_0x011d
            r0.mo10355Y0(r1)
            return
        L_0x011d:
            java.lang.String r0 = "presenter"
            gy3.C87412m.m108603p(r0)
            throw r6
        L_0x0123:
            java.lang.String r0 = "feedLoader"
            gy3.C87412m.m108603p(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderRelatedFeedUI.mo2963Q7():void");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aot;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        RecyclerView recyclerView;
        if (i == 501 && i2 == -1 && intent != null) {
            C9939q8 q8Var = this.f14748o;
            if (q8Var != null) {
                C9753h hVar = q8Var.f30176f;
                if (hVar != null && (recyclerView = hVar.getRecyclerView()) != null) {
                    C58784w3.m68439o1(C58784w3.f168295a, intent, recyclerView, q8Var.f30175e, false, (C32226l) null, 24, (Object) null);
                    return;
                }
                return;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
    }
}
