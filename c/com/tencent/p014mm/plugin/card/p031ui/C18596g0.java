package com.tencent.p014mm.plugin.card.p031ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMVerticalTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import dz0.C20483c;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C76901s0;
import wz0.C22945n;
import wz0.C53263p;

/* renamed from: com.tencent.mm.plugin.card.ui.g0 */
public class C18596g0 {

    /* renamed from: a */
    public MMActivity f51919a;

    /* renamed from: b */
    public boolean f51920b = true;

    /* renamed from: c */
    public Bitmap f51921c;

    /* renamed from: d */
    public Bitmap f51922d;

    /* renamed from: e */
    public Bitmap f51923e = null;

    /* renamed from: f */
    public C76901s0 f51924f = null;

    /* renamed from: g */
    public View f51925g;

    /* renamed from: h */
    public ImageView f51926h;

    /* renamed from: i */
    public TextView f51927i;

    /* renamed from: j */
    public TextView f51928j;

    /* renamed from: k */
    public View f51929k;

    /* renamed from: l */
    public ImageView f51930l;

    /* renamed from: m */
    public MMVerticalTextView f51931m;

    /* renamed from: n */
    public MMVerticalTextView f51932n;

    /* renamed from: o */
    public float f51933o = 0.0f;

    /* renamed from: p */
    public ArrayList<Bitmap> f51934p = new ArrayList<>();

    /* renamed from: q */
    public C20483c f51935q;

    /* renamed from: r */
    public String f51936r = "";

    /* renamed from: s */
    public View.OnClickListener f51937s = new C18597a();

    /* renamed from: com.tencent.mm.plugin.card.ui.g0$a */
    public class C18597a implements View.OnClickListener {
        public C18597a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardPopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getId() == C0966R.C0970id.hzc || view.getId() == C0966R.C0970id.hz9) {
                C76901s0 s0Var = C18596g0.this.f51924f;
                if (s0Var != null && s0Var.isShowing()) {
                    C18596g0.this.f51924f.dismiss();
                }
                if (!C18596g0.this.f51935q.mo23271R1()) {
                    C18596g0 g0Var = C18596g0.this;
                    float f = g0Var.f51933o;
                    WindowManager.LayoutParams attributes = g0Var.f51919a.getWindow().getAttributes();
                    attributes.screenBrightness = f;
                    g0Var.f51919a.getWindow().setAttributes(attributes);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardPopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C18596g0(MMActivity mMActivity) {
        this.f51919a = mMActivity;
    }

    /* renamed from: a */
    public void mo23406a(View view, boolean z) {
        if (this.f51933o < 0.8f) {
            WindowManager.LayoutParams attributes = this.f51919a.getWindow().getAttributes();
            attributes.screenBrightness = 0.8f;
            this.f51919a.getWindow().setAttributes(attributes);
        }
        this.f51920b = z;
        C76901s0 s0Var = this.f51924f;
        if (s0Var != null && !s0Var.isShowing()) {
            this.f51924f.showAtLocation(view.getRootView(), 17, 0, 0);
            this.f51924f.setFocusable(true);
            this.f51924f.setTouchable(true);
            this.f51924f.setBackgroundDrawable(new ColorDrawable(16777215));
            this.f51924f.setOutsideTouchable(true);
            String str = "";
            if (this.f51920b) {
                this.f51930l.setOnClickListener(this.f51937s);
                Bitmap bitmap = this.f51923e;
                Bitmap bitmap2 = this.f51922d;
                if (bitmap2 != null) {
                    Matrix matrix = new Matrix();
                    matrix.reset();
                    matrix.setRotate(90.0f, (float) (bitmap2.getWidth() / 2), (float) (bitmap2.getHeight() / 2));
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
                    StringBuilder sb = new StringBuilder();
                    sb.append("resultBmp is null: ");
                    sb.append(createBitmap == null);
                    sb.append("  degree:");
                    sb.append(90.0f);
                    Log.m105918d("MicroMsg.CardUtil", sb.toString());
                    this.f51923e = createBitmap;
                } else {
                    this.f51923e = null;
                }
                this.f51930l.setImageBitmap(this.f51923e);
                this.f51934p.add(0, bitmap);
                if (this.f51934p.size() > 2) {
                    for (int size = this.f51934p.size() - 1; size > 1; size--) {
                        C22945n.m26993F(this.f51934p.remove(size));
                    }
                }
                View view2 = this.f51925g;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardPopupWindow", "showPopupWindow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/CardPopupWindow", "showPopupWindow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = this.f51929k;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/CardPopupWindow", "showPopupWindow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/card/ui/CardPopupWindow", "showPopupWindow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                String str2 = this.f51935q.mo23263J0().f63950o;
                if (this.f51935q.mo23264L0().f64146p0 == null || !this.f51935q.mo23264L0().f64146p0.f130976d) {
                    if (!Util.isNullOrNil(this.f51935q.mo23263J0().f63936C)) {
                        str = this.f51935q.mo23263J0().f63936C;
                    } else if (!this.f51935q.mo23278d0()) {
                        str = str2;
                    } else if (!Util.isNullOrNil(this.f51936r)) {
                        str = this.f51936r;
                    }
                }
                if (TextUtils.isEmpty(str) || str.length() > 40) {
                    this.f51931m.setVisibility(8);
                } else {
                    this.f51931m.setText(C53263p.m59700a(4, str, true));
                    if (this.f51935q.mo23275W0()) {
                        this.f51931m.setVisibility(0);
                    } else {
                        this.f51931m.setVisibility(8);
                    }
                }
                if (!Util.isNullOrNil(this.f51935q.mo23264L0().f64147q)) {
                    this.f51932n.setText(this.f51935q.mo23264L0().f64147q);
                    this.f51932n.setVisibility(0);
                } else {
                    this.f51932n.setVisibility(8);
                }
            } else {
                this.f51926h.setOnClickListener(this.f51937s);
                this.f51926h.setImageBitmap(this.f51921c);
                String str3 = this.f51935q.mo23263J0().f63950o;
                if (this.f51935q.mo23264L0().f64146p0 == null || !this.f51935q.mo23264L0().f64146p0.f130976d) {
                    if (!Util.isNullOrNil(this.f51935q.mo23263J0().f63936C)) {
                        str = this.f51935q.mo23263J0().f63936C;
                    } else if (!this.f51935q.mo23278d0()) {
                        str = str3;
                    } else if (!Util.isNullOrNil(this.f51936r)) {
                        str = this.f51936r;
                    }
                }
                if (TextUtils.isEmpty(str) || str.length() > 40) {
                    this.f51927i.setVisibility(8);
                } else {
                    this.f51927i.setText(C53263p.m59700a(4, str, true));
                    if (this.f51935q.mo23275W0()) {
                        this.f51927i.setVisibility(0);
                    } else {
                        this.f51927i.setVisibility(8);
                    }
                }
                if (!TextUtils.isEmpty(this.f51935q.mo23264L0().f64147q)) {
                    this.f51928j.setText(this.f51935q.mo23264L0().f64147q);
                    this.f51928j.setVisibility(0);
                } else {
                    this.f51928j.setVisibility(8);
                }
                View view5 = this.f51925g;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/card/ui/CardPopupWindow", "showPopupWindow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/card/ui/CardPopupWindow", "showPopupWindow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view7 = this.f51929k;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/card/ui/CardPopupWindow", "showPopupWindow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/card/ui/CardPopupWindow", "showPopupWindow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f51924f.update();
        }
    }
}
