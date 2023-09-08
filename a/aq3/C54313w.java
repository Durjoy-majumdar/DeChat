package aq3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import bp3.C54527k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.QueryImageData;
import com.tencent.p014mm.mm_compose.MMComposeView;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import p157gk.C59480d;
import p415q0.C110261c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: aq3.w */
public final class C54313w extends UIComponent {

    /* renamed from: d */
    public final C13601g f152433d = C36568h.m40985a(new C54314a(this));

    /* renamed from: e */
    public String f152434e = "";

    /* renamed from: f */
    public int f152435f;

    /* renamed from: g */
    public ArrayList<C59480d> f152436g = new ArrayList<>();

    /* renamed from: h */
    public ArrayList<QueryImageData> f152437h = new ArrayList<>();

    /* renamed from: aq3.w$a */
    public static final class C54314a extends C87413o implements C32224a<MMComposeView> {

        /* renamed from: d */
        public final /* synthetic */ C54313w f152438d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54314a(C54313w wVar) {
            super(0);
            this.f152438d = wVar;
        }

        public Object invoke() {
            return (MMComposeView) this.f152438d.findViewById(C0966R.C0970id.f358444me1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54313w(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("KEY_CROP_IMAGE_PATH");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f152434e = stringExtra;
        ArrayList<QueryImageData> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("KEY_PERSON_IMAGE_LIST");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = new ArrayList<>();
        }
        this.f152437h = parcelableArrayListExtra;
        this.f152435f = parcelableArrayListExtra.size();
        C54527k.f152883a.mo75391a(this.f152437h, this.f152436g);
        this.f152436g.add(0, new C59480d("TOP", new ArrayList()));
        ((MMComposeView) ((C36570n) this.f152433d).getValue()).setContent(C110261c.m149879c(1756060911, true, new C54316z(this)));
    }
}
