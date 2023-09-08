package i13;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.MMBottomSheetBehavior;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.C103422m;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import lc3.C10485b;
import sx3.C64197v;

/* renamed from: i13.a */
public final class C8840a extends C103422m {

    /* renamed from: f */
    public View f28059f;

    /* renamed from: g */
    public ImageView f28060g;

    /* renamed from: h */
    public LinearLayout f28061h;

    /* renamed from: i */
    public int f28062i = 1;

    /* renamed from: j */
    public ArrayList<Integer> f28063j = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<String> f28064n = new ArrayList<>();

    /* renamed from: o */
    public MMBottomSheetBehavior<View> f28065o;

    /* renamed from: p */
    public boolean f28066p;

    /* renamed from: q */
    public C8841a f28067q;

    /* renamed from: i13.a$a */
    public interface C8841a {
        /* renamed from: a */
        void mo9689a(int i);
    }

    /* renamed from: i13.a$b */
    public static final class C8842b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8840a f28068d;

        /* renamed from: e */
        public final /* synthetic */ int f28069e;

        public C8842b(C8840a aVar, int i) {
            this.f28068d = aVar;
            this.f28069e = i;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/transvoice/ui/LanguageChoiceDialog$updateSelectedType$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C8840a aVar = this.f28068d;
            aVar.f28062i = this.f28069e;
            aVar.mo9687E();
            C8840a aVar2 = this.f28068d;
            C8841a aVar3 = aVar2.f28067q;
            if (aVar3 != null) {
                aVar3.mo9689a(aVar2.f28062i);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/transvoice/ui/LanguageChoiceDialog$updateSelectedType$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8840a(Context context) {
        super(context, C0966R.style.f8831zf);
        C87412m.m108594g(context, "context");
        mo143460C(1);
        int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("VoiceInputLanguageSupportType", 1);
        if (LocaleUtil.isChineseAppLang()) {
            this.f28064n.add(getContext().getString(C0966R.string.f360932g30));
            this.f28063j.add(1);
            if ((b & 2) != 0) {
                this.f28064n.add(getContext().getString(C0966R.string.g2y));
                this.f28063j.add(2);
            }
            if ((b & 4) != 0) {
                this.f28064n.add(getContext().getString(C0966R.string.g2z));
                this.f28063j.add(4);
            }
            if ((b & 8) != 0) {
                this.f28064n.add(getContext().getString(C0966R.string.f360933g31));
                this.f28063j.add(8);
            }
        } else if (LocaleUtil.getApplicationLanguage().equals("en")) {
            this.f28064n.add(getContext().getString(C0966R.string.g2z));
            this.f28063j.add(4);
            this.f28064n.add(getContext().getString(C0966R.string.f360932g30));
            this.f28063j.add(1);
            if ((b & 2) != 0) {
                this.f28064n.add(getContext().getString(C0966R.string.g2y));
                this.f28063j.add(2);
            }
        }
    }

    /* renamed from: E */
    public final void mo9687E() {
        LinearLayout linearLayout = this.f28061h;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        int i = 0;
        for (T next : this.f28063j) {
            int i2 = i + 1;
            if (i >= 0) {
                int intValue = ((Number) next).intValue();
                View inflate = getLayoutInflater().inflate(C0966R.C0971layout.b3o, (ViewGroup) null);
                C87412m.m108592e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
                FrameLayout frameLayout = (FrameLayout) inflate;
                ((TextView) frameLayout.findViewById(C0966R.C0970id.fhi)).setText(this.f28064n.get(i));
                View findViewById = frameLayout.findViewById(C0966R.C0970id.fhh);
                int i3 = intValue == this.f28062i ? 0 : 4;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i3));
                C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/transvoice/ui/LanguageChoiceDialog", "updateSelectedType", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/transvoice/ui/LanguageChoiceDialog", "updateSelectedType", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                frameLayout.setOnClickListener(new C8842b(this, intValue));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                LinearLayout linearLayout2 = this.f28061h;
                if (linearLayout2 != null) {
                    linearLayout2.addView(frameLayout, layoutParams);
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        View view = null;
        this.f28059f = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.b3n, (ViewGroup) null, false);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        View view2 = this.f28059f;
        C87412m.m108591d(view2);
        setContentView(view2, layoutParams);
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(67108864);
            window.setLayout(-1, -1);
            window.setSoftInputMode(34);
            window.setDimAmount(0.5f);
            window.setWindowAnimations(C0966R.style.f8365fv);
        }
        View view3 = this.f28059f;
        if (view3 != null) {
            this.f28060g = (ImageView) view3.findViewById(C0966R.C0970id.bew);
            this.f28061h = (LinearLayout) view3.findViewById(C0966R.C0970id.fhf);
        }
        ImageView imageView = this.f28060g;
        if (imageView != null) {
            imageView.setOnClickListener(new C8843b(this));
        }
        View view4 = this.f28059f;
        if (view4 != null) {
            view = view4.findViewById(C0966R.C0970id.id_);
        }
        MMBottomSheetBehavior<View> y = MMBottomSheetBehavior.m137073y(view);
        this.f28065o = y;
        if (y != null) {
            y.f304916w = new C8844c(this);
        }
        mo9687E();
    }

    public void show() {
        super.show();
        MMBottomSheetBehavior<View> mMBottomSheetBehavior = this.f28065o;
        if (mMBottomSheetBehavior != null) {
            mMBottomSheetBehavior.mo143309A(3);
        }
    }
}
