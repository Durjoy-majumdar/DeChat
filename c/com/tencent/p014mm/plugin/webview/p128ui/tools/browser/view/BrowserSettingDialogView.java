package com.tencent.p014mm.plugin.webview.p128ui.tools.browser.view;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C0132m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.p026ui.MaxHeightRecyclerView;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kg3.C76577a;
import kotlin.Metadata;
import m93.C46971i;
import m93.C46973j;
import n93.C47212c;
import p93.C11874a;
import p93.C47441f;
import p93.C47442g;
import p93.C47443h;
import sx3.C110818d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\t\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserSettingDialogView;", "Landroid/widget/RelativeLayout;", "Ln93/c;", "listener", "Lrx3/b0;", "setBrowserSettingDialogClickListener", "", "Lm93/j;", "dataList", "setBrowserList", "", "index", "setSelectedBrowser", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserSettingDialogView */
public final class BrowserSettingDialogView extends RelativeLayout {

    /* renamed from: d */
    public TextView f118728d;

    /* renamed from: e */
    public TextView f118729e;

    /* renamed from: f */
    public TextView f118730f;

    /* renamed from: g */
    public RecyclerView f118731g;

    /* renamed from: h */
    public C43839a f118732h;

    /* renamed from: i */
    public C11874a f118733i;

    /* renamed from: j */
    public C47212c f118734j;

    /* renamed from: n */
    public List<C46973j> f118735n;

    /* renamed from: o */
    public int f118736o;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserSettingDialogView$a */
    public final class C43839a extends RecyclerView.C16613e<C43840b> {

        /* renamed from: d */
        public final Context f118737d;

        /* renamed from: e */
        public final ArrayList<C46973j> f118738e = new ArrayList<>();

        /* renamed from: f */
        public final /* synthetic */ BrowserSettingDialogView f118739f;

        public C43839a(BrowserSettingDialogView browserSettingDialogView, Context context) {
            C87412m.m108594g(context, "context");
            this.f118739f = browserSettingDialogView;
            this.f118737d = context;
        }

        public int getItemCount() {
            return this.f118738e.size();
        }

        public int getItemViewType(int i) {
            C46973j jVar = (C46973j) C110818d0.m150917O(this.f118738e, i);
            if (jVar != null) {
                return jVar.f126285a;
            }
            return 0;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            String str;
            C43840b bVar = (C43840b) zVar;
            C87412m.m108594g(bVar, "viewHolder");
            C46973j jVar = (C46973j) C110818d0.m150917O(this.f118738e, i);
            if (jVar != null) {
                bVar.f118744z.setOnClickListener(new C43843c(this.f118739f, bVar, this));
                bVar.f118742C.setVisibility(this.f118739f.f118736o == i ? 0 : 8);
                int itemViewType = getItemViewType(i);
                if (itemViewType == 1) {
                    bVar.f118743D.setVisibility(8);
                    if (jVar.f126287c == null) {
                        new C46971i(this.f118737d, jVar.f126288d, new C43844d(jVar, this, i)).execute(new ResolveInfo[]{jVar.f126286b});
                    }
                    bVar.f118740A.setImageDrawable(jVar.f126287c);
                    bVar.f118741B.setText(jVar.f126288d);
                    bVar.f118741B.setContentDescription(jVar.f126288d);
                    RelativeLayout relativeLayout = bVar.f118744z;
                    BrowserSettingDialogView browserSettingDialogView = this.f118739f;
                    if (browserSettingDialogView.f118736o == i) {
                        String string = browserSettingDialogView.getResources().getString(C0966R.string.leu);
                        C87412m.m108593f(string, "resources.getString(R.st…owser_item_selected_desc)");
                        str = String.format(string, Arrays.copyOf(new Object[]{jVar.f126288d}, 1));
                        C87412m.m108593f(str, "format(format, *args)");
                    } else {
                        str = jVar.f126288d;
                    }
                    relativeLayout.setContentDescription(str);
                } else if (itemViewType == 2) {
                    BrowserSettingDialogView browserSettingDialogView2 = this.f118739f;
                    bVar.f118743D.setVisibility(0);
                    bVar.f118740A.setVisibility(8);
                    bVar.f118741B.setVisibility(8);
                    RelativeLayout relativeLayout2 = bVar.f118744z;
                    String string2 = browserSettingDialogView2.getResources().getString(C0966R.string.leu);
                    C87412m.m108593f(string2, "resources.getString(R.st…owser_item_selected_desc)");
                    String format = String.format(string2, Arrays.copyOf(new Object[]{browserSettingDialogView2.getResources().getString(C0966R.string.lev)}, 1));
                    C87412m.m108593f(format, "format(format, *args)");
                    relativeLayout2.setContentDescription(format);
                }
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = C85868k2.m106137b(this.f118737d).inflate(C0966R.C0971layout.b44, viewGroup, false);
            C87412m.m108593f(inflate, "view");
            return new C43840b(inflate);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserSettingDialogView$b */
    public static final class C43840b extends RecyclerView.C16631z {

        /* renamed from: A */
        public final ImageView f118740A;

        /* renamed from: B */
        public final TextView f118741B;

        /* renamed from: C */
        public final WeImageView f118742C;

        /* renamed from: D */
        public final TextView f118743D;

        /* renamed from: z */
        public final RelativeLayout f118744z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43840b(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.akh);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.browser_item_container)");
            this.f118744z = (RelativeLayout) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.akg);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.browser_icon)");
            this.f118740A = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.akl);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.browser_title)");
            this.f118741B = (TextView) findViewById3;
            View findViewById4 = view.findViewById(C0966R.C0970id.akk);
            C87412m.m108593f(findViewById4, "itemView.findViewById(R.id.browser_selected_icon)");
            this.f118742C = (WeImageView) findViewById4;
            View findViewById5 = view.findViewById(C0966R.C0970id.akj);
            C87412m.m108593f(findViewById5, "itemView.findViewById(R.id.browser_not_setting)");
            this.f118743D = (TextView) findViewById5;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BrowserSettingDialogView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    public final void setBrowserList(List<C46973j> list) {
        if (list != null) {
            ((ArrayList) this.f118735n).clear();
            ((ArrayList) this.f118735n).add(0, new C46973j(2));
            ((ArrayList) this.f118735n).addAll(list);
            C43839a aVar = this.f118732h;
            if (aVar != null) {
                List<C46973j> list2 = this.f118735n;
                C87412m.m108594g(list2, "dataList");
                aVar.f118738e.clear();
                aVar.f118738e.addAll(list2);
            }
        }
    }

    public final void setBrowserSettingDialogClickListener(C47212c cVar) {
        this.f118734j = cVar;
    }

    public final void setSelectedBrowser(int i) {
        if (i < 0) {
            this.f118736o = 0;
        } else {
            this.f118736o = i + 1;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrowserSettingDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f118735n = new ArrayList();
        this.f118736o = -1;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.b45, this, true);
        View findViewById = inflate.findViewById(C0966R.C0970id.akf);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.browser_dialog_title)");
        this.f118728d = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.aki);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.browser_list)");
        this.f118731g = (RecyclerView) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.ake);
        C87412m.m108593f(findViewById3, "view.findViewById(R.id.b…r_dialog_setting_confirm)");
        this.f118730f = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.akd);
        C87412m.m108593f(findViewById4, "view.findViewById(R.id.b…er_dialog_setting_cancel)");
        this.f118729e = (TextView) findViewById4;
        TextView textView = this.f118728d;
        if (textView != null) {
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            this.f118732h = new C43839a(this, context);
            RecyclerView recyclerView = this.f118731g;
            if (recyclerView != null) {
                recyclerView.setItemAnimator((RecyclerView.C16616j) null);
                recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
                recyclerView.setAdapter(this.f118732h);
                recyclerView.setOverScrollMode(2);
                recyclerView.setVerticalFadingEdgeEnabled(false);
                recyclerView.setNestedScrollingEnabled(false);
                C0132m mVar = new C0132m(context, 1);
                mVar.mo128j(new C47441f(recyclerView.getResources().getColor(C0966R.color.f3312nf)));
                recyclerView.mo17085h0(mVar);
                if (recyclerView instanceof MaxHeightRecyclerView) {
                    MaxHeightRecyclerView maxHeightRecyclerView = (MaxHeightRecyclerView) recyclerView;
                    maxHeightRecyclerView.setMaxHeight((((int) ((((float) C76577a.m92159j(context)) * 3.0f) / 4.0f)) - maxHeightRecyclerView.getResources().getDimensionPixelSize(C0966R.dimen.f3761db)) - maxHeightRecyclerView.getResources().getDimensionPixelSize(C0966R.dimen.f3713c6));
                }
                TextView textView2 = this.f118730f;
                if (textView2 != null) {
                    textView2.setOnClickListener(new C47443h(this));
                    TextView textView3 = this.f118729e;
                    if (textView3 != null) {
                        textView3.setOnClickListener(new C47442g(this));
                    } else {
                        C87412m.m108603p("cancelButton");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("confirmButton");
                    throw null;
                }
            } else {
                C87412m.m108603p("browserRecyclerView");
                throw null;
            }
        } else {
            C87412m.m108603p("dialogTitle");
            throw null;
        }
    }
}
