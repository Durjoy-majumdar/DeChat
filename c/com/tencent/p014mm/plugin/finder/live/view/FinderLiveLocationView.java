package com.tencent.p014mm.plugin.finder.live.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.pluginsdk.location.C57534a;
import com.tencent.p014mm.pluginsdk.location.Location;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kotlin.Metadata;
import nc0.C76850a;
import p447aw.C103918d;
import qo3.C77429t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010e\u001a\u00020d\u0012\u0006\u0010g\u001a\u00020f¢\u0006\u0004\bh\u0010iB!\b\u0016\u0012\u0006\u0010e\u001a\u00020d\u0012\u0006\u0010g\u001a\u00020f\u0012\u0006\u0010j\u001a\u00020\u0003¢\u0006\u0004\bh\u0010kJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u0012\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0003H\u0016R\u001a\u0010%\u001a\u00020\u00148\u0006XD¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010I\u001a\u00020.8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bF\u00100\u001a\u0004\bG\u00102\"\u0004\bH\u00104R\"\u0010M\u001a\u0002068\u0006@\u0006X.¢\u0006\u0012\n\u0004\bJ\u00108\u001a\u0004\bK\u0010:\"\u0004\bL\u0010<R\"\u0010Q\u001a\u0002068\u0006@\u0006X.¢\u0006\u0012\n\u0004\bN\u00108\u001a\u0004\bO\u0010:\"\u0004\bP\u0010<R\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010]\u001a\u00020R8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bZ\u0010T\u001a\u0004\b[\u0010V\"\u0004\b\\\u0010XR\u0017\u0010c\u001a\u00020^8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b¨\u0006l"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveLocationView;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/pluginsdk/location/a;", "", "iconColor", "Lrx3/b0;", "setIconColor", "textColor", "setTextColor", "defaultStateIconColor", "setDefaultStateIconColor", "defaultStateTextColor", "setDefaultStateTextColor", "defaultLoadingPBarColor", "setDefaultLoadingPBarColor", "defaultLoadingTipColor", "setDefaultLoadingTipColor", "Lcom/tencent/mm/pluginsdk/location/a$a;", "onClickLocationListener", "setOnClickLocationListener", "", "city", "setSuggestView", "locationName", "setLocationName", "setLocationIconColor", "resId", "setLocationIcon", "setLocationNameColor", "Lcom/tencent/mm/pluginsdk/location/Location;", "getLocation", "color", "setLocationTipColor", "d", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "e", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "getLocationIv", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "setLocationIv", "(Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "locationIv", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "getLocationTv", "()Landroid/widget/TextView;", "setLocationTv", "(Landroid/widget/TextView;)V", "locationTv", "Landroid/view/View;", "g", "Landroid/view/View;", "getLocationLoadingView", "()Landroid/view/View;", "setLocationLoadingView", "(Landroid/view/View;)V", "locationLoadingView", "Lcom/tencent/mm/ui/widget/MMProcessBar;", "h", "Lcom/tencent/mm/ui/widget/MMProcessBar;", "getLocationLoadingProBar", "()Lcom/tencent/mm/ui/widget/MMProcessBar;", "setLocationLoadingProBar", "(Lcom/tencent/mm/ui/widget/MMProcessBar;)V", "locationLoadingProBar", "i", "getLocationLoadingTip", "setLocationLoadingTip", "locationLoadingTip", "j", "getLocationNormalView", "setLocationNormalView", "locationNormalView", "n", "getContentView", "setContentView", "contentView", "", "o", "F", "getLatitude", "()F", "setLatitude", "(F)V", "latitude", "p", "getLongitude", "setLongitude", "longitude", "Lcc0/b$a;", "x", "Lcc0/b$a;", "getLocationListener", "()Lcc0/b$a;", "locationListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveLocationView */
public final class FinderLiveLocationView extends LinearLayout implements C57534a {

    /* renamed from: d */
    public final String f15265d = "Finder.FinderLiveLocationView";

    /* renamed from: e */
    public WeImageView f15266e;

    /* renamed from: f */
    public TextView f15267f;

    /* renamed from: g */
    public View f15268g;

    /* renamed from: h */
    public MMProcessBar f15269h;

    /* renamed from: i */
    public TextView f15270i;

    /* renamed from: j */
    public View f15271j;

    /* renamed from: n */
    public View f15272n;

    /* renamed from: o */
    public float f15273o = -85.0f;

    /* renamed from: p */
    public float f15274p = -1000.0f;

    /* renamed from: q */
    public int f15275q;

    /* renamed from: r */
    public int f15276r;

    /* renamed from: s */
    public int f15277s;

    /* renamed from: t */
    public int f15278t;

    /* renamed from: u */
    public int f15279u;

    /* renamed from: v */
    public int f15280v;

    /* renamed from: w */
    public C57534a.C6645a f15281w;

    /* renamed from: x */
    public final C92411b.C92412a f15282x = new C3229r0(this);

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveLocationView$a */
    public static final class C3196a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveLocationView f15283d;

        public C3196a(FinderLiveLocationView finderLiveLocationView) {
            this.f15283d = finderLiveLocationView;
        }

        public final void onClick(View view) {
            Class cls = C103918d.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveLocationView$init$itemClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Object e = C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null);
            if (!C76850a.m92639k(e instanceof String ? (String) e : null)) {
                boolean kp = ((C103918d) C86312j.m106911c(cls)).mo125784kp((Activity) this.f15283d.getContext(), "android.permission.ACCESS_FINE_LOCATION", 64, "", this.f15283d.getContext().getString(C0966R.string.e6d), (C77429t) null, Boolean.TRUE);
                Log.m105925i(this.f15283d.getTAG(), "summerper checkPermission checkLocation[%b]", Boolean.valueOf(kp));
                if (!kp) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveLocationView$init$itemClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            } else if (!((C103918d) C86312j.m106911c(cls)).Lb0(this.f15283d.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, Boolean.FALSE);
                if (C87412m.m108589b(f instanceof Boolean ? (Boolean) f : null, Boolean.TRUE)) {
                    FinderLiveLocationView finderLiveLocationView = this.f15283d;
                    finderLiveLocationView.getClass();
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", finderLiveLocationView.getResources().getString(C0966R.string.gbq));
                    intent.putExtra("showShare", false);
                    intent.putExtra("show_bottom", false);
                    intent.putExtra("needRedirect", false);
                    intent.putExtra("neverGetA8Key", false);
                    intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
                    intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
                    C88144b.m109791i(finderLiveLocationView.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                } else {
                    ((C103918d) C86312j.m106911c(cls)).mo125790zt((Activity) this.f15283d.getContext(), "android.permission.ACCESS_FINE_LOCATION", 64);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveLocationView$init$itemClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C57534a.C6645a aVar = this.f15283d.f15281w;
            if (aVar != null) {
                aVar.mo7573a();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveLocationView$init$itemClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveLocationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo3292a();
    }

    /* renamed from: a */
    public void mo3292a() {
        View inflate = View.inflate(getContext(), C0966R.C0971layout.ahr, this);
        C87412m.m108593f(inflate, "inflate(context, R.layou…_location_geo_view, this)");
        setContentView(inflate);
        View findViewById = findViewById(C0966R.C0970id.g47);
        C87412m.m108593f(findViewById, "findViewById(R.id.location_icon)");
        setLocationIv((WeImageView) findViewById);
        View findViewById2 = findViewById(C0966R.C0970id.g4l);
        C87412m.m108593f(findViewById2, "findViewById(R.id.location_poi_name)");
        setLocationTv((TextView) findViewById2);
        View findViewById3 = findViewById(C0966R.C0970id.g4f);
        C87412m.m108593f(findViewById3, "findViewById(R.id.location_loading_view)");
        setLocationLoadingView(findViewById3);
        View findViewById4 = findViewById(C0966R.C0970id.g4x);
        C87412m.m108593f(findViewById4, "findViewById(R.id.location_verifying_icon)");
        setLocationLoadingProBar((MMProcessBar) findViewById4);
        View findViewById5 = findViewById(C0966R.C0970id.g4y);
        C87412m.m108593f(findViewById5, "findViewById(R.id.location_verifying_tip)");
        setLocationLoadingTip((TextView) findViewById5);
        View findViewById6 = findViewById(C0966R.C0970id.g4j);
        C87412m.m108593f(findViewById6, "findViewById(R.id.location_normal_view)");
        setLocationNormalView(findViewById6);
        setBackgroundResource(C0966R.C0969drawable.f4855pa);
        getContentView().setOnClickListener(new C3196a(this));
    }

    /* renamed from: c */
    public void mo3293c() {
        View locationNormalView = getLocationNormalView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(locationNormalView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveLocationView", "setLoadingState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        locationNormalView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(locationNormalView, "com/tencent/mm/plugin/finder/live/view/FinderLiveLocationView", "setLoadingState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View locationLoadingView = getLocationLoadingView();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view = locationLoadingView;
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveLocationView", "setLoadingState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        locationLoadingView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveLocationView", "setLoadingState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: d */
    public void mo3294d() {
        View locationNormalView = getLocationNormalView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(locationNormalView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveLocationView", "setDefaultState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        locationNormalView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(locationNormalView, "com/tencent/mm/plugin/finder/live/view/FinderLiveLocationView", "setDefaultState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View locationLoadingView = getLocationLoadingView();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view = locationLoadingView;
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveLocationView", "setDefaultState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        locationLoadingView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveLocationView", "setDefaultState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        setLocationName(getContext().getString(C0966R.string.f360666e23));
        getLocationIv().setIconColor(this.f15277s);
        getLocationTv().setTextColor(this.f15278t);
        setLocationIcon(C0966R.raw.icons_filled_location);
    }

    /* renamed from: e */
    public void mo3295e(String str, String str2) {
        View locationNormalView = getLocationNormalView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(locationNormalView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveLocationView", "setNormalState", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        locationNormalView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(locationNormalView, "com/tencent/mm/plugin/finder/live/view/FinderLiveLocationView", "setNormalState", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View locationLoadingView = getLocationLoadingView();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view = locationLoadingView;
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveLocationView", "setNormalState", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        locationLoadingView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveLocationView", "setNormalState", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!Util.isNullOrNil(str2)) {
            setLocationName(str2);
        } else {
            setLocationName(str);
        }
        setLocationNameColor(this.f15276r);
        setLocationIcon(C0966R.raw.icons_filled_location);
        setLocationIconColor(this.f15275q);
    }

    /* renamed from: f */
    public void mo3296f(int i) {
        getLocationLoadingProBar().mo82302b(i, this.f15279u);
        getLocationLoadingTip().setTextColor(this.f15280v);
    }

    public final View getContentView() {
        View view = this.f15272n;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("contentView");
        throw null;
    }

    public final float getLatitude() {
        return this.f15273o;
    }

    public Location getLocation() {
        return new Location(this.f15273o, this.f15274p);
    }

    public final WeImageView getLocationIv() {
        WeImageView weImageView = this.f15266e;
        if (weImageView != null) {
            return weImageView;
        }
        C87412m.m108603p("locationIv");
        throw null;
    }

    public final C92411b.C92412a getLocationListener() {
        return this.f15282x;
    }

    public final MMProcessBar getLocationLoadingProBar() {
        MMProcessBar mMProcessBar = this.f15269h;
        if (mMProcessBar != null) {
            return mMProcessBar;
        }
        C87412m.m108603p("locationLoadingProBar");
        throw null;
    }

    public final TextView getLocationLoadingTip() {
        TextView textView = this.f15270i;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("locationLoadingTip");
        throw null;
    }

    public final View getLocationLoadingView() {
        View view = this.f15268g;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("locationLoadingView");
        throw null;
    }

    public final View getLocationNormalView() {
        View view = this.f15271j;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("locationNormalView");
        throw null;
    }

    public final TextView getLocationTv() {
        TextView textView = this.f15267f;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("locationTv");
        throw null;
    }

    public final float getLongitude() {
        return this.f15274p;
    }

    public final String getTAG() {
        return this.f15265d;
    }

    public final void setContentView(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f15272n = view;
    }

    public void setDefaultLoadingPBarColor(int i) {
        this.f15279u = i;
    }

    public void setDefaultLoadingTipColor(int i) {
        this.f15280v = i;
    }

    public void setDefaultStateIconColor(int i) {
        this.f15277s = i;
    }

    public void setDefaultStateTextColor(int i) {
        this.f15278t = i;
    }

    public void setIconColor(int i) {
        this.f15275q = i;
    }

    public final void setLatitude(float f) {
        this.f15273o = f;
    }

    public void setLocationIcon(int i) {
        getLocationIv().setImageResource(i);
    }

    public void setLocationIconColor(int i) {
        getLocationIv().setIconColor(i);
    }

    public final void setLocationIv(WeImageView weImageView) {
        C87412m.m108594g(weImageView, "<set-?>");
        this.f15266e = weImageView;
    }

    public final void setLocationLoadingProBar(MMProcessBar mMProcessBar) {
        C87412m.m108594g(mMProcessBar, "<set-?>");
        this.f15269h = mMProcessBar;
    }

    public final void setLocationLoadingTip(TextView textView) {
        C87412m.m108594g(textView, "<set-?>");
        this.f15270i = textView;
    }

    public final void setLocationLoadingView(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f15268g = view;
    }

    public void setLocationName(String str) {
        getLocationTv().setText(str);
    }

    public void setLocationNameColor(int i) {
        getLocationTv().setTextColor(i);
    }

    public final void setLocationNormalView(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f15271j = view;
    }

    public void setLocationTipColor(int i) {
    }

    public final void setLocationTv(TextView textView) {
        C87412m.m108594g(textView, "<set-?>");
        this.f15267f = textView;
    }

    public final void setLongitude(float f) {
        this.f15274p = f;
    }

    public void setOnClickLocationListener(C57534a.C6645a aVar) {
        this.f15281w = aVar;
    }

    public void setSuggestView(String str) {
        View locationNormalView = getLocationNormalView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(locationNormalView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveLocationView", "setSuggestView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        locationNormalView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(locationNormalView, "com/tencent/mm/plugin/finder/live/view/FinderLiveLocationView", "setSuggestView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View locationLoadingView = getLocationLoadingView();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view = locationLoadingView;
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveLocationView", "setSuggestView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        locationLoadingView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveLocationView", "setSuggestView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        setLocationName(str);
        setLocationNameColor(this.f15276r);
        setLocationIcon(C0966R.raw.icons_filled_location);
        setLocationIconColor(this.f15275q);
    }

    public void setTextColor(int i) {
        this.f15276r = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveLocationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo3292a();
    }
}
