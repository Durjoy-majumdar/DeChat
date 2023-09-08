package gw1;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import da0.C58247e;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import te3.e94;

/* renamed from: gw1.b */
public final class C98254b implements View.OnClickListener {

    /* renamed from: d */
    public C98253a f288056d;

    /* renamed from: e */
    public final e94 f288057e;

    /* renamed from: f */
    public LinearLayout f288058f;

    /* renamed from: g */
    public ImageButton f288059g;

    /* renamed from: h */
    public TextView f288060h;

    /* renamed from: i */
    public LinearLayout f288061i;

    /* renamed from: j */
    public TextView f288062j;

    /* renamed from: n */
    public int f288063n = 1;

    /* renamed from: o */
    public C54219z<Integer> f288064o;

    /* renamed from: p */
    public C54219z<String> f288065p;

    /* renamed from: q */
    public C32224a<Boolean> f288066q;

    /* renamed from: gw1.b$a */
    public static final class C98255a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C98255a f288067d = new C98255a();

        public C98255a() {
            super(0);
        }

        public Object invoke() {
            return Boolean.FALSE;
        }
    }

    public C98254b(C98253a aVar, e94 e94) {
        LinearLayout linearLayout;
        C87412m.m108594g(aVar, "templateView");
        this.f288056d = aVar;
        this.f288057e = e94;
        boolean z = true;
        Integer value = MJTemplateHandleNew.f271085q.getValue();
        C87412m.m108591d(value);
        this.f288064o = new C54219z<>(Integer.valueOf(value.intValue()));
        String value2 = MJTemplateHandleNew.f271086r.getValue();
        C87412m.m108591d(value2);
        this.f288065p = new C54219z<>(value2);
        this.f288066q = C98255a.f288067d;
        AppCompatActivity activity = this.f288056d.getActivity();
        LinearLayout linearLayout2 = (LinearLayout) activity.findViewById(C0966R.C0970id.bw4);
        this.f288058f = (LinearLayout) activity.findViewById(C0966R.C0970id.glg);
        this.f288059g = (ImageButton) activity.findViewById(C0966R.C0970id.glf);
        TextView textView = (TextView) activity.findViewById(C0966R.C0970id.hqo);
        this.f288060h = textView;
        if (textView != null) {
            textView.setTextSize(0, (float) C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3927j7));
        }
        this.f288061i = (LinearLayout) activity.findViewById(C0966R.C0970id.fkd);
        this.f288062j = (TextView) activity.findViewById(C0966R.C0970id.fvj);
        ImageButton imageButton = this.f288059g;
        if (imageButton != null) {
            imageButton.setOnClickListener(this);
        }
        TextView textView2 = this.f288060h;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        if (MJTemplateHandleNew.f271089u) {
            LinearLayout linearLayout3 = this.f288058f;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
            }
            ImageButton imageButton2 = this.f288059g;
            if (imageButton2 != null) {
                imageButton2.setSelected(mo137556a());
            }
        }
        if (!this.f288056d.mo80213b() && (linearLayout = this.f288061i) != null) {
            linearLayout.setVisibility(8);
        }
        if ((e94 != null ? e94.f182943e : null) == null ? false : z) {
            ((C58247e) C86312j.m106911c(C58247e.class)).On0();
            mo137557b(0);
        }
    }

    /* renamed from: a */
    public final boolean mo137556a() {
        Integer value = this.f288064o.getValue();
        return value == null || value.intValue() != 0;
    }

    /* renamed from: b */
    public final void mo137557b(int i) {
        if (i == 0) {
            ImageButton imageButton = this.f288059g;
            if (imageButton != null) {
                imageButton.setSelected(true);
            }
            ImageButton imageButton2 = this.f288059g;
            if (imageButton2 != null) {
                imageButton2.setEnabled(false);
            }
            TextView textView = this.f288060h;
            if (textView != null) {
                textView.setClickable(false);
            }
            Log.m105920e("MicroMsg.MJTemplateUI", "[updateTemplateView] selectTemplateState.value = MJTemplateHandleNew.TemplateSelectType.SELECTED_NO_ENABLE_CHANGE.value");
            this.f288064o.setValue(2);
            this.f288063n = 2;
        } else if (mo137556a()) {
            ImageButton imageButton3 = this.f288059g;
            if (imageButton3 != null) {
                imageButton3.setSelected(true);
            }
            ImageButton imageButton4 = this.f288059g;
            if (imageButton4 != null) {
                imageButton4.setEnabled(true);
            }
            TextView textView2 = this.f288060h;
            if (textView2 != null) {
                textView2.setClickable(true);
            }
            Log.m105920e("MicroMsg.MJTemplateUI", "[updateTemplateView] selectTemplateState.value = MJTemplateHandleNew.TemplateSelectType.SELECTED.value");
            this.f288064o.setValue(1);
            this.f288063n = 1;
        }
        if (mo137556a()) {
            ((C58247e) C86312j.m106911c(C58247e.class)).On0();
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/gallery/mjtemplate/refactor/MJTemplateUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if ((valueOf != null && valueOf.intValue() == C0966R.C0970id.glf) || (valueOf != null && valueOf.intValue() == C0966R.C0970id.hqo)) {
            if (mo137556a() || this.f288066q.invoke().booleanValue()) {
                Log.m105918d("MicroMsg.MJTemplateUI", "updateSelectTemplate value = " + mo137556a());
                this.f288064o.setValue(mo137556a() ? 0 : 1);
                ImageButton imageButton = this.f288059g;
                if (imageButton != null) {
                    imageButton.setSelected(mo137556a());
                }
                if (mo137556a()) {
                    ((C58247e) C86312j.m106911c(C58247e.class)).On0();
                    ((MJTemplateHandleNew.C93943h) MJTemplateHandleNew.f271091w).invoke();
                }
            } else {
                Log.m105928w("MicroMsg.MJTemplateUI", "not enable to select");
                C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/mjtemplate/refactor/MJTemplateUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/mjtemplate/refactor/MJTemplateUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
