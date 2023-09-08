package ve1;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C39994x1;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import te3.C49982je3;
import te3.C50951qe3;
import te3.C51238sg0;
import te3.C51655v7;
import te3.z74;

/* renamed from: ve1.w6 */
public final class C14678w6 extends C60896i<C39994x1> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f359776an3;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        int i3;
        C50951qe3 qe32;
        C49982je3 je32;
        String str;
        C39994x1 x1Var = (C39994x1) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(x1Var, "item");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.kxj);
        TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.kxi);
        LinearLayout linearLayout = (LinearLayout) oVar.mo85812D(C0966R.C0970id.g1_);
        WeImageView weImageView = (WeImageView) oVar.mo85812D(C0966R.C0970id.lq9);
        WeImageView weImageView2 = (WeImageView) oVar.mo85812D(C0966R.C0970id.lq8);
        WeImageView weImageView3 = (WeImageView) oVar.mo85812D(C0966R.C0970id.lq7);
        TextView textView3 = (TextView) oVar.mo85812D(C0966R.C0970id.kxf);
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = "";
        C51238sg0 sg02 = x1Var.f107216d;
        C51655v7 v7Var = sg02.f141492f;
        if (v7Var != null) {
            i3 = v7Var.f143371d;
            f0Var.f27484d = v7Var.f143372e;
        } else {
            i3 = 0;
        }
        z74 z74 = sg02.f141490d;
        if (!(z74 == null || (qe32 = z74.f145743d) == null || (je32 = qe32.f140264d) == null)) {
            if (textView != null) {
                textView.setText(je32.f136053e);
            }
            String str2 = je32.f136067v;
            if (str2 == null || str2.length() == 0) {
                str = je32.f136056h;
            } else {
                str = je32.f136067v + APLogFileUtil.SEPARATOR_LOG + je32.f136056h;
            }
            if (textView2 != null) {
                textView2.setText(str);
            }
        }
        Log.m105924i("FinderPoiManageItemConvert", "auditResult： " + i3);
        if (i3 == 1) {
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setText(oVar.f173499A.getText(C0966R.string.f360738eh2));
            }
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
            if (weImageView2 != null) {
                weImageView2.setVisibility(8);
            }
        } else if (i3 != 2) {
            if (i3 == 3) {
                if (weImageView3 != null) {
                    weImageView3.setVisibility(0);
                }
                if (textView3 != null) {
                    textView3.setText(oVar.f173499A.getText(C0966R.string.f360736eh0));
                }
                if (weImageView2 != null) {
                    weImageView2.setVisibility(0);
                }
                if (weImageView != null) {
                    weImageView.setVisibility(8);
                }
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                    linearLayout.setOnClickListener(new C14662v6(this, f0Var));
                }
            } else if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        } else if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
