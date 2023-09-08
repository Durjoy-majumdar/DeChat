package if2;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.profile.p088ui.newbizinfo.auth.NewBizInfoAuthMainUI;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C75597w2;
import fy0.C8219i;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p196ln.C76708i;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sf0.C77702q0;

/* renamed from: if2.d */
public final class C8887d extends UIComponent {

    /* renamed from: d */
    public final C13601g f28154d;

    /* renamed from: e */
    public final C13601g f28155e;

    /* renamed from: f */
    public final C13601g f28156f;

    /* renamed from: g */
    public final C13601g f28157g;

    /* renamed from: if2.d$a */
    public static final class C8888a extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f28158d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8888a(AppCompatActivity appCompatActivity) {
            super(0);
            this.f28158d = appCompatActivity;
        }

        public Object invoke() {
            return (ImageView) this.f28158d.findViewById(C0966R.C0970id.bn8);
        }
    }

    /* renamed from: if2.d$b */
    public static final class C8889b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f28159d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8889b(AppCompatActivity appCompatActivity) {
            super(0);
            this.f28159d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f28159d.findViewById(C0966R.C0970id.bn_);
        }
    }

    /* renamed from: if2.d$c */
    public static final class C8890c extends C87413o implements C32224a<NewBizInfoAuthMainUI> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f28160d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8890c(AppCompatActivity appCompatActivity) {
            super(0);
            this.f28160d = appCompatActivity;
        }

        public Object invoke() {
            AppCompatActivity appCompatActivity = this.f28160d;
            C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoAuthMainUI");
            return (NewBizInfoAuthMainUI) appCompatActivity;
        }
    }

    /* renamed from: if2.d$d */
    public static final class C8891d extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f28161d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8891d(AppCompatActivity appCompatActivity) {
            super(0);
            this.f28161d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f28161d.findViewById(C0966R.C0970id.bng);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8887d(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f28154d = C36568h.m40985a(new C8888a(appCompatActivity));
        this.f28155e = C36568h.m40985a(new C8891d(appCompatActivity));
        this.f28156f = C36568h.m40985a(new C8889b(appCompatActivity));
        this.f28157g = C36568h.m40985a(new C8890c(appCompatActivity));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("Contact_Nick");
        C76708i iVar = (C76708i) C86312j.m106911c(C76708i.class);
        String str = ((NewBizInfoAuthMainUI) ((C36570n) this.f28157g).getValue()).f20304d;
        if (str != null) {
            Bitmap N50 = iVar.N50(str);
            if (N50 != null) {
                ((ImageView) ((C36570n) this.f28154d).getValue()).setImageBitmap(BitmapUtil.getRoundedCornerBitmap(N50, false, ((float) N50.getWidth()) * 0.5f));
            }
            C8219i.f27144a.mo9271b((TextView) ((C36570n) this.f28156f).getValue());
            if (!C77702q0.m93719b(stringExtra)) {
                String str2 = ((NewBizInfoAuthMainUI) ((C36570n) this.f28157g).getValue()).f20304d;
                if (str2 == null) {
                    C87412m.m108603p("username");
                    throw null;
                } else if (!C87412m.m108589b(stringExtra, str2)) {
                    ((TextView) ((C36570n) this.f28155e).getValue()).setText(stringExtra);
                    return;
                }
            }
            C75597w2 a = C31519v2.m39436a();
            String str3 = ((NewBizInfoAuthMainUI) ((C36570n) this.f28157g).getValue()).f20304d;
            if (str3 != null) {
                a.mo55988e(str3, "", new C8892e(this, stringExtra));
            } else {
                C87412m.m108603p("username");
                throw null;
            }
        } else {
            C87412m.m108603p("username");
            throw null;
        }
    }
}
