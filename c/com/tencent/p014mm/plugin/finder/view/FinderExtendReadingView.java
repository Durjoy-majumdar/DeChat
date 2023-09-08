package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32229r;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13598b0;
import te3.t54;
import uq1.C65449m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101B%\b\u0016\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\u0006\u00102\u001a\u00020\u0019¢\u0006\u0004\b0\u00103J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R.\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR.\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR.\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\fR.\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\fR.\u0010 \u001a\u0004\u0018\u00010\u00192\b\u0010\u0006\u001a\u0004\u0018\u00010\u00198\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010+\u001a\u00020!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'¨\u00064"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderExtendReadingView;", "Landroid/widget/LinearLayout;", "", "link", "Lrx3/b0;", "setVerifyingState", "value", "h", "Ljava/lang/String;", "getTipsLink", "()Ljava/lang/String;", "setTipsLink", "(Ljava/lang/String;)V", "tipsLink", "i", "getTipsTitle", "setTipsTitle", "tipsTitle", "j", "getLink", "setLink", "n", "getTitle", "setTitle", "title", "", "o", "Ljava/lang/Integer;", "getStyle", "()Ljava/lang/Integer;", "setStyle", "(Ljava/lang/Integer;)V", "style", "", "y", "Z", "isVerifyState", "()Z", "setVerifyState", "(Z)V", "z", "getHasSet", "setHasSet", "hasSet", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-publish_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderExtendReadingView */
public final class FinderExtendReadingView extends LinearLayout {

    /* renamed from: d */
    public C32224a<C13598b0> f17706d;

    /* renamed from: e */
    public C32226l<? super String, C13598b0> f17707e;

    /* renamed from: f */
    public C32229r<? super String, ? super String, ? super Integer, ? super Integer, C13598b0> f17708f;

    /* renamed from: g */
    public C32226l<? super t54, C13598b0> f17709g;

    /* renamed from: h */
    public String f17710h;

    /* renamed from: i */
    public String f17711i;

    /* renamed from: j */
    public String f17712j;

    /* renamed from: n */
    public String f17713n;

    /* renamed from: o */
    public Integer f17714o = 0;

    /* renamed from: p */
    public final View f17715p;

    /* renamed from: q */
    public final View f17716q;

    /* renamed from: r */
    public final View f17717r;

    /* renamed from: s */
    public final View f17718s;

    /* renamed from: t */
    public final View f17719t;

    /* renamed from: u */
    public final TextView f17720u;

    /* renamed from: v */
    public final TextView f17721v;

    /* renamed from: w */
    public final WeImageView f17722w;

    /* renamed from: x */
    public final View f17723x;

    /* renamed from: y */
    public boolean f17724y;

    /* renamed from: z */
    public boolean f17725z;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderExtendReadingView$a */
    public static final class C3946a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderExtendReadingView f17726d;

        public C3946a(FinderExtendReadingView finderExtendReadingView) {
            this.f17726d = finderExtendReadingView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderExtendReadingView$setOriginState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> aVar = this.f17726d.f17706d;
            if (aVar != null) {
                aVar.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView$setOriginState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderExtendReadingView$b */
    public static final class C3947b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderExtendReadingView f17727d;

        /* renamed from: e */
        public final /* synthetic */ String f17728e;

        public C3947b(FinderExtendReadingView finderExtendReadingView, String str) {
            this.f17727d = finderExtendReadingView;
            this.f17728e = str;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderExtendReadingView$setVerifyingState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32226l<? super String, C13598b0> lVar = this.f17727d.f17707e;
            if (lVar != null) {
                lVar.invoke(this.f17728e);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView$setVerifyingState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public FinderExtendReadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.a_n, (ViewGroup) null);
        addView(inflate, new LinearLayout.LayoutParams(-1, -2));
        View findViewById = inflate.findViewById(C0966R.C0970id.cns);
        C87412m.m108593f(findViewById, "view.findViewById(com.te…ding_normal_state_layout)");
        this.f17715p = findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.cnz);
        C87412m.m108593f(findViewById2, "view.findViewById(com.te…g_verifying_state_layout)");
        this.f17716q = findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.cnq);
        C87412m.m108593f(findViewById3, "view.findViewById(com.te…ding_failed_state_layout)");
        this.f17717r = findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.cnu);
        C87412m.m108593f(findViewById4, "view.findViewById(com.te…eading_succ_state_layout)");
        this.f17718s = findViewById4;
        View findViewById5 = inflate.findViewById(C0966R.C0970id.cnv);
        C87412m.m108593f(findViewById5, "view.findViewById(com.te…tend_reading_tips_layout)");
        this.f17719t = findViewById5;
        View findViewById6 = inflate.findViewById(C0966R.C0970id.cnw);
        C87412m.m108593f(findViewById6, "view.findViewById(com.te…d.extend_reading_tips_tv)");
        this.f17720u = (TextView) findViewById6;
        View findViewById7 = inflate.findViewById(C0966R.C0970id.cnx);
        C87412m.m108593f(findViewById7, "view.findViewById(com.te….extend_reading_title_tv)");
        this.f17721v = (TextView) findViewById7;
        View findViewById8 = inflate.findViewById(C0966R.C0970id.cnt);
        C87412m.m108593f(findViewById8, "view.findViewById(com.te…extend_reading_succ_icon)");
        this.f17722w = (WeImageView) findViewById8;
        View findViewById9 = inflate.findViewById(C0966R.C0970id.ocl);
        C87412m.m108593f(findViewById9, "view.findViewById(com.te…d_link_red_packet_layout)");
        this.f17723x = findViewById9;
        mo4491b();
        mo4490a();
    }

    /* renamed from: a */
    public final void mo4490a() {
        Integer num;
        this.f17724y = false;
        this.f17725z = false;
        View view = this.f17715p;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setOriginState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setOriginState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view3 = this.f17716q;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setOriginState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setOriginState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view5 = this.f17717r;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        View view6 = view5;
        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setOriginState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setOriginState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view7 = this.f17718s;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        View view8 = view7;
        C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setOriginState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setOriginState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        String str = this.f17711i;
        String str2 = this.f17710h;
        Integer num2 = this.f17714o;
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            View view9 = this.f17719t;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(8);
            C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "updateVerifiedTips", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "updateVerifiedTips", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            if (this.f17715p.getVisibility() != 0) {
                View view10 = this.f17719t;
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(8);
                View view11 = view10;
                num = num2;
                C117292a.m165358d(view11, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "updateVerifiedTips", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view11, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "updateVerifiedTips", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                num = num2;
                View view12 = this.f17719t;
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(0);
                View view13 = view12;
                C117292a.m165358d(view13, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "updateVerifiedTips", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view12.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view13, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "updateVerifiedTips", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            setTipsLink(str2);
            setTipsTitle(str);
            this.f17720u.setText(getContext().getString(C0966R.string.d7x, new Object[]{str}));
            this.f17720u.setOnClickListener(new C4012a2(this, str, str2, num, 0));
        }
        this.f17715p.setOnClickListener(new C3946a(this));
    }

    /* renamed from: b */
    public final void mo4491b() {
        View findViewById = this.f17715p.findViewById(C0966R.C0970id.n7d);
        if (C65449m.f188332a.mo89564c()) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setProductTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setProductTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setProductTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setProductTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final boolean getHasSet() {
        return this.f17725z;
    }

    public final String getLink() {
        return this.f17712j;
    }

    public final Integer getStyle() {
        return this.f17714o;
    }

    public final String getTipsLink() {
        return this.f17710h;
    }

    public final String getTipsTitle() {
        return this.f17711i;
    }

    public final String getTitle() {
        return this.f17713n;
    }

    public final void setHasSet(boolean z) {
        this.f17725z = z;
    }

    public final void setLink(String str) {
        Log.m105924i("Finder.FinderExtendReadingView", "set link " + str);
        this.f17712j = str;
    }

    public final void setStyle(Integer num) {
        Log.m105924i("Finder.FinderExtendReadingView", "set style " + num);
        this.f17714o = num;
    }

    public final void setTipsLink(String str) {
        Log.m105924i("Finder.FinderExtendReadingView", "set tipsLink " + str);
        this.f17710h = str;
    }

    public final void setTipsTitle(String str) {
        Log.m105924i("Finder.FinderExtendReadingView", "set tipsTitle " + str);
        this.f17711i = str;
    }

    public final void setTitle(String str) {
        Log.m105924i("Finder.FinderExtendReadingView", "set title " + str);
        this.f17713n = str;
    }

    public final void setVerifyState(boolean z) {
        this.f17724y = z;
    }

    public final void setVerifyingState(String str) {
        String str2 = str;
        C87412m.m108594g(str2, "link");
        this.f17724y = true;
        View view = this.f17715p;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setVerifyingState", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setVerifyingState", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f17716q;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setVerifyingState", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setVerifyingState", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view4 = this.f17717r;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setVerifyingState", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setVerifyingState", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view5 = this.f17718s;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        View view6 = view5;
        C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setVerifyingState", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setVerifyingState", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view7 = this.f17719t;
        C9556a aVar5 = new C9556a();
        aVar5.mo10233c(8);
        C117292a.m165358d(view7, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setVerifyingState", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setVerifyingState", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        setLink(str);
        this.f17716q.setOnClickListener(new C3947b(this, str2));
    }

    public FinderExtendReadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.a_n, (ViewGroup) null);
        addView(inflate, new LinearLayout.LayoutParams(-1, -2));
        View findViewById = inflate.findViewById(C0966R.C0970id.cns);
        C87412m.m108593f(findViewById, "view.findViewById(com.te…ding_normal_state_layout)");
        this.f17715p = findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.cnz);
        C87412m.m108593f(findViewById2, "view.findViewById(com.te…g_verifying_state_layout)");
        this.f17716q = findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.cnq);
        C87412m.m108593f(findViewById3, "view.findViewById(com.te…ding_failed_state_layout)");
        this.f17717r = findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.cnu);
        C87412m.m108593f(findViewById4, "view.findViewById(com.te…eading_succ_state_layout)");
        this.f17718s = findViewById4;
        View findViewById5 = inflate.findViewById(C0966R.C0970id.cnv);
        C87412m.m108593f(findViewById5, "view.findViewById(com.te…tend_reading_tips_layout)");
        this.f17719t = findViewById5;
        View findViewById6 = inflate.findViewById(C0966R.C0970id.cnw);
        C87412m.m108593f(findViewById6, "view.findViewById(com.te…d.extend_reading_tips_tv)");
        this.f17720u = (TextView) findViewById6;
        View findViewById7 = inflate.findViewById(C0966R.C0970id.cnx);
        C87412m.m108593f(findViewById7, "view.findViewById(com.te….extend_reading_title_tv)");
        this.f17721v = (TextView) findViewById7;
        View findViewById8 = inflate.findViewById(C0966R.C0970id.cnt);
        C87412m.m108593f(findViewById8, "view.findViewById(com.te…extend_reading_succ_icon)");
        this.f17722w = (WeImageView) findViewById8;
        View findViewById9 = inflate.findViewById(C0966R.C0970id.ocl);
        C87412m.m108593f(findViewById9, "view.findViewById(com.te…d_link_red_packet_layout)");
        this.f17723x = findViewById9;
        mo4491b();
        mo4490a();
    }
}
