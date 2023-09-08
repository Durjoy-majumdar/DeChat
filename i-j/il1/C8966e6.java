package il1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import er1.C58739j4;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import ok1.C62042e;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90363p0;
import tf0.C13883o1;

/* renamed from: il1.e6 */
public final class C8966e6 implements View.OnClickListener {

    /* renamed from: A */
    public boolean f28318A = true;

    /* renamed from: B */
    public int f28319B;

    /* renamed from: C */
    public long f28320C;

    /* renamed from: d */
    public final ViewGroup f28321d;

    /* renamed from: e */
    public final String f28322e = "FinderLivePrecheckWidget";

    /* renamed from: f */
    public int f28323f;

    /* renamed from: g */
    public String f28324g = "";

    /* renamed from: h */
    public String f28325h = "";

    /* renamed from: i */
    public C32227p<? super String, ? super Integer, C13598b0> f28326i;

    /* renamed from: j */
    public C32226l<? super Boolean, C13598b0> f28327j;

    /* renamed from: n */
    public Button f28328n;

    /* renamed from: o */
    public TextView f28329o;

    /* renamed from: p */
    public WeImageView f28330p;

    /* renamed from: q */
    public TextView f28331q;

    /* renamed from: r */
    public WeImageView f28332r;

    /* renamed from: s */
    public View f28333s;

    /* renamed from: t */
    public TextView f28334t;

    /* renamed from: u */
    public TextView f28335u;

    /* renamed from: v */
    public WeImageView f28336v;

    /* renamed from: w */
    public boolean f28337w;

    /* renamed from: x */
    public boolean f28338x = true;

    /* renamed from: y */
    public boolean f28339y;

    /* renamed from: z */
    public boolean f28340z = true;

    public C8966e6(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "root");
        this.f28321d = viewGroup;
    }

    /* renamed from: a */
    public final void mo9769a(String str, int i) {
        if (i != 4) {
            if (str == null || str.length() == 0) {
                Log.m105920e(this.f28322e, "gotoFaceVerify error url is empty!");
                C62042e eVar = C62042e.f176370a;
                Context context = this.f28321d.getContext();
                C87412m.m108593f(context, "root.context");
                eVar.mo87041S1(context, "检测地址为空");
                return;
            }
        }
        ((C8777j5) C86312j.m106911c(C8777j5.class)).mo9599I3(7, this.f28319B, this.f28320C, C90363p0.m113143b(new C13604l("certification_type", Integer.valueOf(i))));
        C32227p<? super String, ? super Integer, C13598b0> pVar = this.f28326i;
        if (pVar != null) {
            pVar.invoke(str, Integer.valueOf(i));
        }
    }

    /* renamed from: b */
    public final void mo9770b() {
        this.f28338x = C61926c.m72696u(this.f28323f, 4);
        boolean u = C61926c.m72696u(this.f28323f, 32);
        this.f28339y = u;
        this.f28340z = u | this.f28338x | C61926c.m72696u(this.f28323f, 8);
        this.f28318A = C61926c.m72696u(this.f28323f, 16);
    }

    /* renamed from: c */
    public final void mo9771c() {
        if (this.f28340z) {
            TextView textView = this.f28331q;
            if (textView != null) {
                textView.setText(C0966R.string.e2w);
            }
            TextView textView2 = this.f28331q;
            if (textView2 != null) {
                textView2.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f2966ao));
            }
            WeImageView weImageView = this.f28332r;
            if (weImageView != null) {
                weImageView.setVisibility(4);
            }
            TextView textView3 = this.f28331q;
            if (textView3 != null) {
                textView3.setEnabled(true);
                return;
            }
            return;
        }
        TextView textView4 = this.f28331q;
        if (textView4 != null) {
            textView4.setText(C0966R.string.e2x);
        }
        TextView textView5 = this.f28331q;
        if (textView5 != null) {
            textView5.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.Brand_100));
        }
        WeImageView weImageView2 = this.f28332r;
        if (weImageView2 != null) {
            weImageView2.setVisibility(4);
        }
        TextView textView6 = this.f28331q;
        if (textView6 != null) {
            textView6.setEnabled(false);
        }
    }

    /* renamed from: d */
    public final void mo9772d() {
        if (this.f28337w) {
            Button button = this.f28328n;
            if (button != null) {
                button.setText(C0966R.string.e2s);
            }
        } else {
            Button button2 = this.f28328n;
            if (button2 != null) {
                button2.setText(C0966R.string.e2r);
            }
        }
        boolean z = true;
        if (this.f28338x || this.f28340z || this.f28318A || this.f28339y) {
            z = false;
        }
        Button button3 = this.f28328n;
        if (button3 != null) {
            button3.setEnabled(z);
        }
    }

    /* renamed from: e */
    public final void mo9773e(String str) {
        boolean z = true;
        if (this.f28318A) {
            View view = this.f28333s;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "setOthers", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "setOthers", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            TextView textView = this.f28335u;
            if (textView != null) {
                textView.setText(C0966R.string.e2w);
            }
            TextView textView2 = this.f28335u;
            if (textView2 != null) {
                textView2.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f2966ao));
            }
            TextView textView3 = this.f28334t;
            if (textView3 != null) {
                textView3.setText(str);
            }
            WeImageView weImageView = this.f28336v;
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
            TextView textView4 = this.f28335u;
            if (textView4 != null) {
                textView4.setEnabled(true);
                return;
            }
            return;
        }
        if (!(str == null || str.length() == 0)) {
            z = false;
        }
        if (!z) {
            View view3 = this.f28333s;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "setOthers", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "setOthers", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            TextView textView5 = this.f28335u;
            if (textView5 != null) {
                textView5.setText(C0966R.string.e2x);
            }
            TextView textView6 = this.f28335u;
            if (textView6 != null) {
                textView6.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.Brand_100));
            }
            TextView textView7 = this.f28334t;
            if (textView7 != null) {
                textView7.setText(str);
            }
            WeImageView weImageView2 = this.f28336v;
            if (weImageView2 != null) {
                weImageView2.setVisibility(4);
            }
            TextView textView8 = this.f28335u;
            if (textView8 != null) {
                textView8.setEnabled(false);
                return;
            }
            return;
        }
        View view5 = this.f28333s;
        if (view5 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "setOthers", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "setOthers", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: f */
    public final void mo9774f() {
        String str = this.f28322e;
        Log.m105924i(str, "setRealname realnameCheckFail" + this.f28338x + ", finderRealNameCheckFail:" + this.f28339y);
        boolean z = this.f28338x;
        if (z || this.f28339y) {
            if (z) {
                TextView textView = this.f28329o;
                if (textView != null) {
                    textView.setText(C0966R.string.e2w);
                }
            } else {
                TextView textView2 = this.f28329o;
                if (textView2 != null) {
                    textView2.setText(C0966R.string.f8134nc);
                }
            }
            TextView textView3 = this.f28329o;
            if (textView3 != null) {
                textView3.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f2966ao));
            }
            WeImageView weImageView = this.f28330p;
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
            TextView textView4 = this.f28329o;
            if (textView4 != null) {
                textView4.setEnabled(true);
                return;
            }
            return;
        }
        TextView textView5 = this.f28329o;
        if (textView5 != null) {
            textView5.setText(C0966R.string.e2x);
        }
        TextView textView6 = this.f28329o;
        if (textView6 != null) {
            textView6.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.Brand_100));
        }
        WeImageView weImageView2 = this.f28330p;
        if (weImageView2 != null) {
            weImageView2.setVisibility(4);
        }
        TextView textView7 = this.f28329o;
        if (textView7 != null) {
            textView7.setEnabled(false);
        }
    }

    /* renamed from: g */
    public final void mo9775g(boolean z, int i) {
        String str = this.f28322e;
        Log.m105924i(str, "updatePrecheck precheckType:" + i + ", " + z);
        if (i == 1) {
            if (z) {
                this.f28338x = false;
            }
            mo9774f();
        } else if (i == 2) {
            if (z) {
                this.f28340z = false;
            }
            mo9771c();
        } else if (i == 3) {
            if (z) {
                this.f28318A = false;
            }
            mo9773e(this.f28325h);
        } else if (i == 4) {
            if (z) {
                this.f28339y = false;
            }
            mo9774f();
        }
        mo9772d();
        String str2 = this.f28322e;
        Log.m105924i(str2, "updatePrecheck realnameCheckFail:" + this.f28338x + ", finderRealNameCheckFail:" + this.f28339y + ", ageCheckFail:" + this.f28340z + ", othersCheckFail:" + this.f28318A);
    }

    public void onClick(View view) {
        C32226l<? super Boolean, C13598b0> lVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        boolean z = false;
        if (!((valueOf != null && valueOf.intValue() == C0966R.C0970id.i17) || (valueOf != null && valueOf.intValue() == C0966R.C0970id.i15))) {
            if (!((valueOf != null && valueOf.intValue() == C0966R.C0970id.i0w) || (valueOf != null && valueOf.intValue() == C0966R.C0970id.i0u))) {
                if ((valueOf != null && valueOf.intValue() == C0966R.C0970id.f358950i12) || (valueOf != null && valueOf.intValue() == C0966R.C0970id.f358948i10)) {
                    z = true;
                }
                if (z) {
                    mo9769a(this.f28324g, 3);
                } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.i0y) {
                    if (C58739j4.f168176a.mo83683L()) {
                        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    } else if (this.f28337w) {
                        C32226l<? super Boolean, C13598b0> lVar2 = this.f28327j;
                        if (lVar2 != null) {
                            lVar2.invoke(Boolean.TRUE);
                        }
                    } else {
                        Context context = this.f28321d.getContext();
                        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                        Intent intent = new Intent();
                        intent.putExtra("KEY_PATH", "https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_privacy");
                        intent.putExtra("KEY_TYPE", "TYPE_LICENSE");
                        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", this.f28319B);
                        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", this.f28320C);
                        ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13265OD((Activity) context, intent, 10123);
                    }
                } else if (!(valueOf == null || valueOf.intValue() != C0966R.C0970id.kr4 || (lVar = this.f28327j) == null)) {
                    lVar.invoke(Boolean.FALSE);
                }
            }
        } else if (this.f28338x) {
            mo9769a(this.f28324g, 1);
        } else {
            mo9769a("", 4);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivePrecheckWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
