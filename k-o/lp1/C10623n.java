package lp1;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dp1.C7434f1;
import gy3.C87412m;
import ht1.C60206u1;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import up1.C37521f;

/* renamed from: lp1.n */
public class C10623n extends C10605a {

    /* renamed from: q */
    public String f32012q = "";

    /* renamed from: r */
    public Runnable f32013r;

    /* renamed from: s */
    public ViewTreeObserver.OnGlobalLayoutListener f32014s;

    /* renamed from: t */
    public int f32015t;

    /* renamed from: u */
    public final LinkedList<View> f32016u = new LinkedList<>();

    /* renamed from: v */
    public boolean f32017v = true;

    /* renamed from: w */
    public float f32018w = -1.0f;

    /* renamed from: x */
    public final int f32019x = ViewConfiguration.getTouchSlop();

    /* renamed from: lp1.n$a */
    public static final class C10624a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ C10623n f32020d;

        /* renamed from: e */
        public final /* synthetic */ View f32021e;

        public C10624a(C10623n nVar, View view) {
            this.f32020d = nVar;
            this.f32021e = view;
        }

        public final void onGlobalLayout() {
            C10623n nVar = this.f32020d;
            View view = this.f32021e;
            nVar.getClass();
            C87412m.m108594g(view, "layout");
            if (!nVar.f31971e) {
                int height = view.getHeight();
                nVar.f32015t = height;
                if (height == 0) {
                    nVar.f32015t = view.getMeasuredHeight();
                }
                Log.m105924i("FinderShareGuidePopupTipUIC", "bottomHeight=" + nVar.f32015t);
                nVar.mo10885J3(8);
                nVar.mo10868m3((float) nVar.mo10883G3(), 260);
                nVar.f31971e = true;
                C7434f1.f25625a.mo8576b(nVar.getActivity(), 1, "");
                view.removeCallbacks(nVar.f32013r);
                nVar.f32013r = new C10622m(nVar);
                view.postDelayed(nVar.f32013r, nVar.mo10882F3());
            }
            ViewTreeObserver viewTreeObserver = this.f32021e.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.f32020d.f32014s);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10623n(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: F3 */
    public long mo10882F3() {
        C37521f.f99374d.getClass();
        return C37521f.f99566y3.mo60266n().longValue();
    }

    /* renamed from: G3 */
    public final int mo10883G3() {
        int i = this.f32015t;
        return i > 0 ? i : C76577a.m92151b(getContext(), 170);
    }

    /* renamed from: I3 */
    public void mo10884I3() {
        dismiss();
        RecyclerView recyclerView = this.f31972f;
        if (recyclerView != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(1);
            C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/share/FinderShareGuidePopupTipUIC", "onClickGuide", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/share/FinderShareGuidePopupTipUIC", "onClickGuide", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }

    /* renamed from: J3 */
    public final void mo10885J3(int i) {
        for (View view : this.f32016u) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/share/FinderShareGuidePopupTipUIC", "setViewListVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/share/FinderShareGuidePopupTipUIC", "setViewListVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void dismiss() {
        C10605a.m10552d3(this, mo10883G3(), 260, 0.0f, 4, (Object) null);
    }

    /* renamed from: f3 */
    public int mo10862f3() {
        return C0966R.C0970id.f358771h00;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [android.graphics.Paint] */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10864i3(androidx.recyclerview.widget.RecyclerView r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.String r1 = "recyclerView"
            r2 = r20
            gy3.C87412m.m108594g(r2, r1)
            super.mo10864i3(r20)
            up1.f r1 = up1.C37521f.f99374d
            r1.getClass()
            pe1.c<java.lang.Integer> r1 = up1.C37521f.f99575z3
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x0023
            r1 = 1
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            if (r1 == 0) goto L_0x0077
            androidx.recyclerview.widget.RecyclerView r1 = r0.f31972f
            if (r1 == 0) goto L_0x0077
            androidx.recyclerview.widget.RecyclerView$z r1 = r1.mo17023I0(r2)
            if (r1 == 0) goto L_0x0077
            android.view.View r1 = r1.f44854d
            if (r1 != 0) goto L_0x0035
            goto L_0x0077
        L_0x0035:
            r4 = 2131304750(0x7f09212e, float:1.8227651E38)
            android.view.View r1 = r1.findViewById(r4)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x0045
            java.util.LinkedList<android.view.View> r4 = r0.f32016u
            r4.add(r1)
        L_0x0045:
            android.view.ViewGroup r1 = r0.f31974h
            if (r1 == 0) goto L_0x0077
            r4 = 2131305120(0x7f0922a0, float:1.8228402E38)
            android.view.View r4 = r1.findViewById(r4)
            int r5 = r1.getChildCount()
            r6 = 0
        L_0x0055:
            if (r6 >= r5) goto L_0x0077
            android.view.View r7 = r1.getChildAt(r6)
            int r8 = r7.getVisibility()
            if (r8 != 0) goto L_0x0074
            boolean r8 = gy3.C87412m.m108589b(r7, r4)
            if (r8 != 0) goto L_0x0074
            android.view.View r8 = r0.f31970d
            boolean r8 = gy3.C87412m.m108589b(r7, r8)
            if (r8 != 0) goto L_0x0074
            java.util.LinkedList<android.view.View> r8 = r0.f32016u
            r8.add(r7)
        L_0x0074:
            int r6 = r6 + 1
            goto L_0x0055
        L_0x0077:
            android.view.View r1 = r0.f31970d
            r4 = 0
            if (r1 == 0) goto L_0x0086
            r5 = 2131304790(0x7f092156, float:1.8227733E38)
            android.view.View r1 = r1.findViewById(r5)
            android.widget.TextView r1 = (android.widget.TextView) r1
            goto L_0x0087
        L_0x0086:
            r1 = r4
        L_0x0087:
            java.lang.String r5 = r0.f32012q
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x0098
            r5 = 2131826606(0x7f1117ae, float:1.9286101E38)
            java.lang.String r5 = r0.getString(r5)
            r0.f32012q = r5
        L_0x0098:
            if (r1 != 0) goto L_0x009b
            goto L_0x00a0
        L_0x009b:
            java.lang.String r5 = r0.f32012q
            r1.setText(r5)
        L_0x00a0:
            android.view.View r5 = r0.f31970d
            if (r5 == 0) goto L_0x00ae
            r6 = 2131304788(0x7f092154, float:1.8227728E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            goto L_0x00af
        L_0x00ae:
            r5 = r4
        L_0x00af:
            up1.f r6 = up1.C37521f.f99374d
            r6.getClass()
            pe1.c<java.lang.Integer> r6 = up1.C37521f.f99575z3
            java.lang.Object r6 = r6.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 != r3) goto L_0x00c4
            r6 = 1
            goto L_0x00c5
        L_0x00c4:
            r6 = 0
        L_0x00c5:
            r7 = 8
            r8 = 1061997773(0x3f4ccccd, float:0.8)
            if (r6 == 0) goto L_0x01e0
            android.view.View r1 = r0.f31970d
            if (r1 == 0) goto L_0x00e1
            r6 = 2131304789(0x7f092155, float:1.822773E38)
            android.view.View r1 = r1.findViewById(r6)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            if (r1 == 0) goto L_0x00e1
            r6 = 2131755731(0x7f1002d3, float:1.914235E38)
            r1.setImageResource(r6)
        L_0x00e1:
            if (r5 == 0) goto L_0x00e8
            android.text.TextPaint r1 = r5.getPaint()
            goto L_0x00e9
        L_0x00e8:
            r1 = r4
        L_0x00e9:
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r1, r8)
            java.util.List<? extends com.tencent.mm.plugin.finder.model.BaseFinderFeed> r1 = r0.f31976j
            if (r1 == 0) goto L_0x010a
            java.lang.Object r1 = r1.get(r3)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r1
            if (r1 == 0) goto L_0x010a
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
            if (r1 == 0) goto L_0x010a
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            if (r1 == 0) goto L_0x010a
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
            if (r1 == 0) goto L_0x010a
            java.lang.String r4 = r1.description
        L_0x010a:
            if (r4 == 0) goto L_0x0115
            int r1 = r4.length()
            if (r1 != 0) goto L_0x0113
            goto L_0x0115
        L_0x0113:
            r1 = 0
            goto L_0x0116
        L_0x0115:
            r1 = 1
        L_0x0116:
            if (r1 == 0) goto L_0x0121
            if (r5 != 0) goto L_0x011c
            goto L_0x01ef
        L_0x011c:
            r5.setVisibility(r7)
            goto L_0x01ef
        L_0x0121:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r6 = 34
            r1.append(r6)
            r1.append(r4)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            if (r5 == 0) goto L_0x01ef
            android.util.DisplayMetrics r4 = new android.util.DisplayMetrics
            r4.<init>()
            android.app.Activity r6 = r19.getContext()
            android.view.WindowManager r6 = r6.getWindowManager()
            android.view.Display r6 = r6.getDefaultDisplay()
            r6.getMetrics(r4)
            int r4 = r4.widthPixels
            android.app.Activity r6 = r19.getContext()
            r7 = 94
            int r6 = kg3.C76577a.m92151b(r6, r7)
            int r12 = r4 - r6
            android.text.TextPaint r11 = r5.getPaint()
            java.lang.String r4 = "paint"
            gy3.C87412m.m108593f(r11, r4)
            android.text.StaticLayout r6 = new android.text.StaticLayout
            int r10 = r1.length()
            android.text.Layout$Alignment r13 = android.text.Layout.Alignment.ALIGN_NORMAL
            r9 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = 1065353216(0x3f800000, float:1.0)
            r16 = 1
            r7 = r6
            r8 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            int r7 = r6.getLineCount()
            r8 = 2
            if (r7 <= r8) goto L_0x01dc
            android.content.Context r7 = r5.getContext()
            r8 = 2131829876(0x7f112474, float:1.9292733E38)
            java.lang.String r7 = r7.getString(r8)
            java.lang.String r8 = "context.getString(R.stri…r_share_desc_suffix_text)"
            gy3.C87412m.m108593f(r7, r8)
            android.text.TextPaint r8 = r5.getPaint()
            float r8 = r8.measureText(r7)
            android.text.TextPaint r13 = r5.getPaint()
            gy3.C87412m.m108593f(r13, r4)
            int r14 = (int) r8
            android.text.StaticLayout r4 = new android.text.StaticLayout
            int r12 = r7.length()
            android.text.Layout$Alignment r15 = android.text.Layout.Alignment.ALIGN_NORMAL
            r11 = 0
            r16 = 1065353216(0x3f800000, float:1.0)
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 1
            r9 = r4
            r10 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            int r4 = r4.getLineEnd(r2)
            int r3 = r6.getLineEnd(r3)
            int r3 = r3 - r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r1, r2)
            r4.append(r1)
            r4.append(r7)
            java.lang.String r1 = r4.toString()
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r1)
            r5.setText(r2)
            goto L_0x01ef
        L_0x01dc:
            r5.setText(r1)
            goto L_0x01ef
        L_0x01e0:
            if (r1 == 0) goto L_0x01e6
            android.text.TextPaint r4 = r1.getPaint()
        L_0x01e6:
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r4, r8)
            if (r5 != 0) goto L_0x01ec
            goto L_0x01ef
        L_0x01ec:
            r5.setVisibility(r7)
        L_0x01ef:
            android.view.View r1 = r0.f31970d
            if (r1 == 0) goto L_0x0204
            r2 = 2131304791(0x7f092157, float:1.8227735E38)
            android.view.View r1 = r1.findViewById(r2)
            if (r1 == 0) goto L_0x0204
            lp1.l r2 = new lp1.l
            r2.<init>(r0)
            r1.setOnClickListener(r2)
        L_0x0204:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lp1.C10623n.mo10864i3(androidx.recyclerview.widget.RecyclerView):void");
    }

    /* renamed from: k3 */
    public void mo10866k3() {
        super.mo10866k3();
        mo10885J3(0);
    }

    /* renamed from: l3 */
    public void mo10867l3(float f) {
        if (this.f32017v) {
            View view = this.f31970d;
            if (view != null && view.getVisibility() == 0) {
                View view2 = this.f31970d;
                if (view2 != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(4);
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/share/FinderShareGuidePopupTipUIC", "onScrollDown", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/share/FinderShareGuidePopupTipUIC", "onScrollDown", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                dismiss();
                this.f32017v = false;
            }
        }
    }

    /* renamed from: n3 */
    public boolean mo10869n3() {
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        if (C37521f.f99423i4.mo60266n().intValue() != 1 && !((C60206u1) C86312j.m106911c(C60206u1.class)).Cw0()) {
            fVar.getClass();
            if (C37521f.f99141C3.mo60266n().intValue() == 0) {
                fVar.getClass();
                if (C37521f.f99556x3.mo60266n().intValue() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: o3 */
    public void mo10870o3() {
        View view;
        if (!this.f31971e && !mo10865j3() && (view = this.f31970d) != null) {
            this.f32014s = new C10624a(this, view);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f32014s);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        View view = this.f31970d;
        if (view != null) {
            view.removeCallbacks(this.f32013r);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10623n(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }
}
