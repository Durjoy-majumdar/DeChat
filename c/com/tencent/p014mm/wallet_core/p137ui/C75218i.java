package com.tencent.p014mm.wallet_core.p137ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMVerticalTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.ArrayList;
import java.util.regex.Pattern;
import k20.C60958c;
import k20.C9556a;
import nj3.C76901s0;

/* renamed from: com.tencent.mm.wallet_core.ui.i */
public class C75218i {

    /* renamed from: a */
    public MMActivity f221317a;

    /* renamed from: b */
    public Bitmap f221318b = null;

    /* renamed from: c */
    public Bitmap f221319c = null;

    /* renamed from: d */
    public Bitmap f221320d = null;

    /* renamed from: e */
    public String f221321e = "";

    /* renamed from: f */
    public boolean f221322f = true;

    /* renamed from: g */
    public ArrayList<Bitmap> f221323g = new ArrayList<>();

    /* renamed from: h */
    public C76901s0 f221324h = null;

    /* renamed from: i */
    public View f221325i;

    /* renamed from: j */
    public ImageView f221326j;

    /* renamed from: k */
    public View f221327k;

    /* renamed from: l */
    public ImageView f221328l;

    /* renamed from: m */
    public MMVerticalTextView f221329m;

    /* renamed from: n */
    public ViewGroup f221330n;

    /* renamed from: o */
    public boolean f221331o = false;

    /* renamed from: com.tencent.mm.wallet_core.ui.i$a */
    public class C75219a extends C7089c0 {
        public C75219a() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            C76901s0 s0Var;
            if ((view.getId() == C0966R.C0970id.hzc || view.getId() == C0966R.C0970id.hz9) && (s0Var = C75218i.this.f221324h) != null && s0Var.isShowing()) {
                C75218i.this.f221324h.dismiss();
            }
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.i$b */
    public class C75220b implements Runnable {
        public C75220b() {
        }

        public void run() {
            C75218i.this.f221326j.announceForAccessibility(MMApplicationContext.getString(C0966R.string.lbc));
        }
    }

    public C75218i(MMActivity mMActivity, boolean z) {
        new C75219a();
        this.f221317a = mMActivity;
        this.f221331o = z;
    }

    /* renamed from: a */
    public void mo105147a() {
        View view;
        if (this.f221324h == null) {
            if (this.f221331o) {
                view = View.inflate(this.f221317a, C0966R.C0971layout.cfj, (ViewGroup) null);
                MMVerticalTextView mMVerticalTextView = (MMVerticalTextView) view.findViewById(C0966R.C0970id.gop);
                mMVerticalTextView.setMediumBold(true);
                mMVerticalTextView.setAccessibilityViewType(1);
                this.f221330n = (ViewGroup) view.findViewById(C0966R.C0970id.hzb);
                View findViewById = view.findViewById(C0966R.C0970id.hza);
                findViewById.setImportantForAccessibility(4);
                findViewById.setOnClickListener(new C75221j(this));
                mMVerticalTextView.setOnClickListener(new C75222k(this, findViewById, (MMVerticalTextView) view.findViewById(C0966R.C0970id.l4b)));
                ((ViewGroup) view.findViewById(C0966R.C0970id.gov)).setContentDescription(MMApplicationContext.getString(C0966R.string.he5) + MMApplicationContext.getString(C0966R.string.he6));
            } else {
                view = View.inflate(this.f221317a, C0966R.C0971layout.cfm, (ViewGroup) null);
                view.setOnClickListener(new C75223l(this));
            }
            this.f221325i = view.findViewById(C0966R.C0970id.hzd);
            this.f221326j = (ImageView) view.findViewById(C0966R.C0970id.hzc);
            this.f221327k = view.findViewById(C0966R.C0970id.hz_);
            this.f221328l = (ImageView) view.findViewById(C0966R.C0970id.hz9);
            this.f221329m = (MMVerticalTextView) view.findViewById(C0966R.C0970id.l4c);
            C76901s0 s0Var = new C76901s0(view, -1, -1, true);
            this.f221324h = s0Var;
            s0Var.setClippingEnabled(false);
            this.f221324h.update();
            this.f221324h.setBackgroundDrawable(new ColorDrawable(16777215));
            this.f221324h.setOnDismissListener(new C75224m(this));
        }
    }

    /* renamed from: b */
    public void mo105148b() {
        C76901s0 s0Var = this.f221324h;
        if (s0Var != null && s0Var.isShowing()) {
            this.f221324h.dismiss();
        }
        C75228t.m90239c0(this.f221320d);
        C75228t.m90241d0(this.f221323g);
        this.f221323g.clear();
        this.f221317a = null;
    }

    /* renamed from: c */
    public void mo105149c(View view, boolean z) {
        this.f221322f = z;
        C76901s0 s0Var = this.f221324h;
        if (s0Var != null && !s0Var.isShowing()) {
            this.f221324h.showAtLocation(view.getRootView(), 17, 0, 0);
            this.f221324h.setFocusable(true);
            this.f221324h.setTouchable(true);
            this.f221324h.setBackgroundDrawable(new ColorDrawable(16777215));
            this.f221324h.setOutsideTouchable(true);
            if (this.f221322f) {
                ViewGroup viewGroup = this.f221330n;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                    this.f221330n.post(new C75225n(this));
                }
            } else {
                ViewGroup viewGroup2 = this.f221330n;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                }
            }
            mo105150d();
            this.f221317a.getWindow().addFlags(1024);
        }
    }

    /* renamed from: d */
    public final void mo105150d() {
        if (this.f221322f) {
            Bitmap bitmap = this.f221320d;
            Bitmap bitmap2 = this.f221319c;
            if (bitmap2 != null) {
                Pattern pattern = C75228t.f221346a;
                Matrix matrix = new Matrix();
                matrix.reset();
                matrix.setRotate(90.0f, (float) (bitmap2.getWidth() / 2), (float) (bitmap2.getHeight() / 2));
                Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
                StringBuilder sb = new StringBuilder();
                sb.append("resultBmp is null: ");
                sb.append(createBitmap == null);
                sb.append("  degree:");
                sb.append(90.0f);
                Log.m105918d("MicroMsg.WalletBaseUtil ", sb.toString());
                this.f221320d = createBitmap;
                Log.m105924i("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mRoateBmp != null");
            } else {
                this.f221320d = null;
                Log.m105920e("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mRoateBmp == null");
            }
            this.f221328l.setImageBitmap(this.f221320d);
            this.f221323g.add(0, bitmap);
            if (this.f221323g.size() >= 2) {
                for (int size = this.f221323g.size() - 1; size > 1; size--) {
                    C75228t.m90239c0(this.f221323g.remove(size));
                }
            }
            View view = this.f221325i;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/wallet_core/ui/OfflinePopupWindow", "updatePopWindowContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/wallet_core/ui/OfflinePopupWindow", "updatePopWindowContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f221327k;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/wallet_core/ui/OfflinePopupWindow", "updatePopWindowContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/wallet_core/ui/OfflinePopupWindow", "updatePopWindowContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            MMVerticalTextView mMVerticalTextView = this.f221329m;
            String str = this.f221321e;
            Pattern pattern2 = C75228t.f221346a;
            String str2 = "";
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sb4 = new StringBuilder();
                int length = str.length() / 4;
                int length2 = str.length() % 4;
                sb4.append(C75228t.m90234a(str.substring(0, length2), str2));
                for (int i = 0; i < 4; i++) {
                    sb4.append(" ");
                }
                String substring = str.substring(length2);
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2 + 1;
                    int min = Math.min(i3 * 4, substring.length());
                    if (min + 4 > substring.length()) {
                        min = substring.length();
                    }
                    int i4 = i2 * 4;
                    sb4.append(C75228t.m90234a(substring.substring(i4, min), str2));
                    if (min - i4 == 4 && i2 != length - 1) {
                        for (int i5 = 0; i5 < 4; i5++) {
                            sb4.append(" ");
                        }
                    }
                    i2 = i3;
                }
                str2 = sb4.toString();
            }
            mMVerticalTextView.setText(str2);
            this.f221329m.setContentDescription(this.f221321e);
        } else {
            this.f221326j.setImageBitmap(this.f221318b);
            if (this.f221318b != null) {
                Log.m105920e("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mQRCodeBmp != null");
            } else {
                Log.m105924i("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mQRCodeBmp == null");
            }
            View view5 = this.f221325i;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/wallet_core/ui/OfflinePopupWindow", "updatePopWindowContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/wallet_core/ui/OfflinePopupWindow", "updatePopWindowContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view7 = this.f221327k;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/wallet_core/ui/OfflinePopupWindow", "updatePopWindowContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/wallet_core/ui/OfflinePopupWindow", "updatePopWindowContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f221326j.postDelayed(new C75220b(), 500);
        }
        this.f221324h.update();
    }
}
