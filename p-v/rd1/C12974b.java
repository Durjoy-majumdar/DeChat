package rd1;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.activity.uic.FinderActivityParticipateUIC;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import com.tencent.p014mm.plugin.finder.view.C4059g5;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import de3.C75355a0;
import er1.C58784w3;
import er1.C7888v2;
import f40.C86709a0;
import fy3.C32226l;
import go3.C76003c;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import je1.C9385w3;
import ke3.C88144b;
import md1.C10779c;
import nj3.C11182m0;
import nj3.C11184p0;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import p823sg.C101614i;
import qo3.C77407n;
import rx3.C13598b0;
import te3.C49295ek0;
import te3.C51270sn1;
import te3.C52271zj0;
import te3.C64258bf0;
import te3.C64311db1;

/* renamed from: rd1.b */
public final class C12974b extends C10779c implements C11385n {

    /* renamed from: f */
    public final C51270sn1 f37002f;

    /* renamed from: g */
    public C52271zj0 f37003g;

    /* renamed from: h */
    public C77407n f37004h;

    /* renamed from: rd1.b$a */
    public static final class C12975a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C12974b f37005d;

        public C12975a(C12974b bVar) {
            this.f37005d = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
            r2 = r2.f146006e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onCreateMMMenu(nj3.C76874e0 r10) {
            /*
                r9 = this;
                boolean r0 = r10.mo107176v()
                if (r0 == 0) goto L_0x008f
                rd1.b r0 = r9.f37005d
                boolean r0 = r0.mo11013d()
                rd1.b r1 = r9.f37005d
                te3.zj0 r2 = r1.f37003g
                r3 = 0
                if (r2 == 0) goto L_0x001a
                com.tencent.mm.protocal.protobuf.FinderContact r2 = r2.f146006e
                if (r2 == 0) goto L_0x001a
                java.lang.String r2 = r2.username
                goto L_0x001b
            L_0x001a:
                r2 = r3
            L_0x001b:
                zc1.b r4 = zc1.C66785b.f191882e
                java.lang.String r5 = r4.mo90662O5()
                boolean r2 = gy3.C87412m.m108589b(r2, r5)
                r5 = 0
                if (r2 == 0) goto L_0x0048
                er1.w3 r2 = er1.C58784w3.f168295a
                te3.sn1 r1 = r1.f37002f
                if (r1 == 0) goto L_0x0035
                te3.zj0 r6 = r1.f141633w
                if (r6 == 0) goto L_0x0035
                int r6 = r6.f146017s
                goto L_0x0036
            L_0x0035:
                r6 = 0
            L_0x0036:
                if (r1 == 0) goto L_0x003f
                te3.zj0 r1 = r1.f141633w
                if (r1 == 0) goto L_0x003f
                long r7 = r1.f146018t
                goto L_0x0041
            L_0x003f:
                r7 = 0
            L_0x0041:
                boolean r1 = r2.mo83868F0(r6, r7)
                if (r1 != 0) goto L_0x0048
                r5 = 1
            L_0x0048:
                if (r5 == 0) goto L_0x0062
                r1 = 10004(0x2714, float:1.4019E-41)
                rd1.b r2 = r9.f37005d
                androidx.appcompat.app.AppCompatActivity r2 = r2.f32250d
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131826052(0x7f111584, float:1.9284977E38)
                java.lang.String r2 = r2.getString(r3)
                r3 = 2131755735(0x7f1002d7, float:1.9142358E38)
                r10.mo107151k(r1, r2, r3, r0)
                goto L_0x008f
            L_0x0062:
                rd1.b r1 = r9.f37005d
                te3.zj0 r1 = r1.f37003g
                if (r1 == 0) goto L_0x006e
                com.tencent.mm.protocal.protobuf.FinderContact r1 = r1.f146006e
                if (r1 == 0) goto L_0x006e
                java.lang.String r3 = r1.username
            L_0x006e:
                java.lang.String r1 = r4.mo90662O5()
                boolean r1 = gy3.C87412m.m108589b(r3, r1)
                if (r1 != 0) goto L_0x008f
                r1 = 10005(0x2715, float:1.402E-41)
                rd1.b r2 = r9.f37005d
                androidx.appcompat.app.AppCompatActivity r2 = r2.f32250d
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131828142(0x7f111dae, float:1.9289217E38)
                java.lang.String r2 = r2.getString(r3)
                r3 = 2131756438(0x7f100596, float:1.9143784E38)
                r10.mo107151k(r1, r2, r3, r0)
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rd1.C12974b.C12975a.onCreateMMMenu(nj3.e0):void");
        }
    }

    /* renamed from: rd1.b$b */
    public static final class C12976b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C12974b f37006d;

        public C12976b(C12974b bVar) {
            this.f37006d = bVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            if (itemId == 10004) {
                C12974b bVar = this.f37006d;
                if (bVar.f37004h == null) {
                    C77407n nVar = new C77407n((Context) bVar.f32250d, 1, true);
                    nVar.mo107568m(bVar.f32250d.getResources().getString(C0966R.string.cy7), 17, bVar.f32250d.getResources().getDimensionPixelSize(C0966R.dimen.f3964lm));
                    nVar.f225771i = new C12978c(bVar);
                    nVar.f225782p = new C12979d(bVar);
                    nVar.f225761d = new C12980e(bVar);
                    bVar.f37004h = nVar;
                }
                C77407n nVar2 = bVar.f37004h;
                if (nVar2 != null && !nVar2.mo107563h()) {
                    nVar2.mo107573q();
                }
            } else if (itemId == 10005) {
                C12974b bVar2 = this.f37006d;
                AppCompatActivity appCompatActivity = bVar2.f32250d;
                C52271zj0 zj02 = bVar2.f37003g;
                long j = zj02 != null ? zj02.f146005d : 0;
                C87412m.m108594g(appCompatActivity, "context");
                String format = String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&topic_id=%s", Arrays.copyOf(new Object[]{68, C61926c.m72691p(j)}, 2));
                C87412m.m108593f(format, "format(format, *args)");
                Intent intent = new Intent();
                intent.putExtra("rawUrl", format);
                C88144b.m109791i(appCompatActivity, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
        }
    }

    /* renamed from: rd1.b$c */
    public static final class C12977c extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12974b f37007d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12977c(C12974b bVar) {
            super(1);
            this.f37007d = bVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((String) obj, LocaleUtil.ITALIAN);
            Log.m105924i("FinderActivityShareHandler", "setAnnounceView");
            C58784w3.f168295a.mo83935h1(this.f37007d.f32250d);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12974b(C51270sn1 sn12, AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f37002f = sn12;
        this.f37003g = sn12 != null ? sn12.f141633w : null;
    }

    /* renamed from: a */
    public void mo11010a(C77407n nVar) {
        C87412m.m108594g(nVar, "bottomSheet");
        nVar.f225773j = new C12975a(this);
        nVar.f225787r = new C12976b(this);
    }

    /* renamed from: b */
    public View mo11011b() {
        View inflate = C85868k2.m106137b(this.f32250d).inflate(C0966R.C0971layout.a8r, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f5485gf);
        String string = this.f32250d.getResources().getString(C0966R.string.cy6);
        C87412m.m108593f(string, "activity.resources.getSt…r_activity_announce_name)");
        String string2 = this.f32250d.getResources().getString(C0966R.string.eoz, new Object[]{string});
        C87412m.m108593f(string2, "activity.resources.getSt…n_announce, announceName)");
        SpannableString spannableString = new SpannableString(string2 + ' ');
        AppCompatActivity appCompatActivity = this.f32250d;
        Drawable e = C74933u4.m89768e(appCompatActivity, C0966R.raw.icons_outlined_arrow, appCompatActivity.getResources().getColor(C0966R.color.FG_1));
        e.setBounds(0, 0, (int) this.f32250d.getResources().getDimension(C0966R.dimen.a68), (int) this.f32250d.getResources().getDimension(C0966R.dimen.f3723cd));
        spannableString.setSpan(new C76003c(e, 1), spannableString.length() - 1, spannableString.length(), 17);
        spannableString.setSpan(new C4059g5(string2, this.f32250d.getResources().getColor(C0966R.color.f3595yw), this.f32250d.getResources().getColor(C0966R.color.ahf), false, false, new C12977c(this)), string2.length() - 6, string2.length(), 17);
        textView.setOnTouchListener(new C75355a0(this.f32250d));
        textView.setText(spannableString);
        return inflate;
    }

    /* renamed from: d */
    public boolean mo11013d() {
        C52271zj0 zj02 = this.f37003g;
        String str = null;
        boolean isNullOrNil = Util.isNullOrNil(zj02 != null ? zj02.f146007f : null);
        StringBuilder sb = new StringBuilder();
        sb.append("notShare ");
        sb.append(isNullOrNil);
        sb.append(", ");
        C52271zj0 zj03 = this.f37003g;
        if (zj03 != null) {
            str = zj03.f146007f;
        }
        sb.append(Util.isNullOrNil(str));
        Log.m105924i("FinderActivityShareHandler", sb.toString());
        return isNullOrNil;
    }

    /* renamed from: e */
    public void mo11014e() {
        C86709a0.m107524d().mo123455a(5909, this);
    }

    /* renamed from: f */
    public void mo11015f() {
        C86709a0.m107524d().mo123470p(5909, this);
    }

    /* renamed from: g */
    public void mo11016g() {
        C7888v2.C7889a aVar = C7888v2.f26513a;
        AppCompatActivity appCompatActivity = this.f32250d;
        C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) appCompatActivity;
        C52271zj0 zj02 = this.f37003g;
        String str = null;
        String str2 = zj02 != null ? zj02.f146007f : null;
        long j = zj02 != null ? (long) zj02.f146009h : 0;
        if (zj02 != null) {
            str = zj02.f146010i;
        }
        aVar.mo9001A(mMActivity, str2, 7, j, str == null ? "" : str, mo12505k(), (C64311db1) null, 9, "", mo12506l());
    }

    /* renamed from: h */
    public void mo11017h() {
        C7888v2.C7889a aVar = C7888v2.f26513a;
        AppCompatActivity appCompatActivity = this.f32250d;
        C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) appCompatActivity;
        C52271zj0 zj02 = this.f37003g;
        String str = null;
        String str2 = zj02 != null ? zj02.f146007f : null;
        long j = zj02 != null ? (long) zj02.f146009h : 0;
        if (zj02 != null) {
            str = zj02.f146010i;
        }
        aVar.mo9002C(mMActivity, str2, 7, j, str == null ? "" : str, mo12505k(), (C64311db1) null, 9, "", mo12506l());
    }

    /* renamed from: j */
    public boolean mo11019j() {
        C49295ek0 ek02;
        C52271zj0 zj02 = this.f37003g;
        boolean z = false;
        if (!(zj02 == null || (ek02 = zj02.f146023y) == null || ek02.f132975j)) {
            z = true;
        }
        return !z;
    }

    /* renamed from: k */
    public final String mo12505k() {
        int i = ((FinderActivityParticipateUIC) C39818r.f106831a.mo62444c(this.f32250d).mo75002a(FinderActivityParticipateUIC.class)).f12496q;
        C58784w3 w3Var = C58784w3.f168295a;
        AppCompatActivity appCompatActivity = this.f32250d;
        C52271zj0 zj02 = this.f37003g;
        return w3Var.mo83885M(appCompatActivity, zj02 != null ? zj02.f146023y : null, i);
    }

    /* renamed from: l */
    public final C64258bf0 mo12506l() {
        String str;
        String str2;
        Object obj;
        C49295ek0 ek02;
        FinderContact finderContact;
        C64258bf0 bf02 = new C64258bf0();
        C52271zj0 zj02 = this.f37003g;
        long j = 0;
        bf02.f182280d = C61926c.m72691p(zj02 != null ? zj02.f146005d : 0);
        C52271zj0 zj03 = this.f37003g;
        String str3 = "";
        if (zj03 == null || (str = zj03.f146007f) == null) {
            str = str3;
        }
        bf02.f182281e = str;
        if (zj03 == null || (finderContact = zj03.f146006e) == null || (str2 = finderContact.nickname) == null) {
            str2 = str3;
        }
        bf02.f182282f = str2;
        if (zj03 != null) {
            j = zj03.f146022x;
        }
        bf02.f182284h = j;
        if (zj03 == null || (ek02 = zj03.f146023y) == null || (obj = ek02.f132977o) == null) {
            obj = MMApplicationContext.getContext().getText(C0966R.string.d2h);
        }
        String str4 = (String) obj;
        if (str4 != null) {
            str3 = str4;
        }
        bf02.f182285i = str3;
        return bf02;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        FinderContact finderContact;
        if ((yVar instanceof C9385w3) && ((C9385w3) yVar).f29316g == 1) {
            if (i == 0 && i2 == 0) {
                C101614i<String, FinderProfileHeaderUIC.C3463b> iVar = FinderProfileHeaderUIC.f16192h1;
                C101614i<String, FinderProfileHeaderUIC.C3463b> iVar2 = FinderProfileHeaderUIC.f16192h1;
                C52271zj0 zj02 = this.f37003g;
                if (zj02 == null || (finderContact = zj02.f146006e) == null || (str2 = finderContact.username) == null) {
                    str2 = "";
                }
                iVar2.remove(str2);
                if (!this.f32250d.isFinishing()) {
                    this.f32250d.finish();
                }
            } else if (i2 == -4059) {
                FinderActivityParticipateUIC finderActivityParticipateUIC = (FinderActivityParticipateUIC) C39818r.f106831a.mo62444c(this.f32250d).mo75002a(FinderActivityParticipateUIC.class);
                WeImageView weImageView = finderActivityParticipateUIC.f12491i;
                if (weImageView != null) {
                    weImageView.setVisibility(8);
                }
                TextView textView = finderActivityParticipateUIC.f12492j;
                if (textView != null) {
                    textView.setText(finderActivityParticipateUIC.mo2221k3());
                }
            }
        }
    }
}
