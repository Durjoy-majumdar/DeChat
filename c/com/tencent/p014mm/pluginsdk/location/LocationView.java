package com.tencent.p014mm.pluginsdk.location;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.pluginsdk.location.C57534a;
import com.tencent.p014mm.sdk.platformtools.Util;
import dd3.C7265d;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.pluginsdk.location.LocationView */
public class LocationView extends LinearLayout implements C57534a {

    /* renamed from: x */
    public static final /* synthetic */ int f23940x = 0;

    /* renamed from: d */
    public WeImageView f23941d;

    /* renamed from: e */
    public TextView f23942e;

    /* renamed from: f */
    public TextView f23943f;

    /* renamed from: g */
    public View f23944g;

    /* renamed from: h */
    public MMProcessBar f23945h;

    /* renamed from: i */
    public TextView f23946i;

    /* renamed from: j */
    public View f23947j;

    /* renamed from: n */
    public View f23948n;

    /* renamed from: o */
    public int f23949o;

    /* renamed from: p */
    public int f23950p;

    /* renamed from: q */
    public int f23951q;

    /* renamed from: r */
    public int f23952r;

    /* renamed from: s */
    public int f23953s;

    /* renamed from: t */
    public int f23954t;

    /* renamed from: u */
    public C57534a.C6645a f23955u;

    /* renamed from: v */
    public float f23956v;

    /* renamed from: w */
    public float f23957w;

    public LocationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* renamed from: c */
    public void mo3293c() {
        View view = this.f23947j;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/pluginsdk/location/LocationView", "setLoadingState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/pluginsdk/location/LocationView", "setLoadingState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f23944g;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/location/LocationView", "setLoadingState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/pluginsdk/location/LocationView", "setLoadingState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: d */
    public void mo3294d() {
        View view = this.f23947j;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/pluginsdk/location/LocationView", "setDefaultState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/pluginsdk/location/LocationView", "setDefaultState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f23944g;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/location/LocationView", "setDefaultState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/pluginsdk/location/LocationView", "setDefaultState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f23943f.setVisibility(8);
        setLocationName(getContext().getString(C0966R.string.gaz));
        this.f23941d.setIconColor(this.f23951q);
        this.f23942e.setTextColor(this.f23952r);
        setLocationIcon(C0966R.raw.icons_outlined_location);
    }

    /* renamed from: e */
    public void mo3295e(String str, String str2) {
        View view = this.f23947j;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/pluginsdk/location/LocationView", "setNormalState", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/pluginsdk/location/LocationView", "setNormalState", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f23944g;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/location/LocationView", "setNormalState", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/pluginsdk/location/LocationView", "setNormalState", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f23943f.setVisibility(8);
        if (!Util.isNullOrNil(str2)) {
            setLocationName(str2);
        } else {
            setLocationName(str);
        }
        setLocationNameColor(this.f23950p);
        setLocationIcon(C0966R.raw.icons_filled_location);
        setLocationIconColor(this.f23949o);
    }

    /* renamed from: f */
    public void mo3296f(int i) {
        this.f23945h.mo82302b(i, this.f23953s);
        this.f23946i.setTextColor(this.f23954t);
    }

    public Location getLocation() {
        return new Location(this.f23956v, this.f23957w);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setDefaultLoadingPBarColor(int i) {
        this.f23953s = i;
    }

    public void setDefaultLoadingTipColor(int i) {
        this.f23954t = i;
    }

    public void setDefaultStateIconColor(int i) {
        this.f23951q = i;
    }

    public void setDefaultStateTextColor(int i) {
        this.f23952r = i;
    }

    public void setIconColor(int i) {
        this.f23949o = i;
    }

    public void setLocationIcon(int i) {
        this.f23941d.setImageResource(i);
    }

    public void setLocationIconColor(int i) {
        this.f23941d.setIconColor(i);
    }

    public void setLocationName(String str) {
        this.f23942e.setText(str);
    }

    public void setLocationNameColor(int i) {
        this.f23942e.setTextColor(i);
    }

    public void setLocationTipColor(int i) {
        this.f23943f.setTextColor(i);
    }

    public void setOnClickLocationListener(C57534a.C6645a aVar) {
        this.f23955u = aVar;
    }

    public void setSuggestView(String str) {
        View view = this.f23947j;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/pluginsdk/location/LocationView", "setSuggestView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/pluginsdk/location/LocationView", "setSuggestView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f23944g;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/location/LocationView", "setSuggestView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/pluginsdk/location/LocationView", "setSuggestView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f23943f.setVisibility(0);
        setLocationName(str);
        setLocationNameColor(this.f23950p);
        setLocationIcon(C0966R.raw.icons_filled_location);
        setLocationIconColor(this.f23949o);
    }

    public void setTextColor(int i) {
        this.f23950p = i;
    }

    public LocationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23956v = -85.0f;
        this.f23957w = -1000.0f;
        this.f23948n = View.inflate(getContext(), C0966R.C0971layout.b84, this);
        this.f23941d = (WeImageView) findViewById(C0966R.C0970id.g47);
        this.f23942e = (TextView) findViewById(C0966R.C0970id.g4l);
        this.f23943f = (TextView) findViewById(C0966R.C0970id.g4m);
        this.f23944g = findViewById(C0966R.C0970id.g4f);
        this.f23945h = (MMProcessBar) findViewById(C0966R.C0970id.g4x);
        this.f23946i = (TextView) findViewById(C0966R.C0970id.g4y);
        this.f23947j = findViewById(C0966R.C0970id.g4j);
        setBackgroundResource(C0966R.C0969drawable.f4855pa);
        this.f23948n.setOnClickListener(new C7265d(this));
        setTextColor(getContext().getResources().getColor(C0966R.color.f2939n));
        setIconColor(getContext().getResources().getColor(C0966R.color.f2939n));
        setDefaultStateIconColor(getContext().getResources().getColor(C0966R.color.a7f));
        setDefaultStateTextColor(getContext().getResources().getColor(C0966R.color.a7f));
        setDefaultLoadingPBarColor(getContext().getResources().getColor(C0966R.color.f2939n));
        setDefaultLoadingTipColor(getContext().getResources().getColor(C0966R.color.FG_2));
    }
}
