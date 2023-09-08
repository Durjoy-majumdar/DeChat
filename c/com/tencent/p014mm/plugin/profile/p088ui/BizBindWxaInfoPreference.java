package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lb0.C88393a;
import lb0.C88394b;
import lb0.C88431k;
import p248ug.C52558c;

/* renamed from: com.tencent.mm.plugin.profile.ui.BizBindWxaInfoPreference */
public class BizBindWxaInfoPreference extends Preference {

    /* renamed from: X */
    public static DisplayMetrics f115287X = MMApplicationContext.getContext().getResources().getDisplayMetrics();

    /* renamed from: Y */
    public static int f115288Y = C76577a.m92151b(MMApplicationContext.getContext(), 15);

    /* renamed from: Z */
    public static int f115289Z = MMApplicationContext.getResources().getDimensionPixelSize(C0966R.dimen.f3924j4);

    /* renamed from: J */
    public volatile boolean f115290J;

    /* renamed from: K */
    public volatile boolean f115291K;

    /* renamed from: L */
    public List<WxaAttributes.WxaEntryInfo> f115292L;

    /* renamed from: M */
    public C52558c f115293M;

    /* renamed from: N */
    public View f115294N;

    /* renamed from: P */
    public ImageView f115295P;

    /* renamed from: Q */
    public TextView f115296Q;

    /* renamed from: R */
    public TextView f115297R;

    /* renamed from: S */
    public LinearLayout f115298S;

    /* renamed from: T */
    public ViewGroup f115299T;

    /* renamed from: U */
    public View f115300U;

    /* renamed from: V */
    public View.OnClickListener f115301V = new C42633j(this);

    /* renamed from: W */
    public View.OnClickListener f115302W = new C42636k(this);

    public BizBindWxaInfoPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: I */
    public void mo66721I(C52558c cVar, List<WxaAttributes.WxaEntryInfo> list) {
        this.f115291K = true;
        this.f115293M = cVar;
        List<WxaAttributes.WxaEntryInfo> list2 = this.f115292L;
        if (list2 == null) {
            this.f115292L = new LinkedList();
        } else {
            list2.clear();
        }
        if (list != null && !list.isEmpty()) {
            this.f115292L.addAll(list);
        }
        mo66723K();
    }

    /* renamed from: J */
    public final void mo66722J(WxaAttributes.WxaEntryInfo wxaEntryInfo, ImageView imageView, TextView textView) {
        if (wxaEntryInfo != null) {
            String str = wxaEntryInfo.f108666d;
            if (imageView != null) {
                imageView.setTag(str);
                String str2 = C88394b.f255384g;
                C88394b.C88418q.f255427a.mo122786b(imageView, wxaEntryInfo.f108669g, C88393a.m110230a(), C88431k.f255437d);
            }
            if (textView != null) {
                textView.setText(Util.nullAsNil(wxaEntryInfo.f108667e));
            }
        }
    }

    /* renamed from: K */
    public final void mo66723K() {
        if (this.f115290J && this.f115292L != null && this.f115291K) {
            this.f115291K = false;
            WxaAttributes.WxaEntryInfo wxaEntryInfo = !this.f115292L.isEmpty() ? this.f115292L.get(0) : null;
            if (wxaEntryInfo != null) {
                mo66722J(wxaEntryInfo, this.f115295P, this.f115296Q);
            }
            this.f115297R.setText(this.f121274d.getString(C0966R.string.bjv, new Object[]{Integer.valueOf(this.f115292L.size())}));
            LinearLayout linearLayout = this.f115298S;
            List<WxaAttributes.WxaEntryInfo> list = this.f115292L;
            linearLayout.removeAllViews();
            if (!list.isEmpty()) {
                int size = list.size();
                int measuredWidth = this.f115299T.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = f115287X.widthPixels;
                }
                int paddingLeft = (measuredWidth - this.f115299T.getPaddingLeft()) - this.f115299T.getPaddingRight();
                int i = paddingLeft / (f115289Z + f115288Y);
                if (i > size) {
                    View view = this.f115300U;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference", "attachItemToContainer", "(Landroid/widget/LinearLayout;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference", "attachItemToContainer", "(Landroid/widget/LinearLayout;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    View view3 = this.f115300U;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference", "attachItemToContainer", "(Landroid/widget/LinearLayout;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference", "attachItemToContainer", "(Landroid/widget/LinearLayout;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    i = (paddingLeft - this.f115300U.getMeasuredWidth()) / (f115289Z + f115288Y);
                }
                int min = Math.min(i, size);
                if (min > 1) {
                    for (int i2 = 0; i2 < min; i2++) {
                        ImageView imageView = new ImageView(this.f121274d);
                        int i3 = f115289Z;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(f115288Y + i3, i3));
                        imageView.setPadding(0, 0, f115288Y, 0);
                        this.f115298S.addView(imageView);
                        mo66722J(list.get(i2), imageView, (TextView) null);
                    }
                }
                Log.m105925i("MicroMsg.BizBindWxaInfoPreference", "attachItemToContainer(size : %s)", Integer.valueOf(list.size()));
            }
            if (this.f115292L.size() == 1) {
                View view5 = this.f115294N;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference", "tryToRefresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference", "tryToRefresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f115299T.setTag(this.f115292L.get(0).f108666d);
                this.f115299T.setOnClickListener(this.f115301V);
                return;
            }
            View view7 = this.f115294N;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference", "tryToRefresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference", "tryToRefresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f115299T.setTag((Object) null);
            this.f115299T.setOnClickListener(this.f115302W);
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        this.f115294N = view.findViewById(C0966R.C0970id.e_6);
        this.f115295P = (ImageView) view.findViewById(C0966R.C0970id.f1d);
        this.f115296Q = (TextView) view.findViewById(C0966R.C0970id.f359390ko1);
        this.f115297R = (TextView) view.findViewById(C0966R.C0970id.btx);
        this.f115300U = view.findViewById(C0966R.C0970id.f358767gz0);
        this.f115298S = (LinearLayout) view.findViewById(C0966R.C0970id.f357787br2);
        this.f115299T = (ViewGroup) view.findViewById(C0966R.C0970id.f358465fa1);
        boolean z = true;
        this.f115290J = true;
        if (this.f115292L == null) {
            z = false;
        }
        this.f115291K = z;
        mo66723K();
        super.mo1086w(view);
    }

    public BizBindWxaInfoPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BizBindWxaInfoPreference(Context context) {
        super(context);
    }
}
