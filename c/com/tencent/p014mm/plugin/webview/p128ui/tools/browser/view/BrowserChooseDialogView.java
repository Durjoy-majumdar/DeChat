package com.tencent.p014mm.plugin.webview.p128ui.tools.browser.view;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import m93.C46971i;
import m93.C46973j;
import n93.C47210a;
import p93.C11874a;
import sx3.C110818d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\t\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u0019"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserChooseDialogView;", "Landroid/widget/RelativeLayout;", "Ln93/a;", "listener", "Lrx3/b0;", "setBrowserClickListener", "", "Lm93/j;", "dataList", "setBrowserList", "", "show", "setShowBrowserSettingEntry", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "c", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView */
public final class BrowserChooseDialogView extends RelativeLayout {

    /* renamed from: d */
    public TextView f118713d;

    /* renamed from: e */
    public ImageView f118714e;

    /* renamed from: f */
    public ImageView f118715f;

    /* renamed from: g */
    public RecyclerView f118716g;

    /* renamed from: h */
    public int f118717h;

    /* renamed from: i */
    public C43837a f118718i;

    /* renamed from: j */
    public C11874a f118719j;

    /* renamed from: n */
    public C47210a f118720n;

    /* renamed from: o */
    public boolean f118721o;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView$b */
    public static final class C6152b extends RecyclerView.C0129l {

        /* renamed from: d */
        public final int f22607d;

        /* renamed from: e */
        public final int f22608e;

        /* renamed from: f */
        public final int f22609f;

        public C6152b(Context context) {
            C87412m.m108594g(context, "context");
            this.f22607d = context.getResources().getDimensionPixelSize(C0966R.dimen.f3743cv);
            this.f22608e = context.getResources().getDimensionPixelSize(C0966R.dimen.f3743cv);
            this.f22609f = context.getResources().getDimensionPixelSize(C0966R.dimen.f3761db);
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            rect.top = this.f22607d;
            int N0 = recyclerView.mo17029N0(view);
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            if (N0 / 4 != (itemCount - 1) / 4) {
                return;
            }
            if (itemCount <= 4) {
                rect.bottom = this.f22609f;
            } else {
                rect.bottom = this.f22608e;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView$a */
    public final class C43837a extends RecyclerView.C16613e<C43838c> {

        /* renamed from: d */
        public final Context f118722d;

        /* renamed from: e */
        public final ArrayList<C46973j> f118723e = new ArrayList<>();

        /* renamed from: f */
        public final /* synthetic */ BrowserChooseDialogView f118724f;

        public C43837a(BrowserChooseDialogView browserChooseDialogView, Context context) {
            C87412m.m108594g(context, "context");
            this.f118724f = browserChooseDialogView;
            this.f118722d = context;
        }

        public int getItemCount() {
            return this.f118723e.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C43838c cVar = (C43838c) zVar;
            C87412m.m108594g(cVar, "viewHolder");
            C46973j jVar = (C46973j) C110818d0.m150917O(this.f118723e, i);
            if (jVar != null) {
                if (jVar.f126287c == null) {
                    new C46971i(this.f118722d, jVar.f126288d, new C43841a(jVar, this, i)).execute(new ResolveInfo[]{jVar.f126286b});
                }
                cVar.f118725A.setImageDrawable(jVar.f126287c);
                cVar.f118725A.setOnClickListener(new C43842b(jVar, this.f118724f, i));
                cVar.f118726B.setText(jVar.f126288d);
                cVar.f118727z.setContentDescription(jVar.f126288d);
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = C85868k2.m106137b(this.f118722d).inflate(C0966R.C0971layout.f359846b42, viewGroup, false);
            C87412m.m108593f(inflate, "view");
            return new C43838c(inflate);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView$c */
    public static final class C43838c extends RecyclerView.C16631z {

        /* renamed from: A */
        public final ImageView f118725A;

        /* renamed from: B */
        public final TextView f118726B;

        /* renamed from: z */
        public final LinearLayout f118727z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43838c(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.akh);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.browser_item_container)");
            this.f118727z = (LinearLayout) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.akg);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.browser_icon)");
            this.f118725A = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.akl);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.browser_title)");
            this.f118726B = (TextView) findViewById3;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BrowserChooseDialogView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    public final void setBrowserClickListener(C47210a aVar) {
        this.f118720n = aVar;
    }

    public final void setBrowserList(List<C46973j> list) {
        C43837a aVar;
        if (list != null && (aVar = this.f118718i) != null) {
            aVar.f118723e.clear();
            aVar.f118723e.addAll(list);
        }
    }

    public final void setShowBrowserSettingEntry(boolean z) {
        if (this.f118721o != z) {
            this.f118721o = z;
            int i = 0;
            Log.m105925i("MicroMsg.BrowserChooseDialogView", "updateBrowserSettingEntry %s", Boolean.valueOf(z));
            ImageView imageView = this.f118715f;
            if (imageView != null) {
                if (!this.f118721o) {
                    i = 8;
                }
                imageView.setVisibility(i);
                return;
            }
            C87412m.m108603p("moreButton");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x008a, code lost:
        r8 = r8.getDisplayMetrics();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BrowserChooseDialogView(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r6, r0)
            r5.<init>(r6, r7, r8)
            r7 = 1
            r5.f118721o = r7
            r5.setFitsSystemWindows(r7)
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r6)
            r0 = 2131496123(0x7f0c0cbb, float:1.8615802E38)
            android.view.View r8 = r8.inflate(r0, r5, r7)
            r0 = 2131298377(0x7f090849, float:1.8214725E38)
            android.view.View r0 = r8.findViewById(r0)
            java.lang.String r1 = "view.findViewById(R.id.browser_dialog_title)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.f118713d = r0
            r0 = 2131298371(0x7f090843, float:1.8214713E38)
            android.view.View r0 = r8.findViewById(r0)
            java.lang.String r1 = "view.findViewById(R.id.browser_dialog_close_btn)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.f118714e = r0
            r0 = 2131298374(0x7f090846, float:1.821472E38)
            android.view.View r0 = r8.findViewById(r0)
            java.lang.String r1 = "view.findViewById(R.id.browser_dialog_more_btn)"
            gy3.C87412m.m108593f(r0, r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.f118715f = r0
            r0 = 2131298380(0x7f09084c, float:1.8214732E38)
            android.view.View r0 = r8.findViewById(r0)
            java.lang.String r1 = "view.findViewById(R.id.browser_list)"
            gy3.C87412m.m108593f(r0, r1)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r5.f118716g = r0
            android.widget.TextView r0 = r5.f118713d
            r1 = 0
            if (r0 == 0) goto L_0x014d
            android.text.TextPaint r0 = r0.getPaint()
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r0, r2)
            android.widget.ImageView r0 = r5.f118714e
            if (r0 == 0) goto L_0x0147
            p93.c r2 = new p93.c
            r2.<init>(r5, r8)
            r0.setOnClickListener(r2)
            android.widget.ImageView r0 = r5.f118715f
            if (r0 == 0) goto L_0x0141
            p93.d r2 = new p93.d
            r2.<init>(r5, r8)
            r0.setOnClickListener(r2)
            android.content.res.Resources r8 = r5.getResources()
            if (r8 == 0) goto L_0x0093
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            if (r8 == 0) goto L_0x0093
            int r8 = r8.widthPixels
            goto L_0x009b
        L_0x0093:
            android.content.Context r8 = r5.getContext()
            int r8 = kg3.C76577a.m92145A(r8)
        L_0x009b:
            android.content.res.Resources r0 = r5.getResources()
            r2 = 2131167417(0x7f0708b9, float:1.7949107E38)
            int r0 = r0.getDimensionPixelSize(r2)
            r2 = 4
            int r0 = r0 * 4
            int r0 = r8 - r0
            int r0 = r0 / 5
            r5.f118717h = r0
            r0 = 2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r4 = 0
            r3[r4] = r8
            int r8 = r5.f118717h
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3[r7] = r8
            java.lang.String r7 = "MicroMsg.BrowserChooseDialogView"
            java.lang.String r8 = "alvinluo configItemPadding width: %d, mItemPadding: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r3)
            com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView$a r7 = new com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView$a
            r7.<init>(r5, r6)
            r5.f118718i = r7
            androidx.recyclerview.widget.RecyclerView r7 = r5.f118716g
            java.lang.String r8 = "browserRecyclerView"
            if (r7 == 0) goto L_0x013d
            r7.setItemAnimator(r1)
            androidx.recyclerview.widget.GridLayoutManager r3 = new androidx.recyclerview.widget.GridLayoutManager
            r3.<init>(r6, r2)
            r7.setLayoutManager(r3)
            com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView$a r2 = r5.f118718i
            r7.setAdapter(r2)
            com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView$b r2 = new com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView$b
            r2.<init>(r6)
            r7.mo17085h0(r2)
            r7.setOverScrollMode(r0)
            r7.setVerticalFadingEdgeEnabled(r4)
            r7.setNestedScrollingEnabled(r4)
            boolean r2 = r7 instanceof com.tencent.p014mm.plugin.appbrand.p026ui.MaxHeightRecyclerView
            if (r2 == 0) goto L_0x0121
            com.tencent.mm.plugin.appbrand.ui.MaxHeightRecyclerView r7 = (com.tencent.p014mm.plugin.appbrand.p026ui.MaxHeightRecyclerView) r7
            int r6 = kg3.C76577a.m92159j(r6)
            float r6 = (float) r6
            r2 = 1077936128(0x40400000, float:3.0)
            float r6 = r6 * r2
            r2 = 1082130432(0x40800000, float:4.0)
            float r6 = r6 / r2
            int r6 = (int) r6
            android.content.res.Resources r2 = r7.getResources()
            r3 = 2131165363(0x7f0700b3, float:1.794494E38)
            int r2 = r2.getDimensionPixelSize(r3)
            int r6 = r6 - r2
            android.content.res.Resources r2 = r7.getResources()
            int r2 = r2.getDimensionPixelSize(r3)
            int r6 = r6 - r2
            r7.setMaxHeight(r6)
        L_0x0121:
            androidx.recyclerview.widget.RecyclerView r6 = r5.f118716g
            if (r6 == 0) goto L_0x0139
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            if (r6 == 0) goto L_0x0138
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L_0x0138
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r7 = r5.f118717h
            int r7 = r7 / r0
            r6.leftMargin = r7
            r6.rightMargin = r7
        L_0x0138:
            return
        L_0x0139:
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x013d:
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x0141:
            java.lang.String r6 = "moreButton"
            gy3.C87412m.m108603p(r6)
            throw r1
        L_0x0147:
            java.lang.String r6 = "closeButton"
            gy3.C87412m.m108603p(r6)
            throw r1
        L_0x014d:
            java.lang.String r6 = "dialogTitle"
            gy3.C87412m.m108603p(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.browser.view.BrowserChooseDialogView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
