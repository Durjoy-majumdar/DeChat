package com.tencent.p014mm.plugin.p019aa.p020ui;

import ag0.C27890c;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bg0.C67235i;
import bg0.C67236j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.ViewAnimHelper;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import com.tencent.p014mm.wallet_core.p137ui.WcPayBannerView;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d62.C75339i;
import de3.C75355a0;
import di3.C86312j;
import eb0.C75592q0;
import g63.C45890a;
import go3.C76003c;
import hp3.C87581a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import lp3.C88631d;
import lp3.C88633e;
import lp3.C88643g;
import nj3.C76879j;
import p158gt.C76057w;
import p196ln.C76705f;
import p629ny.C76979h;
import p910lj.C76701a;
import qo3.C47883u;
import qo3.C77389a;
import qo3.C77398g;
import qo3.C77426q;
import te3.C51181s;
import te3.C64820x;
import te3.C77903a;
import te3.C78021z;
import vf0.C37726b;
import yf0.C79090a;
import yf0.C79104i;

/* renamed from: com.tencent.mm.plugin.aa.ui.PaylistAAUI */
public class PaylistAAUI extends BaseAAPresenterActivity {

    /* renamed from: R */
    public static final /* synthetic */ int f196231R = 0;

    /* renamed from: A */
    public String f196232A;

    /* renamed from: B */
    public TextView f196233B;

    /* renamed from: C */
    public TextView f196234C;

    /* renamed from: D */
    public TextView f196235D;

    /* renamed from: E */
    public TextView f196236E;

    /* renamed from: F */
    public WcPayBannerView f196237F;

    /* renamed from: G */
    public String f196238G;

    /* renamed from: H */
    public String f196239H;

    /* renamed from: I */
    public String f196240I;

    /* renamed from: J */
    public String f196241J;

    /* renamed from: K */
    public String f196242K;

    /* renamed from: L */
    public int f196243L;

    /* renamed from: M */
    public String f196244M;

    /* renamed from: N */
    public String f196245N;

    /* renamed from: P */
    public long f196246P;

    /* renamed from: Q */
    public int f196247Q;

    /* renamed from: g */
    public C67236j f196248g = ((C67236j) this.f196016e.mo136940b(this, C67236j.class));

    /* renamed from: h */
    public C67235i f196249h = ((C67235i) this.f196016e.mo136941c(this, C67235i.class));

    /* renamed from: i */
    public View f196250i;

    /* renamed from: j */
    public Dialog f196251j = null;

    /* renamed from: n */
    public Dialog f196252n = null;

    /* renamed from: o */
    public LinearLayout f196253o;

    /* renamed from: p */
    public LinearLayout f196254p;

    /* renamed from: q */
    public LinearLayout f196255q;

    /* renamed from: r */
    public LinearLayout f196256r;

    /* renamed from: s */
    public LinearLayout f196257s;

    /* renamed from: t */
    public RelativeLayout f196258t;

    /* renamed from: u */
    public WalletTextView f196259u;

    /* renamed from: v */
    public Button f196260v;

    /* renamed from: w */
    public TextView f196261w;

    /* renamed from: x */
    public TextView f196262x;

    /* renamed from: y */
    public TextView f196263y;

    /* renamed from: z */
    public String f196264z;

    /* renamed from: com.tencent.mm.plugin.aa.ui.PaylistAAUI$a */
    public class C68256a extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ TextView f196265g;

        /* renamed from: h */
        public final /* synthetic */ SpannableStringBuilder f196266h;

        /* renamed from: i */
        public final /* synthetic */ SpannableStringBuilder f196267i;

        public C68256a(PaylistAAUI paylistAAUI, TextView textView, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
            this.f196265g = textView;
            this.f196266h = spannableStringBuilder;
            this.f196267i = spannableStringBuilder2;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            if (view.isSelected()) {
                this.f196265g.setText(this.f196266h);
                this.f196265g.setSelected(false);
                return;
            }
            this.f196265g.setText(this.f196267i);
            this.f196265g.setSelected(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.PaylistAAUI$b */
    public class C68257b implements MenuItem.OnMenuItemClickListener {
        public C68257b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            PaylistAAUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.PaylistAAUI$c */
    public class C68258c implements C7092q.C7093a {

        /* renamed from: com.tencent.mm.plugin.aa.ui.PaylistAAUI$c$a */
        public class C68259a implements C47883u {
            public C68259a(C68258c cVar) {
            }

            /* renamed from: a */
            public void mo353a(boolean z, String str) {
            }
        }

        /* renamed from: com.tencent.mm.plugin.aa.ui.PaylistAAUI$c$b */
        public class C68260b implements C47883u {
            public C68260b() {
            }

            /* renamed from: a */
            public void mo353a(boolean z, String str) {
                PaylistAAUI.m80673I7(PaylistAAUI.this);
            }
        }

        public C68258c() {
        }

        public void onClick(View view) {
            Log.m105924i("MicroMsg.Aa.PaylistAAUI", "click AlertMsgTips");
            int i = !C72996z1.m85820U5(PaylistAAUI.this.f196239H) ? C0966R.string.k7z : C0966R.string.k7x;
            C77426q qVar = new C77426q(PaylistAAUI.this);
            qVar.mo107606r(PaylistAAUI.this.getString(C0966R.string.f361482k80));
            View inflate = C85868k2.m106137b(PaylistAAUI.this).inflate(C0966R.C0971layout.cb7, (ViewGroup) null);
            ((ImageView) inflate.findViewById(C0966R.C0970id.f39)).setImageResource(C0966R.C0969drawable.c_5);
            ((TextView) inflate.findViewById(C0966R.C0970id.khj)).setText(i);
            qVar.mo107592d(inflate);
            qVar.mo107601m(C0966R.string.a2s);
            qVar.mo107598j(PaylistAAUI.this.getString(C0966R.string.f7926wf));
            qVar.mo107591c(new C68259a(this), new C68260b());
            qVar.mo107603o();
            C115669n.INSTANCE.mo160131h(13721, 4, 7, Integer.valueOf(PaylistAAUI.this.f196247Q));
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.PaylistAAUI$d */
    public class C68261d implements C87581a<Void, Void> {
        public C68261d(PaylistAAUI paylistAAUI) {
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            Log.m105924i("MicroMsg.Aa.PaylistAAUI", "insert msg finish");
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.PaylistAAUI$e */
    public class C68262e implements C7092q.C7093a {
        public C68262e() {
        }

        public void onClick(View view) {
            PaylistAAUI.m80677M7(PaylistAAUI.this);
            C115669n.INSTANCE.mo160131h(13721, 4, 10, Integer.valueOf(PaylistAAUI.this.f196247Q));
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.PaylistAAUI$f */
    public class C68263f implements C7092q.C7093a {
        public C68263f() {
        }

        public void onClick(View view) {
            PaylistAAUI.m80677M7(PaylistAAUI.this);
            C115669n.INSTANCE.mo160131h(13721, 4, 10, Integer.valueOf(PaylistAAUI.this.f196247Q));
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.PaylistAAUI$g */
    public class C68264g implements C88631d.C76721a {

        /* renamed from: com.tencent.mm.plugin.aa.ui.PaylistAAUI$g$a */
        public class C68265a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C77903a f196274d;

            public C68265a(C77903a aVar) {
                this.f196274d = aVar;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.Aa.PaylistAAUI", "click getPayListDetail onInterrupt Item");
                C75228t.m90219L(PaylistAAUI.this.getContext(), this.f196274d.f226968h, false);
            }
        }

        public C68264g() {
        }

        /* renamed from: a */
        public void mo1720a(Object obj) {
            Log.m105925i("MicroMsg.Aa.PaylistAAUI", "onInterrupt: %s", obj);
            PaylistAAUI.this.hideLoading();
            if (obj == null || !(obj instanceof C77903a)) {
                PaylistAAUI.m80676L7(PaylistAAUI.this, obj == null ? "" : obj.toString());
                return;
            }
            C77903a aVar = (C77903a) obj;
            String str = aVar.f226965e;
            String str2 = aVar.f226966f;
            String str3 = aVar.f226967g;
            AppCompatActivity context = PaylistAAUI.this.getContext();
            C77389a aVar2 = new C77389a();
            aVar2.f225660q = str;
            aVar2.f225663t = str3;
            aVar2.f225620C = new C68265a(aVar);
            aVar2.f225664u = str2;
            C77398g gVar = new C77398g(context, C0966R.style.a66);
            gVar.mo107525e(aVar2);
            gVar.show();
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.PaylistAAUI$h */
    public class C68266h implements C87581a<Void, C78021z> {
        public C68266h() {
        }

        public Object call(Object obj) {
            TextView textView;
            String str;
            int i;
            int i2;
            SpannableString spannableString;
            C78021z zVar = (C78021z) obj;
            if (zVar == null) {
                Log.m105920e("MicroMsg.Aa.PaylistAAUI", "queryDetailRes is null!!!");
                PaylistAAUI.m80676L7(PaylistAAUI.this, (String) null);
                return null;
            }
            Log.m105925i("MicroMsg.Aa.PaylistAAUI", "get queryDetailRes: %s, billNo: %s, type: %s, state: %s, is_launcher: %s, role: %s, role_state: %s, payer_list.size: %s", zVar, zVar.f228661f, Integer.valueOf(zVar.f228663h), Integer.valueOf(zVar.f228669q), Integer.valueOf(zVar.f228671s), Integer.valueOf(zVar.f228672t), Integer.valueOf(zVar.f228673u), Integer.valueOf(zVar.f228649A.size()));
            Log.m105925i("MicroMsg.Aa.PaylistAAUI", "paid_num: %s, plan_num: %s, activity_amount: %s", Integer.valueOf(zVar.f228668p), Integer.valueOf(zVar.f228666n), Long.valueOf(zVar.f228652D));
            View view = PaylistAAUI.this.f196250i;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/aa/ui/PaylistAAUI$4", "call", "(Lcom/tencent/mm/protocal/protobuf/AAQueryDetailRes;)Ljava/lang/Void;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/aa/ui/PaylistAAUI$4", "call", "(Lcom/tencent/mm/protocal/protobuf/AAQueryDetailRes;)Ljava/lang/Void;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            PaylistAAUI paylistAAUI = PaylistAAUI.this;
            paylistAAUI.f196240I = zVar.f228664i;
            paylistAAUI.f196241J = zVar.f228656H;
            paylistAAUI.f196243L = zVar.f228649A.size() + 1;
            PaylistAAUI paylistAAUI2 = PaylistAAUI.this;
            paylistAAUI2.f196242K = zVar.f228662g;
            paylistAAUI2.f196247Q = zVar.f228663h;
            paylistAAUI2.f196237F.setBannerData(zVar.f228658J);
            PaylistAAUI paylistAAUI3 = PaylistAAUI.this;
            paylistAAUI3.getClass();
            String str2 = zVar.f228664i;
            String str3 = zVar.f228662g;
            double r = C79104i.m95673r((double) zVar.f228665j);
            TextView textView2 = (TextView) paylistAAUI3.findViewById(C0966R.C0970id.htb);
            C85875k4.m106189j0(textView2.getPaint(), 0.8f);
            textView2.setText(((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(zVar.f228664i) + paylistAAUI3.getString(C0966R.string.hhe));
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z((ImageView) paylistAAUI3.findViewById(C0966R.C0970id.hsq), str2);
            TextView textView3 = (TextView) paylistAAUI3.findViewById(C0966R.C0970id.ht4);
            TextView textView4 = (TextView) paylistAAUI3.findViewById(C0966R.C0970id.ht5);
            int i3 = zVar.f228663h;
            if (i3 == 4) {
                textView4.setVisibility(8);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView2.getLayoutParams();
                layoutParams.topMargin = C76577a.m92151b(paylistAAUI3.getContext(), 8);
                textView2.setLayoutParams(layoutParams);
                textView = textView3;
                str = str3;
            } else {
                if (i3 == 2) {
                    long j = zVar.f228652D;
                    textView = textView3;
                    if (j > zVar.f228665j) {
                        String string = paylistAAUI3.getString(C0966R.string.f7325ct, new Object[]{Double.valueOf(C79104i.m95673r((double) j))});
                        str = str3;
                        String string2 = paylistAAUI3.getString(C0966R.string.f7325ct, new Object[]{Double.valueOf(C79104i.m95673r((double) zVar.f228665j))});
                        String str4 = paylistAAUI3.getString(C0966R.string.hhd) + string + paylistAAUI3.getString(C0966R.string.hha) + string2;
                        spannableString = new SpannableString(str4);
                        WcPayTextApppearanceSpan wcPayTextApppearanceSpan = new WcPayTextApppearanceSpan((String) null, 0, (int) textView4.getTextSize(), ColorStateList.valueOf(paylistAAUI3.getResources().getColor(C0966R.color.FG_1)), (ColorStateList) null);
                        wcPayTextApppearanceSpan.f210885d = C75228t.m90274w(paylistAAUI3.getContext(), 7);
                        WcPayTextApppearanceSpan wcPayTextApppearanceSpan2 = new WcPayTextApppearanceSpan((String) null, 0, (int) textView4.getTextSize(), ColorStateList.valueOf(paylistAAUI3.getResources().getColor(C0966R.color.FG_1)), (ColorStateList) null);
                        wcPayTextApppearanceSpan2.f210885d = C75228t.m90274w(paylistAAUI3.getContext(), 7);
                        spannableString.setSpan(wcPayTextApppearanceSpan, str4.indexOf(string), str4.indexOf(string) + string.length(), 17);
                        spannableString.setSpan(wcPayTextApppearanceSpan2, str4.lastIndexOf(string2), str4.lastIndexOf(string2) + string2.length(), 17);
                        textView4.setText(spannableString);
                        Log.m105925i("MicroMsg.Aa.PaylistAAUI", "top title : %s", spannableString.toString());
                    }
                } else {
                    textView = textView3;
                }
                str = str3;
                String string3 = paylistAAUI3.getString(C0966R.string.f7325ct, new Object[]{Double.valueOf(r)});
                String str5 = paylistAAUI3.getString(C0966R.string.hhd) + string3;
                spannableString = new SpannableString(str5);
                WcPayTextApppearanceSpan wcPayTextApppearanceSpan3 = new WcPayTextApppearanceSpan((String) null, 0, (int) textView4.getTextSize(), ColorStateList.valueOf(paylistAAUI3.getResources().getColor(C0966R.color.FG_1)), (ColorStateList) null);
                wcPayTextApppearanceSpan3.f210885d = C75228t.m90274w(paylistAAUI3.getContext(), 7);
                spannableString.setSpan(wcPayTextApppearanceSpan3, str5.lastIndexOf(string3), str5.lastIndexOf(string3) + string3.length(), 17);
                textView4.setText(spannableString);
                Log.m105925i("MicroMsg.Aa.PaylistAAUI", "top title : %s", spannableString.toString());
            }
            textView4.postDelayed(new C1336u1(paylistAAUI3, textView4, textView2), 100);
            try {
                if (Util.isNullOrNil(zVar.f228653E)) {
                    paylistAAUI3.mo93856R7(textView, ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(paylistAAUI3.getContext(), str), "", zVar);
                } else {
                    TextView textView5 = textView;
                    textView5.setClickable(true);
                    textView5.setOnTouchListener(new C75355a0(paylistAAUI3));
                    textView5.post(new C68347v1(paylistAAUI3, textView5, str, zVar));
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Aa.PaylistAAUI", e, "", new Object[0]);
            }
            PaylistAAUI paylistAAUI4 = PaylistAAUI.this;
            paylistAAUI4.getClass();
            int i4 = zVar.f228669q;
            if (i4 == 2) {
                paylistAAUI4.f196233B.setText(C0966R.string.hh4);
                paylistAAUI4.f196233B.setTextColor(paylistAAUI4.getResources().getColor(C0966R.color.FG_1));
            } else if (i4 == 3) {
                paylistAAUI4.f196233B.setText(C0966R.string.f361125hh2);
                paylistAAUI4.f196233B.setTextColor(paylistAAUI4.getResources().getColor(C0966R.color.FG_1));
            } else {
                int i5 = zVar.f228672t;
                if (i5 == 3) {
                    paylistAAUI4.f196254p.setVisibility(8);
                    paylistAAUI4.f196253o.setVisibility(0);
                    paylistAAUI4.f196233B.setText(paylistAAUI4.getString(C0966R.string.hhf));
                    paylistAAUI4.f196233B.setTextColor(paylistAAUI4.getResources().getColor(C0966R.color.FG_1));
                    C27890c Lo = C37726b.vx0().mo55666Lo(zVar.f228661f);
                    if (Lo != null) {
                        Lo.field_status = 4;
                        C37726b.vx0().replace(Lo);
                    }
                } else if (i5 == 2) {
                    paylistAAUI4.f196254p.setVisibility(8);
                    paylistAAUI4.f196253o.setVisibility(0);
                    int i6 = zVar.f228673u;
                    if (i6 == 6) {
                        paylistAAUI4.f196233B.setText(paylistAAUI4.getString(C0966R.string.f361126hh3));
                        paylistAAUI4.f196233B.setTextColor(paylistAAUI4.getResources().getColor(C0966R.color.a84));
                    } else if (i6 == 2) {
                        String string4 = paylistAAUI4.getString(C0966R.string.f7325ct, new Object[]{Double.valueOf(C79104i.m95673r((double) zVar.f228667o))});
                        String str6 = paylistAAUI4.getString(C0966R.string.hhl) + string4;
                        SpannableString spannableString2 = new SpannableString(str6);
                        WcPayTextApppearanceSpan wcPayTextApppearanceSpan4 = new WcPayTextApppearanceSpan((String) null, 0, (int) paylistAAUI4.f196233B.getTextSize(), ColorStateList.valueOf(paylistAAUI4.getResources().getColor(C0966R.color.a84)), (ColorStateList) null);
                        wcPayTextApppearanceSpan4.f210885d = C75228t.m90274w(paylistAAUI4.getContext(), 4);
                        spannableString2.setSpan(wcPayTextApppearanceSpan4, str6.lastIndexOf(string4), str6.lastIndexOf(string4) + string4.length(), 17);
                        paylistAAUI4.f196233B.setText(spannableString2);
                        paylistAAUI4.f196233B.setTextColor(paylistAAUI4.getResources().getColor(C0966R.color.a84));
                    } else if (i6 == 1) {
                        String string5 = paylistAAUI4.getString(C0966R.string.hhn);
                        String str7 = paylistAAUI4.getString(C0966R.string.hhl) + string5;
                        SpannableString spannableString3 = new SpannableString(str7);
                        WcPayTextApppearanceSpan wcPayTextApppearanceSpan5 = new WcPayTextApppearanceSpan((String) null, 0, (int) paylistAAUI4.f196233B.getTextSize(), ColorStateList.valueOf(paylistAAUI4.getResources().getColor(C0966R.color.a84)), (ColorStateList) null);
                        wcPayTextApppearanceSpan5.f210885d = C75228t.m90274w(paylistAAUI4.getContext(), 4);
                        spannableString3.setSpan(wcPayTextApppearanceSpan5, str7.lastIndexOf(string5), str7.lastIndexOf(string5) + string5.length(), 17);
                        paylistAAUI4.f196233B.setText(spannableString3);
                    } else {
                        Log.m105921e("MicroMsg.Aa.PaylistAAUI", "unhandled state, state: %s, type: %s, role: %s", Integer.valueOf(zVar.f228669q), Integer.valueOf(zVar.f228663h), Integer.valueOf(zVar.f228672t));
                        paylistAAUI4.f196233B.setVisibility(8);
                    }
                } else if (i5 == 1) {
                    if (zVar.f228663h == 4) {
                        int i7 = zVar.f228673u;
                        Log.m105925i("MicroMsg.Aa.PaylistAAUI", "renderInstantPayAreaForCustomize role:%s", Integer.valueOf(i7));
                        if (i7 == 1) {
                            paylistAAUI4.f196254p.setVisibility(0);
                            paylistAAUI4.f196253o.setVisibility(8);
                            WalletTextView walletTextView = (WalletTextView) paylistAAUI4.findViewById(C0966R.C0970id.hap);
                            paylistAAUI4.f196259u = walletTextView;
                            walletTextView.setVisibility(8);
                            ((TextView) paylistAAUI4.f196254p.findViewById(C0966R.C0970id.f358915ht3)).setVisibility(8);
                            C64820x f = C79104i.m95661f(zVar.f228649A);
                            if (f != null && !Util.isNullOrNil(f.f186250i)) {
                                paylistAAUI4.f196232A = f.f186250i;
                            }
                            Button button = (Button) paylistAAUI4.f196254p.findViewById(C0966R.C0970id.f358913ht1);
                            paylistAAUI4.f196260v = button;
                            int i8 = zVar.f228669q;
                            if (i8 == 2 || i8 == 3) {
                                button.setVisibility(8);
                            } else {
                                button.setText(paylistAAUI4.getString(C0966R.string.hh8));
                                paylistAAUI4.f196260v.setOnClickListener(new C68282e1(paylistAAUI4));
                                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) paylistAAUI4.f196260v.getLayoutParams();
                                layoutParams2.topMargin = 0;
                                paylistAAUI4.f196260v.setLayoutParams(layoutParams2);
                            }
                        } else if (i7 != 7) {
                            Log.m105924i("MicroMsg.Aa.PaylistAAUI", "unknown type");
                        } else {
                            paylistAAUI4.f196254p.setVisibility(8);
                            paylistAAUI4.f196253o.setVisibility(0);
                            String string6 = paylistAAUI4.getString(C0966R.string.f7325ct, new Object[]{Double.valueOf(C79104i.m95673r((double) zVar.f228674v))});
                            String str8 = paylistAAUI4.getString(C0966R.string.hhh) + string6;
                            SpannableString spannableString4 = new SpannableString(str8);
                            WcPayTextApppearanceSpan wcPayTextApppearanceSpan6 = new WcPayTextApppearanceSpan((String) null, 0, (int) paylistAAUI4.f196233B.getTextSize(), ColorStateList.valueOf(paylistAAUI4.getResources().getColor(C0966R.color.a84)), (ColorStateList) null);
                            wcPayTextApppearanceSpan6.f210885d = C75228t.m90274w(paylistAAUI4.getContext(), 4);
                            spannableString4.setSpan(wcPayTextApppearanceSpan6, str8.lastIndexOf(string6), str8.lastIndexOf(string6) + string6.length(), 17);
                            paylistAAUI4.f196233B.setText(spannableString4);
                            paylistAAUI4.f196233B.setTextColor(paylistAAUI4.getResources().getColor(C0966R.color.a84));
                        }
                    } else {
                        C64820x f2 = C79104i.m95661f(zVar.f228649A);
                        int i9 = zVar.f228673u;
                        if (i9 == 1 || (f2 != null && f2.f186248g == 1)) {
                            String format = String.format("%.2f", new Object[]{Double.valueOf(C79104i.m95673r((double) zVar.f228674v))});
                            String string7 = paylistAAUI4.getString(C0966R.string.f361123hh0);
                            String str9 = f2.f186250i;
                            paylistAAUI4.f196246P = zVar.f228674v;
                            int i15 = zVar.f228669q;
                            paylistAAUI4.f196254p.setVisibility(0);
                            paylistAAUI4.f196253o.setVisibility(8);
                            paylistAAUI4.f196260v = (Button) paylistAAUI4.f196254p.findViewById(C0966R.C0970id.f358913ht1);
                            paylistAAUI4.f196261w = (TextView) paylistAAUI4.f196254p.findViewById(C0966R.C0970id.hsp);
                            paylistAAUI4.f196262x = (TextView) paylistAAUI4.f196254p.findViewById(C0966R.C0970id.hsy);
                            paylistAAUI4.f196257s = (LinearLayout) paylistAAUI4.findViewById(C0966R.C0970id.hsz);
                            if (!Util.isNullOrNil(str9)) {
                                paylistAAUI4.f196263y.setVisibility(0);
                                paylistAAUI4.f196263y.setText(str9);
                                paylistAAUI4.f196232A = paylistAAUI4.f196263y.getText().toString();
                                i2 = 8;
                            } else {
                                i2 = 8;
                                paylistAAUI4.f196263y.setVisibility(8);
                            }
                            paylistAAUI4.mo93857S7();
                            if (i15 == 2 || i15 == 3) {
                                paylistAAUI4.f196260v.setVisibility(i2);
                                paylistAAUI4.f196262x.setVisibility(i2);
                            } else {
                                paylistAAUI4.f196261w.setVisibility(0);
                                paylistAAUI4.f196262x.setVisibility(i2);
                            }
                            paylistAAUI4.f196260v.setOnClickListener(new C68284f1(paylistAAUI4));
                            paylistAAUI4.f196257s.setVisibility(0);
                            paylistAAUI4.f196259u = (WalletTextView) paylistAAUI4.findViewById(C0966R.C0970id.hap);
                            paylistAAUI4.f196259u.mo105015b();
                            paylistAAUI4.f196259u.setText(format);
                            paylistAAUI4.f196259u.setTextSize(46.0f);
                            ((TextView) paylistAAUI4.f196254p.findViewById(C0966R.C0970id.f358915ht3)).setText(string7);
                        } else if (i9 == 7 || (f2 != null && f2.f186248g == 7)) {
                            paylistAAUI4.f196254p.setVisibility(8);
                            paylistAAUI4.f196253o.setVisibility(0);
                            String string8 = paylistAAUI4.getString(C0966R.string.f7325ct, new Object[]{Double.valueOf(C79104i.m95673r((double) zVar.f228674v))});
                            String str10 = paylistAAUI4.getString(C0966R.string.hhh) + string8;
                            SpannableString spannableString5 = new SpannableString(str10);
                            WcPayTextApppearanceSpan wcPayTextApppearanceSpan7 = new WcPayTextApppearanceSpan((String) null, 0, (int) paylistAAUI4.f196233B.getTextSize(), ColorStateList.valueOf(paylistAAUI4.getResources().getColor(C0966R.color.a84)), (ColorStateList) null);
                            wcPayTextApppearanceSpan7.f210885d = C75228t.m90274w(paylistAAUI4.getContext(), 4);
                            spannableString5.setSpan(wcPayTextApppearanceSpan7, str10.lastIndexOf(string8), str10.lastIndexOf(string8) + string8.length(), 17);
                            paylistAAUI4.f196233B.setText(spannableString5);
                            paylistAAUI4.f196233B.setTextColor(paylistAAUI4.getResources().getColor(C0966R.color.a84));
                        } else {
                            Log.m105921e("MicroMsg.Aa.PaylistAAUI", "unhandled state, state: %s, type: %s, role: %s", Integer.valueOf(zVar.f228669q), Integer.valueOf(zVar.f228663h), Integer.valueOf(zVar.f228672t));
                            paylistAAUI4.f196254p.setVisibility(8);
                            paylistAAUI4.f196233B.setVisibility(8);
                        }
                    }
                }
            }
            if (zVar.f228672t == 2 && ((i = zVar.f228669q) == 2 || i == 3 || zVar.f228673u == 6)) {
                paylistAAUI4.f196234C.setText(paylistAAUI4.getString(C0966R.string.hhj, new Object[]{Double.valueOf(C79104i.m95673r((double) zVar.f228667o))}));
                paylistAAUI4.f196234C.setVisibility(0);
            } else {
                paylistAAUI4.f196234C.setVisibility(8);
            }
            PaylistAAUI paylistAAUI5 = PaylistAAUI.this;
            paylistAAUI5.getClass();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<C64820x> it = zVar.f228649A.iterator();
            while (it.hasNext()) {
                C64820x next = it.next();
                if (next.f186248g == 1) {
                    arrayList2.add(next);
                } else {
                    arrayList.add(next);
                }
            }
            if (arrayList2.isEmpty() && arrayList.size() > 0) {
                paylistAAUI5.mo93855Q7(arrayList, paylistAAUI5.getString(C0966R.string.hgv, new Object[]{Integer.valueOf(arrayList.size())}), paylistAAUI5.mo93853O7(zVar.f228672t, zVar.f228673u, zVar.f228669q, zVar.f228663h, zVar.f228649A));
                paylistAAUI5.f196255q.setVisibility(8);
            } else if (arrayList.isEmpty() && arrayList2.size() > 0) {
                paylistAAUI5.f196255q.setVisibility(8);
                paylistAAUI5.mo93855Q7(arrayList2, paylistAAUI5.getString(C0966R.string.hgu, new Object[]{Integer.valueOf(arrayList2.size())}), paylistAAUI5.mo93853O7(zVar.f228672t, zVar.f228673u, zVar.f228669q, zVar.f228663h, zVar.f228649A));
            } else if (arrayList2.size() > 0 && arrayList.size() > 0) {
                paylistAAUI5.f196255q.setVisibility(8);
                String string9 = paylistAAUI5.getString(C0966R.string.hgw, new Object[]{Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size())});
                arrayList2.addAll(arrayList);
                paylistAAUI5.mo93855Q7(arrayList2, string9, paylistAAUI5.mo93853O7(zVar.f228672t, zVar.f228673u, zVar.f228669q, zVar.f228663h, zVar.f228649A));
            } else if (zVar.f228663h != 4 || !arrayList.isEmpty()) {
                paylistAAUI5.f196255q.setVisibility(8);
                paylistAAUI5.f196256r.setVisibility(8);
            } else {
                paylistAAUI5.f196255q.setVisibility(8);
                paylistAAUI5.f196256r.setVisibility(8);
                paylistAAUI5.f196235D.setVisibility(paylistAAUI5.mo93853O7(zVar.f228672t, zVar.f228673u, zVar.f228669q, zVar.f228663h, zVar.f228649A) ? 0 : 8);
            }
            PaylistAAUI paylistAAUI6 = PaylistAAUI.this;
            paylistAAUI6.getClass();
            paylistAAUI6.addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C68337t1(paylistAAUI6, zVar));
            PaylistAAUI paylistAAUI7 = PaylistAAUI.this;
            paylistAAUI7.getClass();
            if (zVar.f228672t != 2 || Util.isNullOrNil(zVar.f228664i) || !zVar.f228664i.equals(C75592q0.m90789s())) {
                paylistAAUI7.f196236E.setVisibility(8);
                paylistAAUI7.f196258t.setPadding(0, 0, 0, C74942w4.m89784a(paylistAAUI7.getContext(), 32));
            } else {
                paylistAAUI7.f196236E.setVisibility(0);
                paylistAAUI7.f196258t.setPadding(0, 0, 0, C74942w4.m89784a(paylistAAUI7.getContext(), 24));
            }
            if (paylistAAUI7.f196236E.getVisibility() != 0) {
                Log.m105924i("MicroMsg.Aa.PaylistAAUI", "no need to show bottom tv");
            } else if (Util.isNullOrNil(zVar.f228650B)) {
                Log.m105924i("MicroMsg.Aa.PaylistAAUI", "wording is null");
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zVar.f228650B);
                if (zVar.f228651C == 1) {
                    paylistAAUI7.f196236E.setClickable(true);
                    String str11 = zVar.f228650B;
                    C75228t.m90253j0(paylistAAUI7.f196236E, str11, 0, str11.length(), new C7092q((C7092q.C7093a) new C68333s1(paylistAAUI7), true), paylistAAUI7.getContext());
                } else {
                    paylistAAUI7.f196236E.setText(spannableStringBuilder);
                }
            }
            PaylistAAUI paylistAAUI8 = PaylistAAUI.this;
            paylistAAUI8.getClass();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(paylistAAUI8.getString(C0966R.string.hho));
            spannableStringBuilder2.setSpan(new C7092q((C7092q.C7093a) new C68324q1(paylistAAUI8, zVar), true), 0, spannableStringBuilder2.length(), 18);
            paylistAAUI8.f196235D.setText(spannableStringBuilder2);
            PaylistAAUI.this.hideLoading();
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.PaylistAAUI$i */
    public class C68267i implements C7092q.C7093a {

        /* renamed from: a */
        public final /* synthetic */ C78021z f196277a;

        /* renamed from: b */
        public final /* synthetic */ TextView f196278b;

        /* renamed from: com.tencent.mm.plugin.aa.ui.PaylistAAUI$i$a */
        public class C68268a implements Runnable {

            /* renamed from: com.tencent.mm.plugin.aa.ui.PaylistAAUI$i$a$a */
            public class C68269a implements DialogInterface.OnCancelListener {
                public C68269a() {
                }

                public void onCancel(DialogInterface dialogInterface) {
                    Dialog dialog = PaylistAAUI.this.f196252n;
                    if (dialog != null && dialog.isShowing()) {
                        PaylistAAUI.this.f196252n.dismiss();
                    }
                }
            }

            /* renamed from: com.tencent.mm.plugin.aa.ui.PaylistAAUI$i$a$b */
            public class C68270b implements C76057w.C76058a {
                public C68270b() {
                }

                /* renamed from: a */
                public void mo25933a(String str, Bitmap bitmap, String str2) {
                    Log.m105925i("MicroMsg.Aa.PaylistAAUI", "onLoadImageEnd() url:%s path:%s", str, str2);
                    Dialog dialog = PaylistAAUI.this.f196252n;
                    if (dialog != null && dialog.isShowing()) {
                        PaylistAAUI.this.f196252n.dismiss();
                    }
                    if (bitmap != null) {
                        Intent intent = new Intent();
                        intent.putExtra("use_scene", 2);
                        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
                        intent.putExtra("url", C68267i.this.f196277a.f228653E);
                        intent.putExtra("path", str2);
                        C68267i iVar = C68267i.this;
                        ViewAnimHelper.ViewInfo b = ViewAnimHelper.m90033b(iVar.f196278b, PaylistAAUI.this.getContext().getWindow().getDecorView());
                        Rect rect = b.f220867d;
                        rect.right = rect.left + C76577a.m92151b(PaylistAAUI.this.getContext(), 30);
                        b.f220867d.set(rect);
                        intent.putExtra("view_info", b);
                        intent.putExtra("aa_type", PaylistAAUI.this.f196247Q);
                        C88144b.m109795m(PaylistAAUI.this, "aa", ".ui.AAImagPreviewUI", intent, 100);
                        return;
                    }
                    C76701a.makeText((Context) PaylistAAUI.this, (int) C0966R.string.f7287bn, 1).show();
                }
            }

            public C68268a() {
            }

            public void run() {
                C115669n.INSTANCE.mo160131h(13721, 4, 12, Integer.valueOf(PaylistAAUI.this.f196247Q));
                PaylistAAUI paylistAAUI = PaylistAAUI.this;
                if (paylistAAUI.f196252n == null) {
                    paylistAAUI.f196252n = C76879j.m92721O(paylistAAUI, (String) null, 3, C0966R.style.f8510l3, paylistAAUI.getString(C0966R.string.gas), true, true, new C68269a());
                }
                ((C76057w) C86312j.m106911c(C76057w.class)).h60(C68267i.this.f196277a.f228653E, new C68270b());
            }
        }

        public C68267i(C78021z zVar, TextView textView) {
            this.f196277a = zVar;
            this.f196278b = textView;
        }

        public void onClick(View view) {
            Log.m105924i("MicroMsg.Aa.PaylistAAUI", "launcherTipTv img click");
            MMHandlerThread.postToMainThread(new C68268a());
        }
    }

    /* renamed from: I7 */
    public static void m80673I7(PaylistAAUI paylistAAUI) {
        paylistAAUI.getClass();
        Log.m105924i("MicroMsg.Aa.PaylistAAUI", "click urgeAAPay");
        paylistAAUI.hideLoading();
        paylistAAUI.f196251j = C75197d0.m90164e(paylistAAUI, false, (DialogInterface.OnCancelListener) null);
        C67236j.C67241f fVar = paylistAAUI.f196248g.f193071g;
        fVar.getClass();
        ((C88633e) C88643g.m110546d()).mo123061d(fVar).mo123062e(new C68311n1(paylistAAUI)).mo123065b(new C68303m1(paylistAAUI));
        C115669n.INSTANCE.mo160131h(13721, 4, 8, Integer.valueOf(paylistAAUI.f196247Q));
    }

    /* renamed from: J7 */
    public static void m80674J7(PaylistAAUI paylistAAUI, C51181s sVar) {
        paylistAAUI.getClass();
        Log.m105924i("MicroMsg.Aa.PaylistAAUI", "click doPay");
        boolean z = paylistAAUI.getIntent().getIntExtra("enter_scene", 0) == 1;
        String str = sVar.f141238f;
        paylistAAUI.f196238G = sVar.f141239g;
        paylistAAUI.f196244M = sVar.f141241i;
        paylistAAUI.f196245N = sVar.f141243n;
        C79104i.m95672q(paylistAAUI, str, z, sVar.f141240h, paylistAAUI.f196240I, paylistAAUI.f196239H, 233);
    }

    /* renamed from: K7 */
    public static void m80675K7(PaylistAAUI paylistAAUI, String str) {
        C76879j.m92754y(paylistAAUI.getContext(), str, "", paylistAAUI.getContext().getString(C0966R.string.g47), new C68330r1(paylistAAUI));
    }

    /* renamed from: L7 */
    public static void m80676L7(PaylistAAUI paylistAAUI, String str) {
        paylistAAUI.hideLoading();
        if (!Util.isNullOrNil(str)) {
            C76701a.makeText((Context) paylistAAUI, (CharSequence) str, 1).show();
        } else {
            C76701a.makeText((Context) paylistAAUI, (int) C0966R.string.f7286bk, 1).show();
        }
    }

    /* renamed from: M7 */
    public static void m80677M7(PaylistAAUI paylistAAUI) {
        paylistAAUI.showCircleStWcKb();
        PaylistAAUI paylistAAUI2 = paylistAAUI;
        C45890a.m51175a(paylistAAUI2, paylistAAUI.getString(C0966R.string.f7314ch), paylistAAUI.f196264z, paylistAAUI.getString(C0966R.string.hzs), true, 20, new C68315o1(paylistAAUI), new C68320p1(paylistAAUI));
    }

    /* renamed from: N7 */
    public final void mo93852N7() {
        this.f196251j = C75197d0.m90163d(this, false, false, (DialogInterface.OnCancelListener) null);
        View view = this.f196250i;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/aa/ui/PaylistAAUI", "fetchAADetailAndInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/aa/ui/PaylistAAUI", "fetchAADetailAndInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C67236j.C67240d dVar = this.f196248g.f193066b;
        dVar.getClass();
        ((C88633e) C88643g.m110546d()).mo123061d(dVar).mo123062e(new C68266h()).mo123065b(new C68264g());
    }

    /* renamed from: O7 */
    public final boolean mo93853O7(int i, int i2, int i3, int i4, List<C64820x> list) {
        return (Util.isNullOrNil(this.f196239H) || C72996z1.m85807K5(this.f196239H) || C72996z1.m85844o5(this.f196239H) || i4 != 4 || list.size() != 1) && i == 2 && i2 != 6 && i3 == 1;
    }

    /* renamed from: P7 */
    public void mo93854P7(int i, Intent intent) {
        if (i == -1) {
            Log.m105925i("MicroMsg.Aa.PaylistAAUI", "pay success, payMsgId: %s", this.f196238G);
            RealnameGuideHelper realnameGuideHelper = (RealnameGuideHelper) intent.getParcelableExtra("key_realname_guide_helper");
            if (realnameGuideHelper != null) {
                Log.m105924i("MicroMsg.Aa.PaylistAAUI", "do realname guide");
                Intent intent2 = new Intent();
                intent2.putExtra("key_realname_guide_helper", realnameGuideHelper);
                C88144b.m109791i(this, "wallet_core", ".id_verify.RealnameDialogActivity", intent2, (Bundle) null);
            }
            C79104i.m95657b(this.f196239H);
            finish();
            C67236j.C28311e eVar = this.f196248g.f193068d;
            String str = this.f196238G;
            String str2 = this.f196240I;
            String str3 = this.f196244M;
            eVar.getClass();
            ((C88633e) C88643g.m110549g(str, str2, str3)).mo123061d(eVar).mo123062e(new C68261d(this));
            C115669n.INSTANCE.idkeyStat(407, 12, 1, false);
            String stringExtra = intent.getStringExtra("key_trans_id");
            C67236j.C67239c cVar = this.f196248g.f193069e;
            long j = this.f196246P;
            String str4 = this.f196245N;
            cVar.getClass();
            ((C88633e) C88643g.m110549g(Long.valueOf(j), str4, stringExtra)).mo123061d(cVar);
        }
    }

    /* renamed from: Q7 */
    public final void mo93855Q7(List<C64820x> list, String str, boolean z) {
        String str2;
        String str3;
        ((TextView) findViewById(C0966R.C0970id.hth)).setText(str);
        boolean z2 = false;
        this.f196235D.setVisibility(z ? 0 : 8);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.hti);
        linearLayout.removeAllViews();
        int i = 0;
        while (i < list.size()) {
            C64820x xVar = list.get(i);
            boolean z3 = i >= list.size() - 1;
            LinearLayout linearLayout2 = (LinearLayout) getLayoutInflater().inflate(C0966R.C0971layout.bm_, linearLayout, z2);
            TextView textView = (TextView) linearLayout2.findViewById(C0966R.C0970id.ht_);
            TextView textView2 = (TextView) linearLayout2.findViewById(C0966R.C0970id.hta);
            TextView textView3 = (TextView) linearLayout2.findViewById(C0966R.C0970id.ht8);
            LinearLayout linearLayout3 = (LinearLayout) linearLayout2.findViewById(C0966R.C0970id.ht9);
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z((ImageView) linearLayout2.findViewById(C0966R.C0970id.ht7), xVar.f186245d);
            C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
            AppCompatActivity context = getContext();
            C67235i iVar = this.f196249h;
            String str4 = xVar.f186245d;
            iVar.getClass();
            textView.setText(hVar.yp0(context, Util.isNullOrNil(str4) ? "" : ((C75339i) C86312j.m106911c(C75339i.class)).mo62519pb(str4, iVar.f286525o.mo106600b("chatroom")), textView.getTextSize()));
            int i2 = xVar.f186248g;
            if (i2 == 7) {
                String string = getString(C0966R.string.f7325ct, new Object[]{Double.valueOf(C79104i.m95673r((double) xVar.f186246e))});
                String str5 = getString(C0966R.string.hhh) + string;
                SpannableString spannableString = new SpannableString(str5);
                WcPayTextApppearanceSpan wcPayTextApppearanceSpan = new WcPayTextApppearanceSpan((String) null, 0, (int) textView2.getTextSize(), ColorStateList.valueOf(getResources().getColor(C0966R.color.a84)), (ColorStateList) null);
                wcPayTextApppearanceSpan.f210885d = C75228t.m90274w(getContext(), 7);
                spannableString.setSpan(wcPayTextApppearanceSpan, str5.lastIndexOf(string), str5.lastIndexOf(string) + string.length(), 17);
                textView2.setText(spannableString);
                textView2.setTextColor(getResources().getColor(C0966R.color.a84));
                textView2.setVisibility(0);
                String a = C79104i.m95656a(xVar.f186249h, xVar.f186250i);
                if (!Util.isNullOrNil(a)) {
                    textView3.setText(a);
                    textView3.setVisibility(0);
                    linearLayout3.setGravity(48);
                } else {
                    linearLayout3.setGravity(16);
                    textView3.setVisibility(8);
                }
                if (!Util.isNullOrNil(xVar.f186250i)) {
                    textView3.setText(C79104i.m95665j(60, textView3.getText().toString()));
                }
                linearLayout.addView(linearLayout2);
            } else if (i2 == 1) {
                long j = xVar.f186246e;
                if (j > 0) {
                    str2 = getString(C0966R.string.f7325ct, new Object[]{Double.valueOf(C79104i.m95673r((double) j))});
                    str3 = getString(C0966R.string.hgz) + str2;
                } else {
                    str3 = getString(C0966R.string.hgz);
                    str2 = "";
                }
                SpannableString spannableString2 = new SpannableString(str3);
                WcPayTextApppearanceSpan wcPayTextApppearanceSpan2 = new WcPayTextApppearanceSpan((String) null, 0, (int) textView2.getTextSize(), ColorStateList.valueOf(getResources().getColor(C0966R.color.a86)), (ColorStateList) null);
                wcPayTextApppearanceSpan2.f210885d = C75228t.m90274w(getContext(), 7);
                spannableString2.setSpan(wcPayTextApppearanceSpan2, str3.lastIndexOf(str2), str3.lastIndexOf(str2) + str2.length(), 17);
                textView2.setText(spannableString2);
                textView2.setTextColor(getResources().getColor(C0966R.color.a86));
                textView2.setVisibility(0);
                if (!Util.isNullOrNil(xVar.f186250i)) {
                    textView3.setText(C79104i.m95665j(60, xVar.f186250i));
                    textView3.setVisibility(0);
                    linearLayout3.setGravity(48);
                } else {
                    linearLayout3.setGravity(16);
                    textView3.setVisibility(8);
                }
                linearLayout.addView(linearLayout2);
            } else {
                textView2.setVisibility(8);
                if (!Util.isNullOrNil(xVar.f186250i)) {
                    textView3.setText(C79104i.m95665j(60, xVar.f186250i));
                    textView3.setVisibility(0);
                    linearLayout3.setGravity(48);
                } else {
                    linearLayout3.setGravity(16);
                    textView3.setVisibility(8);
                }
                linearLayout.addView(linearLayout2);
            }
            View findViewById = linearLayout2.findViewById(C0966R.C0970id.c7p);
            if (z3) {
                findViewById.setBackgroundColor(getContext().getResources().getColor(C0966R.color.f2927a));
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.height = 0;
                findViewById.setLayoutParams(layoutParams);
            } else {
                findViewById.setBackgroundColor(getContext().getResources().getColor(C0966R.color.abr));
            }
            textView3.setContentDescription(getString(C0966R.string.g4f) + "，" + textView3.getText().toString());
            i++;
            z2 = false;
        }
    }

    /* renamed from: R7 */
    public final void mo93856R7(TextView textView, SpannableString spannableString, String str, C78021z zVar) {
        int i;
        int i2;
        TextView textView2 = textView;
        SpannableString spannableString2 = spannableString;
        C78021z zVar2 = zVar;
        Drawable drawable = getResources().getDrawable(C0966R.raw.icons_outlined_album);
        drawable.setColorFilter(getResources().getColor(C0966R.color.f2958ae), PorterDuff.Mode.SRC_ATOP);
        drawable.setBounds(0, 0, C74942w4.m89784a(getContext(), 20), C74942w4.m89784a(getContext(), 20));
        C76003c cVar = new C76003c(drawable, 1);
        C7092q qVar = new C7092q((C7092q.C7093a) new C68267i(zVar2, textView2), true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableString2);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
        if (!Util.isNullOrNil(zVar2.f228653E)) {
            spannableStringBuilder.setSpan(cVar, 0, 1, 17);
            spannableStringBuilder.setSpan(qVar, 0, spannableStringBuilder2.length(), 18);
        }
        TextPaint paint = textView.getPaint();
        int measuredWidth = textView.getMeasuredWidth();
        StaticLayout staticLayout = r9;
        CharSequence charSequence = " ...  ";
        TextPaint textPaint = paint;
        float measureText = ((float) measuredWidth) - (paint.measureText(" ...  ") + ((float) C74942w4.m89784a(getContext(), 19)));
        SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder2;
        StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder, paint, measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        int lineCount = staticLayout.getLineCount();
        Log.m105919d("MicroMsg.Aa.PaylistAAUI", "lineCount ： %s", Integer.valueOf(lineCount));
        if (lineCount <= 0) {
            Log.m105924i("MicroMsg.Aa.PaylistAAUI", "lineCount <= 0");
        } else if (lineCount <= 2) {
            textView2.setText(spannableStringBuilder);
        } else {
            StaticLayout staticLayout3 = staticLayout;
            int lineEnd = staticLayout3.getLineEnd(0);
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableString2.subSequence(0, lineEnd + new StaticLayout(spannableString2.subSequence(lineEnd, spannableString.length()), textPaint, (int) measureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getLineEnd(0)));
            spannableStringBuilder4.append(charSequence);
            if (!Util.isNullOrNil(zVar2.f228653E)) {
                i2 = 17;
                spannableStringBuilder4.setSpan(cVar, 0, 1, 17);
                i = 18;
                spannableStringBuilder4.setSpan(qVar, 0, spannableStringBuilder3.length(), 18);
            } else {
                i2 = 17;
                i = 18;
            }
            Drawable drawable2 = getResources().getDrawable(C0966R.raw.aa_paylist_unfold);
            drawable2.setColorFilter(getResources().getColor(C0966R.color.FG_2), PorterDuff.Mode.SRC_ATOP);
            drawable2.setBounds(0, 0, C74942w4.m89784a(getContext(), 19), C74942w4.m89784a(getContext(), 19));
            spannableStringBuilder4.setSpan(new C76003c(drawable2, 1), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(spannableString2);
            spannableStringBuilder5.append(" ");
            if (!Util.isNullOrNil(zVar2.f228653E)) {
                spannableStringBuilder5.setSpan(cVar, 0, 1, i2);
                spannableStringBuilder5.setSpan(qVar, 0, spannableStringBuilder3.length(), i);
            }
            Drawable drawable3 = getResources().getDrawable(C0966R.raw.aa_paylist_collapse);
            drawable3.setColorFilter(getResources().getColor(C0966R.color.FG_2), PorterDuff.Mode.SRC_ATOP);
            drawable3.setBounds(0, 0, C74942w4.m89784a(getContext(), 19), C74942w4.m89784a(getContext(), 19));
            spannableStringBuilder5.setSpan(new C76003c(drawable3, 1), spannableStringBuilder5.length() - 1, spannableStringBuilder5.length(), 33);
            if (staticLayout3.getLineCount() > 2) {
                textView2.setText(spannableStringBuilder4);
                textView2.setOnClickListener(new C68256a(this, textView2, spannableStringBuilder4, spannableStringBuilder5));
                textView2.setSelected(true);
                return;
            }
            textView.setText(spannableString);
            textView2.setOnClickListener((View.OnClickListener) null);
        }
    }

    /* renamed from: S7 */
    public final void mo93857S7() {
        if (Util.isNullOrNil(this.f196264z)) {
            getString(C0966R.string.hh5);
            String string = !Util.isNullOrNil(this.f196232A) ? getString(C0966R.string.mxl) : getString(C0966R.string.hh5);
            C75228t.m90253j0(this.f196261w, string, 0, string.length(), new C7092q((C7092q.C7093a) new C68262e(), true), getContext());
            this.f196261w.setVisibility(0);
            C85875k4.m106193l0(this.f196261w.getPaint());
            this.f196262x.setVisibility(8);
        } else {
            String string2 = getString(C0966R.string.hh6);
            String string3 = getString(C0966R.string.bgb, new Object[]{this.f196264z, string2});
            SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this, string3);
            C75228t.m90253j0(this.f196262x, string3, T1.length() - string2.length(), T1.length(), new C7092q((C7092q.C7093a) new C68263f(), true), getContext());
            this.f196261w.setVisibility(8);
            this.f196262x.setVisibility(0);
            C85875k4.m106193l0(this.f196262x.getPaint());
        }
        int b = C76577a.m92151b(getContext(), 6);
        int b2 = C76577a.m92151b(getContext(), 0);
        if (!Util.isNullOrNil(this.f196232A)) {
            this.f196261w.setPadding(b, b2, b, b);
            this.f196262x.setPadding(b, b2, b, b);
            return;
        }
        this.f196261w.setPadding(b, b, b, b);
        this.f196262x.setPadding(b, b, b, b);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bma;
    }

    public void hideLoading() {
        Dialog dialog = this.f196251j;
        if (dialog != null && dialog.isShowing()) {
            this.f196251j.dismiss();
            this.f196251j = null;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 233) {
            mo93854P7(i2, intent);
        } else if (i == 222) {
            if (i2 == -1) {
                String stringExtra = intent.getStringExtra("Select_Conv_User");
                Log.m105925i("MicroMsg.Aa.PaylistAAUI", "select chatroom：%s", stringExtra);
                if (!Util.isNullOrNil(stringExtra)) {
                    Intent intent2 = new Intent(getContext(), LaunchAAUI.class);
                    intent2.putExtra("enter_scene", 3);
                    intent2.putExtra("chatroom_name", stringExtra);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent2);
                    C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/aa/ui/PaylistAAUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/plugin/aa/ui/PaylistAAUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        } else if (i == 234 && i2 == -1) {
            Log.m105924i("MicroMsg.Aa.PaylistAAUI", "PAY_AA_TYPE_BY_PERSON_CUSTOMIZE_CODE resultCode == RESULT_OK");
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new C68257b());
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        this.f196239H = getIntent().getStringExtra("chatroom");
        this.f196253o = (LinearLayout) findViewById(C0966R.C0970id.htc);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.f358914ht2);
        this.f196254p = linearLayout;
        this.f196263y = (TextView) linearLayout.findViewById(C0966R.C0970id.nol);
        this.f196255q = (LinearLayout) findViewById(C0966R.C0970id.hsr);
        this.f196256r = (LinearLayout) findViewById(C0966R.C0970id.hte);
        this.f196258t = (RelativeLayout) findViewById(C0966R.C0970id.hsw);
        this.f196233B = (TextView) findViewById(C0966R.C0970id.htd);
        WcPayBannerView wcPayBannerView = (WcPayBannerView) findViewById(C0966R.C0970id.lkt);
        this.f196237F = wcPayBannerView;
        wcPayBannerView.mo105020a();
        C85875k4.m106189j0(this.f196233B.getPaint(), 0.8f);
        this.f196234C = (TextView) findViewById(C0966R.C0970id.hsv);
        this.f196250i = findViewById(C0966R.C0970id.iwf);
        TextView textView = (TextView) findViewById(C0966R.C0970id.htf);
        this.f196235D = textView;
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        this.f196235D.setClickable(true);
        this.f196235D.setOnTouchListener(new C75355a0(this));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(C0966R.string.hho));
        spannableStringBuilder.setSpan(new C7092q((C7092q.C7093a) new C68258c(), true), 0, spannableStringBuilder.length(), 18);
        this.f196235D.setText(spannableStringBuilder);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.hsu);
        this.f196236E = textView2;
        C85875k4.m106189j0(textView2.getPaint(), 0.8f);
        mo93852N7();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean shouldEnsureSoterConnection() {
        return true;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C79090a.class);
    }
}
