package xz0;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import te3.C22498fy;
import te3.C49029co;
import wz0.C22945n;
import wz0.C53263p;

/* renamed from: xz0.h */
public class C23153h extends C23145a {

    /* renamed from: g */
    public TextView f66518g;

    /* renamed from: h */
    public View f66519h;

    /* renamed from: i */
    public ImageView f66520i;

    /* renamed from: j */
    public TextView f66521j;

    /* renamed from: k */
    public TextView f66522k;

    /* renamed from: l */
    public View f66523l;

    /* renamed from: m */
    public TextView f66524m;

    /* renamed from: n */
    public TextView f66525n;

    /* renamed from: o */
    public ImageView f66526o;

    /* renamed from: p */
    public TextView f66527p;

    /* renamed from: q */
    public ArrayList<C49029co> f66528q;

    public C23153h(Context context) {
        super(context);
    }

    /* renamed from: g */
    public void mo36528g() {
        this.f66518g = (TextView) this.f66474c.findViewById(C0966R.C0970id.axi);
        this.f66519h = this.f66474c.findViewById(C0966R.C0970id.asl);
        this.f66520i = (ImageView) this.f66474c.findViewById(C0966R.C0970id.kkc);
        this.f66521j = (TextView) this.f66474c.findViewById(C0966R.C0970id.kkb);
        this.f66522k = (TextView) this.f66474c.findViewById(C0966R.C0970id.kka);
        this.f66523l = this.f66474c.findViewById(C0966R.C0970id.kke);
        this.f66524m = (TextView) this.f66474c.findViewById(C0966R.C0970id.kkg);
        this.f66525n = (TextView) this.f66474c.findViewById(C0966R.C0970id.kkf);
        this.f66526o = (ImageView) this.f66474c.findViewById(C0966R.C0970id.kkd);
        this.f66527p = (TextView) this.f66474c.findViewById(C0966R.C0970id.kk_);
    }

    /* renamed from: h */
    public void mo36529h() {
        if (this.f66472a.mo23264L0().f64132X != null && !TextUtils.isEmpty(this.f66472a.mo23264L0().f64132X.f63884d)) {
            this.f66476e.setText(this.f66472a.mo23264L0().f64132X.f63884d);
        } else if (!TextUtils.isEmpty(this.f66472a.mo23264L0().f64142j)) {
            this.f66476e.setText(this.f66472a.mo23264L0().f64142j);
        } else {
            this.f66476e.setText("");
        }
        if (this.f66472a.mo23264L0().f64132X == null || TextUtils.isEmpty(this.f66472a.mo23264L0().f64132X.f63885e)) {
            this.f66518g.setText("");
            this.f66518g.setVisibility(8);
        } else {
            this.f66518g.setText(this.f66472a.mo23264L0().f64132X.f63885e);
            this.f66518g.setVisibility(0);
        }
        Log.m105924i("MicroMsg.CardWidgetTicket", "updateContentView()");
        if (!Util.isNullOrNil(this.f66472a.mo23264L0().f64105C)) {
            C53263p.m59702c(this.f66473b, this.f66520i, this.f66472a.mo23264L0().f64105C, this.f66473b.getResources().getDimensionPixelSize(C0966R.dimen.f4245xf), C0966R.C0969drawable.bxl, false, C22945n.m27004d(this.f66472a.mo23264L0().f64145p));
        } else {
            C53263p.m59703d(this.f66473b, this.f66520i, C0966R.C0969drawable.bxl, C22945n.m27004d(this.f66472a.mo23264L0().f64145p));
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        if (this.f66472a.mo23264L0().f64149s != null && this.f66472a.mo23264L0().f64149s.size() >= 2) {
            Log.m105924i("MicroMsg.CardWidgetTicket", "primary_fields length is >= 2");
            C22498fy fyVar = this.f66472a.mo23264L0().f64149s.get(0);
            C22498fy fyVar2 = this.f66472a.mo23264L0().f64149s.get(1);
            sb.append(fyVar.f63884d);
            sb.append(" - ");
            sb.append(fyVar2.f63884d);
            if (!TextUtils.isEmpty(fyVar.f63886f) && !TextUtils.isEmpty(fyVar2.f63886f)) {
                sb4.append(fyVar.f63886f);
                sb4.append(" ");
                sb4.append(fyVar.f63885e);
                sb4.append(" - ");
                sb4.append(fyVar2.f63886f);
                sb4.append(" ");
                sb4.append(fyVar2.f63885e);
            }
        } else if (this.f66472a.mo23264L0().f64149s != null && this.f66472a.mo23264L0().f64149s.size() == 1) {
            Log.m105924i("MicroMsg.CardWidgetTicket", "primary_fields length is == 1");
            C22498fy fyVar3 = this.f66472a.mo23264L0().f64149s.get(0);
            sb.append(fyVar3.f63884d);
            sb4.append(fyVar3.f63885e);
        }
        if (!TextUtils.isEmpty(sb.toString())) {
            this.f66521j.setText(sb.toString());
        } else {
            this.f66521j.setText("");
        }
        if (!TextUtils.isEmpty(sb4.toString())) {
            Log.m105924i("MicroMsg.CardWidgetTicket", "sub_title_builder is not empty!");
            this.f66522k.setText(sb4.toString());
            this.f66522k.setVisibility(0);
        } else if (!TextUtils.isEmpty(this.f66472a.mo23264L0().f64113K)) {
            Log.m105924i("MicroMsg.CardWidgetTicket", "primary_sub_title is not empty!");
            this.f66522k.setText(this.f66472a.mo23264L0().f64113K);
            this.f66522k.setVisibility(0);
        } else {
            this.f66522k.setVisibility(8);
        }
        Log.m105920e("MicroMsg.CardWidgetTicket", "updateShopView(), shop_count:" + this.f66472a.mo23264L0().f64154x);
        if (this.f66472a.mo23264L0().f64154x <= 0) {
            View view = this.f66523l;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/widget/CardWidgetTicket", "updateShopView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/card/widget/CardWidgetTicket", "updateShopView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f66527p.setVisibility(8);
        } else {
            View view3 = this.f66523l;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/card/widget/CardWidgetTicket", "updateShopView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/card/widget/CardWidgetTicket", "updateShopView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f66523l.setOnClickListener(this.f66477f);
            C53263p.m59703d(this.f66473b, this.f66526o, C0966R.C0969drawable.bxm, C22945n.m27004d(this.f66472a.mo23264L0().f64145p));
            ArrayList<C49029co> arrayList = this.f66528q;
            C49029co coVar = (arrayList == null || arrayList.size() < 1) ? null : this.f66528q.get(0);
            if (this.f66472a.mo23264L0().f64154x == 1 && coVar != null) {
                this.f66524m.setText(coVar.f131848d);
                TextView textView = this.f66525n;
                Context context = this.f66473b;
                textView.setText(context.getString(C0966R.string.b1h, new Object[]{C22945n.m26991D(context, coVar.f131855n), coVar.f131854j}));
                this.f66527p.setVisibility(8);
                this.f66523l.setTag(coVar.f131848d);
            } else if (this.f66472a.mo23264L0().f64154x > 1 && coVar != null) {
                this.f66524m.setText(coVar.f131848d);
                TextView textView2 = this.f66525n;
                Context context2 = this.f66473b;
                textView2.setText(context2.getString(C0966R.string.b1h, new Object[]{C22945n.m26991D(context2, coVar.f131855n), coVar.f131854j}));
                this.f66527p.setVisibility(0);
                this.f66527p.setOnClickListener(this.f66477f);
                this.f66523l.setTag(coVar.f131848d);
            } else if (this.f66472a.mo23264L0().f64154x >= 1) {
                this.f66524m.setText(C0966R.string.aw7);
                this.f66525n.setText(this.f66473b.getString(C0966R.string.b27, new Object[]{Integer.valueOf(this.f66472a.mo23264L0().f64154x)}));
                this.f66527p.setVisibility(8);
                this.f66527p.setOnClickListener((View.OnClickListener) null);
                this.f66523l.setTag(this.f66473b.getString(C0966R.string.aw7));
            }
        }
        if (this.f66472a.mo23265N()) {
            View view5 = this.f66519h;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/card/widget/CardWidgetTicket", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/card/widget/CardWidgetTicket", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view7 = this.f66519h;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(0);
        View view8 = view7;
        C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/card/widget/CardWidgetTicket", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view8, "com/tencent/mm/plugin/card/widget/CardWidgetTicket", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
