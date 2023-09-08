package vz0;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import dz0.C20483c;
import gz0.C45988h;
import hz0.C33156j;
import hz0.C46153l0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import te3.C22498fy;
import te3.C48813b60;
import wz0.C22945n;
import wz0.C53247c;
import wz0.C53248d;

/* renamed from: vz0.q */
public class C53051q extends C53048k {

    /* renamed from: vz0.q$a */
    public class C53052a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f148089d;

        public C53052a(ViewGroup viewGroup) {
            this.f148089d = viewGroup;
        }

        public void onClick(View view) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View findViewById = this.f148089d.findViewById(C0966R.C0970id.bft);
            if (((Button) this.f148089d.findViewById(C0966R.C0970id.bfd)).getVisibility() == 0 && findViewById.getVisibility() == 0) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (findViewById.getVisibility() != 0) {
                str = "(Landroid/view/View;)V";
            } else if (!C22945n.m27024x(C53051q.this.f148088b.getContext())) {
                MMActivity mMActivity = C53051q.this.f148088b;
                C53248d.m59685e(mMActivity, mMActivity.getString(C0966R.string.ax7), false);
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = findViewById;
                str = "(Landroid/view/View;)V";
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById2 = this.f148089d.findViewById(C0966R.C0970id.bfr);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view3 = findViewById2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C53051q.this.f148087a.mo35966l(C53247c.CARDCODEREFRESHACTION_DOREFRESH);
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$1", "android/view/View$OnClickListener", "onClick", str);
        }
    }

    /* renamed from: vz0.q$b */
    public class C53053b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f148091d;

        /* renamed from: e */
        public final /* synthetic */ View f148092e;

        /* renamed from: f */
        public final /* synthetic */ ImageView f148093f;

        /* renamed from: g */
        public final /* synthetic */ Button f148094g;

        /* renamed from: h */
        public final /* synthetic */ ViewGroup f148095h;

        /* renamed from: i */
        public final /* synthetic */ C20483c f148096i;

        public C53053b(View view, View view2, ImageView imageView, Button button, ViewGroup viewGroup, C20483c cVar) {
            this.f148091d = view;
            this.f148092e = view2;
            this.f148093f = imageView;
            this.f148094g = button;
            this.f148095h = viewGroup;
            this.f148096i = cVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View view2 = this.f148091d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = this.f148092e;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f148093f.setVisibility(0);
            this.f148094g.setVisibility(8);
            C53051q.this.f148087a.mo35966l(C53247c.CARDCODEREFRESHACTION_SNAPSHOT);
            C53051q.this.mo73754i(this.f148095h, this.f148096i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C53051q(C22819h hVar, MMActivity mMActivity) {
        super(hVar, mMActivity);
    }

    /* renamed from: a */
    public void mo35954a(ViewGroup viewGroup, C20483c cVar) {
        super.mo35954a(viewGroup, cVar);
        mo73754i(viewGroup, cVar);
    }

    /* renamed from: b */
    public boolean mo35955b(C20483c cVar) {
        if (!cVar.mo23263J0().f63938E) {
            Log.m105920e("MicroMsg.CardDynamicQrCodeController", "isCanGetAndShowCode false : is_commom_card false!ban card show!");
            return false;
        }
        C22498fy fyVar = cVar.mo23263J0().f63937D;
        if (fyVar == null || Util.isNullOrNil(fyVar.f63884d)) {
            return true;
        }
        Log.m105920e("MicroMsg.CardDynamicQrCodeController", "isCanGetAndShowCode false : unavailable_qrcode_field is not null  !ban card show!");
        return false;
    }

    /* renamed from: c */
    public void mo35956c(ViewGroup viewGroup, C20483c cVar) {
        C46153l0.zx0().mo71395l();
        View findViewById = viewGroup.findViewById(C0966R.C0970id.bft);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "updateShadeLayout", "(Landroid/view/View;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "updateShadeLayout", "(Landroid/view/View;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.bfr);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "updateShadeLayout", "(Landroid/view/View;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "updateShadeLayout", "(Landroid/view/View;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C22498fy fyVar = cVar.mo23263J0().f63937D;
        if (fyVar != null) {
            View findViewById3 = viewGroup.findViewById(C0966R.C0970id.bfy);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            C117292a.m165358d(findViewById3, aVar3.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "updateShadeLayout", "(Landroid/view/View;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById3, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "updateShadeLayout", "(Landroid/view/View;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!Util.isNullOrNil(fyVar.f63884d)) {
                Button button = (Button) viewGroup.findViewById(C0966R.C0970id.bfd);
                button.setText(fyVar.f63884d);
                button.setVisibility(0);
                mo73753h(button, cVar);
                button.setOnClickListener(new C53054r(this, fyVar, cVar));
                if (!Util.isNullOrNil(fyVar.f63885e)) {
                    ((TextView) viewGroup.findViewById(C0966R.C0970id.bff)).setText(fyVar.f63885e);
                }
                TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.bfx);
                if (!Util.isNullOrNil(fyVar.f63886f)) {
                    textView.setText(fyVar.f63886f);
                    textView.setVisibility(0);
                    return;
                }
                textView.setVisibility(8);
            }
        }
    }

    /* renamed from: d */
    public void mo35957d(ViewGroup viewGroup, C20483c cVar) {
        ViewGroup viewGroup2 = viewGroup;
        Log.m105924i("MicroMsg.CardDynamicQrCodeController", "onScreenShot! ");
        View findViewById = viewGroup2.findViewById(C0966R.C0970id.bft);
        if (findViewById.getVisibility() == 0) {
            Log.m105920e("MicroMsg.CardDynamicQrCodeController", "code_qr_disable_layout is visible! do not show hint!");
            return;
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "onScreenShot", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "onScreenShot", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = viewGroup2.findViewById(C0966R.C0970id.bfv);
        if (findViewById2.getVisibility() == 0) {
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "onScreenShot", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "onScreenShot", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ImageView imageView = (ImageView) viewGroup2.findViewById(C0966R.C0970id.bfr);
        imageView.setVisibility(8);
        View findViewById3 = viewGroup2.findViewById(C0966R.C0970id.bfy);
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(0);
        View view3 = findViewById3;
        C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "onScreenShot", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "onScreenShot", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((TextView) viewGroup2.findViewById(C0966R.C0970id.bff)).setText(this.f148088b.getResources().getString(C0966R.string.awc));
        Button button = (Button) viewGroup2.findViewById(C0966R.C0970id.bfd);
        button.setVisibility(0);
        mo73753h(button, cVar);
        C45988h zx02 = C46153l0.zx0();
        zx02.mo71395l();
        C33156j qq = C46153l0.Ex0().mo58993qq(cVar.getCardId());
        if (qq != null) {
            Log.m105925i("MicroMsg.CardDynamicQrcodeOfflineMgr", "doScreenshotReport currentCode cardId =%s,codeId=%s", qq.field_card_id, qq.field_code_id);
            if (C46153l0.Ex0().mo58992jo(cVar.getCardId(), qq.field_code_id)) {
                zx02.mo71387d(cVar.getCardId(), qq.field_code_id, C53247c.CARDCODEREFRESHACTION_SNAPSHOT);
            } else {
                Log.m105921e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doScreenshotReport delete failue! do not report! cardId =%s,codeId=%s", qq.field_card_id, qq.field_code_id);
            }
        } else {
            Log.m105920e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doScreenshotReport  failue! currentCode is null!");
        }
        button.setOnClickListener(new C53053b(findViewById, findViewById3, imageView, button, viewGroup, cVar));
    }

    /* renamed from: e */
    public void mo35958e(ViewGroup viewGroup, C20483c cVar) {
        ViewGroup viewGroup2 = viewGroup;
        View findViewById = viewGroup2.findViewById(C0966R.C0970id.bft);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "beforeShowCodeView", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "beforeShowCodeView", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = viewGroup2.findViewById(C0966R.C0970id.bfr);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "beforeShowCodeView", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "beforeShowCodeView", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: f */
    public boolean mo73749f() {
        return false;
    }

    /* renamed from: g */
    public boolean mo73750g() {
        return true;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6694lz;
    }

    /* renamed from: h */
    public final void mo73753h(Button button, C20483c cVar) {
        String str = cVar.mo23264L0().f64145p;
        if (!Util.isNullOrNil(str)) {
            int d = C22945n.m27004d(str);
            button.setText(this.f148088b.getResources().getString(C0966R.string.awd));
            button.setTextColor(d);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(this.f148088b.getResources().getColor(C0966R.color.f3203it));
            gradientDrawable.setStroke(2, d);
            gradientDrawable.setCornerRadius(8.0f);
            button.setBackground(gradientDrawable);
        }
    }

    /* renamed from: i */
    public final void mo73754i(ViewGroup viewGroup, C20483c cVar) {
        C48813b60 b602 = cVar.mo23264L0().f64146p0;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.bfv);
        if (b602 == null || !b602.f130977e) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "updateRefreshLayout", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "updateRefreshLayout", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        C117292a.m165358d(findViewById, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "updateRefreshLayout", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "updateRefreshLayout", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!Util.isNullOrNil(b602.f130978f)) {
            ((TextView) viewGroup.findViewById(C0966R.C0970id.bfw)).setText(b602.f130978f);
            ((ImageView) viewGroup.findViewById(C0966R.C0970id.bfu)).setOnClickListener(new C53052a(viewGroup));
        }
    }
}
