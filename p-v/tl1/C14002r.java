package tl1;

import ak1.C54067f0;
import ak1.C54116w;
import al1.C0082q;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import cl1.C0696x;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.file.XVFSFile;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.Arrays;
import k20.C60958c;
import k20.C9556a;
import l31.C61212e;
import o40.C61926c;
import ok1.C62042e;
import rl1.C13022d0;
import rx3.C13598b0;
import te3.C51483u21;
import te3.C52204z21;
import y50.C15936n0;

/* renamed from: tl1.r */
public final class C14002r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C0082q f39328d;

    /* renamed from: e */
    public final /* synthetic */ boolean f39329e;

    /* renamed from: f */
    public final /* synthetic */ C13998p f39330f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14002r(C0082q qVar, boolean z, C13998p pVar) {
        super(0);
        this.f39328d = qVar;
        this.f39329e = z;
        this.f39330f = pVar;
    }

    public Object invoke() {
        C52204z21 z212;
        C51483u21 u212;
        C52204z21 z213;
        C51483u21 u213;
        C52204z21 z214;
        C51483u21 u214;
        C0082q qVar = this.f39328d;
        C52204z21 z215 = qVar.f509d;
        if (z215 != null) {
            int i = qVar.f506a;
            int i2 = qVar.f507b;
            boolean u = C61926c.m72696u(z215.f145649p, 1);
            Log.m105924i("FinderLiveLotteryVisitorCardPlugin", "visitorOpenCard id:" + z215.f145640d + ", status:" + i + ",participated:" + u + ",statusChange:" + this.f39329e + ",localRemainTime:" + i2);
            int i3 = 2;
            if (i == 1) {
                this.f39330f.mo13434e1(0);
                C13966b0 b0Var = this.f39330f.f39317D;
                if (b0Var != null) {
                    TextView textView = b0Var.f39219f;
                    if (textView != null) {
                        textView.setText(z215.f145644h);
                    }
                    View view = b0Var.f39217d;
                    TextView textView2 = b0Var.f39219f;
                    CharSequence charSequence = null;
                    view.setTag(C0966R.C0970id.d4f, textView2 != null ? textView2.getText() : null);
                    TextView textView3 = b0Var.f39220g;
                    if (textView3 != null) {
                        textView3.setText(b0Var.f39215b.getContext().getResources().getString(C0966R.string.mn4, new Object[]{Integer.valueOf(z215.f145646j)}));
                    }
                    if (z215.f145647n > 0) {
                        TextView textView4 = b0Var.f39222i;
                        if (textView4 != null) {
                            String string = b0Var.f39215b.getContext().getResources().getString(C0966R.string.dsl);
                            C87412m.m108593f(string, "runningContainer.context…nder_live_lottery_attend)");
                            String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(z215.f145647n)}, 1));
                            C87412m.m108593f(format, "format(format, *args)");
                            textView4.setText(format);
                        }
                        TextView textView5 = b0Var.f39222i;
                        if (textView5 != null) {
                            textView5.setVisibility(0);
                        }
                        View view2 = b0Var.f39223j;
                        if (view2 != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(0);
                            View view3 = view2;
                            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget", "visitorLotteryRunning$updateParticipate", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lcom/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget", "visitorLotteryRunning$updateParticipate", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lcom/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        View view4 = b0Var.f39217d;
                        TextView textView6 = b0Var.f39222i;
                        view4.setTag(C0966R.C0970id.d4g, textView6 != null ? textView6.getText() : null);
                    } else {
                        TextView textView7 = b0Var.f39222i;
                        if (textView7 != null) {
                            textView7.setVisibility(8);
                        }
                        View view5 = b0Var.f39223j;
                        if (view5 != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(8);
                            View view6 = view5;
                            C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget", "visitorLotteryRunning$updateParticipate", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lcom/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget", "visitorLotteryRunning$updateParticipate", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lcom/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        b0Var.f39217d.setTag(C0966R.C0970id.d4g, "");
                    }
                    Class cls = C0696x.class;
                    Class cls2 = C13022d0.class;
                    if (C61926c.m72696u(z215.f145649p, 1)) {
                        TextView textView8 = b0Var.f39225l;
                        if (textView8 != null) {
                            textView8.setVisibility(0);
                        }
                        TextView textView9 = b0Var.f39225l;
                        if (textView9 != null) {
                            textView9.setText(b0Var.f39215b.getContext().getResources().getString(C0966R.string.dgs));
                        }
                        TextView textView10 = b0Var.f39224k;
                        if (textView10 != null) {
                            textView10.setVisibility(8);
                        }
                        View view7 = b0Var.f39217d;
                        TextView textView11 = b0Var.f39225l;
                        view7.setTag(C0966R.C0970id.d4d, textView11 != null ? textView11.getText() : null);
                    } else {
                        TextView textView12 = b0Var.f39225l;
                        if (textView12 != null) {
                            textView12.setVisibility(8);
                        }
                        b0Var.f39217d.setTag(C0966R.C0970id.d4d, "");
                        b0Var.mo13415b();
                        C0082q qVar2 = ((C13022d0) b0Var.f39214a.mo87696x0(cls2)).f37098n;
                        Integer valueOf = qVar2 != null ? Integer.valueOf(qVar2.f506a) : null;
                        if (valueOf != null && valueOf.intValue() == 1) {
                            C0082q qVar3 = ((C13022d0) b0Var.f39214a.mo87696x0(cls2)).f37098n;
                            Integer valueOf2 = (qVar3 == null || (z214 = qVar3.f509d) == null || (u214 = z214.f145645i) == null) ? null : Integer.valueOf(u214.f142563d);
                            if (valueOf2 != null && valueOf2.intValue() == 5) {
                                TextView textView13 = b0Var.f39224k;
                                if (textView13 != null) {
                                    textView13.setVisibility(0);
                                }
                                if (((C0696x) b0Var.f39214a.mo87696x0(cls)).f1643f) {
                                    TextView textView14 = b0Var.f39224k;
                                    if (textView14 != null) {
                                        textView14.setEnabled(true);
                                    }
                                    TextView textView15 = b0Var.f39224k;
                                    if (textView15 != null) {
                                        textView15.setTextColor(b0Var.f39215b.getContext().getResources().getColor(C0966R.color.f2975b6));
                                    }
                                    b0Var.mo13416c(C0966R.raw.finder_live_lottery_fan_icon_enable);
                                } else {
                                    TextView textView16 = b0Var.f39224k;
                                    if (textView16 != null) {
                                        textView16.setEnabled(false);
                                    }
                                    TextView textView17 = b0Var.f39224k;
                                    if (textView17 != null) {
                                        textView17.setTextColor(b0Var.f39215b.getContext().getResources().getColor(C0966R.color.f3410rw));
                                    }
                                    b0Var.mo13416c(C0966R.raw.finder_live_lottery_fan_icon_disable);
                                }
                            } else {
                                TextView textView18 = b0Var.f39224k;
                                if (textView18 != null) {
                                    textView18.setVisibility(0);
                                }
                                TextView textView19 = b0Var.f39224k;
                                if (textView19 != null) {
                                    textView19.setEnabled(true);
                                }
                                TextView textView20 = b0Var.f39224k;
                                if (textView20 != null) {
                                    textView20.setTextColor(b0Var.f39215b.getContext().getResources().getColor(C0966R.color.f2975b6));
                                }
                                TextView textView21 = b0Var.f39224k;
                                if (textView21 != null) {
                                    textView21.setCompoundDrawablePadding(0);
                                }
                                TextView textView22 = b0Var.f39224k;
                                if (textView22 != null) {
                                    textView22.setPadding(0, 0, 0, 0);
                                }
                                TextView textView23 = b0Var.f39224k;
                                if (textView23 != null) {
                                    textView23.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                                }
                            }
                        }
                        C0082q qVar4 = ((C13022d0) b0Var.f39214a.mo87696x0(cls2)).f37098n;
                        int i4 = (qVar4 == null || (z213 = qVar4.f509d) == null || (u213 = z213.f145645i) == null) ? 0 : u213.f142563d;
                        if (i4 != 1) {
                            if (i4 == 2) {
                                i3 = 1;
                            } else if (i4 != 3) {
                                i3 = i4 != 4 ? i4 != 5 ? 0 : ((C0696x) b0Var.f39214a.mo87696x0(cls)).f1643f : 3;
                            }
                        }
                        if (i4 != 0) {
                            C7335d c = C86312j.m106911c(C54116w.class);
                            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                            C54116w.my0((C54116w) c, C54067f0.C0071v0.LOTTERY_ATTEND_BTN_EXPOSURE, String.valueOf(i3), (String) null, 0, 12, (Object) null);
                        }
                        C0082q qVar5 = ((C13022d0) b0Var.f39214a.mo87696x0(cls2)).f37098n;
                        if (!(qVar5 == null || (z212 = qVar5.f509d) == null || (u212 = z212.f145645i) == null)) {
                            ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("finder_live_lottery_attend_exposure", b0Var.f39224k, b0Var.mo13414a(u212.f142563d), 25561);
                        }
                    }
                    int i5 = z215.f145641e;
                    int i6 = z215.f145642f;
                    int i7 = z215.f145643g;
                    if (i2 < 0 || i2 >= i6 - i5) {
                        i2 = C62042e.f176370a.mo87099n0(i5, i6, i7);
                    }
                    int i8 = i2;
                    TextView textView24 = b0Var.f39221h;
                    if (textView24 != null) {
                        String string2 = b0Var.f39215b.getContext().getResources().getString(C0966R.string.dt7);
                        C87412m.m108593f(string2, "runningContainer.context…r_live_lottery_countdown)");
                        String format2 = String.format(string2, Arrays.copyOf(new Object[]{C15936n0.C15937a.m14866a(C15936n0.f42815a, i8, XVFSFile.PATH_SEPARATOR, false, false, false, 24, (Object) null)}, 1));
                        C87412m.m108593f(format2, "format(format, *args)");
                        textView24.setText(format2);
                    }
                    View view8 = b0Var.f39217d;
                    TextView textView25 = b0Var.f39221h;
                    if (textView25 != null) {
                        charSequence = textView25.getText();
                    }
                    view8.setTag(C0966R.C0970id.d4h, charSequence);
                }
                this.f39330f.mo10792g(0);
            } else if (i == 2) {
                C13998p pVar = this.f39330f;
                pVar.mo13429d1(this.f39328d, z215, i, pVar.f39322I);
            } else if (i == 3) {
                C13998p pVar2 = this.f39330f;
                pVar2.mo13429d1(this.f39328d, z215, i, pVar2.f39323J);
            } else if (i == 4) {
                C13998p pVar3 = this.f39330f;
                pVar3.getClass();
                Log.m105924i("FinderLiveLotteryVisitorCardPlugin", "visitorLotteryCancelled id:" + z215.f145640d);
                C58124b bVar = pVar3.f39314A;
                C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_SHOW_ALERT_DIALOG;
                Bundle bundle = new Bundle();
                bundle.putString("PARAM_FINDER_LIVE_ALERT_DIALOG_CONTENT", MMApplicationContext.getContext().getResources().getString(C0966R.string.dfe));
                C13598b0 b0Var2 = C13598b0.f38549a;
                bVar.statusChange(bVar2, bundle);
                this.f39330f.mo10792g(8);
            }
        }
        return C13598b0.f38549a;
    }
}
