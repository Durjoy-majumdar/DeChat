package xm3;

import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import di3.C86312j;
import eb0.C45628s0;
import gy3.C87412m;
import java.util.HashSet;
import jq3.C60897k;
import jq3.C9493c;
import om3.C77020b;
import p240sx.C13796o;
import sx3.C26236u;
import tm3.C78065p;
import tm3.C78069w;
import tm3.C78070y;
import tm3.C78071z;

/* renamed from: xm3.q */
public final class C78927q implements C60897k<C77020b> {

    /* renamed from: a */
    public final /* synthetic */ C78917n f231796a;

    /* renamed from: b */
    public final /* synthetic */ AppCompatActivity f231797b;

    public C78927q(C78917n nVar, AppCompatActivity appCompatActivity) {
        this.f231796a = nVar;
        this.f231797b = appCompatActivity;
    }

    /* renamed from: a */
    public boolean mo2039a(View view, C9493c cVar, int i) {
        C60897k.C9501a.m9192a(this, view, (C77020b) cVar, i);
        return false;
    }

    /* renamed from: b */
    public boolean mo2040b(View view, MotionEvent motionEvent, C9493c cVar, int i) {
        C60897k.C9501a.m9193b(this, view, motionEvent, (C77020b) cVar, i);
        return false;
    }

    /* renamed from: c */
    public void mo2041c(View view, C9493c cVar, int i) {
        BaseMvvmActivity d3;
        UIStateCenter stateCenter;
        C77020b bVar = (C77020b) cVar;
        Class cls = C13796o.class;
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(bVar, "data");
        if (!bVar.f225016r && (d3 = this.f231796a.mo14598d3()) != null && (stateCenter = d3.getStateCenter()) != null) {
            AppCompatActivity appCompatActivity = this.f231797b;
            if (bVar.f225006e == 1) {
                stateCenter.dispatch(new C78065p(C26236u.m33719b(bVar.f225007f), -1));
                return;
            }
            if (((HashSet) C45628s0.f123410p).contains(bVar.f225007f)) {
                if (C87412m.m108589b(bVar.f225007f, "conversationboxservice")) {
                    String string = appCompatActivity.getString(C0966R.string.n6h);
                    C87412m.m108593f(string, "activity.getString(com.t….R.string.conv_box_title)");
                    appCompatActivity.startActivityForResult(((C13796o) C86312j.m106911c(cls)).mo13158i(appCompatActivity, string, ((C78069w) stateCenter.getState()).mo108033b(), ((C78069w) stateCenter.getState()).f228826n), 2306836);
                } else if (C87412m.m108589b(bVar.f225007f, "opencustomerservicemsg")) {
                    String string2 = appCompatActivity.getString(C0966R.string.f361117hf3);
                    C87412m.m108593f(string2, "activity.getString(com.t…ce_conversation_ui_title)");
                    appCompatActivity.startActivityForResult(((C13796o) C86312j.m106911c(cls)).mo13157b(appCompatActivity, string2, ((C78069w) stateCenter.getState()).mo108033b(), ((C78069w) stateCenter.getState()).f228826n), 2306837);
                }
            } else if (((C78069w) stateCenter.getState()).mo108033b()) {
                stateCenter.dispatch(new C78071z(bVar, i));
            } else if (bVar.f225006e == 3) {
                stateCenter.dispatch(new C78070y(bVar.f225007f, -1));
            } else {
                stateCenter.dispatch(new C78065p(C26236u.m33719b(bVar.f225007f), -1));
            }
        }
    }
}
