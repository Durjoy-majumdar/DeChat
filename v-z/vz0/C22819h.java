package vz0;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.card.p031ui.C18596g0;
import com.tencent.p014mm.plugin.card.p031ui.C18609n0;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dz0.C20483c;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import nj3.C76901s0;
import p200lx.C76736w;
import wz0.C22945n;
import wz0.C53247c;
import wz0.C53263p;

/* renamed from: vz0.h */
public abstract class C22819h extends C22821l {

    /* renamed from: b */
    public MMActivity f65605b;

    /* renamed from: c */
    public C18596g0 f65606c;

    /* renamed from: d */
    public C20483c f65607d;

    /* renamed from: e */
    public Bitmap f65608e;

    /* renamed from: f */
    public Bitmap f65609f;

    /* renamed from: g */
    public ViewGroup f65610g;

    /* renamed from: h */
    public C22818f0 f65611h;

    /* renamed from: i */
    public String f65612i;

    /* renamed from: j */
    public ViewStub f65613j;

    /* renamed from: k */
    public View.OnLongClickListener f65614k = new C22820a();

    /* renamed from: vz0.h$a */
    public class C22820a implements View.OnLongClickListener {
        public C22820a() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/view/CardBaseCodeView$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            if (view.getId() == C0966R.C0970id.bfz) {
                C22819h hVar = C22819h.this;
                ClipboardHelper.setText(hVar.f65605b, hVar.f65607d.mo23263J0().f63950o);
                C22819h hVar2 = C22819h.this;
                C76879j.m92726T(hVar2.f65605b, ((CardDetailUIContoller) hVar2.f65616a).mo23369j(C0966R.string.f7938wv));
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/card/ui/view/CardBaseCodeView$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
    }

    /* renamed from: c */
    public void mo35949c() {
        C18609n0 n0Var = this.f65616a;
        this.f65605b = ((CardDetailUIContoller) n0Var).f51797e;
        this.f65606c = ((CardDetailUIContoller) n0Var).f51774C;
        C20483c cVar = ((CardDetailUIContoller) n0Var).f51776E;
        this.f65607d = cVar;
        if (cVar == null) {
            Log.m105920e("MicroMsg.CardBaseCodeView", "initView failure! cardInfo is null!");
            return;
        }
        int i = cVar.mo23263J0().f63951p;
        if (i == 0) {
            this.f65611h = mo35963i();
        } else if (i == 1) {
            this.f65611h = mo35961g();
        } else if (i != 2) {
            this.f65611h = mo35964j();
        } else {
            this.f65611h = mo35964j();
        }
        if (this.f65611h == null) {
            Log.m105920e("MicroMsg.CardBaseCodeView", "iniView failure! codeContainer is null!");
            return;
        }
        int i2 = this.f65607d.mo23263J0().f63951p;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (this.f65613j == null) {
                        this.f65613j = (ViewStub) mo35969b(C0966R.C0970id.awq);
                    }
                } else if (this.f65613j == null) {
                    this.f65613j = (ViewStub) mo35969b(C0966R.C0970id.awq);
                }
            } else if (this.f65613j == null) {
                this.f65613j = (ViewStub) mo35969b(C0966R.C0970id.asg);
            }
        } else if (this.f65613j == null) {
            this.f65613j = (ViewStub) mo35969b(C0966R.C0970id.ate);
        }
        if (this.f65613j == null) {
            Log.m105920e("MicroMsg.CardBaseCodeView", "initTargetView failure! viewStub is null!");
        } else {
            C22818f0 f0Var = this.f65611h;
            if (f0Var == null) {
                Log.m105920e("MicroMsg.CardBaseCodeView", "iniView failure! codeContainer is null!");
            } else if (f0Var.getLayoutId() == 0) {
                Log.m105920e("MicroMsg.CardBaseCodeView", "initTargetView failure! codeContainer.getLayoutId()  is 0!");
            } else {
                this.f65613j.setLayoutResource(this.f65611h.getLayoutId());
                if (this.f65610g == null) {
                    this.f65610g = (ViewGroup) this.f65613j.inflate();
                }
            }
        }
        if (this.f65610g == null) {
            Log.m105920e("MicroMsg.CardBaseCodeView", "iniView failure! targetView is null!");
        }
    }

    /* renamed from: d */
    public void mo35950d(int i) {
        ViewGroup viewGroup = this.f65610g;
        if (viewGroup != null) {
            viewGroup.setVisibility(i);
        }
    }

    /* renamed from: e */
    public void mo35951e() {
        if (this.f65607d == null) {
            Log.m105920e("MicroMsg.CardBaseCodeView", "update  failure! mCardInfo is null!");
        } else if (this.f65611h == null) {
            Log.m105920e("MicroMsg.CardBaseCodeView", "update failure! codeContainer is null!");
        } else if (this.f65610g == null) {
            Log.m105920e("MicroMsg.CardBaseCodeView", "update failure! targetView is null!");
        } else {
            C18596g0 g0Var = this.f65606c;
            if (g0Var.f51933o < 0.8f) {
                WindowManager.LayoutParams attributes = g0Var.f51919a.getWindow().getAttributes();
                attributes.screenBrightness = 0.8f;
                g0Var.f51919a.getWindow().setAttributes(attributes);
            }
            mo35966l(C53247c.CARDCODEREFRESHACTION_ENTERCHANGE);
            this.f65611h.mo35954a(this.f65610g, this.f65607d);
        }
    }

    /* renamed from: f */
    public void mo35960f() {
        this.f65616a = null;
        this.f65605b = null;
        this.f65606c = null;
        this.f65607d = null;
        this.f65610g = null;
        this.f65611h = null;
        C22945n.m26993F(this.f65608e);
        C22945n.m26993F(this.f65609f);
    }

    /* renamed from: g */
    public abstract C22818f0 mo35961g();

    /* renamed from: h */
    public abstract String mo35962h(C53247c cVar);

    /* renamed from: i */
    public abstract C22818f0 mo35963i();

    /* renamed from: j */
    public abstract C22818f0 mo35964j();

    /* renamed from: k */
    public abstract boolean mo35965k(C20483c cVar);

    /* renamed from: l */
    public void mo35966l(C53247c cVar) {
        C20483c cVar2;
        ViewGroup viewGroup;
        Class cls = C76736w.class;
        C20483c cVar3 = this.f65607d;
        if (cVar3 == null) {
            Log.m105920e("MicroMsg.CardBaseCodeView", "updateCodeView getCode mCardInfo  is null ! cannot show code view");
        } else if (cVar == null) {
            Log.m105920e("MicroMsg.CardBaseCodeView", "updateCodeView failure!refreshReason is null!");
        } else {
            int i = 1;
            if (!this.f65611h.mo35955b(cVar3)) {
                Log.m105921e("MicroMsg.CardBaseCodeView", "updateCodeView failure! can not get qrcode! refreshReason = %s", Integer.valueOf(cVar.f148589d));
                C22818f0 f0Var = this.f65611h;
                if (f0Var != null && (cVar2 = this.f65607d) != null && (viewGroup = this.f65610g) != null) {
                    f0Var.mo35956c(viewGroup, cVar2);
                    return;
                }
                return;
            }
            this.f65611h.mo35958e(this.f65610g, this.f65607d);
            Log.m105925i("MicroMsg.CardBaseCodeView", "updateCodeView from refreshReason = %s", Integer.valueOf(cVar.f148589d));
            String h = mo35962h(cVar);
            this.f65612i = h;
            if (Util.isNullOrNil(h)) {
                Log.m105920e("MicroMsg.CardBaseCodeView", "updateCodeView getCode is empty! cannot show code view");
                return;
            }
            int i2 = this.f65607d.mo23263J0().f63951p;
            if (i2 == 0) {
                ViewGroup viewGroup2 = this.f65610g;
                String str = this.f65612i;
                TextView textView = (TextView) viewGroup2.findViewById(C0966R.C0970id.bfz);
                textView.setText(C53263p.m59700a(4, str, true));
                textView.setOnLongClickListener(this.f65614k);
                String str2 = this.f65607d.mo23264L0().f64145p;
                if (!Util.isNullOrNil(str2)) {
                    textView.setTextColor(C22945n.m27004d(str2));
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
            } else if (i2 == 1) {
                ViewGroup viewGroup3 = this.f65610g;
                String str3 = this.f65612i;
                try {
                    ImageView imageView = (ImageView) viewGroup3.findViewById(C0966R.C0970id.bfb);
                    C22945n.m26993F(this.f65609f);
                    if (str3 != null && str3.length() > 0) {
                        this.f65609f = ((C76736w) C86312j.m106911c(cls)).mo106913qj(this.f65605b, str3, 5, 0);
                    }
                    Bitmap bitmap = this.f65609f;
                    if (imageView != null) {
                        if (bitmap != null) {
                            imageView.setImageBitmap(bitmap);
                        }
                    }
                    imageView.setOnClickListener(((CardDetailUIContoller) this.f65616a).f51794X);
                    this.f65606c.f51922d = this.f65609f;
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.CardBaseCodeView", e, "", new Object[0]);
                }
            } else if (i2 == 2) {
                ViewGroup viewGroup4 = this.f65610g;
                String str4 = this.f65612i;
                try {
                    ImageView imageView2 = (ImageView) viewGroup4.findViewById(C0966R.C0970id.bfr);
                    C22945n.m26993F(this.f65608e);
                    C20483c cVar4 = this.f65607d;
                    if (!(cVar4 == null || cVar4.mo23264L0() == null)) {
                        i = this.f65607d.mo23264L0().f64157y0;
                    }
                    Bitmap qj = ((C76736w) C86312j.m106911c(cls)).mo106913qj(this.f65605b, str4, 12, i);
                    this.f65608e = qj;
                    if (imageView2 != null) {
                        if (qj != null) {
                            imageView2.setImageBitmap(qj);
                        }
                    }
                    imageView2.setOnClickListener(((CardDetailUIContoller) this.f65616a).f51794X);
                    C18596g0 g0Var = this.f65606c;
                    g0Var.f51921c = this.f65608e;
                    C76901s0 s0Var = g0Var.f51924f;
                    if (s0Var != null && s0Var.isShowing()) {
                        g0Var.f51926h.setImageBitmap(g0Var.f51921c);
                    }
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.CardBaseCodeView", e2, "", new Object[0]);
                }
            }
        }
    }
}
