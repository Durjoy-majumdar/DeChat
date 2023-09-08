package v32;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import b63.C67186g0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.luckymoney.p886hk.p887ui.LuckyMoneyHKReceiveUI;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import eb0.C75592q0;
import hp3.C87581a;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import ob0.C89132b;
import p281yz.C79173v;
import te3.C64476jq1;
import u32.C65209a;

/* renamed from: v32.j */
public class C78333j implements C87581a<Object, C89132b.C89134c<C64476jq1>> {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyHKReceiveUI f229539a;

    public C78333j(LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI) {
        this.f229539a = luckyMoneyHKReceiveUI;
    }

    public Object call(Object obj) {
        boolean z;
        int i;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        this.f229539a.f198922u.dismiss();
        Log.m105925i("MicroMsg.LuckyMoneyHKReceiveUI", "do receive hb, errtype: %s, errcode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C64476jq1 jq12 = (C64476jq1) cVar.f256796d;
            Log.m105925i("MicroMsg.LuckyMoneyHKReceiveUI", "do receive hb, retcode: %s, %s", Integer.valueOf(jq12.f183818d), jq12.f183819e);
            if (jq12.f183818d == 0) {
                Log.m105925i("MicroMsg.LuckyMoneyHKReceiveUI", "jump to h5: %s", Boolean.valueOf(jq12.f183829r));
                if (jq12.f183829r) {
                    C75228t.m90219L(this.f229539a.getContext(), this.f229539a.getIntent().getStringExtra("key_hk_url"), true);
                } else {
                    C67186g0 g0Var = new C67186g0();
                    g0Var.field_mNativeUrl = this.f229539a.f198925x;
                    g0Var.field_hbType = jq12.f183826o;
                    g0Var.field_hbStatus = jq12.f183824j;
                    g0Var.field_receiveStatus = jq12.f183823i;
                    ((C79173v) C86312j.m106911c(C79173v.class)).mo109172tc().replace(g0Var);
                    if (jq12.f183823i == 2) {
                        LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI = this.f229539a;
                        luckyMoneyHKReceiveUI.getClass();
                        Log.m105924i("MicroMsg.LuckyMoneyHKReceiveUI", "do query detail");
                        new C65209a(luckyMoneyHKReceiveUI.f198925x, luckyMoneyHKReceiveUI.f198924w, 11, 0, 1, luckyMoneyHKReceiveUI.getIntent().getIntExtra("key_hk_scene", 0)).mo9225i().mo123062e(new C78326c(luckyMoneyHKReceiveUI)).mo11397F(luckyMoneyHKReceiveUI);
                    } else {
                        C69242l1.m81595a(this.f229539a.f198912h, "", jq12.f183827p);
                        String z2 = C75228t.m90277z(C75228t.m90268r(jq12.f183827p), 10);
                        AppCompatActivity context = this.f229539a.getContext();
                        LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI2 = this.f229539a;
                        C69242l1.m81616v(context, luckyMoneyHKReceiveUI2.f198913i, luckyMoneyHKReceiveUI2.getString(C0966R.string.gjt, new Object[]{z2}));
                        if (jq12.f183823i == 1 || (i = jq12.f183824j) == 4 || i == 5 || i == 1) {
                            this.f229539a.f198916o.setVisibility(8);
                            this.f229539a.f198917p.setVisibility(8);
                            if (!Util.isNullOrNil(jq12.f183825n)) {
                                this.f229539a.f198915n.setText(jq12.f183825n);
                                this.f229539a.f198915n.setVisibility(0);
                                this.f229539a.f198915n.setSingleLine(false);
                            } else {
                                this.f229539a.f198915n.setVisibility(8);
                            }
                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f229539a.f198918q.getLayoutParams();
                            layoutParams.bottomMargin = BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f229539a.getContext(), 30.0f);
                            this.f229539a.f198918q.setLayoutParams(layoutParams);
                            z = true;
                        } else {
                            if (!Util.isNullOrNil(jq12.f183825n)) {
                                this.f229539a.f198914j.setText(jq12.f183825n);
                                this.f229539a.f198914j.setVisibility(0);
                            }
                            if (!Util.isNullOrNil(jq12.f183821g)) {
                                C69242l1.m81616v(this.f229539a.getContext(), this.f229539a.f198915n, jq12.f183821g);
                                this.f229539a.f198915n.setVisibility(0);
                                this.f229539a.f198914j.setVisibility(8);
                            }
                            this.f229539a.f198916o.setOnClickListener(new C78331h(this, jq12));
                            z = false;
                        }
                        String s = C75592q0.m90789s();
                        this.f229539a.getClass();
                        if (s.equals((Object) null) || (jq12.f183826o == 1 && z)) {
                            if (jq12.f183826o == 1) {
                                this.f229539a.f198920s.setText(C0966R.string.gfg);
                            }
                            View view = this.f229539a.f198918q;
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(0);
                            View view2 = view;
                            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$6", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$6", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            this.f229539a.f198918q.setOnClickListener(new C78332i(this));
                            this.f229539a.f198919r.setVisibility(8);
                        } else {
                            View view3 = this.f229539a.f198918q;
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(8);
                            View view4 = view3;
                            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$6", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$6", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            this.f229539a.f198919r.setVisibility(0);
                        }
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f229539a.f198911g.getLayoutParams();
                        layoutParams2.topMargin = BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f229539a.getContext(), 118.0f);
                        this.f229539a.f198911g.setLayoutParams(layoutParams2);
                        LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI3 = this.f229539a;
                        luckyMoneyHKReceiveUI3.getClass();
                        if (C85875k4.m106211z()) {
                            luckyMoneyHKReceiveUI3.f198923v.setBackgroundResource(C0966R.color.BW_0_Alpha_0_8);
                            C85875k4.m106187i0(luckyMoneyHKReceiveUI3, luckyMoneyHKReceiveUI3.getResources().getColor(C0966R.color.BW_0_Alpha_0_8));
                        } else {
                            luckyMoneyHKReceiveUI3.f198923v.setBackgroundResource(C0966R.color.f356950a32);
                            C85875k4.m106187i0(luckyMoneyHKReceiveUI3, luckyMoneyHKReceiveUI3.getResources().getColor(C0966R.color.f356950a32));
                        }
                        View contentView = luckyMoneyHKReceiveUI3.getContentView();
                        C9556a aVar3 = new C9556a();
                        aVar3.mo10233c(0);
                        View view5 = contentView;
                        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "setActivityBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        contentView.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view5, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "setActivityBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view6 = this.f229539a.f198921t;
                        C9556a aVar4 = new C9556a();
                        aVar4.mo10233c(0);
                        View view7 = view6;
                        C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$6", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view7, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$6", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C69242l1.m81612r(this.f229539a.f198921t);
                    }
                }
            } else {
                String str = LuckyMoneyHKReceiveUI.f198909B;
                if (!Util.isNullOrNil(jq12.f183819e)) {
                    str = jq12.f183819e;
                }
                C76879j.m92726T(this.f229539a.getContext(), str);
                this.f229539a.finish();
            }
        } else {
            String str2 = LuckyMoneyHKReceiveUI.f198909B;
            if (!Util.isNullOrNil(cVar.f256795c)) {
                str2 = cVar.f256795c;
            }
            C76879j.m92726T(this.f229539a.getContext(), str2);
            this.f229539a.finish();
        }
        return null;
    }
}
