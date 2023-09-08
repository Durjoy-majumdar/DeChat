package com.tencent.p014mm.plugin.sns.p106ui.previewimageview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.C95738b1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96142a;
import com.tencent.p014mm.plugin.sns.p106ui.previewimageview.DynamicGridView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;

/* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.b */
public class C96148b implements C95738b1 {

    /* renamed from: d */
    public Context f280877d;

    /* renamed from: e */
    public C96142a f280878e;

    /* renamed from: f */
    public DynamicGridView f280879f;

    /* renamed from: g */
    public C95738b1.C95739a f280880g;

    /* renamed from: h */
    public float f280881h;

    /* renamed from: i */
    public View f280882i;

    /* renamed from: j */
    public ImageView f280883j;

    /* renamed from: n */
    public TextView f280884n;

    /* renamed from: o */
    public View f280885o;

    /* renamed from: p */
    public View f280886p;

    /* renamed from: q */
    public View f280887q;

    /* renamed from: r */
    public int f280888r;

    /* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.b$a */
    public class C96149a implements DynamicGridView.C96138g {

        /* renamed from: a */
        public final /* synthetic */ DynamicGridView f280889a;

        public C96149a(DynamicGridView dynamicGridView) {
            this.f280889a = dynamicGridView;
        }

        /* renamed from: a */
        public boolean mo133770a(Rect rect) {
            SnsMethodCalculate.markStartTimeMs("isIntersect", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1");
            C96148b bVar = C96148b.this;
            SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("checkIntersectDelArea", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            boolean z = false;
            if (rect == null) {
                SnsMethodCalculate.markEndTimeMs("checkIntersectDelArea", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            } else {
                Rect m = C61926c.m72688m(bVar.f280882i);
                boolean intersect = m.intersect(rect);
                Log.m105919d("DynamicGrid", "checkIntersectDelArea toDel:%b, visible del area: %s, imgView: %s", Boolean.valueOf(intersect), m, rect);
                SnsMethodCalculate.markEndTimeMs("checkIntersectDelArea", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                z = intersect;
            }
            SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            SnsMethodCalculate.markEndTimeMs("isIntersect", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1");
            return z;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.b$b */
    public class C96150b implements AdapterView.OnItemLongClickListener {
        public C96150b(C96148b bVar) {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            SnsMethodCalculate.markStartTimeMs("onItemLongClick", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$2");
            SnsMethodCalculate.markEndTimeMs("onItemLongClick", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$2");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.b$c */
    public class C96151c implements AdapterView.OnItemClickListener {
        public C96151c() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$3");
            C96148b bVar = C96148b.this;
            SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            C95738b1.C95739a aVar = bVar.f280880g;
            SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            if (aVar != null) {
                if (view.getTag() == null) {
                    SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$3");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    return;
                }
                int intValue = ((Integer) view.getTag()).intValue();
                Log.m105924i("DynamicGrid", "click " + intValue);
                if (intValue == Integer.MAX_VALUE) {
                    SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$3");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    return;
                }
                C96148b bVar2 = C96148b.this;
                SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                C95738b1.C95739a aVar2 = bVar2.f280880g;
                SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                aVar2.mo133182a(intValue);
            }
            SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$3");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.b$d */
    public class C96152d implements DynamicGridView.C96139h {

        /* renamed from: a */
        public final /* synthetic */ DynamicGridView f280892a;

        /* renamed from: b */
        public final /* synthetic */ View f280893b;

        public C96152d(DynamicGridView dynamicGridView, View view) {
            this.f280892a = dynamicGridView;
            this.f280893b = view;
        }

        /* renamed from: a */
        public void mo133773a() {
            SnsMethodCalculate.markStartTimeMs("onActionDrop", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$4");
            Log.m105924i("DynamicGrid", "gridView onActionDrop: ");
            DynamicGridView dynamicGridView = this.f280892a;
            dynamicGridView.getClass();
            SnsMethodCalculate.markStartTimeMs("stopEditMode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            Log.m105924i("DynamicGridView", "stopEditMode: ");
            dynamicGridView.f280799A = false;
            dynamicGridView.requestDisallowInterceptTouchEvent(false);
            dynamicGridView.mo133720s();
            if (dynamicGridView.f280803E) {
                dynamicGridView.mo133737z(true);
            }
            dynamicGridView.getClass();
            SnsMethodCalculate.markEndTimeMs("stopEditMode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            DynamicGridView dynamicGridView2 = this.f280892a;
            C96148b bVar = C96148b.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            float f = bVar.f280881h;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            dynamicGridView2.setElevation(f);
            SnsMethodCalculate.markEndTimeMs("onActionDrop", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.b$e */
    public class C96153e implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: d */
        public final /* synthetic */ DynamicGridView f280895d;

        /* renamed from: e */
        public final /* synthetic */ List f280896e;

        public C96153e(DynamicGridView dynamicGridView, List list) {
            this.f280895d = dynamicGridView;
            this.f280896e = list;
        }

        public boolean onPreDraw() {
            SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$5");
            this.f280895d.getViewTreeObserver().removeOnPreDrawListener(this);
            C96148b.this.mo133768g(this.f280896e.size());
            SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$5");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.b$f */
    public class C96154f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f280898d;

        public C96154f(List list) {
            this.f280898d = list;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$6");
            C96148b.this.mo133768g(this.f280898d.size());
            C96148b.this.f280878e.notifyDataSetChanged();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$6");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.b$g */
    public class C96155g implements View.OnClickListener {
        public C96155g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$7");
            C96148b.m123229b(C96148b.this);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$7");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C96148b(View view, View view2, View view3, View view4, Context context, List<String> list, int i, DynamicGridView dynamicGridView, C95738b1.C95739a aVar, C96142a.C96144b bVar, boolean z) {
        List<String> list2 = list;
        DynamicGridView dynamicGridView2 = dynamicGridView;
        Context context2 = context;
        this.f280877d = context2;
        this.f280880g = aVar;
        this.f280882i = view2;
        this.f280885o = view3;
        this.f280879f = dynamicGridView2;
        this.f280887q = view4;
        this.f280883j = (ImageView) view2.findViewById(C0966R.C0970id.c0d);
        this.f280884n = (TextView) view2.findViewById(C0966R.C0970id.c0j);
        this.f280886p = view;
        dynamicGridView2.setWobbleInEditMode(false);
        int f = mo133767f();
        this.f280888r = f;
        dynamicGridView2.setColumnWidth(f + (context.getResources().getDimensionPixelSize(C0966R.dimen.aot) * 2));
        dynamicGridView2.setNumColumns(3);
        dynamicGridView2.setOverScrollMode(2);
        dynamicGridView2.setStretchMode(0);
        dynamicGridView2.setClipChildren(false);
        dynamicGridView2.setClipToPadding(false);
        dynamicGridView2.setSelector(new ColorDrawable(0));
        C96142a aVar2 = new C96142a(context2, list, 3, i, z, mo133766e(), bVar);
        this.f280878e = aVar2;
        int i2 = this.f280888r;
        SnsMethodCalculate.markStartTimeMs("updatePicSize", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        aVar2.f280866s = i2;
        SnsMethodCalculate.markEndTimeMs("updatePicSize", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        mo133769h();
        dynamicGridView2.setAdapter((ListAdapter) this.f280878e);
        dynamicGridView2.setOnDragListener(new C96149a(dynamicGridView2));
        dynamicGridView2.setOnItemLongClickListener(new C96150b(this));
        dynamicGridView2.setOnItemClickListener(new C96151c());
        dynamicGridView2.setOnDropListener(new C96152d(dynamicGridView2, view));
        dynamicGridView.getViewTreeObserver().addOnPreDrawListener(new C96153e(dynamicGridView2, list2));
        if (C94866e1.ay0().mo139868TO() == 0) {
            new MMHandler().postDelayed(new C96154f(list2), 50);
        }
    }

    /* renamed from: b */
    public static void m123229b(C96148b bVar) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        bVar.getClass();
        SnsMethodCalculate.markStartTimeMs("knowTips", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        View view = bVar.f280885o;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView", "knowTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView", "knowTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        MMApplicationContext.getDefaultPreference().edit().putBoolean("key_show_tips", false).commit();
        SnsMethodCalculate.markEndTimeMs("knowTips", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
    }

    /* renamed from: c */
    public static void m123230c(C96148b bVar) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        bVar.getClass();
        SnsMethodCalculate.markStartTimeMs("resetDelAreaStyle", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        bVar.f280882i.setBackgroundColor(Color.parseColor("#e64340"));
        bVar.f280883j.setImageResource(C0966R.raw.sns_img_delete);
        bVar.f280884n.setText(C0966R.string.jbw);
        SnsMethodCalculate.markEndTimeMs("resetDelAreaStyle", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
    }

    /* renamed from: d */
    public static /* synthetic */ View m123231d(C96148b bVar) {
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        View view = bVar.f280882i;
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        return view;
    }

    /* renamed from: a */
    public void mo132429a(List<String> list, int i) {
        SnsMethodCalculate.markStartTimeMs("setList", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        if (this.f280878e != null) {
            Log.m105925i("DynamicGrid", "setList: count:%d, maxLimit:%d", Integer.valueOf(list.size()), Integer.valueOf(i));
            this.f280878e.mo133754g(list);
            mo133769h();
        }
        SnsMethodCalculate.markEndTimeMs("setList", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
    }

    public void clean() {
        SnsMethodCalculate.markStartTimeMs("clean", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        DynamicGridView dynamicGridView = this.f280879f;
        if (dynamicGridView != null && dynamicGridView.getAdapter() == null) {
            C96142a aVar = (C96142a) this.f280879f.getAdapter();
            aVar.getClass();
            SnsMethodCalculate.markStartTimeMs("setClean", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            aVar.f280863p = true;
            SnsMethodCalculate.markEndTimeMs("setClean", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        }
        SnsMethodCalculate.markEndTimeMs("clean", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
    }

    /* renamed from: e */
    public boolean mo133766e() {
        SnsMethodCalculate.markStartTimeMs("enableAddDummyHeader", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        SnsMethodCalculate.markEndTimeMs("enableAddDummyHeader", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        return true;
    }

    /* renamed from: f */
    public int mo133767f() {
        SnsMethodCalculate.markStartTimeMs("getPicSize", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        int min = Math.min(((C94866e1.ay0().mo139868TO() - (this.f280877d.getResources().getDimensionPixelSize(C0966R.dimen.aot) * 4)) - (this.f280877d.getResources().getDimensionPixelSize(C0966R.dimen.f3898i9) * 2)) / 3, C94866e1.f274870Z);
        SnsMethodCalculate.markEndTimeMs("getPicSize", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        return min;
    }

    /* renamed from: g */
    public void mo133768g(int i) {
        SnsMethodCalculate.markStartTimeMs("setGridViewMargins", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        int f = mo133767f();
        this.f280888r = f;
        this.f280879f.setColumnWidth(f + (this.f280877d.getResources().getDimensionPixelSize(C0966R.dimen.aot) * 2));
        View view = this.f280887q;
        int i2 = 3;
        if (view != null && view.getVisibility() == 0) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f280887q.getLayoutParams();
            layoutParams.topMargin = 0;
            layoutParams.addRule(3, C0966R.C0970id.jvf);
            this.f280887q.setLayoutParams(layoutParams);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f280879f.getLayoutParams();
        Log.m105925i("DynamicGrid", "setGridViewMargins margin: screenWith:%d", Integer.valueOf(C94866e1.ay0().mo139868TO()));
        int i3 = (i + 3) / 3;
        if (i3 <= 3) {
            i2 = i3;
        }
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (this.f280886p.getHeight() - this.f280888r) - (this.f280877d.getResources().getDimensionPixelSize(C0966R.dimen.aot) * 2), marginLayoutParams.rightMargin, (int) (BitmapUtil.getDefaultDisplayMetrics().density * 32.0f * ((float) (4 - i2))));
        this.f280879f.setLayoutParams(marginLayoutParams);
        SnsMethodCalculate.markEndTimeMs("setGridViewMargins", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
    }

    public View getView() {
        SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        DynamicGridView dynamicGridView = this.f280879f;
        SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        return dynamicGridView;
    }

    /* renamed from: h */
    public final void mo133769h() {
        SnsMethodCalculate.markStartTimeMs("setupTipsView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        C96142a aVar = this.f280878e;
        aVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getPicCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        int count = (aVar.getCount() - aVar.mo133761k()) - (aVar.f280862o ? 1 : 0);
        SnsMethodCalculate.markEndTimeMs("getPicCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        SnsMethodCalculate.markStartTimeMs("checkShouldShowImgTipsView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        boolean z = true;
        if (!MMApplicationContext.getDefaultPreference().getBoolean("key_show_tips", true) || count <= 1) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("checkShouldShowImgTipsView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        if (z) {
            Log.m105924i("DynamicGrid", "setupTipsView: show = true");
            View view = this.f280885o;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView", "setupTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView", "setupTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((ImageView) this.f280885o.findViewById(C0966R.C0970id.jtn)).setOnClickListener(new C96155g());
        } else {
            Log.m105924i("DynamicGrid", "setupTipsView: show = false");
            View view3 = this.f280885o;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView", "setupTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView", "setupTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("setupTipsView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
    }

    public void setImageClick(C95738b1.C95739a aVar) {
        SnsMethodCalculate.markStartTimeMs("setImageClick", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        this.f280880g = aVar;
        SnsMethodCalculate.markEndTimeMs("setImageClick", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
    }

    public void setIsShowAddImage(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setIsShowAddImage", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        SnsMethodCalculate.markEndTimeMs("setIsShowAddImage", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
    }
}
