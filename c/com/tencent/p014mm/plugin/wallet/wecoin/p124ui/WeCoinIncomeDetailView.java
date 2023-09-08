package com.tencent.p014mm.plugin.wallet.wecoin.p124ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C39629l0;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.wallet.wecoin.model.WecoinEncashKVData;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WcPayMoneyLoadingView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.UUID;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import l31.C61212e;
import n53.C11124g;
import n53.C11126i;
import nj3.C76879j;
import o31.C11345b;
import o40.C61926c;
import p244tt.C14088e;
import p53.C11849p;
import p53.C11850q;
import p53.C11851r;
import p53.C11852s;
import p565ir.C60606n;
import q53.C12091l1;
import q53.C12095m1;
import q53.C12103o1;
import q53.C12106p1;
import q53.C12111q1;
import q53.C12115r1;
import q53.C12117s1;
import q53.C12121t1;
import q53.C12124u1;
import q53.C12128v1;
import q53.C12131w1;
import qo3.C89779i0;
import r53.C12951a;
import r53.C12957d;
import te3.C48943c22;
import te3.C50292lo2;
import te3.C50508n81;
import te3.h35;
import z04.C119027c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-wxpay_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView */
public class WeCoinIncomeDetailView extends MMActivity {

    /* renamed from: A */
    public static final /* synthetic */ int f21840A = 0;

    /* renamed from: d */
    public View f21841d;

    /* renamed from: e */
    public View f21842e;

    /* renamed from: f */
    public TextView f21843f;

    /* renamed from: g */
    public View f21844g;

    /* renamed from: h */
    public TextView f21845h;

    /* renamed from: i */
    public WcPayMoneyLoadingView f21846i;

    /* renamed from: j */
    public ProgressBar f21847j;

    /* renamed from: n */
    public LinearLayout f21848n;

    /* renamed from: o */
    public Button f21849o;

    /* renamed from: p */
    public Button f21850p;

    /* renamed from: q */
    public C11851r f21851q;

    /* renamed from: r */
    public TextView f21852r;

    /* renamed from: s */
    public C89779i0 f21853s;

    /* renamed from: t */
    public View f21854t;

    /* renamed from: u */
    public View f21855u;

    /* renamed from: v */
    public TextView f21856v;

    /* renamed from: w */
    public TextView f21857w;

    /* renamed from: x */
    public View f21858x;

    /* renamed from: y */
    public View f21859y;

    /* renamed from: z */
    public TextView f21860z;

    /* renamed from: com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView$a */
    public static final class C5765a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WeCoinIncomeDetailView f21861d;

        public C5765a(WeCoinIncomeDetailView weCoinIncomeDetailView) {
            this.f21861d = weCoinIncomeDetailView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WeCoinIncomeDetailView weCoinIncomeDetailView = this.f21861d;
            C11851r rVar = weCoinIncomeDetailView.f21851q;
            if (rVar != null) {
                rVar.mo11732e3(1);
                String string = weCoinIncomeDetailView.getString(C0966R.string.ljj);
                C87412m.m108593f(string, "getString(R.string.wecoi…cash_tips_dialog_content)");
                String string2 = weCoinIncomeDetailView.getString(C0966R.string.ljf);
                C87412m.m108593f(string2, "getString(R.string.wecoi…ft_button_common_wording)");
                C76879j.m92711E(weCoinIncomeDetailView.getContext(), string, "", string2, false, C12131w1.f35233d);
                C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("mViewModel");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView$b */
    public static final class C5766b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ WeCoinIncomeDetailView f21862d;

        public C5766b(WeCoinIncomeDetailView weCoinIncomeDetailView) {
            this.f21862d = weCoinIncomeDetailView;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            C11851r rVar = this.f21862d.f21851q;
            if (rVar != null) {
                rVar.mo11732e3(10);
                this.f21862d.finish();
                return true;
            }
            C87412m.m108603p("mViewModel");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b9  */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m5529H7(com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinIncomeDetailView r12) {
        /*
            p53.r r0 = r12.f21851q
            java.lang.String r1 = "mViewModel"
            r2 = 0
            if (r0 == 0) goto L_0x00c9
            androidx.lifecycle.z<te3.cn3> r0 = r0.f34660i
            java.lang.Object r0 = r0.getValue()
            te3.cn3 r0 = (te3.C49028cn3) r0
            p53.r r3 = r12.f21851q
            if (r3 == 0) goto L_0x00c5
            androidx.lifecycle.z<java.lang.Long> r3 = r3.f34658g
            java.lang.Object r3 = r3.getValue()
            java.lang.Long r3 = (java.lang.Long) r3
            r4 = 0
            if (r3 != 0) goto L_0x0023
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
        L_0x0023:
            long r6 = r3.longValue()
            r3 = 8
            r8 = 0
            java.lang.String r9 = "mCloseBtn"
            java.lang.String r10 = "mFetchBtn"
            int r11 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r11 != 0) goto L_0x0065
            p53.r r4 = r12.f21851q
            if (r4 == 0) goto L_0x0061
            boolean r1 = r4.f34668t
            if (r1 == 0) goto L_0x0065
            android.widget.Button r1 = r12.f21850p
            if (r1 == 0) goto L_0x005d
            r1.setVisibility(r8)
            android.widget.Button r1 = r12.f21849o
            if (r1 == 0) goto L_0x0059
            r1.setVisibility(r3)
            android.widget.Button r1 = r12.f21850p
            if (r1 == 0) goto L_0x0055
            q53.x1 r3 = new q53.x1
            r3.<init>(r12)
            r1.setOnClickListener(r3)
            goto L_0x0073
        L_0x0055:
            gy3.C87412m.m108603p(r9)
            throw r2
        L_0x0059:
            gy3.C87412m.m108603p(r10)
            throw r2
        L_0x005d:
            gy3.C87412m.m108603p(r9)
            throw r2
        L_0x0061:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x0065:
            android.widget.Button r1 = r12.f21850p
            if (r1 == 0) goto L_0x00c1
            r1.setVisibility(r3)
            android.widget.Button r1 = r12.f21849o
            if (r1 == 0) goto L_0x00bd
            r1.setVisibility(r8)
        L_0x0073:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "updateClickButtonEvent, AuthInfo: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = ", balance: "
            r1.append(r3)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "MicroMsg.WeCoinIncomeDetailView"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r1)
            android.widget.Button r1 = r12.f21849o
            if (r1 == 0) goto L_0x00b9
            r1.setEnabled(r8)
            if (r11 > 0) goto L_0x009c
            goto L_0x00b0
        L_0x009c:
            android.widget.Button r1 = r12.f21849o
            if (r1 == 0) goto L_0x00b5
            r3 = 1
            r1.setEnabled(r3)
            android.widget.Button r1 = r12.f21849o
            if (r1 == 0) goto L_0x00b1
            q53.y1 r2 = new q53.y1
            r2.<init>(r12, r0)
            r1.setOnClickListener(r2)
        L_0x00b0:
            return
        L_0x00b1:
            gy3.C87412m.m108603p(r10)
            throw r2
        L_0x00b5:
            gy3.C87412m.m108603p(r10)
            throw r2
        L_0x00b9:
            gy3.C87412m.m108603p(r10)
            throw r2
        L_0x00bd:
            gy3.C87412m.m108603p(r10)
            throw r2
        L_0x00c1:
            gy3.C87412m.m108603p(r9)
            throw r2
        L_0x00c5:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x00c9:
            gy3.C87412m.m108603p(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinIncomeDetailView.m5529H7(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView):void");
    }

    /* renamed from: I7 */
    public final void mo6819I7() {
        h35 h35;
        StringBuilder sb = new StringBuilder();
        sb.append("click encash, jumpInfo:");
        C11851r rVar = this.f21851q;
        String str = null;
        if (rVar != null) {
            sb.append(rVar.mo11730c3());
            Log.m105924i("MicroMsg.WeCoinIncomeDetailView", sb.toString());
            C11851r rVar2 = this.f21851q;
            if (rVar2 == null) {
                C87412m.m108603p("mViewModel");
                throw null;
            } else if (rVar2.f34666r == null) {
                Log.m105918d("MicroMsg.WeCoinIncomeDetailView", "gotoIncomeBalanceView: ");
                Intent intent = new Intent(getContext(), WeCoinEncashView.class);
                C11851r rVar3 = this.f21851q;
                if (rVar3 != null) {
                    Long value = rVar3.f34658g.getValue();
                    if (value != null) {
                        intent.putExtra("wecoin_income_balance", value.longValue());
                    }
                    C11851r rVar4 = this.f21851q;
                    if (rVar4 != null) {
                        intent.putExtra("wecoin_enter_encash_business_kv_data", rVar4.f34667s);
                        C11851r rVar5 = this.f21851q;
                        if (rVar5 != null) {
                            intent.putExtra("WECOIN_BUSINESS_ID", rVar5.f34655d);
                            C11851r rVar6 = this.f21851q;
                            if (rVar6 != null) {
                                C48943c22 c222 = rVar6.f34665q;
                                if (!(c222 == null || (h35 = c222.f131463n) == null)) {
                                    intent.putExtra("WECOIN_TAX_CUT_ENTRANCE_INFO", h35.toByteArray());
                                }
                                C9556a aVar = new C9556a();
                                aVar.mo10233c(intent);
                                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "gotoIncomeBalanceView", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                startActivity((Intent) aVar.mo10231a(0));
                                C117292a.m165359e(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "gotoIncomeBalanceView", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                return;
                            }
                            C87412m.m108603p("mViewModel");
                            throw null;
                        }
                        C87412m.m108603p("mViewModel");
                        throw null;
                    }
                    C87412m.m108603p("mViewModel");
                    throw null;
                }
                C87412m.m108603p("mViewModel");
                throw null;
            } else if (rVar2 != null) {
                Log.m105924i("MicroMsg.WeCoinIncomeDetailViewModel", "jumpEncashInterceptor");
                Bundle bundle = new Bundle();
                C50292lo2 lo22 = rVar2.f34666r;
                String str2 = lo22 != null ? lo22.f137549d : null;
                String str3 = "";
                if (str2 == null) {
                    str2 = str3;
                }
                bundle.putString("appId", str2);
                C50292lo2 lo23 = rVar2.f34666r;
                String str4 = lo23 != null ? lo23.f137551f : null;
                if (str4 == null) {
                    str4 = str3;
                }
                bundle.putString("path", str4);
                C50292lo2 lo24 = rVar2.f34666r;
                if (lo24 != null) {
                    str = lo24.f137550e;
                }
                if (str != null) {
                    str3 = str;
                }
                bundle.putString(SearchIntents.EXTRA_QUERY, str3);
                bundle.putBoolean("transparent", true);
                ((C14088e) C86312j.m106911c(C14088e.class)).mo13510OP(this, bundle, true, true, (C14088e.C14090b) null);
            } else {
                C87412m.m108603p("mViewModel");
                throw null;
            }
        } else {
            C87412m.m108603p("mViewModel");
            throw null;
        }
    }

    /* renamed from: J7 */
    public final void mo6820J7(Long l) {
        if (l != null) {
            long longValue = l.longValue();
            if (longValue == 0) {
                C11851r rVar = this.f21851q;
                if (rVar == null) {
                    C87412m.m108603p("mViewModel");
                    throw null;
                } else if (rVar.f34668t) {
                    View view = this.f21841d;
                    if (view != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view3 = this.f21842e;
                        if (view3 != null) {
                            C9556a aVar2 = new C9556a();
                            aVar2.mo10233c(8);
                            View view4 = view3;
                            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view4, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            TextView textView = this.f21843f;
                            if (textView != null) {
                                textView.setVisibility(8);
                                View view5 = this.f21844g;
                                if (view5 != null) {
                                    C9556a aVar3 = new C9556a();
                                    aVar3.mo10233c(0);
                                    View view6 = view5;
                                    C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                    C117292a.m165359e(view6, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    TextView textView2 = this.f21845h;
                                    if (textView2 != null) {
                                        textView2.setVisibility(0);
                                        TextView textView3 = this.f21845h;
                                        if (textView3 != null) {
                                            C11851r rVar2 = this.f21851q;
                                            if (rVar2 != null) {
                                                textView3.setText(rVar2.f34669u);
                                                return;
                                            } else {
                                                C87412m.m108603p("mViewModel");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("cocertActivateModeTips");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("cocertActivateModeTips");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("cocertActivateModeLayout");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("normalModeTips");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("normalModeContentLayout");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("normalModeTitleLayout");
                        throw null;
                    }
                }
            }
            View view7 = this.f21841d;
            if (view7 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar4.mo10233c(0);
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view9 = this.f21842e;
                if (view9 != null) {
                    C9556a aVar5 = new C9556a();
                    aVar5.mo10233c(0);
                    View view10 = view9;
                    C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view10, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    TextView textView4 = this.f21843f;
                    if (textView4 != null) {
                        textView4.setVisibility(0);
                        View view11 = this.f21844g;
                        if (view11 != null) {
                            C9556a aVar6 = new C9556a();
                            aVar6.mo10233c(8);
                            View view12 = view11;
                            C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                            C117292a.m165359e(view12, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            TextView textView5 = this.f21845h;
                            if (textView5 != null) {
                                textView5.setVisibility(8);
                                C11851r rVar3 = this.f21851q;
                                if (rVar3 != null) {
                                    String str = rVar3.f34669u;
                                    if (!(str.length() > 0)) {
                                        str = null;
                                    }
                                    if (str != null) {
                                        TextView textView6 = this.f21843f;
                                        if (textView6 != null) {
                                            textView6.setText(getString(C0966R.string.klj, new Object[]{str}));
                                        } else {
                                            C87412m.m108603p("normalModeTips");
                                            throw null;
                                        }
                                    }
                                    String n = C75228t.m90260n(C75228t.m90248h("" + longValue, "100", 2, RoundingMode.HALF_UP).doubleValue());
                                    WcPayMoneyLoadingView wcPayMoneyLoadingView = this.f21846i;
                                    if (wcPayMoneyLoadingView != null) {
                                        wcPayMoneyLoadingView.mo99856e(n, false, false);
                                    } else {
                                        C87412m.m108603p("mBalanceView");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("mViewModel");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("cocertActivateModeTips");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("cocertActivateModeLayout");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("normalModeTips");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("normalModeContentLayout");
                    throw null;
                }
            } else {
                C87412m.m108603p("normalModeTitleLayout");
                throw null;
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6334c0;
    }

    public void initView() {
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        setMMTitle("");
        View findViewById = findViewById(C0966R.C0970id.hhj);
        C87412m.m108593f(findViewById, "findViewById(R.id.normal_mode_title_layout)");
        this.f21841d = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.hhg);
        C87412m.m108593f(findViewById2, "findViewById(R.id.normal_mode_content_layout)");
        this.f21842e = findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.hhi);
        C87412m.m108593f(findViewById3, "findViewById(R.id.normal_mode_tips)");
        this.f21843f = (TextView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.bf_);
        C87412m.m108593f(findViewById4, "findViewById(R.id.cocert…vate_mode_content_layout)");
        this.f21844g = findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.bfa);
        C87412m.m108593f(findViewById5, "findViewById(R.id.cocert_activate_tips)");
        this.f21845h = (TextView) findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.ler);
        C87412m.m108593f(findViewById6, "findViewById(R.id.wallet_balance_view)");
        this.f21846i = (WcPayMoneyLoadingView) findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.lhb);
        C87412m.m108593f(findViewById7, "findViewById(R.id.wallet_money_load_pb)");
        this.f21847j = (ProgressBar) findViewById7;
        View findViewById8 = findViewById(C0966R.C0970id.loc);
        C87412m.m108593f(findViewById8, "findViewById(R.id.wecoin_income_banner_ll)");
        this.f21848n = (LinearLayout) findViewById8;
        TextView textView = (TextView) findViewById(C0966R.C0970id.a4y);
        this.f21854t = findViewById(C0966R.C0970id.a4x);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.a4w);
        this.f21855u = findViewById(C0966R.C0970id.leo);
        this.f21857w = (TextView) findViewById(C0966R.C0970id.fyg);
        this.f21856v = (TextView) findViewById(C0966R.C0970id.leq);
        this.f21858x = findViewById(C0966R.C0970id.f5409ec);
        WcPayMoneyLoadingView wcPayMoneyLoadingView = this.f21846i;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (wcPayMoneyLoadingView != null) {
            ProgressBar progressBar = this.f21847j;
            if (progressBar != null) {
                wcPayMoneyLoadingView.setLoadingPb(progressBar);
                WcPayMoneyLoadingView wcPayMoneyLoadingView2 = this.f21846i;
                if (wcPayMoneyLoadingView2 != null) {
                    wcPayMoneyLoadingView2.setPrefixSymbol(getString(C0966R.string.l7o));
                    C39623j lifecycle = getLifecycle();
                    WcPayMoneyLoadingView wcPayMoneyLoadingView3 = this.f21846i;
                    if (wcPayMoneyLoadingView3 != null) {
                        lifecycle.addObserver(wcPayMoneyLoadingView3);
                        View findViewById9 = findViewById(C0966R.C0970id.len);
                        C87412m.m108593f(findViewById9, "findViewById(R.id.wallet…alance_manager_fetch_btn)");
                        this.f21849o = (Button) findViewById9;
                        View findViewById10 = findViewById(C0966R.C0970id.lem);
                        C87412m.m108593f(findViewById10, "findViewById(R.id.wallet…ert_activate_mode_finish)");
                        this.f21850p = (Button) findViewById10;
                        View findViewById11 = findViewById(C0966R.C0970id.lep);
                        C87412m.m108593f(findViewById11, "findViewById(R.id.wallet_balance_manager_qanda)");
                        this.f21852r = (TextView) findViewById11;
                        ((WeImageView) findViewById(C0966R.C0970id.lof)).setOnClickListener(new C5765a(this));
                        TextView textView2 = this.f21852r;
                        if (textView2 != null) {
                            C85875k4.m106189j0(textView2.getPaint(), 0.8f);
                            TextView textView3 = this.f21856v;
                            C85875k4.m106189j0(textView3 != null ? textView3.getPaint() : null, 0.8f);
                            this.f21859y = findViewById(C0966R.C0970id.nbs);
                            this.f21860z = (TextView) findViewById(C0966R.C0970id.nbt);
                            setBackBtn(new C5766b(this), C0966R.raw.actionbar_icon_dark_back);
                            mo6820J7(0L);
                            View view = this.f21854t;
                            if (view != null) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(8);
                                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "initLiveTaskEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "initLiveTaskEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            C60606n nVar = (C60606n) C86312j.m106911c(C60606n.class);
                            C50508n81 kj02 = nVar != null ? nVar.kj0() : null;
                            StringBuilder sb = new StringBuilder();
                            sb.append("settlementEnable:");
                            sb.append(kj02 != null ? Boolean.valueOf(kj02.f138477f) : null);
                            sb.append(", url:");
                            sb.append(kj02 != null ? kj02.f138476e : null);
                            sb.append(", tip:");
                            sb.append(kj02 != null ? kj02.f138475d : null);
                            Log.m105924i("MicroMsg.WeCoinIncomeDetailView", sb.toString());
                            boolean z = true;
                            if (kj02 == null || !kj02.f138477f) {
                                z = false;
                            }
                            if (z) {
                                View view2 = this.f21855u;
                                if (view2 != null) {
                                    C9556a aVar2 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                    aVar2.mo10233c(0);
                                    View view3 = view2;
                                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "initLiveSettlement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                    C117292a.m165359e(view3, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "initLiveSettlement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                TextView textView4 = this.f21856v;
                                if (textView4 != null) {
                                    textView4.setVisibility(0);
                                }
                                TextView textView5 = this.f21856v;
                                if (textView5 != null) {
                                    textView5.setOnClickListener(new C12128v1(kj02, this));
                                }
                                if (!Util.isNullOrNil(kj02.f138475d)) {
                                    View view4 = this.f21858x;
                                    ViewGroup.LayoutParams layoutParams = view4 != null ? view4.getLayoutParams() : null;
                                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                    }
                                    if (marginLayoutParams != null) {
                                        marginLayoutParams.bottomMargin = C74942w4.m89784a(getContext(), 48);
                                    }
                                    TextView textView6 = this.f21857w;
                                    if (textView6 != null) {
                                        textView6.setVisibility(0);
                                    }
                                    TextView textView7 = this.f21857w;
                                    if (textView7 != null) {
                                        textView7.setText(kj02.f138475d);
                                        return;
                                    }
                                    return;
                                }
                                View view5 = this.f21858x;
                                ViewGroup.LayoutParams layoutParams2 = view5 != null ? view5.getLayoutParams() : null;
                                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                                }
                                if (marginLayoutParams != null) {
                                    marginLayoutParams.bottomMargin = C74942w4.m89784a(getContext(), 64);
                                }
                                TextView textView8 = this.f21857w;
                                if (textView8 != null) {
                                    textView8.setVisibility(8);
                                }
                                TextView textView9 = this.f21857w;
                                if (textView9 != null) {
                                    textView9.setText("");
                                    return;
                                }
                                return;
                            }
                            View view6 = this.f21858x;
                            ViewGroup.LayoutParams layoutParams3 = view6 != null ? view6.getLayoutParams() : null;
                            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                            }
                            if (marginLayoutParams != null) {
                                marginLayoutParams.bottomMargin = C74942w4.m89784a(getContext(), 64);
                            }
                            View view7 = this.f21855u;
                            if (view7 != null) {
                                C9556a aVar3 = new C9556a();
                                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                                aVar3.mo10233c(8);
                                View view8 = view7;
                                C117292a.m165358d(view8, aVar3.mo10232b(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "initLiveSettlement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view7.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                C117292a.m165359e(view8, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "initLiveSettlement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            TextView textView10 = this.f21856v;
                            if (textView10 != null) {
                                textView10.setVisibility(8);
                            }
                            TextView textView11 = this.f21857w;
                            if (textView11 != null) {
                                textView11.setVisibility(8);
                                return;
                            }
                            return;
                        }
                        C87412m.m108603p("mFaqTv");
                        throw null;
                    }
                    C87412m.m108603p("mBalanceView");
                    throw null;
                }
                C87412m.m108603p("mBalanceView");
                throw null;
            }
            C87412m.m108603p("mMoneyLoadingPb");
            throw null;
        }
        C87412m.m108603p("mBalanceView");
        throw null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z = false;
        Log.m105919d("MicroMsg.WeCoinIncomeDetailView", "onActivityResult() requestCode:%d resultCode: %d", Integer.valueOf(i), Integer.valueOf(i2));
        super.onActivityResult(i, i2, intent);
        if (i == 2001) {
            if (i2 == -1) {
                String stringExtra = intent != null ? intent.getStringExtra("intent_auth_token") : null;
                if (stringExtra == null || stringExtra.length() == 0) {
                    z = true;
                }
                if (!z) {
                    C11851r rVar = this.f21851q;
                    if (rVar != null) {
                        C87412m.m108594g(stringExtra, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
                        C12951a.m12391a(rVar.f34664p, Boolean.TRUE);
                        String uuid = UUID.randomUUID().toString();
                        C87412m.m108593f(uuid, "uuid.toString()");
                        rVar.mo11731d3(uuid, 10, 1, 0, "");
                        new C11124g(stringExtra, uuid, 1).mo9225i().mo123062e(new C11850q(rVar, uuid)).mo11397F(this);
                        return;
                    }
                    C87412m.m108603p("mViewModel");
                    throw null;
                }
            }
            C11851r rVar2 = this.f21851q;
            if (rVar2 != null) {
                rVar2.mo11732e3(19);
            } else {
                C87412m.m108603p("mViewModel");
                throw null;
            }
        }
    }

    public void onBackPressed() {
        C11851r rVar = this.f21851q;
        if (rVar != null) {
            rVar.mo11732e3(10);
            super.onBackPressed();
            return;
        }
        C87412m.m108603p("mViewModel");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C39622i0 a = C39629l0.m42233a(this, new C11852s(getIntent().getIntExtra("WECOIN_BUSINESS_ID", 1))).mo75002a(C11851r.class);
        C87412m.m108593f(a, "of(this, factory).get(We…ailViewModel::class.java)");
        this.f21851q = (C11851r) a;
        initView();
        C11851r rVar = this.f21851q;
        C48943c22 c222 = null;
        if (rVar != null) {
            rVar.f34656e.observe(this, new C12091l1(this));
            C11851r rVar2 = this.f21851q;
            if (rVar2 != null) {
                rVar2.f34658g.observe(this, new C12095m1(this));
                C11851r rVar3 = this.f21851q;
                if (rVar3 != null) {
                    rVar3.f34659h.observe(this, new C12103o1(this));
                    C11851r rVar4 = this.f21851q;
                    if (rVar4 != null) {
                        rVar4.f34657f.observe(this, new C12106p1(this));
                        C11851r rVar5 = this.f21851q;
                        if (rVar5 != null) {
                            rVar5.f34660i.observe(this, new C12111q1(this));
                            C11851r rVar6 = this.f21851q;
                            if (rVar6 != null) {
                                rVar6.f34662n.observe(this, new C12115r1(this));
                                C11851r rVar7 = this.f21851q;
                                if (rVar7 != null) {
                                    rVar7.f34663o.observe(this, new C12117s1(this));
                                    C11851r rVar8 = this.f21851q;
                                    if (rVar8 != null) {
                                        rVar8.f34661j.observe(this, new C12121t1(this));
                                        C11851r rVar9 = this.f21851q;
                                        if (rVar9 != null) {
                                            rVar9.f34664p.observe(this, new C12124u1(this));
                                            C11851r rVar10 = this.f21851q;
                                            if (rVar10 != null) {
                                                WecoinEncashKVData wecoinEncashKVData = (WecoinEncashKVData) getIntent().getParcelableExtra("wecoin_enter_encash_business_kv_data");
                                                if (wecoinEncashKVData != null) {
                                                    int i = wecoinEncashKVData.f21837d;
                                                    String str = wecoinEncashKVData.f21838e;
                                                    String uuid = UUID.randomUUID().toString();
                                                    C87412m.m108593f(uuid, "uuid.toString()");
                                                    rVar10.f34667s = new WecoinEncashKVData(i, str, uuid);
                                                }
                                                C11851r rVar11 = this.f21851q;
                                                if (rVar11 != null) {
                                                    rVar11.f34668t = getIntent().getBooleanExtra("wecoin_enter_encash_business_kv_is_cocert_activate", false);
                                                    C11851r rVar12 = this.f21851q;
                                                    if (rVar12 != null) {
                                                        String stringExtra = getIntent().getStringExtra("wecoin_enter_encash_business_kv_tips");
                                                        if (stringExtra == null) {
                                                            stringExtra = "";
                                                        }
                                                        rVar12.f34669u = stringExtra;
                                                        C11851r rVar13 = this.f21851q;
                                                        if (rVar13 != null) {
                                                            Log.m105918d("MicroMsg.WeCoinUtils", "load WecoinIncomePageInfoResponse snapshot");
                                                            String str2 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WECOIN_INCOME_PAGE_INFO_RESPONSE_STRING_SYNC, "");
                                                            if (!(str2 == null || str2.length() == 0)) {
                                                                C48943c22 c223 = new C48943c22();
                                                                byte[] bytes = str2.getBytes(C119027c.f356489b);
                                                                C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                                                                try {
                                                                    c223.parseFrom(bytes);
                                                                    c222 = c223;
                                                                } catch (Exception e) {
                                                                    Log.printDebugStack("safeParser", "", e);
                                                                }
                                                            }
                                                            if (c222 != null) {
                                                                rVar13.f34656e.postValue(c222.f131457e);
                                                                rVar13.f34657f.postValue(c222.f131458f);
                                                                rVar13.f34658g.postValue(Long.valueOf(c222.f131456d));
                                                                rVar13.f34659h.postValue(Long.valueOf(c222.f131464o));
                                                                rVar13.f34660i.postValue(c222.f131460h);
                                                                rVar13.f34661j.postValue(c222.f131459g);
                                                                rVar13.f34665q = c222;
                                                            }
                                                            ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.WeCoinIncomeDetailView);
                                                            return;
                                                        }
                                                        C87412m.m108603p("mViewModel");
                                                        throw null;
                                                    }
                                                    C87412m.m108603p("mViewModel");
                                                    throw null;
                                                }
                                                C87412m.m108603p("mViewModel");
                                                throw null;
                                            }
                                            C87412m.m108603p("mViewModel");
                                            throw null;
                                        }
                                        C87412m.m108603p("mViewModel");
                                        throw null;
                                    }
                                    C87412m.m108603p("mViewModel");
                                    throw null;
                                }
                                C87412m.m108603p("mViewModel");
                                throw null;
                            }
                            C87412m.m108603p("mViewModel");
                            throw null;
                        }
                        C87412m.m108603p("mViewModel");
                        throw null;
                    }
                    C87412m.m108603p("mViewModel");
                    throw null;
                }
                C87412m.m108603p("mViewModel");
                throw null;
            }
            C87412m.m108603p("mViewModel");
            throw null;
        }
        C87412m.m108603p("mViewModel");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        C11851r rVar = this.f21851q;
        if (rVar != null) {
            C48943c22 c222 = rVar.f34665q;
            if (c222 != null) {
                Log.m105918d("MicroMsg.WeCoinUtils", "save WecoinIncomePageInfoResponse snapshot");
                C61926c.m72656A((String) null, new C12957d(c222));
                return;
            }
            return;
        }
        C87412m.m108603p("mViewModel");
        throw null;
    }

    public void onResume() {
        super.onResume();
        C11851r rVar = this.f21851q;
        if (rVar != null) {
            rVar.mo11731d3("", 9, 1, 0, "");
            new C11126i().mo9225i().mo123062e(new C11849p(rVar)).mo11397F(this);
            return;
        }
        C87412m.m108603p("mViewModel");
        throw null;
    }
}
