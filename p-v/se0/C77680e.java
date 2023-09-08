package se0;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.openim.model.IOpenIMKefuConfirmController;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import di3.C86312j;
import ge0.C32415b;
import gy3.C87412m;
import he0.C46020f;
import he0.C46027q;
import he0.C76158j;
import j20.C117292a;
import java.util.ArrayList;
import re0.C36314k;
import vd3.C78391d;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: se0.e */
public final class C77680e extends C77668b implements MStorage.IOnStorageChange {

    /* renamed from: h */
    public final ViewGroup f226440h;

    /* renamed from: i */
    public final TextView f226441i;

    /* renamed from: j */
    public final TextView f226442j;

    /* renamed from: n */
    public final ImageView f226443n;

    /* renamed from: o */
    public final TextView f226444o;

    /* renamed from: p */
    public final TextView f226445p;

    /* renamed from: q */
    public final TextView f226446q;

    /* renamed from: r */
    public C46020f f226447r;

    /* renamed from: se0.e$a */
    public static final class C77681a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C77680e f226448d;

        public C77681a(C77680e eVar) {
            this.f226448d = eVar;
        }

        public final void run() {
            C77680e.m93665h(this.f226448d);
        }
    }

    /* renamed from: se0.e$b */
    public static final class C77682b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77680e f226449d;

        /* renamed from: e */
        public final /* synthetic */ int f226450e;

        public C77682b(C77680e eVar, int i) {
            this.f226449d = eVar;
            this.f226450e = i;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/openim/ui/OpenIMKefuConfirmFullUIModelImpl$showConfirmUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            IOpenIMKefuConfirmController iOpenIMKefuConfirmController = this.f226449d.f226424e;
            if (iOpenIMKefuConfirmController != null) {
                iOpenIMKefuConfirmController.mo33202b(this.f226450e);
            }
            C117292a.m165361g(this, "com/tencent/mm/openim/ui/OpenIMKefuConfirmFullUIModelImpl$showConfirmUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77680e(Activity activity) {
        super(activity);
        C87412m.m108594g(activity, "context");
        this.f226423d = activity;
        View findViewById = activity.findViewById(C0966R.C0970id.bl5);
        C87412m.m108593f(findViewById, "context.findViewById(R.id.confirm_container)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        this.f226440h = viewGroup;
        viewGroup.setVisibility(0);
        View findViewById2 = activity.findViewById(C0966R.C0970id.blu);
        C87412m.m108593f(findViewById2, "context.findViewById(R.id.confirm_title)");
        View findViewById3 = activity.findViewById(C0966R.C0970id.bl6);
        C87412m.m108593f(findViewById3, "context.findViewById(R.id.confirm_desc)");
        TextView textView = (TextView) findViewById3;
        this.f226441i = textView;
        View findViewById4 = activity.findViewById(C0966R.C0970id.bl4);
        C87412m.m108593f(findViewById4, "context.findViewById(R.id.confirm_button)");
        TextView textView2 = (TextView) findViewById4;
        this.f226442j = textView2;
        View findViewById5 = activity.findViewById(C0966R.C0970id.bec);
        C87412m.m108593f(findViewById5, "context.findViewById(R.id.close_btn)");
        View findViewById6 = activity.findViewById(C0966R.C0970id.fg7);
        C87412m.m108593f(findViewById6, "context.findViewById(R.id.kf_avatar)");
        ImageView imageView = (ImageView) findViewById6;
        this.f226443n = imageView;
        View findViewById7 = activity.findViewById(C0966R.C0970id.fg9);
        C87412m.m108593f(findViewById7, "context.findViewById(R.id.kf_nickname)");
        TextView textView3 = (TextView) findViewById7;
        this.f226444o = textView3;
        View findViewById8 = activity.findViewById(C0966R.C0970id.fg8);
        C87412m.m108593f(findViewById8, "context.findViewById(R.id.kf_desc_wording)");
        this.f226445p = (TextView) findViewById8;
        View findViewById9 = activity.findViewById(C0966R.C0970id.fg6);
        C87412m.m108593f(findViewById9, "context.findViewById(R.id.kf_antispam_tips)");
        this.f226446q = (TextView) findViewById9;
        ((C32415b) C86312j.m106911c(C32415b.class)).Bx0().add(this);
        C85875k4.m106189j0(((TextView) findViewById2).getPaint(), 0.8f);
        C85875k4.m106189j0(textView2.getPaint(), 0.8f);
        ((TextView) findViewById5).setOnClickListener(new C77679d(this));
        textView.setVisibility(8);
        imageView.setVisibility(8);
        textView3.setVisibility(8);
        textView2.setEnabled(false);
    }

    /* renamed from: h */
    public static final void m93665h(C77680e eVar) {
        eVar.mo107830g(0, "");
    }

    /* renamed from: a */
    public void mo35492a() {
        super.mo35492a();
    }

    /* renamed from: b */
    public void mo35493b(int i, int i2, C46027q qVar) {
        String str;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator startDelay;
        C87412m.m108594g(qVar, "confirmData");
        super.mo35493b(i, i2, qVar);
        C46020f fVar = qVar.f124111d;
        this.f226447r = fVar;
        this.f226442j.setOnClickListener(new C77682b(this, i));
        boolean z = false;
        this.f226441i.setVisibility(0);
        this.f226443n.setVisibility(0);
        this.f226444o.setVisibility(0);
        this.f226442j.setEnabled(true);
        TextView textView = this.f226444o;
        if (fVar == null || (str = fVar.getNickname()) == null) {
            str = "";
        }
        textView.setText(str);
        C87412m.m108593f(fVar, "contact");
        mo107837i(fVar.mo71442Q(), ((C76158j) C86312j.m106911c(C76158j.class)).mo106373wo(fVar.mo71442Q(), fVar.mo71448t0()));
        String str2 = qVar.f124113f;
        if (!(str2 == null || str2.length() == 0)) {
            this.f226446q.setText(qVar.f124113f);
            this.f226446q.setVisibility(0);
        } else {
            this.f226446q.setVisibility(8);
        }
        C78391d.C78393b.m94669a(this.f226443n, fVar.getUsername());
        ViewGroup viewGroup = this.f226440h;
        viewGroup.setVisibility(0);
        IOpenIMKefuConfirmController iOpenIMKefuConfirmController = this.f226424e;
        int scene = iOpenIMKefuConfirmController != null ? iOpenIMKefuConfirmController.getScene() : -1;
        if (scene == 3 || scene == 5) {
            z = true;
        }
        if (z) {
            viewGroup.setAlpha(0.0f);
            ViewPropertyAnimator animate = viewGroup.animate();
            if (animate != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(200)) != null && (startDelay = duration.setStartDelay(100)) != null) {
                startDelay.start();
                return;
            }
            return;
        }
        viewGroup.setAlpha(1.0f);
    }

    /* renamed from: c */
    public void mo35494c() {
        IOpenIMKefuConfirmController iOpenIMKefuConfirmController = this.f226424e;
        boolean z = true;
        if (iOpenIMKefuConfirmController == null || !iOpenIMKefuConfirmController.mo33205d()) {
            z = false;
        }
        if (z) {
            super.mo35494c();
        }
    }

    /* renamed from: d */
    public void mo35495d() {
        C119179t tVar = C119157j.f356862d;
        C77681a aVar = new C77681a(this);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(aVar, 400, false);
    }

    /* renamed from: e */
    public void mo35496e(IOpenIMKefuConfirmController iOpenIMKefuConfirmController) {
        C87412m.m108594g(iOpenIMKefuConfirmController, "confirmController");
        super.mo35496e(iOpenIMKefuConfirmController);
        this.f226440h.setVisibility(0);
        Activity activity = this.f226423d;
        if (activity instanceof MMActivity) {
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            MMActivityController controller = ((MMActivity) activity).getController();
            Activity activity2 = this.f226423d;
            C87412m.m108591d(activity2);
            controller.mo177105z0(activity2.getResources().getColor(C0966R.color.al6));
        }
    }

    /* renamed from: f */
    public void mo35497f() {
        IOpenIMKefuConfirmController iOpenIMKefuConfirmController = this.f226424e;
        boolean z = true;
        if (iOpenIMKefuConfirmController == null || !iOpenIMKefuConfirmController.mo33201a()) {
            z = false;
        }
        if (z) {
            super.mo35497f();
        }
    }

    /* renamed from: i */
    public final void mo107837i(String str, String str2) {
        if (!(str2 == null || str2.length() == 0)) {
            if (C87412m.m108589b("3552365301", str)) {
                str2 = '@' + str2;
            }
            this.f226445p.setText(str2);
            this.f226445p.setVisibility(0);
            return;
        }
        this.f226445p.setText("");
        this.f226445p.setVisibility(8);
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        if (!(str == null || str.length() == 0) && mStorageEventData != null) {
            Object obj = mStorageEventData.obj;
            if (obj instanceof C36314k) {
                C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.openim.storage.OpenIMWordingInfo");
                C36314k kVar = (C36314k) obj;
                String str2 = kVar.field_appid;
                C46020f fVar = this.f226447r;
                String str3 = null;
                if (C87412m.m108589b(str2, fVar != null ? fVar.mo71442Q() : null)) {
                    String str4 = kVar.field_wordingId;
                    C46020f fVar2 = this.f226447r;
                    if (fVar2 != null) {
                        str3 = fVar2.mo71448t0();
                    }
                    if (C87412m.m108589b(str4, str3)) {
                        Log.m105925i("MicroMsg.OpenIMKefuConfirmFullUIModelImpl", "onNotifyChange openImAppId: %s, wordingId: %s, wording: %s", kVar.field_appid, kVar.field_wordingId, kVar.field_wording);
                        mo107837i(kVar.field_appid, kVar.field_wording);
                    }
                }
            }
        }
    }

    public void release() {
        this.f226423d = null;
        ((C32415b) C86312j.m106911c(C32415b.class)).Bx0().remove(this);
    }
}
