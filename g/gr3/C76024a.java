package gr3;

import android.text.InputFilter;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.formview.C75212a;
import com.tencent.p014mm.wallet_core.p137ui.formview.EditHintPasswdView;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tenpay.android.wechat.TenpaySecureEditText;
import eb0.C75592q0;
import hr3.C76241b;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: gr3.a */
public class C76024a {

    /* renamed from: gr3.a$a */
    public class C76025a extends C76034j {
        public C76025a() {
            super((C76026b) null);
        }

        /* renamed from: d */
        public boolean mo99320d(WalletFormView walletFormView) {
            TenpaySecureEditText tenpaySecureEditText = walletFormView.f221285g;
            if (tenpaySecureEditText == null) {
                return false;
            }
            return tenpaySecureEditText.isMoneyAmount();
        }
    }

    /* renamed from: gr3.a$b */
    public class C76026b extends C76034j {
        public C76026b() {
            super((C76026b) null);
        }

        /* renamed from: a */
        public boolean mo99317a(WalletFormView walletFormView, String str) {
            if (Util.isNullOrNil(str) || str.length() > 5) {
                return false;
            }
            walletFormView.setSelection(0);
            walletFormView.set3DesToView(str);
            walletFormView.setMaxInputLength(24 - str.length());
            walletFormView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(walletFormView.getMaxInputLength())});
            return true;
        }

        /* renamed from: c */
        public boolean mo99319c(WalletFormView walletFormView, String str) {
            if (Util.isNullOrNil(str) || str.length() > 5) {
                return false;
            }
            walletFormView.setSelection(0);
            walletFormView.setBankcardTail(str);
            walletFormView.setMaxInputLength(24 - str.length());
            walletFormView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(walletFormView.getMaxInputLength())});
            return true;
        }

        /* renamed from: d */
        public boolean mo99320d(WalletFormView walletFormView) {
            TenpaySecureEditText tenpaySecureEditText = walletFormView.f221285g;
            if (tenpaySecureEditText == null) {
                return false;
            }
            return tenpaySecureEditText.isBankcardNum();
        }

        /* renamed from: e */
        public String mo99321e(WalletFormView walletFormView, String str) {
            return Util.nullAs(str, "").replaceAll(" ", "");
        }
    }

    /* renamed from: gr3.a$c */
    public class C76027c extends C76034j {
        public C76027c() {
            super((C76026b) null);
        }

        /* renamed from: b */
        public boolean mo99318b() {
            return true;
        }

        /* renamed from: e */
        public String mo99321e(WalletFormView walletFormView, String str) {
            return Util.nullAs((String) walletFormView.getTag(), "").replace("/", "");
        }
    }

    /* renamed from: gr3.a$d */
    public class C76028d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WalletFormView f222891d;

        /* renamed from: e */
        public final /* synthetic */ MMActivity f222892e;

        public C76028d(WalletFormView walletFormView, MMActivity mMActivity) {
            this.f222891d = walletFormView;
            this.f222892e = mMActivity;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/wallet_core/ui/formview/CommonHintViewConfig$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f222891d.getContext();
            int i = C75592q0.m90763K() ? C0966R.C0971layout.cfz : C0966R.C0971layout.ceg;
            this.f222891d.getContext();
            C76040e.m91345b(this.f222892e, i, C75592q0.m90763K() ? C0966R.string.kor : C0966R.string.koo);
            C117292a.m165361g(this, "com/tencent/mm/wallet_core/ui/formview/CommonHintViewConfig$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: gr3.a$e */
    public class C76029e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WalletFormView f222893d;

        /* renamed from: e */
        public final /* synthetic */ MMActivity f222894e;

        public C76029e(WalletFormView walletFormView, MMActivity mMActivity) {
            this.f222893d = walletFormView;
            this.f222894e = mMActivity;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/wallet_core/ui/formview/CommonHintViewConfig$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f222893d.getContext();
            C76040e.m91345b(this.f222894e, C75592q0.m90763K() ? C0966R.C0971layout.f7115yr : C0966R.C0971layout.f7114yq, C0966R.string.bwr);
            C117292a.m165361g(this, "com/tencent/mm/wallet_core/ui/formview/CommonHintViewConfig$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: gr3.a$f */
    public class C76030f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f222895d;

        public C76030f(MMActivity mMActivity) {
            this.f222895d = mMActivity;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/wallet_core/ui/formview/CommonHintViewConfig$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76040e.m91345b(this.f222895d, C0966R.C0971layout.f360061cg0, C0966R.string.kpr);
            C117292a.m165361g(this, "com/tencent/mm/wallet_core/ui/formview/CommonHintViewConfig$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: gr3.a$g */
    public class C76031g extends C76034j {
        public C76031g() {
            super((C76026b) null);
        }

        /* renamed from: d */
        public boolean mo99320d(WalletFormView walletFormView) {
            TenpaySecureEditText tenpaySecureEditText = walletFormView.f221285g;
            if (tenpaySecureEditText == null) {
                return false;
            }
            return tenpaySecureEditText.isPhoneNum();
        }
    }

    /* renamed from: gr3.a$h */
    public class C76032h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f222896d;

        public C76032h(MMActivity mMActivity) {
            this.f222896d = mMActivity;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/wallet_core/ui/formview/CommonHintViewConfig$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76040e.m91345b(this.f222896d, C0966R.C0971layout.cfc, C0966R.string.kpi);
            C117292a.m165361g(this, "com/tencent/mm/wallet_core/ui/formview/CommonHintViewConfig$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: gr3.a$i */
    public static class C76033i extends C76034j {

        /* renamed from: a */
        public int f222897a;

        /* renamed from: b */
        public WalletFormView f222898b;

        public C76033i(int i, WalletFormView walletFormView) {
            super((C76026b) null);
            this.f222898b = walletFormView;
            this.f222897a = i;
            if (i == 1) {
                if (walletFormView != null) {
                    walletFormView.setKeyListener(new C76039d(this));
                }
            } else if (walletFormView != null) {
                walletFormView.setInputType(1);
            }
        }

        /* renamed from: d */
        public boolean mo99320d(WalletFormView walletFormView) {
            int i = this.f222897a;
            TenpaySecureEditText tenpaySecureEditText = walletFormView.f221285g;
            if (tenpaySecureEditText == null) {
                return false;
            }
            return tenpaySecureEditText.isAreaIDCardNum(i);
        }

        /* renamed from: f */
        public void mo106242f(int i) {
            this.f222897a = i;
            if (i == 1) {
                WalletFormView walletFormView = this.f222898b;
                if (walletFormView != null) {
                    walletFormView.setKeyListener(new C76039d(this));
                    return;
                }
                return;
            }
            WalletFormView walletFormView2 = this.f222898b;
            if (walletFormView2 != null) {
                walletFormView2.setInputType(1);
            }
        }
    }

    /* renamed from: gr3.a$j */
    public static class C76034j implements C76241b {
        public C76034j(C76026b bVar) {
        }

        /* renamed from: a */
        public boolean mo99317a(WalletFormView walletFormView, String str) {
            return false;
        }

        /* renamed from: b */
        public boolean mo99318b() {
            return this instanceof C76026b;
        }

        /* renamed from: c */
        public boolean mo99319c(WalletFormView walletFormView, String str) {
            return false;
        }

        /* renamed from: d */
        public boolean mo99320d(WalletFormView walletFormView) {
            return true;
        }

        /* renamed from: e */
        public String mo99321e(WalletFormView walletFormView, String str) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m91320a(WalletFormView walletFormView) {
        if (walletFormView == null) {
            Log.m105920e("MicroMsg.CommonHintViewConfig", "hy: param error");
        } else {
            walletFormView.setLogicDelegate(new C76026b());
        }
    }

    /* renamed from: b */
    public static void m91321b(EditHintPasswdView editHintPasswdView) {
        if (editHintPasswdView != null) {
            editHintPasswdView.setEncrType(1);
        }
    }

    /* renamed from: c */
    public static void m91322c(MMActivity mMActivity, WalletFormView walletFormView) {
        if (walletFormView == null) {
            Log.m105920e("MicroMsg.CommonHintViewConfig", "hy: param error");
        } else {
            walletFormView.setOnInfoIvClickListener(new C76029e(walletFormView, mMActivity));
        }
    }

    /* renamed from: d */
    public static void m91323d(MMActivity mMActivity, WalletFormView walletFormView) {
        if (walletFormView == null) {
            Log.m105920e("MicroMsg.CommonHintViewConfig", "hy: param error");
            return;
        }
        walletFormView.setLogicDelegate(new C76027c());
        walletFormView.setOnClickListener(new C75212a(mMActivity, walletFormView));
        walletFormView.setOnInfoIvClickListener(new C76028d(walletFormView, mMActivity));
    }

    /* renamed from: e */
    public static void m91324e(WalletFormView walletFormView) {
        if (walletFormView == null) {
            Log.m105920e("MicroMsg.CommonHintViewConfig", "hy: param error");
            return;
        }
        walletFormView.setLogicDelegate(new C76033i(1, walletFormView));
        walletFormView.setFilterChar("\\x20\\t\\r\\n".toCharArray());
    }

    /* renamed from: f */
    public static void m91325f(MMActivity mMActivity, WalletFormView walletFormView) {
        if (walletFormView == null) {
            Log.m105920e("MicroMsg.CommonHintViewConfig", "hy: param error");
            return;
        }
        walletFormView.setOnInfoIvClickListener(new C76030f(mMActivity));
        walletFormView.setLogicDelegate(new C76031g());
    }

    /* renamed from: g */
    public static void m91326g(WalletFormView walletFormView) {
        if (walletFormView == null) {
            Log.m105920e("MicroMsg.CommonHintViewConfig", "hy: param error");
        } else {
            walletFormView.setLogicDelegate(new C76025a());
        }
    }

    /* renamed from: h */
    public static void m91327h(MMActivity mMActivity, WalletFormView walletFormView) {
        if (walletFormView == null) {
            Log.m105920e("MicroMsg.CommonHintViewConfig", "hy: param error");
            return;
        }
        walletFormView.setOnInfoIvClickListener(new C76032h(mMActivity));
        walletFormView.setFilterChar("\\x20\\t\\r\\n".toCharArray());
    }
}
