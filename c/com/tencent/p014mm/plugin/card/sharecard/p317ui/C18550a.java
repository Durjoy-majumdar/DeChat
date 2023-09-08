package com.tencent.p014mm.plugin.card.sharecard.p317ui;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dz0.C20483c;
import eb0.C75592q0;
import hz0.C46153l0;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import nj3.C76879j;
import p200lx.C76736w;
import p629ny.C76979h;
import wz0.C22945n;
import wz0.C53263p;

/* renamed from: com.tencent.mm.plugin.card.sharecard.ui.a */
public class C18550a {

    /* renamed from: a */
    public View f51666a;

    /* renamed from: b */
    public MMActivity f51667b;

    /* renamed from: c */
    public View f51668c;

    /* renamed from: d */
    public View f51669d;

    /* renamed from: e */
    public View f51670e;

    /* renamed from: f */
    public Bitmap f51671f;

    /* renamed from: g */
    public Bitmap f51672g;

    /* renamed from: h */
    public TextView f51673h;

    /* renamed from: i */
    public TextView f51674i;

    /* renamed from: j */
    public CheckBox f51675j;

    /* renamed from: k */
    public C20483c f51676k;

    /* renamed from: l */
    public int f51677l = 1;

    /* renamed from: m */
    public boolean f51678m = false;

    /* renamed from: n */
    public C18553c f51679n;

    /* renamed from: o */
    public float f51680o = 0.0f;

    /* renamed from: p */
    public View.OnClickListener f51681p = new C18551a();

    /* renamed from: q */
    public View.OnLongClickListener f51682q = new C18552b();

    /* renamed from: com.tencent.mm.plugin.card.sharecard.ui.a$a */
    public class C18551a implements View.OnClickListener {
        public C18551a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getId() == C0966R.C0970id.hk4) {
                if (C18550a.this.f51675j.isChecked()) {
                    C18553c cVar = C18550a.this.f51679n;
                    if (cVar != null) {
                        C46153l0.Ax0().mo71397b(CardConsumeCodeUI.this.f51618d.getCardId(), 1, 1, 1);
                    }
                } else {
                    C18553c cVar2 = C18550a.this.f51679n;
                    if (cVar2 != null) {
                        C46153l0.Ax0().mo71397b(CardConsumeCodeUI.this.f51618d.getCardId(), 0, 1, 1);
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.sharecard.ui.a$b */
    public class C18552b implements View.OnLongClickListener {
        public C18552b() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeController$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            if (view.getId() == C0966R.C0970id.bfz) {
                C18550a aVar = C18550a.this;
                ClipboardHelper.setText(aVar.f51667b, aVar.f51676k.mo23263J0().f63950o);
                MMActivity mMActivity = C18550a.this.f51667b;
                C76879j.m92726T(mMActivity, mMActivity.getString(C0966R.string.f7938wv));
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeController$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.sharecard.ui.a$c */
    public interface C18553c {
    }

    public C18550a(MMActivity mMActivity, View view) {
        this.f51667b = mMActivity;
        this.f51666a = view;
    }

    /* renamed from: a */
    public void mo23324a() {
        String str;
        Log.m105924i("MicroMsg.CardConsumeCodeController", "doUpdate()");
        if (!this.f51678m) {
            Log.m105924i("MicroMsg.CardConsumeCodeController", "doUpdate() not ready show!");
            return;
        }
        Class cls = C76736w.class;
        if (!Util.isNullOrNil(this.f51676k.mo23263J0().f63936C)) {
            str = this.f51676k.mo23263J0().f63936C;
            Log.m105925i("MicroMsg.CardConsumeCodeController", "code:%s from sign_number", str);
        } else if (this.f51676k.mo23278d0()) {
            str = C46153l0.wx0().mo32570b();
            Log.m105925i("MicroMsg.CardConsumeCodeController", "code:%s from dynamic code", str);
        } else {
            str = this.f51676k.mo23263J0().f63950o;
            Log.m105925i("MicroMsg.CardConsumeCodeController", "code:%s from dataInfo", str);
        }
        int i = this.f51676k.mo23263J0().f63951p;
        if (i == 0) {
            if (this.f51670e == null) {
                this.f51670e = ((ViewStub) this.f51666a.findViewById(C0966R.C0970id.atg)).inflate();
            }
            TextView textView = (TextView) this.f51670e.findViewById(C0966R.C0970id.bfz);
            textView.setText(C53263p.m59700a(4, str, true));
            textView.setOnLongClickListener(this.f51682q);
            if (!this.f51676k.mo23291o()) {
                textView.setTextColor(C22945n.m27004d(this.f51676k.mo23264L0().f64145p));
            }
            if (str.length() <= 12) {
                textView.setTextSize(1, 33.0f);
            } else if (str.length() > 12 && str.length() <= 16) {
                textView.setTextSize(1, 30.0f);
            } else if (str.length() > 16 && str.length() <= 20) {
                textView.setTextSize(1, 24.0f);
            } else if (str.length() > 20 && str.length() <= 40) {
                textView.setTextSize(1, 18.0f);
            } else if (str.length() > 40) {
                textView.setVisibility(8);
            }
            mo23326c(this.f51670e);
        } else if (i == 1) {
            if (this.f51669d == null) {
                this.f51669d = ((ViewStub) this.f51666a.findViewById(C0966R.C0970id.at9)).inflate();
            }
            View view = this.f51669d;
            ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.bfb);
            TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.bfz);
            if (!this.f51676k.mo23291o()) {
                textView2.setTextColor(C22945n.m27004d(this.f51676k.mo23264L0().f64145p));
            }
            if (TextUtils.isEmpty(str) || str.length() > 40) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(C53263p.m59700a(4, str, true));
                if (this.f51676k.mo23282g()) {
                    textView2.setVisibility(0);
                    textView2.setOnLongClickListener(this.f51682q);
                } else {
                    textView2.setVisibility(8);
                }
            }
            if (this.f51677l != 1) {
                textView2.setVisibility(4);
            }
            try {
                C22945n.m26993F(this.f51672g);
                if (!TextUtils.isEmpty(str)) {
                    Bitmap qj = ((C76736w) C86312j.m106911c(cls)).mo106913qj(this.f51667b, str, 5, 0);
                    this.f51672g = qj;
                    mo23325b(imageView, qj);
                } else {
                    this.f51672g = null;
                    imageView.setImageBitmap((Bitmap) null);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.CardConsumeCodeController", e, "", new Object[0]);
            }
            mo23326c(this.f51669d);
        } else if (i == 2) {
            if (this.f51668c == null) {
                this.f51668c = ((ViewStub) this.f51666a.findViewById(C0966R.C0970id.atd)).inflate();
            }
            View view2 = this.f51668c;
            ImageView imageView2 = (ImageView) view2.findViewById(C0966R.C0970id.bfr);
            TextView textView3 = (TextView) view2.findViewById(C0966R.C0970id.bfz);
            if (!this.f51676k.mo23291o()) {
                textView3.setTextColor(C22945n.m27004d(this.f51676k.mo23264L0().f64145p));
            }
            if (str.length() <= 40) {
                textView3.setText(C53263p.m59700a(4, str, true));
                if (this.f51676k.mo23282g()) {
                    textView3.setVisibility(0);
                    textView3.setOnLongClickListener(this.f51682q);
                } else {
                    textView3.setVisibility(8);
                }
            } else {
                textView3.setVisibility(8);
            }
            if (this.f51677l != 1) {
                textView3.setVisibility(4);
            }
            try {
                C22945n.m26993F(this.f51671f);
                if (!TextUtils.isEmpty(str)) {
                    Bitmap qj4 = ((C76736w) C86312j.m106911c(cls)).mo106913qj(this.f51667b, str, 12, 3);
                    this.f51671f = qj4;
                    mo23325b(imageView2, qj4);
                } else {
                    this.f51671f = null;
                    imageView2.setImageBitmap((Bitmap) null);
                }
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.CardConsumeCodeController", e2, "", new Object[0]);
            }
            mo23326c(this.f51668c);
        }
        if (Util.isNullOrNil(this.f51676k.mo23264L0().f64147q)) {
            this.f51673h.setVisibility(8);
            this.f51674i.setVisibility(8);
        } else if (this.f51676k.mo23264L0().f64135Z != null) {
            this.f51674i.setText(this.f51676k.mo23264L0().f64147q);
            this.f51674i.setVisibility(0);
            this.f51673h.setVisibility(8);
            View view3 = this.f51668c;
            if (view3 != null) {
                ImageView imageView3 = (ImageView) view3.findViewById(C0966R.C0970id.bfr);
                ViewGroup.LayoutParams layoutParams = imageView3.getLayoutParams();
                layoutParams.height = C76577a.m92151b(this.f51667b, 180);
                layoutParams.width = C76577a.m92151b(this.f51667b, 180);
                imageView3.setLayoutParams(layoutParams);
            }
        } else {
            this.f51673h.setText(this.f51676k.mo23264L0().f64147q);
            this.f51673h.setVisibility(0);
        }
        if (!this.f51676k.mo23272T0() || TextUtils.isEmpty(this.f51676k.mo23280e()) || this.f51676k.mo23280e().equals(C75592q0.m90789s())) {
            this.f51675j.setChecked(false);
            this.f51675j.setVisibility(8);
            return;
        }
        this.f51675j.setVisibility(0);
        CheckBox checkBox = this.f51675j;
        MMActivity mMActivity = this.f51667b;
        checkBox.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107080qH(mMActivity, " " + this.f51667b.getString(C0966R.string.awg, new Object[]{C22945n.m27016p(this.f51676k.mo23280e())}), mMActivity.getResources().getDimensionPixelOffset(C0966R.dimen.f3962lk)));
    }

    /* renamed from: b */
    public final void mo23325b(ImageView imageView, Bitmap bitmap) {
        if (imageView != null && bitmap != null && !bitmap.isRecycled()) {
            imageView.setImageBitmap(bitmap);
            if (this.f51677l != 1) {
                imageView.setAlpha(10);
            } else {
                imageView.setAlpha(255);
            }
        }
    }

    /* renamed from: c */
    public final void mo23326c(View view) {
        Button button = (Button) view.findViewById(C0966R.C0970id.bfq);
        if (this.f51677l == 1) {
            button.setVisibility(8);
        } else {
            button.setVisibility(0);
        }
        if (this.f51677l == -1) {
            button.setText(C0966R.string.azl);
        }
    }
}
