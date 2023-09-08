package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import er1.C58739j4;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import kotlin.Metadata;
import o40.C61926c;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import rs1.C13273i6;
import rx3.C13598b0;
import up1.C27696y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$initData$5", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderLiveIncomeListUIC$initData$5 */
public final class FinderLiveIncomeListUIC$initData$5 implements C9500j {
    public final /* synthetic */ C13273i6 this$0;

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderLiveIncomeListUIC$initData$5$a */
    public static final class C4314a extends C60896i<C13273i6.C13274a> {

        /* renamed from: e */
        public final /* synthetic */ C13273i6 f18763e;

        public C4314a(C13273i6 i6Var) {
            this.f18763e = i6Var;
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.ah6;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            C13598b0 b0Var;
            C13273i6 i6Var;
            char c;
            BigDecimal bigDecimal;
            String str;
            C60905o oVar2 = oVar;
            C13273i6.C13274a aVar = (C13273i6.C13274a) cVar;
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            C87412m.m108594g(oVar2, "holder");
            C87412m.m108594g(aVar, "item");
            Long l = aVar.f37681e;
            boolean z2 = true;
            if (l != null) {
                C13273i6 i6Var2 = this.f18763e;
                long longValue = l.longValue();
                TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.gyh);
                C58739j4 j4Var = C58739j4.f168176a;
                C87412m.m108593f(textView, LocaleUtil.ITALIAN);
                j4Var.mo83703c0(textView, false);
                Activity context = i6Var2.getContext();
                String format = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(((double) longValue) / 100.0d)}, 1));
                C87412m.m108593f(format, "format(format, *args)");
                textView.setText(context.getString(C0966R.string.dp5, new Object[]{format}));
                View D = oVar2.mo85812D(C0966R.C0970id.i7m);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view = D;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$initData$5$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$FinderLiveIncomePageItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$initData$5$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$FinderLiveIncomePageItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View D2 = oVar2.mo85812D(C0966R.C0970id.nbs);
            Long l2 = aVar.f37685i;
            C13598b0 b0Var2 = null;
            if (l2 != null) {
                C13273i6 i6Var3 = this.f18763e;
                long longValue2 = l2.longValue();
                if (longValue2 > 0) {
                    if (D2 == null) {
                        i6Var = i6Var3;
                    } else {
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar3.mo10233c(0);
                        View view2 = D2;
                        i6Var = i6Var3;
                        C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$initData$5$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$FinderLiveIncomePageItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        D2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$initData$5$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$FinderLiveIncomePageItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    C58739j4 j4Var2 = C58739j4.f168176a;
                    String p = C61926c.m72691p(longValue2);
                    RoundingMode roundingMode = RoundingMode.HALF_UP;
                    j4Var2.getClass();
                    try {
                        if (Util.getDouble(p, 0.0d) == 0.0d) {
                            str = "0";
                        } else {
                            int length = p.length() - 1;
                            boolean z3 = false;
                            int i3 = 0;
                            while (true) {
                                if (i3 > length) {
                                    break;
                                }
                                boolean z4 = C87412m.m108596i(p.charAt(!z3 ? i3 : length), 32) <= 0;
                                if (!z3) {
                                    if (!z4) {
                                        z3 = true;
                                    } else {
                                        i3++;
                                    }
                                } else if (!z4) {
                                    break;
                                } else {
                                    length--;
                                }
                            }
                            str = p.subSequence(i3, length + 1).toString();
                        }
                        BigDecimal bigDecimal2 = new BigDecimal(str);
                        boolean z5 = false;
                        int i4 = 0;
                        int i5 = 2;
                        while (true) {
                            if (i4 > i5) {
                                break;
                            }
                            boolean z6 = C87412m.m108596i("100".charAt(!z5 ? i4 : i5), 32) <= 0;
                            if (!z5) {
                                if (!z6) {
                                    z5 = true;
                                } else {
                                    i4++;
                                }
                            } else if (!z6) {
                                break;
                            } else {
                                i5--;
                            }
                        }
                        bigDecimal = bigDecimal2.divide(new BigDecimal("100".subSequence(i4, i5 + 1).toString()), 2, roundingMode);
                        c = 0;
                    } catch (Exception e) {
                        c = 0;
                        Log.printErrStackTrace(C58739j4.f168177b, e, "", new Object[0]);
                        bigDecimal = new BigDecimal(0);
                    }
                    Object[] objArr = new Object[1];
                    objArr[c] = bigDecimal != null ? Double.valueOf(bigDecimal.doubleValue()) : null;
                    String format2 = String.format("%.2f", Arrays.copyOf(objArr, 1));
                    C87412m.m108593f(format2, "format(format, *args)");
                    TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.nbt);
                    if (textView2 == null) {
                        z2 = true;
                    } else {
                        z2 = true;
                        textView2.setText(oVar2.f44854d.getContext().getResources().getString(C0966R.string.mo6, new Object[]{format2}));
                    }
                    if (D2 != null) {
                        D2.setOnClickListener(new C4331e(i6Var, aVar));
                        b0Var = C13598b0.f38549a;
                    }
                } else {
                    if (D2 != null) {
                        C9556a aVar4 = new C9556a();
                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                        aVar4.mo10233c(8);
                        View view3 = D2;
                        C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$initData$5$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$FinderLiveIncomePageItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        D2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$initData$5$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$FinderLiveIncomePageItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    b0Var = C13598b0.f38549a;
                }
                b0Var2 = b0Var;
            }
            if (b0Var2 == null && D2 != null) {
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar5.mo10233c(8);
                View view4 = D2;
                C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$initData$5$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$FinderLiveIncomePageItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$initData$5$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$FinderLiveIncomePageItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.f15);
            C39818r rVar = C39818r.f106831a;
            C60979d<C100810g0> f2 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2();
            C11984n0 n0Var = new C11984n0(aVar.f37680d.f130899h, C27696y.RAW_IMAGE);
            C87412m.m108593f(imageView, LocaleUtil.ITALIAN);
            f2.mo85957c(n0Var, imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.DEFAULT));
            ((TextView) oVar2.mo85812D(C0966R.C0970id.knx)).setText(aVar.f37680d.f130900i);
            TextView textView3 = (TextView) oVar2.mo85812D(C0966R.C0970id.k9m);
            textView3.setText(aVar.f37680d.f130902n);
            String str2 = aVar.f37680d.f130902n;
            if (!(str2 == null || str2.length() == 0)) {
                z2 = false;
            }
            if (z2) {
                textView3.setVisibility(8);
            } else {
                textView3.setVisibility(0);
            }
            ((TextView) oVar2.mo85812D(C0966R.C0970id.fmr)).setOnClickListener(new C4332f(aVar, this.f18763e));
            ((TextView) oVar2.mo85812D(C0966R.C0970id.itg)).setOnClickListener(new C4333g(this.f18763e, aVar));
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(oVar, "holder");
        }
    }

    public FinderLiveIncomeListUIC$initData$5(C13273i6 i6Var) {
        this.this$0 = i6Var;
    }

    public C60896i<?> getItemConvert(int i) {
        return new C4314a(this.this$0);
    }
}
