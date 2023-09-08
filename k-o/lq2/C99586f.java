package lq2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import co2.C92448q;
import co2.C92449r;
import co2.C92451t;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.vfs.C86013q1;
import er2.C97692a;
import er2.C97693b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jq2.C99009x;
import kg3.C76577a;
import lo2.C99556n;
import ps2.C100891r;
import rq2.C101425k;
import rq2.C101432s;
import te3.C101804kv2;
import up2.C102064e;

/* renamed from: lq2.f */
public class C99586f extends RecyclerView.C16613e<C99587g> implements View.OnClickListener {

    /* renamed from: d */
    public RecyclerView f291924d;

    /* renamed from: e */
    public SnsInfo f291925e;

    /* renamed from: f */
    public Context f291926f;

    /* renamed from: g */
    public List<C92448q> f291927g;

    /* renamed from: h */
    public C97693b f291928h;

    /* renamed from: i */
    public C97692a f291929i;

    /* renamed from: j */
    public C102064e f291930j;

    /* renamed from: n */
    public int f291931n;

    /* renamed from: o */
    public int f291932o;

    /* renamed from: lq2.f$a */
    public class C61380a implements View.OnClickListener {
        public C61380a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/SlideFullCardRecyclerViewAdapter$ActionBtnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter$ActionBtnClickListener");
            try {
                if (view instanceof FrameLayout) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    Object tag = frameLayout.getTag();
                    if (tag instanceof Integer) {
                        int intValue = ((Integer) tag).intValue();
                        C99586f fVar = C99586f.this;
                        fVar.mo138956G4(frameLayout, fVar.f291925e, intValue);
                    }
                }
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter$ActionBtnClickListener");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/SlideFullCardRecyclerViewAdapter$ActionBtnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C99586f(RecyclerView recyclerView, SnsInfo snsInfo, C102064e eVar) {
        if (recyclerView != null) {
            this.f291924d = recyclerView;
            this.f291926f = recyclerView.getContext();
        } else {
            this.f291926f = MMApplicationContext.getContext();
        }
        this.f291930j = eVar;
        SnsMethodCalculate.markStartTimeMs("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        if (snsInfo != null) {
            try {
                if (snsInfo.getAdXml() != null) {
                    ADXml adXml = snsInfo.getAdXml();
                    C92449r rVar = adXml.adSliderFullCardInfo;
                    if (rVar != null) {
                        if (!C101425k.m133097a(rVar.f264582a)) {
                            this.f291925e = snsInfo;
                            this.f291927g = adXml.adSliderFullCardInfo.f264582a;
                            SnsMethodCalculate.markEndTimeMs("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                            return;
                        }
                    }
                    Log.m105928w("SnsAd.SlideFullCardRecyclerViewAdapter", "the adSliderFullCardInfo or resource info list is null, initialize adapter failed!!!");
                    SnsMethodCalculate.markEndTimeMs("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                    return;
                }
            } catch (Throwable unused) {
            }
        }
        Log.m105928w("SnsAd.SlideFullCardRecyclerViewAdapter", "the sns info is null, initialize adapter failed!");
        SnsMethodCalculate.markEndTimeMs("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
    }

    /* renamed from: F4 */
    public void mo138955F4(int i) {
        SnsMethodCalculate.markStartTimeMs("calcItemMaterialSize", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        if (i <= 0) {
            Log.m105920e("SnsAd.SlideFullCardRecyclerViewAdapter", "calcItemMaterialSize, adDisplayWidth <= 0");
            SnsMethodCalculate.markEndTimeMs("calcItemMaterialSize", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            return;
        }
        int b = (i - C76577a.m92151b(this.f291926f, 24)) - C76577a.m92151b(this.f291926f, 16);
        this.f291931n = b;
        double d = (((double) b) * 3.0d) / 4.0d;
        this.f291932o = (int) Math.ceil(d);
        Log.m105924i("SnsAd.SlideFullCardRecyclerViewAdapter", "calcItemMaterialSize, mItemMaterialWidth is " + this.f291931n + ", realInnerItemHeight is " + d + ", mItemMaterialHeight is " + this.f291932o);
        SnsMethodCalculate.markEndTimeMs("calcItemMaterialSize", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
    }

    /* renamed from: G4 */
    public void mo138956G4(View view, SnsInfo snsInfo, int i) {
        C92451t tVar;
        AdClickActionInfo adClickActionInfo;
        SnsMethodCalculate.markStartTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        if (snsInfo == null || snsInfo.getAdXml() == null || snsInfo.getAdXml().adSliderFullCardInfo == null) {
            SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            return;
        }
        C92449r rVar = snsInfo.getAdXml().adSliderFullCardInfo;
        List<C92448q> list = rVar.f264582a;
        if (list == null || ((ArrayList) list).size() <= 0) {
            SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            return;
        }
        C92448q qVar = (C92448q) ((ArrayList) rVar.f264582a).get(i);
        if (qVar == null || (tVar = qVar.f264579g) == null || (adClickActionInfo = tVar.f264603c) == null) {
            SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            return;
        }
        C97692a aVar = this.f291929i;
        if (aVar != null) {
            aVar.mo136947f(view, i);
        }
        this.f291930j.mo141560i(adClickActionInfo, snsInfo, rVar.mo126436a(i));
        this.f291930j.mo141556e(view);
        SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
    }

    /* renamed from: O4 */
    public C92448q mo138957O4(int i) {
        SnsMethodCalculate.markStartTimeMs("getResInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        try {
            List<C92448q> list = this.f291927g;
            if (list != null && i >= 0 && i < ((ArrayList) list).size()) {
                C92448q qVar = (C92448q) ((ArrayList) this.f291927g).get(i);
                SnsMethodCalculate.markEndTimeMs("getResInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                return qVar;
            }
        } catch (Throwable th) {
            Log.m105928w("SnsAd.SlideFullCardRecyclerViewAdapter", "the getResInfo has something wrong " + th.getMessage());
        }
        SnsMethodCalculate.markEndTimeMs("getResInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0198  */
    /* renamed from: g5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo138958g5(lq2.C99587g r20, co2.C92448q r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.String r3 = "processBottomBar"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.lang.String r5 = "SnsAd.SlideFullCardRecyclerViewAdapter"
            if (r2 != 0) goto L_0x001c
            java.lang.String r1 = "resInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return
        L_0x001c:
            co2.t r6 = r2.f264579g
            java.lang.String r7 = "processButton"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r4)
            r8 = 24
            r9 = 0
            r10 = 1
            if (r6 == 0) goto L_0x00d3
            java.lang.String r11 = r6.f264602b
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x0046
            android.widget.FrameLayout r11 = r1.f291943K
            rq2.C101432s.m133132n(r11, r10)
            android.widget.TextView r11 = r1.f291945M
            rq2.C101432s.m133132n(r11, r10)
            android.widget.TextView r11 = r1.f291945M
            java.lang.String r12 = r6.f264602b
            r11.setText(r12)
            r11 = 24
            goto L_0x0047
        L_0x0046:
            r11 = 0
        L_0x0047:
            java.lang.String r12 = r6.f264601a
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 != 0) goto L_0x00d4
            java.lang.String r12 = r6.f264601a
            java.lang.String r13 = "adId"
            java.lang.String r12 = ps2.C100891r.m132217l(r13, r12)
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r13 != 0) goto L_0x0082
            boolean r13 = com.tencent.p014mm.vfs.C86013q1.m106450k(r12)
            if (r13 == 0) goto L_0x0082
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "icon exists, url = "
            r13.append(r14)
            java.lang.String r6 = r6.f264601a
            r13.append(r6)
            java.lang.String r6 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            android.widget.ImageView r6 = r1.f291944L
            r0.mo138961w5(r6, r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
            goto L_0x00d7
        L_0x0082:
            java.lang.String r14 = r6.f264601a
            android.widget.ImageView r6 = r1.f291944L
            java.lang.String r12 = "loadImage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r4)
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r13 == 0) goto L_0x0096
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r4)
            goto L_0x00d4
        L_0x0096:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "loadImage, hash = "
            r13.append(r15)
            int r15 = r6.hashCode()
            r13.append(r15)
            java.lang.String r15 = ", btnIconUrl = "
            r13.append(r15)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r13)
            r13 = 2131313761(0x7f094461, float:1.8245928E38)
            r6.setTag(r13, r14)
            r15 = 0
            r16 = 41
            r17 = 0
            lq2.e r13 = new lq2.e
            r13.<init>(r0, r6, r14)
            java.lang.String r6 = "adId"
            r18 = r13
            r13 = r6
            ps2.C100891r.m132207b(r13, r14, r15, r16, r17, r18)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r4)
            goto L_0x00d4
        L_0x00d3:
            r11 = 0
        L_0x00d4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
        L_0x00d7:
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r0.f291925e
            com.tencent.mm.plugin.sns.storage.ADInfo r6 = r6.getAdInfo()
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r7 = r2.f264578f
            boolean r6 = r6.isWeApp(r7)
            r7 = 18
            r12 = 4
            if (r6 == 0) goto L_0x0118
            android.widget.ImageView r6 = r1.f291941I
            r13 = 2131234015(0x7f080cdf, float:1.8084184E38)
            r6.setImageResource(r13)
            android.widget.TextView r6 = r1.f291942J
            java.lang.String r13 = "小程序"
            r6.setText(r13)
            android.widget.ImageView r6 = r1.f291941I
            rq2.C101432s.m133132n(r6, r10)
            android.widget.TextView r6 = r1.f291942J
            rq2.C101432s.m133132n(r6, r10)
            android.widget.LinearLayout r6 = r1.f291940H
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r6 = (android.widget.RelativeLayout.LayoutParams) r6
            android.content.Context r13 = r0.f291926f
            int r13 = kg3.C76577a.m92151b(r13, r12)
            r6.topMargin = r13
            android.widget.LinearLayout r13 = r1.f291940H
            r13.setLayoutParams(r6)
            goto L_0x0151
        L_0x0118:
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r6 = r2.f264578f
            boolean r6 = lo2.C99542h0.m129911i(r6)
            if (r6 == 0) goto L_0x0150
            android.widget.ImageView r6 = r1.f291941I
            r13 = 2131230879(0x7f08009f, float:1.8077823E38)
            r6.setImageResource(r13)
            android.widget.TextView r6 = r1.f291942J
            java.lang.String r13 = "视频号"
            r6.setText(r13)
            android.widget.ImageView r6 = r1.f291941I
            rq2.C101432s.m133132n(r6, r10)
            android.widget.TextView r6 = r1.f291942J
            rq2.C101432s.m133132n(r6, r10)
            android.widget.LinearLayout r6 = r1.f291940H
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r6 = (android.widget.RelativeLayout.LayoutParams) r6
            android.content.Context r13 = r0.f291926f
            int r13 = kg3.C76577a.m92151b(r13, r12)
            r6.topMargin = r13
            android.widget.LinearLayout r13 = r1.f291940H
            r13.setLayoutParams(r6)
            goto L_0x0151
        L_0x0150:
            r7 = 0
        L_0x0151:
            java.lang.String r6 = r2.f264574b
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x017c
            android.widget.TextView r6 = r1.f291939G
            rq2.C101432s.m133132n(r6, r10)
            android.widget.TextView r6 = r1.f291939G
            java.lang.String r13 = r2.f264574b
            r6.setText(r13)
            android.widget.TextView r6 = r1.f291939G
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r6 = (android.widget.RelativeLayout.LayoutParams) r6
            android.content.Context r13 = r0.f291926f
            int r12 = kg3.C76577a.m92151b(r13, r12)
            r6.topMargin = r12
            android.widget.TextView r12 = r1.f291939G
            r12.setLayoutParams(r6)
            int r7 = r7 + 24
        L_0x017c:
            java.lang.String r6 = r2.f264573a
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0192
            android.widget.TextView r6 = r1.f291938F
            rq2.C101432s.m133132n(r6, r10)
            android.widget.TextView r6 = r1.f291938F
            java.lang.String r12 = r2.f264573a
            r6.setText(r12)
            int r7 = r7 + 20
        L_0x0192:
            if (r7 > 0) goto L_0x0196
            if (r11 <= 0) goto L_0x020f
        L_0x0196:
            if (r7 <= 0) goto L_0x019a
            int r7 = r7 + 2
        L_0x019a:
            int r6 = java.lang.Math.max(r7, r11)
            int r6 = r6 + r8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "itemViewHolder cardBottomBarLayout height = "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
            float r2 = r2.f264575c
            int r2 = (int) r2
            int r2 = r2 * 255
            int r2 = r2 / 100
            r5 = 2
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7[r9] = r2
            java.lang.String r2 = "000000"
            r7[r10] = r2
            java.lang.String r2 = "#%02x%s"
            java.lang.String r2 = java.lang.String.format(r2, r7)
            int r2 = android.graphics.Color.parseColor(r2)
            int[] r5 = new int[r5]
            android.content.Context r7 = r0.f291926f
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r7 = r7.getColor(r8)
            r5[r9] = r7
            r5[r10] = r2
            android.view.ViewGroup r2 = r1.f291937E
            android.graphics.drawable.Drawable r2 = r2.getBackground()
            android.graphics.drawable.GradientDrawable r2 = (android.graphics.drawable.GradientDrawable) r2
            r2.setColors(r5)
            android.view.ViewGroup r5 = r1.f291937E
            r5.setBackground(r2)
            android.view.ViewGroup r2 = r1.f291937E
            rq2.C101432s.m133132n(r2, r10)
            android.view.ViewGroup r2 = r1.f291937E
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            android.content.Context r5 = r0.f291926f
            int r5 = kg3.C76577a.m92151b(r5, r6)
            r2.height = r5
            android.view.ViewGroup r1 = r1.f291937E
            r1.setLayoutParams(r2)
        L_0x020f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lq2.C99586f.mo138958g5(lq2.g, co2.q):void");
    }

    public int getItemCount() {
        SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        List<C92448q> list = this.f291927g;
        if (list != null) {
            int size = ((ArrayList) list).size();
            SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            return size;
        }
        SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        return 0;
    }

    public long getItemId(int i) {
        SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        long j = (long) i;
        SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        return j;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        C99587g gVar = (C99587g) zVar;
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        try {
            Log.m105918d("SnsAd.SlideFullCardRecyclerViewAdapter", "onBindViewHolder:: the pos is " + i);
            C92448q O4 = mo138957O4(i);
            if (O4 != null) {
                if (gVar != null) {
                    gVar.mo138962y(i);
                    C99585d.m129998b(gVar, this.f291931n, this.f291932o);
                    mo138958g5(gVar, O4);
                    mo138960u5(gVar, O4);
                    SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                    SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                }
            }
            Log.m105928w("SnsAd.SlideFullCardRecyclerViewAdapter", "the res info or recyclerView is null!!!!");
            SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/SlideFullCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        try {
            C97693b bVar = this.f291928h;
            RecyclerView recyclerView = this.f291924d;
            if (view == null || recyclerView == null || bVar == null) {
                Log.m105928w("SnsAd.SlideFullCardRecyclerViewAdapter", "the recycler view or click listener is null!!!");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/SlideFullCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (view.getParent() != recyclerView) {
                Log.m105920e("SnsAd.SlideFullCardRecyclerViewAdapter", "are you cray?!! the parent of the clicked view is not same as the input recycler view!!");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/SlideFullCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                RecyclerView.C16631z P0 = recyclerView.mo17031P0(view);
                if (P0 == null) {
                    Log.m105920e("SnsAd.SlideFullCardRecyclerViewAdapter", "I think the statement can't be reached, why?");
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/SlideFullCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                bVar.mo136948c(recyclerView, view, P0.mo17363j());
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/SlideFullCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        } catch (Throwable unused) {
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C99587g gVar;
        SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        try {
            Log.m105918d("SnsAd.SlideFullCardRecyclerViewAdapter", "mRecyclerView width is " + viewGroup.getWidth());
            View f = C101432s.m133124f(this.f291926f, C0966R.C0971layout.c1v, viewGroup, false);
            if (f != null) {
                f.setOnClickListener(this);
                gVar = new C99587g(f, new C61380a());
                SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            } else {
                Log.m105920e("SnsAd.SlideFullCardRecyclerViewAdapter", "the inflated view is null????");
                C99587g gVar2 = new C99587g(new View(viewGroup.getContext()), new C61380a());
                SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                gVar = gVar2;
            }
        } catch (Throwable unused) {
            Log.m105920e("SnsAd.SlideFullCardRecyclerViewAdapter", "onCreateViewHolder failed????");
            gVar = new C99587g(new View(MMApplicationContext.getContext()), new C61380a());
            SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        }
        SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        return gVar;
    }

    public void onViewDetachedFromWindow(RecyclerView.C16631z zVar) {
        SnsMethodCalculate.markStartTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        C99587g gVar = (C99587g) zVar;
        SnsMethodCalculate.markStartTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        super.onViewDetachedFromWindow(gVar);
        try {
            Log.m105918d("SnsAd.SlideFullCardRecyclerViewAdapter", "the onViewDetachedFromWindow is called , position is " + gVar.mo17363j());
            C101432s.m133121c(gVar.f291936D);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        SnsMethodCalculate.markEndTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
    }

    /* renamed from: u5 */
    public void mo138960u5(C99587g gVar, C92448q qVar) {
        SnsMethodCalculate.markStartTimeMs("processCardContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        C99585d.m130001f(gVar.f291946z, qVar.f264581i);
        C99585d.m130001f(gVar.f291934B, qVar.f264580h);
        if (qVar.mo126435a()) {
            Log.m105924i("SnsAd.SlideFullCardRecyclerViewAdapter", "the resInfo is sight");
            SnsMethodCalculate.markStartTimeMs("processSight", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            C99556n.m129940c(this.f291925e, qVar.f264577e);
            C94901o Fx0 = C94866e1.Fx0();
            C101804kv2 kv22 = qVar.f264577e;
            ImageView imageView = gVar.f291935C;
            int hashCode = this.f291926f.hashCode();
            C96983o3 o3Var = C96983o3.f284140l;
            o3Var.f284145b = this.f291925e.getTimeLine().CreateTime;
            Fx0.mo131114e0(kv22, imageView, -1, hashCode, o3Var);
            C101432s.m133132n(gVar.f291936D, true);
            SnsMethodCalculate.markEndTimeMs("processSight", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        } else {
            String str = qVar.f264577e.f298694i;
            Log.m105924i("SnsAd.SlideFullCardRecyclerViewAdapter", "processCardContent, the resInfo is img, thumbUrl is " + str);
            if (!Util.isNullOrNil(str)) {
                String l = C100891r.m132217l("adId", str);
                gVar.f291935C.setTag(C0966R.C0970id.jve, str);
                if (C86013q1.m106450k(l)) {
                    C99009x.m128942c(gVar.f291935C, l, 0);
                } else {
                    C99009x.m128940a(gVar.f291935C, str, 0);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("processCardContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
    }

    /* renamed from: w5 */
    public final void mo138961w5(ImageView imageView, String str) {
        SnsMethodCalculate.markStartTimeMs("setBtnIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        Bitmap decodeFile = BitmapUtil.decodeFile(str, (BitmapFactory.Options) null);
        if (decodeFile == null) {
            Log.m105920e("SnsAd.SlideFullCardRecyclerViewAdapter", "onDownloaded, bitmap == null");
            SnsMethodCalculate.markEndTimeMs("setBtnIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            return;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(decodeFile);
        bitmapDrawable.setTint(this.f291926f.getResources().getColor(C0966R.color.BW_100_Alpha_0_9));
        imageView.setImageDrawable(bitmapDrawable);
        C101432s.m133132n(imageView, true);
        SnsMethodCalculate.markEndTimeMs("setBtnIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
    }
}
