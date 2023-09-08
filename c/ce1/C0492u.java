package ce1;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bl3.C39818r;
import ce1.C0479p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p599lr.C61381b;
import qo3.C89779i0;
import u60.C65220d;

/* renamed from: ce1.u */
public final class C0492u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C0479p f1216d;

    public C0492u(C0479p pVar) {
        this.f1216d = pVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC$initView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C0479p pVar = this.f1216d;
        C0479p.C0481b bVar = C0479p.f1167N;
        boolean z = false;
        pVar.mo535i3(false, 0);
        C0479p pVar2 = this.f1216d;
        Class cls = C0461e0.class;
        MMEditText mMEditText = pVar2.f1183e;
        if (mMEditText != null) {
            boolean isNullOrNil = Util.isNullOrNil((CharSequence) mMEditText.getText());
            MMEditText mMEditText2 = pVar2.f1184f;
            if (mMEditText2 != null) {
                boolean isNullOrNil2 = Util.isNullOrNil((CharSequence) mMEditText2.getText());
                boolean isNullOrNil3 = Util.isNullOrNil(pVar2.f1199x);
                CheckBox checkBox = pVar2.f1193r;
                if (checkBox != null) {
                    boolean z2 = checkBox.isChecked();
                    if (isNullOrNil || isNullOrNil3 || isNullOrNil2) {
                        if (isNullOrNil) {
                            MMEditText mMEditText3 = pVar2.f1183e;
                            if (mMEditText3 != null) {
                                mMEditText3.setHintTextColor(pVar2.getResources().getColor(C0966R.color.f2966ao));
                            } else {
                                C87412m.m108603p("nameEdit");
                                throw null;
                            }
                        }
                        if (isNullOrNil2) {
                            MMEditText mMEditText4 = pVar2.f1184f;
                            if (mMEditText4 != null) {
                                mMEditText4.setHintTextColor(pVar2.getResources().getColor(C0966R.color.f2966ao));
                            } else {
                                C87412m.m108603p("descEdit");
                                throw null;
                            }
                        }
                        if (isNullOrNil3) {
                            TextView textView = pVar2.f1189n;
                            if (textView != null) {
                                textView.setHintTextColor(pVar2.getResources().getColor(C0966R.color.f2966ao));
                            } else {
                                C87412m.m108603p("selectTimeText");
                                throw null;
                            }
                        }
                    } else if (!z2) {
                        Animation loadAnimation = AnimationUtils.loadAnimation(pVar2.getActivity().getApplicationContext(), C0966R.C0968anim.f2397g5);
                        C87412m.m108593f(loadAnimation, "loadAnimation(activity.a…R.anim.finder_shake_anim)");
                        RelativeLayout relativeLayout = pVar2.f1191p;
                        if (relativeLayout != null) {
                            relativeLayout.startAnimation(loadAnimation);
                        } else {
                            C87412m.m108603p("checkkAnnounceContainer");
                            throw null;
                        }
                    } else {
                        z = true;
                    }
                    if (!z) {
                        Log.m105924i("FinderActivityPostUIC", "doPost: check post fail");
                    } else {
                        C39818r rVar = C39818r.f106831a;
                        if (((C0461e0) rVar.mo62444c(pVar2.getActivity()).mo75002a(cls)).f1106q) {
                            pVar2.f1176H = ((C0461e0) rVar.mo62444c(pVar2.getActivity()).mo75002a(cls)).f1105p;
                        }
                        C89779i0 i0Var = ((C0461e0) rVar.mo62444c(pVar2.getActivity()).mo75002a(cls)).f1096d;
                        if (i0Var != null && !i0Var.isShowing()) {
                            i0Var.show();
                        }
                        if (Util.isNullOrNil(pVar2.f1176H)) {
                            pVar2.mo532e3((C65220d) null);
                        } else {
                            ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12408a(pVar2.f1176H, new C0489r(pVar2));
                        }
                    }
                    C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC$initView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C87412m.m108603p("announceCheckBox");
                throw null;
            }
            C87412m.m108603p("descEdit");
            throw null;
        }
        C87412m.m108603p("nameEdit");
        throw null;
    }
}
