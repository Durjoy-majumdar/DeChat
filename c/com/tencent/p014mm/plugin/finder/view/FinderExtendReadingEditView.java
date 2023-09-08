package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75054z4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import i33.C98595b;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import rx3.C13598b0;
import wc1.C15064b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderExtendReadingEditView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-publish_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView */
public final class FinderExtendReadingEditView extends RelativeLayout {

    /* renamed from: d */
    public C32226l<? super String, C13598b0> f17686d;

    /* renamed from: e */
    public C32224a<C13598b0> f17687e;

    /* renamed from: f */
    public final View f17688f;

    /* renamed from: g */
    public final TextView f17689g;

    /* renamed from: h */
    public final TextView f17690h;

    /* renamed from: i */
    public final MMEditText f17691i;

    /* renamed from: j */
    public final TextView f17692j;

    /* renamed from: n */
    public final View f17693n;

    /* renamed from: o */
    public final TextView f17694o;

    /* renamed from: p */
    public final LinearLayout f17695p;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView$a */
    public static final class C3939a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f17696d;

        /* renamed from: e */
        public final /* synthetic */ FinderExtendReadingEditView f17697e;

        public C3939a(View view, FinderExtendReadingEditView finderExtendReadingEditView) {
            this.f17696d = view;
            this.f17697e = finderExtendReadingEditView;
        }

        public final void run() {
            this.f17696d.setPadding((int) this.f17697e.getContext().getResources().getDimension(C0966R.dimen.f3736cp), this.f17696d.getTop(), (int) this.f17697e.getContext().getResources().getDimension(C0966R.dimen.f3736cp), this.f17696d.getBottom() + C75054z4.m90004b(this.f17697e.getContext()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView$b */
    public static final class C3940b implements View.OnClickListener {

        /* renamed from: d */
        public static final C3940b f17698d = new C3940b();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderExtendReadingEditView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderExtendReadingEditView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView$c */
    public static final class C3941c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderExtendReadingEditView f17699d;

        public C3941c(FinderExtendReadingEditView finderExtendReadingEditView) {
            this.f17699d = finderExtendReadingEditView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderExtendReadingEditView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> aVar = this.f17699d.f17687e;
            if (aVar != null) {
                aVar.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderExtendReadingEditView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView$d */
    public static final class C3942d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderExtendReadingEditView f17700d;

        public C3942d(FinderExtendReadingEditView finderExtendReadingEditView) {
            this.f17700d = finderExtendReadingEditView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderExtendReadingEditView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> aVar = this.f17700d.f17687e;
            if (aVar != null) {
                aVar.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderExtendReadingEditView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView$e */
    public static final class C3943e implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ FinderExtendReadingEditView f17701d;

        public C3943e(FinderExtendReadingEditView finderExtendReadingEditView) {
            this.f17701d = finderExtendReadingEditView;
        }

        public void afterTextChanged(Editable editable) {
            this.f17701d.mo4479a();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView$f */
    public static final class C3944f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderExtendReadingEditView f17702d;

        /* renamed from: e */
        public final /* synthetic */ String f17703e;

        public C3944f(FinderExtendReadingEditView finderExtendReadingEditView, String str) {
            this.f17702d = finderExtendReadingEditView;
            this.f17703e = str;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderExtendReadingEditView$checkEnableAdd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32226l<? super String, C13598b0> lVar = this.f17702d.f17686d;
            if (lVar != null) {
                lVar.invoke(this.f17703e);
                this.f17702d.f17691i.setText("");
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderExtendReadingEditView$checkEnableAdd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("onAddListener");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView$g */
    public static final class C3945g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderExtendReadingEditView f17704d;

        /* renamed from: e */
        public final /* synthetic */ String f17705e;

        public C3945g(FinderExtendReadingEditView finderExtendReadingEditView, String str) {
            this.f17704d = finderExtendReadingEditView;
            this.f17705e = str;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderExtendReadingEditView$refreshTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f17704d.f17691i.setText(this.f17705e);
            this.f17704d.f17692j.setVisibility(8);
            this.f17704d.f17694o.setVisibility(0);
            MMEditText mMEditText = this.f17704d.f17691i;
            mMEditText.setSelection(mMEditText.getText().length());
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderExtendReadingEditView$refreshTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public FinderExtendReadingEditView(Context context) {
        super(context);
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.a_m, (ViewGroup) null);
        addView(inflate, new RelativeLayout.LayoutParams(-1, -1));
        View findViewById = inflate.findViewById(C0966R.C0970id.d8p);
        C87412m.m108593f(findViewById, "view.findViewById(com.te…xtend_reading_edit_close)");
        this.f17688f = findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.d8n);
        C87412m.m108593f(findViewById2, "view.findViewById(com.te…_extend_reading_edit_add)");
        TextView textView = (TextView) findViewById2;
        this.f17689g = textView;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.kpm);
        C87412m.m108593f(findViewById3, "view.findViewById(com.te…gin.finder.R.id.title_tv)");
        TextView textView2 = (TextView) findViewById3;
        this.f17690h = textView2;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.d8m);
        C87412m.m108593f(findViewById4, "view.findViewById(com.te…_extend_link_list_layout)");
        this.f17695p = (LinearLayout) findViewById4;
        C15064b bVar = C15064b.f41199a;
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        textView2.setTextSize(1, bVar.mo14078c(context2, 15.0f));
        Context context3 = getContext();
        C87412m.m108593f(context3, "context");
        textView.setTextSize(1, bVar.mo14078c(context3, 16.0f));
        C98595b bVar2 = C98595b.f289089a;
        bVar2.mo137988f(textView2);
        bVar2.mo137988f(textView);
        bVar2.mo137988f(findViewById);
        C85875k4.m106189j0(textView2.getPaint(), 0.8f);
        View findViewById5 = findViewById(C0966R.C0970id.idv);
        findViewById5.post(new C3939a(findViewById5, this));
        findViewById5.setOnClickListener(C3940b.f17698d);
        View findViewById6 = inflate.findViewById(C0966R.C0970id.d8q);
        C87412m.m108593f(findViewById6, "view.findViewById(com.te…r_extend_reading_edit_et)");
        MMEditText mMEditText = (MMEditText) findViewById6;
        this.f17691i = mMEditText;
        View findViewById7 = inflate.findViewById(C0966R.C0970id.d8r);
        C87412m.m108593f(findViewById7, "view.findViewById(com.te…extend_reading_edit_tips)");
        this.f17692j = (TextView) findViewById7;
        View findViewById8 = inflate.findViewById(C0966R.C0970id.d8o);
        C87412m.m108593f(findViewById8, "view.findViewById(com.te…r_extend_reading_edit_bg)");
        this.f17693n = findViewById8;
        View findViewById9 = inflate.findViewById(C0966R.C0970id.d8s);
        C87412m.m108593f(findViewById9, "view.findViewById(com.te…nder_extend_reading_tips)");
        this.f17694o = (TextView) findViewById9;
        findViewById.setOnClickListener(new C3941c(this));
        findViewById8.setOnClickListener(new C3942d(this));
        mMEditText.addTextChangedListener(new C3943e(this));
        mo4480b();
        mo4479a();
    }

    /* renamed from: a */
    public final void mo4479a() {
        String obj = this.f17691i.getText().toString();
        if (!Util.isNullOrNil(obj)) {
            this.f17689g.setOnClickListener(new C3944f(this, obj));
            this.f17689g.setTextColor(getResources().getColor(C0966R.color.f2975b6));
            this.f17689g.setBackgroundResource(C0966R.C0969drawable.f5066vn);
            return;
        }
        this.f17689g.setOnClickListener((View.OnClickListener) null);
        this.f17689g.setTextColor(getResources().getColor(C0966R.color.f3394rb));
        this.f17689g.setBackgroundResource(C0966R.C0969drawable.f5064vl);
    }

    /* renamed from: b */
    public final void mo4480b() {
        if (Util.isNullOrNil("") || !(!Util.isNullOrNil(""))) {
            this.f17692j.setVisibility(8);
            if (this.f17691i.getVisibility() == 0) {
                this.f17694o.setVisibility(0);
            }
        } else if (C87412m.m108589b(this.f17691i.getText().toString(), "")) {
            this.f17692j.setVisibility(8);
        } else {
            if (getVisibility() == 0) {
                this.f17692j.setVisibility(0);
                this.f17694o.setVisibility(8);
            }
            this.f17692j.setText(getContext().getString(C0966R.string.d7v, new Object[]{""}));
            this.f17692j.setOnClickListener(new C3945g(this, ""));
        }
    }

    public FinderExtendReadingEditView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.a_m, (ViewGroup) null);
        addView(inflate, new RelativeLayout.LayoutParams(-1, -1));
        View findViewById = inflate.findViewById(C0966R.C0970id.d8p);
        C87412m.m108593f(findViewById, "view.findViewById(com.te…xtend_reading_edit_close)");
        this.f17688f = findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.d8n);
        C87412m.m108593f(findViewById2, "view.findViewById(com.te…_extend_reading_edit_add)");
        TextView textView = (TextView) findViewById2;
        this.f17689g = textView;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.kpm);
        C87412m.m108593f(findViewById3, "view.findViewById(com.te…gin.finder.R.id.title_tv)");
        TextView textView2 = (TextView) findViewById3;
        this.f17690h = textView2;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.d8m);
        C87412m.m108593f(findViewById4, "view.findViewById(com.te…_extend_link_list_layout)");
        this.f17695p = (LinearLayout) findViewById4;
        C15064b bVar = C15064b.f41199a;
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        textView2.setTextSize(1, bVar.mo14078c(context2, 15.0f));
        Context context3 = getContext();
        C87412m.m108593f(context3, "context");
        textView.setTextSize(1, bVar.mo14078c(context3, 16.0f));
        C98595b bVar2 = C98595b.f289089a;
        bVar2.mo137988f(textView2);
        bVar2.mo137988f(textView);
        bVar2.mo137988f(findViewById);
        C85875k4.m106189j0(textView2.getPaint(), 0.8f);
        View findViewById5 = findViewById(C0966R.C0970id.idv);
        findViewById5.post(new C3939a(findViewById5, this));
        findViewById5.setOnClickListener(C3940b.f17698d);
        View findViewById6 = inflate.findViewById(C0966R.C0970id.d8q);
        C87412m.m108593f(findViewById6, "view.findViewById(com.te…r_extend_reading_edit_et)");
        MMEditText mMEditText = (MMEditText) findViewById6;
        this.f17691i = mMEditText;
        View findViewById7 = inflate.findViewById(C0966R.C0970id.d8r);
        C87412m.m108593f(findViewById7, "view.findViewById(com.te…extend_reading_edit_tips)");
        this.f17692j = (TextView) findViewById7;
        View findViewById8 = inflate.findViewById(C0966R.C0970id.d8o);
        C87412m.m108593f(findViewById8, "view.findViewById(com.te…r_extend_reading_edit_bg)");
        this.f17693n = findViewById8;
        View findViewById9 = inflate.findViewById(C0966R.C0970id.d8s);
        C87412m.m108593f(findViewById9, "view.findViewById(com.te…nder_extend_reading_tips)");
        this.f17694o = (TextView) findViewById9;
        findViewById.setOnClickListener(new C3941c(this));
        findViewById8.setOnClickListener(new C3942d(this));
        mMEditText.addTextChangedListener(new C3943e(this));
        mo4480b();
        mo4479a();
    }

    public FinderExtendReadingEditView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.a_m, (ViewGroup) null);
        addView(inflate, new RelativeLayout.LayoutParams(-1, -1));
        View findViewById = inflate.findViewById(C0966R.C0970id.d8p);
        C87412m.m108593f(findViewById, "view.findViewById(com.te…xtend_reading_edit_close)");
        this.f17688f = findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.d8n);
        C87412m.m108593f(findViewById2, "view.findViewById(com.te…_extend_reading_edit_add)");
        TextView textView = (TextView) findViewById2;
        this.f17689g = textView;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.kpm);
        C87412m.m108593f(findViewById3, "view.findViewById(com.te…gin.finder.R.id.title_tv)");
        TextView textView2 = (TextView) findViewById3;
        this.f17690h = textView2;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.d8m);
        C87412m.m108593f(findViewById4, "view.findViewById(com.te…_extend_link_list_layout)");
        this.f17695p = (LinearLayout) findViewById4;
        C15064b bVar = C15064b.f41199a;
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        textView2.setTextSize(1, bVar.mo14078c(context2, 15.0f));
        Context context3 = getContext();
        C87412m.m108593f(context3, "context");
        textView.setTextSize(1, bVar.mo14078c(context3, 16.0f));
        C98595b bVar2 = C98595b.f289089a;
        bVar2.mo137988f(textView2);
        bVar2.mo137988f(textView);
        bVar2.mo137988f(findViewById);
        C85875k4.m106189j0(textView2.getPaint(), 0.8f);
        View findViewById5 = findViewById(C0966R.C0970id.idv);
        findViewById5.post(new C3939a(findViewById5, this));
        findViewById5.setOnClickListener(C3940b.f17698d);
        View findViewById6 = inflate.findViewById(C0966R.C0970id.d8q);
        C87412m.m108593f(findViewById6, "view.findViewById(com.te…r_extend_reading_edit_et)");
        MMEditText mMEditText = (MMEditText) findViewById6;
        this.f17691i = mMEditText;
        View findViewById7 = inflate.findViewById(C0966R.C0970id.d8r);
        C87412m.m108593f(findViewById7, "view.findViewById(com.te…extend_reading_edit_tips)");
        this.f17692j = (TextView) findViewById7;
        View findViewById8 = inflate.findViewById(C0966R.C0970id.d8o);
        C87412m.m108593f(findViewById8, "view.findViewById(com.te…r_extend_reading_edit_bg)");
        this.f17693n = findViewById8;
        View findViewById9 = inflate.findViewById(C0966R.C0970id.d8s);
        C87412m.m108593f(findViewById9, "view.findViewById(com.te…nder_extend_reading_tips)");
        this.f17694o = (TextView) findViewById9;
        findViewById.setOnClickListener(new C3941c(this));
        findViewById8.setOnClickListener(new C3942d(this));
        mMEditText.addTextChangedListener(new C3943e(this));
        mo4480b();
        mo4479a();
    }
}
