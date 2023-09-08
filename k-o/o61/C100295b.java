package o61;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emoji.model.C93101b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import te3.C101754a80;
import te3.C52077y70;

/* renamed from: o61.b */
public final class C100295b extends RecyclerView.C16613e<C76992e> {

    /* renamed from: d */
    public final Context f293805d;

    /* renamed from: e */
    public LinkedList<C93101b> f293806e;

    /* renamed from: f */
    public final String f293807f = "MicroMsg.EmojiStoreV3BannerAdapter";

    /* renamed from: g */
    public final ArrayList<String> f293808g = new ArrayList<>();

    /* renamed from: h */
    public int f293809h = 10001;

    /* renamed from: i */
    public boolean f293810i;

    public C100295b(Context context, LinkedList<C93101b> linkedList) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(linkedList, "data");
        this.f293805d = context;
        this.f293806e = linkedList;
    }

    /* renamed from: F4 */
    public final List<C93101b> mo139550F4(List<? extends C52077y70> list, List<? extends C101754a80> list2) {
        LinkedList linkedList = new LinkedList();
        if (list != null) {
            for (C52077y70 y702 : list) {
                if ((y702 != null ? y702.f145152e : null) != null && !Util.isNullOrNil(y702.f145152e.f145740g)) {
                    linkedList.add(new C93101b(y702, (C101754a80) null, false));
                }
            }
        }
        if (list2 != null) {
            for (C101754a80 a802 : list2) {
                if ((a802 != null ? a802.f297838d : null) != null && !Util.isNullOrNil(a802.f297838d.f145740g)) {
                    linkedList.add(new C93101b((C52077y70) null, a802, true));
                }
            }
        }
        return linkedList;
    }

    /* renamed from: G4 */
    public final void mo139551G4(List<? extends C93101b> list) {
        C87412m.m108594g(list, "newData");
        int size = this.f293806e.size();
        int size2 = list.size();
        String str = this.f293807f;
        Log.m105924i(str, "setBannerData: from:" + size + ", to:" + size2);
        int min = Math.min(size, size2);
        int i = size2 - size;
        int i2 = size - size2;
        this.f293806e.clear();
        this.f293806e.addAll(list);
        if (min > 0) {
            notifyItemRangeChanged(0, min);
        }
        if (i > 0) {
            notifyItemRangeInserted(size, i);
        }
        if (i2 > 0) {
            notifyItemRangeRemoved(size2, i2);
        }
    }

    public int getItemCount() {
        return this.f293806e.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001f, code lost:
        r4 = r0.f268227a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r6, int r7) {
        /*
            r5 = this;
            o61.e r6 = (o61.C76992e) r6
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r6, r0)
            java.util.LinkedList<com.tencent.mm.plugin.emoji.model.b> r0 = r5.f293806e
            java.lang.Object r0 = r0.get(r7)
            com.tencent.mm.plugin.emoji.model.b r0 = (com.tencent.p014mm.plugin.emoji.model.C93101b) r0
            java.lang.String r1 = r5.f293807f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onBindViewHolder banner title:"
            r2.append(r3)
            r3 = 0
            if (r0 == 0) goto L_0x0026
            te3.a80 r4 = r0.f268227a
            if (r4 == 0) goto L_0x0026
            java.lang.String r4 = r4.f297839e
            goto L_0x0027
        L_0x0026:
            r4 = r3
        L_0x0027:
            r2.append(r4)
            java.lang.String r4 = ", pos: "
            r2.append(r4)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)
            if (r0 != 0) goto L_0x0043
            java.lang.String r6 = r5.f293807f
            java.lang.String r7 = "BaseEmotionBanner is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r7)
            goto L_0x00a4
        L_0x0043:
            boolean r1 = r0.f268229c
            if (r1 == 0) goto L_0x005a
            te3.a80 r1 = r0.f268227a
            te3.z70 r1 = r1.f297838d
            java.lang.String r1 = r1.f145740g
            java.lang.String r2 = "banner.bannerSet.BannerImg.StripUrl"
            gy3.C87412m.m108593f(r1, r2)
            te3.a80 r2 = r0.f268227a
            java.lang.String r2 = r2.f297840f
            com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            goto L_0x0070
        L_0x005a:
            te3.y70 r1 = r0.f268228b
            te3.z70 r1 = r1.f145152e
            java.lang.String r1 = r1.f145740g
            java.lang.String r2 = "banner.banner.BannerImg.StripUrl"
            gy3.C87412m.m108593f(r1, r2)
            te3.y70 r2 = r0.f268228b
            te3.o80 r2 = r2.f145151d
            java.lang.String r2 = r2.f298994d
            java.lang.String r4 = "banner.banner.BannerSummary.ProductID"
            gy3.C87412m.m108593f(r2, r4)
        L_0x0070:
            android.widget.TextView r2 = r6.f224987B
            te3.a80 r4 = r0.f268227a
            if (r4 == 0) goto L_0x0078
            java.lang.String r3 = r4.f297839e
        L_0x0078:
            r2.setText(r3)
            com.tencent.mm.plugin.gif.MMAnimateView r2 = r6.f224986A
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_CROP
            r2.setScaleType(r3)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x009a
            k60.a r2 = k60.C99101e.f290571b
            l60.b r1 = r2.mo85955a(r1)
            com.tencent.mm.plugin.gif.MMAnimateView r2 = r6.f224986A
            java.lang.String r3 = "holder.bannerImg"
            gy3.C87412m.m108593f(r2, r3)
            l60.a r1 = (l60.C99342a) r1
            r1.mo85954d(r2)
        L_0x009a:
            android.widget.LinearLayout r6 = r6.f224989z
            o61.a r1 = new o61.a
            r1.<init>(r5, r7, r0)
            r6.setOnClickListener(r1)
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o61.C100295b.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "group");
        View inflate = LayoutInflater.from(this.f293805d).inflate(C0966R.C0971layout.cka, viewGroup, false);
        Context context = this.f293805d;
        C87412m.m108593f(inflate, "item");
        return new C76992e(context, inflate);
    }
}
