package com.tencent.p014mm.plugin.finder.live.plugin;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import qg1.C12217a0;
import qj1.C12588oi;
import qk1.C12835r2;
import rx3.C13598b0;
import te3.C64373fs0;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B%\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u001a\u0010\u000b\u001a\u00020\u00068\u0006XD¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/plugin/FinderVisitorRoleChooserPlugin;", "Landroid/widget/RelativeLayout;", "Lte3/fs0;", "aliasInfo", "Lrx3/b0;", "setVisitorRole", "", "d", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderVisitorRoleChooserPlugin */
public final class FinderVisitorRoleChooserPlugin extends RelativeLayout {

    /* renamed from: d */
    public final String f15165d = "FinderLiveVisitorRoleChooserPlugin";

    /* renamed from: e */
    public LiveBottomSheetPanel f15166e;

    /* renamed from: f */
    public View f15167f;

    /* renamed from: g */
    public RecyclerView f15168g;

    /* renamed from: h */
    public C32226l<? super Integer, C13598b0> f15169h;

    /* renamed from: i */
    public Integer f15170i;

    /* renamed from: j */
    public C12835r2 f15171j;

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderVisitorRoleChooserPlugin$a */
    public static final class C3178a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public static final C3178a f15172d = new C3178a();

        public C3178a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderVisitorRoleChooserPlugin$b */
    public static final class C3179b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderVisitorRoleChooserPlugin f15173d;

        public C3179b(FinderVisitorRoleChooserPlugin finderVisitorRoleChooserPlugin) {
            this.f15173d = finderVisitorRoleChooserPlugin;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderVisitorRoleChooserPlugin$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LiveBottomSheetPanel liveBottomSheetPanel = this.f15173d.f15166e;
            if (liveBottomSheetPanel != null) {
                liveBottomSheetPanel.mo78802a();
            }
            FinderVisitorRoleChooserPlugin finderVisitorRoleChooserPlugin = this.f15173d;
            C32226l<? super Integer, C13598b0> lVar = finderVisitorRoleChooserPlugin.f15169h;
            if (lVar != null) {
                int i = C66785b.f191882e.mo90673n0().f131584h;
                finderVisitorRoleChooserPlugin.mo3228b(false);
                lVar.invoke(Integer.valueOf(i));
                finderVisitorRoleChooserPlugin.f15169h = null;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderVisitorRoleChooserPlugin$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderVisitorRoleChooserPlugin$c */
    public static final class C3180c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderVisitorRoleChooserPlugin f15174d;

        public C3180c(FinderVisitorRoleChooserPlugin finderVisitorRoleChooserPlugin) {
            this.f15174d = finderVisitorRoleChooserPlugin;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderVisitorRoleChooserPlugin$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LiveBottomSheetPanel liveBottomSheetPanel = this.f15174d.f15166e;
            if (liveBottomSheetPanel != null) {
                liveBottomSheetPanel.mo78802a();
            }
            FinderVisitorRoleChooserPlugin finderVisitorRoleChooserPlugin = this.f15174d;
            C32226l<? super Integer, C13598b0> lVar = finderVisitorRoleChooserPlugin.f15169h;
            if (lVar != null) {
                finderVisitorRoleChooserPlugin.mo3228b(false);
                lVar.invoke(Integer.valueOf(C66785b.f191882e.mo90673n0().f131584h));
                finderVisitorRoleChooserPlugin.f15169h = null;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderVisitorRoleChooserPlugin$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderVisitorRoleChooserPlugin$d */
    public static final class C3181d extends C87413o implements C32226l<C64373fs0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderVisitorRoleChooserPlugin f15175d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3181d(FinderVisitorRoleChooserPlugin finderVisitorRoleChooserPlugin) {
            super(1);
            this.f15175d = finderVisitorRoleChooserPlugin;
        }

        public Object invoke(Object obj) {
            C64373fs0 fs02 = (C64373fs0) obj;
            C87412m.m108594g(fs02, LocaleUtil.ITALIAN);
            this.f15175d.setVisitorRole(fs02);
            return C13598b0.f38549a;
        }
    }

    public FinderVisitorRoleChooserPlugin(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo3229c();
    }

    /* access modifiers changed from: private */
    public final void setVisitorRole(C64373fs0 fs02) {
        int i = fs02.f183215f;
        C66785b bVar = C66785b.f191882e;
        int i2 = bVar.mo90673n0().f131584h;
        String str = this.f15165d;
        Log.m105924i(str, "setVisitorRole chooseType:" + i + ", curRoleType:" + i2);
        if (i != i2) {
            new C12217a0(bVar.mo90662O5(), i, new C12588oi(this, i)).mo9225i();
        }
        C32226l<? super Integer, C13598b0> lVar = this.f15169h;
        if (lVar != null) {
            mo3228b(false);
            lVar.invoke(Integer.valueOf(i));
            this.f15169h = null;
        }
    }

    /* renamed from: b */
    public final void mo3228b(boolean z) {
        Integer num;
        Activity activity = null;
        if (z) {
            Context context = getContext();
            if (context instanceof Activity) {
                activity = context;
            }
            if (activity != null) {
                Window window = ((Activity) activity).getWindow();
                C87412m.m108593f(window, "it as Activity).window");
                if (C85875k4.m106211z()) {
                    window.setStatusBarColor(Color.parseColor("#05FFFFFF"));
                } else {
                    window.setStatusBarColor(Color.parseColor("#05000000"));
                }
            }
        } else {
            Context context2 = getContext();
            if (context2 instanceof Activity) {
                activity = context2;
            }
            if (activity != null && (num = this.f15170i) != null) {
                int intValue = num.intValue();
                Window window2 = activity.getWindow();
                C87412m.m108593f(window2, "it as Activity).window");
                window2.setStatusBarColor(intValue);
            }
        }
    }

    /* renamed from: c */
    public final void mo3229c() {
        setId(C0966R.C0970id.d7n);
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.akw, this);
        LiveBottomSheetPanel liveBottomSheetPanel = (LiveBottomSheetPanel) inflate.findViewById(C0966R.C0970id.l_5);
        this.f15166e = liveBottomSheetPanel;
        if (liveBottomSheetPanel != null) {
            liveBottomSheetPanel.setTranslationY((float) C75044y4.m89990b(inflate.getContext()).y);
            liveBottomSheetPanel.setOnVisibilityListener(C3178a.f15172d);
        }
        View findViewById = inflate.findViewById(C0966R.C0970id.afr);
        this.f15167f = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new C3179b(this));
        }
        this.f15168g = (RecyclerView) inflate.findViewById(C0966R.C0970id.l_6);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.aq9);
        Integer num = null;
        if (textView != null) {
            textView.setOnClickListener(new C3180c(this));
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = C75044y4.m89991c(textView.getContext());
            }
        }
        C12835r2 r2Var = new C12835r2();
        this.f15171j = r2Var;
        r2Var.f36733d = new C3181d(this);
        RecyclerView recyclerView = this.f15168g;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.setAdapter(this.f15171j);
        }
        Context context = getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        if (context != null) {
            num = Integer.valueOf(((Activity) context).getWindow().getStatusBarColor());
        }
        this.f15170i = num;
    }

    public final String getTAG() {
        return this.f15165d;
    }

    public FinderVisitorRoleChooserPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo3229c();
    }
}
