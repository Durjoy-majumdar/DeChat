package com.tencent.p014mm.plugin.appbrand.widget.desktop;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dt0.C75447f;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lb0.C88393a;
import lb0.C88394b;
import lb0.C88430i;
import p235sm.C36689g;
import s92.C77637c;
import uo3.C78253a;
import xt0.C78982h;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.c */
public class C68687c extends C68685a {

    /* renamed from: I */
    public static final C88394b.C88408j f197330I = new C88430i();

    /* renamed from: A */
    public RelativeLayout f197331A;

    /* renamed from: B */
    public ImageView f197332B;

    /* renamed from: C */
    public ImageView f197333C;

    /* renamed from: D */
    public ViewGroup f197334D;

    /* renamed from: E */
    public TextView f197335E;

    /* renamed from: F */
    public TextView f197336F;

    /* renamed from: G */
    public ImageView f197337G;

    /* renamed from: H */
    public ImageView f197338H;

    public C68687c(View view) {
        super(view);
        this.f197331A = (RelativeLayout) view.findViewById(C0966R.C0970id.f1n);
        this.f197332B = (ImageView) view.findViewById(C0966R.C0970id.f15);
        this.f197333C = (ImageView) view.findViewById(C0966R.C0970id.f1j);
        this.f197334D = (ViewGroup) view.findViewById(C0966R.C0970id.f2b);
        this.f197335E = (TextView) view.findViewById(C0966R.C0970id.knx);
        this.f197336F = (TextView) view.findViewById(C0966R.C0970id.khf);
        this.f197337G = (ImageView) view.findViewById(C0966R.C0970id.k1a);
        this.f197338H = (ImageView) view.findViewById(C0966R.C0970id.f4x);
    }

    /* renamed from: B */
    public final void mo94475B() {
        Context C = mo94476C();
        float f = ((float) C76577a.m92155f(C, C0966R.dimen.f4077qr)) * C78982h.m95497a(C);
        int i = 0;
        Log.m105919d("MicroMsg.AppBrandRecentSizeHelper", "alvinluo iconSize: %f", Float.valueOf(f));
        int i2 = (int) f;
        ViewGroup.LayoutParams layoutParams = this.f44854d.getLayoutParams();
        Context C2 = mo94476C();
        if (C2 != null) {
            i = (int) (((float) C76577a.m92155f(C2, C0966R.dimen.f4081qv)) * C75447f.m90469a(C2));
        }
        layoutParams.width = i;
        this.f197331A.getLayoutParams().width = i2;
        this.f197331A.getLayoutParams().height = i2;
        this.f197332B.getLayoutParams().width = -1;
        this.f197332B.getLayoutParams().height = -1;
    }

    /* renamed from: C */
    public final Context mo94476C() {
        return this.f44854d.getContext();
    }

    /* renamed from: y */
    public void mo94473y(View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        mo94475B();
        this.f197332B.setColorFilter((ColorFilter) null);
        View view = this.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder", "onBind", "(Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder", "onBind", "(Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f197335E.setVisibility(0);
        LocalUsageInfo localUsageInfo = this.f197328z.f197340a;
        String str = "";
        if (localUsageInfo == null) {
            String str2 = C88394b.f255384g;
            C88394b.C88418q.f255427a.mo122786b(this.f197332B, str, C88393a.m110230a(), f197330I);
            this.f197336F.setVisibility(8);
            this.f197335E.setText(str);
            Log.m105920e("MicroMsg.AppBrandItemHolder", "item info is null!");
            return;
        }
        if (!Util.isNullOrNil(localUsageInfo.f239045i)) {
            this.f197335E.setText(this.f197328z.f197340a.f239045i);
            this.f197335E.setVisibility(0);
        } else if (!Util.isNullOrNil(this.f197328z.f197340a.f239044h)) {
            this.f197335E.setText(this.f197328z.f197340a.f239044h);
            this.f197335E.setVisibility(0);
        } else if (!Util.isNullOrNil(this.f197328z.f197340a.f239040d)) {
            LocalUsageInfo localUsageInfo2 = this.f197328z.f197340a;
            Log.m105929w("MicroMsg.AppBrandItemHolder", "[onBindCustomViewHolder] nickname is null! username:%s appId:%s", localUsageInfo2.f239040d, localUsageInfo2.f239041e);
            this.f197335E.setVisibility(0);
            this.f197335E.setText(this.f197328z.f197340a.f239040d);
        } else {
            this.f197335E.setVisibility(0);
            this.f197335E.setText(str);
        }
        LocalUsageInfo localUsageInfo3 = this.f197328z.f197340a;
        Log.m105925i("MicroMsg.AppBrandItemHolder", "ccf-log [onBindViewHolder] name=%s iconUrl=%s", localUsageInfo3.f239044h, localUsageInfo3.f239046j);
        if (!Util.isNullOrNil(this.f197328z.f197340a.f239046j)) {
            String str3 = C88394b.f255384g;
            C88394b.C88418q.f255427a.mo122786b(this.f197332B, this.f197328z.f197340a.f239046j, C88393a.m110230a(), f197330I);
        } else {
            this.f197332B.setImageDrawable(C88393a.m110230a());
        }
        C36689g gVar = (C36689g) C86312j.m106911c(C36689g.class);
        this.f197336F.setVisibility(8);
        this.f197338H.setVisibility(8);
        if (!Util.isNullOrNil(gVar.mo60809b0(this.f197328z.f197340a.f239042f))) {
            this.f197336F.setVisibility(0);
            this.f197336F.setText(gVar.mo60809b0(this.f197328z.f197340a.f239042f));
        } else if (this.f197328z.f197340a.f239050q) {
            this.f197338H.setVisibility(0);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            Log.m105924i("MicroMsg.MultiTaskViewBgParticleColorConfig", "getColorConfig " + C85875k4.m106211z());
            paint.setColor((C85875k4.m106211z() ? C77637c.f226350f : C77637c.f226351g).f226355d);
            this.f197338H.setBackground(shapeDrawable);
            this.f197338H.setImageResource(C0966R.raw.app_brand_destop_view_third_party_running_flag);
        }
        this.f44854d.setTag(C0966R.C0970id.c3_, new C78253a(mo94476C(), this.f44854d));
        this.f44854d.setOnClickListener(onClickListener);
        if (onLongClickListener == null) {
            this.f44854d.setHapticFeedbackEnabled(false);
        } else {
            this.f44854d.setOnLongClickListener(onLongClickListener);
        }
        View view3 = this.f44854d;
        Object[] objArr = new Object[2];
        objArr[0] = this.f197335E.getText().toString();
        if (this.f197336F.getVisibility() == 0) {
            str = this.f197336F.getText().toString();
        }
        objArr[1] = str;
        view3.setContentDescription(String.format("%s,%s", objArr));
    }

    /* renamed from: z */
    public void mo94474z(View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        mo94475B();
        this.f197335E.setVisibility(4);
        this.f197333C.setImageResource(C0966R.C0969drawable.f4892qe);
        this.f197333C.setAlpha(0.1f);
        this.f197332B.getLayoutParams().width = (int) (((float) C76577a.m92155f(mo94476C(), C0966R.dimen.f3960li)) * C76577a.m92165p(mo94476C()));
        this.f197332B.getLayoutParams().height = (int) (((float) C76577a.m92155f(mo94476C(), C0966R.dimen.f3960li)) * C76577a.m92165p(mo94476C()));
        this.f197332B.setImageResource(C0966R.raw.icons_filled_more);
        this.f197332B.setColorFilter(new PorterDuffColorFilter(C76577a.m92153d(mo94476C(), C0966R.color.BW_100_Alpha_0_5), PorterDuff.Mode.SRC_ATOP));
        this.f197336F.setVisibility(8);
        this.f44854d.setOnClickListener(onClickListener);
        this.f44854d.setOnLongClickListener(onLongClickListener);
    }
}
