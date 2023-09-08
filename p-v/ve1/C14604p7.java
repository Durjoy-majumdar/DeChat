package ve1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0782u0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.view.UnchangeTextView;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import er1.C58739j4;
import er1.C58784w3;
import er1.C7878t0;
import er1.C7919x;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import ls3.C61397g;
import o40.C61926c;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sk1.C63947a;
import te3.C64273c21;
import te3.C64337e61;
import te3.C64338e71;
import tf0.C13887q1;
import up1.C27696y;
import zc1.C66785b;

/* renamed from: ve1.p7 */
public final class C14604p7 extends C60896i<C0782u0> {

    /* renamed from: e */
    public final String f40438e = "FinderProfileReplayLiveConvert";

    /* renamed from: f */
    public final C13601g f40439f = C36568h.m40985a(C14605a.f40440d);

    /* renamed from: ve1.p7$a */
    public static final class C14605a extends C87413o implements C32224a<Point> {

        /* renamed from: d */
        public static final C14605a f40440d = new C14605a();

        public C14605a() {
            super(0);
        }

        public Object invoke() {
            return C75044y4.m89990b(MMApplicationContext.getContext());
        }
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.ao_;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C0782u0 u0Var;
        long j;
        C13598b0 b0Var;
        int i3;
        C13598b0 b0Var2;
        String str;
        C64338e71 e712;
        C60905o oVar2 = oVar;
        int i4 = i;
        C0782u0 u0Var2 = (C0782u0) cVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(u0Var2, "item");
        View D = oVar2.mo85812D(C0966R.C0970id.ip7);
        String a = u0Var2.mo725a();
        if (D != null) {
            C39818r rVar = C39818r.f106831a;
            ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11870V().mo85957c(new C11984n0(a, C27696y.THUMB_IMAGE), (ImageView) D, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE));
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) oVar2.mo85812D(C0966R.C0970id.f357785br0);
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        int i5 = ((Point) ((C36570n) this.f40439f).getValue()).x;
        int i6 = ((Point) ((C36570n) this.f40439f).getValue()).y;
        if (i6 < i5) {
            Resources resources = MMApplicationContext.getContext().getResources();
            C87412m.m108591d(resources);
            i5 = i6 - ((int) resources.getDimension(C0966R.dimen.f3749d0));
        }
        int i7 = i5 / 2;
        int i8 = (int) (((float) i7) * 1.3333334f);
        if (i8 > 0) {
            Log.m105924i(this.f40438e, "onBindViewHolder " + i4 + " lpWidth:" + layoutParams.width + ", lpHeight:" + layoutParams.height + ", itemWidth:" + i7 + ", suggestionItemHeight:" + i8);
            layoutParams.height = i8;
            constraintLayout.setLayoutParams(layoutParams);
        } else {
            Log.m105924i(this.f40438e, "onBindViewHolder " + i4 + " width invalid:" + i7 + ", " + constraintLayout.getLayoutParams().width + ", " + constraintLayout.getLayoutParams().height);
        }
        C64273c21 c212 = u0Var2.f1833d.liveInfo;
        C64337e61 e612 = c212 != null ? c212.f182363I : null;
        long j2 = (c212 == null || (e712 = c212.f182388Z) == null) ? 0 : e712.f182929e;
        String str2 = this.f40438e;
        StringBuilder sb = new StringBuilder();
        sb.append("replay:");
        FinderObjectDesc finderObjectDesc = u0Var2.f1833d.objectDesc;
        String str3 = finderObjectDesc != null ? finderObjectDesc.description : null;
        String str4 = "";
        if (str3 == null) {
            str3 = str4;
        }
        sb.append(str3);
        sb.append("(feedId:");
        sb.append(C61926c.m72691p(u0Var2.f1833d.f164794id));
        sb.append(",liveId:");
        C64273c21 c213 = u0Var2.f1833d.liveInfo;
        sb.append(c213 != null ? Long.valueOf(c213.f182392d) : null);
        sb.append("),");
        C64273c21 c214 = u0Var2.f1833d.liveInfo;
        sb.append(c214 != null ? c214.f182366L : 0);
        sb.append(',');
        C64273c21 c215 = u0Var2.f1833d.liveInfo;
        sb.append(c215 != null ? C63947a.m75194h(C63947a.f181274a, c215, "FinderLiveReplayFeed", false, 2, (Object) null) : str4);
        sb.append(" ,watchUV:");
        sb.append(j2);
        sb.append(", purchaseInfo:");
        C63947a aVar = C63947a.f181274a;
        C64273c21 c216 = u0Var2.f1833d.liveInfo;
        sb.append(aVar.mo88725k(c216 != null ? c216.f182363I : null));
        Log.m105924i(str2, sb.toString());
        View D2 = oVar2.mo85812D(C0966R.C0970id.f359079ip3);
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view = D2;
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C64273c21 c217 = u0Var2.f1833d.liveInfo;
        if (c217 != null) {
            int i9 = c217.f182398j;
            TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.ip8);
            Context context = MMApplicationContext.getContext();
            C58784w3.f168295a.getClass();
            long j3 = ((long) i9) * ((long) 1000);
            Map<String, List<String>> map = C7878t0.f26492a;
            if (j3 >= 3600000) {
                long currentTimeMillis = System.currentTimeMillis();
                if (C7878t0.f26493b.containsKey(Long.valueOf(j3))) {
                    if (currentTimeMillis - C7878t0.f26493b.get(Long.valueOf(j3)).longValue() >= 60000) {
                        C7878t0.f26493b.remove(Long.valueOf(j3));
                    } else if (C7878t0.f26494c.containsKey(Long.valueOf(j3))) {
                        str4 = C7878t0.f26494c.get(Long.valueOf(j3));
                    }
                }
                long j4 = (currentTimeMillis - j3) / 3600000;
                if (j4 == 0) {
                    str4 = context.getResources().getString(C0966R.string.mh8);
                } else {
                    GregorianCalendar gregorianCalendar = new GregorianCalendar();
                    u0Var = u0Var2;
                    j = j2;
                    long timeInMillis = j3 - new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5)).getTimeInMillis();
                    if (timeInMillis <= 0 || timeInMillis > 86400000) {
                        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
                        gregorianCalendar2.setTimeInMillis(j3);
                        if (gregorianCalendar.get(1) == gregorianCalendar2.get(1)) {
                            str = str4 + DateFormat.format(context.getString(C0966R.string.eyh), j3);
                            C7878t0.f26494c.put(Long.valueOf(j3), str);
                            C7878t0.f26493b.put(Long.valueOf(j3), Long.valueOf(currentTimeMillis));
                        } else {
                            str = str4 + DateFormat.format(context.getString(C0966R.string.f360810ez1), j3);
                            C7878t0.f26494c.put(Long.valueOf(j3), str);
                            C7878t0.f26493b.put(Long.valueOf(j3), Long.valueOf(currentTimeMillis));
                        }
                        str4 = str;
                        textView.setText(str4);
                        i3 = C0966R.C0970id.ip8;
                        ((TextView) oVar2.mo85812D(C0966R.C0970id.ip8)).setVisibility(0);
                        b0Var = C13598b0.f38549a;
                    } else {
                        int i15 = (int) j4;
                        str4 = context.getResources().getString(C0966R.string.f360792es0, new Object[]{Integer.valueOf(i15 < 1 ? 1 : i15)});
                        C7878t0.f26494c.put(Long.valueOf(j3), str4);
                        C7878t0.f26493b.put(Long.valueOf(j3), Long.valueOf(currentTimeMillis));
                        textView.setText(str4);
                        i3 = C0966R.C0970id.ip8;
                        ((TextView) oVar2.mo85812D(C0966R.C0970id.ip8)).setVisibility(0);
                        b0Var = C13598b0.f38549a;
                    }
                }
            }
            u0Var = u0Var2;
            j = j2;
            textView.setText(str4);
            i3 = C0966R.C0970id.ip8;
            ((TextView) oVar2.mo85812D(C0966R.C0970id.ip8)).setVisibility(0);
            b0Var = C13598b0.f38549a;
        } else {
            u0Var = u0Var2;
            j = j2;
            i3 = C0966R.C0970id.ip8;
            b0Var = null;
        }
        if (b0Var == null) {
            ((TextView) oVar2.mo85812D(i3)).setVisibility(4);
        }
        if (e612 != null) {
            ((TextView) oVar2.mo85812D(C0966R.C0970id.n3h)).setText(((C13887q1) C86312j.m106911c(C13887q1.class)).mo13340cL(j));
            ((TextView) oVar2.mo85812D(C0966R.C0970id.n3h)).setVisibility(0);
            b0Var2 = C13598b0.f38549a;
        } else {
            b0Var2 = null;
        }
        if (b0Var2 == null) {
            ((TextView) oVar2.mo85812D(C0966R.C0970id.n3h)).setVisibility(4);
        }
        C0782u0 u0Var3 = u0Var;
        if (((C61397g) C86312j.m106911c(C61397g.class)).mo83480Qg(u0Var3.f1833d.liveInfo)) {
            View D3 = oVar2.mo85812D(C0966R.C0970id.ipf);
            C87412m.m108593f(D3, "holder.getView<TextView>(R.id.replay_status_desc)");
            C7919x.m8091a((TextView) D3);
            ((TextView) oVar2.mo85812D(C0966R.C0970id.ipf)).setText(MMApplicationContext.getContext().getResources().getString(C0966R.string.e46));
            View D4 = oVar2.mo85812D(C0966R.C0970id.ipc);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(4);
            View view2 = D4;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((WeImageView) oVar2.mo85812D(C0966R.C0970id.n3j)).setVisibility(4);
            ((TextView) oVar2.mo85812D(C0966R.C0970id.ipf)).setVisibility(0);
            return;
        }
        String str5 = u0Var3.f1833d.username;
        if (!(str5 == null || str5.length() == 0) && C87412m.m108589b(u0Var3.f1833d.username, C66785b.f191882e.mo90662O5())) {
            C64273c21 c218 = u0Var3.f1833d.liveInfo;
            if (c218 != null && c218.f182366L == 5) {
                View D5 = oVar2.mo85812D(C0966R.C0970id.ipc);
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(4);
                View view3 = D5;
                C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((WeImageView) oVar2.mo85812D(C0966R.C0970id.n3j)).setVisibility(0);
                ((TextView) oVar2.mo85812D(C0966R.C0970id.ipf)).setVisibility(4);
            } else if (!u0Var3.mo726b() || e612 == null) {
                View D6 = oVar2.mo85812D(C0966R.C0970id.ipc);
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(4);
                View view4 = D6;
                C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D6.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((WeImageView) oVar2.mo85812D(C0966R.C0970id.n3j)).setVisibility(4);
                ((TextView) oVar2.mo85812D(C0966R.C0970id.ipf)).setVisibility(4);
            } else {
                View D7 = oVar2.mo85812D(C0966R.C0970id.ipc);
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(0);
                View view5 = D7;
                C117292a.m165358d(view5, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D7.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((WeImageView) oVar2.mo85812D(C0966R.C0970id.n3j)).setVisibility(4);
                ((TextView) oVar2.mo85812D(C0966R.C0970id.ipf)).setVisibility(4);
                ((UnchangeTextView) oVar2.mo85812D(C0966R.C0970id.ipd)).setText(String.valueOf(e612.f182924h));
            }
        } else if (!u0Var3.mo726b() || e612 == null) {
            ((WeImageView) oVar2.mo85812D(C0966R.C0970id.n3j)).setVisibility(4);
            ((TextView) oVar2.mo85812D(C0966R.C0970id.ipf)).setVisibility(4);
            View D8 = oVar2.mo85812D(C0966R.C0970id.ipc);
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(4);
            View view6 = D8;
            C117292a.m165358d(view6, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D8.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            ((WeImageView) oVar2.mo85812D(C0966R.C0970id.n3j)).setVisibility(4);
            ((TextView) oVar2.mo85812D(C0966R.C0970id.ipf)).setVisibility(4);
            View D9 = oVar2.mo85812D(C0966R.C0970id.ipc);
            C9556a aVar8 = new C9556a();
            aVar8.mo10233c(0);
            View view7 = D9;
            C117292a.m165358d(view7, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D9.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/convert/FinderProfileReplayLiveConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLiveReplayFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (e612.f182921e) {
                ((UnchangeTextView) oVar2.mo85812D(C0966R.C0970id.n3k)).setVisibility(0);
                ((UnchangeTextView) oVar2.mo85812D(C0966R.C0970id.ipd)).setText(String.valueOf(e612.f182924h));
                return;
            }
            ((UnchangeTextView) oVar2.mo85812D(C0966R.C0970id.n3k)).setVisibility(8);
            ((UnchangeTextView) oVar2.mo85812D(C0966R.C0970id.ipd)).setText(String.valueOf(e612.f182924h));
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        C58739j4 j4Var = C58739j4.f168176a;
        View D = oVar.mo85812D(C0966R.C0970id.ipd);
        C87412m.m108593f(D, "holder.getView<UnchangeT….id.replay_selling_price)");
        j4Var.mo83703c0((TextView) D, false);
    }
}
