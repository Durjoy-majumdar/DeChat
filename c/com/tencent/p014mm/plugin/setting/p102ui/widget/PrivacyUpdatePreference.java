package com.tencent.p014mm.plugin.setting.p102ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.newtips.model.C115619a;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.tg4;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bB\u0013\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\f¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/plugin/setting/ui/widget/PrivacyUpdatePreference;", "Lcom/tencent/mm/ui/base/preference/Preference;", "Lcom/tencent/mm/plugin/newtips/model/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "plugin-setting_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.setting.ui.widget.PrivacyUpdatePreference */
public final class PrivacyUpdatePreference extends Preference implements C115619a {

    /* renamed from: P */
    public static boolean f205996P;

    /* renamed from: J */
    public View f205997J;

    /* renamed from: K */
    public View f205998K;

    /* renamed from: L */
    public tg4 f205999L;

    /* renamed from: M */
    public final C13601g f206000M = C36568h.m40985a(new C71173b(this));

    /* renamed from: N */
    public final C13601g f206001N = C36568h.m40985a(new C71172a(this));

    /* renamed from: com.tencent.mm.plugin.setting.ui.widget.PrivacyUpdatePreference$a */
    public static final class C71172a extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ PrivacyUpdatePreference f206002d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71172a(PrivacyUpdatePreference privacyUpdatePreference) {
            super(0);
            this.f206002d = privacyUpdatePreference;
        }

        public Object invoke() {
            View view = this.f206002d.f205998K;
            if (view != null) {
                return (ImageView) view.findViewById(C0966R.C0970id.iis);
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.widget.PrivacyUpdatePreference$b */
    public static final class C71173b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ PrivacyUpdatePreference f206003d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71173b(PrivacyUpdatePreference privacyUpdatePreference) {
            super(0);
            this.f206003d = privacyUpdatePreference;
        }

        public Object invoke() {
            View view = this.f206003d.f205998K;
            if (view != null) {
                return (TextView) view.findViewById(16908310);
            }
            return null;
        }
    }

    public PrivacyUpdatePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: e */
    public View mo64133e() {
        if (this.f205997J == null) {
            this.f205997J = new View(this.f121274d);
        }
        Log.m105924i("MicroMsg.PrivacyUpdatePreference", "getRoot");
        View view = this.f205997J;
        C87412m.m108591d(view);
        return view;
    }

    /* renamed from: f */
    public boolean mo25956f(boolean z) {
        return false;
    }

    /* renamed from: g */
    public boolean mo25958g(boolean z, tg4 tg4) {
        return false;
    }

    public String getPath() {
        return "privacyUpdate";
    }

    /* renamed from: h */
    public boolean mo25960h(boolean z) {
        return false;
    }

    /* renamed from: i */
    public boolean mo25962i(boolean z, tg4 tg4) {
        tg4 tg42 = tg4;
        StringBuilder sb = new StringBuilder();
        sb.append("showRedPointTitle. ");
        sb.append(tg42 != null ? tg42.f354436e : null);
        Log.m105924i("MicroMsg.PrivacyUpdatePreference", sb.toString());
        int i = 8;
        if (z) {
            if (tg42 != null) {
                TextView textView = (TextView) ((C36570n) this.f206000M).getValue();
                if (textView != null) {
                    textView.setText(tg42.f354436e);
                }
                ImageView imageView = (ImageView) ((C36570n) this.f206001N).getValue();
                if (imageView != null) {
                    if (!f205996P) {
                        i = 0;
                    }
                    imageView.setVisibility(i);
                }
                View view = this.f205998K;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/widget/PrivacyUpdatePreference", "showRedPointTitle", "(ZLcom/tencent/mm/protocal/protobuf/TipsInfo;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/setting/ui/widget/PrivacyUpdatePreference", "showRedPointTitle", "(ZLcom/tencent/mm/protocal/protobuf/TipsInfo;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            this.f205999L = tg42;
            return true;
        }
        View view3 = this.f205998K;
        if (view3 == null) {
            return true;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/widget/PrivacyUpdatePreference", "showRedPointTitle", "(ZLcom/tencent/mm/protocal/protobuf/TipsInfo;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/setting/ui/widget/PrivacyUpdatePreference", "showRedPointTitle", "(ZLcom/tencent/mm/protocal/protobuf/TipsInfo;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }

    /* renamed from: j */
    public boolean mo64135j(boolean z, tg4 tg4) {
        return false;
    }

    /* renamed from: k */
    public void mo64136k(C115631n nVar, boolean z) {
    }

    /* renamed from: l */
    public boolean mo64137l() {
        return false;
    }

    /* renamed from: m */
    public boolean mo64138m(boolean z) {
        return false;
    }

    /* renamed from: n */
    public boolean mo64139n(boolean z, tg4 tg4) {
        return false;
    }

    /* renamed from: o */
    public void mo64140o(boolean z, C115631n nVar) {
        Log.m105924i("MicroMsg.PrivacyUpdatePreference", "showNewTips");
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        mo25962i(true, this.f205999L);
        Log.m105924i("MicroMsg.PrivacyUpdatePreference", "onBindView");
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        this.f205998K = x;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(x, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/widget/PrivacyUpdatePreference", "onCreateView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        x.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(x, "com/tencent/mm/plugin/setting/ui/widget/PrivacyUpdatePreference", "onCreateView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        Log.m105924i("MicroMsg.PrivacyUpdatePreference", "onCreateView");
        View view = this.f205998K;
        C87412m.m108591d(view);
        return view;
    }

    public PrivacyUpdatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivacyUpdatePreference(Context context) {
        super(context);
    }
}
